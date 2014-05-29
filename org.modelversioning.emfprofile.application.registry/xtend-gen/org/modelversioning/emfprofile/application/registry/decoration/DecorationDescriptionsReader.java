/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.decoration;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Injector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
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
import org.modelversioning.emfprofile.Stereotype;
import org.modelversioning.emfprofile.application.registry.decoration.DecorationDescriptionsChangeListener;
import org.modelversioning.emfprofile.application.registry.decoration.DecorationLanguageResourceChangeListener;
import org.modelversioning.emfprofile.application.registry.exception.ReadingDecorationDescriptionsException;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Activation;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationModel;
import org.modelversioning.emfprofile.decoration.ui.internal.EMFProfileDecorationLanguageActivator;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 */
@SuppressWarnings("all")
public class DecorationDescriptionsReader {
  private final Profile profile;
  
  private final URI decorationDescriptionsResourceURI;
  
  private final XtextResource decorationDescriptionsResource;
  
  private boolean shouldExecuteDependencyInjection = true;
  
  @Inject
  private XtextResourceSet rs;
  
  @Inject
  private Registry serviceProviderRegistry;
  
  private DecorationDescriptionsChangeListener changesListener;
  
  private DecorationLanguageResourceChangeListener resourceChangeListener;
  
  public DecorationDescriptionsReader(final Profile profile) throws ReadingDecorationDescriptionsException {
    this.profile = profile;
    URI _provideDecorationDescriptionsResourceURI = this.provideDecorationDescriptionsResourceURI();
    this.decorationDescriptionsResourceURI = _provideDecorationDescriptionsResourceURI;
    XtextResource _loadDecorationDescriptionsResource = this.loadDecorationDescriptionsResource();
    this.decorationDescriptionsResource = _loadDecorationDescriptionsResource;
    DecorationLanguageResourceChangeListener _decorationLanguageResourceChangeListener = new DecorationLanguageResourceChangeListener(this);
    this.resourceChangeListener = _decorationLanguageResourceChangeListener;
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
      if (this.shouldExecuteDependencyInjection) {
        EMFProfileDecorationLanguageActivator _instance = EMFProfileDecorationLanguageActivator.getInstance();
        Injector _injector = _instance.getInjector(
          "org.modelversioning.emfprofile.decoration.EMFProfileDecorationLanguage");
        _injector.injectMembers(this);
        this.shouldExecuteDependencyInjection = false;
      }
      this.rs.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
      Resource _eResource = this.profile.eResource();
      URI _uRI = _eResource.getURI();
      this.rs.getResource(_uRI, true);
      final Resource decorationDescriptionsResource = this.rs.getResource(this.decorationDescriptionsResourceURI, true);
      final XtextResource xtextResource = ((XtextResource) decorationDescriptionsResource);
      this.performResourceValidation(xtextResource);
      _xblockexpression = (xtextResource);
    }
    return _xblockexpression;
  }
  
  private void performResourceValidation(final XtextResource decorationDescriptionsResource) {
    try {
      URI _uRI = decorationDescriptionsResource.getURI();
      IResourceServiceProvider _resourceServiceProvider = this.serviceProviderRegistry.getResourceServiceProvider(_uRI);
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
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public DecorationDescription getDecorationDescription(final Stereotype stereotype) {
    EList<EObject> _contents = this.decorationDescriptionsResource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final DecorationModel model = ((DecorationModel) _head);
    EList<DecorationDescription> _decorationDescriptions = model.getDecorationDescriptions();
    final Function1<DecorationDescription,Boolean> _function = new Function1<DecorationDescription,Boolean>() {
      public Boolean apply(final DecorationDescription it) {
        Stereotype _stereotype = it.getStereotype();
        String _name = _stereotype.getName();
        String _name_1 = stereotype.getName();
        boolean _equals = Objects.equal(_name, _name_1);
        return Boolean.valueOf(_equals);
      }
    };
    final DecorationDescription decorationDescription = IterableExtensions.<DecorationDescription>findFirst(_decorationDescriptions, _function);
    EList<EClass> _eSuperTypes = stereotype.getESuperTypes();
    final Function1<EClass,Boolean> _function_1 = new Function1<EClass,Boolean>() {
      public Boolean apply(final EClass s) {
        boolean _switchResult = false;
        boolean _matched = false;
        if (!_matched) {
          if (s instanceof Stereotype) {
            final Stereotype _stereotype = (Stereotype)s;
            _matched=true;
            _switchResult = true;
          }
        }
        if (!_matched) {
          _switchResult = false;
        }
        return Boolean.valueOf(_switchResult);
      }
    };
    final Iterable<EClass> stereotypeSuperTypes = IterableExtensions.<EClass>filter(_eSuperTypes, _function_1);
    final ArrayList<DecorationDescription> allDecorationDescriptions = Lists.<DecorationDescription>newArrayList();
    boolean _notEquals = (!Objects.equal(decorationDescription, null));
    if (_notEquals) {
      allDecorationDescriptions.add(decorationDescription);
    }
    final Consumer<EClass> _function_2 = new Consumer<EClass>() {
      public void accept(final EClass sst) {
        EList<DecorationDescription> _decorationDescriptions = model.getDecorationDescriptions();
        final Function1<DecorationDescription,Boolean> _function = new Function1<DecorationDescription,Boolean>() {
          public Boolean apply(final DecorationDescription it) {
            Stereotype _stereotype = it.getStereotype();
            String _name = _stereotype.getName();
            String _name_1 = sst.getName();
            boolean _equals = Objects.equal(_name, _name_1);
            return Boolean.valueOf(_equals);
          }
        };
        final DecorationDescription dd = IterableExtensions.<DecorationDescription>findFirst(_decorationDescriptions, _function);
        boolean _notEquals = (!Objects.equal(dd, null));
        if (_notEquals) {
          allDecorationDescriptions.add(dd);
        }
      }
    };
    stereotypeSuperTypes.forEach(_function_2);
    boolean _isEmpty = allDecorationDescriptions.isEmpty();
    if (_isEmpty) {
      return null;
    }
    final DecorationDescription temp = IterableExtensions.<DecorationDescription>head(allDecorationDescriptions);
    allDecorationDescriptions.remove(temp);
    final DecorationDescription resultDecorationDescription = EcoreUtil2.<DecorationDescription>copy(temp);
    Activation _activation = resultDecorationDescription.getActivation();
    boolean _equals = Objects.equal(_activation, null);
    if (_equals) {
      final Function1<DecorationDescription,Boolean> _function_3 = new Function1<DecorationDescription,Boolean>() {
        public Boolean apply(final DecorationDescription it) {
          Activation _activation = it.getActivation();
          boolean _notEquals = (!Objects.equal(_activation, null));
          return Boolean.valueOf(_notEquals);
        }
      };
      DecorationDescription _findFirst = IterableExtensions.<DecorationDescription>findFirst(allDecorationDescriptions, _function_3);
      Activation _activation_1 = null;
      if (_findFirst!=null) {
        _activation_1=_findFirst.getActivation();
      }
      final Activation activation = _activation_1;
      boolean _notEquals_1 = (!Objects.equal(activation, null));
      if (_notEquals_1) {
        Activation _copy = EcoreUtil2.<Activation>copy(activation);
        resultDecorationDescription.setActivation(_copy);
      }
    }
    final ArrayList<AbstractDecoration> resultDecorations = Lists.<AbstractDecoration>newArrayList();
    final Consumer<DecorationDescription> _function_4 = new Consumer<DecorationDescription>() {
      public void accept(final DecorationDescription it) {
        EList<AbstractDecoration> _decorations = it.getDecorations();
        resultDecorations.addAll(_decorations);
      }
    };
    allDecorationDescriptions.forEach(_function_4);
    EList<AbstractDecoration> _decorations = resultDecorationDescription.getDecorations();
    Collection<AbstractDecoration> _copyAll = EcoreUtil2.<AbstractDecoration>copyAll(resultDecorations);
    _decorations.addAll(_copyAll);
    return resultDecorationDescription;
  }
  
  public DecorationDescriptionsChangeListener addDecorationDescriptionsChangeListener(final DecorationDescriptionsChangeListener listener) {
    DecorationDescriptionsChangeListener _xblockexpression = null;
    {
      String _plus = ("Adding changes listener: " + listener);
      InputOutput.<String>println(_plus);
      DecorationDescriptionsChangeListener _changesListener = this.changesListener = listener;
      _xblockexpression = (_changesListener);
    }
    return _xblockexpression;
  }
  
  public IFile getDecorationDescriptionsIFile() {
    IFile _resourceEMFtoIFile = this.resourceEMFtoIFile(this.decorationDescriptionsResource);
    return _resourceEMFtoIFile;
  }
  
  public void reloadResource() {
    try {
      this.decorationDescriptionsResource.unload();
      this.decorationDescriptionsResource.load(null);
      try {
        this.performResourceValidation(this.decorationDescriptionsResource);
        this.changesListener.decorationDescriptionsChanged();
      } catch (final Throwable _t) {
        if (_t instanceof ReadingDecorationDescriptionsException) {
          final ReadingDecorationDescriptionsException e = (ReadingDecorationDescriptionsException)_t;
          this.changesListener.decorationDescriptionsChangedButHaveValidationProblems();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void resourceRemoved() {
    this.changesListener.decorationDescriptionsChangedButHaveValidationProblems();
  }
  
  /**
   * Unloads all resources from the resource set.
   */
  public void dispose() {
    if (this.resourceChangeListener!=null) {
      this.resourceChangeListener.dispose();
    }
    EList<Resource> _resources = this.rs.getResources();
    final Consumer<Resource> _function = new Consumer<Resource>() {
      public void accept(final Resource r) {
        r.unload();
      }
    };
    _resources.forEach(_function);
    EList<Resource> _resources_1 = this.rs.getResources();
    _resources_1.clear();
  }
}
