/**
 */
package eARS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optional Features</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eARS.OptionalFeatures#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @see eARS.EARSPackage#getOptionalFeatures()
 * @model
 * @generated
 */
public interface OptionalFeatures extends Ubiquitous {
	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(FeatureIs)
	 * @see eARS.EARSPackage#getOptionalFeatures_Where()
	 * @model containment="true"
	 * @generated
	 */
	FeatureIs getWhere();

	/**
	 * Sets the value of the '{@link eARS.OptionalFeatures#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(FeatureIs value);

} // OptionalFeatures
