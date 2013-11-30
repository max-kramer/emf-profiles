package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service

import org.eclipse.draw2d.IFigure
import org.eclipse.gef.editparts.AbstractConnectionEditPart
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget
import org.eclipse.swt.graphics.Color
import org.modelversioning.emfprofile.decoration.decorationLanguage.BackgroundDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BackgroundDecorationImpl

class BackgroundDecorator extends AbstractOnlyOneDecorationDecorator {
	
	public static val String KEY = "PROFILE_APPLICATION_BACKGROUND_DECORATION"

	var Color originalBackgroundColor = null
	
	

	new(IDecoratorTarget decoratorTarget) {
		super(decoratorTarget)
	}

	override refresh() {
		if(targetEditPart instanceof AbstractConnectionEditPart)
			return;
			
		val currentBackgroundColor = getRightFigureForBackgroundColoring().backgroundColor
		if(originalBackgroundColor == null)
			originalBackgroundColor = currentBackgroundColor
		val backgroundDecoration = abstractDecorationWithHighestPrecedence as BackgroundDecoration
		if (backgroundDecoration == null) {
			if (! colorEqual(currentBackgroundColor, originalBackgroundColor)) {
				setBackgroundColor(originalBackgroundColor)
			}
		} else {
			if(backgroundDecoration.color == null){
				if(! colorEqual(currentBackgroundColor, originalBackgroundColor)){
					setBackgroundColor(originalBackgroundColor)
				}
			}else{
				val color = provideColor(backgroundDecoration.color)
				if(! colorEqual(color, currentBackgroundColor)){
					setBackgroundColor(color)
				}
			}
		}
	}
	
	
	override getDecorationType() {
		return BackgroundDecorationImpl
	}
	
	private def setBackgroundColor(Color color){
		val figure = getRightFigureForBackgroundColoring()
		figure.setBackgroundColor(color)
		figure.setOpaque(false)
	}
	
	private def IFigure getRightFigureForBackgroundColoring(){
		return getFigureForColoring(targetEditPart)

//		NOTE: This does not work! it seems that for FlowFigure background color can not be set.
//		var figure = getFigureForColoring(targetEditPart)
//		if(figure instanceof WrappingLabel){
//			figure = figure.children.get(0) as IFigure // probably returns org.eclipse.draw2d.text.FlowPage which is a org.eclipse.draw2d.text.FlowFigure
//		}
//		if(figure instanceof FlowPage){
//			figure = figure.children.get(0) as IFigure // probably returns org.eclipse.draw2d.text.InlineFlow like org.eclipse.draw2d.text.TextFlow also a org.eclipse.draw2d.text.FlowFigure
//		}
//		return figure
	}
}