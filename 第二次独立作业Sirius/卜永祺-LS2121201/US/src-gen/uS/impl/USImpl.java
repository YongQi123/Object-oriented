/**
 */
package uS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uS.Refinement;
import uS.Role;
import uS.US;
import uS.USPackage;
import uS.UserStory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>US</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uS.impl.USImpl#getUserstory <em>Userstory</em>}</li>
 *   <li>{@link uS.impl.USImpl#getRole <em>Role</em>}</li>
 *   <li>{@link uS.impl.USImpl#getRefinement <em>Refinement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class USImpl extends MinimalEObjectImpl.Container implements US {
	/**
	 * The cached value of the '{@link #getUserstory() <em>Userstory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserstory()
	 * @generated
	 * @ordered
	 */
	protected EList<UserStory> userstory;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> role;

	/**
	 * The cached value of the '{@link #getRefinement() <em>Refinement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinement()
	 * @generated
	 * @ordered
	 */
	protected EList<Refinement> refinement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected USImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return USPackage.Literals.US;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserStory> getUserstory() {
		if (userstory == null) {
			userstory = new EObjectContainmentEList<UserStory>(UserStory.class, this, USPackage.US__USERSTORY);
		}
		return userstory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRole() {
		if (role == null) {
			role = new EObjectContainmentEList<Role>(Role.class, this, USPackage.US__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Refinement> getRefinement() {
		if (refinement == null) {
			refinement = new EObjectContainmentEList<Refinement>(Refinement.class, this, USPackage.US__REFINEMENT);
		}
		return refinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case USPackage.US__USERSTORY:
			return ((InternalEList<?>) getUserstory()).basicRemove(otherEnd, msgs);
		case USPackage.US__ROLE:
			return ((InternalEList<?>) getRole()).basicRemove(otherEnd, msgs);
		case USPackage.US__REFINEMENT:
			return ((InternalEList<?>) getRefinement()).basicRemove(otherEnd, msgs);
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
		case USPackage.US__USERSTORY:
			return getUserstory();
		case USPackage.US__ROLE:
			return getRole();
		case USPackage.US__REFINEMENT:
			return getRefinement();
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
		case USPackage.US__USERSTORY:
			getUserstory().clear();
			getUserstory().addAll((Collection<? extends UserStory>) newValue);
			return;
		case USPackage.US__ROLE:
			getRole().clear();
			getRole().addAll((Collection<? extends Role>) newValue);
			return;
		case USPackage.US__REFINEMENT:
			getRefinement().clear();
			getRefinement().addAll((Collection<? extends Refinement>) newValue);
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
		case USPackage.US__USERSTORY:
			getUserstory().clear();
			return;
		case USPackage.US__ROLE:
			getRole().clear();
			return;
		case USPackage.US__REFINEMENT:
			getRefinement().clear();
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
		case USPackage.US__USERSTORY:
			return userstory != null && !userstory.isEmpty();
		case USPackage.US__ROLE:
			return role != null && !role.isEmpty();
		case USPackage.US__REFINEMENT:
			return refinement != null && !refinement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //USImpl
