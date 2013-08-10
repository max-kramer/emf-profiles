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
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationAlreadyLoadedException;
import org.modelversioning.emfprofile.application.registry.exception.TraversingEObjectContainerChainException;
import org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryFactory;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Profile Application Registry</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry#getManagers
 * <em>Managers</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage#getProfileApplicationRegistry()
 * @model
 * @generated
 */
public interface ProfileApplicationRegistry extends EObject {

	/**
	 * Returns the value of the '<em><b>Managers</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.modelversioning.emfprofile.application.registry.ProfileApplicationManager}
	 * . <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managers</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Managers</em>' containment reference list.
	 * @see org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage#getProfileApplicationRegistry_Managers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	List<ProfileApplicationManager> getManagers();

	/**
	 * Singleton instance of profile application registry
	 */
	public static final ProfileApplicationRegistry INSTANCE = EMFProfileApplicationRegistryFactory.eINSTANCE
			.createProfileApplicationRegistry();

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
	 *             if <code>profiles</code> are empty. <!-- end-user-doc -->
	 * @model required="true" exceptions=
	 *        "org.modelversioning.emfprofile.application.registry.IllegalArgumentException org.modelversioning.emfprofile.application.registry.IOException org.modelversioning.emfprofile.application.registry.CoreException"
	 *        resourceSetDataType=
	 *        "org.modelversioning.emfprofile.application.registry.ResourceSet"
	 *        profileApplicationFileDataType
	 *        ="org.modelversioning.emfprofile.application.registry.IFile"
	 *        profileApplicationFileRequired="true" profilesDataType=
	 *        "org.modelversioning.emfprofile.application.registry.Collection<org.modelversioning.emfprofile.Profile>"
	 *        profilesRequired="true"
	 * @generated
	 */
	ProfileApplicationWrapper createNewProfileApplication(
			ResourceSet resourceSet, IFile profileApplicationFile,
			Collection<Profile> profiles) throws IllegalArgumentException,
			IOException, CoreException;

	/**
	 * <!-- begin-user-doc --> Loads an existing profile application into the
	 * {@link ResourceSet} from the {@link IFile profileApplicationFile}.
	 * 
	 * @param resourceSet
	 *            is an instance of the {@link ResourceSet} where the model that
	 *            will be annotated is also loaded.
	 * @param profileApplicationFile
	 *            the {@link IFile file} that points to the resource in the
	 *            local file system where the profile application data is
	 *            stored.
	 * @return an instance of {@link ProfileApplicationWrapper}.
	 * @throws ProfileApplicationAlreadyLoadedException
	 *             if the profile application resource was already loaded for
	 *             the provided {@link ResourceSet resource set}.
	 * @throws IOException
	 *             This exception is thrown in following cases: <br />
	 *             if the resource could not be found at designated location
	 *             specified by the URI, <br />
	 *             or there was a problem in resolving references to other
	 *             resources in the profile application resource, <br />
	 *             or the resource does not contain any profile application.
	 * @throws CoreException
	 *             <!-- end-user-doc -->
	 * @model exceptions=
	 *        "org.modelversioning.emfprofile.application.registry.ProfileApplicationAlreadyLoadedException org.modelversioning.emfprofile.application.registry.IOException org.modelversioning.emfprofile.application.registry.CoreException"
	 *        resourceSetDataType=
	 *        "org.modelversioning.emfprofile.application.registry.ResourceSet"
	 *        resourceSetRequired="true" profileApplicationFileDataType=
	 *        "org.modelversioning.emfprofile.application.registry.IFile"
	 * @generated
	 */
	ProfileApplicationWrapper loadProfileApplication(ResourceSet resourceSet,
			IFile profileApplicationFile)
			throws ProfileApplicationAlreadyLoadedException, IOException,
			CoreException;

	/**
	 * <!-- begin-user-doc --> Unloads and removes the
	 * {@link ProfileApplicationWrapper profile application} from the registry.
	 * <!-- end-user-doc -->
	 * 
	 * @model profileApplicationRequired="true"
	 * @generated
	 */
	void unloadProfileApplication(ProfileApplicationWrapper profileApplication);

	/**
	 * <!-- begin-user-doc --> Unloads and removes all profile applications from
	 * the registry that were loaded into the {@link ResourceSet resourceSet}.
	 * 
	 * @param resourceSet
	 *            is an instance of the {@link ResourceSet} where the model that
	 *            will be annotated is also loaded.
	 * @throws IllegalArgumentException
	 *             if provided <code>resourceSet</code> is unknown. <!--
	 *             end-user-doc -->
	 * @model exceptions=
	 *        "org.modelversioning.emfprofile.application.registry.IllegalArgumentException"
	 *        resourceSetDataType=
	 *        "org.modelversioning.emfprofile.application.registry.ResourceSet"
	 *        resourceSetRequired="true"
	 * @generated
	 */
	void unloadAllProfileApplications(ResourceSet resourceSet)
			throws IllegalArgumentException;

	/**
	 * <!-- begin-user-doc --> Checks if there are any profile applications
	 * loaded in the registry for the given {@link ResourceSet resourceSet}.
	 * 
	 * @param resourceSet
	 *            is an instance of the {@link ResourceSet} where the model that
	 *            will be annotated is also loaded.
	 * @return <code>true</code> if any found, <code>false</code> otherwise.
	 * @throws IllegalArgumentException
	 *             if provided <code>resourceSet</code> is unknown. <!--
	 *             end-user-doc -->
	 * @model required="true" exceptions=
	 *        "org.modelversioning.emfprofile.application.registry.IllegalArgumentException"
	 *        resourceSetDataType=
	 *        "org.modelversioning.emfprofile.application.registry.ResourceSet"
	 * @generated
	 */
	boolean hasProfileApplications(ResourceSet resourceSet)
			throws IllegalArgumentException;

	/**
	 * <!-- begin-user-doc --> Returns {@link ProfileApplicationWrapper profile
	 * applications} loaded in the registry for the provided {@link ResourceSet
	 * resourceSet}.
	 * 
	 * @param resourceSet
	 *            is an instance of the {@link ResourceSet} where the model that
	 *            will be annotated is also loaded.
	 * 
	 * @return a collection of profile applications or an empty collection if
	 *         none were found.
	 * @throws IllegalArgumentException
	 *             if provided <code>resourceSet</code> is unknown. <!--
	 *             end-user-doc -->
	 * @model dataType=
	 *        "org.modelversioning.emfprofile.application.registry.Collection<org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper>"
	 *        required="true" exceptions=
	 *        "org.modelversioning.emfprofile.application.registry.IllegalArgumentException"
	 *        resourceSetDataType=
	 *        "org.modelversioning.emfprofile.application.registry.ResourceSet"
	 *        resourceSetRequired="true"
	 * @generated
	 */
	Collection<ProfileApplicationWrapper> getProfileApplications(
			ResourceSet resourceSet) throws IllegalArgumentException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model exceptions=
	 *        "org.modelversioning.emfprofile.application.registry.TraversingEObjectContainerChainException org.modelversioning.emfprofile.application.registry.IllegalArgumentException"
	 *        resourceSetDataType=
	 *        "org.modelversioning.emfprofile.application.registry.ResourceSet"
	 *        resourceSetRequired="true" eobjectRequired="true"
	 * @generated
	 */
	ProfileApplicationWrapper getProfileApplicationWrapperOfContainedEObject(
			ResourceSet resourceSet, Object eobject)
			throws TraversingEObjectContainerChainException,
			IllegalArgumentException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model resourceSetDataType=
	 *        "org.modelversioning.emfprofile.application.registry.ResourceSet"
	 *        resourceSetRequired="true"
	 * @generated
	 */
	ProfileApplicationManager getProfileApplicationManager(
			ResourceSet resourceSet);
} // ProfileApplicationRegistry
