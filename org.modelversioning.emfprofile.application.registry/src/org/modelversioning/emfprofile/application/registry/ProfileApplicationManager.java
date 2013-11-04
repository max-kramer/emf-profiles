/**
 * Copyright (c) 2010 - 2013 modelversioning.org
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationAlreadyLoadedException;
import org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationDecoratorNotFoundException;
import org.modelversioning.emfprofile.application.registry.exception.ReadingDecorationDescriptionsException;
import org.modelversioning.emfprofile.application.registry.exception.TraversingEObjectContainerChainException;
import org.modelversioning.emfprofileapplication.ProfileApplication;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Profile Application Manager</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.modelversioning.emfprofile.application.registry.ProfileApplicationManager#getProfileApplications
 * <em>Profile Applications</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage#getProfileApplicationManager()
 * @model
 * @generated
 */
public interface ProfileApplicationManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Profile Applications</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper}
	 * . <!-- begin-user-doc --> Returns {@link ProfileApplicationWrapper
	 * profile applications} loaded by this manager. <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Profile Applications</em>' containment
	 *         reference list.
	 * @see org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage#getProfileApplicationManager_ProfileApplications()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProfileApplicationWrapper> getProfileApplications();

	/**
	 * <!-- begin-user-doc --> Creates new {@link ProfileApplicationWrapper}
	 * which is loaded into the provided {@code ResourceSet}.
	 * 
	 * @param resourceSet
	 *            is an instance of the {@link ResourceSet} where the model that
	 *            will be annotated is also loaded.
	 * @param profileApplicationFile
	 *            the {@link IFile file} that points to the resource in the
	 *            local file system where the profile application data is
	 *            stored.
	 * @param profiles
	 *            a collection of {@link Profile Profile Definitions} that can
	 *            be applied to models in {@link ResourceSet} by this profile
	 *            application.
	 * @return an instance of {@link ProfileApplicationWrapper}.
	 * @throws CoreException
	 * @throws IOException
	 * @throws IllegalArgumentException
	 *             if <code>profiles</code> are empty.
	 * @throws ReadingDecorationDescriptionsException
	 *             will be thrown if there is no decoration descriptions
	 *             resource found in the profile project or the syntax has
	 *             errors or there are semantical violations in. These are
	 *             visible when the decoration descriptions resource is opened
	 *             in editor.<!-- end-user-doc -->
	 * @model required="true" exceptions=
	 *        "org.modelversioning.emfprofile.application.registry.IllegalArgumentException org.modelversioning.emfprofile.application.registry.IOException org.modelversioning.emfprofile.application.registry.CoreException"
	 *        profileApplicationFileDataType
	 *        ="org.modelversioning.emfprofile.application.registry.IFile"
	 *        profileApplicationFileRequired="true" profilesDataType=
	 *        "org.modelversioning.emfprofile.application.registry.Collection<org.modelversioning.emfprofile.Profile>"
	 *        profilesRequired="true"
	 * @generated
	 */
	ProfileApplicationWrapper createNewProfileApplication(
			IFile profileApplicationFile, Collection<Profile> profiles)
			throws IllegalArgumentException, IOException, CoreException,
			ReadingDecorationDescriptionsException;

	/**
	 * <!-- begin-user-doc --> Checks if there are any profile applications
	 * loaded by this manager.
	 * 
	 * @return <code>true</code> if any found, <code>false</code> otherwise.
	 *         <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean hasProfileApplications();

	/**
	 * <!-- begin-user-doc --> Loads an existing profile application into the
	 * {@link ResourceSet} held by this manager from the {@link IFile
	 * profileApplicationFile}.
	 * 
	 * @param profileApplicationFile
	 *            the {@link IFile file} that points to the resource in the
	 *            local file system where the profile application data is
	 *            stored.
	 * @return an instance of {@link ProfileApplicationWrapper}.
	 * @throws CoreException
	 * @throws IOException
	 *             This exception is thrown in following cases: <br />
	 *             if the resource could not be found at designated location
	 *             specified by the file, <br />
	 *             or there was a problem in resolving references to other
	 *             resources in the profile application resource, <br />
	 *             or the resource does not contain any profile application.
	 * @throws ProfileApplicationAlreadyLoadedException
	 *             if the profile application resource was already loaded for
	 *             the provided {@link ResourceSet resource set}. <!--
	 *             end-user-doc -->
	 * @model exceptions=
	 *        "org.modelversioning.emfprofile.application.registry.ProfileApplicationAlreadyLoadedException org.modelversioning.emfprofile.application.registry.IOException org.modelversioning.emfprofile.application.registry.CoreException"
	 *        profileApplicationFileDataType
	 *        ="org.modelversioning.emfprofile.application.registry.IFile"
	 * @generated
	 */
	ProfileApplicationWrapper loadProfileApplication(
			IFile profileApplicationFile)
			throws ProfileApplicationAlreadyLoadedException, IOException,
			CoreException;

	/**
	 * <!-- begin-user-doc --> Unloads and removes all
	 * {@link ProfileApplicationWrapper profile applications} held by this
	 * manager.<!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void dispose();

	/**
	 * <!-- begin-user-doc --> Gets the instance of the
	 * {@link ProfileApplicationWrapper} that stands for the
	 * {@link ProfileApplication} which is the parent of the provided
	 * {@link EObject}. The search for a profile application will be done
	 * amongst loaded profile applications inside this profile application
	 * manager.
	 * 
	 * @param eObject
	 *            in question.
	 * 
	 * @return {@link ProfileApplicationWrapper} if everything OK,
	 *         <code>null</code> if no matching profile application wrapper was
	 *         found.
	 * @throws TraversingEObjectContainerChainException
	 *             in case if any of the parents was <code>null</code>, which
	 *             would indicate that the eObject was removed together with its
	 *             parent.
	 * 
	 * @model exceptions=
	 *        "org.modelversioning.emfprofile.application.registry.TraversingEObjectContainerChainException"
	 *        eObjectRequired="true"
	 * @generated
	 */
	ProfileApplicationWrapper getProfileApplicationWrapperOfContainedEObject(
			EObject eObject) throws TraversingEObjectContainerChainException;

	/**
	 * <!-- begin-user-doc --> Binds {@link EMFProfileApplicationDecorator
	 * profile application decorator} to this manager for a specific editor id.
	 * 
	 * @param editorId
	 *            editor identification
	 * @throws NullPointerException
	 *             if editorId is <code>null</code> value.
	 * @throws ProfileApplicationDecoratorNotFoundException
	 *             if there is no registered plug-in extension that implements a
	 *             decorator for the editorId.
	 * @throws ReadingDecorationDescriptionsException
	 *             will be thrown if there is no decoration descriptions
	 *             resource found in the profile project or the syntax has
	 *             errors or there are semantical violations in. These are
	 *             visible when the decoration descriptions resource is opened
	 *             in editor. <!-- end-user-doc -->
	 * @model exceptions=
	 *        "org.modelversioning.emfprofile.application.registry.NullPointerException org.modelversioning.emfprofile.application.registry.ProfileApplicationDecoratorNotFoundException"
	 * @generated
	 */
	EMFProfileApplicationDecorator bindProfileApplicationDecorator(
			String editorId) throws NullPointerException,
			ProfileApplicationDecoratorNotFoundException,
			ReadingDecorationDescriptionsException;

} // ProfileApplicationManager
