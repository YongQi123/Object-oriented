/**
 */
package originreq.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import originreq.Invariance;
import originreq.OCLExpressionCS;
import originreq.OriginreqPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invariance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link originreq.impl.InvarianceImpl#getName <em>Name</em>}</li>
 *   <li>{@link originreq.impl.InvarianceImpl#getOcl <em>Ocl</em>}</li>
 *   <li>{@link originreq.impl.InvarianceImpl#isIsForAssociation <em>Is For Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvarianceImpl extends MinimalEObjectImpl.Container implements Invariance {
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
	 * The cached value of the '{@link #getOcl() <em>Ocl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcl()
	 * @generated
	 * @ordered
	 */
	protected OCLExpressionCS ocl;

	/**
	 * The default value of the '{@link #isIsForAssociation() <em>Is For Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForAssociation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FOR_ASSOCIATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsForAssociation() <em>Is For Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForAssociation()
	 * @generated
	 * @ordered
	 */
	protected boolean isForAssociation = IS_FOR_ASSOCIATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvarianceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OriginreqPackage.Literals.INVARIANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.INVARIANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLExpressionCS getOcl() {
		return ocl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOcl(OCLExpressionCS newOcl, NotificationChain msgs) {
		OCLExpressionCS oldOcl = ocl;
		ocl = newOcl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.INVARIANCE__OCL, oldOcl, newOcl);
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
	public void setOcl(OCLExpressionCS newOcl) {
		if (newOcl != ocl) {
			NotificationChain msgs = null;
			if (ocl != null)
				msgs = ((InternalEObject) ocl).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.INVARIANCE__OCL, null, msgs);
			if (newOcl != null)
				msgs = ((InternalEObject) newOcl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.INVARIANCE__OCL, null, msgs);
			msgs = basicSetOcl(newOcl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.INVARIANCE__OCL, newOcl, newOcl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsForAssociation() {
		return isForAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsForAssociation(boolean newIsForAssociation) {
		boolean oldIsForAssociation = isForAssociation;
		isForAssociation = newIsForAssociation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.INVARIANCE__IS_FOR_ASSOCIATION,
					oldIsForAssociation, isForAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OriginreqPackage.INVARIANCE__OCL:
			return basicSetOcl(null, msgs);
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
		case OriginreqPackage.INVARIANCE__NAME:
			return getName();
		case OriginreqPackage.INVARIANCE__OCL:
			return getOcl();
		case OriginreqPackage.INVARIANCE__IS_FOR_ASSOCIATION:
			return isIsForAssociation();
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
		case OriginreqPackage.INVARIANCE__NAME:
			setName((String) newValue);
			return;
		case OriginreqPackage.INVARIANCE__OCL:
			setOcl((OCLExpressionCS) newValue);
			return;
		case OriginreqPackage.INVARIANCE__IS_FOR_ASSOCIATION:
			setIsForAssociation((Boolean) newValue);
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
		case OriginreqPackage.INVARIANCE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case OriginreqPackage.INVARIANCE__OCL:
			setOcl((OCLExpressionCS) null);
			return;
		case OriginreqPackage.INVARIANCE__IS_FOR_ASSOCIATION:
			setIsForAssociation(IS_FOR_ASSOCIATION_EDEFAULT);
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
		case OriginreqPackage.INVARIANCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case OriginreqPackage.INVARIANCE__OCL:
			return ocl != null;
		case OriginreqPackage.INVARIANCE__IS_FOR_ASSOCIATION:
			return isForAssociation != IS_FOR_ASSOCIATION_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isForAssociation: ");
		result.append(isForAssociation);
		result.append(')');
		return result.toString();
	}

} //InvarianceImpl
