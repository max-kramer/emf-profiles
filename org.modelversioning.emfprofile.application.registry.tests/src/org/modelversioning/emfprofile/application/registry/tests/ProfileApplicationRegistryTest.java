/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationManager;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry;
import org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationDecoratorNotFoundException;
import org.modelversioning.emfprofile.application.registry.exception.ReadingDecorationDescriptionsException;
import org.modelversioning.emfprofile.application.registry.impl.ProfileApplicationRegistryImpl;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 *
 */
public class ProfileApplicationRegistryTest extends AbstractProfileApplicationRegistryTest {
	
	
	static Collection<Profile> profiles;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		profiles = new ArrayList<>();
		profiles.add(profile);
	}

		
	@After
	public void deleteTestProfileApplicationResource() {
		deleteResource(TEST_PROFILE_APPLICATION);
		((ProfileApplicationRegistryImpl)ProfileApplicationRegistry.INSTANCE).cleanUp();
	}
	
	@Test(expected=NullPointerException.class)
	public void testGetProfileApplicationForNullValue_shouldThrowNullPointerException(){
		ProfileApplicationRegistry.INSTANCE.getProfileApplicationManager(null);
		fail("Registry should not accept null value for parameter");
	}

	@Test
	public void testGetProfiles_shouldWork(){
		int size = ProfileApplicationRegistry.INSTANCE.getManagers().size();
		assertThat(size, is(0));
		ResourceSet testResourceSet2 = new ResourceSetImpl();
		ProfileApplicationManager testPAManager1 = ProfileApplicationRegistry.INSTANCE.getProfileApplicationManager(resourceSet);
		assertNotNull(testPAManager1);
		size = ProfileApplicationRegistry.INSTANCE.getManagers().size();
		assertThat(size , is(1));
		assertEquals(testPAManager1, ProfileApplicationRegistry.INSTANCE.getManagers().iterator().next());
		ProfileApplicationManager testPAManager2 = ProfileApplicationRegistry.INSTANCE.getProfileApplicationManager(testResourceSet2);
		assertNotNull(testPAManager2);
		size = ProfileApplicationRegistry.INSTANCE.getManagers().size();
		assertThat(size, is(2));
		assertEquals(testPAManager2, ProfileApplicationRegistry.INSTANCE.getProfileApplicationManager(testResourceSet2));

	}
	
	@Test
	public void testGetProfileApplicationManagerForResourceSet_shouldRetunrTheSameProfileApplicaitionManager() {
		ProfileApplicationManager testPAManager1 = ProfileApplicationRegistry.INSTANCE.getProfileApplicationManager(resourceSet);
		assertNotNull(testPAManager1);
		ResourceSet testResourceSet2 = new ResourceSetImpl();
		ProfileApplicationManager testPAManager2 = ProfileApplicationRegistry.INSTANCE.getProfileApplicationManager(testResourceSet2 );
		assertNotNull(testPAManager2);
		int size = ProfileApplicationRegistry.INSTANCE.getManagers().size();
		assertThat(size, is(2));
		// should return the same profile application manager for the same resource set
		assertEquals(testPAManager1, ProfileApplicationRegistry.INSTANCE.getProfileApplicationManager(resourceSet));
		assertEquals(testPAManager2, ProfileApplicationRegistry.INSTANCE.getProfileApplicationManager(testResourceSet2));
		// the size should remain the same
		size = ProfileApplicationRegistry.INSTANCE.getManagers().size();
		assertThat(size, is(2));
	}
	
	@Test
	public void testDisposingProfileManagers_shouldMakeManagersUnreachableFromRegistry() {
		ProfileApplicationManager testPAManager1 = ProfileApplicationRegistry.INSTANCE.getProfileApplicationManager(resourceSet);
		assertNotNull(testPAManager1);
		ResourceSet testResourceSet2 = new ResourceSetImpl();
		ProfileApplicationManager testPAManager2 = ProfileApplicationRegistry.INSTANCE.getProfileApplicationManager(testResourceSet2 );
		assertNotNull(testPAManager2);
		int size = ProfileApplicationRegistry.INSTANCE.getManagers().size();
		assertThat(size, is(2));
		// disposing second manager
		testPAManager2.dispose();
		size = ProfileApplicationRegistry.INSTANCE.getManagers().size();
		assertThat(size, is(1));
		assertNotEquals(testPAManager2, ProfileApplicationRegistry.INSTANCE.getManagers().iterator().next());
		// disposing first manager
		testPAManager1.dispose();
		size = ProfileApplicationRegistry.INSTANCE.getManagers().size();
		assertThat(size, is(0));
	}
	
	@Test(expected=NullPointerException.class)
	public void testGettingProfileApplicationManagerAndRegisteringDecoratorForNullResourceSet_shouldThrowNPE() throws NullPointerException, ProfileApplicationDecoratorNotFoundException, ReadingDecorationDescriptionsException{
		ProfileApplicationRegistry.INSTANCE.getProfileApplicationManager(null, "something");
		fail("Did not throw NPE.");
	}
	
	@Test(expected=NullPointerException.class)
	public void testGettingProfileApplicationManagerAndRegisteringDecoratorForNullEditorId_shouldThrowNPE() throws NullPointerException, ProfileApplicationDecoratorNotFoundException, ReadingDecorationDescriptionsException{
		ProfileApplicationRegistry.INSTANCE.getProfileApplicationManager(resourceSet, null);
		fail("Did not throw NPE.");
	}

	@Test(expected=ProfileApplicationDecoratorNotFoundException.class)
	public void testGettingProfileApplicationManagerAndRegisteringDecoratorForUnknownEditorId_shouldThrowException() throws NullPointerException, ProfileApplicationDecoratorNotFoundException, ReadingDecorationDescriptionsException{
		
		// NOTE: please be sure that there is a GMF decorator extension plug-in present. Otherwise this test could fail for wrong reasons.
		
		ProfileApplicationRegistry registry = ProfileApplicationRegistry.INSTANCE;
		registry.getProfileApplicationManager(resourceSet, "UnknownID");
		fail("Did not throw ProfileApplicationDecoratorNotFoundException.");
	}

	@Test()
	public void testGettingProfileApplicationManagerAndRegisteringDecorator_shouldRetournSameInstanceOfManager() throws NullPointerException, ProfileApplicationDecoratorNotFoundException, ReadingDecorationDescriptionsException{
		
		// NOTE: please be sure that there is a GMF decorator extension plug-in present. Otherwise this test could fail for wrong reasons.

		ProfileApplicationRegistry registry = ProfileApplicationRegistry.INSTANCE;
		ProfileApplicationManager testPAManager1 = registry.getProfileApplicationManager(resourceSet, AbstractProfileApplicationRegistryTest.ECORE_EDITOR_ID);
		assertNotNull(testPAManager1);
		assertEquals(testPAManager1, registry.getProfileApplicationManager(resourceSet, AbstractProfileApplicationRegistryTest.ECORE_EDITOR_ID));
		// also if we provide unknown editor id at this point the method should return the manager instance
		assertEquals(testPAManager1, registry.getProfileApplicationManager(resourceSet, "doesntMatterID"));
	}

	
//	class MockProfileApplicationRegistry extends ProfileApplicationRegistryImpl {
//		
//		boolean decoratorBound = false;
//		
//		public MockProfileApplicationRegistry() {
//			super();
//		}
//		@Override
//		public boolean hasProfileApplicationDecoratorForEditorId(String editorId) {
//			if(editorId.equals(AbstractProfileApplicationRegistryTest.ECORE_EDITOR_ID))
//				return true;
//			else
//				return false;
//		}
//		
//		@Override
//		public ProfileApplicationManager getProfileApplicationManager(
//				ResourceSet resourceSet, String editorId)
//				throws NullPointerException,
//				ProfileApplicationDecoratorNotFoundException {
//			ProfileApplicationManager manager =super.getProfileApplicationManager(resourceSet);
//			if(decoratorBound)
//				return manager;
//			if (hasProfileApplicationDecoratorForEditorId(editorId) == false)
//				throw new ProfileApplicationDecoratorNotFoundException();
//			decoratorBound = true;
//			return manager; 
//		}
//	}
}
