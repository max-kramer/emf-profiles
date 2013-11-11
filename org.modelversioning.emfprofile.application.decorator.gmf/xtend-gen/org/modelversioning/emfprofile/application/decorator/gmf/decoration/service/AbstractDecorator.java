package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
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
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.NotificationListenerImpl;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

@SuppressWarnings("all")
public abstract class AbstractDecorator implements IDecorator {
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
    int _correctPercentageValue = this.correctPercentageValue(percentageFromSource);
    IDecoration _addConnectionDecoration = this.decoratorTarget.addConnectionDecoration(figure, _correctPercentageValue, isVolatile);
    return ((Decoration) _addConnectionDecoration);
  }
  
  /**
   * Adds image decoration to the connection
   */
  protected Decoration addConnectionDecoration(final Image image, final int percentageFromSource, final boolean isVolatile) {
    int _correctPercentageValue = this.correctPercentageValue(percentageFromSource);
    IDecoration _addConnectionDecoration = this.decoratorTarget.addConnectionDecoration(image, _correctPercentageValue, isVolatile);
    return ((Decoration) _addConnectionDecoration);
  }
  
  /**
   * Adds figure decoration to the shape
   */
  protected Decoration addShapeDecoration(final IFigure figure, final Direction direction, final int margin, final boolean isVolatile) {
    int _minus = (-1);
    IDecoration _addShapeDecoration = this.decoratorTarget.addShapeDecoration(figure, Direction.NORTH_EAST, _minus, false);
    return ((Decoration) _addShapeDecoration);
  }
  
  /**
   * Adds image decoration to the shape
   */
  protected Decoration addShapeDecoration(final Image image, final Direction direction, final int margin, final boolean isVolatile) {
    int _minus = (-1);
    IDecoration _addShapeDecoration = this.decoratorTarget.addShapeDecoration(image, Direction.NORTH_EAST, _minus, false);
    return ((Decoration) _addShapeDecoration);
  }
  
  private int correctPercentageValue(final int number) {
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
}
