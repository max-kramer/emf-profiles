package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service;

import com.google.common.base.Objects;
import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.swt.graphics.Color;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.AbstractOnlyOneDecorationDecorator;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BorderDecorationImpl;

@SuppressWarnings("all")
public class BorderDecorator extends AbstractOnlyOneDecorationDecorator {
  public final static String KEY = "PROFILE_APPLICATION_BORDER_DECORATION";
  
  private final Border originalBorder = new Function0<Border>() {
    public Border apply() {
      IGraphicalEditPart _targetEditPart = BorderDecorator.this.getTargetEditPart();
      IFigure _figure = _targetEditPart.getFigure();
      Border _border = _figure.getBorder();
      return _border;
    }
  }.apply();
  
  public BorderDecorator(final IDecoratorTarget decoratorTarget) {
    super(decoratorTarget);
  }
  
  public void refresh() {
    IGraphicalEditPart _targetEditPart = this.getTargetEditPart();
    if ((_targetEditPart instanceof AbstractConnectionEditPart)) {
      return;
    }
    IGraphicalEditPart _targetEditPart_1 = this.getTargetEditPart();
    IFigure _figure = _targetEditPart_1.getFigure();
    final Border currentlyVisualizedBorder = _figure.getBorder();
    AbstractDecoration _abstractDecorationWithHighestPrecedence = this.getAbstractDecorationWithHighestPrecedence();
    final BorderDecoration borderDecoration = ((BorderDecoration) _abstractDecorationWithHighestPrecedence);
    boolean _equals = Objects.equal(borderDecoration, null);
    if (_equals) {
      boolean _borderEqual = this.borderEqual(currentlyVisualizedBorder, this.originalBorder);
      boolean _not = (!_borderEqual);
      if (_not) {
        IGraphicalEditPart _targetEditPart_2 = this.getTargetEditPart();
        IFigure _figure_1 = _targetEditPart_2.getFigure();
        _figure_1.setBorder(this.originalBorder);
      }
    } else {
      IGraphicalEditPart _targetEditPart_3 = this.getTargetEditPart();
      IFigure _figure_2 = _targetEditPart_3.getFigure();
      int _size = borderDecoration.getSize();
      this.highlightNode(_figure_2, ColorConstants.red, _size, Graphics.LINE_SOLID);
    }
  }
  
  public Class<? extends AbstractDecoration> getDecorationType() {
    return BorderDecorationImpl.class;
  }
  
  public boolean borderEqual(final Border border, final Border border2) {
    boolean _equal = Objects.equal(border, border2);
    return _equal;
  }
  
  /**
   * Utility method to highlight an edge with specified color and line width.
   * 
   * @param figure
   *            the connection figure to highlight
   * @param color
   *            the highlight color to use
   * @param size
   *            the line width
   */
  protected void highlightEdge(final IFigure figure, final Color color, final int size) {
    if ((figure instanceof PolylineConnection)) {
      figure.setBackgroundColor(color);
      figure.setForegroundColor(color);
      ((PolylineConnection) figure).setLineWidth(size);
    }
  }
  
  /**
   * Utility method to highlight a node.
   * 
   * @param figure
   *            the node to highlight
   * @param color
   *            the highlight color to use
   * @param size
   *            the line border width
   * @param style
   *            the line border style
   */
  protected void highlightNode(final IFigure figure, final Color color, final int size, final int style) {
    LineBorder _lineBorder = new LineBorder(color, size, style);
    figure.setBorder(_lineBorder);
    figure.setOpaque(false);
  }
}
