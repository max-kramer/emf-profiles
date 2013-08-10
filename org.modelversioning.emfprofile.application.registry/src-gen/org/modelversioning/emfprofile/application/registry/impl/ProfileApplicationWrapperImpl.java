/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper;

import org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage;

import org.modelversioning.emfprofileapplication.ProfileApplication;

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

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ProfileApplicationWrapperImpl() {
		super();
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
	 * @generated
	 */
	public void setProfileApplication(ProfileApplication newProfileApplication) {
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
