/**
 */
package eARS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Driven</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eARS.StateDriven#getWhile <em>While</em>}</li>
 * </ul>
 *
 * @see eARS.EARSPackage#getStateDriven()
 * @model
 * @generated
 */
public interface StateDriven extends Ubiquitous {
	/**
	 * Returns the value of the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While</em>' containment reference.
	 * @see #setWhile(State)
	 * @see eARS.EARSPackage#getStateDriven_While()
	 * @model containment="true"
	 * @generated
	 */
	State getWhile();

	/**
	 * Sets the value of the '{@link eARS.StateDriven#getWhile <em>While</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While</em>' containment reference.
	 * @see #getWhile()
	 * @generated
	 */
	void setWhile(State value);

} // StateDriven
