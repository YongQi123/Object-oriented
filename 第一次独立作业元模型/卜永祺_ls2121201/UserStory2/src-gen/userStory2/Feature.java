/**
 */
package userStory2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link userStory2.Feature#getAsa <em>Asa</em>}</li>
 *   <li>{@link userStory2.Feature#getIwantto <em>Iwantto</em>}</li>
 *   <li>{@link userStory2.Feature#getInorderto <em>Inorderto</em>}</li>
 *   <li>{@link userStory2.Feature#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see userStory2.UserStory2Package#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject {
	/**
	 * Returns the value of the '<em><b>Asa</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asa</em>' containment reference.
	 * @see #setAsa(Role)
	 * @see userStory2.UserStory2Package#getFeature_Asa()
	 * @model containment="true"
	 * @generated
	 */
	Role getAsa();

	/**
	 * Sets the value of the '{@link userStory2.Feature#getAsa <em>Asa</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asa</em>' containment reference.
	 * @see #getAsa()
	 * @generated
	 */
	void setAsa(Role value);

	/**
	 * Returns the value of the '<em><b>Iwantto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iwantto</em>' containment reference.
	 * @see #setIwantto(Goal)
	 * @see userStory2.UserStory2Package#getFeature_Iwantto()
	 * @model containment="true"
	 * @generated
	 */
	Goal getIwantto();

	/**
	 * Sets the value of the '{@link userStory2.Feature#getIwantto <em>Iwantto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iwantto</em>' containment reference.
	 * @see #getIwantto()
	 * @generated
	 */
	void setIwantto(Goal value);

	/**
	 * Returns the value of the '<em><b>Inorderto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inorderto</em>' containment reference.
	 * @see #setInorderto(Earning)
	 * @see userStory2.UserStory2Package#getFeature_Inorderto()
	 * @model containment="true"
	 * @generated
	 */
	Earning getInorderto();

	/**
	 * Sets the value of the '{@link userStory2.Feature#getInorderto <em>Inorderto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inorderto</em>' containment reference.
	 * @see #getInorderto()
	 * @generated
	 */
	void setInorderto(Earning value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see userStory2.UserStory2Package#getFeature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link userStory2.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Feature
