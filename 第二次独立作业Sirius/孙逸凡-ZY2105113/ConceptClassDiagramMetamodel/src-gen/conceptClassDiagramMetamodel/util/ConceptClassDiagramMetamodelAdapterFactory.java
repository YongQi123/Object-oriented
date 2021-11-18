/**
 */
package conceptClassDiagramMetamodel.util;

import conceptClassDiagramMetamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage
 * @generated
 */
public class ConceptClassDiagramMetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConceptClassDiagramMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptClassDiagramMetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConceptClassDiagramMetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptClassDiagramMetamodelSwitch<Adapter> modelSwitch = new ConceptClassDiagramMetamodelSwitch<Adapter>() {
		@Override
		public Adapter caseRequirementModel(RequirementModel object) {
			return createRequirementModelAdapter();
		}

		@Override
		public Adapter caseusecasemodel(usecasemodel object) {
			return createusecasemodelAdapter();
		}

		@Override
		public Adapter caseworkflow(workflow object) {
			return createworkflowAdapter();
		}

		@Override
		public Adapter casessd(ssd object) {
			return createssdAdapter();
		}

		@Override
		public Adapter caseDomainModel(DomainModel object) {
			return createDomainModelAdapter();
		}

		@Override
		public Adapter caseEntity(Entity object) {
			return createEntityAdapter();
		}

		@Override
		public Adapter caseAttribute(Attribute object) {
			return createAttributeAdapter();
		}

		@Override
		public Adapter caseInvariance(Invariance object) {
			return createInvarianceAdapter();
		}

		@Override
		public Adapter casetype(type object) {
			return createtypeAdapter();
		}

		@Override
		public Adapter caseocl(ocl object) {
			return createoclAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link conceptClassDiagramMetamodel.RequirementModel <em>Requirement Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conceptClassDiagramMetamodel.RequirementModel
	 * @generated
	 */
	public Adapter createRequirementModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conceptClassDiagramMetamodel.usecasemodel <em>usecasemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conceptClassDiagramMetamodel.usecasemodel
	 * @generated
	 */
	public Adapter createusecasemodelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conceptClassDiagramMetamodel.workflow <em>workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conceptClassDiagramMetamodel.workflow
	 * @generated
	 */
	public Adapter createworkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conceptClassDiagramMetamodel.ssd <em>ssd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conceptClassDiagramMetamodel.ssd
	 * @generated
	 */
	public Adapter createssdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conceptClassDiagramMetamodel.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conceptClassDiagramMetamodel.DomainModel
	 * @generated
	 */
	public Adapter createDomainModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conceptClassDiagramMetamodel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conceptClassDiagramMetamodel.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conceptClassDiagramMetamodel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conceptClassDiagramMetamodel.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conceptClassDiagramMetamodel.Invariance <em>Invariance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conceptClassDiagramMetamodel.Invariance
	 * @generated
	 */
	public Adapter createInvarianceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conceptClassDiagramMetamodel.type <em>type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conceptClassDiagramMetamodel.type
	 * @generated
	 */
	public Adapter createtypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link conceptClassDiagramMetamodel.ocl <em>ocl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see conceptClassDiagramMetamodel.ocl
	 * @generated
	 */
	public Adapter createoclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ConceptClassDiagramMetamodelAdapterFactory
