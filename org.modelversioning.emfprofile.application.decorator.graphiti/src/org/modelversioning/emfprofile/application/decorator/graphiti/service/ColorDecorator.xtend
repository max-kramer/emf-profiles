package org.modelversioning.emfprofile.application.decorator.graphiti.service

import org.modelversioning.emfprofile.decoration.decorationLanguage.ColorDecoration
import org.modelversioning.emfprofile.application.decorator.graphiti.service.util.DecoratorUtil
import org.eclipse.graphiti.util.IColorConstant

class ColorDecorator extends org.eclipse.graphiti.tb.ColorDecorator {

	new(ColorDecoration colorDecoration) {
		if (colorDecoration.foreground == null) {
			setForegroundColor(IColorConstant.BLACK)
		} else {
			setForegroundColor(DecoratorUtil.provideColor(colorDecoration.foreground))
		}
		if (colorDecoration.background == null) {
			setBackgroundColor(IColorConstant.WHITE)
		} else {
			setBackgroundColor(DecoratorUtil.provideColor(colorDecoration.background))
		}
	}
}
