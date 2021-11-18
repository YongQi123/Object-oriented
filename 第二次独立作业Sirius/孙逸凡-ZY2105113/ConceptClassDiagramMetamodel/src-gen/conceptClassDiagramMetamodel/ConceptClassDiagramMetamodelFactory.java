/**
 */
package conceptClassDiagramMetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage
 * @generated
 */
public interface ConceptClassDiagramMetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConceptClassDiagramMetamodelFactory eINSTANCE = conceptClassDiagramMetamodel.impl.ConceptClassDiagramMetamodelFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Requirement Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Model</em>'.
	 * @generated
	 */
	RequirementModel createRequirementModel();

	/**
	 * Returns a new object of class '<em>usecasemodel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>usecasemodel</em>'.
	 * @generated
	 */
	usecasemodel createusecasemodel();

	/**
	 * Returns a new object of class '<em>workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>workflow</em>'.
	 * @generated
	 */
	workflow createworkflow();

	/**
	 * Returns a new object of class '<em>ssd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ssd</em>'.
	 * @generated
	 */
	ssd createssd();

	/**
	 * Returns a new object of class '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Model</em>'.
	 * @generated
	 */
	DomainModel createDomainModel();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Invariance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invariance</em>'.
	 * @generated
	 */
	Invariance createInvariance();

	/**
	 * Returns a new object of class '<em>type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>type</em>'.
	 * @generated
	 */
	type createtype();

	/**
	 * Returns a new object of class '<em>ocl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ocl</em>'.
	 * @generated
	 */
	ocl createocl();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConceptClassDiagramMetamodelPackage getConceptClassDiagramMetamodelPackage();

} //ConceptClassDiagramMetamodelFactory
