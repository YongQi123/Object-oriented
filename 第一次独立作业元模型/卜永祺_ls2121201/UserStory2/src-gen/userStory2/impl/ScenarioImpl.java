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

import userStory2.Event;
import userStory2.PostCondition;
import userStory2.PreCondition;
import userStory2.Scenario;
import userStory2.UserStory2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link userStory2.impl.ScenarioImpl#getGiven <em>Given</em>}</li>
 *   <li>{@link userStory2.impl.ScenarioImpl#getWhen <em>When</em>}</li>
 *   <li>{@link userStory2.impl.ScenarioImpl#getThen <em>Then</em>}</li>
 *   <li>{@link userStory2.impl.ScenarioImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
	/**
	 * The cached value of the '{@link #getGiven() <em>Given</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGiven()
	 * @generated
	 * @ordered
	 */
	protected PreCondition given;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected Event when;

	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected EList<PostCondition> then;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserStory2Package.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreCondition getGiven() {
		return given;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGiven(PreCondition newGiven, NotificationChain msgs) {
		PreCondition oldGiven = given;
		given = newGiven;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UserStory2Package.SCENARIO__GIVEN, oldGiven, newGiven);
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
	public void setGiven(PreCondition newGiven) {
		if (newGiven != given) {
			NotificationChain msgs = null;
			if (given != null)
				msgs = ((InternalEObject) given).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UserStory2Package.SCENARIO__GIVEN, null, msgs);
			if (newGiven != null)
				msgs = ((InternalEObject) newGiven).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UserStory2Package.SCENARIO__GIVEN, null, msgs);
			msgs = basicSetGiven(newGiven, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserStory2Package.SCENARIO__GIVEN, newGiven,
					newGiven));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen(Event newWhen, NotificationChain msgs) {
		Event oldWhen = when;
		when = newWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UserStory2Package.SCENARIO__WHEN, oldWhen, newWhen);
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
	public void setWhen(Event newWhen) {
		if (newWhen != when) {
			NotificationChain msgs = null;
			if (when != null)
				msgs = ((InternalEObject) when).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UserStory2Package.SCENARIO__WHEN, null, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject) newWhen).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UserStory2Package.SCENARIO__WHEN, null, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserStory2Package.SCENARIO__WHEN, newWhen, newWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PostCondition> getThen() {
		if (then == null) {
			then = new EObjectContainmentEList<PostCondition>(PostCondition.class, this,
					UserStory2Package.SCENARIO__THEN);
		}
		return then;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserStory2Package.SCENARIO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UserStory2Package.SCENARIO__GIVEN:
			return basicSetGiven(null, msgs);
		case UserStory2Package.SCENARIO__WHEN:
			return basicSetWhen(null, msgs);
		case UserStory2Package.SCENARIO__THEN:
			return ((InternalEList<?>) getThen()).basicRemove(otherEnd, msgs);
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
		case UserStory2Package.SCENARIO__GIVEN:
			return getGiven();
		case UserStory2Package.SCENARIO__WHEN:
			return getWhen();
		case UserStory2Package.SCENARIO__THEN:
			return getThen();
		case UserStory2Package.SCENARIO__NAME:
			return getName();
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
		case UserStory2Package.SCENARIO__GIVEN:
			setGiven((PreCondition) newValue);
			return;
		case UserStory2Package.SCENARIO__WHEN:
			setWhen((Event) newValue);
			return;
		case UserStory2Package.SCENARIO__THEN:
			getThen().clear();
			getThen().addAll((Collection<? extends PostCondition>) newValue);
			return;
		case UserStory2Package.SCENARIO__NAME:
			setName((String) newValue);
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
		case UserStory2Package.SCENARIO__GIVEN:
			setGiven((PreCondition) null);
			return;
		case UserStory2Package.SCENARIO__WHEN:
			setWhen((Event) null);
			return;
		case UserStory2Package.SCENARIO__THEN:
			getThen().clear();
			return;
		case UserStory2Package.SCENARIO__NAME:
			setName(NAME_EDEFAULT);
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
		case UserStory2Package.SCENARIO__GIVEN:
			return given != null;
		case UserStory2Package.SCENARIO__WHEN:
			return when != null;
		case UserStory2Package.SCENARIO__THEN:
			return then != null && !then.isEmpty();
		case UserStory2Package.SCENARIO__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //ScenarioImpl
