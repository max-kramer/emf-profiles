/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.impl;

import java.io.IOException;
import java.util.Collection;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.modelversioning.emfprofile.EMFProfilePackage;
import org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationManager;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper;
import org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationAlreadyLoadedException;
import org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationDecoratorNotFoundException;
import org.modelversioning.emfprofile.application.registry.exception.TraversingEObjectContainerChainException;
import org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryFactory;
import org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage;
import org.modelversioning.emfprofileapplication.EMFProfileApplicationPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class EMFProfileApplicationRegistryPackageImpl extends EPackageImpl
		implements EMFProfileApplicationRegistryPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass profileApplicationWrapperEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass profileApplicationRegistryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass profileApplicationManagerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass emfProfileApplicationDecoratorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType illegalArgumentExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType collectionEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType resourceSetEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType resourceEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType iFileEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType ioExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType profileApplicationDecoratorNotFoundExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType nullPointerExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType coreExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType profileApplicationAlreadyLoadedExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType traversingEObjectContainerChainExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EMFProfileApplicationRegistryPackageImpl() {
		super(eNS_URI, EMFProfileApplicationRegistryFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize
	 * {@link EMFProfileApplicationRegistryPackage#eINSTANCE} when that field is
	 * accessed. Clients should not invoke it directly. Instead, they should
	 * simply access that field to obtain the package. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EMFProfileApplicationRegistryPackage init() {
		if (isInited)
			return (EMFProfileApplicationRegistryPackage) EPackage.Registry.INSTANCE
					.getEPackage(EMFProfileApplicationRegistryPackage.eNS_URI);

		// Obtain or create and register package
		EMFProfileApplicationRegistryPackageImpl theEMFProfileApplicationRegistryPackage = (EMFProfileApplicationRegistryPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof EMFProfileApplicationRegistryPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new EMFProfileApplicationRegistryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EMFProfileApplicationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEMFProfileApplicationRegistryPackage.createPackageContents();

		// Initialize created meta-data
		theEMFProfileApplicationRegistryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEMFProfileApplicationRegistryPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(
				EMFProfileApplicationRegistryPackage.eNS_URI,
				theEMFProfileApplicationRegistryPackage);
		return theEMFProfileApplicationRegistryPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getProfileApplicationWrapper() {
		return profileApplicationWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getProfileApplicationWrapper_ProfileApplication() {
		return (EReference) profileApplicationWrapperEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getProfileApplicationRegistry() {
		return profileApplicationRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getProfileApplicationRegistry_Managers() {
		return (EReference) profileApplicationRegistryEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getProfileApplicationManager() {
		return profileApplicationManagerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getProfileApplicationManager_ProfileApplications() {
		return (EReference) profileApplicationManagerEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEMFProfileApplicationDecorator() {
		return emfProfileApplicationDecoratorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getIllegalArgumentException() {
		return illegalArgumentExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getCollection() {
		return collectionEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getResourceSet() {
		return resourceSetEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getResource() {
		return resourceEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getIFile() {
		return iFileEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getIOException() {
		return ioExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getProfileApplicationDecoratorNotFoundException() {
		return profileApplicationDecoratorNotFoundExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getNullPointerException() {
		return nullPointerExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getCoreException() {
		return coreExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getProfileApplicationAlreadyLoadedException() {
		return profileApplicationAlreadyLoadedExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getTraversingEObjectContainerChainException() {
		return traversingEObjectContainerChainExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EMFProfileApplicationRegistryFactory getEMFProfileApplicationRegistryFactory() {
		return (EMFProfileApplicationRegistryFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		profileApplicationWrapperEClass = createEClass(PROFILE_APPLICATION_WRAPPER);
		createEReference(profileApplicationWrapperEClass,
				PROFILE_APPLICATION_WRAPPER__PROFILE_APPLICATION);

		profileApplicationRegistryEClass = createEClass(PROFILE_APPLICATION_REGISTRY);
		createEReference(profileApplicationRegistryEClass,
				PROFILE_APPLICATION_REGISTRY__MANAGERS);

		profileApplicationManagerEClass = createEClass(PROFILE_APPLICATION_MANAGER);
		createEReference(profileApplicationManagerEClass,
				PROFILE_APPLICATION_MANAGER__PROFILE_APPLICATIONS);

		emfProfileApplicationDecoratorEClass = createEClass(EMF_PROFILE_APPLICATION_DECORATOR);

		// Create data types
		illegalArgumentExceptionEDataType = createEDataType(ILLEGAL_ARGUMENT_EXCEPTION);
		collectionEDataType = createEDataType(COLLECTION);
		resourceSetEDataType = createEDataType(RESOURCE_SET);
		resourceEDataType = createEDataType(RESOURCE);
		iFileEDataType = createEDataType(IFILE);
		ioExceptionEDataType = createEDataType(IO_EXCEPTION);
		profileApplicationDecoratorNotFoundExceptionEDataType = createEDataType(PROFILE_APPLICATION_DECORATOR_NOT_FOUND_EXCEPTION);
		nullPointerExceptionEDataType = createEDataType(NULL_POINTER_EXCEPTION);
		coreExceptionEDataType = createEDataType(CORE_EXCEPTION);
		profileApplicationAlreadyLoadedExceptionEDataType = createEDataType(PROFILE_APPLICATION_ALREADY_LOADED_EXCEPTION);
		traversingEObjectContainerChainExceptionEDataType = createEDataType(TRAVERSING_EOBJECT_CONTAINER_CHAIN_EXCEPTION);
		exceptionEDataType = createEDataType(EXCEPTION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EMFProfileApplicationPackage theEMFProfileApplicationPackage = (EMFProfileApplicationPackage) EPackage.Registry.INSTANCE
				.getEPackage(EMFProfileApplicationPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI);
		EMFProfilePackage theEMFProfilePackage = (EMFProfilePackage) EPackage.Registry.INSTANCE
				.getEPackage(EMFProfilePackage.eNS_URI);

		// Create type parameters
		addETypeParameter(collectionEDataType, "E");

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(profileApplicationWrapperEClass,
				ProfileApplicationWrapper.class, "ProfileApplicationWrapper",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProfileApplicationWrapper_ProfileApplication(),
				theEMFProfileApplicationPackage.getProfileApplication(), null,
				"profileApplication", null, 1, 1,
				ProfileApplicationWrapper.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(profileApplicationWrapperEClass, null,
				"getStereotypeApplications", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theEcorePackage.getEEList());
		EGenericType g2 = createEGenericType(theEMFProfileApplicationPackage
				.getStereotypeApplication());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(profileApplicationWrapperEClass, null,
				"getStereotypeApplications", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "eObject", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEEList());
		g2 = createEGenericType(theEMFProfileApplicationPackage
				.getStereotypeApplication());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(profileApplicationWrapperEClass, null,
				"getStereotypeApplications", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "eObject", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEMFProfilePackage.getStereotype(), "stereotype",
				0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEEList());
		g2 = createEGenericType(theEMFProfileApplicationPackage
				.getStereotypeApplication());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(profileApplicationWrapperEClass, null,
				"getAnnotatedObjects", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEEList());
		g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(profileApplicationWrapperEClass,
				ecorePackage.getEObject(), "addNestedEObject", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "container", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEReference(), "reference", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "eObject", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(profileApplicationWrapperEClass,
				theEMFProfileApplicationPackage.getStereotypeApplication(),
				"applyStereotype", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op,
				theEMFProfileApplicationPackage.getStereotypeApplicability(),
				"stereotypeApplicability", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "eObject", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(profileApplicationWrapperEClass, null,
				"getApplicableStereotypes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "eObject", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEEList());
		g2 = createEGenericType(theEMFProfileApplicationPackage
				.getStereotypeApplicability());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(profileApplicationWrapperEClass,
				theEcorePackage.getEString(), "getName", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(profileApplicationWrapperEClass,
				theEcorePackage.getEString(), "getProfileName", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(profileApplicationWrapperEClass,
				theEcorePackage.getEBoolean(), "isDirty", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(profileApplicationWrapperEClass,
				ecorePackage.getEObject(), "removeEObject", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "eObject", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(profileApplicationWrapperEClass, null, "save", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());
		addEException(op, this.getCoreException());

		addEOperation(profileApplicationWrapperEClass, this.getIFile(),
				"getProfileApplicationIFile", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(profileApplicationWrapperEClass, this.getResource(),
				"getProfileApplicationResource", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(profileApplicationWrapperEClass, null, "unload", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(profileApplicationRegistryEClass,
				ProfileApplicationRegistry.class, "ProfileApplicationRegistry",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProfileApplicationRegistry_Managers(),
				this.getProfileApplicationManager(), null, "managers", null, 0,
				-1, ProfileApplicationRegistry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(profileApplicationRegistryEClass,
				this.getProfileApplicationManager(),
				"getProfileApplicationManager", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResourceSet(), "resourceSet", 1, 1,
				IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getNullPointerException());

		op = addEOperation(profileApplicationRegistryEClass,
				this.getProfileApplicationManager(),
				"getProfileApplicationManager", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResourceSet(), "resourceSet", 1, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "editorId", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getNullPointerException());
		addEException(op,
				this.getProfileApplicationDecoratorNotFoundException());

		op = addEOperation(profileApplicationRegistryEClass,
				theEcorePackage.getEBoolean(),
				"hasProfileApplicationDecoratorForEditorId", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "editorId", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(profileApplicationRegistryEClass,
				this.getEMFProfileApplicationDecorator(),
				"getProfileApplicationDecoratorForEditorId", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "editorId", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getNullPointerException());
		addEException(op,
				this.getProfileApplicationDecoratorNotFoundException());

		initEClass(profileApplicationManagerEClass,
				ProfileApplicationManager.class, "ProfileApplicationManager",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProfileApplicationManager_ProfileApplications(),
				this.getProfileApplicationWrapper(), null,
				"profileApplications", null, 1, -1,
				ProfileApplicationManager.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(profileApplicationManagerEClass,
				this.getProfileApplicationWrapper(),
				"createNewProfileApplication", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIFile(), "profileApplicationFile", 1, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(theEMFProfilePackage.getProfile());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "profiles", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIllegalArgumentException());
		addEException(op, this.getIOException());
		addEException(op, this.getCoreException());

		addEOperation(profileApplicationManagerEClass,
				theEcorePackage.getEBoolean(), "hasProfileApplications", 1, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(profileApplicationManagerEClass,
				this.getProfileApplicationWrapper(), "loadProfileApplication",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIFile(), "profileApplicationFile", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getProfileApplicationAlreadyLoadedException());
		addEException(op, this.getIOException());
		addEException(op, this.getCoreException());

		addEOperation(profileApplicationManagerEClass, null, "dispose", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(profileApplicationManagerEClass,
				this.getProfileApplicationWrapper(),
				"getProfileApplicationWrapperOfContainedEObject", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "eObject", 1, 1,
				IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getTraversingEObjectContainerChainException());

		op = addEOperation(profileApplicationManagerEClass,
				this.getEMFProfileApplicationDecorator(),
				"bindProfileApplicationDecorator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "editorId", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getNullPointerException());
		addEException(op,
				this.getProfileApplicationDecoratorNotFoundException());

		initEClass(emfProfileApplicationDecoratorEClass,
				EMFProfileApplicationDecorator.class,
				"EMFProfileApplicationDecorator", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(emfProfileApplicationDecoratorEClass, null,
				"canDecorateEditorsWithFollowingIDs", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(emfProfileApplicationDecoratorEClass, null,
				"decorate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op,
				theEMFProfileApplicationPackage.getStereotypeApplication(),
				"stereotypeApplication", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(emfProfileApplicationDecoratorEClass, null,
				"undecorate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op,
				theEMFProfileApplicationPackage.getStereotypeApplication(),
				"stereotypeApplication", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(emfProfileApplicationDecoratorEClass,
				theEcorePackage.getEObject(),
				"resolveEObjectFromEditorSelection", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "selection", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(illegalArgumentExceptionEDataType,
				IllegalArgumentException.class, "IllegalArgumentException",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(collectionEDataType, Collection.class, "Collection",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(resourceSetEDataType, ResourceSet.class, "ResourceSet",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(resourceEDataType, Resource.class, "Resource",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iFileEDataType, IFile.class, "IFile", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ioExceptionEDataType, IOException.class, "IOException",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(profileApplicationDecoratorNotFoundExceptionEDataType,
				ProfileApplicationDecoratorNotFoundException.class,
				"ProfileApplicationDecoratorNotFoundException",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nullPointerExceptionEDataType,
				NullPointerException.class, "NullPointerException",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(coreExceptionEDataType, CoreException.class,
				"CoreException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(profileApplicationAlreadyLoadedExceptionEDataType,
				ProfileApplicationAlreadyLoadedException.class,
				"ProfileApplicationAlreadyLoadedException", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(traversingEObjectContainerChainExceptionEDataType,
				TraversingEObjectContainerChainException.class,
				"TraversingEObjectContainerChainException", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // EMFProfileApplicationRegistryPackageImpl
