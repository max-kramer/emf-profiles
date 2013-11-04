package org.modelversioning.emfprofile.application.registry.decoration

import com.google.inject.Inject
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.validation.CheckMode
import org.modelversioning.emfprofile.Profile
import org.modelversioning.emfprofile.application.registry.exception.ReadingDecorationDescriptionsException
import org.modelversioning.emfprofile.decoration.ui.internal.EMFProfileDecorationLanguageActivator

class DecorationDescriptionsReader {

	val Profile profile
	val URI decorationDescriptionsResourceURI
	val XtextResource decorationDescriptionsResource

	@Inject
	XtextResourceSet rs
	@Inject
	IResourceServiceProvider.Registry serviceProviderRegistry

	new(Profile profile) throws ReadingDecorationDescriptionsException {
		this.profile = profile
		decorationDescriptionsResourceURI = provideDecorationDescriptionsResourceURI
		decorationDescriptionsResource = loadDecorationDescriptionsResource
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
		EMFProfileDecorationLanguageActivator.getInstance().getInjector(
			"org.modelversioning.emfprofile.decoration.EMFProfileDecorationLanguage").injectMembers(this);

		rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE)
		// load profile resource into the xtext resource set
		rs.getResource(profile.eResource.URI, true)
		val decorationDescriptionsResource = rs.getResource(decorationDescriptionsResourceURI, true)
		
//		decorationDescriptionsResource.errors.forEach[err|println(err)]
//		println("resource warnings count: " + decorationDescriptionsResource.warnings.size)
//		decorationDescriptionsResource.warnings.forEach[w|println(w)]
		val xtextResource = decorationDescriptionsResource as XtextResource

		val issues = serviceProviderRegistry.getResourceServiceProvider(decorationDescriptionsResource.URI).
			resourceValidator.validate(decorationDescriptionsResource, CheckMode.ALL, null)
		if(decorationDescriptionsResource.errors.empty == false) {
			throw new ReadingDecorationDescriptionsException('''Decoration descriptions can not be used! There are syntax errors in decoration description file. Correct the problem and load the profile application again.''')
		} else if(issues.empty == false){
			throw new ReadingDecorationDescriptionsException('''Decoration descriptions can not be used! They are not sematnically valid. Correct the problem and load the profile application again.''')
		}
		xtextResource
	}
}
