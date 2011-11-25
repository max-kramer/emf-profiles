/**
 * <copyright>
 *
 * Copyright (c) 2010 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * </copyright>
 */

package org.modelversioning.emfprofile;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.resource.Resource;
import org.modelversioning.emfprofileapplication.EMFProfileApplicationFactory;
import org.modelversioning.emfprofileapplication.EMFProfileApplicationPackage;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * Interface for the facade to process and create profile and
 * {@link StereotypeApplication}s.
 * 
 * @author <a href="mailto:langer@big.tuwien.ac.at">Philip Langer</a>
 * 
 */
public interface IProfileFacade {

	/**
	 * The {@link EMFProfilePackage} instance.
	 */
	static final EMFProfilePackage EMF_PROFILE_PACKAGE = EMFProfilePackage.eINSTANCE;
	/**
	 * The {@link EMFProfileFactory} instance
	 */
	static final EMFProfileFactory EMF_PROFILE_FACTORY = EMFProfileFactory.eINSTANCE;
	/**
	 * The {@link EMFProfileApplicationPackage} instance.
	 */
	static final EMFProfileApplicationFactory EMF_PROFILE_APPLICATION_FACTORY = EMFProfileApplicationFactory.eINSTANCE;
	/**
	 * The {@link EMFProfileApplicationPackage} instance.
	 */
	static final EMFProfileApplicationPackage EMF_PROFILE_APPLICATION_PACKAGE = EMFProfileApplicationPackage.eINSTANCE;
	/**
	 * The {@link ProfileApplication} {@link EClass}.
	 */
	static final EClass PROFILE_APPLICATION_ECLASS = EMF_PROFILE_APPLICATION_PACKAGE
			.getProfileApplication();
	/**
	 * The {@link StereotypeApplication} {@link EClass}.
	 */
	static final EClass STEREOTYPE_APPLICATION_ECLASS = EMF_PROFILE_APPLICATION_PACKAGE
			.getStereotypeApplication();
	/**
	 * The {@link EReference} used to apply stereotypes.
	 */
	static final EReference STEREOTYPE_APPLICATION_APPLIED_TO_REFERENCE = EMF_PROFILE_APPLICATION_PACKAGE
			.getStereotypeApplication_AppliedTo();

	/**
	 * <p>
	 * Turns the specified <code>profile</code> into an applicable profile.
	 * </p>
	 * 
	 * <p>
	 * This method can be called without being initialized by loading a
	 * {@link Profile} of an application.
	 * </p>
	 * 
	 * @param profile
	 *            to turn into an applicable profile.
	 */
	void makeApplicable(Profile profile);

	/**
	 * Loads the specified <code>profile</code>.
	 * 
	 * @param profile
	 *            the {@link Profile} to load.
	 */
	void loadProfile(Profile profile);

	/**
	 * Unloads the specified <code>profile</code>.
	 * 
	 * @param profile
	 *            the {@link Profile} to unload.
	 */
	void unloadProfile(Profile profile);

	/**
	 * Loads all {@link Profile}s contained by the specified
	 * <code>resource</code>.
	 * 
	 * @param resource
	 *            containing the profiles to be loaded.
	 */
	void loadProfiles(Resource resource);

	/**
	 * Loads the specified <code>profiles</code>.
	 * 
	 * @param profiles
	 *            the {@link Profile}s to be loaded.
	 */
	void loadProfiles(EList<Profile> profiles);

	/**
	 * Returns the list of currently loaded {@link Profile}s.
	 * 
	 * @return the list of currently loaded {@link Profile}s.
	 */
	EList<Profile> getLoadedProfiles();

	/**
	 * Sets the {@link Resource} containing the profile application.
	 * 
	 * <p>
	 * The specified <code>resource</code> can be empty, if you want to create a
	 * new profile application.
	 * </p>
	 * 
	 * @param resource
	 *            to set.
	 * @throws IOException
	 *             if loading to resource fails.
	 */
	void setProfileApplicationResource(Resource resource) throws IOException;

	/**
	 * Returns the list of applicable stereotype for the specified type in
	 * <code>eClass</code>.
	 * 
	 * @param eClass
	 *            to get applicable stereotype for.
	 * @return the list of applicable {@link Stereotype}s.
	 */
	EList<Stereotype> getApplicableStereotypes(EClass eClass);

	/**
	 * Returns the list of applicable stereotype for the specified
	 * <code>eObject</code>.
	 * 
	 * @param eObject
	 *            to get applicable stereotype for.
	 * @return the list of applicable {@link Stereotype}s.
	 */
	EList<Stereotype> getApplicableStereotypes(EObject eObject);

	/**
	 * Applies the specified <code>stereotype</code> to the specified
	 * <code>eObject</code>.
	 * 
	 * <p>
	 * This method creates a new instance of the specified {@link Stereotype}
	 * and adds it to the currently set profile application resource (cf.
	 * {@link #setProfileApplicationResource(Resource)}). If no resource is
	 * currently set, this method throws an {@link IllegalStateException}.
	 * </p>
	 * 
	 * @param stereotype
	 *            to apply.
	 * @param eObject
	 *            to apply the <code>stereotype</code> to.
	 * @return the created instance of the {@link Stereotype}.
	 */
	StereotypeApplication apply(Stereotype stereotype, EObject eObject);

	/**
	 * Applies the specified <code>stereotype</code> to the specified list of
	 * <code>eObjects</code>.
	 * 
	 * <p>
	 * This method creates a new instance of the specified {@link Stereotype}
	 * and adds it to the {@link #setProfileApplicationResource(Resource)
	 * currently set profile application resource}. If no resource is currently
	 * set, this method throws an {@link IllegalStateException}.
	 * </p>
	 * 
	 * @param stereotype
	 *            to apply.
	 * @param eObjects
	 *            to apply the <code>stereotype</code> to.
	 * @return the created instance of the {@link Stereotype}.
	 */
	StereotypeApplication apply(Stereotype stereotype, EList<EObject> eObjects);

	/**
	 * Applies the specified existing <code>stereotypeApplication</code> to the
	 * specified <code>eObject</code>.
	 * 
	 * <p>
	 * This method adds the specified <code>eObject</code> to the objects to
	 * which the specified {@link StereotypeApplication} is applied.
	 * </p>
	 * 
	 * @param stereotypeApplication
	 *            to apply.
	 * @param eObject
	 *            to apply the <code>stereotypeApplication</code> to.
	 */
	void apply(StereotypeApplication stereotypeApplication, EObject eObject);

	/**
	 * Applies the specified existing <code>stereotypeApplication</code> to the
	 * specified list of <code>eObjects</code>.
	 * 
	 * <p>
	 * This method adds the specified list of <code>eObjects</code> to the
	 * objects to which the specified {@link StereotypeApplication} is applied.
	 * </p>
	 * 
	 * @param stereotypeApplication
	 *            to apply.
	 * @param eObjects
	 *            to apply the <code>stereotypeApplication</code> to.
	 */
	void apply(StereotypeApplication stereotypeApplication,
			EList<EObject> eObjects);

	/**
	 * Returns all {@link StereotypeApplication StereotypeApplications} handled
	 * by this facade.
	 * 
	 * @return all {@link StereotypeApplication StereotypeApplications}
	 */
	EList<StereotypeApplication> getStereotypeApplications();

	/**
	 * Returns all stereotypes currently applied to the specified
	 * <code>eObject</code> (list of {@link StereotypeApplication}s).
	 * 
	 * @param eObject
	 *            to get applied stereotypes for.
	 * @return the list of {@link StereotypeApplication}s.
	 */
	EList<StereotypeApplication> getAppliedStereotypes(EObject eObject);

	/**
	 * Returns the list of {@link EStructuralFeature}s that can be set for the
	 * specified <code>stereotype</code>.
	 * 
	 * @param stereotype
	 *            to get {@link EStructuralFeature}s for.
	 * @return the list of settable {@link EStructuralFeature}s.
	 */
	EList<EStructuralFeature> getStereotypeFeatures(Stereotype stereotype);

	/**
	 * Returns the value of the given <code>feature</code> of the given
	 * <code>stereotypeApplication</code>.
	 * 
	 * <p>
	 * If the feature is {@link ETypedElement#isMany() many-valued}, the result
	 * will be an {@link EList} and each object in the list will be
	 * {@link EClassifier#isInstance an instance of} the feature's
	 * {@link ETypedElement#getEType() type}; the list's contents are <b>not</b>
	 * affected by <code>resolve</code> argument. Otherwise the result directly
	 * will be an instance of the feature's type; if it is a {@link #eIsProxy
	 * proxy}, it is resolved.
	 * </p>
	 * 
	 * @param stereotypeApplication
	 *            to get feature value for.
	 * @param feature
	 *            the feature of the value to fetch.
	 * @return the value of the given feature of the object.
	 */
	Object getStereotypeApplicationFeatureValue(EObject stereotypeApplication,
			EStructuralFeature feature);

	/**
	 * Sets the value of the given <code>feature</code> of the
	 * <code>stereotypeApplication</code> to the new value.
	 * <p>
	 * If the feature is {@link ETypedElement#isMany() many-valued}, the new
	 * value must be an {@link EList} and each object in that list must be
	 * {@link EClassifier#isInstance an instance of} the feature's
	 * {@link ETypedElement#getEType() type}; the existing contents are cleared
	 * and the contents of the new value are added. However, if the new value is
	 * the content list itself, or is modified as a side effect of modifying the
	 * content list (i.e., if it is a view on the content list), the behavior is
	 * undefined and will likely result in simply clearing the list. If the
	 * feature is single-valued, the new value directly must be an instance of
	 * the feature's type and it becomes the new value of the feature of the
	 * object. If the feature is {@link EStructuralFeature#isUnsettable()
	 * unsettable}, the modeled state becomes set; otherwise, the feature may
	 * still not considered {@link #eIsSet set} if the new value is the same as
	 * the default.
	 * 
	 * @param stereotypeApplication
	 *            to set feature value.
	 * @param feature
	 *            the feature of the value to set.
	 * @param newValue
	 *            the value to set.
	 * 
	 * @exception IllegalArgumentException
	 *                if the feature is not one the {@link #eClass meta class}'s
	 *                {@link EClass#getEAllStructuralFeatures features}, or it
	 *                isn't {@link EStructuralFeature#isChangeable changeable}.
	 * @exception ClassCastException
	 *                if there is a type conflict.
	 * @exception ArrayStoreException
	 *                if there is a type conflict.
	 */
	void setStereotypeApplicationFeatureValue(EObject stereotypeApplication,
			EStructuralFeature feature, Object newValue);

	/**
	 * Saves the currently set profile application resource.
	 * 
	 * @throws IOException
	 *             if writing to file fails.
	 */
	void save() throws IOException;

	/**
	 * Unloads this facade.
	 */
	void unload();

	/**
	 * Removes the specified {@link StereotypeApplication}.
	 * 
	 * @param stereotypeApplication
	 *            stereotype application to remove.
	 */
	void removeStereotypeApplication(StereotypeApplication stereotypeApplication);

}