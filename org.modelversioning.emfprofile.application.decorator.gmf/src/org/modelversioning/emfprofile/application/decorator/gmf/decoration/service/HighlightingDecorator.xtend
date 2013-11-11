package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service

import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget

class HighlightingDecorator extends AbstractOnlyOneDecorationDecorator {
	
	public static val String KEY = "PROFILE_APPLICATION_HIGHLIGHTING_DECORATION"

	new(IDecoratorTarget decoratorTarget) {
		super(decoratorTarget)
	}
	
	override getDecorationType() {
		return null
	}
	
	override refresh() {
		// noop
	}
	
	
	
}
