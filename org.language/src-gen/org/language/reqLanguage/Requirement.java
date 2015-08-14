/**
 */
package org.language.reqLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.language.reqLanguage.Requirement#getReqID <em>Req ID</em>}</li>
 *   <li>{@link org.language.reqLanguage.Requirement#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.language.reqLanguage.Requirement#getMainRequirement <em>Main Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.language.reqLanguage.ReqLanguagePackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends EObject
{
  /**
   * Returns the value of the '<em><b>Req ID</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Req ID</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Req ID</em>' containment reference.
   * @see #setReqID(ReqID)
   * @see org.language.reqLanguage.ReqLanguagePackage#getRequirement_ReqID()
   * @model containment="true"
   * @generated
   */
  ReqID getReqID();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.Requirement#getReqID <em>Req ID</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Req ID</em>' containment reference.
   * @see #getReqID()
   * @generated
   */
  void setReqID(ReqID value);

  /**
   * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' containment reference.
   * @see #setPrefix(Prefix)
   * @see org.language.reqLanguage.ReqLanguagePackage#getRequirement_Prefix()
   * @model containment="true"
   * @generated
   */
  Prefix getPrefix();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.Requirement#getPrefix <em>Prefix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix</em>' containment reference.
   * @see #getPrefix()
   * @generated
   */
  void setPrefix(Prefix value);

  /**
   * Returns the value of the '<em><b>Main Requirement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main Requirement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main Requirement</em>' containment reference.
   * @see #setMainRequirement(EObject)
   * @see org.language.reqLanguage.ReqLanguagePackage#getRequirement_MainRequirement()
   * @model containment="true"
   * @generated
   */
  EObject getMainRequirement();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.Requirement#getMainRequirement <em>Main Requirement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main Requirement</em>' containment reference.
   * @see #getMainRequirement()
   * @generated
   */
  void setMainRequirement(EObject value);

} // Requirement
