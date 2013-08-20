/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
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
	EList<ProfileApplicationManager> getManagers();

	/**
	 * Singleton instance of profile application registry
	 */
	public static final ProfileApplicationRegistry INSTANCE = EMFProfileApplicationRegistryFactory.eINSTANCE
			.createProfileApplicationRegistry();

	/**
	 * <!-- begin-user-doc --> Creates and returns
	 * {@link ProfileApplicationManager profile application manager} for the
	 * {@link ResourceSet resource set}. Every subsequent call to the method for
	 * the same resource set will yield the same instance of the profile
	 * application manager. <br>
	 * <b>Note:</b> Dispose of manager by calling
	 * {@link ProfileApplicationManager#dispose()} when it is no longer needed.
	 * 
	 * @throws NullPointerException
	 *             if the parameter is <code>null</code> value. <!--
	 *             end-user-doc -->
	 * @model exceptions=
	 *        "org.modelversioning.emfprofile.application.registry.NullPointerException"
	 *        resourceSetDataType=
	 *        "org.modelversioning.emfprofile.application.registry.ResourceSet"
	 *        resourceSetRequired="true"
	 * @generated
	 */
	ProfileApplicationManager getProfileApplicationManager(
			ResourceSet resourceSet) throws NullPointerException;

} // ProfileApplicationRegistry
