/**
 */
package eARS.impl;

import eARS.EARSPackage;
import eARS.OptionalPreconditions;
import eARS.SystemName;
import eARS.SystemResponse;
import eARS.UW;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UW</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eARS.impl.UWImpl#getName <em>Name</em>}</li>
 *   <li>{@link eARS.impl.UWImpl#getThe <em>The</em>}</li>
 *   <li>{@link eARS.impl.UWImpl#getShall <em>Shall</em>}</li>
 *   <li>{@link eARS.impl.UWImpl#getIf <em>If</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UWImpl extends MinimalEObjectImpl.Container implements UW {
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
	 * The cached value of the '{@link #getIf() <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected OptionalPreconditions if_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UWImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EARSPackage.Literals.UW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.UW__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EARSPackage.UW__THE, oldThe,
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
				msgs = ((InternalEObject) the).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EARSPackage.UW__THE, null,
						msgs);
			if (newThe != null)
				msgs = ((InternalEObject) newThe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EARSPackage.UW__THE, null,
						msgs);
			msgs = basicSetThe(newThe, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.UW__THE, newThe, newThe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalPreconditions getIf() {
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIf(OptionalPreconditions newIf, NotificationChain msgs) {
		OptionalPreconditions oldIf = if_;
		if_ = newIf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EARSPackage.UW__IF, oldIf,
					newIf);
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
	public void setIf(OptionalPreconditions newIf) {
		if (newIf != if_) {
			NotificationChain msgs = null;
			if (if_ != null)
				msgs = ((InternalEObject) if_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EARSPackage.UW__IF, null,
						msgs);
			if (newIf != null)
				msgs = ((InternalEObject) newIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EARSPackage.UW__IF, null,
						msgs);
			msgs = basicSetIf(newIf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.UW__IF, newIf, newIf));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EARSPackage.UW__SHALL,
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
				msgs = ((InternalEObject) shall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EARSPackage.UW__SHALL,
						null, msgs);
			if (newShall != null)
				msgs = ((InternalEObject) newShall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EARSPackage.UW__SHALL,
						null, msgs);
			msgs = basicSetShall(newShall, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.UW__SHALL, newShall, newShall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EARSPackage.UW__THE:
			return basicSetThe(null, msgs);
		case EARSPackage.UW__SHALL:
			return basicSetShall(null, msgs);
		case EARSPackage.UW__IF:
			return basicSetIf(null, msgs);
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
		case EARSPackage.UW__NAME:
			return getName();
		case EARSPackage.UW__THE:
			return getThe();
		case EARSPackage.UW__SHALL:
			return getShall();
		case EARSPackage.UW__IF:
			return getIf();
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
		case EARSPackage.UW__NAME:
			setName((String) newValue);
			return;
		case EARSPackage.UW__THE:
			setThe((SystemName) newValue);
			return;
		case EARSPackage.UW__SHALL:
			setShall((SystemResponse) newValue);
			return;
		case EARSPackage.UW__IF:
			setIf((OptionalPreconditions) newValue);
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
		case EARSPackage.UW__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EARSPackage.UW__THE:
			setThe((SystemName) null);
			return;
		case EARSPackage.UW__SHALL:
			setShall((SystemResponse) null);
			return;
		case EARSPackage.UW__IF:
			setIf((OptionalPreconditions) null);
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
		case EARSPackage.UW__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EARSPackage.UW__THE:
			return the != null;
		case EARSPackage.UW__SHALL:
			return shall != null;
		case EARSPackage.UW__IF:
			return if_ != null;
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

} //UWImpl
