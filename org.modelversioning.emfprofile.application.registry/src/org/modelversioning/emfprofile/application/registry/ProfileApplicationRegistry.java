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
import org.eclipse.emf.common.util.URI;
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
	 * @param profileApplicationURI
	 *            the {@link URI} that points to the resource in the local file
	 *            system where the profile application data is stored.
	 * @param profiles
	 *            a collection of {@link Profile Profile Definitions} that can
	 *            be applied to models in {@link ResourceSet} by this profile
	 *            application.
	 * @return an instance of {@link ProfileApplicationWrapper}.
	 * @throws CoreException
	 * @throws IOException
	 * @throws IllegalArgumentException
	 *             if <code>profiles</code> are empty.
	 */
	ProfileApplicationWrapper createNewProfileApplication(
			ResourceSet resourceSet, URI profileApplicationURI,
			Collection<Profile> profiles) throws CoreException, IOException,
			IllegalArgumentException;

	/**
	 * Loads an existing profile application into the {@link ResourceSet} from
	 * the {@link IFile profileApplicationFile}.
	 * 
	 * @param resourceSet
	 *            is an instance of the {@link ResourceSet} where the model that
	 *            will be annotated is also loaded.
	 * @param profileApplicationURI
	 *            the {@link URI} that points to the resource in the local file
	 *            system where the profile application data is stored.
	 * @return an instance of {@link ProfileApplicationWrapper}.
	 * @throws CoreException
	 * @throws IOException
	 *             This exception is thrown in following cases: <br />
	 *             if the resource could not be found at designated location
	 *             specified by the URI, <br />
	 *             or there was a problem in resolving references to other
	 *             resources in the profile application resource, <br />
	 *             or the resource does not contain any profile application.
	 * @throws ProfileApplicationAlreadyLoadedException
	 *             if the profile application resource was already loaded for
	 *             the provided {@link ResourceSet resource set}.
	 */
	ProfileApplicationWrapper loadProfileApplication(ResourceSet resourceSet,
			URI profileApplicationURI) throws CoreException, IOException,
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
	 * @throws IllegalArgumentException
	 *             if provided <code>resourceSet</code> is unknown.
	 */
	void unloadAllProfileApplications(ResourceSet resourceSet)
			throws IllegalArgumentException;

	/**
	 * Checks if there are any profile applications loaded in the registry for
	 * the given {@link ResourceSet resourceSet}.
	 * 
	 * @param resourceSet
	 *            is an instance of the {@link ResourceSet} where the model that
	 *            will be annotated is also loaded.
	 * @return <code>true</code> if any found, <code>false</code> otherwise.
	 * @throws IllegalArgumentException
	 *             if provided <code>resourceSet</code> is unknown.
	 */
	boolean hasProfileApplications(ResourceSet resourceSet)
			throws IllegalArgumentException;

	/**
	 * Returns {@link ProfileApplicationWrapper profile applications} loaded in
	 * the registry for the provided {@link ResourceSet resourceSet}.
	 * 
	 * @param resourceSet
	 *            is an instance of the {@link ResourceSet} where the model that
	 *            will be annotated is also loaded.
	 * 
	 * @return a collection of profile applications or an empty collection if
	 *         none were found.
	 * @throws IllegalArgumentException
	 *             if provided <code>resourceSet</code> is unknown.
	 */
	Collection<ProfileApplicationWrapper> getProfileApplications(
			ResourceSet resourceSet) throws IllegalArgumentException;

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
	 *         <code>null</code> if no matching profile application wrapper not
	 *         found.
	 * @throws TraversingEObjectContainerChainException
	 *             in case if any of the parents was <code>null</code>, which
	 *             would indicate that the eObject was removed together with its
	 *             parent.
	 * @throws IllegalArgumentException
	 *             if provided <code>resourceSet</code> is unknown.
	 */
	ProfileApplicationWrapper getProfileApplicationWrapperOfContainedEObject(
			ResourceSet resourceSet, EObject eObject)
			throws TraversingEObjectContainerChainException,
			IllegalArgumentException;

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

		public ProfileApplicationAlreadyLoadedException() {
			super();
		}

		public ProfileApplicationAlreadyLoadedException(String message,
				Throwable cause, boolean enableSuppression,
				boolean writableStackTrace) {
			super(message, cause, enableSuppression, writableStackTrace);
		}

		public ProfileApplicationAlreadyLoadedException(String message,
				Throwable cause) {
			super(message, cause);
		}

		public ProfileApplicationAlreadyLoadedException(String message) {
			super(message);
		}

		public ProfileApplicationAlreadyLoadedException(Throwable cause) {
			super(cause);
		}

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

		public TraversingEObjectContainerChainException() {
			super();
		}

		public TraversingEObjectContainerChainException(String message,
				Throwable cause, boolean enableSuppression,
				boolean writableStackTrace) {
			super(message, cause, enableSuppression, writableStackTrace);
		}

		public TraversingEObjectContainerChainException(String message,
				Throwable cause) {
			super(message, cause);
		}

		public TraversingEObjectContainerChainException(String message) {
			super(message);
		}

		public TraversingEObjectContainerChainException(Throwable cause) {
			super(cause);
		}

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
