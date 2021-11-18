/**
 */
package eARS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EARS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eARS.EARS#getUb <em>Ub</em>}</li>
 * </ul>
 *
 * @see eARS.EARSPackage#getEARS()
 * @model
 * @generated
 */
public interface EARS extends EObject {
	/**
	 * Returns the value of the '<em><b>Ub</b></em>' containment reference list.
	 * The list contents are of type {@link eARS.Ubiquitous}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ub</em>' containment reference list.
	 * @see eARS.EARSPackage#getEARS_Ub()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ubiquitous> getUb();

} // EARS
