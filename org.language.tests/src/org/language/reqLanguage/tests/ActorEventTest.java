/**
 */
package org.language.reqLanguage.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.language.reqLanguage.ActorEvent;
import org.language.reqLanguage.ReqLanguageFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Actor Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActorEventTest extends TestCase {

	/**
	 * The fixture for this Actor Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorEvent fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActorEventTest.class);
	}

	/**
	 * Constructs a new Actor Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorEventTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Actor Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ActorEvent fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Actor Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorEvent getFixture() {
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
		setFixture(ReqLanguageFactory.eINSTANCE.createActorEvent());
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

} //ActorEventTest
