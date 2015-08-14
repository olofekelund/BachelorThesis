/**
 */
package org.language.reqLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.language.reqLanguage.Action;
import org.language.reqLanguage.MainStateTransition;
import org.language.reqLanguage.ReqLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main State Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.language.reqLanguage.impl.MainStateTransitionImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.language.reqLanguage.impl.MainStateTransitionImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.language.reqLanguage.impl.MainStateTransitionImpl#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MainStateTransitionImpl extends MinimalEObjectImpl.Container implements MainStateTransition
{
  /**
   * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystem()
   * @generated
   * @ordered
   */
  protected org.language.reqLanguage.System system;

  /**
   * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransition()
   * @generated
   * @ordered
   */
  protected EObject transition;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected Action function;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MainStateTransitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.language.reqLanguage.System getSystem()
  {
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSystem(org.language.reqLanguage.System newSystem, NotificationChain msgs)
  {
    org.language.reqLanguage.System oldSystem = system;
    system = newSystem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.MAIN_STATE_TRANSITION__SYSTEM, oldSystem, newSystem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSystem(org.language.reqLanguage.System newSystem)
  {
    if (newSystem != system)
    {
      NotificationChain msgs = null;
      if (system != null)
        msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.MAIN_STATE_TRANSITION__SYSTEM, null, msgs);
      if (newSystem != null)
        msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.MAIN_STATE_TRANSITION__SYSTEM, null, msgs);
      msgs = basicSetSystem(newSystem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.MAIN_STATE_TRANSITION__SYSTEM, newSystem, newSystem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getTransition()
  {
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTransition(EObject newTransition, NotificationChain msgs)
  {
    EObject oldTransition = transition;
    transition = newTransition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.MAIN_STATE_TRANSITION__TRANSITION, oldTransition, newTransition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransition(EObject newTransition)
  {
    if (newTransition != transition)
    {
      NotificationChain msgs = null;
      if (transition != null)
        msgs = ((InternalEObject)transition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.MAIN_STATE_TRANSITION__TRANSITION, null, msgs);
      if (newTransition != null)
        msgs = ((InternalEObject)newTransition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.MAIN_STATE_TRANSITION__TRANSITION, null, msgs);
      msgs = basicSetTransition(newTransition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.MAIN_STATE_TRANSITION__TRANSITION, newTransition, newTransition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunction(Action newFunction, NotificationChain msgs)
  {
    Action oldFunction = function;
    function = newFunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.MAIN_STATE_TRANSITION__FUNCTION, oldFunction, newFunction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction(Action newFunction)
  {
    if (newFunction != function)
    {
      NotificationChain msgs = null;
      if (function != null)
        msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.MAIN_STATE_TRANSITION__FUNCTION, null, msgs);
      if (newFunction != null)
        msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.MAIN_STATE_TRANSITION__FUNCTION, null, msgs);
      msgs = basicSetFunction(newFunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.MAIN_STATE_TRANSITION__FUNCTION, newFunction, newFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ReqLanguagePackage.MAIN_STATE_TRANSITION__SYSTEM:
        return basicSetSystem(null, msgs);
      case ReqLanguagePackage.MAIN_STATE_TRANSITION__TRANSITION:
        return basicSetTransition(null, msgs);
      case ReqLanguagePackage.MAIN_STATE_TRANSITION__FUNCTION:
        return basicSetFunction(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ReqLanguagePackage.MAIN_STATE_TRANSITION__SYSTEM:
        return getSystem();
      case ReqLanguagePackage.MAIN_STATE_TRANSITION__TRANSITION:
        return getTransition();
      case ReqLanguagePackage.MAIN_STATE_TRANSITION__FUNCTION:
        return getFunction();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ReqLanguagePackage.MAIN_STATE_TRANSITION__SYSTEM:
        setSystem((org.language.reqLanguage.System)newValue);
        return;
      case ReqLanguagePackage.MAIN_STATE_TRANSITION__TRANSITION:
        setTransition((EObject)newValue);
        return;
      case ReqLanguagePackage.MAIN_STATE_TRANSITION__FUNCTION:
        setFunction((Action)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ReqLanguagePackage.MAIN_STATE_TRANSITION__SYSTEM:
        setSystem((org.language.reqLanguage.System)null);
        return;
      case ReqLanguagePackage.MAIN_STATE_TRANSITION__TRANSITION:
        setTransition((EObject)null);
        return;
      case ReqLanguagePackage.MAIN_STATE_TRANSITION__FUNCTION:
        setFunction((Action)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ReqLanguagePackage.MAIN_STATE_TRANSITION__SYSTEM:
        return system != null;
      case ReqLanguagePackage.MAIN_STATE_TRANSITION__TRANSITION:
        return transition != null;
      case ReqLanguagePackage.MAIN_STATE_TRANSITION__FUNCTION:
        return function != null;
    }
    return super.eIsSet(featureID);
  }

} //MainStateTransitionImpl
