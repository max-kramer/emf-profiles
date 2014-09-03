package org.modelversioning.emfprofile.application.decorator.graphiti.service;

import com.google.common.base.Objects;
import org.eclipse.graphiti.tb.TextDecorator;
import org.eclipse.graphiti.util.IColorConstant;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.modelversioning.emfprofile.application.decorator.graphiti.service.util.DecoratorUtil;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Color;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Text;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

@SuppressWarnings("all")
public class BoxDecorator extends TextDecorator {
  public BoxDecorator(final String text) {
    super(text);
  }
  
  public BoxDecorator(final BoxDecoration boxDecoration, final StereotypeApplication stereotypeApplicaiton) {
    super(new Function0<String>() {
      public String apply() {
        Text _text = boxDecoration.getText();
        String _provideText = DecoratorUtil.provideText(_text, stereotypeApplicaiton);
        return _provideText;
      }
    }.apply());
    Text _tooltip = boxDecoration.getTooltip();
    String _provideText = DecoratorUtil.provideText(_tooltip, stereotypeApplicaiton);
    this.setMessage(_provideText);
    this.setFontSize(12);
    int _width = boxDecoration.getWidth();
    int _divide = (_width / 2);
    this.setX(_divide);
    int _height = boxDecoration.getHeight();
    int _divide_1 = (_height / 2);
    this.setY(_divide_1);
    Color _foregroundColor = boxDecoration.getForegroundColor();
    boolean _equals = Objects.equal(_foregroundColor, null);
    if (_equals) {
      this.setForegroundColor(IColorConstant.BLACK);
    } else {
      Color _foregroundColor_1 = boxDecoration.getForegroundColor();
      IColorConstant _provideColor = DecoratorUtil.provideColor(_foregroundColor_1);
      this.setForegroundColor(_provideColor);
    }
    Color _backgroundColor = boxDecoration.getBackgroundColor();
    boolean _equals_1 = Objects.equal(_backgroundColor, null);
    if (_equals_1) {
      this.setBackgroundColor(IColorConstant.WHITE);
    } else {
      Color _backgroundColor_1 = boxDecoration.getBackgroundColor();
      IColorConstant _provideColor_1 = DecoratorUtil.provideColor(_backgroundColor_1);
      this.setBackgroundColor(_provideColor_1);
    }
  }
}
