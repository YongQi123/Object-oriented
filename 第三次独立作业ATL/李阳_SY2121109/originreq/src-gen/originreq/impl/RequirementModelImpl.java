/**
 */
package originreq.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import originreq.DomainModel;
import originreq.OriginreqPackage;
import originreq.RequirementModel;
import originreq.UseCaseModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link originreq.impl.RequirementModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link originreq.impl.RequirementModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link originreq.impl.RequirementModelImpl#getUseCaseModel <em>Use Case Model</em>}</li>
 *   <li>{@link originreq.impl.RequirementModelImpl#getDomainModel <em>Domain Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementModelImpl extends MinimalEObjectImpl.Container implements RequirementModel {
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
	 * The cached value of the '{@link #getUseCaseModel() <em>Use Case Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCaseModel()
	 * @generated
	 * @ordered
	 */
	protected UseCaseModel useCaseModel;

	/**
	 * The cached value of the '{@link #getDomainModel() <em>Domain Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainModel()
	 * @generated
	 * @ordered
	 */
	protected DomainModel domainModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OriginreqPackage.Literals.REQUIREMENT_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.REQUIREMENT_MODEL__NAME, oldName,
					name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.REQUIREMENT_MODEL__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseModel getUseCaseModel() {
		return useCaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUseCaseModel(UseCaseModel newUseCaseModel, NotificationChain msgs) {
		UseCaseModel oldUseCaseModel = useCaseModel;
		useCaseModel = newUseCaseModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.REQUIREMENT_MODEL__USE_CASE_MODEL, oldUseCaseModel, newUseCaseModel);
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
	public void setUseCaseModel(UseCaseModel newUseCaseModel) {
		if (newUseCaseModel != useCaseModel) {
			NotificationChain msgs = null;
			if (useCaseModel != null)
				msgs = ((InternalEObject) useCaseModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.REQUIREMENT_MODEL__USE_CASE_MODEL, null, msgs);
			if (newUseCaseModel != null)
				msgs = ((InternalEObject) newUseCaseModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.REQUIREMENT_MODEL__USE_CASE_MODEL, null, msgs);
			msgs = basicSetUseCaseModel(newUseCaseModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.REQUIREMENT_MODEL__USE_CASE_MODEL,
					newUseCaseModel, newUseCaseModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel getDomainModel() {
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainModel(DomainModel newDomainModel, NotificationChain msgs) {
		DomainModel oldDomainModel = domainModel;
		domainModel = newDomainModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.REQUIREMENT_MODEL__DOMAIN_MODEL, oldDomainModel, newDomainModel);
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
	public void setDomainModel(DomainModel newDomainModel) {
		if (newDomainModel != domainModel) {
			NotificationChain msgs = null;
			if (domainModel != null)
				msgs = ((InternalEObject) domainModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.REQUIREMENT_MODEL__DOMAIN_MODEL, null, msgs);
			if (newDomainModel != null)
				msgs = ((InternalEObject) newDomainModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.REQUIREMENT_MODEL__DOMAIN_MODEL, null, msgs);
			msgs = basicSetDomainModel(newDomainModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.REQUIREMENT_MODEL__DOMAIN_MODEL,
					newDomainModel, newDomainModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OriginreqPackage.REQUIREMENT_MODEL__USE_CASE_MODEL:
			return basicSetUseCaseModel(null, msgs);
		case OriginreqPackage.REQUIREMENT_MODEL__DOMAIN_MODEL:
			return basicSetDomainModel(null, msgs);
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
		case OriginreqPackage.REQUIREMENT_MODEL__NAME:
			return getName();
		case OriginreqPackage.REQUIREMENT_MODEL__DESCRIPTION:
			return getDescription();
		case OriginreqPackage.REQUIREMENT_MODEL__USE_CASE_MODEL:
			return getUseCaseModel();
		case OriginreqPackage.REQUIREMENT_MODEL__DOMAIN_MODEL:
			return getDomainModel();
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
		case OriginreqPackage.REQUIREMENT_MODEL__NAME:
			setName((String) newValue);
			return;
		case OriginreqPackage.REQUIREMENT_MODEL__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case OriginreqPackage.REQUIREMENT_MODEL__USE_CASE_MODEL:
			setUseCaseModel((UseCaseModel) newValue);
			return;
		case OriginreqPackage.REQUIREMENT_MODEL__DOMAIN_MODEL:
			setDomainModel((DomainModel) newValue);
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
		case OriginreqPackage.REQUIREMENT_MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case OriginreqPackage.REQUIREMENT_MODEL__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case OriginreqPackage.REQUIREMENT_MODEL__USE_CASE_MODEL:
			setUseCaseModel((UseCaseModel) null);
			return;
		case OriginreqPackage.REQUIREMENT_MODEL__DOMAIN_MODEL:
			setDomainModel((DomainModel) null);
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
		case OriginreqPackage.REQUIREMENT_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case OriginreqPackage.REQUIREMENT_MODEL__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case OriginreqPackage.REQUIREMENT_MODEL__USE_CASE_MODEL:
			return useCaseModel != null;
		case OriginreqPackage.REQUIREMENT_MODEL__DOMAIN_MODEL:
			return domainModel != null;
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //RequirementModelImpl
