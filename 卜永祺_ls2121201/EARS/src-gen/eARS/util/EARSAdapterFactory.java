/**
 */
package eARS.util;

import eARS.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eARS.EARSPackage
 * @generated
 */
public class EARSAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EARSPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EARSAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EARSPackage.eINSTANCE;
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
	protected EARSSwitch<Adapter> modelSwitch = new EARSSwitch<Adapter>() {
		@Override
		public Adapter caseEARS(EARS object) {
			return createEARSAdapter();
		}

		@Override
		public Adapter caseUB(UB object) {
			return createUBAdapter();
		}

		@Override
		public Adapter caseSystemName(SystemName object) {
			return createSystemNameAdapter();
		}

		@Override
		public Adapter caseSystemResponse(SystemResponse object) {
			return createSystemResponseAdapter();
		}

		@Override
		public Adapter caseEV(EV object) {
			return createEVAdapter();
		}

		@Override
		public Adapter caseOptionalPreconditions(OptionalPreconditions object) {
			return createOptionalPreconditionsAdapter();
		}

		@Override
		public Adapter caseUW(UW object) {
			return createUWAdapter();
		}

		@Override
		public Adapter caseST(ST object) {
			return createSTAdapter();
		}

		@Override
		public Adapter caseInASpecificState(InASpecificState object) {
			return createInASpecificStateAdapter();
		}

		@Override
		public Adapter caseOP(OP object) {
			return createOPAdapter();
		}

		@Override
		public Adapter caseFeatureIsIncluded(FeatureIsIncluded object) {
			return createFeatureIsIncludedAdapter();
		}

		@Override
		public Adapter caseHY(HY object) {
			return createHYAdapter();
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
	 * Creates a new adapter for an object of class '{@link eARS.EARS <em>EARS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.EARS
	 * @generated
	 */
	public Adapter createEARSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eARS.UB <em>UB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.UB
	 * @generated
	 */
	public Adapter createUBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eARS.SystemName <em>System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.SystemName
	 * @generated
	 */
	public Adapter createSystemNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eARS.SystemResponse <em>System Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.SystemResponse
	 * @generated
	 */
	public Adapter createSystemResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eARS.EV <em>EV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.EV
	 * @generated
	 */
	public Adapter createEVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eARS.OptionalPreconditions <em>Optional Preconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.OptionalPreconditions
	 * @generated
	 */
	public Adapter createOptionalPreconditionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eARS.ST <em>ST</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.ST
	 * @generated
	 */
	public Adapter createSTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eARS.InASpecificState <em>In ASpecific State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.InASpecificState
	 * @generated
	 */
	public Adapter createInASpecificStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eARS.UW <em>UW</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.UW
	 * @generated
	 */
	public Adapter createUWAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eARS.OP <em>OP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.OP
	 * @generated
	 */
	public Adapter createOPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eARS.FeatureIsIncluded <em>Feature Is Included</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.FeatureIsIncluded
	 * @generated
	 */
	public Adapter createFeatureIsIncludedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eARS.HY <em>HY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.HY
	 * @generated
	 */
	public Adapter createHYAdapter() {
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

} //EARSAdapterFactory
