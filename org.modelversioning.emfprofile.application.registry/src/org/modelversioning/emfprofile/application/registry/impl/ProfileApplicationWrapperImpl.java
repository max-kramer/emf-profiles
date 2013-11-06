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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.modelversioning.emfprofile.IProfileFacade;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.Stereotype;
import org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper;
import org.modelversioning.emfprofile.application.registry.decoration.DecorationDescriptionsReader;
import org.modelversioning.emfprofile.application.registry.exception.ReadingDecorationDescriptionsException;
import org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage;
import org.modelversioning.emfprofile.impl.ProfileFacadeImpl;
import org.modelversioning.emfprofileapplication.EMFProfileApplicationPackage;
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
	 * <em>Profile Application</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	private EMFProfileApplicationDecorator decorator = new SimpleEMFProfileApplicationDecorator();

	public void setDecorator(EMFProfileApplicationDecorator decorator)
			throws ReadingDecorationDescriptionsException {
		this.decorator = decorator;
		Profile profile = profiles.iterator().next();
		DecorationDescriptionsReader decorationDescriptionsReader = new DecorationDescriptionsReader(
				profile);
		System.out.println("Setting decorator, profile resource uri: "
				+ profile.eResource().getURI());
		// decorate for already applied stereotypes, e.g. when loading
		for (StereotypeApplication stereotypeApplication : profileApplication
				.getStereotypeApplications()) {
			// TODO
			// decorator.decorate(stereotypeApplication);
		}
	}

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
		registerModelNotificationsObserver();
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
		registerModelNotificationsObserver();
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
	 * Attaches the {@link ModelNotificationsObserver} at the
	 * {@link ProfileApplication} to observe all changes of it and its
	 * descendant objects.
	 */
	private void registerModelNotificationsObserver() {
		getProfileApplication().eAdapters().add(
				new ModelNotificationsObserver());
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
		if (profileApplication != null && profileApplication.eIsProxy()) {
			InternalEObject oldProfileApplication = (InternalEObject) profileApplication;
			profileApplication = (ProfileApplication) eResolveProxy(oldProfileApplication);
			if (profileApplication != oldProfileApplication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_WRAPPER__PROFILE_APPLICATION,
							oldProfileApplication, profileApplication));
			}
		}
		return profileApplication;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProfileApplication basicGetProfileApplication() {
		return profileApplication;
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
		sendNotificationToUpdateProfileApplicationWrapperInViewer();
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EMFProfileApplicationRegistryPackage.PROFILE_APPLICATION_WRAPPER__PROFILE_APPLICATION:
			if (resolve)
				return getProfileApplication();
			return basicGetProfileApplication();
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

	/**
	 * 
	 */
	private void sendNotificationToRefreshProfileApplicationWrapperInViewer() {
		eNotify(new ENotificationImpl(
				ProfileApplicationWrapperImpl.this,
				Notification.SET,
				EMFProfileApplicationRegistryPackage.REFRESH_AND_UPDATE__PROFILE_APPLICATION_WRAPPER,
				null, null));
	}

	/**
	 * 
	 */
	private void sendNotificationToUpdateProfileApplicationWrapperInViewer() {
		eNotify(new ENotificationImpl(
				ProfileApplicationWrapperImpl.this,
				Notification.SET,
				EMFProfileApplicationRegistryPackage.UPDATE__PROFILE_APPLICATION_WRAPPER,
				null, null));
	}

	/* ///////// NOTIFICATIONS /////////// */

	/**
	 * Is used to listen for all model changes under {@link ProfileApplication}.
	 * 
	 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
	 * 
	 */
	class ModelNotificationsObserver extends EContentAdapter {

		/*
		 * PA ... ProfileApplication
		 * 
		 * SA ... StereotypeApplication
		 * 
		 * 
		 * Notifier | Event | Feature | oldValue | newValue | should notify
		 * decorator? --> (comment)
		 * 
		 * 
		 * NOTIFICATIONS:
		 * 
		 * 0: ignore event-type REMOVING_ADAPTER
		 * 
		 * 1: PA | ADD/REMOVE | stereotypeApplications | null | SA | Yes -->
		 * (for Add decorate, for Remove undecorate). For Add we have to wait
		 * until the applied to was set. So, ADD must be handled differently.
		 * 
		 * 2: SA | SET | EAttribute(appliedTo/extension) | null | some-object |
		 * No --> (they come when SA created, handled by 1.)
		 * 
		 * 3: SA | SET | EAttribute(appliedTo/extension) | null/object |
		 * null/object | No -->(will be ignored because these should not be
		 * played with, like e.g., in properties view)
		 * 
		 * 4: SA | SET | EReference(profileApplication) | PA | null | No -->
		 * (comes when stereotype removed, handled by 1.)
		 * 
		 * 5: SA | SET | EAttribute | any | any | Yes --> (the attribute of a
		 * stereotype has changed, relevant for decoration)
		 * 
		 * 6: SA | SET/ADD | EReference | any | any | No --> (ignoring the
		 * changes in contained objects, not relevant for decoration. This also
		 * handles 4.)
		 * 
		 * 7: other | any | any | any | any | No --> (ignoring objects that are
		 * children, grand children, etc., from stereotype applications, not
		 * relevant for decorations)
		 * 
		 * ----------------------------------
		 * 
		 * implementation only needs to check for those scenarios (1,5) that
		 * should send notifications to decorators, all other incoming
		 * notifications can be swallowed or at least guards against them must
		 * be implemented.
		 */

		@Override
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
			// in any case with every incoming notification there has to be a
			// change in the model, so notification to update the profile
			// application wrapper in the viewer is desired.
			sendNotificationToUpdateProfileApplicationWrapperInViewer();

			/* ***** Handling Notifications ***** */
			Object notifier = notification.getNotifier();
			if (notifier instanceof ProfileApplication) {
				System.out.println("PROFILE APPLICATION: "
						+ notification.toString());
				// structural change, must refresh
				sendNotificationToRefreshProfileApplicationWrapperInViewer();
				if (Notification.ADD == notification.getEventType()) {
					// NOTE: at this moment the stereotype application does not
					// have the 'appliedTo' property set, so we have to wait
					// until that notification comes in order to trigger the
					// decorator to decorate!

					// decorator.decorate((StereotypeApplication) notification
					// .getNewValue());
				} else if (Notification.REMOVE == notification.getEventType()) {
					// TODO
					// decorator.undecorate((StereotypeApplication) notification
					// .getOldValue());
				}
				// ignore all other event types
				return;
			} else if (notifier instanceof StereotypeApplication) {
				System.out.println("STEREOTYPE APPLICATION: "
						+ notification.toString());
				if (Notification.SET == notification.getEventType()) {
					// for every attribute set
					if (notification.getFeature() instanceof EAttribute) {
						// TODO
						// decorator.decorate((StereotypeApplication) notifier);
					}
					// if the reference 'appliedTo' was set
					if (EMFProfileApplicationPackage.eINSTANCE
							.getStereotypeApplication_AppliedTo().equals(
									notification.getFeature())) {
						// TODO
						// decorator.decorate((StereotypeApplication) notifier);
					}
				}
				// ignore other
				return;
			}
			// All other notifications will be ignored
			System.out.println("TOTAL NOTIFIER: " + notification.toString());
		}
	}

} // ProfileApplicationWrapperImpl
