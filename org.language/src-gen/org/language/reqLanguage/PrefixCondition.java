/**
 */
package org.language.reqLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefix Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.language.reqLanguage.PrefixCondition#getPrefixFixedSyntax <em>Prefix Fixed Syntax</em>}</li>
 *   <li>{@link org.language.reqLanguage.PrefixCondition#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.language.reqLanguage.PrefixCondition#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.language.reqLanguage.PrefixCondition#getValue <em>Value</em>}</li>
 *   <li>{@link org.language.reqLanguage.PrefixCondition#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.language.reqLanguage.ReqLanguagePackage#getPrefixCondition()
 * @model
 * @generated
 */
public interface PrefixCondition extends EObject
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
   * @see org.language.reqLanguage.ReqLanguagePackage#getPrefixCondition_PrefixFixedSyntax()
   * @model
   * @generated
   */
  String getPrefixFixedSyntax();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.PrefixCondition#getPrefixFixedSyntax <em>Prefix Fixed Syntax</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix Fixed Syntax</em>' attribute.
   * @see #getPrefixFixedSyntax()
   * @generated
   */
  void setPrefixFixedSyntax(String value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(EObject)
   * @see org.language.reqLanguage.ReqLanguagePackage#getPrefixCondition_Parameter()
   * @model containment="true"
   * @generated
   */
  EObject getParameter();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.PrefixCondition#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(EObject value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' containment reference.
   * @see #setOperator(Operator)
   * @see org.language.reqLanguage.ReqLanguagePackage#getPrefixCondition_Operator()
   * @model containment="true"
   * @generated
   */
  Operator getOperator();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.PrefixCondition#getOperator <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' containment reference.
   * @see #getOperator()
   * @generated
   */
  void setOperator(Operator value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Value)
   * @see org.language.reqLanguage.ReqLanguagePackage#getPrefixCondition_Value()
   * @model containment="true"
   * @generated
   */
  Value getValue();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.PrefixCondition#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Value value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' containment reference.
   * @see #setTime(TimingConstraint)
   * @see org.language.reqLanguage.ReqLanguagePackage#getPrefixCondition_Time()
   * @model containment="true"
   * @generated
   */
  TimingConstraint getTime();

  /**
   * Sets the value of the '{@link org.language.reqLanguage.PrefixCondition#getTime <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' containment reference.
   * @see #getTime()
   * @generated
   */
  void setTime(TimingConstraint value);

} // PrefixCondition
