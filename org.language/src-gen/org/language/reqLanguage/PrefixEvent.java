/**
 */
package org.language.reqLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefix Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.language.reqLanguage.PrefixEvent#getPrefixFixedSyntax <em>Prefix Fixed Syntax</em>}</li>
 *   <li>{@link org.language.reqLanguage.PrefixEvent#getEvent_expression <em>Event expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.language.reqLanguage.ReqLanguagePackage#getPrefixEvent()
 * @model
 * @generated
 */
public interface PrefixEvent extends EObject
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
   * @see org.language.reqLanguage.ReqLanguagePackage#getPrefixEvent_PrefixFixedSyntax()
   * @model
   * @generated
   */
  String getPrefixFixedSyntax();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.PrefixEvent#getPrefixFixedSyntax <em>Prefix Fixed Syntax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix Fixed Syntax</em>' attribute.
   * @see #getPrefixFixedSyntax()
   * @generated
   */
  void setPrefixFixedSyntax(String value);

  /**
   * Returns the value of the '<em><b>Event expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event expression</em>' containment reference.
   * @see #setEvent_expression(EObject)
   * @see org.language.reqLanguage.ReqLanguagePackage#getPrefixEvent_Event_expression()
   * @model containment="true"
   * @generated
   */
  EObject getEvent_expression();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.PrefixEvent#getEvent_expression <em>Event expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event expression</em>' containment reference.
   * @see #getEvent_expression()
   * @generated
   */
  void setEvent_expression(EObject value);

} // PrefixEvent
