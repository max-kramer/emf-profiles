package org.modelversioning.emfprofile.decoration.ui.hightlighting

import org.eclipse.jface.resource.FontDescriptor
import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.RGB
import org.eclipse.swt.widgets.Display
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle

class EMFProfileDecorationLanguageHighlightingConfiguration extends DefaultHighlightingConfiguration {

	// well if we want to override or introduce new highlighting we should do it here

	public static final String ENUMERATION_LITERAL_ID = "ENUMERATION_LITERAL";
	public static final String COMMENT_ID = "comment";

	override void configure(IHighlightingConfigurationAcceptor acceptor){ 
		super.configure(acceptor)
		acceptor.acceptDefaultHighlighting(ENUMERATION_LITERAL_ID, "Enumeration Literal", enumerationLiteralTextStyle());
//    	acceptor.acceptDefaultHighlighting(COMMENT_ID, "Comment", // ...
 	}

	def TextStyle enumerationLiteralTextStyle() {
		val font = Display.current.activeShell.font
	    val TextStyle textStyle = new TextStyle();
//	    textStyle.setColor(new RGB(49,79,79)); // Dark Slate Gray
//	    textStyle.setStyle(SWT.BOLD);
//	    textStyle.setFontData(new FontData("Verdana", 16, SWT.BOLD))
		val FontDescriptor fd = FontDescriptor.createFrom(font).setHeight(font.fontData.head.getHeight + 1)//.setStyle(SWT.BOLD)//
//		val height = fd.fontData.head.getHeight
//		println("height: " + height)
//		fd.setHeight(height + 4)
		textStyle.setFontData(fd.fontData)
//	    textStyle.setBackgroundColor(new RGB(211,211,211))
	    return textStyle;
	}
}
