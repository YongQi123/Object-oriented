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

import org.eclipse.sirius.sample.soaml.CapabilityExposure;
import org.eclipse.sirius.sample.soaml.ServiceInterface;
import org.eclipse.sirius.sample.soaml.SoamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.soaml.impl.ServiceInterfaceImpl#getCapabilityexposure <em>Capabilityexposure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceInterfaceImpl extends MinimalEObjectImpl.Container implements ServiceInterface {
	/**
	 * The cached value of the '{@link #getCapabilityexposure() <em>Capabilityexposure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityexposure()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityExposure> capabilityexposure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoamlPackage.Literals.SERVICE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityExposure> getCapabilityexposure() {
		if (capabilityexposure == null) {
			capabilityexposure = new EObjectContainmentEList<CapabilityExposure>(CapabilityExposure.class, this,
					SoamlPackage.SERVICE_INTERFACE__CAPABILITYEXPOSURE);
		}
		return capabilityexposure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SoamlPackage.SERVICE_INTERFACE__CAPABILITYEXPOSURE:
			return ((InternalEList<?>) getCapabilityexposure()).basicRemove(otherEnd, msgs);
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
		case SoamlPackage.SERVICE_INTERFACE__CAPABILITYEXPOSURE:
			return getCapabilityexposure();
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
		case SoamlPackage.SERVICE_INTERFACE__CAPABILITYEXPOSURE:
			getCapabilityexposure().clear();
			getCapabilityexposure().addAll((Collection<? extends CapabilityExposure>) newValue);
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
		case SoamlPackage.SERVICE_INTERFACE__CAPABILITYEXPOSURE:
			getCapabilityexposure().clear();
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
		case SoamlPackage.SERVICE_INTERFACE__CAPABILITYEXPOSURE:
			return capabilityexposure != null && !capabilityexposure.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceInterfaceImpl
