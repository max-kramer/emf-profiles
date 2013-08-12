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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.Stereotype;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationManager;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper;
import org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.modelversioning.emfprofileapplication.StereotypeApplicability;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Profile Application Wrapper</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.modelversioning.emfprofile.application.registry.impl.ProfileApplicationWrapperImpl#getProfileApplication
 * <em>Profile Application</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ProfileApplicationWrapperImpl extends MinimalEObjectImpl.Container
		implements ProfileApplicationWrapper {
	/**
	 * The cached value of the '{@link #getProfileApplication()
	 * <em>Profile Application</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getProfileApplication()
	 * @generated
	 * @ordered
	 */
	protected ProfileApplication profileApplication;
	private ResourceSet resourceSet;
	private IFile profileApplicationFile;
	private Collection<Profile> profiles;
	private boolean unloaded;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ProfileApplicationWrapperImpl() {
		super();
	}

	/**
	 * constructor which creates new profile application
	 * 
	 * @param resourceSet
	 * @param profileApplicationFile
	 * @param profiles
	 */
	protected ProfileApplicationWrapperImpl(ResourceSet resourceSet,
			IFile profileApplicationFile, Collection<Profile> profiles) {
		this.resourceSet = resourceSet;
		this.profileApplicationFile = profileApplicationFile;
		this.profiles = profiles;
	}

	/**
	 * constructor which loads existing profile application
	 * 
	 * @param resourceSet
	 * @param profileApplicationFile
	 */
	protected ProfileApplicationWrapperImpl(ResourceSet resourceSet,
			IFile profileApplicationFile) {
		this.resourceSet = resourceSet;
		this.profileApplicationFile = profileApplicationFile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFProfileApplicationRegistryPackage.Literals.PROFILE_APPLICATION_WRAPPER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProfileApplication getProfileApplication() {
		if (profileApplication != null && profileApplication.eIsProxy()) {
			InternalEObject oldProfileApplication = (InternalEObject) profileApplication;
			profileApplication = (ProfileApplication) eResolveProxy(oldProfileApplication);
			if (profileApplication != oldProfileApplication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_WRAPPER__PROFILE_APPLICATION,
							oldProfileApplication, profileApplication));
			}
		}
		return profileApplication;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProfileApplication basicGetProfileApplication() {
		return profileApplication;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setProfileApplication(ProfileApplication newProfileApplication) {
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Called by the construction of the wrapper.
	 * 
	 */
	private void setProfileApplicationInternal(
			ProfileApplication newProfileApplication) {
		ProfileApplication oldProfileApplication = profileApplication;
		profileApplication = newProfileApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_WRAPPER__PROFILE_APPLICATION,
					oldProfileApplication, profileApplication));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<StereotypeApplication> getStereotypeApplications() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<StereotypeApplication> getStereotypeApplications(
			EObject eObject) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<StereotypeApplication> getStereotypeApplications(
			EObject eObject, Stereotype stereotype) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<EObject> getAnnotatedObjects() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EObject addNestedEObject(EObject container, EReference reference,
			EObject eObject) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StereotypeApplication applyStereotype(
			StereotypeApplicability stereotypeApplicability, EObject eObject) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<StereotypeApplicability> getApplicableStereotypes(
			EObject eObject) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getProfileName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isDirty() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EObject removeEObject(EObject eObject) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void save() throws IOException, CoreException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IFile getProfileApplicationIFile() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Resource getProfileApplicationResource() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void unload() {
		if (unloaded)
			return;
		unloaded = true;
		// first remove the reference from profile application manager
		ProfileApplicationManager pam = (ProfileApplicationManager) this.eContainer;
		pam.unloadProfileApplication(this);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_WRAPPER__PROFILE_APPLICATION:
			if (resolve)
				return getProfileApplication();
			return basicGetProfileApplication();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_WRAPPER__PROFILE_APPLICATION:
			setProfileApplication((ProfileApplication) newValue);
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
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_WRAPPER__PROFILE_APPLICATION:
			setProfileApplication((ProfileApplication) null);
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
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_WRAPPER__PROFILE_APPLICATION:
			return profileApplication != null;
		}
		return super.eIsSet(featureID);
	}

} // ProfileApplicationWrapperImpl
