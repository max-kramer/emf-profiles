package org.modelversioning.emfprofile.application.decorator.graphiti.service;

import org.eclipse.graphiti.util.IColorConstant;
import org.modelversioning.emfprofile.application.decorator.graphiti.service.util.DecoratorUtil;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Color;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ColorDecoration;

@SuppressWarnings("all")
public class ColorDecorator extends org.eclipse.graphiti.tb.ColorDecorator {
  public ColorDecorator(final ColorDecoration colorDecoration) {
    Color _background = colorDecoration.getBackground();
    IColorConstant _provideColor = DecoratorUtil.provideColor(_background);
    this.setBackgroundColor(_provideColor);
    Color _foreground = colorDecoration.getForeground();
    IColorConstant _provideColor_1 = DecoratorUtil.provideColor(_foreground);
    this.setForegroundColor(_provideColor_1);
  }
}
