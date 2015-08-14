/**
 */
package org.language.reqLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import org.language.reqLanguage.ReqLanguageFactory;
import org.language.reqLanguage.ReqLanguagePackage;
import org.language.reqLanguage.Requirement;
import org.language.reqLanguage.State;
import org.language.reqLanguage.StateEvent;
import org.language.reqLanguage.Time;
import org.language.reqLanguage.TimingConstraint;
import org.language.reqLanguage.Transition;
import org.language.reqLanguage.User;
import org.language.reqLanguage.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReqLanguageFactoryImpl extends EFactoryImpl implements ReqLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ReqLanguageFactory init()
  {
    try
    {
      ReqLanguageFactory theReqLanguageFactory = (ReqLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(ReqLanguagePackage.eNS_URI);
      if (theReqLanguageFactory != null)
      {
        return theReqLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ReqLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReqLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ReqLanguagePackage.MODEL: return createModel();
      case ReqLanguagePackage.REQUIREMENT: return createRequirement();
      case ReqLanguagePackage.REQ_ID: return createReqID();
      case ReqLanguagePackage.PREFIX: return createPrefix();
      case ReqLanguagePackage.PREFIX_RIGHT_OPERAND: return createPrefixRightOperand();
      case ReqLanguagePackage.PREFIX_STATE: return createPrefixState();
      case ReqLanguagePackage.PREFIX_CONDITION: return createPrefixCondition();
      case ReqLanguagePackage.PREFIX_EVENT: return createPrefixEvent();
      case ReqLanguagePackage.PARAM_EVENT: return createParamEvent();
      case ReqLanguagePackage.ACTOR_EVENT: return createActorEvent();
      case ReqLanguagePackage.STATE_EVENT: return createStateEvent();
      case ReqLanguagePackage.PARAMETER_STATE: return createParameterState();
      case ReqLanguagePackage.MAIN_FUNCTION: return createMainFunction();
      case ReqLanguagePackage.MAIN_COMPOSITION: return createMainComposition();
      case ReqLanguagePackage.MAIN_STATE_TRANSITION: return createMainStateTransition();
      case ReqLanguagePackage.MAIN_ATTRIBUTES: return createMainAttributes();
      case ReqLanguagePackage.MAIN_FUNCTIONS: return createMainFunctions();
      case ReqLanguagePackage.OPERATOR: return createOperator();
      case ReqLanguagePackage.TRANSITION: return createTransition();
      case ReqLanguagePackage.OUT_TRANSITION: return createOutTransition();
      case ReqLanguagePackage.NO_TRANSITION: return createNoTransition();
      case ReqLanguagePackage.SYSTEM: return createSystem();
      case ReqLanguagePackage.ACTOR: return createActor();
      case ReqLanguagePackage.USER: return createUser();
      case ReqLanguagePackage.ACTION: return createAction();
      case ReqLanguagePackage.STATE: return createState();
      case ReqLanguagePackage.ATTRIBUTE: return createAttribute();
      case ReqLanguagePackage.FUNCTION: return createFunction();
      case ReqLanguagePackage.PARAMETER: return createParameter();
      case ReqLanguagePackage.VALUE: return createValue();
      case ReqLanguagePackage.TIME: return createTime();
      case ReqLanguagePackage.TIMING_CONSTRAINT: return createTimingConstraint();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requirement createRequirement()
  {
    RequirementImpl requirement = new RequirementImpl();
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReqID createReqID()
  {
    ReqIDImpl reqID = new ReqIDImpl();
    return reqID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Prefix createPrefix()
  {
    PrefixImpl prefix = new PrefixImpl();
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefixRightOperand createPrefixRightOperand()
  {
    PrefixRightOperandImpl prefixRightOperand = new PrefixRightOperandImpl();
    return prefixRightOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefixState createPrefixState()
  {
    PrefixStateImpl prefixState = new PrefixStateImpl();
    return prefixState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefixCondition createPrefixCondition()
  {
    PrefixConditionImpl prefixCondition = new PrefixConditionImpl();
    return prefixCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefixEvent createPrefixEvent()
  {
    PrefixEventImpl prefixEvent = new PrefixEventImpl();
    return prefixEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamEvent createParamEvent()
  {
    ParamEventImpl paramEvent = new ParamEventImpl();
    return paramEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorEvent createActorEvent()
  {
    ActorEventImpl actorEvent = new ActorEventImpl();
    return actorEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateEvent createStateEvent()
  {
    StateEventImpl stateEvent = new StateEventImpl();
    return stateEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterState createParameterState()
  {
    ParameterStateImpl parameterState = new ParameterStateImpl();
    return parameterState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainFunction createMainFunction()
  {
    MainFunctionImpl mainFunction = new MainFunctionImpl();
    return mainFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainComposition createMainComposition()
  {
    MainCompositionImpl mainComposition = new MainCompositionImpl();
    return mainComposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainStateTransition createMainStateTransition()
  {
    MainStateTransitionImpl mainStateTransition = new MainStateTransitionImpl();
    return mainStateTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainAttributes createMainAttributes()
  {
    MainAttributesImpl mainAttributes = new MainAttributesImpl();
    return mainAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainFunctions createMainFunctions()
  {
    MainFunctionsImpl mainFunctions = new MainFunctionsImpl();
    return mainFunctions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator createOperator()
  {
    OperatorImpl operator = new OperatorImpl();
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutTransition createOutTransition()
  {
    OutTransitionImpl outTransition = new OutTransitionImpl();
    return outTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoTransition createNoTransition()
  {
    NoTransitionImpl noTransition = new NoTransitionImpl();
    return noTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.language.reqLanguage.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor createActor()
  {
    ActorImpl actor = new ActorImpl();
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User createUser()
  {
    UserImpl user = new UserImpl();
    return user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Time createTime()
  {
    TimeImpl time = new TimeImpl();
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimingConstraint createTimingConstraint()
  {
    TimingConstraintImpl timingConstraint = new TimingConstraintImpl();
    return timingConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReqLanguagePackage getReqLanguagePackage()
  {
    return (ReqLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ReqLanguagePackage getPackage()
  {
    return ReqLanguagePackage.eINSTANCE;
  }

} //ReqLanguageFactoryImpl
