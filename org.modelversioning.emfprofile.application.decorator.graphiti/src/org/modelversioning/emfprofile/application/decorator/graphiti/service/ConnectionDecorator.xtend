package org.modelversioning.emfprofile.application.decorator.graphiti.service

import org.modelversioning.emfprofile.application.decorator.graphiti.service.util.DecoratorUtil
import org.modelversioning.emfprofile.decoration.decorationLanguage.ConnectionDecoration

class ConnectionDecorator extends org.eclipse.graphiti.tb.ColorDecorator {

	new(ConnectionDecoration connectionDecoration) {
		// hmmm, it seams that color decorations have no effect on connection lines.
		// at least that is the case with Graphiti version 0.10.2
		val color = connectionDecoration.color
		if (color != null) {
			setForegroundColor(DecoratorUtil.provideColor(color))
			setBackgroundColor(DecoratorUtil.provideColor(color))
		}
	}
}
