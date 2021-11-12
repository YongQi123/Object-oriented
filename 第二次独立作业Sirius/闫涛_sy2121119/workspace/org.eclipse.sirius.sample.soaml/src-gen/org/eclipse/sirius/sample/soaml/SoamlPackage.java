/**
 */
package org.eclipse.sirius.sample.soaml;

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
 * @see org.eclipse.sirius.sample.soaml.SoamlFactory
 * @model kind="package"
 * @generated
 */
public interface SoamlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "soaml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/sirius/sample/soaml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "soaml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoamlPackage eINSTANCE = org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.ParticipantImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 0;

	/**
	 * The feature id for the '<em><b>Capabilityrealization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__CAPABILITYREALIZATION = 0;

	/**
	 * The feature id for the '<em><b>Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__CONSUMER = 1;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__PROVIDER = 2;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.AgentImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 1;

	/**
	 * The feature id for the '<em><b>Capabilityrealization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__CAPABILITYREALIZATION = PARTICIPANT__CAPABILITYREALIZATION;

	/**
	 * The feature id for the '<em><b>Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__CONSUMER = PARTICIPANT__CONSUMER;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__PROVIDER = PARTICIPANT__PROVIDER;

	/**
	 * The feature id for the '<em><b>Collaboration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__COLLABORATION = PARTICIPANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = PARTICIPANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = PARTICIPANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.CapabilityRealizationImpl <em>Capability Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.CapabilityRealizationImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getCapabilityRealization()
	 * @generated
	 */
	int CAPABILITY_REALIZATION = 2;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION__CAPABILITY = 0;

	/**
	 * The number of structural features of the '<em>Capability Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Capability Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.ConsumerImpl <em>Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.ConsumerImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getConsumer()
	 * @generated
	 */
	int CONSUMER = 3;

	/**
	 * The number of structural features of the '<em>Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.ProviderImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 4;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.CapabilityImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 5;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.CapabilityExposureImpl <em>Capability Exposure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.CapabilityExposureImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getCapabilityExposure()
	 * @generated
	 */
	int CAPABILITY_EXPOSURE = 6;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_EXPOSURE__CAPABILITY = 0;

	/**
	 * The number of structural features of the '<em>Capability Exposure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_EXPOSURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Capability Exposure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_EXPOSURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.ServiceInerfaceImpl <em>Service Inerface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.ServiceInerfaceImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getServiceInerface()
	 * @generated
	 */
	int SERVICE_INERFACE = 7;

	/**
	 * The feature id for the '<em><b>Capabilityexposure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INERFACE__CAPABILITYEXPOSURE = 0;

	/**
	 * The number of structural features of the '<em>Service Inerface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INERFACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Inerface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.RequestImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 8;

	/**
	 * The feature id for the '<em><b>Serviceinerface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__SERVICEINERFACE = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__PORT = 1;

	/**
	 * The feature id for the '<em><b>Servicechannel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__SERVICECHANNEL = 2;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.ServiceImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 9;

	/**
	 * The feature id for the '<em><b>Serviceinerface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICEINERFACE = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PORT = 1;

	/**
	 * The feature id for the '<em><b>Servicechannel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICECHANNEL = 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.PortImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 10;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.ServiceChannelImpl <em>Service Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.ServiceChannelImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getServiceChannel()
	 * @generated
	 */
	int SERVICE_CHANNEL = 11;

	/**
	 * The number of structural features of the '<em>Service Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CHANNEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Service Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CHANNEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.CollaborationImpl <em>Collaboration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.CollaborationImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getCollaboration()
	 * @generated
	 */
	int COLLABORATION = 12;

	/**
	 * The number of structural features of the '<em>Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.ServiceArchitectureImpl <em>Service Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.ServiceArchitectureImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getServiceArchitecture()
	 * @generated
	 */
	int SERVICE_ARCHITECTURE = 13;

	/**
	 * The number of structural features of the '<em>Service Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ARCHITECTURE_FEATURE_COUNT = COLLABORATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ARCHITECTURE_OPERATION_COUNT = COLLABORATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.ServiceContractImpl <em>Service Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.ServiceContractImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getServiceContract()
	 * @generated
	 */
	int SERVICE_CONTRACT = 14;

	/**
	 * The number of structural features of the '<em>Service Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTRACT_FEATURE_COUNT = COLLABORATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTRACT_OPERATION_COUNT = COLLABORATION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.Participant#getCapabilityrealization <em>Capabilityrealization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilityrealization</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Participant#getCapabilityrealization()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Capabilityrealization();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.soaml.Participant#getConsumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consumer</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Participant#getConsumer()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Consumer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.soaml.Participant#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provider</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Participant#getProvider()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Provider();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.soaml.Agent#getCollaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Collaboration</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Agent#getCollaboration()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Collaboration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.CapabilityRealization <em>Capability Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Realization</em>'.
	 * @see org.eclipse.sirius.sample.soaml.CapabilityRealization
	 * @generated
	 */
	EClass getCapabilityRealization();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.soaml.CapabilityRealization#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability</em>'.
	 * @see org.eclipse.sirius.sample.soaml.CapabilityRealization#getCapability()
	 * @see #getCapabilityRealization()
	 * @generated
	 */
	EReference getCapabilityRealization_Capability();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.Consumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumer</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Consumer
	 * @generated
	 */
	EClass getConsumer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.CapabilityExposure <em>Capability Exposure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Exposure</em>'.
	 * @see org.eclipse.sirius.sample.soaml.CapabilityExposure
	 * @generated
	 */
	EClass getCapabilityExposure();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.soaml.CapabilityExposure#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability</em>'.
	 * @see org.eclipse.sirius.sample.soaml.CapabilityExposure#getCapability()
	 * @see #getCapabilityExposure()
	 * @generated
	 */
	EReference getCapabilityExposure_Capability();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.ServiceInerface <em>Service Inerface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Inerface</em>'.
	 * @see org.eclipse.sirius.sample.soaml.ServiceInerface
	 * @generated
	 */
	EClass getServiceInerface();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.ServiceInerface#getCapabilityexposure <em>Capabilityexposure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilityexposure</em>'.
	 * @see org.eclipse.sirius.sample.soaml.ServiceInerface#getCapabilityexposure()
	 * @see #getServiceInerface()
	 * @generated
	 */
	EReference getServiceInerface_Capabilityexposure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.soaml.Request#getServiceinerface <em>Serviceinerface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serviceinerface</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Request#getServiceinerface()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Serviceinerface();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.soaml.Request#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Request#getPort()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Port();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.soaml.Request#getServicechannel <em>Servicechannel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servicechannel</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Request#getServicechannel()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Servicechannel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.soaml.Service#getServiceinerface <em>Serviceinerface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serviceinerface</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Service#getServiceinerface()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Serviceinerface();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.soaml.Service#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Service#getPort()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Port();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.soaml.Service#getServicechannel <em>Servicechannel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servicechannel</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Service#getServicechannel()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Servicechannel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.ServiceChannel <em>Service Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Channel</em>'.
	 * @see org.eclipse.sirius.sample.soaml.ServiceChannel
	 * @generated
	 */
	EClass getServiceChannel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.Collaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaboration</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Collaboration
	 * @generated
	 */
	EClass getCollaboration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.ServiceArchitecture <em>Service Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Architecture</em>'.
	 * @see org.eclipse.sirius.sample.soaml.ServiceArchitecture
	 * @generated
	 */
	EClass getServiceArchitecture();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.ServiceContract <em>Service Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Contract</em>'.
	 * @see org.eclipse.sirius.sample.soaml.ServiceContract
	 * @generated
	 */
	EClass getServiceContract();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SoamlFactory getSoamlFactory();

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
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.ParticipantImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Capabilityrealization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__CAPABILITYREALIZATION = eINSTANCE.getParticipant_Capabilityrealization();

		/**
		 * The meta object literal for the '<em><b>Consumer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__CONSUMER = eINSTANCE.getParticipant_Consumer();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__PROVIDER = eINSTANCE.getParticipant_Provider();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.AgentImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Collaboration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__COLLABORATION = eINSTANCE.getAgent_Collaboration();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.CapabilityRealizationImpl <em>Capability Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.CapabilityRealizationImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getCapabilityRealization()
		 * @generated
		 */
		EClass CAPABILITY_REALIZATION = eINSTANCE.getCapabilityRealization();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_REALIZATION__CAPABILITY = eINSTANCE.getCapabilityRealization_Capability();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.ConsumerImpl <em>Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.ConsumerImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getConsumer()
		 * @generated
		 */
		EClass CONSUMER = eINSTANCE.getConsumer();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.ProviderImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.CapabilityImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.CapabilityExposureImpl <em>Capability Exposure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.CapabilityExposureImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getCapabilityExposure()
		 * @generated
		 */
		EClass CAPABILITY_EXPOSURE = eINSTANCE.getCapabilityExposure();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_EXPOSURE__CAPABILITY = eINSTANCE.getCapabilityExposure_Capability();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.ServiceInerfaceImpl <em>Service Inerface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.ServiceInerfaceImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getServiceInerface()
		 * @generated
		 */
		EClass SERVICE_INERFACE = eINSTANCE.getServiceInerface();

		/**
		 * The meta object literal for the '<em><b>Capabilityexposure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INERFACE__CAPABILITYEXPOSURE = eINSTANCE.getServiceInerface_Capabilityexposure();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.RequestImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Serviceinerface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__SERVICEINERFACE = eINSTANCE.getRequest_Serviceinerface();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__PORT = eINSTANCE.getRequest_Port();

		/**
		 * The meta object literal for the '<em><b>Servicechannel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__SERVICECHANNEL = eINSTANCE.getRequest_Servicechannel();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.ServiceImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Serviceinerface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SERVICEINERFACE = eINSTANCE.getService_Serviceinerface();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PORT = eINSTANCE.getService_Port();

		/**
		 * The meta object literal for the '<em><b>Servicechannel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SERVICECHANNEL = eINSTANCE.getService_Servicechannel();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.PortImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.ServiceChannelImpl <em>Service Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.ServiceChannelImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getServiceChannel()
		 * @generated
		 */
		EClass SERVICE_CHANNEL = eINSTANCE.getServiceChannel();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.CollaborationImpl <em>Collaboration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.CollaborationImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getCollaboration()
		 * @generated
		 */
		EClass COLLABORATION = eINSTANCE.getCollaboration();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.ServiceArchitectureImpl <em>Service Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.ServiceArchitectureImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getServiceArchitecture()
		 * @generated
		 */
		EClass SERVICE_ARCHITECTURE = eINSTANCE.getServiceArchitecture();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.ServiceContractImpl <em>Service Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.ServiceContractImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getServiceContract()
		 * @generated
		 */
		EClass SERVICE_CONTRACT = eINSTANCE.getServiceContract();

	}

} //SoamlPackage
