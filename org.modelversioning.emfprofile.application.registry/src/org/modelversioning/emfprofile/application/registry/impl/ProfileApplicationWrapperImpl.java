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
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.modelversioning.emfprofile.IProfileFacade;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.Stereotype;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper;
import org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage;
import org.modelversioning.emfprofile.impl.ProfileFacadeImpl;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.modelversioning.emfprofileapplication.StereotypeApplicability;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Profile Application Wrapper</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.modelversioning.emfprofile.application.registry.impl.ProfileApplicationWrapperImpl#getProfileApplication
 * <em>Profile Application</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ProfileApplicationWrapperImpl extends MinimalEObjectImpl.Container
		implements ProfileApplicationWrapper {
	/**
	 * The cached value of the '{@link #getProfileApplication()
	 * <em>Profile Application</em>}' containment reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getProfileApplication()
	 * @generated
	 * @ordered
	 */
	protected ProfileApplication profileApplication;
	private final IProfileFacade facade;
	private final ResourceSet resourceSet;
	private final IFile profileApplicationFile;
	private final Collection<Profile> profiles;
	private final Resource resource;

	/**
	 */
	protected ProfileApplicationWrapperImpl() {
		super();
		throw new UnsupportedOperationException();
	}

	/**
	 * constructor which creates new profile application
	 * 
	 * @param resourceSet
	 * @param profileApplicationFile
	 * @param profiles
	 * @throws IOException
	 * @throws CoreException
	 */
	protected ProfileApplicationWrapperImpl(ResourceSet resourceSet,
			IFile profileApplicationFile, Collection<Profile> profiles)
			throws CoreException, IOException {
		this.profileApplicationFile = profileApplicationFile;

		this.resourceSet = resourceSet;
		this.facade = createAndInitializeProfileFacade(profileApplicationFile,
				profiles);
		this.profiles = facade.getLoadedProfiles();
		this.resource = facade.getProfileApplicationResource();
		setProfileApplicationInternal(facade.getProfileApplications().get(0));
	}

	/**
	 * constructor which loads existing profile application
	 * 
	 * @param resourceSet
	 * @param profileApplicationFile
	 * @throws IOException
	 * @throws CoreException
	 */
	protected ProfileApplicationWrapperImpl(ResourceSet resourceSet,
			IFile profileApplicationFile) throws CoreException, IOException {
		this.profileApplicationFile = profileApplicationFile;
		this.resourceSet = resourceSet;
		this.facade = loadProfileApplication(profileApplicationFile);
		if (facade.getProfileApplications().isEmpty()) {
			throw new IOException("The resource at "
					+ profileApplicationFile.toString()
					+ ", does not contain any profile applications.");
		}
		this.profiles = facade.getLoadedProfiles();
		this.resource = facade.getProfileApplicationResource();
		setProfileApplicationInternal(facade.getProfileApplications().get(0));
	}

	/**
	 * Creates new profiles application
	 * 
	 * @param profileApplicationFile
	 * @param profiles
	 * @return
	 * @throws CoreException
	 * @throws IOException
	 */
	private IProfileFacade createAndInitializeProfileFacade(
			IFile profileApplicationFile, Collection<Profile> profiles)
			throws CoreException, IOException {
		IProfileFacade facade = createNewProfileFacade(profileApplicationFile);
		facade.loadProfiles(profiles);
		profileApplicationFile.refreshLocal(IFile.DEPTH_ZERO,
				new NullProgressMonitor());

		return facade;
	}

	/**
	 * Creates new instance of {@link IProfileFacade}
	 * 
	 * @param profileApplicationFile
	 * @return
	 * @throws IOException
	 */
	private IProfileFacade createNewProfileFacade(IFile profileApplicationFile)
			throws IOException {
		IProfileFacade facade = new ProfileFacadeImpl();
		facade.loadProfileApplication(profileApplicationFile, resourceSet);
		return facade;
	}

	/**
	 * Loads an existing profiles application.
	 * 
	 * @param profileApplicationFile
	 *            to load.
	 * @return
	 * @throws CoreException
	 * @throws IOException
	 */
	private IProfileFacade loadProfileApplication(IFile profileApplicationFile)
			throws CoreException, IOException {
		profileApplicationFile.refreshLocal(IFile.DEPTH_ONE,
				new NullProgressMonitor());
		IProfileFacade facade = createNewProfileFacade(profileApplicationFile);
		return facade;
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFProfileApplicationRegistryPackage.Literals.PROFILE_APPLICATION_WRAPPER;
	}

	/**
	 * @generated
	 */
	public ProfileApplication getProfileApplication() {
		return profileApplication;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetProfileApplication(
			ProfileApplication newProfileApplication, NotificationChain msgs) {
		ProfileApplication oldProfileApplication = profileApplication;
		profileApplication = newProfileApplication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
					this,
					Notification.SET,
					EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_WRAPPER__PROFILE_APPLICATION,
					oldProfileApplication, newProfileApplication);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * This method always throws UnsupportedOperationException !
	 */
	public void setProfileApplication(ProfileApplication newProfileApplication) {
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Called by the construction of the wrapper.
	 */
	private void setProfileApplicationInternal(
			ProfileApplication newProfileApplication) {
		ProfileApplication oldProfileApplication = profileApplication;
		profileApplication = newProfileApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_WRAPPER__PROFILE_APPLICATION,
					oldProfileApplication, profileApplication));
	}

	/**
	 */
	public EList<StereotypeApplication> getStereotypeApplications() {
		return facade.getStereotypeApplications();
	}

	/**
	 */
	public EList<StereotypeApplication> getStereotypeApplications(
			EObject eObject) {
		return facade.getAppliedStereotypes(eObject);
	}

	/**
	 */
	public EList<StereotypeApplication> getStereotypeApplications(
			EObject eObject, Stereotype stereotype) {
		return profileApplication
				.getStereotypeApplications(eObject, stereotype);
	}

	/**
	 */
	public EList<EObject> getAnnotatedObjects() {
		return profileApplication.getAnnotatedObjects();
	}

	/**
	 */
	public EObject addNestedEObject(EObject container, EReference reference,
			EObject eObject) {
		return facade.addNestedEObject(container, reference, eObject);
	}

	/**
	 */
	public StereotypeApplication applyStereotype(
			StereotypeApplicability stereotypeApplicability, EObject eObject) {
		return facade.apply(stereotypeApplicability, eObject);
	}

	/**
	 */
	public EList<StereotypeApplicability> getApplicableStereotypes(
			EObject eObject) {
		return facade.getApplicableStereotypes(eObject);
	}

	/**
	 */
	public String getName() {
		String result = "";
		Collection<Profile> profiles = facade.getLoadedProfiles();
		Iterator<Profile> iter = profiles.iterator();
		while (iter.hasNext()) {
			result += iter.next().getName();
			if (iter.hasNext())
				result += ", ";
		}
		return result
				+ " - "
				+ profileApplicationFile
						.getLocation()
						.makeRelativeTo(
								ResourcesPlugin.getWorkspace().getRoot()
										.getLocation()).toString();
	}

	/**
	 */
	public String getProfileName() {
		return profiles.iterator().next().getName();
	}

	/**
	 * <!-- begin-user-doc --> Return the modification status of the underlying
	 * resource. <!-- end-user-doc -->
	 * 
	 */
	public boolean isDirty() {
		return this.resource.isModified();
	}

	/**
	 */
	public EObject removeEObject(EObject eObject) {
		return facade.removeEObject(eObject);
	}

	/**
	 */
	public void save() throws IOException, CoreException {
		facade.save();
	}

	/**
	 */
	public IFile getProfileApplicationIFile() {
		return this.profileApplicationFile;
	}

	/**
	 */
	public Resource getProfileApplicationResource() {
		return this.resource;
	}

	/**
	 */
	public void unload() {
		// first remove the reference from profile application manager
		ProfileApplicationManagerImpl pam = (ProfileApplicationManagerImpl) this
				.eContainer();
		pam.removeProfileApplication(this);

		// At the moment the IProfileFacade#unload() does nothing
		// the code for unloading resource should be moved to the facade
		// TODO investigate moving to code to the #unload() method of the
		// IProfileFacade
		getProfileApplicationResource().unload();
		facade.unload();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_WRAPPER__PROFILE_APPLICATION:
			return basicSetProfileApplication(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_WRAPPER__PROFILE_APPLICATION:
			return getProfileApplication();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_WRAPPER__PROFILE_APPLICATION:
			setProfileApplication((ProfileApplication) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_WRAPPER__PROFILE_APPLICATION:
			setProfileApplication((ProfileApplication) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_WRAPPER__PROFILE_APPLICATION:
			return profileApplication != null;
		}
		return super.eIsSet(featureID);
	}

} // ProfileApplicationWrapperImpl
