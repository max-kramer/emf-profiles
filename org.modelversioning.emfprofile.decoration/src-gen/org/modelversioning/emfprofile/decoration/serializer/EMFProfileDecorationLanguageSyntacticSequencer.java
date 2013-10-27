package org.modelversioning.emfprofile.decoration.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.modelversioning.emfprofile.decoration.services.EMFProfileDecorationLanguageGrammarAccess;

@SuppressWarnings("all")
public class EMFProfileDecorationLanguageSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EMFProfileDecorationLanguageGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BorderDecoration_SemicolonKeyword_5_q;
	protected AbstractElementAlias match_Condition_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_DecorationModel_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_DecorationModel_SemicolonKeyword_3_1_q;
	protected AbstractElementAlias match_IconDecoration_SemicolonKeyword_5_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EMFProfileDecorationLanguageGrammarAccess) access;
		match_BorderDecoration_SemicolonKeyword_5_q = new TokenAlias(false, true, grammarAccess.getBorderDecorationAccess().getSemicolonKeyword_5());
		match_Condition_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getConditionAccess().getSemicolonKeyword_3());
		match_DecorationModel_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getDecorationModelAccess().getSemicolonKeyword_2());
		match_DecorationModel_SemicolonKeyword_3_1_q = new TokenAlias(false, true, grammarAccess.getDecorationModelAccess().getSemicolonKeyword_3_1());
		match_IconDecoration_SemicolonKeyword_5_q = new TokenAlias(false, true, grammarAccess.getIconDecorationAccess().getSemicolonKeyword_5());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_BorderDecoration_SemicolonKeyword_5_q.equals(syntax))
				emit_BorderDecoration_SemicolonKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Condition_SemicolonKeyword_3_q.equals(syntax))
				emit_Condition_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DecorationModel_SemicolonKeyword_2_q.equals(syntax))
				emit_DecorationModel_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DecorationModel_SemicolonKeyword_3_1_q.equals(syntax))
				emit_DecorationModel_SemicolonKeyword_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IconDecoration_SemicolonKeyword_5_q.equals(syntax))
				emit_IconDecoration_SemicolonKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_BorderDecoration_SemicolonKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_Condition_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_DecorationModel_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_DecorationModel_SemicolonKeyword_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_IconDecoration_SemicolonKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
