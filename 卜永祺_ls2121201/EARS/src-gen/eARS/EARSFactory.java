/**
 */
package eARS;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eARS.EARSPackage
 * @generated
 */
public interface EARSFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EARSFactory eINSTANCE = eARS.impl.EARSFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EARS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EARS</em>'.
	 * @generated
	 */
	EARS createEARS();

	/**
	 * Returns a new object of class '<em>UB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UB</em>'.
	 * @generated
	 */
	UB createUB();

	/**
	 * Returns a new object of class '<em>System Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Name</em>'.
	 * @generated
	 */
	SystemName createSystemName();

	/**
	 * Returns a new object of class '<em>System Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Response</em>'.
	 * @generated
	 */
	SystemResponse createSystemResponse();

	/**
	 * Returns a new object of class '<em>EV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EV</em>'.
	 * @generated
	 */
	EV createEV();

	/**
	 * Returns a new object of class '<em>Optional Preconditions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optional Preconditions</em>'.
	 * @generated
	 */
	OptionalPreconditions createOptionalPreconditions();

	/**
	 * Returns a new object of class '<em>ST</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ST</em>'.
	 * @generated
	 */
	ST createST();

	/**
	 * Returns a new object of class '<em>In ASpecific State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In ASpecific State</em>'.
	 * @generated
	 */
	InASpecificState createInASpecificState();

	/**
	 * Returns a new object of class '<em>UW</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UW</em>'.
	 * @generated
	 */
	UW createUW();

	/**
	 * Returns a new object of class '<em>OP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OP</em>'.
	 * @generated
	 */
	OP createOP();

	/**
	 * Returns a new object of class '<em>Feature Is Included</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Is Included</em>'.
	 * @generated
	 */
	FeatureIsIncluded createFeatureIsIncluded();

	/**
	 * Returns a new object of class '<em>HY</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HY</em>'.
	 * @generated
	 */
	HY createHY();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EARSPackage getEARSPackage();

} //EARSFactory
