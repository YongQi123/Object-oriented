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
	 * Returns a new object of class '<em>Ubiquitous</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ubiquitous</em>'.
	 * @generated
	 */
	Ubiquitous createUbiquitous();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response</em>'.
	 * @generated
	 */
	Response createResponse();

	/**
	 * Returns a new object of class '<em>Event Driven</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Driven</em>'.
	 * @generated
	 */
	EventDriven createEventDriven();

	/**
	 * Returns a new object of class '<em>Preconditions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preconditions</em>'.
	 * @generated
	 */
	Preconditions createPreconditions();

	/**
	 * Returns a new object of class '<em>Unwanted Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unwanted Behaviour</em>'.
	 * @generated
	 */
	UnwantedBehaviour createUnwantedBehaviour();

	/**
	 * Returns a new object of class '<em>State Driven</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Driven</em>'.
	 * @generated
	 */
	StateDriven createStateDriven();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Optional Features</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optional Features</em>'.
	 * @generated
	 */
	OptionalFeatures createOptionalFeatures();

	/**
	 * Returns a new object of class '<em>Feature Is</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Is</em>'.
	 * @generated
	 */
	FeatureIs createFeatureIs();

	/**
	 * Returns a new object of class '<em>Complex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex</em>'.
	 * @generated
	 */
	Complex createComplex();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EARSPackage getEARSPackage();

} //EARSFactory
