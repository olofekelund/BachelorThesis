/**
 */
package org.language.reqLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.language.reqLanguage.StateEvent#getSystem <em>System</em>}</li>
 *   <li>{@link org.language.reqLanguage.StateEvent#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.language.reqLanguage.ReqLanguagePackage#getStateEvent()
 * @model
 * @generated
 */
public interface StateEvent extends EObject
{
  /**
   * Returns the value of the '<em><b>System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System</em>' containment reference.
   * @see #setSystem(org.language.reqLanguage.System)
   * @see org.language.reqLanguage.ReqLanguagePackage#getStateEvent_System()
   * @model containment="true"
   * @generated
   */
  org.language.reqLanguage.System getSystem();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.StateEvent#getSystem <em>System</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System</em>' containment reference.
   * @see #getSystem()
   * @generated
   */
  void setSystem(org.language.reqLanguage.System value);

  /**
   * Returns the value of the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' containment reference.
   * @see #setState(State)
   * @see org.language.reqLanguage.ReqLanguagePackage#getStateEvent_State()
   * @model containment="true"
   * @generated
   */
  State getState();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.StateEvent#getState <em>State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' containment reference.
   * @see #getState()
   * @generated
   */
  void setState(State value);

} // StateEvent
