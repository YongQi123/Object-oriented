/**
 */
package eARS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eARS.UB#getThe <em>The</em>}</li>
 *   <li>{@link eARS.UB#getShall <em>Shall</em>}</li>
 *   <li>{@link eARS.UB#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see eARS.EARSPackage#getUB()
 * @model
 * @generated
 */
public interface UB extends EObject {
	/**
	 * Returns the value of the '<em><b>The</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The</em>' containment reference.
	 * @see #setThe(SystemName)
	 * @see eARS.EARSPackage#getUB_The()
	 * @model containment="true"
	 * @generated
	 */
	SystemName getThe();

	/**
	 * Sets the value of the '{@link eARS.UB#getThe <em>The</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The</em>' containment reference.
	 * @see #getThe()
	 * @generated
	 */
	void setThe(SystemName value);

	/**
	 * Returns the value of the '<em><b>Shall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shall</em>' containment reference.
	 * @see #setShall(SystemResponse)
	 * @see eARS.EARSPackage#getUB_Shall()
	 * @model containment="true"
	 * @generated
	 */
	SystemResponse getShall();

	/**
	 * Sets the value of the '{@link eARS.UB#getShall <em>Shall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shall</em>' containment reference.
	 * @see #getShall()
	 * @generated
	 */
	void setShall(SystemResponse value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eARS.EARSPackage#getUB_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eARS.UB#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // UB
