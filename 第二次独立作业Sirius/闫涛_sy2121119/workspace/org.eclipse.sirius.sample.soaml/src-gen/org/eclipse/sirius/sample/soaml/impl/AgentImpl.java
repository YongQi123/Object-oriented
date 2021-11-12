/**
 */
package org.eclipse.sirius.sample.soaml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.sample.soaml.Agent;
import org.eclipse.sirius.sample.soaml.Collaboration;
import org.eclipse.sirius.sample.soaml.SoamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.soaml.impl.AgentImpl#getCollaboration <em>Collaboration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentImpl extends ParticipantImpl implements Agent {
	/**
	 * The cached value of the '{@link #getCollaboration() <em>Collaboration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaboration()
	 * @generated
	 * @ordered
	 */
	protected Collaboration collaboration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoamlPackage.Literals.AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration getCollaboration() {
		if (collaboration != null && collaboration.eIsProxy()) {
			InternalEObject oldCollaboration = (InternalEObject) collaboration;
			collaboration = (Collaboration) eResolveProxy(oldCollaboration);
			if (collaboration != oldCollaboration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoamlPackage.AGENT__COLLABORATION,
							oldCollaboration, collaboration));
			}
		}
		return collaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration basicGetCollaboration() {
		return collaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollaboration(Collaboration newCollaboration) {
		Collaboration oldCollaboration = collaboration;
		collaboration = newCollaboration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoamlPackage.AGENT__COLLABORATION, oldCollaboration,
					collaboration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SoamlPackage.AGENT__COLLABORATION:
			if (resolve)
				return getCollaboration();
			return basicGetCollaboration();
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
		case SoamlPackage.AGENT__COLLABORATION:
			setCollaboration((Collaboration) newValue);
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
		case SoamlPackage.AGENT__COLLABORATION:
			setCollaboration((Collaboration) null);
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
		case SoamlPackage.AGENT__COLLABORATION:
			return collaboration != null;
		}
		return super.eIsSet(featureID);
	}

} //AgentImpl
