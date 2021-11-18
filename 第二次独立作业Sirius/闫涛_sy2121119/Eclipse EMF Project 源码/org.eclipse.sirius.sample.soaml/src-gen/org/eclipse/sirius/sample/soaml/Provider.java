/**
 */
package org.eclipse.sirius.sample.soaml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.soaml.Provider#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.Provider#getService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.Provider#getServicecontract <em>Servicecontract</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getProvider()
 * @model
 * @generated
 */
public interface Provider extends EObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.soaml.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getProvider_Message()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getMessage();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.soaml.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getProvider_Service()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Servicecontract</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.soaml.ServiceContract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicecontract</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getProvider_Servicecontract()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceContract> getServicecontract();

} // Provider
