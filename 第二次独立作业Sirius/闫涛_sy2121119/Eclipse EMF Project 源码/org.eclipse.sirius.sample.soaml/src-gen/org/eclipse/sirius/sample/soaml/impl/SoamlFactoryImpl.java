/**
 */
package org.eclipse.sirius.sample.soaml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.sirius.sample.soaml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoamlFactoryImpl extends EFactoryImpl implements SoamlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SoamlFactory init() {
		try {
			SoamlFactory theSoamlFactory = (SoamlFactory) EPackage.Registry.INSTANCE.getEFactory(SoamlPackage.eNS_URI);
			if (theSoamlFactory != null) {
				return theSoamlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SoamlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoamlFactoryImpl() {
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
		case SoamlPackage.SOA_ML:
			return createSoaML();
		case SoamlPackage.PORT:
			return createPort();
		case SoamlPackage.NEW_ECLASS3:
			return createNewEClass3();
		case SoamlPackage.REQUEST:
			return createRequest();
		case SoamlPackage.SERVICE:
			return createService();
		case SoamlPackage.SERVICE_INTERFACE:
			return createServiceInterface();
		case SoamlPackage.PARTICIPANT:
			return createParticipant();
		case SoamlPackage.PROVIDER:
			return createProvider();
		case SoamlPackage.AGENT:
			return createAgent();
		case SoamlPackage.CONSUMER:
			return createConsumer();
		case SoamlPackage.MESSAGE:
			return createMessage();
		case SoamlPackage.ATTACHMENT:
			return createAttachment();
		case SoamlPackage.COLLABORATION:
			return createCollaboration();
		case SoamlPackage.SERVICE_CONTRACT:
			return createServiceContract();
		case SoamlPackage.SERVICE_ARCHITECTURE:
			return createServiceArchitecture();
		case SoamlPackage.CAPABILITY:
			return createCapability();
		case SoamlPackage.CAPABILITY_EXPOSURE:
			return createCapabilityExposure();
		case SoamlPackage.CAPABILITY_REALIZATION:
			return createCapabilityRealization();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoaML createSoaML() {
		SoaMLImpl soaML = new SoaMLImpl();
		return soaML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewEClass3 createNewEClass3() {
		NewEClass3Impl newEClass3 = new NewEClass3Impl();
		return newEClass3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request createRequest() {
		RequestImpl request = new RequestImpl();
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterface createServiceInterface() {
		ServiceInterfaceImpl serviceInterface = new ServiceInterfaceImpl();
		return serviceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consumer createConsumer() {
		ConsumerImpl consumer = new ConsumerImpl();
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachment() {
		AttachmentImpl attachment = new AttachmentImpl();
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration createCollaboration() {
		CollaborationImpl collaboration = new CollaborationImpl();
		return collaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceContract createServiceContract() {
		ServiceContractImpl serviceContract = new ServiceContractImpl();
		return serviceContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceArchitecture createServiceArchitecture() {
		ServiceArchitectureImpl serviceArchitecture = new ServiceArchitectureImpl();
		return serviceArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityExposure createCapabilityExposure() {
		CapabilityExposureImpl capabilityExposure = new CapabilityExposureImpl();
		return capabilityExposure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityRealization createCapabilityRealization() {
		CapabilityRealizationImpl capabilityRealization = new CapabilityRealizationImpl();
		return capabilityRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoamlPackage getSoamlPackage() {
		return (SoamlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SoamlPackage getPackage() {
		return SoamlPackage.eINSTANCE;
	}

} //SoamlFactoryImpl
