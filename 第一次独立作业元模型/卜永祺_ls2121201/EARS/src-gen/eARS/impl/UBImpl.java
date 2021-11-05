/**
 */
package eARS.impl;

import eARS.EARSPackage;
import eARS.SystemName;
import eARS.SystemResponse;
import eARS.UB;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eARS.impl.UBImpl#getThe <em>The</em>}</li>
 *   <li>{@link eARS.impl.UBImpl#getShall <em>Shall</em>}</li>
 *   <li>{@link eARS.impl.UBImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UBImpl extends MinimalEObjectImpl.Container implements UB {
	/**
	 * The cached value of the '{@link #getThe() <em>The</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThe()
	 * @generated
	 * @ordered
	 */
	protected SystemName the;

	/**
	 * The cached value of the '{@link #getShall() <em>Shall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShall()
	 * @generated
	 * @ordered
	 */
	protected SystemResponse shall;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EARSPackage.Literals.UB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemName getThe() {
		return the;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThe(SystemName newThe, NotificationChain msgs) {
		SystemName oldThe = the;
		the = newThe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EARSPackage.UB__THE, oldThe,
					newThe);
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
	public void setThe(SystemName newThe) {
		if (newThe != the) {
			NotificationChain msgs = null;
			if (the != null)
				msgs = ((InternalEObject) the).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EARSPackage.UB__THE, null,
						msgs);
			if (newThe != null)
				msgs = ((InternalEObject) newThe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EARSPackage.UB__THE, null,
						msgs);
			msgs = basicSetThe(newThe, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.UB__THE, newThe, newThe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemResponse getShall() {
		return shall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShall(SystemResponse newShall, NotificationChain msgs) {
		SystemResponse oldShall = shall;
		shall = newShall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EARSPackage.UB__SHALL,
					oldShall, newShall);
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
	public void setShall(SystemResponse newShall) {
		if (newShall != shall) {
			NotificationChain msgs = null;
			if (shall != null)
				msgs = ((InternalEObject) shall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EARSPackage.UB__SHALL,
						null, msgs);
			if (newShall != null)
				msgs = ((InternalEObject) newShall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EARSPackage.UB__SHALL,
						null, msgs);
			msgs = basicSetShall(newShall, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.UB__SHALL, newShall, newShall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.UB__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EARSPackage.UB__THE:
			return basicSetThe(null, msgs);
		case EARSPackage.UB__SHALL:
			return basicSetShall(null, msgs);
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
		case EARSPackage.UB__THE:
			return getThe();
		case EARSPackage.UB__SHALL:
			return getShall();
		case EARSPackage.UB__NAME:
			return getName();
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
		case EARSPackage.UB__THE:
			setThe((SystemName) newValue);
			return;
		case EARSPackage.UB__SHALL:
			setShall((SystemResponse) newValue);
			return;
		case EARSPackage.UB__NAME:
			setName((String) newValue);
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
		case EARSPackage.UB__THE:
			setThe((SystemName) null);
			return;
		case EARSPackage.UB__SHALL:
			setShall((SystemResponse) null);
			return;
		case EARSPackage.UB__NAME:
			setName(NAME_EDEFAULT);
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
		case EARSPackage.UB__THE:
			return the != null;
		case EARSPackage.UB__SHALL:
			return shall != null;
		case EARSPackage.UB__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //UBImpl
