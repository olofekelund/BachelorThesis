/**
 */
package org.language.reqLanguage.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.language.reqLanguage.PrefixEvent;
import org.language.reqLanguage.ReqLanguageFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Prefix Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrefixEventTest extends TestCase {

	/**
	 * The fixture for this Prefix Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrefixEvent fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrefixEventTest.class);
	}

	/**
	 * Constructs a new Prefix Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefixEventTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Prefix Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PrefixEvent fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Prefix Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrefixEvent getFixture() {
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
		setFixture(ReqLanguageFactory.eINSTANCE.createPrefixEvent());
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

} //PrefixEventTest
