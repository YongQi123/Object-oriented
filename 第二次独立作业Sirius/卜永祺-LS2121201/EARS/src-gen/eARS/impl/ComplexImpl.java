/**
 */
package eARS.impl;

import eARS.Complex;
import eARS.EARSPackage;
import eARS.FeatureIs;
import eARS.Preconditions;
import eARS.State;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eARS.impl.ComplexImpl#getIfthen <em>Ifthen</em>}</li>
 *   <li>{@link eARS.impl.ComplexImpl#getWhile <em>While</em>}</li>
 *   <li>{@link eARS.impl.ComplexImpl#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexImpl extends UbiquitousImpl implements Complex {
	/**
	 * The cached value of the '{@link #getIfthen() <em>Ifthen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfthen()
	 * @generated
	 * @ordered
	 */
	protected Preconditions ifthen;

	/**
	 * The cached value of the '{@link #getWhile() <em>While</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhile()
	 * @generated
	 * @ordered
	 */
	protected State while_;

	/**
	 * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected FeatureIs where;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EARSPackage.Literals.COMPLEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preconditions getIfthen() {
		return ifthen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfthen(Preconditions newIfthen, NotificationChain msgs) {
		Preconditions oldIfthen = ifthen;
		ifthen = newIfthen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EARSPackage.COMPLEX__IFTHEN,
					oldIfthen, newIfthen);
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
	public void setIfthen(Preconditions newIfthen) {
		if (newIfthen != ifthen) {
			NotificationChain msgs = null;
			if (ifthen != null)
				msgs = ((InternalEObject) ifthen).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EARSPackage.COMPLEX__IFTHEN, null, msgs);
			if (newIfthen != null)
				msgs = ((InternalEObject) newIfthen).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EARSPackage.COMPLEX__IFTHEN, null, msgs);
			msgs = basicSetIfthen(newIfthen, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.COMPLEX__IFTHEN, newIfthen, newIfthen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getWhile() {
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhile(State newWhile, NotificationChain msgs) {
		State oldWhile = while_;
		while_ = newWhile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EARSPackage.COMPLEX__WHILE,
					oldWhile, newWhile);
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
	public void setWhile(State newWhile) {
		if (newWhile != while_) {
			NotificationChain msgs = null;
			if (while_ != null)
				msgs = ((InternalEObject) while_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EARSPackage.COMPLEX__WHILE, null, msgs);
			if (newWhile != null)
				msgs = ((InternalEObject) newWhile).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EARSPackage.COMPLEX__WHILE, null, msgs);
			msgs = basicSetWhile(newWhile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.COMPLEX__WHILE, newWhile, newWhile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureIs getWhere() {
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhere(FeatureIs newWhere, NotificationChain msgs) {
		FeatureIs oldWhere = where;
		where = newWhere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EARSPackage.COMPLEX__WHERE,
					oldWhere, newWhere);
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
	public void setWhere(FeatureIs newWhere) {
		if (newWhere != where) {
			NotificationChain msgs = null;
			if (where != null)
				msgs = ((InternalEObject) where).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EARSPackage.COMPLEX__WHERE, null, msgs);
			if (newWhere != null)
				msgs = ((InternalEObject) newWhere).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EARSPackage.COMPLEX__WHERE, null, msgs);
			msgs = basicSetWhere(newWhere, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EARSPackage.COMPLEX__WHERE, newWhere, newWhere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EARSPackage.COMPLEX__IFTHEN:
			return basicSetIfthen(null, msgs);
		case EARSPackage.COMPLEX__WHILE:
			return basicSetWhile(null, msgs);
		case EARSPackage.COMPLEX__WHERE:
			return basicSetWhere(null, msgs);
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
		case EARSPackage.COMPLEX__IFTHEN:
			return getIfthen();
		case EARSPackage.COMPLEX__WHILE:
			return getWhile();
		case EARSPackage.COMPLEX__WHERE:
			return getWhere();
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
		case EARSPackage.COMPLEX__IFTHEN:
			setIfthen((Preconditions) newValue);
			return;
		case EARSPackage.COMPLEX__WHILE:
			setWhile((State) newValue);
			return;
		case EARSPackage.COMPLEX__WHERE:
			setWhere((FeatureIs) newValue);
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
		case EARSPackage.COMPLEX__IFTHEN:
			setIfthen((Preconditions) null);
			return;
		case EARSPackage.COMPLEX__WHILE:
			setWhile((State) null);
			return;
		case EARSPackage.COMPLEX__WHERE:
			setWhere((FeatureIs) null);
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
		case EARSPackage.COMPLEX__IFTHEN:
			return ifthen != null;
		case EARSPackage.COMPLEX__WHILE:
			return while_ != null;
		case EARSPackage.COMPLEX__WHERE:
			return where != null;
		}
		return super.eIsSet(featureID);
	}

} //ComplexImpl
