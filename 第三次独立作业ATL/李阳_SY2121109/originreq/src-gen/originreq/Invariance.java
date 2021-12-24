/**
 */
package originreq;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invariance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link originreq.Invariance#getName <em>Name</em>}</li>
 *   <li>{@link originreq.Invariance#getOcl <em>Ocl</em>}</li>
 *   <li>{@link originreq.Invariance#isIsForAssociation <em>Is For Association</em>}</li>
 * </ul>
 *
 * @see originreq.OriginreqPackage#getInvariance()
 * @model
 * @generated
 */
public interface Invariance extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see originreq.OriginreqPackage#getInvariance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link originreq.Invariance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ocl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ocl</em>' containment reference.
	 * @see #setOcl(OCLExpressionCS)
	 * @see originreq.OriginreqPackage#getInvariance_Ocl()
	 * @model containment="true"
	 * @generated
	 */
	OCLExpressionCS getOcl();

	/**
	 * Sets the value of the '{@link originreq.Invariance#getOcl <em>Ocl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ocl</em>' containment reference.
	 * @see #getOcl()
	 * @generated
	 */
	void setOcl(OCLExpressionCS value);

	/**
	 * Returns the value of the '<em><b>Is For Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is For Association</em>' attribute.
	 * @see #setIsForAssociation(boolean)
	 * @see originreq.OriginreqPackage#getInvariance_IsForAssociation()
	 * @model
	 * @generated
	 */
	boolean isIsForAssociation();

	/**
	 * Sets the value of the '{@link originreq.Invariance#isIsForAssociation <em>Is For Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is For Association</em>' attribute.
	 * @see #isIsForAssociation()
	 * @generated
	 */
	void setIsForAssociation(boolean value);

} // Invariance
