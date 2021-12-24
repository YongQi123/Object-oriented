/**
 */
package originreq.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import originreq.AtomicExpression;
import originreq.LeftSubAtomicExpression;
import originreq.OriginreqPackage;
import originreq.PrimitiveLiteralExpCS;
import originreq.RightSubAtomicExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link originreq.impl.AtomicExpressionImpl#getLeftside <em>Leftside</em>}</li>
 *   <li>{@link originreq.impl.AtomicExpressionImpl#getInfixop <em>Infixop</em>}</li>
 *   <li>{@link originreq.impl.AtomicExpressionImpl#getRightside <em>Rightside</em>}</li>
 *   <li>{@link originreq.impl.AtomicExpressionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link originreq.impl.AtomicExpressionImpl#getNum <em>Num</em>}</li>
 *   <li>{@link originreq.impl.AtomicExpressionImpl#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicExpressionImpl extends MinimalEObjectImpl.Container implements AtomicExpression {
	/**
	 * The cached value of the '{@link #getLeftside() <em>Leftside</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftside()
	 * @generated
	 * @ordered
	 */
	protected LeftSubAtomicExpression leftside;

	/**
	 * The default value of the '{@link #getInfixop() <em>Infixop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfixop()
	 * @generated
	 * @ordered
	 */
	protected static final String INFIXOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInfixop() <em>Infixop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfixop()
	 * @generated
	 * @ordered
	 */
	protected String infixop = INFIXOP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRightside() <em>Rightside</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightside()
	 * @generated
	 * @ordered
	 */
	protected RightSubAtomicExpression rightside;

	/**
	 * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected static final String OP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected String op = OP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNum() <em>Num</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveLiteralExpCS num;

	/**
	 * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExp()
	 * @generated
	 * @ordered
	 */
	protected AtomicExpression exp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OriginreqPackage.Literals.ATOMIC_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftSubAtomicExpression getLeftside() {
		return leftside;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftside(LeftSubAtomicExpression newLeftside, NotificationChain msgs) {
		LeftSubAtomicExpression oldLeftside = leftside;
		leftside = newLeftside;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.ATOMIC_EXPRESSION__LEFTSIDE, oldLeftside, newLeftside);
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
	public void setLeftside(LeftSubAtomicExpression newLeftside) {
		if (newLeftside != leftside) {
			NotificationChain msgs = null;
			if (leftside != null)
				msgs = ((InternalEObject) leftside).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.ATOMIC_EXPRESSION__LEFTSIDE, null, msgs);
			if (newLeftside != null)
				msgs = ((InternalEObject) newLeftside).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.ATOMIC_EXPRESSION__LEFTSIDE, null, msgs);
			msgs = basicSetLeftside(newLeftside, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.ATOMIC_EXPRESSION__LEFTSIDE,
					newLeftside, newLeftside));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInfixop() {
		return infixop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfixop(String newInfixop) {
		String oldInfixop = infixop;
		infixop = newInfixop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.ATOMIC_EXPRESSION__INFIXOP,
					oldInfixop, infixop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightSubAtomicExpression getRightside() {
		return rightside;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightside(RightSubAtomicExpression newRightside, NotificationChain msgs) {
		RightSubAtomicExpression oldRightside = rightside;
		rightside = newRightside;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.ATOMIC_EXPRESSION__RIGHTSIDE, oldRightside, newRightside);
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
	public void setRightside(RightSubAtomicExpression newRightside) {
		if (newRightside != rightside) {
			NotificationChain msgs = null;
			if (rightside != null)
				msgs = ((InternalEObject) rightside).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.ATOMIC_EXPRESSION__RIGHTSIDE, null, msgs);
			if (newRightside != null)
				msgs = ((InternalEObject) newRightside).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.ATOMIC_EXPRESSION__RIGHTSIDE, null, msgs);
			msgs = basicSetRightside(newRightside, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.ATOMIC_EXPRESSION__RIGHTSIDE,
					newRightside, newRightside));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(String newOp) {
		String oldOp = op;
		op = newOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.ATOMIC_EXPRESSION__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveLiteralExpCS getNum() {
		return num;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNum(PrimitiveLiteralExpCS newNum, NotificationChain msgs) {
		PrimitiveLiteralExpCS oldNum = num;
		num = newNum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.ATOMIC_EXPRESSION__NUM, oldNum, newNum);
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
	public void setNum(PrimitiveLiteralExpCS newNum) {
		if (newNum != num) {
			NotificationChain msgs = null;
			if (num != null)
				msgs = ((InternalEObject) num).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.ATOMIC_EXPRESSION__NUM, null, msgs);
			if (newNum != null)
				msgs = ((InternalEObject) newNum).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.ATOMIC_EXPRESSION__NUM, null, msgs);
			msgs = basicSetNum(newNum, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.ATOMIC_EXPRESSION__NUM, newNum,
					newNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicExpression getExp() {
		return exp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExp(AtomicExpression newExp, NotificationChain msgs) {
		AtomicExpression oldExp = exp;
		exp = newExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.ATOMIC_EXPRESSION__EXP, oldExp, newExp);
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
	public void setExp(AtomicExpression newExp) {
		if (newExp != exp) {
			NotificationChain msgs = null;
			if (exp != null)
				msgs = ((InternalEObject) exp).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.ATOMIC_EXPRESSION__EXP, null, msgs);
			if (newExp != null)
				msgs = ((InternalEObject) newExp).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.ATOMIC_EXPRESSION__EXP, null, msgs);
			msgs = basicSetExp(newExp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.ATOMIC_EXPRESSION__EXP, newExp,
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
		case OriginreqPackage.ATOMIC_EXPRESSION__LEFTSIDE:
			return basicSetLeftside(null, msgs);
		case OriginreqPackage.ATOMIC_EXPRESSION__RIGHTSIDE:
			return basicSetRightside(null, msgs);
		case OriginreqPackage.ATOMIC_EXPRESSION__NUM:
			return basicSetNum(null, msgs);
		case OriginreqPackage.ATOMIC_EXPRESSION__EXP:
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
		case OriginreqPackage.ATOMIC_EXPRESSION__LEFTSIDE:
			return getLeftside();
		case OriginreqPackage.ATOMIC_EXPRESSION__INFIXOP:
			return getInfixop();
		case OriginreqPackage.ATOMIC_EXPRESSION__RIGHTSIDE:
			return getRightside();
		case OriginreqPackage.ATOMIC_EXPRESSION__OP:
			return getOp();
		case OriginreqPackage.ATOMIC_EXPRESSION__NUM:
			return getNum();
		case OriginreqPackage.ATOMIC_EXPRESSION__EXP:
			return getExp();
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
		case OriginreqPackage.ATOMIC_EXPRESSION__LEFTSIDE:
			setLeftside((LeftSubAtomicExpression) newValue);
			return;
		case OriginreqPackage.ATOMIC_EXPRESSION__INFIXOP:
			setInfixop((String) newValue);
			return;
		case OriginreqPackage.ATOMIC_EXPRESSION__RIGHTSIDE:
			setRightside((RightSubAtomicExpression) newValue);
			return;
		case OriginreqPackage.ATOMIC_EXPRESSION__OP:
			setOp((String) newValue);
			return;
		case OriginreqPackage.ATOMIC_EXPRESSION__NUM:
			setNum((PrimitiveLiteralExpCS) newValue);
			return;
		case OriginreqPackage.ATOMIC_EXPRESSION__EXP:
			setExp((AtomicExpression) newValue);
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
		case OriginreqPackage.ATOMIC_EXPRESSION__LEFTSIDE:
			setLeftside((LeftSubAtomicExpression) null);
			return;
		case OriginreqPackage.ATOMIC_EXPRESSION__INFIXOP:
			setInfixop(INFIXOP_EDEFAULT);
			return;
		case OriginreqPackage.ATOMIC_EXPRESSION__RIGHTSIDE:
			setRightside((RightSubAtomicExpression) null);
			return;
		case OriginreqPackage.ATOMIC_EXPRESSION__OP:
			setOp(OP_EDEFAULT);
			return;
		case OriginreqPackage.ATOMIC_EXPRESSION__NUM:
			setNum((PrimitiveLiteralExpCS) null);
			return;
		case OriginreqPackage.ATOMIC_EXPRESSION__EXP:
			setExp((AtomicExpression) null);
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
		case OriginreqPackage.ATOMIC_EXPRESSION__LEFTSIDE:
			return leftside != null;
		case OriginreqPackage.ATOMIC_EXPRESSION__INFIXOP:
			return INFIXOP_EDEFAULT == null ? infixop != null : !INFIXOP_EDEFAULT.equals(infixop);
		case OriginreqPackage.ATOMIC_EXPRESSION__RIGHTSIDE:
			return rightside != null;
		case OriginreqPackage.ATOMIC_EXPRESSION__OP:
			return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
		case OriginreqPackage.ATOMIC_EXPRESSION__NUM:
			return num != null;
		case OriginreqPackage.ATOMIC_EXPRESSION__EXP:
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
		result.append(" (infixop: ");
		result.append(infixop);
		result.append(", op: ");
		result.append(op);
		result.append(')');
		return result.toString();
	}

} //AtomicExpressionImpl
