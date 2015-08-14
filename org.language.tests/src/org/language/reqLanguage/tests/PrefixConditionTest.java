/**
 */
package org.language.reqLanguage.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.language.reqLanguage.PrefixCondition;
import org.language.reqLanguage.ReqLanguageFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Prefix Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrefixConditionTest extends TestCase {

	/**
	 * The fixture for this Prefix Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrefixCondition fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrefixConditionTest.class);
	}

	/**
	 * Constructs a new Prefix Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefixConditionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Prefix Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PrefixCondition fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Prefix Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrefixCondition getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReqLanguageFactory.eINSTANCE.createPrefixCondition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PrefixConditionTest
