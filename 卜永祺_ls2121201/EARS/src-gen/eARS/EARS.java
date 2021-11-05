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
 *   <li>{@link eARS.EARS#getEv <em>Ev</em>}</li>
 *   <li>{@link eARS.EARS#getSt <em>St</em>}</li>
 *   <li>{@link eARS.EARS#getUw <em>Uw</em>}</li>
 *   <li>{@link eARS.EARS#getOp <em>Op</em>}</li>
 *   <li>{@link eARS.EARS#getHy <em>Hy</em>}</li>
 * </ul>
 *
 * @see eARS.EARSPackage#getEARS()
 * @model
 * @generated
 */
public interface EARS extends EObject {
	/**
	 * Returns the value of the '<em><b>Ub</b></em>' containment reference list.
	 * The list contents are of type {@link eARS.UB}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ub</em>' containment reference list.
	 * @see eARS.EARSPackage#getEARS_Ub()
	 * @model containment="true"
	 * @generated
	 */
	EList<UB> getUb();

	/**
	 * Returns the value of the '<em><b>Ev</b></em>' containment reference list.
	 * The list contents are of type {@link eARS.EV}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ev</em>' containment reference list.
	 * @see eARS.EARSPackage#getEARS_Ev()
	 * @model containment="true"
	 * @generated
	 */
	EList<EV> getEv();

	/**
	 * Returns the value of the '<em><b>St</b></em>' containment reference list.
	 * The list contents are of type {@link eARS.UW}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>St</em>' containment reference list.
	 * @see eARS.EARSPackage#getEARS_St()
	 * @model containment="true"
	 * @generated
	 */
	EList<UW> getSt();

	/**
	 * Returns the value of the '<em><b>Uw</b></em>' containment reference list.
	 * The list contents are of type {@link eARS.ST}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uw</em>' containment reference list.
	 * @see eARS.EARSPackage#getEARS_Uw()
	 * @model containment="true"
	 * @generated
	 */
	EList<ST> getUw();

	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference list.
	 * The list contents are of type {@link eARS.OP}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference list.
	 * @see eARS.EARSPackage#getEARS_Op()
	 * @model containment="true"
	 * @generated
	 */
	EList<OP> getOp();

	/**
	 * Returns the value of the '<em><b>Hy</b></em>' containment reference list.
	 * The list contents are of type {@link eARS.HY}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hy</em>' containment reference list.
	 * @see eARS.EARSPackage#getEARS_Hy()
	 * @model containment="true"
	 * @generated
	 */
	EList<HY> getHy();

} // EARS
