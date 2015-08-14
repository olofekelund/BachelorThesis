/**
 */
package org.language.reqLanguage.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.language.reqLanguage.ReqLanguageFactory;
import org.language.reqLanguage.TimingConstraint;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Timing Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimingConstraintTest extends TestCase {

	/**
	 * The fixture for this Timing Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingConstraint fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimingConstraintTest.class);
	}

	/**
	 * Constructs a new Timing Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingConstraintTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Timing Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TimingConstraint fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Timing Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingConstraint getFixture() {
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
		setFixture(ReqLanguageFactory.eINSTANCE.createTimingConstraint());
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

} //TimingConstraintTest
