package org.modelversioning.emfprofile.decoration.ui.hover

import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider
import org.modelversioning.emfprofile.Stereotype

class EMFProfileDecorationLanguageEObjectDocumentationProvider implements IEObjectDocumentationProvider {

	override getDocumentation(EObject o) {
		println(o)
		switch o {
			EAttribute: {
				val stereotype = o.eContainer as Stereotype
				'''attribute of the stereotype class <b>«stereotype.eClass.name»</b>'''
			}
			default:
				null
		}
	}

}
