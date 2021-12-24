/**
 */
package originreq;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link originreq.Definition#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see originreq.OriginreqPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link originreq.VariableDeclarationCS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see originreq.OriginreqPackage#getDefinition_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclarationCS> getVariable();

} // Definition
