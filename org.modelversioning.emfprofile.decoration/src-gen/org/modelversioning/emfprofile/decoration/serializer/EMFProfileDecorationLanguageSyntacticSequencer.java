package org.modelversioning.emfprofile.decoration.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.modelversioning.emfprofile.decoration.services.EMFProfileDecorationLanguageGrammarAccess;

@SuppressWarnings("all")
public class EMFProfileDecorationLanguageSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EMFProfileDecorationLanguageGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BorderDecoration___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_5__q;
	protected AbstractElementAlias match_ColorConstant_SemicolonKeyword_1_q;
	protected AbstractElementAlias match_ConcreteColor_SemicolonKeyword_8_q;
	protected AbstractElementAlias match_Condition_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_ConnectionDecoration___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_6__q;
	protected AbstractElementAlias match_DecorationModel_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_DecorationModel_SemicolonKeyword_3_1_q;
	protected AbstractElementAlias match_Direction_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_IconDecoration_SemicolonKeyword_5_q;
	protected AbstractElementAlias match_Margin_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_Size_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_Style_SemicolonKeyword_3_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EMFProfileDecorationLanguageGrammarAccess) access;
		match_BorderDecoration___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_5__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getBorderDecorationAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getBorderDecorationAccess().getRightCurlyBracketKeyword_2_5()));
		match_ColorConstant_SemicolonKeyword_1_q = new TokenAlias(false, true, grammarAccess.getColorConstantAccess().getSemicolonKeyword_1());
		match_ConcreteColor_SemicolonKeyword_8_q = new TokenAlias(false, true, grammarAccess.getConcreteColorAccess().getSemicolonKeyword_8());
		match_Condition_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getConditionAccess().getSemicolonKeyword_3());
		match_ConnectionDecoration___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_6__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getConnectionDecorationAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getConnectionDecorationAccess().getRightCurlyBracketKeyword_2_6()));
		match_DecorationModel_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getDecorationModelAccess().getSemicolonKeyword_2());
		match_DecorationModel_SemicolonKeyword_3_1_q = new TokenAlias(false, true, grammarAccess.getDecorationModelAccess().getSemicolonKeyword_3_1());
		match_Direction_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getDirectionAccess().getSemicolonKeyword_3());
		match_IconDecoration_SemicolonKeyword_5_q = new TokenAlias(false, true, grammarAccess.getIconDecorationAccess().getSemicolonKeyword_5());
		match_Margin_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getMarginAccess().getSemicolonKeyword_3());
		match_Size_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getSizeAccess().getSemicolonKeyword_3());
		match_Style_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getStyleAccess().getSemicolonKeyword_3());
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
			if(match_BorderDecoration___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_5__q.equals(syntax))
				emit_BorderDecoration___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_5__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ColorConstant_SemicolonKeyword_1_q.equals(syntax))
				emit_ColorConstant_SemicolonKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConcreteColor_SemicolonKeyword_8_q.equals(syntax))
				emit_ConcreteColor_SemicolonKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Condition_SemicolonKeyword_3_q.equals(syntax))
				emit_Condition_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConnectionDecoration___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_6__q.equals(syntax))
				emit_ConnectionDecoration___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_6__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DecorationModel_SemicolonKeyword_2_q.equals(syntax))
				emit_DecorationModel_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DecorationModel_SemicolonKeyword_3_1_q.equals(syntax))
				emit_DecorationModel_SemicolonKeyword_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Direction_SemicolonKeyword_3_q.equals(syntax))
				emit_Direction_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IconDecoration_SemicolonKeyword_5_q.equals(syntax))
				emit_IconDecoration_SemicolonKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Margin_SemicolonKeyword_3_q.equals(syntax))
				emit_Margin_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Size_SemicolonKeyword_3_q.equals(syntax))
				emit_Size_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Style_SemicolonKeyword_3_q.equals(syntax))
				emit_Style_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_BorderDecoration___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_5__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_ColorConstant_SemicolonKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_ConcreteColor_SemicolonKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     ('{' '}')?
	 */
	protected void emit_ConnectionDecoration___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_6__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_Direction_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_IconDecoration_SemicolonKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_Margin_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_Size_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_Style_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
