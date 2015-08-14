/**
 */
package org.language.reqLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.language.reqLanguage.ReqLanguagePackage;
import org.language.reqLanguage.Time;
import org.language.reqLanguage.TimingConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.language.reqLanguage.impl.TimingConstraintImpl#getTimingConstraint <em>Timing Constraint</em>}</li>
 *   <li>{@link org.language.reqLanguage.impl.TimingConstraintImpl#getMinmax <em>Minmax</em>}</li>
 *   <li>{@link org.language.reqLanguage.impl.TimingConstraintImpl#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimingConstraintImpl extends MinimalEObjectImpl.Container implements TimingConstraint
{
  /**
   * The default value of the '{@link #getTimingConstraint() <em>Timing Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingConstraint()
   * @generated
   * @ordered
   */
  protected static final String TIMING_CONSTRAINT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTimingConstraint() <em>Timing Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingConstraint()
   * @generated
   * @ordered
   */
  protected String timingConstraint = TIMING_CONSTRAINT_EDEFAULT;

  /**
   * The default value of the '{@link #getMinmax() <em>Minmax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinmax()
   * @generated
   * @ordered
   */
  protected static final String MINMAX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMinmax() <em>Minmax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinmax()
   * @generated
   * @ordered
   */
  protected String minmax = MINMAX_EDEFAULT;

  /**
   * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected Time time;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimingConstraintImpl()
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
    return ReqLanguagePackage.Literals.TIMING_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTimingConstraint()
  {
    return timingConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimingConstraint(String newTimingConstraint)
  {
    String oldTimingConstraint = timingConstraint;
    timingConstraint = newTimingConstraint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.TIMING_CONSTRAINT__TIMING_CONSTRAINT, oldTimingConstraint, timingConstraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMinmax()
  {
    return minmax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinmax(String newMinmax)
  {
    String oldMinmax = minmax;
    minmax = newMinmax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.TIMING_CONSTRAINT__MINMAX, oldMinmax, minmax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Time getTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTime(Time newTime, NotificationChain msgs)
  {
    Time oldTime = time;
    time = newTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.TIMING_CONSTRAINT__TIME, oldTime, newTime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTime(Time newTime)
  {
    if (newTime != time)
    {
      NotificationChain msgs = null;
      if (time != null)
        msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.TIMING_CONSTRAINT__TIME, null, msgs);
      if (newTime != null)
        msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqLanguagePackage.TIMING_CONSTRAINT__TIME, null, msgs);
      msgs = basicSetTime(newTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReqLanguagePackage.TIMING_CONSTRAINT__TIME, newTime, newTime));
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
      case ReqLanguagePackage.TIMING_CONSTRAINT__TIME:
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
      case ReqLanguagePackage.TIMING_CONSTRAINT__TIMING_CONSTRAINT:
        return getTimingConstraint();
      case ReqLanguagePackage.TIMING_CONSTRAINT__MINMAX:
        return getMinmax();
      case ReqLanguagePackage.TIMING_CONSTRAINT__TIME:
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
      case ReqLanguagePackage.TIMING_CONSTRAINT__TIMING_CONSTRAINT:
        setTimingConstraint((String)newValue);
        return;
      case ReqLanguagePackage.TIMING_CONSTRAINT__MINMAX:
        setMinmax((String)newValue);
        return;
      case ReqLanguagePackage.TIMING_CONSTRAINT__TIME:
        setTime((Time)newValue);
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
      case ReqLanguagePackage.TIMING_CONSTRAINT__TIMING_CONSTRAINT:
        setTimingConstraint(TIMING_CONSTRAINT_EDEFAULT);
        return;
      case ReqLanguagePackage.TIMING_CONSTRAINT__MINMAX:
        setMinmax(MINMAX_EDEFAULT);
        return;
      case ReqLanguagePackage.TIMING_CONSTRAINT__TIME:
        setTime((Time)null);
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
      case ReqLanguagePackage.TIMING_CONSTRAINT__TIMING_CONSTRAINT:
        return TIMING_CONSTRAINT_EDEFAULT == null ? timingConstraint != null : !TIMING_CONSTRAINT_EDEFAULT.equals(timingConstraint);
      case ReqLanguagePackage.TIMING_CONSTRAINT__MINMAX:
        return MINMAX_EDEFAULT == null ? minmax != null : !MINMAX_EDEFAULT.equals(minmax);
      case ReqLanguagePackage.TIMING_CONSTRAINT__TIME:
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
    result.append(" (timingConstraint: ");
    result.append(timingConstraint);
    result.append(", minmax: ");
    result.append(minmax);
    result.append(')');
    return result.toString();
  }

} //TimingConstraintImpl
