package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service

import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription
import org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.ColorDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.ConnectionDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration

@Data
class EObjectDecorators {

	val IDecoratorTarget decoratorTarget

	val ImageDecorator iconDecorator
	val BorderDecorator borderDecorator
	val ColorDecorator colorDecorator
	val ConnectionDecorator connectionDecorator
	val BoxDecorator boxDecorator

	def decorate(GraphicalDecorationDescription graphicalDecorationDescription) {
		printGDD(graphicalDecorationDescription, "ADD")
		iconDecorator.applyDecorations(graphicalDecorationDescription)
		borderDecorator.applyDecorations(graphicalDecorationDescription)
		colorDecorator.applyDecorations(graphicalDecorationDescription)
		connectionDecorator.applyDecorations(graphicalDecorationDescription)
		boxDecorator.applyDecorations(graphicalDecorationDescription)
	}
	
	def removeDecoration(GraphicalDecorationDescription graphicalDecorationDescription) {
		printGDD(graphicalDecorationDescription, "REMOVE")
		iconDecorator.removeAppliedDecorations(graphicalDecorationDescription)
		borderDecorator.removeAppliedDecorations(graphicalDecorationDescription)
		colorDecorator.removeAppliedDecorations(graphicalDecorationDescription)
		connectionDecorator.removeAppliedDecorations(graphicalDecorationDescription)
		boxDecorator.removeAppliedDecorations(graphicalDecorationDescription)
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
				else if(gd.decoration instanceof BoxDecoration)
					sb.append("box text: " +(gd.decoration as BoxDecoration).text)
				else if(gd.decoration instanceof BorderDecoration)
					sb.append("border: " +(gd.decoration as BorderDecoration).border.size)
				else if(gd.decoration instanceof ColorDecoration){
					sb.append("background: " +(gd.decoration as ColorDecoration).background)
					sb.append("foreground: " +(gd.decoration as ColorDecoration).foreground)
				}else if(gd.decoration instanceof ConnectionDecoration)
					sb.append("connection: " + "size="+(gd.decoration as ConnectionDecoration).size + ", color="+(gd.decoration as ConnectionDecoration).color + ", line-style="+(gd.decoration as ConnectionDecoration).style)
				if(gd.decoration.activation != null)
					sb.append(gd.decoration.activation.condition)
					
				println(
					sb.toString
				)
			] 
		}
	}
}
