/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
	protected static final String TEST_PROJECT = "ProfileApplicationRegistryTest";
	protected static final String FOLDER = "model";
	protected static final String MODEL = "sample_ecore_model.ecore";
								// it is an EJB extended profile :)
	protected static final String PROFILE = "profile.emfprofile_diagram";
	protected static final String TEST_PROFILE_APPLICATION = "application_test.pa.xmi";
	protected static final String PREPARED_PROFILE_APPLICATION = "application.pa.xmi";
	protected static final String NON_EXISTING_RESOURCE = "NonExistingResource.pa.xmi";
	protected static final String TEST_PROFILE_APPLICATION_WITH_UNREACHABLE_REFERENCES = "application-that-has-unreachable-references.pa.xmi";
	
	protected ResourceSet resourceSet = new ResourceSetImpl();

	protected Profile profile;
	protected Resource model;
	protected static IWorkspace workspace;
	protected static IWorkspaceRoot root;
	protected static IProject project;
	protected static IFolder folder;

	

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		workspace = ResourcesPlugin.getWorkspace();
		root = workspace.getRoot();
		project = root.getProject(TEST_PROJECT);
		folder = project.getFolder(FOLDER);
		if (!project.exists()) project.create(null);
		if (!project.isOpen()) project.open(null);
		if (!folder.exists()) folder.create(IResource.NONE, true, null);

		FileUtils.copyFile(new File(FOLDER + "/" + MODEL), new File(folder.getLocation() + "/" + MODEL));
		FileUtils.copyFile(new File(FOLDER + "/" + PROFILE), new File(folder.getLocation() + "/" + PROFILE));
		FileUtils.copyFile(new File(FOLDER + "/" + PREPARED_PROFILE_APPLICATION), new File(folder.getLocation() + "/" + PREPARED_PROFILE_APPLICATION));
		FileUtils.copyFile(new File(FOLDER + "/" + TEST_PROFILE_APPLICATION_WITH_UNREACHABLE_REFERENCES), new File(folder.getLocation() + "/" + TEST_PROFILE_APPLICATION_WITH_UNREACHABLE_REFERENCES));
		File dirFile = new File(folder.getLocation().toString());
		assertThat("Resource Files were not copied into test project!", dirFile.list().length, is(4));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	protected Profile extractProfile(Resource resource) {
		return (Profile) resource.getContents().get(0);
	}

	@Before
	public void loadProfile() {
		String path = folder.getFullPath() + "/" + PROFILE;
		Resource resource = loadResource(path);
		profile = extractProfile(resource);
	}

	@Before
	public void loadModel() {
		String path = folder.getFullPath() + "/" + MODEL;
		model = loadResource(path);
	}
	
	protected Resource loadResource(String path) {
		return resourceSet.getResource(URI.createPlatformResourceURI(path, true), true);
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


	protected IFile getTestProfileApplicationFile() {
		return getFileToResource(TEST_PROFILE_APPLICATION);
	}
	
	protected IFile getPrepearedProfileApplication() {
		String path = PREPARED_PROFILE_APPLICATION;
		return getFileToResource(path);
	}

	

	protected void deleteResource(String name) {
		IFile file = folder.getFile(name);
		if (file.exists()) {
			try {
				file.delete(true, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}
	
	protected IFile getFileToResource(String name) {
		try {
			folder.refreshLocal(IFile.DEPTH_ONE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return folder.getFile(name);
	}
}
