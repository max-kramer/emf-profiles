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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.application.registry.*;
import org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationAlreadyLoadedException;
import org.modelversioning.emfprofile.application.registry.exception.TraversingEObjectContainerChainException;
import org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryFactory;
import org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class EMFProfileApplicationRegistryFactoryImpl extends EFactoryImpl
		implements EMFProfileApplicationRegistryFactory {

	private static final ProfileApplicationRegistryImpl profileApplicationRegistry = new ProfileApplicationRegistryImpl();;

	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static EMFProfileApplicationRegistryFactory init() {
		try {
			EMFProfileApplicationRegistryFactory theEMFProfileApplicationRegistryFactory = (EMFProfileApplicationRegistryFactory) EPackage.Registry.INSTANCE
					.getEFactory(EMFProfileApplicationRegistryPackage.eNS_URI);
			if (theEMFProfileApplicationRegistryFactory != null) {
				return theEMFProfileApplicationRegistryFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EMFProfileApplicationRegistryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public EMFProfileApplicationRegistryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_WRAPPER:
			return createProfileApplicationWrapper();
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_REGISTRY:
			return createProfileApplicationRegistry();
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_MANAGER:
			return createProfileApplicationManager();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case EMFProfileApplicationRegistryPackage.ILLEGAL_ARGUMENT_EXCEPTION:
			return createIllegalArgumentExceptionFromString(eDataType,
					initialValue);
		case EMFProfileApplicationRegistryPackage.COLLECTION:
			return createCollectionFromString(eDataType, initialValue);
		case EMFProfileApplicationRegistryPackage.RESOURCE_SET:
			return createResourceSetFromString(eDataType, initialValue);
		case EMFProfileApplicationRegistryPackage.RESOURCE:
			return createResourceFromString(eDataType, initialValue);
		case EMFProfileApplicationRegistryPackage.IFILE:
			return createIFileFromString(eDataType, initialValue);
		case EMFProfileApplicationRegistryPackage.IO_EXCEPTION:
			return createIOExceptionFromString(eDataType, initialValue);
		case EMFProfileApplicationRegistryPackage.NULL_POINTER_EXCEPTION:
			return createNullPointerExceptionFromString(eDataType, initialValue);
		case EMFProfileApplicationRegistryPackage.CORE_EXCEPTION:
			return createCoreExceptionFromString(eDataType, initialValue);
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_ALREADY_LOADED_EXCEPTION:
			return createProfileApplicationAlreadyLoadedExceptionFromString(
					eDataType, initialValue);
		case EMFProfileApplicationRegistryPackage.TRAVERSING_EOBJECT_CONTAINER_CHAIN_EXCEPTION:
			return createTraversingEObjectContainerChainExceptionFromString(
					eDataType, initialValue);
		case EMFProfileApplicationRegistryPackage.EXCEPTION:
			return createExceptionFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case EMFProfileApplicationRegistryPackage.ILLEGAL_ARGUMENT_EXCEPTION:
			return convertIllegalArgumentExceptionToString(eDataType,
					instanceValue);
		case EMFProfileApplicationRegistryPackage.COLLECTION:
			return convertCollectionToString(eDataType, instanceValue);
		case EMFProfileApplicationRegistryPackage.RESOURCE_SET:
			return convertResourceSetToString(eDataType, instanceValue);
		case EMFProfileApplicationRegistryPackage.RESOURCE:
			return convertResourceToString(eDataType, instanceValue);
		case EMFProfileApplicationRegistryPackage.IFILE:
			return convertIFileToString(eDataType, instanceValue);
		case EMFProfileApplicationRegistryPackage.IO_EXCEPTION:
			return convertIOExceptionToString(eDataType, instanceValue);
		case EMFProfileApplicationRegistryPackage.NULL_POINTER_EXCEPTION:
			return convertNullPointerExceptionToString(eDataType, instanceValue);
		case EMFProfileApplicationRegistryPackage.CORE_EXCEPTION:
			return convertCoreExceptionToString(eDataType, instanceValue);
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_ALREADY_LOADED_EXCEPTION:
			return convertProfileApplicationAlreadyLoadedExceptionToString(
					eDataType, instanceValue);
		case EMFProfileApplicationRegistryPackage.TRAVERSING_EOBJECT_CONTAINER_CHAIN_EXCEPTION:
			return convertTraversingEObjectContainerChainExceptionToString(
					eDataType, instanceValue);
		case EMFProfileApplicationRegistryPackage.EXCEPTION:
			return convertExceptionToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProfileApplicationWrapper createProfileApplicationWrapper() {
		ProfileApplicationWrapperImpl profileApplicationWrapper = new ProfileApplicationWrapperImpl();
		return profileApplicationWrapper;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @throws IOException
	 * @throws CoreException
	 * 
	 * @generated NOT
	 */
	public ProfileApplicationWrapper createProfileApplicationWrapper(
			ResourceSet resourceSet, IFile file, Collection<Profile> profiles)
			throws CoreException, IOException {
		ProfileApplicationWrapperImpl profileApplicationWrapper = new ProfileApplicationWrapperImpl(
				resourceSet, file, profiles);
		return profileApplicationWrapper;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @throws IOException
	 * @throws CoreException
	 * 
	 * @generated NOT
	 */
	public ProfileApplicationWrapper createProfileApplicationWrapper(
			ResourceSet resourceSet, IFile file) throws CoreException,
			IOException {
		ProfileApplicationWrapperImpl profileApplicationWrapper = new ProfileApplicationWrapperImpl(
				resourceSet, file);
		return profileApplicationWrapper;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ProfileApplicationRegistry createProfileApplicationRegistry() {

		return profileApplicationRegistry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProfileApplicationManager createProfileApplicationManager() {
		ProfileApplicationManagerImpl profileApplicationManager = new ProfileApplicationManagerImpl();
		return profileApplicationManager;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ProfileApplicationManager createProfileApplicationManager(
			ResourceSet resourceSet) {
		ProfileApplicationManagerImpl profileApplicationManager = new ProfileApplicationManagerImpl(
				resourceSet);
		return profileApplicationManager;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IllegalArgumentException createIllegalArgumentExceptionFromString(
			EDataType eDataType, String initialValue) {
		return (IllegalArgumentException) super.createFromString(eDataType,
				initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertIllegalArgumentExceptionToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Collection<?> createCollectionFromString(EDataType eDataType,
			String initialValue) {
		return (Collection<?>) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertCollectionToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResourceSet createResourceSetFromString(EDataType eDataType,
			String initialValue) {
		return (ResourceSet) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertResourceSetToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Resource createResourceFromString(EDataType eDataType,
			String initialValue) {
		return (Resource) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertResourceToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IFile createIFileFromString(EDataType eDataType, String initialValue) {
		return (IFile) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertIFileToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IOException createIOExceptionFromString(EDataType eDataType,
			String initialValue) {
		return (IOException) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertIOExceptionToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NullPointerException createNullPointerExceptionFromString(
			EDataType eDataType, String initialValue) {
		return (NullPointerException) super.createFromString(eDataType,
				initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertNullPointerExceptionToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CoreException createCoreExceptionFromString(EDataType eDataType,
			String initialValue) {
		return (CoreException) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertCoreExceptionToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProfileApplicationAlreadyLoadedException createProfileApplicationAlreadyLoadedExceptionFromString(
			EDataType eDataType, String initialValue) {
		return (ProfileApplicationAlreadyLoadedException) super
				.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertProfileApplicationAlreadyLoadedExceptionToString(
			EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TraversingEObjectContainerChainException createTraversingEObjectContainerChainExceptionFromString(
			EDataType eDataType, String initialValue) {
		return (TraversingEObjectContainerChainException) super
				.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertTraversingEObjectContainerChainExceptionToString(
			EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Exception createExceptionFromString(EDataType eDataType,
			String initialValue) {
		return (Exception) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertExceptionToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EMFProfileApplicationRegistryPackage getEMFProfileApplicationRegistryPackage() {
		return (EMFProfileApplicationRegistryPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EMFProfileApplicationRegistryPackage getPackage() {
		return EMFProfileApplicationRegistryPackage.eINSTANCE;
	}

} // EMFProfileApplicationRegistryFactoryImpl
