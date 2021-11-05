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
	 * The feature id for the '<em><b>Ev</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS__EV = 1;

	/**
	 * The feature id for the '<em><b>St</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS__ST = 2;

	/**
	 * The feature id for the '<em><b>Uw</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS__UW = 3;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS__OP = 4;

	/**
	 * The feature id for the '<em><b>Hy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS__HY = 5;

	/**
	 * The number of structural features of the '<em>EARS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>EARS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eARS.impl.UBImpl <em>UB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.UBImpl
	 * @see eARS.impl.EARSPackageImpl#getUB()
	 * @generated
	 */
	int UB = 1;

	/**
	 * The feature id for the '<em><b>The</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UB__THE = 0;

	/**
	 * The feature id for the '<em><b>Shall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UB__SHALL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UB__NAME = 2;

	/**
	 * The number of structural features of the '<em>UB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UB_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>UB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eARS.impl.SystemNameImpl <em>System Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.SystemNameImpl
	 * @see eARS.impl.EARSPackageImpl#getSystemName()
	 * @generated
	 */
	int SYSTEM_NAME = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_NAME__NAME = 0;

	/**
	 * The number of structural features of the '<em>System Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_NAME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>System Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eARS.impl.SystemResponseImpl <em>System Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.SystemResponseImpl
	 * @see eARS.impl.EARSPackageImpl#getSystemResponse()
	 * @generated
	 */
	int SYSTEM_RESPONSE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESPONSE__NAME = 0;

	/**
	 * The number of structural features of the '<em>System Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>System Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eARS.impl.EVImpl <em>EV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.EVImpl
	 * @see eARS.impl.EARSPackageImpl#getEV()
	 * @generated
	 */
	int EV = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV__NAME = 0;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV__WHEN = 1;

	/**
	 * The feature id for the '<em><b>The</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV__THE = 2;

	/**
	 * The feature id for the '<em><b>Shall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV__SHALL = 3;

	/**
	 * The number of structural features of the '<em>EV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>EV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eARS.impl.OptionalPreconditionsImpl <em>Optional Preconditions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.OptionalPreconditionsImpl
	 * @see eARS.impl.EARSPackageImpl#getOptionalPreconditions()
	 * @generated
	 */
	int OPTIONAL_PRECONDITIONS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_PRECONDITIONS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Optional Preconditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_PRECONDITIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Optional Preconditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_PRECONDITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eARS.impl.STImpl <em>ST</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.STImpl
	 * @see eARS.impl.EARSPackageImpl#getST()
	 * @generated
	 */
	int ST = 7;

	/**
	 * The meta object id for the '{@link eARS.impl.InASpecificStateImpl <em>In ASpecific State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.InASpecificStateImpl
	 * @see eARS.impl.EARSPackageImpl#getInASpecificState()
	 * @generated
	 */
	int IN_ASPECIFIC_STATE = 8;

	/**
	 * The meta object id for the '{@link eARS.impl.UWImpl <em>UW</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.UWImpl
	 * @see eARS.impl.EARSPackageImpl#getUW()
	 * @generated
	 */
	int UW = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UW__NAME = 0;

	/**
	 * The feature id for the '<em><b>The</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UW__THE = 1;

	/**
	 * The feature id for the '<em><b>Shall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UW__SHALL = 2;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UW__IF = 3;

	/**
	 * The number of structural features of the '<em>UW</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UW_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>UW</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UW_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST__NAME = 0;

	/**
	 * The feature id for the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST__WHILE = 1;

	/**
	 * The feature id for the '<em><b>Shall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST__SHALL = 2;

	/**
	 * The feature id for the '<em><b>The</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST__THE = 3;

	/**
	 * The number of structural features of the '<em>ST</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>ST</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ST_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_ASPECIFIC_STATE__NAME = 0;

	/**
	 * The number of structural features of the '<em>In ASpecific State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_ASPECIFIC_STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>In ASpecific State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_ASPECIFIC_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eARS.impl.OPImpl <em>OP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.OPImpl
	 * @see eARS.impl.EARSPackageImpl#getOP()
	 * @generated
	 */
	int OP = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__WHERE = 1;

	/**
	 * The feature id for the '<em><b>The</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__THE = 2;

	/**
	 * The feature id for the '<em><b>Shall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__SHALL = 3;

	/**
	 * The number of structural features of the '<em>OP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>OP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eARS.impl.FeatureIsIncludedImpl <em>Feature Is Included</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.FeatureIsIncludedImpl
	 * @see eARS.impl.EARSPackageImpl#getFeatureIsIncluded()
	 * @generated
	 */
	int FEATURE_IS_INCLUDED = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IS_INCLUDED__NAME = 0;

	/**
	 * The number of structural features of the '<em>Feature Is Included</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IS_INCLUDED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Feature Is Included</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IS_INCLUDED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eARS.impl.HYImpl <em>HY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eARS.impl.HYImpl
	 * @see eARS.impl.EARSPackageImpl#getHY()
	 * @generated
	 */
	int HY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ifthen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HY__IFTHEN = 1;

	/**
	 * The feature id for the '<em><b>Shall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HY__SHALL = 2;

	/**
	 * The feature id for the '<em><b>The</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HY__THE = 3;

	/**
	 * The feature id for the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HY__WHILE = 4;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HY__WHERE = 5;

	/**
	 * The number of structural features of the '<em>HY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>HY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HY_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the containment reference list '{@link eARS.EARS#getEv <em>Ev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ev</em>'.
	 * @see eARS.EARS#getEv()
	 * @see #getEARS()
	 * @generated
	 */
	EReference getEARS_Ev();

	/**
	 * Returns the meta object for the containment reference list '{@link eARS.EARS#getSt <em>St</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>St</em>'.
	 * @see eARS.EARS#getSt()
	 * @see #getEARS()
	 * @generated
	 */
	EReference getEARS_St();

	/**
	 * Returns the meta object for the containment reference list '{@link eARS.EARS#getUw <em>Uw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uw</em>'.
	 * @see eARS.EARS#getUw()
	 * @see #getEARS()
	 * @generated
	 */
	EReference getEARS_Uw();

	/**
	 * Returns the meta object for the containment reference list '{@link eARS.EARS#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Op</em>'.
	 * @see eARS.EARS#getOp()
	 * @see #getEARS()
	 * @generated
	 */
	EReference getEARS_Op();

	/**
	 * Returns the meta object for the containment reference list '{@link eARS.EARS#getHy <em>Hy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hy</em>'.
	 * @see eARS.EARS#getHy()
	 * @see #getEARS()
	 * @generated
	 */
	EReference getEARS_Hy();

	/**
	 * Returns the meta object for class '{@link eARS.UB <em>UB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UB</em>'.
	 * @see eARS.UB
	 * @generated
	 */
	EClass getUB();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.UB#getThe <em>The</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The</em>'.
	 * @see eARS.UB#getThe()
	 * @see #getUB()
	 * @generated
	 */
	EReference getUB_The();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.UB#getShall <em>Shall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shall</em>'.
	 * @see eARS.UB#getShall()
	 * @see #getUB()
	 * @generated
	 */
	EReference getUB_Shall();

	/**
	 * Returns the meta object for the attribute '{@link eARS.UB#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eARS.UB#getName()
	 * @see #getUB()
	 * @generated
	 */
	EAttribute getUB_Name();

	/**
	 * Returns the meta object for class '{@link eARS.SystemName <em>System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Name</em>'.
	 * @see eARS.SystemName
	 * @generated
	 */
	EClass getSystemName();

	/**
	 * Returns the meta object for the attribute '{@link eARS.SystemName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eARS.SystemName#getName()
	 * @see #getSystemName()
	 * @generated
	 */
	EAttribute getSystemName_Name();

	/**
	 * Returns the meta object for class '{@link eARS.SystemResponse <em>System Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Response</em>'.
	 * @see eARS.SystemResponse
	 * @generated
	 */
	EClass getSystemResponse();

	/**
	 * Returns the meta object for the attribute '{@link eARS.SystemResponse#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eARS.SystemResponse#getName()
	 * @see #getSystemResponse()
	 * @generated
	 */
	EAttribute getSystemResponse_Name();

	/**
	 * Returns the meta object for class '{@link eARS.EV <em>EV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EV</em>'.
	 * @see eARS.EV
	 * @generated
	 */
	EClass getEV();

	/**
	 * Returns the meta object for the attribute '{@link eARS.EV#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eARS.EV#getName()
	 * @see #getEV()
	 * @generated
	 */
	EAttribute getEV_Name();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.EV#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see eARS.EV#getWhen()
	 * @see #getEV()
	 * @generated
	 */
	EReference getEV_When();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.EV#getThe <em>The</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The</em>'.
	 * @see eARS.EV#getThe()
	 * @see #getEV()
	 * @generated
	 */
	EReference getEV_The();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.EV#getShall <em>Shall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shall</em>'.
	 * @see eARS.EV#getShall()
	 * @see #getEV()
	 * @generated
	 */
	EReference getEV_Shall();

	/**
	 * Returns the meta object for class '{@link eARS.OptionalPreconditions <em>Optional Preconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional Preconditions</em>'.
	 * @see eARS.OptionalPreconditions
	 * @generated
	 */
	EClass getOptionalPreconditions();

	/**
	 * Returns the meta object for the attribute '{@link eARS.OptionalPreconditions#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eARS.OptionalPreconditions#getName()
	 * @see #getOptionalPreconditions()
	 * @generated
	 */
	EAttribute getOptionalPreconditions_Name();

	/**
	 * Returns the meta object for class '{@link eARS.ST <em>ST</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ST</em>'.
	 * @see eARS.ST
	 * @generated
	 */
	EClass getST();

	/**
	 * Returns the meta object for the attribute '{@link eARS.ST#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eARS.ST#getName()
	 * @see #getST()
	 * @generated
	 */
	EAttribute getST_Name();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.ST#getWhile <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While</em>'.
	 * @see eARS.ST#getWhile()
	 * @see #getST()
	 * @generated
	 */
	EReference getST_While();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.ST#getShall <em>Shall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shall</em>'.
	 * @see eARS.ST#getShall()
	 * @see #getST()
	 * @generated
	 */
	EReference getST_Shall();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.ST#getThe <em>The</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The</em>'.
	 * @see eARS.ST#getThe()
	 * @see #getST()
	 * @generated
	 */
	EReference getST_The();

	/**
	 * Returns the meta object for class '{@link eARS.InASpecificState <em>In ASpecific State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In ASpecific State</em>'.
	 * @see eARS.InASpecificState
	 * @generated
	 */
	EClass getInASpecificState();

	/**
	 * Returns the meta object for the attribute '{@link eARS.InASpecificState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eARS.InASpecificState#getName()
	 * @see #getInASpecificState()
	 * @generated
	 */
	EAttribute getInASpecificState_Name();

	/**
	 * Returns the meta object for class '{@link eARS.UW <em>UW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UW</em>'.
	 * @see eARS.UW
	 * @generated
	 */
	EClass getUW();

	/**
	 * Returns the meta object for the attribute '{@link eARS.UW#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eARS.UW#getName()
	 * @see #getUW()
	 * @generated
	 */
	EAttribute getUW_Name();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.UW#getThe <em>The</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The</em>'.
	 * @see eARS.UW#getThe()
	 * @see #getUW()
	 * @generated
	 */
	EReference getUW_The();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.UW#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see eARS.UW#getIf()
	 * @see #getUW()
	 * @generated
	 */
	EReference getUW_If();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.UW#getShall <em>Shall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shall</em>'.
	 * @see eARS.UW#getShall()
	 * @see #getUW()
	 * @generated
	 */
	EReference getUW_Shall();

	/**
	 * Returns the meta object for class '{@link eARS.OP <em>OP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OP</em>'.
	 * @see eARS.OP
	 * @generated
	 */
	EClass getOP();

	/**
	 * Returns the meta object for the attribute '{@link eARS.OP#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eARS.OP#getName()
	 * @see #getOP()
	 * @generated
	 */
	EAttribute getOP_Name();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.OP#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see eARS.OP#getWhere()
	 * @see #getOP()
	 * @generated
	 */
	EReference getOP_Where();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.OP#getThe <em>The</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The</em>'.
	 * @see eARS.OP#getThe()
	 * @see #getOP()
	 * @generated
	 */
	EReference getOP_The();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.OP#getShall <em>Shall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shall</em>'.
	 * @see eARS.OP#getShall()
	 * @see #getOP()
	 * @generated
	 */
	EReference getOP_Shall();

	/**
	 * Returns the meta object for class '{@link eARS.FeatureIsIncluded <em>Feature Is Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Is Included</em>'.
	 * @see eARS.FeatureIsIncluded
	 * @generated
	 */
	EClass getFeatureIsIncluded();

	/**
	 * Returns the meta object for the attribute '{@link eARS.FeatureIsIncluded#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eARS.FeatureIsIncluded#getName()
	 * @see #getFeatureIsIncluded()
	 * @generated
	 */
	EAttribute getFeatureIsIncluded_Name();

	/**
	 * Returns the meta object for class '{@link eARS.HY <em>HY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HY</em>'.
	 * @see eARS.HY
	 * @generated
	 */
	EClass getHY();

	/**
	 * Returns the meta object for the attribute '{@link eARS.HY#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eARS.HY#getName()
	 * @see #getHY()
	 * @generated
	 */
	EAttribute getHY_Name();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.HY#getWhile <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While</em>'.
	 * @see eARS.HY#getWhile()
	 * @see #getHY()
	 * @generated
	 */
	EReference getHY_While();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.HY#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see eARS.HY#getWhere()
	 * @see #getHY()
	 * @generated
	 */
	EReference getHY_Where();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.HY#getShall <em>Shall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shall</em>'.
	 * @see eARS.HY#getShall()
	 * @see #getHY()
	 * @generated
	 */
	EReference getHY_Shall();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.HY#getThe <em>The</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The</em>'.
	 * @see eARS.HY#getThe()
	 * @see #getHY()
	 * @generated
	 */
	EReference getHY_The();

	/**
	 * Returns the meta object for the containment reference '{@link eARS.HY#getIfthen <em>Ifthen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ifthen</em>'.
	 * @see eARS.HY#getIfthen()
	 * @see #getHY()
	 * @generated
	 */
	EReference getHY_Ifthen();

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
		 * The meta object literal for the '<em><b>Ev</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARS__EV = eINSTANCE.getEARS_Ev();

		/**
		 * The meta object literal for the '<em><b>St</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARS__ST = eINSTANCE.getEARS_St();

		/**
		 * The meta object literal for the '<em><b>Uw</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARS__UW = eINSTANCE.getEARS_Uw();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARS__OP = eINSTANCE.getEARS_Op();

		/**
		 * The meta object literal for the '<em><b>Hy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARS__HY = eINSTANCE.getEARS_Hy();

		/**
		 * The meta object literal for the '{@link eARS.impl.UBImpl <em>UB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.UBImpl
		 * @see eARS.impl.EARSPackageImpl#getUB()
		 * @generated
		 */
		EClass UB = eINSTANCE.getUB();

		/**
		 * The meta object literal for the '<em><b>The</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UB__THE = eINSTANCE.getUB_The();

		/**
		 * The meta object literal for the '<em><b>Shall</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UB__SHALL = eINSTANCE.getUB_Shall();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UB__NAME = eINSTANCE.getUB_Name();

		/**
		 * The meta object literal for the '{@link eARS.impl.SystemNameImpl <em>System Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.SystemNameImpl
		 * @see eARS.impl.EARSPackageImpl#getSystemName()
		 * @generated
		 */
		EClass SYSTEM_NAME = eINSTANCE.getSystemName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_NAME__NAME = eINSTANCE.getSystemName_Name();

		/**
		 * The meta object literal for the '{@link eARS.impl.SystemResponseImpl <em>System Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.SystemResponseImpl
		 * @see eARS.impl.EARSPackageImpl#getSystemResponse()
		 * @generated
		 */
		EClass SYSTEM_RESPONSE = eINSTANCE.getSystemResponse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_RESPONSE__NAME = eINSTANCE.getSystemResponse_Name();

		/**
		 * The meta object literal for the '{@link eARS.impl.EVImpl <em>EV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.EVImpl
		 * @see eARS.impl.EARSPackageImpl#getEV()
		 * @generated
		 */
		EClass EV = eINSTANCE.getEV();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EV__NAME = eINSTANCE.getEV_Name();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EV__WHEN = eINSTANCE.getEV_When();

		/**
		 * The meta object literal for the '<em><b>The</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EV__THE = eINSTANCE.getEV_The();

		/**
		 * The meta object literal for the '<em><b>Shall</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EV__SHALL = eINSTANCE.getEV_Shall();

		/**
		 * The meta object literal for the '{@link eARS.impl.OptionalPreconditionsImpl <em>Optional Preconditions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.OptionalPreconditionsImpl
		 * @see eARS.impl.EARSPackageImpl#getOptionalPreconditions()
		 * @generated
		 */
		EClass OPTIONAL_PRECONDITIONS = eINSTANCE.getOptionalPreconditions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONAL_PRECONDITIONS__NAME = eINSTANCE.getOptionalPreconditions_Name();

		/**
		 * The meta object literal for the '{@link eARS.impl.STImpl <em>ST</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.STImpl
		 * @see eARS.impl.EARSPackageImpl#getST()
		 * @generated
		 */
		EClass ST = eINSTANCE.getST();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ST__NAME = eINSTANCE.getST_Name();

		/**
		 * The meta object literal for the '<em><b>While</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ST__WHILE = eINSTANCE.getST_While();

		/**
		 * The meta object literal for the '<em><b>Shall</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ST__SHALL = eINSTANCE.getST_Shall();

		/**
		 * The meta object literal for the '<em><b>The</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ST__THE = eINSTANCE.getST_The();

		/**
		 * The meta object literal for the '{@link eARS.impl.InASpecificStateImpl <em>In ASpecific State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.InASpecificStateImpl
		 * @see eARS.impl.EARSPackageImpl#getInASpecificState()
		 * @generated
		 */
		EClass IN_ASPECIFIC_STATE = eINSTANCE.getInASpecificState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_ASPECIFIC_STATE__NAME = eINSTANCE.getInASpecificState_Name();

		/**
		 * The meta object literal for the '{@link eARS.impl.UWImpl <em>UW</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.UWImpl
		 * @see eARS.impl.EARSPackageImpl#getUW()
		 * @generated
		 */
		EClass UW = eINSTANCE.getUW();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UW__NAME = eINSTANCE.getUW_Name();

		/**
		 * The meta object literal for the '<em><b>The</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UW__THE = eINSTANCE.getUW_The();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UW__IF = eINSTANCE.getUW_If();

		/**
		 * The meta object literal for the '<em><b>Shall</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UW__SHALL = eINSTANCE.getUW_Shall();

		/**
		 * The meta object literal for the '{@link eARS.impl.OPImpl <em>OP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.OPImpl
		 * @see eARS.impl.EARSPackageImpl#getOP()
		 * @generated
		 */
		EClass OP = eINSTANCE.getOP();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP__NAME = eINSTANCE.getOP_Name();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP__WHERE = eINSTANCE.getOP_Where();

		/**
		 * The meta object literal for the '<em><b>The</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP__THE = eINSTANCE.getOP_The();

		/**
		 * The meta object literal for the '<em><b>Shall</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP__SHALL = eINSTANCE.getOP_Shall();

		/**
		 * The meta object literal for the '{@link eARS.impl.FeatureIsIncludedImpl <em>Feature Is Included</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.FeatureIsIncludedImpl
		 * @see eARS.impl.EARSPackageImpl#getFeatureIsIncluded()
		 * @generated
		 */
		EClass FEATURE_IS_INCLUDED = eINSTANCE.getFeatureIsIncluded();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_IS_INCLUDED__NAME = eINSTANCE.getFeatureIsIncluded_Name();

		/**
		 * The meta object literal for the '{@link eARS.impl.HYImpl <em>HY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eARS.impl.HYImpl
		 * @see eARS.impl.EARSPackageImpl#getHY()
		 * @generated
		 */
		EClass HY = eINSTANCE.getHY();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HY__NAME = eINSTANCE.getHY_Name();

		/**
		 * The meta object literal for the '<em><b>While</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HY__WHILE = eINSTANCE.getHY_While();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HY__WHERE = eINSTANCE.getHY_Where();

		/**
		 * The meta object literal for the '<em><b>Shall</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HY__SHALL = eINSTANCE.getHY_Shall();

		/**
		 * The meta object literal for the '<em><b>The</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HY__THE = eINSTANCE.getHY_The();

		/**
		 * The meta object literal for the '<em><b>Ifthen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HY__IFTHEN = eINSTANCE.getHY_Ifthen();

	}

} //EARSPackage
