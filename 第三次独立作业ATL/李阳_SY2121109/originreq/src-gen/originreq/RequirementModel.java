/**
 */
package originreq;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link originreq.RequirementModel#getName <em>Name</em>}</li>
 *   <li>{@link originreq.RequirementModel#getDescription <em>Description</em>}</li>
 *   <li>{@link originreq.RequirementModel#getUseCaseModel <em>Use Case Model</em>}</li>
 *   <li>{@link originreq.RequirementModel#getDomainModel <em>Domain Model</em>}</li>
 * </ul>
 *
 * @see originreq.OriginreqPackage#getRequirementModel()
 * @model
 * @generated
 */
public interface RequirementModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see originreq.OriginreqPackage#getRequirementModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link originreq.RequirementModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see originreq.OriginreqPackage#getRequirementModel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link originreq.RequirementModel#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Use Case Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Case Model</em>' containment reference.
	 * @see #setUseCaseModel(UseCaseModel)
	 * @see originreq.OriginreqPackage#getRequirementModel_UseCaseModel()
	 * @model containment="true"
	 * @generated
	 */
	UseCaseModel getUseCaseModel();

	/**
	 * Sets the value of the '{@link originreq.RequirementModel#getUseCaseModel <em>Use Case Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Case Model</em>' containment reference.
	 * @see #getUseCaseModel()
	 * @generated
	 */
	void setUseCaseModel(UseCaseModel value);

	/**
	 * Returns the value of the '<em><b>Domain Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Model</em>' containment reference.
	 * @see #setDomainModel(DomainModel)
	 * @see originreq.OriginreqPackage#getRequirementModel_DomainModel()
	 * @model containment="true"
	 * @generated
	 */
	DomainModel getDomainModel();

	/**
	 * Sets the value of the '{@link originreq.RequirementModel#getDomainModel <em>Domain Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Model</em>' containment reference.
	 * @see #getDomainModel()
	 * @generated
	 */
	void setDomainModel(DomainModel value);

} // RequirementModel
