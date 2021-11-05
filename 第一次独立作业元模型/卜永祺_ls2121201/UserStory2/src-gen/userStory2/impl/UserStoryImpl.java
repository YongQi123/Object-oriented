/**
 */
package userStory2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import userStory2.Feature;
import userStory2.Refinement;
import userStory2.Scenario;
import userStory2.UserStory;
import userStory2.UserStory2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Story</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link userStory2.impl.UserStoryImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link userStory2.impl.UserStoryImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link userStory2.impl.UserStoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link userStory2.impl.UserStoryImpl#getRefinement <em>Refinement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserStoryImpl extends MinimalEObjectImpl.Container implements UserStory {
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature feature;

	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenario;
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
	 * The cached value of the '{@link #getRefinement() <em>Refinement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinement()
	 * @generated
	 * @ordered
	 */
	protected EList<Refinement> refinement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserStoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserStory2Package.Literals.USER_STORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeature(Feature newFeature, NotificationChain msgs) {
		Feature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UserStory2Package.USER_STORY__FEATURE, oldFeature, newFeature);
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
	public void setFeature(Feature newFeature) {
		if (newFeature != feature) {
			NotificationChain msgs = null;
			if (feature != null)
				msgs = ((InternalEObject) feature).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UserStory2Package.USER_STORY__FEATURE, null, msgs);
			if (newFeature != null)
				msgs = ((InternalEObject) newFeature).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UserStory2Package.USER_STORY__FEATURE, null, msgs);
			msgs = basicSetFeature(newFeature, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserStory2Package.USER_STORY__FEATURE, newFeature,
					newFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getScenario() {
		if (scenario == null) {
			scenario = new EObjectContainmentEList<Scenario>(Scenario.class, this,
					UserStory2Package.USER_STORY__SCENARIO);
		}
		return scenario;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserStory2Package.USER_STORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Refinement> getRefinement() {
		if (refinement == null) {
			refinement = new EObjectContainmentEList<Refinement>(Refinement.class, this,
					UserStory2Package.USER_STORY__REFINEMENT);
		}
		return refinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UserStory2Package.USER_STORY__FEATURE:
			return basicSetFeature(null, msgs);
		case UserStory2Package.USER_STORY__SCENARIO:
			return ((InternalEList<?>) getScenario()).basicRemove(otherEnd, msgs);
		case UserStory2Package.USER_STORY__REFINEMENT:
			return ((InternalEList<?>) getRefinement()).basicRemove(otherEnd, msgs);
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
		case UserStory2Package.USER_STORY__FEATURE:
			return getFeature();
		case UserStory2Package.USER_STORY__SCENARIO:
			return getScenario();
		case UserStory2Package.USER_STORY__NAME:
			return getName();
		case UserStory2Package.USER_STORY__REFINEMENT:
			return getRefinement();
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
		case UserStory2Package.USER_STORY__FEATURE:
			setFeature((Feature) newValue);
			return;
		case UserStory2Package.USER_STORY__SCENARIO:
			getScenario().clear();
			getScenario().addAll((Collection<? extends Scenario>) newValue);
			return;
		case UserStory2Package.USER_STORY__NAME:
			setName((String) newValue);
			return;
		case UserStory2Package.USER_STORY__REFINEMENT:
			getRefinement().clear();
			getRefinement().addAll((Collection<? extends Refinement>) newValue);
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
		case UserStory2Package.USER_STORY__FEATURE:
			setFeature((Feature) null);
			return;
		case UserStory2Package.USER_STORY__SCENARIO:
			getScenario().clear();
			return;
		case UserStory2Package.USER_STORY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case UserStory2Package.USER_STORY__REFINEMENT:
			getRefinement().clear();
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
		case UserStory2Package.USER_STORY__FEATURE:
			return feature != null;
		case UserStory2Package.USER_STORY__SCENARIO:
			return scenario != null && !scenario.isEmpty();
		case UserStory2Package.USER_STORY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case UserStory2Package.USER_STORY__REFINEMENT:
			return refinement != null && !refinement.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //UserStoryImpl
