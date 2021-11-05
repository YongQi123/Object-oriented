/**
 */
package eARS.impl;

import eARS.EARSPackage;
import eARS.InASpecificState;
import eARS.ST;
import eARS.SystemName;
import eARS.SystemResponse;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ST</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eARS.impl.STImpl#getName <em>Name</em>}</li>
 *   <li>{@link eARS.impl.STImpl#getWhile <em>While</em>}</li>
 *   <li>{@link eARS.impl.STImpl#getShall <em>Shall</em>}</li>
 *   <li>{@link eARS.impl.STImpl#getThe <em>The</em>}</li>
 * </ul>
 *
 * @generated
 */
public class STImpl extends MinimalEObjectImpl.Container implements ST {
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
	 * The cached value of the '{@link #getWhile() <em>While</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhile()
	 * @generated
	 * @ordered
	 */
	protected InASpecificState while_;

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
	 * The cached value of the '{@link #getThe() <em>The</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThe()
	 * @generated
	 * @ordered
	 */
	protected SystemName the;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected STImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EARSPackage.Literals.ST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.ST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InASpecificState getWhile() {
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhile(InASpecificState newWhile, NotificationChain msgs) {
		InASpecificState oldWhile = while_;
		while_ = newWhile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EARSPackage.ST__WHILE,
					oldWhile, newWhile);
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
	public void setWhile(InASpecificState newWhile) {
		if (newWhile != while_) {
			NotificationChain msgs = null;
			if (while_ != null)
				msgs = ((InternalEObject) while_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EARSPackage.ST__WHILE,
						null, msgs);
			if (newWhile != null)
				msgs = ((InternalEObject) newWhile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EARSPackage.ST__WHILE,
						null, msgs);
			msgs = basicSetWhile(newWhile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.ST__WHILE, newWhile, newWhile));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EARSPackage.ST__SHALL,
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
				msgs = ((InternalEObject) shall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EARSPackage.ST__SHALL,
						null, msgs);
			if (newShall != null)
				msgs = ((InternalEObject) newShall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EARSPackage.ST__SHALL,
						null, msgs);
			msgs = basicSetShall(newShall, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.ST__SHALL, newShall, newShall));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EARSPackage.ST__THE, oldThe,
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
				msgs = ((InternalEObject) the).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EARSPackage.ST__THE, null,
						msgs);
			if (newThe != null)
				msgs = ((InternalEObject) newThe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EARSPackage.ST__THE, null,
						msgs);
			msgs = basicSetThe(newThe, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.ST__THE, newThe, newThe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EARSPackage.ST__WHILE:
			return basicSetWhile(null, msgs);
		case EARSPackage.ST__SHALL:
			return basicSetShall(null, msgs);
		case EARSPackage.ST__THE:
			return basicSetThe(null, msgs);
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
		case EARSPackage.ST__NAME:
			return getName();
		case EARSPackage.ST__WHILE:
			return getWhile();
		case EARSPackage.ST__SHALL:
			return getShall();
		case EARSPackage.ST__THE:
			return getThe();
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
		case EARSPackage.ST__NAME:
			setName((String) newValue);
			return;
		case EARSPackage.ST__WHILE:
			setWhile((InASpecificState) newValue);
			return;
		case EARSPackage.ST__SHALL:
			setShall((SystemResponse) newValue);
			return;
		case EARSPackage.ST__THE:
			setThe((SystemName) newValue);
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
		case EARSPackage.ST__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EARSPackage.ST__WHILE:
			setWhile((InASpecificState) null);
			return;
		case EARSPackage.ST__SHALL:
			setShall((SystemResponse) null);
			return;
		case EARSPackage.ST__THE:
			setThe((SystemName) null);
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
		case EARSPackage.ST__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EARSPackage.ST__WHILE:
			return while_ != null;
		case EARSPackage.ST__SHALL:
			return shall != null;
		case EARSPackage.ST__THE:
			return the != null;
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

} //STImpl
