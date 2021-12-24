/**
 */
package originreq;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see originreq.OriginreqPackage
 * @generated
 */
public interface OriginreqFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OriginreqFactory eINSTANCE = originreq.impl.OriginreqFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Requirement Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Model</em>'.
	 * @generated
	 */
	RequirementModel createRequirementModel();

	/**
	 * Returns a new object of class '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction</em>'.
	 * @generated
	 */
	Interaction createInteraction();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Call Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Message</em>'.
	 * @generated
	 */
	CallMessage createCallMessage();

	/**
	 * Returns a new object of class '<em>Return Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Message</em>'.
	 * @generated
	 */
	ReturnMessage createReturnMessage();

	/**
	 * Returns a new object of class '<em>Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution</em>'.
	 * @generated
	 */
	Execution createExecution();

	/**
	 * Returns a new object of class '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combined Fragment</em>'.
	 * @generated
	 */
	CombinedFragment createCombinedFragment();

	/**
	 * Returns a new object of class '<em>Operand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operand</em>'.
	 * @generated
	 */
	Operand createOperand();

	/**
	 * Returns a new object of class '<em>Abstract End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract End</em>'.
	 * @generated
	 */
	AbstractEnd createAbstractEnd();

	/**
	 * Returns a new object of class '<em>Mix End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mix End</em>'.
	 * @generated
	 */
	MixEnd createMixEnd();

	/**
	 * Returns a new object of class '<em>Mix Op And CF End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mix Op And CF End</em>'.
	 * @generated
	 */
	MixOpAndCFEnd createMixOpAndCFEnd();

	/**
	 * Returns a new object of class '<em>Message End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message End</em>'.
	 * @generated
	 */
	MessageEnd createMessageEnd();

	/**
	 * Returns a new object of class '<em>Multi End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi End</em>'.
	 * @generated
	 */
	MultiEnd createMultiEnd();

	/**
	 * Returns a new object of class '<em>Execution End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution End</em>'.
	 * @generated
	 */
	ExecutionEnd createExecutionEnd();

	/**
	 * Returns a new object of class '<em>Combined Fragment End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combined Fragment End</em>'.
	 * @generated
	 */
	CombinedFragmentEnd createCombinedFragmentEnd();

	/**
	 * Returns a new object of class '<em>Operand End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operand End</em>'.
	 * @generated
	 */
	OperandEnd createOperandEnd();

	/**
	 * Returns a new object of class '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Model</em>'.
	 * @generated
	 */
	DomainModel createDomainModel();

	/**
	 * Returns a new object of class '<em>Use Case Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Case Model</em>'.
	 * @generated
	 */
	UseCaseModel createUseCaseModel();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>UC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UC</em>'.
	 * @generated
	 */
	UC createUC();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participant</em>'.
	 * @generated
	 */
	Participant createParticipant();

	/**
	 * Returns a new object of class '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow</em>'.
	 * @generated
	 */
	Workflow createWorkflow();

	/**
	 * Returns a new object of class '<em>Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partition</em>'.
	 * @generated
	 */
	Partition createPartition();

	/**
	 * Returns a new object of class '<em>Workflow Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Exp</em>'.
	 * @generated
	 */
	WorkflowExp createWorkflowExp();

	/**
	 * Returns a new object of class '<em>Partition Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partition Action</em>'.
	 * @generated
	 */
	PartitionAction createPartitionAction();

	/**
	 * Returns a new object of class '<em>Join Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Exp</em>'.
	 * @generated
	 */
	JoinExp createJoinExp();

	/**
	 * Returns a new object of class '<em>Activity Final</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Final</em>'.
	 * @generated
	 */
	ActivityFinal createActivityFinal();

	/**
	 * Returns a new object of class '<em>Inital Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inital Node</em>'.
	 * @generated
	 */
	InitalNode createInitalNode();

	/**
	 * Returns a new object of class '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fork Node</em>'.
	 * @generated
	 */
	ForkNode createForkNode();

	/**
	 * Returns a new object of class '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Node</em>'.
	 * @generated
	 */
	JoinNode createJoinNode();

	/**
	 * Returns a new object of class '<em>Complex Opeartion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Opeartion</em>'.
	 * @generated
	 */
	ComplexOpeartion createComplexOpeartion();

	/**
	 * Returns a new object of class '<em>Simple Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Operation</em>'.
	 * @generated
	 */
	SimpleOperation createSimpleOperation();

	/**
	 * Returns a new object of class '<em>Loop Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop Exp</em>'.
	 * @generated
	 */
	LoopExp createLoopExp();

	/**
	 * Returns a new object of class '<em>Switch Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Exp</em>'.
	 * @generated
	 */
	SwitchExp createSwitchExp();

	/**
	 * Returns a new object of class '<em>Switch Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Case</em>'.
	 * @generated
	 */
	SwitchCase createSwitchCase();

	/**
	 * Returns a new object of class '<em>Switch Default</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Default</em>'.
	 * @generated
	 */
	SwitchDefault createSwitchDefault();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

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
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns a new object of class '<em>Type CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type CS</em>'.
	 * @generated
	 */
	TypeCS createTypeCS();

	/**
	 * Returns a new object of class '<em>Invariance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invariance</em>'.
	 * @generated
	 */
	Invariance createInvariance();

	/**
	 * Returns a new object of class '<em>Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Type</em>'.
	 * @generated
	 */
	EntityType createEntityType();

	/**
	 * Returns a new object of class '<em>Enum Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Entity</em>'.
	 * @generated
	 */
	EnumEntity createEnumEntity();

	/**
	 * Returns a new object of class '<em>Enum Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Item</em>'.
	 * @generated
	 */
	EnumItem createEnumItem();

	/**
	 * Returns a new object of class '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract</em>'.
	 * @generated
	 */
	Contract createContract();

	/**
	 * Returns a new object of class '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition</em>'.
	 * @generated
	 */
	Definition createDefinition();

	/**
	 * Returns a new object of class '<em>Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precondition</em>'.
	 * @generated
	 */
	Precondition createPrecondition();

	/**
	 * Returns a new object of class '<em>Postcondition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postcondition</em>'.
	 * @generated
	 */
	Postcondition createPostcondition();

	/**
	 * Returns a new object of class '<em>OCL Expression CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Expression CS</em>'.
	 * @generated
	 */
	OCLExpressionCS createOCLExpressionCS();

	/**
	 * Returns a new object of class '<em>Nested Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Exp CS</em>'.
	 * @generated
	 */
	NestedExpCS createNestedExpCS();

	/**
	 * Returns a new object of class '<em>Logic Formula Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logic Formula Exp CS</em>'.
	 * @generated
	 */
	LogicFormulaExpCS createLogicFormulaExpCS();

	/**
	 * Returns a new object of class '<em>Atomic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Expression</em>'.
	 * @generated
	 */
	AtomicExpression createAtomicExpression();

	/**
	 * Returns a new object of class '<em>Left Sub Atomic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Left Sub Atomic Expression</em>'.
	 * @generated
	 */
	LeftSubAtomicExpression createLeftSubAtomicExpression();

	/**
	 * Returns a new object of class '<em>Right Sub Atomic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Sub Atomic Expression</em>'.
	 * @generated
	 */
	RightSubAtomicExpression createRightSubAtomicExpression();

	/**
	 * Returns a new object of class '<em>Call Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Exp CS</em>'.
	 * @generated
	 */
	CallExpCS createCallExpCS();

	/**
	 * Returns a new object of class '<em>Loop Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop Exp CS</em>'.
	 * @generated
	 */
	LoopExpCS createLoopExpCS();

	/**
	 * Returns a new object of class '<em>Iterator Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iterator Exp CS</em>'.
	 * @generated
	 */
	IteratorExpCS createIteratorExpCS();

	/**
	 * Returns a new object of class '<em>Entity Attribute Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Attribute Name</em>'.
	 * @generated
	 */
	EntityAttributeName createEntityAttributeName();

	/**
	 * Returns a new object of class '<em>Arguments CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arguments CS</em>'.
	 * @generated
	 */
	ArgumentsCS createArgumentsCS();

	/**
	 * Returns a new object of class '<em>Feature Call Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Call Exp CS</em>'.
	 * @generated
	 */
	FeatureCallExpCS createFeatureCallExpCS();

	/**
	 * Returns a new object of class '<em>Standard Navigation Call Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Navigation Call Exp CS</em>'.
	 * @generated
	 */
	StandardNavigationCallExpCS createStandardNavigationCallExpCS();

	/**
	 * Returns a new object of class '<em>Standard Operation Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Operation Exp CS</em>'.
	 * @generated
	 */
	StandardOperationExpCS createStandardOperationExpCS();

	/**
	 * Returns a new object of class '<em>Predefine Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predefine Op</em>'.
	 * @generated
	 */
	PredefineOp createPredefineOp();

	/**
	 * Returns a new object of class '<em>Standard None Parameter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard None Parameter Operation</em>'.
	 * @generated
	 */
	StandardNoneParameterOperation createStandardNoneParameterOperation();

	/**
	 * Returns a new object of class '<em>Standard Parameter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Parameter Operation</em>'.
	 * @generated
	 */
	StandardParameterOperation createStandardParameterOperation();

	/**
	 * Returns a new object of class '<em>Standard Collection Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Collection Operation</em>'.
	 * @generated
	 */
	StandardCollectionOperation createStandardCollectionOperation();

	/**
	 * Returns a new object of class '<em>Standard Date Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Date Operation</em>'.
	 * @generated
	 */
	StandardDateOperation createStandardDateOperation();

	/**
	 * Returns a new object of class '<em>Classifer Call Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classifer Call Exp CS</em>'.
	 * @generated
	 */
	ClassiferCallExpCS createClassiferCallExpCS();

	/**
	 * Returns a new object of class '<em>Property Call Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Call Exp CS</em>'.
	 * @generated
	 */
	PropertyCallExpCS createPropertyCallExpCS();

	/**
	 * Returns a new object of class '<em>Operation Call Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Call Exp CS</em>'.
	 * @generated
	 */
	OperationCallExpCS createOperationCallExpCS();

	/**
	 * Returns a new object of class '<em>Operation Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Parameters</em>'.
	 * @generated
	 */
	OperationParameters createOperationParameters();

	/**
	 * Returns a new object of class '<em>Variable Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Exp CS</em>'.
	 * @generated
	 */
	VariableExpCS createVariableExpCS();

	/**
	 * Returns a new object of class '<em>If Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Exp CS</em>'.
	 * @generated
	 */
	IfExpCS createIfExpCS();

	/**
	 * Returns a new object of class '<em>Let Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Let Exp CS</em>'.
	 * @generated
	 */
	LetExpCS createLetExpCS();

	/**
	 * Returns a new object of class '<em>Variable Declaration CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Declaration CS</em>'.
	 * @generated
	 */
	VariableDeclarationCS createVariableDeclarationCS();

	/**
	 * Returns a new object of class '<em>Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Exp CS</em>'.
	 * @generated
	 */
	LiteralExpCS createLiteralExpCS();

	/**
	 * Returns a new object of class '<em>Enum Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Literal Exp CS</em>'.
	 * @generated
	 */
	EnumLiteralExpCS createEnumLiteralExpCS();

	/**
	 * Returns a new object of class '<em>Tuple Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuple Literal Exp CS</em>'.
	 * @generated
	 */
	TupleLiteralExpCS createTupleLiteralExpCS();

	/**
	 * Returns a new object of class '<em>Tuple Type CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuple Type CS</em>'.
	 * @generated
	 */
	TupleTypeCS createTupleTypeCS();

	/**
	 * Returns a new object of class '<em>Collection Type CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Type CS</em>'.
	 * @generated
	 */
	CollectionTypeCS createCollectionTypeCS();

	/**
	 * Returns a new object of class '<em>Collection Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Literal Exp CS</em>'.
	 * @generated
	 */
	CollectionLiteralExpCS createCollectionLiteralExpCS();

	/**
	 * Returns a new object of class '<em>Collection Literal Part CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Literal Part CS</em>'.
	 * @generated
	 */
	CollectionLiteralPartCS createCollectionLiteralPartCS();

	/**
	 * Returns a new object of class '<em>Collection Range CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Range CS</em>'.
	 * @generated
	 */
	CollectionRangeCS createCollectionRangeCS();

	/**
	 * Returns a new object of class '<em>Collection Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Item</em>'.
	 * @generated
	 */
	CollectionItem createCollectionItem();

	/**
	 * Returns a new object of class '<em>Primitive Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Literal Exp CS</em>'.
	 * @generated
	 */
	PrimitiveLiteralExpCS createPrimitiveLiteralExpCS();

	/**
	 * Returns a new object of class '<em>Number Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Literal Exp CS</em>'.
	 * @generated
	 */
	NumberLiteralExpCS createNumberLiteralExpCS();

	/**
	 * Returns a new object of class '<em>Boolean Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal Exp CS</em>'.
	 * @generated
	 */
	BooleanLiteralExpCS createBooleanLiteralExpCS();

	/**
	 * Returns a new object of class '<em>String Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal Exp CS</em>'.
	 * @generated
	 */
	StringLiteralExpCS createStringLiteralExpCS();

	/**
	 * Returns a new object of class '<em>Null Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Literal Exp CS</em>'.
	 * @generated
	 */
	NullLiteralExpCS createNullLiteralExpCS();

	/**
	 * Returns a new object of class '<em>Invalid Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invalid Literal Exp CS</em>'.
	 * @generated
	 */
	InvalidLiteralExpCS createInvalidLiteralExpCS();

	/**
	 * Returns a new object of class '<em>Reserved Keyword CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reserved Keyword CS</em>'.
	 * @generated
	 */
	ReservedKeywordCS createReservedKeywordCS();

	/**
	 * Returns a new object of class '<em>Collection Type Identifier CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Type Identifier CS</em>'.
	 * @generated
	 */
	CollectionTypeIdentifierCS createCollectionTypeIdentifierCS();

	/**
	 * Returns a new object of class '<em>Primitive Type CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type CS</em>'.
	 * @generated
	 */
	PrimitiveTypeCS createPrimitiveTypeCS();

	/**
	 * Returns a new object of class '<em>Ocl Type CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ocl Type CS</em>'.
	 * @generated
	 */
	OclTypeCS createOclTypeCS();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OriginreqPackage getOriginreqPackage();

} //OriginreqFactory
