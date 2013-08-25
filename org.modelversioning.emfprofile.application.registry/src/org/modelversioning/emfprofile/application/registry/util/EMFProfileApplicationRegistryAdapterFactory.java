/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.modelversioning.emfprofile.application.registry.*;

import org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage
 * @generated
 */
public class EMFProfileApplicationRegistryAdapterFactory extends
		AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static EMFProfileApplicationRegistryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public EMFProfileApplicationRegistryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EMFProfileApplicationRegistryPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EMFProfileApplicationRegistrySwitch<Adapter> modelSwitch = new EMFProfileApplicationRegistrySwitch<Adapter>() {
		@Override
		public Adapter caseProfileApplicationWrapper(
				ProfileApplicationWrapper object) {
			return createProfileApplicationWrapperAdapter();
		}

		@Override
		public Adapter caseProfileApplicationRegistry(
				ProfileApplicationRegistry object) {
			return createProfileApplicationRegistryAdapter();
		}

		@Override
		public Adapter caseProfileApplicationManager(
				ProfileApplicationManager object) {
			return createProfileApplicationManagerAdapter();
		}

		@Override
		public Adapter caseEMFProfileApplicationDecorator(
				EMFProfileApplicationDecorator object) {
			return createEMFProfileApplicationDecoratorAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper
	 * <em>Profile Application Wrapper</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper
	 * @generated
	 */
	public Adapter createProfileApplicationWrapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry
	 * <em>Profile Application Registry</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry
	 * @generated
	 */
	public Adapter createProfileApplicationRegistryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.modelversioning.emfprofile.application.registry.ProfileApplicationManager
	 * <em>Profile Application Manager</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.modelversioning.emfprofile.application.registry.ProfileApplicationManager
	 * @generated
	 */
	public Adapter createProfileApplicationManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator
	 * <em>EMF Profile Application Decorator</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator
	 * @generated
	 */
	public Adapter createEMFProfileApplicationDecoratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // EMFProfileApplicationRegistryAdapterFactory
