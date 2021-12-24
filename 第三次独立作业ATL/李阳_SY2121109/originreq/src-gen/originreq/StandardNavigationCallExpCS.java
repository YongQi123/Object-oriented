/**
 */
package originreq;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Navigation Call Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link originreq.StandardNavigationCallExpCS#getClassifercall <em>Classifercall</em>}</li>
 *   <li>{@link originreq.StandardNavigationCallExpCS#getPropertycall <em>Propertycall</em>}</li>
 *   <li>{@link originreq.StandardNavigationCallExpCS#getObject <em>Object</em>}</li>
 *   <li>{@link originreq.StandardNavigationCallExpCS#getNavop <em>Navop</em>}</li>
 *   <li>{@link originreq.StandardNavigationCallExpCS#getStandardOP <em>Standard OP</em>}</li>
 * </ul>
 *
 * @see originreq.OriginreqPackage#getStandardNavigationCallExpCS()
 * @model
 * @generated
 */
public interface StandardNavigationCallExpCS extends FeatureCallExpCS {
	/**
	 * Returns the value of the '<em><b>Classifercall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifercall</em>' containment reference.
	 * @see #setClassifercall(ClassiferCallExpCS)
	 * @see originreq.OriginreqPackage#getStandardNavigationCallExpCS_Classifercall()
	 * @model containment="true"
	 * @generated
	 */
	ClassiferCallExpCS getClassifercall();

	/**
	 * Sets the value of the '{@link originreq.StandardNavigationCallExpCS#getClassifercall <em>Classifercall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifercall</em>' containment reference.
	 * @see #getClassifercall()
	 * @generated
	 */
	void setClassifercall(ClassiferCallExpCS value);

	/**
	 * Returns the value of the '<em><b>Propertycall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propertycall</em>' containment reference.
	 * @see #setPropertycall(PropertyCallExpCS)
	 * @see originreq.OriginreqPackage#getStandardNavigationCallExpCS_Propertycall()
	 * @model containment="true"
	 * @generated
	 */
	PropertyCallExpCS getPropertycall();

	/**
	 * Sets the value of the '{@link originreq.StandardNavigationCallExpCS#getPropertycall <em>Propertycall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propertycall</em>' containment reference.
	 * @see #getPropertycall()
	 * @generated
	 */
	void setPropertycall(PropertyCallExpCS value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see #setObject(String)
	 * @see originreq.OriginreqPackage#getStandardNavigationCallExpCS_Object()
	 * @model
	 * @generated
	 */
	String getObject();

	/**
	 * Sets the value of the '{@link originreq.StandardNavigationCallExpCS#getObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(String value);

	/**
	 * Returns the value of the '<em><b>Navop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navop</em>' attribute.
	 * @see #setNavop(String)
	 * @see originreq.OriginreqPackage#getStandardNavigationCallExpCS_Navop()
	 * @model
	 * @generated
	 */
	String getNavop();

	/**
	 * Sets the value of the '{@link originreq.StandardNavigationCallExpCS#getNavop <em>Navop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navop</em>' attribute.
	 * @see #getNavop()
	 * @generated
	 */
	void setNavop(String value);

	/**
	 * Returns the value of the '<em><b>Standard OP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard OP</em>' containment reference.
	 * @see #setStandardOP(StandardCollectionOperation)
	 * @see originreq.OriginreqPackage#getStandardNavigationCallExpCS_StandardOP()
	 * @model containment="true"
	 * @generated
	 */
	StandardCollectionOperation getStandardOP();

	/**
	 * Sets the value of the '{@link originreq.StandardNavigationCallExpCS#getStandardOP <em>Standard OP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard OP</em>' containment reference.
	 * @see #getStandardOP()
	 * @generated
	 */
	void setStandardOP(StandardCollectionOperation value);

} // StandardNavigationCallExpCS
