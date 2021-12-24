/**
 */
package originreq;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link originreq.Execution#getOwner <em>Owner</em>}</li>
 *   <li>{@link originreq.Execution#getStart <em>Start</em>}</li>
 *   <li>{@link originreq.Execution#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see originreq.OriginreqPackage#getExecution()
 * @model
 * @generated
 */
public interface Execution extends MultiEnd {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Participant)
	 * @see originreq.OriginreqPackage#getExecution_Owner()
	 * @model
	 * @generated
	 */
	Participant getOwner();

	/**
	 * Sets the value of the '{@link originreq.Execution#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Participant value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(ExecutionEnd)
	 * @see originreq.OriginreqPackage#getExecution_Start()
	 * @model
	 * @generated
	 */
	ExecutionEnd getStart();

	/**
	 * Sets the value of the '{@link originreq.Execution#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(ExecutionEnd value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(ExecutionEnd)
	 * @see originreq.OriginreqPackage#getExecution_End()
	 * @model
	 * @generated
	 */
	ExecutionEnd getEnd();

	/**
	 * Sets the value of the '{@link originreq.Execution#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(ExecutionEnd value);

} // Execution
