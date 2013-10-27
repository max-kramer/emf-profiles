package org.modelversioning.emfprofile.decoration.ui.hightlighting

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper

class EMFProfileDecorationLanguageAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	
	// this is for lexical highlighting
	 
	/*
	 * To find token names look into
	 * @see org.modelversioning.emfprofile.decoration.ui.contentassist.antlr.internal.InternalEMFProfileDecorationLanguageParser
	 */
	override protected calculateId(String tokenName, int tokenType) {
		if("RULE_BOOLEAN".equals(tokenName)) {
			return EMFProfileDecorationLanguageHighlightingConfiguration.KEYWORD_ID; // this means that boolean values "true/false" are formated to look like keywords.
		}
		super.calculateId(tokenName, tokenType)
	}
	
}