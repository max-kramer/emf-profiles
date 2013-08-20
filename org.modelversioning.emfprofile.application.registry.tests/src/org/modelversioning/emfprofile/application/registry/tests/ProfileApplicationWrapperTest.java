/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.tests;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper;
import org.modelversioning.emfprofileapplication.StereotypeApplicability;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 *
 */
public class ProfileApplicationWrapperTest extends
		AbstractProfileApplicationRegistryTest {
	
	private static final String EXPECTED_PAW_NAME = "EJB_Profile - ProfileApplicationRegistryTest/model/application_test.pa.xmi";
	private static final String EXPECTED_PROFILE_NAME = "EJB_Profile";

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
	public final void testGetProfileApplicationFile_shouldExist() {
		IFile pawFile = paw.getProfileApplicationIFile();
		assertThat(pawFile, notNullValue());
		assertThat(pawFile.exists(), is(true));
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationWrapperImpl#getProfileApplicationResource()}.
	 */
	@Test
	public final void testGetProfileApplicationResource_shouldBeLoaded() {
		Resource resource = paw.getProfileApplicationResource();
		assertThat(resource, notNullValue());
		assertThat(resource.isLoaded(), is(true));
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationWrapperImpl#getName()}.
	 */
	@Test
	public final void testGetName() {
		assertThat(paw.getName(), equalTo(ProfileApplicationWrapperTest.EXPECTED_PAW_NAME));
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationWrapperImpl#getProfileName()}.
	 */
	@Test
	public final void testGetProfileName() {
		assertThat(paw.getProfileName(), equalTo(ProfileApplicationWrapperTest.EXPECTED_PROFILE_NAME));
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationWrapperImpl#unload()}.
	 */
	@Test
	public final void testUnload() {
		Resource resource = paw.getProfileApplicationResource();
		assertThat(resource, notNullValue());
		assertThat(resource.isLoaded(), is(true));
		paw.unload();
		assertThat(resource.isLoaded(), is(false));
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationWrapperImpl#save()}.
	 * @throws CoreException 
	 * @throws IOException 
	 */
	@Test
	public final void testSave_shouldSetDirtyStatusToFalse() throws IOException, CoreException {
		assertThat(paw.isDirty(), is(true));
		paw.save();
		assertThat(paw.isDirty(), is(false));
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationWrapperImpl#getApplicableStereotypes(org.eclipse.emf.ecore.EObject)}.
	 */
	@Test
	public final void testGetApplicableStereotypesForPersonModel_shouldReturnTwoApplicableStereotypes() {
		EList<StereotypeApplicability> applicableStereotypes = paw.getApplicableStereotypes(getModelPersonEClass());
		assertThat(applicableStereotypes.size(), is(2));
	}

	/**
	 * Test method for {@link org.modelversioning.emfprofile.application.registry.internal.ProfileApplicationWrapperImpl#applyStereotype(org.modelversioning.emfprofileapplication.StereotypeApplicability, org.eclipse.emf.ecore.EObject)}.
	 */
	@Test
	public final void testApplyStereotype_shouldWork() {
		EObject person = getModelPersonEClass();
		assertThat(person, notNullValue());
		StereotypeApplicability stereotypeApplicability = paw.getApplicableStereotypes(person).iterator().next();
		assertThat(stereotypeApplicability, notNullValue());
		assertThat(paw.getStereotypeApplications().size(), is(0));
		StereotypeApplication stereotypeApplication = paw.applyStereotype(stereotypeApplicability, person);
		assertThat(stereotypeApplication, notNullValue());
		assertThat(paw.getStereotypeApplications().size(), is(1));
	}

}
