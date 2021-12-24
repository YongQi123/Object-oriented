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

import originreq.LetExpCS;
import originreq.OCLExpressionCS;
import originreq.OriginreqPackage;
import originreq.VariableDeclarationCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Let Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link originreq.impl.LetExpCSImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link originreq.impl.LetExpCSImpl#getInExpression <em>In Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LetExpCSImpl extends OCLExpressionCSImpl implements LetExpCS {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclarationCS> variable;

	/**
	 * The cached value of the '{@link #getInExpression() <em>In Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInExpression()
	 * @generated
	 * @ordered
	 */
	protected OCLExpressionCS inExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LetExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OriginreqPackage.Literals.LET_EXP_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDeclarationCS> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<VariableDeclarationCS>(VariableDeclarationCS.class, this,
					OriginreqPackage.LET_EXP_CS__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLExpressionCS getInExpression() {
		return inExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInExpression(OCLExpressionCS newInExpression, NotificationChain msgs) {
		OCLExpressionCS oldInExpression = inExpression;
		inExpression = newInExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.LET_EXP_CS__IN_EXPRESSION, oldInExpression, newInExpression);
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
	public void setInExpression(OCLExpressionCS newInExpression) {
		if (newInExpression != inExpression) {
			NotificationChain msgs = null;
			if (inExpression != null)
				msgs = ((InternalEObject) inExpression).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.LET_EXP_CS__IN_EXPRESSION, null, msgs);
			if (newInExpression != null)
				msgs = ((InternalEObject) newInExpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.LET_EXP_CS__IN_EXPRESSION, null, msgs);
			msgs = basicSetInExpression(newInExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.LET_EXP_CS__IN_EXPRESSION,
					newInExpression, newInExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OriginreqPackage.LET_EXP_CS__VARIABLE:
			return ((InternalEList<?>) getVariable()).basicRemove(otherEnd, msgs);
		case OriginreqPackage.LET_EXP_CS__IN_EXPRESSION:
			return basicSetInExpression(null, msgs);
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
		case OriginreqPackage.LET_EXP_CS__VARIABLE:
			return getVariable();
		case OriginreqPackage.LET_EXP_CS__IN_EXPRESSION:
			return getInExpression();
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
		case OriginreqPackage.LET_EXP_CS__VARIABLE:
			getVariable().clear();
			getVariable().addAll((Collection<? extends VariableDeclarationCS>) newValue);
			return;
		case OriginreqPackage.LET_EXP_CS__IN_EXPRESSION:
			setInExpression((OCLExpressionCS) newValue);
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
		case OriginreqPackage.LET_EXP_CS__VARIABLE:
			getVariable().clear();
			return;
		case OriginreqPackage.LET_EXP_CS__IN_EXPRESSION:
			setInExpression((OCLExpressionCS) null);
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
		case OriginreqPackage.LET_EXP_CS__VARIABLE:
			return variable != null && !variable.isEmpty();
		case OriginreqPackage.LET_EXP_CS__IN_EXPRESSION:
			return inExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //LetExpCSImpl
