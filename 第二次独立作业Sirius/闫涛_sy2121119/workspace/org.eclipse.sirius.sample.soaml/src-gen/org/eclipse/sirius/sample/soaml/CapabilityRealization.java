/**
 */
package org.eclipse.sirius.sample.soaml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.soaml.CapabilityRealization#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getCapabilityRealization()
 * @model
 * @generated
 */
public interface CapabilityRealization extends EObject {
	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' reference.
	 * @see #setCapability(Capability)
	 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getCapabilityRealization_Capability()
	 * @model
	 * @generated
	 */
	Capability getCapability();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.soaml.CapabilityRealization#getCapability <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(Capability value);

} // CapabilityRealization
