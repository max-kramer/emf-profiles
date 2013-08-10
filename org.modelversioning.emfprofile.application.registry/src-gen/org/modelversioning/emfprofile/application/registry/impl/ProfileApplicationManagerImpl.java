/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.impl;

import java.util.Collection;

import java.util.List;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.modelversioning.emfprofile.application.registry.ProfileApplicationManager;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper;

import org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage;

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

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ProfileApplicationManagerImpl() {
		super();
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
	 * @generated
	 */
	public List<ProfileApplicationWrapper> getProfileApplications() {
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
