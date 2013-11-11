package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.BorderDecorator;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.HighlightingDecorator;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.IconDecorator;
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractCondition;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Activation;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.IconDecoration;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

@Data
@SuppressWarnings("all")
public class EObjectDecorators {
  private final IDecoratorTarget _decoratorTarget;
  
  public IDecoratorTarget getDecoratorTarget() {
    return this._decoratorTarget;
  }
  
  private final IconDecorator _iconDecorator;
  
  public IconDecorator getIconDecorator() {
    return this._iconDecorator;
  }
  
  private final BorderDecorator _borderDecorator;
  
  public BorderDecorator getBorderDecorator() {
    return this._borderDecorator;
  }
  
  private final HighlightingDecorator _highlightingDecorator;
  
  public HighlightingDecorator getHighlightingDecorator() {
    return this._highlightingDecorator;
  }
  
  public void decorate(final GraphicalDecorationDescription graphicalDecorationDescription) {
    this.printGDD(graphicalDecorationDescription, "ADD");
    IconDecorator _iconDecorator = this.getIconDecorator();
    _iconDecorator.applyDecorations(graphicalDecorationDescription);
    BorderDecorator _borderDecorator = this.getBorderDecorator();
    _borderDecorator.applyDecorations(graphicalDecorationDescription);
  }
  
  public void removeDecoration(final GraphicalDecorationDescription graphicalDecorationDescription) {
    this.printGDD(graphicalDecorationDescription, "ADD");
    IconDecorator _iconDecorator = this.getIconDecorator();
    _iconDecorator.removeAppliedDecorations(graphicalDecorationDescription);
    BorderDecorator _borderDecorator = this.getBorderDecorator();
    _borderDecorator.removeAppliedDecorations(graphicalDecorationDescription);
  }
  
  public void printGDD(final GraphicalDecorationDescription gdd, final String what) {
    StringConcatenation _builder = new StringConcatenation();
    long _currentTimeMillis = System.currentTimeMillis();
    _builder.append(_currentTimeMillis, "");
    _builder.append(" ");
    _builder.append(what, "");
    _builder.append(", ");
    DecorationStatus _decorationStatus = gdd.getDecorationStatus();
    _builder.append(_decorationStatus, "");
    _builder.append(", on ");
    StereotypeApplication _stereotypeApplication = gdd.getStereotypeApplication();
    EObject _appliedTo = _stereotypeApplication.getAppliedTo();
    _builder.append(_appliedTo, "");
    InputOutput.<String>println(_builder.toString());
    DecorationStatus _decorationStatus_1 = gdd.getDecorationStatus();
    boolean _equals = Objects.equal(_decorationStatus_1, DecorationStatus.ACTIVE);
    if (_equals) {
      List<GraphicalDecoration> _decorations = gdd.getDecorations();
      final Procedure1<GraphicalDecoration> _function = new Procedure1<GraphicalDecoration>() {
        public void apply(final GraphicalDecoration gd) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("\t\t");
          DecorationStatus _decorationStatus = gd.getDecorationStatus();
          _builder.append(_decorationStatus, "		");
          _builder.append(", ");
          AbstractDecoration _decoration = gd.getDecoration();
          EClass _eClass = _decoration.eClass();
          String _name = _eClass.getName();
          _builder.append(_name, "		");
          _builder.append(", ");
          String _xifexpression = null;
          AbstractDecoration _decoration_1 = gd.getDecoration();
          if ((_decoration_1 instanceof IconDecoration)) {
            AbstractDecoration _decoration_2 = gd.getDecoration();
            String _location_uri = ((IconDecoration) _decoration_2).getLocation_uri();
            String _plus = ("image: " + _location_uri);
            _xifexpression = _plus;
          } else {
            String _xifexpression_1 = null;
            AbstractDecoration _decoration_3 = gd.getDecoration();
            if ((_decoration_3 instanceof BorderDecoration)) {
              AbstractDecoration _decoration_4 = gd.getDecoration();
              int _size = ((BorderDecoration) _decoration_4).getSize();
              String _plus_1 = ("border: " + Integer.valueOf(_size));
              _xifexpression_1 = _plus_1;
            }
            _xifexpression = _xifexpression_1;
          }
          _builder.append(_xifexpression, "		");
          _builder.append(", ");
          AbstractCondition _xifexpression_2 = null;
          AbstractDecoration _decoration_5 = gd.getDecoration();
          Activation _activation = _decoration_5.getActivation();
          boolean _notEquals = (!Objects.equal(_activation, null));
          if (_notEquals) {
            AbstractDecoration _decoration_6 = gd.getDecoration();
            Activation _activation_1 = _decoration_6.getActivation();
            AbstractCondition _condition = _activation_1.getCondition();
            _xifexpression_2 = _condition;
          }
          _builder.append(_xifexpression_2, "		");
          _builder.append(" ");
          InputOutput.<String>println(_builder.toString());
        }
      };
      IterableExtensions.<GraphicalDecoration>forEach(_decorations, _function);
    }
  }
  
  public EObjectDecorators(final IDecoratorTarget decoratorTarget, final IconDecorator iconDecorator, final BorderDecorator borderDecorator, final HighlightingDecorator highlightingDecorator) {
    super();
    this._decoratorTarget = decoratorTarget;
    this._iconDecorator = iconDecorator;
    this._borderDecorator = borderDecorator;
    this._highlightingDecorator = highlightingDecorator;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_decoratorTarget== null) ? 0 : _decoratorTarget.hashCode());
    result = prime * result + ((_iconDecorator== null) ? 0 : _iconDecorator.hashCode());
    result = prime * result + ((_borderDecorator== null) ? 0 : _borderDecorator.hashCode());
    result = prime * result + ((_highlightingDecorator== null) ? 0 : _highlightingDecorator.hashCode());
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
    EObjectDecorators other = (EObjectDecorators) obj;
    if (_decoratorTarget == null) {
      if (other._decoratorTarget != null)
        return false;
    } else if (!_decoratorTarget.equals(other._decoratorTarget))
      return false;
    if (_iconDecorator == null) {
      if (other._iconDecorator != null)
        return false;
    } else if (!_iconDecorator.equals(other._iconDecorator))
      return false;
    if (_borderDecorator == null) {
      if (other._borderDecorator != null)
        return false;
    } else if (!_borderDecorator.equals(other._borderDecorator))
      return false;
    if (_highlightingDecorator == null) {
      if (other._highlightingDecorator != null)
        return false;
    } else if (!_highlightingDecorator.equals(other._highlightingDecorator))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
