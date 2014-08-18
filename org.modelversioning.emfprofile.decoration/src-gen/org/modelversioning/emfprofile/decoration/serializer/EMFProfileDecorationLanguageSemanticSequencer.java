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
import org.modelversioning.emfprofile.decoration.decorationLanguage.Border;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.BoxImage;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Color;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ColorConstant;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ColorDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ComplexText;
import org.modelversioning.emfprofile.decoration.decorationLanguage.CompositeCondition;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Condition;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ConnectionDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationModel;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Direction;
import org.modelversioning.emfprofile.decoration.decorationLanguage.HexColor;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Margin;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Namespace;
import org.modelversioning.emfprofile.decoration.decorationLanguage.OclExpression;
import org.modelversioning.emfprofile.decoration.decorationLanguage.RGB;
import org.modelversioning.emfprofile.decoration.decorationLanguage.SimpleText;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Size;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Style;
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
			case DecorationLanguagePackage.BORDER:
				if(context == grammarAccess.getBorderRule()) {
					sequence_Border(context, (Border) semanticObject); 
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
			case DecorationLanguagePackage.BOX_DECORATION:
				if(context == grammarAccess.getAbstractDecorationRule() ||
				   context == grammarAccess.getBoxDecorationRule()) {
					sequence_BoxDecoration(context, (BoxDecoration) semanticObject); 
					return; 
				}
				else break;
			case DecorationLanguagePackage.BOX_IMAGE:
				if(context == grammarAccess.getBoxImageRule()) {
					sequence_BoxImage(context, (BoxImage) semanticObject); 
					return; 
				}
				else break;
			case DecorationLanguagePackage.COLOR:
				if(context == grammarAccess.getColorRule()) {
					sequence_Color(context, (Color) semanticObject); 
					return; 
				}
				else break;
			case DecorationLanguagePackage.COLOR_CONSTANT:
				if(context == grammarAccess.getColorConstantRule()) {
					sequence_ColorConstant(context, (ColorConstant) semanticObject); 
					return; 
				}
				else break;
			case DecorationLanguagePackage.COLOR_DECORATION:
				if(context == grammarAccess.getAbstractDecorationRule() ||
				   context == grammarAccess.getColorDecorationRule()) {
					sequence_ColorDecoration(context, (ColorDecoration) semanticObject); 
					return; 
				}
				else break;
			case DecorationLanguagePackage.COMPLEX_TEXT:
				if(context == grammarAccess.getComplexTextRule() ||
				   context == grammarAccess.getTextRule()) {
					sequence_ComplexText(context, (ComplexText) semanticObject); 
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
			case DecorationLanguagePackage.CONNECTION_DECORATION:
				if(context == grammarAccess.getAbstractDecorationRule() ||
				   context == grammarAccess.getConnectionDecorationRule()) {
					sequence_ConnectionDecoration(context, (ConnectionDecoration) semanticObject); 
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
			case DecorationLanguagePackage.DIRECTION:
				if(context == grammarAccess.getDirectionRule()) {
					sequence_Direction(context, (Direction) semanticObject); 
					return; 
				}
				else break;
			case DecorationLanguagePackage.HEX_COLOR:
				if(context == grammarAccess.getConcreteColorRule() ||
				   context == grammarAccess.getHexColorRule()) {
					sequence_HexColor(context, (HexColor) semanticObject); 
					return; 
				}
				else break;
			case DecorationLanguagePackage.IMAGE_DECORATION:
				if(context == grammarAccess.getAbstractDecorationRule() ||
				   context == grammarAccess.getImageDecorationRule()) {
					sequence_ImageDecoration(context, (ImageDecoration) semanticObject); 
					return; 
				}
				else break;
			case DecorationLanguagePackage.MARGIN:
				if(context == grammarAccess.getMarginRule()) {
					sequence_Margin(context, (Margin) semanticObject); 
					return; 
				}
				else break;
			case DecorationLanguagePackage.NAMESPACE:
				if(context == grammarAccess.getNamespaceRule()) {
					sequence_Namespace(context, (Namespace) semanticObject); 
					return; 
				}
				else break;
			case DecorationLanguagePackage.OCL_EXPRESSION:
				if(context == grammarAccess.getAbstractConditionRule() ||
				   context == grammarAccess.getOclExpressionRule()) {
					sequence_OclExpression(context, (OclExpression) semanticObject); 
					return; 
				}
				else break;
			case DecorationLanguagePackage.RGB:
				if(context == grammarAccess.getConcreteColorRule() ||
				   context == grammarAccess.getRGBRule()) {
					sequence_RGB(context, (RGB) semanticObject); 
					return; 
				}
				else break;
			case DecorationLanguagePackage.SIMPLE_TEXT:
				if(context == grammarAccess.getSimpleTextRule() ||
				   context == grammarAccess.getTextRule()) {
					sequence_SimpleText(context, (SimpleText) semanticObject); 
					return; 
				}
				else break;
			case DecorationLanguagePackage.SIZE:
				if(context == grammarAccess.getSizeRule()) {
					sequence_Size(context, (Size) semanticObject); 
					return; 
				}
				else break;
			case DecorationLanguagePackage.STYLE:
				if(context == grammarAccess.getStyleRule()) {
					sequence_Style(context, (Style) semanticObject); 
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
	 *     (border=Border activation=Activation?)
	 */
	protected void sequence_BorderDecoration(EObject context, BorderDecoration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (size=Size? color=Color? style=Style?)
	 */
	protected void sequence_Border(EObject context, Border semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         text=Text 
	 *         widht=INT 
	 *         height=INT 
	 *         image=BoxImage? 
	 *         border=Border? 
	 *         foregroundColor=Color? 
	 *         backgroundColor=Color? 
	 *         direction=Direction? 
	 *         margin=Margin? 
	 *         contentDirection=Directions? 
	 *         tooltip=Text? 
	 *         activation=Activation?
	 *     )
	 */
	protected void sequence_BoxDecoration(EObject context, BoxDecoration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (location_uri=STRING placement=BoxImageOrientation?)
	 */
	protected void sequence_BoxImage(EObject context, BoxImage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Colors
	 */
	protected void sequence_ColorConstant(EObject context, ColorConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DecorationLanguagePackage.Literals.COLOR_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DecorationLanguagePackage.Literals.COLOR_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColorConstantAccess().getValueColorsEnumRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (background=Color? foreground=Color? activation=Activation?)
	 */
	protected void sequence_ColorDecoration(EObject context, ColorDecoration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=ColorConstant
	 */
	protected void sequence_Color(EObject context, Color semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SimpleText right=Text)
	 */
	protected void sequence_ComplexText(EObject context, ComplexText semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DecorationLanguagePackage.Literals.COMPLEX_TEXT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DecorationLanguagePackage.Literals.COMPLEX_TEXT__LEFT));
			if(transientValues.isValueTransient(semanticObject, DecorationLanguagePackage.Literals.COMPLEX_TEXT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DecorationLanguagePackage.Literals.COMPLEX_TEXT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComplexTextAccess().getLeftSimpleTextParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComplexTextAccess().getRightTextParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
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
	 *     (size=Size? style=Style? color=Color? activation=Activation?)
	 */
	protected void sequence_ConnectionDecoration(EObject context, ConnectionDecoration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stereotype=[Stereotype|QualifiedName] decorations+=AbstractDecoration+ activation=Activation?)
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
	 *     value=Directions
	 */
	protected void sequence_Direction(EObject context, Direction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DecorationLanguagePackage.Literals.DIRECTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DecorationLanguagePackage.Literals.DIRECTION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDirectionAccess().getValueDirectionsEnumRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     hexCode=HEX_COLOR
	 */
	protected void sequence_HexColor(EObject context, HexColor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DecorationLanguagePackage.Literals.HEX_COLOR__HEX_CODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DecorationLanguagePackage.Literals.HEX_COLOR__HEX_CODE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHexColorAccess().getHexCodeHEX_COLORTerminalRuleCall_0(), semanticObject.getHexCode());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (location_uri=STRING direction=Direction? margin=Margin? tooltip=Text? activation=Activation?)
	 */
	protected void sequence_ImageDecoration(EObject context, ImageDecoration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=SignedInteger
	 */
	protected void sequence_Margin(EObject context, Margin semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DecorationLanguagePackage.Literals.MARGIN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DecorationLanguagePackage.Literals.MARGIN__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMarginAccess().getValueSignedIntegerParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
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
	
	
	/**
	 * Constraint:
	 *     expression=STRING
	 */
	protected void sequence_OclExpression(EObject context, OclExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DecorationLanguagePackage.Literals.OCL_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DecorationLanguagePackage.Literals.OCL_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOclExpressionAccess().getExpressionSTRINGTerminalRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (red=INT green=INT blue=INT)
	 */
	protected void sequence_RGB(EObject context, RGB semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DecorationLanguagePackage.Literals.RGB__RED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DecorationLanguagePackage.Literals.RGB__RED));
			if(transientValues.isValueTransient(semanticObject, DecorationLanguagePackage.Literals.RGB__GREEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DecorationLanguagePackage.Literals.RGB__GREEN));
			if(transientValues.isValueTransient(semanticObject, DecorationLanguagePackage.Literals.RGB__BLUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DecorationLanguagePackage.Literals.RGB__BLUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRGBAccess().getRedINTTerminalRuleCall_2_0(), semanticObject.getRed());
		feeder.accept(grammarAccess.getRGBAccess().getGreenINTTerminalRuleCall_4_0(), semanticObject.getGreen());
		feeder.accept(grammarAccess.getRGBAccess().getBlueINTTerminalRuleCall_6_0(), semanticObject.getBlue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (text=STRING | attribute=[EAttribute|QualifiedName])
	 */
	protected void sequence_SimpleText(EObject context, SimpleText semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Size(EObject context, Size semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DecorationLanguagePackage.Literals.SIZE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DecorationLanguagePackage.Literals.SIZE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSizeAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=LineStyle
	 */
	protected void sequence_Style(EObject context, Style semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DecorationLanguagePackage.Literals.STYLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DecorationLanguagePackage.Literals.STYLE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStyleAccess().getValueLineStyleEnumRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
}
