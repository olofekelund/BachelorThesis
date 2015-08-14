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

import org.language.reqLanguage.Prefix;
import org.language.reqLanguage.ReqID;
import org.language.reqLanguage.ReqLanguagePackage;
import org.language.reqLanguage.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.language.reqLanguage.impl.RequirementImpl#getReqID <em>Req ID</em>}</li>
 *   <li>{@link org.language.reqLanguage.impl.RequirementImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.language.reqLanguage.impl.RequirementImpl#getMainRequirement <em>Main Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementImpl extends MinimalEObjectImpl.Container implements Requirement
{
  /**
   * The cached value of the '{@link #getReqID() <em>Req ID</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReqID()
   * @generated
   * @ordered
   */
  protected ReqID reqID;

  /**
   * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected Prefix prefix;

  /**
   * The cached value of the '{@link #getMainRequirement() <em>Main Requirement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainRequirement()
   * @generated
   * @ordered
   */
  protected EObject mainRequirement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequirementImpl()
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
    return ReqLanguagePackage.Literals.REQUIREMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReqID getReqID()
  {
    return reqID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReqID(ReqID newReqID, NotificationChain msgs)
  {
    ReqID oldReqID = reqID;
    reqID = newReqID;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.REQUIREMENT__REQ_ID, oldReqID, newReqID);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReqID(ReqID newReqID)
  {
    if (newReqID != reqID)
    {
      NotificationChain msgs = null;
      if (reqID != null)
        msgs = ((InternalEObject)reqID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.REQUIREMENT__REQ_ID, null, msgs);
      if (newReqID != null)
        msgs = ((InternalEObject)newReqID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.REQUIREMENT__REQ_ID, null, msgs);
      msgs = basicSetReqID(newReqID, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.REQUIREMENT__REQ_ID, newReqID, newReqID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Prefix getPrefix()
  {
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrefix(Prefix newPrefix, NotificationChain msgs)
  {
    Prefix oldPrefix = prefix;
    prefix = newPrefix;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.REQUIREMENT__PREFIX, oldPrefix, newPrefix);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrefix(Prefix newPrefix)
  {
    if (newPrefix != prefix)
    {
      NotificationChain msgs = null;
      if (prefix != null)
        msgs = ((InternalEObject)prefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.REQUIREMENT__PREFIX, null, msgs);
      if (newPrefix != null)
        msgs = ((InternalEObject)newPrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.REQUIREMENT__PREFIX, null, msgs);
      msgs = basicSetPrefix(newPrefix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.REQUIREMENT__PREFIX, newPrefix, newPrefix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getMainRequirement()
  {
    return mainRequirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMainRequirement(EObject newMainRequirement, NotificationChain msgs)
  {
    EObject oldMainRequirement = mainRequirement;
    mainRequirement = newMainRequirement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.REQUIREMENT__MAIN_REQUIREMENT, oldMainRequirement, newMainRequirement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMainRequirement(EObject newMainRequirement)
  {
    if (newMainRequirement != mainRequirement)
    {
      NotificationChain msgs = null;
      if (mainRequirement != null)
        msgs = ((InternalEObject)mainRequirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.REQUIREMENT__MAIN_REQUIREMENT, null, msgs);
      if (newMainRequirement != null)
        msgs = ((InternalEObject)newMainRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.REQUIREMENT__MAIN_REQUIREMENT, null, msgs);
      msgs = basicSetMainRequirement(newMainRequirement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.REQUIREMENT__MAIN_REQUIREMENT, newMainRequirement, newMainRequirement));
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
      case ReqLanguagePackage.REQUIREMENT__REQ_ID:
        return basicSetReqID(null, msgs);
      case ReqLanguagePackage.REQUIREMENT__PREFIX:
        return basicSetPrefix(null, msgs);
      case ReqLanguagePackage.REQUIREMENT__MAIN_REQUIREMENT:
        return basicSetMainRequirement(null, msgs);
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
      case ReqLanguagePackage.REQUIREMENT__REQ_ID:
        return getReqID();
      case ReqLanguagePackage.REQUIREMENT__PREFIX:
        return getPrefix();
      case ReqLanguagePackage.REQUIREMENT__MAIN_REQUIREMENT:
        return getMainRequirement();
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
      case ReqLanguagePackage.REQUIREMENT__REQ_ID:
        setReqID((ReqID)newValue);
        return;
      case ReqLanguagePackage.REQUIREMENT__PREFIX:
        setPrefix((Prefix)newValue);
        return;
      case ReqLanguagePackage.REQUIREMENT__MAIN_REQUIREMENT:
        setMainRequirement((EObject)newValue);
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
      case ReqLanguagePackage.REQUIREMENT__REQ_ID:
        setReqID((ReqID)null);
        return;
      case ReqLanguagePackage.REQUIREMENT__PREFIX:
        setPrefix((Prefix)null);
        return;
      case ReqLanguagePackage.REQUIREMENT__MAIN_REQUIREMENT:
        setMainRequirement((EObject)null);
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
      case ReqLanguagePackage.REQUIREMENT__REQ_ID:
        return reqID != null;
      case ReqLanguagePackage.REQUIREMENT__PREFIX:
        return prefix != null;
      case ReqLanguagePackage.REQUIREMENT__MAIN_REQUIREMENT:
        return mainRequirement != null;
    }
    return super.eIsSet(featureID);
  }

} //RequirementImpl
