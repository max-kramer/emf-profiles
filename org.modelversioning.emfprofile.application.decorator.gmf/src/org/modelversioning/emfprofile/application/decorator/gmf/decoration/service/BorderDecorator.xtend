package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service

import com.google.common.base.Objects
import org.eclipse.draw2d.Border
import org.eclipse.draw2d.IFigure
import org.eclipse.draw2d.LineBorder
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
			val size = if(borderDecoration.size != null) borderDecoration.size.value else 1;
			val color = provideColor(borderDecoration.color)
			val style = provideStyle(borderDecoration.style)
			//			println('''BORDER WILL BE SET at«GMFProfileDecoratorProvider::getEObjectFromDecoratorTarget(decoratorTarget)»''')
			setBorder(targetEditPart.figure, color, size, style)
		}

	}
	

	override getDecorationType() {
		return BorderDecorationImpl
	}

	def borderEqual(Border border, Border border2) {
		Objects.equal(border, border2)
	}

	/**
	 * Will create a border and set it on provided figure.
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
	protected def setBorder(IFigure figure, Color color, int size, int style) {
//		println("Figure: " + figure)
//		println('''Backgournd color: «getFigureForColoring(targetEditPart).backgroundColor»''')
//		println('''Foreground color: «getFigureForColoring(targetEditPart).foregroundColor»''')
//		getFigureForColoring(targetEditPart).setBackgroundColor(color)
//		getFigureForColoring(targetEditPart).setForegroundColor(color)
//		figure.setBorder(new LineBorder(color, size, style));
		figure.setBorder(new LineBorder(color, size, style))
		figure.setOpaque(false);
	}
	
}
