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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'import'", "'.*'", "'.'", "'CPS'", "':'", "'ENDCPS'", "'ORACLE'", "'ENDORACLE'", "'checks:'", "'Description: '", "'fails if :'", "';'", "'confidence is below'", "'more than'", "'times within'", "'confidence is in constant degradation'", "'within'", "'is below'", "'is above'", "'is in range between'", "'and'", "'not in range between'", "'-'", "'datatype'", "'package'", "'{'", "'}'", "'miliseconds'", "'seconds'", "'minutes'", "'hours'"
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

                if ( (LA1_0==13||LA1_0==16||(LA1_0>=36 && LA1_0<=37)) ) {
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


    // $ANTLR start "entryRuleChecks"
    // InternalAdeptness.g:253:1: entryRuleChecks : ruleChecks EOF ;
    public final void entryRuleChecks() throws RecognitionException {
        try {
            // InternalAdeptness.g:254:1: ( ruleChecks EOF )
            // InternalAdeptness.g:255:1: ruleChecks EOF
            {
             before(grammarAccess.getChecksRule()); 
            pushFollow(FOLLOW_1);
            ruleChecks();

            state._fsp--;

             after(grammarAccess.getChecksRule()); 
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
    // $ANTLR end "entryRuleChecks"


    // $ANTLR start "ruleChecks"
    // InternalAdeptness.g:262:1: ruleChecks : ( ( rule__Checks__Group__0 ) ) ;
    public final void ruleChecks() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:266:2: ( ( ( rule__Checks__Group__0 ) ) )
            // InternalAdeptness.g:267:2: ( ( rule__Checks__Group__0 ) )
            {
            // InternalAdeptness.g:267:2: ( ( rule__Checks__Group__0 ) )
            // InternalAdeptness.g:268:3: ( rule__Checks__Group__0 )
            {
             before(grammarAccess.getChecksAccess().getGroup()); 
            // InternalAdeptness.g:269:3: ( rule__Checks__Group__0 )
            // InternalAdeptness.g:269:4: rule__Checks__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Checks__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChecksAccess().getGroup()); 

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
    // $ANTLR end "ruleChecks"


    // $ANTLR start "entryRuleDescription"
    // InternalAdeptness.g:278:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalAdeptness.g:279:1: ( ruleDescription EOF )
            // InternalAdeptness.g:280:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalAdeptness.g:287:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:291:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalAdeptness.g:292:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalAdeptness.g:292:2: ( ( rule__Description__Group__0 ) )
            // InternalAdeptness.g:293:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalAdeptness.g:294:3: ( rule__Description__Group__0 )
            // InternalAdeptness.g:294:4: rule__Description__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup()); 

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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleFailReason"
    // InternalAdeptness.g:303:1: entryRuleFailReason : ruleFailReason EOF ;
    public final void entryRuleFailReason() throws RecognitionException {
        try {
            // InternalAdeptness.g:304:1: ( ruleFailReason EOF )
            // InternalAdeptness.g:305:1: ruleFailReason EOF
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
    // InternalAdeptness.g:312:1: ruleFailReason : ( ( rule__FailReason__Group__0 ) ) ;
    public final void ruleFailReason() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:316:2: ( ( ( rule__FailReason__Group__0 ) ) )
            // InternalAdeptness.g:317:2: ( ( rule__FailReason__Group__0 ) )
            {
            // InternalAdeptness.g:317:2: ( ( rule__FailReason__Group__0 ) )
            // InternalAdeptness.g:318:3: ( rule__FailReason__Group__0 )
            {
             before(grammarAccess.getFailReasonAccess().getGroup()); 
            // InternalAdeptness.g:319:3: ( rule__FailReason__Group__0 )
            // InternalAdeptness.g:319:4: rule__FailReason__Group__0
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


    // $ANTLR start "entryRuleReason"
    // InternalAdeptness.g:328:1: entryRuleReason : ruleReason EOF ;
    public final void entryRuleReason() throws RecognitionException {
        try {
            // InternalAdeptness.g:329:1: ( ruleReason EOF )
            // InternalAdeptness.g:330:1: ruleReason EOF
            {
             before(grammarAccess.getReasonRule()); 
            pushFollow(FOLLOW_1);
            ruleReason();

            state._fsp--;

             after(grammarAccess.getReasonRule()); 
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
    // $ANTLR end "entryRuleReason"


    // $ANTLR start "ruleReason"
    // InternalAdeptness.g:337:1: ruleReason : ( ( rule__Reason__Group__0 ) ) ;
    public final void ruleReason() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:341:2: ( ( ( rule__Reason__Group__0 ) ) )
            // InternalAdeptness.g:342:2: ( ( rule__Reason__Group__0 ) )
            {
            // InternalAdeptness.g:342:2: ( ( rule__Reason__Group__0 ) )
            // InternalAdeptness.g:343:3: ( rule__Reason__Group__0 )
            {
             before(grammarAccess.getReasonAccess().getGroup()); 
            // InternalAdeptness.g:344:3: ( rule__Reason__Group__0 )
            // InternalAdeptness.g:344:4: rule__Reason__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reason__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReasonAccess().getGroup()); 

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
    // $ANTLR end "ruleReason"


    // $ANTLR start "entryRuleXPeaks"
    // InternalAdeptness.g:353:1: entryRuleXPeaks : ruleXPeaks EOF ;
    public final void entryRuleXPeaks() throws RecognitionException {
        try {
            // InternalAdeptness.g:354:1: ( ruleXPeaks EOF )
            // InternalAdeptness.g:355:1: ruleXPeaks EOF
            {
             before(grammarAccess.getXPeaksRule()); 
            pushFollow(FOLLOW_1);
            ruleXPeaks();

            state._fsp--;

             after(grammarAccess.getXPeaksRule()); 
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
    // $ANTLR end "entryRuleXPeaks"


    // $ANTLR start "ruleXPeaks"
    // InternalAdeptness.g:362:1: ruleXPeaks : ( ( rule__XPeaks__Group__0 ) ) ;
    public final void ruleXPeaks() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:366:2: ( ( ( rule__XPeaks__Group__0 ) ) )
            // InternalAdeptness.g:367:2: ( ( rule__XPeaks__Group__0 ) )
            {
            // InternalAdeptness.g:367:2: ( ( rule__XPeaks__Group__0 ) )
            // InternalAdeptness.g:368:3: ( rule__XPeaks__Group__0 )
            {
             before(grammarAccess.getXPeaksAccess().getGroup()); 
            // InternalAdeptness.g:369:3: ( rule__XPeaks__Group__0 )
            // InternalAdeptness.g:369:4: rule__XPeaks__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XPeaks__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXPeaksAccess().getGroup()); 

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
    // $ANTLR end "ruleXPeaks"


    // $ANTLR start "entryRuleConstDeg"
    // InternalAdeptness.g:378:1: entryRuleConstDeg : ruleConstDeg EOF ;
    public final void entryRuleConstDeg() throws RecognitionException {
        try {
            // InternalAdeptness.g:379:1: ( ruleConstDeg EOF )
            // InternalAdeptness.g:380:1: ruleConstDeg EOF
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
    // InternalAdeptness.g:387:1: ruleConstDeg : ( ( rule__ConstDeg__Group__0 ) ) ;
    public final void ruleConstDeg() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:391:2: ( ( ( rule__ConstDeg__Group__0 ) ) )
            // InternalAdeptness.g:392:2: ( ( rule__ConstDeg__Group__0 ) )
            {
            // InternalAdeptness.g:392:2: ( ( rule__ConstDeg__Group__0 ) )
            // InternalAdeptness.g:393:3: ( rule__ConstDeg__Group__0 )
            {
             before(grammarAccess.getConstDegAccess().getGroup()); 
            // InternalAdeptness.g:394:3: ( rule__ConstDeg__Group__0 )
            // InternalAdeptness.g:394:4: rule__ConstDeg__Group__0
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
    // InternalAdeptness.g:403:1: entryRuleHighTime : ruleHighTime EOF ;
    public final void entryRuleHighTime() throws RecognitionException {
        try {
            // InternalAdeptness.g:404:1: ( ruleHighTime EOF )
            // InternalAdeptness.g:405:1: ruleHighTime EOF
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
    // InternalAdeptness.g:412:1: ruleHighTime : ( ( rule__HighTime__Group__0 ) ) ;
    public final void ruleHighTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:416:2: ( ( ( rule__HighTime__Group__0 ) ) )
            // InternalAdeptness.g:417:2: ( ( rule__HighTime__Group__0 ) )
            {
            // InternalAdeptness.g:417:2: ( ( rule__HighTime__Group__0 ) )
            // InternalAdeptness.g:418:3: ( rule__HighTime__Group__0 )
            {
             before(grammarAccess.getHighTimeAccess().getGroup()); 
            // InternalAdeptness.g:419:3: ( rule__HighTime__Group__0 )
            // InternalAdeptness.g:419:4: rule__HighTime__Group__0
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
    // InternalAdeptness.g:428:1: entryRuleHighPeak : ruleHighPeak EOF ;
    public final void entryRuleHighPeak() throws RecognitionException {
        try {
            // InternalAdeptness.g:429:1: ( ruleHighPeak EOF )
            // InternalAdeptness.g:430:1: ruleHighPeak EOF
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
    // InternalAdeptness.g:437:1: ruleHighPeak : ( ( rule__HighPeak__Group__0 ) ) ;
    public final void ruleHighPeak() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:441:2: ( ( ( rule__HighPeak__Group__0 ) ) )
            // InternalAdeptness.g:442:2: ( ( rule__HighPeak__Group__0 ) )
            {
            // InternalAdeptness.g:442:2: ( ( rule__HighPeak__Group__0 ) )
            // InternalAdeptness.g:443:3: ( rule__HighPeak__Group__0 )
            {
             before(grammarAccess.getHighPeakAccess().getGroup()); 
            // InternalAdeptness.g:444:3: ( rule__HighPeak__Group__0 )
            // InternalAdeptness.g:444:4: rule__HighPeak__Group__0
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
    // InternalAdeptness.g:453:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalAdeptness.g:454:1: ( ruleReference EOF )
            // InternalAdeptness.g:455:1: ruleReference EOF
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
    // InternalAdeptness.g:462:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:466:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalAdeptness.g:467:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalAdeptness.g:467:2: ( ( rule__Reference__Group__0 ) )
            // InternalAdeptness.g:468:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalAdeptness.g:469:3: ( rule__Reference__Group__0 )
            // InternalAdeptness.g:469:4: rule__Reference__Group__0
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
    // InternalAdeptness.g:478:1: entryRuleUpper : ruleUpper EOF ;
    public final void entryRuleUpper() throws RecognitionException {
        try {
            // InternalAdeptness.g:479:1: ( ruleUpper EOF )
            // InternalAdeptness.g:480:1: ruleUpper EOF
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
    // InternalAdeptness.g:487:1: ruleUpper : ( ( rule__Upper__Group__0 ) ) ;
    public final void ruleUpper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:491:2: ( ( ( rule__Upper__Group__0 ) ) )
            // InternalAdeptness.g:492:2: ( ( rule__Upper__Group__0 ) )
            {
            // InternalAdeptness.g:492:2: ( ( rule__Upper__Group__0 ) )
            // InternalAdeptness.g:493:3: ( rule__Upper__Group__0 )
            {
             before(grammarAccess.getUpperAccess().getGroup()); 
            // InternalAdeptness.g:494:3: ( rule__Upper__Group__0 )
            // InternalAdeptness.g:494:4: rule__Upper__Group__0
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
    // InternalAdeptness.g:503:1: entryRuleLower : ruleLower EOF ;
    public final void entryRuleLower() throws RecognitionException {
        try {
            // InternalAdeptness.g:504:1: ( ruleLower EOF )
            // InternalAdeptness.g:505:1: ruleLower EOF
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
    // InternalAdeptness.g:512:1: ruleLower : ( ( rule__Lower__Group__0 ) ) ;
    public final void ruleLower() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:516:2: ( ( ( rule__Lower__Group__0 ) ) )
            // InternalAdeptness.g:517:2: ( ( rule__Lower__Group__0 ) )
            {
            // InternalAdeptness.g:517:2: ( ( rule__Lower__Group__0 ) )
            // InternalAdeptness.g:518:3: ( rule__Lower__Group__0 )
            {
             before(grammarAccess.getLowerAccess().getGroup()); 
            // InternalAdeptness.g:519:3: ( rule__Lower__Group__0 )
            // InternalAdeptness.g:519:4: rule__Lower__Group__0
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
    // InternalAdeptness.g:528:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // InternalAdeptness.g:529:1: ( ruleRange EOF )
            // InternalAdeptness.g:530:1: ruleRange EOF
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
    // InternalAdeptness.g:537:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:541:2: ( ( ( rule__Range__Group__0 ) ) )
            // InternalAdeptness.g:542:2: ( ( rule__Range__Group__0 ) )
            {
            // InternalAdeptness.g:542:2: ( ( rule__Range__Group__0 ) )
            // InternalAdeptness.g:543:3: ( rule__Range__Group__0 )
            {
             before(grammarAccess.getRangeAccess().getGroup()); 
            // InternalAdeptness.g:544:3: ( rule__Range__Group__0 )
            // InternalAdeptness.g:544:4: rule__Range__Group__0
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
    // InternalAdeptness.g:553:1: entryRuleGap : ruleGap EOF ;
    public final void entryRuleGap() throws RecognitionException {
        try {
            // InternalAdeptness.g:554:1: ( ruleGap EOF )
            // InternalAdeptness.g:555:1: ruleGap EOF
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
    // InternalAdeptness.g:562:1: ruleGap : ( ( rule__Gap__Group__0 ) ) ;
    public final void ruleGap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:566:2: ( ( ( rule__Gap__Group__0 ) ) )
            // InternalAdeptness.g:567:2: ( ( rule__Gap__Group__0 ) )
            {
            // InternalAdeptness.g:567:2: ( ( rule__Gap__Group__0 ) )
            // InternalAdeptness.g:568:3: ( rule__Gap__Group__0 )
            {
             before(grammarAccess.getGapAccess().getGroup()); 
            // InternalAdeptness.g:569:3: ( rule__Gap__Group__0 )
            // InternalAdeptness.g:569:4: rule__Gap__Group__0
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
    // InternalAdeptness.g:578:1: entryRuleBound_up : ruleBound_up EOF ;
    public final void entryRuleBound_up() throws RecognitionException {
        try {
            // InternalAdeptness.g:579:1: ( ruleBound_up EOF )
            // InternalAdeptness.g:580:1: ruleBound_up EOF
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
    // InternalAdeptness.g:587:1: ruleBound_up : ( ( rule__Bound_up__ValueAssignment ) ) ;
    public final void ruleBound_up() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:591:2: ( ( ( rule__Bound_up__ValueAssignment ) ) )
            // InternalAdeptness.g:592:2: ( ( rule__Bound_up__ValueAssignment ) )
            {
            // InternalAdeptness.g:592:2: ( ( rule__Bound_up__ValueAssignment ) )
            // InternalAdeptness.g:593:3: ( rule__Bound_up__ValueAssignment )
            {
             before(grammarAccess.getBound_upAccess().getValueAssignment()); 
            // InternalAdeptness.g:594:3: ( rule__Bound_up__ValueAssignment )
            // InternalAdeptness.g:594:4: rule__Bound_up__ValueAssignment
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
    // InternalAdeptness.g:603:1: entryRuleBound_Down : ruleBound_Down EOF ;
    public final void entryRuleBound_Down() throws RecognitionException {
        try {
            // InternalAdeptness.g:604:1: ( ruleBound_Down EOF )
            // InternalAdeptness.g:605:1: ruleBound_Down EOF
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
    // InternalAdeptness.g:612:1: ruleBound_Down : ( ( rule__Bound_Down__ValueAssignment ) ) ;
    public final void ruleBound_Down() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:616:2: ( ( ( rule__Bound_Down__ValueAssignment ) ) )
            // InternalAdeptness.g:617:2: ( ( rule__Bound_Down__ValueAssignment ) )
            {
            // InternalAdeptness.g:617:2: ( ( rule__Bound_Down__ValueAssignment ) )
            // InternalAdeptness.g:618:3: ( rule__Bound_Down__ValueAssignment )
            {
             before(grammarAccess.getBound_DownAccess().getValueAssignment()); 
            // InternalAdeptness.g:619:3: ( rule__Bound_Down__ValueAssignment )
            // InternalAdeptness.g:619:4: rule__Bound_Down__ValueAssignment
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
    // InternalAdeptness.g:628:1: entryRuleBOOLEAN : ruleBOOLEAN EOF ;
    public final void entryRuleBOOLEAN() throws RecognitionException {
        try {
            // InternalAdeptness.g:629:1: ( ruleBOOLEAN EOF )
            // InternalAdeptness.g:630:1: ruleBOOLEAN EOF
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
    // InternalAdeptness.g:637:1: ruleBOOLEAN : ( ( rule__BOOLEAN__BoolAssignment ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:641:2: ( ( ( rule__BOOLEAN__BoolAssignment ) ) )
            // InternalAdeptness.g:642:2: ( ( rule__BOOLEAN__BoolAssignment ) )
            {
            // InternalAdeptness.g:642:2: ( ( rule__BOOLEAN__BoolAssignment ) )
            // InternalAdeptness.g:643:3: ( rule__BOOLEAN__BoolAssignment )
            {
             before(grammarAccess.getBOOLEANAccess().getBoolAssignment()); 
            // InternalAdeptness.g:644:3: ( rule__BOOLEAN__BoolAssignment )
            // InternalAdeptness.g:644:4: rule__BOOLEAN__BoolAssignment
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
    // InternalAdeptness.g:653:1: entryRuleb : ruleb EOF ;
    public final void entryRuleb() throws RecognitionException {
        try {
            // InternalAdeptness.g:654:1: ( ruleb EOF )
            // InternalAdeptness.g:655:1: ruleb EOF
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
    // InternalAdeptness.g:662:1: ruleb : ( ( rule__B__Alternatives ) ) ;
    public final void ruleb() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:666:2: ( ( ( rule__B__Alternatives ) ) )
            // InternalAdeptness.g:667:2: ( ( rule__B__Alternatives ) )
            {
            // InternalAdeptness.g:667:2: ( ( rule__B__Alternatives ) )
            // InternalAdeptness.g:668:3: ( rule__B__Alternatives )
            {
             before(grammarAccess.getBAccess().getAlternatives()); 
            // InternalAdeptness.g:669:3: ( rule__B__Alternatives )
            // InternalAdeptness.g:669:4: rule__B__Alternatives
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
    // InternalAdeptness.g:678:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalAdeptness.g:679:1: ( ruleDOUBLE EOF )
            // InternalAdeptness.g:680:1: ruleDOUBLE EOF
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
    // InternalAdeptness.g:687:1: ruleDOUBLE : ( ( rule__DOUBLE__DValAssignment ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:691:2: ( ( ( rule__DOUBLE__DValAssignment ) ) )
            // InternalAdeptness.g:692:2: ( ( rule__DOUBLE__DValAssignment ) )
            {
            // InternalAdeptness.g:692:2: ( ( rule__DOUBLE__DValAssignment ) )
            // InternalAdeptness.g:693:3: ( rule__DOUBLE__DValAssignment )
            {
             before(grammarAccess.getDOUBLEAccess().getDValAssignment()); 
            // InternalAdeptness.g:694:3: ( rule__DOUBLE__DValAssignment )
            // InternalAdeptness.g:694:4: rule__DOUBLE__DValAssignment
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
    // InternalAdeptness.g:703:1: entryRuled : ruled EOF ;
    public final void entryRuled() throws RecognitionException {
        try {
            // InternalAdeptness.g:704:1: ( ruled EOF )
            // InternalAdeptness.g:705:1: ruled EOF
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
    // InternalAdeptness.g:712:1: ruled : ( ( rule__D__Group__0 ) ) ;
    public final void ruled() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:716:2: ( ( ( rule__D__Group__0 ) ) )
            // InternalAdeptness.g:717:2: ( ( rule__D__Group__0 ) )
            {
            // InternalAdeptness.g:717:2: ( ( rule__D__Group__0 ) )
            // InternalAdeptness.g:718:3: ( rule__D__Group__0 )
            {
             before(grammarAccess.getDAccess().getGroup()); 
            // InternalAdeptness.g:719:3: ( rule__D__Group__0 )
            // InternalAdeptness.g:719:4: rule__D__Group__0
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


    // $ANTLR start "entryRuleTimeType"
    // InternalAdeptness.g:728:1: entryRuleTimeType : ruleTimeType EOF ;
    public final void entryRuleTimeType() throws RecognitionException {
        try {
            // InternalAdeptness.g:729:1: ( ruleTimeType EOF )
            // InternalAdeptness.g:730:1: ruleTimeType EOF
            {
             before(grammarAccess.getTimeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeType();

            state._fsp--;

             after(grammarAccess.getTimeTypeRule()); 
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
    // $ANTLR end "entryRuleTimeType"


    // $ANTLR start "ruleTimeType"
    // InternalAdeptness.g:737:1: ruleTimeType : ( ( rule__TimeType__Alternatives ) ) ;
    public final void ruleTimeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:741:2: ( ( ( rule__TimeType__Alternatives ) ) )
            // InternalAdeptness.g:742:2: ( ( rule__TimeType__Alternatives ) )
            {
            // InternalAdeptness.g:742:2: ( ( rule__TimeType__Alternatives ) )
            // InternalAdeptness.g:743:3: ( rule__TimeType__Alternatives )
            {
             before(grammarAccess.getTimeTypeAccess().getAlternatives()); 
            // InternalAdeptness.g:744:3: ( rule__TimeType__Alternatives )
            // InternalAdeptness.g:744:4: rule__TimeType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTimeType"


    // $ANTLR start "entryRuleDataType"
    // InternalAdeptness.g:753:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalAdeptness.g:754:1: ( ruleDataType EOF )
            // InternalAdeptness.g:755:1: ruleDataType EOF
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
    // InternalAdeptness.g:762:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:766:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalAdeptness.g:767:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalAdeptness.g:767:2: ( ( rule__DataType__Group__0 ) )
            // InternalAdeptness.g:768:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalAdeptness.g:769:3: ( rule__DataType__Group__0 )
            // InternalAdeptness.g:769:4: rule__DataType__Group__0
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
    // InternalAdeptness.g:778:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // InternalAdeptness.g:779:1: ( rulePackageDeclaration EOF )
            // InternalAdeptness.g:780:1: rulePackageDeclaration EOF
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
    // InternalAdeptness.g:787:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:791:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // InternalAdeptness.g:792:2: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // InternalAdeptness.g:792:2: ( ( rule__PackageDeclaration__Group__0 ) )
            // InternalAdeptness.g:793:3: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // InternalAdeptness.g:794:3: ( rule__PackageDeclaration__Group__0 )
            // InternalAdeptness.g:794:4: rule__PackageDeclaration__Group__0
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
    // InternalAdeptness.g:802:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:806:1: ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt2=1;
                }
                break;
            case 16:
            case 36:
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
                    // InternalAdeptness.g:807:2: ( rulePackageDeclaration )
                    {
                    // InternalAdeptness.g:807:2: ( rulePackageDeclaration )
                    // InternalAdeptness.g:808:3: rulePackageDeclaration
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
                    // InternalAdeptness.g:813:2: ( ruleType )
                    {
                    // InternalAdeptness.g:813:2: ( ruleType )
                    // InternalAdeptness.g:814:3: ruleType
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
                    // InternalAdeptness.g:819:2: ( ruleImport )
                    {
                    // InternalAdeptness.g:819:2: ( ruleImport )
                    // InternalAdeptness.g:820:3: ruleImport
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
    // InternalAdeptness.g:829:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleSignal ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:833:1: ( ( ruleDataType ) | ( ruleSignal ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==36) ) {
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
                    // InternalAdeptness.g:834:2: ( ruleDataType )
                    {
                    // InternalAdeptness.g:834:2: ( ruleDataType )
                    // InternalAdeptness.g:835:3: ruleDataType
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
                    // InternalAdeptness.g:840:2: ( ruleSignal )
                    {
                    // InternalAdeptness.g:840:2: ( ruleSignal )
                    // InternalAdeptness.g:841:3: ruleSignal
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


    // $ANTLR start "rule__Reason__Alternatives_0"
    // InternalAdeptness.g:850:1: rule__Reason__Alternatives_0 : ( ( ( rule__Reason__HighPeakAssignment_0_0 ) ) | ( ( rule__Reason__HighTimeAssignment_0_1 ) ) | ( ( rule__Reason__ConstDegAssignment_0_2 ) ) | ( ( rule__Reason__XPeaksAssignment_0_3 ) ) );
    public final void rule__Reason__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:854:1: ( ( ( rule__Reason__HighPeakAssignment_0_0 ) ) | ( ( rule__Reason__HighTimeAssignment_0_1 ) ) | ( ( rule__Reason__ConstDegAssignment_0_2 ) ) | ( ( rule__Reason__XPeaksAssignment_0_3 ) ) )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalAdeptness.g:855:2: ( ( rule__Reason__HighPeakAssignment_0_0 ) )
                    {
                    // InternalAdeptness.g:855:2: ( ( rule__Reason__HighPeakAssignment_0_0 ) )
                    // InternalAdeptness.g:856:3: ( rule__Reason__HighPeakAssignment_0_0 )
                    {
                     before(grammarAccess.getReasonAccess().getHighPeakAssignment_0_0()); 
                    // InternalAdeptness.g:857:3: ( rule__Reason__HighPeakAssignment_0_0 )
                    // InternalAdeptness.g:857:4: rule__Reason__HighPeakAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reason__HighPeakAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReasonAccess().getHighPeakAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:861:2: ( ( rule__Reason__HighTimeAssignment_0_1 ) )
                    {
                    // InternalAdeptness.g:861:2: ( ( rule__Reason__HighTimeAssignment_0_1 ) )
                    // InternalAdeptness.g:862:3: ( rule__Reason__HighTimeAssignment_0_1 )
                    {
                     before(grammarAccess.getReasonAccess().getHighTimeAssignment_0_1()); 
                    // InternalAdeptness.g:863:3: ( rule__Reason__HighTimeAssignment_0_1 )
                    // InternalAdeptness.g:863:4: rule__Reason__HighTimeAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reason__HighTimeAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getReasonAccess().getHighTimeAssignment_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:867:2: ( ( rule__Reason__ConstDegAssignment_0_2 ) )
                    {
                    // InternalAdeptness.g:867:2: ( ( rule__Reason__ConstDegAssignment_0_2 ) )
                    // InternalAdeptness.g:868:3: ( rule__Reason__ConstDegAssignment_0_2 )
                    {
                     before(grammarAccess.getReasonAccess().getConstDegAssignment_0_2()); 
                    // InternalAdeptness.g:869:3: ( rule__Reason__ConstDegAssignment_0_2 )
                    // InternalAdeptness.g:869:4: rule__Reason__ConstDegAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reason__ConstDegAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getReasonAccess().getConstDegAssignment_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:873:2: ( ( rule__Reason__XPeaksAssignment_0_3 ) )
                    {
                    // InternalAdeptness.g:873:2: ( ( rule__Reason__XPeaksAssignment_0_3 ) )
                    // InternalAdeptness.g:874:3: ( rule__Reason__XPeaksAssignment_0_3 )
                    {
                     before(grammarAccess.getReasonAccess().getXPeaksAssignment_0_3()); 
                    // InternalAdeptness.g:875:3: ( rule__Reason__XPeaksAssignment_0_3 )
                    // InternalAdeptness.g:875:4: rule__Reason__XPeaksAssignment_0_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reason__XPeaksAssignment_0_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getReasonAccess().getXPeaksAssignment_0_3()); 

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
    // $ANTLR end "rule__Reason__Alternatives_0"


    // $ANTLR start "rule__Reference__Alternatives_0"
    // InternalAdeptness.g:883:1: rule__Reference__Alternatives_0 : ( ( ( rule__Reference__UpperAssignment_0_0 ) ) | ( ( rule__Reference__LowerAssignment_0_1 ) ) | ( ( rule__Reference__RangeAssignment_0_2 ) ) | ( ( rule__Reference__GapAssignment_0_3 ) ) );
    public final void rule__Reference__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:887:1: ( ( ( rule__Reference__UpperAssignment_0_0 ) ) | ( ( rule__Reference__LowerAssignment_0_1 ) ) | ( ( rule__Reference__RangeAssignment_0_2 ) ) | ( ( rule__Reference__GapAssignment_0_3 ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt5=1;
                }
                break;
            case 31:
                {
                alt5=2;
                }
                break;
            case 32:
                {
                alt5=3;
                }
                break;
            case 34:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalAdeptness.g:888:2: ( ( rule__Reference__UpperAssignment_0_0 ) )
                    {
                    // InternalAdeptness.g:888:2: ( ( rule__Reference__UpperAssignment_0_0 ) )
                    // InternalAdeptness.g:889:3: ( rule__Reference__UpperAssignment_0_0 )
                    {
                     before(grammarAccess.getReferenceAccess().getUpperAssignment_0_0()); 
                    // InternalAdeptness.g:890:3: ( rule__Reference__UpperAssignment_0_0 )
                    // InternalAdeptness.g:890:4: rule__Reference__UpperAssignment_0_0
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
                    // InternalAdeptness.g:894:2: ( ( rule__Reference__LowerAssignment_0_1 ) )
                    {
                    // InternalAdeptness.g:894:2: ( ( rule__Reference__LowerAssignment_0_1 ) )
                    // InternalAdeptness.g:895:3: ( rule__Reference__LowerAssignment_0_1 )
                    {
                     before(grammarAccess.getReferenceAccess().getLowerAssignment_0_1()); 
                    // InternalAdeptness.g:896:3: ( rule__Reference__LowerAssignment_0_1 )
                    // InternalAdeptness.g:896:4: rule__Reference__LowerAssignment_0_1
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
                    // InternalAdeptness.g:900:2: ( ( rule__Reference__RangeAssignment_0_2 ) )
                    {
                    // InternalAdeptness.g:900:2: ( ( rule__Reference__RangeAssignment_0_2 ) )
                    // InternalAdeptness.g:901:3: ( rule__Reference__RangeAssignment_0_2 )
                    {
                     before(grammarAccess.getReferenceAccess().getRangeAssignment_0_2()); 
                    // InternalAdeptness.g:902:3: ( rule__Reference__RangeAssignment_0_2 )
                    // InternalAdeptness.g:902:4: rule__Reference__RangeAssignment_0_2
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
                    // InternalAdeptness.g:906:2: ( ( rule__Reference__GapAssignment_0_3 ) )
                    {
                    // InternalAdeptness.g:906:2: ( ( rule__Reference__GapAssignment_0_3 ) )
                    // InternalAdeptness.g:907:3: ( rule__Reference__GapAssignment_0_3 )
                    {
                     before(grammarAccess.getReferenceAccess().getGapAssignment_0_3()); 
                    // InternalAdeptness.g:908:3: ( rule__Reference__GapAssignment_0_3 )
                    // InternalAdeptness.g:908:4: rule__Reference__GapAssignment_0_3
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
    // InternalAdeptness.g:916:1: rule__B__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__B__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:920:1: ( ( 'true' ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAdeptness.g:921:2: ( 'true' )
                    {
                    // InternalAdeptness.g:921:2: ( 'true' )
                    // InternalAdeptness.g:922:3: 'true'
                    {
                     before(grammarAccess.getBAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:927:2: ( 'false' )
                    {
                    // InternalAdeptness.g:927:2: ( 'false' )
                    // InternalAdeptness.g:928:3: 'false'
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


    // $ANTLR start "rule__TimeType__Alternatives"
    // InternalAdeptness.g:937:1: rule__TimeType__Alternatives : ( ( ( rule__TimeType__TimeAssignment_0 ) ) | ( ( rule__TimeType__TimeAssignment_1 ) ) | ( ( rule__TimeType__TimeAssignment_2 ) ) | ( ( rule__TimeType__TimeAssignment_3 ) ) );
    public final void rule__TimeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:941:1: ( ( ( rule__TimeType__TimeAssignment_0 ) ) | ( ( rule__TimeType__TimeAssignment_1 ) ) | ( ( rule__TimeType__TimeAssignment_2 ) ) | ( ( rule__TimeType__TimeAssignment_3 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt7=1;
                }
                break;
            case 41:
                {
                alt7=2;
                }
                break;
            case 42:
                {
                alt7=3;
                }
                break;
            case 43:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalAdeptness.g:942:2: ( ( rule__TimeType__TimeAssignment_0 ) )
                    {
                    // InternalAdeptness.g:942:2: ( ( rule__TimeType__TimeAssignment_0 ) )
                    // InternalAdeptness.g:943:3: ( rule__TimeType__TimeAssignment_0 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_0()); 
                    // InternalAdeptness.g:944:3: ( rule__TimeType__TimeAssignment_0 )
                    // InternalAdeptness.g:944:4: rule__TimeType__TimeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TimeType__TimeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimeTypeAccess().getTimeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:948:2: ( ( rule__TimeType__TimeAssignment_1 ) )
                    {
                    // InternalAdeptness.g:948:2: ( ( rule__TimeType__TimeAssignment_1 ) )
                    // InternalAdeptness.g:949:3: ( rule__TimeType__TimeAssignment_1 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_1()); 
                    // InternalAdeptness.g:950:3: ( rule__TimeType__TimeAssignment_1 )
                    // InternalAdeptness.g:950:4: rule__TimeType__TimeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TimeType__TimeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimeTypeAccess().getTimeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:954:2: ( ( rule__TimeType__TimeAssignment_2 ) )
                    {
                    // InternalAdeptness.g:954:2: ( ( rule__TimeType__TimeAssignment_2 ) )
                    // InternalAdeptness.g:955:3: ( rule__TimeType__TimeAssignment_2 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_2()); 
                    // InternalAdeptness.g:956:3: ( rule__TimeType__TimeAssignment_2 )
                    // InternalAdeptness.g:956:4: rule__TimeType__TimeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TimeType__TimeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimeTypeAccess().getTimeAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:960:2: ( ( rule__TimeType__TimeAssignment_3 ) )
                    {
                    // InternalAdeptness.g:960:2: ( ( rule__TimeType__TimeAssignment_3 ) )
                    // InternalAdeptness.g:961:3: ( rule__TimeType__TimeAssignment_3 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_3()); 
                    // InternalAdeptness.g:962:3: ( rule__TimeType__TimeAssignment_3 )
                    // InternalAdeptness.g:962:4: rule__TimeType__TimeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__TimeType__TimeAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimeTypeAccess().getTimeAssignment_3()); 

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
    // $ANTLR end "rule__TimeType__Alternatives"


    // $ANTLR start "rule__Import__Group__0"
    // InternalAdeptness.g:970:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:974:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalAdeptness.g:975:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalAdeptness.g:982:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:986:1: ( ( 'import' ) )
            // InternalAdeptness.g:987:1: ( 'import' )
            {
            // InternalAdeptness.g:987:1: ( 'import' )
            // InternalAdeptness.g:988:2: 'import'
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
    // InternalAdeptness.g:997:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1001:1: ( rule__Import__Group__1__Impl )
            // InternalAdeptness.g:1002:2: rule__Import__Group__1__Impl
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
    // InternalAdeptness.g:1008:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1012:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalAdeptness.g:1013:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalAdeptness.g:1013:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalAdeptness.g:1014:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalAdeptness.g:1015:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalAdeptness.g:1015:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalAdeptness.g:1024:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1028:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalAdeptness.g:1029:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalAdeptness.g:1036:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1040:1: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:1041:1: ( ruleQualifiedName )
            {
            // InternalAdeptness.g:1041:1: ( ruleQualifiedName )
            // InternalAdeptness.g:1042:2: ruleQualifiedName
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
    // InternalAdeptness.g:1051:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1055:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalAdeptness.g:1056:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalAdeptness.g:1062:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1066:1: ( ( ( '.*' )? ) )
            // InternalAdeptness.g:1067:1: ( ( '.*' )? )
            {
            // InternalAdeptness.g:1067:1: ( ( '.*' )? )
            // InternalAdeptness.g:1068:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalAdeptness.g:1069:2: ( '.*' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAdeptness.g:1069:3: '.*'
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
    // InternalAdeptness.g:1078:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1082:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAdeptness.g:1083:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalAdeptness.g:1090:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1094:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:1095:1: ( RULE_ID )
            {
            // InternalAdeptness.g:1095:1: ( RULE_ID )
            // InternalAdeptness.g:1096:2: RULE_ID
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
    // InternalAdeptness.g:1105:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1109:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAdeptness.g:1110:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAdeptness.g:1116:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1120:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAdeptness.g:1121:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAdeptness.g:1121:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAdeptness.g:1122:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAdeptness.g:1123:2: ( rule__QualifiedName__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAdeptness.g:1123:3: rule__QualifiedName__Group_1__0
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
    // InternalAdeptness.g:1132:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1136:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAdeptness.g:1137:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalAdeptness.g:1144:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1148:1: ( ( '.' ) )
            // InternalAdeptness.g:1149:1: ( '.' )
            {
            // InternalAdeptness.g:1149:1: ( '.' )
            // InternalAdeptness.g:1150:2: '.'
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
    // InternalAdeptness.g:1159:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1163:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAdeptness.g:1164:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAdeptness.g:1170:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1174:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:1175:1: ( RULE_ID )
            {
            // InternalAdeptness.g:1175:1: ( RULE_ID )
            // InternalAdeptness.g:1176:2: RULE_ID
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
    // InternalAdeptness.g:1186:1: rule__Signal__Group__0 : rule__Signal__Group__0__Impl rule__Signal__Group__1 ;
    public final void rule__Signal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1190:1: ( rule__Signal__Group__0__Impl rule__Signal__Group__1 )
            // InternalAdeptness.g:1191:2: rule__Signal__Group__0__Impl rule__Signal__Group__1
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
    // InternalAdeptness.g:1198:1: rule__Signal__Group__0__Impl : ( 'CPS' ) ;
    public final void rule__Signal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1202:1: ( ( 'CPS' ) )
            // InternalAdeptness.g:1203:1: ( 'CPS' )
            {
            // InternalAdeptness.g:1203:1: ( 'CPS' )
            // InternalAdeptness.g:1204:2: 'CPS'
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
    // InternalAdeptness.g:1213:1: rule__Signal__Group__1 : rule__Signal__Group__1__Impl rule__Signal__Group__2 ;
    public final void rule__Signal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1217:1: ( rule__Signal__Group__1__Impl rule__Signal__Group__2 )
            // InternalAdeptness.g:1218:2: rule__Signal__Group__1__Impl rule__Signal__Group__2
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
    // InternalAdeptness.g:1225:1: rule__Signal__Group__1__Impl : ( ( rule__Signal__NameAssignment_1 ) ) ;
    public final void rule__Signal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1229:1: ( ( ( rule__Signal__NameAssignment_1 ) ) )
            // InternalAdeptness.g:1230:1: ( ( rule__Signal__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:1230:1: ( ( rule__Signal__NameAssignment_1 ) )
            // InternalAdeptness.g:1231:2: ( rule__Signal__NameAssignment_1 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:1232:2: ( rule__Signal__NameAssignment_1 )
            // InternalAdeptness.g:1232:3: rule__Signal__NameAssignment_1
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
    // InternalAdeptness.g:1240:1: rule__Signal__Group__2 : rule__Signal__Group__2__Impl rule__Signal__Group__3 ;
    public final void rule__Signal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1244:1: ( rule__Signal__Group__2__Impl rule__Signal__Group__3 )
            // InternalAdeptness.g:1245:2: rule__Signal__Group__2__Impl rule__Signal__Group__3
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
    // InternalAdeptness.g:1252:1: rule__Signal__Group__2__Impl : ( ':' ) ;
    public final void rule__Signal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1256:1: ( ( ':' ) )
            // InternalAdeptness.g:1257:1: ( ':' )
            {
            // InternalAdeptness.g:1257:1: ( ':' )
            // InternalAdeptness.g:1258:2: ':'
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
    // InternalAdeptness.g:1267:1: rule__Signal__Group__3 : rule__Signal__Group__3__Impl rule__Signal__Group__4 ;
    public final void rule__Signal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1271:1: ( rule__Signal__Group__3__Impl rule__Signal__Group__4 )
            // InternalAdeptness.g:1272:2: rule__Signal__Group__3__Impl rule__Signal__Group__4
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
    // InternalAdeptness.g:1279:1: rule__Signal__Group__3__Impl : ( ( ( rule__Signal__OracleAssignment_3 ) ) ( ( rule__Signal__OracleAssignment_3 )* ) ) ;
    public final void rule__Signal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1283:1: ( ( ( ( rule__Signal__OracleAssignment_3 ) ) ( ( rule__Signal__OracleAssignment_3 )* ) ) )
            // InternalAdeptness.g:1284:1: ( ( ( rule__Signal__OracleAssignment_3 ) ) ( ( rule__Signal__OracleAssignment_3 )* ) )
            {
            // InternalAdeptness.g:1284:1: ( ( ( rule__Signal__OracleAssignment_3 ) ) ( ( rule__Signal__OracleAssignment_3 )* ) )
            // InternalAdeptness.g:1285:2: ( ( rule__Signal__OracleAssignment_3 ) ) ( ( rule__Signal__OracleAssignment_3 )* )
            {
            // InternalAdeptness.g:1285:2: ( ( rule__Signal__OracleAssignment_3 ) )
            // InternalAdeptness.g:1286:3: ( rule__Signal__OracleAssignment_3 )
            {
             before(grammarAccess.getSignalAccess().getOracleAssignment_3()); 
            // InternalAdeptness.g:1287:3: ( rule__Signal__OracleAssignment_3 )
            // InternalAdeptness.g:1287:4: rule__Signal__OracleAssignment_3
            {
            pushFollow(FOLLOW_11);
            rule__Signal__OracleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getOracleAssignment_3()); 

            }

            // InternalAdeptness.g:1290:2: ( ( rule__Signal__OracleAssignment_3 )* )
            // InternalAdeptness.g:1291:3: ( rule__Signal__OracleAssignment_3 )*
            {
             before(grammarAccess.getSignalAccess().getOracleAssignment_3()); 
            // InternalAdeptness.g:1292:3: ( rule__Signal__OracleAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAdeptness.g:1292:4: rule__Signal__OracleAssignment_3
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
    // InternalAdeptness.g:1301:1: rule__Signal__Group__4 : rule__Signal__Group__4__Impl ;
    public final void rule__Signal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1305:1: ( rule__Signal__Group__4__Impl )
            // InternalAdeptness.g:1306:2: rule__Signal__Group__4__Impl
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
    // InternalAdeptness.g:1312:1: rule__Signal__Group__4__Impl : ( 'ENDCPS' ) ;
    public final void rule__Signal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1316:1: ( ( 'ENDCPS' ) )
            // InternalAdeptness.g:1317:1: ( 'ENDCPS' )
            {
            // InternalAdeptness.g:1317:1: ( 'ENDCPS' )
            // InternalAdeptness.g:1318:2: 'ENDCPS'
            {
             before(grammarAccess.getSignalAccess().getENDCPSKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getENDCPSKeyword_4()); 

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
    // InternalAdeptness.g:1328:1: rule__Oracle__Group__0 : rule__Oracle__Group__0__Impl rule__Oracle__Group__1 ;
    public final void rule__Oracle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1332:1: ( rule__Oracle__Group__0__Impl rule__Oracle__Group__1 )
            // InternalAdeptness.g:1333:2: rule__Oracle__Group__0__Impl rule__Oracle__Group__1
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
    // InternalAdeptness.g:1340:1: rule__Oracle__Group__0__Impl : ( 'ORACLE' ) ;
    public final void rule__Oracle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1344:1: ( ( 'ORACLE' ) )
            // InternalAdeptness.g:1345:1: ( 'ORACLE' )
            {
            // InternalAdeptness.g:1345:1: ( 'ORACLE' )
            // InternalAdeptness.g:1346:2: 'ORACLE'
            {
             before(grammarAccess.getOracleAccess().getORACLEKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOracleAccess().getORACLEKeyword_0()); 

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
    // InternalAdeptness.g:1355:1: rule__Oracle__Group__1 : rule__Oracle__Group__1__Impl rule__Oracle__Group__2 ;
    public final void rule__Oracle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1359:1: ( rule__Oracle__Group__1__Impl rule__Oracle__Group__2 )
            // InternalAdeptness.g:1360:2: rule__Oracle__Group__1__Impl rule__Oracle__Group__2
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
    // InternalAdeptness.g:1367:1: rule__Oracle__Group__1__Impl : ( ( rule__Oracle__NameAssignment_1 ) ) ;
    public final void rule__Oracle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1371:1: ( ( ( rule__Oracle__NameAssignment_1 ) ) )
            // InternalAdeptness.g:1372:1: ( ( rule__Oracle__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:1372:1: ( ( rule__Oracle__NameAssignment_1 ) )
            // InternalAdeptness.g:1373:2: ( rule__Oracle__NameAssignment_1 )
            {
             before(grammarAccess.getOracleAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:1374:2: ( rule__Oracle__NameAssignment_1 )
            // InternalAdeptness.g:1374:3: rule__Oracle__NameAssignment_1
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
    // InternalAdeptness.g:1382:1: rule__Oracle__Group__2 : rule__Oracle__Group__2__Impl rule__Oracle__Group__3 ;
    public final void rule__Oracle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1386:1: ( rule__Oracle__Group__2__Impl rule__Oracle__Group__3 )
            // InternalAdeptness.g:1387:2: rule__Oracle__Group__2__Impl rule__Oracle__Group__3
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
    // InternalAdeptness.g:1394:1: rule__Oracle__Group__2__Impl : ( ':' ) ;
    public final void rule__Oracle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1398:1: ( ( ':' ) )
            // InternalAdeptness.g:1399:1: ( ':' )
            {
            // InternalAdeptness.g:1399:1: ( ':' )
            // InternalAdeptness.g:1400:2: ':'
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
    // InternalAdeptness.g:1409:1: rule__Oracle__Group__3 : rule__Oracle__Group__3__Impl rule__Oracle__Group__4 ;
    public final void rule__Oracle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1413:1: ( rule__Oracle__Group__3__Impl rule__Oracle__Group__4 )
            // InternalAdeptness.g:1414:2: rule__Oracle__Group__3__Impl rule__Oracle__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdeptness.g:1421:1: rule__Oracle__Group__3__Impl : ( ( ( rule__Oracle__CheckAssignment_3 ) ) ( ( rule__Oracle__CheckAssignment_3 )* ) ) ;
    public final void rule__Oracle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1425:1: ( ( ( ( rule__Oracle__CheckAssignment_3 ) ) ( ( rule__Oracle__CheckAssignment_3 )* ) ) )
            // InternalAdeptness.g:1426:1: ( ( ( rule__Oracle__CheckAssignment_3 ) ) ( ( rule__Oracle__CheckAssignment_3 )* ) )
            {
            // InternalAdeptness.g:1426:1: ( ( ( rule__Oracle__CheckAssignment_3 ) ) ( ( rule__Oracle__CheckAssignment_3 )* ) )
            // InternalAdeptness.g:1427:2: ( ( rule__Oracle__CheckAssignment_3 ) ) ( ( rule__Oracle__CheckAssignment_3 )* )
            {
            // InternalAdeptness.g:1427:2: ( ( rule__Oracle__CheckAssignment_3 ) )
            // InternalAdeptness.g:1428:3: ( rule__Oracle__CheckAssignment_3 )
            {
             before(grammarAccess.getOracleAccess().getCheckAssignment_3()); 
            // InternalAdeptness.g:1429:3: ( rule__Oracle__CheckAssignment_3 )
            // InternalAdeptness.g:1429:4: rule__Oracle__CheckAssignment_3
            {
            pushFollow(FOLLOW_14);
            rule__Oracle__CheckAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOracleAccess().getCheckAssignment_3()); 

            }

            // InternalAdeptness.g:1432:2: ( ( rule__Oracle__CheckAssignment_3 )* )
            // InternalAdeptness.g:1433:3: ( rule__Oracle__CheckAssignment_3 )*
            {
             before(grammarAccess.getOracleAccess().getCheckAssignment_3()); 
            // InternalAdeptness.g:1434:3: ( rule__Oracle__CheckAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAdeptness.g:1434:4: rule__Oracle__CheckAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalAdeptness.g:1443:1: rule__Oracle__Group__4 : rule__Oracle__Group__4__Impl ;
    public final void rule__Oracle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1447:1: ( rule__Oracle__Group__4__Impl )
            // InternalAdeptness.g:1448:2: rule__Oracle__Group__4__Impl
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
    // InternalAdeptness.g:1454:1: rule__Oracle__Group__4__Impl : ( 'ENDORACLE' ) ;
    public final void rule__Oracle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1458:1: ( ( 'ENDORACLE' ) )
            // InternalAdeptness.g:1459:1: ( 'ENDORACLE' )
            {
            // InternalAdeptness.g:1459:1: ( 'ENDORACLE' )
            // InternalAdeptness.g:1460:2: 'ENDORACLE'
            {
             before(grammarAccess.getOracleAccess().getENDORACLEKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getOracleAccess().getENDORACLEKeyword_4()); 

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


    // $ANTLR start "rule__Checks__Group__0"
    // InternalAdeptness.g:1470:1: rule__Checks__Group__0 : rule__Checks__Group__0__Impl rule__Checks__Group__1 ;
    public final void rule__Checks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1474:1: ( rule__Checks__Group__0__Impl rule__Checks__Group__1 )
            // InternalAdeptness.g:1475:2: rule__Checks__Group__0__Impl rule__Checks__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Checks__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checks__Group__1();

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
    // $ANTLR end "rule__Checks__Group__0"


    // $ANTLR start "rule__Checks__Group__0__Impl"
    // InternalAdeptness.g:1482:1: rule__Checks__Group__0__Impl : ( 'checks:' ) ;
    public final void rule__Checks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1486:1: ( ( 'checks:' ) )
            // InternalAdeptness.g:1487:1: ( 'checks:' )
            {
            // InternalAdeptness.g:1487:1: ( 'checks:' )
            // InternalAdeptness.g:1488:2: 'checks:'
            {
             before(grammarAccess.getChecksAccess().getChecksKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getChecksAccess().getChecksKeyword_0()); 

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
    // $ANTLR end "rule__Checks__Group__0__Impl"


    // $ANTLR start "rule__Checks__Group__1"
    // InternalAdeptness.g:1497:1: rule__Checks__Group__1 : rule__Checks__Group__1__Impl rule__Checks__Group__2 ;
    public final void rule__Checks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1501:1: ( rule__Checks__Group__1__Impl rule__Checks__Group__2 )
            // InternalAdeptness.g:1502:2: rule__Checks__Group__1__Impl rule__Checks__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Checks__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checks__Group__2();

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
    // $ANTLR end "rule__Checks__Group__1"


    // $ANTLR start "rule__Checks__Group__1__Impl"
    // InternalAdeptness.g:1509:1: rule__Checks__Group__1__Impl : ( ( rule__Checks__NameAssignment_1 ) ) ;
    public final void rule__Checks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1513:1: ( ( ( rule__Checks__NameAssignment_1 ) ) )
            // InternalAdeptness.g:1514:1: ( ( rule__Checks__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:1514:1: ( ( rule__Checks__NameAssignment_1 ) )
            // InternalAdeptness.g:1515:2: ( rule__Checks__NameAssignment_1 )
            {
             before(grammarAccess.getChecksAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:1516:2: ( rule__Checks__NameAssignment_1 )
            // InternalAdeptness.g:1516:3: rule__Checks__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Checks__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChecksAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Checks__Group__1__Impl"


    // $ANTLR start "rule__Checks__Group__2"
    // InternalAdeptness.g:1524:1: rule__Checks__Group__2 : rule__Checks__Group__2__Impl rule__Checks__Group__3 ;
    public final void rule__Checks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1528:1: ( rule__Checks__Group__2__Impl rule__Checks__Group__3 )
            // InternalAdeptness.g:1529:2: rule__Checks__Group__2__Impl rule__Checks__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Checks__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checks__Group__3();

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
    // $ANTLR end "rule__Checks__Group__2"


    // $ANTLR start "rule__Checks__Group__2__Impl"
    // InternalAdeptness.g:1536:1: rule__Checks__Group__2__Impl : ( ( rule__Checks__ReferenceAssignment_2 ) ) ;
    public final void rule__Checks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1540:1: ( ( ( rule__Checks__ReferenceAssignment_2 ) ) )
            // InternalAdeptness.g:1541:1: ( ( rule__Checks__ReferenceAssignment_2 ) )
            {
            // InternalAdeptness.g:1541:1: ( ( rule__Checks__ReferenceAssignment_2 ) )
            // InternalAdeptness.g:1542:2: ( rule__Checks__ReferenceAssignment_2 )
            {
             before(grammarAccess.getChecksAccess().getReferenceAssignment_2()); 
            // InternalAdeptness.g:1543:2: ( rule__Checks__ReferenceAssignment_2 )
            // InternalAdeptness.g:1543:3: rule__Checks__ReferenceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Checks__ReferenceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChecksAccess().getReferenceAssignment_2()); 

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
    // $ANTLR end "rule__Checks__Group__2__Impl"


    // $ANTLR start "rule__Checks__Group__3"
    // InternalAdeptness.g:1551:1: rule__Checks__Group__3 : rule__Checks__Group__3__Impl rule__Checks__Group__4 ;
    public final void rule__Checks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1555:1: ( rule__Checks__Group__3__Impl rule__Checks__Group__4 )
            // InternalAdeptness.g:1556:2: rule__Checks__Group__3__Impl rule__Checks__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Checks__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Checks__Group__4();

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
    // $ANTLR end "rule__Checks__Group__3"


    // $ANTLR start "rule__Checks__Group__3__Impl"
    // InternalAdeptness.g:1563:1: rule__Checks__Group__3__Impl : ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) ) ;
    public final void rule__Checks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1567:1: ( ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) ) )
            // InternalAdeptness.g:1568:1: ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) )
            {
            // InternalAdeptness.g:1568:1: ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) )
            // InternalAdeptness.g:1569:2: ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* )
            {
            // InternalAdeptness.g:1569:2: ( ( rule__Checks__FailReasonAssignment_3 ) )
            // InternalAdeptness.g:1570:3: ( rule__Checks__FailReasonAssignment_3 )
            {
             before(grammarAccess.getChecksAccess().getFailReasonAssignment_3()); 
            // InternalAdeptness.g:1571:3: ( rule__Checks__FailReasonAssignment_3 )
            // InternalAdeptness.g:1571:4: rule__Checks__FailReasonAssignment_3
            {
            pushFollow(FOLLOW_19);
            rule__Checks__FailReasonAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChecksAccess().getFailReasonAssignment_3()); 

            }

            // InternalAdeptness.g:1574:2: ( ( rule__Checks__FailReasonAssignment_3 )* )
            // InternalAdeptness.g:1575:3: ( rule__Checks__FailReasonAssignment_3 )*
            {
             before(grammarAccess.getChecksAccess().getFailReasonAssignment_3()); 
            // InternalAdeptness.g:1576:3: ( rule__Checks__FailReasonAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAdeptness.g:1576:4: rule__Checks__FailReasonAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Checks__FailReasonAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getChecksAccess().getFailReasonAssignment_3()); 

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
    // $ANTLR end "rule__Checks__Group__3__Impl"


    // $ANTLR start "rule__Checks__Group__4"
    // InternalAdeptness.g:1585:1: rule__Checks__Group__4 : rule__Checks__Group__4__Impl ;
    public final void rule__Checks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1589:1: ( rule__Checks__Group__4__Impl )
            // InternalAdeptness.g:1590:2: rule__Checks__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Checks__Group__4__Impl();

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
    // $ANTLR end "rule__Checks__Group__4"


    // $ANTLR start "rule__Checks__Group__4__Impl"
    // InternalAdeptness.g:1596:1: rule__Checks__Group__4__Impl : ( ( rule__Checks__DescriptionAssignment_4 ) ) ;
    public final void rule__Checks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1600:1: ( ( ( rule__Checks__DescriptionAssignment_4 ) ) )
            // InternalAdeptness.g:1601:1: ( ( rule__Checks__DescriptionAssignment_4 ) )
            {
            // InternalAdeptness.g:1601:1: ( ( rule__Checks__DescriptionAssignment_4 ) )
            // InternalAdeptness.g:1602:2: ( rule__Checks__DescriptionAssignment_4 )
            {
             before(grammarAccess.getChecksAccess().getDescriptionAssignment_4()); 
            // InternalAdeptness.g:1603:2: ( rule__Checks__DescriptionAssignment_4 )
            // InternalAdeptness.g:1603:3: rule__Checks__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Checks__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChecksAccess().getDescriptionAssignment_4()); 

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
    // $ANTLR end "rule__Checks__Group__4__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalAdeptness.g:1612:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1616:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalAdeptness.g:1617:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__1();

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
    // $ANTLR end "rule__Description__Group__0"


    // $ANTLR start "rule__Description__Group__0__Impl"
    // InternalAdeptness.g:1624:1: rule__Description__Group__0__Impl : ( 'Description: ' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1628:1: ( ( 'Description: ' ) )
            // InternalAdeptness.g:1629:1: ( 'Description: ' )
            {
            // InternalAdeptness.g:1629:1: ( 'Description: ' )
            // InternalAdeptness.g:1630:2: 'Description: '
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 

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
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // InternalAdeptness.g:1639:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1643:1: ( rule__Description__Group__1__Impl )
            // InternalAdeptness.g:1644:2: rule__Description__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__1__Impl();

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
    // $ANTLR end "rule__Description__Group__1"


    // $ANTLR start "rule__Description__Group__1__Impl"
    // InternalAdeptness.g:1650:1: rule__Description__Group__1__Impl : ( ( rule__Description__ValueAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1654:1: ( ( ( rule__Description__ValueAssignment_1 ) ) )
            // InternalAdeptness.g:1655:1: ( ( rule__Description__ValueAssignment_1 ) )
            {
            // InternalAdeptness.g:1655:1: ( ( rule__Description__ValueAssignment_1 ) )
            // InternalAdeptness.g:1656:2: ( rule__Description__ValueAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getValueAssignment_1()); 
            // InternalAdeptness.g:1657:2: ( rule__Description__ValueAssignment_1 )
            // InternalAdeptness.g:1657:3: rule__Description__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Description__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Description__Group__1__Impl"


    // $ANTLR start "rule__FailReason__Group__0"
    // InternalAdeptness.g:1666:1: rule__FailReason__Group__0 : rule__FailReason__Group__0__Impl rule__FailReason__Group__1 ;
    public final void rule__FailReason__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1670:1: ( rule__FailReason__Group__0__Impl rule__FailReason__Group__1 )
            // InternalAdeptness.g:1671:2: rule__FailReason__Group__0__Impl rule__FailReason__Group__1
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
    // InternalAdeptness.g:1678:1: rule__FailReason__Group__0__Impl : ( 'fails if :' ) ;
    public final void rule__FailReason__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1682:1: ( ( 'fails if :' ) )
            // InternalAdeptness.g:1683:1: ( 'fails if :' )
            {
            // InternalAdeptness.g:1683:1: ( 'fails if :' )
            // InternalAdeptness.g:1684:2: 'fails if :'
            {
             before(grammarAccess.getFailReasonAccess().getFailsIfKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFailReasonAccess().getFailsIfKeyword_0()); 

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
    // InternalAdeptness.g:1693:1: rule__FailReason__Group__1 : rule__FailReason__Group__1__Impl ;
    public final void rule__FailReason__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1697:1: ( rule__FailReason__Group__1__Impl )
            // InternalAdeptness.g:1698:2: rule__FailReason__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FailReason__Group__1__Impl();

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
    // InternalAdeptness.g:1704:1: rule__FailReason__Group__1__Impl : ( ( rule__FailReason__ReasonAssignment_1 ) ) ;
    public final void rule__FailReason__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1708:1: ( ( ( rule__FailReason__ReasonAssignment_1 ) ) )
            // InternalAdeptness.g:1709:1: ( ( rule__FailReason__ReasonAssignment_1 ) )
            {
            // InternalAdeptness.g:1709:1: ( ( rule__FailReason__ReasonAssignment_1 ) )
            // InternalAdeptness.g:1710:2: ( rule__FailReason__ReasonAssignment_1 )
            {
             before(grammarAccess.getFailReasonAccess().getReasonAssignment_1()); 
            // InternalAdeptness.g:1711:2: ( rule__FailReason__ReasonAssignment_1 )
            // InternalAdeptness.g:1711:3: rule__FailReason__ReasonAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FailReason__ReasonAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFailReasonAccess().getReasonAssignment_1()); 

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


    // $ANTLR start "rule__Reason__Group__0"
    // InternalAdeptness.g:1720:1: rule__Reason__Group__0 : rule__Reason__Group__0__Impl rule__Reason__Group__1 ;
    public final void rule__Reason__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1724:1: ( rule__Reason__Group__0__Impl rule__Reason__Group__1 )
            // InternalAdeptness.g:1725:2: rule__Reason__Group__0__Impl rule__Reason__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Reason__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reason__Group__1();

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
    // $ANTLR end "rule__Reason__Group__0"


    // $ANTLR start "rule__Reason__Group__0__Impl"
    // InternalAdeptness.g:1732:1: rule__Reason__Group__0__Impl : ( ( rule__Reason__Alternatives_0 ) ) ;
    public final void rule__Reason__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1736:1: ( ( ( rule__Reason__Alternatives_0 ) ) )
            // InternalAdeptness.g:1737:1: ( ( rule__Reason__Alternatives_0 ) )
            {
            // InternalAdeptness.g:1737:1: ( ( rule__Reason__Alternatives_0 ) )
            // InternalAdeptness.g:1738:2: ( rule__Reason__Alternatives_0 )
            {
             before(grammarAccess.getReasonAccess().getAlternatives_0()); 
            // InternalAdeptness.g:1739:2: ( rule__Reason__Alternatives_0 )
            // InternalAdeptness.g:1739:3: rule__Reason__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Reason__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getReasonAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Reason__Group__0__Impl"


    // $ANTLR start "rule__Reason__Group__1"
    // InternalAdeptness.g:1747:1: rule__Reason__Group__1 : rule__Reason__Group__1__Impl ;
    public final void rule__Reason__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1751:1: ( rule__Reason__Group__1__Impl )
            // InternalAdeptness.g:1752:2: rule__Reason__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reason__Group__1__Impl();

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
    // $ANTLR end "rule__Reason__Group__1"


    // $ANTLR start "rule__Reason__Group__1__Impl"
    // InternalAdeptness.g:1758:1: rule__Reason__Group__1__Impl : ( ';' ) ;
    public final void rule__Reason__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1762:1: ( ( ';' ) )
            // InternalAdeptness.g:1763:1: ( ';' )
            {
            // InternalAdeptness.g:1763:1: ( ';' )
            // InternalAdeptness.g:1764:2: ';'
            {
             before(grammarAccess.getReasonAccess().getSemicolonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getReasonAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__Reason__Group__1__Impl"


    // $ANTLR start "rule__XPeaks__Group__0"
    // InternalAdeptness.g:1774:1: rule__XPeaks__Group__0 : rule__XPeaks__Group__0__Impl rule__XPeaks__Group__1 ;
    public final void rule__XPeaks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1778:1: ( rule__XPeaks__Group__0__Impl rule__XPeaks__Group__1 )
            // InternalAdeptness.g:1779:2: rule__XPeaks__Group__0__Impl rule__XPeaks__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__XPeaks__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XPeaks__Group__1();

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
    // $ANTLR end "rule__XPeaks__Group__0"


    // $ANTLR start "rule__XPeaks__Group__0__Impl"
    // InternalAdeptness.g:1786:1: rule__XPeaks__Group__0__Impl : ( 'confidence is below' ) ;
    public final void rule__XPeaks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1790:1: ( ( 'confidence is below' ) )
            // InternalAdeptness.g:1791:1: ( 'confidence is below' )
            {
            // InternalAdeptness.g:1791:1: ( 'confidence is below' )
            // InternalAdeptness.g:1792:2: 'confidence is below'
            {
             before(grammarAccess.getXPeaksAccess().getConfidenceIsBelowKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getXPeaksAccess().getConfidenceIsBelowKeyword_0()); 

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
    // $ANTLR end "rule__XPeaks__Group__0__Impl"


    // $ANTLR start "rule__XPeaks__Group__1"
    // InternalAdeptness.g:1801:1: rule__XPeaks__Group__1 : rule__XPeaks__Group__1__Impl rule__XPeaks__Group__2 ;
    public final void rule__XPeaks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1805:1: ( rule__XPeaks__Group__1__Impl rule__XPeaks__Group__2 )
            // InternalAdeptness.g:1806:2: rule__XPeaks__Group__1__Impl rule__XPeaks__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__XPeaks__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XPeaks__Group__2();

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
    // $ANTLR end "rule__XPeaks__Group__1"


    // $ANTLR start "rule__XPeaks__Group__1__Impl"
    // InternalAdeptness.g:1813:1: rule__XPeaks__Group__1__Impl : ( ( rule__XPeaks__CantAssignment_1 ) ) ;
    public final void rule__XPeaks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1817:1: ( ( ( rule__XPeaks__CantAssignment_1 ) ) )
            // InternalAdeptness.g:1818:1: ( ( rule__XPeaks__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:1818:1: ( ( rule__XPeaks__CantAssignment_1 ) )
            // InternalAdeptness.g:1819:2: ( rule__XPeaks__CantAssignment_1 )
            {
             before(grammarAccess.getXPeaksAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:1820:2: ( rule__XPeaks__CantAssignment_1 )
            // InternalAdeptness.g:1820:3: rule__XPeaks__CantAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XPeaks__CantAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXPeaksAccess().getCantAssignment_1()); 

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
    // $ANTLR end "rule__XPeaks__Group__1__Impl"


    // $ANTLR start "rule__XPeaks__Group__2"
    // InternalAdeptness.g:1828:1: rule__XPeaks__Group__2 : rule__XPeaks__Group__2__Impl rule__XPeaks__Group__3 ;
    public final void rule__XPeaks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1832:1: ( rule__XPeaks__Group__2__Impl rule__XPeaks__Group__3 )
            // InternalAdeptness.g:1833:2: rule__XPeaks__Group__2__Impl rule__XPeaks__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__XPeaks__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XPeaks__Group__3();

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
    // $ANTLR end "rule__XPeaks__Group__2"


    // $ANTLR start "rule__XPeaks__Group__2__Impl"
    // InternalAdeptness.g:1840:1: rule__XPeaks__Group__2__Impl : ( 'more than' ) ;
    public final void rule__XPeaks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1844:1: ( ( 'more than' ) )
            // InternalAdeptness.g:1845:1: ( 'more than' )
            {
            // InternalAdeptness.g:1845:1: ( 'more than' )
            // InternalAdeptness.g:1846:2: 'more than'
            {
             before(grammarAccess.getXPeaksAccess().getMoreThanKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getXPeaksAccess().getMoreThanKeyword_2()); 

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
    // $ANTLR end "rule__XPeaks__Group__2__Impl"


    // $ANTLR start "rule__XPeaks__Group__3"
    // InternalAdeptness.g:1855:1: rule__XPeaks__Group__3 : rule__XPeaks__Group__3__Impl rule__XPeaks__Group__4 ;
    public final void rule__XPeaks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1859:1: ( rule__XPeaks__Group__3__Impl rule__XPeaks__Group__4 )
            // InternalAdeptness.g:1860:2: rule__XPeaks__Group__3__Impl rule__XPeaks__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__XPeaks__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XPeaks__Group__4();

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
    // $ANTLR end "rule__XPeaks__Group__3"


    // $ANTLR start "rule__XPeaks__Group__3__Impl"
    // InternalAdeptness.g:1867:1: rule__XPeaks__Group__3__Impl : ( ( rule__XPeaks__NPeaksAssignment_3 ) ) ;
    public final void rule__XPeaks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1871:1: ( ( ( rule__XPeaks__NPeaksAssignment_3 ) ) )
            // InternalAdeptness.g:1872:1: ( ( rule__XPeaks__NPeaksAssignment_3 ) )
            {
            // InternalAdeptness.g:1872:1: ( ( rule__XPeaks__NPeaksAssignment_3 ) )
            // InternalAdeptness.g:1873:2: ( rule__XPeaks__NPeaksAssignment_3 )
            {
             before(grammarAccess.getXPeaksAccess().getNPeaksAssignment_3()); 
            // InternalAdeptness.g:1874:2: ( rule__XPeaks__NPeaksAssignment_3 )
            // InternalAdeptness.g:1874:3: rule__XPeaks__NPeaksAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XPeaks__NPeaksAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXPeaksAccess().getNPeaksAssignment_3()); 

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
    // $ANTLR end "rule__XPeaks__Group__3__Impl"


    // $ANTLR start "rule__XPeaks__Group__4"
    // InternalAdeptness.g:1882:1: rule__XPeaks__Group__4 : rule__XPeaks__Group__4__Impl rule__XPeaks__Group__5 ;
    public final void rule__XPeaks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1886:1: ( rule__XPeaks__Group__4__Impl rule__XPeaks__Group__5 )
            // InternalAdeptness.g:1887:2: rule__XPeaks__Group__4__Impl rule__XPeaks__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__XPeaks__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XPeaks__Group__5();

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
    // $ANTLR end "rule__XPeaks__Group__4"


    // $ANTLR start "rule__XPeaks__Group__4__Impl"
    // InternalAdeptness.g:1894:1: rule__XPeaks__Group__4__Impl : ( 'times within' ) ;
    public final void rule__XPeaks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1898:1: ( ( 'times within' ) )
            // InternalAdeptness.g:1899:1: ( 'times within' )
            {
            // InternalAdeptness.g:1899:1: ( 'times within' )
            // InternalAdeptness.g:1900:2: 'times within'
            {
             before(grammarAccess.getXPeaksAccess().getTimesWithinKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getXPeaksAccess().getTimesWithinKeyword_4()); 

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
    // $ANTLR end "rule__XPeaks__Group__4__Impl"


    // $ANTLR start "rule__XPeaks__Group__5"
    // InternalAdeptness.g:1909:1: rule__XPeaks__Group__5 : rule__XPeaks__Group__5__Impl rule__XPeaks__Group__6 ;
    public final void rule__XPeaks__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1913:1: ( rule__XPeaks__Group__5__Impl rule__XPeaks__Group__6 )
            // InternalAdeptness.g:1914:2: rule__XPeaks__Group__5__Impl rule__XPeaks__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__XPeaks__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XPeaks__Group__6();

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
    // $ANTLR end "rule__XPeaks__Group__5"


    // $ANTLR start "rule__XPeaks__Group__5__Impl"
    // InternalAdeptness.g:1921:1: rule__XPeaks__Group__5__Impl : ( ( rule__XPeaks__TimeAssignment_5 ) ) ;
    public final void rule__XPeaks__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1925:1: ( ( ( rule__XPeaks__TimeAssignment_5 ) ) )
            // InternalAdeptness.g:1926:1: ( ( rule__XPeaks__TimeAssignment_5 ) )
            {
            // InternalAdeptness.g:1926:1: ( ( rule__XPeaks__TimeAssignment_5 ) )
            // InternalAdeptness.g:1927:2: ( rule__XPeaks__TimeAssignment_5 )
            {
             before(grammarAccess.getXPeaksAccess().getTimeAssignment_5()); 
            // InternalAdeptness.g:1928:2: ( rule__XPeaks__TimeAssignment_5 )
            // InternalAdeptness.g:1928:3: rule__XPeaks__TimeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__XPeaks__TimeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getXPeaksAccess().getTimeAssignment_5()); 

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
    // $ANTLR end "rule__XPeaks__Group__5__Impl"


    // $ANTLR start "rule__XPeaks__Group__6"
    // InternalAdeptness.g:1936:1: rule__XPeaks__Group__6 : rule__XPeaks__Group__6__Impl ;
    public final void rule__XPeaks__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1940:1: ( rule__XPeaks__Group__6__Impl )
            // InternalAdeptness.g:1941:2: rule__XPeaks__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XPeaks__Group__6__Impl();

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
    // $ANTLR end "rule__XPeaks__Group__6"


    // $ANTLR start "rule__XPeaks__Group__6__Impl"
    // InternalAdeptness.g:1947:1: rule__XPeaks__Group__6__Impl : ( ( rule__XPeaks__UnitAssignment_6 ) ) ;
    public final void rule__XPeaks__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1951:1: ( ( ( rule__XPeaks__UnitAssignment_6 ) ) )
            // InternalAdeptness.g:1952:1: ( ( rule__XPeaks__UnitAssignment_6 ) )
            {
            // InternalAdeptness.g:1952:1: ( ( rule__XPeaks__UnitAssignment_6 ) )
            // InternalAdeptness.g:1953:2: ( rule__XPeaks__UnitAssignment_6 )
            {
             before(grammarAccess.getXPeaksAccess().getUnitAssignment_6()); 
            // InternalAdeptness.g:1954:2: ( rule__XPeaks__UnitAssignment_6 )
            // InternalAdeptness.g:1954:3: rule__XPeaks__UnitAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__XPeaks__UnitAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getXPeaksAccess().getUnitAssignment_6()); 

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
    // $ANTLR end "rule__XPeaks__Group__6__Impl"


    // $ANTLR start "rule__ConstDeg__Group__0"
    // InternalAdeptness.g:1963:1: rule__ConstDeg__Group__0 : rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1 ;
    public final void rule__ConstDeg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1967:1: ( rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1 )
            // InternalAdeptness.g:1968:2: rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAdeptness.g:1975:1: rule__ConstDeg__Group__0__Impl : ( 'confidence is in constant degradation' ) ;
    public final void rule__ConstDeg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1979:1: ( ( 'confidence is in constant degradation' ) )
            // InternalAdeptness.g:1980:1: ( 'confidence is in constant degradation' )
            {
            // InternalAdeptness.g:1980:1: ( 'confidence is in constant degradation' )
            // InternalAdeptness.g:1981:2: 'confidence is in constant degradation'
            {
             before(grammarAccess.getConstDegAccess().getConfidenceIsInConstantDegradationKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getConstDegAccess().getConfidenceIsInConstantDegradationKeyword_0()); 

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
    // InternalAdeptness.g:1990:1: rule__ConstDeg__Group__1 : rule__ConstDeg__Group__1__Impl ;
    public final void rule__ConstDeg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1994:1: ( rule__ConstDeg__Group__1__Impl )
            // InternalAdeptness.g:1995:2: rule__ConstDeg__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstDeg__Group__1__Impl();

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
    // InternalAdeptness.g:2001:1: rule__ConstDeg__Group__1__Impl : ( ( rule__ConstDeg__CantAssignment_1 ) ) ;
    public final void rule__ConstDeg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2005:1: ( ( ( rule__ConstDeg__CantAssignment_1 ) ) )
            // InternalAdeptness.g:2006:1: ( ( rule__ConstDeg__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:2006:1: ( ( rule__ConstDeg__CantAssignment_1 ) )
            // InternalAdeptness.g:2007:2: ( rule__ConstDeg__CantAssignment_1 )
            {
             before(grammarAccess.getConstDegAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:2008:2: ( rule__ConstDeg__CantAssignment_1 )
            // InternalAdeptness.g:2008:3: rule__ConstDeg__CantAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstDeg__CantAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstDegAccess().getCantAssignment_1()); 

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


    // $ANTLR start "rule__HighTime__Group__0"
    // InternalAdeptness.g:2017:1: rule__HighTime__Group__0 : rule__HighTime__Group__0__Impl rule__HighTime__Group__1 ;
    public final void rule__HighTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2021:1: ( rule__HighTime__Group__0__Impl rule__HighTime__Group__1 )
            // InternalAdeptness.g:2022:2: rule__HighTime__Group__0__Impl rule__HighTime__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAdeptness.g:2029:1: rule__HighTime__Group__0__Impl : ( 'confidence is below' ) ;
    public final void rule__HighTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2033:1: ( ( 'confidence is below' ) )
            // InternalAdeptness.g:2034:1: ( 'confidence is below' )
            {
            // InternalAdeptness.g:2034:1: ( 'confidence is below' )
            // InternalAdeptness.g:2035:2: 'confidence is below'
            {
             before(grammarAccess.getHighTimeAccess().getConfidenceIsBelowKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHighTimeAccess().getConfidenceIsBelowKeyword_0()); 

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
    // InternalAdeptness.g:2044:1: rule__HighTime__Group__1 : rule__HighTime__Group__1__Impl rule__HighTime__Group__2 ;
    public final void rule__HighTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2048:1: ( rule__HighTime__Group__1__Impl rule__HighTime__Group__2 )
            // InternalAdeptness.g:2049:2: rule__HighTime__Group__1__Impl rule__HighTime__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalAdeptness.g:2056:1: rule__HighTime__Group__1__Impl : ( ( rule__HighTime__CantAssignment_1 ) ) ;
    public final void rule__HighTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2060:1: ( ( ( rule__HighTime__CantAssignment_1 ) ) )
            // InternalAdeptness.g:2061:1: ( ( rule__HighTime__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:2061:1: ( ( rule__HighTime__CantAssignment_1 ) )
            // InternalAdeptness.g:2062:2: ( rule__HighTime__CantAssignment_1 )
            {
             before(grammarAccess.getHighTimeAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:2063:2: ( rule__HighTime__CantAssignment_1 )
            // InternalAdeptness.g:2063:3: rule__HighTime__CantAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HighTime__CantAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHighTimeAccess().getCantAssignment_1()); 

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
    // InternalAdeptness.g:2071:1: rule__HighTime__Group__2 : rule__HighTime__Group__2__Impl rule__HighTime__Group__3 ;
    public final void rule__HighTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2075:1: ( rule__HighTime__Group__2__Impl rule__HighTime__Group__3 )
            // InternalAdeptness.g:2076:2: rule__HighTime__Group__2__Impl rule__HighTime__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalAdeptness.g:2083:1: rule__HighTime__Group__2__Impl : ( 'within' ) ;
    public final void rule__HighTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2087:1: ( ( 'within' ) )
            // InternalAdeptness.g:2088:1: ( 'within' )
            {
            // InternalAdeptness.g:2088:1: ( 'within' )
            // InternalAdeptness.g:2089:2: 'within'
            {
             before(grammarAccess.getHighTimeAccess().getWithinKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getHighTimeAccess().getWithinKeyword_2()); 

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
    // InternalAdeptness.g:2098:1: rule__HighTime__Group__3 : rule__HighTime__Group__3__Impl rule__HighTime__Group__4 ;
    public final void rule__HighTime__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2102:1: ( rule__HighTime__Group__3__Impl rule__HighTime__Group__4 )
            // InternalAdeptness.g:2103:2: rule__HighTime__Group__3__Impl rule__HighTime__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalAdeptness.g:2110:1: rule__HighTime__Group__3__Impl : ( ( rule__HighTime__TimeAssignment_3 ) ) ;
    public final void rule__HighTime__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2114:1: ( ( ( rule__HighTime__TimeAssignment_3 ) ) )
            // InternalAdeptness.g:2115:1: ( ( rule__HighTime__TimeAssignment_3 ) )
            {
            // InternalAdeptness.g:2115:1: ( ( rule__HighTime__TimeAssignment_3 ) )
            // InternalAdeptness.g:2116:2: ( rule__HighTime__TimeAssignment_3 )
            {
             before(grammarAccess.getHighTimeAccess().getTimeAssignment_3()); 
            // InternalAdeptness.g:2117:2: ( rule__HighTime__TimeAssignment_3 )
            // InternalAdeptness.g:2117:3: rule__HighTime__TimeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__HighTime__TimeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHighTimeAccess().getTimeAssignment_3()); 

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
    // InternalAdeptness.g:2125:1: rule__HighTime__Group__4 : rule__HighTime__Group__4__Impl ;
    public final void rule__HighTime__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2129:1: ( rule__HighTime__Group__4__Impl )
            // InternalAdeptness.g:2130:2: rule__HighTime__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HighTime__Group__4__Impl();

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
    // InternalAdeptness.g:2136:1: rule__HighTime__Group__4__Impl : ( ( rule__HighTime__UnitAssignment_4 ) ) ;
    public final void rule__HighTime__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2140:1: ( ( ( rule__HighTime__UnitAssignment_4 ) ) )
            // InternalAdeptness.g:2141:1: ( ( rule__HighTime__UnitAssignment_4 ) )
            {
            // InternalAdeptness.g:2141:1: ( ( rule__HighTime__UnitAssignment_4 ) )
            // InternalAdeptness.g:2142:2: ( rule__HighTime__UnitAssignment_4 )
            {
             before(grammarAccess.getHighTimeAccess().getUnitAssignment_4()); 
            // InternalAdeptness.g:2143:2: ( rule__HighTime__UnitAssignment_4 )
            // InternalAdeptness.g:2143:3: rule__HighTime__UnitAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__HighTime__UnitAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHighTimeAccess().getUnitAssignment_4()); 

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


    // $ANTLR start "rule__HighPeak__Group__0"
    // InternalAdeptness.g:2152:1: rule__HighPeak__Group__0 : rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1 ;
    public final void rule__HighPeak__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2156:1: ( rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1 )
            // InternalAdeptness.g:2157:2: rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAdeptness.g:2164:1: rule__HighPeak__Group__0__Impl : ( 'confidence is below' ) ;
    public final void rule__HighPeak__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2168:1: ( ( 'confidence is below' ) )
            // InternalAdeptness.g:2169:1: ( 'confidence is below' )
            {
            // InternalAdeptness.g:2169:1: ( 'confidence is below' )
            // InternalAdeptness.g:2170:2: 'confidence is below'
            {
             before(grammarAccess.getHighPeakAccess().getConfidenceIsBelowKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHighPeakAccess().getConfidenceIsBelowKeyword_0()); 

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
    // InternalAdeptness.g:2179:1: rule__HighPeak__Group__1 : rule__HighPeak__Group__1__Impl ;
    public final void rule__HighPeak__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2183:1: ( rule__HighPeak__Group__1__Impl )
            // InternalAdeptness.g:2184:2: rule__HighPeak__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HighPeak__Group__1__Impl();

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
    // InternalAdeptness.g:2190:1: rule__HighPeak__Group__1__Impl : ( ( rule__HighPeak__CantAssignment_1 ) ) ;
    public final void rule__HighPeak__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2194:1: ( ( ( rule__HighPeak__CantAssignment_1 ) ) )
            // InternalAdeptness.g:2195:1: ( ( rule__HighPeak__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:2195:1: ( ( rule__HighPeak__CantAssignment_1 ) )
            // InternalAdeptness.g:2196:2: ( rule__HighPeak__CantAssignment_1 )
            {
             before(grammarAccess.getHighPeakAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:2197:2: ( rule__HighPeak__CantAssignment_1 )
            // InternalAdeptness.g:2197:3: rule__HighPeak__CantAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HighPeak__CantAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHighPeakAccess().getCantAssignment_1()); 

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


    // $ANTLR start "rule__Reference__Group__0"
    // InternalAdeptness.g:2206:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2210:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalAdeptness.g:2211:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalAdeptness.g:2218:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__Alternatives_0 ) ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2222:1: ( ( ( rule__Reference__Alternatives_0 ) ) )
            // InternalAdeptness.g:2223:1: ( ( rule__Reference__Alternatives_0 ) )
            {
            // InternalAdeptness.g:2223:1: ( ( rule__Reference__Alternatives_0 ) )
            // InternalAdeptness.g:2224:2: ( rule__Reference__Alternatives_0 )
            {
             before(grammarAccess.getReferenceAccess().getAlternatives_0()); 
            // InternalAdeptness.g:2225:2: ( rule__Reference__Alternatives_0 )
            // InternalAdeptness.g:2225:3: rule__Reference__Alternatives_0
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
    // InternalAdeptness.g:2233:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2237:1: ( rule__Reference__Group__1__Impl )
            // InternalAdeptness.g:2238:2: rule__Reference__Group__1__Impl
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
    // InternalAdeptness.g:2244:1: rule__Reference__Group__1__Impl : ( ';' ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2248:1: ( ( ';' ) )
            // InternalAdeptness.g:2249:1: ( ';' )
            {
            // InternalAdeptness.g:2249:1: ( ';' )
            // InternalAdeptness.g:2250:2: ';'
            {
             before(grammarAccess.getReferenceAccess().getSemicolonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getSemicolonKeyword_1()); 

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
    // InternalAdeptness.g:2260:1: rule__Upper__Group__0 : rule__Upper__Group__0__Impl rule__Upper__Group__1 ;
    public final void rule__Upper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2264:1: ( rule__Upper__Group__0__Impl rule__Upper__Group__1 )
            // InternalAdeptness.g:2265:2: rule__Upper__Group__0__Impl rule__Upper__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAdeptness.g:2272:1: rule__Upper__Group__0__Impl : ( 'is below' ) ;
    public final void rule__Upper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2276:1: ( ( 'is below' ) )
            // InternalAdeptness.g:2277:1: ( 'is below' )
            {
            // InternalAdeptness.g:2277:1: ( 'is below' )
            // InternalAdeptness.g:2278:2: 'is below'
            {
             before(grammarAccess.getUpperAccess().getIsBelowKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getUpperAccess().getIsBelowKeyword_0()); 

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
    // InternalAdeptness.g:2287:1: rule__Upper__Group__1 : rule__Upper__Group__1__Impl ;
    public final void rule__Upper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2291:1: ( rule__Upper__Group__1__Impl )
            // InternalAdeptness.g:2292:2: rule__Upper__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Upper__Group__1__Impl();

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
    // InternalAdeptness.g:2298:1: rule__Upper__Group__1__Impl : ( ( rule__Upper__Bound_uppAssignment_1 ) ) ;
    public final void rule__Upper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2302:1: ( ( ( rule__Upper__Bound_uppAssignment_1 ) ) )
            // InternalAdeptness.g:2303:1: ( ( rule__Upper__Bound_uppAssignment_1 ) )
            {
            // InternalAdeptness.g:2303:1: ( ( rule__Upper__Bound_uppAssignment_1 ) )
            // InternalAdeptness.g:2304:2: ( rule__Upper__Bound_uppAssignment_1 )
            {
             before(grammarAccess.getUpperAccess().getBound_uppAssignment_1()); 
            // InternalAdeptness.g:2305:2: ( rule__Upper__Bound_uppAssignment_1 )
            // InternalAdeptness.g:2305:3: rule__Upper__Bound_uppAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Upper__Bound_uppAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUpperAccess().getBound_uppAssignment_1()); 

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


    // $ANTLR start "rule__Lower__Group__0"
    // InternalAdeptness.g:2314:1: rule__Lower__Group__0 : rule__Lower__Group__0__Impl rule__Lower__Group__1 ;
    public final void rule__Lower__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2318:1: ( rule__Lower__Group__0__Impl rule__Lower__Group__1 )
            // InternalAdeptness.g:2319:2: rule__Lower__Group__0__Impl rule__Lower__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAdeptness.g:2326:1: rule__Lower__Group__0__Impl : ( 'is above' ) ;
    public final void rule__Lower__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2330:1: ( ( 'is above' ) )
            // InternalAdeptness.g:2331:1: ( 'is above' )
            {
            // InternalAdeptness.g:2331:1: ( 'is above' )
            // InternalAdeptness.g:2332:2: 'is above'
            {
             before(grammarAccess.getLowerAccess().getIsAboveKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLowerAccess().getIsAboveKeyword_0()); 

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
    // InternalAdeptness.g:2341:1: rule__Lower__Group__1 : rule__Lower__Group__1__Impl ;
    public final void rule__Lower__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2345:1: ( rule__Lower__Group__1__Impl )
            // InternalAdeptness.g:2346:2: rule__Lower__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lower__Group__1__Impl();

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
    // InternalAdeptness.g:2352:1: rule__Lower__Group__1__Impl : ( ( rule__Lower__Bound_lowerAssignment_1 ) ) ;
    public final void rule__Lower__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2356:1: ( ( ( rule__Lower__Bound_lowerAssignment_1 ) ) )
            // InternalAdeptness.g:2357:1: ( ( rule__Lower__Bound_lowerAssignment_1 ) )
            {
            // InternalAdeptness.g:2357:1: ( ( rule__Lower__Bound_lowerAssignment_1 ) )
            // InternalAdeptness.g:2358:2: ( rule__Lower__Bound_lowerAssignment_1 )
            {
             before(grammarAccess.getLowerAccess().getBound_lowerAssignment_1()); 
            // InternalAdeptness.g:2359:2: ( rule__Lower__Bound_lowerAssignment_1 )
            // InternalAdeptness.g:2359:3: rule__Lower__Bound_lowerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Lower__Bound_lowerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLowerAccess().getBound_lowerAssignment_1()); 

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


    // $ANTLR start "rule__Range__Group__0"
    // InternalAdeptness.g:2368:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2372:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // InternalAdeptness.g:2373:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAdeptness.g:2380:1: rule__Range__Group__0__Impl : ( 'is in range between' ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2384:1: ( ( 'is in range between' ) )
            // InternalAdeptness.g:2385:1: ( 'is in range between' )
            {
            // InternalAdeptness.g:2385:1: ( 'is in range between' )
            // InternalAdeptness.g:2386:2: 'is in range between'
            {
             before(grammarAccess.getRangeAccess().getIsInRangeBetweenKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getIsInRangeBetweenKeyword_0()); 

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
    // InternalAdeptness.g:2395:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2399:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // InternalAdeptness.g:2400:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalAdeptness.g:2407:1: rule__Range__Group__1__Impl : ( ( rule__Range__Bound_lowerAssignment_1 ) ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2411:1: ( ( ( rule__Range__Bound_lowerAssignment_1 ) ) )
            // InternalAdeptness.g:2412:1: ( ( rule__Range__Bound_lowerAssignment_1 ) )
            {
            // InternalAdeptness.g:2412:1: ( ( rule__Range__Bound_lowerAssignment_1 ) )
            // InternalAdeptness.g:2413:2: ( rule__Range__Bound_lowerAssignment_1 )
            {
             before(grammarAccess.getRangeAccess().getBound_lowerAssignment_1()); 
            // InternalAdeptness.g:2414:2: ( rule__Range__Bound_lowerAssignment_1 )
            // InternalAdeptness.g:2414:3: rule__Range__Bound_lowerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Range__Bound_lowerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getBound_lowerAssignment_1()); 

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
    // InternalAdeptness.g:2422:1: rule__Range__Group__2 : rule__Range__Group__2__Impl rule__Range__Group__3 ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2426:1: ( rule__Range__Group__2__Impl rule__Range__Group__3 )
            // InternalAdeptness.g:2427:2: rule__Range__Group__2__Impl rule__Range__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalAdeptness.g:2434:1: rule__Range__Group__2__Impl : ( 'and' ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2438:1: ( ( 'and' ) )
            // InternalAdeptness.g:2439:1: ( 'and' )
            {
            // InternalAdeptness.g:2439:1: ( 'and' )
            // InternalAdeptness.g:2440:2: 'and'
            {
             before(grammarAccess.getRangeAccess().getAndKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getAndKeyword_2()); 

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
    // InternalAdeptness.g:2449:1: rule__Range__Group__3 : rule__Range__Group__3__Impl ;
    public final void rule__Range__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2453:1: ( rule__Range__Group__3__Impl )
            // InternalAdeptness.g:2454:2: rule__Range__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group__3__Impl();

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
    // InternalAdeptness.g:2460:1: rule__Range__Group__3__Impl : ( ( rule__Range__Bound_uppAssignment_3 ) ) ;
    public final void rule__Range__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2464:1: ( ( ( rule__Range__Bound_uppAssignment_3 ) ) )
            // InternalAdeptness.g:2465:1: ( ( rule__Range__Bound_uppAssignment_3 ) )
            {
            // InternalAdeptness.g:2465:1: ( ( rule__Range__Bound_uppAssignment_3 ) )
            // InternalAdeptness.g:2466:2: ( rule__Range__Bound_uppAssignment_3 )
            {
             before(grammarAccess.getRangeAccess().getBound_uppAssignment_3()); 
            // InternalAdeptness.g:2467:2: ( rule__Range__Bound_uppAssignment_3 )
            // InternalAdeptness.g:2467:3: rule__Range__Bound_uppAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Range__Bound_uppAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getBound_uppAssignment_3()); 

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


    // $ANTLR start "rule__Gap__Group__0"
    // InternalAdeptness.g:2476:1: rule__Gap__Group__0 : rule__Gap__Group__0__Impl rule__Gap__Group__1 ;
    public final void rule__Gap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2480:1: ( rule__Gap__Group__0__Impl rule__Gap__Group__1 )
            // InternalAdeptness.g:2481:2: rule__Gap__Group__0__Impl rule__Gap__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAdeptness.g:2488:1: rule__Gap__Group__0__Impl : ( 'not in range between' ) ;
    public final void rule__Gap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2492:1: ( ( 'not in range between' ) )
            // InternalAdeptness.g:2493:1: ( 'not in range between' )
            {
            // InternalAdeptness.g:2493:1: ( 'not in range between' )
            // InternalAdeptness.g:2494:2: 'not in range between'
            {
             before(grammarAccess.getGapAccess().getNotInRangeBetweenKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGapAccess().getNotInRangeBetweenKeyword_0()); 

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
    // InternalAdeptness.g:2503:1: rule__Gap__Group__1 : rule__Gap__Group__1__Impl rule__Gap__Group__2 ;
    public final void rule__Gap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2507:1: ( rule__Gap__Group__1__Impl rule__Gap__Group__2 )
            // InternalAdeptness.g:2508:2: rule__Gap__Group__1__Impl rule__Gap__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalAdeptness.g:2515:1: rule__Gap__Group__1__Impl : ( ( rule__Gap__Bound_lowerAssignment_1 ) ) ;
    public final void rule__Gap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2519:1: ( ( ( rule__Gap__Bound_lowerAssignment_1 ) ) )
            // InternalAdeptness.g:2520:1: ( ( rule__Gap__Bound_lowerAssignment_1 ) )
            {
            // InternalAdeptness.g:2520:1: ( ( rule__Gap__Bound_lowerAssignment_1 ) )
            // InternalAdeptness.g:2521:2: ( rule__Gap__Bound_lowerAssignment_1 )
            {
             before(grammarAccess.getGapAccess().getBound_lowerAssignment_1()); 
            // InternalAdeptness.g:2522:2: ( rule__Gap__Bound_lowerAssignment_1 )
            // InternalAdeptness.g:2522:3: rule__Gap__Bound_lowerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Gap__Bound_lowerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGapAccess().getBound_lowerAssignment_1()); 

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
    // InternalAdeptness.g:2530:1: rule__Gap__Group__2 : rule__Gap__Group__2__Impl rule__Gap__Group__3 ;
    public final void rule__Gap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2534:1: ( rule__Gap__Group__2__Impl rule__Gap__Group__3 )
            // InternalAdeptness.g:2535:2: rule__Gap__Group__2__Impl rule__Gap__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalAdeptness.g:2542:1: rule__Gap__Group__2__Impl : ( 'and' ) ;
    public final void rule__Gap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2546:1: ( ( 'and' ) )
            // InternalAdeptness.g:2547:1: ( 'and' )
            {
            // InternalAdeptness.g:2547:1: ( 'and' )
            // InternalAdeptness.g:2548:2: 'and'
            {
             before(grammarAccess.getGapAccess().getAndKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGapAccess().getAndKeyword_2()); 

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
    // InternalAdeptness.g:2557:1: rule__Gap__Group__3 : rule__Gap__Group__3__Impl ;
    public final void rule__Gap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2561:1: ( rule__Gap__Group__3__Impl )
            // InternalAdeptness.g:2562:2: rule__Gap__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gap__Group__3__Impl();

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
    // InternalAdeptness.g:2568:1: rule__Gap__Group__3__Impl : ( ( rule__Gap__Bound_uppAssignment_3 ) ) ;
    public final void rule__Gap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2572:1: ( ( ( rule__Gap__Bound_uppAssignment_3 ) ) )
            // InternalAdeptness.g:2573:1: ( ( rule__Gap__Bound_uppAssignment_3 ) )
            {
            // InternalAdeptness.g:2573:1: ( ( rule__Gap__Bound_uppAssignment_3 ) )
            // InternalAdeptness.g:2574:2: ( rule__Gap__Bound_uppAssignment_3 )
            {
             before(grammarAccess.getGapAccess().getBound_uppAssignment_3()); 
            // InternalAdeptness.g:2575:2: ( rule__Gap__Bound_uppAssignment_3 )
            // InternalAdeptness.g:2575:3: rule__Gap__Bound_uppAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Gap__Bound_uppAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGapAccess().getBound_uppAssignment_3()); 

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


    // $ANTLR start "rule__D__Group__0"
    // InternalAdeptness.g:2584:1: rule__D__Group__0 : rule__D__Group__0__Impl rule__D__Group__1 ;
    public final void rule__D__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2588:1: ( rule__D__Group__0__Impl rule__D__Group__1 )
            // InternalAdeptness.g:2589:2: rule__D__Group__0__Impl rule__D__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAdeptness.g:2596:1: rule__D__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__D__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2600:1: ( ( ( '-' )? ) )
            // InternalAdeptness.g:2601:1: ( ( '-' )? )
            {
            // InternalAdeptness.g:2601:1: ( ( '-' )? )
            // InternalAdeptness.g:2602:2: ( '-' )?
            {
             before(grammarAccess.getDAccess().getHyphenMinusKeyword_0()); 
            // InternalAdeptness.g:2603:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAdeptness.g:2603:3: '-'
                    {
                    match(input,35,FOLLOW_2); 

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
    // InternalAdeptness.g:2611:1: rule__D__Group__1 : rule__D__Group__1__Impl rule__D__Group__2 ;
    public final void rule__D__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2615:1: ( rule__D__Group__1__Impl rule__D__Group__2 )
            // InternalAdeptness.g:2616:2: rule__D__Group__1__Impl rule__D__Group__2
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
    // InternalAdeptness.g:2623:1: rule__D__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__D__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2627:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:2628:1: ( RULE_INT )
            {
            // InternalAdeptness.g:2628:1: ( RULE_INT )
            // InternalAdeptness.g:2629:2: RULE_INT
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
    // InternalAdeptness.g:2638:1: rule__D__Group__2 : rule__D__Group__2__Impl ;
    public final void rule__D__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2642:1: ( rule__D__Group__2__Impl )
            // InternalAdeptness.g:2643:2: rule__D__Group__2__Impl
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
    // InternalAdeptness.g:2649:1: rule__D__Group__2__Impl : ( ( rule__D__Group_2__0 )? ) ;
    public final void rule__D__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2653:1: ( ( ( rule__D__Group_2__0 )? ) )
            // InternalAdeptness.g:2654:1: ( ( rule__D__Group_2__0 )? )
            {
            // InternalAdeptness.g:2654:1: ( ( rule__D__Group_2__0 )? )
            // InternalAdeptness.g:2655:2: ( rule__D__Group_2__0 )?
            {
             before(grammarAccess.getDAccess().getGroup_2()); 
            // InternalAdeptness.g:2656:2: ( rule__D__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAdeptness.g:2656:3: rule__D__Group_2__0
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
    // InternalAdeptness.g:2665:1: rule__D__Group_2__0 : rule__D__Group_2__0__Impl rule__D__Group_2__1 ;
    public final void rule__D__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2669:1: ( rule__D__Group_2__0__Impl rule__D__Group_2__1 )
            // InternalAdeptness.g:2670:2: rule__D__Group_2__0__Impl rule__D__Group_2__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdeptness.g:2677:1: rule__D__Group_2__0__Impl : ( '.' ) ;
    public final void rule__D__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2681:1: ( ( '.' ) )
            // InternalAdeptness.g:2682:1: ( '.' )
            {
            // InternalAdeptness.g:2682:1: ( '.' )
            // InternalAdeptness.g:2683:2: '.'
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
    // InternalAdeptness.g:2692:1: rule__D__Group_2__1 : rule__D__Group_2__1__Impl ;
    public final void rule__D__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2696:1: ( rule__D__Group_2__1__Impl )
            // InternalAdeptness.g:2697:2: rule__D__Group_2__1__Impl
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
    // InternalAdeptness.g:2703:1: rule__D__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__D__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2707:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:2708:1: ( RULE_INT )
            {
            // InternalAdeptness.g:2708:1: ( RULE_INT )
            // InternalAdeptness.g:2709:2: RULE_INT
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
    // InternalAdeptness.g:2719:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2723:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalAdeptness.g:2724:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
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
    // InternalAdeptness.g:2731:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2735:1: ( ( 'datatype' ) )
            // InternalAdeptness.g:2736:1: ( 'datatype' )
            {
            // InternalAdeptness.g:2736:1: ( 'datatype' )
            // InternalAdeptness.g:2737:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdeptness.g:2746:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2750:1: ( rule__DataType__Group__1__Impl )
            // InternalAdeptness.g:2751:2: rule__DataType__Group__1__Impl
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
    // InternalAdeptness.g:2757:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2761:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalAdeptness.g:2762:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:2762:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalAdeptness.g:2763:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:2764:2: ( rule__DataType__NameAssignment_1 )
            // InternalAdeptness.g:2764:3: rule__DataType__NameAssignment_1
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
    // InternalAdeptness.g:2773:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2777:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // InternalAdeptness.g:2778:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
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
    // InternalAdeptness.g:2785:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2789:1: ( ( 'package' ) )
            // InternalAdeptness.g:2790:1: ( 'package' )
            {
            // InternalAdeptness.g:2790:1: ( 'package' )
            // InternalAdeptness.g:2791:2: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdeptness.g:2800:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2804:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // InternalAdeptness.g:2805:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalAdeptness.g:2812:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2816:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // InternalAdeptness.g:2817:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:2817:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // InternalAdeptness.g:2818:2: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:2819:2: ( rule__PackageDeclaration__NameAssignment_1 )
            // InternalAdeptness.g:2819:3: rule__PackageDeclaration__NameAssignment_1
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
    // InternalAdeptness.g:2827:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2831:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // InternalAdeptness.g:2832:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalAdeptness.g:2839:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2843:1: ( ( '{' ) )
            // InternalAdeptness.g:2844:1: ( '{' )
            {
            // InternalAdeptness.g:2844:1: ( '{' )
            // InternalAdeptness.g:2845:2: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAdeptness.g:2854:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2858:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // InternalAdeptness.g:2859:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalAdeptness.g:2866:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2870:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) )
            // InternalAdeptness.g:2871:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            {
            // InternalAdeptness.g:2871:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            // InternalAdeptness.g:2872:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 
            // InternalAdeptness.g:2873:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13||LA15_0==16||(LA15_0>=36 && LA15_0<=37)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAdeptness.g:2873:3: rule__PackageDeclaration__ElementsAssignment_3
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
    // InternalAdeptness.g:2881:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2885:1: ( rule__PackageDeclaration__Group__4__Impl )
            // InternalAdeptness.g:2886:2: rule__PackageDeclaration__Group__4__Impl
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
    // InternalAdeptness.g:2892:1: rule__PackageDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2896:1: ( ( '}' ) )
            // InternalAdeptness.g:2897:1: ( '}' )
            {
            // InternalAdeptness.g:2897:1: ( '}' )
            // InternalAdeptness.g:2898:2: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,39,FOLLOW_2); 
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
    // InternalAdeptness.g:2908:1: rule__Adeptness__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Adeptness__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2912:1: ( ( ruleAbstractElement ) )
            // InternalAdeptness.g:2913:2: ( ruleAbstractElement )
            {
            // InternalAdeptness.g:2913:2: ( ruleAbstractElement )
            // InternalAdeptness.g:2914:3: ruleAbstractElement
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
    // InternalAdeptness.g:2923:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2927:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalAdeptness.g:2928:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalAdeptness.g:2928:2: ( ruleQualifiedNameWithWildcard )
            // InternalAdeptness.g:2929:3: ruleQualifiedNameWithWildcard
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
    // InternalAdeptness.g:2938:1: rule__Signal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2942:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:2943:2: ( RULE_ID )
            {
            // InternalAdeptness.g:2943:2: ( RULE_ID )
            // InternalAdeptness.g:2944:3: RULE_ID
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
    // InternalAdeptness.g:2953:1: rule__Signal__OracleAssignment_3 : ( ruleOracle ) ;
    public final void rule__Signal__OracleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2957:1: ( ( ruleOracle ) )
            // InternalAdeptness.g:2958:2: ( ruleOracle )
            {
            // InternalAdeptness.g:2958:2: ( ruleOracle )
            // InternalAdeptness.g:2959:3: ruleOracle
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
    // InternalAdeptness.g:2968:1: rule__Oracle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Oracle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2972:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:2973:2: ( RULE_ID )
            {
            // InternalAdeptness.g:2973:2: ( RULE_ID )
            // InternalAdeptness.g:2974:3: RULE_ID
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
    // InternalAdeptness.g:2983:1: rule__Oracle__CheckAssignment_3 : ( ruleChecks ) ;
    public final void rule__Oracle__CheckAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2987:1: ( ( ruleChecks ) )
            // InternalAdeptness.g:2988:2: ( ruleChecks )
            {
            // InternalAdeptness.g:2988:2: ( ruleChecks )
            // InternalAdeptness.g:2989:3: ruleChecks
            {
             before(grammarAccess.getOracleAccess().getCheckChecksParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleChecks();

            state._fsp--;

             after(grammarAccess.getOracleAccess().getCheckChecksParserRuleCall_3_0()); 

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


    // $ANTLR start "rule__Checks__NameAssignment_1"
    // InternalAdeptness.g:2998:1: rule__Checks__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Checks__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3002:1: ( ( RULE_STRING ) )
            // InternalAdeptness.g:3003:2: ( RULE_STRING )
            {
            // InternalAdeptness.g:3003:2: ( RULE_STRING )
            // InternalAdeptness.g:3004:3: RULE_STRING
            {
             before(grammarAccess.getChecksAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChecksAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Checks__NameAssignment_1"


    // $ANTLR start "rule__Checks__ReferenceAssignment_2"
    // InternalAdeptness.g:3013:1: rule__Checks__ReferenceAssignment_2 : ( ruleReference ) ;
    public final void rule__Checks__ReferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3017:1: ( ( ruleReference ) )
            // InternalAdeptness.g:3018:2: ( ruleReference )
            {
            // InternalAdeptness.g:3018:2: ( ruleReference )
            // InternalAdeptness.g:3019:3: ruleReference
            {
             before(grammarAccess.getChecksAccess().getReferenceReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getChecksAccess().getReferenceReferenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Checks__ReferenceAssignment_2"


    // $ANTLR start "rule__Checks__FailReasonAssignment_3"
    // InternalAdeptness.g:3028:1: rule__Checks__FailReasonAssignment_3 : ( ruleFailReason ) ;
    public final void rule__Checks__FailReasonAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3032:1: ( ( ruleFailReason ) )
            // InternalAdeptness.g:3033:2: ( ruleFailReason )
            {
            // InternalAdeptness.g:3033:2: ( ruleFailReason )
            // InternalAdeptness.g:3034:3: ruleFailReason
            {
             before(grammarAccess.getChecksAccess().getFailReasonFailReasonParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFailReason();

            state._fsp--;

             after(grammarAccess.getChecksAccess().getFailReasonFailReasonParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Checks__FailReasonAssignment_3"


    // $ANTLR start "rule__Checks__DescriptionAssignment_4"
    // InternalAdeptness.g:3043:1: rule__Checks__DescriptionAssignment_4 : ( ruleDescription ) ;
    public final void rule__Checks__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3047:1: ( ( ruleDescription ) )
            // InternalAdeptness.g:3048:2: ( ruleDescription )
            {
            // InternalAdeptness.g:3048:2: ( ruleDescription )
            // InternalAdeptness.g:3049:3: ruleDescription
            {
             before(grammarAccess.getChecksAccess().getDescriptionDescriptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getChecksAccess().getDescriptionDescriptionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Checks__DescriptionAssignment_4"


    // $ANTLR start "rule__Description__ValueAssignment_1"
    // InternalAdeptness.g:3058:1: rule__Description__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3062:1: ( ( RULE_STRING ) )
            // InternalAdeptness.g:3063:2: ( RULE_STRING )
            {
            // InternalAdeptness.g:3063:2: ( RULE_STRING )
            // InternalAdeptness.g:3064:3: RULE_STRING
            {
             before(grammarAccess.getDescriptionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getValueSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Description__ValueAssignment_1"


    // $ANTLR start "rule__FailReason__ReasonAssignment_1"
    // InternalAdeptness.g:3073:1: rule__FailReason__ReasonAssignment_1 : ( ruleReason ) ;
    public final void rule__FailReason__ReasonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3077:1: ( ( ruleReason ) )
            // InternalAdeptness.g:3078:2: ( ruleReason )
            {
            // InternalAdeptness.g:3078:2: ( ruleReason )
            // InternalAdeptness.g:3079:3: ruleReason
            {
             before(grammarAccess.getFailReasonAccess().getReasonReasonParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReason();

            state._fsp--;

             after(grammarAccess.getFailReasonAccess().getReasonReasonParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FailReason__ReasonAssignment_1"


    // $ANTLR start "rule__Reason__HighPeakAssignment_0_0"
    // InternalAdeptness.g:3088:1: rule__Reason__HighPeakAssignment_0_0 : ( ruleHighPeak ) ;
    public final void rule__Reason__HighPeakAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3092:1: ( ( ruleHighPeak ) )
            // InternalAdeptness.g:3093:2: ( ruleHighPeak )
            {
            // InternalAdeptness.g:3093:2: ( ruleHighPeak )
            // InternalAdeptness.g:3094:3: ruleHighPeak
            {
             before(grammarAccess.getReasonAccess().getHighPeakHighPeakParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHighPeak();

            state._fsp--;

             after(grammarAccess.getReasonAccess().getHighPeakHighPeakParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Reason__HighPeakAssignment_0_0"


    // $ANTLR start "rule__Reason__HighTimeAssignment_0_1"
    // InternalAdeptness.g:3103:1: rule__Reason__HighTimeAssignment_0_1 : ( ruleHighTime ) ;
    public final void rule__Reason__HighTimeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3107:1: ( ( ruleHighTime ) )
            // InternalAdeptness.g:3108:2: ( ruleHighTime )
            {
            // InternalAdeptness.g:3108:2: ( ruleHighTime )
            // InternalAdeptness.g:3109:3: ruleHighTime
            {
             before(grammarAccess.getReasonAccess().getHighTimeHighTimeParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHighTime();

            state._fsp--;

             after(grammarAccess.getReasonAccess().getHighTimeHighTimeParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Reason__HighTimeAssignment_0_1"


    // $ANTLR start "rule__Reason__ConstDegAssignment_0_2"
    // InternalAdeptness.g:3118:1: rule__Reason__ConstDegAssignment_0_2 : ( ruleConstDeg ) ;
    public final void rule__Reason__ConstDegAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3122:1: ( ( ruleConstDeg ) )
            // InternalAdeptness.g:3123:2: ( ruleConstDeg )
            {
            // InternalAdeptness.g:3123:2: ( ruleConstDeg )
            // InternalAdeptness.g:3124:3: ruleConstDeg
            {
             before(grammarAccess.getReasonAccess().getConstDegConstDegParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstDeg();

            state._fsp--;

             after(grammarAccess.getReasonAccess().getConstDegConstDegParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Reason__ConstDegAssignment_0_2"


    // $ANTLR start "rule__Reason__XPeaksAssignment_0_3"
    // InternalAdeptness.g:3133:1: rule__Reason__XPeaksAssignment_0_3 : ( ruleXPeaks ) ;
    public final void rule__Reason__XPeaksAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3137:1: ( ( ruleXPeaks ) )
            // InternalAdeptness.g:3138:2: ( ruleXPeaks )
            {
            // InternalAdeptness.g:3138:2: ( ruleXPeaks )
            // InternalAdeptness.g:3139:3: ruleXPeaks
            {
             before(grammarAccess.getReasonAccess().getXPeaksXPeaksParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleXPeaks();

            state._fsp--;

             after(grammarAccess.getReasonAccess().getXPeaksXPeaksParserRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__Reason__XPeaksAssignment_0_3"


    // $ANTLR start "rule__XPeaks__CantAssignment_1"
    // InternalAdeptness.g:3148:1: rule__XPeaks__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__XPeaks__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3152:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:3153:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:3153:2: ( ruleDOUBLE )
            // InternalAdeptness.g:3154:3: ruleDOUBLE
            {
             before(grammarAccess.getXPeaksAccess().getCantDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getXPeaksAccess().getCantDOUBLEParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__XPeaks__CantAssignment_1"


    // $ANTLR start "rule__XPeaks__NPeaksAssignment_3"
    // InternalAdeptness.g:3163:1: rule__XPeaks__NPeaksAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__XPeaks__NPeaksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3167:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:3168:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:3168:2: ( ruleDOUBLE )
            // InternalAdeptness.g:3169:3: ruleDOUBLE
            {
             before(grammarAccess.getXPeaksAccess().getNPeaksDOUBLEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getXPeaksAccess().getNPeaksDOUBLEParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__XPeaks__NPeaksAssignment_3"


    // $ANTLR start "rule__XPeaks__TimeAssignment_5"
    // InternalAdeptness.g:3178:1: rule__XPeaks__TimeAssignment_5 : ( RULE_INT ) ;
    public final void rule__XPeaks__TimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3182:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:3183:2: ( RULE_INT )
            {
            // InternalAdeptness.g:3183:2: ( RULE_INT )
            // InternalAdeptness.g:3184:3: RULE_INT
            {
             before(grammarAccess.getXPeaksAccess().getTimeINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getXPeaksAccess().getTimeINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__XPeaks__TimeAssignment_5"


    // $ANTLR start "rule__XPeaks__UnitAssignment_6"
    // InternalAdeptness.g:3193:1: rule__XPeaks__UnitAssignment_6 : ( ruleTimeType ) ;
    public final void rule__XPeaks__UnitAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3197:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:3198:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:3198:2: ( ruleTimeType )
            // InternalAdeptness.g:3199:3: ruleTimeType
            {
             before(grammarAccess.getXPeaksAccess().getUnitTimeTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeType();

            state._fsp--;

             after(grammarAccess.getXPeaksAccess().getUnitTimeTypeParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__XPeaks__UnitAssignment_6"


    // $ANTLR start "rule__ConstDeg__CantAssignment_1"
    // InternalAdeptness.g:3208:1: rule__ConstDeg__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__ConstDeg__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3212:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:3213:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:3213:2: ( ruleDOUBLE )
            // InternalAdeptness.g:3214:3: ruleDOUBLE
            {
             before(grammarAccess.getConstDegAccess().getCantDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getConstDegAccess().getCantDOUBLEParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ConstDeg__CantAssignment_1"


    // $ANTLR start "rule__HighTime__CantAssignment_1"
    // InternalAdeptness.g:3223:1: rule__HighTime__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__HighTime__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3227:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:3228:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:3228:2: ( ruleDOUBLE )
            // InternalAdeptness.g:3229:3: ruleDOUBLE
            {
             before(grammarAccess.getHighTimeAccess().getCantDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getHighTimeAccess().getCantDOUBLEParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__HighTime__CantAssignment_1"


    // $ANTLR start "rule__HighTime__TimeAssignment_3"
    // InternalAdeptness.g:3238:1: rule__HighTime__TimeAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__HighTime__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3242:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:3243:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:3243:2: ( ruleDOUBLE )
            // InternalAdeptness.g:3244:3: ruleDOUBLE
            {
             before(grammarAccess.getHighTimeAccess().getTimeDOUBLEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getHighTimeAccess().getTimeDOUBLEParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__HighTime__TimeAssignment_3"


    // $ANTLR start "rule__HighTime__UnitAssignment_4"
    // InternalAdeptness.g:3253:1: rule__HighTime__UnitAssignment_4 : ( ruleTimeType ) ;
    public final void rule__HighTime__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3257:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:3258:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:3258:2: ( ruleTimeType )
            // InternalAdeptness.g:3259:3: ruleTimeType
            {
             before(grammarAccess.getHighTimeAccess().getUnitTimeTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeType();

            state._fsp--;

             after(grammarAccess.getHighTimeAccess().getUnitTimeTypeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__HighTime__UnitAssignment_4"


    // $ANTLR start "rule__HighPeak__CantAssignment_1"
    // InternalAdeptness.g:3268:1: rule__HighPeak__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__HighPeak__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3272:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:3273:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:3273:2: ( ruleDOUBLE )
            // InternalAdeptness.g:3274:3: ruleDOUBLE
            {
             before(grammarAccess.getHighPeakAccess().getCantDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getHighPeakAccess().getCantDOUBLEParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__HighPeak__CantAssignment_1"


    // $ANTLR start "rule__Reference__UpperAssignment_0_0"
    // InternalAdeptness.g:3283:1: rule__Reference__UpperAssignment_0_0 : ( ruleUpper ) ;
    public final void rule__Reference__UpperAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3287:1: ( ( ruleUpper ) )
            // InternalAdeptness.g:3288:2: ( ruleUpper )
            {
            // InternalAdeptness.g:3288:2: ( ruleUpper )
            // InternalAdeptness.g:3289:3: ruleUpper
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
    // InternalAdeptness.g:3298:1: rule__Reference__LowerAssignment_0_1 : ( ruleLower ) ;
    public final void rule__Reference__LowerAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3302:1: ( ( ruleLower ) )
            // InternalAdeptness.g:3303:2: ( ruleLower )
            {
            // InternalAdeptness.g:3303:2: ( ruleLower )
            // InternalAdeptness.g:3304:3: ruleLower
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
    // InternalAdeptness.g:3313:1: rule__Reference__RangeAssignment_0_2 : ( ruleRange ) ;
    public final void rule__Reference__RangeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3317:1: ( ( ruleRange ) )
            // InternalAdeptness.g:3318:2: ( ruleRange )
            {
            // InternalAdeptness.g:3318:2: ( ruleRange )
            // InternalAdeptness.g:3319:3: ruleRange
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
    // InternalAdeptness.g:3328:1: rule__Reference__GapAssignment_0_3 : ( ruleGap ) ;
    public final void rule__Reference__GapAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3332:1: ( ( ruleGap ) )
            // InternalAdeptness.g:3333:2: ( ruleGap )
            {
            // InternalAdeptness.g:3333:2: ( ruleGap )
            // InternalAdeptness.g:3334:3: ruleGap
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


    // $ANTLR start "rule__Upper__Bound_uppAssignment_1"
    // InternalAdeptness.g:3343:1: rule__Upper__Bound_uppAssignment_1 : ( ruleBound_up ) ;
    public final void rule__Upper__Bound_uppAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3347:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:3348:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:3348:2: ( ruleBound_up )
            // InternalAdeptness.g:3349:3: ruleBound_up
            {
             before(grammarAccess.getUpperAccess().getBound_uppBound_upParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBound_up();

            state._fsp--;

             after(grammarAccess.getUpperAccess().getBound_uppBound_upParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Upper__Bound_uppAssignment_1"


    // $ANTLR start "rule__Lower__Bound_lowerAssignment_1"
    // InternalAdeptness.g:3358:1: rule__Lower__Bound_lowerAssignment_1 : ( ruleBound_Down ) ;
    public final void rule__Lower__Bound_lowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3362:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:3363:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:3363:2: ( ruleBound_Down )
            // InternalAdeptness.g:3364:3: ruleBound_Down
            {
             before(grammarAccess.getLowerAccess().getBound_lowerBound_DownParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBound_Down();

            state._fsp--;

             after(grammarAccess.getLowerAccess().getBound_lowerBound_DownParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Lower__Bound_lowerAssignment_1"


    // $ANTLR start "rule__Range__Bound_lowerAssignment_1"
    // InternalAdeptness.g:3373:1: rule__Range__Bound_lowerAssignment_1 : ( ruleBound_Down ) ;
    public final void rule__Range__Bound_lowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3377:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:3378:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:3378:2: ( ruleBound_Down )
            // InternalAdeptness.g:3379:3: ruleBound_Down
            {
             before(grammarAccess.getRangeAccess().getBound_lowerBound_DownParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBound_Down();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getBound_lowerBound_DownParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Range__Bound_lowerAssignment_1"


    // $ANTLR start "rule__Range__Bound_uppAssignment_3"
    // InternalAdeptness.g:3388:1: rule__Range__Bound_uppAssignment_3 : ( ruleBound_up ) ;
    public final void rule__Range__Bound_uppAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3392:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:3393:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:3393:2: ( ruleBound_up )
            // InternalAdeptness.g:3394:3: ruleBound_up
            {
             before(grammarAccess.getRangeAccess().getBound_uppBound_upParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBound_up();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getBound_uppBound_upParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Range__Bound_uppAssignment_3"


    // $ANTLR start "rule__Gap__Bound_lowerAssignment_1"
    // InternalAdeptness.g:3403:1: rule__Gap__Bound_lowerAssignment_1 : ( ruleBound_Down ) ;
    public final void rule__Gap__Bound_lowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3407:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:3408:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:3408:2: ( ruleBound_Down )
            // InternalAdeptness.g:3409:3: ruleBound_Down
            {
             before(grammarAccess.getGapAccess().getBound_lowerBound_DownParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBound_Down();

            state._fsp--;

             after(grammarAccess.getGapAccess().getBound_lowerBound_DownParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Gap__Bound_lowerAssignment_1"


    // $ANTLR start "rule__Gap__Bound_uppAssignment_3"
    // InternalAdeptness.g:3418:1: rule__Gap__Bound_uppAssignment_3 : ( ruleBound_up ) ;
    public final void rule__Gap__Bound_uppAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3422:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:3423:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:3423:2: ( ruleBound_up )
            // InternalAdeptness.g:3424:3: ruleBound_up
            {
             before(grammarAccess.getGapAccess().getBound_uppBound_upParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBound_up();

            state._fsp--;

             after(grammarAccess.getGapAccess().getBound_uppBound_upParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Gap__Bound_uppAssignment_3"


    // $ANTLR start "rule__Bound_up__ValueAssignment"
    // InternalAdeptness.g:3433:1: rule__Bound_up__ValueAssignment : ( ruleDOUBLE ) ;
    public final void rule__Bound_up__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3437:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:3438:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:3438:2: ( ruleDOUBLE )
            // InternalAdeptness.g:3439:3: ruleDOUBLE
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
    // InternalAdeptness.g:3448:1: rule__Bound_Down__ValueAssignment : ( ruleDOUBLE ) ;
    public final void rule__Bound_Down__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3452:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:3453:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:3453:2: ( ruleDOUBLE )
            // InternalAdeptness.g:3454:3: ruleDOUBLE
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
    // InternalAdeptness.g:3463:1: rule__BOOLEAN__BoolAssignment : ( ruleb ) ;
    public final void rule__BOOLEAN__BoolAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3467:1: ( ( ruleb ) )
            // InternalAdeptness.g:3468:2: ( ruleb )
            {
            // InternalAdeptness.g:3468:2: ( ruleb )
            // InternalAdeptness.g:3469:3: ruleb
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
    // InternalAdeptness.g:3478:1: rule__DOUBLE__DValAssignment : ( ruled ) ;
    public final void rule__DOUBLE__DValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3482:1: ( ( ruled ) )
            // InternalAdeptness.g:3483:2: ( ruled )
            {
            // InternalAdeptness.g:3483:2: ( ruled )
            // InternalAdeptness.g:3484:3: ruled
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


    // $ANTLR start "rule__TimeType__TimeAssignment_0"
    // InternalAdeptness.g:3493:1: rule__TimeType__TimeAssignment_0 : ( ( 'miliseconds' ) ) ;
    public final void rule__TimeType__TimeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3497:1: ( ( ( 'miliseconds' ) ) )
            // InternalAdeptness.g:3498:2: ( ( 'miliseconds' ) )
            {
            // InternalAdeptness.g:3498:2: ( ( 'miliseconds' ) )
            // InternalAdeptness.g:3499:3: ( 'miliseconds' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMilisecondsKeyword_0_0()); 
            // InternalAdeptness.g:3500:3: ( 'miliseconds' )
            // InternalAdeptness.g:3501:4: 'miliseconds'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMilisecondsKeyword_0_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTimeTypeAccess().getTimeMilisecondsKeyword_0_0()); 

            }

             after(grammarAccess.getTimeTypeAccess().getTimeMilisecondsKeyword_0_0()); 

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
    // $ANTLR end "rule__TimeType__TimeAssignment_0"


    // $ANTLR start "rule__TimeType__TimeAssignment_1"
    // InternalAdeptness.g:3512:1: rule__TimeType__TimeAssignment_1 : ( ( 'seconds' ) ) ;
    public final void rule__TimeType__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3516:1: ( ( ( 'seconds' ) ) )
            // InternalAdeptness.g:3517:2: ( ( 'seconds' ) )
            {
            // InternalAdeptness.g:3517:2: ( ( 'seconds' ) )
            // InternalAdeptness.g:3518:3: ( 'seconds' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeSecondsKeyword_1_0()); 
            // InternalAdeptness.g:3519:3: ( 'seconds' )
            // InternalAdeptness.g:3520:4: 'seconds'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeSecondsKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTimeTypeAccess().getTimeSecondsKeyword_1_0()); 

            }

             after(grammarAccess.getTimeTypeAccess().getTimeSecondsKeyword_1_0()); 

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
    // $ANTLR end "rule__TimeType__TimeAssignment_1"


    // $ANTLR start "rule__TimeType__TimeAssignment_2"
    // InternalAdeptness.g:3531:1: rule__TimeType__TimeAssignment_2 : ( ( 'minutes' ) ) ;
    public final void rule__TimeType__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3535:1: ( ( ( 'minutes' ) ) )
            // InternalAdeptness.g:3536:2: ( ( 'minutes' ) )
            {
            // InternalAdeptness.g:3536:2: ( ( 'minutes' ) )
            // InternalAdeptness.g:3537:3: ( 'minutes' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMinutesKeyword_2_0()); 
            // InternalAdeptness.g:3538:3: ( 'minutes' )
            // InternalAdeptness.g:3539:4: 'minutes'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMinutesKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTimeTypeAccess().getTimeMinutesKeyword_2_0()); 

            }

             after(grammarAccess.getTimeTypeAccess().getTimeMinutesKeyword_2_0()); 

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
    // $ANTLR end "rule__TimeType__TimeAssignment_2"


    // $ANTLR start "rule__TimeType__TimeAssignment_3"
    // InternalAdeptness.g:3550:1: rule__TimeType__TimeAssignment_3 : ( ( 'hours' ) ) ;
    public final void rule__TimeType__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3554:1: ( ( ( 'hours' ) ) )
            // InternalAdeptness.g:3555:2: ( ( 'hours' ) )
            {
            // InternalAdeptness.g:3555:2: ( ( 'hours' ) )
            // InternalAdeptness.g:3556:3: ( 'hours' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeHoursKeyword_3_0()); 
            // InternalAdeptness.g:3557:3: ( 'hours' )
            // InternalAdeptness.g:3558:4: 'hours'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeHoursKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTimeTypeAccess().getTimeHoursKeyword_3_0()); 

            }

             after(grammarAccess.getTimeTypeAccess().getTimeHoursKeyword_3_0()); 

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
    // $ANTLR end "rule__TimeType__TimeAssignment_3"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalAdeptness.g:3569:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3573:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:3574:2: ( RULE_ID )
            {
            // InternalAdeptness.g:3574:2: ( RULE_ID )
            // InternalAdeptness.g:3575:3: RULE_ID
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
    // InternalAdeptness.g:3584:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3588:1: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:3589:2: ( ruleQualifiedName )
            {
            // InternalAdeptness.g:3589:2: ( ruleQualifiedName )
            // InternalAdeptness.g:3590:3: ruleQualifiedName
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
    // InternalAdeptness.g:3599:1: rule__PackageDeclaration__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3603:1: ( ( ruleAbstractElement ) )
            // InternalAdeptness.g:3604:2: ( ruleAbstractElement )
            {
            // InternalAdeptness.g:3604:2: ( ruleAbstractElement )
            // InternalAdeptness.g:3605:3: ruleAbstractElement
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


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\31\1\5\1\uffff\1\5\1\17\1\5\3\uffff\1\30";
    static final String dfa_3s = "\1\34\1\43\1\uffff\1\5\1\35\1\5\3\uffff\1\35";
    static final String dfa_4s = "\2\uffff\1\3\3\uffff\1\1\1\2\1\4\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2",
            "\1\4\35\uffff\1\3",
            "",
            "\1\4",
            "\1\5\10\uffff\1\6\1\uffff\1\10\2\uffff\1\7",
            "\1\11",
            "",
            "",
            "",
            "\1\6\1\uffff\1\10\2\uffff\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "850:1: rule__Reason__Alternatives_0 : ( ( ( rule__Reason__HighPeakAssignment_0_0 ) ) | ( ( rule__Reason__HighTimeAssignment_0_1 ) ) | ( ( rule__Reason__ConstDegAssignment_0_2 ) ) | ( ( rule__Reason__XPeaksAssignment_0_3 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000003000012002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000005C0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000B000012000L});

}