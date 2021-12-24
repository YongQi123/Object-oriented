/**
 */
package originreq.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import originreq.OCLExpressionCS;
import originreq.OriginreqPackage;
import originreq.Postcondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postcondition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link originreq.impl.PostconditionImpl#getOclexp <em>Oclexp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostconditionImpl extends MinimalEObjectImpl.Container implements Postcondition {
	/**
	 * The cached value of the '{@link #getOclexp() <em>Oclexp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclexp()
	 * @generated
	 * @ordered
	 */
	protected OCLExpressionCS oclexp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostconditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OriginreqPackage.Literals.POSTCONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLExpressionCS getOclexp() {
		return oclexp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOclexp(OCLExpressionCS newOclexp, NotificationChain msgs) {
		OCLExpressionCS oldOclexp = oclexp;
		oclexp = newOclexp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.POSTCONDITION__OCLEXP, oldOclexp, newOclexp);
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
	public void setOclexp(OCLExpressionCS newOclexp) {
		if (newOclexp != oclexp) {
			NotificationChain msgs = null;
			if (oclexp != null)
				msgs = ((InternalEObject) oclexp).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.POSTCONDITION__OCLEXP, null, msgs);
			if (newOclexp != null)
				msgs = ((InternalEObject) newOclexp).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.POSTCONDITION__OCLEXP, null, msgs);
			msgs = basicSetOclexp(newOclexp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.POSTCONDITION__OCLEXP, newOclexp,
					newOclexp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OriginreqPackage.POSTCONDITION__OCLEXP:
			return basicSetOclexp(null, msgs);
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
		case OriginreqPackage.POSTCONDITION__OCLEXP:
			return getOclexp();
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
		case OriginreqPackage.POSTCONDITION__OCLEXP:
			setOclexp((OCLExpressionCS) newValue);
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
		case OriginreqPackage.POSTCONDITION__OCLEXP:
			setOclexp((OCLExpressionCS) null);
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
		case OriginreqPackage.POSTCONDITION__OCLEXP:
			return oclexp != null;
		}
		return super.eIsSet(featureID);
	}

} //PostconditionImpl
