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

import org.eclipse.sirius.sample.soaml.Collaboration;
import org.eclipse.sirius.sample.soaml.ServiceArchitecture;
import org.eclipse.sirius.sample.soaml.ServiceContract;
import org.eclipse.sirius.sample.soaml.SoamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.soaml.impl.CollaborationImpl#getServicecontract <em>Servicecontract</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.impl.CollaborationImpl#getServicearchitecture <em>Servicearchitecture</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollaborationImpl extends MinimalEObjectImpl.Container implements Collaboration {
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
	 * The cached value of the '{@link #getServicearchitecture() <em>Servicearchitecture</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicearchitecture()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceArchitecture> servicearchitecture;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoamlPackage.Literals.COLLABORATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceContract> getServicecontract() {
		if (servicecontract == null) {
			servicecontract = new EObjectContainmentEList<ServiceContract>(ServiceContract.class, this,
					SoamlPackage.COLLABORATION__SERVICECONTRACT);
		}
		return servicecontract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceArchitecture> getServicearchitecture() {
		if (servicearchitecture == null) {
			servicearchitecture = new EObjectContainmentEList<ServiceArchitecture>(ServiceArchitecture.class, this,
					SoamlPackage.COLLABORATION__SERVICEARCHITECTURE);
		}
		return servicearchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SoamlPackage.COLLABORATION__SERVICECONTRACT:
			return ((InternalEList<?>) getServicecontract()).basicRemove(otherEnd, msgs);
		case SoamlPackage.COLLABORATION__SERVICEARCHITECTURE:
			return ((InternalEList<?>) getServicearchitecture()).basicRemove(otherEnd, msgs);
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
		case SoamlPackage.COLLABORATION__SERVICECONTRACT:
			return getServicecontract();
		case SoamlPackage.COLLABORATION__SERVICEARCHITECTURE:
			return getServicearchitecture();
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
		case SoamlPackage.COLLABORATION__SERVICECONTRACT:
			getServicecontract().clear();
			getServicecontract().addAll((Collection<? extends ServiceContract>) newValue);
			return;
		case SoamlPackage.COLLABORATION__SERVICEARCHITECTURE:
			getServicearchitecture().clear();
			getServicearchitecture().addAll((Collection<? extends ServiceArchitecture>) newValue);
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
		case SoamlPackage.COLLABORATION__SERVICECONTRACT:
			getServicecontract().clear();
			return;
		case SoamlPackage.COLLABORATION__SERVICEARCHITECTURE:
			getServicearchitecture().clear();
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
		case SoamlPackage.COLLABORATION__SERVICECONTRACT:
			return servicecontract != null && !servicecontract.isEmpty();
		case SoamlPackage.COLLABORATION__SERVICEARCHITECTURE:
			return servicearchitecture != null && !servicearchitecture.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CollaborationImpl
