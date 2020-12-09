/*
 * generated by Xtext 2.21.0
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
			builder.put(grammarAccess.getOracleAccess().getAlternatives_3(), "rule__Oracle__Alternatives_3");
			builder.put(grammarAccess.getChecksAccess().getAlternatives_1(), "rule__Checks__Alternatives_1");
			builder.put(grammarAccess.getReasonAccess().getAlternatives_0(), "rule__Reason__Alternatives_0");
			builder.put(grammarAccess.getReferenceAccess().getAlternatives_0(), "rule__Reference__Alternatives_0");
			builder.put(grammarAccess.getPrecondReferenceAccess().getAlternatives_0(), "rule__PrecondReference__Alternatives_0");
			builder.put(grammarAccess.getBound_upAccess().getAlternatives(), "rule__Bound_up__Alternatives");
			builder.put(grammarAccess.getBound_DownAccess().getAlternatives(), "rule__Bound_Down__Alternatives");
			builder.put(grammarAccess.getBAccess().getAlternatives(), "rule__B__Alternatives");
			builder.put(grammarAccess.getTimeTypeAccess().getAlternatives(), "rule__TimeType__Alternatives");
			builder.put(grammarAccess.getAbstractElement2Access().getAlternatives_1(), "rule__AbstractElement2__Alternatives_1");
			builder.put(grammarAccess.getOperatorsAccess().getAlternatives(), "rule__Operators__Alternatives");
			builder.put(grammarAccess.getCompOpAccess().getOpAlternatives_0(), "rule__CompOp__OpAlternatives_0");
			builder.put(grammarAccess.getLogicOpAccess().getOpAlternatives_0(), "rule__LogicOp__OpAlternatives_0");
			builder.put(grammarAccess.getOpAccess().getOpAlternatives_0(), "rule__Op__OpAlternatives_0");
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
			builder.put(grammarAccess.getWhileAccess().getGroup(), "rule__While__Group__0");
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
			builder.put(grammarAccess.getSameAccess().getGroup(), "rule__Same__Group__0");
			builder.put(grammarAccess.getNotSameAccess().getGroup(), "rule__NotSame__Group__0");
			builder.put(grammarAccess.getUpperAccess().getGroup(), "rule__Upper__Group__0");
			builder.put(grammarAccess.getLowerAccess().getGroup(), "rule__Lower__Group__0");
			builder.put(grammarAccess.getRangeAccess().getGroup(), "rule__Range__Group__0");
			builder.put(grammarAccess.getGapAccess().getGroup(), "rule__Gap__Group__0");
			builder.put(grammarAccess.getInclusiveBoundAccess().getGroup(), "rule__InclusiveBound__Group__0");
			builder.put(grammarAccess.getDAccess().getGroup(), "rule__D__Group__0");
			builder.put(grammarAccess.getDAccess().getGroup_2(), "rule__D__Group_2__0");
			builder.put(grammarAccess.getDataTypeAccess().getGroup(), "rule__DataType__Group__0");
			builder.put(grammarAccess.getPackageDeclarationAccess().getGroup(), "rule__PackageDeclaration__Group__0");
			builder.put(grammarAccess.getExpressionsModelAccess().getGroup(), "rule__ExpressionsModel__Group__0");
			builder.put(grammarAccess.getAbstractElement2Access().getGroup(), "rule__AbstractElement2__Group__0");
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
			builder.put(grammarAccess.getOracleAccess().getWhenAssignment_3_0(), "rule__Oracle__WhenAssignment_3_0");
			builder.put(grammarAccess.getOracleAccess().getWhileAssignment_3_1(), "rule__Oracle__WhileAssignment_3_1");
			builder.put(grammarAccess.getOracleAccess().getCheckAssignment_4(), "rule__Oracle__CheckAssignment_4");
			builder.put(grammarAccess.getWhileAccess().getEmAssignment_1(), "rule__While__EmAssignment_1");
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
			builder.put(grammarAccess.getReferenceAccess().getSameAssignment_0_4(), "rule__Reference__SameAssignment_0_4");
			builder.put(grammarAccess.getReferenceAccess().getNotsameAssignment_0_5(), "rule__Reference__NotsameAssignment_0_5");
			builder.put(grammarAccess.getPrecondReferenceAccess().getUpperAssignment_0_0(), "rule__PrecondReference__UpperAssignment_0_0");
			builder.put(grammarAccess.getPrecondReferenceAccess().getLowerAssignment_0_1(), "rule__PrecondReference__LowerAssignment_0_1");
			builder.put(grammarAccess.getPrecondReferenceAccess().getRangeAssignment_0_2(), "rule__PrecondReference__RangeAssignment_0_2");
			builder.put(grammarAccess.getPrecondReferenceAccess().getGapAssignment_0_3(), "rule__PrecondReference__GapAssignment_0_3");
			builder.put(grammarAccess.getPrecondReferenceAccess().getSameAssignment_0_4(), "rule__PrecondReference__SameAssignment_0_4");
			builder.put(grammarAccess.getPrecondReferenceAccess().getNotsameAssignment_0_5(), "rule__PrecondReference__NotsameAssignment_0_5");
			builder.put(grammarAccess.getSameAccess().getBound_uppAssignment_1(), "rule__Same__Bound_uppAssignment_1");
			builder.put(grammarAccess.getNotSameAccess().getBound_uppAssignment_1(), "rule__NotSame__Bound_uppAssignment_1");
			builder.put(grammarAccess.getUpperAccess().getBound_uppAssignment_1(), "rule__Upper__Bound_uppAssignment_1");
			builder.put(grammarAccess.getLowerAccess().getBound_lowerAssignment_1(), "rule__Lower__Bound_lowerAssignment_1");
			builder.put(grammarAccess.getRangeAccess().getBound_lowerAssignment_1(), "rule__Range__Bound_lowerAssignment_1");
			builder.put(grammarAccess.getRangeAccess().getBound_uppAssignment_3(), "rule__Range__Bound_uppAssignment_3");
			builder.put(grammarAccess.getGapAccess().getBound_lowerAssignment_1(), "rule__Gap__Bound_lowerAssignment_1");
			builder.put(grammarAccess.getGapAccess().getBound_uppAssignment_3(), "rule__Gap__Bound_uppAssignment_3");
			builder.put(grammarAccess.getInclusiveBoundAccess().getNameAssignment_1(), "rule__InclusiveBound__NameAssignment_1");
			builder.put(grammarAccess.getInclusiveBoundAccess().getValueAssignment_3(), "rule__InclusiveBound__ValueAssignment_3");
			builder.put(grammarAccess.getBound_upAccess().getValueAssignment_0(), "rule__Bound_up__ValueAssignment_0");
			builder.put(grammarAccess.getBound_upAccess().getEmAssignment_1(), "rule__Bound_up__EmAssignment_1");
			builder.put(grammarAccess.getBound_DownAccess().getValueAssignment_0(), "rule__Bound_Down__ValueAssignment_0");
			builder.put(grammarAccess.getBound_DownAccess().getEmAssignment_1(), "rule__Bound_Down__EmAssignment_1");
			builder.put(grammarAccess.getBOOLEANAccess().getBoolAssignment(), "rule__BOOLEAN__BoolAssignment");
			builder.put(grammarAccess.getDOUBLEAccess().getDValAssignment(), "rule__DOUBLE__DValAssignment");
			builder.put(grammarAccess.getTimeTypeAccess().getTimeAssignment_0(), "rule__TimeType__TimeAssignment_0");
			builder.put(grammarAccess.getTimeTypeAccess().getTimeAssignment_1(), "rule__TimeType__TimeAssignment_1");
			builder.put(grammarAccess.getTimeTypeAccess().getTimeAssignment_2(), "rule__TimeType__TimeAssignment_2");
			builder.put(grammarAccess.getTimeTypeAccess().getTimeAssignment_3(), "rule__TimeType__TimeAssignment_3");
			builder.put(grammarAccess.getDataTypeAccess().getNameAssignment_1(), "rule__DataType__NameAssignment_1");
			builder.put(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1(), "rule__PackageDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3(), "rule__PackageDeclaration__ElementsAssignment_3");
			builder.put(grammarAccess.getExpressionsModelAccess().getElementsAssignment_1(), "rule__ExpressionsModel__ElementsAssignment_1");
			builder.put(grammarAccess.getAbstractElement2Access().getNameAssignment_1_0(), "rule__AbstractElement2__NameAssignment_1_0");
			builder.put(grammarAccess.getAbstractElement2Access().getValueAssignment_1_1(), "rule__AbstractElement2__ValueAssignment_1_1");
			builder.put(grammarAccess.getAbstractElement2Access().getOpAssignment_2(), "rule__AbstractElement2__OpAssignment_2");
			builder.put(grammarAccess.getOperatorsAccess().getOperatorAssignment_0(), "rule__Operators__OperatorAssignment_0");
			builder.put(grammarAccess.getOperatorsAccess().getComparationAssignment_1(), "rule__Operators__ComparationAssignment_1");
			builder.put(grammarAccess.getOperatorsAccess().getLogicOperatorAssignment_2(), "rule__Operators__LogicOperatorAssignment_2");
			builder.put(grammarAccess.getCompOpAccess().getOpAssignment(), "rule__CompOp__OpAssignment");
			builder.put(grammarAccess.getLogicOpAccess().getOpAssignment(), "rule__LogicOp__OpAssignment");
			builder.put(grammarAccess.getOpAccess().getOpAssignment(), "rule__Op__OpAssignment");
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
