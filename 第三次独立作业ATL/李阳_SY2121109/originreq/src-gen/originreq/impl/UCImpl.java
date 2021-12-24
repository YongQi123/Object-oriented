/**
 */
package originreq.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import originreq.Interaction;
import originreq.OriginreqPackage;
import originreq.Service;
import originreq.UC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link originreq.impl.UCImpl#getName <em>Name</em>}</li>
 *   <li>{@link originreq.impl.UCImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link originreq.impl.UCImpl#getUCRelation <em>UC Relation</em>}</li>
 *   <li>{@link originreq.impl.UCImpl#getRelateduc <em>Relateduc</em>}</li>
 *   <li>{@link originreq.impl.UCImpl#getSsd <em>Ssd</em>}</li>
 *   <li>{@link originreq.impl.UCImpl#getService <em>Service</em>}</li>
 *   <li>{@link originreq.impl.UCImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UCImpl extends MinimalEObjectImpl.Container implements UC {
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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUCRelation() <em>UC Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUCRelation()
	 * @generated
	 * @ordered
	 */
	protected static final String UC_RELATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUCRelation() <em>UC Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUCRelation()
	 * @generated
	 * @ordered
	 */
	protected String ucRelation = UC_RELATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelateduc() <em>Relateduc</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelateduc()
	 * @generated
	 * @ordered
	 */
	protected EList<UC> relateduc;

	/**
	 * The cached value of the '{@link #getSsd() <em>Ssd</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsd()
	 * @generated
	 * @ordered
	 */
	protected EList<Interaction> ssd;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> service;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OriginreqPackage.Literals.UC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.UC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.UC__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUCRelation() {
		return ucRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUCRelation(String newUCRelation) {
		String oldUCRelation = ucRelation;
		ucRelation = newUCRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.UC__UC_RELATION, oldUCRelation,
					ucRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UC> getRelateduc() {
		if (relateduc == null) {
			relateduc = new EObjectResolvingEList<UC>(UC.class, this, OriginreqPackage.UC__RELATEDUC);
		}
		return relateduc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interaction> getSsd() {
		if (ssd == null) {
			ssd = new EObjectResolvingEList<Interaction>(Interaction.class, this, OriginreqPackage.UC__SSD);
		}
		return ssd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getService() {
		if (service == null) {
			service = new EObjectResolvingEList<Service>(Service.class, this, OriginreqPackage.UC__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.UC__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OriginreqPackage.UC__NAME:
			return getName();
		case OriginreqPackage.UC__LABEL:
			return getLabel();
		case OriginreqPackage.UC__UC_RELATION:
			return getUCRelation();
		case OriginreqPackage.UC__RELATEDUC:
			return getRelateduc();
		case OriginreqPackage.UC__SSD:
			return getSsd();
		case OriginreqPackage.UC__SERVICE:
			return getService();
		case OriginreqPackage.UC__DESCRIPTION:
			return getDescription();
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
		case OriginreqPackage.UC__NAME:
			setName((String) newValue);
			return;
		case OriginreqPackage.UC__LABEL:
			setLabel((String) newValue);
			return;
		case OriginreqPackage.UC__UC_RELATION:
			setUCRelation((String) newValue);
			return;
		case OriginreqPackage.UC__RELATEDUC:
			getRelateduc().clear();
			getRelateduc().addAll((Collection<? extends UC>) newValue);
			return;
		case OriginreqPackage.UC__SSD:
			getSsd().clear();
			getSsd().addAll((Collection<? extends Interaction>) newValue);
			return;
		case OriginreqPackage.UC__SERVICE:
			getService().clear();
			getService().addAll((Collection<? extends Service>) newValue);
			return;
		case OriginreqPackage.UC__DESCRIPTION:
			setDescription((String) newValue);
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
		case OriginreqPackage.UC__NAME:
			setName(NAME_EDEFAULT);
			return;
		case OriginreqPackage.UC__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case OriginreqPackage.UC__UC_RELATION:
			setUCRelation(UC_RELATION_EDEFAULT);
			return;
		case OriginreqPackage.UC__RELATEDUC:
			getRelateduc().clear();
			return;
		case OriginreqPackage.UC__SSD:
			getSsd().clear();
			return;
		case OriginreqPackage.UC__SERVICE:
			getService().clear();
			return;
		case OriginreqPackage.UC__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case OriginreqPackage.UC__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case OriginreqPackage.UC__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case OriginreqPackage.UC__UC_RELATION:
			return UC_RELATION_EDEFAULT == null ? ucRelation != null : !UC_RELATION_EDEFAULT.equals(ucRelation);
		case OriginreqPackage.UC__RELATEDUC:
			return relateduc != null && !relateduc.isEmpty();
		case OriginreqPackage.UC__SSD:
			return ssd != null && !ssd.isEmpty();
		case OriginreqPackage.UC__SERVICE:
			return service != null && !service.isEmpty();
		case OriginreqPackage.UC__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(", label: ");
		result.append(label);
		result.append(", UCRelation: ");
		result.append(ucRelation);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //UCImpl
