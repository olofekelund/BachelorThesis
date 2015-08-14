/**
 */
package org.language.reqLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main State Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.language.reqLanguage.MainStateTransition#getSystem <em>System</em>}</li>
 *   <li>{@link org.language.reqLanguage.MainStateTransition#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.language.reqLanguage.MainStateTransition#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.language.reqLanguage.ReqLanguagePackage#getMainStateTransition()
 * @model
 * @generated
 */
public interface MainStateTransition extends EObject
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
   * @see org.language.reqLanguage.ReqLanguagePackage#getMainStateTransition_System()
   * @model containment="true"
   * @generated
   */
  org.language.reqLanguage.System getSystem();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.MainStateTransition#getSystem <em>System</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System</em>' containment reference.
   * @see #getSystem()
   * @generated
   */
  void setSystem(org.language.reqLanguage.System value);

  /**
   * Returns the value of the '<em><b>Transition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition</em>' containment reference.
   * @see #setTransition(EObject)
   * @see org.language.reqLanguage.ReqLanguagePackage#getMainStateTransition_Transition()
   * @model containment="true"
   * @generated
   */
  EObject getTransition();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.MainStateTransition#getTransition <em>Transition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transition</em>' containment reference.
   * @see #getTransition()
   * @generated
   */
  void setTransition(EObject value);

  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference.
   * @see #setFunction(Action)
   * @see org.language.reqLanguage.ReqLanguagePackage#getMainStateTransition_Function()
   * @model containment="true"
   * @generated
   */
  Action getFunction();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.MainStateTransition#getFunction <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' containment reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(Action value);

} // MainStateTransition
