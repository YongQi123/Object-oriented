/**
 */
package userStory2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link userStory2.Scenario#getGiven <em>Given</em>}</li>
 *   <li>{@link userStory2.Scenario#getWhen <em>When</em>}</li>
 *   <li>{@link userStory2.Scenario#getThen <em>Then</em>}</li>
 *   <li>{@link userStory2.Scenario#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see userStory2.UserStory2Package#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Given</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given</em>' containment reference.
	 * @see #setGiven(PreCondition)
	 * @see userStory2.UserStory2Package#getScenario_Given()
	 * @model containment="true"
	 * @generated
	 */
	PreCondition getGiven();

	/**
	 * Sets the value of the '{@link userStory2.Scenario#getGiven <em>Given</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Given</em>' containment reference.
	 * @see #getGiven()
	 * @generated
	 */
	void setGiven(PreCondition value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(Event)
	 * @see userStory2.UserStory2Package#getScenario_When()
	 * @model containment="true"
	 * @generated
	 */
	Event getWhen();

	/**
	 * Sets the value of the '{@link userStory2.Scenario#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(Event value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference list.
	 * The list contents are of type {@link userStory2.PostCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference list.
	 * @see userStory2.UserStory2Package#getScenario_Then()
	 * @model containment="true"
	 * @generated
	 */
	EList<PostCondition> getThen();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see userStory2.UserStory2Package#getScenario_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link userStory2.Scenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Scenario
