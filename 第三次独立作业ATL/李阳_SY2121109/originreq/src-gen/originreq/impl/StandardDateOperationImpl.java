/**
 */
package originreq.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import originreq.NumberLiteralExpCS;
import originreq.OriginreqPackage;
import originreq.PropertyCallExpCS;
import originreq.StandardDateOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Date Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link originreq.impl.StandardDateOperationImpl#getObject <em>Object</em>}</li>
 *   <li>{@link originreq.impl.StandardDateOperationImpl#getDatenum <em>Datenum</em>}</li>
 *   <li>{@link originreq.impl.StandardDateOperationImpl#getProcall <em>Procall</em>}</li>
 *   <li>{@link originreq.impl.StandardDateOperationImpl#getNested <em>Nested</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StandardDateOperationImpl extends PredefineOpImpl implements StandardDateOperation {
	/**
	 * The default value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected String object = OBJECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatenum() <em>Datenum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenum()
	 * @generated
	 * @ordered
	 */
	protected NumberLiteralExpCS datenum;

	/**
	 * The cached value of the '{@link #getProcall() <em>Procall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcall()
	 * @generated
	 * @ordered
	 */
	protected PropertyCallExpCS procall;

	/**
	 * The cached value of the '{@link #getNested() <em>Nested</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNested()
	 * @generated
	 * @ordered
	 */
	protected StandardDateOperation nested;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardDateOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OriginreqPackage.Literals.STANDARD_DATE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(String newObject) {
		String oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.STANDARD_DATE_OPERATION__OBJECT,
					oldObject, object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberLiteralExpCS getDatenum() {
		return datenum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatenum(NumberLiteralExpCS newDatenum, NotificationChain msgs) {
		NumberLiteralExpCS oldDatenum = datenum;
		datenum = newDatenum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.STANDARD_DATE_OPERATION__DATENUM, oldDatenum, newDatenum);
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
	public void setDatenum(NumberLiteralExpCS newDatenum) {
		if (newDatenum != datenum) {
			NotificationChain msgs = null;
			if (datenum != null)
				msgs = ((InternalEObject) datenum).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.STANDARD_DATE_OPERATION__DATENUM, null, msgs);
			if (newDatenum != null)
				msgs = ((InternalEObject) newDatenum).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.STANDARD_DATE_OPERATION__DATENUM, null, msgs);
			msgs = basicSetDatenum(newDatenum, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.STANDARD_DATE_OPERATION__DATENUM,
					newDatenum, newDatenum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCallExpCS getProcall() {
		return procall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcall(PropertyCallExpCS newProcall, NotificationChain msgs) {
		PropertyCallExpCS oldProcall = procall;
		procall = newProcall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.STANDARD_DATE_OPERATION__PROCALL, oldProcall, newProcall);
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
	public void setProcall(PropertyCallExpCS newProcall) {
		if (newProcall != procall) {
			NotificationChain msgs = null;
			if (procall != null)
				msgs = ((InternalEObject) procall).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.STANDARD_DATE_OPERATION__PROCALL, null, msgs);
			if (newProcall != null)
				msgs = ((InternalEObject) newProcall).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.STANDARD_DATE_OPERATION__PROCALL, null, msgs);
			msgs = basicSetProcall(newProcall, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.STANDARD_DATE_OPERATION__PROCALL,
					newProcall, newProcall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardDateOperation getNested() {
		return nested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNested(StandardDateOperation newNested, NotificationChain msgs) {
		StandardDateOperation oldNested = nested;
		nested = newNested;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.STANDARD_DATE_OPERATION__NESTED, oldNested, newNested);
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
	public void setNested(StandardDateOperation newNested) {
		if (newNested != nested) {
			NotificationChain msgs = null;
			if (nested != null)
				msgs = ((InternalEObject) nested).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.STANDARD_DATE_OPERATION__NESTED, null, msgs);
			if (newNested != null)
				msgs = ((InternalEObject) newNested).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.STANDARD_DATE_OPERATION__NESTED, null, msgs);
			msgs = basicSetNested(newNested, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.STANDARD_DATE_OPERATION__NESTED,
					newNested, newNested));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OriginreqPackage.STANDARD_DATE_OPERATION__DATENUM:
			return basicSetDatenum(null, msgs);
		case OriginreqPackage.STANDARD_DATE_OPERATION__PROCALL:
			return basicSetProcall(null, msgs);
		case OriginreqPackage.STANDARD_DATE_OPERATION__NESTED:
			return basicSetNested(null, msgs);
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
		case OriginreqPackage.STANDARD_DATE_OPERATION__OBJECT:
			return getObject();
		case OriginreqPackage.STANDARD_DATE_OPERATION__DATENUM:
			return getDatenum();
		case OriginreqPackage.STANDARD_DATE_OPERATION__PROCALL:
			return getProcall();
		case OriginreqPackage.STANDARD_DATE_OPERATION__NESTED:
			return getNested();
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
		case OriginreqPackage.STANDARD_DATE_OPERATION__OBJECT:
			setObject((String) newValue);
			return;
		case OriginreqPackage.STANDARD_DATE_OPERATION__DATENUM:
			setDatenum((NumberLiteralExpCS) newValue);
			return;
		case OriginreqPackage.STANDARD_DATE_OPERATION__PROCALL:
			setProcall((PropertyCallExpCS) newValue);
			return;
		case OriginreqPackage.STANDARD_DATE_OPERATION__NESTED:
			setNested((StandardDateOperation) newValue);
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
		case OriginreqPackage.STANDARD_DATE_OPERATION__OBJECT:
			setObject(OBJECT_EDEFAULT);
			return;
		case OriginreqPackage.STANDARD_DATE_OPERATION__DATENUM:
			setDatenum((NumberLiteralExpCS) null);
			return;
		case OriginreqPackage.STANDARD_DATE_OPERATION__PROCALL:
			setProcall((PropertyCallExpCS) null);
			return;
		case OriginreqPackage.STANDARD_DATE_OPERATION__NESTED:
			setNested((StandardDateOperation) null);
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
		case OriginreqPackage.STANDARD_DATE_OPERATION__OBJECT:
			return OBJECT_EDEFAULT == null ? object != null : !OBJECT_EDEFAULT.equals(object);
		case OriginreqPackage.STANDARD_DATE_OPERATION__DATENUM:
			return datenum != null;
		case OriginreqPackage.STANDARD_DATE_OPERATION__PROCALL:
			return procall != null;
		case OriginreqPackage.STANDARD_DATE_OPERATION__NESTED:
			return nested != null;
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
		result.append(" (object: ");
		result.append(object);
		result.append(')');
		return result.toString();
	}

} //StandardDateOperationImpl
