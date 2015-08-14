package org.language.serializer;

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
import org.language.reqLanguage.Action;
import org.language.reqLanguage.Actor;
import org.language.reqLanguage.ActorEvent;
import org.language.reqLanguage.Attribute;
import org.language.reqLanguage.Function;
import org.language.reqLanguage.MainAttributes;
import org.language.reqLanguage.MainComposition;
import org.language.reqLanguage.MainFunction;
import org.language.reqLanguage.MainFunctions;
import org.language.reqLanguage.MainStateTransition;
import org.language.reqLanguage.Model;
import org.language.reqLanguage.NoTransition;
import org.language.reqLanguage.Operator;
import org.language.reqLanguage.OutTransition;
import org.language.reqLanguage.ParamEvent;
import org.language.reqLanguage.Parameter;
import org.language.reqLanguage.ParameterState;
import org.language.reqLanguage.Prefix;
import org.language.reqLanguage.PrefixCondition;
import org.language.reqLanguage.PrefixEvent;
import org.language.reqLanguage.PrefixRightOperand;
import org.language.reqLanguage.PrefixState;
import org.language.reqLanguage.ReqID;
import org.language.reqLanguage.ReqLanguagePackage;
import org.language.reqLanguage.Requirement;
import org.language.reqLanguage.State;
import org.language.reqLanguage.StateEvent;
import org.language.reqLanguage.Time;
import org.language.reqLanguage.TimingConstraint;
import org.language.reqLanguage.Transition;
import org.language.reqLanguage.User;
import org.language.reqLanguage.Value;
import org.language.services.ReqLanguageGrammarAccess;

@SuppressWarnings("all")
public class ReqLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ReqLanguageGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ReqLanguagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ReqLanguagePackage.ACTION:
				if(context == grammarAccess.getActionRule()) {
					sequence_Action(context, (Action) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.ACTOR:
				if(context == grammarAccess.getActorRule()) {
					sequence_Actor(context, (Actor) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.ACTOR_EVENT:
				if(context == grammarAccess.getActorEventRule()) {
					sequence_ActorEvent(context, (ActorEvent) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.FUNCTION:
				if(context == grammarAccess.getFunctionRule()) {
					sequence_Function(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.MAIN_ATTRIBUTES:
				if(context == grammarAccess.getMainAttributesRule()) {
					sequence_MainAttributes(context, (MainAttributes) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.MAIN_COMPOSITION:
				if(context == grammarAccess.getMainCompositionRule()) {
					sequence_MainComposition(context, (MainComposition) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.MAIN_FUNCTION:
				if(context == grammarAccess.getMainFunctionRule()) {
					sequence_MainFunction(context, (MainFunction) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.MAIN_FUNCTIONS:
				if(context == grammarAccess.getMainFunctionsRule()) {
					sequence_MainFunctions(context, (MainFunctions) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.MAIN_STATE_TRANSITION:
				if(context == grammarAccess.getMainStateTransitionRule()) {
					sequence_MainStateTransition(context, (MainStateTransition) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.NO_TRANSITION:
				if(context == grammarAccess.getNoTransitionRule()) {
					sequence_NoTransition(context, (NoTransition) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.OPERATOR:
				if(context == grammarAccess.getOperatorRule()) {
					sequence_Operator(context, (Operator) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.OUT_TRANSITION:
				if(context == grammarAccess.getOutTransitionRule()) {
					sequence_OutTransition(context, (OutTransition) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.PARAM_EVENT:
				if(context == grammarAccess.getParamEventRule()) {
					sequence_ParamEvent(context, (ParamEvent) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.PARAMETER_STATE:
				if(context == grammarAccess.getParameterStateRule()) {
					sequence_ParameterState(context, (ParameterState) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.PREFIX:
				if(context == grammarAccess.getPrefixRule()) {
					sequence_Prefix(context, (Prefix) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.PREFIX_CONDITION:
				if(context == grammarAccess.getPrefixConditionRule()) {
					sequence_PrefixCondition(context, (PrefixCondition) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.PREFIX_EVENT:
				if(context == grammarAccess.getPrefixEventRule()) {
					sequence_PrefixEvent(context, (PrefixEvent) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.PREFIX_RIGHT_OPERAND:
				if(context == grammarAccess.getPrefixRightOperandRule()) {
					sequence_PrefixRightOperand(context, (PrefixRightOperand) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.PREFIX_STATE:
				if(context == grammarAccess.getPrefixStateRule()) {
					sequence_PrefixState(context, (PrefixState) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.REQ_ID:
				if(context == grammarAccess.getReqIDRule()) {
					sequence_ReqID(context, (ReqID) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.REQUIREMENT:
				if(context == grammarAccess.getRequirementRule()) {
					sequence_Requirement(context, (Requirement) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.STATE:
				if(context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.STATE_EVENT:
				if(context == grammarAccess.getStateEventRule()) {
					sequence_StateEvent(context, (StateEvent) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.SYSTEM:
				if(context == grammarAccess.getSystemRule()) {
					sequence_System(context, (org.language.reqLanguage.System) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.TIME:
				if(context == grammarAccess.getTimeRule()) {
					sequence_Time(context, (Time) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.TIMING_CONSTRAINT:
				if(context == grammarAccess.getTimingConstraintRule()) {
					sequence_TimingConstraint(context, (TimingConstraint) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.TRANSITION:
				if(context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.USER:
				if(context == grammarAccess.getUserRule()) {
					sequence_User(context, (User) semanticObject); 
					return; 
				}
				else break;
			case ReqLanguagePackage.VALUE:
				if(context == grammarAccess.getValueRule()) {
					sequence_Value(context, (Value) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (action='action:' name=ID (parameter=Parameter value=Value?)? (subject=System | subject=Actor | subject=Parameter))
	 */
	protected void sequence_Action(EObject context, Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((actor=System | actor=User) (action='activates' | action='deactivates') entity=Parameter)
	 */
	protected void sequence_ActorEvent(EObject context, ActorEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (actor='actor:' name=ID)
	 */
	protected void sequence_Actor(EObject context, Actor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ReqLanguagePackage.Literals.ACTOR__ACTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqLanguagePackage.Literals.ACTOR__ACTOR));
			if(transientValues.isValueTransient(semanticObject, ReqLanguagePackage.Literals.ACTOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqLanguagePackage.Literals.ACTOR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActorAccess().getActorActorKeyword_0_0(), semanticObject.getActor());
		feeder.accept(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (attribute='attribute:' name=ID type=ID)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ReqLanguagePackage.Literals.ATTRIBUTE__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqLanguagePackage.Literals.ATTRIBUTE__ATTRIBUTE));
			if(transientValues.isValueTransient(semanticObject, ReqLanguagePackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqLanguagePackage.Literals.ATTRIBUTE__NAME));
			if(transientValues.isValueTransient(semanticObject, ReqLanguagePackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqLanguagePackage.Literals.ATTRIBUTE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeAccess().getAttributeAttributeKeyword_0_0(), semanticObject.getAttribute());
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (function='function:' name=ID type=ID)
	 */
	protected void sequence_Function(EObject context, Function semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ReqLanguagePackage.Literals.FUNCTION__FUNCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqLanguagePackage.Literals.FUNCTION__FUNCTION));
			if(transientValues.isValueTransient(semanticObject, ReqLanguagePackage.Literals.FUNCTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqLanguagePackage.Literals.FUNCTION__NAME));
			if(transientValues.isValueTransient(semanticObject, ReqLanguagePackage.Literals.FUNCTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqLanguagePackage.Literals.FUNCTION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionAccess().getFunctionFunctionKeyword_0_0(), semanticObject.getFunction());
		feeder.accept(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFunctionAccess().getTypeIDTerminalRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (system=System attributeList+=Attribute attributeList+=Attribute*)
	 */
	protected void sequence_MainAttributes(EObject context, MainAttributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (system=System subsystemList+=System subsystemList+=System*)
	 */
	protected void sequence_MainComposition(EObject context, MainComposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((system=System | system=Actor) function=Action)
	 */
	protected void sequence_MainFunction(EObject context, MainFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (system=System functionList+=Function functionList+=Function*)
	 */
	protected void sequence_MainFunctions(EObject context, MainFunctions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (system=System (transition=Transition | transition=OutTransition | transition=NoTransition) function=Action?)
	 */
	protected void sequence_MainStateTransition(EObject context, MainStateTransition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     requirements+=Requirement*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (state=State | state=ParameterState)
	 */
	protected void sequence_NoTransition(EObject context, NoTransition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         operator='less_than' | 
	 *         operator='equal_to' | 
	 *         operator='greater_than' | 
	 *         operator='not_equal_to' | 
	 *         operator='greater_than_or_equal_to' | 
	 *         operator='less_than_or_equal_to'
	 *     )
	 */
	protected void sequence_Operator(EObject context, Operator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (source_state=State | source_state=ParameterState)
	 */
	protected void sequence_OutTransition(EObject context, OutTransition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((parameter=Time | parameter=Parameter) (action='increases above' | action='decreases below' | action='reaches') value=Value)
	 */
	protected void sequence_ParamEvent(EObject context, ParamEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=Parameter (parameter_value=Value | parameter_value=State)?)
	 */
	protected void sequence_ParameterState(EObject context, ParameterState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameter='parameter:' name=ID)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ReqLanguagePackage.Literals.PARAMETER__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqLanguagePackage.Literals.PARAMETER__PARAMETER));
			if(transientValues.isValueTransient(semanticObject, ReqLanguagePackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqLanguagePackage.Literals.PARAMETER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getParameterParameterKeyword_0_0(), semanticObject.getParameter());
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (prefixFixedSyntax=PrefixFixedSyntax (parameter=Time | parameter=Parameter) operator=Operator? (value=Value | time=TimingConstraint)?)
	 */
	protected void sequence_PrefixCondition(EObject context, PrefixCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prefixFixedSyntax=PrefixFixedSyntax (event_expression=ParamEvent | event_expression=ActorEvent | event_expression=StateEvent))
	 */
	protected void sequence_PrefixEvent(EObject context, PrefixEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((operator='and' | operator='or') (prefixRightOperand=PrefixCondition | prefixRightOperand=PrefixState | prefixRightOperand=PrefixEvent))
	 */
	protected void sequence_PrefixRightOperand(EObject context, PrefixRightOperand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prefixFixedSyntax=PrefixFixedSyntax (stateExpression=State | stateExpression=ParameterState))
	 */
	protected void sequence_PrefixState(EObject context, PrefixState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((leftOperand=PrefixCondition | leftOperand=PrefixState | leftOperand=PrefixEvent) prefixList+=PrefixRightOperand*)
	 */
	protected void sequence_Prefix(EObject context, Prefix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (reqID='ID:' name=STRING)
	 */
	protected void sequence_ReqID(EObject context, ReqID semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ReqLanguagePackage.Literals.REQ_ID__REQ_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqLanguagePackage.Literals.REQ_ID__REQ_ID));
			if(transientValues.isValueTransient(semanticObject, ReqLanguagePackage.Literals.REQ_ID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqLanguagePackage.Literals.REQ_ID__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReqIDAccess().getReqIDIDKeyword_0_0(), semanticObject.getReqID());
		feeder.accept(grammarAccess.getReqIDAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         reqID=ReqID 
	 *         prefix=Prefix? 
	 *         (
	 *             mainRequirement=MainFunction | 
	 *             mainRequirement=MainComposition | 
	 *             mainRequirement=MainStateTransition | 
	 *             mainRequirement=MainAttributes | 
	 *             mainRequirement=MainFunctions
	 *         )
	 *     )
	 */
	protected void sequence_Requirement(EObject context, Requirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (system=System state=State)
	 */
	protected void sequence_StateEvent(EObject context, StateEvent semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ReqLanguagePackage.Literals.STATE_EVENT__SYSTEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqLanguagePackage.Literals.STATE_EVENT__SYSTEM));
			if(transientValues.isValueTransient(semanticObject, ReqLanguagePackage.Literals.STATE_EVENT__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqLanguagePackage.Literals.STATE_EVENT__STATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStateEventAccess().getSystemSystemParserRuleCall_0_0(), semanticObject.getSystem());
		feeder.accept(grammarAccess.getStateEventAccess().getStateStateParserRuleCall_3_0(), semanticObject.getState());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (state='state:' name=ID)
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ReqLanguagePackage.Literals.STATE__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqLanguagePackage.Literals.STATE__STATE));
			if(transientValues.isValueTransient(semanticObject, ReqLanguagePackage.Literals.STATE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqLanguagePackage.Literals.STATE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStateAccess().getStateStateKeyword_0_0(), semanticObject.getState());
		feeder.accept(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (system='system:' name=ID)
	 */
	protected void sequence_System(EObject context, org.language.reqLanguage.System semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ReqLanguagePackage.Literals.SYSTEM__SYSTEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqLanguagePackage.Literals.SYSTEM__SYSTEM));
			if(transientValues.isValueTransient(semanticObject, ReqLanguagePackage.Literals.SYSTEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqLanguagePackage.Literals.SYSTEM__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSystemAccess().getSystemSystemKeyword_0_0(), semanticObject.getSystem());
		feeder.accept(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT (timeUnit='s' | timeUnit='m' | timeUnit='h')?)
	 */
	protected void sequence_Time(EObject context, Time semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((timingConstraint='within' | timingConstraint='every' | timingConstraint='for') (minmax='less than' | minmax='at least')? time=Time)
	 */
	protected void sequence_TimingConstraint(EObject context, TimingConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((source_state=State | source_state=ParameterState)? (target_state=State | target_state=ParameterState))
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (user='user:' name=ID)
	 */
	protected void sequence_User(EObject context, User semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ReqLanguagePackage.Literals.USER__USER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqLanguagePackage.Literals.USER__USER));
			if(transientValues.isValueTransient(semanticObject, ReqLanguagePackage.Literals.USER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqLanguagePackage.Literals.USER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUserAccess().getUserUserKeyword_0_0(), semanticObject.getUser());
		feeder.accept(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (val='value:' value=INT)
	 */
	protected void sequence_Value(EObject context, Value semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ReqLanguagePackage.Literals.VALUE__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqLanguagePackage.Literals.VALUE__VAL));
			if(transientValues.isValueTransient(semanticObject, ReqLanguagePackage.Literals.VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReqLanguagePackage.Literals.VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValueAccess().getValValueKeyword_0_0(), semanticObject.getVal());
		feeder.accept(grammarAccess.getValueAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
}
