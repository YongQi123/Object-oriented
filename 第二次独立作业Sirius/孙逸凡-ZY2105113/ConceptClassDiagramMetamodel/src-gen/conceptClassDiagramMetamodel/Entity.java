/**
 */
package conceptClassDiagramMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conceptClassDiagramMetamodel.Entity#isIsCRUD <em>Is CRUD</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.Entity#getName <em>Name</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.Entity#getDescription <em>Description</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.Entity#getSuperentity <em>Superentity</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.Entity#getEntity <em>Entity</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.Entity#getEntityOpposite <em>Entity Opposite</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.Entity#getComposition <em>Composition</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.Entity#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.Entity#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.Entity#getInvariance <em>Invariance</em>}</li>
 *   <li>{@link conceptClassDiagramMetamodel.Entity#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Is CRUD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is CRUD</em>' attribute.
	 * @see #setIsCRUD(boolean)
	 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getEntity_IsCRUD()
	 * @model
	 * @generated
	 */
	boolean isIsCRUD();

	/**
	 * Sets the value of the '{@link conceptClassDiagramMetamodel.Entity#isIsCRUD <em>Is CRUD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is CRUD</em>' attribute.
	 * @see #isIsCRUD()
	 * @generated
	 */
	void setIsCRUD(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conceptClassDiagramMetamodel.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getEntity_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link conceptClassDiagramMetamodel.Entity#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Superentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superentity</em>' reference.
	 * @see #setSuperentity(Entity)
	 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getEntity_Superentity()
	 * @model
	 * @generated
	 */
	Entity getSuperentity();

	/**
	 * Sets the value of the '{@link conceptClassDiagramMetamodel.Entity#getSuperentity <em>Superentity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superentity</em>' reference.
	 * @see #getSuperentity()
	 * @generated
	 */
	void setSuperentity(Entity value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conceptClassDiagramMetamodel.Entity#getEntityOpposite <em>Entity Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getEntity_Entity()
	 * @see conceptClassDiagramMetamodel.Entity#getEntityOpposite
	 * @model opposite="entityOpposite"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link conceptClassDiagramMetamodel.Entity#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Entity Opposite</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conceptClassDiagramMetamodel.Entity#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Opposite</em>' reference.
	 * @see #setEntityOpposite(Entity)
	 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getEntity_EntityOpposite()
	 * @see conceptClassDiagramMetamodel.Entity#getEntity
	 * @model opposite="entity"
	 * @generated
	 */
	Entity getEntityOpposite();

	/**
	 * Sets the value of the '{@link conceptClassDiagramMetamodel.Entity#getEntityOpposite <em>Entity Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Opposite</em>' reference.
	 * @see #getEntityOpposite()
	 * @generated
	 */
	void setEntityOpposite(Entity value);

	/**
	 * Returns the value of the '<em><b>Composition</b></em>' reference list.
	 * The list contents are of type {@link conceptClassDiagramMetamodel.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' reference list.
	 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getEntity_Composition()
	 * @model
	 * @generated
	 */
	EList<Entity> getComposition();

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' reference list.
	 * The list contents are of type {@link conceptClassDiagramMetamodel.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation</em>' reference list.
	 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getEntity_Aggregation()
	 * @model
	 * @generated
	 */
	EList<Entity> getAggregation();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link conceptClassDiagramMetamodel.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getEntity_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Invariance</b></em>' containment reference list.
	 * The list contents are of type {@link conceptClassDiagramMetamodel.Invariance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariance</em>' containment reference list.
	 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getEntity_Invariance()
	 * @model containment="true"
	 * @generated
	 */
	EList<Invariance> getInvariance();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference list.
	 * The list contents are of type {@link conceptClassDiagramMetamodel.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference list.
	 * @see conceptClassDiagramMetamodel.ConceptClassDiagramMetamodelPackage#getEntity_Reference()
	 * @model
	 * @generated
	 */
	EList<Entity> getReference();

} // Entity
