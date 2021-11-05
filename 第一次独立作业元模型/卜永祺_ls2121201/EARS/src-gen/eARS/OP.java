/**
 */
package eARS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eARS.OP#getName <em>Name</em>}</li>
 *   <li>{@link eARS.OP#getWhere <em>Where</em>}</li>
 *   <li>{@link eARS.OP#getThe <em>The</em>}</li>
 *   <li>{@link eARS.OP#getShall <em>Shall</em>}</li>
 * </ul>
 *
 * @see eARS.EARSPackage#getOP()
 * @model
 * @generated
 */
public interface OP extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eARS.EARSPackage#getOP_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eARS.OP#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(FeatureIsIncluded)
	 * @see eARS.EARSPackage#getOP_Where()
	 * @model containment="true"
	 * @generated
	 */
	FeatureIsIncluded getWhere();

	/**
	 * Sets the value of the '{@link eARS.OP#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(FeatureIsIncluded value);

	/**
	 * Returns the value of the '<em><b>The</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The</em>' containment reference.
	 * @see #setThe(SystemName)
	 * @see eARS.EARSPackage#getOP_The()
	 * @model containment="true"
	 * @generated
	 */
	SystemName getThe();

	/**
	 * Sets the value of the '{@link eARS.OP#getThe <em>The</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The</em>' containment reference.
	 * @see #getThe()
	 * @generated
	 */
	void setThe(SystemName value);

	/**
	 * Returns the value of the '<em><b>Shall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shall</em>' containment reference.
	 * @see #setShall(SystemResponse)
	 * @see eARS.EARSPackage#getOP_Shall()
	 * @model containment="true"
	 * @generated
	 */
	SystemResponse getShall();

	/**
	 * Sets the value of the '{@link eARS.OP#getShall <em>Shall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shall</em>' containment reference.
	 * @see #getShall()
	 * @generated
	 */
	void setShall(SystemResponse value);

} // OP
