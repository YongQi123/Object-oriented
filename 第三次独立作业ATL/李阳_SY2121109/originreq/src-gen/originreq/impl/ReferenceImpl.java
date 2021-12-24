/**
 */
package originreq.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import originreq.Entity;
import originreq.OriginreqPackage;
import originreq.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link originreq.impl.ReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link originreq.impl.ReferenceImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link originreq.impl.ReferenceImpl#isIsmultiple <em>Ismultiple</em>}</li>
 *   <li>{@link originreq.impl.ReferenceImpl#isIsReverseAssoication <em>Is Reverse Assoication</em>}</li>
 *   <li>{@link originreq.impl.ReferenceImpl#isIsAggregation <em>Is Aggregation</em>}</li>
 *   <li>{@link originreq.impl.ReferenceImpl#isIsComposition <em>Is Composition</em>}</li>
 *   <li>{@link originreq.impl.ReferenceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends MinimalEObjectImpl.Container implements Reference {
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
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity;

	/**
	 * The default value of the '{@link #isIsmultiple() <em>Ismultiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsmultiple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISMULTIPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsmultiple() <em>Ismultiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsmultiple()
	 * @generated
	 * @ordered
	 */
	protected boolean ismultiple = ISMULTIPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsReverseAssoication() <em>Is Reverse Assoication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReverseAssoication()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REVERSE_ASSOICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReverseAssoication() <em>Is Reverse Assoication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReverseAssoication()
	 * @generated
	 * @ordered
	 */
	protected boolean isReverseAssoication = IS_REVERSE_ASSOICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAggregation() <em>Is Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AGGREGATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAggregation() <em>Is Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAggregation()
	 * @generated
	 * @ordered
	 */
	protected boolean isAggregation = IS_AGGREGATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsComposition() <em>Is Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsComposition() <em>Is Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposition()
	 * @generated
	 * @ordered
	 */
	protected boolean isComposition = IS_COMPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OriginreqPackage.Literals.REFERENCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.REFERENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject) entity;
			entity = (Entity) eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OriginreqPackage.REFERENCE__ENTITY,
							oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Entity newEntity) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.REFERENCE__ENTITY, oldEntity,
					entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsmultiple() {
		return ismultiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsmultiple(boolean newIsmultiple) {
		boolean oldIsmultiple = ismultiple;
		ismultiple = newIsmultiple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.REFERENCE__ISMULTIPLE, oldIsmultiple,
					ismultiple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReverseAssoication() {
		return isReverseAssoication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReverseAssoication(boolean newIsReverseAssoication) {
		boolean oldIsReverseAssoication = isReverseAssoication;
		isReverseAssoication = newIsReverseAssoication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.REFERENCE__IS_REVERSE_ASSOICATION,
					oldIsReverseAssoication, isReverseAssoication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAggregation() {
		return isAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAggregation(boolean newIsAggregation) {
		boolean oldIsAggregation = isAggregation;
		isAggregation = newIsAggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.REFERENCE__IS_AGGREGATION,
					oldIsAggregation, isAggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsComposition() {
		return isComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComposition(boolean newIsComposition) {
		boolean oldIsComposition = isComposition;
		isComposition = newIsComposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.REFERENCE__IS_COMPOSITION,
					oldIsComposition, isComposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.REFERENCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OriginreqPackage.REFERENCE__NAME:
			return getName();
		case OriginreqPackage.REFERENCE__ENTITY:
			if (resolve)
				return getEntity();
			return basicGetEntity();
		case OriginreqPackage.REFERENCE__ISMULTIPLE:
			return isIsmultiple();
		case OriginreqPackage.REFERENCE__IS_REVERSE_ASSOICATION:
			return isIsReverseAssoication();
		case OriginreqPackage.REFERENCE__IS_AGGREGATION:
			return isIsAggregation();
		case OriginreqPackage.REFERENCE__IS_COMPOSITION:
			return isIsComposition();
		case OriginreqPackage.REFERENCE__TYPE:
			return getType();
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
		case OriginreqPackage.REFERENCE__NAME:
			setName((String) newValue);
			return;
		case OriginreqPackage.REFERENCE__ENTITY:
			setEntity((Entity) newValue);
			return;
		case OriginreqPackage.REFERENCE__ISMULTIPLE:
			setIsmultiple((Boolean) newValue);
			return;
		case OriginreqPackage.REFERENCE__IS_REVERSE_ASSOICATION:
			setIsReverseAssoication((Boolean) newValue);
			return;
		case OriginreqPackage.REFERENCE__IS_AGGREGATION:
			setIsAggregation((Boolean) newValue);
			return;
		case OriginreqPackage.REFERENCE__IS_COMPOSITION:
			setIsComposition((Boolean) newValue);
			return;
		case OriginreqPackage.REFERENCE__TYPE:
			setType((String) newValue);
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
		case OriginreqPackage.REFERENCE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case OriginreqPackage.REFERENCE__ENTITY:
			setEntity((Entity) null);
			return;
		case OriginreqPackage.REFERENCE__ISMULTIPLE:
			setIsmultiple(ISMULTIPLE_EDEFAULT);
			return;
		case OriginreqPackage.REFERENCE__IS_REVERSE_ASSOICATION:
			setIsReverseAssoication(IS_REVERSE_ASSOICATION_EDEFAULT);
			return;
		case OriginreqPackage.REFERENCE__IS_AGGREGATION:
			setIsAggregation(IS_AGGREGATION_EDEFAULT);
			return;
		case OriginreqPackage.REFERENCE__IS_COMPOSITION:
			setIsComposition(IS_COMPOSITION_EDEFAULT);
			return;
		case OriginreqPackage.REFERENCE__TYPE:
			setType(TYPE_EDEFAULT);
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
		case OriginreqPackage.REFERENCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case OriginreqPackage.REFERENCE__ENTITY:
			return entity != null;
		case OriginreqPackage.REFERENCE__ISMULTIPLE:
			return ismultiple != ISMULTIPLE_EDEFAULT;
		case OriginreqPackage.REFERENCE__IS_REVERSE_ASSOICATION:
			return isReverseAssoication != IS_REVERSE_ASSOICATION_EDEFAULT;
		case OriginreqPackage.REFERENCE__IS_AGGREGATION:
			return isAggregation != IS_AGGREGATION_EDEFAULT;
		case OriginreqPackage.REFERENCE__IS_COMPOSITION:
			return isComposition != IS_COMPOSITION_EDEFAULT;
		case OriginreqPackage.REFERENCE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(", ismultiple: ");
		result.append(ismultiple);
		result.append(", isReverseAssoication: ");
		result.append(isReverseAssoication);
		result.append(", isAggregation: ");
		result.append(isAggregation);
		result.append(", isComposition: ");
		result.append(isComposition);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ReferenceImpl
