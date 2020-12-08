/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalAdeptnessParser;
import org.xtext.example.mydsl.services.AdeptnessGrammarAccess;

public class AdeptnessParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(AdeptnessGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, AdeptnessGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractElementAccess().getAlternatives(), "rule__AbstractElement__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getSig_typeAccess().getAlternatives(), "rule__Sig_type__Alternatives");
			builder.put(grammarAccess.getChecksAccess().getAlternatives_1(), "rule__Checks__Alternatives_1");
			builder.put(grammarAccess.getReasonAccess().getAlternatives_0(), "rule__Reason__Alternatives_0");
			builder.put(grammarAccess.getReferenceAccess().getAlternatives_0(), "rule__Reference__Alternatives_0");
			builder.put(grammarAccess.getPrecondReferenceAccess().getAlternatives_0(), "rule__PrecondReference__Alternatives_0");
			builder.put(grammarAccess.getBound_upAccess().getAlternatives(), "rule__Bound_up__Alternatives");
			builder.put(grammarAccess.getBound_DownAccess().getAlternatives(), "rule__Bound_Down__Alternatives");
			builder.put(grammarAccess.getBAccess().getAlternatives(), "rule__B__Alternatives");
			builder.put(grammarAccess.getTimeTypeAccess().getAlternatives(), "rule__TimeType__Alternatives");
			builder.put(grammarAccess.getAbstractElement2Access().getAlternatives(), "rule__AbstractElement2__Alternatives");
			builder.put(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0(), "rule__Equality__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0(), "rule__Comparison__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0(), "rule__PlusOrMinus__Alternatives_1_0");
			builder.put(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_0_1_0(), "rule__MulOrDiv__OpAlternatives_1_0_1_0");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getAtomicAccess().getAlternatives(), "rule__Atomic__Alternatives");
			builder.put(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0(), "rule__Atomic__ValueAlternatives_2_1_0");
			builder.put(grammarAccess.getImportsAccess().getGroup(), "rule__Imports__Group__0");
			builder.put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getMonitoringFileAccess().getGroup(), "rule__MonitoringFile__Group__0");
			builder.put(grammarAccess.getMonitoringVariableAccess().getGroup(), "rule__MonitoringVariable__Group__0");
			builder.put(grammarAccess.getMonitoringVariableAccess().getGroup_6(), "rule__MonitoringVariable__Group_6__0");
			builder.put(grammarAccess.getSignalAccess().getGroup(), "rule__Signal__Group__0");
			builder.put(grammarAccess.getSignalAccess().getGroup_2(), "rule__Signal__Group_2__0");
			builder.put(grammarAccess.getSignalAccess().getGroup_4(), "rule__Signal__Group_4__0");
			builder.put(grammarAccess.getImportMonitoringPlanAccess().getGroup(), "rule__ImportMonitoringPlan__Group__0");
			builder.put(grammarAccess.getOracleAccess().getGroup(), "rule__Oracle__Group__0");
			builder.put(grammarAccess.getWhenAccess().getGroup(), "rule__When__Group__0");
			builder.put(grammarAccess.getChecksAccess().getGroup(), "rule__Checks__Group__0");
			builder.put(grammarAccess.getDescriptionAccess().getGroup(), "rule__Description__Group__0");
			builder.put(grammarAccess.getFailReasonAccess().getGroup(), "rule__FailReason__Group__0");
			builder.put(grammarAccess.getReasonAccess().getGroup(), "rule__Reason__Group__0");
			builder.put(grammarAccess.getXPeaksAccess().getGroup(), "rule__XPeaks__Group__0");
			builder.put(grammarAccess.getConstDegAccess().getGroup(), "rule__ConstDeg__Group__0");
			builder.put(grammarAccess.getHighTimeAccess().getGroup(), "rule__HighTime__Group__0");
			builder.put(grammarAccess.getHighPeakAccess().getGroup(), "rule__HighPeak__Group__0");
			builder.put(grammarAccess.getReferenceAccess().getGroup(), "rule__Reference__Group__0");
			builder.put(grammarAccess.getPrecondReferenceAccess().getGroup(), "rule__PrecondReference__Group__0");
			builder.put(grammarAccess.getUpperAccess().getGroup(), "rule__Upper__Group__0");
			builder.put(grammarAccess.getLowerAccess().getGroup(), "rule__Lower__Group__0");
			builder.put(grammarAccess.getRangeAccess().getGroup(), "rule__Range__Group__0");
			builder.put(grammarAccess.getGapAccess().getGroup(), "rule__Gap__Group__0");
			builder.put(grammarAccess.getInclusiveBoundAccess().getGroup(), "rule__InclusiveBound__Group__0");
			builder.put(grammarAccess.getDAccess().getGroup(), "rule__D__Group__0");
			builder.put(grammarAccess.getDAccess().getGroup_2(), "rule__D__Group_2__0");
			builder.put(grammarAccess.getDataTypeAccess().getGroup(), "rule__DataType__Group__0");
			builder.put(grammarAccess.getPackageDeclarationAccess().getGroup(), "rule__PackageDeclaration__Group__0");
			builder.put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
			builder.put(grammarAccess.getVariableAccess().getGroup_1(), "rule__Variable__Group_1__0");
			builder.put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
			builder.put(grammarAccess.getOrAccess().getGroup_1(), "rule__Or__Group_1__0");
			builder.put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
			builder.put(grammarAccess.getAndAccess().getGroup_1(), "rule__And__Group_1__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup(), "rule__Equality__Group__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup_1(), "rule__Equality__Group_1__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup_1(), "rule__Comparison__Group_1__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup(), "rule__PlusOrMinus__Group__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup_1(), "rule__PlusOrMinus__Group_1__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0(), "rule__PlusOrMinus__Group_1_0_0__0");
			builder.put(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1(), "rule__PlusOrMinus__Group_1_0_1__0");
			builder.put(grammarAccess.getMulOrDivAccess().getGroup(), "rule__MulOrDiv__Group__0");
			builder.put(grammarAccess.getMulOrDivAccess().getGroup_1(), "rule__MulOrDiv__Group_1__0");
			builder.put(grammarAccess.getMulOrDivAccess().getGroup_1_0(), "rule__MulOrDiv__Group_1_0__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_0(), "rule__Atomic__Group_0__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_1(), "rule__Atomic__Group_1__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_2(), "rule__Atomic__Group_2__0");
			builder.put(grammarAccess.getAdeptnessAccess().getElementsAssignment(), "rule__Adeptness__ElementsAssignment");
			builder.put(grammarAccess.getImportsAccess().getImportedNamespaceAssignment_1(), "rule__Imports__ImportedNamespaceAssignment_1");
			builder.put(grammarAccess.getMonitoringFileAccess().getNameAssignment_1(), "rule__MonitoringFile__NameAssignment_1");
			builder.put(grammarAccess.getMonitoringFileAccess().getMonitoringPlanAssignment_3(), "rule__MonitoringFile__MonitoringPlanAssignment_3");
			builder.put(grammarAccess.getMonitoringPlanAccess().getMonitoringVariablesAssignment(), "rule__MonitoringPlan__MonitoringVariablesAssignment");
			builder.put(grammarAccess.getMonitoringVariableAccess().getNameAssignment_1(), "rule__MonitoringVariable__NameAssignment_1");
			builder.put(grammarAccess.getMonitoringVariableAccess().getMonitoringVariableDatatypeAssignment_5(), "rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5");
			builder.put(grammarAccess.getMonitoringVariableAccess().getMaxAssignment_6_2(), "rule__MonitoringVariable__MaxAssignment_6_2");
			builder.put(grammarAccess.getMonitoringVariableAccess().getMinAssignment_6_5(), "rule__MonitoringVariable__MinAssignment_6_5");
			builder.put(grammarAccess.getSig_typeAccess().getSig_typeAssignment_0(), "rule__Sig_type__Sig_typeAssignment_0");
			builder.put(grammarAccess.getSig_typeAccess().getSig_typeAssignment_1(), "rule__Sig_type__Sig_typeAssignment_1");
			builder.put(grammarAccess.getSig_typeAccess().getSig_typeAssignment_2(), "rule__Sig_type__Sig_typeAssignment_2");
			builder.put(grammarAccess.getSignalAccess().getNameAssignment_1(), "rule__Signal__NameAssignment_1");
			builder.put(grammarAccess.getSignalAccess().getCardinalityNumCPSAssignment_2_1(), "rule__Signal__CardinalityNumCPSAssignment_2_1");
			builder.put(grammarAccess.getSignalAccess().getSuperTypeAssignment_4_1(), "rule__Signal__SuperTypeAssignment_4_1");
			builder.put(grammarAccess.getSignalAccess().getOracleAssignment_5(), "rule__Signal__OracleAssignment_5");
			builder.put(grammarAccess.getImportMonitoringPlanAccess().getImportURIAssignment_1(), "rule__ImportMonitoringPlan__ImportURIAssignment_1");
			builder.put(grammarAccess.getOracleAccess().getNameAssignment_1(), "rule__Oracle__NameAssignment_1");
			builder.put(grammarAccess.getOracleAccess().getWhenAssignment_3(), "rule__Oracle__WhenAssignment_3");
			builder.put(grammarAccess.getOracleAccess().getCheckAssignment_4(), "rule__Oracle__CheckAssignment_4");
			builder.put(grammarAccess.getWhenAccess().getEmAssignment_1(), "rule__When__EmAssignment_1");
			builder.put(grammarAccess.getChecksAccess().getNameAssignment_1_0(), "rule__Checks__NameAssignment_1_0");
			builder.put(grammarAccess.getChecksAccess().getEmAssignment_1_1(), "rule__Checks__EmAssignment_1_1");
			builder.put(grammarAccess.getChecksAccess().getReferenceAssignment_2(), "rule__Checks__ReferenceAssignment_2");
			builder.put(grammarAccess.getChecksAccess().getFailReasonAssignment_3(), "rule__Checks__FailReasonAssignment_3");
			builder.put(grammarAccess.getChecksAccess().getDescriptionAssignment_4(), "rule__Checks__DescriptionAssignment_4");
			builder.put(grammarAccess.getDescriptionAccess().getValueAssignment_1(), "rule__Description__ValueAssignment_1");
			builder.put(grammarAccess.getFailReasonAccess().getReasonAssignment_1(), "rule__FailReason__ReasonAssignment_1");
			builder.put(grammarAccess.getReasonAccess().getHighPeakAssignment_0_0(), "rule__Reason__HighPeakAssignment_0_0");
			builder.put(grammarAccess.getReasonAccess().getHighTimeAssignment_0_1(), "rule__Reason__HighTimeAssignment_0_1");
			builder.put(grammarAccess.getReasonAccess().getConstDegAssignment_0_2(), "rule__Reason__ConstDegAssignment_0_2");
			builder.put(grammarAccess.getReasonAccess().getXPeaksAssignment_0_3(), "rule__Reason__XPeaksAssignment_0_3");
			builder.put(grammarAccess.getXPeaksAccess().getCantAssignment_1(), "rule__XPeaks__CantAssignment_1");
			builder.put(grammarAccess.getXPeaksAccess().getNPeaksAssignment_3(), "rule__XPeaks__NPeaksAssignment_3");
			builder.put(grammarAccess.getXPeaksAccess().getTimeAssignment_5(), "rule__XPeaks__TimeAssignment_5");
			builder.put(grammarAccess.getXPeaksAccess().getUnitAssignment_6(), "rule__XPeaks__UnitAssignment_6");
			builder.put(grammarAccess.getConstDegAccess().getCantAssignment_1(), "rule__ConstDeg__CantAssignment_1");
			builder.put(grammarAccess.getHighTimeAccess().getCantAssignment_1(), "rule__HighTime__CantAssignment_1");
			builder.put(grammarAccess.getHighTimeAccess().getTimeAssignment_3(), "rule__HighTime__TimeAssignment_3");
			builder.put(grammarAccess.getHighTimeAccess().getUnitAssignment_4(), "rule__HighTime__UnitAssignment_4");
			builder.put(grammarAccess.getHighPeakAccess().getCantAssignment_1(), "rule__HighPeak__CantAssignment_1");
			builder.put(grammarAccess.getReferenceAccess().getUpperAssignment_0_0(), "rule__Reference__UpperAssignment_0_0");
			builder.put(grammarAccess.getReferenceAccess().getLowerAssignment_0_1(), "rule__Reference__LowerAssignment_0_1");
			builder.put(grammarAccess.getReferenceAccess().getRangeAssignment_0_2(), "rule__Reference__RangeAssignment_0_2");
			builder.put(grammarAccess.getReferenceAccess().getGapAssignment_0_3(), "rule__Reference__GapAssignment_0_3");
			builder.put(grammarAccess.getPrecondReferenceAccess().getUpperAssignment_0_0(), "rule__PrecondReference__UpperAssignment_0_0");
			builder.put(grammarAccess.getPrecondReferenceAccess().getLowerAssignment_0_1(), "rule__PrecondReference__LowerAssignment_0_1");
			builder.put(grammarAccess.getPrecondReferenceAccess().getRangeAssignment_0_2(), "rule__PrecondReference__RangeAssignment_0_2");
			builder.put(grammarAccess.getPrecondReferenceAccess().getGapAssignment_0_3(), "rule__PrecondReference__GapAssignment_0_3");
			builder.put(grammarAccess.getUpperAccess().getBound_uppAssignment_1(), "rule__Upper__Bound_uppAssignment_1");
			builder.put(grammarAccess.getLowerAccess().getBound_lowerAssignment_1(), "rule__Lower__Bound_lowerAssignment_1");
			builder.put(grammarAccess.getRangeAccess().getBound_lowerAssignment_1(), "rule__Range__Bound_lowerAssignment_1");
			builder.put(grammarAccess.getRangeAccess().getBound_uppAssignment_3(), "rule__Range__Bound_uppAssignment_3");
			builder.put(grammarAccess.getGapAccess().getBound_lowerAssignment_1(), "rule__Gap__Bound_lowerAssignment_1");
			builder.put(grammarAccess.getGapAccess().getBound_uppAssignment_3(), "rule__Gap__Bound_uppAssignment_3");
			builder.put(grammarAccess.getInclusiveBoundAccess().getNameAssignment_1(), "rule__InclusiveBound__NameAssignment_1");
			builder.put(grammarAccess.getInclusiveBoundAccess().getValueAssignment_3(), "rule__InclusiveBound__ValueAssignment_3");
			builder.put(grammarAccess.getBound_upAccess().getValueAssignment_0(), "rule__Bound_up__ValueAssignment_0");
			builder.put(grammarAccess.getBound_upAccess().getVariableAssignment_1(), "rule__Bound_up__VariableAssignment_1");
			builder.put(grammarAccess.getBound_upAccess().getEmAssignment_2(), "rule__Bound_up__EmAssignment_2");
			builder.put(grammarAccess.getBound_DownAccess().getValueAssignment_0(), "rule__Bound_Down__ValueAssignment_0");
			builder.put(grammarAccess.getBound_DownAccess().getVariableAssignment_1(), "rule__Bound_Down__VariableAssignment_1");
			builder.put(grammarAccess.getBound_DownAccess().getEmAssignment_2(), "rule__Bound_Down__EmAssignment_2");
			builder.put(grammarAccess.getBOOLEANAccess().getBoolAssignment(), "rule__BOOLEAN__BoolAssignment");
			builder.put(grammarAccess.getDOUBLEAccess().getDValAssignment(), "rule__DOUBLE__DValAssignment");
			builder.put(grammarAccess.getTimeTypeAccess().getTimeAssignment_0(), "rule__TimeType__TimeAssignment_0");
			builder.put(grammarAccess.getTimeTypeAccess().getTimeAssignment_1(), "rule__TimeType__TimeAssignment_1");
			builder.put(grammarAccess.getTimeTypeAccess().getTimeAssignment_2(), "rule__TimeType__TimeAssignment_2");
			builder.put(grammarAccess.getTimeTypeAccess().getTimeAssignment_3(), "rule__TimeType__TimeAssignment_3");
			builder.put(grammarAccess.getDataTypeAccess().getNameAssignment_1(), "rule__DataType__NameAssignment_1");
			builder.put(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1(), "rule__PackageDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3(), "rule__PackageDeclaration__ElementsAssignment_3");
			builder.put(grammarAccess.getExpressionsModelAccess().getElementsAssignment(), "rule__ExpressionsModel__ElementsAssignment");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment_0(), "rule__Variable__NameAssignment_0");
			builder.put(grammarAccess.getVariableAccess().getExpressionAssignment_1_1(), "rule__Variable__ExpressionAssignment_1_1");
			builder.put(grammarAccess.getMonitoringVariableExpresionAccess().getNameAssignment(), "rule__MonitoringVariableExpresion__NameAssignment");
			builder.put(grammarAccess.getEvalExpressionAccess().getExpressionAssignment(), "rule__EvalExpression__ExpressionAssignment");
			builder.put(grammarAccess.getOrAccess().getRightAssignment_1_2(), "rule__Or__RightAssignment_1_2");
			builder.put(grammarAccess.getAndAccess().getRightAssignment_1_2(), "rule__And__RightAssignment_1_2");
			builder.put(grammarAccess.getEqualityAccess().getOpAssignment_1_1(), "rule__Equality__OpAssignment_1_1");
			builder.put(grammarAccess.getEqualityAccess().getRightAssignment_1_2(), "rule__Equality__RightAssignment_1_2");
			builder.put(grammarAccess.getComparisonAccess().getOpAssignment_1_1(), "rule__Comparison__OpAssignment_1_1");
			builder.put(grammarAccess.getComparisonAccess().getRightAssignment_1_2(), "rule__Comparison__RightAssignment_1_2");
			builder.put(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1(), "rule__PlusOrMinus__RightAssignment_1_1");
			builder.put(grammarAccess.getMulOrDivAccess().getOpAssignment_1_0_1(), "rule__MulOrDiv__OpAssignment_1_0_1");
			builder.put(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1(), "rule__MulOrDiv__RightAssignment_1_1");
			builder.put(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2(), "rule__Primary__ExpressionAssignment_1_2");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_0_1(), "rule__Atomic__ValueAssignment_0_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_1_1(), "rule__Atomic__ValueAssignment_1_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_2_1(), "rule__Atomic__ValueAssignment_2_1");
			builder.put(grammarAccess.getAtomicAccess().getVariableAssignment_3(), "rule__Atomic__VariableAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private AdeptnessGrammarAccess grammarAccess;

	@Override
	protected InternalAdeptnessParser createParser() {
		InternalAdeptnessParser result = new InternalAdeptnessParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AdeptnessGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AdeptnessGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
