package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service;

import com.google.common.base.Objects;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.swt.graphics.Color;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.AbstractOnlyOneDecorationDecorator;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ColorDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ColorDecorationImpl;

@SuppressWarnings("all")
public class ColorDecorator extends AbstractOnlyOneDecorationDecorator {
  public final static String KEY = "PROFILE_APPLICATION_COLOR_DECORATION";
  
  private Color originalBackgroundColor = null;
  
  private Color originalForegroundColor = null;
  
  public ColorDecorator(final IDecoratorTarget decoratorTarget) {
    super(decoratorTarget);
  }
  
  public void refresh() {
    IGraphicalEditPart _targetEditPart = this.getTargetEditPart();
    if ((_targetEditPart instanceof AbstractConnectionEditPart)) {
      return;
    }
    IGraphicalEditPart _targetEditPart_1 = this.getTargetEditPart();
    final IFigure currentFigure = this.getFigureForColoring(_targetEditPart_1);
    IFigure _rightFigureForBackgroundColoring = this.getRightFigureForBackgroundColoring();
    final Color currentBackgroundColor = _rightFigureForBackgroundColoring.getBackgroundColor();
    boolean _equals = Objects.equal(this.originalBackgroundColor, null);
    if (_equals) {
      this.originalBackgroundColor = currentBackgroundColor;
    }
    AbstractDecoration _abstractDecorationWithHighestPrecedence = this.getAbstractDecorationWithHighestPrecedence();
    final ColorDecoration colorDecoration = ((ColorDecoration) _abstractDecorationWithHighestPrecedence);
    boolean _equals_1 = Objects.equal(colorDecoration, null);
    if (_equals_1) {
      boolean _colorEqual = this.colorEqual(currentBackgroundColor, this.originalBackgroundColor);
      boolean _not = (!_colorEqual);
      if (_not) {
        this.setBackgroundColor(this.originalBackgroundColor);
      }
    } else {
      org.modelversioning.emfprofile.decoration.decorationLanguage.Color _background = colorDecoration.getBackground();
      boolean _equals_2 = Objects.equal(_background, null);
      if (_equals_2) {
        boolean _colorEqual_1 = this.colorEqual(currentBackgroundColor, this.originalBackgroundColor);
        boolean _not_1 = (!_colorEqual_1);
        if (_not_1) {
          this.setBackgroundColor(this.originalBackgroundColor);
        }
      } else {
        org.modelversioning.emfprofile.decoration.decorationLanguage.Color _background_1 = colorDecoration.getBackground();
        final Color color = this.provideColor(_background_1);
        boolean _colorEqual_2 = this.colorEqual(color, currentBackgroundColor);
        boolean _not_2 = (!_colorEqual_2);
        if (_not_2) {
          this.setBackgroundColor(color);
        }
      }
    }
    final Color currentForegroundColor = currentFigure.getForegroundColor();
    boolean _equals_3 = Objects.equal(this.originalForegroundColor, null);
    if (_equals_3) {
      this.originalForegroundColor = currentForegroundColor;
    }
    boolean _equals_4 = Objects.equal(colorDecoration, null);
    if (_equals_4) {
      boolean _colorEqual_3 = this.colorEqual(currentForegroundColor, this.originalForegroundColor);
      boolean _not_3 = (!_colorEqual_3);
      if (_not_3) {
        this.setForegroundColor(this.originalForegroundColor);
      }
    } else {
      org.modelversioning.emfprofile.decoration.decorationLanguage.Color _foreground = colorDecoration.getForeground();
      boolean _equals_5 = Objects.equal(_foreground, null);
      if (_equals_5) {
        boolean _colorEqual_4 = this.colorEqual(currentForegroundColor, this.originalForegroundColor);
        boolean _not_4 = (!_colorEqual_4);
        if (_not_4) {
          this.setForegroundColor(this.originalForegroundColor);
        }
      } else {
        org.modelversioning.emfprofile.decoration.decorationLanguage.Color _foreground_1 = colorDecoration.getForeground();
        final Color color_1 = this.provideColor(_foreground_1);
        boolean _colorEqual_5 = this.colorEqual(color_1, currentForegroundColor);
        boolean _not_5 = (!_colorEqual_5);
        if (_not_5) {
          this.setForegroundColor(color_1);
        }
      }
    }
  }
  
  public Class<? extends AbstractDecoration> getDecorationType() {
    return ColorDecorationImpl.class;
  }
  
  private void setBackgroundColor(final Color color) {
    final IFigure figure = this.getRightFigureForBackgroundColoring();
    figure.setBackgroundColor(color);
    figure.setOpaque(false);
  }
  
  private void setForegroundColor(final Color color) {
    IGraphicalEditPart _targetEditPart = this.getTargetEditPart();
    IFigure _figureForColoring = this.getFigureForColoring(_targetEditPart);
    _figureForColoring.setForegroundColor(color);
    IGraphicalEditPart _targetEditPart_1 = this.getTargetEditPart();
    IFigure _figureForColoring_1 = this.getFigureForColoring(_targetEditPart_1);
    _figureForColoring_1.setOpaque(false);
  }
  
  private IFigure getRightFigureForBackgroundColoring() {
    IGraphicalEditPart _targetEditPart = this.getTargetEditPart();
    return this.getFigureForColoring(_targetEditPart);
  }
}
