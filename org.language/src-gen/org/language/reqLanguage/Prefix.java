/**
 */
package org.language.reqLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.language.reqLanguage.Prefix#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link org.language.reqLanguage.Prefix#getPrefixList <em>Prefix List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.language.reqLanguage.ReqLanguagePackage#getPrefix()
 * @model
 * @generated
 */
public interface Prefix extends EObject
{
  /**
   * Returns the value of the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Operand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Operand</em>' containment reference.
   * @see #setLeftOperand(EObject)
   * @see org.language.reqLanguage.ReqLanguagePackage#getPrefix_LeftOperand()
   * @model containment="true"
   * @generated
   */
  EObject getLeftOperand();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.Prefix#getLeftOperand <em>Left Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Operand</em>' containment reference.
   * @see #getLeftOperand()
   * @generated
   */
  void setLeftOperand(EObject value);

  /**
   * Returns the value of the '<em><b>Prefix List</b></em>' containment reference list.
   * The list contents are of type {@link org.language.reqLanguage.PrefixRightOperand}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix List</em>' containment reference list.
   * @see org.language.reqLanguage.ReqLanguagePackage#getPrefix_PrefixList()
   * @model containment="true"
   * @generated
   */
  EList<PrefixRightOperand> getPrefixList();

} // Prefix
