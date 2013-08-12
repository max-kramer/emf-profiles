/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationManager;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry;
import org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryFactory;
import org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage;

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
	public EList<ProfileApplicationManager> getManagers() {
		return ECollections.unmodifiableEList(getManagersGen());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EList<ProfileApplicationManager> getManagersGen() {
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
	public ProfileApplicationManager getProfileApplicationManager(
			ResourceSet resourceSet) {
		if (profileApplicationManagers.containsKey(resourceSet))
			return profileApplicationManagers.get(resourceSet);
		ProfileApplicationManager pam = EMFProfileApplicationRegistryFactory.eINSTANCE
				.createProfileApplicationManager(resourceSet);
		profileApplicationManagers.put(resourceSet, pam);
		getManagersGen().add(pam);
		return pam;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void disposeProfileApplicationManager(
			ProfileApplicationManager profileApplicationManager) {
		profileApplicationManager.dispose();
		getManagersGen().remove(profileApplicationManager);
		profileApplicationManagers.remove(profileApplicationManager);
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