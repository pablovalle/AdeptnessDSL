/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalAdeptnessParser;
import org.xtext.example.mydsl.services.AdeptnessGrammarAccess;

public class AdeptnessParser extends AbstractAntlrParser {

	@Inject
	private AdeptnessGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAdeptnessParser createParser(XtextTokenStream stream) {
		return new InternalAdeptnessParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Adeptness";
	}

	public AdeptnessGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AdeptnessGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
