/**
 */
package org.eclipse.sirius.sample.soaml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.soaml.Collaboration#getServicecontract <em>Servicecontract</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.Collaboration#getServicearchitecture <em>Servicearchitecture</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getCollaboration()
 * @model
 * @generated
 */
public interface Collaboration extends EObject {
	/**
	 * Returns the value of the '<em><b>Servicecontract</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.soaml.ServiceContract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicecontract</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getCollaboration_Servicecontract()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceContract> getServicecontract();

	/**
	 * Returns the value of the '<em><b>Servicearchitecture</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.soaml.ServiceArchitecture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicearchitecture</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getCollaboration_Servicearchitecture()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceArchitecture> getServicearchitecture();

} // Collaboration
