/**
 */
package eARS;

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
 * @see eARS.EARSFactory
 * @model kind="package"
 * @generated
 */
public interface EARSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eARS";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/eARS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eARS";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EARSPackage eINSTANCE = eARS.impl.EARSPackageImpl.init();

	/**
	 * The meta object id for the '{@link eARS.impl.EARSImpl <em>EARS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.EARSImpl
	 * @see eARS.impl.EARSPackageImpl#getEARS()
	 * @generated
	 */
	int EARS = 0;

	/**
	 * The feature id for the '<em><b>Ub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS__UB = 0;

	/**
	 * The number of structural features of the '<em>EARS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EARS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eARS.impl.UbiquitousImpl <em>Ubiquitous</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.UbiquitousImpl
	 * @see eARS.impl.EARSPackageImpl#getUbiquitous()
	 * @generated
	 */
	int UBIQUITOUS = 1;

	/**
	 * The feature id for the '<em><b>The</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBIQUITOUS__THE = 0;

	/**
	 * The feature id for the '<em><b>Shall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBIQUITOUS__SHALL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBIQUITOUS__NAME = 2;

	/**
	 * The number of structural features of the '<em>Ubiquitous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBIQUITOUS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ubiquitous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBIQUITOUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eARS.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.SystemImpl
	 * @see eARS.impl.EARSPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 0;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eARS.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.ResponseImpl
	 * @see eARS.impl.EARSPackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eARS.impl.EventDrivenImpl <em>Event Driven</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.EventDrivenImpl
	 * @see eARS.impl.EARSPackageImpl#getEventDriven()
	 * @generated
	 */
	int EVENT_DRIVEN = 4;

	/**
	 * The feature id for the '<em><b>The</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DRIVEN__THE = UBIQUITOUS__THE;

	/**
	 * The feature id for the '<em><b>Shall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DRIVEN__SHALL = UBIQUITOUS__SHALL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DRIVEN__NAME = UBIQUITOUS__NAME;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DRIVEN__WHEN = UBIQUITOUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Driven</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DRIVEN_FEATURE_COUNT = UBIQUITOUS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Driven</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DRIVEN_OPERATION_COUNT = UBIQUITOUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eARS.impl.PreconditionsImpl <em>Preconditions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.PreconditionsImpl
	 * @see eARS.impl.EARSPackageImpl#getPreconditions()
	 * @generated
	 */
	int PRECONDITIONS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITIONS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Preconditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Preconditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eARS.impl.UnwantedBehaviourImpl <em>Unwanted Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.UnwantedBehaviourImpl
	 * @see eARS.impl.EARSPackageImpl#getUnwantedBehaviour()
	 * @generated
	 */
	int UNWANTED_BEHAVIOUR = 6;

	/**
	 * The feature id for the '<em><b>The</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNWANTED_BEHAVIOUR__THE = UBIQUITOUS__THE;

	/**
	 * The feature id for the '<em><b>Shall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNWANTED_BEHAVIOUR__SHALL = UBIQUITOUS__SHALL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNWANTED_BEHAVIOUR__NAME = UBIQUITOUS__NAME;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNWANTED_BEHAVIOUR__IF = UBIQUITOUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unwanted Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNWANTED_BEHAVIOUR_FEATURE_COUNT = UBIQUITOUS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unwanted Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNWANTED_BEHAVIOUR_OPERATION_COUNT = UBIQUITOUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eARS.impl.StateDrivenImpl <em>State Driven</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.StateDrivenImpl
	 * @see eARS.impl.EARSPackageImpl#getStateDriven()
	 * @generated
	 */
	int STATE_DRIVEN = 7;

	/**
	 * The feature id for the '<em><b>The</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_DRIVEN__THE = UBIQUITOUS__THE;

	/**
	 * The feature id for the '<em><b>Shall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_DRIVEN__SHALL = UBIQUITOUS__SHALL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_DRIVEN__NAME = UBIQUITOUS__NAME;

	/**
	 * The feature id for the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_DRIVEN__WHILE = UBIQUITOUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Driven</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_DRIVEN_FEATURE_COUNT = UBIQUITOUS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State Driven</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_DRIVEN_OPERATION_COUNT = UBIQUITOUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eARS.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.StateImpl
	 * @see eARS.impl.EARSPackageImpl#getState()
	 * @generated
	 */
	int STATE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eARS.impl.OptionalFeaturesImpl <em>Optional Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.OptionalFeaturesImpl
	 * @see eARS.impl.EARSPackageImpl#getOptionalFeatures()
	 * @generated
	 */
	int OPTIONAL_FEATURES = 9;

	/**
	 * The feature id for the '<em><b>The</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURES__THE = UBIQUITOUS__THE;

	/**
	 * The feature id for the '<em><b>Shall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURES__SHALL = UBIQUITOUS__SHALL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURES__NAME = UBIQUITOUS__NAME;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURES__WHERE = UBIQUITOUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Optional Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURES_FEATURE_COUNT = UBIQUITOUS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Optional Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURES_OPERATION_COUNT = UBIQUITOUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eARS.impl.FeatureIsImpl <em>Feature Is</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.FeatureIsImpl
	 * @see eARS.impl.EARSPackageImpl#getFeatureIs()
	 * @generated
	 */
	int FEATURE_IS = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Feature Is</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Feature Is</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eARS.impl.ComplexImpl <em>Complex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.ComplexImpl
	 * @see eARS.impl.EARSPackageImpl#getComplex()
	 * @generated
	 */
	int COMPLEX = 11;

	/**
	 * The feature id for the '<em><b>The</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX__THE = UBIQUITOUS__THE;

	/**
	 * The feature id for the '<em><b>Shall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX__SHALL = UBIQUITOUS__SHALL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX__NAME = UBIQUITOUS__NAME;

	/**
	 * The feature id for the '<em><b>Ifthen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX__IFTHEN = UBIQUITOUS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX__WHILE = UBIQUITOUS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX__WHERE = UBIQUITOUS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Complex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FEATURE_COUNT = UBIQUITOUS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Complex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OPERATION_COUNT = UBIQUITOUS_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link eARS.EARS <em>EARS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EARS</em>'.
	 * @see eARS.EARS
	 * @generated
	 */
	EClass getEARS();

	/**
	 * Returns the meta object for the containment reference list '{@link eARS.EARS#getUb <em>Ub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ub</em>'.
	 * @see eARS.EARS#getUb()
	 * @see #getEARS()
	 * @generated
	 */
	EReference getEARS_Ub();

	/**
	 * Returns the meta object for class '{@link eARS.Ubiquitous <em>Ubiquitous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubiquitous</em>'.
	 * @see eARS.Ubiquitous
	 * @generated
	 */
	EClass getUbiquitous();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.Ubiquitous#getThe <em>The</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The</em>'.
	 * @see eARS.Ubiquitous#getThe()
	 * @see #getUbiquitous()
	 * @generated
	 */
	EReference getUbiquitous_The();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.Ubiquitous#getShall <em>Shall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shall</em>'.
	 * @see eARS.Ubiquitous#getShall()
	 * @see #getUbiquitous()
	 * @generated
	 */
	EReference getUbiquitous_Shall();

	/**
	 * Returns the meta object for the attribute '{@link eARS.Ubiquitous#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eARS.Ubiquitous#getName()
	 * @see #getUbiquitous()
	 * @generated
	 */
	EAttribute getUbiquitous_Name();

	/**
	 * Returns the meta object for class '{@link eARS.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see eARS.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the attribute '{@link eARS.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eARS.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for class '{@link eARS.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see eARS.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the attribute '{@link eARS.Response#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eARS.Response#getName()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Name();

	/**
	 * Returns the meta object for class '{@link eARS.EventDriven <em>Event Driven</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Driven</em>'.
	 * @see eARS.EventDriven
	 * @generated
	 */
	EClass getEventDriven();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.EventDriven#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see eARS.EventDriven#getWhen()
	 * @see #getEventDriven()
	 * @generated
	 */
	EReference getEventDriven_When();

	/**
	 * Returns the meta object for class '{@link eARS.Preconditions <em>Preconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preconditions</em>'.
	 * @see eARS.Preconditions
	 * @generated
	 */
	EClass getPreconditions();

	/**
	 * Returns the meta object for the attribute '{@link eARS.Preconditions#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eARS.Preconditions#getName()
	 * @see #getPreconditions()
	 * @generated
	 */
	EAttribute getPreconditions_Name();

	/**
	 * Returns the meta object for class '{@link eARS.UnwantedBehaviour <em>Unwanted Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unwanted Behaviour</em>'.
	 * @see eARS.UnwantedBehaviour
	 * @generated
	 */
	EClass getUnwantedBehaviour();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.UnwantedBehaviour#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see eARS.UnwantedBehaviour#getIf()
	 * @see #getUnwantedBehaviour()
	 * @generated
	 */
	EReference getUnwantedBehaviour_If();

	/**
	 * Returns the meta object for class '{@link eARS.StateDriven <em>State Driven</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Driven</em>'.
	 * @see eARS.StateDriven
	 * @generated
	 */
	EClass getStateDriven();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.StateDriven#getWhile <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While</em>'.
	 * @see eARS.StateDriven#getWhile()
	 * @see #getStateDriven()
	 * @generated
	 */
	EReference getStateDriven_While();

	/**
	 * Returns the meta object for class '{@link eARS.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see eARS.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link eARS.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eARS.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for class '{@link eARS.OptionalFeatures <em>Optional Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional Features</em>'.
	 * @see eARS.OptionalFeatures
	 * @generated
	 */
	EClass getOptionalFeatures();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.OptionalFeatures#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see eARS.OptionalFeatures#getWhere()
	 * @see #getOptionalFeatures()
	 * @generated
	 */
	EReference getOptionalFeatures_Where();

	/**
	 * Returns the meta object for class '{@link eARS.FeatureIs <em>Feature Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Is</em>'.
	 * @see eARS.FeatureIs
	 * @generated
	 */
	EClass getFeatureIs();

	/**
	 * Returns the meta object for the attribute '{@link eARS.FeatureIs#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eARS.FeatureIs#getName()
	 * @see #getFeatureIs()
	 * @generated
	 */
	EAttribute getFeatureIs_Name();

	/**
	 * Returns the meta object for class '{@link eARS.Complex <em>Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex</em>'.
	 * @see eARS.Complex
	 * @generated
	 */
	EClass getComplex();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.Complex#getIfthen <em>Ifthen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ifthen</em>'.
	 * @see eARS.Complex#getIfthen()
	 * @see #getComplex()
	 * @generated
	 */
	EReference getComplex_Ifthen();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.Complex#getWhile <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While</em>'.
	 * @see eARS.Complex#getWhile()
	 * @see #getComplex()
	 * @generated
	 */
	EReference getComplex_While();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.Complex#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see eARS.Complex#getWhere()
	 * @see #getComplex()
	 * @generated
	 */
	EReference getComplex_Where();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EARSFactory getEARSFactory();

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
		 * The meta object literal for the '{@link eARS.impl.EARSImpl <em>EARS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.EARSImpl
		 * @see eARS.impl.EARSPackageImpl#getEARS()
		 * @generated
		 */
		EClass EARS = eINSTANCE.getEARS();

		/**
		 * The meta object literal for the '<em><b>Ub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARS__UB = eINSTANCE.getEARS_Ub();

		/**
		 * The meta object literal for the '{@link eARS.impl.UbiquitousImpl <em>Ubiquitous</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.UbiquitousImpl
		 * @see eARS.impl.EARSPackageImpl#getUbiquitous()
		 * @generated
		 */
		EClass UBIQUITOUS = eINSTANCE.getUbiquitous();

		/**
		 * The meta object literal for the '<em><b>The</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBIQUITOUS__THE = eINSTANCE.getUbiquitous_The();

		/**
		 * The meta object literal for the '<em><b>Shall</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBIQUITOUS__SHALL = eINSTANCE.getUbiquitous_Shall();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBIQUITOUS__NAME = eINSTANCE.getUbiquitous_Name();

		/**
		 * The meta object literal for the '{@link eARS.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.SystemImpl
		 * @see eARS.impl.EARSPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '{@link eARS.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.ResponseImpl
		 * @see eARS.impl.EARSPackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__NAME = eINSTANCE.getResponse_Name();

		/**
		 * The meta object literal for the '{@link eARS.impl.EventDrivenImpl <em>Event Driven</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.EventDrivenImpl
		 * @see eARS.impl.EARSPackageImpl#getEventDriven()
		 * @generated
		 */
		EClass EVENT_DRIVEN = eINSTANCE.getEventDriven();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_DRIVEN__WHEN = eINSTANCE.getEventDriven_When();

		/**
		 * The meta object literal for the '{@link eARS.impl.PreconditionsImpl <em>Preconditions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.PreconditionsImpl
		 * @see eARS.impl.EARSPackageImpl#getPreconditions()
		 * @generated
		 */
		EClass PRECONDITIONS = eINSTANCE.getPreconditions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECONDITIONS__NAME = eINSTANCE.getPreconditions_Name();

		/**
		 * The meta object literal for the '{@link eARS.impl.UnwantedBehaviourImpl <em>Unwanted Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.UnwantedBehaviourImpl
		 * @see eARS.impl.EARSPackageImpl#getUnwantedBehaviour()
		 * @generated
		 */
		EClass UNWANTED_BEHAVIOUR = eINSTANCE.getUnwantedBehaviour();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNWANTED_BEHAVIOUR__IF = eINSTANCE.getUnwantedBehaviour_If();

		/**
		 * The meta object literal for the '{@link eARS.impl.StateDrivenImpl <em>State Driven</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.StateDrivenImpl
		 * @see eARS.impl.EARSPackageImpl#getStateDriven()
		 * @generated
		 */
		EClass STATE_DRIVEN = eINSTANCE.getStateDriven();

		/**
		 * The meta object literal for the '<em><b>While</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_DRIVEN__WHILE = eINSTANCE.getStateDriven_While();

		/**
		 * The meta object literal for the '{@link eARS.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.StateImpl
		 * @see eARS.impl.EARSPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '{@link eARS.impl.OptionalFeaturesImpl <em>Optional Features</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.OptionalFeaturesImpl
		 * @see eARS.impl.EARSPackageImpl#getOptionalFeatures()
		 * @generated
		 */
		EClass OPTIONAL_FEATURES = eINSTANCE.getOptionalFeatures();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONAL_FEATURES__WHERE = eINSTANCE.getOptionalFeatures_Where();

		/**
		 * The meta object literal for the '{@link eARS.impl.FeatureIsImpl <em>Feature Is</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.FeatureIsImpl
		 * @see eARS.impl.EARSPackageImpl#getFeatureIs()
		 * @generated
		 */
		EClass FEATURE_IS = eINSTANCE.getFeatureIs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_IS__NAME = eINSTANCE.getFeatureIs_Name();

		/**
		 * The meta object literal for the '{@link eARS.impl.ComplexImpl <em>Complex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.ComplexImpl
		 * @see eARS.impl.EARSPackageImpl#getComplex()
		 * @generated
		 */
		EClass COMPLEX = eINSTANCE.getComplex();

		/**
		 * The meta object literal for the '<em><b>Ifthen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX__IFTHEN = eINSTANCE.getComplex_Ifthen();

		/**
		 * The meta object literal for the '<em><b>While</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX__WHILE = eINSTANCE.getComplex_While();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX__WHERE = eINSTANCE.getComplex_Where();

	}

} //EARSPackage
