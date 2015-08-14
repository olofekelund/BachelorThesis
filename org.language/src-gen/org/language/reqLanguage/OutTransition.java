/**
 */
package org.language.reqLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.language.reqLanguage.OutTransition#getSource_state <em>Source state</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.language.reqLanguage.ReqLanguagePackage#getOutTransition()
 * @model
 * @generated
 */
public interface OutTransition extends EObject
{
  /**
   * Returns the value of the '<em><b>Source state</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source state</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source state</em>' containment reference.
   * @see #setSource_state(EObject)
   * @see org.language.reqLanguage.ReqLanguagePackage#getOutTransition_Source_state()
   * @model containment="true"
   * @generated
   */
  EObject getSource_state();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.OutTransition#getSource_state <em>Source state</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source state</em>' containment reference.
   * @see #getSource_state()
   * @generated
   */
  void setSource_state(EObject value);

} // OutTransition
