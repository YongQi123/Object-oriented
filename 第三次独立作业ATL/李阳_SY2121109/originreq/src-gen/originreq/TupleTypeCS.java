/**
 */
package originreq;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Type CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link originreq.TupleTypeCS#getName <em>Name</em>}</li>
 *   <li>{@link originreq.TupleTypeCS#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see originreq.OriginreqPackage#getTupleTypeCS()
 * @model
 * @generated
 */
public interface TupleTypeCS extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see originreq.OriginreqPackage#getTupleTypeCS_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link originreq.TupleTypeCS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link originreq.VariableDeclarationCS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see originreq.OriginreqPackage#getTupleTypeCS_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclarationCS> getVariables();

} // TupleTypeCS
