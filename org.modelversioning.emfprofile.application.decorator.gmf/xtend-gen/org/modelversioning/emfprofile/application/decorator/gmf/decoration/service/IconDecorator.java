package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service;

import com.google.common.collect.Maps;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.Decoration;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget.Direction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.AbstractManyDecorationsDecorator;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.IconDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.IconDecorationImpl;

@SuppressWarnings("all")
public class IconDecorator extends AbstractManyDecorationsDecorator {
  public final static String KEY = "PROFILE_APPLICATION_ICON_DECORATION";
  
  public IconDecorator(final IDecoratorTarget decoratorTarget) {
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
      final URI iconURI = URI.createURI(uri);
      boolean _containsKey = IconDecorator.imageRegistry.containsKey(iconURI);
      if (_containsKey) {
        return IconDecorator.imageRegistry.get(iconURI);
      }
      String _string = iconURI.toString();
      URL _uRL = new URL(_string);
      final ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL(_uRL);
      final Image image = imageDescriptor.createImage();
      IconDecorator.imageRegistry.put(iconURI, image);
      return image;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Decoration processAddDecoration(final AbstractDecoration decoration) {
    Decoration _xblockexpression = null;
    {
      IGraphicalEditPart _targetEditPart = this.getTargetEditPart();
      if ((_targetEditPart instanceof LabelEditPart)) {
        return null;
      }
      final IconDecoration iconDecoration = ((IconDecoration) decoration);
      String _location_uri = iconDecoration.getLocation_uri();
      final Image icon = this.getIcon(_location_uri);
      Decoration _xifexpression = null;
      IGraphicalEditPart _targetEditPart_1 = this.getTargetEditPart();
      if ((_targetEditPart_1 instanceof AbstractConnectionEditPart)) {
        Decoration _addConnectionDecoration = this.addConnectionDecoration(icon, 50, false);
        _xifexpression = _addConnectionDecoration;
      } else {
        int _minus = (-1);
        Decoration _addShapeDecoration = this.addShapeDecoration(icon, Direction.NORTH_EAST, _minus, false);
        _xifexpression = _addShapeDecoration;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public Class<? extends AbstractDecoration> getDecorationType() {
    return IconDecorationImpl.class;
  }
  
  public void processRemoveDecoration(final Decoration decoration) {
    this.decoratorTarget.removeDecoration(decoration);
  }
}
