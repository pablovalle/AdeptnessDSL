package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.AdeptnessGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAdeptnessParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'import'", "'.*'", "'.'", "'CPS'", "':'", "';'", "'Oracle'", "'checks:'", "'is'", "','", "'fails'", "'if'", "'value'", "'higher'", "'than'", "'in'", "'interval'", "'of'", "'constant'", "'degradation'", "'a'", "'time'", "'highest'", "'below'", "'above'", "'range'", "'between'", "'and'", "'not'", "'-'", "'datatype'", "'package'", "'{'", "'}'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAdeptnessParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAdeptnessParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAdeptnessParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAdeptness.g"; }


    	private AdeptnessGrammarAccess grammarAccess;

    	public void setGrammarAccess(AdeptnessGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleAdeptness"
    // InternalAdeptness.g:53:1: entryRuleAdeptness : ruleAdeptness EOF ;
    public final void entryRuleAdeptness() throws RecognitionException {
        try {
            // InternalAdeptness.g:54:1: ( ruleAdeptness EOF )
            // InternalAdeptness.g:55:1: ruleAdeptness EOF
            {
             before(grammarAccess.getAdeptnessRule()); 
            pushFollow(FOLLOW_1);
            ruleAdeptness();

            state._fsp--;

             after(grammarAccess.getAdeptnessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdeptness"


    // $ANTLR start "ruleAdeptness"
    // InternalAdeptness.g:62:1: ruleAdeptness : ( ( rule__Adeptness__ElementsAssignment )* ) ;
    public final void ruleAdeptness() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:66:2: ( ( ( rule__Adeptness__ElementsAssignment )* ) )
            // InternalAdeptness.g:67:2: ( ( rule__Adeptness__ElementsAssignment )* )
            {
            // InternalAdeptness.g:67:2: ( ( rule__Adeptness__ElementsAssignment )* )
            // InternalAdeptness.g:68:3: ( rule__Adeptness__ElementsAssignment )*
            {
             before(grammarAccess.getAdeptnessAccess().getElementsAssignment()); 
            // InternalAdeptness.g:69:3: ( rule__Adeptness__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==16||(LA1_0>=43 && LA1_0<=44)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAdeptness.g:69:4: rule__Adeptness__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Adeptness__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getAdeptnessAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdeptness"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalAdeptness.g:78:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalAdeptness.g:79:1: ( ruleAbstractElement EOF )
            // InternalAdeptness.g:80:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalAdeptness.g:87:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:91:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalAdeptness.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalAdeptness.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalAdeptness.g:93:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalAdeptness.g:94:3: ( rule__AbstractElement__Alternatives )
            // InternalAdeptness.g:94:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleImport"
    // InternalAdeptness.g:103:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalAdeptness.g:104:1: ( ruleImport EOF )
            // InternalAdeptness.g:105:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalAdeptness.g:112:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:116:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalAdeptness.g:117:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalAdeptness.g:117:2: ( ( rule__Import__Group__0 ) )
            // InternalAdeptness.g:118:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalAdeptness.g:119:3: ( rule__Import__Group__0 )
            // InternalAdeptness.g:119:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalAdeptness.g:128:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalAdeptness.g:129:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalAdeptness.g:130:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalAdeptness.g:137:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:141:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalAdeptness.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalAdeptness.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalAdeptness.g:143:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalAdeptness.g:144:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalAdeptness.g:144:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAdeptness.g:153:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalAdeptness.g:154:1: ( ruleQualifiedName EOF )
            // InternalAdeptness.g:155:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalAdeptness.g:162:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:166:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalAdeptness.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalAdeptness.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalAdeptness.g:168:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalAdeptness.g:169:3: ( rule__QualifiedName__Group__0 )
            // InternalAdeptness.g:169:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleType"
    // InternalAdeptness.g:178:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalAdeptness.g:179:1: ( ruleType EOF )
            // InternalAdeptness.g:180:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalAdeptness.g:187:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:191:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalAdeptness.g:192:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalAdeptness.g:192:2: ( ( rule__Type__Alternatives ) )
            // InternalAdeptness.g:193:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalAdeptness.g:194:3: ( rule__Type__Alternatives )
            // InternalAdeptness.g:194:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSignal"
    // InternalAdeptness.g:203:1: entryRuleSignal : ruleSignal EOF ;
    public final void entryRuleSignal() throws RecognitionException {
        try {
            // InternalAdeptness.g:204:1: ( ruleSignal EOF )
            // InternalAdeptness.g:205:1: ruleSignal EOF
            {
             before(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_1);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getSignalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // InternalAdeptness.g:212:1: ruleSignal : ( ( rule__Signal__Group__0 ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:216:2: ( ( ( rule__Signal__Group__0 ) ) )
            // InternalAdeptness.g:217:2: ( ( rule__Signal__Group__0 ) )
            {
            // InternalAdeptness.g:217:2: ( ( rule__Signal__Group__0 ) )
            // InternalAdeptness.g:218:3: ( rule__Signal__Group__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup()); 
            // InternalAdeptness.g:219:3: ( rule__Signal__Group__0 )
            // InternalAdeptness.g:219:4: rule__Signal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleOracle"
    // InternalAdeptness.g:228:1: entryRuleOracle : ruleOracle EOF ;
    public final void entryRuleOracle() throws RecognitionException {
        try {
            // InternalAdeptness.g:229:1: ( ruleOracle EOF )
            // InternalAdeptness.g:230:1: ruleOracle EOF
            {
             before(grammarAccess.getOracleRule()); 
            pushFollow(FOLLOW_1);
            ruleOracle();

            state._fsp--;

             after(grammarAccess.getOracleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOracle"


    // $ANTLR start "ruleOracle"
    // InternalAdeptness.g:237:1: ruleOracle : ( ( rule__Oracle__Group__0 ) ) ;
    public final void ruleOracle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:241:2: ( ( ( rule__Oracle__Group__0 ) ) )
            // InternalAdeptness.g:242:2: ( ( rule__Oracle__Group__0 ) )
            {
            // InternalAdeptness.g:242:2: ( ( rule__Oracle__Group__0 ) )
            // InternalAdeptness.g:243:3: ( rule__Oracle__Group__0 )
            {
             before(grammarAccess.getOracleAccess().getGroup()); 
            // InternalAdeptness.g:244:3: ( rule__Oracle__Group__0 )
            // InternalAdeptness.g:244:4: rule__Oracle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Oracle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOracleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOracle"


    // $ANTLR start "entryRuleCheck"
    // InternalAdeptness.g:253:1: entryRuleCheck : ruleCheck EOF ;
    public final void entryRuleCheck() throws RecognitionException {
        try {
            // InternalAdeptness.g:254:1: ( ruleCheck EOF )
            // InternalAdeptness.g:255:1: ruleCheck EOF
            {
             before(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_1);
            ruleCheck();

            state._fsp--;

             after(grammarAccess.getCheckRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // InternalAdeptness.g:262:1: ruleCheck : ( ( rule__Check__Group__0 ) ) ;
    public final void ruleCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:266:2: ( ( ( rule__Check__Group__0 ) ) )
            // InternalAdeptness.g:267:2: ( ( rule__Check__Group__0 ) )
            {
            // InternalAdeptness.g:267:2: ( ( rule__Check__Group__0 ) )
            // InternalAdeptness.g:268:3: ( rule__Check__Group__0 )
            {
             before(grammarAccess.getCheckAccess().getGroup()); 
            // InternalAdeptness.g:269:3: ( rule__Check__Group__0 )
            // InternalAdeptness.g:269:4: rule__Check__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Check__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleFailReason"
    // InternalAdeptness.g:278:1: entryRuleFailReason : ruleFailReason EOF ;
    public final void entryRuleFailReason() throws RecognitionException {
        try {
            // InternalAdeptness.g:279:1: ( ruleFailReason EOF )
            // InternalAdeptness.g:280:1: ruleFailReason EOF
            {
             before(grammarAccess.getFailReasonRule()); 
            pushFollow(FOLLOW_1);
            ruleFailReason();

            state._fsp--;

             after(grammarAccess.getFailReasonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFailReason"


    // $ANTLR start "ruleFailReason"
    // InternalAdeptness.g:287:1: ruleFailReason : ( ( rule__FailReason__Group__0 ) ) ;
    public final void ruleFailReason() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:291:2: ( ( ( rule__FailReason__Group__0 ) ) )
            // InternalAdeptness.g:292:2: ( ( rule__FailReason__Group__0 ) )
            {
            // InternalAdeptness.g:292:2: ( ( rule__FailReason__Group__0 ) )
            // InternalAdeptness.g:293:3: ( rule__FailReason__Group__0 )
            {
             before(grammarAccess.getFailReasonAccess().getGroup()); 
            // InternalAdeptness.g:294:3: ( rule__FailReason__Group__0 )
            // InternalAdeptness.g:294:4: rule__FailReason__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FailReason__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFailReasonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFailReason"


    // $ANTLR start "entryRuleHighPeaks"
    // InternalAdeptness.g:303:1: entryRuleHighPeaks : ruleHighPeaks EOF ;
    public final void entryRuleHighPeaks() throws RecognitionException {
        try {
            // InternalAdeptness.g:304:1: ( ruleHighPeaks EOF )
            // InternalAdeptness.g:305:1: ruleHighPeaks EOF
            {
             before(grammarAccess.getHighPeaksRule()); 
            pushFollow(FOLLOW_1);
            ruleHighPeaks();

            state._fsp--;

             after(grammarAccess.getHighPeaksRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHighPeaks"


    // $ANTLR start "ruleHighPeaks"
    // InternalAdeptness.g:312:1: ruleHighPeaks : ( ( rule__HighPeaks__Group__0 ) ) ;
    public final void ruleHighPeaks() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:316:2: ( ( ( rule__HighPeaks__Group__0 ) ) )
            // InternalAdeptness.g:317:2: ( ( rule__HighPeaks__Group__0 ) )
            {
            // InternalAdeptness.g:317:2: ( ( rule__HighPeaks__Group__0 ) )
            // InternalAdeptness.g:318:3: ( rule__HighPeaks__Group__0 )
            {
             before(grammarAccess.getHighPeaksAccess().getGroup()); 
            // InternalAdeptness.g:319:3: ( rule__HighPeaks__Group__0 )
            // InternalAdeptness.g:319:4: rule__HighPeaks__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HighPeaks__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHighPeaksAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHighPeaks"


    // $ANTLR start "entryRuleConstDeg"
    // InternalAdeptness.g:328:1: entryRuleConstDeg : ruleConstDeg EOF ;
    public final void entryRuleConstDeg() throws RecognitionException {
        try {
            // InternalAdeptness.g:329:1: ( ruleConstDeg EOF )
            // InternalAdeptness.g:330:1: ruleConstDeg EOF
            {
             before(grammarAccess.getConstDegRule()); 
            pushFollow(FOLLOW_1);
            ruleConstDeg();

            state._fsp--;

             after(grammarAccess.getConstDegRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstDeg"


    // $ANTLR start "ruleConstDeg"
    // InternalAdeptness.g:337:1: ruleConstDeg : ( ( rule__ConstDeg__Group__0 ) ) ;
    public final void ruleConstDeg() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:341:2: ( ( ( rule__ConstDeg__Group__0 ) ) )
            // InternalAdeptness.g:342:2: ( ( rule__ConstDeg__Group__0 ) )
            {
            // InternalAdeptness.g:342:2: ( ( rule__ConstDeg__Group__0 ) )
            // InternalAdeptness.g:343:3: ( rule__ConstDeg__Group__0 )
            {
             before(grammarAccess.getConstDegAccess().getGroup()); 
            // InternalAdeptness.g:344:3: ( rule__ConstDeg__Group__0 )
            // InternalAdeptness.g:344:4: rule__ConstDeg__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConstDeg__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstDegAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstDeg"


    // $ANTLR start "entryRuleHighTime"
    // InternalAdeptness.g:353:1: entryRuleHighTime : ruleHighTime EOF ;
    public final void entryRuleHighTime() throws RecognitionException {
        try {
            // InternalAdeptness.g:354:1: ( ruleHighTime EOF )
            // InternalAdeptness.g:355:1: ruleHighTime EOF
            {
             before(grammarAccess.getHighTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleHighTime();

            state._fsp--;

             after(grammarAccess.getHighTimeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHighTime"


    // $ANTLR start "ruleHighTime"
    // InternalAdeptness.g:362:1: ruleHighTime : ( ( rule__HighTime__Group__0 ) ) ;
    public final void ruleHighTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:366:2: ( ( ( rule__HighTime__Group__0 ) ) )
            // InternalAdeptness.g:367:2: ( ( rule__HighTime__Group__0 ) )
            {
            // InternalAdeptness.g:367:2: ( ( rule__HighTime__Group__0 ) )
            // InternalAdeptness.g:368:3: ( rule__HighTime__Group__0 )
            {
             before(grammarAccess.getHighTimeAccess().getGroup()); 
            // InternalAdeptness.g:369:3: ( rule__HighTime__Group__0 )
            // InternalAdeptness.g:369:4: rule__HighTime__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HighTime__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHighTimeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHighTime"


    // $ANTLR start "entryRuleHighPeak"
    // InternalAdeptness.g:378:1: entryRuleHighPeak : ruleHighPeak EOF ;
    public final void entryRuleHighPeak() throws RecognitionException {
        try {
            // InternalAdeptness.g:379:1: ( ruleHighPeak EOF )
            // InternalAdeptness.g:380:1: ruleHighPeak EOF
            {
             before(grammarAccess.getHighPeakRule()); 
            pushFollow(FOLLOW_1);
            ruleHighPeak();

            state._fsp--;

             after(grammarAccess.getHighPeakRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHighPeak"


    // $ANTLR start "ruleHighPeak"
    // InternalAdeptness.g:387:1: ruleHighPeak : ( ( rule__HighPeak__Group__0 ) ) ;
    public final void ruleHighPeak() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:391:2: ( ( ( rule__HighPeak__Group__0 ) ) )
            // InternalAdeptness.g:392:2: ( ( rule__HighPeak__Group__0 ) )
            {
            // InternalAdeptness.g:392:2: ( ( rule__HighPeak__Group__0 ) )
            // InternalAdeptness.g:393:3: ( rule__HighPeak__Group__0 )
            {
             before(grammarAccess.getHighPeakAccess().getGroup()); 
            // InternalAdeptness.g:394:3: ( rule__HighPeak__Group__0 )
            // InternalAdeptness.g:394:4: rule__HighPeak__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HighPeak__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHighPeakAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHighPeak"


    // $ANTLR start "entryRuleReference"
    // InternalAdeptness.g:403:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalAdeptness.g:404:1: ( ruleReference EOF )
            // InternalAdeptness.g:405:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalAdeptness.g:412:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:416:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalAdeptness.g:417:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalAdeptness.g:417:2: ( ( rule__Reference__Group__0 ) )
            // InternalAdeptness.g:418:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalAdeptness.g:419:3: ( rule__Reference__Group__0 )
            // InternalAdeptness.g:419:4: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleUpper"
    // InternalAdeptness.g:428:1: entryRuleUpper : ruleUpper EOF ;
    public final void entryRuleUpper() throws RecognitionException {
        try {
            // InternalAdeptness.g:429:1: ( ruleUpper EOF )
            // InternalAdeptness.g:430:1: ruleUpper EOF
            {
             before(grammarAccess.getUpperRule()); 
            pushFollow(FOLLOW_1);
            ruleUpper();

            state._fsp--;

             after(grammarAccess.getUpperRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUpper"


    // $ANTLR start "ruleUpper"
    // InternalAdeptness.g:437:1: ruleUpper : ( ( rule__Upper__Group__0 ) ) ;
    public final void ruleUpper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:441:2: ( ( ( rule__Upper__Group__0 ) ) )
            // InternalAdeptness.g:442:2: ( ( rule__Upper__Group__0 ) )
            {
            // InternalAdeptness.g:442:2: ( ( rule__Upper__Group__0 ) )
            // InternalAdeptness.g:443:3: ( rule__Upper__Group__0 )
            {
             before(grammarAccess.getUpperAccess().getGroup()); 
            // InternalAdeptness.g:444:3: ( rule__Upper__Group__0 )
            // InternalAdeptness.g:444:4: rule__Upper__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Upper__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpperAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUpper"


    // $ANTLR start "entryRuleLower"
    // InternalAdeptness.g:453:1: entryRuleLower : ruleLower EOF ;
    public final void entryRuleLower() throws RecognitionException {
        try {
            // InternalAdeptness.g:454:1: ( ruleLower EOF )
            // InternalAdeptness.g:455:1: ruleLower EOF
            {
             before(grammarAccess.getLowerRule()); 
            pushFollow(FOLLOW_1);
            ruleLower();

            state._fsp--;

             after(grammarAccess.getLowerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLower"


    // $ANTLR start "ruleLower"
    // InternalAdeptness.g:462:1: ruleLower : ( ( rule__Lower__Group__0 ) ) ;
    public final void ruleLower() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:466:2: ( ( ( rule__Lower__Group__0 ) ) )
            // InternalAdeptness.g:467:2: ( ( rule__Lower__Group__0 ) )
            {
            // InternalAdeptness.g:467:2: ( ( rule__Lower__Group__0 ) )
            // InternalAdeptness.g:468:3: ( rule__Lower__Group__0 )
            {
             before(grammarAccess.getLowerAccess().getGroup()); 
            // InternalAdeptness.g:469:3: ( rule__Lower__Group__0 )
            // InternalAdeptness.g:469:4: rule__Lower__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lower__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLowerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLower"


    // $ANTLR start "entryRuleRange"
    // InternalAdeptness.g:478:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // InternalAdeptness.g:479:1: ( ruleRange EOF )
            // InternalAdeptness.g:480:1: ruleRange EOF
            {
             before(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getRangeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalAdeptness.g:487:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:491:2: ( ( ( rule__Range__Group__0 ) ) )
            // InternalAdeptness.g:492:2: ( ( rule__Range__Group__0 ) )
            {
            // InternalAdeptness.g:492:2: ( ( rule__Range__Group__0 ) )
            // InternalAdeptness.g:493:3: ( rule__Range__Group__0 )
            {
             before(grammarAccess.getRangeAccess().getGroup()); 
            // InternalAdeptness.g:494:3: ( rule__Range__Group__0 )
            // InternalAdeptness.g:494:4: rule__Range__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleGap"
    // InternalAdeptness.g:503:1: entryRuleGap : ruleGap EOF ;
    public final void entryRuleGap() throws RecognitionException {
        try {
            // InternalAdeptness.g:504:1: ( ruleGap EOF )
            // InternalAdeptness.g:505:1: ruleGap EOF
            {
             before(grammarAccess.getGapRule()); 
            pushFollow(FOLLOW_1);
            ruleGap();

            state._fsp--;

             after(grammarAccess.getGapRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGap"


    // $ANTLR start "ruleGap"
    // InternalAdeptness.g:512:1: ruleGap : ( ( rule__Gap__Group__0 ) ) ;
    public final void ruleGap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:516:2: ( ( ( rule__Gap__Group__0 ) ) )
            // InternalAdeptness.g:517:2: ( ( rule__Gap__Group__0 ) )
            {
            // InternalAdeptness.g:517:2: ( ( rule__Gap__Group__0 ) )
            // InternalAdeptness.g:518:3: ( rule__Gap__Group__0 )
            {
             before(grammarAccess.getGapAccess().getGroup()); 
            // InternalAdeptness.g:519:3: ( rule__Gap__Group__0 )
            // InternalAdeptness.g:519:4: rule__Gap__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Gap__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGapAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGap"


    // $ANTLR start "entryRuleBound_up"
    // InternalAdeptness.g:528:1: entryRuleBound_up : ruleBound_up EOF ;
    public final void entryRuleBound_up() throws RecognitionException {
        try {
            // InternalAdeptness.g:529:1: ( ruleBound_up EOF )
            // InternalAdeptness.g:530:1: ruleBound_up EOF
            {
             before(grammarAccess.getBound_upRule()); 
            pushFollow(FOLLOW_1);
            ruleBound_up();

            state._fsp--;

             after(grammarAccess.getBound_upRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBound_up"


    // $ANTLR start "ruleBound_up"
    // InternalAdeptness.g:537:1: ruleBound_up : ( ( rule__Bound_up__ValueAssignment ) ) ;
    public final void ruleBound_up() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:541:2: ( ( ( rule__Bound_up__ValueAssignment ) ) )
            // InternalAdeptness.g:542:2: ( ( rule__Bound_up__ValueAssignment ) )
            {
            // InternalAdeptness.g:542:2: ( ( rule__Bound_up__ValueAssignment ) )
            // InternalAdeptness.g:543:3: ( rule__Bound_up__ValueAssignment )
            {
             before(grammarAccess.getBound_upAccess().getValueAssignment()); 
            // InternalAdeptness.g:544:3: ( rule__Bound_up__ValueAssignment )
            // InternalAdeptness.g:544:4: rule__Bound_up__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Bound_up__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBound_upAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBound_up"


    // $ANTLR start "entryRuleBound_Down"
    // InternalAdeptness.g:553:1: entryRuleBound_Down : ruleBound_Down EOF ;
    public final void entryRuleBound_Down() throws RecognitionException {
        try {
            // InternalAdeptness.g:554:1: ( ruleBound_Down EOF )
            // InternalAdeptness.g:555:1: ruleBound_Down EOF
            {
             before(grammarAccess.getBound_DownRule()); 
            pushFollow(FOLLOW_1);
            ruleBound_Down();

            state._fsp--;

             after(grammarAccess.getBound_DownRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBound_Down"


    // $ANTLR start "ruleBound_Down"
    // InternalAdeptness.g:562:1: ruleBound_Down : ( ( rule__Bound_Down__ValueAssignment ) ) ;
    public final void ruleBound_Down() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:566:2: ( ( ( rule__Bound_Down__ValueAssignment ) ) )
            // InternalAdeptness.g:567:2: ( ( rule__Bound_Down__ValueAssignment ) )
            {
            // InternalAdeptness.g:567:2: ( ( rule__Bound_Down__ValueAssignment ) )
            // InternalAdeptness.g:568:3: ( rule__Bound_Down__ValueAssignment )
            {
             before(grammarAccess.getBound_DownAccess().getValueAssignment()); 
            // InternalAdeptness.g:569:3: ( rule__Bound_Down__ValueAssignment )
            // InternalAdeptness.g:569:4: rule__Bound_Down__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Bound_Down__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBound_DownAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBound_Down"


    // $ANTLR start "entryRuleBOOLEAN"
    // InternalAdeptness.g:578:1: entryRuleBOOLEAN : ruleBOOLEAN EOF ;
    public final void entryRuleBOOLEAN() throws RecognitionException {
        try {
            // InternalAdeptness.g:579:1: ( ruleBOOLEAN EOF )
            // InternalAdeptness.g:580:1: ruleBOOLEAN EOF
            {
             before(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_1);
            ruleBOOLEAN();

            state._fsp--;

             after(grammarAccess.getBOOLEANRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // InternalAdeptness.g:587:1: ruleBOOLEAN : ( ( rule__BOOLEAN__BoolAssignment ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:591:2: ( ( ( rule__BOOLEAN__BoolAssignment ) ) )
            // InternalAdeptness.g:592:2: ( ( rule__BOOLEAN__BoolAssignment ) )
            {
            // InternalAdeptness.g:592:2: ( ( rule__BOOLEAN__BoolAssignment ) )
            // InternalAdeptness.g:593:3: ( rule__BOOLEAN__BoolAssignment )
            {
             before(grammarAccess.getBOOLEANAccess().getBoolAssignment()); 
            // InternalAdeptness.g:594:3: ( rule__BOOLEAN__BoolAssignment )
            // InternalAdeptness.g:594:4: rule__BOOLEAN__BoolAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BOOLEAN__BoolAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBOOLEANAccess().getBoolAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "entryRuleb"
    // InternalAdeptness.g:603:1: entryRuleb : ruleb EOF ;
    public final void entryRuleb() throws RecognitionException {
        try {
            // InternalAdeptness.g:604:1: ( ruleb EOF )
            // InternalAdeptness.g:605:1: ruleb EOF
            {
             before(grammarAccess.getBRule()); 
            pushFollow(FOLLOW_1);
            ruleb();

            state._fsp--;

             after(grammarAccess.getBRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleb"


    // $ANTLR start "ruleb"
    // InternalAdeptness.g:612:1: ruleb : ( ( rule__B__Alternatives ) ) ;
    public final void ruleb() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:616:2: ( ( ( rule__B__Alternatives ) ) )
            // InternalAdeptness.g:617:2: ( ( rule__B__Alternatives ) )
            {
            // InternalAdeptness.g:617:2: ( ( rule__B__Alternatives ) )
            // InternalAdeptness.g:618:3: ( rule__B__Alternatives )
            {
             before(grammarAccess.getBAccess().getAlternatives()); 
            // InternalAdeptness.g:619:3: ( rule__B__Alternatives )
            // InternalAdeptness.g:619:4: rule__B__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__B__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleb"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalAdeptness.g:628:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalAdeptness.g:629:1: ( ruleDOUBLE EOF )
            // InternalAdeptness.g:630:1: ruleDOUBLE EOF
            {
             before(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalAdeptness.g:637:1: ruleDOUBLE : ( ( rule__DOUBLE__DValAssignment ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:641:2: ( ( ( rule__DOUBLE__DValAssignment ) ) )
            // InternalAdeptness.g:642:2: ( ( rule__DOUBLE__DValAssignment ) )
            {
            // InternalAdeptness.g:642:2: ( ( rule__DOUBLE__DValAssignment ) )
            // InternalAdeptness.g:643:3: ( rule__DOUBLE__DValAssignment )
            {
             before(grammarAccess.getDOUBLEAccess().getDValAssignment()); 
            // InternalAdeptness.g:644:3: ( rule__DOUBLE__DValAssignment )
            // InternalAdeptness.g:644:4: rule__DOUBLE__DValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__DValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDOUBLEAccess().getDValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRuled"
    // InternalAdeptness.g:653:1: entryRuled : ruled EOF ;
    public final void entryRuled() throws RecognitionException {
        try {
            // InternalAdeptness.g:654:1: ( ruled EOF )
            // InternalAdeptness.g:655:1: ruled EOF
            {
             before(grammarAccess.getDRule()); 
            pushFollow(FOLLOW_1);
            ruled();

            state._fsp--;

             after(grammarAccess.getDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuled"


    // $ANTLR start "ruled"
    // InternalAdeptness.g:662:1: ruled : ( ( rule__D__Group__0 ) ) ;
    public final void ruled() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:666:2: ( ( ( rule__D__Group__0 ) ) )
            // InternalAdeptness.g:667:2: ( ( rule__D__Group__0 ) )
            {
            // InternalAdeptness.g:667:2: ( ( rule__D__Group__0 ) )
            // InternalAdeptness.g:668:3: ( rule__D__Group__0 )
            {
             before(grammarAccess.getDAccess().getGroup()); 
            // InternalAdeptness.g:669:3: ( rule__D__Group__0 )
            // InternalAdeptness.g:669:4: rule__D__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__D__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruled"


    // $ANTLR start "entryRuleDataType"
    // InternalAdeptness.g:678:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalAdeptness.g:679:1: ( ruleDataType EOF )
            // InternalAdeptness.g:680:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalAdeptness.g:687:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:691:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalAdeptness.g:692:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalAdeptness.g:692:2: ( ( rule__DataType__Group__0 ) )
            // InternalAdeptness.g:693:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalAdeptness.g:694:3: ( rule__DataType__Group__0 )
            // InternalAdeptness.g:694:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalAdeptness.g:703:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // InternalAdeptness.g:704:1: ( rulePackageDeclaration EOF )
            // InternalAdeptness.g:705:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalAdeptness.g:712:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:716:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // InternalAdeptness.g:717:2: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // InternalAdeptness.g:717:2: ( ( rule__PackageDeclaration__Group__0 ) )
            // InternalAdeptness.g:718:3: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // InternalAdeptness.g:719:3: ( rule__PackageDeclaration__Group__0 )
            // InternalAdeptness.g:719:4: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalAdeptness.g:727:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:731:1: ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt2=1;
                }
                break;
            case 16:
            case 43:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAdeptness.g:732:2: ( rulePackageDeclaration )
                    {
                    // InternalAdeptness.g:732:2: ( rulePackageDeclaration )
                    // InternalAdeptness.g:733:3: rulePackageDeclaration
                    {
                     before(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePackageDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:738:2: ( ruleType )
                    {
                    // InternalAdeptness.g:738:2: ( ruleType )
                    // InternalAdeptness.g:739:3: ruleType
                    {
                     before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:744:2: ( ruleImport )
                    {
                    // InternalAdeptness.g:744:2: ( ruleImport )
                    // InternalAdeptness.g:745:3: ruleImport
                    {
                     before(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalAdeptness.g:754:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleSignal ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:758:1: ( ( ruleDataType ) | ( ruleSignal ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==43) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAdeptness.g:759:2: ( ruleDataType )
                    {
                    // InternalAdeptness.g:759:2: ( ruleDataType )
                    // InternalAdeptness.g:760:3: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:765:2: ( ruleSignal )
                    {
                    // InternalAdeptness.g:765:2: ( ruleSignal )
                    // InternalAdeptness.g:766:3: ruleSignal
                    {
                     before(grammarAccess.getTypeAccess().getSignalParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSignal();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getSignalParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__FailReason__Alternatives_3"
    // InternalAdeptness.g:775:1: rule__FailReason__Alternatives_3 : ( ( ( rule__FailReason__HighPeakAssignment_3_0 ) ) | ( ( rule__FailReason__HighTimeAssignment_3_1 ) ) | ( ( rule__FailReason__ConstDegAssignment_3_2 ) ) | ( ( rule__FailReason__HigPeaksAssignment_3_3 ) ) );
    public final void rule__FailReason__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:779:1: ( ( ( rule__FailReason__HighPeakAssignment_3_0 ) ) | ( ( rule__FailReason__HighTimeAssignment_3_1 ) ) | ( ( rule__FailReason__ConstDegAssignment_3_2 ) ) | ( ( rule__FailReason__HigPeaksAssignment_3_3 ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 31:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalAdeptness.g:780:2: ( ( rule__FailReason__HighPeakAssignment_3_0 ) )
                    {
                    // InternalAdeptness.g:780:2: ( ( rule__FailReason__HighPeakAssignment_3_0 ) )
                    // InternalAdeptness.g:781:3: ( rule__FailReason__HighPeakAssignment_3_0 )
                    {
                     before(grammarAccess.getFailReasonAccess().getHighPeakAssignment_3_0()); 
                    // InternalAdeptness.g:782:3: ( rule__FailReason__HighPeakAssignment_3_0 )
                    // InternalAdeptness.g:782:4: rule__FailReason__HighPeakAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FailReason__HighPeakAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFailReasonAccess().getHighPeakAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:786:2: ( ( rule__FailReason__HighTimeAssignment_3_1 ) )
                    {
                    // InternalAdeptness.g:786:2: ( ( rule__FailReason__HighTimeAssignment_3_1 ) )
                    // InternalAdeptness.g:787:3: ( rule__FailReason__HighTimeAssignment_3_1 )
                    {
                     before(grammarAccess.getFailReasonAccess().getHighTimeAssignment_3_1()); 
                    // InternalAdeptness.g:788:3: ( rule__FailReason__HighTimeAssignment_3_1 )
                    // InternalAdeptness.g:788:4: rule__FailReason__HighTimeAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FailReason__HighTimeAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFailReasonAccess().getHighTimeAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:792:2: ( ( rule__FailReason__ConstDegAssignment_3_2 ) )
                    {
                    // InternalAdeptness.g:792:2: ( ( rule__FailReason__ConstDegAssignment_3_2 ) )
                    // InternalAdeptness.g:793:3: ( rule__FailReason__ConstDegAssignment_3_2 )
                    {
                     before(grammarAccess.getFailReasonAccess().getConstDegAssignment_3_2()); 
                    // InternalAdeptness.g:794:3: ( rule__FailReason__ConstDegAssignment_3_2 )
                    // InternalAdeptness.g:794:4: rule__FailReason__ConstDegAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FailReason__ConstDegAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFailReasonAccess().getConstDegAssignment_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:798:2: ( ( rule__FailReason__HigPeaksAssignment_3_3 ) )
                    {
                    // InternalAdeptness.g:798:2: ( ( rule__FailReason__HigPeaksAssignment_3_3 ) )
                    // InternalAdeptness.g:799:3: ( rule__FailReason__HigPeaksAssignment_3_3 )
                    {
                     before(grammarAccess.getFailReasonAccess().getHigPeaksAssignment_3_3()); 
                    // InternalAdeptness.g:800:3: ( rule__FailReason__HigPeaksAssignment_3_3 )
                    // InternalAdeptness.g:800:4: rule__FailReason__HigPeaksAssignment_3_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FailReason__HigPeaksAssignment_3_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFailReasonAccess().getHigPeaksAssignment_3_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FailReason__Alternatives_3"


    // $ANTLR start "rule__ConstDeg__Alternatives_2"
    // InternalAdeptness.g:808:1: rule__ConstDeg__Alternatives_2 : ( ( ( rule__ConstDeg__UpperAssignment_2_0 ) ) | ( ( rule__ConstDeg__LowerAssignment_2_1 ) ) );
    public final void rule__ConstDeg__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:812:1: ( ( ( rule__ConstDeg__UpperAssignment_2_0 ) ) | ( ( rule__ConstDeg__LowerAssignment_2_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==36) ) {
                alt5=1;
            }
            else if ( (LA5_0==37) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAdeptness.g:813:2: ( ( rule__ConstDeg__UpperAssignment_2_0 ) )
                    {
                    // InternalAdeptness.g:813:2: ( ( rule__ConstDeg__UpperAssignment_2_0 ) )
                    // InternalAdeptness.g:814:3: ( rule__ConstDeg__UpperAssignment_2_0 )
                    {
                     before(grammarAccess.getConstDegAccess().getUpperAssignment_2_0()); 
                    // InternalAdeptness.g:815:3: ( rule__ConstDeg__UpperAssignment_2_0 )
                    // InternalAdeptness.g:815:4: rule__ConstDeg__UpperAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstDeg__UpperAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstDegAccess().getUpperAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:819:2: ( ( rule__ConstDeg__LowerAssignment_2_1 ) )
                    {
                    // InternalAdeptness.g:819:2: ( ( rule__ConstDeg__LowerAssignment_2_1 ) )
                    // InternalAdeptness.g:820:3: ( rule__ConstDeg__LowerAssignment_2_1 )
                    {
                     before(grammarAccess.getConstDegAccess().getLowerAssignment_2_1()); 
                    // InternalAdeptness.g:821:3: ( rule__ConstDeg__LowerAssignment_2_1 )
                    // InternalAdeptness.g:821:4: rule__ConstDeg__LowerAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstDeg__LowerAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstDegAccess().getLowerAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstDeg__Alternatives_2"


    // $ANTLR start "rule__Reference__Alternatives_0"
    // InternalAdeptness.g:829:1: rule__Reference__Alternatives_0 : ( ( ( rule__Reference__UpperAssignment_0_0 ) ) | ( ( rule__Reference__LowerAssignment_0_1 ) ) | ( ( rule__Reference__RangeAssignment_0_2 ) ) | ( ( rule__Reference__GapAssignment_0_3 ) ) );
    public final void rule__Reference__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:833:1: ( ( ( rule__Reference__UpperAssignment_0_0 ) ) | ( ( rule__Reference__LowerAssignment_0_1 ) ) | ( ( rule__Reference__RangeAssignment_0_2 ) ) | ( ( rule__Reference__GapAssignment_0_3 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt6=1;
                }
                break;
            case 37:
                {
                alt6=2;
                }
                break;
            case 28:
                {
                alt6=3;
                }
                break;
            case 41:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalAdeptness.g:834:2: ( ( rule__Reference__UpperAssignment_0_0 ) )
                    {
                    // InternalAdeptness.g:834:2: ( ( rule__Reference__UpperAssignment_0_0 ) )
                    // InternalAdeptness.g:835:3: ( rule__Reference__UpperAssignment_0_0 )
                    {
                     before(grammarAccess.getReferenceAccess().getUpperAssignment_0_0()); 
                    // InternalAdeptness.g:836:3: ( rule__Reference__UpperAssignment_0_0 )
                    // InternalAdeptness.g:836:4: rule__Reference__UpperAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__UpperAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceAccess().getUpperAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:840:2: ( ( rule__Reference__LowerAssignment_0_1 ) )
                    {
                    // InternalAdeptness.g:840:2: ( ( rule__Reference__LowerAssignment_0_1 ) )
                    // InternalAdeptness.g:841:3: ( rule__Reference__LowerAssignment_0_1 )
                    {
                     before(grammarAccess.getReferenceAccess().getLowerAssignment_0_1()); 
                    // InternalAdeptness.g:842:3: ( rule__Reference__LowerAssignment_0_1 )
                    // InternalAdeptness.g:842:4: rule__Reference__LowerAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__LowerAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceAccess().getLowerAssignment_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:846:2: ( ( rule__Reference__RangeAssignment_0_2 ) )
                    {
                    // InternalAdeptness.g:846:2: ( ( rule__Reference__RangeAssignment_0_2 ) )
                    // InternalAdeptness.g:847:3: ( rule__Reference__RangeAssignment_0_2 )
                    {
                     before(grammarAccess.getReferenceAccess().getRangeAssignment_0_2()); 
                    // InternalAdeptness.g:848:3: ( rule__Reference__RangeAssignment_0_2 )
                    // InternalAdeptness.g:848:4: rule__Reference__RangeAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__RangeAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceAccess().getRangeAssignment_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:852:2: ( ( rule__Reference__GapAssignment_0_3 ) )
                    {
                    // InternalAdeptness.g:852:2: ( ( rule__Reference__GapAssignment_0_3 ) )
                    // InternalAdeptness.g:853:3: ( rule__Reference__GapAssignment_0_3 )
                    {
                     before(grammarAccess.getReferenceAccess().getGapAssignment_0_3()); 
                    // InternalAdeptness.g:854:3: ( rule__Reference__GapAssignment_0_3 )
                    // InternalAdeptness.g:854:4: rule__Reference__GapAssignment_0_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__GapAssignment_0_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceAccess().getGapAssignment_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Alternatives_0"


    // $ANTLR start "rule__B__Alternatives"
    // InternalAdeptness.g:862:1: rule__B__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__B__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:866:1: ( ( 'true' ) | ( 'false' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( (LA7_0==12) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAdeptness.g:867:2: ( 'true' )
                    {
                    // InternalAdeptness.g:867:2: ( 'true' )
                    // InternalAdeptness.g:868:3: 'true'
                    {
                     before(grammarAccess.getBAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:873:2: ( 'false' )
                    {
                    // InternalAdeptness.g:873:2: ( 'false' )
                    // InternalAdeptness.g:874:3: 'false'
                    {
                     before(grammarAccess.getBAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__B__Alternatives"


    // $ANTLR start "rule__Import__Group__0"
    // InternalAdeptness.g:883:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:887:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalAdeptness.g:888:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalAdeptness.g:895:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:899:1: ( ( 'import' ) )
            // InternalAdeptness.g:900:1: ( 'import' )
            {
            // InternalAdeptness.g:900:1: ( 'import' )
            // InternalAdeptness.g:901:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalAdeptness.g:910:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:914:1: ( rule__Import__Group__1__Impl )
            // InternalAdeptness.g:915:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalAdeptness.g:921:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:925:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalAdeptness.g:926:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalAdeptness.g:926:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalAdeptness.g:927:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalAdeptness.g:928:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalAdeptness.g:928:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalAdeptness.g:937:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:941:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalAdeptness.g:942:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalAdeptness.g:949:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:953:1: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:954:1: ( ruleQualifiedName )
            {
            // InternalAdeptness.g:954:1: ( ruleQualifiedName )
            // InternalAdeptness.g:955:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalAdeptness.g:964:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:968:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalAdeptness.g:969:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalAdeptness.g:975:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:979:1: ( ( ( '.*' )? ) )
            // InternalAdeptness.g:980:1: ( ( '.*' )? )
            {
            // InternalAdeptness.g:980:1: ( ( '.*' )? )
            // InternalAdeptness.g:981:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalAdeptness.g:982:2: ( '.*' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAdeptness.g:982:3: '.*'
                    {
                    match(input,14,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalAdeptness.g:991:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:995:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAdeptness.g:996:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalAdeptness.g:1003:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1007:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:1008:1: ( RULE_ID )
            {
            // InternalAdeptness.g:1008:1: ( RULE_ID )
            // InternalAdeptness.g:1009:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalAdeptness.g:1018:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1022:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAdeptness.g:1023:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalAdeptness.g:1029:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1033:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAdeptness.g:1034:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAdeptness.g:1034:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAdeptness.g:1035:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAdeptness.g:1036:2: ( rule__QualifiedName__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAdeptness.g:1036:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalAdeptness.g:1045:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1049:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAdeptness.g:1050:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalAdeptness.g:1057:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1061:1: ( ( '.' ) )
            // InternalAdeptness.g:1062:1: ( '.' )
            {
            // InternalAdeptness.g:1062:1: ( '.' )
            // InternalAdeptness.g:1063:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalAdeptness.g:1072:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1076:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAdeptness.g:1077:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalAdeptness.g:1083:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1087:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:1088:1: ( RULE_ID )
            {
            // InternalAdeptness.g:1088:1: ( RULE_ID )
            // InternalAdeptness.g:1089:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Signal__Group__0"
    // InternalAdeptness.g:1099:1: rule__Signal__Group__0 : rule__Signal__Group__0__Impl rule__Signal__Group__1 ;
    public final void rule__Signal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1103:1: ( rule__Signal__Group__0__Impl rule__Signal__Group__1 )
            // InternalAdeptness.g:1104:2: rule__Signal__Group__0__Impl rule__Signal__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Signal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__0"


    // $ANTLR start "rule__Signal__Group__0__Impl"
    // InternalAdeptness.g:1111:1: rule__Signal__Group__0__Impl : ( 'CPS' ) ;
    public final void rule__Signal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1115:1: ( ( 'CPS' ) )
            // InternalAdeptness.g:1116:1: ( 'CPS' )
            {
            // InternalAdeptness.g:1116:1: ( 'CPS' )
            // InternalAdeptness.g:1117:2: 'CPS'
            {
             before(grammarAccess.getSignalAccess().getCPSKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getCPSKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__0__Impl"


    // $ANTLR start "rule__Signal__Group__1"
    // InternalAdeptness.g:1126:1: rule__Signal__Group__1 : rule__Signal__Group__1__Impl rule__Signal__Group__2 ;
    public final void rule__Signal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1130:1: ( rule__Signal__Group__1__Impl rule__Signal__Group__2 )
            // InternalAdeptness.g:1131:2: rule__Signal__Group__1__Impl rule__Signal__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Signal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__1"


    // $ANTLR start "rule__Signal__Group__1__Impl"
    // InternalAdeptness.g:1138:1: rule__Signal__Group__1__Impl : ( ( rule__Signal__NameAssignment_1 ) ) ;
    public final void rule__Signal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1142:1: ( ( ( rule__Signal__NameAssignment_1 ) ) )
            // InternalAdeptness.g:1143:1: ( ( rule__Signal__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:1143:1: ( ( rule__Signal__NameAssignment_1 ) )
            // InternalAdeptness.g:1144:2: ( rule__Signal__NameAssignment_1 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:1145:2: ( rule__Signal__NameAssignment_1 )
            // InternalAdeptness.g:1145:3: rule__Signal__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Signal__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__1__Impl"


    // $ANTLR start "rule__Signal__Group__2"
    // InternalAdeptness.g:1153:1: rule__Signal__Group__2 : rule__Signal__Group__2__Impl rule__Signal__Group__3 ;
    public final void rule__Signal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1157:1: ( rule__Signal__Group__2__Impl rule__Signal__Group__3 )
            // InternalAdeptness.g:1158:2: rule__Signal__Group__2__Impl rule__Signal__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Signal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__2"


    // $ANTLR start "rule__Signal__Group__2__Impl"
    // InternalAdeptness.g:1165:1: rule__Signal__Group__2__Impl : ( ':' ) ;
    public final void rule__Signal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1169:1: ( ( ':' ) )
            // InternalAdeptness.g:1170:1: ( ':' )
            {
            // InternalAdeptness.g:1170:1: ( ':' )
            // InternalAdeptness.g:1171:2: ':'
            {
             before(grammarAccess.getSignalAccess().getColonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__2__Impl"


    // $ANTLR start "rule__Signal__Group__3"
    // InternalAdeptness.g:1180:1: rule__Signal__Group__3 : rule__Signal__Group__3__Impl rule__Signal__Group__4 ;
    public final void rule__Signal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1184:1: ( rule__Signal__Group__3__Impl rule__Signal__Group__4 )
            // InternalAdeptness.g:1185:2: rule__Signal__Group__3__Impl rule__Signal__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Signal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__3"


    // $ANTLR start "rule__Signal__Group__3__Impl"
    // InternalAdeptness.g:1192:1: rule__Signal__Group__3__Impl : ( ( ( rule__Signal__OracleAssignment_3 ) ) ( ( rule__Signal__OracleAssignment_3 )* ) ) ;
    public final void rule__Signal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1196:1: ( ( ( ( rule__Signal__OracleAssignment_3 ) ) ( ( rule__Signal__OracleAssignment_3 )* ) ) )
            // InternalAdeptness.g:1197:1: ( ( ( rule__Signal__OracleAssignment_3 ) ) ( ( rule__Signal__OracleAssignment_3 )* ) )
            {
            // InternalAdeptness.g:1197:1: ( ( ( rule__Signal__OracleAssignment_3 ) ) ( ( rule__Signal__OracleAssignment_3 )* ) )
            // InternalAdeptness.g:1198:2: ( ( rule__Signal__OracleAssignment_3 ) ) ( ( rule__Signal__OracleAssignment_3 )* )
            {
            // InternalAdeptness.g:1198:2: ( ( rule__Signal__OracleAssignment_3 ) )
            // InternalAdeptness.g:1199:3: ( rule__Signal__OracleAssignment_3 )
            {
             before(grammarAccess.getSignalAccess().getOracleAssignment_3()); 
            // InternalAdeptness.g:1200:3: ( rule__Signal__OracleAssignment_3 )
            // InternalAdeptness.g:1200:4: rule__Signal__OracleAssignment_3
            {
            pushFollow(FOLLOW_11);
            rule__Signal__OracleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getOracleAssignment_3()); 

            }

            // InternalAdeptness.g:1203:2: ( ( rule__Signal__OracleAssignment_3 )* )
            // InternalAdeptness.g:1204:3: ( rule__Signal__OracleAssignment_3 )*
            {
             before(grammarAccess.getSignalAccess().getOracleAssignment_3()); 
            // InternalAdeptness.g:1205:3: ( rule__Signal__OracleAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAdeptness.g:1205:4: rule__Signal__OracleAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Signal__OracleAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSignalAccess().getOracleAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__3__Impl"


    // $ANTLR start "rule__Signal__Group__4"
    // InternalAdeptness.g:1214:1: rule__Signal__Group__4 : rule__Signal__Group__4__Impl ;
    public final void rule__Signal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1218:1: ( rule__Signal__Group__4__Impl )
            // InternalAdeptness.g:1219:2: rule__Signal__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__4"


    // $ANTLR start "rule__Signal__Group__4__Impl"
    // InternalAdeptness.g:1225:1: rule__Signal__Group__4__Impl : ( ';' ) ;
    public final void rule__Signal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1229:1: ( ( ';' ) )
            // InternalAdeptness.g:1230:1: ( ';' )
            {
            // InternalAdeptness.g:1230:1: ( ';' )
            // InternalAdeptness.g:1231:2: ';'
            {
             before(grammarAccess.getSignalAccess().getSemicolonKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__4__Impl"


    // $ANTLR start "rule__Oracle__Group__0"
    // InternalAdeptness.g:1241:1: rule__Oracle__Group__0 : rule__Oracle__Group__0__Impl rule__Oracle__Group__1 ;
    public final void rule__Oracle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1245:1: ( rule__Oracle__Group__0__Impl rule__Oracle__Group__1 )
            // InternalAdeptness.g:1246:2: rule__Oracle__Group__0__Impl rule__Oracle__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Oracle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Oracle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__0"


    // $ANTLR start "rule__Oracle__Group__0__Impl"
    // InternalAdeptness.g:1253:1: rule__Oracle__Group__0__Impl : ( 'Oracle' ) ;
    public final void rule__Oracle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1257:1: ( ( 'Oracle' ) )
            // InternalAdeptness.g:1258:1: ( 'Oracle' )
            {
            // InternalAdeptness.g:1258:1: ( 'Oracle' )
            // InternalAdeptness.g:1259:2: 'Oracle'
            {
             before(grammarAccess.getOracleAccess().getOracleKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOracleAccess().getOracleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__0__Impl"


    // $ANTLR start "rule__Oracle__Group__1"
    // InternalAdeptness.g:1268:1: rule__Oracle__Group__1 : rule__Oracle__Group__1__Impl rule__Oracle__Group__2 ;
    public final void rule__Oracle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1272:1: ( rule__Oracle__Group__1__Impl rule__Oracle__Group__2 )
            // InternalAdeptness.g:1273:2: rule__Oracle__Group__1__Impl rule__Oracle__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Oracle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Oracle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__1"


    // $ANTLR start "rule__Oracle__Group__1__Impl"
    // InternalAdeptness.g:1280:1: rule__Oracle__Group__1__Impl : ( ( rule__Oracle__NameAssignment_1 ) ) ;
    public final void rule__Oracle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1284:1: ( ( ( rule__Oracle__NameAssignment_1 ) ) )
            // InternalAdeptness.g:1285:1: ( ( rule__Oracle__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:1285:1: ( ( rule__Oracle__NameAssignment_1 ) )
            // InternalAdeptness.g:1286:2: ( rule__Oracle__NameAssignment_1 )
            {
             before(grammarAccess.getOracleAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:1287:2: ( rule__Oracle__NameAssignment_1 )
            // InternalAdeptness.g:1287:3: rule__Oracle__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Oracle__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOracleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__1__Impl"


    // $ANTLR start "rule__Oracle__Group__2"
    // InternalAdeptness.g:1295:1: rule__Oracle__Group__2 : rule__Oracle__Group__2__Impl rule__Oracle__Group__3 ;
    public final void rule__Oracle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1299:1: ( rule__Oracle__Group__2__Impl rule__Oracle__Group__3 )
            // InternalAdeptness.g:1300:2: rule__Oracle__Group__2__Impl rule__Oracle__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Oracle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Oracle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__2"


    // $ANTLR start "rule__Oracle__Group__2__Impl"
    // InternalAdeptness.g:1307:1: rule__Oracle__Group__2__Impl : ( ':' ) ;
    public final void rule__Oracle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1311:1: ( ( ':' ) )
            // InternalAdeptness.g:1312:1: ( ':' )
            {
            // InternalAdeptness.g:1312:1: ( ':' )
            // InternalAdeptness.g:1313:2: ':'
            {
             before(grammarAccess.getOracleAccess().getColonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getOracleAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__2__Impl"


    // $ANTLR start "rule__Oracle__Group__3"
    // InternalAdeptness.g:1322:1: rule__Oracle__Group__3 : rule__Oracle__Group__3__Impl rule__Oracle__Group__4 ;
    public final void rule__Oracle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1326:1: ( rule__Oracle__Group__3__Impl rule__Oracle__Group__4 )
            // InternalAdeptness.g:1327:2: rule__Oracle__Group__3__Impl rule__Oracle__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Oracle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Oracle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__3"


    // $ANTLR start "rule__Oracle__Group__3__Impl"
    // InternalAdeptness.g:1334:1: rule__Oracle__Group__3__Impl : ( ( ( rule__Oracle__CheckAssignment_3 ) ) ( ( rule__Oracle__CheckAssignment_3 )* ) ) ;
    public final void rule__Oracle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1338:1: ( ( ( ( rule__Oracle__CheckAssignment_3 ) ) ( ( rule__Oracle__CheckAssignment_3 )* ) ) )
            // InternalAdeptness.g:1339:1: ( ( ( rule__Oracle__CheckAssignment_3 ) ) ( ( rule__Oracle__CheckAssignment_3 )* ) )
            {
            // InternalAdeptness.g:1339:1: ( ( ( rule__Oracle__CheckAssignment_3 ) ) ( ( rule__Oracle__CheckAssignment_3 )* ) )
            // InternalAdeptness.g:1340:2: ( ( rule__Oracle__CheckAssignment_3 ) ) ( ( rule__Oracle__CheckAssignment_3 )* )
            {
            // InternalAdeptness.g:1340:2: ( ( rule__Oracle__CheckAssignment_3 ) )
            // InternalAdeptness.g:1341:3: ( rule__Oracle__CheckAssignment_3 )
            {
             before(grammarAccess.getOracleAccess().getCheckAssignment_3()); 
            // InternalAdeptness.g:1342:3: ( rule__Oracle__CheckAssignment_3 )
            // InternalAdeptness.g:1342:4: rule__Oracle__CheckAssignment_3
            {
            pushFollow(FOLLOW_13);
            rule__Oracle__CheckAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOracleAccess().getCheckAssignment_3()); 

            }

            // InternalAdeptness.g:1345:2: ( ( rule__Oracle__CheckAssignment_3 )* )
            // InternalAdeptness.g:1346:3: ( rule__Oracle__CheckAssignment_3 )*
            {
             before(grammarAccess.getOracleAccess().getCheckAssignment_3()); 
            // InternalAdeptness.g:1347:3: ( rule__Oracle__CheckAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAdeptness.g:1347:4: rule__Oracle__CheckAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Oracle__CheckAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getOracleAccess().getCheckAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__3__Impl"


    // $ANTLR start "rule__Oracle__Group__4"
    // InternalAdeptness.g:1356:1: rule__Oracle__Group__4 : rule__Oracle__Group__4__Impl ;
    public final void rule__Oracle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1360:1: ( rule__Oracle__Group__4__Impl )
            // InternalAdeptness.g:1361:2: rule__Oracle__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Oracle__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__4"


    // $ANTLR start "rule__Oracle__Group__4__Impl"
    // InternalAdeptness.g:1367:1: rule__Oracle__Group__4__Impl : ( ';' ) ;
    public final void rule__Oracle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1371:1: ( ( ';' ) )
            // InternalAdeptness.g:1372:1: ( ';' )
            {
            // InternalAdeptness.g:1372:1: ( ';' )
            // InternalAdeptness.g:1373:2: ';'
            {
             before(grammarAccess.getOracleAccess().getSemicolonKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getOracleAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__4__Impl"


    // $ANTLR start "rule__Check__Group__0"
    // InternalAdeptness.g:1383:1: rule__Check__Group__0 : rule__Check__Group__0__Impl rule__Check__Group__1 ;
    public final void rule__Check__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1387:1: ( rule__Check__Group__0__Impl rule__Check__Group__1 )
            // InternalAdeptness.g:1388:2: rule__Check__Group__0__Impl rule__Check__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Check__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__0"


    // $ANTLR start "rule__Check__Group__0__Impl"
    // InternalAdeptness.g:1395:1: rule__Check__Group__0__Impl : ( 'checks:' ) ;
    public final void rule__Check__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1399:1: ( ( 'checks:' ) )
            // InternalAdeptness.g:1400:1: ( 'checks:' )
            {
            // InternalAdeptness.g:1400:1: ( 'checks:' )
            // InternalAdeptness.g:1401:2: 'checks:'
            {
             before(grammarAccess.getCheckAccess().getChecksKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCheckAccess().getChecksKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__0__Impl"


    // $ANTLR start "rule__Check__Group__1"
    // InternalAdeptness.g:1410:1: rule__Check__Group__1 : rule__Check__Group__1__Impl rule__Check__Group__2 ;
    public final void rule__Check__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1414:1: ( rule__Check__Group__1__Impl rule__Check__Group__2 )
            // InternalAdeptness.g:1415:2: rule__Check__Group__1__Impl rule__Check__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Check__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__1"


    // $ANTLR start "rule__Check__Group__1__Impl"
    // InternalAdeptness.g:1422:1: rule__Check__Group__1__Impl : ( ( rule__Check__NameAssignment_1 ) ) ;
    public final void rule__Check__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1426:1: ( ( ( rule__Check__NameAssignment_1 ) ) )
            // InternalAdeptness.g:1427:1: ( ( rule__Check__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:1427:1: ( ( rule__Check__NameAssignment_1 ) )
            // InternalAdeptness.g:1428:2: ( rule__Check__NameAssignment_1 )
            {
             before(grammarAccess.getCheckAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:1429:2: ( rule__Check__NameAssignment_1 )
            // InternalAdeptness.g:1429:3: rule__Check__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Check__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__1__Impl"


    // $ANTLR start "rule__Check__Group__2"
    // InternalAdeptness.g:1437:1: rule__Check__Group__2 : rule__Check__Group__2__Impl rule__Check__Group__3 ;
    public final void rule__Check__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1441:1: ( rule__Check__Group__2__Impl rule__Check__Group__3 )
            // InternalAdeptness.g:1442:2: rule__Check__Group__2__Impl rule__Check__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Check__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__2"


    // $ANTLR start "rule__Check__Group__2__Impl"
    // InternalAdeptness.g:1449:1: rule__Check__Group__2__Impl : ( 'is' ) ;
    public final void rule__Check__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1453:1: ( ( 'is' ) )
            // InternalAdeptness.g:1454:1: ( 'is' )
            {
            // InternalAdeptness.g:1454:1: ( 'is' )
            // InternalAdeptness.g:1455:2: 'is'
            {
             before(grammarAccess.getCheckAccess().getIsKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCheckAccess().getIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__2__Impl"


    // $ANTLR start "rule__Check__Group__3"
    // InternalAdeptness.g:1464:1: rule__Check__Group__3 : rule__Check__Group__3__Impl rule__Check__Group__4 ;
    public final void rule__Check__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1468:1: ( rule__Check__Group__3__Impl rule__Check__Group__4 )
            // InternalAdeptness.g:1469:2: rule__Check__Group__3__Impl rule__Check__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Check__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__3"


    // $ANTLR start "rule__Check__Group__3__Impl"
    // InternalAdeptness.g:1476:1: rule__Check__Group__3__Impl : ( ( rule__Check__ReferenceAssignment_3 ) ) ;
    public final void rule__Check__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1480:1: ( ( ( rule__Check__ReferenceAssignment_3 ) ) )
            // InternalAdeptness.g:1481:1: ( ( rule__Check__ReferenceAssignment_3 ) )
            {
            // InternalAdeptness.g:1481:1: ( ( rule__Check__ReferenceAssignment_3 ) )
            // InternalAdeptness.g:1482:2: ( rule__Check__ReferenceAssignment_3 )
            {
             before(grammarAccess.getCheckAccess().getReferenceAssignment_3()); 
            // InternalAdeptness.g:1483:2: ( rule__Check__ReferenceAssignment_3 )
            // InternalAdeptness.g:1483:3: rule__Check__ReferenceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Check__ReferenceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getReferenceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__3__Impl"


    // $ANTLR start "rule__Check__Group__4"
    // InternalAdeptness.g:1491:1: rule__Check__Group__4 : rule__Check__Group__4__Impl rule__Check__Group__5 ;
    public final void rule__Check__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1495:1: ( rule__Check__Group__4__Impl rule__Check__Group__5 )
            // InternalAdeptness.g:1496:2: rule__Check__Group__4__Impl rule__Check__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Check__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__4"


    // $ANTLR start "rule__Check__Group__4__Impl"
    // InternalAdeptness.g:1503:1: rule__Check__Group__4__Impl : ( ( ( rule__Check__FailReasonAssignment_4 ) ) ( ( rule__Check__FailReasonAssignment_4 )* ) ) ;
    public final void rule__Check__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1507:1: ( ( ( ( rule__Check__FailReasonAssignment_4 ) ) ( ( rule__Check__FailReasonAssignment_4 )* ) ) )
            // InternalAdeptness.g:1508:1: ( ( ( rule__Check__FailReasonAssignment_4 ) ) ( ( rule__Check__FailReasonAssignment_4 )* ) )
            {
            // InternalAdeptness.g:1508:1: ( ( ( rule__Check__FailReasonAssignment_4 ) ) ( ( rule__Check__FailReasonAssignment_4 )* ) )
            // InternalAdeptness.g:1509:2: ( ( rule__Check__FailReasonAssignment_4 ) ) ( ( rule__Check__FailReasonAssignment_4 )* )
            {
            // InternalAdeptness.g:1509:2: ( ( rule__Check__FailReasonAssignment_4 ) )
            // InternalAdeptness.g:1510:3: ( rule__Check__FailReasonAssignment_4 )
            {
             before(grammarAccess.getCheckAccess().getFailReasonAssignment_4()); 
            // InternalAdeptness.g:1511:3: ( rule__Check__FailReasonAssignment_4 )
            // InternalAdeptness.g:1511:4: rule__Check__FailReasonAssignment_4
            {
            pushFollow(FOLLOW_18);
            rule__Check__FailReasonAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getFailReasonAssignment_4()); 

            }

            // InternalAdeptness.g:1514:2: ( ( rule__Check__FailReasonAssignment_4 )* )
            // InternalAdeptness.g:1515:3: ( rule__Check__FailReasonAssignment_4 )*
            {
             before(grammarAccess.getCheckAccess().getFailReasonAssignment_4()); 
            // InternalAdeptness.g:1516:3: ( rule__Check__FailReasonAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAdeptness.g:1516:4: rule__Check__FailReasonAssignment_4
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Check__FailReasonAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getCheckAccess().getFailReasonAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__4__Impl"


    // $ANTLR start "rule__Check__Group__5"
    // InternalAdeptness.g:1525:1: rule__Check__Group__5 : rule__Check__Group__5__Impl rule__Check__Group__6 ;
    public final void rule__Check__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1529:1: ( rule__Check__Group__5__Impl rule__Check__Group__6 )
            // InternalAdeptness.g:1530:2: rule__Check__Group__5__Impl rule__Check__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Check__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__5"


    // $ANTLR start "rule__Check__Group__5__Impl"
    // InternalAdeptness.g:1537:1: rule__Check__Group__5__Impl : ( ( rule__Check__DescriptionAssignment_5 ) ) ;
    public final void rule__Check__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1541:1: ( ( ( rule__Check__DescriptionAssignment_5 ) ) )
            // InternalAdeptness.g:1542:1: ( ( rule__Check__DescriptionAssignment_5 ) )
            {
            // InternalAdeptness.g:1542:1: ( ( rule__Check__DescriptionAssignment_5 ) )
            // InternalAdeptness.g:1543:2: ( rule__Check__DescriptionAssignment_5 )
            {
             before(grammarAccess.getCheckAccess().getDescriptionAssignment_5()); 
            // InternalAdeptness.g:1544:2: ( rule__Check__DescriptionAssignment_5 )
            // InternalAdeptness.g:1544:3: rule__Check__DescriptionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Check__DescriptionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getDescriptionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__5__Impl"


    // $ANTLR start "rule__Check__Group__6"
    // InternalAdeptness.g:1552:1: rule__Check__Group__6 : rule__Check__Group__6__Impl ;
    public final void rule__Check__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1556:1: ( rule__Check__Group__6__Impl )
            // InternalAdeptness.g:1557:2: rule__Check__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Check__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__6"


    // $ANTLR start "rule__Check__Group__6__Impl"
    // InternalAdeptness.g:1563:1: rule__Check__Group__6__Impl : ( ',' ) ;
    public final void rule__Check__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1567:1: ( ( ',' ) )
            // InternalAdeptness.g:1568:1: ( ',' )
            {
            // InternalAdeptness.g:1568:1: ( ',' )
            // InternalAdeptness.g:1569:2: ','
            {
             before(grammarAccess.getCheckAccess().getCommaKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCheckAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__6__Impl"


    // $ANTLR start "rule__FailReason__Group__0"
    // InternalAdeptness.g:1579:1: rule__FailReason__Group__0 : rule__FailReason__Group__0__Impl rule__FailReason__Group__1 ;
    public final void rule__FailReason__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1583:1: ( rule__FailReason__Group__0__Impl rule__FailReason__Group__1 )
            // InternalAdeptness.g:1584:2: rule__FailReason__Group__0__Impl rule__FailReason__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__FailReason__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FailReason__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FailReason__Group__0"


    // $ANTLR start "rule__FailReason__Group__0__Impl"
    // InternalAdeptness.g:1591:1: rule__FailReason__Group__0__Impl : ( 'fails' ) ;
    public final void rule__FailReason__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1595:1: ( ( 'fails' ) )
            // InternalAdeptness.g:1596:1: ( 'fails' )
            {
            // InternalAdeptness.g:1596:1: ( 'fails' )
            // InternalAdeptness.g:1597:2: 'fails'
            {
             before(grammarAccess.getFailReasonAccess().getFailsKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFailReasonAccess().getFailsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FailReason__Group__0__Impl"


    // $ANTLR start "rule__FailReason__Group__1"
    // InternalAdeptness.g:1606:1: rule__FailReason__Group__1 : rule__FailReason__Group__1__Impl rule__FailReason__Group__2 ;
    public final void rule__FailReason__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1610:1: ( rule__FailReason__Group__1__Impl rule__FailReason__Group__2 )
            // InternalAdeptness.g:1611:2: rule__FailReason__Group__1__Impl rule__FailReason__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__FailReason__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FailReason__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FailReason__Group__1"


    // $ANTLR start "rule__FailReason__Group__1__Impl"
    // InternalAdeptness.g:1618:1: rule__FailReason__Group__1__Impl : ( 'if' ) ;
    public final void rule__FailReason__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1622:1: ( ( 'if' ) )
            // InternalAdeptness.g:1623:1: ( 'if' )
            {
            // InternalAdeptness.g:1623:1: ( 'if' )
            // InternalAdeptness.g:1624:2: 'if'
            {
             before(grammarAccess.getFailReasonAccess().getIfKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFailReasonAccess().getIfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FailReason__Group__1__Impl"


    // $ANTLR start "rule__FailReason__Group__2"
    // InternalAdeptness.g:1633:1: rule__FailReason__Group__2 : rule__FailReason__Group__2__Impl rule__FailReason__Group__3 ;
    public final void rule__FailReason__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1637:1: ( rule__FailReason__Group__2__Impl rule__FailReason__Group__3 )
            // InternalAdeptness.g:1638:2: rule__FailReason__Group__2__Impl rule__FailReason__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__FailReason__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FailReason__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FailReason__Group__2"


    // $ANTLR start "rule__FailReason__Group__2__Impl"
    // InternalAdeptness.g:1645:1: rule__FailReason__Group__2__Impl : ( ':' ) ;
    public final void rule__FailReason__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1649:1: ( ( ':' ) )
            // InternalAdeptness.g:1650:1: ( ':' )
            {
            // InternalAdeptness.g:1650:1: ( ':' )
            // InternalAdeptness.g:1651:2: ':'
            {
             before(grammarAccess.getFailReasonAccess().getColonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFailReasonAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FailReason__Group__2__Impl"


    // $ANTLR start "rule__FailReason__Group__3"
    // InternalAdeptness.g:1660:1: rule__FailReason__Group__3 : rule__FailReason__Group__3__Impl rule__FailReason__Group__4 ;
    public final void rule__FailReason__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1664:1: ( rule__FailReason__Group__3__Impl rule__FailReason__Group__4 )
            // InternalAdeptness.g:1665:2: rule__FailReason__Group__3__Impl rule__FailReason__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__FailReason__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FailReason__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FailReason__Group__3"


    // $ANTLR start "rule__FailReason__Group__3__Impl"
    // InternalAdeptness.g:1672:1: rule__FailReason__Group__3__Impl : ( ( rule__FailReason__Alternatives_3 ) ) ;
    public final void rule__FailReason__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1676:1: ( ( ( rule__FailReason__Alternatives_3 ) ) )
            // InternalAdeptness.g:1677:1: ( ( rule__FailReason__Alternatives_3 ) )
            {
            // InternalAdeptness.g:1677:1: ( ( rule__FailReason__Alternatives_3 ) )
            // InternalAdeptness.g:1678:2: ( rule__FailReason__Alternatives_3 )
            {
             before(grammarAccess.getFailReasonAccess().getAlternatives_3()); 
            // InternalAdeptness.g:1679:2: ( rule__FailReason__Alternatives_3 )
            // InternalAdeptness.g:1679:3: rule__FailReason__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__FailReason__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getFailReasonAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FailReason__Group__3__Impl"


    // $ANTLR start "rule__FailReason__Group__4"
    // InternalAdeptness.g:1687:1: rule__FailReason__Group__4 : rule__FailReason__Group__4__Impl ;
    public final void rule__FailReason__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1691:1: ( rule__FailReason__Group__4__Impl )
            // InternalAdeptness.g:1692:2: rule__FailReason__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FailReason__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FailReason__Group__4"


    // $ANTLR start "rule__FailReason__Group__4__Impl"
    // InternalAdeptness.g:1698:1: rule__FailReason__Group__4__Impl : ( ',' ) ;
    public final void rule__FailReason__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1702:1: ( ( ',' ) )
            // InternalAdeptness.g:1703:1: ( ',' )
            {
            // InternalAdeptness.g:1703:1: ( ',' )
            // InternalAdeptness.g:1704:2: ','
            {
             before(grammarAccess.getFailReasonAccess().getCommaKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFailReasonAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FailReason__Group__4__Impl"


    // $ANTLR start "rule__HighPeaks__Group__0"
    // InternalAdeptness.g:1714:1: rule__HighPeaks__Group__0 : rule__HighPeaks__Group__0__Impl rule__HighPeaks__Group__1 ;
    public final void rule__HighPeaks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1718:1: ( rule__HighPeaks__Group__0__Impl rule__HighPeaks__Group__1 )
            // InternalAdeptness.g:1719:2: rule__HighPeaks__Group__0__Impl rule__HighPeaks__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__HighPeaks__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighPeaks__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeaks__Group__0"


    // $ANTLR start "rule__HighPeaks__Group__0__Impl"
    // InternalAdeptness.g:1726:1: rule__HighPeaks__Group__0__Impl : ( 'value' ) ;
    public final void rule__HighPeaks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1730:1: ( ( 'value' ) )
            // InternalAdeptness.g:1731:1: ( 'value' )
            {
            // InternalAdeptness.g:1731:1: ( 'value' )
            // InternalAdeptness.g:1732:2: 'value'
            {
             before(grammarAccess.getHighPeaksAccess().getValueKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHighPeaksAccess().getValueKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeaks__Group__0__Impl"


    // $ANTLR start "rule__HighPeaks__Group__1"
    // InternalAdeptness.g:1741:1: rule__HighPeaks__Group__1 : rule__HighPeaks__Group__1__Impl rule__HighPeaks__Group__2 ;
    public final void rule__HighPeaks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1745:1: ( rule__HighPeaks__Group__1__Impl rule__HighPeaks__Group__2 )
            // InternalAdeptness.g:1746:2: rule__HighPeaks__Group__1__Impl rule__HighPeaks__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__HighPeaks__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighPeaks__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeaks__Group__1"


    // $ANTLR start "rule__HighPeaks__Group__1__Impl"
    // InternalAdeptness.g:1753:1: rule__HighPeaks__Group__1__Impl : ( 'is' ) ;
    public final void rule__HighPeaks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1757:1: ( ( 'is' ) )
            // InternalAdeptness.g:1758:1: ( 'is' )
            {
            // InternalAdeptness.g:1758:1: ( 'is' )
            // InternalAdeptness.g:1759:2: 'is'
            {
             before(grammarAccess.getHighPeaksAccess().getIsKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getHighPeaksAccess().getIsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeaks__Group__1__Impl"


    // $ANTLR start "rule__HighPeaks__Group__2"
    // InternalAdeptness.g:1768:1: rule__HighPeaks__Group__2 : rule__HighPeaks__Group__2__Impl rule__HighPeaks__Group__3 ;
    public final void rule__HighPeaks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1772:1: ( rule__HighPeaks__Group__2__Impl rule__HighPeaks__Group__3 )
            // InternalAdeptness.g:1773:2: rule__HighPeaks__Group__2__Impl rule__HighPeaks__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__HighPeaks__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighPeaks__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeaks__Group__2"


    // $ANTLR start "rule__HighPeaks__Group__2__Impl"
    // InternalAdeptness.g:1780:1: rule__HighPeaks__Group__2__Impl : ( 'higher' ) ;
    public final void rule__HighPeaks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1784:1: ( ( 'higher' ) )
            // InternalAdeptness.g:1785:1: ( 'higher' )
            {
            // InternalAdeptness.g:1785:1: ( 'higher' )
            // InternalAdeptness.g:1786:2: 'higher'
            {
             before(grammarAccess.getHighPeaksAccess().getHigherKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getHighPeaksAccess().getHigherKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeaks__Group__2__Impl"


    // $ANTLR start "rule__HighPeaks__Group__3"
    // InternalAdeptness.g:1795:1: rule__HighPeaks__Group__3 : rule__HighPeaks__Group__3__Impl rule__HighPeaks__Group__4 ;
    public final void rule__HighPeaks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1799:1: ( rule__HighPeaks__Group__3__Impl rule__HighPeaks__Group__4 )
            // InternalAdeptness.g:1800:2: rule__HighPeaks__Group__3__Impl rule__HighPeaks__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__HighPeaks__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighPeaks__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeaks__Group__3"


    // $ANTLR start "rule__HighPeaks__Group__3__Impl"
    // InternalAdeptness.g:1807:1: rule__HighPeaks__Group__3__Impl : ( 'than' ) ;
    public final void rule__HighPeaks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1811:1: ( ( 'than' ) )
            // InternalAdeptness.g:1812:1: ( 'than' )
            {
            // InternalAdeptness.g:1812:1: ( 'than' )
            // InternalAdeptness.g:1813:2: 'than'
            {
             before(grammarAccess.getHighPeaksAccess().getThanKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getHighPeaksAccess().getThanKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeaks__Group__3__Impl"


    // $ANTLR start "rule__HighPeaks__Group__4"
    // InternalAdeptness.g:1822:1: rule__HighPeaks__Group__4 : rule__HighPeaks__Group__4__Impl rule__HighPeaks__Group__5 ;
    public final void rule__HighPeaks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1826:1: ( rule__HighPeaks__Group__4__Impl rule__HighPeaks__Group__5 )
            // InternalAdeptness.g:1827:2: rule__HighPeaks__Group__4__Impl rule__HighPeaks__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__HighPeaks__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighPeaks__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeaks__Group__4"


    // $ANTLR start "rule__HighPeaks__Group__4__Impl"
    // InternalAdeptness.g:1834:1: rule__HighPeaks__Group__4__Impl : ( ( rule__HighPeaks__CantAssignment_4 ) ) ;
    public final void rule__HighPeaks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1838:1: ( ( ( rule__HighPeaks__CantAssignment_4 ) ) )
            // InternalAdeptness.g:1839:1: ( ( rule__HighPeaks__CantAssignment_4 ) )
            {
            // InternalAdeptness.g:1839:1: ( ( rule__HighPeaks__CantAssignment_4 ) )
            // InternalAdeptness.g:1840:2: ( rule__HighPeaks__CantAssignment_4 )
            {
             before(grammarAccess.getHighPeaksAccess().getCantAssignment_4()); 
            // InternalAdeptness.g:1841:2: ( rule__HighPeaks__CantAssignment_4 )
            // InternalAdeptness.g:1841:3: rule__HighPeaks__CantAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__HighPeaks__CantAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHighPeaksAccess().getCantAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeaks__Group__4__Impl"


    // $ANTLR start "rule__HighPeaks__Group__5"
    // InternalAdeptness.g:1849:1: rule__HighPeaks__Group__5 : rule__HighPeaks__Group__5__Impl rule__HighPeaks__Group__6 ;
    public final void rule__HighPeaks__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1853:1: ( rule__HighPeaks__Group__5__Impl rule__HighPeaks__Group__6 )
            // InternalAdeptness.g:1854:2: rule__HighPeaks__Group__5__Impl rule__HighPeaks__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__HighPeaks__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighPeaks__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeaks__Group__5"


    // $ANTLR start "rule__HighPeaks__Group__5__Impl"
    // InternalAdeptness.g:1861:1: rule__HighPeaks__Group__5__Impl : ( 'in' ) ;
    public final void rule__HighPeaks__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1865:1: ( ( 'in' ) )
            // InternalAdeptness.g:1866:1: ( 'in' )
            {
            // InternalAdeptness.g:1866:1: ( 'in' )
            // InternalAdeptness.g:1867:2: 'in'
            {
             before(grammarAccess.getHighPeaksAccess().getInKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getHighPeaksAccess().getInKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeaks__Group__5__Impl"


    // $ANTLR start "rule__HighPeaks__Group__6"
    // InternalAdeptness.g:1876:1: rule__HighPeaks__Group__6 : rule__HighPeaks__Group__6__Impl rule__HighPeaks__Group__7 ;
    public final void rule__HighPeaks__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1880:1: ( rule__HighPeaks__Group__6__Impl rule__HighPeaks__Group__7 )
            // InternalAdeptness.g:1881:2: rule__HighPeaks__Group__6__Impl rule__HighPeaks__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__HighPeaks__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighPeaks__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeaks__Group__6"


    // $ANTLR start "rule__HighPeaks__Group__6__Impl"
    // InternalAdeptness.g:1888:1: rule__HighPeaks__Group__6__Impl : ( 'interval' ) ;
    public final void rule__HighPeaks__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1892:1: ( ( 'interval' ) )
            // InternalAdeptness.g:1893:1: ( 'interval' )
            {
            // InternalAdeptness.g:1893:1: ( 'interval' )
            // InternalAdeptness.g:1894:2: 'interval'
            {
             before(grammarAccess.getHighPeaksAccess().getIntervalKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getHighPeaksAccess().getIntervalKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeaks__Group__6__Impl"


    // $ANTLR start "rule__HighPeaks__Group__7"
    // InternalAdeptness.g:1903:1: rule__HighPeaks__Group__7 : rule__HighPeaks__Group__7__Impl rule__HighPeaks__Group__8 ;
    public final void rule__HighPeaks__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1907:1: ( rule__HighPeaks__Group__7__Impl rule__HighPeaks__Group__8 )
            // InternalAdeptness.g:1908:2: rule__HighPeaks__Group__7__Impl rule__HighPeaks__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__HighPeaks__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighPeaks__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeaks__Group__7"


    // $ANTLR start "rule__HighPeaks__Group__7__Impl"
    // InternalAdeptness.g:1915:1: rule__HighPeaks__Group__7__Impl : ( 'of' ) ;
    public final void rule__HighPeaks__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1919:1: ( ( 'of' ) )
            // InternalAdeptness.g:1920:1: ( 'of' )
            {
            // InternalAdeptness.g:1920:1: ( 'of' )
            // InternalAdeptness.g:1921:2: 'of'
            {
             before(grammarAccess.getHighPeaksAccess().getOfKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getHighPeaksAccess().getOfKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeaks__Group__7__Impl"


    // $ANTLR start "rule__HighPeaks__Group__8"
    // InternalAdeptness.g:1930:1: rule__HighPeaks__Group__8 : rule__HighPeaks__Group__8__Impl ;
    public final void rule__HighPeaks__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1934:1: ( rule__HighPeaks__Group__8__Impl )
            // InternalAdeptness.g:1935:2: rule__HighPeaks__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HighPeaks__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeaks__Group__8"


    // $ANTLR start "rule__HighPeaks__Group__8__Impl"
    // InternalAdeptness.g:1941:1: rule__HighPeaks__Group__8__Impl : ( ( rule__HighPeaks__TimeAssignment_8 ) ) ;
    public final void rule__HighPeaks__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1945:1: ( ( ( rule__HighPeaks__TimeAssignment_8 ) ) )
            // InternalAdeptness.g:1946:1: ( ( rule__HighPeaks__TimeAssignment_8 ) )
            {
            // InternalAdeptness.g:1946:1: ( ( rule__HighPeaks__TimeAssignment_8 ) )
            // InternalAdeptness.g:1947:2: ( rule__HighPeaks__TimeAssignment_8 )
            {
             before(grammarAccess.getHighPeaksAccess().getTimeAssignment_8()); 
            // InternalAdeptness.g:1948:2: ( rule__HighPeaks__TimeAssignment_8 )
            // InternalAdeptness.g:1948:3: rule__HighPeaks__TimeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__HighPeaks__TimeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getHighPeaksAccess().getTimeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeaks__Group__8__Impl"


    // $ANTLR start "rule__ConstDeg__Group__0"
    // InternalAdeptness.g:1957:1: rule__ConstDeg__Group__0 : rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1 ;
    public final void rule__ConstDeg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1961:1: ( rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1 )
            // InternalAdeptness.g:1962:2: rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__ConstDeg__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstDeg__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstDeg__Group__0"


    // $ANTLR start "rule__ConstDeg__Group__0__Impl"
    // InternalAdeptness.g:1969:1: rule__ConstDeg__Group__0__Impl : ( 'constant' ) ;
    public final void rule__ConstDeg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1973:1: ( ( 'constant' ) )
            // InternalAdeptness.g:1974:1: ( 'constant' )
            {
            // InternalAdeptness.g:1974:1: ( 'constant' )
            // InternalAdeptness.g:1975:2: 'constant'
            {
             before(grammarAccess.getConstDegAccess().getConstantKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getConstDegAccess().getConstantKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstDeg__Group__0__Impl"


    // $ANTLR start "rule__ConstDeg__Group__1"
    // InternalAdeptness.g:1984:1: rule__ConstDeg__Group__1 : rule__ConstDeg__Group__1__Impl rule__ConstDeg__Group__2 ;
    public final void rule__ConstDeg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1988:1: ( rule__ConstDeg__Group__1__Impl rule__ConstDeg__Group__2 )
            // InternalAdeptness.g:1989:2: rule__ConstDeg__Group__1__Impl rule__ConstDeg__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__ConstDeg__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstDeg__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstDeg__Group__1"


    // $ANTLR start "rule__ConstDeg__Group__1__Impl"
    // InternalAdeptness.g:1996:1: rule__ConstDeg__Group__1__Impl : ( 'degradation' ) ;
    public final void rule__ConstDeg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2000:1: ( ( 'degradation' ) )
            // InternalAdeptness.g:2001:1: ( 'degradation' )
            {
            // InternalAdeptness.g:2001:1: ( 'degradation' )
            // InternalAdeptness.g:2002:2: 'degradation'
            {
             before(grammarAccess.getConstDegAccess().getDegradationKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConstDegAccess().getDegradationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstDeg__Group__1__Impl"


    // $ANTLR start "rule__ConstDeg__Group__2"
    // InternalAdeptness.g:2011:1: rule__ConstDeg__Group__2 : rule__ConstDeg__Group__2__Impl ;
    public final void rule__ConstDeg__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2015:1: ( rule__ConstDeg__Group__2__Impl )
            // InternalAdeptness.g:2016:2: rule__ConstDeg__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstDeg__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstDeg__Group__2"


    // $ANTLR start "rule__ConstDeg__Group__2__Impl"
    // InternalAdeptness.g:2022:1: rule__ConstDeg__Group__2__Impl : ( ( rule__ConstDeg__Alternatives_2 ) ) ;
    public final void rule__ConstDeg__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2026:1: ( ( ( rule__ConstDeg__Alternatives_2 ) ) )
            // InternalAdeptness.g:2027:1: ( ( rule__ConstDeg__Alternatives_2 ) )
            {
            // InternalAdeptness.g:2027:1: ( ( rule__ConstDeg__Alternatives_2 ) )
            // InternalAdeptness.g:2028:2: ( rule__ConstDeg__Alternatives_2 )
            {
             before(grammarAccess.getConstDegAccess().getAlternatives_2()); 
            // InternalAdeptness.g:2029:2: ( rule__ConstDeg__Alternatives_2 )
            // InternalAdeptness.g:2029:3: rule__ConstDeg__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__ConstDeg__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getConstDegAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstDeg__Group__2__Impl"


    // $ANTLR start "rule__HighTime__Group__0"
    // InternalAdeptness.g:2038:1: rule__HighTime__Group__0 : rule__HighTime__Group__0__Impl rule__HighTime__Group__1 ;
    public final void rule__HighTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2042:1: ( rule__HighTime__Group__0__Impl rule__HighTime__Group__1 )
            // InternalAdeptness.g:2043:2: rule__HighTime__Group__0__Impl rule__HighTime__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__HighTime__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighTime__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighTime__Group__0"


    // $ANTLR start "rule__HighTime__Group__0__Impl"
    // InternalAdeptness.g:2050:1: rule__HighTime__Group__0__Impl : ( 'higher' ) ;
    public final void rule__HighTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2054:1: ( ( 'higher' ) )
            // InternalAdeptness.g:2055:1: ( 'higher' )
            {
            // InternalAdeptness.g:2055:1: ( 'higher' )
            // InternalAdeptness.g:2056:2: 'higher'
            {
             before(grammarAccess.getHighTimeAccess().getHigherKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getHighTimeAccess().getHigherKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighTime__Group__0__Impl"


    // $ANTLR start "rule__HighTime__Group__1"
    // InternalAdeptness.g:2065:1: rule__HighTime__Group__1 : rule__HighTime__Group__1__Impl rule__HighTime__Group__2 ;
    public final void rule__HighTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2069:1: ( rule__HighTime__Group__1__Impl rule__HighTime__Group__2 )
            // InternalAdeptness.g:2070:2: rule__HighTime__Group__1__Impl rule__HighTime__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__HighTime__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighTime__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighTime__Group__1"


    // $ANTLR start "rule__HighTime__Group__1__Impl"
    // InternalAdeptness.g:2077:1: rule__HighTime__Group__1__Impl : ( 'than' ) ;
    public final void rule__HighTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2081:1: ( ( 'than' ) )
            // InternalAdeptness.g:2082:1: ( 'than' )
            {
            // InternalAdeptness.g:2082:1: ( 'than' )
            // InternalAdeptness.g:2083:2: 'than'
            {
             before(grammarAccess.getHighTimeAccess().getThanKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getHighTimeAccess().getThanKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighTime__Group__1__Impl"


    // $ANTLR start "rule__HighTime__Group__2"
    // InternalAdeptness.g:2092:1: rule__HighTime__Group__2 : rule__HighTime__Group__2__Impl rule__HighTime__Group__3 ;
    public final void rule__HighTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2096:1: ( rule__HighTime__Group__2__Impl rule__HighTime__Group__3 )
            // InternalAdeptness.g:2097:2: rule__HighTime__Group__2__Impl rule__HighTime__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__HighTime__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighTime__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighTime__Group__2"


    // $ANTLR start "rule__HighTime__Group__2__Impl"
    // InternalAdeptness.g:2104:1: rule__HighTime__Group__2__Impl : ( ( rule__HighTime__CantAssignment_2 ) ) ;
    public final void rule__HighTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2108:1: ( ( ( rule__HighTime__CantAssignment_2 ) ) )
            // InternalAdeptness.g:2109:1: ( ( rule__HighTime__CantAssignment_2 ) )
            {
            // InternalAdeptness.g:2109:1: ( ( rule__HighTime__CantAssignment_2 ) )
            // InternalAdeptness.g:2110:2: ( rule__HighTime__CantAssignment_2 )
            {
             before(grammarAccess.getHighTimeAccess().getCantAssignment_2()); 
            // InternalAdeptness.g:2111:2: ( rule__HighTime__CantAssignment_2 )
            // InternalAdeptness.g:2111:3: rule__HighTime__CantAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__HighTime__CantAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHighTimeAccess().getCantAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighTime__Group__2__Impl"


    // $ANTLR start "rule__HighTime__Group__3"
    // InternalAdeptness.g:2119:1: rule__HighTime__Group__3 : rule__HighTime__Group__3__Impl rule__HighTime__Group__4 ;
    public final void rule__HighTime__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2123:1: ( rule__HighTime__Group__3__Impl rule__HighTime__Group__4 )
            // InternalAdeptness.g:2124:2: rule__HighTime__Group__3__Impl rule__HighTime__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__HighTime__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighTime__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighTime__Group__3"


    // $ANTLR start "rule__HighTime__Group__3__Impl"
    // InternalAdeptness.g:2131:1: rule__HighTime__Group__3__Impl : ( 'in' ) ;
    public final void rule__HighTime__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2135:1: ( ( 'in' ) )
            // InternalAdeptness.g:2136:1: ( 'in' )
            {
            // InternalAdeptness.g:2136:1: ( 'in' )
            // InternalAdeptness.g:2137:2: 'in'
            {
             before(grammarAccess.getHighTimeAccess().getInKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getHighTimeAccess().getInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighTime__Group__3__Impl"


    // $ANTLR start "rule__HighTime__Group__4"
    // InternalAdeptness.g:2146:1: rule__HighTime__Group__4 : rule__HighTime__Group__4__Impl rule__HighTime__Group__5 ;
    public final void rule__HighTime__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2150:1: ( rule__HighTime__Group__4__Impl rule__HighTime__Group__5 )
            // InternalAdeptness.g:2151:2: rule__HighTime__Group__4__Impl rule__HighTime__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__HighTime__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighTime__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighTime__Group__4"


    // $ANTLR start "rule__HighTime__Group__4__Impl"
    // InternalAdeptness.g:2158:1: rule__HighTime__Group__4__Impl : ( 'a' ) ;
    public final void rule__HighTime__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2162:1: ( ( 'a' ) )
            // InternalAdeptness.g:2163:1: ( 'a' )
            {
            // InternalAdeptness.g:2163:1: ( 'a' )
            // InternalAdeptness.g:2164:2: 'a'
            {
             before(grammarAccess.getHighTimeAccess().getAKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getHighTimeAccess().getAKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighTime__Group__4__Impl"


    // $ANTLR start "rule__HighTime__Group__5"
    // InternalAdeptness.g:2173:1: rule__HighTime__Group__5 : rule__HighTime__Group__5__Impl rule__HighTime__Group__6 ;
    public final void rule__HighTime__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2177:1: ( rule__HighTime__Group__5__Impl rule__HighTime__Group__6 )
            // InternalAdeptness.g:2178:2: rule__HighTime__Group__5__Impl rule__HighTime__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__HighTime__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighTime__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighTime__Group__5"


    // $ANTLR start "rule__HighTime__Group__5__Impl"
    // InternalAdeptness.g:2185:1: rule__HighTime__Group__5__Impl : ( 'time' ) ;
    public final void rule__HighTime__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2189:1: ( ( 'time' ) )
            // InternalAdeptness.g:2190:1: ( 'time' )
            {
            // InternalAdeptness.g:2190:1: ( 'time' )
            // InternalAdeptness.g:2191:2: 'time'
            {
             before(grammarAccess.getHighTimeAccess().getTimeKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHighTimeAccess().getTimeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighTime__Group__5__Impl"


    // $ANTLR start "rule__HighTime__Group__6"
    // InternalAdeptness.g:2200:1: rule__HighTime__Group__6 : rule__HighTime__Group__6__Impl rule__HighTime__Group__7 ;
    public final void rule__HighTime__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2204:1: ( rule__HighTime__Group__6__Impl rule__HighTime__Group__7 )
            // InternalAdeptness.g:2205:2: rule__HighTime__Group__6__Impl rule__HighTime__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__HighTime__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighTime__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighTime__Group__6"


    // $ANTLR start "rule__HighTime__Group__6__Impl"
    // InternalAdeptness.g:2212:1: rule__HighTime__Group__6__Impl : ( 'of' ) ;
    public final void rule__HighTime__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2216:1: ( ( 'of' ) )
            // InternalAdeptness.g:2217:1: ( 'of' )
            {
            // InternalAdeptness.g:2217:1: ( 'of' )
            // InternalAdeptness.g:2218:2: 'of'
            {
             before(grammarAccess.getHighTimeAccess().getOfKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getHighTimeAccess().getOfKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighTime__Group__6__Impl"


    // $ANTLR start "rule__HighTime__Group__7"
    // InternalAdeptness.g:2227:1: rule__HighTime__Group__7 : rule__HighTime__Group__7__Impl ;
    public final void rule__HighTime__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2231:1: ( rule__HighTime__Group__7__Impl )
            // InternalAdeptness.g:2232:2: rule__HighTime__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HighTime__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighTime__Group__7"


    // $ANTLR start "rule__HighTime__Group__7__Impl"
    // InternalAdeptness.g:2238:1: rule__HighTime__Group__7__Impl : ( ( rule__HighTime__TimeAssignment_7 ) ) ;
    public final void rule__HighTime__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2242:1: ( ( ( rule__HighTime__TimeAssignment_7 ) ) )
            // InternalAdeptness.g:2243:1: ( ( rule__HighTime__TimeAssignment_7 ) )
            {
            // InternalAdeptness.g:2243:1: ( ( rule__HighTime__TimeAssignment_7 ) )
            // InternalAdeptness.g:2244:2: ( rule__HighTime__TimeAssignment_7 )
            {
             before(grammarAccess.getHighTimeAccess().getTimeAssignment_7()); 
            // InternalAdeptness.g:2245:2: ( rule__HighTime__TimeAssignment_7 )
            // InternalAdeptness.g:2245:3: rule__HighTime__TimeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__HighTime__TimeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getHighTimeAccess().getTimeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighTime__Group__7__Impl"


    // $ANTLR start "rule__HighPeak__Group__0"
    // InternalAdeptness.g:2254:1: rule__HighPeak__Group__0 : rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1 ;
    public final void rule__HighPeak__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2258:1: ( rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1 )
            // InternalAdeptness.g:2259:2: rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__HighPeak__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighPeak__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeak__Group__0"


    // $ANTLR start "rule__HighPeak__Group__0__Impl"
    // InternalAdeptness.g:2266:1: rule__HighPeak__Group__0__Impl : ( 'highest' ) ;
    public final void rule__HighPeak__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2270:1: ( ( 'highest' ) )
            // InternalAdeptness.g:2271:1: ( 'highest' )
            {
            // InternalAdeptness.g:2271:1: ( 'highest' )
            // InternalAdeptness.g:2272:2: 'highest'
            {
             before(grammarAccess.getHighPeakAccess().getHighestKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getHighPeakAccess().getHighestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeak__Group__0__Impl"


    // $ANTLR start "rule__HighPeak__Group__1"
    // InternalAdeptness.g:2281:1: rule__HighPeak__Group__1 : rule__HighPeak__Group__1__Impl rule__HighPeak__Group__2 ;
    public final void rule__HighPeak__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2285:1: ( rule__HighPeak__Group__1__Impl rule__HighPeak__Group__2 )
            // InternalAdeptness.g:2286:2: rule__HighPeak__Group__1__Impl rule__HighPeak__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__HighPeak__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighPeak__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeak__Group__1"


    // $ANTLR start "rule__HighPeak__Group__1__Impl"
    // InternalAdeptness.g:2293:1: rule__HighPeak__Group__1__Impl : ( 'value' ) ;
    public final void rule__HighPeak__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2297:1: ( ( 'value' ) )
            // InternalAdeptness.g:2298:1: ( 'value' )
            {
            // InternalAdeptness.g:2298:1: ( 'value' )
            // InternalAdeptness.g:2299:2: 'value'
            {
             before(grammarAccess.getHighPeakAccess().getValueKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHighPeakAccess().getValueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeak__Group__1__Impl"


    // $ANTLR start "rule__HighPeak__Group__2"
    // InternalAdeptness.g:2308:1: rule__HighPeak__Group__2 : rule__HighPeak__Group__2__Impl rule__HighPeak__Group__3 ;
    public final void rule__HighPeak__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2312:1: ( rule__HighPeak__Group__2__Impl rule__HighPeak__Group__3 )
            // InternalAdeptness.g:2313:2: rule__HighPeak__Group__2__Impl rule__HighPeak__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__HighPeak__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighPeak__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeak__Group__2"


    // $ANTLR start "rule__HighPeak__Group__2__Impl"
    // InternalAdeptness.g:2320:1: rule__HighPeak__Group__2__Impl : ( 'is' ) ;
    public final void rule__HighPeak__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2324:1: ( ( 'is' ) )
            // InternalAdeptness.g:2325:1: ( 'is' )
            {
            // InternalAdeptness.g:2325:1: ( 'is' )
            // InternalAdeptness.g:2326:2: 'is'
            {
             before(grammarAccess.getHighPeakAccess().getIsKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getHighPeakAccess().getIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeak__Group__2__Impl"


    // $ANTLR start "rule__HighPeak__Group__3"
    // InternalAdeptness.g:2335:1: rule__HighPeak__Group__3 : rule__HighPeak__Group__3__Impl rule__HighPeak__Group__4 ;
    public final void rule__HighPeak__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2339:1: ( rule__HighPeak__Group__3__Impl rule__HighPeak__Group__4 )
            // InternalAdeptness.g:2340:2: rule__HighPeak__Group__3__Impl rule__HighPeak__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__HighPeak__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighPeak__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeak__Group__3"


    // $ANTLR start "rule__HighPeak__Group__3__Impl"
    // InternalAdeptness.g:2347:1: rule__HighPeak__Group__3__Impl : ( 'higher' ) ;
    public final void rule__HighPeak__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2351:1: ( ( 'higher' ) )
            // InternalAdeptness.g:2352:1: ( 'higher' )
            {
            // InternalAdeptness.g:2352:1: ( 'higher' )
            // InternalAdeptness.g:2353:2: 'higher'
            {
             before(grammarAccess.getHighPeakAccess().getHigherKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getHighPeakAccess().getHigherKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeak__Group__3__Impl"


    // $ANTLR start "rule__HighPeak__Group__4"
    // InternalAdeptness.g:2362:1: rule__HighPeak__Group__4 : rule__HighPeak__Group__4__Impl rule__HighPeak__Group__5 ;
    public final void rule__HighPeak__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2366:1: ( rule__HighPeak__Group__4__Impl rule__HighPeak__Group__5 )
            // InternalAdeptness.g:2367:2: rule__HighPeak__Group__4__Impl rule__HighPeak__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__HighPeak__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighPeak__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeak__Group__4"


    // $ANTLR start "rule__HighPeak__Group__4__Impl"
    // InternalAdeptness.g:2374:1: rule__HighPeak__Group__4__Impl : ( 'than' ) ;
    public final void rule__HighPeak__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2378:1: ( ( 'than' ) )
            // InternalAdeptness.g:2379:1: ( 'than' )
            {
            // InternalAdeptness.g:2379:1: ( 'than' )
            // InternalAdeptness.g:2380:2: 'than'
            {
             before(grammarAccess.getHighPeakAccess().getThanKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getHighPeakAccess().getThanKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeak__Group__4__Impl"


    // $ANTLR start "rule__HighPeak__Group__5"
    // InternalAdeptness.g:2389:1: rule__HighPeak__Group__5 : rule__HighPeak__Group__5__Impl ;
    public final void rule__HighPeak__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2393:1: ( rule__HighPeak__Group__5__Impl )
            // InternalAdeptness.g:2394:2: rule__HighPeak__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HighPeak__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeak__Group__5"


    // $ANTLR start "rule__HighPeak__Group__5__Impl"
    // InternalAdeptness.g:2400:1: rule__HighPeak__Group__5__Impl : ( ( rule__HighPeak__CantAssignment_5 ) ) ;
    public final void rule__HighPeak__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2404:1: ( ( ( rule__HighPeak__CantAssignment_5 ) ) )
            // InternalAdeptness.g:2405:1: ( ( rule__HighPeak__CantAssignment_5 ) )
            {
            // InternalAdeptness.g:2405:1: ( ( rule__HighPeak__CantAssignment_5 ) )
            // InternalAdeptness.g:2406:2: ( rule__HighPeak__CantAssignment_5 )
            {
             before(grammarAccess.getHighPeakAccess().getCantAssignment_5()); 
            // InternalAdeptness.g:2407:2: ( rule__HighPeak__CantAssignment_5 )
            // InternalAdeptness.g:2407:3: rule__HighPeak__CantAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__HighPeak__CantAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getHighPeakAccess().getCantAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeak__Group__5__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalAdeptness.g:2416:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2420:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalAdeptness.g:2421:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // InternalAdeptness.g:2428:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__Alternatives_0 ) ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2432:1: ( ( ( rule__Reference__Alternatives_0 ) ) )
            // InternalAdeptness.g:2433:1: ( ( rule__Reference__Alternatives_0 ) )
            {
            // InternalAdeptness.g:2433:1: ( ( rule__Reference__Alternatives_0 ) )
            // InternalAdeptness.g:2434:2: ( rule__Reference__Alternatives_0 )
            {
             before(grammarAccess.getReferenceAccess().getAlternatives_0()); 
            // InternalAdeptness.g:2435:2: ( rule__Reference__Alternatives_0 )
            // InternalAdeptness.g:2435:3: rule__Reference__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalAdeptness.g:2443:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2447:1: ( rule__Reference__Group__1__Impl )
            // InternalAdeptness.g:2448:2: rule__Reference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // InternalAdeptness.g:2454:1: rule__Reference__Group__1__Impl : ( ',' ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2458:1: ( ( ',' ) )
            // InternalAdeptness.g:2459:1: ( ',' )
            {
            // InternalAdeptness.g:2459:1: ( ',' )
            // InternalAdeptness.g:2460:2: ','
            {
             before(grammarAccess.getReferenceAccess().getCommaKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Upper__Group__0"
    // InternalAdeptness.g:2470:1: rule__Upper__Group__0 : rule__Upper__Group__0__Impl rule__Upper__Group__1 ;
    public final void rule__Upper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2474:1: ( rule__Upper__Group__0__Impl rule__Upper__Group__1 )
            // InternalAdeptness.g:2475:2: rule__Upper__Group__0__Impl rule__Upper__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Upper__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Upper__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Upper__Group__0"


    // $ANTLR start "rule__Upper__Group__0__Impl"
    // InternalAdeptness.g:2482:1: rule__Upper__Group__0__Impl : ( 'below' ) ;
    public final void rule__Upper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2486:1: ( ( 'below' ) )
            // InternalAdeptness.g:2487:1: ( 'below' )
            {
            // InternalAdeptness.g:2487:1: ( 'below' )
            // InternalAdeptness.g:2488:2: 'below'
            {
             before(grammarAccess.getUpperAccess().getBelowKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getUpperAccess().getBelowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Upper__Group__0__Impl"


    // $ANTLR start "rule__Upper__Group__1"
    // InternalAdeptness.g:2497:1: rule__Upper__Group__1 : rule__Upper__Group__1__Impl rule__Upper__Group__2 ;
    public final void rule__Upper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2501:1: ( rule__Upper__Group__1__Impl rule__Upper__Group__2 )
            // InternalAdeptness.g:2502:2: rule__Upper__Group__1__Impl rule__Upper__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Upper__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Upper__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Upper__Group__1"


    // $ANTLR start "rule__Upper__Group__1__Impl"
    // InternalAdeptness.g:2509:1: rule__Upper__Group__1__Impl : ( 'than' ) ;
    public final void rule__Upper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2513:1: ( ( 'than' ) )
            // InternalAdeptness.g:2514:1: ( 'than' )
            {
            // InternalAdeptness.g:2514:1: ( 'than' )
            // InternalAdeptness.g:2515:2: 'than'
            {
             before(grammarAccess.getUpperAccess().getThanKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getUpperAccess().getThanKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Upper__Group__1__Impl"


    // $ANTLR start "rule__Upper__Group__2"
    // InternalAdeptness.g:2524:1: rule__Upper__Group__2 : rule__Upper__Group__2__Impl ;
    public final void rule__Upper__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2528:1: ( rule__Upper__Group__2__Impl )
            // InternalAdeptness.g:2529:2: rule__Upper__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Upper__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Upper__Group__2"


    // $ANTLR start "rule__Upper__Group__2__Impl"
    // InternalAdeptness.g:2535:1: rule__Upper__Group__2__Impl : ( ( rule__Upper__Bound_uppAssignment_2 ) ) ;
    public final void rule__Upper__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2539:1: ( ( ( rule__Upper__Bound_uppAssignment_2 ) ) )
            // InternalAdeptness.g:2540:1: ( ( rule__Upper__Bound_uppAssignment_2 ) )
            {
            // InternalAdeptness.g:2540:1: ( ( rule__Upper__Bound_uppAssignment_2 ) )
            // InternalAdeptness.g:2541:2: ( rule__Upper__Bound_uppAssignment_2 )
            {
             before(grammarAccess.getUpperAccess().getBound_uppAssignment_2()); 
            // InternalAdeptness.g:2542:2: ( rule__Upper__Bound_uppAssignment_2 )
            // InternalAdeptness.g:2542:3: rule__Upper__Bound_uppAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Upper__Bound_uppAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUpperAccess().getBound_uppAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Upper__Group__2__Impl"


    // $ANTLR start "rule__Lower__Group__0"
    // InternalAdeptness.g:2551:1: rule__Lower__Group__0 : rule__Lower__Group__0__Impl rule__Lower__Group__1 ;
    public final void rule__Lower__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2555:1: ( rule__Lower__Group__0__Impl rule__Lower__Group__1 )
            // InternalAdeptness.g:2556:2: rule__Lower__Group__0__Impl rule__Lower__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Lower__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lower__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lower__Group__0"


    // $ANTLR start "rule__Lower__Group__0__Impl"
    // InternalAdeptness.g:2563:1: rule__Lower__Group__0__Impl : ( 'above' ) ;
    public final void rule__Lower__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2567:1: ( ( 'above' ) )
            // InternalAdeptness.g:2568:1: ( 'above' )
            {
            // InternalAdeptness.g:2568:1: ( 'above' )
            // InternalAdeptness.g:2569:2: 'above'
            {
             before(grammarAccess.getLowerAccess().getAboveKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLowerAccess().getAboveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lower__Group__0__Impl"


    // $ANTLR start "rule__Lower__Group__1"
    // InternalAdeptness.g:2578:1: rule__Lower__Group__1 : rule__Lower__Group__1__Impl rule__Lower__Group__2 ;
    public final void rule__Lower__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2582:1: ( rule__Lower__Group__1__Impl rule__Lower__Group__2 )
            // InternalAdeptness.g:2583:2: rule__Lower__Group__1__Impl rule__Lower__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Lower__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lower__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lower__Group__1"


    // $ANTLR start "rule__Lower__Group__1__Impl"
    // InternalAdeptness.g:2590:1: rule__Lower__Group__1__Impl : ( 'than' ) ;
    public final void rule__Lower__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2594:1: ( ( 'than' ) )
            // InternalAdeptness.g:2595:1: ( 'than' )
            {
            // InternalAdeptness.g:2595:1: ( 'than' )
            // InternalAdeptness.g:2596:2: 'than'
            {
             before(grammarAccess.getLowerAccess().getThanKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLowerAccess().getThanKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lower__Group__1__Impl"


    // $ANTLR start "rule__Lower__Group__2"
    // InternalAdeptness.g:2605:1: rule__Lower__Group__2 : rule__Lower__Group__2__Impl ;
    public final void rule__Lower__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2609:1: ( rule__Lower__Group__2__Impl )
            // InternalAdeptness.g:2610:2: rule__Lower__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lower__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lower__Group__2"


    // $ANTLR start "rule__Lower__Group__2__Impl"
    // InternalAdeptness.g:2616:1: rule__Lower__Group__2__Impl : ( ( rule__Lower__Bound_lowerAssignment_2 ) ) ;
    public final void rule__Lower__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2620:1: ( ( ( rule__Lower__Bound_lowerAssignment_2 ) ) )
            // InternalAdeptness.g:2621:1: ( ( rule__Lower__Bound_lowerAssignment_2 ) )
            {
            // InternalAdeptness.g:2621:1: ( ( rule__Lower__Bound_lowerAssignment_2 ) )
            // InternalAdeptness.g:2622:2: ( rule__Lower__Bound_lowerAssignment_2 )
            {
             before(grammarAccess.getLowerAccess().getBound_lowerAssignment_2()); 
            // InternalAdeptness.g:2623:2: ( rule__Lower__Bound_lowerAssignment_2 )
            // InternalAdeptness.g:2623:3: rule__Lower__Bound_lowerAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Lower__Bound_lowerAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLowerAccess().getBound_lowerAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lower__Group__2__Impl"


    // $ANTLR start "rule__Range__Group__0"
    // InternalAdeptness.g:2632:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2636:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // InternalAdeptness.g:2637:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Range__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0"


    // $ANTLR start "rule__Range__Group__0__Impl"
    // InternalAdeptness.g:2644:1: rule__Range__Group__0__Impl : ( 'in' ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2648:1: ( ( 'in' ) )
            // InternalAdeptness.g:2649:1: ( 'in' )
            {
            // InternalAdeptness.g:2649:1: ( 'in' )
            // InternalAdeptness.g:2650:2: 'in'
            {
             before(grammarAccess.getRangeAccess().getInKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getInKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0__Impl"


    // $ANTLR start "rule__Range__Group__1"
    // InternalAdeptness.g:2659:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2663:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // InternalAdeptness.g:2664:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Range__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1"


    // $ANTLR start "rule__Range__Group__1__Impl"
    // InternalAdeptness.g:2671:1: rule__Range__Group__1__Impl : ( 'range' ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2675:1: ( ( 'range' ) )
            // InternalAdeptness.g:2676:1: ( 'range' )
            {
            // InternalAdeptness.g:2676:1: ( 'range' )
            // InternalAdeptness.g:2677:2: 'range'
            {
             before(grammarAccess.getRangeAccess().getRangeKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getRangeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1__Impl"


    // $ANTLR start "rule__Range__Group__2"
    // InternalAdeptness.g:2686:1: rule__Range__Group__2 : rule__Range__Group__2__Impl rule__Range__Group__3 ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2690:1: ( rule__Range__Group__2__Impl rule__Range__Group__3 )
            // InternalAdeptness.g:2691:2: rule__Range__Group__2__Impl rule__Range__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Range__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2"


    // $ANTLR start "rule__Range__Group__2__Impl"
    // InternalAdeptness.g:2698:1: rule__Range__Group__2__Impl : ( 'between' ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2702:1: ( ( 'between' ) )
            // InternalAdeptness.g:2703:1: ( 'between' )
            {
            // InternalAdeptness.g:2703:1: ( 'between' )
            // InternalAdeptness.g:2704:2: 'between'
            {
             before(grammarAccess.getRangeAccess().getBetweenKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getBetweenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2__Impl"


    // $ANTLR start "rule__Range__Group__3"
    // InternalAdeptness.g:2713:1: rule__Range__Group__3 : rule__Range__Group__3__Impl rule__Range__Group__4 ;
    public final void rule__Range__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2717:1: ( rule__Range__Group__3__Impl rule__Range__Group__4 )
            // InternalAdeptness.g:2718:2: rule__Range__Group__3__Impl rule__Range__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__Range__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__3"


    // $ANTLR start "rule__Range__Group__3__Impl"
    // InternalAdeptness.g:2725:1: rule__Range__Group__3__Impl : ( ( rule__Range__Bound_lowerAssignment_3 ) ) ;
    public final void rule__Range__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2729:1: ( ( ( rule__Range__Bound_lowerAssignment_3 ) ) )
            // InternalAdeptness.g:2730:1: ( ( rule__Range__Bound_lowerAssignment_3 ) )
            {
            // InternalAdeptness.g:2730:1: ( ( rule__Range__Bound_lowerAssignment_3 ) )
            // InternalAdeptness.g:2731:2: ( rule__Range__Bound_lowerAssignment_3 )
            {
             before(grammarAccess.getRangeAccess().getBound_lowerAssignment_3()); 
            // InternalAdeptness.g:2732:2: ( rule__Range__Bound_lowerAssignment_3 )
            // InternalAdeptness.g:2732:3: rule__Range__Bound_lowerAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Range__Bound_lowerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getBound_lowerAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__3__Impl"


    // $ANTLR start "rule__Range__Group__4"
    // InternalAdeptness.g:2740:1: rule__Range__Group__4 : rule__Range__Group__4__Impl rule__Range__Group__5 ;
    public final void rule__Range__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2744:1: ( rule__Range__Group__4__Impl rule__Range__Group__5 )
            // InternalAdeptness.g:2745:2: rule__Range__Group__4__Impl rule__Range__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Range__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__4"


    // $ANTLR start "rule__Range__Group__4__Impl"
    // InternalAdeptness.g:2752:1: rule__Range__Group__4__Impl : ( 'and' ) ;
    public final void rule__Range__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2756:1: ( ( 'and' ) )
            // InternalAdeptness.g:2757:1: ( 'and' )
            {
            // InternalAdeptness.g:2757:1: ( 'and' )
            // InternalAdeptness.g:2758:2: 'and'
            {
             before(grammarAccess.getRangeAccess().getAndKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getAndKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__4__Impl"


    // $ANTLR start "rule__Range__Group__5"
    // InternalAdeptness.g:2767:1: rule__Range__Group__5 : rule__Range__Group__5__Impl ;
    public final void rule__Range__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2771:1: ( rule__Range__Group__5__Impl )
            // InternalAdeptness.g:2772:2: rule__Range__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__5"


    // $ANTLR start "rule__Range__Group__5__Impl"
    // InternalAdeptness.g:2778:1: rule__Range__Group__5__Impl : ( ( rule__Range__Bound_uppAssignment_5 ) ) ;
    public final void rule__Range__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2782:1: ( ( ( rule__Range__Bound_uppAssignment_5 ) ) )
            // InternalAdeptness.g:2783:1: ( ( rule__Range__Bound_uppAssignment_5 ) )
            {
            // InternalAdeptness.g:2783:1: ( ( rule__Range__Bound_uppAssignment_5 ) )
            // InternalAdeptness.g:2784:2: ( rule__Range__Bound_uppAssignment_5 )
            {
             before(grammarAccess.getRangeAccess().getBound_uppAssignment_5()); 
            // InternalAdeptness.g:2785:2: ( rule__Range__Bound_uppAssignment_5 )
            // InternalAdeptness.g:2785:3: rule__Range__Bound_uppAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Range__Bound_uppAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getBound_uppAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__5__Impl"


    // $ANTLR start "rule__Gap__Group__0"
    // InternalAdeptness.g:2794:1: rule__Gap__Group__0 : rule__Gap__Group__0__Impl rule__Gap__Group__1 ;
    public final void rule__Gap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2798:1: ( rule__Gap__Group__0__Impl rule__Gap__Group__1 )
            // InternalAdeptness.g:2799:2: rule__Gap__Group__0__Impl rule__Gap__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Gap__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gap__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gap__Group__0"


    // $ANTLR start "rule__Gap__Group__0__Impl"
    // InternalAdeptness.g:2806:1: rule__Gap__Group__0__Impl : ( 'not' ) ;
    public final void rule__Gap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2810:1: ( ( 'not' ) )
            // InternalAdeptness.g:2811:1: ( 'not' )
            {
            // InternalAdeptness.g:2811:1: ( 'not' )
            // InternalAdeptness.g:2812:2: 'not'
            {
             before(grammarAccess.getGapAccess().getNotKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getGapAccess().getNotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gap__Group__0__Impl"


    // $ANTLR start "rule__Gap__Group__1"
    // InternalAdeptness.g:2821:1: rule__Gap__Group__1 : rule__Gap__Group__1__Impl rule__Gap__Group__2 ;
    public final void rule__Gap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2825:1: ( rule__Gap__Group__1__Impl rule__Gap__Group__2 )
            // InternalAdeptness.g:2826:2: rule__Gap__Group__1__Impl rule__Gap__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__Gap__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gap__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gap__Group__1"


    // $ANTLR start "rule__Gap__Group__1__Impl"
    // InternalAdeptness.g:2833:1: rule__Gap__Group__1__Impl : ( 'in' ) ;
    public final void rule__Gap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2837:1: ( ( 'in' ) )
            // InternalAdeptness.g:2838:1: ( 'in' )
            {
            // InternalAdeptness.g:2838:1: ( 'in' )
            // InternalAdeptness.g:2839:2: 'in'
            {
             before(grammarAccess.getGapAccess().getInKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGapAccess().getInKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gap__Group__1__Impl"


    // $ANTLR start "rule__Gap__Group__2"
    // InternalAdeptness.g:2848:1: rule__Gap__Group__2 : rule__Gap__Group__2__Impl rule__Gap__Group__3 ;
    public final void rule__Gap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2852:1: ( rule__Gap__Group__2__Impl rule__Gap__Group__3 )
            // InternalAdeptness.g:2853:2: rule__Gap__Group__2__Impl rule__Gap__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__Gap__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gap__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gap__Group__2"


    // $ANTLR start "rule__Gap__Group__2__Impl"
    // InternalAdeptness.g:2860:1: rule__Gap__Group__2__Impl : ( 'range' ) ;
    public final void rule__Gap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2864:1: ( ( 'range' ) )
            // InternalAdeptness.g:2865:1: ( 'range' )
            {
            // InternalAdeptness.g:2865:1: ( 'range' )
            // InternalAdeptness.g:2866:2: 'range'
            {
             before(grammarAccess.getGapAccess().getRangeKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGapAccess().getRangeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gap__Group__2__Impl"


    // $ANTLR start "rule__Gap__Group__3"
    // InternalAdeptness.g:2875:1: rule__Gap__Group__3 : rule__Gap__Group__3__Impl rule__Gap__Group__4 ;
    public final void rule__Gap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2879:1: ( rule__Gap__Group__3__Impl rule__Gap__Group__4 )
            // InternalAdeptness.g:2880:2: rule__Gap__Group__3__Impl rule__Gap__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Gap__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gap__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gap__Group__3"


    // $ANTLR start "rule__Gap__Group__3__Impl"
    // InternalAdeptness.g:2887:1: rule__Gap__Group__3__Impl : ( 'between' ) ;
    public final void rule__Gap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2891:1: ( ( 'between' ) )
            // InternalAdeptness.g:2892:1: ( 'between' )
            {
            // InternalAdeptness.g:2892:1: ( 'between' )
            // InternalAdeptness.g:2893:2: 'between'
            {
             before(grammarAccess.getGapAccess().getBetweenKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getGapAccess().getBetweenKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gap__Group__3__Impl"


    // $ANTLR start "rule__Gap__Group__4"
    // InternalAdeptness.g:2902:1: rule__Gap__Group__4 : rule__Gap__Group__4__Impl rule__Gap__Group__5 ;
    public final void rule__Gap__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2906:1: ( rule__Gap__Group__4__Impl rule__Gap__Group__5 )
            // InternalAdeptness.g:2907:2: rule__Gap__Group__4__Impl rule__Gap__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__Gap__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gap__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gap__Group__4"


    // $ANTLR start "rule__Gap__Group__4__Impl"
    // InternalAdeptness.g:2914:1: rule__Gap__Group__4__Impl : ( ( rule__Gap__Bound_lowerAssignment_4 ) ) ;
    public final void rule__Gap__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2918:1: ( ( ( rule__Gap__Bound_lowerAssignment_4 ) ) )
            // InternalAdeptness.g:2919:1: ( ( rule__Gap__Bound_lowerAssignment_4 ) )
            {
            // InternalAdeptness.g:2919:1: ( ( rule__Gap__Bound_lowerAssignment_4 ) )
            // InternalAdeptness.g:2920:2: ( rule__Gap__Bound_lowerAssignment_4 )
            {
             before(grammarAccess.getGapAccess().getBound_lowerAssignment_4()); 
            // InternalAdeptness.g:2921:2: ( rule__Gap__Bound_lowerAssignment_4 )
            // InternalAdeptness.g:2921:3: rule__Gap__Bound_lowerAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Gap__Bound_lowerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGapAccess().getBound_lowerAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gap__Group__4__Impl"


    // $ANTLR start "rule__Gap__Group__5"
    // InternalAdeptness.g:2929:1: rule__Gap__Group__5 : rule__Gap__Group__5__Impl rule__Gap__Group__6 ;
    public final void rule__Gap__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2933:1: ( rule__Gap__Group__5__Impl rule__Gap__Group__6 )
            // InternalAdeptness.g:2934:2: rule__Gap__Group__5__Impl rule__Gap__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Gap__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gap__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gap__Group__5"


    // $ANTLR start "rule__Gap__Group__5__Impl"
    // InternalAdeptness.g:2941:1: rule__Gap__Group__5__Impl : ( 'and' ) ;
    public final void rule__Gap__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2945:1: ( ( 'and' ) )
            // InternalAdeptness.g:2946:1: ( 'and' )
            {
            // InternalAdeptness.g:2946:1: ( 'and' )
            // InternalAdeptness.g:2947:2: 'and'
            {
             before(grammarAccess.getGapAccess().getAndKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getGapAccess().getAndKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gap__Group__5__Impl"


    // $ANTLR start "rule__Gap__Group__6"
    // InternalAdeptness.g:2956:1: rule__Gap__Group__6 : rule__Gap__Group__6__Impl ;
    public final void rule__Gap__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2960:1: ( rule__Gap__Group__6__Impl )
            // InternalAdeptness.g:2961:2: rule__Gap__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gap__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gap__Group__6"


    // $ANTLR start "rule__Gap__Group__6__Impl"
    // InternalAdeptness.g:2967:1: rule__Gap__Group__6__Impl : ( ( rule__Gap__Bound_uppAssignment_6 ) ) ;
    public final void rule__Gap__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2971:1: ( ( ( rule__Gap__Bound_uppAssignment_6 ) ) )
            // InternalAdeptness.g:2972:1: ( ( rule__Gap__Bound_uppAssignment_6 ) )
            {
            // InternalAdeptness.g:2972:1: ( ( rule__Gap__Bound_uppAssignment_6 ) )
            // InternalAdeptness.g:2973:2: ( rule__Gap__Bound_uppAssignment_6 )
            {
             before(grammarAccess.getGapAccess().getBound_uppAssignment_6()); 
            // InternalAdeptness.g:2974:2: ( rule__Gap__Bound_uppAssignment_6 )
            // InternalAdeptness.g:2974:3: rule__Gap__Bound_uppAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Gap__Bound_uppAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getGapAccess().getBound_uppAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gap__Group__6__Impl"


    // $ANTLR start "rule__D__Group__0"
    // InternalAdeptness.g:2983:1: rule__D__Group__0 : rule__D__Group__0__Impl rule__D__Group__1 ;
    public final void rule__D__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2987:1: ( rule__D__Group__0__Impl rule__D__Group__1 )
            // InternalAdeptness.g:2988:2: rule__D__Group__0__Impl rule__D__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__D__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__D__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__D__Group__0"


    // $ANTLR start "rule__D__Group__0__Impl"
    // InternalAdeptness.g:2995:1: rule__D__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__D__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2999:1: ( ( ( '-' )? ) )
            // InternalAdeptness.g:3000:1: ( ( '-' )? )
            {
            // InternalAdeptness.g:3000:1: ( ( '-' )? )
            // InternalAdeptness.g:3001:2: ( '-' )?
            {
             before(grammarAccess.getDAccess().getHyphenMinusKeyword_0()); 
            // InternalAdeptness.g:3002:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==42) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAdeptness.g:3002:3: '-'
                    {
                    match(input,42,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__D__Group__0__Impl"


    // $ANTLR start "rule__D__Group__1"
    // InternalAdeptness.g:3010:1: rule__D__Group__1 : rule__D__Group__1__Impl rule__D__Group__2 ;
    public final void rule__D__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3014:1: ( rule__D__Group__1__Impl rule__D__Group__2 )
            // InternalAdeptness.g:3015:2: rule__D__Group__1__Impl rule__D__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__D__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__D__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__D__Group__1"


    // $ANTLR start "rule__D__Group__1__Impl"
    // InternalAdeptness.g:3022:1: rule__D__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__D__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3026:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:3027:1: ( RULE_INT )
            {
            // InternalAdeptness.g:3027:1: ( RULE_INT )
            // InternalAdeptness.g:3028:2: RULE_INT
            {
             before(grammarAccess.getDAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__D__Group__1__Impl"


    // $ANTLR start "rule__D__Group__2"
    // InternalAdeptness.g:3037:1: rule__D__Group__2 : rule__D__Group__2__Impl ;
    public final void rule__D__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3041:1: ( rule__D__Group__2__Impl )
            // InternalAdeptness.g:3042:2: rule__D__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__D__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__D__Group__2"


    // $ANTLR start "rule__D__Group__2__Impl"
    // InternalAdeptness.g:3048:1: rule__D__Group__2__Impl : ( ( rule__D__Group_2__0 )? ) ;
    public final void rule__D__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3052:1: ( ( ( rule__D__Group_2__0 )? ) )
            // InternalAdeptness.g:3053:1: ( ( rule__D__Group_2__0 )? )
            {
            // InternalAdeptness.g:3053:1: ( ( rule__D__Group_2__0 )? )
            // InternalAdeptness.g:3054:2: ( rule__D__Group_2__0 )?
            {
             before(grammarAccess.getDAccess().getGroup_2()); 
            // InternalAdeptness.g:3055:2: ( rule__D__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAdeptness.g:3055:3: rule__D__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__D__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__D__Group__2__Impl"


    // $ANTLR start "rule__D__Group_2__0"
    // InternalAdeptness.g:3064:1: rule__D__Group_2__0 : rule__D__Group_2__0__Impl rule__D__Group_2__1 ;
    public final void rule__D__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3068:1: ( rule__D__Group_2__0__Impl rule__D__Group_2__1 )
            // InternalAdeptness.g:3069:2: rule__D__Group_2__0__Impl rule__D__Group_2__1
            {
            pushFollow(FOLLOW_36);
            rule__D__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__D__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__D__Group_2__0"


    // $ANTLR start "rule__D__Group_2__0__Impl"
    // InternalAdeptness.g:3076:1: rule__D__Group_2__0__Impl : ( '.' ) ;
    public final void rule__D__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3080:1: ( ( '.' ) )
            // InternalAdeptness.g:3081:1: ( '.' )
            {
            // InternalAdeptness.g:3081:1: ( '.' )
            // InternalAdeptness.g:3082:2: '.'
            {
             before(grammarAccess.getDAccess().getFullStopKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__D__Group_2__0__Impl"


    // $ANTLR start "rule__D__Group_2__1"
    // InternalAdeptness.g:3091:1: rule__D__Group_2__1 : rule__D__Group_2__1__Impl ;
    public final void rule__D__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3095:1: ( rule__D__Group_2__1__Impl )
            // InternalAdeptness.g:3096:2: rule__D__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__D__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__D__Group_2__1"


    // $ANTLR start "rule__D__Group_2__1__Impl"
    // InternalAdeptness.g:3102:1: rule__D__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__D__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3106:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:3107:1: ( RULE_INT )
            {
            // InternalAdeptness.g:3107:1: ( RULE_INT )
            // InternalAdeptness.g:3108:2: RULE_INT
            {
             before(grammarAccess.getDAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDAccess().getINTTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__D__Group_2__1__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalAdeptness.g:3118:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3122:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalAdeptness.g:3123:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // InternalAdeptness.g:3130:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3134:1: ( ( 'datatype' ) )
            // InternalAdeptness.g:3135:1: ( 'datatype' )
            {
            // InternalAdeptness.g:3135:1: ( 'datatype' )
            // InternalAdeptness.g:3136:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalAdeptness.g:3145:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3149:1: ( rule__DataType__Group__1__Impl )
            // InternalAdeptness.g:3150:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // InternalAdeptness.g:3156:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3160:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalAdeptness.g:3161:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:3161:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalAdeptness.g:3162:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:3163:2: ( rule__DataType__NameAssignment_1 )
            // InternalAdeptness.g:3163:3: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // InternalAdeptness.g:3172:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3176:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // InternalAdeptness.g:3177:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // InternalAdeptness.g:3184:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3188:1: ( ( 'package' ) )
            // InternalAdeptness.g:3189:1: ( 'package' )
            {
            // InternalAdeptness.g:3189:1: ( 'package' )
            // InternalAdeptness.g:3190:2: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // InternalAdeptness.g:3199:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3203:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // InternalAdeptness.g:3204:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // InternalAdeptness.g:3211:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3215:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // InternalAdeptness.g:3216:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:3216:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // InternalAdeptness.g:3217:2: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:3218:2: ( rule__PackageDeclaration__NameAssignment_1 )
            // InternalAdeptness.g:3218:3: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__2"
    // InternalAdeptness.g:3226:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3230:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // InternalAdeptness.g:3231:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__PackageDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2"


    // $ANTLR start "rule__PackageDeclaration__Group__2__Impl"
    // InternalAdeptness.g:3238:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3242:1: ( ( '{' ) )
            // InternalAdeptness.g:3243:1: ( '{' )
            {
            // InternalAdeptness.g:3243:1: ( '{' )
            // InternalAdeptness.g:3244:2: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__3"
    // InternalAdeptness.g:3253:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3257:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // InternalAdeptness.g:3258:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__PackageDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3"


    // $ANTLR start "rule__PackageDeclaration__Group__3__Impl"
    // InternalAdeptness.g:3265:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3269:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) )
            // InternalAdeptness.g:3270:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            {
            // InternalAdeptness.g:3270:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            // InternalAdeptness.g:3271:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 
            // InternalAdeptness.g:3272:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13||LA15_0==16||(LA15_0>=43 && LA15_0<=44)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAdeptness.g:3272:3: rule__PackageDeclaration__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__PackageDeclaration__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__4"
    // InternalAdeptness.g:3280:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3284:1: ( rule__PackageDeclaration__Group__4__Impl )
            // InternalAdeptness.g:3285:2: rule__PackageDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4"


    // $ANTLR start "rule__PackageDeclaration__Group__4__Impl"
    // InternalAdeptness.g:3291:1: rule__PackageDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3295:1: ( ( '}' ) )
            // InternalAdeptness.g:3296:1: ( '}' )
            {
            // InternalAdeptness.g:3296:1: ( '}' )
            // InternalAdeptness.g:3297:2: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4__Impl"


    // $ANTLR start "rule__Adeptness__ElementsAssignment"
    // InternalAdeptness.g:3307:1: rule__Adeptness__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Adeptness__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3311:1: ( ( ruleAbstractElement ) )
            // InternalAdeptness.g:3312:2: ( ruleAbstractElement )
            {
            // InternalAdeptness.g:3312:2: ( ruleAbstractElement )
            // InternalAdeptness.g:3313:3: ruleAbstractElement
            {
             before(grammarAccess.getAdeptnessAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAdeptnessAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Adeptness__ElementsAssignment"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalAdeptness.g:3322:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3326:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalAdeptness.g:3327:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalAdeptness.g:3327:2: ( ruleQualifiedNameWithWildcard )
            // InternalAdeptness.g:3328:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Signal__NameAssignment_1"
    // InternalAdeptness.g:3337:1: rule__Signal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3341:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:3342:2: ( RULE_ID )
            {
            // InternalAdeptness.g:3342:2: ( RULE_ID )
            // InternalAdeptness.g:3343:3: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__NameAssignment_1"


    // $ANTLR start "rule__Signal__OracleAssignment_3"
    // InternalAdeptness.g:3352:1: rule__Signal__OracleAssignment_3 : ( ruleOracle ) ;
    public final void rule__Signal__OracleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3356:1: ( ( ruleOracle ) )
            // InternalAdeptness.g:3357:2: ( ruleOracle )
            {
            // InternalAdeptness.g:3357:2: ( ruleOracle )
            // InternalAdeptness.g:3358:3: ruleOracle
            {
             before(grammarAccess.getSignalAccess().getOracleOracleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOracle();

            state._fsp--;

             after(grammarAccess.getSignalAccess().getOracleOracleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__OracleAssignment_3"


    // $ANTLR start "rule__Oracle__NameAssignment_1"
    // InternalAdeptness.g:3367:1: rule__Oracle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Oracle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3371:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:3372:2: ( RULE_ID )
            {
            // InternalAdeptness.g:3372:2: ( RULE_ID )
            // InternalAdeptness.g:3373:3: RULE_ID
            {
             before(grammarAccess.getOracleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOracleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__NameAssignment_1"


    // $ANTLR start "rule__Oracle__CheckAssignment_3"
    // InternalAdeptness.g:3382:1: rule__Oracle__CheckAssignment_3 : ( ruleCheck ) ;
    public final void rule__Oracle__CheckAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3386:1: ( ( ruleCheck ) )
            // InternalAdeptness.g:3387:2: ( ruleCheck )
            {
            // InternalAdeptness.g:3387:2: ( ruleCheck )
            // InternalAdeptness.g:3388:3: ruleCheck
            {
             before(grammarAccess.getOracleAccess().getCheckCheckParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCheck();

            state._fsp--;

             after(grammarAccess.getOracleAccess().getCheckCheckParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__CheckAssignment_3"


    // $ANTLR start "rule__Check__NameAssignment_1"
    // InternalAdeptness.g:3397:1: rule__Check__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Check__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3401:1: ( ( RULE_STRING ) )
            // InternalAdeptness.g:3402:2: ( RULE_STRING )
            {
            // InternalAdeptness.g:3402:2: ( RULE_STRING )
            // InternalAdeptness.g:3403:3: RULE_STRING
            {
             before(grammarAccess.getCheckAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCheckAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__NameAssignment_1"


    // $ANTLR start "rule__Check__ReferenceAssignment_3"
    // InternalAdeptness.g:3412:1: rule__Check__ReferenceAssignment_3 : ( ruleReference ) ;
    public final void rule__Check__ReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3416:1: ( ( ruleReference ) )
            // InternalAdeptness.g:3417:2: ( ruleReference )
            {
            // InternalAdeptness.g:3417:2: ( ruleReference )
            // InternalAdeptness.g:3418:3: ruleReference
            {
             before(grammarAccess.getCheckAccess().getReferenceReferenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getCheckAccess().getReferenceReferenceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__ReferenceAssignment_3"


    // $ANTLR start "rule__Check__FailReasonAssignment_4"
    // InternalAdeptness.g:3427:1: rule__Check__FailReasonAssignment_4 : ( ruleFailReason ) ;
    public final void rule__Check__FailReasonAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3431:1: ( ( ruleFailReason ) )
            // InternalAdeptness.g:3432:2: ( ruleFailReason )
            {
            // InternalAdeptness.g:3432:2: ( ruleFailReason )
            // InternalAdeptness.g:3433:3: ruleFailReason
            {
             before(grammarAccess.getCheckAccess().getFailReasonFailReasonParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFailReason();

            state._fsp--;

             after(grammarAccess.getCheckAccess().getFailReasonFailReasonParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__FailReasonAssignment_4"


    // $ANTLR start "rule__Check__DescriptionAssignment_5"
    // InternalAdeptness.g:3442:1: rule__Check__DescriptionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Check__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3446:1: ( ( RULE_STRING ) )
            // InternalAdeptness.g:3447:2: ( RULE_STRING )
            {
            // InternalAdeptness.g:3447:2: ( RULE_STRING )
            // InternalAdeptness.g:3448:3: RULE_STRING
            {
             before(grammarAccess.getCheckAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCheckAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__DescriptionAssignment_5"


    // $ANTLR start "rule__FailReason__HighPeakAssignment_3_0"
    // InternalAdeptness.g:3457:1: rule__FailReason__HighPeakAssignment_3_0 : ( ruleHighPeak ) ;
    public final void rule__FailReason__HighPeakAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3461:1: ( ( ruleHighPeak ) )
            // InternalAdeptness.g:3462:2: ( ruleHighPeak )
            {
            // InternalAdeptness.g:3462:2: ( ruleHighPeak )
            // InternalAdeptness.g:3463:3: ruleHighPeak
            {
             before(grammarAccess.getFailReasonAccess().getHighPeakHighPeakParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHighPeak();

            state._fsp--;

             after(grammarAccess.getFailReasonAccess().getHighPeakHighPeakParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FailReason__HighPeakAssignment_3_0"


    // $ANTLR start "rule__FailReason__HighTimeAssignment_3_1"
    // InternalAdeptness.g:3472:1: rule__FailReason__HighTimeAssignment_3_1 : ( ruleHighTime ) ;
    public final void rule__FailReason__HighTimeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3476:1: ( ( ruleHighTime ) )
            // InternalAdeptness.g:3477:2: ( ruleHighTime )
            {
            // InternalAdeptness.g:3477:2: ( ruleHighTime )
            // InternalAdeptness.g:3478:3: ruleHighTime
            {
             before(grammarAccess.getFailReasonAccess().getHighTimeHighTimeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHighTime();

            state._fsp--;

             after(grammarAccess.getFailReasonAccess().getHighTimeHighTimeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FailReason__HighTimeAssignment_3_1"


    // $ANTLR start "rule__FailReason__ConstDegAssignment_3_2"
    // InternalAdeptness.g:3487:1: rule__FailReason__ConstDegAssignment_3_2 : ( ruleConstDeg ) ;
    public final void rule__FailReason__ConstDegAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3491:1: ( ( ruleConstDeg ) )
            // InternalAdeptness.g:3492:2: ( ruleConstDeg )
            {
            // InternalAdeptness.g:3492:2: ( ruleConstDeg )
            // InternalAdeptness.g:3493:3: ruleConstDeg
            {
             before(grammarAccess.getFailReasonAccess().getConstDegConstDegParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstDeg();

            state._fsp--;

             after(grammarAccess.getFailReasonAccess().getConstDegConstDegParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FailReason__ConstDegAssignment_3_2"


    // $ANTLR start "rule__FailReason__HigPeaksAssignment_3_3"
    // InternalAdeptness.g:3502:1: rule__FailReason__HigPeaksAssignment_3_3 : ( ruleHighPeaks ) ;
    public final void rule__FailReason__HigPeaksAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3506:1: ( ( ruleHighPeaks ) )
            // InternalAdeptness.g:3507:2: ( ruleHighPeaks )
            {
            // InternalAdeptness.g:3507:2: ( ruleHighPeaks )
            // InternalAdeptness.g:3508:3: ruleHighPeaks
            {
             before(grammarAccess.getFailReasonAccess().getHigPeaksHighPeaksParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleHighPeaks();

            state._fsp--;

             after(grammarAccess.getFailReasonAccess().getHigPeaksHighPeaksParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FailReason__HigPeaksAssignment_3_3"


    // $ANTLR start "rule__HighPeaks__CantAssignment_4"
    // InternalAdeptness.g:3517:1: rule__HighPeaks__CantAssignment_4 : ( ruleDOUBLE ) ;
    public final void rule__HighPeaks__CantAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3521:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:3522:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:3522:2: ( ruleDOUBLE )
            // InternalAdeptness.g:3523:3: ruleDOUBLE
            {
             before(grammarAccess.getHighPeaksAccess().getCantDOUBLEParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getHighPeaksAccess().getCantDOUBLEParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeaks__CantAssignment_4"


    // $ANTLR start "rule__HighPeaks__TimeAssignment_8"
    // InternalAdeptness.g:3532:1: rule__HighPeaks__TimeAssignment_8 : ( ruleDOUBLE ) ;
    public final void rule__HighPeaks__TimeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3536:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:3537:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:3537:2: ( ruleDOUBLE )
            // InternalAdeptness.g:3538:3: ruleDOUBLE
            {
             before(grammarAccess.getHighPeaksAccess().getTimeDOUBLEParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getHighPeaksAccess().getTimeDOUBLEParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeaks__TimeAssignment_8"


    // $ANTLR start "rule__ConstDeg__UpperAssignment_2_0"
    // InternalAdeptness.g:3547:1: rule__ConstDeg__UpperAssignment_2_0 : ( ruleUpper ) ;
    public final void rule__ConstDeg__UpperAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3551:1: ( ( ruleUpper ) )
            // InternalAdeptness.g:3552:2: ( ruleUpper )
            {
            // InternalAdeptness.g:3552:2: ( ruleUpper )
            // InternalAdeptness.g:3553:3: ruleUpper
            {
             before(grammarAccess.getConstDegAccess().getUpperUpperParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUpper();

            state._fsp--;

             after(grammarAccess.getConstDegAccess().getUpperUpperParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstDeg__UpperAssignment_2_0"


    // $ANTLR start "rule__ConstDeg__LowerAssignment_2_1"
    // InternalAdeptness.g:3562:1: rule__ConstDeg__LowerAssignment_2_1 : ( ruleLower ) ;
    public final void rule__ConstDeg__LowerAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3566:1: ( ( ruleLower ) )
            // InternalAdeptness.g:3567:2: ( ruleLower )
            {
            // InternalAdeptness.g:3567:2: ( ruleLower )
            // InternalAdeptness.g:3568:3: ruleLower
            {
             before(grammarAccess.getConstDegAccess().getLowerLowerParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLower();

            state._fsp--;

             after(grammarAccess.getConstDegAccess().getLowerLowerParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstDeg__LowerAssignment_2_1"


    // $ANTLR start "rule__HighTime__CantAssignment_2"
    // InternalAdeptness.g:3577:1: rule__HighTime__CantAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__HighTime__CantAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3581:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:3582:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:3582:2: ( ruleDOUBLE )
            // InternalAdeptness.g:3583:3: ruleDOUBLE
            {
             before(grammarAccess.getHighTimeAccess().getCantDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getHighTimeAccess().getCantDOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighTime__CantAssignment_2"


    // $ANTLR start "rule__HighTime__TimeAssignment_7"
    // InternalAdeptness.g:3592:1: rule__HighTime__TimeAssignment_7 : ( ruleDOUBLE ) ;
    public final void rule__HighTime__TimeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3596:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:3597:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:3597:2: ( ruleDOUBLE )
            // InternalAdeptness.g:3598:3: ruleDOUBLE
            {
             before(grammarAccess.getHighTimeAccess().getTimeDOUBLEParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getHighTimeAccess().getTimeDOUBLEParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighTime__TimeAssignment_7"


    // $ANTLR start "rule__HighPeak__CantAssignment_5"
    // InternalAdeptness.g:3607:1: rule__HighPeak__CantAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__HighPeak__CantAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3611:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:3612:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:3612:2: ( ruleDOUBLE )
            // InternalAdeptness.g:3613:3: ruleDOUBLE
            {
             before(grammarAccess.getHighPeakAccess().getCantDOUBLEParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getHighPeakAccess().getCantDOUBLEParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighPeak__CantAssignment_5"


    // $ANTLR start "rule__Reference__UpperAssignment_0_0"
    // InternalAdeptness.g:3622:1: rule__Reference__UpperAssignment_0_0 : ( ruleUpper ) ;
    public final void rule__Reference__UpperAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3626:1: ( ( ruleUpper ) )
            // InternalAdeptness.g:3627:2: ( ruleUpper )
            {
            // InternalAdeptness.g:3627:2: ( ruleUpper )
            // InternalAdeptness.g:3628:3: ruleUpper
            {
             before(grammarAccess.getReferenceAccess().getUpperUpperParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUpper();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getUpperUpperParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__UpperAssignment_0_0"


    // $ANTLR start "rule__Reference__LowerAssignment_0_1"
    // InternalAdeptness.g:3637:1: rule__Reference__LowerAssignment_0_1 : ( ruleLower ) ;
    public final void rule__Reference__LowerAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3641:1: ( ( ruleLower ) )
            // InternalAdeptness.g:3642:2: ( ruleLower )
            {
            // InternalAdeptness.g:3642:2: ( ruleLower )
            // InternalAdeptness.g:3643:3: ruleLower
            {
             before(grammarAccess.getReferenceAccess().getLowerLowerParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLower();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getLowerLowerParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__LowerAssignment_0_1"


    // $ANTLR start "rule__Reference__RangeAssignment_0_2"
    // InternalAdeptness.g:3652:1: rule__Reference__RangeAssignment_0_2 : ( ruleRange ) ;
    public final void rule__Reference__RangeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3656:1: ( ( ruleRange ) )
            // InternalAdeptness.g:3657:2: ( ruleRange )
            {
            // InternalAdeptness.g:3657:2: ( ruleRange )
            // InternalAdeptness.g:3658:3: ruleRange
            {
             before(grammarAccess.getReferenceAccess().getRangeRangeParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getRangeRangeParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__RangeAssignment_0_2"


    // $ANTLR start "rule__Reference__GapAssignment_0_3"
    // InternalAdeptness.g:3667:1: rule__Reference__GapAssignment_0_3 : ( ruleGap ) ;
    public final void rule__Reference__GapAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3671:1: ( ( ruleGap ) )
            // InternalAdeptness.g:3672:2: ( ruleGap )
            {
            // InternalAdeptness.g:3672:2: ( ruleGap )
            // InternalAdeptness.g:3673:3: ruleGap
            {
             before(grammarAccess.getReferenceAccess().getGapGapParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGap();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getGapGapParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__GapAssignment_0_3"


    // $ANTLR start "rule__Upper__Bound_uppAssignment_2"
    // InternalAdeptness.g:3682:1: rule__Upper__Bound_uppAssignment_2 : ( ruleBound_up ) ;
    public final void rule__Upper__Bound_uppAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3686:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:3687:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:3687:2: ( ruleBound_up )
            // InternalAdeptness.g:3688:3: ruleBound_up
            {
             before(grammarAccess.getUpperAccess().getBound_uppBound_upParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBound_up();

            state._fsp--;

             after(grammarAccess.getUpperAccess().getBound_uppBound_upParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Upper__Bound_uppAssignment_2"


    // $ANTLR start "rule__Lower__Bound_lowerAssignment_2"
    // InternalAdeptness.g:3697:1: rule__Lower__Bound_lowerAssignment_2 : ( ruleBound_Down ) ;
    public final void rule__Lower__Bound_lowerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3701:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:3702:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:3702:2: ( ruleBound_Down )
            // InternalAdeptness.g:3703:3: ruleBound_Down
            {
             before(grammarAccess.getLowerAccess().getBound_lowerBound_DownParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBound_Down();

            state._fsp--;

             after(grammarAccess.getLowerAccess().getBound_lowerBound_DownParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lower__Bound_lowerAssignment_2"


    // $ANTLR start "rule__Range__Bound_lowerAssignment_3"
    // InternalAdeptness.g:3712:1: rule__Range__Bound_lowerAssignment_3 : ( ruleBound_Down ) ;
    public final void rule__Range__Bound_lowerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3716:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:3717:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:3717:2: ( ruleBound_Down )
            // InternalAdeptness.g:3718:3: ruleBound_Down
            {
             before(grammarAccess.getRangeAccess().getBound_lowerBound_DownParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBound_Down();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getBound_lowerBound_DownParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Bound_lowerAssignment_3"


    // $ANTLR start "rule__Range__Bound_uppAssignment_5"
    // InternalAdeptness.g:3727:1: rule__Range__Bound_uppAssignment_5 : ( ruleBound_up ) ;
    public final void rule__Range__Bound_uppAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3731:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:3732:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:3732:2: ( ruleBound_up )
            // InternalAdeptness.g:3733:3: ruleBound_up
            {
             before(grammarAccess.getRangeAccess().getBound_uppBound_upParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBound_up();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getBound_uppBound_upParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Bound_uppAssignment_5"


    // $ANTLR start "rule__Gap__Bound_lowerAssignment_4"
    // InternalAdeptness.g:3742:1: rule__Gap__Bound_lowerAssignment_4 : ( ruleBound_Down ) ;
    public final void rule__Gap__Bound_lowerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3746:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:3747:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:3747:2: ( ruleBound_Down )
            // InternalAdeptness.g:3748:3: ruleBound_Down
            {
             before(grammarAccess.getGapAccess().getBound_lowerBound_DownParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBound_Down();

            state._fsp--;

             after(grammarAccess.getGapAccess().getBound_lowerBound_DownParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gap__Bound_lowerAssignment_4"


    // $ANTLR start "rule__Gap__Bound_uppAssignment_6"
    // InternalAdeptness.g:3757:1: rule__Gap__Bound_uppAssignment_6 : ( ruleBound_up ) ;
    public final void rule__Gap__Bound_uppAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3761:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:3762:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:3762:2: ( ruleBound_up )
            // InternalAdeptness.g:3763:3: ruleBound_up
            {
             before(grammarAccess.getGapAccess().getBound_uppBound_upParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleBound_up();

            state._fsp--;

             after(grammarAccess.getGapAccess().getBound_uppBound_upParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gap__Bound_uppAssignment_6"


    // $ANTLR start "rule__Bound_up__ValueAssignment"
    // InternalAdeptness.g:3772:1: rule__Bound_up__ValueAssignment : ( ruleDOUBLE ) ;
    public final void rule__Bound_up__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3776:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:3777:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:3777:2: ( ruleDOUBLE )
            // InternalAdeptness.g:3778:3: ruleDOUBLE
            {
             before(grammarAccess.getBound_upAccess().getValueDOUBLEParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getBound_upAccess().getValueDOUBLEParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_up__ValueAssignment"


    // $ANTLR start "rule__Bound_Down__ValueAssignment"
    // InternalAdeptness.g:3787:1: rule__Bound_Down__ValueAssignment : ( ruleDOUBLE ) ;
    public final void rule__Bound_Down__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3791:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:3792:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:3792:2: ( ruleDOUBLE )
            // InternalAdeptness.g:3793:3: ruleDOUBLE
            {
             before(grammarAccess.getBound_DownAccess().getValueDOUBLEParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getBound_DownAccess().getValueDOUBLEParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_Down__ValueAssignment"


    // $ANTLR start "rule__BOOLEAN__BoolAssignment"
    // InternalAdeptness.g:3802:1: rule__BOOLEAN__BoolAssignment : ( ruleb ) ;
    public final void rule__BOOLEAN__BoolAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3806:1: ( ( ruleb ) )
            // InternalAdeptness.g:3807:2: ( ruleb )
            {
            // InternalAdeptness.g:3807:2: ( ruleb )
            // InternalAdeptness.g:3808:3: ruleb
            {
             before(grammarAccess.getBOOLEANAccess().getBoolBParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleb();

            state._fsp--;

             after(grammarAccess.getBOOLEANAccess().getBoolBParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOLEAN__BoolAssignment"


    // $ANTLR start "rule__DOUBLE__DValAssignment"
    // InternalAdeptness.g:3817:1: rule__DOUBLE__DValAssignment : ( ruled ) ;
    public final void rule__DOUBLE__DValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3821:1: ( ( ruled ) )
            // InternalAdeptness.g:3822:2: ( ruled )
            {
            // InternalAdeptness.g:3822:2: ( ruled )
            // InternalAdeptness.g:3823:3: ruled
            {
             before(grammarAccess.getDOUBLEAccess().getDValDParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruled();

            state._fsp--;

             after(grammarAccess.getDOUBLEAccess().getDValDParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__DValAssignment"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalAdeptness.g:3832:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3836:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:3837:2: ( RULE_ID )
            {
            // InternalAdeptness.g:3837:2: ( RULE_ID )
            // InternalAdeptness.g:3838:3: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // InternalAdeptness.g:3847:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3851:1: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:3852:2: ( ruleQualifiedName )
            {
            // InternalAdeptness.g:3852:2: ( ruleQualifiedName )
            // InternalAdeptness.g:3853:3: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__PackageDeclaration__ElementsAssignment_3"
    // InternalAdeptness.g:3862:1: rule__PackageDeclaration__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3866:1: ( ( ruleAbstractElement ) )
            // InternalAdeptness.g:3867:2: ( ruleAbstractElement )
            {
            // InternalAdeptness.g:3867:2: ( ruleAbstractElement )
            // InternalAdeptness.g:3868:3: ruleAbstractElement
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__ElementsAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000180000012002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000023010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000886000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000580000012000L});

}