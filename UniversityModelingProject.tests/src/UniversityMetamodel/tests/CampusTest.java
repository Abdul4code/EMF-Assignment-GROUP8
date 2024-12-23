/**
 */
package UniversityMetamodel.tests;

import UniversityMetamodel.Campus;
import UniversityMetamodel.UniversityMetamodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Campus</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CampusTest extends NamedEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CampusTest.class);
	}

	/**
	 * Constructs a new Campus test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CampusTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Campus test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Campus getFixture() {
		return (Campus)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UniversityMetamodelFactory.eINSTANCE.createCampus());
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

} //CampusTest
