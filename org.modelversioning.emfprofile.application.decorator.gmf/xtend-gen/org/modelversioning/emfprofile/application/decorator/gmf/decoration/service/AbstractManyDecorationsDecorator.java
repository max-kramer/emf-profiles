package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service;

import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.Decoration;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.AbstractDecorator;
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ComplexText;
import org.modelversioning.emfprofile.decoration.decorationLanguage.SimpleText;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Text;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

@SuppressWarnings("all")
public abstract class AbstractManyDecorationsDecorator extends AbstractDecorator {
  public AbstractManyDecorationsDecorator(final IDecoratorTarget decoratorTarget) {
    super(decoratorTarget);
  }
  
  /**
   * holding references of visualized decorations
   */
  protected final Set<Decoration> decorationsOnEObject = new Function0<Set<Decoration>>() {
    public Set<Decoration> apply() {
      HashSet<Decoration> _newHashSet = Sets.<Decoration>newHashSet();
      return _newHashSet;
    }
  }.apply();
  
  public final static Map<URI,Image> imageRegistry = new Function0<Map<URI,Image>>() {
    public Map<URI,Image> apply() {
      HashMap<URI,Image> _newHashMap = Maps.<URI, Image>newHashMap();
      return _newHashMap;
    }
  }.apply();
  
  public Image getIcon(final String uri) {
    try {
      final URI imageURI = URI.createURI(uri);
      boolean _containsKey = AbstractManyDecorationsDecorator.imageRegistry.containsKey(imageURI);
      if (_containsKey) {
        return AbstractManyDecorationsDecorator.imageRegistry.get(imageURI);
      }
      String _string = imageURI.toString();
      URL _uRL = new URL(_string);
      final ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL(_uRL);
      final Image image = imageDescriptor.createImage();
      AbstractManyDecorationsDecorator.imageRegistry.put(imageURI, image);
      return image;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String getText(final Text text, final StereotypeApplication stereotypeApplication) {
    boolean _matched = false;
    if (!_matched) {
      if (text instanceof SimpleText) {
        final SimpleText _simpleText = (SimpleText)text;
        _matched=true;
        EAttribute _attribute = _simpleText.getAttribute();
        boolean _notEquals = (!Objects.equal(_attribute, null));
        if (_notEquals) {
          EClass _eClass = stereotypeApplication.eClass();
          EList<EAttribute> _eAllAttributes = _eClass.getEAllAttributes();
          final Function1<EAttribute,Boolean> _function = new Function1<EAttribute,Boolean>() {
            public Boolean apply(final EAttribute it) {
              String _name = it.getName();
              EAttribute _attribute = _simpleText.getAttribute();
              String _name_1 = _attribute.getName();
              boolean _equals = Objects.equal(_name, _name_1);
              return Boolean.valueOf(_equals);
            }
          };
          final EAttribute attribute = IterableExtensions.<EAttribute>findFirst(_eAllAttributes, _function);
          Object _eGet = stereotypeApplication.eGet(attribute);
          return String.valueOf(_eGet);
        } else {
          return _simpleText.getText();
        }
      }
    }
    if (!_matched) {
      if (text instanceof ComplexText) {
        final ComplexText _complexText = (ComplexText)text;
        _matched=true;
        SimpleText _left = _complexText.getLeft();
        String _text = this.getText(_left, stereotypeApplication);
        Text _right = _complexText.getRight();
        String _text_1 = this.getText(_right, stereotypeApplication);
        return (_text + _text_1);
      }
    }
    return "";
  }
  
  public void deactivate() {
    super.deactivate();
    final Consumer<Decoration> _function = new Consumer<Decoration>() {
      public void accept(final Decoration decoration) {
        AbstractManyDecorationsDecorator.this.processRemoveDecoration(decoration);
      }
    };
    this.decorationsOnEObject.forEach(_function);
    this.decorationsOnEObject.clear();
  }
  
  public void refresh() {
    this.removeVisualizedDecorations();
    this.visualizeDecorations();
  }
  
  private void removeVisualizedDecorations() {
    final Consumer<Decoration> _function = new Consumer<Decoration>() {
      public void accept(final Decoration d) {
        AbstractManyDecorationsDecorator.this.processRemoveDecoration(d);
      }
    };
    this.decorationsOnEObject.forEach(_function);
    this.decorationsOnEObject.clear();
  }
  
  private void visualizeDecorations() {
    Collection<GraphicalDecorationDescription> _values = this.graphicalDecorationDescriptions.values();
    final Consumer<GraphicalDecorationDescription> _function = new Consumer<GraphicalDecorationDescription>() {
      public void accept(final GraphicalDecorationDescription graphicalDecorationDescription) {
        DecorationStatus _decorationStatus = graphicalDecorationDescription.getDecorationStatus();
        boolean _equals = Objects.equal(_decorationStatus, DecorationStatus.ACTIVE);
        if (_equals) {
          Class<? extends AbstractDecoration> _decorationType = AbstractManyDecorationsDecorator.this.getDecorationType();
          List<GraphicalDecoration> _graphicalDecorations = AbstractManyDecorationsDecorator.this.getGraphicalDecorations(graphicalDecorationDescription, _decorationType);
          final Consumer<GraphicalDecoration> _function = new Consumer<GraphicalDecoration>() {
            public void accept(final GraphicalDecoration gd) {
              final DecorationStatus decorationStatus = gd.getDecorationStatus();
              boolean _matched = false;
              if (!_matched) {
                boolean _equals = Objects.equal(decorationStatus, DecorationStatus.ACTIVE);
                if (_equals) {
                  _matched=true;
                  Decoration _processAddDecoration = AbstractManyDecorationsDecorator.this.processAddDecoration(gd);
                  AbstractManyDecorationsDecorator.this.decorationsOnEObject.add(_processAddDecoration);
                }
              }
              if (!_matched) {
                boolean _equals_1 = Objects.equal(decorationStatus, DecorationStatus.INANCTIVE);
                if (_equals_1) {
                  _matched=true;
                }
              }
              if (!_matched) {
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("Unknown decoration status: ");
                _builder.append(decorationStatus, "");
                IllegalStateException _illegalStateException = new IllegalStateException(_builder.toString());
                throw _illegalStateException;
              }
            }
          };
          _graphicalDecorations.forEach(_function);
        }
      }
    };
    _values.forEach(_function);
  }
  
  /**
   * instructs the decorator to visualize the decoration on the decoration target.
   */
  public abstract Decoration processAddDecoration(final GraphicalDecoration graphicalDecoration);
  
  /**
   * instructs the decorator to remove the visualized decoration from the decoration target.
   */
  public abstract void processRemoveDecoration(final Decoration decoration);
}
