/**
 */
package org.eclipse.sirius.sample.soaml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.soaml.Participant#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.Participant#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.Participant#getConsumer <em>Consumer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends EObject {
	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.soaml.Provider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getParticipant_Provider()
	 * @model containment="true"
	 * @generated
	 */
	EList<Provider> getProvider();

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.soaml.Agent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getParticipant_Agent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agent> getAgent();

	/**
	 * Returns the value of the '<em><b>Consumer</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.soaml.Consumer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getParticipant_Consumer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Consumer> getConsumer();

} // Participant
