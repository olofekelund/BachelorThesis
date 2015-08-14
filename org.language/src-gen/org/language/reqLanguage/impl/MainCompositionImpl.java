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

import org.language.reqLanguage.MainComposition;
import org.language.reqLanguage.ReqLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.language.reqLanguage.impl.MainCompositionImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.language.reqLanguage.impl.MainCompositionImpl#getSubsystemList <em>Subsystem List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MainCompositionImpl extends MinimalEObjectImpl.Container implements MainComposition
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
   * The cached value of the '{@link #getSubsystemList() <em>Subsystem List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubsystemList()
   * @generated
   * @ordered
   */
  protected EList<org.language.reqLanguage.System> subsystemList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MainCompositionImpl()
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
    return ReqLanguagePackage.Literals.MAIN_COMPOSITION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.MAIN_COMPOSITION__SYSTEM, oldSystem, newSystem);
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
        msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.MAIN_COMPOSITION__SYSTEM, null, msgs);
      if (newSystem != null)
        msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.MAIN_COMPOSITION__SYSTEM, null, msgs);
      msgs = basicSetSystem(newSystem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.MAIN_COMPOSITION__SYSTEM, newSystem, newSystem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.language.reqLanguage.System> getSubsystemList()
  {
    if (subsystemList == null)
    {
      subsystemList = new EObjectContainmentEList<org.language.reqLanguage.System>(org.language.reqLanguage.System.class, this, ReqLanguagePackage.MAIN_COMPOSITION__SUBSYSTEM_LIST);
    }
    return subsystemList;
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
      case ReqLanguagePackage.MAIN_COMPOSITION__SYSTEM:
        return basicSetSystem(null, msgs);
      case ReqLanguagePackage.MAIN_COMPOSITION__SUBSYSTEM_LIST:
        return ((InternalEList<?>)getSubsystemList()).basicRemove(otherEnd, msgs);
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
      case ReqLanguagePackage.MAIN_COMPOSITION__SYSTEM:
        return getSystem();
      case ReqLanguagePackage.MAIN_COMPOSITION__SUBSYSTEM_LIST:
        return getSubsystemList();
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
      case ReqLanguagePackage.MAIN_COMPOSITION__SYSTEM:
        setSystem((org.language.reqLanguage.System)newValue);
        return;
      case ReqLanguagePackage.MAIN_COMPOSITION__SUBSYSTEM_LIST:
        getSubsystemList().clear();
        getSubsystemList().addAll((Collection<? extends org.language.reqLanguage.System>)newValue);
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
      case ReqLanguagePackage.MAIN_COMPOSITION__SYSTEM:
        setSystem((org.language.reqLanguage.System)null);
        return;
      case ReqLanguagePackage.MAIN_COMPOSITION__SUBSYSTEM_LIST:
        getSubsystemList().clear();
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
      case ReqLanguagePackage.MAIN_COMPOSITION__SYSTEM:
        return system != null;
      case ReqLanguagePackage.MAIN_COMPOSITION__SUBSYSTEM_LIST:
        return subsystemList != null && !subsystemList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MainCompositionImpl
