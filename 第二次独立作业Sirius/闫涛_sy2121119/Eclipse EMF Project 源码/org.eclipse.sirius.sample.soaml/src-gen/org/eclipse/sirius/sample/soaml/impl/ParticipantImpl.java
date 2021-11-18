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

import org.eclipse.sirius.sample.soaml.Agent;
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
 *   <li>{@link org.eclipse.sirius.sample.soaml.impl.ParticipantImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.impl.ParticipantImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.impl.ParticipantImpl#getConsumer <em>Consumer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantImpl extends MinimalEObjectImpl.Container implements Participant {
	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected EList<Provider> provider;

	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> agent;

	/**
	 * The cached value of the '{@link #getConsumer() <em>Consumer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumer()
	 * @generated
	 * @ordered
	 */
	protected EList<Consumer> consumer;

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
	public EList<Provider> getProvider() {
		if (provider == null) {
			provider = new EObjectContainmentEList<Provider>(Provider.class, this, SoamlPackage.PARTICIPANT__PROVIDER);
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agent> getAgent() {
		if (agent == null) {
			agent = new EObjectContainmentEList<Agent>(Agent.class, this, SoamlPackage.PARTICIPANT__AGENT);
		}
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Consumer> getConsumer() {
		if (consumer == null) {
			consumer = new EObjectContainmentEList<Consumer>(Consumer.class, this, SoamlPackage.PARTICIPANT__CONSUMER);
		}
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SoamlPackage.PARTICIPANT__PROVIDER:
			return ((InternalEList<?>) getProvider()).basicRemove(otherEnd, msgs);
		case SoamlPackage.PARTICIPANT__AGENT:
			return ((InternalEList<?>) getAgent()).basicRemove(otherEnd, msgs);
		case SoamlPackage.PARTICIPANT__CONSUMER:
			return ((InternalEList<?>) getConsumer()).basicRemove(otherEnd, msgs);
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
		case SoamlPackage.PARTICIPANT__PROVIDER:
			return getProvider();
		case SoamlPackage.PARTICIPANT__AGENT:
			return getAgent();
		case SoamlPackage.PARTICIPANT__CONSUMER:
			return getConsumer();
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
		case SoamlPackage.PARTICIPANT__PROVIDER:
			getProvider().clear();
			getProvider().addAll((Collection<? extends Provider>) newValue);
			return;
		case SoamlPackage.PARTICIPANT__AGENT:
			getAgent().clear();
			getAgent().addAll((Collection<? extends Agent>) newValue);
			return;
		case SoamlPackage.PARTICIPANT__CONSUMER:
			getConsumer().clear();
			getConsumer().addAll((Collection<? extends Consumer>) newValue);
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
		case SoamlPackage.PARTICIPANT__PROVIDER:
			getProvider().clear();
			return;
		case SoamlPackage.PARTICIPANT__AGENT:
			getAgent().clear();
			return;
		case SoamlPackage.PARTICIPANT__CONSUMER:
			getConsumer().clear();
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
		case SoamlPackage.PARTICIPANT__PROVIDER:
			return provider != null && !provider.isEmpty();
		case SoamlPackage.PARTICIPANT__AGENT:
			return agent != null && !agent.isEmpty();
		case SoamlPackage.PARTICIPANT__CONSUMER:
			return consumer != null && !consumer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParticipantImpl
