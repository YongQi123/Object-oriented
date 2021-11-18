/**
 */
package conceptClassDiagramMetamodel.impl;

import conceptClassDiagramMetamodel.Attribute;
import conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage;
import conceptClassDiagramMetamodel.Entity;
import conceptClassDiagramMetamodel.Invariance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conceptClassDiagramMetamodel.impl.EntityImpl#isIsCRUD <em>Is CRUD</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.impl.EntityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.impl.EntityImpl#getSuperentity <em>Superentity</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.impl.EntityImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.impl.EntityImpl#getEntityOpposite <em>Entity Opposite</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.impl.EntityImpl#getComposition <em>Composition</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.impl.EntityImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.impl.EntityImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.impl.EntityImpl#getInvariance <em>Invariance</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.impl.EntityImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
	/**
	 * The default value of the '{@link #isIsCRUD() <em>Is CRUD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCRUD()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CRUD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCRUD() <em>Is CRUD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCRUD()
	 * @generated
	 * @ordered
	 */
	protected boolean isCRUD = IS_CRUD_EDEFAULT;

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
	 * The cached value of the '{@link #getSuperentity() <em>Superentity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperentity()
	 * @generated
	 * @ordered
	 */
	protected Entity superentity;

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
	 * The cached value of the '{@link #getEntityOpposite() <em>Entity Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityOpposite()
	 * @generated
	 * @ordered
	 */
	protected Entity entityOpposite;

	/**
	 * The cached value of the '{@link #getComposition() <em>Composition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposition()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> composition;

	/**
	 * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> aggregation;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * The cached value of the '{@link #getInvariance() <em>Invariance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariance()
	 * @generated
	 * @ordered
	 */
	protected EList<Invariance> invariance;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> reference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptClassDiagramMetamodelPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCRUD() {
		return isCRUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCRUD(boolean newIsCRUD) {
		boolean oldIsCRUD = isCRUD;
		isCRUD = newIsCRUD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptClassDiagramMetamodelPackage.ENTITY__IS_CRUD,
					oldIsCRUD, isCRUD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptClassDiagramMetamodelPackage.ENTITY__NAME,
					oldName, name));
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
					ConceptClassDiagramMetamodelPackage.ENTITY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getSuperentity() {
		if (superentity != null && superentity.eIsProxy()) {
			InternalEObject oldSuperentity = (InternalEObject) superentity;
			superentity = (Entity) eResolveProxy(oldSuperentity);
			if (superentity != oldSuperentity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ConceptClassDiagramMetamodelPackage.ENTITY__SUPERENTITY, oldSuperentity, superentity));
			}
		}
		return superentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSuperentity() {
		return superentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperentity(Entity newSuperentity) {
		Entity oldSuperentity = superentity;
		superentity = newSuperentity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConceptClassDiagramMetamodelPackage.ENTITY__SUPERENTITY, oldSuperentity, superentity));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY, oldEntity, entity));
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
	public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY, oldEntity, newEntity);
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
	public void setEntity(Entity newEntity) {
		if (newEntity != entity) {
			NotificationChain msgs = null;
			if (entity != null)
				msgs = ((InternalEObject) entity).eInverseRemove(this,
						ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY_OPPOSITE, Entity.class, msgs);
			if (newEntity != null)
				msgs = ((InternalEObject) newEntity).eInverseAdd(this,
						ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY_OPPOSITE, Entity.class, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY,
					newEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntityOpposite() {
		if (entityOpposite != null && entityOpposite.eIsProxy()) {
			InternalEObject oldEntityOpposite = (InternalEObject) entityOpposite;
			entityOpposite = (Entity) eResolveProxy(oldEntityOpposite);
			if (entityOpposite != oldEntityOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY_OPPOSITE, oldEntityOpposite,
							entityOpposite));
			}
		}
		return entityOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntityOpposite() {
		return entityOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntityOpposite(Entity newEntityOpposite, NotificationChain msgs) {
		Entity oldEntityOpposite = entityOpposite;
		entityOpposite = newEntityOpposite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY_OPPOSITE, oldEntityOpposite, newEntityOpposite);
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
	public void setEntityOpposite(Entity newEntityOpposite) {
		if (newEntityOpposite != entityOpposite) {
			NotificationChain msgs = null;
			if (entityOpposite != null)
				msgs = ((InternalEObject) entityOpposite).eInverseRemove(this,
						ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY, Entity.class, msgs);
			if (newEntityOpposite != null)
				msgs = ((InternalEObject) newEntityOpposite).eInverseAdd(this,
						ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY, Entity.class, msgs);
			msgs = basicSetEntityOpposite(newEntityOpposite, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY_OPPOSITE, newEntityOpposite, newEntityOpposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getComposition() {
		if (composition == null) {
			composition = new EObjectResolvingEList<Entity>(Entity.class, this,
					ConceptClassDiagramMetamodelPackage.ENTITY__COMPOSITION);
		}
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getAggregation() {
		if (aggregation == null) {
			aggregation = new EObjectResolvingEList<Entity>(Entity.class, this,
					ConceptClassDiagramMetamodelPackage.ENTITY__AGGREGATION);
		}
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this,
					ConceptClassDiagramMetamodelPackage.ENTITY__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Invariance> getInvariance() {
		if (invariance == null) {
			invariance = new EObjectContainmentEList<Invariance>(Invariance.class, this,
					ConceptClassDiagramMetamodelPackage.ENTITY__INVARIANCE);
		}
		return invariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getReference() {
		if (reference == null) {
			reference = new EObjectResolvingEList<Entity>(Entity.class, this,
					ConceptClassDiagramMetamodelPackage.ENTITY__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY:
			if (entity != null)
				msgs = ((InternalEObject) entity).eInverseRemove(this,
						ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY_OPPOSITE, Entity.class, msgs);
			return basicSetEntity((Entity) otherEnd, msgs);
		case ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY_OPPOSITE:
			if (entityOpposite != null)
				msgs = ((InternalEObject) entityOpposite).eInverseRemove(this,
						ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY, Entity.class, msgs);
			return basicSetEntityOpposite((Entity) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY:
			return basicSetEntity(null, msgs);
		case ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY_OPPOSITE:
			return basicSetEntityOpposite(null, msgs);
		case ConceptClassDiagramMetamodelPackage.ENTITY__ATTRIBUTE:
			return ((InternalEList<?>) getAttribute()).basicRemove(otherEnd, msgs);
		case ConceptClassDiagramMetamodelPackage.ENTITY__INVARIANCE:
			return ((InternalEList<?>) getInvariance()).basicRemove(otherEnd, msgs);
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
		case ConceptClassDiagramMetamodelPackage.ENTITY__IS_CRUD:
			return isIsCRUD();
		case ConceptClassDiagramMetamodelPackage.ENTITY__NAME:
			return getName();
		case ConceptClassDiagramMetamodelPackage.ENTITY__DESCRIPTION:
			return getDescription();
		case ConceptClassDiagramMetamodelPackage.ENTITY__SUPERENTITY:
			if (resolve)
				return getSuperentity();
			return basicGetSuperentity();
		case ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY:
			if (resolve)
				return getEntity();
			return basicGetEntity();
		case ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY_OPPOSITE:
			if (resolve)
				return getEntityOpposite();
			return basicGetEntityOpposite();
		case ConceptClassDiagramMetamodelPackage.ENTITY__COMPOSITION:
			return getComposition();
		case ConceptClassDiagramMetamodelPackage.ENTITY__AGGREGATION:
			return getAggregation();
		case ConceptClassDiagramMetamodelPackage.ENTITY__ATTRIBUTE:
			return getAttribute();
		case ConceptClassDiagramMetamodelPackage.ENTITY__INVARIANCE:
			return getInvariance();
		case ConceptClassDiagramMetamodelPackage.ENTITY__REFERENCE:
			return getReference();
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
		case ConceptClassDiagramMetamodelPackage.ENTITY__IS_CRUD:
			setIsCRUD((Boolean) newValue);
			return;
		case ConceptClassDiagramMetamodelPackage.ENTITY__NAME:
			setName((String) newValue);
			return;
		case ConceptClassDiagramMetamodelPackage.ENTITY__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ConceptClassDiagramMetamodelPackage.ENTITY__SUPERENTITY:
			setSuperentity((Entity) newValue);
			return;
		case ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY:
			setEntity((Entity) newValue);
			return;
		case ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY_OPPOSITE:
			setEntityOpposite((Entity) newValue);
			return;
		case ConceptClassDiagramMetamodelPackage.ENTITY__COMPOSITION:
			getComposition().clear();
			getComposition().addAll((Collection<? extends Entity>) newValue);
			return;
		case ConceptClassDiagramMetamodelPackage.ENTITY__AGGREGATION:
			getAggregation().clear();
			getAggregation().addAll((Collection<? extends Entity>) newValue);
			return;
		case ConceptClassDiagramMetamodelPackage.ENTITY__ATTRIBUTE:
			getAttribute().clear();
			getAttribute().addAll((Collection<? extends Attribute>) newValue);
			return;
		case ConceptClassDiagramMetamodelPackage.ENTITY__INVARIANCE:
			getInvariance().clear();
			getInvariance().addAll((Collection<? extends Invariance>) newValue);
			return;
		case ConceptClassDiagramMetamodelPackage.ENTITY__REFERENCE:
			getReference().clear();
			getReference().addAll((Collection<? extends Entity>) newValue);
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
		case ConceptClassDiagramMetamodelPackage.ENTITY__IS_CRUD:
			setIsCRUD(IS_CRUD_EDEFAULT);
			return;
		case ConceptClassDiagramMetamodelPackage.ENTITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ConceptClassDiagramMetamodelPackage.ENTITY__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case ConceptClassDiagramMetamodelPackage.ENTITY__SUPERENTITY:
			setSuperentity((Entity) null);
			return;
		case ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY:
			setEntity((Entity) null);
			return;
		case ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY_OPPOSITE:
			setEntityOpposite((Entity) null);
			return;
		case ConceptClassDiagramMetamodelPackage.ENTITY__COMPOSITION:
			getComposition().clear();
			return;
		case ConceptClassDiagramMetamodelPackage.ENTITY__AGGREGATION:
			getAggregation().clear();
			return;
		case ConceptClassDiagramMetamodelPackage.ENTITY__ATTRIBUTE:
			getAttribute().clear();
			return;
		case ConceptClassDiagramMetamodelPackage.ENTITY__INVARIANCE:
			getInvariance().clear();
			return;
		case ConceptClassDiagramMetamodelPackage.ENTITY__REFERENCE:
			getReference().clear();
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
		case ConceptClassDiagramMetamodelPackage.ENTITY__IS_CRUD:
			return isCRUD != IS_CRUD_EDEFAULT;
		case ConceptClassDiagramMetamodelPackage.ENTITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ConceptClassDiagramMetamodelPackage.ENTITY__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case ConceptClassDiagramMetamodelPackage.ENTITY__SUPERENTITY:
			return superentity != null;
		case ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY:
			return entity != null;
		case ConceptClassDiagramMetamodelPackage.ENTITY__ENTITY_OPPOSITE:
			return entityOpposite != null;
		case ConceptClassDiagramMetamodelPackage.ENTITY__COMPOSITION:
			return composition != null && !composition.isEmpty();
		case ConceptClassDiagramMetamodelPackage.ENTITY__AGGREGATION:
			return aggregation != null && !aggregation.isEmpty();
		case ConceptClassDiagramMetamodelPackage.ENTITY__ATTRIBUTE:
			return attribute != null && !attribute.isEmpty();
		case ConceptClassDiagramMetamodelPackage.ENTITY__INVARIANCE:
			return invariance != null && !invariance.isEmpty();
		case ConceptClassDiagramMetamodelPackage.ENTITY__REFERENCE:
			return reference != null && !reference.isEmpty();
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
		result.append(" (isCRUD: ");
		result.append(isCRUD);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
