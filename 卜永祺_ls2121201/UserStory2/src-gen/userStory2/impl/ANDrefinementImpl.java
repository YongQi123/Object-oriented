/**
 */
package userStory2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import userStory2.ANDrefinement;
import userStory2.UserStory;
import userStory2.UserStory2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AN Drefinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link userStory2.impl.ANDrefinementImpl#getAnd <em>And</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ANDrefinementImpl extends RefinementImpl implements ANDrefinement {
	/**
	 * The cached value of the '{@link #getAnd() <em>And</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnd()
	 * @generated
	 * @ordered
	 */
	protected UserStory and;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ANDrefinementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserStory2Package.Literals.AN_DREFINEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserStory getAnd() {
		if (and != null && and.eIsProxy()) {
			InternalEObject oldAnd = (InternalEObject) and;
			and = (UserStory) eResolveProxy(oldAnd);
			if (and != oldAnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UserStory2Package.AN_DREFINEMENT__AND,
							oldAnd, and));
			}
		}
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserStory basicGetAnd() {
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnd(UserStory newAnd) {
		UserStory oldAnd = and;
		and = newAnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserStory2Package.AN_DREFINEMENT__AND, oldAnd, and));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UserStory2Package.AN_DREFINEMENT__AND:
			if (resolve)
				return getAnd();
			return basicGetAnd();
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
		case UserStory2Package.AN_DREFINEMENT__AND:
			setAnd((UserStory) newValue);
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
		case UserStory2Package.AN_DREFINEMENT__AND:
			setAnd((UserStory) null);
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
		case UserStory2Package.AN_DREFINEMENT__AND:
			return and != null;
		}
		return super.eIsSet(featureID);
	}

} //ANDrefinementImpl
