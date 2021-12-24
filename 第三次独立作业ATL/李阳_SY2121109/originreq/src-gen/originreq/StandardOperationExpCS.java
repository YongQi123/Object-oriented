/**
 */
package originreq;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Operation Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link originreq.StandardOperationExpCS#getObject <em>Object</em>}</li>
 *   <li>{@link originreq.StandardOperationExpCS#getProperty <em>Property</em>}</li>
 *   <li>{@link originreq.StandardOperationExpCS#getPremark <em>Premark</em>}</li>
 *   <li>{@link originreq.StandardOperationExpCS#getPredefinedop <em>Predefinedop</em>}</li>
 * </ul>
 *
 * @see originreq.OriginreqPackage#getStandardOperationExpCS()
 * @model
 * @generated
 */
public interface StandardOperationExpCS extends FeatureCallExpCS {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(VariableExpCS)
	 * @see originreq.OriginreqPackage#getStandardOperationExpCS_Object()
	 * @model containment="true"
	 * @generated
	 */
	VariableExpCS getObject();

	/**
	 * Sets the value of the '{@link originreq.StandardOperationExpCS#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(VariableExpCS value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(VariableExpCS)
	 * @see originreq.OriginreqPackage#getStandardOperationExpCS_Property()
	 * @model containment="true"
	 * @generated
	 */
	VariableExpCS getProperty();

	/**
	 * Sets the value of the '{@link originreq.StandardOperationExpCS#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(VariableExpCS value);

	/**
	 * Returns the value of the '<em><b>Premark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Premark</em>' attribute.
	 * @see #setPremark(String)
	 * @see originreq.OriginreqPackage#getStandardOperationExpCS_Premark()
	 * @model
	 * @generated
	 */
	String getPremark();

	/**
	 * Sets the value of the '{@link originreq.StandardOperationExpCS#getPremark <em>Premark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premark</em>' attribute.
	 * @see #getPremark()
	 * @generated
	 */
	void setPremark(String value);

	/**
	 * Returns the value of the '<em><b>Predefinedop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefinedop</em>' containment reference.
	 * @see #setPredefinedop(PredefineOp)
	 * @see originreq.OriginreqPackage#getStandardOperationExpCS_Predefinedop()
	 * @model containment="true"
	 * @generated
	 */
	PredefineOp getPredefinedop();

	/**
	 * Sets the value of the '{@link originreq.StandardOperationExpCS#getPredefinedop <em>Predefinedop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefinedop</em>' containment reference.
	 * @see #getPredefinedop()
	 * @generated
	 */
	void setPredefinedop(PredefineOp value);

} // StandardOperationExpCS
