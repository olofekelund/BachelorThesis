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

import org.language.reqLanguage.PrefixRightOperand;
import org.language.reqLanguage.ReqLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prefix Right Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.language.reqLanguage.impl.PrefixRightOperandImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.language.reqLanguage.impl.PrefixRightOperandImpl#getPrefixRightOperand <em>Prefix Right Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrefixRightOperandImpl extends MinimalEObjectImpl.Container implements PrefixRightOperand
{
  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getPrefixRightOperand() <em>Prefix Right Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefixRightOperand()
   * @generated
   * @ordered
   */
  protected EObject prefixRightOperand;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrefixRightOperandImpl()
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
    return ReqLanguagePackage.Literals.PREFIX_RIGHT_OPERAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.PREFIX_RIGHT_OPERAND__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getPrefixRightOperand()
  {
    return prefixRightOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrefixRightOperand(EObject newPrefixRightOperand, NotificationChain msgs)
  {
    EObject oldPrefixRightOperand = prefixRightOperand;
    prefixRightOperand = newPrefixRightOperand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.PREFIX_RIGHT_OPERAND__PREFIX_RIGHT_OPERAND, oldPrefixRightOperand, newPrefixRightOperand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrefixRightOperand(EObject newPrefixRightOperand)
  {
    if (newPrefixRightOperand != prefixRightOperand)
    {
      NotificationChain msgs = null;
      if (prefixRightOperand != null)
        msgs = ((InternalEObject)prefixRightOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.PREFIX_RIGHT_OPERAND__PREFIX_RIGHT_OPERAND, null, msgs);
      if (newPrefixRightOperand != null)
        msgs = ((InternalEObject)newPrefixRightOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.PREFIX_RIGHT_OPERAND__PREFIX_RIGHT_OPERAND, null, msgs);
      msgs = basicSetPrefixRightOperand(newPrefixRightOperand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.PREFIX_RIGHT_OPERAND__PREFIX_RIGHT_OPERAND, newPrefixRightOperand, newPrefixRightOperand));
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
      case ReqLanguagePackage.PREFIX_RIGHT_OPERAND__PREFIX_RIGHT_OPERAND:
        return basicSetPrefixRightOperand(null, msgs);
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
      case ReqLanguagePackage.PREFIX_RIGHT_OPERAND__OPERATOR:
        return getOperator();
      case ReqLanguagePackage.PREFIX_RIGHT_OPERAND__PREFIX_RIGHT_OPERAND:
        return getPrefixRightOperand();
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
      case ReqLanguagePackage.PREFIX_RIGHT_OPERAND__OPERATOR:
        setOperator((String)newValue);
        return;
      case ReqLanguagePackage.PREFIX_RIGHT_OPERAND__PREFIX_RIGHT_OPERAND:
        setPrefixRightOperand((EObject)newValue);
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
      case ReqLanguagePackage.PREFIX_RIGHT_OPERAND__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case ReqLanguagePackage.PREFIX_RIGHT_OPERAND__PREFIX_RIGHT_OPERAND:
        setPrefixRightOperand((EObject)null);
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
      case ReqLanguagePackage.PREFIX_RIGHT_OPERAND__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case ReqLanguagePackage.PREFIX_RIGHT_OPERAND__PREFIX_RIGHT_OPERAND:
        return prefixRightOperand != null;
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
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //PrefixRightOperandImpl
