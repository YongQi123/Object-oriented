/**
 */
package eARS.impl;

import eARS.EARSPackage;
import eARS.FeatureIsIncluded;
import eARS.HY;
import eARS.InASpecificState;
import eARS.OptionalPreconditions;
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
 * An implementation of the model object '<em><b>HY</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eARS.impl.HYImpl#getName <em>Name</em>}</li>
 *   <li>{@link eARS.impl.HYImpl#getIfthen <em>Ifthen</em>}</li>
 *   <li>{@link eARS.impl.HYImpl#getShall <em>Shall</em>}</li>
 *   <li>{@link eARS.impl.HYImpl#getThe <em>The</em>}</li>
 *   <li>{@link eARS.impl.HYImpl#getWhile <em>While</em>}</li>
 *   <li>{@link eARS.impl.HYImpl#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HYImpl extends MinimalEObjectImpl.Container implements HY {
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
	 * The cached value of the '{@link #getIfthen() <em>Ifthen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfthen()
	 * @generated
	 * @ordered
	 */
	protected OptionalPreconditions ifthen;

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
	 * The cached value of the '{@link #getWhile() <em>While</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhile()
	 * @generated
	 * @ordered
	 */
	protected InASpecificState while_;

	/**
	 * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected FeatureIsIncluded where;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HYImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EARSPackage.Literals.HY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.HY__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EARSPackage.HY__WHILE,
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
				msgs = ((InternalEObject) while_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EARSPackage.HY__WHILE,
						null, msgs);
			if (newWhile != null)
				msgs = ((InternalEObject) newWhile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EARSPackage.HY__WHILE,
						null, msgs);
			msgs = basicSetWhile(newWhile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.HY__WHILE, newWhile, newWhile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureIsIncluded getWhere() {
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhere(FeatureIsIncluded newWhere, NotificationChain msgs) {
		FeatureIsIncluded oldWhere = where;
		where = newWhere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EARSPackage.HY__WHERE,
					oldWhere, newWhere);
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
	public void setWhere(FeatureIsIncluded newWhere) {
		if (newWhere != where) {
			NotificationChain msgs = null;
			if (where != null)
				msgs = ((InternalEObject) where).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EARSPackage.HY__WHERE,
						null, msgs);
			if (newWhere != null)
				msgs = ((InternalEObject) newWhere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EARSPackage.HY__WHERE,
						null, msgs);
			msgs = basicSetWhere(newWhere, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.HY__WHERE, newWhere, newWhere));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EARSPackage.HY__SHALL,
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
				msgs = ((InternalEObject) shall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EARSPackage.HY__SHALL,
						null, msgs);
			if (newShall != null)
				msgs = ((InternalEObject) newShall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EARSPackage.HY__SHALL,
						null, msgs);
			msgs = basicSetShall(newShall, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.HY__SHALL, newShall, newShall));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EARSPackage.HY__THE, oldThe,
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
				msgs = ((InternalEObject) the).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EARSPackage.HY__THE, null,
						msgs);
			if (newThe != null)
				msgs = ((InternalEObject) newThe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EARSPackage.HY__THE, null,
						msgs);
			msgs = basicSetThe(newThe, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.HY__THE, newThe, newThe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalPreconditions getIfthen() {
		return ifthen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfthen(OptionalPreconditions newIfthen, NotificationChain msgs) {
		OptionalPreconditions oldIfthen = ifthen;
		ifthen = newIfthen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EARSPackage.HY__IFTHEN,
					oldIfthen, newIfthen);
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
	public void setIfthen(OptionalPreconditions newIfthen) {
		if (newIfthen != ifthen) {
			NotificationChain msgs = null;
			if (ifthen != null)
				msgs = ((InternalEObject) ifthen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EARSPackage.HY__IFTHEN,
						null, msgs);
			if (newIfthen != null)
				msgs = ((InternalEObject) newIfthen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EARSPackage.HY__IFTHEN,
						null, msgs);
			msgs = basicSetIfthen(newIfthen, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.HY__IFTHEN, newIfthen, newIfthen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EARSPackage.HY__IFTHEN:
			return basicSetIfthen(null, msgs);
		case EARSPackage.HY__SHALL:
			return basicSetShall(null, msgs);
		case EARSPackage.HY__THE:
			return basicSetThe(null, msgs);
		case EARSPackage.HY__WHILE:
			return basicSetWhile(null, msgs);
		case EARSPackage.HY__WHERE:
			return basicSetWhere(null, msgs);
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
		case EARSPackage.HY__NAME:
			return getName();
		case EARSPackage.HY__IFTHEN:
			return getIfthen();
		case EARSPackage.HY__SHALL:
			return getShall();
		case EARSPackage.HY__THE:
			return getThe();
		case EARSPackage.HY__WHILE:
			return getWhile();
		case EARSPackage.HY__WHERE:
			return getWhere();
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
		case EARSPackage.HY__NAME:
			setName((String) newValue);
			return;
		case EARSPackage.HY__IFTHEN:
			setIfthen((OptionalPreconditions) newValue);
			return;
		case EARSPackage.HY__SHALL:
			setShall((SystemResponse) newValue);
			return;
		case EARSPackage.HY__THE:
			setThe((SystemName) newValue);
			return;
		case EARSPackage.HY__WHILE:
			setWhile((InASpecificState) newValue);
			return;
		case EARSPackage.HY__WHERE:
			setWhere((FeatureIsIncluded) newValue);
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
		case EARSPackage.HY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EARSPackage.HY__IFTHEN:
			setIfthen((OptionalPreconditions) null);
			return;
		case EARSPackage.HY__SHALL:
			setShall((SystemResponse) null);
			return;
		case EARSPackage.HY__THE:
			setThe((SystemName) null);
			return;
		case EARSPackage.HY__WHILE:
			setWhile((InASpecificState) null);
			return;
		case EARSPackage.HY__WHERE:
			setWhere((FeatureIsIncluded) null);
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
		case EARSPackage.HY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EARSPackage.HY__IFTHEN:
			return ifthen != null;
		case EARSPackage.HY__SHALL:
			return shall != null;
		case EARSPackage.HY__THE:
			return the != null;
		case EARSPackage.HY__WHILE:
			return while_ != null;
		case EARSPackage.HY__WHERE:
			return where != null;
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

} //HYImpl
