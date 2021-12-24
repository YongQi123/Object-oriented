/**
 */
package originreq;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link originreq.Actor#getLabel <em>Label</em>}</li>
 *   <li>{@link originreq.Actor#getSuperActor <em>Super Actor</em>}</li>
 *   <li>{@link originreq.Actor#getUc <em>Uc</em>}</li>
 * </ul>
 *
 * @see originreq.OriginreqPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends Participant {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see originreq.OriginreqPackage#getActor_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link originreq.Actor#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Super Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Actor</em>' reference.
	 * @see #setSuperActor(Actor)
	 * @see originreq.OriginreqPackage#getActor_SuperActor()
	 * @model
	 * @generated
	 */
	Actor getSuperActor();

	/**
	 * Sets the value of the '{@link originreq.Actor#getSuperActor <em>Super Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Actor</em>' reference.
	 * @see #getSuperActor()
	 * @generated
	 */
	void setSuperActor(Actor value);

	/**
	 * Returns the value of the '<em><b>Uc</b></em>' reference list.
	 * The list contents are of type {@link originreq.UC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uc</em>' reference list.
	 * @see originreq.OriginreqPackage#getActor_Uc()
	 * @model
	 * @generated
	 */
	EList<UC> getUc();

} // Actor
