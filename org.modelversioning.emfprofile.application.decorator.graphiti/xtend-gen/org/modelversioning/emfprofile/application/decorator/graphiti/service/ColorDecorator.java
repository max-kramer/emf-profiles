package org.modelversioning.emfprofile.application.decorator.graphiti.service;

import com.google.common.base.Objects;
import org.eclipse.graphiti.util.IColorConstant;
import org.modelversioning.emfprofile.application.decorator.graphiti.service.util.DecoratorUtil;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Color;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ColorDecoration;

@SuppressWarnings("all")
public class ColorDecorator extends org.eclipse.graphiti.tb.ColorDecorator {
  public ColorDecorator(final ColorDecoration colorDecoration) {
    Color _foreground = colorDecoration.getForeground();
    boolean _equals = Objects.equal(_foreground, null);
    if (_equals) {
      this.setForegroundColor(IColorConstant.BLACK);
    } else {
      Color _foreground_1 = colorDecoration.getForeground();
      IColorConstant _provideColor = DecoratorUtil.provideColor(_foreground_1);
      this.setForegroundColor(_provideColor);
    }
    Color _background = colorDecoration.getBackground();
    boolean _equals_1 = Objects.equal(_background, null);
    if (_equals_1) {
      this.setBackgroundColor(IColorConstant.WHITE);
    } else {
      Color _background_1 = colorDecoration.getBackground();
      IColorConstant _provideColor_1 = DecoratorUtil.provideColor(_background_1);
      this.setBackgroundColor(_provideColor_1);
    }
  }
}
