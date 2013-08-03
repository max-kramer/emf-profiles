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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper;
import org.modelversioning.emfprofileapplication.ProfileApplication;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 * 
 */
public class ProfileApplicationRegistryImpl implements
		ProfileApplicationRegistry {

	public static final ProfileApplicationRegistry INSTANCE = new ProfileApplicationRegistryImpl();

	// hides default constructor
	private ProfileApplicationRegistryImpl() {
	}

	// resource-set to profile application manager map
	private Map<ResourceSet, ProfileApplicationManager> profileApplicationManagers = new HashMap<>();

	@Override
	public ProfileApplicationWrapper createNewProfileApplication(
			ResourceSet resourceSet, IFile profileApplicationFile,
			Collection<Profile> profiles) throws CoreException, IOException {
		if (resourceSet == null)
			throw new NullPointerException("The resource-set can not be null.");
		if (profileApplicationFile == null)
			throw new NullPointerException(
					"The file where profile application data is going to be stored can not be null.");
		if (profiles == null) {
			throw new NullPointerException("The profiles can not be null.");
		} else if (profiles.isEmpty()) {
			throw new IllegalArgumentException(
					"At least one profile definition must be provided in order to create a profile application.");
		}
		initializeProfileApplicationManagerIfNecessary(resourceSet);
		ProfileApplicationManager pam = profileApplicationManagers
				.get(resourceSet);
		return pam
				.createNewProfileApplication(profileApplicationFile, profiles);
	}

	@Override
	public ProfileApplicationWrapper loadProfileApplication(
			ResourceSet resourceSet, IFile profileApplicationFile)
			throws CoreException, IOException,
			ProfileApplicationAlreadyLoadedException {
		if (resourceSet == null)
			throw new NullPointerException("The resource-set must not be null.");
		if (profileApplicationFile == null)
			throw new IllegalArgumentException(
					"The file where profile application data is stored must be provided.");

		initializeProfileApplicationManagerIfNecessary(resourceSet);
		ProfileApplicationManager pam = profileApplicationManagers
				.get(resourceSet);
		if (hasLoadedProfileApplication(pam, profileApplicationFile)) {
			throw new ProfileApplicationAlreadyLoadedException();
		} else {
			return pam.loadProfileApplication(profileApplicationFile);
		}
	}

	private boolean hasLoadedProfileApplication(ProfileApplicationManager pam,
			IFile profileApplicationFile) {
		for (ProfileApplicationWrapper element : pam.getProfileApplications()) {
			ProfileApplicationWrapperImpl elementImpl = (ProfileApplicationWrapperImpl) element;
			if (hasLoadedProfileApplicationFile(elementImpl,
					profileApplicationFile))
				return true;
		}
		return false;
	}

	private boolean hasLoadedProfileApplicationFile(
			ProfileApplicationWrapperImpl profileApplication,
			IFile profileApplicationFile) {
		return profileApplicationFile
				.getLocation()
				.toString()
				.equals(profileApplication.getProfileApplicationFile()
						.getLocation().toString());
	}

	private void initializeProfileApplicationManagerIfNecessary(
			ResourceSet resourceSet) {
		if (!profileApplicationManagers.containsKey(resourceSet)) {
			ProfileApplicationManager pam = new ProfileApplicationManager(
					resourceSet);
			profileApplicationManagers.put(resourceSet, pam);
		}
	}

	@Override
	public void unloadProfileApplication(
			ProfileApplicationWrapper profileApplication) {
		if (profileApplication == null)
			throw new NullPointerException(
					"Can not unload a profile application which is not existent!");
		ProfileApplicationManager pam = profileApplicationManagers
				.get(((ProfileApplicationWrapperImpl) profileApplication)
						.getProfileApplicationResource().getResourceSet());
		pam.removeProfileApplication(profileApplication);

	}

	@Override
	public void unloadAllProfileApplications(ResourceSet resourceSet) {
		ProfileApplicationManager pam = profileApplicationManagers
				.get(resourceSet);
		pam.dispose();
		profileApplicationManagers.remove(resourceSet);
	}

	@Override
	public boolean hasProfileApplications(ResourceSet resourceSet) {
		if (profileApplicationManagers.containsKey(resourceSet)) {
			ProfileApplicationManager pam = profileApplicationManagers
					.get(resourceSet);
			return pam.hasProfileApplications();
		}

		return false;
	}

	@Override
	public Collection<ProfileApplicationWrapper> getProfileApplications(
			ResourceSet resourceSet) {
		assert resourceSet != null;
		if (hasProfileApplications(resourceSet) == false)
			return Collections.emptyList();
		ProfileApplicationManager pam = profileApplicationManagers
				.get(resourceSet);
		return pam.getProfileApplications();
	}

	@Override
	public ProfileApplicationWrapper getProfileApplicationWrapperOfContainedEObject(
			ResourceSet resourceSet, EObject eObject)
			throws TraversingEObjectContainerChainException {
		ProfileApplication profileApplication = null;
		if (eObject instanceof ProfileApplication) {
			profileApplication = (ProfileApplication) eObject;
		} else {
			EObject parent = eObject.eContainer();
			while (parent != null) {
				if (parent instanceof ProfileApplication) {
					profileApplication = (ProfileApplication) parent;
					break;
				}

				if (parent.eContainer() == null) {
					// this means that the parent was maybe removed, and that
					// this eObject is removed also.
					throw new TraversingEObjectContainerChainException(parent);
				}
				parent = parent.eContainer();
			}
		}
		ProfileApplicationManager pam = profileApplicationManagers
				.get(resourceSet);
		for (ProfileApplicationWrapper paw : pam.getProfileApplications()) {
			if (paw.getProfileApplications().contains(profileApplication))
				return paw;
		}
		return null;
	}

}
