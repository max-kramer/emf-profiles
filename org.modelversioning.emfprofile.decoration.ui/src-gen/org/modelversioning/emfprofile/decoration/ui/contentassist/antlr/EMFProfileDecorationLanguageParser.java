/*
* generated by Xtext
*/
package org.modelversioning.emfprofile.decoration.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.modelversioning.emfprofile.decoration.services.EMFProfileDecorationLanguageGrammarAccess;

public class EMFProfileDecorationLanguageParser extends AbstractContentAssistParser {
	
	@Inject
	private EMFProfileDecorationLanguageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.modelversioning.emfprofile.decoration.ui.contentassist.antlr.internal.InternalEMFProfileDecorationLanguageParser createParser() {
		org.modelversioning.emfprofile.decoration.ui.contentassist.antlr.internal.InternalEMFProfileDecorationLanguageParser result = new org.modelversioning.emfprofile.decoration.ui.contentassist.antlr.internal.InternalEMFProfileDecorationLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDecorationAccess().getAlternatives(), "rule__Decoration__Alternatives");
					put(grammarAccess.getAbstractConditionAccess().getAlternatives(), "rule__AbstractCondition__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getComparisonOperatorAccess().getAlternatives(), "rule__ComparisonOperator__Alternatives");
					put(grammarAccess.getLogicalOperatorAccess().getAlternatives(), "rule__LogicalOperator__Alternatives");
					put(grammarAccess.getDecorationModelAccess().getGroup(), "rule__DecorationModel__Group__0");
					put(grammarAccess.getDecorationModelAccess().getGroup_3(), "rule__DecorationModel__Group_3__0");
					put(grammarAccess.getNamespaceAccess().getGroup(), "rule__Namespace__Group__0");
					put(grammarAccess.getDecorationDescriptionAccess().getGroup(), "rule__DecorationDescription__Group__0");
					put(grammarAccess.getIconDecorationAccess().getGroup(), "rule__IconDecoration__Group__0");
					put(grammarAccess.getBorderDecorationAccess().getGroup(), "rule__BorderDecoration__Group__0");
					put(grammarAccess.getActivationAccess().getGroup(), "rule__Activation__Group__0");
					put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
					put(grammarAccess.getCompositeConditionAccess().getGroup(), "rule__CompositeCondition__Group__0");
					put(grammarAccess.getPosiblySignedDoubleAccess().getGroup(), "rule__PosiblySignedDouble__Group__0");
					put(grammarAccess.getPossiblySignedIntegerAccess().getGroup(), "rule__PossiblySignedInteger__Group__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getDecorationModelAccess().getImportURIAssignment_1(), "rule__DecorationModel__ImportURIAssignment_1");
					put(grammarAccess.getDecorationModelAccess().getNamespaceAssignment_3_0(), "rule__DecorationModel__NamespaceAssignment_3_0");
					put(grammarAccess.getDecorationModelAccess().getDecorationDescriptionsAssignment_4(), "rule__DecorationModel__DecorationDescriptionsAssignment_4");
					put(grammarAccess.getNamespaceAccess().getProfileAssignment_1(), "rule__Namespace__ProfileAssignment_1");
					put(grammarAccess.getDecorationDescriptionAccess().getStereotypeAssignment_1(), "rule__DecorationDescription__StereotypeAssignment_1");
					put(grammarAccess.getDecorationDescriptionAccess().getDecorationsAssignment_3(), "rule__DecorationDescription__DecorationsAssignment_3");
					put(grammarAccess.getDecorationDescriptionAccess().getActivationAssignment_4(), "rule__DecorationDescription__ActivationAssignment_4");
					put(grammarAccess.getIconDecorationAccess().getLocation_uriAssignment_4(), "rule__IconDecoration__Location_uriAssignment_4");
					put(grammarAccess.getIconDecorationAccess().getActivationAssignment_6(), "rule__IconDecoration__ActivationAssignment_6");
					put(grammarAccess.getBorderDecorationAccess().getSizeAssignment_4(), "rule__BorderDecoration__SizeAssignment_4");
					put(grammarAccess.getBorderDecorationAccess().getActivationAssignment_6(), "rule__BorderDecoration__ActivationAssignment_6");
					put(grammarAccess.getActivationAccess().getConditionAssignment_1(), "rule__Activation__ConditionAssignment_1");
					put(grammarAccess.getConditionAccess().getAttributeAssignment_0(), "rule__Condition__AttributeAssignment_0");
					put(grammarAccess.getConditionAccess().getOperatorAssignment_1(), "rule__Condition__OperatorAssignment_1");
					put(grammarAccess.getConditionAccess().getValueAssignment_2(), "rule__Condition__ValueAssignment_2");
					put(grammarAccess.getCompositeConditionAccess().getOperatorAssignment_0(), "rule__CompositeCondition__OperatorAssignment_0");
					put(grammarAccess.getCompositeConditionAccess().getConditionsAssignment_2(), "rule__CompositeCondition__ConditionsAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.modelversioning.emfprofile.decoration.ui.contentassist.antlr.internal.InternalEMFProfileDecorationLanguageParser typedParser = (org.modelversioning.emfprofile.decoration.ui.contentassist.antlr.internal.InternalEMFProfileDecorationLanguageParser) parser;
			typedParser.entryRuleDecorationModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public EMFProfileDecorationLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(EMFProfileDecorationLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
