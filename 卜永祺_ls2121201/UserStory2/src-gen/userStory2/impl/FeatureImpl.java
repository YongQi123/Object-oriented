/**
 */
package userStory2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import userStory2.Earning;
import userStory2.Feature;
import userStory2.Goal;
import userStory2.Role;
import userStory2.UserStory2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link userStory2.impl.FeatureImpl#getAsa <em>Asa</em>}</li>
 *   <li>{@link userStory2.impl.FeatureImpl#getIwantto <em>Iwantto</em>}</li>
 *   <li>{@link userStory2.impl.FeatureImpl#getInorderto <em>Inorderto</em>}</li>
 *   <li>{@link userStory2.impl.FeatureImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends MinimalEObjectImpl.Container implements Feature {
	/**
	 * The cached value of the '{@link #getAsa() <em>Asa</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsa()
	 * @generated
	 * @ordered
	 */
	protected Role asa;

	/**
	 * The cached value of the '{@link #getIwantto() <em>Iwantto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIwantto()
	 * @generated
	 * @ordered
	 */
	protected Goal iwantto;

	/**
	 * The cached value of the '{@link #getInorderto() <em>Inorderto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInorderto()
	 * @generated
	 * @ordered
	 */
	protected Earning inorderto;

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
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserStory2Package.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getAsa() {
		return asa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsa(Role newAsa, NotificationChain msgs) {
		Role oldAsa = asa;
		asa = newAsa;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UserStory2Package.FEATURE__ASA, oldAsa, newAsa);
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
	public void setAsa(Role newAsa) {
		if (newAsa != asa) {
			NotificationChain msgs = null;
			if (asa != null)
				msgs = ((InternalEObject) asa).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UserStory2Package.FEATURE__ASA, null, msgs);
			if (newAsa != null)
				msgs = ((InternalEObject) newAsa).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UserStory2Package.FEATURE__ASA, null, msgs);
			msgs = basicSetAsa(newAsa, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserStory2Package.FEATURE__ASA, newAsa, newAsa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal getIwantto() {
		return iwantto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIwantto(Goal newIwantto, NotificationChain msgs) {
		Goal oldIwantto = iwantto;
		iwantto = newIwantto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UserStory2Package.FEATURE__IWANTTO, oldIwantto, newIwantto);
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
	public void setIwantto(Goal newIwantto) {
		if (newIwantto != iwantto) {
			NotificationChain msgs = null;
			if (iwantto != null)
				msgs = ((InternalEObject) iwantto).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UserStory2Package.FEATURE__IWANTTO, null, msgs);
			if (newIwantto != null)
				msgs = ((InternalEObject) newIwantto).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UserStory2Package.FEATURE__IWANTTO, null, msgs);
			msgs = basicSetIwantto(newIwantto, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserStory2Package.FEATURE__IWANTTO, newIwantto,
					newIwantto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Earning getInorderto() {
		return inorderto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInorderto(Earning newInorderto, NotificationChain msgs) {
		Earning oldInorderto = inorderto;
		inorderto = newInorderto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UserStory2Package.FEATURE__INORDERTO, oldInorderto, newInorderto);
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
	public void setInorderto(Earning newInorderto) {
		if (newInorderto != inorderto) {
			NotificationChain msgs = null;
			if (inorderto != null)
				msgs = ((InternalEObject) inorderto).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UserStory2Package.FEATURE__INORDERTO, null, msgs);
			if (newInorderto != null)
				msgs = ((InternalEObject) newInorderto).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UserStory2Package.FEATURE__INORDERTO, null, msgs);
			msgs = basicSetInorderto(newInorderto, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserStory2Package.FEATURE__INORDERTO, newInorderto,
					newInorderto));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserStory2Package.FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UserStory2Package.FEATURE__ASA:
			return basicSetAsa(null, msgs);
		case UserStory2Package.FEATURE__IWANTTO:
			return basicSetIwantto(null, msgs);
		case UserStory2Package.FEATURE__INORDERTO:
			return basicSetInorderto(null, msgs);
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
		case UserStory2Package.FEATURE__ASA:
			return getAsa();
		case UserStory2Package.FEATURE__IWANTTO:
			return getIwantto();
		case UserStory2Package.FEATURE__INORDERTO:
			return getInorderto();
		case UserStory2Package.FEATURE__NAME:
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
		case UserStory2Package.FEATURE__ASA:
			setAsa((Role) newValue);
			return;
		case UserStory2Package.FEATURE__IWANTTO:
			setIwantto((Goal) newValue);
			return;
		case UserStory2Package.FEATURE__INORDERTO:
			setInorderto((Earning) newValue);
			return;
		case UserStory2Package.FEATURE__NAME:
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
		case UserStory2Package.FEATURE__ASA:
			setAsa((Role) null);
			return;
		case UserStory2Package.FEATURE__IWANTTO:
			setIwantto((Goal) null);
			return;
		case UserStory2Package.FEATURE__INORDERTO:
			setInorderto((Earning) null);
			return;
		case UserStory2Package.FEATURE__NAME:
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
		case UserStory2Package.FEATURE__ASA:
			return asa != null;
		case UserStory2Package.FEATURE__IWANTTO:
			return iwantto != null;
		case UserStory2Package.FEATURE__INORDERTO:
			return inorderto != null;
		case UserStory2Package.FEATURE__NAME:
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

} //FeatureImpl
