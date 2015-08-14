/**
 */
package org.language.reqLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.language.reqLanguage.Function;
import org.language.reqLanguage.MainFunctions;
import org.language.reqLanguage.ReqLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Functions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.language.reqLanguage.impl.MainFunctionsImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.language.reqLanguage.impl.MainFunctionsImpl#getFunctionList <em>Function List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MainFunctionsImpl extends MinimalEObjectImpl.Container implements MainFunctions
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
   * The cached value of the '{@link #getFunctionList() <em>Function List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionList()
   * @generated
   * @ordered
   */
  protected EList<Function> functionList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MainFunctionsImpl()
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
    return ReqLanguagePackage.Literals.MAIN_FUNCTIONS;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.MAIN_FUNCTIONS__SYSTEM, oldSystem, newSystem);
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
        msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.MAIN_FUNCTIONS__SYSTEM, null, msgs);
      if (newSystem != null)
        msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.MAIN_FUNCTIONS__SYSTEM, null, msgs);
      msgs = basicSetSystem(newSystem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.MAIN_FUNCTIONS__SYSTEM, newSystem, newSystem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Function> getFunctionList()
  {
    if (functionList == null)
    {
      functionList = new EObjectContainmentEList<Function>(Function.class, this, ReqLanguagePackage.MAIN_FUNCTIONS__FUNCTION_LIST);
    }
    return functionList;
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
      case ReqLanguagePackage.MAIN_FUNCTIONS__SYSTEM:
        return basicSetSystem(null, msgs);
      case ReqLanguagePackage.MAIN_FUNCTIONS__FUNCTION_LIST:
        return ((InternalEList<?>)getFunctionList()).basicRemove(otherEnd, msgs);
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
      case ReqLanguagePackage.MAIN_FUNCTIONS__SYSTEM:
        return getSystem();
      case ReqLanguagePackage.MAIN_FUNCTIONS__FUNCTION_LIST:
        return getFunctionList();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ReqLanguagePackage.MAIN_FUNCTIONS__SYSTEM:
        setSystem((org.language.reqLanguage.System)newValue);
        return;
      case ReqLanguagePackage.MAIN_FUNCTIONS__FUNCTION_LIST:
        getFunctionList().clear();
        getFunctionList().addAll((Collection<? extends Function>)newValue);
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
      case ReqLanguagePackage.MAIN_FUNCTIONS__SYSTEM:
        setSystem((org.language.reqLanguage.System)null);
        return;
      case ReqLanguagePackage.MAIN_FUNCTIONS__FUNCTION_LIST:
        getFunctionList().clear();
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
      case ReqLanguagePackage.MAIN_FUNCTIONS__SYSTEM:
        return system != null;
      case ReqLanguagePackage.MAIN_FUNCTIONS__FUNCTION_LIST:
        return functionList != null && !functionList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MainFunctionsImpl
