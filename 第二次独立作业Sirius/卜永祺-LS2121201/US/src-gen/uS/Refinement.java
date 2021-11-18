/**
 */
package uS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uS.Refinement#getSource <em>Source</em>}</li>
 *   <li>{@link uS.Refinement#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see uS.USPackage#getRefinement()
 * @model abstract="true"
 * @generated
 */
public interface Refinement extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(UserStory)
	 * @see uS.USPackage#getRefinement_Source()
	 * @model
	 * @generated
	 */
	UserStory getSource();

	/**
	 * Sets the value of the '{@link uS.Refinement#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(UserStory value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(UserStory)
	 * @see uS.USPackage#getRefinement_Target()
	 * @model
	 * @generated
	 */
	UserStory getTarget();

	/**
	 * Sets the value of the '{@link uS.Refinement#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(UserStory value);

} // Refinement
