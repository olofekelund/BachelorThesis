/**
 */
package org.language.reqLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.language.reqLanguage.TimingConstraint#getTimingConstraint <em>Timing Constraint</em>}</li>
 *   <li>{@link org.language.reqLanguage.TimingConstraint#getMinmax <em>Minmax</em>}</li>
 *   <li>{@link org.language.reqLanguage.TimingConstraint#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.language.reqLanguage.ReqLanguagePackage#getTimingConstraint()
 * @model
 * @generated
 */
public interface TimingConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Timing Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timing Constraint</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timing Constraint</em>' attribute.
   * @see #setTimingConstraint(String)
   * @see org.language.reqLanguage.ReqLanguagePackage#getTimingConstraint_TimingConstraint()
   * @model
   * @generated
   */
  String getTimingConstraint();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.TimingConstraint#getTimingConstraint <em>Timing Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timing Constraint</em>' attribute.
   * @see #getTimingConstraint()
   * @generated
   */
  void setTimingConstraint(String value);

  /**
   * Returns the value of the '<em><b>Minmax</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minmax</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minmax</em>' attribute.
   * @see #setMinmax(String)
   * @see org.language.reqLanguage.ReqLanguagePackage#getTimingConstraint_Minmax()
   * @model
   * @generated
   */
  String getMinmax();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.TimingConstraint#getMinmax <em>Minmax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minmax</em>' attribute.
   * @see #getMinmax()
   * @generated
   */
  void setMinmax(String value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' containment reference.
   * @see #setTime(Time)
   * @see org.language.reqLanguage.ReqLanguagePackage#getTimingConstraint_Time()
   * @model containment="true"
   * @generated
   */
  Time getTime();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.TimingConstraint#getTime <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' containment reference.
   * @see #getTime()
   * @generated
   */
  void setTime(Time value);

} // TimingConstraint
