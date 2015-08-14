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

import org.language.reqLanguage.PrefixState;
import org.language.reqLanguage.ReqLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prefix State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.language.reqLanguage.impl.PrefixStateImpl#getPrefixFixedSyntax <em>Prefix Fixed Syntax</em>}</li>
 *   <li>{@link org.language.reqLanguage.impl.PrefixStateImpl#getStateExpression <em>State Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrefixStateImpl extends MinimalEObjectImpl.Container implements PrefixState
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
   * The cached value of the '{@link #getStateExpression() <em>State Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateExpression()
   * @generated
   * @ordered
   */
  protected EObject stateExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrefixStateImpl()
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
    return ReqLanguagePackage.Literals.PREFIX_STATE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.PREFIX_STATE__PREFIX_FIXED_SYNTAX, oldPrefixFixedSyntax, prefixFixedSyntax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getStateExpression()
  {
    return stateExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStateExpression(EObject newStateExpression, NotificationChain msgs)
  {
    EObject oldStateExpression = stateExpression;
    stateExpression = newStateExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.PREFIX_STATE__STATE_EXPRESSION, oldStateExpression, newStateExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStateExpression(EObject newStateExpression)
  {
    if (newStateExpression != stateExpression)
    {
      NotificationChain msgs = null;
      if (stateExpression != null)
        msgs = ((InternalEObject)stateExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.PREFIX_STATE__STATE_EXPRESSION, null, msgs);
      if (newStateExpression != null)
        msgs = ((InternalEObject)newStateExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.PREFIX_STATE__STATE_EXPRESSION, null, msgs);
      msgs = basicSetStateExpression(newStateExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.PREFIX_STATE__STATE_EXPRESSION, newStateExpression, newStateExpression));
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
      case ReqLanguagePackage.PREFIX_STATE__STATE_EXPRESSION:
        return basicSetStateExpression(null, msgs);
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
      case ReqLanguagePackage.PREFIX_STATE__PREFIX_FIXED_SYNTAX:
        return getPrefixFixedSyntax();
      case ReqLanguagePackage.PREFIX_STATE__STATE_EXPRESSION:
        return getStateExpression();
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
      case ReqLanguagePackage.PREFIX_STATE__PREFIX_FIXED_SYNTAX:
        setPrefixFixedSyntax((String)newValue);
        return;
      case ReqLanguagePackage.PREFIX_STATE__STATE_EXPRESSION:
        setStateExpression((EObject)newValue);
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
      case ReqLanguagePackage.PREFIX_STATE__PREFIX_FIXED_SYNTAX:
        setPrefixFixedSyntax(PREFIX_FIXED_SYNTAX_EDEFAULT);
        return;
      case ReqLanguagePackage.PREFIX_STATE__STATE_EXPRESSION:
        setStateExpression((EObject)null);
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
      case ReqLanguagePackage.PREFIX_STATE__PREFIX_FIXED_SYNTAX:
        return PREFIX_FIXED_SYNTAX_EDEFAULT == null ? prefixFixedSyntax != null : !PREFIX_FIXED_SYNTAX_EDEFAULT.equals(prefixFixedSyntax);
      case ReqLanguagePackage.PREFIX_STATE__STATE_EXPRESSION:
        return stateExpression != null;
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

} //PrefixStateImpl
