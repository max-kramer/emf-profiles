package org.modelversioning.emfprofile.decoration

import org.eclipse.emf.ecore.EObject
import org.modelversioning.emfprofile.Stereotype
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription

final class DecorationLanguageUtil {
	/**
	 * Can be used to traverse back the containment path to find the Stereotype
	 * which is cross-referenced in DecorationDescription 
	 */
	static final def Stereotype getStereotype(EObject object) {
		val EObject parent = object.eContainer;
		switch parent {
			DecorationDescription: return (parent as DecorationDescription).stereotype
			default: getStereotype(parent)
		}
	}
}
