/**
 */
package relational.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import relational.ColumnType;
import relational.RelationalFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Column Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColumnTypeTest extends TestCase {

	/**
	 * The fixture for this Column Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ColumnTypeTest.class);
	}

	/**
	 * Constructs a new Column Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Column Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ColumnType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Column Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnType getFixture() {
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
		setFixture(RelationalFactory.eINSTANCE.createColumnType());
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

} //ColumnTypeTest
