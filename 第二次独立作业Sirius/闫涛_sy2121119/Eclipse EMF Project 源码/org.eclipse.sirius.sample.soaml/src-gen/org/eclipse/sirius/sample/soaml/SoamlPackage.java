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
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.SoaMLImpl <em>Soa ML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.SoaMLImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getSoaML()
	 * @generated
	 */
	int SOA_ML = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOA_ML__PORT = 0;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOA_ML__PARTICIPANT = 1;

	/**
	 * The feature id for the '<em><b>Collaboration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOA_ML__COLLABORATION = 2;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOA_ML__CAPABILITY = 3;

	/**
	 * The number of structural features of the '<em>Soa ML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOA_ML_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Soa ML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOA_ML_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.PortImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 1;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__SERVICE = 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.NewEClass3Impl <em>New EClass3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.NewEClass3Impl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getNewEClass3()
	 * @generated
	 */
	int NEW_ECLASS3 = 2;

	/**
	 * The number of structural features of the '<em>New EClass3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS3_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>New EClass3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS3_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.RequestImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Serviceinterface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__SERVICEINTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = 1;

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
	int SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Serviceinterface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICEINTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.ServiceInterfaceImpl <em>Service Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.ServiceInterfaceImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getServiceInterface()
	 * @generated
	 */
	int SERVICE_INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Capabilityexposure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__CAPABILITYEXPOSURE = 0;

	/**
	 * The number of structural features of the '<em>Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.ParticipantImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 6;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__AGENT = 1;

	/**
	 * The feature id for the '<em><b>Consumer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__CONSUMER = 2;

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
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.ProviderImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 7;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Servicecontract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__SERVICECONTRACT = 2;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.AgentImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 8;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.ConsumerImpl <em>Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.ConsumerImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getConsumer()
	 * @generated
	 */
	int CONSUMER = 9;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Servicecontract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__SERVICECONTRACT = 2;

	/**
	 * The number of structural features of the '<em>Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.MessageImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 10;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ATTACHMENT = 0;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.AttachmentImpl <em>Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.AttachmentImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getAttachment()
	 * @generated
	 */
	int ATTACHMENT = 11;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Servicecontract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__SERVICECONTRACT = 0;

	/**
	 * The feature id for the '<em><b>Servicearchitecture</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__SERVICEARCHITECTURE = 1;

	/**
	 * The number of structural features of the '<em>Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.ServiceContractImpl <em>Service Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.ServiceContractImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getServiceContract()
	 * @generated
	 */
	int SERVICE_CONTRACT = 13;

	/**
	 * The number of structural features of the '<em>Service Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Service Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.ServiceArchitectureImpl <em>Service Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.ServiceArchitectureImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getServiceArchitecture()
	 * @generated
	 */
	int SERVICE_ARCHITECTURE = 14;

	/**
	 * The number of structural features of the '<em>Service Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ARCHITECTURE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Service Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ARCHITECTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.CapabilityImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 15;

	/**
	 * The feature id for the '<em><b>Capabilityexposure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__CAPABILITYEXPOSURE = 0;

	/**
	 * The feature id for the '<em><b>Capabilityrealization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__CAPABILITYREALIZATION = 1;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = 2;

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
	int CAPABILITY_EXPOSURE = 16;

	/**
	 * The number of structural features of the '<em>Capability Exposure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_EXPOSURE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Capability Exposure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_EXPOSURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.soaml.impl.CapabilityRealizationImpl <em>Capability Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.soaml.impl.CapabilityRealizationImpl
	 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getCapabilityRealization()
	 * @generated
	 */
	int CAPABILITY_REALIZATION = 17;

	/**
	 * The number of structural features of the '<em>Capability Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Capability Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_REALIZATION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.SoaML <em>Soa ML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soa ML</em>'.
	 * @see org.eclipse.sirius.sample.soaml.SoaML
	 * @generated
	 */
	EClass getSoaML();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.SoaML#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see org.eclipse.sirius.sample.soaml.SoaML#getPort()
	 * @see #getSoaML()
	 * @generated
	 */
	EReference getSoaML_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.SoaML#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see org.eclipse.sirius.sample.soaml.SoaML#getParticipant()
	 * @see #getSoaML()
	 * @generated
	 */
	EReference getSoaML_Participant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.SoaML#getCollaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collaboration</em>'.
	 * @see org.eclipse.sirius.sample.soaml.SoaML#getCollaboration()
	 * @see #getSoaML()
	 * @generated
	 */
	EReference getSoaML_Collaboration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.SoaML#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability</em>'.
	 * @see org.eclipse.sirius.sample.soaml.SoaML#getCapability()
	 * @see #getSoaML()
	 * @generated
	 */
	EReference getSoaML_Capability();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.Port#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Request</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Port#getRequest()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Request();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.Port#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Port#getService()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Service();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.NewEClass3 <em>New EClass3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New EClass3</em>'.
	 * @see org.eclipse.sirius.sample.soaml.NewEClass3
	 * @generated
	 */
	EClass getNewEClass3();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.Request#getServiceinterface <em>Serviceinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serviceinterface</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Request#getServiceinterface()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Serviceinterface();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.Service#getServiceinterface <em>Serviceinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serviceinterface</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Service#getServiceinterface()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Serviceinterface();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.ServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Interface</em>'.
	 * @see org.eclipse.sirius.sample.soaml.ServiceInterface
	 * @generated
	 */
	EClass getServiceInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.ServiceInterface#getCapabilityexposure <em>Capabilityexposure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilityexposure</em>'.
	 * @see org.eclipse.sirius.sample.soaml.ServiceInterface#getCapabilityexposure()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EReference getServiceInterface_Capabilityexposure();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.Participant#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provider</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Participant#getProvider()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Provider();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.Participant#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agent</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Participant#getAgent()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Agent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.Participant#getConsumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consumer</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Participant#getConsumer()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Consumer();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.Provider#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Provider#getMessage()
	 * @see #getProvider()
	 * @generated
	 */
	EReference getProvider_Message();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.Provider#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Provider#getService()
	 * @see #getProvider()
	 * @generated
	 */
	EReference getProvider_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.Provider#getServicecontract <em>Servicecontract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servicecontract</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Provider#getServicecontract()
	 * @see #getProvider()
	 * @generated
	 */
	EReference getProvider_Servicecontract();

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
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.Consumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumer</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Consumer
	 * @generated
	 */
	EClass getConsumer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.Consumer#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Consumer#getMessage()
	 * @see #getConsumer()
	 * @generated
	 */
	EReference getConsumer_Message();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.Consumer#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Consumer#getService()
	 * @see #getConsumer()
	 * @generated
	 */
	EReference getConsumer_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.Consumer#getServicecontract <em>Servicecontract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servicecontract</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Consumer#getServicecontract()
	 * @see #getConsumer()
	 * @generated
	 */
	EReference getConsumer_Servicecontract();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.Message#getAttachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attachment</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Message#getAttachment()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Attachment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Attachment
	 * @generated
	 */
	EClass getAttachment();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.Collaboration#getServicecontract <em>Servicecontract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servicecontract</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Collaboration#getServicecontract()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_Servicecontract();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.Collaboration#getServicearchitecture <em>Servicearchitecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servicearchitecture</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Collaboration#getServicearchitecture()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_Servicearchitecture();

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
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.ServiceArchitecture <em>Service Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Architecture</em>'.
	 * @see org.eclipse.sirius.sample.soaml.ServiceArchitecture
	 * @generated
	 */
	EClass getServiceArchitecture();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.Capability#getCapabilityexposure <em>Capabilityexposure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilityexposure</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Capability#getCapabilityexposure()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Capabilityexposure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.soaml.Capability#getCapabilityrealization <em>Capabilityrealization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilityrealization</em>'.
	 * @see org.eclipse.sirius.sample.soaml.Capability#getCapabilityrealization()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Capabilityrealization();

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
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.soaml.CapabilityRealization <em>Capability Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Realization</em>'.
	 * @see org.eclipse.sirius.sample.soaml.CapabilityRealization
	 * @generated
	 */
	EClass getCapabilityRealization();

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
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.SoaMLImpl <em>Soa ML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.SoaMLImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getSoaML()
		 * @generated
		 */
		EClass SOA_ML = eINSTANCE.getSoaML();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOA_ML__PORT = eINSTANCE.getSoaML_Port();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOA_ML__PARTICIPANT = eINSTANCE.getSoaML_Participant();

		/**
		 * The meta object literal for the '<em><b>Collaboration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOA_ML__COLLABORATION = eINSTANCE.getSoaML_Collaboration();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOA_ML__CAPABILITY = eINSTANCE.getSoaML_Capability();

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
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__REQUEST = eINSTANCE.getPort_Request();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__SERVICE = eINSTANCE.getPort_Service();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.NewEClass3Impl <em>New EClass3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.NewEClass3Impl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getNewEClass3()
		 * @generated
		 */
		EClass NEW_ECLASS3 = eINSTANCE.getNewEClass3();

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
		 * The meta object literal for the '<em><b>Serviceinterface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__SERVICEINTERFACE = eINSTANCE.getRequest_Serviceinterface();

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
		 * The meta object literal for the '<em><b>Serviceinterface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SERVICEINTERFACE = eINSTANCE.getService_Serviceinterface();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.ServiceInterfaceImpl <em>Service Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.ServiceInterfaceImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getServiceInterface()
		 * @generated
		 */
		EClass SERVICE_INTERFACE = eINSTANCE.getServiceInterface();

		/**
		 * The meta object literal for the '<em><b>Capabilityexposure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INTERFACE__CAPABILITYEXPOSURE = eINSTANCE.getServiceInterface_Capabilityexposure();

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
		 * The meta object literal for the '<em><b>Provider</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__PROVIDER = eINSTANCE.getParticipant_Provider();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__AGENT = eINSTANCE.getParticipant_Agent();

		/**
		 * The meta object literal for the '<em><b>Consumer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__CONSUMER = eINSTANCE.getParticipant_Consumer();

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
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER__MESSAGE = eINSTANCE.getProvider_Message();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER__SERVICE = eINSTANCE.getProvider_Service();

		/**
		 * The meta object literal for the '<em><b>Servicecontract</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER__SERVICECONTRACT = eINSTANCE.getProvider_Servicecontract();

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
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.ConsumerImpl <em>Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.ConsumerImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getConsumer()
		 * @generated
		 */
		EClass CONSUMER = eINSTANCE.getConsumer();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMER__MESSAGE = eINSTANCE.getConsumer_Message();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMER__SERVICE = eINSTANCE.getConsumer_Service();

		/**
		 * The meta object literal for the '<em><b>Servicecontract</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMER__SERVICECONTRACT = eINSTANCE.getConsumer_Servicecontract();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.MessageImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Attachment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__ATTACHMENT = eINSTANCE.getMessage_Attachment();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.AttachmentImpl <em>Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.AttachmentImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getAttachment()
		 * @generated
		 */
		EClass ATTACHMENT = eINSTANCE.getAttachment();

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
		 * The meta object literal for the '<em><b>Servicecontract</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__SERVICECONTRACT = eINSTANCE.getCollaboration_Servicecontract();

		/**
		 * The meta object literal for the '<em><b>Servicearchitecture</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__SERVICEARCHITECTURE = eINSTANCE.getCollaboration_Servicearchitecture();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.ServiceContractImpl <em>Service Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.ServiceContractImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getServiceContract()
		 * @generated
		 */
		EClass SERVICE_CONTRACT = eINSTANCE.getServiceContract();

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
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.CapabilityImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Capabilityexposure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__CAPABILITYEXPOSURE = eINSTANCE.getCapability_Capabilityexposure();

		/**
		 * The meta object literal for the '<em><b>Capabilityrealization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__CAPABILITYREALIZATION = eINSTANCE.getCapability_Capabilityrealization();

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
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.soaml.impl.CapabilityRealizationImpl <em>Capability Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.soaml.impl.CapabilityRealizationImpl
		 * @see org.eclipse.sirius.sample.soaml.impl.SoamlPackageImpl#getCapabilityRealization()
		 * @generated
		 */
		EClass CAPABILITY_REALIZATION = eINSTANCE.getCapabilityRealization();

	}

} //SoamlPackage
