package org.modelversioning.emfprofile.application.decorator.graphiti.service

import org.modelversioning.emfprofile.application.decorator.graphiti.service.util.DecoratorUtil
import org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration

class BorderDecorator extends org.eclipse.graphiti.tb.BorderDecorator {

	new(BorderDecoration borderDecoration) {
		val size = if(borderDecoration.border.size != null) borderDecoration.border.size.value else 1;
		val color = DecoratorUtil::provideColor(borderDecoration.border.color)
		val style = DecoratorUtil::provideStyle(borderDecoration.border.style)
		setBorderColor(color)
		setBorderStyle(style)
		setBorderWidth(size)
	}

}
