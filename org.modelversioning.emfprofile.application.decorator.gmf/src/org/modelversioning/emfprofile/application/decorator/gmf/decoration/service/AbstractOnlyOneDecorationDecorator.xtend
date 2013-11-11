package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service

import com.google.common.collect.Lists
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration

abstract class AbstractOnlyOneDecorationDecorator extends AbstractDecorator {

	new(IDecoratorTarget decoratorTarget) {
		super(decoratorTarget)
	}

	/**
	 * returns {@link AbstractDecoration} or <code>null</code> if there is none.
	 */
	def AbstractDecoration getAbstractDecorationWithHighestPrecedence() {
		if(graphicalDecorationDescriptions.empty)
			return null
		val borderDecoration = Lists.newLinkedList(graphicalDecorationDescriptions.values).reverse.filter[
			it.decorationStatus == DecorationStatus::ACTIVE].map[decorations].flatten.filter[
			it.decoration.class == decorationType && it.decorationStatus == DecorationStatus::ACTIVE].head?.decoration as BorderDecoration

		return borderDecoration
	}

}
