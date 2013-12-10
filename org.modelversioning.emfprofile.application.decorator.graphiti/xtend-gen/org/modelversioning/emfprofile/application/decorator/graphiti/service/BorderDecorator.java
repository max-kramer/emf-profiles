package org.modelversioning.emfprofile.application.decorator.graphiti.service;

import com.google.common.base.Objects;
import org.eclipse.graphiti.util.IColorConstant;
import org.modelversioning.emfprofile.application.decorator.graphiti.service.util.DecoratorUtil;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Color;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Size;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Style;

@SuppressWarnings("all")
public class BorderDecorator extends org.eclipse.graphiti.tb.BorderDecorator {
  public BorderDecorator(final BorderDecoration borderDecoration) {
    int _xifexpression = (int) 0;
    Size _size = borderDecoration.getSize();
    boolean _notEquals = (!Objects.equal(_size, null));
    if (_notEquals) {
      Size _size_1 = borderDecoration.getSize();
      int _value = _size_1.getValue();
      _xifexpression = _value;
    } else {
      _xifexpression = 1;
    }
    final int size = _xifexpression;
    Color _color = borderDecoration.getColor();
    final IColorConstant color = DecoratorUtil.provideColor(_color);
    Style _style = borderDecoration.getStyle();
    final int style = DecoratorUtil.provideStyle(_style);
    this.setBorderColor(color);
    this.setBorderStyle(Integer.valueOf(style));
    this.setBorderWidth(Integer.valueOf(size));
  }
}
