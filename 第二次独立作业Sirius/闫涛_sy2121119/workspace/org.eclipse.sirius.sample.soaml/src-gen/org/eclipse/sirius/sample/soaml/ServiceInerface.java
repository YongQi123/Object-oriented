/**
 */
package org.eclipse.sirius.sample.soaml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Inerface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.soaml.ServiceInerface#getCapabilityexposure <em>Capabilityexposure</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getServiceInerface()
 * @model
 * @generated
 */
public interface ServiceInerface extends EObject {
	/**
	 * Returns the value of the '<em><b>Capabilityexposure</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.soaml.CapabilityExposure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilityexposure</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getServiceInerface_Capabilityexposure()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityExposure> getCapabilityexposure();

} // ServiceInerface
