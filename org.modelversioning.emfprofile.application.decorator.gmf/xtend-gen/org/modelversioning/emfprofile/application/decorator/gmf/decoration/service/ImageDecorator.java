package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service;

import com.google.common.base.Objects;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.Decoration;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.swt.graphics.Image;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.AbstractManyDecorationsDecorator;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Direction;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Margin;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Text;
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ImageDecorationImpl;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

@SuppressWarnings("all")
public class ImageDecorator extends AbstractManyDecorationsDecorator {
  public final static String KEY = "PROFILE_APPLICATION_IMAGE_DECORATION";
  
  public ImageDecorator(final IDecoratorTarget decoratorTarget) {
    super(decoratorTarget);
  }
  
  public Decoration processAddDecoration(final GraphicalDecoration graphicalDecoration) {
    IGraphicalEditPart _targetEditPart = this.getTargetEditPart();
    if ((_targetEditPart instanceof LabelEditPart)) {
      return null;
    }
    AbstractDecoration _decoration = graphicalDecoration.getDecoration();
    final ImageDecoration imageDecoration = ((ImageDecoration) _decoration);
    Decoration decoration = null;
    String _location_uri = imageDecoration.getLocation_uri();
    final Image image = this.getIcon(_location_uri);
    IGraphicalEditPart _targetEditPart_1 = this.getTargetEditPart();
    if ((_targetEditPart_1 instanceof AbstractConnectionEditPart)) {
      int _xifexpression = (int) 0;
      Margin _margin = imageDecoration.getMargin();
      boolean _notEquals = (!Objects.equal(_margin, null));
      if (_notEquals) {
        Margin _margin_1 = imageDecoration.getMargin();
        int _value = _margin_1.getValue();
        int _providePercentageValue = this.providePercentageValue(_value);
        _xifexpression = _providePercentageValue;
      } else {
        _xifexpression = 50;
      }
      final int marginValue = _xifexpression;
      Decoration _addConnectionDecoration = this.addConnectionDecoration(image, marginValue, false);
      decoration = _addConnectionDecoration;
      Text _tooltip = imageDecoration.getTooltip();
      boolean _notEquals_1 = (!Objects.equal(_tooltip, null));
      if (_notEquals_1) {
        Text _tooltip_1 = imageDecoration.getTooltip();
        StereotypeApplication _stereotypeApplication = graphicalDecoration.getStereotypeApplication();
        String _text = this.getText(_tooltip_1, _stereotypeApplication);
        Decoration _setTooltip = this.setTooltip(decoration, _text, image);
        decoration = _setTooltip;
      }
    } else {
      int _xifexpression_1 = (int) 0;
      Margin _margin_2 = imageDecoration.getMargin();
      boolean _notEquals_2 = (!Objects.equal(_margin_2, null));
      if (_notEquals_2) {
        Margin _margin_3 = imageDecoration.getMargin();
        int _value_1 = _margin_3.getValue();
        _xifexpression_1 = _value_1;
      } else {
        int _minus = (-1);
        _xifexpression_1 = _minus;
      }
      final int marginValue_1 = _xifexpression_1;
      Direction _direction = imageDecoration.getDirection();
      org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget.Direction _provideDirection = this.provideDirection(_direction);
      Decoration _addShapeDecoration = this.addShapeDecoration(image, _provideDirection, marginValue_1, false);
      decoration = _addShapeDecoration;
      Text _tooltip_2 = imageDecoration.getTooltip();
      boolean _notEquals_3 = (!Objects.equal(_tooltip_2, null));
      if (_notEquals_3) {
        Text _tooltip_3 = imageDecoration.getTooltip();
        StereotypeApplication _stereotypeApplication_1 = graphicalDecoration.getStereotypeApplication();
        String _text_1 = this.getText(_tooltip_3, _stereotypeApplication_1);
        Decoration _setTooltip_1 = this.setTooltip(decoration, _text_1, image);
        decoration = _setTooltip_1;
      }
    }
    return decoration;
  }
  
  public Class<? extends AbstractDecoration> getDecorationType() {
    return ImageDecorationImpl.class;
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
