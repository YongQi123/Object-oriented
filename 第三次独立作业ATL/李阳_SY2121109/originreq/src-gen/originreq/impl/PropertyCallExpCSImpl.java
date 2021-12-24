/**
 */
package originreq.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import originreq.OriginreqPackage;
import originreq.PropertyCallExpCS;
import originreq.VariableExpCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Call Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link originreq.impl.PropertyCallExpCSImpl#getName <em>Name</em>}</li>
 *   <li>{@link originreq.impl.PropertyCallExpCSImpl#getSelfproperty <em>Selfproperty</em>}</li>
 *   <li>{@link originreq.impl.PropertyCallExpCSImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link originreq.impl.PropertyCallExpCSImpl#getPremark <em>Premark</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyCallExpCSImpl extends FeatureCallExpCSImpl implements PropertyCallExpCS {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected VariableExpCS name;

	/**
	 * The cached value of the '{@link #getSelfproperty() <em>Selfproperty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfproperty()
	 * @generated
	 * @ordered
	 */
	protected VariableExpCS selfproperty;

	/**
	 * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected String attribute = ATTRIBUTE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyCallExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OriginreqPackage.Literals.PROPERTY_CALL_EXP_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableExpCS getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(VariableExpCS newName, NotificationChain msgs) {
		VariableExpCS oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.PROPERTY_CALL_EXP_CS__NAME, oldName, newName);
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
	public void setName(VariableExpCS newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.PROPERTY_CALL_EXP_CS__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.PROPERTY_CALL_EXP_CS__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.PROPERTY_CALL_EXP_CS__NAME, newName,
					newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableExpCS getSelfproperty() {
		return selfproperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelfproperty(VariableExpCS newSelfproperty, NotificationChain msgs) {
		VariableExpCS oldSelfproperty = selfproperty;
		selfproperty = newSelfproperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.PROPERTY_CALL_EXP_CS__SELFPROPERTY, oldSelfproperty, newSelfproperty);
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
	public void setSelfproperty(VariableExpCS newSelfproperty) {
		if (newSelfproperty != selfproperty) {
			NotificationChain msgs = null;
			if (selfproperty != null)
				msgs = ((InternalEObject) selfproperty).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.PROPERTY_CALL_EXP_CS__SELFPROPERTY, null, msgs);
			if (newSelfproperty != null)
				msgs = ((InternalEObject) newSelfproperty).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.PROPERTY_CALL_EXP_CS__SELFPROPERTY, null, msgs);
			msgs = basicSetSelfproperty(newSelfproperty, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.PROPERTY_CALL_EXP_CS__SELFPROPERTY,
					newSelfproperty, newSelfproperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(String newAttribute) {
		String oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.PROPERTY_CALL_EXP_CS__ATTRIBUTE,
					oldAttribute, attribute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.PROPERTY_CALL_EXP_CS__PREMARK,
					oldPremark, premark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OriginreqPackage.PROPERTY_CALL_EXP_CS__NAME:
			return basicSetName(null, msgs);
		case OriginreqPackage.PROPERTY_CALL_EXP_CS__SELFPROPERTY:
			return basicSetSelfproperty(null, msgs);
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
		case OriginreqPackage.PROPERTY_CALL_EXP_CS__NAME:
			return getName();
		case OriginreqPackage.PROPERTY_CALL_EXP_CS__SELFPROPERTY:
			return getSelfproperty();
		case OriginreqPackage.PROPERTY_CALL_EXP_CS__ATTRIBUTE:
			return getAttribute();
		case OriginreqPackage.PROPERTY_CALL_EXP_CS__PREMARK:
			return getPremark();
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
		case OriginreqPackage.PROPERTY_CALL_EXP_CS__NAME:
			setName((VariableExpCS) newValue);
			return;
		case OriginreqPackage.PROPERTY_CALL_EXP_CS__SELFPROPERTY:
			setSelfproperty((VariableExpCS) newValue);
			return;
		case OriginreqPackage.PROPERTY_CALL_EXP_CS__ATTRIBUTE:
			setAttribute((String) newValue);
			return;
		case OriginreqPackage.PROPERTY_CALL_EXP_CS__PREMARK:
			setPremark((String) newValue);
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
		case OriginreqPackage.PROPERTY_CALL_EXP_CS__NAME:
			setName((VariableExpCS) null);
			return;
		case OriginreqPackage.PROPERTY_CALL_EXP_CS__SELFPROPERTY:
			setSelfproperty((VariableExpCS) null);
			return;
		case OriginreqPackage.PROPERTY_CALL_EXP_CS__ATTRIBUTE:
			setAttribute(ATTRIBUTE_EDEFAULT);
			return;
		case OriginreqPackage.PROPERTY_CALL_EXP_CS__PREMARK:
			setPremark(PREMARK_EDEFAULT);
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
		case OriginreqPackage.PROPERTY_CALL_EXP_CS__NAME:
			return name != null;
		case OriginreqPackage.PROPERTY_CALL_EXP_CS__SELFPROPERTY:
			return selfproperty != null;
		case OriginreqPackage.PROPERTY_CALL_EXP_CS__ATTRIBUTE:
			return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
		case OriginreqPackage.PROPERTY_CALL_EXP_CS__PREMARK:
			return PREMARK_EDEFAULT == null ? premark != null : !PREMARK_EDEFAULT.equals(premark);
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
		result.append(" (attribute: ");
		result.append(attribute);
		result.append(", premark: ");
		result.append(premark);
		result.append(')');
		return result.toString();
	}

} //PropertyCallExpCSImpl
