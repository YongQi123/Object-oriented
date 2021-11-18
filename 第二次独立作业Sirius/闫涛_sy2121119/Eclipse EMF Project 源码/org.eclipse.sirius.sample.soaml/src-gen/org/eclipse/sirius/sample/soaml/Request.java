/**
 */
package org.eclipse.sirius.sample.soaml;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.eclipse.sirius.sample.soaml.Request#getServiceinterface <em>Serviceinterface</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getRequest()
 * @model
 * @generated
 */
public interface Request extends EObject {
	/**
	 * Returns the value of the '<em><b>Serviceinterface</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.soaml.ServiceInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviceinterface</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.soaml.SoamlPackage#getRequest_Serviceinterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceInterface> getServiceinterface();

} // Request
