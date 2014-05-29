package org.modelversioning.emfprofile.application.decorator.graphiti.service;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.platform.IDiagramBehavior;
import org.eclipse.graphiti.tb.IDecorator;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.modelversioning.emfprofile.application.decorator.graphiti.service.BorderDecorator;
import org.modelversioning.emfprofile.application.decorator.graphiti.service.ColorDecorator;
import org.modelversioning.emfprofile.application.decorator.graphiti.service.DecorationWithStereotypeApplication;
import org.modelversioning.emfprofile.application.decorator.graphiti.service.ImageDecorator;
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ColorDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BorderDecorationImpl;
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ColorDecorationImpl;
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ImageDecorationImpl;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

@Data
@SuppressWarnings("all")
public class EObjectToDecorationsMapper {
  private final PictogramElement _pictogramElement;
  
  public PictogramElement getPictogramElement() {
    return this._pictogramElement;
  }
  
  private final IDiagramBehavior _diagramBehaviour;
  
  public IDiagramBehavior getDiagramBehaviour() {
    return this._diagramBehaviour;
  }
  
  private final LinkedList<GraphicalDecorationDescription> _gdDescriptions = new Function0<LinkedList<GraphicalDecorationDescription>>() {
    public LinkedList<GraphicalDecorationDescription> apply() {
      LinkedList<GraphicalDecorationDescription> _newLinkedList = Lists.<GraphicalDecorationDescription>newLinkedList();
      return _newLinkedList;
    }
  }.apply();
  
  public LinkedList<GraphicalDecorationDescription> getGdDescriptions() {
    return this._gdDescriptions;
  }
  
  public void addGraphicalDecorationDescriptions(final GraphicalDecorationDescription graphicalDecorationDescription) {
    LinkedList<GraphicalDecorationDescription> _gdDescriptions = this.getGdDescriptions();
    boolean _contains = _gdDescriptions.contains(graphicalDecorationDescription);
    if (_contains) {
      LinkedList<GraphicalDecorationDescription> _gdDescriptions_1 = this.getGdDescriptions();
      LinkedList<GraphicalDecorationDescription> _gdDescriptions_2 = this.getGdDescriptions();
      int _indexOf = _gdDescriptions_2.indexOf(graphicalDecorationDescription);
      _gdDescriptions_1.set(_indexOf, graphicalDecorationDescription);
    } else {
      LinkedList<GraphicalDecorationDescription> _gdDescriptions_3 = this.getGdDescriptions();
      _gdDescriptions_3.add(graphicalDecorationDescription);
    }
    IDiagramBehavior _diagramBehaviour = this.getDiagramBehaviour();
    PictogramElement _pictogramElement = this.getPictogramElement();
    _diagramBehaviour.refreshRenderingDecorators(_pictogramElement);
  }
  
  public void removeGraphicalDecorationDescriptioins(final GraphicalDecorationDescription graphicalDecorationDescription) {
    LinkedList<GraphicalDecorationDescription> _gdDescriptions = this.getGdDescriptions();
    boolean _remove = _gdDescriptions.remove(graphicalDecorationDescription);
    if (_remove) {
      IDiagramBehavior _diagramBehaviour = this.getDiagramBehaviour();
      PictogramElement _pictogramElement = this.getPictogramElement();
      _diagramBehaviour.refreshRenderingDecorators(_pictogramElement);
    }
  }
  
  /**
   * To be called by the decorations provider.
   * This method returns all decorators that should be visible on the pictogram element
   */
  public IDecorator[] getDecorators() {
    BorderDecorator borderDecorator = null;
    ColorDecorator colorDecorator = null;
    LinkedList<GraphicalDecorationDescription> _gdDescriptions = this.getGdDescriptions();
    List<GraphicalDecorationDescription> _reverseView = ListExtensions.<GraphicalDecorationDescription>reverseView(_gdDescriptions);
    final Function1<GraphicalDecorationDescription,Boolean> _function = new Function1<GraphicalDecorationDescription,Boolean>() {
      public Boolean apply(final GraphicalDecorationDescription it) {
        DecorationStatus _decorationStatus = it.getDecorationStatus();
        boolean _equals = Objects.equal(_decorationStatus, DecorationStatus.ACTIVE);
        return Boolean.valueOf(_equals);
      }
    };
    final Iterable<GraphicalDecorationDescription> activeGraphicalDecorationDescriptions = IterableExtensions.<GraphicalDecorationDescription>filter(_reverseView, _function);
    AbstractDecoration tempDecoration = this.findActiveDecoration(BorderDecorationImpl.class, ((GraphicalDecorationDescription[])Conversions.unwrapArray(activeGraphicalDecorationDescriptions, GraphicalDecorationDescription.class)));
    boolean _notEquals = (!Objects.equal(tempDecoration, null));
    if (_notEquals) {
      BorderDecorator _borderDecorator = new BorderDecorator(((BorderDecoration) tempDecoration));
      borderDecorator = _borderDecorator;
    }
    AbstractDecoration _findActiveDecoration = this.findActiveDecoration(ColorDecorationImpl.class, ((GraphicalDecorationDescription[])Conversions.unwrapArray(activeGraphicalDecorationDescriptions, GraphicalDecorationDescription.class)));
    tempDecoration = _findActiveDecoration;
    boolean _notEquals_1 = (!Objects.equal(tempDecoration, null));
    if (_notEquals_1) {
      ColorDecorator _colorDecorator = new ColorDecorator(((ColorDecoration) tempDecoration));
      colorDecorator = _colorDecorator;
    }
    final Collection<DecorationWithStereotypeApplication> tempDecorations = this.findAllActiveDecorations(ImageDecorationImpl.class, ((GraphicalDecorationDescription[])Conversions.unwrapArray(activeGraphicalDecorationDescriptions, GraphicalDecorationDescription.class)));
    final List<IDecorator> decorators = Lists.<IDecorator>newArrayList();
    final Consumer<DecorationWithStereotypeApplication> _function_1 = new Consumer<DecorationWithStereotypeApplication>() {
      public void accept(final DecorationWithStereotypeApplication decoration) {
        AbstractDecoration _decoration = decoration.getDecoration();
        StereotypeApplication _stereotypeApplication = decoration.getStereotypeApplication();
        ImageDecorator _imageDecorator = new ImageDecorator(((ImageDecoration) _decoration), _stereotypeApplication, null);
        decorators.add(_imageDecorator);
      }
    };
    tempDecorations.forEach(_function_1);
    decorators.add(borderDecorator);
    decorators.add(colorDecorator);
    return ((IDecorator[])Conversions.unwrapArray(decorators, IDecorator.class));
  }
  
  private Collection<DecorationWithStereotypeApplication> findAllActiveDecorations(final Class<? extends AbstractDecoration> type, final GraphicalDecorationDescription... graphicalDecorationDescriptions) {
    final ArrayList<DecorationWithStereotypeApplication> activeDecorations = Lists.<DecorationWithStereotypeApplication>newArrayList();
    for (final GraphicalDecorationDescription gdd : graphicalDecorationDescriptions) {
      {
        List<GraphicalDecoration> _decorations = gdd.getDecorations();
        final Collection<DecorationWithStereotypeApplication> tempDecorations = this.findAllActiveDecorations(type, ((GraphicalDecoration[])Conversions.unwrapArray(_decorations, GraphicalDecoration.class)));
        activeDecorations.addAll(tempDecorations);
      }
    }
    return activeDecorations;
  }
  
  private Collection<DecorationWithStereotypeApplication> findAllActiveDecorations(final Class<? extends AbstractDecoration> type, final GraphicalDecoration... graphicalDecorations) {
    final ArrayList<DecorationWithStereotypeApplication> activeDecorations = Lists.<DecorationWithStereotypeApplication>newArrayList();
    for (final GraphicalDecoration gd : graphicalDecorations) {
      boolean _and = false;
      AbstractDecoration _decoration = gd.getDecoration();
      Class<? extends AbstractDecoration> _class = _decoration.getClass();
      boolean _equals = Objects.equal(_class, type);
      if (!_equals) {
        _and = false;
      } else {
        DecorationStatus _decorationStatus = gd.getDecorationStatus();
        boolean _equals_1 = Objects.equal(_decorationStatus, DecorationStatus.ACTIVE);
        _and = (_equals && _equals_1);
      }
      if (_and) {
        AbstractDecoration _decoration_1 = gd.getDecoration();
        StereotypeApplication _stereotypeApplication = gd.getStereotypeApplication();
        DecorationWithStereotypeApplication _decorationWithStereotypeApplication = new DecorationWithStereotypeApplication(_decoration_1, _stereotypeApplication);
        activeDecorations.add(_decorationWithStereotypeApplication);
      }
    }
    return activeDecorations;
  }
  
  private AbstractDecoration findActiveDecoration(final Class<? extends AbstractDecoration> type, final GraphicalDecorationDescription... graphicalDecorationDescriptions) {
    for (final GraphicalDecorationDescription gdd : graphicalDecorationDescriptions) {
      {
        List<GraphicalDecoration> _decorations = gdd.getDecorations();
        final AbstractDecoration tempDecoration = this.findActiveDecoration(type, ((GraphicalDecoration[])Conversions.unwrapArray(_decorations, GraphicalDecoration.class)));
        boolean _notEquals = (!Objects.equal(tempDecoration, null));
        if (_notEquals) {
          return tempDecoration;
        }
      }
    }
    return null;
  }
  
  private AbstractDecoration findActiveDecoration(final Class<? extends AbstractDecoration> type, final GraphicalDecoration... graphicalDecorations) {
    for (final GraphicalDecoration gd : graphicalDecorations) {
      boolean _and = false;
      AbstractDecoration _decoration = gd.getDecoration();
      Class<? extends AbstractDecoration> _class = _decoration.getClass();
      boolean _equals = Objects.equal(_class, type);
      if (!_equals) {
        _and = false;
      } else {
        DecorationStatus _decorationStatus = gd.getDecorationStatus();
        boolean _equals_1 = Objects.equal(_decorationStatus, DecorationStatus.ACTIVE);
        _and = (_equals && _equals_1);
      }
      if (_and) {
        return gd.getDecoration();
      }
    }
    return null;
  }
  
  public EObjectToDecorationsMapper(final PictogramElement pictogramElement, final IDiagramBehavior diagramBehaviour) {
    super();
    this._pictogramElement = pictogramElement;
    this._diagramBehaviour = diagramBehaviour;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_pictogramElement== null) ? 0 : _pictogramElement.hashCode());
    result = prime * result + ((_diagramBehaviour== null) ? 0 : _diagramBehaviour.hashCode());
    result = prime * result + ((_gdDescriptions== null) ? 0 : _gdDescriptions.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    EObjectToDecorationsMapper other = (EObjectToDecorationsMapper) obj;
    if (_pictogramElement == null) {
      if (other._pictogramElement != null)
        return false;
    } else if (!_pictogramElement.equals(other._pictogramElement))
      return false;
    if (_diagramBehaviour == null) {
      if (other._diagramBehaviour != null)
        return false;
    } else if (!_diagramBehaviour.equals(other._diagramBehaviour))
      return false;
    if (_gdDescriptions == null) {
      if (other._gdDescriptions != null)
        return false;
    } else if (!_gdDescriptions.equals(other._gdDescriptions))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
