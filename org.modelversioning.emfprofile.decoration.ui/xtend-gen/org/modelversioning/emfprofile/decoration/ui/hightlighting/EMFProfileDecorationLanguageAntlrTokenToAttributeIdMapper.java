package org.modelversioning.emfprofile.decoration.ui.hightlighting;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.modelversioning.emfprofile.decoration.ui.hightlighting.EMFProfileDecorationLanguageHighlightingConfiguration;

@SuppressWarnings("all")
public class EMFProfileDecorationLanguageAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
  /**
   * To find token names look into
   * @see org.modelversioning.emfprofile.decoration.ui.contentassist.antlr.internal.InternalEMFProfileDecorationLanguageParser
   */
  protected String calculateId(final String tokenName, final int tokenType) {
    String _xblockexpression = null;
    {
      boolean _equals = "RULE_BOOLEAN".equals(tokenName);
      if (_equals) {
        return EMFProfileDecorationLanguageHighlightingConfiguration.KEYWORD_ID;
      }
      String _calculateId = super.calculateId(tokenName, tokenType);
      _xblockexpression = (_calculateId);
    }
    return _xblockexpression;
  }
}
