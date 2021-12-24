/**
 */
package originreq.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import originreq.LogicFormulaExpCS;
import originreq.OriginreqPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logic Formula Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link originreq.impl.LogicFormulaExpCSImpl#getAtomicexp <em>Atomicexp</em>}</li>
 *   <li>{@link originreq.impl.LogicFormulaExpCSImpl#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicFormulaExpCSImpl extends OCLExpressionCSImpl implements LogicFormulaExpCS {
	/**
	 * The cached value of the '{@link #getAtomicexp() <em>Atomicexp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtomicexp()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> atomicexp;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<String> connector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicFormulaExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OriginreqPackage.Literals.LOGIC_FORMULA_EXP_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAtomicexp() {
		if (atomicexp == null) {
			atomicexp = new EObjectContainmentEList<EObject>(EObject.class, this,
					OriginreqPackage.LOGIC_FORMULA_EXP_CS__ATOMICEXP);
		}
		return atomicexp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConnector() {
		if (connector == null) {
			connector = new EDataTypeEList<String>(String.class, this,
					OriginreqPackage.LOGIC_FORMULA_EXP_CS__CONNECTOR);
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OriginreqPackage.LOGIC_FORMULA_EXP_CS__ATOMICEXP:
			return ((InternalEList<?>) getAtomicexp()).basicRemove(otherEnd, msgs);
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
		case OriginreqPackage.LOGIC_FORMULA_EXP_CS__ATOMICEXP:
			return getAtomicexp();
		case OriginreqPackage.LOGIC_FORMULA_EXP_CS__CONNECTOR:
			return getConnector();
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
		case OriginreqPackage.LOGIC_FORMULA_EXP_CS__ATOMICEXP:
			getAtomicexp().clear();
			getAtomicexp().addAll((Collection<? extends EObject>) newValue);
			return;
		case OriginreqPackage.LOGIC_FORMULA_EXP_CS__CONNECTOR:
			getConnector().clear();
			getConnector().addAll((Collection<? extends String>) newValue);
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
		case OriginreqPackage.LOGIC_FORMULA_EXP_CS__ATOMICEXP:
			getAtomicexp().clear();
			return;
		case OriginreqPackage.LOGIC_FORMULA_EXP_CS__CONNECTOR:
			getConnector().clear();
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
		case OriginreqPackage.LOGIC_FORMULA_EXP_CS__ATOMICEXP:
			return atomicexp != null && !atomicexp.isEmpty();
		case OriginreqPackage.LOGIC_FORMULA_EXP_CS__CONNECTOR:
			return connector != null && !connector.isEmpty();
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
		result.append(" (connector: ");
		result.append(connector);
		result.append(')');
		return result.toString();
	}

} //LogicFormulaExpCSImpl
