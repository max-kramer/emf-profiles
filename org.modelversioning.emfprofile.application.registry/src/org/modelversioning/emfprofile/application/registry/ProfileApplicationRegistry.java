/**
 * Copyright (c) 2012 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationRegistryImpl;
import org.modelversioning.emfprofileapplication.ProfileApplication;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 * 
 */
public interface ProfileApplicationRegistry {

	/**
	 * Singleton instance of profile application registry
	 */
	public static final ProfileApplicationRegistry INSTANCE = ProfileApplicationRegistryImpl.INSTANCE;

	/**
	 * Creates new {@link ProfileApplication} which is loaded into the provided
	 * {@code ResourceSet}.
	 * 
	 * @param resourceSet
	 *            is an instance of the {@link ResourceSet} where the model that
	 *            will be annotated is also loaded.
	 * @param profileApplicationFile
	 *            is a file resource in the local file system where the profile
	 *            application data is stored.
	 * @param profiles
	 *            a collection of {@link Profile Profile Definitions} that can
	 *            be applied to models in {@link ResourceSet} by this profile
	 *            application.
	 * @return an instance of {@link ProfileApplicationWrapper}.
	 * @throws IOException
	 * @throws CoreException
	 */
	ProfileApplicationWrapper createNewProfileApplication(
			ResourceSet resourceSet, IFile profileApplicationFile,
			Collection<Profile> profiles) throws CoreException, IOException;

	/**
	 * Loads an existing profile application into the {@link ResourceSet} from
	 * the {@link IFile profileApplicationFile}.
	 * 
	 * @param resourceSet
	 *            is an instance of the {@link ResourceSet} where the model that
	 *            will be annotated is also loaded.
	 * @param profileApplicationFile
	 *            is a file resource in the local file system where the profile
	 *            application data is stored.
	 * @return an instance of {@link ProfileApplicationWrapper}.
	 * @throws CoreException
	 * @throws IOException
	 * @throws ProfileApplicationAlreadyLoadedException
	 *             if the profile application file resource was already loaded.
	 */
	ProfileApplicationWrapper loadProfileApplication(ResourceSet resourceSet,
			IFile profileApplicationFile) throws CoreException, IOException,
			ProfileApplicationAlreadyLoadedException;

	/**
	 * Unloads and removes the {@link ProfileApplicationWrapper profile
	 * application} from the registry.
	 * 
	 * @param profileApplication
	 */
	void unloadProfileApplication(ProfileApplicationWrapper profileApplication);

	/**
	 * Unloads and removes all profile applications from the registry that were
	 * loaded into the {@link ResourceSet resourceSet}.
	 * 
	 * @param resourceSet
	 *            is an instance of the {@link ResourceSet} where the model that
	 *            will be annotated is also loaded.
	 */
	void unloadAllProfileApplications(ResourceSet resourceSet);

	/**
	 * Checks if there are any profile applications loaded in the registry for
	 * the given {@link ResourceSet resourceSet}.
	 * 
	 * @param resourceSet
	 *            is an instance of the {@link ResourceSet} where the model that
	 *            will be annotated is also loaded.
	 * @return <code>true</code> if any found, <code>false</code> otherwise.
	 */
	boolean hasProfileApplications(ResourceSet resourceSet);

	/**
	 * Returns {@link ProfileApplicationWrapper profile applications} loaded in
	 * the registry for the provided {@link ResourceSet resourceSet}.
	 * 
	 * @param resourceSet
	 *            is an instance of the {@link ResourceSet} where the model that
	 *            will be annotated is also loaded.
	 * 
	 * @return a collection of profile applications found or empty collection.
	 */
	Collection<ProfileApplicationWrapper> getProfileApplications(
			ResourceSet resourceSet);

	/**
	 * Gets the instance of the {@link ProfileApplicationWrapper} that stands
	 * for the {@link ProfileApplication} which is the parent of the provided
	 * {@link EObject}. The search for a profile application will be done
	 * amongst loaded profile applications for the given {@link ResourceSet
	 * resourceSet}.
	 * 
	 * @param resourceSet
	 *            is an instance of the {@link ResourceSet} where the model that
	 *            will be annotated is also loaded.
	 * @param eObject
	 *            in question.
	 * 
	 * @return {@link ProfileApplicationWrapper} if everything OK,
	 *         <code>null</code> if could not find it.
	 * @throws TraversingEObjectContainerChainException
	 *             in case if any of the parents was <code>null</code>, which
	 *             would indicate that the eObject was removed together with its
	 *             parent.
	 */
	ProfileApplicationWrapper getProfileApplicationWrapperOfContainedEObject(
			ResourceSet resourceSet, EObject eObject)
			throws TraversingEObjectContainerChainException;

	/**
	 * An exception that signals that a specific {@link IFile profile
	 * application file} is already loaded.
	 * 
	 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
	 * 
	 */
	class ProfileApplicationAlreadyLoadedException extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = -6650443602783227939L;

	}

	/**
	 * An exception that signals that at some point of traversal a container
	 * {@link EObject} was <code>null</code> and that in that case the link to
	 * desired parent was broken. <br />
	 * The last container/parent {@link EObject} that was found by traversing
	 * the parent chain can be retrieved by calling the
	 * {@link #getLastParentFound()} method.
	 * 
	 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
	 * 
	 */
	class TraversingEObjectContainerChainException extends Exception {
		private static final long serialVersionUID = 4744210451615438874L;

		private EObject parent;

		public TraversingEObjectContainerChainException(EObject parent) {
			super(
					"Could not traverse to desired parent. The last reachable was: "
							+ parent.toString());
			this.parent = parent;
		}

		/**
		 * @return the last container/parent {@link EObject} that was found by
		 *         traversing the parent chain.
		 */
		public EObject getLastParentFound() {
			return this.parent;
		}
	}

}
