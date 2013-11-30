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
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.BackgroundDecorator;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.BorderDecorator;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.ConnectionDecorator;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.ForegroundDecorator;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.HighlightingDecorator;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.ImageDecorator;
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractCondition;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Activation;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BackgroundDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Color;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ConnectionDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ForegroundDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Size;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Style;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

@Data
@SuppressWarnings("all")
public class EObjectDecorators {
  private final IDecoratorTarget _decoratorTarget;
  
  public IDecoratorTarget getDecoratorTarget() {
    return this._decoratorTarget;
  }
  
  private final ImageDecorator _iconDecorator;
  
  public ImageDecorator getIconDecorator() {
    return this._iconDecorator;
  }
  
  private final BorderDecorator _borderDecorator;
  
  public BorderDecorator getBorderDecorator() {
    return this._borderDecorator;
  }
  
  private final BackgroundDecorator _backgroundDecorator;
  
  public BackgroundDecorator getBackgroundDecorator() {
    return this._backgroundDecorator;
  }
  
  private final ForegroundDecorator _foregroundDecorator;
  
  public ForegroundDecorator getForegroundDecorator() {
    return this._foregroundDecorator;
  }
  
  private final ConnectionDecorator _connectionDecorator;
  
  public ConnectionDecorator getConnectionDecorator() {
    return this._connectionDecorator;
  }
  
  private final HighlightingDecorator _highlightingDecorator;
  
  public HighlightingDecorator getHighlightingDecorator() {
    return this._highlightingDecorator;
  }
  
  public void decorate(final GraphicalDecorationDescription graphicalDecorationDescription) {
    this.printGDD(graphicalDecorationDescription, "ADD");
    ImageDecorator _iconDecorator = this.getIconDecorator();
    _iconDecorator.applyDecorations(graphicalDecorationDescription);
    BorderDecorator _borderDecorator = this.getBorderDecorator();
    _borderDecorator.applyDecorations(graphicalDecorationDescription);
    BackgroundDecorator _backgroundDecorator = this.getBackgroundDecorator();
    _backgroundDecorator.applyDecorations(graphicalDecorationDescription);
    ForegroundDecorator _foregroundDecorator = this.getForegroundDecorator();
    _foregroundDecorator.applyDecorations(graphicalDecorationDescription);
    ConnectionDecorator _connectionDecorator = this.getConnectionDecorator();
    _connectionDecorator.applyDecorations(graphicalDecorationDescription);
  }
  
  public void removeDecoration(final GraphicalDecorationDescription graphicalDecorationDescription) {
    this.printGDD(graphicalDecorationDescription, "REMOVE");
    ImageDecorator _iconDecorator = this.getIconDecorator();
    _iconDecorator.removeAppliedDecorations(graphicalDecorationDescription);
    BorderDecorator _borderDecorator = this.getBorderDecorator();
    _borderDecorator.removeAppliedDecorations(graphicalDecorationDescription);
    BackgroundDecorator _backgroundDecorator = this.getBackgroundDecorator();
    _backgroundDecorator.removeAppliedDecorations(graphicalDecorationDescription);
    ForegroundDecorator _foregroundDecorator = this.getForegroundDecorator();
    _foregroundDecorator.removeAppliedDecorations(graphicalDecorationDescription);
    ConnectionDecorator _connectionDecorator = this.getConnectionDecorator();
    _connectionDecorator.removeAppliedDecorations(graphicalDecorationDescription);
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
          StringBuilder _stringBuilder = new StringBuilder();
          final StringBuilder sb = _stringBuilder;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("\t\t");
          DecorationStatus _decorationStatus = gd.getDecorationStatus();
          _builder.append(_decorationStatus, "		");
          _builder.append(", ");
          AbstractDecoration _decoration = gd.getDecoration();
          EClass _eClass = _decoration.eClass();
          String _name = _eClass.getName();
          _builder.append(_name, "		");
          _builder.append(",");
          sb.append(_builder);
          AbstractDecoration _decoration_1 = gd.getDecoration();
          if ((_decoration_1 instanceof ImageDecoration)) {
            AbstractDecoration _decoration_2 = gd.getDecoration();
            String _location_uri = ((ImageDecoration) _decoration_2).getLocation_uri();
            String _plus = ("image: " + _location_uri);
            sb.append(_plus);
          } else {
            AbstractDecoration _decoration_3 = gd.getDecoration();
            if ((_decoration_3 instanceof BorderDecoration)) {
              AbstractDecoration _decoration_4 = gd.getDecoration();
              Size _size = ((BorderDecoration) _decoration_4).getSize();
              String _plus_1 = ("border: " + _size);
              sb.append(_plus_1);
            } else {
              AbstractDecoration _decoration_5 = gd.getDecoration();
              if ((_decoration_5 instanceof BackgroundDecoration)) {
                AbstractDecoration _decoration_6 = gd.getDecoration();
                Color _color = ((BackgroundDecoration) _decoration_6).getColor();
                String _plus_2 = ("background: " + _color);
                sb.append(_plus_2);
              } else {
                AbstractDecoration _decoration_7 = gd.getDecoration();
                if ((_decoration_7 instanceof ForegroundDecoration)) {
                  AbstractDecoration _decoration_8 = gd.getDecoration();
                  Color _color_1 = ((ForegroundDecoration) _decoration_8).getColor();
                  String _plus_3 = ("foreground: " + _color_1);
                  sb.append(_plus_3);
                } else {
                  AbstractDecoration _decoration_9 = gd.getDecoration();
                  if ((_decoration_9 instanceof ConnectionDecoration)) {
                    String _plus_4 = ("connection: " + "size=");
                    AbstractDecoration _decoration_10 = gd.getDecoration();
                    Size _size_1 = ((ConnectionDecoration) _decoration_10).getSize();
                    String _plus_5 = (_plus_4 + _size_1);
                    String _plus_6 = (_plus_5 + ", foreground-color=");
                    AbstractDecoration _decoration_11 = gd.getDecoration();
                    Color _foregroundColor = ((ConnectionDecoration) _decoration_11).getForegroundColor();
                    String _plus_7 = (_plus_6 + _foregroundColor);
                    String _plus_8 = (_plus_7 + ", line-style=");
                    AbstractDecoration _decoration_12 = gd.getDecoration();
                    Style _style = ((ConnectionDecoration) _decoration_12).getStyle();
                    String _plus_9 = (_plus_8 + _style);
                    sb.append(_plus_9);
                  }
                }
              }
            }
          }
          AbstractDecoration _decoration_13 = gd.getDecoration();
          Activation _activation = _decoration_13.getActivation();
          boolean _notEquals = (!Objects.equal(_activation, null));
          if (_notEquals) {
            AbstractDecoration _decoration_14 = gd.getDecoration();
            Activation _activation_1 = _decoration_14.getActivation();
            AbstractCondition _condition = _activation_1.getCondition();
            sb.append(_condition);
          }
          String _string = sb.toString();
          InputOutput.<String>println(_string);
        }
      };
      IterableExtensions.<GraphicalDecoration>forEach(_decorations, _function);
    }
  }
  
  public EObjectDecorators(final IDecoratorTarget decoratorTarget, final ImageDecorator iconDecorator, final BorderDecorator borderDecorator, final BackgroundDecorator backgroundDecorator, final ForegroundDecorator foregroundDecorator, final ConnectionDecorator connectionDecorator, final HighlightingDecorator highlightingDecorator) {
    super();
    this._decoratorTarget = decoratorTarget;
    this._iconDecorator = iconDecorator;
    this._borderDecorator = borderDecorator;
    this._backgroundDecorator = backgroundDecorator;
    this._foregroundDecorator = foregroundDecorator;
    this._connectionDecorator = connectionDecorator;
    this._highlightingDecorator = highlightingDecorator;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_decoratorTarget== null) ? 0 : _decoratorTarget.hashCode());
    result = prime * result + ((_iconDecorator== null) ? 0 : _iconDecorator.hashCode());
    result = prime * result + ((_borderDecorator== null) ? 0 : _borderDecorator.hashCode());
    result = prime * result + ((_backgroundDecorator== null) ? 0 : _backgroundDecorator.hashCode());
    result = prime * result + ((_foregroundDecorator== null) ? 0 : _foregroundDecorator.hashCode());
    result = prime * result + ((_connectionDecorator== null) ? 0 : _connectionDecorator.hashCode());
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
    if (_backgroundDecorator == null) {
      if (other._backgroundDecorator != null)
        return false;
    } else if (!_backgroundDecorator.equals(other._backgroundDecorator))
      return false;
    if (_foregroundDecorator == null) {
      if (other._foregroundDecorator != null)
        return false;
    } else if (!_foregroundDecorator.equals(other._foregroundDecorator))
      return false;
    if (_connectionDecorator == null) {
      if (other._connectionDecorator != null)
        return false;
    } else if (!_connectionDecorator.equals(other._connectionDecorator))
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
