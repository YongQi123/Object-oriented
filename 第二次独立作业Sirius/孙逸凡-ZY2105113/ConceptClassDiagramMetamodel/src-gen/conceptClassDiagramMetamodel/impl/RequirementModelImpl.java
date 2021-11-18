/**
 */
package conceptClassDiagramMetamodel.impl;

import conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage;
import conceptClassDiagramMetamodel.DomainModel;
import conceptClassDiagramMetamodel.RequirementModel;
import conceptClassDiagramMetamodel.ssd;
import conceptClassDiagramMetamodel.usecasemodel;
import conceptClassDiagramMetamodel.workflow;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conceptClassDiagramMetamodel.impl.RequirementModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.impl.RequirementModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.impl.RequirementModelImpl#getUsecasemodel <em>Usecasemodel</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.impl.RequirementModelImpl#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.impl.RequirementModelImpl#getSsd <em>Ssd</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.impl.RequirementModelImpl#getDomainmodel <em>Domainmodel</em>}</li>
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
	 * The cached value of the '{@link #getUsecasemodel() <em>Usecasemodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsecasemodel()
	 * @generated
	 * @ordered
	 */
	protected usecasemodel usecasemodel;

	/**
	 * The cached value of the '{@link #getWorkflow() <em>Workflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow()
	 * @generated
	 * @ordered
	 */
	protected workflow workflow;

	/**
	 * The cached value of the '{@link #getSsd() <em>Ssd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsd()
	 * @generated
	 * @ordered
	 */
	protected ssd ssd;

	/**
	 * The cached value of the '{@link #getDomainmodel() <em>Domainmodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainmodel()
	 * @generated
	 * @ordered
	 */
	protected DomainModel domainmodel;

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
		return ConceptClassDiagramMetamodelPackage.Literals.REQUIREMENT_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public usecasemodel getUsecasemodel() {
		if (usecasemodel != null && usecasemodel.eIsProxy()) {
			InternalEObject oldUsecasemodel = (InternalEObject) usecasemodel;
			usecasemodel = (usecasemodel) eResolveProxy(oldUsecasemodel);
			if (usecasemodel != oldUsecasemodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__USECASEMODEL, oldUsecasemodel,
							usecasemodel));
			}
		}
		return usecasemodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public usecasemodel basicGetUsecasemodel() {
		return usecasemodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsecasemodel(usecasemodel newUsecasemodel) {
		usecasemodel oldUsecasemodel = usecasemodel;
		usecasemodel = newUsecasemodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__USECASEMODEL, oldUsecasemodel,
					usecasemodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public workflow getWorkflow() {
		if (workflow != null && workflow.eIsProxy()) {
			InternalEObject oldWorkflow = (InternalEObject) workflow;
			workflow = (workflow) eResolveProxy(oldWorkflow);
			if (workflow != oldWorkflow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__WORKFLOW, oldWorkflow, workflow));
			}
		}
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public workflow basicGetWorkflow() {
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkflow(workflow newWorkflow) {
		workflow oldWorkflow = workflow;
		workflow = newWorkflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__WORKFLOW, oldWorkflow, workflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ssd getSsd() {
		if (ssd != null && ssd.eIsProxy()) {
			InternalEObject oldSsd = (InternalEObject) ssd;
			ssd = (ssd) eResolveProxy(oldSsd);
			if (ssd != oldSsd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__SSD, oldSsd, ssd));
			}
		}
		return ssd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ssd basicGetSsd() {
		return ssd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSsd(ssd newSsd) {
		ssd oldSsd = ssd;
		ssd = newSsd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__SSD, oldSsd, ssd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel getDomainmodel() {
		if (domainmodel != null && domainmodel.eIsProxy()) {
			InternalEObject oldDomainmodel = (InternalEObject) domainmodel;
			domainmodel = (DomainModel) eResolveProxy(oldDomainmodel);
			if (domainmodel != oldDomainmodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__DOMAINMODEL, oldDomainmodel,
							domainmodel));
			}
		}
		return domainmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel basicGetDomainmodel() {
		return domainmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainmodel(DomainModel newDomainmodel) {
		DomainModel oldDomainmodel = domainmodel;
		domainmodel = newDomainmodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__DOMAINMODEL, oldDomainmodel, domainmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__NAME:
			return getName();
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__DESCRIPTION:
			return getDescription();
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__USECASEMODEL:
			if (resolve)
				return getUsecasemodel();
			return basicGetUsecasemodel();
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__WORKFLOW:
			if (resolve)
				return getWorkflow();
			return basicGetWorkflow();
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__SSD:
			if (resolve)
				return getSsd();
			return basicGetSsd();
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__DOMAINMODEL:
			if (resolve)
				return getDomainmodel();
			return basicGetDomainmodel();
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
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__NAME:
			setName((String) newValue);
			return;
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__USECASEMODEL:
			setUsecasemodel((usecasemodel) newValue);
			return;
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__WORKFLOW:
			setWorkflow((workflow) newValue);
			return;
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__SSD:
			setSsd((ssd) newValue);
			return;
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__DOMAINMODEL:
			setDomainmodel((DomainModel) newValue);
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
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__USECASEMODEL:
			setUsecasemodel((usecasemodel) null);
			return;
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__WORKFLOW:
			setWorkflow((workflow) null);
			return;
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__SSD:
			setSsd((ssd) null);
			return;
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__DOMAINMODEL:
			setDomainmodel((DomainModel) null);
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
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__USECASEMODEL:
			return usecasemodel != null;
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__WORKFLOW:
			return workflow != null;
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__SSD:
			return ssd != null;
		case ConceptClassDiagramMetamodelPackage.REQUIREMENT_MODEL__DOMAINMODEL:
			return domainmodel != null;
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
