/**
 */
package org.language.reqLanguage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.language.reqLanguage.ReqLanguagePackage
 * @generated
 */
public class ReqLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ReqLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReqLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ReqLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReqLanguageSwitch<Adapter> modelSwitch =
    new ReqLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseRequirement(Requirement object)
      {
        return createRequirementAdapter();
      }
      @Override
      public Adapter caseReqID(ReqID object)
      {
        return createReqIDAdapter();
      }
      @Override
      public Adapter casePrefix(Prefix object)
      {
        return createPrefixAdapter();
      }
      @Override
      public Adapter casePrefixRightOperand(PrefixRightOperand object)
      {
        return createPrefixRightOperandAdapter();
      }
      @Override
      public Adapter casePrefixState(PrefixState object)
      {
        return createPrefixStateAdapter();
      }
      @Override
      public Adapter casePrefixCondition(PrefixCondition object)
      {
        return createPrefixConditionAdapter();
      }
      @Override
      public Adapter casePrefixEvent(PrefixEvent object)
      {
        return createPrefixEventAdapter();
      }
      @Override
      public Adapter caseParamEvent(ParamEvent object)
      {
        return createParamEventAdapter();
      }
      @Override
      public Adapter caseActorEvent(ActorEvent object)
      {
        return createActorEventAdapter();
      }
      @Override
      public Adapter caseStateEvent(StateEvent object)
      {
        return createStateEventAdapter();
      }
      @Override
      public Adapter caseParameterState(ParameterState object)
      {
        return createParameterStateAdapter();
      }
      @Override
      public Adapter caseMainFunction(MainFunction object)
      {
        return createMainFunctionAdapter();
      }
      @Override
      public Adapter caseMainComposition(MainComposition object)
      {
        return createMainCompositionAdapter();
      }
      @Override
      public Adapter caseMainStateTransition(MainStateTransition object)
      {
        return createMainStateTransitionAdapter();
      }
      @Override
      public Adapter caseMainAttributes(MainAttributes object)
      {
        return createMainAttributesAdapter();
      }
      @Override
      public Adapter caseMainFunctions(MainFunctions object)
      {
        return createMainFunctionsAdapter();
      }
      @Override
      public Adapter caseOperator(Operator object)
      {
        return createOperatorAdapter();
      }
      @Override
      public Adapter caseTransition(Transition object)
      {
        return createTransitionAdapter();
      }
      @Override
      public Adapter caseOutTransition(OutTransition object)
      {
        return createOutTransitionAdapter();
      }
      @Override
      public Adapter caseNoTransition(NoTransition object)
      {
        return createNoTransitionAdapter();
      }
      @Override
      public Adapter caseSystem(org.language.reqLanguage.System object)
      {
        return createSystemAdapter();
      }
      @Override
      public Adapter caseActor(Actor object)
      {
        return createActorAdapter();
      }
      @Override
      public Adapter caseUser(User object)
      {
        return createUserAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseTime(Time object)
      {
        return createTimeAdapter();
      }
      @Override
      public Adapter caseTimingConstraint(TimingConstraint object)
      {
        return createTimingConstraintAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.Requirement
   * @generated
   */
  public Adapter createRequirementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.ReqID <em>Req ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.ReqID
   * @generated
   */
  public Adapter createReqIDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.Prefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.Prefix
   * @generated
   */
  public Adapter createPrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.PrefixRightOperand <em>Prefix Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.PrefixRightOperand
   * @generated
   */
  public Adapter createPrefixRightOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.PrefixState <em>Prefix State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.PrefixState
   * @generated
   */
  public Adapter createPrefixStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.PrefixCondition <em>Prefix Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.PrefixCondition
   * @generated
   */
  public Adapter createPrefixConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.PrefixEvent <em>Prefix Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.PrefixEvent
   * @generated
   */
  public Adapter createPrefixEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.ParamEvent <em>Param Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.ParamEvent
   * @generated
   */
  public Adapter createParamEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.ActorEvent <em>Actor Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.ActorEvent
   * @generated
   */
  public Adapter createActorEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.StateEvent <em>State Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.StateEvent
   * @generated
   */
  public Adapter createStateEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.ParameterState <em>Parameter State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.ParameterState
   * @generated
   */
  public Adapter createParameterStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.MainFunction <em>Main Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.MainFunction
   * @generated
   */
  public Adapter createMainFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.MainComposition <em>Main Composition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.MainComposition
   * @generated
   */
  public Adapter createMainCompositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.MainStateTransition <em>Main State Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.MainStateTransition
   * @generated
   */
  public Adapter createMainStateTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.MainAttributes <em>Main Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.MainAttributes
   * @generated
   */
  public Adapter createMainAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.MainFunctions <em>Main Functions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.MainFunctions
   * @generated
   */
  public Adapter createMainFunctionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.Operator
   * @generated
   */
  public Adapter createOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.Transition
   * @generated
   */
  public Adapter createTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.OutTransition <em>Out Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.OutTransition
   * @generated
   */
  public Adapter createOutTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.NoTransition <em>No Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.NoTransition
   * @generated
   */
  public Adapter createNoTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.System
   * @generated
   */
  public Adapter createSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.Actor
   * @generated
   */
  public Adapter createActorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.User <em>User</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.User
   * @generated
   */
  public Adapter createUserAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.Time <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.Time
   * @generated
   */
  public Adapter createTimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.language.reqLanguage.TimingConstraint <em>Timing Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.language.reqLanguage.TimingConstraint
   * @generated
   */
  public Adapter createTimingConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ReqLanguageAdapterFactory
