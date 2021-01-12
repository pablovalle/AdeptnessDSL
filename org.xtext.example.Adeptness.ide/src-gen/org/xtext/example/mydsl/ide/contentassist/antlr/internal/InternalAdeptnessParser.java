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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'times'", "'true'", "'false'", "'=='", "'!='", "'>='", "'<='", "'<'", "'>'", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'import'", "'.*'", "'.'", "'VALIDATIONPLAN'", "':'", "'ENDVALIDATIONPLAN'", "'implements'", "'TEST'", "'SUT:'", "','", "'TestLevel:'", "'Inputs:'", "'ENDTEST'", "'TESTINGORACLE'", "'Type:'", "'Params:'", "'ENDTESTINGORACLE'", "'MONITORINGPLAN'", "'ENDMONITORINGPLAN'", "'MONITOR'", "'type'", "'ENDMONITOR'", "'max'", "'min'", "'CPS'", "'ENDCPS'", "'['", "']'", "'ORACLE'", "'ENDORACLE'", "'while:'", "'when:'", "'after('", "'during('", "'checks:'", "'Description: '", "'fails if :'", "';'", "'confidence is below'", "'more than'", "'times within'", "'confidence is in constant degradation'", "'within'", "'should be'", "'should not be'", "'is below'", "'is above'", "'is in range between'", "'and'", "'not in range between'", "'exactly'", "'times in'", "'at most'", "'at least'", "'datatype'", "'package'", "'{'", "'}'", "'boolean'", "'int'", "'double'", "'milliseconds'", "'seconds'", "'minutes'", "'hours'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

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

                if ( (LA1_0==28||LA1_0==31||LA1_0==45||LA1_0==52||(LA1_0>=82 && LA1_0<=83)) ) {
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


    // $ANTLR start "entryRuleImports"
    // InternalAdeptness.g:103:1: entryRuleImports : ruleImports EOF ;
    public final void entryRuleImports() throws RecognitionException {
        try {
            // InternalAdeptness.g:104:1: ( ruleImports EOF )
            // InternalAdeptness.g:105:1: ruleImports EOF
            {
             before(grammarAccess.getImportsRule()); 
            pushFollow(FOLLOW_1);
            ruleImports();

            state._fsp--;

             after(grammarAccess.getImportsRule()); 
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
    // $ANTLR end "entryRuleImports"


    // $ANTLR start "ruleImports"
    // InternalAdeptness.g:112:1: ruleImports : ( ( rule__Imports__Group__0 ) ) ;
    public final void ruleImports() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:116:2: ( ( ( rule__Imports__Group__0 ) ) )
            // InternalAdeptness.g:117:2: ( ( rule__Imports__Group__0 ) )
            {
            // InternalAdeptness.g:117:2: ( ( rule__Imports__Group__0 ) )
            // InternalAdeptness.g:118:3: ( rule__Imports__Group__0 )
            {
             before(grammarAccess.getImportsAccess().getGroup()); 
            // InternalAdeptness.g:119:3: ( rule__Imports__Group__0 )
            // InternalAdeptness.g:119:4: rule__Imports__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Imports__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImports"


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


    // $ANTLR start "entryRuleValidationPlan"
    // InternalAdeptness.g:203:1: entryRuleValidationPlan : ruleValidationPlan EOF ;
    public final void entryRuleValidationPlan() throws RecognitionException {
        try {
            // InternalAdeptness.g:204:1: ( ruleValidationPlan EOF )
            // InternalAdeptness.g:205:1: ruleValidationPlan EOF
            {
             before(grammarAccess.getValidationPlanRule()); 
            pushFollow(FOLLOW_1);
            ruleValidationPlan();

            state._fsp--;

             after(grammarAccess.getValidationPlanRule()); 
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
    // $ANTLR end "entryRuleValidationPlan"


    // $ANTLR start "ruleValidationPlan"
    // InternalAdeptness.g:212:1: ruleValidationPlan : ( ( rule__ValidationPlan__Group__0 ) ) ;
    public final void ruleValidationPlan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:216:2: ( ( ( rule__ValidationPlan__Group__0 ) ) )
            // InternalAdeptness.g:217:2: ( ( rule__ValidationPlan__Group__0 ) )
            {
            // InternalAdeptness.g:217:2: ( ( rule__ValidationPlan__Group__0 ) )
            // InternalAdeptness.g:218:3: ( rule__ValidationPlan__Group__0 )
            {
             before(grammarAccess.getValidationPlanAccess().getGroup()); 
            // InternalAdeptness.g:219:3: ( rule__ValidationPlan__Group__0 )
            // InternalAdeptness.g:219:4: rule__ValidationPlan__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ValidationPlan__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValidationPlanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidationPlan"


    // $ANTLR start "entryRuleTest"
    // InternalAdeptness.g:228:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // InternalAdeptness.g:229:1: ( ruleTest EOF )
            // InternalAdeptness.g:230:1: ruleTest EOF
            {
             before(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getTestRule()); 
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
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalAdeptness.g:237:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:241:2: ( ( ( rule__Test__Group__0 ) ) )
            // InternalAdeptness.g:242:2: ( ( rule__Test__Group__0 ) )
            {
            // InternalAdeptness.g:242:2: ( ( rule__Test__Group__0 ) )
            // InternalAdeptness.g:243:3: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // InternalAdeptness.g:244:3: ( rule__Test__Group__0 )
            // InternalAdeptness.g:244:4: rule__Test__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleTestingOracle"
    // InternalAdeptness.g:253:1: entryRuleTestingOracle : ruleTestingOracle EOF ;
    public final void entryRuleTestingOracle() throws RecognitionException {
        try {
            // InternalAdeptness.g:254:1: ( ruleTestingOracle EOF )
            // InternalAdeptness.g:255:1: ruleTestingOracle EOF
            {
             before(grammarAccess.getTestingOracleRule()); 
            pushFollow(FOLLOW_1);
            ruleTestingOracle();

            state._fsp--;

             after(grammarAccess.getTestingOracleRule()); 
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
    // $ANTLR end "entryRuleTestingOracle"


    // $ANTLR start "ruleTestingOracle"
    // InternalAdeptness.g:262:1: ruleTestingOracle : ( ( rule__TestingOracle__Group__0 ) ) ;
    public final void ruleTestingOracle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:266:2: ( ( ( rule__TestingOracle__Group__0 ) ) )
            // InternalAdeptness.g:267:2: ( ( rule__TestingOracle__Group__0 ) )
            {
            // InternalAdeptness.g:267:2: ( ( rule__TestingOracle__Group__0 ) )
            // InternalAdeptness.g:268:3: ( rule__TestingOracle__Group__0 )
            {
             before(grammarAccess.getTestingOracleAccess().getGroup()); 
            // InternalAdeptness.g:269:3: ( rule__TestingOracle__Group__0 )
            // InternalAdeptness.g:269:4: rule__TestingOracle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TestingOracle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestingOracleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTestingOracle"


    // $ANTLR start "entryRuleParameters"
    // InternalAdeptness.g:278:1: entryRuleParameters : ruleParameters EOF ;
    public final void entryRuleParameters() throws RecognitionException {
        try {
            // InternalAdeptness.g:279:1: ( ruleParameters EOF )
            // InternalAdeptness.g:280:1: ruleParameters EOF
            {
             before(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_1);
            ruleParameters();

            state._fsp--;

             after(grammarAccess.getParametersRule()); 
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
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalAdeptness.g:287:1: ruleParameters : ( ( rule__Parameters__Group__0 ) ) ;
    public final void ruleParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:291:2: ( ( ( rule__Parameters__Group__0 ) ) )
            // InternalAdeptness.g:292:2: ( ( rule__Parameters__Group__0 ) )
            {
            // InternalAdeptness.g:292:2: ( ( rule__Parameters__Group__0 ) )
            // InternalAdeptness.g:293:3: ( rule__Parameters__Group__0 )
            {
             before(grammarAccess.getParametersAccess().getGroup()); 
            // InternalAdeptness.g:294:3: ( rule__Parameters__Group__0 )
            // InternalAdeptness.g:294:4: rule__Parameters__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParametersAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleInputs"
    // InternalAdeptness.g:303:1: entryRuleInputs : ruleInputs EOF ;
    public final void entryRuleInputs() throws RecognitionException {
        try {
            // InternalAdeptness.g:304:1: ( ruleInputs EOF )
            // InternalAdeptness.g:305:1: ruleInputs EOF
            {
             before(grammarAccess.getInputsRule()); 
            pushFollow(FOLLOW_1);
            ruleInputs();

            state._fsp--;

             after(grammarAccess.getInputsRule()); 
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
    // $ANTLR end "entryRuleInputs"


    // $ANTLR start "ruleInputs"
    // InternalAdeptness.g:312:1: ruleInputs : ( ( rule__Inputs__Group__0 ) ) ;
    public final void ruleInputs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:316:2: ( ( ( rule__Inputs__Group__0 ) ) )
            // InternalAdeptness.g:317:2: ( ( rule__Inputs__Group__0 ) )
            {
            // InternalAdeptness.g:317:2: ( ( rule__Inputs__Group__0 ) )
            // InternalAdeptness.g:318:3: ( rule__Inputs__Group__0 )
            {
             before(grammarAccess.getInputsAccess().getGroup()); 
            // InternalAdeptness.g:319:3: ( rule__Inputs__Group__0 )
            // InternalAdeptness.g:319:4: rule__Inputs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inputs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputs"


    // $ANTLR start "entryRuleMonitoringFile"
    // InternalAdeptness.g:328:1: entryRuleMonitoringFile : ruleMonitoringFile EOF ;
    public final void entryRuleMonitoringFile() throws RecognitionException {
        try {
            // InternalAdeptness.g:329:1: ( ruleMonitoringFile EOF )
            // InternalAdeptness.g:330:1: ruleMonitoringFile EOF
            {
             before(grammarAccess.getMonitoringFileRule()); 
            pushFollow(FOLLOW_1);
            ruleMonitoringFile();

            state._fsp--;

             after(grammarAccess.getMonitoringFileRule()); 
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
    // $ANTLR end "entryRuleMonitoringFile"


    // $ANTLR start "ruleMonitoringFile"
    // InternalAdeptness.g:337:1: ruleMonitoringFile : ( ( rule__MonitoringFile__Group__0 ) ) ;
    public final void ruleMonitoringFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:341:2: ( ( ( rule__MonitoringFile__Group__0 ) ) )
            // InternalAdeptness.g:342:2: ( ( rule__MonitoringFile__Group__0 ) )
            {
            // InternalAdeptness.g:342:2: ( ( rule__MonitoringFile__Group__0 ) )
            // InternalAdeptness.g:343:3: ( rule__MonitoringFile__Group__0 )
            {
             before(grammarAccess.getMonitoringFileAccess().getGroup()); 
            // InternalAdeptness.g:344:3: ( rule__MonitoringFile__Group__0 )
            // InternalAdeptness.g:344:4: rule__MonitoringFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MonitoringFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMonitoringFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMonitoringFile"


    // $ANTLR start "entryRuleMonitoringPlan"
    // InternalAdeptness.g:353:1: entryRuleMonitoringPlan : ruleMonitoringPlan EOF ;
    public final void entryRuleMonitoringPlan() throws RecognitionException {
        try {
            // InternalAdeptness.g:354:1: ( ruleMonitoringPlan EOF )
            // InternalAdeptness.g:355:1: ruleMonitoringPlan EOF
            {
             before(grammarAccess.getMonitoringPlanRule()); 
            pushFollow(FOLLOW_1);
            ruleMonitoringPlan();

            state._fsp--;

             after(grammarAccess.getMonitoringPlanRule()); 
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
    // $ANTLR end "entryRuleMonitoringPlan"


    // $ANTLR start "ruleMonitoringPlan"
    // InternalAdeptness.g:362:1: ruleMonitoringPlan : ( ( rule__MonitoringPlan__MonitoringVariablesAssignment ) ) ;
    public final void ruleMonitoringPlan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:366:2: ( ( ( rule__MonitoringPlan__MonitoringVariablesAssignment ) ) )
            // InternalAdeptness.g:367:2: ( ( rule__MonitoringPlan__MonitoringVariablesAssignment ) )
            {
            // InternalAdeptness.g:367:2: ( ( rule__MonitoringPlan__MonitoringVariablesAssignment ) )
            // InternalAdeptness.g:368:3: ( rule__MonitoringPlan__MonitoringVariablesAssignment )
            {
             before(grammarAccess.getMonitoringPlanAccess().getMonitoringVariablesAssignment()); 
            // InternalAdeptness.g:369:3: ( rule__MonitoringPlan__MonitoringVariablesAssignment )
            // InternalAdeptness.g:369:4: rule__MonitoringPlan__MonitoringVariablesAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MonitoringPlan__MonitoringVariablesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMonitoringPlanAccess().getMonitoringVariablesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMonitoringPlan"


    // $ANTLR start "entryRuleMonitoringVariable"
    // InternalAdeptness.g:378:1: entryRuleMonitoringVariable : ruleMonitoringVariable EOF ;
    public final void entryRuleMonitoringVariable() throws RecognitionException {
        try {
            // InternalAdeptness.g:379:1: ( ruleMonitoringVariable EOF )
            // InternalAdeptness.g:380:1: ruleMonitoringVariable EOF
            {
             before(grammarAccess.getMonitoringVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleMonitoringVariable();

            state._fsp--;

             after(grammarAccess.getMonitoringVariableRule()); 
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
    // $ANTLR end "entryRuleMonitoringVariable"


    // $ANTLR start "ruleMonitoringVariable"
    // InternalAdeptness.g:387:1: ruleMonitoringVariable : ( ( rule__MonitoringVariable__Group__0 ) ) ;
    public final void ruleMonitoringVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:391:2: ( ( ( rule__MonitoringVariable__Group__0 ) ) )
            // InternalAdeptness.g:392:2: ( ( rule__MonitoringVariable__Group__0 ) )
            {
            // InternalAdeptness.g:392:2: ( ( rule__MonitoringVariable__Group__0 ) )
            // InternalAdeptness.g:393:3: ( rule__MonitoringVariable__Group__0 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getGroup()); 
            // InternalAdeptness.g:394:3: ( rule__MonitoringVariable__Group__0 )
            // InternalAdeptness.g:394:4: rule__MonitoringVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MonitoringVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMonitoringVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMonitoringVariable"


    // $ANTLR start "entryRuleSig_type"
    // InternalAdeptness.g:403:1: entryRuleSig_type : ruleSig_type EOF ;
    public final void entryRuleSig_type() throws RecognitionException {
        try {
            // InternalAdeptness.g:404:1: ( ruleSig_type EOF )
            // InternalAdeptness.g:405:1: ruleSig_type EOF
            {
             before(grammarAccess.getSig_typeRule()); 
            pushFollow(FOLLOW_1);
            ruleSig_type();

            state._fsp--;

             after(grammarAccess.getSig_typeRule()); 
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
    // $ANTLR end "entryRuleSig_type"


    // $ANTLR start "ruleSig_type"
    // InternalAdeptness.g:412:1: ruleSig_type : ( ( rule__Sig_type__Alternatives ) ) ;
    public final void ruleSig_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:416:2: ( ( ( rule__Sig_type__Alternatives ) ) )
            // InternalAdeptness.g:417:2: ( ( rule__Sig_type__Alternatives ) )
            {
            // InternalAdeptness.g:417:2: ( ( rule__Sig_type__Alternatives ) )
            // InternalAdeptness.g:418:3: ( rule__Sig_type__Alternatives )
            {
             before(grammarAccess.getSig_typeAccess().getAlternatives()); 
            // InternalAdeptness.g:419:3: ( rule__Sig_type__Alternatives )
            // InternalAdeptness.g:419:4: rule__Sig_type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sig_type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSig_typeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSig_type"


    // $ANTLR start "entryRuleSignal"
    // InternalAdeptness.g:428:1: entryRuleSignal : ruleSignal EOF ;
    public final void entryRuleSignal() throws RecognitionException {
        try {
            // InternalAdeptness.g:429:1: ( ruleSignal EOF )
            // InternalAdeptness.g:430:1: ruleSignal EOF
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
    // InternalAdeptness.g:437:1: ruleSignal : ( ( rule__Signal__Group__0 ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:441:2: ( ( ( rule__Signal__Group__0 ) ) )
            // InternalAdeptness.g:442:2: ( ( rule__Signal__Group__0 ) )
            {
            // InternalAdeptness.g:442:2: ( ( rule__Signal__Group__0 ) )
            // InternalAdeptness.g:443:3: ( rule__Signal__Group__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup()); 
            // InternalAdeptness.g:444:3: ( rule__Signal__Group__0 )
            // InternalAdeptness.g:444:4: rule__Signal__Group__0
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
    // InternalAdeptness.g:453:1: entryRuleOracle : ruleOracle EOF ;
    public final void entryRuleOracle() throws RecognitionException {
        try {
            // InternalAdeptness.g:454:1: ( ruleOracle EOF )
            // InternalAdeptness.g:455:1: ruleOracle EOF
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
    // InternalAdeptness.g:462:1: ruleOracle : ( ( rule__Oracle__Group__0 ) ) ;
    public final void ruleOracle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:466:2: ( ( ( rule__Oracle__Group__0 ) ) )
            // InternalAdeptness.g:467:2: ( ( rule__Oracle__Group__0 ) )
            {
            // InternalAdeptness.g:467:2: ( ( rule__Oracle__Group__0 ) )
            // InternalAdeptness.g:468:3: ( rule__Oracle__Group__0 )
            {
             before(grammarAccess.getOracleAccess().getGroup()); 
            // InternalAdeptness.g:469:3: ( rule__Oracle__Group__0 )
            // InternalAdeptness.g:469:4: rule__Oracle__Group__0
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


    // $ANTLR start "entryRuleWhile"
    // InternalAdeptness.g:478:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // InternalAdeptness.g:479:1: ( ruleWhile EOF )
            // InternalAdeptness.g:480:1: ruleWhile EOF
            {
             before(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_1);
            ruleWhile();

            state._fsp--;

             after(grammarAccess.getWhileRule()); 
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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalAdeptness.g:487:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:491:2: ( ( ( rule__While__Group__0 ) ) )
            // InternalAdeptness.g:492:2: ( ( rule__While__Group__0 ) )
            {
            // InternalAdeptness.g:492:2: ( ( rule__While__Group__0 ) )
            // InternalAdeptness.g:493:3: ( rule__While__Group__0 )
            {
             before(grammarAccess.getWhileAccess().getGroup()); 
            // InternalAdeptness.g:494:3: ( rule__While__Group__0 )
            // InternalAdeptness.g:494:4: rule__While__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__While__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleWhen"
    // InternalAdeptness.g:503:1: entryRuleWhen : ruleWhen EOF ;
    public final void entryRuleWhen() throws RecognitionException {
        try {
            // InternalAdeptness.g:504:1: ( ruleWhen EOF )
            // InternalAdeptness.g:505:1: ruleWhen EOF
            {
             before(grammarAccess.getWhenRule()); 
            pushFollow(FOLLOW_1);
            ruleWhen();

            state._fsp--;

             after(grammarAccess.getWhenRule()); 
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
    // $ANTLR end "entryRuleWhen"


    // $ANTLR start "ruleWhen"
    // InternalAdeptness.g:512:1: ruleWhen : ( ( rule__When__Group__0 ) ) ;
    public final void ruleWhen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:516:2: ( ( ( rule__When__Group__0 ) ) )
            // InternalAdeptness.g:517:2: ( ( rule__When__Group__0 ) )
            {
            // InternalAdeptness.g:517:2: ( ( rule__When__Group__0 ) )
            // InternalAdeptness.g:518:3: ( rule__When__Group__0 )
            {
             before(grammarAccess.getWhenAccess().getGroup()); 
            // InternalAdeptness.g:519:3: ( rule__When__Group__0 )
            // InternalAdeptness.g:519:4: rule__When__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__When__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleAfterWhen"
    // InternalAdeptness.g:528:1: entryRuleAfterWhen : ruleAfterWhen EOF ;
    public final void entryRuleAfterWhen() throws RecognitionException {
        try {
            // InternalAdeptness.g:529:1: ( ruleAfterWhen EOF )
            // InternalAdeptness.g:530:1: ruleAfterWhen EOF
            {
             before(grammarAccess.getAfterWhenRule()); 
            pushFollow(FOLLOW_1);
            ruleAfterWhen();

            state._fsp--;

             after(grammarAccess.getAfterWhenRule()); 
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
    // $ANTLR end "entryRuleAfterWhen"


    // $ANTLR start "ruleAfterWhen"
    // InternalAdeptness.g:537:1: ruleAfterWhen : ( ( rule__AfterWhen__Alternatives ) ) ;
    public final void ruleAfterWhen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:541:2: ( ( ( rule__AfterWhen__Alternatives ) ) )
            // InternalAdeptness.g:542:2: ( ( rule__AfterWhen__Alternatives ) )
            {
            // InternalAdeptness.g:542:2: ( ( rule__AfterWhen__Alternatives ) )
            // InternalAdeptness.g:543:3: ( rule__AfterWhen__Alternatives )
            {
             before(grammarAccess.getAfterWhenAccess().getAlternatives()); 
            // InternalAdeptness.g:544:3: ( rule__AfterWhen__Alternatives )
            // InternalAdeptness.g:544:4: rule__AfterWhen__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AfterWhen__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAfterWhenAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAfterWhen"


    // $ANTLR start "entryRuleWait"
    // InternalAdeptness.g:553:1: entryRuleWait : ruleWait EOF ;
    public final void entryRuleWait() throws RecognitionException {
        try {
            // InternalAdeptness.g:554:1: ( ruleWait EOF )
            // InternalAdeptness.g:555:1: ruleWait EOF
            {
             before(grammarAccess.getWaitRule()); 
            pushFollow(FOLLOW_1);
            ruleWait();

            state._fsp--;

             after(grammarAccess.getWaitRule()); 
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
    // $ANTLR end "entryRuleWait"


    // $ANTLR start "ruleWait"
    // InternalAdeptness.g:562:1: ruleWait : ( ( rule__Wait__Group__0 ) ) ;
    public final void ruleWait() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:566:2: ( ( ( rule__Wait__Group__0 ) ) )
            // InternalAdeptness.g:567:2: ( ( rule__Wait__Group__0 ) )
            {
            // InternalAdeptness.g:567:2: ( ( rule__Wait__Group__0 ) )
            // InternalAdeptness.g:568:3: ( rule__Wait__Group__0 )
            {
             before(grammarAccess.getWaitAccess().getGroup()); 
            // InternalAdeptness.g:569:3: ( rule__Wait__Group__0 )
            // InternalAdeptness.g:569:4: rule__Wait__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Wait__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWaitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWait"


    // $ANTLR start "entryRuleDuring"
    // InternalAdeptness.g:578:1: entryRuleDuring : ruleDuring EOF ;
    public final void entryRuleDuring() throws RecognitionException {
        try {
            // InternalAdeptness.g:579:1: ( ruleDuring EOF )
            // InternalAdeptness.g:580:1: ruleDuring EOF
            {
             before(grammarAccess.getDuringRule()); 
            pushFollow(FOLLOW_1);
            ruleDuring();

            state._fsp--;

             after(grammarAccess.getDuringRule()); 
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
    // $ANTLR end "entryRuleDuring"


    // $ANTLR start "ruleDuring"
    // InternalAdeptness.g:587:1: ruleDuring : ( ( rule__During__Group__0 ) ) ;
    public final void ruleDuring() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:591:2: ( ( ( rule__During__Group__0 ) ) )
            // InternalAdeptness.g:592:2: ( ( rule__During__Group__0 ) )
            {
            // InternalAdeptness.g:592:2: ( ( rule__During__Group__0 ) )
            // InternalAdeptness.g:593:3: ( rule__During__Group__0 )
            {
             before(grammarAccess.getDuringAccess().getGroup()); 
            // InternalAdeptness.g:594:3: ( rule__During__Group__0 )
            // InternalAdeptness.g:594:4: rule__During__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__During__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDuringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDuring"


    // $ANTLR start "entryRuleChecks"
    // InternalAdeptness.g:603:1: entryRuleChecks : ruleChecks EOF ;
    public final void entryRuleChecks() throws RecognitionException {
        try {
            // InternalAdeptness.g:604:1: ( ruleChecks EOF )
            // InternalAdeptness.g:605:1: ruleChecks EOF
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
    // InternalAdeptness.g:612:1: ruleChecks : ( ( rule__Checks__Group__0 ) ) ;
    public final void ruleChecks() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:616:2: ( ( ( rule__Checks__Group__0 ) ) )
            // InternalAdeptness.g:617:2: ( ( rule__Checks__Group__0 ) )
            {
            // InternalAdeptness.g:617:2: ( ( rule__Checks__Group__0 ) )
            // InternalAdeptness.g:618:3: ( rule__Checks__Group__0 )
            {
             before(grammarAccess.getChecksAccess().getGroup()); 
            // InternalAdeptness.g:619:3: ( rule__Checks__Group__0 )
            // InternalAdeptness.g:619:4: rule__Checks__Group__0
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
    // InternalAdeptness.g:628:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalAdeptness.g:629:1: ( ruleDescription EOF )
            // InternalAdeptness.g:630:1: ruleDescription EOF
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
    // InternalAdeptness.g:637:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:641:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalAdeptness.g:642:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalAdeptness.g:642:2: ( ( rule__Description__Group__0 ) )
            // InternalAdeptness.g:643:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalAdeptness.g:644:3: ( rule__Description__Group__0 )
            // InternalAdeptness.g:644:4: rule__Description__Group__0
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
    // InternalAdeptness.g:653:1: entryRuleFailReason : ruleFailReason EOF ;
    public final void entryRuleFailReason() throws RecognitionException {
        try {
            // InternalAdeptness.g:654:1: ( ruleFailReason EOF )
            // InternalAdeptness.g:655:1: ruleFailReason EOF
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
    // InternalAdeptness.g:662:1: ruleFailReason : ( ( rule__FailReason__Group__0 ) ) ;
    public final void ruleFailReason() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:666:2: ( ( ( rule__FailReason__Group__0 ) ) )
            // InternalAdeptness.g:667:2: ( ( rule__FailReason__Group__0 ) )
            {
            // InternalAdeptness.g:667:2: ( ( rule__FailReason__Group__0 ) )
            // InternalAdeptness.g:668:3: ( rule__FailReason__Group__0 )
            {
             before(grammarAccess.getFailReasonAccess().getGroup()); 
            // InternalAdeptness.g:669:3: ( rule__FailReason__Group__0 )
            // InternalAdeptness.g:669:4: rule__FailReason__Group__0
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
    // InternalAdeptness.g:678:1: entryRuleReason : ruleReason EOF ;
    public final void entryRuleReason() throws RecognitionException {
        try {
            // InternalAdeptness.g:679:1: ( ruleReason EOF )
            // InternalAdeptness.g:680:1: ruleReason EOF
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
    // InternalAdeptness.g:687:1: ruleReason : ( ( rule__Reason__Group__0 ) ) ;
    public final void ruleReason() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:691:2: ( ( ( rule__Reason__Group__0 ) ) )
            // InternalAdeptness.g:692:2: ( ( rule__Reason__Group__0 ) )
            {
            // InternalAdeptness.g:692:2: ( ( rule__Reason__Group__0 ) )
            // InternalAdeptness.g:693:3: ( rule__Reason__Group__0 )
            {
             before(grammarAccess.getReasonAccess().getGroup()); 
            // InternalAdeptness.g:694:3: ( rule__Reason__Group__0 )
            // InternalAdeptness.g:694:4: rule__Reason__Group__0
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
    // InternalAdeptness.g:703:1: entryRuleXPeaks : ruleXPeaks EOF ;
    public final void entryRuleXPeaks() throws RecognitionException {
        try {
            // InternalAdeptness.g:704:1: ( ruleXPeaks EOF )
            // InternalAdeptness.g:705:1: ruleXPeaks EOF
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
    // InternalAdeptness.g:712:1: ruleXPeaks : ( ( rule__XPeaks__Group__0 ) ) ;
    public final void ruleXPeaks() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:716:2: ( ( ( rule__XPeaks__Group__0 ) ) )
            // InternalAdeptness.g:717:2: ( ( rule__XPeaks__Group__0 ) )
            {
            // InternalAdeptness.g:717:2: ( ( rule__XPeaks__Group__0 ) )
            // InternalAdeptness.g:718:3: ( rule__XPeaks__Group__0 )
            {
             before(grammarAccess.getXPeaksAccess().getGroup()); 
            // InternalAdeptness.g:719:3: ( rule__XPeaks__Group__0 )
            // InternalAdeptness.g:719:4: rule__XPeaks__Group__0
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
    // InternalAdeptness.g:728:1: entryRuleConstDeg : ruleConstDeg EOF ;
    public final void entryRuleConstDeg() throws RecognitionException {
        try {
            // InternalAdeptness.g:729:1: ( ruleConstDeg EOF )
            // InternalAdeptness.g:730:1: ruleConstDeg EOF
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
    // InternalAdeptness.g:737:1: ruleConstDeg : ( ( rule__ConstDeg__Group__0 ) ) ;
    public final void ruleConstDeg() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:741:2: ( ( ( rule__ConstDeg__Group__0 ) ) )
            // InternalAdeptness.g:742:2: ( ( rule__ConstDeg__Group__0 ) )
            {
            // InternalAdeptness.g:742:2: ( ( rule__ConstDeg__Group__0 ) )
            // InternalAdeptness.g:743:3: ( rule__ConstDeg__Group__0 )
            {
             before(grammarAccess.getConstDegAccess().getGroup()); 
            // InternalAdeptness.g:744:3: ( rule__ConstDeg__Group__0 )
            // InternalAdeptness.g:744:4: rule__ConstDeg__Group__0
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
    // InternalAdeptness.g:753:1: entryRuleHighTime : ruleHighTime EOF ;
    public final void entryRuleHighTime() throws RecognitionException {
        try {
            // InternalAdeptness.g:754:1: ( ruleHighTime EOF )
            // InternalAdeptness.g:755:1: ruleHighTime EOF
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
    // InternalAdeptness.g:762:1: ruleHighTime : ( ( rule__HighTime__Group__0 ) ) ;
    public final void ruleHighTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:766:2: ( ( ( rule__HighTime__Group__0 ) ) )
            // InternalAdeptness.g:767:2: ( ( rule__HighTime__Group__0 ) )
            {
            // InternalAdeptness.g:767:2: ( ( rule__HighTime__Group__0 ) )
            // InternalAdeptness.g:768:3: ( rule__HighTime__Group__0 )
            {
             before(grammarAccess.getHighTimeAccess().getGroup()); 
            // InternalAdeptness.g:769:3: ( rule__HighTime__Group__0 )
            // InternalAdeptness.g:769:4: rule__HighTime__Group__0
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
    // InternalAdeptness.g:778:1: entryRuleHighPeak : ruleHighPeak EOF ;
    public final void entryRuleHighPeak() throws RecognitionException {
        try {
            // InternalAdeptness.g:779:1: ( ruleHighPeak EOF )
            // InternalAdeptness.g:780:1: ruleHighPeak EOF
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
    // InternalAdeptness.g:787:1: ruleHighPeak : ( ( rule__HighPeak__Group__0 ) ) ;
    public final void ruleHighPeak() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:791:2: ( ( ( rule__HighPeak__Group__0 ) ) )
            // InternalAdeptness.g:792:2: ( ( rule__HighPeak__Group__0 ) )
            {
            // InternalAdeptness.g:792:2: ( ( rule__HighPeak__Group__0 ) )
            // InternalAdeptness.g:793:3: ( rule__HighPeak__Group__0 )
            {
             before(grammarAccess.getHighPeakAccess().getGroup()); 
            // InternalAdeptness.g:794:3: ( rule__HighPeak__Group__0 )
            // InternalAdeptness.g:794:4: rule__HighPeak__Group__0
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
    // InternalAdeptness.g:803:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalAdeptness.g:804:1: ( ruleReference EOF )
            // InternalAdeptness.g:805:1: ruleReference EOF
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
    // InternalAdeptness.g:812:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:816:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalAdeptness.g:817:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalAdeptness.g:817:2: ( ( rule__Reference__Group__0 ) )
            // InternalAdeptness.g:818:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalAdeptness.g:819:3: ( rule__Reference__Group__0 )
            // InternalAdeptness.g:819:4: rule__Reference__Group__0
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


    // $ANTLR start "entryRuleSame"
    // InternalAdeptness.g:828:1: entryRuleSame : ruleSame EOF ;
    public final void entryRuleSame() throws RecognitionException {
        try {
            // InternalAdeptness.g:829:1: ( ruleSame EOF )
            // InternalAdeptness.g:830:1: ruleSame EOF
            {
             before(grammarAccess.getSameRule()); 
            pushFollow(FOLLOW_1);
            ruleSame();

            state._fsp--;

             after(grammarAccess.getSameRule()); 
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
    // $ANTLR end "entryRuleSame"


    // $ANTLR start "ruleSame"
    // InternalAdeptness.g:837:1: ruleSame : ( ( rule__Same__Group__0 ) ) ;
    public final void ruleSame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:841:2: ( ( ( rule__Same__Group__0 ) ) )
            // InternalAdeptness.g:842:2: ( ( rule__Same__Group__0 ) )
            {
            // InternalAdeptness.g:842:2: ( ( rule__Same__Group__0 ) )
            // InternalAdeptness.g:843:3: ( rule__Same__Group__0 )
            {
             before(grammarAccess.getSameAccess().getGroup()); 
            // InternalAdeptness.g:844:3: ( rule__Same__Group__0 )
            // InternalAdeptness.g:844:4: rule__Same__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Same__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSame"


    // $ANTLR start "entryRuleNotSame"
    // InternalAdeptness.g:853:1: entryRuleNotSame : ruleNotSame EOF ;
    public final void entryRuleNotSame() throws RecognitionException {
        try {
            // InternalAdeptness.g:854:1: ( ruleNotSame EOF )
            // InternalAdeptness.g:855:1: ruleNotSame EOF
            {
             before(grammarAccess.getNotSameRule()); 
            pushFollow(FOLLOW_1);
            ruleNotSame();

            state._fsp--;

             after(grammarAccess.getNotSameRule()); 
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
    // $ANTLR end "entryRuleNotSame"


    // $ANTLR start "ruleNotSame"
    // InternalAdeptness.g:862:1: ruleNotSame : ( ( rule__NotSame__Group__0 ) ) ;
    public final void ruleNotSame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:866:2: ( ( ( rule__NotSame__Group__0 ) ) )
            // InternalAdeptness.g:867:2: ( ( rule__NotSame__Group__0 ) )
            {
            // InternalAdeptness.g:867:2: ( ( rule__NotSame__Group__0 ) )
            // InternalAdeptness.g:868:3: ( rule__NotSame__Group__0 )
            {
             before(grammarAccess.getNotSameAccess().getGroup()); 
            // InternalAdeptness.g:869:3: ( rule__NotSame__Group__0 )
            // InternalAdeptness.g:869:4: rule__NotSame__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NotSame__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotSameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotSame"


    // $ANTLR start "entryRuleUpper"
    // InternalAdeptness.g:878:1: entryRuleUpper : ruleUpper EOF ;
    public final void entryRuleUpper() throws RecognitionException {
        try {
            // InternalAdeptness.g:879:1: ( ruleUpper EOF )
            // InternalAdeptness.g:880:1: ruleUpper EOF
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
    // InternalAdeptness.g:887:1: ruleUpper : ( ( rule__Upper__Group__0 ) ) ;
    public final void ruleUpper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:891:2: ( ( ( rule__Upper__Group__0 ) ) )
            // InternalAdeptness.g:892:2: ( ( rule__Upper__Group__0 ) )
            {
            // InternalAdeptness.g:892:2: ( ( rule__Upper__Group__0 ) )
            // InternalAdeptness.g:893:3: ( rule__Upper__Group__0 )
            {
             before(grammarAccess.getUpperAccess().getGroup()); 
            // InternalAdeptness.g:894:3: ( rule__Upper__Group__0 )
            // InternalAdeptness.g:894:4: rule__Upper__Group__0
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
    // InternalAdeptness.g:903:1: entryRuleLower : ruleLower EOF ;
    public final void entryRuleLower() throws RecognitionException {
        try {
            // InternalAdeptness.g:904:1: ( ruleLower EOF )
            // InternalAdeptness.g:905:1: ruleLower EOF
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
    // InternalAdeptness.g:912:1: ruleLower : ( ( rule__Lower__Group__0 ) ) ;
    public final void ruleLower() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:916:2: ( ( ( rule__Lower__Group__0 ) ) )
            // InternalAdeptness.g:917:2: ( ( rule__Lower__Group__0 ) )
            {
            // InternalAdeptness.g:917:2: ( ( rule__Lower__Group__0 ) )
            // InternalAdeptness.g:918:3: ( rule__Lower__Group__0 )
            {
             before(grammarAccess.getLowerAccess().getGroup()); 
            // InternalAdeptness.g:919:3: ( rule__Lower__Group__0 )
            // InternalAdeptness.g:919:4: rule__Lower__Group__0
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
    // InternalAdeptness.g:928:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // InternalAdeptness.g:929:1: ( ruleRange EOF )
            // InternalAdeptness.g:930:1: ruleRange EOF
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
    // InternalAdeptness.g:937:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:941:2: ( ( ( rule__Range__Group__0 ) ) )
            // InternalAdeptness.g:942:2: ( ( rule__Range__Group__0 ) )
            {
            // InternalAdeptness.g:942:2: ( ( rule__Range__Group__0 ) )
            // InternalAdeptness.g:943:3: ( rule__Range__Group__0 )
            {
             before(grammarAccess.getRangeAccess().getGroup()); 
            // InternalAdeptness.g:944:3: ( rule__Range__Group__0 )
            // InternalAdeptness.g:944:4: rule__Range__Group__0
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
    // InternalAdeptness.g:953:1: entryRuleGap : ruleGap EOF ;
    public final void entryRuleGap() throws RecognitionException {
        try {
            // InternalAdeptness.g:954:1: ( ruleGap EOF )
            // InternalAdeptness.g:955:1: ruleGap EOF
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
    // InternalAdeptness.g:962:1: ruleGap : ( ( rule__Gap__Group__0 ) ) ;
    public final void ruleGap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:966:2: ( ( ( rule__Gap__Group__0 ) ) )
            // InternalAdeptness.g:967:2: ( ( rule__Gap__Group__0 ) )
            {
            // InternalAdeptness.g:967:2: ( ( rule__Gap__Group__0 ) )
            // InternalAdeptness.g:968:3: ( rule__Gap__Group__0 )
            {
             before(grammarAccess.getGapAccess().getGroup()); 
            // InternalAdeptness.g:969:3: ( rule__Gap__Group__0 )
            // InternalAdeptness.g:969:4: rule__Gap__Group__0
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


    // $ANTLR start "entryRuleExactly"
    // InternalAdeptness.g:978:1: entryRuleExactly : ruleExactly EOF ;
    public final void entryRuleExactly() throws RecognitionException {
        try {
            // InternalAdeptness.g:979:1: ( ruleExactly EOF )
            // InternalAdeptness.g:980:1: ruleExactly EOF
            {
             before(grammarAccess.getExactlyRule()); 
            pushFollow(FOLLOW_1);
            ruleExactly();

            state._fsp--;

             after(grammarAccess.getExactlyRule()); 
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
    // $ANTLR end "entryRuleExactly"


    // $ANTLR start "ruleExactly"
    // InternalAdeptness.g:987:1: ruleExactly : ( ( rule__Exactly__Group__0 ) ) ;
    public final void ruleExactly() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:991:2: ( ( ( rule__Exactly__Group__0 ) ) )
            // InternalAdeptness.g:992:2: ( ( rule__Exactly__Group__0 ) )
            {
            // InternalAdeptness.g:992:2: ( ( rule__Exactly__Group__0 ) )
            // InternalAdeptness.g:993:3: ( rule__Exactly__Group__0 )
            {
             before(grammarAccess.getExactlyAccess().getGroup()); 
            // InternalAdeptness.g:994:3: ( rule__Exactly__Group__0 )
            // InternalAdeptness.g:994:4: rule__Exactly__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exactly__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExactlyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExactly"


    // $ANTLR start "entryRuleAt_most"
    // InternalAdeptness.g:1003:1: entryRuleAt_most : ruleAt_most EOF ;
    public final void entryRuleAt_most() throws RecognitionException {
        try {
            // InternalAdeptness.g:1004:1: ( ruleAt_most EOF )
            // InternalAdeptness.g:1005:1: ruleAt_most EOF
            {
             before(grammarAccess.getAt_mostRule()); 
            pushFollow(FOLLOW_1);
            ruleAt_most();

            state._fsp--;

             after(grammarAccess.getAt_mostRule()); 
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
    // $ANTLR end "entryRuleAt_most"


    // $ANTLR start "ruleAt_most"
    // InternalAdeptness.g:1012:1: ruleAt_most : ( ( rule__At_most__Group__0 ) ) ;
    public final void ruleAt_most() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1016:2: ( ( ( rule__At_most__Group__0 ) ) )
            // InternalAdeptness.g:1017:2: ( ( rule__At_most__Group__0 ) )
            {
            // InternalAdeptness.g:1017:2: ( ( rule__At_most__Group__0 ) )
            // InternalAdeptness.g:1018:3: ( rule__At_most__Group__0 )
            {
             before(grammarAccess.getAt_mostAccess().getGroup()); 
            // InternalAdeptness.g:1019:3: ( rule__At_most__Group__0 )
            // InternalAdeptness.g:1019:4: rule__At_most__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__At_most__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAt_mostAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAt_most"


    // $ANTLR start "entryRuleAt_least"
    // InternalAdeptness.g:1028:1: entryRuleAt_least : ruleAt_least EOF ;
    public final void entryRuleAt_least() throws RecognitionException {
        try {
            // InternalAdeptness.g:1029:1: ( ruleAt_least EOF )
            // InternalAdeptness.g:1030:1: ruleAt_least EOF
            {
             before(grammarAccess.getAt_leastRule()); 
            pushFollow(FOLLOW_1);
            ruleAt_least();

            state._fsp--;

             after(grammarAccess.getAt_leastRule()); 
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
    // $ANTLR end "entryRuleAt_least"


    // $ANTLR start "ruleAt_least"
    // InternalAdeptness.g:1037:1: ruleAt_least : ( ( rule__At_least__Group__0 ) ) ;
    public final void ruleAt_least() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1041:2: ( ( ( rule__At_least__Group__0 ) ) )
            // InternalAdeptness.g:1042:2: ( ( rule__At_least__Group__0 ) )
            {
            // InternalAdeptness.g:1042:2: ( ( rule__At_least__Group__0 ) )
            // InternalAdeptness.g:1043:3: ( rule__At_least__Group__0 )
            {
             before(grammarAccess.getAt_leastAccess().getGroup()); 
            // InternalAdeptness.g:1044:3: ( rule__At_least__Group__0 )
            // InternalAdeptness.g:1044:4: rule__At_least__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__At_least__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAt_leastAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAt_least"


    // $ANTLR start "entryRuleBound_up"
    // InternalAdeptness.g:1053:1: entryRuleBound_up : ruleBound_up EOF ;
    public final void entryRuleBound_up() throws RecognitionException {
        try {
            // InternalAdeptness.g:1054:1: ( ruleBound_up EOF )
            // InternalAdeptness.g:1055:1: ruleBound_up EOF
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
    // InternalAdeptness.g:1062:1: ruleBound_up : ( ( rule__Bound_up__Alternatives ) ) ;
    public final void ruleBound_up() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1066:2: ( ( ( rule__Bound_up__Alternatives ) ) )
            // InternalAdeptness.g:1067:2: ( ( rule__Bound_up__Alternatives ) )
            {
            // InternalAdeptness.g:1067:2: ( ( rule__Bound_up__Alternatives ) )
            // InternalAdeptness.g:1068:3: ( rule__Bound_up__Alternatives )
            {
             before(grammarAccess.getBound_upAccess().getAlternatives()); 
            // InternalAdeptness.g:1069:3: ( rule__Bound_up__Alternatives )
            // InternalAdeptness.g:1069:4: rule__Bound_up__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Bound_up__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBound_upAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalAdeptness.g:1078:1: entryRuleBound_Down : ruleBound_Down EOF ;
    public final void entryRuleBound_Down() throws RecognitionException {
        try {
            // InternalAdeptness.g:1079:1: ( ruleBound_Down EOF )
            // InternalAdeptness.g:1080:1: ruleBound_Down EOF
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
    // InternalAdeptness.g:1087:1: ruleBound_Down : ( ( rule__Bound_Down__Alternatives ) ) ;
    public final void ruleBound_Down() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1091:2: ( ( ( rule__Bound_Down__Alternatives ) ) )
            // InternalAdeptness.g:1092:2: ( ( rule__Bound_Down__Alternatives ) )
            {
            // InternalAdeptness.g:1092:2: ( ( rule__Bound_Down__Alternatives ) )
            // InternalAdeptness.g:1093:3: ( rule__Bound_Down__Alternatives )
            {
             before(grammarAccess.getBound_DownAccess().getAlternatives()); 
            // InternalAdeptness.g:1094:3: ( rule__Bound_Down__Alternatives )
            // InternalAdeptness.g:1094:4: rule__Bound_Down__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Bound_Down__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBound_DownAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalAdeptness.g:1103:1: entryRuleBOOLEAN : ruleBOOLEAN EOF ;
    public final void entryRuleBOOLEAN() throws RecognitionException {
        try {
            // InternalAdeptness.g:1104:1: ( ruleBOOLEAN EOF )
            // InternalAdeptness.g:1105:1: ruleBOOLEAN EOF
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
    // InternalAdeptness.g:1112:1: ruleBOOLEAN : ( ( rule__BOOLEAN__BoolAssignment ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1116:2: ( ( ( rule__BOOLEAN__BoolAssignment ) ) )
            // InternalAdeptness.g:1117:2: ( ( rule__BOOLEAN__BoolAssignment ) )
            {
            // InternalAdeptness.g:1117:2: ( ( rule__BOOLEAN__BoolAssignment ) )
            // InternalAdeptness.g:1118:3: ( rule__BOOLEAN__BoolAssignment )
            {
             before(grammarAccess.getBOOLEANAccess().getBoolAssignment()); 
            // InternalAdeptness.g:1119:3: ( rule__BOOLEAN__BoolAssignment )
            // InternalAdeptness.g:1119:4: rule__BOOLEAN__BoolAssignment
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
    // InternalAdeptness.g:1128:1: entryRuleb : ruleb EOF ;
    public final void entryRuleb() throws RecognitionException {
        try {
            // InternalAdeptness.g:1129:1: ( ruleb EOF )
            // InternalAdeptness.g:1130:1: ruleb EOF
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
    // InternalAdeptness.g:1137:1: ruleb : ( ( rule__B__Alternatives ) ) ;
    public final void ruleb() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1141:2: ( ( ( rule__B__Alternatives ) ) )
            // InternalAdeptness.g:1142:2: ( ( rule__B__Alternatives ) )
            {
            // InternalAdeptness.g:1142:2: ( ( rule__B__Alternatives ) )
            // InternalAdeptness.g:1143:3: ( rule__B__Alternatives )
            {
             before(grammarAccess.getBAccess().getAlternatives()); 
            // InternalAdeptness.g:1144:3: ( rule__B__Alternatives )
            // InternalAdeptness.g:1144:4: rule__B__Alternatives
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
    // InternalAdeptness.g:1153:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalAdeptness.g:1154:1: ( ruleDOUBLE EOF )
            // InternalAdeptness.g:1155:1: ruleDOUBLE EOF
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
    // InternalAdeptness.g:1162:1: ruleDOUBLE : ( ( rule__DOUBLE__DValAssignment ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1166:2: ( ( ( rule__DOUBLE__DValAssignment ) ) )
            // InternalAdeptness.g:1167:2: ( ( rule__DOUBLE__DValAssignment ) )
            {
            // InternalAdeptness.g:1167:2: ( ( rule__DOUBLE__DValAssignment ) )
            // InternalAdeptness.g:1168:3: ( rule__DOUBLE__DValAssignment )
            {
             before(grammarAccess.getDOUBLEAccess().getDValAssignment()); 
            // InternalAdeptness.g:1169:3: ( rule__DOUBLE__DValAssignment )
            // InternalAdeptness.g:1169:4: rule__DOUBLE__DValAssignment
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
    // InternalAdeptness.g:1178:1: entryRuled : ruled EOF ;
    public final void entryRuled() throws RecognitionException {
        try {
            // InternalAdeptness.g:1179:1: ( ruled EOF )
            // InternalAdeptness.g:1180:1: ruled EOF
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
    // InternalAdeptness.g:1187:1: ruled : ( ( rule__D__Group__0 ) ) ;
    public final void ruled() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1191:2: ( ( ( rule__D__Group__0 ) ) )
            // InternalAdeptness.g:1192:2: ( ( rule__D__Group__0 ) )
            {
            // InternalAdeptness.g:1192:2: ( ( rule__D__Group__0 ) )
            // InternalAdeptness.g:1193:3: ( rule__D__Group__0 )
            {
             before(grammarAccess.getDAccess().getGroup()); 
            // InternalAdeptness.g:1194:3: ( rule__D__Group__0 )
            // InternalAdeptness.g:1194:4: rule__D__Group__0
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
    // InternalAdeptness.g:1203:1: entryRuleTimeType : ruleTimeType EOF ;
    public final void entryRuleTimeType() throws RecognitionException {
        try {
            // InternalAdeptness.g:1204:1: ( ruleTimeType EOF )
            // InternalAdeptness.g:1205:1: ruleTimeType EOF
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
    // InternalAdeptness.g:1212:1: ruleTimeType : ( ( rule__TimeType__Alternatives ) ) ;
    public final void ruleTimeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1216:2: ( ( ( rule__TimeType__Alternatives ) ) )
            // InternalAdeptness.g:1217:2: ( ( rule__TimeType__Alternatives ) )
            {
            // InternalAdeptness.g:1217:2: ( ( rule__TimeType__Alternatives ) )
            // InternalAdeptness.g:1218:3: ( rule__TimeType__Alternatives )
            {
             before(grammarAccess.getTimeTypeAccess().getAlternatives()); 
            // InternalAdeptness.g:1219:3: ( rule__TimeType__Alternatives )
            // InternalAdeptness.g:1219:4: rule__TimeType__Alternatives
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
    // InternalAdeptness.g:1228:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalAdeptness.g:1229:1: ( ruleDataType EOF )
            // InternalAdeptness.g:1230:1: ruleDataType EOF
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
    // InternalAdeptness.g:1237:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1241:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalAdeptness.g:1242:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalAdeptness.g:1242:2: ( ( rule__DataType__Group__0 ) )
            // InternalAdeptness.g:1243:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalAdeptness.g:1244:3: ( rule__DataType__Group__0 )
            // InternalAdeptness.g:1244:4: rule__DataType__Group__0
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
    // InternalAdeptness.g:1253:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // InternalAdeptness.g:1254:1: ( rulePackageDeclaration EOF )
            // InternalAdeptness.g:1255:1: rulePackageDeclaration EOF
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
    // InternalAdeptness.g:1262:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1266:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // InternalAdeptness.g:1267:2: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // InternalAdeptness.g:1267:2: ( ( rule__PackageDeclaration__Group__0 ) )
            // InternalAdeptness.g:1268:3: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // InternalAdeptness.g:1269:3: ( rule__PackageDeclaration__Group__0 )
            // InternalAdeptness.g:1269:4: rule__PackageDeclaration__Group__0
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


    // $ANTLR start "entryRuleExpressionsModel"
    // InternalAdeptness.g:1278:1: entryRuleExpressionsModel : ruleExpressionsModel EOF ;
    public final void entryRuleExpressionsModel() throws RecognitionException {
        try {
            // InternalAdeptness.g:1279:1: ( ruleExpressionsModel EOF )
            // InternalAdeptness.g:1280:1: ruleExpressionsModel EOF
            {
             before(grammarAccess.getExpressionsModelRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionsModel();

            state._fsp--;

             after(grammarAccess.getExpressionsModelRule()); 
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
    // $ANTLR end "entryRuleExpressionsModel"


    // $ANTLR start "ruleExpressionsModel"
    // InternalAdeptness.g:1287:1: ruleExpressionsModel : ( ( rule__ExpressionsModel__ElementsAssignment )* ) ;
    public final void ruleExpressionsModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1291:2: ( ( ( rule__ExpressionsModel__ElementsAssignment )* ) )
            // InternalAdeptness.g:1292:2: ( ( rule__ExpressionsModel__ElementsAssignment )* )
            {
            // InternalAdeptness.g:1292:2: ( ( rule__ExpressionsModel__ElementsAssignment )* )
            // InternalAdeptness.g:1293:3: ( rule__ExpressionsModel__ElementsAssignment )*
            {
             before(grammarAccess.getExpressionsModelAccess().getElementsAssignment()); 
            // InternalAdeptness.g:1294:3: ( rule__ExpressionsModel__ElementsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_INT)||LA2_0==11||LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAdeptness.g:1294:4: rule__ExpressionsModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ExpressionsModel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getExpressionsModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionsModel"


    // $ANTLR start "entryRuleAbstractElement2"
    // InternalAdeptness.g:1303:1: entryRuleAbstractElement2 : ruleAbstractElement2 EOF ;
    public final void entryRuleAbstractElement2() throws RecognitionException {
        try {
            // InternalAdeptness.g:1304:1: ( ruleAbstractElement2 EOF )
            // InternalAdeptness.g:1305:1: ruleAbstractElement2 EOF
            {
             before(grammarAccess.getAbstractElement2Rule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement2();

            state._fsp--;

             after(grammarAccess.getAbstractElement2Rule()); 
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
    // $ANTLR end "entryRuleAbstractElement2"


    // $ANTLR start "ruleAbstractElement2"
    // InternalAdeptness.g:1312:1: ruleAbstractElement2 : ( ( rule__AbstractElement2__Group__0 ) ) ;
    public final void ruleAbstractElement2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1316:2: ( ( ( rule__AbstractElement2__Group__0 ) ) )
            // InternalAdeptness.g:1317:2: ( ( rule__AbstractElement2__Group__0 ) )
            {
            // InternalAdeptness.g:1317:2: ( ( rule__AbstractElement2__Group__0 ) )
            // InternalAdeptness.g:1318:3: ( rule__AbstractElement2__Group__0 )
            {
             before(grammarAccess.getAbstractElement2Access().getGroup()); 
            // InternalAdeptness.g:1319:3: ( rule__AbstractElement2__Group__0 )
            // InternalAdeptness.g:1319:4: rule__AbstractElement2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElement2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement2"


    // $ANTLR start "entryRuleFrontParentheses"
    // InternalAdeptness.g:1328:1: entryRuleFrontParentheses : ruleFrontParentheses EOF ;
    public final void entryRuleFrontParentheses() throws RecognitionException {
        try {
            // InternalAdeptness.g:1329:1: ( ruleFrontParentheses EOF )
            // InternalAdeptness.g:1330:1: ruleFrontParentheses EOF
            {
             before(grammarAccess.getFrontParenthesesRule()); 
            pushFollow(FOLLOW_1);
            ruleFrontParentheses();

            state._fsp--;

             after(grammarAccess.getFrontParenthesesRule()); 
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
    // $ANTLR end "entryRuleFrontParentheses"


    // $ANTLR start "ruleFrontParentheses"
    // InternalAdeptness.g:1337:1: ruleFrontParentheses : ( '(' ) ;
    public final void ruleFrontParentheses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1341:2: ( ( '(' ) )
            // InternalAdeptness.g:1342:2: ( '(' )
            {
            // InternalAdeptness.g:1342:2: ( '(' )
            // InternalAdeptness.g:1343:3: '('
            {
             before(grammarAccess.getFrontParenthesesAccess().getLeftParenthesisKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFrontParenthesesAccess().getLeftParenthesisKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrontParentheses"


    // $ANTLR start "entryRuleBackParentheses"
    // InternalAdeptness.g:1353:1: entryRuleBackParentheses : ruleBackParentheses EOF ;
    public final void entryRuleBackParentheses() throws RecognitionException {
        try {
            // InternalAdeptness.g:1354:1: ( ruleBackParentheses EOF )
            // InternalAdeptness.g:1355:1: ruleBackParentheses EOF
            {
             before(grammarAccess.getBackParenthesesRule()); 
            pushFollow(FOLLOW_1);
            ruleBackParentheses();

            state._fsp--;

             after(grammarAccess.getBackParenthesesRule()); 
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
    // $ANTLR end "entryRuleBackParentheses"


    // $ANTLR start "ruleBackParentheses"
    // InternalAdeptness.g:1362:1: ruleBackParentheses : ( ')' ) ;
    public final void ruleBackParentheses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1366:2: ( ( ')' ) )
            // InternalAdeptness.g:1367:2: ( ')' )
            {
            // InternalAdeptness.g:1367:2: ( ')' )
            // InternalAdeptness.g:1368:3: ')'
            {
             before(grammarAccess.getBackParenthesesAccess().getRightParenthesisKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBackParenthesesAccess().getRightParenthesisKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBackParentheses"


    // $ANTLR start "entryRuleOperators"
    // InternalAdeptness.g:1378:1: entryRuleOperators : ruleOperators EOF ;
    public final void entryRuleOperators() throws RecognitionException {
        try {
            // InternalAdeptness.g:1379:1: ( ruleOperators EOF )
            // InternalAdeptness.g:1380:1: ruleOperators EOF
            {
             before(grammarAccess.getOperatorsRule()); 
            pushFollow(FOLLOW_1);
            ruleOperators();

            state._fsp--;

             after(grammarAccess.getOperatorsRule()); 
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
    // $ANTLR end "entryRuleOperators"


    // $ANTLR start "ruleOperators"
    // InternalAdeptness.g:1387:1: ruleOperators : ( ( rule__Operators__Alternatives ) ) ;
    public final void ruleOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1391:2: ( ( ( rule__Operators__Alternatives ) ) )
            // InternalAdeptness.g:1392:2: ( ( rule__Operators__Alternatives ) )
            {
            // InternalAdeptness.g:1392:2: ( ( rule__Operators__Alternatives ) )
            // InternalAdeptness.g:1393:3: ( rule__Operators__Alternatives )
            {
             before(grammarAccess.getOperatorsAccess().getAlternatives()); 
            // InternalAdeptness.g:1394:3: ( rule__Operators__Alternatives )
            // InternalAdeptness.g:1394:4: rule__Operators__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operators__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperators"


    // $ANTLR start "entryRuleCompOp"
    // InternalAdeptness.g:1403:1: entryRuleCompOp : ruleCompOp EOF ;
    public final void entryRuleCompOp() throws RecognitionException {
        try {
            // InternalAdeptness.g:1404:1: ( ruleCompOp EOF )
            // InternalAdeptness.g:1405:1: ruleCompOp EOF
            {
             before(grammarAccess.getCompOpRule()); 
            pushFollow(FOLLOW_1);
            ruleCompOp();

            state._fsp--;

             after(grammarAccess.getCompOpRule()); 
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
    // $ANTLR end "entryRuleCompOp"


    // $ANTLR start "ruleCompOp"
    // InternalAdeptness.g:1412:1: ruleCompOp : ( ( rule__CompOp__OpAssignment ) ) ;
    public final void ruleCompOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1416:2: ( ( ( rule__CompOp__OpAssignment ) ) )
            // InternalAdeptness.g:1417:2: ( ( rule__CompOp__OpAssignment ) )
            {
            // InternalAdeptness.g:1417:2: ( ( rule__CompOp__OpAssignment ) )
            // InternalAdeptness.g:1418:3: ( rule__CompOp__OpAssignment )
            {
             before(grammarAccess.getCompOpAccess().getOpAssignment()); 
            // InternalAdeptness.g:1419:3: ( rule__CompOp__OpAssignment )
            // InternalAdeptness.g:1419:4: rule__CompOp__OpAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CompOp__OpAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCompOpAccess().getOpAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompOp"


    // $ANTLR start "entryRuleLogicOp"
    // InternalAdeptness.g:1428:1: entryRuleLogicOp : ruleLogicOp EOF ;
    public final void entryRuleLogicOp() throws RecognitionException {
        try {
            // InternalAdeptness.g:1429:1: ( ruleLogicOp EOF )
            // InternalAdeptness.g:1430:1: ruleLogicOp EOF
            {
             before(grammarAccess.getLogicOpRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicOp();

            state._fsp--;

             after(grammarAccess.getLogicOpRule()); 
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
    // $ANTLR end "entryRuleLogicOp"


    // $ANTLR start "ruleLogicOp"
    // InternalAdeptness.g:1437:1: ruleLogicOp : ( ( rule__LogicOp__OpAssignment ) ) ;
    public final void ruleLogicOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1441:2: ( ( ( rule__LogicOp__OpAssignment ) ) )
            // InternalAdeptness.g:1442:2: ( ( rule__LogicOp__OpAssignment ) )
            {
            // InternalAdeptness.g:1442:2: ( ( rule__LogicOp__OpAssignment ) )
            // InternalAdeptness.g:1443:3: ( rule__LogicOp__OpAssignment )
            {
             before(grammarAccess.getLogicOpAccess().getOpAssignment()); 
            // InternalAdeptness.g:1444:3: ( rule__LogicOp__OpAssignment )
            // InternalAdeptness.g:1444:4: rule__LogicOp__OpAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LogicOp__OpAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLogicOpAccess().getOpAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicOp"


    // $ANTLR start "entryRuleOp"
    // InternalAdeptness.g:1453:1: entryRuleOp : ruleOp EOF ;
    public final void entryRuleOp() throws RecognitionException {
        try {
            // InternalAdeptness.g:1454:1: ( ruleOp EOF )
            // InternalAdeptness.g:1455:1: ruleOp EOF
            {
             before(grammarAccess.getOpRule()); 
            pushFollow(FOLLOW_1);
            ruleOp();

            state._fsp--;

             after(grammarAccess.getOpRule()); 
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
    // $ANTLR end "entryRuleOp"


    // $ANTLR start "ruleOp"
    // InternalAdeptness.g:1462:1: ruleOp : ( ( rule__Op__OpAssignment ) ) ;
    public final void ruleOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1466:2: ( ( ( rule__Op__OpAssignment ) ) )
            // InternalAdeptness.g:1467:2: ( ( rule__Op__OpAssignment ) )
            {
            // InternalAdeptness.g:1467:2: ( ( rule__Op__OpAssignment ) )
            // InternalAdeptness.g:1468:3: ( rule__Op__OpAssignment )
            {
             before(grammarAccess.getOpAccess().getOpAssignment()); 
            // InternalAdeptness.g:1469:3: ( rule__Op__OpAssignment )
            // InternalAdeptness.g:1469:4: rule__Op__OpAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Op__OpAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOpAccess().getOpAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOp"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalAdeptness.g:1477:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImports ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1481:1: ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImports ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt3=1;
                }
                break;
            case 31:
            case 45:
            case 52:
            case 82:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAdeptness.g:1482:2: ( rulePackageDeclaration )
                    {
                    // InternalAdeptness.g:1482:2: ( rulePackageDeclaration )
                    // InternalAdeptness.g:1483:3: rulePackageDeclaration
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
                    // InternalAdeptness.g:1488:2: ( ruleType )
                    {
                    // InternalAdeptness.g:1488:2: ( ruleType )
                    // InternalAdeptness.g:1489:3: ruleType
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
                    // InternalAdeptness.g:1494:2: ( ruleImports )
                    {
                    // InternalAdeptness.g:1494:2: ( ruleImports )
                    // InternalAdeptness.g:1495:3: ruleImports
                    {
                     before(grammarAccess.getAbstractElementAccess().getImportsParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleImports();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getImportsParserRuleCall_2()); 

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
    // InternalAdeptness.g:1504:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleSignal ) | ( ruleMonitoringFile ) | ( ruleValidationPlan ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1508:1: ( ( ruleDataType ) | ( ruleSignal ) | ( ruleMonitoringFile ) | ( ruleValidationPlan ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt4=1;
                }
                break;
            case 52:
                {
                alt4=2;
                }
                break;
            case 45:
                {
                alt4=3;
                }
                break;
            case 31:
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
                    // InternalAdeptness.g:1509:2: ( ruleDataType )
                    {
                    // InternalAdeptness.g:1509:2: ( ruleDataType )
                    // InternalAdeptness.g:1510:3: ruleDataType
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
                    // InternalAdeptness.g:1515:2: ( ruleSignal )
                    {
                    // InternalAdeptness.g:1515:2: ( ruleSignal )
                    // InternalAdeptness.g:1516:3: ruleSignal
                    {
                     before(grammarAccess.getTypeAccess().getSignalParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSignal();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getSignalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1521:2: ( ruleMonitoringFile )
                    {
                    // InternalAdeptness.g:1521:2: ( ruleMonitoringFile )
                    // InternalAdeptness.g:1522:3: ruleMonitoringFile
                    {
                     before(grammarAccess.getTypeAccess().getMonitoringFileParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMonitoringFile();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getMonitoringFileParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:1527:2: ( ruleValidationPlan )
                    {
                    // InternalAdeptness.g:1527:2: ( ruleValidationPlan )
                    // InternalAdeptness.g:1528:3: ruleValidationPlan
                    {
                     before(grammarAccess.getTypeAccess().getValidationPlanParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleValidationPlan();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getValidationPlanParserRuleCall_3()); 

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


    // $ANTLR start "rule__Sig_type__Alternatives"
    // InternalAdeptness.g:1537:1: rule__Sig_type__Alternatives : ( ( ( rule__Sig_type__Sig_typeAssignment_0 ) ) | ( ( rule__Sig_type__Sig_typeAssignment_1 ) ) | ( ( rule__Sig_type__Sig_typeAssignment_2 ) ) );
    public final void rule__Sig_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1541:1: ( ( ( rule__Sig_type__Sig_typeAssignment_0 ) ) | ( ( rule__Sig_type__Sig_typeAssignment_1 ) ) | ( ( rule__Sig_type__Sig_typeAssignment_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt5=1;
                }
                break;
            case 87:
                {
                alt5=2;
                }
                break;
            case 88:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalAdeptness.g:1542:2: ( ( rule__Sig_type__Sig_typeAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1542:2: ( ( rule__Sig_type__Sig_typeAssignment_0 ) )
                    // InternalAdeptness.g:1543:3: ( rule__Sig_type__Sig_typeAssignment_0 )
                    {
                     before(grammarAccess.getSig_typeAccess().getSig_typeAssignment_0()); 
                    // InternalAdeptness.g:1544:3: ( rule__Sig_type__Sig_typeAssignment_0 )
                    // InternalAdeptness.g:1544:4: rule__Sig_type__Sig_typeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sig_type__Sig_typeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSig_typeAccess().getSig_typeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1548:2: ( ( rule__Sig_type__Sig_typeAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1548:2: ( ( rule__Sig_type__Sig_typeAssignment_1 ) )
                    // InternalAdeptness.g:1549:3: ( rule__Sig_type__Sig_typeAssignment_1 )
                    {
                     before(grammarAccess.getSig_typeAccess().getSig_typeAssignment_1()); 
                    // InternalAdeptness.g:1550:3: ( rule__Sig_type__Sig_typeAssignment_1 )
                    // InternalAdeptness.g:1550:4: rule__Sig_type__Sig_typeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sig_type__Sig_typeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSig_typeAccess().getSig_typeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1554:2: ( ( rule__Sig_type__Sig_typeAssignment_2 ) )
                    {
                    // InternalAdeptness.g:1554:2: ( ( rule__Sig_type__Sig_typeAssignment_2 ) )
                    // InternalAdeptness.g:1555:3: ( rule__Sig_type__Sig_typeAssignment_2 )
                    {
                     before(grammarAccess.getSig_typeAccess().getSig_typeAssignment_2()); 
                    // InternalAdeptness.g:1556:3: ( rule__Sig_type__Sig_typeAssignment_2 )
                    // InternalAdeptness.g:1556:4: rule__Sig_type__Sig_typeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sig_type__Sig_typeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSig_typeAccess().getSig_typeAssignment_2()); 

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
    // $ANTLR end "rule__Sig_type__Alternatives"


    // $ANTLR start "rule__Oracle__Alternatives_3"
    // InternalAdeptness.g:1564:1: rule__Oracle__Alternatives_3 : ( ( ( rule__Oracle__WhenAssignment_3_0 ) ) | ( ( rule__Oracle__WhileAssignment_3_1 ) ) );
    public final void rule__Oracle__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1568:1: ( ( ( rule__Oracle__WhenAssignment_3_0 ) ) | ( ( rule__Oracle__WhileAssignment_3_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==59) ) {
                alt6=1;
            }
            else if ( (LA6_0==58) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAdeptness.g:1569:2: ( ( rule__Oracle__WhenAssignment_3_0 ) )
                    {
                    // InternalAdeptness.g:1569:2: ( ( rule__Oracle__WhenAssignment_3_0 ) )
                    // InternalAdeptness.g:1570:3: ( rule__Oracle__WhenAssignment_3_0 )
                    {
                     before(grammarAccess.getOracleAccess().getWhenAssignment_3_0()); 
                    // InternalAdeptness.g:1571:3: ( rule__Oracle__WhenAssignment_3_0 )
                    // InternalAdeptness.g:1571:4: rule__Oracle__WhenAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Oracle__WhenAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOracleAccess().getWhenAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1575:2: ( ( rule__Oracle__WhileAssignment_3_1 ) )
                    {
                    // InternalAdeptness.g:1575:2: ( ( rule__Oracle__WhileAssignment_3_1 ) )
                    // InternalAdeptness.g:1576:3: ( rule__Oracle__WhileAssignment_3_1 )
                    {
                     before(grammarAccess.getOracleAccess().getWhileAssignment_3_1()); 
                    // InternalAdeptness.g:1577:3: ( rule__Oracle__WhileAssignment_3_1 )
                    // InternalAdeptness.g:1577:4: rule__Oracle__WhileAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Oracle__WhileAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOracleAccess().getWhileAssignment_3_1()); 

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
    // $ANTLR end "rule__Oracle__Alternatives_3"


    // $ANTLR start "rule__AfterWhen__Alternatives"
    // InternalAdeptness.g:1585:1: rule__AfterWhen__Alternatives : ( ( ( rule__AfterWhen__WaitAssignment_0 ) ) | ( ( rule__AfterWhen__DuringAssignment_1 ) ) );
    public final void rule__AfterWhen__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1589:1: ( ( ( rule__AfterWhen__WaitAssignment_0 ) ) | ( ( rule__AfterWhen__DuringAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==60) ) {
                alt7=1;
            }
            else if ( (LA7_0==61) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAdeptness.g:1590:2: ( ( rule__AfterWhen__WaitAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1590:2: ( ( rule__AfterWhen__WaitAssignment_0 ) )
                    // InternalAdeptness.g:1591:3: ( rule__AfterWhen__WaitAssignment_0 )
                    {
                     before(grammarAccess.getAfterWhenAccess().getWaitAssignment_0()); 
                    // InternalAdeptness.g:1592:3: ( rule__AfterWhen__WaitAssignment_0 )
                    // InternalAdeptness.g:1592:4: rule__AfterWhen__WaitAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AfterWhen__WaitAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAfterWhenAccess().getWaitAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1596:2: ( ( rule__AfterWhen__DuringAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1596:2: ( ( rule__AfterWhen__DuringAssignment_1 ) )
                    // InternalAdeptness.g:1597:3: ( rule__AfterWhen__DuringAssignment_1 )
                    {
                     before(grammarAccess.getAfterWhenAccess().getDuringAssignment_1()); 
                    // InternalAdeptness.g:1598:3: ( rule__AfterWhen__DuringAssignment_1 )
                    // InternalAdeptness.g:1598:4: rule__AfterWhen__DuringAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AfterWhen__DuringAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAfterWhenAccess().getDuringAssignment_1()); 

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
    // $ANTLR end "rule__AfterWhen__Alternatives"


    // $ANTLR start "rule__Checks__Alternatives_1"
    // InternalAdeptness.g:1606:1: rule__Checks__Alternatives_1 : ( ( ( rule__Checks__NameAssignment_1_0 ) ) | ( ( rule__Checks__EmAssignment_1_1 ) ) );
    public final void rule__Checks__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1610:1: ( ( ( rule__Checks__NameAssignment_1_0 ) ) | ( ( rule__Checks__EmAssignment_1_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT||LA8_0==11||LA8_0==25||(LA8_0>=71 && LA8_0<=75)||LA8_0==77) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAdeptness.g:1611:2: ( ( rule__Checks__NameAssignment_1_0 ) )
                    {
                    // InternalAdeptness.g:1611:2: ( ( rule__Checks__NameAssignment_1_0 ) )
                    // InternalAdeptness.g:1612:3: ( rule__Checks__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getChecksAccess().getNameAssignment_1_0()); 
                    // InternalAdeptness.g:1613:3: ( rule__Checks__NameAssignment_1_0 )
                    // InternalAdeptness.g:1613:4: rule__Checks__NameAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Checks__NameAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChecksAccess().getNameAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1617:2: ( ( rule__Checks__EmAssignment_1_1 ) )
                    {
                    // InternalAdeptness.g:1617:2: ( ( rule__Checks__EmAssignment_1_1 ) )
                    // InternalAdeptness.g:1618:3: ( rule__Checks__EmAssignment_1_1 )
                    {
                     before(grammarAccess.getChecksAccess().getEmAssignment_1_1()); 
                    // InternalAdeptness.g:1619:3: ( rule__Checks__EmAssignment_1_1 )
                    // InternalAdeptness.g:1619:4: rule__Checks__EmAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Checks__EmAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getChecksAccess().getEmAssignment_1_1()); 

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
    // $ANTLR end "rule__Checks__Alternatives_1"


    // $ANTLR start "rule__Reason__Alternatives_0"
    // InternalAdeptness.g:1627:1: rule__Reason__Alternatives_0 : ( ( ( rule__Reason__HighPeakAssignment_0_0 ) ) | ( ( rule__Reason__HighTimeAssignment_0_1 ) ) | ( ( rule__Reason__ConstDegAssignment_0_2 ) ) | ( ( rule__Reason__XPeaksAssignment_0_3 ) ) );
    public final void rule__Reason__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1631:1: ( ( ( rule__Reason__HighPeakAssignment_0_0 ) ) | ( ( rule__Reason__HighTimeAssignment_0_1 ) ) | ( ( rule__Reason__ConstDegAssignment_0_2 ) ) | ( ( rule__Reason__XPeaksAssignment_0_3 ) ) )
            int alt9=4;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalAdeptness.g:1632:2: ( ( rule__Reason__HighPeakAssignment_0_0 ) )
                    {
                    // InternalAdeptness.g:1632:2: ( ( rule__Reason__HighPeakAssignment_0_0 ) )
                    // InternalAdeptness.g:1633:3: ( rule__Reason__HighPeakAssignment_0_0 )
                    {
                     before(grammarAccess.getReasonAccess().getHighPeakAssignment_0_0()); 
                    // InternalAdeptness.g:1634:3: ( rule__Reason__HighPeakAssignment_0_0 )
                    // InternalAdeptness.g:1634:4: rule__Reason__HighPeakAssignment_0_0
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
                    // InternalAdeptness.g:1638:2: ( ( rule__Reason__HighTimeAssignment_0_1 ) )
                    {
                    // InternalAdeptness.g:1638:2: ( ( rule__Reason__HighTimeAssignment_0_1 ) )
                    // InternalAdeptness.g:1639:3: ( rule__Reason__HighTimeAssignment_0_1 )
                    {
                     before(grammarAccess.getReasonAccess().getHighTimeAssignment_0_1()); 
                    // InternalAdeptness.g:1640:3: ( rule__Reason__HighTimeAssignment_0_1 )
                    // InternalAdeptness.g:1640:4: rule__Reason__HighTimeAssignment_0_1
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
                    // InternalAdeptness.g:1644:2: ( ( rule__Reason__ConstDegAssignment_0_2 ) )
                    {
                    // InternalAdeptness.g:1644:2: ( ( rule__Reason__ConstDegAssignment_0_2 ) )
                    // InternalAdeptness.g:1645:3: ( rule__Reason__ConstDegAssignment_0_2 )
                    {
                     before(grammarAccess.getReasonAccess().getConstDegAssignment_0_2()); 
                    // InternalAdeptness.g:1646:3: ( rule__Reason__ConstDegAssignment_0_2 )
                    // InternalAdeptness.g:1646:4: rule__Reason__ConstDegAssignment_0_2
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
                    // InternalAdeptness.g:1650:2: ( ( rule__Reason__XPeaksAssignment_0_3 ) )
                    {
                    // InternalAdeptness.g:1650:2: ( ( rule__Reason__XPeaksAssignment_0_3 ) )
                    // InternalAdeptness.g:1651:3: ( rule__Reason__XPeaksAssignment_0_3 )
                    {
                     before(grammarAccess.getReasonAccess().getXPeaksAssignment_0_3()); 
                    // InternalAdeptness.g:1652:3: ( rule__Reason__XPeaksAssignment_0_3 )
                    // InternalAdeptness.g:1652:4: rule__Reason__XPeaksAssignment_0_3
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
    // InternalAdeptness.g:1660:1: rule__Reference__Alternatives_0 : ( ( ( rule__Reference__UpperAssignment_0_0 ) ) | ( ( rule__Reference__LowerAssignment_0_1 ) ) | ( ( rule__Reference__RangeAssignment_0_2 ) ) | ( ( rule__Reference__GapAssignment_0_3 ) ) | ( ( rule__Reference__SameAssignment_0_4 ) ) | ( ( rule__Reference__NotsameAssignment_0_5 ) ) );
    public final void rule__Reference__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1664:1: ( ( ( rule__Reference__UpperAssignment_0_0 ) ) | ( ( rule__Reference__LowerAssignment_0_1 ) ) | ( ( rule__Reference__RangeAssignment_0_2 ) ) | ( ( rule__Reference__GapAssignment_0_3 ) ) | ( ( rule__Reference__SameAssignment_0_4 ) ) | ( ( rule__Reference__NotsameAssignment_0_5 ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt10=1;
                }
                break;
            case 74:
                {
                alt10=2;
                }
                break;
            case 75:
                {
                alt10=3;
                }
                break;
            case 77:
                {
                alt10=4;
                }
                break;
            case 71:
                {
                alt10=5;
                }
                break;
            case 72:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalAdeptness.g:1665:2: ( ( rule__Reference__UpperAssignment_0_0 ) )
                    {
                    // InternalAdeptness.g:1665:2: ( ( rule__Reference__UpperAssignment_0_0 ) )
                    // InternalAdeptness.g:1666:3: ( rule__Reference__UpperAssignment_0_0 )
                    {
                     before(grammarAccess.getReferenceAccess().getUpperAssignment_0_0()); 
                    // InternalAdeptness.g:1667:3: ( rule__Reference__UpperAssignment_0_0 )
                    // InternalAdeptness.g:1667:4: rule__Reference__UpperAssignment_0_0
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
                    // InternalAdeptness.g:1671:2: ( ( rule__Reference__LowerAssignment_0_1 ) )
                    {
                    // InternalAdeptness.g:1671:2: ( ( rule__Reference__LowerAssignment_0_1 ) )
                    // InternalAdeptness.g:1672:3: ( rule__Reference__LowerAssignment_0_1 )
                    {
                     before(grammarAccess.getReferenceAccess().getLowerAssignment_0_1()); 
                    // InternalAdeptness.g:1673:3: ( rule__Reference__LowerAssignment_0_1 )
                    // InternalAdeptness.g:1673:4: rule__Reference__LowerAssignment_0_1
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
                    // InternalAdeptness.g:1677:2: ( ( rule__Reference__RangeAssignment_0_2 ) )
                    {
                    // InternalAdeptness.g:1677:2: ( ( rule__Reference__RangeAssignment_0_2 ) )
                    // InternalAdeptness.g:1678:3: ( rule__Reference__RangeAssignment_0_2 )
                    {
                     before(grammarAccess.getReferenceAccess().getRangeAssignment_0_2()); 
                    // InternalAdeptness.g:1679:3: ( rule__Reference__RangeAssignment_0_2 )
                    // InternalAdeptness.g:1679:4: rule__Reference__RangeAssignment_0_2
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
                    // InternalAdeptness.g:1683:2: ( ( rule__Reference__GapAssignment_0_3 ) )
                    {
                    // InternalAdeptness.g:1683:2: ( ( rule__Reference__GapAssignment_0_3 ) )
                    // InternalAdeptness.g:1684:3: ( rule__Reference__GapAssignment_0_3 )
                    {
                     before(grammarAccess.getReferenceAccess().getGapAssignment_0_3()); 
                    // InternalAdeptness.g:1685:3: ( rule__Reference__GapAssignment_0_3 )
                    // InternalAdeptness.g:1685:4: rule__Reference__GapAssignment_0_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__GapAssignment_0_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceAccess().getGapAssignment_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAdeptness.g:1689:2: ( ( rule__Reference__SameAssignment_0_4 ) )
                    {
                    // InternalAdeptness.g:1689:2: ( ( rule__Reference__SameAssignment_0_4 ) )
                    // InternalAdeptness.g:1690:3: ( rule__Reference__SameAssignment_0_4 )
                    {
                     before(grammarAccess.getReferenceAccess().getSameAssignment_0_4()); 
                    // InternalAdeptness.g:1691:3: ( rule__Reference__SameAssignment_0_4 )
                    // InternalAdeptness.g:1691:4: rule__Reference__SameAssignment_0_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__SameAssignment_0_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceAccess().getSameAssignment_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAdeptness.g:1695:2: ( ( rule__Reference__NotsameAssignment_0_5 ) )
                    {
                    // InternalAdeptness.g:1695:2: ( ( rule__Reference__NotsameAssignment_0_5 ) )
                    // InternalAdeptness.g:1696:3: ( rule__Reference__NotsameAssignment_0_5 )
                    {
                     before(grammarAccess.getReferenceAccess().getNotsameAssignment_0_5()); 
                    // InternalAdeptness.g:1697:3: ( rule__Reference__NotsameAssignment_0_5 )
                    // InternalAdeptness.g:1697:4: rule__Reference__NotsameAssignment_0_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__NotsameAssignment_0_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceAccess().getNotsameAssignment_0_5()); 

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


    // $ANTLR start "rule__Same__Alternatives_2"
    // InternalAdeptness.g:1705:1: rule__Same__Alternatives_2 : ( ( ( rule__Same__ExactlyAssignment_2_0 ) ) | ( ( rule__Same__AtmostAssignment_2_1 ) ) | ( ( rule__Same__AtleastAssignment_2_2 ) ) );
    public final void rule__Same__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1709:1: ( ( ( rule__Same__ExactlyAssignment_2_0 ) ) | ( ( rule__Same__AtmostAssignment_2_1 ) ) | ( ( rule__Same__AtleastAssignment_2_2 ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt11=1;
                }
                break;
            case 80:
                {
                alt11=2;
                }
                break;
            case 81:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalAdeptness.g:1710:2: ( ( rule__Same__ExactlyAssignment_2_0 ) )
                    {
                    // InternalAdeptness.g:1710:2: ( ( rule__Same__ExactlyAssignment_2_0 ) )
                    // InternalAdeptness.g:1711:3: ( rule__Same__ExactlyAssignment_2_0 )
                    {
                     before(grammarAccess.getSameAccess().getExactlyAssignment_2_0()); 
                    // InternalAdeptness.g:1712:3: ( rule__Same__ExactlyAssignment_2_0 )
                    // InternalAdeptness.g:1712:4: rule__Same__ExactlyAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Same__ExactlyAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSameAccess().getExactlyAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1716:2: ( ( rule__Same__AtmostAssignment_2_1 ) )
                    {
                    // InternalAdeptness.g:1716:2: ( ( rule__Same__AtmostAssignment_2_1 ) )
                    // InternalAdeptness.g:1717:3: ( rule__Same__AtmostAssignment_2_1 )
                    {
                     before(grammarAccess.getSameAccess().getAtmostAssignment_2_1()); 
                    // InternalAdeptness.g:1718:3: ( rule__Same__AtmostAssignment_2_1 )
                    // InternalAdeptness.g:1718:4: rule__Same__AtmostAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Same__AtmostAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSameAccess().getAtmostAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1722:2: ( ( rule__Same__AtleastAssignment_2_2 ) )
                    {
                    // InternalAdeptness.g:1722:2: ( ( rule__Same__AtleastAssignment_2_2 ) )
                    // InternalAdeptness.g:1723:3: ( rule__Same__AtleastAssignment_2_2 )
                    {
                     before(grammarAccess.getSameAccess().getAtleastAssignment_2_2()); 
                    // InternalAdeptness.g:1724:3: ( rule__Same__AtleastAssignment_2_2 )
                    // InternalAdeptness.g:1724:4: rule__Same__AtleastAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Same__AtleastAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSameAccess().getAtleastAssignment_2_2()); 

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
    // $ANTLR end "rule__Same__Alternatives_2"


    // $ANTLR start "rule__NotSame__Alternatives_2"
    // InternalAdeptness.g:1732:1: rule__NotSame__Alternatives_2 : ( ( ( rule__NotSame__ExactlyAssignment_2_0 ) ) | ( ( rule__NotSame__AtmostAssignment_2_1 ) ) | ( ( rule__NotSame__AtleastAssignment_2_2 ) ) );
    public final void rule__NotSame__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1736:1: ( ( ( rule__NotSame__ExactlyAssignment_2_0 ) ) | ( ( rule__NotSame__AtmostAssignment_2_1 ) ) | ( ( rule__NotSame__AtleastAssignment_2_2 ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt12=1;
                }
                break;
            case 80:
                {
                alt12=2;
                }
                break;
            case 81:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalAdeptness.g:1737:2: ( ( rule__NotSame__ExactlyAssignment_2_0 ) )
                    {
                    // InternalAdeptness.g:1737:2: ( ( rule__NotSame__ExactlyAssignment_2_0 ) )
                    // InternalAdeptness.g:1738:3: ( rule__NotSame__ExactlyAssignment_2_0 )
                    {
                     before(grammarAccess.getNotSameAccess().getExactlyAssignment_2_0()); 
                    // InternalAdeptness.g:1739:3: ( rule__NotSame__ExactlyAssignment_2_0 )
                    // InternalAdeptness.g:1739:4: rule__NotSame__ExactlyAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NotSame__ExactlyAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNotSameAccess().getExactlyAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1743:2: ( ( rule__NotSame__AtmostAssignment_2_1 ) )
                    {
                    // InternalAdeptness.g:1743:2: ( ( rule__NotSame__AtmostAssignment_2_1 ) )
                    // InternalAdeptness.g:1744:3: ( rule__NotSame__AtmostAssignment_2_1 )
                    {
                     before(grammarAccess.getNotSameAccess().getAtmostAssignment_2_1()); 
                    // InternalAdeptness.g:1745:3: ( rule__NotSame__AtmostAssignment_2_1 )
                    // InternalAdeptness.g:1745:4: rule__NotSame__AtmostAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NotSame__AtmostAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNotSameAccess().getAtmostAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1749:2: ( ( rule__NotSame__AtleastAssignment_2_2 ) )
                    {
                    // InternalAdeptness.g:1749:2: ( ( rule__NotSame__AtleastAssignment_2_2 ) )
                    // InternalAdeptness.g:1750:3: ( rule__NotSame__AtleastAssignment_2_2 )
                    {
                     before(grammarAccess.getNotSameAccess().getAtleastAssignment_2_2()); 
                    // InternalAdeptness.g:1751:3: ( rule__NotSame__AtleastAssignment_2_2 )
                    // InternalAdeptness.g:1751:4: rule__NotSame__AtleastAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__NotSame__AtleastAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getNotSameAccess().getAtleastAssignment_2_2()); 

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
    // $ANTLR end "rule__NotSame__Alternatives_2"


    // $ANTLR start "rule__Upper__Alternatives_2"
    // InternalAdeptness.g:1759:1: rule__Upper__Alternatives_2 : ( ( ( rule__Upper__ExactlyAssignment_2_0 ) ) | ( ( rule__Upper__AtmostAssignment_2_1 ) ) | ( ( rule__Upper__AtleastAssignment_2_2 ) ) );
    public final void rule__Upper__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1763:1: ( ( ( rule__Upper__ExactlyAssignment_2_0 ) ) | ( ( rule__Upper__AtmostAssignment_2_1 ) ) | ( ( rule__Upper__AtleastAssignment_2_2 ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt13=1;
                }
                break;
            case 80:
                {
                alt13=2;
                }
                break;
            case 81:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalAdeptness.g:1764:2: ( ( rule__Upper__ExactlyAssignment_2_0 ) )
                    {
                    // InternalAdeptness.g:1764:2: ( ( rule__Upper__ExactlyAssignment_2_0 ) )
                    // InternalAdeptness.g:1765:3: ( rule__Upper__ExactlyAssignment_2_0 )
                    {
                     before(grammarAccess.getUpperAccess().getExactlyAssignment_2_0()); 
                    // InternalAdeptness.g:1766:3: ( rule__Upper__ExactlyAssignment_2_0 )
                    // InternalAdeptness.g:1766:4: rule__Upper__ExactlyAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Upper__ExactlyAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUpperAccess().getExactlyAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1770:2: ( ( rule__Upper__AtmostAssignment_2_1 ) )
                    {
                    // InternalAdeptness.g:1770:2: ( ( rule__Upper__AtmostAssignment_2_1 ) )
                    // InternalAdeptness.g:1771:3: ( rule__Upper__AtmostAssignment_2_1 )
                    {
                     before(grammarAccess.getUpperAccess().getAtmostAssignment_2_1()); 
                    // InternalAdeptness.g:1772:3: ( rule__Upper__AtmostAssignment_2_1 )
                    // InternalAdeptness.g:1772:4: rule__Upper__AtmostAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Upper__AtmostAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getUpperAccess().getAtmostAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1776:2: ( ( rule__Upper__AtleastAssignment_2_2 ) )
                    {
                    // InternalAdeptness.g:1776:2: ( ( rule__Upper__AtleastAssignment_2_2 ) )
                    // InternalAdeptness.g:1777:3: ( rule__Upper__AtleastAssignment_2_2 )
                    {
                     before(grammarAccess.getUpperAccess().getAtleastAssignment_2_2()); 
                    // InternalAdeptness.g:1778:3: ( rule__Upper__AtleastAssignment_2_2 )
                    // InternalAdeptness.g:1778:4: rule__Upper__AtleastAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Upper__AtleastAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getUpperAccess().getAtleastAssignment_2_2()); 

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
    // $ANTLR end "rule__Upper__Alternatives_2"


    // $ANTLR start "rule__Lower__Alternatives_2"
    // InternalAdeptness.g:1786:1: rule__Lower__Alternatives_2 : ( ( ( rule__Lower__ExactlyAssignment_2_0 ) ) | ( ( rule__Lower__AtmostAssignment_2_1 ) ) | ( ( rule__Lower__AtleastAssignment_2_2 ) ) );
    public final void rule__Lower__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1790:1: ( ( ( rule__Lower__ExactlyAssignment_2_0 ) ) | ( ( rule__Lower__AtmostAssignment_2_1 ) ) | ( ( rule__Lower__AtleastAssignment_2_2 ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt14=1;
                }
                break;
            case 80:
                {
                alt14=2;
                }
                break;
            case 81:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalAdeptness.g:1791:2: ( ( rule__Lower__ExactlyAssignment_2_0 ) )
                    {
                    // InternalAdeptness.g:1791:2: ( ( rule__Lower__ExactlyAssignment_2_0 ) )
                    // InternalAdeptness.g:1792:3: ( rule__Lower__ExactlyAssignment_2_0 )
                    {
                     before(grammarAccess.getLowerAccess().getExactlyAssignment_2_0()); 
                    // InternalAdeptness.g:1793:3: ( rule__Lower__ExactlyAssignment_2_0 )
                    // InternalAdeptness.g:1793:4: rule__Lower__ExactlyAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lower__ExactlyAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLowerAccess().getExactlyAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1797:2: ( ( rule__Lower__AtmostAssignment_2_1 ) )
                    {
                    // InternalAdeptness.g:1797:2: ( ( rule__Lower__AtmostAssignment_2_1 ) )
                    // InternalAdeptness.g:1798:3: ( rule__Lower__AtmostAssignment_2_1 )
                    {
                     before(grammarAccess.getLowerAccess().getAtmostAssignment_2_1()); 
                    // InternalAdeptness.g:1799:3: ( rule__Lower__AtmostAssignment_2_1 )
                    // InternalAdeptness.g:1799:4: rule__Lower__AtmostAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lower__AtmostAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLowerAccess().getAtmostAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1803:2: ( ( rule__Lower__AtleastAssignment_2_2 ) )
                    {
                    // InternalAdeptness.g:1803:2: ( ( rule__Lower__AtleastAssignment_2_2 ) )
                    // InternalAdeptness.g:1804:3: ( rule__Lower__AtleastAssignment_2_2 )
                    {
                     before(grammarAccess.getLowerAccess().getAtleastAssignment_2_2()); 
                    // InternalAdeptness.g:1805:3: ( rule__Lower__AtleastAssignment_2_2 )
                    // InternalAdeptness.g:1805:4: rule__Lower__AtleastAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lower__AtleastAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getLowerAccess().getAtleastAssignment_2_2()); 

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
    // $ANTLR end "rule__Lower__Alternatives_2"


    // $ANTLR start "rule__Range__Alternatives_4"
    // InternalAdeptness.g:1813:1: rule__Range__Alternatives_4 : ( ( ( rule__Range__ExactlyAssignment_4_0 ) ) | ( ( rule__Range__AtmostAssignment_4_1 ) ) | ( ( rule__Range__AtleastAssignment_4_2 ) ) );
    public final void rule__Range__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1817:1: ( ( ( rule__Range__ExactlyAssignment_4_0 ) ) | ( ( rule__Range__AtmostAssignment_4_1 ) ) | ( ( rule__Range__AtleastAssignment_4_2 ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt15=1;
                }
                break;
            case 80:
                {
                alt15=2;
                }
                break;
            case 81:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalAdeptness.g:1818:2: ( ( rule__Range__ExactlyAssignment_4_0 ) )
                    {
                    // InternalAdeptness.g:1818:2: ( ( rule__Range__ExactlyAssignment_4_0 ) )
                    // InternalAdeptness.g:1819:3: ( rule__Range__ExactlyAssignment_4_0 )
                    {
                     before(grammarAccess.getRangeAccess().getExactlyAssignment_4_0()); 
                    // InternalAdeptness.g:1820:3: ( rule__Range__ExactlyAssignment_4_0 )
                    // InternalAdeptness.g:1820:4: rule__Range__ExactlyAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Range__ExactlyAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRangeAccess().getExactlyAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1824:2: ( ( rule__Range__AtmostAssignment_4_1 ) )
                    {
                    // InternalAdeptness.g:1824:2: ( ( rule__Range__AtmostAssignment_4_1 ) )
                    // InternalAdeptness.g:1825:3: ( rule__Range__AtmostAssignment_4_1 )
                    {
                     before(grammarAccess.getRangeAccess().getAtmostAssignment_4_1()); 
                    // InternalAdeptness.g:1826:3: ( rule__Range__AtmostAssignment_4_1 )
                    // InternalAdeptness.g:1826:4: rule__Range__AtmostAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Range__AtmostAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRangeAccess().getAtmostAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1830:2: ( ( rule__Range__AtleastAssignment_4_2 ) )
                    {
                    // InternalAdeptness.g:1830:2: ( ( rule__Range__AtleastAssignment_4_2 ) )
                    // InternalAdeptness.g:1831:3: ( rule__Range__AtleastAssignment_4_2 )
                    {
                     before(grammarAccess.getRangeAccess().getAtleastAssignment_4_2()); 
                    // InternalAdeptness.g:1832:3: ( rule__Range__AtleastAssignment_4_2 )
                    // InternalAdeptness.g:1832:4: rule__Range__AtleastAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Range__AtleastAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getRangeAccess().getAtleastAssignment_4_2()); 

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
    // $ANTLR end "rule__Range__Alternatives_4"


    // $ANTLR start "rule__Gap__Alternatives_4"
    // InternalAdeptness.g:1840:1: rule__Gap__Alternatives_4 : ( ( ( rule__Gap__ExactlyAssignment_4_0 ) ) | ( ( rule__Gap__AtmostAssignment_4_1 ) ) | ( ( rule__Gap__AtleastAssignment_4_2 ) ) );
    public final void rule__Gap__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1844:1: ( ( ( rule__Gap__ExactlyAssignment_4_0 ) ) | ( ( rule__Gap__AtmostAssignment_4_1 ) ) | ( ( rule__Gap__AtleastAssignment_4_2 ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt16=1;
                }
                break;
            case 80:
                {
                alt16=2;
                }
                break;
            case 81:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalAdeptness.g:1845:2: ( ( rule__Gap__ExactlyAssignment_4_0 ) )
                    {
                    // InternalAdeptness.g:1845:2: ( ( rule__Gap__ExactlyAssignment_4_0 ) )
                    // InternalAdeptness.g:1846:3: ( rule__Gap__ExactlyAssignment_4_0 )
                    {
                     before(grammarAccess.getGapAccess().getExactlyAssignment_4_0()); 
                    // InternalAdeptness.g:1847:3: ( rule__Gap__ExactlyAssignment_4_0 )
                    // InternalAdeptness.g:1847:4: rule__Gap__ExactlyAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gap__ExactlyAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGapAccess().getExactlyAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1851:2: ( ( rule__Gap__AtmostAssignment_4_1 ) )
                    {
                    // InternalAdeptness.g:1851:2: ( ( rule__Gap__AtmostAssignment_4_1 ) )
                    // InternalAdeptness.g:1852:3: ( rule__Gap__AtmostAssignment_4_1 )
                    {
                     before(grammarAccess.getGapAccess().getAtmostAssignment_4_1()); 
                    // InternalAdeptness.g:1853:3: ( rule__Gap__AtmostAssignment_4_1 )
                    // InternalAdeptness.g:1853:4: rule__Gap__AtmostAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gap__AtmostAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGapAccess().getAtmostAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1857:2: ( ( rule__Gap__AtleastAssignment_4_2 ) )
                    {
                    // InternalAdeptness.g:1857:2: ( ( rule__Gap__AtleastAssignment_4_2 ) )
                    // InternalAdeptness.g:1858:3: ( rule__Gap__AtleastAssignment_4_2 )
                    {
                     before(grammarAccess.getGapAccess().getAtleastAssignment_4_2()); 
                    // InternalAdeptness.g:1859:3: ( rule__Gap__AtleastAssignment_4_2 )
                    // InternalAdeptness.g:1859:4: rule__Gap__AtleastAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gap__AtleastAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getGapAccess().getAtleastAssignment_4_2()); 

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
    // $ANTLR end "rule__Gap__Alternatives_4"


    // $ANTLR start "rule__Exactly__Alternatives_2"
    // InternalAdeptness.g:1867:1: rule__Exactly__Alternatives_2 : ( ( 'times' ) | ( ( rule__Exactly__Group_2_1__0 ) ) | ( ( rule__Exactly__UnitAssignment_2_2 ) ) );
    public final void rule__Exactly__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1871:1: ( ( 'times' ) | ( ( rule__Exactly__Group_2_1__0 ) ) | ( ( rule__Exactly__UnitAssignment_2_2 ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt17=1;
                }
                break;
            case 79:
                {
                alt17=2;
                }
                break;
            case 89:
            case 90:
            case 91:
            case 92:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalAdeptness.g:1872:2: ( 'times' )
                    {
                    // InternalAdeptness.g:1872:2: ( 'times' )
                    // InternalAdeptness.g:1873:3: 'times'
                    {
                     before(grammarAccess.getExactlyAccess().getTimesKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getExactlyAccess().getTimesKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1878:2: ( ( rule__Exactly__Group_2_1__0 ) )
                    {
                    // InternalAdeptness.g:1878:2: ( ( rule__Exactly__Group_2_1__0 ) )
                    // InternalAdeptness.g:1879:3: ( rule__Exactly__Group_2_1__0 )
                    {
                     before(grammarAccess.getExactlyAccess().getGroup_2_1()); 
                    // InternalAdeptness.g:1880:3: ( rule__Exactly__Group_2_1__0 )
                    // InternalAdeptness.g:1880:4: rule__Exactly__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exactly__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExactlyAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1884:2: ( ( rule__Exactly__UnitAssignment_2_2 ) )
                    {
                    // InternalAdeptness.g:1884:2: ( ( rule__Exactly__UnitAssignment_2_2 ) )
                    // InternalAdeptness.g:1885:3: ( rule__Exactly__UnitAssignment_2_2 )
                    {
                     before(grammarAccess.getExactlyAccess().getUnitAssignment_2_2()); 
                    // InternalAdeptness.g:1886:3: ( rule__Exactly__UnitAssignment_2_2 )
                    // InternalAdeptness.g:1886:4: rule__Exactly__UnitAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exactly__UnitAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getExactlyAccess().getUnitAssignment_2_2()); 

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
    // $ANTLR end "rule__Exactly__Alternatives_2"


    // $ANTLR start "rule__At_most__Alternatives_2"
    // InternalAdeptness.g:1894:1: rule__At_most__Alternatives_2 : ( ( 'times' ) | ( ( rule__At_most__Group_2_1__0 ) ) | ( ( rule__At_most__UnitAssignment_2_2 ) ) );
    public final void rule__At_most__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1898:1: ( ( 'times' ) | ( ( rule__At_most__Group_2_1__0 ) ) | ( ( rule__At_most__UnitAssignment_2_2 ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt18=1;
                }
                break;
            case 79:
                {
                alt18=2;
                }
                break;
            case 89:
            case 90:
            case 91:
            case 92:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalAdeptness.g:1899:2: ( 'times' )
                    {
                    // InternalAdeptness.g:1899:2: ( 'times' )
                    // InternalAdeptness.g:1900:3: 'times'
                    {
                     before(grammarAccess.getAt_mostAccess().getTimesKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAt_mostAccess().getTimesKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1905:2: ( ( rule__At_most__Group_2_1__0 ) )
                    {
                    // InternalAdeptness.g:1905:2: ( ( rule__At_most__Group_2_1__0 ) )
                    // InternalAdeptness.g:1906:3: ( rule__At_most__Group_2_1__0 )
                    {
                     before(grammarAccess.getAt_mostAccess().getGroup_2_1()); 
                    // InternalAdeptness.g:1907:3: ( rule__At_most__Group_2_1__0 )
                    // InternalAdeptness.g:1907:4: rule__At_most__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__At_most__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAt_mostAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1911:2: ( ( rule__At_most__UnitAssignment_2_2 ) )
                    {
                    // InternalAdeptness.g:1911:2: ( ( rule__At_most__UnitAssignment_2_2 ) )
                    // InternalAdeptness.g:1912:3: ( rule__At_most__UnitAssignment_2_2 )
                    {
                     before(grammarAccess.getAt_mostAccess().getUnitAssignment_2_2()); 
                    // InternalAdeptness.g:1913:3: ( rule__At_most__UnitAssignment_2_2 )
                    // InternalAdeptness.g:1913:4: rule__At_most__UnitAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__At_most__UnitAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getAt_mostAccess().getUnitAssignment_2_2()); 

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
    // $ANTLR end "rule__At_most__Alternatives_2"


    // $ANTLR start "rule__At_least__Alternatives_2"
    // InternalAdeptness.g:1921:1: rule__At_least__Alternatives_2 : ( ( 'times' ) | ( ( rule__At_least__Group_2_1__0 ) ) | ( ( rule__At_least__UnitAssignment_2_2 ) ) );
    public final void rule__At_least__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1925:1: ( ( 'times' ) | ( ( rule__At_least__Group_2_1__0 ) ) | ( ( rule__At_least__UnitAssignment_2_2 ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt19=1;
                }
                break;
            case 79:
                {
                alt19=2;
                }
                break;
            case 89:
            case 90:
            case 91:
            case 92:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalAdeptness.g:1926:2: ( 'times' )
                    {
                    // InternalAdeptness.g:1926:2: ( 'times' )
                    // InternalAdeptness.g:1927:3: 'times'
                    {
                     before(grammarAccess.getAt_leastAccess().getTimesKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAt_leastAccess().getTimesKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1932:2: ( ( rule__At_least__Group_2_1__0 ) )
                    {
                    // InternalAdeptness.g:1932:2: ( ( rule__At_least__Group_2_1__0 ) )
                    // InternalAdeptness.g:1933:3: ( rule__At_least__Group_2_1__0 )
                    {
                     before(grammarAccess.getAt_leastAccess().getGroup_2_1()); 
                    // InternalAdeptness.g:1934:3: ( rule__At_least__Group_2_1__0 )
                    // InternalAdeptness.g:1934:4: rule__At_least__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__At_least__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAt_leastAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1938:2: ( ( rule__At_least__UnitAssignment_2_2 ) )
                    {
                    // InternalAdeptness.g:1938:2: ( ( rule__At_least__UnitAssignment_2_2 ) )
                    // InternalAdeptness.g:1939:3: ( rule__At_least__UnitAssignment_2_2 )
                    {
                     before(grammarAccess.getAt_leastAccess().getUnitAssignment_2_2()); 
                    // InternalAdeptness.g:1940:3: ( rule__At_least__UnitAssignment_2_2 )
                    // InternalAdeptness.g:1940:4: rule__At_least__UnitAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__At_least__UnitAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getAt_leastAccess().getUnitAssignment_2_2()); 

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
    // $ANTLR end "rule__At_least__Alternatives_2"


    // $ANTLR start "rule__Bound_up__Alternatives"
    // InternalAdeptness.g:1948:1: rule__Bound_up__Alternatives : ( ( ( rule__Bound_up__ValueAssignment_0 ) ) | ( ( rule__Bound_up__EmAssignment_1 ) ) );
    public final void rule__Bound_up__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1952:1: ( ( ( rule__Bound_up__ValueAssignment_0 ) ) | ( ( rule__Bound_up__EmAssignment_1 ) ) )
            int alt20=2;
            switch ( input.LA(1) ) {
            case 25:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==RULE_INT) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt20=1;
                }
                break;
            case EOF:
            case RULE_ID:
            case 11:
            case 65:
            case 78:
            case 80:
            case 81:
                {
                alt20=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalAdeptness.g:1953:2: ( ( rule__Bound_up__ValueAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1953:2: ( ( rule__Bound_up__ValueAssignment_0 ) )
                    // InternalAdeptness.g:1954:3: ( rule__Bound_up__ValueAssignment_0 )
                    {
                     before(grammarAccess.getBound_upAccess().getValueAssignment_0()); 
                    // InternalAdeptness.g:1955:3: ( rule__Bound_up__ValueAssignment_0 )
                    // InternalAdeptness.g:1955:4: rule__Bound_up__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bound_up__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBound_upAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1959:2: ( ( rule__Bound_up__EmAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1959:2: ( ( rule__Bound_up__EmAssignment_1 ) )
                    // InternalAdeptness.g:1960:3: ( rule__Bound_up__EmAssignment_1 )
                    {
                     before(grammarAccess.getBound_upAccess().getEmAssignment_1()); 
                    // InternalAdeptness.g:1961:3: ( rule__Bound_up__EmAssignment_1 )
                    // InternalAdeptness.g:1961:4: rule__Bound_up__EmAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bound_up__EmAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBound_upAccess().getEmAssignment_1()); 

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
    // $ANTLR end "rule__Bound_up__Alternatives"


    // $ANTLR start "rule__Bound_Down__Alternatives"
    // InternalAdeptness.g:1969:1: rule__Bound_Down__Alternatives : ( ( ( rule__Bound_Down__ValueAssignment_0 ) ) | ( ( rule__Bound_Down__EmAssignment_1 ) ) );
    public final void rule__Bound_Down__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1973:1: ( ( ( rule__Bound_Down__ValueAssignment_0 ) ) | ( ( rule__Bound_Down__EmAssignment_1 ) ) )
            int alt21=2;
            switch ( input.LA(1) ) {
            case 25:
                {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==RULE_INT) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt21=1;
                }
                break;
            case EOF:
            case RULE_ID:
            case 11:
            case 65:
            case 76:
            case 78:
            case 80:
            case 81:
                {
                alt21=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalAdeptness.g:1974:2: ( ( rule__Bound_Down__ValueAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1974:2: ( ( rule__Bound_Down__ValueAssignment_0 ) )
                    // InternalAdeptness.g:1975:3: ( rule__Bound_Down__ValueAssignment_0 )
                    {
                     before(grammarAccess.getBound_DownAccess().getValueAssignment_0()); 
                    // InternalAdeptness.g:1976:3: ( rule__Bound_Down__ValueAssignment_0 )
                    // InternalAdeptness.g:1976:4: rule__Bound_Down__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bound_Down__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBound_DownAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1980:2: ( ( rule__Bound_Down__EmAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1980:2: ( ( rule__Bound_Down__EmAssignment_1 ) )
                    // InternalAdeptness.g:1981:3: ( rule__Bound_Down__EmAssignment_1 )
                    {
                     before(grammarAccess.getBound_DownAccess().getEmAssignment_1()); 
                    // InternalAdeptness.g:1982:3: ( rule__Bound_Down__EmAssignment_1 )
                    // InternalAdeptness.g:1982:4: rule__Bound_Down__EmAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bound_Down__EmAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBound_DownAccess().getEmAssignment_1()); 

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
    // $ANTLR end "rule__Bound_Down__Alternatives"


    // $ANTLR start "rule__B__Alternatives"
    // InternalAdeptness.g:1990:1: rule__B__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__B__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1994:1: ( ( 'true' ) | ( 'false' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==14) ) {
                alt22=1;
            }
            else if ( (LA22_0==15) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalAdeptness.g:1995:2: ( 'true' )
                    {
                    // InternalAdeptness.g:1995:2: ( 'true' )
                    // InternalAdeptness.g:1996:3: 'true'
                    {
                     before(grammarAccess.getBAccess().getTrueKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2001:2: ( 'false' )
                    {
                    // InternalAdeptness.g:2001:2: ( 'false' )
                    // InternalAdeptness.g:2002:3: 'false'
                    {
                     before(grammarAccess.getBAccess().getFalseKeyword_1()); 
                    match(input,15,FOLLOW_2); 
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
    // InternalAdeptness.g:2011:1: rule__TimeType__Alternatives : ( ( ( rule__TimeType__TimeAssignment_0 ) ) | ( ( rule__TimeType__TimeAssignment_1 ) ) | ( ( rule__TimeType__TimeAssignment_2 ) ) | ( ( rule__TimeType__TimeAssignment_3 ) ) );
    public final void rule__TimeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2015:1: ( ( ( rule__TimeType__TimeAssignment_0 ) ) | ( ( rule__TimeType__TimeAssignment_1 ) ) | ( ( rule__TimeType__TimeAssignment_2 ) ) | ( ( rule__TimeType__TimeAssignment_3 ) ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt23=1;
                }
                break;
            case 90:
                {
                alt23=2;
                }
                break;
            case 91:
                {
                alt23=3;
                }
                break;
            case 92:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalAdeptness.g:2016:2: ( ( rule__TimeType__TimeAssignment_0 ) )
                    {
                    // InternalAdeptness.g:2016:2: ( ( rule__TimeType__TimeAssignment_0 ) )
                    // InternalAdeptness.g:2017:3: ( rule__TimeType__TimeAssignment_0 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_0()); 
                    // InternalAdeptness.g:2018:3: ( rule__TimeType__TimeAssignment_0 )
                    // InternalAdeptness.g:2018:4: rule__TimeType__TimeAssignment_0
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
                    // InternalAdeptness.g:2022:2: ( ( rule__TimeType__TimeAssignment_1 ) )
                    {
                    // InternalAdeptness.g:2022:2: ( ( rule__TimeType__TimeAssignment_1 ) )
                    // InternalAdeptness.g:2023:3: ( rule__TimeType__TimeAssignment_1 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_1()); 
                    // InternalAdeptness.g:2024:3: ( rule__TimeType__TimeAssignment_1 )
                    // InternalAdeptness.g:2024:4: rule__TimeType__TimeAssignment_1
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
                    // InternalAdeptness.g:2028:2: ( ( rule__TimeType__TimeAssignment_2 ) )
                    {
                    // InternalAdeptness.g:2028:2: ( ( rule__TimeType__TimeAssignment_2 ) )
                    // InternalAdeptness.g:2029:3: ( rule__TimeType__TimeAssignment_2 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_2()); 
                    // InternalAdeptness.g:2030:3: ( rule__TimeType__TimeAssignment_2 )
                    // InternalAdeptness.g:2030:4: rule__TimeType__TimeAssignment_2
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
                    // InternalAdeptness.g:2034:2: ( ( rule__TimeType__TimeAssignment_3 ) )
                    {
                    // InternalAdeptness.g:2034:2: ( ( rule__TimeType__TimeAssignment_3 ) )
                    // InternalAdeptness.g:2035:3: ( rule__TimeType__TimeAssignment_3 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_3()); 
                    // InternalAdeptness.g:2036:3: ( rule__TimeType__TimeAssignment_3 )
                    // InternalAdeptness.g:2036:4: rule__TimeType__TimeAssignment_3
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


    // $ANTLR start "rule__AbstractElement2__Alternatives_1"
    // InternalAdeptness.g:2044:1: rule__AbstractElement2__Alternatives_1 : ( ( ( rule__AbstractElement2__NameAssignment_1_0 ) ) | ( ( rule__AbstractElement2__ValueAssignment_1_1 ) ) );
    public final void rule__AbstractElement2__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2048:1: ( ( ( rule__AbstractElement2__NameAssignment_1_0 ) ) | ( ( rule__AbstractElement2__ValueAssignment_1_1 ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_INT||LA24_0==25) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalAdeptness.g:2049:2: ( ( rule__AbstractElement2__NameAssignment_1_0 ) )
                    {
                    // InternalAdeptness.g:2049:2: ( ( rule__AbstractElement2__NameAssignment_1_0 ) )
                    // InternalAdeptness.g:2050:3: ( rule__AbstractElement2__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getAbstractElement2Access().getNameAssignment_1_0()); 
                    // InternalAdeptness.g:2051:3: ( rule__AbstractElement2__NameAssignment_1_0 )
                    // InternalAdeptness.g:2051:4: rule__AbstractElement2__NameAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractElement2__NameAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractElement2Access().getNameAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2055:2: ( ( rule__AbstractElement2__ValueAssignment_1_1 ) )
                    {
                    // InternalAdeptness.g:2055:2: ( ( rule__AbstractElement2__ValueAssignment_1_1 ) )
                    // InternalAdeptness.g:2056:3: ( rule__AbstractElement2__ValueAssignment_1_1 )
                    {
                     before(grammarAccess.getAbstractElement2Access().getValueAssignment_1_1()); 
                    // InternalAdeptness.g:2057:3: ( rule__AbstractElement2__ValueAssignment_1_1 )
                    // InternalAdeptness.g:2057:4: rule__AbstractElement2__ValueAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractElement2__ValueAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractElement2Access().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__AbstractElement2__Alternatives_1"


    // $ANTLR start "rule__Operators__Alternatives"
    // InternalAdeptness.g:2065:1: rule__Operators__Alternatives : ( ( ( rule__Operators__OperatorAssignment_0 ) ) | ( ( rule__Operators__ComparationAssignment_1 ) ) | ( ( rule__Operators__LogicOperatorAssignment_2 ) ) | ( ( rule__Operators__BackParenthesesAssignment_3 ) ) );
    public final void rule__Operators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2069:1: ( ( ( rule__Operators__OperatorAssignment_0 ) ) | ( ( rule__Operators__ComparationAssignment_1 ) ) | ( ( rule__Operators__LogicOperatorAssignment_2 ) ) | ( ( rule__Operators__BackParenthesesAssignment_3 ) ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt25=1;
                }
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt25=2;
                }
                break;
            case 22:
            case 23:
                {
                alt25=3;
                }
                break;
            case 12:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalAdeptness.g:2070:2: ( ( rule__Operators__OperatorAssignment_0 ) )
                    {
                    // InternalAdeptness.g:2070:2: ( ( rule__Operators__OperatorAssignment_0 ) )
                    // InternalAdeptness.g:2071:3: ( rule__Operators__OperatorAssignment_0 )
                    {
                     before(grammarAccess.getOperatorsAccess().getOperatorAssignment_0()); 
                    // InternalAdeptness.g:2072:3: ( rule__Operators__OperatorAssignment_0 )
                    // InternalAdeptness.g:2072:4: rule__Operators__OperatorAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operators__OperatorAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorsAccess().getOperatorAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2076:2: ( ( rule__Operators__ComparationAssignment_1 ) )
                    {
                    // InternalAdeptness.g:2076:2: ( ( rule__Operators__ComparationAssignment_1 ) )
                    // InternalAdeptness.g:2077:3: ( rule__Operators__ComparationAssignment_1 )
                    {
                     before(grammarAccess.getOperatorsAccess().getComparationAssignment_1()); 
                    // InternalAdeptness.g:2078:3: ( rule__Operators__ComparationAssignment_1 )
                    // InternalAdeptness.g:2078:4: rule__Operators__ComparationAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operators__ComparationAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorsAccess().getComparationAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:2082:2: ( ( rule__Operators__LogicOperatorAssignment_2 ) )
                    {
                    // InternalAdeptness.g:2082:2: ( ( rule__Operators__LogicOperatorAssignment_2 ) )
                    // InternalAdeptness.g:2083:3: ( rule__Operators__LogicOperatorAssignment_2 )
                    {
                     before(grammarAccess.getOperatorsAccess().getLogicOperatorAssignment_2()); 
                    // InternalAdeptness.g:2084:3: ( rule__Operators__LogicOperatorAssignment_2 )
                    // InternalAdeptness.g:2084:4: rule__Operators__LogicOperatorAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operators__LogicOperatorAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorsAccess().getLogicOperatorAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:2088:2: ( ( rule__Operators__BackParenthesesAssignment_3 ) )
                    {
                    // InternalAdeptness.g:2088:2: ( ( rule__Operators__BackParenthesesAssignment_3 ) )
                    // InternalAdeptness.g:2089:3: ( rule__Operators__BackParenthesesAssignment_3 )
                    {
                     before(grammarAccess.getOperatorsAccess().getBackParenthesesAssignment_3()); 
                    // InternalAdeptness.g:2090:3: ( rule__Operators__BackParenthesesAssignment_3 )
                    // InternalAdeptness.g:2090:4: rule__Operators__BackParenthesesAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operators__BackParenthesesAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorsAccess().getBackParenthesesAssignment_3()); 

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
    // $ANTLR end "rule__Operators__Alternatives"


    // $ANTLR start "rule__CompOp__OpAlternatives_0"
    // InternalAdeptness.g:2098:1: rule__CompOp__OpAlternatives_0 : ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '<' ) | ( '>' ) );
    public final void rule__CompOp__OpAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2102:1: ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '<' ) | ( '>' ) )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt26=1;
                }
                break;
            case 17:
                {
                alt26=2;
                }
                break;
            case 18:
                {
                alt26=3;
                }
                break;
            case 19:
                {
                alt26=4;
                }
                break;
            case 20:
                {
                alt26=5;
                }
                break;
            case 21:
                {
                alt26=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalAdeptness.g:2103:2: ( '==' )
                    {
                    // InternalAdeptness.g:2103:2: ( '==' )
                    // InternalAdeptness.g:2104:3: '=='
                    {
                     before(grammarAccess.getCompOpAccess().getOpEqualsSignEqualsSignKeyword_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCompOpAccess().getOpEqualsSignEqualsSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2109:2: ( '!=' )
                    {
                    // InternalAdeptness.g:2109:2: ( '!=' )
                    // InternalAdeptness.g:2110:3: '!='
                    {
                     before(grammarAccess.getCompOpAccess().getOpExclamationMarkEqualsSignKeyword_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getCompOpAccess().getOpExclamationMarkEqualsSignKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:2115:2: ( '>=' )
                    {
                    // InternalAdeptness.g:2115:2: ( '>=' )
                    // InternalAdeptness.g:2116:3: '>='
                    {
                     before(grammarAccess.getCompOpAccess().getOpGreaterThanSignEqualsSignKeyword_0_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getCompOpAccess().getOpGreaterThanSignEqualsSignKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:2121:2: ( '<=' )
                    {
                    // InternalAdeptness.g:2121:2: ( '<=' )
                    // InternalAdeptness.g:2122:3: '<='
                    {
                     before(grammarAccess.getCompOpAccess().getOpLessThanSignEqualsSignKeyword_0_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getCompOpAccess().getOpLessThanSignEqualsSignKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAdeptness.g:2127:2: ( '<' )
                    {
                    // InternalAdeptness.g:2127:2: ( '<' )
                    // InternalAdeptness.g:2128:3: '<'
                    {
                     before(grammarAccess.getCompOpAccess().getOpLessThanSignKeyword_0_4()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getCompOpAccess().getOpLessThanSignKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAdeptness.g:2133:2: ( '>' )
                    {
                    // InternalAdeptness.g:2133:2: ( '>' )
                    // InternalAdeptness.g:2134:3: '>'
                    {
                     before(grammarAccess.getCompOpAccess().getOpGreaterThanSignKeyword_0_5()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getCompOpAccess().getOpGreaterThanSignKeyword_0_5()); 

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
    // $ANTLR end "rule__CompOp__OpAlternatives_0"


    // $ANTLR start "rule__LogicOp__OpAlternatives_0"
    // InternalAdeptness.g:2143:1: rule__LogicOp__OpAlternatives_0 : ( ( '&&' ) | ( '||' ) );
    public final void rule__LogicOp__OpAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2147:1: ( ( '&&' ) | ( '||' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==22) ) {
                alt27=1;
            }
            else if ( (LA27_0==23) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalAdeptness.g:2148:2: ( '&&' )
                    {
                    // InternalAdeptness.g:2148:2: ( '&&' )
                    // InternalAdeptness.g:2149:3: '&&'
                    {
                     before(grammarAccess.getLogicOpAccess().getOpAmpersandAmpersandKeyword_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getLogicOpAccess().getOpAmpersandAmpersandKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2154:2: ( '||' )
                    {
                    // InternalAdeptness.g:2154:2: ( '||' )
                    // InternalAdeptness.g:2155:3: '||'
                    {
                     before(grammarAccess.getLogicOpAccess().getOpVerticalLineVerticalLineKeyword_0_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getLogicOpAccess().getOpVerticalLineVerticalLineKeyword_0_1()); 

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
    // $ANTLR end "rule__LogicOp__OpAlternatives_0"


    // $ANTLR start "rule__Op__OpAlternatives_0"
    // InternalAdeptness.g:2164:1: rule__Op__OpAlternatives_0 : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) );
    public final void rule__Op__OpAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2168:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt28=1;
                }
                break;
            case 25:
                {
                alt28=2;
                }
                break;
            case 26:
                {
                alt28=3;
                }
                break;
            case 27:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalAdeptness.g:2169:2: ( '+' )
                    {
                    // InternalAdeptness.g:2169:2: ( '+' )
                    // InternalAdeptness.g:2170:3: '+'
                    {
                     before(grammarAccess.getOpAccess().getOpPlusSignKeyword_0_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getOpPlusSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2175:2: ( '-' )
                    {
                    // InternalAdeptness.g:2175:2: ( '-' )
                    // InternalAdeptness.g:2176:3: '-'
                    {
                     before(grammarAccess.getOpAccess().getOpHyphenMinusKeyword_0_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getOpHyphenMinusKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:2181:2: ( '*' )
                    {
                    // InternalAdeptness.g:2181:2: ( '*' )
                    // InternalAdeptness.g:2182:3: '*'
                    {
                     before(grammarAccess.getOpAccess().getOpAsteriskKeyword_0_2()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getOpAsteriskKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:2187:2: ( '/' )
                    {
                    // InternalAdeptness.g:2187:2: ( '/' )
                    // InternalAdeptness.g:2188:3: '/'
                    {
                     before(grammarAccess.getOpAccess().getOpSolidusKeyword_0_3()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getOpSolidusKeyword_0_3()); 

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
    // $ANTLR end "rule__Op__OpAlternatives_0"


    // $ANTLR start "rule__Imports__Group__0"
    // InternalAdeptness.g:2197:1: rule__Imports__Group__0 : rule__Imports__Group__0__Impl rule__Imports__Group__1 ;
    public final void rule__Imports__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2201:1: ( rule__Imports__Group__0__Impl rule__Imports__Group__1 )
            // InternalAdeptness.g:2202:2: rule__Imports__Group__0__Impl rule__Imports__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Imports__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Imports__Group__1();

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
    // $ANTLR end "rule__Imports__Group__0"


    // $ANTLR start "rule__Imports__Group__0__Impl"
    // InternalAdeptness.g:2209:1: rule__Imports__Group__0__Impl : ( 'import' ) ;
    public final void rule__Imports__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2213:1: ( ( 'import' ) )
            // InternalAdeptness.g:2214:1: ( 'import' )
            {
            // InternalAdeptness.g:2214:1: ( 'import' )
            // InternalAdeptness.g:2215:2: 'import'
            {
             before(grammarAccess.getImportsAccess().getImportKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getImportsAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group__0__Impl"


    // $ANTLR start "rule__Imports__Group__1"
    // InternalAdeptness.g:2224:1: rule__Imports__Group__1 : rule__Imports__Group__1__Impl ;
    public final void rule__Imports__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2228:1: ( rule__Imports__Group__1__Impl )
            // InternalAdeptness.g:2229:2: rule__Imports__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Imports__Group__1__Impl();

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
    // $ANTLR end "rule__Imports__Group__1"


    // $ANTLR start "rule__Imports__Group__1__Impl"
    // InternalAdeptness.g:2235:1: rule__Imports__Group__1__Impl : ( ( rule__Imports__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Imports__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2239:1: ( ( ( rule__Imports__ImportedNamespaceAssignment_1 ) ) )
            // InternalAdeptness.g:2240:1: ( ( rule__Imports__ImportedNamespaceAssignment_1 ) )
            {
            // InternalAdeptness.g:2240:1: ( ( rule__Imports__ImportedNamespaceAssignment_1 ) )
            // InternalAdeptness.g:2241:2: ( rule__Imports__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportsAccess().getImportedNamespaceAssignment_1()); 
            // InternalAdeptness.g:2242:2: ( rule__Imports__ImportedNamespaceAssignment_1 )
            // InternalAdeptness.g:2242:3: rule__Imports__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Imports__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportsAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalAdeptness.g:2251:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2255:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalAdeptness.g:2256:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalAdeptness.g:2263:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2267:1: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:2268:1: ( ruleQualifiedName )
            {
            // InternalAdeptness.g:2268:1: ( ruleQualifiedName )
            // InternalAdeptness.g:2269:2: ruleQualifiedName
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
    // InternalAdeptness.g:2278:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2282:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalAdeptness.g:2283:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalAdeptness.g:2289:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2293:1: ( ( ( '.*' )? ) )
            // InternalAdeptness.g:2294:1: ( ( '.*' )? )
            {
            // InternalAdeptness.g:2294:1: ( ( '.*' )? )
            // InternalAdeptness.g:2295:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalAdeptness.g:2296:2: ( '.*' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAdeptness.g:2296:3: '.*'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalAdeptness.g:2305:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2309:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAdeptness.g:2310:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalAdeptness.g:2317:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2321:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:2322:1: ( RULE_ID )
            {
            // InternalAdeptness.g:2322:1: ( RULE_ID )
            // InternalAdeptness.g:2323:2: RULE_ID
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
    // InternalAdeptness.g:2332:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2336:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAdeptness.g:2337:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAdeptness.g:2343:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2347:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAdeptness.g:2348:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAdeptness.g:2348:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAdeptness.g:2349:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAdeptness.g:2350:2: ( rule__QualifiedName__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==30) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAdeptness.g:2350:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalAdeptness.g:2359:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2363:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAdeptness.g:2364:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalAdeptness.g:2371:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2375:1: ( ( '.' ) )
            // InternalAdeptness.g:2376:1: ( '.' )
            {
            // InternalAdeptness.g:2376:1: ( '.' )
            // InternalAdeptness.g:2377:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAdeptness.g:2386:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2390:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAdeptness.g:2391:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAdeptness.g:2397:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2401:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:2402:1: ( RULE_ID )
            {
            // InternalAdeptness.g:2402:1: ( RULE_ID )
            // InternalAdeptness.g:2403:2: RULE_ID
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


    // $ANTLR start "rule__ValidationPlan__Group__0"
    // InternalAdeptness.g:2413:1: rule__ValidationPlan__Group__0 : rule__ValidationPlan__Group__0__Impl rule__ValidationPlan__Group__1 ;
    public final void rule__ValidationPlan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2417:1: ( rule__ValidationPlan__Group__0__Impl rule__ValidationPlan__Group__1 )
            // InternalAdeptness.g:2418:2: rule__ValidationPlan__Group__0__Impl rule__ValidationPlan__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ValidationPlan__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidationPlan__Group__1();

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
    // $ANTLR end "rule__ValidationPlan__Group__0"


    // $ANTLR start "rule__ValidationPlan__Group__0__Impl"
    // InternalAdeptness.g:2425:1: rule__ValidationPlan__Group__0__Impl : ( 'VALIDATIONPLAN' ) ;
    public final void rule__ValidationPlan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2429:1: ( ( 'VALIDATIONPLAN' ) )
            // InternalAdeptness.g:2430:1: ( 'VALIDATIONPLAN' )
            {
            // InternalAdeptness.g:2430:1: ( 'VALIDATIONPLAN' )
            // InternalAdeptness.g:2431:2: 'VALIDATIONPLAN'
            {
             before(grammarAccess.getValidationPlanAccess().getVALIDATIONPLANKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getValidationPlanAccess().getVALIDATIONPLANKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidationPlan__Group__0__Impl"


    // $ANTLR start "rule__ValidationPlan__Group__1"
    // InternalAdeptness.g:2440:1: rule__ValidationPlan__Group__1 : rule__ValidationPlan__Group__1__Impl rule__ValidationPlan__Group__2 ;
    public final void rule__ValidationPlan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2444:1: ( rule__ValidationPlan__Group__1__Impl rule__ValidationPlan__Group__2 )
            // InternalAdeptness.g:2445:2: rule__ValidationPlan__Group__1__Impl rule__ValidationPlan__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ValidationPlan__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidationPlan__Group__2();

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
    // $ANTLR end "rule__ValidationPlan__Group__1"


    // $ANTLR start "rule__ValidationPlan__Group__1__Impl"
    // InternalAdeptness.g:2452:1: rule__ValidationPlan__Group__1__Impl : ( ( rule__ValidationPlan__NameAssignment_1 ) ) ;
    public final void rule__ValidationPlan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2456:1: ( ( ( rule__ValidationPlan__NameAssignment_1 ) ) )
            // InternalAdeptness.g:2457:1: ( ( rule__ValidationPlan__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:2457:1: ( ( rule__ValidationPlan__NameAssignment_1 ) )
            // InternalAdeptness.g:2458:2: ( rule__ValidationPlan__NameAssignment_1 )
            {
             before(grammarAccess.getValidationPlanAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:2459:2: ( rule__ValidationPlan__NameAssignment_1 )
            // InternalAdeptness.g:2459:3: rule__ValidationPlan__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ValidationPlan__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValidationPlanAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidationPlan__Group__1__Impl"


    // $ANTLR start "rule__ValidationPlan__Group__2"
    // InternalAdeptness.g:2467:1: rule__ValidationPlan__Group__2 : rule__ValidationPlan__Group__2__Impl rule__ValidationPlan__Group__3 ;
    public final void rule__ValidationPlan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2471:1: ( rule__ValidationPlan__Group__2__Impl rule__ValidationPlan__Group__3 )
            // InternalAdeptness.g:2472:2: rule__ValidationPlan__Group__2__Impl rule__ValidationPlan__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ValidationPlan__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidationPlan__Group__3();

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
    // $ANTLR end "rule__ValidationPlan__Group__2"


    // $ANTLR start "rule__ValidationPlan__Group__2__Impl"
    // InternalAdeptness.g:2479:1: rule__ValidationPlan__Group__2__Impl : ( ':' ) ;
    public final void rule__ValidationPlan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2483:1: ( ( ':' ) )
            // InternalAdeptness.g:2484:1: ( ':' )
            {
            // InternalAdeptness.g:2484:1: ( ':' )
            // InternalAdeptness.g:2485:2: ':'
            {
             before(grammarAccess.getValidationPlanAccess().getColonKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getValidationPlanAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidationPlan__Group__2__Impl"


    // $ANTLR start "rule__ValidationPlan__Group__3"
    // InternalAdeptness.g:2494:1: rule__ValidationPlan__Group__3 : rule__ValidationPlan__Group__3__Impl rule__ValidationPlan__Group__4 ;
    public final void rule__ValidationPlan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2498:1: ( rule__ValidationPlan__Group__3__Impl rule__ValidationPlan__Group__4 )
            // InternalAdeptness.g:2499:2: rule__ValidationPlan__Group__3__Impl rule__ValidationPlan__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ValidationPlan__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidationPlan__Group__4();

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
    // $ANTLR end "rule__ValidationPlan__Group__3"


    // $ANTLR start "rule__ValidationPlan__Group__3__Impl"
    // InternalAdeptness.g:2506:1: rule__ValidationPlan__Group__3__Impl : ( ( rule__ValidationPlan__Group_3__0 )? ) ;
    public final void rule__ValidationPlan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2510:1: ( ( ( rule__ValidationPlan__Group_3__0 )? ) )
            // InternalAdeptness.g:2511:1: ( ( rule__ValidationPlan__Group_3__0 )? )
            {
            // InternalAdeptness.g:2511:1: ( ( rule__ValidationPlan__Group_3__0 )? )
            // InternalAdeptness.g:2512:2: ( rule__ValidationPlan__Group_3__0 )?
            {
             before(grammarAccess.getValidationPlanAccess().getGroup_3()); 
            // InternalAdeptness.g:2513:2: ( rule__ValidationPlan__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAdeptness.g:2513:3: rule__ValidationPlan__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValidationPlan__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValidationPlanAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidationPlan__Group__3__Impl"


    // $ANTLR start "rule__ValidationPlan__Group__4"
    // InternalAdeptness.g:2521:1: rule__ValidationPlan__Group__4 : rule__ValidationPlan__Group__4__Impl rule__ValidationPlan__Group__5 ;
    public final void rule__ValidationPlan__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2525:1: ( rule__ValidationPlan__Group__4__Impl rule__ValidationPlan__Group__5 )
            // InternalAdeptness.g:2526:2: rule__ValidationPlan__Group__4__Impl rule__ValidationPlan__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__ValidationPlan__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidationPlan__Group__5();

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
    // $ANTLR end "rule__ValidationPlan__Group__4"


    // $ANTLR start "rule__ValidationPlan__Group__4__Impl"
    // InternalAdeptness.g:2533:1: rule__ValidationPlan__Group__4__Impl : ( ( ( rule__ValidationPlan__TestAssignment_4 ) ) ( ( rule__ValidationPlan__TestAssignment_4 )* ) ) ;
    public final void rule__ValidationPlan__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2537:1: ( ( ( ( rule__ValidationPlan__TestAssignment_4 ) ) ( ( rule__ValidationPlan__TestAssignment_4 )* ) ) )
            // InternalAdeptness.g:2538:1: ( ( ( rule__ValidationPlan__TestAssignment_4 ) ) ( ( rule__ValidationPlan__TestAssignment_4 )* ) )
            {
            // InternalAdeptness.g:2538:1: ( ( ( rule__ValidationPlan__TestAssignment_4 ) ) ( ( rule__ValidationPlan__TestAssignment_4 )* ) )
            // InternalAdeptness.g:2539:2: ( ( rule__ValidationPlan__TestAssignment_4 ) ) ( ( rule__ValidationPlan__TestAssignment_4 )* )
            {
            // InternalAdeptness.g:2539:2: ( ( rule__ValidationPlan__TestAssignment_4 ) )
            // InternalAdeptness.g:2540:3: ( rule__ValidationPlan__TestAssignment_4 )
            {
             before(grammarAccess.getValidationPlanAccess().getTestAssignment_4()); 
            // InternalAdeptness.g:2541:3: ( rule__ValidationPlan__TestAssignment_4 )
            // InternalAdeptness.g:2541:4: rule__ValidationPlan__TestAssignment_4
            {
            pushFollow(FOLLOW_12);
            rule__ValidationPlan__TestAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getValidationPlanAccess().getTestAssignment_4()); 

            }

            // InternalAdeptness.g:2544:2: ( ( rule__ValidationPlan__TestAssignment_4 )* )
            // InternalAdeptness.g:2545:3: ( rule__ValidationPlan__TestAssignment_4 )*
            {
             before(grammarAccess.getValidationPlanAccess().getTestAssignment_4()); 
            // InternalAdeptness.g:2546:3: ( rule__ValidationPlan__TestAssignment_4 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==35) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAdeptness.g:2546:4: rule__ValidationPlan__TestAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ValidationPlan__TestAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getValidationPlanAccess().getTestAssignment_4()); 

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
    // $ANTLR end "rule__ValidationPlan__Group__4__Impl"


    // $ANTLR start "rule__ValidationPlan__Group__5"
    // InternalAdeptness.g:2555:1: rule__ValidationPlan__Group__5 : rule__ValidationPlan__Group__5__Impl ;
    public final void rule__ValidationPlan__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2559:1: ( rule__ValidationPlan__Group__5__Impl )
            // InternalAdeptness.g:2560:2: rule__ValidationPlan__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidationPlan__Group__5__Impl();

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
    // $ANTLR end "rule__ValidationPlan__Group__5"


    // $ANTLR start "rule__ValidationPlan__Group__5__Impl"
    // InternalAdeptness.g:2566:1: rule__ValidationPlan__Group__5__Impl : ( 'ENDVALIDATIONPLAN' ) ;
    public final void rule__ValidationPlan__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2570:1: ( ( 'ENDVALIDATIONPLAN' ) )
            // InternalAdeptness.g:2571:1: ( 'ENDVALIDATIONPLAN' )
            {
            // InternalAdeptness.g:2571:1: ( 'ENDVALIDATIONPLAN' )
            // InternalAdeptness.g:2572:2: 'ENDVALIDATIONPLAN'
            {
             before(grammarAccess.getValidationPlanAccess().getENDVALIDATIONPLANKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getValidationPlanAccess().getENDVALIDATIONPLANKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidationPlan__Group__5__Impl"


    // $ANTLR start "rule__ValidationPlan__Group_3__0"
    // InternalAdeptness.g:2582:1: rule__ValidationPlan__Group_3__0 : rule__ValidationPlan__Group_3__0__Impl rule__ValidationPlan__Group_3__1 ;
    public final void rule__ValidationPlan__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2586:1: ( rule__ValidationPlan__Group_3__0__Impl rule__ValidationPlan__Group_3__1 )
            // InternalAdeptness.g:2587:2: rule__ValidationPlan__Group_3__0__Impl rule__ValidationPlan__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ValidationPlan__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidationPlan__Group_3__1();

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
    // $ANTLR end "rule__ValidationPlan__Group_3__0"


    // $ANTLR start "rule__ValidationPlan__Group_3__0__Impl"
    // InternalAdeptness.g:2594:1: rule__ValidationPlan__Group_3__0__Impl : ( 'implements' ) ;
    public final void rule__ValidationPlan__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2598:1: ( ( 'implements' ) )
            // InternalAdeptness.g:2599:1: ( 'implements' )
            {
            // InternalAdeptness.g:2599:1: ( 'implements' )
            // InternalAdeptness.g:2600:2: 'implements'
            {
             before(grammarAccess.getValidationPlanAccess().getImplementsKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getValidationPlanAccess().getImplementsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidationPlan__Group_3__0__Impl"


    // $ANTLR start "rule__ValidationPlan__Group_3__1"
    // InternalAdeptness.g:2609:1: rule__ValidationPlan__Group_3__1 : rule__ValidationPlan__Group_3__1__Impl ;
    public final void rule__ValidationPlan__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2613:1: ( rule__ValidationPlan__Group_3__1__Impl )
            // InternalAdeptness.g:2614:2: rule__ValidationPlan__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidationPlan__Group_3__1__Impl();

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
    // $ANTLR end "rule__ValidationPlan__Group_3__1"


    // $ANTLR start "rule__ValidationPlan__Group_3__1__Impl"
    // InternalAdeptness.g:2620:1: rule__ValidationPlan__Group_3__1__Impl : ( ( rule__ValidationPlan__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__ValidationPlan__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2624:1: ( ( ( rule__ValidationPlan__SuperTypeAssignment_3_1 ) ) )
            // InternalAdeptness.g:2625:1: ( ( rule__ValidationPlan__SuperTypeAssignment_3_1 ) )
            {
            // InternalAdeptness.g:2625:1: ( ( rule__ValidationPlan__SuperTypeAssignment_3_1 ) )
            // InternalAdeptness.g:2626:2: ( rule__ValidationPlan__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getValidationPlanAccess().getSuperTypeAssignment_3_1()); 
            // InternalAdeptness.g:2627:2: ( rule__ValidationPlan__SuperTypeAssignment_3_1 )
            // InternalAdeptness.g:2627:3: rule__ValidationPlan__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ValidationPlan__SuperTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getValidationPlanAccess().getSuperTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidationPlan__Group_3__1__Impl"


    // $ANTLR start "rule__Test__Group__0"
    // InternalAdeptness.g:2636:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2640:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalAdeptness.g:2641:2: rule__Test__Group__0__Impl rule__Test__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__1();

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
    // $ANTLR end "rule__Test__Group__0"


    // $ANTLR start "rule__Test__Group__0__Impl"
    // InternalAdeptness.g:2648:1: rule__Test__Group__0__Impl : ( 'TEST' ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2652:1: ( ( 'TEST' ) )
            // InternalAdeptness.g:2653:1: ( 'TEST' )
            {
            // InternalAdeptness.g:2653:1: ( 'TEST' )
            // InternalAdeptness.g:2654:2: 'TEST'
            {
             before(grammarAccess.getTestAccess().getTESTKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getTESTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0__Impl"


    // $ANTLR start "rule__Test__Group__1"
    // InternalAdeptness.g:2663:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2667:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalAdeptness.g:2668:2: rule__Test__Group__1__Impl rule__Test__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Test__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__2();

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
    // $ANTLR end "rule__Test__Group__1"


    // $ANTLR start "rule__Test__Group__1__Impl"
    // InternalAdeptness.g:2675:1: rule__Test__Group__1__Impl : ( ( rule__Test__NameAssignment_1 ) ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2679:1: ( ( ( rule__Test__NameAssignment_1 ) ) )
            // InternalAdeptness.g:2680:1: ( ( rule__Test__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:2680:1: ( ( rule__Test__NameAssignment_1 ) )
            // InternalAdeptness.g:2681:2: ( rule__Test__NameAssignment_1 )
            {
             before(grammarAccess.getTestAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:2682:2: ( rule__Test__NameAssignment_1 )
            // InternalAdeptness.g:2682:3: rule__Test__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Test__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1__Impl"


    // $ANTLR start "rule__Test__Group__2"
    // InternalAdeptness.g:2690:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2694:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalAdeptness.g:2695:2: rule__Test__Group__2__Impl rule__Test__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Test__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__3();

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
    // $ANTLR end "rule__Test__Group__2"


    // $ANTLR start "rule__Test__Group__2__Impl"
    // InternalAdeptness.g:2702:1: rule__Test__Group__2__Impl : ( ':' ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2706:1: ( ( ':' ) )
            // InternalAdeptness.g:2707:1: ( ':' )
            {
            // InternalAdeptness.g:2707:1: ( ':' )
            // InternalAdeptness.g:2708:2: ':'
            {
             before(grammarAccess.getTestAccess().getColonKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2__Impl"


    // $ANTLR start "rule__Test__Group__3"
    // InternalAdeptness.g:2717:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2721:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // InternalAdeptness.g:2722:2: rule__Test__Group__3__Impl rule__Test__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Test__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__4();

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
    // $ANTLR end "rule__Test__Group__3"


    // $ANTLR start "rule__Test__Group__3__Impl"
    // InternalAdeptness.g:2729:1: rule__Test__Group__3__Impl : ( 'SUT:' ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2733:1: ( ( 'SUT:' ) )
            // InternalAdeptness.g:2734:1: ( 'SUT:' )
            {
            // InternalAdeptness.g:2734:1: ( 'SUT:' )
            // InternalAdeptness.g:2735:2: 'SUT:'
            {
             before(grammarAccess.getTestAccess().getSUTKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getSUTKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3__Impl"


    // $ANTLR start "rule__Test__Group__4"
    // InternalAdeptness.g:2744:1: rule__Test__Group__4 : rule__Test__Group__4__Impl rule__Test__Group__5 ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2748:1: ( rule__Test__Group__4__Impl rule__Test__Group__5 )
            // InternalAdeptness.g:2749:2: rule__Test__Group__4__Impl rule__Test__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Test__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__5();

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
    // $ANTLR end "rule__Test__Group__4"


    // $ANTLR start "rule__Test__Group__4__Impl"
    // InternalAdeptness.g:2756:1: rule__Test__Group__4__Impl : ( ( rule__Test__SutAssignment_4 ) ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2760:1: ( ( ( rule__Test__SutAssignment_4 ) ) )
            // InternalAdeptness.g:2761:1: ( ( rule__Test__SutAssignment_4 ) )
            {
            // InternalAdeptness.g:2761:1: ( ( rule__Test__SutAssignment_4 ) )
            // InternalAdeptness.g:2762:2: ( rule__Test__SutAssignment_4 )
            {
             before(grammarAccess.getTestAccess().getSutAssignment_4()); 
            // InternalAdeptness.g:2763:2: ( rule__Test__SutAssignment_4 )
            // InternalAdeptness.g:2763:3: rule__Test__SutAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Test__SutAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getSutAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4__Impl"


    // $ANTLR start "rule__Test__Group__5"
    // InternalAdeptness.g:2771:1: rule__Test__Group__5 : rule__Test__Group__5__Impl rule__Test__Group__6 ;
    public final void rule__Test__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2775:1: ( rule__Test__Group__5__Impl rule__Test__Group__6 )
            // InternalAdeptness.g:2776:2: rule__Test__Group__5__Impl rule__Test__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Test__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__6();

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
    // $ANTLR end "rule__Test__Group__5"


    // $ANTLR start "rule__Test__Group__5__Impl"
    // InternalAdeptness.g:2783:1: rule__Test__Group__5__Impl : ( ',' ) ;
    public final void rule__Test__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2787:1: ( ( ',' ) )
            // InternalAdeptness.g:2788:1: ( ',' )
            {
            // InternalAdeptness.g:2788:1: ( ',' )
            // InternalAdeptness.g:2789:2: ','
            {
             before(grammarAccess.getTestAccess().getCommaKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__5__Impl"


    // $ANTLR start "rule__Test__Group__6"
    // InternalAdeptness.g:2798:1: rule__Test__Group__6 : rule__Test__Group__6__Impl rule__Test__Group__7 ;
    public final void rule__Test__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2802:1: ( rule__Test__Group__6__Impl rule__Test__Group__7 )
            // InternalAdeptness.g:2803:2: rule__Test__Group__6__Impl rule__Test__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Test__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__7();

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
    // $ANTLR end "rule__Test__Group__6"


    // $ANTLR start "rule__Test__Group__6__Impl"
    // InternalAdeptness.g:2810:1: rule__Test__Group__6__Impl : ( 'TestLevel:' ) ;
    public final void rule__Test__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2814:1: ( ( 'TestLevel:' ) )
            // InternalAdeptness.g:2815:1: ( 'TestLevel:' )
            {
            // InternalAdeptness.g:2815:1: ( 'TestLevel:' )
            // InternalAdeptness.g:2816:2: 'TestLevel:'
            {
             before(grammarAccess.getTestAccess().getTestLevelKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getTestLevelKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__6__Impl"


    // $ANTLR start "rule__Test__Group__7"
    // InternalAdeptness.g:2825:1: rule__Test__Group__7 : rule__Test__Group__7__Impl rule__Test__Group__8 ;
    public final void rule__Test__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2829:1: ( rule__Test__Group__7__Impl rule__Test__Group__8 )
            // InternalAdeptness.g:2830:2: rule__Test__Group__7__Impl rule__Test__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Test__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__8();

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
    // $ANTLR end "rule__Test__Group__7"


    // $ANTLR start "rule__Test__Group__7__Impl"
    // InternalAdeptness.g:2837:1: rule__Test__Group__7__Impl : ( ( rule__Test__TestLevelAssignment_7 ) ) ;
    public final void rule__Test__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2841:1: ( ( ( rule__Test__TestLevelAssignment_7 ) ) )
            // InternalAdeptness.g:2842:1: ( ( rule__Test__TestLevelAssignment_7 ) )
            {
            // InternalAdeptness.g:2842:1: ( ( rule__Test__TestLevelAssignment_7 ) )
            // InternalAdeptness.g:2843:2: ( rule__Test__TestLevelAssignment_7 )
            {
             before(grammarAccess.getTestAccess().getTestLevelAssignment_7()); 
            // InternalAdeptness.g:2844:2: ( rule__Test__TestLevelAssignment_7 )
            // InternalAdeptness.g:2844:3: rule__Test__TestLevelAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Test__TestLevelAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getTestLevelAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__7__Impl"


    // $ANTLR start "rule__Test__Group__8"
    // InternalAdeptness.g:2852:1: rule__Test__Group__8 : rule__Test__Group__8__Impl rule__Test__Group__9 ;
    public final void rule__Test__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2856:1: ( rule__Test__Group__8__Impl rule__Test__Group__9 )
            // InternalAdeptness.g:2857:2: rule__Test__Group__8__Impl rule__Test__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Test__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__9();

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
    // $ANTLR end "rule__Test__Group__8"


    // $ANTLR start "rule__Test__Group__8__Impl"
    // InternalAdeptness.g:2864:1: rule__Test__Group__8__Impl : ( ',' ) ;
    public final void rule__Test__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2868:1: ( ( ',' ) )
            // InternalAdeptness.g:2869:1: ( ',' )
            {
            // InternalAdeptness.g:2869:1: ( ',' )
            // InternalAdeptness.g:2870:2: ','
            {
             before(grammarAccess.getTestAccess().getCommaKeyword_8()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__8__Impl"


    // $ANTLR start "rule__Test__Group__9"
    // InternalAdeptness.g:2879:1: rule__Test__Group__9 : rule__Test__Group__9__Impl rule__Test__Group__10 ;
    public final void rule__Test__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2883:1: ( rule__Test__Group__9__Impl rule__Test__Group__10 )
            // InternalAdeptness.g:2884:2: rule__Test__Group__9__Impl rule__Test__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__Test__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__10();

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
    // $ANTLR end "rule__Test__Group__9"


    // $ANTLR start "rule__Test__Group__9__Impl"
    // InternalAdeptness.g:2891:1: rule__Test__Group__9__Impl : ( 'Inputs:' ) ;
    public final void rule__Test__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2895:1: ( ( 'Inputs:' ) )
            // InternalAdeptness.g:2896:1: ( 'Inputs:' )
            {
            // InternalAdeptness.g:2896:1: ( 'Inputs:' )
            // InternalAdeptness.g:2897:2: 'Inputs:'
            {
             before(grammarAccess.getTestAccess().getInputsKeyword_9()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getInputsKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__9__Impl"


    // $ANTLR start "rule__Test__Group__10"
    // InternalAdeptness.g:2906:1: rule__Test__Group__10 : rule__Test__Group__10__Impl rule__Test__Group__11 ;
    public final void rule__Test__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2910:1: ( rule__Test__Group__10__Impl rule__Test__Group__11 )
            // InternalAdeptness.g:2911:2: rule__Test__Group__10__Impl rule__Test__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__Test__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__11();

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
    // $ANTLR end "rule__Test__Group__10"


    // $ANTLR start "rule__Test__Group__10__Impl"
    // InternalAdeptness.g:2918:1: rule__Test__Group__10__Impl : ( ( ( rule__Test__InputsAssignment_10 ) ) ( ( rule__Test__InputsAssignment_10 )* ) ) ;
    public final void rule__Test__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2922:1: ( ( ( ( rule__Test__InputsAssignment_10 ) ) ( ( rule__Test__InputsAssignment_10 )* ) ) )
            // InternalAdeptness.g:2923:1: ( ( ( rule__Test__InputsAssignment_10 ) ) ( ( rule__Test__InputsAssignment_10 )* ) )
            {
            // InternalAdeptness.g:2923:1: ( ( ( rule__Test__InputsAssignment_10 ) ) ( ( rule__Test__InputsAssignment_10 )* ) )
            // InternalAdeptness.g:2924:2: ( ( rule__Test__InputsAssignment_10 ) ) ( ( rule__Test__InputsAssignment_10 )* )
            {
            // InternalAdeptness.g:2924:2: ( ( rule__Test__InputsAssignment_10 ) )
            // InternalAdeptness.g:2925:3: ( rule__Test__InputsAssignment_10 )
            {
             before(grammarAccess.getTestAccess().getInputsAssignment_10()); 
            // InternalAdeptness.g:2926:3: ( rule__Test__InputsAssignment_10 )
            // InternalAdeptness.g:2926:4: rule__Test__InputsAssignment_10
            {
            pushFollow(FOLLOW_19);
            rule__Test__InputsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getInputsAssignment_10()); 

            }

            // InternalAdeptness.g:2929:2: ( ( rule__Test__InputsAssignment_10 )* )
            // InternalAdeptness.g:2930:3: ( rule__Test__InputsAssignment_10 )*
            {
             before(grammarAccess.getTestAccess().getInputsAssignment_10()); 
            // InternalAdeptness.g:2931:3: ( rule__Test__InputsAssignment_10 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_STRING) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAdeptness.g:2931:4: rule__Test__InputsAssignment_10
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Test__InputsAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getInputsAssignment_10()); 

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
    // $ANTLR end "rule__Test__Group__10__Impl"


    // $ANTLR start "rule__Test__Group__11"
    // InternalAdeptness.g:2940:1: rule__Test__Group__11 : rule__Test__Group__11__Impl rule__Test__Group__12 ;
    public final void rule__Test__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2944:1: ( rule__Test__Group__11__Impl rule__Test__Group__12 )
            // InternalAdeptness.g:2945:2: rule__Test__Group__11__Impl rule__Test__Group__12
            {
            pushFollow(FOLLOW_20);
            rule__Test__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__12();

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
    // $ANTLR end "rule__Test__Group__11"


    // $ANTLR start "rule__Test__Group__11__Impl"
    // InternalAdeptness.g:2952:1: rule__Test__Group__11__Impl : ( ( ( rule__Test__OraclesAssignment_11 ) ) ( ( rule__Test__OraclesAssignment_11 )* ) ) ;
    public final void rule__Test__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2956:1: ( ( ( ( rule__Test__OraclesAssignment_11 ) ) ( ( rule__Test__OraclesAssignment_11 )* ) ) )
            // InternalAdeptness.g:2957:1: ( ( ( rule__Test__OraclesAssignment_11 ) ) ( ( rule__Test__OraclesAssignment_11 )* ) )
            {
            // InternalAdeptness.g:2957:1: ( ( ( rule__Test__OraclesAssignment_11 ) ) ( ( rule__Test__OraclesAssignment_11 )* ) )
            // InternalAdeptness.g:2958:2: ( ( rule__Test__OraclesAssignment_11 ) ) ( ( rule__Test__OraclesAssignment_11 )* )
            {
            // InternalAdeptness.g:2958:2: ( ( rule__Test__OraclesAssignment_11 ) )
            // InternalAdeptness.g:2959:3: ( rule__Test__OraclesAssignment_11 )
            {
             before(grammarAccess.getTestAccess().getOraclesAssignment_11()); 
            // InternalAdeptness.g:2960:3: ( rule__Test__OraclesAssignment_11 )
            // InternalAdeptness.g:2960:4: rule__Test__OraclesAssignment_11
            {
            pushFollow(FOLLOW_21);
            rule__Test__OraclesAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getOraclesAssignment_11()); 

            }

            // InternalAdeptness.g:2963:2: ( ( rule__Test__OraclesAssignment_11 )* )
            // InternalAdeptness.g:2964:3: ( rule__Test__OraclesAssignment_11 )*
            {
             before(grammarAccess.getTestAccess().getOraclesAssignment_11()); 
            // InternalAdeptness.g:2965:3: ( rule__Test__OraclesAssignment_11 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==41) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalAdeptness.g:2965:4: rule__Test__OraclesAssignment_11
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Test__OraclesAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getOraclesAssignment_11()); 

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
    // $ANTLR end "rule__Test__Group__11__Impl"


    // $ANTLR start "rule__Test__Group__12"
    // InternalAdeptness.g:2974:1: rule__Test__Group__12 : rule__Test__Group__12__Impl ;
    public final void rule__Test__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2978:1: ( rule__Test__Group__12__Impl )
            // InternalAdeptness.g:2979:2: rule__Test__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__12__Impl();

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
    // $ANTLR end "rule__Test__Group__12"


    // $ANTLR start "rule__Test__Group__12__Impl"
    // InternalAdeptness.g:2985:1: rule__Test__Group__12__Impl : ( 'ENDTEST' ) ;
    public final void rule__Test__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2989:1: ( ( 'ENDTEST' ) )
            // InternalAdeptness.g:2990:1: ( 'ENDTEST' )
            {
            // InternalAdeptness.g:2990:1: ( 'ENDTEST' )
            // InternalAdeptness.g:2991:2: 'ENDTEST'
            {
             before(grammarAccess.getTestAccess().getENDTESTKeyword_12()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getENDTESTKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__12__Impl"


    // $ANTLR start "rule__TestingOracle__Group__0"
    // InternalAdeptness.g:3001:1: rule__TestingOracle__Group__0 : rule__TestingOracle__Group__0__Impl rule__TestingOracle__Group__1 ;
    public final void rule__TestingOracle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3005:1: ( rule__TestingOracle__Group__0__Impl rule__TestingOracle__Group__1 )
            // InternalAdeptness.g:3006:2: rule__TestingOracle__Group__0__Impl rule__TestingOracle__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__TestingOracle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestingOracle__Group__1();

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
    // $ANTLR end "rule__TestingOracle__Group__0"


    // $ANTLR start "rule__TestingOracle__Group__0__Impl"
    // InternalAdeptness.g:3013:1: rule__TestingOracle__Group__0__Impl : ( 'TESTINGORACLE' ) ;
    public final void rule__TestingOracle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3017:1: ( ( 'TESTINGORACLE' ) )
            // InternalAdeptness.g:3018:1: ( 'TESTINGORACLE' )
            {
            // InternalAdeptness.g:3018:1: ( 'TESTINGORACLE' )
            // InternalAdeptness.g:3019:2: 'TESTINGORACLE'
            {
             before(grammarAccess.getTestingOracleAccess().getTESTINGORACLEKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTestingOracleAccess().getTESTINGORACLEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestingOracle__Group__0__Impl"


    // $ANTLR start "rule__TestingOracle__Group__1"
    // InternalAdeptness.g:3028:1: rule__TestingOracle__Group__1 : rule__TestingOracle__Group__1__Impl rule__TestingOracle__Group__2 ;
    public final void rule__TestingOracle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3032:1: ( rule__TestingOracle__Group__1__Impl rule__TestingOracle__Group__2 )
            // InternalAdeptness.g:3033:2: rule__TestingOracle__Group__1__Impl rule__TestingOracle__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__TestingOracle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestingOracle__Group__2();

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
    // $ANTLR end "rule__TestingOracle__Group__1"


    // $ANTLR start "rule__TestingOracle__Group__1__Impl"
    // InternalAdeptness.g:3040:1: rule__TestingOracle__Group__1__Impl : ( ( rule__TestingOracle__NameAssignment_1 ) ) ;
    public final void rule__TestingOracle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3044:1: ( ( ( rule__TestingOracle__NameAssignment_1 ) ) )
            // InternalAdeptness.g:3045:1: ( ( rule__TestingOracle__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:3045:1: ( ( rule__TestingOracle__NameAssignment_1 ) )
            // InternalAdeptness.g:3046:2: ( rule__TestingOracle__NameAssignment_1 )
            {
             before(grammarAccess.getTestingOracleAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:3047:2: ( rule__TestingOracle__NameAssignment_1 )
            // InternalAdeptness.g:3047:3: rule__TestingOracle__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TestingOracle__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTestingOracleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestingOracle__Group__1__Impl"


    // $ANTLR start "rule__TestingOracle__Group__2"
    // InternalAdeptness.g:3055:1: rule__TestingOracle__Group__2 : rule__TestingOracle__Group__2__Impl rule__TestingOracle__Group__3 ;
    public final void rule__TestingOracle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3059:1: ( rule__TestingOracle__Group__2__Impl rule__TestingOracle__Group__3 )
            // InternalAdeptness.g:3060:2: rule__TestingOracle__Group__2__Impl rule__TestingOracle__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__TestingOracle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestingOracle__Group__3();

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
    // $ANTLR end "rule__TestingOracle__Group__2"


    // $ANTLR start "rule__TestingOracle__Group__2__Impl"
    // InternalAdeptness.g:3067:1: rule__TestingOracle__Group__2__Impl : ( ':' ) ;
    public final void rule__TestingOracle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3071:1: ( ( ':' ) )
            // InternalAdeptness.g:3072:1: ( ':' )
            {
            // InternalAdeptness.g:3072:1: ( ':' )
            // InternalAdeptness.g:3073:2: ':'
            {
             before(grammarAccess.getTestingOracleAccess().getColonKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTestingOracleAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestingOracle__Group__2__Impl"


    // $ANTLR start "rule__TestingOracle__Group__3"
    // InternalAdeptness.g:3082:1: rule__TestingOracle__Group__3 : rule__TestingOracle__Group__3__Impl rule__TestingOracle__Group__4 ;
    public final void rule__TestingOracle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3086:1: ( rule__TestingOracle__Group__3__Impl rule__TestingOracle__Group__4 )
            // InternalAdeptness.g:3087:2: rule__TestingOracle__Group__3__Impl rule__TestingOracle__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__TestingOracle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestingOracle__Group__4();

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
    // $ANTLR end "rule__TestingOracle__Group__3"


    // $ANTLR start "rule__TestingOracle__Group__3__Impl"
    // InternalAdeptness.g:3094:1: rule__TestingOracle__Group__3__Impl : ( 'Type:' ) ;
    public final void rule__TestingOracle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3098:1: ( ( 'Type:' ) )
            // InternalAdeptness.g:3099:1: ( 'Type:' )
            {
            // InternalAdeptness.g:3099:1: ( 'Type:' )
            // InternalAdeptness.g:3100:2: 'Type:'
            {
             before(grammarAccess.getTestingOracleAccess().getTypeKeyword_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTestingOracleAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestingOracle__Group__3__Impl"


    // $ANTLR start "rule__TestingOracle__Group__4"
    // InternalAdeptness.g:3109:1: rule__TestingOracle__Group__4 : rule__TestingOracle__Group__4__Impl rule__TestingOracle__Group__5 ;
    public final void rule__TestingOracle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3113:1: ( rule__TestingOracle__Group__4__Impl rule__TestingOracle__Group__5 )
            // InternalAdeptness.g:3114:2: rule__TestingOracle__Group__4__Impl rule__TestingOracle__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__TestingOracle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestingOracle__Group__5();

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
    // $ANTLR end "rule__TestingOracle__Group__4"


    // $ANTLR start "rule__TestingOracle__Group__4__Impl"
    // InternalAdeptness.g:3121:1: rule__TestingOracle__Group__4__Impl : ( ( rule__TestingOracle__TypeAssignment_4 ) ) ;
    public final void rule__TestingOracle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3125:1: ( ( ( rule__TestingOracle__TypeAssignment_4 ) ) )
            // InternalAdeptness.g:3126:1: ( ( rule__TestingOracle__TypeAssignment_4 ) )
            {
            // InternalAdeptness.g:3126:1: ( ( rule__TestingOracle__TypeAssignment_4 ) )
            // InternalAdeptness.g:3127:2: ( rule__TestingOracle__TypeAssignment_4 )
            {
             before(grammarAccess.getTestingOracleAccess().getTypeAssignment_4()); 
            // InternalAdeptness.g:3128:2: ( rule__TestingOracle__TypeAssignment_4 )
            // InternalAdeptness.g:3128:3: rule__TestingOracle__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TestingOracle__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTestingOracleAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestingOracle__Group__4__Impl"


    // $ANTLR start "rule__TestingOracle__Group__5"
    // InternalAdeptness.g:3136:1: rule__TestingOracle__Group__5 : rule__TestingOracle__Group__5__Impl rule__TestingOracle__Group__6 ;
    public final void rule__TestingOracle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3140:1: ( rule__TestingOracle__Group__5__Impl rule__TestingOracle__Group__6 )
            // InternalAdeptness.g:3141:2: rule__TestingOracle__Group__5__Impl rule__TestingOracle__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__TestingOracle__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestingOracle__Group__6();

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
    // $ANTLR end "rule__TestingOracle__Group__5"


    // $ANTLR start "rule__TestingOracle__Group__5__Impl"
    // InternalAdeptness.g:3148:1: rule__TestingOracle__Group__5__Impl : ( ',' ) ;
    public final void rule__TestingOracle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3152:1: ( ( ',' ) )
            // InternalAdeptness.g:3153:1: ( ',' )
            {
            // InternalAdeptness.g:3153:1: ( ',' )
            // InternalAdeptness.g:3154:2: ','
            {
             before(grammarAccess.getTestingOracleAccess().getCommaKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTestingOracleAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestingOracle__Group__5__Impl"


    // $ANTLR start "rule__TestingOracle__Group__6"
    // InternalAdeptness.g:3163:1: rule__TestingOracle__Group__6 : rule__TestingOracle__Group__6__Impl rule__TestingOracle__Group__7 ;
    public final void rule__TestingOracle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3167:1: ( rule__TestingOracle__Group__6__Impl rule__TestingOracle__Group__7 )
            // InternalAdeptness.g:3168:2: rule__TestingOracle__Group__6__Impl rule__TestingOracle__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__TestingOracle__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestingOracle__Group__7();

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
    // $ANTLR end "rule__TestingOracle__Group__6"


    // $ANTLR start "rule__TestingOracle__Group__6__Impl"
    // InternalAdeptness.g:3175:1: rule__TestingOracle__Group__6__Impl : ( 'Params:' ) ;
    public final void rule__TestingOracle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3179:1: ( ( 'Params:' ) )
            // InternalAdeptness.g:3180:1: ( 'Params:' )
            {
            // InternalAdeptness.g:3180:1: ( 'Params:' )
            // InternalAdeptness.g:3181:2: 'Params:'
            {
             before(grammarAccess.getTestingOracleAccess().getParamsKeyword_6()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTestingOracleAccess().getParamsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestingOracle__Group__6__Impl"


    // $ANTLR start "rule__TestingOracle__Group__7"
    // InternalAdeptness.g:3190:1: rule__TestingOracle__Group__7 : rule__TestingOracle__Group__7__Impl rule__TestingOracle__Group__8 ;
    public final void rule__TestingOracle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3194:1: ( rule__TestingOracle__Group__7__Impl rule__TestingOracle__Group__8 )
            // InternalAdeptness.g:3195:2: rule__TestingOracle__Group__7__Impl rule__TestingOracle__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__TestingOracle__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestingOracle__Group__8();

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
    // $ANTLR end "rule__TestingOracle__Group__7"


    // $ANTLR start "rule__TestingOracle__Group__7__Impl"
    // InternalAdeptness.g:3202:1: rule__TestingOracle__Group__7__Impl : ( ( ( rule__TestingOracle__ParametersAssignment_7 ) ) ( ( rule__TestingOracle__ParametersAssignment_7 )* ) ) ;
    public final void rule__TestingOracle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3206:1: ( ( ( ( rule__TestingOracle__ParametersAssignment_7 ) ) ( ( rule__TestingOracle__ParametersAssignment_7 )* ) ) )
            // InternalAdeptness.g:3207:1: ( ( ( rule__TestingOracle__ParametersAssignment_7 ) ) ( ( rule__TestingOracle__ParametersAssignment_7 )* ) )
            {
            // InternalAdeptness.g:3207:1: ( ( ( rule__TestingOracle__ParametersAssignment_7 ) ) ( ( rule__TestingOracle__ParametersAssignment_7 )* ) )
            // InternalAdeptness.g:3208:2: ( ( rule__TestingOracle__ParametersAssignment_7 ) ) ( ( rule__TestingOracle__ParametersAssignment_7 )* )
            {
            // InternalAdeptness.g:3208:2: ( ( rule__TestingOracle__ParametersAssignment_7 ) )
            // InternalAdeptness.g:3209:3: ( rule__TestingOracle__ParametersAssignment_7 )
            {
             before(grammarAccess.getTestingOracleAccess().getParametersAssignment_7()); 
            // InternalAdeptness.g:3210:3: ( rule__TestingOracle__ParametersAssignment_7 )
            // InternalAdeptness.g:3210:4: rule__TestingOracle__ParametersAssignment_7
            {
            pushFollow(FOLLOW_4);
            rule__TestingOracle__ParametersAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTestingOracleAccess().getParametersAssignment_7()); 

            }

            // InternalAdeptness.g:3213:2: ( ( rule__TestingOracle__ParametersAssignment_7 )* )
            // InternalAdeptness.g:3214:3: ( rule__TestingOracle__ParametersAssignment_7 )*
            {
             before(grammarAccess.getTestingOracleAccess().getParametersAssignment_7()); 
            // InternalAdeptness.g:3215:3: ( rule__TestingOracle__ParametersAssignment_7 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==EOF||(LA35_0>=RULE_ID && LA35_0<=RULE_INT)||LA35_0==11||LA35_0==25||LA35_0==37||(LA35_0>=60 && LA35_0<=62)||LA35_0==65||(LA35_0>=71 && LA35_0<=78)||(LA35_0>=80 && LA35_0<=81)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAdeptness.g:3215:4: rule__TestingOracle__ParametersAssignment_7
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__TestingOracle__ParametersAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getTestingOracleAccess().getParametersAssignment_7()); 

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
    // $ANTLR end "rule__TestingOracle__Group__7__Impl"


    // $ANTLR start "rule__TestingOracle__Group__8"
    // InternalAdeptness.g:3224:1: rule__TestingOracle__Group__8 : rule__TestingOracle__Group__8__Impl ;
    public final void rule__TestingOracle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3228:1: ( rule__TestingOracle__Group__8__Impl )
            // InternalAdeptness.g:3229:2: rule__TestingOracle__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TestingOracle__Group__8__Impl();

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
    // $ANTLR end "rule__TestingOracle__Group__8"


    // $ANTLR start "rule__TestingOracle__Group__8__Impl"
    // InternalAdeptness.g:3235:1: rule__TestingOracle__Group__8__Impl : ( 'ENDTESTINGORACLE' ) ;
    public final void rule__TestingOracle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3239:1: ( ( 'ENDTESTINGORACLE' ) )
            // InternalAdeptness.g:3240:1: ( 'ENDTESTINGORACLE' )
            {
            // InternalAdeptness.g:3240:1: ( 'ENDTESTINGORACLE' )
            // InternalAdeptness.g:3241:2: 'ENDTESTINGORACLE'
            {
             before(grammarAccess.getTestingOracleAccess().getENDTESTINGORACLEKeyword_8()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTestingOracleAccess().getENDTESTINGORACLEKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestingOracle__Group__8__Impl"


    // $ANTLR start "rule__Parameters__Group__0"
    // InternalAdeptness.g:3251:1: rule__Parameters__Group__0 : rule__Parameters__Group__0__Impl rule__Parameters__Group__1 ;
    public final void rule__Parameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3255:1: ( rule__Parameters__Group__0__Impl rule__Parameters__Group__1 )
            // InternalAdeptness.g:3256:2: rule__Parameters__Group__0__Impl rule__Parameters__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Parameters__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameters__Group__1();

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
    // $ANTLR end "rule__Parameters__Group__0"


    // $ANTLR start "rule__Parameters__Group__0__Impl"
    // InternalAdeptness.g:3263:1: rule__Parameters__Group__0__Impl : ( ( rule__Parameters__ValueAssignment_0 ) ) ;
    public final void rule__Parameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3267:1: ( ( ( rule__Parameters__ValueAssignment_0 ) ) )
            // InternalAdeptness.g:3268:1: ( ( rule__Parameters__ValueAssignment_0 ) )
            {
            // InternalAdeptness.g:3268:1: ( ( rule__Parameters__ValueAssignment_0 ) )
            // InternalAdeptness.g:3269:2: ( rule__Parameters__ValueAssignment_0 )
            {
             before(grammarAccess.getParametersAccess().getValueAssignment_0()); 
            // InternalAdeptness.g:3270:2: ( rule__Parameters__ValueAssignment_0 )
            // InternalAdeptness.g:3270:3: rule__Parameters__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParametersAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__0__Impl"


    // $ANTLR start "rule__Parameters__Group__1"
    // InternalAdeptness.g:3278:1: rule__Parameters__Group__1 : rule__Parameters__Group__1__Impl ;
    public final void rule__Parameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3282:1: ( rule__Parameters__Group__1__Impl )
            // InternalAdeptness.g:3283:2: rule__Parameters__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__Group__1__Impl();

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
    // $ANTLR end "rule__Parameters__Group__1"


    // $ANTLR start "rule__Parameters__Group__1__Impl"
    // InternalAdeptness.g:3289:1: rule__Parameters__Group__1__Impl : ( ',' ) ;
    public final void rule__Parameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3293:1: ( ( ',' ) )
            // InternalAdeptness.g:3294:1: ( ',' )
            {
            // InternalAdeptness.g:3294:1: ( ',' )
            // InternalAdeptness.g:3295:2: ','
            {
             before(grammarAccess.getParametersAccess().getCommaKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getParametersAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__1__Impl"


    // $ANTLR start "rule__Inputs__Group__0"
    // InternalAdeptness.g:3305:1: rule__Inputs__Group__0 : rule__Inputs__Group__0__Impl rule__Inputs__Group__1 ;
    public final void rule__Inputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3309:1: ( rule__Inputs__Group__0__Impl rule__Inputs__Group__1 )
            // InternalAdeptness.g:3310:2: rule__Inputs__Group__0__Impl rule__Inputs__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Inputs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inputs__Group__1();

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
    // $ANTLR end "rule__Inputs__Group__0"


    // $ANTLR start "rule__Inputs__Group__0__Impl"
    // InternalAdeptness.g:3317:1: rule__Inputs__Group__0__Impl : ( ( rule__Inputs__ValueAssignment_0 ) ) ;
    public final void rule__Inputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3321:1: ( ( ( rule__Inputs__ValueAssignment_0 ) ) )
            // InternalAdeptness.g:3322:1: ( ( rule__Inputs__ValueAssignment_0 ) )
            {
            // InternalAdeptness.g:3322:1: ( ( rule__Inputs__ValueAssignment_0 ) )
            // InternalAdeptness.g:3323:2: ( rule__Inputs__ValueAssignment_0 )
            {
             before(grammarAccess.getInputsAccess().getValueAssignment_0()); 
            // InternalAdeptness.g:3324:2: ( rule__Inputs__ValueAssignment_0 )
            // InternalAdeptness.g:3324:3: rule__Inputs__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Inputs__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInputsAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group__0__Impl"


    // $ANTLR start "rule__Inputs__Group__1"
    // InternalAdeptness.g:3332:1: rule__Inputs__Group__1 : rule__Inputs__Group__1__Impl ;
    public final void rule__Inputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3336:1: ( rule__Inputs__Group__1__Impl )
            // InternalAdeptness.g:3337:2: rule__Inputs__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inputs__Group__1__Impl();

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
    // $ANTLR end "rule__Inputs__Group__1"


    // $ANTLR start "rule__Inputs__Group__1__Impl"
    // InternalAdeptness.g:3343:1: rule__Inputs__Group__1__Impl : ( ',' ) ;
    public final void rule__Inputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3347:1: ( ( ',' ) )
            // InternalAdeptness.g:3348:1: ( ',' )
            {
            // InternalAdeptness.g:3348:1: ( ',' )
            // InternalAdeptness.g:3349:2: ','
            {
             before(grammarAccess.getInputsAccess().getCommaKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getInputsAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group__1__Impl"


    // $ANTLR start "rule__MonitoringFile__Group__0"
    // InternalAdeptness.g:3359:1: rule__MonitoringFile__Group__0 : rule__MonitoringFile__Group__0__Impl rule__MonitoringFile__Group__1 ;
    public final void rule__MonitoringFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3363:1: ( rule__MonitoringFile__Group__0__Impl rule__MonitoringFile__Group__1 )
            // InternalAdeptness.g:3364:2: rule__MonitoringFile__Group__0__Impl rule__MonitoringFile__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MonitoringFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitoringFile__Group__1();

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
    // $ANTLR end "rule__MonitoringFile__Group__0"


    // $ANTLR start "rule__MonitoringFile__Group__0__Impl"
    // InternalAdeptness.g:3371:1: rule__MonitoringFile__Group__0__Impl : ( 'MONITORINGPLAN' ) ;
    public final void rule__MonitoringFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3375:1: ( ( 'MONITORINGPLAN' ) )
            // InternalAdeptness.g:3376:1: ( 'MONITORINGPLAN' )
            {
            // InternalAdeptness.g:3376:1: ( 'MONITORINGPLAN' )
            // InternalAdeptness.g:3377:2: 'MONITORINGPLAN'
            {
             before(grammarAccess.getMonitoringFileAccess().getMONITORINGPLANKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMonitoringFileAccess().getMONITORINGPLANKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringFile__Group__0__Impl"


    // $ANTLR start "rule__MonitoringFile__Group__1"
    // InternalAdeptness.g:3386:1: rule__MonitoringFile__Group__1 : rule__MonitoringFile__Group__1__Impl rule__MonitoringFile__Group__2 ;
    public final void rule__MonitoringFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3390:1: ( rule__MonitoringFile__Group__1__Impl rule__MonitoringFile__Group__2 )
            // InternalAdeptness.g:3391:2: rule__MonitoringFile__Group__1__Impl rule__MonitoringFile__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__MonitoringFile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitoringFile__Group__2();

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
    // $ANTLR end "rule__MonitoringFile__Group__1"


    // $ANTLR start "rule__MonitoringFile__Group__1__Impl"
    // InternalAdeptness.g:3398:1: rule__MonitoringFile__Group__1__Impl : ( ( rule__MonitoringFile__NameAssignment_1 ) ) ;
    public final void rule__MonitoringFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3402:1: ( ( ( rule__MonitoringFile__NameAssignment_1 ) ) )
            // InternalAdeptness.g:3403:1: ( ( rule__MonitoringFile__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:3403:1: ( ( rule__MonitoringFile__NameAssignment_1 ) )
            // InternalAdeptness.g:3404:2: ( rule__MonitoringFile__NameAssignment_1 )
            {
             before(grammarAccess.getMonitoringFileAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:3405:2: ( rule__MonitoringFile__NameAssignment_1 )
            // InternalAdeptness.g:3405:3: rule__MonitoringFile__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MonitoringFile__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMonitoringFileAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringFile__Group__1__Impl"


    // $ANTLR start "rule__MonitoringFile__Group__2"
    // InternalAdeptness.g:3413:1: rule__MonitoringFile__Group__2 : rule__MonitoringFile__Group__2__Impl rule__MonitoringFile__Group__3 ;
    public final void rule__MonitoringFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3417:1: ( rule__MonitoringFile__Group__2__Impl rule__MonitoringFile__Group__3 )
            // InternalAdeptness.g:3418:2: rule__MonitoringFile__Group__2__Impl rule__MonitoringFile__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__MonitoringFile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitoringFile__Group__3();

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
    // $ANTLR end "rule__MonitoringFile__Group__2"


    // $ANTLR start "rule__MonitoringFile__Group__2__Impl"
    // InternalAdeptness.g:3425:1: rule__MonitoringFile__Group__2__Impl : ( ':' ) ;
    public final void rule__MonitoringFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3429:1: ( ( ':' ) )
            // InternalAdeptness.g:3430:1: ( ':' )
            {
            // InternalAdeptness.g:3430:1: ( ':' )
            // InternalAdeptness.g:3431:2: ':'
            {
             before(grammarAccess.getMonitoringFileAccess().getColonKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMonitoringFileAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringFile__Group__2__Impl"


    // $ANTLR start "rule__MonitoringFile__Group__3"
    // InternalAdeptness.g:3440:1: rule__MonitoringFile__Group__3 : rule__MonitoringFile__Group__3__Impl rule__MonitoringFile__Group__4 ;
    public final void rule__MonitoringFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3444:1: ( rule__MonitoringFile__Group__3__Impl rule__MonitoringFile__Group__4 )
            // InternalAdeptness.g:3445:2: rule__MonitoringFile__Group__3__Impl rule__MonitoringFile__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__MonitoringFile__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitoringFile__Group__4();

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
    // $ANTLR end "rule__MonitoringFile__Group__3"


    // $ANTLR start "rule__MonitoringFile__Group__3__Impl"
    // InternalAdeptness.g:3452:1: rule__MonitoringFile__Group__3__Impl : ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) ) ;
    public final void rule__MonitoringFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3456:1: ( ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) ) )
            // InternalAdeptness.g:3457:1: ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) )
            {
            // InternalAdeptness.g:3457:1: ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) )
            // InternalAdeptness.g:3458:2: ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* )
            {
            // InternalAdeptness.g:3458:2: ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) )
            // InternalAdeptness.g:3459:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )
            {
             before(grammarAccess.getMonitoringFileAccess().getMonitoringPlanAssignment_3()); 
            // InternalAdeptness.g:3460:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )
            // InternalAdeptness.g:3460:4: rule__MonitoringFile__MonitoringPlanAssignment_3
            {
            pushFollow(FOLLOW_28);
            rule__MonitoringFile__MonitoringPlanAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMonitoringFileAccess().getMonitoringPlanAssignment_3()); 

            }

            // InternalAdeptness.g:3463:2: ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* )
            // InternalAdeptness.g:3464:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )*
            {
             before(grammarAccess.getMonitoringFileAccess().getMonitoringPlanAssignment_3()); 
            // InternalAdeptness.g:3465:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==47) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAdeptness.g:3465:4: rule__MonitoringFile__MonitoringPlanAssignment_3
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__MonitoringFile__MonitoringPlanAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getMonitoringFileAccess().getMonitoringPlanAssignment_3()); 

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
    // $ANTLR end "rule__MonitoringFile__Group__3__Impl"


    // $ANTLR start "rule__MonitoringFile__Group__4"
    // InternalAdeptness.g:3474:1: rule__MonitoringFile__Group__4 : rule__MonitoringFile__Group__4__Impl ;
    public final void rule__MonitoringFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3478:1: ( rule__MonitoringFile__Group__4__Impl )
            // InternalAdeptness.g:3479:2: rule__MonitoringFile__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MonitoringFile__Group__4__Impl();

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
    // $ANTLR end "rule__MonitoringFile__Group__4"


    // $ANTLR start "rule__MonitoringFile__Group__4__Impl"
    // InternalAdeptness.g:3485:1: rule__MonitoringFile__Group__4__Impl : ( 'ENDMONITORINGPLAN' ) ;
    public final void rule__MonitoringFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3489:1: ( ( 'ENDMONITORINGPLAN' ) )
            // InternalAdeptness.g:3490:1: ( 'ENDMONITORINGPLAN' )
            {
            // InternalAdeptness.g:3490:1: ( 'ENDMONITORINGPLAN' )
            // InternalAdeptness.g:3491:2: 'ENDMONITORINGPLAN'
            {
             before(grammarAccess.getMonitoringFileAccess().getENDMONITORINGPLANKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMonitoringFileAccess().getENDMONITORINGPLANKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringFile__Group__4__Impl"


    // $ANTLR start "rule__MonitoringVariable__Group__0"
    // InternalAdeptness.g:3501:1: rule__MonitoringVariable__Group__0 : rule__MonitoringVariable__Group__0__Impl rule__MonitoringVariable__Group__1 ;
    public final void rule__MonitoringVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3505:1: ( rule__MonitoringVariable__Group__0__Impl rule__MonitoringVariable__Group__1 )
            // InternalAdeptness.g:3506:2: rule__MonitoringVariable__Group__0__Impl rule__MonitoringVariable__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MonitoringVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitoringVariable__Group__1();

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
    // $ANTLR end "rule__MonitoringVariable__Group__0"


    // $ANTLR start "rule__MonitoringVariable__Group__0__Impl"
    // InternalAdeptness.g:3513:1: rule__MonitoringVariable__Group__0__Impl : ( 'MONITOR' ) ;
    public final void rule__MonitoringVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3517:1: ( ( 'MONITOR' ) )
            // InternalAdeptness.g:3518:1: ( 'MONITOR' )
            {
            // InternalAdeptness.g:3518:1: ( 'MONITOR' )
            // InternalAdeptness.g:3519:2: 'MONITOR'
            {
             before(grammarAccess.getMonitoringVariableAccess().getMONITORKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMonitoringVariableAccess().getMONITORKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringVariable__Group__0__Impl"


    // $ANTLR start "rule__MonitoringVariable__Group__1"
    // InternalAdeptness.g:3528:1: rule__MonitoringVariable__Group__1 : rule__MonitoringVariable__Group__1__Impl rule__MonitoringVariable__Group__2 ;
    public final void rule__MonitoringVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3532:1: ( rule__MonitoringVariable__Group__1__Impl rule__MonitoringVariable__Group__2 )
            // InternalAdeptness.g:3533:2: rule__MonitoringVariable__Group__1__Impl rule__MonitoringVariable__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__MonitoringVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitoringVariable__Group__2();

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
    // $ANTLR end "rule__MonitoringVariable__Group__1"


    // $ANTLR start "rule__MonitoringVariable__Group__1__Impl"
    // InternalAdeptness.g:3540:1: rule__MonitoringVariable__Group__1__Impl : ( ( rule__MonitoringVariable__NameAssignment_1 ) ) ;
    public final void rule__MonitoringVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3544:1: ( ( ( rule__MonitoringVariable__NameAssignment_1 ) ) )
            // InternalAdeptness.g:3545:1: ( ( rule__MonitoringVariable__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:3545:1: ( ( rule__MonitoringVariable__NameAssignment_1 ) )
            // InternalAdeptness.g:3546:2: ( rule__MonitoringVariable__NameAssignment_1 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:3547:2: ( rule__MonitoringVariable__NameAssignment_1 )
            // InternalAdeptness.g:3547:3: rule__MonitoringVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MonitoringVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMonitoringVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringVariable__Group__1__Impl"


    // $ANTLR start "rule__MonitoringVariable__Group__2"
    // InternalAdeptness.g:3555:1: rule__MonitoringVariable__Group__2 : rule__MonitoringVariable__Group__2__Impl rule__MonitoringVariable__Group__3 ;
    public final void rule__MonitoringVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3559:1: ( rule__MonitoringVariable__Group__2__Impl rule__MonitoringVariable__Group__3 )
            // InternalAdeptness.g:3560:2: rule__MonitoringVariable__Group__2__Impl rule__MonitoringVariable__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__MonitoringVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitoringVariable__Group__3();

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
    // $ANTLR end "rule__MonitoringVariable__Group__2"


    // $ANTLR start "rule__MonitoringVariable__Group__2__Impl"
    // InternalAdeptness.g:3567:1: rule__MonitoringVariable__Group__2__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3571:1: ( ( ':' ) )
            // InternalAdeptness.g:3572:1: ( ':' )
            {
            // InternalAdeptness.g:3572:1: ( ':' )
            // InternalAdeptness.g:3573:2: ':'
            {
             before(grammarAccess.getMonitoringVariableAccess().getColonKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMonitoringVariableAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringVariable__Group__2__Impl"


    // $ANTLR start "rule__MonitoringVariable__Group__3"
    // InternalAdeptness.g:3582:1: rule__MonitoringVariable__Group__3 : rule__MonitoringVariable__Group__3__Impl rule__MonitoringVariable__Group__4 ;
    public final void rule__MonitoringVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3586:1: ( rule__MonitoringVariable__Group__3__Impl rule__MonitoringVariable__Group__4 )
            // InternalAdeptness.g:3587:2: rule__MonitoringVariable__Group__3__Impl rule__MonitoringVariable__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__MonitoringVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitoringVariable__Group__4();

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
    // $ANTLR end "rule__MonitoringVariable__Group__3"


    // $ANTLR start "rule__MonitoringVariable__Group__3__Impl"
    // InternalAdeptness.g:3594:1: rule__MonitoringVariable__Group__3__Impl : ( 'type' ) ;
    public final void rule__MonitoringVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3598:1: ( ( 'type' ) )
            // InternalAdeptness.g:3599:1: ( 'type' )
            {
            // InternalAdeptness.g:3599:1: ( 'type' )
            // InternalAdeptness.g:3600:2: 'type'
            {
             before(grammarAccess.getMonitoringVariableAccess().getTypeKeyword_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getMonitoringVariableAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringVariable__Group__3__Impl"


    // $ANTLR start "rule__MonitoringVariable__Group__4"
    // InternalAdeptness.g:3609:1: rule__MonitoringVariable__Group__4 : rule__MonitoringVariable__Group__4__Impl rule__MonitoringVariable__Group__5 ;
    public final void rule__MonitoringVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3613:1: ( rule__MonitoringVariable__Group__4__Impl rule__MonitoringVariable__Group__5 )
            // InternalAdeptness.g:3614:2: rule__MonitoringVariable__Group__4__Impl rule__MonitoringVariable__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__MonitoringVariable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitoringVariable__Group__5();

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
    // $ANTLR end "rule__MonitoringVariable__Group__4"


    // $ANTLR start "rule__MonitoringVariable__Group__4__Impl"
    // InternalAdeptness.g:3621:1: rule__MonitoringVariable__Group__4__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3625:1: ( ( ':' ) )
            // InternalAdeptness.g:3626:1: ( ':' )
            {
            // InternalAdeptness.g:3626:1: ( ':' )
            // InternalAdeptness.g:3627:2: ':'
            {
             before(grammarAccess.getMonitoringVariableAccess().getColonKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMonitoringVariableAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringVariable__Group__4__Impl"


    // $ANTLR start "rule__MonitoringVariable__Group__5"
    // InternalAdeptness.g:3636:1: rule__MonitoringVariable__Group__5 : rule__MonitoringVariable__Group__5__Impl rule__MonitoringVariable__Group__6 ;
    public final void rule__MonitoringVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3640:1: ( rule__MonitoringVariable__Group__5__Impl rule__MonitoringVariable__Group__6 )
            // InternalAdeptness.g:3641:2: rule__MonitoringVariable__Group__5__Impl rule__MonitoringVariable__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__MonitoringVariable__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitoringVariable__Group__6();

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
    // $ANTLR end "rule__MonitoringVariable__Group__5"


    // $ANTLR start "rule__MonitoringVariable__Group__5__Impl"
    // InternalAdeptness.g:3648:1: rule__MonitoringVariable__Group__5__Impl : ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) ) ;
    public final void rule__MonitoringVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3652:1: ( ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) ) )
            // InternalAdeptness.g:3653:1: ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) )
            {
            // InternalAdeptness.g:3653:1: ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) )
            // InternalAdeptness.g:3654:2: ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getMonitoringVariableDatatypeAssignment_5()); 
            // InternalAdeptness.g:3655:2: ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 )
            // InternalAdeptness.g:3655:3: rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMonitoringVariableAccess().getMonitoringVariableDatatypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringVariable__Group__5__Impl"


    // $ANTLR start "rule__MonitoringVariable__Group__6"
    // InternalAdeptness.g:3663:1: rule__MonitoringVariable__Group__6 : rule__MonitoringVariable__Group__6__Impl rule__MonitoringVariable__Group__7 ;
    public final void rule__MonitoringVariable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3667:1: ( rule__MonitoringVariable__Group__6__Impl rule__MonitoringVariable__Group__7 )
            // InternalAdeptness.g:3668:2: rule__MonitoringVariable__Group__6__Impl rule__MonitoringVariable__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__MonitoringVariable__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitoringVariable__Group__7();

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
    // $ANTLR end "rule__MonitoringVariable__Group__6"


    // $ANTLR start "rule__MonitoringVariable__Group__6__Impl"
    // InternalAdeptness.g:3675:1: rule__MonitoringVariable__Group__6__Impl : ( ( rule__MonitoringVariable__Group_6__0 )? ) ;
    public final void rule__MonitoringVariable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3679:1: ( ( ( rule__MonitoringVariable__Group_6__0 )? ) )
            // InternalAdeptness.g:3680:1: ( ( rule__MonitoringVariable__Group_6__0 )? )
            {
            // InternalAdeptness.g:3680:1: ( ( rule__MonitoringVariable__Group_6__0 )? )
            // InternalAdeptness.g:3681:2: ( rule__MonitoringVariable__Group_6__0 )?
            {
             before(grammarAccess.getMonitoringVariableAccess().getGroup_6()); 
            // InternalAdeptness.g:3682:2: ( rule__MonitoringVariable__Group_6__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==50) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAdeptness.g:3682:3: rule__MonitoringVariable__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MonitoringVariable__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMonitoringVariableAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringVariable__Group__6__Impl"


    // $ANTLR start "rule__MonitoringVariable__Group__7"
    // InternalAdeptness.g:3690:1: rule__MonitoringVariable__Group__7 : rule__MonitoringVariable__Group__7__Impl ;
    public final void rule__MonitoringVariable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3694:1: ( rule__MonitoringVariable__Group__7__Impl )
            // InternalAdeptness.g:3695:2: rule__MonitoringVariable__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MonitoringVariable__Group__7__Impl();

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
    // $ANTLR end "rule__MonitoringVariable__Group__7"


    // $ANTLR start "rule__MonitoringVariable__Group__7__Impl"
    // InternalAdeptness.g:3701:1: rule__MonitoringVariable__Group__7__Impl : ( 'ENDMONITOR' ) ;
    public final void rule__MonitoringVariable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3705:1: ( ( 'ENDMONITOR' ) )
            // InternalAdeptness.g:3706:1: ( 'ENDMONITOR' )
            {
            // InternalAdeptness.g:3706:1: ( 'ENDMONITOR' )
            // InternalAdeptness.g:3707:2: 'ENDMONITOR'
            {
             before(grammarAccess.getMonitoringVariableAccess().getENDMONITORKeyword_7()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMonitoringVariableAccess().getENDMONITORKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringVariable__Group__7__Impl"


    // $ANTLR start "rule__MonitoringVariable__Group_6__0"
    // InternalAdeptness.g:3717:1: rule__MonitoringVariable__Group_6__0 : rule__MonitoringVariable__Group_6__0__Impl rule__MonitoringVariable__Group_6__1 ;
    public final void rule__MonitoringVariable__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3721:1: ( rule__MonitoringVariable__Group_6__0__Impl rule__MonitoringVariable__Group_6__1 )
            // InternalAdeptness.g:3722:2: rule__MonitoringVariable__Group_6__0__Impl rule__MonitoringVariable__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__MonitoringVariable__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitoringVariable__Group_6__1();

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
    // $ANTLR end "rule__MonitoringVariable__Group_6__0"


    // $ANTLR start "rule__MonitoringVariable__Group_6__0__Impl"
    // InternalAdeptness.g:3729:1: rule__MonitoringVariable__Group_6__0__Impl : ( 'max' ) ;
    public final void rule__MonitoringVariable__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3733:1: ( ( 'max' ) )
            // InternalAdeptness.g:3734:1: ( 'max' )
            {
            // InternalAdeptness.g:3734:1: ( 'max' )
            // InternalAdeptness.g:3735:2: 'max'
            {
             before(grammarAccess.getMonitoringVariableAccess().getMaxKeyword_6_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMonitoringVariableAccess().getMaxKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringVariable__Group_6__0__Impl"


    // $ANTLR start "rule__MonitoringVariable__Group_6__1"
    // InternalAdeptness.g:3744:1: rule__MonitoringVariable__Group_6__1 : rule__MonitoringVariable__Group_6__1__Impl rule__MonitoringVariable__Group_6__2 ;
    public final void rule__MonitoringVariable__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3748:1: ( rule__MonitoringVariable__Group_6__1__Impl rule__MonitoringVariable__Group_6__2 )
            // InternalAdeptness.g:3749:2: rule__MonitoringVariable__Group_6__1__Impl rule__MonitoringVariable__Group_6__2
            {
            pushFollow(FOLLOW_24);
            rule__MonitoringVariable__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitoringVariable__Group_6__2();

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
    // $ANTLR end "rule__MonitoringVariable__Group_6__1"


    // $ANTLR start "rule__MonitoringVariable__Group_6__1__Impl"
    // InternalAdeptness.g:3756:1: rule__MonitoringVariable__Group_6__1__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3760:1: ( ( ':' ) )
            // InternalAdeptness.g:3761:1: ( ':' )
            {
            // InternalAdeptness.g:3761:1: ( ':' )
            // InternalAdeptness.g:3762:2: ':'
            {
             before(grammarAccess.getMonitoringVariableAccess().getColonKeyword_6_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMonitoringVariableAccess().getColonKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringVariable__Group_6__1__Impl"


    // $ANTLR start "rule__MonitoringVariable__Group_6__2"
    // InternalAdeptness.g:3771:1: rule__MonitoringVariable__Group_6__2 : rule__MonitoringVariable__Group_6__2__Impl rule__MonitoringVariable__Group_6__3 ;
    public final void rule__MonitoringVariable__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3775:1: ( rule__MonitoringVariable__Group_6__2__Impl rule__MonitoringVariable__Group_6__3 )
            // InternalAdeptness.g:3776:2: rule__MonitoringVariable__Group_6__2__Impl rule__MonitoringVariable__Group_6__3
            {
            pushFollow(FOLLOW_32);
            rule__MonitoringVariable__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitoringVariable__Group_6__3();

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
    // $ANTLR end "rule__MonitoringVariable__Group_6__2"


    // $ANTLR start "rule__MonitoringVariable__Group_6__2__Impl"
    // InternalAdeptness.g:3783:1: rule__MonitoringVariable__Group_6__2__Impl : ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) ) ;
    public final void rule__MonitoringVariable__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3787:1: ( ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) ) )
            // InternalAdeptness.g:3788:1: ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) )
            {
            // InternalAdeptness.g:3788:1: ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) )
            // InternalAdeptness.g:3789:2: ( rule__MonitoringVariable__MaxAssignment_6_2 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getMaxAssignment_6_2()); 
            // InternalAdeptness.g:3790:2: ( rule__MonitoringVariable__MaxAssignment_6_2 )
            // InternalAdeptness.g:3790:3: rule__MonitoringVariable__MaxAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__MonitoringVariable__MaxAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getMonitoringVariableAccess().getMaxAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringVariable__Group_6__2__Impl"


    // $ANTLR start "rule__MonitoringVariable__Group_6__3"
    // InternalAdeptness.g:3798:1: rule__MonitoringVariable__Group_6__3 : rule__MonitoringVariable__Group_6__3__Impl rule__MonitoringVariable__Group_6__4 ;
    public final void rule__MonitoringVariable__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3802:1: ( rule__MonitoringVariable__Group_6__3__Impl rule__MonitoringVariable__Group_6__4 )
            // InternalAdeptness.g:3803:2: rule__MonitoringVariable__Group_6__3__Impl rule__MonitoringVariable__Group_6__4
            {
            pushFollow(FOLLOW_9);
            rule__MonitoringVariable__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitoringVariable__Group_6__4();

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
    // $ANTLR end "rule__MonitoringVariable__Group_6__3"


    // $ANTLR start "rule__MonitoringVariable__Group_6__3__Impl"
    // InternalAdeptness.g:3810:1: rule__MonitoringVariable__Group_6__3__Impl : ( 'min' ) ;
    public final void rule__MonitoringVariable__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3814:1: ( ( 'min' ) )
            // InternalAdeptness.g:3815:1: ( 'min' )
            {
            // InternalAdeptness.g:3815:1: ( 'min' )
            // InternalAdeptness.g:3816:2: 'min'
            {
             before(grammarAccess.getMonitoringVariableAccess().getMinKeyword_6_3()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMonitoringVariableAccess().getMinKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringVariable__Group_6__3__Impl"


    // $ANTLR start "rule__MonitoringVariable__Group_6__4"
    // InternalAdeptness.g:3825:1: rule__MonitoringVariable__Group_6__4 : rule__MonitoringVariable__Group_6__4__Impl rule__MonitoringVariable__Group_6__5 ;
    public final void rule__MonitoringVariable__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3829:1: ( rule__MonitoringVariable__Group_6__4__Impl rule__MonitoringVariable__Group_6__5 )
            // InternalAdeptness.g:3830:2: rule__MonitoringVariable__Group_6__4__Impl rule__MonitoringVariable__Group_6__5
            {
            pushFollow(FOLLOW_24);
            rule__MonitoringVariable__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitoringVariable__Group_6__5();

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
    // $ANTLR end "rule__MonitoringVariable__Group_6__4"


    // $ANTLR start "rule__MonitoringVariable__Group_6__4__Impl"
    // InternalAdeptness.g:3837:1: rule__MonitoringVariable__Group_6__4__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3841:1: ( ( ':' ) )
            // InternalAdeptness.g:3842:1: ( ':' )
            {
            // InternalAdeptness.g:3842:1: ( ':' )
            // InternalAdeptness.g:3843:2: ':'
            {
             before(grammarAccess.getMonitoringVariableAccess().getColonKeyword_6_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMonitoringVariableAccess().getColonKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringVariable__Group_6__4__Impl"


    // $ANTLR start "rule__MonitoringVariable__Group_6__5"
    // InternalAdeptness.g:3852:1: rule__MonitoringVariable__Group_6__5 : rule__MonitoringVariable__Group_6__5__Impl ;
    public final void rule__MonitoringVariable__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3856:1: ( rule__MonitoringVariable__Group_6__5__Impl )
            // InternalAdeptness.g:3857:2: rule__MonitoringVariable__Group_6__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MonitoringVariable__Group_6__5__Impl();

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
    // $ANTLR end "rule__MonitoringVariable__Group_6__5"


    // $ANTLR start "rule__MonitoringVariable__Group_6__5__Impl"
    // InternalAdeptness.g:3863:1: rule__MonitoringVariable__Group_6__5__Impl : ( ( rule__MonitoringVariable__MinAssignment_6_5 ) ) ;
    public final void rule__MonitoringVariable__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3867:1: ( ( ( rule__MonitoringVariable__MinAssignment_6_5 ) ) )
            // InternalAdeptness.g:3868:1: ( ( rule__MonitoringVariable__MinAssignment_6_5 ) )
            {
            // InternalAdeptness.g:3868:1: ( ( rule__MonitoringVariable__MinAssignment_6_5 ) )
            // InternalAdeptness.g:3869:2: ( rule__MonitoringVariable__MinAssignment_6_5 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getMinAssignment_6_5()); 
            // InternalAdeptness.g:3870:2: ( rule__MonitoringVariable__MinAssignment_6_5 )
            // InternalAdeptness.g:3870:3: rule__MonitoringVariable__MinAssignment_6_5
            {
            pushFollow(FOLLOW_2);
            rule__MonitoringVariable__MinAssignment_6_5();

            state._fsp--;


            }

             after(grammarAccess.getMonitoringVariableAccess().getMinAssignment_6_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringVariable__Group_6__5__Impl"


    // $ANTLR start "rule__Signal__Group__0"
    // InternalAdeptness.g:3879:1: rule__Signal__Group__0 : rule__Signal__Group__0__Impl rule__Signal__Group__1 ;
    public final void rule__Signal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3883:1: ( rule__Signal__Group__0__Impl rule__Signal__Group__1 )
            // InternalAdeptness.g:3884:2: rule__Signal__Group__0__Impl rule__Signal__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalAdeptness.g:3891:1: rule__Signal__Group__0__Impl : ( 'CPS' ) ;
    public final void rule__Signal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3895:1: ( ( 'CPS' ) )
            // InternalAdeptness.g:3896:1: ( 'CPS' )
            {
            // InternalAdeptness.g:3896:1: ( 'CPS' )
            // InternalAdeptness.g:3897:2: 'CPS'
            {
             before(grammarAccess.getSignalAccess().getCPSKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalAdeptness.g:3906:1: rule__Signal__Group__1 : rule__Signal__Group__1__Impl rule__Signal__Group__2 ;
    public final void rule__Signal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3910:1: ( rule__Signal__Group__1__Impl rule__Signal__Group__2 )
            // InternalAdeptness.g:3911:2: rule__Signal__Group__1__Impl rule__Signal__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalAdeptness.g:3918:1: rule__Signal__Group__1__Impl : ( ( rule__Signal__NameAssignment_1 ) ) ;
    public final void rule__Signal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3922:1: ( ( ( rule__Signal__NameAssignment_1 ) ) )
            // InternalAdeptness.g:3923:1: ( ( rule__Signal__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:3923:1: ( ( rule__Signal__NameAssignment_1 ) )
            // InternalAdeptness.g:3924:2: ( rule__Signal__NameAssignment_1 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:3925:2: ( rule__Signal__NameAssignment_1 )
            // InternalAdeptness.g:3925:3: rule__Signal__NameAssignment_1
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
    // InternalAdeptness.g:3933:1: rule__Signal__Group__2 : rule__Signal__Group__2__Impl rule__Signal__Group__3 ;
    public final void rule__Signal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3937:1: ( rule__Signal__Group__2__Impl rule__Signal__Group__3 )
            // InternalAdeptness.g:3938:2: rule__Signal__Group__2__Impl rule__Signal__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalAdeptness.g:3945:1: rule__Signal__Group__2__Impl : ( ( rule__Signal__Group_2__0 )? ) ;
    public final void rule__Signal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3949:1: ( ( ( rule__Signal__Group_2__0 )? ) )
            // InternalAdeptness.g:3950:1: ( ( rule__Signal__Group_2__0 )? )
            {
            // InternalAdeptness.g:3950:1: ( ( rule__Signal__Group_2__0 )? )
            // InternalAdeptness.g:3951:2: ( rule__Signal__Group_2__0 )?
            {
             before(grammarAccess.getSignalAccess().getGroup_2()); 
            // InternalAdeptness.g:3952:2: ( rule__Signal__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==54) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAdeptness.g:3952:3: rule__Signal__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signal__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignalAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalAdeptness.g:3960:1: rule__Signal__Group__3 : rule__Signal__Group__3__Impl rule__Signal__Group__4 ;
    public final void rule__Signal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3964:1: ( rule__Signal__Group__3__Impl rule__Signal__Group__4 )
            // InternalAdeptness.g:3965:2: rule__Signal__Group__3__Impl rule__Signal__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalAdeptness.g:3972:1: rule__Signal__Group__3__Impl : ( ':' ) ;
    public final void rule__Signal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3976:1: ( ( ':' ) )
            // InternalAdeptness.g:3977:1: ( ':' )
            {
            // InternalAdeptness.g:3977:1: ( ':' )
            // InternalAdeptness.g:3978:2: ':'
            {
             before(grammarAccess.getSignalAccess().getColonKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getColonKeyword_3()); 

            }


            }

        }
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
    // InternalAdeptness.g:3987:1: rule__Signal__Group__4 : rule__Signal__Group__4__Impl rule__Signal__Group__5 ;
    public final void rule__Signal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3991:1: ( rule__Signal__Group__4__Impl rule__Signal__Group__5 )
            // InternalAdeptness.g:3992:2: rule__Signal__Group__4__Impl rule__Signal__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__Signal__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group__5();

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
    // InternalAdeptness.g:3999:1: rule__Signal__Group__4__Impl : ( ( rule__Signal__Group_4__0 )? ) ;
    public final void rule__Signal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4003:1: ( ( ( rule__Signal__Group_4__0 )? ) )
            // InternalAdeptness.g:4004:1: ( ( rule__Signal__Group_4__0 )? )
            {
            // InternalAdeptness.g:4004:1: ( ( rule__Signal__Group_4__0 )? )
            // InternalAdeptness.g:4005:2: ( rule__Signal__Group_4__0 )?
            {
             before(grammarAccess.getSignalAccess().getGroup_4()); 
            // InternalAdeptness.g:4006:2: ( rule__Signal__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==34) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAdeptness.g:4006:3: rule__Signal__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signal__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignalAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Signal__Group__5"
    // InternalAdeptness.g:4014:1: rule__Signal__Group__5 : rule__Signal__Group__5__Impl rule__Signal__Group__6 ;
    public final void rule__Signal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4018:1: ( rule__Signal__Group__5__Impl rule__Signal__Group__6 )
            // InternalAdeptness.g:4019:2: rule__Signal__Group__5__Impl rule__Signal__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__Signal__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group__6();

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
    // $ANTLR end "rule__Signal__Group__5"


    // $ANTLR start "rule__Signal__Group__5__Impl"
    // InternalAdeptness.g:4026:1: rule__Signal__Group__5__Impl : ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) ) ;
    public final void rule__Signal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4030:1: ( ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) ) )
            // InternalAdeptness.g:4031:1: ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) )
            {
            // InternalAdeptness.g:4031:1: ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) )
            // InternalAdeptness.g:4032:2: ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* )
            {
            // InternalAdeptness.g:4032:2: ( ( rule__Signal__OracleAssignment_5 ) )
            // InternalAdeptness.g:4033:3: ( rule__Signal__OracleAssignment_5 )
            {
             before(grammarAccess.getSignalAccess().getOracleAssignment_5()); 
            // InternalAdeptness.g:4034:3: ( rule__Signal__OracleAssignment_5 )
            // InternalAdeptness.g:4034:4: rule__Signal__OracleAssignment_5
            {
            pushFollow(FOLLOW_36);
            rule__Signal__OracleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getOracleAssignment_5()); 

            }

            // InternalAdeptness.g:4037:2: ( ( rule__Signal__OracleAssignment_5 )* )
            // InternalAdeptness.g:4038:3: ( rule__Signal__OracleAssignment_5 )*
            {
             before(grammarAccess.getSignalAccess().getOracleAssignment_5()); 
            // InternalAdeptness.g:4039:3: ( rule__Signal__OracleAssignment_5 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==56) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAdeptness.g:4039:4: rule__Signal__OracleAssignment_5
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Signal__OracleAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getSignalAccess().getOracleAssignment_5()); 

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
    // $ANTLR end "rule__Signal__Group__5__Impl"


    // $ANTLR start "rule__Signal__Group__6"
    // InternalAdeptness.g:4048:1: rule__Signal__Group__6 : rule__Signal__Group__6__Impl ;
    public final void rule__Signal__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4052:1: ( rule__Signal__Group__6__Impl )
            // InternalAdeptness.g:4053:2: rule__Signal__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Group__6__Impl();

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
    // $ANTLR end "rule__Signal__Group__6"


    // $ANTLR start "rule__Signal__Group__6__Impl"
    // InternalAdeptness.g:4059:1: rule__Signal__Group__6__Impl : ( 'ENDCPS' ) ;
    public final void rule__Signal__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4063:1: ( ( 'ENDCPS' ) )
            // InternalAdeptness.g:4064:1: ( 'ENDCPS' )
            {
            // InternalAdeptness.g:4064:1: ( 'ENDCPS' )
            // InternalAdeptness.g:4065:2: 'ENDCPS'
            {
             before(grammarAccess.getSignalAccess().getENDCPSKeyword_6()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getENDCPSKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__6__Impl"


    // $ANTLR start "rule__Signal__Group_2__0"
    // InternalAdeptness.g:4075:1: rule__Signal__Group_2__0 : rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1 ;
    public final void rule__Signal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4079:1: ( rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1 )
            // InternalAdeptness.g:4080:2: rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1
            {
            pushFollow(FOLLOW_37);
            rule__Signal__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group_2__1();

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
    // $ANTLR end "rule__Signal__Group_2__0"


    // $ANTLR start "rule__Signal__Group_2__0__Impl"
    // InternalAdeptness.g:4087:1: rule__Signal__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Signal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4091:1: ( ( '[' ) )
            // InternalAdeptness.g:4092:1: ( '[' )
            {
            // InternalAdeptness.g:4092:1: ( '[' )
            // InternalAdeptness.g:4093:2: '['
            {
             before(grammarAccess.getSignalAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__0__Impl"


    // $ANTLR start "rule__Signal__Group_2__1"
    // InternalAdeptness.g:4102:1: rule__Signal__Group_2__1 : rule__Signal__Group_2__1__Impl rule__Signal__Group_2__2 ;
    public final void rule__Signal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4106:1: ( rule__Signal__Group_2__1__Impl rule__Signal__Group_2__2 )
            // InternalAdeptness.g:4107:2: rule__Signal__Group_2__1__Impl rule__Signal__Group_2__2
            {
            pushFollow(FOLLOW_38);
            rule__Signal__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group_2__2();

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
    // $ANTLR end "rule__Signal__Group_2__1"


    // $ANTLR start "rule__Signal__Group_2__1__Impl"
    // InternalAdeptness.g:4114:1: rule__Signal__Group_2__1__Impl : ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) ) ;
    public final void rule__Signal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4118:1: ( ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) ) )
            // InternalAdeptness.g:4119:1: ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) )
            {
            // InternalAdeptness.g:4119:1: ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) )
            // InternalAdeptness.g:4120:2: ( rule__Signal__CardinalityNumCPSAssignment_2_1 )
            {
             before(grammarAccess.getSignalAccess().getCardinalityNumCPSAssignment_2_1()); 
            // InternalAdeptness.g:4121:2: ( rule__Signal__CardinalityNumCPSAssignment_2_1 )
            // InternalAdeptness.g:4121:3: rule__Signal__CardinalityNumCPSAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Signal__CardinalityNumCPSAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getCardinalityNumCPSAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__1__Impl"


    // $ANTLR start "rule__Signal__Group_2__2"
    // InternalAdeptness.g:4129:1: rule__Signal__Group_2__2 : rule__Signal__Group_2__2__Impl ;
    public final void rule__Signal__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4133:1: ( rule__Signal__Group_2__2__Impl )
            // InternalAdeptness.g:4134:2: rule__Signal__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Group_2__2__Impl();

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
    // $ANTLR end "rule__Signal__Group_2__2"


    // $ANTLR start "rule__Signal__Group_2__2__Impl"
    // InternalAdeptness.g:4140:1: rule__Signal__Group_2__2__Impl : ( ']' ) ;
    public final void rule__Signal__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4144:1: ( ( ']' ) )
            // InternalAdeptness.g:4145:1: ( ']' )
            {
            // InternalAdeptness.g:4145:1: ( ']' )
            // InternalAdeptness.g:4146:2: ']'
            {
             before(grammarAccess.getSignalAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_2__2__Impl"


    // $ANTLR start "rule__Signal__Group_4__0"
    // InternalAdeptness.g:4156:1: rule__Signal__Group_4__0 : rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1 ;
    public final void rule__Signal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4160:1: ( rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1 )
            // InternalAdeptness.g:4161:2: rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Signal__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group_4__1();

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
    // $ANTLR end "rule__Signal__Group_4__0"


    // $ANTLR start "rule__Signal__Group_4__0__Impl"
    // InternalAdeptness.g:4168:1: rule__Signal__Group_4__0__Impl : ( 'implements' ) ;
    public final void rule__Signal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4172:1: ( ( 'implements' ) )
            // InternalAdeptness.g:4173:1: ( 'implements' )
            {
            // InternalAdeptness.g:4173:1: ( 'implements' )
            // InternalAdeptness.g:4174:2: 'implements'
            {
             before(grammarAccess.getSignalAccess().getImplementsKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getImplementsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_4__0__Impl"


    // $ANTLR start "rule__Signal__Group_4__1"
    // InternalAdeptness.g:4183:1: rule__Signal__Group_4__1 : rule__Signal__Group_4__1__Impl ;
    public final void rule__Signal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4187:1: ( rule__Signal__Group_4__1__Impl )
            // InternalAdeptness.g:4188:2: rule__Signal__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Group_4__1__Impl();

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
    // $ANTLR end "rule__Signal__Group_4__1"


    // $ANTLR start "rule__Signal__Group_4__1__Impl"
    // InternalAdeptness.g:4194:1: rule__Signal__Group_4__1__Impl : ( ( rule__Signal__SuperTypeAssignment_4_1 ) ) ;
    public final void rule__Signal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4198:1: ( ( ( rule__Signal__SuperTypeAssignment_4_1 ) ) )
            // InternalAdeptness.g:4199:1: ( ( rule__Signal__SuperTypeAssignment_4_1 ) )
            {
            // InternalAdeptness.g:4199:1: ( ( rule__Signal__SuperTypeAssignment_4_1 ) )
            // InternalAdeptness.g:4200:2: ( rule__Signal__SuperTypeAssignment_4_1 )
            {
             before(grammarAccess.getSignalAccess().getSuperTypeAssignment_4_1()); 
            // InternalAdeptness.g:4201:2: ( rule__Signal__SuperTypeAssignment_4_1 )
            // InternalAdeptness.g:4201:3: rule__Signal__SuperTypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Signal__SuperTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getSuperTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group_4__1__Impl"


    // $ANTLR start "rule__Oracle__Group__0"
    // InternalAdeptness.g:4210:1: rule__Oracle__Group__0 : rule__Oracle__Group__0__Impl rule__Oracle__Group__1 ;
    public final void rule__Oracle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4214:1: ( rule__Oracle__Group__0__Impl rule__Oracle__Group__1 )
            // InternalAdeptness.g:4215:2: rule__Oracle__Group__0__Impl rule__Oracle__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalAdeptness.g:4222:1: rule__Oracle__Group__0__Impl : ( 'ORACLE' ) ;
    public final void rule__Oracle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4226:1: ( ( 'ORACLE' ) )
            // InternalAdeptness.g:4227:1: ( 'ORACLE' )
            {
            // InternalAdeptness.g:4227:1: ( 'ORACLE' )
            // InternalAdeptness.g:4228:2: 'ORACLE'
            {
             before(grammarAccess.getOracleAccess().getORACLEKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalAdeptness.g:4237:1: rule__Oracle__Group__1 : rule__Oracle__Group__1__Impl rule__Oracle__Group__2 ;
    public final void rule__Oracle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4241:1: ( rule__Oracle__Group__1__Impl rule__Oracle__Group__2 )
            // InternalAdeptness.g:4242:2: rule__Oracle__Group__1__Impl rule__Oracle__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdeptness.g:4249:1: rule__Oracle__Group__1__Impl : ( ( rule__Oracle__NameAssignment_1 ) ) ;
    public final void rule__Oracle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4253:1: ( ( ( rule__Oracle__NameAssignment_1 ) ) )
            // InternalAdeptness.g:4254:1: ( ( rule__Oracle__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:4254:1: ( ( rule__Oracle__NameAssignment_1 ) )
            // InternalAdeptness.g:4255:2: ( rule__Oracle__NameAssignment_1 )
            {
             before(grammarAccess.getOracleAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:4256:2: ( rule__Oracle__NameAssignment_1 )
            // InternalAdeptness.g:4256:3: rule__Oracle__NameAssignment_1
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
    // InternalAdeptness.g:4264:1: rule__Oracle__Group__2 : rule__Oracle__Group__2__Impl rule__Oracle__Group__3 ;
    public final void rule__Oracle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4268:1: ( rule__Oracle__Group__2__Impl rule__Oracle__Group__3 )
            // InternalAdeptness.g:4269:2: rule__Oracle__Group__2__Impl rule__Oracle__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdeptness.g:4276:1: rule__Oracle__Group__2__Impl : ( ':' ) ;
    public final void rule__Oracle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4280:1: ( ( ':' ) )
            // InternalAdeptness.g:4281:1: ( ':' )
            {
            // InternalAdeptness.g:4281:1: ( ':' )
            // InternalAdeptness.g:4282:2: ':'
            {
             before(grammarAccess.getOracleAccess().getColonKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalAdeptness.g:4291:1: rule__Oracle__Group__3 : rule__Oracle__Group__3__Impl rule__Oracle__Group__4 ;
    public final void rule__Oracle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4295:1: ( rule__Oracle__Group__3__Impl rule__Oracle__Group__4 )
            // InternalAdeptness.g:4296:2: rule__Oracle__Group__3__Impl rule__Oracle__Group__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdeptness.g:4303:1: rule__Oracle__Group__3__Impl : ( ( rule__Oracle__Alternatives_3 )? ) ;
    public final void rule__Oracle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4307:1: ( ( ( rule__Oracle__Alternatives_3 )? ) )
            // InternalAdeptness.g:4308:1: ( ( rule__Oracle__Alternatives_3 )? )
            {
            // InternalAdeptness.g:4308:1: ( ( rule__Oracle__Alternatives_3 )? )
            // InternalAdeptness.g:4309:2: ( rule__Oracle__Alternatives_3 )?
            {
             before(grammarAccess.getOracleAccess().getAlternatives_3()); 
            // InternalAdeptness.g:4310:2: ( rule__Oracle__Alternatives_3 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=58 && LA41_0<=59)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAdeptness.g:4310:3: rule__Oracle__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Oracle__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOracleAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalAdeptness.g:4318:1: rule__Oracle__Group__4 : rule__Oracle__Group__4__Impl rule__Oracle__Group__5 ;
    public final void rule__Oracle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4322:1: ( rule__Oracle__Group__4__Impl rule__Oracle__Group__5 )
            // InternalAdeptness.g:4323:2: rule__Oracle__Group__4__Impl rule__Oracle__Group__5
            {
            pushFollow(FOLLOW_40);
            rule__Oracle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Oracle__Group__5();

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
    // InternalAdeptness.g:4330:1: rule__Oracle__Group__4__Impl : ( ( rule__Oracle__CheckAssignment_4 ) ) ;
    public final void rule__Oracle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4334:1: ( ( ( rule__Oracle__CheckAssignment_4 ) ) )
            // InternalAdeptness.g:4335:1: ( ( rule__Oracle__CheckAssignment_4 ) )
            {
            // InternalAdeptness.g:4335:1: ( ( rule__Oracle__CheckAssignment_4 ) )
            // InternalAdeptness.g:4336:2: ( rule__Oracle__CheckAssignment_4 )
            {
             before(grammarAccess.getOracleAccess().getCheckAssignment_4()); 
            // InternalAdeptness.g:4337:2: ( rule__Oracle__CheckAssignment_4 )
            // InternalAdeptness.g:4337:3: rule__Oracle__CheckAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Oracle__CheckAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOracleAccess().getCheckAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Oracle__Group__5"
    // InternalAdeptness.g:4345:1: rule__Oracle__Group__5 : rule__Oracle__Group__5__Impl ;
    public final void rule__Oracle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4349:1: ( rule__Oracle__Group__5__Impl )
            // InternalAdeptness.g:4350:2: rule__Oracle__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Oracle__Group__5__Impl();

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
    // $ANTLR end "rule__Oracle__Group__5"


    // $ANTLR start "rule__Oracle__Group__5__Impl"
    // InternalAdeptness.g:4356:1: rule__Oracle__Group__5__Impl : ( 'ENDORACLE' ) ;
    public final void rule__Oracle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4360:1: ( ( 'ENDORACLE' ) )
            // InternalAdeptness.g:4361:1: ( 'ENDORACLE' )
            {
            // InternalAdeptness.g:4361:1: ( 'ENDORACLE' )
            // InternalAdeptness.g:4362:2: 'ENDORACLE'
            {
             before(grammarAccess.getOracleAccess().getENDORACLEKeyword_5()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getOracleAccess().getENDORACLEKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__Group__5__Impl"


    // $ANTLR start "rule__While__Group__0"
    // InternalAdeptness.g:4372:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4376:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // InternalAdeptness.g:4377:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__While__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__1();

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
    // $ANTLR end "rule__While__Group__0"


    // $ANTLR start "rule__While__Group__0__Impl"
    // InternalAdeptness.g:4384:1: rule__While__Group__0__Impl : ( 'while:' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4388:1: ( ( 'while:' ) )
            // InternalAdeptness.g:4389:1: ( 'while:' )
            {
            // InternalAdeptness.g:4389:1: ( 'while:' )
            // InternalAdeptness.g:4390:2: 'while:'
            {
             before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getWhileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0__Impl"


    // $ANTLR start "rule__While__Group__1"
    // InternalAdeptness.g:4399:1: rule__While__Group__1 : rule__While__Group__1__Impl ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4403:1: ( rule__While__Group__1__Impl )
            // InternalAdeptness.g:4404:2: rule__While__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__While__Group__1__Impl();

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
    // $ANTLR end "rule__While__Group__1"


    // $ANTLR start "rule__While__Group__1__Impl"
    // InternalAdeptness.g:4410:1: rule__While__Group__1__Impl : ( ( rule__While__EmAssignment_1 ) ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4414:1: ( ( ( rule__While__EmAssignment_1 ) ) )
            // InternalAdeptness.g:4415:1: ( ( rule__While__EmAssignment_1 ) )
            {
            // InternalAdeptness.g:4415:1: ( ( rule__While__EmAssignment_1 ) )
            // InternalAdeptness.g:4416:2: ( rule__While__EmAssignment_1 )
            {
             before(grammarAccess.getWhileAccess().getEmAssignment_1()); 
            // InternalAdeptness.g:4417:2: ( rule__While__EmAssignment_1 )
            // InternalAdeptness.g:4417:3: rule__While__EmAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__While__EmAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getEmAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__1__Impl"


    // $ANTLR start "rule__When__Group__0"
    // InternalAdeptness.g:4426:1: rule__When__Group__0 : rule__When__Group__0__Impl rule__When__Group__1 ;
    public final void rule__When__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4430:1: ( rule__When__Group__0__Impl rule__When__Group__1 )
            // InternalAdeptness.g:4431:2: rule__When__Group__0__Impl rule__When__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__When__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__When__Group__1();

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
    // $ANTLR end "rule__When__Group__0"


    // $ANTLR start "rule__When__Group__0__Impl"
    // InternalAdeptness.g:4438:1: rule__When__Group__0__Impl : ( 'when:' ) ;
    public final void rule__When__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4442:1: ( ( 'when:' ) )
            // InternalAdeptness.g:4443:1: ( 'when:' )
            {
            // InternalAdeptness.g:4443:1: ( 'when:' )
            // InternalAdeptness.g:4444:2: 'when:'
            {
             before(grammarAccess.getWhenAccess().getWhenKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWhenAccess().getWhenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__0__Impl"


    // $ANTLR start "rule__When__Group__1"
    // InternalAdeptness.g:4453:1: rule__When__Group__1 : rule__When__Group__1__Impl rule__When__Group__2 ;
    public final void rule__When__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4457:1: ( rule__When__Group__1__Impl rule__When__Group__2 )
            // InternalAdeptness.g:4458:2: rule__When__Group__1__Impl rule__When__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__When__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__When__Group__2();

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
    // $ANTLR end "rule__When__Group__1"


    // $ANTLR start "rule__When__Group__1__Impl"
    // InternalAdeptness.g:4465:1: rule__When__Group__1__Impl : ( ( rule__When__EmAssignment_1 ) ) ;
    public final void rule__When__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4469:1: ( ( ( rule__When__EmAssignment_1 ) ) )
            // InternalAdeptness.g:4470:1: ( ( rule__When__EmAssignment_1 ) )
            {
            // InternalAdeptness.g:4470:1: ( ( rule__When__EmAssignment_1 ) )
            // InternalAdeptness.g:4471:2: ( rule__When__EmAssignment_1 )
            {
             before(grammarAccess.getWhenAccess().getEmAssignment_1()); 
            // InternalAdeptness.g:4472:2: ( rule__When__EmAssignment_1 )
            // InternalAdeptness.g:4472:3: rule__When__EmAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__When__EmAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhenAccess().getEmAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__1__Impl"


    // $ANTLR start "rule__When__Group__2"
    // InternalAdeptness.g:4480:1: rule__When__Group__2 : rule__When__Group__2__Impl ;
    public final void rule__When__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4484:1: ( rule__When__Group__2__Impl )
            // InternalAdeptness.g:4485:2: rule__When__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__When__Group__2__Impl();

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
    // $ANTLR end "rule__When__Group__2"


    // $ANTLR start "rule__When__Group__2__Impl"
    // InternalAdeptness.g:4491:1: rule__When__Group__2__Impl : ( ( rule__When__AwAssignment_2 )? ) ;
    public final void rule__When__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4495:1: ( ( ( rule__When__AwAssignment_2 )? ) )
            // InternalAdeptness.g:4496:1: ( ( rule__When__AwAssignment_2 )? )
            {
            // InternalAdeptness.g:4496:1: ( ( rule__When__AwAssignment_2 )? )
            // InternalAdeptness.g:4497:2: ( rule__When__AwAssignment_2 )?
            {
             before(grammarAccess.getWhenAccess().getAwAssignment_2()); 
            // InternalAdeptness.g:4498:2: ( rule__When__AwAssignment_2 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=60 && LA42_0<=61)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAdeptness.g:4498:3: rule__When__AwAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__When__AwAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWhenAccess().getAwAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__2__Impl"


    // $ANTLR start "rule__Wait__Group__0"
    // InternalAdeptness.g:4507:1: rule__Wait__Group__0 : rule__Wait__Group__0__Impl rule__Wait__Group__1 ;
    public final void rule__Wait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4511:1: ( rule__Wait__Group__0__Impl rule__Wait__Group__1 )
            // InternalAdeptness.g:4512:2: rule__Wait__Group__0__Impl rule__Wait__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Wait__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wait__Group__1();

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
    // $ANTLR end "rule__Wait__Group__0"


    // $ANTLR start "rule__Wait__Group__0__Impl"
    // InternalAdeptness.g:4519:1: rule__Wait__Group__0__Impl : ( 'after(' ) ;
    public final void rule__Wait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4523:1: ( ( 'after(' ) )
            // InternalAdeptness.g:4524:1: ( 'after(' )
            {
            // InternalAdeptness.g:4524:1: ( 'after(' )
            // InternalAdeptness.g:4525:2: 'after('
            {
             before(grammarAccess.getWaitAccess().getAfterKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getWaitAccess().getAfterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__0__Impl"


    // $ANTLR start "rule__Wait__Group__1"
    // InternalAdeptness.g:4534:1: rule__Wait__Group__1 : rule__Wait__Group__1__Impl rule__Wait__Group__2 ;
    public final void rule__Wait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4538:1: ( rule__Wait__Group__1__Impl rule__Wait__Group__2 )
            // InternalAdeptness.g:4539:2: rule__Wait__Group__1__Impl rule__Wait__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Wait__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wait__Group__2();

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
    // $ANTLR end "rule__Wait__Group__1"


    // $ANTLR start "rule__Wait__Group__1__Impl"
    // InternalAdeptness.g:4546:1: rule__Wait__Group__1__Impl : ( ( rule__Wait__TimeAssignment_1 ) ) ;
    public final void rule__Wait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4550:1: ( ( ( rule__Wait__TimeAssignment_1 ) ) )
            // InternalAdeptness.g:4551:1: ( ( rule__Wait__TimeAssignment_1 ) )
            {
            // InternalAdeptness.g:4551:1: ( ( rule__Wait__TimeAssignment_1 ) )
            // InternalAdeptness.g:4552:2: ( rule__Wait__TimeAssignment_1 )
            {
             before(grammarAccess.getWaitAccess().getTimeAssignment_1()); 
            // InternalAdeptness.g:4553:2: ( rule__Wait__TimeAssignment_1 )
            // InternalAdeptness.g:4553:3: rule__Wait__TimeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Wait__TimeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWaitAccess().getTimeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__1__Impl"


    // $ANTLR start "rule__Wait__Group__2"
    // InternalAdeptness.g:4561:1: rule__Wait__Group__2 : rule__Wait__Group__2__Impl rule__Wait__Group__3 ;
    public final void rule__Wait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4565:1: ( rule__Wait__Group__2__Impl rule__Wait__Group__3 )
            // InternalAdeptness.g:4566:2: rule__Wait__Group__2__Impl rule__Wait__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__Wait__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wait__Group__3();

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
    // $ANTLR end "rule__Wait__Group__2"


    // $ANTLR start "rule__Wait__Group__2__Impl"
    // InternalAdeptness.g:4573:1: rule__Wait__Group__2__Impl : ( ',' ) ;
    public final void rule__Wait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4577:1: ( ( ',' ) )
            // InternalAdeptness.g:4578:1: ( ',' )
            {
            // InternalAdeptness.g:4578:1: ( ',' )
            // InternalAdeptness.g:4579:2: ','
            {
             before(grammarAccess.getWaitAccess().getCommaKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getWaitAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__2__Impl"


    // $ANTLR start "rule__Wait__Group__3"
    // InternalAdeptness.g:4588:1: rule__Wait__Group__3 : rule__Wait__Group__3__Impl rule__Wait__Group__4 ;
    public final void rule__Wait__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4592:1: ( rule__Wait__Group__3__Impl rule__Wait__Group__4 )
            // InternalAdeptness.g:4593:2: rule__Wait__Group__3__Impl rule__Wait__Group__4
            {
            pushFollow(FOLLOW_43);
            rule__Wait__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wait__Group__4();

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
    // $ANTLR end "rule__Wait__Group__3"


    // $ANTLR start "rule__Wait__Group__3__Impl"
    // InternalAdeptness.g:4600:1: rule__Wait__Group__3__Impl : ( ( rule__Wait__UnitAssignment_3 ) ) ;
    public final void rule__Wait__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4604:1: ( ( ( rule__Wait__UnitAssignment_3 ) ) )
            // InternalAdeptness.g:4605:1: ( ( rule__Wait__UnitAssignment_3 ) )
            {
            // InternalAdeptness.g:4605:1: ( ( rule__Wait__UnitAssignment_3 ) )
            // InternalAdeptness.g:4606:2: ( rule__Wait__UnitAssignment_3 )
            {
             before(grammarAccess.getWaitAccess().getUnitAssignment_3()); 
            // InternalAdeptness.g:4607:2: ( rule__Wait__UnitAssignment_3 )
            // InternalAdeptness.g:4607:3: rule__Wait__UnitAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Wait__UnitAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWaitAccess().getUnitAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__3__Impl"


    // $ANTLR start "rule__Wait__Group__4"
    // InternalAdeptness.g:4615:1: rule__Wait__Group__4 : rule__Wait__Group__4__Impl ;
    public final void rule__Wait__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4619:1: ( rule__Wait__Group__4__Impl )
            // InternalAdeptness.g:4620:2: rule__Wait__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Wait__Group__4__Impl();

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
    // $ANTLR end "rule__Wait__Group__4"


    // $ANTLR start "rule__Wait__Group__4__Impl"
    // InternalAdeptness.g:4626:1: rule__Wait__Group__4__Impl : ( ')' ) ;
    public final void rule__Wait__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4630:1: ( ( ')' ) )
            // InternalAdeptness.g:4631:1: ( ')' )
            {
            // InternalAdeptness.g:4631:1: ( ')' )
            // InternalAdeptness.g:4632:2: ')'
            {
             before(grammarAccess.getWaitAccess().getRightParenthesisKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getWaitAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__4__Impl"


    // $ANTLR start "rule__During__Group__0"
    // InternalAdeptness.g:4642:1: rule__During__Group__0 : rule__During__Group__0__Impl rule__During__Group__1 ;
    public final void rule__During__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4646:1: ( rule__During__Group__0__Impl rule__During__Group__1 )
            // InternalAdeptness.g:4647:2: rule__During__Group__0__Impl rule__During__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__During__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__During__Group__1();

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
    // $ANTLR end "rule__During__Group__0"


    // $ANTLR start "rule__During__Group__0__Impl"
    // InternalAdeptness.g:4654:1: rule__During__Group__0__Impl : ( 'during(' ) ;
    public final void rule__During__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4658:1: ( ( 'during(' ) )
            // InternalAdeptness.g:4659:1: ( 'during(' )
            {
            // InternalAdeptness.g:4659:1: ( 'during(' )
            // InternalAdeptness.g:4660:2: 'during('
            {
             before(grammarAccess.getDuringAccess().getDuringKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getDuringAccess().getDuringKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__During__Group__0__Impl"


    // $ANTLR start "rule__During__Group__1"
    // InternalAdeptness.g:4669:1: rule__During__Group__1 : rule__During__Group__1__Impl rule__During__Group__2 ;
    public final void rule__During__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4673:1: ( rule__During__Group__1__Impl rule__During__Group__2 )
            // InternalAdeptness.g:4674:2: rule__During__Group__1__Impl rule__During__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__During__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__During__Group__2();

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
    // $ANTLR end "rule__During__Group__1"


    // $ANTLR start "rule__During__Group__1__Impl"
    // InternalAdeptness.g:4681:1: rule__During__Group__1__Impl : ( ( rule__During__TimeAssignment_1 ) ) ;
    public final void rule__During__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4685:1: ( ( ( rule__During__TimeAssignment_1 ) ) )
            // InternalAdeptness.g:4686:1: ( ( rule__During__TimeAssignment_1 ) )
            {
            // InternalAdeptness.g:4686:1: ( ( rule__During__TimeAssignment_1 ) )
            // InternalAdeptness.g:4687:2: ( rule__During__TimeAssignment_1 )
            {
             before(grammarAccess.getDuringAccess().getTimeAssignment_1()); 
            // InternalAdeptness.g:4688:2: ( rule__During__TimeAssignment_1 )
            // InternalAdeptness.g:4688:3: rule__During__TimeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__During__TimeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDuringAccess().getTimeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__During__Group__1__Impl"


    // $ANTLR start "rule__During__Group__2"
    // InternalAdeptness.g:4696:1: rule__During__Group__2 : rule__During__Group__2__Impl rule__During__Group__3 ;
    public final void rule__During__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4700:1: ( rule__During__Group__2__Impl rule__During__Group__3 )
            // InternalAdeptness.g:4701:2: rule__During__Group__2__Impl rule__During__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__During__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__During__Group__3();

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
    // $ANTLR end "rule__During__Group__2"


    // $ANTLR start "rule__During__Group__2__Impl"
    // InternalAdeptness.g:4708:1: rule__During__Group__2__Impl : ( ',' ) ;
    public final void rule__During__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4712:1: ( ( ',' ) )
            // InternalAdeptness.g:4713:1: ( ',' )
            {
            // InternalAdeptness.g:4713:1: ( ',' )
            // InternalAdeptness.g:4714:2: ','
            {
             before(grammarAccess.getDuringAccess().getCommaKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDuringAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__During__Group__2__Impl"


    // $ANTLR start "rule__During__Group__3"
    // InternalAdeptness.g:4723:1: rule__During__Group__3 : rule__During__Group__3__Impl rule__During__Group__4 ;
    public final void rule__During__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4727:1: ( rule__During__Group__3__Impl rule__During__Group__4 )
            // InternalAdeptness.g:4728:2: rule__During__Group__3__Impl rule__During__Group__4
            {
            pushFollow(FOLLOW_43);
            rule__During__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__During__Group__4();

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
    // $ANTLR end "rule__During__Group__3"


    // $ANTLR start "rule__During__Group__3__Impl"
    // InternalAdeptness.g:4735:1: rule__During__Group__3__Impl : ( ( rule__During__UnitAssignment_3 ) ) ;
    public final void rule__During__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4739:1: ( ( ( rule__During__UnitAssignment_3 ) ) )
            // InternalAdeptness.g:4740:1: ( ( rule__During__UnitAssignment_3 ) )
            {
            // InternalAdeptness.g:4740:1: ( ( rule__During__UnitAssignment_3 ) )
            // InternalAdeptness.g:4741:2: ( rule__During__UnitAssignment_3 )
            {
             before(grammarAccess.getDuringAccess().getUnitAssignment_3()); 
            // InternalAdeptness.g:4742:2: ( rule__During__UnitAssignment_3 )
            // InternalAdeptness.g:4742:3: rule__During__UnitAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__During__UnitAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDuringAccess().getUnitAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__During__Group__3__Impl"


    // $ANTLR start "rule__During__Group__4"
    // InternalAdeptness.g:4750:1: rule__During__Group__4 : rule__During__Group__4__Impl ;
    public final void rule__During__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4754:1: ( rule__During__Group__4__Impl )
            // InternalAdeptness.g:4755:2: rule__During__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__During__Group__4__Impl();

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
    // $ANTLR end "rule__During__Group__4"


    // $ANTLR start "rule__During__Group__4__Impl"
    // InternalAdeptness.g:4761:1: rule__During__Group__4__Impl : ( ')' ) ;
    public final void rule__During__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4765:1: ( ( ')' ) )
            // InternalAdeptness.g:4766:1: ( ')' )
            {
            // InternalAdeptness.g:4766:1: ( ')' )
            // InternalAdeptness.g:4767:2: ')'
            {
             before(grammarAccess.getDuringAccess().getRightParenthesisKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDuringAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__During__Group__4__Impl"


    // $ANTLR start "rule__Checks__Group__0"
    // InternalAdeptness.g:4777:1: rule__Checks__Group__0 : rule__Checks__Group__0__Impl rule__Checks__Group__1 ;
    public final void rule__Checks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4781:1: ( rule__Checks__Group__0__Impl rule__Checks__Group__1 )
            // InternalAdeptness.g:4782:2: rule__Checks__Group__0__Impl rule__Checks__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalAdeptness.g:4789:1: rule__Checks__Group__0__Impl : ( 'checks:' ) ;
    public final void rule__Checks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4793:1: ( ( 'checks:' ) )
            // InternalAdeptness.g:4794:1: ( 'checks:' )
            {
            // InternalAdeptness.g:4794:1: ( 'checks:' )
            // InternalAdeptness.g:4795:2: 'checks:'
            {
             before(grammarAccess.getChecksAccess().getChecksKeyword_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalAdeptness.g:4804:1: rule__Checks__Group__1 : rule__Checks__Group__1__Impl rule__Checks__Group__2 ;
    public final void rule__Checks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4808:1: ( rule__Checks__Group__1__Impl rule__Checks__Group__2 )
            // InternalAdeptness.g:4809:2: rule__Checks__Group__1__Impl rule__Checks__Group__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalAdeptness.g:4816:1: rule__Checks__Group__1__Impl : ( ( rule__Checks__Alternatives_1 ) ) ;
    public final void rule__Checks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4820:1: ( ( ( rule__Checks__Alternatives_1 ) ) )
            // InternalAdeptness.g:4821:1: ( ( rule__Checks__Alternatives_1 ) )
            {
            // InternalAdeptness.g:4821:1: ( ( rule__Checks__Alternatives_1 ) )
            // InternalAdeptness.g:4822:2: ( rule__Checks__Alternatives_1 )
            {
             before(grammarAccess.getChecksAccess().getAlternatives_1()); 
            // InternalAdeptness.g:4823:2: ( rule__Checks__Alternatives_1 )
            // InternalAdeptness.g:4823:3: rule__Checks__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Checks__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getChecksAccess().getAlternatives_1()); 

            }


            }

        }
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
    // InternalAdeptness.g:4831:1: rule__Checks__Group__2 : rule__Checks__Group__2__Impl rule__Checks__Group__3 ;
    public final void rule__Checks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4835:1: ( rule__Checks__Group__2__Impl rule__Checks__Group__3 )
            // InternalAdeptness.g:4836:2: rule__Checks__Group__2__Impl rule__Checks__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalAdeptness.g:4843:1: rule__Checks__Group__2__Impl : ( ( rule__Checks__ReferenceAssignment_2 ) ) ;
    public final void rule__Checks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4847:1: ( ( ( rule__Checks__ReferenceAssignment_2 ) ) )
            // InternalAdeptness.g:4848:1: ( ( rule__Checks__ReferenceAssignment_2 ) )
            {
            // InternalAdeptness.g:4848:1: ( ( rule__Checks__ReferenceAssignment_2 ) )
            // InternalAdeptness.g:4849:2: ( rule__Checks__ReferenceAssignment_2 )
            {
             before(grammarAccess.getChecksAccess().getReferenceAssignment_2()); 
            // InternalAdeptness.g:4850:2: ( rule__Checks__ReferenceAssignment_2 )
            // InternalAdeptness.g:4850:3: rule__Checks__ReferenceAssignment_2
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
    // InternalAdeptness.g:4858:1: rule__Checks__Group__3 : rule__Checks__Group__3__Impl rule__Checks__Group__4 ;
    public final void rule__Checks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4862:1: ( rule__Checks__Group__3__Impl rule__Checks__Group__4 )
            // InternalAdeptness.g:4863:2: rule__Checks__Group__3__Impl rule__Checks__Group__4
            {
            pushFollow(FOLLOW_46);
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
    // InternalAdeptness.g:4870:1: rule__Checks__Group__3__Impl : ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) ) ;
    public final void rule__Checks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4874:1: ( ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) ) )
            // InternalAdeptness.g:4875:1: ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) )
            {
            // InternalAdeptness.g:4875:1: ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) )
            // InternalAdeptness.g:4876:2: ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* )
            {
            // InternalAdeptness.g:4876:2: ( ( rule__Checks__FailReasonAssignment_3 ) )
            // InternalAdeptness.g:4877:3: ( rule__Checks__FailReasonAssignment_3 )
            {
             before(grammarAccess.getChecksAccess().getFailReasonAssignment_3()); 
            // InternalAdeptness.g:4878:3: ( rule__Checks__FailReasonAssignment_3 )
            // InternalAdeptness.g:4878:4: rule__Checks__FailReasonAssignment_3
            {
            pushFollow(FOLLOW_47);
            rule__Checks__FailReasonAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChecksAccess().getFailReasonAssignment_3()); 

            }

            // InternalAdeptness.g:4881:2: ( ( rule__Checks__FailReasonAssignment_3 )* )
            // InternalAdeptness.g:4882:3: ( rule__Checks__FailReasonAssignment_3 )*
            {
             before(grammarAccess.getChecksAccess().getFailReasonAssignment_3()); 
            // InternalAdeptness.g:4883:3: ( rule__Checks__FailReasonAssignment_3 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==64) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalAdeptness.g:4883:4: rule__Checks__FailReasonAssignment_3
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__Checks__FailReasonAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalAdeptness.g:4892:1: rule__Checks__Group__4 : rule__Checks__Group__4__Impl ;
    public final void rule__Checks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4896:1: ( rule__Checks__Group__4__Impl )
            // InternalAdeptness.g:4897:2: rule__Checks__Group__4__Impl
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
    // InternalAdeptness.g:4903:1: rule__Checks__Group__4__Impl : ( ( rule__Checks__DescriptionAssignment_4 ) ) ;
    public final void rule__Checks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4907:1: ( ( ( rule__Checks__DescriptionAssignment_4 ) ) )
            // InternalAdeptness.g:4908:1: ( ( rule__Checks__DescriptionAssignment_4 ) )
            {
            // InternalAdeptness.g:4908:1: ( ( rule__Checks__DescriptionAssignment_4 ) )
            // InternalAdeptness.g:4909:2: ( rule__Checks__DescriptionAssignment_4 )
            {
             before(grammarAccess.getChecksAccess().getDescriptionAssignment_4()); 
            // InternalAdeptness.g:4910:2: ( rule__Checks__DescriptionAssignment_4 )
            // InternalAdeptness.g:4910:3: rule__Checks__DescriptionAssignment_4
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
    // InternalAdeptness.g:4919:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4923:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalAdeptness.g:4924:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdeptness.g:4931:1: rule__Description__Group__0__Impl : ( 'Description: ' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4935:1: ( ( 'Description: ' ) )
            // InternalAdeptness.g:4936:1: ( 'Description: ' )
            {
            // InternalAdeptness.g:4936:1: ( 'Description: ' )
            // InternalAdeptness.g:4937:2: 'Description: '
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalAdeptness.g:4946:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4950:1: ( rule__Description__Group__1__Impl )
            // InternalAdeptness.g:4951:2: rule__Description__Group__1__Impl
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
    // InternalAdeptness.g:4957:1: rule__Description__Group__1__Impl : ( ( rule__Description__ValueAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4961:1: ( ( ( rule__Description__ValueAssignment_1 ) ) )
            // InternalAdeptness.g:4962:1: ( ( rule__Description__ValueAssignment_1 ) )
            {
            // InternalAdeptness.g:4962:1: ( ( rule__Description__ValueAssignment_1 ) )
            // InternalAdeptness.g:4963:2: ( rule__Description__ValueAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getValueAssignment_1()); 
            // InternalAdeptness.g:4964:2: ( rule__Description__ValueAssignment_1 )
            // InternalAdeptness.g:4964:3: rule__Description__ValueAssignment_1
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
    // InternalAdeptness.g:4973:1: rule__FailReason__Group__0 : rule__FailReason__Group__0__Impl rule__FailReason__Group__1 ;
    public final void rule__FailReason__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4977:1: ( rule__FailReason__Group__0__Impl rule__FailReason__Group__1 )
            // InternalAdeptness.g:4978:2: rule__FailReason__Group__0__Impl rule__FailReason__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalAdeptness.g:4985:1: rule__FailReason__Group__0__Impl : ( 'fails if :' ) ;
    public final void rule__FailReason__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4989:1: ( ( 'fails if :' ) )
            // InternalAdeptness.g:4990:1: ( 'fails if :' )
            {
            // InternalAdeptness.g:4990:1: ( 'fails if :' )
            // InternalAdeptness.g:4991:2: 'fails if :'
            {
             before(grammarAccess.getFailReasonAccess().getFailsIfKeyword_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalAdeptness.g:5000:1: rule__FailReason__Group__1 : rule__FailReason__Group__1__Impl ;
    public final void rule__FailReason__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5004:1: ( rule__FailReason__Group__1__Impl )
            // InternalAdeptness.g:5005:2: rule__FailReason__Group__1__Impl
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
    // InternalAdeptness.g:5011:1: rule__FailReason__Group__1__Impl : ( ( rule__FailReason__ReasonAssignment_1 ) ) ;
    public final void rule__FailReason__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5015:1: ( ( ( rule__FailReason__ReasonAssignment_1 ) ) )
            // InternalAdeptness.g:5016:1: ( ( rule__FailReason__ReasonAssignment_1 ) )
            {
            // InternalAdeptness.g:5016:1: ( ( rule__FailReason__ReasonAssignment_1 ) )
            // InternalAdeptness.g:5017:2: ( rule__FailReason__ReasonAssignment_1 )
            {
             before(grammarAccess.getFailReasonAccess().getReasonAssignment_1()); 
            // InternalAdeptness.g:5018:2: ( rule__FailReason__ReasonAssignment_1 )
            // InternalAdeptness.g:5018:3: rule__FailReason__ReasonAssignment_1
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
    // InternalAdeptness.g:5027:1: rule__Reason__Group__0 : rule__Reason__Group__0__Impl rule__Reason__Group__1 ;
    public final void rule__Reason__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5031:1: ( rule__Reason__Group__0__Impl rule__Reason__Group__1 )
            // InternalAdeptness.g:5032:2: rule__Reason__Group__0__Impl rule__Reason__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalAdeptness.g:5039:1: rule__Reason__Group__0__Impl : ( ( rule__Reason__Alternatives_0 ) ) ;
    public final void rule__Reason__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5043:1: ( ( ( rule__Reason__Alternatives_0 ) ) )
            // InternalAdeptness.g:5044:1: ( ( rule__Reason__Alternatives_0 ) )
            {
            // InternalAdeptness.g:5044:1: ( ( rule__Reason__Alternatives_0 ) )
            // InternalAdeptness.g:5045:2: ( rule__Reason__Alternatives_0 )
            {
             before(grammarAccess.getReasonAccess().getAlternatives_0()); 
            // InternalAdeptness.g:5046:2: ( rule__Reason__Alternatives_0 )
            // InternalAdeptness.g:5046:3: rule__Reason__Alternatives_0
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
    // InternalAdeptness.g:5054:1: rule__Reason__Group__1 : rule__Reason__Group__1__Impl ;
    public final void rule__Reason__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5058:1: ( rule__Reason__Group__1__Impl )
            // InternalAdeptness.g:5059:2: rule__Reason__Group__1__Impl
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
    // InternalAdeptness.g:5065:1: rule__Reason__Group__1__Impl : ( ';' ) ;
    public final void rule__Reason__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5069:1: ( ( ';' ) )
            // InternalAdeptness.g:5070:1: ( ';' )
            {
            // InternalAdeptness.g:5070:1: ( ';' )
            // InternalAdeptness.g:5071:2: ';'
            {
             before(grammarAccess.getReasonAccess().getSemicolonKeyword_1()); 
            match(input,65,FOLLOW_2); 
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
    // InternalAdeptness.g:5081:1: rule__XPeaks__Group__0 : rule__XPeaks__Group__0__Impl rule__XPeaks__Group__1 ;
    public final void rule__XPeaks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5085:1: ( rule__XPeaks__Group__0__Impl rule__XPeaks__Group__1 )
            // InternalAdeptness.g:5086:2: rule__XPeaks__Group__0__Impl rule__XPeaks__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalAdeptness.g:5093:1: rule__XPeaks__Group__0__Impl : ( 'confidence is below' ) ;
    public final void rule__XPeaks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5097:1: ( ( 'confidence is below' ) )
            // InternalAdeptness.g:5098:1: ( 'confidence is below' )
            {
            // InternalAdeptness.g:5098:1: ( 'confidence is below' )
            // InternalAdeptness.g:5099:2: 'confidence is below'
            {
             before(grammarAccess.getXPeaksAccess().getConfidenceIsBelowKeyword_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalAdeptness.g:5108:1: rule__XPeaks__Group__1 : rule__XPeaks__Group__1__Impl rule__XPeaks__Group__2 ;
    public final void rule__XPeaks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5112:1: ( rule__XPeaks__Group__1__Impl rule__XPeaks__Group__2 )
            // InternalAdeptness.g:5113:2: rule__XPeaks__Group__1__Impl rule__XPeaks__Group__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalAdeptness.g:5120:1: rule__XPeaks__Group__1__Impl : ( ( rule__XPeaks__CantAssignment_1 ) ) ;
    public final void rule__XPeaks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5124:1: ( ( ( rule__XPeaks__CantAssignment_1 ) ) )
            // InternalAdeptness.g:5125:1: ( ( rule__XPeaks__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:5125:1: ( ( rule__XPeaks__CantAssignment_1 ) )
            // InternalAdeptness.g:5126:2: ( rule__XPeaks__CantAssignment_1 )
            {
             before(grammarAccess.getXPeaksAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:5127:2: ( rule__XPeaks__CantAssignment_1 )
            // InternalAdeptness.g:5127:3: rule__XPeaks__CantAssignment_1
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
    // InternalAdeptness.g:5135:1: rule__XPeaks__Group__2 : rule__XPeaks__Group__2__Impl rule__XPeaks__Group__3 ;
    public final void rule__XPeaks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5139:1: ( rule__XPeaks__Group__2__Impl rule__XPeaks__Group__3 )
            // InternalAdeptness.g:5140:2: rule__XPeaks__Group__2__Impl rule__XPeaks__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalAdeptness.g:5147:1: rule__XPeaks__Group__2__Impl : ( 'more than' ) ;
    public final void rule__XPeaks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5151:1: ( ( 'more than' ) )
            // InternalAdeptness.g:5152:1: ( 'more than' )
            {
            // InternalAdeptness.g:5152:1: ( 'more than' )
            // InternalAdeptness.g:5153:2: 'more than'
            {
             before(grammarAccess.getXPeaksAccess().getMoreThanKeyword_2()); 
            match(input,67,FOLLOW_2); 
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
    // InternalAdeptness.g:5162:1: rule__XPeaks__Group__3 : rule__XPeaks__Group__3__Impl rule__XPeaks__Group__4 ;
    public final void rule__XPeaks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5166:1: ( rule__XPeaks__Group__3__Impl rule__XPeaks__Group__4 )
            // InternalAdeptness.g:5167:2: rule__XPeaks__Group__3__Impl rule__XPeaks__Group__4
            {
            pushFollow(FOLLOW_51);
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
    // InternalAdeptness.g:5174:1: rule__XPeaks__Group__3__Impl : ( ( rule__XPeaks__NPeaksAssignment_3 ) ) ;
    public final void rule__XPeaks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5178:1: ( ( ( rule__XPeaks__NPeaksAssignment_3 ) ) )
            // InternalAdeptness.g:5179:1: ( ( rule__XPeaks__NPeaksAssignment_3 ) )
            {
            // InternalAdeptness.g:5179:1: ( ( rule__XPeaks__NPeaksAssignment_3 ) )
            // InternalAdeptness.g:5180:2: ( rule__XPeaks__NPeaksAssignment_3 )
            {
             before(grammarAccess.getXPeaksAccess().getNPeaksAssignment_3()); 
            // InternalAdeptness.g:5181:2: ( rule__XPeaks__NPeaksAssignment_3 )
            // InternalAdeptness.g:5181:3: rule__XPeaks__NPeaksAssignment_3
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
    // InternalAdeptness.g:5189:1: rule__XPeaks__Group__4 : rule__XPeaks__Group__4__Impl rule__XPeaks__Group__5 ;
    public final void rule__XPeaks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5193:1: ( rule__XPeaks__Group__4__Impl rule__XPeaks__Group__5 )
            // InternalAdeptness.g:5194:2: rule__XPeaks__Group__4__Impl rule__XPeaks__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalAdeptness.g:5201:1: rule__XPeaks__Group__4__Impl : ( 'times within' ) ;
    public final void rule__XPeaks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5205:1: ( ( 'times within' ) )
            // InternalAdeptness.g:5206:1: ( 'times within' )
            {
            // InternalAdeptness.g:5206:1: ( 'times within' )
            // InternalAdeptness.g:5207:2: 'times within'
            {
             before(grammarAccess.getXPeaksAccess().getTimesWithinKeyword_4()); 
            match(input,68,FOLLOW_2); 
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
    // InternalAdeptness.g:5216:1: rule__XPeaks__Group__5 : rule__XPeaks__Group__5__Impl rule__XPeaks__Group__6 ;
    public final void rule__XPeaks__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5220:1: ( rule__XPeaks__Group__5__Impl rule__XPeaks__Group__6 )
            // InternalAdeptness.g:5221:2: rule__XPeaks__Group__5__Impl rule__XPeaks__Group__6
            {
            pushFollow(FOLLOW_42);
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
    // InternalAdeptness.g:5228:1: rule__XPeaks__Group__5__Impl : ( ( rule__XPeaks__TimeAssignment_5 ) ) ;
    public final void rule__XPeaks__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5232:1: ( ( ( rule__XPeaks__TimeAssignment_5 ) ) )
            // InternalAdeptness.g:5233:1: ( ( rule__XPeaks__TimeAssignment_5 ) )
            {
            // InternalAdeptness.g:5233:1: ( ( rule__XPeaks__TimeAssignment_5 ) )
            // InternalAdeptness.g:5234:2: ( rule__XPeaks__TimeAssignment_5 )
            {
             before(grammarAccess.getXPeaksAccess().getTimeAssignment_5()); 
            // InternalAdeptness.g:5235:2: ( rule__XPeaks__TimeAssignment_5 )
            // InternalAdeptness.g:5235:3: rule__XPeaks__TimeAssignment_5
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
    // InternalAdeptness.g:5243:1: rule__XPeaks__Group__6 : rule__XPeaks__Group__6__Impl ;
    public final void rule__XPeaks__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5247:1: ( rule__XPeaks__Group__6__Impl )
            // InternalAdeptness.g:5248:2: rule__XPeaks__Group__6__Impl
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
    // InternalAdeptness.g:5254:1: rule__XPeaks__Group__6__Impl : ( ( rule__XPeaks__UnitAssignment_6 ) ) ;
    public final void rule__XPeaks__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5258:1: ( ( ( rule__XPeaks__UnitAssignment_6 ) ) )
            // InternalAdeptness.g:5259:1: ( ( rule__XPeaks__UnitAssignment_6 ) )
            {
            // InternalAdeptness.g:5259:1: ( ( rule__XPeaks__UnitAssignment_6 ) )
            // InternalAdeptness.g:5260:2: ( rule__XPeaks__UnitAssignment_6 )
            {
             before(grammarAccess.getXPeaksAccess().getUnitAssignment_6()); 
            // InternalAdeptness.g:5261:2: ( rule__XPeaks__UnitAssignment_6 )
            // InternalAdeptness.g:5261:3: rule__XPeaks__UnitAssignment_6
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
    // InternalAdeptness.g:5270:1: rule__ConstDeg__Group__0 : rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1 ;
    public final void rule__ConstDeg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5274:1: ( rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1 )
            // InternalAdeptness.g:5275:2: rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalAdeptness.g:5282:1: rule__ConstDeg__Group__0__Impl : ( 'confidence is in constant degradation' ) ;
    public final void rule__ConstDeg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5286:1: ( ( 'confidence is in constant degradation' ) )
            // InternalAdeptness.g:5287:1: ( 'confidence is in constant degradation' )
            {
            // InternalAdeptness.g:5287:1: ( 'confidence is in constant degradation' )
            // InternalAdeptness.g:5288:2: 'confidence is in constant degradation'
            {
             before(grammarAccess.getConstDegAccess().getConfidenceIsInConstantDegradationKeyword_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalAdeptness.g:5297:1: rule__ConstDeg__Group__1 : rule__ConstDeg__Group__1__Impl ;
    public final void rule__ConstDeg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5301:1: ( rule__ConstDeg__Group__1__Impl )
            // InternalAdeptness.g:5302:2: rule__ConstDeg__Group__1__Impl
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
    // InternalAdeptness.g:5308:1: rule__ConstDeg__Group__1__Impl : ( ( rule__ConstDeg__CantAssignment_1 ) ) ;
    public final void rule__ConstDeg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5312:1: ( ( ( rule__ConstDeg__CantAssignment_1 ) ) )
            // InternalAdeptness.g:5313:1: ( ( rule__ConstDeg__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:5313:1: ( ( rule__ConstDeg__CantAssignment_1 ) )
            // InternalAdeptness.g:5314:2: ( rule__ConstDeg__CantAssignment_1 )
            {
             before(grammarAccess.getConstDegAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:5315:2: ( rule__ConstDeg__CantAssignment_1 )
            // InternalAdeptness.g:5315:3: rule__ConstDeg__CantAssignment_1
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
    // InternalAdeptness.g:5324:1: rule__HighTime__Group__0 : rule__HighTime__Group__0__Impl rule__HighTime__Group__1 ;
    public final void rule__HighTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5328:1: ( rule__HighTime__Group__0__Impl rule__HighTime__Group__1 )
            // InternalAdeptness.g:5329:2: rule__HighTime__Group__0__Impl rule__HighTime__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalAdeptness.g:5336:1: rule__HighTime__Group__0__Impl : ( 'confidence is below' ) ;
    public final void rule__HighTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5340:1: ( ( 'confidence is below' ) )
            // InternalAdeptness.g:5341:1: ( 'confidence is below' )
            {
            // InternalAdeptness.g:5341:1: ( 'confidence is below' )
            // InternalAdeptness.g:5342:2: 'confidence is below'
            {
             before(grammarAccess.getHighTimeAccess().getConfidenceIsBelowKeyword_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalAdeptness.g:5351:1: rule__HighTime__Group__1 : rule__HighTime__Group__1__Impl rule__HighTime__Group__2 ;
    public final void rule__HighTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5355:1: ( rule__HighTime__Group__1__Impl rule__HighTime__Group__2 )
            // InternalAdeptness.g:5356:2: rule__HighTime__Group__1__Impl rule__HighTime__Group__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalAdeptness.g:5363:1: rule__HighTime__Group__1__Impl : ( ( rule__HighTime__CantAssignment_1 ) ) ;
    public final void rule__HighTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5367:1: ( ( ( rule__HighTime__CantAssignment_1 ) ) )
            // InternalAdeptness.g:5368:1: ( ( rule__HighTime__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:5368:1: ( ( rule__HighTime__CantAssignment_1 ) )
            // InternalAdeptness.g:5369:2: ( rule__HighTime__CantAssignment_1 )
            {
             before(grammarAccess.getHighTimeAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:5370:2: ( rule__HighTime__CantAssignment_1 )
            // InternalAdeptness.g:5370:3: rule__HighTime__CantAssignment_1
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
    // InternalAdeptness.g:5378:1: rule__HighTime__Group__2 : rule__HighTime__Group__2__Impl rule__HighTime__Group__3 ;
    public final void rule__HighTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5382:1: ( rule__HighTime__Group__2__Impl rule__HighTime__Group__3 )
            // InternalAdeptness.g:5383:2: rule__HighTime__Group__2__Impl rule__HighTime__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalAdeptness.g:5390:1: rule__HighTime__Group__2__Impl : ( 'within' ) ;
    public final void rule__HighTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5394:1: ( ( 'within' ) )
            // InternalAdeptness.g:5395:1: ( 'within' )
            {
            // InternalAdeptness.g:5395:1: ( 'within' )
            // InternalAdeptness.g:5396:2: 'within'
            {
             before(grammarAccess.getHighTimeAccess().getWithinKeyword_2()); 
            match(input,70,FOLLOW_2); 
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
    // InternalAdeptness.g:5405:1: rule__HighTime__Group__3 : rule__HighTime__Group__3__Impl rule__HighTime__Group__4 ;
    public final void rule__HighTime__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5409:1: ( rule__HighTime__Group__3__Impl rule__HighTime__Group__4 )
            // InternalAdeptness.g:5410:2: rule__HighTime__Group__3__Impl rule__HighTime__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalAdeptness.g:5417:1: rule__HighTime__Group__3__Impl : ( ( rule__HighTime__TimeAssignment_3 ) ) ;
    public final void rule__HighTime__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5421:1: ( ( ( rule__HighTime__TimeAssignment_3 ) ) )
            // InternalAdeptness.g:5422:1: ( ( rule__HighTime__TimeAssignment_3 ) )
            {
            // InternalAdeptness.g:5422:1: ( ( rule__HighTime__TimeAssignment_3 ) )
            // InternalAdeptness.g:5423:2: ( rule__HighTime__TimeAssignment_3 )
            {
             before(grammarAccess.getHighTimeAccess().getTimeAssignment_3()); 
            // InternalAdeptness.g:5424:2: ( rule__HighTime__TimeAssignment_3 )
            // InternalAdeptness.g:5424:3: rule__HighTime__TimeAssignment_3
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
    // InternalAdeptness.g:5432:1: rule__HighTime__Group__4 : rule__HighTime__Group__4__Impl ;
    public final void rule__HighTime__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5436:1: ( rule__HighTime__Group__4__Impl )
            // InternalAdeptness.g:5437:2: rule__HighTime__Group__4__Impl
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
    // InternalAdeptness.g:5443:1: rule__HighTime__Group__4__Impl : ( ( rule__HighTime__UnitAssignment_4 ) ) ;
    public final void rule__HighTime__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5447:1: ( ( ( rule__HighTime__UnitAssignment_4 ) ) )
            // InternalAdeptness.g:5448:1: ( ( rule__HighTime__UnitAssignment_4 ) )
            {
            // InternalAdeptness.g:5448:1: ( ( rule__HighTime__UnitAssignment_4 ) )
            // InternalAdeptness.g:5449:2: ( rule__HighTime__UnitAssignment_4 )
            {
             before(grammarAccess.getHighTimeAccess().getUnitAssignment_4()); 
            // InternalAdeptness.g:5450:2: ( rule__HighTime__UnitAssignment_4 )
            // InternalAdeptness.g:5450:3: rule__HighTime__UnitAssignment_4
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
    // InternalAdeptness.g:5459:1: rule__HighPeak__Group__0 : rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1 ;
    public final void rule__HighPeak__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5463:1: ( rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1 )
            // InternalAdeptness.g:5464:2: rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalAdeptness.g:5471:1: rule__HighPeak__Group__0__Impl : ( 'confidence is below' ) ;
    public final void rule__HighPeak__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5475:1: ( ( 'confidence is below' ) )
            // InternalAdeptness.g:5476:1: ( 'confidence is below' )
            {
            // InternalAdeptness.g:5476:1: ( 'confidence is below' )
            // InternalAdeptness.g:5477:2: 'confidence is below'
            {
             before(grammarAccess.getHighPeakAccess().getConfidenceIsBelowKeyword_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalAdeptness.g:5486:1: rule__HighPeak__Group__1 : rule__HighPeak__Group__1__Impl ;
    public final void rule__HighPeak__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5490:1: ( rule__HighPeak__Group__1__Impl )
            // InternalAdeptness.g:5491:2: rule__HighPeak__Group__1__Impl
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
    // InternalAdeptness.g:5497:1: rule__HighPeak__Group__1__Impl : ( ( rule__HighPeak__CantAssignment_1 ) ) ;
    public final void rule__HighPeak__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5501:1: ( ( ( rule__HighPeak__CantAssignment_1 ) ) )
            // InternalAdeptness.g:5502:1: ( ( rule__HighPeak__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:5502:1: ( ( rule__HighPeak__CantAssignment_1 ) )
            // InternalAdeptness.g:5503:2: ( rule__HighPeak__CantAssignment_1 )
            {
             before(grammarAccess.getHighPeakAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:5504:2: ( rule__HighPeak__CantAssignment_1 )
            // InternalAdeptness.g:5504:3: rule__HighPeak__CantAssignment_1
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
    // InternalAdeptness.g:5513:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5517:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalAdeptness.g:5518:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalAdeptness.g:5525:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__Alternatives_0 ) ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5529:1: ( ( ( rule__Reference__Alternatives_0 ) ) )
            // InternalAdeptness.g:5530:1: ( ( rule__Reference__Alternatives_0 ) )
            {
            // InternalAdeptness.g:5530:1: ( ( rule__Reference__Alternatives_0 ) )
            // InternalAdeptness.g:5531:2: ( rule__Reference__Alternatives_0 )
            {
             before(grammarAccess.getReferenceAccess().getAlternatives_0()); 
            // InternalAdeptness.g:5532:2: ( rule__Reference__Alternatives_0 )
            // InternalAdeptness.g:5532:3: rule__Reference__Alternatives_0
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
    // InternalAdeptness.g:5540:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5544:1: ( rule__Reference__Group__1__Impl )
            // InternalAdeptness.g:5545:2: rule__Reference__Group__1__Impl
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
    // InternalAdeptness.g:5551:1: rule__Reference__Group__1__Impl : ( ';' ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5555:1: ( ( ';' ) )
            // InternalAdeptness.g:5556:1: ( ';' )
            {
            // InternalAdeptness.g:5556:1: ( ';' )
            // InternalAdeptness.g:5557:2: ';'
            {
             before(grammarAccess.getReferenceAccess().getSemicolonKeyword_1()); 
            match(input,65,FOLLOW_2); 
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


    // $ANTLR start "rule__Same__Group__0"
    // InternalAdeptness.g:5567:1: rule__Same__Group__0 : rule__Same__Group__0__Impl rule__Same__Group__1 ;
    public final void rule__Same__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5571:1: ( rule__Same__Group__0__Impl rule__Same__Group__1 )
            // InternalAdeptness.g:5572:2: rule__Same__Group__0__Impl rule__Same__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Same__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Same__Group__1();

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
    // $ANTLR end "rule__Same__Group__0"


    // $ANTLR start "rule__Same__Group__0__Impl"
    // InternalAdeptness.g:5579:1: rule__Same__Group__0__Impl : ( 'should be' ) ;
    public final void rule__Same__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5583:1: ( ( 'should be' ) )
            // InternalAdeptness.g:5584:1: ( 'should be' )
            {
            // InternalAdeptness.g:5584:1: ( 'should be' )
            // InternalAdeptness.g:5585:2: 'should be'
            {
             before(grammarAccess.getSameAccess().getShouldBeKeyword_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getSameAccess().getShouldBeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Same__Group__0__Impl"


    // $ANTLR start "rule__Same__Group__1"
    // InternalAdeptness.g:5594:1: rule__Same__Group__1 : rule__Same__Group__1__Impl rule__Same__Group__2 ;
    public final void rule__Same__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5598:1: ( rule__Same__Group__1__Impl rule__Same__Group__2 )
            // InternalAdeptness.g:5599:2: rule__Same__Group__1__Impl rule__Same__Group__2
            {
            pushFollow(FOLLOW_53);
            rule__Same__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Same__Group__2();

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
    // $ANTLR end "rule__Same__Group__1"


    // $ANTLR start "rule__Same__Group__1__Impl"
    // InternalAdeptness.g:5606:1: rule__Same__Group__1__Impl : ( ( rule__Same__Bound_uppAssignment_1 ) ) ;
    public final void rule__Same__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5610:1: ( ( ( rule__Same__Bound_uppAssignment_1 ) ) )
            // InternalAdeptness.g:5611:1: ( ( rule__Same__Bound_uppAssignment_1 ) )
            {
            // InternalAdeptness.g:5611:1: ( ( rule__Same__Bound_uppAssignment_1 ) )
            // InternalAdeptness.g:5612:2: ( rule__Same__Bound_uppAssignment_1 )
            {
             before(grammarAccess.getSameAccess().getBound_uppAssignment_1()); 
            // InternalAdeptness.g:5613:2: ( rule__Same__Bound_uppAssignment_1 )
            // InternalAdeptness.g:5613:3: rule__Same__Bound_uppAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Same__Bound_uppAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSameAccess().getBound_uppAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Same__Group__1__Impl"


    // $ANTLR start "rule__Same__Group__2"
    // InternalAdeptness.g:5621:1: rule__Same__Group__2 : rule__Same__Group__2__Impl ;
    public final void rule__Same__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5625:1: ( rule__Same__Group__2__Impl )
            // InternalAdeptness.g:5626:2: rule__Same__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Same__Group__2__Impl();

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
    // $ANTLR end "rule__Same__Group__2"


    // $ANTLR start "rule__Same__Group__2__Impl"
    // InternalAdeptness.g:5632:1: rule__Same__Group__2__Impl : ( ( rule__Same__Alternatives_2 )? ) ;
    public final void rule__Same__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5636:1: ( ( ( rule__Same__Alternatives_2 )? ) )
            // InternalAdeptness.g:5637:1: ( ( rule__Same__Alternatives_2 )? )
            {
            // InternalAdeptness.g:5637:1: ( ( rule__Same__Alternatives_2 )? )
            // InternalAdeptness.g:5638:2: ( rule__Same__Alternatives_2 )?
            {
             before(grammarAccess.getSameAccess().getAlternatives_2()); 
            // InternalAdeptness.g:5639:2: ( rule__Same__Alternatives_2 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==78||(LA44_0>=80 && LA44_0<=81)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAdeptness.g:5639:3: rule__Same__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Same__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSameAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Same__Group__2__Impl"


    // $ANTLR start "rule__NotSame__Group__0"
    // InternalAdeptness.g:5648:1: rule__NotSame__Group__0 : rule__NotSame__Group__0__Impl rule__NotSame__Group__1 ;
    public final void rule__NotSame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5652:1: ( rule__NotSame__Group__0__Impl rule__NotSame__Group__1 )
            // InternalAdeptness.g:5653:2: rule__NotSame__Group__0__Impl rule__NotSame__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__NotSame__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotSame__Group__1();

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
    // $ANTLR end "rule__NotSame__Group__0"


    // $ANTLR start "rule__NotSame__Group__0__Impl"
    // InternalAdeptness.g:5660:1: rule__NotSame__Group__0__Impl : ( 'should not be' ) ;
    public final void rule__NotSame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5664:1: ( ( 'should not be' ) )
            // InternalAdeptness.g:5665:1: ( 'should not be' )
            {
            // InternalAdeptness.g:5665:1: ( 'should not be' )
            // InternalAdeptness.g:5666:2: 'should not be'
            {
             before(grammarAccess.getNotSameAccess().getShouldNotBeKeyword_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getNotSameAccess().getShouldNotBeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotSame__Group__0__Impl"


    // $ANTLR start "rule__NotSame__Group__1"
    // InternalAdeptness.g:5675:1: rule__NotSame__Group__1 : rule__NotSame__Group__1__Impl rule__NotSame__Group__2 ;
    public final void rule__NotSame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5679:1: ( rule__NotSame__Group__1__Impl rule__NotSame__Group__2 )
            // InternalAdeptness.g:5680:2: rule__NotSame__Group__1__Impl rule__NotSame__Group__2
            {
            pushFollow(FOLLOW_53);
            rule__NotSame__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotSame__Group__2();

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
    // $ANTLR end "rule__NotSame__Group__1"


    // $ANTLR start "rule__NotSame__Group__1__Impl"
    // InternalAdeptness.g:5687:1: rule__NotSame__Group__1__Impl : ( ( rule__NotSame__Bound_uppAssignment_1 ) ) ;
    public final void rule__NotSame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5691:1: ( ( ( rule__NotSame__Bound_uppAssignment_1 ) ) )
            // InternalAdeptness.g:5692:1: ( ( rule__NotSame__Bound_uppAssignment_1 ) )
            {
            // InternalAdeptness.g:5692:1: ( ( rule__NotSame__Bound_uppAssignment_1 ) )
            // InternalAdeptness.g:5693:2: ( rule__NotSame__Bound_uppAssignment_1 )
            {
             before(grammarAccess.getNotSameAccess().getBound_uppAssignment_1()); 
            // InternalAdeptness.g:5694:2: ( rule__NotSame__Bound_uppAssignment_1 )
            // InternalAdeptness.g:5694:3: rule__NotSame__Bound_uppAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NotSame__Bound_uppAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNotSameAccess().getBound_uppAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotSame__Group__1__Impl"


    // $ANTLR start "rule__NotSame__Group__2"
    // InternalAdeptness.g:5702:1: rule__NotSame__Group__2 : rule__NotSame__Group__2__Impl ;
    public final void rule__NotSame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5706:1: ( rule__NotSame__Group__2__Impl )
            // InternalAdeptness.g:5707:2: rule__NotSame__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotSame__Group__2__Impl();

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
    // $ANTLR end "rule__NotSame__Group__2"


    // $ANTLR start "rule__NotSame__Group__2__Impl"
    // InternalAdeptness.g:5713:1: rule__NotSame__Group__2__Impl : ( ( rule__NotSame__Alternatives_2 )? ) ;
    public final void rule__NotSame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5717:1: ( ( ( rule__NotSame__Alternatives_2 )? ) )
            // InternalAdeptness.g:5718:1: ( ( rule__NotSame__Alternatives_2 )? )
            {
            // InternalAdeptness.g:5718:1: ( ( rule__NotSame__Alternatives_2 )? )
            // InternalAdeptness.g:5719:2: ( rule__NotSame__Alternatives_2 )?
            {
             before(grammarAccess.getNotSameAccess().getAlternatives_2()); 
            // InternalAdeptness.g:5720:2: ( rule__NotSame__Alternatives_2 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==78||(LA45_0>=80 && LA45_0<=81)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAdeptness.g:5720:3: rule__NotSame__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__NotSame__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNotSameAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotSame__Group__2__Impl"


    // $ANTLR start "rule__Upper__Group__0"
    // InternalAdeptness.g:5729:1: rule__Upper__Group__0 : rule__Upper__Group__0__Impl rule__Upper__Group__1 ;
    public final void rule__Upper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5733:1: ( rule__Upper__Group__0__Impl rule__Upper__Group__1 )
            // InternalAdeptness.g:5734:2: rule__Upper__Group__0__Impl rule__Upper__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalAdeptness.g:5741:1: rule__Upper__Group__0__Impl : ( 'is below' ) ;
    public final void rule__Upper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5745:1: ( ( 'is below' ) )
            // InternalAdeptness.g:5746:1: ( 'is below' )
            {
            // InternalAdeptness.g:5746:1: ( 'is below' )
            // InternalAdeptness.g:5747:2: 'is below'
            {
             before(grammarAccess.getUpperAccess().getIsBelowKeyword_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalAdeptness.g:5756:1: rule__Upper__Group__1 : rule__Upper__Group__1__Impl rule__Upper__Group__2 ;
    public final void rule__Upper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5760:1: ( rule__Upper__Group__1__Impl rule__Upper__Group__2 )
            // InternalAdeptness.g:5761:2: rule__Upper__Group__1__Impl rule__Upper__Group__2
            {
            pushFollow(FOLLOW_53);
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
    // InternalAdeptness.g:5768:1: rule__Upper__Group__1__Impl : ( ( rule__Upper__Bound_uppAssignment_1 ) ) ;
    public final void rule__Upper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5772:1: ( ( ( rule__Upper__Bound_uppAssignment_1 ) ) )
            // InternalAdeptness.g:5773:1: ( ( rule__Upper__Bound_uppAssignment_1 ) )
            {
            // InternalAdeptness.g:5773:1: ( ( rule__Upper__Bound_uppAssignment_1 ) )
            // InternalAdeptness.g:5774:2: ( rule__Upper__Bound_uppAssignment_1 )
            {
             before(grammarAccess.getUpperAccess().getBound_uppAssignment_1()); 
            // InternalAdeptness.g:5775:2: ( rule__Upper__Bound_uppAssignment_1 )
            // InternalAdeptness.g:5775:3: rule__Upper__Bound_uppAssignment_1
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


    // $ANTLR start "rule__Upper__Group__2"
    // InternalAdeptness.g:5783:1: rule__Upper__Group__2 : rule__Upper__Group__2__Impl ;
    public final void rule__Upper__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5787:1: ( rule__Upper__Group__2__Impl )
            // InternalAdeptness.g:5788:2: rule__Upper__Group__2__Impl
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
    // InternalAdeptness.g:5794:1: rule__Upper__Group__2__Impl : ( ( rule__Upper__Alternatives_2 )? ) ;
    public final void rule__Upper__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5798:1: ( ( ( rule__Upper__Alternatives_2 )? ) )
            // InternalAdeptness.g:5799:1: ( ( rule__Upper__Alternatives_2 )? )
            {
            // InternalAdeptness.g:5799:1: ( ( rule__Upper__Alternatives_2 )? )
            // InternalAdeptness.g:5800:2: ( rule__Upper__Alternatives_2 )?
            {
             before(grammarAccess.getUpperAccess().getAlternatives_2()); 
            // InternalAdeptness.g:5801:2: ( rule__Upper__Alternatives_2 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==78||(LA46_0>=80 && LA46_0<=81)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAdeptness.g:5801:3: rule__Upper__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Upper__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUpperAccess().getAlternatives_2()); 

            }


            }

        }
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
    // InternalAdeptness.g:5810:1: rule__Lower__Group__0 : rule__Lower__Group__0__Impl rule__Lower__Group__1 ;
    public final void rule__Lower__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5814:1: ( rule__Lower__Group__0__Impl rule__Lower__Group__1 )
            // InternalAdeptness.g:5815:2: rule__Lower__Group__0__Impl rule__Lower__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalAdeptness.g:5822:1: rule__Lower__Group__0__Impl : ( 'is above' ) ;
    public final void rule__Lower__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5826:1: ( ( 'is above' ) )
            // InternalAdeptness.g:5827:1: ( 'is above' )
            {
            // InternalAdeptness.g:5827:1: ( 'is above' )
            // InternalAdeptness.g:5828:2: 'is above'
            {
             before(grammarAccess.getLowerAccess().getIsAboveKeyword_0()); 
            match(input,74,FOLLOW_2); 
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
    // InternalAdeptness.g:5837:1: rule__Lower__Group__1 : rule__Lower__Group__1__Impl rule__Lower__Group__2 ;
    public final void rule__Lower__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5841:1: ( rule__Lower__Group__1__Impl rule__Lower__Group__2 )
            // InternalAdeptness.g:5842:2: rule__Lower__Group__1__Impl rule__Lower__Group__2
            {
            pushFollow(FOLLOW_53);
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
    // InternalAdeptness.g:5849:1: rule__Lower__Group__1__Impl : ( ( rule__Lower__Bound_lowerAssignment_1 ) ) ;
    public final void rule__Lower__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5853:1: ( ( ( rule__Lower__Bound_lowerAssignment_1 ) ) )
            // InternalAdeptness.g:5854:1: ( ( rule__Lower__Bound_lowerAssignment_1 ) )
            {
            // InternalAdeptness.g:5854:1: ( ( rule__Lower__Bound_lowerAssignment_1 ) )
            // InternalAdeptness.g:5855:2: ( rule__Lower__Bound_lowerAssignment_1 )
            {
             before(grammarAccess.getLowerAccess().getBound_lowerAssignment_1()); 
            // InternalAdeptness.g:5856:2: ( rule__Lower__Bound_lowerAssignment_1 )
            // InternalAdeptness.g:5856:3: rule__Lower__Bound_lowerAssignment_1
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


    // $ANTLR start "rule__Lower__Group__2"
    // InternalAdeptness.g:5864:1: rule__Lower__Group__2 : rule__Lower__Group__2__Impl ;
    public final void rule__Lower__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5868:1: ( rule__Lower__Group__2__Impl )
            // InternalAdeptness.g:5869:2: rule__Lower__Group__2__Impl
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
    // InternalAdeptness.g:5875:1: rule__Lower__Group__2__Impl : ( ( rule__Lower__Alternatives_2 )? ) ;
    public final void rule__Lower__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5879:1: ( ( ( rule__Lower__Alternatives_2 )? ) )
            // InternalAdeptness.g:5880:1: ( ( rule__Lower__Alternatives_2 )? )
            {
            // InternalAdeptness.g:5880:1: ( ( rule__Lower__Alternatives_2 )? )
            // InternalAdeptness.g:5881:2: ( rule__Lower__Alternatives_2 )?
            {
             before(grammarAccess.getLowerAccess().getAlternatives_2()); 
            // InternalAdeptness.g:5882:2: ( rule__Lower__Alternatives_2 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==78||(LA47_0>=80 && LA47_0<=81)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAdeptness.g:5882:3: rule__Lower__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lower__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLowerAccess().getAlternatives_2()); 

            }


            }

        }
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
    // InternalAdeptness.g:5891:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5895:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // InternalAdeptness.g:5896:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalAdeptness.g:5903:1: rule__Range__Group__0__Impl : ( 'is in range between' ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5907:1: ( ( 'is in range between' ) )
            // InternalAdeptness.g:5908:1: ( 'is in range between' )
            {
            // InternalAdeptness.g:5908:1: ( 'is in range between' )
            // InternalAdeptness.g:5909:2: 'is in range between'
            {
             before(grammarAccess.getRangeAccess().getIsInRangeBetweenKeyword_0()); 
            match(input,75,FOLLOW_2); 
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
    // InternalAdeptness.g:5918:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5922:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // InternalAdeptness.g:5923:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FOLLOW_54);
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
    // InternalAdeptness.g:5930:1: rule__Range__Group__1__Impl : ( ( rule__Range__Bound_lowerAssignment_1 ) ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5934:1: ( ( ( rule__Range__Bound_lowerAssignment_1 ) ) )
            // InternalAdeptness.g:5935:1: ( ( rule__Range__Bound_lowerAssignment_1 ) )
            {
            // InternalAdeptness.g:5935:1: ( ( rule__Range__Bound_lowerAssignment_1 ) )
            // InternalAdeptness.g:5936:2: ( rule__Range__Bound_lowerAssignment_1 )
            {
             before(grammarAccess.getRangeAccess().getBound_lowerAssignment_1()); 
            // InternalAdeptness.g:5937:2: ( rule__Range__Bound_lowerAssignment_1 )
            // InternalAdeptness.g:5937:3: rule__Range__Bound_lowerAssignment_1
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
    // InternalAdeptness.g:5945:1: rule__Range__Group__2 : rule__Range__Group__2__Impl rule__Range__Group__3 ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5949:1: ( rule__Range__Group__2__Impl rule__Range__Group__3 )
            // InternalAdeptness.g:5950:2: rule__Range__Group__2__Impl rule__Range__Group__3
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
    // InternalAdeptness.g:5957:1: rule__Range__Group__2__Impl : ( 'and' ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5961:1: ( ( 'and' ) )
            // InternalAdeptness.g:5962:1: ( 'and' )
            {
            // InternalAdeptness.g:5962:1: ( 'and' )
            // InternalAdeptness.g:5963:2: 'and'
            {
             before(grammarAccess.getRangeAccess().getAndKeyword_2()); 
            match(input,76,FOLLOW_2); 
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
    // InternalAdeptness.g:5972:1: rule__Range__Group__3 : rule__Range__Group__3__Impl rule__Range__Group__4 ;
    public final void rule__Range__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5976:1: ( rule__Range__Group__3__Impl rule__Range__Group__4 )
            // InternalAdeptness.g:5977:2: rule__Range__Group__3__Impl rule__Range__Group__4
            {
            pushFollow(FOLLOW_53);
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
    // InternalAdeptness.g:5984:1: rule__Range__Group__3__Impl : ( ( rule__Range__Bound_uppAssignment_3 ) ) ;
    public final void rule__Range__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5988:1: ( ( ( rule__Range__Bound_uppAssignment_3 ) ) )
            // InternalAdeptness.g:5989:1: ( ( rule__Range__Bound_uppAssignment_3 ) )
            {
            // InternalAdeptness.g:5989:1: ( ( rule__Range__Bound_uppAssignment_3 ) )
            // InternalAdeptness.g:5990:2: ( rule__Range__Bound_uppAssignment_3 )
            {
             before(grammarAccess.getRangeAccess().getBound_uppAssignment_3()); 
            // InternalAdeptness.g:5991:2: ( rule__Range__Bound_uppAssignment_3 )
            // InternalAdeptness.g:5991:3: rule__Range__Bound_uppAssignment_3
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


    // $ANTLR start "rule__Range__Group__4"
    // InternalAdeptness.g:5999:1: rule__Range__Group__4 : rule__Range__Group__4__Impl ;
    public final void rule__Range__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6003:1: ( rule__Range__Group__4__Impl )
            // InternalAdeptness.g:6004:2: rule__Range__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group__4__Impl();

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
    // InternalAdeptness.g:6010:1: rule__Range__Group__4__Impl : ( ( rule__Range__Alternatives_4 )? ) ;
    public final void rule__Range__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6014:1: ( ( ( rule__Range__Alternatives_4 )? ) )
            // InternalAdeptness.g:6015:1: ( ( rule__Range__Alternatives_4 )? )
            {
            // InternalAdeptness.g:6015:1: ( ( rule__Range__Alternatives_4 )? )
            // InternalAdeptness.g:6016:2: ( rule__Range__Alternatives_4 )?
            {
             before(grammarAccess.getRangeAccess().getAlternatives_4()); 
            // InternalAdeptness.g:6017:2: ( rule__Range__Alternatives_4 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==78||(LA48_0>=80 && LA48_0<=81)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAdeptness.g:6017:3: rule__Range__Alternatives_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Range__Alternatives_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRangeAccess().getAlternatives_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Gap__Group__0"
    // InternalAdeptness.g:6026:1: rule__Gap__Group__0 : rule__Gap__Group__0__Impl rule__Gap__Group__1 ;
    public final void rule__Gap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6030:1: ( rule__Gap__Group__0__Impl rule__Gap__Group__1 )
            // InternalAdeptness.g:6031:2: rule__Gap__Group__0__Impl rule__Gap__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalAdeptness.g:6038:1: rule__Gap__Group__0__Impl : ( 'not in range between' ) ;
    public final void rule__Gap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6042:1: ( ( 'not in range between' ) )
            // InternalAdeptness.g:6043:1: ( 'not in range between' )
            {
            // InternalAdeptness.g:6043:1: ( 'not in range between' )
            // InternalAdeptness.g:6044:2: 'not in range between'
            {
             before(grammarAccess.getGapAccess().getNotInRangeBetweenKeyword_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalAdeptness.g:6053:1: rule__Gap__Group__1 : rule__Gap__Group__1__Impl rule__Gap__Group__2 ;
    public final void rule__Gap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6057:1: ( rule__Gap__Group__1__Impl rule__Gap__Group__2 )
            // InternalAdeptness.g:6058:2: rule__Gap__Group__1__Impl rule__Gap__Group__2
            {
            pushFollow(FOLLOW_54);
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
    // InternalAdeptness.g:6065:1: rule__Gap__Group__1__Impl : ( ( rule__Gap__Bound_lowerAssignment_1 ) ) ;
    public final void rule__Gap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6069:1: ( ( ( rule__Gap__Bound_lowerAssignment_1 ) ) )
            // InternalAdeptness.g:6070:1: ( ( rule__Gap__Bound_lowerAssignment_1 ) )
            {
            // InternalAdeptness.g:6070:1: ( ( rule__Gap__Bound_lowerAssignment_1 ) )
            // InternalAdeptness.g:6071:2: ( rule__Gap__Bound_lowerAssignment_1 )
            {
             before(grammarAccess.getGapAccess().getBound_lowerAssignment_1()); 
            // InternalAdeptness.g:6072:2: ( rule__Gap__Bound_lowerAssignment_1 )
            // InternalAdeptness.g:6072:3: rule__Gap__Bound_lowerAssignment_1
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
    // InternalAdeptness.g:6080:1: rule__Gap__Group__2 : rule__Gap__Group__2__Impl rule__Gap__Group__3 ;
    public final void rule__Gap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6084:1: ( rule__Gap__Group__2__Impl rule__Gap__Group__3 )
            // InternalAdeptness.g:6085:2: rule__Gap__Group__2__Impl rule__Gap__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalAdeptness.g:6092:1: rule__Gap__Group__2__Impl : ( 'and' ) ;
    public final void rule__Gap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6096:1: ( ( 'and' ) )
            // InternalAdeptness.g:6097:1: ( 'and' )
            {
            // InternalAdeptness.g:6097:1: ( 'and' )
            // InternalAdeptness.g:6098:2: 'and'
            {
             before(grammarAccess.getGapAccess().getAndKeyword_2()); 
            match(input,76,FOLLOW_2); 
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
    // InternalAdeptness.g:6107:1: rule__Gap__Group__3 : rule__Gap__Group__3__Impl rule__Gap__Group__4 ;
    public final void rule__Gap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6111:1: ( rule__Gap__Group__3__Impl rule__Gap__Group__4 )
            // InternalAdeptness.g:6112:2: rule__Gap__Group__3__Impl rule__Gap__Group__4
            {
            pushFollow(FOLLOW_53);
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
    // InternalAdeptness.g:6119:1: rule__Gap__Group__3__Impl : ( ( rule__Gap__Bound_uppAssignment_3 ) ) ;
    public final void rule__Gap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6123:1: ( ( ( rule__Gap__Bound_uppAssignment_3 ) ) )
            // InternalAdeptness.g:6124:1: ( ( rule__Gap__Bound_uppAssignment_3 ) )
            {
            // InternalAdeptness.g:6124:1: ( ( rule__Gap__Bound_uppAssignment_3 ) )
            // InternalAdeptness.g:6125:2: ( rule__Gap__Bound_uppAssignment_3 )
            {
             before(grammarAccess.getGapAccess().getBound_uppAssignment_3()); 
            // InternalAdeptness.g:6126:2: ( rule__Gap__Bound_uppAssignment_3 )
            // InternalAdeptness.g:6126:3: rule__Gap__Bound_uppAssignment_3
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


    // $ANTLR start "rule__Gap__Group__4"
    // InternalAdeptness.g:6134:1: rule__Gap__Group__4 : rule__Gap__Group__4__Impl ;
    public final void rule__Gap__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6138:1: ( rule__Gap__Group__4__Impl )
            // InternalAdeptness.g:6139:2: rule__Gap__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gap__Group__4__Impl();

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
    // InternalAdeptness.g:6145:1: rule__Gap__Group__4__Impl : ( ( rule__Gap__Alternatives_4 )? ) ;
    public final void rule__Gap__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6149:1: ( ( ( rule__Gap__Alternatives_4 )? ) )
            // InternalAdeptness.g:6150:1: ( ( rule__Gap__Alternatives_4 )? )
            {
            // InternalAdeptness.g:6150:1: ( ( rule__Gap__Alternatives_4 )? )
            // InternalAdeptness.g:6151:2: ( rule__Gap__Alternatives_4 )?
            {
             before(grammarAccess.getGapAccess().getAlternatives_4()); 
            // InternalAdeptness.g:6152:2: ( rule__Gap__Alternatives_4 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==78||(LA49_0>=80 && LA49_0<=81)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAdeptness.g:6152:3: rule__Gap__Alternatives_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gap__Alternatives_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGapAccess().getAlternatives_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Exactly__Group__0"
    // InternalAdeptness.g:6161:1: rule__Exactly__Group__0 : rule__Exactly__Group__0__Impl rule__Exactly__Group__1 ;
    public final void rule__Exactly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6165:1: ( rule__Exactly__Group__0__Impl rule__Exactly__Group__1 )
            // InternalAdeptness.g:6166:2: rule__Exactly__Group__0__Impl rule__Exactly__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Exactly__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exactly__Group__1();

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
    // $ANTLR end "rule__Exactly__Group__0"


    // $ANTLR start "rule__Exactly__Group__0__Impl"
    // InternalAdeptness.g:6173:1: rule__Exactly__Group__0__Impl : ( 'exactly' ) ;
    public final void rule__Exactly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6177:1: ( ( 'exactly' ) )
            // InternalAdeptness.g:6178:1: ( 'exactly' )
            {
            // InternalAdeptness.g:6178:1: ( 'exactly' )
            // InternalAdeptness.g:6179:2: 'exactly'
            {
             before(grammarAccess.getExactlyAccess().getExactlyKeyword_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getExactlyAccess().getExactlyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exactly__Group__0__Impl"


    // $ANTLR start "rule__Exactly__Group__1"
    // InternalAdeptness.g:6188:1: rule__Exactly__Group__1 : rule__Exactly__Group__1__Impl rule__Exactly__Group__2 ;
    public final void rule__Exactly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6192:1: ( rule__Exactly__Group__1__Impl rule__Exactly__Group__2 )
            // InternalAdeptness.g:6193:2: rule__Exactly__Group__1__Impl rule__Exactly__Group__2
            {
            pushFollow(FOLLOW_55);
            rule__Exactly__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exactly__Group__2();

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
    // $ANTLR end "rule__Exactly__Group__1"


    // $ANTLR start "rule__Exactly__Group__1__Impl"
    // InternalAdeptness.g:6200:1: rule__Exactly__Group__1__Impl : ( ( rule__Exactly__ValueAssignment_1 ) ) ;
    public final void rule__Exactly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6204:1: ( ( ( rule__Exactly__ValueAssignment_1 ) ) )
            // InternalAdeptness.g:6205:1: ( ( rule__Exactly__ValueAssignment_1 ) )
            {
            // InternalAdeptness.g:6205:1: ( ( rule__Exactly__ValueAssignment_1 ) )
            // InternalAdeptness.g:6206:2: ( rule__Exactly__ValueAssignment_1 )
            {
             before(grammarAccess.getExactlyAccess().getValueAssignment_1()); 
            // InternalAdeptness.g:6207:2: ( rule__Exactly__ValueAssignment_1 )
            // InternalAdeptness.g:6207:3: rule__Exactly__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Exactly__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExactlyAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exactly__Group__1__Impl"


    // $ANTLR start "rule__Exactly__Group__2"
    // InternalAdeptness.g:6215:1: rule__Exactly__Group__2 : rule__Exactly__Group__2__Impl ;
    public final void rule__Exactly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6219:1: ( rule__Exactly__Group__2__Impl )
            // InternalAdeptness.g:6220:2: rule__Exactly__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exactly__Group__2__Impl();

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
    // $ANTLR end "rule__Exactly__Group__2"


    // $ANTLR start "rule__Exactly__Group__2__Impl"
    // InternalAdeptness.g:6226:1: rule__Exactly__Group__2__Impl : ( ( rule__Exactly__Alternatives_2 ) ) ;
    public final void rule__Exactly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6230:1: ( ( ( rule__Exactly__Alternatives_2 ) ) )
            // InternalAdeptness.g:6231:1: ( ( rule__Exactly__Alternatives_2 ) )
            {
            // InternalAdeptness.g:6231:1: ( ( rule__Exactly__Alternatives_2 ) )
            // InternalAdeptness.g:6232:2: ( rule__Exactly__Alternatives_2 )
            {
             before(grammarAccess.getExactlyAccess().getAlternatives_2()); 
            // InternalAdeptness.g:6233:2: ( rule__Exactly__Alternatives_2 )
            // InternalAdeptness.g:6233:3: rule__Exactly__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Exactly__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getExactlyAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exactly__Group__2__Impl"


    // $ANTLR start "rule__Exactly__Group_2_1__0"
    // InternalAdeptness.g:6242:1: rule__Exactly__Group_2_1__0 : rule__Exactly__Group_2_1__0__Impl rule__Exactly__Group_2_1__1 ;
    public final void rule__Exactly__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6246:1: ( rule__Exactly__Group_2_1__0__Impl rule__Exactly__Group_2_1__1 )
            // InternalAdeptness.g:6247:2: rule__Exactly__Group_2_1__0__Impl rule__Exactly__Group_2_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Exactly__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exactly__Group_2_1__1();

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
    // $ANTLR end "rule__Exactly__Group_2_1__0"


    // $ANTLR start "rule__Exactly__Group_2_1__0__Impl"
    // InternalAdeptness.g:6254:1: rule__Exactly__Group_2_1__0__Impl : ( 'times in' ) ;
    public final void rule__Exactly__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6258:1: ( ( 'times in' ) )
            // InternalAdeptness.g:6259:1: ( 'times in' )
            {
            // InternalAdeptness.g:6259:1: ( 'times in' )
            // InternalAdeptness.g:6260:2: 'times in'
            {
             before(grammarAccess.getExactlyAccess().getTimesInKeyword_2_1_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getExactlyAccess().getTimesInKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exactly__Group_2_1__0__Impl"


    // $ANTLR start "rule__Exactly__Group_2_1__1"
    // InternalAdeptness.g:6269:1: rule__Exactly__Group_2_1__1 : rule__Exactly__Group_2_1__1__Impl rule__Exactly__Group_2_1__2 ;
    public final void rule__Exactly__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6273:1: ( rule__Exactly__Group_2_1__1__Impl rule__Exactly__Group_2_1__2 )
            // InternalAdeptness.g:6274:2: rule__Exactly__Group_2_1__1__Impl rule__Exactly__Group_2_1__2
            {
            pushFollow(FOLLOW_42);
            rule__Exactly__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exactly__Group_2_1__2();

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
    // $ANTLR end "rule__Exactly__Group_2_1__1"


    // $ANTLR start "rule__Exactly__Group_2_1__1__Impl"
    // InternalAdeptness.g:6281:1: rule__Exactly__Group_2_1__1__Impl : ( ( rule__Exactly__TimeAssignment_2_1_1 ) ) ;
    public final void rule__Exactly__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6285:1: ( ( ( rule__Exactly__TimeAssignment_2_1_1 ) ) )
            // InternalAdeptness.g:6286:1: ( ( rule__Exactly__TimeAssignment_2_1_1 ) )
            {
            // InternalAdeptness.g:6286:1: ( ( rule__Exactly__TimeAssignment_2_1_1 ) )
            // InternalAdeptness.g:6287:2: ( rule__Exactly__TimeAssignment_2_1_1 )
            {
             before(grammarAccess.getExactlyAccess().getTimeAssignment_2_1_1()); 
            // InternalAdeptness.g:6288:2: ( rule__Exactly__TimeAssignment_2_1_1 )
            // InternalAdeptness.g:6288:3: rule__Exactly__TimeAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Exactly__TimeAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExactlyAccess().getTimeAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exactly__Group_2_1__1__Impl"


    // $ANTLR start "rule__Exactly__Group_2_1__2"
    // InternalAdeptness.g:6296:1: rule__Exactly__Group_2_1__2 : rule__Exactly__Group_2_1__2__Impl ;
    public final void rule__Exactly__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6300:1: ( rule__Exactly__Group_2_1__2__Impl )
            // InternalAdeptness.g:6301:2: rule__Exactly__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exactly__Group_2_1__2__Impl();

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
    // $ANTLR end "rule__Exactly__Group_2_1__2"


    // $ANTLR start "rule__Exactly__Group_2_1__2__Impl"
    // InternalAdeptness.g:6307:1: rule__Exactly__Group_2_1__2__Impl : ( ( rule__Exactly__UnitAssignment_2_1_2 ) ) ;
    public final void rule__Exactly__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6311:1: ( ( ( rule__Exactly__UnitAssignment_2_1_2 ) ) )
            // InternalAdeptness.g:6312:1: ( ( rule__Exactly__UnitAssignment_2_1_2 ) )
            {
            // InternalAdeptness.g:6312:1: ( ( rule__Exactly__UnitAssignment_2_1_2 ) )
            // InternalAdeptness.g:6313:2: ( rule__Exactly__UnitAssignment_2_1_2 )
            {
             before(grammarAccess.getExactlyAccess().getUnitAssignment_2_1_2()); 
            // InternalAdeptness.g:6314:2: ( rule__Exactly__UnitAssignment_2_1_2 )
            // InternalAdeptness.g:6314:3: rule__Exactly__UnitAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Exactly__UnitAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExactlyAccess().getUnitAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exactly__Group_2_1__2__Impl"


    // $ANTLR start "rule__At_most__Group__0"
    // InternalAdeptness.g:6323:1: rule__At_most__Group__0 : rule__At_most__Group__0__Impl rule__At_most__Group__1 ;
    public final void rule__At_most__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6327:1: ( rule__At_most__Group__0__Impl rule__At_most__Group__1 )
            // InternalAdeptness.g:6328:2: rule__At_most__Group__0__Impl rule__At_most__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__At_most__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__At_most__Group__1();

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
    // $ANTLR end "rule__At_most__Group__0"


    // $ANTLR start "rule__At_most__Group__0__Impl"
    // InternalAdeptness.g:6335:1: rule__At_most__Group__0__Impl : ( 'at most' ) ;
    public final void rule__At_most__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6339:1: ( ( 'at most' ) )
            // InternalAdeptness.g:6340:1: ( 'at most' )
            {
            // InternalAdeptness.g:6340:1: ( 'at most' )
            // InternalAdeptness.g:6341:2: 'at most'
            {
             before(grammarAccess.getAt_mostAccess().getAtMostKeyword_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getAt_mostAccess().getAtMostKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At_most__Group__0__Impl"


    // $ANTLR start "rule__At_most__Group__1"
    // InternalAdeptness.g:6350:1: rule__At_most__Group__1 : rule__At_most__Group__1__Impl rule__At_most__Group__2 ;
    public final void rule__At_most__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6354:1: ( rule__At_most__Group__1__Impl rule__At_most__Group__2 )
            // InternalAdeptness.g:6355:2: rule__At_most__Group__1__Impl rule__At_most__Group__2
            {
            pushFollow(FOLLOW_55);
            rule__At_most__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__At_most__Group__2();

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
    // $ANTLR end "rule__At_most__Group__1"


    // $ANTLR start "rule__At_most__Group__1__Impl"
    // InternalAdeptness.g:6362:1: rule__At_most__Group__1__Impl : ( ( rule__At_most__ValueAssignment_1 ) ) ;
    public final void rule__At_most__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6366:1: ( ( ( rule__At_most__ValueAssignment_1 ) ) )
            // InternalAdeptness.g:6367:1: ( ( rule__At_most__ValueAssignment_1 ) )
            {
            // InternalAdeptness.g:6367:1: ( ( rule__At_most__ValueAssignment_1 ) )
            // InternalAdeptness.g:6368:2: ( rule__At_most__ValueAssignment_1 )
            {
             before(grammarAccess.getAt_mostAccess().getValueAssignment_1()); 
            // InternalAdeptness.g:6369:2: ( rule__At_most__ValueAssignment_1 )
            // InternalAdeptness.g:6369:3: rule__At_most__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__At_most__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAt_mostAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At_most__Group__1__Impl"


    // $ANTLR start "rule__At_most__Group__2"
    // InternalAdeptness.g:6377:1: rule__At_most__Group__2 : rule__At_most__Group__2__Impl ;
    public final void rule__At_most__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6381:1: ( rule__At_most__Group__2__Impl )
            // InternalAdeptness.g:6382:2: rule__At_most__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__At_most__Group__2__Impl();

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
    // $ANTLR end "rule__At_most__Group__2"


    // $ANTLR start "rule__At_most__Group__2__Impl"
    // InternalAdeptness.g:6388:1: rule__At_most__Group__2__Impl : ( ( rule__At_most__Alternatives_2 ) ) ;
    public final void rule__At_most__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6392:1: ( ( ( rule__At_most__Alternatives_2 ) ) )
            // InternalAdeptness.g:6393:1: ( ( rule__At_most__Alternatives_2 ) )
            {
            // InternalAdeptness.g:6393:1: ( ( rule__At_most__Alternatives_2 ) )
            // InternalAdeptness.g:6394:2: ( rule__At_most__Alternatives_2 )
            {
             before(grammarAccess.getAt_mostAccess().getAlternatives_2()); 
            // InternalAdeptness.g:6395:2: ( rule__At_most__Alternatives_2 )
            // InternalAdeptness.g:6395:3: rule__At_most__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__At_most__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getAt_mostAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At_most__Group__2__Impl"


    // $ANTLR start "rule__At_most__Group_2_1__0"
    // InternalAdeptness.g:6404:1: rule__At_most__Group_2_1__0 : rule__At_most__Group_2_1__0__Impl rule__At_most__Group_2_1__1 ;
    public final void rule__At_most__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6408:1: ( rule__At_most__Group_2_1__0__Impl rule__At_most__Group_2_1__1 )
            // InternalAdeptness.g:6409:2: rule__At_most__Group_2_1__0__Impl rule__At_most__Group_2_1__1
            {
            pushFollow(FOLLOW_24);
            rule__At_most__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__At_most__Group_2_1__1();

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
    // $ANTLR end "rule__At_most__Group_2_1__0"


    // $ANTLR start "rule__At_most__Group_2_1__0__Impl"
    // InternalAdeptness.g:6416:1: rule__At_most__Group_2_1__0__Impl : ( 'times in' ) ;
    public final void rule__At_most__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6420:1: ( ( 'times in' ) )
            // InternalAdeptness.g:6421:1: ( 'times in' )
            {
            // InternalAdeptness.g:6421:1: ( 'times in' )
            // InternalAdeptness.g:6422:2: 'times in'
            {
             before(grammarAccess.getAt_mostAccess().getTimesInKeyword_2_1_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getAt_mostAccess().getTimesInKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At_most__Group_2_1__0__Impl"


    // $ANTLR start "rule__At_most__Group_2_1__1"
    // InternalAdeptness.g:6431:1: rule__At_most__Group_2_1__1 : rule__At_most__Group_2_1__1__Impl rule__At_most__Group_2_1__2 ;
    public final void rule__At_most__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6435:1: ( rule__At_most__Group_2_1__1__Impl rule__At_most__Group_2_1__2 )
            // InternalAdeptness.g:6436:2: rule__At_most__Group_2_1__1__Impl rule__At_most__Group_2_1__2
            {
            pushFollow(FOLLOW_42);
            rule__At_most__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__At_most__Group_2_1__2();

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
    // $ANTLR end "rule__At_most__Group_2_1__1"


    // $ANTLR start "rule__At_most__Group_2_1__1__Impl"
    // InternalAdeptness.g:6443:1: rule__At_most__Group_2_1__1__Impl : ( ( rule__At_most__TimeAssignment_2_1_1 ) ) ;
    public final void rule__At_most__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6447:1: ( ( ( rule__At_most__TimeAssignment_2_1_1 ) ) )
            // InternalAdeptness.g:6448:1: ( ( rule__At_most__TimeAssignment_2_1_1 ) )
            {
            // InternalAdeptness.g:6448:1: ( ( rule__At_most__TimeAssignment_2_1_1 ) )
            // InternalAdeptness.g:6449:2: ( rule__At_most__TimeAssignment_2_1_1 )
            {
             before(grammarAccess.getAt_mostAccess().getTimeAssignment_2_1_1()); 
            // InternalAdeptness.g:6450:2: ( rule__At_most__TimeAssignment_2_1_1 )
            // InternalAdeptness.g:6450:3: rule__At_most__TimeAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__At_most__TimeAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAt_mostAccess().getTimeAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At_most__Group_2_1__1__Impl"


    // $ANTLR start "rule__At_most__Group_2_1__2"
    // InternalAdeptness.g:6458:1: rule__At_most__Group_2_1__2 : rule__At_most__Group_2_1__2__Impl ;
    public final void rule__At_most__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6462:1: ( rule__At_most__Group_2_1__2__Impl )
            // InternalAdeptness.g:6463:2: rule__At_most__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__At_most__Group_2_1__2__Impl();

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
    // $ANTLR end "rule__At_most__Group_2_1__2"


    // $ANTLR start "rule__At_most__Group_2_1__2__Impl"
    // InternalAdeptness.g:6469:1: rule__At_most__Group_2_1__2__Impl : ( ( rule__At_most__UnitAssignment_2_1_2 ) ) ;
    public final void rule__At_most__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6473:1: ( ( ( rule__At_most__UnitAssignment_2_1_2 ) ) )
            // InternalAdeptness.g:6474:1: ( ( rule__At_most__UnitAssignment_2_1_2 ) )
            {
            // InternalAdeptness.g:6474:1: ( ( rule__At_most__UnitAssignment_2_1_2 ) )
            // InternalAdeptness.g:6475:2: ( rule__At_most__UnitAssignment_2_1_2 )
            {
             before(grammarAccess.getAt_mostAccess().getUnitAssignment_2_1_2()); 
            // InternalAdeptness.g:6476:2: ( rule__At_most__UnitAssignment_2_1_2 )
            // InternalAdeptness.g:6476:3: rule__At_most__UnitAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__At_most__UnitAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAt_mostAccess().getUnitAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At_most__Group_2_1__2__Impl"


    // $ANTLR start "rule__At_least__Group__0"
    // InternalAdeptness.g:6485:1: rule__At_least__Group__0 : rule__At_least__Group__0__Impl rule__At_least__Group__1 ;
    public final void rule__At_least__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6489:1: ( rule__At_least__Group__0__Impl rule__At_least__Group__1 )
            // InternalAdeptness.g:6490:2: rule__At_least__Group__0__Impl rule__At_least__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__At_least__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__At_least__Group__1();

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
    // $ANTLR end "rule__At_least__Group__0"


    // $ANTLR start "rule__At_least__Group__0__Impl"
    // InternalAdeptness.g:6497:1: rule__At_least__Group__0__Impl : ( 'at least' ) ;
    public final void rule__At_least__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6501:1: ( ( 'at least' ) )
            // InternalAdeptness.g:6502:1: ( 'at least' )
            {
            // InternalAdeptness.g:6502:1: ( 'at least' )
            // InternalAdeptness.g:6503:2: 'at least'
            {
             before(grammarAccess.getAt_leastAccess().getAtLeastKeyword_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getAt_leastAccess().getAtLeastKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At_least__Group__0__Impl"


    // $ANTLR start "rule__At_least__Group__1"
    // InternalAdeptness.g:6512:1: rule__At_least__Group__1 : rule__At_least__Group__1__Impl rule__At_least__Group__2 ;
    public final void rule__At_least__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6516:1: ( rule__At_least__Group__1__Impl rule__At_least__Group__2 )
            // InternalAdeptness.g:6517:2: rule__At_least__Group__1__Impl rule__At_least__Group__2
            {
            pushFollow(FOLLOW_55);
            rule__At_least__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__At_least__Group__2();

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
    // $ANTLR end "rule__At_least__Group__1"


    // $ANTLR start "rule__At_least__Group__1__Impl"
    // InternalAdeptness.g:6524:1: rule__At_least__Group__1__Impl : ( ( rule__At_least__ValueAssignment_1 ) ) ;
    public final void rule__At_least__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6528:1: ( ( ( rule__At_least__ValueAssignment_1 ) ) )
            // InternalAdeptness.g:6529:1: ( ( rule__At_least__ValueAssignment_1 ) )
            {
            // InternalAdeptness.g:6529:1: ( ( rule__At_least__ValueAssignment_1 ) )
            // InternalAdeptness.g:6530:2: ( rule__At_least__ValueAssignment_1 )
            {
             before(grammarAccess.getAt_leastAccess().getValueAssignment_1()); 
            // InternalAdeptness.g:6531:2: ( rule__At_least__ValueAssignment_1 )
            // InternalAdeptness.g:6531:3: rule__At_least__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__At_least__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAt_leastAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At_least__Group__1__Impl"


    // $ANTLR start "rule__At_least__Group__2"
    // InternalAdeptness.g:6539:1: rule__At_least__Group__2 : rule__At_least__Group__2__Impl ;
    public final void rule__At_least__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6543:1: ( rule__At_least__Group__2__Impl )
            // InternalAdeptness.g:6544:2: rule__At_least__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__At_least__Group__2__Impl();

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
    // $ANTLR end "rule__At_least__Group__2"


    // $ANTLR start "rule__At_least__Group__2__Impl"
    // InternalAdeptness.g:6550:1: rule__At_least__Group__2__Impl : ( ( rule__At_least__Alternatives_2 ) ) ;
    public final void rule__At_least__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6554:1: ( ( ( rule__At_least__Alternatives_2 ) ) )
            // InternalAdeptness.g:6555:1: ( ( rule__At_least__Alternatives_2 ) )
            {
            // InternalAdeptness.g:6555:1: ( ( rule__At_least__Alternatives_2 ) )
            // InternalAdeptness.g:6556:2: ( rule__At_least__Alternatives_2 )
            {
             before(grammarAccess.getAt_leastAccess().getAlternatives_2()); 
            // InternalAdeptness.g:6557:2: ( rule__At_least__Alternatives_2 )
            // InternalAdeptness.g:6557:3: rule__At_least__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__At_least__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getAt_leastAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At_least__Group__2__Impl"


    // $ANTLR start "rule__At_least__Group_2_1__0"
    // InternalAdeptness.g:6566:1: rule__At_least__Group_2_1__0 : rule__At_least__Group_2_1__0__Impl rule__At_least__Group_2_1__1 ;
    public final void rule__At_least__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6570:1: ( rule__At_least__Group_2_1__0__Impl rule__At_least__Group_2_1__1 )
            // InternalAdeptness.g:6571:2: rule__At_least__Group_2_1__0__Impl rule__At_least__Group_2_1__1
            {
            pushFollow(FOLLOW_24);
            rule__At_least__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__At_least__Group_2_1__1();

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
    // $ANTLR end "rule__At_least__Group_2_1__0"


    // $ANTLR start "rule__At_least__Group_2_1__0__Impl"
    // InternalAdeptness.g:6578:1: rule__At_least__Group_2_1__0__Impl : ( 'times in' ) ;
    public final void rule__At_least__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6582:1: ( ( 'times in' ) )
            // InternalAdeptness.g:6583:1: ( 'times in' )
            {
            // InternalAdeptness.g:6583:1: ( 'times in' )
            // InternalAdeptness.g:6584:2: 'times in'
            {
             before(grammarAccess.getAt_leastAccess().getTimesInKeyword_2_1_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getAt_leastAccess().getTimesInKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At_least__Group_2_1__0__Impl"


    // $ANTLR start "rule__At_least__Group_2_1__1"
    // InternalAdeptness.g:6593:1: rule__At_least__Group_2_1__1 : rule__At_least__Group_2_1__1__Impl rule__At_least__Group_2_1__2 ;
    public final void rule__At_least__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6597:1: ( rule__At_least__Group_2_1__1__Impl rule__At_least__Group_2_1__2 )
            // InternalAdeptness.g:6598:2: rule__At_least__Group_2_1__1__Impl rule__At_least__Group_2_1__2
            {
            pushFollow(FOLLOW_42);
            rule__At_least__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__At_least__Group_2_1__2();

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
    // $ANTLR end "rule__At_least__Group_2_1__1"


    // $ANTLR start "rule__At_least__Group_2_1__1__Impl"
    // InternalAdeptness.g:6605:1: rule__At_least__Group_2_1__1__Impl : ( ( rule__At_least__TimeAssignment_2_1_1 ) ) ;
    public final void rule__At_least__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6609:1: ( ( ( rule__At_least__TimeAssignment_2_1_1 ) ) )
            // InternalAdeptness.g:6610:1: ( ( rule__At_least__TimeAssignment_2_1_1 ) )
            {
            // InternalAdeptness.g:6610:1: ( ( rule__At_least__TimeAssignment_2_1_1 ) )
            // InternalAdeptness.g:6611:2: ( rule__At_least__TimeAssignment_2_1_1 )
            {
             before(grammarAccess.getAt_leastAccess().getTimeAssignment_2_1_1()); 
            // InternalAdeptness.g:6612:2: ( rule__At_least__TimeAssignment_2_1_1 )
            // InternalAdeptness.g:6612:3: rule__At_least__TimeAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__At_least__TimeAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAt_leastAccess().getTimeAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At_least__Group_2_1__1__Impl"


    // $ANTLR start "rule__At_least__Group_2_1__2"
    // InternalAdeptness.g:6620:1: rule__At_least__Group_2_1__2 : rule__At_least__Group_2_1__2__Impl ;
    public final void rule__At_least__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6624:1: ( rule__At_least__Group_2_1__2__Impl )
            // InternalAdeptness.g:6625:2: rule__At_least__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__At_least__Group_2_1__2__Impl();

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
    // $ANTLR end "rule__At_least__Group_2_1__2"


    // $ANTLR start "rule__At_least__Group_2_1__2__Impl"
    // InternalAdeptness.g:6631:1: rule__At_least__Group_2_1__2__Impl : ( ( rule__At_least__UnitAssignment_2_1_2 ) ) ;
    public final void rule__At_least__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6635:1: ( ( ( rule__At_least__UnitAssignment_2_1_2 ) ) )
            // InternalAdeptness.g:6636:1: ( ( rule__At_least__UnitAssignment_2_1_2 ) )
            {
            // InternalAdeptness.g:6636:1: ( ( rule__At_least__UnitAssignment_2_1_2 ) )
            // InternalAdeptness.g:6637:2: ( rule__At_least__UnitAssignment_2_1_2 )
            {
             before(grammarAccess.getAt_leastAccess().getUnitAssignment_2_1_2()); 
            // InternalAdeptness.g:6638:2: ( rule__At_least__UnitAssignment_2_1_2 )
            // InternalAdeptness.g:6638:3: rule__At_least__UnitAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__At_least__UnitAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAt_leastAccess().getUnitAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At_least__Group_2_1__2__Impl"


    // $ANTLR start "rule__D__Group__0"
    // InternalAdeptness.g:6647:1: rule__D__Group__0 : rule__D__Group__0__Impl rule__D__Group__1 ;
    public final void rule__D__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6651:1: ( rule__D__Group__0__Impl rule__D__Group__1 )
            // InternalAdeptness.g:6652:2: rule__D__Group__0__Impl rule__D__Group__1
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
    // InternalAdeptness.g:6659:1: rule__D__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__D__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6663:1: ( ( ( '-' )? ) )
            // InternalAdeptness.g:6664:1: ( ( '-' )? )
            {
            // InternalAdeptness.g:6664:1: ( ( '-' )? )
            // InternalAdeptness.g:6665:2: ( '-' )?
            {
             before(grammarAccess.getDAccess().getHyphenMinusKeyword_0()); 
            // InternalAdeptness.g:6666:2: ( '-' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==25) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalAdeptness.g:6666:3: '-'
                    {
                    match(input,25,FOLLOW_2); 

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
    // InternalAdeptness.g:6674:1: rule__D__Group__1 : rule__D__Group__1__Impl rule__D__Group__2 ;
    public final void rule__D__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6678:1: ( rule__D__Group__1__Impl rule__D__Group__2 )
            // InternalAdeptness.g:6679:2: rule__D__Group__1__Impl rule__D__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalAdeptness.g:6686:1: rule__D__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__D__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6690:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:6691:1: ( RULE_INT )
            {
            // InternalAdeptness.g:6691:1: ( RULE_INT )
            // InternalAdeptness.g:6692:2: RULE_INT
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
    // InternalAdeptness.g:6701:1: rule__D__Group__2 : rule__D__Group__2__Impl ;
    public final void rule__D__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6705:1: ( rule__D__Group__2__Impl )
            // InternalAdeptness.g:6706:2: rule__D__Group__2__Impl
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
    // InternalAdeptness.g:6712:1: rule__D__Group__2__Impl : ( ( rule__D__Group_2__0 )? ) ;
    public final void rule__D__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6716:1: ( ( ( rule__D__Group_2__0 )? ) )
            // InternalAdeptness.g:6717:1: ( ( rule__D__Group_2__0 )? )
            {
            // InternalAdeptness.g:6717:1: ( ( rule__D__Group_2__0 )? )
            // InternalAdeptness.g:6718:2: ( rule__D__Group_2__0 )?
            {
             before(grammarAccess.getDAccess().getGroup_2()); 
            // InternalAdeptness.g:6719:2: ( rule__D__Group_2__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==30) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAdeptness.g:6719:3: rule__D__Group_2__0
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
    // InternalAdeptness.g:6728:1: rule__D__Group_2__0 : rule__D__Group_2__0__Impl rule__D__Group_2__1 ;
    public final void rule__D__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6732:1: ( rule__D__Group_2__0__Impl rule__D__Group_2__1 )
            // InternalAdeptness.g:6733:2: rule__D__Group_2__0__Impl rule__D__Group_2__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalAdeptness.g:6740:1: rule__D__Group_2__0__Impl : ( '.' ) ;
    public final void rule__D__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6744:1: ( ( '.' ) )
            // InternalAdeptness.g:6745:1: ( '.' )
            {
            // InternalAdeptness.g:6745:1: ( '.' )
            // InternalAdeptness.g:6746:2: '.'
            {
             before(grammarAccess.getDAccess().getFullStopKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAdeptness.g:6755:1: rule__D__Group_2__1 : rule__D__Group_2__1__Impl ;
    public final void rule__D__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6759:1: ( rule__D__Group_2__1__Impl )
            // InternalAdeptness.g:6760:2: rule__D__Group_2__1__Impl
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
    // InternalAdeptness.g:6766:1: rule__D__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__D__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6770:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:6771:1: ( RULE_INT )
            {
            // InternalAdeptness.g:6771:1: ( RULE_INT )
            // InternalAdeptness.g:6772:2: RULE_INT
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
    // InternalAdeptness.g:6782:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6786:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalAdeptness.g:6787:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalAdeptness.g:6794:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6798:1: ( ( 'datatype' ) )
            // InternalAdeptness.g:6799:1: ( 'datatype' )
            {
            // InternalAdeptness.g:6799:1: ( 'datatype' )
            // InternalAdeptness.g:6800:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,82,FOLLOW_2); 
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
    // InternalAdeptness.g:6809:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6813:1: ( rule__DataType__Group__1__Impl )
            // InternalAdeptness.g:6814:2: rule__DataType__Group__1__Impl
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
    // InternalAdeptness.g:6820:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6824:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalAdeptness.g:6825:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:6825:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalAdeptness.g:6826:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:6827:2: ( rule__DataType__NameAssignment_1 )
            // InternalAdeptness.g:6827:3: rule__DataType__NameAssignment_1
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
    // InternalAdeptness.g:6836:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6840:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // InternalAdeptness.g:6841:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalAdeptness.g:6848:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6852:1: ( ( 'package' ) )
            // InternalAdeptness.g:6853:1: ( 'package' )
            {
            // InternalAdeptness.g:6853:1: ( 'package' )
            // InternalAdeptness.g:6854:2: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,83,FOLLOW_2); 
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
    // InternalAdeptness.g:6863:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6867:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // InternalAdeptness.g:6868:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_56);
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
    // InternalAdeptness.g:6875:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6879:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // InternalAdeptness.g:6880:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:6880:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // InternalAdeptness.g:6881:2: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:6882:2: ( rule__PackageDeclaration__NameAssignment_1 )
            // InternalAdeptness.g:6882:3: rule__PackageDeclaration__NameAssignment_1
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
    // InternalAdeptness.g:6890:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6894:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // InternalAdeptness.g:6895:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_57);
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
    // InternalAdeptness.g:6902:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6906:1: ( ( '{' ) )
            // InternalAdeptness.g:6907:1: ( '{' )
            {
            // InternalAdeptness.g:6907:1: ( '{' )
            // InternalAdeptness.g:6908:2: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,84,FOLLOW_2); 
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
    // InternalAdeptness.g:6917:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6921:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // InternalAdeptness.g:6922:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_57);
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
    // InternalAdeptness.g:6929:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6933:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) )
            // InternalAdeptness.g:6934:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            {
            // InternalAdeptness.g:6934:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            // InternalAdeptness.g:6935:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 
            // InternalAdeptness.g:6936:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==28||LA52_0==31||LA52_0==45||LA52_0==52||(LA52_0>=82 && LA52_0<=83)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalAdeptness.g:6936:3: rule__PackageDeclaration__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__PackageDeclaration__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalAdeptness.g:6944:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6948:1: ( rule__PackageDeclaration__Group__4__Impl )
            // InternalAdeptness.g:6949:2: rule__PackageDeclaration__Group__4__Impl
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
    // InternalAdeptness.g:6955:1: rule__PackageDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6959:1: ( ( '}' ) )
            // InternalAdeptness.g:6960:1: ( '}' )
            {
            // InternalAdeptness.g:6960:1: ( '}' )
            // InternalAdeptness.g:6961:2: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,85,FOLLOW_2); 
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


    // $ANTLR start "rule__AbstractElement2__Group__0"
    // InternalAdeptness.g:6971:1: rule__AbstractElement2__Group__0 : rule__AbstractElement2__Group__0__Impl rule__AbstractElement2__Group__1 ;
    public final void rule__AbstractElement2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6975:1: ( rule__AbstractElement2__Group__0__Impl rule__AbstractElement2__Group__1 )
            // InternalAdeptness.g:6976:2: rule__AbstractElement2__Group__0__Impl rule__AbstractElement2__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__AbstractElement2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractElement2__Group__1();

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
    // $ANTLR end "rule__AbstractElement2__Group__0"


    // $ANTLR start "rule__AbstractElement2__Group__0__Impl"
    // InternalAdeptness.g:6983:1: rule__AbstractElement2__Group__0__Impl : ( ( rule__AbstractElement2__FrontParenthesesAssignment_0 )* ) ;
    public final void rule__AbstractElement2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6987:1: ( ( ( rule__AbstractElement2__FrontParenthesesAssignment_0 )* ) )
            // InternalAdeptness.g:6988:1: ( ( rule__AbstractElement2__FrontParenthesesAssignment_0 )* )
            {
            // InternalAdeptness.g:6988:1: ( ( rule__AbstractElement2__FrontParenthesesAssignment_0 )* )
            // InternalAdeptness.g:6989:2: ( rule__AbstractElement2__FrontParenthesesAssignment_0 )*
            {
             before(grammarAccess.getAbstractElement2Access().getFrontParenthesesAssignment_0()); 
            // InternalAdeptness.g:6990:2: ( rule__AbstractElement2__FrontParenthesesAssignment_0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==11) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalAdeptness.g:6990:3: rule__AbstractElement2__FrontParenthesesAssignment_0
            	    {
            	    pushFollow(FOLLOW_58);
            	    rule__AbstractElement2__FrontParenthesesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getAbstractElement2Access().getFrontParenthesesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement2__Group__0__Impl"


    // $ANTLR start "rule__AbstractElement2__Group__1"
    // InternalAdeptness.g:6998:1: rule__AbstractElement2__Group__1 : rule__AbstractElement2__Group__1__Impl rule__AbstractElement2__Group__2 ;
    public final void rule__AbstractElement2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7002:1: ( rule__AbstractElement2__Group__1__Impl rule__AbstractElement2__Group__2 )
            // InternalAdeptness.g:7003:2: rule__AbstractElement2__Group__1__Impl rule__AbstractElement2__Group__2
            {
            pushFollow(FOLLOW_59);
            rule__AbstractElement2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractElement2__Group__2();

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
    // $ANTLR end "rule__AbstractElement2__Group__1"


    // $ANTLR start "rule__AbstractElement2__Group__1__Impl"
    // InternalAdeptness.g:7010:1: rule__AbstractElement2__Group__1__Impl : ( ( rule__AbstractElement2__Alternatives_1 ) ) ;
    public final void rule__AbstractElement2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7014:1: ( ( ( rule__AbstractElement2__Alternatives_1 ) ) )
            // InternalAdeptness.g:7015:1: ( ( rule__AbstractElement2__Alternatives_1 ) )
            {
            // InternalAdeptness.g:7015:1: ( ( rule__AbstractElement2__Alternatives_1 ) )
            // InternalAdeptness.g:7016:2: ( rule__AbstractElement2__Alternatives_1 )
            {
             before(grammarAccess.getAbstractElement2Access().getAlternatives_1()); 
            // InternalAdeptness.g:7017:2: ( rule__AbstractElement2__Alternatives_1 )
            // InternalAdeptness.g:7017:3: rule__AbstractElement2__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement2__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElement2Access().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement2__Group__1__Impl"


    // $ANTLR start "rule__AbstractElement2__Group__2"
    // InternalAdeptness.g:7025:1: rule__AbstractElement2__Group__2 : rule__AbstractElement2__Group__2__Impl ;
    public final void rule__AbstractElement2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7029:1: ( rule__AbstractElement2__Group__2__Impl )
            // InternalAdeptness.g:7030:2: rule__AbstractElement2__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement2__Group__2__Impl();

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
    // $ANTLR end "rule__AbstractElement2__Group__2"


    // $ANTLR start "rule__AbstractElement2__Group__2__Impl"
    // InternalAdeptness.g:7036:1: rule__AbstractElement2__Group__2__Impl : ( ( rule__AbstractElement2__OpAssignment_2 )* ) ;
    public final void rule__AbstractElement2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7040:1: ( ( ( rule__AbstractElement2__OpAssignment_2 )* ) )
            // InternalAdeptness.g:7041:1: ( ( rule__AbstractElement2__OpAssignment_2 )* )
            {
            // InternalAdeptness.g:7041:1: ( ( rule__AbstractElement2__OpAssignment_2 )* )
            // InternalAdeptness.g:7042:2: ( rule__AbstractElement2__OpAssignment_2 )*
            {
             before(grammarAccess.getAbstractElement2Access().getOpAssignment_2()); 
            // InternalAdeptness.g:7043:2: ( rule__AbstractElement2__OpAssignment_2 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==12||(LA54_0>=16 && LA54_0<=27)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalAdeptness.g:7043:3: rule__AbstractElement2__OpAssignment_2
            	    {
            	    pushFollow(FOLLOW_60);
            	    rule__AbstractElement2__OpAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getAbstractElement2Access().getOpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement2__Group__2__Impl"


    // $ANTLR start "rule__Adeptness__ElementsAssignment"
    // InternalAdeptness.g:7052:1: rule__Adeptness__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Adeptness__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7056:1: ( ( ruleAbstractElement ) )
            // InternalAdeptness.g:7057:2: ( ruleAbstractElement )
            {
            // InternalAdeptness.g:7057:2: ( ruleAbstractElement )
            // InternalAdeptness.g:7058:3: ruleAbstractElement
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


    // $ANTLR start "rule__Imports__ImportedNamespaceAssignment_1"
    // InternalAdeptness.g:7067:1: rule__Imports__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Imports__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7071:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalAdeptness.g:7072:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalAdeptness.g:7072:2: ( ruleQualifiedNameWithWildcard )
            // InternalAdeptness.g:7073:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportsAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportsAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imports__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__ValidationPlan__NameAssignment_1"
    // InternalAdeptness.g:7082:1: rule__ValidationPlan__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ValidationPlan__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7086:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:7087:2: ( RULE_ID )
            {
            // InternalAdeptness.g:7087:2: ( RULE_ID )
            // InternalAdeptness.g:7088:3: RULE_ID
            {
             before(grammarAccess.getValidationPlanAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValidationPlanAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidationPlan__NameAssignment_1"


    // $ANTLR start "rule__ValidationPlan__SuperTypeAssignment_3_1"
    // InternalAdeptness.g:7097:1: rule__ValidationPlan__SuperTypeAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ValidationPlan__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7101:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAdeptness.g:7102:2: ( ( ruleQualifiedName ) )
            {
            // InternalAdeptness.g:7102:2: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:7103:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getValidationPlanAccess().getSuperTypeMonitoringFileCrossReference_3_1_0()); 
            // InternalAdeptness.g:7104:3: ( ruleQualifiedName )
            // InternalAdeptness.g:7105:4: ruleQualifiedName
            {
             before(grammarAccess.getValidationPlanAccess().getSuperTypeMonitoringFileQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getValidationPlanAccess().getSuperTypeMonitoringFileQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getValidationPlanAccess().getSuperTypeMonitoringFileCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidationPlan__SuperTypeAssignment_3_1"


    // $ANTLR start "rule__ValidationPlan__TestAssignment_4"
    // InternalAdeptness.g:7116:1: rule__ValidationPlan__TestAssignment_4 : ( ruleTest ) ;
    public final void rule__ValidationPlan__TestAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7120:1: ( ( ruleTest ) )
            // InternalAdeptness.g:7121:2: ( ruleTest )
            {
            // InternalAdeptness.g:7121:2: ( ruleTest )
            // InternalAdeptness.g:7122:3: ruleTest
            {
             before(grammarAccess.getValidationPlanAccess().getTestTestParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getValidationPlanAccess().getTestTestParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidationPlan__TestAssignment_4"


    // $ANTLR start "rule__Test__NameAssignment_1"
    // InternalAdeptness.g:7131:1: rule__Test__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Test__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7135:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:7136:2: ( RULE_ID )
            {
            // InternalAdeptness.g:7136:2: ( RULE_ID )
            // InternalAdeptness.g:7137:3: RULE_ID
            {
             before(grammarAccess.getTestAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__NameAssignment_1"


    // $ANTLR start "rule__Test__SutAssignment_4"
    // InternalAdeptness.g:7146:1: rule__Test__SutAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Test__SutAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7150:1: ( ( RULE_STRING ) )
            // InternalAdeptness.g:7151:2: ( RULE_STRING )
            {
            // InternalAdeptness.g:7151:2: ( RULE_STRING )
            // InternalAdeptness.g:7152:3: RULE_STRING
            {
             before(grammarAccess.getTestAccess().getSutSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getSutSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__SutAssignment_4"


    // $ANTLR start "rule__Test__TestLevelAssignment_7"
    // InternalAdeptness.g:7161:1: rule__Test__TestLevelAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Test__TestLevelAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7165:1: ( ( RULE_STRING ) )
            // InternalAdeptness.g:7166:2: ( RULE_STRING )
            {
            // InternalAdeptness.g:7166:2: ( RULE_STRING )
            // InternalAdeptness.g:7167:3: RULE_STRING
            {
             before(grammarAccess.getTestAccess().getTestLevelSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getTestLevelSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__TestLevelAssignment_7"


    // $ANTLR start "rule__Test__InputsAssignment_10"
    // InternalAdeptness.g:7176:1: rule__Test__InputsAssignment_10 : ( ruleInputs ) ;
    public final void rule__Test__InputsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7180:1: ( ( ruleInputs ) )
            // InternalAdeptness.g:7181:2: ( ruleInputs )
            {
            // InternalAdeptness.g:7181:2: ( ruleInputs )
            // InternalAdeptness.g:7182:3: ruleInputs
            {
             before(grammarAccess.getTestAccess().getInputsInputsParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleInputs();

            state._fsp--;

             after(grammarAccess.getTestAccess().getInputsInputsParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__InputsAssignment_10"


    // $ANTLR start "rule__Test__OraclesAssignment_11"
    // InternalAdeptness.g:7191:1: rule__Test__OraclesAssignment_11 : ( ruleTestingOracle ) ;
    public final void rule__Test__OraclesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7195:1: ( ( ruleTestingOracle ) )
            // InternalAdeptness.g:7196:2: ( ruleTestingOracle )
            {
            // InternalAdeptness.g:7196:2: ( ruleTestingOracle )
            // InternalAdeptness.g:7197:3: ruleTestingOracle
            {
             before(grammarAccess.getTestAccess().getOraclesTestingOracleParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleTestingOracle();

            state._fsp--;

             after(grammarAccess.getTestAccess().getOraclesTestingOracleParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__OraclesAssignment_11"


    // $ANTLR start "rule__TestingOracle__NameAssignment_1"
    // InternalAdeptness.g:7206:1: rule__TestingOracle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TestingOracle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7210:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:7211:2: ( RULE_ID )
            {
            // InternalAdeptness.g:7211:2: ( RULE_ID )
            // InternalAdeptness.g:7212:3: RULE_ID
            {
             before(grammarAccess.getTestingOracleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTestingOracleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestingOracle__NameAssignment_1"


    // $ANTLR start "rule__TestingOracle__TypeAssignment_4"
    // InternalAdeptness.g:7221:1: rule__TestingOracle__TypeAssignment_4 : ( RULE_STRING ) ;
    public final void rule__TestingOracle__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7225:1: ( ( RULE_STRING ) )
            // InternalAdeptness.g:7226:2: ( RULE_STRING )
            {
            // InternalAdeptness.g:7226:2: ( RULE_STRING )
            // InternalAdeptness.g:7227:3: RULE_STRING
            {
             before(grammarAccess.getTestingOracleAccess().getTypeSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTestingOracleAccess().getTypeSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestingOracle__TypeAssignment_4"


    // $ANTLR start "rule__TestingOracle__ParametersAssignment_7"
    // InternalAdeptness.g:7236:1: rule__TestingOracle__ParametersAssignment_7 : ( ruleParameters ) ;
    public final void rule__TestingOracle__ParametersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7240:1: ( ( ruleParameters ) )
            // InternalAdeptness.g:7241:2: ( ruleParameters )
            {
            // InternalAdeptness.g:7241:2: ( ruleParameters )
            // InternalAdeptness.g:7242:3: ruleParameters
            {
             before(grammarAccess.getTestingOracleAccess().getParametersParametersParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleParameters();

            state._fsp--;

             after(grammarAccess.getTestingOracleAccess().getParametersParametersParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestingOracle__ParametersAssignment_7"


    // $ANTLR start "rule__Parameters__ValueAssignment_0"
    // InternalAdeptness.g:7251:1: rule__Parameters__ValueAssignment_0 : ( ruleExpressionsModel ) ;
    public final void rule__Parameters__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7255:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:7256:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:7256:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:7257:3: ruleExpressionsModel
            {
             before(grammarAccess.getParametersAccess().getValueExpressionsModelParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionsModel();

            state._fsp--;

             after(grammarAccess.getParametersAccess().getValueExpressionsModelParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__ValueAssignment_0"


    // $ANTLR start "rule__Inputs__ValueAssignment_0"
    // InternalAdeptness.g:7266:1: rule__Inputs__ValueAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Inputs__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7270:1: ( ( RULE_STRING ) )
            // InternalAdeptness.g:7271:2: ( RULE_STRING )
            {
            // InternalAdeptness.g:7271:2: ( RULE_STRING )
            // InternalAdeptness.g:7272:3: RULE_STRING
            {
             before(grammarAccess.getInputsAccess().getValueSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInputsAccess().getValueSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__ValueAssignment_0"


    // $ANTLR start "rule__MonitoringFile__NameAssignment_1"
    // InternalAdeptness.g:7281:1: rule__MonitoringFile__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MonitoringFile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7285:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:7286:2: ( RULE_ID )
            {
            // InternalAdeptness.g:7286:2: ( RULE_ID )
            // InternalAdeptness.g:7287:3: RULE_ID
            {
             before(grammarAccess.getMonitoringFileAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMonitoringFileAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringFile__NameAssignment_1"


    // $ANTLR start "rule__MonitoringFile__MonitoringPlanAssignment_3"
    // InternalAdeptness.g:7296:1: rule__MonitoringFile__MonitoringPlanAssignment_3 : ( ruleMonitoringPlan ) ;
    public final void rule__MonitoringFile__MonitoringPlanAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7300:1: ( ( ruleMonitoringPlan ) )
            // InternalAdeptness.g:7301:2: ( ruleMonitoringPlan )
            {
            // InternalAdeptness.g:7301:2: ( ruleMonitoringPlan )
            // InternalAdeptness.g:7302:3: ruleMonitoringPlan
            {
             before(grammarAccess.getMonitoringFileAccess().getMonitoringPlanMonitoringPlanParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMonitoringPlan();

            state._fsp--;

             after(grammarAccess.getMonitoringFileAccess().getMonitoringPlanMonitoringPlanParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringFile__MonitoringPlanAssignment_3"


    // $ANTLR start "rule__MonitoringPlan__MonitoringVariablesAssignment"
    // InternalAdeptness.g:7311:1: rule__MonitoringPlan__MonitoringVariablesAssignment : ( ruleMonitoringVariable ) ;
    public final void rule__MonitoringPlan__MonitoringVariablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7315:1: ( ( ruleMonitoringVariable ) )
            // InternalAdeptness.g:7316:2: ( ruleMonitoringVariable )
            {
            // InternalAdeptness.g:7316:2: ( ruleMonitoringVariable )
            // InternalAdeptness.g:7317:3: ruleMonitoringVariable
            {
             before(grammarAccess.getMonitoringPlanAccess().getMonitoringVariablesMonitoringVariableParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMonitoringVariable();

            state._fsp--;

             after(grammarAccess.getMonitoringPlanAccess().getMonitoringVariablesMonitoringVariableParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringPlan__MonitoringVariablesAssignment"


    // $ANTLR start "rule__MonitoringVariable__NameAssignment_1"
    // InternalAdeptness.g:7326:1: rule__MonitoringVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MonitoringVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7330:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:7331:2: ( RULE_ID )
            {
            // InternalAdeptness.g:7331:2: ( RULE_ID )
            // InternalAdeptness.g:7332:3: RULE_ID
            {
             before(grammarAccess.getMonitoringVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMonitoringVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringVariable__NameAssignment_1"


    // $ANTLR start "rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5"
    // InternalAdeptness.g:7341:1: rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 : ( ruleSig_type ) ;
    public final void rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7345:1: ( ( ruleSig_type ) )
            // InternalAdeptness.g:7346:2: ( ruleSig_type )
            {
            // InternalAdeptness.g:7346:2: ( ruleSig_type )
            // InternalAdeptness.g:7347:3: ruleSig_type
            {
             before(grammarAccess.getMonitoringVariableAccess().getMonitoringVariableDatatypeSig_typeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSig_type();

            state._fsp--;

             after(grammarAccess.getMonitoringVariableAccess().getMonitoringVariableDatatypeSig_typeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5"


    // $ANTLR start "rule__MonitoringVariable__MaxAssignment_6_2"
    // InternalAdeptness.g:7356:1: rule__MonitoringVariable__MaxAssignment_6_2 : ( ruleDOUBLE ) ;
    public final void rule__MonitoringVariable__MaxAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7360:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7361:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7361:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7362:3: ruleDOUBLE
            {
             before(grammarAccess.getMonitoringVariableAccess().getMaxDOUBLEParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getMonitoringVariableAccess().getMaxDOUBLEParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringVariable__MaxAssignment_6_2"


    // $ANTLR start "rule__MonitoringVariable__MinAssignment_6_5"
    // InternalAdeptness.g:7371:1: rule__MonitoringVariable__MinAssignment_6_5 : ( ruleDOUBLE ) ;
    public final void rule__MonitoringVariable__MinAssignment_6_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7375:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7376:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7376:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7377:3: ruleDOUBLE
            {
             before(grammarAccess.getMonitoringVariableAccess().getMinDOUBLEParserRuleCall_6_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getMonitoringVariableAccess().getMinDOUBLEParserRuleCall_6_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringVariable__MinAssignment_6_5"


    // $ANTLR start "rule__Sig_type__Sig_typeAssignment_0"
    // InternalAdeptness.g:7386:1: rule__Sig_type__Sig_typeAssignment_0 : ( ( 'boolean' ) ) ;
    public final void rule__Sig_type__Sig_typeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7390:1: ( ( ( 'boolean' ) ) )
            // InternalAdeptness.g:7391:2: ( ( 'boolean' ) )
            {
            // InternalAdeptness.g:7391:2: ( ( 'boolean' ) )
            // InternalAdeptness.g:7392:3: ( 'boolean' )
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeBooleanKeyword_0_0()); 
            // InternalAdeptness.g:7393:3: ( 'boolean' )
            // InternalAdeptness.g:7394:4: 'boolean'
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeBooleanKeyword_0_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getSig_typeAccess().getSig_typeBooleanKeyword_0_0()); 

            }

             after(grammarAccess.getSig_typeAccess().getSig_typeBooleanKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sig_type__Sig_typeAssignment_0"


    // $ANTLR start "rule__Sig_type__Sig_typeAssignment_1"
    // InternalAdeptness.g:7405:1: rule__Sig_type__Sig_typeAssignment_1 : ( ( 'int' ) ) ;
    public final void rule__Sig_type__Sig_typeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7409:1: ( ( ( 'int' ) ) )
            // InternalAdeptness.g:7410:2: ( ( 'int' ) )
            {
            // InternalAdeptness.g:7410:2: ( ( 'int' ) )
            // InternalAdeptness.g:7411:3: ( 'int' )
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeIntKeyword_1_0()); 
            // InternalAdeptness.g:7412:3: ( 'int' )
            // InternalAdeptness.g:7413:4: 'int'
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeIntKeyword_1_0()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getSig_typeAccess().getSig_typeIntKeyword_1_0()); 

            }

             after(grammarAccess.getSig_typeAccess().getSig_typeIntKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sig_type__Sig_typeAssignment_1"


    // $ANTLR start "rule__Sig_type__Sig_typeAssignment_2"
    // InternalAdeptness.g:7424:1: rule__Sig_type__Sig_typeAssignment_2 : ( ( 'double' ) ) ;
    public final void rule__Sig_type__Sig_typeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7428:1: ( ( ( 'double' ) ) )
            // InternalAdeptness.g:7429:2: ( ( 'double' ) )
            {
            // InternalAdeptness.g:7429:2: ( ( 'double' ) )
            // InternalAdeptness.g:7430:3: ( 'double' )
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeDoubleKeyword_2_0()); 
            // InternalAdeptness.g:7431:3: ( 'double' )
            // InternalAdeptness.g:7432:4: 'double'
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeDoubleKeyword_2_0()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getSig_typeAccess().getSig_typeDoubleKeyword_2_0()); 

            }

             after(grammarAccess.getSig_typeAccess().getSig_typeDoubleKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sig_type__Sig_typeAssignment_2"


    // $ANTLR start "rule__Signal__NameAssignment_1"
    // InternalAdeptness.g:7443:1: rule__Signal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7447:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:7448:2: ( RULE_ID )
            {
            // InternalAdeptness.g:7448:2: ( RULE_ID )
            // InternalAdeptness.g:7449:3: RULE_ID
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


    // $ANTLR start "rule__Signal__CardinalityNumCPSAssignment_2_1"
    // InternalAdeptness.g:7458:1: rule__Signal__CardinalityNumCPSAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Signal__CardinalityNumCPSAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7462:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:7463:2: ( RULE_INT )
            {
            // InternalAdeptness.g:7463:2: ( RULE_INT )
            // InternalAdeptness.g:7464:3: RULE_INT
            {
             before(grammarAccess.getSignalAccess().getCardinalityNumCPSINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getCardinalityNumCPSINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__CardinalityNumCPSAssignment_2_1"


    // $ANTLR start "rule__Signal__SuperTypeAssignment_4_1"
    // InternalAdeptness.g:7473:1: rule__Signal__SuperTypeAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Signal__SuperTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7477:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAdeptness.g:7478:2: ( ( ruleQualifiedName ) )
            {
            // InternalAdeptness.g:7478:2: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:7479:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSignalAccess().getSuperTypeMonitoringFileCrossReference_4_1_0()); 
            // InternalAdeptness.g:7480:3: ( ruleQualifiedName )
            // InternalAdeptness.g:7481:4: ruleQualifiedName
            {
             before(grammarAccess.getSignalAccess().getSuperTypeMonitoringFileQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSignalAccess().getSuperTypeMonitoringFileQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getSignalAccess().getSuperTypeMonitoringFileCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__SuperTypeAssignment_4_1"


    // $ANTLR start "rule__Signal__OracleAssignment_5"
    // InternalAdeptness.g:7492:1: rule__Signal__OracleAssignment_5 : ( ruleOracle ) ;
    public final void rule__Signal__OracleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7496:1: ( ( ruleOracle ) )
            // InternalAdeptness.g:7497:2: ( ruleOracle )
            {
            // InternalAdeptness.g:7497:2: ( ruleOracle )
            // InternalAdeptness.g:7498:3: ruleOracle
            {
             before(grammarAccess.getSignalAccess().getOracleOracleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleOracle();

            state._fsp--;

             after(grammarAccess.getSignalAccess().getOracleOracleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__OracleAssignment_5"


    // $ANTLR start "rule__Oracle__NameAssignment_1"
    // InternalAdeptness.g:7507:1: rule__Oracle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Oracle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7511:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:7512:2: ( RULE_ID )
            {
            // InternalAdeptness.g:7512:2: ( RULE_ID )
            // InternalAdeptness.g:7513:3: RULE_ID
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


    // $ANTLR start "rule__Oracle__WhenAssignment_3_0"
    // InternalAdeptness.g:7522:1: rule__Oracle__WhenAssignment_3_0 : ( ruleWhen ) ;
    public final void rule__Oracle__WhenAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7526:1: ( ( ruleWhen ) )
            // InternalAdeptness.g:7527:2: ( ruleWhen )
            {
            // InternalAdeptness.g:7527:2: ( ruleWhen )
            // InternalAdeptness.g:7528:3: ruleWhen
            {
             before(grammarAccess.getOracleAccess().getWhenWhenParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWhen();

            state._fsp--;

             after(grammarAccess.getOracleAccess().getWhenWhenParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__WhenAssignment_3_0"


    // $ANTLR start "rule__Oracle__WhileAssignment_3_1"
    // InternalAdeptness.g:7537:1: rule__Oracle__WhileAssignment_3_1 : ( ruleWhile ) ;
    public final void rule__Oracle__WhileAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7541:1: ( ( ruleWhile ) )
            // InternalAdeptness.g:7542:2: ( ruleWhile )
            {
            // InternalAdeptness.g:7542:2: ( ruleWhile )
            // InternalAdeptness.g:7543:3: ruleWhile
            {
             before(grammarAccess.getOracleAccess().getWhileWhileParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWhile();

            state._fsp--;

             after(grammarAccess.getOracleAccess().getWhileWhileParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__WhileAssignment_3_1"


    // $ANTLR start "rule__Oracle__CheckAssignment_4"
    // InternalAdeptness.g:7552:1: rule__Oracle__CheckAssignment_4 : ( ruleChecks ) ;
    public final void rule__Oracle__CheckAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7556:1: ( ( ruleChecks ) )
            // InternalAdeptness.g:7557:2: ( ruleChecks )
            {
            // InternalAdeptness.g:7557:2: ( ruleChecks )
            // InternalAdeptness.g:7558:3: ruleChecks
            {
             before(grammarAccess.getOracleAccess().getCheckChecksParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleChecks();

            state._fsp--;

             after(grammarAccess.getOracleAccess().getCheckChecksParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__CheckAssignment_4"


    // $ANTLR start "rule__While__EmAssignment_1"
    // InternalAdeptness.g:7567:1: rule__While__EmAssignment_1 : ( ruleExpressionsModel ) ;
    public final void rule__While__EmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7571:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:7572:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:7572:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:7573:3: ruleExpressionsModel
            {
             before(grammarAccess.getWhileAccess().getEmExpressionsModelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionsModel();

            state._fsp--;

             after(grammarAccess.getWhileAccess().getEmExpressionsModelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__EmAssignment_1"


    // $ANTLR start "rule__When__EmAssignment_1"
    // InternalAdeptness.g:7582:1: rule__When__EmAssignment_1 : ( ruleExpressionsModel ) ;
    public final void rule__When__EmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7586:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:7587:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:7587:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:7588:3: ruleExpressionsModel
            {
             before(grammarAccess.getWhenAccess().getEmExpressionsModelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionsModel();

            state._fsp--;

             after(grammarAccess.getWhenAccess().getEmExpressionsModelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__EmAssignment_1"


    // $ANTLR start "rule__When__AwAssignment_2"
    // InternalAdeptness.g:7597:1: rule__When__AwAssignment_2 : ( ruleAfterWhen ) ;
    public final void rule__When__AwAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7601:1: ( ( ruleAfterWhen ) )
            // InternalAdeptness.g:7602:2: ( ruleAfterWhen )
            {
            // InternalAdeptness.g:7602:2: ( ruleAfterWhen )
            // InternalAdeptness.g:7603:3: ruleAfterWhen
            {
             before(grammarAccess.getWhenAccess().getAwAfterWhenParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAfterWhen();

            state._fsp--;

             after(grammarAccess.getWhenAccess().getAwAfterWhenParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__AwAssignment_2"


    // $ANTLR start "rule__AfterWhen__WaitAssignment_0"
    // InternalAdeptness.g:7612:1: rule__AfterWhen__WaitAssignment_0 : ( ruleWait ) ;
    public final void rule__AfterWhen__WaitAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7616:1: ( ( ruleWait ) )
            // InternalAdeptness.g:7617:2: ( ruleWait )
            {
            // InternalAdeptness.g:7617:2: ( ruleWait )
            // InternalAdeptness.g:7618:3: ruleWait
            {
             before(grammarAccess.getAfterWhenAccess().getWaitWaitParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWait();

            state._fsp--;

             after(grammarAccess.getAfterWhenAccess().getWaitWaitParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterWhen__WaitAssignment_0"


    // $ANTLR start "rule__AfterWhen__DuringAssignment_1"
    // InternalAdeptness.g:7627:1: rule__AfterWhen__DuringAssignment_1 : ( ruleDuring ) ;
    public final void rule__AfterWhen__DuringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7631:1: ( ( ruleDuring ) )
            // InternalAdeptness.g:7632:2: ( ruleDuring )
            {
            // InternalAdeptness.g:7632:2: ( ruleDuring )
            // InternalAdeptness.g:7633:3: ruleDuring
            {
             before(grammarAccess.getAfterWhenAccess().getDuringDuringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDuring();

            state._fsp--;

             after(grammarAccess.getAfterWhenAccess().getDuringDuringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterWhen__DuringAssignment_1"


    // $ANTLR start "rule__Wait__TimeAssignment_1"
    // InternalAdeptness.g:7642:1: rule__Wait__TimeAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Wait__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7646:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7647:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7647:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7648:3: ruleDOUBLE
            {
             before(grammarAccess.getWaitAccess().getTimeDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getWaitAccess().getTimeDOUBLEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__TimeAssignment_1"


    // $ANTLR start "rule__Wait__UnitAssignment_3"
    // InternalAdeptness.g:7657:1: rule__Wait__UnitAssignment_3 : ( ruleTimeType ) ;
    public final void rule__Wait__UnitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7661:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:7662:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:7662:2: ( ruleTimeType )
            // InternalAdeptness.g:7663:3: ruleTimeType
            {
             before(grammarAccess.getWaitAccess().getUnitTimeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeType();

            state._fsp--;

             after(grammarAccess.getWaitAccess().getUnitTimeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__UnitAssignment_3"


    // $ANTLR start "rule__During__TimeAssignment_1"
    // InternalAdeptness.g:7672:1: rule__During__TimeAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__During__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7676:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7677:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7677:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7678:3: ruleDOUBLE
            {
             before(grammarAccess.getDuringAccess().getTimeDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDuringAccess().getTimeDOUBLEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__During__TimeAssignment_1"


    // $ANTLR start "rule__During__UnitAssignment_3"
    // InternalAdeptness.g:7687:1: rule__During__UnitAssignment_3 : ( ruleTimeType ) ;
    public final void rule__During__UnitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7691:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:7692:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:7692:2: ( ruleTimeType )
            // InternalAdeptness.g:7693:3: ruleTimeType
            {
             before(grammarAccess.getDuringAccess().getUnitTimeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeType();

            state._fsp--;

             after(grammarAccess.getDuringAccess().getUnitTimeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__During__UnitAssignment_3"


    // $ANTLR start "rule__Checks__NameAssignment_1_0"
    // InternalAdeptness.g:7702:1: rule__Checks__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Checks__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7706:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:7707:2: ( RULE_ID )
            {
            // InternalAdeptness.g:7707:2: ( RULE_ID )
            // InternalAdeptness.g:7708:3: RULE_ID
            {
             before(grammarAccess.getChecksAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChecksAccess().getNameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checks__NameAssignment_1_0"


    // $ANTLR start "rule__Checks__EmAssignment_1_1"
    // InternalAdeptness.g:7717:1: rule__Checks__EmAssignment_1_1 : ( ruleExpressionsModel ) ;
    public final void rule__Checks__EmAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7721:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:7722:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:7722:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:7723:3: ruleExpressionsModel
            {
             before(grammarAccess.getChecksAccess().getEmExpressionsModelParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionsModel();

            state._fsp--;

             after(grammarAccess.getChecksAccess().getEmExpressionsModelParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Checks__EmAssignment_1_1"


    // $ANTLR start "rule__Checks__ReferenceAssignment_2"
    // InternalAdeptness.g:7732:1: rule__Checks__ReferenceAssignment_2 : ( ruleReference ) ;
    public final void rule__Checks__ReferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7736:1: ( ( ruleReference ) )
            // InternalAdeptness.g:7737:2: ( ruleReference )
            {
            // InternalAdeptness.g:7737:2: ( ruleReference )
            // InternalAdeptness.g:7738:3: ruleReference
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
    // InternalAdeptness.g:7747:1: rule__Checks__FailReasonAssignment_3 : ( ruleFailReason ) ;
    public final void rule__Checks__FailReasonAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7751:1: ( ( ruleFailReason ) )
            // InternalAdeptness.g:7752:2: ( ruleFailReason )
            {
            // InternalAdeptness.g:7752:2: ( ruleFailReason )
            // InternalAdeptness.g:7753:3: ruleFailReason
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
    // InternalAdeptness.g:7762:1: rule__Checks__DescriptionAssignment_4 : ( ruleDescription ) ;
    public final void rule__Checks__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7766:1: ( ( ruleDescription ) )
            // InternalAdeptness.g:7767:2: ( ruleDescription )
            {
            // InternalAdeptness.g:7767:2: ( ruleDescription )
            // InternalAdeptness.g:7768:3: ruleDescription
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
    // InternalAdeptness.g:7777:1: rule__Description__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7781:1: ( ( RULE_STRING ) )
            // InternalAdeptness.g:7782:2: ( RULE_STRING )
            {
            // InternalAdeptness.g:7782:2: ( RULE_STRING )
            // InternalAdeptness.g:7783:3: RULE_STRING
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
    // InternalAdeptness.g:7792:1: rule__FailReason__ReasonAssignment_1 : ( ruleReason ) ;
    public final void rule__FailReason__ReasonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7796:1: ( ( ruleReason ) )
            // InternalAdeptness.g:7797:2: ( ruleReason )
            {
            // InternalAdeptness.g:7797:2: ( ruleReason )
            // InternalAdeptness.g:7798:3: ruleReason
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
    // InternalAdeptness.g:7807:1: rule__Reason__HighPeakAssignment_0_0 : ( ruleHighPeak ) ;
    public final void rule__Reason__HighPeakAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7811:1: ( ( ruleHighPeak ) )
            // InternalAdeptness.g:7812:2: ( ruleHighPeak )
            {
            // InternalAdeptness.g:7812:2: ( ruleHighPeak )
            // InternalAdeptness.g:7813:3: ruleHighPeak
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
    // InternalAdeptness.g:7822:1: rule__Reason__HighTimeAssignment_0_1 : ( ruleHighTime ) ;
    public final void rule__Reason__HighTimeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7826:1: ( ( ruleHighTime ) )
            // InternalAdeptness.g:7827:2: ( ruleHighTime )
            {
            // InternalAdeptness.g:7827:2: ( ruleHighTime )
            // InternalAdeptness.g:7828:3: ruleHighTime
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
    // InternalAdeptness.g:7837:1: rule__Reason__ConstDegAssignment_0_2 : ( ruleConstDeg ) ;
    public final void rule__Reason__ConstDegAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7841:1: ( ( ruleConstDeg ) )
            // InternalAdeptness.g:7842:2: ( ruleConstDeg )
            {
            // InternalAdeptness.g:7842:2: ( ruleConstDeg )
            // InternalAdeptness.g:7843:3: ruleConstDeg
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
    // InternalAdeptness.g:7852:1: rule__Reason__XPeaksAssignment_0_3 : ( ruleXPeaks ) ;
    public final void rule__Reason__XPeaksAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7856:1: ( ( ruleXPeaks ) )
            // InternalAdeptness.g:7857:2: ( ruleXPeaks )
            {
            // InternalAdeptness.g:7857:2: ( ruleXPeaks )
            // InternalAdeptness.g:7858:3: ruleXPeaks
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
    // InternalAdeptness.g:7867:1: rule__XPeaks__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__XPeaks__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7871:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7872:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7872:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7873:3: ruleDOUBLE
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
    // InternalAdeptness.g:7882:1: rule__XPeaks__NPeaksAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__XPeaks__NPeaksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7886:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7887:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7887:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7888:3: ruleDOUBLE
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
    // InternalAdeptness.g:7897:1: rule__XPeaks__TimeAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__XPeaks__TimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7901:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7902:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7902:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7903:3: ruleDOUBLE
            {
             before(grammarAccess.getXPeaksAccess().getTimeDOUBLEParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getXPeaksAccess().getTimeDOUBLEParserRuleCall_5_0()); 

            }


            }

        }
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
    // InternalAdeptness.g:7912:1: rule__XPeaks__UnitAssignment_6 : ( ruleTimeType ) ;
    public final void rule__XPeaks__UnitAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7916:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:7917:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:7917:2: ( ruleTimeType )
            // InternalAdeptness.g:7918:3: ruleTimeType
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
    // InternalAdeptness.g:7927:1: rule__ConstDeg__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__ConstDeg__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7931:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7932:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7932:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7933:3: ruleDOUBLE
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
    // InternalAdeptness.g:7942:1: rule__HighTime__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__HighTime__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7946:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7947:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7947:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7948:3: ruleDOUBLE
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
    // InternalAdeptness.g:7957:1: rule__HighTime__TimeAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__HighTime__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7961:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7962:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7962:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7963:3: ruleDOUBLE
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
    // InternalAdeptness.g:7972:1: rule__HighTime__UnitAssignment_4 : ( ruleTimeType ) ;
    public final void rule__HighTime__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7976:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:7977:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:7977:2: ( ruleTimeType )
            // InternalAdeptness.g:7978:3: ruleTimeType
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
    // InternalAdeptness.g:7987:1: rule__HighPeak__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__HighPeak__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7991:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7992:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7992:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7993:3: ruleDOUBLE
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
    // InternalAdeptness.g:8002:1: rule__Reference__UpperAssignment_0_0 : ( ruleUpper ) ;
    public final void rule__Reference__UpperAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8006:1: ( ( ruleUpper ) )
            // InternalAdeptness.g:8007:2: ( ruleUpper )
            {
            // InternalAdeptness.g:8007:2: ( ruleUpper )
            // InternalAdeptness.g:8008:3: ruleUpper
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
    // InternalAdeptness.g:8017:1: rule__Reference__LowerAssignment_0_1 : ( ruleLower ) ;
    public final void rule__Reference__LowerAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8021:1: ( ( ruleLower ) )
            // InternalAdeptness.g:8022:2: ( ruleLower )
            {
            // InternalAdeptness.g:8022:2: ( ruleLower )
            // InternalAdeptness.g:8023:3: ruleLower
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
    // InternalAdeptness.g:8032:1: rule__Reference__RangeAssignment_0_2 : ( ruleRange ) ;
    public final void rule__Reference__RangeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8036:1: ( ( ruleRange ) )
            // InternalAdeptness.g:8037:2: ( ruleRange )
            {
            // InternalAdeptness.g:8037:2: ( ruleRange )
            // InternalAdeptness.g:8038:3: ruleRange
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
    // InternalAdeptness.g:8047:1: rule__Reference__GapAssignment_0_3 : ( ruleGap ) ;
    public final void rule__Reference__GapAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8051:1: ( ( ruleGap ) )
            // InternalAdeptness.g:8052:2: ( ruleGap )
            {
            // InternalAdeptness.g:8052:2: ( ruleGap )
            // InternalAdeptness.g:8053:3: ruleGap
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


    // $ANTLR start "rule__Reference__SameAssignment_0_4"
    // InternalAdeptness.g:8062:1: rule__Reference__SameAssignment_0_4 : ( ruleSame ) ;
    public final void rule__Reference__SameAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8066:1: ( ( ruleSame ) )
            // InternalAdeptness.g:8067:2: ( ruleSame )
            {
            // InternalAdeptness.g:8067:2: ( ruleSame )
            // InternalAdeptness.g:8068:3: ruleSame
            {
             before(grammarAccess.getReferenceAccess().getSameSameParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSame();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getSameSameParserRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__SameAssignment_0_4"


    // $ANTLR start "rule__Reference__NotsameAssignment_0_5"
    // InternalAdeptness.g:8077:1: rule__Reference__NotsameAssignment_0_5 : ( ruleNotSame ) ;
    public final void rule__Reference__NotsameAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8081:1: ( ( ruleNotSame ) )
            // InternalAdeptness.g:8082:2: ( ruleNotSame )
            {
            // InternalAdeptness.g:8082:2: ( ruleNotSame )
            // InternalAdeptness.g:8083:3: ruleNotSame
            {
             before(grammarAccess.getReferenceAccess().getNotsameNotSameParserRuleCall_0_5_0()); 
            pushFollow(FOLLOW_2);
            ruleNotSame();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getNotsameNotSameParserRuleCall_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__NotsameAssignment_0_5"


    // $ANTLR start "rule__Same__Bound_uppAssignment_1"
    // InternalAdeptness.g:8092:1: rule__Same__Bound_uppAssignment_1 : ( ruleBound_up ) ;
    public final void rule__Same__Bound_uppAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8096:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:8097:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:8097:2: ( ruleBound_up )
            // InternalAdeptness.g:8098:3: ruleBound_up
            {
             before(grammarAccess.getSameAccess().getBound_uppBound_upParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBound_up();

            state._fsp--;

             after(grammarAccess.getSameAccess().getBound_uppBound_upParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Same__Bound_uppAssignment_1"


    // $ANTLR start "rule__Same__ExactlyAssignment_2_0"
    // InternalAdeptness.g:8107:1: rule__Same__ExactlyAssignment_2_0 : ( ruleExactly ) ;
    public final void rule__Same__ExactlyAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8111:1: ( ( ruleExactly ) )
            // InternalAdeptness.g:8112:2: ( ruleExactly )
            {
            // InternalAdeptness.g:8112:2: ( ruleExactly )
            // InternalAdeptness.g:8113:3: ruleExactly
            {
             before(grammarAccess.getSameAccess().getExactlyExactlyParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExactly();

            state._fsp--;

             after(grammarAccess.getSameAccess().getExactlyExactlyParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Same__ExactlyAssignment_2_0"


    // $ANTLR start "rule__Same__AtmostAssignment_2_1"
    // InternalAdeptness.g:8122:1: rule__Same__AtmostAssignment_2_1 : ( ruleAt_most ) ;
    public final void rule__Same__AtmostAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8126:1: ( ( ruleAt_most ) )
            // InternalAdeptness.g:8127:2: ( ruleAt_most )
            {
            // InternalAdeptness.g:8127:2: ( ruleAt_most )
            // InternalAdeptness.g:8128:3: ruleAt_most
            {
             before(grammarAccess.getSameAccess().getAtmostAt_mostParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_most();

            state._fsp--;

             after(grammarAccess.getSameAccess().getAtmostAt_mostParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Same__AtmostAssignment_2_1"


    // $ANTLR start "rule__Same__AtleastAssignment_2_2"
    // InternalAdeptness.g:8137:1: rule__Same__AtleastAssignment_2_2 : ( ruleAt_least ) ;
    public final void rule__Same__AtleastAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8141:1: ( ( ruleAt_least ) )
            // InternalAdeptness.g:8142:2: ( ruleAt_least )
            {
            // InternalAdeptness.g:8142:2: ( ruleAt_least )
            // InternalAdeptness.g:8143:3: ruleAt_least
            {
             before(grammarAccess.getSameAccess().getAtleastAt_leastParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_least();

            state._fsp--;

             after(grammarAccess.getSameAccess().getAtleastAt_leastParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Same__AtleastAssignment_2_2"


    // $ANTLR start "rule__NotSame__Bound_uppAssignment_1"
    // InternalAdeptness.g:8152:1: rule__NotSame__Bound_uppAssignment_1 : ( ruleBound_up ) ;
    public final void rule__NotSame__Bound_uppAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8156:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:8157:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:8157:2: ( ruleBound_up )
            // InternalAdeptness.g:8158:3: ruleBound_up
            {
             before(grammarAccess.getNotSameAccess().getBound_uppBound_upParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBound_up();

            state._fsp--;

             after(grammarAccess.getNotSameAccess().getBound_uppBound_upParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotSame__Bound_uppAssignment_1"


    // $ANTLR start "rule__NotSame__ExactlyAssignment_2_0"
    // InternalAdeptness.g:8167:1: rule__NotSame__ExactlyAssignment_2_0 : ( ruleExactly ) ;
    public final void rule__NotSame__ExactlyAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8171:1: ( ( ruleExactly ) )
            // InternalAdeptness.g:8172:2: ( ruleExactly )
            {
            // InternalAdeptness.g:8172:2: ( ruleExactly )
            // InternalAdeptness.g:8173:3: ruleExactly
            {
             before(grammarAccess.getNotSameAccess().getExactlyExactlyParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExactly();

            state._fsp--;

             after(grammarAccess.getNotSameAccess().getExactlyExactlyParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotSame__ExactlyAssignment_2_0"


    // $ANTLR start "rule__NotSame__AtmostAssignment_2_1"
    // InternalAdeptness.g:8182:1: rule__NotSame__AtmostAssignment_2_1 : ( ruleAt_most ) ;
    public final void rule__NotSame__AtmostAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8186:1: ( ( ruleAt_most ) )
            // InternalAdeptness.g:8187:2: ( ruleAt_most )
            {
            // InternalAdeptness.g:8187:2: ( ruleAt_most )
            // InternalAdeptness.g:8188:3: ruleAt_most
            {
             before(grammarAccess.getNotSameAccess().getAtmostAt_mostParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_most();

            state._fsp--;

             after(grammarAccess.getNotSameAccess().getAtmostAt_mostParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotSame__AtmostAssignment_2_1"


    // $ANTLR start "rule__NotSame__AtleastAssignment_2_2"
    // InternalAdeptness.g:8197:1: rule__NotSame__AtleastAssignment_2_2 : ( ruleAt_least ) ;
    public final void rule__NotSame__AtleastAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8201:1: ( ( ruleAt_least ) )
            // InternalAdeptness.g:8202:2: ( ruleAt_least )
            {
            // InternalAdeptness.g:8202:2: ( ruleAt_least )
            // InternalAdeptness.g:8203:3: ruleAt_least
            {
             before(grammarAccess.getNotSameAccess().getAtleastAt_leastParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_least();

            state._fsp--;

             after(grammarAccess.getNotSameAccess().getAtleastAt_leastParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotSame__AtleastAssignment_2_2"


    // $ANTLR start "rule__Upper__Bound_uppAssignment_1"
    // InternalAdeptness.g:8212:1: rule__Upper__Bound_uppAssignment_1 : ( ruleBound_up ) ;
    public final void rule__Upper__Bound_uppAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8216:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:8217:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:8217:2: ( ruleBound_up )
            // InternalAdeptness.g:8218:3: ruleBound_up
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


    // $ANTLR start "rule__Upper__ExactlyAssignment_2_0"
    // InternalAdeptness.g:8227:1: rule__Upper__ExactlyAssignment_2_0 : ( ruleExactly ) ;
    public final void rule__Upper__ExactlyAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8231:1: ( ( ruleExactly ) )
            // InternalAdeptness.g:8232:2: ( ruleExactly )
            {
            // InternalAdeptness.g:8232:2: ( ruleExactly )
            // InternalAdeptness.g:8233:3: ruleExactly
            {
             before(grammarAccess.getUpperAccess().getExactlyExactlyParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExactly();

            state._fsp--;

             after(grammarAccess.getUpperAccess().getExactlyExactlyParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Upper__ExactlyAssignment_2_0"


    // $ANTLR start "rule__Upper__AtmostAssignment_2_1"
    // InternalAdeptness.g:8242:1: rule__Upper__AtmostAssignment_2_1 : ( ruleAt_most ) ;
    public final void rule__Upper__AtmostAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8246:1: ( ( ruleAt_most ) )
            // InternalAdeptness.g:8247:2: ( ruleAt_most )
            {
            // InternalAdeptness.g:8247:2: ( ruleAt_most )
            // InternalAdeptness.g:8248:3: ruleAt_most
            {
             before(grammarAccess.getUpperAccess().getAtmostAt_mostParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_most();

            state._fsp--;

             after(grammarAccess.getUpperAccess().getAtmostAt_mostParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Upper__AtmostAssignment_2_1"


    // $ANTLR start "rule__Upper__AtleastAssignment_2_2"
    // InternalAdeptness.g:8257:1: rule__Upper__AtleastAssignment_2_2 : ( ruleAt_least ) ;
    public final void rule__Upper__AtleastAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8261:1: ( ( ruleAt_least ) )
            // InternalAdeptness.g:8262:2: ( ruleAt_least )
            {
            // InternalAdeptness.g:8262:2: ( ruleAt_least )
            // InternalAdeptness.g:8263:3: ruleAt_least
            {
             before(grammarAccess.getUpperAccess().getAtleastAt_leastParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_least();

            state._fsp--;

             after(grammarAccess.getUpperAccess().getAtleastAt_leastParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Upper__AtleastAssignment_2_2"


    // $ANTLR start "rule__Lower__Bound_lowerAssignment_1"
    // InternalAdeptness.g:8272:1: rule__Lower__Bound_lowerAssignment_1 : ( ruleBound_Down ) ;
    public final void rule__Lower__Bound_lowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8276:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:8277:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:8277:2: ( ruleBound_Down )
            // InternalAdeptness.g:8278:3: ruleBound_Down
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


    // $ANTLR start "rule__Lower__ExactlyAssignment_2_0"
    // InternalAdeptness.g:8287:1: rule__Lower__ExactlyAssignment_2_0 : ( ruleExactly ) ;
    public final void rule__Lower__ExactlyAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8291:1: ( ( ruleExactly ) )
            // InternalAdeptness.g:8292:2: ( ruleExactly )
            {
            // InternalAdeptness.g:8292:2: ( ruleExactly )
            // InternalAdeptness.g:8293:3: ruleExactly
            {
             before(grammarAccess.getLowerAccess().getExactlyExactlyParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExactly();

            state._fsp--;

             after(grammarAccess.getLowerAccess().getExactlyExactlyParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lower__ExactlyAssignment_2_0"


    // $ANTLR start "rule__Lower__AtmostAssignment_2_1"
    // InternalAdeptness.g:8302:1: rule__Lower__AtmostAssignment_2_1 : ( ruleAt_most ) ;
    public final void rule__Lower__AtmostAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8306:1: ( ( ruleAt_most ) )
            // InternalAdeptness.g:8307:2: ( ruleAt_most )
            {
            // InternalAdeptness.g:8307:2: ( ruleAt_most )
            // InternalAdeptness.g:8308:3: ruleAt_most
            {
             before(grammarAccess.getLowerAccess().getAtmostAt_mostParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_most();

            state._fsp--;

             after(grammarAccess.getLowerAccess().getAtmostAt_mostParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lower__AtmostAssignment_2_1"


    // $ANTLR start "rule__Lower__AtleastAssignment_2_2"
    // InternalAdeptness.g:8317:1: rule__Lower__AtleastAssignment_2_2 : ( ruleAt_least ) ;
    public final void rule__Lower__AtleastAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8321:1: ( ( ruleAt_least ) )
            // InternalAdeptness.g:8322:2: ( ruleAt_least )
            {
            // InternalAdeptness.g:8322:2: ( ruleAt_least )
            // InternalAdeptness.g:8323:3: ruleAt_least
            {
             before(grammarAccess.getLowerAccess().getAtleastAt_leastParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_least();

            state._fsp--;

             after(grammarAccess.getLowerAccess().getAtleastAt_leastParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lower__AtleastAssignment_2_2"


    // $ANTLR start "rule__Range__Bound_lowerAssignment_1"
    // InternalAdeptness.g:8332:1: rule__Range__Bound_lowerAssignment_1 : ( ruleBound_Down ) ;
    public final void rule__Range__Bound_lowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8336:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:8337:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:8337:2: ( ruleBound_Down )
            // InternalAdeptness.g:8338:3: ruleBound_Down
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
    // InternalAdeptness.g:8347:1: rule__Range__Bound_uppAssignment_3 : ( ruleBound_up ) ;
    public final void rule__Range__Bound_uppAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8351:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:8352:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:8352:2: ( ruleBound_up )
            // InternalAdeptness.g:8353:3: ruleBound_up
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


    // $ANTLR start "rule__Range__ExactlyAssignment_4_0"
    // InternalAdeptness.g:8362:1: rule__Range__ExactlyAssignment_4_0 : ( ruleExactly ) ;
    public final void rule__Range__ExactlyAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8366:1: ( ( ruleExactly ) )
            // InternalAdeptness.g:8367:2: ( ruleExactly )
            {
            // InternalAdeptness.g:8367:2: ( ruleExactly )
            // InternalAdeptness.g:8368:3: ruleExactly
            {
             before(grammarAccess.getRangeAccess().getExactlyExactlyParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExactly();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getExactlyExactlyParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__ExactlyAssignment_4_0"


    // $ANTLR start "rule__Range__AtmostAssignment_4_1"
    // InternalAdeptness.g:8377:1: rule__Range__AtmostAssignment_4_1 : ( ruleAt_most ) ;
    public final void rule__Range__AtmostAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8381:1: ( ( ruleAt_most ) )
            // InternalAdeptness.g:8382:2: ( ruleAt_most )
            {
            // InternalAdeptness.g:8382:2: ( ruleAt_most )
            // InternalAdeptness.g:8383:3: ruleAt_most
            {
             before(grammarAccess.getRangeAccess().getAtmostAt_mostParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_most();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getAtmostAt_mostParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__AtmostAssignment_4_1"


    // $ANTLR start "rule__Range__AtleastAssignment_4_2"
    // InternalAdeptness.g:8392:1: rule__Range__AtleastAssignment_4_2 : ( ruleAt_least ) ;
    public final void rule__Range__AtleastAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8396:1: ( ( ruleAt_least ) )
            // InternalAdeptness.g:8397:2: ( ruleAt_least )
            {
            // InternalAdeptness.g:8397:2: ( ruleAt_least )
            // InternalAdeptness.g:8398:3: ruleAt_least
            {
             before(grammarAccess.getRangeAccess().getAtleastAt_leastParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_least();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getAtleastAt_leastParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__AtleastAssignment_4_2"


    // $ANTLR start "rule__Gap__Bound_lowerAssignment_1"
    // InternalAdeptness.g:8407:1: rule__Gap__Bound_lowerAssignment_1 : ( ruleBound_Down ) ;
    public final void rule__Gap__Bound_lowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8411:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:8412:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:8412:2: ( ruleBound_Down )
            // InternalAdeptness.g:8413:3: ruleBound_Down
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
    // InternalAdeptness.g:8422:1: rule__Gap__Bound_uppAssignment_3 : ( ruleBound_up ) ;
    public final void rule__Gap__Bound_uppAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8426:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:8427:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:8427:2: ( ruleBound_up )
            // InternalAdeptness.g:8428:3: ruleBound_up
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


    // $ANTLR start "rule__Gap__ExactlyAssignment_4_0"
    // InternalAdeptness.g:8437:1: rule__Gap__ExactlyAssignment_4_0 : ( ruleExactly ) ;
    public final void rule__Gap__ExactlyAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8441:1: ( ( ruleExactly ) )
            // InternalAdeptness.g:8442:2: ( ruleExactly )
            {
            // InternalAdeptness.g:8442:2: ( ruleExactly )
            // InternalAdeptness.g:8443:3: ruleExactly
            {
             before(grammarAccess.getGapAccess().getExactlyExactlyParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExactly();

            state._fsp--;

             after(grammarAccess.getGapAccess().getExactlyExactlyParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gap__ExactlyAssignment_4_0"


    // $ANTLR start "rule__Gap__AtmostAssignment_4_1"
    // InternalAdeptness.g:8452:1: rule__Gap__AtmostAssignment_4_1 : ( ruleAt_most ) ;
    public final void rule__Gap__AtmostAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8456:1: ( ( ruleAt_most ) )
            // InternalAdeptness.g:8457:2: ( ruleAt_most )
            {
            // InternalAdeptness.g:8457:2: ( ruleAt_most )
            // InternalAdeptness.g:8458:3: ruleAt_most
            {
             before(grammarAccess.getGapAccess().getAtmostAt_mostParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_most();

            state._fsp--;

             after(grammarAccess.getGapAccess().getAtmostAt_mostParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gap__AtmostAssignment_4_1"


    // $ANTLR start "rule__Gap__AtleastAssignment_4_2"
    // InternalAdeptness.g:8467:1: rule__Gap__AtleastAssignment_4_2 : ( ruleAt_least ) ;
    public final void rule__Gap__AtleastAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8471:1: ( ( ruleAt_least ) )
            // InternalAdeptness.g:8472:2: ( ruleAt_least )
            {
            // InternalAdeptness.g:8472:2: ( ruleAt_least )
            // InternalAdeptness.g:8473:3: ruleAt_least
            {
             before(grammarAccess.getGapAccess().getAtleastAt_leastParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_least();

            state._fsp--;

             after(grammarAccess.getGapAccess().getAtleastAt_leastParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gap__AtleastAssignment_4_2"


    // $ANTLR start "rule__Exactly__ValueAssignment_1"
    // InternalAdeptness.g:8482:1: rule__Exactly__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Exactly__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8486:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:8487:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:8487:2: ( ruleDOUBLE )
            // InternalAdeptness.g:8488:3: ruleDOUBLE
            {
             before(grammarAccess.getExactlyAccess().getValueDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getExactlyAccess().getValueDOUBLEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exactly__ValueAssignment_1"


    // $ANTLR start "rule__Exactly__TimeAssignment_2_1_1"
    // InternalAdeptness.g:8497:1: rule__Exactly__TimeAssignment_2_1_1 : ( ruleDOUBLE ) ;
    public final void rule__Exactly__TimeAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8501:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:8502:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:8502:2: ( ruleDOUBLE )
            // InternalAdeptness.g:8503:3: ruleDOUBLE
            {
             before(grammarAccess.getExactlyAccess().getTimeDOUBLEParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getExactlyAccess().getTimeDOUBLEParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exactly__TimeAssignment_2_1_1"


    // $ANTLR start "rule__Exactly__UnitAssignment_2_1_2"
    // InternalAdeptness.g:8512:1: rule__Exactly__UnitAssignment_2_1_2 : ( ruleTimeType ) ;
    public final void rule__Exactly__UnitAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8516:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:8517:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:8517:2: ( ruleTimeType )
            // InternalAdeptness.g:8518:3: ruleTimeType
            {
             before(grammarAccess.getExactlyAccess().getUnitTimeTypeParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeType();

            state._fsp--;

             after(grammarAccess.getExactlyAccess().getUnitTimeTypeParserRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exactly__UnitAssignment_2_1_2"


    // $ANTLR start "rule__Exactly__UnitAssignment_2_2"
    // InternalAdeptness.g:8527:1: rule__Exactly__UnitAssignment_2_2 : ( ruleTimeType ) ;
    public final void rule__Exactly__UnitAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8531:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:8532:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:8532:2: ( ruleTimeType )
            // InternalAdeptness.g:8533:3: ruleTimeType
            {
             before(grammarAccess.getExactlyAccess().getUnitTimeTypeParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeType();

            state._fsp--;

             after(grammarAccess.getExactlyAccess().getUnitTimeTypeParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exactly__UnitAssignment_2_2"


    // $ANTLR start "rule__At_most__ValueAssignment_1"
    // InternalAdeptness.g:8542:1: rule__At_most__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__At_most__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8546:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:8547:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:8547:2: ( ruleDOUBLE )
            // InternalAdeptness.g:8548:3: ruleDOUBLE
            {
             before(grammarAccess.getAt_mostAccess().getValueDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getAt_mostAccess().getValueDOUBLEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At_most__ValueAssignment_1"


    // $ANTLR start "rule__At_most__TimeAssignment_2_1_1"
    // InternalAdeptness.g:8557:1: rule__At_most__TimeAssignment_2_1_1 : ( ruleDOUBLE ) ;
    public final void rule__At_most__TimeAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8561:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:8562:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:8562:2: ( ruleDOUBLE )
            // InternalAdeptness.g:8563:3: ruleDOUBLE
            {
             before(grammarAccess.getAt_mostAccess().getTimeDOUBLEParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getAt_mostAccess().getTimeDOUBLEParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At_most__TimeAssignment_2_1_1"


    // $ANTLR start "rule__At_most__UnitAssignment_2_1_2"
    // InternalAdeptness.g:8572:1: rule__At_most__UnitAssignment_2_1_2 : ( ruleTimeType ) ;
    public final void rule__At_most__UnitAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8576:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:8577:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:8577:2: ( ruleTimeType )
            // InternalAdeptness.g:8578:3: ruleTimeType
            {
             before(grammarAccess.getAt_mostAccess().getUnitTimeTypeParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeType();

            state._fsp--;

             after(grammarAccess.getAt_mostAccess().getUnitTimeTypeParserRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At_most__UnitAssignment_2_1_2"


    // $ANTLR start "rule__At_most__UnitAssignment_2_2"
    // InternalAdeptness.g:8587:1: rule__At_most__UnitAssignment_2_2 : ( ruleTimeType ) ;
    public final void rule__At_most__UnitAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8591:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:8592:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:8592:2: ( ruleTimeType )
            // InternalAdeptness.g:8593:3: ruleTimeType
            {
             before(grammarAccess.getAt_mostAccess().getUnitTimeTypeParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeType();

            state._fsp--;

             after(grammarAccess.getAt_mostAccess().getUnitTimeTypeParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At_most__UnitAssignment_2_2"


    // $ANTLR start "rule__At_least__ValueAssignment_1"
    // InternalAdeptness.g:8602:1: rule__At_least__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__At_least__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8606:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:8607:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:8607:2: ( ruleDOUBLE )
            // InternalAdeptness.g:8608:3: ruleDOUBLE
            {
             before(grammarAccess.getAt_leastAccess().getValueDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getAt_leastAccess().getValueDOUBLEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At_least__ValueAssignment_1"


    // $ANTLR start "rule__At_least__TimeAssignment_2_1_1"
    // InternalAdeptness.g:8617:1: rule__At_least__TimeAssignment_2_1_1 : ( ruleDOUBLE ) ;
    public final void rule__At_least__TimeAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8621:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:8622:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:8622:2: ( ruleDOUBLE )
            // InternalAdeptness.g:8623:3: ruleDOUBLE
            {
             before(grammarAccess.getAt_leastAccess().getTimeDOUBLEParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getAt_leastAccess().getTimeDOUBLEParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At_least__TimeAssignment_2_1_1"


    // $ANTLR start "rule__At_least__UnitAssignment_2_1_2"
    // InternalAdeptness.g:8632:1: rule__At_least__UnitAssignment_2_1_2 : ( ruleTimeType ) ;
    public final void rule__At_least__UnitAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8636:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:8637:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:8637:2: ( ruleTimeType )
            // InternalAdeptness.g:8638:3: ruleTimeType
            {
             before(grammarAccess.getAt_leastAccess().getUnitTimeTypeParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeType();

            state._fsp--;

             after(grammarAccess.getAt_leastAccess().getUnitTimeTypeParserRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At_least__UnitAssignment_2_1_2"


    // $ANTLR start "rule__At_least__UnitAssignment_2_2"
    // InternalAdeptness.g:8647:1: rule__At_least__UnitAssignment_2_2 : ( ruleTimeType ) ;
    public final void rule__At_least__UnitAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8651:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:8652:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:8652:2: ( ruleTimeType )
            // InternalAdeptness.g:8653:3: ruleTimeType
            {
             before(grammarAccess.getAt_leastAccess().getUnitTimeTypeParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeType();

            state._fsp--;

             after(grammarAccess.getAt_leastAccess().getUnitTimeTypeParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__At_least__UnitAssignment_2_2"


    // $ANTLR start "rule__Bound_up__ValueAssignment_0"
    // InternalAdeptness.g:8662:1: rule__Bound_up__ValueAssignment_0 : ( ruleDOUBLE ) ;
    public final void rule__Bound_up__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8666:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:8667:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:8667:2: ( ruleDOUBLE )
            // InternalAdeptness.g:8668:3: ruleDOUBLE
            {
             before(grammarAccess.getBound_upAccess().getValueDOUBLEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getBound_upAccess().getValueDOUBLEParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_up__ValueAssignment_0"


    // $ANTLR start "rule__Bound_up__EmAssignment_1"
    // InternalAdeptness.g:8677:1: rule__Bound_up__EmAssignment_1 : ( ruleExpressionsModel ) ;
    public final void rule__Bound_up__EmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8681:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:8682:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:8682:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:8683:3: ruleExpressionsModel
            {
             before(grammarAccess.getBound_upAccess().getEmExpressionsModelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionsModel();

            state._fsp--;

             after(grammarAccess.getBound_upAccess().getEmExpressionsModelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_up__EmAssignment_1"


    // $ANTLR start "rule__Bound_Down__ValueAssignment_0"
    // InternalAdeptness.g:8692:1: rule__Bound_Down__ValueAssignment_0 : ( ruleDOUBLE ) ;
    public final void rule__Bound_Down__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8696:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:8697:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:8697:2: ( ruleDOUBLE )
            // InternalAdeptness.g:8698:3: ruleDOUBLE
            {
             before(grammarAccess.getBound_DownAccess().getValueDOUBLEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getBound_DownAccess().getValueDOUBLEParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_Down__ValueAssignment_0"


    // $ANTLR start "rule__Bound_Down__EmAssignment_1"
    // InternalAdeptness.g:8707:1: rule__Bound_Down__EmAssignment_1 : ( ruleExpressionsModel ) ;
    public final void rule__Bound_Down__EmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8711:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:8712:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:8712:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:8713:3: ruleExpressionsModel
            {
             before(grammarAccess.getBound_DownAccess().getEmExpressionsModelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionsModel();

            state._fsp--;

             after(grammarAccess.getBound_DownAccess().getEmExpressionsModelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_Down__EmAssignment_1"


    // $ANTLR start "rule__BOOLEAN__BoolAssignment"
    // InternalAdeptness.g:8722:1: rule__BOOLEAN__BoolAssignment : ( ruleb ) ;
    public final void rule__BOOLEAN__BoolAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8726:1: ( ( ruleb ) )
            // InternalAdeptness.g:8727:2: ( ruleb )
            {
            // InternalAdeptness.g:8727:2: ( ruleb )
            // InternalAdeptness.g:8728:3: ruleb
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
    // InternalAdeptness.g:8737:1: rule__DOUBLE__DValAssignment : ( ruled ) ;
    public final void rule__DOUBLE__DValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8741:1: ( ( ruled ) )
            // InternalAdeptness.g:8742:2: ( ruled )
            {
            // InternalAdeptness.g:8742:2: ( ruled )
            // InternalAdeptness.g:8743:3: ruled
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
    // InternalAdeptness.g:8752:1: rule__TimeType__TimeAssignment_0 : ( ( 'milliseconds' ) ) ;
    public final void rule__TimeType__TimeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8756:1: ( ( ( 'milliseconds' ) ) )
            // InternalAdeptness.g:8757:2: ( ( 'milliseconds' ) )
            {
            // InternalAdeptness.g:8757:2: ( ( 'milliseconds' ) )
            // InternalAdeptness.g:8758:3: ( 'milliseconds' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMillisecondsKeyword_0_0()); 
            // InternalAdeptness.g:8759:3: ( 'milliseconds' )
            // InternalAdeptness.g:8760:4: 'milliseconds'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMillisecondsKeyword_0_0()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getTimeTypeAccess().getTimeMillisecondsKeyword_0_0()); 

            }

             after(grammarAccess.getTimeTypeAccess().getTimeMillisecondsKeyword_0_0()); 

            }


            }

        }
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
    // InternalAdeptness.g:8771:1: rule__TimeType__TimeAssignment_1 : ( ( 'seconds' ) ) ;
    public final void rule__TimeType__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8775:1: ( ( ( 'seconds' ) ) )
            // InternalAdeptness.g:8776:2: ( ( 'seconds' ) )
            {
            // InternalAdeptness.g:8776:2: ( ( 'seconds' ) )
            // InternalAdeptness.g:8777:3: ( 'seconds' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeSecondsKeyword_1_0()); 
            // InternalAdeptness.g:8778:3: ( 'seconds' )
            // InternalAdeptness.g:8779:4: 'seconds'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeSecondsKeyword_1_0()); 
            match(input,90,FOLLOW_2); 
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
    // InternalAdeptness.g:8790:1: rule__TimeType__TimeAssignment_2 : ( ( 'minutes' ) ) ;
    public final void rule__TimeType__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8794:1: ( ( ( 'minutes' ) ) )
            // InternalAdeptness.g:8795:2: ( ( 'minutes' ) )
            {
            // InternalAdeptness.g:8795:2: ( ( 'minutes' ) )
            // InternalAdeptness.g:8796:3: ( 'minutes' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMinutesKeyword_2_0()); 
            // InternalAdeptness.g:8797:3: ( 'minutes' )
            // InternalAdeptness.g:8798:4: 'minutes'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMinutesKeyword_2_0()); 
            match(input,91,FOLLOW_2); 
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
    // InternalAdeptness.g:8809:1: rule__TimeType__TimeAssignment_3 : ( ( 'hours' ) ) ;
    public final void rule__TimeType__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8813:1: ( ( ( 'hours' ) ) )
            // InternalAdeptness.g:8814:2: ( ( 'hours' ) )
            {
            // InternalAdeptness.g:8814:2: ( ( 'hours' ) )
            // InternalAdeptness.g:8815:3: ( 'hours' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeHoursKeyword_3_0()); 
            // InternalAdeptness.g:8816:3: ( 'hours' )
            // InternalAdeptness.g:8817:4: 'hours'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeHoursKeyword_3_0()); 
            match(input,92,FOLLOW_2); 
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
    // InternalAdeptness.g:8828:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8832:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:8833:2: ( RULE_ID )
            {
            // InternalAdeptness.g:8833:2: ( RULE_ID )
            // InternalAdeptness.g:8834:3: RULE_ID
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
    // InternalAdeptness.g:8843:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8847:1: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:8848:2: ( ruleQualifiedName )
            {
            // InternalAdeptness.g:8848:2: ( ruleQualifiedName )
            // InternalAdeptness.g:8849:3: ruleQualifiedName
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
    // InternalAdeptness.g:8858:1: rule__PackageDeclaration__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8862:1: ( ( ruleAbstractElement ) )
            // InternalAdeptness.g:8863:2: ( ruleAbstractElement )
            {
            // InternalAdeptness.g:8863:2: ( ruleAbstractElement )
            // InternalAdeptness.g:8864:3: ruleAbstractElement
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


    // $ANTLR start "rule__ExpressionsModel__ElementsAssignment"
    // InternalAdeptness.g:8873:1: rule__ExpressionsModel__ElementsAssignment : ( ruleAbstractElement2 ) ;
    public final void rule__ExpressionsModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8877:1: ( ( ruleAbstractElement2 ) )
            // InternalAdeptness.g:8878:2: ( ruleAbstractElement2 )
            {
            // InternalAdeptness.g:8878:2: ( ruleAbstractElement2 )
            // InternalAdeptness.g:8879:3: ruleAbstractElement2
            {
             before(grammarAccess.getExpressionsModelAccess().getElementsAbstractElement2ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement2();

            state._fsp--;

             after(grammarAccess.getExpressionsModelAccess().getElementsAbstractElement2ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionsModel__ElementsAssignment"


    // $ANTLR start "rule__AbstractElement2__FrontParenthesesAssignment_0"
    // InternalAdeptness.g:8888:1: rule__AbstractElement2__FrontParenthesesAssignment_0 : ( ruleFrontParentheses ) ;
    public final void rule__AbstractElement2__FrontParenthesesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8892:1: ( ( ruleFrontParentheses ) )
            // InternalAdeptness.g:8893:2: ( ruleFrontParentheses )
            {
            // InternalAdeptness.g:8893:2: ( ruleFrontParentheses )
            // InternalAdeptness.g:8894:3: ruleFrontParentheses
            {
             before(grammarAccess.getAbstractElement2Access().getFrontParenthesesFrontParenthesesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFrontParentheses();

            state._fsp--;

             after(grammarAccess.getAbstractElement2Access().getFrontParenthesesFrontParenthesesParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement2__FrontParenthesesAssignment_0"


    // $ANTLR start "rule__AbstractElement2__NameAssignment_1_0"
    // InternalAdeptness.g:8903:1: rule__AbstractElement2__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__AbstractElement2__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8907:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:8908:2: ( RULE_ID )
            {
            // InternalAdeptness.g:8908:2: ( RULE_ID )
            // InternalAdeptness.g:8909:3: RULE_ID
            {
             before(grammarAccess.getAbstractElement2Access().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAbstractElement2Access().getNameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement2__NameAssignment_1_0"


    // $ANTLR start "rule__AbstractElement2__ValueAssignment_1_1"
    // InternalAdeptness.g:8918:1: rule__AbstractElement2__ValueAssignment_1_1 : ( ruleDOUBLE ) ;
    public final void rule__AbstractElement2__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8922:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:8923:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:8923:2: ( ruleDOUBLE )
            // InternalAdeptness.g:8924:3: ruleDOUBLE
            {
             before(grammarAccess.getAbstractElement2Access().getValueDOUBLEParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getAbstractElement2Access().getValueDOUBLEParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement2__ValueAssignment_1_1"


    // $ANTLR start "rule__AbstractElement2__OpAssignment_2"
    // InternalAdeptness.g:8933:1: rule__AbstractElement2__OpAssignment_2 : ( ruleOperators ) ;
    public final void rule__AbstractElement2__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8937:1: ( ( ruleOperators ) )
            // InternalAdeptness.g:8938:2: ( ruleOperators )
            {
            // InternalAdeptness.g:8938:2: ( ruleOperators )
            // InternalAdeptness.g:8939:3: ruleOperators
            {
             before(grammarAccess.getAbstractElement2Access().getOpOperatorsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperators();

            state._fsp--;

             after(grammarAccess.getAbstractElement2Access().getOpOperatorsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement2__OpAssignment_2"


    // $ANTLR start "rule__Operators__OperatorAssignment_0"
    // InternalAdeptness.g:8948:1: rule__Operators__OperatorAssignment_0 : ( ruleOp ) ;
    public final void rule__Operators__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8952:1: ( ( ruleOp ) )
            // InternalAdeptness.g:8953:2: ( ruleOp )
            {
            // InternalAdeptness.g:8953:2: ( ruleOp )
            // InternalAdeptness.g:8954:3: ruleOp
            {
             before(grammarAccess.getOperatorsAccess().getOperatorOpParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOp();

            state._fsp--;

             after(grammarAccess.getOperatorsAccess().getOperatorOpParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operators__OperatorAssignment_0"


    // $ANTLR start "rule__Operators__ComparationAssignment_1"
    // InternalAdeptness.g:8963:1: rule__Operators__ComparationAssignment_1 : ( ruleCompOp ) ;
    public final void rule__Operators__ComparationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8967:1: ( ( ruleCompOp ) )
            // InternalAdeptness.g:8968:2: ( ruleCompOp )
            {
            // InternalAdeptness.g:8968:2: ( ruleCompOp )
            // InternalAdeptness.g:8969:3: ruleCompOp
            {
             before(grammarAccess.getOperatorsAccess().getComparationCompOpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompOp();

            state._fsp--;

             after(grammarAccess.getOperatorsAccess().getComparationCompOpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operators__ComparationAssignment_1"


    // $ANTLR start "rule__Operators__LogicOperatorAssignment_2"
    // InternalAdeptness.g:8978:1: rule__Operators__LogicOperatorAssignment_2 : ( ruleLogicOp ) ;
    public final void rule__Operators__LogicOperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8982:1: ( ( ruleLogicOp ) )
            // InternalAdeptness.g:8983:2: ( ruleLogicOp )
            {
            // InternalAdeptness.g:8983:2: ( ruleLogicOp )
            // InternalAdeptness.g:8984:3: ruleLogicOp
            {
             before(grammarAccess.getOperatorsAccess().getLogicOperatorLogicOpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicOp();

            state._fsp--;

             after(grammarAccess.getOperatorsAccess().getLogicOperatorLogicOpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operators__LogicOperatorAssignment_2"


    // $ANTLR start "rule__Operators__BackParenthesesAssignment_3"
    // InternalAdeptness.g:8993:1: rule__Operators__BackParenthesesAssignment_3 : ( ruleBackParentheses ) ;
    public final void rule__Operators__BackParenthesesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8997:1: ( ( ruleBackParentheses ) )
            // InternalAdeptness.g:8998:2: ( ruleBackParentheses )
            {
            // InternalAdeptness.g:8998:2: ( ruleBackParentheses )
            // InternalAdeptness.g:8999:3: ruleBackParentheses
            {
             before(grammarAccess.getOperatorsAccess().getBackParenthesesBackParenthesesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBackParentheses();

            state._fsp--;

             after(grammarAccess.getOperatorsAccess().getBackParenthesesBackParenthesesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operators__BackParenthesesAssignment_3"


    // $ANTLR start "rule__CompOp__OpAssignment"
    // InternalAdeptness.g:9008:1: rule__CompOp__OpAssignment : ( ( rule__CompOp__OpAlternatives_0 ) ) ;
    public final void rule__CompOp__OpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:9012:1: ( ( ( rule__CompOp__OpAlternatives_0 ) ) )
            // InternalAdeptness.g:9013:2: ( ( rule__CompOp__OpAlternatives_0 ) )
            {
            // InternalAdeptness.g:9013:2: ( ( rule__CompOp__OpAlternatives_0 ) )
            // InternalAdeptness.g:9014:3: ( rule__CompOp__OpAlternatives_0 )
            {
             before(grammarAccess.getCompOpAccess().getOpAlternatives_0()); 
            // InternalAdeptness.g:9015:3: ( rule__CompOp__OpAlternatives_0 )
            // InternalAdeptness.g:9015:4: rule__CompOp__OpAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__CompOp__OpAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCompOpAccess().getOpAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOp__OpAssignment"


    // $ANTLR start "rule__LogicOp__OpAssignment"
    // InternalAdeptness.g:9023:1: rule__LogicOp__OpAssignment : ( ( rule__LogicOp__OpAlternatives_0 ) ) ;
    public final void rule__LogicOp__OpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:9027:1: ( ( ( rule__LogicOp__OpAlternatives_0 ) ) )
            // InternalAdeptness.g:9028:2: ( ( rule__LogicOp__OpAlternatives_0 ) )
            {
            // InternalAdeptness.g:9028:2: ( ( rule__LogicOp__OpAlternatives_0 ) )
            // InternalAdeptness.g:9029:3: ( rule__LogicOp__OpAlternatives_0 )
            {
             before(grammarAccess.getLogicOpAccess().getOpAlternatives_0()); 
            // InternalAdeptness.g:9030:3: ( rule__LogicOp__OpAlternatives_0 )
            // InternalAdeptness.g:9030:4: rule__LogicOp__OpAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__LogicOp__OpAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getLogicOpAccess().getOpAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOp__OpAssignment"


    // $ANTLR start "rule__Op__OpAssignment"
    // InternalAdeptness.g:9038:1: rule__Op__OpAssignment : ( ( rule__Op__OpAlternatives_0 ) ) ;
    public final void rule__Op__OpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:9042:1: ( ( ( rule__Op__OpAlternatives_0 ) ) )
            // InternalAdeptness.g:9043:2: ( ( rule__Op__OpAlternatives_0 ) )
            {
            // InternalAdeptness.g:9043:2: ( ( rule__Op__OpAlternatives_0 ) )
            // InternalAdeptness.g:9044:3: ( rule__Op__OpAlternatives_0 )
            {
             before(grammarAccess.getOpAccess().getOpAlternatives_0()); 
            // InternalAdeptness.g:9045:3: ( rule__Op__OpAlternatives_0 )
            // InternalAdeptness.g:9045:4: rule__Op__OpAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Op__OpAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getOpAccess().getOpAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Op__OpAssignment"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\102\1\5\1\uffff\1\5\1\36\1\5\3\uffff\1\101";
    static final String dfa_3s = "\1\105\1\31\1\uffff\1\5\1\106\1\5\3\uffff\1\106";
    static final String dfa_4s = "\2\uffff\1\3\3\uffff\1\1\1\2\1\4\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2",
            "\1\4\23\uffff\1\3",
            "",
            "\1\4",
            "\1\5\42\uffff\1\6\1\uffff\1\10\2\uffff\1\7",
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

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1627:1: rule__Reason__Alternatives_0 : ( ( ( rule__Reason__HighPeakAssignment_0_0 ) ) | ( ( rule__Reason__HighTimeAssignment_0_1 ) ) | ( ( rule__Reason__ConstDegAssignment_0_2 ) ) | ( ( rule__Reason__XPeaksAssignment_0_3 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0010200090000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000832L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000830L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000001C00000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040000100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0100000400000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x4C00000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x000000001E000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002F80L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000034000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000002000L,0x000000001E008000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0010200090000000L,0x00000000002C0000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x000000000FFF1000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x000000000FFF1002L});

}