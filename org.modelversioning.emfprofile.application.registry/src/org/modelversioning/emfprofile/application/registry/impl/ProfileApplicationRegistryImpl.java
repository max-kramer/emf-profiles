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
import org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationManager;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry;
import org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationDecoratorNotFoundException;
import org.modelversioning.emfprofile.application.registry.exception.ReadingDecorationDescriptionsException;
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
	private EMFProfileApplicationDecoratorHandler decoratorsHandler = new EMFProfileApplicationDecoratorHandler();

	private boolean cleaning;

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
			ResourceSet resourceSet) throws NullPointerException {
		if (resourceSet == null)
			throw new NullPointerException(
					"null value is not allowed as parameter.");
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
	 * @throws ReadingDecorationDescriptionsException 
	 * 
	 * @generated NOT
	 */
	public ProfileApplicationManager getProfileApplicationManager(
			ResourceSet resourceSet, String editorId)
			throws NullPointerException,
			ProfileApplicationDecoratorNotFoundException, ReadingDecorationDescriptionsException {
		if (resourceSet == null)
			throw new NullPointerException(
					"null value for resource set is not allowed.");

		ProfileApplicationManager manager;
		if (profileApplicationManagers.containsKey(resourceSet)) {
			manager = profileApplicationManagers.get(resourceSet);
			try{
				((ProfileApplicationManagerImpl)manager).getProfileApplicationDecorator();
			} catch (ProfileApplicationDecoratorNotFoundException e) {
				manager.bindProfileApplicationDecorator(editorId);
			}
			
			return manager;
		} else {
			if (editorId == null)
				throw new NullPointerException(
						"null value for editor id is not allowed.");
			if (hasProfileApplicationDecoratorForEditorId(editorId) == false)
				throw new ProfileApplicationDecoratorNotFoundException(
						"Could not find profile application decorator for editor id: "
								+ editorId);
		}
		manager = getProfileApplicationManager(resourceSet);
		manager.bindProfileApplicationDecorator(editorId);
		return manager;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EMFProfileApplicationDecorator getProfileApplicationDecoratorForEditorId(
			String editorId) throws NullPointerException,
			ProfileApplicationDecoratorNotFoundException {
		if (editorId == null)
			throw new NullPointerException("editor id can not be null value.");
		if (hasProfileApplicationDecoratorForEditorId(editorId) == false)
			throw new ProfileApplicationDecoratorNotFoundException(
					"Could not find profile application decorator for editor id: "
							+ editorId);
		return decoratorsHandler.getDecoratorForEditorId(editorId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean hasProfileApplicationManager(ResourceSet resourceSet)
			throws NullPointerException {
		if (resourceSet == null)
			throw new NullPointerException(
					"resource set can not be null value.");
		return profileApplicationManagers.containsKey(resourceSet);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean hasProfileApplicationDecoratorForEditorId(String editorId) {
		return decoratorsHandler.hasDecoratorForPartId(editorId);
	}

	public void removeProfileApplicationManager(
			ProfileApplicationManager profileApplicationManager) {
		if (cleaning)
			return;
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

	/**
	 * Will call every known manger to dispose itself and afterward will clear
	 * the collection of managers
	 */
	public void cleanUp() {
		cleaning = true;
		for (ProfileApplicationManager manager : managers) {
			manager.dispose();
		}
		this.managers.clear();
		cleaning = false;
	}

} // ProfileApplicationRegistryImpl
