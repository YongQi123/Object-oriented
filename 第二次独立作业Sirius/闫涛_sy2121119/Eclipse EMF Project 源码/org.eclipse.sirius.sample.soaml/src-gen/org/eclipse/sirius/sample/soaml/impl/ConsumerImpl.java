/**
 */
package org.eclipse.sirius.sample.soaml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.soaml.Consumer;
import org.eclipse.sirius.sample.soaml.Message;
import org.eclipse.sirius.sample.soaml.Service;
import org.eclipse.sirius.sample.soaml.ServiceContract;
import org.eclipse.sirius.sample.soaml.SoamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.soaml.impl.ConsumerImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.impl.ConsumerImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.impl.ConsumerImpl#getServicecontract <em>Servicecontract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsumerImpl extends MinimalEObjectImpl.Container implements Consumer {
	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> message;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> service;

	/**
	 * The cached value of the '{@link #getServicecontract() <em>Servicecontract</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicecontract()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceContract> servicecontract;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoamlPackage.Literals.CONSUMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessage() {
		if (message == null) {
			message = new EObjectContainmentEList<Message>(Message.class, this, SoamlPackage.CONSUMER__MESSAGE);
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<Service>(Service.class, this, SoamlPackage.CONSUMER__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceContract> getServicecontract() {
		if (servicecontract == null) {
			servicecontract = new EObjectContainmentEList<ServiceContract>(ServiceContract.class, this,
					SoamlPackage.CONSUMER__SERVICECONTRACT);
		}
		return servicecontract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SoamlPackage.CONSUMER__MESSAGE:
			return ((InternalEList<?>) getMessage()).basicRemove(otherEnd, msgs);
		case SoamlPackage.CONSUMER__SERVICE:
			return ((InternalEList<?>) getService()).basicRemove(otherEnd, msgs);
		case SoamlPackage.CONSUMER__SERVICECONTRACT:
			return ((InternalEList<?>) getServicecontract()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SoamlPackage.CONSUMER__MESSAGE:
			return getMessage();
		case SoamlPackage.CONSUMER__SERVICE:
			return getService();
		case SoamlPackage.CONSUMER__SERVICECONTRACT:
			return getServicecontract();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SoamlPackage.CONSUMER__MESSAGE:
			getMessage().clear();
			getMessage().addAll((Collection<? extends Message>) newValue);
			return;
		case SoamlPackage.CONSUMER__SERVICE:
			getService().clear();
			getService().addAll((Collection<? extends Service>) newValue);
			return;
		case SoamlPackage.CONSUMER__SERVICECONTRACT:
			getServicecontract().clear();
			getServicecontract().addAll((Collection<? extends ServiceContract>) newValue);
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
		case SoamlPackage.CONSUMER__MESSAGE:
			getMessage().clear();
			return;
		case SoamlPackage.CONSUMER__SERVICE:
			getService().clear();
			return;
		case SoamlPackage.CONSUMER__SERVICECONTRACT:
			getServicecontract().clear();
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
		case SoamlPackage.CONSUMER__MESSAGE:
			return message != null && !message.isEmpty();
		case SoamlPackage.CONSUMER__SERVICE:
			return service != null && !service.isEmpty();
		case SoamlPackage.CONSUMER__SERVICECONTRACT:
			return servicecontract != null && !servicecontract.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConsumerImpl
