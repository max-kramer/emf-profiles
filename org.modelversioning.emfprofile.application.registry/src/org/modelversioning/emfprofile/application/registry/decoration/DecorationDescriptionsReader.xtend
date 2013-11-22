/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
 package org.modelversioning.emfprofile.application.registry.decoration

import com.google.common.collect.Lists
import com.google.inject.Inject
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.validation.CheckMode
import org.modelversioning.emfprofile.Profile
import org.modelversioning.emfprofile.Stereotype
import org.modelversioning.emfprofile.application.registry.exception.ReadingDecorationDescriptionsException
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationModel
import org.modelversioning.emfprofile.decoration.ui.internal.EMFProfileDecorationLanguageActivator

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 */
class DecorationDescriptionsReader {

	val Profile profile
	val URI decorationDescriptionsResourceURI
	val XtextResource decorationDescriptionsResource
	
	var shouldExecuteDependencyInjection = true

	@Inject
	XtextResourceSet rs
	@Inject
	IResourceServiceProvider.Registry serviceProviderRegistry
	
	var DecorationDescriptionsChangeListener changesListener
	var DecorationLanguageResourceChangeListener resourceChangeListener

	new(Profile profile) throws ReadingDecorationDescriptionsException {
		this.profile = profile
		decorationDescriptionsResourceURI = provideDecorationDescriptionsResourceURI
		decorationDescriptionsResource = loadDecorationDescriptionsResource
		resourceChangeListener = new DecorationLanguageResourceChangeListener(this)
	}

	private def URI provideDecorationDescriptionsResourceURI() {
		val profileIFile = resourceEMFtoIFile(profile.eResource)
		val profileIProject = profileIFile.project
		val decorationIFiles = profileIProject.members.filter [ r |
			switch r {
				IFile case r.name.endsWith(".decoration"): {
					return true;
				}
				default:
					return false
			}
		]
		if (decorationIFiles.empty)
			throw new ReadingDecorationDescriptionsException(
				"Did not find any decoration description resource in the profile project. Stereotypes can be applied to the elements, but no visual decoration will be added to the graphical representation.")
		else if (decorationIFiles.size > 1)
			throw new ReadingDecorationDescriptionsException(
				'''Found more then one decoration description resource in the profile project. Only one resource should be present.''')

		val descriptionsURI = URI.createPlatformResourceURI(decorationIFiles.head.fullPath.toString, true)
		println("descriptions resource uri: " + descriptionsURI.toString)
		return descriptionsURI
	}

	private def resourceEMFtoIFile(Resource resource) {
		val uri = resource.getResourceSet().getURIConverter().normalize(resource.URI);
		val scheme = uri.scheme();
		if ("platform".equals(scheme) && uri.segmentCount() > 1 && "resource".equals(uri.segment(0))) {
			val platformResourcePath = new StringBuffer();
			var j = 1
			val size = uri.segmentCount
			while (j < size) {
				platformResourcePath.append('/');
				platformResourcePath.append(uri.segment(j));
				j = j + 1
			}
			return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformResourcePath.toString()));
		}
	}

	private def loadDecorationDescriptionsResource() throws ReadingDecorationDescriptionsException {
		if(shouldExecuteDependencyInjection){
			EMFProfileDecorationLanguageActivator.getInstance().getInjector(
				"org.modelversioning.emfprofile.decoration.EMFProfileDecorationLanguage").injectMembers(this);
			shouldExecuteDependencyInjection = false	
		}

		rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE)
		// load profile resource into the xtext resource set
		rs.getResource(profile.eResource.URI, true)
		val decorationDescriptionsResource = rs.getResource(decorationDescriptionsResourceURI, true)
		
//		decorationDescriptionsResource.errors.forEach[err|println(err)]
//		println("resource warnings count: " + decorationDescriptionsResource.warnings.size)
//		decorationDescriptionsResource.warnings.forEach[w|println(w)]
		val xtextResource = decorationDescriptionsResource as XtextResource

		performResourceValidation(xtextResource)
		xtextResource
	}
	
	private def performResourceValidation(XtextResource decorationDescriptionsResource) {
		val issues = serviceProviderRegistry.getResourceServiceProvider(decorationDescriptionsResource.URI).
			resourceValidator.validate(decorationDescriptionsResource, CheckMode.ALL, null)
		if(decorationDescriptionsResource.errors.empty == false) {
			throw new ReadingDecorationDescriptionsException('''Decoration descriptions can not be used! There are syntax errors in decoration description file. Correct the problem and load the profile application again.''')
		} else if(issues.empty == false){
			throw new ReadingDecorationDescriptionsException('''Decoration descriptions can not be used! They are not sematnically valid. Correct the problem and load the profile application again.''')
		}
	}
	
	def getDecorationDescription(Stereotype stereotype) {
		val model = decorationDescriptionsResource.contents.head as DecorationModel
		
		val decorationDescription = model.decorationDescriptions.findFirst[it.stereotype.name == stereotype.name]
		
		val stereotypeSuperTypes = stereotype.ESuperTypes.filter[s | 
			switch s {
				Stereotype: true
				default: false
			}
		]
//		println('''stereotype «stereotype.name» super types: ''') stereotypeSuperTypes.forEach[s|println("\t" + s)]
		
		val allDecorationDescriptions = Lists.newArrayList
		
		if(decorationDescription != null) allDecorationDescriptions.add(decorationDescription)
		stereotypeSuperTypes.forEach[sst | 
			val dd = model.decorationDescriptions.findFirst[it.stereotype.name == sst.name]
			if (dd != null) allDecorationDescriptions.add(dd)
		]
//		println('''Found decoration descriptions: ''')
//		allDecorationDescriptions.forEach[dd | println("\t" + dd)]
		
		if(allDecorationDescriptions.empty) return null
		
		val temp = allDecorationDescriptions.head
		allDecorationDescriptions.remove(temp)
		val resultDecorationDescription = EcoreUtil2.copy(temp)
		// checking if the decoration description has activation.
		// if not then we have to look if there are any other decoration descriptions of the stereotype super types
		// with the activation to be used.
		if(resultDecorationDescription.activation == null) {
			val activation = allDecorationDescriptions.findFirst[it.activation != null]?.activation
			if(activation != null)
				resultDecorationDescription.setActivation(EcoreUtil2.copy(activation))
		}		
		// also we need to collect decorations of the super types to be included in the set of the decorations.
		// the resulting set should be in reversed order: steretype's decorations last, super type's decorations first
		// so, when they are rendered the more specialized decorations are rendered last.
		val resultDecorations = Lists.newArrayList
		allDecorationDescriptions.forEach[resultDecorations.addAll(it.decorations)]
		resultDecorationDescription.decorations.addAll(EcoreUtil2.copyAll(resultDecorations))
		
		return resultDecorationDescription
	}
	
	def addDecorationDescriptionsChangeListener(DecorationDescriptionsChangeListener listener) {
		println("Adding changes listener: " + listener)
		this.changesListener = listener
	}
	
	def IFile getDecorationDescriptionsIFile(){
		resourceEMFtoIFile(this.decorationDescriptionsResource)
	}
	
	def void reloadResource(){
		decorationDescriptionsResource.unload
		decorationDescriptionsResource.load(null)
		try{
			performResourceValidation(decorationDescriptionsResource)	
			changesListener.decorationDescriptionsChanged
		}catch(ReadingDecorationDescriptionsException e){
			changesListener.decorationDescriptionsChangedButHaveValidationProblems
		}
	}
	
	def void resourceRemoved() {
		// this will also bring the decoration notification dispatcher to stop reacting on change events form semantic model 
		changesListener.decorationDescriptionsChangedButHaveValidationProblems
	}
	
	/**
	 * Unloads all resources from the resource set.
	 */
	def dispose() {
		resourceChangeListener?.dispose
		rs.resources.forEach[r | r.unload]
		rs.resources.clear
		
	}
	
}
