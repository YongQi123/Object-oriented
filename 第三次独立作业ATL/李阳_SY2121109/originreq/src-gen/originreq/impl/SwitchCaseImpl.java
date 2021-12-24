/**
 */
package originreq.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import originreq.OriginreqPackage;
import originreq.SimpleOperation;
import originreq.SwitchCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link originreq.impl.SwitchCaseImpl#getCaseValue <em>Case Value</em>}</li>
 *   <li>{@link originreq.impl.SwitchCaseImpl#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchCaseImpl extends MinimalEObjectImpl.Container implements SwitchCase {
	/**
	 * The default value of the '{@link #getCaseValue() <em>Case Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseValue()
	 * @generated
	 * @ordered
	 */
	protected static final String CASE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaseValue() <em>Case Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseValue()
	 * @generated
	 * @ordered
	 */
	protected String caseValue = CASE_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected SimpleOperation op;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OriginreqPackage.Literals.SWITCH_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaseValue() {
		return caseValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseValue(String newCaseValue) {
		String oldCaseValue = caseValue;
		caseValue = newCaseValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.SWITCH_CASE__CASE_VALUE,
					oldCaseValue, caseValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleOperation getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOp(SimpleOperation newOp, NotificationChain msgs) {
		SimpleOperation oldOp = op;
		op = newOp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.SWITCH_CASE__OP, oldOp, newOp);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(SimpleOperation newOp) {
		if (newOp != op) {
			NotificationChain msgs = null;
			if (op != null)
				msgs = ((InternalEObject) op).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.SWITCH_CASE__OP, null, msgs);
			if (newOp != null)
				msgs = ((InternalEObject) newOp).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.SWITCH_CASE__OP, null, msgs);
			msgs = basicSetOp(newOp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.SWITCH_CASE__OP, newOp, newOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OriginreqPackage.SWITCH_CASE__OP:
			return basicSetOp(null, msgs);
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
		case OriginreqPackage.SWITCH_CASE__CASE_VALUE:
			return getCaseValue();
		case OriginreqPackage.SWITCH_CASE__OP:
			return getOp();
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
		case OriginreqPackage.SWITCH_CASE__CASE_VALUE:
			setCaseValue((String) newValue);
			return;
		case OriginreqPackage.SWITCH_CASE__OP:
			setOp((SimpleOperation) newValue);
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
		case OriginreqPackage.SWITCH_CASE__CASE_VALUE:
			setCaseValue(CASE_VALUE_EDEFAULT);
			return;
		case OriginreqPackage.SWITCH_CASE__OP:
			setOp((SimpleOperation) null);
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
		case OriginreqPackage.SWITCH_CASE__CASE_VALUE:
			return CASE_VALUE_EDEFAULT == null ? caseValue != null : !CASE_VALUE_EDEFAULT.equals(caseValue);
		case OriginreqPackage.SWITCH_CASE__OP:
			return op != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (caseValue: ");
		result.append(caseValue);
		result.append(')');
		return result.toString();
	}

} //SwitchCaseImpl
