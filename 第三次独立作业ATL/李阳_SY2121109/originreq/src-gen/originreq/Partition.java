/**
 */
package originreq;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link originreq.Partition#getName <em>Name</em>}</li>
 *   <li>{@link originreq.Partition#getExps <em>Exps</em>}</li>
 * </ul>
 *
 * @see originreq.OriginreqPackage#getPartition()
 * @model
 * @generated
 */
public interface Partition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(Participant)
	 * @see originreq.OriginreqPackage#getPartition_Name()
	 * @model
	 * @generated
	 */
	Participant getName();

	/**
	 * Sets the value of the '{@link originreq.Partition#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Participant value);

	/**
	 * Returns the value of the '<em><b>Exps</b></em>' containment reference list.
	 * The list contents are of type {@link originreq.WorkflowExp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exps</em>' containment reference list.
	 * @see originreq.OriginreqPackage#getPartition_Exps()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkflowExp> getExps();

} // Partition
