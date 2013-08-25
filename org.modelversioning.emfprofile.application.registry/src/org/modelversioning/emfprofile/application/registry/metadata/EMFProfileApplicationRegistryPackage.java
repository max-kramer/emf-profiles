/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.metadata;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryFactory
 * @model kind="package"
 * @generated
 */
public interface EMFProfileApplicationRegistryPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "registry";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://org.modelversioning/emfprofile/application/registry";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "par";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	EMFProfileApplicationRegistryPackage eINSTANCE = org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link org.modelversioning.emfprofile.application.registry.impl.ProfileApplicationWrapperImpl
	 * <em>Profile Application Wrapper</em>}' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.modelversioning.emfprofile.application.registry.impl.ProfileApplicationWrapperImpl
	 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getProfileApplicationWrapper()
	 * @generated
	 */
	int PROFILE_APPLICATION_WRAPPER = 0;

	/**
	 * The feature id for the '<em><b>Profile Application</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROFILE_APPLICATION_WRAPPER__PROFILE_APPLICATION = 0;

	/**
	 * The number of structural features of the '
	 * <em>Profile Application Wrapper</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROFILE_APPLICATION_WRAPPER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link org.modelversioning.emfprofile.application.registry.impl.ProfileApplicationRegistryImpl
	 * <em>Profile Application Registry</em>}' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.modelversioning.emfprofile.application.registry.impl.ProfileApplicationRegistryImpl
	 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getProfileApplicationRegistry()
	 * @generated
	 */
	int PROFILE_APPLICATION_REGISTRY = 1;

	/**
	 * The feature id for the '<em><b>Managers</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROFILE_APPLICATION_REGISTRY__MANAGERS = 0;

	/**
	 * The number of structural features of the '
	 * <em>Profile Application Registry</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROFILE_APPLICATION_REGISTRY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link org.modelversioning.emfprofile.application.registry.impl.ProfileApplicationManagerImpl
	 * <em>Profile Application Manager</em>}' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.modelversioning.emfprofile.application.registry.impl.ProfileApplicationManagerImpl
	 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getProfileApplicationManager()
	 * @generated
	 */
	int PROFILE_APPLICATION_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Profile Applications</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROFILE_APPLICATION_MANAGER__PROFILE_APPLICATIONS = 0;

	/**
	 * The number of structural features of the '
	 * <em>Profile Application Manager</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROFILE_APPLICATION_MANAGER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator
	 * <em>EMF Profile Application Decorator</em>}' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator
	 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getEMFProfileApplicationDecorator()
	 * @generated
	 */
	int EMF_PROFILE_APPLICATION_DECORATOR = 3;

	/**
	 * The number of structural features of the '
	 * <em>EMF Profile Application Decorator</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMF_PROFILE_APPLICATION_DECORATOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '<em>Illegal Argument Exception</em>' data
	 * type. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.IllegalArgumentException
	 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getIllegalArgumentException()
	 * @generated
	 */
	int ILLEGAL_ARGUMENT_EXCEPTION = 4;

	/**
	 * The meta object id for the '<em>Collection</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.util.Collection
	 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 5;

	/**
	 * The meta object id for the '<em>Resource Set</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.resource.ResourceSet
	 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getResourceSet()
	 * @generated
	 */
	int RESOURCE_SET = 6;

	/**
	 * The meta object id for the '<em>Resource</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 7;

	/**
	 * The meta object id for the '<em>IFile</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.core.resources.IFile
	 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getIFile()
	 * @generated
	 */
	int IFILE = 8;

	/**
	 * The meta object id for the '<em>IO Exception</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.io.IOException
	 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getIOException()
	 * @generated
	 */
	int IO_EXCEPTION = 9;

	/**
	 * The meta object id for the '
	 * <em>Profile Application Decorator Not Found Exception</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationDecoratorNotFoundException
	 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getProfileApplicationDecoratorNotFoundException()
	 * @generated
	 */
	int PROFILE_APPLICATION_DECORATOR_NOT_FOUND_EXCEPTION = 10;

	/**
	 * The meta object id for the '<em>Null Pointer Exception</em>' data type.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.NullPointerException
	 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getNullPointerException()
	 * @generated
	 */
	int NULL_POINTER_EXCEPTION = 11;

	/**
	 * The meta object id for the '<em>Core Exception</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.core.runtime.CoreException
	 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getCoreException()
	 * @generated
	 */
	int CORE_EXCEPTION = 12;

	/**
	 * The meta object id for the '
	 * <em>Profile Application Already Loaded Exception</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationAlreadyLoadedException
	 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getProfileApplicationAlreadyLoadedException()
	 * @generated
	 */
	int PROFILE_APPLICATION_ALREADY_LOADED_EXCEPTION = 13;

	/**
	 * The meta object id for the '
	 * <em>Traversing EObject Container Chain Exception</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.modelversioning.emfprofile.application.registry.exception.TraversingEObjectContainerChainException
	 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getTraversingEObjectContainerChainException()
	 * @generated
	 */
	int TRAVERSING_EOBJECT_CONTAINER_CHAIN_EXCEPTION = 14;

	/**
	 * The meta object id for the '<em>Exception</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.Exception
	 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 15;

	/**
	 * Returns the meta object for class '
	 * {@link org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper
	 * <em>Profile Application Wrapper</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Profile Application Wrapper</em>'.
	 * @see org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper
	 * @generated
	 */
	EClass getProfileApplicationWrapper();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper#getProfileApplication
	 * <em>Profile Application</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the reference '<em>Profile Application</em>'.
	 * @see org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper#getProfileApplication()
	 * @see #getProfileApplicationWrapper()
	 * @generated
	 */
	EReference getProfileApplicationWrapper_ProfileApplication();

	/**
	 * Returns the meta object for class '
	 * {@link org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry
	 * <em>Profile Application Registry</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Profile Application Registry</em>
	 *         '.
	 * @see org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry
	 * @generated
	 */
	EClass getProfileApplicationRegistry();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry#getManagers
	 * <em>Managers</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Managers</em>'.
	 * @see org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry#getManagers()
	 * @see #getProfileApplicationRegistry()
	 * @generated
	 */
	EReference getProfileApplicationRegistry_Managers();

	/**
	 * Returns the meta object for class '
	 * {@link org.modelversioning.emfprofile.application.registry.ProfileApplicationManager
	 * <em>Profile Application Manager</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Profile Application Manager</em>'.
	 * @see org.modelversioning.emfprofile.application.registry.ProfileApplicationManager
	 * @generated
	 */
	EClass getProfileApplicationManager();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.modelversioning.emfprofile.application.registry.ProfileApplicationManager#getProfileApplications
	 * <em>Profile Applications</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Profile Applications</em>'.
	 * @see org.modelversioning.emfprofile.application.registry.ProfileApplicationManager#getProfileApplications()
	 * @see #getProfileApplicationManager()
	 * @generated
	 */
	EReference getProfileApplicationManager_ProfileApplications();

	/**
	 * Returns the meta object for class '
	 * {@link org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator
	 * <em>EMF Profile Application Decorator</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '
	 *         <em>EMF Profile Application Decorator</em>'.
	 * @see org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator
	 * @generated
	 */
	EClass getEMFProfileApplicationDecorator();

	/**
	 * Returns the meta object for data type '
	 * {@link java.lang.IllegalArgumentException
	 * <em>Illegal Argument Exception</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for data type '
	 *         <em>Illegal Argument Exception</em>'.
	 * @see java.lang.IllegalArgumentException
	 * @model instanceClass="java.lang.IllegalArgumentException"
	 * @generated
	 */
	EDataType getIllegalArgumentException();

	/**
	 * Returns the meta object for data type '{@link java.util.Collection
	 * <em>Collection</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Collection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection" typeParameters="E"
	 * @generated
	 */
	EDataType getCollection();

	/**
	 * Returns the meta object for data type '
	 * {@link org.eclipse.emf.ecore.resource.ResourceSet <em>Resource Set</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Resource Set</em>'.
	 * @see org.eclipse.emf.ecore.resource.ResourceSet
	 * @model instanceClass="org.eclipse.emf.ecore.resource.ResourceSet"
	 * @generated
	 */
	EDataType getResourceSet();

	/**
	 * Returns the meta object for data type '
	 * {@link org.eclipse.emf.ecore.resource.Resource <em>Resource</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Resource</em>'.
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @model instanceClass="org.eclipse.emf.ecore.resource.Resource"
	 * @generated
	 */
	EDataType getResource();

	/**
	 * Returns the meta object for data type '
	 * {@link org.eclipse.core.resources.IFile <em>IFile</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>IFile</em>'.
	 * @see org.eclipse.core.resources.IFile
	 * @model instanceClass="org.eclipse.core.resources.IFile"
	 * @generated
	 */
	EDataType getIFile();

	/**
	 * Returns the meta object for data type '{@link java.io.IOException
	 * <em>IO Exception</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>IO Exception</em>'.
	 * @see java.io.IOException
	 * @model instanceClass="java.io.IOException"
	 * @generated
	 */
	EDataType getIOException();

	/**
	 * Returns the meta object for data type '
	 * {@link org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationDecoratorNotFoundException
	 * <em>Profile Application Decorator Not Found Exception</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '
	 *         <em>Profile Application Decorator Not Found Exception</em>'.
	 * @see org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationDecoratorNotFoundException
	 * @model instanceClass=
	 *        "org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationDecoratorNotFoundException"
	 * @generated
	 */
	EDataType getProfileApplicationDecoratorNotFoundException();

	/**
	 * Returns the meta object for data type '
	 * {@link java.lang.NullPointerException <em>Null Pointer Exception</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Null Pointer Exception</em>'.
	 * @see java.lang.NullPointerException
	 * @model instanceClass="java.lang.NullPointerException"
	 * @generated
	 */
	EDataType getNullPointerException();

	/**
	 * Returns the meta object for data type '
	 * {@link org.eclipse.core.runtime.CoreException <em>Core Exception</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Core Exception</em>'.
	 * @see org.eclipse.core.runtime.CoreException
	 * @model instanceClass="org.eclipse.core.runtime.CoreException"
	 * @generated
	 */
	EDataType getCoreException();

	/**
	 * Returns the meta object for data type '
	 * {@link org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationAlreadyLoadedException
	 * <em>Profile Application Already Loaded Exception</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '
	 *         <em>Profile Application Already Loaded Exception</em>'.
	 * @see org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationAlreadyLoadedException
	 * @model instanceClass=
	 *        "org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationAlreadyLoadedException"
	 * @generated
	 */
	EDataType getProfileApplicationAlreadyLoadedException();

	/**
	 * Returns the meta object for data type '
	 * {@link org.modelversioning.emfprofile.application.registry.exception.TraversingEObjectContainerChainException
	 * <em>Traversing EObject Container Chain Exception</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '
	 *         <em>Traversing EObject Container Chain Exception</em>'.
	 * @see org.modelversioning.emfprofile.application.registry.exception.TraversingEObjectContainerChainException
	 * @model instanceClass=
	 *        "org.modelversioning.emfprofile.application.registry.exception.TraversingEObjectContainerChainException"
	 * @generated
	 */
	EDataType getTraversingEObjectContainerChainException();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception
	 * <em>Exception</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EMFProfileApplicationRegistryFactory getEMFProfileApplicationRegistryFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link org.modelversioning.emfprofile.application.registry.impl.ProfileApplicationWrapperImpl
		 * <em>Profile Application Wrapper</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.modelversioning.emfprofile.application.registry.impl.ProfileApplicationWrapperImpl
		 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getProfileApplicationWrapper()
		 * @generated
		 */
		EClass PROFILE_APPLICATION_WRAPPER = eINSTANCE
				.getProfileApplicationWrapper();

		/**
		 * The meta object literal for the '<em><b>Profile Application</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROFILE_APPLICATION_WRAPPER__PROFILE_APPLICATION = eINSTANCE
				.getProfileApplicationWrapper_ProfileApplication();

		/**
		 * The meta object literal for the '
		 * {@link org.modelversioning.emfprofile.application.registry.impl.ProfileApplicationRegistryImpl
		 * <em>Profile Application Registry</em>}' class. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @see org.modelversioning.emfprofile.application.registry.impl.ProfileApplicationRegistryImpl
		 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getProfileApplicationRegistry()
		 * @generated
		 */
		EClass PROFILE_APPLICATION_REGISTRY = eINSTANCE
				.getProfileApplicationRegistry();

		/**
		 * The meta object literal for the '<em><b>Managers</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROFILE_APPLICATION_REGISTRY__MANAGERS = eINSTANCE
				.getProfileApplicationRegistry_Managers();

		/**
		 * The meta object literal for the '
		 * {@link org.modelversioning.emfprofile.application.registry.impl.ProfileApplicationManagerImpl
		 * <em>Profile Application Manager</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.modelversioning.emfprofile.application.registry.impl.ProfileApplicationManagerImpl
		 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getProfileApplicationManager()
		 * @generated
		 */
		EClass PROFILE_APPLICATION_MANAGER = eINSTANCE
				.getProfileApplicationManager();

		/**
		 * The meta object literal for the '<em><b>Profile Applications</b></em>
		 * ' containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROFILE_APPLICATION_MANAGER__PROFILE_APPLICATIONS = eINSTANCE
				.getProfileApplicationManager_ProfileApplications();

		/**
		 * The meta object literal for the '
		 * {@link org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator
		 * <em>EMF Profile Application Decorator</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator
		 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getEMFProfileApplicationDecorator()
		 * @generated
		 */
		EClass EMF_PROFILE_APPLICATION_DECORATOR = eINSTANCE
				.getEMFProfileApplicationDecorator();

		/**
		 * The meta object literal for the '<em>Illegal Argument Exception</em>'
		 * data type. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see java.lang.IllegalArgumentException
		 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getIllegalArgumentException()
		 * @generated
		 */
		EDataType ILLEGAL_ARGUMENT_EXCEPTION = eINSTANCE
				.getIllegalArgumentException();

		/**
		 * The meta object literal for the '<em>Collection</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see java.util.Collection
		 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getCollection()
		 * @generated
		 */
		EDataType COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em>Resource Set</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.ecore.resource.ResourceSet
		 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getResourceSet()
		 * @generated
		 */
		EDataType RESOURCE_SET = eINSTANCE.getResourceSet();

		/**
		 * The meta object literal for the '<em>Resource</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.ecore.resource.Resource
		 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getResource()
		 * @generated
		 */
		EDataType RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em>IFile</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.core.resources.IFile
		 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getIFile()
		 * @generated
		 */
		EDataType IFILE = eINSTANCE.getIFile();

		/**
		 * The meta object literal for the '<em>IO Exception</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see java.io.IOException
		 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getIOException()
		 * @generated
		 */
		EDataType IO_EXCEPTION = eINSTANCE.getIOException();

		/**
		 * The meta object literal for the '
		 * <em>Profile Application Decorator Not Found Exception</em>' data
		 * type. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationDecoratorNotFoundException
		 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getProfileApplicationDecoratorNotFoundException()
		 * @generated
		 */
		EDataType PROFILE_APPLICATION_DECORATOR_NOT_FOUND_EXCEPTION = eINSTANCE
				.getProfileApplicationDecoratorNotFoundException();

		/**
		 * The meta object literal for the '<em>Null Pointer Exception</em>'
		 * data type. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see java.lang.NullPointerException
		 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getNullPointerException()
		 * @generated
		 */
		EDataType NULL_POINTER_EXCEPTION = eINSTANCE.getNullPointerException();

		/**
		 * The meta object literal for the '<em>Core Exception</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.core.runtime.CoreException
		 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getCoreException()
		 * @generated
		 */
		EDataType CORE_EXCEPTION = eINSTANCE.getCoreException();

		/**
		 * The meta object literal for the '
		 * <em>Profile Application Already Loaded Exception</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationAlreadyLoadedException
		 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getProfileApplicationAlreadyLoadedException()
		 * @generated
		 */
		EDataType PROFILE_APPLICATION_ALREADY_LOADED_EXCEPTION = eINSTANCE
				.getProfileApplicationAlreadyLoadedException();

		/**
		 * The meta object literal for the '
		 * <em>Traversing EObject Container Chain Exception</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.modelversioning.emfprofile.application.registry.exception.TraversingEObjectContainerChainException
		 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getTraversingEObjectContainerChainException()
		 * @generated
		 */
		EDataType TRAVERSING_EOBJECT_CONTAINER_CHAIN_EXCEPTION = eINSTANCE
				.getTraversingEObjectContainerChainException();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see java.lang.Exception
		 * @see org.modelversioning.emfprofile.application.registry.impl.EMFProfileApplicationRegistryPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

	}

} // EMFProfileApplicationRegistryPackage
