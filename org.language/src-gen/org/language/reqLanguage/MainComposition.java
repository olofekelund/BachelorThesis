/**
 */
package org.language.reqLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.language.reqLanguage.MainComposition#getSystem <em>System</em>}</li>
 *   <li>{@link org.language.reqLanguage.MainComposition#getSubsystemList <em>Subsystem List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.language.reqLanguage.ReqLanguagePackage#getMainComposition()
 * @model
 * @generated
 */
public interface MainComposition extends EObject
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
   * @see org.language.reqLanguage.ReqLanguagePackage#getMainComposition_System()
   * @model containment="true"
   * @generated
   */
  org.language.reqLanguage.System getSystem();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.MainComposition#getSystem <em>System</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System</em>' containment reference.
   * @see #getSystem()
   * @generated
   */
  void setSystem(org.language.reqLanguage.System value);

  /**
   * Returns the value of the '<em><b>Subsystem List</b></em>' containment reference list.
   * The list contents are of type {@link org.language.reqLanguage.System}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subsystem List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subsystem List</em>' containment reference list.
   * @see org.language.reqLanguage.ReqLanguagePackage#getMainComposition_SubsystemList()
   * @model containment="true"
   * @generated
   */
  EList<org.language.reqLanguage.System> getSubsystemList();

} // MainComposition
