/**
 */
package eARS.util;

import eARS.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eARS.EARSPackage
 * @generated
 */
public class EARSSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EARSPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EARSSwitch() {
		if (modelPackage == null) {
			modelPackage = EARSPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case EARSPackage.EARS: {
			EARS ears = (EARS) theEObject;
			T result = caseEARS(ears);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EARSPackage.UB: {
			UB ub = (UB) theEObject;
			T result = caseUB(ub);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EARSPackage.SYSTEM_NAME: {
			SystemName systemName = (SystemName) theEObject;
			T result = caseSystemName(systemName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EARSPackage.SYSTEM_RESPONSE: {
			SystemResponse systemResponse = (SystemResponse) theEObject;
			T result = caseSystemResponse(systemResponse);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EARSPackage.EV: {
			EV ev = (EV) theEObject;
			T result = caseEV(ev);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EARSPackage.OPTIONAL_PRECONDITIONS: {
			OptionalPreconditions optionalPreconditions = (OptionalPreconditions) theEObject;
			T result = caseOptionalPreconditions(optionalPreconditions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EARSPackage.UW: {
			UW uw = (UW) theEObject;
			T result = caseUW(uw);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EARSPackage.ST: {
			ST st = (ST) theEObject;
			T result = caseST(st);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EARSPackage.IN_ASPECIFIC_STATE: {
			InASpecificState inASpecificState = (InASpecificState) theEObject;
			T result = caseInASpecificState(inASpecificState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EARSPackage.OP: {
			OP op = (OP) theEObject;
			T result = caseOP(op);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EARSPackage.FEATURE_IS_INCLUDED: {
			FeatureIsIncluded featureIsIncluded = (FeatureIsIncluded) theEObject;
			T result = caseFeatureIsIncluded(featureIsIncluded);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EARSPackage.HY: {
			HY hy = (HY) theEObject;
			T result = caseHY(hy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EARS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EARS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEARS(EARS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUB(UB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemName(SystemName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemResponse(SystemResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEV(EV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optional Preconditions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optional Preconditions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionalPreconditions(OptionalPreconditions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ST</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ST</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseST(ST object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In ASpecific State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In ASpecific State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInASpecificState(InASpecificState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UW</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UW</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUW(UW object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOP(OP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Is Included</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Is Included</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureIsIncluded(FeatureIsIncluded object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHY(HY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EARSSwitch
