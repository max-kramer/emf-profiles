package org.modelversioning.emfprofile.application.decorator.graphiti.service.util;

import com.google.common.base.Objects;
import org.eclipse.draw2d.Graphics;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.graphiti.util.IColorConstant;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Color;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ColorConstant;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Colors;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ComplexText;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ConcreteColor;
import org.modelversioning.emfprofile.decoration.decorationLanguage.LineStyle;
import org.modelversioning.emfprofile.decoration.decorationLanguage.SimpleText;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Style;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Text;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

@SuppressWarnings("all")
public class DecoratorUtil {
  private DecoratorUtil() {
  }
  
  /**
   * utility method to convert colors from decoration description language to types acceptable by Graphiti
   */
  public static IColorConstant provideColor(final Color color) {
    boolean _equals = Objects.equal(color, null);
    if (_equals) {
      return IColorConstant.BLACK;
    }
    final ConcreteColor concreteColor = color.getConcrete();
    boolean _notEquals = (!Objects.equal(concreteColor, null));
    if (_notEquals) {
      return IColorConstant.BLACK;
    } else {
      final ColorConstant constantColor = color.getValue();
      boolean _equals_1 = Objects.equal(constantColor, null);
      if (_equals_1) {
        return IColorConstant.RED;
      }
      final Colors colorCode = constantColor.getValue();
      boolean _matched = false;
      if (!_matched) {
        boolean _equals_2 = Objects.equal(colorCode, Colors.BLACK);
        if (_equals_2) {
          _matched=true;
          return IColorConstant.BLACK;
        }
      }
      if (!_matched) {
        boolean _equals_3 = Objects.equal(colorCode, Colors.BLUE);
        if (_equals_3) {
          _matched=true;
          return IColorConstant.BLUE;
        }
      }
      if (!_matched) {
        boolean _equals_4 = Objects.equal(colorCode, Colors.BLUE_DARK);
        if (_equals_4) {
          _matched=true;
          return IColorConstant.DARK_BLUE;
        }
      }
      if (!_matched) {
        boolean _equals_5 = Objects.equal(colorCode, Colors.BLUE_LIGHT);
        if (_equals_5) {
          _matched=true;
          return IColorConstant.LIGHT_BLUE;
        }
      }
      if (!_matched) {
        boolean _equals_6 = Objects.equal(colorCode, Colors.CYAN);
        if (_equals_6) {
          _matched=true;
          return IColorConstant.CYAN;
        }
      }
      if (!_matched) {
        boolean _equals_7 = Objects.equal(colorCode, Colors.GRAY);
        if (_equals_7) {
          _matched=true;
          return IColorConstant.GRAY;
        }
      }
      if (!_matched) {
        boolean _equals_8 = Objects.equal(colorCode, Colors.GRAY_DARK);
        if (_equals_8) {
          _matched=true;
          return IColorConstant.DARK_GRAY;
        }
      }
      if (!_matched) {
        boolean _equals_9 = Objects.equal(colorCode, Colors.GRAY_LIGHT);
        if (_equals_9) {
          _matched=true;
          return IColorConstant.LIGHT_GRAY;
        }
      }
      if (!_matched) {
        boolean _equals_10 = Objects.equal(colorCode, Colors.GREEN);
        if (_equals_10) {
          _matched=true;
          return IColorConstant.GREEN;
        }
      }
      if (!_matched) {
        boolean _equals_11 = Objects.equal(colorCode, Colors.GREEN_DARK);
        if (_equals_11) {
          _matched=true;
          return IColorConstant.DARK_GREEN;
        }
      }
      if (!_matched) {
        boolean _equals_12 = Objects.equal(colorCode, Colors.GREEN_LIGHT);
        if (_equals_12) {
          _matched=true;
          return IColorConstant.LIGHT_GREEN;
        }
      }
      if (!_matched) {
        boolean _equals_13 = Objects.equal(colorCode, Colors.ORANGE);
        if (_equals_13) {
          _matched=true;
          return IColorConstant.ORANGE;
        }
      }
      if (!_matched) {
        boolean _equals_14 = Objects.equal(colorCode, Colors.RED);
        if (_equals_14) {
          _matched=true;
          return IColorConstant.RED;
        }
      }
      if (!_matched) {
        boolean _equals_15 = Objects.equal(colorCode, Colors.WHITE);
        if (_equals_15) {
          _matched=true;
          return IColorConstant.WHITE;
        }
      }
      if (!_matched) {
        boolean _equals_16 = Objects.equal(colorCode, Colors.YELLOW);
        if (_equals_16) {
          _matched=true;
          return IColorConstant.YELLOW;
        }
      }
      return IColorConstant.BLACK;
    }
  }
  
  /**
   * utility method to convert styles from decoration description language to types acceptable by GMF
   */
  public static int provideStyle(final Style style) {
    int _xblockexpression = (int) 0;
    {
      boolean _equals = Objects.equal(style, null);
      if (_equals) {
        return Graphics.LINE_SOLID;
      }
      final LineStyle ls = style.getValue();
      int _switchResult = (int) 0;
      boolean _matched = false;
      if (!_matched) {
        boolean _equals_1 = Objects.equal(ls, LineStyle.LINE_DASH);
        if (_equals_1) {
          _matched=true;
          return Graphics.LINE_DASH;
        }
      }
      if (!_matched) {
        boolean _equals_2 = Objects.equal(ls, LineStyle.LINE_DASHDOT);
        if (_equals_2) {
          _matched=true;
          return Graphics.LINE_DASHDOT;
        }
      }
      if (!_matched) {
        boolean _equals_3 = Objects.equal(ls, LineStyle.LINE_DASHDOTDOT);
        if (_equals_3) {
          _matched=true;
          return Graphics.LINE_DASHDOTDOT;
        }
      }
      if (!_matched) {
        boolean _equals_4 = Objects.equal(ls, LineStyle.LINE_DOT);
        if (_equals_4) {
          _matched=true;
          return Graphics.LINE_DOT;
        }
      }
      if (!_matched) {
        boolean _equals_5 = Objects.equal(ls, LineStyle.LINE_SOLID);
        if (_equals_5) {
          _matched=true;
          return Graphics.LINE_SOLID;
        }
      }
      if (!_matched) {
        _switchResult = Graphics.LINE_SOLID;
      }
      _xblockexpression = (_switchResult);
    }
    return _xblockexpression;
  }
  
  /**
   * utility method to produce text from decoration description language text for the stereotype application
   */
  public static String provideText(final Text text, final StereotypeApplication stereotypeApplication) {
    boolean _matched = false;
    if (!_matched) {
      if (text instanceof SimpleText) {
        final SimpleText _simpleText = (SimpleText)text;
        _matched=true;
        EAttribute _attribute = _simpleText.getAttribute();
        boolean _notEquals = (!Objects.equal(_attribute, null));
        if (_notEquals) {
          EClass _eClass = stereotypeApplication.eClass();
          EList<EAttribute> _eAllAttributes = _eClass.getEAllAttributes();
          final Function1<EAttribute,Boolean> _function = new Function1<EAttribute,Boolean>() {
            public Boolean apply(final EAttribute it) {
              String _name = it.getName();
              EAttribute _attribute = _simpleText.getAttribute();
              String _name_1 = _attribute.getName();
              boolean _equals = Objects.equal(_name, _name_1);
              return Boolean.valueOf(_equals);
            }
          };
          final EAttribute attribute = IterableExtensions.<EAttribute>findFirst(_eAllAttributes, _function);
          Object _eGet = stereotypeApplication.eGet(attribute);
          return String.valueOf(_eGet);
        } else {
          return _simpleText.getText();
        }
      }
    }
    if (!_matched) {
      if (text instanceof ComplexText) {
        final ComplexText _complexText = (ComplexText)text;
        _matched=true;
        SimpleText _left = _complexText.getLeft();
        String _provideText = DecoratorUtil.provideText(_left, stereotypeApplication);
        Text _right = _complexText.getRight();
        String _provideText_1 = DecoratorUtil.provideText(_right, stereotypeApplication);
        return (_provideText + _provideText_1);
      }
    }
    return "";
  }
}
