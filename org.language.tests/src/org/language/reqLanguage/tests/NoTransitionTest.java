/**
 */
package org.language.reqLanguage.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.language.reqLanguage.NoTransition;
import org.language.reqLanguage.ReqLanguageFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>No Transition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NoTransitionTest extends TestCase {

	/**
	 * The fixture for this No Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoTransition fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NoTransitionTest.class);
	}

	/**
	 * Constructs a new No Transition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoTransitionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this No Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NoTransition fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this No Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoTransition getFixture() {
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
		setFixture(ReqLanguageFactory.eINSTANCE.createNoTransition());
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

} //NoTransitionTest
