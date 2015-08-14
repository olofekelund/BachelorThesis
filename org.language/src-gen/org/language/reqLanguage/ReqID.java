/**
 */
package org.language.reqLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Req ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.language.reqLanguage.ReqID#getReqID <em>Req ID</em>}</li>
 *   <li>{@link org.language.reqLanguage.ReqID#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.language.reqLanguage.ReqLanguagePackage#getReqID()
 * @model
 * @generated
 */
public interface ReqID extends EObject
{
  /**
   * Returns the value of the '<em><b>Req ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Req ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Req ID</em>' attribute.
   * @see #setReqID(String)
   * @see org.language.reqLanguage.ReqLanguagePackage#getReqID_ReqID()
   * @model
   * @generated
   */
  String getReqID();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.ReqID#getReqID <em>Req ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Req ID</em>' attribute.
   * @see #getReqID()
   * @generated
   */
  void setReqID(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.language.reqLanguage.ReqLanguagePackage#getReqID_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.ReqID#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // ReqID
