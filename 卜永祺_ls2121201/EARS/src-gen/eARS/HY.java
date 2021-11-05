/**
 */
package eARS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HY</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eARS.HY#getName <em>Name</em>}</li>
 *   <li>{@link eARS.HY#getIfthen <em>Ifthen</em>}</li>
 *   <li>{@link eARS.HY#getShall <em>Shall</em>}</li>
 *   <li>{@link eARS.HY#getThe <em>The</em>}</li>
 *   <li>{@link eARS.HY#getWhile <em>While</em>}</li>
 *   <li>{@link eARS.HY#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @see eARS.EARSPackage#getHY()
 * @model
 * @generated
 */
public interface HY extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eARS.EARSPackage#getHY_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eARS.HY#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While</em>' containment reference.
	 * @see #setWhile(InASpecificState)
	 * @see eARS.EARSPackage#getHY_While()
	 * @model containment="true"
	 * @generated
	 */
	InASpecificState getWhile();

	/**
	 * Sets the value of the '{@link eARS.HY#getWhile <em>While</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While</em>' containment reference.
	 * @see #getWhile()
	 * @generated
	 */
	void setWhile(InASpecificState value);

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(FeatureIsIncluded)
	 * @see eARS.EARSPackage#getHY_Where()
	 * @model containment="true"
	 * @generated
	 */
	FeatureIsIncluded getWhere();

	/**
	 * Sets the value of the '{@link eARS.HY#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(FeatureIsIncluded value);

	/**
	 * Returns the value of the '<em><b>Shall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shall</em>' containment reference.
	 * @see #setShall(SystemResponse)
	 * @see eARS.EARSPackage#getHY_Shall()
	 * @model containment="true"
	 * @generated
	 */
	SystemResponse getShall();

	/**
	 * Sets the value of the '{@link eARS.HY#getShall <em>Shall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shall</em>' containment reference.
	 * @see #getShall()
	 * @generated
	 */
	void setShall(SystemResponse value);

	/**
	 * Returns the value of the '<em><b>The</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The</em>' containment reference.
	 * @see #setThe(SystemName)
	 * @see eARS.EARSPackage#getHY_The()
	 * @model containment="true"
	 * @generated
	 */
	SystemName getThe();

	/**
	 * Sets the value of the '{@link eARS.HY#getThe <em>The</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The</em>' containment reference.
	 * @see #getThe()
	 * @generated
	 */
	void setThe(SystemName value);

	/**
	 * Returns the value of the '<em><b>Ifthen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifthen</em>' containment reference.
	 * @see #setIfthen(OptionalPreconditions)
	 * @see eARS.EARSPackage#getHY_Ifthen()
	 * @model containment="true"
	 * @generated
	 */
	OptionalPreconditions getIfthen();

	/**
	 * Sets the value of the '{@link eARS.HY#getIfthen <em>Ifthen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifthen</em>' containment reference.
	 * @see #getIfthen()
	 * @generated
	 */
	void setIfthen(OptionalPreconditions value);

} // HY
