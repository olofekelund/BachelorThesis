/**
 */
package org.language.reqLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefix Right Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.language.reqLanguage.PrefixRightOperand#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.language.reqLanguage.PrefixRightOperand#getPrefixRightOperand <em>Prefix Right Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.language.reqLanguage.ReqLanguagePackage#getPrefixRightOperand()
 * @model
 * @generated
 */
public interface PrefixRightOperand extends EObject
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see org.language.reqLanguage.ReqLanguagePackage#getPrefixRightOperand_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.PrefixRightOperand#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Prefix Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix Right Operand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix Right Operand</em>' containment reference.
   * @see #setPrefixRightOperand(EObject)
   * @see org.language.reqLanguage.ReqLanguagePackage#getPrefixRightOperand_PrefixRightOperand()
   * @model containment="true"
   * @generated
   */
  EObject getPrefixRightOperand();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.PrefixRightOperand#getPrefixRightOperand <em>Prefix Right Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix Right Operand</em>' containment reference.
   * @see #getPrefixRightOperand()
   * @generated
   */
  void setPrefixRightOperand(EObject value);

} // PrefixRightOperand
