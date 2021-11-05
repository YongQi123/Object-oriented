/**
 */
package userStory2;

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
 * @see userStory2.UserStory2Factory
 * @model kind="package"
 * @generated
 */
public interface UserStory2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "userStory2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/userStory2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "userStory2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UserStory2Package eINSTANCE = userStory2.impl.UserStory2PackageImpl.init();

	/**
	 * The meta object id for the '{@link userStory2.impl.USImpl <em>US</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see userStory2.impl.USImpl
	 * @see userStory2.impl.UserStory2PackageImpl#getUS()
	 * @generated
	 */
	int US = 0;

	/**
	 * The feature id for the '<em><b>Userstory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US__USERSTORY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US__NAME = 1;

	/**
	 * The number of structural features of the '<em>US</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>US</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link userStory2.impl.UserStoryImpl <em>User Story</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see userStory2.impl.UserStoryImpl
	 * @see userStory2.impl.UserStory2PackageImpl#getUserStory()
	 * @generated
	 */
	int USER_STORY = 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__SCENARIO = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__NAME = 2;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__REFINEMENT = 3;

	/**
	 * The number of structural features of the '<em>User Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>User Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link userStory2.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see userStory2.impl.FeatureImpl
	 * @see userStory2.impl.UserStory2PackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Asa</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ASA = 0;

	/**
	 * The feature id for the '<em><b>Iwantto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IWANTTO = 1;

	/**
	 * The feature id for the '<em><b>Inorderto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__INORDERTO = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link userStory2.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see userStory2.impl.RoleImpl
	 * @see userStory2.impl.UserStory2PackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link userStory2.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see userStory2.impl.GoalImpl
	 * @see userStory2.impl.UserStory2PackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link userStory2.impl.EarningImpl <em>Earning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see userStory2.impl.EarningImpl
	 * @see userStory2.impl.UserStory2PackageImpl#getEarning()
	 * @generated
	 */
	int EARNING = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARNING__NAME = 0;

	/**
	 * The number of structural features of the '<em>Earning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARNING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Earning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARNING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link userStory2.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see userStory2.impl.ScenarioImpl
	 * @see userStory2.impl.UserStory2PackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 6;

	/**
	 * The feature id for the '<em><b>Given</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__GIVEN = 0;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__WHEN = 1;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__THEN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = 3;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link userStory2.impl.PreConditionImpl <em>Pre Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see userStory2.impl.PreConditionImpl
	 * @see userStory2.impl.UserStory2PackageImpl#getPreCondition()
	 * @generated
	 */
	int PRE_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__AND = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Pre Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pre Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link userStory2.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see userStory2.impl.EventImpl
	 * @see userStory2.impl.UserStory2PackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link userStory2.impl.PostConditionImpl <em>Post Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see userStory2.impl.PostConditionImpl
	 * @see userStory2.impl.UserStory2PackageImpl#getPostCondition()
	 * @generated
	 */
	int POST_CONDITION = 9;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION__AND = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Post Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Post Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link userStory2.impl.AdditionalImpl <em>Additional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see userStory2.impl.AdditionalImpl
	 * @see userStory2.impl.UserStory2PackageImpl#getAdditional()
	 * @generated
	 */
	int ADDITIONAL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Additional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Additional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link userStory2.impl.RefinementImpl <em>Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see userStory2.impl.RefinementImpl
	 * @see userStory2.impl.UserStory2PackageImpl#getRefinement()
	 * @generated
	 */
	int REFINEMENT = 11;

	/**
	 * The number of structural features of the '<em>Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link userStory2.impl.ANDrefinementImpl <em>AN Drefinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see userStory2.impl.ANDrefinementImpl
	 * @see userStory2.impl.UserStory2PackageImpl#getANDrefinement()
	 * @generated
	 */
	int AN_DREFINEMENT = 12;

	/**
	 * The feature id for the '<em><b>And</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_DREFINEMENT__AND = REFINEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AN Drefinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_DREFINEMENT_FEATURE_COUNT = REFINEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>AN Drefinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AN_DREFINEMENT_OPERATION_COUNT = REFINEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link userStory2.impl.ORrefinementImpl <em>ORrefinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see userStory2.impl.ORrefinementImpl
	 * @see userStory2.impl.UserStory2PackageImpl#getORrefinement()
	 * @generated
	 */
	int ORREFINEMENT = 13;

	/**
	 * The feature id for the '<em><b>Or</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORREFINEMENT__OR = REFINEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ORrefinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORREFINEMENT_FEATURE_COUNT = REFINEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ORrefinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORREFINEMENT_OPERATION_COUNT = REFINEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link userStory2.US <em>US</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>US</em>'.
	 * @see userStory2.US
	 * @generated
	 */
	EClass getUS();

	/**
	 * Returns the meta object for the containment reference list '{@link userStory2.US#getUserstory <em>Userstory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Userstory</em>'.
	 * @see userStory2.US#getUserstory()
	 * @see #getUS()
	 * @generated
	 */
	EReference getUS_Userstory();

	/**
	 * Returns the meta object for the attribute '{@link userStory2.US#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see userStory2.US#getName()
	 * @see #getUS()
	 * @generated
	 */
	EAttribute getUS_Name();

	/**
	 * Returns the meta object for class '{@link userStory2.UserStory <em>User Story</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Story</em>'.
	 * @see userStory2.UserStory
	 * @generated
	 */
	EClass getUserStory();

	/**
	 * Returns the meta object for the containment reference '{@link userStory2.UserStory#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see userStory2.UserStory#getFeature()
	 * @see #getUserStory()
	 * @generated
	 */
	EReference getUserStory_Feature();

	/**
	 * Returns the meta object for the containment reference list '{@link userStory2.UserStory#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenario</em>'.
	 * @see userStory2.UserStory#getScenario()
	 * @see #getUserStory()
	 * @generated
	 */
	EReference getUserStory_Scenario();

	/**
	 * Returns the meta object for the attribute '{@link userStory2.UserStory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see userStory2.UserStory#getName()
	 * @see #getUserStory()
	 * @generated
	 */
	EAttribute getUserStory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link userStory2.UserStory#getRefinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refinement</em>'.
	 * @see userStory2.UserStory#getRefinement()
	 * @see #getUserStory()
	 * @generated
	 */
	EReference getUserStory_Refinement();

	/**
	 * Returns the meta object for class '{@link userStory2.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see userStory2.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the containment reference '{@link userStory2.Feature#getAsa <em>Asa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Asa</em>'.
	 * @see userStory2.Feature#getAsa()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Asa();

	/**
	 * Returns the meta object for the containment reference '{@link userStory2.Feature#getIwantto <em>Iwantto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iwantto</em>'.
	 * @see userStory2.Feature#getIwantto()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Iwantto();

	/**
	 * Returns the meta object for the containment reference '{@link userStory2.Feature#getInorderto <em>Inorderto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inorderto</em>'.
	 * @see userStory2.Feature#getInorderto()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Inorderto();

	/**
	 * Returns the meta object for the attribute '{@link userStory2.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see userStory2.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for class '{@link userStory2.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see userStory2.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link userStory2.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see userStory2.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for class '{@link userStory2.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see userStory2.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the attribute '{@link userStory2.Goal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see userStory2.Goal#getName()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Name();

	/**
	 * Returns the meta object for class '{@link userStory2.Earning <em>Earning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earning</em>'.
	 * @see userStory2.Earning
	 * @generated
	 */
	EClass getEarning();

	/**
	 * Returns the meta object for the attribute '{@link userStory2.Earning#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see userStory2.Earning#getName()
	 * @see #getEarning()
	 * @generated
	 */
	EAttribute getEarning_Name();

	/**
	 * Returns the meta object for class '{@link userStory2.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see userStory2.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference '{@link userStory2.Scenario#getGiven <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Given</em>'.
	 * @see userStory2.Scenario#getGiven()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Given();

	/**
	 * Returns the meta object for the containment reference '{@link userStory2.Scenario#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see userStory2.Scenario#getWhen()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_When();

	/**
	 * Returns the meta object for the containment reference list '{@link userStory2.Scenario#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Then</em>'.
	 * @see userStory2.Scenario#getThen()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Then();

	/**
	 * Returns the meta object for the attribute '{@link userStory2.Scenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see userStory2.Scenario#getName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Name();

	/**
	 * Returns the meta object for class '{@link userStory2.PreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Condition</em>'.
	 * @see userStory2.PreCondition
	 * @generated
	 */
	EClass getPreCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link userStory2.PreCondition#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see userStory2.PreCondition#getAnd()
	 * @see #getPreCondition()
	 * @generated
	 */
	EReference getPreCondition_And();

	/**
	 * Returns the meta object for the attribute '{@link userStory2.PreCondition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see userStory2.PreCondition#getName()
	 * @see #getPreCondition()
	 * @generated
	 */
	EAttribute getPreCondition_Name();

	/**
	 * Returns the meta object for class '{@link userStory2.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see userStory2.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link userStory2.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see userStory2.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for class '{@link userStory2.PostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Condition</em>'.
	 * @see userStory2.PostCondition
	 * @generated
	 */
	EClass getPostCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link userStory2.PostCondition#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see userStory2.PostCondition#getAnd()
	 * @see #getPostCondition()
	 * @generated
	 */
	EReference getPostCondition_And();

	/**
	 * Returns the meta object for the attribute '{@link userStory2.PostCondition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see userStory2.PostCondition#getName()
	 * @see #getPostCondition()
	 * @generated
	 */
	EAttribute getPostCondition_Name();

	/**
	 * Returns the meta object for class '{@link userStory2.Additional <em>Additional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional</em>'.
	 * @see userStory2.Additional
	 * @generated
	 */
	EClass getAdditional();

	/**
	 * Returns the meta object for the attribute '{@link userStory2.Additional#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see userStory2.Additional#getName()
	 * @see #getAdditional()
	 * @generated
	 */
	EAttribute getAdditional_Name();

	/**
	 * Returns the meta object for class '{@link userStory2.Refinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refinement</em>'.
	 * @see userStory2.Refinement
	 * @generated
	 */
	EClass getRefinement();

	/**
	 * Returns the meta object for class '{@link userStory2.ANDrefinement <em>AN Drefinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AN Drefinement</em>'.
	 * @see userStory2.ANDrefinement
	 * @generated
	 */
	EClass getANDrefinement();

	/**
	 * Returns the meta object for the reference '{@link userStory2.ANDrefinement#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>And</em>'.
	 * @see userStory2.ANDrefinement#getAnd()
	 * @see #getANDrefinement()
	 * @generated
	 */
	EReference getANDrefinement_And();

	/**
	 * Returns the meta object for class '{@link userStory2.ORrefinement <em>ORrefinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ORrefinement</em>'.
	 * @see userStory2.ORrefinement
	 * @generated
	 */
	EClass getORrefinement();

	/**
	 * Returns the meta object for the reference '{@link userStory2.ORrefinement#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Or</em>'.
	 * @see userStory2.ORrefinement#getOr()
	 * @see #getORrefinement()
	 * @generated
	 */
	EReference getORrefinement_Or();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UserStory2Factory getUserStory2Factory();

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
		 * The meta object literal for the '{@link userStory2.impl.USImpl <em>US</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see userStory2.impl.USImpl
		 * @see userStory2.impl.UserStory2PackageImpl#getUS()
		 * @generated
		 */
		EClass US = eINSTANCE.getUS();

		/**
		 * The meta object literal for the '<em><b>Userstory</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference US__USERSTORY = eINSTANCE.getUS_Userstory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US__NAME = eINSTANCE.getUS_Name();

		/**
		 * The meta object literal for the '{@link userStory2.impl.UserStoryImpl <em>User Story</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see userStory2.impl.UserStoryImpl
		 * @see userStory2.impl.UserStory2PackageImpl#getUserStory()
		 * @generated
		 */
		EClass USER_STORY = eINSTANCE.getUserStory();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_STORY__FEATURE = eINSTANCE.getUserStory_Feature();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_STORY__SCENARIO = eINSTANCE.getUserStory_Scenario();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_STORY__NAME = eINSTANCE.getUserStory_Name();

		/**
		 * The meta object literal for the '<em><b>Refinement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_STORY__REFINEMENT = eINSTANCE.getUserStory_Refinement();

		/**
		 * The meta object literal for the '{@link userStory2.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see userStory2.impl.FeatureImpl
		 * @see userStory2.impl.UserStory2PackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Asa</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__ASA = eINSTANCE.getFeature_Asa();

		/**
		 * The meta object literal for the '<em><b>Iwantto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__IWANTTO = eINSTANCE.getFeature_Iwantto();

		/**
		 * The meta object literal for the '<em><b>Inorderto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__INORDERTO = eINSTANCE.getFeature_Inorderto();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '{@link userStory2.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see userStory2.impl.RoleImpl
		 * @see userStory2.impl.UserStory2PackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '{@link userStory2.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see userStory2.impl.GoalImpl
		 * @see userStory2.impl.UserStory2PackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__NAME = eINSTANCE.getGoal_Name();

		/**
		 * The meta object literal for the '{@link userStory2.impl.EarningImpl <em>Earning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see userStory2.impl.EarningImpl
		 * @see userStory2.impl.UserStory2PackageImpl#getEarning()
		 * @generated
		 */
		EClass EARNING = eINSTANCE.getEarning();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARNING__NAME = eINSTANCE.getEarning_Name();

		/**
		 * The meta object literal for the '{@link userStory2.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see userStory2.impl.ScenarioImpl
		 * @see userStory2.impl.UserStory2PackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Given</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__GIVEN = eINSTANCE.getScenario_Given();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__WHEN = eINSTANCE.getScenario_When();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__THEN = eINSTANCE.getScenario_Then();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

		/**
		 * The meta object literal for the '{@link userStory2.impl.PreConditionImpl <em>Pre Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see userStory2.impl.PreConditionImpl
		 * @see userStory2.impl.UserStory2PackageImpl#getPreCondition()
		 * @generated
		 */
		EClass PRE_CONDITION = eINSTANCE.getPreCondition();

		/**
		 * The meta object literal for the '<em><b>And</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONDITION__AND = eINSTANCE.getPreCondition_And();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_CONDITION__NAME = eINSTANCE.getPreCondition_Name();

		/**
		 * The meta object literal for the '{@link userStory2.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see userStory2.impl.EventImpl
		 * @see userStory2.impl.UserStory2PackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '{@link userStory2.impl.PostConditionImpl <em>Post Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see userStory2.impl.PostConditionImpl
		 * @see userStory2.impl.UserStory2PackageImpl#getPostCondition()
		 * @generated
		 */
		EClass POST_CONDITION = eINSTANCE.getPostCondition();

		/**
		 * The meta object literal for the '<em><b>And</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST_CONDITION__AND = eINSTANCE.getPostCondition_And();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST_CONDITION__NAME = eINSTANCE.getPostCondition_Name();

		/**
		 * The meta object literal for the '{@link userStory2.impl.AdditionalImpl <em>Additional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see userStory2.impl.AdditionalImpl
		 * @see userStory2.impl.UserStory2PackageImpl#getAdditional()
		 * @generated
		 */
		EClass ADDITIONAL = eINSTANCE.getAdditional();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL__NAME = eINSTANCE.getAdditional_Name();

		/**
		 * The meta object literal for the '{@link userStory2.impl.RefinementImpl <em>Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see userStory2.impl.RefinementImpl
		 * @see userStory2.impl.UserStory2PackageImpl#getRefinement()
		 * @generated
		 */
		EClass REFINEMENT = eINSTANCE.getRefinement();

		/**
		 * The meta object literal for the '{@link userStory2.impl.ANDrefinementImpl <em>AN Drefinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see userStory2.impl.ANDrefinementImpl
		 * @see userStory2.impl.UserStory2PackageImpl#getANDrefinement()
		 * @generated
		 */
		EClass AN_DREFINEMENT = eINSTANCE.getANDrefinement();

		/**
		 * The meta object literal for the '<em><b>And</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AN_DREFINEMENT__AND = eINSTANCE.getANDrefinement_And();

		/**
		 * The meta object literal for the '{@link userStory2.impl.ORrefinementImpl <em>ORrefinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see userStory2.impl.ORrefinementImpl
		 * @see userStory2.impl.UserStory2PackageImpl#getORrefinement()
		 * @generated
		 */
		EClass ORREFINEMENT = eINSTANCE.getORrefinement();

		/**
		 * The meta object literal for the '<em><b>Or</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORREFINEMENT__OR = eINSTANCE.getORrefinement_Or();

	}

} //UserStory2Package
