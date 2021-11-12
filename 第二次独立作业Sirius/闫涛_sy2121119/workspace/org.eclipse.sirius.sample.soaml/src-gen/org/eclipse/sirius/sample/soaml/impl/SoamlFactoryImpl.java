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
		case SoamlPackage.PARTICIPANT:
			return createParticipant();
		case SoamlPackage.AGENT:
			return createAgent();
		case SoamlPackage.CAPABILITY_REALIZATION:
			return createCapabilityRealization();
		case SoamlPackage.CAPABILITY:
			return createCapability();
		case SoamlPackage.CAPABILITY_EXPOSURE:
			return createCapabilityExposure();
		case SoamlPackage.SERVICE_INERFACE:
			return createServiceInerface();
		case SoamlPackage.REQUEST:
			return createRequest();
		case SoamlPackage.SERVICE:
			return createService();
		case SoamlPackage.PORT:
			return createPort();
		case SoamlPackage.SERVICE_CHANNEL:
			return createServiceChannel();
		case SoamlPackage.COLLABORATION:
			return createCollaboration();
		case SoamlPackage.SERVICE_ARCHITECTURE:
			return createServiceArchitecture();
		case SoamlPackage.SERVICE_CONTRACT:
			return createServiceContract();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
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
	public ServiceInerface createServiceInerface() {
		ServiceInerfaceImpl serviceInerface = new ServiceInerfaceImpl();
		return serviceInerface;
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
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceChannel createServiceChannel() {
		ServiceChannelImpl serviceChannel = new ServiceChannelImpl();
		return serviceChannel;
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
	public ServiceArchitecture createServiceArchitecture() {
		ServiceArchitectureImpl serviceArchitecture = new ServiceArchitectureImpl();
		return serviceArchitecture;
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
