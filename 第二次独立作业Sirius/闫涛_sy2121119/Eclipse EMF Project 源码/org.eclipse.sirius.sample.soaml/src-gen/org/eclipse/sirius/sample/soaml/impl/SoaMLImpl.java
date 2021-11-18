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

import org.eclipse.sirius.sample.soaml.Capability;
import org.eclipse.sirius.sample.soaml.Collaboration;
import org.eclipse.sirius.sample.soaml.Participant;
import org.eclipse.sirius.sample.soaml.Port;
import org.eclipse.sirius.sample.soaml.SoaML;
import org.eclipse.sirius.sample.soaml.SoamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Soa ML</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.soaml.impl.SoaMLImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.impl.SoaMLImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.impl.SoaMLImpl#getCollaboration <em>Collaboration</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.impl.SoaMLImpl#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoaMLImpl extends MinimalEObjectImpl.Container implements SoaML {
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> port;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> participant;

	/**
	 * The cached value of the '{@link #getCollaboration() <em>Collaboration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaboration()
	 * @generated
	 * @ordered
	 */
	protected EList<Collaboration> collaboration;

	/**
	 * The cached value of the '{@link #getCapability() <em>Capability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> capability;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoaMLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoamlPackage.Literals.SOA_ML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<Port>(Port.class, this, SoamlPackage.SOA_ML__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentEList<Participant>(Participant.class, this,
					SoamlPackage.SOA_ML__PARTICIPANT);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Collaboration> getCollaboration() {
		if (collaboration == null) {
			collaboration = new EObjectContainmentEList<Collaboration>(Collaboration.class, this,
					SoamlPackage.SOA_ML__COLLABORATION);
		}
		return collaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getCapability() {
		if (capability == null) {
			capability = new EObjectContainmentEList<Capability>(Capability.class, this,
					SoamlPackage.SOA_ML__CAPABILITY);
		}
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SoamlPackage.SOA_ML__PORT:
			return ((InternalEList<?>) getPort()).basicRemove(otherEnd, msgs);
		case SoamlPackage.SOA_ML__PARTICIPANT:
			return ((InternalEList<?>) getParticipant()).basicRemove(otherEnd, msgs);
		case SoamlPackage.SOA_ML__COLLABORATION:
			return ((InternalEList<?>) getCollaboration()).basicRemove(otherEnd, msgs);
		case SoamlPackage.SOA_ML__CAPABILITY:
			return ((InternalEList<?>) getCapability()).basicRemove(otherEnd, msgs);
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
		case SoamlPackage.SOA_ML__PORT:
			return getPort();
		case SoamlPackage.SOA_ML__PARTICIPANT:
			return getParticipant();
		case SoamlPackage.SOA_ML__COLLABORATION:
			return getCollaboration();
		case SoamlPackage.SOA_ML__CAPABILITY:
			return getCapability();
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
		case SoamlPackage.SOA_ML__PORT:
			getPort().clear();
			getPort().addAll((Collection<? extends Port>) newValue);
			return;
		case SoamlPackage.SOA_ML__PARTICIPANT:
			getParticipant().clear();
			getParticipant().addAll((Collection<? extends Participant>) newValue);
			return;
		case SoamlPackage.SOA_ML__COLLABORATION:
			getCollaboration().clear();
			getCollaboration().addAll((Collection<? extends Collaboration>) newValue);
			return;
		case SoamlPackage.SOA_ML__CAPABILITY:
			getCapability().clear();
			getCapability().addAll((Collection<? extends Capability>) newValue);
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
		case SoamlPackage.SOA_ML__PORT:
			getPort().clear();
			return;
		case SoamlPackage.SOA_ML__PARTICIPANT:
			getParticipant().clear();
			return;
		case SoamlPackage.SOA_ML__COLLABORATION:
			getCollaboration().clear();
			return;
		case SoamlPackage.SOA_ML__CAPABILITY:
			getCapability().clear();
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
		case SoamlPackage.SOA_ML__PORT:
			return port != null && !port.isEmpty();
		case SoamlPackage.SOA_ML__PARTICIPANT:
			return participant != null && !participant.isEmpty();
		case SoamlPackage.SOA_ML__COLLABORATION:
			return collaboration != null && !collaboration.isEmpty();
		case SoamlPackage.SOA_ML__CAPABILITY:
			return capability != null && !capability.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SoaMLImpl
