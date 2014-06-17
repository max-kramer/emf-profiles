package org.modelversioning.emfprofile.application.decorator.graphiti.service;

import com.google.common.base.Objects;
import org.eclipse.graphiti.util.IColorConstant;
import org.modelversioning.emfprofile.application.decorator.graphiti.service.util.DecoratorUtil;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Border;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Color;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Size;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Style;

@SuppressWarnings("all")
public class BorderDecorator extends org.eclipse.graphiti.tb.BorderDecorator {
  public BorderDecorator(final BorderDecoration borderDecoration) {
    int _xifexpression = (int) 0;
    Border _border = borderDecoration.getBorder();
    Size _size = _border.getSize();
    boolean _notEquals = (!Objects.equal(_size, null));
    if (_notEquals) {
      Border _border_1 = borderDecoration.getBorder();
      Size _size_1 = _border_1.getSize();
      int _value = _size_1.getValue();
      _xifexpression = _value;
    } else {
      _xifexpression = 1;
    }
    final int size = _xifexpression;
    Border _border_2 = borderDecoration.getBorder();
    Color _color = _border_2.getColor();
    final IColorConstant color = DecoratorUtil.provideColor(_color);
    Border _border_3 = borderDecoration.getBorder();
    Style _style = _border_3.getStyle();
    final int style = DecoratorUtil.provideStyle(_style);
    this.setBorderColor(color);
    this.setBorderStyle(Integer.valueOf(style));
    this.setBorderWidth(Integer.valueOf(size));
  }
}
