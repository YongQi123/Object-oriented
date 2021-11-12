/**
 */
package org.eclipse.sirius.sample.soaml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.soaml.Request#getServiceinerface <em>Serviceinerface</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.Request#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.soaml.Request#getServicechannel <em>Servicechannel</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getRequest()
 * @model
 * @generated
 */
public interface Request extends EObject {
	/**
	 * Returns the value of the '<em><b>Serviceinerface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviceinerface</em>' reference.
	 * @see #setServiceinerface(ServiceInerface)
	 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getRequest_Serviceinerface()
	 * @model
	 * @generated
	 */
	ServiceInerface getServiceinerface();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.soaml.Request#getServiceinerface <em>Serviceinerface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serviceinerface</em>' reference.
	 * @see #getServiceinerface()
	 * @generated
	 */
	void setServiceinerface(ServiceInerface value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getRequest_Port()
	 * @model
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.soaml.Request#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

	/**
	 * Returns the value of the '<em><b>Servicechannel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicechannel</em>' reference.
	 * @see #setServicechannel(ServiceChannel)
	 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getRequest_Servicechannel()
	 * @model
	 * @generated
	 */
	ServiceChannel getServicechannel();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.soaml.Request#getServicechannel <em>Servicechannel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicechannel</em>' reference.
	 * @see #getServicechannel()
	 * @generated
	 */
	void setServicechannel(ServiceChannel value);

} // Request
