/**
 */
package originreq.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import originreq.JoinExp;
import originreq.JoinNode;
import originreq.OriginreqPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link originreq.impl.JoinNodeImpl#getEndlinks <em>Endlinks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoinNodeImpl extends WorkflowExpImpl implements JoinNode {
	/**
	 * The cached value of the '{@link #getEndlinks() <em>Endlinks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndlinks()
	 * @generated
	 * @ordered
	 */
	protected EList<JoinExp> endlinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OriginreqPackage.Literals.JOIN_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JoinExp> getEndlinks() {
		if (endlinks == null) {
			endlinks = new EObjectResolvingEList<JoinExp>(JoinExp.class, this, OriginreqPackage.JOIN_NODE__ENDLINKS);
		}
		return endlinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OriginreqPackage.JOIN_NODE__ENDLINKS:
			return getEndlinks();
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
		case OriginreqPackage.JOIN_NODE__ENDLINKS:
			getEndlinks().clear();
			getEndlinks().addAll((Collection<? extends JoinExp>) newValue);
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
		case OriginreqPackage.JOIN_NODE__ENDLINKS:
			getEndlinks().clear();
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
		case OriginreqPackage.JOIN_NODE__ENDLINKS:
			return endlinks != null && !endlinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JoinNodeImpl
