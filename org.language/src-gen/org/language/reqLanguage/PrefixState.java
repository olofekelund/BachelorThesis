/**
 */
package org.language.reqLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefix State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.language.reqLanguage.PrefixState#getPrefixFixedSyntax <em>Prefix Fixed Syntax</em>}</li>
 *   <li>{@link org.language.reqLanguage.PrefixState#getStateExpression <em>State Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.language.reqLanguage.ReqLanguagePackage#getPrefixState()
 * @model
 * @generated
 */
public interface PrefixState extends EObject
{
  /**
   * Returns the value of the '<em><b>Prefix Fixed Syntax</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix Fixed Syntax</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix Fixed Syntax</em>' attribute.
   * @see #setPrefixFixedSyntax(String)
   * @see org.language.reqLanguage.ReqLanguagePackage#getPrefixState_PrefixFixedSyntax()
   * @model
   * @generated
   */
  String getPrefixFixedSyntax();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.PrefixState#getPrefixFixedSyntax <em>Prefix Fixed Syntax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix Fixed Syntax</em>' attribute.
   * @see #getPrefixFixedSyntax()
   * @generated
   */
  void setPrefixFixedSyntax(String value);

  /**
   * Returns the value of the '<em><b>State Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Expression</em>' containment reference.
   * @see #setStateExpression(EObject)
   * @see org.language.reqLanguage.ReqLanguagePackage#getPrefixState_StateExpression()
   * @model containment="true"
   * @generated
   */
  EObject getStateExpression();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.PrefixState#getStateExpression <em>State Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Expression</em>' containment reference.
   * @see #getStateExpression()
   * @generated
   */
  void setStateExpression(EObject value);

} // PrefixState
