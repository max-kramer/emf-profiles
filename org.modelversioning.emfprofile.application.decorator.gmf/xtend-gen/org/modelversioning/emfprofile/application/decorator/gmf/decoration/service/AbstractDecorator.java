package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DecorationEditPolicy.DecoratorTarget;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.Decoration;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoration;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecorator;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget.Direction;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.NotificationListenerImpl;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ColorConstant;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Colors;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ConcreteColor;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Directions;
import org.modelversioning.emfprofile.decoration.decorationLanguage.LineStyle;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Style;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

@SuppressWarnings("all")
public abstract class AbstractDecorator implements IDecorator {
  /**
   * to cash created colors. they are disposed when the plug-in is stop method is called
   */
  public final static Map<RGB,Color> createdColors = new Function0<Map<RGB,Color>>() {
    public Map<RGB,Color> apply() {
      HashMap<RGB,Color> _newHashMap = Maps.<RGB, Color>newHashMap();
      return _newHashMap;
    }
  }.apply();
  
  /**
   * the notificationListener.
   */
  protected final NotificationListener notificationListener = new Function0<NotificationListener>() {
    public NotificationListener apply() {
      NotificationListenerImpl _notificationListenerImpl = new NotificationListenerImpl(AbstractDecorator.this);
      return _notificationListenerImpl;
    }
  }.apply();
  
  protected final LinkedHashMap<StereotypeApplication,GraphicalDecorationDescription> graphicalDecorationDescriptions = new Function0<LinkedHashMap<StereotypeApplication,GraphicalDecorationDescription>>() {
    public LinkedHashMap<StereotypeApplication,GraphicalDecorationDescription> apply() {
      LinkedHashMap<StereotypeApplication,GraphicalDecorationDescription> _newLinkedHashMap = Maps.<StereotypeApplication, GraphicalDecorationDescription>newLinkedHashMap();
      return _newLinkedHashMap;
    }
  }.apply();
  
  /**
   * the object to be decorated
   */
  protected final DecoratorTarget decoratorTarget;
  
  /**
   * Creates a new <code>AbstractDecorator</code> for the decorator target
   * passed in.
   * 
   * @param decoratorTarget
   *            the object to be decorated
   */
  public AbstractDecorator(final IDecoratorTarget decoratorTarget) {
    this.decoratorTarget = ((DecoratorTarget) decoratorTarget);
  }
  
  protected IGraphicalEditPart getTargetEditPart() {
    Object _adapter = this.decoratorTarget.getAdapter(IGraphicalEditPart.class);
    return ((IGraphicalEditPart) _adapter);
  }
  
  /**
   * {@inheritDoc}
   * 
   * @see IDecorator#activate()
   */
  public void activate() {
    final IGraphicalEditPart gep = this.getTargetEditPart();
    TransactionalEditingDomain _editingDomain = gep.getEditingDomain();
    DiagramEventBroker _instance = DiagramEventBroker.getInstance(_editingDomain);
    View _notationView = gep.getNotationView();
    EReference _node_LayoutConstraint = NotationPackage.eINSTANCE.getNode_LayoutConstraint();
    _instance.addNotificationListener(_notationView, _node_LayoutConstraint, this.notificationListener);
  }
  
  /**
   * Deactivates the decoration.
   * 
   * @see IDecorator#deactivate()
   */
  public void deactivate() {
    final IGraphicalEditPart gep = this.getTargetEditPart();
    TransactionalEditingDomain _editingDomain = gep.getEditingDomain();
    DiagramEventBroker _instance = DiagramEventBroker.getInstance(_editingDomain);
    View _notationView = gep.getNotationView();
    EReference _node_LayoutConstraint = NotationPackage.eINSTANCE.getNode_LayoutConstraint();
    _instance.removeNotificationListener(_notationView, _node_LayoutConstraint, this.notificationListener);
  }
  
  /**
   * is to be called by {@link EObjectDecorators} when stereotype was applied to a semantical element
   * or a stereotype application attribute values have changed
   */
  public void applyDecorations(final GraphicalDecorationDescription graphicalDecorationDescription) {
    StereotypeApplication _stereotypeApplication = graphicalDecorationDescription.getStereotypeApplication();
    this.graphicalDecorationDescriptions.put(_stereotypeApplication, graphicalDecorationDescription);
    this.refresh();
  }
  
  /**
   * is to be called by {@link EObjectDecorators} when stereotype application is removed
   */
  public void removeAppliedDecorations(final GraphicalDecorationDescription graphicalDecorationDescription) {
    StereotypeApplication _stereotypeApplication = graphicalDecorationDescription.getStereotypeApplication();
    this.graphicalDecorationDescriptions.remove(_stereotypeApplication);
    this.refresh();
  }
  
  /**
   * This method should provide all graphical decorations that can be processed by the decorator.
   */
  protected List<GraphicalDecoration> getGraphicalDecorations(final GraphicalDecorationDescription graphicalDecorationDescription, final Class<? extends AbstractDecoration> decorationType) {
    final List<GraphicalDecoration> graphicalDecorations = Lists.<GraphicalDecoration>newLinkedList();
    List<GraphicalDecoration> _decorations = graphicalDecorationDescription.getDecorations();
    final Procedure1<GraphicalDecoration> _function = new Procedure1<GraphicalDecoration>() {
      public void apply(final GraphicalDecoration gd) {
        AbstractDecoration _decoration = gd.getDecoration();
        Class<? extends AbstractDecoration> _class = _decoration.getClass();
        boolean _equals = Objects.equal(_class, decorationType);
        if (_equals) {
          graphicalDecorations.add(gd);
        }
      }
    };
    IterableExtensions.<GraphicalDecoration>forEach(_decorations, _function);
    return graphicalDecorations;
  }
  
  /**
   * Returns the class type of {@link AbstractDecoration} for which the concrete decorator is interested.
   */
  public abstract Class<? extends AbstractDecoration> getDecorationType();
  
  /**
   * Adds figure decoration to the connection
   */
  protected Decoration addConnectionDecoration(final IFigure figure, final int percentageFromSource, final boolean isVolatile) {
    int _providePercentageValue = this.providePercentageValue(percentageFromSource);
    IDecoration _addConnectionDecoration = this.decoratorTarget.addConnectionDecoration(figure, _providePercentageValue, isVolatile);
    return ((Decoration) _addConnectionDecoration);
  }
  
  /**
   * Adds image decoration to the connection
   */
  protected Decoration addConnectionDecoration(final Image image, final int percentageFromSource, final boolean isVolatile) {
    int _providePercentageValue = this.providePercentageValue(percentageFromSource);
    IDecoration _addConnectionDecoration = this.decoratorTarget.addConnectionDecoration(image, _providePercentageValue, isVolatile);
    return ((Decoration) _addConnectionDecoration);
  }
  
  /**
   * Adds figure decoration to the shape
   */
  protected Decoration addShapeDecoration(final IFigure figure, final Direction direction, final int margin, final boolean isVolatile) {
    IDecoration _addShapeDecoration = this.decoratorTarget.addShapeDecoration(figure, direction, margin, isVolatile);
    return ((Decoration) _addShapeDecoration);
  }
  
  /**
   * Adds image decoration to the shape
   */
  protected Decoration addShapeDecoration(final Image image, final Direction direction, final int margin, final boolean isVolatile) {
    IDecoration _addShapeDecoration = this.decoratorTarget.addShapeDecoration(image, direction, margin, isVolatile);
    return ((Decoration) _addShapeDecoration);
  }
  
  protected int providePercentageValue(final int number) {
    boolean _greaterThan = (number > 100);
    if (_greaterThan) {
      return 100;
    }
    boolean _lessThan = (number < 0);
    if (_lessThan) {
      return 0;
    }
    return number;
  }
  
  /**
   * utility method to convert styles from decoration description language to types acceptable by GMF
   */
  protected int provideStyle(final Style style) {
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
   * utility method to convert colors from decoration description language to types acceptable by GMF
   */
  protected Color provideColor(final org.modelversioning.emfprofile.decoration.decorationLanguage.Color color) {
    boolean _equals = Objects.equal(color, null);
    if (_equals) {
      return ColorConstants.black;
    }
    final ConcreteColor concreteColor = color.getConcrete();
    boolean _notEquals = (!Objects.equal(concreteColor, null));
    if (_notEquals) {
      int _red = concreteColor.getRed();
      int _green = concreteColor.getGreen();
      int _blue = concreteColor.getBlue();
      RGB _rGB = new RGB(_red, _green, _blue);
      final RGB rgb = _rGB;
      boolean _containsKey = AbstractDecorator.createdColors.containsKey(rgb);
      if (_containsKey) {
        return AbstractDecorator.createdColors.get(rgb);
      }
      Display _current = Display.getCurrent();
      Color _color = new Color(_current, rgb);
      final Color newColor = _color;
      RGB _rGB_1 = newColor.getRGB();
      AbstractDecorator.createdColors.put(_rGB_1, newColor);
      return newColor;
    } else {
      final ColorConstant constantColor = color.getValue();
      boolean _equals_1 = Objects.equal(constantColor, null);
      if (_equals_1) {
        return ColorConstants.red;
      }
      final Colors colorCode = constantColor.getValue();
      boolean _matched = false;
      if (!_matched) {
        boolean _equals_2 = Objects.equal(colorCode, Colors.BLACK);
        if (_equals_2) {
          _matched=true;
          return ColorConstants.black;
        }
      }
      if (!_matched) {
        boolean _equals_3 = Objects.equal(colorCode, Colors.BLUE);
        if (_equals_3) {
          _matched=true;
          return ColorConstants.blue;
        }
      }
      if (!_matched) {
        boolean _equals_4 = Objects.equal(colorCode, Colors.BLUE_DARK);
        if (_equals_4) {
          _matched=true;
          return ColorConstants.darkBlue;
        }
      }
      if (!_matched) {
        boolean _equals_5 = Objects.equal(colorCode, Colors.BLUE_LIGHT);
        if (_equals_5) {
          _matched=true;
          return ColorConstants.lightBlue;
        }
      }
      if (!_matched) {
        boolean _equals_6 = Objects.equal(colorCode, Colors.CYAN);
        if (_equals_6) {
          _matched=true;
          return ColorConstants.cyan;
        }
      }
      if (!_matched) {
        boolean _equals_7 = Objects.equal(colorCode, Colors.GRAY);
        if (_equals_7) {
          _matched=true;
          return ColorConstants.gray;
        }
      }
      if (!_matched) {
        boolean _equals_8 = Objects.equal(colorCode, Colors.GRAY_DARK);
        if (_equals_8) {
          _matched=true;
          return ColorConstants.darkGray;
        }
      }
      if (!_matched) {
        boolean _equals_9 = Objects.equal(colorCode, Colors.GRAY_LIGHT);
        if (_equals_9) {
          _matched=true;
          return ColorConstants.lightGray;
        }
      }
      if (!_matched) {
        boolean _equals_10 = Objects.equal(colorCode, Colors.GREEN);
        if (_equals_10) {
          _matched=true;
          return ColorConstants.green;
        }
      }
      if (!_matched) {
        boolean _equals_11 = Objects.equal(colorCode, Colors.GREEN_DARK);
        if (_equals_11) {
          _matched=true;
          return ColorConstants.darkGreen;
        }
      }
      if (!_matched) {
        boolean _equals_12 = Objects.equal(colorCode, Colors.GREEN_LIGHT);
        if (_equals_12) {
          _matched=true;
          return ColorConstants.lightGreen;
        }
      }
      if (!_matched) {
        boolean _equals_13 = Objects.equal(colorCode, Colors.ORANGE);
        if (_equals_13) {
          _matched=true;
          return ColorConstants.orange;
        }
      }
      if (!_matched) {
        boolean _equals_14 = Objects.equal(colorCode, Colors.RED);
        if (_equals_14) {
          _matched=true;
          return ColorConstants.red;
        }
      }
      if (!_matched) {
        boolean _equals_15 = Objects.equal(colorCode, Colors.WHITE);
        if (_equals_15) {
          _matched=true;
          return ColorConstants.white;
        }
      }
      if (!_matched) {
        boolean _equals_16 = Objects.equal(colorCode, Colors.YELLOW);
        if (_equals_16) {
          _matched=true;
          return ColorConstants.yellow;
        }
      }
      return ColorConstants.black;
    }
  }
  
  /**
   * utility method to convert directions from decoration description language to types acceptable by GMF
   */
  protected Direction provideDirection(final org.modelversioning.emfprofile.decoration.decorationLanguage.Direction direction) {
    boolean _equals = Objects.equal(direction, null);
    if (_equals) {
      return Direction.NORTH_WEST;
    }
    final Directions concreteDirectionValue = direction.getValue();
    boolean _matched = false;
    if (!_matched) {
      boolean _equals_1 = Objects.equal(concreteDirectionValue, Directions.CENTER);
      if (_equals_1) {
        _matched=true;
        return Direction.CENTER;
      }
    }
    if (!_matched) {
      boolean _equals_2 = Objects.equal(concreteDirectionValue, Directions.EAST);
      if (_equals_2) {
        _matched=true;
        return Direction.EAST;
      }
    }
    if (!_matched) {
      boolean _equals_3 = Objects.equal(concreteDirectionValue, Directions.NORHT);
      if (_equals_3) {
        _matched=true;
        return Direction.NORTH;
      }
    }
    if (!_matched) {
      boolean _equals_4 = Objects.equal(concreteDirectionValue, Directions.NORTH_EAST);
      if (_equals_4) {
        _matched=true;
        return Direction.NORTH_EAST;
      }
    }
    if (!_matched) {
      boolean _equals_5 = Objects.equal(concreteDirectionValue, Directions.NORTH_WEST);
      if (_equals_5) {
        _matched=true;
        return Direction.NORTH_WEST;
      }
    }
    if (!_matched) {
      boolean _equals_6 = Objects.equal(concreteDirectionValue, Directions.SOUTH);
      if (_equals_6) {
        _matched=true;
        return Direction.SOUTH;
      }
    }
    if (!_matched) {
      boolean _equals_7 = Objects.equal(concreteDirectionValue, Directions.SOUTH_EAST);
      if (_equals_7) {
        _matched=true;
        return Direction.SOUTH_EAST;
      }
    }
    if (!_matched) {
      boolean _equals_8 = Objects.equal(concreteDirectionValue, Directions.SOUTH_WEST);
      if (_equals_8) {
        _matched=true;
        return Direction.SOUTH_WEST;
      }
    }
    if (!_matched) {
      boolean _equals_9 = Objects.equal(concreteDirectionValue, Directions.WEST);
      if (_equals_9) {
        _matched=true;
        return Direction.WEST;
      }
    }
    return Direction.NORTH_WEST;
  }
}
