/**
 */
package org.eclipse.sirius.sample.soaml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.soaml.Agent#getCollaboration <em>Collaboration</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends Participant {
	/**
	 * Returns the value of the '<em><b>Collaboration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaboration</em>' reference.
	 * @see #setCollaboration(Collaboration)
	 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getAgent_Collaboration()
	 * @model
	 * @generated
	 */
	Collaboration getCollaboration();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.soaml.Agent#getCollaboration <em>Collaboration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collaboration</em>' reference.
	 * @see #getCollaboration()
	 * @generated
	 */
	void setCollaboration(Collaboration value);

} // Agent
