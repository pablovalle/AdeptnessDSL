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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'times'", "'true'", "'false'", "'=='", "'!='", "'>='", "'<='", "'<'", "'>'", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'import'", "'.*'", "'.'", "'MONITORINGPLAN'", "':'", "'ENDMONITORINGPLAN'", "'MONITOR'", "'type'", "'ENDMONITOR'", "'max'", "'min'", "'CPS'", "'ENDCPS'", "'['", "']'", "'implements'", "'ORACLE'", "'ENDORACLE'", "'while:'", "'when:'", "'after('", "','", "'during('", "'checks:'", "'Description: '", "'fails if :'", "';'", "'confidence is below'", "'more than'", "'times within'", "'confidence is in constant degradation'", "'within'", "'should be'", "'should not be'", "'is below'", "'is above'", "'is in range between'", "'and'", "'not in range between'", "'exactly'", "'times in'", "'at most'", "'at least'", "'datatype'", "'package'", "'{'", "'}'", "'boolean'", "'int'", "'double'", "'miliseconds'", "'seconds'", "'minutes'", "'hours'"
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
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
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

                if ( (LA1_0==28||LA1_0==31||LA1_0==39||(LA1_0>=71 && LA1_0<=72)) ) {
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


    // $ANTLR start "entryRuleExactly"
    // InternalAdeptness.g:853:1: entryRuleExactly : ruleExactly EOF ;
    public final void entryRuleExactly() throws RecognitionException {
        try {
            // InternalAdeptness.g:854:1: ( ruleExactly EOF )
            // InternalAdeptness.g:855:1: ruleExactly EOF
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
    // InternalAdeptness.g:862:1: ruleExactly : ( ( rule__Exactly__Group__0 ) ) ;
    public final void ruleExactly() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:866:2: ( ( ( rule__Exactly__Group__0 ) ) )
            // InternalAdeptness.g:867:2: ( ( rule__Exactly__Group__0 ) )
            {
            // InternalAdeptness.g:867:2: ( ( rule__Exactly__Group__0 ) )
            // InternalAdeptness.g:868:3: ( rule__Exactly__Group__0 )
            {
             before(grammarAccess.getExactlyAccess().getGroup()); 
            // InternalAdeptness.g:869:3: ( rule__Exactly__Group__0 )
            // InternalAdeptness.g:869:4: rule__Exactly__Group__0
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
    // InternalAdeptness.g:878:1: entryRuleAt_most : ruleAt_most EOF ;
    public final void entryRuleAt_most() throws RecognitionException {
        try {
            // InternalAdeptness.g:879:1: ( ruleAt_most EOF )
            // InternalAdeptness.g:880:1: ruleAt_most EOF
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
    // InternalAdeptness.g:887:1: ruleAt_most : ( ( rule__At_most__Group__0 ) ) ;
    public final void ruleAt_most() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:891:2: ( ( ( rule__At_most__Group__0 ) ) )
            // InternalAdeptness.g:892:2: ( ( rule__At_most__Group__0 ) )
            {
            // InternalAdeptness.g:892:2: ( ( rule__At_most__Group__0 ) )
            // InternalAdeptness.g:893:3: ( rule__At_most__Group__0 )
            {
             before(grammarAccess.getAt_mostAccess().getGroup()); 
            // InternalAdeptness.g:894:3: ( rule__At_most__Group__0 )
            // InternalAdeptness.g:894:4: rule__At_most__Group__0
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
    // InternalAdeptness.g:903:1: entryRuleAt_least : ruleAt_least EOF ;
    public final void entryRuleAt_least() throws RecognitionException {
        try {
            // InternalAdeptness.g:904:1: ( ruleAt_least EOF )
            // InternalAdeptness.g:905:1: ruleAt_least EOF
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
    // InternalAdeptness.g:912:1: ruleAt_least : ( ( rule__At_least__Group__0 ) ) ;
    public final void ruleAt_least() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:916:2: ( ( ( rule__At_least__Group__0 ) ) )
            // InternalAdeptness.g:917:2: ( ( rule__At_least__Group__0 ) )
            {
            // InternalAdeptness.g:917:2: ( ( rule__At_least__Group__0 ) )
            // InternalAdeptness.g:918:3: ( rule__At_least__Group__0 )
            {
             before(grammarAccess.getAt_leastAccess().getGroup()); 
            // InternalAdeptness.g:919:3: ( rule__At_least__Group__0 )
            // InternalAdeptness.g:919:4: rule__At_least__Group__0
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
    // InternalAdeptness.g:928:1: entryRuleBound_up : ruleBound_up EOF ;
    public final void entryRuleBound_up() throws RecognitionException {
        try {
            // InternalAdeptness.g:929:1: ( ruleBound_up EOF )
            // InternalAdeptness.g:930:1: ruleBound_up EOF
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
    // InternalAdeptness.g:937:1: ruleBound_up : ( ( rule__Bound_up__Alternatives ) ) ;
    public final void ruleBound_up() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:941:2: ( ( ( rule__Bound_up__Alternatives ) ) )
            // InternalAdeptness.g:942:2: ( ( rule__Bound_up__Alternatives ) )
            {
            // InternalAdeptness.g:942:2: ( ( rule__Bound_up__Alternatives ) )
            // InternalAdeptness.g:943:3: ( rule__Bound_up__Alternatives )
            {
             before(grammarAccess.getBound_upAccess().getAlternatives()); 
            // InternalAdeptness.g:944:3: ( rule__Bound_up__Alternatives )
            // InternalAdeptness.g:944:4: rule__Bound_up__Alternatives
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
    // InternalAdeptness.g:953:1: entryRuleBound_Down : ruleBound_Down EOF ;
    public final void entryRuleBound_Down() throws RecognitionException {
        try {
            // InternalAdeptness.g:954:1: ( ruleBound_Down EOF )
            // InternalAdeptness.g:955:1: ruleBound_Down EOF
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
    // InternalAdeptness.g:962:1: ruleBound_Down : ( ( rule__Bound_Down__Alternatives ) ) ;
    public final void ruleBound_Down() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:966:2: ( ( ( rule__Bound_Down__Alternatives ) ) )
            // InternalAdeptness.g:967:2: ( ( rule__Bound_Down__Alternatives ) )
            {
            // InternalAdeptness.g:967:2: ( ( rule__Bound_Down__Alternatives ) )
            // InternalAdeptness.g:968:3: ( rule__Bound_Down__Alternatives )
            {
             before(grammarAccess.getBound_DownAccess().getAlternatives()); 
            // InternalAdeptness.g:969:3: ( rule__Bound_Down__Alternatives )
            // InternalAdeptness.g:969:4: rule__Bound_Down__Alternatives
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
    // InternalAdeptness.g:978:1: entryRuleBOOLEAN : ruleBOOLEAN EOF ;
    public final void entryRuleBOOLEAN() throws RecognitionException {
        try {
            // InternalAdeptness.g:979:1: ( ruleBOOLEAN EOF )
            // InternalAdeptness.g:980:1: ruleBOOLEAN EOF
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
    // InternalAdeptness.g:987:1: ruleBOOLEAN : ( ( rule__BOOLEAN__BoolAssignment ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:991:2: ( ( ( rule__BOOLEAN__BoolAssignment ) ) )
            // InternalAdeptness.g:992:2: ( ( rule__BOOLEAN__BoolAssignment ) )
            {
            // InternalAdeptness.g:992:2: ( ( rule__BOOLEAN__BoolAssignment ) )
            // InternalAdeptness.g:993:3: ( rule__BOOLEAN__BoolAssignment )
            {
             before(grammarAccess.getBOOLEANAccess().getBoolAssignment()); 
            // InternalAdeptness.g:994:3: ( rule__BOOLEAN__BoolAssignment )
            // InternalAdeptness.g:994:4: rule__BOOLEAN__BoolAssignment
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
    // InternalAdeptness.g:1003:1: entryRuleb : ruleb EOF ;
    public final void entryRuleb() throws RecognitionException {
        try {
            // InternalAdeptness.g:1004:1: ( ruleb EOF )
            // InternalAdeptness.g:1005:1: ruleb EOF
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
    // InternalAdeptness.g:1012:1: ruleb : ( ( rule__B__Alternatives ) ) ;
    public final void ruleb() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1016:2: ( ( ( rule__B__Alternatives ) ) )
            // InternalAdeptness.g:1017:2: ( ( rule__B__Alternatives ) )
            {
            // InternalAdeptness.g:1017:2: ( ( rule__B__Alternatives ) )
            // InternalAdeptness.g:1018:3: ( rule__B__Alternatives )
            {
             before(grammarAccess.getBAccess().getAlternatives()); 
            // InternalAdeptness.g:1019:3: ( rule__B__Alternatives )
            // InternalAdeptness.g:1019:4: rule__B__Alternatives
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
    // InternalAdeptness.g:1028:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalAdeptness.g:1029:1: ( ruleDOUBLE EOF )
            // InternalAdeptness.g:1030:1: ruleDOUBLE EOF
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
    // InternalAdeptness.g:1037:1: ruleDOUBLE : ( ( rule__DOUBLE__DValAssignment ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1041:2: ( ( ( rule__DOUBLE__DValAssignment ) ) )
            // InternalAdeptness.g:1042:2: ( ( rule__DOUBLE__DValAssignment ) )
            {
            // InternalAdeptness.g:1042:2: ( ( rule__DOUBLE__DValAssignment ) )
            // InternalAdeptness.g:1043:3: ( rule__DOUBLE__DValAssignment )
            {
             before(grammarAccess.getDOUBLEAccess().getDValAssignment()); 
            // InternalAdeptness.g:1044:3: ( rule__DOUBLE__DValAssignment )
            // InternalAdeptness.g:1044:4: rule__DOUBLE__DValAssignment
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
    // InternalAdeptness.g:1053:1: entryRuled : ruled EOF ;
    public final void entryRuled() throws RecognitionException {
        try {
            // InternalAdeptness.g:1054:1: ( ruled EOF )
            // InternalAdeptness.g:1055:1: ruled EOF
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
    // InternalAdeptness.g:1062:1: ruled : ( ( rule__D__Group__0 ) ) ;
    public final void ruled() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1066:2: ( ( ( rule__D__Group__0 ) ) )
            // InternalAdeptness.g:1067:2: ( ( rule__D__Group__0 ) )
            {
            // InternalAdeptness.g:1067:2: ( ( rule__D__Group__0 ) )
            // InternalAdeptness.g:1068:3: ( rule__D__Group__0 )
            {
             before(grammarAccess.getDAccess().getGroup()); 
            // InternalAdeptness.g:1069:3: ( rule__D__Group__0 )
            // InternalAdeptness.g:1069:4: rule__D__Group__0
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
    // InternalAdeptness.g:1078:1: entryRuleTimeType : ruleTimeType EOF ;
    public final void entryRuleTimeType() throws RecognitionException {
        try {
            // InternalAdeptness.g:1079:1: ( ruleTimeType EOF )
            // InternalAdeptness.g:1080:1: ruleTimeType EOF
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
    // InternalAdeptness.g:1087:1: ruleTimeType : ( ( rule__TimeType__Alternatives ) ) ;
    public final void ruleTimeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1091:2: ( ( ( rule__TimeType__Alternatives ) ) )
            // InternalAdeptness.g:1092:2: ( ( rule__TimeType__Alternatives ) )
            {
            // InternalAdeptness.g:1092:2: ( ( rule__TimeType__Alternatives ) )
            // InternalAdeptness.g:1093:3: ( rule__TimeType__Alternatives )
            {
             before(grammarAccess.getTimeTypeAccess().getAlternatives()); 
            // InternalAdeptness.g:1094:3: ( rule__TimeType__Alternatives )
            // InternalAdeptness.g:1094:4: rule__TimeType__Alternatives
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
    // InternalAdeptness.g:1103:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalAdeptness.g:1104:1: ( ruleDataType EOF )
            // InternalAdeptness.g:1105:1: ruleDataType EOF
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
    // InternalAdeptness.g:1112:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1116:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalAdeptness.g:1117:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalAdeptness.g:1117:2: ( ( rule__DataType__Group__0 ) )
            // InternalAdeptness.g:1118:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalAdeptness.g:1119:3: ( rule__DataType__Group__0 )
            // InternalAdeptness.g:1119:4: rule__DataType__Group__0
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
    // InternalAdeptness.g:1128:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // InternalAdeptness.g:1129:1: ( rulePackageDeclaration EOF )
            // InternalAdeptness.g:1130:1: rulePackageDeclaration EOF
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
    // InternalAdeptness.g:1137:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1141:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // InternalAdeptness.g:1142:2: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // InternalAdeptness.g:1142:2: ( ( rule__PackageDeclaration__Group__0 ) )
            // InternalAdeptness.g:1143:3: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // InternalAdeptness.g:1144:3: ( rule__PackageDeclaration__Group__0 )
            // InternalAdeptness.g:1144:4: rule__PackageDeclaration__Group__0
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
    // InternalAdeptness.g:1153:1: entryRuleExpressionsModel : ruleExpressionsModel EOF ;
    public final void entryRuleExpressionsModel() throws RecognitionException {
        try {
            // InternalAdeptness.g:1154:1: ( ruleExpressionsModel EOF )
            // InternalAdeptness.g:1155:1: ruleExpressionsModel EOF
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
    // InternalAdeptness.g:1162:1: ruleExpressionsModel : ( ( rule__ExpressionsModel__ElementsAssignment )* ) ;
    public final void ruleExpressionsModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1166:2: ( ( ( rule__ExpressionsModel__ElementsAssignment )* ) )
            // InternalAdeptness.g:1167:2: ( ( rule__ExpressionsModel__ElementsAssignment )* )
            {
            // InternalAdeptness.g:1167:2: ( ( rule__ExpressionsModel__ElementsAssignment )* )
            // InternalAdeptness.g:1168:3: ( rule__ExpressionsModel__ElementsAssignment )*
            {
             before(grammarAccess.getExpressionsModelAccess().getElementsAssignment()); 
            // InternalAdeptness.g:1169:3: ( rule__ExpressionsModel__ElementsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_INT)||LA2_0==11||LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAdeptness.g:1169:4: rule__ExpressionsModel__ElementsAssignment
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
    // InternalAdeptness.g:1178:1: entryRuleAbstractElement2 : ruleAbstractElement2 EOF ;
    public final void entryRuleAbstractElement2() throws RecognitionException {
        try {
            // InternalAdeptness.g:1179:1: ( ruleAbstractElement2 EOF )
            // InternalAdeptness.g:1180:1: ruleAbstractElement2 EOF
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
    // InternalAdeptness.g:1187:1: ruleAbstractElement2 : ( ( rule__AbstractElement2__Group__0 ) ) ;
    public final void ruleAbstractElement2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1191:2: ( ( ( rule__AbstractElement2__Group__0 ) ) )
            // InternalAdeptness.g:1192:2: ( ( rule__AbstractElement2__Group__0 ) )
            {
            // InternalAdeptness.g:1192:2: ( ( rule__AbstractElement2__Group__0 ) )
            // InternalAdeptness.g:1193:3: ( rule__AbstractElement2__Group__0 )
            {
             before(grammarAccess.getAbstractElement2Access().getGroup()); 
            // InternalAdeptness.g:1194:3: ( rule__AbstractElement2__Group__0 )
            // InternalAdeptness.g:1194:4: rule__AbstractElement2__Group__0
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
    // InternalAdeptness.g:1203:1: entryRuleFrontParentheses : ruleFrontParentheses EOF ;
    public final void entryRuleFrontParentheses() throws RecognitionException {
        try {
            // InternalAdeptness.g:1204:1: ( ruleFrontParentheses EOF )
            // InternalAdeptness.g:1205:1: ruleFrontParentheses EOF
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
    // InternalAdeptness.g:1212:1: ruleFrontParentheses : ( '(' ) ;
    public final void ruleFrontParentheses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1216:2: ( ( '(' ) )
            // InternalAdeptness.g:1217:2: ( '(' )
            {
            // InternalAdeptness.g:1217:2: ( '(' )
            // InternalAdeptness.g:1218:3: '('
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
    // InternalAdeptness.g:1228:1: entryRuleBackParentheses : ruleBackParentheses EOF ;
    public final void entryRuleBackParentheses() throws RecognitionException {
        try {
            // InternalAdeptness.g:1229:1: ( ruleBackParentheses EOF )
            // InternalAdeptness.g:1230:1: ruleBackParentheses EOF
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
    // InternalAdeptness.g:1237:1: ruleBackParentheses : ( ')' ) ;
    public final void ruleBackParentheses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1241:2: ( ( ')' ) )
            // InternalAdeptness.g:1242:2: ( ')' )
            {
            // InternalAdeptness.g:1242:2: ( ')' )
            // InternalAdeptness.g:1243:3: ')'
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
    // InternalAdeptness.g:1253:1: entryRuleOperators : ruleOperators EOF ;
    public final void entryRuleOperators() throws RecognitionException {
        try {
            // InternalAdeptness.g:1254:1: ( ruleOperators EOF )
            // InternalAdeptness.g:1255:1: ruleOperators EOF
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
    // InternalAdeptness.g:1262:1: ruleOperators : ( ( rule__Operators__Alternatives ) ) ;
    public final void ruleOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1266:2: ( ( ( rule__Operators__Alternatives ) ) )
            // InternalAdeptness.g:1267:2: ( ( rule__Operators__Alternatives ) )
            {
            // InternalAdeptness.g:1267:2: ( ( rule__Operators__Alternatives ) )
            // InternalAdeptness.g:1268:3: ( rule__Operators__Alternatives )
            {
             before(grammarAccess.getOperatorsAccess().getAlternatives()); 
            // InternalAdeptness.g:1269:3: ( rule__Operators__Alternatives )
            // InternalAdeptness.g:1269:4: rule__Operators__Alternatives
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
    // InternalAdeptness.g:1278:1: entryRuleCompOp : ruleCompOp EOF ;
    public final void entryRuleCompOp() throws RecognitionException {
        try {
            // InternalAdeptness.g:1279:1: ( ruleCompOp EOF )
            // InternalAdeptness.g:1280:1: ruleCompOp EOF
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
    // InternalAdeptness.g:1287:1: ruleCompOp : ( ( rule__CompOp__OpAssignment ) ) ;
    public final void ruleCompOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1291:2: ( ( ( rule__CompOp__OpAssignment ) ) )
            // InternalAdeptness.g:1292:2: ( ( rule__CompOp__OpAssignment ) )
            {
            // InternalAdeptness.g:1292:2: ( ( rule__CompOp__OpAssignment ) )
            // InternalAdeptness.g:1293:3: ( rule__CompOp__OpAssignment )
            {
             before(grammarAccess.getCompOpAccess().getOpAssignment()); 
            // InternalAdeptness.g:1294:3: ( rule__CompOp__OpAssignment )
            // InternalAdeptness.g:1294:4: rule__CompOp__OpAssignment
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
    // InternalAdeptness.g:1303:1: entryRuleLogicOp : ruleLogicOp EOF ;
    public final void entryRuleLogicOp() throws RecognitionException {
        try {
            // InternalAdeptness.g:1304:1: ( ruleLogicOp EOF )
            // InternalAdeptness.g:1305:1: ruleLogicOp EOF
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
    // InternalAdeptness.g:1312:1: ruleLogicOp : ( ( rule__LogicOp__OpAssignment ) ) ;
    public final void ruleLogicOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1316:2: ( ( ( rule__LogicOp__OpAssignment ) ) )
            // InternalAdeptness.g:1317:2: ( ( rule__LogicOp__OpAssignment ) )
            {
            // InternalAdeptness.g:1317:2: ( ( rule__LogicOp__OpAssignment ) )
            // InternalAdeptness.g:1318:3: ( rule__LogicOp__OpAssignment )
            {
             before(grammarAccess.getLogicOpAccess().getOpAssignment()); 
            // InternalAdeptness.g:1319:3: ( rule__LogicOp__OpAssignment )
            // InternalAdeptness.g:1319:4: rule__LogicOp__OpAssignment
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
    // InternalAdeptness.g:1328:1: entryRuleOp : ruleOp EOF ;
    public final void entryRuleOp() throws RecognitionException {
        try {
            // InternalAdeptness.g:1329:1: ( ruleOp EOF )
            // InternalAdeptness.g:1330:1: ruleOp EOF
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
    // InternalAdeptness.g:1337:1: ruleOp : ( ( rule__Op__OpAssignment ) ) ;
    public final void ruleOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1341:2: ( ( ( rule__Op__OpAssignment ) ) )
            // InternalAdeptness.g:1342:2: ( ( rule__Op__OpAssignment ) )
            {
            // InternalAdeptness.g:1342:2: ( ( rule__Op__OpAssignment ) )
            // InternalAdeptness.g:1343:3: ( rule__Op__OpAssignment )
            {
             before(grammarAccess.getOpAccess().getOpAssignment()); 
            // InternalAdeptness.g:1344:3: ( rule__Op__OpAssignment )
            // InternalAdeptness.g:1344:4: rule__Op__OpAssignment
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
    // InternalAdeptness.g:1352:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImports ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1356:1: ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImports ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt3=1;
                }
                break;
            case 31:
            case 39:
            case 71:
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
                    // InternalAdeptness.g:1357:2: ( rulePackageDeclaration )
                    {
                    // InternalAdeptness.g:1357:2: ( rulePackageDeclaration )
                    // InternalAdeptness.g:1358:3: rulePackageDeclaration
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
                    // InternalAdeptness.g:1363:2: ( ruleType )
                    {
                    // InternalAdeptness.g:1363:2: ( ruleType )
                    // InternalAdeptness.g:1364:3: ruleType
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
                    // InternalAdeptness.g:1369:2: ( ruleImports )
                    {
                    // InternalAdeptness.g:1369:2: ( ruleImports )
                    // InternalAdeptness.g:1370:3: ruleImports
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
    // InternalAdeptness.g:1379:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleSignal ) | ( ruleMonitoringFile ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1383:1: ( ( ruleDataType ) | ( ruleSignal ) | ( ruleMonitoringFile ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt4=1;
                }
                break;
            case 39:
                {
                alt4=2;
                }
                break;
            case 31:
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
                    // InternalAdeptness.g:1384:2: ( ruleDataType )
                    {
                    // InternalAdeptness.g:1384:2: ( ruleDataType )
                    // InternalAdeptness.g:1385:3: ruleDataType
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
                    // InternalAdeptness.g:1390:2: ( ruleSignal )
                    {
                    // InternalAdeptness.g:1390:2: ( ruleSignal )
                    // InternalAdeptness.g:1391:3: ruleSignal
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
                    // InternalAdeptness.g:1396:2: ( ruleMonitoringFile )
                    {
                    // InternalAdeptness.g:1396:2: ( ruleMonitoringFile )
                    // InternalAdeptness.g:1397:3: ruleMonitoringFile
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
    // InternalAdeptness.g:1406:1: rule__Sig_type__Alternatives : ( ( ( rule__Sig_type__Sig_typeAssignment_0 ) ) | ( ( rule__Sig_type__Sig_typeAssignment_1 ) ) | ( ( rule__Sig_type__Sig_typeAssignment_2 ) ) );
    public final void rule__Sig_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1410:1: ( ( ( rule__Sig_type__Sig_typeAssignment_0 ) ) | ( ( rule__Sig_type__Sig_typeAssignment_1 ) ) | ( ( rule__Sig_type__Sig_typeAssignment_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt5=1;
                }
                break;
            case 76:
                {
                alt5=2;
                }
                break;
            case 77:
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
                    // InternalAdeptness.g:1411:2: ( ( rule__Sig_type__Sig_typeAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1411:2: ( ( rule__Sig_type__Sig_typeAssignment_0 ) )
                    // InternalAdeptness.g:1412:3: ( rule__Sig_type__Sig_typeAssignment_0 )
                    {
                     before(grammarAccess.getSig_typeAccess().getSig_typeAssignment_0()); 
                    // InternalAdeptness.g:1413:3: ( rule__Sig_type__Sig_typeAssignment_0 )
                    // InternalAdeptness.g:1413:4: rule__Sig_type__Sig_typeAssignment_0
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
                    // InternalAdeptness.g:1417:2: ( ( rule__Sig_type__Sig_typeAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1417:2: ( ( rule__Sig_type__Sig_typeAssignment_1 ) )
                    // InternalAdeptness.g:1418:3: ( rule__Sig_type__Sig_typeAssignment_1 )
                    {
                     before(grammarAccess.getSig_typeAccess().getSig_typeAssignment_1()); 
                    // InternalAdeptness.g:1419:3: ( rule__Sig_type__Sig_typeAssignment_1 )
                    // InternalAdeptness.g:1419:4: rule__Sig_type__Sig_typeAssignment_1
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
                    // InternalAdeptness.g:1423:2: ( ( rule__Sig_type__Sig_typeAssignment_2 ) )
                    {
                    // InternalAdeptness.g:1423:2: ( ( rule__Sig_type__Sig_typeAssignment_2 ) )
                    // InternalAdeptness.g:1424:3: ( rule__Sig_type__Sig_typeAssignment_2 )
                    {
                     before(grammarAccess.getSig_typeAccess().getSig_typeAssignment_2()); 
                    // InternalAdeptness.g:1425:3: ( rule__Sig_type__Sig_typeAssignment_2 )
                    // InternalAdeptness.g:1425:4: rule__Sig_type__Sig_typeAssignment_2
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
    // InternalAdeptness.g:1433:1: rule__Oracle__Alternatives_3 : ( ( ( rule__Oracle__WhenAssignment_3_0 ) ) | ( ( rule__Oracle__WhileAssignment_3_1 ) ) );
    public final void rule__Oracle__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1437:1: ( ( ( rule__Oracle__WhenAssignment_3_0 ) ) | ( ( rule__Oracle__WhileAssignment_3_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==47) ) {
                alt6=1;
            }
            else if ( (LA6_0==46) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAdeptness.g:1438:2: ( ( rule__Oracle__WhenAssignment_3_0 ) )
                    {
                    // InternalAdeptness.g:1438:2: ( ( rule__Oracle__WhenAssignment_3_0 ) )
                    // InternalAdeptness.g:1439:3: ( rule__Oracle__WhenAssignment_3_0 )
                    {
                     before(grammarAccess.getOracleAccess().getWhenAssignment_3_0()); 
                    // InternalAdeptness.g:1440:3: ( rule__Oracle__WhenAssignment_3_0 )
                    // InternalAdeptness.g:1440:4: rule__Oracle__WhenAssignment_3_0
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
                    // InternalAdeptness.g:1444:2: ( ( rule__Oracle__WhileAssignment_3_1 ) )
                    {
                    // InternalAdeptness.g:1444:2: ( ( rule__Oracle__WhileAssignment_3_1 ) )
                    // InternalAdeptness.g:1445:3: ( rule__Oracle__WhileAssignment_3_1 )
                    {
                     before(grammarAccess.getOracleAccess().getWhileAssignment_3_1()); 
                    // InternalAdeptness.g:1446:3: ( rule__Oracle__WhileAssignment_3_1 )
                    // InternalAdeptness.g:1446:4: rule__Oracle__WhileAssignment_3_1
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
    // InternalAdeptness.g:1454:1: rule__AfterWhen__Alternatives : ( ( ( rule__AfterWhen__WaitAssignment_0 ) ) | ( ( rule__AfterWhen__DuringAssignment_1 ) ) );
    public final void rule__AfterWhen__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1458:1: ( ( ( rule__AfterWhen__WaitAssignment_0 ) ) | ( ( rule__AfterWhen__DuringAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==48) ) {
                alt7=1;
            }
            else if ( (LA7_0==50) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAdeptness.g:1459:2: ( ( rule__AfterWhen__WaitAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1459:2: ( ( rule__AfterWhen__WaitAssignment_0 ) )
                    // InternalAdeptness.g:1460:3: ( rule__AfterWhen__WaitAssignment_0 )
                    {
                     before(grammarAccess.getAfterWhenAccess().getWaitAssignment_0()); 
                    // InternalAdeptness.g:1461:3: ( rule__AfterWhen__WaitAssignment_0 )
                    // InternalAdeptness.g:1461:4: rule__AfterWhen__WaitAssignment_0
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
                    // InternalAdeptness.g:1465:2: ( ( rule__AfterWhen__DuringAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1465:2: ( ( rule__AfterWhen__DuringAssignment_1 ) )
                    // InternalAdeptness.g:1466:3: ( rule__AfterWhen__DuringAssignment_1 )
                    {
                     before(grammarAccess.getAfterWhenAccess().getDuringAssignment_1()); 
                    // InternalAdeptness.g:1467:3: ( rule__AfterWhen__DuringAssignment_1 )
                    // InternalAdeptness.g:1467:4: rule__AfterWhen__DuringAssignment_1
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
    // InternalAdeptness.g:1475:1: rule__Checks__Alternatives_1 : ( ( ( rule__Checks__NameAssignment_1_0 ) ) | ( ( rule__Checks__EmAssignment_1_1 ) ) );
    public final void rule__Checks__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1479:1: ( ( ( rule__Checks__NameAssignment_1_0 ) ) | ( ( rule__Checks__EmAssignment_1_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT||LA8_0==11||LA8_0==25||(LA8_0>=60 && LA8_0<=64)||LA8_0==66) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAdeptness.g:1480:2: ( ( rule__Checks__NameAssignment_1_0 ) )
                    {
                    // InternalAdeptness.g:1480:2: ( ( rule__Checks__NameAssignment_1_0 ) )
                    // InternalAdeptness.g:1481:3: ( rule__Checks__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getChecksAccess().getNameAssignment_1_0()); 
                    // InternalAdeptness.g:1482:3: ( rule__Checks__NameAssignment_1_0 )
                    // InternalAdeptness.g:1482:4: rule__Checks__NameAssignment_1_0
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
                    // InternalAdeptness.g:1486:2: ( ( rule__Checks__EmAssignment_1_1 ) )
                    {
                    // InternalAdeptness.g:1486:2: ( ( rule__Checks__EmAssignment_1_1 ) )
                    // InternalAdeptness.g:1487:3: ( rule__Checks__EmAssignment_1_1 )
                    {
                     before(grammarAccess.getChecksAccess().getEmAssignment_1_1()); 
                    // InternalAdeptness.g:1488:3: ( rule__Checks__EmAssignment_1_1 )
                    // InternalAdeptness.g:1488:4: rule__Checks__EmAssignment_1_1
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
    // InternalAdeptness.g:1496:1: rule__Reason__Alternatives_0 : ( ( ( rule__Reason__HighPeakAssignment_0_0 ) ) | ( ( rule__Reason__HighTimeAssignment_0_1 ) ) | ( ( rule__Reason__ConstDegAssignment_0_2 ) ) | ( ( rule__Reason__XPeaksAssignment_0_3 ) ) );
    public final void rule__Reason__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1500:1: ( ( ( rule__Reason__HighPeakAssignment_0_0 ) ) | ( ( rule__Reason__HighTimeAssignment_0_1 ) ) | ( ( rule__Reason__ConstDegAssignment_0_2 ) ) | ( ( rule__Reason__XPeaksAssignment_0_3 ) ) )
            int alt9=4;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalAdeptness.g:1501:2: ( ( rule__Reason__HighPeakAssignment_0_0 ) )
                    {
                    // InternalAdeptness.g:1501:2: ( ( rule__Reason__HighPeakAssignment_0_0 ) )
                    // InternalAdeptness.g:1502:3: ( rule__Reason__HighPeakAssignment_0_0 )
                    {
                     before(grammarAccess.getReasonAccess().getHighPeakAssignment_0_0()); 
                    // InternalAdeptness.g:1503:3: ( rule__Reason__HighPeakAssignment_0_0 )
                    // InternalAdeptness.g:1503:4: rule__Reason__HighPeakAssignment_0_0
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
                    // InternalAdeptness.g:1507:2: ( ( rule__Reason__HighTimeAssignment_0_1 ) )
                    {
                    // InternalAdeptness.g:1507:2: ( ( rule__Reason__HighTimeAssignment_0_1 ) )
                    // InternalAdeptness.g:1508:3: ( rule__Reason__HighTimeAssignment_0_1 )
                    {
                     before(grammarAccess.getReasonAccess().getHighTimeAssignment_0_1()); 
                    // InternalAdeptness.g:1509:3: ( rule__Reason__HighTimeAssignment_0_1 )
                    // InternalAdeptness.g:1509:4: rule__Reason__HighTimeAssignment_0_1
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
                    // InternalAdeptness.g:1513:2: ( ( rule__Reason__ConstDegAssignment_0_2 ) )
                    {
                    // InternalAdeptness.g:1513:2: ( ( rule__Reason__ConstDegAssignment_0_2 ) )
                    // InternalAdeptness.g:1514:3: ( rule__Reason__ConstDegAssignment_0_2 )
                    {
                     before(grammarAccess.getReasonAccess().getConstDegAssignment_0_2()); 
                    // InternalAdeptness.g:1515:3: ( rule__Reason__ConstDegAssignment_0_2 )
                    // InternalAdeptness.g:1515:4: rule__Reason__ConstDegAssignment_0_2
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
                    // InternalAdeptness.g:1519:2: ( ( rule__Reason__XPeaksAssignment_0_3 ) )
                    {
                    // InternalAdeptness.g:1519:2: ( ( rule__Reason__XPeaksAssignment_0_3 ) )
                    // InternalAdeptness.g:1520:3: ( rule__Reason__XPeaksAssignment_0_3 )
                    {
                     before(grammarAccess.getReasonAccess().getXPeaksAssignment_0_3()); 
                    // InternalAdeptness.g:1521:3: ( rule__Reason__XPeaksAssignment_0_3 )
                    // InternalAdeptness.g:1521:4: rule__Reason__XPeaksAssignment_0_3
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
    // InternalAdeptness.g:1529:1: rule__Reference__Alternatives_0 : ( ( ( rule__Reference__UpperAssignment_0_0 ) ) | ( ( rule__Reference__LowerAssignment_0_1 ) ) | ( ( rule__Reference__RangeAssignment_0_2 ) ) | ( ( rule__Reference__GapAssignment_0_3 ) ) | ( ( rule__Reference__SameAssignment_0_4 ) ) | ( ( rule__Reference__NotsameAssignment_0_5 ) ) );
    public final void rule__Reference__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1533:1: ( ( ( rule__Reference__UpperAssignment_0_0 ) ) | ( ( rule__Reference__LowerAssignment_0_1 ) ) | ( ( rule__Reference__RangeAssignment_0_2 ) ) | ( ( rule__Reference__GapAssignment_0_3 ) ) | ( ( rule__Reference__SameAssignment_0_4 ) ) | ( ( rule__Reference__NotsameAssignment_0_5 ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt10=1;
                }
                break;
            case 63:
                {
                alt10=2;
                }
                break;
            case 64:
                {
                alt10=3;
                }
                break;
            case 66:
                {
                alt10=4;
                }
                break;
            case 60:
                {
                alt10=5;
                }
                break;
            case 61:
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
                    // InternalAdeptness.g:1534:2: ( ( rule__Reference__UpperAssignment_0_0 ) )
                    {
                    // InternalAdeptness.g:1534:2: ( ( rule__Reference__UpperAssignment_0_0 ) )
                    // InternalAdeptness.g:1535:3: ( rule__Reference__UpperAssignment_0_0 )
                    {
                     before(grammarAccess.getReferenceAccess().getUpperAssignment_0_0()); 
                    // InternalAdeptness.g:1536:3: ( rule__Reference__UpperAssignment_0_0 )
                    // InternalAdeptness.g:1536:4: rule__Reference__UpperAssignment_0_0
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
                    // InternalAdeptness.g:1540:2: ( ( rule__Reference__LowerAssignment_0_1 ) )
                    {
                    // InternalAdeptness.g:1540:2: ( ( rule__Reference__LowerAssignment_0_1 ) )
                    // InternalAdeptness.g:1541:3: ( rule__Reference__LowerAssignment_0_1 )
                    {
                     before(grammarAccess.getReferenceAccess().getLowerAssignment_0_1()); 
                    // InternalAdeptness.g:1542:3: ( rule__Reference__LowerAssignment_0_1 )
                    // InternalAdeptness.g:1542:4: rule__Reference__LowerAssignment_0_1
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
                    // InternalAdeptness.g:1546:2: ( ( rule__Reference__RangeAssignment_0_2 ) )
                    {
                    // InternalAdeptness.g:1546:2: ( ( rule__Reference__RangeAssignment_0_2 ) )
                    // InternalAdeptness.g:1547:3: ( rule__Reference__RangeAssignment_0_2 )
                    {
                     before(grammarAccess.getReferenceAccess().getRangeAssignment_0_2()); 
                    // InternalAdeptness.g:1548:3: ( rule__Reference__RangeAssignment_0_2 )
                    // InternalAdeptness.g:1548:4: rule__Reference__RangeAssignment_0_2
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
                    // InternalAdeptness.g:1552:2: ( ( rule__Reference__GapAssignment_0_3 ) )
                    {
                    // InternalAdeptness.g:1552:2: ( ( rule__Reference__GapAssignment_0_3 ) )
                    // InternalAdeptness.g:1553:3: ( rule__Reference__GapAssignment_0_3 )
                    {
                     before(grammarAccess.getReferenceAccess().getGapAssignment_0_3()); 
                    // InternalAdeptness.g:1554:3: ( rule__Reference__GapAssignment_0_3 )
                    // InternalAdeptness.g:1554:4: rule__Reference__GapAssignment_0_3
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
                    // InternalAdeptness.g:1558:2: ( ( rule__Reference__SameAssignment_0_4 ) )
                    {
                    // InternalAdeptness.g:1558:2: ( ( rule__Reference__SameAssignment_0_4 ) )
                    // InternalAdeptness.g:1559:3: ( rule__Reference__SameAssignment_0_4 )
                    {
                     before(grammarAccess.getReferenceAccess().getSameAssignment_0_4()); 
                    // InternalAdeptness.g:1560:3: ( rule__Reference__SameAssignment_0_4 )
                    // InternalAdeptness.g:1560:4: rule__Reference__SameAssignment_0_4
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
                    // InternalAdeptness.g:1564:2: ( ( rule__Reference__NotsameAssignment_0_5 ) )
                    {
                    // InternalAdeptness.g:1564:2: ( ( rule__Reference__NotsameAssignment_0_5 ) )
                    // InternalAdeptness.g:1565:3: ( rule__Reference__NotsameAssignment_0_5 )
                    {
                     before(grammarAccess.getReferenceAccess().getNotsameAssignment_0_5()); 
                    // InternalAdeptness.g:1566:3: ( rule__Reference__NotsameAssignment_0_5 )
                    // InternalAdeptness.g:1566:4: rule__Reference__NotsameAssignment_0_5
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
    // InternalAdeptness.g:1574:1: rule__Same__Alternatives_2 : ( ( ( rule__Same__TimesAssignment_2_0 ) ) | ( ( rule__Same__TimesAssignment_2_1 ) ) | ( ( rule__Same__TimesAssignment_2_2 ) ) );
    public final void rule__Same__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1578:1: ( ( ( rule__Same__TimesAssignment_2_0 ) ) | ( ( rule__Same__TimesAssignment_2_1 ) ) | ( ( rule__Same__TimesAssignment_2_2 ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt11=1;
                }
                break;
            case 69:
                {
                alt11=2;
                }
                break;
            case 70:
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
                    // InternalAdeptness.g:1579:2: ( ( rule__Same__TimesAssignment_2_0 ) )
                    {
                    // InternalAdeptness.g:1579:2: ( ( rule__Same__TimesAssignment_2_0 ) )
                    // InternalAdeptness.g:1580:3: ( rule__Same__TimesAssignment_2_0 )
                    {
                     before(grammarAccess.getSameAccess().getTimesAssignment_2_0()); 
                    // InternalAdeptness.g:1581:3: ( rule__Same__TimesAssignment_2_0 )
                    // InternalAdeptness.g:1581:4: rule__Same__TimesAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Same__TimesAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSameAccess().getTimesAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1585:2: ( ( rule__Same__TimesAssignment_2_1 ) )
                    {
                    // InternalAdeptness.g:1585:2: ( ( rule__Same__TimesAssignment_2_1 ) )
                    // InternalAdeptness.g:1586:3: ( rule__Same__TimesAssignment_2_1 )
                    {
                     before(grammarAccess.getSameAccess().getTimesAssignment_2_1()); 
                    // InternalAdeptness.g:1587:3: ( rule__Same__TimesAssignment_2_1 )
                    // InternalAdeptness.g:1587:4: rule__Same__TimesAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Same__TimesAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSameAccess().getTimesAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1591:2: ( ( rule__Same__TimesAssignment_2_2 ) )
                    {
                    // InternalAdeptness.g:1591:2: ( ( rule__Same__TimesAssignment_2_2 ) )
                    // InternalAdeptness.g:1592:3: ( rule__Same__TimesAssignment_2_2 )
                    {
                     before(grammarAccess.getSameAccess().getTimesAssignment_2_2()); 
                    // InternalAdeptness.g:1593:3: ( rule__Same__TimesAssignment_2_2 )
                    // InternalAdeptness.g:1593:4: rule__Same__TimesAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Same__TimesAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSameAccess().getTimesAssignment_2_2()); 

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
    // InternalAdeptness.g:1601:1: rule__NotSame__Alternatives_2 : ( ( ( rule__NotSame__TimesAssignment_2_0 ) ) | ( ( rule__NotSame__TimesAssignment_2_1 ) ) | ( ( rule__NotSame__TimesAssignment_2_2 ) ) );
    public final void rule__NotSame__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1605:1: ( ( ( rule__NotSame__TimesAssignment_2_0 ) ) | ( ( rule__NotSame__TimesAssignment_2_1 ) ) | ( ( rule__NotSame__TimesAssignment_2_2 ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt12=1;
                }
                break;
            case 69:
                {
                alt12=2;
                }
                break;
            case 70:
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
                    // InternalAdeptness.g:1606:2: ( ( rule__NotSame__TimesAssignment_2_0 ) )
                    {
                    // InternalAdeptness.g:1606:2: ( ( rule__NotSame__TimesAssignment_2_0 ) )
                    // InternalAdeptness.g:1607:3: ( rule__NotSame__TimesAssignment_2_0 )
                    {
                     before(grammarAccess.getNotSameAccess().getTimesAssignment_2_0()); 
                    // InternalAdeptness.g:1608:3: ( rule__NotSame__TimesAssignment_2_0 )
                    // InternalAdeptness.g:1608:4: rule__NotSame__TimesAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NotSame__TimesAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNotSameAccess().getTimesAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1612:2: ( ( rule__NotSame__TimesAssignment_2_1 ) )
                    {
                    // InternalAdeptness.g:1612:2: ( ( rule__NotSame__TimesAssignment_2_1 ) )
                    // InternalAdeptness.g:1613:3: ( rule__NotSame__TimesAssignment_2_1 )
                    {
                     before(grammarAccess.getNotSameAccess().getTimesAssignment_2_1()); 
                    // InternalAdeptness.g:1614:3: ( rule__NotSame__TimesAssignment_2_1 )
                    // InternalAdeptness.g:1614:4: rule__NotSame__TimesAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NotSame__TimesAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNotSameAccess().getTimesAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1618:2: ( ( rule__NotSame__TimesAssignment_2_2 ) )
                    {
                    // InternalAdeptness.g:1618:2: ( ( rule__NotSame__TimesAssignment_2_2 ) )
                    // InternalAdeptness.g:1619:3: ( rule__NotSame__TimesAssignment_2_2 )
                    {
                     before(grammarAccess.getNotSameAccess().getTimesAssignment_2_2()); 
                    // InternalAdeptness.g:1620:3: ( rule__NotSame__TimesAssignment_2_2 )
                    // InternalAdeptness.g:1620:4: rule__NotSame__TimesAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__NotSame__TimesAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getNotSameAccess().getTimesAssignment_2_2()); 

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
    // InternalAdeptness.g:1628:1: rule__Upper__Alternatives_2 : ( ( ( rule__Upper__TimesAssignment_2_0 ) ) | ( ( rule__Upper__TimesAssignment_2_1 ) ) | ( ( rule__Upper__TimesAssignment_2_2 ) ) );
    public final void rule__Upper__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1632:1: ( ( ( rule__Upper__TimesAssignment_2_0 ) ) | ( ( rule__Upper__TimesAssignment_2_1 ) ) | ( ( rule__Upper__TimesAssignment_2_2 ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt13=1;
                }
                break;
            case 69:
                {
                alt13=2;
                }
                break;
            case 70:
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
                    // InternalAdeptness.g:1633:2: ( ( rule__Upper__TimesAssignment_2_0 ) )
                    {
                    // InternalAdeptness.g:1633:2: ( ( rule__Upper__TimesAssignment_2_0 ) )
                    // InternalAdeptness.g:1634:3: ( rule__Upper__TimesAssignment_2_0 )
                    {
                     before(grammarAccess.getUpperAccess().getTimesAssignment_2_0()); 
                    // InternalAdeptness.g:1635:3: ( rule__Upper__TimesAssignment_2_0 )
                    // InternalAdeptness.g:1635:4: rule__Upper__TimesAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Upper__TimesAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUpperAccess().getTimesAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1639:2: ( ( rule__Upper__TimesAssignment_2_1 ) )
                    {
                    // InternalAdeptness.g:1639:2: ( ( rule__Upper__TimesAssignment_2_1 ) )
                    // InternalAdeptness.g:1640:3: ( rule__Upper__TimesAssignment_2_1 )
                    {
                     before(grammarAccess.getUpperAccess().getTimesAssignment_2_1()); 
                    // InternalAdeptness.g:1641:3: ( rule__Upper__TimesAssignment_2_1 )
                    // InternalAdeptness.g:1641:4: rule__Upper__TimesAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Upper__TimesAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getUpperAccess().getTimesAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1645:2: ( ( rule__Upper__TimesAssignment_2_2 ) )
                    {
                    // InternalAdeptness.g:1645:2: ( ( rule__Upper__TimesAssignment_2_2 ) )
                    // InternalAdeptness.g:1646:3: ( rule__Upper__TimesAssignment_2_2 )
                    {
                     before(grammarAccess.getUpperAccess().getTimesAssignment_2_2()); 
                    // InternalAdeptness.g:1647:3: ( rule__Upper__TimesAssignment_2_2 )
                    // InternalAdeptness.g:1647:4: rule__Upper__TimesAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Upper__TimesAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getUpperAccess().getTimesAssignment_2_2()); 

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
    // InternalAdeptness.g:1655:1: rule__Lower__Alternatives_2 : ( ( ( rule__Lower__TimesAssignment_2_0 ) ) | ( ( rule__Lower__TimesAssignment_2_1 ) ) | ( ( rule__Lower__TimesAssignment_2_2 ) ) );
    public final void rule__Lower__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1659:1: ( ( ( rule__Lower__TimesAssignment_2_0 ) ) | ( ( rule__Lower__TimesAssignment_2_1 ) ) | ( ( rule__Lower__TimesAssignment_2_2 ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt14=1;
                }
                break;
            case 69:
                {
                alt14=2;
                }
                break;
            case 70:
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
                    // InternalAdeptness.g:1660:2: ( ( rule__Lower__TimesAssignment_2_0 ) )
                    {
                    // InternalAdeptness.g:1660:2: ( ( rule__Lower__TimesAssignment_2_0 ) )
                    // InternalAdeptness.g:1661:3: ( rule__Lower__TimesAssignment_2_0 )
                    {
                     before(grammarAccess.getLowerAccess().getTimesAssignment_2_0()); 
                    // InternalAdeptness.g:1662:3: ( rule__Lower__TimesAssignment_2_0 )
                    // InternalAdeptness.g:1662:4: rule__Lower__TimesAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lower__TimesAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLowerAccess().getTimesAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1666:2: ( ( rule__Lower__TimesAssignment_2_1 ) )
                    {
                    // InternalAdeptness.g:1666:2: ( ( rule__Lower__TimesAssignment_2_1 ) )
                    // InternalAdeptness.g:1667:3: ( rule__Lower__TimesAssignment_2_1 )
                    {
                     before(grammarAccess.getLowerAccess().getTimesAssignment_2_1()); 
                    // InternalAdeptness.g:1668:3: ( rule__Lower__TimesAssignment_2_1 )
                    // InternalAdeptness.g:1668:4: rule__Lower__TimesAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lower__TimesAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLowerAccess().getTimesAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1672:2: ( ( rule__Lower__TimesAssignment_2_2 ) )
                    {
                    // InternalAdeptness.g:1672:2: ( ( rule__Lower__TimesAssignment_2_2 ) )
                    // InternalAdeptness.g:1673:3: ( rule__Lower__TimesAssignment_2_2 )
                    {
                     before(grammarAccess.getLowerAccess().getTimesAssignment_2_2()); 
                    // InternalAdeptness.g:1674:3: ( rule__Lower__TimesAssignment_2_2 )
                    // InternalAdeptness.g:1674:4: rule__Lower__TimesAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lower__TimesAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getLowerAccess().getTimesAssignment_2_2()); 

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
    // InternalAdeptness.g:1682:1: rule__Range__Alternatives_4 : ( ( ( rule__Range__TimesAssignment_4_0 ) ) | ( ( rule__Range__TimesAssignment_4_1 ) ) | ( ( rule__Range__TimesAssignment_4_2 ) ) );
    public final void rule__Range__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1686:1: ( ( ( rule__Range__TimesAssignment_4_0 ) ) | ( ( rule__Range__TimesAssignment_4_1 ) ) | ( ( rule__Range__TimesAssignment_4_2 ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt15=1;
                }
                break;
            case 69:
                {
                alt15=2;
                }
                break;
            case 70:
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
                    // InternalAdeptness.g:1687:2: ( ( rule__Range__TimesAssignment_4_0 ) )
                    {
                    // InternalAdeptness.g:1687:2: ( ( rule__Range__TimesAssignment_4_0 ) )
                    // InternalAdeptness.g:1688:3: ( rule__Range__TimesAssignment_4_0 )
                    {
                     before(grammarAccess.getRangeAccess().getTimesAssignment_4_0()); 
                    // InternalAdeptness.g:1689:3: ( rule__Range__TimesAssignment_4_0 )
                    // InternalAdeptness.g:1689:4: rule__Range__TimesAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Range__TimesAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRangeAccess().getTimesAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1693:2: ( ( rule__Range__TimesAssignment_4_1 ) )
                    {
                    // InternalAdeptness.g:1693:2: ( ( rule__Range__TimesAssignment_4_1 ) )
                    // InternalAdeptness.g:1694:3: ( rule__Range__TimesAssignment_4_1 )
                    {
                     before(grammarAccess.getRangeAccess().getTimesAssignment_4_1()); 
                    // InternalAdeptness.g:1695:3: ( rule__Range__TimesAssignment_4_1 )
                    // InternalAdeptness.g:1695:4: rule__Range__TimesAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Range__TimesAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRangeAccess().getTimesAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1699:2: ( ( rule__Range__TimesAssignment_4_2 ) )
                    {
                    // InternalAdeptness.g:1699:2: ( ( rule__Range__TimesAssignment_4_2 ) )
                    // InternalAdeptness.g:1700:3: ( rule__Range__TimesAssignment_4_2 )
                    {
                     before(grammarAccess.getRangeAccess().getTimesAssignment_4_2()); 
                    // InternalAdeptness.g:1701:3: ( rule__Range__TimesAssignment_4_2 )
                    // InternalAdeptness.g:1701:4: rule__Range__TimesAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Range__TimesAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getRangeAccess().getTimesAssignment_4_2()); 

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
    // InternalAdeptness.g:1709:1: rule__Gap__Alternatives_4 : ( ( ( rule__Gap__TimesAssignment_4_0 ) ) | ( ( rule__Gap__TimesAssignment_4_1 ) ) | ( ( rule__Gap__TimesAssignment_4_2 ) ) );
    public final void rule__Gap__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1713:1: ( ( ( rule__Gap__TimesAssignment_4_0 ) ) | ( ( rule__Gap__TimesAssignment_4_1 ) ) | ( ( rule__Gap__TimesAssignment_4_2 ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt16=1;
                }
                break;
            case 69:
                {
                alt16=2;
                }
                break;
            case 70:
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
                    // InternalAdeptness.g:1714:2: ( ( rule__Gap__TimesAssignment_4_0 ) )
                    {
                    // InternalAdeptness.g:1714:2: ( ( rule__Gap__TimesAssignment_4_0 ) )
                    // InternalAdeptness.g:1715:3: ( rule__Gap__TimesAssignment_4_0 )
                    {
                     before(grammarAccess.getGapAccess().getTimesAssignment_4_0()); 
                    // InternalAdeptness.g:1716:3: ( rule__Gap__TimesAssignment_4_0 )
                    // InternalAdeptness.g:1716:4: rule__Gap__TimesAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gap__TimesAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGapAccess().getTimesAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1720:2: ( ( rule__Gap__TimesAssignment_4_1 ) )
                    {
                    // InternalAdeptness.g:1720:2: ( ( rule__Gap__TimesAssignment_4_1 ) )
                    // InternalAdeptness.g:1721:3: ( rule__Gap__TimesAssignment_4_1 )
                    {
                     before(grammarAccess.getGapAccess().getTimesAssignment_4_1()); 
                    // InternalAdeptness.g:1722:3: ( rule__Gap__TimesAssignment_4_1 )
                    // InternalAdeptness.g:1722:4: rule__Gap__TimesAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gap__TimesAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGapAccess().getTimesAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1726:2: ( ( rule__Gap__TimesAssignment_4_2 ) )
                    {
                    // InternalAdeptness.g:1726:2: ( ( rule__Gap__TimesAssignment_4_2 ) )
                    // InternalAdeptness.g:1727:3: ( rule__Gap__TimesAssignment_4_2 )
                    {
                     before(grammarAccess.getGapAccess().getTimesAssignment_4_2()); 
                    // InternalAdeptness.g:1728:3: ( rule__Gap__TimesAssignment_4_2 )
                    // InternalAdeptness.g:1728:4: rule__Gap__TimesAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gap__TimesAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getGapAccess().getTimesAssignment_4_2()); 

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
    // InternalAdeptness.g:1736:1: rule__Exactly__Alternatives_2 : ( ( 'times' ) | ( ( rule__Exactly__Group_2_1__0 ) ) | ( ( rule__Exactly__UnitAssignment_2_2 ) ) );
    public final void rule__Exactly__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1740:1: ( ( 'times' ) | ( ( rule__Exactly__Group_2_1__0 ) ) | ( ( rule__Exactly__UnitAssignment_2_2 ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt17=1;
                }
                break;
            case 68:
                {
                alt17=2;
                }
                break;
            case 78:
            case 79:
            case 80:
            case 81:
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
                    // InternalAdeptness.g:1741:2: ( 'times' )
                    {
                    // InternalAdeptness.g:1741:2: ( 'times' )
                    // InternalAdeptness.g:1742:3: 'times'
                    {
                     before(grammarAccess.getExactlyAccess().getTimesKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getExactlyAccess().getTimesKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1747:2: ( ( rule__Exactly__Group_2_1__0 ) )
                    {
                    // InternalAdeptness.g:1747:2: ( ( rule__Exactly__Group_2_1__0 ) )
                    // InternalAdeptness.g:1748:3: ( rule__Exactly__Group_2_1__0 )
                    {
                     before(grammarAccess.getExactlyAccess().getGroup_2_1()); 
                    // InternalAdeptness.g:1749:3: ( rule__Exactly__Group_2_1__0 )
                    // InternalAdeptness.g:1749:4: rule__Exactly__Group_2_1__0
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
                    // InternalAdeptness.g:1753:2: ( ( rule__Exactly__UnitAssignment_2_2 ) )
                    {
                    // InternalAdeptness.g:1753:2: ( ( rule__Exactly__UnitAssignment_2_2 ) )
                    // InternalAdeptness.g:1754:3: ( rule__Exactly__UnitAssignment_2_2 )
                    {
                     before(grammarAccess.getExactlyAccess().getUnitAssignment_2_2()); 
                    // InternalAdeptness.g:1755:3: ( rule__Exactly__UnitAssignment_2_2 )
                    // InternalAdeptness.g:1755:4: rule__Exactly__UnitAssignment_2_2
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
    // InternalAdeptness.g:1763:1: rule__At_most__Alternatives_2 : ( ( 'times' ) | ( ( rule__At_most__Group_2_1__0 ) ) | ( ( rule__At_most__UnitAssignment_2_2 ) ) );
    public final void rule__At_most__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1767:1: ( ( 'times' ) | ( ( rule__At_most__Group_2_1__0 ) ) | ( ( rule__At_most__UnitAssignment_2_2 ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt18=1;
                }
                break;
            case 68:
                {
                alt18=2;
                }
                break;
            case 78:
            case 79:
            case 80:
            case 81:
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
                    // InternalAdeptness.g:1768:2: ( 'times' )
                    {
                    // InternalAdeptness.g:1768:2: ( 'times' )
                    // InternalAdeptness.g:1769:3: 'times'
                    {
                     before(grammarAccess.getAt_mostAccess().getTimesKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAt_mostAccess().getTimesKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1774:2: ( ( rule__At_most__Group_2_1__0 ) )
                    {
                    // InternalAdeptness.g:1774:2: ( ( rule__At_most__Group_2_1__0 ) )
                    // InternalAdeptness.g:1775:3: ( rule__At_most__Group_2_1__0 )
                    {
                     before(grammarAccess.getAt_mostAccess().getGroup_2_1()); 
                    // InternalAdeptness.g:1776:3: ( rule__At_most__Group_2_1__0 )
                    // InternalAdeptness.g:1776:4: rule__At_most__Group_2_1__0
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
                    // InternalAdeptness.g:1780:2: ( ( rule__At_most__UnitAssignment_2_2 ) )
                    {
                    // InternalAdeptness.g:1780:2: ( ( rule__At_most__UnitAssignment_2_2 ) )
                    // InternalAdeptness.g:1781:3: ( rule__At_most__UnitAssignment_2_2 )
                    {
                     before(grammarAccess.getAt_mostAccess().getUnitAssignment_2_2()); 
                    // InternalAdeptness.g:1782:3: ( rule__At_most__UnitAssignment_2_2 )
                    // InternalAdeptness.g:1782:4: rule__At_most__UnitAssignment_2_2
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
    // InternalAdeptness.g:1790:1: rule__At_least__Alternatives_2 : ( ( 'times' ) | ( ( rule__At_least__Group_2_1__0 ) ) | ( ( rule__At_least__UnitAssignment_2_2 ) ) );
    public final void rule__At_least__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1794:1: ( ( 'times' ) | ( ( rule__At_least__Group_2_1__0 ) ) | ( ( rule__At_least__UnitAssignment_2_2 ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt19=1;
                }
                break;
            case 68:
                {
                alt19=2;
                }
                break;
            case 78:
            case 79:
            case 80:
            case 81:
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
                    // InternalAdeptness.g:1795:2: ( 'times' )
                    {
                    // InternalAdeptness.g:1795:2: ( 'times' )
                    // InternalAdeptness.g:1796:3: 'times'
                    {
                     before(grammarAccess.getAt_leastAccess().getTimesKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAt_leastAccess().getTimesKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1801:2: ( ( rule__At_least__Group_2_1__0 ) )
                    {
                    // InternalAdeptness.g:1801:2: ( ( rule__At_least__Group_2_1__0 ) )
                    // InternalAdeptness.g:1802:3: ( rule__At_least__Group_2_1__0 )
                    {
                     before(grammarAccess.getAt_leastAccess().getGroup_2_1()); 
                    // InternalAdeptness.g:1803:3: ( rule__At_least__Group_2_1__0 )
                    // InternalAdeptness.g:1803:4: rule__At_least__Group_2_1__0
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
                    // InternalAdeptness.g:1807:2: ( ( rule__At_least__UnitAssignment_2_2 ) )
                    {
                    // InternalAdeptness.g:1807:2: ( ( rule__At_least__UnitAssignment_2_2 ) )
                    // InternalAdeptness.g:1808:3: ( rule__At_least__UnitAssignment_2_2 )
                    {
                     before(grammarAccess.getAt_leastAccess().getUnitAssignment_2_2()); 
                    // InternalAdeptness.g:1809:3: ( rule__At_least__UnitAssignment_2_2 )
                    // InternalAdeptness.g:1809:4: rule__At_least__UnitAssignment_2_2
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
    // InternalAdeptness.g:1817:1: rule__Bound_up__Alternatives : ( ( ( rule__Bound_up__ValueAssignment_0 ) ) | ( ( rule__Bound_up__EmAssignment_1 ) ) );
    public final void rule__Bound_up__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1821:1: ( ( ( rule__Bound_up__ValueAssignment_0 ) ) | ( ( rule__Bound_up__EmAssignment_1 ) ) )
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
            case 54:
            case 67:
            case 69:
            case 70:
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
                    // InternalAdeptness.g:1822:2: ( ( rule__Bound_up__ValueAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1822:2: ( ( rule__Bound_up__ValueAssignment_0 ) )
                    // InternalAdeptness.g:1823:3: ( rule__Bound_up__ValueAssignment_0 )
                    {
                     before(grammarAccess.getBound_upAccess().getValueAssignment_0()); 
                    // InternalAdeptness.g:1824:3: ( rule__Bound_up__ValueAssignment_0 )
                    // InternalAdeptness.g:1824:4: rule__Bound_up__ValueAssignment_0
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
                    // InternalAdeptness.g:1828:2: ( ( rule__Bound_up__EmAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1828:2: ( ( rule__Bound_up__EmAssignment_1 ) )
                    // InternalAdeptness.g:1829:3: ( rule__Bound_up__EmAssignment_1 )
                    {
                     before(grammarAccess.getBound_upAccess().getEmAssignment_1()); 
                    // InternalAdeptness.g:1830:3: ( rule__Bound_up__EmAssignment_1 )
                    // InternalAdeptness.g:1830:4: rule__Bound_up__EmAssignment_1
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
    // InternalAdeptness.g:1838:1: rule__Bound_Down__Alternatives : ( ( ( rule__Bound_Down__ValueAssignment_0 ) ) | ( ( rule__Bound_Down__EmAssignment_1 ) ) );
    public final void rule__Bound_Down__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1842:1: ( ( ( rule__Bound_Down__ValueAssignment_0 ) ) | ( ( rule__Bound_Down__EmAssignment_1 ) ) )
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
            case 54:
            case 65:
            case 67:
            case 69:
            case 70:
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
                    // InternalAdeptness.g:1843:2: ( ( rule__Bound_Down__ValueAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1843:2: ( ( rule__Bound_Down__ValueAssignment_0 ) )
                    // InternalAdeptness.g:1844:3: ( rule__Bound_Down__ValueAssignment_0 )
                    {
                     before(grammarAccess.getBound_DownAccess().getValueAssignment_0()); 
                    // InternalAdeptness.g:1845:3: ( rule__Bound_Down__ValueAssignment_0 )
                    // InternalAdeptness.g:1845:4: rule__Bound_Down__ValueAssignment_0
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
                    // InternalAdeptness.g:1849:2: ( ( rule__Bound_Down__EmAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1849:2: ( ( rule__Bound_Down__EmAssignment_1 ) )
                    // InternalAdeptness.g:1850:3: ( rule__Bound_Down__EmAssignment_1 )
                    {
                     before(grammarAccess.getBound_DownAccess().getEmAssignment_1()); 
                    // InternalAdeptness.g:1851:3: ( rule__Bound_Down__EmAssignment_1 )
                    // InternalAdeptness.g:1851:4: rule__Bound_Down__EmAssignment_1
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
    // InternalAdeptness.g:1859:1: rule__B__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__B__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1863:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalAdeptness.g:1864:2: ( 'true' )
                    {
                    // InternalAdeptness.g:1864:2: ( 'true' )
                    // InternalAdeptness.g:1865:3: 'true'
                    {
                     before(grammarAccess.getBAccess().getTrueKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1870:2: ( 'false' )
                    {
                    // InternalAdeptness.g:1870:2: ( 'false' )
                    // InternalAdeptness.g:1871:3: 'false'
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
    // InternalAdeptness.g:1880:1: rule__TimeType__Alternatives : ( ( ( rule__TimeType__TimeAssignment_0 ) ) | ( ( rule__TimeType__TimeAssignment_1 ) ) | ( ( rule__TimeType__TimeAssignment_2 ) ) | ( ( rule__TimeType__TimeAssignment_3 ) ) );
    public final void rule__TimeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1884:1: ( ( ( rule__TimeType__TimeAssignment_0 ) ) | ( ( rule__TimeType__TimeAssignment_1 ) ) | ( ( rule__TimeType__TimeAssignment_2 ) ) | ( ( rule__TimeType__TimeAssignment_3 ) ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt23=1;
                }
                break;
            case 79:
                {
                alt23=2;
                }
                break;
            case 80:
                {
                alt23=3;
                }
                break;
            case 81:
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
                    // InternalAdeptness.g:1885:2: ( ( rule__TimeType__TimeAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1885:2: ( ( rule__TimeType__TimeAssignment_0 ) )
                    // InternalAdeptness.g:1886:3: ( rule__TimeType__TimeAssignment_0 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_0()); 
                    // InternalAdeptness.g:1887:3: ( rule__TimeType__TimeAssignment_0 )
                    // InternalAdeptness.g:1887:4: rule__TimeType__TimeAssignment_0
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
                    // InternalAdeptness.g:1891:2: ( ( rule__TimeType__TimeAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1891:2: ( ( rule__TimeType__TimeAssignment_1 ) )
                    // InternalAdeptness.g:1892:3: ( rule__TimeType__TimeAssignment_1 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_1()); 
                    // InternalAdeptness.g:1893:3: ( rule__TimeType__TimeAssignment_1 )
                    // InternalAdeptness.g:1893:4: rule__TimeType__TimeAssignment_1
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
                    // InternalAdeptness.g:1897:2: ( ( rule__TimeType__TimeAssignment_2 ) )
                    {
                    // InternalAdeptness.g:1897:2: ( ( rule__TimeType__TimeAssignment_2 ) )
                    // InternalAdeptness.g:1898:3: ( rule__TimeType__TimeAssignment_2 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_2()); 
                    // InternalAdeptness.g:1899:3: ( rule__TimeType__TimeAssignment_2 )
                    // InternalAdeptness.g:1899:4: rule__TimeType__TimeAssignment_2
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
                    // InternalAdeptness.g:1903:2: ( ( rule__TimeType__TimeAssignment_3 ) )
                    {
                    // InternalAdeptness.g:1903:2: ( ( rule__TimeType__TimeAssignment_3 ) )
                    // InternalAdeptness.g:1904:3: ( rule__TimeType__TimeAssignment_3 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_3()); 
                    // InternalAdeptness.g:1905:3: ( rule__TimeType__TimeAssignment_3 )
                    // InternalAdeptness.g:1905:4: rule__TimeType__TimeAssignment_3
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
    // InternalAdeptness.g:1913:1: rule__AbstractElement2__Alternatives_1 : ( ( ( rule__AbstractElement2__NameAssignment_1_0 ) ) | ( ( rule__AbstractElement2__ValueAssignment_1_1 ) ) );
    public final void rule__AbstractElement2__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1917:1: ( ( ( rule__AbstractElement2__NameAssignment_1_0 ) ) | ( ( rule__AbstractElement2__ValueAssignment_1_1 ) ) )
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
                    // InternalAdeptness.g:1918:2: ( ( rule__AbstractElement2__NameAssignment_1_0 ) )
                    {
                    // InternalAdeptness.g:1918:2: ( ( rule__AbstractElement2__NameAssignment_1_0 ) )
                    // InternalAdeptness.g:1919:3: ( rule__AbstractElement2__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getAbstractElement2Access().getNameAssignment_1_0()); 
                    // InternalAdeptness.g:1920:3: ( rule__AbstractElement2__NameAssignment_1_0 )
                    // InternalAdeptness.g:1920:4: rule__AbstractElement2__NameAssignment_1_0
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
                    // InternalAdeptness.g:1924:2: ( ( rule__AbstractElement2__ValueAssignment_1_1 ) )
                    {
                    // InternalAdeptness.g:1924:2: ( ( rule__AbstractElement2__ValueAssignment_1_1 ) )
                    // InternalAdeptness.g:1925:3: ( rule__AbstractElement2__ValueAssignment_1_1 )
                    {
                     before(grammarAccess.getAbstractElement2Access().getValueAssignment_1_1()); 
                    // InternalAdeptness.g:1926:3: ( rule__AbstractElement2__ValueAssignment_1_1 )
                    // InternalAdeptness.g:1926:4: rule__AbstractElement2__ValueAssignment_1_1
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
    // InternalAdeptness.g:1934:1: rule__Operators__Alternatives : ( ( ( rule__Operators__OperatorAssignment_0 ) ) | ( ( rule__Operators__ComparationAssignment_1 ) ) | ( ( rule__Operators__LogicOperatorAssignment_2 ) ) | ( ( rule__Operators__BackParenthesesAssignment_3 ) ) );
    public final void rule__Operators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1938:1: ( ( ( rule__Operators__OperatorAssignment_0 ) ) | ( ( rule__Operators__ComparationAssignment_1 ) ) | ( ( rule__Operators__LogicOperatorAssignment_2 ) ) | ( ( rule__Operators__BackParenthesesAssignment_3 ) ) )
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
                    // InternalAdeptness.g:1939:2: ( ( rule__Operators__OperatorAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1939:2: ( ( rule__Operators__OperatorAssignment_0 ) )
                    // InternalAdeptness.g:1940:3: ( rule__Operators__OperatorAssignment_0 )
                    {
                     before(grammarAccess.getOperatorsAccess().getOperatorAssignment_0()); 
                    // InternalAdeptness.g:1941:3: ( rule__Operators__OperatorAssignment_0 )
                    // InternalAdeptness.g:1941:4: rule__Operators__OperatorAssignment_0
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
                    // InternalAdeptness.g:1945:2: ( ( rule__Operators__ComparationAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1945:2: ( ( rule__Operators__ComparationAssignment_1 ) )
                    // InternalAdeptness.g:1946:3: ( rule__Operators__ComparationAssignment_1 )
                    {
                     before(grammarAccess.getOperatorsAccess().getComparationAssignment_1()); 
                    // InternalAdeptness.g:1947:3: ( rule__Operators__ComparationAssignment_1 )
                    // InternalAdeptness.g:1947:4: rule__Operators__ComparationAssignment_1
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
                    // InternalAdeptness.g:1951:2: ( ( rule__Operators__LogicOperatorAssignment_2 ) )
                    {
                    // InternalAdeptness.g:1951:2: ( ( rule__Operators__LogicOperatorAssignment_2 ) )
                    // InternalAdeptness.g:1952:3: ( rule__Operators__LogicOperatorAssignment_2 )
                    {
                     before(grammarAccess.getOperatorsAccess().getLogicOperatorAssignment_2()); 
                    // InternalAdeptness.g:1953:3: ( rule__Operators__LogicOperatorAssignment_2 )
                    // InternalAdeptness.g:1953:4: rule__Operators__LogicOperatorAssignment_2
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
                    // InternalAdeptness.g:1957:2: ( ( rule__Operators__BackParenthesesAssignment_3 ) )
                    {
                    // InternalAdeptness.g:1957:2: ( ( rule__Operators__BackParenthesesAssignment_3 ) )
                    // InternalAdeptness.g:1958:3: ( rule__Operators__BackParenthesesAssignment_3 )
                    {
                     before(grammarAccess.getOperatorsAccess().getBackParenthesesAssignment_3()); 
                    // InternalAdeptness.g:1959:3: ( rule__Operators__BackParenthesesAssignment_3 )
                    // InternalAdeptness.g:1959:4: rule__Operators__BackParenthesesAssignment_3
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
    // InternalAdeptness.g:1967:1: rule__CompOp__OpAlternatives_0 : ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '<' ) | ( '>' ) );
    public final void rule__CompOp__OpAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1971:1: ( ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '<' ) | ( '>' ) )
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
                    // InternalAdeptness.g:1972:2: ( '==' )
                    {
                    // InternalAdeptness.g:1972:2: ( '==' )
                    // InternalAdeptness.g:1973:3: '=='
                    {
                     before(grammarAccess.getCompOpAccess().getOpEqualsSignEqualsSignKeyword_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCompOpAccess().getOpEqualsSignEqualsSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1978:2: ( '!=' )
                    {
                    // InternalAdeptness.g:1978:2: ( '!=' )
                    // InternalAdeptness.g:1979:3: '!='
                    {
                     before(grammarAccess.getCompOpAccess().getOpExclamationMarkEqualsSignKeyword_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getCompOpAccess().getOpExclamationMarkEqualsSignKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1984:2: ( '>=' )
                    {
                    // InternalAdeptness.g:1984:2: ( '>=' )
                    // InternalAdeptness.g:1985:3: '>='
                    {
                     before(grammarAccess.getCompOpAccess().getOpGreaterThanSignEqualsSignKeyword_0_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getCompOpAccess().getOpGreaterThanSignEqualsSignKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:1990:2: ( '<=' )
                    {
                    // InternalAdeptness.g:1990:2: ( '<=' )
                    // InternalAdeptness.g:1991:3: '<='
                    {
                     before(grammarAccess.getCompOpAccess().getOpLessThanSignEqualsSignKeyword_0_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getCompOpAccess().getOpLessThanSignEqualsSignKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAdeptness.g:1996:2: ( '<' )
                    {
                    // InternalAdeptness.g:1996:2: ( '<' )
                    // InternalAdeptness.g:1997:3: '<'
                    {
                     before(grammarAccess.getCompOpAccess().getOpLessThanSignKeyword_0_4()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getCompOpAccess().getOpLessThanSignKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAdeptness.g:2002:2: ( '>' )
                    {
                    // InternalAdeptness.g:2002:2: ( '>' )
                    // InternalAdeptness.g:2003:3: '>'
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
    // InternalAdeptness.g:2012:1: rule__LogicOp__OpAlternatives_0 : ( ( '&&' ) | ( '||' ) );
    public final void rule__LogicOp__OpAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2016:1: ( ( '&&' ) | ( '||' ) )
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
                    // InternalAdeptness.g:2017:2: ( '&&' )
                    {
                    // InternalAdeptness.g:2017:2: ( '&&' )
                    // InternalAdeptness.g:2018:3: '&&'
                    {
                     before(grammarAccess.getLogicOpAccess().getOpAmpersandAmpersandKeyword_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getLogicOpAccess().getOpAmpersandAmpersandKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2023:2: ( '||' )
                    {
                    // InternalAdeptness.g:2023:2: ( '||' )
                    // InternalAdeptness.g:2024:3: '||'
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
    // InternalAdeptness.g:2033:1: rule__Op__OpAlternatives_0 : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) );
    public final void rule__Op__OpAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2037:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) )
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
                    // InternalAdeptness.g:2038:2: ( '+' )
                    {
                    // InternalAdeptness.g:2038:2: ( '+' )
                    // InternalAdeptness.g:2039:3: '+'
                    {
                     before(grammarAccess.getOpAccess().getOpPlusSignKeyword_0_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getOpPlusSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2044:2: ( '-' )
                    {
                    // InternalAdeptness.g:2044:2: ( '-' )
                    // InternalAdeptness.g:2045:3: '-'
                    {
                     before(grammarAccess.getOpAccess().getOpHyphenMinusKeyword_0_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getOpHyphenMinusKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:2050:2: ( '*' )
                    {
                    // InternalAdeptness.g:2050:2: ( '*' )
                    // InternalAdeptness.g:2051:3: '*'
                    {
                     before(grammarAccess.getOpAccess().getOpAsteriskKeyword_0_2()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getOpAsteriskKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:2056:2: ( '/' )
                    {
                    // InternalAdeptness.g:2056:2: ( '/' )
                    // InternalAdeptness.g:2057:3: '/'
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
    // InternalAdeptness.g:2066:1: rule__Imports__Group__0 : rule__Imports__Group__0__Impl rule__Imports__Group__1 ;
    public final void rule__Imports__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2070:1: ( rule__Imports__Group__0__Impl rule__Imports__Group__1 )
            // InternalAdeptness.g:2071:2: rule__Imports__Group__0__Impl rule__Imports__Group__1
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
    // InternalAdeptness.g:2078:1: rule__Imports__Group__0__Impl : ( 'import' ) ;
    public final void rule__Imports__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2082:1: ( ( 'import' ) )
            // InternalAdeptness.g:2083:1: ( 'import' )
            {
            // InternalAdeptness.g:2083:1: ( 'import' )
            // InternalAdeptness.g:2084:2: 'import'
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
    // InternalAdeptness.g:2093:1: rule__Imports__Group__1 : rule__Imports__Group__1__Impl ;
    public final void rule__Imports__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2097:1: ( rule__Imports__Group__1__Impl )
            // InternalAdeptness.g:2098:2: rule__Imports__Group__1__Impl
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
    // InternalAdeptness.g:2104:1: rule__Imports__Group__1__Impl : ( ( rule__Imports__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Imports__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2108:1: ( ( ( rule__Imports__ImportedNamespaceAssignment_1 ) ) )
            // InternalAdeptness.g:2109:1: ( ( rule__Imports__ImportedNamespaceAssignment_1 ) )
            {
            // InternalAdeptness.g:2109:1: ( ( rule__Imports__ImportedNamespaceAssignment_1 ) )
            // InternalAdeptness.g:2110:2: ( rule__Imports__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportsAccess().getImportedNamespaceAssignment_1()); 
            // InternalAdeptness.g:2111:2: ( rule__Imports__ImportedNamespaceAssignment_1 )
            // InternalAdeptness.g:2111:3: rule__Imports__ImportedNamespaceAssignment_1
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
    // InternalAdeptness.g:2120:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2124:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalAdeptness.g:2125:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalAdeptness.g:2132:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2136:1: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:2137:1: ( ruleQualifiedName )
            {
            // InternalAdeptness.g:2137:1: ( ruleQualifiedName )
            // InternalAdeptness.g:2138:2: ruleQualifiedName
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
    // InternalAdeptness.g:2147:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2151:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalAdeptness.g:2152:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalAdeptness.g:2158:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2162:1: ( ( ( '.*' )? ) )
            // InternalAdeptness.g:2163:1: ( ( '.*' )? )
            {
            // InternalAdeptness.g:2163:1: ( ( '.*' )? )
            // InternalAdeptness.g:2164:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalAdeptness.g:2165:2: ( '.*' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAdeptness.g:2165:3: '.*'
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
    // InternalAdeptness.g:2174:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2178:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAdeptness.g:2179:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalAdeptness.g:2186:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2190:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:2191:1: ( RULE_ID )
            {
            // InternalAdeptness.g:2191:1: ( RULE_ID )
            // InternalAdeptness.g:2192:2: RULE_ID
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
    // InternalAdeptness.g:2201:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2205:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAdeptness.g:2206:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAdeptness.g:2212:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2216:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAdeptness.g:2217:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAdeptness.g:2217:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAdeptness.g:2218:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAdeptness.g:2219:2: ( rule__QualifiedName__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==30) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAdeptness.g:2219:3: rule__QualifiedName__Group_1__0
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
    // InternalAdeptness.g:2228:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2232:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAdeptness.g:2233:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalAdeptness.g:2240:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2244:1: ( ( '.' ) )
            // InternalAdeptness.g:2245:1: ( '.' )
            {
            // InternalAdeptness.g:2245:1: ( '.' )
            // InternalAdeptness.g:2246:2: '.'
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
    // InternalAdeptness.g:2255:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2259:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAdeptness.g:2260:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAdeptness.g:2266:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2270:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:2271:1: ( RULE_ID )
            {
            // InternalAdeptness.g:2271:1: ( RULE_ID )
            // InternalAdeptness.g:2272:2: RULE_ID
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
    // InternalAdeptness.g:2282:1: rule__MonitoringFile__Group__0 : rule__MonitoringFile__Group__0__Impl rule__MonitoringFile__Group__1 ;
    public final void rule__MonitoringFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2286:1: ( rule__MonitoringFile__Group__0__Impl rule__MonitoringFile__Group__1 )
            // InternalAdeptness.g:2287:2: rule__MonitoringFile__Group__0__Impl rule__MonitoringFile__Group__1
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
    // InternalAdeptness.g:2294:1: rule__MonitoringFile__Group__0__Impl : ( 'MONITORINGPLAN' ) ;
    public final void rule__MonitoringFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2298:1: ( ( 'MONITORINGPLAN' ) )
            // InternalAdeptness.g:2299:1: ( 'MONITORINGPLAN' )
            {
            // InternalAdeptness.g:2299:1: ( 'MONITORINGPLAN' )
            // InternalAdeptness.g:2300:2: 'MONITORINGPLAN'
            {
             before(grammarAccess.getMonitoringFileAccess().getMONITORINGPLANKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAdeptness.g:2309:1: rule__MonitoringFile__Group__1 : rule__MonitoringFile__Group__1__Impl rule__MonitoringFile__Group__2 ;
    public final void rule__MonitoringFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2313:1: ( rule__MonitoringFile__Group__1__Impl rule__MonitoringFile__Group__2 )
            // InternalAdeptness.g:2314:2: rule__MonitoringFile__Group__1__Impl rule__MonitoringFile__Group__2
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
    // InternalAdeptness.g:2321:1: rule__MonitoringFile__Group__1__Impl : ( ( rule__MonitoringFile__NameAssignment_1 ) ) ;
    public final void rule__MonitoringFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2325:1: ( ( ( rule__MonitoringFile__NameAssignment_1 ) ) )
            // InternalAdeptness.g:2326:1: ( ( rule__MonitoringFile__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:2326:1: ( ( rule__MonitoringFile__NameAssignment_1 ) )
            // InternalAdeptness.g:2327:2: ( rule__MonitoringFile__NameAssignment_1 )
            {
             before(grammarAccess.getMonitoringFileAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:2328:2: ( rule__MonitoringFile__NameAssignment_1 )
            // InternalAdeptness.g:2328:3: rule__MonitoringFile__NameAssignment_1
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
    // InternalAdeptness.g:2336:1: rule__MonitoringFile__Group__2 : rule__MonitoringFile__Group__2__Impl rule__MonitoringFile__Group__3 ;
    public final void rule__MonitoringFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2340:1: ( rule__MonitoringFile__Group__2__Impl rule__MonitoringFile__Group__3 )
            // InternalAdeptness.g:2341:2: rule__MonitoringFile__Group__2__Impl rule__MonitoringFile__Group__3
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
    // InternalAdeptness.g:2348:1: rule__MonitoringFile__Group__2__Impl : ( ':' ) ;
    public final void rule__MonitoringFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2352:1: ( ( ':' ) )
            // InternalAdeptness.g:2353:1: ( ':' )
            {
            // InternalAdeptness.g:2353:1: ( ':' )
            // InternalAdeptness.g:2354:2: ':'
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
    // InternalAdeptness.g:2363:1: rule__MonitoringFile__Group__3 : rule__MonitoringFile__Group__3__Impl rule__MonitoringFile__Group__4 ;
    public final void rule__MonitoringFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2367:1: ( rule__MonitoringFile__Group__3__Impl rule__MonitoringFile__Group__4 )
            // InternalAdeptness.g:2368:2: rule__MonitoringFile__Group__3__Impl rule__MonitoringFile__Group__4
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
    // InternalAdeptness.g:2375:1: rule__MonitoringFile__Group__3__Impl : ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) ) ;
    public final void rule__MonitoringFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2379:1: ( ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) ) )
            // InternalAdeptness.g:2380:1: ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) )
            {
            // InternalAdeptness.g:2380:1: ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) )
            // InternalAdeptness.g:2381:2: ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* )
            {
            // InternalAdeptness.g:2381:2: ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) )
            // InternalAdeptness.g:2382:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )
            {
             before(grammarAccess.getMonitoringFileAccess().getMonitoringPlanAssignment_3()); 
            // InternalAdeptness.g:2383:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )
            // InternalAdeptness.g:2383:4: rule__MonitoringFile__MonitoringPlanAssignment_3
            {
            pushFollow(FOLLOW_12);
            rule__MonitoringFile__MonitoringPlanAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMonitoringFileAccess().getMonitoringPlanAssignment_3()); 

            }

            // InternalAdeptness.g:2386:2: ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* )
            // InternalAdeptness.g:2387:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )*
            {
             before(grammarAccess.getMonitoringFileAccess().getMonitoringPlanAssignment_3()); 
            // InternalAdeptness.g:2388:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==34) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAdeptness.g:2388:4: rule__MonitoringFile__MonitoringPlanAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__MonitoringFile__MonitoringPlanAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalAdeptness.g:2397:1: rule__MonitoringFile__Group__4 : rule__MonitoringFile__Group__4__Impl ;
    public final void rule__MonitoringFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2401:1: ( rule__MonitoringFile__Group__4__Impl )
            // InternalAdeptness.g:2402:2: rule__MonitoringFile__Group__4__Impl
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
    // InternalAdeptness.g:2408:1: rule__MonitoringFile__Group__4__Impl : ( 'ENDMONITORINGPLAN' ) ;
    public final void rule__MonitoringFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2412:1: ( ( 'ENDMONITORINGPLAN' ) )
            // InternalAdeptness.g:2413:1: ( 'ENDMONITORINGPLAN' )
            {
            // InternalAdeptness.g:2413:1: ( 'ENDMONITORINGPLAN' )
            // InternalAdeptness.g:2414:2: 'ENDMONITORINGPLAN'
            {
             before(grammarAccess.getMonitoringFileAccess().getENDMONITORINGPLANKeyword_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalAdeptness.g:2424:1: rule__MonitoringVariable__Group__0 : rule__MonitoringVariable__Group__0__Impl rule__MonitoringVariable__Group__1 ;
    public final void rule__MonitoringVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2428:1: ( rule__MonitoringVariable__Group__0__Impl rule__MonitoringVariable__Group__1 )
            // InternalAdeptness.g:2429:2: rule__MonitoringVariable__Group__0__Impl rule__MonitoringVariable__Group__1
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
    // InternalAdeptness.g:2436:1: rule__MonitoringVariable__Group__0__Impl : ( 'MONITOR' ) ;
    public final void rule__MonitoringVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2440:1: ( ( 'MONITOR' ) )
            // InternalAdeptness.g:2441:1: ( 'MONITOR' )
            {
            // InternalAdeptness.g:2441:1: ( 'MONITOR' )
            // InternalAdeptness.g:2442:2: 'MONITOR'
            {
             before(grammarAccess.getMonitoringVariableAccess().getMONITORKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdeptness.g:2451:1: rule__MonitoringVariable__Group__1 : rule__MonitoringVariable__Group__1__Impl rule__MonitoringVariable__Group__2 ;
    public final void rule__MonitoringVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2455:1: ( rule__MonitoringVariable__Group__1__Impl rule__MonitoringVariable__Group__2 )
            // InternalAdeptness.g:2456:2: rule__MonitoringVariable__Group__1__Impl rule__MonitoringVariable__Group__2
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
    // InternalAdeptness.g:2463:1: rule__MonitoringVariable__Group__1__Impl : ( ( rule__MonitoringVariable__NameAssignment_1 ) ) ;
    public final void rule__MonitoringVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2467:1: ( ( ( rule__MonitoringVariable__NameAssignment_1 ) ) )
            // InternalAdeptness.g:2468:1: ( ( rule__MonitoringVariable__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:2468:1: ( ( rule__MonitoringVariable__NameAssignment_1 ) )
            // InternalAdeptness.g:2469:2: ( rule__MonitoringVariable__NameAssignment_1 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:2470:2: ( rule__MonitoringVariable__NameAssignment_1 )
            // InternalAdeptness.g:2470:3: rule__MonitoringVariable__NameAssignment_1
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
    // InternalAdeptness.g:2478:1: rule__MonitoringVariable__Group__2 : rule__MonitoringVariable__Group__2__Impl rule__MonitoringVariable__Group__3 ;
    public final void rule__MonitoringVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2482:1: ( rule__MonitoringVariable__Group__2__Impl rule__MonitoringVariable__Group__3 )
            // InternalAdeptness.g:2483:2: rule__MonitoringVariable__Group__2__Impl rule__MonitoringVariable__Group__3
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
    // InternalAdeptness.g:2490:1: rule__MonitoringVariable__Group__2__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2494:1: ( ( ':' ) )
            // InternalAdeptness.g:2495:1: ( ':' )
            {
            // InternalAdeptness.g:2495:1: ( ':' )
            // InternalAdeptness.g:2496:2: ':'
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
    // InternalAdeptness.g:2505:1: rule__MonitoringVariable__Group__3 : rule__MonitoringVariable__Group__3__Impl rule__MonitoringVariable__Group__4 ;
    public final void rule__MonitoringVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2509:1: ( rule__MonitoringVariable__Group__3__Impl rule__MonitoringVariable__Group__4 )
            // InternalAdeptness.g:2510:2: rule__MonitoringVariable__Group__3__Impl rule__MonitoringVariable__Group__4
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
    // InternalAdeptness.g:2517:1: rule__MonitoringVariable__Group__3__Impl : ( 'type' ) ;
    public final void rule__MonitoringVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2521:1: ( ( 'type' ) )
            // InternalAdeptness.g:2522:1: ( 'type' )
            {
            // InternalAdeptness.g:2522:1: ( 'type' )
            // InternalAdeptness.g:2523:2: 'type'
            {
             before(grammarAccess.getMonitoringVariableAccess().getTypeKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdeptness.g:2532:1: rule__MonitoringVariable__Group__4 : rule__MonitoringVariable__Group__4__Impl rule__MonitoringVariable__Group__5 ;
    public final void rule__MonitoringVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2536:1: ( rule__MonitoringVariable__Group__4__Impl rule__MonitoringVariable__Group__5 )
            // InternalAdeptness.g:2537:2: rule__MonitoringVariable__Group__4__Impl rule__MonitoringVariable__Group__5
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
    // InternalAdeptness.g:2544:1: rule__MonitoringVariable__Group__4__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2548:1: ( ( ':' ) )
            // InternalAdeptness.g:2549:1: ( ':' )
            {
            // InternalAdeptness.g:2549:1: ( ':' )
            // InternalAdeptness.g:2550:2: ':'
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
    // InternalAdeptness.g:2559:1: rule__MonitoringVariable__Group__5 : rule__MonitoringVariable__Group__5__Impl rule__MonitoringVariable__Group__6 ;
    public final void rule__MonitoringVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2563:1: ( rule__MonitoringVariable__Group__5__Impl rule__MonitoringVariable__Group__6 )
            // InternalAdeptness.g:2564:2: rule__MonitoringVariable__Group__5__Impl rule__MonitoringVariable__Group__6
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
    // InternalAdeptness.g:2571:1: rule__MonitoringVariable__Group__5__Impl : ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) ) ;
    public final void rule__MonitoringVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2575:1: ( ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) ) )
            // InternalAdeptness.g:2576:1: ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) )
            {
            // InternalAdeptness.g:2576:1: ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) )
            // InternalAdeptness.g:2577:2: ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getMonitoringVariableDatatypeAssignment_5()); 
            // InternalAdeptness.g:2578:2: ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 )
            // InternalAdeptness.g:2578:3: rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5
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
    // InternalAdeptness.g:2586:1: rule__MonitoringVariable__Group__6 : rule__MonitoringVariable__Group__6__Impl rule__MonitoringVariable__Group__7 ;
    public final void rule__MonitoringVariable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2590:1: ( rule__MonitoringVariable__Group__6__Impl rule__MonitoringVariable__Group__7 )
            // InternalAdeptness.g:2591:2: rule__MonitoringVariable__Group__6__Impl rule__MonitoringVariable__Group__7
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
    // InternalAdeptness.g:2598:1: rule__MonitoringVariable__Group__6__Impl : ( ( rule__MonitoringVariable__Group_6__0 )? ) ;
    public final void rule__MonitoringVariable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2602:1: ( ( ( rule__MonitoringVariable__Group_6__0 )? ) )
            // InternalAdeptness.g:2603:1: ( ( rule__MonitoringVariable__Group_6__0 )? )
            {
            // InternalAdeptness.g:2603:1: ( ( rule__MonitoringVariable__Group_6__0 )? )
            // InternalAdeptness.g:2604:2: ( rule__MonitoringVariable__Group_6__0 )?
            {
             before(grammarAccess.getMonitoringVariableAccess().getGroup_6()); 
            // InternalAdeptness.g:2605:2: ( rule__MonitoringVariable__Group_6__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAdeptness.g:2605:3: rule__MonitoringVariable__Group_6__0
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
    // InternalAdeptness.g:2613:1: rule__MonitoringVariable__Group__7 : rule__MonitoringVariable__Group__7__Impl ;
    public final void rule__MonitoringVariable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2617:1: ( rule__MonitoringVariable__Group__7__Impl )
            // InternalAdeptness.g:2618:2: rule__MonitoringVariable__Group__7__Impl
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
    // InternalAdeptness.g:2624:1: rule__MonitoringVariable__Group__7__Impl : ( 'ENDMONITOR' ) ;
    public final void rule__MonitoringVariable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2628:1: ( ( 'ENDMONITOR' ) )
            // InternalAdeptness.g:2629:1: ( 'ENDMONITOR' )
            {
            // InternalAdeptness.g:2629:1: ( 'ENDMONITOR' )
            // InternalAdeptness.g:2630:2: 'ENDMONITOR'
            {
             before(grammarAccess.getMonitoringVariableAccess().getENDMONITORKeyword_7()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdeptness.g:2640:1: rule__MonitoringVariable__Group_6__0 : rule__MonitoringVariable__Group_6__0__Impl rule__MonitoringVariable__Group_6__1 ;
    public final void rule__MonitoringVariable__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2644:1: ( rule__MonitoringVariable__Group_6__0__Impl rule__MonitoringVariable__Group_6__1 )
            // InternalAdeptness.g:2645:2: rule__MonitoringVariable__Group_6__0__Impl rule__MonitoringVariable__Group_6__1
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
    // InternalAdeptness.g:2652:1: rule__MonitoringVariable__Group_6__0__Impl : ( 'max' ) ;
    public final void rule__MonitoringVariable__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2656:1: ( ( 'max' ) )
            // InternalAdeptness.g:2657:1: ( 'max' )
            {
            // InternalAdeptness.g:2657:1: ( 'max' )
            // InternalAdeptness.g:2658:2: 'max'
            {
             before(grammarAccess.getMonitoringVariableAccess().getMaxKeyword_6_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdeptness.g:2667:1: rule__MonitoringVariable__Group_6__1 : rule__MonitoringVariable__Group_6__1__Impl rule__MonitoringVariable__Group_6__2 ;
    public final void rule__MonitoringVariable__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2671:1: ( rule__MonitoringVariable__Group_6__1__Impl rule__MonitoringVariable__Group_6__2 )
            // InternalAdeptness.g:2672:2: rule__MonitoringVariable__Group_6__1__Impl rule__MonitoringVariable__Group_6__2
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
    // InternalAdeptness.g:2679:1: rule__MonitoringVariable__Group_6__1__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2683:1: ( ( ':' ) )
            // InternalAdeptness.g:2684:1: ( ':' )
            {
            // InternalAdeptness.g:2684:1: ( ':' )
            // InternalAdeptness.g:2685:2: ':'
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
    // InternalAdeptness.g:2694:1: rule__MonitoringVariable__Group_6__2 : rule__MonitoringVariable__Group_6__2__Impl rule__MonitoringVariable__Group_6__3 ;
    public final void rule__MonitoringVariable__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2698:1: ( rule__MonitoringVariable__Group_6__2__Impl rule__MonitoringVariable__Group_6__3 )
            // InternalAdeptness.g:2699:2: rule__MonitoringVariable__Group_6__2__Impl rule__MonitoringVariable__Group_6__3
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
    // InternalAdeptness.g:2706:1: rule__MonitoringVariable__Group_6__2__Impl : ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) ) ;
    public final void rule__MonitoringVariable__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2710:1: ( ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) ) )
            // InternalAdeptness.g:2711:1: ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) )
            {
            // InternalAdeptness.g:2711:1: ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) )
            // InternalAdeptness.g:2712:2: ( rule__MonitoringVariable__MaxAssignment_6_2 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getMaxAssignment_6_2()); 
            // InternalAdeptness.g:2713:2: ( rule__MonitoringVariable__MaxAssignment_6_2 )
            // InternalAdeptness.g:2713:3: rule__MonitoringVariable__MaxAssignment_6_2
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
    // InternalAdeptness.g:2721:1: rule__MonitoringVariable__Group_6__3 : rule__MonitoringVariable__Group_6__3__Impl rule__MonitoringVariable__Group_6__4 ;
    public final void rule__MonitoringVariable__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2725:1: ( rule__MonitoringVariable__Group_6__3__Impl rule__MonitoringVariable__Group_6__4 )
            // InternalAdeptness.g:2726:2: rule__MonitoringVariable__Group_6__3__Impl rule__MonitoringVariable__Group_6__4
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
    // InternalAdeptness.g:2733:1: rule__MonitoringVariable__Group_6__3__Impl : ( 'min' ) ;
    public final void rule__MonitoringVariable__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2737:1: ( ( 'min' ) )
            // InternalAdeptness.g:2738:1: ( 'min' )
            {
            // InternalAdeptness.g:2738:1: ( 'min' )
            // InternalAdeptness.g:2739:2: 'min'
            {
             before(grammarAccess.getMonitoringVariableAccess().getMinKeyword_6_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAdeptness.g:2748:1: rule__MonitoringVariable__Group_6__4 : rule__MonitoringVariable__Group_6__4__Impl rule__MonitoringVariable__Group_6__5 ;
    public final void rule__MonitoringVariable__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2752:1: ( rule__MonitoringVariable__Group_6__4__Impl rule__MonitoringVariable__Group_6__5 )
            // InternalAdeptness.g:2753:2: rule__MonitoringVariable__Group_6__4__Impl rule__MonitoringVariable__Group_6__5
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
    // InternalAdeptness.g:2760:1: rule__MonitoringVariable__Group_6__4__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2764:1: ( ( ':' ) )
            // InternalAdeptness.g:2765:1: ( ':' )
            {
            // InternalAdeptness.g:2765:1: ( ':' )
            // InternalAdeptness.g:2766:2: ':'
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
    // InternalAdeptness.g:2775:1: rule__MonitoringVariable__Group_6__5 : rule__MonitoringVariable__Group_6__5__Impl ;
    public final void rule__MonitoringVariable__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2779:1: ( rule__MonitoringVariable__Group_6__5__Impl )
            // InternalAdeptness.g:2780:2: rule__MonitoringVariable__Group_6__5__Impl
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
    // InternalAdeptness.g:2786:1: rule__MonitoringVariable__Group_6__5__Impl : ( ( rule__MonitoringVariable__MinAssignment_6_5 ) ) ;
    public final void rule__MonitoringVariable__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2790:1: ( ( ( rule__MonitoringVariable__MinAssignment_6_5 ) ) )
            // InternalAdeptness.g:2791:1: ( ( rule__MonitoringVariable__MinAssignment_6_5 ) )
            {
            // InternalAdeptness.g:2791:1: ( ( rule__MonitoringVariable__MinAssignment_6_5 ) )
            // InternalAdeptness.g:2792:2: ( rule__MonitoringVariable__MinAssignment_6_5 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getMinAssignment_6_5()); 
            // InternalAdeptness.g:2793:2: ( rule__MonitoringVariable__MinAssignment_6_5 )
            // InternalAdeptness.g:2793:3: rule__MonitoringVariable__MinAssignment_6_5
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
    // InternalAdeptness.g:2802:1: rule__Signal__Group__0 : rule__Signal__Group__0__Impl rule__Signal__Group__1 ;
    public final void rule__Signal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2806:1: ( rule__Signal__Group__0__Impl rule__Signal__Group__1 )
            // InternalAdeptness.g:2807:2: rule__Signal__Group__0__Impl rule__Signal__Group__1
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
    // InternalAdeptness.g:2814:1: rule__Signal__Group__0__Impl : ( 'CPS' ) ;
    public final void rule__Signal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2818:1: ( ( 'CPS' ) )
            // InternalAdeptness.g:2819:1: ( 'CPS' )
            {
            // InternalAdeptness.g:2819:1: ( 'CPS' )
            // InternalAdeptness.g:2820:2: 'CPS'
            {
             before(grammarAccess.getSignalAccess().getCPSKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalAdeptness.g:2829:1: rule__Signal__Group__1 : rule__Signal__Group__1__Impl rule__Signal__Group__2 ;
    public final void rule__Signal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2833:1: ( rule__Signal__Group__1__Impl rule__Signal__Group__2 )
            // InternalAdeptness.g:2834:2: rule__Signal__Group__1__Impl rule__Signal__Group__2
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
    // InternalAdeptness.g:2841:1: rule__Signal__Group__1__Impl : ( ( rule__Signal__NameAssignment_1 ) ) ;
    public final void rule__Signal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2845:1: ( ( ( rule__Signal__NameAssignment_1 ) ) )
            // InternalAdeptness.g:2846:1: ( ( rule__Signal__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:2846:1: ( ( rule__Signal__NameAssignment_1 ) )
            // InternalAdeptness.g:2847:2: ( rule__Signal__NameAssignment_1 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:2848:2: ( rule__Signal__NameAssignment_1 )
            // InternalAdeptness.g:2848:3: rule__Signal__NameAssignment_1
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
    // InternalAdeptness.g:2856:1: rule__Signal__Group__2 : rule__Signal__Group__2__Impl rule__Signal__Group__3 ;
    public final void rule__Signal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2860:1: ( rule__Signal__Group__2__Impl rule__Signal__Group__3 )
            // InternalAdeptness.g:2861:2: rule__Signal__Group__2__Impl rule__Signal__Group__3
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
    // InternalAdeptness.g:2868:1: rule__Signal__Group__2__Impl : ( ( rule__Signal__Group_2__0 )? ) ;
    public final void rule__Signal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2872:1: ( ( ( rule__Signal__Group_2__0 )? ) )
            // InternalAdeptness.g:2873:1: ( ( rule__Signal__Group_2__0 )? )
            {
            // InternalAdeptness.g:2873:1: ( ( rule__Signal__Group_2__0 )? )
            // InternalAdeptness.g:2874:2: ( rule__Signal__Group_2__0 )?
            {
             before(grammarAccess.getSignalAccess().getGroup_2()); 
            // InternalAdeptness.g:2875:2: ( rule__Signal__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==41) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAdeptness.g:2875:3: rule__Signal__Group_2__0
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
    // InternalAdeptness.g:2883:1: rule__Signal__Group__3 : rule__Signal__Group__3__Impl rule__Signal__Group__4 ;
    public final void rule__Signal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2887:1: ( rule__Signal__Group__3__Impl rule__Signal__Group__4 )
            // InternalAdeptness.g:2888:2: rule__Signal__Group__3__Impl rule__Signal__Group__4
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
    // InternalAdeptness.g:2895:1: rule__Signal__Group__3__Impl : ( ':' ) ;
    public final void rule__Signal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2899:1: ( ( ':' ) )
            // InternalAdeptness.g:2900:1: ( ':' )
            {
            // InternalAdeptness.g:2900:1: ( ':' )
            // InternalAdeptness.g:2901:2: ':'
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
    // InternalAdeptness.g:2910:1: rule__Signal__Group__4 : rule__Signal__Group__4__Impl rule__Signal__Group__5 ;
    public final void rule__Signal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2914:1: ( rule__Signal__Group__4__Impl rule__Signal__Group__5 )
            // InternalAdeptness.g:2915:2: rule__Signal__Group__4__Impl rule__Signal__Group__5
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
    // InternalAdeptness.g:2922:1: rule__Signal__Group__4__Impl : ( ( rule__Signal__Group_4__0 )? ) ;
    public final void rule__Signal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2926:1: ( ( ( rule__Signal__Group_4__0 )? ) )
            // InternalAdeptness.g:2927:1: ( ( rule__Signal__Group_4__0 )? )
            {
            // InternalAdeptness.g:2927:1: ( ( rule__Signal__Group_4__0 )? )
            // InternalAdeptness.g:2928:2: ( rule__Signal__Group_4__0 )?
            {
             before(grammarAccess.getSignalAccess().getGroup_4()); 
            // InternalAdeptness.g:2929:2: ( rule__Signal__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==43) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAdeptness.g:2929:3: rule__Signal__Group_4__0
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
    // InternalAdeptness.g:2937:1: rule__Signal__Group__5 : rule__Signal__Group__5__Impl rule__Signal__Group__6 ;
    public final void rule__Signal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2941:1: ( rule__Signal__Group__5__Impl rule__Signal__Group__6 )
            // InternalAdeptness.g:2942:2: rule__Signal__Group__5__Impl rule__Signal__Group__6
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
    // InternalAdeptness.g:2949:1: rule__Signal__Group__5__Impl : ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) ) ;
    public final void rule__Signal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2953:1: ( ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) ) )
            // InternalAdeptness.g:2954:1: ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) )
            {
            // InternalAdeptness.g:2954:1: ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) )
            // InternalAdeptness.g:2955:2: ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* )
            {
            // InternalAdeptness.g:2955:2: ( ( rule__Signal__OracleAssignment_5 ) )
            // InternalAdeptness.g:2956:3: ( rule__Signal__OracleAssignment_5 )
            {
             before(grammarAccess.getSignalAccess().getOracleAssignment_5()); 
            // InternalAdeptness.g:2957:3: ( rule__Signal__OracleAssignment_5 )
            // InternalAdeptness.g:2957:4: rule__Signal__OracleAssignment_5
            {
            pushFollow(FOLLOW_21);
            rule__Signal__OracleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getOracleAssignment_5()); 

            }

            // InternalAdeptness.g:2960:2: ( ( rule__Signal__OracleAssignment_5 )* )
            // InternalAdeptness.g:2961:3: ( rule__Signal__OracleAssignment_5 )*
            {
             before(grammarAccess.getSignalAccess().getOracleAssignment_5()); 
            // InternalAdeptness.g:2962:3: ( rule__Signal__OracleAssignment_5 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==44) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAdeptness.g:2962:4: rule__Signal__OracleAssignment_5
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Signal__OracleAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalAdeptness.g:2971:1: rule__Signal__Group__6 : rule__Signal__Group__6__Impl ;
    public final void rule__Signal__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2975:1: ( rule__Signal__Group__6__Impl )
            // InternalAdeptness.g:2976:2: rule__Signal__Group__6__Impl
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
    // InternalAdeptness.g:2982:1: rule__Signal__Group__6__Impl : ( 'ENDCPS' ) ;
    public final void rule__Signal__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2986:1: ( ( 'ENDCPS' ) )
            // InternalAdeptness.g:2987:1: ( 'ENDCPS' )
            {
            // InternalAdeptness.g:2987:1: ( 'ENDCPS' )
            // InternalAdeptness.g:2988:2: 'ENDCPS'
            {
             before(grammarAccess.getSignalAccess().getENDCPSKeyword_6()); 
            match(input,40,FOLLOW_2); 
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
    // InternalAdeptness.g:2998:1: rule__Signal__Group_2__0 : rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1 ;
    public final void rule__Signal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3002:1: ( rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1 )
            // InternalAdeptness.g:3003:2: rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1
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
    // InternalAdeptness.g:3010:1: rule__Signal__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Signal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3014:1: ( ( '[' ) )
            // InternalAdeptness.g:3015:1: ( '[' )
            {
            // InternalAdeptness.g:3015:1: ( '[' )
            // InternalAdeptness.g:3016:2: '['
            {
             before(grammarAccess.getSignalAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalAdeptness.g:3025:1: rule__Signal__Group_2__1 : rule__Signal__Group_2__1__Impl rule__Signal__Group_2__2 ;
    public final void rule__Signal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3029:1: ( rule__Signal__Group_2__1__Impl rule__Signal__Group_2__2 )
            // InternalAdeptness.g:3030:2: rule__Signal__Group_2__1__Impl rule__Signal__Group_2__2
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
    // InternalAdeptness.g:3037:1: rule__Signal__Group_2__1__Impl : ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) ) ;
    public final void rule__Signal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3041:1: ( ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) ) )
            // InternalAdeptness.g:3042:1: ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) )
            {
            // InternalAdeptness.g:3042:1: ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) )
            // InternalAdeptness.g:3043:2: ( rule__Signal__CardinalityNumCPSAssignment_2_1 )
            {
             before(grammarAccess.getSignalAccess().getCardinalityNumCPSAssignment_2_1()); 
            // InternalAdeptness.g:3044:2: ( rule__Signal__CardinalityNumCPSAssignment_2_1 )
            // InternalAdeptness.g:3044:3: rule__Signal__CardinalityNumCPSAssignment_2_1
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
    // InternalAdeptness.g:3052:1: rule__Signal__Group_2__2 : rule__Signal__Group_2__2__Impl ;
    public final void rule__Signal__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3056:1: ( rule__Signal__Group_2__2__Impl )
            // InternalAdeptness.g:3057:2: rule__Signal__Group_2__2__Impl
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
    // InternalAdeptness.g:3063:1: rule__Signal__Group_2__2__Impl : ( ']' ) ;
    public final void rule__Signal__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3067:1: ( ( ']' ) )
            // InternalAdeptness.g:3068:1: ( ']' )
            {
            // InternalAdeptness.g:3068:1: ( ']' )
            // InternalAdeptness.g:3069:2: ']'
            {
             before(grammarAccess.getSignalAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalAdeptness.g:3079:1: rule__Signal__Group_4__0 : rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1 ;
    public final void rule__Signal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3083:1: ( rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1 )
            // InternalAdeptness.g:3084:2: rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1
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
    // InternalAdeptness.g:3091:1: rule__Signal__Group_4__0__Impl : ( 'implements' ) ;
    public final void rule__Signal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3095:1: ( ( 'implements' ) )
            // InternalAdeptness.g:3096:1: ( 'implements' )
            {
            // InternalAdeptness.g:3096:1: ( 'implements' )
            // InternalAdeptness.g:3097:2: 'implements'
            {
             before(grammarAccess.getSignalAccess().getImplementsKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalAdeptness.g:3106:1: rule__Signal__Group_4__1 : rule__Signal__Group_4__1__Impl ;
    public final void rule__Signal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3110:1: ( rule__Signal__Group_4__1__Impl )
            // InternalAdeptness.g:3111:2: rule__Signal__Group_4__1__Impl
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
    // InternalAdeptness.g:3117:1: rule__Signal__Group_4__1__Impl : ( ( rule__Signal__SuperTypeAssignment_4_1 ) ) ;
    public final void rule__Signal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3121:1: ( ( ( rule__Signal__SuperTypeAssignment_4_1 ) ) )
            // InternalAdeptness.g:3122:1: ( ( rule__Signal__SuperTypeAssignment_4_1 ) )
            {
            // InternalAdeptness.g:3122:1: ( ( rule__Signal__SuperTypeAssignment_4_1 ) )
            // InternalAdeptness.g:3123:2: ( rule__Signal__SuperTypeAssignment_4_1 )
            {
             before(grammarAccess.getSignalAccess().getSuperTypeAssignment_4_1()); 
            // InternalAdeptness.g:3124:2: ( rule__Signal__SuperTypeAssignment_4_1 )
            // InternalAdeptness.g:3124:3: rule__Signal__SuperTypeAssignment_4_1
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
    // InternalAdeptness.g:3133:1: rule__Oracle__Group__0 : rule__Oracle__Group__0__Impl rule__Oracle__Group__1 ;
    public final void rule__Oracle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3137:1: ( rule__Oracle__Group__0__Impl rule__Oracle__Group__1 )
            // InternalAdeptness.g:3138:2: rule__Oracle__Group__0__Impl rule__Oracle__Group__1
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
    // InternalAdeptness.g:3145:1: rule__Oracle__Group__0__Impl : ( 'ORACLE' ) ;
    public final void rule__Oracle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3149:1: ( ( 'ORACLE' ) )
            // InternalAdeptness.g:3150:1: ( 'ORACLE' )
            {
            // InternalAdeptness.g:3150:1: ( 'ORACLE' )
            // InternalAdeptness.g:3151:2: 'ORACLE'
            {
             before(grammarAccess.getOracleAccess().getORACLEKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAdeptness.g:3160:1: rule__Oracle__Group__1 : rule__Oracle__Group__1__Impl rule__Oracle__Group__2 ;
    public final void rule__Oracle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3164:1: ( rule__Oracle__Group__1__Impl rule__Oracle__Group__2 )
            // InternalAdeptness.g:3165:2: rule__Oracle__Group__1__Impl rule__Oracle__Group__2
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
    // InternalAdeptness.g:3172:1: rule__Oracle__Group__1__Impl : ( ( rule__Oracle__NameAssignment_1 ) ) ;
    public final void rule__Oracle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3176:1: ( ( ( rule__Oracle__NameAssignment_1 ) ) )
            // InternalAdeptness.g:3177:1: ( ( rule__Oracle__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:3177:1: ( ( rule__Oracle__NameAssignment_1 ) )
            // InternalAdeptness.g:3178:2: ( rule__Oracle__NameAssignment_1 )
            {
             before(grammarAccess.getOracleAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:3179:2: ( rule__Oracle__NameAssignment_1 )
            // InternalAdeptness.g:3179:3: rule__Oracle__NameAssignment_1
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
    // InternalAdeptness.g:3187:1: rule__Oracle__Group__2 : rule__Oracle__Group__2__Impl rule__Oracle__Group__3 ;
    public final void rule__Oracle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3191:1: ( rule__Oracle__Group__2__Impl rule__Oracle__Group__3 )
            // InternalAdeptness.g:3192:2: rule__Oracle__Group__2__Impl rule__Oracle__Group__3
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
    // InternalAdeptness.g:3199:1: rule__Oracle__Group__2__Impl : ( ':' ) ;
    public final void rule__Oracle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3203:1: ( ( ':' ) )
            // InternalAdeptness.g:3204:1: ( ':' )
            {
            // InternalAdeptness.g:3204:1: ( ':' )
            // InternalAdeptness.g:3205:2: ':'
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
    // InternalAdeptness.g:3214:1: rule__Oracle__Group__3 : rule__Oracle__Group__3__Impl rule__Oracle__Group__4 ;
    public final void rule__Oracle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3218:1: ( rule__Oracle__Group__3__Impl rule__Oracle__Group__4 )
            // InternalAdeptness.g:3219:2: rule__Oracle__Group__3__Impl rule__Oracle__Group__4
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
    // InternalAdeptness.g:3226:1: rule__Oracle__Group__3__Impl : ( ( rule__Oracle__Alternatives_3 )? ) ;
    public final void rule__Oracle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3230:1: ( ( ( rule__Oracle__Alternatives_3 )? ) )
            // InternalAdeptness.g:3231:1: ( ( rule__Oracle__Alternatives_3 )? )
            {
            // InternalAdeptness.g:3231:1: ( ( rule__Oracle__Alternatives_3 )? )
            // InternalAdeptness.g:3232:2: ( rule__Oracle__Alternatives_3 )?
            {
             before(grammarAccess.getOracleAccess().getAlternatives_3()); 
            // InternalAdeptness.g:3233:2: ( rule__Oracle__Alternatives_3 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=46 && LA36_0<=47)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAdeptness.g:3233:3: rule__Oracle__Alternatives_3
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
    // InternalAdeptness.g:3241:1: rule__Oracle__Group__4 : rule__Oracle__Group__4__Impl rule__Oracle__Group__5 ;
    public final void rule__Oracle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3245:1: ( rule__Oracle__Group__4__Impl rule__Oracle__Group__5 )
            // InternalAdeptness.g:3246:2: rule__Oracle__Group__4__Impl rule__Oracle__Group__5
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
    // InternalAdeptness.g:3253:1: rule__Oracle__Group__4__Impl : ( ( rule__Oracle__CheckAssignment_4 ) ) ;
    public final void rule__Oracle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3257:1: ( ( ( rule__Oracle__CheckAssignment_4 ) ) )
            // InternalAdeptness.g:3258:1: ( ( rule__Oracle__CheckAssignment_4 ) )
            {
            // InternalAdeptness.g:3258:1: ( ( rule__Oracle__CheckAssignment_4 ) )
            // InternalAdeptness.g:3259:2: ( rule__Oracle__CheckAssignment_4 )
            {
             before(grammarAccess.getOracleAccess().getCheckAssignment_4()); 
            // InternalAdeptness.g:3260:2: ( rule__Oracle__CheckAssignment_4 )
            // InternalAdeptness.g:3260:3: rule__Oracle__CheckAssignment_4
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
    // InternalAdeptness.g:3268:1: rule__Oracle__Group__5 : rule__Oracle__Group__5__Impl ;
    public final void rule__Oracle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3272:1: ( rule__Oracle__Group__5__Impl )
            // InternalAdeptness.g:3273:2: rule__Oracle__Group__5__Impl
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
    // InternalAdeptness.g:3279:1: rule__Oracle__Group__5__Impl : ( 'ENDORACLE' ) ;
    public final void rule__Oracle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3283:1: ( ( 'ENDORACLE' ) )
            // InternalAdeptness.g:3284:1: ( 'ENDORACLE' )
            {
            // InternalAdeptness.g:3284:1: ( 'ENDORACLE' )
            // InternalAdeptness.g:3285:2: 'ENDORACLE'
            {
             before(grammarAccess.getOracleAccess().getENDORACLEKeyword_5()); 
            match(input,45,FOLLOW_2); 
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
    // InternalAdeptness.g:3295:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3299:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // InternalAdeptness.g:3300:2: rule__While__Group__0__Impl rule__While__Group__1
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
    // InternalAdeptness.g:3307:1: rule__While__Group__0__Impl : ( 'while:' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3311:1: ( ( 'while:' ) )
            // InternalAdeptness.g:3312:1: ( 'while:' )
            {
            // InternalAdeptness.g:3312:1: ( 'while:' )
            // InternalAdeptness.g:3313:2: 'while:'
            {
             before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalAdeptness.g:3322:1: rule__While__Group__1 : rule__While__Group__1__Impl ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3326:1: ( rule__While__Group__1__Impl )
            // InternalAdeptness.g:3327:2: rule__While__Group__1__Impl
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
    // InternalAdeptness.g:3333:1: rule__While__Group__1__Impl : ( ( rule__While__EmAssignment_1 ) ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3337:1: ( ( ( rule__While__EmAssignment_1 ) ) )
            // InternalAdeptness.g:3338:1: ( ( rule__While__EmAssignment_1 ) )
            {
            // InternalAdeptness.g:3338:1: ( ( rule__While__EmAssignment_1 ) )
            // InternalAdeptness.g:3339:2: ( rule__While__EmAssignment_1 )
            {
             before(grammarAccess.getWhileAccess().getEmAssignment_1()); 
            // InternalAdeptness.g:3340:2: ( rule__While__EmAssignment_1 )
            // InternalAdeptness.g:3340:3: rule__While__EmAssignment_1
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
    // InternalAdeptness.g:3349:1: rule__When__Group__0 : rule__When__Group__0__Impl rule__When__Group__1 ;
    public final void rule__When__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3353:1: ( rule__When__Group__0__Impl rule__When__Group__1 )
            // InternalAdeptness.g:3354:2: rule__When__Group__0__Impl rule__When__Group__1
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
    // InternalAdeptness.g:3361:1: rule__When__Group__0__Impl : ( 'when:' ) ;
    public final void rule__When__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3365:1: ( ( 'when:' ) )
            // InternalAdeptness.g:3366:1: ( 'when:' )
            {
            // InternalAdeptness.g:3366:1: ( 'when:' )
            // InternalAdeptness.g:3367:2: 'when:'
            {
             before(grammarAccess.getWhenAccess().getWhenKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalAdeptness.g:3376:1: rule__When__Group__1 : rule__When__Group__1__Impl rule__When__Group__2 ;
    public final void rule__When__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3380:1: ( rule__When__Group__1__Impl rule__When__Group__2 )
            // InternalAdeptness.g:3381:2: rule__When__Group__1__Impl rule__When__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalAdeptness.g:3388:1: rule__When__Group__1__Impl : ( ( rule__When__EmAssignment_1 ) ) ;
    public final void rule__When__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3392:1: ( ( ( rule__When__EmAssignment_1 ) ) )
            // InternalAdeptness.g:3393:1: ( ( rule__When__EmAssignment_1 ) )
            {
            // InternalAdeptness.g:3393:1: ( ( rule__When__EmAssignment_1 ) )
            // InternalAdeptness.g:3394:2: ( rule__When__EmAssignment_1 )
            {
             before(grammarAccess.getWhenAccess().getEmAssignment_1()); 
            // InternalAdeptness.g:3395:2: ( rule__When__EmAssignment_1 )
            // InternalAdeptness.g:3395:3: rule__When__EmAssignment_1
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
    // InternalAdeptness.g:3403:1: rule__When__Group__2 : rule__When__Group__2__Impl ;
    public final void rule__When__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3407:1: ( rule__When__Group__2__Impl )
            // InternalAdeptness.g:3408:2: rule__When__Group__2__Impl
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
    // InternalAdeptness.g:3414:1: rule__When__Group__2__Impl : ( ( rule__When__AwAssignment_2 )? ) ;
    public final void rule__When__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3418:1: ( ( ( rule__When__AwAssignment_2 )? ) )
            // InternalAdeptness.g:3419:1: ( ( rule__When__AwAssignment_2 )? )
            {
            // InternalAdeptness.g:3419:1: ( ( rule__When__AwAssignment_2 )? )
            // InternalAdeptness.g:3420:2: ( rule__When__AwAssignment_2 )?
            {
             before(grammarAccess.getWhenAccess().getAwAssignment_2()); 
            // InternalAdeptness.g:3421:2: ( rule__When__AwAssignment_2 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==48||LA37_0==50) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAdeptness.g:3421:3: rule__When__AwAssignment_2
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
    // InternalAdeptness.g:3430:1: rule__Wait__Group__0 : rule__Wait__Group__0__Impl rule__Wait__Group__1 ;
    public final void rule__Wait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3434:1: ( rule__Wait__Group__0__Impl rule__Wait__Group__1 )
            // InternalAdeptness.g:3435:2: rule__Wait__Group__0__Impl rule__Wait__Group__1
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
    // InternalAdeptness.g:3442:1: rule__Wait__Group__0__Impl : ( 'after(' ) ;
    public final void rule__Wait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3446:1: ( ( 'after(' ) )
            // InternalAdeptness.g:3447:1: ( 'after(' )
            {
            // InternalAdeptness.g:3447:1: ( 'after(' )
            // InternalAdeptness.g:3448:2: 'after('
            {
             before(grammarAccess.getWaitAccess().getAfterKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalAdeptness.g:3457:1: rule__Wait__Group__1 : rule__Wait__Group__1__Impl rule__Wait__Group__2 ;
    public final void rule__Wait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3461:1: ( rule__Wait__Group__1__Impl rule__Wait__Group__2 )
            // InternalAdeptness.g:3462:2: rule__Wait__Group__1__Impl rule__Wait__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalAdeptness.g:3469:1: rule__Wait__Group__1__Impl : ( ( rule__Wait__TimeAssignment_1 ) ) ;
    public final void rule__Wait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3473:1: ( ( ( rule__Wait__TimeAssignment_1 ) ) )
            // InternalAdeptness.g:3474:1: ( ( rule__Wait__TimeAssignment_1 ) )
            {
            // InternalAdeptness.g:3474:1: ( ( rule__Wait__TimeAssignment_1 ) )
            // InternalAdeptness.g:3475:2: ( rule__Wait__TimeAssignment_1 )
            {
             before(grammarAccess.getWaitAccess().getTimeAssignment_1()); 
            // InternalAdeptness.g:3476:2: ( rule__Wait__TimeAssignment_1 )
            // InternalAdeptness.g:3476:3: rule__Wait__TimeAssignment_1
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
    // InternalAdeptness.g:3484:1: rule__Wait__Group__2 : rule__Wait__Group__2__Impl rule__Wait__Group__3 ;
    public final void rule__Wait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3488:1: ( rule__Wait__Group__2__Impl rule__Wait__Group__3 )
            // InternalAdeptness.g:3489:2: rule__Wait__Group__2__Impl rule__Wait__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalAdeptness.g:3496:1: rule__Wait__Group__2__Impl : ( ',' ) ;
    public final void rule__Wait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3500:1: ( ( ',' ) )
            // InternalAdeptness.g:3501:1: ( ',' )
            {
            // InternalAdeptness.g:3501:1: ( ',' )
            // InternalAdeptness.g:3502:2: ','
            {
             before(grammarAccess.getWaitAccess().getCommaKeyword_2()); 
            match(input,49,FOLLOW_2); 
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
    // InternalAdeptness.g:3511:1: rule__Wait__Group__3 : rule__Wait__Group__3__Impl rule__Wait__Group__4 ;
    public final void rule__Wait__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3515:1: ( rule__Wait__Group__3__Impl rule__Wait__Group__4 )
            // InternalAdeptness.g:3516:2: rule__Wait__Group__3__Impl rule__Wait__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalAdeptness.g:3523:1: rule__Wait__Group__3__Impl : ( ( rule__Wait__UnitAssignment_3 ) ) ;
    public final void rule__Wait__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3527:1: ( ( ( rule__Wait__UnitAssignment_3 ) ) )
            // InternalAdeptness.g:3528:1: ( ( rule__Wait__UnitAssignment_3 ) )
            {
            // InternalAdeptness.g:3528:1: ( ( rule__Wait__UnitAssignment_3 ) )
            // InternalAdeptness.g:3529:2: ( rule__Wait__UnitAssignment_3 )
            {
             before(grammarAccess.getWaitAccess().getUnitAssignment_3()); 
            // InternalAdeptness.g:3530:2: ( rule__Wait__UnitAssignment_3 )
            // InternalAdeptness.g:3530:3: rule__Wait__UnitAssignment_3
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
    // InternalAdeptness.g:3538:1: rule__Wait__Group__4 : rule__Wait__Group__4__Impl ;
    public final void rule__Wait__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3542:1: ( rule__Wait__Group__4__Impl )
            // InternalAdeptness.g:3543:2: rule__Wait__Group__4__Impl
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
    // InternalAdeptness.g:3549:1: rule__Wait__Group__4__Impl : ( ')' ) ;
    public final void rule__Wait__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3553:1: ( ( ')' ) )
            // InternalAdeptness.g:3554:1: ( ')' )
            {
            // InternalAdeptness.g:3554:1: ( ')' )
            // InternalAdeptness.g:3555:2: ')'
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
    // InternalAdeptness.g:3565:1: rule__During__Group__0 : rule__During__Group__0__Impl rule__During__Group__1 ;
    public final void rule__During__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3569:1: ( rule__During__Group__0__Impl rule__During__Group__1 )
            // InternalAdeptness.g:3570:2: rule__During__Group__0__Impl rule__During__Group__1
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
    // InternalAdeptness.g:3577:1: rule__During__Group__0__Impl : ( 'during(' ) ;
    public final void rule__During__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3581:1: ( ( 'during(' ) )
            // InternalAdeptness.g:3582:1: ( 'during(' )
            {
            // InternalAdeptness.g:3582:1: ( 'during(' )
            // InternalAdeptness.g:3583:2: 'during('
            {
             before(grammarAccess.getDuringAccess().getDuringKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalAdeptness.g:3592:1: rule__During__Group__1 : rule__During__Group__1__Impl rule__During__Group__2 ;
    public final void rule__During__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3596:1: ( rule__During__Group__1__Impl rule__During__Group__2 )
            // InternalAdeptness.g:3597:2: rule__During__Group__1__Impl rule__During__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalAdeptness.g:3604:1: rule__During__Group__1__Impl : ( ( rule__During__TimeAssignment_1 ) ) ;
    public final void rule__During__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3608:1: ( ( ( rule__During__TimeAssignment_1 ) ) )
            // InternalAdeptness.g:3609:1: ( ( rule__During__TimeAssignment_1 ) )
            {
            // InternalAdeptness.g:3609:1: ( ( rule__During__TimeAssignment_1 ) )
            // InternalAdeptness.g:3610:2: ( rule__During__TimeAssignment_1 )
            {
             before(grammarAccess.getDuringAccess().getTimeAssignment_1()); 
            // InternalAdeptness.g:3611:2: ( rule__During__TimeAssignment_1 )
            // InternalAdeptness.g:3611:3: rule__During__TimeAssignment_1
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
    // InternalAdeptness.g:3619:1: rule__During__Group__2 : rule__During__Group__2__Impl rule__During__Group__3 ;
    public final void rule__During__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3623:1: ( rule__During__Group__2__Impl rule__During__Group__3 )
            // InternalAdeptness.g:3624:2: rule__During__Group__2__Impl rule__During__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalAdeptness.g:3631:1: rule__During__Group__2__Impl : ( ',' ) ;
    public final void rule__During__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3635:1: ( ( ',' ) )
            // InternalAdeptness.g:3636:1: ( ',' )
            {
            // InternalAdeptness.g:3636:1: ( ',' )
            // InternalAdeptness.g:3637:2: ','
            {
             before(grammarAccess.getDuringAccess().getCommaKeyword_2()); 
            match(input,49,FOLLOW_2); 
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
    // InternalAdeptness.g:3646:1: rule__During__Group__3 : rule__During__Group__3__Impl rule__During__Group__4 ;
    public final void rule__During__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3650:1: ( rule__During__Group__3__Impl rule__During__Group__4 )
            // InternalAdeptness.g:3651:2: rule__During__Group__3__Impl rule__During__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalAdeptness.g:3658:1: rule__During__Group__3__Impl : ( ( rule__During__UnitAssignment_3 ) ) ;
    public final void rule__During__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3662:1: ( ( ( rule__During__UnitAssignment_3 ) ) )
            // InternalAdeptness.g:3663:1: ( ( rule__During__UnitAssignment_3 ) )
            {
            // InternalAdeptness.g:3663:1: ( ( rule__During__UnitAssignment_3 ) )
            // InternalAdeptness.g:3664:2: ( rule__During__UnitAssignment_3 )
            {
             before(grammarAccess.getDuringAccess().getUnitAssignment_3()); 
            // InternalAdeptness.g:3665:2: ( rule__During__UnitAssignment_3 )
            // InternalAdeptness.g:3665:3: rule__During__UnitAssignment_3
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
    // InternalAdeptness.g:3673:1: rule__During__Group__4 : rule__During__Group__4__Impl ;
    public final void rule__During__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3677:1: ( rule__During__Group__4__Impl )
            // InternalAdeptness.g:3678:2: rule__During__Group__4__Impl
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
    // InternalAdeptness.g:3684:1: rule__During__Group__4__Impl : ( ')' ) ;
    public final void rule__During__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3688:1: ( ( ')' ) )
            // InternalAdeptness.g:3689:1: ( ')' )
            {
            // InternalAdeptness.g:3689:1: ( ')' )
            // InternalAdeptness.g:3690:2: ')'
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
    // InternalAdeptness.g:3700:1: rule__Checks__Group__0 : rule__Checks__Group__0__Impl rule__Checks__Group__1 ;
    public final void rule__Checks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3704:1: ( rule__Checks__Group__0__Impl rule__Checks__Group__1 )
            // InternalAdeptness.g:3705:2: rule__Checks__Group__0__Impl rule__Checks__Group__1
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
    // InternalAdeptness.g:3712:1: rule__Checks__Group__0__Impl : ( 'checks:' ) ;
    public final void rule__Checks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3716:1: ( ( 'checks:' ) )
            // InternalAdeptness.g:3717:1: ( 'checks:' )
            {
            // InternalAdeptness.g:3717:1: ( 'checks:' )
            // InternalAdeptness.g:3718:2: 'checks:'
            {
             before(grammarAccess.getChecksAccess().getChecksKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalAdeptness.g:3727:1: rule__Checks__Group__1 : rule__Checks__Group__1__Impl rule__Checks__Group__2 ;
    public final void rule__Checks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3731:1: ( rule__Checks__Group__1__Impl rule__Checks__Group__2 )
            // InternalAdeptness.g:3732:2: rule__Checks__Group__1__Impl rule__Checks__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalAdeptness.g:3739:1: rule__Checks__Group__1__Impl : ( ( rule__Checks__Alternatives_1 ) ) ;
    public final void rule__Checks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3743:1: ( ( ( rule__Checks__Alternatives_1 ) ) )
            // InternalAdeptness.g:3744:1: ( ( rule__Checks__Alternatives_1 ) )
            {
            // InternalAdeptness.g:3744:1: ( ( rule__Checks__Alternatives_1 ) )
            // InternalAdeptness.g:3745:2: ( rule__Checks__Alternatives_1 )
            {
             before(grammarAccess.getChecksAccess().getAlternatives_1()); 
            // InternalAdeptness.g:3746:2: ( rule__Checks__Alternatives_1 )
            // InternalAdeptness.g:3746:3: rule__Checks__Alternatives_1
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
    // InternalAdeptness.g:3754:1: rule__Checks__Group__2 : rule__Checks__Group__2__Impl rule__Checks__Group__3 ;
    public final void rule__Checks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3758:1: ( rule__Checks__Group__2__Impl rule__Checks__Group__3 )
            // InternalAdeptness.g:3759:2: rule__Checks__Group__2__Impl rule__Checks__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalAdeptness.g:3766:1: rule__Checks__Group__2__Impl : ( ( rule__Checks__ReferenceAssignment_2 ) ) ;
    public final void rule__Checks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3770:1: ( ( ( rule__Checks__ReferenceAssignment_2 ) ) )
            // InternalAdeptness.g:3771:1: ( ( rule__Checks__ReferenceAssignment_2 ) )
            {
            // InternalAdeptness.g:3771:1: ( ( rule__Checks__ReferenceAssignment_2 ) )
            // InternalAdeptness.g:3772:2: ( rule__Checks__ReferenceAssignment_2 )
            {
             before(grammarAccess.getChecksAccess().getReferenceAssignment_2()); 
            // InternalAdeptness.g:3773:2: ( rule__Checks__ReferenceAssignment_2 )
            // InternalAdeptness.g:3773:3: rule__Checks__ReferenceAssignment_2
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
    // InternalAdeptness.g:3781:1: rule__Checks__Group__3 : rule__Checks__Group__3__Impl rule__Checks__Group__4 ;
    public final void rule__Checks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3785:1: ( rule__Checks__Group__3__Impl rule__Checks__Group__4 )
            // InternalAdeptness.g:3786:2: rule__Checks__Group__3__Impl rule__Checks__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalAdeptness.g:3793:1: rule__Checks__Group__3__Impl : ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) ) ;
    public final void rule__Checks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3797:1: ( ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) ) )
            // InternalAdeptness.g:3798:1: ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) )
            {
            // InternalAdeptness.g:3798:1: ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) )
            // InternalAdeptness.g:3799:2: ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* )
            {
            // InternalAdeptness.g:3799:2: ( ( rule__Checks__FailReasonAssignment_3 ) )
            // InternalAdeptness.g:3800:3: ( rule__Checks__FailReasonAssignment_3 )
            {
             before(grammarAccess.getChecksAccess().getFailReasonAssignment_3()); 
            // InternalAdeptness.g:3801:3: ( rule__Checks__FailReasonAssignment_3 )
            // InternalAdeptness.g:3801:4: rule__Checks__FailReasonAssignment_3
            {
            pushFollow(FOLLOW_33);
            rule__Checks__FailReasonAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChecksAccess().getFailReasonAssignment_3()); 

            }

            // InternalAdeptness.g:3804:2: ( ( rule__Checks__FailReasonAssignment_3 )* )
            // InternalAdeptness.g:3805:3: ( rule__Checks__FailReasonAssignment_3 )*
            {
             before(grammarAccess.getChecksAccess().getFailReasonAssignment_3()); 
            // InternalAdeptness.g:3806:3: ( rule__Checks__FailReasonAssignment_3 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==53) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalAdeptness.g:3806:4: rule__Checks__FailReasonAssignment_3
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Checks__FailReasonAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalAdeptness.g:3815:1: rule__Checks__Group__4 : rule__Checks__Group__4__Impl ;
    public final void rule__Checks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3819:1: ( rule__Checks__Group__4__Impl )
            // InternalAdeptness.g:3820:2: rule__Checks__Group__4__Impl
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
    // InternalAdeptness.g:3826:1: rule__Checks__Group__4__Impl : ( ( rule__Checks__DescriptionAssignment_4 ) ) ;
    public final void rule__Checks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3830:1: ( ( ( rule__Checks__DescriptionAssignment_4 ) ) )
            // InternalAdeptness.g:3831:1: ( ( rule__Checks__DescriptionAssignment_4 ) )
            {
            // InternalAdeptness.g:3831:1: ( ( rule__Checks__DescriptionAssignment_4 ) )
            // InternalAdeptness.g:3832:2: ( rule__Checks__DescriptionAssignment_4 )
            {
             before(grammarAccess.getChecksAccess().getDescriptionAssignment_4()); 
            // InternalAdeptness.g:3833:2: ( rule__Checks__DescriptionAssignment_4 )
            // InternalAdeptness.g:3833:3: rule__Checks__DescriptionAssignment_4
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
    // InternalAdeptness.g:3842:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3846:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalAdeptness.g:3847:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalAdeptness.g:3854:1: rule__Description__Group__0__Impl : ( 'Description: ' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3858:1: ( ( 'Description: ' ) )
            // InternalAdeptness.g:3859:1: ( 'Description: ' )
            {
            // InternalAdeptness.g:3859:1: ( 'Description: ' )
            // InternalAdeptness.g:3860:2: 'Description: '
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalAdeptness.g:3869:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3873:1: ( rule__Description__Group__1__Impl )
            // InternalAdeptness.g:3874:2: rule__Description__Group__1__Impl
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
    // InternalAdeptness.g:3880:1: rule__Description__Group__1__Impl : ( ( rule__Description__ValueAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3884:1: ( ( ( rule__Description__ValueAssignment_1 ) ) )
            // InternalAdeptness.g:3885:1: ( ( rule__Description__ValueAssignment_1 ) )
            {
            // InternalAdeptness.g:3885:1: ( ( rule__Description__ValueAssignment_1 ) )
            // InternalAdeptness.g:3886:2: ( rule__Description__ValueAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getValueAssignment_1()); 
            // InternalAdeptness.g:3887:2: ( rule__Description__ValueAssignment_1 )
            // InternalAdeptness.g:3887:3: rule__Description__ValueAssignment_1
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
    // InternalAdeptness.g:3896:1: rule__FailReason__Group__0 : rule__FailReason__Group__0__Impl rule__FailReason__Group__1 ;
    public final void rule__FailReason__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3900:1: ( rule__FailReason__Group__0__Impl rule__FailReason__Group__1 )
            // InternalAdeptness.g:3901:2: rule__FailReason__Group__0__Impl rule__FailReason__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalAdeptness.g:3908:1: rule__FailReason__Group__0__Impl : ( 'fails if :' ) ;
    public final void rule__FailReason__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3912:1: ( ( 'fails if :' ) )
            // InternalAdeptness.g:3913:1: ( 'fails if :' )
            {
            // InternalAdeptness.g:3913:1: ( 'fails if :' )
            // InternalAdeptness.g:3914:2: 'fails if :'
            {
             before(grammarAccess.getFailReasonAccess().getFailsIfKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalAdeptness.g:3923:1: rule__FailReason__Group__1 : rule__FailReason__Group__1__Impl ;
    public final void rule__FailReason__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3927:1: ( rule__FailReason__Group__1__Impl )
            // InternalAdeptness.g:3928:2: rule__FailReason__Group__1__Impl
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
    // InternalAdeptness.g:3934:1: rule__FailReason__Group__1__Impl : ( ( rule__FailReason__ReasonAssignment_1 ) ) ;
    public final void rule__FailReason__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3938:1: ( ( ( rule__FailReason__ReasonAssignment_1 ) ) )
            // InternalAdeptness.g:3939:1: ( ( rule__FailReason__ReasonAssignment_1 ) )
            {
            // InternalAdeptness.g:3939:1: ( ( rule__FailReason__ReasonAssignment_1 ) )
            // InternalAdeptness.g:3940:2: ( rule__FailReason__ReasonAssignment_1 )
            {
             before(grammarAccess.getFailReasonAccess().getReasonAssignment_1()); 
            // InternalAdeptness.g:3941:2: ( rule__FailReason__ReasonAssignment_1 )
            // InternalAdeptness.g:3941:3: rule__FailReason__ReasonAssignment_1
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
    // InternalAdeptness.g:3950:1: rule__Reason__Group__0 : rule__Reason__Group__0__Impl rule__Reason__Group__1 ;
    public final void rule__Reason__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3954:1: ( rule__Reason__Group__0__Impl rule__Reason__Group__1 )
            // InternalAdeptness.g:3955:2: rule__Reason__Group__0__Impl rule__Reason__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalAdeptness.g:3962:1: rule__Reason__Group__0__Impl : ( ( rule__Reason__Alternatives_0 ) ) ;
    public final void rule__Reason__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3966:1: ( ( ( rule__Reason__Alternatives_0 ) ) )
            // InternalAdeptness.g:3967:1: ( ( rule__Reason__Alternatives_0 ) )
            {
            // InternalAdeptness.g:3967:1: ( ( rule__Reason__Alternatives_0 ) )
            // InternalAdeptness.g:3968:2: ( rule__Reason__Alternatives_0 )
            {
             before(grammarAccess.getReasonAccess().getAlternatives_0()); 
            // InternalAdeptness.g:3969:2: ( rule__Reason__Alternatives_0 )
            // InternalAdeptness.g:3969:3: rule__Reason__Alternatives_0
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
    // InternalAdeptness.g:3977:1: rule__Reason__Group__1 : rule__Reason__Group__1__Impl ;
    public final void rule__Reason__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3981:1: ( rule__Reason__Group__1__Impl )
            // InternalAdeptness.g:3982:2: rule__Reason__Group__1__Impl
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
    // InternalAdeptness.g:3988:1: rule__Reason__Group__1__Impl : ( ';' ) ;
    public final void rule__Reason__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3992:1: ( ( ';' ) )
            // InternalAdeptness.g:3993:1: ( ';' )
            {
            // InternalAdeptness.g:3993:1: ( ';' )
            // InternalAdeptness.g:3994:2: ';'
            {
             before(grammarAccess.getReasonAccess().getSemicolonKeyword_1()); 
            match(input,54,FOLLOW_2); 
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
    // InternalAdeptness.g:4004:1: rule__XPeaks__Group__0 : rule__XPeaks__Group__0__Impl rule__XPeaks__Group__1 ;
    public final void rule__XPeaks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4008:1: ( rule__XPeaks__Group__0__Impl rule__XPeaks__Group__1 )
            // InternalAdeptness.g:4009:2: rule__XPeaks__Group__0__Impl rule__XPeaks__Group__1
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
    // InternalAdeptness.g:4016:1: rule__XPeaks__Group__0__Impl : ( 'confidence is below' ) ;
    public final void rule__XPeaks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4020:1: ( ( 'confidence is below' ) )
            // InternalAdeptness.g:4021:1: ( 'confidence is below' )
            {
            // InternalAdeptness.g:4021:1: ( 'confidence is below' )
            // InternalAdeptness.g:4022:2: 'confidence is below'
            {
             before(grammarAccess.getXPeaksAccess().getConfidenceIsBelowKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalAdeptness.g:4031:1: rule__XPeaks__Group__1 : rule__XPeaks__Group__1__Impl rule__XPeaks__Group__2 ;
    public final void rule__XPeaks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4035:1: ( rule__XPeaks__Group__1__Impl rule__XPeaks__Group__2 )
            // InternalAdeptness.g:4036:2: rule__XPeaks__Group__1__Impl rule__XPeaks__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalAdeptness.g:4043:1: rule__XPeaks__Group__1__Impl : ( ( rule__XPeaks__CantAssignment_1 ) ) ;
    public final void rule__XPeaks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4047:1: ( ( ( rule__XPeaks__CantAssignment_1 ) ) )
            // InternalAdeptness.g:4048:1: ( ( rule__XPeaks__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:4048:1: ( ( rule__XPeaks__CantAssignment_1 ) )
            // InternalAdeptness.g:4049:2: ( rule__XPeaks__CantAssignment_1 )
            {
             before(grammarAccess.getXPeaksAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:4050:2: ( rule__XPeaks__CantAssignment_1 )
            // InternalAdeptness.g:4050:3: rule__XPeaks__CantAssignment_1
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
    // InternalAdeptness.g:4058:1: rule__XPeaks__Group__2 : rule__XPeaks__Group__2__Impl rule__XPeaks__Group__3 ;
    public final void rule__XPeaks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4062:1: ( rule__XPeaks__Group__2__Impl rule__XPeaks__Group__3 )
            // InternalAdeptness.g:4063:2: rule__XPeaks__Group__2__Impl rule__XPeaks__Group__3
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
    // InternalAdeptness.g:4070:1: rule__XPeaks__Group__2__Impl : ( 'more than' ) ;
    public final void rule__XPeaks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4074:1: ( ( 'more than' ) )
            // InternalAdeptness.g:4075:1: ( 'more than' )
            {
            // InternalAdeptness.g:4075:1: ( 'more than' )
            // InternalAdeptness.g:4076:2: 'more than'
            {
             before(grammarAccess.getXPeaksAccess().getMoreThanKeyword_2()); 
            match(input,56,FOLLOW_2); 
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
    // InternalAdeptness.g:4085:1: rule__XPeaks__Group__3 : rule__XPeaks__Group__3__Impl rule__XPeaks__Group__4 ;
    public final void rule__XPeaks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4089:1: ( rule__XPeaks__Group__3__Impl rule__XPeaks__Group__4 )
            // InternalAdeptness.g:4090:2: rule__XPeaks__Group__3__Impl rule__XPeaks__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalAdeptness.g:4097:1: rule__XPeaks__Group__3__Impl : ( ( rule__XPeaks__NPeaksAssignment_3 ) ) ;
    public final void rule__XPeaks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4101:1: ( ( ( rule__XPeaks__NPeaksAssignment_3 ) ) )
            // InternalAdeptness.g:4102:1: ( ( rule__XPeaks__NPeaksAssignment_3 ) )
            {
            // InternalAdeptness.g:4102:1: ( ( rule__XPeaks__NPeaksAssignment_3 ) )
            // InternalAdeptness.g:4103:2: ( rule__XPeaks__NPeaksAssignment_3 )
            {
             before(grammarAccess.getXPeaksAccess().getNPeaksAssignment_3()); 
            // InternalAdeptness.g:4104:2: ( rule__XPeaks__NPeaksAssignment_3 )
            // InternalAdeptness.g:4104:3: rule__XPeaks__NPeaksAssignment_3
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
    // InternalAdeptness.g:4112:1: rule__XPeaks__Group__4 : rule__XPeaks__Group__4__Impl rule__XPeaks__Group__5 ;
    public final void rule__XPeaks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4116:1: ( rule__XPeaks__Group__4__Impl rule__XPeaks__Group__5 )
            // InternalAdeptness.g:4117:2: rule__XPeaks__Group__4__Impl rule__XPeaks__Group__5
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
    // InternalAdeptness.g:4124:1: rule__XPeaks__Group__4__Impl : ( 'times within' ) ;
    public final void rule__XPeaks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4128:1: ( ( 'times within' ) )
            // InternalAdeptness.g:4129:1: ( 'times within' )
            {
            // InternalAdeptness.g:4129:1: ( 'times within' )
            // InternalAdeptness.g:4130:2: 'times within'
            {
             before(grammarAccess.getXPeaksAccess().getTimesWithinKeyword_4()); 
            match(input,57,FOLLOW_2); 
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
    // InternalAdeptness.g:4139:1: rule__XPeaks__Group__5 : rule__XPeaks__Group__5__Impl rule__XPeaks__Group__6 ;
    public final void rule__XPeaks__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4143:1: ( rule__XPeaks__Group__5__Impl rule__XPeaks__Group__6 )
            // InternalAdeptness.g:4144:2: rule__XPeaks__Group__5__Impl rule__XPeaks__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalAdeptness.g:4151:1: rule__XPeaks__Group__5__Impl : ( ( rule__XPeaks__TimeAssignment_5 ) ) ;
    public final void rule__XPeaks__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4155:1: ( ( ( rule__XPeaks__TimeAssignment_5 ) ) )
            // InternalAdeptness.g:4156:1: ( ( rule__XPeaks__TimeAssignment_5 ) )
            {
            // InternalAdeptness.g:4156:1: ( ( rule__XPeaks__TimeAssignment_5 ) )
            // InternalAdeptness.g:4157:2: ( rule__XPeaks__TimeAssignment_5 )
            {
             before(grammarAccess.getXPeaksAccess().getTimeAssignment_5()); 
            // InternalAdeptness.g:4158:2: ( rule__XPeaks__TimeAssignment_5 )
            // InternalAdeptness.g:4158:3: rule__XPeaks__TimeAssignment_5
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
    // InternalAdeptness.g:4166:1: rule__XPeaks__Group__6 : rule__XPeaks__Group__6__Impl ;
    public final void rule__XPeaks__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4170:1: ( rule__XPeaks__Group__6__Impl )
            // InternalAdeptness.g:4171:2: rule__XPeaks__Group__6__Impl
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
    // InternalAdeptness.g:4177:1: rule__XPeaks__Group__6__Impl : ( ( rule__XPeaks__UnitAssignment_6 ) ) ;
    public final void rule__XPeaks__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4181:1: ( ( ( rule__XPeaks__UnitAssignment_6 ) ) )
            // InternalAdeptness.g:4182:1: ( ( rule__XPeaks__UnitAssignment_6 ) )
            {
            // InternalAdeptness.g:4182:1: ( ( rule__XPeaks__UnitAssignment_6 ) )
            // InternalAdeptness.g:4183:2: ( rule__XPeaks__UnitAssignment_6 )
            {
             before(grammarAccess.getXPeaksAccess().getUnitAssignment_6()); 
            // InternalAdeptness.g:4184:2: ( rule__XPeaks__UnitAssignment_6 )
            // InternalAdeptness.g:4184:3: rule__XPeaks__UnitAssignment_6
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
    // InternalAdeptness.g:4193:1: rule__ConstDeg__Group__0 : rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1 ;
    public final void rule__ConstDeg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4197:1: ( rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1 )
            // InternalAdeptness.g:4198:2: rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1
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
    // InternalAdeptness.g:4205:1: rule__ConstDeg__Group__0__Impl : ( 'confidence is in constant degradation' ) ;
    public final void rule__ConstDeg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4209:1: ( ( 'confidence is in constant degradation' ) )
            // InternalAdeptness.g:4210:1: ( 'confidence is in constant degradation' )
            {
            // InternalAdeptness.g:4210:1: ( 'confidence is in constant degradation' )
            // InternalAdeptness.g:4211:2: 'confidence is in constant degradation'
            {
             before(grammarAccess.getConstDegAccess().getConfidenceIsInConstantDegradationKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalAdeptness.g:4220:1: rule__ConstDeg__Group__1 : rule__ConstDeg__Group__1__Impl ;
    public final void rule__ConstDeg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4224:1: ( rule__ConstDeg__Group__1__Impl )
            // InternalAdeptness.g:4225:2: rule__ConstDeg__Group__1__Impl
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
    // InternalAdeptness.g:4231:1: rule__ConstDeg__Group__1__Impl : ( ( rule__ConstDeg__CantAssignment_1 ) ) ;
    public final void rule__ConstDeg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4235:1: ( ( ( rule__ConstDeg__CantAssignment_1 ) ) )
            // InternalAdeptness.g:4236:1: ( ( rule__ConstDeg__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:4236:1: ( ( rule__ConstDeg__CantAssignment_1 ) )
            // InternalAdeptness.g:4237:2: ( rule__ConstDeg__CantAssignment_1 )
            {
             before(grammarAccess.getConstDegAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:4238:2: ( rule__ConstDeg__CantAssignment_1 )
            // InternalAdeptness.g:4238:3: rule__ConstDeg__CantAssignment_1
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
    // InternalAdeptness.g:4247:1: rule__HighTime__Group__0 : rule__HighTime__Group__0__Impl rule__HighTime__Group__1 ;
    public final void rule__HighTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4251:1: ( rule__HighTime__Group__0__Impl rule__HighTime__Group__1 )
            // InternalAdeptness.g:4252:2: rule__HighTime__Group__0__Impl rule__HighTime__Group__1
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
    // InternalAdeptness.g:4259:1: rule__HighTime__Group__0__Impl : ( 'confidence is below' ) ;
    public final void rule__HighTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4263:1: ( ( 'confidence is below' ) )
            // InternalAdeptness.g:4264:1: ( 'confidence is below' )
            {
            // InternalAdeptness.g:4264:1: ( 'confidence is below' )
            // InternalAdeptness.g:4265:2: 'confidence is below'
            {
             before(grammarAccess.getHighTimeAccess().getConfidenceIsBelowKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalAdeptness.g:4274:1: rule__HighTime__Group__1 : rule__HighTime__Group__1__Impl rule__HighTime__Group__2 ;
    public final void rule__HighTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4278:1: ( rule__HighTime__Group__1__Impl rule__HighTime__Group__2 )
            // InternalAdeptness.g:4279:2: rule__HighTime__Group__1__Impl rule__HighTime__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdeptness.g:4286:1: rule__HighTime__Group__1__Impl : ( ( rule__HighTime__CantAssignment_1 ) ) ;
    public final void rule__HighTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4290:1: ( ( ( rule__HighTime__CantAssignment_1 ) ) )
            // InternalAdeptness.g:4291:1: ( ( rule__HighTime__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:4291:1: ( ( rule__HighTime__CantAssignment_1 ) )
            // InternalAdeptness.g:4292:2: ( rule__HighTime__CantAssignment_1 )
            {
             before(grammarAccess.getHighTimeAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:4293:2: ( rule__HighTime__CantAssignment_1 )
            // InternalAdeptness.g:4293:3: rule__HighTime__CantAssignment_1
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
    // InternalAdeptness.g:4301:1: rule__HighTime__Group__2 : rule__HighTime__Group__2__Impl rule__HighTime__Group__3 ;
    public final void rule__HighTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4305:1: ( rule__HighTime__Group__2__Impl rule__HighTime__Group__3 )
            // InternalAdeptness.g:4306:2: rule__HighTime__Group__2__Impl rule__HighTime__Group__3
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
    // InternalAdeptness.g:4313:1: rule__HighTime__Group__2__Impl : ( 'within' ) ;
    public final void rule__HighTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4317:1: ( ( 'within' ) )
            // InternalAdeptness.g:4318:1: ( 'within' )
            {
            // InternalAdeptness.g:4318:1: ( 'within' )
            // InternalAdeptness.g:4319:2: 'within'
            {
             before(grammarAccess.getHighTimeAccess().getWithinKeyword_2()); 
            match(input,59,FOLLOW_2); 
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
    // InternalAdeptness.g:4328:1: rule__HighTime__Group__3 : rule__HighTime__Group__3__Impl rule__HighTime__Group__4 ;
    public final void rule__HighTime__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4332:1: ( rule__HighTime__Group__3__Impl rule__HighTime__Group__4 )
            // InternalAdeptness.g:4333:2: rule__HighTime__Group__3__Impl rule__HighTime__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalAdeptness.g:4340:1: rule__HighTime__Group__3__Impl : ( ( rule__HighTime__TimeAssignment_3 ) ) ;
    public final void rule__HighTime__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4344:1: ( ( ( rule__HighTime__TimeAssignment_3 ) ) )
            // InternalAdeptness.g:4345:1: ( ( rule__HighTime__TimeAssignment_3 ) )
            {
            // InternalAdeptness.g:4345:1: ( ( rule__HighTime__TimeAssignment_3 ) )
            // InternalAdeptness.g:4346:2: ( rule__HighTime__TimeAssignment_3 )
            {
             before(grammarAccess.getHighTimeAccess().getTimeAssignment_3()); 
            // InternalAdeptness.g:4347:2: ( rule__HighTime__TimeAssignment_3 )
            // InternalAdeptness.g:4347:3: rule__HighTime__TimeAssignment_3
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
    // InternalAdeptness.g:4355:1: rule__HighTime__Group__4 : rule__HighTime__Group__4__Impl ;
    public final void rule__HighTime__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4359:1: ( rule__HighTime__Group__4__Impl )
            // InternalAdeptness.g:4360:2: rule__HighTime__Group__4__Impl
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
    // InternalAdeptness.g:4366:1: rule__HighTime__Group__4__Impl : ( ( rule__HighTime__UnitAssignment_4 ) ) ;
    public final void rule__HighTime__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4370:1: ( ( ( rule__HighTime__UnitAssignment_4 ) ) )
            // InternalAdeptness.g:4371:1: ( ( rule__HighTime__UnitAssignment_4 ) )
            {
            // InternalAdeptness.g:4371:1: ( ( rule__HighTime__UnitAssignment_4 ) )
            // InternalAdeptness.g:4372:2: ( rule__HighTime__UnitAssignment_4 )
            {
             before(grammarAccess.getHighTimeAccess().getUnitAssignment_4()); 
            // InternalAdeptness.g:4373:2: ( rule__HighTime__UnitAssignment_4 )
            // InternalAdeptness.g:4373:3: rule__HighTime__UnitAssignment_4
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
    // InternalAdeptness.g:4382:1: rule__HighPeak__Group__0 : rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1 ;
    public final void rule__HighPeak__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4386:1: ( rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1 )
            // InternalAdeptness.g:4387:2: rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1
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
    // InternalAdeptness.g:4394:1: rule__HighPeak__Group__0__Impl : ( 'confidence is below' ) ;
    public final void rule__HighPeak__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4398:1: ( ( 'confidence is below' ) )
            // InternalAdeptness.g:4399:1: ( 'confidence is below' )
            {
            // InternalAdeptness.g:4399:1: ( 'confidence is below' )
            // InternalAdeptness.g:4400:2: 'confidence is below'
            {
             before(grammarAccess.getHighPeakAccess().getConfidenceIsBelowKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalAdeptness.g:4409:1: rule__HighPeak__Group__1 : rule__HighPeak__Group__1__Impl ;
    public final void rule__HighPeak__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4413:1: ( rule__HighPeak__Group__1__Impl )
            // InternalAdeptness.g:4414:2: rule__HighPeak__Group__1__Impl
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
    // InternalAdeptness.g:4420:1: rule__HighPeak__Group__1__Impl : ( ( rule__HighPeak__CantAssignment_1 ) ) ;
    public final void rule__HighPeak__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4424:1: ( ( ( rule__HighPeak__CantAssignment_1 ) ) )
            // InternalAdeptness.g:4425:1: ( ( rule__HighPeak__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:4425:1: ( ( rule__HighPeak__CantAssignment_1 ) )
            // InternalAdeptness.g:4426:2: ( rule__HighPeak__CantAssignment_1 )
            {
             before(grammarAccess.getHighPeakAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:4427:2: ( rule__HighPeak__CantAssignment_1 )
            // InternalAdeptness.g:4427:3: rule__HighPeak__CantAssignment_1
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
    // InternalAdeptness.g:4436:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4440:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalAdeptness.g:4441:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalAdeptness.g:4448:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__Alternatives_0 ) ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4452:1: ( ( ( rule__Reference__Alternatives_0 ) ) )
            // InternalAdeptness.g:4453:1: ( ( rule__Reference__Alternatives_0 ) )
            {
            // InternalAdeptness.g:4453:1: ( ( rule__Reference__Alternatives_0 ) )
            // InternalAdeptness.g:4454:2: ( rule__Reference__Alternatives_0 )
            {
             before(grammarAccess.getReferenceAccess().getAlternatives_0()); 
            // InternalAdeptness.g:4455:2: ( rule__Reference__Alternatives_0 )
            // InternalAdeptness.g:4455:3: rule__Reference__Alternatives_0
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
    // InternalAdeptness.g:4463:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4467:1: ( rule__Reference__Group__1__Impl )
            // InternalAdeptness.g:4468:2: rule__Reference__Group__1__Impl
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
    // InternalAdeptness.g:4474:1: rule__Reference__Group__1__Impl : ( ';' ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4478:1: ( ( ';' ) )
            // InternalAdeptness.g:4479:1: ( ';' )
            {
            // InternalAdeptness.g:4479:1: ( ';' )
            // InternalAdeptness.g:4480:2: ';'
            {
             before(grammarAccess.getReferenceAccess().getSemicolonKeyword_1()); 
            match(input,54,FOLLOW_2); 
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
    // InternalAdeptness.g:4490:1: rule__Same__Group__0 : rule__Same__Group__0__Impl rule__Same__Group__1 ;
    public final void rule__Same__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4494:1: ( rule__Same__Group__0__Impl rule__Same__Group__1 )
            // InternalAdeptness.g:4495:2: rule__Same__Group__0__Impl rule__Same__Group__1
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
    // InternalAdeptness.g:4502:1: rule__Same__Group__0__Impl : ( 'should be' ) ;
    public final void rule__Same__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4506:1: ( ( 'should be' ) )
            // InternalAdeptness.g:4507:1: ( 'should be' )
            {
            // InternalAdeptness.g:4507:1: ( 'should be' )
            // InternalAdeptness.g:4508:2: 'should be'
            {
             before(grammarAccess.getSameAccess().getShouldBeKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalAdeptness.g:4517:1: rule__Same__Group__1 : rule__Same__Group__1__Impl rule__Same__Group__2 ;
    public final void rule__Same__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4521:1: ( rule__Same__Group__1__Impl rule__Same__Group__2 )
            // InternalAdeptness.g:4522:2: rule__Same__Group__1__Impl rule__Same__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdeptness.g:4529:1: rule__Same__Group__1__Impl : ( ( rule__Same__Bound_uppAssignment_1 ) ) ;
    public final void rule__Same__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4533:1: ( ( ( rule__Same__Bound_uppAssignment_1 ) ) )
            // InternalAdeptness.g:4534:1: ( ( rule__Same__Bound_uppAssignment_1 ) )
            {
            // InternalAdeptness.g:4534:1: ( ( rule__Same__Bound_uppAssignment_1 ) )
            // InternalAdeptness.g:4535:2: ( rule__Same__Bound_uppAssignment_1 )
            {
             before(grammarAccess.getSameAccess().getBound_uppAssignment_1()); 
            // InternalAdeptness.g:4536:2: ( rule__Same__Bound_uppAssignment_1 )
            // InternalAdeptness.g:4536:3: rule__Same__Bound_uppAssignment_1
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
    // InternalAdeptness.g:4544:1: rule__Same__Group__2 : rule__Same__Group__2__Impl ;
    public final void rule__Same__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4548:1: ( rule__Same__Group__2__Impl )
            // InternalAdeptness.g:4549:2: rule__Same__Group__2__Impl
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
    // InternalAdeptness.g:4555:1: rule__Same__Group__2__Impl : ( ( rule__Same__Alternatives_2 )? ) ;
    public final void rule__Same__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4559:1: ( ( ( rule__Same__Alternatives_2 )? ) )
            // InternalAdeptness.g:4560:1: ( ( rule__Same__Alternatives_2 )? )
            {
            // InternalAdeptness.g:4560:1: ( ( rule__Same__Alternatives_2 )? )
            // InternalAdeptness.g:4561:2: ( rule__Same__Alternatives_2 )?
            {
             before(grammarAccess.getSameAccess().getAlternatives_2()); 
            // InternalAdeptness.g:4562:2: ( rule__Same__Alternatives_2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==67||(LA39_0>=69 && LA39_0<=70)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAdeptness.g:4562:3: rule__Same__Alternatives_2
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
    // InternalAdeptness.g:4571:1: rule__NotSame__Group__0 : rule__NotSame__Group__0__Impl rule__NotSame__Group__1 ;
    public final void rule__NotSame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4575:1: ( rule__NotSame__Group__0__Impl rule__NotSame__Group__1 )
            // InternalAdeptness.g:4576:2: rule__NotSame__Group__0__Impl rule__NotSame__Group__1
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
    // InternalAdeptness.g:4583:1: rule__NotSame__Group__0__Impl : ( 'should not be' ) ;
    public final void rule__NotSame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4587:1: ( ( 'should not be' ) )
            // InternalAdeptness.g:4588:1: ( 'should not be' )
            {
            // InternalAdeptness.g:4588:1: ( 'should not be' )
            // InternalAdeptness.g:4589:2: 'should not be'
            {
             before(grammarAccess.getNotSameAccess().getShouldNotBeKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalAdeptness.g:4598:1: rule__NotSame__Group__1 : rule__NotSame__Group__1__Impl rule__NotSame__Group__2 ;
    public final void rule__NotSame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4602:1: ( rule__NotSame__Group__1__Impl rule__NotSame__Group__2 )
            // InternalAdeptness.g:4603:2: rule__NotSame__Group__1__Impl rule__NotSame__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdeptness.g:4610:1: rule__NotSame__Group__1__Impl : ( ( rule__NotSame__Bound_uppAssignment_1 ) ) ;
    public final void rule__NotSame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4614:1: ( ( ( rule__NotSame__Bound_uppAssignment_1 ) ) )
            // InternalAdeptness.g:4615:1: ( ( rule__NotSame__Bound_uppAssignment_1 ) )
            {
            // InternalAdeptness.g:4615:1: ( ( rule__NotSame__Bound_uppAssignment_1 ) )
            // InternalAdeptness.g:4616:2: ( rule__NotSame__Bound_uppAssignment_1 )
            {
             before(grammarAccess.getNotSameAccess().getBound_uppAssignment_1()); 
            // InternalAdeptness.g:4617:2: ( rule__NotSame__Bound_uppAssignment_1 )
            // InternalAdeptness.g:4617:3: rule__NotSame__Bound_uppAssignment_1
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
    // InternalAdeptness.g:4625:1: rule__NotSame__Group__2 : rule__NotSame__Group__2__Impl ;
    public final void rule__NotSame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4629:1: ( rule__NotSame__Group__2__Impl )
            // InternalAdeptness.g:4630:2: rule__NotSame__Group__2__Impl
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
    // InternalAdeptness.g:4636:1: rule__NotSame__Group__2__Impl : ( ( rule__NotSame__Alternatives_2 )? ) ;
    public final void rule__NotSame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4640:1: ( ( ( rule__NotSame__Alternatives_2 )? ) )
            // InternalAdeptness.g:4641:1: ( ( rule__NotSame__Alternatives_2 )? )
            {
            // InternalAdeptness.g:4641:1: ( ( rule__NotSame__Alternatives_2 )? )
            // InternalAdeptness.g:4642:2: ( rule__NotSame__Alternatives_2 )?
            {
             before(grammarAccess.getNotSameAccess().getAlternatives_2()); 
            // InternalAdeptness.g:4643:2: ( rule__NotSame__Alternatives_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==67||(LA40_0>=69 && LA40_0<=70)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAdeptness.g:4643:3: rule__NotSame__Alternatives_2
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
    // InternalAdeptness.g:4652:1: rule__Upper__Group__0 : rule__Upper__Group__0__Impl rule__Upper__Group__1 ;
    public final void rule__Upper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4656:1: ( rule__Upper__Group__0__Impl rule__Upper__Group__1 )
            // InternalAdeptness.g:4657:2: rule__Upper__Group__0__Impl rule__Upper__Group__1
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
    // InternalAdeptness.g:4664:1: rule__Upper__Group__0__Impl : ( 'is below' ) ;
    public final void rule__Upper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4668:1: ( ( 'is below' ) )
            // InternalAdeptness.g:4669:1: ( 'is below' )
            {
            // InternalAdeptness.g:4669:1: ( 'is below' )
            // InternalAdeptness.g:4670:2: 'is below'
            {
             before(grammarAccess.getUpperAccess().getIsBelowKeyword_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalAdeptness.g:4679:1: rule__Upper__Group__1 : rule__Upper__Group__1__Impl rule__Upper__Group__2 ;
    public final void rule__Upper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4683:1: ( rule__Upper__Group__1__Impl rule__Upper__Group__2 )
            // InternalAdeptness.g:4684:2: rule__Upper__Group__1__Impl rule__Upper__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdeptness.g:4691:1: rule__Upper__Group__1__Impl : ( ( rule__Upper__Bound_uppAssignment_1 ) ) ;
    public final void rule__Upper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4695:1: ( ( ( rule__Upper__Bound_uppAssignment_1 ) ) )
            // InternalAdeptness.g:4696:1: ( ( rule__Upper__Bound_uppAssignment_1 ) )
            {
            // InternalAdeptness.g:4696:1: ( ( rule__Upper__Bound_uppAssignment_1 ) )
            // InternalAdeptness.g:4697:2: ( rule__Upper__Bound_uppAssignment_1 )
            {
             before(grammarAccess.getUpperAccess().getBound_uppAssignment_1()); 
            // InternalAdeptness.g:4698:2: ( rule__Upper__Bound_uppAssignment_1 )
            // InternalAdeptness.g:4698:3: rule__Upper__Bound_uppAssignment_1
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
    // InternalAdeptness.g:4706:1: rule__Upper__Group__2 : rule__Upper__Group__2__Impl ;
    public final void rule__Upper__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4710:1: ( rule__Upper__Group__2__Impl )
            // InternalAdeptness.g:4711:2: rule__Upper__Group__2__Impl
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
    // InternalAdeptness.g:4717:1: rule__Upper__Group__2__Impl : ( ( rule__Upper__Alternatives_2 )? ) ;
    public final void rule__Upper__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4721:1: ( ( ( rule__Upper__Alternatives_2 )? ) )
            // InternalAdeptness.g:4722:1: ( ( rule__Upper__Alternatives_2 )? )
            {
            // InternalAdeptness.g:4722:1: ( ( rule__Upper__Alternatives_2 )? )
            // InternalAdeptness.g:4723:2: ( rule__Upper__Alternatives_2 )?
            {
             before(grammarAccess.getUpperAccess().getAlternatives_2()); 
            // InternalAdeptness.g:4724:2: ( rule__Upper__Alternatives_2 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==67||(LA41_0>=69 && LA41_0<=70)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAdeptness.g:4724:3: rule__Upper__Alternatives_2
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
    // InternalAdeptness.g:4733:1: rule__Lower__Group__0 : rule__Lower__Group__0__Impl rule__Lower__Group__1 ;
    public final void rule__Lower__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4737:1: ( rule__Lower__Group__0__Impl rule__Lower__Group__1 )
            // InternalAdeptness.g:4738:2: rule__Lower__Group__0__Impl rule__Lower__Group__1
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
    // InternalAdeptness.g:4745:1: rule__Lower__Group__0__Impl : ( 'is above' ) ;
    public final void rule__Lower__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4749:1: ( ( 'is above' ) )
            // InternalAdeptness.g:4750:1: ( 'is above' )
            {
            // InternalAdeptness.g:4750:1: ( 'is above' )
            // InternalAdeptness.g:4751:2: 'is above'
            {
             before(grammarAccess.getLowerAccess().getIsAboveKeyword_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalAdeptness.g:4760:1: rule__Lower__Group__1 : rule__Lower__Group__1__Impl rule__Lower__Group__2 ;
    public final void rule__Lower__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4764:1: ( rule__Lower__Group__1__Impl rule__Lower__Group__2 )
            // InternalAdeptness.g:4765:2: rule__Lower__Group__1__Impl rule__Lower__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdeptness.g:4772:1: rule__Lower__Group__1__Impl : ( ( rule__Lower__Bound_lowerAssignment_1 ) ) ;
    public final void rule__Lower__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4776:1: ( ( ( rule__Lower__Bound_lowerAssignment_1 ) ) )
            // InternalAdeptness.g:4777:1: ( ( rule__Lower__Bound_lowerAssignment_1 ) )
            {
            // InternalAdeptness.g:4777:1: ( ( rule__Lower__Bound_lowerAssignment_1 ) )
            // InternalAdeptness.g:4778:2: ( rule__Lower__Bound_lowerAssignment_1 )
            {
             before(grammarAccess.getLowerAccess().getBound_lowerAssignment_1()); 
            // InternalAdeptness.g:4779:2: ( rule__Lower__Bound_lowerAssignment_1 )
            // InternalAdeptness.g:4779:3: rule__Lower__Bound_lowerAssignment_1
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
    // InternalAdeptness.g:4787:1: rule__Lower__Group__2 : rule__Lower__Group__2__Impl ;
    public final void rule__Lower__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4791:1: ( rule__Lower__Group__2__Impl )
            // InternalAdeptness.g:4792:2: rule__Lower__Group__2__Impl
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
    // InternalAdeptness.g:4798:1: rule__Lower__Group__2__Impl : ( ( rule__Lower__Alternatives_2 )? ) ;
    public final void rule__Lower__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4802:1: ( ( ( rule__Lower__Alternatives_2 )? ) )
            // InternalAdeptness.g:4803:1: ( ( rule__Lower__Alternatives_2 )? )
            {
            // InternalAdeptness.g:4803:1: ( ( rule__Lower__Alternatives_2 )? )
            // InternalAdeptness.g:4804:2: ( rule__Lower__Alternatives_2 )?
            {
             before(grammarAccess.getLowerAccess().getAlternatives_2()); 
            // InternalAdeptness.g:4805:2: ( rule__Lower__Alternatives_2 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==67||(LA42_0>=69 && LA42_0<=70)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAdeptness.g:4805:3: rule__Lower__Alternatives_2
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
    // InternalAdeptness.g:4814:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4818:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // InternalAdeptness.g:4819:2: rule__Range__Group__0__Impl rule__Range__Group__1
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
    // InternalAdeptness.g:4826:1: rule__Range__Group__0__Impl : ( 'is in range between' ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4830:1: ( ( 'is in range between' ) )
            // InternalAdeptness.g:4831:1: ( 'is in range between' )
            {
            // InternalAdeptness.g:4831:1: ( 'is in range between' )
            // InternalAdeptness.g:4832:2: 'is in range between'
            {
             before(grammarAccess.getRangeAccess().getIsInRangeBetweenKeyword_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalAdeptness.g:4841:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4845:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // InternalAdeptness.g:4846:2: rule__Range__Group__1__Impl rule__Range__Group__2
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
    // InternalAdeptness.g:4853:1: rule__Range__Group__1__Impl : ( ( rule__Range__Bound_lowerAssignment_1 ) ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4857:1: ( ( ( rule__Range__Bound_lowerAssignment_1 ) ) )
            // InternalAdeptness.g:4858:1: ( ( rule__Range__Bound_lowerAssignment_1 ) )
            {
            // InternalAdeptness.g:4858:1: ( ( rule__Range__Bound_lowerAssignment_1 ) )
            // InternalAdeptness.g:4859:2: ( rule__Range__Bound_lowerAssignment_1 )
            {
             before(grammarAccess.getRangeAccess().getBound_lowerAssignment_1()); 
            // InternalAdeptness.g:4860:2: ( rule__Range__Bound_lowerAssignment_1 )
            // InternalAdeptness.g:4860:3: rule__Range__Bound_lowerAssignment_1
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
    // InternalAdeptness.g:4868:1: rule__Range__Group__2 : rule__Range__Group__2__Impl rule__Range__Group__3 ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4872:1: ( rule__Range__Group__2__Impl rule__Range__Group__3 )
            // InternalAdeptness.g:4873:2: rule__Range__Group__2__Impl rule__Range__Group__3
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
    // InternalAdeptness.g:4880:1: rule__Range__Group__2__Impl : ( 'and' ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4884:1: ( ( 'and' ) )
            // InternalAdeptness.g:4885:1: ( 'and' )
            {
            // InternalAdeptness.g:4885:1: ( 'and' )
            // InternalAdeptness.g:4886:2: 'and'
            {
             before(grammarAccess.getRangeAccess().getAndKeyword_2()); 
            match(input,65,FOLLOW_2); 
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
    // InternalAdeptness.g:4895:1: rule__Range__Group__3 : rule__Range__Group__3__Impl rule__Range__Group__4 ;
    public final void rule__Range__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4899:1: ( rule__Range__Group__3__Impl rule__Range__Group__4 )
            // InternalAdeptness.g:4900:2: rule__Range__Group__3__Impl rule__Range__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdeptness.g:4907:1: rule__Range__Group__3__Impl : ( ( rule__Range__Bound_uppAssignment_3 ) ) ;
    public final void rule__Range__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4911:1: ( ( ( rule__Range__Bound_uppAssignment_3 ) ) )
            // InternalAdeptness.g:4912:1: ( ( rule__Range__Bound_uppAssignment_3 ) )
            {
            // InternalAdeptness.g:4912:1: ( ( rule__Range__Bound_uppAssignment_3 ) )
            // InternalAdeptness.g:4913:2: ( rule__Range__Bound_uppAssignment_3 )
            {
             before(grammarAccess.getRangeAccess().getBound_uppAssignment_3()); 
            // InternalAdeptness.g:4914:2: ( rule__Range__Bound_uppAssignment_3 )
            // InternalAdeptness.g:4914:3: rule__Range__Bound_uppAssignment_3
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
    // InternalAdeptness.g:4922:1: rule__Range__Group__4 : rule__Range__Group__4__Impl ;
    public final void rule__Range__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4926:1: ( rule__Range__Group__4__Impl )
            // InternalAdeptness.g:4927:2: rule__Range__Group__4__Impl
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
    // InternalAdeptness.g:4933:1: rule__Range__Group__4__Impl : ( ( rule__Range__Alternatives_4 )? ) ;
    public final void rule__Range__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4937:1: ( ( ( rule__Range__Alternatives_4 )? ) )
            // InternalAdeptness.g:4938:1: ( ( rule__Range__Alternatives_4 )? )
            {
            // InternalAdeptness.g:4938:1: ( ( rule__Range__Alternatives_4 )? )
            // InternalAdeptness.g:4939:2: ( rule__Range__Alternatives_4 )?
            {
             before(grammarAccess.getRangeAccess().getAlternatives_4()); 
            // InternalAdeptness.g:4940:2: ( rule__Range__Alternatives_4 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==67||(LA43_0>=69 && LA43_0<=70)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAdeptness.g:4940:3: rule__Range__Alternatives_4
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
    // InternalAdeptness.g:4949:1: rule__Gap__Group__0 : rule__Gap__Group__0__Impl rule__Gap__Group__1 ;
    public final void rule__Gap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4953:1: ( rule__Gap__Group__0__Impl rule__Gap__Group__1 )
            // InternalAdeptness.g:4954:2: rule__Gap__Group__0__Impl rule__Gap__Group__1
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
    // InternalAdeptness.g:4961:1: rule__Gap__Group__0__Impl : ( 'not in range between' ) ;
    public final void rule__Gap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4965:1: ( ( 'not in range between' ) )
            // InternalAdeptness.g:4966:1: ( 'not in range between' )
            {
            // InternalAdeptness.g:4966:1: ( 'not in range between' )
            // InternalAdeptness.g:4967:2: 'not in range between'
            {
             before(grammarAccess.getGapAccess().getNotInRangeBetweenKeyword_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalAdeptness.g:4976:1: rule__Gap__Group__1 : rule__Gap__Group__1__Impl rule__Gap__Group__2 ;
    public final void rule__Gap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4980:1: ( rule__Gap__Group__1__Impl rule__Gap__Group__2 )
            // InternalAdeptness.g:4981:2: rule__Gap__Group__1__Impl rule__Gap__Group__2
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
    // InternalAdeptness.g:4988:1: rule__Gap__Group__1__Impl : ( ( rule__Gap__Bound_lowerAssignment_1 ) ) ;
    public final void rule__Gap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4992:1: ( ( ( rule__Gap__Bound_lowerAssignment_1 ) ) )
            // InternalAdeptness.g:4993:1: ( ( rule__Gap__Bound_lowerAssignment_1 ) )
            {
            // InternalAdeptness.g:4993:1: ( ( rule__Gap__Bound_lowerAssignment_1 ) )
            // InternalAdeptness.g:4994:2: ( rule__Gap__Bound_lowerAssignment_1 )
            {
             before(grammarAccess.getGapAccess().getBound_lowerAssignment_1()); 
            // InternalAdeptness.g:4995:2: ( rule__Gap__Bound_lowerAssignment_1 )
            // InternalAdeptness.g:4995:3: rule__Gap__Bound_lowerAssignment_1
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
    // InternalAdeptness.g:5003:1: rule__Gap__Group__2 : rule__Gap__Group__2__Impl rule__Gap__Group__3 ;
    public final void rule__Gap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5007:1: ( rule__Gap__Group__2__Impl rule__Gap__Group__3 )
            // InternalAdeptness.g:5008:2: rule__Gap__Group__2__Impl rule__Gap__Group__3
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
    // InternalAdeptness.g:5015:1: rule__Gap__Group__2__Impl : ( 'and' ) ;
    public final void rule__Gap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5019:1: ( ( 'and' ) )
            // InternalAdeptness.g:5020:1: ( 'and' )
            {
            // InternalAdeptness.g:5020:1: ( 'and' )
            // InternalAdeptness.g:5021:2: 'and'
            {
             before(grammarAccess.getGapAccess().getAndKeyword_2()); 
            match(input,65,FOLLOW_2); 
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
    // InternalAdeptness.g:5030:1: rule__Gap__Group__3 : rule__Gap__Group__3__Impl rule__Gap__Group__4 ;
    public final void rule__Gap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5034:1: ( rule__Gap__Group__3__Impl rule__Gap__Group__4 )
            // InternalAdeptness.g:5035:2: rule__Gap__Group__3__Impl rule__Gap__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdeptness.g:5042:1: rule__Gap__Group__3__Impl : ( ( rule__Gap__Bound_uppAssignment_3 ) ) ;
    public final void rule__Gap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5046:1: ( ( ( rule__Gap__Bound_uppAssignment_3 ) ) )
            // InternalAdeptness.g:5047:1: ( ( rule__Gap__Bound_uppAssignment_3 ) )
            {
            // InternalAdeptness.g:5047:1: ( ( rule__Gap__Bound_uppAssignment_3 ) )
            // InternalAdeptness.g:5048:2: ( rule__Gap__Bound_uppAssignment_3 )
            {
             before(grammarAccess.getGapAccess().getBound_uppAssignment_3()); 
            // InternalAdeptness.g:5049:2: ( rule__Gap__Bound_uppAssignment_3 )
            // InternalAdeptness.g:5049:3: rule__Gap__Bound_uppAssignment_3
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
    // InternalAdeptness.g:5057:1: rule__Gap__Group__4 : rule__Gap__Group__4__Impl ;
    public final void rule__Gap__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5061:1: ( rule__Gap__Group__4__Impl )
            // InternalAdeptness.g:5062:2: rule__Gap__Group__4__Impl
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
    // InternalAdeptness.g:5068:1: rule__Gap__Group__4__Impl : ( ( rule__Gap__Alternatives_4 )? ) ;
    public final void rule__Gap__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5072:1: ( ( ( rule__Gap__Alternatives_4 )? ) )
            // InternalAdeptness.g:5073:1: ( ( rule__Gap__Alternatives_4 )? )
            {
            // InternalAdeptness.g:5073:1: ( ( rule__Gap__Alternatives_4 )? )
            // InternalAdeptness.g:5074:2: ( rule__Gap__Alternatives_4 )?
            {
             before(grammarAccess.getGapAccess().getAlternatives_4()); 
            // InternalAdeptness.g:5075:2: ( rule__Gap__Alternatives_4 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==67||(LA44_0>=69 && LA44_0<=70)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAdeptness.g:5075:3: rule__Gap__Alternatives_4
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
    // InternalAdeptness.g:5084:1: rule__Exactly__Group__0 : rule__Exactly__Group__0__Impl rule__Exactly__Group__1 ;
    public final void rule__Exactly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5088:1: ( rule__Exactly__Group__0__Impl rule__Exactly__Group__1 )
            // InternalAdeptness.g:5089:2: rule__Exactly__Group__0__Impl rule__Exactly__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:5096:1: rule__Exactly__Group__0__Impl : ( 'exactly' ) ;
    public final void rule__Exactly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5100:1: ( ( 'exactly' ) )
            // InternalAdeptness.g:5101:1: ( 'exactly' )
            {
            // InternalAdeptness.g:5101:1: ( 'exactly' )
            // InternalAdeptness.g:5102:2: 'exactly'
            {
             before(grammarAccess.getExactlyAccess().getExactlyKeyword_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalAdeptness.g:5111:1: rule__Exactly__Group__1 : rule__Exactly__Group__1__Impl rule__Exactly__Group__2 ;
    public final void rule__Exactly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5115:1: ( rule__Exactly__Group__1__Impl rule__Exactly__Group__2 )
            // InternalAdeptness.g:5116:2: rule__Exactly__Group__1__Impl rule__Exactly__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalAdeptness.g:5123:1: rule__Exactly__Group__1__Impl : ( ( rule__Exactly__ValueAssignment_1 ) ) ;
    public final void rule__Exactly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5127:1: ( ( ( rule__Exactly__ValueAssignment_1 ) ) )
            // InternalAdeptness.g:5128:1: ( ( rule__Exactly__ValueAssignment_1 ) )
            {
            // InternalAdeptness.g:5128:1: ( ( rule__Exactly__ValueAssignment_1 ) )
            // InternalAdeptness.g:5129:2: ( rule__Exactly__ValueAssignment_1 )
            {
             before(grammarAccess.getExactlyAccess().getValueAssignment_1()); 
            // InternalAdeptness.g:5130:2: ( rule__Exactly__ValueAssignment_1 )
            // InternalAdeptness.g:5130:3: rule__Exactly__ValueAssignment_1
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
    // InternalAdeptness.g:5138:1: rule__Exactly__Group__2 : rule__Exactly__Group__2__Impl ;
    public final void rule__Exactly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5142:1: ( rule__Exactly__Group__2__Impl )
            // InternalAdeptness.g:5143:2: rule__Exactly__Group__2__Impl
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
    // InternalAdeptness.g:5149:1: rule__Exactly__Group__2__Impl : ( ( rule__Exactly__Alternatives_2 ) ) ;
    public final void rule__Exactly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5153:1: ( ( ( rule__Exactly__Alternatives_2 ) ) )
            // InternalAdeptness.g:5154:1: ( ( rule__Exactly__Alternatives_2 ) )
            {
            // InternalAdeptness.g:5154:1: ( ( rule__Exactly__Alternatives_2 ) )
            // InternalAdeptness.g:5155:2: ( rule__Exactly__Alternatives_2 )
            {
             before(grammarAccess.getExactlyAccess().getAlternatives_2()); 
            // InternalAdeptness.g:5156:2: ( rule__Exactly__Alternatives_2 )
            // InternalAdeptness.g:5156:3: rule__Exactly__Alternatives_2
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
    // InternalAdeptness.g:5165:1: rule__Exactly__Group_2_1__0 : rule__Exactly__Group_2_1__0__Impl rule__Exactly__Group_2_1__1 ;
    public final void rule__Exactly__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5169:1: ( rule__Exactly__Group_2_1__0__Impl rule__Exactly__Group_2_1__1 )
            // InternalAdeptness.g:5170:2: rule__Exactly__Group_2_1__0__Impl rule__Exactly__Group_2_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:5177:1: rule__Exactly__Group_2_1__0__Impl : ( 'times in' ) ;
    public final void rule__Exactly__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5181:1: ( ( 'times in' ) )
            // InternalAdeptness.g:5182:1: ( 'times in' )
            {
            // InternalAdeptness.g:5182:1: ( 'times in' )
            // InternalAdeptness.g:5183:2: 'times in'
            {
             before(grammarAccess.getExactlyAccess().getTimesInKeyword_2_1_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalAdeptness.g:5192:1: rule__Exactly__Group_2_1__1 : rule__Exactly__Group_2_1__1__Impl rule__Exactly__Group_2_1__2 ;
    public final void rule__Exactly__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5196:1: ( rule__Exactly__Group_2_1__1__Impl rule__Exactly__Group_2_1__2 )
            // InternalAdeptness.g:5197:2: rule__Exactly__Group_2_1__1__Impl rule__Exactly__Group_2_1__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalAdeptness.g:5204:1: rule__Exactly__Group_2_1__1__Impl : ( ( rule__Exactly__TimeAssignment_2_1_1 ) ) ;
    public final void rule__Exactly__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5208:1: ( ( ( rule__Exactly__TimeAssignment_2_1_1 ) ) )
            // InternalAdeptness.g:5209:1: ( ( rule__Exactly__TimeAssignment_2_1_1 ) )
            {
            // InternalAdeptness.g:5209:1: ( ( rule__Exactly__TimeAssignment_2_1_1 ) )
            // InternalAdeptness.g:5210:2: ( rule__Exactly__TimeAssignment_2_1_1 )
            {
             before(grammarAccess.getExactlyAccess().getTimeAssignment_2_1_1()); 
            // InternalAdeptness.g:5211:2: ( rule__Exactly__TimeAssignment_2_1_1 )
            // InternalAdeptness.g:5211:3: rule__Exactly__TimeAssignment_2_1_1
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
    // InternalAdeptness.g:5219:1: rule__Exactly__Group_2_1__2 : rule__Exactly__Group_2_1__2__Impl ;
    public final void rule__Exactly__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5223:1: ( rule__Exactly__Group_2_1__2__Impl )
            // InternalAdeptness.g:5224:2: rule__Exactly__Group_2_1__2__Impl
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
    // InternalAdeptness.g:5230:1: rule__Exactly__Group_2_1__2__Impl : ( ( rule__Exactly__UnitAssignment_2_1_2 ) ) ;
    public final void rule__Exactly__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5234:1: ( ( ( rule__Exactly__UnitAssignment_2_1_2 ) ) )
            // InternalAdeptness.g:5235:1: ( ( rule__Exactly__UnitAssignment_2_1_2 ) )
            {
            // InternalAdeptness.g:5235:1: ( ( rule__Exactly__UnitAssignment_2_1_2 ) )
            // InternalAdeptness.g:5236:2: ( rule__Exactly__UnitAssignment_2_1_2 )
            {
             before(grammarAccess.getExactlyAccess().getUnitAssignment_2_1_2()); 
            // InternalAdeptness.g:5237:2: ( rule__Exactly__UnitAssignment_2_1_2 )
            // InternalAdeptness.g:5237:3: rule__Exactly__UnitAssignment_2_1_2
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
    // InternalAdeptness.g:5246:1: rule__At_most__Group__0 : rule__At_most__Group__0__Impl rule__At_most__Group__1 ;
    public final void rule__At_most__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5250:1: ( rule__At_most__Group__0__Impl rule__At_most__Group__1 )
            // InternalAdeptness.g:5251:2: rule__At_most__Group__0__Impl rule__At_most__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:5258:1: rule__At_most__Group__0__Impl : ( 'at most' ) ;
    public final void rule__At_most__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5262:1: ( ( 'at most' ) )
            // InternalAdeptness.g:5263:1: ( 'at most' )
            {
            // InternalAdeptness.g:5263:1: ( 'at most' )
            // InternalAdeptness.g:5264:2: 'at most'
            {
             before(grammarAccess.getAt_mostAccess().getAtMostKeyword_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalAdeptness.g:5273:1: rule__At_most__Group__1 : rule__At_most__Group__1__Impl rule__At_most__Group__2 ;
    public final void rule__At_most__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5277:1: ( rule__At_most__Group__1__Impl rule__At_most__Group__2 )
            // InternalAdeptness.g:5278:2: rule__At_most__Group__1__Impl rule__At_most__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalAdeptness.g:5285:1: rule__At_most__Group__1__Impl : ( ( rule__At_most__ValueAssignment_1 ) ) ;
    public final void rule__At_most__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5289:1: ( ( ( rule__At_most__ValueAssignment_1 ) ) )
            // InternalAdeptness.g:5290:1: ( ( rule__At_most__ValueAssignment_1 ) )
            {
            // InternalAdeptness.g:5290:1: ( ( rule__At_most__ValueAssignment_1 ) )
            // InternalAdeptness.g:5291:2: ( rule__At_most__ValueAssignment_1 )
            {
             before(grammarAccess.getAt_mostAccess().getValueAssignment_1()); 
            // InternalAdeptness.g:5292:2: ( rule__At_most__ValueAssignment_1 )
            // InternalAdeptness.g:5292:3: rule__At_most__ValueAssignment_1
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
    // InternalAdeptness.g:5300:1: rule__At_most__Group__2 : rule__At_most__Group__2__Impl ;
    public final void rule__At_most__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5304:1: ( rule__At_most__Group__2__Impl )
            // InternalAdeptness.g:5305:2: rule__At_most__Group__2__Impl
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
    // InternalAdeptness.g:5311:1: rule__At_most__Group__2__Impl : ( ( rule__At_most__Alternatives_2 ) ) ;
    public final void rule__At_most__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5315:1: ( ( ( rule__At_most__Alternatives_2 ) ) )
            // InternalAdeptness.g:5316:1: ( ( rule__At_most__Alternatives_2 ) )
            {
            // InternalAdeptness.g:5316:1: ( ( rule__At_most__Alternatives_2 ) )
            // InternalAdeptness.g:5317:2: ( rule__At_most__Alternatives_2 )
            {
             before(grammarAccess.getAt_mostAccess().getAlternatives_2()); 
            // InternalAdeptness.g:5318:2: ( rule__At_most__Alternatives_2 )
            // InternalAdeptness.g:5318:3: rule__At_most__Alternatives_2
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
    // InternalAdeptness.g:5327:1: rule__At_most__Group_2_1__0 : rule__At_most__Group_2_1__0__Impl rule__At_most__Group_2_1__1 ;
    public final void rule__At_most__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5331:1: ( rule__At_most__Group_2_1__0__Impl rule__At_most__Group_2_1__1 )
            // InternalAdeptness.g:5332:2: rule__At_most__Group_2_1__0__Impl rule__At_most__Group_2_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:5339:1: rule__At_most__Group_2_1__0__Impl : ( 'times in' ) ;
    public final void rule__At_most__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5343:1: ( ( 'times in' ) )
            // InternalAdeptness.g:5344:1: ( 'times in' )
            {
            // InternalAdeptness.g:5344:1: ( 'times in' )
            // InternalAdeptness.g:5345:2: 'times in'
            {
             before(grammarAccess.getAt_mostAccess().getTimesInKeyword_2_1_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalAdeptness.g:5354:1: rule__At_most__Group_2_1__1 : rule__At_most__Group_2_1__1__Impl rule__At_most__Group_2_1__2 ;
    public final void rule__At_most__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5358:1: ( rule__At_most__Group_2_1__1__Impl rule__At_most__Group_2_1__2 )
            // InternalAdeptness.g:5359:2: rule__At_most__Group_2_1__1__Impl rule__At_most__Group_2_1__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalAdeptness.g:5366:1: rule__At_most__Group_2_1__1__Impl : ( ( rule__At_most__TimeAssignment_2_1_1 ) ) ;
    public final void rule__At_most__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5370:1: ( ( ( rule__At_most__TimeAssignment_2_1_1 ) ) )
            // InternalAdeptness.g:5371:1: ( ( rule__At_most__TimeAssignment_2_1_1 ) )
            {
            // InternalAdeptness.g:5371:1: ( ( rule__At_most__TimeAssignment_2_1_1 ) )
            // InternalAdeptness.g:5372:2: ( rule__At_most__TimeAssignment_2_1_1 )
            {
             before(grammarAccess.getAt_mostAccess().getTimeAssignment_2_1_1()); 
            // InternalAdeptness.g:5373:2: ( rule__At_most__TimeAssignment_2_1_1 )
            // InternalAdeptness.g:5373:3: rule__At_most__TimeAssignment_2_1_1
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
    // InternalAdeptness.g:5381:1: rule__At_most__Group_2_1__2 : rule__At_most__Group_2_1__2__Impl ;
    public final void rule__At_most__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5385:1: ( rule__At_most__Group_2_1__2__Impl )
            // InternalAdeptness.g:5386:2: rule__At_most__Group_2_1__2__Impl
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
    // InternalAdeptness.g:5392:1: rule__At_most__Group_2_1__2__Impl : ( ( rule__At_most__UnitAssignment_2_1_2 ) ) ;
    public final void rule__At_most__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5396:1: ( ( ( rule__At_most__UnitAssignment_2_1_2 ) ) )
            // InternalAdeptness.g:5397:1: ( ( rule__At_most__UnitAssignment_2_1_2 ) )
            {
            // InternalAdeptness.g:5397:1: ( ( rule__At_most__UnitAssignment_2_1_2 ) )
            // InternalAdeptness.g:5398:2: ( rule__At_most__UnitAssignment_2_1_2 )
            {
             before(grammarAccess.getAt_mostAccess().getUnitAssignment_2_1_2()); 
            // InternalAdeptness.g:5399:2: ( rule__At_most__UnitAssignment_2_1_2 )
            // InternalAdeptness.g:5399:3: rule__At_most__UnitAssignment_2_1_2
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
    // InternalAdeptness.g:5408:1: rule__At_least__Group__0 : rule__At_least__Group__0__Impl rule__At_least__Group__1 ;
    public final void rule__At_least__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5412:1: ( rule__At_least__Group__0__Impl rule__At_least__Group__1 )
            // InternalAdeptness.g:5413:2: rule__At_least__Group__0__Impl rule__At_least__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:5420:1: rule__At_least__Group__0__Impl : ( 'at least' ) ;
    public final void rule__At_least__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5424:1: ( ( 'at least' ) )
            // InternalAdeptness.g:5425:1: ( 'at least' )
            {
            // InternalAdeptness.g:5425:1: ( 'at least' )
            // InternalAdeptness.g:5426:2: 'at least'
            {
             before(grammarAccess.getAt_leastAccess().getAtLeastKeyword_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalAdeptness.g:5435:1: rule__At_least__Group__1 : rule__At_least__Group__1__Impl rule__At_least__Group__2 ;
    public final void rule__At_least__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5439:1: ( rule__At_least__Group__1__Impl rule__At_least__Group__2 )
            // InternalAdeptness.g:5440:2: rule__At_least__Group__1__Impl rule__At_least__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalAdeptness.g:5447:1: rule__At_least__Group__1__Impl : ( ( rule__At_least__ValueAssignment_1 ) ) ;
    public final void rule__At_least__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5451:1: ( ( ( rule__At_least__ValueAssignment_1 ) ) )
            // InternalAdeptness.g:5452:1: ( ( rule__At_least__ValueAssignment_1 ) )
            {
            // InternalAdeptness.g:5452:1: ( ( rule__At_least__ValueAssignment_1 ) )
            // InternalAdeptness.g:5453:2: ( rule__At_least__ValueAssignment_1 )
            {
             before(grammarAccess.getAt_leastAccess().getValueAssignment_1()); 
            // InternalAdeptness.g:5454:2: ( rule__At_least__ValueAssignment_1 )
            // InternalAdeptness.g:5454:3: rule__At_least__ValueAssignment_1
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
    // InternalAdeptness.g:5462:1: rule__At_least__Group__2 : rule__At_least__Group__2__Impl ;
    public final void rule__At_least__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5466:1: ( rule__At_least__Group__2__Impl )
            // InternalAdeptness.g:5467:2: rule__At_least__Group__2__Impl
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
    // InternalAdeptness.g:5473:1: rule__At_least__Group__2__Impl : ( ( rule__At_least__Alternatives_2 ) ) ;
    public final void rule__At_least__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5477:1: ( ( ( rule__At_least__Alternatives_2 ) ) )
            // InternalAdeptness.g:5478:1: ( ( rule__At_least__Alternatives_2 ) )
            {
            // InternalAdeptness.g:5478:1: ( ( rule__At_least__Alternatives_2 ) )
            // InternalAdeptness.g:5479:2: ( rule__At_least__Alternatives_2 )
            {
             before(grammarAccess.getAt_leastAccess().getAlternatives_2()); 
            // InternalAdeptness.g:5480:2: ( rule__At_least__Alternatives_2 )
            // InternalAdeptness.g:5480:3: rule__At_least__Alternatives_2
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
    // InternalAdeptness.g:5489:1: rule__At_least__Group_2_1__0 : rule__At_least__Group_2_1__0__Impl rule__At_least__Group_2_1__1 ;
    public final void rule__At_least__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5493:1: ( rule__At_least__Group_2_1__0__Impl rule__At_least__Group_2_1__1 )
            // InternalAdeptness.g:5494:2: rule__At_least__Group_2_1__0__Impl rule__At_least__Group_2_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdeptness.g:5501:1: rule__At_least__Group_2_1__0__Impl : ( 'times in' ) ;
    public final void rule__At_least__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5505:1: ( ( 'times in' ) )
            // InternalAdeptness.g:5506:1: ( 'times in' )
            {
            // InternalAdeptness.g:5506:1: ( 'times in' )
            // InternalAdeptness.g:5507:2: 'times in'
            {
             before(grammarAccess.getAt_leastAccess().getTimesInKeyword_2_1_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalAdeptness.g:5516:1: rule__At_least__Group_2_1__1 : rule__At_least__Group_2_1__1__Impl rule__At_least__Group_2_1__2 ;
    public final void rule__At_least__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5520:1: ( rule__At_least__Group_2_1__1__Impl rule__At_least__Group_2_1__2 )
            // InternalAdeptness.g:5521:2: rule__At_least__Group_2_1__1__Impl rule__At_least__Group_2_1__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalAdeptness.g:5528:1: rule__At_least__Group_2_1__1__Impl : ( ( rule__At_least__TimeAssignment_2_1_1 ) ) ;
    public final void rule__At_least__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5532:1: ( ( ( rule__At_least__TimeAssignment_2_1_1 ) ) )
            // InternalAdeptness.g:5533:1: ( ( rule__At_least__TimeAssignment_2_1_1 ) )
            {
            // InternalAdeptness.g:5533:1: ( ( rule__At_least__TimeAssignment_2_1_1 ) )
            // InternalAdeptness.g:5534:2: ( rule__At_least__TimeAssignment_2_1_1 )
            {
             before(grammarAccess.getAt_leastAccess().getTimeAssignment_2_1_1()); 
            // InternalAdeptness.g:5535:2: ( rule__At_least__TimeAssignment_2_1_1 )
            // InternalAdeptness.g:5535:3: rule__At_least__TimeAssignment_2_1_1
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
    // InternalAdeptness.g:5543:1: rule__At_least__Group_2_1__2 : rule__At_least__Group_2_1__2__Impl ;
    public final void rule__At_least__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5547:1: ( rule__At_least__Group_2_1__2__Impl )
            // InternalAdeptness.g:5548:2: rule__At_least__Group_2_1__2__Impl
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
    // InternalAdeptness.g:5554:1: rule__At_least__Group_2_1__2__Impl : ( ( rule__At_least__UnitAssignment_2_1_2 ) ) ;
    public final void rule__At_least__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5558:1: ( ( ( rule__At_least__UnitAssignment_2_1_2 ) ) )
            // InternalAdeptness.g:5559:1: ( ( rule__At_least__UnitAssignment_2_1_2 ) )
            {
            // InternalAdeptness.g:5559:1: ( ( rule__At_least__UnitAssignment_2_1_2 ) )
            // InternalAdeptness.g:5560:2: ( rule__At_least__UnitAssignment_2_1_2 )
            {
             before(grammarAccess.getAt_leastAccess().getUnitAssignment_2_1_2()); 
            // InternalAdeptness.g:5561:2: ( rule__At_least__UnitAssignment_2_1_2 )
            // InternalAdeptness.g:5561:3: rule__At_least__UnitAssignment_2_1_2
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
    // InternalAdeptness.g:5570:1: rule__D__Group__0 : rule__D__Group__0__Impl rule__D__Group__1 ;
    public final void rule__D__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5574:1: ( rule__D__Group__0__Impl rule__D__Group__1 )
            // InternalAdeptness.g:5575:2: rule__D__Group__0__Impl rule__D__Group__1
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
    // InternalAdeptness.g:5582:1: rule__D__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__D__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5586:1: ( ( ( '-' )? ) )
            // InternalAdeptness.g:5587:1: ( ( '-' )? )
            {
            // InternalAdeptness.g:5587:1: ( ( '-' )? )
            // InternalAdeptness.g:5588:2: ( '-' )?
            {
             before(grammarAccess.getDAccess().getHyphenMinusKeyword_0()); 
            // InternalAdeptness.g:5589:2: ( '-' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==25) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAdeptness.g:5589:3: '-'
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
    // InternalAdeptness.g:5597:1: rule__D__Group__1 : rule__D__Group__1__Impl rule__D__Group__2 ;
    public final void rule__D__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5601:1: ( rule__D__Group__1__Impl rule__D__Group__2 )
            // InternalAdeptness.g:5602:2: rule__D__Group__1__Impl rule__D__Group__2
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
    // InternalAdeptness.g:5609:1: rule__D__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__D__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5613:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:5614:1: ( RULE_INT )
            {
            // InternalAdeptness.g:5614:1: ( RULE_INT )
            // InternalAdeptness.g:5615:2: RULE_INT
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
    // InternalAdeptness.g:5624:1: rule__D__Group__2 : rule__D__Group__2__Impl ;
    public final void rule__D__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5628:1: ( rule__D__Group__2__Impl )
            // InternalAdeptness.g:5629:2: rule__D__Group__2__Impl
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
    // InternalAdeptness.g:5635:1: rule__D__Group__2__Impl : ( ( rule__D__Group_2__0 )? ) ;
    public final void rule__D__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5639:1: ( ( ( rule__D__Group_2__0 )? ) )
            // InternalAdeptness.g:5640:1: ( ( rule__D__Group_2__0 )? )
            {
            // InternalAdeptness.g:5640:1: ( ( rule__D__Group_2__0 )? )
            // InternalAdeptness.g:5641:2: ( rule__D__Group_2__0 )?
            {
             before(grammarAccess.getDAccess().getGroup_2()); 
            // InternalAdeptness.g:5642:2: ( rule__D__Group_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==30) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAdeptness.g:5642:3: rule__D__Group_2__0
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
    // InternalAdeptness.g:5651:1: rule__D__Group_2__0 : rule__D__Group_2__0__Impl rule__D__Group_2__1 ;
    public final void rule__D__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5655:1: ( rule__D__Group_2__0__Impl rule__D__Group_2__1 )
            // InternalAdeptness.g:5656:2: rule__D__Group_2__0__Impl rule__D__Group_2__1
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
    // InternalAdeptness.g:5663:1: rule__D__Group_2__0__Impl : ( '.' ) ;
    public final void rule__D__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5667:1: ( ( '.' ) )
            // InternalAdeptness.g:5668:1: ( '.' )
            {
            // InternalAdeptness.g:5668:1: ( '.' )
            // InternalAdeptness.g:5669:2: '.'
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
    // InternalAdeptness.g:5678:1: rule__D__Group_2__1 : rule__D__Group_2__1__Impl ;
    public final void rule__D__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5682:1: ( rule__D__Group_2__1__Impl )
            // InternalAdeptness.g:5683:2: rule__D__Group_2__1__Impl
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
    // InternalAdeptness.g:5689:1: rule__D__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__D__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5693:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:5694:1: ( RULE_INT )
            {
            // InternalAdeptness.g:5694:1: ( RULE_INT )
            // InternalAdeptness.g:5695:2: RULE_INT
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
    // InternalAdeptness.g:5705:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5709:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalAdeptness.g:5710:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
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
    // InternalAdeptness.g:5717:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5721:1: ( ( 'datatype' ) )
            // InternalAdeptness.g:5722:1: ( 'datatype' )
            {
            // InternalAdeptness.g:5722:1: ( 'datatype' )
            // InternalAdeptness.g:5723:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalAdeptness.g:5732:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5736:1: ( rule__DataType__Group__1__Impl )
            // InternalAdeptness.g:5737:2: rule__DataType__Group__1__Impl
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
    // InternalAdeptness.g:5743:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5747:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalAdeptness.g:5748:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:5748:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalAdeptness.g:5749:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:5750:2: ( rule__DataType__NameAssignment_1 )
            // InternalAdeptness.g:5750:3: rule__DataType__NameAssignment_1
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
    // InternalAdeptness.g:5759:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5763:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // InternalAdeptness.g:5764:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
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
    // InternalAdeptness.g:5771:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5775:1: ( ( 'package' ) )
            // InternalAdeptness.g:5776:1: ( 'package' )
            {
            // InternalAdeptness.g:5776:1: ( 'package' )
            // InternalAdeptness.g:5777:2: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalAdeptness.g:5786:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5790:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // InternalAdeptness.g:5791:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalAdeptness.g:5798:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5802:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // InternalAdeptness.g:5803:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:5803:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // InternalAdeptness.g:5804:2: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:5805:2: ( rule__PackageDeclaration__NameAssignment_1 )
            // InternalAdeptness.g:5805:3: rule__PackageDeclaration__NameAssignment_1
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
    // InternalAdeptness.g:5813:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5817:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // InternalAdeptness.g:5818:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalAdeptness.g:5825:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5829:1: ( ( '{' ) )
            // InternalAdeptness.g:5830:1: ( '{' )
            {
            // InternalAdeptness.g:5830:1: ( '{' )
            // InternalAdeptness.g:5831:2: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,73,FOLLOW_2); 
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
    // InternalAdeptness.g:5840:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5844:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // InternalAdeptness.g:5845:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_44);
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
    // InternalAdeptness.g:5852:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5856:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) )
            // InternalAdeptness.g:5857:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            {
            // InternalAdeptness.g:5857:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            // InternalAdeptness.g:5858:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 
            // InternalAdeptness.g:5859:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==28||LA47_0==31||LA47_0==39||(LA47_0>=71 && LA47_0<=72)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalAdeptness.g:5859:3: rule__PackageDeclaration__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__PackageDeclaration__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalAdeptness.g:5867:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5871:1: ( rule__PackageDeclaration__Group__4__Impl )
            // InternalAdeptness.g:5872:2: rule__PackageDeclaration__Group__4__Impl
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
    // InternalAdeptness.g:5878:1: rule__PackageDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5882:1: ( ( '}' ) )
            // InternalAdeptness.g:5883:1: ( '}' )
            {
            // InternalAdeptness.g:5883:1: ( '}' )
            // InternalAdeptness.g:5884:2: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,74,FOLLOW_2); 
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
    // InternalAdeptness.g:5894:1: rule__AbstractElement2__Group__0 : rule__AbstractElement2__Group__0__Impl rule__AbstractElement2__Group__1 ;
    public final void rule__AbstractElement2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5898:1: ( rule__AbstractElement2__Group__0__Impl rule__AbstractElement2__Group__1 )
            // InternalAdeptness.g:5899:2: rule__AbstractElement2__Group__0__Impl rule__AbstractElement2__Group__1
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
    // InternalAdeptness.g:5906:1: rule__AbstractElement2__Group__0__Impl : ( ( rule__AbstractElement2__FrontParenthesesAssignment_0 )* ) ;
    public final void rule__AbstractElement2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5910:1: ( ( ( rule__AbstractElement2__FrontParenthesesAssignment_0 )* ) )
            // InternalAdeptness.g:5911:1: ( ( rule__AbstractElement2__FrontParenthesesAssignment_0 )* )
            {
            // InternalAdeptness.g:5911:1: ( ( rule__AbstractElement2__FrontParenthesesAssignment_0 )* )
            // InternalAdeptness.g:5912:2: ( rule__AbstractElement2__FrontParenthesesAssignment_0 )*
            {
             before(grammarAccess.getAbstractElement2Access().getFrontParenthesesAssignment_0()); 
            // InternalAdeptness.g:5913:2: ( rule__AbstractElement2__FrontParenthesesAssignment_0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==11) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalAdeptness.g:5913:3: rule__AbstractElement2__FrontParenthesesAssignment_0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__AbstractElement2__FrontParenthesesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalAdeptness.g:5921:1: rule__AbstractElement2__Group__1 : rule__AbstractElement2__Group__1__Impl rule__AbstractElement2__Group__2 ;
    public final void rule__AbstractElement2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5925:1: ( rule__AbstractElement2__Group__1__Impl rule__AbstractElement2__Group__2 )
            // InternalAdeptness.g:5926:2: rule__AbstractElement2__Group__1__Impl rule__AbstractElement2__Group__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalAdeptness.g:5933:1: rule__AbstractElement2__Group__1__Impl : ( ( rule__AbstractElement2__Alternatives_1 ) ) ;
    public final void rule__AbstractElement2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5937:1: ( ( ( rule__AbstractElement2__Alternatives_1 ) ) )
            // InternalAdeptness.g:5938:1: ( ( rule__AbstractElement2__Alternatives_1 ) )
            {
            // InternalAdeptness.g:5938:1: ( ( rule__AbstractElement2__Alternatives_1 ) )
            // InternalAdeptness.g:5939:2: ( rule__AbstractElement2__Alternatives_1 )
            {
             before(grammarAccess.getAbstractElement2Access().getAlternatives_1()); 
            // InternalAdeptness.g:5940:2: ( rule__AbstractElement2__Alternatives_1 )
            // InternalAdeptness.g:5940:3: rule__AbstractElement2__Alternatives_1
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
    // InternalAdeptness.g:5948:1: rule__AbstractElement2__Group__2 : rule__AbstractElement2__Group__2__Impl ;
    public final void rule__AbstractElement2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5952:1: ( rule__AbstractElement2__Group__2__Impl )
            // InternalAdeptness.g:5953:2: rule__AbstractElement2__Group__2__Impl
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
    // InternalAdeptness.g:5959:1: rule__AbstractElement2__Group__2__Impl : ( ( rule__AbstractElement2__OpAssignment_2 )* ) ;
    public final void rule__AbstractElement2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5963:1: ( ( ( rule__AbstractElement2__OpAssignment_2 )* ) )
            // InternalAdeptness.g:5964:1: ( ( rule__AbstractElement2__OpAssignment_2 )* )
            {
            // InternalAdeptness.g:5964:1: ( ( rule__AbstractElement2__OpAssignment_2 )* )
            // InternalAdeptness.g:5965:2: ( rule__AbstractElement2__OpAssignment_2 )*
            {
             before(grammarAccess.getAbstractElement2Access().getOpAssignment_2()); 
            // InternalAdeptness.g:5966:2: ( rule__AbstractElement2__OpAssignment_2 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==12||(LA49_0>=16 && LA49_0<=27)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalAdeptness.g:5966:3: rule__AbstractElement2__OpAssignment_2
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__AbstractElement2__OpAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalAdeptness.g:5975:1: rule__Adeptness__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Adeptness__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5979:1: ( ( ruleAbstractElement ) )
            // InternalAdeptness.g:5980:2: ( ruleAbstractElement )
            {
            // InternalAdeptness.g:5980:2: ( ruleAbstractElement )
            // InternalAdeptness.g:5981:3: ruleAbstractElement
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
    // InternalAdeptness.g:5990:1: rule__Imports__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Imports__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5994:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalAdeptness.g:5995:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalAdeptness.g:5995:2: ( ruleQualifiedNameWithWildcard )
            // InternalAdeptness.g:5996:3: ruleQualifiedNameWithWildcard
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
    // InternalAdeptness.g:6005:1: rule__MonitoringFile__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MonitoringFile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6009:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:6010:2: ( RULE_ID )
            {
            // InternalAdeptness.g:6010:2: ( RULE_ID )
            // InternalAdeptness.g:6011:3: RULE_ID
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
    // InternalAdeptness.g:6020:1: rule__MonitoringFile__MonitoringPlanAssignment_3 : ( ruleMonitoringPlan ) ;
    public final void rule__MonitoringFile__MonitoringPlanAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6024:1: ( ( ruleMonitoringPlan ) )
            // InternalAdeptness.g:6025:2: ( ruleMonitoringPlan )
            {
            // InternalAdeptness.g:6025:2: ( ruleMonitoringPlan )
            // InternalAdeptness.g:6026:3: ruleMonitoringPlan
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
    // InternalAdeptness.g:6035:1: rule__MonitoringPlan__MonitoringVariablesAssignment : ( ruleMonitoringVariable ) ;
    public final void rule__MonitoringPlan__MonitoringVariablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6039:1: ( ( ruleMonitoringVariable ) )
            // InternalAdeptness.g:6040:2: ( ruleMonitoringVariable )
            {
            // InternalAdeptness.g:6040:2: ( ruleMonitoringVariable )
            // InternalAdeptness.g:6041:3: ruleMonitoringVariable
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
    // InternalAdeptness.g:6050:1: rule__MonitoringVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MonitoringVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6054:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:6055:2: ( RULE_ID )
            {
            // InternalAdeptness.g:6055:2: ( RULE_ID )
            // InternalAdeptness.g:6056:3: RULE_ID
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
    // InternalAdeptness.g:6065:1: rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 : ( ruleSig_type ) ;
    public final void rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6069:1: ( ( ruleSig_type ) )
            // InternalAdeptness.g:6070:2: ( ruleSig_type )
            {
            // InternalAdeptness.g:6070:2: ( ruleSig_type )
            // InternalAdeptness.g:6071:3: ruleSig_type
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
    // InternalAdeptness.g:6080:1: rule__MonitoringVariable__MaxAssignment_6_2 : ( ruleDOUBLE ) ;
    public final void rule__MonitoringVariable__MaxAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6084:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6085:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6085:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6086:3: ruleDOUBLE
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
    // InternalAdeptness.g:6095:1: rule__MonitoringVariable__MinAssignment_6_5 : ( ruleDOUBLE ) ;
    public final void rule__MonitoringVariable__MinAssignment_6_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6099:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6100:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6100:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6101:3: ruleDOUBLE
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
    // InternalAdeptness.g:6110:1: rule__Sig_type__Sig_typeAssignment_0 : ( ( 'boolean' ) ) ;
    public final void rule__Sig_type__Sig_typeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6114:1: ( ( ( 'boolean' ) ) )
            // InternalAdeptness.g:6115:2: ( ( 'boolean' ) )
            {
            // InternalAdeptness.g:6115:2: ( ( 'boolean' ) )
            // InternalAdeptness.g:6116:3: ( 'boolean' )
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeBooleanKeyword_0_0()); 
            // InternalAdeptness.g:6117:3: ( 'boolean' )
            // InternalAdeptness.g:6118:4: 'boolean'
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeBooleanKeyword_0_0()); 
            match(input,75,FOLLOW_2); 
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
    // InternalAdeptness.g:6129:1: rule__Sig_type__Sig_typeAssignment_1 : ( ( 'int' ) ) ;
    public final void rule__Sig_type__Sig_typeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6133:1: ( ( ( 'int' ) ) )
            // InternalAdeptness.g:6134:2: ( ( 'int' ) )
            {
            // InternalAdeptness.g:6134:2: ( ( 'int' ) )
            // InternalAdeptness.g:6135:3: ( 'int' )
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeIntKeyword_1_0()); 
            // InternalAdeptness.g:6136:3: ( 'int' )
            // InternalAdeptness.g:6137:4: 'int'
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeIntKeyword_1_0()); 
            match(input,76,FOLLOW_2); 
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
    // InternalAdeptness.g:6148:1: rule__Sig_type__Sig_typeAssignment_2 : ( ( 'double' ) ) ;
    public final void rule__Sig_type__Sig_typeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6152:1: ( ( ( 'double' ) ) )
            // InternalAdeptness.g:6153:2: ( ( 'double' ) )
            {
            // InternalAdeptness.g:6153:2: ( ( 'double' ) )
            // InternalAdeptness.g:6154:3: ( 'double' )
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeDoubleKeyword_2_0()); 
            // InternalAdeptness.g:6155:3: ( 'double' )
            // InternalAdeptness.g:6156:4: 'double'
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeDoubleKeyword_2_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalAdeptness.g:6167:1: rule__Signal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6171:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:6172:2: ( RULE_ID )
            {
            // InternalAdeptness.g:6172:2: ( RULE_ID )
            // InternalAdeptness.g:6173:3: RULE_ID
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
    // InternalAdeptness.g:6182:1: rule__Signal__CardinalityNumCPSAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Signal__CardinalityNumCPSAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6186:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:6187:2: ( RULE_INT )
            {
            // InternalAdeptness.g:6187:2: ( RULE_INT )
            // InternalAdeptness.g:6188:3: RULE_INT
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
    // InternalAdeptness.g:6197:1: rule__Signal__SuperTypeAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Signal__SuperTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6201:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAdeptness.g:6202:2: ( ( ruleQualifiedName ) )
            {
            // InternalAdeptness.g:6202:2: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:6203:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSignalAccess().getSuperTypeMonitoringFileCrossReference_4_1_0()); 
            // InternalAdeptness.g:6204:3: ( ruleQualifiedName )
            // InternalAdeptness.g:6205:4: ruleQualifiedName
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
    // InternalAdeptness.g:6216:1: rule__Signal__OracleAssignment_5 : ( ruleOracle ) ;
    public final void rule__Signal__OracleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6220:1: ( ( ruleOracle ) )
            // InternalAdeptness.g:6221:2: ( ruleOracle )
            {
            // InternalAdeptness.g:6221:2: ( ruleOracle )
            // InternalAdeptness.g:6222:3: ruleOracle
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
    // InternalAdeptness.g:6231:1: rule__Oracle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Oracle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6235:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:6236:2: ( RULE_ID )
            {
            // InternalAdeptness.g:6236:2: ( RULE_ID )
            // InternalAdeptness.g:6237:3: RULE_ID
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
    // InternalAdeptness.g:6246:1: rule__Oracle__WhenAssignment_3_0 : ( ruleWhen ) ;
    public final void rule__Oracle__WhenAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6250:1: ( ( ruleWhen ) )
            // InternalAdeptness.g:6251:2: ( ruleWhen )
            {
            // InternalAdeptness.g:6251:2: ( ruleWhen )
            // InternalAdeptness.g:6252:3: ruleWhen
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
    // InternalAdeptness.g:6261:1: rule__Oracle__WhileAssignment_3_1 : ( ruleWhile ) ;
    public final void rule__Oracle__WhileAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6265:1: ( ( ruleWhile ) )
            // InternalAdeptness.g:6266:2: ( ruleWhile )
            {
            // InternalAdeptness.g:6266:2: ( ruleWhile )
            // InternalAdeptness.g:6267:3: ruleWhile
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
    // InternalAdeptness.g:6276:1: rule__Oracle__CheckAssignment_4 : ( ruleChecks ) ;
    public final void rule__Oracle__CheckAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6280:1: ( ( ruleChecks ) )
            // InternalAdeptness.g:6281:2: ( ruleChecks )
            {
            // InternalAdeptness.g:6281:2: ( ruleChecks )
            // InternalAdeptness.g:6282:3: ruleChecks
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
    // InternalAdeptness.g:6291:1: rule__While__EmAssignment_1 : ( ruleExpressionsModel ) ;
    public final void rule__While__EmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6295:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:6296:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:6296:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:6297:3: ruleExpressionsModel
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
    // InternalAdeptness.g:6306:1: rule__When__EmAssignment_1 : ( ruleExpressionsModel ) ;
    public final void rule__When__EmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6310:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:6311:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:6311:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:6312:3: ruleExpressionsModel
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
    // InternalAdeptness.g:6321:1: rule__When__AwAssignment_2 : ( ruleAfterWhen ) ;
    public final void rule__When__AwAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6325:1: ( ( ruleAfterWhen ) )
            // InternalAdeptness.g:6326:2: ( ruleAfterWhen )
            {
            // InternalAdeptness.g:6326:2: ( ruleAfterWhen )
            // InternalAdeptness.g:6327:3: ruleAfterWhen
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
    // InternalAdeptness.g:6336:1: rule__AfterWhen__WaitAssignment_0 : ( ruleWait ) ;
    public final void rule__AfterWhen__WaitAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6340:1: ( ( ruleWait ) )
            // InternalAdeptness.g:6341:2: ( ruleWait )
            {
            // InternalAdeptness.g:6341:2: ( ruleWait )
            // InternalAdeptness.g:6342:3: ruleWait
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
    // InternalAdeptness.g:6351:1: rule__AfterWhen__DuringAssignment_1 : ( ruleDuring ) ;
    public final void rule__AfterWhen__DuringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6355:1: ( ( ruleDuring ) )
            // InternalAdeptness.g:6356:2: ( ruleDuring )
            {
            // InternalAdeptness.g:6356:2: ( ruleDuring )
            // InternalAdeptness.g:6357:3: ruleDuring
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
    // InternalAdeptness.g:6366:1: rule__Wait__TimeAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Wait__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6370:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6371:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6371:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6372:3: ruleDOUBLE
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
    // InternalAdeptness.g:6381:1: rule__Wait__UnitAssignment_3 : ( ruleTimeType ) ;
    public final void rule__Wait__UnitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6385:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:6386:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:6386:2: ( ruleTimeType )
            // InternalAdeptness.g:6387:3: ruleTimeType
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
    // InternalAdeptness.g:6396:1: rule__During__TimeAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__During__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6400:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6401:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6401:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6402:3: ruleDOUBLE
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
    // InternalAdeptness.g:6411:1: rule__During__UnitAssignment_3 : ( ruleTimeType ) ;
    public final void rule__During__UnitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6415:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:6416:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:6416:2: ( ruleTimeType )
            // InternalAdeptness.g:6417:3: ruleTimeType
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
    // InternalAdeptness.g:6426:1: rule__Checks__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Checks__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6430:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:6431:2: ( RULE_ID )
            {
            // InternalAdeptness.g:6431:2: ( RULE_ID )
            // InternalAdeptness.g:6432:3: RULE_ID
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
    // InternalAdeptness.g:6441:1: rule__Checks__EmAssignment_1_1 : ( ruleExpressionsModel ) ;
    public final void rule__Checks__EmAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6445:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:6446:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:6446:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:6447:3: ruleExpressionsModel
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
    // InternalAdeptness.g:6456:1: rule__Checks__ReferenceAssignment_2 : ( ruleReference ) ;
    public final void rule__Checks__ReferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6460:1: ( ( ruleReference ) )
            // InternalAdeptness.g:6461:2: ( ruleReference )
            {
            // InternalAdeptness.g:6461:2: ( ruleReference )
            // InternalAdeptness.g:6462:3: ruleReference
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
    // InternalAdeptness.g:6471:1: rule__Checks__FailReasonAssignment_3 : ( ruleFailReason ) ;
    public final void rule__Checks__FailReasonAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6475:1: ( ( ruleFailReason ) )
            // InternalAdeptness.g:6476:2: ( ruleFailReason )
            {
            // InternalAdeptness.g:6476:2: ( ruleFailReason )
            // InternalAdeptness.g:6477:3: ruleFailReason
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
    // InternalAdeptness.g:6486:1: rule__Checks__DescriptionAssignment_4 : ( ruleDescription ) ;
    public final void rule__Checks__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6490:1: ( ( ruleDescription ) )
            // InternalAdeptness.g:6491:2: ( ruleDescription )
            {
            // InternalAdeptness.g:6491:2: ( ruleDescription )
            // InternalAdeptness.g:6492:3: ruleDescription
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
    // InternalAdeptness.g:6501:1: rule__Description__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6505:1: ( ( RULE_STRING ) )
            // InternalAdeptness.g:6506:2: ( RULE_STRING )
            {
            // InternalAdeptness.g:6506:2: ( RULE_STRING )
            // InternalAdeptness.g:6507:3: RULE_STRING
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
    // InternalAdeptness.g:6516:1: rule__FailReason__ReasonAssignment_1 : ( ruleReason ) ;
    public final void rule__FailReason__ReasonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6520:1: ( ( ruleReason ) )
            // InternalAdeptness.g:6521:2: ( ruleReason )
            {
            // InternalAdeptness.g:6521:2: ( ruleReason )
            // InternalAdeptness.g:6522:3: ruleReason
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
    // InternalAdeptness.g:6531:1: rule__Reason__HighPeakAssignment_0_0 : ( ruleHighPeak ) ;
    public final void rule__Reason__HighPeakAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6535:1: ( ( ruleHighPeak ) )
            // InternalAdeptness.g:6536:2: ( ruleHighPeak )
            {
            // InternalAdeptness.g:6536:2: ( ruleHighPeak )
            // InternalAdeptness.g:6537:3: ruleHighPeak
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
    // InternalAdeptness.g:6546:1: rule__Reason__HighTimeAssignment_0_1 : ( ruleHighTime ) ;
    public final void rule__Reason__HighTimeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6550:1: ( ( ruleHighTime ) )
            // InternalAdeptness.g:6551:2: ( ruleHighTime )
            {
            // InternalAdeptness.g:6551:2: ( ruleHighTime )
            // InternalAdeptness.g:6552:3: ruleHighTime
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
    // InternalAdeptness.g:6561:1: rule__Reason__ConstDegAssignment_0_2 : ( ruleConstDeg ) ;
    public final void rule__Reason__ConstDegAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6565:1: ( ( ruleConstDeg ) )
            // InternalAdeptness.g:6566:2: ( ruleConstDeg )
            {
            // InternalAdeptness.g:6566:2: ( ruleConstDeg )
            // InternalAdeptness.g:6567:3: ruleConstDeg
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
    // InternalAdeptness.g:6576:1: rule__Reason__XPeaksAssignment_0_3 : ( ruleXPeaks ) ;
    public final void rule__Reason__XPeaksAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6580:1: ( ( ruleXPeaks ) )
            // InternalAdeptness.g:6581:2: ( ruleXPeaks )
            {
            // InternalAdeptness.g:6581:2: ( ruleXPeaks )
            // InternalAdeptness.g:6582:3: ruleXPeaks
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
    // InternalAdeptness.g:6591:1: rule__XPeaks__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__XPeaks__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6595:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6596:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6596:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6597:3: ruleDOUBLE
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
    // InternalAdeptness.g:6606:1: rule__XPeaks__NPeaksAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__XPeaks__NPeaksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6610:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6611:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6611:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6612:3: ruleDOUBLE
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
    // InternalAdeptness.g:6621:1: rule__XPeaks__TimeAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__XPeaks__TimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6625:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6626:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6626:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6627:3: ruleDOUBLE
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
    // InternalAdeptness.g:6636:1: rule__XPeaks__UnitAssignment_6 : ( ruleTimeType ) ;
    public final void rule__XPeaks__UnitAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6640:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:6641:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:6641:2: ( ruleTimeType )
            // InternalAdeptness.g:6642:3: ruleTimeType
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
    // InternalAdeptness.g:6651:1: rule__ConstDeg__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__ConstDeg__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6655:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6656:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6656:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6657:3: ruleDOUBLE
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
    // InternalAdeptness.g:6666:1: rule__HighTime__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__HighTime__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6670:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6671:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6671:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6672:3: ruleDOUBLE
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
    // InternalAdeptness.g:6681:1: rule__HighTime__TimeAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__HighTime__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6685:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6686:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6686:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6687:3: ruleDOUBLE
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
    // InternalAdeptness.g:6696:1: rule__HighTime__UnitAssignment_4 : ( ruleTimeType ) ;
    public final void rule__HighTime__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6700:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:6701:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:6701:2: ( ruleTimeType )
            // InternalAdeptness.g:6702:3: ruleTimeType
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
    // InternalAdeptness.g:6711:1: rule__HighPeak__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__HighPeak__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6715:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6716:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6716:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6717:3: ruleDOUBLE
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
    // InternalAdeptness.g:6726:1: rule__Reference__UpperAssignment_0_0 : ( ruleUpper ) ;
    public final void rule__Reference__UpperAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6730:1: ( ( ruleUpper ) )
            // InternalAdeptness.g:6731:2: ( ruleUpper )
            {
            // InternalAdeptness.g:6731:2: ( ruleUpper )
            // InternalAdeptness.g:6732:3: ruleUpper
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
    // InternalAdeptness.g:6741:1: rule__Reference__LowerAssignment_0_1 : ( ruleLower ) ;
    public final void rule__Reference__LowerAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6745:1: ( ( ruleLower ) )
            // InternalAdeptness.g:6746:2: ( ruleLower )
            {
            // InternalAdeptness.g:6746:2: ( ruleLower )
            // InternalAdeptness.g:6747:3: ruleLower
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
    // InternalAdeptness.g:6756:1: rule__Reference__RangeAssignment_0_2 : ( ruleRange ) ;
    public final void rule__Reference__RangeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6760:1: ( ( ruleRange ) )
            // InternalAdeptness.g:6761:2: ( ruleRange )
            {
            // InternalAdeptness.g:6761:2: ( ruleRange )
            // InternalAdeptness.g:6762:3: ruleRange
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
    // InternalAdeptness.g:6771:1: rule__Reference__GapAssignment_0_3 : ( ruleGap ) ;
    public final void rule__Reference__GapAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6775:1: ( ( ruleGap ) )
            // InternalAdeptness.g:6776:2: ( ruleGap )
            {
            // InternalAdeptness.g:6776:2: ( ruleGap )
            // InternalAdeptness.g:6777:3: ruleGap
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
    // InternalAdeptness.g:6786:1: rule__Reference__SameAssignment_0_4 : ( ruleSame ) ;
    public final void rule__Reference__SameAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6790:1: ( ( ruleSame ) )
            // InternalAdeptness.g:6791:2: ( ruleSame )
            {
            // InternalAdeptness.g:6791:2: ( ruleSame )
            // InternalAdeptness.g:6792:3: ruleSame
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
    // InternalAdeptness.g:6801:1: rule__Reference__NotsameAssignment_0_5 : ( ruleNotSame ) ;
    public final void rule__Reference__NotsameAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6805:1: ( ( ruleNotSame ) )
            // InternalAdeptness.g:6806:2: ( ruleNotSame )
            {
            // InternalAdeptness.g:6806:2: ( ruleNotSame )
            // InternalAdeptness.g:6807:3: ruleNotSame
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
    // InternalAdeptness.g:6816:1: rule__Same__Bound_uppAssignment_1 : ( ruleBound_up ) ;
    public final void rule__Same__Bound_uppAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6820:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:6821:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:6821:2: ( ruleBound_up )
            // InternalAdeptness.g:6822:3: ruleBound_up
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


    // $ANTLR start "rule__Same__TimesAssignment_2_0"
    // InternalAdeptness.g:6831:1: rule__Same__TimesAssignment_2_0 : ( ruleExactly ) ;
    public final void rule__Same__TimesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6835:1: ( ( ruleExactly ) )
            // InternalAdeptness.g:6836:2: ( ruleExactly )
            {
            // InternalAdeptness.g:6836:2: ( ruleExactly )
            // InternalAdeptness.g:6837:3: ruleExactly
            {
             before(grammarAccess.getSameAccess().getTimesExactlyParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExactly();

            state._fsp--;

             after(grammarAccess.getSameAccess().getTimesExactlyParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Same__TimesAssignment_2_0"


    // $ANTLR start "rule__Same__TimesAssignment_2_1"
    // InternalAdeptness.g:6846:1: rule__Same__TimesAssignment_2_1 : ( ruleAt_most ) ;
    public final void rule__Same__TimesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6850:1: ( ( ruleAt_most ) )
            // InternalAdeptness.g:6851:2: ( ruleAt_most )
            {
            // InternalAdeptness.g:6851:2: ( ruleAt_most )
            // InternalAdeptness.g:6852:3: ruleAt_most
            {
             before(grammarAccess.getSameAccess().getTimesAt_mostParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_most();

            state._fsp--;

             after(grammarAccess.getSameAccess().getTimesAt_mostParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Same__TimesAssignment_2_1"


    // $ANTLR start "rule__Same__TimesAssignment_2_2"
    // InternalAdeptness.g:6861:1: rule__Same__TimesAssignment_2_2 : ( ruleAt_least ) ;
    public final void rule__Same__TimesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6865:1: ( ( ruleAt_least ) )
            // InternalAdeptness.g:6866:2: ( ruleAt_least )
            {
            // InternalAdeptness.g:6866:2: ( ruleAt_least )
            // InternalAdeptness.g:6867:3: ruleAt_least
            {
             before(grammarAccess.getSameAccess().getTimesAt_leastParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_least();

            state._fsp--;

             after(grammarAccess.getSameAccess().getTimesAt_leastParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Same__TimesAssignment_2_2"


    // $ANTLR start "rule__NotSame__Bound_uppAssignment_1"
    // InternalAdeptness.g:6876:1: rule__NotSame__Bound_uppAssignment_1 : ( ruleBound_up ) ;
    public final void rule__NotSame__Bound_uppAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6880:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:6881:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:6881:2: ( ruleBound_up )
            // InternalAdeptness.g:6882:3: ruleBound_up
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


    // $ANTLR start "rule__NotSame__TimesAssignment_2_0"
    // InternalAdeptness.g:6891:1: rule__NotSame__TimesAssignment_2_0 : ( ruleExactly ) ;
    public final void rule__NotSame__TimesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6895:1: ( ( ruleExactly ) )
            // InternalAdeptness.g:6896:2: ( ruleExactly )
            {
            // InternalAdeptness.g:6896:2: ( ruleExactly )
            // InternalAdeptness.g:6897:3: ruleExactly
            {
             before(grammarAccess.getNotSameAccess().getTimesExactlyParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExactly();

            state._fsp--;

             after(grammarAccess.getNotSameAccess().getTimesExactlyParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotSame__TimesAssignment_2_0"


    // $ANTLR start "rule__NotSame__TimesAssignment_2_1"
    // InternalAdeptness.g:6906:1: rule__NotSame__TimesAssignment_2_1 : ( ruleAt_most ) ;
    public final void rule__NotSame__TimesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6910:1: ( ( ruleAt_most ) )
            // InternalAdeptness.g:6911:2: ( ruleAt_most )
            {
            // InternalAdeptness.g:6911:2: ( ruleAt_most )
            // InternalAdeptness.g:6912:3: ruleAt_most
            {
             before(grammarAccess.getNotSameAccess().getTimesAt_mostParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_most();

            state._fsp--;

             after(grammarAccess.getNotSameAccess().getTimesAt_mostParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotSame__TimesAssignment_2_1"


    // $ANTLR start "rule__NotSame__TimesAssignment_2_2"
    // InternalAdeptness.g:6921:1: rule__NotSame__TimesAssignment_2_2 : ( ruleAt_least ) ;
    public final void rule__NotSame__TimesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6925:1: ( ( ruleAt_least ) )
            // InternalAdeptness.g:6926:2: ( ruleAt_least )
            {
            // InternalAdeptness.g:6926:2: ( ruleAt_least )
            // InternalAdeptness.g:6927:3: ruleAt_least
            {
             before(grammarAccess.getNotSameAccess().getTimesAt_leastParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_least();

            state._fsp--;

             after(grammarAccess.getNotSameAccess().getTimesAt_leastParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotSame__TimesAssignment_2_2"


    // $ANTLR start "rule__Upper__Bound_uppAssignment_1"
    // InternalAdeptness.g:6936:1: rule__Upper__Bound_uppAssignment_1 : ( ruleBound_up ) ;
    public final void rule__Upper__Bound_uppAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6940:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:6941:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:6941:2: ( ruleBound_up )
            // InternalAdeptness.g:6942:3: ruleBound_up
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


    // $ANTLR start "rule__Upper__TimesAssignment_2_0"
    // InternalAdeptness.g:6951:1: rule__Upper__TimesAssignment_2_0 : ( ruleExactly ) ;
    public final void rule__Upper__TimesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6955:1: ( ( ruleExactly ) )
            // InternalAdeptness.g:6956:2: ( ruleExactly )
            {
            // InternalAdeptness.g:6956:2: ( ruleExactly )
            // InternalAdeptness.g:6957:3: ruleExactly
            {
             before(grammarAccess.getUpperAccess().getTimesExactlyParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExactly();

            state._fsp--;

             after(grammarAccess.getUpperAccess().getTimesExactlyParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Upper__TimesAssignment_2_0"


    // $ANTLR start "rule__Upper__TimesAssignment_2_1"
    // InternalAdeptness.g:6966:1: rule__Upper__TimesAssignment_2_1 : ( ruleAt_most ) ;
    public final void rule__Upper__TimesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6970:1: ( ( ruleAt_most ) )
            // InternalAdeptness.g:6971:2: ( ruleAt_most )
            {
            // InternalAdeptness.g:6971:2: ( ruleAt_most )
            // InternalAdeptness.g:6972:3: ruleAt_most
            {
             before(grammarAccess.getUpperAccess().getTimesAt_mostParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_most();

            state._fsp--;

             after(grammarAccess.getUpperAccess().getTimesAt_mostParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Upper__TimesAssignment_2_1"


    // $ANTLR start "rule__Upper__TimesAssignment_2_2"
    // InternalAdeptness.g:6981:1: rule__Upper__TimesAssignment_2_2 : ( ruleAt_least ) ;
    public final void rule__Upper__TimesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6985:1: ( ( ruleAt_least ) )
            // InternalAdeptness.g:6986:2: ( ruleAt_least )
            {
            // InternalAdeptness.g:6986:2: ( ruleAt_least )
            // InternalAdeptness.g:6987:3: ruleAt_least
            {
             before(grammarAccess.getUpperAccess().getTimesAt_leastParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_least();

            state._fsp--;

             after(grammarAccess.getUpperAccess().getTimesAt_leastParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Upper__TimesAssignment_2_2"


    // $ANTLR start "rule__Lower__Bound_lowerAssignment_1"
    // InternalAdeptness.g:6996:1: rule__Lower__Bound_lowerAssignment_1 : ( ruleBound_Down ) ;
    public final void rule__Lower__Bound_lowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7000:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:7001:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:7001:2: ( ruleBound_Down )
            // InternalAdeptness.g:7002:3: ruleBound_Down
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


    // $ANTLR start "rule__Lower__TimesAssignment_2_0"
    // InternalAdeptness.g:7011:1: rule__Lower__TimesAssignment_2_0 : ( ruleExactly ) ;
    public final void rule__Lower__TimesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7015:1: ( ( ruleExactly ) )
            // InternalAdeptness.g:7016:2: ( ruleExactly )
            {
            // InternalAdeptness.g:7016:2: ( ruleExactly )
            // InternalAdeptness.g:7017:3: ruleExactly
            {
             before(grammarAccess.getLowerAccess().getTimesExactlyParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExactly();

            state._fsp--;

             after(grammarAccess.getLowerAccess().getTimesExactlyParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lower__TimesAssignment_2_0"


    // $ANTLR start "rule__Lower__TimesAssignment_2_1"
    // InternalAdeptness.g:7026:1: rule__Lower__TimesAssignment_2_1 : ( ruleAt_most ) ;
    public final void rule__Lower__TimesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7030:1: ( ( ruleAt_most ) )
            // InternalAdeptness.g:7031:2: ( ruleAt_most )
            {
            // InternalAdeptness.g:7031:2: ( ruleAt_most )
            // InternalAdeptness.g:7032:3: ruleAt_most
            {
             before(grammarAccess.getLowerAccess().getTimesAt_mostParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_most();

            state._fsp--;

             after(grammarAccess.getLowerAccess().getTimesAt_mostParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lower__TimesAssignment_2_1"


    // $ANTLR start "rule__Lower__TimesAssignment_2_2"
    // InternalAdeptness.g:7041:1: rule__Lower__TimesAssignment_2_2 : ( ruleAt_least ) ;
    public final void rule__Lower__TimesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7045:1: ( ( ruleAt_least ) )
            // InternalAdeptness.g:7046:2: ( ruleAt_least )
            {
            // InternalAdeptness.g:7046:2: ( ruleAt_least )
            // InternalAdeptness.g:7047:3: ruleAt_least
            {
             before(grammarAccess.getLowerAccess().getTimesAt_leastParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_least();

            state._fsp--;

             after(grammarAccess.getLowerAccess().getTimesAt_leastParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lower__TimesAssignment_2_2"


    // $ANTLR start "rule__Range__Bound_lowerAssignment_1"
    // InternalAdeptness.g:7056:1: rule__Range__Bound_lowerAssignment_1 : ( ruleBound_Down ) ;
    public final void rule__Range__Bound_lowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7060:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:7061:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:7061:2: ( ruleBound_Down )
            // InternalAdeptness.g:7062:3: ruleBound_Down
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
    // InternalAdeptness.g:7071:1: rule__Range__Bound_uppAssignment_3 : ( ruleBound_up ) ;
    public final void rule__Range__Bound_uppAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7075:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:7076:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:7076:2: ( ruleBound_up )
            // InternalAdeptness.g:7077:3: ruleBound_up
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


    // $ANTLR start "rule__Range__TimesAssignment_4_0"
    // InternalAdeptness.g:7086:1: rule__Range__TimesAssignment_4_0 : ( ruleExactly ) ;
    public final void rule__Range__TimesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7090:1: ( ( ruleExactly ) )
            // InternalAdeptness.g:7091:2: ( ruleExactly )
            {
            // InternalAdeptness.g:7091:2: ( ruleExactly )
            // InternalAdeptness.g:7092:3: ruleExactly
            {
             before(grammarAccess.getRangeAccess().getTimesExactlyParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExactly();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getTimesExactlyParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__TimesAssignment_4_0"


    // $ANTLR start "rule__Range__TimesAssignment_4_1"
    // InternalAdeptness.g:7101:1: rule__Range__TimesAssignment_4_1 : ( ruleAt_most ) ;
    public final void rule__Range__TimesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7105:1: ( ( ruleAt_most ) )
            // InternalAdeptness.g:7106:2: ( ruleAt_most )
            {
            // InternalAdeptness.g:7106:2: ( ruleAt_most )
            // InternalAdeptness.g:7107:3: ruleAt_most
            {
             before(grammarAccess.getRangeAccess().getTimesAt_mostParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_most();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getTimesAt_mostParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__TimesAssignment_4_1"


    // $ANTLR start "rule__Range__TimesAssignment_4_2"
    // InternalAdeptness.g:7116:1: rule__Range__TimesAssignment_4_2 : ( ruleAt_least ) ;
    public final void rule__Range__TimesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7120:1: ( ( ruleAt_least ) )
            // InternalAdeptness.g:7121:2: ( ruleAt_least )
            {
            // InternalAdeptness.g:7121:2: ( ruleAt_least )
            // InternalAdeptness.g:7122:3: ruleAt_least
            {
             before(grammarAccess.getRangeAccess().getTimesAt_leastParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_least();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getTimesAt_leastParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__TimesAssignment_4_2"


    // $ANTLR start "rule__Gap__Bound_lowerAssignment_1"
    // InternalAdeptness.g:7131:1: rule__Gap__Bound_lowerAssignment_1 : ( ruleBound_Down ) ;
    public final void rule__Gap__Bound_lowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7135:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:7136:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:7136:2: ( ruleBound_Down )
            // InternalAdeptness.g:7137:3: ruleBound_Down
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
    // InternalAdeptness.g:7146:1: rule__Gap__Bound_uppAssignment_3 : ( ruleBound_up ) ;
    public final void rule__Gap__Bound_uppAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7150:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:7151:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:7151:2: ( ruleBound_up )
            // InternalAdeptness.g:7152:3: ruleBound_up
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


    // $ANTLR start "rule__Gap__TimesAssignment_4_0"
    // InternalAdeptness.g:7161:1: rule__Gap__TimesAssignment_4_0 : ( ruleExactly ) ;
    public final void rule__Gap__TimesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7165:1: ( ( ruleExactly ) )
            // InternalAdeptness.g:7166:2: ( ruleExactly )
            {
            // InternalAdeptness.g:7166:2: ( ruleExactly )
            // InternalAdeptness.g:7167:3: ruleExactly
            {
             before(grammarAccess.getGapAccess().getTimesExactlyParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExactly();

            state._fsp--;

             after(grammarAccess.getGapAccess().getTimesExactlyParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gap__TimesAssignment_4_0"


    // $ANTLR start "rule__Gap__TimesAssignment_4_1"
    // InternalAdeptness.g:7176:1: rule__Gap__TimesAssignment_4_1 : ( ruleAt_most ) ;
    public final void rule__Gap__TimesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7180:1: ( ( ruleAt_most ) )
            // InternalAdeptness.g:7181:2: ( ruleAt_most )
            {
            // InternalAdeptness.g:7181:2: ( ruleAt_most )
            // InternalAdeptness.g:7182:3: ruleAt_most
            {
             before(grammarAccess.getGapAccess().getTimesAt_mostParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_most();

            state._fsp--;

             after(grammarAccess.getGapAccess().getTimesAt_mostParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gap__TimesAssignment_4_1"


    // $ANTLR start "rule__Gap__TimesAssignment_4_2"
    // InternalAdeptness.g:7191:1: rule__Gap__TimesAssignment_4_2 : ( ruleAt_least ) ;
    public final void rule__Gap__TimesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7195:1: ( ( ruleAt_least ) )
            // InternalAdeptness.g:7196:2: ( ruleAt_least )
            {
            // InternalAdeptness.g:7196:2: ( ruleAt_least )
            // InternalAdeptness.g:7197:3: ruleAt_least
            {
             before(grammarAccess.getGapAccess().getTimesAt_leastParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAt_least();

            state._fsp--;

             after(grammarAccess.getGapAccess().getTimesAt_leastParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gap__TimesAssignment_4_2"


    // $ANTLR start "rule__Exactly__ValueAssignment_1"
    // InternalAdeptness.g:7206:1: rule__Exactly__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Exactly__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7210:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7211:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7211:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7212:3: ruleDOUBLE
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
    // InternalAdeptness.g:7221:1: rule__Exactly__TimeAssignment_2_1_1 : ( ruleDOUBLE ) ;
    public final void rule__Exactly__TimeAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7225:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7226:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7226:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7227:3: ruleDOUBLE
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
    // InternalAdeptness.g:7236:1: rule__Exactly__UnitAssignment_2_1_2 : ( ruleTimeType ) ;
    public final void rule__Exactly__UnitAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7240:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:7241:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:7241:2: ( ruleTimeType )
            // InternalAdeptness.g:7242:3: ruleTimeType
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
    // InternalAdeptness.g:7251:1: rule__Exactly__UnitAssignment_2_2 : ( ruleTimeType ) ;
    public final void rule__Exactly__UnitAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7255:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:7256:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:7256:2: ( ruleTimeType )
            // InternalAdeptness.g:7257:3: ruleTimeType
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
    // InternalAdeptness.g:7266:1: rule__At_most__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__At_most__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7270:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7271:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7271:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7272:3: ruleDOUBLE
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
    // InternalAdeptness.g:7281:1: rule__At_most__TimeAssignment_2_1_1 : ( ruleDOUBLE ) ;
    public final void rule__At_most__TimeAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7285:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7286:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7286:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7287:3: ruleDOUBLE
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
    // InternalAdeptness.g:7296:1: rule__At_most__UnitAssignment_2_1_2 : ( ruleTimeType ) ;
    public final void rule__At_most__UnitAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7300:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:7301:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:7301:2: ( ruleTimeType )
            // InternalAdeptness.g:7302:3: ruleTimeType
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
    // InternalAdeptness.g:7311:1: rule__At_most__UnitAssignment_2_2 : ( ruleTimeType ) ;
    public final void rule__At_most__UnitAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7315:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:7316:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:7316:2: ( ruleTimeType )
            // InternalAdeptness.g:7317:3: ruleTimeType
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
    // InternalAdeptness.g:7326:1: rule__At_least__ValueAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__At_least__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7330:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7331:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7331:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7332:3: ruleDOUBLE
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
    // InternalAdeptness.g:7341:1: rule__At_least__TimeAssignment_2_1_1 : ( ruleDOUBLE ) ;
    public final void rule__At_least__TimeAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7345:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7346:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7346:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7347:3: ruleDOUBLE
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
    // InternalAdeptness.g:7356:1: rule__At_least__UnitAssignment_2_1_2 : ( ruleTimeType ) ;
    public final void rule__At_least__UnitAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7360:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:7361:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:7361:2: ( ruleTimeType )
            // InternalAdeptness.g:7362:3: ruleTimeType
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
    // InternalAdeptness.g:7371:1: rule__At_least__UnitAssignment_2_2 : ( ruleTimeType ) ;
    public final void rule__At_least__UnitAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7375:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:7376:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:7376:2: ( ruleTimeType )
            // InternalAdeptness.g:7377:3: ruleTimeType
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
    // InternalAdeptness.g:7386:1: rule__Bound_up__ValueAssignment_0 : ( ruleDOUBLE ) ;
    public final void rule__Bound_up__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7390:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7391:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7391:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7392:3: ruleDOUBLE
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
    // InternalAdeptness.g:7401:1: rule__Bound_up__EmAssignment_1 : ( ruleExpressionsModel ) ;
    public final void rule__Bound_up__EmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7405:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:7406:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:7406:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:7407:3: ruleExpressionsModel
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
    // InternalAdeptness.g:7416:1: rule__Bound_Down__ValueAssignment_0 : ( ruleDOUBLE ) ;
    public final void rule__Bound_Down__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7420:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7421:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7421:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7422:3: ruleDOUBLE
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
    // InternalAdeptness.g:7431:1: rule__Bound_Down__EmAssignment_1 : ( ruleExpressionsModel ) ;
    public final void rule__Bound_Down__EmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7435:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:7436:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:7436:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:7437:3: ruleExpressionsModel
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
    // InternalAdeptness.g:7446:1: rule__BOOLEAN__BoolAssignment : ( ruleb ) ;
    public final void rule__BOOLEAN__BoolAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7450:1: ( ( ruleb ) )
            // InternalAdeptness.g:7451:2: ( ruleb )
            {
            // InternalAdeptness.g:7451:2: ( ruleb )
            // InternalAdeptness.g:7452:3: ruleb
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
    // InternalAdeptness.g:7461:1: rule__DOUBLE__DValAssignment : ( ruled ) ;
    public final void rule__DOUBLE__DValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7465:1: ( ( ruled ) )
            // InternalAdeptness.g:7466:2: ( ruled )
            {
            // InternalAdeptness.g:7466:2: ( ruled )
            // InternalAdeptness.g:7467:3: ruled
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
    // InternalAdeptness.g:7476:1: rule__TimeType__TimeAssignment_0 : ( ( 'miliseconds' ) ) ;
    public final void rule__TimeType__TimeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7480:1: ( ( ( 'miliseconds' ) ) )
            // InternalAdeptness.g:7481:2: ( ( 'miliseconds' ) )
            {
            // InternalAdeptness.g:7481:2: ( ( 'miliseconds' ) )
            // InternalAdeptness.g:7482:3: ( 'miliseconds' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMilisecondsKeyword_0_0()); 
            // InternalAdeptness.g:7483:3: ( 'miliseconds' )
            // InternalAdeptness.g:7484:4: 'miliseconds'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMilisecondsKeyword_0_0()); 
            match(input,78,FOLLOW_2); 
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
    // InternalAdeptness.g:7495:1: rule__TimeType__TimeAssignment_1 : ( ( 'seconds' ) ) ;
    public final void rule__TimeType__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7499:1: ( ( ( 'seconds' ) ) )
            // InternalAdeptness.g:7500:2: ( ( 'seconds' ) )
            {
            // InternalAdeptness.g:7500:2: ( ( 'seconds' ) )
            // InternalAdeptness.g:7501:3: ( 'seconds' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeSecondsKeyword_1_0()); 
            // InternalAdeptness.g:7502:3: ( 'seconds' )
            // InternalAdeptness.g:7503:4: 'seconds'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeSecondsKeyword_1_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalAdeptness.g:7514:1: rule__TimeType__TimeAssignment_2 : ( ( 'minutes' ) ) ;
    public final void rule__TimeType__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7518:1: ( ( ( 'minutes' ) ) )
            // InternalAdeptness.g:7519:2: ( ( 'minutes' ) )
            {
            // InternalAdeptness.g:7519:2: ( ( 'minutes' ) )
            // InternalAdeptness.g:7520:3: ( 'minutes' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMinutesKeyword_2_0()); 
            // InternalAdeptness.g:7521:3: ( 'minutes' )
            // InternalAdeptness.g:7522:4: 'minutes'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMinutesKeyword_2_0()); 
            match(input,80,FOLLOW_2); 
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
    // InternalAdeptness.g:7533:1: rule__TimeType__TimeAssignment_3 : ( ( 'hours' ) ) ;
    public final void rule__TimeType__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7537:1: ( ( ( 'hours' ) ) )
            // InternalAdeptness.g:7538:2: ( ( 'hours' ) )
            {
            // InternalAdeptness.g:7538:2: ( ( 'hours' ) )
            // InternalAdeptness.g:7539:3: ( 'hours' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeHoursKeyword_3_0()); 
            // InternalAdeptness.g:7540:3: ( 'hours' )
            // InternalAdeptness.g:7541:4: 'hours'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeHoursKeyword_3_0()); 
            match(input,81,FOLLOW_2); 
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
    // InternalAdeptness.g:7552:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7556:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:7557:2: ( RULE_ID )
            {
            // InternalAdeptness.g:7557:2: ( RULE_ID )
            // InternalAdeptness.g:7558:3: RULE_ID
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
    // InternalAdeptness.g:7567:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7571:1: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:7572:2: ( ruleQualifiedName )
            {
            // InternalAdeptness.g:7572:2: ( ruleQualifiedName )
            // InternalAdeptness.g:7573:3: ruleQualifiedName
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
    // InternalAdeptness.g:7582:1: rule__PackageDeclaration__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7586:1: ( ( ruleAbstractElement ) )
            // InternalAdeptness.g:7587:2: ( ruleAbstractElement )
            {
            // InternalAdeptness.g:7587:2: ( ruleAbstractElement )
            // InternalAdeptness.g:7588:3: ruleAbstractElement
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
    // InternalAdeptness.g:7597:1: rule__ExpressionsModel__ElementsAssignment : ( ruleAbstractElement2 ) ;
    public final void rule__ExpressionsModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7601:1: ( ( ruleAbstractElement2 ) )
            // InternalAdeptness.g:7602:2: ( ruleAbstractElement2 )
            {
            // InternalAdeptness.g:7602:2: ( ruleAbstractElement2 )
            // InternalAdeptness.g:7603:3: ruleAbstractElement2
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
    // InternalAdeptness.g:7612:1: rule__AbstractElement2__FrontParenthesesAssignment_0 : ( ruleFrontParentheses ) ;
    public final void rule__AbstractElement2__FrontParenthesesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7616:1: ( ( ruleFrontParentheses ) )
            // InternalAdeptness.g:7617:2: ( ruleFrontParentheses )
            {
            // InternalAdeptness.g:7617:2: ( ruleFrontParentheses )
            // InternalAdeptness.g:7618:3: ruleFrontParentheses
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
    // InternalAdeptness.g:7627:1: rule__AbstractElement2__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__AbstractElement2__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7631:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:7632:2: ( RULE_ID )
            {
            // InternalAdeptness.g:7632:2: ( RULE_ID )
            // InternalAdeptness.g:7633:3: RULE_ID
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
    // InternalAdeptness.g:7642:1: rule__AbstractElement2__ValueAssignment_1_1 : ( ruleDOUBLE ) ;
    public final void rule__AbstractElement2__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7646:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:7647:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:7647:2: ( ruleDOUBLE )
            // InternalAdeptness.g:7648:3: ruleDOUBLE
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
    // InternalAdeptness.g:7657:1: rule__AbstractElement2__OpAssignment_2 : ( ruleOperators ) ;
    public final void rule__AbstractElement2__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7661:1: ( ( ruleOperators ) )
            // InternalAdeptness.g:7662:2: ( ruleOperators )
            {
            // InternalAdeptness.g:7662:2: ( ruleOperators )
            // InternalAdeptness.g:7663:3: ruleOperators
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
    // InternalAdeptness.g:7672:1: rule__Operators__OperatorAssignment_0 : ( ruleOp ) ;
    public final void rule__Operators__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7676:1: ( ( ruleOp ) )
            // InternalAdeptness.g:7677:2: ( ruleOp )
            {
            // InternalAdeptness.g:7677:2: ( ruleOp )
            // InternalAdeptness.g:7678:3: ruleOp
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
    // InternalAdeptness.g:7687:1: rule__Operators__ComparationAssignment_1 : ( ruleCompOp ) ;
    public final void rule__Operators__ComparationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7691:1: ( ( ruleCompOp ) )
            // InternalAdeptness.g:7692:2: ( ruleCompOp )
            {
            // InternalAdeptness.g:7692:2: ( ruleCompOp )
            // InternalAdeptness.g:7693:3: ruleCompOp
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
    // InternalAdeptness.g:7702:1: rule__Operators__LogicOperatorAssignment_2 : ( ruleLogicOp ) ;
    public final void rule__Operators__LogicOperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7706:1: ( ( ruleLogicOp ) )
            // InternalAdeptness.g:7707:2: ( ruleLogicOp )
            {
            // InternalAdeptness.g:7707:2: ( ruleLogicOp )
            // InternalAdeptness.g:7708:3: ruleLogicOp
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
    // InternalAdeptness.g:7717:1: rule__Operators__BackParenthesesAssignment_3 : ( ruleBackParentheses ) ;
    public final void rule__Operators__BackParenthesesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7721:1: ( ( ruleBackParentheses ) )
            // InternalAdeptness.g:7722:2: ( ruleBackParentheses )
            {
            // InternalAdeptness.g:7722:2: ( ruleBackParentheses )
            // InternalAdeptness.g:7723:3: ruleBackParentheses
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
    // InternalAdeptness.g:7732:1: rule__CompOp__OpAssignment : ( ( rule__CompOp__OpAlternatives_0 ) ) ;
    public final void rule__CompOp__OpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7736:1: ( ( ( rule__CompOp__OpAlternatives_0 ) ) )
            // InternalAdeptness.g:7737:2: ( ( rule__CompOp__OpAlternatives_0 ) )
            {
            // InternalAdeptness.g:7737:2: ( ( rule__CompOp__OpAlternatives_0 ) )
            // InternalAdeptness.g:7738:3: ( rule__CompOp__OpAlternatives_0 )
            {
             before(grammarAccess.getCompOpAccess().getOpAlternatives_0()); 
            // InternalAdeptness.g:7739:3: ( rule__CompOp__OpAlternatives_0 )
            // InternalAdeptness.g:7739:4: rule__CompOp__OpAlternatives_0
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
    // InternalAdeptness.g:7747:1: rule__LogicOp__OpAssignment : ( ( rule__LogicOp__OpAlternatives_0 ) ) ;
    public final void rule__LogicOp__OpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7751:1: ( ( ( rule__LogicOp__OpAlternatives_0 ) ) )
            // InternalAdeptness.g:7752:2: ( ( rule__LogicOp__OpAlternatives_0 ) )
            {
            // InternalAdeptness.g:7752:2: ( ( rule__LogicOp__OpAlternatives_0 ) )
            // InternalAdeptness.g:7753:3: ( rule__LogicOp__OpAlternatives_0 )
            {
             before(grammarAccess.getLogicOpAccess().getOpAlternatives_0()); 
            // InternalAdeptness.g:7754:3: ( rule__LogicOp__OpAlternatives_0 )
            // InternalAdeptness.g:7754:4: rule__LogicOp__OpAlternatives_0
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
    // InternalAdeptness.g:7762:1: rule__Op__OpAssignment : ( ( rule__Op__OpAlternatives_0 ) ) ;
    public final void rule__Op__OpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7766:1: ( ( ( rule__Op__OpAlternatives_0 ) ) )
            // InternalAdeptness.g:7767:2: ( ( rule__Op__OpAlternatives_0 ) )
            {
            // InternalAdeptness.g:7767:2: ( ( rule__Op__OpAlternatives_0 ) )
            // InternalAdeptness.g:7768:3: ( rule__Op__OpAlternatives_0 )
            {
             before(grammarAccess.getOpAccess().getOpAlternatives_0()); 
            // InternalAdeptness.g:7769:3: ( rule__Op__OpAlternatives_0 )
            // InternalAdeptness.g:7769:4: rule__Op__OpAlternatives_0
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
    static final String dfa_2s = "\1\67\1\5\1\uffff\1\5\1\36\1\5\3\uffff\1\66";
    static final String dfa_3s = "\1\72\1\31\1\uffff\1\5\1\73\1\5\3\uffff\1\73";
    static final String dfa_4s = "\2\uffff\1\3\3\uffff\1\1\1\2\1\4\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2",
            "\1\4\23\uffff\1\3",
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
            return "1496:1: rule__Reason__Alternatives_0 : ( ( ( rule__Reason__HighPeakAssignment_0_0 ) ) | ( ( rule__Reason__HighTimeAssignment_0_1 ) ) | ( ( rule__Reason__ConstDegAssignment_0_2 ) ) | ( ( rule__Reason__XPeaksAssignment_0_3 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000008090000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000832L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000830L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0008C00000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x000000000003C000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0480000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000068L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000002000L,0x000000000003C010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000008090000000L,0x0000000000000580L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x000000000FFF1000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000000000FFF1002L});

}