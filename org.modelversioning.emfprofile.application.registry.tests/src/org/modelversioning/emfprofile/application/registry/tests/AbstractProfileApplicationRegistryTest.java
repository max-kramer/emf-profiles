/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.tests;

import java.io.File;
import java.util.Arrays;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.Stereotype;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 *
 */
public abstract class AbstractProfileApplicationRegistryTest {
	
	
	protected static final String modelPath = "model/sample_ecore_model.ecore";
	// it is an EJB extended profile :)
	protected static final String profilePath = "model/profile.emfprofile_diagram";
	protected static final String testProfileApplicationPath = "model/application_test.pa.xmi";
	protected static final String profileApplicationPath = "model/application.pa.xmi";

	protected ResourceSet resourceSet = new ResourceSetImpl();

	protected Profile profile;
	protected Resource model;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	protected Resource loadResource(String path) {
		return resourceSet.getResource(URI.createFileURI(path), true);
	}
	
	protected Profile extractProfile(Resource resource) {
		return (Profile) resource.getContents().get(0);
	}

	@Before
	public void loadProfile() {
		String absolutePath = getAbsolutePath(profilePath);
		Resource resource = loadResource(absolutePath);
		profile = extractProfile(resource);
	}

	@Before
	public void loadModel() {
		String absolutePath = getAbsolutePath(modelPath);
		model = loadResource(absolutePath);
	}
	
	@After
	public void deleteProfileApplicationResource() {
		String absolutePath = getAbsolutePath(testProfileApplicationPath);
		deleteIfFileExists(absolutePath);
	}
	
	protected String getAbsolutePath(String relativePath) {
		return new File(relativePath).getAbsolutePath();
	}

	
	protected EClass getModelPersonEClass() {
		return (EClass) getModelEPackage().eContents().get(0);
	}

	protected EAttribute getModelPersonFirstNameEAttribute() {
		return (EAttribute) getModelPersonEClass().getEStructuralFeature(
				"firstName");
	}

	protected EObject getModelEPackage() {
		return model.getContents().get(0);
	}

	private Stereotype getStereotype(String stereotypeName) {
		return profile.getStereotype(stereotypeName);
	}

	protected IFile getWorkspaceFile(URI uri){
		return ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(uri.toPlatformString(true)));
	}

	protected IFile getTestProfileApplicationFile() {
		String path = getAbsolutePath(testProfileApplicationPath);
		return getFileToResource(path);
	}
	
	protected IFile getPrepearedProfileApplicationResourceFile() {
		String path = getAbsolutePath(profileApplicationPath);
		return getFileToResource(path);
	}

	protected void deleteTestProfileApplicationFileIfExists() {
		String path = getAbsolutePath(testProfileApplicationPath);
		deleteIfFileExists(path);
	}

	protected void deleteIfFileExists(String path) {
		File file = new File(path);
		if (file.exists()) {
			file.delete();
		}
	}
	
	protected IFile getFileToResource(String fullPath) {
		System.out.println("full path: " + fullPath);
		System.out.println(Arrays.toString(ResourcesPlugin.getWorkspace().getRoot().getProjects()));
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(fullPath));
		System.out.println("file: " + file);
		return file;
	}
}
