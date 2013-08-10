/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry;

import org.eclipse.emf.ecore.EObject;

import org.modelversioning.emfprofileapplication.ProfileApplication;

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
	 * <em>Profile Application</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Profile Application</em>' reference.
	 * @see #getProfileApplication()
	 * @generated
	 */
	void setProfileApplication(ProfileApplication value);

} // ProfileApplicationWrapper
