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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.modelversioning.emfprofile.Extension;
import org.modelversioning.emfprofile.IProfileFacade;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.Stereotype;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.modelversioning.emfprofileapplication.StereotypeApplicability;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Profile Application Wrapper</b></em>'. This object wraps the
 * {@link ProfileApplication} with additional functionalities, e.g. the semantic
 * name of the profile application (constructed of profile name and location of
 * profile application resource), the status if profile application has changed
 * and needs to be saved, or convenience methods to apply/remove stereotypes or
 * nested objects. <!-- end-user-doc -->
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
	 * construction of the wrapper. <br>
	 * <em><b>Calling this method will always throw {@link UnsupportedOperationException}</b></em>
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Profile Application</em>' reference.
	 * @see #getProfileApplication()
	 * @generated
	 */
	void setProfileApplication(ProfileApplication value);

	/**
	 * <!-- begin-user-doc --> Returns all {@link StereotypeApplication
	 * stereotype applications} from this profile application. <!-- end-user-doc
	 * -->
	 * 
	 * @model kind="operation" many="false"
	 * @generated
	 */
	EList<StereotypeApplication> getStereotypeApplications();

	/**
	 * <!-- begin-user-doc --> Returns all {@link StereotypeApplication
	 * stereotype applications} from this profile application that are applied
	 * to provided {@link EObject eObject}. <!-- end-user-doc -->
	 * 
	 * @model many="false"
	 * @generated
	 */
	EList<StereotypeApplication> getStereotypeApplications(EObject eObject);

	/**
	 * <!-- begin-user-doc --> Returns all {@link StereotypeApplication
	 * stereotype applications} of the same type from this profile application
	 * that are applied to provided {@link EObject eObject}. <!-- end-user-doc
	 * -->
	 * 
	 * @model many="false"
	 * @generated
	 */
	EList<StereotypeApplication> getStereotypeApplications(EObject eObject,
			Stereotype stereotype);

	/**
	 * <!-- begin-user-doc --> Returns all EObjects from the model that were
	 * annotated through this profile application. <!-- end-user-doc -->
	 * 
	 * @model kind="operation" many="false"
	 * @generated
	 */
	EList<EObject> getAnnotatedObjects();

	/**
	 * <!-- begin-user-doc --> Adds a nested eObject to the container. <!--
	 * end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	EObject addNestedEObject(EObject container, EReference reference,
			EObject eObject);

	/**
	 * <!-- begin-user-doc --> Applies {@link Stereotype stereotype} to the
	 * {@link EObject eObject}
	 * 
	 * @return returns the resulting instance of the
	 *         {@link StereotypeApplication stereotype application.} <!--
	 *         end-user-doc -->
	 * @model
	 * @generated
	 */
	StereotypeApplication applyStereotype(Stereotype stereotype, EObject eObject);

	/**
	 * <!-- begin-user-doc --> Applies the specified
	 * <code>applicableStereotype</code>. <br />
	 * <b>Note:</b> The method is actually implemented in {@link IProfileFacade}
	 * , so this method forwards the call to the facade.
	 * <p>
	 * This method is a convenience method for
	 * {@link #apply(Stereotype, EObject, Extension)}.
	 * </p>
	 * 
	 * @param stereotypeApplicability
	 *            the applicable stereotype to be applied.
	 * @param eObject
	 *            to apply the <code>applicableStereotype</code> to.
	 * @return the created instance of the {@link StereotypeApplication}. <!--
	 *         end-user-doc -->
	 * @model
	 * @generated
	 */
	StereotypeApplication applyStereotype(
			StereotypeApplicability stereotypeApplicability, EObject eObject);

	/**
	 * <!-- begin-user-doc --> Returns the list of applicable stereotype for the
	 * specified type in <code>eClass</code>. <br />
	 * <b>Note:</b> The method is actually implemented in {@link IProfileFacade}
	 * , so this method forwards the call to the facade.
	 * 
	 * @param eClass
	 *            to get applicable stereotype for.
	 * @return the list of applicable {@link Stereotype}s. <!-- end-user-doc -->
	 * @model many="false"
	 * @generated
	 */
	EList<StereotypeApplicability> getApplicableStereotypes(EObject eObject);

	/**
	 * <!-- begin-user-doc --> Returns a list of {@link EStructuralFeature
	 * structural features} of the {@link Stereotype stereotype} which can be
	 * used to access/modify tagged values.
	 * 
	 * @return the list of structural features of the provided stereotype. <!--
	 *         end-user-doc -->
	 * @model many="false"
	 * @generated
	 */
	EList<EStructuralFeature> getStereotypeFeatures(Stereotype stereotype);

	/**
	 * <!-- begin-user-doc --> Gets the name of this profile application. <br>
	 * The name is constructed out of loaded profile name and the location of
	 * this profile application resource in the workspace. <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc --> Gets the name of the loaded profile. <!--
	 * end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	String getProfileName();

	/**
	 * <!-- begin-user-doc -->Is this profile application changed and if it
	 * needs to be saved.<!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	boolean isDirty();

	/**
	 * <!-- begin-user-doc -->Removes the {@link EObject eObject} from the
	 * profile application resource. It doesn't matter which one :)
	 * 
	 * @return the removed eObject itself. <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> Returns the {@link IFile} which is a handle to
	 * the resource in workspace where the profile application data is
	 * persisted. <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 *        dataType="org.modelversioning.emfprofile.application.registry.IFile"
	 * @generated
	 */
	IFile getProfileApplicationIFile();

	/**
	 * <!-- begin-user-doc --> Return the EMF {@link Resource} of this profile
	 * application. <!-- end-user-doc -->
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

	/**
	 * <!-- begin-user-doc --> Can be used to access the the tagged value of the
	 * {@link StereotypeApplication stereotype application}.
	 * <p>
	 * Note: this method can be used to access value of any
	 * {@link EStructuralFeature structural feature} of any {@link EObject}.
	 * </p>
	 * 
	 * @return the value as an {@link Object}. You have to cast to correct type.
	 *         <!-- end-user-doc -->
	 * @model 
	 *        dataType="org.modelversioning.emfprofile.application.registry.Object"
	 * @generated
	 */
	Object getTaggedValue(EObject stereotypeApplication,
			EStructuralFeature structuralFeatureOfTaggedValue);

	/**
	 * <!-- begin-user-doc --> Can be used to modify the the tagged value of the
	 * {@link StereotypeApplication stereotype application}.
	 * <p>
	 * Note: this method can be used to modify value of any
	 * {@link EStructuralFeature structural feature} of any {@link EObject}.
	 * </p>
	 * 
	 * <!-- end-user-doc -->
	 * 
	 * @model newValueDataType=
	 *        "org.modelversioning.emfprofile.application.registry.Object"
	 * @generated
	 */
	void setTaggedValue(EObject stereotypeApplication,
			EStructuralFeature structuralFeatureOfTaggedValue, Object newValue);

	/**
	 * <!-- begin-user-doc --> {@link IProfileFacade} is the facade for
	 * processing and creating {@link Profile profile} and
	 * {@link StereotypeApplication}s. <br />
	 * The {@link ProfileApplicationWrapper} delegates many method invocations
	 * to the facade, e.g, {@link #applyStereotype(Stereotype, EObject)},
	 * {@link #setTaggedValue(EObject, EStructuralFeature, Object)}, etc. <br />
	 * The facade offers actually more functionality. So, take look at it before
	 * you decide to implement it yourself.
	 * 
	 * @return The profile facade instance that can be used to manipulate this profile application. 
	 * <!-- end-user-doc -->
	 * 
	 * @model kind="operation" dataType=
	 *        "org.modelversioning.emfprofile.application.registry.IProfileFacade"
	 * @generated
	 */
	IProfileFacade getProfileFacade();

} // ProfileApplicationWrapper
