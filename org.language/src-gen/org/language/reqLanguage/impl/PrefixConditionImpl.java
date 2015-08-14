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

import org.language.reqLanguage.Operator;
import org.language.reqLanguage.PrefixCondition;
import org.language.reqLanguage.ReqLanguagePackage;
import org.language.reqLanguage.TimingConstraint;
import org.language.reqLanguage.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prefix Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.language.reqLanguage.impl.PrefixConditionImpl#getPrefixFixedSyntax <em>Prefix Fixed Syntax</em>}</li>
 *   <li>{@link org.language.reqLanguage.impl.PrefixConditionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.language.reqLanguage.impl.PrefixConditionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.language.reqLanguage.impl.PrefixConditionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.language.reqLanguage.impl.PrefixConditionImpl#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrefixConditionImpl extends MinimalEObjectImpl.Container implements PrefixCondition
{
  /**
   * The default value of the '{@link #getPrefixFixedSyntax() <em>Prefix Fixed Syntax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefixFixedSyntax()
   * @generated
   * @ordered
   */
  protected static final String PREFIX_FIXED_SYNTAX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrefixFixedSyntax() <em>Prefix Fixed Syntax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefixFixedSyntax()
   * @generated
   * @ordered
   */
  protected String prefixFixedSyntax = PREFIX_FIXED_SYNTAX_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected EObject parameter;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected Operator operator;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Value value;

  /**
   * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected TimingConstraint time;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrefixConditionImpl()
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
    return ReqLanguagePackage.Literals.PREFIX_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrefixFixedSyntax()
  {
    return prefixFixedSyntax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrefixFixedSyntax(String newPrefixFixedSyntax)
  {
    String oldPrefixFixedSyntax = prefixFixedSyntax;
    prefixFixedSyntax = newPrefixFixedSyntax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.PREFIX_CONDITION__PREFIX_FIXED_SYNTAX, oldPrefixFixedSyntax, prefixFixedSyntax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getParameter()
  {
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameter(EObject newParameter, NotificationChain msgs)
  {
    EObject oldParameter = parameter;
    parameter = newParameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.PREFIX_CONDITION__PARAMETER, oldParameter, newParameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter(EObject newParameter)
  {
    if (newParameter != parameter)
    {
      NotificationChain msgs = null;
      if (parameter != null)
        msgs = ((InternalEObject)parameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.PREFIX_CONDITION__PARAMETER, null, msgs);
      if (newParameter != null)
        msgs = ((InternalEObject)newParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.PREFIX_CONDITION__PARAMETER, null, msgs);
      msgs = basicSetParameter(newParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.PREFIX_CONDITION__PARAMETER, newParameter, newParameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperator(Operator newOperator, NotificationChain msgs)
  {
    Operator oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.PREFIX_CONDITION__OPERATOR, oldOperator, newOperator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(Operator newOperator)
  {
    if (newOperator != operator)
    {
      NotificationChain msgs = null;
      if (operator != null)
        msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.PREFIX_CONDITION__OPERATOR, null, msgs);
      if (newOperator != null)
        msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.PREFIX_CONDITION__OPERATOR, null, msgs);
      msgs = basicSetOperator(newOperator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.PREFIX_CONDITION__OPERATOR, newOperator, newOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Value newValue, NotificationChain msgs)
  {
    Value oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.PREFIX_CONDITION__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Value newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.PREFIX_CONDITION__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.PREFIX_CONDITION__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.PREFIX_CONDITION__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimingConstraint getTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTime(TimingConstraint newTime, NotificationChain msgs)
  {
    TimingConstraint oldTime = time;
    time = newTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.PREFIX_CONDITION__TIME, oldTime, newTime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTime(TimingConstraint newTime)
  {
    if (newTime != time)
    {
      NotificationChain msgs = null;
      if (time != null)
        msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.PREFIX_CONDITION__TIME, null, msgs);
      if (newTime != null)
        msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.PREFIX_CONDITION__TIME, null, msgs);
      msgs = basicSetTime(newTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.PREFIX_CONDITION__TIME, newTime, newTime));
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
      case ReqLanguagePackage.PREFIX_CONDITION__PARAMETER:
        return basicSetParameter(null, msgs);
      case ReqLanguagePackage.PREFIX_CONDITION__OPERATOR:
        return basicSetOperator(null, msgs);
      case ReqLanguagePackage.PREFIX_CONDITION__VALUE:
        return basicSetValue(null, msgs);
      case ReqLanguagePackage.PREFIX_CONDITION__TIME:
        return basicSetTime(null, msgs);
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
      case ReqLanguagePackage.PREFIX_CONDITION__PREFIX_FIXED_SYNTAX:
        return getPrefixFixedSyntax();
      case ReqLanguagePackage.PREFIX_CONDITION__PARAMETER:
        return getParameter();
      case ReqLanguagePackage.PREFIX_CONDITION__OPERATOR:
        return getOperator();
      case ReqLanguagePackage.PREFIX_CONDITION__VALUE:
        return getValue();
      case ReqLanguagePackage.PREFIX_CONDITION__TIME:
        return getTime();
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
      case ReqLanguagePackage.PREFIX_CONDITION__PREFIX_FIXED_SYNTAX:
        setPrefixFixedSyntax((String)newValue);
        return;
      case ReqLanguagePackage.PREFIX_CONDITION__PARAMETER:
        setParameter((EObject)newValue);
        return;
      case ReqLanguagePackage.PREFIX_CONDITION__OPERATOR:
        setOperator((Operator)newValue);
        return;
      case ReqLanguagePackage.PREFIX_CONDITION__VALUE:
        setValue((Value)newValue);
        return;
      case ReqLanguagePackage.PREFIX_CONDITION__TIME:
        setTime((TimingConstraint)newValue);
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
      case ReqLanguagePackage.PREFIX_CONDITION__PREFIX_FIXED_SYNTAX:
        setPrefixFixedSyntax(PREFIX_FIXED_SYNTAX_EDEFAULT);
        return;
      case ReqLanguagePackage.PREFIX_CONDITION__PARAMETER:
        setParameter((EObject)null);
        return;
      case ReqLanguagePackage.PREFIX_CONDITION__OPERATOR:
        setOperator((Operator)null);
        return;
      case ReqLanguagePackage.PREFIX_CONDITION__VALUE:
        setValue((Value)null);
        return;
      case ReqLanguagePackage.PREFIX_CONDITION__TIME:
        setTime((TimingConstraint)null);
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
      case ReqLanguagePackage.PREFIX_CONDITION__PREFIX_FIXED_SYNTAX:
        return PREFIX_FIXED_SYNTAX_EDEFAULT == null ? prefixFixedSyntax != null : !PREFIX_FIXED_SYNTAX_EDEFAULT.equals(prefixFixedSyntax);
      case ReqLanguagePackage.PREFIX_CONDITION__PARAMETER:
        return parameter != null;
      case ReqLanguagePackage.PREFIX_CONDITION__OPERATOR:
        return operator != null;
      case ReqLanguagePackage.PREFIX_CONDITION__VALUE:
        return value != null;
      case ReqLanguagePackage.PREFIX_CONDITION__TIME:
        return time != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (prefixFixedSyntax: ");
    result.append(prefixFixedSyntax);
    result.append(')');
    return result.toString();
  }

} //PrefixConditionImpl
