/**
 */
package originreq.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import originreq.JoinExp;
import originreq.OriginreqPackage;
import originreq.Participant;
import originreq.PartitionAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link originreq.impl.PartitionActionImpl#getPatition <em>Patition</em>}</li>
 *   <li>{@link originreq.impl.PartitionActionImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartitionActionImpl extends WorkflowExpImpl implements PartitionAction {
	/**
	 * The cached value of the '{@link #getPatition() <em>Patition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatition()
	 * @generated
	 * @ordered
	 */
	protected Participant patition;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected JoinExp action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OriginreqPackage.Literals.PARTITION_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getPatition() {
		if (patition != null && patition.eIsProxy()) {
			InternalEObject oldPatition = (InternalEObject) patition;
			patition = (Participant) eResolveProxy(oldPatition);
			if (patition != oldPatition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							OriginreqPackage.PARTITION_ACTION__PATITION, oldPatition, patition));
			}
		}
		return patition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetPatition() {
		return patition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatition(Participant newPatition) {
		Participant oldPatition = patition;
		patition = newPatition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.PARTITION_ACTION__PATITION,
					oldPatition, patition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinExp getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject) action;
			action = (JoinExp) eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OriginreqPackage.PARTITION_ACTION__ACTION,
							oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinExp basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(JoinExp newAction) {
		JoinExp oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.PARTITION_ACTION__ACTION, oldAction,
					action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OriginreqPackage.PARTITION_ACTION__PATITION:
			if (resolve)
				return getPatition();
			return basicGetPatition();
		case OriginreqPackage.PARTITION_ACTION__ACTION:
			if (resolve)
				return getAction();
			return basicGetAction();
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
		case OriginreqPackage.PARTITION_ACTION__PATITION:
			setPatition((Participant) newValue);
			return;
		case OriginreqPackage.PARTITION_ACTION__ACTION:
			setAction((JoinExp) newValue);
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
		case OriginreqPackage.PARTITION_ACTION__PATITION:
			setPatition((Participant) null);
			return;
		case OriginreqPackage.PARTITION_ACTION__ACTION:
			setAction((JoinExp) null);
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
		case OriginreqPackage.PARTITION_ACTION__PATITION:
			return patition != null;
		case OriginreqPackage.PARTITION_ACTION__ACTION:
			return action != null;
		}
		return super.eIsSet(featureID);
	}

} //PartitionActionImpl
