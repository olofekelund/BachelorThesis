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

import org.language.reqLanguage.Parameter;
import org.language.reqLanguage.ParameterState;
import org.language.reqLanguage.ReqLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.language.reqLanguage.impl.ParameterStateImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.language.reqLanguage.impl.ParameterStateImpl#getParameter_value <em>Parameter value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterStateImpl extends MinimalEObjectImpl.Container implements ParameterState
{
  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected Parameter parameter;

  /**
   * The cached value of the '{@link #getParameter_value() <em>Parameter value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter_value()
   * @generated
   * @ordered
   */
  protected EObject parameter_value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterStateImpl()
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
    return ReqLanguagePackage.Literals.PARAMETER_STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getParameter()
  {
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameter(Parameter newParameter, NotificationChain msgs)
  {
    Parameter oldParameter = parameter;
    parameter = newParameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.PARAMETER_STATE__PARAMETER, oldParameter, newParameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter(Parameter newParameter)
  {
    if (newParameter != parameter)
    {
      NotificationChain msgs = null;
      if (parameter != null)
        msgs = ((InternalEObject)parameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.PARAMETER_STATE__PARAMETER, null, msgs);
      if (newParameter != null)
        msgs = ((InternalEObject)newParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.PARAMETER_STATE__PARAMETER, null, msgs);
      msgs = basicSetParameter(newParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.PARAMETER_STATE__PARAMETER, newParameter, newParameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getParameter_value()
  {
    return parameter_value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameter_value(EObject newParameter_value, NotificationChain msgs)
  {
    EObject oldParameter_value = parameter_value;
    parameter_value = newParameter_value;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.PARAMETER_STATE__PARAMETER_VALUE, oldParameter_value, newParameter_value);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter_value(EObject newParameter_value)
  {
    if (newParameter_value != parameter_value)
    {
      NotificationChain msgs = null;
      if (parameter_value != null)
        msgs = ((InternalEObject)parameter_value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.PARAMETER_STATE__PARAMETER_VALUE, null, msgs);
      if (newParameter_value != null)
        msgs = ((InternalEObject)newParameter_value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.PARAMETER_STATE__PARAMETER_VALUE, null, msgs);
      msgs = basicSetParameter_value(newParameter_value, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.PARAMETER_STATE__PARAMETER_VALUE, newParameter_value, newParameter_value));
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
      case ReqLanguagePackage.PARAMETER_STATE__PARAMETER:
        return basicSetParameter(null, msgs);
      case ReqLanguagePackage.PARAMETER_STATE__PARAMETER_VALUE:
        return basicSetParameter_value(null, msgs);
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
      case ReqLanguagePackage.PARAMETER_STATE__PARAMETER:
        return getParameter();
      case ReqLanguagePackage.PARAMETER_STATE__PARAMETER_VALUE:
        return getParameter_value();
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
      case ReqLanguagePackage.PARAMETER_STATE__PARAMETER:
        setParameter((Parameter)newValue);
        return;
      case ReqLanguagePackage.PARAMETER_STATE__PARAMETER_VALUE:
        setParameter_value((EObject)newValue);
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
      case ReqLanguagePackage.PARAMETER_STATE__PARAMETER:
        setParameter((Parameter)null);
        return;
      case ReqLanguagePackage.PARAMETER_STATE__PARAMETER_VALUE:
        setParameter_value((EObject)null);
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
      case ReqLanguagePackage.PARAMETER_STATE__PARAMETER:
        return parameter != null;
      case ReqLanguagePackage.PARAMETER_STATE__PARAMETER_VALUE:
        return parameter_value != null;
    }
    return super.eIsSet(featureID);
  }

} //ParameterStateImpl
