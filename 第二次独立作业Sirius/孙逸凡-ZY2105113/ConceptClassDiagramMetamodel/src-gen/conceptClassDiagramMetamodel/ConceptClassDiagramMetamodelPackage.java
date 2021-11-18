/**
 */
package conceptClassDiagramMetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface ConceptClassDiagramMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "conceptClassDiagramMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/conceptClassDiagramMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "conceptClassDiagramMetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConceptClassDiagramMetamodelPackage eINSTANCE = conceptClassDiagramMetamodel.impl.ConceptClassDiagramMetamodelPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link conceptClassDiagramMetamodel.impl.RequirementModelImpl <em>Requirement Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conceptClassDiagramMetamodel.impl.RequirementModelImpl
	 * @see conceptClassDiagramMetamodel.impl.ConceptClassDiagramMetamodelPackageImpl#getRequirementModel()
	 * @generated
	 */
	int REQUIREMENT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MODEL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Usecasemodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MODEL__USECASEMODEL = 2;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MODEL__WORKFLOW = 3;

	/**
	 * The feature id for the '<em><b>Ssd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MODEL__SSD = 4;

	/**
	 * The feature id for the '<em><b>Domainmodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MODEL__DOMAINMODEL = 5;

	/**
	 * The number of structural features of the '<em>Requirement Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Requirement Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conceptClassDiagramMetamodel.impl.usecasemodelImpl <em>usecasemodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conceptClassDiagramMetamodel.impl.usecasemodelImpl
	 * @see conceptClassDiagramMetamodel.impl.ConceptClassDiagramMetamodelPackageImpl#getusecasemodel()
	 * @generated
	 */
	int USECASEMODEL = 1;

	/**
	 * The number of structural features of the '<em>usecasemodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASEMODEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>usecasemodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USECASEMODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conceptClassDiagramMetamodel.impl.workflowImpl <em>workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conceptClassDiagramMetamodel.impl.workflowImpl
	 * @see conceptClassDiagramMetamodel.impl.ConceptClassDiagramMetamodelPackageImpl#getworkflow()
	 * @generated
	 */
	int WORKFLOW = 2;

	/**
	 * The number of structural features of the '<em>workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conceptClassDiagramMetamodel.impl.ssdImpl <em>ssd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conceptClassDiagramMetamodel.impl.ssdImpl
	 * @see conceptClassDiagramMetamodel.impl.ConceptClassDiagramMetamodelPackageImpl#getssd()
	 * @generated
	 */
	int SSD = 3;

	/**
	 * The number of structural features of the '<em>ssd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ssd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conceptClassDiagramMetamodel.impl.DomainModelImpl <em>Domain Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conceptClassDiagramMetamodel.impl.DomainModelImpl
	 * @see conceptClassDiagramMetamodel.impl.ConceptClassDiagramMetamodelPackageImpl#getDomainModel()
	 * @generated
	 */
	int DOMAIN_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__ENTITY = 2;

	/**
	 * The number of structural features of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conceptClassDiagramMetamodel.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conceptClassDiagramMetamodel.impl.EntityImpl
	 * @see conceptClassDiagramMetamodel.impl.ConceptClassDiagramMetamodelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Is CRUD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_CRUD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Superentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SUPERENTITY = 3;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Entity Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY_OPPOSITE = 5;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__COMPOSITION = 6;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__AGGREGATION = 7;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Invariance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__INVARIANCE = 9;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__REFERENCE = 10;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conceptClassDiagramMetamodel.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conceptClassDiagramMetamodel.impl.AttributeImpl
	 * @see conceptClassDiagramMetamodel.impl.ConceptClassDiagramMetamodelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_MULTIPLE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conceptClassDiagramMetamodel.impl.InvarianceImpl <em>Invariance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conceptClassDiagramMetamodel.impl.InvarianceImpl
	 * @see conceptClassDiagramMetamodel.impl.ConceptClassDiagramMetamodelPackageImpl#getInvariance()
	 * @generated
	 */
	int INVARIANCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is For Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANCE__IS_FOR_ASSOCIATION = 1;

	/**
	 * The feature id for the '<em><b>Ocl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANCE__OCL = 2;

	/**
	 * The number of structural features of the '<em>Invariance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Invariance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conceptClassDiagramMetamodel.impl.typeImpl <em>type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conceptClassDiagramMetamodel.impl.typeImpl
	 * @see conceptClassDiagramMetamodel.impl.ConceptClassDiagramMetamodelPackageImpl#gettype()
	 * @generated
	 */
	int TYPE = 8;

	/**
	 * The number of structural features of the '<em>type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conceptClassDiagramMetamodel.impl.oclImpl <em>ocl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conceptClassDiagramMetamodel.impl.oclImpl
	 * @see conceptClassDiagramMetamodel.impl.ConceptClassDiagramMetamodelPackageImpl#getocl()
	 * @generated
	 */
	int OCL = 9;

	/**
	 * The number of structural features of the '<em>ocl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ocl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link conceptClassDiagramMetamodel.RequirementModel <em>Requirement Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Model</em>'.
	 * @see conceptClassDiagramMetamodel.RequirementModel
	 * @generated
	 */
	EClass getRequirementModel();

	/**
	 * Returns the meta object for the attribute '{@link conceptClassDiagramMetamodel.RequirementModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conceptClassDiagramMetamodel.RequirementModel#getName()
	 * @see #getRequirementModel()
	 * @generated
	 */
	EAttribute getRequirementModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link conceptClassDiagramMetamodel.RequirementModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see conceptClassDiagramMetamodel.RequirementModel#getDescription()
	 * @see #getRequirementModel()
	 * @generated
	 */
	EAttribute getRequirementModel_Description();

	/**
	 * Returns the meta object for the reference '{@link conceptClassDiagramMetamodel.RequirementModel#getUsecasemodel <em>Usecasemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usecasemodel</em>'.
	 * @see conceptClassDiagramMetamodel.RequirementModel#getUsecasemodel()
	 * @see #getRequirementModel()
	 * @generated
	 */
	EReference getRequirementModel_Usecasemodel();

	/**
	 * Returns the meta object for the reference '{@link conceptClassDiagramMetamodel.RequirementModel#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Workflow</em>'.
	 * @see conceptClassDiagramMetamodel.RequirementModel#getWorkflow()
	 * @see #getRequirementModel()
	 * @generated
	 */
	EReference getRequirementModel_Workflow();

	/**
	 * Returns the meta object for the reference '{@link conceptClassDiagramMetamodel.RequirementModel#getSsd <em>Ssd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ssd</em>'.
	 * @see conceptClassDiagramMetamodel.RequirementModel#getSsd()
	 * @see #getRequirementModel()
	 * @generated
	 */
	EReference getRequirementModel_Ssd();

	/**
	 * Returns the meta object for the reference '{@link conceptClassDiagramMetamodel.RequirementModel#getDomainmodel <em>Domainmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domainmodel</em>'.
	 * @see conceptClassDiagramMetamodel.RequirementModel#getDomainmodel()
	 * @see #getRequirementModel()
	 * @generated
	 */
	EReference getRequirementModel_Domainmodel();

	/**
	 * Returns the meta object for class '{@link conceptClassDiagramMetamodel.usecasemodel <em>usecasemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>usecasemodel</em>'.
	 * @see conceptClassDiagramMetamodel.usecasemodel
	 * @generated
	 */
	EClass getusecasemodel();

	/**
	 * Returns the meta object for class '{@link conceptClassDiagramMetamodel.workflow <em>workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>workflow</em>'.
	 * @see conceptClassDiagramMetamodel.workflow
	 * @generated
	 */
	EClass getworkflow();

	/**
	 * Returns the meta object for class '{@link conceptClassDiagramMetamodel.ssd <em>ssd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ssd</em>'.
	 * @see conceptClassDiagramMetamodel.ssd
	 * @generated
	 */
	EClass getssd();

	/**
	 * Returns the meta object for class '{@link conceptClassDiagramMetamodel.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Model</em>'.
	 * @see conceptClassDiagramMetamodel.DomainModel
	 * @generated
	 */
	EClass getDomainModel();

	/**
	 * Returns the meta object for the attribute '{@link conceptClassDiagramMetamodel.DomainModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conceptClassDiagramMetamodel.DomainModel#getName()
	 * @see #getDomainModel()
	 * @generated
	 */
	EAttribute getDomainModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link conceptClassDiagramMetamodel.DomainModel#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see conceptClassDiagramMetamodel.DomainModel#getLabel()
	 * @see #getDomainModel()
	 * @generated
	 */
	EAttribute getDomainModel_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link conceptClassDiagramMetamodel.DomainModel#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see conceptClassDiagramMetamodel.DomainModel#getEntity()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_Entity();

	/**
	 * Returns the meta object for class '{@link conceptClassDiagramMetamodel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see conceptClassDiagramMetamodel.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link conceptClassDiagramMetamodel.Entity#isIsCRUD <em>Is CRUD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is CRUD</em>'.
	 * @see conceptClassDiagramMetamodel.Entity#isIsCRUD()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_IsCRUD();

	/**
	 * Returns the meta object for the attribute '{@link conceptClassDiagramMetamodel.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conceptClassDiagramMetamodel.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link conceptClassDiagramMetamodel.Entity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see conceptClassDiagramMetamodel.Entity#getDescription()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Description();

	/**
	 * Returns the meta object for the reference '{@link conceptClassDiagramMetamodel.Entity#getSuperentity <em>Superentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Superentity</em>'.
	 * @see conceptClassDiagramMetamodel.Entity#getSuperentity()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Superentity();

	/**
	 * Returns the meta object for the reference '{@link conceptClassDiagramMetamodel.Entity#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see conceptClassDiagramMetamodel.Entity#getEntity()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Entity();

	/**
	 * Returns the meta object for the reference '{@link conceptClassDiagramMetamodel.Entity#getEntityOpposite <em>Entity Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity Opposite</em>'.
	 * @see conceptClassDiagramMetamodel.Entity#getEntityOpposite()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_EntityOpposite();

	/**
	 * Returns the meta object for the reference list '{@link conceptClassDiagramMetamodel.Entity#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composition</em>'.
	 * @see conceptClassDiagramMetamodel.Entity#getComposition()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Composition();

	/**
	 * Returns the meta object for the reference list '{@link conceptClassDiagramMetamodel.Entity#getAggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aggregation</em>'.
	 * @see conceptClassDiagramMetamodel.Entity#getAggregation()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Aggregation();

	/**
	 * Returns the meta object for the containment reference list '{@link conceptClassDiagramMetamodel.Entity#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see conceptClassDiagramMetamodel.Entity#getAttribute()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link conceptClassDiagramMetamodel.Entity#getInvariance <em>Invariance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invariance</em>'.
	 * @see conceptClassDiagramMetamodel.Entity#getInvariance()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Invariance();

	/**
	 * Returns the meta object for the reference list '{@link conceptClassDiagramMetamodel.Entity#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see conceptClassDiagramMetamodel.Entity#getReference()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Reference();

	/**
	 * Returns the meta object for class '{@link conceptClassDiagramMetamodel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see conceptClassDiagramMetamodel.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link conceptClassDiagramMetamodel.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conceptClassDiagramMetamodel.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link conceptClassDiagramMetamodel.Attribute#isIsMultiple <em>Is Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multiple</em>'.
	 * @see conceptClassDiagramMetamodel.Attribute#isIsMultiple()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsMultiple();

	/**
	 * Returns the meta object for the reference '{@link conceptClassDiagramMetamodel.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see conceptClassDiagramMetamodel.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link conceptClassDiagramMetamodel.Invariance <em>Invariance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invariance</em>'.
	 * @see conceptClassDiagramMetamodel.Invariance
	 * @generated
	 */
	EClass getInvariance();

	/**
	 * Returns the meta object for the attribute '{@link conceptClassDiagramMetamodel.Invariance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conceptClassDiagramMetamodel.Invariance#getName()
	 * @see #getInvariance()
	 * @generated
	 */
	EAttribute getInvariance_Name();

	/**
	 * Returns the meta object for the attribute '{@link conceptClassDiagramMetamodel.Invariance#isIsForAssociation <em>Is For Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is For Association</em>'.
	 * @see conceptClassDiagramMetamodel.Invariance#isIsForAssociation()
	 * @see #getInvariance()
	 * @generated
	 */
	EAttribute getInvariance_IsForAssociation();

	/**
	 * Returns the meta object for the reference '{@link conceptClassDiagramMetamodel.Invariance#getOcl <em>Ocl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ocl</em>'.
	 * @see conceptClassDiagramMetamodel.Invariance#getOcl()
	 * @see #getInvariance()
	 * @generated
	 */
	EReference getInvariance_Ocl();

	/**
	 * Returns the meta object for class '{@link conceptClassDiagramMetamodel.type <em>type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>type</em>'.
	 * @see conceptClassDiagramMetamodel.type
	 * @generated
	 */
	EClass gettype();

	/**
	 * Returns the meta object for class '{@link conceptClassDiagramMetamodel.ocl <em>ocl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ocl</em>'.
	 * @see conceptClassDiagramMetamodel.ocl
	 * @generated
	 */
	EClass getocl();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConceptClassDiagramMetamodelFactory getConceptClassDiagramMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link conceptClassDiagramMetamodel.impl.RequirementModelImpl <em>Requirement Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conceptClassDiagramMetamodel.impl.RequirementModelImpl
		 * @see conceptClassDiagramMetamodel.impl.ConceptClassDiagramMetamodelPackageImpl#getRequirementModel()
		 * @generated
		 */
		EClass REQUIREMENT_MODEL = eINSTANCE.getRequirementModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_MODEL__NAME = eINSTANCE.getRequirementModel_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_MODEL__DESCRIPTION = eINSTANCE.getRequirementModel_Description();

		/**
		 * The meta object literal for the '<em><b>Usecasemodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_MODEL__USECASEMODEL = eINSTANCE.getRequirementModel_Usecasemodel();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_MODEL__WORKFLOW = eINSTANCE.getRequirementModel_Workflow();

		/**
		 * The meta object literal for the '<em><b>Ssd</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_MODEL__SSD = eINSTANCE.getRequirementModel_Ssd();

		/**
		 * The meta object literal for the '<em><b>Domainmodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_MODEL__DOMAINMODEL = eINSTANCE.getRequirementModel_Domainmodel();

		/**
		 * The meta object literal for the '{@link conceptClassDiagramMetamodel.impl.usecasemodelImpl <em>usecasemodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conceptClassDiagramMetamodel.impl.usecasemodelImpl
		 * @see conceptClassDiagramMetamodel.impl.ConceptClassDiagramMetamodelPackageImpl#getusecasemodel()
		 * @generated
		 */
		EClass USECASEMODEL = eINSTANCE.getusecasemodel();

		/**
		 * The meta object literal for the '{@link conceptClassDiagramMetamodel.impl.workflowImpl <em>workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conceptClassDiagramMetamodel.impl.workflowImpl
		 * @see conceptClassDiagramMetamodel.impl.ConceptClassDiagramMetamodelPackageImpl#getworkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getworkflow();

		/**
		 * The meta object literal for the '{@link conceptClassDiagramMetamodel.impl.ssdImpl <em>ssd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conceptClassDiagramMetamodel.impl.ssdImpl
		 * @see conceptClassDiagramMetamodel.impl.ConceptClassDiagramMetamodelPackageImpl#getssd()
		 * @generated
		 */
		EClass SSD = eINSTANCE.getssd();

		/**
		 * The meta object literal for the '{@link conceptClassDiagramMetamodel.impl.DomainModelImpl <em>Domain Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conceptClassDiagramMetamodel.impl.DomainModelImpl
		 * @see conceptClassDiagramMetamodel.impl.ConceptClassDiagramMetamodelPackageImpl#getDomainModel()
		 * @generated
		 */
		EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MODEL__NAME = eINSTANCE.getDomainModel_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MODEL__LABEL = eINSTANCE.getDomainModel_Label();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__ENTITY = eINSTANCE.getDomainModel_Entity();

		/**
		 * The meta object literal for the '{@link conceptClassDiagramMetamodel.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conceptClassDiagramMetamodel.impl.EntityImpl
		 * @see conceptClassDiagramMetamodel.impl.ConceptClassDiagramMetamodelPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Is CRUD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__IS_CRUD = eINSTANCE.getEntity_IsCRUD();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__DESCRIPTION = eINSTANCE.getEntity_Description();

		/**
		 * The meta object literal for the '<em><b>Superentity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__SUPERENTITY = eINSTANCE.getEntity_Superentity();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ENTITY = eINSTANCE.getEntity_Entity();

		/**
		 * The meta object literal for the '<em><b>Entity Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ENTITY_OPPOSITE = eINSTANCE.getEntity_EntityOpposite();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__COMPOSITION = eINSTANCE.getEntity_Composition();

		/**
		 * The meta object literal for the '<em><b>Aggregation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__AGGREGATION = eINSTANCE.getEntity_Aggregation();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTE = eINSTANCE.getEntity_Attribute();

		/**
		 * The meta object literal for the '<em><b>Invariance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__INVARIANCE = eINSTANCE.getEntity_Invariance();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__REFERENCE = eINSTANCE.getEntity_Reference();

		/**
		 * The meta object literal for the '{@link conceptClassDiagramMetamodel.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conceptClassDiagramMetamodel.impl.AttributeImpl
		 * @see conceptClassDiagramMetamodel.impl.ConceptClassDiagramMetamodelPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Is Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_MULTIPLE = eINSTANCE.getAttribute_IsMultiple();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link conceptClassDiagramMetamodel.impl.InvarianceImpl <em>Invariance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conceptClassDiagramMetamodel.impl.InvarianceImpl
		 * @see conceptClassDiagramMetamodel.impl.ConceptClassDiagramMetamodelPackageImpl#getInvariance()
		 * @generated
		 */
		EClass INVARIANCE = eINSTANCE.getInvariance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVARIANCE__NAME = eINSTANCE.getInvariance_Name();

		/**
		 * The meta object literal for the '<em><b>Is For Association</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVARIANCE__IS_FOR_ASSOCIATION = eINSTANCE.getInvariance_IsForAssociation();

		/**
		 * The meta object literal for the '<em><b>Ocl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVARIANCE__OCL = eINSTANCE.getInvariance_Ocl();

		/**
		 * The meta object literal for the '{@link conceptClassDiagramMetamodel.impl.typeImpl <em>type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conceptClassDiagramMetamodel.impl.typeImpl
		 * @see conceptClassDiagramMetamodel.impl.ConceptClassDiagramMetamodelPackageImpl#gettype()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.gettype();

		/**
		 * The meta object literal for the '{@link conceptClassDiagramMetamodel.impl.oclImpl <em>ocl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conceptClassDiagramMetamodel.impl.oclImpl
		 * @see conceptClassDiagramMetamodel.impl.ConceptClassDiagramMetamodelPackageImpl#getocl()
		 * @generated
		 */
		EClass OCL = eINSTANCE.getocl();

	}

} //ConceptClassDiagramMetamodelPackage
