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
	
	@Test(expected=IllegalArgumentException.class)
	public void testGetProfileApplicationForNullValue_shouldThrowIllegalArgumentException(){
		ProfileApplicationRegistry.INSTANCE.getProfileApplicationManager(null);
		fail("Registry should not accept null value for parameter");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
