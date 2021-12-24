/**
 */
package originreq.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import originreq.OperationParameters;
import originreq.OriginreqPackage;
import originreq.PropertyCallExpCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link originreq.impl.OperationParametersImpl#getObject <em>Object</em>}</li>
 *   <li>{@link originreq.impl.OperationParametersImpl#getObjectproperty <em>Objectproperty</em>}</li>
 *   <li>{@link originreq.impl.OperationParametersImpl#getString <em>String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationParametersImpl extends MinimalEObjectImpl.Container implements OperationParameters {
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
	 * The cached value of the '{@link #getObjectproperty() <em>Objectproperty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectproperty()
	 * @generated
	 * @ordered
	 */
	protected PropertyCallExpCS objectproperty;

	/**
	 * The default value of the '{@link #getString() <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getString() <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected String string = STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OriginreqPackage.Literals.OPERATION_PARAMETERS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.OPERATION_PARAMETERS__OBJECT,
					oldObject, object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCallExpCS getObjectproperty() {
		return objectproperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectproperty(PropertyCallExpCS newObjectproperty, NotificationChain msgs) {
		PropertyCallExpCS oldObjectproperty = objectproperty;
		objectproperty = newObjectproperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.OPERATION_PARAMETERS__OBJECTPROPERTY, oldObjectproperty, newObjectproperty);
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
	public void setObjectproperty(PropertyCallExpCS newObjectproperty) {
		if (newObjectproperty != objectproperty) {
			NotificationChain msgs = null;
			if (objectproperty != null)
				msgs = ((InternalEObject) objectproperty).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.OPERATION_PARAMETERS__OBJECTPROPERTY, null, msgs);
			if (newObjectproperty != null)
				msgs = ((InternalEObject) newObjectproperty).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.OPERATION_PARAMETERS__OBJECTPROPERTY, null, msgs);
			msgs = basicSetObjectproperty(newObjectproperty, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.OPERATION_PARAMETERS__OBJECTPROPERTY,
					newObjectproperty, newObjectproperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getString() {
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setString(String newString) {
		String oldString = string;
		string = newString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.OPERATION_PARAMETERS__STRING,
					oldString, string));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OriginreqPackage.OPERATION_PARAMETERS__OBJECTPROPERTY:
			return basicSetObjectproperty(null, msgs);
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
		case OriginreqPackage.OPERATION_PARAMETERS__OBJECT:
			return getObject();
		case OriginreqPackage.OPERATION_PARAMETERS__OBJECTPROPERTY:
			return getObjectproperty();
		case OriginreqPackage.OPERATION_PARAMETERS__STRING:
			return getString();
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
		case OriginreqPackage.OPERATION_PARAMETERS__OBJECT:
			setObject((String) newValue);
			return;
		case OriginreqPackage.OPERATION_PARAMETERS__OBJECTPROPERTY:
			setObjectproperty((PropertyCallExpCS) newValue);
			return;
		case OriginreqPackage.OPERATION_PARAMETERS__STRING:
			setString((String) newValue);
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
		case OriginreqPackage.OPERATION_PARAMETERS__OBJECT:
			setObject(OBJECT_EDEFAULT);
			return;
		case OriginreqPackage.OPERATION_PARAMETERS__OBJECTPROPERTY:
			setObjectproperty((PropertyCallExpCS) null);
			return;
		case OriginreqPackage.OPERATION_PARAMETERS__STRING:
			setString(STRING_EDEFAULT);
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
		case OriginreqPackage.OPERATION_PARAMETERS__OBJECT:
			return OBJECT_EDEFAULT == null ? object != null : !OBJECT_EDEFAULT.equals(object);
		case OriginreqPackage.OPERATION_PARAMETERS__OBJECTPROPERTY:
			return objectproperty != null;
		case OriginreqPackage.OPERATION_PARAMETERS__STRING:
			return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
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
		result.append(", string: ");
		result.append(string);
		result.append(')');
		return result.toString();
	}

} //OperationParametersImpl
