/**
 */
package eARS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubiquitous</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eARS.Ubiquitous#getThe <em>The</em>}</li>
 *   <li>{@link eARS.Ubiquitous#getShall <em>Shall</em>}</li>
 *   <li>{@link eARS.Ubiquitous#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see eARS.EARSPackage#getUbiquitous()
 * @model
 * @generated
 */
public interface Ubiquitous extends EObject {
	/**
	 * Returns the value of the '<em><b>The</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The</em>' containment reference.
	 * @see #setThe(eARS.System)
	 * @see eARS.EARSPackage#getUbiquitous_The()
	 * @model containment="true"
	 * @generated
	 */
	eARS.System getThe();

	/**
	 * Sets the value of the '{@link eARS.Ubiquitous#getThe <em>The</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The</em>' containment reference.
	 * @see #getThe()
	 * @generated
	 */
	void setThe(eARS.System value);

	/**
	 * Returns the value of the '<em><b>Shall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shall</em>' containment reference.
	 * @see #setShall(Response)
	 * @see eARS.EARSPackage#getUbiquitous_Shall()
	 * @model containment="true"
	 * @generated
	 */
	Response getShall();

	/**
	 * Sets the value of the '{@link eARS.Ubiquitous#getShall <em>Shall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shall</em>' containment reference.
	 * @see #getShall()
	 * @generated
	 */
	void setShall(Response value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eARS.EARSPackage#getUbiquitous_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eARS.Ubiquitous#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Ubiquitous
