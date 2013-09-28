package org.modelversioning.emfprofile.decoration.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Decoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage;
import org.modelversioning.emfprofile.decoration.decorationLanguage.EMFProfileDecorationModel;
import org.modelversioning.emfprofile.decoration.services.EMFProfileDecorationLanguageGrammarAccess;

@SuppressWarnings("all")
public class EMFProfileDecorationLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EMFProfileDecorationLanguageGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DecorationLanguagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DecorationLanguagePackage.DECORATION:
				if(context == grammarAccess.getDecorationRule()) {
					sequence_Decoration(context, (Decoration) semanticObject); 
					return; 
				}
				else break;
			case DecorationLanguagePackage.EMF_PROFILE_DECORATION_MODEL:
				if(context == grammarAccess.getEMFProfileDecorationModelRule()) {
					sequence_EMFProfileDecorationModel(context, (EMFProfileDecorationModel) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     decorations=[Stereotype|ID]
	 */
	protected void sequence_Decoration(EObject context, Decoration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DecorationLanguagePackage.Literals.DECORATION__DECORATIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DecorationLanguagePackage.Literals.DECORATION__DECORATIONS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDecorationAccess().getDecorationsStereotypeIDTerminalRuleCall_1_0_1(), semanticObject.getDecorations());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (importURI=STRING decorations+=Decoration*)
	 */
	protected void sequence_EMFProfileDecorationModel(EObject context, EMFProfileDecorationModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
