package org.modelversioning.emfprofile.decoration.ui.hover

import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider

class EMFProfileDecorationLanguageEObjectHoverProvider extends DefaultEObjectHoverProvider {
	
	override protected getFirstLine(EObject o) {
		println("FirstLine: " + o)
		switch o {
			EAttribute : {
				'''<b>«o.name»</b> : «o.EType.name»'''
			}
			
			default: 
				super.getFirstLine(o)
		}
	}
	
}