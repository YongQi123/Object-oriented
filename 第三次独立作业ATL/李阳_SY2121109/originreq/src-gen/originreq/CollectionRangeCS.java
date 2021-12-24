/**
 */
package originreq;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Range CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link originreq.CollectionRangeCS#getFirst <em>First</em>}</li>
 *   <li>{@link originreq.CollectionRangeCS#getLast <em>Last</em>}</li>
 * </ul>
 *
 * @see originreq.OriginreqPackage#getCollectionRangeCS()
 * @model
 * @generated
 */
public interface CollectionRangeCS extends CollectionLiteralPartCS {
	/**
	 * Returns the value of the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' containment reference.
	 * @see #setFirst(OCLExpressionCS)
	 * @see originreq.OriginreqPackage#getCollectionRangeCS_First()
	 * @model containment="true"
	 * @generated
	 */
	OCLExpressionCS getFirst();

	/**
	 * Sets the value of the '{@link originreq.CollectionRangeCS#getFirst <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' containment reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(OCLExpressionCS value);

	/**
	 * Returns the value of the '<em><b>Last</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last</em>' containment reference.
	 * @see #setLast(OCLExpressionCS)
	 * @see originreq.OriginreqPackage#getCollectionRangeCS_Last()
	 * @model containment="true"
	 * @generated
	 */
	OCLExpressionCS getLast();

	/**
	 * Sets the value of the '{@link originreq.CollectionRangeCS#getLast <em>Last</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last</em>' containment reference.
	 * @see #getLast()
	 * @generated
	 */
	void setLast(OCLExpressionCS value);

} // CollectionRangeCS
