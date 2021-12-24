/**
 */
package originreq;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fork Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link originreq.ForkNode#getStartlinks <em>Startlinks</em>}</li>
 * </ul>
 *
 * @see originreq.OriginreqPackage#getForkNode()
 * @model
 * @generated
 */
public interface ForkNode extends WorkflowExp {
	/**
	 * Returns the value of the '<em><b>Startlinks</b></em>' reference list.
	 * The list contents are of type {@link originreq.JoinExp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startlinks</em>' reference list.
	 * @see originreq.OriginreqPackage#getForkNode_Startlinks()
	 * @model
	 * @generated
	 */
	EList<JoinExp> getStartlinks();

} // ForkNode
