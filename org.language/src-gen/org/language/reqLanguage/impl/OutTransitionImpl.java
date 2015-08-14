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

import org.language.reqLanguage.OutTransition;
import org.language.reqLanguage.ReqLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Out Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.language.reqLanguage.impl.OutTransitionImpl#getSource_state <em>Source state</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutTransitionImpl extends MinimalEObjectImpl.Container implements OutTransition
{
  /**
   * The cached value of the '{@link #getSource_state() <em>Source state</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource_state()
   * @generated
   * @ordered
   */
  protected EObject source_state;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OutTransitionImpl()
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
    return ReqLanguagePackage.Literals.OUT_TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getSource_state()
  {
    return source_state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource_state(EObject newSource_state, NotificationChain msgs)
  {
    EObject oldSource_state = source_state;
    source_state = newSource_state;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.OUT_TRANSITION__SOURCE_STATE, oldSource_state, newSource_state);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource_state(EObject newSource_state)
  {
    if (newSource_state != source_state)
    {
      NotificationChain msgs = null;
      if (source_state != null)
        msgs = ((InternalEObject)source_state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.OUT_TRANSITION__SOURCE_STATE, null, msgs);
      if (newSource_state != null)
        msgs = ((InternalEObject)newSource_state).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.OUT_TRANSITION__SOURCE_STATE, null, msgs);
      msgs = basicSetSource_state(newSource_state, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.OUT_TRANSITION__SOURCE_STATE, newSource_state, newSource_state));
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
      case ReqLanguagePackage.OUT_TRANSITION__SOURCE_STATE:
        return basicSetSource_state(null, msgs);
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
      case ReqLanguagePackage.OUT_TRANSITION__SOURCE_STATE:
        return getSource_state();
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
      case ReqLanguagePackage.OUT_TRANSITION__SOURCE_STATE:
        setSource_state((EObject)newValue);
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
      case ReqLanguagePackage.OUT_TRANSITION__SOURCE_STATE:
        setSource_state((EObject)null);
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
      case ReqLanguagePackage.OUT_TRANSITION__SOURCE_STATE:
        return source_state != null;
    }
    return super.eIsSet(featureID);
  }

} //OutTransitionImpl
