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

import org.language.reqLanguage.PrefixEvent;
import org.language.reqLanguage.ReqLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prefix Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.language.reqLanguage.impl.PrefixEventImpl#getPrefixFixedSyntax <em>Prefix Fixed Syntax</em>}</li>
 *   <li>{@link org.language.reqLanguage.impl.PrefixEventImpl#getEvent_expression <em>Event expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrefixEventImpl extends MinimalEObjectImpl.Container implements PrefixEvent
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
   * The cached value of the '{@link #getEvent_expression() <em>Event expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent_expression()
   * @generated
   * @ordered
   */
  protected EObject event_expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrefixEventImpl()
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
    return ReqLanguagePackage.Literals.PREFIX_EVENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.PREFIX_EVENT__PREFIX_FIXED_SYNTAX, oldPrefixFixedSyntax, prefixFixedSyntax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getEvent_expression()
  {
    return event_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEvent_expression(EObject newEvent_expression, NotificationChain msgs)
  {
    EObject oldEvent_expression = event_expression;
    event_expression = newEvent_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.PREFIX_EVENT__EVENT_EXPRESSION, oldEvent_expression, newEvent_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvent_expression(EObject newEvent_expression)
  {
    if (newEvent_expression != event_expression)
    {
      NotificationChain msgs = null;
      if (event_expression != null)
        msgs = ((InternalEObject)event_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.PREFIX_EVENT__EVENT_EXPRESSION, null, msgs);
      if (newEvent_expression != null)
        msgs = ((InternalEObject)newEvent_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.PREFIX_EVENT__EVENT_EXPRESSION, null, msgs);
      msgs = basicSetEvent_expression(newEvent_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.PREFIX_EVENT__EVENT_EXPRESSION, newEvent_expression, newEvent_expression));
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
      case ReqLanguagePackage.PREFIX_EVENT__EVENT_EXPRESSION:
        return basicSetEvent_expression(null, msgs);
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
      case ReqLanguagePackage.PREFIX_EVENT__PREFIX_FIXED_SYNTAX:
        return getPrefixFixedSyntax();
      case ReqLanguagePackage.PREFIX_EVENT__EVENT_EXPRESSION:
        return getEvent_expression();
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
      case ReqLanguagePackage.PREFIX_EVENT__PREFIX_FIXED_SYNTAX:
        setPrefixFixedSyntax((String)newValue);
        return;
      case ReqLanguagePackage.PREFIX_EVENT__EVENT_EXPRESSION:
        setEvent_expression((EObject)newValue);
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
      case ReqLanguagePackage.PREFIX_EVENT__PREFIX_FIXED_SYNTAX:
        setPrefixFixedSyntax(PREFIX_FIXED_SYNTAX_EDEFAULT);
        return;
      case ReqLanguagePackage.PREFIX_EVENT__EVENT_EXPRESSION:
        setEvent_expression((EObject)null);
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
      case ReqLanguagePackage.PREFIX_EVENT__PREFIX_FIXED_SYNTAX:
        return PREFIX_FIXED_SYNTAX_EDEFAULT == null ? prefixFixedSyntax != null : !PREFIX_FIXED_SYNTAX_EDEFAULT.equals(prefixFixedSyntax);
      case ReqLanguagePackage.PREFIX_EVENT__EVENT_EXPRESSION:
        return event_expression != null;
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

} //PrefixEventImpl
