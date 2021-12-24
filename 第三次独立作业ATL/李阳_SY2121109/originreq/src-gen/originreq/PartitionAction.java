/**
 */
package originreq;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link originreq.PartitionAction#getPatition <em>Patition</em>}</li>
 *   <li>{@link originreq.PartitionAction#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see originreq.OriginreqPackage#getPartitionAction()
 * @model
 * @generated
 */
public interface PartitionAction extends WorkflowExp {
	/**
	 * Returns the value of the '<em><b>Patition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patition</em>' reference.
	 * @see #setPatition(Participant)
	 * @see originreq.OriginreqPackage#getPartitionAction_Patition()
	 * @model
	 * @generated
	 */
	Participant getPatition();

	/**
	 * Sets the value of the '{@link originreq.PartitionAction#getPatition <em>Patition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patition</em>' reference.
	 * @see #getPatition()
	 * @generated
	 */
	void setPatition(Participant value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(JoinExp)
	 * @see originreq.OriginreqPackage#getPartitionAction_Action()
	 * @model
	 * @generated
	 */
	JoinExp getAction();

	/**
	 * Sets the value of the '{@link originreq.PartitionAction#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(JoinExp value);

} // PartitionAction
