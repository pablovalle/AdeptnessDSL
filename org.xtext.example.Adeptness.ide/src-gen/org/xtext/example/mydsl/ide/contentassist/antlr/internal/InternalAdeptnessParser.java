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


    // $ANTLR start "entryRuleComas"
    // InternalAdeptness.g:1403:1: entryRuleComas : ruleComas EOF ;
    public final void entryRuleComas() throws RecognitionException {
        try {
            // InternalAdeptness.g:1404:1: ( ruleComas EOF )
            // InternalAdeptness.g:1405:1: ruleComas EOF
            {
             before(grammarAccess.getComasRule()); 
            pushFollow(FOLLOW_1);
            ruleComas();

            state._fsp--;

             after(grammarAccess.getComasRule()); 
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
    // $ANTLR end "entryRuleComas"


    // $ANTLR start "ruleComas"
    // InternalAdeptness.g:1412:1: ruleComas : ( ( rule__Comas__OpAssignment ) ) ;
    public final void ruleComas() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1416:2: ( ( ( rule__Comas__OpAssignment ) ) )
            // InternalAdeptness.g:1417:2: ( ( rule__Comas__OpAssignment ) )
            {
            // InternalAdeptness.g:1417:2: ( ( rule__Comas__OpAssignment ) )
            // InternalAdeptness.g:1418:3: ( rule__Comas__OpAssignment )
            {
             before(grammarAccess.getComasAccess().getOpAssignment()); 
            // InternalAdeptness.g:1419:3: ( rule__Comas__OpAssignment )
            // InternalAdeptness.g:1419:4: rule__Comas__OpAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Comas__OpAssignment();

            state._fsp--;


            }

             after(grammarAccess.getComasAccess().getOpAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComas"


    // $ANTLR start "entryRuleCompOp"
    // InternalAdeptness.g:1428:1: entryRuleCompOp : ruleCompOp EOF ;
    public final void entryRuleCompOp() throws RecognitionException {
        try {
            // InternalAdeptness.g:1429:1: ( ruleCompOp EOF )
            // InternalAdeptness.g:1430:1: ruleCompOp EOF
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
    // InternalAdeptness.g:1437:1: ruleCompOp : ( ( rule__CompOp__OpAssignment ) ) ;
    public final void ruleCompOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1441:2: ( ( ( rule__CompOp__OpAssignment ) ) )
            // InternalAdeptness.g:1442:2: ( ( rule__CompOp__OpAssignment ) )
            {
            // InternalAdeptness.g:1442:2: ( ( rule__CompOp__OpAssignment ) )
            // InternalAdeptness.g:1443:3: ( rule__CompOp__OpAssignment )
            {
             before(grammarAccess.getCompOpAccess().getOpAssignment()); 
            // InternalAdeptness.g:1444:3: ( rule__CompOp__OpAssignment )
            // InternalAdeptness.g:1444:4: rule__CompOp__OpAssignment
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
    // InternalAdeptness.g:1453:1: entryRuleLogicOp : ruleLogicOp EOF ;
    public final void entryRuleLogicOp() throws RecognitionException {
        try {
            // InternalAdeptness.g:1454:1: ( ruleLogicOp EOF )
            // InternalAdeptness.g:1455:1: ruleLogicOp EOF
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
    // InternalAdeptness.g:1462:1: ruleLogicOp : ( ( rule__LogicOp__OpAssignment ) ) ;
    public final void ruleLogicOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1466:2: ( ( ( rule__LogicOp__OpAssignment ) ) )
            // InternalAdeptness.g:1467:2: ( ( rule__LogicOp__OpAssignment ) )
            {
            // InternalAdeptness.g:1467:2: ( ( rule__LogicOp__OpAssignment ) )
            // InternalAdeptness.g:1468:3: ( rule__LogicOp__OpAssignment )
            {
             before(grammarAccess.getLogicOpAccess().getOpAssignment()); 
            // InternalAdeptness.g:1469:3: ( rule__LogicOp__OpAssignment )
            // InternalAdeptness.g:1469:4: rule__LogicOp__OpAssignment
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
    // InternalAdeptness.g:1478:1: entryRuleOp : ruleOp EOF ;
    public final void entryRuleOp() throws RecognitionException {
        try {
            // InternalAdeptness.g:1479:1: ( ruleOp EOF )
            // InternalAdeptness.g:1480:1: ruleOp EOF
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
    // InternalAdeptness.g:1487:1: ruleOp : ( ( rule__Op__OpAssignment ) ) ;
    public final void ruleOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1491:2: ( ( ( rule__Op__OpAssignment ) ) )
            // InternalAdeptness.g:1492:2: ( ( rule__Op__OpAssignment ) )
            {
            // InternalAdeptness.g:1492:2: ( ( rule__Op__OpAssignment ) )
            // InternalAdeptness.g:1493:3: ( rule__Op__OpAssignment )
            {
             before(grammarAccess.getOpAccess().getOpAssignment()); 
            // InternalAdeptness.g:1494:3: ( rule__Op__OpAssignment )
            // InternalAdeptness.g:1494:4: rule__Op__OpAssignment
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
    // InternalAdeptness.g:1502:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImports ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1506:1: ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImports ) )
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
                    // InternalAdeptness.g:1507:2: ( rulePackageDeclaration )
                    {
                    // InternalAdeptness.g:1507:2: ( rulePackageDeclaration )
                    // InternalAdeptness.g:1508:3: rulePackageDeclaration
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
                    // InternalAdeptness.g:1513:2: ( ruleType )
                    {
                    // InternalAdeptness.g:1513:2: ( ruleType )
                    // InternalAdeptness.g:1514:3: ruleType
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
                    // InternalAdeptness.g:1519:2: ( ruleImports )
                    {
                    // InternalAdeptness.g:1519:2: ( ruleImports )
                    // InternalAdeptness.g:1520:3: ruleImports
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
    // InternalAdeptness.g:1529:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleSignal ) | ( ruleMonitoringFile ) | ( ruleValidationPlan ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1533:1: ( ( ruleDataType ) | ( ruleSignal ) | ( ruleMonitoringFile ) | ( ruleValidationPlan ) )
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
                    // InternalAdeptness.g:1534:2: ( ruleDataType )
                    {
                    // InternalAdeptness.g:1534:2: ( ruleDataType )
                    // InternalAdeptness.g:1535:3: ruleDataType
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
                    // InternalAdeptness.g:1540:2: ( ruleSignal )
                    {
                    // InternalAdeptness.g:1540:2: ( ruleSignal )
                    // InternalAdeptness.g:1541:3: ruleSignal
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
                    // InternalAdeptness.g:1546:2: ( ruleMonitoringFile )
                    {
                    // InternalAdeptness.g:1546:2: ( ruleMonitoringFile )
                    // InternalAdeptness.g:1547:3: ruleMonitoringFile
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
                    // InternalAdeptness.g:1552:2: ( ruleValidationPlan )
                    {
                    // InternalAdeptness.g:1552:2: ( ruleValidationPlan )
                    // InternalAdeptness.g:1553:3: ruleValidationPlan
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
    // InternalAdeptness.g:1562:1: rule__Sig_type__Alternatives : ( ( ( rule__Sig_type__Sig_typeAssignment_0 ) ) | ( ( rule__Sig_type__Sig_typeAssignment_1 ) ) | ( ( rule__Sig_type__Sig_typeAssignment_2 ) ) );
    public final void rule__Sig_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1566:1: ( ( ( rule__Sig_type__Sig_typeAssignment_0 ) ) | ( ( rule__Sig_type__Sig_typeAssignment_1 ) ) | ( ( rule__Sig_type__Sig_typeAssignment_2 ) ) )
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
                    // InternalAdeptness.g:1567:2: ( ( rule__Sig_type__Sig_typeAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1567:2: ( ( rule__Sig_type__Sig_typeAssignment_0 ) )
                    // InternalAdeptness.g:1568:3: ( rule__Sig_type__Sig_typeAssignment_0 )
                    {
                     before(grammarAccess.getSig_typeAccess().getSig_typeAssignment_0()); 
                    // InternalAdeptness.g:1569:3: ( rule__Sig_type__Sig_typeAssignment_0 )
                    // InternalAdeptness.g:1569:4: rule__Sig_type__Sig_typeAssignment_0
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
                    // InternalAdeptness.g:1573:2: ( ( rule__Sig_type__Sig_typeAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1573:2: ( ( rule__Sig_type__Sig_typeAssignment_1 ) )
                    // InternalAdeptness.g:1574:3: ( rule__Sig_type__Sig_typeAssignment_1 )
                    {
                     before(grammarAccess.getSig_typeAccess().getSig_typeAssignment_1()); 
                    // InternalAdeptness.g:1575:3: ( rule__Sig_type__Sig_typeAssignment_1 )
                    // InternalAdeptness.g:1575:4: rule__Sig_type__Sig_typeAssignment_1
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
                    // InternalAdeptness.g:1579:2: ( ( rule__Sig_type__Sig_typeAssignment_2 ) )
                    {
                    // InternalAdeptness.g:1579:2: ( ( rule__Sig_type__Sig_typeAssignment_2 ) )
                    // InternalAdeptness.g:1580:3: ( rule__Sig_type__Sig_typeAssignment_2 )
                    {
                     before(grammarAccess.getSig_typeAccess().getSig_typeAssignment_2()); 
                    // InternalAdeptness.g:1581:3: ( rule__Sig_type__Sig_typeAssignment_2 )
                    // InternalAdeptness.g:1581:4: rule__Sig_type__Sig_typeAssignment_2
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
    // InternalAdeptness.g:1589:1: rule__Oracle__Alternatives_3 : ( ( ( rule__Oracle__WhenAssignment_3_0 ) ) | ( ( rule__Oracle__WhileAssignment_3_1 ) ) );
    public final void rule__Oracle__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1593:1: ( ( ( rule__Oracle__WhenAssignment_3_0 ) ) | ( ( rule__Oracle__WhileAssignment_3_1 ) ) )
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
                    // InternalAdeptness.g:1594:2: ( ( rule__Oracle__WhenAssignment_3_0 ) )
                    {
                    // InternalAdeptness.g:1594:2: ( ( rule__Oracle__WhenAssignment_3_0 ) )
                    // InternalAdeptness.g:1595:3: ( rule__Oracle__WhenAssignment_3_0 )
                    {
                     before(grammarAccess.getOracleAccess().getWhenAssignment_3_0()); 
                    // InternalAdeptness.g:1596:3: ( rule__Oracle__WhenAssignment_3_0 )
                    // InternalAdeptness.g:1596:4: rule__Oracle__WhenAssignment_3_0
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
                    // InternalAdeptness.g:1600:2: ( ( rule__Oracle__WhileAssignment_3_1 ) )
                    {
                    // InternalAdeptness.g:1600:2: ( ( rule__Oracle__WhileAssignment_3_1 ) )
                    // InternalAdeptness.g:1601:3: ( rule__Oracle__WhileAssignment_3_1 )
                    {
                     before(grammarAccess.getOracleAccess().getWhileAssignment_3_1()); 
                    // InternalAdeptness.g:1602:3: ( rule__Oracle__WhileAssignment_3_1 )
                    // InternalAdeptness.g:1602:4: rule__Oracle__WhileAssignment_3_1
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
    // InternalAdeptness.g:1610:1: rule__AfterWhen__Alternatives : ( ( ( rule__AfterWhen__WaitAssignment_0 ) ) | ( ( rule__AfterWhen__DuringAssignment_1 ) ) );
    public final void rule__AfterWhen__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1614:1: ( ( ( rule__AfterWhen__WaitAssignment_0 ) ) | ( ( rule__AfterWhen__DuringAssignment_1 ) ) )
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
                    // InternalAdeptness.g:1615:2: ( ( rule__AfterWhen__WaitAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1615:2: ( ( rule__AfterWhen__WaitAssignment_0 ) )
                    // InternalAdeptness.g:1616:3: ( rule__AfterWhen__WaitAssignment_0 )
                    {
                     before(grammarAccess.getAfterWhenAccess().getWaitAssignment_0()); 
                    // InternalAdeptness.g:1617:3: ( rule__AfterWhen__WaitAssignment_0 )
                    // InternalAdeptness.g:1617:4: rule__AfterWhen__WaitAssignment_0
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
                    // InternalAdeptness.g:1621:2: ( ( rule__AfterWhen__DuringAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1621:2: ( ( rule__AfterWhen__DuringAssignment_1 ) )
                    // InternalAdeptness.g:1622:3: ( rule__AfterWhen__DuringAssignment_1 )
                    {
                     before(grammarAccess.getAfterWhenAccess().getDuringAssignment_1()); 
                    // InternalAdeptness.g:1623:3: ( rule__AfterWhen__DuringAssignment_1 )
                    // InternalAdeptness.g:1623:4: rule__AfterWhen__DuringAssignment_1
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
    // InternalAdeptness.g:1631:1: rule__Checks__Alternatives_1 : ( ( ( rule__Checks__NameAssignment_1_0 ) ) | ( ( rule__Checks__EmAssignment_1_1 ) ) );
    public final void rule__Checks__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1635:1: ( ( ( rule__Checks__NameAssignment_1_0 ) ) | ( ( rule__Checks__EmAssignment_1_1 ) ) )
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
                    // InternalAdeptness.g:1636:2: ( ( rule__Checks__NameAssignment_1_0 ) )
                    {
                    // InternalAdeptness.g:1636:2: ( ( rule__Checks__NameAssignment_1_0 ) )
                    // InternalAdeptness.g:1637:3: ( rule__Checks__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getChecksAccess().getNameAssignment_1_0()); 
                    // InternalAdeptness.g:1638:3: ( rule__Checks__NameAssignment_1_0 )
                    // InternalAdeptness.g:1638:4: rule__Checks__NameAssignment_1_0
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
                    // InternalAdeptness.g:1642:2: ( ( rule__Checks__EmAssignment_1_1 ) )
                    {
                    // InternalAdeptness.g:1642:2: ( ( rule__Checks__EmAssignment_1_1 ) )
                    // InternalAdeptness.g:1643:3: ( rule__Checks__EmAssignment_1_1 )
                    {
                     before(grammarAccess.getChecksAccess().getEmAssignment_1_1()); 
                    // InternalAdeptness.g:1644:3: ( rule__Checks__EmAssignment_1_1 )
                    // InternalAdeptness.g:1644:4: rule__Checks__EmAssignment_1_1
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
    // InternalAdeptness.g:1652:1: rule__Reason__Alternatives_0 : ( ( ( rule__Reason__HighPeakAssignment_0_0 ) ) | ( ( rule__Reason__HighTimeAssignment_0_1 ) ) | ( ( rule__Reason__ConstDegAssignment_0_2 ) ) | ( ( rule__Reason__XPeaksAssignment_0_3 ) ) );
    public final void rule__Reason__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1656:1: ( ( ( rule__Reason__HighPeakAssignment_0_0 ) ) | ( ( rule__Reason__HighTimeAssignment_0_1 ) ) | ( ( rule__Reason__ConstDegAssignment_0_2 ) ) | ( ( rule__Reason__XPeaksAssignment_0_3 ) ) )
            int alt9=4;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalAdeptness.g:1657:2: ( ( rule__Reason__HighPeakAssignment_0_0 ) )
                    {
                    // InternalAdeptness.g:1657:2: ( ( rule__Reason__HighPeakAssignment_0_0 ) )
                    // InternalAdeptness.g:1658:3: ( rule__Reason__HighPeakAssignment_0_0 )
                    {
                     before(grammarAccess.getReasonAccess().getHighPeakAssignment_0_0()); 
                    // InternalAdeptness.g:1659:3: ( rule__Reason__HighPeakAssignment_0_0 )
                    // InternalAdeptness.g:1659:4: rule__Reason__HighPeakAssignment_0_0
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
                    // InternalAdeptness.g:1663:2: ( ( rule__Reason__HighTimeAssignment_0_1 ) )
                    {
                    // InternalAdeptness.g:1663:2: ( ( rule__Reason__HighTimeAssignment_0_1 ) )
                    // InternalAdeptness.g:1664:3: ( rule__Reason__HighTimeAssignment_0_1 )
                    {
                     before(grammarAccess.getReasonAccess().getHighTimeAssignment_0_1()); 
                    // InternalAdeptness.g:1665:3: ( rule__Reason__HighTimeAssignment_0_1 )
                    // InternalAdeptness.g:1665:4: rule__Reason__HighTimeAssignment_0_1
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
                    // InternalAdeptness.g:1669:2: ( ( rule__Reason__ConstDegAssignment_0_2 ) )
                    {
                    // InternalAdeptness.g:1669:2: ( ( rule__Reason__ConstDegAssignment_0_2 ) )
                    // InternalAdeptness.g:1670:3: ( rule__Reason__ConstDegAssignment_0_2 )
                    {
                     before(grammarAccess.getReasonAccess().getConstDegAssignment_0_2()); 
                    // InternalAdeptness.g:1671:3: ( rule__Reason__ConstDegAssignment_0_2 )
                    // InternalAdeptness.g:1671:4: rule__Reason__ConstDegAssignment_0_2
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
                    // InternalAdeptness.g:1675:2: ( ( rule__Reason__XPeaksAssignment_0_3 ) )
                    {
                    // InternalAdeptness.g:1675:2: ( ( rule__Reason__XPeaksAssignment_0_3 ) )
                    // InternalAdeptness.g:1676:3: ( rule__Reason__XPeaksAssignment_0_3 )
                    {
                     before(grammarAccess.getReasonAccess().getXPeaksAssignment_0_3()); 
                    // InternalAdeptness.g:1677:3: ( rule__Reason__XPeaksAssignment_0_3 )
                    // InternalAdeptness.g:1677:4: rule__Reason__XPeaksAssignment_0_3
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
    // InternalAdeptness.g:1685:1: rule__Reference__Alternatives_0 : ( ( ( rule__Reference__UpperAssignment_0_0 ) ) | ( ( rule__Reference__LowerAssignment_0_1 ) ) | ( ( rule__Reference__RangeAssignment_0_2 ) ) | ( ( rule__Reference__GapAssignment_0_3 ) ) | ( ( rule__Reference__SameAssignment_0_4 ) ) | ( ( rule__Reference__NotsameAssignment_0_5 ) ) );
    public final void rule__Reference__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1689:1: ( ( ( rule__Reference__UpperAssignment_0_0 ) ) | ( ( rule__Reference__LowerAssignment_0_1 ) ) | ( ( rule__Reference__RangeAssignment_0_2 ) ) | ( ( rule__Reference__GapAssignment_0_3 ) ) | ( ( rule__Reference__SameAssignment_0_4 ) ) | ( ( rule__Reference__NotsameAssignment_0_5 ) ) )
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
                    // InternalAdeptness.g:1690:2: ( ( rule__Reference__UpperAssignment_0_0 ) )
                    {
                    // InternalAdeptness.g:1690:2: ( ( rule__Reference__UpperAssignment_0_0 ) )
                    // InternalAdeptness.g:1691:3: ( rule__Reference__UpperAssignment_0_0 )
                    {
                     before(grammarAccess.getReferenceAccess().getUpperAssignment_0_0()); 
                    // InternalAdeptness.g:1692:3: ( rule__Reference__UpperAssignment_0_0 )
                    // InternalAdeptness.g:1692:4: rule__Reference__UpperAssignment_0_0
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
                    // InternalAdeptness.g:1696:2: ( ( rule__Reference__LowerAssignment_0_1 ) )
                    {
                    // InternalAdeptness.g:1696:2: ( ( rule__Reference__LowerAssignment_0_1 ) )
                    // InternalAdeptness.g:1697:3: ( rule__Reference__LowerAssignment_0_1 )
                    {
                     before(grammarAccess.getReferenceAccess().getLowerAssignment_0_1()); 
                    // InternalAdeptness.g:1698:3: ( rule__Reference__LowerAssignment_0_1 )
                    // InternalAdeptness.g:1698:4: rule__Reference__LowerAssignment_0_1
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
                    // InternalAdeptness.g:1702:2: ( ( rule__Reference__RangeAssignment_0_2 ) )
                    {
                    // InternalAdeptness.g:1702:2: ( ( rule__Reference__RangeAssignment_0_2 ) )
                    // InternalAdeptness.g:1703:3: ( rule__Reference__RangeAssignment_0_2 )
                    {
                     before(grammarAccess.getReferenceAccess().getRangeAssignment_0_2()); 
                    // InternalAdeptness.g:1704:3: ( rule__Reference__RangeAssignment_0_2 )
                    // InternalAdeptness.g:1704:4: rule__Reference__RangeAssignment_0_2
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
                    // InternalAdeptness.g:1708:2: ( ( rule__Reference__GapAssignment_0_3 ) )
                    {
                    // InternalAdeptness.g:1708:2: ( ( rule__Reference__GapAssignment_0_3 ) )
                    // InternalAdeptness.g:1709:3: ( rule__Reference__GapAssignment_0_3 )
                    {
                     before(grammarAccess.getReferenceAccess().getGapAssignment_0_3()); 
                    // InternalAdeptness.g:1710:3: ( rule__Reference__GapAssignment_0_3 )
                    // InternalAdeptness.g:1710:4: rule__Reference__GapAssignment_0_3
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
                    // InternalAdeptness.g:1714:2: ( ( rule__Reference__SameAssignment_0_4 ) )
                    {
                    // InternalAdeptness.g:1714:2: ( ( rule__Reference__SameAssignment_0_4 ) )
                    // InternalAdeptness.g:1715:3: ( rule__Reference__SameAssignment_0_4 )
                    {
                     before(grammarAccess.getReferenceAccess().getSameAssignment_0_4()); 
                    // InternalAdeptness.g:1716:3: ( rule__Reference__SameAssignment_0_4 )
                    // InternalAdeptness.g:1716:4: rule__Reference__SameAssignment_0_4
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
                    // InternalAdeptness.g:1720:2: ( ( rule__Reference__NotsameAssignment_0_5 ) )
                    {
                    // InternalAdeptness.g:1720:2: ( ( rule__Reference__NotsameAssignment_0_5 ) )
                    // InternalAdeptness.g:1721:3: ( rule__Reference__NotsameAssignment_0_5 )
                    {
                     before(grammarAccess.getReferenceAccess().getNotsameAssignment_0_5()); 
                    // InternalAdeptness.g:1722:3: ( rule__Reference__NotsameAssignment_0_5 )
                    // InternalAdeptness.g:1722:4: rule__Reference__NotsameAssignment_0_5
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
    // InternalAdeptness.g:1730:1: rule__Same__Alternatives_2 : ( ( ( rule__Same__ExactlyAssignment_2_0 ) ) | ( ( rule__Same__AtmostAssignment_2_1 ) ) | ( ( rule__Same__AtleastAssignment_2_2 ) ) );
    public final void rule__Same__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1734:1: ( ( ( rule__Same__ExactlyAssignment_2_0 ) ) | ( ( rule__Same__AtmostAssignment_2_1 ) ) | ( ( rule__Same__AtleastAssignment_2_2 ) ) )
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
                    // InternalAdeptness.g:1735:2: ( ( rule__Same__ExactlyAssignment_2_0 ) )
                    {
                    // InternalAdeptness.g:1735:2: ( ( rule__Same__ExactlyAssignment_2_0 ) )
                    // InternalAdeptness.g:1736:3: ( rule__Same__ExactlyAssignment_2_0 )
                    {
                     before(grammarAccess.getSameAccess().getExactlyAssignment_2_0()); 
                    // InternalAdeptness.g:1737:3: ( rule__Same__ExactlyAssignment_2_0 )
                    // InternalAdeptness.g:1737:4: rule__Same__ExactlyAssignment_2_0
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
                    // InternalAdeptness.g:1741:2: ( ( rule__Same__AtmostAssignment_2_1 ) )
                    {
                    // InternalAdeptness.g:1741:2: ( ( rule__Same__AtmostAssignment_2_1 ) )
                    // InternalAdeptness.g:1742:3: ( rule__Same__AtmostAssignment_2_1 )
                    {
                     before(grammarAccess.getSameAccess().getAtmostAssignment_2_1()); 
                    // InternalAdeptness.g:1743:3: ( rule__Same__AtmostAssignment_2_1 )
                    // InternalAdeptness.g:1743:4: rule__Same__AtmostAssignment_2_1
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
                    // InternalAdeptness.g:1747:2: ( ( rule__Same__AtleastAssignment_2_2 ) )
                    {
                    // InternalAdeptness.g:1747:2: ( ( rule__Same__AtleastAssignment_2_2 ) )
                    // InternalAdeptness.g:1748:3: ( rule__Same__AtleastAssignment_2_2 )
                    {
                     before(grammarAccess.getSameAccess().getAtleastAssignment_2_2()); 
                    // InternalAdeptness.g:1749:3: ( rule__Same__AtleastAssignment_2_2 )
                    // InternalAdeptness.g:1749:4: rule__Same__AtleastAssignment_2_2
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
    // InternalAdeptness.g:1757:1: rule__NotSame__Alternatives_2 : ( ( ( rule__NotSame__ExactlyAssignment_2_0 ) ) | ( ( rule__NotSame__AtmostAssignment_2_1 ) ) | ( ( rule__NotSame__AtleastAssignment_2_2 ) ) );
    public final void rule__NotSame__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1761:1: ( ( ( rule__NotSame__ExactlyAssignment_2_0 ) ) | ( ( rule__NotSame__AtmostAssignment_2_1 ) ) | ( ( rule__NotSame__AtleastAssignment_2_2 ) ) )
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
                    // InternalAdeptness.g:1762:2: ( ( rule__NotSame__ExactlyAssignment_2_0 ) )
                    {
                    // InternalAdeptness.g:1762:2: ( ( rule__NotSame__ExactlyAssignment_2_0 ) )
                    // InternalAdeptness.g:1763:3: ( rule__NotSame__ExactlyAssignment_2_0 )
                    {
                     before(grammarAccess.getNotSameAccess().getExactlyAssignment_2_0()); 
                    // InternalAdeptness.g:1764:3: ( rule__NotSame__ExactlyAssignment_2_0 )
                    // InternalAdeptness.g:1764:4: rule__NotSame__ExactlyAssignment_2_0
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
                    // InternalAdeptness.g:1768:2: ( ( rule__NotSame__AtmostAssignment_2_1 ) )
                    {
                    // InternalAdeptness.g:1768:2: ( ( rule__NotSame__AtmostAssignment_2_1 ) )
                    // InternalAdeptness.g:1769:3: ( rule__NotSame__AtmostAssignment_2_1 )
                    {
                     before(grammarAccess.getNotSameAccess().getAtmostAssignment_2_1()); 
                    // InternalAdeptness.g:1770:3: ( rule__NotSame__AtmostAssignment_2_1 )
                    // InternalAdeptness.g:1770:4: rule__NotSame__AtmostAssignment_2_1
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
                    // InternalAdeptness.g:1774:2: ( ( rule__NotSame__AtleastAssignment_2_2 ) )
                    {
                    // InternalAdeptness.g:1774:2: ( ( rule__NotSame__AtleastAssignment_2_2 ) )
                    // InternalAdeptness.g:1775:3: ( rule__NotSame__AtleastAssignment_2_2 )
                    {
                     before(grammarAccess.getNotSameAccess().getAtleastAssignment_2_2()); 
                    // InternalAdeptness.g:1776:3: ( rule__NotSame__AtleastAssignment_2_2 )
                    // InternalAdeptness.g:1776:4: rule__NotSame__AtleastAssignment_2_2
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
    // InternalAdeptness.g:1784:1: rule__Upper__Alternatives_2 : ( ( ( rule__Upper__ExactlyAssignment_2_0 ) ) | ( ( rule__Upper__AtmostAssignment_2_1 ) ) | ( ( rule__Upper__AtleastAssignment_2_2 ) ) );
    public final void rule__Upper__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1788:1: ( ( ( rule__Upper__ExactlyAssignment_2_0 ) ) | ( ( rule__Upper__AtmostAssignment_2_1 ) ) | ( ( rule__Upper__AtleastAssignment_2_2 ) ) )
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
                    // InternalAdeptness.g:1789:2: ( ( rule__Upper__ExactlyAssignment_2_0 ) )
                    {
                    // InternalAdeptness.g:1789:2: ( ( rule__Upper__ExactlyAssignment_2_0 ) )
                    // InternalAdeptness.g:1790:3: ( rule__Upper__ExactlyAssignment_2_0 )
                    {
                     before(grammarAccess.getUpperAccess().getExactlyAssignment_2_0()); 
                    // InternalAdeptness.g:1791:3: ( rule__Upper__ExactlyAssignment_2_0 )
                    // InternalAdeptness.g:1791:4: rule__Upper__ExactlyAssignment_2_0
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
                    // InternalAdeptness.g:1795:2: ( ( rule__Upper__AtmostAssignment_2_1 ) )
                    {
                    // InternalAdeptness.g:1795:2: ( ( rule__Upper__AtmostAssignment_2_1 ) )
                    // InternalAdeptness.g:1796:3: ( rule__Upper__AtmostAssignment_2_1 )
                    {
                     before(grammarAccess.getUpperAccess().getAtmostAssignment_2_1()); 
                    // InternalAdeptness.g:1797:3: ( rule__Upper__AtmostAssignment_2_1 )
                    // InternalAdeptness.g:1797:4: rule__Upper__AtmostAssignment_2_1
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
                    // InternalAdeptness.g:1801:2: ( ( rule__Upper__AtleastAssignment_2_2 ) )
                    {
                    // InternalAdeptness.g:1801:2: ( ( rule__Upper__AtleastAssignment_2_2 ) )
                    // InternalAdeptness.g:1802:3: ( rule__Upper__AtleastAssignment_2_2 )
                    {
                     before(grammarAccess.getUpperAccess().getAtleastAssignment_2_2()); 
                    // InternalAdeptness.g:1803:3: ( rule__Upper__AtleastAssignment_2_2 )
                    // InternalAdeptness.g:1803:4: rule__Upper__AtleastAssignment_2_2
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
    // InternalAdeptness.g:1811:1: rule__Lower__Alternatives_2 : ( ( ( rule__Lower__ExactlyAssignment_2_0 ) ) | ( ( rule__Lower__AtmostAssignment_2_1 ) ) | ( ( rule__Lower__AtleastAssignment_2_2 ) ) );
    public final void rule__Lower__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1815:1: ( ( ( rule__Lower__ExactlyAssignment_2_0 ) ) | ( ( rule__Lower__AtmostAssignment_2_1 ) ) | ( ( rule__Lower__AtleastAssignment_2_2 ) ) )
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
                    // InternalAdeptness.g:1816:2: ( ( rule__Lower__ExactlyAssignment_2_0 ) )
                    {
                    // InternalAdeptness.g:1816:2: ( ( rule__Lower__ExactlyAssignment_2_0 ) )
                    // InternalAdeptness.g:1817:3: ( rule__Lower__ExactlyAssignment_2_0 )
                    {
                     before(grammarAccess.getLowerAccess().getExactlyAssignment_2_0()); 
                    // InternalAdeptness.g:1818:3: ( rule__Lower__ExactlyAssignment_2_0 )
                    // InternalAdeptness.g:1818:4: rule__Lower__ExactlyAssignment_2_0
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
                    // InternalAdeptness.g:1822:2: ( ( rule__Lower__AtmostAssignment_2_1 ) )
                    {
                    // InternalAdeptness.g:1822:2: ( ( rule__Lower__AtmostAssignment_2_1 ) )
                    // InternalAdeptness.g:1823:3: ( rule__Lower__AtmostAssignment_2_1 )
                    {
                     before(grammarAccess.getLowerAccess().getAtmostAssignment_2_1()); 
                    // InternalAdeptness.g:1824:3: ( rule__Lower__AtmostAssignment_2_1 )
                    // InternalAdeptness.g:1824:4: rule__Lower__AtmostAssignment_2_1
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
                    // InternalAdeptness.g:1828:2: ( ( rule__Lower__AtleastAssignment_2_2 ) )
                    {
                    // InternalAdeptness.g:1828:2: ( ( rule__Lower__AtleastAssignment_2_2 ) )
                    // InternalAdeptness.g:1829:3: ( rule__Lower__AtleastAssignment_2_2 )
                    {
                     before(grammarAccess.getLowerAccess().getAtleastAssignment_2_2()); 
                    // InternalAdeptness.g:1830:3: ( rule__Lower__AtleastAssignment_2_2 )
                    // InternalAdeptness.g:1830:4: rule__Lower__AtleastAssignment_2_2
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
    // InternalAdeptness.g:1838:1: rule__Range__Alternatives_4 : ( ( ( rule__Range__ExactlyAssignment_4_0 ) ) | ( ( rule__Range__AtmostAssignment_4_1 ) ) | ( ( rule__Range__AtleastAssignment_4_2 ) ) );
    public final void rule__Range__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1842:1: ( ( ( rule__Range__ExactlyAssignment_4_0 ) ) | ( ( rule__Range__AtmostAssignment_4_1 ) ) | ( ( rule__Range__AtleastAssignment_4_2 ) ) )
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
                    // InternalAdeptness.g:1843:2: ( ( rule__Range__ExactlyAssignment_4_0 ) )
                    {
                    // InternalAdeptness.g:1843:2: ( ( rule__Range__ExactlyAssignment_4_0 ) )
                    // InternalAdeptness.g:1844:3: ( rule__Range__ExactlyAssignment_4_0 )
                    {
                     before(grammarAccess.getRangeAccess().getExactlyAssignment_4_0()); 
                    // InternalAdeptness.g:1845:3: ( rule__Range__ExactlyAssignment_4_0 )
                    // InternalAdeptness.g:1845:4: rule__Range__ExactlyAssignment_4_0
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
                    // InternalAdeptness.g:1849:2: ( ( rule__Range__AtmostAssignment_4_1 ) )
                    {
                    // InternalAdeptness.g:1849:2: ( ( rule__Range__AtmostAssignment_4_1 ) )
                    // InternalAdeptness.g:1850:3: ( rule__Range__AtmostAssignment_4_1 )
                    {
                     before(grammarAccess.getRangeAccess().getAtmostAssignment_4_1()); 
                    // InternalAdeptness.g:1851:3: ( rule__Range__AtmostAssignment_4_1 )
                    // InternalAdeptness.g:1851:4: rule__Range__AtmostAssignment_4_1
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
                    // InternalAdeptness.g:1855:2: ( ( rule__Range__AtleastAssignment_4_2 ) )
                    {
                    // InternalAdeptness.g:1855:2: ( ( rule__Range__AtleastAssignment_4_2 ) )
                    // InternalAdeptness.g:1856:3: ( rule__Range__AtleastAssignment_4_2 )
                    {
                     before(grammarAccess.getRangeAccess().getAtleastAssignment_4_2()); 
                    // InternalAdeptness.g:1857:3: ( rule__Range__AtleastAssignment_4_2 )
                    // InternalAdeptness.g:1857:4: rule__Range__AtleastAssignment_4_2
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
    // InternalAdeptness.g:1865:1: rule__Gap__Alternatives_4 : ( ( ( rule__Gap__ExactlyAssignment_4_0 ) ) | ( ( rule__Gap__AtmostAssignment_4_1 ) ) | ( ( rule__Gap__AtleastAssignment_4_2 ) ) );
    public final void rule__Gap__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1869:1: ( ( ( rule__Gap__ExactlyAssignment_4_0 ) ) | ( ( rule__Gap__AtmostAssignment_4_1 ) ) | ( ( rule__Gap__AtleastAssignment_4_2 ) ) )
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
                    // InternalAdeptness.g:1870:2: ( ( rule__Gap__ExactlyAssignment_4_0 ) )
                    {
                    // InternalAdeptness.g:1870:2: ( ( rule__Gap__ExactlyAssignment_4_0 ) )
                    // InternalAdeptness.g:1871:3: ( rule__Gap__ExactlyAssignment_4_0 )
                    {
                     before(grammarAccess.getGapAccess().getExactlyAssignment_4_0()); 
                    // InternalAdeptness.g:1872:3: ( rule__Gap__ExactlyAssignment_4_0 )
                    // InternalAdeptness.g:1872:4: rule__Gap__ExactlyAssignment_4_0
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
                    // InternalAdeptness.g:1876:2: ( ( rule__Gap__AtmostAssignment_4_1 ) )
                    {
                    // InternalAdeptness.g:1876:2: ( ( rule__Gap__AtmostAssignment_4_1 ) )
                    // InternalAdeptness.g:1877:3: ( rule__Gap__AtmostAssignment_4_1 )
                    {
                     before(grammarAccess.getGapAccess().getAtmostAssignment_4_1()); 
                    // InternalAdeptness.g:1878:3: ( rule__Gap__AtmostAssignment_4_1 )
                    // InternalAdeptness.g:1878:4: rule__Gap__AtmostAssignment_4_1
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
                    // InternalAdeptness.g:1882:2: ( ( rule__Gap__AtleastAssignment_4_2 ) )
                    {
                    // InternalAdeptness.g:1882:2: ( ( rule__Gap__AtleastAssignment_4_2 ) )
                    // InternalAdeptness.g:1883:3: ( rule__Gap__AtleastAssignment_4_2 )
                    {
                     before(grammarAccess.getGapAccess().getAtleastAssignment_4_2()); 
                    // InternalAdeptness.g:1884:3: ( rule__Gap__AtleastAssignment_4_2 )
                    // InternalAdeptness.g:1884:4: rule__Gap__AtleastAssignment_4_2
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
    // InternalAdeptness.g:1892:1: rule__Exactly__Alternatives_2 : ( ( 'times' ) | ( ( rule__Exactly__Group_2_1__0 ) ) | ( ( rule__Exactly__UnitAssignment_2_2 ) ) );
    public final void rule__Exactly__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1896:1: ( ( 'times' ) | ( ( rule__Exactly__Group_2_1__0 ) ) | ( ( rule__Exactly__UnitAssignment_2_2 ) ) )
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
                    // InternalAdeptness.g:1897:2: ( 'times' )
                    {
                    // InternalAdeptness.g:1897:2: ( 'times' )
                    // InternalAdeptness.g:1898:3: 'times'
                    {
                     before(grammarAccess.getExactlyAccess().getTimesKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getExactlyAccess().getTimesKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1903:2: ( ( rule__Exactly__Group_2_1__0 ) )
                    {
                    // InternalAdeptness.g:1903:2: ( ( rule__Exactly__Group_2_1__0 ) )
                    // InternalAdeptness.g:1904:3: ( rule__Exactly__Group_2_1__0 )
                    {
                     before(grammarAccess.getExactlyAccess().getGroup_2_1()); 
                    // InternalAdeptness.g:1905:3: ( rule__Exactly__Group_2_1__0 )
                    // InternalAdeptness.g:1905:4: rule__Exactly__Group_2_1__0
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
                    // InternalAdeptness.g:1909:2: ( ( rule__Exactly__UnitAssignment_2_2 ) )
                    {
                    // InternalAdeptness.g:1909:2: ( ( rule__Exactly__UnitAssignment_2_2 ) )
                    // InternalAdeptness.g:1910:3: ( rule__Exactly__UnitAssignment_2_2 )
                    {
                     before(grammarAccess.getExactlyAccess().getUnitAssignment_2_2()); 
                    // InternalAdeptness.g:1911:3: ( rule__Exactly__UnitAssignment_2_2 )
                    // InternalAdeptness.g:1911:4: rule__Exactly__UnitAssignment_2_2
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
    // InternalAdeptness.g:1919:1: rule__At_most__Alternatives_2 : ( ( 'times' ) | ( ( rule__At_most__Group_2_1__0 ) ) | ( ( rule__At_most__UnitAssignment_2_2 ) ) );
    public final void rule__At_most__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1923:1: ( ( 'times' ) | ( ( rule__At_most__Group_2_1__0 ) ) | ( ( rule__At_most__UnitAssignment_2_2 ) ) )
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
                    // InternalAdeptness.g:1924:2: ( 'times' )
                    {
                    // InternalAdeptness.g:1924:2: ( 'times' )
                    // InternalAdeptness.g:1925:3: 'times'
                    {
                     before(grammarAccess.getAt_mostAccess().getTimesKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAt_mostAccess().getTimesKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1930:2: ( ( rule__At_most__Group_2_1__0 ) )
                    {
                    // InternalAdeptness.g:1930:2: ( ( rule__At_most__Group_2_1__0 ) )
                    // InternalAdeptness.g:1931:3: ( rule__At_most__Group_2_1__0 )
                    {
                     before(grammarAccess.getAt_mostAccess().getGroup_2_1()); 
                    // InternalAdeptness.g:1932:3: ( rule__At_most__Group_2_1__0 )
                    // InternalAdeptness.g:1932:4: rule__At_most__Group_2_1__0
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
                    // InternalAdeptness.g:1936:2: ( ( rule__At_most__UnitAssignment_2_2 ) )
                    {
                    // InternalAdeptness.g:1936:2: ( ( rule__At_most__UnitAssignment_2_2 ) )
                    // InternalAdeptness.g:1937:3: ( rule__At_most__UnitAssignment_2_2 )
                    {
                     before(grammarAccess.getAt_mostAccess().getUnitAssignment_2_2()); 
                    // InternalAdeptness.g:1938:3: ( rule__At_most__UnitAssignment_2_2 )
                    // InternalAdeptness.g:1938:4: rule__At_most__UnitAssignment_2_2
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
    // InternalAdeptness.g:1946:1: rule__At_least__Alternatives_2 : ( ( 'times' ) | ( ( rule__At_least__Group_2_1__0 ) ) | ( ( rule__At_least__UnitAssignment_2_2 ) ) );
    public final void rule__At_least__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1950:1: ( ( 'times' ) | ( ( rule__At_least__Group_2_1__0 ) ) | ( ( rule__At_least__UnitAssignment_2_2 ) ) )
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
                    // InternalAdeptness.g:1951:2: ( 'times' )
                    {
                    // InternalAdeptness.g:1951:2: ( 'times' )
                    // InternalAdeptness.g:1952:3: 'times'
                    {
                     before(grammarAccess.getAt_leastAccess().getTimesKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAt_leastAccess().getTimesKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1957:2: ( ( rule__At_least__Group_2_1__0 ) )
                    {
                    // InternalAdeptness.g:1957:2: ( ( rule__At_least__Group_2_1__0 ) )
                    // InternalAdeptness.g:1958:3: ( rule__At_least__Group_2_1__0 )
                    {
                     before(grammarAccess.getAt_leastAccess().getGroup_2_1()); 
                    // InternalAdeptness.g:1959:3: ( rule__At_least__Group_2_1__0 )
                    // InternalAdeptness.g:1959:4: rule__At_least__Group_2_1__0
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
                    // InternalAdeptness.g:1963:2: ( ( rule__At_least__UnitAssignment_2_2 ) )
                    {
                    // InternalAdeptness.g:1963:2: ( ( rule__At_least__UnitAssignment_2_2 ) )
                    // InternalAdeptness.g:1964:3: ( rule__At_least__UnitAssignment_2_2 )
                    {
                     before(grammarAccess.getAt_leastAccess().getUnitAssignment_2_2()); 
                    // InternalAdeptness.g:1965:3: ( rule__At_least__UnitAssignment_2_2 )
                    // InternalAdeptness.g:1965:4: rule__At_least__UnitAssignment_2_2
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
    // InternalAdeptness.g:1973:1: rule__Bound_up__Alternatives : ( ( ( rule__Bound_up__ValueAssignment_0 ) ) | ( ( rule__Bound_up__EmAssignment_1 ) ) );
    public final void rule__Bound_up__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1977:1: ( ( ( rule__Bound_up__ValueAssignment_0 ) ) | ( ( rule__Bound_up__EmAssignment_1 ) ) )
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
                    // InternalAdeptness.g:1978:2: ( ( rule__Bound_up__ValueAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1978:2: ( ( rule__Bound_up__ValueAssignment_0 ) )
                    // InternalAdeptness.g:1979:3: ( rule__Bound_up__ValueAssignment_0 )
                    {
                     before(grammarAccess.getBound_upAccess().getValueAssignment_0()); 
                    // InternalAdeptness.g:1980:3: ( rule__Bound_up__ValueAssignment_0 )
                    // InternalAdeptness.g:1980:4: rule__Bound_up__ValueAssignment_0
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
                    // InternalAdeptness.g:1984:2: ( ( rule__Bound_up__EmAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1984:2: ( ( rule__Bound_up__EmAssignment_1 ) )
                    // InternalAdeptness.g:1985:3: ( rule__Bound_up__EmAssignment_1 )
                    {
                     before(grammarAccess.getBound_upAccess().getEmAssignment_1()); 
                    // InternalAdeptness.g:1986:3: ( rule__Bound_up__EmAssignment_1 )
                    // InternalAdeptness.g:1986:4: rule__Bound_up__EmAssignment_1
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
    // InternalAdeptness.g:1994:1: rule__Bound_Down__Alternatives : ( ( ( rule__Bound_Down__ValueAssignment_0 ) ) | ( ( rule__Bound_Down__EmAssignment_1 ) ) );
    public final void rule__Bound_Down__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1998:1: ( ( ( rule__Bound_Down__ValueAssignment_0 ) ) | ( ( rule__Bound_Down__EmAssignment_1 ) ) )
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
                    // InternalAdeptness.g:1999:2: ( ( rule__Bound_Down__ValueAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1999:2: ( ( rule__Bound_Down__ValueAssignment_0 ) )
                    // InternalAdeptness.g:2000:3: ( rule__Bound_Down__ValueAssignment_0 )
                    {
                     before(grammarAccess.getBound_DownAccess().getValueAssignment_0()); 
                    // InternalAdeptness.g:2001:3: ( rule__Bound_Down__ValueAssignment_0 )
                    // InternalAdeptness.g:2001:4: rule__Bound_Down__ValueAssignment_0
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
                    // InternalAdeptness.g:2005:2: ( ( rule__Bound_Down__EmAssignment_1 ) )
                    {
                    // InternalAdeptness.g:2005:2: ( ( rule__Bound_Down__EmAssignment_1 ) )
                    // InternalAdeptness.g:2006:3: ( rule__Bound_Down__EmAssignment_1 )
                    {
                     before(grammarAccess.getBound_DownAccess().getEmAssignment_1()); 
                    // InternalAdeptness.g:2007:3: ( rule__Bound_Down__EmAssignment_1 )
                    // InternalAdeptness.g:2007:4: rule__Bound_Down__EmAssignment_1
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
    // InternalAdeptness.g:2015:1: rule__B__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__B__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2019:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalAdeptness.g:2020:2: ( 'true' )
                    {
                    // InternalAdeptness.g:2020:2: ( 'true' )
                    // InternalAdeptness.g:2021:3: 'true'
                    {
                     before(grammarAccess.getBAccess().getTrueKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2026:2: ( 'false' )
                    {
                    // InternalAdeptness.g:2026:2: ( 'false' )
                    // InternalAdeptness.g:2027:3: 'false'
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
    // InternalAdeptness.g:2036:1: rule__TimeType__Alternatives : ( ( ( rule__TimeType__TimeAssignment_0 ) ) | ( ( rule__TimeType__TimeAssignment_1 ) ) | ( ( rule__TimeType__TimeAssignment_2 ) ) | ( ( rule__TimeType__TimeAssignment_3 ) ) );
    public final void rule__TimeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2040:1: ( ( ( rule__TimeType__TimeAssignment_0 ) ) | ( ( rule__TimeType__TimeAssignment_1 ) ) | ( ( rule__TimeType__TimeAssignment_2 ) ) | ( ( rule__TimeType__TimeAssignment_3 ) ) )
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
                    // InternalAdeptness.g:2041:2: ( ( rule__TimeType__TimeAssignment_0 ) )
                    {
                    // InternalAdeptness.g:2041:2: ( ( rule__TimeType__TimeAssignment_0 ) )
                    // InternalAdeptness.g:2042:3: ( rule__TimeType__TimeAssignment_0 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_0()); 
                    // InternalAdeptness.g:2043:3: ( rule__TimeType__TimeAssignment_0 )
                    // InternalAdeptness.g:2043:4: rule__TimeType__TimeAssignment_0
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
                    // InternalAdeptness.g:2047:2: ( ( rule__TimeType__TimeAssignment_1 ) )
                    {
                    // InternalAdeptness.g:2047:2: ( ( rule__TimeType__TimeAssignment_1 ) )
                    // InternalAdeptness.g:2048:3: ( rule__TimeType__TimeAssignment_1 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_1()); 
                    // InternalAdeptness.g:2049:3: ( rule__TimeType__TimeAssignment_1 )
                    // InternalAdeptness.g:2049:4: rule__TimeType__TimeAssignment_1
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
                    // InternalAdeptness.g:2053:2: ( ( rule__TimeType__TimeAssignment_2 ) )
                    {
                    // InternalAdeptness.g:2053:2: ( ( rule__TimeType__TimeAssignment_2 ) )
                    // InternalAdeptness.g:2054:3: ( rule__TimeType__TimeAssignment_2 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_2()); 
                    // InternalAdeptness.g:2055:3: ( rule__TimeType__TimeAssignment_2 )
                    // InternalAdeptness.g:2055:4: rule__TimeType__TimeAssignment_2
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
                    // InternalAdeptness.g:2059:2: ( ( rule__TimeType__TimeAssignment_3 ) )
                    {
                    // InternalAdeptness.g:2059:2: ( ( rule__TimeType__TimeAssignment_3 ) )
                    // InternalAdeptness.g:2060:3: ( rule__TimeType__TimeAssignment_3 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_3()); 
                    // InternalAdeptness.g:2061:3: ( rule__TimeType__TimeAssignment_3 )
                    // InternalAdeptness.g:2061:4: rule__TimeType__TimeAssignment_3
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
    // InternalAdeptness.g:2069:1: rule__AbstractElement2__Alternatives_1 : ( ( ( rule__AbstractElement2__NameAssignment_1_0 ) ) | ( ( rule__AbstractElement2__ValueAssignment_1_1 ) ) );
    public final void rule__AbstractElement2__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2073:1: ( ( ( rule__AbstractElement2__NameAssignment_1_0 ) ) | ( ( rule__AbstractElement2__ValueAssignment_1_1 ) ) )
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
                    // InternalAdeptness.g:2074:2: ( ( rule__AbstractElement2__NameAssignment_1_0 ) )
                    {
                    // InternalAdeptness.g:2074:2: ( ( rule__AbstractElement2__NameAssignment_1_0 ) )
                    // InternalAdeptness.g:2075:3: ( rule__AbstractElement2__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getAbstractElement2Access().getNameAssignment_1_0()); 
                    // InternalAdeptness.g:2076:3: ( rule__AbstractElement2__NameAssignment_1_0 )
                    // InternalAdeptness.g:2076:4: rule__AbstractElement2__NameAssignment_1_0
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
                    // InternalAdeptness.g:2080:2: ( ( rule__AbstractElement2__ValueAssignment_1_1 ) )
                    {
                    // InternalAdeptness.g:2080:2: ( ( rule__AbstractElement2__ValueAssignment_1_1 ) )
                    // InternalAdeptness.g:2081:3: ( rule__AbstractElement2__ValueAssignment_1_1 )
                    {
                     before(grammarAccess.getAbstractElement2Access().getValueAssignment_1_1()); 
                    // InternalAdeptness.g:2082:3: ( rule__AbstractElement2__ValueAssignment_1_1 )
                    // InternalAdeptness.g:2082:4: rule__AbstractElement2__ValueAssignment_1_1
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
    // InternalAdeptness.g:2090:1: rule__Operators__Alternatives : ( ( ( rule__Operators__OperatorAssignment_0 ) ) | ( ( rule__Operators__ComparationAssignment_1 ) ) | ( ( rule__Operators__LogicOperatorAssignment_2 ) ) | ( ( rule__Operators__BackParenthesesAssignment_3 ) ) | ( ( rule__Operators__ElementsAssignment_4 ) ) );
    public final void rule__Operators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2094:1: ( ( ( rule__Operators__OperatorAssignment_0 ) ) | ( ( rule__Operators__ComparationAssignment_1 ) ) | ( ( rule__Operators__LogicOperatorAssignment_2 ) ) | ( ( rule__Operators__BackParenthesesAssignment_3 ) ) | ( ( rule__Operators__ElementsAssignment_4 ) ) )
            int alt25=5;
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
            case 37:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalAdeptness.g:2095:2: ( ( rule__Operators__OperatorAssignment_0 ) )
                    {
                    // InternalAdeptness.g:2095:2: ( ( rule__Operators__OperatorAssignment_0 ) )
                    // InternalAdeptness.g:2096:3: ( rule__Operators__OperatorAssignment_0 )
                    {
                     before(grammarAccess.getOperatorsAccess().getOperatorAssignment_0()); 
                    // InternalAdeptness.g:2097:3: ( rule__Operators__OperatorAssignment_0 )
                    // InternalAdeptness.g:2097:4: rule__Operators__OperatorAssignment_0
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
                    // InternalAdeptness.g:2101:2: ( ( rule__Operators__ComparationAssignment_1 ) )
                    {
                    // InternalAdeptness.g:2101:2: ( ( rule__Operators__ComparationAssignment_1 ) )
                    // InternalAdeptness.g:2102:3: ( rule__Operators__ComparationAssignment_1 )
                    {
                     before(grammarAccess.getOperatorsAccess().getComparationAssignment_1()); 
                    // InternalAdeptness.g:2103:3: ( rule__Operators__ComparationAssignment_1 )
                    // InternalAdeptness.g:2103:4: rule__Operators__ComparationAssignment_1
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
                    // InternalAdeptness.g:2107:2: ( ( rule__Operators__LogicOperatorAssignment_2 ) )
                    {
                    // InternalAdeptness.g:2107:2: ( ( rule__Operators__LogicOperatorAssignment_2 ) )
                    // InternalAdeptness.g:2108:3: ( rule__Operators__LogicOperatorAssignment_2 )
                    {
                     before(grammarAccess.getOperatorsAccess().getLogicOperatorAssignment_2()); 
                    // InternalAdeptness.g:2109:3: ( rule__Operators__LogicOperatorAssignment_2 )
                    // InternalAdeptness.g:2109:4: rule__Operators__LogicOperatorAssignment_2
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
                    // InternalAdeptness.g:2113:2: ( ( rule__Operators__BackParenthesesAssignment_3 ) )
                    {
                    // InternalAdeptness.g:2113:2: ( ( rule__Operators__BackParenthesesAssignment_3 ) )
                    // InternalAdeptness.g:2114:3: ( rule__Operators__BackParenthesesAssignment_3 )
                    {
                     before(grammarAccess.getOperatorsAccess().getBackParenthesesAssignment_3()); 
                    // InternalAdeptness.g:2115:3: ( rule__Operators__BackParenthesesAssignment_3 )
                    // InternalAdeptness.g:2115:4: rule__Operators__BackParenthesesAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operators__BackParenthesesAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorsAccess().getBackParenthesesAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAdeptness.g:2119:2: ( ( rule__Operators__ElementsAssignment_4 ) )
                    {
                    // InternalAdeptness.g:2119:2: ( ( rule__Operators__ElementsAssignment_4 ) )
                    // InternalAdeptness.g:2120:3: ( rule__Operators__ElementsAssignment_4 )
                    {
                     before(grammarAccess.getOperatorsAccess().getElementsAssignment_4()); 
                    // InternalAdeptness.g:2121:3: ( rule__Operators__ElementsAssignment_4 )
                    // InternalAdeptness.g:2121:4: rule__Operators__ElementsAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operators__ElementsAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorsAccess().getElementsAssignment_4()); 

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
    // InternalAdeptness.g:2129:1: rule__CompOp__OpAlternatives_0 : ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '<' ) | ( '>' ) );
    public final void rule__CompOp__OpAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2133:1: ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '<' ) | ( '>' ) )
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
                    // InternalAdeptness.g:2134:2: ( '==' )
                    {
                    // InternalAdeptness.g:2134:2: ( '==' )
                    // InternalAdeptness.g:2135:3: '=='
                    {
                     before(grammarAccess.getCompOpAccess().getOpEqualsSignEqualsSignKeyword_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCompOpAccess().getOpEqualsSignEqualsSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2140:2: ( '!=' )
                    {
                    // InternalAdeptness.g:2140:2: ( '!=' )
                    // InternalAdeptness.g:2141:3: '!='
                    {
                     before(grammarAccess.getCompOpAccess().getOpExclamationMarkEqualsSignKeyword_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getCompOpAccess().getOpExclamationMarkEqualsSignKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:2146:2: ( '>=' )
                    {
                    // InternalAdeptness.g:2146:2: ( '>=' )
                    // InternalAdeptness.g:2147:3: '>='
                    {
                     before(grammarAccess.getCompOpAccess().getOpGreaterThanSignEqualsSignKeyword_0_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getCompOpAccess().getOpGreaterThanSignEqualsSignKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:2152:2: ( '<=' )
                    {
                    // InternalAdeptness.g:2152:2: ( '<=' )
                    // InternalAdeptness.g:2153:3: '<='
                    {
                     before(grammarAccess.getCompOpAccess().getOpLessThanSignEqualsSignKeyword_0_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getCompOpAccess().getOpLessThanSignEqualsSignKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAdeptness.g:2158:2: ( '<' )
                    {
                    // InternalAdeptness.g:2158:2: ( '<' )
                    // InternalAdeptness.g:2159:3: '<'
                    {
                     before(grammarAccess.getCompOpAccess().getOpLessThanSignKeyword_0_4()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getCompOpAccess().getOpLessThanSignKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAdeptness.g:2164:2: ( '>' )
                    {
                    // InternalAdeptness.g:2164:2: ( '>' )
                    // InternalAdeptness.g:2165:3: '>'
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
    // InternalAdeptness.g:2174:1: rule__LogicOp__OpAlternatives_0 : ( ( '&&' ) | ( '||' ) );
    public final void rule__LogicOp__OpAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2178:1: ( ( '&&' ) | ( '||' ) )
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
                    // InternalAdeptness.g:2179:2: ( '&&' )
                    {
                    // InternalAdeptness.g:2179:2: ( '&&' )
                    // InternalAdeptness.g:2180:3: '&&'
                    {
                     before(grammarAccess.getLogicOpAccess().getOpAmpersandAmpersandKeyword_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getLogicOpAccess().getOpAmpersandAmpersandKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2185:2: ( '||' )
                    {
                    // InternalAdeptness.g:2185:2: ( '||' )
                    // InternalAdeptness.g:2186:3: '||'
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
    // InternalAdeptness.g:2195:1: rule__Op__OpAlternatives_0 : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) );
    public final void rule__Op__OpAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2199:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) )
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
                    // InternalAdeptness.g:2200:2: ( '+' )
                    {
                    // InternalAdeptness.g:2200:2: ( '+' )
                    // InternalAdeptness.g:2201:3: '+'
                    {
                     before(grammarAccess.getOpAccess().getOpPlusSignKeyword_0_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getOpPlusSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2206:2: ( '-' )
                    {
                    // InternalAdeptness.g:2206:2: ( '-' )
                    // InternalAdeptness.g:2207:3: '-'
                    {
                     before(grammarAccess.getOpAccess().getOpHyphenMinusKeyword_0_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getOpHyphenMinusKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:2212:2: ( '*' )
                    {
                    // InternalAdeptness.g:2212:2: ( '*' )
                    // InternalAdeptness.g:2213:3: '*'
                    {
                     before(grammarAccess.getOpAccess().getOpAsteriskKeyword_0_2()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getOpAsteriskKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:2218:2: ( '/' )
                    {
                    // InternalAdeptness.g:2218:2: ( '/' )
                    // InternalAdeptness.g:2219:3: '/'
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
    // InternalAdeptness.g:2228:1: rule__Imports__Group__0 : rule__Imports__Group__0__Impl rule__Imports__Group__1 ;
    public final void rule__Imports__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2232:1: ( rule__Imports__Group__0__Impl rule__Imports__Group__1 )
            // InternalAdeptness.g:2233:2: rule__Imports__Group__0__Impl rule__Imports__Group__1
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
    // InternalAdeptness.g:2240:1: rule__Imports__Group__0__Impl : ( 'import' ) ;
    public final void rule__Imports__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2244:1: ( ( 'import' ) )
            // InternalAdeptness.g:2245:1: ( 'import' )
            {
            // InternalAdeptness.g:2245:1: ( 'import' )
            // InternalAdeptness.g:2246:2: 'import'
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
    // InternalAdeptness.g:2255:1: rule__Imports__Group__1 : rule__Imports__Group__1__Impl ;
    public final void rule__Imports__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2259:1: ( rule__Imports__Group__1__Impl )
            // InternalAdeptness.g:2260:2: rule__Imports__Group__1__Impl
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
    // InternalAdeptness.g:2266:1: rule__Imports__Group__1__Impl : ( ( rule__Imports__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Imports__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2270:1: ( ( ( rule__Imports__ImportedNamespaceAssignment_1 ) ) )
            // InternalAdeptness.g:2271:1: ( ( rule__Imports__ImportedNamespaceAssignment_1 ) )
            {
            // InternalAdeptness.g:2271:1: ( ( rule__Imports__ImportedNamespaceAssignment_1 ) )
            // InternalAdeptness.g:2272:2: ( rule__Imports__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportsAccess().getImportedNamespaceAssignment_1()); 
            // InternalAdeptness.g:2273:2: ( rule__Imports__ImportedNamespaceAssignment_1 )
            // InternalAdeptness.g:2273:3: rule__Imports__ImportedNamespaceAssignment_1
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
    // InternalAdeptness.g:2282:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2286:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalAdeptness.g:2287:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalAdeptness.g:2294:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2298:1: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:2299:1: ( ruleQualifiedName )
            {
            // InternalAdeptness.g:2299:1: ( ruleQualifiedName )
            // InternalAdeptness.g:2300:2: ruleQualifiedName
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
    // InternalAdeptness.g:2309:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2313:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalAdeptness.g:2314:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalAdeptness.g:2320:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2324:1: ( ( ( '.*' )? ) )
            // InternalAdeptness.g:2325:1: ( ( '.*' )? )
            {
            // InternalAdeptness.g:2325:1: ( ( '.*' )? )
            // InternalAdeptness.g:2326:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalAdeptness.g:2327:2: ( '.*' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAdeptness.g:2327:3: '.*'
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
    // InternalAdeptness.g:2336:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2340:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAdeptness.g:2341:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalAdeptness.g:2348:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2352:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:2353:1: ( RULE_ID )
            {
            // InternalAdeptness.g:2353:1: ( RULE_ID )
            // InternalAdeptness.g:2354:2: RULE_ID
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
    // InternalAdeptness.g:2363:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2367:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAdeptness.g:2368:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAdeptness.g:2374:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2378:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAdeptness.g:2379:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAdeptness.g:2379:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAdeptness.g:2380:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAdeptness.g:2381:2: ( rule__QualifiedName__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==30) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAdeptness.g:2381:3: rule__QualifiedName__Group_1__0
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
    // InternalAdeptness.g:2390:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2394:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAdeptness.g:2395:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalAdeptness.g:2402:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2406:1: ( ( '.' ) )
            // InternalAdeptness.g:2407:1: ( '.' )
            {
            // InternalAdeptness.g:2407:1: ( '.' )
            // InternalAdeptness.g:2408:2: '.'
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
    // InternalAdeptness.g:2417:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2421:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAdeptness.g:2422:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAdeptness.g:2428:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2432:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:2433:1: ( RULE_ID )
            {
            // InternalAdeptness.g:2433:1: ( RULE_ID )
            // InternalAdeptness.g:2434:2: RULE_ID
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
    // InternalAdeptness.g:2444:1: rule__ValidationPlan__Group__0 : rule__ValidationPlan__Group__0__Impl rule__ValidationPlan__Group__1 ;
    public final void rule__ValidationPlan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2448:1: ( rule__ValidationPlan__Group__0__Impl rule__ValidationPlan__Group__1 )
            // InternalAdeptness.g:2449:2: rule__ValidationPlan__Group__0__Impl rule__ValidationPlan__Group__1
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
    // InternalAdeptness.g:2456:1: rule__ValidationPlan__Group__0__Impl : ( 'VALIDATIONPLAN' ) ;
    public final void rule__ValidationPlan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2460:1: ( ( 'VALIDATIONPLAN' ) )
            // InternalAdeptness.g:2461:1: ( 'VALIDATIONPLAN' )
            {
            // InternalAdeptness.g:2461:1: ( 'VALIDATIONPLAN' )
            // InternalAdeptness.g:2462:2: 'VALIDATIONPLAN'
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
    // InternalAdeptness.g:2471:1: rule__ValidationPlan__Group__1 : rule__ValidationPlan__Group__1__Impl rule__ValidationPlan__Group__2 ;
    public final void rule__ValidationPlan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2475:1: ( rule__ValidationPlan__Group__1__Impl rule__ValidationPlan__Group__2 )
            // InternalAdeptness.g:2476:2: rule__ValidationPlan__Group__1__Impl rule__ValidationPlan__Group__2
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
    // InternalAdeptness.g:2483:1: rule__ValidationPlan__Group__1__Impl : ( ( rule__ValidationPlan__NameAssignment_1 ) ) ;
    public final void rule__ValidationPlan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2487:1: ( ( ( rule__ValidationPlan__NameAssignment_1 ) ) )
            // InternalAdeptness.g:2488:1: ( ( rule__ValidationPlan__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:2488:1: ( ( rule__ValidationPlan__NameAssignment_1 ) )
            // InternalAdeptness.g:2489:2: ( rule__ValidationPlan__NameAssignment_1 )
            {
             before(grammarAccess.getValidationPlanAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:2490:2: ( rule__ValidationPlan__NameAssignment_1 )
            // InternalAdeptness.g:2490:3: rule__ValidationPlan__NameAssignment_1
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
    // InternalAdeptness.g:2498:1: rule__ValidationPlan__Group__2 : rule__ValidationPlan__Group__2__Impl rule__ValidationPlan__Group__3 ;
    public final void rule__ValidationPlan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2502:1: ( rule__ValidationPlan__Group__2__Impl rule__ValidationPlan__Group__3 )
            // InternalAdeptness.g:2503:2: rule__ValidationPlan__Group__2__Impl rule__ValidationPlan__Group__3
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
    // InternalAdeptness.g:2510:1: rule__ValidationPlan__Group__2__Impl : ( ':' ) ;
    public final void rule__ValidationPlan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2514:1: ( ( ':' ) )
            // InternalAdeptness.g:2515:1: ( ':' )
            {
            // InternalAdeptness.g:2515:1: ( ':' )
            // InternalAdeptness.g:2516:2: ':'
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
    // InternalAdeptness.g:2525:1: rule__ValidationPlan__Group__3 : rule__ValidationPlan__Group__3__Impl rule__ValidationPlan__Group__4 ;
    public final void rule__ValidationPlan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2529:1: ( rule__ValidationPlan__Group__3__Impl rule__ValidationPlan__Group__4 )
            // InternalAdeptness.g:2530:2: rule__ValidationPlan__Group__3__Impl rule__ValidationPlan__Group__4
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
    // InternalAdeptness.g:2537:1: rule__ValidationPlan__Group__3__Impl : ( ( rule__ValidationPlan__Group_3__0 )? ) ;
    public final void rule__ValidationPlan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2541:1: ( ( ( rule__ValidationPlan__Group_3__0 )? ) )
            // InternalAdeptness.g:2542:1: ( ( rule__ValidationPlan__Group_3__0 )? )
            {
            // InternalAdeptness.g:2542:1: ( ( rule__ValidationPlan__Group_3__0 )? )
            // InternalAdeptness.g:2543:2: ( rule__ValidationPlan__Group_3__0 )?
            {
             before(grammarAccess.getValidationPlanAccess().getGroup_3()); 
            // InternalAdeptness.g:2544:2: ( rule__ValidationPlan__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAdeptness.g:2544:3: rule__ValidationPlan__Group_3__0
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
    // InternalAdeptness.g:2552:1: rule__ValidationPlan__Group__4 : rule__ValidationPlan__Group__4__Impl rule__ValidationPlan__Group__5 ;
    public final void rule__ValidationPlan__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2556:1: ( rule__ValidationPlan__Group__4__Impl rule__ValidationPlan__Group__5 )
            // InternalAdeptness.g:2557:2: rule__ValidationPlan__Group__4__Impl rule__ValidationPlan__Group__5
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
    // InternalAdeptness.g:2564:1: rule__ValidationPlan__Group__4__Impl : ( ( ( rule__ValidationPlan__TestAssignment_4 ) ) ( ( rule__ValidationPlan__TestAssignment_4 )* ) ) ;
    public final void rule__ValidationPlan__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2568:1: ( ( ( ( rule__ValidationPlan__TestAssignment_4 ) ) ( ( rule__ValidationPlan__TestAssignment_4 )* ) ) )
            // InternalAdeptness.g:2569:1: ( ( ( rule__ValidationPlan__TestAssignment_4 ) ) ( ( rule__ValidationPlan__TestAssignment_4 )* ) )
            {
            // InternalAdeptness.g:2569:1: ( ( ( rule__ValidationPlan__TestAssignment_4 ) ) ( ( rule__ValidationPlan__TestAssignment_4 )* ) )
            // InternalAdeptness.g:2570:2: ( ( rule__ValidationPlan__TestAssignment_4 ) ) ( ( rule__ValidationPlan__TestAssignment_4 )* )
            {
            // InternalAdeptness.g:2570:2: ( ( rule__ValidationPlan__TestAssignment_4 ) )
            // InternalAdeptness.g:2571:3: ( rule__ValidationPlan__TestAssignment_4 )
            {
             before(grammarAccess.getValidationPlanAccess().getTestAssignment_4()); 
            // InternalAdeptness.g:2572:3: ( rule__ValidationPlan__TestAssignment_4 )
            // InternalAdeptness.g:2572:4: rule__ValidationPlan__TestAssignment_4
            {
            pushFollow(FOLLOW_12);
            rule__ValidationPlan__TestAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getValidationPlanAccess().getTestAssignment_4()); 

            }

            // InternalAdeptness.g:2575:2: ( ( rule__ValidationPlan__TestAssignment_4 )* )
            // InternalAdeptness.g:2576:3: ( rule__ValidationPlan__TestAssignment_4 )*
            {
             before(grammarAccess.getValidationPlanAccess().getTestAssignment_4()); 
            // InternalAdeptness.g:2577:3: ( rule__ValidationPlan__TestAssignment_4 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==35) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAdeptness.g:2577:4: rule__ValidationPlan__TestAssignment_4
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
    // InternalAdeptness.g:2586:1: rule__ValidationPlan__Group__5 : rule__ValidationPlan__Group__5__Impl ;
    public final void rule__ValidationPlan__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2590:1: ( rule__ValidationPlan__Group__5__Impl )
            // InternalAdeptness.g:2591:2: rule__ValidationPlan__Group__5__Impl
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
    // InternalAdeptness.g:2597:1: rule__ValidationPlan__Group__5__Impl : ( 'ENDVALIDATIONPLAN' ) ;
    public final void rule__ValidationPlan__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2601:1: ( ( 'ENDVALIDATIONPLAN' ) )
            // InternalAdeptness.g:2602:1: ( 'ENDVALIDATIONPLAN' )
            {
            // InternalAdeptness.g:2602:1: ( 'ENDVALIDATIONPLAN' )
            // InternalAdeptness.g:2603:2: 'ENDVALIDATIONPLAN'
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
    // InternalAdeptness.g:2613:1: rule__ValidationPlan__Group_3__0 : rule__ValidationPlan__Group_3__0__Impl rule__ValidationPlan__Group_3__1 ;
    public final void rule__ValidationPlan__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2617:1: ( rule__ValidationPlan__Group_3__0__Impl rule__ValidationPlan__Group_3__1 )
            // InternalAdeptness.g:2618:2: rule__ValidationPlan__Group_3__0__Impl rule__ValidationPlan__Group_3__1
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
    // InternalAdeptness.g:2625:1: rule__ValidationPlan__Group_3__0__Impl : ( 'implements' ) ;
    public final void rule__ValidationPlan__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2629:1: ( ( 'implements' ) )
            // InternalAdeptness.g:2630:1: ( 'implements' )
            {
            // InternalAdeptness.g:2630:1: ( 'implements' )
            // InternalAdeptness.g:2631:2: 'implements'
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
    // InternalAdeptness.g:2640:1: rule__ValidationPlan__Group_3__1 : rule__ValidationPlan__Group_3__1__Impl ;
    public final void rule__ValidationPlan__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2644:1: ( rule__ValidationPlan__Group_3__1__Impl )
            // InternalAdeptness.g:2645:2: rule__ValidationPlan__Group_3__1__Impl
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
    // InternalAdeptness.g:2651:1: rule__ValidationPlan__Group_3__1__Impl : ( ( rule__ValidationPlan__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__ValidationPlan__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2655:1: ( ( ( rule__ValidationPlan__SuperTypeAssignment_3_1 ) ) )
            // InternalAdeptness.g:2656:1: ( ( rule__ValidationPlan__SuperTypeAssignment_3_1 ) )
            {
            // InternalAdeptness.g:2656:1: ( ( rule__ValidationPlan__SuperTypeAssignment_3_1 ) )
            // InternalAdeptness.g:2657:2: ( rule__ValidationPlan__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getValidationPlanAccess().getSuperTypeAssignment_3_1()); 
            // InternalAdeptness.g:2658:2: ( rule__ValidationPlan__SuperTypeAssignment_3_1 )
            // InternalAdeptness.g:2658:3: rule__ValidationPlan__SuperTypeAssignment_3_1
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
    // InternalAdeptness.g:2667:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2671:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalAdeptness.g:2672:2: rule__Test__Group__0__Impl rule__Test__Group__1
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
    // InternalAdeptness.g:2679:1: rule__Test__Group__0__Impl : ( 'TEST' ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2683:1: ( ( 'TEST' ) )
            // InternalAdeptness.g:2684:1: ( 'TEST' )
            {
            // InternalAdeptness.g:2684:1: ( 'TEST' )
            // InternalAdeptness.g:2685:2: 'TEST'
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
    // InternalAdeptness.g:2694:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2698:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalAdeptness.g:2699:2: rule__Test__Group__1__Impl rule__Test__Group__2
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
    // InternalAdeptness.g:2706:1: rule__Test__Group__1__Impl : ( ( rule__Test__NameAssignment_1 ) ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2710:1: ( ( ( rule__Test__NameAssignment_1 ) ) )
            // InternalAdeptness.g:2711:1: ( ( rule__Test__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:2711:1: ( ( rule__Test__NameAssignment_1 ) )
            // InternalAdeptness.g:2712:2: ( rule__Test__NameAssignment_1 )
            {
             before(grammarAccess.getTestAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:2713:2: ( rule__Test__NameAssignment_1 )
            // InternalAdeptness.g:2713:3: rule__Test__NameAssignment_1
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
    // InternalAdeptness.g:2721:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2725:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalAdeptness.g:2726:2: rule__Test__Group__2__Impl rule__Test__Group__3
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
    // InternalAdeptness.g:2733:1: rule__Test__Group__2__Impl : ( ':' ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2737:1: ( ( ':' ) )
            // InternalAdeptness.g:2738:1: ( ':' )
            {
            // InternalAdeptness.g:2738:1: ( ':' )
            // InternalAdeptness.g:2739:2: ':'
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
    // InternalAdeptness.g:2748:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2752:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // InternalAdeptness.g:2753:2: rule__Test__Group__3__Impl rule__Test__Group__4
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
    // InternalAdeptness.g:2760:1: rule__Test__Group__3__Impl : ( 'SUT:' ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2764:1: ( ( 'SUT:' ) )
            // InternalAdeptness.g:2765:1: ( 'SUT:' )
            {
            // InternalAdeptness.g:2765:1: ( 'SUT:' )
            // InternalAdeptness.g:2766:2: 'SUT:'
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
    // InternalAdeptness.g:2775:1: rule__Test__Group__4 : rule__Test__Group__4__Impl rule__Test__Group__5 ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2779:1: ( rule__Test__Group__4__Impl rule__Test__Group__5 )
            // InternalAdeptness.g:2780:2: rule__Test__Group__4__Impl rule__Test__Group__5
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
    // InternalAdeptness.g:2787:1: rule__Test__Group__4__Impl : ( ( rule__Test__SutAssignment_4 ) ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2791:1: ( ( ( rule__Test__SutAssignment_4 ) ) )
            // InternalAdeptness.g:2792:1: ( ( rule__Test__SutAssignment_4 ) )
            {
            // InternalAdeptness.g:2792:1: ( ( rule__Test__SutAssignment_4 ) )
            // InternalAdeptness.g:2793:2: ( rule__Test__SutAssignment_4 )
            {
             before(grammarAccess.getTestAccess().getSutAssignment_4()); 
            // InternalAdeptness.g:2794:2: ( rule__Test__SutAssignment_4 )
            // InternalAdeptness.g:2794:3: rule__Test__SutAssignment_4
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
    // InternalAdeptness.g:2802:1: rule__Test__Group__5 : rule__Test__Group__5__Impl rule__Test__Group__6 ;
    public final void rule__Test__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2806:1: ( rule__Test__Group__5__Impl rule__Test__Group__6 )
            // InternalAdeptness.g:2807:2: rule__Test__Group__5__Impl rule__Test__Group__6
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
    // InternalAdeptness.g:2814:1: rule__Test__Group__5__Impl : ( ',' ) ;
    public final void rule__Test__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2818:1: ( ( ',' ) )
            // InternalAdeptness.g:2819:1: ( ',' )
            {
            // InternalAdeptness.g:2819:1: ( ',' )
            // InternalAdeptness.g:2820:2: ','
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
    // InternalAdeptness.g:2829:1: rule__Test__Group__6 : rule__Test__Group__6__Impl rule__Test__Group__7 ;
    public final void rule__Test__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2833:1: ( rule__Test__Group__6__Impl rule__Test__Group__7 )
            // InternalAdeptness.g:2834:2: rule__Test__Group__6__Impl rule__Test__Group__7
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
    // InternalAdeptness.g:2841:1: rule__Test__Group__6__Impl : ( 'TestLevel:' ) ;
    public final void rule__Test__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2845:1: ( ( 'TestLevel:' ) )
            // InternalAdeptness.g:2846:1: ( 'TestLevel:' )
            {
            // InternalAdeptness.g:2846:1: ( 'TestLevel:' )
            // InternalAdeptness.g:2847:2: 'TestLevel:'
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
    // InternalAdeptness.g:2856:1: rule__Test__Group__7 : rule__Test__Group__7__Impl rule__Test__Group__8 ;
    public final void rule__Test__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2860:1: ( rule__Test__Group__7__Impl rule__Test__Group__8 )
            // InternalAdeptness.g:2861:2: rule__Test__Group__7__Impl rule__Test__Group__8
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
    // InternalAdeptness.g:2868:1: rule__Test__Group__7__Impl : ( ( rule__Test__TestLevelAssignment_7 ) ) ;
    public final void rule__Test__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2872:1: ( ( ( rule__Test__TestLevelAssignment_7 ) ) )
            // InternalAdeptness.g:2873:1: ( ( rule__Test__TestLevelAssignment_7 ) )
            {
            // InternalAdeptness.g:2873:1: ( ( rule__Test__TestLevelAssignment_7 ) )
            // InternalAdeptness.g:2874:2: ( rule__Test__TestLevelAssignment_7 )
            {
             before(grammarAccess.getTestAccess().getTestLevelAssignment_7()); 
            // InternalAdeptness.g:2875:2: ( rule__Test__TestLevelAssignment_7 )
            // InternalAdeptness.g:2875:3: rule__Test__TestLevelAssignment_7
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
    // InternalAdeptness.g:2883:1: rule__Test__Group__8 : rule__Test__Group__8__Impl rule__Test__Group__9 ;
    public final void rule__Test__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2887:1: ( rule__Test__Group__8__Impl rule__Test__Group__9 )
            // InternalAdeptness.g:2888:2: rule__Test__Group__8__Impl rule__Test__Group__9
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
    // InternalAdeptness.g:2895:1: rule__Test__Group__8__Impl : ( ',' ) ;
    public final void rule__Test__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2899:1: ( ( ',' ) )
            // InternalAdeptness.g:2900:1: ( ',' )
            {
            // InternalAdeptness.g:2900:1: ( ',' )
            // InternalAdeptness.g:2901:2: ','
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
    // InternalAdeptness.g:2910:1: rule__Test__Group__9 : rule__Test__Group__9__Impl rule__Test__Group__10 ;
    public final void rule__Test__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2914:1: ( rule__Test__Group__9__Impl rule__Test__Group__10 )
            // InternalAdeptness.g:2915:2: rule__Test__Group__9__Impl rule__Test__Group__10
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
    // InternalAdeptness.g:2922:1: rule__Test__Group__9__Impl : ( 'Inputs:' ) ;
    public final void rule__Test__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2926:1: ( ( 'Inputs:' ) )
            // InternalAdeptness.g:2927:1: ( 'Inputs:' )
            {
            // InternalAdeptness.g:2927:1: ( 'Inputs:' )
            // InternalAdeptness.g:2928:2: 'Inputs:'
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
    // InternalAdeptness.g:2937:1: rule__Test__Group__10 : rule__Test__Group__10__Impl rule__Test__Group__11 ;
    public final void rule__Test__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2941:1: ( rule__Test__Group__10__Impl rule__Test__Group__11 )
            // InternalAdeptness.g:2942:2: rule__Test__Group__10__Impl rule__Test__Group__11
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
    // InternalAdeptness.g:2949:1: rule__Test__Group__10__Impl : ( ( ( rule__Test__InputsAssignment_10 ) ) ( ( rule__Test__InputsAssignment_10 )* ) ) ;
    public final void rule__Test__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2953:1: ( ( ( ( rule__Test__InputsAssignment_10 ) ) ( ( rule__Test__InputsAssignment_10 )* ) ) )
            // InternalAdeptness.g:2954:1: ( ( ( rule__Test__InputsAssignment_10 ) ) ( ( rule__Test__InputsAssignment_10 )* ) )
            {
            // InternalAdeptness.g:2954:1: ( ( ( rule__Test__InputsAssignment_10 ) ) ( ( rule__Test__InputsAssignment_10 )* ) )
            // InternalAdeptness.g:2955:2: ( ( rule__Test__InputsAssignment_10 ) ) ( ( rule__Test__InputsAssignment_10 )* )
            {
            // InternalAdeptness.g:2955:2: ( ( rule__Test__InputsAssignment_10 ) )
            // InternalAdeptness.g:2956:3: ( rule__Test__InputsAssignment_10 )
            {
             before(grammarAccess.getTestAccess().getInputsAssignment_10()); 
            // InternalAdeptness.g:2957:3: ( rule__Test__InputsAssignment_10 )
            // InternalAdeptness.g:2957:4: rule__Test__InputsAssignment_10
            {
            pushFollow(FOLLOW_19);
            rule__Test__InputsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getInputsAssignment_10()); 

            }

            // InternalAdeptness.g:2960:2: ( ( rule__Test__InputsAssignment_10 )* )
            // InternalAdeptness.g:2961:3: ( rule__Test__InputsAssignment_10 )*
            {
             before(grammarAccess.getTestAccess().getInputsAssignment_10()); 
            // InternalAdeptness.g:2962:3: ( rule__Test__InputsAssignment_10 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_STRING) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAdeptness.g:2962:4: rule__Test__InputsAssignment_10
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
    // InternalAdeptness.g:2971:1: rule__Test__Group__11 : rule__Test__Group__11__Impl rule__Test__Group__12 ;
    public final void rule__Test__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2975:1: ( rule__Test__Group__11__Impl rule__Test__Group__12 )
            // InternalAdeptness.g:2976:2: rule__Test__Group__11__Impl rule__Test__Group__12
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
    // InternalAdeptness.g:2983:1: rule__Test__Group__11__Impl : ( ( ( rule__Test__OraclesAssignment_11 ) ) ( ( rule__Test__OraclesAssignment_11 )* ) ) ;
    public final void rule__Test__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2987:1: ( ( ( ( rule__Test__OraclesAssignment_11 ) ) ( ( rule__Test__OraclesAssignment_11 )* ) ) )
            // InternalAdeptness.g:2988:1: ( ( ( rule__Test__OraclesAssignment_11 ) ) ( ( rule__Test__OraclesAssignment_11 )* ) )
            {
            // InternalAdeptness.g:2988:1: ( ( ( rule__Test__OraclesAssignment_11 ) ) ( ( rule__Test__OraclesAssignment_11 )* ) )
            // InternalAdeptness.g:2989:2: ( ( rule__Test__OraclesAssignment_11 ) ) ( ( rule__Test__OraclesAssignment_11 )* )
            {
            // InternalAdeptness.g:2989:2: ( ( rule__Test__OraclesAssignment_11 ) )
            // InternalAdeptness.g:2990:3: ( rule__Test__OraclesAssignment_11 )
            {
             before(grammarAccess.getTestAccess().getOraclesAssignment_11()); 
            // InternalAdeptness.g:2991:3: ( rule__Test__OraclesAssignment_11 )
            // InternalAdeptness.g:2991:4: rule__Test__OraclesAssignment_11
            {
            pushFollow(FOLLOW_21);
            rule__Test__OraclesAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getOraclesAssignment_11()); 

            }

            // InternalAdeptness.g:2994:2: ( ( rule__Test__OraclesAssignment_11 )* )
            // InternalAdeptness.g:2995:3: ( rule__Test__OraclesAssignment_11 )*
            {
             before(grammarAccess.getTestAccess().getOraclesAssignment_11()); 
            // InternalAdeptness.g:2996:3: ( rule__Test__OraclesAssignment_11 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==41) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalAdeptness.g:2996:4: rule__Test__OraclesAssignment_11
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
    // InternalAdeptness.g:3005:1: rule__Test__Group__12 : rule__Test__Group__12__Impl ;
    public final void rule__Test__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3009:1: ( rule__Test__Group__12__Impl )
            // InternalAdeptness.g:3010:2: rule__Test__Group__12__Impl
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
    // InternalAdeptness.g:3016:1: rule__Test__Group__12__Impl : ( 'ENDTEST' ) ;
    public final void rule__Test__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3020:1: ( ( 'ENDTEST' ) )
            // InternalAdeptness.g:3021:1: ( 'ENDTEST' )
            {
            // InternalAdeptness.g:3021:1: ( 'ENDTEST' )
            // InternalAdeptness.g:3022:2: 'ENDTEST'
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
    // InternalAdeptness.g:3032:1: rule__TestingOracle__Group__0 : rule__TestingOracle__Group__0__Impl rule__TestingOracle__Group__1 ;
    public final void rule__TestingOracle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3036:1: ( rule__TestingOracle__Group__0__Impl rule__TestingOracle__Group__1 )
            // InternalAdeptness.g:3037:2: rule__TestingOracle__Group__0__Impl rule__TestingOracle__Group__1
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
    // InternalAdeptness.g:3044:1: rule__TestingOracle__Group__0__Impl : ( 'TESTINGORACLE' ) ;
    public final void rule__TestingOracle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3048:1: ( ( 'TESTINGORACLE' ) )
            // InternalAdeptness.g:3049:1: ( 'TESTINGORACLE' )
            {
            // InternalAdeptness.g:3049:1: ( 'TESTINGORACLE' )
            // InternalAdeptness.g:3050:2: 'TESTINGORACLE'
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
    // InternalAdeptness.g:3059:1: rule__TestingOracle__Group__1 : rule__TestingOracle__Group__1__Impl rule__TestingOracle__Group__2 ;
    public final void rule__TestingOracle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3063:1: ( rule__TestingOracle__Group__1__Impl rule__TestingOracle__Group__2 )
            // InternalAdeptness.g:3064:2: rule__TestingOracle__Group__1__Impl rule__TestingOracle__Group__2
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
    // InternalAdeptness.g:3071:1: rule__TestingOracle__Group__1__Impl : ( ( rule__TestingOracle__NameAssignment_1 ) ) ;
    public final void rule__TestingOracle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3075:1: ( ( ( rule__TestingOracle__NameAssignment_1 ) ) )
            // InternalAdeptness.g:3076:1: ( ( rule__TestingOracle__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:3076:1: ( ( rule__TestingOracle__NameAssignment_1 ) )
            // InternalAdeptness.g:3077:2: ( rule__TestingOracle__NameAssignment_1 )
            {
             before(grammarAccess.getTestingOracleAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:3078:2: ( rule__TestingOracle__NameAssignment_1 )
            // InternalAdeptness.g:3078:3: rule__TestingOracle__NameAssignment_1
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
    // InternalAdeptness.g:3086:1: rule__TestingOracle__Group__2 : rule__TestingOracle__Group__2__Impl rule__TestingOracle__Group__3 ;
    public final void rule__TestingOracle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3090:1: ( rule__TestingOracle__Group__2__Impl rule__TestingOracle__Group__3 )
            // InternalAdeptness.g:3091:2: rule__TestingOracle__Group__2__Impl rule__TestingOracle__Group__3
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
    // InternalAdeptness.g:3098:1: rule__TestingOracle__Group__2__Impl : ( ':' ) ;
    public final void rule__TestingOracle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3102:1: ( ( ':' ) )
            // InternalAdeptness.g:3103:1: ( ':' )
            {
            // InternalAdeptness.g:3103:1: ( ':' )
            // InternalAdeptness.g:3104:2: ':'
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
    // InternalAdeptness.g:3113:1: rule__TestingOracle__Group__3 : rule__TestingOracle__Group__3__Impl rule__TestingOracle__Group__4 ;
    public final void rule__TestingOracle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3117:1: ( rule__TestingOracle__Group__3__Impl rule__TestingOracle__Group__4 )
            // InternalAdeptness.g:3118:2: rule__TestingOracle__Group__3__Impl rule__TestingOracle__Group__4
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
    // InternalAdeptness.g:3125:1: rule__TestingOracle__Group__3__Impl : ( 'Type:' ) ;
    public final void rule__TestingOracle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3129:1: ( ( 'Type:' ) )
            // InternalAdeptness.g:3130:1: ( 'Type:' )
            {
            // InternalAdeptness.g:3130:1: ( 'Type:' )
            // InternalAdeptness.g:3131:2: 'Type:'
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
    // InternalAdeptness.g:3140:1: rule__TestingOracle__Group__4 : rule__TestingOracle__Group__4__Impl rule__TestingOracle__Group__5 ;
    public final void rule__TestingOracle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3144:1: ( rule__TestingOracle__Group__4__Impl rule__TestingOracle__Group__5 )
            // InternalAdeptness.g:3145:2: rule__TestingOracle__Group__4__Impl rule__TestingOracle__Group__5
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
    // InternalAdeptness.g:3152:1: rule__TestingOracle__Group__4__Impl : ( ( rule__TestingOracle__TypeAssignment_4 ) ) ;
    public final void rule__TestingOracle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3156:1: ( ( ( rule__TestingOracle__TypeAssignment_4 ) ) )
            // InternalAdeptness.g:3157:1: ( ( rule__TestingOracle__TypeAssignment_4 ) )
            {
            // InternalAdeptness.g:3157:1: ( ( rule__TestingOracle__TypeAssignment_4 ) )
            // InternalAdeptness.g:3158:2: ( rule__TestingOracle__TypeAssignment_4 )
            {
             before(grammarAccess.getTestingOracleAccess().getTypeAssignment_4()); 
            // InternalAdeptness.g:3159:2: ( rule__TestingOracle__TypeAssignment_4 )
            // InternalAdeptness.g:3159:3: rule__TestingOracle__TypeAssignment_4
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
    // InternalAdeptness.g:3167:1: rule__TestingOracle__Group__5 : rule__TestingOracle__Group__5__Impl rule__TestingOracle__Group__6 ;
    public final void rule__TestingOracle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3171:1: ( rule__TestingOracle__Group__5__Impl rule__TestingOracle__Group__6 )
            // InternalAdeptness.g:3172:2: rule__TestingOracle__Group__5__Impl rule__TestingOracle__Group__6
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
    // InternalAdeptness.g:3179:1: rule__TestingOracle__Group__5__Impl : ( ',' ) ;
    public final void rule__TestingOracle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3183:1: ( ( ',' ) )
            // InternalAdeptness.g:3184:1: ( ',' )
            {
            // InternalAdeptness.g:3184:1: ( ',' )
            // InternalAdeptness.g:3185:2: ','
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
    // InternalAdeptness.g:3194:1: rule__TestingOracle__Group__6 : rule__TestingOracle__Group__6__Impl rule__TestingOracle__Group__7 ;
    public final void rule__TestingOracle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3198:1: ( rule__TestingOracle__Group__6__Impl rule__TestingOracle__Group__7 )
            // InternalAdeptness.g:3199:2: rule__TestingOracle__Group__6__Impl rule__TestingOracle__Group__7
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
    // InternalAdeptness.g:3206:1: rule__TestingOracle__Group__6__Impl : ( 'Params:' ) ;
    public final void rule__TestingOracle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3210:1: ( ( 'Params:' ) )
            // InternalAdeptness.g:3211:1: ( 'Params:' )
            {
            // InternalAdeptness.g:3211:1: ( 'Params:' )
            // InternalAdeptness.g:3212:2: 'Params:'
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
    // InternalAdeptness.g:3221:1: rule__TestingOracle__Group__7 : rule__TestingOracle__Group__7__Impl rule__TestingOracle__Group__8 ;
    public final void rule__TestingOracle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3225:1: ( rule__TestingOracle__Group__7__Impl rule__TestingOracle__Group__8 )
            // InternalAdeptness.g:3226:2: rule__TestingOracle__Group__7__Impl rule__TestingOracle__Group__8
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
    // InternalAdeptness.g:3233:1: rule__TestingOracle__Group__7__Impl : ( ( ( rule__TestingOracle__ParametersAssignment_7 ) ) ( ( rule__TestingOracle__ParametersAssignment_7 )* ) ) ;
    public final void rule__TestingOracle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3237:1: ( ( ( ( rule__TestingOracle__ParametersAssignment_7 ) ) ( ( rule__TestingOracle__ParametersAssignment_7 )* ) ) )
            // InternalAdeptness.g:3238:1: ( ( ( rule__TestingOracle__ParametersAssignment_7 ) ) ( ( rule__TestingOracle__ParametersAssignment_7 )* ) )
            {
            // InternalAdeptness.g:3238:1: ( ( ( rule__TestingOracle__ParametersAssignment_7 ) ) ( ( rule__TestingOracle__ParametersAssignment_7 )* ) )
            // InternalAdeptness.g:3239:2: ( ( rule__TestingOracle__ParametersAssignment_7 ) ) ( ( rule__TestingOracle__ParametersAssignment_7 )* )
            {
            // InternalAdeptness.g:3239:2: ( ( rule__TestingOracle__ParametersAssignment_7 ) )
            // InternalAdeptness.g:3240:3: ( rule__TestingOracle__ParametersAssignment_7 )
            {
             before(grammarAccess.getTestingOracleAccess().getParametersAssignment_7()); 
            // InternalAdeptness.g:3241:3: ( rule__TestingOracle__ParametersAssignment_7 )
            // InternalAdeptness.g:3241:4: rule__TestingOracle__ParametersAssignment_7
            {
            pushFollow(FOLLOW_4);
            rule__TestingOracle__ParametersAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTestingOracleAccess().getParametersAssignment_7()); 

            }

            // InternalAdeptness.g:3244:2: ( ( rule__TestingOracle__ParametersAssignment_7 )* )
            // InternalAdeptness.g:3245:3: ( rule__TestingOracle__ParametersAssignment_7 )*
            {
             before(grammarAccess.getTestingOracleAccess().getParametersAssignment_7()); 
            // InternalAdeptness.g:3246:3: ( rule__TestingOracle__ParametersAssignment_7 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==EOF||(LA35_0>=RULE_ID && LA35_0<=RULE_INT)||LA35_0==11||LA35_0==25||LA35_0==37||(LA35_0>=60 && LA35_0<=62)||LA35_0==65||(LA35_0>=71 && LA35_0<=78)||(LA35_0>=80 && LA35_0<=81)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAdeptness.g:3246:4: rule__TestingOracle__ParametersAssignment_7
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
    // InternalAdeptness.g:3255:1: rule__TestingOracle__Group__8 : rule__TestingOracle__Group__8__Impl ;
    public final void rule__TestingOracle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3259:1: ( rule__TestingOracle__Group__8__Impl )
            // InternalAdeptness.g:3260:2: rule__TestingOracle__Group__8__Impl
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
    // InternalAdeptness.g:3266:1: rule__TestingOracle__Group__8__Impl : ( 'ENDTESTINGORACLE' ) ;
    public final void rule__TestingOracle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3270:1: ( ( 'ENDTESTINGORACLE' ) )
            // InternalAdeptness.g:3271:1: ( 'ENDTESTINGORACLE' )
            {
            // InternalAdeptness.g:3271:1: ( 'ENDTESTINGORACLE' )
            // InternalAdeptness.g:3272:2: 'ENDTESTINGORACLE'
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
    // InternalAdeptness.g:3282:1: rule__Parameters__Group__0 : rule__Parameters__Group__0__Impl rule__Parameters__Group__1 ;
    public final void rule__Parameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3286:1: ( rule__Parameters__Group__0__Impl rule__Parameters__Group__1 )
            // InternalAdeptness.g:3287:2: rule__Parameters__Group__0__Impl rule__Parameters__Group__1
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
    // InternalAdeptness.g:3294:1: rule__Parameters__Group__0__Impl : ( ( rule__Parameters__ValueAssignment_0 ) ) ;
    public final void rule__Parameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3298:1: ( ( ( rule__Parameters__ValueAssignment_0 ) ) )
            // InternalAdeptness.g:3299:1: ( ( rule__Parameters__ValueAssignment_0 ) )
            {
            // InternalAdeptness.g:3299:1: ( ( rule__Parameters__ValueAssignment_0 ) )
            // InternalAdeptness.g:3300:2: ( rule__Parameters__ValueAssignment_0 )
            {
             before(grammarAccess.getParametersAccess().getValueAssignment_0()); 
            // InternalAdeptness.g:3301:2: ( rule__Parameters__ValueAssignment_0 )
            // InternalAdeptness.g:3301:3: rule__Parameters__ValueAssignment_0
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
    // InternalAdeptness.g:3309:1: rule__Parameters__Group__1 : rule__Parameters__Group__1__Impl ;
    public final void rule__Parameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3313:1: ( rule__Parameters__Group__1__Impl )
            // InternalAdeptness.g:3314:2: rule__Parameters__Group__1__Impl
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
    // InternalAdeptness.g:3320:1: rule__Parameters__Group__1__Impl : ( ',' ) ;
    public final void rule__Parameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3324:1: ( ( ',' ) )
            // InternalAdeptness.g:3325:1: ( ',' )
            {
            // InternalAdeptness.g:3325:1: ( ',' )
            // InternalAdeptness.g:3326:2: ','
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
    // InternalAdeptness.g:3336:1: rule__Inputs__Group__0 : rule__Inputs__Group__0__Impl rule__Inputs__Group__1 ;
    public final void rule__Inputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3340:1: ( rule__Inputs__Group__0__Impl rule__Inputs__Group__1 )
            // InternalAdeptness.g:3341:2: rule__Inputs__Group__0__Impl rule__Inputs__Group__1
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
    // InternalAdeptness.g:3348:1: rule__Inputs__Group__0__Impl : ( ( rule__Inputs__ValueAssignment_0 ) ) ;
    public final void rule__Inputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3352:1: ( ( ( rule__Inputs__ValueAssignment_0 ) ) )
            // InternalAdeptness.g:3353:1: ( ( rule__Inputs__ValueAssignment_0 ) )
            {
            // InternalAdeptness.g:3353:1: ( ( rule__Inputs__ValueAssignment_0 ) )
            // InternalAdeptness.g:3354:2: ( rule__Inputs__ValueAssignment_0 )
            {
             before(grammarAccess.getInputsAccess().getValueAssignment_0()); 
            // InternalAdeptness.g:3355:2: ( rule__Inputs__ValueAssignment_0 )
            // InternalAdeptness.g:3355:3: rule__Inputs__ValueAssignment_0
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
    // InternalAdeptness.g:3363:1: rule__Inputs__Group__1 : rule__Inputs__Group__1__Impl ;
    public final void rule__Inputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3367:1: ( rule__Inputs__Group__1__Impl )
            // InternalAdeptness.g:3368:2: rule__Inputs__Group__1__Impl
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
    // InternalAdeptness.g:3374:1: rule__Inputs__Group__1__Impl : ( ',' ) ;
    public final void rule__Inputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3378:1: ( ( ',' ) )
            // InternalAdeptness.g:3379:1: ( ',' )
            {
            // InternalAdeptness.g:3379:1: ( ',' )
            // InternalAdeptness.g:3380:2: ','
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
    // InternalAdeptness.g:3390:1: rule__MonitoringFile__Group__0 : rule__MonitoringFile__Group__0__Impl rule__MonitoringFile__Group__1 ;
    public final void rule__MonitoringFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3394:1: ( rule__MonitoringFile__Group__0__Impl rule__MonitoringFile__Group__1 )
            // InternalAdeptness.g:3395:2: rule__MonitoringFile__Group__0__Impl rule__MonitoringFile__Group__1
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
    // InternalAdeptness.g:3402:1: rule__MonitoringFile__Group__0__Impl : ( 'MONITORINGPLAN' ) ;
    public final void rule__MonitoringFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3406:1: ( ( 'MONITORINGPLAN' ) )
            // InternalAdeptness.g:3407:1: ( 'MONITORINGPLAN' )
            {
            // InternalAdeptness.g:3407:1: ( 'MONITORINGPLAN' )
            // InternalAdeptness.g:3408:2: 'MONITORINGPLAN'
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
    // InternalAdeptness.g:3417:1: rule__MonitoringFile__Group__1 : rule__MonitoringFile__Group__1__Impl rule__MonitoringFile__Group__2 ;
    public final void rule__MonitoringFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3421:1: ( rule__MonitoringFile__Group__1__Impl rule__MonitoringFile__Group__2 )
            // InternalAdeptness.g:3422:2: rule__MonitoringFile__Group__1__Impl rule__MonitoringFile__Group__2
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
    // InternalAdeptness.g:3429:1: rule__MonitoringFile__Group__1__Impl : ( ( rule__MonitoringFile__NameAssignment_1 ) ) ;
    public final void rule__MonitoringFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3433:1: ( ( ( rule__MonitoringFile__NameAssignment_1 ) ) )
            // InternalAdeptness.g:3434:1: ( ( rule__MonitoringFile__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:3434:1: ( ( rule__MonitoringFile__NameAssignment_1 ) )
            // InternalAdeptness.g:3435:2: ( rule__MonitoringFile__NameAssignment_1 )
            {
             before(grammarAccess.getMonitoringFileAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:3436:2: ( rule__MonitoringFile__NameAssignment_1 )
            // InternalAdeptness.g:3436:3: rule__MonitoringFile__NameAssignment_1
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
    // InternalAdeptness.g:3444:1: rule__MonitoringFile__Group__2 : rule__MonitoringFile__Group__2__Impl rule__MonitoringFile__Group__3 ;
    public final void rule__MonitoringFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3448:1: ( rule__MonitoringFile__Group__2__Impl rule__MonitoringFile__Group__3 )
            // InternalAdeptness.g:3449:2: rule__MonitoringFile__Group__2__Impl rule__MonitoringFile__Group__3
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
    // InternalAdeptness.g:3456:1: rule__MonitoringFile__Group__2__Impl : ( ':' ) ;
    public final void rule__MonitoringFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3460:1: ( ( ':' ) )
            // InternalAdeptness.g:3461:1: ( ':' )
            {
            // InternalAdeptness.g:3461:1: ( ':' )
            // InternalAdeptness.g:3462:2: ':'
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
    // InternalAdeptness.g:3471:1: rule__MonitoringFile__Group__3 : rule__MonitoringFile__Group__3__Impl rule__MonitoringFile__Group__4 ;
    public final void rule__MonitoringFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3475:1: ( rule__MonitoringFile__Group__3__Impl rule__MonitoringFile__Group__4 )
            // InternalAdeptness.g:3476:2: rule__MonitoringFile__Group__3__Impl rule__MonitoringFile__Group__4
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
    // InternalAdeptness.g:3483:1: rule__MonitoringFile__Group__3__Impl : ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) ) ;
    public final void rule__MonitoringFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3487:1: ( ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) ) )
            // InternalAdeptness.g:3488:1: ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) )
            {
            // InternalAdeptness.g:3488:1: ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) )
            // InternalAdeptness.g:3489:2: ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* )
            {
            // InternalAdeptness.g:3489:2: ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) )
            // InternalAdeptness.g:3490:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )
            {
             before(grammarAccess.getMonitoringFileAccess().getMonitoringPlanAssignment_3()); 
            // InternalAdeptness.g:3491:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )
            // InternalAdeptness.g:3491:4: rule__MonitoringFile__MonitoringPlanAssignment_3
            {
            pushFollow(FOLLOW_28);
            rule__MonitoringFile__MonitoringPlanAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMonitoringFileAccess().getMonitoringPlanAssignment_3()); 

            }

            // InternalAdeptness.g:3494:2: ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* )
            // InternalAdeptness.g:3495:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )*
            {
             before(grammarAccess.getMonitoringFileAccess().getMonitoringPlanAssignment_3()); 
            // InternalAdeptness.g:3496:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==47) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAdeptness.g:3496:4: rule__MonitoringFile__MonitoringPlanAssignment_3
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
    // InternalAdeptness.g:3505:1: rule__MonitoringFile__Group__4 : rule__MonitoringFile__Group__4__Impl ;
    public final void rule__MonitoringFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3509:1: ( rule__MonitoringFile__Group__4__Impl )
            // InternalAdeptness.g:3510:2: rule__MonitoringFile__Group__4__Impl
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
    // InternalAdeptness.g:3516:1: rule__MonitoringFile__Group__4__Impl : ( 'ENDMONITORINGPLAN' ) ;
    public final void rule__MonitoringFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3520:1: ( ( 'ENDMONITORINGPLAN' ) )
            // InternalAdeptness.g:3521:1: ( 'ENDMONITORINGPLAN' )
            {
            // InternalAdeptness.g:3521:1: ( 'ENDMONITORINGPLAN' )
            // InternalAdeptness.g:3522:2: 'ENDMONITORINGPLAN'
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
    // InternalAdeptness.g:3532:1: rule__MonitoringVariable__Group__0 : rule__MonitoringVariable__Group__0__Impl rule__MonitoringVariable__Group__1 ;
    public final void rule__MonitoringVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3536:1: ( rule__MonitoringVariable__Group__0__Impl rule__MonitoringVariable__Group__1 )
            // InternalAdeptness.g:3537:2: rule__MonitoringVariable__Group__0__Impl rule__MonitoringVariable__Group__1
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
    // InternalAdeptness.g:3544:1: rule__MonitoringVariable__Group__0__Impl : ( 'MONITOR' ) ;
    public final void rule__MonitoringVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3548:1: ( ( 'MONITOR' ) )
            // InternalAdeptness.g:3549:1: ( 'MONITOR' )
            {
            // InternalAdeptness.g:3549:1: ( 'MONITOR' )
            // InternalAdeptness.g:3550:2: 'MONITOR'
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
    // InternalAdeptness.g:3559:1: rule__MonitoringVariable__Group__1 : rule__MonitoringVariable__Group__1__Impl rule__MonitoringVariable__Group__2 ;
    public final void rule__MonitoringVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3563:1: ( rule__MonitoringVariable__Group__1__Impl rule__MonitoringVariable__Group__2 )
            // InternalAdeptness.g:3564:2: rule__MonitoringVariable__Group__1__Impl rule__MonitoringVariable__Group__2
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
    // InternalAdeptness.g:3571:1: rule__MonitoringVariable__Group__1__Impl : ( ( rule__MonitoringVariable__NameAssignment_1 ) ) ;
    public final void rule__MonitoringVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3575:1: ( ( ( rule__MonitoringVariable__NameAssignment_1 ) ) )
            // InternalAdeptness.g:3576:1: ( ( rule__MonitoringVariable__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:3576:1: ( ( rule__MonitoringVariable__NameAssignment_1 ) )
            // InternalAdeptness.g:3577:2: ( rule__MonitoringVariable__NameAssignment_1 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:3578:2: ( rule__MonitoringVariable__NameAssignment_1 )
            // InternalAdeptness.g:3578:3: rule__MonitoringVariable__NameAssignment_1
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
    // InternalAdeptness.g:3586:1: rule__MonitoringVariable__Group__2 : rule__MonitoringVariable__Group__2__Impl rule__MonitoringVariable__Group__3 ;
    public final void rule__MonitoringVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3590:1: ( rule__MonitoringVariable__Group__2__Impl rule__MonitoringVariable__Group__3 )
            // InternalAdeptness.g:3591:2: rule__MonitoringVariable__Group__2__Impl rule__MonitoringVariable__Group__3
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
    // InternalAdeptness.g:3598:1: rule__MonitoringVariable__Group__2__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3602:1: ( ( ':' ) )
            // InternalAdeptness.g:3603:1: ( ':' )
            {
            // InternalAdeptness.g:3603:1: ( ':' )
            // InternalAdeptness.g:3604:2: ':'
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
    // InternalAdeptness.g:3613:1: rule__MonitoringVariable__Group__3 : rule__MonitoringVariable__Group__3__Impl rule__MonitoringVariable__Group__4 ;
    public final void rule__MonitoringVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3617:1: ( rule__MonitoringVariable__Group__3__Impl rule__MonitoringVariable__Group__4 )
            // InternalAdeptness.g:3618:2: rule__MonitoringVariable__Group__3__Impl rule__MonitoringVariable__Group__4
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
    // InternalAdeptness.g:3625:1: rule__MonitoringVariable__Group__3__Impl : ( 'type' ) ;
    public final void rule__MonitoringVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3629:1: ( ( 'type' ) )
            // InternalAdeptness.g:3630:1: ( 'type' )
            {
            // InternalAdeptness.g:3630:1: ( 'type' )
            // InternalAdeptness.g:3631:2: 'type'
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
    // InternalAdeptness.g:3640:1: rule__MonitoringVariable__Group__4 : rule__MonitoringVariable__Group__4__Impl rule__MonitoringVariable__Group__5 ;
    public final void rule__MonitoringVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3644:1: ( rule__MonitoringVariable__Group__4__Impl rule__MonitoringVariable__Group__5 )
            // InternalAdeptness.g:3645:2: rule__MonitoringVariable__Group__4__Impl rule__MonitoringVariable__Group__5
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
    // InternalAdeptness.g:3652:1: rule__MonitoringVariable__Group__4__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3656:1: ( ( ':' ) )
            // InternalAdeptness.g:3657:1: ( ':' )
            {
            // InternalAdeptness.g:3657:1: ( ':' )
            // InternalAdeptness.g:3658:2: ':'
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
    // InternalAdeptness.g:3667:1: rule__MonitoringVariable__Group__5 : rule__MonitoringVariable__Group__5__Impl rule__MonitoringVariable__Group__6 ;
    public final void rule__MonitoringVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3671:1: ( rule__MonitoringVariable__Group__5__Impl rule__MonitoringVariable__Group__6 )
            // InternalAdeptness.g:3672:2: rule__MonitoringVariable__Group__5__Impl rule__MonitoringVariable__Group__6
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
    // InternalAdeptness.g:3679:1: rule__MonitoringVariable__Group__5__Impl : ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) ) ;
    public final void rule__MonitoringVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3683:1: ( ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) ) )
            // InternalAdeptness.g:3684:1: ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) )
            {
            // InternalAdeptness.g:3684:1: ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) )
            // InternalAdeptness.g:3685:2: ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getMonitoringVariableDatatypeAssignment_5()); 
            // InternalAdeptness.g:3686:2: ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 )
            // InternalAdeptness.g:3686:3: rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5
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
    // InternalAdeptness.g:3694:1: rule__MonitoringVariable__Group__6 : rule__MonitoringVariable__Group__6__Impl rule__MonitoringVariable__Group__7 ;
    public final void rule__MonitoringVariable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3698:1: ( rule__MonitoringVariable__Group__6__Impl rule__MonitoringVariable__Group__7 )
            // InternalAdeptness.g:3699:2: rule__MonitoringVariable__Group__6__Impl rule__MonitoringVariable__Group__7
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
    // InternalAdeptness.g:3706:1: rule__MonitoringVariable__Group__6__Impl : ( ( rule__MonitoringVariable__Group_6__0 )? ) ;
    public final void rule__MonitoringVariable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3710:1: ( ( ( rule__MonitoringVariable__Group_6__0 )? ) )
            // InternalAdeptness.g:3711:1: ( ( rule__MonitoringVariable__Group_6__0 )? )
            {
            // InternalAdeptness.g:3711:1: ( ( rule__MonitoringVariable__Group_6__0 )? )
            // InternalAdeptness.g:3712:2: ( rule__MonitoringVariable__Group_6__0 )?
            {
             before(grammarAccess.getMonitoringVariableAccess().getGroup_6()); 
            // InternalAdeptness.g:3713:2: ( rule__MonitoringVariable__Group_6__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==50) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAdeptness.g:3713:3: rule__MonitoringVariable__Group_6__0
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
    // InternalAdeptness.g:3721:1: rule__MonitoringVariable__Group__7 : rule__MonitoringVariable__Group__7__Impl ;
    public final void rule__MonitoringVariable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3725:1: ( rule__MonitoringVariable__Group__7__Impl )
            // InternalAdeptness.g:3726:2: rule__MonitoringVariable__Group__7__Impl
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
    // InternalAdeptness.g:3732:1: rule__MonitoringVariable__Group__7__Impl : ( 'ENDMONITOR' ) ;
    public final void rule__MonitoringVariable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3736:1: ( ( 'ENDMONITOR' ) )
            // InternalAdeptness.g:3737:1: ( 'ENDMONITOR' )
            {
            // InternalAdeptness.g:3737:1: ( 'ENDMONITOR' )
            // InternalAdeptness.g:3738:2: 'ENDMONITOR'
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
    // InternalAdeptness.g:3748:1: rule__MonitoringVariable__Group_6__0 : rule__MonitoringVariable__Group_6__0__Impl rule__MonitoringVariable__Group_6__1 ;
    public final void rule__MonitoringVariable__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3752:1: ( rule__MonitoringVariable__Group_6__0__Impl rule__MonitoringVariable__Group_6__1 )
            // InternalAdeptness.g:3753:2: rule__MonitoringVariable__Group_6__0__Impl rule__MonitoringVariable__Group_6__1
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
    // InternalAdeptness.g:3760:1: rule__MonitoringVariable__Group_6__0__Impl : ( 'max' ) ;
    public final void rule__MonitoringVariable__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3764:1: ( ( 'max' ) )
            // InternalAdeptness.g:3765:1: ( 'max' )
            {
            // InternalAdeptness.g:3765:1: ( 'max' )
            // InternalAdeptness.g:3766:2: 'max'
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
    // InternalAdeptness.g:3775:1: rule__MonitoringVariable__Group_6__1 : rule__MonitoringVariable__Group_6__1__Impl rule__MonitoringVariable__Group_6__2 ;
    public final void rule__MonitoringVariable__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3779:1: ( rule__MonitoringVariable__Group_6__1__Impl rule__MonitoringVariable__Group_6__2 )
            // InternalAdeptness.g:3780:2: rule__MonitoringVariable__Group_6__1__Impl rule__MonitoringVariable__Group_6__2
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
    // InternalAdeptness.g:3787:1: rule__MonitoringVariable__Group_6__1__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3791:1: ( ( ':' ) )
            // InternalAdeptness.g:3792:1: ( ':' )
            {
            // InternalAdeptness.g:3792:1: ( ':' )
            // InternalAdeptness.g:3793:2: ':'
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
    // InternalAdeptness.g:3802:1: rule__MonitoringVariable__Group_6__2 : rule__MonitoringVariable__Group_6__2__Impl rule__MonitoringVariable__Group_6__3 ;
    public final void rule__MonitoringVariable__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3806:1: ( rule__MonitoringVariable__Group_6__2__Impl rule__MonitoringVariable__Group_6__3 )
            // InternalAdeptness.g:3807:2: rule__MonitoringVariable__Group_6__2__Impl rule__MonitoringVariable__Group_6__3
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
    // InternalAdeptness.g:3814:1: rule__MonitoringVariable__Group_6__2__Impl : ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) ) ;
    public final void rule__MonitoringVariable__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3818:1: ( ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) ) )
            // InternalAdeptness.g:3819:1: ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) )
            {
            // InternalAdeptness.g:3819:1: ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) )
            // InternalAdeptness.g:3820:2: ( rule__MonitoringVariable__MaxAssignment_6_2 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getMaxAssignment_6_2()); 
            // InternalAdeptness.g:3821:2: ( rule__MonitoringVariable__MaxAssignment_6_2 )
            // InternalAdeptness.g:3821:3: rule__MonitoringVariable__MaxAssignment_6_2
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
    // InternalAdeptness.g:3829:1: rule__MonitoringVariable__Group_6__3 : rule__MonitoringVariable__Group_6__3__Impl rule__MonitoringVariable__Group_6__4 ;
    public final void rule__MonitoringVariable__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3833:1: ( rule__MonitoringVariable__Group_6__3__Impl rule__MonitoringVariable__Group_6__4 )
            // InternalAdeptness.g:3834:2: rule__MonitoringVariable__Group_6__3__Impl rule__MonitoringVariable__Group_6__4
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
    // InternalAdeptness.g:3841:1: rule__MonitoringVariable__Group_6__3__Impl : ( 'min' ) ;
    public final void rule__MonitoringVariable__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3845:1: ( ( 'min' ) )
            // InternalAdeptness.g:3846:1: ( 'min' )
            {
            // InternalAdeptness.g:3846:1: ( 'min' )
            // InternalAdeptness.g:3847:2: 'min'
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
    // InternalAdeptness.g:3856:1: rule__MonitoringVariable__Group_6__4 : rule__MonitoringVariable__Group_6__4__Impl rule__MonitoringVariable__Group_6__5 ;
    public final void rule__MonitoringVariable__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3860:1: ( rule__MonitoringVariable__Group_6__4__Impl rule__MonitoringVariable__Group_6__5 )
            // InternalAdeptness.g:3861:2: rule__MonitoringVariable__Group_6__4__Impl rule__MonitoringVariable__Group_6__5
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
    // InternalAdeptness.g:3868:1: rule__MonitoringVariable__Group_6__4__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3872:1: ( ( ':' ) )
            // InternalAdeptness.g:3873:1: ( ':' )
            {
            // InternalAdeptness.g:3873:1: ( ':' )
            // InternalAdeptness.g:3874:2: ':'
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
    // InternalAdeptness.g:3883:1: rule__MonitoringVariable__Group_6__5 : rule__MonitoringVariable__Group_6__5__Impl ;
    public final void rule__MonitoringVariable__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3887:1: ( rule__MonitoringVariable__Group_6__5__Impl )
            // InternalAdeptness.g:3888:2: rule__MonitoringVariable__Group_6__5__Impl
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
    // InternalAdeptness.g:3894:1: rule__MonitoringVariable__Group_6__5__Impl : ( ( rule__MonitoringVariable__MinAssignment_6_5 ) ) ;
    public final void rule__MonitoringVariable__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3898:1: ( ( ( rule__MonitoringVariable__MinAssignment_6_5 ) ) )
            // InternalAdeptness.g:3899:1: ( ( rule__MonitoringVariable__MinAssignment_6_5 ) )
            {
            // InternalAdeptness.g:3899:1: ( ( rule__MonitoringVariable__MinAssignment_6_5 ) )
            // InternalAdeptness.g:3900:2: ( rule__MonitoringVariable__MinAssignment_6_5 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getMinAssignment_6_5()); 
            // InternalAdeptness.g:3901:2: ( rule__MonitoringVariable__MinAssignment_6_5 )
            // InternalAdeptness.g:3901:3: rule__MonitoringVariable__MinAssignment_6_5
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
    // InternalAdeptness.g:3910:1: rule__Signal__Group__0 : rule__Signal__Group__0__Impl rule__Signal__Group__1 ;
    public final void rule__Signal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3914:1: ( rule__Signal__Group__0__Impl rule__Signal__Group__1 )
            // InternalAdeptness.g:3915:2: rule__Signal__Group__0__Impl rule__Signal__Group__1
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
    // InternalAdeptness.g:3922:1: rule__Signal__Group__0__Impl : ( 'CPS' ) ;
    public final void rule__Signal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3926:1: ( ( 'CPS' ) )
            // InternalAdeptness.g:3927:1: ( 'CPS' )
            {
            // InternalAdeptness.g:3927:1: ( 'CPS' )
            // InternalAdeptness.g:3928:2: 'CPS'
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
    // InternalAdeptness.g:3937:1: rule__Signal__Group__1 : rule__Signal__Group__1__Impl rule__Signal__Group__2 ;
    public final void rule__Signal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3941:1: ( rule__Signal__Group__1__Impl rule__Signal__Group__2 )
            // InternalAdeptness.g:3942:2: rule__Signal__Group__1__Impl rule__Signal__Group__2
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
    // InternalAdeptness.g:3949:1: rule__Signal__Group__1__Impl : ( ( rule__Signal__NameAssignment_1 ) ) ;
    public final void rule__Signal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3953:1: ( ( ( rule__Signal__NameAssignment_1 ) ) )
            // InternalAdeptness.g:3954:1: ( ( rule__Signal__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:3954:1: ( ( rule__Signal__NameAssignment_1 ) )
            // InternalAdeptness.g:3955:2: ( rule__Signal__NameAssignment_1 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:3956:2: ( rule__Signal__NameAssignment_1 )
            // InternalAdeptness.g:3956:3: rule__Signal__NameAssignment_1
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
    // InternalAdeptness.g:3964:1: rule__Signal__Group__2 : rule__Signal__Group__2__Impl rule__Signal__Group__3 ;
    public final void rule__Signal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3968:1: ( rule__Signal__Group__2__Impl rule__Signal__Group__3 )
            // InternalAdeptness.g:3969:2: rule__Signal__Group__2__Impl rule__Signal__Group__3
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
    // InternalAdeptness.g:3976:1: rule__Signal__Group__2__Impl : ( ( rule__Signal__Group_2__0 )? ) ;
    public final void rule__Signal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3980:1: ( ( ( rule__Signal__Group_2__0 )? ) )
            // InternalAdeptness.g:3981:1: ( ( rule__Signal__Group_2__0 )? )
            {
            // InternalAdeptness.g:3981:1: ( ( rule__Signal__Group_2__0 )? )
            // InternalAdeptness.g:3982:2: ( rule__Signal__Group_2__0 )?
            {
             before(grammarAccess.getSignalAccess().getGroup_2()); 
            // InternalAdeptness.g:3983:2: ( rule__Signal__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==54) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAdeptness.g:3983:3: rule__Signal__Group_2__0
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
    // InternalAdeptness.g:3991:1: rule__Signal__Group__3 : rule__Signal__Group__3__Impl rule__Signal__Group__4 ;
    public final void rule__Signal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3995:1: ( rule__Signal__Group__3__Impl rule__Signal__Group__4 )
            // InternalAdeptness.g:3996:2: rule__Signal__Group__3__Impl rule__Signal__Group__4
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
    // InternalAdeptness.g:4003:1: rule__Signal__Group__3__Impl : ( ':' ) ;
    public final void rule__Signal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4007:1: ( ( ':' ) )
            // InternalAdeptness.g:4008:1: ( ':' )
            {
            // InternalAdeptness.g:4008:1: ( ':' )
            // InternalAdeptness.g:4009:2: ':'
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
    // InternalAdeptness.g:4018:1: rule__Signal__Group__4 : rule__Signal__Group__4__Impl rule__Signal__Group__5 ;
    public final void rule__Signal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4022:1: ( rule__Signal__Group__4__Impl rule__Signal__Group__5 )
            // InternalAdeptness.g:4023:2: rule__Signal__Group__4__Impl rule__Signal__Group__5
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
    // InternalAdeptness.g:4030:1: rule__Signal__Group__4__Impl : ( ( rule__Signal__Group_4__0 )? ) ;
    public final void rule__Signal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4034:1: ( ( ( rule__Signal__Group_4__0 )? ) )
            // InternalAdeptness.g:4035:1: ( ( rule__Signal__Group_4__0 )? )
            {
            // InternalAdeptness.g:4035:1: ( ( rule__Signal__Group_4__0 )? )
            // InternalAdeptness.g:4036:2: ( rule__Signal__Group_4__0 )?
            {
             before(grammarAccess.getSignalAccess().getGroup_4()); 
            // InternalAdeptness.g:4037:2: ( rule__Signal__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==34) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAdeptness.g:4037:3: rule__Signal__Group_4__0
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
    // InternalAdeptness.g:4045:1: rule__Signal__Group__5 : rule__Signal__Group__5__Impl rule__Signal__Group__6 ;
    public final void rule__Signal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4049:1: ( rule__Signal__Group__5__Impl rule__Signal__Group__6 )
            // InternalAdeptness.g:4050:2: rule__Signal__Group__5__Impl rule__Signal__Group__6
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
    // InternalAdeptness.g:4057:1: rule__Signal__Group__5__Impl : ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) ) ;
    public final void rule__Signal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4061:1: ( ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) ) )
            // InternalAdeptness.g:4062:1: ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) )
            {
            // InternalAdeptness.g:4062:1: ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) )
            // InternalAdeptness.g:4063:2: ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* )
            {
            // InternalAdeptness.g:4063:2: ( ( rule__Signal__OracleAssignment_5 ) )
            // InternalAdeptness.g:4064:3: ( rule__Signal__OracleAssignment_5 )
            {
             before(grammarAccess.getSignalAccess().getOracleAssignment_5()); 
            // InternalAdeptness.g:4065:3: ( rule__Signal__OracleAssignment_5 )
            // InternalAdeptness.g:4065:4: rule__Signal__OracleAssignment_5
            {
            pushFollow(FOLLOW_36);
            rule__Signal__OracleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getOracleAssignment_5()); 

            }

            // InternalAdeptness.g:4068:2: ( ( rule__Signal__OracleAssignment_5 )* )
            // InternalAdeptness.g:4069:3: ( rule__Signal__OracleAssignment_5 )*
            {
             before(grammarAccess.getSignalAccess().getOracleAssignment_5()); 
            // InternalAdeptness.g:4070:3: ( rule__Signal__OracleAssignment_5 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==56) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAdeptness.g:4070:4: rule__Signal__OracleAssignment_5
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
    // InternalAdeptness.g:4079:1: rule__Signal__Group__6 : rule__Signal__Group__6__Impl ;
    public final void rule__Signal__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4083:1: ( rule__Signal__Group__6__Impl )
            // InternalAdeptness.g:4084:2: rule__Signal__Group__6__Impl
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
    // InternalAdeptness.g:4090:1: rule__Signal__Group__6__Impl : ( 'ENDCPS' ) ;
    public final void rule__Signal__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4094:1: ( ( 'ENDCPS' ) )
            // InternalAdeptness.g:4095:1: ( 'ENDCPS' )
            {
            // InternalAdeptness.g:4095:1: ( 'ENDCPS' )
            // InternalAdeptness.g:4096:2: 'ENDCPS'
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
    // InternalAdeptness.g:4106:1: rule__Signal__Group_2__0 : rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1 ;
    public final void rule__Signal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4110:1: ( rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1 )
            // InternalAdeptness.g:4111:2: rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1
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
    // InternalAdeptness.g:4118:1: rule__Signal__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Signal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4122:1: ( ( '[' ) )
            // InternalAdeptness.g:4123:1: ( '[' )
            {
            // InternalAdeptness.g:4123:1: ( '[' )
            // InternalAdeptness.g:4124:2: '['
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
    // InternalAdeptness.g:4133:1: rule__Signal__Group_2__1 : rule__Signal__Group_2__1__Impl rule__Signal__Group_2__2 ;
    public final void rule__Signal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4137:1: ( rule__Signal__Group_2__1__Impl rule__Signal__Group_2__2 )
            // InternalAdeptness.g:4138:2: rule__Signal__Group_2__1__Impl rule__Signal__Group_2__2
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
    // InternalAdeptness.g:4145:1: rule__Signal__Group_2__1__Impl : ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) ) ;
    public final void rule__Signal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4149:1: ( ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) ) )
            // InternalAdeptness.g:4150:1: ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) )
            {
            // InternalAdeptness.g:4150:1: ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) )
            // InternalAdeptness.g:4151:2: ( rule__Signal__CardinalityNumCPSAssignment_2_1 )
            {
             before(grammarAccess.getSignalAccess().getCardinalityNumCPSAssignment_2_1()); 
            // InternalAdeptness.g:4152:2: ( rule__Signal__CardinalityNumCPSAssignment_2_1 )
            // InternalAdeptness.g:4152:3: rule__Signal__CardinalityNumCPSAssignment_2_1
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
    // InternalAdeptness.g:4160:1: rule__Signal__Group_2__2 : rule__Signal__Group_2__2__Impl ;
    public final void rule__Signal__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4164:1: ( rule__Signal__Group_2__2__Impl )
            // InternalAdeptness.g:4165:2: rule__Signal__Group_2__2__Impl
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
    // InternalAdeptness.g:4171:1: rule__Signal__Group_2__2__Impl : ( ']' ) ;
    public final void rule__Signal__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4175:1: ( ( ']' ) )
            // InternalAdeptness.g:4176:1: ( ']' )
            {
            // InternalAdeptness.g:4176:1: ( ']' )
            // InternalAdeptness.g:4177:2: ']'
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
    // InternalAdeptness.g:4187:1: rule__Signal__Group_4__0 : rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1 ;
    public final void rule__Signal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4191:1: ( rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1 )
            // InternalAdeptness.g:4192:2: rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1
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
    // InternalAdeptness.g:4199:1: rule__Signal__Group_4__0__Impl : ( 'implements' ) ;
    public final void rule__Signal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4203:1: ( ( 'implements' ) )
            // InternalAdeptness.g:4204:1: ( 'implements' )
            {
            // InternalAdeptness.g:4204:1: ( 'implements' )
            // InternalAdeptness.g:4205:2: 'implements'
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
    // InternalAdeptness.g:4214:1: rule__Signal__Group_4__1 : rule__Signal__Group_4__1__Impl ;
    public final void rule__Signal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4218:1: ( rule__Signal__Group_4__1__Impl )
            // InternalAdeptness.g:4219:2: rule__Signal__Group_4__1__Impl
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
    // InternalAdeptness.g:4225:1: rule__Signal__Group_4__1__Impl : ( ( rule__Signal__SuperTypeAssignment_4_1 ) ) ;
    public final void rule__Signal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4229:1: ( ( ( rule__Signal__SuperTypeAssignment_4_1 ) ) )
            // InternalAdeptness.g:4230:1: ( ( rule__Signal__SuperTypeAssignment_4_1 ) )
            {
            // InternalAdeptness.g:4230:1: ( ( rule__Signal__SuperTypeAssignment_4_1 ) )
            // InternalAdeptness.g:4231:2: ( rule__Signal__SuperTypeAssignment_4_1 )
            {
             before(grammarAccess.getSignalAccess().getSuperTypeAssignment_4_1()); 
            // InternalAdeptness.g:4232:2: ( rule__Signal__SuperTypeAssignment_4_1 )
            // InternalAdeptness.g:4232:3: rule__Signal__SuperTypeAssignment_4_1
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
    // InternalAdeptness.g:4241:1: rule__Oracle__Group__0 : rule__Oracle__Group__0__Impl rule__Oracle__Group__1 ;
    public final void rule__Oracle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4245:1: ( rule__Oracle__Group__0__Impl rule__Oracle__Group__1 )
            // InternalAdeptness.g:4246:2: rule__Oracle__Group__0__Impl rule__Oracle__Group__1
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
    // InternalAdeptness.g:4253:1: rule__Oracle__Group__0__Impl : ( 'ORACLE' ) ;
    public final void rule__Oracle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4257:1: ( ( 'ORACLE' ) )
            // InternalAdeptness.g:4258:1: ( 'ORACLE' )
            {
            // InternalAdeptness.g:4258:1: ( 'ORACLE' )
            // InternalAdeptness.g:4259:2: 'ORACLE'
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
    // InternalAdeptness.g:4268:1: rule__Oracle__Group__1 : rule__Oracle__Group__1__Impl rule__Oracle__Group__2 ;
    public final void rule__Oracle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4272:1: ( rule__Oracle__Group__1__Impl rule__Oracle__Group__2 )
            // InternalAdeptness.g:4273:2: rule__Oracle__Group__1__Impl rule__Oracle__Group__2
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
    // InternalAdeptness.g:4280:1: rule__Oracle__Group__1__Impl : ( ( rule__Oracle__NameAssignment_1 ) ) ;
    public final void rule__Oracle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4284:1: ( ( ( rule__Oracle__NameAssignment_1 ) ) )
            // InternalAdeptness.g:4285:1: ( ( rule__Oracle__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:4285:1: ( ( rule__Oracle__NameAssignment_1 ) )
            // InternalAdeptness.g:4286:2: ( rule__Oracle__NameAssignment_1 )
            {
             before(grammarAccess.getOracleAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:4287:2: ( rule__Oracle__NameAssignment_1 )
            // InternalAdeptness.g:4287:3: rule__Oracle__NameAssignment_1
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
    // InternalAdeptness.g:4295:1: rule__Oracle__Group__2 : rule__Oracle__Group__2__Impl rule__Oracle__Group__3 ;
    public final void rule__Oracle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4299:1: ( rule__Oracle__Group__2__Impl rule__Oracle__Group__3 )
            // InternalAdeptness.g:4300:2: rule__Oracle__Group__2__Impl rule__Oracle__Group__3
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
    // InternalAdeptness.g:4307:1: rule__Oracle__Group__2__Impl : ( ':' ) ;
    public final void rule__Oracle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4311:1: ( ( ':' ) )
            // InternalAdeptness.g:4312:1: ( ':' )
            {
            // InternalAdeptness.g:4312:1: ( ':' )
            // InternalAdeptness.g:4313:2: ':'
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
    // InternalAdeptness.g:4322:1: rule__Oracle__Group__3 : rule__Oracle__Group__3__Impl rule__Oracle__Group__4 ;
    public final void rule__Oracle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4326:1: ( rule__Oracle__Group__3__Impl rule__Oracle__Group__4 )
            // InternalAdeptness.g:4327:2: rule__Oracle__Group__3__Impl rule__Oracle__Group__4
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
    // InternalAdeptness.g:4334:1: rule__Oracle__Group__3__Impl : ( ( rule__Oracle__Alternatives_3 )? ) ;
    public final void rule__Oracle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4338:1: ( ( ( rule__Oracle__Alternatives_3 )? ) )
            // InternalAdeptness.g:4339:1: ( ( rule__Oracle__Alternatives_3 )? )
            {
            // InternalAdeptness.g:4339:1: ( ( rule__Oracle__Alternatives_3 )? )
            // InternalAdeptness.g:4340:2: ( rule__Oracle__Alternatives_3 )?
            {
             before(grammarAccess.getOracleAccess().getAlternatives_3()); 
            // InternalAdeptness.g:4341:2: ( rule__Oracle__Alternatives_3 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=58 && LA41_0<=59)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAdeptness.g:4341:3: rule__Oracle__Alternatives_3
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
    // InternalAdeptness.g:4349:1: rule__Oracle__Group__4 : rule__Oracle__Group__4__Impl rule__Oracle__Group__5 ;
    public final void rule__Oracle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4353:1: ( rule__Oracle__Group__4__Impl rule__Oracle__Group__5 )
            // InternalAdeptness.g:4354:2: rule__Oracle__Group__4__Impl rule__Oracle__Group__5
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
    // InternalAdeptness.g:4361:1: rule__Oracle__Group__4__Impl : ( ( rule__Oracle__CheckAssignment_4 ) ) ;
    public final void rule__Oracle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4365:1: ( ( ( rule__Oracle__CheckAssignment_4 ) ) )
            // InternalAdeptness.g:4366:1: ( ( rule__Oracle__CheckAssignment_4 ) )
            {
            // InternalAdeptness.g:4366:1: ( ( rule__Oracle__CheckAssignment_4 ) )
            // InternalAdeptness.g:4367:2: ( rule__Oracle__CheckAssignment_4 )
            {
             before(grammarAccess.getOracleAccess().getCheckAssignment_4()); 
            // InternalAdeptness.g:4368:2: ( rule__Oracle__CheckAssignment_4 )
            // InternalAdeptness.g:4368:3: rule__Oracle__CheckAssignment_4
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
    // InternalAdeptness.g:4376:1: rule__Oracle__Group__5 : rule__Oracle__Group__5__Impl ;
    public final void rule__Oracle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4380:1: ( rule__Oracle__Group__5__Impl )
            // InternalAdeptness.g:4381:2: rule__Oracle__Group__5__Impl
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
    // InternalAdeptness.g:4387:1: rule__Oracle__Group__5__Impl : ( 'ENDORACLE' ) ;
    public final void rule__Oracle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4391:1: ( ( 'ENDORACLE' ) )
            // InternalAdeptness.g:4392:1: ( 'ENDORACLE' )
            {
            // InternalAdeptness.g:4392:1: ( 'ENDORACLE' )
            // InternalAdeptness.g:4393:2: 'ENDORACLE'
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
    // InternalAdeptness.g:4403:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4407:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // InternalAdeptness.g:4408:2: rule__While__Group__0__Impl rule__While__Group__1
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
    // InternalAdeptness.g:4415:1: rule__While__Group__0__Impl : ( 'while:' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4419:1: ( ( 'while:' ) )
            // InternalAdeptness.g:4420:1: ( 'while:' )
            {
            // InternalAdeptness.g:4420:1: ( 'while:' )
            // InternalAdeptness.g:4421:2: 'while:'
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
    // InternalAdeptness.g:4430:1: rule__While__Group__1 : rule__While__Group__1__Impl ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4434:1: ( rule__While__Group__1__Impl )
            // InternalAdeptness.g:4435:2: rule__While__Group__1__Impl
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
    // InternalAdeptness.g:4441:1: rule__While__Group__1__Impl : ( ( rule__While__EmAssignment_1 ) ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4445:1: ( ( ( rule__While__EmAssignment_1 ) ) )
            // InternalAdeptness.g:4446:1: ( ( rule__While__EmAssignment_1 ) )
            {
            // InternalAdeptness.g:4446:1: ( ( rule__While__EmAssignment_1 ) )
            // InternalAdeptness.g:4447:2: ( rule__While__EmAssignment_1 )
            {
             before(grammarAccess.getWhileAccess().getEmAssignment_1()); 
            // InternalAdeptness.g:4448:2: ( rule__While__EmAssignment_1 )
            // InternalAdeptness.g:4448:3: rule__While__EmAssignment_1
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
    // InternalAdeptness.g:4457:1: rule__When__Group__0 : rule__When__Group__0__Impl rule__When__Group__1 ;
    public final void rule__When__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4461:1: ( rule__When__Group__0__Impl rule__When__Group__1 )
            // InternalAdeptness.g:4462:2: rule__When__Group__0__Impl rule__When__Group__1
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
    // InternalAdeptness.g:4469:1: rule__When__Group__0__Impl : ( 'when:' ) ;
    public final void rule__When__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4473:1: ( ( 'when:' ) )
            // InternalAdeptness.g:4474:1: ( 'when:' )
            {
            // InternalAdeptness.g:4474:1: ( 'when:' )
            // InternalAdeptness.g:4475:2: 'when:'
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
    // InternalAdeptness.g:4484:1: rule__When__Group__1 : rule__When__Group__1__Impl rule__When__Group__2 ;
    public final void rule__When__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4488:1: ( rule__When__Group__1__Impl rule__When__Group__2 )
            // InternalAdeptness.g:4489:2: rule__When__Group__1__Impl rule__When__Group__2
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
    // InternalAdeptness.g:4496:1: rule__When__Group__1__Impl : ( ( rule__When__EmAssignment_1 ) ) ;
    public final void rule__When__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4500:1: ( ( ( rule__When__EmAssignment_1 ) ) )
            // InternalAdeptness.g:4501:1: ( ( rule__When__EmAssignment_1 ) )
            {
            // InternalAdeptness.g:4501:1: ( ( rule__When__EmAssignment_1 ) )
            // InternalAdeptness.g:4502:2: ( rule__When__EmAssignment_1 )
            {
             before(grammarAccess.getWhenAccess().getEmAssignment_1()); 
            // InternalAdeptness.g:4503:2: ( rule__When__EmAssignment_1 )
            // InternalAdeptness.g:4503:3: rule__When__EmAssignment_1
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
    // InternalAdeptness.g:4511:1: rule__When__Group__2 : rule__When__Group__2__Impl ;
    public final void rule__When__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4515:1: ( rule__When__Group__2__Impl )
            // InternalAdeptness.g:4516:2: rule__When__Group__2__Impl
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
    // InternalAdeptness.g:4522:1: rule__When__Group__2__Impl : ( ( rule__When__AwAssignment_2 )? ) ;
    public final void rule__When__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4526:1: ( ( ( rule__When__AwAssignment_2 )? ) )
            // InternalAdeptness.g:4527:1: ( ( rule__When__AwAssignment_2 )? )
            {
            // InternalAdeptness.g:4527:1: ( ( rule__When__AwAssignment_2 )? )
            // InternalAdeptness.g:4528:2: ( rule__When__AwAssignment_2 )?
            {
             before(grammarAccess.getWhenAccess().getAwAssignment_2()); 
            // InternalAdeptness.g:4529:2: ( rule__When__AwAssignment_2 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=60 && LA42_0<=61)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAdeptness.g:4529:3: rule__When__AwAssignment_2
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
    // InternalAdeptness.g:4538:1: rule__Wait__Group__0 : rule__Wait__Group__0__Impl rule__Wait__Group__1 ;
    public final void rule__Wait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4542:1: ( rule__Wait__Group__0__Impl rule__Wait__Group__1 )
            // InternalAdeptness.g:4543:2: rule__Wait__Group__0__Impl rule__Wait__Group__1
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
    // InternalAdeptness.g:4550:1: rule__Wait__Group__0__Impl : ( 'after(' ) ;
    public final void rule__Wait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4554:1: ( ( 'after(' ) )
            // InternalAdeptness.g:4555:1: ( 'after(' )
            {
            // InternalAdeptness.g:4555:1: ( 'after(' )
            // InternalAdeptness.g:4556:2: 'after('
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
    // InternalAdeptness.g:4565:1: rule__Wait__Group__1 : rule__Wait__Group__1__Impl rule__Wait__Group__2 ;
    public final void rule__Wait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4569:1: ( rule__Wait__Group__1__Impl rule__Wait__Group__2 )
            // InternalAdeptness.g:4570:2: rule__Wait__Group__1__Impl rule__Wait__Group__2
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
    // InternalAdeptness.g:4577:1: rule__Wait__Group__1__Impl : ( ( rule__Wait__TimeAssignment_1 ) ) ;
    public final void rule__Wait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4581:1: ( ( ( rule__Wait__TimeAssignment_1 ) ) )
            // InternalAdeptness.g:4582:1: ( ( rule__Wait__TimeAssignment_1 ) )
            {
            // InternalAdeptness.g:4582:1: ( ( rule__Wait__TimeAssignment_1 ) )
            // InternalAdeptness.g:4583:2: ( rule__Wait__TimeAssignment_1 )
            {
             before(grammarAccess.getWaitAccess().getTimeAssignment_1()); 
            // InternalAdeptness.g:4584:2: ( rule__Wait__TimeAssignment_1 )
            // InternalAdeptness.g:4584:3: rule__Wait__TimeAssignment_1
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
    // InternalAdeptness.g:4592:1: rule__Wait__Group__2 : rule__Wait__Group__2__Impl rule__Wait__Group__3 ;
    public final void rule__Wait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4596:1: ( rule__Wait__Group__2__Impl rule__Wait__Group__3 )
            // InternalAdeptness.g:4597:2: rule__Wait__Group__2__Impl rule__Wait__Group__3
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
    // InternalAdeptness.g:4604:1: rule__Wait__Group__2__Impl : ( ',' ) ;
    public final void rule__Wait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4608:1: ( ( ',' ) )
            // InternalAdeptness.g:4609:1: ( ',' )
            {
            // InternalAdeptness.g:4609:1: ( ',' )
            // InternalAdeptness.g:4610:2: ','
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
    // InternalAdeptness.g:4619:1: rule__Wait__Group__3 : rule__Wait__Group__3__Impl rule__Wait__Group__4 ;
    public final void rule__Wait__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4623:1: ( rule__Wait__Group__3__Impl rule__Wait__Group__4 )
            // InternalAdeptness.g:4624:2: rule__Wait__Group__3__Impl rule__Wait__Group__4
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
    // InternalAdeptness.g:4631:1: rule__Wait__Group__3__Impl : ( ( rule__Wait__UnitAssignment_3 ) ) ;
    public final void rule__Wait__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4635:1: ( ( ( rule__Wait__UnitAssignment_3 ) ) )
            // InternalAdeptness.g:4636:1: ( ( rule__Wait__UnitAssignment_3 ) )
            {
            // InternalAdeptness.g:4636:1: ( ( rule__Wait__UnitAssignment_3 ) )
            // InternalAdeptness.g:4637:2: ( rule__Wait__UnitAssignment_3 )
            {
             before(grammarAccess.getWaitAccess().getUnitAssignment_3()); 
            // InternalAdeptness.g:4638:2: ( rule__Wait__UnitAssignment_3 )
            // InternalAdeptness.g:4638:3: rule__Wait__UnitAssignment_3
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
    // InternalAdeptness.g:4646:1: rule__Wait__Group__4 : rule__Wait__Group__4__Impl ;
    public final void rule__Wait__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4650:1: ( rule__Wait__Group__4__Impl )
            // InternalAdeptness.g:4651:2: rule__Wait__Group__4__Impl
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
    // InternalAdeptness.g:4657:1: rule__Wait__Group__4__Impl : ( ')' ) ;
    public final void rule__Wait__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4661:1: ( ( ')' ) )
            // InternalAdeptness.g:4662:1: ( ')' )
            {
            // InternalAdeptness.g:4662:1: ( ')' )
            // InternalAdeptness.g:4663:2: ')'
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
    // InternalAdeptness.g:4673:1: rule__During__Group__0 : rule__During__Group__0__Impl rule__During__Group__1 ;
    public final void rule__During__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4677:1: ( rule__During__Group__0__Impl rule__During__Group__1 )
            // InternalAdeptness.g:4678:2: rule__During__Group__0__Impl rule__During__Group__1
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
    // InternalAdeptness.g:4685:1: rule__During__Group__0__Impl : ( 'during(' ) ;
    public final void rule__During__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4689:1: ( ( 'during(' ) )
            // InternalAdeptness.g:4690:1: ( 'during(' )
            {
            // InternalAdeptness.g:4690:1: ( 'during(' )
            // InternalAdeptness.g:4691:2: 'during('
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
    // InternalAdeptness.g:4700:1: rule__During__Group__1 : rule__During__Group__1__Impl rule__During__Group__2 ;
    public final void rule__During__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4704:1: ( rule__During__Group__1__Impl rule__During__Group__2 )
            // InternalAdeptness.g:4705:2: rule__During__Group__1__Impl rule__During__Group__2
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
    // InternalAdeptness.g:4712:1: rule__During__Group__1__Impl : ( ( rule__During__TimeAssignment_1 ) ) ;
    public final void rule__During__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4716:1: ( ( ( rule__During__TimeAssignment_1 ) ) )
            // InternalAdeptness.g:4717:1: ( ( rule__During__TimeAssignment_1 ) )
            {
            // InternalAdeptness.g:4717:1: ( ( rule__During__TimeAssignment_1 ) )
            // InternalAdeptness.g:4718:2: ( rule__During__TimeAssignment_1 )
            {
             before(grammarAccess.getDuringAccess().getTimeAssignment_1()); 
            // InternalAdeptness.g:4719:2: ( rule__During__TimeAssignment_1 )
            // InternalAdeptness.g:4719:3: rule__During__TimeAssignment_1
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
    // InternalAdeptness.g:4727:1: rule__During__Group__2 : rule__During__Group__2__Impl rule__During__Group__3 ;
    public final void rule__During__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4731:1: ( rule__During__Group__2__Impl rule__During__Group__3 )
            // InternalAdeptness.g:4732:2: rule__During__Group__2__Impl rule__During__Group__3
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
    // InternalAdeptness.g:4739:1: rule__During__Group__2__Impl : ( ',' ) ;
    public final void rule__During__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4743:1: ( ( ',' ) )
            // InternalAdeptness.g:4744:1: ( ',' )
            {
            // InternalAdeptness.g:4744:1: ( ',' )
            // InternalAdeptness.g:4745:2: ','
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
    // InternalAdeptness.g:4754:1: rule__During__Group__3 : rule__During__Group__3__Impl rule__During__Group__4 ;
    public final void rule__During__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4758:1: ( rule__During__Group__3__Impl rule__During__Group__4 )
            // InternalAdeptness.g:4759:2: rule__During__Group__3__Impl rule__During__Group__4
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
    // InternalAdeptness.g:4766:1: rule__During__Group__3__Impl : ( ( rule__During__UnitAssignment_3 ) ) ;
    public final void rule__During__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4770:1: ( ( ( rule__During__UnitAssignment_3 ) ) )
            // InternalAdeptness.g:4771:1: ( ( rule__During__UnitAssignment_3 ) )
            {
            // InternalAdeptness.g:4771:1: ( ( rule__During__UnitAssignment_3 ) )
            // InternalAdeptness.g:4772:2: ( rule__During__UnitAssignment_3 )
            {
             before(grammarAccess.getDuringAccess().getUnitAssignment_3()); 
            // InternalAdeptness.g:4773:2: ( rule__During__UnitAssignment_3 )
            // InternalAdeptness.g:4773:3: rule__During__UnitAssignment_3
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
    // InternalAdeptness.g:4781:1: rule__During__Group__4 : rule__During__Group__4__Impl ;
    public final void rule__During__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4785:1: ( rule__During__Group__4__Impl )
            // InternalAdeptness.g:4786:2: rule__During__Group__4__Impl
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
    // InternalAdeptness.g:4792:1: rule__During__Group__4__Impl : ( ')' ) ;
    public final void rule__During__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4796:1: ( ( ')' ) )
            // InternalAdeptness.g:4797:1: ( ')' )
            {
            // InternalAdeptness.g:4797:1: ( ')' )
            // InternalAdeptness.g:4798:2: ')'
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
    // InternalAdeptness.g:4808:1: rule__Checks__Group__0 : rule__Checks__Group__0__Impl rule__Checks__Group__1 ;
    public final void rule__Checks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4812:1: ( rule__Checks__Group__0__Impl rule__Checks__Group__1 )
            // InternalAdeptness.g:4813:2: rule__Checks__Group__0__Impl rule__Checks__Group__1
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
    // InternalAdeptness.g:4820:1: rule__Checks__Group__0__Impl : ( 'checks:' ) ;
    public final void rule__Checks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4824:1: ( ( 'checks:' ) )
            // InternalAdeptness.g:4825:1: ( 'checks:' )
            {
            // InternalAdeptness.g:4825:1: ( 'checks:' )
            // InternalAdeptness.g:4826:2: 'checks:'
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
    // InternalAdeptness.g:4835:1: rule__Checks__Group__1 : rule__Checks__Group__1__Impl rule__Checks__Group__2 ;
    public final void rule__Checks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4839:1: ( rule__Checks__Group__1__Impl rule__Checks__Group__2 )
            // InternalAdeptness.g:4840:2: rule__Checks__Group__1__Impl rule__Checks__Group__2
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
    // InternalAdeptness.g:4847:1: rule__Checks__Group__1__Impl : ( ( rule__Checks__Alternatives_1 ) ) ;
    public final void rule__Checks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4851:1: ( ( ( rule__Checks__Alternatives_1 ) ) )
            // InternalAdeptness.g:4852:1: ( ( rule__Checks__Alternatives_1 ) )
            {
            // InternalAdeptness.g:4852:1: ( ( rule__Checks__Alternatives_1 ) )
            // InternalAdeptness.g:4853:2: ( rule__Checks__Alternatives_1 )
            {
             before(grammarAccess.getChecksAccess().getAlternatives_1()); 
            // InternalAdeptness.g:4854:2: ( rule__Checks__Alternatives_1 )
            // InternalAdeptness.g:4854:3: rule__Checks__Alternatives_1
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
    // InternalAdeptness.g:4862:1: rule__Checks__Group__2 : rule__Checks__Group__2__Impl rule__Checks__Group__3 ;
    public final void rule__Checks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4866:1: ( rule__Checks__Group__2__Impl rule__Checks__Group__3 )
            // InternalAdeptness.g:4867:2: rule__Checks__Group__2__Impl rule__Checks__Group__3
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
    // InternalAdeptness.g:4874:1: rule__Checks__Group__2__Impl : ( ( rule__Checks__ReferenceAssignment_2 ) ) ;
    public final void rule__Checks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4878:1: ( ( ( rule__Checks__ReferenceAssignment_2 ) ) )
            // InternalAdeptness.g:4879:1: ( ( rule__Checks__ReferenceAssignment_2 ) )
            {
            // InternalAdeptness.g:4879:1: ( ( rule__Checks__ReferenceAssignment_2 ) )
            // InternalAdeptness.g:4880:2: ( rule__Checks__ReferenceAssignment_2 )
            {
             before(grammarAccess.getChecksAccess().getReferenceAssignment_2()); 
            // InternalAdeptness.g:4881:2: ( rule__Checks__ReferenceAssignment_2 )
            // InternalAdeptness.g:4881:3: rule__Checks__ReferenceAssignment_2
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
    // InternalAdeptness.g:4889:1: rule__Checks__Group__3 : rule__Checks__Group__3__Impl rule__Checks__Group__4 ;
    public final void rule__Checks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4893:1: ( rule__Checks__Group__3__Impl rule__Checks__Group__4 )
            // InternalAdeptness.g:4894:2: rule__Checks__Group__3__Impl rule__Checks__Group__4
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
    // InternalAdeptness.g:4901:1: rule__Checks__Group__3__Impl : ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) ) ;
    public final void rule__Checks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4905:1: ( ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) ) )
            // InternalAdeptness.g:4906:1: ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) )
            {
            // InternalAdeptness.g:4906:1: ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) )
            // InternalAdeptness.g:4907:2: ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* )
            {
            // InternalAdeptness.g:4907:2: ( ( rule__Checks__FailReasonAssignment_3 ) )
            // InternalAdeptness.g:4908:3: ( rule__Checks__FailReasonAssignment_3 )
            {
             before(grammarAccess.getChecksAccess().getFailReasonAssignment_3()); 
            // InternalAdeptness.g:4909:3: ( rule__Checks__FailReasonAssignment_3 )
            // InternalAdeptness.g:4909:4: rule__Checks__FailReasonAssignment_3
            {
            pushFollow(FOLLOW_47);
            rule__Checks__FailReasonAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChecksAccess().getFailReasonAssignment_3()); 

            }

            // InternalAdeptness.g:4912:2: ( ( rule__Checks__FailReasonAssignment_3 )* )
            // InternalAdeptness.g:4913:3: ( rule__Checks__FailReasonAssignment_3 )*
            {
             before(grammarAccess.getChecksAccess().getFailReasonAssignment_3()); 
            // InternalAdeptness.g:4914:3: ( rule__Checks__FailReasonAssignment_3 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==64) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalAdeptness.g:4914:4: rule__Checks__FailReasonAssignment_3
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
    // InternalAdeptness.g:4923:1: rule__Checks__Group__4 : rule__Checks__Group__4__Impl ;
    public final void rule__Checks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4927:1: ( rule__Checks__Group__4__Impl )
            // InternalAdeptness.g:4928:2: rule__Checks__Group__4__Impl
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
    // InternalAdeptness.g:4934:1: rule__Checks__Group__4__Impl : ( ( rule__Checks__DescriptionAssignment_4 ) ) ;
    public final void rule__Checks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4938:1: ( ( ( rule__Checks__DescriptionAssignment_4 ) ) )
            // InternalAdeptness.g:4939:1: ( ( rule__Checks__DescriptionAssignment_4 ) )
            {
            // InternalAdeptness.g:4939:1: ( ( rule__Checks__DescriptionAssignment_4 ) )
            // InternalAdeptness.g:4940:2: ( rule__Checks__DescriptionAssignment_4 )
            {
             before(grammarAccess.getChecksAccess().getDescriptionAssignment_4()); 
            // InternalAdeptness.g:4941:2: ( rule__Checks__DescriptionAssignment_4 )
            // InternalAdeptness.g:4941:3: rule__Checks__DescriptionAssignment_4
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
    // InternalAdeptness.g:4950:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4954:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalAdeptness.g:4955:2: rule__Description__Group__0__Impl rule__Description__Group__1
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
    // InternalAdeptness.g:4962:1: rule__Description__Group__0__Impl : ( 'Description: ' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4966:1: ( ( 'Description: ' ) )
            // InternalAdeptness.g:4967:1: ( 'Description: ' )
            {
            // InternalAdeptness.g:4967:1: ( 'Description: ' )
            // InternalAdeptness.g:4968:2: 'Description: '
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
    // InternalAdeptness.g:4977:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4981:1: ( rule__Description__Group__1__Impl )
            // InternalAdeptness.g:4982:2: rule__Description__Group__1__Impl
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
    // InternalAdeptness.g:4988:1: rule__Description__Group__1__Impl : ( ( rule__Description__ValueAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4992:1: ( ( ( rule__Description__ValueAssignment_1 ) ) )
            // InternalAdeptness.g:4993:1: ( ( rule__Description__ValueAssignment_1 ) )
            {
            // InternalAdeptness.g:4993:1: ( ( rule__Description__ValueAssignment_1 ) )
            // InternalAdeptness.g:4994:2: ( rule__Description__ValueAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getValueAssignment_1()); 
            // InternalAdeptness.g:4995:2: ( rule__Description__ValueAssignment_1 )
            // InternalAdeptness.g:4995:3: rule__Description__ValueAssignment_1
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
    // InternalAdeptness.g:5004:1: rule__FailReason__Group__0 : rule__FailReason__Group__0__Impl rule__FailReason__Group__1 ;
    public final void rule__FailReason__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5008:1: ( rule__FailReason__Group__0__Impl rule__FailReason__Group__1 )
            // InternalAdeptness.g:5009:2: rule__FailReason__Group__0__Impl rule__FailReason__Group__1
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
    // InternalAdeptness.g:5016:1: rule__FailReason__Group__0__Impl : ( 'fails if :' ) ;
    public final void rule__FailReason__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5020:1: ( ( 'fails if :' ) )
            // InternalAdeptness.g:5021:1: ( 'fails if :' )
            {
            // InternalAdeptness.g:5021:1: ( 'fails if :' )
            // InternalAdeptness.g:5022:2: 'fails if :'
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
    // InternalAdeptness.g:5031:1: rule__FailReason__Group__1 : rule__FailReason__Group__1__Impl ;
    public final void rule__FailReason__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5035:1: ( rule__FailReason__Group__1__Impl )
            // InternalAdeptness.g:5036:2: rule__FailReason__Group__1__Impl
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
    // InternalAdeptness.g:5042:1: rule__FailReason__Group__1__Impl : ( ( rule__FailReason__ReasonAssignment_1 ) ) ;
    public final void rule__FailReason__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5046:1: ( ( ( rule__FailReason__ReasonAssignment_1 ) ) )
            // InternalAdeptness.g:5047:1: ( ( rule__FailReason__ReasonAssignment_1 ) )
            {
            // InternalAdeptness.g:5047:1: ( ( rule__FailReason__ReasonAssignment_1 ) )
            // InternalAdeptness.g:5048:2: ( rule__FailReason__ReasonAssignment_1 )
            {
             before(grammarAccess.getFailReasonAccess().getReasonAssignment_1()); 
            // InternalAdeptness.g:5049:2: ( rule__FailReason__ReasonAssignment_1 )
            // InternalAdeptness.g:5049:3: rule__FailReason__ReasonAssignment_1
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
    // InternalAdeptness.g:5058:1: rule__Reason__Group__0 : rule__Reason__Group__0__Impl rule__Reason__Group__1 ;
    public final void rule__Reason__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5062:1: ( rule__Reason__Group__0__Impl rule__Reason__Group__1 )
            // InternalAdeptness.g:5063:2: rule__Reason__Group__0__Impl rule__Reason__Group__1
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
    // InternalAdeptness.g:5070:1: rule__Reason__Group__0__Impl : ( ( rule__Reason__Alternatives_0 ) ) ;
    public final void rule__Reason__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5074:1: ( ( ( rule__Reason__Alternatives_0 ) ) )
            // InternalAdeptness.g:5075:1: ( ( rule__Reason__Alternatives_0 ) )
            {
            // InternalAdeptness.g:5075:1: ( ( rule__Reason__Alternatives_0 ) )
            // InternalAdeptness.g:5076:2: ( rule__Reason__Alternatives_0 )
            {
             before(grammarAccess.getReasonAccess().getAlternatives_0()); 
            // InternalAdeptness.g:5077:2: ( rule__Reason__Alternatives_0 )
            // InternalAdeptness.g:5077:3: rule__Reason__Alternatives_0
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
    // InternalAdeptness.g:5085:1: rule__Reason__Group__1 : rule__Reason__Group__1__Impl ;
    public final void rule__Reason__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5089:1: ( rule__Reason__Group__1__Impl )
            // InternalAdeptness.g:5090:2: rule__Reason__Group__1__Impl
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
    // InternalAdeptness.g:5096:1: rule__Reason__Group__1__Impl : ( ';' ) ;
    public final void rule__Reason__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5100:1: ( ( ';' ) )
            // InternalAdeptness.g:5101:1: ( ';' )
            {
            // InternalAdeptness.g:5101:1: ( ';' )
            // InternalAdeptness.g:5102:2: ';'
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
    // InternalAdeptness.g:5112:1: rule__XPeaks__Group__0 : rule__XPeaks__Group__0__Impl rule__XPeaks__Group__1 ;
    public final void rule__XPeaks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5116:1: ( rule__XPeaks__Group__0__Impl rule__XPeaks__Group__1 )
            // InternalAdeptness.g:5117:2: rule__XPeaks__Group__0__Impl rule__XPeaks__Group__1
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
    // InternalAdeptness.g:5124:1: rule__XPeaks__Group__0__Impl : ( 'confidence is below' ) ;
    public final void rule__XPeaks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5128:1: ( ( 'confidence is below' ) )
            // InternalAdeptness.g:5129:1: ( 'confidence is below' )
            {
            // InternalAdeptness.g:5129:1: ( 'confidence is below' )
            // InternalAdeptness.g:5130:2: 'confidence is below'
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
    // InternalAdeptness.g:5139:1: rule__XPeaks__Group__1 : rule__XPeaks__Group__1__Impl rule__XPeaks__Group__2 ;
    public final void rule__XPeaks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5143:1: ( rule__XPeaks__Group__1__Impl rule__XPeaks__Group__2 )
            // InternalAdeptness.g:5144:2: rule__XPeaks__Group__1__Impl rule__XPeaks__Group__2
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
    // InternalAdeptness.g:5151:1: rule__XPeaks__Group__1__Impl : ( ( rule__XPeaks__CantAssignment_1 ) ) ;
    public final void rule__XPeaks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5155:1: ( ( ( rule__XPeaks__CantAssignment_1 ) ) )
            // InternalAdeptness.g:5156:1: ( ( rule__XPeaks__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:5156:1: ( ( rule__XPeaks__CantAssignment_1 ) )
            // InternalAdeptness.g:5157:2: ( rule__XPeaks__CantAssignment_1 )
            {
             before(grammarAccess.getXPeaksAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:5158:2: ( rule__XPeaks__CantAssignment_1 )
            // InternalAdeptness.g:5158:3: rule__XPeaks__CantAssignment_1
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
    // InternalAdeptness.g:5166:1: rule__XPeaks__Group__2 : rule__XPeaks__Group__2__Impl rule__XPeaks__Group__3 ;
    public final void rule__XPeaks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5170:1: ( rule__XPeaks__Group__2__Impl rule__XPeaks__Group__3 )
            // InternalAdeptness.g:5171:2: rule__XPeaks__Group__2__Impl rule__XPeaks__Group__3
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
    // InternalAdeptness.g:5178:1: rule__XPeaks__Group__2__Impl : ( 'more than' ) ;
    public final void rule__XPeaks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5182:1: ( ( 'more than' ) )
            // InternalAdeptness.g:5183:1: ( 'more than' )
            {
            // InternalAdeptness.g:5183:1: ( 'more than' )
            // InternalAdeptness.g:5184:2: 'more than'
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
    // InternalAdeptness.g:5193:1: rule__XPeaks__Group__3 : rule__XPeaks__Group__3__Impl rule__XPeaks__Group__4 ;
    public final void rule__XPeaks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5197:1: ( rule__XPeaks__Group__3__Impl rule__XPeaks__Group__4 )
            // InternalAdeptness.g:5198:2: rule__XPeaks__Group__3__Impl rule__XPeaks__Group__4
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
    // InternalAdeptness.g:5205:1: rule__XPeaks__Group__3__Impl : ( ( rule__XPeaks__NPeaksAssignment_3 ) ) ;
    public final void rule__XPeaks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5209:1: ( ( ( rule__XPeaks__NPeaksAssignment_3 ) ) )
            // InternalAdeptness.g:5210:1: ( ( rule__XPeaks__NPeaksAssignment_3 ) )
            {
            // InternalAdeptness.g:5210:1: ( ( rule__XPeaks__NPeaksAssignment_3 ) )
            // InternalAdeptness.g:5211:2: ( rule__XPeaks__NPeaksAssignment_3 )
            {
             before(grammarAccess.getXPeaksAccess().getNPeaksAssignment_3()); 
            // InternalAdeptness.g:5212:2: ( rule__XPeaks__NPeaksAssignment_3 )
            // InternalAdeptness.g:5212:3: rule__XPeaks__NPeaksAssignment_3
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
    // InternalAdeptness.g:5220:1: rule__XPeaks__Group__4 : rule__XPeaks__Group__4__Impl rule__XPeaks__Group__5 ;
    public final void rule__XPeaks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5224:1: ( rule__XPeaks__Group__4__Impl rule__XPeaks__Group__5 )
            // InternalAdeptness.g:5225:2: rule__XPeaks__Group__4__Impl rule__XPeaks__Group__5
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
    // InternalAdeptness.g:5232:1: rule__XPeaks__Group__4__Impl : ( 'times within' ) ;
    public final void rule__XPeaks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5236:1: ( ( 'times within' ) )
            // InternalAdeptness.g:5237:1: ( 'times within' )
            {
            // InternalAdeptness.g:5237:1: ( 'times within' )
            // InternalAdeptness.g:5238:2: 'times within'
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
    // InternalAdeptness.g:5247:1: rule__XPeaks__Group__5 : rule__XPeaks__Group__5__Impl rule__XPeaks__Group__6 ;
    public final void rule__XPeaks__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5251:1: ( rule__XPeaks__Group__5__Impl rule__XPeaks__Group__6 )
            // InternalAdeptness.g:5252:2: rule__XPeaks__Group__5__Impl rule__XPeaks__Group__6
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
    // InternalAdeptness.g:5259:1: rule__XPeaks__Group__5__Impl : ( ( rule__XPeaks__TimeAssignment_5 ) ) ;
    public final void rule__XPeaks__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5263:1: ( ( ( rule__XPeaks__TimeAssignment_5 ) ) )
            // InternalAdeptness.g:5264:1: ( ( rule__XPeaks__TimeAssignment_5 ) )
            {
            // InternalAdeptness.g:5264:1: ( ( rule__XPeaks__TimeAssignment_5 ) )
            // InternalAdeptness.g:5265:2: ( rule__XPeaks__TimeAssignment_5 )
            {
             before(grammarAccess.getXPeaksAccess().getTimeAssignment_5()); 
            // InternalAdeptness.g:5266:2: ( rule__XPeaks__TimeAssignment_5 )
            // InternalAdeptness.g:5266:3: rule__XPeaks__TimeAssignment_5
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
    // InternalAdeptness.g:5274:1: rule__XPeaks__Group__6 : rule__XPeaks__Group__6__Impl ;
    public final void rule__XPeaks__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5278:1: ( rule__XPeaks__Group__6__Impl )
            // InternalAdeptness.g:5279:2: rule__XPeaks__Group__6__Impl
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
    // InternalAdeptness.g:5285:1: rule__XPeaks__Group__6__Impl : ( ( rule__XPeaks__UnitAssignment_6 ) ) ;
    public final void rule__XPeaks__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5289:1: ( ( ( rule__XPeaks__UnitAssignment_6 ) ) )
            // InternalAdeptness.g:5290:1: ( ( rule__XPeaks__UnitAssignment_6 ) )
            {
            // InternalAdeptness.g:5290:1: ( ( rule__XPeaks__UnitAssignment_6 ) )
            // InternalAdeptness.g:5291:2: ( rule__XPeaks__UnitAssignment_6 )
            {
             before(grammarAccess.getXPeaksAccess().getUnitAssignment_6()); 
            // InternalAdeptness.g:5292:2: ( rule__XPeaks__UnitAssignment_6 )
            // InternalAdeptness.g:5292:3: rule__XPeaks__UnitAssignment_6
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
    // InternalAdeptness.g:5301:1: rule__ConstDeg__Group__0 : rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1 ;
    public final void rule__ConstDeg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5305:1: ( rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1 )
            // InternalAdeptness.g:5306:2: rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1
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
    // InternalAdeptness.g:5313:1: rule__ConstDeg__Group__0__Impl : ( 'confidence is in constant degradation' ) ;
    public final void rule__ConstDeg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5317:1: ( ( 'confidence is in constant degradation' ) )
            // InternalAdeptness.g:5318:1: ( 'confidence is in constant degradation' )
            {
            // InternalAdeptness.g:5318:1: ( 'confidence is in constant degradation' )
            // InternalAdeptness.g:5319:2: 'confidence is in constant degradation'
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
    // InternalAdeptness.g:5328:1: rule__ConstDeg__Group__1 : rule__ConstDeg__Group__1__Impl ;
    public final void rule__ConstDeg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5332:1: ( rule__ConstDeg__Group__1__Impl )
            // InternalAdeptness.g:5333:2: rule__ConstDeg__Group__1__Impl
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
    // InternalAdeptness.g:5339:1: rule__ConstDeg__Group__1__Impl : ( ( rule__ConstDeg__CantAssignment_1 ) ) ;
    public final void rule__ConstDeg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5343:1: ( ( ( rule__ConstDeg__CantAssignment_1 ) ) )
            // InternalAdeptness.g:5344:1: ( ( rule__ConstDeg__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:5344:1: ( ( rule__ConstDeg__CantAssignment_1 ) )
            // InternalAdeptness.g:5345:2: ( rule__ConstDeg__CantAssignment_1 )
            {
             before(grammarAccess.getConstDegAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:5346:2: ( rule__ConstDeg__CantAssignment_1 )
            // InternalAdeptness.g:5346:3: rule__ConstDeg__CantAssignment_1
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
    // InternalAdeptness.g:5355:1: rule__HighTime__Group__0 : rule__HighTime__Group__0__Impl rule__HighTime__Group__1 ;
    public final void rule__HighTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5359:1: ( rule__HighTime__Group__0__Impl rule__HighTime__Group__1 )
            // InternalAdeptness.g:5360:2: rule__HighTime__Group__0__Impl rule__HighTime__Group__1
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
    // InternalAdeptness.g:5367:1: rule__HighTime__Group__0__Impl : ( 'confidence is below' ) ;
    public final void rule__HighTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5371:1: ( ( 'confidence is below' ) )
            // InternalAdeptness.g:5372:1: ( 'confidence is below' )
            {
            // InternalAdeptness.g:5372:1: ( 'confidence is below' )
            // InternalAdeptness.g:5373:2: 'confidence is below'
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
    // InternalAdeptness.g:5382:1: rule__HighTime__Group__1 : rule__HighTime__Group__1__Impl rule__HighTime__Group__2 ;
    public final void rule__HighTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5386:1: ( rule__HighTime__Group__1__Impl rule__HighTime__Group__2 )
            // InternalAdeptness.g:5387:2: rule__HighTime__Group__1__Impl rule__HighTime__Group__2
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
    // InternalAdeptness.g:5394:1: rule__HighTime__Group__1__Impl : ( ( rule__HighTime__CantAssignment_1 ) ) ;
    public final void rule__HighTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5398:1: ( ( ( rule__HighTime__CantAssignment_1 ) ) )
            // InternalAdeptness.g:5399:1: ( ( rule__HighTime__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:5399:1: ( ( rule__HighTime__CantAssignment_1 ) )
            // InternalAdeptness.g:5400:2: ( rule__HighTime__CantAssignment_1 )
            {
             before(grammarAccess.getHighTimeAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:5401:2: ( rule__HighTime__CantAssignment_1 )
            // InternalAdeptness.g:5401:3: rule__HighTime__CantAssignment_1
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
    // InternalAdeptness.g:5409:1: rule__HighTime__Group__2 : rule__HighTime__Group__2__Impl rule__HighTime__Group__3 ;
    public final void rule__HighTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5413:1: ( rule__HighTime__Group__2__Impl rule__HighTime__Group__3 )
            // InternalAdeptness.g:5414:2: rule__HighTime__Group__2__Impl rule__HighTime__Group__3
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
    // InternalAdeptness.g:5421:1: rule__HighTime__Group__2__Impl : ( 'within' ) ;
    public final void rule__HighTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5425:1: ( ( 'within' ) )
            // InternalAdeptness.g:5426:1: ( 'within' )
            {
            // InternalAdeptness.g:5426:1: ( 'within' )
            // InternalAdeptness.g:5427:2: 'within'
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
    // InternalAdeptness.g:5436:1: rule__HighTime__Group__3 : rule__HighTime__Group__3__Impl rule__HighTime__Group__4 ;
    public final void rule__HighTime__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5440:1: ( rule__HighTime__Group__3__Impl rule__HighTime__Group__4 )
            // InternalAdeptness.g:5441:2: rule__HighTime__Group__3__Impl rule__HighTime__Group__4
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
    // InternalAdeptness.g:5448:1: rule__HighTime__Group__3__Impl : ( ( rule__HighTime__TimeAssignment_3 ) ) ;
    public final void rule__HighTime__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5452:1: ( ( ( rule__HighTime__TimeAssignment_3 ) ) )
            // InternalAdeptness.g:5453:1: ( ( rule__HighTime__TimeAssignment_3 ) )
            {
            // InternalAdeptness.g:5453:1: ( ( rule__HighTime__TimeAssignment_3 ) )
            // InternalAdeptness.g:5454:2: ( rule__HighTime__TimeAssignment_3 )
            {
             before(grammarAccess.getHighTimeAccess().getTimeAssignment_3()); 
            // InternalAdeptness.g:5455:2: ( rule__HighTime__TimeAssignment_3 )
            // InternalAdeptness.g:5455:3: rule__HighTime__TimeAssignment_3
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
    // InternalAdeptness.g:5463:1: rule__HighTime__Group__4 : rule__HighTime__Group__4__Impl ;
    public final void rule__HighTime__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5467:1: ( rule__HighTime__Group__4__Impl )
            // InternalAdeptness.g:5468:2: rule__HighTime__Group__4__Impl
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
    // InternalAdeptness.g:5474:1: rule__HighTime__Group__4__Impl : ( ( rule__HighTime__UnitAssignment_4 ) ) ;
    public final void rule__HighTime__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5478:1: ( ( ( rule__HighTime__UnitAssignment_4 ) ) )
            // InternalAdeptness.g:5479:1: ( ( rule__HighTime__UnitAssignment_4 ) )
            {
            // InternalAdeptness.g:5479:1: ( ( rule__HighTime__UnitAssignment_4 ) )
            // InternalAdeptness.g:5480:2: ( rule__HighTime__UnitAssignment_4 )
            {
             before(grammarAccess.getHighTimeAccess().getUnitAssignment_4()); 
            // InternalAdeptness.g:5481:2: ( rule__HighTime__UnitAssignment_4 )
            // InternalAdeptness.g:5481:3: rule__HighTime__UnitAssignment_4
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
    // InternalAdeptness.g:5490:1: rule__HighPeak__Group__0 : rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1 ;
    public final void rule__HighPeak__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5494:1: ( rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1 )
            // InternalAdeptness.g:5495:2: rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1
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
    // InternalAdeptness.g:5502:1: rule__HighPeak__Group__0__Impl : ( 'confidence is below' ) ;
    public final void rule__HighPeak__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5506:1: ( ( 'confidence is below' ) )
            // InternalAdeptness.g:5507:1: ( 'confidence is below' )
            {
            // InternalAdeptness.g:5507:1: ( 'confidence is below' )
            // InternalAdeptness.g:5508:2: 'confidence is below'
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
    // InternalAdeptness.g:5517:1: rule__HighPeak__Group__1 : rule__HighPeak__Group__1__Impl ;
    public final void rule__HighPeak__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5521:1: ( rule__HighPeak__Group__1__Impl )
            // InternalAdeptness.g:5522:2: rule__HighPeak__Group__1__Impl
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
    // InternalAdeptness.g:5528:1: rule__HighPeak__Group__1__Impl : ( ( rule__HighPeak__CantAssignment_1 ) ) ;
    public final void rule__HighPeak__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5532:1: ( ( ( rule__HighPeak__CantAssignment_1 ) ) )
            // InternalAdeptness.g:5533:1: ( ( rule__HighPeak__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:5533:1: ( ( rule__HighPeak__CantAssignment_1 ) )
            // InternalAdeptness.g:5534:2: ( rule__HighPeak__CantAssignment_1 )
            {
             before(grammarAccess.getHighPeakAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:5535:2: ( rule__HighPeak__CantAssignment_1 )
            // InternalAdeptness.g:5535:3: rule__HighPeak__CantAssignment_1
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
    // InternalAdeptness.g:5544:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5548:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalAdeptness.g:5549:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
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
    // InternalAdeptness.g:5556:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__Alternatives_0 ) ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5560:1: ( ( ( rule__Reference__Alternatives_0 ) ) )
            // InternalAdeptness.g:5561:1: ( ( rule__Reference__Alternatives_0 ) )
            {
            // InternalAdeptness.g:5561:1: ( ( rule__Reference__Alternatives_0 ) )
            // InternalAdeptness.g:5562:2: ( rule__Reference__Alternatives_0 )
            {
             before(grammarAccess.getReferenceAccess().getAlternatives_0()); 
            // InternalAdeptness.g:5563:2: ( rule__Reference__Alternatives_0 )
            // InternalAdeptness.g:5563:3: rule__Reference__Alternatives_0
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
    // InternalAdeptness.g:5571:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5575:1: ( rule__Reference__Group__1__Impl )
            // InternalAdeptness.g:5576:2: rule__Reference__Group__1__Impl
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
    // InternalAdeptness.g:5582:1: rule__Reference__Group__1__Impl : ( ';' ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5586:1: ( ( ';' ) )
            // InternalAdeptness.g:5587:1: ( ';' )
            {
            // InternalAdeptness.g:5587:1: ( ';' )
            // InternalAdeptness.g:5588:2: ';'
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
    // InternalAdeptness.g:5598:1: rule__Same__Group__0 : rule__Same__Group__0__Impl rule__Same__Group__1 ;
    public final void rule__Same__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5602:1: ( rule__Same__Group__0__Impl rule__Same__Group__1 )
            // InternalAdeptness.g:5603:2: rule__Same__Group__0__Impl rule__Same__Group__1
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
    // InternalAdeptness.g:5610:1: rule__Same__Group__0__Impl : ( 'should be' ) ;
    public final void rule__Same__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5614:1: ( ( 'should be' ) )
            // InternalAdeptness.g:5615:1: ( 'should be' )
            {
            // InternalAdeptness.g:5615:1: ( 'should be' )
            // InternalAdeptness.g:5616:2: 'should be'
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
    // InternalAdeptness.g:5625:1: rule__Same__Group__1 : rule__Same__Group__1__Impl rule__Same__Group__2 ;
    public final void rule__Same__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5629:1: ( rule__Same__Group__1__Impl rule__Same__Group__2 )
            // InternalAdeptness.g:5630:2: rule__Same__Group__1__Impl rule__Same__Group__2
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
    // InternalAdeptness.g:5637:1: rule__Same__Group__1__Impl : ( ( rule__Same__Bound_uppAssignment_1 ) ) ;
    public final void rule__Same__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5641:1: ( ( ( rule__Same__Bound_uppAssignment_1 ) ) )
            // InternalAdeptness.g:5642:1: ( ( rule__Same__Bound_uppAssignment_1 ) )
            {
            // InternalAdeptness.g:5642:1: ( ( rule__Same__Bound_uppAssignment_1 ) )
            // InternalAdeptness.g:5643:2: ( rule__Same__Bound_uppAssignment_1 )
            {
             before(grammarAccess.getSameAccess().getBound_uppAssignment_1()); 
            // InternalAdeptness.g:5644:2: ( rule__Same__Bound_uppAssignment_1 )
            // InternalAdeptness.g:5644:3: rule__Same__Bound_uppAssignment_1
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
    // InternalAdeptness.g:5652:1: rule__Same__Group__2 : rule__Same__Group__2__Impl ;
    public final void rule__Same__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5656:1: ( rule__Same__Group__2__Impl )
            // InternalAdeptness.g:5657:2: rule__Same__Group__2__Impl
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
    // InternalAdeptness.g:5663:1: rule__Same__Group__2__Impl : ( ( rule__Same__Alternatives_2 )? ) ;
    public final void rule__Same__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5667:1: ( ( ( rule__Same__Alternatives_2 )? ) )
            // InternalAdeptness.g:5668:1: ( ( rule__Same__Alternatives_2 )? )
            {
            // InternalAdeptness.g:5668:1: ( ( rule__Same__Alternatives_2 )? )
            // InternalAdeptness.g:5669:2: ( rule__Same__Alternatives_2 )?
            {
             before(grammarAccess.getSameAccess().getAlternatives_2()); 
            // InternalAdeptness.g:5670:2: ( rule__Same__Alternatives_2 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==78||(LA44_0>=80 && LA44_0<=81)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAdeptness.g:5670:3: rule__Same__Alternatives_2
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
    // InternalAdeptness.g:5679:1: rule__NotSame__Group__0 : rule__NotSame__Group__0__Impl rule__NotSame__Group__1 ;
    public final void rule__NotSame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5683:1: ( rule__NotSame__Group__0__Impl rule__NotSame__Group__1 )
            // InternalAdeptness.g:5684:2: rule__NotSame__Group__0__Impl rule__NotSame__Group__1
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
    // InternalAdeptness.g:5691:1: rule__NotSame__Group__0__Impl : ( 'should not be' ) ;
    public final void rule__NotSame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5695:1: ( ( 'should not be' ) )
            // InternalAdeptness.g:5696:1: ( 'should not be' )
            {
            // InternalAdeptness.g:5696:1: ( 'should not be' )
            // InternalAdeptness.g:5697:2: 'should not be'
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
    // InternalAdeptness.g:5706:1: rule__NotSame__Group__1 : rule__NotSame__Group__1__Impl rule__NotSame__Group__2 ;
    public final void rule__NotSame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5710:1: ( rule__NotSame__Group__1__Impl rule__NotSame__Group__2 )
            // InternalAdeptness.g:5711:2: rule__NotSame__Group__1__Impl rule__NotSame__Group__2
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
    // InternalAdeptness.g:5718:1: rule__NotSame__Group__1__Impl : ( ( rule__NotSame__Bound_uppAssignment_1 ) ) ;
    public final void rule__NotSame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5722:1: ( ( ( rule__NotSame__Bound_uppAssignment_1 ) ) )
            // InternalAdeptness.g:5723:1: ( ( rule__NotSame__Bound_uppAssignment_1 ) )
            {
            // InternalAdeptness.g:5723:1: ( ( rule__NotSame__Bound_uppAssignment_1 ) )
            // InternalAdeptness.g:5724:2: ( rule__NotSame__Bound_uppAssignment_1 )
            {
             before(grammarAccess.getNotSameAccess().getBound_uppAssignment_1()); 
            // InternalAdeptness.g:5725:2: ( rule__NotSame__Bound_uppAssignment_1 )
            // InternalAdeptness.g:5725:3: rule__NotSame__Bound_uppAssignment_1
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
    // InternalAdeptness.g:5733:1: rule__NotSame__Group__2 : rule__NotSame__Group__2__Impl ;
    public final void rule__NotSame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5737:1: ( rule__NotSame__Group__2__Impl )
            // InternalAdeptness.g:5738:2: rule__NotSame__Group__2__Impl
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
    // InternalAdeptness.g:5744:1: rule__NotSame__Group__2__Impl : ( ( rule__NotSame__Alternatives_2 )? ) ;
    public final void rule__NotSame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5748:1: ( ( ( rule__NotSame__Alternatives_2 )? ) )
            // InternalAdeptness.g:5749:1: ( ( rule__NotSame__Alternatives_2 )? )
            {
            // InternalAdeptness.g:5749:1: ( ( rule__NotSame__Alternatives_2 )? )
            // InternalAdeptness.g:5750:2: ( rule__NotSame__Alternatives_2 )?
            {
             before(grammarAccess.getNotSameAccess().getAlternatives_2()); 
            // InternalAdeptness.g:5751:2: ( rule__NotSame__Alternatives_2 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==78||(LA45_0>=80 && LA45_0<=81)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAdeptness.g:5751:3: rule__NotSame__Alternatives_2
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
    // InternalAdeptness.g:5760:1: rule__Upper__Group__0 : rule__Upper__Group__0__Impl rule__Upper__Group__1 ;
    public final void rule__Upper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5764:1: ( rule__Upper__Group__0__Impl rule__Upper__Group__1 )
            // InternalAdeptness.g:5765:2: rule__Upper__Group__0__Impl rule__Upper__Group__1
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
    // InternalAdeptness.g:5772:1: rule__Upper__Group__0__Impl : ( 'is below' ) ;
    public final void rule__Upper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5776:1: ( ( 'is below' ) )
            // InternalAdeptness.g:5777:1: ( 'is below' )
            {
            // InternalAdeptness.g:5777:1: ( 'is below' )
            // InternalAdeptness.g:5778:2: 'is below'
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
    // InternalAdeptness.g:5787:1: rule__Upper__Group__1 : rule__Upper__Group__1__Impl rule__Upper__Group__2 ;
    public final void rule__Upper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5791:1: ( rule__Upper__Group__1__Impl rule__Upper__Group__2 )
            // InternalAdeptness.g:5792:2: rule__Upper__Group__1__Impl rule__Upper__Group__2
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
    // InternalAdeptness.g:5799:1: rule__Upper__Group__1__Impl : ( ( rule__Upper__Bound_uppAssignment_1 ) ) ;
    public final void rule__Upper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5803:1: ( ( ( rule__Upper__Bound_uppAssignment_1 ) ) )
            // InternalAdeptness.g:5804:1: ( ( rule__Upper__Bound_uppAssignment_1 ) )
            {
            // InternalAdeptness.g:5804:1: ( ( rule__Upper__Bound_uppAssignment_1 ) )
            // InternalAdeptness.g:5805:2: ( rule__Upper__Bound_uppAssignment_1 )
            {
             before(grammarAccess.getUpperAccess().getBound_uppAssignment_1()); 
            // InternalAdeptness.g:5806:2: ( rule__Upper__Bound_uppAssignment_1 )
            // InternalAdeptness.g:5806:3: rule__Upper__Bound_uppAssignment_1
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
    // InternalAdeptness.g:5814:1: rule__Upper__Group__2 : rule__Upper__Group__2__Impl ;
    public final void rule__Upper__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5818:1: ( rule__Upper__Group__2__Impl )
            // InternalAdeptness.g:5819:2: rule__Upper__Group__2__Impl
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
    // InternalAdeptness.g:5825:1: rule__Upper__Group__2__Impl : ( ( rule__Upper__Alternatives_2 )? ) ;
    public final void rule__Upper__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5829:1: ( ( ( rule__Upper__Alternatives_2 )? ) )
            // InternalAdeptness.g:5830:1: ( ( rule__Upper__Alternatives_2 )? )
            {
            // InternalAdeptness.g:5830:1: ( ( rule__Upper__Alternatives_2 )? )
            // InternalAdeptness.g:5831:2: ( rule__Upper__Alternatives_2 )?
            {
             before(grammarAccess.getUpperAccess().getAlternatives_2()); 
            // InternalAdeptness.g:5832:2: ( rule__Upper__Alternatives_2 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==78||(LA46_0>=80 && LA46_0<=81)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAdeptness.g:5832:3: rule__Upper__Alternatives_2
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
    // InternalAdeptness.g:5841:1: rule__Lower__Group__0 : rule__Lower__Group__0__Impl rule__Lower__Group__1 ;
    public final void rule__Lower__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5845:1: ( rule__Lower__Group__0__Impl rule__Lower__Group__1 )
            // InternalAdeptness.g:5846:2: rule__Lower__Group__0__Impl rule__Lower__Group__1
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
    // InternalAdeptness.g:5853:1: rule__Lower__Group__0__Impl : ( 'is above' ) ;
    public final void rule__Lower__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5857:1: ( ( 'is above' ) )
            // InternalAdeptness.g:5858:1: ( 'is above' )
            {
            // InternalAdeptness.g:5858:1: ( 'is above' )
            // InternalAdeptness.g:5859:2: 'is above'
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
    // InternalAdeptness.g:5868:1: rule__Lower__Group__1 : rule__Lower__Group__1__Impl rule__Lower__Group__2 ;
    public final void rule__Lower__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5872:1: ( rule__Lower__Group__1__Impl rule__Lower__Group__2 )
            // InternalAdeptness.g:5873:2: rule__Lower__Group__1__Impl rule__Lower__Group__2
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
    // InternalAdeptness.g:5880:1: rule__Lower__Group__1__Impl : ( ( rule__Lower__Bound_lowerAssignment_1 ) ) ;
    public final void rule__Lower__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5884:1: ( ( ( rule__Lower__Bound_lowerAssignment_1 ) ) )
            // InternalAdeptness.g:5885:1: ( ( rule__Lower__Bound_lowerAssignment_1 ) )
            {
            // InternalAdeptness.g:5885:1: ( ( rule__Lower__Bound_lowerAssignment_1 ) )
            // InternalAdeptness.g:5886:2: ( rule__Lower__Bound_lowerAssignment_1 )
            {
             before(grammarAccess.getLowerAccess().getBound_lowerAssignment_1()); 
            // InternalAdeptness.g:5887:2: ( rule__Lower__Bound_lowerAssignment_1 )
            // InternalAdeptness.g:5887:3: rule__Lower__Bound_lowerAssignment_1
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
    // InternalAdeptness.g:5895:1: rule__Lower__Group__2 : rule__Lower__Group__2__Impl ;
    public final void rule__Lower__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5899:1: ( rule__Lower__Group__2__Impl )
            // InternalAdeptness.g:5900:2: rule__Lower__Group__2__Impl
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
    // InternalAdeptness.g:5906:1: rule__Lower__Group__2__Impl : ( ( rule__Lower__Alternatives_2 )? ) ;
    public final void rule__Lower__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5910:1: ( ( ( rule__Lower__Alternatives_2 )? ) )
            // InternalAdeptness.g:5911:1: ( ( rule__Lower__Alternatives_2 )? )
            {
            // InternalAdeptness.g:5911:1: ( ( rule__Lower__Alternatives_2 )? )
            // InternalAdeptness.g:5912:2: ( rule__Lower__Alternatives_2 )?
            {
             before(grammarAccess.getLowerAccess().getAlternatives_2()); 
            // InternalAdeptness.g:5913:2: ( rule__Lower__Alternatives_2 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==78||(LA47_0>=80 && LA47_0<=81)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAdeptness.g:5913:3: rule__Lower__Alternatives_2
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
    // InternalAdeptness.g:5922:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5926:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // InternalAdeptness.g:5927:2: rule__Range__Group__0__Impl rule__Range__Group__1
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
    // InternalAdeptness.g:5934:1: rule__Range__Group__0__Impl : ( 'is in range between' ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5938:1: ( ( 'is in range between' ) )
            // InternalAdeptness.g:5939:1: ( 'is in range between' )
            {
            // InternalAdeptness.g:5939:1: ( 'is in range between' )
            // InternalAdeptness.g:5940:2: 'is in range between'
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
    // InternalAdeptness.g:5949:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5953:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // InternalAdeptness.g:5954:2: rule__Range__Group__1__Impl rule__Range__Group__2
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
    // InternalAdeptness.g:5961:1: rule__Range__Group__1__Impl : ( ( rule__Range__Bound_lowerAssignment_1 ) ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5965:1: ( ( ( rule__Range__Bound_lowerAssignment_1 ) ) )
            // InternalAdeptness.g:5966:1: ( ( rule__Range__Bound_lowerAssignment_1 ) )
            {
            // InternalAdeptness.g:5966:1: ( ( rule__Range__Bound_lowerAssignment_1 ) )
            // InternalAdeptness.g:5967:2: ( rule__Range__Bound_lowerAssignment_1 )
            {
             before(grammarAccess.getRangeAccess().getBound_lowerAssignment_1()); 
            // InternalAdeptness.g:5968:2: ( rule__Range__Bound_lowerAssignment_1 )
            // InternalAdeptness.g:5968:3: rule__Range__Bound_lowerAssignment_1
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
    // InternalAdeptness.g:5976:1: rule__Range__Group__2 : rule__Range__Group__2__Impl rule__Range__Group__3 ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5980:1: ( rule__Range__Group__2__Impl rule__Range__Group__3 )
            // InternalAdeptness.g:5981:2: rule__Range__Group__2__Impl rule__Range__Group__3
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
    // InternalAdeptness.g:5988:1: rule__Range__Group__2__Impl : ( 'and' ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5992:1: ( ( 'and' ) )
            // InternalAdeptness.g:5993:1: ( 'and' )
            {
            // InternalAdeptness.g:5993:1: ( 'and' )
            // InternalAdeptness.g:5994:2: 'and'
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
    // InternalAdeptness.g:6003:1: rule__Range__Group__3 : rule__Range__Group__3__Impl rule__Range__Group__4 ;
    public final void rule__Range__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6007:1: ( rule__Range__Group__3__Impl rule__Range__Group__4 )
            // InternalAdeptness.g:6008:2: rule__Range__Group__3__Impl rule__Range__Group__4
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
    // InternalAdeptness.g:6015:1: rule__Range__Group__3__Impl : ( ( rule__Range__Bound_uppAssignment_3 ) ) ;
    public final void rule__Range__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6019:1: ( ( ( rule__Range__Bound_uppAssignment_3 ) ) )
            // InternalAdeptness.g:6020:1: ( ( rule__Range__Bound_uppAssignment_3 ) )
            {
            // InternalAdeptness.g:6020:1: ( ( rule__Range__Bound_uppAssignment_3 ) )
            // InternalAdeptness.g:6021:2: ( rule__Range__Bound_uppAssignment_3 )
            {
             before(grammarAccess.getRangeAccess().getBound_uppAssignment_3()); 
            // InternalAdeptness.g:6022:2: ( rule__Range__Bound_uppAssignment_3 )
            // InternalAdeptness.g:6022:3: rule__Range__Bound_uppAssignment_3
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
    // InternalAdeptness.g:6030:1: rule__Range__Group__4 : rule__Range__Group__4__Impl ;
    public final void rule__Range__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6034:1: ( rule__Range__Group__4__Impl )
            // InternalAdeptness.g:6035:2: rule__Range__Group__4__Impl
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
    // InternalAdeptness.g:6041:1: rule__Range__Group__4__Impl : ( ( rule__Range__Alternatives_4 )? ) ;
    public final void rule__Range__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6045:1: ( ( ( rule__Range__Alternatives_4 )? ) )
            // InternalAdeptness.g:6046:1: ( ( rule__Range__Alternatives_4 )? )
            {
            // InternalAdeptness.g:6046:1: ( ( rule__Range__Alternatives_4 )? )
            // InternalAdeptness.g:6047:2: ( rule__Range__Alternatives_4 )?
            {
             before(grammarAccess.getRangeAccess().getAlternatives_4()); 
            // InternalAdeptness.g:6048:2: ( rule__Range__Alternatives_4 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==78||(LA48_0>=80 && LA48_0<=81)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAdeptness.g:6048:3: rule__Range__Alternatives_4
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
    // InternalAdeptness.g:6057:1: rule__Gap__Group__0 : rule__Gap__Group__0__Impl rule__Gap__Group__1 ;
    public final void rule__Gap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6061:1: ( rule__Gap__Group__0__Impl rule__Gap__Group__1 )
            // InternalAdeptness.g:6062:2: rule__Gap__Group__0__Impl rule__Gap__Group__1
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
    // InternalAdeptness.g:6069:1: rule__Gap__Group__0__Impl : ( 'not in range between' ) ;
    public final void rule__Gap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6073:1: ( ( 'not in range between' ) )
            // InternalAdeptness.g:6074:1: ( 'not in range between' )
            {
            // InternalAdeptness.g:6074:1: ( 'not in range between' )
            // InternalAdeptness.g:6075:2: 'not in range between'
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
    // InternalAdeptness.g:6084:1: rule__Gap__Group__1 : rule__Gap__Group__1__Impl rule__Gap__Group__2 ;
    public final void rule__Gap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6088:1: ( rule__Gap__Group__1__Impl rule__Gap__Group__2 )
            // InternalAdeptness.g:6089:2: rule__Gap__Group__1__Impl rule__Gap__Group__2
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
    // InternalAdeptness.g:6096:1: rule__Gap__Group__1__Impl : ( ( rule__Gap__Bound_lowerAssignment_1 ) ) ;
    public final void rule__Gap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6100:1: ( ( ( rule__Gap__Bound_lowerAssignment_1 ) ) )
            // InternalAdeptness.g:6101:1: ( ( rule__Gap__Bound_lowerAssignment_1 ) )
            {
            // InternalAdeptness.g:6101:1: ( ( rule__Gap__Bound_lowerAssignment_1 ) )
            // InternalAdeptness.g:6102:2: ( rule__Gap__Bound_lowerAssignment_1 )
            {
             before(grammarAccess.getGapAccess().getBound_lowerAssignment_1()); 
            // InternalAdeptness.g:6103:2: ( rule__Gap__Bound_lowerAssignment_1 )
            // InternalAdeptness.g:6103:3: rule__Gap__Bound_lowerAssignment_1
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
    // InternalAdeptness.g:6111:1: rule__Gap__Group__2 : rule__Gap__Group__2__Impl rule__Gap__Group__3 ;
    public final void rule__Gap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6115:1: ( rule__Gap__Group__2__Impl rule__Gap__Group__3 )
            // InternalAdeptness.g:6116:2: rule__Gap__Group__2__Impl rule__Gap__Group__3
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
    // InternalAdeptness.g:6123:1: rule__Gap__Group__2__Impl : ( 'and' ) ;
    public final void rule__Gap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6127:1: ( ( 'and' ) )
            // InternalAdeptness.g:6128:1: ( 'and' )
            {
            // InternalAdeptness.g:6128:1: ( 'and' )
            // InternalAdeptness.g:6129:2: 'and'
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
    // InternalAdeptness.g:6138:1: rule__Gap__Group__3 : rule__Gap__Group__3__Impl rule__Gap__Group__4 ;
    public final void rule__Gap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6142:1: ( rule__Gap__Group__3__Impl rule__Gap__Group__4 )
            // InternalAdeptness.g:6143:2: rule__Gap__Group__3__Impl rule__Gap__Group__4
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
    // InternalAdeptness.g:6150:1: rule__Gap__Group__3__Impl : ( ( rule__Gap__Bound_uppAssignment_3 ) ) ;
    public final void rule__Gap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6154:1: ( ( ( rule__Gap__Bound_uppAssignment_3 ) ) )
            // InternalAdeptness.g:6155:1: ( ( rule__Gap__Bound_uppAssignment_3 ) )
            {
            // InternalAdeptness.g:6155:1: ( ( rule__Gap__Bound_uppAssignment_3 ) )
            // InternalAdeptness.g:6156:2: ( rule__Gap__Bound_uppAssignment_3 )
            {
             before(grammarAccess.getGapAccess().getBound_uppAssignment_3()); 
            // InternalAdeptness.g:6157:2: ( rule__Gap__Bound_uppAssignment_3 )
            // InternalAdeptness.g:6157:3: rule__Gap__Bound_uppAssignment_3
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
    // InternalAdeptness.g:6165:1: rule__Gap__Group__4 : rule__Gap__Group__4__Impl ;
    public final void rule__Gap__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6169:1: ( rule__Gap__Group__4__Impl )
            // InternalAdeptness.g:6170:2: rule__Gap__Group__4__Impl
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
    // InternalAdeptness.g:6176:1: rule__Gap__Group__4__Impl : ( ( rule__Gap__Alternatives_4 )? ) ;
    public final void rule__Gap__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6180:1: ( ( ( rule__Gap__Alternatives_4 )? ) )
            // InternalAdeptness.g:6181:1: ( ( rule__Gap__Alternatives_4 )? )
            {
            // InternalAdeptness.g:6181:1: ( ( rule__Gap__Alternatives_4 )? )
            // InternalAdeptness.g:6182:2: ( rule__Gap__Alternatives_4 )?
            {
             before(grammarAccess.getGapAccess().getAlternatives_4()); 
            // InternalAdeptness.g:6183:2: ( rule__Gap__Alternatives_4 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==78||(LA49_0>=80 && LA49_0<=81)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAdeptness.g:6183:3: rule__Gap__Alternatives_4
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
    // InternalAdeptness.g:6192:1: rule__Exactly__Group__0 : rule__Exactly__Group__0__Impl rule__Exactly__Group__1 ;
    public final void rule__Exactly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6196:1: ( rule__Exactly__Group__0__Impl rule__Exactly__Group__1 )
            // InternalAdeptness.g:6197:2: rule__Exactly__Group__0__Impl rule__Exactly__Group__1
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
    // InternalAdeptness.g:6204:1: rule__Exactly__Group__0__Impl : ( 'exactly' ) ;
    public final void rule__Exactly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6208:1: ( ( 'exactly' ) )
            // InternalAdeptness.g:6209:1: ( 'exactly' )
            {
            // InternalAdeptness.g:6209:1: ( 'exactly' )
            // InternalAdeptness.g:6210:2: 'exactly'
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
    // InternalAdeptness.g:6219:1: rule__Exactly__Group__1 : rule__Exactly__Group__1__Impl rule__Exactly__Group__2 ;
    public final void rule__Exactly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6223:1: ( rule__Exactly__Group__1__Impl rule__Exactly__Group__2 )
            // InternalAdeptness.g:6224:2: rule__Exactly__Group__1__Impl rule__Exactly__Group__2
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
    // InternalAdeptness.g:6231:1: rule__Exactly__Group__1__Impl : ( ( rule__Exactly__ValueAssignment_1 ) ) ;
    public final void rule__Exactly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6235:1: ( ( ( rule__Exactly__ValueAssignment_1 ) ) )
            // InternalAdeptness.g:6236:1: ( ( rule__Exactly__ValueAssignment_1 ) )
            {
            // InternalAdeptness.g:6236:1: ( ( rule__Exactly__ValueAssignment_1 ) )
            // InternalAdeptness.g:6237:2: ( rule__Exactly__ValueAssignment_1 )
            {
             before(grammarAccess.getExactlyAccess().getValueAssignment_1()); 
            // InternalAdeptness.g:6238:2: ( rule__Exactly__ValueAssignment_1 )
            // InternalAdeptness.g:6238:3: rule__Exactly__ValueAssignment_1
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
    // InternalAdeptness.g:6246:1: rule__Exactly__Group__2 : rule__Exactly__Group__2__Impl ;
    public final void rule__Exactly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6250:1: ( rule__Exactly__Group__2__Impl )
            // InternalAdeptness.g:6251:2: rule__Exactly__Group__2__Impl
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
    // InternalAdeptness.g:6257:1: rule__Exactly__Group__2__Impl : ( ( rule__Exactly__Alternatives_2 ) ) ;
    public final void rule__Exactly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6261:1: ( ( ( rule__Exactly__Alternatives_2 ) ) )
            // InternalAdeptness.g:6262:1: ( ( rule__Exactly__Alternatives_2 ) )
            {
            // InternalAdeptness.g:6262:1: ( ( rule__Exactly__Alternatives_2 ) )
            // InternalAdeptness.g:6263:2: ( rule__Exactly__Alternatives_2 )
            {
             before(grammarAccess.getExactlyAccess().getAlternatives_2()); 
            // InternalAdeptness.g:6264:2: ( rule__Exactly__Alternatives_2 )
            // InternalAdeptness.g:6264:3: rule__Exactly__Alternatives_2
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
    // InternalAdeptness.g:6273:1: rule__Exactly__Group_2_1__0 : rule__Exactly__Group_2_1__0__Impl rule__Exactly__Group_2_1__1 ;
    public final void rule__Exactly__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6277:1: ( rule__Exactly__Group_2_1__0__Impl rule__Exactly__Group_2_1__1 )
            // InternalAdeptness.g:6278:2: rule__Exactly__Group_2_1__0__Impl rule__Exactly__Group_2_1__1
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
    // InternalAdeptness.g:6285:1: rule__Exactly__Group_2_1__0__Impl : ( 'times in' ) ;
    public final void rule__Exactly__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6289:1: ( ( 'times in' ) )
            // InternalAdeptness.g:6290:1: ( 'times in' )
            {
            // InternalAdeptness.g:6290:1: ( 'times in' )
            // InternalAdeptness.g:6291:2: 'times in'
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
    // InternalAdeptness.g:6300:1: rule__Exactly__Group_2_1__1 : rule__Exactly__Group_2_1__1__Impl rule__Exactly__Group_2_1__2 ;
    public final void rule__Exactly__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6304:1: ( rule__Exactly__Group_2_1__1__Impl rule__Exactly__Group_2_1__2 )
            // InternalAdeptness.g:6305:2: rule__Exactly__Group_2_1__1__Impl rule__Exactly__Group_2_1__2
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
    // InternalAdeptness.g:6312:1: rule__Exactly__Group_2_1__1__Impl : ( ( rule__Exactly__TimeAssignment_2_1_1 ) ) ;
    public final void rule__Exactly__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6316:1: ( ( ( rule__Exactly__TimeAssignment_2_1_1 ) ) )
            // InternalAdeptness.g:6317:1: ( ( rule__Exactly__TimeAssignment_2_1_1 ) )
            {
            // InternalAdeptness.g:6317:1: ( ( rule__Exactly__TimeAssignment_2_1_1 ) )
            // InternalAdeptness.g:6318:2: ( rule__Exactly__TimeAssignment_2_1_1 )
            {
             before(grammarAccess.getExactlyAccess().getTimeAssignment_2_1_1()); 
            // InternalAdeptness.g:6319:2: ( rule__Exactly__TimeAssignment_2_1_1 )
            // InternalAdeptness.g:6319:3: rule__Exactly__TimeAssignment_2_1_1
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
    // InternalAdeptness.g:6327:1: rule__Exactly__Group_2_1__2 : rule__Exactly__Group_2_1__2__Impl ;
    public final void rule__Exactly__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6331:1: ( rule__Exactly__Group_2_1__2__Impl )
            // InternalAdeptness.g:6332:2: rule__Exactly__Group_2_1__2__Impl
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
    // InternalAdeptness.g:6338:1: rule__Exactly__Group_2_1__2__Impl : ( ( rule__Exactly__UnitAssignment_2_1_2 ) ) ;
    public final void rule__Exactly__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6342:1: ( ( ( rule__Exactly__UnitAssignment_2_1_2 ) ) )
            // InternalAdeptness.g:6343:1: ( ( rule__Exactly__UnitAssignment_2_1_2 ) )
            {
            // InternalAdeptness.g:6343:1: ( ( rule__Exactly__UnitAssignment_2_1_2 ) )
            // InternalAdeptness.g:6344:2: ( rule__Exactly__UnitAssignment_2_1_2 )
            {
             before(grammarAccess.getExactlyAccess().getUnitAssignment_2_1_2()); 
            // InternalAdeptness.g:6345:2: ( rule__Exactly__UnitAssignment_2_1_2 )
            // InternalAdeptness.g:6345:3: rule__Exactly__UnitAssignment_2_1_2
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
    // InternalAdeptness.g:6354:1: rule__At_most__Group__0 : rule__At_most__Group__0__Impl rule__At_most__Group__1 ;
    public final void rule__At_most__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6358:1: ( rule__At_most__Group__0__Impl rule__At_most__Group__1 )
            // InternalAdeptness.g:6359:2: rule__At_most__Group__0__Impl rule__At_most__Group__1
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
    // InternalAdeptness.g:6366:1: rule__At_most__Group__0__Impl : ( 'at most' ) ;
    public final void rule__At_most__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6370:1: ( ( 'at most' ) )
            // InternalAdeptness.g:6371:1: ( 'at most' )
            {
            // InternalAdeptness.g:6371:1: ( 'at most' )
            // InternalAdeptness.g:6372:2: 'at most'
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
    // InternalAdeptness.g:6381:1: rule__At_most__Group__1 : rule__At_most__Group__1__Impl rule__At_most__Group__2 ;
    public final void rule__At_most__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6385:1: ( rule__At_most__Group__1__Impl rule__At_most__Group__2 )
            // InternalAdeptness.g:6386:2: rule__At_most__Group__1__Impl rule__At_most__Group__2
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
    // InternalAdeptness.g:6393:1: rule__At_most__Group__1__Impl : ( ( rule__At_most__ValueAssignment_1 ) ) ;
    public final void rule__At_most__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6397:1: ( ( ( rule__At_most__ValueAssignment_1 ) ) )
            // InternalAdeptness.g:6398:1: ( ( rule__At_most__ValueAssignment_1 ) )
            {
            // InternalAdeptness.g:6398:1: ( ( rule__At_most__ValueAssignment_1 ) )
            // InternalAdeptness.g:6399:2: ( rule__At_most__ValueAssignment_1 )
            {
             before(grammarAccess.getAt_mostAccess().getValueAssignment_1()); 
            // InternalAdeptness.g:6400:2: ( rule__At_most__ValueAssignment_1 )
            // InternalAdeptness.g:6400:3: rule__At_most__ValueAssignment_1
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
    // InternalAdeptness.g:6408:1: rule__At_most__Group__2 : rule__At_most__Group__2__Impl ;
    public final void rule__At_most__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6412:1: ( rule__At_most__Group__2__Impl )
            // InternalAdeptness.g:6413:2: rule__At_most__Group__2__Impl
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
    // InternalAdeptness.g:6419:1: rule__At_most__Group__2__Impl : ( ( rule__At_most__Alternatives_2 ) ) ;
    public final void rule__At_most__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6423:1: ( ( ( rule__At_most__Alternatives_2 ) ) )
            // InternalAdeptness.g:6424:1: ( ( rule__At_most__Alternatives_2 ) )
            {
            // InternalAdeptness.g:6424:1: ( ( rule__At_most__Alternatives_2 ) )
            // InternalAdeptness.g:6425:2: ( rule__At_most__Alternatives_2 )
            {
             before(grammarAccess.getAt_mostAccess().getAlternatives_2()); 
            // InternalAdeptness.g:6426:2: ( rule__At_most__Alternatives_2 )
            // InternalAdeptness.g:6426:3: rule__At_most__Alternatives_2
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
    // InternalAdeptness.g:6435:1: rule__At_most__Group_2_1__0 : rule__At_most__Group_2_1__0__Impl rule__At_most__Group_2_1__1 ;
    public final void rule__At_most__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6439:1: ( rule__At_most__Group_2_1__0__Impl rule__At_most__Group_2_1__1 )
            // InternalAdeptness.g:6440:2: rule__At_most__Group_2_1__0__Impl rule__At_most__Group_2_1__1
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
    // InternalAdeptness.g:6447:1: rule__At_most__Group_2_1__0__Impl : ( 'times in' ) ;
    public final void rule__At_most__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6451:1: ( ( 'times in' ) )
            // InternalAdeptness.g:6452:1: ( 'times in' )
            {
            // InternalAdeptness.g:6452:1: ( 'times in' )
            // InternalAdeptness.g:6453:2: 'times in'
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
    // InternalAdeptness.g:6462:1: rule__At_most__Group_2_1__1 : rule__At_most__Group_2_1__1__Impl rule__At_most__Group_2_1__2 ;
    public final void rule__At_most__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6466:1: ( rule__At_most__Group_2_1__1__Impl rule__At_most__Group_2_1__2 )
            // InternalAdeptness.g:6467:2: rule__At_most__Group_2_1__1__Impl rule__At_most__Group_2_1__2
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
    // InternalAdeptness.g:6474:1: rule__At_most__Group_2_1__1__Impl : ( ( rule__At_most__TimeAssignment_2_1_1 ) ) ;
    public final void rule__At_most__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6478:1: ( ( ( rule__At_most__TimeAssignment_2_1_1 ) ) )
            // InternalAdeptness.g:6479:1: ( ( rule__At_most__TimeAssignment_2_1_1 ) )
            {
            // InternalAdeptness.g:6479:1: ( ( rule__At_most__TimeAssignment_2_1_1 ) )
            // InternalAdeptness.g:6480:2: ( rule__At_most__TimeAssignment_2_1_1 )
            {
             before(grammarAccess.getAt_mostAccess().getTimeAssignment_2_1_1()); 
            // InternalAdeptness.g:6481:2: ( rule__At_most__TimeAssignment_2_1_1 )
            // InternalAdeptness.g:6481:3: rule__At_most__TimeAssignment_2_1_1
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
    // InternalAdeptness.g:6489:1: rule__At_most__Group_2_1__2 : rule__At_most__Group_2_1__2__Impl ;
    public final void rule__At_most__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6493:1: ( rule__At_most__Group_2_1__2__Impl )
            // InternalAdeptness.g:6494:2: rule__At_most__Group_2_1__2__Impl
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
    // InternalAdeptness.g:6500:1: rule__At_most__Group_2_1__2__Impl : ( ( rule__At_most__UnitAssignment_2_1_2 ) ) ;
    public final void rule__At_most__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6504:1: ( ( ( rule__At_most__UnitAssignment_2_1_2 ) ) )
            // InternalAdeptness.g:6505:1: ( ( rule__At_most__UnitAssignment_2_1_2 ) )
            {
            // InternalAdeptness.g:6505:1: ( ( rule__At_most__UnitAssignment_2_1_2 ) )
            // InternalAdeptness.g:6506:2: ( rule__At_most__UnitAssignment_2_1_2 )
            {
             before(grammarAccess.getAt_mostAccess().getUnitAssignment_2_1_2()); 
            // InternalAdeptness.g:6507:2: ( rule__At_most__UnitAssignment_2_1_2 )
            // InternalAdeptness.g:6507:3: rule__At_most__UnitAssignment_2_1_2
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
    // InternalAdeptness.g:6516:1: rule__At_least__Group__0 : rule__At_least__Group__0__Impl rule__At_least__Group__1 ;
    public final void rule__At_least__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6520:1: ( rule__At_least__Group__0__Impl rule__At_least__Group__1 )
            // InternalAdeptness.g:6521:2: rule__At_least__Group__0__Impl rule__At_least__Group__1
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
    // InternalAdeptness.g:6528:1: rule__At_least__Group__0__Impl : ( 'at least' ) ;
    public final void rule__At_least__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6532:1: ( ( 'at least' ) )
            // InternalAdeptness.g:6533:1: ( 'at least' )
            {
            // InternalAdeptness.g:6533:1: ( 'at least' )
            // InternalAdeptness.g:6534:2: 'at least'
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
    // InternalAdeptness.g:6543:1: rule__At_least__Group__1 : rule__At_least__Group__1__Impl rule__At_least__Group__2 ;
    public final void rule__At_least__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6547:1: ( rule__At_least__Group__1__Impl rule__At_least__Group__2 )
            // InternalAdeptness.g:6548:2: rule__At_least__Group__1__Impl rule__At_least__Group__2
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
    // InternalAdeptness.g:6555:1: rule__At_least__Group__1__Impl : ( ( rule__At_least__ValueAssignment_1 ) ) ;
    public final void rule__At_least__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6559:1: ( ( ( rule__At_least__ValueAssignment_1 ) ) )
            // InternalAdeptness.g:6560:1: ( ( rule__At_least__ValueAssignment_1 ) )
            {
            // InternalAdeptness.g:6560:1: ( ( rule__At_least__ValueAssignment_1 ) )
            // InternalAdeptness.g:6561:2: ( rule__At_least__ValueAssignment_1 )
            {
             before(grammarAccess.getAt_leastAccess().getValueAssignment_1()); 
            // InternalAdeptness.g:6562:2: ( rule__At_least__ValueAssignment_1 )
            // InternalAdeptness.g:6562:3: rule__At_least__ValueAssignment_1
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
    // InternalAdeptness.g:6570:1: rule__At_least__Group__2 : rule__At_least__Group__2__Impl ;
    public final void rule__At_least__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6574:1: ( rule__At_least__Group__2__Impl )
            // InternalAdeptness.g:6575:2: rule__At_least__Group__2__Impl
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
    // InternalAdeptness.g:6581:1: rule__At_least__Group__2__Impl : ( ( rule__At_least__Alternatives_2 ) ) ;
    public final void rule__At_least__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6585:1: ( ( ( rule__At_least__Alternatives_2 ) ) )
            // InternalAdeptness.g:6586:1: ( ( rule__At_least__Alternatives_2 ) )
            {
            // InternalAdeptness.g:6586:1: ( ( rule__At_least__Alternatives_2 ) )
            // InternalAdeptness.g:6587:2: ( rule__At_least__Alternatives_2 )
            {
             before(grammarAccess.getAt_leastAccess().getAlternatives_2()); 
            // InternalAdeptness.g:6588:2: ( rule__At_least__Alternatives_2 )
            // InternalAdeptness.g:6588:3: rule__At_least__Alternatives_2
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
    // InternalAdeptness.g:6597:1: rule__At_least__Group_2_1__0 : rule__At_least__Group_2_1__0__Impl rule__At_least__Group_2_1__1 ;
    public final void rule__At_least__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6601:1: ( rule__At_least__Group_2_1__0__Impl rule__At_least__Group_2_1__1 )
            // InternalAdeptness.g:6602:2: rule__At_least__Group_2_1__0__Impl rule__At_least__Group_2_1__1
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
    // InternalAdeptness.g:6609:1: rule__At_least__Group_2_1__0__Impl : ( 'times in' ) ;
    public final void rule__At_least__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6613:1: ( ( 'times in' ) )
            // InternalAdeptness.g:6614:1: ( 'times in' )
            {
            // InternalAdeptness.g:6614:1: ( 'times in' )
            // InternalAdeptness.g:6615:2: 'times in'
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
    // InternalAdeptness.g:6624:1: rule__At_least__Group_2_1__1 : rule__At_least__Group_2_1__1__Impl rule__At_least__Group_2_1__2 ;
    public final void rule__At_least__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6628:1: ( rule__At_least__Group_2_1__1__Impl rule__At_least__Group_2_1__2 )
            // InternalAdeptness.g:6629:2: rule__At_least__Group_2_1__1__Impl rule__At_least__Group_2_1__2
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
    // InternalAdeptness.g:6636:1: rule__At_least__Group_2_1__1__Impl : ( ( rule__At_least__TimeAssignment_2_1_1 ) ) ;
    public final void rule__At_least__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6640:1: ( ( ( rule__At_least__TimeAssignment_2_1_1 ) ) )
            // InternalAdeptness.g:6641:1: ( ( rule__At_least__TimeAssignment_2_1_1 ) )
            {
            // InternalAdeptness.g:6641:1: ( ( rule__At_least__TimeAssignment_2_1_1 ) )
            // InternalAdeptness.g:6642:2: ( rule__At_least__TimeAssignment_2_1_1 )
            {
             before(grammarAccess.getAt_leastAccess().getTimeAssignment_2_1_1()); 
            // InternalAdeptness.g:6643:2: ( rule__At_least__TimeAssignment_2_1_1 )
            // InternalAdeptness.g:6643:3: rule__At_least__TimeAssignment_2_1_1
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
    // InternalAdeptness.g:6651:1: rule__At_least__Group_2_1__2 : rule__At_least__Group_2_1__2__Impl ;
    public final void rule__At_least__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6655:1: ( rule__At_least__Group_2_1__2__Impl )
            // InternalAdeptness.g:6656:2: rule__At_least__Group_2_1__2__Impl
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
    // InternalAdeptness.g:6662:1: rule__At_least__Group_2_1__2__Impl : ( ( rule__At_least__UnitAssignment_2_1_2 ) ) ;
    public final void rule__At_least__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6666:1: ( ( ( rule__At_least__UnitAssignment_2_1_2 ) ) )
            // InternalAdeptness.g:6667:1: ( ( rule__At_least__UnitAssignment_2_1_2 ) )
            {
            // InternalAdeptness.g:6667:1: ( ( rule__At_least__UnitAssignment_2_1_2 ) )
            // InternalAdeptness.g:6668:2: ( rule__At_least__UnitAssignment_2_1_2 )
            {
             before(grammarAccess.getAt_leastAccess().getUnitAssignment_2_1_2()); 
            // InternalAdeptness.g:6669:2: ( rule__At_least__UnitAssignment_2_1_2 )
            // InternalAdeptness.g:6669:3: rule__At_least__UnitAssignment_2_1_2
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
    // InternalAdeptness.g:6678:1: rule__D__Group__0 : rule__D__Group__0__Impl rule__D__Group__1 ;
    public final void rule__D__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6682:1: ( rule__D__Group__0__Impl rule__D__Group__1 )
            // InternalAdeptness.g:6683:2: rule__D__Group__0__Impl rule__D__Group__1
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
    // InternalAdeptness.g:6690:1: rule__D__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__D__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6694:1: ( ( ( '-' )? ) )
            // InternalAdeptness.g:6695:1: ( ( '-' )? )
            {
            // InternalAdeptness.g:6695:1: ( ( '-' )? )
            // InternalAdeptness.g:6696:2: ( '-' )?
            {
             before(grammarAccess.getDAccess().getHyphenMinusKeyword_0()); 
            // InternalAdeptness.g:6697:2: ( '-' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==25) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalAdeptness.g:6697:3: '-'
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
    // InternalAdeptness.g:6705:1: rule__D__Group__1 : rule__D__Group__1__Impl rule__D__Group__2 ;
    public final void rule__D__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6709:1: ( rule__D__Group__1__Impl rule__D__Group__2 )
            // InternalAdeptness.g:6710:2: rule__D__Group__1__Impl rule__D__Group__2
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
    // InternalAdeptness.g:6717:1: rule__D__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__D__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6721:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:6722:1: ( RULE_INT )
            {
            // InternalAdeptness.g:6722:1: ( RULE_INT )
            // InternalAdeptness.g:6723:2: RULE_INT
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
    // InternalAdeptness.g:6732:1: rule__D__Group__2 : rule__D__Group__2__Impl ;
    public final void rule__D__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6736:1: ( rule__D__Group__2__Impl )
            // InternalAdeptness.g:6737:2: rule__D__Group__2__Impl
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
    // InternalAdeptness.g:6743:1: rule__D__Group__2__Impl : ( ( rule__D__Group_2__0 )? ) ;
    public final void rule__D__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6747:1: ( ( ( rule__D__Group_2__0 )? ) )
            // InternalAdeptness.g:6748:1: ( ( rule__D__Group_2__0 )? )
            {
            // InternalAdeptness.g:6748:1: ( ( rule__D__Group_2__0 )? )
            // InternalAdeptness.g:6749:2: ( rule__D__Group_2__0 )?
            {
             before(grammarAccess.getDAccess().getGroup_2()); 
            // InternalAdeptness.g:6750:2: ( rule__D__Group_2__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==30) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAdeptness.g:6750:3: rule__D__Group_2__0
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
    // InternalAdeptness.g:6759:1: rule__D__Group_2__0 : rule__D__Group_2__0__Impl rule__D__Group_2__1 ;
    public final void rule__D__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6763:1: ( rule__D__Group_2__0__Impl rule__D__Group_2__1 )
            // InternalAdeptness.g:6764:2: rule__D__Group_2__0__Impl rule__D__Group_2__1
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
    // InternalAdeptness.g:6771:1: rule__D__Group_2__0__Impl : ( '.' ) ;
    public final void rule__D__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6775:1: ( ( '.' ) )
            // InternalAdeptness.g:6776:1: ( '.' )
            {
            // InternalAdeptness.g:6776:1: ( '.' )
            // InternalAdeptness.g:6777:2: '.'
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
    // InternalAdeptness.g:6786:1: rule__D__Group_2__1 : rule__D__Group_2__1__Impl ;
    public final void rule__D__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6790:1: ( rule__D__Group_2__1__Impl )
            // InternalAdeptness.g:6791:2: rule__D__Group_2__1__Impl
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
    // InternalAdeptness.g:6797:1: rule__D__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__D__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6801:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:6802:1: ( RULE_INT )
            {
            // InternalAdeptness.g:6802:1: ( RULE_INT )
            // InternalAdeptness.g:6803:2: RULE_INT
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
    // InternalAdeptness.g:6813:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6817:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalAdeptness.g:6818:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
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
    // InternalAdeptness.g:6825:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6829:1: ( ( 'datatype' ) )
            // InternalAdeptness.g:6830:1: ( 'datatype' )
            {
            // InternalAdeptness.g:6830:1: ( 'datatype' )
            // InternalAdeptness.g:6831:2: 'datatype'
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
    // InternalAdeptness.g:6840:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6844:1: ( rule__DataType__Group__1__Impl )
            // InternalAdeptness.g:6845:2: rule__DataType__Group__1__Impl
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
    // InternalAdeptness.g:6851:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6855:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalAdeptness.g:6856:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:6856:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalAdeptness.g:6857:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:6858:2: ( rule__DataType__NameAssignment_1 )
            // InternalAdeptness.g:6858:3: rule__DataType__NameAssignment_1
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
    // InternalAdeptness.g:6867:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6871:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // InternalAdeptness.g:6872:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
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
    // InternalAdeptness.g:6879:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6883:1: ( ( 'package' ) )
            // InternalAdeptness.g:6884:1: ( 'package' )
            {
            // InternalAdeptness.g:6884:1: ( 'package' )
            // InternalAdeptness.g:6885:2: 'package'
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
    // InternalAdeptness.g:6894:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6898:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // InternalAdeptness.g:6899:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
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
    // InternalAdeptness.g:6906:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6910:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // InternalAdeptness.g:6911:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:6911:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // InternalAdeptness.g:6912:2: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:6913:2: ( rule__PackageDeclaration__NameAssignment_1 )
            // InternalAdeptness.g:6913:3: rule__PackageDeclaration__NameAssignment_1
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
    // InternalAdeptness.g:6921:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6925:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // InternalAdeptness.g:6926:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
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
    // InternalAdeptness.g:6933:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6937:1: ( ( '{' ) )
            // InternalAdeptness.g:6938:1: ( '{' )
            {
            // InternalAdeptness.g:6938:1: ( '{' )
            // InternalAdeptness.g:6939:2: '{'
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
    // InternalAdeptness.g:6948:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6952:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // InternalAdeptness.g:6953:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
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
    // InternalAdeptness.g:6960:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6964:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) )
            // InternalAdeptness.g:6965:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            {
            // InternalAdeptness.g:6965:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            // InternalAdeptness.g:6966:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 
            // InternalAdeptness.g:6967:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==28||LA52_0==31||LA52_0==45||LA52_0==52||(LA52_0>=82 && LA52_0<=83)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalAdeptness.g:6967:3: rule__PackageDeclaration__ElementsAssignment_3
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
    // InternalAdeptness.g:6975:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6979:1: ( rule__PackageDeclaration__Group__4__Impl )
            // InternalAdeptness.g:6980:2: rule__PackageDeclaration__Group__4__Impl
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
    // InternalAdeptness.g:6986:1: rule__PackageDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6990:1: ( ( '}' ) )
            // InternalAdeptness.g:6991:1: ( '}' )
            {
            // InternalAdeptness.g:6991:1: ( '}' )
            // InternalAdeptness.g:6992:2: '}'
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
    // InternalAdeptness.g:7002:1: rule__AbstractElement2__Group__0 : rule__AbstractElement2__Group__0__Impl rule__AbstractElement2__Group__1 ;
    public final void rule__AbstractElement2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7006:1: ( rule__AbstractElement2__Group__0__Impl rule__AbstractElement2__Group__1 )
            // InternalAdeptness.g:7007:2: rule__AbstractElement2__Group__0__Impl rule__AbstractElement2__Group__1
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
    // InternalAdeptness.g:7014:1: rule__AbstractElement2__Group__0__Impl : ( ( rule__AbstractElement2__FrontParenthesesAssignment_0 )* ) ;
    public final void rule__AbstractElement2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7018:1: ( ( ( rule__AbstractElement2__FrontParenthesesAssignment_0 )* ) )
            // InternalAdeptness.g:7019:1: ( ( rule__AbstractElement2__FrontParenthesesAssignment_0 )* )
            {
            // InternalAdeptness.g:7019:1: ( ( rule__AbstractElement2__FrontParenthesesAssignment_0 )* )
            // InternalAdeptness.g:7020:2: ( rule__AbstractElement2__FrontParenthesesAssignment_0 )*
            {
             before(grammarAccess.getAbstractElement2Access().getFrontParenthesesAssignment_0()); 
            // InternalAdeptness.g:7021:2: ( rule__AbstractElement2__FrontParenthesesAssignment_0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==11) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalAdeptness.g:7021:3: rule__AbstractElement2__FrontParenthesesAssignment_0
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
    // InternalAdeptness.g:7029:1: rule__AbstractElement2__Group__1 : rule__AbstractElement2__Group__1__Impl rule__AbstractElement2__Group__2 ;
    public final void rule__AbstractElement2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7033:1: ( rule__AbstractElement2__Group__1__Impl rule__AbstractElement2__Group__2 )
            // InternalAdeptness.g:7034:2: rule__AbstractElement2__Group__1__Impl rule__AbstractElement2__Group__2
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
    // InternalAdeptness.g:7041:1: rule__AbstractElement2__Group__1__Impl : ( ( rule__AbstractElement2__Alternatives_1 ) ) ;
    public final void rule__AbstractElement2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7045:1: ( ( ( rule__AbstractElement2__Alternatives_1 ) ) )
            // InternalAdeptness.g:7046:1: ( ( rule__AbstractElement2__Alternatives_1 ) )
            {
            // InternalAdeptness.g:7046:1: ( ( rule__AbstractElement2__Alternatives_1 ) )
            // InternalAdeptness.g:7047:2: ( rule__AbstractElement2__Alternatives_1 )
            {
             before(grammarAccess.getAbstractElement2Access().getAlternatives_1()); 
            // InternalAdeptness.g:7048:2: ( rule__AbstractElement2__Alternatives_1 )
            // InternalAdeptness.g:7048:3: rule__AbstractElement2__Alternatives_1
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
    // InternalAdeptness.g:7056:1: rule__AbstractElement2__Group__2 : rule__AbstractElement2__Group__2__Impl ;
    public final void rule__AbstractElement2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7060:1: ( rule__AbstractElement2__Group__2__Impl )
            // InternalAdeptness.g:7061:2: rule__AbstractElement2__Group__2__Impl
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
    // InternalAdeptness.g:7067:1: rule__AbstractElement2__Group__2__Impl : ( ( rule__AbstractElement2__OpAssignment_2 )* ) ;
    public final void rule__AbstractElement2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7071:1: ( ( ( rule__AbstractElement2__OpAssignment_2 )* ) )
            // InternalAdeptness.g:7072:1: ( ( rule__AbstractElement2__OpAssignment_2 )* )
            {
            // InternalAdeptness.g:7072:1: ( ( rule__AbstractElement2__OpAssignment_2 )* )
            // InternalAdeptness.g:7073:2: ( rule__AbstractElement2__OpAssignment_2 )*
            {
             before(grammarAccess.getAbstractElement2Access().getOpAssignment_2()); 
            // InternalAdeptness.g:7074:2: ( rule__AbstractElement2__OpAssignment_2 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==37) ) {
                    alt54=1;
                }
                else if ( (LA54_0==12||(LA54_0>=16 && LA54_0<=27)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalAdeptness.g:7074:3: rule__AbstractElement2__OpAssignment_2
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
    // InternalAdeptness.g:7083:1: rule__Adeptness__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Adeptness__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7087:1: ( ( ruleAbstractElement ) )
            // InternalAdeptness.g:7088:2: ( ruleAbstractElement )
            {
            // InternalAdeptness.g:7088:2: ( ruleAbstractElement )
            // InternalAdeptness.g:7089:3: ruleAbstractElement
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
    // InternalAdeptness.g:7098:1: rule__Imports__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Imports__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7102:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalAdeptness.g:7103:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalAdeptness.g:7103:2: ( ruleQualifiedNameWithWildcard )
            // InternalAdeptness.g:7104:3: ruleQualifiedNameWithWildcard
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
    // InternalAdeptness.g:7113:1: rule__ValidationPlan__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ValidationPlan__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7117:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:7118:2: ( RULE_ID )
            {
            // InternalAdeptness.g:7118:2: ( RULE_ID )
            // InternalAdeptness.g:7119:3: RULE_ID
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
    // InternalAdeptness.g:7128:1: rule__ValidationPlan__SuperTypeAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ValidationPlan__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7132:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAdeptness.g:7133:2: ( ( ruleQualifiedName ) )
            {
            // InternalAdeptness.g:7133:2: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:7134:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getValidationPlanAccess().getSuperTypeMonitoringFileCrossReference_3_1_0()); 
            // InternalAdeptness.g:7135:3: ( ruleQualifiedName )
            // InternalAdeptness.g:7136:4: ruleQualifiedName
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
    // InternalAdeptness.g:7147:1: rule__ValidationPlan__TestAssignment_4 : ( ruleTest ) ;
    public final void rule__ValidationPlan__TestAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7151:1: ( ( ruleTest ) )
            // InternalAdeptness.g:7152:2: ( ruleTest )
            {
            // InternalAdeptness.g:7152:2: ( ruleTest )
            // InternalAdeptness.g:7153:3: ruleTest
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
    // InternalAdeptness.g:7162:1: rule__Test__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Test__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7166:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:7167:2: ( RULE_ID )
            {
            // InternalAdeptness.g:7167:2: ( RULE_ID )
            // InternalAdeptness.g:7168:3: RULE_ID
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
    // InternalAdeptness.g:7177:1: rule__Test__SutAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Test__SutAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7181:1: ( ( RULE_STRING ) )
            // InternalAdeptness.g:7182:2: ( RULE_STRING )
            {
            // InternalAdeptness.g:7182:2: ( RULE_STRING )
            // InternalAdeptness.g:7183:3: RULE_STRING
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
    // InternalAdeptness.g:7192:1: rule__Test__TestLevelAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Test__TestLevelAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7196:1: ( ( RULE_STRING ) )
            // InternalAdeptness.g:7197:2: ( RULE_STRING )
            {
            // InternalAdeptness.g:7197:2: ( RULE_STRING )
            // InternalAdeptness.g:7198:3: RULE_STRING
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
    // InternalAdeptness.g:7207:1: rule__Test__InputsAssignment_10 : ( ruleInputs ) ;
    public final void rule__Test__InputsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7211:1: ( ( ruleInputs ) )
            // InternalAdeptness.g:7212:2: ( ruleInputs )
            {
            // InternalAdeptness.g:7212:2: ( ruleInputs )
            // InternalAdeptness.g:7213:3: ruleInputs
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
    // InternalAdeptness.g:7222:1: rule__Test__OraclesAssignment_11 : ( ruleTestingOracle ) ;
    public final void rule__Test__OraclesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7226:1: ( ( ruleTestingOracle ) )
            // InternalAdeptness.g:7227:2: ( ruleTestingOracle )
            {
            // InternalAdeptness.g:7227:2: ( ruleTestingOracle )
            // InternalAdeptness.g:7228:3: ruleTestingOracle
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
    // InternalAdeptness.g:7237:1: rule__TestingOracle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TestingOracle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7241:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:7242:2: ( RULE_ID )
            {
            // InternalAdeptness.g:7242:2: ( RULE_ID )
            // InternalAdeptness.g:7243:3: RULE_ID
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
    // InternalAdeptness.g:7252:1: rule__TestingOracle__TypeAssignment_4 : ( RULE_STRING ) ;
    public final void rule__TestingOracle__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7256:1: ( ( RULE_STRING ) )
            // InternalAdeptness.g:7257:2: ( RULE_STRING )
            {
            // InternalAdeptness.g:7257:2: ( RULE_STRING )
            // InternalAdeptness.g:7258:3: RULE_STRING
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
    // InternalAdeptness.g:7267:1: rule__TestingOracle__ParametersAssignment_7 : ( ruleParameters ) ;
    public final void rule__TestingOracle__ParametersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7271:1: ( ( ruleParameters ) )
            // InternalAdeptness.g:7272:2: ( ruleParameters )
            {
            // InternalAdeptness.g:7272:2: ( ruleParameters )
            // InternalAdeptness.g:7273:3: ruleParameters
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
    // InternalAdeptness.g:7282:1: rule__Parameters__ValueAssignment_0 : ( ruleExpressionsModel ) ;
    public final void rule__Parameters__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7286:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:7287:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:7287:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:7288:3: ruleExpressionsModel
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
    // InternalAdeptness.g:7297:1: rule__Inputs__ValueAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Inputs__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7301:1: ( ( RULE_STRING ) )
            // InternalAdeptness.g:7302:2: ( RULE_STRING )
            {
            // InternalAdeptness.g:7302:2: ( RULE_STRING )
            // InternalAdeptness.g:7303:3: RULE_STRING
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
    // InternalAdeptness.g:7312:1: rule__MonitoringFile__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MonitoringFile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7316:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:7317:2: ( RULE_ID )
            {
            // InternalAdeptness.g:7317:2: ( RULE_ID )
            // InternalAdeptness.g:7318:3: RULE_ID
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
    // InternalAdeptness.g:7327:1: rule__MonitoringFile__MonitoringPlanAssignment_3 : ( ruleMonitoringPlan ) ;
    public final void rule__MonitoringFile__MonitoringPlanAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7331:1: ( ( ruleMonitoringPlan ) )
            // InternalAdeptness.g:7332:2: ( ruleMonitoringPlan )
            {
            // InternalAdeptness.g:7332:2: ( ruleMonitoringPlan )
            // InternalAdeptness.g:7333:3: ruleMonitoringPlan
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
    // InternalAdeptness.g:7342:1: rule__MonitoringPlan__MonitoringVariablesAssignment : ( ruleMonitoringVariable ) ;
    public final void rule__MonitoringPlan__MonitoringVariablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7346:1: ( ( ruleMonitoringVariable ) )
            // InternalAdeptness.g:7347:2: ( ruleMonitoringVariable )
            {
            // InternalAdeptness.g:7347:2: ( ruleMonitoringVariable )
            // InternalAdeptness.g:7348:3: ruleMonitoringVariable
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
    // InternalAdeptness.g:7357:1: rule__MonitoringVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MonitoringVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7361:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:7362:2: ( RULE_ID )
            {
            // InternalAdeptness.g:7362:2: ( RULE_ID )
            // InternalAdeptness.g:7363:3: RULE_ID
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
    // InternalAdeptness.g:7372:1: rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 : ( ruleSig_type ) ;
    public final void rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7376:1: ( ( ruleSig_type ) )
            // InternalAdeptness.g:7377:2: ( ruleSig_type )
            {
            // InternalAdeptness.g:7377:2: ( ruleSig_type )
            // InternalAdeptness.g:7378:3: ruleSig_type
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
    // InternalAdeptness.g:7387:1: rule__MonitoringVariable__MaxAssignment_6_2 : ( ruleDOUBLE ) ;
    public final void rule__MonitoringVariable__MaxAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7391:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7392:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7392:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7393:3: ruleDOUBLE
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
    // InternalAdeptness.g:7402:1: rule__MonitoringVariable__MinAssignment_6_5 : ( ruleDOUBLE ) ;
    public final void rule__MonitoringVariable__MinAssignment_6_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7406:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7407:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7407:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7408:3: ruleDOUBLE
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
    // InternalAdeptness.g:7417:1: rule__Sig_type__Sig_typeAssignment_0 : ( ( 'boolean' ) ) ;
    public final void rule__Sig_type__Sig_typeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7421:1: ( ( ( 'boolean' ) ) )
            // InternalAdeptness.g:7422:2: ( ( 'boolean' ) )
            {
            // InternalAdeptness.g:7422:2: ( ( 'boolean' ) )
            // InternalAdeptness.g:7423:3: ( 'boolean' )
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeBooleanKeyword_0_0()); 
            // InternalAdeptness.g:7424:3: ( 'boolean' )
            // InternalAdeptness.g:7425:4: 'boolean'
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
    // InternalAdeptness.g:7436:1: rule__Sig_type__Sig_typeAssignment_1 : ( ( 'int' ) ) ;
    public final void rule__Sig_type__Sig_typeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7440:1: ( ( ( 'int' ) ) )
            // InternalAdeptness.g:7441:2: ( ( 'int' ) )
            {
            // InternalAdeptness.g:7441:2: ( ( 'int' ) )
            // InternalAdeptness.g:7442:3: ( 'int' )
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeIntKeyword_1_0()); 
            // InternalAdeptness.g:7443:3: ( 'int' )
            // InternalAdeptness.g:7444:4: 'int'
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
    // InternalAdeptness.g:7455:1: rule__Sig_type__Sig_typeAssignment_2 : ( ( 'double' ) ) ;
    public final void rule__Sig_type__Sig_typeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7459:1: ( ( ( 'double' ) ) )
            // InternalAdeptness.g:7460:2: ( ( 'double' ) )
            {
            // InternalAdeptness.g:7460:2: ( ( 'double' ) )
            // InternalAdeptness.g:7461:3: ( 'double' )
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeDoubleKeyword_2_0()); 
            // InternalAdeptness.g:7462:3: ( 'double' )
            // InternalAdeptness.g:7463:4: 'double'
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
    // InternalAdeptness.g:7474:1: rule__Signal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7478:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:7479:2: ( RULE_ID )
            {
            // InternalAdeptness.g:7479:2: ( RULE_ID )
            // InternalAdeptness.g:7480:3: RULE_ID
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
    // InternalAdeptness.g:7489:1: rule__Signal__CardinalityNumCPSAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Signal__CardinalityNumCPSAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7493:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:7494:2: ( RULE_INT )
            {
            // InternalAdeptness.g:7494:2: ( RULE_INT )
            // InternalAdeptness.g:7495:3: RULE_INT
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
    // InternalAdeptness.g:7504:1: rule__Signal__SuperTypeAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Signal__SuperTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7508:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAdeptness.g:7509:2: ( ( ruleQualifiedName ) )
            {
            // InternalAdeptness.g:7509:2: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:7510:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSignalAccess().getSuperTypeMonitoringFileCrossReference_4_1_0()); 
            // InternalAdeptness.g:7511:3: ( ruleQualifiedName )
            // InternalAdeptness.g:7512:4: ruleQualifiedName
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
    // InternalAdeptness.g:7523:1: rule__Signal__OracleAssignment_5 : ( ruleOracle ) ;
    public final void rule__Signal__OracleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7527:1: ( ( ruleOracle ) )
            // InternalAdeptness.g:7528:2: ( ruleOracle )
            {
            // InternalAdeptness.g:7528:2: ( ruleOracle )
            // InternalAdeptness.g:7529:3: ruleOracle
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
    // InternalAdeptness.g:7538:1: rule__Oracle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Oracle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7542:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:7543:2: ( RULE_ID )
            {
            // InternalAdeptness.g:7543:2: ( RULE_ID )
            // InternalAdeptness.g:7544:3: RULE_ID
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
    // InternalAdeptness.g:7553:1: rule__Oracle__WhenAssignment_3_0 : ( ruleWhen ) ;
    public final void rule__Oracle__WhenAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7557:1: ( ( ruleWhen ) )
            // InternalAdeptness.g:7558:2: ( ruleWhen )
            {
            // InternalAdeptness.g:7558:2: ( ruleWhen )
            // InternalAdeptness.g:7559:3: ruleWhen
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
    // InternalAdeptness.g:7568:1: rule__Oracle__WhileAssignment_3_1 : ( ruleWhile ) ;
    public final void rule__Oracle__WhileAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7572:1: ( ( ruleWhile ) )
            // InternalAdeptness.g:7573:2: ( ruleWhile )
            {
            // InternalAdeptness.g:7573:2: ( ruleWhile )
            // InternalAdeptness.g:7574:3: ruleWhile
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
    // InternalAdeptness.g:7583:1: rule__Oracle__CheckAssignment_4 : ( ruleChecks ) ;
    public final void rule__Oracle__CheckAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7587:1: ( ( ruleChecks ) )
            // InternalAdeptness.g:7588:2: ( ruleChecks )
            {
            // InternalAdeptness.g:7588:2: ( ruleChecks )
            // InternalAdeptness.g:7589:3: ruleChecks
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
    // InternalAdeptness.g:7598:1: rule__While__EmAssignment_1 : ( ruleExpressionsModel ) ;
    public final void rule__While__EmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7602:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:7603:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:7603:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:7604:3: ruleExpressionsModel
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
    // InternalAdeptness.g:7613:1: rule__When__EmAssignment_1 : ( ruleExpressionsModel ) ;
    public final void rule__When__EmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7617:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:7618:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:7618:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:7619:3: ruleExpressionsModel
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
    // InternalAdeptness.g:7628:1: rule__When__AwAssignment_2 : ( ruleAfterWhen ) ;
    public final void rule__When__AwAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7632:1: ( ( ruleAfterWhen ) )
            // InternalAdeptness.g:7633:2: ( ruleAfterWhen )
            {
            // InternalAdeptness.g:7633:2: ( ruleAfterWhen )
            // InternalAdeptness.g:7634:3: ruleAfterWhen
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
    // InternalAdeptness.g:7643:1: rule__AfterWhen__WaitAssignment_0 : ( ruleWait ) ;
    public final void rule__AfterWhen__WaitAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7647:1: ( ( ruleWait ) )
            // InternalAdeptness.g:7648:2: ( ruleWait )
            {
            // InternalAdeptness.g:7648:2: ( ruleWait )
            // InternalAdeptness.g:7649:3: ruleWait
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
    // InternalAdeptness.g:7658:1: rule__AfterWhen__DuringAssignment_1 : ( ruleDuring ) ;
    public final void rule__AfterWhen__DuringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7662:1: ( ( ruleDuring ) )
            // InternalAdeptness.g:7663:2: ( ruleDuring )
            {
            // InternalAdeptness.g:7663:2: ( ruleDuring )
            // InternalAdeptness.g:7664:3: ruleDuring
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
    // InternalAdeptness.g:7673:1: rule__Wait__TimeAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Wait__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7677:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7678:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7678:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7679:3: ruleDOUBLE
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
    // InternalAdeptness.g:7688:1: rule__Wait__UnitAssignment_3 : ( ruleTimeType ) ;
    public final void rule__Wait__UnitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7692:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:7693:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:7693:2: ( ruleTimeType )
            // InternalAdeptness.g:7694:3: ruleTimeType
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
    // InternalAdeptness.g:7703:1: rule__During__TimeAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__During__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7707:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7708:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7708:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7709:3: ruleDOUBLE
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
    // InternalAdeptness.g:7718:1: rule__During__UnitAssignment_3 : ( ruleTimeType ) ;
    public final void rule__During__UnitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7722:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:7723:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:7723:2: ( ruleTimeType )
            // InternalAdeptness.g:7724:3: ruleTimeType
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
    // InternalAdeptness.g:7733:1: rule__Checks__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Checks__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7737:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:7738:2: ( RULE_ID )
            {
            // InternalAdeptness.g:7738:2: ( RULE_ID )
            // InternalAdeptness.g:7739:3: RULE_ID
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
    // InternalAdeptness.g:7748:1: rule__Checks__EmAssignment_1_1 : ( ruleExpressionsModel ) ;
    public final void rule__Checks__EmAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7752:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:7753:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:7753:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:7754:3: ruleExpressionsModel
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
    // InternalAdeptness.g:7763:1: rule__Checks__ReferenceAssignment_2 : ( ruleReference ) ;
    public final void rule__Checks__ReferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7767:1: ( ( ruleReference ) )
            // InternalAdeptness.g:7768:2: ( ruleReference )
            {
            // InternalAdeptness.g:7768:2: ( ruleReference )
            // InternalAdeptness.g:7769:3: ruleReference
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
    // InternalAdeptness.g:7778:1: rule__Checks__FailReasonAssignment_3 : ( ruleFailReason ) ;
    public final void rule__Checks__FailReasonAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7782:1: ( ( ruleFailReason ) )
            // InternalAdeptness.g:7783:2: ( ruleFailReason )
            {
            // InternalAdeptness.g:7783:2: ( ruleFailReason )
            // InternalAdeptness.g:7784:3: ruleFailReason
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
    // InternalAdeptness.g:7793:1: rule__Checks__DescriptionAssignment_4 : ( ruleDescription ) ;
    public final void rule__Checks__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7797:1: ( ( ruleDescription ) )
            // InternalAdeptness.g:7798:2: ( ruleDescription )
            {
            // InternalAdeptness.g:7798:2: ( ruleDescription )
            // InternalAdeptness.g:7799:3: ruleDescription
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
    // InternalAdeptness.g:7808:1: rule__Description__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7812:1: ( ( RULE_STRING ) )
            // InternalAdeptness.g:7813:2: ( RULE_STRING )
            {
            // InternalAdeptness.g:7813:2: ( RULE_STRING )
            // InternalAdeptness.g:7814:3: RULE_STRING
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
    // InternalAdeptness.g:7823:1: rule__FailReason__ReasonAssignment_1 : ( ruleReason ) ;
    public final void rule__FailReason__ReasonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7827:1: ( ( ruleReason ) )
            // InternalAdeptness.g:7828:2: ( ruleReason )
            {
            // InternalAdeptness.g:7828:2: ( ruleReason )
            // InternalAdeptness.g:7829:3: ruleReason
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
    // InternalAdeptness.g:7838:1: rule__Reason__HighPeakAssignment_0_0 : ( ruleHighPeak ) ;
    public final void rule__Reason__HighPeakAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7842:1: ( ( ruleHighPeak ) )
            // InternalAdeptness.g:7843:2: ( ruleHighPeak )
            {
            // InternalAdeptness.g:7843:2: ( ruleHighPeak )
            // InternalAdeptness.g:7844:3: ruleHighPeak
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
    // InternalAdeptness.g:7853:1: rule__Reason__HighTimeAssignment_0_1 : ( ruleHighTime ) ;
    public final void rule__Reason__HighTimeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7857:1: ( ( ruleHighTime ) )
            // InternalAdeptness.g:7858:2: ( ruleHighTime )
            {
            // InternalAdeptness.g:7858:2: ( ruleHighTime )
            // InternalAdeptness.g:7859:3: ruleHighTime
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
    // InternalAdeptness.g:7868:1: rule__Reason__ConstDegAssignment_0_2 : ( ruleConstDeg ) ;
    public final void rule__Reason__ConstDegAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7872:1: ( ( ruleConstDeg ) )
            // InternalAdeptness.g:7873:2: ( ruleConstDeg )
            {
            // InternalAdeptness.g:7873:2: ( ruleConstDeg )
            // InternalAdeptness.g:7874:3: ruleConstDeg
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
    // InternalAdeptness.g:7883:1: rule__Reason__XPeaksAssignment_0_3 : ( ruleXPeaks ) ;
    public final void rule__Reason__XPeaksAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7887:1: ( ( ruleXPeaks ) )
            // InternalAdeptness.g:7888:2: ( ruleXPeaks )
            {
            // InternalAdeptness.g:7888:2: ( ruleXPeaks )
            // InternalAdeptness.g:7889:3: ruleXPeaks
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
    // InternalAdeptness.g:7898:1: rule__XPeaks__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__XPeaks__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7902:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7903:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7903:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7904:3: ruleDOUBLE
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
    // InternalAdeptness.g:7913:1: rule__XPeaks__NPeaksAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__XPeaks__NPeaksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7917:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7918:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7918:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7919:3: ruleDOUBLE
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
    // InternalAdeptness.g:7928:1: rule__XPeaks__TimeAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__XPeaks__TimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7932:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7933:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7933:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7934:3: ruleDOUBLE
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
    // InternalAdeptness.g:7943:1: rule__XPeaks__UnitAssignment_6 : ( ruleTimeType ) ;
    public final void rule__XPeaks__UnitAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7947:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:7948:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:7948:2: ( ruleTimeType )
            // InternalAdeptness.g:7949:3: ruleTimeType
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
    // InternalAdeptness.g:7958:1: rule__ConstDeg__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__ConstDeg__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7962:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7963:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7963:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7964:3: ruleDOUBLE
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
    // InternalAdeptness.g:7973:1: rule__HighTime__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__HighTime__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7977:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7978:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7978:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7979:3: ruleDOUBLE
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
    // InternalAdeptness.g:7988:1: rule__HighTime__TimeAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__HighTime__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7992:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7993:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7993:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7994:3: ruleDOUBLE
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
    // InternalAdeptness.g:8003:1: rule__HighTime__UnitAssignment_4 : ( ruleTimeType ) ;
    public final void rule__HighTime__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8007:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:8008:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:8008:2: ( ruleTimeType )
            // InternalAdeptness.g:8009:3: ruleTimeType
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
    // InternalAdeptness.g:8018:1: rule__HighPeak__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__HighPeak__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8022:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:8023:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:8023:2: ( ruleDOUBLE )
            // InternalAdeptness.g:8024:3: ruleDOUBLE
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
    // InternalAdeptness.g:8033:1: rule__Reference__UpperAssignment_0_0 : ( ruleUpper ) ;
    public final void rule__Reference__UpperAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8037:1: ( ( ruleUpper ) )
            // InternalAdeptness.g:8038:2: ( ruleUpper )
            {
            // InternalAdeptness.g:8038:2: ( ruleUpper )
            // InternalAdeptness.g:8039:3: ruleUpper
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
    // InternalAdeptness.g:8048:1: rule__Reference__LowerAssignment_0_1 : ( ruleLower ) ;
    public final void rule__Reference__LowerAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8052:1: ( ( ruleLower ) )
            // InternalAdeptness.g:8053:2: ( ruleLower )
            {
            // InternalAdeptness.g:8053:2: ( ruleLower )
            // InternalAdeptness.g:8054:3: ruleLower
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
    // InternalAdeptness.g:8063:1: rule__Reference__RangeAssignment_0_2 : ( ruleRange ) ;
    public final void rule__Reference__RangeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8067:1: ( ( ruleRange ) )
            // InternalAdeptness.g:8068:2: ( ruleRange )
            {
            // InternalAdeptness.g:8068:2: ( ruleRange )
            // InternalAdeptness.g:8069:3: ruleRange
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
    // InternalAdeptness.g:8078:1: rule__Reference__GapAssignment_0_3 : ( ruleGap ) ;
    public final void rule__Reference__GapAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8082:1: ( ( ruleGap ) )
            // InternalAdeptness.g:8083:2: ( ruleGap )
            {
            // InternalAdeptness.g:8083:2: ( ruleGap )
            // InternalAdeptness.g:8084:3: ruleGap
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
    // InternalAdeptness.g:8093:1: rule__Reference__SameAssignment_0_4 : ( ruleSame ) ;
    public final void rule__Reference__SameAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8097:1: ( ( ruleSame ) )
            // InternalAdeptness.g:8098:2: ( ruleSame )
            {
            // InternalAdeptness.g:8098:2: ( ruleSame )
            // InternalAdeptness.g:8099:3: ruleSame
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
    // InternalAdeptness.g:8108:1: rule__Reference__NotsameAssignment_0_5 : ( ruleNotSame ) ;
    public final void rule__Reference__NotsameAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8112:1: ( ( ruleNotSame ) )
            // InternalAdeptness.g:8113:2: ( ruleNotSame )
            {
            // InternalAdeptness.g:8113:2: ( ruleNotSame )
            // InternalAdeptness.g:8114:3: ruleNotSame
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
    // InternalAdeptness.g:8123:1: rule__Same__Bound_uppAssignment_1 : ( ruleBound_up ) ;
    public final void rule__Same__Bound_uppAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8127:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:8128:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:8128:2: ( ruleBound_up )
            // InternalAdeptness.g:8129:3: ruleBound_up
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
    // InternalAdeptness.g:8138:1: rule__Same__ExactlyAssignment_2_0 : ( ruleExactly ) ;
    public final void rule__Same__ExactlyAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8142:1: ( ( ruleExactly ) )
            // InternalAdeptness.g:8143:2: ( ruleExactly )
            {
            // InternalAdeptness.g:8143:2: ( ruleExactly )
            // InternalAdeptness.g:8144:3: ruleExactly
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
    // InternalAdeptness.g:8153:1: rule__Same__AtmostAssignment_2_1 : ( ruleAt_most ) ;
    public final void rule__Same__AtmostAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8157:1: ( ( ruleAt_most ) )
            // InternalAdeptness.g:8158:2: ( ruleAt_most )
            {
            // InternalAdeptness.g:8158:2: ( ruleAt_most )
            // InternalAdeptness.g:8159:3: ruleAt_most
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
    // InternalAdeptness.g:8168:1: rule__Same__AtleastAssignment_2_2 : ( ruleAt_least ) ;
    public final void rule__Same__AtleastAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8172:1: ( ( ruleAt_least ) )
            // InternalAdeptness.g:8173:2: ( ruleAt_least )
            {
            // InternalAdeptness.g:8173:2: ( ruleAt_least )
            // InternalAdeptness.g:8174:3: ruleAt_least
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
    // InternalAdeptness.g:8183:1: rule__NotSame__Bound_uppAssignment_1 : ( ruleBound_up ) ;
    public final void rule__NotSame__Bound_uppAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8187:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:8188:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:8188:2: ( ruleBound_up )
            // InternalAdeptness.g:8189:3: ruleBound_up
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
    // InternalAdeptness.g:8198:1: rule__NotSame__ExactlyAssignment_2_0 : ( ruleExactly ) ;
    public final void rule__NotSame__ExactlyAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8202:1: ( ( ruleExactly ) )
            // InternalAdeptness.g:8203:2: ( ruleExactly )
            {
            // InternalAdeptness.g:8203:2: ( ruleExactly )
            // InternalAdeptness.g:8204:3: ruleExactly
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
    // InternalAdeptness.g:8213:1: rule__NotSame__AtmostAssignment_2_1 : ( ruleAt_most ) ;
    public final void rule__NotSame__AtmostAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8217:1: ( ( ruleAt_most ) )
            // InternalAdeptness.g:8218:2: ( ruleAt_most )
            {
            // InternalAdeptness.g:8218:2: ( ruleAt_most )
            // InternalAdeptness.g:8219:3: ruleAt_most
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
    // InternalAdeptness.g:8228:1: rule__NotSame__AtleastAssignment_2_2 : ( ruleAt_least ) ;
    public final void rule__NotSame__AtleastAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8232:1: ( ( ruleAt_least ) )
            // InternalAdeptness.g:8233:2: ( ruleAt_least )
            {
            // InternalAdeptness.g:8233:2: ( ruleAt_least )
            // InternalAdeptness.g:8234:3: ruleAt_least
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
    // InternalAdeptness.g:8243:1: rule__Upper__Bound_uppAssignment_1 : ( ruleBound_up ) ;
    public final void rule__Upper__Bound_uppAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8247:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:8248:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:8248:2: ( ruleBound_up )
            // InternalAdeptness.g:8249:3: ruleBound_up
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
    // InternalAdeptness.g:8258:1: rule__Upper__ExactlyAssignment_2_0 : ( ruleExactly ) ;
    public final void rule__Upper__ExactlyAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8262:1: ( ( ruleExactly ) )
            // InternalAdeptness.g:8263:2: ( ruleExactly )
            {
            // InternalAdeptness.g:8263:2: ( ruleExactly )
            // InternalAdeptness.g:8264:3: ruleExactly
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
    // InternalAdeptness.g:8273:1: rule__Upper__AtmostAssignment_2_1 : ( ruleAt_most ) ;
    public final void rule__Upper__AtmostAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8277:1: ( ( ruleAt_most ) )
            // InternalAdeptness.g:8278:2: ( ruleAt_most )
            {
            // InternalAdeptness.g:8278:2: ( ruleAt_most )
            // InternalAdeptness.g:8279:3: ruleAt_most
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
    // InternalAdeptness.g:8288:1: rule__Upper__AtleastAssignment_2_2 : ( ruleAt_least ) ;
    public final void rule__Upper__AtleastAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8292:1: ( ( ruleAt_least ) )
            // InternalAdeptness.g:8293:2: ( ruleAt_least )
            {
            // InternalAdeptness.g:8293:2: ( ruleAt_least )
            // InternalAdeptness.g:8294:3: ruleAt_least
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
    // InternalAdeptness.g:8303:1: rule__Lower__Bound_lowerAssignment_1 : ( ruleBound_Down ) ;
    public final void rule__Lower__Bound_lowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8307:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:8308:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:8308:2: ( ruleBound_Down )
            // InternalAdeptness.g:8309:3: ruleBound_Down
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
    // InternalAdeptness.g:8318:1: rule__Lower__ExactlyAssignment_2_0 : ( ruleExactly ) ;
    public final void rule__Lower__ExactlyAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8322:1: ( ( ruleExactly ) )
            // InternalAdeptness.g:8323:2: ( ruleExactly )
            {
            // InternalAdeptness.g:8323:2: ( ruleExactly )
            // InternalAdeptness.g:8324:3: ruleExactly
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
    // InternalAdeptness.g:8333:1: rule__Lower__AtmostAssignment_2_1 : ( ruleAt_most ) ;
    public final void rule__Lower__AtmostAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8337:1: ( ( ruleAt_most ) )
            // InternalAdeptness.g:8338:2: ( ruleAt_most )
            {
            // InternalAdeptness.g:8338:2: ( ruleAt_most )
            // InternalAdeptness.g:8339:3: ruleAt_most
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
    // InternalAdeptness.g:8348:1: rule__Lower__AtleastAssignment_2_2 : ( ruleAt_least ) ;
    public final void rule__Lower__AtleastAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8352:1: ( ( ruleAt_least ) )
            // InternalAdeptness.g:8353:2: ( ruleAt_least )
            {
            // InternalAdeptness.g:8353:2: ( ruleAt_least )
            // InternalAdeptness.g:8354:3: ruleAt_least
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
    // InternalAdeptness.g:8363:1: rule__Range__Bound_lowerAssignment_1 : ( ruleBound_Down ) ;
    public final void rule__Range__Bound_lowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8367:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:8368:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:8368:2: ( ruleBound_Down )
            // InternalAdeptness.g:8369:3: ruleBound_Down
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
    // InternalAdeptness.g:8378:1: rule__Range__Bound_uppAssignment_3 : ( ruleBound_up ) ;
    public final void rule__Range__Bound_uppAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8382:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:8383:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:8383:2: ( ruleBound_up )
            // InternalAdeptness.g:8384:3: ruleBound_up
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
    // InternalAdeptness.g:8393:1: rule__Range__ExactlyAssignment_4_0 : ( ruleExactly ) ;
    public final void rule__Range__ExactlyAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8397:1: ( ( ruleExactly ) )
            // InternalAdeptness.g:8398:2: ( ruleExactly )
            {
            // InternalAdeptness.g:8398:2: ( ruleExactly )
            // InternalAdeptness.g:8399:3: ruleExactly
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
    // InternalAdeptness.g:8408:1: rule__Range__AtmostAssignment_4_1 : ( ruleAt_most ) ;
    public final void rule__Range__AtmostAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8412:1: ( ( ruleAt_most ) )
            // InternalAdeptness.g:8413:2: ( ruleAt_most )
            {
            // InternalAdeptness.g:8413:2: ( ruleAt_most )
            // InternalAdeptness.g:8414:3: ruleAt_most
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
    // InternalAdeptness.g:8423:1: rule__Range__AtleastAssignment_4_2 : ( ruleAt_least ) ;
    public final void rule__Range__AtleastAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8427:1: ( ( ruleAt_least ) )
            // InternalAdeptness.g:8428:2: ( ruleAt_least )
            {
            // InternalAdeptness.g:8428:2: ( ruleAt_least )
            // InternalAdeptness.g:8429:3: ruleAt_least
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
    // InternalAdeptness.g:8438:1: rule__Gap__Bound_lowerAssignment_1 : ( ruleBound_Down ) ;
    public final void rule__Gap__Bound_lowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8442:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:8443:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:8443:2: ( ruleBound_Down )
            // InternalAdeptness.g:8444:3: ruleBound_Down
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
    // InternalAdeptness.g:8453:1: rule__Gap__Bound_uppAssignment_3 : ( ruleBound_up ) ;
    public final void rule__Gap__Bound_uppAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8457:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:8458:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:8458:2: ( ruleBound_up )
            // InternalAdeptness.g:8459:3: ruleBound_up
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
    // InternalAdeptness.g:8468:1: rule__Gap__ExactlyAssignment_4_0 : ( ruleExactly ) ;
    public final void rule__Gap__ExactlyAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8472:1: ( ( ruleExactly ) )
            // InternalAdeptness.g:8473:2: ( ruleExactly )
            {
            // InternalAdeptness.g:8473:2: ( ruleExactly )
            // InternalAdeptness.g:8474:3: ruleExactly
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
    // InternalAdeptness.g:8483:1: rule__Gap__AtmostAssignment_4_1 : ( ruleAt_most ) ;
    public final void rule__Gap__AtmostAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8487:1: ( ( ruleAt_most ) )
            // InternalAdeptness.g:8488:2: ( ruleAt_most )
            {
            // InternalAdeptness.g:8488:2: ( ruleAt_most )
            // InternalAdeptness.g:8489:3: ruleAt_most
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
    // InternalAdeptness.g:8498:1: rule__Gap__AtleastAssignment_4_2 : ( ruleAt_least ) ;
    public final void rule__Gap__AtleastAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8502:1: ( ( ruleAt_least ) )
            // InternalAdeptness.g:8503:2: ( ruleAt_least )
            {
            // InternalAdeptness.g:8503:2: ( ruleAt_least )
            // InternalAdeptness.g:8504:3: ruleAt_least
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
    // InternalAdeptness.g:8513:1: rule__Exactly__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Exactly__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8517:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:8518:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:8518:2: ( ruleDOUBLE )
            // InternalAdeptness.g:8519:3: ruleDOUBLE
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
    // InternalAdeptness.g:8528:1: rule__Exactly__TimeAssignment_2_1_1 : ( ruleDOUBLE ) ;
    public final void rule__Exactly__TimeAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8532:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:8533:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:8533:2: ( ruleDOUBLE )
            // InternalAdeptness.g:8534:3: ruleDOUBLE
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
    // InternalAdeptness.g:8543:1: rule__Exactly__UnitAssignment_2_1_2 : ( ruleTimeType ) ;
    public final void rule__Exactly__UnitAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8547:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:8548:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:8548:2: ( ruleTimeType )
            // InternalAdeptness.g:8549:3: ruleTimeType
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
    // InternalAdeptness.g:8558:1: rule__Exactly__UnitAssignment_2_2 : ( ruleTimeType ) ;
    public final void rule__Exactly__UnitAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8562:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:8563:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:8563:2: ( ruleTimeType )
            // InternalAdeptness.g:8564:3: ruleTimeType
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
    // InternalAdeptness.g:8573:1: rule__At_most__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__At_most__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8577:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:8578:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:8578:2: ( ruleDOUBLE )
            // InternalAdeptness.g:8579:3: ruleDOUBLE
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
    // InternalAdeptness.g:8588:1: rule__At_most__TimeAssignment_2_1_1 : ( ruleDOUBLE ) ;
    public final void rule__At_most__TimeAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8592:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:8593:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:8593:2: ( ruleDOUBLE )
            // InternalAdeptness.g:8594:3: ruleDOUBLE
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
    // InternalAdeptness.g:8603:1: rule__At_most__UnitAssignment_2_1_2 : ( ruleTimeType ) ;
    public final void rule__At_most__UnitAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8607:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:8608:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:8608:2: ( ruleTimeType )
            // InternalAdeptness.g:8609:3: ruleTimeType
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
    // InternalAdeptness.g:8618:1: rule__At_most__UnitAssignment_2_2 : ( ruleTimeType ) ;
    public final void rule__At_most__UnitAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8622:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:8623:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:8623:2: ( ruleTimeType )
            // InternalAdeptness.g:8624:3: ruleTimeType
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
    // InternalAdeptness.g:8633:1: rule__At_least__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__At_least__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8637:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:8638:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:8638:2: ( ruleDOUBLE )
            // InternalAdeptness.g:8639:3: ruleDOUBLE
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
    // InternalAdeptness.g:8648:1: rule__At_least__TimeAssignment_2_1_1 : ( ruleDOUBLE ) ;
    public final void rule__At_least__TimeAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8652:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:8653:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:8653:2: ( ruleDOUBLE )
            // InternalAdeptness.g:8654:3: ruleDOUBLE
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
    // InternalAdeptness.g:8663:1: rule__At_least__UnitAssignment_2_1_2 : ( ruleTimeType ) ;
    public final void rule__At_least__UnitAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8667:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:8668:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:8668:2: ( ruleTimeType )
            // InternalAdeptness.g:8669:3: ruleTimeType
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
    // InternalAdeptness.g:8678:1: rule__At_least__UnitAssignment_2_2 : ( ruleTimeType ) ;
    public final void rule__At_least__UnitAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8682:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:8683:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:8683:2: ( ruleTimeType )
            // InternalAdeptness.g:8684:3: ruleTimeType
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
    // InternalAdeptness.g:8693:1: rule__Bound_up__ValueAssignment_0 : ( ruleDOUBLE ) ;
    public final void rule__Bound_up__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8697:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:8698:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:8698:2: ( ruleDOUBLE )
            // InternalAdeptness.g:8699:3: ruleDOUBLE
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
    // InternalAdeptness.g:8708:1: rule__Bound_up__EmAssignment_1 : ( ruleExpressionsModel ) ;
    public final void rule__Bound_up__EmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8712:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:8713:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:8713:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:8714:3: ruleExpressionsModel
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
    // InternalAdeptness.g:8723:1: rule__Bound_Down__ValueAssignment_0 : ( ruleDOUBLE ) ;
    public final void rule__Bound_Down__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8727:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:8728:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:8728:2: ( ruleDOUBLE )
            // InternalAdeptness.g:8729:3: ruleDOUBLE
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
    // InternalAdeptness.g:8738:1: rule__Bound_Down__EmAssignment_1 : ( ruleExpressionsModel ) ;
    public final void rule__Bound_Down__EmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8742:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:8743:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:8743:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:8744:3: ruleExpressionsModel
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
    // InternalAdeptness.g:8753:1: rule__BOOLEAN__BoolAssignment : ( ruleb ) ;
    public final void rule__BOOLEAN__BoolAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8757:1: ( ( ruleb ) )
            // InternalAdeptness.g:8758:2: ( ruleb )
            {
            // InternalAdeptness.g:8758:2: ( ruleb )
            // InternalAdeptness.g:8759:3: ruleb
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
    // InternalAdeptness.g:8768:1: rule__DOUBLE__DValAssignment : ( ruled ) ;
    public final void rule__DOUBLE__DValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8772:1: ( ( ruled ) )
            // InternalAdeptness.g:8773:2: ( ruled )
            {
            // InternalAdeptness.g:8773:2: ( ruled )
            // InternalAdeptness.g:8774:3: ruled
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
    // InternalAdeptness.g:8783:1: rule__TimeType__TimeAssignment_0 : ( ( 'milliseconds' ) ) ;
    public final void rule__TimeType__TimeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8787:1: ( ( ( 'milliseconds' ) ) )
            // InternalAdeptness.g:8788:2: ( ( 'milliseconds' ) )
            {
            // InternalAdeptness.g:8788:2: ( ( 'milliseconds' ) )
            // InternalAdeptness.g:8789:3: ( 'milliseconds' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMillisecondsKeyword_0_0()); 
            // InternalAdeptness.g:8790:3: ( 'milliseconds' )
            // InternalAdeptness.g:8791:4: 'milliseconds'
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
    // InternalAdeptness.g:8802:1: rule__TimeType__TimeAssignment_1 : ( ( 'seconds' ) ) ;
    public final void rule__TimeType__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8806:1: ( ( ( 'seconds' ) ) )
            // InternalAdeptness.g:8807:2: ( ( 'seconds' ) )
            {
            // InternalAdeptness.g:8807:2: ( ( 'seconds' ) )
            // InternalAdeptness.g:8808:3: ( 'seconds' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeSecondsKeyword_1_0()); 
            // InternalAdeptness.g:8809:3: ( 'seconds' )
            // InternalAdeptness.g:8810:4: 'seconds'
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
    // InternalAdeptness.g:8821:1: rule__TimeType__TimeAssignment_2 : ( ( 'minutes' ) ) ;
    public final void rule__TimeType__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8825:1: ( ( ( 'minutes' ) ) )
            // InternalAdeptness.g:8826:2: ( ( 'minutes' ) )
            {
            // InternalAdeptness.g:8826:2: ( ( 'minutes' ) )
            // InternalAdeptness.g:8827:3: ( 'minutes' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMinutesKeyword_2_0()); 
            // InternalAdeptness.g:8828:3: ( 'minutes' )
            // InternalAdeptness.g:8829:4: 'minutes'
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
    // InternalAdeptness.g:8840:1: rule__TimeType__TimeAssignment_3 : ( ( 'hours' ) ) ;
    public final void rule__TimeType__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8844:1: ( ( ( 'hours' ) ) )
            // InternalAdeptness.g:8845:2: ( ( 'hours' ) )
            {
            // InternalAdeptness.g:8845:2: ( ( 'hours' ) )
            // InternalAdeptness.g:8846:3: ( 'hours' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeHoursKeyword_3_0()); 
            // InternalAdeptness.g:8847:3: ( 'hours' )
            // InternalAdeptness.g:8848:4: 'hours'
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
    // InternalAdeptness.g:8859:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8863:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:8864:2: ( RULE_ID )
            {
            // InternalAdeptness.g:8864:2: ( RULE_ID )
            // InternalAdeptness.g:8865:3: RULE_ID
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
    // InternalAdeptness.g:8874:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8878:1: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:8879:2: ( ruleQualifiedName )
            {
            // InternalAdeptness.g:8879:2: ( ruleQualifiedName )
            // InternalAdeptness.g:8880:3: ruleQualifiedName
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
    // InternalAdeptness.g:8889:1: rule__PackageDeclaration__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8893:1: ( ( ruleAbstractElement ) )
            // InternalAdeptness.g:8894:2: ( ruleAbstractElement )
            {
            // InternalAdeptness.g:8894:2: ( ruleAbstractElement )
            // InternalAdeptness.g:8895:3: ruleAbstractElement
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
    // InternalAdeptness.g:8904:1: rule__ExpressionsModel__ElementsAssignment : ( ruleAbstractElement2 ) ;
    public final void rule__ExpressionsModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8908:1: ( ( ruleAbstractElement2 ) )
            // InternalAdeptness.g:8909:2: ( ruleAbstractElement2 )
            {
            // InternalAdeptness.g:8909:2: ( ruleAbstractElement2 )
            // InternalAdeptness.g:8910:3: ruleAbstractElement2
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
    // InternalAdeptness.g:8919:1: rule__AbstractElement2__FrontParenthesesAssignment_0 : ( ruleFrontParentheses ) ;
    public final void rule__AbstractElement2__FrontParenthesesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8923:1: ( ( ruleFrontParentheses ) )
            // InternalAdeptness.g:8924:2: ( ruleFrontParentheses )
            {
            // InternalAdeptness.g:8924:2: ( ruleFrontParentheses )
            // InternalAdeptness.g:8925:3: ruleFrontParentheses
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
    // InternalAdeptness.g:8934:1: rule__AbstractElement2__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__AbstractElement2__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8938:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:8939:2: ( RULE_ID )
            {
            // InternalAdeptness.g:8939:2: ( RULE_ID )
            // InternalAdeptness.g:8940:3: RULE_ID
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
    // InternalAdeptness.g:8949:1: rule__AbstractElement2__ValueAssignment_1_1 : ( ruleDOUBLE ) ;
    public final void rule__AbstractElement2__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8953:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:8954:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:8954:2: ( ruleDOUBLE )
            // InternalAdeptness.g:8955:3: ruleDOUBLE
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
    // InternalAdeptness.g:8964:1: rule__AbstractElement2__OpAssignment_2 : ( ruleOperators ) ;
    public final void rule__AbstractElement2__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8968:1: ( ( ruleOperators ) )
            // InternalAdeptness.g:8969:2: ( ruleOperators )
            {
            // InternalAdeptness.g:8969:2: ( ruleOperators )
            // InternalAdeptness.g:8970:3: ruleOperators
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
    // InternalAdeptness.g:8979:1: rule__Operators__OperatorAssignment_0 : ( ruleOp ) ;
    public final void rule__Operators__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8983:1: ( ( ruleOp ) )
            // InternalAdeptness.g:8984:2: ( ruleOp )
            {
            // InternalAdeptness.g:8984:2: ( ruleOp )
            // InternalAdeptness.g:8985:3: ruleOp
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
    // InternalAdeptness.g:8994:1: rule__Operators__ComparationAssignment_1 : ( ruleCompOp ) ;
    public final void rule__Operators__ComparationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:8998:1: ( ( ruleCompOp ) )
            // InternalAdeptness.g:8999:2: ( ruleCompOp )
            {
            // InternalAdeptness.g:8999:2: ( ruleCompOp )
            // InternalAdeptness.g:9000:3: ruleCompOp
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
    // InternalAdeptness.g:9009:1: rule__Operators__LogicOperatorAssignment_2 : ( ruleLogicOp ) ;
    public final void rule__Operators__LogicOperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:9013:1: ( ( ruleLogicOp ) )
            // InternalAdeptness.g:9014:2: ( ruleLogicOp )
            {
            // InternalAdeptness.g:9014:2: ( ruleLogicOp )
            // InternalAdeptness.g:9015:3: ruleLogicOp
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
    // InternalAdeptness.g:9024:1: rule__Operators__BackParenthesesAssignment_3 : ( ruleBackParentheses ) ;
    public final void rule__Operators__BackParenthesesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:9028:1: ( ( ruleBackParentheses ) )
            // InternalAdeptness.g:9029:2: ( ruleBackParentheses )
            {
            // InternalAdeptness.g:9029:2: ( ruleBackParentheses )
            // InternalAdeptness.g:9030:3: ruleBackParentheses
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


    // $ANTLR start "rule__Operators__ElementsAssignment_4"
    // InternalAdeptness.g:9039:1: rule__Operators__ElementsAssignment_4 : ( ruleComas ) ;
    public final void rule__Operators__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:9043:1: ( ( ruleComas ) )
            // InternalAdeptness.g:9044:2: ( ruleComas )
            {
            // InternalAdeptness.g:9044:2: ( ruleComas )
            // InternalAdeptness.g:9045:3: ruleComas
            {
             before(grammarAccess.getOperatorsAccess().getElementsComasParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleComas();

            state._fsp--;

             after(grammarAccess.getOperatorsAccess().getElementsComasParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operators__ElementsAssignment_4"


    // $ANTLR start "rule__Comas__OpAssignment"
    // InternalAdeptness.g:9054:1: rule__Comas__OpAssignment : ( ( ',' ) ) ;
    public final void rule__Comas__OpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:9058:1: ( ( ( ',' ) ) )
            // InternalAdeptness.g:9059:2: ( ( ',' ) )
            {
            // InternalAdeptness.g:9059:2: ( ( ',' ) )
            // InternalAdeptness.g:9060:3: ( ',' )
            {
             before(grammarAccess.getComasAccess().getOpCommaKeyword_0()); 
            // InternalAdeptness.g:9061:3: ( ',' )
            // InternalAdeptness.g:9062:4: ','
            {
             before(grammarAccess.getComasAccess().getOpCommaKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getComasAccess().getOpCommaKeyword_0()); 

            }

             after(grammarAccess.getComasAccess().getOpCommaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comas__OpAssignment"


    // $ANTLR start "rule__CompOp__OpAssignment"
    // InternalAdeptness.g:9073:1: rule__CompOp__OpAssignment : ( ( rule__CompOp__OpAlternatives_0 ) ) ;
    public final void rule__CompOp__OpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:9077:1: ( ( ( rule__CompOp__OpAlternatives_0 ) ) )
            // InternalAdeptness.g:9078:2: ( ( rule__CompOp__OpAlternatives_0 ) )
            {
            // InternalAdeptness.g:9078:2: ( ( rule__CompOp__OpAlternatives_0 ) )
            // InternalAdeptness.g:9079:3: ( rule__CompOp__OpAlternatives_0 )
            {
             before(grammarAccess.getCompOpAccess().getOpAlternatives_0()); 
            // InternalAdeptness.g:9080:3: ( rule__CompOp__OpAlternatives_0 )
            // InternalAdeptness.g:9080:4: rule__CompOp__OpAlternatives_0
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
    // InternalAdeptness.g:9088:1: rule__LogicOp__OpAssignment : ( ( rule__LogicOp__OpAlternatives_0 ) ) ;
    public final void rule__LogicOp__OpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:9092:1: ( ( ( rule__LogicOp__OpAlternatives_0 ) ) )
            // InternalAdeptness.g:9093:2: ( ( rule__LogicOp__OpAlternatives_0 ) )
            {
            // InternalAdeptness.g:9093:2: ( ( rule__LogicOp__OpAlternatives_0 ) )
            // InternalAdeptness.g:9094:3: ( rule__LogicOp__OpAlternatives_0 )
            {
             before(grammarAccess.getLogicOpAccess().getOpAlternatives_0()); 
            // InternalAdeptness.g:9095:3: ( rule__LogicOp__OpAlternatives_0 )
            // InternalAdeptness.g:9095:4: rule__LogicOp__OpAlternatives_0
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
    // InternalAdeptness.g:9103:1: rule__Op__OpAssignment : ( ( rule__Op__OpAlternatives_0 ) ) ;
    public final void rule__Op__OpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:9107:1: ( ( ( rule__Op__OpAlternatives_0 ) ) )
            // InternalAdeptness.g:9108:2: ( ( rule__Op__OpAlternatives_0 ) )
            {
            // InternalAdeptness.g:9108:2: ( ( rule__Op__OpAlternatives_0 ) )
            // InternalAdeptness.g:9109:3: ( rule__Op__OpAlternatives_0 )
            {
             before(grammarAccess.getOpAccess().getOpAlternatives_0()); 
            // InternalAdeptness.g:9110:3: ( rule__Op__OpAlternatives_0 )
            // InternalAdeptness.g:9110:4: rule__Op__OpAlternatives_0
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
            return "1652:1: rule__Reason__Alternatives_0 : ( ( ( rule__Reason__HighPeakAssignment_0_0 ) ) | ( ( rule__Reason__HighTimeAssignment_0_1 ) ) | ( ( rule__Reason__ConstDegAssignment_0_2 ) ) | ( ( rule__Reason__XPeaksAssignment_0_3 ) ) );";
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
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x000000200FFF1000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x000000200FFF1002L});

}