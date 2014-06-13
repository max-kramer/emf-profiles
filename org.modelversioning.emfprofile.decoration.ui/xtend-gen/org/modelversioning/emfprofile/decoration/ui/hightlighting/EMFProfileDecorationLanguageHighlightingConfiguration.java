package org.modelversioning.emfprofile.decoration.ui.hightlighting;

import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class EMFProfileDecorationLanguageHighlightingConfiguration extends DefaultHighlightingConfiguration {
  public final static String ENUMERATION_LITERAL_ID = "ENUMERATION_LITERAL";
  
  public final static String COMMENT_ID = "comment";
  
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    super.configure(acceptor);
    TextStyle _enumerationLiteralTextStyle = this.enumerationLiteralTextStyle();
    acceptor.acceptDefaultHighlighting(EMFProfileDecorationLanguageHighlightingConfiguration.ENUMERATION_LITERAL_ID, "Enumeration Literal", _enumerationLiteralTextStyle);
  }
  
  public TextStyle enumerationLiteralTextStyle() {
    Display _current = Display.getCurrent();
    Shell _activeShell = _current.getActiveShell();
    final Font font = _activeShell.getFont();
    TextStyle _textStyle = new TextStyle();
    final TextStyle textStyle = _textStyle;
    FontDescriptor _createFrom = FontDescriptor.createFrom(font);
    FontData[] _fontData = font.getFontData();
    FontData _head = IterableExtensions.<FontData>head(((Iterable<FontData>)Conversions.doWrapArray(_fontData)));
    int _height = _head.getHeight();
    int _plus = (_height + 1);
    final FontDescriptor fd = _createFrom.setHeight(_plus);
    FontData[] _fontData_1 = fd.getFontData();
    textStyle.setFontData(_fontData_1);
    return textStyle;
  }
}
