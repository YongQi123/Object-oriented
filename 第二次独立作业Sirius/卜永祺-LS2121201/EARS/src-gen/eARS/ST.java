/**
 */
package eARS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ST</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eARS.ST#getName <em>Name</em>}</li>
 *   <li>{@link eARS.ST#getWhile <em>While</em>}</li>
 *   <li>{@link eARS.ST#getShall <em>Shall</em>}</li>
 *   <li>{@link eARS.ST#getThe <em>The</em>}</li>
 * </ul>
 *
 * @see eARS.EARSPackage#getST()
 * @model
 * @generated
 */
public interface ST extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eARS.EARSPackage#getST_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eARS.ST#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While</em>' containment reference.
	 * @see #setWhile(InASpecificState)
	 * @see eARS.EARSPackage#getST_While()
	 * @model containment="true"
	 * @generated
	 */
	InASpecificState getWhile();

	/**
	 * Sets the value of the '{@link eARS.ST#getWhile <em>While</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While</em>' containment reference.
	 * @see #getWhile()
	 * @generated
	 */
	void setWhile(InASpecificState value);

	/**
	 * Returns the value of the '<em><b>Shall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shall</em>' containment reference.
	 * @see #setShall(SystemResponse)
	 * @see eARS.EARSPackage#getST_Shall()
	 * @model containment="true"
	 * @generated
	 */
	SystemResponse getShall();

	/**
	 * Sets the value of the '{@link eARS.ST#getShall <em>Shall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shall</em>' containment reference.
	 * @see #getShall()
	 * @generated
	 */
	void setShall(SystemResponse value);

	/**
	 * Returns the value of the '<em><b>The</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The</em>' containment reference.
	 * @see #setThe(SystemName)
	 * @see eARS.EARSPackage#getST_The()
	 * @model containment="true"
	 * @generated
	 */
	SystemName getThe();

	/**
	 * Sets the value of the '{@link eARS.ST#getThe <em>The</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The</em>' containment reference.
	 * @see #getThe()
	 * @generated
	 */
	void setThe(SystemName value);

} // ST
