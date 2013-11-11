package org.modelversioning.emfprofile.decoration.tests;

import com.google.inject.Inject;
import com.google.inject.Injector;
import java.io.File;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.IResourceServiceProvider.Registry;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationModel;
import org.modelversioning.emfprofile.decoration.ui.internal.EMFProfileDecorationLanguageActivator;

@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class ReadingTheModelResourceTest {
  private final Injector injector = new Function0<Injector>() {
    public Injector apply() {
      EMFProfileDecorationLanguageActivator _instance = EMFProfileDecorationLanguageActivator.getInstance();
      Injector _injector = _instance.getInjector(
        "org.modelversioning.emfprofile.decoration.EMFProfileDecorationLanguage");
      return _injector;
    }
  }.apply();
  
  private final static String TEST_PROJECT = "EJB_Profile";
  
  private final static String FOLDER = "model";
  
  private final static String DECORATION_MODEL = "profileapplication.decoration";
  
  private final static String PROFILE_MODEL = "profile.emfprofile_diagram";
  
  private final static String ICON = "icons/nav_refresh.gif";
  
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    final IWorkspace workspace = ResourcesPlugin.getWorkspace();
    final IWorkspaceRoot root = workspace.getRoot();
    final IProject project = root.getProject(ReadingTheModelResourceTest.TEST_PROJECT);
    final IFolder folder = project.getFolder(ReadingTheModelResourceTest.FOLDER);
    boolean _exists = project.exists();
    boolean _not = (!_exists);
    if (_not) {
      project.create(null);
    }
    boolean _isOpen = project.isOpen();
    boolean _not_1 = (!_isOpen);
    if (_not_1) {
      project.open(null);
    }
    boolean _exists_1 = folder.exists();
    boolean _not_2 = (!_exists_1);
    if (_not_2) {
      folder.create(IResource.NONE, true, null);
    }
    File _file = new File(ReadingTheModelResourceTest.ICON);
    IPath _location = project.getLocation();
    String _plus = (_location + "/");
    String _plus_1 = (_plus + ReadingTheModelResourceTest.ICON);
    File _file_1 = new File(_plus_1);
    FileUtils.copyFile(_file, _file_1);
    String _plus_2 = (ReadingTheModelResourceTest.FOLDER + "/");
    String _plus_3 = (_plus_2 + ReadingTheModelResourceTest.DECORATION_MODEL);
    File _file_2 = new File(_plus_3);
    IPath _location_1 = folder.getLocation();
    String _plus_4 = (_location_1 + "/");
    String _plus_5 = (_plus_4 + ReadingTheModelResourceTest.DECORATION_MODEL);
    File _file_3 = new File(_plus_5);
    FileUtils.copyFile(_file_2, _file_3);
    String _plus_6 = (ReadingTheModelResourceTest.FOLDER + "/");
    String _plus_7 = (_plus_6 + ReadingTheModelResourceTest.PROFILE_MODEL);
    File _file_4 = new File(_plus_7);
    IPath _location_2 = folder.getLocation();
    String _plus_8 = (_location_2 + "/");
    String _plus_9 = (_plus_8 + ReadingTheModelResourceTest.PROFILE_MODEL);
    File _file_5 = new File(_plus_9);
    FileUtils.copyFile(_file_4, _file_5);
    IPath _location_3 = folder.getLocation();
    String _string = _location_3.toString();
    File _file_6 = new File(_string);
    final File dirFile = _file_6;
    NullProgressMonitor _nullProgressMonitor = new NullProgressMonitor();
    project.refreshLocal(2, _nullProgressMonitor);
    String[] _list = dirFile.list();
    int _length = _list.length;
    boolean _equals = (_length == 2);
    Assert.assertTrue("Resource Files were not copied into test project!", _equals);
  }
  
  @Inject
  private XtextResourceSet rs;
  
  @Inject
  private Registry serviceProviderRegistry;
  
  @Test
  public void testReadingFirstDecorationModelAndThenLoadingProfileModel() {
    try {
      this.injector.injectMembers(this);
      this.rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
      String _plus = (ReadingTheModelResourceTest.TEST_PROJECT + "/");
      String _plus_1 = (_plus + ReadingTheModelResourceTest.FOLDER);
      String _plus_2 = (_plus_1 + "/");
      String _plus_3 = (_plus_2 + ReadingTheModelResourceTest.DECORATION_MODEL);
      Path _path = new Path(_plus_3);
      final Path pathModel = _path;
      String _string = pathModel.toString();
      String _plus_4 = ("pathModel: " + _string);
      InputOutput.<String>println(_plus_4);
      IPath _makeAbsolute = pathModel.makeAbsolute();
      String _plus_5 = ("pathModel absolute: " + _makeAbsolute);
      InputOutput.<String>println(_plus_5);
      IPath _makeRelative = pathModel.makeRelative();
      String _plus_6 = ("pathModel relative: " + _makeRelative);
      InputOutput.<String>println(_plus_6);
      Assert.assertNotNull(this.injector);
      String _string_1 = pathModel.toString();
      final URI uri = URI.createPlatformResourceURI(_string_1, true);
      String _string_2 = uri.toString();
      String _plus_7 = ("uri: " + _string_2);
      InputOutput.<String>println(_plus_7);
      final Resource resource = this.rs.getResource(uri, true);
      String _plus_8 = ("resource: " + resource);
      InputOutput.<String>println(_plus_8);
      Assert.assertNotNull(resource);
      EList<EObject> _contents = resource.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      final DecorationModel model = ((DecorationModel) _head);
      final String importURI = model.getImportURI();
      String _plus_9 = ("import uri: " + importURI);
      InputOutput.<String>println(_plus_9);
      URI _createURI = URI.createURI(ReadingTheModelResourceTest.PROFILE_MODEL);
      int _segmentCount = _createURI.segmentCount();
      String _plus_10 = ("import uri segment count: " + Integer.valueOf(_segmentCount));
      InputOutput.<String>println(_plus_10);
      URI _uRI = resource.getURI();
      String _plus_11 = ("resource uri: " + _uRI);
      InputOutput.<String>println(_plus_11);
      URI _uRI_1 = resource.getURI();
      URI _trimSegments = _uRI_1.trimSegments(1);
      String _plus_12 = ("resource uri trim segments 1: " + _trimSegments);
      InputOutput.<String>println(_plus_12);
      URI _uRI_2 = resource.getURI();
      URI _createURI_1 = URI.createURI(ReadingTheModelResourceTest.PROFILE_MODEL);
      int _segmentCount_1 = _createURI_1.segmentCount();
      URI _trimSegments_1 = _uRI_2.trimSegments(_segmentCount_1);
      final URI profileModelURI = _trimSegments_1.appendSegment(ReadingTheModelResourceTest.PROFILE_MODEL);
      String _string_3 = profileModelURI.toString();
      String _plus_13 = ("profileModelURI: " + _string_3);
      InputOutput.<String>println(_plus_13);
      ExtensibleURIConverterImpl _extensibleURIConverterImpl = new ExtensibleURIConverterImpl();
      URI _uRI_3 = resource.getURI();
      boolean _exists = _extensibleURIConverterImpl.exists(_uRI_3, null);
      Assert.assertTrue(_exists);
      boolean _isPlatformResource = profileModelURI.isPlatformResource();
      String _plus_14 = ("profileModelURI is platform resource: " + Boolean.valueOf(_isPlatformResource));
      InputOutput.<String>println(_plus_14);
      final Resource profileResource = this.rs.getResource(profileModelURI, true);
      Assert.assertNotNull(profileResource);
      String _plus_15 = ("profile resource: " + profileResource);
      InputOutput.<String>println(_plus_15);
      resource.unload();
      resource.load(null);
      String _plus_16 = ("resource: " + resource);
      InputOutput.<String>println(_plus_16);
      Assert.assertNotNull(resource);
      InputOutput.<String>println("All elements in the resource: ");
      TreeIterator<EObject> _allContents = resource.getAllContents();
      final Procedure1<EObject> _function = new Procedure1<EObject>() {
        public void apply(final EObject e) {
          InputOutput.<EObject>println(e);
        }
      };
      IteratorExtensions.<EObject>forEach(_allContents, _function);
      EList<Diagnostic> _errors = resource.getErrors();
      int _size = _errors.size();
      String _plus_17 = ("resource syntax errors count: " + Integer.valueOf(_size));
      InputOutput.<String>println(_plus_17);
      EList<Diagnostic> _errors_1 = resource.getErrors();
      final Procedure1<Diagnostic> _function_1 = new Procedure1<Diagnostic>() {
        public void apply(final Diagnostic err) {
          InputOutput.<Diagnostic>println(err);
        }
      };
      IterableExtensions.<Diagnostic>forEach(_errors_1, _function_1);
      EList<Diagnostic> _errors_2 = resource.getErrors();
      boolean _isEmpty = _errors_2.isEmpty();
      Assert.assertTrue(_isEmpty);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLoadingProfileModelFirstAndThenReadingDecorationModel() {
    this.injector.injectMembers(this);
    this.rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
    String _plus = (ReadingTheModelResourceTest.TEST_PROJECT + "/");
    String _plus_1 = (_plus + ReadingTheModelResourceTest.FOLDER);
    String _plus_2 = (_plus_1 + "/");
    String _plus_3 = (_plus_2 + ReadingTheModelResourceTest.DECORATION_MODEL);
    Path _path = new Path(_plus_3);
    final Path pathModel = _path;
    String _string = pathModel.toString();
    String _plus_4 = ("pathModel: " + _string);
    InputOutput.<String>println(_plus_4);
    IPath _makeAbsolute = pathModel.makeAbsolute();
    String _plus_5 = ("pathModel absolute: " + _makeAbsolute);
    InputOutput.<String>println(_plus_5);
    IPath _makeRelative = pathModel.makeRelative();
    String _plus_6 = ("pathModel relative: " + _makeRelative);
    InputOutput.<String>println(_plus_6);
    Assert.assertNotNull(this.injector);
    String _plus_7 = (ReadingTheModelResourceTest.TEST_PROJECT + "/");
    String _plus_8 = (_plus_7 + ReadingTheModelResourceTest.FOLDER);
    String _plus_9 = (_plus_8 + "/");
    String _plus_10 = (_plus_9 + ReadingTheModelResourceTest.PROFILE_MODEL);
    Path _path_1 = new Path(_plus_10);
    String _string_1 = _path_1.toString();
    final URI profileModelURI = URI.createPlatformResourceURI(_string_1, true);
    String _string_2 = profileModelURI.toString();
    String _plus_11 = ("profileModelURI: " + _string_2);
    InputOutput.<String>println(_plus_11);
    final Resource profileResource = this.rs.getResource(profileModelURI, true);
    Assert.assertNotNull(profileResource);
    String _plus_12 = ("profile resource: " + profileResource);
    InputOutput.<String>println(_plus_12);
    String _string_3 = pathModel.toString();
    final URI uri = URI.createPlatformResourceURI(_string_3, true);
    String _string_4 = uri.toString();
    String _plus_13 = ("uri: " + _string_4);
    InputOutput.<String>println(_plus_13);
    final Resource resource = this.rs.getResource(uri, true);
    String _plus_14 = ("resource: " + resource);
    InputOutput.<String>println(_plus_14);
    Assert.assertNotNull(resource);
    ExtensibleURIConverterImpl _extensibleURIConverterImpl = new ExtensibleURIConverterImpl();
    URI _uRI = resource.getURI();
    boolean _exists = _extensibleURIConverterImpl.exists(_uRI, null);
    Assert.assertTrue(_exists);
    boolean _isPlatformResource = profileModelURI.isPlatformResource();
    String _plus_15 = ("profileModelURI is platform resource: " + Boolean.valueOf(_isPlatformResource));
    InputOutput.<String>println(_plus_15);
    String _plus_16 = ("resource: " + resource);
    InputOutput.<String>println(_plus_16);
    Assert.assertNotNull(resource);
    InputOutput.<String>println("All elements in the resource: ");
    TreeIterator<EObject> _allContents = resource.getAllContents();
    final Procedure1<EObject> _function = new Procedure1<EObject>() {
      public void apply(final EObject e) {
        InputOutput.<EObject>println(e);
      }
    };
    IteratorExtensions.<EObject>forEach(_allContents, _function);
    EList<Diagnostic> _errors = resource.getErrors();
    int _size = _errors.size();
    String _plus_17 = ("resource syntax errors count: " + Integer.valueOf(_size));
    InputOutput.<String>println(_plus_17);
    EList<Diagnostic> _errors_1 = resource.getErrors();
    final Procedure1<Diagnostic> _function_1 = new Procedure1<Diagnostic>() {
      public void apply(final Diagnostic err) {
        InputOutput.<Diagnostic>println(err);
      }
    };
    IterableExtensions.<Diagnostic>forEach(_errors_1, _function_1);
    EList<Diagnostic> _warnings = resource.getWarnings();
    int _size_1 = _warnings.size();
    String _plus_18 = ("resource warnings count: " + Integer.valueOf(_size_1));
    InputOutput.<String>println(_plus_18);
    EList<Diagnostic> _warnings_1 = resource.getWarnings();
    final Procedure1<Diagnostic> _function_2 = new Procedure1<Diagnostic>() {
      public void apply(final Diagnostic w) {
        InputOutput.<Diagnostic>println(w);
      }
    };
    IterableExtensions.<Diagnostic>forEach(_warnings_1, _function_2);
    EList<Diagnostic> _errors_2 = resource.getErrors();
    boolean _isEmpty = _errors_2.isEmpty();
    Assert.assertTrue(_isEmpty);
    final XtextResource xtextResource = ((XtextResource) resource);
    boolean _isValidationDisabled = xtextResource.isValidationDisabled();
    String _plus_19 = ("validation disabled: " + Boolean.valueOf(_isValidationDisabled));
    InputOutput.<String>println(_plus_19);
    boolean _isValidationDisabled_1 = xtextResource.isValidationDisabled();
    if (_isValidationDisabled_1) {
      xtextResource.setValidationDisabled(false);
    }
    final List<org.eclipse.emf.common.util.Diagnostic> validationDiagnostics = xtextResource.validateConcreteSyntax();
    int _size_2 = validationDiagnostics.size();
    String _plus_20 = ("validation errors size: " + Integer.valueOf(_size_2));
    InputOutput.<String>println(_plus_20);
    final Procedure1<org.eclipse.emf.common.util.Diagnostic> _function_3 = new Procedure1<org.eclipse.emf.common.util.Diagnostic>() {
      public void apply(final org.eclipse.emf.common.util.Diagnostic vd) {
        InputOutput.<org.eclipse.emf.common.util.Diagnostic>println(vd);
      }
    };
    IterableExtensions.<org.eclipse.emf.common.util.Diagnostic>forEach(validationDiagnostics, _function_3);
    boolean _isEmpty_1 = validationDiagnostics.isEmpty();
    Assert.assertTrue(_isEmpty_1);
    IParseResult _parseResult = xtextResource.getParseResult();
    boolean _hasSyntaxErrors = _parseResult.hasSyntaxErrors();
    String _plus_21 = ("parse result has syntax errors: " + Boolean.valueOf(_hasSyntaxErrors));
    InputOutput.<String>println(_plus_21);
    IParseResult _parseResult_1 = xtextResource.getParseResult();
    boolean _hasSyntaxErrors_1 = _parseResult_1.hasSyntaxErrors();
    Assert.assertFalse(_hasSyntaxErrors_1);
    URI _uRI_1 = resource.getURI();
    IResourceServiceProvider _resourceServiceProvider = this.serviceProviderRegistry.getResourceServiceProvider(_uRI_1);
    IResourceValidator _resourceValidator = _resourceServiceProvider.getResourceValidator();
    final List<Issue> issues = _resourceValidator.validate(resource, CheckMode.ALL, null);
    int _size_3 = issues.size();
    String _plus_22 = ("validation issues size: " + Integer.valueOf(_size_3));
    InputOutput.<String>println(_plus_22);
    final Procedure1<Issue> _function_4 = new Procedure1<Issue>() {
      public void apply(final Issue i) {
        InputOutput.<Issue>println(i);
      }
    };
    IterableExtensions.<Issue>forEach(issues, _function_4);
    ExtensibleURIConverterImpl _extensibleURIConverterImpl_1 = new ExtensibleURIConverterImpl();
    URI _createPlatformResourceURI = URI.createPlatformResourceURI("EJB_Profile/icons/nav_refresh.gif", true);
    final boolean iconExists = _extensibleURIConverterImpl_1.exists(_createPlatformResourceURI, null);
    String _plus_23 = ("icon exists: " + Boolean.valueOf(iconExists));
    InputOutput.<String>println(_plus_23);
    IWorkspace _workspace = ResourcesPlugin.getWorkspace();
    final IWorkspaceRoot root = _workspace.getRoot();
    Path _path_2 = new Path("EJB_Profile/icons/nav_refresh.gif");
    final IFile file = root.getFile(_path_2);
    IPath _fullPath = file.getFullPath();
    String _string_5 = _fullPath.toString();
    String _plus_24 = ("file path: " + _string_5);
    InputOutput.<String>println(_plus_24);
    boolean _exists_1 = file.exists();
    String _plus_25 = ("icon file exists: " + Boolean.valueOf(_exists_1));
    InputOutput.<String>println(_plus_25);
    boolean _isEmpty_2 = issues.isEmpty();
    Assert.assertTrue(_isEmpty_2);
  }
}
