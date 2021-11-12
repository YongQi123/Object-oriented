/**
 */
package org.eclipse.sirius.sample.soaml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.sample.soaml.Port;
import org.eclipse.sirius.sample.soaml.Service;
import org.eclipse.sirius.sample.soaml.ServiceChannel;
import org.eclipse.sirius.sample.soaml.ServiceInerface;
import org.eclipse.sirius.sample.soaml.SoamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.soaml.impl.ServiceImpl#getServiceinerface <em>Serviceinerface</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.impl.ServiceImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.impl.ServiceImpl#getServicechannel <em>Servicechannel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
	/**
	 * The cached value of the '{@link #getServiceinerface() <em>Serviceinerface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceinerface()
	 * @generated
	 * @ordered
	 */
	protected ServiceInerface serviceinerface;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Port port;

	/**
	 * The cached value of the '{@link #getServicechannel() <em>Servicechannel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicechannel()
	 * @generated
	 * @ordered
	 */
	protected ServiceChannel servicechannel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoamlPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInerface getServiceinerface() {
		if (serviceinerface != null && serviceinerface.eIsProxy()) {
			InternalEObject oldServiceinerface = (InternalEObject) serviceinerface;
			serviceinerface = (ServiceInerface) eResolveProxy(oldServiceinerface);
			if (serviceinerface != oldServiceinerface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoamlPackage.SERVICE__SERVICEINERFACE,
							oldServiceinerface, serviceinerface));
			}
		}
		return serviceinerface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInerface basicGetServiceinerface() {
		return serviceinerface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceinerface(ServiceInerface newServiceinerface) {
		ServiceInerface oldServiceinerface = serviceinerface;
		serviceinerface = newServiceinerface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoamlPackage.SERVICE__SERVICEINERFACE,
					oldServiceinerface, serviceinerface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject) port;
			port = (Port) eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoamlPackage.SERVICE__PORT, oldPort,
							port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Port newPort) {
		Port oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoamlPackage.SERVICE__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceChannel getServicechannel() {
		if (servicechannel != null && servicechannel.eIsProxy()) {
			InternalEObject oldServicechannel = (InternalEObject) servicechannel;
			servicechannel = (ServiceChannel) eResolveProxy(oldServicechannel);
			if (servicechannel != oldServicechannel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoamlPackage.SERVICE__SERVICECHANNEL,
							oldServicechannel, servicechannel));
			}
		}
		return servicechannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceChannel basicGetServicechannel() {
		return servicechannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicechannel(ServiceChannel newServicechannel) {
		ServiceChannel oldServicechannel = servicechannel;
		servicechannel = newServicechannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoamlPackage.SERVICE__SERVICECHANNEL,
					oldServicechannel, servicechannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SoamlPackage.SERVICE__SERVICEINERFACE:
			if (resolve)
				return getServiceinerface();
			return basicGetServiceinerface();
		case SoamlPackage.SERVICE__PORT:
			if (resolve)
				return getPort();
			return basicGetPort();
		case SoamlPackage.SERVICE__SERVICECHANNEL:
			if (resolve)
				return getServicechannel();
			return basicGetServicechannel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SoamlPackage.SERVICE__SERVICEINERFACE:
			setServiceinerface((ServiceInerface) newValue);
			return;
		case SoamlPackage.SERVICE__PORT:
			setPort((Port) newValue);
			return;
		case SoamlPackage.SERVICE__SERVICECHANNEL:
			setServicechannel((ServiceChannel) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SoamlPackage.SERVICE__SERVICEINERFACE:
			setServiceinerface((ServiceInerface) null);
			return;
		case SoamlPackage.SERVICE__PORT:
			setPort((Port) null);
			return;
		case SoamlPackage.SERVICE__SERVICECHANNEL:
			setServicechannel((ServiceChannel) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SoamlPackage.SERVICE__SERVICEINERFACE:
			return serviceinerface != null;
		case SoamlPackage.SERVICE__PORT:
			return port != null;
		case SoamlPackage.SERVICE__SERVICECHANNEL:
			return servicechannel != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceImpl
