/**
 */
package originreq.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import originreq.Actor;
import originreq.OriginreqPackage;
import originreq.UC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link originreq.impl.ActorImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link originreq.impl.ActorImpl#getSuperActor <em>Super Actor</em>}</li>
 *   <li>{@link originreq.impl.ActorImpl#getUc <em>Uc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends ParticipantImpl implements Actor {
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
	 * The cached value of the '{@link #getSuperActor() <em>Super Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperActor()
	 * @generated
	 * @ordered
	 */
	protected Actor superActor;

	/**
	 * The cached value of the '{@link #getUc() <em>Uc</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUc()
	 * @generated
	 * @ordered
	 */
	protected EList<UC> uc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OriginreqPackage.Literals.ACTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.ACTOR__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getSuperActor() {
		if (superActor != null && superActor.eIsProxy()) {
			InternalEObject oldSuperActor = (InternalEObject) superActor;
			superActor = (Actor) eResolveProxy(oldSuperActor);
			if (superActor != oldSuperActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OriginreqPackage.ACTOR__SUPER_ACTOR,
							oldSuperActor, superActor));
			}
		}
		return superActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetSuperActor() {
		return superActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperActor(Actor newSuperActor) {
		Actor oldSuperActor = superActor;
		superActor = newSuperActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.ACTOR__SUPER_ACTOR, oldSuperActor,
					superActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UC> getUc() {
		if (uc == null) {
			uc = new EObjectResolvingEList<UC>(UC.class, this, OriginreqPackage.ACTOR__UC);
		}
		return uc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OriginreqPackage.ACTOR__LABEL:
			return getLabel();
		case OriginreqPackage.ACTOR__SUPER_ACTOR:
			if (resolve)
				return getSuperActor();
			return basicGetSuperActor();
		case OriginreqPackage.ACTOR__UC:
			return getUc();
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
		case OriginreqPackage.ACTOR__LABEL:
			setLabel((String) newValue);
			return;
		case OriginreqPackage.ACTOR__SUPER_ACTOR:
			setSuperActor((Actor) newValue);
			return;
		case OriginreqPackage.ACTOR__UC:
			getUc().clear();
			getUc().addAll((Collection<? extends UC>) newValue);
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
		case OriginreqPackage.ACTOR__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case OriginreqPackage.ACTOR__SUPER_ACTOR:
			setSuperActor((Actor) null);
			return;
		case OriginreqPackage.ACTOR__UC:
			getUc().clear();
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
		case OriginreqPackage.ACTOR__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case OriginreqPackage.ACTOR__SUPER_ACTOR:
			return superActor != null;
		case OriginreqPackage.ACTOR__UC:
			return uc != null && !uc.isEmpty();
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //ActorImpl
