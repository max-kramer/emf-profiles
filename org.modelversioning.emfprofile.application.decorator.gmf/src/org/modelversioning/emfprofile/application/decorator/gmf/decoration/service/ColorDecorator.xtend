package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service

import org.eclipse.draw2d.IFigure
import org.eclipse.gef.editparts.AbstractConnectionEditPart
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget
import org.eclipse.swt.graphics.Color
import org.modelversioning.emfprofile.decoration.decorationLanguage.ColorDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ColorDecorationImpl

class ColorDecorator extends AbstractOnlyOneDecorationDecorator {
	
	public static val String KEY = "PROFILE_APPLICATION_COLOR_DECORATION"

	var Color originalBackgroundColor = null
	var Color originalForegroundColor = null
	

	new(IDecoratorTarget decoratorTarget) {
		super(decoratorTarget)
	}

	override refresh() {
		if(targetEditPart instanceof AbstractConnectionEditPart)
			return;
			
		val currentFigure = getFigureForColoring(targetEditPart)
			
		// background color	
		val currentBackgroundColor = getRightFigureForBackgroundColoring().backgroundColor
		if(originalBackgroundColor == null)
			originalBackgroundColor = currentBackgroundColor
		
		val colorDecoration = abstractDecorationWithHighestPrecedence as ColorDecoration
		
		if (colorDecoration == null) {
			if (! colorEqual(currentBackgroundColor, originalBackgroundColor)) {
				setBackgroundColor(originalBackgroundColor)
			}
		} else {
			if(colorDecoration.background == null){
				if(! colorEqual(currentBackgroundColor, originalBackgroundColor)){
					setBackgroundColor(originalBackgroundColor)
				}
			}else{
				val color = provideColor(colorDecoration.background)
				if(! colorEqual(color, currentBackgroundColor)){
					setBackgroundColor(color)
				}
			}
		}
		
		// foreground color
				val currentForegroundColor = currentFigure.foregroundColor
		if(originalForegroundColor == null)
			originalForegroundColor = currentForegroundColor
		if (colorDecoration == null) {
			if (! colorEqual(currentForegroundColor, originalForegroundColor)) {
				setForegroundColor(originalForegroundColor)
			}
		} else {
			if(colorDecoration.foreground == null){
				if(! colorEqual(currentForegroundColor, originalForegroundColor)){
					setForegroundColor(originalForegroundColor)
				}
			}else{
				val color = provideColor(colorDecoration.foreground)
				if(! colorEqual(color, currentForegroundColor)){
					setForegroundColor(color)
				}
			}
		}
	}
	
	
	override getDecorationType() {
		return ColorDecorationImpl
	}
	
	private def setBackgroundColor(Color color){
		val figure = getRightFigureForBackgroundColoring()
		figure.setBackgroundColor(color)
		figure.setOpaque(false)
	}
	
	private def setForegroundColor(Color color){
		getFigureForColoring(targetEditPart).setForegroundColor(color)
		getFigureForColoring(targetEditPart).setOpaque(false)
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