package org.modelversioning.emfprofile.application.registry.decoration

import java.util.Set
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractCondition
import org.modelversioning.emfprofileapplication.StereotypeApplication

/**
 * Describes decorations that will be attached to the graphical
 * representation of the EObject at which the stereotype was applied.
 * Decoration status must be evaluated from the conditions.
 */
@Data
class GraphicalDecorationDescription {
	val StereotypeApplication stereotypeApplication
	val Set<GraphicalDecoration> decorations
	val AbstractCondition condition
	val DecorationStatus decorationStatus
}
