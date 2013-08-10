/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.impl;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationManager;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper;
import org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationAlreadyLoadedException;
import org.modelversioning.emfprofile.application.registry.exception.TraversingEObjectContainerChainException;
import org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage;
import org.modelversioning.emfprofileapplication.ProfileApplication;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Profile Application Registry</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.modelversioning.emfprofile.application.registry.impl.ProfileApplicationRegistryImpl#getManagers
 * <em>Managers</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ProfileApplicationRegistryImpl extends
		MinimalEObjectImpl.Container implements ProfileApplicationRegistry {
	/**
	 * The cached value of the '{@link #getManagers() <em>Managers</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getManagers()
	 * @generated
	 * @ordered
	 */
	protected EList<ProfileApplicationManager> managers;

	// resource-set to profile application manager map
	private Map<ResourceSet, ProfileApplicationManager> profileApplicationManagers = new HashMap<>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ProfileApplicationRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFProfileApplicationRegistryPackage.Literals.PROFILE_APPLICATION_REGISTRY;
	}

	/**
	 * gets the list of profile application managers
	 * 
	 */
	public List<ProfileApplicationManager> getManagers() {
		return ECollections.unmodifiableEList(getManagersGen());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<ProfileApplicationManager> getManagersGen() {
		if (managers == null) {
			managers = new EObjectContainmentEList<ProfileApplicationManager>(
					ProfileApplicationManager.class,
					this,
					EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_REGISTRY__MANAGERS);
		}
		return managers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ProfileApplicationWrapper createNewProfileApplication(
			ResourceSet resourceSet, IFile profileApplicationFile,
			Collection<Profile> profiles) throws IllegalArgumentException,
			IOException, CoreException {
		assert resourceSet != null;
		assert profileApplicationFile != null;
		assert profiles != null;

		if (profiles.isEmpty()) {
			throw new IllegalArgumentException(
					"At least one profile definition must be provided in order to create a profile application.");
		}
		initializeProfileApplicationManagerIfNecessary(resourceSet);
		ProfileApplicationManager pam = profileApplicationManagers
				.get(resourceSet);
		return pam
				.createNewProfileApplication(profileApplicationFile, profiles);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ProfileApplicationWrapper loadProfileApplication(
			ResourceSet resourceSet, IFile profileApplicationFile)
			throws ProfileApplicationAlreadyLoadedException, IOException,
			CoreException {
		assert resourceSet != null;
		assert profileApplicationFile != null;
		if(profileApplicationFile.exists() == false){
			throw new IOException("The resource does not exist!\n" + profileApplicationFile.toString());
		} 
		
		
		try {
			initializeProfileApplicationManagerIfNecessary(resourceSet);
			ProfileApplicationManager pam = profileApplicationManagers
					.get(resourceSet);
			if (hasLoadedProfileApplication(pam, profileApplicationFile)) {
				throw new ProfileApplicationAlreadyLoadedException();
			} else {
				return pam.loadProfileApplication(profileApplicationFile);
			}
		} catch(NullPointerException npe) {
			npe.printStackTrace();
			throw new IOException("There was a problem with loading the resource which yielded the NPE.\nPleas take a look into the stack trace.\nIt looks that the implementation of the profile importer does not check for corrupted files, i.e., missing elements, which yield NPE.", npe);
		} catch (Exception e) {
			if(e instanceof CoreException)
				throw new CoreException(((CoreException)e).getStatus());
			else if(e instanceof ProfileApplicationAlreadyLoadedException)
				throw new ProfileApplicationAlreadyLoadedException(e.getMessage(), e);
			throw new IOException(e.getMessage(), e);
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
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void unloadProfileApplication(
			ProfileApplicationWrapper profileApplication) {
		assert profileApplication != null;

		ProfileApplicationManager pam = profileApplicationManagers
				.get(((ProfileApplicationWrapperImpl) profileApplication)
						.getProfileApplicationResource().getResourceSet());
		pam.removeProfileApplication(profileApplication);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void unloadAllProfileApplications(ResourceSet resourceSet)
			throws IllegalArgumentException {
		assert resourceSet != null;

		ProfileApplicationManager pam = profileApplicationManagers
				.get(resourceSet);
		try {
			pam.dispose();
			profileApplicationManagers.remove(resourceSet);
		} catch (NullPointerException e) {
			throw new IllegalArgumentException(
					"The registry has no profile applications for the argument: " + resourceSet);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean hasProfileApplications(ResourceSet resourceSet)
			throws IllegalArgumentException {
		if (profileApplicationManagers.containsKey(resourceSet)) {
			ProfileApplicationManager pam = profileApplicationManagers
					.get(resourceSet);
			return pam.hasProfileApplications();
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Collection<ProfileApplicationWrapper> getProfileApplications(
			ResourceSet resourceSet) throws IllegalArgumentException {
		assert resourceSet != null;
		if (hasProfileApplications(resourceSet) == false)
			return Collections.emptyList();
		ProfileApplicationManager pam = profileApplicationManagers
				.get(resourceSet);
		return pam.getProfileApplications();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ProfileApplicationWrapper getProfileApplicationWrapperOfContainedEObject(
			ResourceSet resourceSet, Object eobject)
			throws TraversingEObjectContainerChainException,
			IllegalArgumentException {
		assert resourceSet != null;
		assert eObject != null;
		if(profileApplicationManagers.containsKey(resourceSet) == false)
			throw new IllegalArgumentException("Unknown ResourceSet");
		
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
			if (paw.getProfileApplicationUnwrapped().equals(profileApplication))
				return paw;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProfileApplicationManager getProfileApplicationManager(
			ResourceSet resourceSet) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_REGISTRY__MANAGERS:
			return ((InternalEList<?>) getManagers()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_REGISTRY__MANAGERS:
			return getManagers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_REGISTRY__MANAGERS:
			getManagers().clear();
			getManagers().addAll(
					(Collection<? extends ProfileApplicationManager>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_REGISTRY__MANAGERS:
			getManagers().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_REGISTRY__MANAGERS:
			return managers != null && !managers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ProfileApplicationRegistryImpl
