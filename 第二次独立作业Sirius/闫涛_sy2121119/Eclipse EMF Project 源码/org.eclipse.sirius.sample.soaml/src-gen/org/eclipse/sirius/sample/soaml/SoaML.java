/**
 */
package org.eclipse.sirius.sample.soaml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Soa ML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.soaml.SoaML#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.SoaML#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.SoaML#getCollaboration <em>Collaboration</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.SoaML#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getSoaML()
 * @model
 * @generated
 */
public interface SoaML extends EObject {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.soaml.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getSoaML_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPort();

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.soaml.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getSoaML_Participant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Participant> getParticipant();

	/**
	 * Returns the value of the '<em><b>Collaboration</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.soaml.Collaboration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaboration</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getSoaML_Collaboration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Collaboration> getCollaboration();

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.soaml.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getSoaML_Capability()
	 * @model containment="true"
	 * @generated
	 */
	EList<Capability> getCapability();

} // SoaML
