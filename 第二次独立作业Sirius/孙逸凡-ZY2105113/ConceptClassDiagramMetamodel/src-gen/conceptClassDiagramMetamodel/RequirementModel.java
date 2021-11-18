/**
 */
package conceptClassDiagramMetamodel;

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
 *   <li>{@link conceptClassDiagramMetamodel.RequirementModel#getName <em>Name</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.RequirementModel#getDescription <em>Description</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.RequirementModel#getUsecasemodel <em>Usecasemodel</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.RequirementModel#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.RequirementModel#getSsd <em>Ssd</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.RequirementModel#getDomainmodel <em>Domainmodel</em>}</li>
 * </ul>
 *
 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getRequirementModel()
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
	 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getRequirementModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conceptClassDiagramMetamodel.RequirementModel#getName <em>Name</em>}' attribute.
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
	 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getRequirementModel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link conceptClassDiagramMetamodel.RequirementModel#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Usecasemodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usecasemodel</em>' reference.
	 * @see #setUsecasemodel(usecasemodel)
	 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getRequirementModel_Usecasemodel()
	 * @model
	 * @generated
	 */
	usecasemodel getUsecasemodel();

	/**
	 * Sets the value of the '{@link conceptClassDiagramMetamodel.RequirementModel#getUsecasemodel <em>Usecasemodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usecasemodel</em>' reference.
	 * @see #getUsecasemodel()
	 * @generated
	 */
	void setUsecasemodel(usecasemodel value);

	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' reference.
	 * @see #setWorkflow(workflow)
	 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getRequirementModel_Workflow()
	 * @model
	 * @generated
	 */
	workflow getWorkflow();

	/**
	 * Sets the value of the '{@link conceptClassDiagramMetamodel.RequirementModel#getWorkflow <em>Workflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow</em>' reference.
	 * @see #getWorkflow()
	 * @generated
	 */
	void setWorkflow(workflow value);

	/**
	 * Returns the value of the '<em><b>Ssd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssd</em>' reference.
	 * @see #setSsd(ssd)
	 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getRequirementModel_Ssd()
	 * @model
	 * @generated
	 */
	ssd getSsd();

	/**
	 * Sets the value of the '{@link conceptClassDiagramMetamodel.RequirementModel#getSsd <em>Ssd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssd</em>' reference.
	 * @see #getSsd()
	 * @generated
	 */
	void setSsd(ssd value);

	/**
	 * Returns the value of the '<em><b>Domainmodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainmodel</em>' reference.
	 * @see #setDomainmodel(DomainModel)
	 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getRequirementModel_Domainmodel()
	 * @model
	 * @generated
	 */
	DomainModel getDomainmodel();

	/**
	 * Sets the value of the '{@link conceptClassDiagramMetamodel.RequirementModel#getDomainmodel <em>Domainmodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domainmodel</em>' reference.
	 * @see #getDomainmodel()
	 * @generated
	 */
	void setDomainmodel(DomainModel value);

} // RequirementModel
