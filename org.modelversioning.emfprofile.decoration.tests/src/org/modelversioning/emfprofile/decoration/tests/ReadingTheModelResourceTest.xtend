package org.modelversioning.emfprofile.decoration.tests

import com.google.inject.Inject
import java.io.File
import org.apache.commons.io.FileUtils
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.validation.CheckMode
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationModel
import org.modelversioning.emfprofile.decoration.ui.internal.EMFProfileDecorationLanguageActivator

import static org.junit.Assert.*
import org.eclipse.core.runtime.NullProgressMonitor

@RunWith(XtextRunner)
class ReadingTheModelResourceTest {

	val injector = EMFProfileDecorationLanguageActivator.instance.getInjector(
		"org.modelversioning.emfprofile.decoration.EMFProfileDecorationLanguage")

	val static TEST_PROJECT = "EJB_Profile";
	val static FOLDER = "model";
	val static DECORATION_MODEL = "profileapplication.decoration";
	val static PROFILE_MODEL = "profile.emfprofile_diagram";
	val static ICON = "icons/nav_refresh.gif"

	@BeforeClass
	def static setUpBeforeClass() throws Exception {
		val workspace = ResourcesPlugin.getWorkspace();
		val root = workspace.getRoot();
		val project = root.getProject(TEST_PROJECT);
		val folder = project.getFolder(FOLDER);
		if(!project.exists()) project.create(null);
		if(!project.isOpen()) project.open(null);
		if(!folder.exists()) folder.create(IResource.NONE, true, null);

		//		FileUtils.copyFile(new File(folder + "/" + DECORATION_MODEL), new File(folder.getLocation() + "/" + DECORATION_MODEL));
		FileUtils.copyFile(new File(ICON), new File(project.getLocation() + "/" + ICON));
		FileUtils.copyFile(new File(FOLDER + "/" + DECORATION_MODEL), new File(folder.getLocation() + "/" + DECORATION_MODEL));
		FileUtils.copyFile(new File(FOLDER + "/" + PROFILE_MODEL), new File(folder.getLocation() + "/" + PROFILE_MODEL));
		val File dirFile = new File(folder.getLocation().toString());
		project.refreshLocal(2, new NullProgressMonitor)
		assertTrue("Resource Files were not copied into test project!", dirFile.list().length == 2);
	}

	@Inject
	XtextResourceSet rs
	@Inject
    IResourceServiceProvider.Registry serviceProviderRegistry

	//	@Test
	//	def test() {
	//		injector.injectMembers(this)
	//// 		new StandaloneSetup().setPlatformUri("../");
	//        rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE)
	//        
	//		val path = new Path(TEST_PROJECT + "/" + FOLDER + "/" + DECORATION_MODEL)
	//		println(path.makeAbsolute)
	//		assertNotNull(injector)
	//		val uri = URI.createPlatformResourceURI(path.makeAbsolute.toString(), true)
	//		println("uri: " + uri.toString)
	//		val resource = rs.getResource(uri, true)
	//		EcoreUtil.resolveAll(resource)
	//		println("resource: " + resource)
	//		assertNotNull(resource)
	//		println("All elements in the resource: ")
	//		resource.allContents.forEach[e|println(e)]
	//		println("resource syntax errors count: " + resource.errors.size)
	//		resource.errors.forEach[err|println(err)]
	//	}
	@Test
	def testReadingFirstDecorationModelAndThenLoadingProfileModel() {
		injector.injectMembers(this)

		// 		new StandaloneSetup().setPlatformUri("../");
		rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE)

		val pathModel = new Path(TEST_PROJECT + "/" + FOLDER + "/" + DECORATION_MODEL)

		println("pathModel: " + pathModel.toString)
		println("pathModel absolute: " + pathModel.makeAbsolute)
		println("pathModel relative: " + pathModel.makeRelative)
		assertNotNull(injector)

		//		val uri = URI.createPlatformResourceURI(pathModel.makeAbsolute.toString(), true)
		val uri = URI.createPlatformResourceURI(pathModel.toString, true)
		println("uri: " + uri.toString)
		val resource = rs.getResource(uri, true)
		println("resource: " + resource)
		assertNotNull(resource)
		val model = resource.contents.head as DecorationModel
		val importURI = model.importURI
		println("import uri: " + importURI)
		println("import uri segment count: " + URI.createURI(PROFILE_MODEL).segmentCount)
		println("resource uri: " + resource.URI)
		println("resource uri trim segments 1: " + resource.URI.trimSegments(1))
		val profileModelURI = resource.URI.trimSegments(URI.createURI(PROFILE_MODEL).segmentCount).
			appendSegment(PROFILE_MODEL)
		println("profileModelURI: " + profileModelURI.toString)
		assertTrue(new ExtensibleURIConverterImpl().exists(resource.URI, null))
		println("profileModelURI is platform resource: " + profileModelURI.platformResource)

		//		assertTrue(new ExtensibleURIConverterImpl().exists(profileModelURI, null))
		//		val profileResource = rs.getResource(URI.createPlatformResourceURI(path + importURI, true), true)
		val profileResource = rs.getResource(profileModelURI, true)
		assertNotNull(profileResource)
		println("profile resource: " + profileResource)
		resource.unload
		resource.load(null)

		//		EcoreUtil.resolveAll(resource)
		println("resource: " + resource)
		assertNotNull(resource)
		println("All elements in the resource: ")
		resource.allContents.forEach[e|println(e)]
		println("resource syntax errors count: " + resource.errors.size)
		resource.errors.forEach[err|println(err)]
		assertTrue(resource.errors.empty)
	}

	@Test
	def testLoadingProfileModelFirstAndThenReadingDecorationModel() {
		injector.injectMembers(this)

		// 		new StandaloneSetup().setPlatformUri("../");
		rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE)

		val pathModel = new Path(TEST_PROJECT + "/" + FOLDER + "/" + DECORATION_MODEL)

		println("pathModel: " + pathModel.toString)
		println("pathModel absolute: " + pathModel.makeAbsolute)
		println("pathModel relative: " + pathModel.makeRelative)
		assertNotNull(injector)

		val profileModelURI = URI.createPlatformResourceURI(new Path(TEST_PROJECT + "/" + FOLDER + "/" + PROFILE_MODEL).toString, true)
		println("profileModelURI: " + profileModelURI.toString)
		val profileResource = rs.getResource(profileModelURI, true)
		assertNotNull(profileResource)
		println("profile resource: " + profileResource)

		//		val uri = URI.createPlatformResourceURI(pathModel.makeAbsolute.toString(), true)
		val uri = URI.createPlatformResourceURI(pathModel.toString, true)
		println("uri: " + uri.toString)
		val resource = rs.getResource(uri, true)
		println("resource: " + resource)
		assertNotNull(resource)

		//		val model = resource.contents.head as DecorationModel
		//		val importURI = model.importURI
		//		println("import uri: " + importURI)
		//		println("import uri segment count: " + URI.createURI(PROFILE_MODEL).segmentCount)
		//		println("resource uri: " + resource.URI)
		//		println("resource uri trim segments 1: " + resource.URI.trimSegments(1))
		//		val profileModelURI = resource.URI.trimSegments(URI.createURI(PROFILE_MODEL).segmentCount).appendSegment(DECORATION_MODEL)
		assertTrue(new ExtensibleURIConverterImpl().exists(resource.URI, null))
		println("profileModelURI is platform resource: " + profileModelURI.platformResource)

		//		assertTrue(new ExtensibleURIConverterImpl().exists(profileModelURI, null))
		//		val profileResource = rs.getResource(URI.createPlatformResourceURI(path + importURI, true), true)

		//		resource.unload
		//		resource.load(null)
		//		EcoreUtil.resolveAll(resource)
		println("resource: " + resource)
		assertNotNull(resource)
		println("All elements in the resource: ")
		resource.allContents.forEach[e|println(e)]
		println("resource syntax errors count: " + resource.errors.size)
		resource.errors.forEach[err|println(err)]
		println("resource warnings count: " + resource.warnings.size)
		resource.warnings.forEach[w|println(w)]
		assertTrue(resource.errors.empty)
		val xtextResource = resource as XtextResource
		println("validation disabled: " + xtextResource.validationDisabled)
		if(xtextResource.validationDisabled) xtextResource.setValidationDisabled(false)
		val validationDiagnostics = xtextResource.validateConcreteSyntax
		println("validation errors size: " + validationDiagnostics.size)
		validationDiagnostics.forEach[vd|println(vd)]
		assertTrue(validationDiagnostics.empty)
		println("parse result has syntax errors: " + xtextResource.parseResult.hasSyntaxErrors)
		assertFalse(xtextResource.parseResult.hasSyntaxErrors)
		
		val issues = serviceProviderRegistry.getResourceServiceProvider(resource.URI).resourceValidator.validate(resource, CheckMode.ALL, null)
		println("validation issues size: " + issues.size)
		issues.forEach[i|println(i)]
		val iconExists = new ExtensibleURIConverterImpl().exists(URI.createPlatformResourceURI("EJB_Profile/icons/nav_refresh.gif", true), null)
		println("icon exists: " + iconExists)
		val root = ResourcesPlugin.workspace.root
		val file = root.getFile(new Path("EJB_Profile/icons/nav_refresh.gif"))
		println("file path: " + file.fullPath.toString)
		println("icon file exists: " + file.exists)
		assertTrue(issues.empty)
	}
}
