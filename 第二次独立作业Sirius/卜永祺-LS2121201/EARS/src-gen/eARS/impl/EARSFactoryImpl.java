/**
 */
package eARS.impl;

import eARS.Complex;
import eARS.EARS;
import eARS.EARSFactory;
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
public class EARSFactoryImpl extends EFactoryImpl implements EARSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EARSFactory init() {
		try {
			EARSFactory theEARSFactory = (EARSFactory) EPackage.Registry.INSTANCE.getEFactory(EARSPackage.eNS_URI);
			if (theEARSFactory != null) {
				return theEARSFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EARSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EARSFactoryImpl() {
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
		case EARSPackage.EARS:
			return createEARS();
		case EARSPackage.UBIQUITOUS:
			return createUbiquitous();
		case EARSPackage.SYSTEM:
			return createSystem();
		case EARSPackage.RESPONSE:
			return createResponse();
		case EARSPackage.EVENT_DRIVEN:
			return createEventDriven();
		case EARSPackage.PRECONDITIONS:
			return createPreconditions();
		case EARSPackage.UNWANTED_BEHAVIOUR:
			return createUnwantedBehaviour();
		case EARSPackage.STATE_DRIVEN:
			return createStateDriven();
		case EARSPackage.STATE:
			return createState();
		case EARSPackage.OPTIONAL_FEATURES:
			return createOptionalFeatures();
		case EARSPackage.FEATURE_IS:
			return createFeatureIs();
		case EARSPackage.COMPLEX:
			return createComplex();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EARS createEARS() {
		EARSImpl ears = new EARSImpl();
		return ears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ubiquitous createUbiquitous() {
		UbiquitousImpl ubiquitous = new UbiquitousImpl();
		return ubiquitous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public eARS.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response createResponse() {
		ResponseImpl response = new ResponseImpl();
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDriven createEventDriven() {
		EventDrivenImpl eventDriven = new EventDrivenImpl();
		return eventDriven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preconditions createPreconditions() {
		PreconditionsImpl preconditions = new PreconditionsImpl();
		return preconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnwantedBehaviour createUnwantedBehaviour() {
		UnwantedBehaviourImpl unwantedBehaviour = new UnwantedBehaviourImpl();
		return unwantedBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateDriven createStateDriven() {
		StateDrivenImpl stateDriven = new StateDrivenImpl();
		return stateDriven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalFeatures createOptionalFeatures() {
		OptionalFeaturesImpl optionalFeatures = new OptionalFeaturesImpl();
		return optionalFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureIs createFeatureIs() {
		FeatureIsImpl featureIs = new FeatureIsImpl();
		return featureIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complex createComplex() {
		ComplexImpl complex = new ComplexImpl();
		return complex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EARSPackage getEARSPackage() {
		return (EARSPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EARSPackage getPackage() {
		return EARSPackage.eINSTANCE;
	}

} //EARSFactoryImpl
