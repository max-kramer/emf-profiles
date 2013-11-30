package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service;

import com.google.common.base.Objects;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.swt.graphics.Color;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.AbstractOnlyOneDecorationDecorator;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ForegroundDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ForegroundDecorationImpl;

@SuppressWarnings("all")
public class ForegroundDecorator extends AbstractOnlyOneDecorationDecorator {
  public final static String KEY = "PROFILE_APPLICATION_FOREGROUND_DECORATION";
  
  private Color originalForegroundColor = null;
  
  public ForegroundDecorator(final IDecoratorTarget decoratorTarget) {
    super(decoratorTarget);
  }
  
  public void refresh() {
    IGraphicalEditPart _targetEditPart = this.getTargetEditPart();
    if ((_targetEditPart instanceof AbstractConnectionEditPart)) {
      return;
    }
    IGraphicalEditPart _targetEditPart_1 = this.getTargetEditPart();
    final IFigure currentFigure = this.getFigureForColoring(_targetEditPart_1);
    final Color currentForegroundColor = currentFigure.getForegroundColor();
    boolean _equals = Objects.equal(this.originalForegroundColor, null);
    if (_equals) {
      this.originalForegroundColor = currentForegroundColor;
    }
    AbstractDecoration _abstractDecorationWithHighestPrecedence = this.getAbstractDecorationWithHighestPrecedence();
    final ForegroundDecoration foregroundDecoration = ((ForegroundDecoration) _abstractDecorationWithHighestPrecedence);
    boolean _equals_1 = Objects.equal(foregroundDecoration, null);
    if (_equals_1) {
      boolean _colorEqual = this.colorEqual(currentForegroundColor, this.originalForegroundColor);
      boolean _not = (!_colorEqual);
      if (_not) {
        this.setForegroundColor(this.originalForegroundColor);
      }
    } else {
      org.modelversioning.emfprofile.decoration.decorationLanguage.Color _color = foregroundDecoration.getColor();
      boolean _equals_2 = Objects.equal(_color, null);
      if (_equals_2) {
        boolean _colorEqual_1 = this.colorEqual(currentForegroundColor, this.originalForegroundColor);
        boolean _not_1 = (!_colorEqual_1);
        if (_not_1) {
          this.setForegroundColor(this.originalForegroundColor);
        }
      } else {
        org.modelversioning.emfprofile.decoration.decorationLanguage.Color _color_1 = foregroundDecoration.getColor();
        final Color color = this.provideColor(_color_1);
        boolean _colorEqual_2 = this.colorEqual(color, currentForegroundColor);
        boolean _not_2 = (!_colorEqual_2);
        if (_not_2) {
          this.setForegroundColor(color);
        }
      }
    }
  }
  
  public Class<? extends AbstractDecoration> getDecorationType() {
    return ForegroundDecorationImpl.class;
  }
  
  private void setForegroundColor(final Color color) {
    IGraphicalEditPart _targetEditPart = this.getTargetEditPart();
    IFigure _figureForColoring = this.getFigureForColoring(_targetEditPart);
    _figureForColoring.setForegroundColor(color);
    IGraphicalEditPart _targetEditPart_1 = this.getTargetEditPart();
    IFigure _figureForColoring_1 = this.getFigureForColoring(_targetEditPart_1);
    _figureForColoring_1.setOpaque(false);
  }
}
