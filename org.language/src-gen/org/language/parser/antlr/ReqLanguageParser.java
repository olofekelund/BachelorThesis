/*
* generated by Xtext
*/
package org.language.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.language.services.ReqLanguageGrammarAccess;

public class ReqLanguageParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ReqLanguageGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.language.parser.antlr.internal.InternalReqLanguageParser createParser(XtextTokenStream stream) {
		return new org.language.parser.antlr.internal.InternalReqLanguageParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public ReqLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ReqLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}