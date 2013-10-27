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
import org.modelversioning.emfprofile.decoration.decorationLanguage.Activation;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.CompositeCondition;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Condition;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationModel;
import org.modelversioning.emfprofile.decoration.decorationLanguage.IconDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Namespace;
import org.modelversioning.emfprofile.decoration.services.EMFProfileDecorationLanguageGrammarAccess;

@SuppressWarnings("all")
public class EMFProfileDecorationLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EMFProfileDecorationLanguageGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DecorationLanguagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DecorationLanguagePackage.ACTIVATION:
				if(context == grammarAccess.getActivationRule()) {
					sequence_Activation(context, (Activation) semanticObject); 
					return; 
				}
				else break;
			case DecorationLanguagePackage.BORDER_DECORATION:
				if(context == grammarAccess.getAbstractDecorationRule() ||
				   context == grammarAccess.getBorderDecorationRule()) {
					sequence_BorderDecoration(context, (BorderDecoration) semanticObject); 
					return; 
				}
				else break;
			case DecorationLanguagePackage.COMPOSITE_CONDITION:
				if(context == grammarAccess.getAbstractConditionRule() ||
				   context == grammarAccess.getCompositeConditionRule()) {
					sequence_CompositeCondition(context, (CompositeCondition) semanticObject); 
					return; 
				}
				else break;
			case DecorationLanguagePackage.CONDITION:
				if(context == grammarAccess.getAbstractConditionRule() ||
				   context == grammarAccess.getConditionRule()) {
					sequence_Condition(context, (Condition) semanticObject); 
					return; 
				}
				else break;
			case DecorationLanguagePackage.DECORATION_DESCRIPTION:
				if(context == grammarAccess.getDecorationDescriptionRule()) {
					sequence_DecorationDescription(context, (DecorationDescription) semanticObject); 
					return; 
				}
				else break;
			case DecorationLanguagePackage.DECORATION_MODEL:
				if(context == grammarAccess.getDecorationModelRule()) {
					sequence_DecorationModel(context, (DecorationModel) semanticObject); 
					return; 
				}
				else break;
			case DecorationLanguagePackage.ICON_DECORATION:
				if(context == grammarAccess.getAbstractDecorationRule() ||
				   context == grammarAccess.getIconDecorationRule()) {
					sequence_IconDecoration(context, (IconDecoration) semanticObject); 
					return; 
				}
				else break;
			case DecorationLanguagePackage.NAMESPACE:
				if(context == grammarAccess.getNamespaceRule()) {
					sequence_Namespace(context, (Namespace) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     condition=AbstractCondition
	 */
	protected void sequence_Activation(EObject context, Activation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DecorationLanguagePackage.Literals.ACTIVATION__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DecorationLanguagePackage.Literals.ACTIVATION__CONDITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActivationAccess().getConditionAbstractConditionParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (size=INT active=Activation?)
	 */
	protected void sequence_BorderDecoration(EObject context, BorderDecoration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=LogicalOperator conditions+=AbstractCondition+)
	 */
	protected void sequence_CompositeCondition(EObject context, CompositeCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attribute=[EAttribute|QualifiedName] operator=ComparisonOperator value=Type)
	 */
	protected void sequence_Condition(EObject context, Condition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DecorationLanguagePackage.Literals.CONDITION__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DecorationLanguagePackage.Literals.CONDITION__ATTRIBUTE));
			if(transientValues.isValueTransient(semanticObject, DecorationLanguagePackage.Literals.CONDITION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DecorationLanguagePackage.Literals.CONDITION__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, DecorationLanguagePackage.Literals.CONDITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DecorationLanguagePackage.Literals.CONDITION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConditionAccess().getAttributeEAttributeQualifiedNameParserRuleCall_0_0_1(), semanticObject.getAttribute());
		feeder.accept(grammarAccess.getConditionAccess().getOperatorComparisonOperatorEnumRuleCall_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getConditionAccess().getValueTypeParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (stereotype=[Stereotype|QualifiedName] decorations+=AbstractDecoration+ active=Activation?)
	 */
	protected void sequence_DecorationDescription(EObject context, DecorationDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (importURI=STRING namespace=Namespace? decorationDescriptions+=DecorationDescription*)
	 */
	protected void sequence_DecorationModel(EObject context, DecorationModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (location_uri=STRING active=Activation?)
	 */
	protected void sequence_IconDecoration(EObject context, IconDecoration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     profile=[Profile|QualifiedName]
	 */
	protected void sequence_Namespace(EObject context, Namespace semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DecorationLanguagePackage.Literals.NAMESPACE__PROFILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DecorationLanguagePackage.Literals.NAMESPACE__PROFILE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNamespaceAccess().getProfileProfileQualifiedNameParserRuleCall_1_0_1(), semanticObject.getProfile());
		feeder.finish();
	}
}
