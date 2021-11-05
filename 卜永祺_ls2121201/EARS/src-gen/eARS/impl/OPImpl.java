/**
 */
package eARS.impl;

import eARS.EARSPackage;
import eARS.FeatureIsIncluded;
import eARS.OP;
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
 * An implementation of the model object '<em><b>OP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eARS.impl.OPImpl#getName <em>Name</em>}</li>
 *   <li>{@link eARS.impl.OPImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link eARS.impl.OPImpl#getThe <em>The</em>}</li>
 *   <li>{@link eARS.impl.OPImpl#getShall <em>Shall</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OPImpl extends MinimalEObjectImpl.Container implements OP {
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
	 * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected FeatureIsIncluded where;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EARSPackage.Literals.OP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.OP__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EARSPackage.OP__WHERE,
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
				msgs = ((InternalEObject) where).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EARSPackage.OP__WHERE,
						null, msgs);
			if (newWhere != null)
				msgs = ((InternalEObject) newWhere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EARSPackage.OP__WHERE,
						null, msgs);
			msgs = basicSetWhere(newWhere, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.OP__WHERE, newWhere, newWhere));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EARSPackage.OP__THE, oldThe,
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
				msgs = ((InternalEObject) the).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EARSPackage.OP__THE, null,
						msgs);
			if (newThe != null)
				msgs = ((InternalEObject) newThe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EARSPackage.OP__THE, null,
						msgs);
			msgs = basicSetThe(newThe, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.OP__THE, newThe, newThe));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EARSPackage.OP__SHALL,
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
				msgs = ((InternalEObject) shall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EARSPackage.OP__SHALL,
						null, msgs);
			if (newShall != null)
				msgs = ((InternalEObject) newShall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EARSPackage.OP__SHALL,
						null, msgs);
			msgs = basicSetShall(newShall, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.OP__SHALL, newShall, newShall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EARSPackage.OP__WHERE:
			return basicSetWhere(null, msgs);
		case EARSPackage.OP__THE:
			return basicSetThe(null, msgs);
		case EARSPackage.OP__SHALL:
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
		case EARSPackage.OP__NAME:
			return getName();
		case EARSPackage.OP__WHERE:
			return getWhere();
		case EARSPackage.OP__THE:
			return getThe();
		case EARSPackage.OP__SHALL:
			return getShall();
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
		case EARSPackage.OP__NAME:
			setName((String) newValue);
			return;
		case EARSPackage.OP__WHERE:
			setWhere((FeatureIsIncluded) newValue);
			return;
		case EARSPackage.OP__THE:
			setThe((SystemName) newValue);
			return;
		case EARSPackage.OP__SHALL:
			setShall((SystemResponse) newValue);
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
		case EARSPackage.OP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EARSPackage.OP__WHERE:
			setWhere((FeatureIsIncluded) null);
			return;
		case EARSPackage.OP__THE:
			setThe((SystemName) null);
			return;
		case EARSPackage.OP__SHALL:
			setShall((SystemResponse) null);
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
		case EARSPackage.OP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EARSPackage.OP__WHERE:
			return where != null;
		case EARSPackage.OP__THE:
			return the != null;
		case EARSPackage.OP__SHALL:
			return shall != null;
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

} //OPImpl
