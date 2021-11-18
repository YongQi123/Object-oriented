/**
 */
package eARS.util;

import eARS.Complex;
import eARS.EARS;
import eARS.EARSPackage;
import eARS.EventDriven;
import eARS.FeatureIs;
import eARS.OptionalFeatures;
import eARS.Preconditions;
import eARS.Response;
import eARS.State;
import eARS.StateDriven;
import eARS.Ubiquitous;
import eARS.UnwantedBehaviour;
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
		public Adapter caseUbiquitous(Ubiquitous object) {
			return createUbiquitousAdapter();
		}

		@Override
		public Adapter caseSystem(eARS.System object) {
			return createSystemAdapter();
		}

		@Override
		public Adapter caseResponse(Response object) {
			return createResponseAdapter();
		}

		@Override
		public Adapter caseEventDriven(EventDriven object) {
			return createEventDrivenAdapter();
		}

		@Override
		public Adapter casePreconditions(Preconditions object) {
			return createPreconditionsAdapter();
		}

		@Override
		public Adapter caseUnwantedBehaviour(UnwantedBehaviour object) {
			return createUnwantedBehaviourAdapter();
		}

		@Override
		public Adapter caseStateDriven(StateDriven object) {
			return createStateDrivenAdapter();
		}

		@Override
		public Adapter caseState(State object) {
			return createStateAdapter();
		}

		@Override
		public Adapter caseOptionalFeatures(OptionalFeatures object) {
			return createOptionalFeaturesAdapter();
		}

		@Override
		public Adapter caseFeatureIs(FeatureIs object) {
			return createFeatureIsAdapter();
		}

		@Override
		public Adapter caseComplex(Complex object) {
			return createComplexAdapter();
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
	 * Creates a new adapter for an object of class '{@link eARS.Ubiquitous <em>Ubiquitous</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.Ubiquitous
	 * @generated
	 */
	public Adapter createUbiquitousAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eARS.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eARS.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.Response
	 * @generated
	 */
	public Adapter createResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eARS.EventDriven <em>Event Driven</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.EventDriven
	 * @generated
	 */
	public Adapter createEventDrivenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eARS.Preconditions <em>Preconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.Preconditions
	 * @generated
	 */
	public Adapter createPreconditionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eARS.UnwantedBehaviour <em>Unwanted Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.UnwantedBehaviour
	 * @generated
	 */
	public Adapter createUnwantedBehaviourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eARS.StateDriven <em>State Driven</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.StateDriven
	 * @generated
	 */
	public Adapter createStateDrivenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eARS.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eARS.OptionalFeatures <em>Optional Features</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.OptionalFeatures
	 * @generated
	 */
	public Adapter createOptionalFeaturesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eARS.FeatureIs <em>Feature Is</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.FeatureIs
	 * @generated
	 */
	public Adapter createFeatureIsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eARS.Complex <em>Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eARS.Complex
	 * @generated
	 */
	public Adapter createComplexAdapter() {
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
