/**
 */
package conceptClassDiagramMetamodel;

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
 *   <li>{@link conceptClassDiagramMetamodel.Invariance#getName <em>Name</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.Invariance#isIsForAssociation <em>Is For Association</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.Invariance#getOcl <em>Ocl</em>}</li>
 * </ul>
 *
 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getInvariance()
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
	 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getInvariance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conceptClassDiagramMetamodel.Invariance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is For Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is For Association</em>' attribute.
	 * @see #setIsForAssociation(boolean)
	 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getInvariance_IsForAssociation()
	 * @model
	 * @generated
	 */
	boolean isIsForAssociation();

	/**
	 * Sets the value of the '{@link conceptClassDiagramMetamodel.Invariance#isIsForAssociation <em>Is For Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is For Association</em>' attribute.
	 * @see #isIsForAssociation()
	 * @generated
	 */
	void setIsForAssociation(boolean value);

	/**
	 * Returns the value of the '<em><b>Ocl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ocl</em>' reference.
	 * @see #setOcl(ocl)
	 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getInvariance_Ocl()
	 * @model
	 * @generated
	 */
	ocl getOcl();

	/**
	 * Sets the value of the '{@link conceptClassDiagramMetamodel.Invariance#getOcl <em>Ocl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ocl</em>' reference.
	 * @see #getOcl()
	 * @generated
	 */
	void setOcl(ocl value);

} // Invariance
