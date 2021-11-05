/**
 */
package userStory2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import userStory2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UserStory2FactoryImpl extends EFactoryImpl implements UserStory2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UserStory2Factory init() {
		try {
			UserStory2Factory theUserStory2Factory = (UserStory2Factory) EPackage.Registry.INSTANCE
					.getEFactory(UserStory2Package.eNS_URI);
			if (theUserStory2Factory != null) {
				return theUserStory2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UserStory2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserStory2FactoryImpl() {
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
		case UserStory2Package.US:
			return createUS();
		case UserStory2Package.USER_STORY:
			return createUserStory();
		case UserStory2Package.FEATURE:
			return createFeature();
		case UserStory2Package.ROLE:
			return createRole();
		case UserStory2Package.GOAL:
			return createGoal();
		case UserStory2Package.EARNING:
			return createEarning();
		case UserStory2Package.SCENARIO:
			return createScenario();
		case UserStory2Package.PRE_CONDITION:
			return createPreCondition();
		case UserStory2Package.EVENT:
			return createEvent();
		case UserStory2Package.POST_CONDITION:
			return createPostCondition();
		case UserStory2Package.ADDITIONAL:
			return createAdditional();
		case UserStory2Package.AN_DREFINEMENT:
			return createANDrefinement();
		case UserStory2Package.ORREFINEMENT:
			return createORrefinement();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public US createUS() {
		USImpl us = new USImpl();
		return us;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserStory createUserStory() {
		UserStoryImpl userStory = new UserStoryImpl();
		return userStory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Earning createEarning() {
		EarningImpl earning = new EarningImpl();
		return earning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreCondition createPreCondition() {
		PreConditionImpl preCondition = new PreConditionImpl();
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostCondition createPostCondition() {
		PostConditionImpl postCondition = new PostConditionImpl();
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Additional createAdditional() {
		AdditionalImpl additional = new AdditionalImpl();
		return additional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANDrefinement createANDrefinement() {
		ANDrefinementImpl anDrefinement = new ANDrefinementImpl();
		return anDrefinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORrefinement createORrefinement() {
		ORrefinementImpl oRrefinement = new ORrefinementImpl();
		return oRrefinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserStory2Package getUserStory2Package() {
		return (UserStory2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UserStory2Package getPackage() {
		return UserStory2Package.eINSTANCE;
	}

} //UserStory2FactoryImpl
