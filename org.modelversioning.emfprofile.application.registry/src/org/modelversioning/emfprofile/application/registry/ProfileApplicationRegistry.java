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
import org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationDecoratorNotFoundException;
import org.modelversioning.emfprofile.application.registry.exception.ReadingDecorationDescriptionsException;
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

	/**
	 * <!-- begin-user-doc --> Creates and returns
	 * {@link ProfileApplicationManager profile application manager} for the
	 * {@link ResourceSet resource set}. Every subsequent call to the method for
	 * the same resource set will yield the same instance of the profile
	 * application manager. This method will try to bind a
	 * {@link EMFProfileApplicationDecorator profile application decorator} to
	 * this manager. If there is none found for the provided <b>
	 * <em>editorId</em></b> the exception will be thrown. If a decorator is
	 * already bound to this manager than no new attempt to bind a decorator
	 * again will be taken, instead the manager is returned as it is.<br>
	 * <b>Note:</b> Dispose of manager by calling
	 * {@link ProfileApplicationManager#dispose()} when it is no longer needed.
	 * 
	 * @throws NullPointerException
	 *             if any parameter is <code>null</code> value.
	 * @throws ProfileApplicationDecoratorNotFoundException
	 *             if there is no registered plug-in extension that implements a
	 *             decorator for the <b><em>editorId</em></b>.
	 * @throws ReadingDecorationDescriptionsException
	 *             will be thrown if there is no decoration descriptions
	 *             resource found in the profile project or the syntax has
	 *             errors or there are semantical violations. These are visible
	 *             when the decoration descriptions resource is opened in
	 *             editor.<!-- end-user-doc -->
	 * @model exceptions=
	 *        "org.modelversioning.emfprofile.application.registry.NullPointerException org.modelversioning.emfprofile.application.registry.ProfileApplicationDecoratorNotFoundException org.modelversioning.emfprofile.application.registry.ReadingDecorationDescriptionsException"
	 *        resourceSetDataType=
	 *        "org.modelversioning.emfprofile.application.registry.ResourceSet"
	 *        resourceSetRequired="true"
	 * @generated
	 */
	ProfileApplicationManager getProfileApplicationManager(
			ResourceSet resourceSet, String editorId)
			throws NullPointerException,
			ProfileApplicationDecoratorNotFoundException,
			ReadingDecorationDescriptionsException;

	/**
	 * <!-- begin-user-doc --> Returns <code>true</code> if there is a profile
	 * application decorator plug-in implementation for the <b>
	 * <em>editorId</em></b>. <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	boolean hasProfileApplicationDecoratorForEditorId(String editorId);

	/**
	 * <!-- begin-user-doc -->Will return {@link EMFProfileApplicationDecorator
	 * profile application decorator} for the given editor id if there is one
	 * existing. To check if there is one existing see
	 * {@link #hasProfileApplicationDecoratorForEditorId(String)}.
	 * 
	 * @throws NullPointerException
	 *             if the editor id is <code>null</code> value.
	 * @throws ProfileApplicationDecoratorNotFoundException
	 *             if no {@link EMFProfileApplicationDecorator profile
	 *             application decorator} could be found for the editor id. <!--
	 *             end-user-doc -->
	 * @model exceptions=
	 *        "org.modelversioning.emfprofile.application.registry.NullPointerException org.modelversioning.emfprofile.application.registry.ProfileApplicationDecoratorNotFoundException"
	 * @generated
	 */
	EMFProfileApplicationDecorator getProfileApplicationDecoratorForEditorId(
			String editorId) throws NullPointerException,
			ProfileApplicationDecoratorNotFoundException;

	/**
	 * <!-- begin-user-doc --> Returns <code>true</code> if there is
	 * {@link ProfileApplicationManager profile application manager} managed by
	 * the registry for the provided <b>
	 * <em> {@link ResourceSet resourceSet}</em></b>
	 * 
	 * @throws NullPointerException
	 *             if the {@link ResourceSet resource set} is <code>null</code>
	 *             value. <!-- end-user-doc -->
	 * @model exceptions=
	 *        "org.modelversioning.emfprofile.application.registry.NullPointerException"
	 *        resourceSetDataType=
	 *        "org.modelversioning.emfprofile.application.registry.ResourceSet"
	 * @generated
	 */
	boolean hasProfileApplicationManager(ResourceSet resourceSet)
			throws NullPointerException;

} // ProfileApplicationRegistry
