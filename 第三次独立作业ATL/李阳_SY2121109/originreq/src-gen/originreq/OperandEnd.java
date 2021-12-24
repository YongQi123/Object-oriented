/**
 */
package originreq;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operand End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link originreq.OperandEnd#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see originreq.OriginreqPackage#getOperandEnd()
 * @model
 * @generated
 */
public interface OperandEnd extends MixOpAndCFEnd {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Operand)
	 * @see originreq.OriginreqPackage#getOperandEnd_Owner()
	 * @model
	 * @generated
	 */
	Operand getOwner();

	/**
	 * Sets the value of the '{@link originreq.OperandEnd#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Operand value);

} // OperandEnd
