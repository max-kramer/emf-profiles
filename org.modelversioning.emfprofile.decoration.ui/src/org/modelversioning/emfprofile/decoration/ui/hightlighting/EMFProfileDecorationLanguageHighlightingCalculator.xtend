package org.modelversioning.emfprofile.decoration.ui.hightlighting

import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor

class EMFProfileDecorationLanguageHighlightingCalculator implements ISemanticHighlightingCalculator {
	
	// this is for semantical highlighting. NOTE: it must be bound in the module to be used. At the moment it is not.
	
	
	override provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}