/**
 */
package userStory2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Story</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link userStory2.UserStory#getFeature <em>Feature</em>}</li>
 *   <li>{@link userStory2.UserStory#getScenario <em>Scenario</em>}</li>
 *   <li>{@link userStory2.UserStory#getName <em>Name</em>}</li>
 *   <li>{@link userStory2.UserStory#getRefinement <em>Refinement</em>}</li>
 * </ul>
 *
 * @see userStory2.UserStory2Package#getUserStory()
 * @model
 * @generated
 */
public interface UserStory extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see #setFeature(Feature)
	 * @see userStory2.UserStory2Package#getUserStory_Feature()
	 * @model containment="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link userStory2.UserStory#getFeature <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' containment reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' containment reference list.
	 * The list contents are of type {@link userStory2.Scenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' containment reference list.
	 * @see userStory2.UserStory2Package#getUserStory_Scenario()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scenario> getScenario();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see userStory2.UserStory2Package#getUserStory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link userStory2.UserStory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Refinement</b></em>' containment reference list.
	 * The list contents are of type {@link userStory2.Refinement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement</em>' containment reference list.
	 * @see userStory2.UserStory2Package#getUserStory_Refinement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Refinement> getRefinement();

} // UserStory
