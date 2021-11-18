/**
 */
package eARS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eARS.Complex#getIfthen <em>Ifthen</em>}</li>
 *   <li>{@link eARS.Complex#getWhile <em>While</em>}</li>
 *   <li>{@link eARS.Complex#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @see eARS.EARSPackage#getComplex()
 * @model
 * @generated
 */
public interface Complex extends Ubiquitous {
	/**
	 * Returns the value of the '<em><b>Ifthen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifthen</em>' containment reference.
	 * @see #setIfthen(Preconditions)
	 * @see eARS.EARSPackage#getComplex_Ifthen()
	 * @model containment="true"
	 * @generated
	 */
	Preconditions getIfthen();

	/**
	 * Sets the value of the '{@link eARS.Complex#getIfthen <em>Ifthen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifthen</em>' containment reference.
	 * @see #getIfthen()
	 * @generated
	 */
	void setIfthen(Preconditions value);

	/**
	 * Returns the value of the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While</em>' containment reference.
	 * @see #setWhile(State)
	 * @see eARS.EARSPackage#getComplex_While()
	 * @model containment="true"
	 * @generated
	 */
	State getWhile();

	/**
	 * Sets the value of the '{@link eARS.Complex#getWhile <em>While</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While</em>' containment reference.
	 * @see #getWhile()
	 * @generated
	 */
	void setWhile(State value);

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(FeatureIs)
	 * @see eARS.EARSPackage#getComplex_Where()
	 * @model containment="true"
	 * @generated
	 */
	FeatureIs getWhere();

	/**
	 * Sets the value of the '{@link eARS.Complex#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(FeatureIs value);

} // Complex
