/**
 */
package org.eclipse.sirius.sample.soaml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.soaml.CapabilityRealization;
import org.eclipse.sirius.sample.soaml.Consumer;
import org.eclipse.sirius.sample.soaml.Participant;
import org.eclipse.sirius.sample.soaml.Provider;
import org.eclipse.sirius.sample.soaml.SoamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.soaml.impl.ParticipantImpl#getCapabilityrealization <em>Capabilityrealization</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.impl.ParticipantImpl#getConsumer <em>Consumer</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.impl.ParticipantImpl#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantImpl extends MinimalEObjectImpl.Container implements Participant {
	/**
	 * The cached value of the '{@link #getCapabilityrealization() <em>Capabilityrealization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityrealization()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityRealization> capabilityrealization;

	/**
	 * The cached value of the '{@link #getConsumer() <em>Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumer()
	 * @generated
	 * @ordered
	 */
	protected Consumer consumer;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Provider provider;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoamlPackage.Literals.PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityRealization> getCapabilityrealization() {
		if (capabilityrealization == null) {
			capabilityrealization = new EObjectContainmentEList<CapabilityRealization>(CapabilityRealization.class,
					this, SoamlPackage.PARTICIPANT__CAPABILITYREALIZATION);
		}
		return capabilityrealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consumer getConsumer() {
		if (consumer != null && consumer.eIsProxy()) {
			InternalEObject oldConsumer = (InternalEObject) consumer;
			consumer = (Consumer) eResolveProxy(oldConsumer);
			if (consumer != oldConsumer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoamlPackage.PARTICIPANT__CONSUMER,
							oldConsumer, consumer));
			}
		}
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consumer basicGetConsumer() {
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumer(Consumer newConsumer) {
		Consumer oldConsumer = consumer;
		consumer = newConsumer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoamlPackage.PARTICIPANT__CONSUMER, oldConsumer,
					consumer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider getProvider() {
		if (provider != null && provider.eIsProxy()) {
			InternalEObject oldProvider = (InternalEObject) provider;
			provider = (Provider) eResolveProxy(oldProvider);
			if (provider != oldProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoamlPackage.PARTICIPANT__PROVIDER,
							oldProvider, provider));
			}
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider basicGetProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(Provider newProvider) {
		Provider oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoamlPackage.PARTICIPANT__PROVIDER, oldProvider,
					provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SoamlPackage.PARTICIPANT__CAPABILITYREALIZATION:
			return ((InternalEList<?>) getCapabilityrealization()).basicRemove(otherEnd, msgs);
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
		case SoamlPackage.PARTICIPANT__CAPABILITYREALIZATION:
			return getCapabilityrealization();
		case SoamlPackage.PARTICIPANT__CONSUMER:
			if (resolve)
				return getConsumer();
			return basicGetConsumer();
		case SoamlPackage.PARTICIPANT__PROVIDER:
			if (resolve)
				return getProvider();
			return basicGetProvider();
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
		case SoamlPackage.PARTICIPANT__CAPABILITYREALIZATION:
			getCapabilityrealization().clear();
			getCapabilityrealization().addAll((Collection<? extends CapabilityRealization>) newValue);
			return;
		case SoamlPackage.PARTICIPANT__CONSUMER:
			setConsumer((Consumer) newValue);
			return;
		case SoamlPackage.PARTICIPANT__PROVIDER:
			setProvider((Provider) newValue);
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
		case SoamlPackage.PARTICIPANT__CAPABILITYREALIZATION:
			getCapabilityrealization().clear();
			return;
		case SoamlPackage.PARTICIPANT__CONSUMER:
			setConsumer((Consumer) null);
			return;
		case SoamlPackage.PARTICIPANT__PROVIDER:
			setProvider((Provider) null);
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
		case SoamlPackage.PARTICIPANT__CAPABILITYREALIZATION:
			return capabilityrealization != null && !capabilityrealization.isEmpty();
		case SoamlPackage.PARTICIPANT__CONSUMER:
			return consumer != null;
		case SoamlPackage.PARTICIPANT__PROVIDER:
			return provider != null;
		}
		return super.eIsSet(featureID);
	}

} //ParticipantImpl
