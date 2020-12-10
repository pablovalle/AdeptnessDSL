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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'true'", "'false'", "'=='", "'!='", "'>='", "'<='", "'<'", "'>'", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'import'", "'.*'", "'.'", "'MONITORINGPLAN'", "':'", "'ENDMONITORINGPLAN'", "'MONITOR'", "'type'", "'ENDMONITOR'", "'max'", "'min'", "'CPS'", "'ENDCPS'", "'['", "']'", "'implements'", "'ORACLE'", "'ENDORACLE'", "'while:'", "'when:'", "'after('", "','", "'during('", "'checks:'", "'Description: '", "'fails if :'", "';'", "'confidence is below'", "'more than'", "'times within'", "'confidence is in constant degradation'", "'within'", "'should be'", "'should not be'", "'is below'", "'is above'", "'is in range between'", "'and'", "'not in range between'", "'datatype'", "'package'", "'{'", "'}'", "'boolean'", "'int'", "'double'", "'miliseconds'", "'seconds'", "'minutes'", "'hours'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

                if ( (LA1_0==27||LA1_0==30||LA1_0==38||(LA1_0>=66 && LA1_0<=67)) ) {
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


    // $ANTLR start "entryRuleMonitoringFile"
    // InternalAdeptness.g:203:1: entryRuleMonitoringFile : ruleMonitoringFile EOF ;
    public final void entryRuleMonitoringFile() throws RecognitionException {
        try {
            // InternalAdeptness.g:204:1: ( ruleMonitoringFile EOF )
            // InternalAdeptness.g:205:1: ruleMonitoringFile EOF
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
    // InternalAdeptness.g:212:1: ruleMonitoringFile : ( ( rule__MonitoringFile__Group__0 ) ) ;
    public final void ruleMonitoringFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:216:2: ( ( ( rule__MonitoringFile__Group__0 ) ) )
            // InternalAdeptness.g:217:2: ( ( rule__MonitoringFile__Group__0 ) )
            {
            // InternalAdeptness.g:217:2: ( ( rule__MonitoringFile__Group__0 ) )
            // InternalAdeptness.g:218:3: ( rule__MonitoringFile__Group__0 )
            {
             before(grammarAccess.getMonitoringFileAccess().getGroup()); 
            // InternalAdeptness.g:219:3: ( rule__MonitoringFile__Group__0 )
            // InternalAdeptness.g:219:4: rule__MonitoringFile__Group__0
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
    // InternalAdeptness.g:228:1: entryRuleMonitoringPlan : ruleMonitoringPlan EOF ;
    public final void entryRuleMonitoringPlan() throws RecognitionException {
        try {
            // InternalAdeptness.g:229:1: ( ruleMonitoringPlan EOF )
            // InternalAdeptness.g:230:1: ruleMonitoringPlan EOF
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
    // InternalAdeptness.g:237:1: ruleMonitoringPlan : ( ( rule__MonitoringPlan__MonitoringVariablesAssignment ) ) ;
    public final void ruleMonitoringPlan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:241:2: ( ( ( rule__MonitoringPlan__MonitoringVariablesAssignment ) ) )
            // InternalAdeptness.g:242:2: ( ( rule__MonitoringPlan__MonitoringVariablesAssignment ) )
            {
            // InternalAdeptness.g:242:2: ( ( rule__MonitoringPlan__MonitoringVariablesAssignment ) )
            // InternalAdeptness.g:243:3: ( rule__MonitoringPlan__MonitoringVariablesAssignment )
            {
             before(grammarAccess.getMonitoringPlanAccess().getMonitoringVariablesAssignment()); 
            // InternalAdeptness.g:244:3: ( rule__MonitoringPlan__MonitoringVariablesAssignment )
            // InternalAdeptness.g:244:4: rule__MonitoringPlan__MonitoringVariablesAssignment
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
    // InternalAdeptness.g:253:1: entryRuleMonitoringVariable : ruleMonitoringVariable EOF ;
    public final void entryRuleMonitoringVariable() throws RecognitionException {
        try {
            // InternalAdeptness.g:254:1: ( ruleMonitoringVariable EOF )
            // InternalAdeptness.g:255:1: ruleMonitoringVariable EOF
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
    // InternalAdeptness.g:262:1: ruleMonitoringVariable : ( ( rule__MonitoringVariable__Group__0 ) ) ;
    public final void ruleMonitoringVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:266:2: ( ( ( rule__MonitoringVariable__Group__0 ) ) )
            // InternalAdeptness.g:267:2: ( ( rule__MonitoringVariable__Group__0 ) )
            {
            // InternalAdeptness.g:267:2: ( ( rule__MonitoringVariable__Group__0 ) )
            // InternalAdeptness.g:268:3: ( rule__MonitoringVariable__Group__0 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getGroup()); 
            // InternalAdeptness.g:269:3: ( rule__MonitoringVariable__Group__0 )
            // InternalAdeptness.g:269:4: rule__MonitoringVariable__Group__0
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
    // InternalAdeptness.g:278:1: entryRuleSig_type : ruleSig_type EOF ;
    public final void entryRuleSig_type() throws RecognitionException {
        try {
            // InternalAdeptness.g:279:1: ( ruleSig_type EOF )
            // InternalAdeptness.g:280:1: ruleSig_type EOF
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
    // InternalAdeptness.g:287:1: ruleSig_type : ( ( rule__Sig_type__Alternatives ) ) ;
    public final void ruleSig_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:291:2: ( ( ( rule__Sig_type__Alternatives ) ) )
            // InternalAdeptness.g:292:2: ( ( rule__Sig_type__Alternatives ) )
            {
            // InternalAdeptness.g:292:2: ( ( rule__Sig_type__Alternatives ) )
            // InternalAdeptness.g:293:3: ( rule__Sig_type__Alternatives )
            {
             before(grammarAccess.getSig_typeAccess().getAlternatives()); 
            // InternalAdeptness.g:294:3: ( rule__Sig_type__Alternatives )
            // InternalAdeptness.g:294:4: rule__Sig_type__Alternatives
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
    // InternalAdeptness.g:303:1: entryRuleSignal : ruleSignal EOF ;
    public final void entryRuleSignal() throws RecognitionException {
        try {
            // InternalAdeptness.g:304:1: ( ruleSignal EOF )
            // InternalAdeptness.g:305:1: ruleSignal EOF
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
    // InternalAdeptness.g:312:1: ruleSignal : ( ( rule__Signal__Group__0 ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:316:2: ( ( ( rule__Signal__Group__0 ) ) )
            // InternalAdeptness.g:317:2: ( ( rule__Signal__Group__0 ) )
            {
            // InternalAdeptness.g:317:2: ( ( rule__Signal__Group__0 ) )
            // InternalAdeptness.g:318:3: ( rule__Signal__Group__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup()); 
            // InternalAdeptness.g:319:3: ( rule__Signal__Group__0 )
            // InternalAdeptness.g:319:4: rule__Signal__Group__0
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
    // InternalAdeptness.g:328:1: entryRuleOracle : ruleOracle EOF ;
    public final void entryRuleOracle() throws RecognitionException {
        try {
            // InternalAdeptness.g:329:1: ( ruleOracle EOF )
            // InternalAdeptness.g:330:1: ruleOracle EOF
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
    // InternalAdeptness.g:337:1: ruleOracle : ( ( rule__Oracle__Group__0 ) ) ;
    public final void ruleOracle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:341:2: ( ( ( rule__Oracle__Group__0 ) ) )
            // InternalAdeptness.g:342:2: ( ( rule__Oracle__Group__0 ) )
            {
            // InternalAdeptness.g:342:2: ( ( rule__Oracle__Group__0 ) )
            // InternalAdeptness.g:343:3: ( rule__Oracle__Group__0 )
            {
             before(grammarAccess.getOracleAccess().getGroup()); 
            // InternalAdeptness.g:344:3: ( rule__Oracle__Group__0 )
            // InternalAdeptness.g:344:4: rule__Oracle__Group__0
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
    // InternalAdeptness.g:353:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // InternalAdeptness.g:354:1: ( ruleWhile EOF )
            // InternalAdeptness.g:355:1: ruleWhile EOF
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
    // InternalAdeptness.g:362:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:366:2: ( ( ( rule__While__Group__0 ) ) )
            // InternalAdeptness.g:367:2: ( ( rule__While__Group__0 ) )
            {
            // InternalAdeptness.g:367:2: ( ( rule__While__Group__0 ) )
            // InternalAdeptness.g:368:3: ( rule__While__Group__0 )
            {
             before(grammarAccess.getWhileAccess().getGroup()); 
            // InternalAdeptness.g:369:3: ( rule__While__Group__0 )
            // InternalAdeptness.g:369:4: rule__While__Group__0
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
    // InternalAdeptness.g:378:1: entryRuleWhen : ruleWhen EOF ;
    public final void entryRuleWhen() throws RecognitionException {
        try {
            // InternalAdeptness.g:379:1: ( ruleWhen EOF )
            // InternalAdeptness.g:380:1: ruleWhen EOF
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
    // InternalAdeptness.g:387:1: ruleWhen : ( ( rule__When__Group__0 ) ) ;
    public final void ruleWhen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:391:2: ( ( ( rule__When__Group__0 ) ) )
            // InternalAdeptness.g:392:2: ( ( rule__When__Group__0 ) )
            {
            // InternalAdeptness.g:392:2: ( ( rule__When__Group__0 ) )
            // InternalAdeptness.g:393:3: ( rule__When__Group__0 )
            {
             before(grammarAccess.getWhenAccess().getGroup()); 
            // InternalAdeptness.g:394:3: ( rule__When__Group__0 )
            // InternalAdeptness.g:394:4: rule__When__Group__0
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
    // InternalAdeptness.g:403:1: entryRuleAfterWhen : ruleAfterWhen EOF ;
    public final void entryRuleAfterWhen() throws RecognitionException {
        try {
            // InternalAdeptness.g:404:1: ( ruleAfterWhen EOF )
            // InternalAdeptness.g:405:1: ruleAfterWhen EOF
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
    // InternalAdeptness.g:412:1: ruleAfterWhen : ( ( rule__AfterWhen__Alternatives ) ) ;
    public final void ruleAfterWhen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:416:2: ( ( ( rule__AfterWhen__Alternatives ) ) )
            // InternalAdeptness.g:417:2: ( ( rule__AfterWhen__Alternatives ) )
            {
            // InternalAdeptness.g:417:2: ( ( rule__AfterWhen__Alternatives ) )
            // InternalAdeptness.g:418:3: ( rule__AfterWhen__Alternatives )
            {
             before(grammarAccess.getAfterWhenAccess().getAlternatives()); 
            // InternalAdeptness.g:419:3: ( rule__AfterWhen__Alternatives )
            // InternalAdeptness.g:419:4: rule__AfterWhen__Alternatives
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
    // InternalAdeptness.g:428:1: entryRuleWait : ruleWait EOF ;
    public final void entryRuleWait() throws RecognitionException {
        try {
            // InternalAdeptness.g:429:1: ( ruleWait EOF )
            // InternalAdeptness.g:430:1: ruleWait EOF
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
    // InternalAdeptness.g:437:1: ruleWait : ( ( rule__Wait__Group__0 ) ) ;
    public final void ruleWait() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:441:2: ( ( ( rule__Wait__Group__0 ) ) )
            // InternalAdeptness.g:442:2: ( ( rule__Wait__Group__0 ) )
            {
            // InternalAdeptness.g:442:2: ( ( rule__Wait__Group__0 ) )
            // InternalAdeptness.g:443:3: ( rule__Wait__Group__0 )
            {
             before(grammarAccess.getWaitAccess().getGroup()); 
            // InternalAdeptness.g:444:3: ( rule__Wait__Group__0 )
            // InternalAdeptness.g:444:4: rule__Wait__Group__0
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
    // InternalAdeptness.g:453:1: entryRuleDuring : ruleDuring EOF ;
    public final void entryRuleDuring() throws RecognitionException {
        try {
            // InternalAdeptness.g:454:1: ( ruleDuring EOF )
            // InternalAdeptness.g:455:1: ruleDuring EOF
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
    // InternalAdeptness.g:462:1: ruleDuring : ( ( rule__During__Group__0 ) ) ;
    public final void ruleDuring() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:466:2: ( ( ( rule__During__Group__0 ) ) )
            // InternalAdeptness.g:467:2: ( ( rule__During__Group__0 ) )
            {
            // InternalAdeptness.g:467:2: ( ( rule__During__Group__0 ) )
            // InternalAdeptness.g:468:3: ( rule__During__Group__0 )
            {
             before(grammarAccess.getDuringAccess().getGroup()); 
            // InternalAdeptness.g:469:3: ( rule__During__Group__0 )
            // InternalAdeptness.g:469:4: rule__During__Group__0
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
    // InternalAdeptness.g:478:1: entryRuleChecks : ruleChecks EOF ;
    public final void entryRuleChecks() throws RecognitionException {
        try {
            // InternalAdeptness.g:479:1: ( ruleChecks EOF )
            // InternalAdeptness.g:480:1: ruleChecks EOF
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
    // InternalAdeptness.g:487:1: ruleChecks : ( ( rule__Checks__Group__0 ) ) ;
    public final void ruleChecks() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:491:2: ( ( ( rule__Checks__Group__0 ) ) )
            // InternalAdeptness.g:492:2: ( ( rule__Checks__Group__0 ) )
            {
            // InternalAdeptness.g:492:2: ( ( rule__Checks__Group__0 ) )
            // InternalAdeptness.g:493:3: ( rule__Checks__Group__0 )
            {
             before(grammarAccess.getChecksAccess().getGroup()); 
            // InternalAdeptness.g:494:3: ( rule__Checks__Group__0 )
            // InternalAdeptness.g:494:4: rule__Checks__Group__0
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
    // InternalAdeptness.g:503:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalAdeptness.g:504:1: ( ruleDescription EOF )
            // InternalAdeptness.g:505:1: ruleDescription EOF
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
    // InternalAdeptness.g:512:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:516:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalAdeptness.g:517:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalAdeptness.g:517:2: ( ( rule__Description__Group__0 ) )
            // InternalAdeptness.g:518:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalAdeptness.g:519:3: ( rule__Description__Group__0 )
            // InternalAdeptness.g:519:4: rule__Description__Group__0
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
    // InternalAdeptness.g:528:1: entryRuleFailReason : ruleFailReason EOF ;
    public final void entryRuleFailReason() throws RecognitionException {
        try {
            // InternalAdeptness.g:529:1: ( ruleFailReason EOF )
            // InternalAdeptness.g:530:1: ruleFailReason EOF
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
    // InternalAdeptness.g:537:1: ruleFailReason : ( ( rule__FailReason__Group__0 ) ) ;
    public final void ruleFailReason() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:541:2: ( ( ( rule__FailReason__Group__0 ) ) )
            // InternalAdeptness.g:542:2: ( ( rule__FailReason__Group__0 ) )
            {
            // InternalAdeptness.g:542:2: ( ( rule__FailReason__Group__0 ) )
            // InternalAdeptness.g:543:3: ( rule__FailReason__Group__0 )
            {
             before(grammarAccess.getFailReasonAccess().getGroup()); 
            // InternalAdeptness.g:544:3: ( rule__FailReason__Group__0 )
            // InternalAdeptness.g:544:4: rule__FailReason__Group__0
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
    // InternalAdeptness.g:553:1: entryRuleReason : ruleReason EOF ;
    public final void entryRuleReason() throws RecognitionException {
        try {
            // InternalAdeptness.g:554:1: ( ruleReason EOF )
            // InternalAdeptness.g:555:1: ruleReason EOF
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
    // InternalAdeptness.g:562:1: ruleReason : ( ( rule__Reason__Group__0 ) ) ;
    public final void ruleReason() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:566:2: ( ( ( rule__Reason__Group__0 ) ) )
            // InternalAdeptness.g:567:2: ( ( rule__Reason__Group__0 ) )
            {
            // InternalAdeptness.g:567:2: ( ( rule__Reason__Group__0 ) )
            // InternalAdeptness.g:568:3: ( rule__Reason__Group__0 )
            {
             before(grammarAccess.getReasonAccess().getGroup()); 
            // InternalAdeptness.g:569:3: ( rule__Reason__Group__0 )
            // InternalAdeptness.g:569:4: rule__Reason__Group__0
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
    // InternalAdeptness.g:578:1: entryRuleXPeaks : ruleXPeaks EOF ;
    public final void entryRuleXPeaks() throws RecognitionException {
        try {
            // InternalAdeptness.g:579:1: ( ruleXPeaks EOF )
            // InternalAdeptness.g:580:1: ruleXPeaks EOF
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
    // InternalAdeptness.g:587:1: ruleXPeaks : ( ( rule__XPeaks__Group__0 ) ) ;
    public final void ruleXPeaks() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:591:2: ( ( ( rule__XPeaks__Group__0 ) ) )
            // InternalAdeptness.g:592:2: ( ( rule__XPeaks__Group__0 ) )
            {
            // InternalAdeptness.g:592:2: ( ( rule__XPeaks__Group__0 ) )
            // InternalAdeptness.g:593:3: ( rule__XPeaks__Group__0 )
            {
             before(grammarAccess.getXPeaksAccess().getGroup()); 
            // InternalAdeptness.g:594:3: ( rule__XPeaks__Group__0 )
            // InternalAdeptness.g:594:4: rule__XPeaks__Group__0
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
    // InternalAdeptness.g:603:1: entryRuleConstDeg : ruleConstDeg EOF ;
    public final void entryRuleConstDeg() throws RecognitionException {
        try {
            // InternalAdeptness.g:604:1: ( ruleConstDeg EOF )
            // InternalAdeptness.g:605:1: ruleConstDeg EOF
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
    // InternalAdeptness.g:612:1: ruleConstDeg : ( ( rule__ConstDeg__Group__0 ) ) ;
    public final void ruleConstDeg() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:616:2: ( ( ( rule__ConstDeg__Group__0 ) ) )
            // InternalAdeptness.g:617:2: ( ( rule__ConstDeg__Group__0 ) )
            {
            // InternalAdeptness.g:617:2: ( ( rule__ConstDeg__Group__0 ) )
            // InternalAdeptness.g:618:3: ( rule__ConstDeg__Group__0 )
            {
             before(grammarAccess.getConstDegAccess().getGroup()); 
            // InternalAdeptness.g:619:3: ( rule__ConstDeg__Group__0 )
            // InternalAdeptness.g:619:4: rule__ConstDeg__Group__0
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
    // InternalAdeptness.g:628:1: entryRuleHighTime : ruleHighTime EOF ;
    public final void entryRuleHighTime() throws RecognitionException {
        try {
            // InternalAdeptness.g:629:1: ( ruleHighTime EOF )
            // InternalAdeptness.g:630:1: ruleHighTime EOF
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
    // InternalAdeptness.g:637:1: ruleHighTime : ( ( rule__HighTime__Group__0 ) ) ;
    public final void ruleHighTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:641:2: ( ( ( rule__HighTime__Group__0 ) ) )
            // InternalAdeptness.g:642:2: ( ( rule__HighTime__Group__0 ) )
            {
            // InternalAdeptness.g:642:2: ( ( rule__HighTime__Group__0 ) )
            // InternalAdeptness.g:643:3: ( rule__HighTime__Group__0 )
            {
             before(grammarAccess.getHighTimeAccess().getGroup()); 
            // InternalAdeptness.g:644:3: ( rule__HighTime__Group__0 )
            // InternalAdeptness.g:644:4: rule__HighTime__Group__0
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
    // InternalAdeptness.g:653:1: entryRuleHighPeak : ruleHighPeak EOF ;
    public final void entryRuleHighPeak() throws RecognitionException {
        try {
            // InternalAdeptness.g:654:1: ( ruleHighPeak EOF )
            // InternalAdeptness.g:655:1: ruleHighPeak EOF
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
    // InternalAdeptness.g:662:1: ruleHighPeak : ( ( rule__HighPeak__Group__0 ) ) ;
    public final void ruleHighPeak() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:666:2: ( ( ( rule__HighPeak__Group__0 ) ) )
            // InternalAdeptness.g:667:2: ( ( rule__HighPeak__Group__0 ) )
            {
            // InternalAdeptness.g:667:2: ( ( rule__HighPeak__Group__0 ) )
            // InternalAdeptness.g:668:3: ( rule__HighPeak__Group__0 )
            {
             before(grammarAccess.getHighPeakAccess().getGroup()); 
            // InternalAdeptness.g:669:3: ( rule__HighPeak__Group__0 )
            // InternalAdeptness.g:669:4: rule__HighPeak__Group__0
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
    // InternalAdeptness.g:678:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalAdeptness.g:679:1: ( ruleReference EOF )
            // InternalAdeptness.g:680:1: ruleReference EOF
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
    // InternalAdeptness.g:687:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:691:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalAdeptness.g:692:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalAdeptness.g:692:2: ( ( rule__Reference__Group__0 ) )
            // InternalAdeptness.g:693:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalAdeptness.g:694:3: ( rule__Reference__Group__0 )
            // InternalAdeptness.g:694:4: rule__Reference__Group__0
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
    // InternalAdeptness.g:703:1: entryRuleSame : ruleSame EOF ;
    public final void entryRuleSame() throws RecognitionException {
        try {
            // InternalAdeptness.g:704:1: ( ruleSame EOF )
            // InternalAdeptness.g:705:1: ruleSame EOF
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
    // InternalAdeptness.g:712:1: ruleSame : ( ( rule__Same__Group__0 ) ) ;
    public final void ruleSame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:716:2: ( ( ( rule__Same__Group__0 ) ) )
            // InternalAdeptness.g:717:2: ( ( rule__Same__Group__0 ) )
            {
            // InternalAdeptness.g:717:2: ( ( rule__Same__Group__0 ) )
            // InternalAdeptness.g:718:3: ( rule__Same__Group__0 )
            {
             before(grammarAccess.getSameAccess().getGroup()); 
            // InternalAdeptness.g:719:3: ( rule__Same__Group__0 )
            // InternalAdeptness.g:719:4: rule__Same__Group__0
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
    // InternalAdeptness.g:728:1: entryRuleNotSame : ruleNotSame EOF ;
    public final void entryRuleNotSame() throws RecognitionException {
        try {
            // InternalAdeptness.g:729:1: ( ruleNotSame EOF )
            // InternalAdeptness.g:730:1: ruleNotSame EOF
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
    // InternalAdeptness.g:737:1: ruleNotSame : ( ( rule__NotSame__Group__0 ) ) ;
    public final void ruleNotSame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:741:2: ( ( ( rule__NotSame__Group__0 ) ) )
            // InternalAdeptness.g:742:2: ( ( rule__NotSame__Group__0 ) )
            {
            // InternalAdeptness.g:742:2: ( ( rule__NotSame__Group__0 ) )
            // InternalAdeptness.g:743:3: ( rule__NotSame__Group__0 )
            {
             before(grammarAccess.getNotSameAccess().getGroup()); 
            // InternalAdeptness.g:744:3: ( rule__NotSame__Group__0 )
            // InternalAdeptness.g:744:4: rule__NotSame__Group__0
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
    // InternalAdeptness.g:753:1: entryRuleUpper : ruleUpper EOF ;
    public final void entryRuleUpper() throws RecognitionException {
        try {
            // InternalAdeptness.g:754:1: ( ruleUpper EOF )
            // InternalAdeptness.g:755:1: ruleUpper EOF
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
    // InternalAdeptness.g:762:1: ruleUpper : ( ( rule__Upper__Group__0 ) ) ;
    public final void ruleUpper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:766:2: ( ( ( rule__Upper__Group__0 ) ) )
            // InternalAdeptness.g:767:2: ( ( rule__Upper__Group__0 ) )
            {
            // InternalAdeptness.g:767:2: ( ( rule__Upper__Group__0 ) )
            // InternalAdeptness.g:768:3: ( rule__Upper__Group__0 )
            {
             before(grammarAccess.getUpperAccess().getGroup()); 
            // InternalAdeptness.g:769:3: ( rule__Upper__Group__0 )
            // InternalAdeptness.g:769:4: rule__Upper__Group__0
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
    // InternalAdeptness.g:778:1: entryRuleLower : ruleLower EOF ;
    public final void entryRuleLower() throws RecognitionException {
        try {
            // InternalAdeptness.g:779:1: ( ruleLower EOF )
            // InternalAdeptness.g:780:1: ruleLower EOF
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
    // InternalAdeptness.g:787:1: ruleLower : ( ( rule__Lower__Group__0 ) ) ;
    public final void ruleLower() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:791:2: ( ( ( rule__Lower__Group__0 ) ) )
            // InternalAdeptness.g:792:2: ( ( rule__Lower__Group__0 ) )
            {
            // InternalAdeptness.g:792:2: ( ( rule__Lower__Group__0 ) )
            // InternalAdeptness.g:793:3: ( rule__Lower__Group__0 )
            {
             before(grammarAccess.getLowerAccess().getGroup()); 
            // InternalAdeptness.g:794:3: ( rule__Lower__Group__0 )
            // InternalAdeptness.g:794:4: rule__Lower__Group__0
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
    // InternalAdeptness.g:803:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // InternalAdeptness.g:804:1: ( ruleRange EOF )
            // InternalAdeptness.g:805:1: ruleRange EOF
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
    // InternalAdeptness.g:812:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:816:2: ( ( ( rule__Range__Group__0 ) ) )
            // InternalAdeptness.g:817:2: ( ( rule__Range__Group__0 ) )
            {
            // InternalAdeptness.g:817:2: ( ( rule__Range__Group__0 ) )
            // InternalAdeptness.g:818:3: ( rule__Range__Group__0 )
            {
             before(grammarAccess.getRangeAccess().getGroup()); 
            // InternalAdeptness.g:819:3: ( rule__Range__Group__0 )
            // InternalAdeptness.g:819:4: rule__Range__Group__0
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
    // InternalAdeptness.g:828:1: entryRuleGap : ruleGap EOF ;
    public final void entryRuleGap() throws RecognitionException {
        try {
            // InternalAdeptness.g:829:1: ( ruleGap EOF )
            // InternalAdeptness.g:830:1: ruleGap EOF
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
    // InternalAdeptness.g:837:1: ruleGap : ( ( rule__Gap__Group__0 ) ) ;
    public final void ruleGap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:841:2: ( ( ( rule__Gap__Group__0 ) ) )
            // InternalAdeptness.g:842:2: ( ( rule__Gap__Group__0 ) )
            {
            // InternalAdeptness.g:842:2: ( ( rule__Gap__Group__0 ) )
            // InternalAdeptness.g:843:3: ( rule__Gap__Group__0 )
            {
             before(grammarAccess.getGapAccess().getGroup()); 
            // InternalAdeptness.g:844:3: ( rule__Gap__Group__0 )
            // InternalAdeptness.g:844:4: rule__Gap__Group__0
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
    // InternalAdeptness.g:853:1: entryRuleBound_up : ruleBound_up EOF ;
    public final void entryRuleBound_up() throws RecognitionException {
        try {
            // InternalAdeptness.g:854:1: ( ruleBound_up EOF )
            // InternalAdeptness.g:855:1: ruleBound_up EOF
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
    // InternalAdeptness.g:862:1: ruleBound_up : ( ( rule__Bound_up__Alternatives ) ) ;
    public final void ruleBound_up() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:866:2: ( ( ( rule__Bound_up__Alternatives ) ) )
            // InternalAdeptness.g:867:2: ( ( rule__Bound_up__Alternatives ) )
            {
            // InternalAdeptness.g:867:2: ( ( rule__Bound_up__Alternatives ) )
            // InternalAdeptness.g:868:3: ( rule__Bound_up__Alternatives )
            {
             before(grammarAccess.getBound_upAccess().getAlternatives()); 
            // InternalAdeptness.g:869:3: ( rule__Bound_up__Alternatives )
            // InternalAdeptness.g:869:4: rule__Bound_up__Alternatives
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
    // InternalAdeptness.g:878:1: entryRuleBound_Down : ruleBound_Down EOF ;
    public final void entryRuleBound_Down() throws RecognitionException {
        try {
            // InternalAdeptness.g:879:1: ( ruleBound_Down EOF )
            // InternalAdeptness.g:880:1: ruleBound_Down EOF
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
    // InternalAdeptness.g:887:1: ruleBound_Down : ( ( rule__Bound_Down__Alternatives ) ) ;
    public final void ruleBound_Down() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:891:2: ( ( ( rule__Bound_Down__Alternatives ) ) )
            // InternalAdeptness.g:892:2: ( ( rule__Bound_Down__Alternatives ) )
            {
            // InternalAdeptness.g:892:2: ( ( rule__Bound_Down__Alternatives ) )
            // InternalAdeptness.g:893:3: ( rule__Bound_Down__Alternatives )
            {
             before(grammarAccess.getBound_DownAccess().getAlternatives()); 
            // InternalAdeptness.g:894:3: ( rule__Bound_Down__Alternatives )
            // InternalAdeptness.g:894:4: rule__Bound_Down__Alternatives
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
    // InternalAdeptness.g:903:1: entryRuleBOOLEAN : ruleBOOLEAN EOF ;
    public final void entryRuleBOOLEAN() throws RecognitionException {
        try {
            // InternalAdeptness.g:904:1: ( ruleBOOLEAN EOF )
            // InternalAdeptness.g:905:1: ruleBOOLEAN EOF
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
    // InternalAdeptness.g:912:1: ruleBOOLEAN : ( ( rule__BOOLEAN__BoolAssignment ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:916:2: ( ( ( rule__BOOLEAN__BoolAssignment ) ) )
            // InternalAdeptness.g:917:2: ( ( rule__BOOLEAN__BoolAssignment ) )
            {
            // InternalAdeptness.g:917:2: ( ( rule__BOOLEAN__BoolAssignment ) )
            // InternalAdeptness.g:918:3: ( rule__BOOLEAN__BoolAssignment )
            {
             before(grammarAccess.getBOOLEANAccess().getBoolAssignment()); 
            // InternalAdeptness.g:919:3: ( rule__BOOLEAN__BoolAssignment )
            // InternalAdeptness.g:919:4: rule__BOOLEAN__BoolAssignment
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
    // InternalAdeptness.g:928:1: entryRuleb : ruleb EOF ;
    public final void entryRuleb() throws RecognitionException {
        try {
            // InternalAdeptness.g:929:1: ( ruleb EOF )
            // InternalAdeptness.g:930:1: ruleb EOF
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
    // InternalAdeptness.g:937:1: ruleb : ( ( rule__B__Alternatives ) ) ;
    public final void ruleb() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:941:2: ( ( ( rule__B__Alternatives ) ) )
            // InternalAdeptness.g:942:2: ( ( rule__B__Alternatives ) )
            {
            // InternalAdeptness.g:942:2: ( ( rule__B__Alternatives ) )
            // InternalAdeptness.g:943:3: ( rule__B__Alternatives )
            {
             before(grammarAccess.getBAccess().getAlternatives()); 
            // InternalAdeptness.g:944:3: ( rule__B__Alternatives )
            // InternalAdeptness.g:944:4: rule__B__Alternatives
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
    // InternalAdeptness.g:953:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalAdeptness.g:954:1: ( ruleDOUBLE EOF )
            // InternalAdeptness.g:955:1: ruleDOUBLE EOF
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
    // InternalAdeptness.g:962:1: ruleDOUBLE : ( ( rule__DOUBLE__DValAssignment ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:966:2: ( ( ( rule__DOUBLE__DValAssignment ) ) )
            // InternalAdeptness.g:967:2: ( ( rule__DOUBLE__DValAssignment ) )
            {
            // InternalAdeptness.g:967:2: ( ( rule__DOUBLE__DValAssignment ) )
            // InternalAdeptness.g:968:3: ( rule__DOUBLE__DValAssignment )
            {
             before(grammarAccess.getDOUBLEAccess().getDValAssignment()); 
            // InternalAdeptness.g:969:3: ( rule__DOUBLE__DValAssignment )
            // InternalAdeptness.g:969:4: rule__DOUBLE__DValAssignment
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
    // InternalAdeptness.g:978:1: entryRuled : ruled EOF ;
    public final void entryRuled() throws RecognitionException {
        try {
            // InternalAdeptness.g:979:1: ( ruled EOF )
            // InternalAdeptness.g:980:1: ruled EOF
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
    // InternalAdeptness.g:987:1: ruled : ( ( rule__D__Group__0 ) ) ;
    public final void ruled() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:991:2: ( ( ( rule__D__Group__0 ) ) )
            // InternalAdeptness.g:992:2: ( ( rule__D__Group__0 ) )
            {
            // InternalAdeptness.g:992:2: ( ( rule__D__Group__0 ) )
            // InternalAdeptness.g:993:3: ( rule__D__Group__0 )
            {
             before(grammarAccess.getDAccess().getGroup()); 
            // InternalAdeptness.g:994:3: ( rule__D__Group__0 )
            // InternalAdeptness.g:994:4: rule__D__Group__0
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
    // InternalAdeptness.g:1003:1: entryRuleTimeType : ruleTimeType EOF ;
    public final void entryRuleTimeType() throws RecognitionException {
        try {
            // InternalAdeptness.g:1004:1: ( ruleTimeType EOF )
            // InternalAdeptness.g:1005:1: ruleTimeType EOF
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
    // InternalAdeptness.g:1012:1: ruleTimeType : ( ( rule__TimeType__Alternatives ) ) ;
    public final void ruleTimeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1016:2: ( ( ( rule__TimeType__Alternatives ) ) )
            // InternalAdeptness.g:1017:2: ( ( rule__TimeType__Alternatives ) )
            {
            // InternalAdeptness.g:1017:2: ( ( rule__TimeType__Alternatives ) )
            // InternalAdeptness.g:1018:3: ( rule__TimeType__Alternatives )
            {
             before(grammarAccess.getTimeTypeAccess().getAlternatives()); 
            // InternalAdeptness.g:1019:3: ( rule__TimeType__Alternatives )
            // InternalAdeptness.g:1019:4: rule__TimeType__Alternatives
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
    // InternalAdeptness.g:1028:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalAdeptness.g:1029:1: ( ruleDataType EOF )
            // InternalAdeptness.g:1030:1: ruleDataType EOF
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
    // InternalAdeptness.g:1037:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1041:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalAdeptness.g:1042:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalAdeptness.g:1042:2: ( ( rule__DataType__Group__0 ) )
            // InternalAdeptness.g:1043:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalAdeptness.g:1044:3: ( rule__DataType__Group__0 )
            // InternalAdeptness.g:1044:4: rule__DataType__Group__0
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
    // InternalAdeptness.g:1053:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // InternalAdeptness.g:1054:1: ( rulePackageDeclaration EOF )
            // InternalAdeptness.g:1055:1: rulePackageDeclaration EOF
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
    // InternalAdeptness.g:1062:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1066:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // InternalAdeptness.g:1067:2: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // InternalAdeptness.g:1067:2: ( ( rule__PackageDeclaration__Group__0 ) )
            // InternalAdeptness.g:1068:3: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // InternalAdeptness.g:1069:3: ( rule__PackageDeclaration__Group__0 )
            // InternalAdeptness.g:1069:4: rule__PackageDeclaration__Group__0
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
    // InternalAdeptness.g:1078:1: entryRuleExpressionsModel : ruleExpressionsModel EOF ;
    public final void entryRuleExpressionsModel() throws RecognitionException {
        try {
            // InternalAdeptness.g:1079:1: ( ruleExpressionsModel EOF )
            // InternalAdeptness.g:1080:1: ruleExpressionsModel EOF
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
    // InternalAdeptness.g:1087:1: ruleExpressionsModel : ( ( rule__ExpressionsModel__ElementsAssignment )* ) ;
    public final void ruleExpressionsModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1091:2: ( ( ( rule__ExpressionsModel__ElementsAssignment )* ) )
            // InternalAdeptness.g:1092:2: ( ( rule__ExpressionsModel__ElementsAssignment )* )
            {
            // InternalAdeptness.g:1092:2: ( ( rule__ExpressionsModel__ElementsAssignment )* )
            // InternalAdeptness.g:1093:3: ( rule__ExpressionsModel__ElementsAssignment )*
            {
             before(grammarAccess.getExpressionsModelAccess().getElementsAssignment()); 
            // InternalAdeptness.g:1094:3: ( rule__ExpressionsModel__ElementsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_INT)||LA2_0==11||LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAdeptness.g:1094:4: rule__ExpressionsModel__ElementsAssignment
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
    // InternalAdeptness.g:1103:1: entryRuleAbstractElement2 : ruleAbstractElement2 EOF ;
    public final void entryRuleAbstractElement2() throws RecognitionException {
        try {
            // InternalAdeptness.g:1104:1: ( ruleAbstractElement2 EOF )
            // InternalAdeptness.g:1105:1: ruleAbstractElement2 EOF
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
    // InternalAdeptness.g:1112:1: ruleAbstractElement2 : ( ( rule__AbstractElement2__Group__0 ) ) ;
    public final void ruleAbstractElement2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1116:2: ( ( ( rule__AbstractElement2__Group__0 ) ) )
            // InternalAdeptness.g:1117:2: ( ( rule__AbstractElement2__Group__0 ) )
            {
            // InternalAdeptness.g:1117:2: ( ( rule__AbstractElement2__Group__0 ) )
            // InternalAdeptness.g:1118:3: ( rule__AbstractElement2__Group__0 )
            {
             before(grammarAccess.getAbstractElement2Access().getGroup()); 
            // InternalAdeptness.g:1119:3: ( rule__AbstractElement2__Group__0 )
            // InternalAdeptness.g:1119:4: rule__AbstractElement2__Group__0
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
    // InternalAdeptness.g:1128:1: entryRuleFrontParentheses : ruleFrontParentheses EOF ;
    public final void entryRuleFrontParentheses() throws RecognitionException {
        try {
            // InternalAdeptness.g:1129:1: ( ruleFrontParentheses EOF )
            // InternalAdeptness.g:1130:1: ruleFrontParentheses EOF
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
    // InternalAdeptness.g:1137:1: ruleFrontParentheses : ( '(' ) ;
    public final void ruleFrontParentheses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1141:2: ( ( '(' ) )
            // InternalAdeptness.g:1142:2: ( '(' )
            {
            // InternalAdeptness.g:1142:2: ( '(' )
            // InternalAdeptness.g:1143:3: '('
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
    // InternalAdeptness.g:1153:1: entryRuleBackParentheses : ruleBackParentheses EOF ;
    public final void entryRuleBackParentheses() throws RecognitionException {
        try {
            // InternalAdeptness.g:1154:1: ( ruleBackParentheses EOF )
            // InternalAdeptness.g:1155:1: ruleBackParentheses EOF
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
    // InternalAdeptness.g:1162:1: ruleBackParentheses : ( ')' ) ;
    public final void ruleBackParentheses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1166:2: ( ( ')' ) )
            // InternalAdeptness.g:1167:2: ( ')' )
            {
            // InternalAdeptness.g:1167:2: ( ')' )
            // InternalAdeptness.g:1168:3: ')'
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
    // InternalAdeptness.g:1178:1: entryRuleOperators : ruleOperators EOF ;
    public final void entryRuleOperators() throws RecognitionException {
        try {
            // InternalAdeptness.g:1179:1: ( ruleOperators EOF )
            // InternalAdeptness.g:1180:1: ruleOperators EOF
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
    // InternalAdeptness.g:1187:1: ruleOperators : ( ( rule__Operators__Alternatives ) ) ;
    public final void ruleOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1191:2: ( ( ( rule__Operators__Alternatives ) ) )
            // InternalAdeptness.g:1192:2: ( ( rule__Operators__Alternatives ) )
            {
            // InternalAdeptness.g:1192:2: ( ( rule__Operators__Alternatives ) )
            // InternalAdeptness.g:1193:3: ( rule__Operators__Alternatives )
            {
             before(grammarAccess.getOperatorsAccess().getAlternatives()); 
            // InternalAdeptness.g:1194:3: ( rule__Operators__Alternatives )
            // InternalAdeptness.g:1194:4: rule__Operators__Alternatives
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
    // InternalAdeptness.g:1203:1: entryRuleCompOp : ruleCompOp EOF ;
    public final void entryRuleCompOp() throws RecognitionException {
        try {
            // InternalAdeptness.g:1204:1: ( ruleCompOp EOF )
            // InternalAdeptness.g:1205:1: ruleCompOp EOF
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
    // InternalAdeptness.g:1212:1: ruleCompOp : ( ( rule__CompOp__OpAssignment ) ) ;
    public final void ruleCompOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1216:2: ( ( ( rule__CompOp__OpAssignment ) ) )
            // InternalAdeptness.g:1217:2: ( ( rule__CompOp__OpAssignment ) )
            {
            // InternalAdeptness.g:1217:2: ( ( rule__CompOp__OpAssignment ) )
            // InternalAdeptness.g:1218:3: ( rule__CompOp__OpAssignment )
            {
             before(grammarAccess.getCompOpAccess().getOpAssignment()); 
            // InternalAdeptness.g:1219:3: ( rule__CompOp__OpAssignment )
            // InternalAdeptness.g:1219:4: rule__CompOp__OpAssignment
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
    // InternalAdeptness.g:1228:1: entryRuleLogicOp : ruleLogicOp EOF ;
    public final void entryRuleLogicOp() throws RecognitionException {
        try {
            // InternalAdeptness.g:1229:1: ( ruleLogicOp EOF )
            // InternalAdeptness.g:1230:1: ruleLogicOp EOF
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
    // InternalAdeptness.g:1237:1: ruleLogicOp : ( ( rule__LogicOp__OpAssignment ) ) ;
    public final void ruleLogicOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1241:2: ( ( ( rule__LogicOp__OpAssignment ) ) )
            // InternalAdeptness.g:1242:2: ( ( rule__LogicOp__OpAssignment ) )
            {
            // InternalAdeptness.g:1242:2: ( ( rule__LogicOp__OpAssignment ) )
            // InternalAdeptness.g:1243:3: ( rule__LogicOp__OpAssignment )
            {
             before(grammarAccess.getLogicOpAccess().getOpAssignment()); 
            // InternalAdeptness.g:1244:3: ( rule__LogicOp__OpAssignment )
            // InternalAdeptness.g:1244:4: rule__LogicOp__OpAssignment
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
    // InternalAdeptness.g:1253:1: entryRuleOp : ruleOp EOF ;
    public final void entryRuleOp() throws RecognitionException {
        try {
            // InternalAdeptness.g:1254:1: ( ruleOp EOF )
            // InternalAdeptness.g:1255:1: ruleOp EOF
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
    // InternalAdeptness.g:1262:1: ruleOp : ( ( rule__Op__OpAssignment ) ) ;
    public final void ruleOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1266:2: ( ( ( rule__Op__OpAssignment ) ) )
            // InternalAdeptness.g:1267:2: ( ( rule__Op__OpAssignment ) )
            {
            // InternalAdeptness.g:1267:2: ( ( rule__Op__OpAssignment ) )
            // InternalAdeptness.g:1268:3: ( rule__Op__OpAssignment )
            {
             before(grammarAccess.getOpAccess().getOpAssignment()); 
            // InternalAdeptness.g:1269:3: ( rule__Op__OpAssignment )
            // InternalAdeptness.g:1269:4: rule__Op__OpAssignment
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
    // InternalAdeptness.g:1277:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImports ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1281:1: ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImports ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt3=1;
                }
                break;
            case 30:
            case 38:
            case 66:
                {
                alt3=2;
                }
                break;
            case 27:
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
                    // InternalAdeptness.g:1282:2: ( rulePackageDeclaration )
                    {
                    // InternalAdeptness.g:1282:2: ( rulePackageDeclaration )
                    // InternalAdeptness.g:1283:3: rulePackageDeclaration
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
                    // InternalAdeptness.g:1288:2: ( ruleType )
                    {
                    // InternalAdeptness.g:1288:2: ( ruleType )
                    // InternalAdeptness.g:1289:3: ruleType
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
                    // InternalAdeptness.g:1294:2: ( ruleImports )
                    {
                    // InternalAdeptness.g:1294:2: ( ruleImports )
                    // InternalAdeptness.g:1295:3: ruleImports
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
    // InternalAdeptness.g:1304:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleSignal ) | ( ruleMonitoringFile ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1308:1: ( ( ruleDataType ) | ( ruleSignal ) | ( ruleMonitoringFile ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt4=1;
                }
                break;
            case 38:
                {
                alt4=2;
                }
                break;
            case 30:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalAdeptness.g:1309:2: ( ruleDataType )
                    {
                    // InternalAdeptness.g:1309:2: ( ruleDataType )
                    // InternalAdeptness.g:1310:3: ruleDataType
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
                    // InternalAdeptness.g:1315:2: ( ruleSignal )
                    {
                    // InternalAdeptness.g:1315:2: ( ruleSignal )
                    // InternalAdeptness.g:1316:3: ruleSignal
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
                    // InternalAdeptness.g:1321:2: ( ruleMonitoringFile )
                    {
                    // InternalAdeptness.g:1321:2: ( ruleMonitoringFile )
                    // InternalAdeptness.g:1322:3: ruleMonitoringFile
                    {
                     before(grammarAccess.getTypeAccess().getMonitoringFileParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMonitoringFile();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getMonitoringFileParserRuleCall_2()); 

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
    // InternalAdeptness.g:1331:1: rule__Sig_type__Alternatives : ( ( ( rule__Sig_type__Sig_typeAssignment_0 ) ) | ( ( rule__Sig_type__Sig_typeAssignment_1 ) ) | ( ( rule__Sig_type__Sig_typeAssignment_2 ) ) );
    public final void rule__Sig_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1335:1: ( ( ( rule__Sig_type__Sig_typeAssignment_0 ) ) | ( ( rule__Sig_type__Sig_typeAssignment_1 ) ) | ( ( rule__Sig_type__Sig_typeAssignment_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt5=1;
                }
                break;
            case 71:
                {
                alt5=2;
                }
                break;
            case 72:
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
                    // InternalAdeptness.g:1336:2: ( ( rule__Sig_type__Sig_typeAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1336:2: ( ( rule__Sig_type__Sig_typeAssignment_0 ) )
                    // InternalAdeptness.g:1337:3: ( rule__Sig_type__Sig_typeAssignment_0 )
                    {
                     before(grammarAccess.getSig_typeAccess().getSig_typeAssignment_0()); 
                    // InternalAdeptness.g:1338:3: ( rule__Sig_type__Sig_typeAssignment_0 )
                    // InternalAdeptness.g:1338:4: rule__Sig_type__Sig_typeAssignment_0
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
                    // InternalAdeptness.g:1342:2: ( ( rule__Sig_type__Sig_typeAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1342:2: ( ( rule__Sig_type__Sig_typeAssignment_1 ) )
                    // InternalAdeptness.g:1343:3: ( rule__Sig_type__Sig_typeAssignment_1 )
                    {
                     before(grammarAccess.getSig_typeAccess().getSig_typeAssignment_1()); 
                    // InternalAdeptness.g:1344:3: ( rule__Sig_type__Sig_typeAssignment_1 )
                    // InternalAdeptness.g:1344:4: rule__Sig_type__Sig_typeAssignment_1
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
                    // InternalAdeptness.g:1348:2: ( ( rule__Sig_type__Sig_typeAssignment_2 ) )
                    {
                    // InternalAdeptness.g:1348:2: ( ( rule__Sig_type__Sig_typeAssignment_2 ) )
                    // InternalAdeptness.g:1349:3: ( rule__Sig_type__Sig_typeAssignment_2 )
                    {
                     before(grammarAccess.getSig_typeAccess().getSig_typeAssignment_2()); 
                    // InternalAdeptness.g:1350:3: ( rule__Sig_type__Sig_typeAssignment_2 )
                    // InternalAdeptness.g:1350:4: rule__Sig_type__Sig_typeAssignment_2
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
    // InternalAdeptness.g:1358:1: rule__Oracle__Alternatives_3 : ( ( ( rule__Oracle__WhenAssignment_3_0 ) ) | ( ( rule__Oracle__WhileAssignment_3_1 ) ) );
    public final void rule__Oracle__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1362:1: ( ( ( rule__Oracle__WhenAssignment_3_0 ) ) | ( ( rule__Oracle__WhileAssignment_3_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==46) ) {
                alt6=1;
            }
            else if ( (LA6_0==45) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAdeptness.g:1363:2: ( ( rule__Oracle__WhenAssignment_3_0 ) )
                    {
                    // InternalAdeptness.g:1363:2: ( ( rule__Oracle__WhenAssignment_3_0 ) )
                    // InternalAdeptness.g:1364:3: ( rule__Oracle__WhenAssignment_3_0 )
                    {
                     before(grammarAccess.getOracleAccess().getWhenAssignment_3_0()); 
                    // InternalAdeptness.g:1365:3: ( rule__Oracle__WhenAssignment_3_0 )
                    // InternalAdeptness.g:1365:4: rule__Oracle__WhenAssignment_3_0
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
                    // InternalAdeptness.g:1369:2: ( ( rule__Oracle__WhileAssignment_3_1 ) )
                    {
                    // InternalAdeptness.g:1369:2: ( ( rule__Oracle__WhileAssignment_3_1 ) )
                    // InternalAdeptness.g:1370:3: ( rule__Oracle__WhileAssignment_3_1 )
                    {
                     before(grammarAccess.getOracleAccess().getWhileAssignment_3_1()); 
                    // InternalAdeptness.g:1371:3: ( rule__Oracle__WhileAssignment_3_1 )
                    // InternalAdeptness.g:1371:4: rule__Oracle__WhileAssignment_3_1
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
    // InternalAdeptness.g:1379:1: rule__AfterWhen__Alternatives : ( ( ( rule__AfterWhen__WaitAssignment_0 ) ) | ( ( rule__AfterWhen__DuringAssignment_1 ) ) );
    public final void rule__AfterWhen__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1383:1: ( ( ( rule__AfterWhen__WaitAssignment_0 ) ) | ( ( rule__AfterWhen__DuringAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==47) ) {
                alt7=1;
            }
            else if ( (LA7_0==49) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAdeptness.g:1384:2: ( ( rule__AfterWhen__WaitAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1384:2: ( ( rule__AfterWhen__WaitAssignment_0 ) )
                    // InternalAdeptness.g:1385:3: ( rule__AfterWhen__WaitAssignment_0 )
                    {
                     before(grammarAccess.getAfterWhenAccess().getWaitAssignment_0()); 
                    // InternalAdeptness.g:1386:3: ( rule__AfterWhen__WaitAssignment_0 )
                    // InternalAdeptness.g:1386:4: rule__AfterWhen__WaitAssignment_0
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
                    // InternalAdeptness.g:1390:2: ( ( rule__AfterWhen__DuringAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1390:2: ( ( rule__AfterWhen__DuringAssignment_1 ) )
                    // InternalAdeptness.g:1391:3: ( rule__AfterWhen__DuringAssignment_1 )
                    {
                     before(grammarAccess.getAfterWhenAccess().getDuringAssignment_1()); 
                    // InternalAdeptness.g:1392:3: ( rule__AfterWhen__DuringAssignment_1 )
                    // InternalAdeptness.g:1392:4: rule__AfterWhen__DuringAssignment_1
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
    // InternalAdeptness.g:1400:1: rule__Checks__Alternatives_1 : ( ( ( rule__Checks__NameAssignment_1_0 ) ) | ( ( rule__Checks__EmAssignment_1_1 ) ) );
    public final void rule__Checks__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1404:1: ( ( ( rule__Checks__NameAssignment_1_0 ) ) | ( ( rule__Checks__EmAssignment_1_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT||LA8_0==11||LA8_0==24||(LA8_0>=59 && LA8_0<=63)||LA8_0==65) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAdeptness.g:1405:2: ( ( rule__Checks__NameAssignment_1_0 ) )
                    {
                    // InternalAdeptness.g:1405:2: ( ( rule__Checks__NameAssignment_1_0 ) )
                    // InternalAdeptness.g:1406:3: ( rule__Checks__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getChecksAccess().getNameAssignment_1_0()); 
                    // InternalAdeptness.g:1407:3: ( rule__Checks__NameAssignment_1_0 )
                    // InternalAdeptness.g:1407:4: rule__Checks__NameAssignment_1_0
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
                    // InternalAdeptness.g:1411:2: ( ( rule__Checks__EmAssignment_1_1 ) )
                    {
                    // InternalAdeptness.g:1411:2: ( ( rule__Checks__EmAssignment_1_1 ) )
                    // InternalAdeptness.g:1412:3: ( rule__Checks__EmAssignment_1_1 )
                    {
                     before(grammarAccess.getChecksAccess().getEmAssignment_1_1()); 
                    // InternalAdeptness.g:1413:3: ( rule__Checks__EmAssignment_1_1 )
                    // InternalAdeptness.g:1413:4: rule__Checks__EmAssignment_1_1
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
    // InternalAdeptness.g:1421:1: rule__Reason__Alternatives_0 : ( ( ( rule__Reason__HighPeakAssignment_0_0 ) ) | ( ( rule__Reason__HighTimeAssignment_0_1 ) ) | ( ( rule__Reason__ConstDegAssignment_0_2 ) ) | ( ( rule__Reason__XPeaksAssignment_0_3 ) ) );
    public final void rule__Reason__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1425:1: ( ( ( rule__Reason__HighPeakAssignment_0_0 ) ) | ( ( rule__Reason__HighTimeAssignment_0_1 ) ) | ( ( rule__Reason__ConstDegAssignment_0_2 ) ) | ( ( rule__Reason__XPeaksAssignment_0_3 ) ) )
            int alt9=4;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalAdeptness.g:1426:2: ( ( rule__Reason__HighPeakAssignment_0_0 ) )
                    {
                    // InternalAdeptness.g:1426:2: ( ( rule__Reason__HighPeakAssignment_0_0 ) )
                    // InternalAdeptness.g:1427:3: ( rule__Reason__HighPeakAssignment_0_0 )
                    {
                     before(grammarAccess.getReasonAccess().getHighPeakAssignment_0_0()); 
                    // InternalAdeptness.g:1428:3: ( rule__Reason__HighPeakAssignment_0_0 )
                    // InternalAdeptness.g:1428:4: rule__Reason__HighPeakAssignment_0_0
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
                    // InternalAdeptness.g:1432:2: ( ( rule__Reason__HighTimeAssignment_0_1 ) )
                    {
                    // InternalAdeptness.g:1432:2: ( ( rule__Reason__HighTimeAssignment_0_1 ) )
                    // InternalAdeptness.g:1433:3: ( rule__Reason__HighTimeAssignment_0_1 )
                    {
                     before(grammarAccess.getReasonAccess().getHighTimeAssignment_0_1()); 
                    // InternalAdeptness.g:1434:3: ( rule__Reason__HighTimeAssignment_0_1 )
                    // InternalAdeptness.g:1434:4: rule__Reason__HighTimeAssignment_0_1
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
                    // InternalAdeptness.g:1438:2: ( ( rule__Reason__ConstDegAssignment_0_2 ) )
                    {
                    // InternalAdeptness.g:1438:2: ( ( rule__Reason__ConstDegAssignment_0_2 ) )
                    // InternalAdeptness.g:1439:3: ( rule__Reason__ConstDegAssignment_0_2 )
                    {
                     before(grammarAccess.getReasonAccess().getConstDegAssignment_0_2()); 
                    // InternalAdeptness.g:1440:3: ( rule__Reason__ConstDegAssignment_0_2 )
                    // InternalAdeptness.g:1440:4: rule__Reason__ConstDegAssignment_0_2
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
                    // InternalAdeptness.g:1444:2: ( ( rule__Reason__XPeaksAssignment_0_3 ) )
                    {
                    // InternalAdeptness.g:1444:2: ( ( rule__Reason__XPeaksAssignment_0_3 ) )
                    // InternalAdeptness.g:1445:3: ( rule__Reason__XPeaksAssignment_0_3 )
                    {
                     before(grammarAccess.getReasonAccess().getXPeaksAssignment_0_3()); 
                    // InternalAdeptness.g:1446:3: ( rule__Reason__XPeaksAssignment_0_3 )
                    // InternalAdeptness.g:1446:4: rule__Reason__XPeaksAssignment_0_3
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
    // InternalAdeptness.g:1454:1: rule__Reference__Alternatives_0 : ( ( ( rule__Reference__UpperAssignment_0_0 ) ) | ( ( rule__Reference__LowerAssignment_0_1 ) ) | ( ( rule__Reference__RangeAssignment_0_2 ) ) | ( ( rule__Reference__GapAssignment_0_3 ) ) | ( ( rule__Reference__SameAssignment_0_4 ) ) | ( ( rule__Reference__NotsameAssignment_0_5 ) ) );
    public final void rule__Reference__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1458:1: ( ( ( rule__Reference__UpperAssignment_0_0 ) ) | ( ( rule__Reference__LowerAssignment_0_1 ) ) | ( ( rule__Reference__RangeAssignment_0_2 ) ) | ( ( rule__Reference__GapAssignment_0_3 ) ) | ( ( rule__Reference__SameAssignment_0_4 ) ) | ( ( rule__Reference__NotsameAssignment_0_5 ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt10=1;
                }
                break;
            case 62:
                {
                alt10=2;
                }
                break;
            case 63:
                {
                alt10=3;
                }
                break;
            case 65:
                {
                alt10=4;
                }
                break;
            case 59:
                {
                alt10=5;
                }
                break;
            case 60:
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
                    // InternalAdeptness.g:1459:2: ( ( rule__Reference__UpperAssignment_0_0 ) )
                    {
                    // InternalAdeptness.g:1459:2: ( ( rule__Reference__UpperAssignment_0_0 ) )
                    // InternalAdeptness.g:1460:3: ( rule__Reference__UpperAssignment_0_0 )
                    {
                     before(grammarAccess.getReferenceAccess().getUpperAssignment_0_0()); 
                    // InternalAdeptness.g:1461:3: ( rule__Reference__UpperAssignment_0_0 )
                    // InternalAdeptness.g:1461:4: rule__Reference__UpperAssignment_0_0
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
                    // InternalAdeptness.g:1465:2: ( ( rule__Reference__LowerAssignment_0_1 ) )
                    {
                    // InternalAdeptness.g:1465:2: ( ( rule__Reference__LowerAssignment_0_1 ) )
                    // InternalAdeptness.g:1466:3: ( rule__Reference__LowerAssignment_0_1 )
                    {
                     before(grammarAccess.getReferenceAccess().getLowerAssignment_0_1()); 
                    // InternalAdeptness.g:1467:3: ( rule__Reference__LowerAssignment_0_1 )
                    // InternalAdeptness.g:1467:4: rule__Reference__LowerAssignment_0_1
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
                    // InternalAdeptness.g:1471:2: ( ( rule__Reference__RangeAssignment_0_2 ) )
                    {
                    // InternalAdeptness.g:1471:2: ( ( rule__Reference__RangeAssignment_0_2 ) )
                    // InternalAdeptness.g:1472:3: ( rule__Reference__RangeAssignment_0_2 )
                    {
                     before(grammarAccess.getReferenceAccess().getRangeAssignment_0_2()); 
                    // InternalAdeptness.g:1473:3: ( rule__Reference__RangeAssignment_0_2 )
                    // InternalAdeptness.g:1473:4: rule__Reference__RangeAssignment_0_2
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
                    // InternalAdeptness.g:1477:2: ( ( rule__Reference__GapAssignment_0_3 ) )
                    {
                    // InternalAdeptness.g:1477:2: ( ( rule__Reference__GapAssignment_0_3 ) )
                    // InternalAdeptness.g:1478:3: ( rule__Reference__GapAssignment_0_3 )
                    {
                     before(grammarAccess.getReferenceAccess().getGapAssignment_0_3()); 
                    // InternalAdeptness.g:1479:3: ( rule__Reference__GapAssignment_0_3 )
                    // InternalAdeptness.g:1479:4: rule__Reference__GapAssignment_0_3
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
                    // InternalAdeptness.g:1483:2: ( ( rule__Reference__SameAssignment_0_4 ) )
                    {
                    // InternalAdeptness.g:1483:2: ( ( rule__Reference__SameAssignment_0_4 ) )
                    // InternalAdeptness.g:1484:3: ( rule__Reference__SameAssignment_0_4 )
                    {
                     before(grammarAccess.getReferenceAccess().getSameAssignment_0_4()); 
                    // InternalAdeptness.g:1485:3: ( rule__Reference__SameAssignment_0_4 )
                    // InternalAdeptness.g:1485:4: rule__Reference__SameAssignment_0_4
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
                    // InternalAdeptness.g:1489:2: ( ( rule__Reference__NotsameAssignment_0_5 ) )
                    {
                    // InternalAdeptness.g:1489:2: ( ( rule__Reference__NotsameAssignment_0_5 ) )
                    // InternalAdeptness.g:1490:3: ( rule__Reference__NotsameAssignment_0_5 )
                    {
                     before(grammarAccess.getReferenceAccess().getNotsameAssignment_0_5()); 
                    // InternalAdeptness.g:1491:3: ( rule__Reference__NotsameAssignment_0_5 )
                    // InternalAdeptness.g:1491:4: rule__Reference__NotsameAssignment_0_5
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


    // $ANTLR start "rule__Bound_up__Alternatives"
    // InternalAdeptness.g:1499:1: rule__Bound_up__Alternatives : ( ( ( rule__Bound_up__ValueAssignment_0 ) ) | ( ( rule__Bound_up__EmAssignment_1 ) ) );
    public final void rule__Bound_up__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1503:1: ( ( ( rule__Bound_up__ValueAssignment_0 ) ) | ( ( rule__Bound_up__EmAssignment_1 ) ) )
            int alt11=2;
            switch ( input.LA(1) ) {
            case 24:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_INT) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt11=1;
                }
                break;
            case EOF:
            case RULE_ID:
            case 11:
            case 53:
                {
                alt11=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalAdeptness.g:1504:2: ( ( rule__Bound_up__ValueAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1504:2: ( ( rule__Bound_up__ValueAssignment_0 ) )
                    // InternalAdeptness.g:1505:3: ( rule__Bound_up__ValueAssignment_0 )
                    {
                     before(grammarAccess.getBound_upAccess().getValueAssignment_0()); 
                    // InternalAdeptness.g:1506:3: ( rule__Bound_up__ValueAssignment_0 )
                    // InternalAdeptness.g:1506:4: rule__Bound_up__ValueAssignment_0
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
                    // InternalAdeptness.g:1510:2: ( ( rule__Bound_up__EmAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1510:2: ( ( rule__Bound_up__EmAssignment_1 ) )
                    // InternalAdeptness.g:1511:3: ( rule__Bound_up__EmAssignment_1 )
                    {
                     before(grammarAccess.getBound_upAccess().getEmAssignment_1()); 
                    // InternalAdeptness.g:1512:3: ( rule__Bound_up__EmAssignment_1 )
                    // InternalAdeptness.g:1512:4: rule__Bound_up__EmAssignment_1
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
    // InternalAdeptness.g:1520:1: rule__Bound_Down__Alternatives : ( ( ( rule__Bound_Down__ValueAssignment_0 ) ) | ( ( rule__Bound_Down__EmAssignment_1 ) ) );
    public final void rule__Bound_Down__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1524:1: ( ( ( rule__Bound_Down__ValueAssignment_0 ) ) | ( ( rule__Bound_Down__EmAssignment_1 ) ) )
            int alt12=2;
            switch ( input.LA(1) ) {
            case 24:
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_INT) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt12=1;
                }
                break;
            case EOF:
            case RULE_ID:
            case 11:
            case 53:
            case 64:
                {
                alt12=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalAdeptness.g:1525:2: ( ( rule__Bound_Down__ValueAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1525:2: ( ( rule__Bound_Down__ValueAssignment_0 ) )
                    // InternalAdeptness.g:1526:3: ( rule__Bound_Down__ValueAssignment_0 )
                    {
                     before(grammarAccess.getBound_DownAccess().getValueAssignment_0()); 
                    // InternalAdeptness.g:1527:3: ( rule__Bound_Down__ValueAssignment_0 )
                    // InternalAdeptness.g:1527:4: rule__Bound_Down__ValueAssignment_0
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
                    // InternalAdeptness.g:1531:2: ( ( rule__Bound_Down__EmAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1531:2: ( ( rule__Bound_Down__EmAssignment_1 ) )
                    // InternalAdeptness.g:1532:3: ( rule__Bound_Down__EmAssignment_1 )
                    {
                     before(grammarAccess.getBound_DownAccess().getEmAssignment_1()); 
                    // InternalAdeptness.g:1533:3: ( rule__Bound_Down__EmAssignment_1 )
                    // InternalAdeptness.g:1533:4: rule__Bound_Down__EmAssignment_1
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
    // InternalAdeptness.g:1541:1: rule__B__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__B__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1545:1: ( ( 'true' ) | ( 'false' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            else if ( (LA13_0==14) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalAdeptness.g:1546:2: ( 'true' )
                    {
                    // InternalAdeptness.g:1546:2: ( 'true' )
                    // InternalAdeptness.g:1547:3: 'true'
                    {
                     before(grammarAccess.getBAccess().getTrueKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1552:2: ( 'false' )
                    {
                    // InternalAdeptness.g:1552:2: ( 'false' )
                    // InternalAdeptness.g:1553:3: 'false'
                    {
                     before(grammarAccess.getBAccess().getFalseKeyword_1()); 
                    match(input,14,FOLLOW_2); 
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
    // InternalAdeptness.g:1562:1: rule__TimeType__Alternatives : ( ( ( rule__TimeType__TimeAssignment_0 ) ) | ( ( rule__TimeType__TimeAssignment_1 ) ) | ( ( rule__TimeType__TimeAssignment_2 ) ) | ( ( rule__TimeType__TimeAssignment_3 ) ) );
    public final void rule__TimeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1566:1: ( ( ( rule__TimeType__TimeAssignment_0 ) ) | ( ( rule__TimeType__TimeAssignment_1 ) ) | ( ( rule__TimeType__TimeAssignment_2 ) ) | ( ( rule__TimeType__TimeAssignment_3 ) ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt14=1;
                }
                break;
            case 74:
                {
                alt14=2;
                }
                break;
            case 75:
                {
                alt14=3;
                }
                break;
            case 76:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalAdeptness.g:1567:2: ( ( rule__TimeType__TimeAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1567:2: ( ( rule__TimeType__TimeAssignment_0 ) )
                    // InternalAdeptness.g:1568:3: ( rule__TimeType__TimeAssignment_0 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_0()); 
                    // InternalAdeptness.g:1569:3: ( rule__TimeType__TimeAssignment_0 )
                    // InternalAdeptness.g:1569:4: rule__TimeType__TimeAssignment_0
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
                    // InternalAdeptness.g:1573:2: ( ( rule__TimeType__TimeAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1573:2: ( ( rule__TimeType__TimeAssignment_1 ) )
                    // InternalAdeptness.g:1574:3: ( rule__TimeType__TimeAssignment_1 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_1()); 
                    // InternalAdeptness.g:1575:3: ( rule__TimeType__TimeAssignment_1 )
                    // InternalAdeptness.g:1575:4: rule__TimeType__TimeAssignment_1
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
                    // InternalAdeptness.g:1579:2: ( ( rule__TimeType__TimeAssignment_2 ) )
                    {
                    // InternalAdeptness.g:1579:2: ( ( rule__TimeType__TimeAssignment_2 ) )
                    // InternalAdeptness.g:1580:3: ( rule__TimeType__TimeAssignment_2 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_2()); 
                    // InternalAdeptness.g:1581:3: ( rule__TimeType__TimeAssignment_2 )
                    // InternalAdeptness.g:1581:4: rule__TimeType__TimeAssignment_2
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
                    // InternalAdeptness.g:1585:2: ( ( rule__TimeType__TimeAssignment_3 ) )
                    {
                    // InternalAdeptness.g:1585:2: ( ( rule__TimeType__TimeAssignment_3 ) )
                    // InternalAdeptness.g:1586:3: ( rule__TimeType__TimeAssignment_3 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_3()); 
                    // InternalAdeptness.g:1587:3: ( rule__TimeType__TimeAssignment_3 )
                    // InternalAdeptness.g:1587:4: rule__TimeType__TimeAssignment_3
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
    // InternalAdeptness.g:1595:1: rule__AbstractElement2__Alternatives_1 : ( ( ( rule__AbstractElement2__NameAssignment_1_0 ) ) | ( ( rule__AbstractElement2__ValueAssignment_1_1 ) ) );
    public final void rule__AbstractElement2__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1599:1: ( ( ( rule__AbstractElement2__NameAssignment_1_0 ) ) | ( ( rule__AbstractElement2__ValueAssignment_1_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_INT||LA15_0==24) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalAdeptness.g:1600:2: ( ( rule__AbstractElement2__NameAssignment_1_0 ) )
                    {
                    // InternalAdeptness.g:1600:2: ( ( rule__AbstractElement2__NameAssignment_1_0 ) )
                    // InternalAdeptness.g:1601:3: ( rule__AbstractElement2__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getAbstractElement2Access().getNameAssignment_1_0()); 
                    // InternalAdeptness.g:1602:3: ( rule__AbstractElement2__NameAssignment_1_0 )
                    // InternalAdeptness.g:1602:4: rule__AbstractElement2__NameAssignment_1_0
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
                    // InternalAdeptness.g:1606:2: ( ( rule__AbstractElement2__ValueAssignment_1_1 ) )
                    {
                    // InternalAdeptness.g:1606:2: ( ( rule__AbstractElement2__ValueAssignment_1_1 ) )
                    // InternalAdeptness.g:1607:3: ( rule__AbstractElement2__ValueAssignment_1_1 )
                    {
                     before(grammarAccess.getAbstractElement2Access().getValueAssignment_1_1()); 
                    // InternalAdeptness.g:1608:3: ( rule__AbstractElement2__ValueAssignment_1_1 )
                    // InternalAdeptness.g:1608:4: rule__AbstractElement2__ValueAssignment_1_1
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
    // InternalAdeptness.g:1616:1: rule__Operators__Alternatives : ( ( ( rule__Operators__OperatorAssignment_0 ) ) | ( ( rule__Operators__ComparationAssignment_1 ) ) | ( ( rule__Operators__LogicOperatorAssignment_2 ) ) | ( ( rule__Operators__BackParenthesesAssignment_3 ) ) );
    public final void rule__Operators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1620:1: ( ( ( rule__Operators__OperatorAssignment_0 ) ) | ( ( rule__Operators__ComparationAssignment_1 ) ) | ( ( rule__Operators__LogicOperatorAssignment_2 ) ) | ( ( rule__Operators__BackParenthesesAssignment_3 ) ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 23:
            case 24:
            case 25:
            case 26:
                {
                alt16=1;
                }
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                {
                alt16=2;
                }
                break;
            case 21:
            case 22:
                {
                alt16=3;
                }
                break;
            case 12:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalAdeptness.g:1621:2: ( ( rule__Operators__OperatorAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1621:2: ( ( rule__Operators__OperatorAssignment_0 ) )
                    // InternalAdeptness.g:1622:3: ( rule__Operators__OperatorAssignment_0 )
                    {
                     before(grammarAccess.getOperatorsAccess().getOperatorAssignment_0()); 
                    // InternalAdeptness.g:1623:3: ( rule__Operators__OperatorAssignment_0 )
                    // InternalAdeptness.g:1623:4: rule__Operators__OperatorAssignment_0
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
                    // InternalAdeptness.g:1627:2: ( ( rule__Operators__ComparationAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1627:2: ( ( rule__Operators__ComparationAssignment_1 ) )
                    // InternalAdeptness.g:1628:3: ( rule__Operators__ComparationAssignment_1 )
                    {
                     before(grammarAccess.getOperatorsAccess().getComparationAssignment_1()); 
                    // InternalAdeptness.g:1629:3: ( rule__Operators__ComparationAssignment_1 )
                    // InternalAdeptness.g:1629:4: rule__Operators__ComparationAssignment_1
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
                    // InternalAdeptness.g:1633:2: ( ( rule__Operators__LogicOperatorAssignment_2 ) )
                    {
                    // InternalAdeptness.g:1633:2: ( ( rule__Operators__LogicOperatorAssignment_2 ) )
                    // InternalAdeptness.g:1634:3: ( rule__Operators__LogicOperatorAssignment_2 )
                    {
                     before(grammarAccess.getOperatorsAccess().getLogicOperatorAssignment_2()); 
                    // InternalAdeptness.g:1635:3: ( rule__Operators__LogicOperatorAssignment_2 )
                    // InternalAdeptness.g:1635:4: rule__Operators__LogicOperatorAssignment_2
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
                    // InternalAdeptness.g:1639:2: ( ( rule__Operators__BackParenthesesAssignment_3 ) )
                    {
                    // InternalAdeptness.g:1639:2: ( ( rule__Operators__BackParenthesesAssignment_3 ) )
                    // InternalAdeptness.g:1640:3: ( rule__Operators__BackParenthesesAssignment_3 )
                    {
                     before(grammarAccess.getOperatorsAccess().getBackParenthesesAssignment_3()); 
                    // InternalAdeptness.g:1641:3: ( rule__Operators__BackParenthesesAssignment_3 )
                    // InternalAdeptness.g:1641:4: rule__Operators__BackParenthesesAssignment_3
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
    // InternalAdeptness.g:1649:1: rule__CompOp__OpAlternatives_0 : ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '<' ) | ( '>' ) );
    public final void rule__CompOp__OpAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1653:1: ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '<' ) | ( '>' ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt17=1;
                }
                break;
            case 16:
                {
                alt17=2;
                }
                break;
            case 17:
                {
                alt17=3;
                }
                break;
            case 18:
                {
                alt17=4;
                }
                break;
            case 19:
                {
                alt17=5;
                }
                break;
            case 20:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalAdeptness.g:1654:2: ( '==' )
                    {
                    // InternalAdeptness.g:1654:2: ( '==' )
                    // InternalAdeptness.g:1655:3: '=='
                    {
                     before(grammarAccess.getCompOpAccess().getOpEqualsSignEqualsSignKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getCompOpAccess().getOpEqualsSignEqualsSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1660:2: ( '!=' )
                    {
                    // InternalAdeptness.g:1660:2: ( '!=' )
                    // InternalAdeptness.g:1661:3: '!='
                    {
                     before(grammarAccess.getCompOpAccess().getOpExclamationMarkEqualsSignKeyword_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCompOpAccess().getOpExclamationMarkEqualsSignKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1666:2: ( '>=' )
                    {
                    // InternalAdeptness.g:1666:2: ( '>=' )
                    // InternalAdeptness.g:1667:3: '>='
                    {
                     before(grammarAccess.getCompOpAccess().getOpGreaterThanSignEqualsSignKeyword_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getCompOpAccess().getOpGreaterThanSignEqualsSignKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:1672:2: ( '<=' )
                    {
                    // InternalAdeptness.g:1672:2: ( '<=' )
                    // InternalAdeptness.g:1673:3: '<='
                    {
                     before(grammarAccess.getCompOpAccess().getOpLessThanSignEqualsSignKeyword_0_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getCompOpAccess().getOpLessThanSignEqualsSignKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAdeptness.g:1678:2: ( '<' )
                    {
                    // InternalAdeptness.g:1678:2: ( '<' )
                    // InternalAdeptness.g:1679:3: '<'
                    {
                     before(grammarAccess.getCompOpAccess().getOpLessThanSignKeyword_0_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getCompOpAccess().getOpLessThanSignKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAdeptness.g:1684:2: ( '>' )
                    {
                    // InternalAdeptness.g:1684:2: ( '>' )
                    // InternalAdeptness.g:1685:3: '>'
                    {
                     before(grammarAccess.getCompOpAccess().getOpGreaterThanSignKeyword_0_5()); 
                    match(input,20,FOLLOW_2); 
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
    // InternalAdeptness.g:1694:1: rule__LogicOp__OpAlternatives_0 : ( ( '&&' ) | ( '||' ) );
    public final void rule__LogicOp__OpAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1698:1: ( ( '&&' ) | ( '||' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            else if ( (LA18_0==22) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalAdeptness.g:1699:2: ( '&&' )
                    {
                    // InternalAdeptness.g:1699:2: ( '&&' )
                    // InternalAdeptness.g:1700:3: '&&'
                    {
                     before(grammarAccess.getLogicOpAccess().getOpAmpersandAmpersandKeyword_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getLogicOpAccess().getOpAmpersandAmpersandKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1705:2: ( '||' )
                    {
                    // InternalAdeptness.g:1705:2: ( '||' )
                    // InternalAdeptness.g:1706:3: '||'
                    {
                     before(grammarAccess.getLogicOpAccess().getOpVerticalLineVerticalLineKeyword_0_1()); 
                    match(input,22,FOLLOW_2); 
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
    // InternalAdeptness.g:1715:1: rule__Op__OpAlternatives_0 : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) );
    public final void rule__Op__OpAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1719:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt19=1;
                }
                break;
            case 24:
                {
                alt19=2;
                }
                break;
            case 25:
                {
                alt19=3;
                }
                break;
            case 26:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalAdeptness.g:1720:2: ( '+' )
                    {
                    // InternalAdeptness.g:1720:2: ( '+' )
                    // InternalAdeptness.g:1721:3: '+'
                    {
                     before(grammarAccess.getOpAccess().getOpPlusSignKeyword_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getOpPlusSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1726:2: ( '-' )
                    {
                    // InternalAdeptness.g:1726:2: ( '-' )
                    // InternalAdeptness.g:1727:3: '-'
                    {
                     before(grammarAccess.getOpAccess().getOpHyphenMinusKeyword_0_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getOpHyphenMinusKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1732:2: ( '*' )
                    {
                    // InternalAdeptness.g:1732:2: ( '*' )
                    // InternalAdeptness.g:1733:3: '*'
                    {
                     before(grammarAccess.getOpAccess().getOpAsteriskKeyword_0_2()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getOpAsteriskKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:1738:2: ( '/' )
                    {
                    // InternalAdeptness.g:1738:2: ( '/' )
                    // InternalAdeptness.g:1739:3: '/'
                    {
                     before(grammarAccess.getOpAccess().getOpSolidusKeyword_0_3()); 
                    match(input,26,FOLLOW_2); 
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
    // InternalAdeptness.g:1748:1: rule__Imports__Group__0 : rule__Imports__Group__0__Impl rule__Imports__Group__1 ;
    public final void rule__Imports__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1752:1: ( rule__Imports__Group__0__Impl rule__Imports__Group__1 )
            // InternalAdeptness.g:1753:2: rule__Imports__Group__0__Impl rule__Imports__Group__1
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
    // InternalAdeptness.g:1760:1: rule__Imports__Group__0__Impl : ( 'import' ) ;
    public final void rule__Imports__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1764:1: ( ( 'import' ) )
            // InternalAdeptness.g:1765:1: ( 'import' )
            {
            // InternalAdeptness.g:1765:1: ( 'import' )
            // InternalAdeptness.g:1766:2: 'import'
            {
             before(grammarAccess.getImportsAccess().getImportKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAdeptness.g:1775:1: rule__Imports__Group__1 : rule__Imports__Group__1__Impl ;
    public final void rule__Imports__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1779:1: ( rule__Imports__Group__1__Impl )
            // InternalAdeptness.g:1780:2: rule__Imports__Group__1__Impl
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
    // InternalAdeptness.g:1786:1: rule__Imports__Group__1__Impl : ( ( rule__Imports__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Imports__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1790:1: ( ( ( rule__Imports__ImportedNamespaceAssignment_1 ) ) )
            // InternalAdeptness.g:1791:1: ( ( rule__Imports__ImportedNamespaceAssignment_1 ) )
            {
            // InternalAdeptness.g:1791:1: ( ( rule__Imports__ImportedNamespaceAssignment_1 ) )
            // InternalAdeptness.g:1792:2: ( rule__Imports__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportsAccess().getImportedNamespaceAssignment_1()); 
            // InternalAdeptness.g:1793:2: ( rule__Imports__ImportedNamespaceAssignment_1 )
            // InternalAdeptness.g:1793:3: rule__Imports__ImportedNamespaceAssignment_1
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
    // InternalAdeptness.g:1802:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1806:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalAdeptness.g:1807:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalAdeptness.g:1814:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1818:1: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:1819:1: ( ruleQualifiedName )
            {
            // InternalAdeptness.g:1819:1: ( ruleQualifiedName )
            // InternalAdeptness.g:1820:2: ruleQualifiedName
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
    // InternalAdeptness.g:1829:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1833:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalAdeptness.g:1834:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalAdeptness.g:1840:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1844:1: ( ( ( '.*' )? ) )
            // InternalAdeptness.g:1845:1: ( ( '.*' )? )
            {
            // InternalAdeptness.g:1845:1: ( ( '.*' )? )
            // InternalAdeptness.g:1846:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalAdeptness.g:1847:2: ( '.*' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAdeptness.g:1847:3: '.*'
                    {
                    match(input,28,FOLLOW_2); 

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
    // InternalAdeptness.g:1856:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1860:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAdeptness.g:1861:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalAdeptness.g:1868:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1872:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:1873:1: ( RULE_ID )
            {
            // InternalAdeptness.g:1873:1: ( RULE_ID )
            // InternalAdeptness.g:1874:2: RULE_ID
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
    // InternalAdeptness.g:1883:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1887:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAdeptness.g:1888:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAdeptness.g:1894:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1898:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAdeptness.g:1899:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAdeptness.g:1899:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAdeptness.g:1900:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAdeptness.g:1901:2: ( rule__QualifiedName__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAdeptness.g:1901:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalAdeptness.g:1910:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1914:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAdeptness.g:1915:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalAdeptness.g:1922:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1926:1: ( ( '.' ) )
            // InternalAdeptness.g:1927:1: ( '.' )
            {
            // InternalAdeptness.g:1927:1: ( '.' )
            // InternalAdeptness.g:1928:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalAdeptness.g:1937:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1941:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAdeptness.g:1942:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAdeptness.g:1948:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1952:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:1953:1: ( RULE_ID )
            {
            // InternalAdeptness.g:1953:1: ( RULE_ID )
            // InternalAdeptness.g:1954:2: RULE_ID
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


    // $ANTLR start "rule__MonitoringFile__Group__0"
    // InternalAdeptness.g:1964:1: rule__MonitoringFile__Group__0 : rule__MonitoringFile__Group__0__Impl rule__MonitoringFile__Group__1 ;
    public final void rule__MonitoringFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1968:1: ( rule__MonitoringFile__Group__0__Impl rule__MonitoringFile__Group__1 )
            // InternalAdeptness.g:1969:2: rule__MonitoringFile__Group__0__Impl rule__MonitoringFile__Group__1
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
    // InternalAdeptness.g:1976:1: rule__MonitoringFile__Group__0__Impl : ( 'MONITORINGPLAN' ) ;
    public final void rule__MonitoringFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1980:1: ( ( 'MONITORINGPLAN' ) )
            // InternalAdeptness.g:1981:1: ( 'MONITORINGPLAN' )
            {
            // InternalAdeptness.g:1981:1: ( 'MONITORINGPLAN' )
            // InternalAdeptness.g:1982:2: 'MONITORINGPLAN'
            {
             before(grammarAccess.getMonitoringFileAccess().getMONITORINGPLANKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAdeptness.g:1991:1: rule__MonitoringFile__Group__1 : rule__MonitoringFile__Group__1__Impl rule__MonitoringFile__Group__2 ;
    public final void rule__MonitoringFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1995:1: ( rule__MonitoringFile__Group__1__Impl rule__MonitoringFile__Group__2 )
            // InternalAdeptness.g:1996:2: rule__MonitoringFile__Group__1__Impl rule__MonitoringFile__Group__2
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
    // InternalAdeptness.g:2003:1: rule__MonitoringFile__Group__1__Impl : ( ( rule__MonitoringFile__NameAssignment_1 ) ) ;
    public final void rule__MonitoringFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2007:1: ( ( ( rule__MonitoringFile__NameAssignment_1 ) ) )
            // InternalAdeptness.g:2008:1: ( ( rule__MonitoringFile__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:2008:1: ( ( rule__MonitoringFile__NameAssignment_1 ) )
            // InternalAdeptness.g:2009:2: ( rule__MonitoringFile__NameAssignment_1 )
            {
             before(grammarAccess.getMonitoringFileAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:2010:2: ( rule__MonitoringFile__NameAssignment_1 )
            // InternalAdeptness.g:2010:3: rule__MonitoringFile__NameAssignment_1
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
    // InternalAdeptness.g:2018:1: rule__MonitoringFile__Group__2 : rule__MonitoringFile__Group__2__Impl rule__MonitoringFile__Group__3 ;
    public final void rule__MonitoringFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2022:1: ( rule__MonitoringFile__Group__2__Impl rule__MonitoringFile__Group__3 )
            // InternalAdeptness.g:2023:2: rule__MonitoringFile__Group__2__Impl rule__MonitoringFile__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalAdeptness.g:2030:1: rule__MonitoringFile__Group__2__Impl : ( ':' ) ;
    public final void rule__MonitoringFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2034:1: ( ( ':' ) )
            // InternalAdeptness.g:2035:1: ( ':' )
            {
            // InternalAdeptness.g:2035:1: ( ':' )
            // InternalAdeptness.g:2036:2: ':'
            {
             before(grammarAccess.getMonitoringFileAccess().getColonKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAdeptness.g:2045:1: rule__MonitoringFile__Group__3 : rule__MonitoringFile__Group__3__Impl rule__MonitoringFile__Group__4 ;
    public final void rule__MonitoringFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2049:1: ( rule__MonitoringFile__Group__3__Impl rule__MonitoringFile__Group__4 )
            // InternalAdeptness.g:2050:2: rule__MonitoringFile__Group__3__Impl rule__MonitoringFile__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalAdeptness.g:2057:1: rule__MonitoringFile__Group__3__Impl : ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) ) ;
    public final void rule__MonitoringFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2061:1: ( ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) ) )
            // InternalAdeptness.g:2062:1: ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) )
            {
            // InternalAdeptness.g:2062:1: ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) )
            // InternalAdeptness.g:2063:2: ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* )
            {
            // InternalAdeptness.g:2063:2: ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) )
            // InternalAdeptness.g:2064:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )
            {
             before(grammarAccess.getMonitoringFileAccess().getMonitoringPlanAssignment_3()); 
            // InternalAdeptness.g:2065:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )
            // InternalAdeptness.g:2065:4: rule__MonitoringFile__MonitoringPlanAssignment_3
            {
            pushFollow(FOLLOW_12);
            rule__MonitoringFile__MonitoringPlanAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMonitoringFileAccess().getMonitoringPlanAssignment_3()); 

            }

            // InternalAdeptness.g:2068:2: ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* )
            // InternalAdeptness.g:2069:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )*
            {
             before(grammarAccess.getMonitoringFileAccess().getMonitoringPlanAssignment_3()); 
            // InternalAdeptness.g:2070:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==33) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAdeptness.g:2070:4: rule__MonitoringFile__MonitoringPlanAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__MonitoringFile__MonitoringPlanAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalAdeptness.g:2079:1: rule__MonitoringFile__Group__4 : rule__MonitoringFile__Group__4__Impl ;
    public final void rule__MonitoringFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2083:1: ( rule__MonitoringFile__Group__4__Impl )
            // InternalAdeptness.g:2084:2: rule__MonitoringFile__Group__4__Impl
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
    // InternalAdeptness.g:2090:1: rule__MonitoringFile__Group__4__Impl : ( 'ENDMONITORINGPLAN' ) ;
    public final void rule__MonitoringFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2094:1: ( ( 'ENDMONITORINGPLAN' ) )
            // InternalAdeptness.g:2095:1: ( 'ENDMONITORINGPLAN' )
            {
            // InternalAdeptness.g:2095:1: ( 'ENDMONITORINGPLAN' )
            // InternalAdeptness.g:2096:2: 'ENDMONITORINGPLAN'
            {
             before(grammarAccess.getMonitoringFileAccess().getENDMONITORINGPLANKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalAdeptness.g:2106:1: rule__MonitoringVariable__Group__0 : rule__MonitoringVariable__Group__0__Impl rule__MonitoringVariable__Group__1 ;
    public final void rule__MonitoringVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2110:1: ( rule__MonitoringVariable__Group__0__Impl rule__MonitoringVariable__Group__1 )
            // InternalAdeptness.g:2111:2: rule__MonitoringVariable__Group__0__Impl rule__MonitoringVariable__Group__1
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
    // InternalAdeptness.g:2118:1: rule__MonitoringVariable__Group__0__Impl : ( 'MONITOR' ) ;
    public final void rule__MonitoringVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2122:1: ( ( 'MONITOR' ) )
            // InternalAdeptness.g:2123:1: ( 'MONITOR' )
            {
            // InternalAdeptness.g:2123:1: ( 'MONITOR' )
            // InternalAdeptness.g:2124:2: 'MONITOR'
            {
             before(grammarAccess.getMonitoringVariableAccess().getMONITORKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalAdeptness.g:2133:1: rule__MonitoringVariable__Group__1 : rule__MonitoringVariable__Group__1__Impl rule__MonitoringVariable__Group__2 ;
    public final void rule__MonitoringVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2137:1: ( rule__MonitoringVariable__Group__1__Impl rule__MonitoringVariable__Group__2 )
            // InternalAdeptness.g:2138:2: rule__MonitoringVariable__Group__1__Impl rule__MonitoringVariable__Group__2
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
    // InternalAdeptness.g:2145:1: rule__MonitoringVariable__Group__1__Impl : ( ( rule__MonitoringVariable__NameAssignment_1 ) ) ;
    public final void rule__MonitoringVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2149:1: ( ( ( rule__MonitoringVariable__NameAssignment_1 ) ) )
            // InternalAdeptness.g:2150:1: ( ( rule__MonitoringVariable__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:2150:1: ( ( rule__MonitoringVariable__NameAssignment_1 ) )
            // InternalAdeptness.g:2151:2: ( rule__MonitoringVariable__NameAssignment_1 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:2152:2: ( rule__MonitoringVariable__NameAssignment_1 )
            // InternalAdeptness.g:2152:3: rule__MonitoringVariable__NameAssignment_1
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
    // InternalAdeptness.g:2160:1: rule__MonitoringVariable__Group__2 : rule__MonitoringVariable__Group__2__Impl rule__MonitoringVariable__Group__3 ;
    public final void rule__MonitoringVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2164:1: ( rule__MonitoringVariable__Group__2__Impl rule__MonitoringVariable__Group__3 )
            // InternalAdeptness.g:2165:2: rule__MonitoringVariable__Group__2__Impl rule__MonitoringVariable__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdeptness.g:2172:1: rule__MonitoringVariable__Group__2__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2176:1: ( ( ':' ) )
            // InternalAdeptness.g:2177:1: ( ':' )
            {
            // InternalAdeptness.g:2177:1: ( ':' )
            // InternalAdeptness.g:2178:2: ':'
            {
             before(grammarAccess.getMonitoringVariableAccess().getColonKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAdeptness.g:2187:1: rule__MonitoringVariable__Group__3 : rule__MonitoringVariable__Group__3__Impl rule__MonitoringVariable__Group__4 ;
    public final void rule__MonitoringVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2191:1: ( rule__MonitoringVariable__Group__3__Impl rule__MonitoringVariable__Group__4 )
            // InternalAdeptness.g:2192:2: rule__MonitoringVariable__Group__3__Impl rule__MonitoringVariable__Group__4
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
    // InternalAdeptness.g:2199:1: rule__MonitoringVariable__Group__3__Impl : ( 'type' ) ;
    public final void rule__MonitoringVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2203:1: ( ( 'type' ) )
            // InternalAdeptness.g:2204:1: ( 'type' )
            {
            // InternalAdeptness.g:2204:1: ( 'type' )
            // InternalAdeptness.g:2205:2: 'type'
            {
             before(grammarAccess.getMonitoringVariableAccess().getTypeKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdeptness.g:2214:1: rule__MonitoringVariable__Group__4 : rule__MonitoringVariable__Group__4__Impl rule__MonitoringVariable__Group__5 ;
    public final void rule__MonitoringVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2218:1: ( rule__MonitoringVariable__Group__4__Impl rule__MonitoringVariable__Group__5 )
            // InternalAdeptness.g:2219:2: rule__MonitoringVariable__Group__4__Impl rule__MonitoringVariable__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdeptness.g:2226:1: rule__MonitoringVariable__Group__4__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2230:1: ( ( ':' ) )
            // InternalAdeptness.g:2231:1: ( ':' )
            {
            // InternalAdeptness.g:2231:1: ( ':' )
            // InternalAdeptness.g:2232:2: ':'
            {
             before(grammarAccess.getMonitoringVariableAccess().getColonKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAdeptness.g:2241:1: rule__MonitoringVariable__Group__5 : rule__MonitoringVariable__Group__5__Impl rule__MonitoringVariable__Group__6 ;
    public final void rule__MonitoringVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2245:1: ( rule__MonitoringVariable__Group__5__Impl rule__MonitoringVariable__Group__6 )
            // InternalAdeptness.g:2246:2: rule__MonitoringVariable__Group__5__Impl rule__MonitoringVariable__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalAdeptness.g:2253:1: rule__MonitoringVariable__Group__5__Impl : ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) ) ;
    public final void rule__MonitoringVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2257:1: ( ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) ) )
            // InternalAdeptness.g:2258:1: ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) )
            {
            // InternalAdeptness.g:2258:1: ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) )
            // InternalAdeptness.g:2259:2: ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getMonitoringVariableDatatypeAssignment_5()); 
            // InternalAdeptness.g:2260:2: ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 )
            // InternalAdeptness.g:2260:3: rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5
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
    // InternalAdeptness.g:2268:1: rule__MonitoringVariable__Group__6 : rule__MonitoringVariable__Group__6__Impl rule__MonitoringVariable__Group__7 ;
    public final void rule__MonitoringVariable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2272:1: ( rule__MonitoringVariable__Group__6__Impl rule__MonitoringVariable__Group__7 )
            // InternalAdeptness.g:2273:2: rule__MonitoringVariable__Group__6__Impl rule__MonitoringVariable__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalAdeptness.g:2280:1: rule__MonitoringVariable__Group__6__Impl : ( ( rule__MonitoringVariable__Group_6__0 )? ) ;
    public final void rule__MonitoringVariable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2284:1: ( ( ( rule__MonitoringVariable__Group_6__0 )? ) )
            // InternalAdeptness.g:2285:1: ( ( rule__MonitoringVariable__Group_6__0 )? )
            {
            // InternalAdeptness.g:2285:1: ( ( rule__MonitoringVariable__Group_6__0 )? )
            // InternalAdeptness.g:2286:2: ( rule__MonitoringVariable__Group_6__0 )?
            {
             before(grammarAccess.getMonitoringVariableAccess().getGroup_6()); 
            // InternalAdeptness.g:2287:2: ( rule__MonitoringVariable__Group_6__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAdeptness.g:2287:3: rule__MonitoringVariable__Group_6__0
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
    // InternalAdeptness.g:2295:1: rule__MonitoringVariable__Group__7 : rule__MonitoringVariable__Group__7__Impl ;
    public final void rule__MonitoringVariable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2299:1: ( rule__MonitoringVariable__Group__7__Impl )
            // InternalAdeptness.g:2300:2: rule__MonitoringVariable__Group__7__Impl
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
    // InternalAdeptness.g:2306:1: rule__MonitoringVariable__Group__7__Impl : ( 'ENDMONITOR' ) ;
    public final void rule__MonitoringVariable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2310:1: ( ( 'ENDMONITOR' ) )
            // InternalAdeptness.g:2311:1: ( 'ENDMONITOR' )
            {
            // InternalAdeptness.g:2311:1: ( 'ENDMONITOR' )
            // InternalAdeptness.g:2312:2: 'ENDMONITOR'
            {
             before(grammarAccess.getMonitoringVariableAccess().getENDMONITORKeyword_7()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdeptness.g:2322:1: rule__MonitoringVariable__Group_6__0 : rule__MonitoringVariable__Group_6__0__Impl rule__MonitoringVariable__Group_6__1 ;
    public final void rule__MonitoringVariable__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2326:1: ( rule__MonitoringVariable__Group_6__0__Impl rule__MonitoringVariable__Group_6__1 )
            // InternalAdeptness.g:2327:2: rule__MonitoringVariable__Group_6__0__Impl rule__MonitoringVariable__Group_6__1
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
    // InternalAdeptness.g:2334:1: rule__MonitoringVariable__Group_6__0__Impl : ( 'max' ) ;
    public final void rule__MonitoringVariable__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2338:1: ( ( 'max' ) )
            // InternalAdeptness.g:2339:1: ( 'max' )
            {
            // InternalAdeptness.g:2339:1: ( 'max' )
            // InternalAdeptness.g:2340:2: 'max'
            {
             before(grammarAccess.getMonitoringVariableAccess().getMaxKeyword_6_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdeptness.g:2349:1: rule__MonitoringVariable__Group_6__1 : rule__MonitoringVariable__Group_6__1__Impl rule__MonitoringVariable__Group_6__2 ;
    public final void rule__MonitoringVariable__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2353:1: ( rule__MonitoringVariable__Group_6__1__Impl rule__MonitoringVariable__Group_6__2 )
            // InternalAdeptness.g:2354:2: rule__MonitoringVariable__Group_6__1__Impl rule__MonitoringVariable__Group_6__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:2361:1: rule__MonitoringVariable__Group_6__1__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2365:1: ( ( ':' ) )
            // InternalAdeptness.g:2366:1: ( ':' )
            {
            // InternalAdeptness.g:2366:1: ( ':' )
            // InternalAdeptness.g:2367:2: ':'
            {
             before(grammarAccess.getMonitoringVariableAccess().getColonKeyword_6_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAdeptness.g:2376:1: rule__MonitoringVariable__Group_6__2 : rule__MonitoringVariable__Group_6__2__Impl rule__MonitoringVariable__Group_6__3 ;
    public final void rule__MonitoringVariable__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2380:1: ( rule__MonitoringVariable__Group_6__2__Impl rule__MonitoringVariable__Group_6__3 )
            // InternalAdeptness.g:2381:2: rule__MonitoringVariable__Group_6__2__Impl rule__MonitoringVariable__Group_6__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalAdeptness.g:2388:1: rule__MonitoringVariable__Group_6__2__Impl : ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) ) ;
    public final void rule__MonitoringVariable__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2392:1: ( ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) ) )
            // InternalAdeptness.g:2393:1: ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) )
            {
            // InternalAdeptness.g:2393:1: ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) )
            // InternalAdeptness.g:2394:2: ( rule__MonitoringVariable__MaxAssignment_6_2 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getMaxAssignment_6_2()); 
            // InternalAdeptness.g:2395:2: ( rule__MonitoringVariable__MaxAssignment_6_2 )
            // InternalAdeptness.g:2395:3: rule__MonitoringVariable__MaxAssignment_6_2
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
    // InternalAdeptness.g:2403:1: rule__MonitoringVariable__Group_6__3 : rule__MonitoringVariable__Group_6__3__Impl rule__MonitoringVariable__Group_6__4 ;
    public final void rule__MonitoringVariable__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2407:1: ( rule__MonitoringVariable__Group_6__3__Impl rule__MonitoringVariable__Group_6__4 )
            // InternalAdeptness.g:2408:2: rule__MonitoringVariable__Group_6__3__Impl rule__MonitoringVariable__Group_6__4
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
    // InternalAdeptness.g:2415:1: rule__MonitoringVariable__Group_6__3__Impl : ( 'min' ) ;
    public final void rule__MonitoringVariable__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2419:1: ( ( 'min' ) )
            // InternalAdeptness.g:2420:1: ( 'min' )
            {
            // InternalAdeptness.g:2420:1: ( 'min' )
            // InternalAdeptness.g:2421:2: 'min'
            {
             before(grammarAccess.getMonitoringVariableAccess().getMinKeyword_6_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdeptness.g:2430:1: rule__MonitoringVariable__Group_6__4 : rule__MonitoringVariable__Group_6__4__Impl rule__MonitoringVariable__Group_6__5 ;
    public final void rule__MonitoringVariable__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2434:1: ( rule__MonitoringVariable__Group_6__4__Impl rule__MonitoringVariable__Group_6__5 )
            // InternalAdeptness.g:2435:2: rule__MonitoringVariable__Group_6__4__Impl rule__MonitoringVariable__Group_6__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:2442:1: rule__MonitoringVariable__Group_6__4__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2446:1: ( ( ':' ) )
            // InternalAdeptness.g:2447:1: ( ':' )
            {
            // InternalAdeptness.g:2447:1: ( ':' )
            // InternalAdeptness.g:2448:2: ':'
            {
             before(grammarAccess.getMonitoringVariableAccess().getColonKeyword_6_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAdeptness.g:2457:1: rule__MonitoringVariable__Group_6__5 : rule__MonitoringVariable__Group_6__5__Impl ;
    public final void rule__MonitoringVariable__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2461:1: ( rule__MonitoringVariable__Group_6__5__Impl )
            // InternalAdeptness.g:2462:2: rule__MonitoringVariable__Group_6__5__Impl
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
    // InternalAdeptness.g:2468:1: rule__MonitoringVariable__Group_6__5__Impl : ( ( rule__MonitoringVariable__MinAssignment_6_5 ) ) ;
    public final void rule__MonitoringVariable__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2472:1: ( ( ( rule__MonitoringVariable__MinAssignment_6_5 ) ) )
            // InternalAdeptness.g:2473:1: ( ( rule__MonitoringVariable__MinAssignment_6_5 ) )
            {
            // InternalAdeptness.g:2473:1: ( ( rule__MonitoringVariable__MinAssignment_6_5 ) )
            // InternalAdeptness.g:2474:2: ( rule__MonitoringVariable__MinAssignment_6_5 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getMinAssignment_6_5()); 
            // InternalAdeptness.g:2475:2: ( rule__MonitoringVariable__MinAssignment_6_5 )
            // InternalAdeptness.g:2475:3: rule__MonitoringVariable__MinAssignment_6_5
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
    // InternalAdeptness.g:2484:1: rule__Signal__Group__0 : rule__Signal__Group__0__Impl rule__Signal__Group__1 ;
    public final void rule__Signal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2488:1: ( rule__Signal__Group__0__Impl rule__Signal__Group__1 )
            // InternalAdeptness.g:2489:2: rule__Signal__Group__0__Impl rule__Signal__Group__1
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
    // InternalAdeptness.g:2496:1: rule__Signal__Group__0__Impl : ( 'CPS' ) ;
    public final void rule__Signal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2500:1: ( ( 'CPS' ) )
            // InternalAdeptness.g:2501:1: ( 'CPS' )
            {
            // InternalAdeptness.g:2501:1: ( 'CPS' )
            // InternalAdeptness.g:2502:2: 'CPS'
            {
             before(grammarAccess.getSignalAccess().getCPSKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAdeptness.g:2511:1: rule__Signal__Group__1 : rule__Signal__Group__1__Impl rule__Signal__Group__2 ;
    public final void rule__Signal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2515:1: ( rule__Signal__Group__1__Impl rule__Signal__Group__2 )
            // InternalAdeptness.g:2516:2: rule__Signal__Group__1__Impl rule__Signal__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalAdeptness.g:2523:1: rule__Signal__Group__1__Impl : ( ( rule__Signal__NameAssignment_1 ) ) ;
    public final void rule__Signal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2527:1: ( ( ( rule__Signal__NameAssignment_1 ) ) )
            // InternalAdeptness.g:2528:1: ( ( rule__Signal__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:2528:1: ( ( rule__Signal__NameAssignment_1 ) )
            // InternalAdeptness.g:2529:2: ( rule__Signal__NameAssignment_1 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:2530:2: ( rule__Signal__NameAssignment_1 )
            // InternalAdeptness.g:2530:3: rule__Signal__NameAssignment_1
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
    // InternalAdeptness.g:2538:1: rule__Signal__Group__2 : rule__Signal__Group__2__Impl rule__Signal__Group__3 ;
    public final void rule__Signal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2542:1: ( rule__Signal__Group__2__Impl rule__Signal__Group__3 )
            // InternalAdeptness.g:2543:2: rule__Signal__Group__2__Impl rule__Signal__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalAdeptness.g:2550:1: rule__Signal__Group__2__Impl : ( ( rule__Signal__Group_2__0 )? ) ;
    public final void rule__Signal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2554:1: ( ( ( rule__Signal__Group_2__0 )? ) )
            // InternalAdeptness.g:2555:1: ( ( rule__Signal__Group_2__0 )? )
            {
            // InternalAdeptness.g:2555:1: ( ( rule__Signal__Group_2__0 )? )
            // InternalAdeptness.g:2556:2: ( rule__Signal__Group_2__0 )?
            {
             before(grammarAccess.getSignalAccess().getGroup_2()); 
            // InternalAdeptness.g:2557:2: ( rule__Signal__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAdeptness.g:2557:3: rule__Signal__Group_2__0
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
    // InternalAdeptness.g:2565:1: rule__Signal__Group__3 : rule__Signal__Group__3__Impl rule__Signal__Group__4 ;
    public final void rule__Signal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2569:1: ( rule__Signal__Group__3__Impl rule__Signal__Group__4 )
            // InternalAdeptness.g:2570:2: rule__Signal__Group__3__Impl rule__Signal__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalAdeptness.g:2577:1: rule__Signal__Group__3__Impl : ( ':' ) ;
    public final void rule__Signal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2581:1: ( ( ':' ) )
            // InternalAdeptness.g:2582:1: ( ':' )
            {
            // InternalAdeptness.g:2582:1: ( ':' )
            // InternalAdeptness.g:2583:2: ':'
            {
             before(grammarAccess.getSignalAccess().getColonKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAdeptness.g:2592:1: rule__Signal__Group__4 : rule__Signal__Group__4__Impl rule__Signal__Group__5 ;
    public final void rule__Signal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2596:1: ( rule__Signal__Group__4__Impl rule__Signal__Group__5 )
            // InternalAdeptness.g:2597:2: rule__Signal__Group__4__Impl rule__Signal__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalAdeptness.g:2604:1: rule__Signal__Group__4__Impl : ( ( rule__Signal__Group_4__0 )? ) ;
    public final void rule__Signal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2608:1: ( ( ( rule__Signal__Group_4__0 )? ) )
            // InternalAdeptness.g:2609:1: ( ( rule__Signal__Group_4__0 )? )
            {
            // InternalAdeptness.g:2609:1: ( ( rule__Signal__Group_4__0 )? )
            // InternalAdeptness.g:2610:2: ( rule__Signal__Group_4__0 )?
            {
             before(grammarAccess.getSignalAccess().getGroup_4()); 
            // InternalAdeptness.g:2611:2: ( rule__Signal__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAdeptness.g:2611:3: rule__Signal__Group_4__0
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
    // InternalAdeptness.g:2619:1: rule__Signal__Group__5 : rule__Signal__Group__5__Impl rule__Signal__Group__6 ;
    public final void rule__Signal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2623:1: ( rule__Signal__Group__5__Impl rule__Signal__Group__6 )
            // InternalAdeptness.g:2624:2: rule__Signal__Group__5__Impl rule__Signal__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalAdeptness.g:2631:1: rule__Signal__Group__5__Impl : ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) ) ;
    public final void rule__Signal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2635:1: ( ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) ) )
            // InternalAdeptness.g:2636:1: ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) )
            {
            // InternalAdeptness.g:2636:1: ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) )
            // InternalAdeptness.g:2637:2: ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* )
            {
            // InternalAdeptness.g:2637:2: ( ( rule__Signal__OracleAssignment_5 ) )
            // InternalAdeptness.g:2638:3: ( rule__Signal__OracleAssignment_5 )
            {
             before(grammarAccess.getSignalAccess().getOracleAssignment_5()); 
            // InternalAdeptness.g:2639:3: ( rule__Signal__OracleAssignment_5 )
            // InternalAdeptness.g:2639:4: rule__Signal__OracleAssignment_5
            {
            pushFollow(FOLLOW_21);
            rule__Signal__OracleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getOracleAssignment_5()); 

            }

            // InternalAdeptness.g:2642:2: ( ( rule__Signal__OracleAssignment_5 )* )
            // InternalAdeptness.g:2643:3: ( rule__Signal__OracleAssignment_5 )*
            {
             before(grammarAccess.getSignalAccess().getOracleAssignment_5()); 
            // InternalAdeptness.g:2644:3: ( rule__Signal__OracleAssignment_5 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==43) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAdeptness.g:2644:4: rule__Signal__OracleAssignment_5
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Signal__OracleAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalAdeptness.g:2653:1: rule__Signal__Group__6 : rule__Signal__Group__6__Impl ;
    public final void rule__Signal__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2657:1: ( rule__Signal__Group__6__Impl )
            // InternalAdeptness.g:2658:2: rule__Signal__Group__6__Impl
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
    // InternalAdeptness.g:2664:1: rule__Signal__Group__6__Impl : ( 'ENDCPS' ) ;
    public final void rule__Signal__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2668:1: ( ( 'ENDCPS' ) )
            // InternalAdeptness.g:2669:1: ( 'ENDCPS' )
            {
            // InternalAdeptness.g:2669:1: ( 'ENDCPS' )
            // InternalAdeptness.g:2670:2: 'ENDCPS'
            {
             before(grammarAccess.getSignalAccess().getENDCPSKeyword_6()); 
            match(input,39,FOLLOW_2); 
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
    // InternalAdeptness.g:2680:1: rule__Signal__Group_2__0 : rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1 ;
    public final void rule__Signal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2684:1: ( rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1 )
            // InternalAdeptness.g:2685:2: rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAdeptness.g:2692:1: rule__Signal__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Signal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2696:1: ( ( '[' ) )
            // InternalAdeptness.g:2697:1: ( '[' )
            {
            // InternalAdeptness.g:2697:1: ( '[' )
            // InternalAdeptness.g:2698:2: '['
            {
             before(grammarAccess.getSignalAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalAdeptness.g:2707:1: rule__Signal__Group_2__1 : rule__Signal__Group_2__1__Impl rule__Signal__Group_2__2 ;
    public final void rule__Signal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2711:1: ( rule__Signal__Group_2__1__Impl rule__Signal__Group_2__2 )
            // InternalAdeptness.g:2712:2: rule__Signal__Group_2__1__Impl rule__Signal__Group_2__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalAdeptness.g:2719:1: rule__Signal__Group_2__1__Impl : ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) ) ;
    public final void rule__Signal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2723:1: ( ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) ) )
            // InternalAdeptness.g:2724:1: ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) )
            {
            // InternalAdeptness.g:2724:1: ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) )
            // InternalAdeptness.g:2725:2: ( rule__Signal__CardinalityNumCPSAssignment_2_1 )
            {
             before(grammarAccess.getSignalAccess().getCardinalityNumCPSAssignment_2_1()); 
            // InternalAdeptness.g:2726:2: ( rule__Signal__CardinalityNumCPSAssignment_2_1 )
            // InternalAdeptness.g:2726:3: rule__Signal__CardinalityNumCPSAssignment_2_1
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
    // InternalAdeptness.g:2734:1: rule__Signal__Group_2__2 : rule__Signal__Group_2__2__Impl ;
    public final void rule__Signal__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2738:1: ( rule__Signal__Group_2__2__Impl )
            // InternalAdeptness.g:2739:2: rule__Signal__Group_2__2__Impl
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
    // InternalAdeptness.g:2745:1: rule__Signal__Group_2__2__Impl : ( ']' ) ;
    public final void rule__Signal__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2749:1: ( ( ']' ) )
            // InternalAdeptness.g:2750:1: ( ']' )
            {
            // InternalAdeptness.g:2750:1: ( ']' )
            // InternalAdeptness.g:2751:2: ']'
            {
             before(grammarAccess.getSignalAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalAdeptness.g:2761:1: rule__Signal__Group_4__0 : rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1 ;
    public final void rule__Signal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2765:1: ( rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1 )
            // InternalAdeptness.g:2766:2: rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1
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
    // InternalAdeptness.g:2773:1: rule__Signal__Group_4__0__Impl : ( 'implements' ) ;
    public final void rule__Signal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2777:1: ( ( 'implements' ) )
            // InternalAdeptness.g:2778:1: ( 'implements' )
            {
            // InternalAdeptness.g:2778:1: ( 'implements' )
            // InternalAdeptness.g:2779:2: 'implements'
            {
             before(grammarAccess.getSignalAccess().getImplementsKeyword_4_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalAdeptness.g:2788:1: rule__Signal__Group_4__1 : rule__Signal__Group_4__1__Impl ;
    public final void rule__Signal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2792:1: ( rule__Signal__Group_4__1__Impl )
            // InternalAdeptness.g:2793:2: rule__Signal__Group_4__1__Impl
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
    // InternalAdeptness.g:2799:1: rule__Signal__Group_4__1__Impl : ( ( rule__Signal__SuperTypeAssignment_4_1 ) ) ;
    public final void rule__Signal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2803:1: ( ( ( rule__Signal__SuperTypeAssignment_4_1 ) ) )
            // InternalAdeptness.g:2804:1: ( ( rule__Signal__SuperTypeAssignment_4_1 ) )
            {
            // InternalAdeptness.g:2804:1: ( ( rule__Signal__SuperTypeAssignment_4_1 ) )
            // InternalAdeptness.g:2805:2: ( rule__Signal__SuperTypeAssignment_4_1 )
            {
             before(grammarAccess.getSignalAccess().getSuperTypeAssignment_4_1()); 
            // InternalAdeptness.g:2806:2: ( rule__Signal__SuperTypeAssignment_4_1 )
            // InternalAdeptness.g:2806:3: rule__Signal__SuperTypeAssignment_4_1
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
    // InternalAdeptness.g:2815:1: rule__Oracle__Group__0 : rule__Oracle__Group__0__Impl rule__Oracle__Group__1 ;
    public final void rule__Oracle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2819:1: ( rule__Oracle__Group__0__Impl rule__Oracle__Group__1 )
            // InternalAdeptness.g:2820:2: rule__Oracle__Group__0__Impl rule__Oracle__Group__1
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
    // InternalAdeptness.g:2827:1: rule__Oracle__Group__0__Impl : ( 'ORACLE' ) ;
    public final void rule__Oracle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2831:1: ( ( 'ORACLE' ) )
            // InternalAdeptness.g:2832:1: ( 'ORACLE' )
            {
            // InternalAdeptness.g:2832:1: ( 'ORACLE' )
            // InternalAdeptness.g:2833:2: 'ORACLE'
            {
             before(grammarAccess.getOracleAccess().getORACLEKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalAdeptness.g:2842:1: rule__Oracle__Group__1 : rule__Oracle__Group__1__Impl rule__Oracle__Group__2 ;
    public final void rule__Oracle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2846:1: ( rule__Oracle__Group__1__Impl rule__Oracle__Group__2 )
            // InternalAdeptness.g:2847:2: rule__Oracle__Group__1__Impl rule__Oracle__Group__2
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
    // InternalAdeptness.g:2854:1: rule__Oracle__Group__1__Impl : ( ( rule__Oracle__NameAssignment_1 ) ) ;
    public final void rule__Oracle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2858:1: ( ( ( rule__Oracle__NameAssignment_1 ) ) )
            // InternalAdeptness.g:2859:1: ( ( rule__Oracle__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:2859:1: ( ( rule__Oracle__NameAssignment_1 ) )
            // InternalAdeptness.g:2860:2: ( rule__Oracle__NameAssignment_1 )
            {
             before(grammarAccess.getOracleAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:2861:2: ( rule__Oracle__NameAssignment_1 )
            // InternalAdeptness.g:2861:3: rule__Oracle__NameAssignment_1
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
    // InternalAdeptness.g:2869:1: rule__Oracle__Group__2 : rule__Oracle__Group__2__Impl rule__Oracle__Group__3 ;
    public final void rule__Oracle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2873:1: ( rule__Oracle__Group__2__Impl rule__Oracle__Group__3 )
            // InternalAdeptness.g:2874:2: rule__Oracle__Group__2__Impl rule__Oracle__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalAdeptness.g:2881:1: rule__Oracle__Group__2__Impl : ( ':' ) ;
    public final void rule__Oracle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2885:1: ( ( ':' ) )
            // InternalAdeptness.g:2886:1: ( ':' )
            {
            // InternalAdeptness.g:2886:1: ( ':' )
            // InternalAdeptness.g:2887:2: ':'
            {
             before(grammarAccess.getOracleAccess().getColonKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAdeptness.g:2896:1: rule__Oracle__Group__3 : rule__Oracle__Group__3__Impl rule__Oracle__Group__4 ;
    public final void rule__Oracle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2900:1: ( rule__Oracle__Group__3__Impl rule__Oracle__Group__4 )
            // InternalAdeptness.g:2901:2: rule__Oracle__Group__3__Impl rule__Oracle__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalAdeptness.g:2908:1: rule__Oracle__Group__3__Impl : ( ( rule__Oracle__Alternatives_3 )? ) ;
    public final void rule__Oracle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2912:1: ( ( ( rule__Oracle__Alternatives_3 )? ) )
            // InternalAdeptness.g:2913:1: ( ( rule__Oracle__Alternatives_3 )? )
            {
            // InternalAdeptness.g:2913:1: ( ( rule__Oracle__Alternatives_3 )? )
            // InternalAdeptness.g:2914:2: ( rule__Oracle__Alternatives_3 )?
            {
             before(grammarAccess.getOracleAccess().getAlternatives_3()); 
            // InternalAdeptness.g:2915:2: ( rule__Oracle__Alternatives_3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=45 && LA27_0<=46)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAdeptness.g:2915:3: rule__Oracle__Alternatives_3
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
    // InternalAdeptness.g:2923:1: rule__Oracle__Group__4 : rule__Oracle__Group__4__Impl rule__Oracle__Group__5 ;
    public final void rule__Oracle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2927:1: ( rule__Oracle__Group__4__Impl rule__Oracle__Group__5 )
            // InternalAdeptness.g:2928:2: rule__Oracle__Group__4__Impl rule__Oracle__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdeptness.g:2935:1: rule__Oracle__Group__4__Impl : ( ( ( rule__Oracle__CheckAssignment_4 ) ) ( ( rule__Oracle__CheckAssignment_4 )* ) ) ;
    public final void rule__Oracle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2939:1: ( ( ( ( rule__Oracle__CheckAssignment_4 ) ) ( ( rule__Oracle__CheckAssignment_4 )* ) ) )
            // InternalAdeptness.g:2940:1: ( ( ( rule__Oracle__CheckAssignment_4 ) ) ( ( rule__Oracle__CheckAssignment_4 )* ) )
            {
            // InternalAdeptness.g:2940:1: ( ( ( rule__Oracle__CheckAssignment_4 ) ) ( ( rule__Oracle__CheckAssignment_4 )* ) )
            // InternalAdeptness.g:2941:2: ( ( rule__Oracle__CheckAssignment_4 ) ) ( ( rule__Oracle__CheckAssignment_4 )* )
            {
            // InternalAdeptness.g:2941:2: ( ( rule__Oracle__CheckAssignment_4 ) )
            // InternalAdeptness.g:2942:3: ( rule__Oracle__CheckAssignment_4 )
            {
             before(grammarAccess.getOracleAccess().getCheckAssignment_4()); 
            // InternalAdeptness.g:2943:3: ( rule__Oracle__CheckAssignment_4 )
            // InternalAdeptness.g:2943:4: rule__Oracle__CheckAssignment_4
            {
            pushFollow(FOLLOW_26);
            rule__Oracle__CheckAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOracleAccess().getCheckAssignment_4()); 

            }

            // InternalAdeptness.g:2946:2: ( ( rule__Oracle__CheckAssignment_4 )* )
            // InternalAdeptness.g:2947:3: ( rule__Oracle__CheckAssignment_4 )*
            {
             before(grammarAccess.getOracleAccess().getCheckAssignment_4()); 
            // InternalAdeptness.g:2948:3: ( rule__Oracle__CheckAssignment_4 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==50) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAdeptness.g:2948:4: rule__Oracle__CheckAssignment_4
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Oracle__CheckAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getOracleAccess().getCheckAssignment_4()); 

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
    // $ANTLR end "rule__Oracle__Group__4__Impl"


    // $ANTLR start "rule__Oracle__Group__5"
    // InternalAdeptness.g:2957:1: rule__Oracle__Group__5 : rule__Oracle__Group__5__Impl ;
    public final void rule__Oracle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2961:1: ( rule__Oracle__Group__5__Impl )
            // InternalAdeptness.g:2962:2: rule__Oracle__Group__5__Impl
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
    // InternalAdeptness.g:2968:1: rule__Oracle__Group__5__Impl : ( 'ENDORACLE' ) ;
    public final void rule__Oracle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2972:1: ( ( 'ENDORACLE' ) )
            // InternalAdeptness.g:2973:1: ( 'ENDORACLE' )
            {
            // InternalAdeptness.g:2973:1: ( 'ENDORACLE' )
            // InternalAdeptness.g:2974:2: 'ENDORACLE'
            {
             before(grammarAccess.getOracleAccess().getENDORACLEKeyword_5()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAdeptness.g:2984:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2988:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // InternalAdeptness.g:2989:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:2996:1: rule__While__Group__0__Impl : ( 'while:' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3000:1: ( ( 'while:' ) )
            // InternalAdeptness.g:3001:1: ( 'while:' )
            {
            // InternalAdeptness.g:3001:1: ( 'while:' )
            // InternalAdeptness.g:3002:2: 'while:'
            {
             before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalAdeptness.g:3011:1: rule__While__Group__1 : rule__While__Group__1__Impl ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3015:1: ( rule__While__Group__1__Impl )
            // InternalAdeptness.g:3016:2: rule__While__Group__1__Impl
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
    // InternalAdeptness.g:3022:1: rule__While__Group__1__Impl : ( ( rule__While__EmAssignment_1 ) ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3026:1: ( ( ( rule__While__EmAssignment_1 ) ) )
            // InternalAdeptness.g:3027:1: ( ( rule__While__EmAssignment_1 ) )
            {
            // InternalAdeptness.g:3027:1: ( ( rule__While__EmAssignment_1 ) )
            // InternalAdeptness.g:3028:2: ( rule__While__EmAssignment_1 )
            {
             before(grammarAccess.getWhileAccess().getEmAssignment_1()); 
            // InternalAdeptness.g:3029:2: ( rule__While__EmAssignment_1 )
            // InternalAdeptness.g:3029:3: rule__While__EmAssignment_1
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
    // InternalAdeptness.g:3038:1: rule__When__Group__0 : rule__When__Group__0__Impl rule__When__Group__1 ;
    public final void rule__When__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3042:1: ( rule__When__Group__0__Impl rule__When__Group__1 )
            // InternalAdeptness.g:3043:2: rule__When__Group__0__Impl rule__When__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:3050:1: rule__When__Group__0__Impl : ( 'when:' ) ;
    public final void rule__When__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3054:1: ( ( 'when:' ) )
            // InternalAdeptness.g:3055:1: ( 'when:' )
            {
            // InternalAdeptness.g:3055:1: ( 'when:' )
            // InternalAdeptness.g:3056:2: 'when:'
            {
             before(grammarAccess.getWhenAccess().getWhenKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalAdeptness.g:3065:1: rule__When__Group__1 : rule__When__Group__1__Impl rule__When__Group__2 ;
    public final void rule__When__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3069:1: ( rule__When__Group__1__Impl rule__When__Group__2 )
            // InternalAdeptness.g:3070:2: rule__When__Group__1__Impl rule__When__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalAdeptness.g:3077:1: rule__When__Group__1__Impl : ( ( rule__When__EmAssignment_1 ) ) ;
    public final void rule__When__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3081:1: ( ( ( rule__When__EmAssignment_1 ) ) )
            // InternalAdeptness.g:3082:1: ( ( rule__When__EmAssignment_1 ) )
            {
            // InternalAdeptness.g:3082:1: ( ( rule__When__EmAssignment_1 ) )
            // InternalAdeptness.g:3083:2: ( rule__When__EmAssignment_1 )
            {
             before(grammarAccess.getWhenAccess().getEmAssignment_1()); 
            // InternalAdeptness.g:3084:2: ( rule__When__EmAssignment_1 )
            // InternalAdeptness.g:3084:3: rule__When__EmAssignment_1
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
    // InternalAdeptness.g:3092:1: rule__When__Group__2 : rule__When__Group__2__Impl ;
    public final void rule__When__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3096:1: ( rule__When__Group__2__Impl )
            // InternalAdeptness.g:3097:2: rule__When__Group__2__Impl
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
    // InternalAdeptness.g:3103:1: rule__When__Group__2__Impl : ( ( rule__When__AwAssignment_2 )? ) ;
    public final void rule__When__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3107:1: ( ( ( rule__When__AwAssignment_2 )? ) )
            // InternalAdeptness.g:3108:1: ( ( rule__When__AwAssignment_2 )? )
            {
            // InternalAdeptness.g:3108:1: ( ( rule__When__AwAssignment_2 )? )
            // InternalAdeptness.g:3109:2: ( rule__When__AwAssignment_2 )?
            {
             before(grammarAccess.getWhenAccess().getAwAssignment_2()); 
            // InternalAdeptness.g:3110:2: ( rule__When__AwAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==47||LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAdeptness.g:3110:3: rule__When__AwAssignment_2
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
    // InternalAdeptness.g:3119:1: rule__Wait__Group__0 : rule__Wait__Group__0__Impl rule__Wait__Group__1 ;
    public final void rule__Wait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3123:1: ( rule__Wait__Group__0__Impl rule__Wait__Group__1 )
            // InternalAdeptness.g:3124:2: rule__Wait__Group__0__Impl rule__Wait__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:3131:1: rule__Wait__Group__0__Impl : ( 'after(' ) ;
    public final void rule__Wait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3135:1: ( ( 'after(' ) )
            // InternalAdeptness.g:3136:1: ( 'after(' )
            {
            // InternalAdeptness.g:3136:1: ( 'after(' )
            // InternalAdeptness.g:3137:2: 'after('
            {
             before(grammarAccess.getWaitAccess().getAfterKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalAdeptness.g:3146:1: rule__Wait__Group__1 : rule__Wait__Group__1__Impl rule__Wait__Group__2 ;
    public final void rule__Wait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3150:1: ( rule__Wait__Group__1__Impl rule__Wait__Group__2 )
            // InternalAdeptness.g:3151:2: rule__Wait__Group__1__Impl rule__Wait__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalAdeptness.g:3158:1: rule__Wait__Group__1__Impl : ( ( rule__Wait__TimeAssignment_1 ) ) ;
    public final void rule__Wait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3162:1: ( ( ( rule__Wait__TimeAssignment_1 ) ) )
            // InternalAdeptness.g:3163:1: ( ( rule__Wait__TimeAssignment_1 ) )
            {
            // InternalAdeptness.g:3163:1: ( ( rule__Wait__TimeAssignment_1 ) )
            // InternalAdeptness.g:3164:2: ( rule__Wait__TimeAssignment_1 )
            {
             before(grammarAccess.getWaitAccess().getTimeAssignment_1()); 
            // InternalAdeptness.g:3165:2: ( rule__Wait__TimeAssignment_1 )
            // InternalAdeptness.g:3165:3: rule__Wait__TimeAssignment_1
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
    // InternalAdeptness.g:3173:1: rule__Wait__Group__2 : rule__Wait__Group__2__Impl rule__Wait__Group__3 ;
    public final void rule__Wait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3177:1: ( rule__Wait__Group__2__Impl rule__Wait__Group__3 )
            // InternalAdeptness.g:3178:2: rule__Wait__Group__2__Impl rule__Wait__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalAdeptness.g:3185:1: rule__Wait__Group__2__Impl : ( ',' ) ;
    public final void rule__Wait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3189:1: ( ( ',' ) )
            // InternalAdeptness.g:3190:1: ( ',' )
            {
            // InternalAdeptness.g:3190:1: ( ',' )
            // InternalAdeptness.g:3191:2: ','
            {
             before(grammarAccess.getWaitAccess().getCommaKeyword_2()); 
            match(input,48,FOLLOW_2); 
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
    // InternalAdeptness.g:3200:1: rule__Wait__Group__3 : rule__Wait__Group__3__Impl rule__Wait__Group__4 ;
    public final void rule__Wait__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3204:1: ( rule__Wait__Group__3__Impl rule__Wait__Group__4 )
            // InternalAdeptness.g:3205:2: rule__Wait__Group__3__Impl rule__Wait__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalAdeptness.g:3212:1: rule__Wait__Group__3__Impl : ( ( rule__Wait__UnitAssignment_3 ) ) ;
    public final void rule__Wait__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3216:1: ( ( ( rule__Wait__UnitAssignment_3 ) ) )
            // InternalAdeptness.g:3217:1: ( ( rule__Wait__UnitAssignment_3 ) )
            {
            // InternalAdeptness.g:3217:1: ( ( rule__Wait__UnitAssignment_3 ) )
            // InternalAdeptness.g:3218:2: ( rule__Wait__UnitAssignment_3 )
            {
             before(grammarAccess.getWaitAccess().getUnitAssignment_3()); 
            // InternalAdeptness.g:3219:2: ( rule__Wait__UnitAssignment_3 )
            // InternalAdeptness.g:3219:3: rule__Wait__UnitAssignment_3
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
    // InternalAdeptness.g:3227:1: rule__Wait__Group__4 : rule__Wait__Group__4__Impl ;
    public final void rule__Wait__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3231:1: ( rule__Wait__Group__4__Impl )
            // InternalAdeptness.g:3232:2: rule__Wait__Group__4__Impl
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
    // InternalAdeptness.g:3238:1: rule__Wait__Group__4__Impl : ( ')' ) ;
    public final void rule__Wait__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3242:1: ( ( ')' ) )
            // InternalAdeptness.g:3243:1: ( ')' )
            {
            // InternalAdeptness.g:3243:1: ( ')' )
            // InternalAdeptness.g:3244:2: ')'
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
    // InternalAdeptness.g:3254:1: rule__During__Group__0 : rule__During__Group__0__Impl rule__During__Group__1 ;
    public final void rule__During__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3258:1: ( rule__During__Group__0__Impl rule__During__Group__1 )
            // InternalAdeptness.g:3259:2: rule__During__Group__0__Impl rule__During__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:3266:1: rule__During__Group__0__Impl : ( 'during(' ) ;
    public final void rule__During__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3270:1: ( ( 'during(' ) )
            // InternalAdeptness.g:3271:1: ( 'during(' )
            {
            // InternalAdeptness.g:3271:1: ( 'during(' )
            // InternalAdeptness.g:3272:2: 'during('
            {
             before(grammarAccess.getDuringAccess().getDuringKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalAdeptness.g:3281:1: rule__During__Group__1 : rule__During__Group__1__Impl rule__During__Group__2 ;
    public final void rule__During__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3285:1: ( rule__During__Group__1__Impl rule__During__Group__2 )
            // InternalAdeptness.g:3286:2: rule__During__Group__1__Impl rule__During__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalAdeptness.g:3293:1: rule__During__Group__1__Impl : ( ( rule__During__TimeAssignment_1 ) ) ;
    public final void rule__During__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3297:1: ( ( ( rule__During__TimeAssignment_1 ) ) )
            // InternalAdeptness.g:3298:1: ( ( rule__During__TimeAssignment_1 ) )
            {
            // InternalAdeptness.g:3298:1: ( ( rule__During__TimeAssignment_1 ) )
            // InternalAdeptness.g:3299:2: ( rule__During__TimeAssignment_1 )
            {
             before(grammarAccess.getDuringAccess().getTimeAssignment_1()); 
            // InternalAdeptness.g:3300:2: ( rule__During__TimeAssignment_1 )
            // InternalAdeptness.g:3300:3: rule__During__TimeAssignment_1
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
    // InternalAdeptness.g:3308:1: rule__During__Group__2 : rule__During__Group__2__Impl rule__During__Group__3 ;
    public final void rule__During__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3312:1: ( rule__During__Group__2__Impl rule__During__Group__3 )
            // InternalAdeptness.g:3313:2: rule__During__Group__2__Impl rule__During__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalAdeptness.g:3320:1: rule__During__Group__2__Impl : ( ',' ) ;
    public final void rule__During__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3324:1: ( ( ',' ) )
            // InternalAdeptness.g:3325:1: ( ',' )
            {
            // InternalAdeptness.g:3325:1: ( ',' )
            // InternalAdeptness.g:3326:2: ','
            {
             before(grammarAccess.getDuringAccess().getCommaKeyword_2()); 
            match(input,48,FOLLOW_2); 
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
    // InternalAdeptness.g:3335:1: rule__During__Group__3 : rule__During__Group__3__Impl rule__During__Group__4 ;
    public final void rule__During__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3339:1: ( rule__During__Group__3__Impl rule__During__Group__4 )
            // InternalAdeptness.g:3340:2: rule__During__Group__3__Impl rule__During__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalAdeptness.g:3347:1: rule__During__Group__3__Impl : ( ( rule__During__UnitAssignment_3 ) ) ;
    public final void rule__During__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3351:1: ( ( ( rule__During__UnitAssignment_3 ) ) )
            // InternalAdeptness.g:3352:1: ( ( rule__During__UnitAssignment_3 ) )
            {
            // InternalAdeptness.g:3352:1: ( ( rule__During__UnitAssignment_3 ) )
            // InternalAdeptness.g:3353:2: ( rule__During__UnitAssignment_3 )
            {
             before(grammarAccess.getDuringAccess().getUnitAssignment_3()); 
            // InternalAdeptness.g:3354:2: ( rule__During__UnitAssignment_3 )
            // InternalAdeptness.g:3354:3: rule__During__UnitAssignment_3
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
    // InternalAdeptness.g:3362:1: rule__During__Group__4 : rule__During__Group__4__Impl ;
    public final void rule__During__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3366:1: ( rule__During__Group__4__Impl )
            // InternalAdeptness.g:3367:2: rule__During__Group__4__Impl
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
    // InternalAdeptness.g:3373:1: rule__During__Group__4__Impl : ( ')' ) ;
    public final void rule__During__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3377:1: ( ( ')' ) )
            // InternalAdeptness.g:3378:1: ( ')' )
            {
            // InternalAdeptness.g:3378:1: ( ')' )
            // InternalAdeptness.g:3379:2: ')'
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
    // InternalAdeptness.g:3389:1: rule__Checks__Group__0 : rule__Checks__Group__0__Impl rule__Checks__Group__1 ;
    public final void rule__Checks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3393:1: ( rule__Checks__Group__0__Impl rule__Checks__Group__1 )
            // InternalAdeptness.g:3394:2: rule__Checks__Group__0__Impl rule__Checks__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:3401:1: rule__Checks__Group__0__Impl : ( 'checks:' ) ;
    public final void rule__Checks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3405:1: ( ( 'checks:' ) )
            // InternalAdeptness.g:3406:1: ( 'checks:' )
            {
            // InternalAdeptness.g:3406:1: ( 'checks:' )
            // InternalAdeptness.g:3407:2: 'checks:'
            {
             before(grammarAccess.getChecksAccess().getChecksKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalAdeptness.g:3416:1: rule__Checks__Group__1 : rule__Checks__Group__1__Impl rule__Checks__Group__2 ;
    public final void rule__Checks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3420:1: ( rule__Checks__Group__1__Impl rule__Checks__Group__2 )
            // InternalAdeptness.g:3421:2: rule__Checks__Group__1__Impl rule__Checks__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalAdeptness.g:3428:1: rule__Checks__Group__1__Impl : ( ( rule__Checks__Alternatives_1 ) ) ;
    public final void rule__Checks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3432:1: ( ( ( rule__Checks__Alternatives_1 ) ) )
            // InternalAdeptness.g:3433:1: ( ( rule__Checks__Alternatives_1 ) )
            {
            // InternalAdeptness.g:3433:1: ( ( rule__Checks__Alternatives_1 ) )
            // InternalAdeptness.g:3434:2: ( rule__Checks__Alternatives_1 )
            {
             before(grammarAccess.getChecksAccess().getAlternatives_1()); 
            // InternalAdeptness.g:3435:2: ( rule__Checks__Alternatives_1 )
            // InternalAdeptness.g:3435:3: rule__Checks__Alternatives_1
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
    // InternalAdeptness.g:3443:1: rule__Checks__Group__2 : rule__Checks__Group__2__Impl rule__Checks__Group__3 ;
    public final void rule__Checks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3447:1: ( rule__Checks__Group__2__Impl rule__Checks__Group__3 )
            // InternalAdeptness.g:3448:2: rule__Checks__Group__2__Impl rule__Checks__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalAdeptness.g:3455:1: rule__Checks__Group__2__Impl : ( ( rule__Checks__ReferenceAssignment_2 ) ) ;
    public final void rule__Checks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3459:1: ( ( ( rule__Checks__ReferenceAssignment_2 ) ) )
            // InternalAdeptness.g:3460:1: ( ( rule__Checks__ReferenceAssignment_2 ) )
            {
            // InternalAdeptness.g:3460:1: ( ( rule__Checks__ReferenceAssignment_2 ) )
            // InternalAdeptness.g:3461:2: ( rule__Checks__ReferenceAssignment_2 )
            {
             before(grammarAccess.getChecksAccess().getReferenceAssignment_2()); 
            // InternalAdeptness.g:3462:2: ( rule__Checks__ReferenceAssignment_2 )
            // InternalAdeptness.g:3462:3: rule__Checks__ReferenceAssignment_2
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
    // InternalAdeptness.g:3470:1: rule__Checks__Group__3 : rule__Checks__Group__3__Impl rule__Checks__Group__4 ;
    public final void rule__Checks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3474:1: ( rule__Checks__Group__3__Impl rule__Checks__Group__4 )
            // InternalAdeptness.g:3475:2: rule__Checks__Group__3__Impl rule__Checks__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalAdeptness.g:3482:1: rule__Checks__Group__3__Impl : ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) ) ;
    public final void rule__Checks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3486:1: ( ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) ) )
            // InternalAdeptness.g:3487:1: ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) )
            {
            // InternalAdeptness.g:3487:1: ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) )
            // InternalAdeptness.g:3488:2: ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* )
            {
            // InternalAdeptness.g:3488:2: ( ( rule__Checks__FailReasonAssignment_3 ) )
            // InternalAdeptness.g:3489:3: ( rule__Checks__FailReasonAssignment_3 )
            {
             before(grammarAccess.getChecksAccess().getFailReasonAssignment_3()); 
            // InternalAdeptness.g:3490:3: ( rule__Checks__FailReasonAssignment_3 )
            // InternalAdeptness.g:3490:4: rule__Checks__FailReasonAssignment_3
            {
            pushFollow(FOLLOW_34);
            rule__Checks__FailReasonAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChecksAccess().getFailReasonAssignment_3()); 

            }

            // InternalAdeptness.g:3493:2: ( ( rule__Checks__FailReasonAssignment_3 )* )
            // InternalAdeptness.g:3494:3: ( rule__Checks__FailReasonAssignment_3 )*
            {
             before(grammarAccess.getChecksAccess().getFailReasonAssignment_3()); 
            // InternalAdeptness.g:3495:3: ( rule__Checks__FailReasonAssignment_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==52) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAdeptness.g:3495:4: rule__Checks__FailReasonAssignment_3
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Checks__FailReasonAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalAdeptness.g:3504:1: rule__Checks__Group__4 : rule__Checks__Group__4__Impl ;
    public final void rule__Checks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3508:1: ( rule__Checks__Group__4__Impl )
            // InternalAdeptness.g:3509:2: rule__Checks__Group__4__Impl
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
    // InternalAdeptness.g:3515:1: rule__Checks__Group__4__Impl : ( ( rule__Checks__DescriptionAssignment_4 ) ) ;
    public final void rule__Checks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3519:1: ( ( ( rule__Checks__DescriptionAssignment_4 ) ) )
            // InternalAdeptness.g:3520:1: ( ( rule__Checks__DescriptionAssignment_4 ) )
            {
            // InternalAdeptness.g:3520:1: ( ( rule__Checks__DescriptionAssignment_4 ) )
            // InternalAdeptness.g:3521:2: ( rule__Checks__DescriptionAssignment_4 )
            {
             before(grammarAccess.getChecksAccess().getDescriptionAssignment_4()); 
            // InternalAdeptness.g:3522:2: ( rule__Checks__DescriptionAssignment_4 )
            // InternalAdeptness.g:3522:3: rule__Checks__DescriptionAssignment_4
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
    // InternalAdeptness.g:3531:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3535:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalAdeptness.g:3536:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalAdeptness.g:3543:1: rule__Description__Group__0__Impl : ( 'Description: ' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3547:1: ( ( 'Description: ' ) )
            // InternalAdeptness.g:3548:1: ( 'Description: ' )
            {
            // InternalAdeptness.g:3548:1: ( 'Description: ' )
            // InternalAdeptness.g:3549:2: 'Description: '
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalAdeptness.g:3558:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3562:1: ( rule__Description__Group__1__Impl )
            // InternalAdeptness.g:3563:2: rule__Description__Group__1__Impl
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
    // InternalAdeptness.g:3569:1: rule__Description__Group__1__Impl : ( ( rule__Description__ValueAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3573:1: ( ( ( rule__Description__ValueAssignment_1 ) ) )
            // InternalAdeptness.g:3574:1: ( ( rule__Description__ValueAssignment_1 ) )
            {
            // InternalAdeptness.g:3574:1: ( ( rule__Description__ValueAssignment_1 ) )
            // InternalAdeptness.g:3575:2: ( rule__Description__ValueAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getValueAssignment_1()); 
            // InternalAdeptness.g:3576:2: ( rule__Description__ValueAssignment_1 )
            // InternalAdeptness.g:3576:3: rule__Description__ValueAssignment_1
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
    // InternalAdeptness.g:3585:1: rule__FailReason__Group__0 : rule__FailReason__Group__0__Impl rule__FailReason__Group__1 ;
    public final void rule__FailReason__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3589:1: ( rule__FailReason__Group__0__Impl rule__FailReason__Group__1 )
            // InternalAdeptness.g:3590:2: rule__FailReason__Group__0__Impl rule__FailReason__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalAdeptness.g:3597:1: rule__FailReason__Group__0__Impl : ( 'fails if :' ) ;
    public final void rule__FailReason__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3601:1: ( ( 'fails if :' ) )
            // InternalAdeptness.g:3602:1: ( 'fails if :' )
            {
            // InternalAdeptness.g:3602:1: ( 'fails if :' )
            // InternalAdeptness.g:3603:2: 'fails if :'
            {
             before(grammarAccess.getFailReasonAccess().getFailsIfKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalAdeptness.g:3612:1: rule__FailReason__Group__1 : rule__FailReason__Group__1__Impl ;
    public final void rule__FailReason__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3616:1: ( rule__FailReason__Group__1__Impl )
            // InternalAdeptness.g:3617:2: rule__FailReason__Group__1__Impl
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
    // InternalAdeptness.g:3623:1: rule__FailReason__Group__1__Impl : ( ( rule__FailReason__ReasonAssignment_1 ) ) ;
    public final void rule__FailReason__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3627:1: ( ( ( rule__FailReason__ReasonAssignment_1 ) ) )
            // InternalAdeptness.g:3628:1: ( ( rule__FailReason__ReasonAssignment_1 ) )
            {
            // InternalAdeptness.g:3628:1: ( ( rule__FailReason__ReasonAssignment_1 ) )
            // InternalAdeptness.g:3629:2: ( rule__FailReason__ReasonAssignment_1 )
            {
             before(grammarAccess.getFailReasonAccess().getReasonAssignment_1()); 
            // InternalAdeptness.g:3630:2: ( rule__FailReason__ReasonAssignment_1 )
            // InternalAdeptness.g:3630:3: rule__FailReason__ReasonAssignment_1
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
    // InternalAdeptness.g:3639:1: rule__Reason__Group__0 : rule__Reason__Group__0__Impl rule__Reason__Group__1 ;
    public final void rule__Reason__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3643:1: ( rule__Reason__Group__0__Impl rule__Reason__Group__1 )
            // InternalAdeptness.g:3644:2: rule__Reason__Group__0__Impl rule__Reason__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalAdeptness.g:3651:1: rule__Reason__Group__0__Impl : ( ( rule__Reason__Alternatives_0 ) ) ;
    public final void rule__Reason__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3655:1: ( ( ( rule__Reason__Alternatives_0 ) ) )
            // InternalAdeptness.g:3656:1: ( ( rule__Reason__Alternatives_0 ) )
            {
            // InternalAdeptness.g:3656:1: ( ( rule__Reason__Alternatives_0 ) )
            // InternalAdeptness.g:3657:2: ( rule__Reason__Alternatives_0 )
            {
             before(grammarAccess.getReasonAccess().getAlternatives_0()); 
            // InternalAdeptness.g:3658:2: ( rule__Reason__Alternatives_0 )
            // InternalAdeptness.g:3658:3: rule__Reason__Alternatives_0
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
    // InternalAdeptness.g:3666:1: rule__Reason__Group__1 : rule__Reason__Group__1__Impl ;
    public final void rule__Reason__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3670:1: ( rule__Reason__Group__1__Impl )
            // InternalAdeptness.g:3671:2: rule__Reason__Group__1__Impl
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
    // InternalAdeptness.g:3677:1: rule__Reason__Group__1__Impl : ( ';' ) ;
    public final void rule__Reason__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3681:1: ( ( ';' ) )
            // InternalAdeptness.g:3682:1: ( ';' )
            {
            // InternalAdeptness.g:3682:1: ( ';' )
            // InternalAdeptness.g:3683:2: ';'
            {
             before(grammarAccess.getReasonAccess().getSemicolonKeyword_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalAdeptness.g:3693:1: rule__XPeaks__Group__0 : rule__XPeaks__Group__0__Impl rule__XPeaks__Group__1 ;
    public final void rule__XPeaks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3697:1: ( rule__XPeaks__Group__0__Impl rule__XPeaks__Group__1 )
            // InternalAdeptness.g:3698:2: rule__XPeaks__Group__0__Impl rule__XPeaks__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:3705:1: rule__XPeaks__Group__0__Impl : ( 'confidence is below' ) ;
    public final void rule__XPeaks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3709:1: ( ( 'confidence is below' ) )
            // InternalAdeptness.g:3710:1: ( 'confidence is below' )
            {
            // InternalAdeptness.g:3710:1: ( 'confidence is below' )
            // InternalAdeptness.g:3711:2: 'confidence is below'
            {
             before(grammarAccess.getXPeaksAccess().getConfidenceIsBelowKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalAdeptness.g:3720:1: rule__XPeaks__Group__1 : rule__XPeaks__Group__1__Impl rule__XPeaks__Group__2 ;
    public final void rule__XPeaks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3724:1: ( rule__XPeaks__Group__1__Impl rule__XPeaks__Group__2 )
            // InternalAdeptness.g:3725:2: rule__XPeaks__Group__1__Impl rule__XPeaks__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalAdeptness.g:3732:1: rule__XPeaks__Group__1__Impl : ( ( rule__XPeaks__CantAssignment_1 ) ) ;
    public final void rule__XPeaks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3736:1: ( ( ( rule__XPeaks__CantAssignment_1 ) ) )
            // InternalAdeptness.g:3737:1: ( ( rule__XPeaks__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:3737:1: ( ( rule__XPeaks__CantAssignment_1 ) )
            // InternalAdeptness.g:3738:2: ( rule__XPeaks__CantAssignment_1 )
            {
             before(grammarAccess.getXPeaksAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:3739:2: ( rule__XPeaks__CantAssignment_1 )
            // InternalAdeptness.g:3739:3: rule__XPeaks__CantAssignment_1
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
    // InternalAdeptness.g:3747:1: rule__XPeaks__Group__2 : rule__XPeaks__Group__2__Impl rule__XPeaks__Group__3 ;
    public final void rule__XPeaks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3751:1: ( rule__XPeaks__Group__2__Impl rule__XPeaks__Group__3 )
            // InternalAdeptness.g:3752:2: rule__XPeaks__Group__2__Impl rule__XPeaks__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:3759:1: rule__XPeaks__Group__2__Impl : ( 'more than' ) ;
    public final void rule__XPeaks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3763:1: ( ( 'more than' ) )
            // InternalAdeptness.g:3764:1: ( 'more than' )
            {
            // InternalAdeptness.g:3764:1: ( 'more than' )
            // InternalAdeptness.g:3765:2: 'more than'
            {
             before(grammarAccess.getXPeaksAccess().getMoreThanKeyword_2()); 
            match(input,55,FOLLOW_2); 
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
    // InternalAdeptness.g:3774:1: rule__XPeaks__Group__3 : rule__XPeaks__Group__3__Impl rule__XPeaks__Group__4 ;
    public final void rule__XPeaks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3778:1: ( rule__XPeaks__Group__3__Impl rule__XPeaks__Group__4 )
            // InternalAdeptness.g:3779:2: rule__XPeaks__Group__3__Impl rule__XPeaks__Group__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdeptness.g:3786:1: rule__XPeaks__Group__3__Impl : ( ( rule__XPeaks__NPeaksAssignment_3 ) ) ;
    public final void rule__XPeaks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3790:1: ( ( ( rule__XPeaks__NPeaksAssignment_3 ) ) )
            // InternalAdeptness.g:3791:1: ( ( rule__XPeaks__NPeaksAssignment_3 ) )
            {
            // InternalAdeptness.g:3791:1: ( ( rule__XPeaks__NPeaksAssignment_3 ) )
            // InternalAdeptness.g:3792:2: ( rule__XPeaks__NPeaksAssignment_3 )
            {
             before(grammarAccess.getXPeaksAccess().getNPeaksAssignment_3()); 
            // InternalAdeptness.g:3793:2: ( rule__XPeaks__NPeaksAssignment_3 )
            // InternalAdeptness.g:3793:3: rule__XPeaks__NPeaksAssignment_3
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
    // InternalAdeptness.g:3801:1: rule__XPeaks__Group__4 : rule__XPeaks__Group__4__Impl rule__XPeaks__Group__5 ;
    public final void rule__XPeaks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3805:1: ( rule__XPeaks__Group__4__Impl rule__XPeaks__Group__5 )
            // InternalAdeptness.g:3806:2: rule__XPeaks__Group__4__Impl rule__XPeaks__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:3813:1: rule__XPeaks__Group__4__Impl : ( 'times within' ) ;
    public final void rule__XPeaks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3817:1: ( ( 'times within' ) )
            // InternalAdeptness.g:3818:1: ( 'times within' )
            {
            // InternalAdeptness.g:3818:1: ( 'times within' )
            // InternalAdeptness.g:3819:2: 'times within'
            {
             before(grammarAccess.getXPeaksAccess().getTimesWithinKeyword_4()); 
            match(input,56,FOLLOW_2); 
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
    // InternalAdeptness.g:3828:1: rule__XPeaks__Group__5 : rule__XPeaks__Group__5__Impl rule__XPeaks__Group__6 ;
    public final void rule__XPeaks__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3832:1: ( rule__XPeaks__Group__5__Impl rule__XPeaks__Group__6 )
            // InternalAdeptness.g:3833:2: rule__XPeaks__Group__5__Impl rule__XPeaks__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalAdeptness.g:3840:1: rule__XPeaks__Group__5__Impl : ( ( rule__XPeaks__TimeAssignment_5 ) ) ;
    public final void rule__XPeaks__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3844:1: ( ( ( rule__XPeaks__TimeAssignment_5 ) ) )
            // InternalAdeptness.g:3845:1: ( ( rule__XPeaks__TimeAssignment_5 ) )
            {
            // InternalAdeptness.g:3845:1: ( ( rule__XPeaks__TimeAssignment_5 ) )
            // InternalAdeptness.g:3846:2: ( rule__XPeaks__TimeAssignment_5 )
            {
             before(grammarAccess.getXPeaksAccess().getTimeAssignment_5()); 
            // InternalAdeptness.g:3847:2: ( rule__XPeaks__TimeAssignment_5 )
            // InternalAdeptness.g:3847:3: rule__XPeaks__TimeAssignment_5
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
    // InternalAdeptness.g:3855:1: rule__XPeaks__Group__6 : rule__XPeaks__Group__6__Impl ;
    public final void rule__XPeaks__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3859:1: ( rule__XPeaks__Group__6__Impl )
            // InternalAdeptness.g:3860:2: rule__XPeaks__Group__6__Impl
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
    // InternalAdeptness.g:3866:1: rule__XPeaks__Group__6__Impl : ( ( rule__XPeaks__UnitAssignment_6 ) ) ;
    public final void rule__XPeaks__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3870:1: ( ( ( rule__XPeaks__UnitAssignment_6 ) ) )
            // InternalAdeptness.g:3871:1: ( ( rule__XPeaks__UnitAssignment_6 ) )
            {
            // InternalAdeptness.g:3871:1: ( ( rule__XPeaks__UnitAssignment_6 ) )
            // InternalAdeptness.g:3872:2: ( rule__XPeaks__UnitAssignment_6 )
            {
             before(grammarAccess.getXPeaksAccess().getUnitAssignment_6()); 
            // InternalAdeptness.g:3873:2: ( rule__XPeaks__UnitAssignment_6 )
            // InternalAdeptness.g:3873:3: rule__XPeaks__UnitAssignment_6
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
    // InternalAdeptness.g:3882:1: rule__ConstDeg__Group__0 : rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1 ;
    public final void rule__ConstDeg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3886:1: ( rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1 )
            // InternalAdeptness.g:3887:2: rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:3894:1: rule__ConstDeg__Group__0__Impl : ( 'confidence is in constant degradation' ) ;
    public final void rule__ConstDeg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3898:1: ( ( 'confidence is in constant degradation' ) )
            // InternalAdeptness.g:3899:1: ( 'confidence is in constant degradation' )
            {
            // InternalAdeptness.g:3899:1: ( 'confidence is in constant degradation' )
            // InternalAdeptness.g:3900:2: 'confidence is in constant degradation'
            {
             before(grammarAccess.getConstDegAccess().getConfidenceIsInConstantDegradationKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalAdeptness.g:3909:1: rule__ConstDeg__Group__1 : rule__ConstDeg__Group__1__Impl ;
    public final void rule__ConstDeg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3913:1: ( rule__ConstDeg__Group__1__Impl )
            // InternalAdeptness.g:3914:2: rule__ConstDeg__Group__1__Impl
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
    // InternalAdeptness.g:3920:1: rule__ConstDeg__Group__1__Impl : ( ( rule__ConstDeg__CantAssignment_1 ) ) ;
    public final void rule__ConstDeg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3924:1: ( ( ( rule__ConstDeg__CantAssignment_1 ) ) )
            // InternalAdeptness.g:3925:1: ( ( rule__ConstDeg__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:3925:1: ( ( rule__ConstDeg__CantAssignment_1 ) )
            // InternalAdeptness.g:3926:2: ( rule__ConstDeg__CantAssignment_1 )
            {
             before(grammarAccess.getConstDegAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:3927:2: ( rule__ConstDeg__CantAssignment_1 )
            // InternalAdeptness.g:3927:3: rule__ConstDeg__CantAssignment_1
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
    // InternalAdeptness.g:3936:1: rule__HighTime__Group__0 : rule__HighTime__Group__0__Impl rule__HighTime__Group__1 ;
    public final void rule__HighTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3940:1: ( rule__HighTime__Group__0__Impl rule__HighTime__Group__1 )
            // InternalAdeptness.g:3941:2: rule__HighTime__Group__0__Impl rule__HighTime__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:3948:1: rule__HighTime__Group__0__Impl : ( 'confidence is below' ) ;
    public final void rule__HighTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3952:1: ( ( 'confidence is below' ) )
            // InternalAdeptness.g:3953:1: ( 'confidence is below' )
            {
            // InternalAdeptness.g:3953:1: ( 'confidence is below' )
            // InternalAdeptness.g:3954:2: 'confidence is below'
            {
             before(grammarAccess.getHighTimeAccess().getConfidenceIsBelowKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalAdeptness.g:3963:1: rule__HighTime__Group__1 : rule__HighTime__Group__1__Impl rule__HighTime__Group__2 ;
    public final void rule__HighTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3967:1: ( rule__HighTime__Group__1__Impl rule__HighTime__Group__2 )
            // InternalAdeptness.g:3968:2: rule__HighTime__Group__1__Impl rule__HighTime__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdeptness.g:3975:1: rule__HighTime__Group__1__Impl : ( ( rule__HighTime__CantAssignment_1 ) ) ;
    public final void rule__HighTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3979:1: ( ( ( rule__HighTime__CantAssignment_1 ) ) )
            // InternalAdeptness.g:3980:1: ( ( rule__HighTime__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:3980:1: ( ( rule__HighTime__CantAssignment_1 ) )
            // InternalAdeptness.g:3981:2: ( rule__HighTime__CantAssignment_1 )
            {
             before(grammarAccess.getHighTimeAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:3982:2: ( rule__HighTime__CantAssignment_1 )
            // InternalAdeptness.g:3982:3: rule__HighTime__CantAssignment_1
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
    // InternalAdeptness.g:3990:1: rule__HighTime__Group__2 : rule__HighTime__Group__2__Impl rule__HighTime__Group__3 ;
    public final void rule__HighTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3994:1: ( rule__HighTime__Group__2__Impl rule__HighTime__Group__3 )
            // InternalAdeptness.g:3995:2: rule__HighTime__Group__2__Impl rule__HighTime__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:4002:1: rule__HighTime__Group__2__Impl : ( 'within' ) ;
    public final void rule__HighTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4006:1: ( ( 'within' ) )
            // InternalAdeptness.g:4007:1: ( 'within' )
            {
            // InternalAdeptness.g:4007:1: ( 'within' )
            // InternalAdeptness.g:4008:2: 'within'
            {
             before(grammarAccess.getHighTimeAccess().getWithinKeyword_2()); 
            match(input,58,FOLLOW_2); 
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
    // InternalAdeptness.g:4017:1: rule__HighTime__Group__3 : rule__HighTime__Group__3__Impl rule__HighTime__Group__4 ;
    public final void rule__HighTime__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4021:1: ( rule__HighTime__Group__3__Impl rule__HighTime__Group__4 )
            // InternalAdeptness.g:4022:2: rule__HighTime__Group__3__Impl rule__HighTime__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalAdeptness.g:4029:1: rule__HighTime__Group__3__Impl : ( ( rule__HighTime__TimeAssignment_3 ) ) ;
    public final void rule__HighTime__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4033:1: ( ( ( rule__HighTime__TimeAssignment_3 ) ) )
            // InternalAdeptness.g:4034:1: ( ( rule__HighTime__TimeAssignment_3 ) )
            {
            // InternalAdeptness.g:4034:1: ( ( rule__HighTime__TimeAssignment_3 ) )
            // InternalAdeptness.g:4035:2: ( rule__HighTime__TimeAssignment_3 )
            {
             before(grammarAccess.getHighTimeAccess().getTimeAssignment_3()); 
            // InternalAdeptness.g:4036:2: ( rule__HighTime__TimeAssignment_3 )
            // InternalAdeptness.g:4036:3: rule__HighTime__TimeAssignment_3
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
    // InternalAdeptness.g:4044:1: rule__HighTime__Group__4 : rule__HighTime__Group__4__Impl ;
    public final void rule__HighTime__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4048:1: ( rule__HighTime__Group__4__Impl )
            // InternalAdeptness.g:4049:2: rule__HighTime__Group__4__Impl
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
    // InternalAdeptness.g:4055:1: rule__HighTime__Group__4__Impl : ( ( rule__HighTime__UnitAssignment_4 ) ) ;
    public final void rule__HighTime__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4059:1: ( ( ( rule__HighTime__UnitAssignment_4 ) ) )
            // InternalAdeptness.g:4060:1: ( ( rule__HighTime__UnitAssignment_4 ) )
            {
            // InternalAdeptness.g:4060:1: ( ( rule__HighTime__UnitAssignment_4 ) )
            // InternalAdeptness.g:4061:2: ( rule__HighTime__UnitAssignment_4 )
            {
             before(grammarAccess.getHighTimeAccess().getUnitAssignment_4()); 
            // InternalAdeptness.g:4062:2: ( rule__HighTime__UnitAssignment_4 )
            // InternalAdeptness.g:4062:3: rule__HighTime__UnitAssignment_4
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
    // InternalAdeptness.g:4071:1: rule__HighPeak__Group__0 : rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1 ;
    public final void rule__HighPeak__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4075:1: ( rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1 )
            // InternalAdeptness.g:4076:2: rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:4083:1: rule__HighPeak__Group__0__Impl : ( 'confidence is below' ) ;
    public final void rule__HighPeak__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4087:1: ( ( 'confidence is below' ) )
            // InternalAdeptness.g:4088:1: ( 'confidence is below' )
            {
            // InternalAdeptness.g:4088:1: ( 'confidence is below' )
            // InternalAdeptness.g:4089:2: 'confidence is below'
            {
             before(grammarAccess.getHighPeakAccess().getConfidenceIsBelowKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalAdeptness.g:4098:1: rule__HighPeak__Group__1 : rule__HighPeak__Group__1__Impl ;
    public final void rule__HighPeak__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4102:1: ( rule__HighPeak__Group__1__Impl )
            // InternalAdeptness.g:4103:2: rule__HighPeak__Group__1__Impl
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
    // InternalAdeptness.g:4109:1: rule__HighPeak__Group__1__Impl : ( ( rule__HighPeak__CantAssignment_1 ) ) ;
    public final void rule__HighPeak__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4113:1: ( ( ( rule__HighPeak__CantAssignment_1 ) ) )
            // InternalAdeptness.g:4114:1: ( ( rule__HighPeak__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:4114:1: ( ( rule__HighPeak__CantAssignment_1 ) )
            // InternalAdeptness.g:4115:2: ( rule__HighPeak__CantAssignment_1 )
            {
             before(grammarAccess.getHighPeakAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:4116:2: ( rule__HighPeak__CantAssignment_1 )
            // InternalAdeptness.g:4116:3: rule__HighPeak__CantAssignment_1
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
    // InternalAdeptness.g:4125:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4129:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalAdeptness.g:4130:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalAdeptness.g:4137:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__Alternatives_0 ) ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4141:1: ( ( ( rule__Reference__Alternatives_0 ) ) )
            // InternalAdeptness.g:4142:1: ( ( rule__Reference__Alternatives_0 ) )
            {
            // InternalAdeptness.g:4142:1: ( ( rule__Reference__Alternatives_0 ) )
            // InternalAdeptness.g:4143:2: ( rule__Reference__Alternatives_0 )
            {
             before(grammarAccess.getReferenceAccess().getAlternatives_0()); 
            // InternalAdeptness.g:4144:2: ( rule__Reference__Alternatives_0 )
            // InternalAdeptness.g:4144:3: rule__Reference__Alternatives_0
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
    // InternalAdeptness.g:4152:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4156:1: ( rule__Reference__Group__1__Impl )
            // InternalAdeptness.g:4157:2: rule__Reference__Group__1__Impl
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
    // InternalAdeptness.g:4163:1: rule__Reference__Group__1__Impl : ( ';' ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4167:1: ( ( ';' ) )
            // InternalAdeptness.g:4168:1: ( ';' )
            {
            // InternalAdeptness.g:4168:1: ( ';' )
            // InternalAdeptness.g:4169:2: ';'
            {
             before(grammarAccess.getReferenceAccess().getSemicolonKeyword_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalAdeptness.g:4179:1: rule__Same__Group__0 : rule__Same__Group__0__Impl rule__Same__Group__1 ;
    public final void rule__Same__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4183:1: ( rule__Same__Group__0__Impl rule__Same__Group__1 )
            // InternalAdeptness.g:4184:2: rule__Same__Group__0__Impl rule__Same__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:4191:1: rule__Same__Group__0__Impl : ( 'should be' ) ;
    public final void rule__Same__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4195:1: ( ( 'should be' ) )
            // InternalAdeptness.g:4196:1: ( 'should be' )
            {
            // InternalAdeptness.g:4196:1: ( 'should be' )
            // InternalAdeptness.g:4197:2: 'should be'
            {
             before(grammarAccess.getSameAccess().getShouldBeKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalAdeptness.g:4206:1: rule__Same__Group__1 : rule__Same__Group__1__Impl ;
    public final void rule__Same__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4210:1: ( rule__Same__Group__1__Impl )
            // InternalAdeptness.g:4211:2: rule__Same__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Same__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAdeptness.g:4217:1: rule__Same__Group__1__Impl : ( ( rule__Same__Bound_uppAssignment_1 ) ) ;
    public final void rule__Same__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4221:1: ( ( ( rule__Same__Bound_uppAssignment_1 ) ) )
            // InternalAdeptness.g:4222:1: ( ( rule__Same__Bound_uppAssignment_1 ) )
            {
            // InternalAdeptness.g:4222:1: ( ( rule__Same__Bound_uppAssignment_1 ) )
            // InternalAdeptness.g:4223:2: ( rule__Same__Bound_uppAssignment_1 )
            {
             before(grammarAccess.getSameAccess().getBound_uppAssignment_1()); 
            // InternalAdeptness.g:4224:2: ( rule__Same__Bound_uppAssignment_1 )
            // InternalAdeptness.g:4224:3: rule__Same__Bound_uppAssignment_1
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


    // $ANTLR start "rule__NotSame__Group__0"
    // InternalAdeptness.g:4233:1: rule__NotSame__Group__0 : rule__NotSame__Group__0__Impl rule__NotSame__Group__1 ;
    public final void rule__NotSame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4237:1: ( rule__NotSame__Group__0__Impl rule__NotSame__Group__1 )
            // InternalAdeptness.g:4238:2: rule__NotSame__Group__0__Impl rule__NotSame__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:4245:1: rule__NotSame__Group__0__Impl : ( 'should not be' ) ;
    public final void rule__NotSame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4249:1: ( ( 'should not be' ) )
            // InternalAdeptness.g:4250:1: ( 'should not be' )
            {
            // InternalAdeptness.g:4250:1: ( 'should not be' )
            // InternalAdeptness.g:4251:2: 'should not be'
            {
             before(grammarAccess.getNotSameAccess().getShouldNotBeKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalAdeptness.g:4260:1: rule__NotSame__Group__1 : rule__NotSame__Group__1__Impl ;
    public final void rule__NotSame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4264:1: ( rule__NotSame__Group__1__Impl )
            // InternalAdeptness.g:4265:2: rule__NotSame__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotSame__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAdeptness.g:4271:1: rule__NotSame__Group__1__Impl : ( ( rule__NotSame__Bound_uppAssignment_1 ) ) ;
    public final void rule__NotSame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4275:1: ( ( ( rule__NotSame__Bound_uppAssignment_1 ) ) )
            // InternalAdeptness.g:4276:1: ( ( rule__NotSame__Bound_uppAssignment_1 ) )
            {
            // InternalAdeptness.g:4276:1: ( ( rule__NotSame__Bound_uppAssignment_1 ) )
            // InternalAdeptness.g:4277:2: ( rule__NotSame__Bound_uppAssignment_1 )
            {
             before(grammarAccess.getNotSameAccess().getBound_uppAssignment_1()); 
            // InternalAdeptness.g:4278:2: ( rule__NotSame__Bound_uppAssignment_1 )
            // InternalAdeptness.g:4278:3: rule__NotSame__Bound_uppAssignment_1
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


    // $ANTLR start "rule__Upper__Group__0"
    // InternalAdeptness.g:4287:1: rule__Upper__Group__0 : rule__Upper__Group__0__Impl rule__Upper__Group__1 ;
    public final void rule__Upper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4291:1: ( rule__Upper__Group__0__Impl rule__Upper__Group__1 )
            // InternalAdeptness.g:4292:2: rule__Upper__Group__0__Impl rule__Upper__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:4299:1: rule__Upper__Group__0__Impl : ( 'is below' ) ;
    public final void rule__Upper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4303:1: ( ( 'is below' ) )
            // InternalAdeptness.g:4304:1: ( 'is below' )
            {
            // InternalAdeptness.g:4304:1: ( 'is below' )
            // InternalAdeptness.g:4305:2: 'is below'
            {
             before(grammarAccess.getUpperAccess().getIsBelowKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalAdeptness.g:4314:1: rule__Upper__Group__1 : rule__Upper__Group__1__Impl ;
    public final void rule__Upper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4318:1: ( rule__Upper__Group__1__Impl )
            // InternalAdeptness.g:4319:2: rule__Upper__Group__1__Impl
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
    // InternalAdeptness.g:4325:1: rule__Upper__Group__1__Impl : ( ( rule__Upper__Bound_uppAssignment_1 ) ) ;
    public final void rule__Upper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4329:1: ( ( ( rule__Upper__Bound_uppAssignment_1 ) ) )
            // InternalAdeptness.g:4330:1: ( ( rule__Upper__Bound_uppAssignment_1 ) )
            {
            // InternalAdeptness.g:4330:1: ( ( rule__Upper__Bound_uppAssignment_1 ) )
            // InternalAdeptness.g:4331:2: ( rule__Upper__Bound_uppAssignment_1 )
            {
             before(grammarAccess.getUpperAccess().getBound_uppAssignment_1()); 
            // InternalAdeptness.g:4332:2: ( rule__Upper__Bound_uppAssignment_1 )
            // InternalAdeptness.g:4332:3: rule__Upper__Bound_uppAssignment_1
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
    // InternalAdeptness.g:4341:1: rule__Lower__Group__0 : rule__Lower__Group__0__Impl rule__Lower__Group__1 ;
    public final void rule__Lower__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4345:1: ( rule__Lower__Group__0__Impl rule__Lower__Group__1 )
            // InternalAdeptness.g:4346:2: rule__Lower__Group__0__Impl rule__Lower__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:4353:1: rule__Lower__Group__0__Impl : ( 'is above' ) ;
    public final void rule__Lower__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4357:1: ( ( 'is above' ) )
            // InternalAdeptness.g:4358:1: ( 'is above' )
            {
            // InternalAdeptness.g:4358:1: ( 'is above' )
            // InternalAdeptness.g:4359:2: 'is above'
            {
             before(grammarAccess.getLowerAccess().getIsAboveKeyword_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalAdeptness.g:4368:1: rule__Lower__Group__1 : rule__Lower__Group__1__Impl ;
    public final void rule__Lower__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4372:1: ( rule__Lower__Group__1__Impl )
            // InternalAdeptness.g:4373:2: rule__Lower__Group__1__Impl
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
    // InternalAdeptness.g:4379:1: rule__Lower__Group__1__Impl : ( ( rule__Lower__Bound_lowerAssignment_1 ) ) ;
    public final void rule__Lower__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4383:1: ( ( ( rule__Lower__Bound_lowerAssignment_1 ) ) )
            // InternalAdeptness.g:4384:1: ( ( rule__Lower__Bound_lowerAssignment_1 ) )
            {
            // InternalAdeptness.g:4384:1: ( ( rule__Lower__Bound_lowerAssignment_1 ) )
            // InternalAdeptness.g:4385:2: ( rule__Lower__Bound_lowerAssignment_1 )
            {
             before(grammarAccess.getLowerAccess().getBound_lowerAssignment_1()); 
            // InternalAdeptness.g:4386:2: ( rule__Lower__Bound_lowerAssignment_1 )
            // InternalAdeptness.g:4386:3: rule__Lower__Bound_lowerAssignment_1
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
    // InternalAdeptness.g:4395:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4399:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // InternalAdeptness.g:4400:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:4407:1: rule__Range__Group__0__Impl : ( 'is in range between' ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4411:1: ( ( 'is in range between' ) )
            // InternalAdeptness.g:4412:1: ( 'is in range between' )
            {
            // InternalAdeptness.g:4412:1: ( 'is in range between' )
            // InternalAdeptness.g:4413:2: 'is in range between'
            {
             before(grammarAccess.getRangeAccess().getIsInRangeBetweenKeyword_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalAdeptness.g:4422:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4426:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // InternalAdeptness.g:4427:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalAdeptness.g:4434:1: rule__Range__Group__1__Impl : ( ( rule__Range__Bound_lowerAssignment_1 ) ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4438:1: ( ( ( rule__Range__Bound_lowerAssignment_1 ) ) )
            // InternalAdeptness.g:4439:1: ( ( rule__Range__Bound_lowerAssignment_1 ) )
            {
            // InternalAdeptness.g:4439:1: ( ( rule__Range__Bound_lowerAssignment_1 ) )
            // InternalAdeptness.g:4440:2: ( rule__Range__Bound_lowerAssignment_1 )
            {
             before(grammarAccess.getRangeAccess().getBound_lowerAssignment_1()); 
            // InternalAdeptness.g:4441:2: ( rule__Range__Bound_lowerAssignment_1 )
            // InternalAdeptness.g:4441:3: rule__Range__Bound_lowerAssignment_1
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
    // InternalAdeptness.g:4449:1: rule__Range__Group__2 : rule__Range__Group__2__Impl rule__Range__Group__3 ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4453:1: ( rule__Range__Group__2__Impl rule__Range__Group__3 )
            // InternalAdeptness.g:4454:2: rule__Range__Group__2__Impl rule__Range__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:4461:1: rule__Range__Group__2__Impl : ( 'and' ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4465:1: ( ( 'and' ) )
            // InternalAdeptness.g:4466:1: ( 'and' )
            {
            // InternalAdeptness.g:4466:1: ( 'and' )
            // InternalAdeptness.g:4467:2: 'and'
            {
             before(grammarAccess.getRangeAccess().getAndKeyword_2()); 
            match(input,64,FOLLOW_2); 
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
    // InternalAdeptness.g:4476:1: rule__Range__Group__3 : rule__Range__Group__3__Impl ;
    public final void rule__Range__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4480:1: ( rule__Range__Group__3__Impl )
            // InternalAdeptness.g:4481:2: rule__Range__Group__3__Impl
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
    // InternalAdeptness.g:4487:1: rule__Range__Group__3__Impl : ( ( rule__Range__Bound_uppAssignment_3 ) ) ;
    public final void rule__Range__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4491:1: ( ( ( rule__Range__Bound_uppAssignment_3 ) ) )
            // InternalAdeptness.g:4492:1: ( ( rule__Range__Bound_uppAssignment_3 ) )
            {
            // InternalAdeptness.g:4492:1: ( ( rule__Range__Bound_uppAssignment_3 ) )
            // InternalAdeptness.g:4493:2: ( rule__Range__Bound_uppAssignment_3 )
            {
             before(grammarAccess.getRangeAccess().getBound_uppAssignment_3()); 
            // InternalAdeptness.g:4494:2: ( rule__Range__Bound_uppAssignment_3 )
            // InternalAdeptness.g:4494:3: rule__Range__Bound_uppAssignment_3
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
    // InternalAdeptness.g:4503:1: rule__Gap__Group__0 : rule__Gap__Group__0__Impl rule__Gap__Group__1 ;
    public final void rule__Gap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4507:1: ( rule__Gap__Group__0__Impl rule__Gap__Group__1 )
            // InternalAdeptness.g:4508:2: rule__Gap__Group__0__Impl rule__Gap__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:4515:1: rule__Gap__Group__0__Impl : ( 'not in range between' ) ;
    public final void rule__Gap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4519:1: ( ( 'not in range between' ) )
            // InternalAdeptness.g:4520:1: ( 'not in range between' )
            {
            // InternalAdeptness.g:4520:1: ( 'not in range between' )
            // InternalAdeptness.g:4521:2: 'not in range between'
            {
             before(grammarAccess.getGapAccess().getNotInRangeBetweenKeyword_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalAdeptness.g:4530:1: rule__Gap__Group__1 : rule__Gap__Group__1__Impl rule__Gap__Group__2 ;
    public final void rule__Gap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4534:1: ( rule__Gap__Group__1__Impl rule__Gap__Group__2 )
            // InternalAdeptness.g:4535:2: rule__Gap__Group__1__Impl rule__Gap__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalAdeptness.g:4542:1: rule__Gap__Group__1__Impl : ( ( rule__Gap__Bound_lowerAssignment_1 ) ) ;
    public final void rule__Gap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4546:1: ( ( ( rule__Gap__Bound_lowerAssignment_1 ) ) )
            // InternalAdeptness.g:4547:1: ( ( rule__Gap__Bound_lowerAssignment_1 ) )
            {
            // InternalAdeptness.g:4547:1: ( ( rule__Gap__Bound_lowerAssignment_1 ) )
            // InternalAdeptness.g:4548:2: ( rule__Gap__Bound_lowerAssignment_1 )
            {
             before(grammarAccess.getGapAccess().getBound_lowerAssignment_1()); 
            // InternalAdeptness.g:4549:2: ( rule__Gap__Bound_lowerAssignment_1 )
            // InternalAdeptness.g:4549:3: rule__Gap__Bound_lowerAssignment_1
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
    // InternalAdeptness.g:4557:1: rule__Gap__Group__2 : rule__Gap__Group__2__Impl rule__Gap__Group__3 ;
    public final void rule__Gap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4561:1: ( rule__Gap__Group__2__Impl rule__Gap__Group__3 )
            // InternalAdeptness.g:4562:2: rule__Gap__Group__2__Impl rule__Gap__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:4569:1: rule__Gap__Group__2__Impl : ( 'and' ) ;
    public final void rule__Gap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4573:1: ( ( 'and' ) )
            // InternalAdeptness.g:4574:1: ( 'and' )
            {
            // InternalAdeptness.g:4574:1: ( 'and' )
            // InternalAdeptness.g:4575:2: 'and'
            {
             before(grammarAccess.getGapAccess().getAndKeyword_2()); 
            match(input,64,FOLLOW_2); 
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
    // InternalAdeptness.g:4584:1: rule__Gap__Group__3 : rule__Gap__Group__3__Impl ;
    public final void rule__Gap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4588:1: ( rule__Gap__Group__3__Impl )
            // InternalAdeptness.g:4589:2: rule__Gap__Group__3__Impl
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
    // InternalAdeptness.g:4595:1: rule__Gap__Group__3__Impl : ( ( rule__Gap__Bound_uppAssignment_3 ) ) ;
    public final void rule__Gap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4599:1: ( ( ( rule__Gap__Bound_uppAssignment_3 ) ) )
            // InternalAdeptness.g:4600:1: ( ( rule__Gap__Bound_uppAssignment_3 ) )
            {
            // InternalAdeptness.g:4600:1: ( ( rule__Gap__Bound_uppAssignment_3 ) )
            // InternalAdeptness.g:4601:2: ( rule__Gap__Bound_uppAssignment_3 )
            {
             before(grammarAccess.getGapAccess().getBound_uppAssignment_3()); 
            // InternalAdeptness.g:4602:2: ( rule__Gap__Bound_uppAssignment_3 )
            // InternalAdeptness.g:4602:3: rule__Gap__Bound_uppAssignment_3
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
    // InternalAdeptness.g:4611:1: rule__D__Group__0 : rule__D__Group__0__Impl rule__D__Group__1 ;
    public final void rule__D__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4615:1: ( rule__D__Group__0__Impl rule__D__Group__1 )
            // InternalAdeptness.g:4616:2: rule__D__Group__0__Impl rule__D__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:4623:1: rule__D__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__D__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4627:1: ( ( ( '-' )? ) )
            // InternalAdeptness.g:4628:1: ( ( '-' )? )
            {
            // InternalAdeptness.g:4628:1: ( ( '-' )? )
            // InternalAdeptness.g:4629:2: ( '-' )?
            {
             before(grammarAccess.getDAccess().getHyphenMinusKeyword_0()); 
            // InternalAdeptness.g:4630:2: ( '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==24) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAdeptness.g:4630:3: '-'
                    {
                    match(input,24,FOLLOW_2); 

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
    // InternalAdeptness.g:4638:1: rule__D__Group__1 : rule__D__Group__1__Impl rule__D__Group__2 ;
    public final void rule__D__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4642:1: ( rule__D__Group__1__Impl rule__D__Group__2 )
            // InternalAdeptness.g:4643:2: rule__D__Group__1__Impl rule__D__Group__2
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
    // InternalAdeptness.g:4650:1: rule__D__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__D__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4654:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:4655:1: ( RULE_INT )
            {
            // InternalAdeptness.g:4655:1: ( RULE_INT )
            // InternalAdeptness.g:4656:2: RULE_INT
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
    // InternalAdeptness.g:4665:1: rule__D__Group__2 : rule__D__Group__2__Impl ;
    public final void rule__D__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4669:1: ( rule__D__Group__2__Impl )
            // InternalAdeptness.g:4670:2: rule__D__Group__2__Impl
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
    // InternalAdeptness.g:4676:1: rule__D__Group__2__Impl : ( ( rule__D__Group_2__0 )? ) ;
    public final void rule__D__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4680:1: ( ( ( rule__D__Group_2__0 )? ) )
            // InternalAdeptness.g:4681:1: ( ( rule__D__Group_2__0 )? )
            {
            // InternalAdeptness.g:4681:1: ( ( rule__D__Group_2__0 )? )
            // InternalAdeptness.g:4682:2: ( rule__D__Group_2__0 )?
            {
             before(grammarAccess.getDAccess().getGroup_2()); 
            // InternalAdeptness.g:4683:2: ( rule__D__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAdeptness.g:4683:3: rule__D__Group_2__0
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
    // InternalAdeptness.g:4692:1: rule__D__Group_2__0 : rule__D__Group_2__0__Impl rule__D__Group_2__1 ;
    public final void rule__D__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4696:1: ( rule__D__Group_2__0__Impl rule__D__Group_2__1 )
            // InternalAdeptness.g:4697:2: rule__D__Group_2__0__Impl rule__D__Group_2__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAdeptness.g:4704:1: rule__D__Group_2__0__Impl : ( '.' ) ;
    public final void rule__D__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4708:1: ( ( '.' ) )
            // InternalAdeptness.g:4709:1: ( '.' )
            {
            // InternalAdeptness.g:4709:1: ( '.' )
            // InternalAdeptness.g:4710:2: '.'
            {
             before(grammarAccess.getDAccess().getFullStopKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalAdeptness.g:4719:1: rule__D__Group_2__1 : rule__D__Group_2__1__Impl ;
    public final void rule__D__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4723:1: ( rule__D__Group_2__1__Impl )
            // InternalAdeptness.g:4724:2: rule__D__Group_2__1__Impl
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
    // InternalAdeptness.g:4730:1: rule__D__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__D__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4734:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:4735:1: ( RULE_INT )
            {
            // InternalAdeptness.g:4735:1: ( RULE_INT )
            // InternalAdeptness.g:4736:2: RULE_INT
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
    // InternalAdeptness.g:4746:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4750:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalAdeptness.g:4751:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
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
    // InternalAdeptness.g:4758:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4762:1: ( ( 'datatype' ) )
            // InternalAdeptness.g:4763:1: ( 'datatype' )
            {
            // InternalAdeptness.g:4763:1: ( 'datatype' )
            // InternalAdeptness.g:4764:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalAdeptness.g:4773:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4777:1: ( rule__DataType__Group__1__Impl )
            // InternalAdeptness.g:4778:2: rule__DataType__Group__1__Impl
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
    // InternalAdeptness.g:4784:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4788:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalAdeptness.g:4789:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:4789:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalAdeptness.g:4790:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:4791:2: ( rule__DataType__NameAssignment_1 )
            // InternalAdeptness.g:4791:3: rule__DataType__NameAssignment_1
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
    // InternalAdeptness.g:4800:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4804:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // InternalAdeptness.g:4805:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
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
    // InternalAdeptness.g:4812:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4816:1: ( ( 'package' ) )
            // InternalAdeptness.g:4817:1: ( 'package' )
            {
            // InternalAdeptness.g:4817:1: ( 'package' )
            // InternalAdeptness.g:4818:2: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalAdeptness.g:4827:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4831:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // InternalAdeptness.g:4832:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalAdeptness.g:4839:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4843:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // InternalAdeptness.g:4844:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:4844:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // InternalAdeptness.g:4845:2: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:4846:2: ( rule__PackageDeclaration__NameAssignment_1 )
            // InternalAdeptness.g:4846:3: rule__PackageDeclaration__NameAssignment_1
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
    // InternalAdeptness.g:4854:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4858:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // InternalAdeptness.g:4859:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalAdeptness.g:4866:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4870:1: ( ( '{' ) )
            // InternalAdeptness.g:4871:1: ( '{' )
            {
            // InternalAdeptness.g:4871:1: ( '{' )
            // InternalAdeptness.g:4872:2: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,68,FOLLOW_2); 
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
    // InternalAdeptness.g:4881:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4885:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // InternalAdeptness.g:4886:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalAdeptness.g:4893:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4897:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) )
            // InternalAdeptness.g:4898:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            {
            // InternalAdeptness.g:4898:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            // InternalAdeptness.g:4899:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 
            // InternalAdeptness.g:4900:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==27||LA33_0==30||LA33_0==38||(LA33_0>=66 && LA33_0<=67)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAdeptness.g:4900:3: rule__PackageDeclaration__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__PackageDeclaration__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalAdeptness.g:4908:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4912:1: ( rule__PackageDeclaration__Group__4__Impl )
            // InternalAdeptness.g:4913:2: rule__PackageDeclaration__Group__4__Impl
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
    // InternalAdeptness.g:4919:1: rule__PackageDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4923:1: ( ( '}' ) )
            // InternalAdeptness.g:4924:1: ( '}' )
            {
            // InternalAdeptness.g:4924:1: ( '}' )
            // InternalAdeptness.g:4925:2: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,69,FOLLOW_2); 
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
    // InternalAdeptness.g:4935:1: rule__AbstractElement2__Group__0 : rule__AbstractElement2__Group__0__Impl rule__AbstractElement2__Group__1 ;
    public final void rule__AbstractElement2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4939:1: ( rule__AbstractElement2__Group__0__Impl rule__AbstractElement2__Group__1 )
            // InternalAdeptness.g:4940:2: rule__AbstractElement2__Group__0__Impl rule__AbstractElement2__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:4947:1: rule__AbstractElement2__Group__0__Impl : ( ( rule__AbstractElement2__FrontParenthesesAssignment_0 )* ) ;
    public final void rule__AbstractElement2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4951:1: ( ( ( rule__AbstractElement2__FrontParenthesesAssignment_0 )* ) )
            // InternalAdeptness.g:4952:1: ( ( rule__AbstractElement2__FrontParenthesesAssignment_0 )* )
            {
            // InternalAdeptness.g:4952:1: ( ( rule__AbstractElement2__FrontParenthesesAssignment_0 )* )
            // InternalAdeptness.g:4953:2: ( rule__AbstractElement2__FrontParenthesesAssignment_0 )*
            {
             before(grammarAccess.getAbstractElement2Access().getFrontParenthesesAssignment_0()); 
            // InternalAdeptness.g:4954:2: ( rule__AbstractElement2__FrontParenthesesAssignment_0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==11) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalAdeptness.g:4954:3: rule__AbstractElement2__FrontParenthesesAssignment_0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__AbstractElement2__FrontParenthesesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalAdeptness.g:4962:1: rule__AbstractElement2__Group__1 : rule__AbstractElement2__Group__1__Impl rule__AbstractElement2__Group__2 ;
    public final void rule__AbstractElement2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4966:1: ( rule__AbstractElement2__Group__1__Impl rule__AbstractElement2__Group__2 )
            // InternalAdeptness.g:4967:2: rule__AbstractElement2__Group__1__Impl rule__AbstractElement2__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalAdeptness.g:4974:1: rule__AbstractElement2__Group__1__Impl : ( ( rule__AbstractElement2__Alternatives_1 ) ) ;
    public final void rule__AbstractElement2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4978:1: ( ( ( rule__AbstractElement2__Alternatives_1 ) ) )
            // InternalAdeptness.g:4979:1: ( ( rule__AbstractElement2__Alternatives_1 ) )
            {
            // InternalAdeptness.g:4979:1: ( ( rule__AbstractElement2__Alternatives_1 ) )
            // InternalAdeptness.g:4980:2: ( rule__AbstractElement2__Alternatives_1 )
            {
             before(grammarAccess.getAbstractElement2Access().getAlternatives_1()); 
            // InternalAdeptness.g:4981:2: ( rule__AbstractElement2__Alternatives_1 )
            // InternalAdeptness.g:4981:3: rule__AbstractElement2__Alternatives_1
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
    // InternalAdeptness.g:4989:1: rule__AbstractElement2__Group__2 : rule__AbstractElement2__Group__2__Impl ;
    public final void rule__AbstractElement2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4993:1: ( rule__AbstractElement2__Group__2__Impl )
            // InternalAdeptness.g:4994:2: rule__AbstractElement2__Group__2__Impl
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
    // InternalAdeptness.g:5000:1: rule__AbstractElement2__Group__2__Impl : ( ( rule__AbstractElement2__OpAssignment_2 )* ) ;
    public final void rule__AbstractElement2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5004:1: ( ( ( rule__AbstractElement2__OpAssignment_2 )* ) )
            // InternalAdeptness.g:5005:1: ( ( rule__AbstractElement2__OpAssignment_2 )* )
            {
            // InternalAdeptness.g:5005:1: ( ( rule__AbstractElement2__OpAssignment_2 )* )
            // InternalAdeptness.g:5006:2: ( rule__AbstractElement2__OpAssignment_2 )*
            {
             before(grammarAccess.getAbstractElement2Access().getOpAssignment_2()); 
            // InternalAdeptness.g:5007:2: ( rule__AbstractElement2__OpAssignment_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==12||(LA35_0>=15 && LA35_0<=26)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAdeptness.g:5007:3: rule__AbstractElement2__OpAssignment_2
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__AbstractElement2__OpAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalAdeptness.g:5016:1: rule__Adeptness__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Adeptness__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5020:1: ( ( ruleAbstractElement ) )
            // InternalAdeptness.g:5021:2: ( ruleAbstractElement )
            {
            // InternalAdeptness.g:5021:2: ( ruleAbstractElement )
            // InternalAdeptness.g:5022:3: ruleAbstractElement
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
    // InternalAdeptness.g:5031:1: rule__Imports__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Imports__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5035:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalAdeptness.g:5036:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalAdeptness.g:5036:2: ( ruleQualifiedNameWithWildcard )
            // InternalAdeptness.g:5037:3: ruleQualifiedNameWithWildcard
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


    // $ANTLR start "rule__MonitoringFile__NameAssignment_1"
    // InternalAdeptness.g:5046:1: rule__MonitoringFile__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MonitoringFile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5050:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:5051:2: ( RULE_ID )
            {
            // InternalAdeptness.g:5051:2: ( RULE_ID )
            // InternalAdeptness.g:5052:3: RULE_ID
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
    // InternalAdeptness.g:5061:1: rule__MonitoringFile__MonitoringPlanAssignment_3 : ( ruleMonitoringPlan ) ;
    public final void rule__MonitoringFile__MonitoringPlanAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5065:1: ( ( ruleMonitoringPlan ) )
            // InternalAdeptness.g:5066:2: ( ruleMonitoringPlan )
            {
            // InternalAdeptness.g:5066:2: ( ruleMonitoringPlan )
            // InternalAdeptness.g:5067:3: ruleMonitoringPlan
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
    // InternalAdeptness.g:5076:1: rule__MonitoringPlan__MonitoringVariablesAssignment : ( ruleMonitoringVariable ) ;
    public final void rule__MonitoringPlan__MonitoringVariablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5080:1: ( ( ruleMonitoringVariable ) )
            // InternalAdeptness.g:5081:2: ( ruleMonitoringVariable )
            {
            // InternalAdeptness.g:5081:2: ( ruleMonitoringVariable )
            // InternalAdeptness.g:5082:3: ruleMonitoringVariable
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
    // InternalAdeptness.g:5091:1: rule__MonitoringVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MonitoringVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5095:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:5096:2: ( RULE_ID )
            {
            // InternalAdeptness.g:5096:2: ( RULE_ID )
            // InternalAdeptness.g:5097:3: RULE_ID
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
    // InternalAdeptness.g:5106:1: rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 : ( ruleSig_type ) ;
    public final void rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5110:1: ( ( ruleSig_type ) )
            // InternalAdeptness.g:5111:2: ( ruleSig_type )
            {
            // InternalAdeptness.g:5111:2: ( ruleSig_type )
            // InternalAdeptness.g:5112:3: ruleSig_type
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
    // InternalAdeptness.g:5121:1: rule__MonitoringVariable__MaxAssignment_6_2 : ( ruleDOUBLE ) ;
    public final void rule__MonitoringVariable__MaxAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5125:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:5126:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:5126:2: ( ruleDOUBLE )
            // InternalAdeptness.g:5127:3: ruleDOUBLE
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
    // InternalAdeptness.g:5136:1: rule__MonitoringVariable__MinAssignment_6_5 : ( ruleDOUBLE ) ;
    public final void rule__MonitoringVariable__MinAssignment_6_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5140:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:5141:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:5141:2: ( ruleDOUBLE )
            // InternalAdeptness.g:5142:3: ruleDOUBLE
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
    // InternalAdeptness.g:5151:1: rule__Sig_type__Sig_typeAssignment_0 : ( ( 'boolean' ) ) ;
    public final void rule__Sig_type__Sig_typeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5155:1: ( ( ( 'boolean' ) ) )
            // InternalAdeptness.g:5156:2: ( ( 'boolean' ) )
            {
            // InternalAdeptness.g:5156:2: ( ( 'boolean' ) )
            // InternalAdeptness.g:5157:3: ( 'boolean' )
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeBooleanKeyword_0_0()); 
            // InternalAdeptness.g:5158:3: ( 'boolean' )
            // InternalAdeptness.g:5159:4: 'boolean'
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeBooleanKeyword_0_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalAdeptness.g:5170:1: rule__Sig_type__Sig_typeAssignment_1 : ( ( 'int' ) ) ;
    public final void rule__Sig_type__Sig_typeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5174:1: ( ( ( 'int' ) ) )
            // InternalAdeptness.g:5175:2: ( ( 'int' ) )
            {
            // InternalAdeptness.g:5175:2: ( ( 'int' ) )
            // InternalAdeptness.g:5176:3: ( 'int' )
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeIntKeyword_1_0()); 
            // InternalAdeptness.g:5177:3: ( 'int' )
            // InternalAdeptness.g:5178:4: 'int'
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeIntKeyword_1_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalAdeptness.g:5189:1: rule__Sig_type__Sig_typeAssignment_2 : ( ( 'double' ) ) ;
    public final void rule__Sig_type__Sig_typeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5193:1: ( ( ( 'double' ) ) )
            // InternalAdeptness.g:5194:2: ( ( 'double' ) )
            {
            // InternalAdeptness.g:5194:2: ( ( 'double' ) )
            // InternalAdeptness.g:5195:3: ( 'double' )
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeDoubleKeyword_2_0()); 
            // InternalAdeptness.g:5196:3: ( 'double' )
            // InternalAdeptness.g:5197:4: 'double'
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeDoubleKeyword_2_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalAdeptness.g:5208:1: rule__Signal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5212:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:5213:2: ( RULE_ID )
            {
            // InternalAdeptness.g:5213:2: ( RULE_ID )
            // InternalAdeptness.g:5214:3: RULE_ID
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
    // InternalAdeptness.g:5223:1: rule__Signal__CardinalityNumCPSAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Signal__CardinalityNumCPSAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5227:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:5228:2: ( RULE_INT )
            {
            // InternalAdeptness.g:5228:2: ( RULE_INT )
            // InternalAdeptness.g:5229:3: RULE_INT
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
    // InternalAdeptness.g:5238:1: rule__Signal__SuperTypeAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Signal__SuperTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5242:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAdeptness.g:5243:2: ( ( ruleQualifiedName ) )
            {
            // InternalAdeptness.g:5243:2: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:5244:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSignalAccess().getSuperTypeMonitoringFileCrossReference_4_1_0()); 
            // InternalAdeptness.g:5245:3: ( ruleQualifiedName )
            // InternalAdeptness.g:5246:4: ruleQualifiedName
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
    // InternalAdeptness.g:5257:1: rule__Signal__OracleAssignment_5 : ( ruleOracle ) ;
    public final void rule__Signal__OracleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5261:1: ( ( ruleOracle ) )
            // InternalAdeptness.g:5262:2: ( ruleOracle )
            {
            // InternalAdeptness.g:5262:2: ( ruleOracle )
            // InternalAdeptness.g:5263:3: ruleOracle
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
    // InternalAdeptness.g:5272:1: rule__Oracle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Oracle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5276:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:5277:2: ( RULE_ID )
            {
            // InternalAdeptness.g:5277:2: ( RULE_ID )
            // InternalAdeptness.g:5278:3: RULE_ID
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
    // InternalAdeptness.g:5287:1: rule__Oracle__WhenAssignment_3_0 : ( ruleWhen ) ;
    public final void rule__Oracle__WhenAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5291:1: ( ( ruleWhen ) )
            // InternalAdeptness.g:5292:2: ( ruleWhen )
            {
            // InternalAdeptness.g:5292:2: ( ruleWhen )
            // InternalAdeptness.g:5293:3: ruleWhen
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
    // InternalAdeptness.g:5302:1: rule__Oracle__WhileAssignment_3_1 : ( ruleWhile ) ;
    public final void rule__Oracle__WhileAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5306:1: ( ( ruleWhile ) )
            // InternalAdeptness.g:5307:2: ( ruleWhile )
            {
            // InternalAdeptness.g:5307:2: ( ruleWhile )
            // InternalAdeptness.g:5308:3: ruleWhile
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
    // InternalAdeptness.g:5317:1: rule__Oracle__CheckAssignment_4 : ( ruleChecks ) ;
    public final void rule__Oracle__CheckAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5321:1: ( ( ruleChecks ) )
            // InternalAdeptness.g:5322:2: ( ruleChecks )
            {
            // InternalAdeptness.g:5322:2: ( ruleChecks )
            // InternalAdeptness.g:5323:3: ruleChecks
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
    // InternalAdeptness.g:5332:1: rule__While__EmAssignment_1 : ( ruleExpressionsModel ) ;
    public final void rule__While__EmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5336:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:5337:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:5337:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:5338:3: ruleExpressionsModel
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
    // InternalAdeptness.g:5347:1: rule__When__EmAssignment_1 : ( ruleExpressionsModel ) ;
    public final void rule__When__EmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5351:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:5352:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:5352:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:5353:3: ruleExpressionsModel
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
    // InternalAdeptness.g:5362:1: rule__When__AwAssignment_2 : ( ruleAfterWhen ) ;
    public final void rule__When__AwAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5366:1: ( ( ruleAfterWhen ) )
            // InternalAdeptness.g:5367:2: ( ruleAfterWhen )
            {
            // InternalAdeptness.g:5367:2: ( ruleAfterWhen )
            // InternalAdeptness.g:5368:3: ruleAfterWhen
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
    // InternalAdeptness.g:5377:1: rule__AfterWhen__WaitAssignment_0 : ( ruleWait ) ;
    public final void rule__AfterWhen__WaitAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5381:1: ( ( ruleWait ) )
            // InternalAdeptness.g:5382:2: ( ruleWait )
            {
            // InternalAdeptness.g:5382:2: ( ruleWait )
            // InternalAdeptness.g:5383:3: ruleWait
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
    // InternalAdeptness.g:5392:1: rule__AfterWhen__DuringAssignment_1 : ( ruleDuring ) ;
    public final void rule__AfterWhen__DuringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5396:1: ( ( ruleDuring ) )
            // InternalAdeptness.g:5397:2: ( ruleDuring )
            {
            // InternalAdeptness.g:5397:2: ( ruleDuring )
            // InternalAdeptness.g:5398:3: ruleDuring
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
    // InternalAdeptness.g:5407:1: rule__Wait__TimeAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Wait__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5411:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:5412:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:5412:2: ( ruleDOUBLE )
            // InternalAdeptness.g:5413:3: ruleDOUBLE
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
    // InternalAdeptness.g:5422:1: rule__Wait__UnitAssignment_3 : ( ruleTimeType ) ;
    public final void rule__Wait__UnitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5426:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:5427:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:5427:2: ( ruleTimeType )
            // InternalAdeptness.g:5428:3: ruleTimeType
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
    // InternalAdeptness.g:5437:1: rule__During__TimeAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__During__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5441:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:5442:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:5442:2: ( ruleDOUBLE )
            // InternalAdeptness.g:5443:3: ruleDOUBLE
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
    // InternalAdeptness.g:5452:1: rule__During__UnitAssignment_3 : ( ruleTimeType ) ;
    public final void rule__During__UnitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5456:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:5457:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:5457:2: ( ruleTimeType )
            // InternalAdeptness.g:5458:3: ruleTimeType
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
    // InternalAdeptness.g:5467:1: rule__Checks__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Checks__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5471:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:5472:2: ( RULE_ID )
            {
            // InternalAdeptness.g:5472:2: ( RULE_ID )
            // InternalAdeptness.g:5473:3: RULE_ID
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
    // InternalAdeptness.g:5482:1: rule__Checks__EmAssignment_1_1 : ( ruleExpressionsModel ) ;
    public final void rule__Checks__EmAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5486:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:5487:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:5487:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:5488:3: ruleExpressionsModel
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
    // InternalAdeptness.g:5497:1: rule__Checks__ReferenceAssignment_2 : ( ruleReference ) ;
    public final void rule__Checks__ReferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5501:1: ( ( ruleReference ) )
            // InternalAdeptness.g:5502:2: ( ruleReference )
            {
            // InternalAdeptness.g:5502:2: ( ruleReference )
            // InternalAdeptness.g:5503:3: ruleReference
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
    // InternalAdeptness.g:5512:1: rule__Checks__FailReasonAssignment_3 : ( ruleFailReason ) ;
    public final void rule__Checks__FailReasonAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5516:1: ( ( ruleFailReason ) )
            // InternalAdeptness.g:5517:2: ( ruleFailReason )
            {
            // InternalAdeptness.g:5517:2: ( ruleFailReason )
            // InternalAdeptness.g:5518:3: ruleFailReason
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
    // InternalAdeptness.g:5527:1: rule__Checks__DescriptionAssignment_4 : ( ruleDescription ) ;
    public final void rule__Checks__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5531:1: ( ( ruleDescription ) )
            // InternalAdeptness.g:5532:2: ( ruleDescription )
            {
            // InternalAdeptness.g:5532:2: ( ruleDescription )
            // InternalAdeptness.g:5533:3: ruleDescription
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
    // InternalAdeptness.g:5542:1: rule__Description__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5546:1: ( ( RULE_STRING ) )
            // InternalAdeptness.g:5547:2: ( RULE_STRING )
            {
            // InternalAdeptness.g:5547:2: ( RULE_STRING )
            // InternalAdeptness.g:5548:3: RULE_STRING
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
    // InternalAdeptness.g:5557:1: rule__FailReason__ReasonAssignment_1 : ( ruleReason ) ;
    public final void rule__FailReason__ReasonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5561:1: ( ( ruleReason ) )
            // InternalAdeptness.g:5562:2: ( ruleReason )
            {
            // InternalAdeptness.g:5562:2: ( ruleReason )
            // InternalAdeptness.g:5563:3: ruleReason
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
    // InternalAdeptness.g:5572:1: rule__Reason__HighPeakAssignment_0_0 : ( ruleHighPeak ) ;
    public final void rule__Reason__HighPeakAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5576:1: ( ( ruleHighPeak ) )
            // InternalAdeptness.g:5577:2: ( ruleHighPeak )
            {
            // InternalAdeptness.g:5577:2: ( ruleHighPeak )
            // InternalAdeptness.g:5578:3: ruleHighPeak
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
    // InternalAdeptness.g:5587:1: rule__Reason__HighTimeAssignment_0_1 : ( ruleHighTime ) ;
    public final void rule__Reason__HighTimeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5591:1: ( ( ruleHighTime ) )
            // InternalAdeptness.g:5592:2: ( ruleHighTime )
            {
            // InternalAdeptness.g:5592:2: ( ruleHighTime )
            // InternalAdeptness.g:5593:3: ruleHighTime
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
    // InternalAdeptness.g:5602:1: rule__Reason__ConstDegAssignment_0_2 : ( ruleConstDeg ) ;
    public final void rule__Reason__ConstDegAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5606:1: ( ( ruleConstDeg ) )
            // InternalAdeptness.g:5607:2: ( ruleConstDeg )
            {
            // InternalAdeptness.g:5607:2: ( ruleConstDeg )
            // InternalAdeptness.g:5608:3: ruleConstDeg
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
    // InternalAdeptness.g:5617:1: rule__Reason__XPeaksAssignment_0_3 : ( ruleXPeaks ) ;
    public final void rule__Reason__XPeaksAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5621:1: ( ( ruleXPeaks ) )
            // InternalAdeptness.g:5622:2: ( ruleXPeaks )
            {
            // InternalAdeptness.g:5622:2: ( ruleXPeaks )
            // InternalAdeptness.g:5623:3: ruleXPeaks
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
    // InternalAdeptness.g:5632:1: rule__XPeaks__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__XPeaks__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5636:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:5637:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:5637:2: ( ruleDOUBLE )
            // InternalAdeptness.g:5638:3: ruleDOUBLE
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
    // InternalAdeptness.g:5647:1: rule__XPeaks__NPeaksAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__XPeaks__NPeaksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5651:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:5652:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:5652:2: ( ruleDOUBLE )
            // InternalAdeptness.g:5653:3: ruleDOUBLE
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
    // InternalAdeptness.g:5662:1: rule__XPeaks__TimeAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__XPeaks__TimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5666:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:5667:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:5667:2: ( ruleDOUBLE )
            // InternalAdeptness.g:5668:3: ruleDOUBLE
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
    // InternalAdeptness.g:5677:1: rule__XPeaks__UnitAssignment_6 : ( ruleTimeType ) ;
    public final void rule__XPeaks__UnitAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5681:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:5682:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:5682:2: ( ruleTimeType )
            // InternalAdeptness.g:5683:3: ruleTimeType
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
    // InternalAdeptness.g:5692:1: rule__ConstDeg__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__ConstDeg__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5696:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:5697:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:5697:2: ( ruleDOUBLE )
            // InternalAdeptness.g:5698:3: ruleDOUBLE
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
    // InternalAdeptness.g:5707:1: rule__HighTime__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__HighTime__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5711:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:5712:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:5712:2: ( ruleDOUBLE )
            // InternalAdeptness.g:5713:3: ruleDOUBLE
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
    // InternalAdeptness.g:5722:1: rule__HighTime__TimeAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__HighTime__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5726:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:5727:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:5727:2: ( ruleDOUBLE )
            // InternalAdeptness.g:5728:3: ruleDOUBLE
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
    // InternalAdeptness.g:5737:1: rule__HighTime__UnitAssignment_4 : ( ruleTimeType ) ;
    public final void rule__HighTime__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5741:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:5742:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:5742:2: ( ruleTimeType )
            // InternalAdeptness.g:5743:3: ruleTimeType
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
    // InternalAdeptness.g:5752:1: rule__HighPeak__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__HighPeak__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5756:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:5757:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:5757:2: ( ruleDOUBLE )
            // InternalAdeptness.g:5758:3: ruleDOUBLE
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
    // InternalAdeptness.g:5767:1: rule__Reference__UpperAssignment_0_0 : ( ruleUpper ) ;
    public final void rule__Reference__UpperAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5771:1: ( ( ruleUpper ) )
            // InternalAdeptness.g:5772:2: ( ruleUpper )
            {
            // InternalAdeptness.g:5772:2: ( ruleUpper )
            // InternalAdeptness.g:5773:3: ruleUpper
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
    // InternalAdeptness.g:5782:1: rule__Reference__LowerAssignment_0_1 : ( ruleLower ) ;
    public final void rule__Reference__LowerAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5786:1: ( ( ruleLower ) )
            // InternalAdeptness.g:5787:2: ( ruleLower )
            {
            // InternalAdeptness.g:5787:2: ( ruleLower )
            // InternalAdeptness.g:5788:3: ruleLower
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
    // InternalAdeptness.g:5797:1: rule__Reference__RangeAssignment_0_2 : ( ruleRange ) ;
    public final void rule__Reference__RangeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5801:1: ( ( ruleRange ) )
            // InternalAdeptness.g:5802:2: ( ruleRange )
            {
            // InternalAdeptness.g:5802:2: ( ruleRange )
            // InternalAdeptness.g:5803:3: ruleRange
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
    // InternalAdeptness.g:5812:1: rule__Reference__GapAssignment_0_3 : ( ruleGap ) ;
    public final void rule__Reference__GapAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5816:1: ( ( ruleGap ) )
            // InternalAdeptness.g:5817:2: ( ruleGap )
            {
            // InternalAdeptness.g:5817:2: ( ruleGap )
            // InternalAdeptness.g:5818:3: ruleGap
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
    // InternalAdeptness.g:5827:1: rule__Reference__SameAssignment_0_4 : ( ruleSame ) ;
    public final void rule__Reference__SameAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5831:1: ( ( ruleSame ) )
            // InternalAdeptness.g:5832:2: ( ruleSame )
            {
            // InternalAdeptness.g:5832:2: ( ruleSame )
            // InternalAdeptness.g:5833:3: ruleSame
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
    // InternalAdeptness.g:5842:1: rule__Reference__NotsameAssignment_0_5 : ( ruleNotSame ) ;
    public final void rule__Reference__NotsameAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5846:1: ( ( ruleNotSame ) )
            // InternalAdeptness.g:5847:2: ( ruleNotSame )
            {
            // InternalAdeptness.g:5847:2: ( ruleNotSame )
            // InternalAdeptness.g:5848:3: ruleNotSame
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
    // InternalAdeptness.g:5857:1: rule__Same__Bound_uppAssignment_1 : ( ruleBound_up ) ;
    public final void rule__Same__Bound_uppAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5861:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:5862:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:5862:2: ( ruleBound_up )
            // InternalAdeptness.g:5863:3: ruleBound_up
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


    // $ANTLR start "rule__NotSame__Bound_uppAssignment_1"
    // InternalAdeptness.g:5872:1: rule__NotSame__Bound_uppAssignment_1 : ( ruleBound_up ) ;
    public final void rule__NotSame__Bound_uppAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5876:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:5877:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:5877:2: ( ruleBound_up )
            // InternalAdeptness.g:5878:3: ruleBound_up
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


    // $ANTLR start "rule__Upper__Bound_uppAssignment_1"
    // InternalAdeptness.g:5887:1: rule__Upper__Bound_uppAssignment_1 : ( ruleBound_up ) ;
    public final void rule__Upper__Bound_uppAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5891:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:5892:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:5892:2: ( ruleBound_up )
            // InternalAdeptness.g:5893:3: ruleBound_up
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
    // InternalAdeptness.g:5902:1: rule__Lower__Bound_lowerAssignment_1 : ( ruleBound_Down ) ;
    public final void rule__Lower__Bound_lowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5906:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:5907:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:5907:2: ( ruleBound_Down )
            // InternalAdeptness.g:5908:3: ruleBound_Down
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
    // InternalAdeptness.g:5917:1: rule__Range__Bound_lowerAssignment_1 : ( ruleBound_Down ) ;
    public final void rule__Range__Bound_lowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5921:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:5922:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:5922:2: ( ruleBound_Down )
            // InternalAdeptness.g:5923:3: ruleBound_Down
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
    // InternalAdeptness.g:5932:1: rule__Range__Bound_uppAssignment_3 : ( ruleBound_up ) ;
    public final void rule__Range__Bound_uppAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5936:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:5937:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:5937:2: ( ruleBound_up )
            // InternalAdeptness.g:5938:3: ruleBound_up
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
    // InternalAdeptness.g:5947:1: rule__Gap__Bound_lowerAssignment_1 : ( ruleBound_Down ) ;
    public final void rule__Gap__Bound_lowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5951:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:5952:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:5952:2: ( ruleBound_Down )
            // InternalAdeptness.g:5953:3: ruleBound_Down
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
    // InternalAdeptness.g:5962:1: rule__Gap__Bound_uppAssignment_3 : ( ruleBound_up ) ;
    public final void rule__Gap__Bound_uppAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5966:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:5967:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:5967:2: ( ruleBound_up )
            // InternalAdeptness.g:5968:3: ruleBound_up
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


    // $ANTLR start "rule__Bound_up__ValueAssignment_0"
    // InternalAdeptness.g:5977:1: rule__Bound_up__ValueAssignment_0 : ( ruleDOUBLE ) ;
    public final void rule__Bound_up__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5981:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:5982:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:5982:2: ( ruleDOUBLE )
            // InternalAdeptness.g:5983:3: ruleDOUBLE
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
    // InternalAdeptness.g:5992:1: rule__Bound_up__EmAssignment_1 : ( ruleExpressionsModel ) ;
    public final void rule__Bound_up__EmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5996:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:5997:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:5997:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:5998:3: ruleExpressionsModel
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
    // InternalAdeptness.g:6007:1: rule__Bound_Down__ValueAssignment_0 : ( ruleDOUBLE ) ;
    public final void rule__Bound_Down__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6011:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6012:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6012:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6013:3: ruleDOUBLE
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
    // InternalAdeptness.g:6022:1: rule__Bound_Down__EmAssignment_1 : ( ruleExpressionsModel ) ;
    public final void rule__Bound_Down__EmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6026:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:6027:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:6027:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:6028:3: ruleExpressionsModel
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
    // InternalAdeptness.g:6037:1: rule__BOOLEAN__BoolAssignment : ( ruleb ) ;
    public final void rule__BOOLEAN__BoolAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6041:1: ( ( ruleb ) )
            // InternalAdeptness.g:6042:2: ( ruleb )
            {
            // InternalAdeptness.g:6042:2: ( ruleb )
            // InternalAdeptness.g:6043:3: ruleb
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
    // InternalAdeptness.g:6052:1: rule__DOUBLE__DValAssignment : ( ruled ) ;
    public final void rule__DOUBLE__DValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6056:1: ( ( ruled ) )
            // InternalAdeptness.g:6057:2: ( ruled )
            {
            // InternalAdeptness.g:6057:2: ( ruled )
            // InternalAdeptness.g:6058:3: ruled
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
    // InternalAdeptness.g:6067:1: rule__TimeType__TimeAssignment_0 : ( ( 'miliseconds' ) ) ;
    public final void rule__TimeType__TimeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6071:1: ( ( ( 'miliseconds' ) ) )
            // InternalAdeptness.g:6072:2: ( ( 'miliseconds' ) )
            {
            // InternalAdeptness.g:6072:2: ( ( 'miliseconds' ) )
            // InternalAdeptness.g:6073:3: ( 'miliseconds' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMilisecondsKeyword_0_0()); 
            // InternalAdeptness.g:6074:3: ( 'miliseconds' )
            // InternalAdeptness.g:6075:4: 'miliseconds'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMilisecondsKeyword_0_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalAdeptness.g:6086:1: rule__TimeType__TimeAssignment_1 : ( ( 'seconds' ) ) ;
    public final void rule__TimeType__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6090:1: ( ( ( 'seconds' ) ) )
            // InternalAdeptness.g:6091:2: ( ( 'seconds' ) )
            {
            // InternalAdeptness.g:6091:2: ( ( 'seconds' ) )
            // InternalAdeptness.g:6092:3: ( 'seconds' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeSecondsKeyword_1_0()); 
            // InternalAdeptness.g:6093:3: ( 'seconds' )
            // InternalAdeptness.g:6094:4: 'seconds'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeSecondsKeyword_1_0()); 
            match(input,74,FOLLOW_2); 
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
    // InternalAdeptness.g:6105:1: rule__TimeType__TimeAssignment_2 : ( ( 'minutes' ) ) ;
    public final void rule__TimeType__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6109:1: ( ( ( 'minutes' ) ) )
            // InternalAdeptness.g:6110:2: ( ( 'minutes' ) )
            {
            // InternalAdeptness.g:6110:2: ( ( 'minutes' ) )
            // InternalAdeptness.g:6111:3: ( 'minutes' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMinutesKeyword_2_0()); 
            // InternalAdeptness.g:6112:3: ( 'minutes' )
            // InternalAdeptness.g:6113:4: 'minutes'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMinutesKeyword_2_0()); 
            match(input,75,FOLLOW_2); 
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
    // InternalAdeptness.g:6124:1: rule__TimeType__TimeAssignment_3 : ( ( 'hours' ) ) ;
    public final void rule__TimeType__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6128:1: ( ( ( 'hours' ) ) )
            // InternalAdeptness.g:6129:2: ( ( 'hours' ) )
            {
            // InternalAdeptness.g:6129:2: ( ( 'hours' ) )
            // InternalAdeptness.g:6130:3: ( 'hours' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeHoursKeyword_3_0()); 
            // InternalAdeptness.g:6131:3: ( 'hours' )
            // InternalAdeptness.g:6132:4: 'hours'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeHoursKeyword_3_0()); 
            match(input,76,FOLLOW_2); 
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
    // InternalAdeptness.g:6143:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6147:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:6148:2: ( RULE_ID )
            {
            // InternalAdeptness.g:6148:2: ( RULE_ID )
            // InternalAdeptness.g:6149:3: RULE_ID
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
    // InternalAdeptness.g:6158:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6162:1: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:6163:2: ( ruleQualifiedName )
            {
            // InternalAdeptness.g:6163:2: ( ruleQualifiedName )
            // InternalAdeptness.g:6164:3: ruleQualifiedName
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
    // InternalAdeptness.g:6173:1: rule__PackageDeclaration__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6177:1: ( ( ruleAbstractElement ) )
            // InternalAdeptness.g:6178:2: ( ruleAbstractElement )
            {
            // InternalAdeptness.g:6178:2: ( ruleAbstractElement )
            // InternalAdeptness.g:6179:3: ruleAbstractElement
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
    // InternalAdeptness.g:6188:1: rule__ExpressionsModel__ElementsAssignment : ( ruleAbstractElement2 ) ;
    public final void rule__ExpressionsModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6192:1: ( ( ruleAbstractElement2 ) )
            // InternalAdeptness.g:6193:2: ( ruleAbstractElement2 )
            {
            // InternalAdeptness.g:6193:2: ( ruleAbstractElement2 )
            // InternalAdeptness.g:6194:3: ruleAbstractElement2
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
    // InternalAdeptness.g:6203:1: rule__AbstractElement2__FrontParenthesesAssignment_0 : ( ruleFrontParentheses ) ;
    public final void rule__AbstractElement2__FrontParenthesesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6207:1: ( ( ruleFrontParentheses ) )
            // InternalAdeptness.g:6208:2: ( ruleFrontParentheses )
            {
            // InternalAdeptness.g:6208:2: ( ruleFrontParentheses )
            // InternalAdeptness.g:6209:3: ruleFrontParentheses
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
    // InternalAdeptness.g:6218:1: rule__AbstractElement2__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__AbstractElement2__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6222:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:6223:2: ( RULE_ID )
            {
            // InternalAdeptness.g:6223:2: ( RULE_ID )
            // InternalAdeptness.g:6224:3: RULE_ID
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
    // InternalAdeptness.g:6233:1: rule__AbstractElement2__ValueAssignment_1_1 : ( ruleDOUBLE ) ;
    public final void rule__AbstractElement2__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6237:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6238:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6238:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6239:3: ruleDOUBLE
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
    // InternalAdeptness.g:6248:1: rule__AbstractElement2__OpAssignment_2 : ( ruleOperators ) ;
    public final void rule__AbstractElement2__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6252:1: ( ( ruleOperators ) )
            // InternalAdeptness.g:6253:2: ( ruleOperators )
            {
            // InternalAdeptness.g:6253:2: ( ruleOperators )
            // InternalAdeptness.g:6254:3: ruleOperators
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
    // InternalAdeptness.g:6263:1: rule__Operators__OperatorAssignment_0 : ( ruleOp ) ;
    public final void rule__Operators__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6267:1: ( ( ruleOp ) )
            // InternalAdeptness.g:6268:2: ( ruleOp )
            {
            // InternalAdeptness.g:6268:2: ( ruleOp )
            // InternalAdeptness.g:6269:3: ruleOp
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
    // InternalAdeptness.g:6278:1: rule__Operators__ComparationAssignment_1 : ( ruleCompOp ) ;
    public final void rule__Operators__ComparationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6282:1: ( ( ruleCompOp ) )
            // InternalAdeptness.g:6283:2: ( ruleCompOp )
            {
            // InternalAdeptness.g:6283:2: ( ruleCompOp )
            // InternalAdeptness.g:6284:3: ruleCompOp
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
    // InternalAdeptness.g:6293:1: rule__Operators__LogicOperatorAssignment_2 : ( ruleLogicOp ) ;
    public final void rule__Operators__LogicOperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6297:1: ( ( ruleLogicOp ) )
            // InternalAdeptness.g:6298:2: ( ruleLogicOp )
            {
            // InternalAdeptness.g:6298:2: ( ruleLogicOp )
            // InternalAdeptness.g:6299:3: ruleLogicOp
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
    // InternalAdeptness.g:6308:1: rule__Operators__BackParenthesesAssignment_3 : ( ruleBackParentheses ) ;
    public final void rule__Operators__BackParenthesesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6312:1: ( ( ruleBackParentheses ) )
            // InternalAdeptness.g:6313:2: ( ruleBackParentheses )
            {
            // InternalAdeptness.g:6313:2: ( ruleBackParentheses )
            // InternalAdeptness.g:6314:3: ruleBackParentheses
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
    // InternalAdeptness.g:6323:1: rule__CompOp__OpAssignment : ( ( rule__CompOp__OpAlternatives_0 ) ) ;
    public final void rule__CompOp__OpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6327:1: ( ( ( rule__CompOp__OpAlternatives_0 ) ) )
            // InternalAdeptness.g:6328:2: ( ( rule__CompOp__OpAlternatives_0 ) )
            {
            // InternalAdeptness.g:6328:2: ( ( rule__CompOp__OpAlternatives_0 ) )
            // InternalAdeptness.g:6329:3: ( rule__CompOp__OpAlternatives_0 )
            {
             before(grammarAccess.getCompOpAccess().getOpAlternatives_0()); 
            // InternalAdeptness.g:6330:3: ( rule__CompOp__OpAlternatives_0 )
            // InternalAdeptness.g:6330:4: rule__CompOp__OpAlternatives_0
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
    // InternalAdeptness.g:6338:1: rule__LogicOp__OpAssignment : ( ( rule__LogicOp__OpAlternatives_0 ) ) ;
    public final void rule__LogicOp__OpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6342:1: ( ( ( rule__LogicOp__OpAlternatives_0 ) ) )
            // InternalAdeptness.g:6343:2: ( ( rule__LogicOp__OpAlternatives_0 ) )
            {
            // InternalAdeptness.g:6343:2: ( ( rule__LogicOp__OpAlternatives_0 ) )
            // InternalAdeptness.g:6344:3: ( rule__LogicOp__OpAlternatives_0 )
            {
             before(grammarAccess.getLogicOpAccess().getOpAlternatives_0()); 
            // InternalAdeptness.g:6345:3: ( rule__LogicOp__OpAlternatives_0 )
            // InternalAdeptness.g:6345:4: rule__LogicOp__OpAlternatives_0
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
    // InternalAdeptness.g:6353:1: rule__Op__OpAssignment : ( ( rule__Op__OpAlternatives_0 ) ) ;
    public final void rule__Op__OpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6357:1: ( ( ( rule__Op__OpAlternatives_0 ) ) )
            // InternalAdeptness.g:6358:2: ( ( rule__Op__OpAlternatives_0 ) )
            {
            // InternalAdeptness.g:6358:2: ( ( rule__Op__OpAlternatives_0 ) )
            // InternalAdeptness.g:6359:3: ( rule__Op__OpAlternatives_0 )
            {
             before(grammarAccess.getOpAccess().getOpAlternatives_0()); 
            // InternalAdeptness.g:6360:3: ( rule__Op__OpAlternatives_0 )
            // InternalAdeptness.g:6360:4: rule__Op__OpAlternatives_0
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
    static final String dfa_2s = "\1\66\1\5\1\uffff\1\5\1\35\1\5\3\uffff\1\65";
    static final String dfa_3s = "\1\71\1\30\1\uffff\1\5\1\72\1\5\3\uffff\1\72";
    static final String dfa_4s = "\2\uffff\1\3\3\uffff\1\1\1\2\1\4\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2",
            "\1\4\22\uffff\1\3",
            "",
            "\1\4",
            "\1\5\27\uffff\1\6\1\uffff\1\10\2\uffff\1\7",
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
            return "1421:1: rule__Reason__Alternatives_0 : ( ( ( rule__Reason__HighPeakAssignment_0_0 ) ) | ( ( rule__Reason__HighTimeAssignment_0_1 ) ) | ( ( rule__Reason__ConstDegAssignment_0_2 ) ) | ( ( rule__Reason__XPeaksAssignment_0_3 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004048000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000832L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000830L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0004600000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0004600000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xF800000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0240000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000004048000000L,0x000000000000002CL});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000007FF9000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000007FF9002L});

}