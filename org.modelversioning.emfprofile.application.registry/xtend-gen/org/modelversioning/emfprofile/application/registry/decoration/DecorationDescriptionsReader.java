package org.modelversioning.emfprofile.application.registry.decoration;

import com.google.inject.Inject;
import com.google.inject.Injector;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.IResourceServiceProvider.Registry;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.application.registry.exception.ReadingDecorationDescriptionsException;
import org.modelversioning.emfprofile.decoration.ui.internal.EMFProfileDecorationLanguageActivator;

@SuppressWarnings("all")
public class DecorationDescriptionsReader {
  private final Profile profile;
  
  private final URI decorationDescriptionsResourceURI;
  
  private final XtextResource decorationDescriptionsResource;
  
  @Inject
  private XtextResourceSet rs;
  
  @Inject
  private Registry serviceProviderRegistry;
  
  public DecorationDescriptionsReader(final Profile profile) throws ReadingDecorationDescriptionsException {
    this.profile = profile;
    URI _provideDecorationDescriptionsResourceURI = this.provideDecorationDescriptionsResourceURI();
    this.decorationDescriptionsResourceURI = _provideDecorationDescriptionsResourceURI;
    XtextResource _loadDecorationDescriptionsResource = this.loadDecorationDescriptionsResource();
    this.decorationDescriptionsResource = _loadDecorationDescriptionsResource;
  }
  
  private URI provideDecorationDescriptionsResourceURI() {
    try {
      Resource _eResource = this.profile.eResource();
      final IFile profileIFile = this.resourceEMFtoIFile(_eResource);
      final IProject profileIProject = profileIFile.getProject();
      IResource[] _members = profileIProject.members();
      final Function1<IResource,Boolean> _function = new Function1<IResource,Boolean>() {
          public Boolean apply(final IResource r) {
            boolean _matched = false;
            if (!_matched) {
              if (r instanceof IFile) {
                final IFile _iFile = (IFile)r;
                String _name = _iFile.getName();
                boolean _endsWith = _name.endsWith(".decoration");
                if (_endsWith) {
                  _matched=true;
                  return Boolean.valueOf(true);
                }
              }
            }
            return Boolean.valueOf(false);
          }
        };
      final Iterable<IResource> decorationIFiles = IterableExtensions.<IResource>filter(((Iterable<IResource>)Conversions.doWrapArray(_members)), _function);
      boolean _isEmpty = IterableExtensions.isEmpty(decorationIFiles);
      if (_isEmpty) {
        ReadingDecorationDescriptionsException _readingDecorationDescriptionsException = new ReadingDecorationDescriptionsException(
          "Did not find any decoration description resource in the profile project. Stereotypes can be applied to the elements, but no visual decoration will be added to the graphical representation.");
        throw _readingDecorationDescriptionsException;
      } else {
        int _size = IterableExtensions.size(decorationIFiles);
        boolean _greaterThan = (_size > 1);
        if (_greaterThan) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Found more then one decoration description resource in the profile project. Only one resource should be present.");
          ReadingDecorationDescriptionsException _readingDecorationDescriptionsException_1 = new ReadingDecorationDescriptionsException(_builder.toString());
          throw _readingDecorationDescriptionsException_1;
        }
      }
      IResource _head = IterableExtensions.<IResource>head(decorationIFiles);
      IPath _fullPath = _head.getFullPath();
      String _string = _fullPath.toString();
      final URI descriptionsURI = URI.createPlatformResourceURI(_string, true);
      String _string_1 = descriptionsURI.toString();
      String _plus = ("descriptions resource uri: " + _string_1);
      InputOutput.<String>println(_plus);
      return descriptionsURI;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private IFile resourceEMFtoIFile(final Resource resource) {
    IFile _xblockexpression = null;
    {
      ResourceSet _resourceSet = resource.getResourceSet();
      URIConverter _uRIConverter = _resourceSet.getURIConverter();
      URI _uRI = resource.getURI();
      final URI uri = _uRIConverter.normalize(_uRI);
      final String scheme = uri.scheme();
      IFile _xifexpression = null;
      boolean _and = false;
      boolean _and_1 = false;
      boolean _equals = "platform".equals(scheme);
      if (!_equals) {
        _and_1 = false;
      } else {
        int _segmentCount = uri.segmentCount();
        boolean _greaterThan = (_segmentCount > 1);
        _and_1 = (_equals && _greaterThan);
      }
      if (!_and_1) {
        _and = false;
      } else {
        String _segment = uri.segment(0);
        boolean _equals_1 = "resource".equals(_segment);
        _and = (_and_1 && _equals_1);
      }
      if (_and) {
        StringBuffer _stringBuffer = new StringBuffer();
        final StringBuffer platformResourcePath = _stringBuffer;
        int j = 1;
        final int size = uri.segmentCount();
        boolean _lessThan = (j < size);
        boolean _while = _lessThan;
        while (_while) {
          {
            platformResourcePath.append("/");
            String _segment_1 = uri.segment(j);
            platformResourcePath.append(_segment_1);
            int _plus = (j + 1);
            j = _plus;
          }
          boolean _lessThan_1 = (j < size);
          _while = _lessThan_1;
        }
        IWorkspace _workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot _root = _workspace.getRoot();
        String _string = platformResourcePath.toString();
        Path _path = new Path(_string);
        return _root.getFile(_path);
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  private XtextResource loadDecorationDescriptionsResource() throws ReadingDecorationDescriptionsException {
    XtextResource _xblockexpression = null;
    {
      EMFProfileDecorationLanguageActivator _instance = EMFProfileDecorationLanguageActivator.getInstance();
      Injector _injector = _instance.getInjector(
        "org.modelversioning.emfprofile.decoration.EMFProfileDecorationLanguage");
      _injector.injectMembers(this);
      this.rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
      Resource _eResource = this.profile.eResource();
      URI _uRI = _eResource.getURI();
      this.rs.getResource(_uRI, true);
      final Resource decorationDescriptionsResource = this.rs.getResource(this.decorationDescriptionsResourceURI, true);
      final XtextResource xtextResource = ((XtextResource) decorationDescriptionsResource);
      URI _uRI_1 = decorationDescriptionsResource.getURI();
      IResourceServiceProvider _resourceServiceProvider = this.serviceProviderRegistry.getResourceServiceProvider(_uRI_1);
      IResourceValidator _resourceValidator = _resourceServiceProvider.getResourceValidator();
      final List<Issue> issues = _resourceValidator.validate(decorationDescriptionsResource, CheckMode.ALL, null);
      EList<Diagnostic> _errors = decorationDescriptionsResource.getErrors();
      boolean _isEmpty = _errors.isEmpty();
      boolean _equals = (_isEmpty == false);
      if (_equals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Decoration descriptions can not be used! There are syntax errors in decoration description file. Correct the problem and load the profile application again.");
        ReadingDecorationDescriptionsException _readingDecorationDescriptionsException = new ReadingDecorationDescriptionsException(_builder.toString());
        throw _readingDecorationDescriptionsException;
      } else {
        boolean _isEmpty_1 = issues.isEmpty();
        boolean _equals_1 = (_isEmpty_1 == false);
        if (_equals_1) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("Decoration descriptions can not be used! They are not sematnically valid. Correct the problem and load the profile application again.");
          ReadingDecorationDescriptionsException _readingDecorationDescriptionsException_1 = new ReadingDecorationDescriptionsException(_builder_1.toString());
          throw _readingDecorationDescriptionsException_1;
        }
      }
      _xblockexpression = (xtextResource);
    }
    return _xblockexpression;
  }
}
