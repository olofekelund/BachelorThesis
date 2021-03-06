/*
* generated by Xtext
*/
package org.language.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.language.services.ReqLanguageGrammarAccess;

public class ReqLanguageParser extends AbstractContentAssistParser {
	
	@Inject
	private ReqLanguageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.language.ui.contentassist.antlr.internal.InternalReqLanguageParser createParser() {
		org.language.ui.contentassist.antlr.internal.InternalReqLanguageParser result = new org.language.ui.contentassist.antlr.internal.InternalReqLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getRequirementAccess().getMainRequirementAlternatives_2_0(), "rule__Requirement__MainRequirementAlternatives_2_0");
					put(grammarAccess.getPrefixAccess().getLeftOperandAlternatives_0_0(), "rule__Prefix__LeftOperandAlternatives_0_0");
					put(grammarAccess.getPrefixRightOperandAccess().getOperatorAlternatives_0_0(), "rule__PrefixRightOperand__OperatorAlternatives_0_0");
					put(grammarAccess.getPrefixRightOperandAccess().getPrefixRightOperandAlternatives_1_0(), "rule__PrefixRightOperand__PrefixRightOperandAlternatives_1_0");
					put(grammarAccess.getPrefixStateAccess().getStateExpressionAlternatives_1_0(), "rule__PrefixState__StateExpressionAlternatives_1_0");
					put(grammarAccess.getPrefixConditionAccess().getParameterAlternatives_1_0(), "rule__PrefixCondition__ParameterAlternatives_1_0");
					put(grammarAccess.getPrefixConditionAccess().getAlternatives_2(), "rule__PrefixCondition__Alternatives_2");
					put(grammarAccess.getPrefixConditionAccess().getAlternatives_4(), "rule__PrefixCondition__Alternatives_4");
					put(grammarAccess.getPrefixEventAccess().getEvent_expressionAlternatives_1_0(), "rule__PrefixEvent__Event_expressionAlternatives_1_0");
					put(grammarAccess.getPrefixFixedSyntaxAccess().getAlternatives(), "rule__PrefixFixedSyntax__Alternatives");
					put(grammarAccess.getParamEventAccess().getParameterAlternatives_0_0(), "rule__ParamEvent__ParameterAlternatives_0_0");
					put(grammarAccess.getParamEventAccess().getActionAlternatives_1_0(), "rule__ParamEvent__ActionAlternatives_1_0");
					put(grammarAccess.getActorEventAccess().getActorAlternatives_0_0(), "rule__ActorEvent__ActorAlternatives_0_0");
					put(grammarAccess.getActorEventAccess().getActionAlternatives_1_0(), "rule__ActorEvent__ActionAlternatives_1_0");
					put(grammarAccess.getParameterStateAccess().getParameter_valueAlternatives_2_0(), "rule__ParameterState__Parameter_valueAlternatives_2_0");
					put(grammarAccess.getMainFunctionAccess().getAlternatives_0(), "rule__MainFunction__Alternatives_0");
					put(grammarAccess.getMainFunctionAccess().getSystemAlternatives_1_0(), "rule__MainFunction__SystemAlternatives_1_0");
					put(grammarAccess.getMainCompositionAccess().getAlternatives_0(), "rule__MainComposition__Alternatives_0");
					put(grammarAccess.getMainStateTransitionAccess().getAlternatives_0(), "rule__MainStateTransition__Alternatives_0");
					put(grammarAccess.getMainStateTransitionAccess().getTransitionAlternatives_3_0(), "rule__MainStateTransition__TransitionAlternatives_3_0");
					put(grammarAccess.getMainAttributesAccess().getAlternatives_0(), "rule__MainAttributes__Alternatives_0");
					put(grammarAccess.getMainFunctionsAccess().getAlternatives_0(), "rule__MainFunctions__Alternatives_0");
					put(grammarAccess.getOperatorAccess().getOperatorAlternatives_0(), "rule__Operator__OperatorAlternatives_0");
					put(grammarAccess.getTransitionAccess().getSource_stateAlternatives_1_1_0(), "rule__Transition__Source_stateAlternatives_1_1_0");
					put(grammarAccess.getTransitionAccess().getTarget_stateAlternatives_3_0(), "rule__Transition__Target_stateAlternatives_3_0");
					put(grammarAccess.getOutTransitionAccess().getSource_stateAlternatives_1_0(), "rule__OutTransition__Source_stateAlternatives_1_0");
					put(grammarAccess.getNoTransitionAccess().getStateAlternatives_1_0(), "rule__NoTransition__StateAlternatives_1_0");
					put(grammarAccess.getActionAccess().getAlternatives_3(), "rule__Action__Alternatives_3");
					put(grammarAccess.getActionAccess().getSubjectAlternatives_4_0(), "rule__Action__SubjectAlternatives_4_0");
					put(grammarAccess.getTimeAccess().getTimeUnitAlternatives_2_0(), "rule__Time__TimeUnitAlternatives_2_0");
					put(grammarAccess.getTimingConstraintAccess().getTimingConstraintAlternatives_0_0(), "rule__TimingConstraint__TimingConstraintAlternatives_0_0");
					put(grammarAccess.getTimingConstraintAccess().getMinmaxAlternatives_1_0(), "rule__TimingConstraint__MinmaxAlternatives_1_0");
					put(grammarAccess.getRequirementAccess().getGroup(), "rule__Requirement__Group__0");
					put(grammarAccess.getReqIDAccess().getGroup(), "rule__ReqID__Group__0");
					put(grammarAccess.getPrefixAccess().getGroup(), "rule__Prefix__Group__0");
					put(grammarAccess.getPrefixRightOperandAccess().getGroup(), "rule__PrefixRightOperand__Group__0");
					put(grammarAccess.getPrefixStateAccess().getGroup(), "rule__PrefixState__Group__0");
					put(grammarAccess.getPrefixConditionAccess().getGroup(), "rule__PrefixCondition__Group__0");
					put(grammarAccess.getPrefixEventAccess().getGroup(), "rule__PrefixEvent__Group__0");
					put(grammarAccess.getPrefixFixedSyntaxAccess().getGroup_2(), "rule__PrefixFixedSyntax__Group_2__0");
					put(grammarAccess.getPrefixFixedSyntaxAccess().getGroup_5(), "rule__PrefixFixedSyntax__Group_5__0");
					put(grammarAccess.getParamEventAccess().getGroup(), "rule__ParamEvent__Group__0");
					put(grammarAccess.getActorEventAccess().getGroup(), "rule__ActorEvent__Group__0");
					put(grammarAccess.getStateEventAccess().getGroup(), "rule__StateEvent__Group__0");
					put(grammarAccess.getParameterStateAccess().getGroup(), "rule__ParameterState__Group__0");
					put(grammarAccess.getMainFunctionAccess().getGroup(), "rule__MainFunction__Group__0");
					put(grammarAccess.getMainFunctionAccess().getGroup_4(), "rule__MainFunction__Group_4__0");
					put(grammarAccess.getMainCompositionAccess().getGroup(), "rule__MainComposition__Group__0");
					put(grammarAccess.getMainCompositionAccess().getGroup_8(), "rule__MainComposition__Group_8__0");
					put(grammarAccess.getMainStateTransitionAccess().getGroup(), "rule__MainStateTransition__Group__0");
					put(grammarAccess.getMainStateTransitionAccess().getGroup_4(), "rule__MainStateTransition__Group_4__0");
					put(grammarAccess.getMainAttributesAccess().getGroup(), "rule__MainAttributes__Group__0");
					put(grammarAccess.getMainAttributesAccess().getGroup_7(), "rule__MainAttributes__Group_7__0");
					put(grammarAccess.getMainFunctionsAccess().getGroup(), "rule__MainFunctions__Group__0");
					put(grammarAccess.getMainFunctionsAccess().getGroup_7(), "rule__MainFunctions__Group_7__0");
					put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
					put(grammarAccess.getTransitionAccess().getGroup_1(), "rule__Transition__Group_1__0");
					put(grammarAccess.getOutTransitionAccess().getGroup(), "rule__OutTransition__Group__0");
					put(grammarAccess.getNoTransitionAccess().getGroup(), "rule__NoTransition__Group__0");
					put(grammarAccess.getSystemAccess().getGroup(), "rule__System__Group__0");
					put(grammarAccess.getActorAccess().getGroup(), "rule__Actor__Group__0");
					put(grammarAccess.getUserAccess().getGroup(), "rule__User__Group__0");
					put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
					put(grammarAccess.getActionAccess().getGroup_2(), "rule__Action__Group_2__0");
					put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getValueAccess().getGroup(), "rule__Value__Group__0");
					put(grammarAccess.getTimeAccess().getGroup(), "rule__Time__Group__0");
					put(grammarAccess.getTimingConstraintAccess().getGroup(), "rule__TimingConstraint__Group__0");
					put(grammarAccess.getModelAccess().getRequirementsAssignment(), "rule__Model__RequirementsAssignment");
					put(grammarAccess.getRequirementAccess().getReqIDAssignment_0(), "rule__Requirement__ReqIDAssignment_0");
					put(grammarAccess.getRequirementAccess().getPrefixAssignment_1(), "rule__Requirement__PrefixAssignment_1");
					put(grammarAccess.getRequirementAccess().getMainRequirementAssignment_2(), "rule__Requirement__MainRequirementAssignment_2");
					put(grammarAccess.getReqIDAccess().getReqIDAssignment_0(), "rule__ReqID__ReqIDAssignment_0");
					put(grammarAccess.getReqIDAccess().getNameAssignment_1(), "rule__ReqID__NameAssignment_1");
					put(grammarAccess.getPrefixAccess().getLeftOperandAssignment_0(), "rule__Prefix__LeftOperandAssignment_0");
					put(grammarAccess.getPrefixAccess().getPrefixListAssignment_1(), "rule__Prefix__PrefixListAssignment_1");
					put(grammarAccess.getPrefixRightOperandAccess().getOperatorAssignment_0(), "rule__PrefixRightOperand__OperatorAssignment_0");
					put(grammarAccess.getPrefixRightOperandAccess().getPrefixRightOperandAssignment_1(), "rule__PrefixRightOperand__PrefixRightOperandAssignment_1");
					put(grammarAccess.getPrefixStateAccess().getPrefixFixedSyntaxAssignment_0(), "rule__PrefixState__PrefixFixedSyntaxAssignment_0");
					put(grammarAccess.getPrefixStateAccess().getStateExpressionAssignment_1(), "rule__PrefixState__StateExpressionAssignment_1");
					put(grammarAccess.getPrefixConditionAccess().getPrefixFixedSyntaxAssignment_0(), "rule__PrefixCondition__PrefixFixedSyntaxAssignment_0");
					put(grammarAccess.getPrefixConditionAccess().getParameterAssignment_1(), "rule__PrefixCondition__ParameterAssignment_1");
					put(grammarAccess.getPrefixConditionAccess().getOperatorAssignment_3(), "rule__PrefixCondition__OperatorAssignment_3");
					put(grammarAccess.getPrefixConditionAccess().getValueAssignment_4_0(), "rule__PrefixCondition__ValueAssignment_4_0");
					put(grammarAccess.getPrefixConditionAccess().getTimeAssignment_4_1(), "rule__PrefixCondition__TimeAssignment_4_1");
					put(grammarAccess.getPrefixEventAccess().getPrefixFixedSyntaxAssignment_0(), "rule__PrefixEvent__PrefixFixedSyntaxAssignment_0");
					put(grammarAccess.getPrefixEventAccess().getEvent_expressionAssignment_1(), "rule__PrefixEvent__Event_expressionAssignment_1");
					put(grammarAccess.getParamEventAccess().getParameterAssignment_0(), "rule__ParamEvent__ParameterAssignment_0");
					put(grammarAccess.getParamEventAccess().getActionAssignment_1(), "rule__ParamEvent__ActionAssignment_1");
					put(grammarAccess.getParamEventAccess().getValueAssignment_2(), "rule__ParamEvent__ValueAssignment_2");
					put(grammarAccess.getActorEventAccess().getActorAssignment_0(), "rule__ActorEvent__ActorAssignment_0");
					put(grammarAccess.getActorEventAccess().getActionAssignment_1(), "rule__ActorEvent__ActionAssignment_1");
					put(grammarAccess.getActorEventAccess().getEntityAssignment_2(), "rule__ActorEvent__EntityAssignment_2");
					put(grammarAccess.getStateEventAccess().getSystemAssignment_0(), "rule__StateEvent__SystemAssignment_0");
					put(grammarAccess.getStateEventAccess().getStateAssignment_3(), "rule__StateEvent__StateAssignment_3");
					put(grammarAccess.getParameterStateAccess().getParameterAssignment_0(), "rule__ParameterState__ParameterAssignment_0");
					put(grammarAccess.getParameterStateAccess().getParameter_valueAssignment_2(), "rule__ParameterState__Parameter_valueAssignment_2");
					put(grammarAccess.getMainFunctionAccess().getSystemAssignment_1(), "rule__MainFunction__SystemAssignment_1");
					put(grammarAccess.getMainFunctionAccess().getFunctionAssignment_5(), "rule__MainFunction__FunctionAssignment_5");
					put(grammarAccess.getMainCompositionAccess().getSystemAssignment_1(), "rule__MainComposition__SystemAssignment_1");
					put(grammarAccess.getMainCompositionAccess().getSubsystemListAssignment_7(), "rule__MainComposition__SubsystemListAssignment_7");
					put(grammarAccess.getMainCompositionAccess().getSubsystemListAssignment_8_1(), "rule__MainComposition__SubsystemListAssignment_8_1");
					put(grammarAccess.getMainStateTransitionAccess().getSystemAssignment_1(), "rule__MainStateTransition__SystemAssignment_1");
					put(grammarAccess.getMainStateTransitionAccess().getTransitionAssignment_3(), "rule__MainStateTransition__TransitionAssignment_3");
					put(grammarAccess.getMainStateTransitionAccess().getFunctionAssignment_4_1(), "rule__MainStateTransition__FunctionAssignment_4_1");
					put(grammarAccess.getMainAttributesAccess().getSystemAssignment_1(), "rule__MainAttributes__SystemAssignment_1");
					put(grammarAccess.getMainAttributesAccess().getAttributeListAssignment_6(), "rule__MainAttributes__AttributeListAssignment_6");
					put(grammarAccess.getMainAttributesAccess().getAttributeListAssignment_7_1(), "rule__MainAttributes__AttributeListAssignment_7_1");
					put(grammarAccess.getMainFunctionsAccess().getSystemAssignment_1(), "rule__MainFunctions__SystemAssignment_1");
					put(grammarAccess.getMainFunctionsAccess().getFunctionListAssignment_6(), "rule__MainFunctions__FunctionListAssignment_6");
					put(grammarAccess.getMainFunctionsAccess().getFunctionListAssignment_7_1(), "rule__MainFunctions__FunctionListAssignment_7_1");
					put(grammarAccess.getOperatorAccess().getOperatorAssignment(), "rule__Operator__OperatorAssignment");
					put(grammarAccess.getTransitionAccess().getSource_stateAssignment_1_1(), "rule__Transition__Source_stateAssignment_1_1");
					put(grammarAccess.getTransitionAccess().getTarget_stateAssignment_3(), "rule__Transition__Target_stateAssignment_3");
					put(grammarAccess.getOutTransitionAccess().getSource_stateAssignment_1(), "rule__OutTransition__Source_stateAssignment_1");
					put(grammarAccess.getNoTransitionAccess().getStateAssignment_1(), "rule__NoTransition__StateAssignment_1");
					put(grammarAccess.getSystemAccess().getSystemAssignment_0(), "rule__System__SystemAssignment_0");
					put(grammarAccess.getSystemAccess().getNameAssignment_1(), "rule__System__NameAssignment_1");
					put(grammarAccess.getActorAccess().getActorAssignment_0(), "rule__Actor__ActorAssignment_0");
					put(grammarAccess.getActorAccess().getNameAssignment_1(), "rule__Actor__NameAssignment_1");
					put(grammarAccess.getUserAccess().getUserAssignment_0(), "rule__User__UserAssignment_0");
					put(grammarAccess.getUserAccess().getNameAssignment_1(), "rule__User__NameAssignment_1");
					put(grammarAccess.getActionAccess().getActionAssignment_0(), "rule__Action__ActionAssignment_0");
					put(grammarAccess.getActionAccess().getNameAssignment_1(), "rule__Action__NameAssignment_1");
					put(grammarAccess.getActionAccess().getParameterAssignment_2_0(), "rule__Action__ParameterAssignment_2_0");
					put(grammarAccess.getActionAccess().getValueAssignment_2_1(), "rule__Action__ValueAssignment_2_1");
					put(grammarAccess.getActionAccess().getSubjectAssignment_4(), "rule__Action__SubjectAssignment_4");
					put(grammarAccess.getStateAccess().getStateAssignment_0(), "rule__State__StateAssignment_0");
					put(grammarAccess.getStateAccess().getNameAssignment_1(), "rule__State__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getAttributeAssignment_0(), "rule__Attribute__AttributeAssignment_0");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_3(), "rule__Attribute__TypeAssignment_3");
					put(grammarAccess.getFunctionAccess().getFunctionAssignment_0(), "rule__Function__FunctionAssignment_0");
					put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
					put(grammarAccess.getFunctionAccess().getTypeAssignment_3(), "rule__Function__TypeAssignment_3");
					put(grammarAccess.getParameterAccess().getParameterAssignment_0(), "rule__Parameter__ParameterAssignment_0");
					put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
					put(grammarAccess.getValueAccess().getValAssignment_0(), "rule__Value__ValAssignment_0");
					put(grammarAccess.getValueAccess().getValueAssignment_1(), "rule__Value__ValueAssignment_1");
					put(grammarAccess.getTimeAccess().getValueAssignment_1(), "rule__Time__ValueAssignment_1");
					put(grammarAccess.getTimeAccess().getTimeUnitAssignment_2(), "rule__Time__TimeUnitAssignment_2");
					put(grammarAccess.getTimingConstraintAccess().getTimingConstraintAssignment_0(), "rule__TimingConstraint__TimingConstraintAssignment_0");
					put(grammarAccess.getTimingConstraintAccess().getMinmaxAssignment_1(), "rule__TimingConstraint__MinmaxAssignment_1");
					put(grammarAccess.getTimingConstraintAccess().getTimeAssignment_2(), "rule__TimingConstraint__TimeAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.language.ui.contentassist.antlr.internal.InternalReqLanguageParser typedParser = (org.language.ui.contentassist.antlr.internal.InternalReqLanguageParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ReqLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ReqLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
