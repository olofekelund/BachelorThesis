/**
 */
package org.language.reqLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.language.reqLanguage.ReqLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface ReqLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "reqLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.language.org/ReqLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "reqLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ReqLanguagePackage eINSTANCE = org.language.reqLanguage.impl.ReqLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.ModelImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__REQUIREMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.RequirementImpl <em>Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.RequirementImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getRequirement()
   * @generated
   */
  int REQUIREMENT = 1;

  /**
   * The feature id for the '<em><b>Req ID</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__REQ_ID = 0;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__PREFIX = 1;

  /**
   * The feature id for the '<em><b>Main Requirement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__MAIN_REQUIREMENT = 2;

  /**
   * The number of structural features of the '<em>Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.ReqIDImpl <em>Req ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.ReqIDImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getReqID()
   * @generated
   */
  int REQ_ID = 2;

  /**
   * The feature id for the '<em><b>Req ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_ID__REQ_ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_ID__NAME = 1;

  /**
   * The number of structural features of the '<em>Req ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_ID_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.PrefixImpl <em>Prefix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.PrefixImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getPrefix()
   * @generated
   */
  int PREFIX = 3;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX__LEFT_OPERAND = 0;

  /**
   * The feature id for the '<em><b>Prefix List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX__PREFIX_LIST = 1;

  /**
   * The number of structural features of the '<em>Prefix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.PrefixRightOperandImpl <em>Prefix Right Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.PrefixRightOperandImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getPrefixRightOperand()
   * @generated
   */
  int PREFIX_RIGHT_OPERAND = 4;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_RIGHT_OPERAND__OPERATOR = 0;

  /**
   * The feature id for the '<em><b>Prefix Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_RIGHT_OPERAND__PREFIX_RIGHT_OPERAND = 1;

  /**
   * The number of structural features of the '<em>Prefix Right Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_RIGHT_OPERAND_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.PrefixStateImpl <em>Prefix State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.PrefixStateImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getPrefixState()
   * @generated
   */
  int PREFIX_STATE = 5;

  /**
   * The feature id for the '<em><b>Prefix Fixed Syntax</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_STATE__PREFIX_FIXED_SYNTAX = 0;

  /**
   * The feature id for the '<em><b>State Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_STATE__STATE_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Prefix State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_STATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.PrefixConditionImpl <em>Prefix Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.PrefixConditionImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getPrefixCondition()
   * @generated
   */
  int PREFIX_CONDITION = 6;

  /**
   * The feature id for the '<em><b>Prefix Fixed Syntax</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_CONDITION__PREFIX_FIXED_SYNTAX = 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_CONDITION__PARAMETER = 1;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_CONDITION__OPERATOR = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_CONDITION__VALUE = 3;

  /**
   * The feature id for the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_CONDITION__TIME = 4;

  /**
   * The number of structural features of the '<em>Prefix Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_CONDITION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.PrefixEventImpl <em>Prefix Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.PrefixEventImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getPrefixEvent()
   * @generated
   */
  int PREFIX_EVENT = 7;

  /**
   * The feature id for the '<em><b>Prefix Fixed Syntax</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_EVENT__PREFIX_FIXED_SYNTAX = 0;

  /**
   * The feature id for the '<em><b>Event expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_EVENT__EVENT_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Prefix Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_EVENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.ParamEventImpl <em>Param Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.ParamEventImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getParamEvent()
   * @generated
   */
  int PARAM_EVENT = 8;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_EVENT__PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_EVENT__ACTION = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_EVENT__VALUE = 2;

  /**
   * The number of structural features of the '<em>Param Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_EVENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.ActorEventImpl <em>Actor Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.ActorEventImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getActorEvent()
   * @generated
   */
  int ACTOR_EVENT = 9;

  /**
   * The feature id for the '<em><b>Actor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_EVENT__ACTOR = 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_EVENT__ACTION = 1;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_EVENT__ENTITY = 2;

  /**
   * The number of structural features of the '<em>Actor Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_EVENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.StateEventImpl <em>State Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.StateEventImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getStateEvent()
   * @generated
   */
  int STATE_EVENT = 10;

  /**
   * The feature id for the '<em><b>System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_EVENT__SYSTEM = 0;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_EVENT__STATE = 1;

  /**
   * The number of structural features of the '<em>State Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_EVENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.ParameterStateImpl <em>Parameter State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.ParameterStateImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getParameterState()
   * @generated
   */
  int PARAMETER_STATE = 11;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_STATE__PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Parameter value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_STATE__PARAMETER_VALUE = 1;

  /**
   * The number of structural features of the '<em>Parameter State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_STATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.MainFunctionImpl <em>Main Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.MainFunctionImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getMainFunction()
   * @generated
   */
  int MAIN_FUNCTION = 12;

  /**
   * The feature id for the '<em><b>System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FUNCTION__SYSTEM = 0;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FUNCTION__FUNCTION = 1;

  /**
   * The number of structural features of the '<em>Main Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FUNCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.MainCompositionImpl <em>Main Composition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.MainCompositionImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getMainComposition()
   * @generated
   */
  int MAIN_COMPOSITION = 13;

  /**
   * The feature id for the '<em><b>System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_COMPOSITION__SYSTEM = 0;

  /**
   * The feature id for the '<em><b>Subsystem List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_COMPOSITION__SUBSYSTEM_LIST = 1;

  /**
   * The number of structural features of the '<em>Main Composition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_COMPOSITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.MainStateTransitionImpl <em>Main State Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.MainStateTransitionImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getMainStateTransition()
   * @generated
   */
  int MAIN_STATE_TRANSITION = 14;

  /**
   * The feature id for the '<em><b>System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_STATE_TRANSITION__SYSTEM = 0;

  /**
   * The feature id for the '<em><b>Transition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_STATE_TRANSITION__TRANSITION = 1;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_STATE_TRANSITION__FUNCTION = 2;

  /**
   * The number of structural features of the '<em>Main State Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_STATE_TRANSITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.MainAttributesImpl <em>Main Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.MainAttributesImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getMainAttributes()
   * @generated
   */
  int MAIN_ATTRIBUTES = 15;

  /**
   * The feature id for the '<em><b>System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_ATTRIBUTES__SYSTEM = 0;

  /**
   * The feature id for the '<em><b>Attribute List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_ATTRIBUTES__ATTRIBUTE_LIST = 1;

  /**
   * The number of structural features of the '<em>Main Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_ATTRIBUTES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.MainFunctionsImpl <em>Main Functions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.MainFunctionsImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getMainFunctions()
   * @generated
   */
  int MAIN_FUNCTIONS = 16;

  /**
   * The feature id for the '<em><b>System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FUNCTIONS__SYSTEM = 0;

  /**
   * The feature id for the '<em><b>Function List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FUNCTIONS__FUNCTION_LIST = 1;

  /**
   * The number of structural features of the '<em>Main Functions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FUNCTIONS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.OperatorImpl <em>Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.OperatorImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 17;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__OPERATOR = 0;

  /**
   * The number of structural features of the '<em>Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.TransitionImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 18;

  /**
   * The feature id for the '<em><b>Source state</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__SOURCE_STATE = 0;

  /**
   * The feature id for the '<em><b>Target state</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TARGET_STATE = 1;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.OutTransitionImpl <em>Out Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.OutTransitionImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getOutTransition()
   * @generated
   */
  int OUT_TRANSITION = 19;

  /**
   * The feature id for the '<em><b>Source state</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_TRANSITION__SOURCE_STATE = 0;

  /**
   * The number of structural features of the '<em>Out Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_TRANSITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.NoTransitionImpl <em>No Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.NoTransitionImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getNoTransition()
   * @generated
   */
  int NO_TRANSITION = 20;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_TRANSITION__STATE = 0;

  /**
   * The number of structural features of the '<em>No Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_TRANSITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.SystemImpl <em>System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.SystemImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getSystem()
   * @generated
   */
  int SYSTEM = 21;

  /**
   * The feature id for the '<em><b>System</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__SYSTEM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__NAME = 1;

  /**
   * The number of structural features of the '<em>System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.ActorImpl <em>Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.ActorImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getActor()
   * @generated
   */
  int ACTOR = 22;

  /**
   * The feature id for the '<em><b>Actor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__ACTOR = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__NAME = 1;

  /**
   * The number of structural features of the '<em>Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.UserImpl <em>User</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.UserImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getUser()
   * @generated
   */
  int USER = 23;

  /**
   * The feature id for the '<em><b>User</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__USER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__NAME = 1;

  /**
   * The number of structural features of the '<em>User</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.ActionImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getAction()
   * @generated
   */
  int ACTION = 24;

  /**
   * The feature id for the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__ACTION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = 1;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__PARAMETER = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__VALUE = 3;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__SUBJECT = 4;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.StateImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getState()
   * @generated
   */
  int STATE = 25;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__STATE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 1;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.AttributeImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 26;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ATTRIBUTE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.FunctionImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 27;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__FUNCTION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__TYPE = 2;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.ParameterImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 28;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.ValueImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getValue()
   * @generated
   */
  int VALUE = 29;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__VAL = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.TimeImpl <em>Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.TimeImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getTime()
   * @generated
   */
  int TIME = 30;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME__VALUE = 0;

  /**
   * The feature id for the '<em><b>Time Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME__TIME_UNIT = 1;

  /**
   * The number of structural features of the '<em>Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.language.reqLanguage.impl.TimingConstraintImpl <em>Timing Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.language.reqLanguage.impl.TimingConstraintImpl
   * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getTimingConstraint()
   * @generated
   */
  int TIMING_CONSTRAINT = 31;

  /**
   * The feature id for the '<em><b>Timing Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_CONSTRAINT__TIMING_CONSTRAINT = 0;

  /**
   * The feature id for the '<em><b>Minmax</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_CONSTRAINT__MINMAX = 1;

  /**
   * The feature id for the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_CONSTRAINT__TIME = 2;

  /**
   * The number of structural features of the '<em>Timing Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMING_CONSTRAINT_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.language.reqLanguage.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.language.reqLanguage.Model#getRequirements <em>Requirements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requirements</em>'.
   * @see org.language.reqLanguage.Model#getRequirements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Requirements();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement</em>'.
   * @see org.language.reqLanguage.Requirement
   * @generated
   */
  EClass getRequirement();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.Requirement#getReqID <em>Req ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Req ID</em>'.
   * @see org.language.reqLanguage.Requirement#getReqID()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_ReqID();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.Requirement#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prefix</em>'.
   * @see org.language.reqLanguage.Requirement#getPrefix()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Prefix();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.Requirement#getMainRequirement <em>Main Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main Requirement</em>'.
   * @see org.language.reqLanguage.Requirement#getMainRequirement()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_MainRequirement();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.ReqID <em>Req ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Req ID</em>'.
   * @see org.language.reqLanguage.ReqID
   * @generated
   */
  EClass getReqID();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.ReqID#getReqID <em>Req ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Req ID</em>'.
   * @see org.language.reqLanguage.ReqID#getReqID()
   * @see #getReqID()
   * @generated
   */
  EAttribute getReqID_ReqID();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.ReqID#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.language.reqLanguage.ReqID#getName()
   * @see #getReqID()
   * @generated
   */
  EAttribute getReqID_Name();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.Prefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix</em>'.
   * @see org.language.reqLanguage.Prefix
   * @generated
   */
  EClass getPrefix();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.Prefix#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see org.language.reqLanguage.Prefix#getLeftOperand()
   * @see #getPrefix()
   * @generated
   */
  EReference getPrefix_LeftOperand();

  /**
   * Returns the meta object for the containment reference list '{@link org.language.reqLanguage.Prefix#getPrefixList <em>Prefix List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prefix List</em>'.
   * @see org.language.reqLanguage.Prefix#getPrefixList()
   * @see #getPrefix()
   * @generated
   */
  EReference getPrefix_PrefixList();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.PrefixRightOperand <em>Prefix Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix Right Operand</em>'.
   * @see org.language.reqLanguage.PrefixRightOperand
   * @generated
   */
  EClass getPrefixRightOperand();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.PrefixRightOperand#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.language.reqLanguage.PrefixRightOperand#getOperator()
   * @see #getPrefixRightOperand()
   * @generated
   */
  EAttribute getPrefixRightOperand_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.PrefixRightOperand#getPrefixRightOperand <em>Prefix Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prefix Right Operand</em>'.
   * @see org.language.reqLanguage.PrefixRightOperand#getPrefixRightOperand()
   * @see #getPrefixRightOperand()
   * @generated
   */
  EReference getPrefixRightOperand_PrefixRightOperand();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.PrefixState <em>Prefix State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix State</em>'.
   * @see org.language.reqLanguage.PrefixState
   * @generated
   */
  EClass getPrefixState();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.PrefixState#getPrefixFixedSyntax <em>Prefix Fixed Syntax</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prefix Fixed Syntax</em>'.
   * @see org.language.reqLanguage.PrefixState#getPrefixFixedSyntax()
   * @see #getPrefixState()
   * @generated
   */
  EAttribute getPrefixState_PrefixFixedSyntax();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.PrefixState#getStateExpression <em>State Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State Expression</em>'.
   * @see org.language.reqLanguage.PrefixState#getStateExpression()
   * @see #getPrefixState()
   * @generated
   */
  EReference getPrefixState_StateExpression();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.PrefixCondition <em>Prefix Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix Condition</em>'.
   * @see org.language.reqLanguage.PrefixCondition
   * @generated
   */
  EClass getPrefixCondition();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.PrefixCondition#getPrefixFixedSyntax <em>Prefix Fixed Syntax</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prefix Fixed Syntax</em>'.
   * @see org.language.reqLanguage.PrefixCondition#getPrefixFixedSyntax()
   * @see #getPrefixCondition()
   * @generated
   */
  EAttribute getPrefixCondition_PrefixFixedSyntax();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.PrefixCondition#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see org.language.reqLanguage.PrefixCondition#getParameter()
   * @see #getPrefixCondition()
   * @generated
   */
  EReference getPrefixCondition_Parameter();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.PrefixCondition#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operator</em>'.
   * @see org.language.reqLanguage.PrefixCondition#getOperator()
   * @see #getPrefixCondition()
   * @generated
   */
  EReference getPrefixCondition_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.PrefixCondition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.language.reqLanguage.PrefixCondition#getValue()
   * @see #getPrefixCondition()
   * @generated
   */
  EReference getPrefixCondition_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.PrefixCondition#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Time</em>'.
   * @see org.language.reqLanguage.PrefixCondition#getTime()
   * @see #getPrefixCondition()
   * @generated
   */
  EReference getPrefixCondition_Time();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.PrefixEvent <em>Prefix Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix Event</em>'.
   * @see org.language.reqLanguage.PrefixEvent
   * @generated
   */
  EClass getPrefixEvent();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.PrefixEvent#getPrefixFixedSyntax <em>Prefix Fixed Syntax</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prefix Fixed Syntax</em>'.
   * @see org.language.reqLanguage.PrefixEvent#getPrefixFixedSyntax()
   * @see #getPrefixEvent()
   * @generated
   */
  EAttribute getPrefixEvent_PrefixFixedSyntax();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.PrefixEvent#getEvent_expression <em>Event expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event expression</em>'.
   * @see org.language.reqLanguage.PrefixEvent#getEvent_expression()
   * @see #getPrefixEvent()
   * @generated
   */
  EReference getPrefixEvent_Event_expression();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.ParamEvent <em>Param Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Event</em>'.
   * @see org.language.reqLanguage.ParamEvent
   * @generated
   */
  EClass getParamEvent();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.ParamEvent#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see org.language.reqLanguage.ParamEvent#getParameter()
   * @see #getParamEvent()
   * @generated
   */
  EReference getParamEvent_Parameter();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.ParamEvent#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action</em>'.
   * @see org.language.reqLanguage.ParamEvent#getAction()
   * @see #getParamEvent()
   * @generated
   */
  EAttribute getParamEvent_Action();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.ParamEvent#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.language.reqLanguage.ParamEvent#getValue()
   * @see #getParamEvent()
   * @generated
   */
  EReference getParamEvent_Value();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.ActorEvent <em>Actor Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor Event</em>'.
   * @see org.language.reqLanguage.ActorEvent
   * @generated
   */
  EClass getActorEvent();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.ActorEvent#getActor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actor</em>'.
   * @see org.language.reqLanguage.ActorEvent#getActor()
   * @see #getActorEvent()
   * @generated
   */
  EReference getActorEvent_Actor();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.ActorEvent#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action</em>'.
   * @see org.language.reqLanguage.ActorEvent#getAction()
   * @see #getActorEvent()
   * @generated
   */
  EAttribute getActorEvent_Action();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.ActorEvent#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity</em>'.
   * @see org.language.reqLanguage.ActorEvent#getEntity()
   * @see #getActorEvent()
   * @generated
   */
  EReference getActorEvent_Entity();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.StateEvent <em>State Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Event</em>'.
   * @see org.language.reqLanguage.StateEvent
   * @generated
   */
  EClass getStateEvent();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.StateEvent#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>System</em>'.
   * @see org.language.reqLanguage.StateEvent#getSystem()
   * @see #getStateEvent()
   * @generated
   */
  EReference getStateEvent_System();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.StateEvent#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State</em>'.
   * @see org.language.reqLanguage.StateEvent#getState()
   * @see #getStateEvent()
   * @generated
   */
  EReference getStateEvent_State();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.ParameterState <em>Parameter State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter State</em>'.
   * @see org.language.reqLanguage.ParameterState
   * @generated
   */
  EClass getParameterState();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.ParameterState#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see org.language.reqLanguage.ParameterState#getParameter()
   * @see #getParameterState()
   * @generated
   */
  EReference getParameterState_Parameter();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.ParameterState#getParameter_value <em>Parameter value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter value</em>'.
   * @see org.language.reqLanguage.ParameterState#getParameter_value()
   * @see #getParameterState()
   * @generated
   */
  EReference getParameterState_Parameter_value();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.MainFunction <em>Main Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main Function</em>'.
   * @see org.language.reqLanguage.MainFunction
   * @generated
   */
  EClass getMainFunction();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.MainFunction#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>System</em>'.
   * @see org.language.reqLanguage.MainFunction#getSystem()
   * @see #getMainFunction()
   * @generated
   */
  EReference getMainFunction_System();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.MainFunction#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see org.language.reqLanguage.MainFunction#getFunction()
   * @see #getMainFunction()
   * @generated
   */
  EReference getMainFunction_Function();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.MainComposition <em>Main Composition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main Composition</em>'.
   * @see org.language.reqLanguage.MainComposition
   * @generated
   */
  EClass getMainComposition();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.MainComposition#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>System</em>'.
   * @see org.language.reqLanguage.MainComposition#getSystem()
   * @see #getMainComposition()
   * @generated
   */
  EReference getMainComposition_System();

  /**
   * Returns the meta object for the containment reference list '{@link org.language.reqLanguage.MainComposition#getSubsystemList <em>Subsystem List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subsystem List</em>'.
   * @see org.language.reqLanguage.MainComposition#getSubsystemList()
   * @see #getMainComposition()
   * @generated
   */
  EReference getMainComposition_SubsystemList();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.MainStateTransition <em>Main State Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main State Transition</em>'.
   * @see org.language.reqLanguage.MainStateTransition
   * @generated
   */
  EClass getMainStateTransition();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.MainStateTransition#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>System</em>'.
   * @see org.language.reqLanguage.MainStateTransition#getSystem()
   * @see #getMainStateTransition()
   * @generated
   */
  EReference getMainStateTransition_System();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.MainStateTransition#getTransition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Transition</em>'.
   * @see org.language.reqLanguage.MainStateTransition#getTransition()
   * @see #getMainStateTransition()
   * @generated
   */
  EReference getMainStateTransition_Transition();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.MainStateTransition#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see org.language.reqLanguage.MainStateTransition#getFunction()
   * @see #getMainStateTransition()
   * @generated
   */
  EReference getMainStateTransition_Function();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.MainAttributes <em>Main Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main Attributes</em>'.
   * @see org.language.reqLanguage.MainAttributes
   * @generated
   */
  EClass getMainAttributes();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.MainAttributes#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>System</em>'.
   * @see org.language.reqLanguage.MainAttributes#getSystem()
   * @see #getMainAttributes()
   * @generated
   */
  EReference getMainAttributes_System();

  /**
   * Returns the meta object for the containment reference list '{@link org.language.reqLanguage.MainAttributes#getAttributeList <em>Attribute List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute List</em>'.
   * @see org.language.reqLanguage.MainAttributes#getAttributeList()
   * @see #getMainAttributes()
   * @generated
   */
  EReference getMainAttributes_AttributeList();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.MainFunctions <em>Main Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main Functions</em>'.
   * @see org.language.reqLanguage.MainFunctions
   * @generated
   */
  EClass getMainFunctions();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.MainFunctions#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>System</em>'.
   * @see org.language.reqLanguage.MainFunctions#getSystem()
   * @see #getMainFunctions()
   * @generated
   */
  EReference getMainFunctions_System();

  /**
   * Returns the meta object for the containment reference list '{@link org.language.reqLanguage.MainFunctions#getFunctionList <em>Function List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function List</em>'.
   * @see org.language.reqLanguage.MainFunctions#getFunctionList()
   * @see #getMainFunctions()
   * @generated
   */
  EReference getMainFunctions_FunctionList();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator</em>'.
   * @see org.language.reqLanguage.Operator
   * @generated
   */
  EClass getOperator();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.Operator#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.language.reqLanguage.Operator#getOperator()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_Operator();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see org.language.reqLanguage.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.Transition#getSource_state <em>Source state</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source state</em>'.
   * @see org.language.reqLanguage.Transition#getSource_state()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Source_state();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.Transition#getTarget_state <em>Target state</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target state</em>'.
   * @see org.language.reqLanguage.Transition#getTarget_state()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Target_state();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.OutTransition <em>Out Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Out Transition</em>'.
   * @see org.language.reqLanguage.OutTransition
   * @generated
   */
  EClass getOutTransition();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.OutTransition#getSource_state <em>Source state</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source state</em>'.
   * @see org.language.reqLanguage.OutTransition#getSource_state()
   * @see #getOutTransition()
   * @generated
   */
  EReference getOutTransition_Source_state();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.NoTransition <em>No Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Transition</em>'.
   * @see org.language.reqLanguage.NoTransition
   * @generated
   */
  EClass getNoTransition();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.NoTransition#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State</em>'.
   * @see org.language.reqLanguage.NoTransition#getState()
   * @see #getNoTransition()
   * @generated
   */
  EReference getNoTransition_State();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System</em>'.
   * @see org.language.reqLanguage.System
   * @generated
   */
  EClass getSystem();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.System#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>System</em>'.
   * @see org.language.reqLanguage.System#getSystem()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_System();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.System#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.language.reqLanguage.System#getName()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_Name();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor</em>'.
   * @see org.language.reqLanguage.Actor
   * @generated
   */
  EClass getActor();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.Actor#getActor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Actor</em>'.
   * @see org.language.reqLanguage.Actor#getActor()
   * @see #getActor()
   * @generated
   */
  EAttribute getActor_Actor();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.Actor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.language.reqLanguage.Actor#getName()
   * @see #getActor()
   * @generated
   */
  EAttribute getActor_Name();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.User <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User</em>'.
   * @see org.language.reqLanguage.User
   * @generated
   */
  EClass getUser();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.User#getUser <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>User</em>'.
   * @see org.language.reqLanguage.User#getUser()
   * @see #getUser()
   * @generated
   */
  EAttribute getUser_User();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.User#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.language.reqLanguage.User#getName()
   * @see #getUser()
   * @generated
   */
  EAttribute getUser_Name();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see org.language.reqLanguage.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.Action#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action</em>'.
   * @see org.language.reqLanguage.Action#getAction()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Action();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.Action#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.language.reqLanguage.Action#getName()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.Action#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see org.language.reqLanguage.Action#getParameter()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Parameter();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.Action#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.language.reqLanguage.Action#getValue()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.Action#getSubject <em>Subject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subject</em>'.
   * @see org.language.reqLanguage.Action#getSubject()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Subject();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see org.language.reqLanguage.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.State#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State</em>'.
   * @see org.language.reqLanguage.State#getState()
   * @see #getState()
   * @generated
   */
  EAttribute getState_State();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.language.reqLanguage.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.language.reqLanguage.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.Attribute#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see org.language.reqLanguage.Attribute#getAttribute()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Attribute();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.language.reqLanguage.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.language.reqLanguage.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Type();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.language.reqLanguage.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.Function#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see org.language.reqLanguage.Function#getFunction()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Function();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.language.reqLanguage.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.Function#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.language.reqLanguage.Function#getType()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Type();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.language.reqLanguage.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.Parameter#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter</em>'.
   * @see org.language.reqLanguage.Parameter#getParameter()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Parameter();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.language.reqLanguage.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see org.language.reqLanguage.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.Value#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see org.language.reqLanguage.Value#getVal()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_Val();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.Value#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.language.reqLanguage.Value#getValue()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_Value();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.Time <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time</em>'.
   * @see org.language.reqLanguage.Time
   * @generated
   */
  EClass getTime();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.Time#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.language.reqLanguage.Time#getValue()
   * @see #getTime()
   * @generated
   */
  EAttribute getTime_Value();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.Time#getTimeUnit <em>Time Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time Unit</em>'.
   * @see org.language.reqLanguage.Time#getTimeUnit()
   * @see #getTime()
   * @generated
   */
  EAttribute getTime_TimeUnit();

  /**
   * Returns the meta object for class '{@link org.language.reqLanguage.TimingConstraint <em>Timing Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timing Constraint</em>'.
   * @see org.language.reqLanguage.TimingConstraint
   * @generated
   */
  EClass getTimingConstraint();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.TimingConstraint#getTimingConstraint <em>Timing Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timing Constraint</em>'.
   * @see org.language.reqLanguage.TimingConstraint#getTimingConstraint()
   * @see #getTimingConstraint()
   * @generated
   */
  EAttribute getTimingConstraint_TimingConstraint();

  /**
   * Returns the meta object for the attribute '{@link org.language.reqLanguage.TimingConstraint#getMinmax <em>Minmax</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minmax</em>'.
   * @see org.language.reqLanguage.TimingConstraint#getMinmax()
   * @see #getTimingConstraint()
   * @generated
   */
  EAttribute getTimingConstraint_Minmax();

  /**
   * Returns the meta object for the containment reference '{@link org.language.reqLanguage.TimingConstraint#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Time</em>'.
   * @see org.language.reqLanguage.TimingConstraint#getTime()
   * @see #getTimingConstraint()
   * @generated
   */
  EReference getTimingConstraint_Time();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ReqLanguageFactory getReqLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.ModelImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__REQUIREMENTS = eINSTANCE.getModel_Requirements();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.RequirementImpl <em>Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.RequirementImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getRequirement()
     * @generated
     */
    EClass REQUIREMENT = eINSTANCE.getRequirement();

    /**
     * The meta object literal for the '<em><b>Req ID</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__REQ_ID = eINSTANCE.getRequirement_ReqID();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__PREFIX = eINSTANCE.getRequirement_Prefix();

    /**
     * The meta object literal for the '<em><b>Main Requirement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__MAIN_REQUIREMENT = eINSTANCE.getRequirement_MainRequirement();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.ReqIDImpl <em>Req ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.ReqIDImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getReqID()
     * @generated
     */
    EClass REQ_ID = eINSTANCE.getReqID();

    /**
     * The meta object literal for the '<em><b>Req ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQ_ID__REQ_ID = eINSTANCE.getReqID_ReqID();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQ_ID__NAME = eINSTANCE.getReqID_Name();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.PrefixImpl <em>Prefix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.PrefixImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getPrefix()
     * @generated
     */
    EClass PREFIX = eINSTANCE.getPrefix();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFIX__LEFT_OPERAND = eINSTANCE.getPrefix_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Prefix List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFIX__PREFIX_LIST = eINSTANCE.getPrefix_PrefixList();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.PrefixRightOperandImpl <em>Prefix Right Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.PrefixRightOperandImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getPrefixRightOperand()
     * @generated
     */
    EClass PREFIX_RIGHT_OPERAND = eINSTANCE.getPrefixRightOperand();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFIX_RIGHT_OPERAND__OPERATOR = eINSTANCE.getPrefixRightOperand_Operator();

    /**
     * The meta object literal for the '<em><b>Prefix Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFIX_RIGHT_OPERAND__PREFIX_RIGHT_OPERAND = eINSTANCE.getPrefixRightOperand_PrefixRightOperand();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.PrefixStateImpl <em>Prefix State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.PrefixStateImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getPrefixState()
     * @generated
     */
    EClass PREFIX_STATE = eINSTANCE.getPrefixState();

    /**
     * The meta object literal for the '<em><b>Prefix Fixed Syntax</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFIX_STATE__PREFIX_FIXED_SYNTAX = eINSTANCE.getPrefixState_PrefixFixedSyntax();

    /**
     * The meta object literal for the '<em><b>State Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFIX_STATE__STATE_EXPRESSION = eINSTANCE.getPrefixState_StateExpression();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.PrefixConditionImpl <em>Prefix Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.PrefixConditionImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getPrefixCondition()
     * @generated
     */
    EClass PREFIX_CONDITION = eINSTANCE.getPrefixCondition();

    /**
     * The meta object literal for the '<em><b>Prefix Fixed Syntax</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFIX_CONDITION__PREFIX_FIXED_SYNTAX = eINSTANCE.getPrefixCondition_PrefixFixedSyntax();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFIX_CONDITION__PARAMETER = eINSTANCE.getPrefixCondition_Parameter();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFIX_CONDITION__OPERATOR = eINSTANCE.getPrefixCondition_Operator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFIX_CONDITION__VALUE = eINSTANCE.getPrefixCondition_Value();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFIX_CONDITION__TIME = eINSTANCE.getPrefixCondition_Time();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.PrefixEventImpl <em>Prefix Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.PrefixEventImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getPrefixEvent()
     * @generated
     */
    EClass PREFIX_EVENT = eINSTANCE.getPrefixEvent();

    /**
     * The meta object literal for the '<em><b>Prefix Fixed Syntax</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFIX_EVENT__PREFIX_FIXED_SYNTAX = eINSTANCE.getPrefixEvent_PrefixFixedSyntax();

    /**
     * The meta object literal for the '<em><b>Event expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFIX_EVENT__EVENT_EXPRESSION = eINSTANCE.getPrefixEvent_Event_expression();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.ParamEventImpl <em>Param Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.ParamEventImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getParamEvent()
     * @generated
     */
    EClass PARAM_EVENT = eINSTANCE.getParamEvent();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM_EVENT__PARAMETER = eINSTANCE.getParamEvent_Parameter();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM_EVENT__ACTION = eINSTANCE.getParamEvent_Action();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM_EVENT__VALUE = eINSTANCE.getParamEvent_Value();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.ActorEventImpl <em>Actor Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.ActorEventImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getActorEvent()
     * @generated
     */
    EClass ACTOR_EVENT = eINSTANCE.getActorEvent();

    /**
     * The meta object literal for the '<em><b>Actor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR_EVENT__ACTOR = eINSTANCE.getActorEvent_Actor();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR_EVENT__ACTION = eINSTANCE.getActorEvent_Action();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR_EVENT__ENTITY = eINSTANCE.getActorEvent_Entity();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.StateEventImpl <em>State Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.StateEventImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getStateEvent()
     * @generated
     */
    EClass STATE_EVENT = eINSTANCE.getStateEvent();

    /**
     * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_EVENT__SYSTEM = eINSTANCE.getStateEvent_System();

    /**
     * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_EVENT__STATE = eINSTANCE.getStateEvent_State();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.ParameterStateImpl <em>Parameter State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.ParameterStateImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getParameterState()
     * @generated
     */
    EClass PARAMETER_STATE = eINSTANCE.getParameterState();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_STATE__PARAMETER = eINSTANCE.getParameterState_Parameter();

    /**
     * The meta object literal for the '<em><b>Parameter value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_STATE__PARAMETER_VALUE = eINSTANCE.getParameterState_Parameter_value();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.MainFunctionImpl <em>Main Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.MainFunctionImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getMainFunction()
     * @generated
     */
    EClass MAIN_FUNCTION = eINSTANCE.getMainFunction();

    /**
     * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_FUNCTION__SYSTEM = eINSTANCE.getMainFunction_System();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_FUNCTION__FUNCTION = eINSTANCE.getMainFunction_Function();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.MainCompositionImpl <em>Main Composition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.MainCompositionImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getMainComposition()
     * @generated
     */
    EClass MAIN_COMPOSITION = eINSTANCE.getMainComposition();

    /**
     * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_COMPOSITION__SYSTEM = eINSTANCE.getMainComposition_System();

    /**
     * The meta object literal for the '<em><b>Subsystem List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_COMPOSITION__SUBSYSTEM_LIST = eINSTANCE.getMainComposition_SubsystemList();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.MainStateTransitionImpl <em>Main State Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.MainStateTransitionImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getMainStateTransition()
     * @generated
     */
    EClass MAIN_STATE_TRANSITION = eINSTANCE.getMainStateTransition();

    /**
     * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_STATE_TRANSITION__SYSTEM = eINSTANCE.getMainStateTransition_System();

    /**
     * The meta object literal for the '<em><b>Transition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_STATE_TRANSITION__TRANSITION = eINSTANCE.getMainStateTransition_Transition();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_STATE_TRANSITION__FUNCTION = eINSTANCE.getMainStateTransition_Function();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.MainAttributesImpl <em>Main Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.MainAttributesImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getMainAttributes()
     * @generated
     */
    EClass MAIN_ATTRIBUTES = eINSTANCE.getMainAttributes();

    /**
     * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_ATTRIBUTES__SYSTEM = eINSTANCE.getMainAttributes_System();

    /**
     * The meta object literal for the '<em><b>Attribute List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_ATTRIBUTES__ATTRIBUTE_LIST = eINSTANCE.getMainAttributes_AttributeList();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.MainFunctionsImpl <em>Main Functions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.MainFunctionsImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getMainFunctions()
     * @generated
     */
    EClass MAIN_FUNCTIONS = eINSTANCE.getMainFunctions();

    /**
     * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_FUNCTIONS__SYSTEM = eINSTANCE.getMainFunctions_System();

    /**
     * The meta object literal for the '<em><b>Function List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_FUNCTIONS__FUNCTION_LIST = eINSTANCE.getMainFunctions_FunctionList();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.OperatorImpl <em>Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.OperatorImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getOperator()
     * @generated
     */
    EClass OPERATOR = eINSTANCE.getOperator();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__OPERATOR = eINSTANCE.getOperator_Operator();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.TransitionImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Source state</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__SOURCE_STATE = eINSTANCE.getTransition_Source_state();

    /**
     * The meta object literal for the '<em><b>Target state</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__TARGET_STATE = eINSTANCE.getTransition_Target_state();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.OutTransitionImpl <em>Out Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.OutTransitionImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getOutTransition()
     * @generated
     */
    EClass OUT_TRANSITION = eINSTANCE.getOutTransition();

    /**
     * The meta object literal for the '<em><b>Source state</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUT_TRANSITION__SOURCE_STATE = eINSTANCE.getOutTransition_Source_state();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.NoTransitionImpl <em>No Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.NoTransitionImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getNoTransition()
     * @generated
     */
    EClass NO_TRANSITION = eINSTANCE.getNoTransition();

    /**
     * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NO_TRANSITION__STATE = eINSTANCE.getNoTransition_State();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.SystemImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getSystem()
     * @generated
     */
    EClass SYSTEM = eINSTANCE.getSystem();

    /**
     * The meta object literal for the '<em><b>System</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__SYSTEM = eINSTANCE.getSystem_System();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.ActorImpl <em>Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.ActorImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getActor()
     * @generated
     */
    EClass ACTOR = eINSTANCE.getActor();

    /**
     * The meta object literal for the '<em><b>Actor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__ACTOR = eINSTANCE.getActor_Actor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.UserImpl <em>User</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.UserImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getUser()
     * @generated
     */
    EClass USER = eINSTANCE.getUser();

    /**
     * The meta object literal for the '<em><b>User</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER__USER = eINSTANCE.getUser_User();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER__NAME = eINSTANCE.getUser_Name();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.ActionImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__ACTION = eINSTANCE.getAction_Action();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__PARAMETER = eINSTANCE.getAction_Parameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__VALUE = eINSTANCE.getAction_Value();

    /**
     * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__SUBJECT = eINSTANCE.getAction_Subject();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.StateImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__STATE = eINSTANCE.getState_State();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.AttributeImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__ATTRIBUTE = eINSTANCE.getAttribute_Attribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.FunctionImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__FUNCTION = eINSTANCE.getFunction_Function();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__TYPE = eINSTANCE.getFunction_Type();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.ParameterImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__PARAMETER = eINSTANCE.getParameter_Parameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.ValueImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE__VAL = eINSTANCE.getValue_Val();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE__VALUE = eINSTANCE.getValue_Value();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.TimeImpl <em>Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.TimeImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getTime()
     * @generated
     */
    EClass TIME = eINSTANCE.getTime();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME__VALUE = eINSTANCE.getTime_Value();

    /**
     * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME__TIME_UNIT = eINSTANCE.getTime_TimeUnit();

    /**
     * The meta object literal for the '{@link org.language.reqLanguage.impl.TimingConstraintImpl <em>Timing Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.language.reqLanguage.impl.TimingConstraintImpl
     * @see org.language.reqLanguage.impl.ReqLanguagePackageImpl#getTimingConstraint()
     * @generated
     */
    EClass TIMING_CONSTRAINT = eINSTANCE.getTimingConstraint();

    /**
     * The meta object literal for the '<em><b>Timing Constraint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIMING_CONSTRAINT__TIMING_CONSTRAINT = eINSTANCE.getTimingConstraint_TimingConstraint();

    /**
     * The meta object literal for the '<em><b>Minmax</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIMING_CONSTRAINT__MINMAX = eINSTANCE.getTimingConstraint_Minmax();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TIMING_CONSTRAINT__TIME = eINSTANCE.getTimingConstraint_Time();

  }

} //ReqLanguagePackage
