/**
 */
package org.language.reqLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.language.reqLanguage.User#getUser <em>User</em>}</li>
 *   <li>{@link org.language.reqLanguage.User#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.language.reqLanguage.ReqLanguagePackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject
{
  /**
   * Returns the value of the '<em><b>User</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User</em>' attribute.
   * @see #setUser(String)
   * @see org.language.reqLanguage.ReqLanguagePackage#getUser_User()
   * @model
   * @generated
   */
  String getUser();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.User#getUser <em>User</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User</em>' attribute.
   * @see #getUser()
   * @generated
   */
  void setUser(String value);

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
   * @see org.language.reqLanguage.ReqLanguagePackage#getUser_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.User#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // User
