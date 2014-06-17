package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service;

import com.google.common.base.Objects;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.Decoration;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.graphics.Image;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.AbstractManyDecorationsDecorator;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.WrappingLabelEx;
import org.modelversioning.emfprofile.application.decorator.gmf.plugin.EMFProfileApplicationGMFDecoratorPlugin;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Border;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BoxImage;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BoxImageOrientation;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Color;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Direction;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Directions;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Margin;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Size;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Style;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Text;
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BoxDecorationImpl;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

@SuppressWarnings("all")
public class BoxDecorator extends AbstractManyDecorationsDecorator {
  public final static String KEY = "PROFILE_APPLICATION_BOX_DECORATION";
  
  public BoxDecorator(final IDecoratorTarget decoratorTarget) {
    super(decoratorTarget);
  }
  
  public Decoration processAddDecoration(final GraphicalDecoration graphicalDecoration) {
    IGraphicalEditPart _targetEditPart = this.getTargetEditPart();
    if ((_targetEditPart instanceof LabelEditPart)) {
      return null;
    }
    AbstractDecoration _decoration = graphicalDecoration.getDecoration();
    final BoxDecoration boxDecoration = ((BoxDecoration) _decoration);
    StereotypeApplication _stereotypeApplication = graphicalDecoration.getStereotypeApplication();
    final WrappingLabel figure = this.getBoxFigure(boxDecoration, _stereotypeApplication);
    Decoration decoration = null;
    IGraphicalEditPart _targetEditPart_1 = this.getTargetEditPart();
    if ((_targetEditPart_1 instanceof AbstractConnectionEditPart)) {
      int _xifexpression = (int) 0;
      Margin _margin = boxDecoration.getMargin();
      boolean _notEquals = (!Objects.equal(_margin, null));
      if (_notEquals) {
        Margin _margin_1 = boxDecoration.getMargin();
        int _value = _margin_1.getValue();
        int _providePercentageValue = this.providePercentageValue(_value);
        _xifexpression = _providePercentageValue;
      } else {
        _xifexpression = 50;
      }
      final int marginValue = _xifexpression;
      Decoration _addConnectionDecoration = this.addConnectionDecoration(figure, marginValue, false);
      decoration = _addConnectionDecoration;
      Text _tooltip = boxDecoration.getTooltip();
      boolean _notEquals_1 = (!Objects.equal(_tooltip, null));
      if (_notEquals_1) {
        Text _tooltip_1 = boxDecoration.getTooltip();
        StereotypeApplication _stereotypeApplication_1 = graphicalDecoration.getStereotypeApplication();
        String _text = this.getText(_tooltip_1, _stereotypeApplication_1);
        Image _icon = figure.getIcon();
        Decoration _setTooltip = this.setTooltip(decoration, _text, _icon);
        decoration = _setTooltip;
      }
    } else {
      int _xifexpression_1 = (int) 0;
      Margin _margin_2 = boxDecoration.getMargin();
      boolean _notEquals_2 = (!Objects.equal(_margin_2, null));
      if (_notEquals_2) {
        Margin _margin_3 = boxDecoration.getMargin();
        int _value_1 = _margin_3.getValue();
        _xifexpression_1 = _value_1;
      } else {
        int _minus = (-1);
        _xifexpression_1 = _minus;
      }
      final int marginValue_1 = _xifexpression_1;
      Direction _direction = boxDecoration.getDirection();
      org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget.Direction _provideDirection = this.provideDirection(_direction);
      Decoration _addShapeDecoration = this.addShapeDecoration(figure, _provideDirection, marginValue_1, false);
      decoration = _addShapeDecoration;
      Text _tooltip_2 = boxDecoration.getTooltip();
      boolean _notEquals_3 = (!Objects.equal(_tooltip_2, null));
      if (_notEquals_3) {
        Text _tooltip_3 = boxDecoration.getTooltip();
        StereotypeApplication _stereotypeApplication_2 = graphicalDecoration.getStereotypeApplication();
        String _text_1 = this.getText(_tooltip_3, _stereotypeApplication_2);
        Image _icon_1 = figure.getIcon();
        Decoration _setTooltip_1 = this.setTooltip(decoration, _text_1, _icon_1);
        decoration = _setTooltip_1;
      }
    }
    return decoration;
  }
  
  public WrappingLabel getBoxFigure(final BoxDecoration decoration, final StereotypeApplication stereotypeApplication) {
    WrappingLabel figure = null;
    BoxImage _image = decoration.getImage();
    boolean _notEquals = (!Objects.equal(_image, null));
    if (_notEquals) {
      Text _text = decoration.getText();
      String _text_1 = this.getText(_text, stereotypeApplication);
      BoxImage _image_1 = decoration.getImage();
      String _location_uri = _image_1.getLocation_uri();
      Image _icon = this.getIcon(_location_uri);
      WrappingLabelEx _wrappingLabelEx = new WrappingLabelEx(_text_1, _icon);
      figure = _wrappingLabelEx;
      BoxImage _image_2 = decoration.getImage();
      BoxImageOrientation _placement = _image_2.getPlacement();
      this.setTextPlacement(figure, _placement);
    } else {
      Text _text_2 = decoration.getText();
      String _text_3 = this.getText(_text_2, stereotypeApplication);
      WrappingLabelEx _wrappingLabelEx_1 = new WrappingLabelEx(_text_3);
      figure = _wrappingLabelEx_1;
    }
    figure.setTextWrap(true);
    Color _foregroundColor = decoration.getForegroundColor();
    boolean _notEquals_1 = (!Objects.equal(_foregroundColor, null));
    if (_notEquals_1) {
      Color _foregroundColor_1 = decoration.getForegroundColor();
      org.eclipse.swt.graphics.Color _provideColor = this.provideColor(_foregroundColor_1);
      figure.setForegroundColor(_provideColor);
    }
    Color _backgroundColor = decoration.getBackgroundColor();
    boolean _notEquals_2 = (!Objects.equal(_backgroundColor, null));
    if (_notEquals_2) {
      figure.setOpaque(true);
      Color _backgroundColor_1 = decoration.getBackgroundColor();
      org.eclipse.swt.graphics.Color _provideColor_1 = this.provideColor(_backgroundColor_1);
      figure.setBackgroundColor(_provideColor_1);
    }
    Border _border = decoration.getBorder();
    boolean _notEquals_3 = (!Objects.equal(_border, null));
    if (_notEquals_3) {
      int _xifexpression = (int) 0;
      Border _border_1 = decoration.getBorder();
      Size _size = _border_1.getSize();
      boolean _notEquals_4 = (!Objects.equal(_size, null));
      if (_notEquals_4) {
        Border _border_2 = decoration.getBorder();
        Size _size_1 = _border_2.getSize();
        int _value = _size_1.getValue();
        _xifexpression = _value;
      } else {
        _xifexpression = 1;
      }
      final int size = _xifexpression;
      Border _border_3 = decoration.getBorder();
      Color _color = _border_3.getColor();
      final org.eclipse.swt.graphics.Color color = this.provideColor(_color);
      Border _border_4 = decoration.getBorder();
      Style _style = _border_4.getStyle();
      final int style = this.provideStyle(_style);
      LineBorder _lineBorder = new LineBorder(color, size, style);
      figure.setBorder(_lineBorder);
    }
    Directions _contentDirection = decoration.getContentDirection();
    this.setContentDirection(figure, _contentDirection);
    int _widht = decoration.getWidht();
    int _height = decoration.getHeight();
    figure.setSize(_widht, _height);
    return figure;
  }
  
  public void setContentDirection(final WrappingLabel label, final Directions direction) {
    boolean _matched = false;
    if (!_matched) {
      boolean _equals = Objects.equal(direction, Directions.NORTH_WEST);
      if (_equals) {
        _matched=true;
        int _integerBinaryOr = EMFProfileApplicationGMFDecoratorPlugin.integerBinaryOr(PositionConstants.TOP, PositionConstants.LEFT);
        label.setAlignment(_integerBinaryOr);
      }
    }
    if (!_matched) {
      boolean _equals_1 = Objects.equal(direction, Directions.NORTH);
      if (_equals_1) {
        _matched=true;
        label.setAlignment(PositionConstants.TOP);
      }
    }
    if (!_matched) {
      boolean _equals_2 = Objects.equal(direction, Directions.NORTH_EAST);
      if (_equals_2) {
        _matched=true;
        int _integerBinaryOr_1 = EMFProfileApplicationGMFDecoratorPlugin.integerBinaryOr(PositionConstants.TOP, PositionConstants.RIGHT);
        label.setAlignment(_integerBinaryOr_1);
      }
    }
    if (!_matched) {
      boolean _equals_3 = Objects.equal(direction, Directions.WEST);
      if (_equals_3) {
        _matched=true;
        label.setAlignment(PositionConstants.LEFT);
      }
    }
    if (!_matched) {
      boolean _equals_4 = Objects.equal(direction, Directions.CENTER);
      if (_equals_4) {
        _matched=true;
        label.setAlignment(PositionConstants.CENTER);
      }
    }
    if (!_matched) {
      boolean _equals_5 = Objects.equal(direction, Directions.EAST);
      if (_equals_5) {
        _matched=true;
        label.setAlignment(PositionConstants.RIGHT);
      }
    }
    if (!_matched) {
      boolean _equals_6 = Objects.equal(direction, Directions.SOUTH_WEST);
      if (_equals_6) {
        _matched=true;
        int _integerBinaryOr_2 = EMFProfileApplicationGMFDecoratorPlugin.integerBinaryOr(PositionConstants.BOTTOM, PositionConstants.LEFT);
        label.setAlignment(_integerBinaryOr_2);
      }
    }
    if (!_matched) {
      boolean _equals_7 = Objects.equal(direction, Directions.SOUTH);
      if (_equals_7) {
        _matched=true;
        label.setAlignment(PositionConstants.BOTTOM);
      }
    }
    if (!_matched) {
      boolean _equals_8 = Objects.equal(direction, Directions.SOUTH_EAST);
      if (_equals_8) {
        _matched=true;
        int _integerBinaryOr_3 = EMFProfileApplicationGMFDecoratorPlugin.integerBinaryOr(PositionConstants.BOTTOM, PositionConstants.RIGHT);
        label.setAlignment(_integerBinaryOr_3);
      }
    }
    if (!_matched) {
      label.setAlignment(PositionConstants.CENTER);
    }
  }
  
  public void setTextPlacement(final WrappingLabel label, final BoxImageOrientation orientation) {
    boolean _matched = false;
    if (!_matched) {
      boolean _equals = Objects.equal(orientation, BoxImageOrientation.EAST);
      if (_equals) {
        _matched=true;
        label.setTextPlacement(PositionConstants.WEST);
        label.setTextAlignment(PositionConstants.CENTER);
        label.setIconAlignment(PositionConstants.CENTER);
      }
    }
    if (!_matched) {
      boolean _equals_1 = Objects.equal(orientation, BoxImageOrientation.WEST);
      if (_equals_1) {
        _matched=true;
        label.setTextPlacement(PositionConstants.EAST);
        label.setTextAlignment(PositionConstants.CENTER);
        label.setIconAlignment(PositionConstants.CENTER);
      }
    }
    if (!_matched) {
      boolean _equals_2 = Objects.equal(orientation, BoxImageOrientation.SOUTH);
      if (_equals_2) {
        _matched=true;
        label.setTextPlacement(PositionConstants.NORTH);
        label.setTextAlignment(PositionConstants.CENTER);
        label.setIconAlignment(PositionConstants.CENTER);
      }
    }
    if (!_matched) {
      boolean _equals_3 = Objects.equal(orientation, BoxImageOrientation.NORTH);
      if (_equals_3) {
        _matched=true;
        label.setTextPlacement(PositionConstants.SOUTH);
        label.setTextAlignment(PositionConstants.CENTER);
        label.setIconAlignment(PositionConstants.CENTER);
      }
    }
    if (!_matched) {
      {
        label.setTextPlacement(PositionConstants.EAST);
        label.setTextAlignment(PositionConstants.CENTER);
        label.setIconAlignment(PositionConstants.CENTER);
      }
    }
  }
  
  public Class<? extends AbstractDecoration> getDecorationType() {
    return BoxDecorationImpl.class;
  }
  
  public void processRemoveDecoration(final Decoration decoration) {
    this.decoratorTarget.removeDecoration(decoration);
  }
  
  public Decoration setTooltip(final Decoration decoration, final String text, final Image image) {
    Decoration _xblockexpression = null;
    {
      Label _label = new Label(text, image);
      final Label label = _label;
      MarginBorder _marginBorder = new MarginBorder(3);
      label.setBorder(_marginBorder);
      decoration.setToolTip(label);
      _xblockexpression = (decoration);
    }
    return _xblockexpression;
  }
}
