package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service;

import com.google.common.base.Objects;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.swt.graphics.Color;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.AbstractOnlyOneDecorationDecorator;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BackgroundDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BackgroundDecorationImpl;

@SuppressWarnings("all")
public class BackgroundDecorator extends AbstractOnlyOneDecorationDecorator {
  public final static String KEY = "PROFILE_APPLICATION_BACKGROUND_DECORATION";
  
  private Color originalBackgroundColor = null;
  
  public BackgroundDecorator(final IDecoratorTarget decoratorTarget) {
    super(decoratorTarget);
  }
  
  public void refresh() {
    IGraphicalEditPart _targetEditPart = this.getTargetEditPart();
    if ((_targetEditPart instanceof AbstractConnectionEditPart)) {
      return;
    }
    IFigure _rightFigureForBackgroundColoring = this.getRightFigureForBackgroundColoring();
    final Color currentBackgroundColor = _rightFigureForBackgroundColoring.getBackgroundColor();
    boolean _equals = Objects.equal(this.originalBackgroundColor, null);
    if (_equals) {
      this.originalBackgroundColor = currentBackgroundColor;
    }
    AbstractDecoration _abstractDecorationWithHighestPrecedence = this.getAbstractDecorationWithHighestPrecedence();
    final BackgroundDecoration backgroundDecoration = ((BackgroundDecoration) _abstractDecorationWithHighestPrecedence);
    boolean _equals_1 = Objects.equal(backgroundDecoration, null);
    if (_equals_1) {
      boolean _colorEqual = this.colorEqual(currentBackgroundColor, this.originalBackgroundColor);
      boolean _not = (!_colorEqual);
      if (_not) {
        this.setBackgroundColor(this.originalBackgroundColor);
      }
    } else {
      org.modelversioning.emfprofile.decoration.decorationLanguage.Color _color = backgroundDecoration.getColor();
      boolean _equals_2 = Objects.equal(_color, null);
      if (_equals_2) {
        boolean _colorEqual_1 = this.colorEqual(currentBackgroundColor, this.originalBackgroundColor);
        boolean _not_1 = (!_colorEqual_1);
        if (_not_1) {
          this.setBackgroundColor(this.originalBackgroundColor);
        }
      } else {
        org.modelversioning.emfprofile.decoration.decorationLanguage.Color _color_1 = backgroundDecoration.getColor();
        final Color color = this.provideColor(_color_1);
        boolean _colorEqual_2 = this.colorEqual(color, currentBackgroundColor);
        boolean _not_2 = (!_colorEqual_2);
        if (_not_2) {
          this.setBackgroundColor(color);
        }
      }
    }
  }
  
  public Class<? extends AbstractDecoration> getDecorationType() {
    return BackgroundDecorationImpl.class;
  }
  
  private void setBackgroundColor(final Color color) {
    final IFigure figure = this.getRightFigureForBackgroundColoring();
    figure.setBackgroundColor(color);
    figure.setOpaque(false);
  }
  
  private IFigure getRightFigureForBackgroundColoring() {
    IGraphicalEditPart _targetEditPart = this.getTargetEditPart();
    return this.getFigureForColoring(_targetEditPart);
  }
}
