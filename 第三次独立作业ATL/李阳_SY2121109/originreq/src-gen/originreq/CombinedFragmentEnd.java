/**
 */
package originreq;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combined Fragment End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link originreq.CombinedFragmentEnd#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see originreq.OriginreqPackage#getCombinedFragmentEnd()
 * @model
 * @generated
 */
public interface CombinedFragmentEnd extends MixOpAndCFEnd {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(CombinedFragment)
	 * @see originreq.OriginreqPackage#getCombinedFragmentEnd_Owner()
	 * @model
	 * @generated
	 */
	CombinedFragment getOwner();

	/**
	 * Sets the value of the '{@link originreq.CombinedFragmentEnd#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(CombinedFragment value);

} // CombinedFragmentEnd
