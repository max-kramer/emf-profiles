package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service

import com.google.common.collect.Sets
import java.util.Set
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.Decoration
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration

abstract class AbstractManyDecorationsDecorator extends AbstractDecorator {

	new(IDecoratorTarget decoratorTarget) {
		super(decoratorTarget)
	}

	/**
	 * holding references of visualized decorations
	 */
	protected val Set<Decoration> decorationsOnEObject = Sets.newHashSet

	override deactivate() {
		super.deactivate()

		//		Removes all decorations that are applied on the decorator target. Filtering null values
		decorationsOnEObject.forEach [ decoration |
			processRemoveDecoration(decoration)
		]
		decorationsOnEObject.clear
	}

	override refresh() {
		//		println("REFRESHING size: " + decorationsOnEObject.size + " : "+ decoratorTarget)
		removeVisualizedDecorations()
		visualizeDecorations()
	}

	private def removeVisualizedDecorations() {
		decorationsOnEObject.forEach [ d |
			processRemoveDecoration(d)
		]
		decorationsOnEObject.clear()
	}

	private def visualizeDecorations() {
		graphicalDecorationDescriptions.values.forEach [ graphicalDecorationDescription |
			if (graphicalDecorationDescription.decorationStatus == DecorationStatus::ACTIVE) {
				getGraphicalDecorations(graphicalDecorationDescription, decorationType).forEach [ gd |
					val decorationStatus = gd.decorationStatus
					switch decorationStatus {
						case decorationStatus == DecorationStatus::ACTIVE: {
							decorationsOnEObject.add(processAddDecoration(gd))
						}
						case decorationStatus == DecorationStatus::INANCTIVE: {
							//						do nothing
						}
						default:
							throw new IllegalStateException('''Unknown decoration status: «decorationStatus»''')
					}
				]
			}
		]
	}

	/**
	 * instructs the decorator to visualize the decoration on the decoration target.
	 */
	abstract def Decoration processAddDecoration(GraphicalDecoration graphicalDecoration)

	/**
	 * instructs the decorator to remove the visualized decoration from the decoration target.
	 */
	abstract def void processRemoveDecoration(Decoration decoration)
}
