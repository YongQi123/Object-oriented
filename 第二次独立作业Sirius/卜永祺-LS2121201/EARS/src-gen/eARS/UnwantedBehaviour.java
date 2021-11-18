/**
 */
package eARS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unwanted Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eARS.UnwantedBehaviour#getIf <em>If</em>}</li>
 * </ul>
 *
 * @see eARS.EARSPackage#getUnwantedBehaviour()
 * @model
 * @generated
 */
public interface UnwantedBehaviour extends Ubiquitous {
	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(Preconditions)
	 * @see eARS.EARSPackage#getUnwantedBehaviour_If()
	 * @model containment="true"
	 * @generated
	 */
	Preconditions getIf();

	/**
	 * Sets the value of the '{@link eARS.UnwantedBehaviour#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(Preconditions value);

} // UnwantedBehaviour
