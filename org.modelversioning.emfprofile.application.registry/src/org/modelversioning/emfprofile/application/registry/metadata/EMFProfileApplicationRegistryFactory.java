/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.metadata;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationManager;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage
 * @generated
 */
public interface EMFProfileApplicationRegistryFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	EMFProfileApplicationRegistryFactory eINSTANCE = org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Profile Application Wrapper</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Profile Application Wrapper</em>'.
	 * @generated
	 */
	ProfileApplicationWrapper createProfileApplicationWrapper();

	/**
	 * Returns a new object of class '<em>Profile Application Registry</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Profile Application Registry</em>'.
	 * @generated
	 */
	ProfileApplicationRegistry createProfileApplicationRegistry();

	/**
	 * Returns a new object of class '<em>Profile Application Manager</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Profile Application Manager</em>'.
	 * @generated
	 */
	ProfileApplicationManager createProfileApplicationManager();

	/**
	 * Returns a new object of class '<em>Profile Application Manager</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Profile Application Manager</em>'.
	 * @generated NOT
	 */
	ProfileApplicationManager createProfileApplicationManager(
			ResourceSet resourceSet);

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	EMFProfileApplicationRegistryPackage getEMFProfileApplicationRegistryPackage();

	ProfileApplicationWrapper createProfileApplicationWrapper(
			ResourceSet resourceSet, IFile profileApplicationFile,
			Collection<Profile> profiles) throws CoreException, IOException;

	ProfileApplicationWrapper createProfileApplicationWrapper(
			ResourceSet resourceSet, IFile profileApplicationFile) throws CoreException, IOException;

} // EMFProfileApplicationRegistryFactory
