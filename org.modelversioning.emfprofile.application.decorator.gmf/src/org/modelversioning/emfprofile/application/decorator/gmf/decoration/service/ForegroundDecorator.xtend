package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service

import org.eclipse.gef.editparts.AbstractConnectionEditPart
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget
import org.eclipse.swt.graphics.Color
import org.modelversioning.emfprofile.decoration.decorationLanguage.ForegroundDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ForegroundDecorationImpl

class ForegroundDecorator extends AbstractOnlyOneDecorationDecorator {
		
	public static val String KEY = "PROFILE_APPLICATION_FOREGROUND_DECORATION"

	var Color originalForegroundColor = null
	
	

	new(IDecoratorTarget decoratorTarget) {
		super(decoratorTarget)
	}

	override refresh() {
		if(targetEditPart instanceof AbstractConnectionEditPart)
			return;
		
		val currentFigure = getFigureForColoring(targetEditPart)
			
		val currentForegroundColor = currentFigure.foregroundColor
		if(originalForegroundColor == null)
			originalForegroundColor = currentForegroundColor
		val foregroundDecoration = abstractDecorationWithHighestPrecedence as ForegroundDecoration
		if (foregroundDecoration == null) {
			if (! colorEqual(currentForegroundColor, originalForegroundColor)) {
				setForegroundColor(originalForegroundColor)
			}
		} else {
			if(foregroundDecoration.color == null){
				if(! colorEqual(currentForegroundColor, originalForegroundColor)){
					setForegroundColor(originalForegroundColor)
				}
			}else{
				val color = provideColor(foregroundDecoration.color)
				if(! colorEqual(color, currentForegroundColor)){
					setForegroundColor(color)
				}
			}
		}
	}
	

	override getDecorationType() {
		return ForegroundDecorationImpl
	}
	
	private def setForegroundColor(Color color){
		getFigureForColoring(targetEditPart).setForegroundColor(color)
		getFigureForColoring(targetEditPart).setOpaque(false)
	}
	
}