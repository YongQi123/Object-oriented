/**
 */
package userStory2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Then</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link userStory2.Then#getAnd <em>And</em>}</li>
 *   <li>{@link userStory2.Then#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see userStory2.UserStory2Package#getThen()
 * @model
 * @generated
 */
public interface Then extends EObject {
	/**
	 * Returns the value of the '<em><b>And</b></em>' containment reference list.
	 * The list contents are of type {@link userStory2.And}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' containment reference list.
	 * @see userStory2.UserStory2Package#getThen_And()
	 * @model containment="true"
	 * @generated
	 */
	EList<And> getAnd();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see userStory2.UserStory2Package#getThen_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link userStory2.Then#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Then
