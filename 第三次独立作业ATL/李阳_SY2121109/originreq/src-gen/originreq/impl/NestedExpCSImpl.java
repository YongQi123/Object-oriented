/**
 */
package originreq.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import originreq.NestedExpCS;
import originreq.OCLExpressionCS;
import originreq.OriginreqPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link originreq.impl.NestedExpCSImpl#getNestedExpression <em>Nested Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NestedExpCSImpl extends OCLExpressionCSImpl implements NestedExpCS {
	/**
	 * The cached value of the '{@link #getNestedExpression() <em>Nested Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedExpression()
	 * @generated
	 * @ordered
	 */
	protected OCLExpressionCS nestedExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NestedExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OriginreqPackage.Literals.NESTED_EXP_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLExpressionCS getNestedExpression() {
		return nestedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestedExpression(OCLExpressionCS newNestedExpression, NotificationChain msgs) {
		OCLExpressionCS oldNestedExpression = nestedExpression;
		nestedExpression = newNestedExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.NESTED_EXP_CS__NESTED_EXPRESSION, oldNestedExpression, newNestedExpression);
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
	public void setNestedExpression(OCLExpressionCS newNestedExpression) {
		if (newNestedExpression != nestedExpression) {
			NotificationChain msgs = null;
			if (nestedExpression != null)
				msgs = ((InternalEObject) nestedExpression).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.NESTED_EXP_CS__NESTED_EXPRESSION, null, msgs);
			if (newNestedExpression != null)
				msgs = ((InternalEObject) newNestedExpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.NESTED_EXP_CS__NESTED_EXPRESSION, null, msgs);
			msgs = basicSetNestedExpression(newNestedExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.NESTED_EXP_CS__NESTED_EXPRESSION,
					newNestedExpression, newNestedExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OriginreqPackage.NESTED_EXP_CS__NESTED_EXPRESSION:
			return basicSetNestedExpression(null, msgs);
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
		case OriginreqPackage.NESTED_EXP_CS__NESTED_EXPRESSION:
			return getNestedExpression();
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
		case OriginreqPackage.NESTED_EXP_CS__NESTED_EXPRESSION:
			setNestedExpression((OCLExpressionCS) newValue);
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
		case OriginreqPackage.NESTED_EXP_CS__NESTED_EXPRESSION:
			setNestedExpression((OCLExpressionCS) null);
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
		case OriginreqPackage.NESTED_EXP_CS__NESTED_EXPRESSION:
			return nestedExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //NestedExpCSImpl
