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
import org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationManager;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper;
import org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationAlreadyLoadedException;
import org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationDecoratorNotFoundException;
import org.modelversioning.emfprofile.application.registry.exception.TraversingEObjectContainerChainException;
import org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryFactory;
import org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage;
import org.modelversioning.emfprofileapplication.ProfileApplication;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Profile Application Manager</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.modelversioning.emfprofile.application.registry.impl.ProfileApplicationManagerImpl#getProfileApplications
 * <em>Profile Applications</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ProfileApplicationManagerImpl extends MinimalEObjectImpl.Container
		implements ProfileApplicationManager {
	/**
	 * The cached value of the '{@link #getProfileApplications()
	 * <em>Profile Applications</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProfileApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<ProfileApplicationWrapper> profileApplications;
	private ResourceSet resourceSet;
	private boolean disposing;

	private EMFProfileApplicationDecorator profileApplicationDecorator = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ProfileApplicationManagerImpl() {
		super();
	}

	public ProfileApplicationManagerImpl(ResourceSet resourceSet) {
		this();
		this.resourceSet = resourceSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFProfileApplicationRegistryPackage.Literals.PROFILE_APPLICATION_MANAGER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<ProfileApplicationWrapper> getProfileApplications() {
		return ECollections.unmodifiableEList(getProfileApplicationsGen());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ProfileApplicationWrapper> getProfileApplicationsGen() {
		if (profileApplications == null) {
			profileApplications = new EObjectContainmentEList<ProfileApplicationWrapper>(
					ProfileApplicationWrapper.class,
					this,
					EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_MANAGER__PROFILE_APPLICATIONS);
		}
		return profileApplications;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ProfileApplicationWrapper getProfileApplicationWrapperOfContainedEObject(
			EObject eObject) throws TraversingEObjectContainerChainException {
		assert eObject != null;

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

		for (ProfileApplicationWrapper paw : getProfileApplications()) {
			if (paw.getProfileApplication().equals(profileApplication))
				return paw;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EMFProfileApplicationDecorator bindProfileApplicationDecorator(
			String editorId) throws NullPointerException,
			ProfileApplicationDecoratorNotFoundException {
		if (editorId == null)
			throw new NullPointerException(
					"null value for editor id is not allowed.");

		// check if already bound.
		if (profileApplicationDecorator != null)
			return profileApplicationDecorator;
		ProfileApplicationRegistryImpl registryImpl = (ProfileApplicationRegistryImpl) this
				.eContainer();
		profileApplicationDecorator = registryImpl
				.getProfileApplicationDecoratorForEditorId(editorId);
		// setting decorator into every wrapper that the manager holds
		for (ProfileApplicationWrapper wrapper : getProfileApplications()) {
			ProfileApplicationWrapperImpl wrapperImpl = (ProfileApplicationWrapperImpl) wrapper;
			wrapperImpl.setDecorator(getProfileApplicationDecorator());
		}
		
		return profileApplicationDecorator;
	}

	/**
	 */
	public EMFProfileApplicationDecorator getProfileApplicationDecorator()
			throws ProfileApplicationDecoratorNotFoundException {
		if (profileApplicationDecorator == null)
			throw new ProfileApplicationDecoratorNotFoundException(
					"No decorator found to be bound with this manager.");
		return profileApplicationDecorator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ProfileApplicationWrapper createNewProfileApplication(
			IFile profileApplicationFile, Collection<Profile> profiles)
			throws IllegalArgumentException, IOException, CoreException {
		assert resourceSet != null;
		assert profileApplicationFile != null;
		assert profiles != null;

		if (profiles.isEmpty()) {
			throw new IllegalArgumentException(
					"At least one profile definition must be provided in order to create a profile application.");
		}
		ProfileApplicationWrapper paw = EMFProfileApplicationRegistryFactory.eINSTANCE
				.createProfileApplicationWrapper(resourceSet,
						profileApplicationFile, profiles);
		if(profileApplicationDecorator != null){
			((ProfileApplicationWrapperImpl)paw).setDecorator(profileApplicationDecorator);
		}
		getProfileApplicationsGen().add(paw);
		return paw;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean hasProfileApplications() {
		return !getProfileApplicationsGen().isEmpty();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ProfileApplicationWrapper loadProfileApplication(
			IFile profileApplicationFile)
			throws ProfileApplicationAlreadyLoadedException, IOException,
			CoreException {
		assert resourceSet != null;
		assert profileApplicationFile != null;
		if (profileApplicationFile.exists() == false) {
			throw new IOException("The resource does not exist!\n"
					+ profileApplicationFile.toString());
		}

		try {
			if (hasLoadedProfileApplication(profileApplicationFile)) {
				throw new ProfileApplicationAlreadyLoadedException();
			} else {
				ProfileApplicationWrapper paw = EMFProfileApplicationRegistryFactory.eINSTANCE
						.createProfileApplicationWrapper(resourceSet,
								profileApplicationFile);
				getProfileApplicationsGen().add(paw);
				if(profileApplicationDecorator != null){
					((ProfileApplicationWrapperImpl)paw).setDecorator(profileApplicationDecorator);
				}
				return paw;
			}
		} catch (NullPointerException npe) {
			npe.printStackTrace();
			throw new IOException(
					"There was a problem with loading the resource which yielded the NPE.\nPleas take a look into the stack trace.\nIt looks that the implementation of the profile importer does not check for corrupted files, i.e., missing elements, which yield NPE.",
					npe);
		} catch (Exception e) {
			if (e instanceof CoreException)
				throw new CoreException(((CoreException) e).getStatus());
			else if (e instanceof ProfileApplicationAlreadyLoadedException)
				throw new ProfileApplicationAlreadyLoadedException(
						e.getMessage(), e);
			throw new IOException(e.getMessage(), e);
		}
	}

	private boolean hasLoadedProfileApplication(IFile profileApplicationFile) {
		for (ProfileApplicationWrapper element : getProfileApplications()) {

			if (hasLoadedProfileApplicationFile(element, profileApplicationFile))
				return true;
		}
		return false;
	}

	private boolean hasLoadedProfileApplicationFile(
			ProfileApplicationWrapper profileApplication,
			IFile profileApplicationFile) {
		return profileApplicationFile
				.getLocation()
				.toString()
				.equals(profileApplication.getProfileApplicationIFile()
						.getLocation().toString());
	}

	public void removeProfileApplication(
			ProfileApplicationWrapper profileApplication) {
		assert profileApplication != null;
		if (disposing == false)
			getProfileApplicationsGen().remove(profileApplication);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void dispose() {
		disposing = true;
		// unload all managed profile applications
		for (ProfileApplicationWrapper paw : getProfileApplicationsGen()) {
			paw.unload();
		}
		profileApplications.clear();
		ProfileApplicationRegistryImpl registry = (ProfileApplicationRegistryImpl) this
				.eContainer();
		if (registry != null) // if it is null that means that it was already
								// removed from the container
			registry.removeProfileApplicationManager(this);
		disposing = false;
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
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_MANAGER__PROFILE_APPLICATIONS:
			return ((InternalEList<?>) getProfileApplications()).basicRemove(
					otherEnd, msgs);
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
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_MANAGER__PROFILE_APPLICATIONS:
			return getProfileApplications();
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
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_MANAGER__PROFILE_APPLICATIONS:
			getProfileApplications().clear();
			getProfileApplications().addAll(
					(Collection<? extends ProfileApplicationWrapper>) newValue);
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
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_MANAGER__PROFILE_APPLICATIONS:
			getProfileApplications().clear();
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
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_MANAGER__PROFILE_APPLICATIONS:
			return profileApplications != null
					&& !profileApplications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ProfileApplicationManagerImpl
