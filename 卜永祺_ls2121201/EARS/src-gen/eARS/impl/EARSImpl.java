/**
 */
package eARS.impl;

import eARS.EARS;
import eARS.EARSPackage;
import eARS.EV;
import eARS.HY;
import eARS.OP;
import eARS.ST;
import eARS.UB;
import eARS.UW;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EARS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eARS.impl.EARSImpl#getUb <em>Ub</em>}</li>
 *   <li>{@link eARS.impl.EARSImpl#getEv <em>Ev</em>}</li>
 *   <li>{@link eARS.impl.EARSImpl#getSt <em>St</em>}</li>
 *   <li>{@link eARS.impl.EARSImpl#getUw <em>Uw</em>}</li>
 *   <li>{@link eARS.impl.EARSImpl#getOp <em>Op</em>}</li>
 *   <li>{@link eARS.impl.EARSImpl#getHy <em>Hy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EARSImpl extends MinimalEObjectImpl.Container implements EARS {
	/**
	 * The cached value of the '{@link #getUb() <em>Ub</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUb()
	 * @generated
	 * @ordered
	 */
	protected EList<UB> ub;

	/**
	 * The cached value of the '{@link #getEv() <em>Ev</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEv()
	 * @generated
	 * @ordered
	 */
	protected EList<EV> ev;

	/**
	 * The cached value of the '{@link #getSt() <em>St</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSt()
	 * @generated
	 * @ordered
	 */
	protected EList<UW> st;

	/**
	 * The cached value of the '{@link #getUw() <em>Uw</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUw()
	 * @generated
	 * @ordered
	 */
	protected EList<ST> uw;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected EList<OP> op;

	/**
	 * The cached value of the '{@link #getHy() <em>Hy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHy()
	 * @generated
	 * @ordered
	 */
	protected EList<HY> hy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EARSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EARSPackage.Literals.EARS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UB> getUb() {
		if (ub == null) {
			ub = new EObjectContainmentEList<UB>(UB.class, this, EARSPackage.EARS__UB);
		}
		return ub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EV> getEv() {
		if (ev == null) {
			ev = new EObjectContainmentEList<EV>(EV.class, this, EARSPackage.EARS__EV);
		}
		return ev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UW> getSt() {
		if (st == null) {
			st = new EObjectContainmentEList<UW>(UW.class, this, EARSPackage.EARS__ST);
		}
		return st;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ST> getUw() {
		if (uw == null) {
			uw = new EObjectContainmentEList<ST>(ST.class, this, EARSPackage.EARS__UW);
		}
		return uw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OP> getOp() {
		if (op == null) {
			op = new EObjectContainmentEList<OP>(OP.class, this, EARSPackage.EARS__OP);
		}
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HY> getHy() {
		if (hy == null) {
			hy = new EObjectContainmentEList<HY>(HY.class, this, EARSPackage.EARS__HY);
		}
		return hy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EARSPackage.EARS__UB:
			return ((InternalEList<?>) getUb()).basicRemove(otherEnd, msgs);
		case EARSPackage.EARS__EV:
			return ((InternalEList<?>) getEv()).basicRemove(otherEnd, msgs);
		case EARSPackage.EARS__ST:
			return ((InternalEList<?>) getSt()).basicRemove(otherEnd, msgs);
		case EARSPackage.EARS__UW:
			return ((InternalEList<?>) getUw()).basicRemove(otherEnd, msgs);
		case EARSPackage.EARS__OP:
			return ((InternalEList<?>) getOp()).basicRemove(otherEnd, msgs);
		case EARSPackage.EARS__HY:
			return ((InternalEList<?>) getHy()).basicRemove(otherEnd, msgs);
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
		case EARSPackage.EARS__UB:
			return getUb();
		case EARSPackage.EARS__EV:
			return getEv();
		case EARSPackage.EARS__ST:
			return getSt();
		case EARSPackage.EARS__UW:
			return getUw();
		case EARSPackage.EARS__OP:
			return getOp();
		case EARSPackage.EARS__HY:
			return getHy();
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
		case EARSPackage.EARS__UB:
			getUb().clear();
			getUb().addAll((Collection<? extends UB>) newValue);
			return;
		case EARSPackage.EARS__EV:
			getEv().clear();
			getEv().addAll((Collection<? extends EV>) newValue);
			return;
		case EARSPackage.EARS__ST:
			getSt().clear();
			getSt().addAll((Collection<? extends UW>) newValue);
			return;
		case EARSPackage.EARS__UW:
			getUw().clear();
			getUw().addAll((Collection<? extends ST>) newValue);
			return;
		case EARSPackage.EARS__OP:
			getOp().clear();
			getOp().addAll((Collection<? extends OP>) newValue);
			return;
		case EARSPackage.EARS__HY:
			getHy().clear();
			getHy().addAll((Collection<? extends HY>) newValue);
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
		case EARSPackage.EARS__UB:
			getUb().clear();
			return;
		case EARSPackage.EARS__EV:
			getEv().clear();
			return;
		case EARSPackage.EARS__ST:
			getSt().clear();
			return;
		case EARSPackage.EARS__UW:
			getUw().clear();
			return;
		case EARSPackage.EARS__OP:
			getOp().clear();
			return;
		case EARSPackage.EARS__HY:
			getHy().clear();
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
		case EARSPackage.EARS__UB:
			return ub != null && !ub.isEmpty();
		case EARSPackage.EARS__EV:
			return ev != null && !ev.isEmpty();
		case EARSPackage.EARS__ST:
			return st != null && !st.isEmpty();
		case EARSPackage.EARS__UW:
			return uw != null && !uw.isEmpty();
		case EARSPackage.EARS__OP:
			return op != null && !op.isEmpty();
		case EARSPackage.EARS__HY:
			return hy != null && !hy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EARSImpl
