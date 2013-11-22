package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.AbstractOnlyOneDecorationDecorator;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Color;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Size;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Style;
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
      int _xifexpression = (int) 0;
      Size _size = borderDecoration.getSize();
      boolean _notEquals = (!Objects.equal(_size, null));
      if (_notEquals) {
        Size _size_1 = borderDecoration.getSize();
        int _value = _size_1.getValue();
        _xifexpression = _value;
      } else {
        _xifexpression = 1;
      }
      final int size = _xifexpression;
      Color _color = borderDecoration.getColor();
      final org.eclipse.swt.graphics.Color color = this.provideColor(_color);
      Style _style = borderDecoration.getStyle();
      final int style = this.provideStyle(_style);
      IGraphicalEditPart _targetEditPart_3 = this.getTargetEditPart();
      IFigure _figure_2 = _targetEditPart_3.getFigure();
      this.highlightNode(_figure_2, color, size, style);
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
  protected void highlightEdge(final IFigure figure, final org.eclipse.swt.graphics.Color color, final int size) {
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
  protected void highlightNode(final IFigure figure, final org.eclipse.swt.graphics.Color color, final int size, final int style) {
    LineBorder _lineBorder = new LineBorder(color, size, style);
    figure.setBorder(_lineBorder);
    figure.setOpaque(false);
  }
  
  protected IFigure getFigureForColoring(final IGraphicalEditPart editPart) {
    IFigure figure = editPart.getFigure();
    if ((figure instanceof BorderedNodeFigure)) {
      List _children = figure.getChildren();
      Object _get = _children.get(0);
      figure = ((IFigure) _get);
    }
    if ((figure instanceof DefaultSizeNodeFigure)) {
      List _children_1 = figure.getChildren();
      Object _get_1 = _children_1.get(0);
      figure = ((IFigure) _get_1);
    }
    return figure;
  }
}
