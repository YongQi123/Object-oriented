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
 *   <li>{@link org.eclipse.sirius.sample.soaml.Participant#getCapabilityrealization <em>Capabilityrealization</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.Participant#getConsumer <em>Consumer</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.Participant#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends EObject {
	/**
	 * Returns the value of the '<em><b>Capabilityrealization</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.soaml.CapabilityRealization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilityrealization</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getParticipant_Capabilityrealization()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityRealization> getCapabilityrealization();

	/**
	 * Returns the value of the '<em><b>Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer</em>' reference.
	 * @see #setConsumer(Consumer)
	 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getParticipant_Consumer()
	 * @model
	 * @generated
	 */
	Consumer getConsumer();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.soaml.Participant#getConsumer <em>Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer</em>' reference.
	 * @see #getConsumer()
	 * @generated
	 */
	void setConsumer(Consumer value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' reference.
	 * @see #setProvider(Provider)
	 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getParticipant_Provider()
	 * @model
	 * @generated
	 */
	Provider getProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.soaml.Participant#getProvider <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Provider value);

} // Participant
