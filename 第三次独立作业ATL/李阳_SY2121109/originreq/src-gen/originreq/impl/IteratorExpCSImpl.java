/**
 */
package originreq.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import originreq.FeatureCallExpCS;
import originreq.IteratorExpCS;
import originreq.OCLExpressionCS;
import originreq.OriginreqPackage;
import originreq.VariableDeclarationCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iterator Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link originreq.impl.IteratorExpCSImpl#getObjectCall <em>Object Call</em>}</li>
 *   <li>{@link originreq.impl.IteratorExpCSImpl#getSimpleCall <em>Simple Call</em>}</li>
 *   <li>{@link originreq.impl.IteratorExpCSImpl#getIterator <em>Iterator</em>}</li>
 *   <li>{@link originreq.impl.IteratorExpCSImpl#getVaribles <em>Varibles</em>}</li>
 *   <li>{@link originreq.impl.IteratorExpCSImpl#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IteratorExpCSImpl extends LoopExpCSImpl implements IteratorExpCS {
	/**
	 * The cached value of the '{@link #getObjectCall() <em>Object Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectCall()
	 * @generated
	 * @ordered
	 */
	protected FeatureCallExpCS objectCall;

	/**
	 * The default value of the '{@link #getSimpleCall() <em>Simple Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleCall()
	 * @generated
	 * @ordered
	 */
	protected static final String SIMPLE_CALL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimpleCall() <em>Simple Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleCall()
	 * @generated
	 * @ordered
	 */
	protected String simpleCall = SIMPLE_CALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIterator() <em>Iterator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterator()
	 * @generated
	 * @ordered
	 */
	protected static final String ITERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIterator() <em>Iterator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterator()
	 * @generated
	 * @ordered
	 */
	protected String iterator = ITERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVaribles() <em>Varibles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaribles()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclarationCS> varibles;

	/**
	 * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExp()
	 * @generated
	 * @ordered
	 */
	protected OCLExpressionCS exp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IteratorExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OriginreqPackage.Literals.ITERATOR_EXP_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCallExpCS getObjectCall() {
		return objectCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectCall(FeatureCallExpCS newObjectCall, NotificationChain msgs) {
		FeatureCallExpCS oldObjectCall = objectCall;
		objectCall = newObjectCall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.ITERATOR_EXP_CS__OBJECT_CALL, oldObjectCall, newObjectCall);
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
	public void setObjectCall(FeatureCallExpCS newObjectCall) {
		if (newObjectCall != objectCall) {
			NotificationChain msgs = null;
			if (objectCall != null)
				msgs = ((InternalEObject) objectCall).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.ITERATOR_EXP_CS__OBJECT_CALL, null, msgs);
			if (newObjectCall != null)
				msgs = ((InternalEObject) newObjectCall).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.ITERATOR_EXP_CS__OBJECT_CALL, null, msgs);
			msgs = basicSetObjectCall(newObjectCall, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.ITERATOR_EXP_CS__OBJECT_CALL,
					newObjectCall, newObjectCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSimpleCall() {
		return simpleCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleCall(String newSimpleCall) {
		String oldSimpleCall = simpleCall;
		simpleCall = newSimpleCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.ITERATOR_EXP_CS__SIMPLE_CALL,
					oldSimpleCall, simpleCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIterator() {
		return iterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterator(String newIterator) {
		String oldIterator = iterator;
		iterator = newIterator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.ITERATOR_EXP_CS__ITERATOR,
					oldIterator, iterator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDeclarationCS> getVaribles() {
		if (varibles == null) {
			varibles = new EObjectContainmentEList<VariableDeclarationCS>(VariableDeclarationCS.class, this,
					OriginreqPackage.ITERATOR_EXP_CS__VARIBLES);
		}
		return varibles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLExpressionCS getExp() {
		return exp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExp(OCLExpressionCS newExp, NotificationChain msgs) {
		OCLExpressionCS oldExp = exp;
		exp = newExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.ITERATOR_EXP_CS__EXP, oldExp, newExp);
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
	public void setExp(OCLExpressionCS newExp) {
		if (newExp != exp) {
			NotificationChain msgs = null;
			if (exp != null)
				msgs = ((InternalEObject) exp).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.ITERATOR_EXP_CS__EXP, null, msgs);
			if (newExp != null)
				msgs = ((InternalEObject) newExp).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.ITERATOR_EXP_CS__EXP, null, msgs);
			msgs = basicSetExp(newExp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.ITERATOR_EXP_CS__EXP, newExp,
					newExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OriginreqPackage.ITERATOR_EXP_CS__OBJECT_CALL:
			return basicSetObjectCall(null, msgs);
		case OriginreqPackage.ITERATOR_EXP_CS__VARIBLES:
			return ((InternalEList<?>) getVaribles()).basicRemove(otherEnd, msgs);
		case OriginreqPackage.ITERATOR_EXP_CS__EXP:
			return basicSetExp(null, msgs);
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
		case OriginreqPackage.ITERATOR_EXP_CS__OBJECT_CALL:
			return getObjectCall();
		case OriginreqPackage.ITERATOR_EXP_CS__SIMPLE_CALL:
			return getSimpleCall();
		case OriginreqPackage.ITERATOR_EXP_CS__ITERATOR:
			return getIterator();
		case OriginreqPackage.ITERATOR_EXP_CS__VARIBLES:
			return getVaribles();
		case OriginreqPackage.ITERATOR_EXP_CS__EXP:
			return getExp();
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
		case OriginreqPackage.ITERATOR_EXP_CS__OBJECT_CALL:
			setObjectCall((FeatureCallExpCS) newValue);
			return;
		case OriginreqPackage.ITERATOR_EXP_CS__SIMPLE_CALL:
			setSimpleCall((String) newValue);
			return;
		case OriginreqPackage.ITERATOR_EXP_CS__ITERATOR:
			setIterator((String) newValue);
			return;
		case OriginreqPackage.ITERATOR_EXP_CS__VARIBLES:
			getVaribles().clear();
			getVaribles().addAll((Collection<? extends VariableDeclarationCS>) newValue);
			return;
		case OriginreqPackage.ITERATOR_EXP_CS__EXP:
			setExp((OCLExpressionCS) newValue);
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
		case OriginreqPackage.ITERATOR_EXP_CS__OBJECT_CALL:
			setObjectCall((FeatureCallExpCS) null);
			return;
		case OriginreqPackage.ITERATOR_EXP_CS__SIMPLE_CALL:
			setSimpleCall(SIMPLE_CALL_EDEFAULT);
			return;
		case OriginreqPackage.ITERATOR_EXP_CS__ITERATOR:
			setIterator(ITERATOR_EDEFAULT);
			return;
		case OriginreqPackage.ITERATOR_EXP_CS__VARIBLES:
			getVaribles().clear();
			return;
		case OriginreqPackage.ITERATOR_EXP_CS__EXP:
			setExp((OCLExpressionCS) null);
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
		case OriginreqPackage.ITERATOR_EXP_CS__OBJECT_CALL:
			return objectCall != null;
		case OriginreqPackage.ITERATOR_EXP_CS__SIMPLE_CALL:
			return SIMPLE_CALL_EDEFAULT == null ? simpleCall != null : !SIMPLE_CALL_EDEFAULT.equals(simpleCall);
		case OriginreqPackage.ITERATOR_EXP_CS__ITERATOR:
			return ITERATOR_EDEFAULT == null ? iterator != null : !ITERATOR_EDEFAULT.equals(iterator);
		case OriginreqPackage.ITERATOR_EXP_CS__VARIBLES:
			return varibles != null && !varibles.isEmpty();
		case OriginreqPackage.ITERATOR_EXP_CS__EXP:
			return exp != null;
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
		result.append(" (simpleCall: ");
		result.append(simpleCall);
		result.append(", iterator: ");
		result.append(iterator);
		result.append(')');
		return result.toString();
	}

} //IteratorExpCSImpl
