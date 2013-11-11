package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service

import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription
import org.modelversioning.emfprofile.decoration.decorationLanguage.IconDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration

@Data
class EObjectDecorators {

	val IDecoratorTarget decoratorTarget

	val IconDecorator iconDecorator
	val BorderDecorator borderDecorator
	val HighlightingDecorator highlightingDecorator

	def decorate(GraphicalDecorationDescription graphicalDecorationDescription) {
		printGDD(graphicalDecorationDescription, "ADD")
		iconDecorator.applyDecorations(graphicalDecorationDescription)
		borderDecorator.applyDecorations(graphicalDecorationDescription)
//		highlightingDecorator.applyDecorations(decorationDescription)
	}
	
	def removeDecoration(GraphicalDecorationDescription graphicalDecorationDescription) {
		printGDD(graphicalDecorationDescription, "ADD")
		iconDecorator.removeAppliedDecorations(graphicalDecorationDescription)
		borderDecorator.removeAppliedDecorations(graphicalDecorationDescription)
	}
	
	def printGDD(GraphicalDecorationDescription gdd, String what){
		println(
'''
«System.currentTimeMillis» «what», «gdd.decorationStatus», on «gdd.stereotypeApplication.appliedTo»'''			
		)
		if(gdd.decorationStatus == DecorationStatus::ACTIVE){
			gdd.decorations.forEach[gd |
				println(
'''		«gd.decorationStatus», «gd.decoration.eClass.name», «if(gd.decoration instanceof IconDecoration) { "image: " +(gd.decoration as IconDecoration).location_uri } else {if(gd.decoration instanceof BorderDecoration) { "border: " +(gd.decoration as BorderDecoration).size }}», «if(gd.decoration.activation != null){gd.decoration.activation.condition}» '''					
				)
			] 
		}
	}
}
