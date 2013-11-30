package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service

import com.google.common.base.Objects
import org.eclipse.draw2d.PolylineConnection
import org.eclipse.gef.editparts.AbstractConnectionEditPart
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget
import org.eclipse.swt.graphics.Color
import org.modelversioning.emfprofile.decoration.decorationLanguage.ConnectionDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ConnectionDecorationImpl

class ConnectionDecorator extends AbstractOnlyOneDecorationDecorator {
	
	public static val String KEY = "PROFILE_APPLICATION_CONNECTION_DECORATION"

	var ConnectionValues originalConnectionValues = null
	
	

	new(IDecoratorTarget decoratorTarget) {
		super(decoratorTarget)
	}

	override refresh() {
		if( ! (targetEditPart instanceof AbstractConnectionEditPart))
			return;
		if( ! (targetEditPart.figure instanceof PolylineConnection))
			return;
		val currentFigure = targetEditPart.figure as PolylineConnection
		val currentConnectionValues = new ConnectionValues(currentFigure.foregroundColor, currentFigure.backgroundColor, currentFigure.lineWidth, currentFigure.lineAttributes.style)
		if(originalConnectionValues == null){
			originalConnectionValues = currentConnectionValues
		}
		val connectionDecoration = abstractDecorationWithHighestPrecedence as ConnectionDecoration
		if (connectionDecoration == null) {
			if (! connectionEqual(currentConnectionValues, originalConnectionValues)) {
				highlightEdge(currentFigure, originalConnectionValues);
			}
		} else {
			val size = if(connectionDecoration.size == null) originalConnectionValues.size else connectionDecoration.size.value;
			val backgroundColor = provideColor(connectionDecoration.backgroundColor)
			val foregroundColor = provideColor(connectionDecoration.foregroundColor)
			val style = provideStyle(connectionDecoration.style)
			highlightEdge(currentFigure, foregroundColor, backgroundColor, size, style)
		}

	}
	

	override getDecorationType() {
		return ConnectionDecorationImpl
	}

	def connectionEqual(ConnectionValues connectionValues, ConnectionValues connectionValues2) {
		Objects.equal(connectionValues, connectionValues2)
	}
	

	protected def highlightEdge(PolylineConnection figure, ConnectionValues connectionValues) {
		highlightEdge(figure, connectionValues.foregroundColor, connectionValues.backgroundColor, connectionValues.size, connectionValues.lineStyle)
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
	protected def highlightEdge(PolylineConnection figure, Color foregroundColor, Color backgroundColor, int size, int lineStyle) {
			figure.setBackgroundColor(backgroundColor);
			figure.setForegroundColor(foregroundColor);
			figure.setLineWidth(size);
			figure.setLineStyle(lineStyle)
	}

}

@Data
class ConnectionValues {
	Color foregroundColor
	Color backgroundColor
	int size
	int lineStyle
}