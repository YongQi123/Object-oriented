/**
 */
package originreq.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import originreq.ForkNode;
import originreq.JoinExp;
import originreq.OriginreqPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fork Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link originreq.impl.ForkNodeImpl#getStartlinks <em>Startlinks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForkNodeImpl extends WorkflowExpImpl implements ForkNode {
	/**
	 * The cached value of the '{@link #getStartlinks() <em>Startlinks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartlinks()
	 * @generated
	 * @ordered
	 */
	protected EList<JoinExp> startlinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OriginreqPackage.Literals.FORK_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JoinExp> getStartlinks() {
		if (startlinks == null) {
			startlinks = new EObjectResolvingEList<JoinExp>(JoinExp.class, this,
					OriginreqPackage.FORK_NODE__STARTLINKS);
		}
		return startlinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OriginreqPackage.FORK_NODE__STARTLINKS:
			return getStartlinks();
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
		case OriginreqPackage.FORK_NODE__STARTLINKS:
			getStartlinks().clear();
			getStartlinks().addAll((Collection<? extends JoinExp>) newValue);
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
		case OriginreqPackage.FORK_NODE__STARTLINKS:
			getStartlinks().clear();
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
		case OriginreqPackage.FORK_NODE__STARTLINKS:
			return startlinks != null && !startlinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ForkNodeImpl
