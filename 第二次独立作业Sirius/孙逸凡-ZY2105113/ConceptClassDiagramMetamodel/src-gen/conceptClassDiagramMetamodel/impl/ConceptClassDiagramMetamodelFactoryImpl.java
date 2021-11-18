/**
 */
package conceptClassDiagramMetamodel.impl;

import conceptClassDiagramMetamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConceptClassDiagramMetamodelFactoryImpl extends EFactoryImpl
		implements ConceptClassDiagramMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConceptClassDiagramMetamodelFactory init() {
		try {
			ConceptClassDiagramMetamodelFactory theConceptClassDiagramMetamodelFactory = (ConceptClassDiagramMetamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(ConceptClassDiagramMetamodelPackage.eNS_URI);
			if (theConceptClassDiagramMetamodelFactory != null) {
				return theConceptClassDiagramMetamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConceptClassDiagramMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptClassDiagramMetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL:
			return createRequirementModel();
		case ConceptClassDiagramMetamodelPackage.USECASEMODEL:
			return createusecasemodel();
		case ConceptClassDiagramMetamodelPackage.WORKFLOW:
			return createworkflow();
		case ConceptClassDiagramMetamodelPackage.SSD:
			return createssd();
		case ConceptClassDiagramMetamodelPackage.DOMAIN_MODEL:
			return createDomainModel();
		case ConceptClassDiagramMetamodelPackage.ENTITY:
			return createEntity();
		case ConceptClassDiagramMetamodelPackage.ATTRIBUTE:
			return createAttribute();
		case ConceptClassDiagramMetamodelPackage.INVARIANCE:
			return createInvariance();
		case ConceptClassDiagramMetamodelPackage.TYPE:
			return createtype();
		case ConceptClassDiagramMetamodelPackage.OCL:
			return createocl();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementModel createRequirementModel() {
		RequirementModelImpl requirementModel = new RequirementModelImpl();
		return requirementModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public usecasemodel createusecasemodel() {
		usecasemodelImpl usecasemodel = new usecasemodelImpl();
		return usecasemodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public workflow createworkflow() {
		workflowImpl workflow = new workflowImpl();
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ssd createssd() {
		ssdImpl ssd = new ssdImpl();
		return ssd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel createDomainModel() {
		DomainModelImpl domainModel = new DomainModelImpl();
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invariance createInvariance() {
		InvarianceImpl invariance = new InvarianceImpl();
		return invariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public type createtype() {
		typeImpl type = new typeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ocl createocl() {
		oclImpl ocl = new oclImpl();
		return ocl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptClassDiagramMetamodelPackage getConceptClassDiagramMetamodelPackage() {
		return (ConceptClassDiagramMetamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConceptClassDiagramMetamodelPackage getPackage() {
		return ConceptClassDiagramMetamodelPackage.eINSTANCE;
	}

} //ConceptClassDiagramMetamodelFactoryImpl
