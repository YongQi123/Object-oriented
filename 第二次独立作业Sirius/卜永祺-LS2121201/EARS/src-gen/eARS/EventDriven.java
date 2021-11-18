/**
 */
package eARS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Driven</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eARS.EventDriven#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @see eARS.EARSPackage#getEventDriven()
 * @model
 * @generated
 */
public interface EventDriven extends Ubiquitous {
	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(Preconditions)
	 * @see eARS.EARSPackage#getEventDriven_When()
	 * @model containment="true"
	 * @generated
	 */
	Preconditions getWhen();

	/**
	 * Sets the value of the '{@link eARS.EventDriven#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(Preconditions value);

} // EventDriven
