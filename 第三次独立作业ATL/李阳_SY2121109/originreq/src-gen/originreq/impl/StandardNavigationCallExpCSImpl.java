/**
 */
package originreq.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import originreq.ClassiferCallExpCS;
import originreq.OriginreqPackage;
import originreq.PropertyCallExpCS;
import originreq.StandardCollectionOperation;
import originreq.StandardNavigationCallExpCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Navigation Call Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link originreq.impl.StandardNavigationCallExpCSImpl#getClassifercall <em>Classifercall</em>}</li>
 *   <li>{@link originreq.impl.StandardNavigationCallExpCSImpl#getPropertycall <em>Propertycall</em>}</li>
 *   <li>{@link originreq.impl.StandardNavigationCallExpCSImpl#getObject <em>Object</em>}</li>
 *   <li>{@link originreq.impl.StandardNavigationCallExpCSImpl#getNavop <em>Navop</em>}</li>
 *   <li>{@link originreq.impl.StandardNavigationCallExpCSImpl#getStandardOP <em>Standard OP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StandardNavigationCallExpCSImpl extends FeatureCallExpCSImpl implements StandardNavigationCallExpCS {
	/**
	 * The cached value of the '{@link #getClassifercall() <em>Classifercall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifercall()
	 * @generated
	 * @ordered
	 */
	protected ClassiferCallExpCS classifercall;

	/**
	 * The cached value of the '{@link #getPropertycall() <em>Propertycall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertycall()
	 * @generated
	 * @ordered
	 */
	protected PropertyCallExpCS propertycall;

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
	 * The default value of the '{@link #getNavop() <em>Navop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavop()
	 * @generated
	 * @ordered
	 */
	protected static final String NAVOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavop() <em>Navop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavop()
	 * @generated
	 * @ordered
	 */
	protected String navop = NAVOP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStandardOP() <em>Standard OP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardOP()
	 * @generated
	 * @ordered
	 */
	protected StandardCollectionOperation standardOP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardNavigationCallExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OriginreqPackage.Literals.STANDARD_NAVIGATION_CALL_EXP_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassiferCallExpCS getClassifercall() {
		return classifercall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifercall(ClassiferCallExpCS newClassifercall, NotificationChain msgs) {
		ClassiferCallExpCS oldClassifercall = classifercall;
		classifercall = newClassifercall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__CLASSIFERCALL, oldClassifercall,
					newClassifercall);
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
	public void setClassifercall(ClassiferCallExpCS newClassifercall) {
		if (newClassifercall != classifercall) {
			NotificationChain msgs = null;
			if (classifercall != null)
				msgs = ((InternalEObject) classifercall).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__CLASSIFERCALL, null,
						msgs);
			if (newClassifercall != null)
				msgs = ((InternalEObject) newClassifercall).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__CLASSIFERCALL, null,
						msgs);
			msgs = basicSetClassifercall(newClassifercall, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__CLASSIFERCALL, newClassifercall,
					newClassifercall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCallExpCS getPropertycall() {
		return propertycall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertycall(PropertyCallExpCS newPropertycall, NotificationChain msgs) {
		PropertyCallExpCS oldPropertycall = propertycall;
		propertycall = newPropertycall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__PROPERTYCALL, oldPropertycall, newPropertycall);
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
	public void setPropertycall(PropertyCallExpCS newPropertycall) {
		if (newPropertycall != propertycall) {
			NotificationChain msgs = null;
			if (propertycall != null)
				msgs = ((InternalEObject) propertycall).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__PROPERTYCALL, null,
						msgs);
			if (newPropertycall != null)
				msgs = ((InternalEObject) newPropertycall).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__PROPERTYCALL, null,
						msgs);
			msgs = basicSetPropertycall(newPropertycall, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__PROPERTYCALL, newPropertycall, newPropertycall));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__OBJECT, oldObject, object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNavop() {
		return navop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavop(String newNavop) {
		String oldNavop = navop;
		navop = newNavop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__NAVOP, oldNavop, navop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardCollectionOperation getStandardOP() {
		return standardOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardOP(StandardCollectionOperation newStandardOP, NotificationChain msgs) {
		StandardCollectionOperation oldStandardOP = standardOP;
		standardOP = newStandardOP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__STANDARD_OP, oldStandardOP, newStandardOP);
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
	public void setStandardOP(StandardCollectionOperation newStandardOP) {
		if (newStandardOP != standardOP) {
			NotificationChain msgs = null;
			if (standardOP != null)
				msgs = ((InternalEObject) standardOP).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__STANDARD_OP, null,
						msgs);
			if (newStandardOP != null)
				msgs = ((InternalEObject) newStandardOP).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__STANDARD_OP, null,
						msgs);
			msgs = basicSetStandardOP(newStandardOP, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__STANDARD_OP, newStandardOP, newStandardOP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__CLASSIFERCALL:
			return basicSetClassifercall(null, msgs);
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__PROPERTYCALL:
			return basicSetPropertycall(null, msgs);
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__STANDARD_OP:
			return basicSetStandardOP(null, msgs);
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
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__CLASSIFERCALL:
			return getClassifercall();
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__PROPERTYCALL:
			return getPropertycall();
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__OBJECT:
			return getObject();
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__NAVOP:
			return getNavop();
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__STANDARD_OP:
			return getStandardOP();
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
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__CLASSIFERCALL:
			setClassifercall((ClassiferCallExpCS) newValue);
			return;
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__PROPERTYCALL:
			setPropertycall((PropertyCallExpCS) newValue);
			return;
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__OBJECT:
			setObject((String) newValue);
			return;
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__NAVOP:
			setNavop((String) newValue);
			return;
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__STANDARD_OP:
			setStandardOP((StandardCollectionOperation) newValue);
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
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__CLASSIFERCALL:
			setClassifercall((ClassiferCallExpCS) null);
			return;
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__PROPERTYCALL:
			setPropertycall((PropertyCallExpCS) null);
			return;
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__OBJECT:
			setObject(OBJECT_EDEFAULT);
			return;
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__NAVOP:
			setNavop(NAVOP_EDEFAULT);
			return;
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__STANDARD_OP:
			setStandardOP((StandardCollectionOperation) null);
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
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__CLASSIFERCALL:
			return classifercall != null;
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__PROPERTYCALL:
			return propertycall != null;
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__OBJECT:
			return OBJECT_EDEFAULT == null ? object != null : !OBJECT_EDEFAULT.equals(object);
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__NAVOP:
			return NAVOP_EDEFAULT == null ? navop != null : !NAVOP_EDEFAULT.equals(navop);
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS__STANDARD_OP:
			return standardOP != null;
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
		result.append(", navop: ");
		result.append(navop);
		result.append(')');
		return result.toString();
	}

} //StandardNavigationCallExpCSImpl
