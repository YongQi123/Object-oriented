/**
 */
package eARS.util;

import eARS.Complex;
import eARS.EARS;
import eARS.EARSPackage;
import eARS.EventDriven;
import eARS.FeatureIs;
import eARS.OptionalFeatures;
import eARS.Preconditions;
import eARS.Response;
import eARS.State;
import eARS.StateDriven;
import eARS.Ubiquitous;
import eARS.UnwantedBehaviour;
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
		case EARSPackage.UBIQUITOUS: {
			Ubiquitous ubiquitous = (Ubiquitous) theEObject;
			T result = caseUbiquitous(ubiquitous);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EARSPackage.SYSTEM: {
			eARS.System system = (eARS.System) theEObject;
			T result = caseSystem(system);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EARSPackage.RESPONSE: {
			Response response = (Response) theEObject;
			T result = caseResponse(response);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EARSPackage.EVENT_DRIVEN: {
			EventDriven eventDriven = (EventDriven) theEObject;
			T result = caseEventDriven(eventDriven);
			if (result == null)
				result = caseUbiquitous(eventDriven);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EARSPackage.PRECONDITIONS: {
			Preconditions preconditions = (Preconditions) theEObject;
			T result = casePreconditions(preconditions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EARSPackage.UNWANTED_BEHAVIOUR: {
			UnwantedBehaviour unwantedBehaviour = (UnwantedBehaviour) theEObject;
			T result = caseUnwantedBehaviour(unwantedBehaviour);
			if (result == null)
				result = caseUbiquitous(unwantedBehaviour);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EARSPackage.STATE_DRIVEN: {
			StateDriven stateDriven = (StateDriven) theEObject;
			T result = caseStateDriven(stateDriven);
			if (result == null)
				result = caseUbiquitous(stateDriven);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EARSPackage.STATE: {
			State state = (State) theEObject;
			T result = caseState(state);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EARSPackage.OPTIONAL_FEATURES: {
			OptionalFeatures optionalFeatures = (OptionalFeatures) theEObject;
			T result = caseOptionalFeatures(optionalFeatures);
			if (result == null)
				result = caseUbiquitous(optionalFeatures);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EARSPackage.FEATURE_IS: {
			FeatureIs featureIs = (FeatureIs) theEObject;
			T result = caseFeatureIs(featureIs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EARSPackage.COMPLEX: {
			Complex complex = (Complex) theEObject;
			T result = caseComplex(complex);
			if (result == null)
				result = caseUbiquitous(complex);
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
	 * Returns the result of interpreting the object as an instance of '<em>Ubiquitous</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ubiquitous</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUbiquitous(Ubiquitous object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(eARS.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponse(Response object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Driven</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Driven</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventDriven(EventDriven object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preconditions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preconditions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreconditions(Preconditions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unwanted Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unwanted Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnwantedBehaviour(UnwantedBehaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Driven</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Driven</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateDriven(StateDriven object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optional Features</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optional Features</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionalFeatures(OptionalFeatures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Is</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Is</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureIs(FeatureIs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplex(Complex object) {
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
