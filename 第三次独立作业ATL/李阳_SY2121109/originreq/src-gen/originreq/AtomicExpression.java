/**
 */
package originreq;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link originreq.AtomicExpression#getLeftside <em>Leftside</em>}</li>
 *   <li>{@link originreq.AtomicExpression#getInfixop <em>Infixop</em>}</li>
 *   <li>{@link originreq.AtomicExpression#getRightside <em>Rightside</em>}</li>
 *   <li>{@link originreq.AtomicExpression#getOp <em>Op</em>}</li>
 *   <li>{@link originreq.AtomicExpression#getNum <em>Num</em>}</li>
 *   <li>{@link originreq.AtomicExpression#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see originreq.OriginreqPackage#getAtomicExpression()
 * @model
 * @generated
 */
public interface AtomicExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Leftside</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leftside</em>' containment reference.
	 * @see #setLeftside(LeftSubAtomicExpression)
	 * @see originreq.OriginreqPackage#getAtomicExpression_Leftside()
	 * @model containment="true"
	 * @generated
	 */
	LeftSubAtomicExpression getLeftside();

	/**
	 * Sets the value of the '{@link originreq.AtomicExpression#getLeftside <em>Leftside</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leftside</em>' containment reference.
	 * @see #getLeftside()
	 * @generated
	 */
	void setLeftside(LeftSubAtomicExpression value);

	/**
	 * Returns the value of the '<em><b>Infixop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infixop</em>' attribute.
	 * @see #setInfixop(String)
	 * @see originreq.OriginreqPackage#getAtomicExpression_Infixop()
	 * @model
	 * @generated
	 */
	String getInfixop();

	/**
	 * Sets the value of the '{@link originreq.AtomicExpression#getInfixop <em>Infixop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infixop</em>' attribute.
	 * @see #getInfixop()
	 * @generated
	 */
	void setInfixop(String value);

	/**
	 * Returns the value of the '<em><b>Rightside</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rightside</em>' containment reference.
	 * @see #setRightside(RightSubAtomicExpression)
	 * @see originreq.OriginreqPackage#getAtomicExpression_Rightside()
	 * @model containment="true"
	 * @generated
	 */
	RightSubAtomicExpression getRightside();

	/**
	 * Sets the value of the '{@link originreq.AtomicExpression#getRightside <em>Rightside</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rightside</em>' containment reference.
	 * @see #getRightside()
	 * @generated
	 */
	void setRightside(RightSubAtomicExpression value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see #setOp(String)
	 * @see originreq.OriginreqPackage#getAtomicExpression_Op()
	 * @model
	 * @generated
	 */
	String getOp();

	/**
	 * Sets the value of the '{@link originreq.AtomicExpression#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(String value);

	/**
	 * Returns the value of the '<em><b>Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num</em>' containment reference.
	 * @see #setNum(PrimitiveLiteralExpCS)
	 * @see originreq.OriginreqPackage#getAtomicExpression_Num()
	 * @model containment="true"
	 * @generated
	 */
	PrimitiveLiteralExpCS getNum();

	/**
	 * Sets the value of the '{@link originreq.AtomicExpression#getNum <em>Num</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num</em>' containment reference.
	 * @see #getNum()
	 * @generated
	 */
	void setNum(PrimitiveLiteralExpCS value);

	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(AtomicExpression)
	 * @see originreq.OriginreqPackage#getAtomicExpression_Exp()
	 * @model containment="true"
	 * @generated
	 */
	AtomicExpression getExp();

	/**
	 * Sets the value of the '{@link originreq.AtomicExpression#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(AtomicExpression value);

} // AtomicExpression
