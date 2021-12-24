/**
 */
package originreq;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Call Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link originreq.PropertyCallExpCS#getName <em>Name</em>}</li>
 *   <li>{@link originreq.PropertyCallExpCS#getSelfproperty <em>Selfproperty</em>}</li>
 *   <li>{@link originreq.PropertyCallExpCS#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link originreq.PropertyCallExpCS#getPremark <em>Premark</em>}</li>
 * </ul>
 *
 * @see originreq.OriginreqPackage#getPropertyCallExpCS()
 * @model
 * @generated
 */
public interface PropertyCallExpCS extends FeatureCallExpCS {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(VariableExpCS)
	 * @see originreq.OriginreqPackage#getPropertyCallExpCS_Name()
	 * @model containment="true"
	 * @generated
	 */
	VariableExpCS getName();

	/**
	 * Sets the value of the '{@link originreq.PropertyCallExpCS#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(VariableExpCS value);

	/**
	 * Returns the value of the '<em><b>Selfproperty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selfproperty</em>' containment reference.
	 * @see #setSelfproperty(VariableExpCS)
	 * @see originreq.OriginreqPackage#getPropertyCallExpCS_Selfproperty()
	 * @model containment="true"
	 * @generated
	 */
	VariableExpCS getSelfproperty();

	/**
	 * Sets the value of the '{@link originreq.PropertyCallExpCS#getSelfproperty <em>Selfproperty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selfproperty</em>' containment reference.
	 * @see #getSelfproperty()
	 * @generated
	 */
	void setSelfproperty(VariableExpCS value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute.
	 * @see #setAttribute(String)
	 * @see originreq.OriginreqPackage#getPropertyCallExpCS_Attribute()
	 * @model
	 * @generated
	 */
	String getAttribute();

	/**
	 * Sets the value of the '{@link originreq.PropertyCallExpCS#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' attribute.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(String value);

	/**
	 * Returns the value of the '<em><b>Premark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Premark</em>' attribute.
	 * @see #setPremark(String)
	 * @see originreq.OriginreqPackage#getPropertyCallExpCS_Premark()
	 * @model
	 * @generated
	 */
	String getPremark();

	/**
	 * Sets the value of the '{@link originreq.PropertyCallExpCS#getPremark <em>Premark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premark</em>' attribute.
	 * @see #getPremark()
	 * @generated
	 */
	void setPremark(String value);

} // PropertyCallExpCS
