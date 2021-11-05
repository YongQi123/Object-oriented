/**
 */
package eARS.impl;

import eARS.*;

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
		case EARSPackage.UB:
			return createUB();
		case EARSPackage.SYSTEM_NAME:
			return createSystemName();
		case EARSPackage.SYSTEM_RESPONSE:
			return createSystemResponse();
		case EARSPackage.EV:
			return createEV();
		case EARSPackage.OPTIONAL_PRECONDITIONS:
			return createOptionalPreconditions();
		case EARSPackage.UW:
			return createUW();
		case EARSPackage.ST:
			return createST();
		case EARSPackage.IN_ASPECIFIC_STATE:
			return createInASpecificState();
		case EARSPackage.OP:
			return createOP();
		case EARSPackage.FEATURE_IS_INCLUDED:
			return createFeatureIsIncluded();
		case EARSPackage.HY:
			return createHY();
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
	public UB createUB() {
		UBImpl ub = new UBImpl();
		return ub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemName createSystemName() {
		SystemNameImpl systemName = new SystemNameImpl();
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemResponse createSystemResponse() {
		SystemResponseImpl systemResponse = new SystemResponseImpl();
		return systemResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EV createEV() {
		EVImpl ev = new EVImpl();
		return ev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalPreconditions createOptionalPreconditions() {
		OptionalPreconditionsImpl optionalPreconditions = new OptionalPreconditionsImpl();
		return optionalPreconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST createST() {
		STImpl st = new STImpl();
		return st;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InASpecificState createInASpecificState() {
		InASpecificStateImpl inASpecificState = new InASpecificStateImpl();
		return inASpecificState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UW createUW() {
		UWImpl uw = new UWImpl();
		return uw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OP createOP() {
		OPImpl op = new OPImpl();
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureIsIncluded createFeatureIsIncluded() {
		FeatureIsIncludedImpl featureIsIncluded = new FeatureIsIncludedImpl();
		return featureIsIncluded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HY createHY() {
		HYImpl hy = new HYImpl();
		return hy;
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
