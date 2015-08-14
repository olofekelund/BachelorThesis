/**
 */
package org.language.reqLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.language.reqLanguage.ActorEvent#getActor <em>Actor</em>}</li>
 *   <li>{@link org.language.reqLanguage.ActorEvent#getAction <em>Action</em>}</li>
 *   <li>{@link org.language.reqLanguage.ActorEvent#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.language.reqLanguage.ReqLanguagePackage#getActorEvent()
 * @model
 * @generated
 */
public interface ActorEvent extends EObject
{
  /**
   * Returns the value of the '<em><b>Actor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actor</em>' containment reference.
   * @see #setActor(EObject)
   * @see org.language.reqLanguage.ReqLanguagePackage#getActorEvent_Actor()
   * @model containment="true"
   * @generated
   */
  EObject getActor();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.ActorEvent#getActor <em>Actor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actor</em>' containment reference.
   * @see #getActor()
   * @generated
   */
  void setActor(EObject value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' attribute.
   * @see #setAction(String)
   * @see org.language.reqLanguage.ReqLanguagePackage#getActorEvent_Action()
   * @model
   * @generated
   */
  String getAction();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.ActorEvent#getAction <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' attribute.
   * @see #getAction()
   * @generated
   */
  void setAction(String value);

  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference.
   * @see #setEntity(Parameter)
   * @see org.language.reqLanguage.ReqLanguagePackage#getActorEvent_Entity()
   * @model containment="true"
   * @generated
   */
  Parameter getEntity();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.ActorEvent#getEntity <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' containment reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(Parameter value);

} // ActorEvent
