/**
 */
package org.language.reqLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.language.reqLanguage.ParameterState#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.language.reqLanguage.ParameterState#getParameter_value <em>Parameter value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.language.reqLanguage.ReqLanguagePackage#getParameterState()
 * @model
 * @generated
 */
public interface ParameterState extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(Parameter)
   * @see org.language.reqLanguage.ReqLanguagePackage#getParameterState_Parameter()
   * @model containment="true"
   * @generated
   */
  Parameter getParameter();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.ParameterState#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(Parameter value);

  /**
   * Returns the value of the '<em><b>Parameter value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter value</em>' containment reference.
   * @see #setParameter_value(EObject)
   * @see org.language.reqLanguage.ReqLanguagePackage#getParameterState_Parameter_value()
   * @model containment="true"
   * @generated
   */
  EObject getParameter_value();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.ParameterState#getParameter_value <em>Parameter value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter value</em>' containment reference.
   * @see #getParameter_value()
   * @generated
   */
  void setParameter_value(EObject value);

} // ParameterState
