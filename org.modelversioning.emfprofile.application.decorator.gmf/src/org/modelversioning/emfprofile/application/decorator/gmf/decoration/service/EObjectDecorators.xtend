package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service

import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription
import org.modelversioning.emfprofile.decoration.decorationLanguage.BackgroundDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.ConnectionDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.ForegroundDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration

@Data
class EObjectDecorators {

	val IDecoratorTarget decoratorTarget

	val ImageDecorator iconDecorator
	val BorderDecorator borderDecorator
	val BackgroundDecorator backgroundDecorator
	val ForegroundDecorator foregroundDecorator
	val ConnectionDecorator connectionDecorator
	val HighlightingDecorator highlightingDecorator

	def decorate(GraphicalDecorationDescription graphicalDecorationDescription) {
		printGDD(graphicalDecorationDescription, "ADD")
		iconDecorator.applyDecorations(graphicalDecorationDescription)
		borderDecorator.applyDecorations(graphicalDecorationDescription)
		backgroundDecorator.applyDecorations(graphicalDecorationDescription)
		foregroundDecorator.applyDecorations(graphicalDecorationDescription)
		connectionDecorator.applyDecorations(graphicalDecorationDescription)
//		highlightingDecorator.applyDecorations(decorationDescription)
	}
	
	def removeDecoration(GraphicalDecorationDescription graphicalDecorationDescription) {
		printGDD(graphicalDecorationDescription, "REMOVE")
		iconDecorator.removeAppliedDecorations(graphicalDecorationDescription)
		borderDecorator.removeAppliedDecorations(graphicalDecorationDescription)
		backgroundDecorator.removeAppliedDecorations(graphicalDecorationDescription)
		foregroundDecorator.removeAppliedDecorations(graphicalDecorationDescription)
		connectionDecorator.removeAppliedDecorations(graphicalDecorationDescription)
	}
	
	def printGDD(GraphicalDecorationDescription gdd, String what){
		println(
'''
«System.currentTimeMillis» «what», «gdd.decorationStatus», on «gdd.stereotypeApplication.appliedTo»'''			
		)
		if(gdd.decorationStatus == DecorationStatus::ACTIVE){
			gdd.decorations.forEach[gd |
				val StringBuilder sb = new StringBuilder()
				sb.append('''		«gd.decorationStatus», «gd.decoration.eClass.name»,''')
				if(gd.decoration instanceof ImageDecoration)
					sb.append("image: " +(gd.decoration as ImageDecoration).location_uri)
				else if(gd.decoration instanceof BorderDecoration)
					sb.append("border: " +(gd.decoration as BorderDecoration).size)
				else if(gd.decoration instanceof BackgroundDecoration)
					sb.append("background: " +(gd.decoration as BackgroundDecoration).color)
				else if(gd.decoration instanceof ForegroundDecoration)
					sb.append("foreground: " +(gd.decoration as ForegroundDecoration).color)
				else if(gd.decoration instanceof ConnectionDecoration)
					sb.append("connection: " + "size="+(gd.decoration as ConnectionDecoration).size + ", foreground-color="+(gd.decoration as ConnectionDecoration).foregroundColor + ", line-style="+(gd.decoration as ConnectionDecoration).style)
				if(gd.decoration.activation != null)
					sb.append(gd.decoration.activation.condition)
					
				println(
					sb.toString
				)
			] 
		}
	}
}
