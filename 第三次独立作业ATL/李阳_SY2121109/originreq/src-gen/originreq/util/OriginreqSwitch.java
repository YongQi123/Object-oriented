/**
 */
package originreq.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import originreq.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see originreq.OriginreqPackage
 * @generated
 */
public class OriginreqSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OriginreqPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OriginreqSwitch() {
		if (modelPackage == null) {
			modelPackage = OriginreqPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case OriginreqPackage.REQUIREMENT_MODEL: {
			RequirementModel requirementModel = (RequirementModel) theEObject;
			T result = caseRequirementModel(requirementModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.INTERACTION: {
			Interaction interaction = (Interaction) theEObject;
			T result = caseInteraction(interaction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.MESSAGE: {
			Message message = (Message) theEObject;
			T result = caseMessage(message);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.CALL_MESSAGE: {
			CallMessage callMessage = (CallMessage) theEObject;
			T result = caseCallMessage(callMessage);
			if (result == null)
				result = caseMessage(callMessage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.RETURN_MESSAGE: {
			ReturnMessage returnMessage = (ReturnMessage) theEObject;
			T result = caseReturnMessage(returnMessage);
			if (result == null)
				result = caseMessage(returnMessage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.EXECUTION: {
			Execution execution = (Execution) theEObject;
			T result = caseExecution(execution);
			if (result == null)
				result = caseMultiEnd(execution);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.COMBINED_FRAGMENT: {
			CombinedFragment combinedFragment = (CombinedFragment) theEObject;
			T result = caseCombinedFragment(combinedFragment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.OPERAND: {
			Operand operand = (Operand) theEObject;
			T result = caseOperand(operand);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.ABSTRACT_END: {
			AbstractEnd abstractEnd = (AbstractEnd) theEObject;
			T result = caseAbstractEnd(abstractEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.MIX_END: {
			MixEnd mixEnd = (MixEnd) theEObject;
			T result = caseMixEnd(mixEnd);
			if (result == null)
				result = caseAbstractEnd(mixEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.MIX_OP_AND_CF_END: {
			MixOpAndCFEnd mixOpAndCFEnd = (MixOpAndCFEnd) theEObject;
			T result = caseMixOpAndCFEnd(mixOpAndCFEnd);
			if (result == null)
				result = caseAbstractEnd(mixOpAndCFEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.MESSAGE_END: {
			MessageEnd messageEnd = (MessageEnd) theEObject;
			T result = caseMessageEnd(messageEnd);
			if (result == null)
				result = caseMixEnd(messageEnd);
			if (result == null)
				result = caseAbstractEnd(messageEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.MULTI_END: {
			MultiEnd multiEnd = (MultiEnd) theEObject;
			T result = caseMultiEnd(multiEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.EXECUTION_END: {
			ExecutionEnd executionEnd = (ExecutionEnd) theEObject;
			T result = caseExecutionEnd(executionEnd);
			if (result == null)
				result = caseMixEnd(executionEnd);
			if (result == null)
				result = caseAbstractEnd(executionEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.COMBINED_FRAGMENT_END: {
			CombinedFragmentEnd combinedFragmentEnd = (CombinedFragmentEnd) theEObject;
			T result = caseCombinedFragmentEnd(combinedFragmentEnd);
			if (result == null)
				result = caseMixOpAndCFEnd(combinedFragmentEnd);
			if (result == null)
				result = caseAbstractEnd(combinedFragmentEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.OPERAND_END: {
			OperandEnd operandEnd = (OperandEnd) theEObject;
			T result = caseOperandEnd(operandEnd);
			if (result == null)
				result = caseMixOpAndCFEnd(operandEnd);
			if (result == null)
				result = caseAbstractEnd(operandEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.DOMAIN_MODEL: {
			DomainModel domainModel = (DomainModel) theEObject;
			T result = caseDomainModel(domainModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.USE_CASE_MODEL: {
			UseCaseModel useCaseModel = (UseCaseModel) theEObject;
			T result = caseUseCaseModel(useCaseModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.ACTOR: {
			Actor actor = (Actor) theEObject;
			T result = caseActor(actor);
			if (result == null)
				result = caseParticipant(actor);
			if (result == null)
				result = caseMultiEnd(actor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.UC: {
			UC uc = (UC) theEObject;
			T result = caseUC(uc);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.SERVICE: {
			Service service = (Service) theEObject;
			T result = caseService(service);
			if (result == null)
				result = caseParticipant(service);
			if (result == null)
				result = caseMultiEnd(service);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.PARTICIPANT: {
			Participant participant = (Participant) theEObject;
			T result = caseParticipant(participant);
			if (result == null)
				result = caseMultiEnd(participant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.WORKFLOW: {
			Workflow workflow = (Workflow) theEObject;
			T result = caseWorkflow(workflow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.PARTITION: {
			Partition partition = (Partition) theEObject;
			T result = casePartition(partition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.WORKFLOW_EXP: {
			WorkflowExp workflowExp = (WorkflowExp) theEObject;
			T result = caseWorkflowExp(workflowExp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.PARTITION_ACTION: {
			PartitionAction partitionAction = (PartitionAction) theEObject;
			T result = casePartitionAction(partitionAction);
			if (result == null)
				result = caseWorkflowExp(partitionAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.JOIN_EXP: {
			JoinExp joinExp = (JoinExp) theEObject;
			T result = caseJoinExp(joinExp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.ACTIVITY_FINAL: {
			ActivityFinal activityFinal = (ActivityFinal) theEObject;
			T result = caseActivityFinal(activityFinal);
			if (result == null)
				result = caseWorkflowExp(activityFinal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.INITAL_NODE: {
			InitalNode initalNode = (InitalNode) theEObject;
			T result = caseInitalNode(initalNode);
			if (result == null)
				result = caseWorkflowExp(initalNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.FORK_NODE: {
			ForkNode forkNode = (ForkNode) theEObject;
			T result = caseForkNode(forkNode);
			if (result == null)
				result = caseWorkflowExp(forkNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.JOIN_NODE: {
			JoinNode joinNode = (JoinNode) theEObject;
			T result = caseJoinNode(joinNode);
			if (result == null)
				result = caseWorkflowExp(joinNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.COMPLEX_OPEARTION: {
			ComplexOpeartion complexOpeartion = (ComplexOpeartion) theEObject;
			T result = caseComplexOpeartion(complexOpeartion);
			if (result == null)
				result = caseWorkflowExp(complexOpeartion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.SIMPLE_OPERATION: {
			SimpleOperation simpleOperation = (SimpleOperation) theEObject;
			T result = caseSimpleOperation(simpleOperation);
			if (result == null)
				result = caseWorkflowExp(simpleOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.LOOP_EXP: {
			LoopExp loopExp = (LoopExp) theEObject;
			T result = caseLoopExp(loopExp);
			if (result == null)
				result = caseJoinExp(loopExp);
			if (result == null)
				result = caseComplexOpeartion(loopExp);
			if (result == null)
				result = caseWorkflowExp(loopExp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.SWITCH_EXP: {
			SwitchExp switchExp = (SwitchExp) theEObject;
			T result = caseSwitchExp(switchExp);
			if (result == null)
				result = caseJoinExp(switchExp);
			if (result == null)
				result = caseComplexOpeartion(switchExp);
			if (result == null)
				result = caseWorkflowExp(switchExp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.SWITCH_CASE: {
			SwitchCase switchCase = (SwitchCase) theEObject;
			T result = caseSwitchCase(switchCase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.SWITCH_DEFAULT: {
			SwitchDefault switchDefault = (SwitchDefault) theEObject;
			T result = caseSwitchDefault(switchDefault);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.OPERATION: {
			Operation operation = (Operation) theEObject;
			T result = caseOperation(operation);
			if (result == null)
				result = caseJoinExp(operation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.PARAMETER: {
			Parameter parameter = (Parameter) theEObject;
			T result = caseParameter(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.ENTITY: {
			Entity entity = (Entity) theEObject;
			T result = caseEntity(entity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.ATTRIBUTE: {
			Attribute attribute = (Attribute) theEObject;
			T result = caseAttribute(attribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.REFERENCE: {
			Reference reference = (Reference) theEObject;
			T result = caseReference(reference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.TYPE_CS: {
			TypeCS typeCS = (TypeCS) theEObject;
			T result = caseTypeCS(typeCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.INVARIANCE: {
			Invariance invariance = (Invariance) theEObject;
			T result = caseInvariance(invariance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.ENTITY_TYPE: {
			EntityType entityType = (EntityType) theEObject;
			T result = caseEntityType(entityType);
			if (result == null)
				result = caseTypeCS(entityType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.ENUM_ENTITY: {
			EnumEntity enumEntity = (EnumEntity) theEObject;
			T result = caseEnumEntity(enumEntity);
			if (result == null)
				result = caseTypeCS(enumEntity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.ENUM_ITEM: {
			EnumItem enumItem = (EnumItem) theEObject;
			T result = caseEnumItem(enumItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.CONTRACT: {
			Contract contract = (Contract) theEObject;
			T result = caseContract(contract);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.DEFINITION: {
			Definition definition = (Definition) theEObject;
			T result = caseDefinition(definition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.PRECONDITION: {
			Precondition precondition = (Precondition) theEObject;
			T result = casePrecondition(precondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.POSTCONDITION: {
			Postcondition postcondition = (Postcondition) theEObject;
			T result = casePostcondition(postcondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.OCL_EXPRESSION_CS: {
			OCLExpressionCS oclExpressionCS = (OCLExpressionCS) theEObject;
			T result = caseOCLExpressionCS(oclExpressionCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.NESTED_EXP_CS: {
			NestedExpCS nestedExpCS = (NestedExpCS) theEObject;
			T result = caseNestedExpCS(nestedExpCS);
			if (result == null)
				result = caseOCLExpressionCS(nestedExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.LOGIC_FORMULA_EXP_CS: {
			LogicFormulaExpCS logicFormulaExpCS = (LogicFormulaExpCS) theEObject;
			T result = caseLogicFormulaExpCS(logicFormulaExpCS);
			if (result == null)
				result = caseOCLExpressionCS(logicFormulaExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.ATOMIC_EXPRESSION: {
			AtomicExpression atomicExpression = (AtomicExpression) theEObject;
			T result = caseAtomicExpression(atomicExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.LEFT_SUB_ATOMIC_EXPRESSION: {
			LeftSubAtomicExpression leftSubAtomicExpression = (LeftSubAtomicExpression) theEObject;
			T result = caseLeftSubAtomicExpression(leftSubAtomicExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.RIGHT_SUB_ATOMIC_EXPRESSION: {
			RightSubAtomicExpression rightSubAtomicExpression = (RightSubAtomicExpression) theEObject;
			T result = caseRightSubAtomicExpression(rightSubAtomicExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.CALL_EXP_CS: {
			CallExpCS callExpCS = (CallExpCS) theEObject;
			T result = caseCallExpCS(callExpCS);
			if (result == null)
				result = caseLeftSubAtomicExpression(callExpCS);
			if (result == null)
				result = caseRightSubAtomicExpression(callExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.LOOP_EXP_CS: {
			LoopExpCS loopExpCS = (LoopExpCS) theEObject;
			T result = caseLoopExpCS(loopExpCS);
			if (result == null)
				result = caseCallExpCS(loopExpCS);
			if (result == null)
				result = caseLeftSubAtomicExpression(loopExpCS);
			if (result == null)
				result = caseRightSubAtomicExpression(loopExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.ITERATOR_EXP_CS: {
			IteratorExpCS iteratorExpCS = (IteratorExpCS) theEObject;
			T result = caseIteratorExpCS(iteratorExpCS);
			if (result == null)
				result = caseLoopExpCS(iteratorExpCS);
			if (result == null)
				result = caseCallExpCS(iteratorExpCS);
			if (result == null)
				result = caseLeftSubAtomicExpression(iteratorExpCS);
			if (result == null)
				result = caseRightSubAtomicExpression(iteratorExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.ENTITY_ATTRIBUTE_NAME: {
			EntityAttributeName entityAttributeName = (EntityAttributeName) theEObject;
			T result = caseEntityAttributeName(entityAttributeName);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.ARGUMENTS_CS: {
			ArgumentsCS argumentsCS = (ArgumentsCS) theEObject;
			T result = caseArgumentsCS(argumentsCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.FEATURE_CALL_EXP_CS: {
			FeatureCallExpCS featureCallExpCS = (FeatureCallExpCS) theEObject;
			T result = caseFeatureCallExpCS(featureCallExpCS);
			if (result == null)
				result = caseCallExpCS(featureCallExpCS);
			if (result == null)
				result = caseLeftSubAtomicExpression(featureCallExpCS);
			if (result == null)
				result = caseRightSubAtomicExpression(featureCallExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.STANDARD_NAVIGATION_CALL_EXP_CS: {
			StandardNavigationCallExpCS standardNavigationCallExpCS = (StandardNavigationCallExpCS) theEObject;
			T result = caseStandardNavigationCallExpCS(standardNavigationCallExpCS);
			if (result == null)
				result = caseFeatureCallExpCS(standardNavigationCallExpCS);
			if (result == null)
				result = caseCallExpCS(standardNavigationCallExpCS);
			if (result == null)
				result = caseLeftSubAtomicExpression(standardNavigationCallExpCS);
			if (result == null)
				result = caseRightSubAtomicExpression(standardNavigationCallExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.STANDARD_OPERATION_EXP_CS: {
			StandardOperationExpCS standardOperationExpCS = (StandardOperationExpCS) theEObject;
			T result = caseStandardOperationExpCS(standardOperationExpCS);
			if (result == null)
				result = caseFeatureCallExpCS(standardOperationExpCS);
			if (result == null)
				result = caseCallExpCS(standardOperationExpCS);
			if (result == null)
				result = caseLeftSubAtomicExpression(standardOperationExpCS);
			if (result == null)
				result = caseRightSubAtomicExpression(standardOperationExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.PREDEFINE_OP: {
			PredefineOp predefineOp = (PredefineOp) theEObject;
			T result = casePredefineOp(predefineOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.STANDARD_NONE_PARAMETER_OPERATION: {
			StandardNoneParameterOperation standardNoneParameterOperation = (StandardNoneParameterOperation) theEObject;
			T result = caseStandardNoneParameterOperation(standardNoneParameterOperation);
			if (result == null)
				result = casePredefineOp(standardNoneParameterOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.STANDARD_PARAMETER_OPERATION: {
			StandardParameterOperation standardParameterOperation = (StandardParameterOperation) theEObject;
			T result = caseStandardParameterOperation(standardParameterOperation);
			if (result == null)
				result = casePredefineOp(standardParameterOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.STANDARD_COLLECTION_OPERATION: {
			StandardCollectionOperation standardCollectionOperation = (StandardCollectionOperation) theEObject;
			T result = caseStandardCollectionOperation(standardCollectionOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.STANDARD_DATE_OPERATION: {
			StandardDateOperation standardDateOperation = (StandardDateOperation) theEObject;
			T result = caseStandardDateOperation(standardDateOperation);
			if (result == null)
				result = casePredefineOp(standardDateOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.CLASSIFER_CALL_EXP_CS: {
			ClassiferCallExpCS classiferCallExpCS = (ClassiferCallExpCS) theEObject;
			T result = caseClassiferCallExpCS(classiferCallExpCS);
			if (result == null)
				result = caseFeatureCallExpCS(classiferCallExpCS);
			if (result == null)
				result = caseCallExpCS(classiferCallExpCS);
			if (result == null)
				result = caseLeftSubAtomicExpression(classiferCallExpCS);
			if (result == null)
				result = caseRightSubAtomicExpression(classiferCallExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.PROPERTY_CALL_EXP_CS: {
			PropertyCallExpCS propertyCallExpCS = (PropertyCallExpCS) theEObject;
			T result = casePropertyCallExpCS(propertyCallExpCS);
			if (result == null)
				result = caseFeatureCallExpCS(propertyCallExpCS);
			if (result == null)
				result = caseCallExpCS(propertyCallExpCS);
			if (result == null)
				result = caseLeftSubAtomicExpression(propertyCallExpCS);
			if (result == null)
				result = caseRightSubAtomicExpression(propertyCallExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.OPERATION_CALL_EXP_CS: {
			OperationCallExpCS operationCallExpCS = (OperationCallExpCS) theEObject;
			T result = caseOperationCallExpCS(operationCallExpCS);
			if (result == null)
				result = caseFeatureCallExpCS(operationCallExpCS);
			if (result == null)
				result = caseCallExpCS(operationCallExpCS);
			if (result == null)
				result = caseLeftSubAtomicExpression(operationCallExpCS);
			if (result == null)
				result = caseRightSubAtomicExpression(operationCallExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.OPERATION_PARAMETERS: {
			OperationParameters operationParameters = (OperationParameters) theEObject;
			T result = caseOperationParameters(operationParameters);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.VARIABLE_EXP_CS: {
			VariableExpCS variableExpCS = (VariableExpCS) theEObject;
			T result = caseVariableExpCS(variableExpCS);
			if (result == null)
				result = caseLeftSubAtomicExpression(variableExpCS);
			if (result == null)
				result = caseRightSubAtomicExpression(variableExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.IF_EXP_CS: {
			IfExpCS ifExpCS = (IfExpCS) theEObject;
			T result = caseIfExpCS(ifExpCS);
			if (result == null)
				result = caseOCLExpressionCS(ifExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.LET_EXP_CS: {
			LetExpCS letExpCS = (LetExpCS) theEObject;
			T result = caseLetExpCS(letExpCS);
			if (result == null)
				result = caseOCLExpressionCS(letExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.VARIABLE_DECLARATION_CS: {
			VariableDeclarationCS variableDeclarationCS = (VariableDeclarationCS) theEObject;
			T result = caseVariableDeclarationCS(variableDeclarationCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.LITERAL_EXP_CS: {
			LiteralExpCS literalExpCS = (LiteralExpCS) theEObject;
			T result = caseLiteralExpCS(literalExpCS);
			if (result == null)
				result = caseOCLExpressionCS(literalExpCS);
			if (result == null)
				result = caseRightSubAtomicExpression(literalExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.ENUM_LITERAL_EXP_CS: {
			EnumLiteralExpCS enumLiteralExpCS = (EnumLiteralExpCS) theEObject;
			T result = caseEnumLiteralExpCS(enumLiteralExpCS);
			if (result == null)
				result = caseLiteralExpCS(enumLiteralExpCS);
			if (result == null)
				result = caseOCLExpressionCS(enumLiteralExpCS);
			if (result == null)
				result = caseRightSubAtomicExpression(enumLiteralExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.TUPLE_LITERAL_EXP_CS: {
			TupleLiteralExpCS tupleLiteralExpCS = (TupleLiteralExpCS) theEObject;
			T result = caseTupleLiteralExpCS(tupleLiteralExpCS);
			if (result == null)
				result = caseLiteralExpCS(tupleLiteralExpCS);
			if (result == null)
				result = caseOCLExpressionCS(tupleLiteralExpCS);
			if (result == null)
				result = caseRightSubAtomicExpression(tupleLiteralExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.TUPLE_TYPE_CS: {
			TupleTypeCS tupleTypeCS = (TupleTypeCS) theEObject;
			T result = caseTupleTypeCS(tupleTypeCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.COLLECTION_TYPE_CS: {
			CollectionTypeCS collectionTypeCS = (CollectionTypeCS) theEObject;
			T result = caseCollectionTypeCS(collectionTypeCS);
			if (result == null)
				result = caseTypeCS(collectionTypeCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.COLLECTION_LITERAL_EXP_CS: {
			CollectionLiteralExpCS collectionLiteralExpCS = (CollectionLiteralExpCS) theEObject;
			T result = caseCollectionLiteralExpCS(collectionLiteralExpCS);
			if (result == null)
				result = caseLiteralExpCS(collectionLiteralExpCS);
			if (result == null)
				result = caseOCLExpressionCS(collectionLiteralExpCS);
			if (result == null)
				result = caseRightSubAtomicExpression(collectionLiteralExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.COLLECTION_LITERAL_PART_CS: {
			CollectionLiteralPartCS collectionLiteralPartCS = (CollectionLiteralPartCS) theEObject;
			T result = caseCollectionLiteralPartCS(collectionLiteralPartCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.COLLECTION_RANGE_CS: {
			CollectionRangeCS collectionRangeCS = (CollectionRangeCS) theEObject;
			T result = caseCollectionRangeCS(collectionRangeCS);
			if (result == null)
				result = caseCollectionLiteralPartCS(collectionRangeCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.COLLECTION_ITEM: {
			CollectionItem collectionItem = (CollectionItem) theEObject;
			T result = caseCollectionItem(collectionItem);
			if (result == null)
				result = caseCollectionLiteralPartCS(collectionItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.PRIMITIVE_LITERAL_EXP_CS: {
			PrimitiveLiteralExpCS primitiveLiteralExpCS = (PrimitiveLiteralExpCS) theEObject;
			T result = casePrimitiveLiteralExpCS(primitiveLiteralExpCS);
			if (result == null)
				result = caseLiteralExpCS(primitiveLiteralExpCS);
			if (result == null)
				result = caseOCLExpressionCS(primitiveLiteralExpCS);
			if (result == null)
				result = caseRightSubAtomicExpression(primitiveLiteralExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.NUMBER_LITERAL_EXP_CS: {
			NumberLiteralExpCS numberLiteralExpCS = (NumberLiteralExpCS) theEObject;
			T result = caseNumberLiteralExpCS(numberLiteralExpCS);
			if (result == null)
				result = casePrimitiveLiteralExpCS(numberLiteralExpCS);
			if (result == null)
				result = caseLiteralExpCS(numberLiteralExpCS);
			if (result == null)
				result = caseOCLExpressionCS(numberLiteralExpCS);
			if (result == null)
				result = caseRightSubAtomicExpression(numberLiteralExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.BOOLEAN_LITERAL_EXP_CS: {
			BooleanLiteralExpCS booleanLiteralExpCS = (BooleanLiteralExpCS) theEObject;
			T result = caseBooleanLiteralExpCS(booleanLiteralExpCS);
			if (result == null)
				result = casePrimitiveLiteralExpCS(booleanLiteralExpCS);
			if (result == null)
				result = caseLiteralExpCS(booleanLiteralExpCS);
			if (result == null)
				result = caseOCLExpressionCS(booleanLiteralExpCS);
			if (result == null)
				result = caseRightSubAtomicExpression(booleanLiteralExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.STRING_LITERAL_EXP_CS: {
			StringLiteralExpCS stringLiteralExpCS = (StringLiteralExpCS) theEObject;
			T result = caseStringLiteralExpCS(stringLiteralExpCS);
			if (result == null)
				result = casePrimitiveLiteralExpCS(stringLiteralExpCS);
			if (result == null)
				result = caseLiteralExpCS(stringLiteralExpCS);
			if (result == null)
				result = caseOCLExpressionCS(stringLiteralExpCS);
			if (result == null)
				result = caseRightSubAtomicExpression(stringLiteralExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.NULL_LITERAL_EXP_CS: {
			NullLiteralExpCS nullLiteralExpCS = (NullLiteralExpCS) theEObject;
			T result = caseNullLiteralExpCS(nullLiteralExpCS);
			if (result == null)
				result = casePrimitiveLiteralExpCS(nullLiteralExpCS);
			if (result == null)
				result = caseLiteralExpCS(nullLiteralExpCS);
			if (result == null)
				result = caseOCLExpressionCS(nullLiteralExpCS);
			if (result == null)
				result = caseRightSubAtomicExpression(nullLiteralExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.INVALID_LITERAL_EXP_CS: {
			InvalidLiteralExpCS invalidLiteralExpCS = (InvalidLiteralExpCS) theEObject;
			T result = caseInvalidLiteralExpCS(invalidLiteralExpCS);
			if (result == null)
				result = casePrimitiveLiteralExpCS(invalidLiteralExpCS);
			if (result == null)
				result = caseLiteralExpCS(invalidLiteralExpCS);
			if (result == null)
				result = caseOCLExpressionCS(invalidLiteralExpCS);
			if (result == null)
				result = caseRightSubAtomicExpression(invalidLiteralExpCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.RESERVED_KEYWORD_CS: {
			ReservedKeywordCS reservedKeywordCS = (ReservedKeywordCS) theEObject;
			T result = caseReservedKeywordCS(reservedKeywordCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.COLLECTION_TYPE_IDENTIFIER_CS: {
			CollectionTypeIdentifierCS collectionTypeIdentifierCS = (CollectionTypeIdentifierCS) theEObject;
			T result = caseCollectionTypeIdentifierCS(collectionTypeIdentifierCS);
			if (result == null)
				result = caseReservedKeywordCS(collectionTypeIdentifierCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.PRIMITIVE_TYPE_CS: {
			PrimitiveTypeCS primitiveTypeCS = (PrimitiveTypeCS) theEObject;
			T result = casePrimitiveTypeCS(primitiveTypeCS);
			if (result == null)
				result = caseTypeCS(primitiveTypeCS);
			if (result == null)
				result = caseReservedKeywordCS(primitiveTypeCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OriginreqPackage.OCL_TYPE_CS: {
			OclTypeCS oclTypeCS = (OclTypeCS) theEObject;
			T result = caseOclTypeCS(oclTypeCS);
			if (result == null)
				result = caseReservedKeywordCS(oclTypeCS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementModel(RequirementModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteraction(Interaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallMessage(CallMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnMessage(ReturnMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecution(Execution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combined Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinedFragment(CombinedFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperand(Operand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEnd(AbstractEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mix End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mix End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixEnd(MixEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mix Op And CF End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mix Op And CF End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixOpAndCFEnd(MixOpAndCFEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageEnd(MessageEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiEnd(MultiEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionEnd(ExecutionEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combined Fragment End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combined Fragment End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinedFragmentEnd(CombinedFragmentEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operand End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operand End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperandEnd(OperandEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainModel(DomainModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Case Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Case Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseCaseModel(UseCaseModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUC(UC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant(Participant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflow(Workflow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartition(Partition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowExp(WorkflowExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partition Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partition Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartitionAction(PartitionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinExp(JoinExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Final</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Final</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityFinal(ActivityFinal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inital Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inital Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitalNode(InitalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkNode(ForkNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinNode(JoinNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Opeartion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Opeartion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexOpeartion(ComplexOpeartion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleOperation(SimpleOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopExp(LoopExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchExp(SwitchExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchCase(SwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Default</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Default</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchDefault(SwitchDefault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCS(TypeCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invariance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invariance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvariance(Invariance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityType(EntityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumEntity(EnumEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumItem(EnumItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContract(Contract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinition(Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precondition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecondition(Precondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postcondition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postcondition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostcondition(Postcondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Expression CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Expression CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLExpressionCS(OCLExpressionCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedExpCS(NestedExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logic Formula Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logic Formula Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicFormulaExpCS(LogicFormulaExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicExpression(AtomicExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Sub Atomic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Sub Atomic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftSubAtomicExpression(LeftSubAtomicExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Sub Atomic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Sub Atomic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightSubAtomicExpression(RightSubAtomicExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallExpCS(CallExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopExpCS(LoopExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterator Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterator Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIteratorExpCS(IteratorExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Attribute Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Attribute Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityAttributeName(EntityAttributeName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arguments CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arguments CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentsCS(ArgumentsCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Call Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Call Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureCallExpCS(FeatureCallExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Navigation Call Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Navigation Call Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardNavigationCallExpCS(StandardNavigationCallExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Operation Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Operation Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardOperationExpCS(StandardOperationExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predefine Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predefine Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredefineOp(PredefineOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard None Parameter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard None Parameter Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardNoneParameterOperation(StandardNoneParameterOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Parameter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Parameter Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardParameterOperation(StandardParameterOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Collection Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Collection Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardCollectionOperation(StandardCollectionOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Date Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Date Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardDateOperation(StandardDateOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifer Call Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifer Call Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassiferCallExpCS(ClassiferCallExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Call Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Call Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyCallExpCS(PropertyCallExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Call Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Call Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationCallExpCS(OperationCallExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationParameters(OperationParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableExpCS(VariableExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfExpCS(IfExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Let Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Let Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLetExpCS(LetExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclarationCS(VariableDeclarationCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralExpCS(LiteralExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Literal Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumLiteralExpCS(EnumLiteralExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple Literal Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTupleLiteralExpCS(TupleLiteralExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple Type CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple Type CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTupleTypeCS(TupleTypeCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Type CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Type CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionTypeCS(CollectionTypeCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Literal Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionLiteralExpCS(CollectionLiteralExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Literal Part CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Literal Part CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionLiteralPartCS(CollectionLiteralPartCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Range CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Range CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionRangeCS(CollectionRangeCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionItem(CollectionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Literal Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveLiteralExpCS(PrimitiveLiteralExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Literal Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberLiteralExpCS(NumberLiteralExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteralExpCS(BooleanLiteralExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteralExpCS(StringLiteralExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Literal Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullLiteralExpCS(NullLiteralExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invalid Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invalid Literal Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvalidLiteralExpCS(InvalidLiteralExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reserved Keyword CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reserved Keyword CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservedKeywordCS(ReservedKeywordCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Type Identifier CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Type Identifier CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionTypeIdentifierCS(CollectionTypeIdentifierCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeCS(PrimitiveTypeCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ocl Type CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ocl Type CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOclTypeCS(OclTypeCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OriginreqSwitch
