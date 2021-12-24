/**
 */
package originreq.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import originreq.OriginreqPackage;
import originreq.PredefineOp;
import originreq.StandardOperationExpCS;
import originreq.VariableExpCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Operation Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link originreq.impl.StandardOperationExpCSImpl#getObject <em>Object</em>}</li>
 *   <li>{@link originreq.impl.StandardOperationExpCSImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link originreq.impl.StandardOperationExpCSImpl#getPremark <em>Premark</em>}</li>
 *   <li>{@link originreq.impl.StandardOperationExpCSImpl#getPredefinedop <em>Predefinedop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StandardOperationExpCSImpl extends FeatureCallExpCSImpl implements StandardOperationExpCS {
	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected VariableExpCS object;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected VariableExpCS property;

	/**
	 * The default value of the '{@link #getPremark() <em>Premark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremark()
	 * @generated
	 * @ordered
	 */
	protected static final String PREMARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPremark() <em>Premark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremark()
	 * @generated
	 * @ordered
	 */
	protected String premark = PREMARK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPredefinedop() <em>Predefinedop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedop()
	 * @generated
	 * @ordered
	 */
	protected PredefineOp predefinedop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardOperationExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OriginreqPackage.Literals.STANDARD_OPERATION_EXP_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableExpCS getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(VariableExpCS newObject, NotificationChain msgs) {
		VariableExpCS oldObject = object;
		object = newObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.STANDARD_OPERATION_EXP_CS__OBJECT, oldObject, newObject);
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
	public void setObject(VariableExpCS newObject) {
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject) object).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.STANDARD_OPERATION_EXP_CS__OBJECT, null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject) newObject).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.STANDARD_OPERATION_EXP_CS__OBJECT, null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.STANDARD_OPERATION_EXP_CS__OBJECT,
					newObject, newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableExpCS getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(VariableExpCS newProperty, NotificationChain msgs) {
		VariableExpCS oldProperty = property;
		property = newProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.STANDARD_OPERATION_EXP_CS__PROPERTY, oldProperty, newProperty);
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
	public void setProperty(VariableExpCS newProperty) {
		if (newProperty != property) {
			NotificationChain msgs = null;
			if (property != null)
				msgs = ((InternalEObject) property).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.STANDARD_OPERATION_EXP_CS__PROPERTY, null, msgs);
			if (newProperty != null)
				msgs = ((InternalEObject) newProperty).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.STANDARD_OPERATION_EXP_CS__PROPERTY, null, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.STANDARD_OPERATION_EXP_CS__PROPERTY,
					newProperty, newProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPremark() {
		return premark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPremark(String newPremark) {
		String oldPremark = premark;
		premark = newPremark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.STANDARD_OPERATION_EXP_CS__PREMARK,
					oldPremark, premark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredefineOp getPredefinedop() {
		return predefinedop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredefinedop(PredefineOp newPredefinedop, NotificationChain msgs) {
		PredefineOp oldPredefinedop = predefinedop;
		predefinedop = newPredefinedop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.STANDARD_OPERATION_EXP_CS__PREDEFINEDOP, oldPredefinedop, newPredefinedop);
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
	public void setPredefinedop(PredefineOp newPredefinedop) {
		if (newPredefinedop != predefinedop) {
			NotificationChain msgs = null;
			if (predefinedop != null)
				msgs = ((InternalEObject) predefinedop).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.STANDARD_OPERATION_EXP_CS__PREDEFINEDOP, null, msgs);
			if (newPredefinedop != null)
				msgs = ((InternalEObject) newPredefinedop).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.STANDARD_OPERATION_EXP_CS__PREDEFINEDOP, null, msgs);
			msgs = basicSetPredefinedop(newPredefinedop, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.STANDARD_OPERATION_EXP_CS__PREDEFINEDOP, newPredefinedop, newPredefinedop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OriginreqPackage.STANDARD_OPERATION_EXP_CS__OBJECT:
			return basicSetObject(null, msgs);
		case OriginreqPackage.STANDARD_OPERATION_EXP_CS__PROPERTY:
			return basicSetProperty(null, msgs);
		case OriginreqPackage.STANDARD_OPERATION_EXP_CS__PREDEFINEDOP:
			return basicSetPredefinedop(null, msgs);
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
		case OriginreqPackage.STANDARD_OPERATION_EXP_CS__OBJECT:
			return getObject();
		case OriginreqPackage.STANDARD_OPERATION_EXP_CS__PROPERTY:
			return getProperty();
		case OriginreqPackage.STANDARD_OPERATION_EXP_CS__PREMARK:
			return getPremark();
		case OriginreqPackage.STANDARD_OPERATION_EXP_CS__PREDEFINEDOP:
			return getPredefinedop();
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
		case OriginreqPackage.STANDARD_OPERATION_EXP_CS__OBJECT:
			setObject((VariableExpCS) newValue);
			return;
		case OriginreqPackage.STANDARD_OPERATION_EXP_CS__PROPERTY:
			setProperty((VariableExpCS) newValue);
			return;
		case OriginreqPackage.STANDARD_OPERATION_EXP_CS__PREMARK:
			setPremark((String) newValue);
			return;
		case OriginreqPackage.STANDARD_OPERATION_EXP_CS__PREDEFINEDOP:
			setPredefinedop((PredefineOp) newValue);
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
		case OriginreqPackage.STANDARD_OPERATION_EXP_CS__OBJECT:
			setObject((VariableExpCS) null);
			return;
		case OriginreqPackage.STANDARD_OPERATION_EXP_CS__PROPERTY:
			setProperty((VariableExpCS) null);
			return;
		case OriginreqPackage.STANDARD_OPERATION_EXP_CS__PREMARK:
			setPremark(PREMARK_EDEFAULT);
			return;
		case OriginreqPackage.STANDARD_OPERATION_EXP_CS__PREDEFINEDOP:
			setPredefinedop((PredefineOp) null);
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
		case OriginreqPackage.STANDARD_OPERATION_EXP_CS__OBJECT:
			return object != null;
		case OriginreqPackage.STANDARD_OPERATION_EXP_CS__PROPERTY:
			return property != null;
		case OriginreqPackage.STANDARD_OPERATION_EXP_CS__PREMARK:
			return PREMARK_EDEFAULT == null ? premark != null : !PREMARK_EDEFAULT.equals(premark);
		case OriginreqPackage.STANDARD_OPERATION_EXP_CS__PREDEFINEDOP:
			return predefinedop != null;
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
		result.append(" (premark: ");
		result.append(premark);
		result.append(')');
		return result.toString();
	}

} //StandardOperationExpCSImpl
