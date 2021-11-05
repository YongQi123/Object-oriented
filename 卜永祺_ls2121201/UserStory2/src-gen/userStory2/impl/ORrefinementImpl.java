/**
 */
package userStory2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import userStory2.ORrefinement;
import userStory2.UserStory;
import userStory2.UserStory2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ORrefinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link userStory2.impl.ORrefinementImpl#getOr <em>Or</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ORrefinementImpl extends RefinementImpl implements ORrefinement {
	/**
	 * The cached value of the '{@link #getOr() <em>Or</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOr()
	 * @generated
	 * @ordered
	 */
	protected UserStory or;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ORrefinementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserStory2Package.Literals.ORREFINEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserStory getOr() {
		if (or != null && or.eIsProxy()) {
			InternalEObject oldOr = (InternalEObject) or;
			or = (UserStory) eResolveProxy(oldOr);
			if (or != oldOr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UserStory2Package.ORREFINEMENT__OR, oldOr,
							or));
			}
		}
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserStory basicGetOr() {
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOr(UserStory newOr) {
		UserStory oldOr = or;
		or = newOr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserStory2Package.ORREFINEMENT__OR, oldOr, or));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UserStory2Package.ORREFINEMENT__OR:
			if (resolve)
				return getOr();
			return basicGetOr();
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
		case UserStory2Package.ORREFINEMENT__OR:
			setOr((UserStory) newValue);
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
		case UserStory2Package.ORREFINEMENT__OR:
			setOr((UserStory) null);
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
		case UserStory2Package.ORREFINEMENT__OR:
			return or != null;
		}
		return super.eIsSet(featureID);
	}

} //ORrefinementImpl
