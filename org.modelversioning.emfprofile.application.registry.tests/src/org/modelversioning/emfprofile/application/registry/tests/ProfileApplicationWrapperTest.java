/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 *
 */
public class ProfileApplicationWrapperTest extends
		AbstractProfileApplicationRegistryTest {

	private ProfileApplicationWrapper paw = null;
	Set<Profile> profiles = new HashSet<>();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		AbstractProfileApplicationRegistryTest.setUpBeforeClass();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		AbstractProfileApplicationRegistryTest.tearDownAfterClass();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void initializeProfileApplicationWrapper() throws Exception {
		profiles.add(profile);
		paw = ProfileApplicationRegistry.INSTANCE.getProfileApplicationManager(resourceSet).createNewProfileApplication(getFileToResource(TEST_PROFILE_APPLICATION), profiles);
		assertThat(paw, notNullValue());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDownProfileApplicationWrapper() throws Exception {
		deleteResource(TEST_PROFILE_APPLICATION);
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationWrapperImpl#isDirty()}.
	 */
	@Test
	public final void testIsDirtyAfterCreation_shouldBeDirty() {
		assertThat(paw.isDirty(), is(true));
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationWrapperImpl#getProfileApplicationFile()}.
	 */
	@Test
	public final void testGetProfileApplicationFile() {
		IFile pawFile = paw.getProfileApplicationIFile();
		assertThat(pawFile.exists(), is(true));
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationWrapperImpl#getProfileApplicationResource()}.
	 */
	@Test
	public final void testGetProfileApplicationResource() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationWrapperImpl#getName()}.
	 */
	@Test
	public final void testGetName() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationWrapperImpl#getProfileName()}.
	 */
	@Test
	public final void testGetProfileName() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationWrapperImpl#unload()}.
	 */
	@Test
	public final void testUnload() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationWrapperImpl#save()}.
	 */
	@Test
	public final void testSave() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationWrapperImpl#getApplicableStereotypes(org.eclipse.emf.ecore.EObject)}.
	 */
	@Test
	public final void testGetApplicableStereotypes() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationWrapperImpl#applyStereotype(org.modelversioning.emfprofileapplication.StereotypeApplicability, org.eclipse.emf.ecore.EObject)}.
	 */
	@Test
	public final void testApplyStereotype() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationWrapperImpl#addNestedEObject(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject)}.
	 */
	@Test
	public final void testAddNestedEObject() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationWrapperImpl#removeEObject(org.eclipse.emf.ecore.EObject)}.
	 */
	@Test
	public final void testRemoveEObject() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationWrapperImpl#getStereotypeApplications()}.
	 */
	@Test
	public final void testGetStereotypeApplications() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationWrapperImpl#getStereotypeApplications(org.eclipse.emf.ecore.EObject)}.
	 */
	@Test
	public final void testGetStereotypeApplicationsEObject() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationWrapperImpl#getProfileApplicationUnwrapped()}.
	 */
	@Test
	public final void testGetProfileApplicationUnwrapped() {
		fail("Not yet implemented"); // TODO
	}

}
