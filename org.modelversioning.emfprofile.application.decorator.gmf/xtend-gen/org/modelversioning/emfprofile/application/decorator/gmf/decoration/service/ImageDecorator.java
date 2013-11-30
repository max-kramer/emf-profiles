package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service;

import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.Decoration;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.AbstractManyDecorationsDecorator;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ComplexText;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Direction;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Margin;
import org.modelversioning.emfprofile.decoration.decorationLanguage.SimpleText;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Text;
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ImageDecorationImpl;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

@SuppressWarnings("all")
public class ImageDecorator extends AbstractManyDecorationsDecorator {
  public final static String KEY = "PROFILE_APPLICATION_IMAGE_DECORATION";
  
  public ImageDecorator(final IDecoratorTarget decoratorTarget) {
    super(decoratorTarget);
  }
  
  public final static Map<URI,Image> imageRegistry = new Function0<Map<URI,Image>>() {
    public Map<URI,Image> apply() {
      HashMap<URI,Image> _newHashMap = Maps.<URI, Image>newHashMap();
      return _newHashMap;
    }
  }.apply();
  
  public Image getIcon(final String uri) {
    try {
      final URI imageURI = URI.createURI(uri);
      boolean _containsKey = ImageDecorator.imageRegistry.containsKey(imageURI);
      if (_containsKey) {
        return ImageDecorator.imageRegistry.get(imageURI);
      }
      String _string = imageURI.toString();
      URL _uRL = new URL(_string);
      final ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL(_uRL);
      final Image image = imageDescriptor.createImage();
      ImageDecorator.imageRegistry.put(imageURI, image);
      return image;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Decoration processAddDecoration(final GraphicalDecoration graphicalDecoration) {
    IGraphicalEditPart _targetEditPart = this.getTargetEditPart();
    if ((_targetEditPart instanceof LabelEditPart)) {
      return null;
    }
    AbstractDecoration _decoration = graphicalDecoration.getDecoration();
    final ImageDecoration imageDecoration = ((ImageDecoration) _decoration);
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
      final Decoration decoration = this.addConnectionDecoration(image, marginValue, false);
      Text _tooltip = imageDecoration.getTooltip();
      boolean _notEquals_1 = (!Objects.equal(_tooltip, null));
      if (_notEquals_1) {
        Text _tooltip_1 = imageDecoration.getTooltip();
        StereotypeApplication _stereotypeApplication = graphicalDecoration.getStereotypeApplication();
        String _text = this.getText(_tooltip_1, _stereotypeApplication);
        return this.setTooltip(decoration, _text, image);
      }
      return decoration;
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
      final Decoration decoration_1 = this.addShapeDecoration(image, _provideDirection, marginValue_1, false);
      Text _tooltip_2 = imageDecoration.getTooltip();
      boolean _notEquals_3 = (!Objects.equal(_tooltip_2, null));
      if (_notEquals_3) {
        Text _tooltip_3 = imageDecoration.getTooltip();
        StereotypeApplication _stereotypeApplication_1 = graphicalDecoration.getStereotypeApplication();
        String _text_1 = this.getText(_tooltip_3, _stereotypeApplication_1);
        return this.setTooltip(decoration_1, _text_1, image);
      }
      return decoration_1;
    }
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
  
  public String getText(final Text text, final StereotypeApplication stereotypeApplication) {
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
        String _text = this.getText(_left, stereotypeApplication);
        Text _right = _complexText.getRight();
        String _text_1 = this.getText(_right, stereotypeApplication);
        return (_text + _text_1);
      }
    }
    return "";
  }
}
