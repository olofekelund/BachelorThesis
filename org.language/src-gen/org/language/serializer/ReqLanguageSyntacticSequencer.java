package org.language.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.language.services.ReqLanguageGrammarAccess;

@SuppressWarnings("all")
public class ReqLanguageSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ReqLanguageGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Action___FromKeyword_3_1_or_OnKeyword_3_3_or_TheKeyword_3_2_or_ToKeyword_3_0__q;
	protected AbstractElementAlias match_MainAttributes_TheKeyword_0_0_or_TheKeyword_0_1;
	protected AbstractElementAlias match_MainComposition_TheKeyword_0_0_or_TheKeyword_0_1;
	protected AbstractElementAlias match_MainFunction_NotKeyword_3_q;
	protected AbstractElementAlias match_MainFunction_TheKeyword_0_0_or_TheKeyword_0_1;
	protected AbstractElementAlias match_MainFunction___BeKeyword_4_0_AbleKeyword_4_1_ToKeyword_4_2__q;
	protected AbstractElementAlias match_MainFunctions_TheKeyword_0_0_or_TheKeyword_0_1;
	protected AbstractElementAlias match_MainStateTransition_TheKeyword_0_0_or_TheKeyword_0_1;
	protected AbstractElementAlias match_ParameterState_IsKeyword_1_q;
	protected AbstractElementAlias match_PrefixCondition_HasKeyword_2_1_or_IsKeyword_2_0;
	protected AbstractElementAlias match_StateEvent_InKeyword_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ReqLanguageGrammarAccess) access;
		match_Action___FromKeyword_3_1_or_OnKeyword_3_3_or_TheKeyword_3_2_or_ToKeyword_3_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getActionAccess().getFromKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getActionAccess().getOnKeyword_3_3()), new TokenAlias(false, false, grammarAccess.getActionAccess().getTheKeyword_3_2()), new TokenAlias(false, false, grammarAccess.getActionAccess().getToKeyword_3_0()));
		match_MainAttributes_TheKeyword_0_0_or_TheKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMainAttributesAccess().getTheKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getMainAttributesAccess().getTheKeyword_0_1()));
		match_MainComposition_TheKeyword_0_0_or_TheKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMainCompositionAccess().getTheKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getMainCompositionAccess().getTheKeyword_0_1()));
		match_MainFunction_NotKeyword_3_q = new TokenAlias(false, true, grammarAccess.getMainFunctionAccess().getNotKeyword_3());
		match_MainFunction_TheKeyword_0_0_or_TheKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMainFunctionAccess().getTheKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getMainFunctionAccess().getTheKeyword_0_1()));
		match_MainFunction___BeKeyword_4_0_AbleKeyword_4_1_ToKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getMainFunctionAccess().getBeKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getMainFunctionAccess().getAbleKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getMainFunctionAccess().getToKeyword_4_2()));
		match_MainFunctions_TheKeyword_0_0_or_TheKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMainFunctionsAccess().getTheKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getMainFunctionsAccess().getTheKeyword_0_1()));
		match_MainStateTransition_TheKeyword_0_0_or_TheKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMainStateTransitionAccess().getTheKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getMainStateTransitionAccess().getTheKeyword_0_1()));
		match_ParameterState_IsKeyword_1_q = new TokenAlias(false, true, grammarAccess.getParameterStateAccess().getIsKeyword_1());
		match_PrefixCondition_HasKeyword_2_1_or_IsKeyword_2_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPrefixConditionAccess().getHasKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getPrefixConditionAccess().getIsKeyword_2_0()));
		match_StateEvent_InKeyword_2_q = new TokenAlias(false, true, grammarAccess.getStateEventAccess().getInKeyword_2());
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
			if(match_Action___FromKeyword_3_1_or_OnKeyword_3_3_or_TheKeyword_3_2_or_ToKeyword_3_0__q.equals(syntax))
				emit_Action___FromKeyword_3_1_or_OnKeyword_3_3_or_TheKeyword_3_2_or_ToKeyword_3_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MainAttributes_TheKeyword_0_0_or_TheKeyword_0_1.equals(syntax))
				emit_MainAttributes_TheKeyword_0_0_or_TheKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MainComposition_TheKeyword_0_0_or_TheKeyword_0_1.equals(syntax))
				emit_MainComposition_TheKeyword_0_0_or_TheKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MainFunction_NotKeyword_3_q.equals(syntax))
				emit_MainFunction_NotKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MainFunction_TheKeyword_0_0_or_TheKeyword_0_1.equals(syntax))
				emit_MainFunction_TheKeyword_0_0_or_TheKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MainFunction___BeKeyword_4_0_AbleKeyword_4_1_ToKeyword_4_2__q.equals(syntax))
				emit_MainFunction___BeKeyword_4_0_AbleKeyword_4_1_ToKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MainFunctions_TheKeyword_0_0_or_TheKeyword_0_1.equals(syntax))
				emit_MainFunctions_TheKeyword_0_0_or_TheKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MainStateTransition_TheKeyword_0_0_or_TheKeyword_0_1.equals(syntax))
				emit_MainStateTransition_TheKeyword_0_0_or_TheKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ParameterState_IsKeyword_1_q.equals(syntax))
				emit_ParameterState_IsKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PrefixCondition_HasKeyword_2_1_or_IsKeyword_2_0.equals(syntax))
				emit_PrefixCondition_HasKeyword_2_1_or_IsKeyword_2_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StateEvent_InKeyword_2_q.equals(syntax))
				emit_StateEvent_InKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('to' | 'from' | 'the' | 'on')?
	 */
	protected void emit_Action___FromKeyword_3_1_or_OnKeyword_3_3_or_TheKeyword_3_2_or_ToKeyword_3_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'The' | 'the'
	 */
	protected void emit_MainAttributes_TheKeyword_0_0_or_TheKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'The' | 'the'
	 */
	protected void emit_MainComposition_TheKeyword_0_0_or_TheKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'not'?
	 */
	protected void emit_MainFunction_NotKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'The' | 'the'
	 */
	protected void emit_MainFunction_TheKeyword_0_0_or_TheKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('be' 'able' 'to')?
	 */
	protected void emit_MainFunction___BeKeyword_4_0_AbleKeyword_4_1_ToKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'The' | 'the'
	 */
	protected void emit_MainFunctions_TheKeyword_0_0_or_TheKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'The' | 'the'
	 */
	protected void emit_MainStateTransition_TheKeyword_0_0_or_TheKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'is'?
	 */
	protected void emit_ParameterState_IsKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'is' | 'has'
	 */
	protected void emit_PrefixCondition_HasKeyword_2_1_or_IsKeyword_2_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'in'?
	 */
	protected void emit_StateEvent_InKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
