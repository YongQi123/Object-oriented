/**
 */
package originreq;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link originreq.UC#getName <em>Name</em>}</li>
 *   <li>{@link originreq.UC#getLabel <em>Label</em>}</li>
 *   <li>{@link originreq.UC#getUCRelation <em>UC Relation</em>}</li>
 *   <li>{@link originreq.UC#getRelateduc <em>Relateduc</em>}</li>
 *   <li>{@link originreq.UC#getSsd <em>Ssd</em>}</li>
 *   <li>{@link originreq.UC#getService <em>Service</em>}</li>
 *   <li>{@link originreq.UC#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see originreq.OriginreqPackage#getUC()
 * @model
 * @generated
 */
public interface UC extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see originreq.OriginreqPackage#getUC_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link originreq.UC#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see originreq.OriginreqPackage#getUC_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link originreq.UC#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>UC Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UC Relation</em>' attribute.
	 * @see #setUCRelation(String)
	 * @see originreq.OriginreqPackage#getUC_UCRelation()
	 * @model
	 * @generated
	 */
	String getUCRelation();

	/**
	 * Sets the value of the '{@link originreq.UC#getUCRelation <em>UC Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UC Relation</em>' attribute.
	 * @see #getUCRelation()
	 * @generated
	 */
	void setUCRelation(String value);

	/**
	 * Returns the value of the '<em><b>Relateduc</b></em>' reference list.
	 * The list contents are of type {@link originreq.UC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relateduc</em>' reference list.
	 * @see originreq.OriginreqPackage#getUC_Relateduc()
	 * @model
	 * @generated
	 */
	EList<UC> getRelateduc();

	/**
	 * Returns the value of the '<em><b>Ssd</b></em>' reference list.
	 * The list contents are of type {@link originreq.Interaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssd</em>' reference list.
	 * @see originreq.OriginreqPackage#getUC_Ssd()
	 * @model
	 * @generated
	 */
	EList<Interaction> getSsd();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference list.
	 * The list contents are of type {@link originreq.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference list.
	 * @see originreq.OriginreqPackage#getUC_Service()
	 * @model
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see originreq.OriginreqPackage#getUC_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link originreq.UC#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // UC
