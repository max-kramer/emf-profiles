package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service;

import com.google.common.base.Objects;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.LineAttributes;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.AbstractOnlyOneDecorationDecorator;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.ConnectionValues;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ConnectionDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Size;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Style;
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ConnectionDecorationImpl;

@SuppressWarnings("all")
public class ConnectionDecorator extends AbstractOnlyOneDecorationDecorator {
  public final static String KEY = "PROFILE_APPLICATION_CONNECTION_DECORATION";
  
  private ConnectionValues originalConnectionValues = null;
  
  public ConnectionDecorator(final IDecoratorTarget decoratorTarget) {
    super(decoratorTarget);
  }
  
  public void refresh() {
    IGraphicalEditPart _targetEditPart = this.getTargetEditPart();
    boolean _not = (!(_targetEditPart instanceof AbstractConnectionEditPart));
    if (_not) {
      return;
    }
    IGraphicalEditPart _targetEditPart_1 = this.getTargetEditPart();
    IFigure _figure = _targetEditPart_1.getFigure();
    boolean _not_1 = (!(_figure instanceof PolylineConnection));
    if (_not_1) {
      return;
    }
    IGraphicalEditPart _targetEditPart_2 = this.getTargetEditPart();
    IFigure _figure_1 = _targetEditPart_2.getFigure();
    final PolylineConnection currentFigure = ((PolylineConnection) _figure_1);
    Color _foregroundColor = currentFigure.getForegroundColor();
    Color _backgroundColor = currentFigure.getBackgroundColor();
    int _lineWidth = currentFigure.getLineWidth();
    LineAttributes _lineAttributes = currentFigure.getLineAttributes();
    ConnectionValues _connectionValues = new ConnectionValues(_foregroundColor, _backgroundColor, _lineWidth, _lineAttributes.style);
    final ConnectionValues currentConnectionValues = _connectionValues;
    boolean _equals = Objects.equal(this.originalConnectionValues, null);
    if (_equals) {
      this.originalConnectionValues = currentConnectionValues;
    }
    AbstractDecoration _abstractDecorationWithHighestPrecedence = this.getAbstractDecorationWithHighestPrecedence();
    final ConnectionDecoration connectionDecoration = ((ConnectionDecoration) _abstractDecorationWithHighestPrecedence);
    boolean _equals_1 = Objects.equal(connectionDecoration, null);
    if (_equals_1) {
      boolean _connectionEqual = this.connectionEqual(currentConnectionValues, this.originalConnectionValues);
      boolean _not_2 = (!_connectionEqual);
      if (_not_2) {
        this.highlightEdge(currentFigure, this.originalConnectionValues);
      }
    } else {
      int _xifexpression = (int) 0;
      Size _size = connectionDecoration.getSize();
      boolean _equals_2 = Objects.equal(_size, null);
      if (_equals_2) {
        int _size_1 = this.originalConnectionValues.getSize();
        _xifexpression = _size_1;
      } else {
        Size _size_2 = connectionDecoration.getSize();
        int _value = _size_2.getValue();
        _xifexpression = _value;
      }
      final int size = _xifexpression;
      org.modelversioning.emfprofile.decoration.decorationLanguage.Color _color = connectionDecoration.getColor();
      final Color backgroundColor = this.provideColor(_color);
      org.modelversioning.emfprofile.decoration.decorationLanguage.Color _color_1 = connectionDecoration.getColor();
      final Color foregroundColor = this.provideColor(_color_1);
      Style _style = connectionDecoration.getStyle();
      final int style = this.provideStyle(_style);
      this.highlightEdge(currentFigure, foregroundColor, backgroundColor, size, style);
    }
  }
  
  public Class<? extends AbstractDecoration> getDecorationType() {
    return ConnectionDecorationImpl.class;
  }
  
  public boolean connectionEqual(final ConnectionValues connectionValues, final ConnectionValues connectionValues2) {
    boolean _equal = Objects.equal(connectionValues, connectionValues2);
    return _equal;
  }
  
  protected void highlightEdge(final PolylineConnection figure, final ConnectionValues connectionValues) {
    Color _foregroundColor = connectionValues.getForegroundColor();
    Color _backgroundColor = connectionValues.getBackgroundColor();
    int _size = connectionValues.getSize();
    int _lineStyle = connectionValues.getLineStyle();
    this.highlightEdge(figure, _foregroundColor, _backgroundColor, _size, _lineStyle);
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
  protected void highlightEdge(final PolylineConnection figure, final Color foregroundColor, final Color backgroundColor, final int size, final int lineStyle) {
    figure.setBackgroundColor(backgroundColor);
    figure.setForegroundColor(foregroundColor);
    figure.setLineWidth(size);
    figure.setLineStyle(lineStyle);
  }
}
