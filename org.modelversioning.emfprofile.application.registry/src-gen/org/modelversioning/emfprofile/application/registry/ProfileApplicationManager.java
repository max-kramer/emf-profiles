/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry;

import java.util.List;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Profile Application Manager</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.modelversioning.emfprofile.application.registry.ProfileApplicationManager#getProfileApplications
 * <em>Profile Applications</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage#getProfileApplicationManager()
 * @model
 * @generated
 */
public interface ProfileApplicationManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Profile Applications</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper}
	 * . <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Applications</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Profile Applications</em>' containment
	 *         reference list.
	 * @see org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage#getProfileApplicationManager_ProfileApplications()
	 * @model containment="true" required="true"
	 * @generated
	 */
	List<ProfileApplicationWrapper> getProfileApplications();

} // ProfileApplicationManager
