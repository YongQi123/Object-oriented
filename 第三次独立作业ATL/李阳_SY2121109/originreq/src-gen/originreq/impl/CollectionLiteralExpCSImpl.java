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

import originreq.CollectionLiteralExpCS;
import originreq.CollectionLiteralPartCS;
import originreq.CollectionTypeIdentifierCS;
import originreq.OriginreqPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Literal Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link originreq.impl.CollectionLiteralExpCSImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link originreq.impl.CollectionLiteralExpCSImpl#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionLiteralExpCSImpl extends LiteralExpCSImpl implements CollectionLiteralExpCS {
	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected CollectionTypeIdentifierCS kind;

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected EList<CollectionLiteralPartCS> part;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionLiteralExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OriginreqPackage.Literals.COLLECTION_LITERAL_EXP_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionTypeIdentifierCS getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKind(CollectionTypeIdentifierCS newKind, NotificationChain msgs) {
		CollectionTypeIdentifierCS oldKind = kind;
		kind = newKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OriginreqPackage.COLLECTION_LITERAL_EXP_CS__KIND, oldKind, newKind);
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
	public void setKind(CollectionTypeIdentifierCS newKind) {
		if (newKind != kind) {
			NotificationChain msgs = null;
			if (kind != null)
				msgs = ((InternalEObject) kind).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.COLLECTION_LITERAL_EXP_CS__KIND, null, msgs);
			if (newKind != null)
				msgs = ((InternalEObject) newKind).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OriginreqPackage.COLLECTION_LITERAL_EXP_CS__KIND, null, msgs);
			msgs = basicSetKind(newKind, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OriginreqPackage.COLLECTION_LITERAL_EXP_CS__KIND,
					newKind, newKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollectionLiteralPartCS> getPart() {
		if (part == null) {
			part = new EObjectContainmentEList<CollectionLiteralPartCS>(CollectionLiteralPartCS.class, this,
					OriginreqPackage.COLLECTION_LITERAL_EXP_CS__PART);
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OriginreqPackage.COLLECTION_LITERAL_EXP_CS__KIND:
			return basicSetKind(null, msgs);
		case OriginreqPackage.COLLECTION_LITERAL_EXP_CS__PART:
			return ((InternalEList<?>) getPart()).basicRemove(otherEnd, msgs);
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
		case OriginreqPackage.COLLECTION_LITERAL_EXP_CS__KIND:
			return getKind();
		case OriginreqPackage.COLLECTION_LITERAL_EXP_CS__PART:
			return getPart();
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
		case OriginreqPackage.COLLECTION_LITERAL_EXP_CS__KIND:
			setKind((CollectionTypeIdentifierCS) newValue);
			return;
		case OriginreqPackage.COLLECTION_LITERAL_EXP_CS__PART:
			getPart().clear();
			getPart().addAll((Collection<? extends CollectionLiteralPartCS>) newValue);
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
		case OriginreqPackage.COLLECTION_LITERAL_EXP_CS__KIND:
			setKind((CollectionTypeIdentifierCS) null);
			return;
		case OriginreqPackage.COLLECTION_LITERAL_EXP_CS__PART:
			getPart().clear();
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
		case OriginreqPackage.COLLECTION_LITERAL_EXP_CS__KIND:
			return kind != null;
		case OriginreqPackage.COLLECTION_LITERAL_EXP_CS__PART:
			return part != null && !part.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CollectionLiteralExpCSImpl
