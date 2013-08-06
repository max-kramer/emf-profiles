/**
 * Copyright (c) 2012 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 * 
 */
public class ProfileApplicationManager {

	private ResourceSet resourceSet;
	private Collection<ProfileApplicationWrapper> profileApplications = new ArrayList<>();

	public ProfileApplicationManager(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}

	public Collection<ProfileApplicationWrapper> getProfileApplications() {
		return profileApplications;
	}

	public boolean hasProfileApplications() {
		return !profileApplications.isEmpty();
	}

	public ProfileApplicationWrapper createNewProfileApplication(URI profileApplicationURI,
			Collection<Profile> profiles) throws CoreException, IOException {
		ProfileApplicationWrapper pad = new ProfileApplicationWrapperImpl(
				profileApplicationURI, profiles, resourceSet);
		profileApplications.add(pad);
		return pad;
	}

	public ProfileApplicationWrapper loadProfileApplication(
			URI profileApplicationURI) throws CoreException, IOException {
		ProfileApplicationWrapper profileApplication = new ProfileApplicationWrapperImpl(
				profileApplicationURI, resourceSet);
		profileApplications.add(profileApplication);
		return profileApplication;
	}

	public void removeProfileApplication(
			ProfileApplicationWrapper profileApplication) {
		ProfileApplicationWrapperImpl profileApplicationImpl = (ProfileApplicationWrapperImpl) profileApplication;
		profileApplicationImpl.unload();
		profileApplications.remove(profileApplication);

	}

	public void dispose() {
		for (ProfileApplicationWrapper profileApplication : profileApplications) {
			((ProfileApplicationWrapperImpl) profileApplication).unload();
		}
		profileApplications.clear();
	}

}
