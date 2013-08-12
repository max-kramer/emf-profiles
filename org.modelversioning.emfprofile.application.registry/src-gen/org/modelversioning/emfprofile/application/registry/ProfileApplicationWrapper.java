/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.modelversioning.emfprofile.Stereotype;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.modelversioning.emfprofileapplication.StereotypeApplicability;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Profile Application Wrapper</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper#getProfileApplication
 * <em>Profile Application</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage#getProfileApplicationWrapper()
 * @model
 * @generated
 */
public interface ProfileApplicationWrapper extends EObject {
	/**
	 * Returns the value of the '<em><b>Profile Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Application</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Profile Application</em>' reference.
	 * @see #setProfileApplication(ProfileApplication)
	 * @see org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage#getProfileApplicationWrapper_ProfileApplication()
	 * @model required="true"
	 * @generated
	 */
	ProfileApplication getProfileApplication();

	/**
	 * Sets the value of the '
	 * {@link org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper#getProfileApplication
	 * <em>Profile Application</em>}' reference. <!-- begin-user-doc --> This
	 * method was generated and it is not intended to be used for manually
	 * setting the {@link ProfileApplication} reference. This is done by the
	 * construction of the wrapper. Calling this method will always throw
	 * {@link UnsupportedOperationException}; <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Profile Application</em>' reference.
	 * @see #getProfileApplication()
	 * @generated
	 */
	void setProfileApplication(ProfileApplication value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" many="false"
	 * @generated
	 */
	EList<StereotypeApplication> getStereotypeApplications();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model many="false"
	 * @generated
	 */
	EList<StereotypeApplication> getStereotypeApplications(EObject eObject);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model many="false"
	 * @generated
	 */
	EList<StereotypeApplication> getStereotypeApplications(EObject eObject,
			Stereotype stereotype);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" many="false"
	 * @generated
	 */
	EList<EObject> getAnnotatedObjects();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	EObject addNestedEObject(EObject container, EReference reference,
			EObject eObject);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	StereotypeApplication applyStereotype(
			StereotypeApplicability stereotypeApplicability, EObject eObject);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model many="false"
	 * @generated
	 */
	EList<StereotypeApplicability> getApplicableStereotypes(EObject eObject);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	String getProfileName();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	boolean isDirty();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	EObject removeEObject(EObject eObject);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model exceptions=
	 *        "org.modelversioning.emfprofile.application.registry.IOException org.modelversioning.emfprofile.application.registry.CoreException"
	 * @generated
	 */
	void save() throws IOException, CoreException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 *        dataType="org.modelversioning.emfprofile.application.registry.IFile"
	 * @generated
	 */
	IFile getProfileApplicationIFile();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 *        dataType="org.modelversioning.emfprofile.application.registry.Resource"
	 * @generated
	 */
	Resource getProfileApplicationResource();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void unload();

} // ProfileApplicationWrapper
