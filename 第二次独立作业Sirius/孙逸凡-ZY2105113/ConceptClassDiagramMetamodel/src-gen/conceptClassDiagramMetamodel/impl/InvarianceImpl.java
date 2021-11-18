/**
 */
package conceptClassDiagramMetamodel.impl;

import conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage;
import conceptClassDiagramMetamodel.Invariance;
import conceptClassDiagramMetamodel.ocl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invariance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conceptClassDiagramMetamodel.impl.InvarianceImpl#getName <em>Name</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.impl.InvarianceImpl#isIsForAssociation <em>Is For Association</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.impl.InvarianceImpl#getOcl <em>Ocl</em>}</li>
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
	 * The cached value of the '{@link #getOcl() <em>Ocl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcl()
	 * @generated
	 * @ordered
	 */
	protected ocl ocl;

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
		return ConceptClassDiagramMetamodelPackage.Literals.INVARIANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptClassDiagramMetamodelPackage.INVARIANCE__NAME,
					oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConceptClassDiagramMetamodelPackage.INVARIANCE__IS_FOR_ASSOCIATION, oldIsForAssociation,
					isForAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ocl getOcl() {
		if (ocl != null && ocl.eIsProxy()) {
			InternalEObject oldOcl = (InternalEObject) ocl;
			ocl = (ocl) eResolveProxy(oldOcl);
			if (ocl != oldOcl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ConceptClassDiagramMetamodelPackage.INVARIANCE__OCL, oldOcl, ocl));
			}
		}
		return ocl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ocl basicGetOcl() {
		return ocl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcl(ocl newOcl) {
		ocl oldOcl = ocl;
		ocl = newOcl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptClassDiagramMetamodelPackage.INVARIANCE__OCL,
					oldOcl, ocl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ConceptClassDiagramMetamodelPackage.INVARIANCE__NAME:
			return getName();
		case ConceptClassDiagramMetamodelPackage.INVARIANCE__IS_FOR_ASSOCIATION:
			return isIsForAssociation();
		case ConceptClassDiagramMetamodelPackage.INVARIANCE__OCL:
			if (resolve)
				return getOcl();
			return basicGetOcl();
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
		case ConceptClassDiagramMetamodelPackage.INVARIANCE__NAME:
			setName((String) newValue);
			return;
		case ConceptClassDiagramMetamodelPackage.INVARIANCE__IS_FOR_ASSOCIATION:
			setIsForAssociation((Boolean) newValue);
			return;
		case ConceptClassDiagramMetamodelPackage.INVARIANCE__OCL:
			setOcl((ocl) newValue);
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
		case ConceptClassDiagramMetamodelPackage.INVARIANCE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ConceptClassDiagramMetamodelPackage.INVARIANCE__IS_FOR_ASSOCIATION:
			setIsForAssociation(IS_FOR_ASSOCIATION_EDEFAULT);
			return;
		case ConceptClassDiagramMetamodelPackage.INVARIANCE__OCL:
			setOcl((ocl) null);
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
		case ConceptClassDiagramMetamodelPackage.INVARIANCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ConceptClassDiagramMetamodelPackage.INVARIANCE__IS_FOR_ASSOCIATION:
			return isForAssociation != IS_FOR_ASSOCIATION_EDEFAULT;
		case ConceptClassDiagramMetamodelPackage.INVARIANCE__OCL:
			return ocl != null;
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
