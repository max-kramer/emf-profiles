/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry;
import org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationAlreadyLoadedException;
import org.modelversioning.emfprofile.application.registry.exception.TraversingEObjectContainerChainException;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 *
 */
public class ProfileApplicationRegistryTest extends AbstractProfileApplicationRegistryTest {
	
	
	static Collection<Profile> profiles;
	private IFile testProfileApplicationFile;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		testProfileApplicationFile = getTestProfileApplicationFile();
		profiles = new ArrayList<>();
		profiles.add(profile);
	}

		
	@After
	public void deleteTestProfileApplicationResource() {
		deleteResource(TEST_PROFILE_APPLICATION);
	}
	

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationRegistryImpl#createNewProfileApplication(org.eclipse.emf.ecore.resource.ResourceSet, IFile, java.util.Collection)}.
	 * @throws IOException 
	 * @throws CoreException 
	 * @throws IllegalArgumentException
	 */
	@Test
	public final void testCreateNewProfileApplication_shouldCreateNewResourceInLocalFileSystem() throws IllegalArgumentException, CoreException, IOException {
		
		assertFalse(getTestProfileApplicationFile().exists());
		ProfileApplicationRegistry.INSTANCE.createNewProfileApplication(resourceSet, testProfileApplicationFile, profiles);
		assertTrue(getTestProfileApplicationFile().exists());
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationRegistryImpl#createNewProfileApplication(org.eclipse.emf.ecore.resource.ResourceSet, IFile, java.util.Collection)}.
	 * @throws IOException 
	 * @throws CoreException 
	 * @throws IllegalArgumentException
	 */
	@Test
	public final void testCreateNewProfileApplication_shouldThrowIllegalArgumentExceptionAndNotCreateResourceFile() throws CoreException, IOException {
		profiles.clear();
		try {
			ProfileApplicationRegistry.INSTANCE.createNewProfileApplication(resourceSet, testProfileApplicationFile, profiles);
			fail("Did not throw IllegalArgunmentException as expected!");
		} catch (IllegalArgumentException e) {
			assertFalse("The file should not exist!", getTestProfileApplicationFile().exists());
		} 
		
	}


	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationRegistryImpl#loadProfileApplication(org.eclipse.emf.ecore.resource.ResourceSet, IFile)}.
	 * @throws ProfileApplicationAlreadyLoadedException 
	 * @throws IOException 
	 * @throws CoreException 
	 */
	@Test
	public final void testLoadProfileApplication_shouldLoadExistingProfileApplicationResource() throws CoreException, IOException, ProfileApplicationAlreadyLoadedException {
		ProfileApplicationWrapper testPA = ProfileApplicationRegistry.INSTANCE.loadProfileApplication(resourceSet, getPrepearedProfileApplication());
		assertNotNull(testPA);
		assertEquals(4,testPA.getStereotypeApplications().size());
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationRegistryImpl#loadProfileApplication(org.eclipse.emf.ecore.resource.ResourceSet, IFile)}.
	 * @throws ProfileApplicationAlreadyLoadedException 
	 * @throws IOException 
	 * @throws CoreException 
	 */
	@Test()
	public final void testLoadProfileApplicationWithURIPointingToNonExistingResource_shouldThrowIOExceptionAndNotCreateFile() throws CoreException, ProfileApplicationAlreadyLoadedException {
		try {
			ProfileApplicationRegistry.INSTANCE.loadProfileApplication(resourceSet, getFileToResource(NON_EXISTING_RESOURCE));
			fail("Did not throw IOException as expected!");
		} catch (IOException e) {
			assertFalse(getFileToResource(NON_EXISTING_RESOURCE).exists());
		}
	}


	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationRegistryImpl#loadProfileApplication(org.eclipse.emf.ecore.resource.ResourceSet, IFile)}.
	 * @throws ProfileApplicationAlreadyLoadedException 
	 * @throws IOException 
	 * @throws CoreException 
	 */
	@Test(expected=IOException.class)
	public final void testLoadProfileApplicationWithUnreachableReferences_shouldThrowIOException() throws CoreException, IOException, ProfileApplicationAlreadyLoadedException {
		
		ProfileApplicationRegistry.INSTANCE.loadProfileApplication(resourceSet, getFileToResource(TEST_PROFILE_APPLICATION_WITH_UNREACHABLE_REFERENCES));
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationRegistryImpl#loadProfileApplication(org.eclipse.emf.ecore.resource.ResourceSet, IFile)}.
	 * @throws ProfileApplicationAlreadyLoadedException 
	 * @throws IOException 
	 * @throws CoreException 
	 */
	@Test
	public final void testLoadSameProfileApplicationResourceTwoTimes_shouldThrowProfileApplicationAlreadyLoadedException() throws CoreException, IOException, ProfileApplicationAlreadyLoadedException {
		try {
			assertNotNull(ProfileApplicationRegistry.INSTANCE.loadProfileApplication(resourceSet, getPrepearedProfileApplication()));
			assertNotNull(ProfileApplicationRegistry.INSTANCE.loadProfileApplication(resourceSet, getPrepearedProfileApplication()));
			fail("Did not throw ProfileApplicationAlreadyLoadedException as expected");
		} catch (ProfileApplicationAlreadyLoadedException e) {
			assertEquals(1, ProfileApplicationRegistry.INSTANCE.getProfileApplications(resourceSet).size());
		}
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationRegistryImpl#unloadProfileApplication(org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper)}.
	 * @throws IOException 
	 * @throws CoreException 
	 */
	@Test
	public final void testUnloadProfileApplication() throws CoreException, IOException {
		try {
			ProfileApplicationWrapper testProfileApplication = ProfileApplicationRegistry.INSTANCE.loadProfileApplication(resourceSet, getPrepearedProfileApplication());
			assertNotNull(testProfileApplication);
			assertEquals(1, ProfileApplicationRegistry.INSTANCE.getProfileApplications(resourceSet).size());
			ProfileApplicationRegistry.INSTANCE.unloadProfileApplication(testProfileApplication);
			assertEquals(0, ProfileApplicationRegistry.INSTANCE.getProfileApplications(resourceSet).size());
			ProfileApplicationRegistry.INSTANCE.loadProfileApplication(resourceSet, getPrepearedProfileApplication());
		} catch (ProfileApplicationAlreadyLoadedException e) {
			fail("The resource was not unloaded from registry: " + getPrepearedProfileApplication().toString());
		}
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationRegistryImpl#unloadAllProfileApplications(org.eclipse.emf.ecore.resource.ResourceSet)}.
	 * @throws IOException 
	 * @throws CoreException 
	 * @throws IllegalArgumentException 
	 * @throws ProfileApplicationAlreadyLoadedException 
	 */
	@Test
	public final void testUnloadAllProfileApplications() throws IllegalArgumentException, CoreException, IOException, ProfileApplicationAlreadyLoadedException {
		assertEquals(0, ProfileApplicationRegistry.INSTANCE.getProfileApplications(resourceSet).size());
		assertNotNull(ProfileApplicationRegistry.INSTANCE.createNewProfileApplication(resourceSet, getTestProfileApplicationFile(), profiles));
		assertEquals(1, ProfileApplicationRegistry.INSTANCE.getProfileApplications(resourceSet).size());
		assertNotNull(ProfileApplicationRegistry.INSTANCE.loadProfileApplication(resourceSet, getPrepearedProfileApplication()));
		assertEquals(2, ProfileApplicationRegistry.INSTANCE.getProfileApplications(resourceSet).size());
		ProfileApplicationRegistry.INSTANCE.unloadAllProfileApplications(resourceSet);
		assertEquals(0, ProfileApplicationRegistry.INSTANCE.getProfileApplications(resourceSet).size());
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationRegistryImpl#hasProfileApplications(org.eclipse.emf.ecore.resource.ResourceSet)}.
	 * @throws ProfileApplicationAlreadyLoadedException 
	 * @throws IOException 
	 * @throws CoreException 
	 */
	@Test
	public final void testHasProfileApplications() throws CoreException, IOException, ProfileApplicationAlreadyLoadedException {
		assertFalse(ProfileApplicationRegistry.INSTANCE.hasProfileApplications(resourceSet));
		assertNotNull(ProfileApplicationRegistry.INSTANCE.loadProfileApplication(resourceSet, getPrepearedProfileApplication()));
		assertTrue(ProfileApplicationRegistry.INSTANCE.hasProfileApplications(resourceSet));
		ProfileApplicationRegistry.INSTANCE.unloadAllProfileApplications(resourceSet);
		assertFalse(ProfileApplicationRegistry.INSTANCE.hasProfileApplications(resourceSet));
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationRegistryImpl#getProfileApplications(org.eclipse.emf.ecore.resource.ResourceSet)}.
	 * @throws ProfileApplicationAlreadyLoadedException 
	 * @throws IOException 
	 * @throws CoreException 
	 */
	@Test
	public final void testGetProfileApplications_shouldWork() throws CoreException, IOException, ProfileApplicationAlreadyLoadedException {
		assertTrue(ProfileApplicationRegistry.INSTANCE.getProfileApplications(resourceSet).isEmpty());
		assertNotNull(ProfileApplicationRegistry.INSTANCE.loadProfileApplication(resourceSet, getPrepearedProfileApplication()));
		assertFalse(ProfileApplicationRegistry.INSTANCE.getProfileApplications(resourceSet).isEmpty());
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationRegistryImpl#getProfileApplicationWrapperOfContainedEObject(org.eclipse.emf.ecore.resource.ResourceSet, org.eclipse.emf.ecore.EObject)}.
	 * @throws ProfileApplicationAlreadyLoadedException 
	 * @throws IOException 
	 * @throws CoreException 
	 * @throws TraversingEObjectContainerChainException 
	 * @throws IllegalArgumentException 
	 */
	@Test
	public final void testGetProfileApplicationWrapperOfContainedEObject_shouldWork() throws CoreException, IOException, ProfileApplicationAlreadyLoadedException, IllegalArgumentException, TraversingEObjectContainerChainException {
		ProfileApplicationWrapper testPA = ProfileApplicationRegistry.INSTANCE.loadProfileApplication(resourceSet, getPrepearedProfileApplication());
		assertNotNull(testPA);
		EObject testEObject = getSomeChildOfStereotype(testPA);
		assertNotNull(testEObject);
		assertEquals(testPA, ProfileApplicationRegistry.INSTANCE.getProfileApplicationWrapperOfContainedEObject(resourceSet, testEObject));
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationRegistryImpl#getProfileApplicationWrapperOfContainedEObject(org.eclipse.emf.ecore.resource.ResourceSet, org.eclipse.emf.ecore.EObject)}.
	 * @throws ProfileApplicationAlreadyLoadedException 
	 * @throws IOException 
	 * @throws CoreException 
	 * @throws TraversingEObjectContainerChainException 
	 * @throws IllegalArgumentException 
	 */
	@Test(expected=IllegalArgumentException.class)
	public final void testGetProfileApplicationWrapperOfContainedEObject_shouldThrownIllegalArgumentExceptionForUnknownResourceSet() throws CoreException, IOException, ProfileApplicationAlreadyLoadedException, IllegalArgumentException, TraversingEObjectContainerChainException {
		ProfileApplicationWrapper testPA = ProfileApplicationRegistry.INSTANCE.loadProfileApplication(resourceSet, getPrepearedProfileApplication());
		assertNotNull(testPA);
		EObject testEObject = getSomeChildOfStereotype(testPA);
		assertNotNull(testEObject);
		ProfileApplicationRegistry.INSTANCE.getProfileApplicationWrapperOfContainedEObject(new ResourceSetImpl(), testEObject);
		fail("Did not throw an IllegalArgumentException for unknown ResourceSet as expected!");
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationRegistryImpl#getProfileApplicationWrapperOfContainedEObject(org.eclipse.emf.ecore.resource.ResourceSet, org.eclipse.emf.ecore.EObject)}.
	 * @throws ProfileApplicationAlreadyLoadedException 
	 * @throws IOException 
	 * @throws CoreException 
	 * @throws TraversingEObjectContainerChainException 
	 * @throws IllegalArgumentException 
	 */
	@Test(expected=TraversingEObjectContainerChainException.class)
	public final void testGetProfileApplicationWrapperOfContainedEObject_shouldThrownTraversingEObjectContainerChainException() throws CoreException, IOException, ProfileApplicationAlreadyLoadedException, IllegalArgumentException, TraversingEObjectContainerChainException {
		ProfileApplicationWrapper testPA = ProfileApplicationRegistry.INSTANCE.loadProfileApplication(resourceSet, getPrepearedProfileApplication());
		assertNotNull(testPA);
		EObject testEObject = getSomeChildOfStereotype(testPA); // it is an object of EClass type named 'Comment'
		assertNotNull(testEObject);
		assertTrue(testEObject.eContainer().eContainer() instanceof StereotypeApplication);
		// removing a stereotype-application object which is a grand parent of the Comment object
		testPA.removeEObject(testEObject.eContainer().eContainer());
		ProfileApplicationRegistry.INSTANCE.getProfileApplicationWrapperOfContainedEObject(resourceSet, testEObject);
		fail("Did not throw an TraversingEObjectContainerChainException as expected!");
	}

	private EObject getSomeChildOfStereotype(ProfileApplicationWrapper profileApplication) {
		for (StereotypeApplication sa : profileApplication.getStereotypeApplications()) {
			for (EObject obj : sa.eContents()) {
				for (EObject o : obj.eContents()) {
					return o;
				}
			}
		}
		return null;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
