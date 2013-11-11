/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.decorator.gmf;

import com.google.common.base.Objects;
import java.util.Set;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.modelversioning.emfprofile.application.decorator.AbstractEMFProfileApplicationDecorator;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.provider.EObjectToDecoratorsMapper;
import org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription;

/**
 * Implementation of the {@link EMFProfileApplicationDecorator} that serves GMF-based editors.
 * 
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a> (initial API and
 *         implementation)
 * @author <a href="mailto:langer@big.tuwien.ac.at">Philip Langer</a>
 *         (generalization to support all GMF-based editors)
 */
@SuppressWarnings("all")
public class GMFProfileApplicationDecorator extends AbstractEMFProfileApplicationDecorator {
  private final EObjectToDecoratorsMapper mapper = EObjectToDecoratorsMapper.INSTANCE;
  
  public void decorate(final GraphicalDecorationDescription graphicalDecorationDescription) {
    this.mapper.decorate(graphicalDecorationDescription);
  }
  
  public void removeDecoration(final GraphicalDecorationDescription graphicalDecorationDescription) {
    this.mapper.removeDecoration(graphicalDecorationDescription);
  }
  
  /**
   * {@inheritDoc}
   */
  public EObject resolveEObjectFromEditorSelection(final Object selection) {
    boolean _equals = Objects.equal(selection, null);
    if (_equals) {
      return null;
    }
    boolean _matched = false;
    if (!_matched) {
      if (selection instanceof IStructuredSelection) {
        final IStructuredSelection _iStructuredSelection = (IStructuredSelection)selection;
        _matched=true;
        Object _firstElement = _iStructuredSelection.getFirstElement();
        final EditPart editPart = ((EditPart) _firstElement);
        final Object model = editPart.getModel();
        boolean _matched_1 = false;
        if (!_matched_1) {
          if (model instanceof View) {
            final View _view = (View)model;
            _matched_1=true;
            return _view.getElement();
          }
        }
      }
    }
    if (!_matched) {
      if (selection instanceof EditPart) {
        final EditPart _editPart = (EditPart)selection;
        _matched=true;
        final Object model = _editPart.getModel();
        boolean _matched_1 = false;
        if (!_matched_1) {
          if (model instanceof View) {
            final View _view = (View)model;
            _matched_1=true;
            return _view.getElement();
          }
        }
      }
    }
    return null;
  }
  
  protected Set<String> provideEditorIds() {
    Set<String> _xblockexpression = null;
    {
      IExtensionRegistry _extensionRegistry = Platform.getExtensionRegistry();
      final IConfigurationElement[] configElements = _extensionRegistry.getConfigurationElementsFor("org.eclipse.ui.editors");
      final Function1<IConfigurationElement,Boolean> _function = new Function1<IConfigurationElement,Boolean>() {
        public Boolean apply(final IConfigurationElement it) {
          boolean _declaresGMFBasedEditor = GMFProfileApplicationDecorator.this.declaresGMFBasedEditor(it);
          return Boolean.valueOf(_declaresGMFBasedEditor);
        }
      };
      Iterable<IConfigurationElement> _filter = IterableExtensions.<IConfigurationElement>filter(((Iterable<IConfigurationElement>)Conversions.doWrapArray(configElements)), _function);
      final Function1<IConfigurationElement,String> _function_1 = new Function1<IConfigurationElement,String>() {
        public String apply(final IConfigurationElement it) {
          String _attribute = it.getAttribute("id");
          return _attribute;
        }
      };
      Iterable<String> _map = IterableExtensions.<IConfigurationElement, String>map(_filter, _function_1);
      Iterable<String> _filterNull = IterableExtensions.<String>filterNull(_map);
      Set<String> _set = IterableExtensions.<String>toSet(_filterNull);
      _xblockexpression = (_set);
    }
    return _xblockexpression;
  }
  
  private boolean declaresGMFBasedEditor(final IConfigurationElement element) {
    IExtension _declaringExtension = element.getDeclaringExtension();
    String _simpleIdentifier = _declaringExtension.getSimpleIdentifier();
    boolean _equal = Objects.equal("gmf-editor", _simpleIdentifier);
    return _equal;
  }
}
