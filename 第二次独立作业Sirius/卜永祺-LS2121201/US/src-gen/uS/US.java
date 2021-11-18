/**
 */
package uS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>US</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uS.US#getUserstory <em>Userstory</em>}</li>
 *   <li>{@link uS.US#getRole <em>Role</em>}</li>
 *   <li>{@link uS.US#getRefinement <em>Refinement</em>}</li>
 * </ul>
 *
 * @see uS.USPackage#getUS()
 * @model
 * @generated
 */
public interface US extends EObject {
	/**
	 * Returns the value of the '<em><b>Userstory</b></em>' containment reference list.
	 * The list contents are of type {@link uS.UserStory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userstory</em>' containment reference list.
	 * @see uS.USPackage#getUS_Userstory()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserStory> getUserstory();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link uS.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see uS.USPackage#getUS_Role()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRole();

	/**
	 * Returns the value of the '<em><b>Refinement</b></em>' containment reference list.
	 * The list contents are of type {@link uS.Refinement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement</em>' containment reference list.
	 * @see uS.USPackage#getUS_Refinement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Refinement> getRefinement();

} // US
