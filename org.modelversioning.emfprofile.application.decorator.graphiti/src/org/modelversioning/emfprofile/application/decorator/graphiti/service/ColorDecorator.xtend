package org.modelversioning.emfprofile.application.decorator.graphiti.service

import org.modelversioning.emfprofile.decoration.decorationLanguage.ColorDecoration
import org.modelversioning.emfprofile.application.decorator.graphiti.service.util.DecoratorUtil

class ColorDecorator extends org.eclipse.graphiti.tb.ColorDecorator {
	
	new(ColorDecoration colorDecoration){
		setBackgroundColor(DecoratorUtil.provideColor(colorDecoration.background))
		setForegroundColor(DecoratorUtil.provideColor(colorDecoration.foreground))
	}
}