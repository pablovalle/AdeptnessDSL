/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.adeptness.AbstractElement2;
import org.xtext.example.mydsl.adeptness.Adeptness;
import org.xtext.example.mydsl.adeptness.AdeptnessPackage;
import org.xtext.example.mydsl.adeptness.BOOLEAN;
import org.xtext.example.mydsl.adeptness.Bound_Down;
import org.xtext.example.mydsl.adeptness.Bound_up;
import org.xtext.example.mydsl.adeptness.Checks;
import org.xtext.example.mydsl.adeptness.CompOp;
import org.xtext.example.mydsl.adeptness.ConstDeg;
import org.xtext.example.mydsl.adeptness.DOUBLE;
import org.xtext.example.mydsl.adeptness.DataType;
import org.xtext.example.mydsl.adeptness.Description;
import org.xtext.example.mydsl.adeptness.ExpressionsModel;
import org.xtext.example.mydsl.adeptness.FailReason;
import org.xtext.example.mydsl.adeptness.Gap;
import org.xtext.example.mydsl.adeptness.HighPeak;
import org.xtext.example.mydsl.adeptness.HighTime;
import org.xtext.example.mydsl.adeptness.ImportMonitoringPlan;
import org.xtext.example.mydsl.adeptness.Imports;
import org.xtext.example.mydsl.adeptness.InclusiveBound;
import org.xtext.example.mydsl.adeptness.LogicOp;
import org.xtext.example.mydsl.adeptness.Lower;
import org.xtext.example.mydsl.adeptness.MonitoringFile;
import org.xtext.example.mydsl.adeptness.MonitoringPlan;
import org.xtext.example.mydsl.adeptness.MonitoringVariable;
import org.xtext.example.mydsl.adeptness.NotSame;
import org.xtext.example.mydsl.adeptness.Op;
import org.xtext.example.mydsl.adeptness.Oracle;
import org.xtext.example.mydsl.adeptness.PackageDeclaration;
import org.xtext.example.mydsl.adeptness.PrecondReference;
import org.xtext.example.mydsl.adeptness.Range;
import org.xtext.example.mydsl.adeptness.Reason;
import org.xtext.example.mydsl.adeptness.Reference;
import org.xtext.example.mydsl.adeptness.Same;
import org.xtext.example.mydsl.adeptness.Sig_type;
import org.xtext.example.mydsl.adeptness.Signal;
import org.xtext.example.mydsl.adeptness.TimeType;
import org.xtext.example.mydsl.adeptness.Upper;
import org.xtext.example.mydsl.adeptness.When;
import org.xtext.example.mydsl.adeptness.While;
import org.xtext.example.mydsl.adeptness.XPeaks;
import org.xtext.example.mydsl.services.AdeptnessGrammarAccess;

@SuppressWarnings("all")
public class AdeptnessSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AdeptnessGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AdeptnessPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AdeptnessPackage.ABSTRACT_ELEMENT2:
				sequence_AbstractElement2(context, (AbstractElement2) semanticObject); 
				return; 
			case AdeptnessPackage.ADEPTNESS:
				sequence_Adeptness(context, (Adeptness) semanticObject); 
				return; 
			case AdeptnessPackage.BOOLEAN:
				sequence_BOOLEAN(context, (BOOLEAN) semanticObject); 
				return; 
			case AdeptnessPackage.BOUND_DOWN:
				sequence_Bound_Down(context, (Bound_Down) semanticObject); 
				return; 
			case AdeptnessPackage.BOUND_UP:
				sequence_Bound_up(context, (Bound_up) semanticObject); 
				return; 
			case AdeptnessPackage.CHECKS:
				sequence_Checks(context, (Checks) semanticObject); 
				return; 
			case AdeptnessPackage.COMP_OP:
				sequence_CompOp(context, (CompOp) semanticObject); 
				return; 
			case AdeptnessPackage.CONST_DEG:
				sequence_ConstDeg(context, (ConstDeg) semanticObject); 
				return; 
			case AdeptnessPackage.DOUBLE:
				sequence_DOUBLE(context, (DOUBLE) semanticObject); 
				return; 
			case AdeptnessPackage.DATA_TYPE:
				sequence_DataType(context, (DataType) semanticObject); 
				return; 
			case AdeptnessPackage.DESCRIPTION:
				sequence_Description(context, (Description) semanticObject); 
				return; 
			case AdeptnessPackage.EXPRESSIONS_MODEL:
				sequence_ExpressionsModel(context, (ExpressionsModel) semanticObject); 
				return; 
			case AdeptnessPackage.FAIL_REASON:
				sequence_FailReason(context, (FailReason) semanticObject); 
				return; 
			case AdeptnessPackage.GAP:
				sequence_Gap(context, (Gap) semanticObject); 
				return; 
			case AdeptnessPackage.HIGH_PEAK:
				sequence_HighPeak(context, (HighPeak) semanticObject); 
				return; 
			case AdeptnessPackage.HIGH_TIME:
				sequence_HighTime(context, (HighTime) semanticObject); 
				return; 
			case AdeptnessPackage.IMPORT_MONITORING_PLAN:
				sequence_ImportMonitoringPlan(context, (ImportMonitoringPlan) semanticObject); 
				return; 
			case AdeptnessPackage.IMPORTS:
				sequence_Imports(context, (Imports) semanticObject); 
				return; 
			case AdeptnessPackage.INCLUSIVE_BOUND:
				sequence_InclusiveBound(context, (InclusiveBound) semanticObject); 
				return; 
			case AdeptnessPackage.LOGIC_OP:
				sequence_LogicOp(context, (LogicOp) semanticObject); 
				return; 
			case AdeptnessPackage.LOWER:
				sequence_Lower(context, (Lower) semanticObject); 
				return; 
			case AdeptnessPackage.MONITORING_FILE:
				sequence_MonitoringFile(context, (MonitoringFile) semanticObject); 
				return; 
			case AdeptnessPackage.MONITORING_PLAN:
				sequence_MonitoringPlan(context, (MonitoringPlan) semanticObject); 
				return; 
			case AdeptnessPackage.MONITORING_VARIABLE:
				sequence_MonitoringVariable(context, (MonitoringVariable) semanticObject); 
				return; 
			case AdeptnessPackage.NOT_SAME:
				sequence_NotSame(context, (NotSame) semanticObject); 
				return; 
			case AdeptnessPackage.OP:
				sequence_Op(context, (Op) semanticObject); 
				return; 
			case AdeptnessPackage.ORACLE:
				sequence_Oracle(context, (Oracle) semanticObject); 
				return; 
			case AdeptnessPackage.PACKAGE_DECLARATION:
				sequence_PackageDeclaration(context, (PackageDeclaration) semanticObject); 
				return; 
			case AdeptnessPackage.PRECOND_REFERENCE:
				sequence_PrecondReference(context, (PrecondReference) semanticObject); 
				return; 
			case AdeptnessPackage.RANGE:
				sequence_Range(context, (Range) semanticObject); 
				return; 
			case AdeptnessPackage.REASON:
				sequence_Reason(context, (Reason) semanticObject); 
				return; 
			case AdeptnessPackage.REFERENCE:
				sequence_Reference(context, (Reference) semanticObject); 
				return; 
			case AdeptnessPackage.SAME:
				sequence_Same(context, (Same) semanticObject); 
				return; 
			case AdeptnessPackage.SIG_TYPE:
				sequence_Sig_type(context, (Sig_type) semanticObject); 
				return; 
			case AdeptnessPackage.SIGNAL:
				sequence_Signal(context, (Signal) semanticObject); 
				return; 
			case AdeptnessPackage.TIME_TYPE:
				sequence_TimeType(context, (TimeType) semanticObject); 
				return; 
			case AdeptnessPackage.UPPER:
				sequence_Upper(context, (Upper) semanticObject); 
				return; 
			case AdeptnessPackage.WHEN:
				sequence_When(context, (When) semanticObject); 
				return; 
			case AdeptnessPackage.WHILE:
				sequence_While(context, (While) semanticObject); 
				return; 
			case AdeptnessPackage.XPEAKS:
				sequence_XPeaks(context, (XPeaks) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractElement2 returns AbstractElement2
	 *
	 * Constraint:
	 *     ((name=ID | value=DOUBLE) (operator=Op | comparation=CompOp | logicOperator=LogicOp)?)
	 */
	protected void sequence_AbstractElement2(ISerializationContext context, AbstractElement2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Adeptness returns Adeptness
	 *
	 * Constraint:
	 *     elements+=AbstractElement+
	 */
	protected void sequence_Adeptness(ISerializationContext context, Adeptness semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BOOLEAN returns BOOLEAN
	 *
	 * Constraint:
	 *     bool=b
	 */
	protected void sequence_BOOLEAN(ISerializationContext context, BOOLEAN semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.BOOLEAN__BOOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.BOOLEAN__BOOL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBOOLEANAccess().getBoolBParserRuleCall_0(), semanticObject.isBool());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Bound_Down returns Bound_Down
	 *
	 * Constraint:
	 *     (value=DOUBLE | variable=AbstractElement2 | em=ExpressionsModel)
	 */
	protected void sequence_Bound_Down(ISerializationContext context, Bound_Down semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Bound_up returns Bound_up
	 *
	 * Constraint:
	 *     (value=DOUBLE | variable=AbstractElement2 | em=ExpressionsModel)
	 */
	protected void sequence_Bound_up(ISerializationContext context, Bound_up semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Checks returns Checks
	 *
	 * Constraint:
	 *     ((name=ID | em=ExpressionsModel) reference=Reference failReason+=FailReason+ description=Description)
	 */
	protected void sequence_Checks(ISerializationContext context, Checks semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CompOp returns CompOp
	 *
	 * Constraint:
	 *     (
	 *         op='==' | 
	 *         op='!=' | 
	 *         op='>=' | 
	 *         op='<=' | 
	 *         op='<' | 
	 *         op='>'
	 *     )
	 */
	protected void sequence_CompOp(ISerializationContext context, CompOp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstDeg returns ConstDeg
	 *
	 * Constraint:
	 *     cant=DOUBLE
	 */
	protected void sequence_ConstDeg(ISerializationContext context, ConstDeg semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.CONST_DEG__CANT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.CONST_DEG__CANT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstDegAccess().getCantDOUBLEParserRuleCall_1_0(), semanticObject.getCant());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DOUBLE returns DOUBLE
	 *
	 * Constraint:
	 *     dVal=d
	 */
	protected void sequence_DOUBLE(ISerializationContext context, DOUBLE semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.DOUBLE__DVAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.DOUBLE__DVAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDOUBLEAccess().getDValDParserRuleCall_0(), semanticObject.getDVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns DataType
	 *     Type returns DataType
	 *     DataType returns DataType
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DataType(ISerializationContext context, DataType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Description returns Description
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Description(ISerializationContext context, Description semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.DESCRIPTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.DESCRIPTION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDescriptionAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionsModel returns ExpressionsModel
	 *
	 * Constraint:
	 *     elements+=AbstractElement2*
	 */
	protected void sequence_ExpressionsModel(ISerializationContext context, ExpressionsModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FailReason returns FailReason
	 *
	 * Constraint:
	 *     reason=Reason
	 */
	protected void sequence_FailReason(ISerializationContext context, FailReason semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.FAIL_REASON__REASON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.FAIL_REASON__REASON));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFailReasonAccess().getReasonReasonParserRuleCall_1_0(), semanticObject.getReason());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Gap returns Gap
	 *
	 * Constraint:
	 *     (bound_lower=Bound_Down bound_upp=Bound_up)
	 */
	protected void sequence_Gap(ISerializationContext context, Gap semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.GAP__BOUND_LOWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.GAP__BOUND_LOWER));
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.GAP__BOUND_UPP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.GAP__BOUND_UPP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGapAccess().getBound_lowerBound_DownParserRuleCall_1_0(), semanticObject.getBound_lower());
		feeder.accept(grammarAccess.getGapAccess().getBound_uppBound_upParserRuleCall_3_0(), semanticObject.getBound_upp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     HighPeak returns HighPeak
	 *
	 * Constraint:
	 *     cant=DOUBLE
	 */
	protected void sequence_HighPeak(ISerializationContext context, HighPeak semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.HIGH_PEAK__CANT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.HIGH_PEAK__CANT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHighPeakAccess().getCantDOUBLEParserRuleCall_1_0(), semanticObject.getCant());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     HighTime returns HighTime
	 *
	 * Constraint:
	 *     (cant=DOUBLE time=DOUBLE unit=TimeType)
	 */
	protected void sequence_HighTime(ISerializationContext context, HighTime semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.HIGH_TIME__CANT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.HIGH_TIME__CANT));
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.HIGH_TIME__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.HIGH_TIME__TIME));
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.HIGH_TIME__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.HIGH_TIME__UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHighTimeAccess().getCantDOUBLEParserRuleCall_1_0(), semanticObject.getCant());
		feeder.accept(grammarAccess.getHighTimeAccess().getTimeDOUBLEParserRuleCall_3_0(), semanticObject.getTime());
		feeder.accept(grammarAccess.getHighTimeAccess().getUnitTimeTypeParserRuleCall_4_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ImportMonitoringPlan returns ImportMonitoringPlan
	 *
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_ImportMonitoringPlan(ISerializationContext context, ImportMonitoringPlan semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.IMPORT_MONITORING_PLAN__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.IMPORT_MONITORING_PLAN__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportMonitoringPlanAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns Imports
	 *     Imports returns Imports
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Imports(ISerializationContext context, Imports semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.IMPORTS__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.IMPORTS__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportsAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     InclusiveBound returns InclusiveBound
	 *
	 * Constraint:
	 *     (name=ID value=BOOLEAN)
	 */
	protected void sequence_InclusiveBound(ISerializationContext context, InclusiveBound semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.INCLUSIVE_BOUND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.INCLUSIVE_BOUND__NAME));
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.INCLUSIVE_BOUND__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.INCLUSIVE_BOUND__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInclusiveBoundAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInclusiveBoundAccess().getValueBOOLEANParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LogicOp returns LogicOp
	 *
	 * Constraint:
	 *     (op='&&' | op='||')
	 */
	protected void sequence_LogicOp(ISerializationContext context, LogicOp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Lower returns Lower
	 *
	 * Constraint:
	 *     bound_lower=Bound_Down
	 */
	protected void sequence_Lower(ISerializationContext context, Lower semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.LOWER__BOUND_LOWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.LOWER__BOUND_LOWER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLowerAccess().getBound_lowerBound_DownParserRuleCall_1_0(), semanticObject.getBound_lower());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns MonitoringFile
	 *     Type returns MonitoringFile
	 *     MonitoringFile returns MonitoringFile
	 *
	 * Constraint:
	 *     (name=ID monitoringPlan+=MonitoringPlan+)
	 */
	protected void sequence_MonitoringFile(ISerializationContext context, MonitoringFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MonitoringPlan returns MonitoringPlan
	 *
	 * Constraint:
	 *     monitoringVariables=MonitoringVariable
	 */
	protected void sequence_MonitoringPlan(ISerializationContext context, MonitoringPlan semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.MONITORING_PLAN__MONITORING_VARIABLES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.MONITORING_PLAN__MONITORING_VARIABLES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMonitoringPlanAccess().getMonitoringVariablesMonitoringVariableParserRuleCall_0(), semanticObject.getMonitoringVariables());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MonitoringVariable returns MonitoringVariable
	 *
	 * Constraint:
	 *     (name=ID MonitoringVariableDatatype=Sig_type (max=DOUBLE min=DOUBLE)?)
	 */
	protected void sequence_MonitoringVariable(ISerializationContext context, MonitoringVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NotSame returns NotSame
	 *
	 * Constraint:
	 *     bound_upp=Bound_up
	 */
	protected void sequence_NotSame(ISerializationContext context, NotSame semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.NOT_SAME__BOUND_UPP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.NOT_SAME__BOUND_UPP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotSameAccess().getBound_uppBound_upParserRuleCall_1_0(), semanticObject.getBound_upp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Op returns Op
	 *
	 * Constraint:
	 *     (op='+' | op='-' | op='*' | op='/')
	 */
	protected void sequence_Op(ISerializationContext context, Op semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Oracle returns Oracle
	 *
	 * Constraint:
	 *     (name=ID (when+=When | while+=While)? check+=Checks+)
	 */
	protected void sequence_Oracle(ISerializationContext context, Oracle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns PackageDeclaration
	 *     PackageDeclaration returns PackageDeclaration
	 *
	 * Constraint:
	 *     (name=QualifiedName elements+=AbstractElement*)
	 */
	protected void sequence_PackageDeclaration(ISerializationContext context, PackageDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrecondReference returns PrecondReference
	 *
	 * Constraint:
	 *     (
	 *         upper=Upper | 
	 *         lower=Lower | 
	 *         range=Range | 
	 *         gap=Gap | 
	 *         same=Same | 
	 *         notsame=NotSame
	 *     )
	 */
	protected void sequence_PrecondReference(ISerializationContext context, PrecondReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Range returns Range
	 *
	 * Constraint:
	 *     (bound_lower=Bound_Down bound_upp=Bound_up)
	 */
	protected void sequence_Range(ISerializationContext context, Range semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.RANGE__BOUND_LOWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.RANGE__BOUND_LOWER));
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.RANGE__BOUND_UPP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.RANGE__BOUND_UPP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRangeAccess().getBound_lowerBound_DownParserRuleCall_1_0(), semanticObject.getBound_lower());
		feeder.accept(grammarAccess.getRangeAccess().getBound_uppBound_upParserRuleCall_3_0(), semanticObject.getBound_upp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Reason returns Reason
	 *
	 * Constraint:
	 *     (highPeak=HighPeak | highTime=HighTime | constDeg=ConstDeg | xPeaks=XPeaks)
	 */
	protected void sequence_Reason(ISerializationContext context, Reason semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Reference returns Reference
	 *
	 * Constraint:
	 *     (
	 *         upper=Upper | 
	 *         lower=Lower | 
	 *         range=Range | 
	 *         gap=Gap | 
	 *         same=Same | 
	 *         notsame=NotSame
	 *     )
	 */
	protected void sequence_Reference(ISerializationContext context, Reference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Same returns Same
	 *
	 * Constraint:
	 *     bound_upp=Bound_up
	 */
	protected void sequence_Same(ISerializationContext context, Same semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.SAME__BOUND_UPP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.SAME__BOUND_UPP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSameAccess().getBound_uppBound_upParserRuleCall_1_0(), semanticObject.getBound_upp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Sig_type returns Sig_type
	 *
	 * Constraint:
	 *     (sig_type='boolean' | sig_type='int' | sig_type='double')
	 */
	protected void sequence_Sig_type(ISerializationContext context, Sig_type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns Signal
	 *     Type returns Signal
	 *     Signal returns Signal
	 *
	 * Constraint:
	 *     (name=ID cardinalityNumCPS=INT? superType=[MonitoringFile|QualifiedName]? oracle+=Oracle+)
	 */
	protected void sequence_Signal(ISerializationContext context, Signal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TimeType returns TimeType
	 *
	 * Constraint:
	 *     (time='miliseconds' | time='seconds' | time='minutes' | time='hours')
	 */
	protected void sequence_TimeType(ISerializationContext context, TimeType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Upper returns Upper
	 *
	 * Constraint:
	 *     bound_upp=Bound_up
	 */
	protected void sequence_Upper(ISerializationContext context, Upper semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.UPPER__BOUND_UPP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.UPPER__BOUND_UPP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUpperAccess().getBound_uppBound_upParserRuleCall_1_0(), semanticObject.getBound_upp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     When returns When
	 *
	 * Constraint:
	 *     em=ExpressionsModel
	 */
	protected void sequence_When(ISerializationContext context, When semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.WHEN__EM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.WHEN__EM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWhenAccess().getEmExpressionsModelParserRuleCall_1_0(), semanticObject.getEm());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     While returns While
	 *
	 * Constraint:
	 *     em=ExpressionsModel
	 */
	protected void sequence_While(ISerializationContext context, While semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.WHILE__EM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.WHILE__EM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWhileAccess().getEmExpressionsModelParserRuleCall_1_0(), semanticObject.getEm());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     XPeaks returns XPeaks
	 *
	 * Constraint:
	 *     (cant=DOUBLE nPeaks=DOUBLE time=DOUBLE unit=TimeType)
	 */
	protected void sequence_XPeaks(ISerializationContext context, XPeaks semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.XPEAKS__CANT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.XPEAKS__CANT));
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.XPEAKS__NPEAKS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.XPEAKS__NPEAKS));
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.XPEAKS__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.XPEAKS__TIME));
			if (transientValues.isValueTransient(semanticObject, AdeptnessPackage.Literals.XPEAKS__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdeptnessPackage.Literals.XPEAKS__UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXPeaksAccess().getCantDOUBLEParserRuleCall_1_0(), semanticObject.getCant());
		feeder.accept(grammarAccess.getXPeaksAccess().getNPeaksDOUBLEParserRuleCall_3_0(), semanticObject.getNPeaks());
		feeder.accept(grammarAccess.getXPeaksAccess().getTimeDOUBLEParserRuleCall_5_0(), semanticObject.getTime());
		feeder.accept(grammarAccess.getXPeaksAccess().getUnitTimeTypeParserRuleCall_6_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
}
