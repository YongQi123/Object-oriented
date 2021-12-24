/**
 */
package originreq.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import originreq.EnumLiteralExpCS;
import originreq.OriginreqPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Literal Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link originreq.impl.EnumLiteralExpCSImpl#getEnumname <em>Enumname</em>}</li>
 *   <li>{@link originreq.impl.EnumLiteralExpCSImpl#getEunmitem <em>Eunmitem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumLiteralExpCSImpl extends LiteralExpCSImpl implements EnumLiteralExpCS {
	/**
	 * The default value of the '{@link #getEnumname() <em>Enumname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumname()
	 * @generated
	 * @ordered
	 */
	protected static final String ENUMNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnumname() <em>Enumname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumname()
	 * @generated
	 * @ordered
	 */
	protected String enumname = ENUMNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEunmitem() <em>Eunmitem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEunmitem()
	 * @generated
	 * @ordered
	 */
	protected static final String EUNMITEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEunmitem() <em>Eunmitem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEunmitem()
	 * @generated
	 * @ordered
	 */
	protected String eunmitem = EUNMITEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumLiteralExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OriginreqPackage.Literals.ENUM_LITERAL_EXP_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnumname() {
		return enumname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumname(String newEnumname) {
		String oldEnumname = enumname;
		enumname = newEnumname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.ENUM_LITERAL_EXP_CS__ENUMNAME,
					oldEnumname, enumname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEunmitem() {
		return eunmitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEunmitem(String newEunmitem) {
		String oldEunmitem = eunmitem;
		eunmitem = newEunmitem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.ENUM_LITERAL_EXP_CS__EUNMITEM,
					oldEunmitem, eunmitem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OriginreqPackage.ENUM_LITERAL_EXP_CS__ENUMNAME:
			return getEnumname();
		case OriginreqPackage.ENUM_LITERAL_EXP_CS__EUNMITEM:
			return getEunmitem();
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
		case OriginreqPackage.ENUM_LITERAL_EXP_CS__ENUMNAME:
			setEnumname((String) newValue);
			return;
		case OriginreqPackage.ENUM_LITERAL_EXP_CS__EUNMITEM:
			setEunmitem((String) newValue);
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
		case OriginreqPackage.ENUM_LITERAL_EXP_CS__ENUMNAME:
			setEnumname(ENUMNAME_EDEFAULT);
			return;
		case OriginreqPackage.ENUM_LITERAL_EXP_CS__EUNMITEM:
			setEunmitem(EUNMITEM_EDEFAULT);
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
		case OriginreqPackage.ENUM_LITERAL_EXP_CS__ENUMNAME:
			return ENUMNAME_EDEFAULT == null ? enumname != null : !ENUMNAME_EDEFAULT.equals(enumname);
		case OriginreqPackage.ENUM_LITERAL_EXP_CS__EUNMITEM:
			return EUNMITEM_EDEFAULT == null ? eunmitem != null : !EUNMITEM_EDEFAULT.equals(eunmitem);
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
		result.append(" (enumname: ");
		result.append(enumname);
		result.append(", eunmitem: ");
		result.append(eunmitem);
		result.append(')');
		return result.toString();
	}

} //EnumLiteralExpCSImpl
