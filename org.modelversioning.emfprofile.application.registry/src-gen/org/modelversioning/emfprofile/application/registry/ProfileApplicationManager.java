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
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationAlreadyLoadedException;
import org.modelversioning.emfprofile.application.registry.exception.TraversingEObjectContainerChainException;

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
	 * . <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Applications</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Profile Applications</em>' containment
	 *         reference list.
	 * @see org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage#getProfileApplicationManager_ProfileApplications()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProfileApplicationWrapper> getProfileApplications();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
			throws IllegalArgumentException, IOException, CoreException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model required="true"
	 * @generated
	 */
	boolean hasProfileApplications();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model profileApplicationRequired="true"
	 * @generated
	 */
	void unloadProfileApplication(ProfileApplicationWrapper profileApplication)
			throws IllegalArgumentException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void dispose();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model exceptions=
	 *        "org.modelversioning.emfprofile.application.registry.TraversingEObjectContainerChainException"
	 *        eObjectRequired="true"
	 * @generated
	 */
	ProfileApplicationWrapper getProfileApplicationWrapperOfContainedEObject(
			EObject eObject) throws TraversingEObjectContainerChainException;

} // ProfileApplicationManager
