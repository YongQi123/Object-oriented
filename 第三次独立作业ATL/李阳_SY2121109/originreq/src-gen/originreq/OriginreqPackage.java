/**
 */
package originreq;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see originreq.OriginreqFactory
 * @model kind="package"
 * @generated
 */
public interface OriginreqPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "originreq";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/originreq";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "originreq";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OriginreqPackage eINSTANCE = originreq.impl.OriginreqPackageImpl.init();

	/**
	 * The meta object id for the '{@link originreq.impl.RequirementModelImpl <em>Requirement Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.RequirementModelImpl
	 * @see originreq.impl.OriginreqPackageImpl#getRequirementModel()
	 * @generated
	 */
	int REQUIREMENT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MODEL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Use Case Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MODEL__USE_CASE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MODEL__DOMAIN_MODEL = 3;

	/**
	 * The number of structural features of the '<em>Requirement Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Requirement Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.InteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.InteractionImpl
	 * @see originreq.impl.OriginreqPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__PARTICIPANTS = 1;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__MESSAGES = 2;

	/**
	 * The feature id for the '<em><b>Executions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__EXECUTIONS = 3;

	/**
	 * The feature id for the '<em><b>Combined Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__COMBINED_FRAGMENTS = 4;

	/**
	 * The feature id for the '<em><b>Ends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ENDS = 5;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.MessageImpl
	 * @see originreq.impl.OriginreqPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sending End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SENDING_END = 1;

	/**
	 * The feature id for the '<em><b>Receiving End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__RECEIVING_END = 2;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.CallMessageImpl <em>Call Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.CallMessageImpl
	 * @see originreq.impl.OriginreqPackageImpl#getCallMessage()
	 * @generated
	 */
	int CALL_MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_MESSAGE__NAME = MESSAGE__NAME;

	/**
	 * The feature id for the '<em><b>Sending End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_MESSAGE__SENDING_END = MESSAGE__SENDING_END;

	/**
	 * The feature id for the '<em><b>Receiving End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_MESSAGE__RECEIVING_END = MESSAGE__RECEIVING_END;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_MESSAGE__OP = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Call Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.ReturnMessageImpl <em>Return Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.ReturnMessageImpl
	 * @see originreq.impl.OriginreqPackageImpl#getReturnMessage()
	 * @generated
	 */
	int RETURN_MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_MESSAGE__NAME = MESSAGE__NAME;

	/**
	 * The feature id for the '<em><b>Sending End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_MESSAGE__SENDING_END = MESSAGE__SENDING_END;

	/**
	 * The feature id for the '<em><b>Receiving End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_MESSAGE__RECEIVING_END = MESSAGE__RECEIVING_END;

	/**
	 * The feature id for the '<em><b>Invocation Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_MESSAGE__INVOCATION_MESSAGE = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Return Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.MultiEndImpl <em>Multi End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.MultiEndImpl
	 * @see originreq.impl.OriginreqPackageImpl#getMultiEnd()
	 * @generated
	 */
	int MULTI_END = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_END__NAME = 0;

	/**
	 * The number of structural features of the '<em>Multi End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_END_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Multi End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_END_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.ExecutionImpl <em>Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.ExecutionImpl
	 * @see originreq.impl.OriginreqPackageImpl#getExecution()
	 * @generated
	 */
	int EXECUTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__NAME = MULTI_END__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__OWNER = MULTI_END_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__START = MULTI_END_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__END = MULTI_END_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FEATURE_COUNT = MULTI_END_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OPERATION_COUNT = MULTI_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.CombinedFragmentImpl <em>Combined Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.CombinedFragmentImpl
	 * @see originreq.impl.OriginreqPackageImpl#getCombinedFragment()
	 * @generated
	 */
	int COMBINED_FRAGMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Covered Participants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__COVERED_PARTICIPANTS = 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__START = 3;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__FINISH = 4;

	/**
	 * The feature id for the '<em><b>Owned Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__OWNED_OPERANDS = 5;

	/**
	 * The number of structural features of the '<em>Combined Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Combined Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.OperandImpl <em>Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.OperandImpl
	 * @see originreq.impl.OriginreqPackageImpl#getOperand()
	 * @generated
	 */
	int OPERAND = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND__START = 1;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND__FINISH = 2;

	/**
	 * The number of structural features of the '<em>Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.AbstractEndImpl <em>Abstract End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.AbstractEndImpl
	 * @see originreq.impl.OriginreqPackageImpl#getAbstractEnd()
	 * @generated
	 */
	int ABSTRACT_END = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_END_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.MixEndImpl <em>Mix End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.MixEndImpl
	 * @see originreq.impl.OriginreqPackageImpl#getMixEnd()
	 * @generated
	 */
	int MIX_END = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIX_END__NAME = ABSTRACT_END__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIX_END__CONTEXT = ABSTRACT_END_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mix End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIX_END_FEATURE_COUNT = ABSTRACT_END_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mix End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIX_END_OPERATION_COUNT = ABSTRACT_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.MixOpAndCFEndImpl <em>Mix Op And CF End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.MixOpAndCFEndImpl
	 * @see originreq.impl.OriginreqPackageImpl#getMixOpAndCFEnd()
	 * @generated
	 */
	int MIX_OP_AND_CF_END = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIX_OP_AND_CF_END__NAME = ABSTRACT_END__NAME;

	/**
	 * The number of structural features of the '<em>Mix Op And CF End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIX_OP_AND_CF_END_FEATURE_COUNT = ABSTRACT_END_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mix Op And CF End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIX_OP_AND_CF_END_OPERATION_COUNT = ABSTRACT_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.MessageEndImpl <em>Message End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.MessageEndImpl
	 * @see originreq.impl.OriginreqPackageImpl#getMessageEnd()
	 * @generated
	 */
	int MESSAGE_END = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END__NAME = MIX_END__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END__CONTEXT = MIX_END__CONTEXT;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END__MESSAGE = MIX_END_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END_FEATURE_COUNT = MIX_END_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END_OPERATION_COUNT = MIX_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.ExecutionEndImpl <em>Execution End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.ExecutionEndImpl
	 * @see originreq.impl.OriginreqPackageImpl#getExecutionEnd()
	 * @generated
	 */
	int EXECUTION_END = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_END__NAME = MIX_END__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_END__CONTEXT = MIX_END__CONTEXT;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_END__EXECUTION = MIX_END_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execution End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_END_FEATURE_COUNT = MIX_END_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Execution End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_END_OPERATION_COUNT = MIX_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.CombinedFragmentEndImpl <em>Combined Fragment End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.CombinedFragmentEndImpl
	 * @see originreq.impl.OriginreqPackageImpl#getCombinedFragmentEnd()
	 * @generated
	 */
	int COMBINED_FRAGMENT_END = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT_END__NAME = MIX_OP_AND_CF_END__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT_END__OWNER = MIX_OP_AND_CF_END_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Combined Fragment End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT_END_FEATURE_COUNT = MIX_OP_AND_CF_END_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Combined Fragment End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT_END_OPERATION_COUNT = MIX_OP_AND_CF_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.OperandEndImpl <em>Operand End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.OperandEndImpl
	 * @see originreq.impl.OriginreqPackageImpl#getOperandEnd()
	 * @generated
	 */
	int OPERAND_END = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_END__NAME = MIX_OP_AND_CF_END__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_END__OWNER = MIX_OP_AND_CF_END_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operand End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_END_FEATURE_COUNT = MIX_OP_AND_CF_END_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operand End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_END_OPERATION_COUNT = MIX_OP_AND_CF_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.DomainModelImpl <em>Domain Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.DomainModelImpl
	 * @see originreq.impl.OriginreqPackageImpl#getDomainModel()
	 * @generated
	 */
	int DOMAIN_MODEL = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__ENTITY = 2;

	/**
	 * The number of structural features of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.UseCaseModelImpl <em>Use Case Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.UseCaseModelImpl
	 * @see originreq.impl.OriginreqPackageImpl#getUseCaseModel()
	 * @generated
	 */
	int USE_CASE_MODEL = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MODEL__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Uc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MODEL__UC = 2;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MODEL__ACTOR = 3;

	/**
	 * The feature id for the '<em><b>Interaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MODEL__INTERACTION = 4;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MODEL__SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MODEL__CONTRACT = 6;

	/**
	 * The number of structural features of the '<em>Use Case Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MODEL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Use Case Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.ParticipantImpl
	 * @see originreq.impl.OriginreqPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__NAME = MULTI_END__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__DESCRIPTION = MULTI_END_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = MULTI_END_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_OPERATION_COUNT = MULTI_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.ActorImpl
	 * @see originreq.impl.OriginreqPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = PARTICIPANT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DESCRIPTION = PARTICIPANT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__LABEL = PARTICIPANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SUPER_ACTOR = PARTICIPANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__UC = PARTICIPANT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = PARTICIPANT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = PARTICIPANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.UCImpl <em>UC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.UCImpl
	 * @see originreq.impl.OriginreqPackageImpl#getUC()
	 * @generated
	 */
	int UC = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC__LABEL = 1;

	/**
	 * The feature id for the '<em><b>UC Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC__UC_RELATION = 2;

	/**
	 * The feature id for the '<em><b>Relateduc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC__RELATEDUC = 3;

	/**
	 * The feature id for the '<em><b>Ssd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC__SSD = 4;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC__SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC__DESCRIPTION = 6;

	/**
	 * The number of structural features of the '<em>UC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>UC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.ServiceImpl
	 * @see originreq.impl.OriginreqPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = PARTICIPANT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = PARTICIPANT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OPERATION = PARTICIPANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Temp property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TEMP_PROPERTY = PARTICIPANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__WORKFLOW = PARTICIPANT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Invariance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__INVARIANCE = PARTICIPANT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = PARTICIPANT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = PARTICIPANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.WorkflowImpl
	 * @see originreq.impl.OriginreqPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__PARTICIPANTS = 1;

	/**
	 * The feature id for the '<em><b>Partitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__PARTITIONS = 2;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.PartitionImpl <em>Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.PartitionImpl
	 * @see originreq.impl.OriginreqPackageImpl#getPartition()
	 * @generated
	 */
	int PARTITION = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Exps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__EXPS = 1;

	/**
	 * The number of structural features of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.WorkflowExpImpl <em>Workflow Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.WorkflowExpImpl
	 * @see originreq.impl.OriginreqPackageImpl#getWorkflowExp()
	 * @generated
	 */
	int WORKFLOW_EXP = 24;

	/**
	 * The number of structural features of the '<em>Workflow Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_EXP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Workflow Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_EXP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.PartitionActionImpl <em>Partition Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.PartitionActionImpl
	 * @see originreq.impl.OriginreqPackageImpl#getPartitionAction()
	 * @generated
	 */
	int PARTITION_ACTION = 25;

	/**
	 * The feature id for the '<em><b>Patition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ACTION__PATITION = WORKFLOW_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ACTION__ACTION = WORKFLOW_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Partition Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ACTION_FEATURE_COUNT = WORKFLOW_EXP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Partition Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_ACTION_OPERATION_COUNT = WORKFLOW_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.JoinExpImpl <em>Join Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.JoinExpImpl
	 * @see originreq.impl.OriginreqPackageImpl#getJoinExp()
	 * @generated
	 */
	int JOIN_EXP = 26;

	/**
	 * The number of structural features of the '<em>Join Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_EXP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Join Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_EXP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.ActivityFinalImpl <em>Activity Final</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.ActivityFinalImpl
	 * @see originreq.impl.OriginreqPackageImpl#getActivityFinal()
	 * @generated
	 */
	int ACTIVITY_FINAL = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL__NAME = WORKFLOW_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_FEATURE_COUNT = WORKFLOW_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_OPERATION_COUNT = WORKFLOW_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.InitalNodeImpl <em>Inital Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.InitalNodeImpl
	 * @see originreq.impl.OriginreqPackageImpl#getInitalNode()
	 * @generated
	 */
	int INITAL_NODE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITAL_NODE__NAME = WORKFLOW_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inital Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITAL_NODE_FEATURE_COUNT = WORKFLOW_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Inital Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITAL_NODE_OPERATION_COUNT = WORKFLOW_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.ForkNodeImpl <em>Fork Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.ForkNodeImpl
	 * @see originreq.impl.OriginreqPackageImpl#getForkNode()
	 * @generated
	 */
	int FORK_NODE = 29;

	/**
	 * The feature id for the '<em><b>Startlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__STARTLINKS = WORKFLOW_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fork Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_FEATURE_COUNT = WORKFLOW_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fork Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_OPERATION_COUNT = WORKFLOW_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.JoinNodeImpl <em>Join Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.JoinNodeImpl
	 * @see originreq.impl.OriginreqPackageImpl#getJoinNode()
	 * @generated
	 */
	int JOIN_NODE = 30;

	/**
	 * The feature id for the '<em><b>Endlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__ENDLINKS = WORKFLOW_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Join Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_FEATURE_COUNT = WORKFLOW_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Join Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_OPERATION_COUNT = WORKFLOW_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.ComplexOpeartionImpl <em>Complex Opeartion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.ComplexOpeartionImpl
	 * @see originreq.impl.OriginreqPackageImpl#getComplexOpeartion()
	 * @generated
	 */
	int COMPLEX_OPEARTION = 31;

	/**
	 * The number of structural features of the '<em>Complex Opeartion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OPEARTION_FEATURE_COUNT = WORKFLOW_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Complex Opeartion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OPEARTION_OPERATION_COUNT = WORKFLOW_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.SimpleOperationImpl <em>Simple Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.SimpleOperationImpl
	 * @see originreq.impl.OriginreqPackageImpl#getSimpleOperation()
	 * @generated
	 */
	int SIMPLE_OPERATION = 32;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION__REF = WORKFLOW_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_FEATURE_COUNT = WORKFLOW_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_OPERATION_COUNT = WORKFLOW_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.LoopExpImpl <em>Loop Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.LoopExpImpl
	 * @see originreq.impl.OriginreqPackageImpl#getLoopExp()
	 * @generated
	 */
	int LOOP_EXP = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__NAME = JOIN_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__EXPS = JOIN_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP_FEATURE_COUNT = JOIN_EXP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Loop Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP_OPERATION_COUNT = JOIN_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.SwitchExpImpl <em>Switch Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.SwitchExpImpl
	 * @see originreq.impl.OriginreqPackageImpl#getSwitchExp()
	 * @generated
	 */
	int SWITCH_EXP = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP__NAME = JOIN_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP__CASES = JOIN_EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP__DEFAULT = JOIN_EXP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Switch Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP_FEATURE_COUNT = JOIN_EXP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Switch Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP_OPERATION_COUNT = JOIN_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.SwitchCaseImpl
	 * @see originreq.impl.OriginreqPackageImpl#getSwitchCase()
	 * @generated
	 */
	int SWITCH_CASE = 35;

	/**
	 * The feature id for the '<em><b>Case Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__CASE_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__OP = 1;

	/**
	 * The number of structural features of the '<em>Switch Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Switch Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.SwitchDefaultImpl <em>Switch Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.SwitchDefaultImpl
	 * @see originreq.impl.OriginreqPackageImpl#getSwitchDefault()
	 * @generated
	 */
	int SWITCH_DEFAULT = 36;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_DEFAULT__OP = 0;

	/**
	 * The number of structural features of the '<em>Switch Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_DEFAULT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Switch Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_DEFAULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.OperationImpl
	 * @see originreq.impl.OriginreqPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = JOIN_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETER = JOIN_EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_TYPE = JOIN_EXP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = JOIN_EXP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = JOIN_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.ParameterImpl
	 * @see originreq.impl.OriginreqPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.EntityImpl
	 * @see originreq.impl.OriginreqPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 39;

	/**
	 * The feature id for the '<em><b>Is CRUD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_CRUD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Super Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SUPER_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = 4;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Invariance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__INVARIANCE = 6;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.AttributeImpl
	 * @see originreq.impl.OriginreqPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Ismultiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ISMULTIPLE = 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.ReferenceImpl
	 * @see originreq.impl.OriginreqPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Ismultiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ISMULTIPLE = 2;

	/**
	 * The feature id for the '<em><b>Is Reverse Assoication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__IS_REVERSE_ASSOICATION = 3;

	/**
	 * The feature id for the '<em><b>Is Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__IS_AGGREGATION = 4;

	/**
	 * The feature id for the '<em><b>Is Composition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__IS_COMPOSITION = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TYPE = 6;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.TypeCSImpl <em>Type CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.TypeCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getTypeCS()
	 * @generated
	 */
	int TYPE_CS = 42;

	/**
	 * The number of structural features of the '<em>Type CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.InvarianceImpl <em>Invariance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.InvarianceImpl
	 * @see originreq.impl.OriginreqPackageImpl#getInvariance()
	 * @generated
	 */
	int INVARIANCE = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ocl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANCE__OCL = 1;

	/**
	 * The feature id for the '<em><b>Is For Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANCE__IS_FOR_ASSOCIATION = 2;

	/**
	 * The number of structural features of the '<em>Invariance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Invariance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.EntityTypeImpl <em>Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.EntityTypeImpl
	 * @see originreq.impl.OriginreqPackageImpl#getEntityType()
	 * @generated
	 */
	int ENTITY_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__ENTITY = TYPE_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_FEATURE_COUNT = TYPE_CS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_OPERATION_COUNT = TYPE_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.EnumEntityImpl <em>Enum Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.EnumEntityImpl
	 * @see originreq.impl.OriginreqPackageImpl#getEnumEntity()
	 * @generated
	 */
	int ENUM_ENTITY = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ENTITY__NAME = TYPE_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ENTITY__ELEMENT = TYPE_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ENTITY_FEATURE_COUNT = TYPE_CS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enum Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ENTITY_OPERATION_COUNT = TYPE_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.EnumItemImpl <em>Enum Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.EnumItemImpl
	 * @see originreq.impl.OriginreqPackageImpl#getEnumItem()
	 * @generated
	 */
	int ENUM_ITEM = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ITEM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Enum Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Enum Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.ContractImpl <em>Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.ContractImpl
	 * @see originreq.impl.OriginreqPackageImpl#getContract()
	 * @generated
	 */
	int CONTRACT = 47;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__OP = 1;

	/**
	 * The feature id for the '<em><b>Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__DEF = 2;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__PRE = 3;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__POST = 4;

	/**
	 * The number of structural features of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.DefinitionImpl
	 * @see originreq.impl.OriginreqPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 48;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__VARIABLE = 0;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.PreconditionImpl <em>Precondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.PreconditionImpl
	 * @see originreq.impl.OriginreqPackageImpl#getPrecondition()
	 * @generated
	 */
	int PRECONDITION = 49;

	/**
	 * The feature id for the '<em><b>Oclexp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__OCLEXP = 0;

	/**
	 * The number of structural features of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.PostconditionImpl <em>Postcondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.PostconditionImpl
	 * @see originreq.impl.OriginreqPackageImpl#getPostcondition()
	 * @generated
	 */
	int POSTCONDITION = 50;

	/**
	 * The feature id for the '<em><b>Oclexp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION__OCLEXP = 0;

	/**
	 * The number of structural features of the '<em>Postcondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Postcondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.OCLExpressionCSImpl <em>OCL Expression CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.OCLExpressionCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getOCLExpressionCS()
	 * @generated
	 */
	int OCL_EXPRESSION_CS = 51;

	/**
	 * The number of structural features of the '<em>OCL Expression CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION_CS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>OCL Expression CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION_CS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.NestedExpCSImpl <em>Nested Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.NestedExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getNestedExpCS()
	 * @generated
	 */
	int NESTED_EXP_CS = 52;

	/**
	 * The feature id for the '<em><b>Nested Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_EXP_CS__NESTED_EXPRESSION = OCL_EXPRESSION_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nested Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_EXP_CS_FEATURE_COUNT = OCL_EXPRESSION_CS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Nested Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_EXP_CS_OPERATION_COUNT = OCL_EXPRESSION_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.LogicFormulaExpCSImpl <em>Logic Formula Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.LogicFormulaExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getLogicFormulaExpCS()
	 * @generated
	 */
	int LOGIC_FORMULA_EXP_CS = 53;

	/**
	 * The feature id for the '<em><b>Atomicexp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_FORMULA_EXP_CS__ATOMICEXP = OCL_EXPRESSION_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_FORMULA_EXP_CS__CONNECTOR = OCL_EXPRESSION_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logic Formula Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_FORMULA_EXP_CS_FEATURE_COUNT = OCL_EXPRESSION_CS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Logic Formula Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_FORMULA_EXP_CS_OPERATION_COUNT = OCL_EXPRESSION_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.AtomicExpressionImpl <em>Atomic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.AtomicExpressionImpl
	 * @see originreq.impl.OriginreqPackageImpl#getAtomicExpression()
	 * @generated
	 */
	int ATOMIC_EXPRESSION = 54;

	/**
	 * The feature id for the '<em><b>Leftside</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_EXPRESSION__LEFTSIDE = 0;

	/**
	 * The feature id for the '<em><b>Infixop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_EXPRESSION__INFIXOP = 1;

	/**
	 * The feature id for the '<em><b>Rightside</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_EXPRESSION__RIGHTSIDE = 2;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_EXPRESSION__OP = 3;

	/**
	 * The feature id for the '<em><b>Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_EXPRESSION__NUM = 4;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_EXPRESSION__EXP = 5;

	/**
	 * The number of structural features of the '<em>Atomic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_EXPRESSION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Atomic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.LeftSubAtomicExpressionImpl <em>Left Sub Atomic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.LeftSubAtomicExpressionImpl
	 * @see originreq.impl.OriginreqPackageImpl#getLeftSubAtomicExpression()
	 * @generated
	 */
	int LEFT_SUB_ATOMIC_EXPRESSION = 55;

	/**
	 * The number of structural features of the '<em>Left Sub Atomic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SUB_ATOMIC_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Left Sub Atomic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SUB_ATOMIC_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.RightSubAtomicExpressionImpl <em>Right Sub Atomic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.RightSubAtomicExpressionImpl
	 * @see originreq.impl.OriginreqPackageImpl#getRightSubAtomicExpression()
	 * @generated
	 */
	int RIGHT_SUB_ATOMIC_EXPRESSION = 56;

	/**
	 * The number of structural features of the '<em>Right Sub Atomic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SUB_ATOMIC_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Right Sub Atomic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SUB_ATOMIC_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.CallExpCSImpl <em>Call Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.CallExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getCallExpCS()
	 * @generated
	 */
	int CALL_EXP_CS = 57;

	/**
	 * The number of structural features of the '<em>Call Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXP_CS_FEATURE_COUNT = LEFT_SUB_ATOMIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Call Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXP_CS_OPERATION_COUNT = LEFT_SUB_ATOMIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.LoopExpCSImpl <em>Loop Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.LoopExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getLoopExpCS()
	 * @generated
	 */
	int LOOP_EXP_CS = 58;

	/**
	 * The number of structural features of the '<em>Loop Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP_CS_FEATURE_COUNT = CALL_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Loop Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP_CS_OPERATION_COUNT = CALL_EXP_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.IteratorExpCSImpl <em>Iterator Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.IteratorExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getIteratorExpCS()
	 * @generated
	 */
	int ITERATOR_EXP_CS = 59;

	/**
	 * The feature id for the '<em><b>Object Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP_CS__OBJECT_CALL = LOOP_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Simple Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP_CS__SIMPLE_CALL = LOOP_EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP_CS__ITERATOR = LOOP_EXP_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Varibles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP_CS__VARIBLES = LOOP_EXP_CS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP_CS__EXP = LOOP_EXP_CS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Iterator Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP_CS_FEATURE_COUNT = LOOP_EXP_CS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Iterator Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP_CS_OPERATION_COUNT = LOOP_EXP_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.EntityAttributeNameImpl <em>Entity Attribute Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.EntityAttributeNameImpl
	 * @see originreq.impl.OriginreqPackageImpl#getEntityAttributeName()
	 * @generated
	 */
	int ENTITY_ATTRIBUTE_NAME = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE_NAME__NAME = 0;

	/**
	 * The number of structural features of the '<em>Entity Attribute Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE_NAME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entity Attribute Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_ATTRIBUTE_NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.ArgumentsCSImpl <em>Arguments CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.ArgumentsCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getArgumentsCS()
	 * @generated
	 */
	int ARGUMENTS_CS = 61;

	/**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS_CS__FIRST = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS_CS__NEXT = 1;

	/**
	 * The number of structural features of the '<em>Arguments CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS_CS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Arguments CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTS_CS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.FeatureCallExpCSImpl <em>Feature Call Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.FeatureCallExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getFeatureCallExpCS()
	 * @generated
	 */
	int FEATURE_CALL_EXP_CS = 62;

	/**
	 * The number of structural features of the '<em>Feature Call Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXP_CS_FEATURE_COUNT = CALL_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feature Call Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXP_CS_OPERATION_COUNT = CALL_EXP_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.StandardNavigationCallExpCSImpl <em>Standard Navigation Call Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.StandardNavigationCallExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getStandardNavigationCallExpCS()
	 * @generated
	 */
	int STANDARD_NAVIGATION_CALL_EXP_CS = 63;

	/**
	 * The feature id for the '<em><b>Classifercall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NAVIGATION_CALL_EXP_CS__CLASSIFERCALL = FEATURE_CALL_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Propertycall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NAVIGATION_CALL_EXP_CS__PROPERTYCALL = FEATURE_CALL_EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NAVIGATION_CALL_EXP_CS__OBJECT = FEATURE_CALL_EXP_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Navop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NAVIGATION_CALL_EXP_CS__NAVOP = FEATURE_CALL_EXP_CS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Standard OP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NAVIGATION_CALL_EXP_CS__STANDARD_OP = FEATURE_CALL_EXP_CS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Standard Navigation Call Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NAVIGATION_CALL_EXP_CS_FEATURE_COUNT = FEATURE_CALL_EXP_CS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Standard Navigation Call Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NAVIGATION_CALL_EXP_CS_OPERATION_COUNT = FEATURE_CALL_EXP_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.StandardOperationExpCSImpl <em>Standard Operation Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.StandardOperationExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getStandardOperationExpCS()
	 * @generated
	 */
	int STANDARD_OPERATION_EXP_CS = 64;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_OPERATION_EXP_CS__OBJECT = FEATURE_CALL_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_OPERATION_EXP_CS__PROPERTY = FEATURE_CALL_EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Premark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_OPERATION_EXP_CS__PREMARK = FEATURE_CALL_EXP_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Predefinedop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_OPERATION_EXP_CS__PREDEFINEDOP = FEATURE_CALL_EXP_CS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Standard Operation Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_OPERATION_EXP_CS_FEATURE_COUNT = FEATURE_CALL_EXP_CS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Standard Operation Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_OPERATION_EXP_CS_OPERATION_COUNT = FEATURE_CALL_EXP_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.PredefineOpImpl <em>Predefine Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.PredefineOpImpl
	 * @see originreq.impl.OriginreqPackageImpl#getPredefineOp()
	 * @generated
	 */
	int PREDEFINE_OP = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINE_OP__NAME = 0;

	/**
	 * The number of structural features of the '<em>Predefine Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINE_OP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Predefine Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINE_OP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.StandardNoneParameterOperationImpl <em>Standard None Parameter Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.StandardNoneParameterOperationImpl
	 * @see originreq.impl.OriginreqPackageImpl#getStandardNoneParameterOperation()
	 * @generated
	 */
	int STANDARD_NONE_PARAMETER_OPERATION = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NONE_PARAMETER_OPERATION__NAME = PREDEFINE_OP__NAME;

	/**
	 * The number of structural features of the '<em>Standard None Parameter Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NONE_PARAMETER_OPERATION_FEATURE_COUNT = PREDEFINE_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Standard None Parameter Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NONE_PARAMETER_OPERATION_OPERATION_COUNT = PREDEFINE_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.StandardParameterOperationImpl <em>Standard Parameter Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.StandardParameterOperationImpl
	 * @see originreq.impl.OriginreqPackageImpl#getStandardParameterOperation()
	 * @generated
	 */
	int STANDARD_PARAMETER_OPERATION = 67;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_PARAMETER_OPERATION__NAME = PREDEFINE_OP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_PARAMETER_OPERATION__TYPE = PREDEFINE_OP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Standard Parameter Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_PARAMETER_OPERATION_FEATURE_COUNT = PREDEFINE_OP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Standard Parameter Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_PARAMETER_OPERATION_OPERATION_COUNT = PREDEFINE_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.StandardCollectionOperationImpl <em>Standard Collection Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.StandardCollectionOperationImpl
	 * @see originreq.impl.OriginreqPackageImpl#getStandardCollectionOperation()
	 * @generated
	 */
	int STANDARD_COLLECTION_OPERATION = 68;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_COLLECTION_OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_COLLECTION_OPERATION__OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Standard Collection Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_COLLECTION_OPERATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Standard Collection Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_COLLECTION_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.StandardDateOperationImpl <em>Standard Date Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.StandardDateOperationImpl
	 * @see originreq.impl.OriginreqPackageImpl#getStandardDateOperation()
	 * @generated
	 */
	int STANDARD_DATE_OPERATION = 69;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DATE_OPERATION__NAME = PREDEFINE_OP__NAME;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DATE_OPERATION__OBJECT = PREDEFINE_OP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datenum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DATE_OPERATION__DATENUM = PREDEFINE_OP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Procall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DATE_OPERATION__PROCALL = PREDEFINE_OP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DATE_OPERATION__NESTED = PREDEFINE_OP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Standard Date Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DATE_OPERATION_FEATURE_COUNT = PREDEFINE_OP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Standard Date Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DATE_OPERATION_OPERATION_COUNT = PREDEFINE_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.ClassiferCallExpCSImpl <em>Classifer Call Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.ClassiferCallExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getClassiferCallExpCS()
	 * @generated
	 */
	int CLASSIFER_CALL_EXP_CS = 70;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFER_CALL_EXP_CS__ENTITY = FEATURE_CALL_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFER_CALL_EXP_CS__OP = FEATURE_CALL_EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Classifer Call Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFER_CALL_EXP_CS_FEATURE_COUNT = FEATURE_CALL_EXP_CS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Classifer Call Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFER_CALL_EXP_CS_OPERATION_COUNT = FEATURE_CALL_EXP_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.PropertyCallExpCSImpl <em>Property Call Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.PropertyCallExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getPropertyCallExpCS()
	 * @generated
	 */
	int PROPERTY_CALL_EXP_CS = 71;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_CS__NAME = FEATURE_CALL_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selfproperty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_CS__SELFPROPERTY = FEATURE_CALL_EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_CS__ATTRIBUTE = FEATURE_CALL_EXP_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Premark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_CS__PREMARK = FEATURE_CALL_EXP_CS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Property Call Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_CS_FEATURE_COUNT = FEATURE_CALL_EXP_CS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Property Call Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_CS_OPERATION_COUNT = FEATURE_CALL_EXP_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.OperationCallExpCSImpl <em>Operation Call Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.OperationCallExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getOperationCallExpCS()
	 * @generated
	 */
	int OPERATION_CALL_EXP_CS = 72;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP_CS__NAME = FEATURE_CALL_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP_CS__PARAMETERS = FEATURE_CALL_EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Call Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP_CS_FEATURE_COUNT = FEATURE_CALL_EXP_CS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation Call Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP_CS_OPERATION_COUNT = FEATURE_CALL_EXP_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.OperationParametersImpl <em>Operation Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.OperationParametersImpl
	 * @see originreq.impl.OriginreqPackageImpl#getOperationParameters()
	 * @generated
	 */
	int OPERATION_PARAMETERS = 73;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETERS__OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Objectproperty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETERS__OBJECTPROPERTY = 1;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETERS__STRING = 2;

	/**
	 * The number of structural features of the '<em>Operation Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETERS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operation Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.VariableExpCSImpl <em>Variable Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.VariableExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getVariableExpCS()
	 * @generated
	 */
	int VARIABLE_EXP_CS = 74;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP_CS__SYMBOL = LEFT_SUB_ATOMIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP_CS_FEATURE_COUNT = LEFT_SUB_ATOMIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP_CS_OPERATION_COUNT = LEFT_SUB_ATOMIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.IfExpCSImpl <em>If Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.IfExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getIfExpCS()
	 * @generated
	 */
	int IF_EXP_CS = 75;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP_CS__CONDITION = OCL_EXPRESSION_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP_CS__THEN_EXPRESSION = OCL_EXPRESSION_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP_CS__ELSE_EXPRESSION = OCL_EXPRESSION_CS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP_CS_FEATURE_COUNT = OCL_EXPRESSION_CS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP_CS_OPERATION_COUNT = OCL_EXPRESSION_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.LetExpCSImpl <em>Let Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.LetExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getLetExpCS()
	 * @generated
	 */
	int LET_EXP_CS = 76;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP_CS__VARIABLE = OCL_EXPRESSION_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP_CS__IN_EXPRESSION = OCL_EXPRESSION_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Let Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP_CS_FEATURE_COUNT = OCL_EXPRESSION_CS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Let Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP_CS_OPERATION_COUNT = OCL_EXPRESSION_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.VariableDeclarationCSImpl <em>Variable Declaration CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.VariableDeclarationCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getVariableDeclarationCS()
	 * @generated
	 */
	int VARIABLE_DECLARATION_CS = 77;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_CS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_CS__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_CS__INIT_EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>Variable Declaration CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_CS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variable Declaration CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_CS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.LiteralExpCSImpl <em>Literal Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.LiteralExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getLiteralExpCS()
	 * @generated
	 */
	int LITERAL_EXP_CS = 78;

	/**
	 * The number of structural features of the '<em>Literal Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXP_CS_FEATURE_COUNT = OCL_EXPRESSION_CS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXP_CS_OPERATION_COUNT = OCL_EXPRESSION_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.EnumLiteralExpCSImpl <em>Enum Literal Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.EnumLiteralExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getEnumLiteralExpCS()
	 * @generated
	 */
	int ENUM_LITERAL_EXP_CS = 79;

	/**
	 * The feature id for the '<em><b>Enumname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP_CS__ENUMNAME = LITERAL_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Eunmitem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP_CS__EUNMITEM = LITERAL_EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum Literal Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP_CS_FEATURE_COUNT = LITERAL_EXP_CS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enum Literal Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP_CS_OPERATION_COUNT = LITERAL_EXP_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.TupleLiteralExpCSImpl <em>Tuple Literal Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.TupleLiteralExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getTupleLiteralExpCS()
	 * @generated
	 */
	int TUPLE_LITERAL_EXP_CS = 80;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_LITERAL_EXP_CS__NAME = LITERAL_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_LITERAL_EXP_CS__VARIABLES = LITERAL_EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tuple Literal Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_LITERAL_EXP_CS_FEATURE_COUNT = LITERAL_EXP_CS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tuple Literal Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_LITERAL_EXP_CS_OPERATION_COUNT = LITERAL_EXP_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.TupleTypeCSImpl <em>Tuple Type CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.TupleTypeCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getTupleTypeCS()
	 * @generated
	 */
	int TUPLE_TYPE_CS = 81;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_CS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_CS__VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>Tuple Type CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_CS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tuple Type CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_CS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.CollectionTypeCSImpl <em>Collection Type CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.CollectionTypeCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getCollectionTypeCS()
	 * @generated
	 */
	int COLLECTION_TYPE_CS = 82;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_CS__NAME = TYPE_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_CS__TYPE = TYPE_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collection Type CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_CS_FEATURE_COUNT = TYPE_CS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Collection Type CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_CS_OPERATION_COUNT = TYPE_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.CollectionLiteralExpCSImpl <em>Collection Literal Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.CollectionLiteralExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getCollectionLiteralExpCS()
	 * @generated
	 */
	int COLLECTION_LITERAL_EXP_CS = 83;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL_EXP_CS__KIND = LITERAL_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL_EXP_CS__PART = LITERAL_EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collection Literal Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL_EXP_CS_FEATURE_COUNT = LITERAL_EXP_CS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Collection Literal Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL_EXP_CS_OPERATION_COUNT = LITERAL_EXP_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.CollectionLiteralPartCSImpl <em>Collection Literal Part CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.CollectionLiteralPartCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getCollectionLiteralPartCS()
	 * @generated
	 */
	int COLLECTION_LITERAL_PART_CS = 84;

	/**
	 * The number of structural features of the '<em>Collection Literal Part CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL_PART_CS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Collection Literal Part CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_LITERAL_PART_CS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.CollectionRangeCSImpl <em>Collection Range CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.CollectionRangeCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getCollectionRangeCS()
	 * @generated
	 */
	int COLLECTION_RANGE_CS = 85;

	/**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RANGE_CS__FIRST = COLLECTION_LITERAL_PART_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RANGE_CS__LAST = COLLECTION_LITERAL_PART_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collection Range CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RANGE_CS_FEATURE_COUNT = COLLECTION_LITERAL_PART_CS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Collection Range CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RANGE_CS_OPERATION_COUNT = COLLECTION_LITERAL_PART_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.CollectionItemImpl <em>Collection Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.CollectionItemImpl
	 * @see originreq.impl.OriginreqPackageImpl#getCollectionItem()
	 * @generated
	 */
	int COLLECTION_ITEM = 86;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITEM__ITEM = COLLECTION_LITERAL_PART_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITEM_FEATURE_COUNT = COLLECTION_LITERAL_PART_CS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Collection Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITEM_OPERATION_COUNT = COLLECTION_LITERAL_PART_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.PrimitiveLiteralExpCSImpl <em>Primitive Literal Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.PrimitiveLiteralExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getPrimitiveLiteralExpCS()
	 * @generated
	 */
	int PRIMITIVE_LITERAL_EXP_CS = 87;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LITERAL_EXP_CS__SYMBOL = LITERAL_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Literal Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LITERAL_EXP_CS_FEATURE_COUNT = LITERAL_EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Literal Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LITERAL_EXP_CS_OPERATION_COUNT = LITERAL_EXP_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.NumberLiteralExpCSImpl <em>Number Literal Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.NumberLiteralExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getNumberLiteralExpCS()
	 * @generated
	 */
	int NUMBER_LITERAL_EXP_CS = 88;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_EXP_CS__SYMBOL = PRIMITIVE_LITERAL_EXP_CS__SYMBOL;

	/**
	 * The number of structural features of the '<em>Number Literal Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_EXP_CS_FEATURE_COUNT = PRIMITIVE_LITERAL_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Literal Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_EXP_CS_OPERATION_COUNT = PRIMITIVE_LITERAL_EXP_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.BooleanLiteralExpCSImpl <em>Boolean Literal Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.BooleanLiteralExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getBooleanLiteralExpCS()
	 * @generated
	 */
	int BOOLEAN_LITERAL_EXP_CS = 89;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP_CS__SYMBOL = PRIMITIVE_LITERAL_EXP_CS__SYMBOL;

	/**
	 * The number of structural features of the '<em>Boolean Literal Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP_CS_FEATURE_COUNT = PRIMITIVE_LITERAL_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Literal Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP_CS_OPERATION_COUNT = PRIMITIVE_LITERAL_EXP_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.StringLiteralExpCSImpl <em>String Literal Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.StringLiteralExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getStringLiteralExpCS()
	 * @generated
	 */
	int STRING_LITERAL_EXP_CS = 90;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP_CS__SYMBOL = PRIMITIVE_LITERAL_EXP_CS__SYMBOL;

	/**
	 * The number of structural features of the '<em>String Literal Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP_CS_FEATURE_COUNT = PRIMITIVE_LITERAL_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Literal Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP_CS_OPERATION_COUNT = PRIMITIVE_LITERAL_EXP_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.NullLiteralExpCSImpl <em>Null Literal Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.NullLiteralExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getNullLiteralExpCS()
	 * @generated
	 */
	int NULL_LITERAL_EXP_CS = 91;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_EXP_CS__SYMBOL = PRIMITIVE_LITERAL_EXP_CS__SYMBOL;

	/**
	 * The number of structural features of the '<em>Null Literal Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_EXP_CS_FEATURE_COUNT = PRIMITIVE_LITERAL_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Null Literal Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_EXP_CS_OPERATION_COUNT = PRIMITIVE_LITERAL_EXP_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.InvalidLiteralExpCSImpl <em>Invalid Literal Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.InvalidLiteralExpCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getInvalidLiteralExpCS()
	 * @generated
	 */
	int INVALID_LITERAL_EXP_CS = 92;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_LITERAL_EXP_CS__SYMBOL = PRIMITIVE_LITERAL_EXP_CS__SYMBOL;

	/**
	 * The number of structural features of the '<em>Invalid Literal Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_LITERAL_EXP_CS_FEATURE_COUNT = PRIMITIVE_LITERAL_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Invalid Literal Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_LITERAL_EXP_CS_OPERATION_COUNT = PRIMITIVE_LITERAL_EXP_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.ReservedKeywordCSImpl <em>Reserved Keyword CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.ReservedKeywordCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getReservedKeywordCS()
	 * @generated
	 */
	int RESERVED_KEYWORD_CS = 93;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVED_KEYWORD_CS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Reserved Keyword CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVED_KEYWORD_CS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reserved Keyword CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVED_KEYWORD_CS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link originreq.impl.CollectionTypeIdentifierCSImpl <em>Collection Type Identifier CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.CollectionTypeIdentifierCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getCollectionTypeIdentifierCS()
	 * @generated
	 */
	int COLLECTION_TYPE_IDENTIFIER_CS = 94;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_IDENTIFIER_CS__NAME = RESERVED_KEYWORD_CS__NAME;

	/**
	 * The number of structural features of the '<em>Collection Type Identifier CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_IDENTIFIER_CS_FEATURE_COUNT = RESERVED_KEYWORD_CS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Collection Type Identifier CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_IDENTIFIER_CS_OPERATION_COUNT = RESERVED_KEYWORD_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.PrimitiveTypeCSImpl <em>Primitive Type CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.PrimitiveTypeCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getPrimitiveTypeCS()
	 * @generated
	 */
	int PRIMITIVE_TYPE_CS = 95;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CS__NAME = TYPE_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CS_FEATURE_COUNT = TYPE_CS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Type CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CS_OPERATION_COUNT = TYPE_CS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link originreq.impl.OclTypeCSImpl <em>Ocl Type CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see originreq.impl.OclTypeCSImpl
	 * @see originreq.impl.OriginreqPackageImpl#getOclTypeCS()
	 * @generated
	 */
	int OCL_TYPE_CS = 96;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE_CS__NAME = RESERVED_KEYWORD_CS__NAME;

	/**
	 * The number of structural features of the '<em>Ocl Type CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE_CS_FEATURE_COUNT = RESERVED_KEYWORD_CS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ocl Type CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE_CS_OPERATION_COUNT = RESERVED_KEYWORD_CS_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link originreq.RequirementModel <em>Requirement Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Model</em>'.
	 * @see originreq.RequirementModel
	 * @generated
	 */
	EClass getRequirementModel();

	/**
	 * Returns the meta object for the attribute '{@link originreq.RequirementModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.RequirementModel#getName()
	 * @see #getRequirementModel()
	 * @generated
	 */
	EAttribute getRequirementModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link originreq.RequirementModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see originreq.RequirementModel#getDescription()
	 * @see #getRequirementModel()
	 * @generated
	 */
	EAttribute getRequirementModel_Description();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.RequirementModel#getUseCaseModel <em>Use Case Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use Case Model</em>'.
	 * @see originreq.RequirementModel#getUseCaseModel()
	 * @see #getRequirementModel()
	 * @generated
	 */
	EReference getRequirementModel_UseCaseModel();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.RequirementModel#getDomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Model</em>'.
	 * @see originreq.RequirementModel#getDomainModel()
	 * @see #getRequirementModel()
	 * @generated
	 */
	EReference getRequirementModel_DomainModel();

	/**
	 * Returns the meta object for class '{@link originreq.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see originreq.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for the attribute '{@link originreq.Interaction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.Interaction#getName()
	 * @see #getInteraction()
	 * @generated
	 */
	EAttribute getInteraction_Name();

	/**
	 * Returns the meta object for the reference list '{@link originreq.Interaction#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participants</em>'.
	 * @see originreq.Interaction#getParticipants()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Participants();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.Interaction#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see originreq.Interaction#getMessages()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Messages();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.Interaction#getExecutions <em>Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executions</em>'.
	 * @see originreq.Interaction#getExecutions()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Executions();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.Interaction#getCombinedFragments <em>Combined Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Combined Fragments</em>'.
	 * @see originreq.Interaction#getCombinedFragments()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_CombinedFragments();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.Interaction#getEnds <em>Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ends</em>'.
	 * @see originreq.Interaction#getEnds()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Ends();

	/**
	 * Returns the meta object for class '{@link originreq.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see originreq.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link originreq.Message#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.Message#getName()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Name();

	/**
	 * Returns the meta object for the reference '{@link originreq.Message#getSendingEnd <em>Sending End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sending End</em>'.
	 * @see originreq.Message#getSendingEnd()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_SendingEnd();

	/**
	 * Returns the meta object for the reference '{@link originreq.Message#getReceivingEnd <em>Receiving End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiving End</em>'.
	 * @see originreq.Message#getReceivingEnd()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_ReceivingEnd();

	/**
	 * Returns the meta object for class '{@link originreq.CallMessage <em>Call Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Message</em>'.
	 * @see originreq.CallMessage
	 * @generated
	 */
	EClass getCallMessage();

	/**
	 * Returns the meta object for the reference '{@link originreq.CallMessage#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see originreq.CallMessage#getOp()
	 * @see #getCallMessage()
	 * @generated
	 */
	EReference getCallMessage_Op();

	/**
	 * Returns the meta object for class '{@link originreq.ReturnMessage <em>Return Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Message</em>'.
	 * @see originreq.ReturnMessage
	 * @generated
	 */
	EClass getReturnMessage();

	/**
	 * Returns the meta object for the reference '{@link originreq.ReturnMessage#getInvocationMessage <em>Invocation Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invocation Message</em>'.
	 * @see originreq.ReturnMessage#getInvocationMessage()
	 * @see #getReturnMessage()
	 * @generated
	 */
	EReference getReturnMessage_InvocationMessage();

	/**
	 * Returns the meta object for class '{@link originreq.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution</em>'.
	 * @see originreq.Execution
	 * @generated
	 */
	EClass getExecution();

	/**
	 * Returns the meta object for the reference '{@link originreq.Execution#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see originreq.Execution#getOwner()
	 * @see #getExecution()
	 * @generated
	 */
	EReference getExecution_Owner();

	/**
	 * Returns the meta object for the reference '{@link originreq.Execution#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see originreq.Execution#getStart()
	 * @see #getExecution()
	 * @generated
	 */
	EReference getExecution_Start();

	/**
	 * Returns the meta object for the reference '{@link originreq.Execution#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see originreq.Execution#getEnd()
	 * @see #getExecution()
	 * @generated
	 */
	EReference getExecution_End();

	/**
	 * Returns the meta object for class '{@link originreq.CombinedFragment <em>Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combined Fragment</em>'.
	 * @see originreq.CombinedFragment
	 * @generated
	 */
	EClass getCombinedFragment();

	/**
	 * Returns the meta object for the attribute '{@link originreq.CombinedFragment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.CombinedFragment#getName()
	 * @see #getCombinedFragment()
	 * @generated
	 */
	EAttribute getCombinedFragment_Name();

	/**
	 * Returns the meta object for the attribute '{@link originreq.CombinedFragment#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see originreq.CombinedFragment#getOperator()
	 * @see #getCombinedFragment()
	 * @generated
	 */
	EAttribute getCombinedFragment_Operator();

	/**
	 * Returns the meta object for the reference list '{@link originreq.CombinedFragment#getCoveredParticipants <em>Covered Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Covered Participants</em>'.
	 * @see originreq.CombinedFragment#getCoveredParticipants()
	 * @see #getCombinedFragment()
	 * @generated
	 */
	EReference getCombinedFragment_CoveredParticipants();

	/**
	 * Returns the meta object for the reference '{@link originreq.CombinedFragment#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see originreq.CombinedFragment#getStart()
	 * @see #getCombinedFragment()
	 * @generated
	 */
	EReference getCombinedFragment_Start();

	/**
	 * Returns the meta object for the reference '{@link originreq.CombinedFragment#getFinish <em>Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Finish</em>'.
	 * @see originreq.CombinedFragment#getFinish()
	 * @see #getCombinedFragment()
	 * @generated
	 */
	EReference getCombinedFragment_Finish();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.CombinedFragment#getOwnedOperands <em>Owned Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Operands</em>'.
	 * @see originreq.CombinedFragment#getOwnedOperands()
	 * @see #getCombinedFragment()
	 * @generated
	 */
	EReference getCombinedFragment_OwnedOperands();

	/**
	 * Returns the meta object for class '{@link originreq.Operand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand</em>'.
	 * @see originreq.Operand
	 * @generated
	 */
	EClass getOperand();

	/**
	 * Returns the meta object for the attribute '{@link originreq.Operand#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.Operand#getName()
	 * @see #getOperand()
	 * @generated
	 */
	EAttribute getOperand_Name();

	/**
	 * Returns the meta object for the reference '{@link originreq.Operand#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see originreq.Operand#getStart()
	 * @see #getOperand()
	 * @generated
	 */
	EReference getOperand_Start();

	/**
	 * Returns the meta object for the reference '{@link originreq.Operand#getFinish <em>Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Finish</em>'.
	 * @see originreq.Operand#getFinish()
	 * @see #getOperand()
	 * @generated
	 */
	EReference getOperand_Finish();

	/**
	 * Returns the meta object for class '{@link originreq.AbstractEnd <em>Abstract End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract End</em>'.
	 * @see originreq.AbstractEnd
	 * @generated
	 */
	EClass getAbstractEnd();

	/**
	 * Returns the meta object for the attribute '{@link originreq.AbstractEnd#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.AbstractEnd#getName()
	 * @see #getAbstractEnd()
	 * @generated
	 */
	EAttribute getAbstractEnd_Name();

	/**
	 * Returns the meta object for class '{@link originreq.MixEnd <em>Mix End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mix End</em>'.
	 * @see originreq.MixEnd
	 * @generated
	 */
	EClass getMixEnd();

	/**
	 * Returns the meta object for the reference '{@link originreq.MixEnd#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see originreq.MixEnd#getContext()
	 * @see #getMixEnd()
	 * @generated
	 */
	EReference getMixEnd_Context();

	/**
	 * Returns the meta object for class '{@link originreq.MixOpAndCFEnd <em>Mix Op And CF End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mix Op And CF End</em>'.
	 * @see originreq.MixOpAndCFEnd
	 * @generated
	 */
	EClass getMixOpAndCFEnd();

	/**
	 * Returns the meta object for class '{@link originreq.MessageEnd <em>Message End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message End</em>'.
	 * @see originreq.MessageEnd
	 * @generated
	 */
	EClass getMessageEnd();

	/**
	 * Returns the meta object for the reference '{@link originreq.MessageEnd#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see originreq.MessageEnd#getMessage()
	 * @see #getMessageEnd()
	 * @generated
	 */
	EReference getMessageEnd_Message();

	/**
	 * Returns the meta object for class '{@link originreq.MultiEnd <em>Multi End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi End</em>'.
	 * @see originreq.MultiEnd
	 * @generated
	 */
	EClass getMultiEnd();

	/**
	 * Returns the meta object for the attribute '{@link originreq.MultiEnd#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.MultiEnd#getName()
	 * @see #getMultiEnd()
	 * @generated
	 */
	EAttribute getMultiEnd_Name();

	/**
	 * Returns the meta object for class '{@link originreq.ExecutionEnd <em>Execution End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution End</em>'.
	 * @see originreq.ExecutionEnd
	 * @generated
	 */
	EClass getExecutionEnd();

	/**
	 * Returns the meta object for the reference '{@link originreq.ExecutionEnd#getExecution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Execution</em>'.
	 * @see originreq.ExecutionEnd#getExecution()
	 * @see #getExecutionEnd()
	 * @generated
	 */
	EReference getExecutionEnd_Execution();

	/**
	 * Returns the meta object for class '{@link originreq.CombinedFragmentEnd <em>Combined Fragment End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combined Fragment End</em>'.
	 * @see originreq.CombinedFragmentEnd
	 * @generated
	 */
	EClass getCombinedFragmentEnd();

	/**
	 * Returns the meta object for the reference '{@link originreq.CombinedFragmentEnd#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see originreq.CombinedFragmentEnd#getOwner()
	 * @see #getCombinedFragmentEnd()
	 * @generated
	 */
	EReference getCombinedFragmentEnd_Owner();

	/**
	 * Returns the meta object for class '{@link originreq.OperandEnd <em>Operand End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand End</em>'.
	 * @see originreq.OperandEnd
	 * @generated
	 */
	EClass getOperandEnd();

	/**
	 * Returns the meta object for the reference '{@link originreq.OperandEnd#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see originreq.OperandEnd#getOwner()
	 * @see #getOperandEnd()
	 * @generated
	 */
	EReference getOperandEnd_Owner();

	/**
	 * Returns the meta object for class '{@link originreq.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Model</em>'.
	 * @see originreq.DomainModel
	 * @generated
	 */
	EClass getDomainModel();

	/**
	 * Returns the meta object for the attribute '{@link originreq.DomainModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.DomainModel#getName()
	 * @see #getDomainModel()
	 * @generated
	 */
	EAttribute getDomainModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link originreq.DomainModel#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see originreq.DomainModel#getLabel()
	 * @see #getDomainModel()
	 * @generated
	 */
	EAttribute getDomainModel_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.DomainModel#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see originreq.DomainModel#getEntity()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_Entity();

	/**
	 * Returns the meta object for class '{@link originreq.UseCaseModel <em>Use Case Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Case Model</em>'.
	 * @see originreq.UseCaseModel
	 * @generated
	 */
	EClass getUseCaseModel();

	/**
	 * Returns the meta object for the attribute '{@link originreq.UseCaseModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.UseCaseModel#getName()
	 * @see #getUseCaseModel()
	 * @generated
	 */
	EAttribute getUseCaseModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link originreq.UseCaseModel#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see originreq.UseCaseModel#getLabel()
	 * @see #getUseCaseModel()
	 * @generated
	 */
	EAttribute getUseCaseModel_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.UseCaseModel#getUc <em>Uc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uc</em>'.
	 * @see originreq.UseCaseModel#getUc()
	 * @see #getUseCaseModel()
	 * @generated
	 */
	EReference getUseCaseModel_Uc();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.UseCaseModel#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor</em>'.
	 * @see originreq.UseCaseModel#getActor()
	 * @see #getUseCaseModel()
	 * @generated
	 */
	EReference getUseCaseModel_Actor();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.UseCaseModel#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction</em>'.
	 * @see originreq.UseCaseModel#getInteraction()
	 * @see #getUseCaseModel()
	 * @generated
	 */
	EReference getUseCaseModel_Interaction();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.UseCaseModel#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see originreq.UseCaseModel#getService()
	 * @see #getUseCaseModel()
	 * @generated
	 */
	EReference getUseCaseModel_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.UseCaseModel#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contract</em>'.
	 * @see originreq.UseCaseModel#getContract()
	 * @see #getUseCaseModel()
	 * @generated
	 */
	EReference getUseCaseModel_Contract();

	/**
	 * Returns the meta object for class '{@link originreq.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see originreq.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link originreq.Actor#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see originreq.Actor#getLabel()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Label();

	/**
	 * Returns the meta object for the reference '{@link originreq.Actor#getSuperActor <em>Super Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Actor</em>'.
	 * @see originreq.Actor#getSuperActor()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_SuperActor();

	/**
	 * Returns the meta object for the reference list '{@link originreq.Actor#getUc <em>Uc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uc</em>'.
	 * @see originreq.Actor#getUc()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Uc();

	/**
	 * Returns the meta object for class '{@link originreq.UC <em>UC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC</em>'.
	 * @see originreq.UC
	 * @generated
	 */
	EClass getUC();

	/**
	 * Returns the meta object for the attribute '{@link originreq.UC#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.UC#getName()
	 * @see #getUC()
	 * @generated
	 */
	EAttribute getUC_Name();

	/**
	 * Returns the meta object for the attribute '{@link originreq.UC#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see originreq.UC#getLabel()
	 * @see #getUC()
	 * @generated
	 */
	EAttribute getUC_Label();

	/**
	 * Returns the meta object for the attribute '{@link originreq.UC#getUCRelation <em>UC Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UC Relation</em>'.
	 * @see originreq.UC#getUCRelation()
	 * @see #getUC()
	 * @generated
	 */
	EAttribute getUC_UCRelation();

	/**
	 * Returns the meta object for the reference list '{@link originreq.UC#getRelateduc <em>Relateduc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relateduc</em>'.
	 * @see originreq.UC#getRelateduc()
	 * @see #getUC()
	 * @generated
	 */
	EReference getUC_Relateduc();

	/**
	 * Returns the meta object for the reference list '{@link originreq.UC#getSsd <em>Ssd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ssd</em>'.
	 * @see originreq.UC#getSsd()
	 * @see #getUC()
	 * @generated
	 */
	EReference getUC_Ssd();

	/**
	 * Returns the meta object for the reference list '{@link originreq.UC#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service</em>'.
	 * @see originreq.UC#getService()
	 * @see #getUC()
	 * @generated
	 */
	EReference getUC_Service();

	/**
	 * Returns the meta object for the attribute '{@link originreq.UC#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see originreq.UC#getDescription()
	 * @see #getUC()
	 * @generated
	 */
	EAttribute getUC_Description();

	/**
	 * Returns the meta object for class '{@link originreq.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see originreq.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.Service#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see originreq.Service#getOperation()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.Service#getTemp_property <em>Temp property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Temp property</em>'.
	 * @see originreq.Service#getTemp_property()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Temp_property();

	/**
	 * Returns the meta object for the reference list '{@link originreq.Service#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Workflow</em>'.
	 * @see originreq.Service#getWorkflow()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Workflow();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.Service#getInvariance <em>Invariance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invariance</em>'.
	 * @see originreq.Service#getInvariance()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Invariance();

	/**
	 * Returns the meta object for class '{@link originreq.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see originreq.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the attribute '{@link originreq.Participant#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see originreq.Participant#getDescription()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Description();

	/**
	 * Returns the meta object for class '{@link originreq.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see originreq.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the attribute '{@link originreq.Workflow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.Workflow#getName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Name();

	/**
	 * Returns the meta object for the reference list '{@link originreq.Workflow#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participants</em>'.
	 * @see originreq.Workflow#getParticipants()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Participants();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.Workflow#getPartitions <em>Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partitions</em>'.
	 * @see originreq.Workflow#getPartitions()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Partitions();

	/**
	 * Returns the meta object for class '{@link originreq.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition</em>'.
	 * @see originreq.Partition
	 * @generated
	 */
	EClass getPartition();

	/**
	 * Returns the meta object for the reference '{@link originreq.Partition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see originreq.Partition#getName()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.Partition#getExps <em>Exps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exps</em>'.
	 * @see originreq.Partition#getExps()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_Exps();

	/**
	 * Returns the meta object for class '{@link originreq.WorkflowExp <em>Workflow Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Exp</em>'.
	 * @see originreq.WorkflowExp
	 * @generated
	 */
	EClass getWorkflowExp();

	/**
	 * Returns the meta object for class '{@link originreq.PartitionAction <em>Partition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition Action</em>'.
	 * @see originreq.PartitionAction
	 * @generated
	 */
	EClass getPartitionAction();

	/**
	 * Returns the meta object for the reference '{@link originreq.PartitionAction#getPatition <em>Patition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Patition</em>'.
	 * @see originreq.PartitionAction#getPatition()
	 * @see #getPartitionAction()
	 * @generated
	 */
	EReference getPartitionAction_Patition();

	/**
	 * Returns the meta object for the reference '{@link originreq.PartitionAction#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see originreq.PartitionAction#getAction()
	 * @see #getPartitionAction()
	 * @generated
	 */
	EReference getPartitionAction_Action();

	/**
	 * Returns the meta object for class '{@link originreq.JoinExp <em>Join Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Exp</em>'.
	 * @see originreq.JoinExp
	 * @generated
	 */
	EClass getJoinExp();

	/**
	 * Returns the meta object for class '{@link originreq.ActivityFinal <em>Activity Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Final</em>'.
	 * @see originreq.ActivityFinal
	 * @generated
	 */
	EClass getActivityFinal();

	/**
	 * Returns the meta object for the attribute '{@link originreq.ActivityFinal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.ActivityFinal#getName()
	 * @see #getActivityFinal()
	 * @generated
	 */
	EAttribute getActivityFinal_Name();

	/**
	 * Returns the meta object for class '{@link originreq.InitalNode <em>Inital Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inital Node</em>'.
	 * @see originreq.InitalNode
	 * @generated
	 */
	EClass getInitalNode();

	/**
	 * Returns the meta object for the attribute '{@link originreq.InitalNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.InitalNode#getName()
	 * @see #getInitalNode()
	 * @generated
	 */
	EAttribute getInitalNode_Name();

	/**
	 * Returns the meta object for class '{@link originreq.ForkNode <em>Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node</em>'.
	 * @see originreq.ForkNode
	 * @generated
	 */
	EClass getForkNode();

	/**
	 * Returns the meta object for the reference list '{@link originreq.ForkNode#getStartlinks <em>Startlinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Startlinks</em>'.
	 * @see originreq.ForkNode#getStartlinks()
	 * @see #getForkNode()
	 * @generated
	 */
	EReference getForkNode_Startlinks();

	/**
	 * Returns the meta object for class '{@link originreq.JoinNode <em>Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node</em>'.
	 * @see originreq.JoinNode
	 * @generated
	 */
	EClass getJoinNode();

	/**
	 * Returns the meta object for the reference list '{@link originreq.JoinNode#getEndlinks <em>Endlinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Endlinks</em>'.
	 * @see originreq.JoinNode#getEndlinks()
	 * @see #getJoinNode()
	 * @generated
	 */
	EReference getJoinNode_Endlinks();

	/**
	 * Returns the meta object for class '{@link originreq.ComplexOpeartion <em>Complex Opeartion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Opeartion</em>'.
	 * @see originreq.ComplexOpeartion
	 * @generated
	 */
	EClass getComplexOpeartion();

	/**
	 * Returns the meta object for class '{@link originreq.SimpleOperation <em>Simple Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Operation</em>'.
	 * @see originreq.SimpleOperation
	 * @generated
	 */
	EClass getSimpleOperation();

	/**
	 * Returns the meta object for the reference '{@link originreq.SimpleOperation#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see originreq.SimpleOperation#getRef()
	 * @see #getSimpleOperation()
	 * @generated
	 */
	EReference getSimpleOperation_Ref();

	/**
	 * Returns the meta object for class '{@link originreq.LoopExp <em>Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Exp</em>'.
	 * @see originreq.LoopExp
	 * @generated
	 */
	EClass getLoopExp();

	/**
	 * Returns the meta object for the attribute '{@link originreq.LoopExp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.LoopExp#getName()
	 * @see #getLoopExp()
	 * @generated
	 */
	EAttribute getLoopExp_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.LoopExp#getExps <em>Exps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exps</em>'.
	 * @see originreq.LoopExp#getExps()
	 * @see #getLoopExp()
	 * @generated
	 */
	EReference getLoopExp_Exps();

	/**
	 * Returns the meta object for class '{@link originreq.SwitchExp <em>Switch Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Exp</em>'.
	 * @see originreq.SwitchExp
	 * @generated
	 */
	EClass getSwitchExp();

	/**
	 * Returns the meta object for the attribute '{@link originreq.SwitchExp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.SwitchExp#getName()
	 * @see #getSwitchExp()
	 * @generated
	 */
	EAttribute getSwitchExp_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.SwitchExp#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see originreq.SwitchExp#getCases()
	 * @see #getSwitchExp()
	 * @generated
	 */
	EReference getSwitchExp_Cases();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.SwitchExp#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see originreq.SwitchExp#getDefault()
	 * @see #getSwitchExp()
	 * @generated
	 */
	EReference getSwitchExp_Default();

	/**
	 * Returns the meta object for class '{@link originreq.SwitchCase <em>Switch Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Case</em>'.
	 * @see originreq.SwitchCase
	 * @generated
	 */
	EClass getSwitchCase();

	/**
	 * Returns the meta object for the attribute '{@link originreq.SwitchCase#getCaseValue <em>Case Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Value</em>'.
	 * @see originreq.SwitchCase#getCaseValue()
	 * @see #getSwitchCase()
	 * @generated
	 */
	EAttribute getSwitchCase_CaseValue();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.SwitchCase#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see originreq.SwitchCase#getOp()
	 * @see #getSwitchCase()
	 * @generated
	 */
	EReference getSwitchCase_Op();

	/**
	 * Returns the meta object for class '{@link originreq.SwitchDefault <em>Switch Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Default</em>'.
	 * @see originreq.SwitchDefault
	 * @generated
	 */
	EClass getSwitchDefault();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.SwitchDefault#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see originreq.SwitchDefault#getOp()
	 * @see #getSwitchDefault()
	 * @generated
	 */
	EReference getSwitchDefault_Op();

	/**
	 * Returns the meta object for class '{@link originreq.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see originreq.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link originreq.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.Operation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see originreq.Operation#getParameter()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.Operation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see originreq.Operation#getReturnType()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ReturnType();

	/**
	 * Returns the meta object for class '{@link originreq.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see originreq.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link originreq.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see originreq.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for class '{@link originreq.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see originreq.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link originreq.Entity#isIsCRUD <em>Is CRUD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is CRUD</em>'.
	 * @see originreq.Entity#isIsCRUD()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_IsCRUD();

	/**
	 * Returns the meta object for the attribute '{@link originreq.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the reference '{@link originreq.Entity#getSuperEntity <em>Super Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Entity</em>'.
	 * @see originreq.Entity#getSuperEntity()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_SuperEntity();

	/**
	 * Returns the meta object for the attribute '{@link originreq.Entity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see originreq.Entity#getDescription()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see originreq.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.Entity#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see originreq.Entity#getReference()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.Entity#getInvariance <em>Invariance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invariance</em>'.
	 * @see originreq.Entity#getInvariance()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Invariance();

	/**
	 * Returns the meta object for class '{@link originreq.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see originreq.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link originreq.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see originreq.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link originreq.Attribute#isIsmultiple <em>Ismultiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ismultiple</em>'.
	 * @see originreq.Attribute#isIsmultiple()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Ismultiple();

	/**
	 * Returns the meta object for class '{@link originreq.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see originreq.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link originreq.Reference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.Reference#getName()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Name();

	/**
	 * Returns the meta object for the reference '{@link originreq.Reference#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see originreq.Reference#getEntity()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Entity();

	/**
	 * Returns the meta object for the attribute '{@link originreq.Reference#isIsmultiple <em>Ismultiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ismultiple</em>'.
	 * @see originreq.Reference#isIsmultiple()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Ismultiple();

	/**
	 * Returns the meta object for the attribute '{@link originreq.Reference#isIsReverseAssoication <em>Is Reverse Assoication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Reverse Assoication</em>'.
	 * @see originreq.Reference#isIsReverseAssoication()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_IsReverseAssoication();

	/**
	 * Returns the meta object for the attribute '{@link originreq.Reference#isIsAggregation <em>Is Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Aggregation</em>'.
	 * @see originreq.Reference#isIsAggregation()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_IsAggregation();

	/**
	 * Returns the meta object for the attribute '{@link originreq.Reference#isIsComposition <em>Is Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Composition</em>'.
	 * @see originreq.Reference#isIsComposition()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_IsComposition();

	/**
	 * Returns the meta object for the attribute '{@link originreq.Reference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see originreq.Reference#getType()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Type();

	/**
	 * Returns the meta object for class '{@link originreq.TypeCS <em>Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type CS</em>'.
	 * @see originreq.TypeCS
	 * @generated
	 */
	EClass getTypeCS();

	/**
	 * Returns the meta object for class '{@link originreq.Invariance <em>Invariance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invariance</em>'.
	 * @see originreq.Invariance
	 * @generated
	 */
	EClass getInvariance();

	/**
	 * Returns the meta object for the attribute '{@link originreq.Invariance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.Invariance#getName()
	 * @see #getInvariance()
	 * @generated
	 */
	EAttribute getInvariance_Name();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.Invariance#getOcl <em>Ocl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ocl</em>'.
	 * @see originreq.Invariance#getOcl()
	 * @see #getInvariance()
	 * @generated
	 */
	EReference getInvariance_Ocl();

	/**
	 * Returns the meta object for the attribute '{@link originreq.Invariance#isIsForAssociation <em>Is For Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is For Association</em>'.
	 * @see originreq.Invariance#isIsForAssociation()
	 * @see #getInvariance()
	 * @generated
	 */
	EAttribute getInvariance_IsForAssociation();

	/**
	 * Returns the meta object for class '{@link originreq.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Type</em>'.
	 * @see originreq.EntityType
	 * @generated
	 */
	EClass getEntityType();

	/**
	 * Returns the meta object for the reference '{@link originreq.EntityType#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see originreq.EntityType#getEntity()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Entity();

	/**
	 * Returns the meta object for class '{@link originreq.EnumEntity <em>Enum Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Entity</em>'.
	 * @see originreq.EnumEntity
	 * @generated
	 */
	EClass getEnumEntity();

	/**
	 * Returns the meta object for the attribute '{@link originreq.EnumEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.EnumEntity#getName()
	 * @see #getEnumEntity()
	 * @generated
	 */
	EAttribute getEnumEntity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.EnumEntity#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see originreq.EnumEntity#getElement()
	 * @see #getEnumEntity()
	 * @generated
	 */
	EReference getEnumEntity_Element();

	/**
	 * Returns the meta object for class '{@link originreq.EnumItem <em>Enum Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Item</em>'.
	 * @see originreq.EnumItem
	 * @generated
	 */
	EClass getEnumItem();

	/**
	 * Returns the meta object for the attribute '{@link originreq.EnumItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.EnumItem#getName()
	 * @see #getEnumItem()
	 * @generated
	 */
	EAttribute getEnumItem_Name();

	/**
	 * Returns the meta object for class '{@link originreq.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract</em>'.
	 * @see originreq.Contract
	 * @generated
	 */
	EClass getContract();

	/**
	 * Returns the meta object for the reference '{@link originreq.Contract#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see originreq.Contract#getService()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Service();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.Contract#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see originreq.Contract#getOp()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Op();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.Contract#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Def</em>'.
	 * @see originreq.Contract#getDef()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Def();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.Contract#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre</em>'.
	 * @see originreq.Contract#getPre()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Pre();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.Contract#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post</em>'.
	 * @see originreq.Contract#getPost()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Post();

	/**
	 * Returns the meta object for class '{@link originreq.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see originreq.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.Definition#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see originreq.Definition#getVariable()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_Variable();

	/**
	 * Returns the meta object for class '{@link originreq.Precondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precondition</em>'.
	 * @see originreq.Precondition
	 * @generated
	 */
	EClass getPrecondition();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.Precondition#getOclexp <em>Oclexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Oclexp</em>'.
	 * @see originreq.Precondition#getOclexp()
	 * @see #getPrecondition()
	 * @generated
	 */
	EReference getPrecondition_Oclexp();

	/**
	 * Returns the meta object for class '{@link originreq.Postcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postcondition</em>'.
	 * @see originreq.Postcondition
	 * @generated
	 */
	EClass getPostcondition();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.Postcondition#getOclexp <em>Oclexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Oclexp</em>'.
	 * @see originreq.Postcondition#getOclexp()
	 * @see #getPostcondition()
	 * @generated
	 */
	EReference getPostcondition_Oclexp();

	/**
	 * Returns the meta object for class '{@link originreq.OCLExpressionCS <em>OCL Expression CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Expression CS</em>'.
	 * @see originreq.OCLExpressionCS
	 * @generated
	 */
	EClass getOCLExpressionCS();

	/**
	 * Returns the meta object for class '{@link originreq.NestedExpCS <em>Nested Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Exp CS</em>'.
	 * @see originreq.NestedExpCS
	 * @generated
	 */
	EClass getNestedExpCS();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.NestedExpCS#getNestedExpression <em>Nested Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nested Expression</em>'.
	 * @see originreq.NestedExpCS#getNestedExpression()
	 * @see #getNestedExpCS()
	 * @generated
	 */
	EReference getNestedExpCS_NestedExpression();

	/**
	 * Returns the meta object for class '{@link originreq.LogicFormulaExpCS <em>Logic Formula Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Formula Exp CS</em>'.
	 * @see originreq.LogicFormulaExpCS
	 * @generated
	 */
	EClass getLogicFormulaExpCS();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.LogicFormulaExpCS#getAtomicexp <em>Atomicexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atomicexp</em>'.
	 * @see originreq.LogicFormulaExpCS#getAtomicexp()
	 * @see #getLogicFormulaExpCS()
	 * @generated
	 */
	EReference getLogicFormulaExpCS_Atomicexp();

	/**
	 * Returns the meta object for the attribute list '{@link originreq.LogicFormulaExpCS#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Connector</em>'.
	 * @see originreq.LogicFormulaExpCS#getConnector()
	 * @see #getLogicFormulaExpCS()
	 * @generated
	 */
	EAttribute getLogicFormulaExpCS_Connector();

	/**
	 * Returns the meta object for class '{@link originreq.AtomicExpression <em>Atomic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Expression</em>'.
	 * @see originreq.AtomicExpression
	 * @generated
	 */
	EClass getAtomicExpression();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.AtomicExpression#getLeftside <em>Leftside</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Leftside</em>'.
	 * @see originreq.AtomicExpression#getLeftside()
	 * @see #getAtomicExpression()
	 * @generated
	 */
	EReference getAtomicExpression_Leftside();

	/**
	 * Returns the meta object for the attribute '{@link originreq.AtomicExpression#getInfixop <em>Infixop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infixop</em>'.
	 * @see originreq.AtomicExpression#getInfixop()
	 * @see #getAtomicExpression()
	 * @generated
	 */
	EAttribute getAtomicExpression_Infixop();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.AtomicExpression#getRightside <em>Rightside</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rightside</em>'.
	 * @see originreq.AtomicExpression#getRightside()
	 * @see #getAtomicExpression()
	 * @generated
	 */
	EReference getAtomicExpression_Rightside();

	/**
	 * Returns the meta object for the attribute '{@link originreq.AtomicExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see originreq.AtomicExpression#getOp()
	 * @see #getAtomicExpression()
	 * @generated
	 */
	EAttribute getAtomicExpression_Op();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.AtomicExpression#getNum <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num</em>'.
	 * @see originreq.AtomicExpression#getNum()
	 * @see #getAtomicExpression()
	 * @generated
	 */
	EReference getAtomicExpression_Num();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.AtomicExpression#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see originreq.AtomicExpression#getExp()
	 * @see #getAtomicExpression()
	 * @generated
	 */
	EReference getAtomicExpression_Exp();

	/**
	 * Returns the meta object for class '{@link originreq.LeftSubAtomicExpression <em>Left Sub Atomic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Sub Atomic Expression</em>'.
	 * @see originreq.LeftSubAtomicExpression
	 * @generated
	 */
	EClass getLeftSubAtomicExpression();

	/**
	 * Returns the meta object for class '{@link originreq.RightSubAtomicExpression <em>Right Sub Atomic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Sub Atomic Expression</em>'.
	 * @see originreq.RightSubAtomicExpression
	 * @generated
	 */
	EClass getRightSubAtomicExpression();

	/**
	 * Returns the meta object for class '{@link originreq.CallExpCS <em>Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Exp CS</em>'.
	 * @see originreq.CallExpCS
	 * @generated
	 */
	EClass getCallExpCS();

	/**
	 * Returns the meta object for class '{@link originreq.LoopExpCS <em>Loop Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Exp CS</em>'.
	 * @see originreq.LoopExpCS
	 * @generated
	 */
	EClass getLoopExpCS();

	/**
	 * Returns the meta object for class '{@link originreq.IteratorExpCS <em>Iterator Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator Exp CS</em>'.
	 * @see originreq.IteratorExpCS
	 * @generated
	 */
	EClass getIteratorExpCS();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.IteratorExpCS#getObjectCall <em>Object Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Call</em>'.
	 * @see originreq.IteratorExpCS#getObjectCall()
	 * @see #getIteratorExpCS()
	 * @generated
	 */
	EReference getIteratorExpCS_ObjectCall();

	/**
	 * Returns the meta object for the attribute '{@link originreq.IteratorExpCS#getSimpleCall <em>Simple Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Call</em>'.
	 * @see originreq.IteratorExpCS#getSimpleCall()
	 * @see #getIteratorExpCS()
	 * @generated
	 */
	EAttribute getIteratorExpCS_SimpleCall();

	/**
	 * Returns the meta object for the attribute '{@link originreq.IteratorExpCS#getIterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterator</em>'.
	 * @see originreq.IteratorExpCS#getIterator()
	 * @see #getIteratorExpCS()
	 * @generated
	 */
	EAttribute getIteratorExpCS_Iterator();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.IteratorExpCS#getVaribles <em>Varibles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Varibles</em>'.
	 * @see originreq.IteratorExpCS#getVaribles()
	 * @see #getIteratorExpCS()
	 * @generated
	 */
	EReference getIteratorExpCS_Varibles();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.IteratorExpCS#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see originreq.IteratorExpCS#getExp()
	 * @see #getIteratorExpCS()
	 * @generated
	 */
	EReference getIteratorExpCS_Exp();

	/**
	 * Returns the meta object for class '{@link originreq.EntityAttributeName <em>Entity Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Attribute Name</em>'.
	 * @see originreq.EntityAttributeName
	 * @generated
	 */
	EClass getEntityAttributeName();

	/**
	 * Returns the meta object for the attribute '{@link originreq.EntityAttributeName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.EntityAttributeName#getName()
	 * @see #getEntityAttributeName()
	 * @generated
	 */
	EAttribute getEntityAttributeName_Name();

	/**
	 * Returns the meta object for class '{@link originreq.ArgumentsCS <em>Arguments CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arguments CS</em>'.
	 * @see originreq.ArgumentsCS
	 * @generated
	 */
	EClass getArgumentsCS();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.ArgumentsCS#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see originreq.ArgumentsCS#getFirst()
	 * @see #getArgumentsCS()
	 * @generated
	 */
	EReference getArgumentsCS_First();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.ArgumentsCS#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see originreq.ArgumentsCS#getNext()
	 * @see #getArgumentsCS()
	 * @generated
	 */
	EReference getArgumentsCS_Next();

	/**
	 * Returns the meta object for class '{@link originreq.FeatureCallExpCS <em>Feature Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Call Exp CS</em>'.
	 * @see originreq.FeatureCallExpCS
	 * @generated
	 */
	EClass getFeatureCallExpCS();

	/**
	 * Returns the meta object for class '{@link originreq.StandardNavigationCallExpCS <em>Standard Navigation Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Navigation Call Exp CS</em>'.
	 * @see originreq.StandardNavigationCallExpCS
	 * @generated
	 */
	EClass getStandardNavigationCallExpCS();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.StandardNavigationCallExpCS#getClassifercall <em>Classifercall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classifercall</em>'.
	 * @see originreq.StandardNavigationCallExpCS#getClassifercall()
	 * @see #getStandardNavigationCallExpCS()
	 * @generated
	 */
	EReference getStandardNavigationCallExpCS_Classifercall();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.StandardNavigationCallExpCS#getPropertycall <em>Propertycall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Propertycall</em>'.
	 * @see originreq.StandardNavigationCallExpCS#getPropertycall()
	 * @see #getStandardNavigationCallExpCS()
	 * @generated
	 */
	EReference getStandardNavigationCallExpCS_Propertycall();

	/**
	 * Returns the meta object for the attribute '{@link originreq.StandardNavigationCallExpCS#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see originreq.StandardNavigationCallExpCS#getObject()
	 * @see #getStandardNavigationCallExpCS()
	 * @generated
	 */
	EAttribute getStandardNavigationCallExpCS_Object();

	/**
	 * Returns the meta object for the attribute '{@link originreq.StandardNavigationCallExpCS#getNavop <em>Navop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navop</em>'.
	 * @see originreq.StandardNavigationCallExpCS#getNavop()
	 * @see #getStandardNavigationCallExpCS()
	 * @generated
	 */
	EAttribute getStandardNavigationCallExpCS_Navop();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.StandardNavigationCallExpCS#getStandardOP <em>Standard OP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Standard OP</em>'.
	 * @see originreq.StandardNavigationCallExpCS#getStandardOP()
	 * @see #getStandardNavigationCallExpCS()
	 * @generated
	 */
	EReference getStandardNavigationCallExpCS_StandardOP();

	/**
	 * Returns the meta object for class '{@link originreq.StandardOperationExpCS <em>Standard Operation Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Operation Exp CS</em>'.
	 * @see originreq.StandardOperationExpCS
	 * @generated
	 */
	EClass getStandardOperationExpCS();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.StandardOperationExpCS#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see originreq.StandardOperationExpCS#getObject()
	 * @see #getStandardOperationExpCS()
	 * @generated
	 */
	EReference getStandardOperationExpCS_Object();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.StandardOperationExpCS#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see originreq.StandardOperationExpCS#getProperty()
	 * @see #getStandardOperationExpCS()
	 * @generated
	 */
	EReference getStandardOperationExpCS_Property();

	/**
	 * Returns the meta object for the attribute '{@link originreq.StandardOperationExpCS#getPremark <em>Premark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Premark</em>'.
	 * @see originreq.StandardOperationExpCS#getPremark()
	 * @see #getStandardOperationExpCS()
	 * @generated
	 */
	EAttribute getStandardOperationExpCS_Premark();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.StandardOperationExpCS#getPredefinedop <em>Predefinedop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predefinedop</em>'.
	 * @see originreq.StandardOperationExpCS#getPredefinedop()
	 * @see #getStandardOperationExpCS()
	 * @generated
	 */
	EReference getStandardOperationExpCS_Predefinedop();

	/**
	 * Returns the meta object for class '{@link originreq.PredefineOp <em>Predefine Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predefine Op</em>'.
	 * @see originreq.PredefineOp
	 * @generated
	 */
	EClass getPredefineOp();

	/**
	 * Returns the meta object for the attribute '{@link originreq.PredefineOp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.PredefineOp#getName()
	 * @see #getPredefineOp()
	 * @generated
	 */
	EAttribute getPredefineOp_Name();

	/**
	 * Returns the meta object for class '{@link originreq.StandardNoneParameterOperation <em>Standard None Parameter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard None Parameter Operation</em>'.
	 * @see originreq.StandardNoneParameterOperation
	 * @generated
	 */
	EClass getStandardNoneParameterOperation();

	/**
	 * Returns the meta object for class '{@link originreq.StandardParameterOperation <em>Standard Parameter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Parameter Operation</em>'.
	 * @see originreq.StandardParameterOperation
	 * @generated
	 */
	EClass getStandardParameterOperation();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.StandardParameterOperation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see originreq.StandardParameterOperation#getType()
	 * @see #getStandardParameterOperation()
	 * @generated
	 */
	EReference getStandardParameterOperation_Type();

	/**
	 * Returns the meta object for class '{@link originreq.StandardCollectionOperation <em>Standard Collection Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Collection Operation</em>'.
	 * @see originreq.StandardCollectionOperation
	 * @generated
	 */
	EClass getStandardCollectionOperation();

	/**
	 * Returns the meta object for the attribute '{@link originreq.StandardCollectionOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.StandardCollectionOperation#getName()
	 * @see #getStandardCollectionOperation()
	 * @generated
	 */
	EAttribute getStandardCollectionOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link originreq.StandardCollectionOperation#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see originreq.StandardCollectionOperation#getObject()
	 * @see #getStandardCollectionOperation()
	 * @generated
	 */
	EAttribute getStandardCollectionOperation_Object();

	/**
	 * Returns the meta object for class '{@link originreq.StandardDateOperation <em>Standard Date Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Date Operation</em>'.
	 * @see originreq.StandardDateOperation
	 * @generated
	 */
	EClass getStandardDateOperation();

	/**
	 * Returns the meta object for the attribute '{@link originreq.StandardDateOperation#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see originreq.StandardDateOperation#getObject()
	 * @see #getStandardDateOperation()
	 * @generated
	 */
	EAttribute getStandardDateOperation_Object();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.StandardDateOperation#getDatenum <em>Datenum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datenum</em>'.
	 * @see originreq.StandardDateOperation#getDatenum()
	 * @see #getStandardDateOperation()
	 * @generated
	 */
	EReference getStandardDateOperation_Datenum();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.StandardDateOperation#getProcall <em>Procall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Procall</em>'.
	 * @see originreq.StandardDateOperation#getProcall()
	 * @see #getStandardDateOperation()
	 * @generated
	 */
	EReference getStandardDateOperation_Procall();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.StandardDateOperation#getNested <em>Nested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nested</em>'.
	 * @see originreq.StandardDateOperation#getNested()
	 * @see #getStandardDateOperation()
	 * @generated
	 */
	EReference getStandardDateOperation_Nested();

	/**
	 * Returns the meta object for class '{@link originreq.ClassiferCallExpCS <em>Classifer Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifer Call Exp CS</em>'.
	 * @see originreq.ClassiferCallExpCS
	 * @generated
	 */
	EClass getClassiferCallExpCS();

	/**
	 * Returns the meta object for the attribute '{@link originreq.ClassiferCallExpCS#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity</em>'.
	 * @see originreq.ClassiferCallExpCS#getEntity()
	 * @see #getClassiferCallExpCS()
	 * @generated
	 */
	EAttribute getClassiferCallExpCS_Entity();

	/**
	 * Returns the meta object for the attribute '{@link originreq.ClassiferCallExpCS#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see originreq.ClassiferCallExpCS#getOp()
	 * @see #getClassiferCallExpCS()
	 * @generated
	 */
	EAttribute getClassiferCallExpCS_Op();

	/**
	 * Returns the meta object for class '{@link originreq.PropertyCallExpCS <em>Property Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Call Exp CS</em>'.
	 * @see originreq.PropertyCallExpCS
	 * @generated
	 */
	EClass getPropertyCallExpCS();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.PropertyCallExpCS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see originreq.PropertyCallExpCS#getName()
	 * @see #getPropertyCallExpCS()
	 * @generated
	 */
	EReference getPropertyCallExpCS_Name();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.PropertyCallExpCS#getSelfproperty <em>Selfproperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selfproperty</em>'.
	 * @see originreq.PropertyCallExpCS#getSelfproperty()
	 * @see #getPropertyCallExpCS()
	 * @generated
	 */
	EReference getPropertyCallExpCS_Selfproperty();

	/**
	 * Returns the meta object for the attribute '{@link originreq.PropertyCallExpCS#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see originreq.PropertyCallExpCS#getAttribute()
	 * @see #getPropertyCallExpCS()
	 * @generated
	 */
	EAttribute getPropertyCallExpCS_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link originreq.PropertyCallExpCS#getPremark <em>Premark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Premark</em>'.
	 * @see originreq.PropertyCallExpCS#getPremark()
	 * @see #getPropertyCallExpCS()
	 * @generated
	 */
	EAttribute getPropertyCallExpCS_Premark();

	/**
	 * Returns the meta object for class '{@link originreq.OperationCallExpCS <em>Operation Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call Exp CS</em>'.
	 * @see originreq.OperationCallExpCS
	 * @generated
	 */
	EClass getOperationCallExpCS();

	/**
	 * Returns the meta object for the attribute '{@link originreq.OperationCallExpCS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.OperationCallExpCS#getName()
	 * @see #getOperationCallExpCS()
	 * @generated
	 */
	EAttribute getOperationCallExpCS_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.OperationCallExpCS#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see originreq.OperationCallExpCS#getParameters()
	 * @see #getOperationCallExpCS()
	 * @generated
	 */
	EReference getOperationCallExpCS_Parameters();

	/**
	 * Returns the meta object for class '{@link originreq.OperationParameters <em>Operation Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Parameters</em>'.
	 * @see originreq.OperationParameters
	 * @generated
	 */
	EClass getOperationParameters();

	/**
	 * Returns the meta object for the attribute '{@link originreq.OperationParameters#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see originreq.OperationParameters#getObject()
	 * @see #getOperationParameters()
	 * @generated
	 */
	EAttribute getOperationParameters_Object();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.OperationParameters#getObjectproperty <em>Objectproperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Objectproperty</em>'.
	 * @see originreq.OperationParameters#getObjectproperty()
	 * @see #getOperationParameters()
	 * @generated
	 */
	EReference getOperationParameters_Objectproperty();

	/**
	 * Returns the meta object for the attribute '{@link originreq.OperationParameters#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see originreq.OperationParameters#getString()
	 * @see #getOperationParameters()
	 * @generated
	 */
	EAttribute getOperationParameters_String();

	/**
	 * Returns the meta object for class '{@link originreq.VariableExpCS <em>Variable Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Exp CS</em>'.
	 * @see originreq.VariableExpCS
	 * @generated
	 */
	EClass getVariableExpCS();

	/**
	 * Returns the meta object for the attribute '{@link originreq.VariableExpCS#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see originreq.VariableExpCS#getSymbol()
	 * @see #getVariableExpCS()
	 * @generated
	 */
	EAttribute getVariableExpCS_Symbol();

	/**
	 * Returns the meta object for class '{@link originreq.IfExpCS <em>If Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Exp CS</em>'.
	 * @see originreq.IfExpCS
	 * @generated
	 */
	EClass getIfExpCS();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.IfExpCS#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see originreq.IfExpCS#getCondition()
	 * @see #getIfExpCS()
	 * @generated
	 */
	EReference getIfExpCS_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.IfExpCS#getThenExpression <em>Then Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Expression</em>'.
	 * @see originreq.IfExpCS#getThenExpression()
	 * @see #getIfExpCS()
	 * @generated
	 */
	EReference getIfExpCS_ThenExpression();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.IfExpCS#getElseExpression <em>Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Expression</em>'.
	 * @see originreq.IfExpCS#getElseExpression()
	 * @see #getIfExpCS()
	 * @generated
	 */
	EReference getIfExpCS_ElseExpression();

	/**
	 * Returns the meta object for class '{@link originreq.LetExpCS <em>Let Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Let Exp CS</em>'.
	 * @see originreq.LetExpCS
	 * @generated
	 */
	EClass getLetExpCS();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.LetExpCS#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see originreq.LetExpCS#getVariable()
	 * @see #getLetExpCS()
	 * @generated
	 */
	EReference getLetExpCS_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.LetExpCS#getInExpression <em>In Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Expression</em>'.
	 * @see originreq.LetExpCS#getInExpression()
	 * @see #getLetExpCS()
	 * @generated
	 */
	EReference getLetExpCS_InExpression();

	/**
	 * Returns the meta object for class '{@link originreq.VariableDeclarationCS <em>Variable Declaration CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration CS</em>'.
	 * @see originreq.VariableDeclarationCS
	 * @generated
	 */
	EClass getVariableDeclarationCS();

	/**
	 * Returns the meta object for the attribute '{@link originreq.VariableDeclarationCS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.VariableDeclarationCS#getName()
	 * @see #getVariableDeclarationCS()
	 * @generated
	 */
	EAttribute getVariableDeclarationCS_Name();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.VariableDeclarationCS#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see originreq.VariableDeclarationCS#getType()
	 * @see #getVariableDeclarationCS()
	 * @generated
	 */
	EReference getVariableDeclarationCS_Type();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.VariableDeclarationCS#getInitExpression <em>Init Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Expression</em>'.
	 * @see originreq.VariableDeclarationCS#getInitExpression()
	 * @see #getVariableDeclarationCS()
	 * @generated
	 */
	EReference getVariableDeclarationCS_InitExpression();

	/**
	 * Returns the meta object for class '{@link originreq.LiteralExpCS <em>Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Exp CS</em>'.
	 * @see originreq.LiteralExpCS
	 * @generated
	 */
	EClass getLiteralExpCS();

	/**
	 * Returns the meta object for class '{@link originreq.EnumLiteralExpCS <em>Enum Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal Exp CS</em>'.
	 * @see originreq.EnumLiteralExpCS
	 * @generated
	 */
	EClass getEnumLiteralExpCS();

	/**
	 * Returns the meta object for the attribute '{@link originreq.EnumLiteralExpCS#getEnumname <em>Enumname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enumname</em>'.
	 * @see originreq.EnumLiteralExpCS#getEnumname()
	 * @see #getEnumLiteralExpCS()
	 * @generated
	 */
	EAttribute getEnumLiteralExpCS_Enumname();

	/**
	 * Returns the meta object for the attribute '{@link originreq.EnumLiteralExpCS#getEunmitem <em>Eunmitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eunmitem</em>'.
	 * @see originreq.EnumLiteralExpCS#getEunmitem()
	 * @see #getEnumLiteralExpCS()
	 * @generated
	 */
	EAttribute getEnumLiteralExpCS_Eunmitem();

	/**
	 * Returns the meta object for class '{@link originreq.TupleLiteralExpCS <em>Tuple Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Literal Exp CS</em>'.
	 * @see originreq.TupleLiteralExpCS
	 * @generated
	 */
	EClass getTupleLiteralExpCS();

	/**
	 * Returns the meta object for the attribute '{@link originreq.TupleLiteralExpCS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.TupleLiteralExpCS#getName()
	 * @see #getTupleLiteralExpCS()
	 * @generated
	 */
	EAttribute getTupleLiteralExpCS_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.TupleLiteralExpCS#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see originreq.TupleLiteralExpCS#getVariables()
	 * @see #getTupleLiteralExpCS()
	 * @generated
	 */
	EReference getTupleLiteralExpCS_Variables();

	/**
	 * Returns the meta object for class '{@link originreq.TupleTypeCS <em>Tuple Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Type CS</em>'.
	 * @see originreq.TupleTypeCS
	 * @generated
	 */
	EClass getTupleTypeCS();

	/**
	 * Returns the meta object for the attribute '{@link originreq.TupleTypeCS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.TupleTypeCS#getName()
	 * @see #getTupleTypeCS()
	 * @generated
	 */
	EAttribute getTupleTypeCS_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.TupleTypeCS#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see originreq.TupleTypeCS#getVariables()
	 * @see #getTupleTypeCS()
	 * @generated
	 */
	EReference getTupleTypeCS_Variables();

	/**
	 * Returns the meta object for class '{@link originreq.CollectionTypeCS <em>Collection Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Type CS</em>'.
	 * @see originreq.CollectionTypeCS
	 * @generated
	 */
	EClass getCollectionTypeCS();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.CollectionTypeCS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see originreq.CollectionTypeCS#getName()
	 * @see #getCollectionTypeCS()
	 * @generated
	 */
	EReference getCollectionTypeCS_Name();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.CollectionTypeCS#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see originreq.CollectionTypeCS#getType()
	 * @see #getCollectionTypeCS()
	 * @generated
	 */
	EReference getCollectionTypeCS_Type();

	/**
	 * Returns the meta object for class '{@link originreq.CollectionLiteralExpCS <em>Collection Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Literal Exp CS</em>'.
	 * @see originreq.CollectionLiteralExpCS
	 * @generated
	 */
	EClass getCollectionLiteralExpCS();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.CollectionLiteralExpCS#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kind</em>'.
	 * @see originreq.CollectionLiteralExpCS#getKind()
	 * @see #getCollectionLiteralExpCS()
	 * @generated
	 */
	EReference getCollectionLiteralExpCS_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link originreq.CollectionLiteralExpCS#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see originreq.CollectionLiteralExpCS#getPart()
	 * @see #getCollectionLiteralExpCS()
	 * @generated
	 */
	EReference getCollectionLiteralExpCS_Part();

	/**
	 * Returns the meta object for class '{@link originreq.CollectionLiteralPartCS <em>Collection Literal Part CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Literal Part CS</em>'.
	 * @see originreq.CollectionLiteralPartCS
	 * @generated
	 */
	EClass getCollectionLiteralPartCS();

	/**
	 * Returns the meta object for class '{@link originreq.CollectionRangeCS <em>Collection Range CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Range CS</em>'.
	 * @see originreq.CollectionRangeCS
	 * @generated
	 */
	EClass getCollectionRangeCS();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.CollectionRangeCS#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see originreq.CollectionRangeCS#getFirst()
	 * @see #getCollectionRangeCS()
	 * @generated
	 */
	EReference getCollectionRangeCS_First();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.CollectionRangeCS#getLast <em>Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last</em>'.
	 * @see originreq.CollectionRangeCS#getLast()
	 * @see #getCollectionRangeCS()
	 * @generated
	 */
	EReference getCollectionRangeCS_Last();

	/**
	 * Returns the meta object for class '{@link originreq.CollectionItem <em>Collection Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Item</em>'.
	 * @see originreq.CollectionItem
	 * @generated
	 */
	EClass getCollectionItem();

	/**
	 * Returns the meta object for the containment reference '{@link originreq.CollectionItem#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item</em>'.
	 * @see originreq.CollectionItem#getItem()
	 * @see #getCollectionItem()
	 * @generated
	 */
	EReference getCollectionItem_Item();

	/**
	 * Returns the meta object for class '{@link originreq.PrimitiveLiteralExpCS <em>Primitive Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Literal Exp CS</em>'.
	 * @see originreq.PrimitiveLiteralExpCS
	 * @generated
	 */
	EClass getPrimitiveLiteralExpCS();

	/**
	 * Returns the meta object for the attribute '{@link originreq.PrimitiveLiteralExpCS#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see originreq.PrimitiveLiteralExpCS#getSymbol()
	 * @see #getPrimitiveLiteralExpCS()
	 * @generated
	 */
	EAttribute getPrimitiveLiteralExpCS_Symbol();

	/**
	 * Returns the meta object for class '{@link originreq.NumberLiteralExpCS <em>Number Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Literal Exp CS</em>'.
	 * @see originreq.NumberLiteralExpCS
	 * @generated
	 */
	EClass getNumberLiteralExpCS();

	/**
	 * Returns the meta object for class '{@link originreq.BooleanLiteralExpCS <em>Boolean Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal Exp CS</em>'.
	 * @see originreq.BooleanLiteralExpCS
	 * @generated
	 */
	EClass getBooleanLiteralExpCS();

	/**
	 * Returns the meta object for class '{@link originreq.StringLiteralExpCS <em>String Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal Exp CS</em>'.
	 * @see originreq.StringLiteralExpCS
	 * @generated
	 */
	EClass getStringLiteralExpCS();

	/**
	 * Returns the meta object for class '{@link originreq.NullLiteralExpCS <em>Null Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Literal Exp CS</em>'.
	 * @see originreq.NullLiteralExpCS
	 * @generated
	 */
	EClass getNullLiteralExpCS();

	/**
	 * Returns the meta object for class '{@link originreq.InvalidLiteralExpCS <em>Invalid Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invalid Literal Exp CS</em>'.
	 * @see originreq.InvalidLiteralExpCS
	 * @generated
	 */
	EClass getInvalidLiteralExpCS();

	/**
	 * Returns the meta object for class '{@link originreq.ReservedKeywordCS <em>Reserved Keyword CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reserved Keyword CS</em>'.
	 * @see originreq.ReservedKeywordCS
	 * @generated
	 */
	EClass getReservedKeywordCS();

	/**
	 * Returns the meta object for the attribute '{@link originreq.ReservedKeywordCS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see originreq.ReservedKeywordCS#getName()
	 * @see #getReservedKeywordCS()
	 * @generated
	 */
	EAttribute getReservedKeywordCS_Name();

	/**
	 * Returns the meta object for class '{@link originreq.CollectionTypeIdentifierCS <em>Collection Type Identifier CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Type Identifier CS</em>'.
	 * @see originreq.CollectionTypeIdentifierCS
	 * @generated
	 */
	EClass getCollectionTypeIdentifierCS();

	/**
	 * Returns the meta object for class '{@link originreq.PrimitiveTypeCS <em>Primitive Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type CS</em>'.
	 * @see originreq.PrimitiveTypeCS
	 * @generated
	 */
	EClass getPrimitiveTypeCS();

	/**
	 * Returns the meta object for class '{@link originreq.OclTypeCS <em>Ocl Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Type CS</em>'.
	 * @see originreq.OclTypeCS
	 * @generated
	 */
	EClass getOclTypeCS();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OriginreqFactory getOriginreqFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link originreq.impl.RequirementModelImpl <em>Requirement Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.RequirementModelImpl
		 * @see originreq.impl.OriginreqPackageImpl#getRequirementModel()
		 * @generated
		 */
		EClass REQUIREMENT_MODEL = eINSTANCE.getRequirementModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_MODEL__NAME = eINSTANCE.getRequirementModel_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_MODEL__DESCRIPTION = eINSTANCE.getRequirementModel_Description();

		/**
		 * The meta object literal for the '<em><b>Use Case Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_MODEL__USE_CASE_MODEL = eINSTANCE.getRequirementModel_UseCaseModel();

		/**
		 * The meta object literal for the '<em><b>Domain Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_MODEL__DOMAIN_MODEL = eINSTANCE.getRequirementModel_DomainModel();

		/**
		 * The meta object literal for the '{@link originreq.impl.InteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.InteractionImpl
		 * @see originreq.impl.OriginreqPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION__NAME = eINSTANCE.getInteraction_Name();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__PARTICIPANTS = eINSTANCE.getInteraction_Participants();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__MESSAGES = eINSTANCE.getInteraction_Messages();

		/**
		 * The meta object literal for the '<em><b>Executions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__EXECUTIONS = eINSTANCE.getInteraction_Executions();

		/**
		 * The meta object literal for the '<em><b>Combined Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__COMBINED_FRAGMENTS = eINSTANCE.getInteraction_CombinedFragments();

		/**
		 * The meta object literal for the '<em><b>Ends</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__ENDS = eINSTANCE.getInteraction_Ends();

		/**
		 * The meta object literal for the '{@link originreq.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.MessageImpl
		 * @see originreq.impl.OriginreqPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__NAME = eINSTANCE.getMessage_Name();

		/**
		 * The meta object literal for the '<em><b>Sending End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__SENDING_END = eINSTANCE.getMessage_SendingEnd();

		/**
		 * The meta object literal for the '<em><b>Receiving End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__RECEIVING_END = eINSTANCE.getMessage_ReceivingEnd();

		/**
		 * The meta object literal for the '{@link originreq.impl.CallMessageImpl <em>Call Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.CallMessageImpl
		 * @see originreq.impl.OriginreqPackageImpl#getCallMessage()
		 * @generated
		 */
		EClass CALL_MESSAGE = eINSTANCE.getCallMessage();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_MESSAGE__OP = eINSTANCE.getCallMessage_Op();

		/**
		 * The meta object literal for the '{@link originreq.impl.ReturnMessageImpl <em>Return Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.ReturnMessageImpl
		 * @see originreq.impl.OriginreqPackageImpl#getReturnMessage()
		 * @generated
		 */
		EClass RETURN_MESSAGE = eINSTANCE.getReturnMessage();

		/**
		 * The meta object literal for the '<em><b>Invocation Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_MESSAGE__INVOCATION_MESSAGE = eINSTANCE.getReturnMessage_InvocationMessage();

		/**
		 * The meta object literal for the '{@link originreq.impl.ExecutionImpl <em>Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.ExecutionImpl
		 * @see originreq.impl.OriginreqPackageImpl#getExecution()
		 * @generated
		 */
		EClass EXECUTION = eINSTANCE.getExecution();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION__OWNER = eINSTANCE.getExecution_Owner();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION__START = eINSTANCE.getExecution_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION__END = eINSTANCE.getExecution_End();

		/**
		 * The meta object literal for the '{@link originreq.impl.CombinedFragmentImpl <em>Combined Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.CombinedFragmentImpl
		 * @see originreq.impl.OriginreqPackageImpl#getCombinedFragment()
		 * @generated
		 */
		EClass COMBINED_FRAGMENT = eINSTANCE.getCombinedFragment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINED_FRAGMENT__NAME = eINSTANCE.getCombinedFragment_Name();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINED_FRAGMENT__OPERATOR = eINSTANCE.getCombinedFragment_Operator();

		/**
		 * The meta object literal for the '<em><b>Covered Participants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_FRAGMENT__COVERED_PARTICIPANTS = eINSTANCE.getCombinedFragment_CoveredParticipants();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_FRAGMENT__START = eINSTANCE.getCombinedFragment_Start();

		/**
		 * The meta object literal for the '<em><b>Finish</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_FRAGMENT__FINISH = eINSTANCE.getCombinedFragment_Finish();

		/**
		 * The meta object literal for the '<em><b>Owned Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_FRAGMENT__OWNED_OPERANDS = eINSTANCE.getCombinedFragment_OwnedOperands();

		/**
		 * The meta object literal for the '{@link originreq.impl.OperandImpl <em>Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.OperandImpl
		 * @see originreq.impl.OriginreqPackageImpl#getOperand()
		 * @generated
		 */
		EClass OPERAND = eINSTANCE.getOperand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERAND__NAME = eINSTANCE.getOperand_Name();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERAND__START = eINSTANCE.getOperand_Start();

		/**
		 * The meta object literal for the '<em><b>Finish</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERAND__FINISH = eINSTANCE.getOperand_Finish();

		/**
		 * The meta object literal for the '{@link originreq.impl.AbstractEndImpl <em>Abstract End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.AbstractEndImpl
		 * @see originreq.impl.OriginreqPackageImpl#getAbstractEnd()
		 * @generated
		 */
		EClass ABSTRACT_END = eINSTANCE.getAbstractEnd();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_END__NAME = eINSTANCE.getAbstractEnd_Name();

		/**
		 * The meta object literal for the '{@link originreq.impl.MixEndImpl <em>Mix End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.MixEndImpl
		 * @see originreq.impl.OriginreqPackageImpl#getMixEnd()
		 * @generated
		 */
		EClass MIX_END = eINSTANCE.getMixEnd();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIX_END__CONTEXT = eINSTANCE.getMixEnd_Context();

		/**
		 * The meta object literal for the '{@link originreq.impl.MixOpAndCFEndImpl <em>Mix Op And CF End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.MixOpAndCFEndImpl
		 * @see originreq.impl.OriginreqPackageImpl#getMixOpAndCFEnd()
		 * @generated
		 */
		EClass MIX_OP_AND_CF_END = eINSTANCE.getMixOpAndCFEnd();

		/**
		 * The meta object literal for the '{@link originreq.impl.MessageEndImpl <em>Message End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.MessageEndImpl
		 * @see originreq.impl.OriginreqPackageImpl#getMessageEnd()
		 * @generated
		 */
		EClass MESSAGE_END = eINSTANCE.getMessageEnd();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_END__MESSAGE = eINSTANCE.getMessageEnd_Message();

		/**
		 * The meta object literal for the '{@link originreq.impl.MultiEndImpl <em>Multi End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.MultiEndImpl
		 * @see originreq.impl.OriginreqPackageImpl#getMultiEnd()
		 * @generated
		 */
		EClass MULTI_END = eINSTANCE.getMultiEnd();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_END__NAME = eINSTANCE.getMultiEnd_Name();

		/**
		 * The meta object literal for the '{@link originreq.impl.ExecutionEndImpl <em>Execution End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.ExecutionEndImpl
		 * @see originreq.impl.OriginreqPackageImpl#getExecutionEnd()
		 * @generated
		 */
		EClass EXECUTION_END = eINSTANCE.getExecutionEnd();

		/**
		 * The meta object literal for the '<em><b>Execution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_END__EXECUTION = eINSTANCE.getExecutionEnd_Execution();

		/**
		 * The meta object literal for the '{@link originreq.impl.CombinedFragmentEndImpl <em>Combined Fragment End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.CombinedFragmentEndImpl
		 * @see originreq.impl.OriginreqPackageImpl#getCombinedFragmentEnd()
		 * @generated
		 */
		EClass COMBINED_FRAGMENT_END = eINSTANCE.getCombinedFragmentEnd();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_FRAGMENT_END__OWNER = eINSTANCE.getCombinedFragmentEnd_Owner();

		/**
		 * The meta object literal for the '{@link originreq.impl.OperandEndImpl <em>Operand End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.OperandEndImpl
		 * @see originreq.impl.OriginreqPackageImpl#getOperandEnd()
		 * @generated
		 */
		EClass OPERAND_END = eINSTANCE.getOperandEnd();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERAND_END__OWNER = eINSTANCE.getOperandEnd_Owner();

		/**
		 * The meta object literal for the '{@link originreq.impl.DomainModelImpl <em>Domain Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.DomainModelImpl
		 * @see originreq.impl.OriginreqPackageImpl#getDomainModel()
		 * @generated
		 */
		EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MODEL__NAME = eINSTANCE.getDomainModel_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MODEL__LABEL = eINSTANCE.getDomainModel_Label();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__ENTITY = eINSTANCE.getDomainModel_Entity();

		/**
		 * The meta object literal for the '{@link originreq.impl.UseCaseModelImpl <em>Use Case Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.UseCaseModelImpl
		 * @see originreq.impl.OriginreqPackageImpl#getUseCaseModel()
		 * @generated
		 */
		EClass USE_CASE_MODEL = eINSTANCE.getUseCaseModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE_MODEL__NAME = eINSTANCE.getUseCaseModel_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE_MODEL__LABEL = eINSTANCE.getUseCaseModel_Label();

		/**
		 * The meta object literal for the '<em><b>Uc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE_MODEL__UC = eINSTANCE.getUseCaseModel_Uc();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE_MODEL__ACTOR = eINSTANCE.getUseCaseModel_Actor();

		/**
		 * The meta object literal for the '<em><b>Interaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE_MODEL__INTERACTION = eINSTANCE.getUseCaseModel_Interaction();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE_MODEL__SERVICE = eINSTANCE.getUseCaseModel_Service();

		/**
		 * The meta object literal for the '<em><b>Contract</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE_MODEL__CONTRACT = eINSTANCE.getUseCaseModel_Contract();

		/**
		 * The meta object literal for the '{@link originreq.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.ActorImpl
		 * @see originreq.impl.OriginreqPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__LABEL = eINSTANCE.getActor_Label();

		/**
		 * The meta object literal for the '<em><b>Super Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__SUPER_ACTOR = eINSTANCE.getActor_SuperActor();

		/**
		 * The meta object literal for the '<em><b>Uc</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__UC = eINSTANCE.getActor_Uc();

		/**
		 * The meta object literal for the '{@link originreq.impl.UCImpl <em>UC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.UCImpl
		 * @see originreq.impl.OriginreqPackageImpl#getUC()
		 * @generated
		 */
		EClass UC = eINSTANCE.getUC();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UC__NAME = eINSTANCE.getUC_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UC__LABEL = eINSTANCE.getUC_Label();

		/**
		 * The meta object literal for the '<em><b>UC Relation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UC__UC_RELATION = eINSTANCE.getUC_UCRelation();

		/**
		 * The meta object literal for the '<em><b>Relateduc</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC__RELATEDUC = eINSTANCE.getUC_Relateduc();

		/**
		 * The meta object literal for the '<em><b>Ssd</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC__SSD = eINSTANCE.getUC_Ssd();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC__SERVICE = eINSTANCE.getUC_Service();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UC__DESCRIPTION = eINSTANCE.getUC_Description();

		/**
		 * The meta object literal for the '{@link originreq.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.ServiceImpl
		 * @see originreq.impl.OriginreqPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__OPERATION = eINSTANCE.getService_Operation();

		/**
		 * The meta object literal for the '<em><b>Temp property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__TEMP_PROPERTY = eINSTANCE.getService_Temp_property();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__WORKFLOW = eINSTANCE.getService_Workflow();

		/**
		 * The meta object literal for the '<em><b>Invariance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__INVARIANCE = eINSTANCE.getService_Invariance();

		/**
		 * The meta object literal for the '{@link originreq.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.ParticipantImpl
		 * @see originreq.impl.OriginreqPackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__DESCRIPTION = eINSTANCE.getParticipant_Description();

		/**
		 * The meta object literal for the '{@link originreq.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.WorkflowImpl
		 * @see originreq.impl.OriginreqPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__NAME = eINSTANCE.getWorkflow_Name();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__PARTICIPANTS = eINSTANCE.getWorkflow_Participants();

		/**
		 * The meta object literal for the '<em><b>Partitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__PARTITIONS = eINSTANCE.getWorkflow_Partitions();

		/**
		 * The meta object literal for the '{@link originreq.impl.PartitionImpl <em>Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.PartitionImpl
		 * @see originreq.impl.OriginreqPackageImpl#getPartition()
		 * @generated
		 */
		EClass PARTITION = eINSTANCE.getPartition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__NAME = eINSTANCE.getPartition_Name();

		/**
		 * The meta object literal for the '<em><b>Exps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__EXPS = eINSTANCE.getPartition_Exps();

		/**
		 * The meta object literal for the '{@link originreq.impl.WorkflowExpImpl <em>Workflow Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.WorkflowExpImpl
		 * @see originreq.impl.OriginreqPackageImpl#getWorkflowExp()
		 * @generated
		 */
		EClass WORKFLOW_EXP = eINSTANCE.getWorkflowExp();

		/**
		 * The meta object literal for the '{@link originreq.impl.PartitionActionImpl <em>Partition Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.PartitionActionImpl
		 * @see originreq.impl.OriginreqPackageImpl#getPartitionAction()
		 * @generated
		 */
		EClass PARTITION_ACTION = eINSTANCE.getPartitionAction();

		/**
		 * The meta object literal for the '<em><b>Patition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION_ACTION__PATITION = eINSTANCE.getPartitionAction_Patition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION_ACTION__ACTION = eINSTANCE.getPartitionAction_Action();

		/**
		 * The meta object literal for the '{@link originreq.impl.JoinExpImpl <em>Join Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.JoinExpImpl
		 * @see originreq.impl.OriginreqPackageImpl#getJoinExp()
		 * @generated
		 */
		EClass JOIN_EXP = eINSTANCE.getJoinExp();

		/**
		 * The meta object literal for the '{@link originreq.impl.ActivityFinalImpl <em>Activity Final</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.ActivityFinalImpl
		 * @see originreq.impl.OriginreqPackageImpl#getActivityFinal()
		 * @generated
		 */
		EClass ACTIVITY_FINAL = eINSTANCE.getActivityFinal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_FINAL__NAME = eINSTANCE.getActivityFinal_Name();

		/**
		 * The meta object literal for the '{@link originreq.impl.InitalNodeImpl <em>Inital Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.InitalNodeImpl
		 * @see originreq.impl.OriginreqPackageImpl#getInitalNode()
		 * @generated
		 */
		EClass INITAL_NODE = eINSTANCE.getInitalNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITAL_NODE__NAME = eINSTANCE.getInitalNode_Name();

		/**
		 * The meta object literal for the '{@link originreq.impl.ForkNodeImpl <em>Fork Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.ForkNodeImpl
		 * @see originreq.impl.OriginreqPackageImpl#getForkNode()
		 * @generated
		 */
		EClass FORK_NODE = eINSTANCE.getForkNode();

		/**
		 * The meta object literal for the '<em><b>Startlinks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK_NODE__STARTLINKS = eINSTANCE.getForkNode_Startlinks();

		/**
		 * The meta object literal for the '{@link originreq.impl.JoinNodeImpl <em>Join Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.JoinNodeImpl
		 * @see originreq.impl.OriginreqPackageImpl#getJoinNode()
		 * @generated
		 */
		EClass JOIN_NODE = eINSTANCE.getJoinNode();

		/**
		 * The meta object literal for the '<em><b>Endlinks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_NODE__ENDLINKS = eINSTANCE.getJoinNode_Endlinks();

		/**
		 * The meta object literal for the '{@link originreq.impl.ComplexOpeartionImpl <em>Complex Opeartion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.ComplexOpeartionImpl
		 * @see originreq.impl.OriginreqPackageImpl#getComplexOpeartion()
		 * @generated
		 */
		EClass COMPLEX_OPEARTION = eINSTANCE.getComplexOpeartion();

		/**
		 * The meta object literal for the '{@link originreq.impl.SimpleOperationImpl <em>Simple Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.SimpleOperationImpl
		 * @see originreq.impl.OriginreqPackageImpl#getSimpleOperation()
		 * @generated
		 */
		EClass SIMPLE_OPERATION = eINSTANCE.getSimpleOperation();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_OPERATION__REF = eINSTANCE.getSimpleOperation_Ref();

		/**
		 * The meta object literal for the '{@link originreq.impl.LoopExpImpl <em>Loop Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.LoopExpImpl
		 * @see originreq.impl.OriginreqPackageImpl#getLoopExp()
		 * @generated
		 */
		EClass LOOP_EXP = eINSTANCE.getLoopExp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_EXP__NAME = eINSTANCE.getLoopExp_Name();

		/**
		 * The meta object literal for the '<em><b>Exps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_EXP__EXPS = eINSTANCE.getLoopExp_Exps();

		/**
		 * The meta object literal for the '{@link originreq.impl.SwitchExpImpl <em>Switch Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.SwitchExpImpl
		 * @see originreq.impl.OriginreqPackageImpl#getSwitchExp()
		 * @generated
		 */
		EClass SWITCH_EXP = eINSTANCE.getSwitchExp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH_EXP__NAME = eINSTANCE.getSwitchExp_Name();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_EXP__CASES = eINSTANCE.getSwitchExp_Cases();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_EXP__DEFAULT = eINSTANCE.getSwitchExp_Default();

		/**
		 * The meta object literal for the '{@link originreq.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.SwitchCaseImpl
		 * @see originreq.impl.OriginreqPackageImpl#getSwitchCase()
		 * @generated
		 */
		EClass SWITCH_CASE = eINSTANCE.getSwitchCase();

		/**
		 * The meta object literal for the '<em><b>Case Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH_CASE__CASE_VALUE = eINSTANCE.getSwitchCase_CaseValue();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_CASE__OP = eINSTANCE.getSwitchCase_Op();

		/**
		 * The meta object literal for the '{@link originreq.impl.SwitchDefaultImpl <em>Switch Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.SwitchDefaultImpl
		 * @see originreq.impl.OriginreqPackageImpl#getSwitchDefault()
		 * @generated
		 */
		EClass SWITCH_DEFAULT = eINSTANCE.getSwitchDefault();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_DEFAULT__OP = eINSTANCE.getSwitchDefault_Op();

		/**
		 * The meta object literal for the '{@link originreq.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.OperationImpl
		 * @see originreq.impl.OriginreqPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMETER = eINSTANCE.getOperation_Parameter();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RETURN_TYPE = eINSTANCE.getOperation_ReturnType();

		/**
		 * The meta object literal for the '{@link originreq.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.ParameterImpl
		 * @see originreq.impl.OriginreqPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link originreq.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.EntityImpl
		 * @see originreq.impl.OriginreqPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Is CRUD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__IS_CRUD = eINSTANCE.getEntity_IsCRUD();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Super Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__SUPER_ENTITY = eINSTANCE.getEntity_SuperEntity();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__DESCRIPTION = eINSTANCE.getEntity_Description();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__REFERENCE = eINSTANCE.getEntity_Reference();

		/**
		 * The meta object literal for the '<em><b>Invariance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__INVARIANCE = eINSTANCE.getEntity_Invariance();

		/**
		 * The meta object literal for the '{@link originreq.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.AttributeImpl
		 * @see originreq.impl.OriginreqPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Ismultiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ISMULTIPLE = eINSTANCE.getAttribute_Ismultiple();

		/**
		 * The meta object literal for the '{@link originreq.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.ReferenceImpl
		 * @see originreq.impl.OriginreqPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__NAME = eINSTANCE.getReference_Name();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__ENTITY = eINSTANCE.getReference_Entity();

		/**
		 * The meta object literal for the '<em><b>Ismultiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__ISMULTIPLE = eINSTANCE.getReference_Ismultiple();

		/**
		 * The meta object literal for the '<em><b>Is Reverse Assoication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__IS_REVERSE_ASSOICATION = eINSTANCE.getReference_IsReverseAssoication();

		/**
		 * The meta object literal for the '<em><b>Is Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__IS_AGGREGATION = eINSTANCE.getReference_IsAggregation();

		/**
		 * The meta object literal for the '<em><b>Is Composition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__IS_COMPOSITION = eINSTANCE.getReference_IsComposition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__TYPE = eINSTANCE.getReference_Type();

		/**
		 * The meta object literal for the '{@link originreq.impl.TypeCSImpl <em>Type CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.TypeCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getTypeCS()
		 * @generated
		 */
		EClass TYPE_CS = eINSTANCE.getTypeCS();

		/**
		 * The meta object literal for the '{@link originreq.impl.InvarianceImpl <em>Invariance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.InvarianceImpl
		 * @see originreq.impl.OriginreqPackageImpl#getInvariance()
		 * @generated
		 */
		EClass INVARIANCE = eINSTANCE.getInvariance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVARIANCE__NAME = eINSTANCE.getInvariance_Name();

		/**
		 * The meta object literal for the '<em><b>Ocl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVARIANCE__OCL = eINSTANCE.getInvariance_Ocl();

		/**
		 * The meta object literal for the '<em><b>Is For Association</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVARIANCE__IS_FOR_ASSOCIATION = eINSTANCE.getInvariance_IsForAssociation();

		/**
		 * The meta object literal for the '{@link originreq.impl.EntityTypeImpl <em>Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.EntityTypeImpl
		 * @see originreq.impl.OriginreqPackageImpl#getEntityType()
		 * @generated
		 */
		EClass ENTITY_TYPE = eINSTANCE.getEntityType();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__ENTITY = eINSTANCE.getEntityType_Entity();

		/**
		 * The meta object literal for the '{@link originreq.impl.EnumEntityImpl <em>Enum Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.EnumEntityImpl
		 * @see originreq.impl.OriginreqPackageImpl#getEnumEntity()
		 * @generated
		 */
		EClass ENUM_ENTITY = eINSTANCE.getEnumEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_ENTITY__NAME = eINSTANCE.getEnumEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_ENTITY__ELEMENT = eINSTANCE.getEnumEntity_Element();

		/**
		 * The meta object literal for the '{@link originreq.impl.EnumItemImpl <em>Enum Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.EnumItemImpl
		 * @see originreq.impl.OriginreqPackageImpl#getEnumItem()
		 * @generated
		 */
		EClass ENUM_ITEM = eINSTANCE.getEnumItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_ITEM__NAME = eINSTANCE.getEnumItem_Name();

		/**
		 * The meta object literal for the '{@link originreq.impl.ContractImpl <em>Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.ContractImpl
		 * @see originreq.impl.OriginreqPackageImpl#getContract()
		 * @generated
		 */
		EClass CONTRACT = eINSTANCE.getContract();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__SERVICE = eINSTANCE.getContract_Service();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__OP = eINSTANCE.getContract_Op();

		/**
		 * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__DEF = eINSTANCE.getContract_Def();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__PRE = eINSTANCE.getContract_Pre();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__POST = eINSTANCE.getContract_Post();

		/**
		 * The meta object literal for the '{@link originreq.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.DefinitionImpl
		 * @see originreq.impl.OriginreqPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__VARIABLE = eINSTANCE.getDefinition_Variable();

		/**
		 * The meta object literal for the '{@link originreq.impl.PreconditionImpl <em>Precondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.PreconditionImpl
		 * @see originreq.impl.OriginreqPackageImpl#getPrecondition()
		 * @generated
		 */
		EClass PRECONDITION = eINSTANCE.getPrecondition();

		/**
		 * The meta object literal for the '<em><b>Oclexp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECONDITION__OCLEXP = eINSTANCE.getPrecondition_Oclexp();

		/**
		 * The meta object literal for the '{@link originreq.impl.PostconditionImpl <em>Postcondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.PostconditionImpl
		 * @see originreq.impl.OriginreqPackageImpl#getPostcondition()
		 * @generated
		 */
		EClass POSTCONDITION = eINSTANCE.getPostcondition();

		/**
		 * The meta object literal for the '<em><b>Oclexp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTCONDITION__OCLEXP = eINSTANCE.getPostcondition_Oclexp();

		/**
		 * The meta object literal for the '{@link originreq.impl.OCLExpressionCSImpl <em>OCL Expression CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.OCLExpressionCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getOCLExpressionCS()
		 * @generated
		 */
		EClass OCL_EXPRESSION_CS = eINSTANCE.getOCLExpressionCS();

		/**
		 * The meta object literal for the '{@link originreq.impl.NestedExpCSImpl <em>Nested Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.NestedExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getNestedExpCS()
		 * @generated
		 */
		EClass NESTED_EXP_CS = eINSTANCE.getNestedExpCS();

		/**
		 * The meta object literal for the '<em><b>Nested Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_EXP_CS__NESTED_EXPRESSION = eINSTANCE.getNestedExpCS_NestedExpression();

		/**
		 * The meta object literal for the '{@link originreq.impl.LogicFormulaExpCSImpl <em>Logic Formula Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.LogicFormulaExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getLogicFormulaExpCS()
		 * @generated
		 */
		EClass LOGIC_FORMULA_EXP_CS = eINSTANCE.getLogicFormulaExpCS();

		/**
		 * The meta object literal for the '<em><b>Atomicexp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_FORMULA_EXP_CS__ATOMICEXP = eINSTANCE.getLogicFormulaExpCS_Atomicexp();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIC_FORMULA_EXP_CS__CONNECTOR = eINSTANCE.getLogicFormulaExpCS_Connector();

		/**
		 * The meta object literal for the '{@link originreq.impl.AtomicExpressionImpl <em>Atomic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.AtomicExpressionImpl
		 * @see originreq.impl.OriginreqPackageImpl#getAtomicExpression()
		 * @generated
		 */
		EClass ATOMIC_EXPRESSION = eINSTANCE.getAtomicExpression();

		/**
		 * The meta object literal for the '<em><b>Leftside</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_EXPRESSION__LEFTSIDE = eINSTANCE.getAtomicExpression_Leftside();

		/**
		 * The meta object literal for the '<em><b>Infixop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_EXPRESSION__INFIXOP = eINSTANCE.getAtomicExpression_Infixop();

		/**
		 * The meta object literal for the '<em><b>Rightside</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_EXPRESSION__RIGHTSIDE = eINSTANCE.getAtomicExpression_Rightside();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_EXPRESSION__OP = eINSTANCE.getAtomicExpression_Op();

		/**
		 * The meta object literal for the '<em><b>Num</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_EXPRESSION__NUM = eINSTANCE.getAtomicExpression_Num();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_EXPRESSION__EXP = eINSTANCE.getAtomicExpression_Exp();

		/**
		 * The meta object literal for the '{@link originreq.impl.LeftSubAtomicExpressionImpl <em>Left Sub Atomic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.LeftSubAtomicExpressionImpl
		 * @see originreq.impl.OriginreqPackageImpl#getLeftSubAtomicExpression()
		 * @generated
		 */
		EClass LEFT_SUB_ATOMIC_EXPRESSION = eINSTANCE.getLeftSubAtomicExpression();

		/**
		 * The meta object literal for the '{@link originreq.impl.RightSubAtomicExpressionImpl <em>Right Sub Atomic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.RightSubAtomicExpressionImpl
		 * @see originreq.impl.OriginreqPackageImpl#getRightSubAtomicExpression()
		 * @generated
		 */
		EClass RIGHT_SUB_ATOMIC_EXPRESSION = eINSTANCE.getRightSubAtomicExpression();

		/**
		 * The meta object literal for the '{@link originreq.impl.CallExpCSImpl <em>Call Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.CallExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getCallExpCS()
		 * @generated
		 */
		EClass CALL_EXP_CS = eINSTANCE.getCallExpCS();

		/**
		 * The meta object literal for the '{@link originreq.impl.LoopExpCSImpl <em>Loop Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.LoopExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getLoopExpCS()
		 * @generated
		 */
		EClass LOOP_EXP_CS = eINSTANCE.getLoopExpCS();

		/**
		 * The meta object literal for the '{@link originreq.impl.IteratorExpCSImpl <em>Iterator Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.IteratorExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getIteratorExpCS()
		 * @generated
		 */
		EClass ITERATOR_EXP_CS = eINSTANCE.getIteratorExpCS();

		/**
		 * The meta object literal for the '<em><b>Object Call</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR_EXP_CS__OBJECT_CALL = eINSTANCE.getIteratorExpCS_ObjectCall();

		/**
		 * The meta object literal for the '<em><b>Simple Call</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATOR_EXP_CS__SIMPLE_CALL = eINSTANCE.getIteratorExpCS_SimpleCall();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATOR_EXP_CS__ITERATOR = eINSTANCE.getIteratorExpCS_Iterator();

		/**
		 * The meta object literal for the '<em><b>Varibles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR_EXP_CS__VARIBLES = eINSTANCE.getIteratorExpCS_Varibles();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR_EXP_CS__EXP = eINSTANCE.getIteratorExpCS_Exp();

		/**
		 * The meta object literal for the '{@link originreq.impl.EntityAttributeNameImpl <em>Entity Attribute Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.EntityAttributeNameImpl
		 * @see originreq.impl.OriginreqPackageImpl#getEntityAttributeName()
		 * @generated
		 */
		EClass ENTITY_ATTRIBUTE_NAME = eINSTANCE.getEntityAttributeName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_ATTRIBUTE_NAME__NAME = eINSTANCE.getEntityAttributeName_Name();

		/**
		 * The meta object literal for the '{@link originreq.impl.ArgumentsCSImpl <em>Arguments CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.ArgumentsCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getArgumentsCS()
		 * @generated
		 */
		EClass ARGUMENTS_CS = eINSTANCE.getArgumentsCS();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENTS_CS__FIRST = eINSTANCE.getArgumentsCS_First();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENTS_CS__NEXT = eINSTANCE.getArgumentsCS_Next();

		/**
		 * The meta object literal for the '{@link originreq.impl.FeatureCallExpCSImpl <em>Feature Call Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.FeatureCallExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getFeatureCallExpCS()
		 * @generated
		 */
		EClass FEATURE_CALL_EXP_CS = eINSTANCE.getFeatureCallExpCS();

		/**
		 * The meta object literal for the '{@link originreq.impl.StandardNavigationCallExpCSImpl <em>Standard Navigation Call Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.StandardNavigationCallExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getStandardNavigationCallExpCS()
		 * @generated
		 */
		EClass STANDARD_NAVIGATION_CALL_EXP_CS = eINSTANCE.getStandardNavigationCallExpCS();

		/**
		 * The meta object literal for the '<em><b>Classifercall</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_NAVIGATION_CALL_EXP_CS__CLASSIFERCALL = eINSTANCE
				.getStandardNavigationCallExpCS_Classifercall();

		/**
		 * The meta object literal for the '<em><b>Propertycall</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_NAVIGATION_CALL_EXP_CS__PROPERTYCALL = eINSTANCE
				.getStandardNavigationCallExpCS_Propertycall();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_NAVIGATION_CALL_EXP_CS__OBJECT = eINSTANCE.getStandardNavigationCallExpCS_Object();

		/**
		 * The meta object literal for the '<em><b>Navop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_NAVIGATION_CALL_EXP_CS__NAVOP = eINSTANCE.getStandardNavigationCallExpCS_Navop();

		/**
		 * The meta object literal for the '<em><b>Standard OP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_NAVIGATION_CALL_EXP_CS__STANDARD_OP = eINSTANCE.getStandardNavigationCallExpCS_StandardOP();

		/**
		 * The meta object literal for the '{@link originreq.impl.StandardOperationExpCSImpl <em>Standard Operation Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.StandardOperationExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getStandardOperationExpCS()
		 * @generated
		 */
		EClass STANDARD_OPERATION_EXP_CS = eINSTANCE.getStandardOperationExpCS();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_OPERATION_EXP_CS__OBJECT = eINSTANCE.getStandardOperationExpCS_Object();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_OPERATION_EXP_CS__PROPERTY = eINSTANCE.getStandardOperationExpCS_Property();

		/**
		 * The meta object literal for the '<em><b>Premark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_OPERATION_EXP_CS__PREMARK = eINSTANCE.getStandardOperationExpCS_Premark();

		/**
		 * The meta object literal for the '<em><b>Predefinedop</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_OPERATION_EXP_CS__PREDEFINEDOP = eINSTANCE.getStandardOperationExpCS_Predefinedop();

		/**
		 * The meta object literal for the '{@link originreq.impl.PredefineOpImpl <em>Predefine Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.PredefineOpImpl
		 * @see originreq.impl.OriginreqPackageImpl#getPredefineOp()
		 * @generated
		 */
		EClass PREDEFINE_OP = eINSTANCE.getPredefineOp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDEFINE_OP__NAME = eINSTANCE.getPredefineOp_Name();

		/**
		 * The meta object literal for the '{@link originreq.impl.StandardNoneParameterOperationImpl <em>Standard None Parameter Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.StandardNoneParameterOperationImpl
		 * @see originreq.impl.OriginreqPackageImpl#getStandardNoneParameterOperation()
		 * @generated
		 */
		EClass STANDARD_NONE_PARAMETER_OPERATION = eINSTANCE.getStandardNoneParameterOperation();

		/**
		 * The meta object literal for the '{@link originreq.impl.StandardParameterOperationImpl <em>Standard Parameter Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.StandardParameterOperationImpl
		 * @see originreq.impl.OriginreqPackageImpl#getStandardParameterOperation()
		 * @generated
		 */
		EClass STANDARD_PARAMETER_OPERATION = eINSTANCE.getStandardParameterOperation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_PARAMETER_OPERATION__TYPE = eINSTANCE.getStandardParameterOperation_Type();

		/**
		 * The meta object literal for the '{@link originreq.impl.StandardCollectionOperationImpl <em>Standard Collection Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.StandardCollectionOperationImpl
		 * @see originreq.impl.OriginreqPackageImpl#getStandardCollectionOperation()
		 * @generated
		 */
		EClass STANDARD_COLLECTION_OPERATION = eINSTANCE.getStandardCollectionOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_COLLECTION_OPERATION__NAME = eINSTANCE.getStandardCollectionOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_COLLECTION_OPERATION__OBJECT = eINSTANCE.getStandardCollectionOperation_Object();

		/**
		 * The meta object literal for the '{@link originreq.impl.StandardDateOperationImpl <em>Standard Date Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.StandardDateOperationImpl
		 * @see originreq.impl.OriginreqPackageImpl#getStandardDateOperation()
		 * @generated
		 */
		EClass STANDARD_DATE_OPERATION = eINSTANCE.getStandardDateOperation();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_DATE_OPERATION__OBJECT = eINSTANCE.getStandardDateOperation_Object();

		/**
		 * The meta object literal for the '<em><b>Datenum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_DATE_OPERATION__DATENUM = eINSTANCE.getStandardDateOperation_Datenum();

		/**
		 * The meta object literal for the '<em><b>Procall</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_DATE_OPERATION__PROCALL = eINSTANCE.getStandardDateOperation_Procall();

		/**
		 * The meta object literal for the '<em><b>Nested</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_DATE_OPERATION__NESTED = eINSTANCE.getStandardDateOperation_Nested();

		/**
		 * The meta object literal for the '{@link originreq.impl.ClassiferCallExpCSImpl <em>Classifer Call Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.ClassiferCallExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getClassiferCallExpCS()
		 * @generated
		 */
		EClass CLASSIFER_CALL_EXP_CS = eINSTANCE.getClassiferCallExpCS();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFER_CALL_EXP_CS__ENTITY = eINSTANCE.getClassiferCallExpCS_Entity();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFER_CALL_EXP_CS__OP = eINSTANCE.getClassiferCallExpCS_Op();

		/**
		 * The meta object literal for the '{@link originreq.impl.PropertyCallExpCSImpl <em>Property Call Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.PropertyCallExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getPropertyCallExpCS()
		 * @generated
		 */
		EClass PROPERTY_CALL_EXP_CS = eINSTANCE.getPropertyCallExpCS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CALL_EXP_CS__NAME = eINSTANCE.getPropertyCallExpCS_Name();

		/**
		 * The meta object literal for the '<em><b>Selfproperty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CALL_EXP_CS__SELFPROPERTY = eINSTANCE.getPropertyCallExpCS_Selfproperty();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_CALL_EXP_CS__ATTRIBUTE = eINSTANCE.getPropertyCallExpCS_Attribute();

		/**
		 * The meta object literal for the '<em><b>Premark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_CALL_EXP_CS__PREMARK = eINSTANCE.getPropertyCallExpCS_Premark();

		/**
		 * The meta object literal for the '{@link originreq.impl.OperationCallExpCSImpl <em>Operation Call Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.OperationCallExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getOperationCallExpCS()
		 * @generated
		 */
		EClass OPERATION_CALL_EXP_CS = eINSTANCE.getOperationCallExpCS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_CALL_EXP_CS__NAME = eINSTANCE.getOperationCallExpCS_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL_EXP_CS__PARAMETERS = eINSTANCE.getOperationCallExpCS_Parameters();

		/**
		 * The meta object literal for the '{@link originreq.impl.OperationParametersImpl <em>Operation Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.OperationParametersImpl
		 * @see originreq.impl.OriginreqPackageImpl#getOperationParameters()
		 * @generated
		 */
		EClass OPERATION_PARAMETERS = eINSTANCE.getOperationParameters();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_PARAMETERS__OBJECT = eINSTANCE.getOperationParameters_Object();

		/**
		 * The meta object literal for the '<em><b>Objectproperty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_PARAMETERS__OBJECTPROPERTY = eINSTANCE.getOperationParameters_Objectproperty();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_PARAMETERS__STRING = eINSTANCE.getOperationParameters_String();

		/**
		 * The meta object literal for the '{@link originreq.impl.VariableExpCSImpl <em>Variable Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.VariableExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getVariableExpCS()
		 * @generated
		 */
		EClass VARIABLE_EXP_CS = eINSTANCE.getVariableExpCS();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_EXP_CS__SYMBOL = eINSTANCE.getVariableExpCS_Symbol();

		/**
		 * The meta object literal for the '{@link originreq.impl.IfExpCSImpl <em>If Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.IfExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getIfExpCS()
		 * @generated
		 */
		EClass IF_EXP_CS = eINSTANCE.getIfExpCS();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXP_CS__CONDITION = eINSTANCE.getIfExpCS_Condition();

		/**
		 * The meta object literal for the '<em><b>Then Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXP_CS__THEN_EXPRESSION = eINSTANCE.getIfExpCS_ThenExpression();

		/**
		 * The meta object literal for the '<em><b>Else Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXP_CS__ELSE_EXPRESSION = eINSTANCE.getIfExpCS_ElseExpression();

		/**
		 * The meta object literal for the '{@link originreq.impl.LetExpCSImpl <em>Let Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.LetExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getLetExpCS()
		 * @generated
		 */
		EClass LET_EXP_CS = eINSTANCE.getLetExpCS();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_EXP_CS__VARIABLE = eINSTANCE.getLetExpCS_Variable();

		/**
		 * The meta object literal for the '<em><b>In Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_EXP_CS__IN_EXPRESSION = eINSTANCE.getLetExpCS_InExpression();

		/**
		 * The meta object literal for the '{@link originreq.impl.VariableDeclarationCSImpl <em>Variable Declaration CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.VariableDeclarationCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getVariableDeclarationCS()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION_CS = eINSTANCE.getVariableDeclarationCS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION_CS__NAME = eINSTANCE.getVariableDeclarationCS_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION_CS__TYPE = eINSTANCE.getVariableDeclarationCS_Type();

		/**
		 * The meta object literal for the '<em><b>Init Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION_CS__INIT_EXPRESSION = eINSTANCE.getVariableDeclarationCS_InitExpression();

		/**
		 * The meta object literal for the '{@link originreq.impl.LiteralExpCSImpl <em>Literal Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.LiteralExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getLiteralExpCS()
		 * @generated
		 */
		EClass LITERAL_EXP_CS = eINSTANCE.getLiteralExpCS();

		/**
		 * The meta object literal for the '{@link originreq.impl.EnumLiteralExpCSImpl <em>Enum Literal Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.EnumLiteralExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getEnumLiteralExpCS()
		 * @generated
		 */
		EClass ENUM_LITERAL_EXP_CS = eINSTANCE.getEnumLiteralExpCS();

		/**
		 * The meta object literal for the '<em><b>Enumname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_LITERAL_EXP_CS__ENUMNAME = eINSTANCE.getEnumLiteralExpCS_Enumname();

		/**
		 * The meta object literal for the '<em><b>Eunmitem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_LITERAL_EXP_CS__EUNMITEM = eINSTANCE.getEnumLiteralExpCS_Eunmitem();

		/**
		 * The meta object literal for the '{@link originreq.impl.TupleLiteralExpCSImpl <em>Tuple Literal Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.TupleLiteralExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getTupleLiteralExpCS()
		 * @generated
		 */
		EClass TUPLE_LITERAL_EXP_CS = eINSTANCE.getTupleLiteralExpCS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUPLE_LITERAL_EXP_CS__NAME = eINSTANCE.getTupleLiteralExpCS_Name();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_LITERAL_EXP_CS__VARIABLES = eINSTANCE.getTupleLiteralExpCS_Variables();

		/**
		 * The meta object literal for the '{@link originreq.impl.TupleTypeCSImpl <em>Tuple Type CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.TupleTypeCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getTupleTypeCS()
		 * @generated
		 */
		EClass TUPLE_TYPE_CS = eINSTANCE.getTupleTypeCS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUPLE_TYPE_CS__NAME = eINSTANCE.getTupleTypeCS_Name();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_TYPE_CS__VARIABLES = eINSTANCE.getTupleTypeCS_Variables();

		/**
		 * The meta object literal for the '{@link originreq.impl.CollectionTypeCSImpl <em>Collection Type CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.CollectionTypeCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getCollectionTypeCS()
		 * @generated
		 */
		EClass COLLECTION_TYPE_CS = eINSTANCE.getCollectionTypeCS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TYPE_CS__NAME = eINSTANCE.getCollectionTypeCS_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TYPE_CS__TYPE = eINSTANCE.getCollectionTypeCS_Type();

		/**
		 * The meta object literal for the '{@link originreq.impl.CollectionLiteralExpCSImpl <em>Collection Literal Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.CollectionLiteralExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getCollectionLiteralExpCS()
		 * @generated
		 */
		EClass COLLECTION_LITERAL_EXP_CS = eINSTANCE.getCollectionLiteralExpCS();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_LITERAL_EXP_CS__KIND = eINSTANCE.getCollectionLiteralExpCS_Kind();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_LITERAL_EXP_CS__PART = eINSTANCE.getCollectionLiteralExpCS_Part();

		/**
		 * The meta object literal for the '{@link originreq.impl.CollectionLiteralPartCSImpl <em>Collection Literal Part CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.CollectionLiteralPartCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getCollectionLiteralPartCS()
		 * @generated
		 */
		EClass COLLECTION_LITERAL_PART_CS = eINSTANCE.getCollectionLiteralPartCS();

		/**
		 * The meta object literal for the '{@link originreq.impl.CollectionRangeCSImpl <em>Collection Range CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.CollectionRangeCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getCollectionRangeCS()
		 * @generated
		 */
		EClass COLLECTION_RANGE_CS = eINSTANCE.getCollectionRangeCS();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_RANGE_CS__FIRST = eINSTANCE.getCollectionRangeCS_First();

		/**
		 * The meta object literal for the '<em><b>Last</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_RANGE_CS__LAST = eINSTANCE.getCollectionRangeCS_Last();

		/**
		 * The meta object literal for the '{@link originreq.impl.CollectionItemImpl <em>Collection Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.CollectionItemImpl
		 * @see originreq.impl.OriginreqPackageImpl#getCollectionItem()
		 * @generated
		 */
		EClass COLLECTION_ITEM = eINSTANCE.getCollectionItem();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_ITEM__ITEM = eINSTANCE.getCollectionItem_Item();

		/**
		 * The meta object literal for the '{@link originreq.impl.PrimitiveLiteralExpCSImpl <em>Primitive Literal Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.PrimitiveLiteralExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getPrimitiveLiteralExpCS()
		 * @generated
		 */
		EClass PRIMITIVE_LITERAL_EXP_CS = eINSTANCE.getPrimitiveLiteralExpCS();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_LITERAL_EXP_CS__SYMBOL = eINSTANCE.getPrimitiveLiteralExpCS_Symbol();

		/**
		 * The meta object literal for the '{@link originreq.impl.NumberLiteralExpCSImpl <em>Number Literal Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.NumberLiteralExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getNumberLiteralExpCS()
		 * @generated
		 */
		EClass NUMBER_LITERAL_EXP_CS = eINSTANCE.getNumberLiteralExpCS();

		/**
		 * The meta object literal for the '{@link originreq.impl.BooleanLiteralExpCSImpl <em>Boolean Literal Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.BooleanLiteralExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getBooleanLiteralExpCS()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL_EXP_CS = eINSTANCE.getBooleanLiteralExpCS();

		/**
		 * The meta object literal for the '{@link originreq.impl.StringLiteralExpCSImpl <em>String Literal Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.StringLiteralExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getStringLiteralExpCS()
		 * @generated
		 */
		EClass STRING_LITERAL_EXP_CS = eINSTANCE.getStringLiteralExpCS();

		/**
		 * The meta object literal for the '{@link originreq.impl.NullLiteralExpCSImpl <em>Null Literal Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.NullLiteralExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getNullLiteralExpCS()
		 * @generated
		 */
		EClass NULL_LITERAL_EXP_CS = eINSTANCE.getNullLiteralExpCS();

		/**
		 * The meta object literal for the '{@link originreq.impl.InvalidLiteralExpCSImpl <em>Invalid Literal Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.InvalidLiteralExpCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getInvalidLiteralExpCS()
		 * @generated
		 */
		EClass INVALID_LITERAL_EXP_CS = eINSTANCE.getInvalidLiteralExpCS();

		/**
		 * The meta object literal for the '{@link originreq.impl.ReservedKeywordCSImpl <em>Reserved Keyword CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.ReservedKeywordCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getReservedKeywordCS()
		 * @generated
		 */
		EClass RESERVED_KEYWORD_CS = eINSTANCE.getReservedKeywordCS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVED_KEYWORD_CS__NAME = eINSTANCE.getReservedKeywordCS_Name();

		/**
		 * The meta object literal for the '{@link originreq.impl.CollectionTypeIdentifierCSImpl <em>Collection Type Identifier CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.CollectionTypeIdentifierCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getCollectionTypeIdentifierCS()
		 * @generated
		 */
		EClass COLLECTION_TYPE_IDENTIFIER_CS = eINSTANCE.getCollectionTypeIdentifierCS();

		/**
		 * The meta object literal for the '{@link originreq.impl.PrimitiveTypeCSImpl <em>Primitive Type CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.PrimitiveTypeCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getPrimitiveTypeCS()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE_CS = eINSTANCE.getPrimitiveTypeCS();

		/**
		 * The meta object literal for the '{@link originreq.impl.OclTypeCSImpl <em>Ocl Type CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see originreq.impl.OclTypeCSImpl
		 * @see originreq.impl.OriginreqPackageImpl#getOclTypeCS()
		 * @generated
		 */
		EClass OCL_TYPE_CS = eINSTANCE.getOclTypeCS();

	}

} //OriginreqPackage
