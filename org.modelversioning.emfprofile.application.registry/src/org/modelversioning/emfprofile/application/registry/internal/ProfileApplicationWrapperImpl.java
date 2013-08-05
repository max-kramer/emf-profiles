/**
 * Copyright (c) 2012 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.internal;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.modelversioning.emfprofile.IProfileFacade;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper;
import org.modelversioning.emfprofile.impl.ProfileFacadeImpl;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.modelversioning.emfprofileapplication.StereotypeApplicability;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 * 
 */
public class ProfileApplicationWrapperImpl implements
		ProfileApplicationWrapper {

	private final ResourceSet resourceSet;
	private final IProfileFacade facade;
	private final URI profileApplicationURI;
	private final Collection<Profile> profiles;

	/**
	 * Creates new profiles application which will be saved into file. At the
	 * current state of implementation there will be only one profiles
	 * application file pro applied profiles.
	 * 
	 * @param profileApplicationURI
	 * @param profiles
	 * @param resourceSet
	 * @throws CoreException
	 * @throws IOException
	 */
	public ProfileApplicationWrapperImpl(URI profileApplicationURI,
			Collection<Profile> profiles, ResourceSet resourceSet)
			throws CoreException, IOException {
		this.profileApplicationURI = profileApplicationURI;
		this.resourceSet = resourceSet;
		this.facade = createAndInitializeProfileFacade(profileApplicationURI,
				profiles);
		this.profiles = facade.getLoadedProfiles();
	}

	/**
	 * Loads a profiles application from file.
	 * 
	 * @param profileApplicationURI
	 * @param resourceSet
	 * @throws CoreException
	 * @throws IOException
	 */
	public ProfileApplicationWrapperImpl(URI profileApplicationURI,
			ResourceSet resourceSet) throws CoreException, IOException {
		this.profileApplicationURI = profileApplicationURI;
		this.resourceSet = resourceSet;
		this.facade = loadProfileApplication(profileApplicationURI);
		if (facade.getProfileApplications().isEmpty()){
			throw new IOException("The resource at "
					+ profileApplicationURI.toString()
					+ ", does not contain any profile applications.");
		}
		this.profiles = facade.getLoadedProfiles();
	}

	@Override
	public boolean isDirty() {
		return facade.getProfileApplicationResource().isModified();
	}

	public URI getProfileApplicationURI() {
		return profileApplicationURI;
	}
	
	public Resource getProfileApplicationResource(){
		return this.facade.getProfileApplicationResource();
	}

	/**
	 * Creates new profiles application
	 * 
	 * @param profileApplicationFile
	 * @param profiles
	 * @return
	 * @throws CoreException
	 * @throws IOException
	 */
	private IProfileFacade createAndInitializeProfileFacade(
			URI profileApplicationFile, Collection<Profile> profiles)
			throws CoreException, IOException {
		IProfileFacade facade = createNewProfileFacade(profileApplicationFile);
		facade.loadProfiles(profiles);
		facade.save();	
		return facade;
	}

	/**
	 * Loads an existing profiles application.
	 * 
	 * @param workbenchPart
	 *            to use.
	 * @param profileApplicationFile
	 *            to load.
	 */
	/**
	 * Loads an existing profiles application.
	 * 
	 * @param profileApplicationURI
	 *            to load.
	 * @return
	 * @throws CoreException
	 * @throws IOException
	 */
	private IProfileFacade loadProfileApplication(URI profileApplicationURI)
			throws CoreException, IOException {
		IProfileFacade facade = createNewProfileFacade(profileApplicationURI);
		return facade;
	}

	/**
	 * Creates new instance of {@link IProfileFacade}
	 * 
	 * @param profileApplicationURI
	 * @return
	 * @throws IOException
	 */
	private IProfileFacade createNewProfileFacade(URI profileApplicationURI)
			throws IOException {
		IProfileFacade facade = new ProfileFacadeImpl();
		facade.loadProfileApplication(profileApplicationURI, resourceSet);
		return facade;
	}

	@Override
	public String getName() {
		String result = "";
		Collection<Profile> profiles = facade.getLoadedProfiles();
		Iterator<Profile> iter = profiles.iterator();
		while (iter.hasNext()) {
			result += iter.next().getName();
			if (iter.hasNext())
				result += ", ";
		}
		return result
				+ " - "
				+ profileApplicationURI.toPlatformString(true);
//						.getLocation()
//						.makeRelativeTo(
//								ResourcesPlugin.getWorkspace().getRoot()
//										.getLocation()).toString();
	}

	@Override
	public String getProfileName() {
		return profiles.iterator().next().getName();
	}

	public void unload() {
		facade.unload();
	}

	@Override
	public void save() throws IOException, CoreException {
		facade.save();
	}

	@Override
	public Collection<? extends StereotypeApplicability> getApplicableStereotypes(
			EObject eObject) {
		return facade.getApplicableStereotypes(eObject);
	}

	@Override
	public StereotypeApplication applyStereotype(
			StereotypeApplicability stereotypeApplicability, EObject eObject) {
		return facade.apply(stereotypeApplicability, eObject);
	}

	@Override
	public void addNestedEObject(EObject container, EReference eReference,
			EObject eObject) {
		facade.addNestedEObject(container, eReference, eObject);
	}

	@Override
	public void removeEObject(EObject eObject) {
		facade.removeEObject(eObject);
	}

	@Override
	public List<StereotypeApplication> getStereotypeApplications() {
		return facade.getStereotypeApplications();
	}

	@Override
	public List<StereotypeApplication> getStereotypeApplications(EObject eObject) {
		return facade.getAppliedStereotypes(eObject);
	}

	@Override
	public ProfileApplication getProfileApplicationUnwrapped() {
		return facade.getProfileApplications().get(0);
	}

}
