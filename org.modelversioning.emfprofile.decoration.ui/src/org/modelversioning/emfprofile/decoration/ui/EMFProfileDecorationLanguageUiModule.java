/*
 * generated by Xtext
 */
package org.modelversioning.emfprofile.decoration.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.ui.editor.contentassist.XtextContentAssistProcessor;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.modelversioning.emfprofile.decoration.ui.hightlighting.EMFProfileDecorationLanguageAntlrTokenToAttributeIdMapper;
import org.modelversioning.emfprofile.decoration.ui.hightlighting.EMFProfileDecorationLanguageHighlightingConfiguration;
import org.modelversioning.emfprofile.decoration.ui.hover.EMFProfileDecorationLanguageEObjectDocumentationProvider;
import org.modelversioning.emfprofile.decoration.ui.hover.EMFProfileDecorationLanguageEObjectHoverProvider;

import com.google.inject.Binder;

/**
 * Use this class to register components to be used within the IDE.
 */
public class EMFProfileDecorationLanguageUiModule
		extends
		org.modelversioning.emfprofile.decoration.ui.AbstractEMFProfileDecorationLanguageUiModule {
	public EMFProfileDecorationLanguageUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(String.class)
				.annotatedWith(
						com.google.inject.name.Names
								.named((XtextContentAssistProcessor.COMPLETION_AUTO_ACTIVATION_CHARS)))
				.toInstance("{(");
	}

	// binding lexical highlighting provider
	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return EMFProfileDecorationLanguageHighlightingConfiguration.class;
	}
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return EMFProfileDecorationLanguageAntlrTokenToAttributeIdMapper.class;
	}
	
	// binding hover providers
    public Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider() {
        return EMFProfileDecorationLanguageEObjectHoverProvider.class;
    }
    public Class<? extends IEObjectDocumentationProvider> bindIEObjectDocumentationProvider() {
        return EMFProfileDecorationLanguageEObjectDocumentationProvider.class;
    }
}
