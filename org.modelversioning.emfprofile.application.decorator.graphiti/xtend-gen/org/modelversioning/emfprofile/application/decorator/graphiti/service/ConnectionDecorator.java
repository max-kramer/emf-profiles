package org.modelversioning.emfprofile.application.decorator.graphiti.service;

import com.google.common.base.Objects;
import org.eclipse.graphiti.tb.ColorDecorator;
import org.eclipse.graphiti.util.IColorConstant;
import org.modelversioning.emfprofile.application.decorator.graphiti.service.util.DecoratorUtil;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Color;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ConnectionDecoration;

@SuppressWarnings("all")
public class ConnectionDecorator extends ColorDecorator {
  public ConnectionDecorator(final ConnectionDecoration connectionDecoration) {
    final Color color = connectionDecoration.getColor();
    boolean _notEquals = (!Objects.equal(color, null));
    if (_notEquals) {
      IColorConstant _provideColor = DecoratorUtil.provideColor(color);
      this.setForegroundColor(_provideColor);
      IColorConstant _provideColor_1 = DecoratorUtil.provideColor(color);
      this.setBackgroundColor(_provideColor_1);
    }
  }
}
