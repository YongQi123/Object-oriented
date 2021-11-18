/**
 */
package conceptClassDiagramMetamodel.impl;

import conceptClassDiagramMetamodel.Attribute;
import conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage;
import conceptClassDiagramMetamodel.type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conceptClassDiagramMetamodel.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.impl.AttributeImpl#isIsMultiple <em>Is Multiple</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.impl.AttributeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
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
	 * The default value of the '{@link #isIsMultiple() <em>Is Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTIPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMultiple() <em>Is Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultiple()
	 * @generated
	 * @ordered
	 */
	protected boolean isMultiple = IS_MULTIPLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected type type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptClassDiagramMetamodelPackage.Literals.ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptClassDiagramMetamodelPackage.ATTRIBUTE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMultiple() {
		return isMultiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMultiple(boolean newIsMultiple) {
		boolean oldIsMultiple = isMultiple;
		isMultiple = newIsMultiple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConceptClassDiagramMetamodelPackage.ATTRIBUTE__IS_MULTIPLE, oldIsMultiple, isMultiple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (type) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ConceptClassDiagramMetamodelPackage.ATTRIBUTE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(type newType) {
		type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptClassDiagramMetamodelPackage.ATTRIBUTE__TYPE,
					oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ConceptClassDiagramMetamodelPackage.ATTRIBUTE__NAME:
			return getName();
		case ConceptClassDiagramMetamodelPackage.ATTRIBUTE__IS_MULTIPLE:
			return isIsMultiple();
		case ConceptClassDiagramMetamodelPackage.ATTRIBUTE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
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
		case ConceptClassDiagramMetamodelPackage.ATTRIBUTE__NAME:
			setName((String) newValue);
			return;
		case ConceptClassDiagramMetamodelPackage.ATTRIBUTE__IS_MULTIPLE:
			setIsMultiple((Boolean) newValue);
			return;
		case ConceptClassDiagramMetamodelPackage.ATTRIBUTE__TYPE:
			setType((type) newValue);
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
		case ConceptClassDiagramMetamodelPackage.ATTRIBUTE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ConceptClassDiagramMetamodelPackage.ATTRIBUTE__IS_MULTIPLE:
			setIsMultiple(IS_MULTIPLE_EDEFAULT);
			return;
		case ConceptClassDiagramMetamodelPackage.ATTRIBUTE__TYPE:
			setType((type) null);
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
		case ConceptClassDiagramMetamodelPackage.ATTRIBUTE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ConceptClassDiagramMetamodelPackage.ATTRIBUTE__IS_MULTIPLE:
			return isMultiple != IS_MULTIPLE_EDEFAULT;
		case ConceptClassDiagramMetamodelPackage.ATTRIBUTE__TYPE:
			return type != null;
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
		result.append(", isMultiple: ");
		result.append(isMultiple);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
