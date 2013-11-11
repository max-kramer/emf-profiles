package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service

import com.google.common.base.Objects
import org.eclipse.draw2d.Border
import org.eclipse.draw2d.ColorConstants
import org.eclipse.draw2d.Graphics
import org.eclipse.draw2d.IFigure
import org.eclipse.draw2d.LineBorder
import org.eclipse.draw2d.PolylineConnection
import org.eclipse.gef.editparts.AbstractConnectionEditPart
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget
import org.eclipse.swt.graphics.Color
import org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BorderDecorationImpl

class BorderDecorator extends AbstractOnlyOneDecorationDecorator {

	public static val String KEY = "PROFILE_APPLICATION_BORDER_DECORATION"

	val originalBorder = targetEditPart.figure.border

	new(IDecoratorTarget decoratorTarget) {
		super(decoratorTarget)
	}

	override refresh() {
		if(targetEditPart instanceof AbstractConnectionEditPart)
			return;
		val currentlyVisualizedBorder = targetEditPart.figure.border
		val borderDecoration = abstractDecorationWithHighestPrecedence as BorderDecoration
		if (borderDecoration == null) {
			if (! borderEqual(currentlyVisualizedBorder, originalBorder)) {
				targetEditPart.figure.setBorder(originalBorder)
			}
		} else {

			//			println('''BORDER WILL BE SET at«GMFProfileDecoratorProvider::getEObjectFromDecoratorTarget(decoratorTarget)»''')
			highlightNode(targetEditPart.figure, ColorConstants.red, borderDecoration.size, Graphics.LINE_SOLID)
		}

	}

	override getDecorationType() {
		return BorderDecorationImpl
	}

	def borderEqual(Border border, Border border2) {
		Objects.equal(border, border2)
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
	protected def highlightEdge(IFigure figure, Color color, int size) {
		if (figure instanceof PolylineConnection) {
			figure.setBackgroundColor(color);
			figure.setForegroundColor(color);
			(figure as PolylineConnection).setLineWidth(size);
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
	protected def highlightNode(IFigure figure, Color color, int size, int style) {
		figure.setBorder(new LineBorder(color, size, style));
		figure.setOpaque(false);
	}
}
