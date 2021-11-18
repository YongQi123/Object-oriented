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
import org.eclipse.sirius.sample.soaml.CapabilityExposure;
import org.eclipse.sirius.sample.soaml.CapabilityRealization;
import org.eclipse.sirius.sample.soaml.SoamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.soaml.impl.CapabilityImpl#getCapabilityexposure <em>Capabilityexposure</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.impl.CapabilityImpl#getCapabilityrealization <em>Capabilityrealization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityImpl extends MinimalEObjectImpl.Container implements Capability {
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
	 * The cached value of the '{@link #getCapabilityrealization() <em>Capabilityrealization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityrealization()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityRealization> capabilityrealization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoamlPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityExposure> getCapabilityexposure() {
		if (capabilityexposure == null) {
			capabilityexposure = new EObjectContainmentEList<CapabilityExposure>(CapabilityExposure.class, this,
					SoamlPackage.CAPABILITY__CAPABILITYEXPOSURE);
		}
		return capabilityexposure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityRealization> getCapabilityrealization() {
		if (capabilityrealization == null) {
			capabilityrealization = new EObjectContainmentEList<CapabilityRealization>(CapabilityRealization.class,
					this, SoamlPackage.CAPABILITY__CAPABILITYREALIZATION);
		}
		return capabilityrealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SoamlPackage.CAPABILITY__CAPABILITYEXPOSURE:
			return ((InternalEList<?>) getCapabilityexposure()).basicRemove(otherEnd, msgs);
		case SoamlPackage.CAPABILITY__CAPABILITYREALIZATION:
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
		case SoamlPackage.CAPABILITY__CAPABILITYEXPOSURE:
			return getCapabilityexposure();
		case SoamlPackage.CAPABILITY__CAPABILITYREALIZATION:
			return getCapabilityrealization();
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
		case SoamlPackage.CAPABILITY__CAPABILITYEXPOSURE:
			getCapabilityexposure().clear();
			getCapabilityexposure().addAll((Collection<? extends CapabilityExposure>) newValue);
			return;
		case SoamlPackage.CAPABILITY__CAPABILITYREALIZATION:
			getCapabilityrealization().clear();
			getCapabilityrealization().addAll((Collection<? extends CapabilityRealization>) newValue);
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
		case SoamlPackage.CAPABILITY__CAPABILITYEXPOSURE:
			getCapabilityexposure().clear();
			return;
		case SoamlPackage.CAPABILITY__CAPABILITYREALIZATION:
			getCapabilityrealization().clear();
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
		case SoamlPackage.CAPABILITY__CAPABILITYEXPOSURE:
			return capabilityexposure != null && !capabilityexposure.isEmpty();
		case SoamlPackage.CAPABILITY__CAPABILITYREALIZATION:
			return capabilityrealization != null && !capabilityrealization.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityImpl
