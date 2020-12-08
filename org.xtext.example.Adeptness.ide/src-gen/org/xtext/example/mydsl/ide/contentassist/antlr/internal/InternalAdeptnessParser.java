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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'import'", "'.*'", "'.'", "'MONITORINGPLAN'", "':'", "'ENDMONITORINGPLAN'", "'MONITOR'", "'type'", "'ENDMONITOR'", "'max'", "'min'", "'CPS'", "'ENDCPS'", "'['", "']'", "'implements'", "'ORACLE'", "'ENDORACLE'", "'when:'", "'checks:'", "'Description: '", "'fails if :'", "';'", "'confidence is below'", "'more than'", "'times within'", "'confidence is in constant degradation'", "'within'", "'is below'", "'is above'", "'is in range between'", "'and'", "'not in range between'", "'-'", "'datatype'", "'package'", "'{'", "'}'", "'='", "'||'", "'&&'", "'+'", "'('", "')'", "'!'", "'boolean'", "'int'", "'double'", "'miliseconds'", "'seconds'", "'minutes'", "'hours'"
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
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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

                if ( (LA1_0==21||LA1_0==24||LA1_0==32||(LA1_0>=55 && LA1_0<=56)) ) {
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


    // $ANTLR start "entryRuleWhen"
    // InternalAdeptness.g:353:1: entryRuleWhen : ruleWhen EOF ;
    public final void entryRuleWhen() throws RecognitionException {
        try {
            // InternalAdeptness.g:354:1: ( ruleWhen EOF )
            // InternalAdeptness.g:355:1: ruleWhen EOF
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
    // InternalAdeptness.g:362:1: ruleWhen : ( ( rule__When__Group__0 ) ) ;
    public final void ruleWhen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:366:2: ( ( ( rule__When__Group__0 ) ) )
            // InternalAdeptness.g:367:2: ( ( rule__When__Group__0 ) )
            {
            // InternalAdeptness.g:367:2: ( ( rule__When__Group__0 ) )
            // InternalAdeptness.g:368:3: ( rule__When__Group__0 )
            {
             before(grammarAccess.getWhenAccess().getGroup()); 
            // InternalAdeptness.g:369:3: ( rule__When__Group__0 )
            // InternalAdeptness.g:369:4: rule__When__Group__0
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


    // $ANTLR start "entryRuleChecks"
    // InternalAdeptness.g:378:1: entryRuleChecks : ruleChecks EOF ;
    public final void entryRuleChecks() throws RecognitionException {
        try {
            // InternalAdeptness.g:379:1: ( ruleChecks EOF )
            // InternalAdeptness.g:380:1: ruleChecks EOF
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
    // InternalAdeptness.g:387:1: ruleChecks : ( ( rule__Checks__Group__0 ) ) ;
    public final void ruleChecks() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:391:2: ( ( ( rule__Checks__Group__0 ) ) )
            // InternalAdeptness.g:392:2: ( ( rule__Checks__Group__0 ) )
            {
            // InternalAdeptness.g:392:2: ( ( rule__Checks__Group__0 ) )
            // InternalAdeptness.g:393:3: ( rule__Checks__Group__0 )
            {
             before(grammarAccess.getChecksAccess().getGroup()); 
            // InternalAdeptness.g:394:3: ( rule__Checks__Group__0 )
            // InternalAdeptness.g:394:4: rule__Checks__Group__0
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
    // InternalAdeptness.g:403:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalAdeptness.g:404:1: ( ruleDescription EOF )
            // InternalAdeptness.g:405:1: ruleDescription EOF
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
    // InternalAdeptness.g:412:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:416:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalAdeptness.g:417:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalAdeptness.g:417:2: ( ( rule__Description__Group__0 ) )
            // InternalAdeptness.g:418:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalAdeptness.g:419:3: ( rule__Description__Group__0 )
            // InternalAdeptness.g:419:4: rule__Description__Group__0
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
    // InternalAdeptness.g:428:1: entryRuleFailReason : ruleFailReason EOF ;
    public final void entryRuleFailReason() throws RecognitionException {
        try {
            // InternalAdeptness.g:429:1: ( ruleFailReason EOF )
            // InternalAdeptness.g:430:1: ruleFailReason EOF
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
    // InternalAdeptness.g:437:1: ruleFailReason : ( ( rule__FailReason__Group__0 ) ) ;
    public final void ruleFailReason() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:441:2: ( ( ( rule__FailReason__Group__0 ) ) )
            // InternalAdeptness.g:442:2: ( ( rule__FailReason__Group__0 ) )
            {
            // InternalAdeptness.g:442:2: ( ( rule__FailReason__Group__0 ) )
            // InternalAdeptness.g:443:3: ( rule__FailReason__Group__0 )
            {
             before(grammarAccess.getFailReasonAccess().getGroup()); 
            // InternalAdeptness.g:444:3: ( rule__FailReason__Group__0 )
            // InternalAdeptness.g:444:4: rule__FailReason__Group__0
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
    // InternalAdeptness.g:453:1: entryRuleReason : ruleReason EOF ;
    public final void entryRuleReason() throws RecognitionException {
        try {
            // InternalAdeptness.g:454:1: ( ruleReason EOF )
            // InternalAdeptness.g:455:1: ruleReason EOF
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
    // InternalAdeptness.g:462:1: ruleReason : ( ( rule__Reason__Group__0 ) ) ;
    public final void ruleReason() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:466:2: ( ( ( rule__Reason__Group__0 ) ) )
            // InternalAdeptness.g:467:2: ( ( rule__Reason__Group__0 ) )
            {
            // InternalAdeptness.g:467:2: ( ( rule__Reason__Group__0 ) )
            // InternalAdeptness.g:468:3: ( rule__Reason__Group__0 )
            {
             before(grammarAccess.getReasonAccess().getGroup()); 
            // InternalAdeptness.g:469:3: ( rule__Reason__Group__0 )
            // InternalAdeptness.g:469:4: rule__Reason__Group__0
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
    // InternalAdeptness.g:478:1: entryRuleXPeaks : ruleXPeaks EOF ;
    public final void entryRuleXPeaks() throws RecognitionException {
        try {
            // InternalAdeptness.g:479:1: ( ruleXPeaks EOF )
            // InternalAdeptness.g:480:1: ruleXPeaks EOF
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
    // InternalAdeptness.g:487:1: ruleXPeaks : ( ( rule__XPeaks__Group__0 ) ) ;
    public final void ruleXPeaks() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:491:2: ( ( ( rule__XPeaks__Group__0 ) ) )
            // InternalAdeptness.g:492:2: ( ( rule__XPeaks__Group__0 ) )
            {
            // InternalAdeptness.g:492:2: ( ( rule__XPeaks__Group__0 ) )
            // InternalAdeptness.g:493:3: ( rule__XPeaks__Group__0 )
            {
             before(grammarAccess.getXPeaksAccess().getGroup()); 
            // InternalAdeptness.g:494:3: ( rule__XPeaks__Group__0 )
            // InternalAdeptness.g:494:4: rule__XPeaks__Group__0
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
    // InternalAdeptness.g:503:1: entryRuleConstDeg : ruleConstDeg EOF ;
    public final void entryRuleConstDeg() throws RecognitionException {
        try {
            // InternalAdeptness.g:504:1: ( ruleConstDeg EOF )
            // InternalAdeptness.g:505:1: ruleConstDeg EOF
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
    // InternalAdeptness.g:512:1: ruleConstDeg : ( ( rule__ConstDeg__Group__0 ) ) ;
    public final void ruleConstDeg() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:516:2: ( ( ( rule__ConstDeg__Group__0 ) ) )
            // InternalAdeptness.g:517:2: ( ( rule__ConstDeg__Group__0 ) )
            {
            // InternalAdeptness.g:517:2: ( ( rule__ConstDeg__Group__0 ) )
            // InternalAdeptness.g:518:3: ( rule__ConstDeg__Group__0 )
            {
             before(grammarAccess.getConstDegAccess().getGroup()); 
            // InternalAdeptness.g:519:3: ( rule__ConstDeg__Group__0 )
            // InternalAdeptness.g:519:4: rule__ConstDeg__Group__0
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
    // InternalAdeptness.g:528:1: entryRuleHighTime : ruleHighTime EOF ;
    public final void entryRuleHighTime() throws RecognitionException {
        try {
            // InternalAdeptness.g:529:1: ( ruleHighTime EOF )
            // InternalAdeptness.g:530:1: ruleHighTime EOF
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
    // InternalAdeptness.g:537:1: ruleHighTime : ( ( rule__HighTime__Group__0 ) ) ;
    public final void ruleHighTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:541:2: ( ( ( rule__HighTime__Group__0 ) ) )
            // InternalAdeptness.g:542:2: ( ( rule__HighTime__Group__0 ) )
            {
            // InternalAdeptness.g:542:2: ( ( rule__HighTime__Group__0 ) )
            // InternalAdeptness.g:543:3: ( rule__HighTime__Group__0 )
            {
             before(grammarAccess.getHighTimeAccess().getGroup()); 
            // InternalAdeptness.g:544:3: ( rule__HighTime__Group__0 )
            // InternalAdeptness.g:544:4: rule__HighTime__Group__0
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
    // InternalAdeptness.g:553:1: entryRuleHighPeak : ruleHighPeak EOF ;
    public final void entryRuleHighPeak() throws RecognitionException {
        try {
            // InternalAdeptness.g:554:1: ( ruleHighPeak EOF )
            // InternalAdeptness.g:555:1: ruleHighPeak EOF
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
    // InternalAdeptness.g:562:1: ruleHighPeak : ( ( rule__HighPeak__Group__0 ) ) ;
    public final void ruleHighPeak() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:566:2: ( ( ( rule__HighPeak__Group__0 ) ) )
            // InternalAdeptness.g:567:2: ( ( rule__HighPeak__Group__0 ) )
            {
            // InternalAdeptness.g:567:2: ( ( rule__HighPeak__Group__0 ) )
            // InternalAdeptness.g:568:3: ( rule__HighPeak__Group__0 )
            {
             before(grammarAccess.getHighPeakAccess().getGroup()); 
            // InternalAdeptness.g:569:3: ( rule__HighPeak__Group__0 )
            // InternalAdeptness.g:569:4: rule__HighPeak__Group__0
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
    // InternalAdeptness.g:578:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalAdeptness.g:579:1: ( ruleReference EOF )
            // InternalAdeptness.g:580:1: ruleReference EOF
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
    // InternalAdeptness.g:587:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:591:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalAdeptness.g:592:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalAdeptness.g:592:2: ( ( rule__Reference__Group__0 ) )
            // InternalAdeptness.g:593:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalAdeptness.g:594:3: ( rule__Reference__Group__0 )
            // InternalAdeptness.g:594:4: rule__Reference__Group__0
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
    // InternalAdeptness.g:603:1: entryRuleUpper : ruleUpper EOF ;
    public final void entryRuleUpper() throws RecognitionException {
        try {
            // InternalAdeptness.g:604:1: ( ruleUpper EOF )
            // InternalAdeptness.g:605:1: ruleUpper EOF
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
    // InternalAdeptness.g:612:1: ruleUpper : ( ( rule__Upper__Group__0 ) ) ;
    public final void ruleUpper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:616:2: ( ( ( rule__Upper__Group__0 ) ) )
            // InternalAdeptness.g:617:2: ( ( rule__Upper__Group__0 ) )
            {
            // InternalAdeptness.g:617:2: ( ( rule__Upper__Group__0 ) )
            // InternalAdeptness.g:618:3: ( rule__Upper__Group__0 )
            {
             before(grammarAccess.getUpperAccess().getGroup()); 
            // InternalAdeptness.g:619:3: ( rule__Upper__Group__0 )
            // InternalAdeptness.g:619:4: rule__Upper__Group__0
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
    // InternalAdeptness.g:628:1: entryRuleLower : ruleLower EOF ;
    public final void entryRuleLower() throws RecognitionException {
        try {
            // InternalAdeptness.g:629:1: ( ruleLower EOF )
            // InternalAdeptness.g:630:1: ruleLower EOF
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
    // InternalAdeptness.g:637:1: ruleLower : ( ( rule__Lower__Group__0 ) ) ;
    public final void ruleLower() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:641:2: ( ( ( rule__Lower__Group__0 ) ) )
            // InternalAdeptness.g:642:2: ( ( rule__Lower__Group__0 ) )
            {
            // InternalAdeptness.g:642:2: ( ( rule__Lower__Group__0 ) )
            // InternalAdeptness.g:643:3: ( rule__Lower__Group__0 )
            {
             before(grammarAccess.getLowerAccess().getGroup()); 
            // InternalAdeptness.g:644:3: ( rule__Lower__Group__0 )
            // InternalAdeptness.g:644:4: rule__Lower__Group__0
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
    // InternalAdeptness.g:653:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // InternalAdeptness.g:654:1: ( ruleRange EOF )
            // InternalAdeptness.g:655:1: ruleRange EOF
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
    // InternalAdeptness.g:662:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:666:2: ( ( ( rule__Range__Group__0 ) ) )
            // InternalAdeptness.g:667:2: ( ( rule__Range__Group__0 ) )
            {
            // InternalAdeptness.g:667:2: ( ( rule__Range__Group__0 ) )
            // InternalAdeptness.g:668:3: ( rule__Range__Group__0 )
            {
             before(grammarAccess.getRangeAccess().getGroup()); 
            // InternalAdeptness.g:669:3: ( rule__Range__Group__0 )
            // InternalAdeptness.g:669:4: rule__Range__Group__0
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
    // InternalAdeptness.g:678:1: entryRuleGap : ruleGap EOF ;
    public final void entryRuleGap() throws RecognitionException {
        try {
            // InternalAdeptness.g:679:1: ( ruleGap EOF )
            // InternalAdeptness.g:680:1: ruleGap EOF
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
    // InternalAdeptness.g:687:1: ruleGap : ( ( rule__Gap__Group__0 ) ) ;
    public final void ruleGap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:691:2: ( ( ( rule__Gap__Group__0 ) ) )
            // InternalAdeptness.g:692:2: ( ( rule__Gap__Group__0 ) )
            {
            // InternalAdeptness.g:692:2: ( ( rule__Gap__Group__0 ) )
            // InternalAdeptness.g:693:3: ( rule__Gap__Group__0 )
            {
             before(grammarAccess.getGapAccess().getGroup()); 
            // InternalAdeptness.g:694:3: ( rule__Gap__Group__0 )
            // InternalAdeptness.g:694:4: rule__Gap__Group__0
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
    // InternalAdeptness.g:703:1: entryRuleBound_up : ruleBound_up EOF ;
    public final void entryRuleBound_up() throws RecognitionException {
        try {
            // InternalAdeptness.g:704:1: ( ruleBound_up EOF )
            // InternalAdeptness.g:705:1: ruleBound_up EOF
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
    // InternalAdeptness.g:712:1: ruleBound_up : ( ( rule__Bound_up__Alternatives ) ) ;
    public final void ruleBound_up() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:716:2: ( ( ( rule__Bound_up__Alternatives ) ) )
            // InternalAdeptness.g:717:2: ( ( rule__Bound_up__Alternatives ) )
            {
            // InternalAdeptness.g:717:2: ( ( rule__Bound_up__Alternatives ) )
            // InternalAdeptness.g:718:3: ( rule__Bound_up__Alternatives )
            {
             before(grammarAccess.getBound_upAccess().getAlternatives()); 
            // InternalAdeptness.g:719:3: ( rule__Bound_up__Alternatives )
            // InternalAdeptness.g:719:4: rule__Bound_up__Alternatives
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
    // InternalAdeptness.g:728:1: entryRuleBound_Down : ruleBound_Down EOF ;
    public final void entryRuleBound_Down() throws RecognitionException {
        try {
            // InternalAdeptness.g:729:1: ( ruleBound_Down EOF )
            // InternalAdeptness.g:730:1: ruleBound_Down EOF
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
    // InternalAdeptness.g:737:1: ruleBound_Down : ( ( rule__Bound_Down__Alternatives ) ) ;
    public final void ruleBound_Down() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:741:2: ( ( ( rule__Bound_Down__Alternatives ) ) )
            // InternalAdeptness.g:742:2: ( ( rule__Bound_Down__Alternatives ) )
            {
            // InternalAdeptness.g:742:2: ( ( rule__Bound_Down__Alternatives ) )
            // InternalAdeptness.g:743:3: ( rule__Bound_Down__Alternatives )
            {
             before(grammarAccess.getBound_DownAccess().getAlternatives()); 
            // InternalAdeptness.g:744:3: ( rule__Bound_Down__Alternatives )
            // InternalAdeptness.g:744:4: rule__Bound_Down__Alternatives
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
    // InternalAdeptness.g:753:1: entryRuleBOOLEAN : ruleBOOLEAN EOF ;
    public final void entryRuleBOOLEAN() throws RecognitionException {
        try {
            // InternalAdeptness.g:754:1: ( ruleBOOLEAN EOF )
            // InternalAdeptness.g:755:1: ruleBOOLEAN EOF
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
    // InternalAdeptness.g:762:1: ruleBOOLEAN : ( ( rule__BOOLEAN__BoolAssignment ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:766:2: ( ( ( rule__BOOLEAN__BoolAssignment ) ) )
            // InternalAdeptness.g:767:2: ( ( rule__BOOLEAN__BoolAssignment ) )
            {
            // InternalAdeptness.g:767:2: ( ( rule__BOOLEAN__BoolAssignment ) )
            // InternalAdeptness.g:768:3: ( rule__BOOLEAN__BoolAssignment )
            {
             before(grammarAccess.getBOOLEANAccess().getBoolAssignment()); 
            // InternalAdeptness.g:769:3: ( rule__BOOLEAN__BoolAssignment )
            // InternalAdeptness.g:769:4: rule__BOOLEAN__BoolAssignment
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
    // InternalAdeptness.g:778:1: entryRuleb : ruleb EOF ;
    public final void entryRuleb() throws RecognitionException {
        try {
            // InternalAdeptness.g:779:1: ( ruleb EOF )
            // InternalAdeptness.g:780:1: ruleb EOF
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
    // InternalAdeptness.g:787:1: ruleb : ( ( rule__B__Alternatives ) ) ;
    public final void ruleb() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:791:2: ( ( ( rule__B__Alternatives ) ) )
            // InternalAdeptness.g:792:2: ( ( rule__B__Alternatives ) )
            {
            // InternalAdeptness.g:792:2: ( ( rule__B__Alternatives ) )
            // InternalAdeptness.g:793:3: ( rule__B__Alternatives )
            {
             before(grammarAccess.getBAccess().getAlternatives()); 
            // InternalAdeptness.g:794:3: ( rule__B__Alternatives )
            // InternalAdeptness.g:794:4: rule__B__Alternatives
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
    // InternalAdeptness.g:803:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalAdeptness.g:804:1: ( ruleDOUBLE EOF )
            // InternalAdeptness.g:805:1: ruleDOUBLE EOF
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
    // InternalAdeptness.g:812:1: ruleDOUBLE : ( ( rule__DOUBLE__DValAssignment ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:816:2: ( ( ( rule__DOUBLE__DValAssignment ) ) )
            // InternalAdeptness.g:817:2: ( ( rule__DOUBLE__DValAssignment ) )
            {
            // InternalAdeptness.g:817:2: ( ( rule__DOUBLE__DValAssignment ) )
            // InternalAdeptness.g:818:3: ( rule__DOUBLE__DValAssignment )
            {
             before(grammarAccess.getDOUBLEAccess().getDValAssignment()); 
            // InternalAdeptness.g:819:3: ( rule__DOUBLE__DValAssignment )
            // InternalAdeptness.g:819:4: rule__DOUBLE__DValAssignment
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
    // InternalAdeptness.g:828:1: entryRuled : ruled EOF ;
    public final void entryRuled() throws RecognitionException {
        try {
            // InternalAdeptness.g:829:1: ( ruled EOF )
            // InternalAdeptness.g:830:1: ruled EOF
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
    // InternalAdeptness.g:837:1: ruled : ( ( rule__D__Group__0 ) ) ;
    public final void ruled() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:841:2: ( ( ( rule__D__Group__0 ) ) )
            // InternalAdeptness.g:842:2: ( ( rule__D__Group__0 ) )
            {
            // InternalAdeptness.g:842:2: ( ( rule__D__Group__0 ) )
            // InternalAdeptness.g:843:3: ( rule__D__Group__0 )
            {
             before(grammarAccess.getDAccess().getGroup()); 
            // InternalAdeptness.g:844:3: ( rule__D__Group__0 )
            // InternalAdeptness.g:844:4: rule__D__Group__0
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
    // InternalAdeptness.g:853:1: entryRuleTimeType : ruleTimeType EOF ;
    public final void entryRuleTimeType() throws RecognitionException {
        try {
            // InternalAdeptness.g:854:1: ( ruleTimeType EOF )
            // InternalAdeptness.g:855:1: ruleTimeType EOF
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
    // InternalAdeptness.g:862:1: ruleTimeType : ( ( rule__TimeType__Alternatives ) ) ;
    public final void ruleTimeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:866:2: ( ( ( rule__TimeType__Alternatives ) ) )
            // InternalAdeptness.g:867:2: ( ( rule__TimeType__Alternatives ) )
            {
            // InternalAdeptness.g:867:2: ( ( rule__TimeType__Alternatives ) )
            // InternalAdeptness.g:868:3: ( rule__TimeType__Alternatives )
            {
             before(grammarAccess.getTimeTypeAccess().getAlternatives()); 
            // InternalAdeptness.g:869:3: ( rule__TimeType__Alternatives )
            // InternalAdeptness.g:869:4: rule__TimeType__Alternatives
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
    // InternalAdeptness.g:878:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalAdeptness.g:879:1: ( ruleDataType EOF )
            // InternalAdeptness.g:880:1: ruleDataType EOF
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
    // InternalAdeptness.g:887:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:891:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalAdeptness.g:892:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalAdeptness.g:892:2: ( ( rule__DataType__Group__0 ) )
            // InternalAdeptness.g:893:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalAdeptness.g:894:3: ( rule__DataType__Group__0 )
            // InternalAdeptness.g:894:4: rule__DataType__Group__0
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
    // InternalAdeptness.g:903:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // InternalAdeptness.g:904:1: ( rulePackageDeclaration EOF )
            // InternalAdeptness.g:905:1: rulePackageDeclaration EOF
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
    // InternalAdeptness.g:912:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:916:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // InternalAdeptness.g:917:2: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // InternalAdeptness.g:917:2: ( ( rule__PackageDeclaration__Group__0 ) )
            // InternalAdeptness.g:918:3: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // InternalAdeptness.g:919:3: ( rule__PackageDeclaration__Group__0 )
            // InternalAdeptness.g:919:4: rule__PackageDeclaration__Group__0
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
    // InternalAdeptness.g:928:1: entryRuleExpressionsModel : ruleExpressionsModel EOF ;
    public final void entryRuleExpressionsModel() throws RecognitionException {
        try {
            // InternalAdeptness.g:929:1: ( ruleExpressionsModel EOF )
            // InternalAdeptness.g:930:1: ruleExpressionsModel EOF
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
    // InternalAdeptness.g:937:1: ruleExpressionsModel : ( ( rule__ExpressionsModel__ElementsAssignment )* ) ;
    public final void ruleExpressionsModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:941:2: ( ( ( rule__ExpressionsModel__ElementsAssignment )* ) )
            // InternalAdeptness.g:942:2: ( ( rule__ExpressionsModel__ElementsAssignment )* )
            {
            // InternalAdeptness.g:942:2: ( ( rule__ExpressionsModel__ElementsAssignment )* )
            // InternalAdeptness.g:943:3: ( rule__ExpressionsModel__ElementsAssignment )*
            {
             before(grammarAccess.getExpressionsModelAccess().getElementsAssignment()); 
            // InternalAdeptness.g:944:3: ( rule__ExpressionsModel__ElementsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)||(LA2_0>=11 && LA2_0<=12)||LA2_0==63||LA2_0==65) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAdeptness.g:944:4: rule__ExpressionsModel__ElementsAssignment
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
    // InternalAdeptness.g:953:1: entryRuleAbstractElement2 : ruleAbstractElement2 EOF ;
    public final void entryRuleAbstractElement2() throws RecognitionException {
        try {
            // InternalAdeptness.g:954:1: ( ruleAbstractElement2 EOF )
            // InternalAdeptness.g:955:1: ruleAbstractElement2 EOF
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
    // InternalAdeptness.g:962:1: ruleAbstractElement2 : ( ( rule__AbstractElement2__Alternatives ) ) ;
    public final void ruleAbstractElement2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:966:2: ( ( ( rule__AbstractElement2__Alternatives ) ) )
            // InternalAdeptness.g:967:2: ( ( rule__AbstractElement2__Alternatives ) )
            {
            // InternalAdeptness.g:967:2: ( ( rule__AbstractElement2__Alternatives ) )
            // InternalAdeptness.g:968:3: ( rule__AbstractElement2__Alternatives )
            {
             before(grammarAccess.getAbstractElement2Access().getAlternatives()); 
            // InternalAdeptness.g:969:3: ( rule__AbstractElement2__Alternatives )
            // InternalAdeptness.g:969:4: rule__AbstractElement2__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement2__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElement2Access().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleVariable"
    // InternalAdeptness.g:978:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalAdeptness.g:979:1: ( ruleVariable EOF )
            // InternalAdeptness.g:980:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalAdeptness.g:987:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:991:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalAdeptness.g:992:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalAdeptness.g:992:2: ( ( rule__Variable__Group__0 ) )
            // InternalAdeptness.g:993:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalAdeptness.g:994:3: ( rule__Variable__Group__0 )
            // InternalAdeptness.g:994:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleEvalExpression"
    // InternalAdeptness.g:1003:1: entryRuleEvalExpression : ruleEvalExpression EOF ;
    public final void entryRuleEvalExpression() throws RecognitionException {
        try {
            // InternalAdeptness.g:1004:1: ( ruleEvalExpression EOF )
            // InternalAdeptness.g:1005:1: ruleEvalExpression EOF
            {
             before(grammarAccess.getEvalExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEvalExpression();

            state._fsp--;

             after(grammarAccess.getEvalExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvalExpression"


    // $ANTLR start "ruleEvalExpression"
    // InternalAdeptness.g:1012:1: ruleEvalExpression : ( ( rule__EvalExpression__ExpressionAssignment ) ) ;
    public final void ruleEvalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1016:2: ( ( ( rule__EvalExpression__ExpressionAssignment ) ) )
            // InternalAdeptness.g:1017:2: ( ( rule__EvalExpression__ExpressionAssignment ) )
            {
            // InternalAdeptness.g:1017:2: ( ( rule__EvalExpression__ExpressionAssignment ) )
            // InternalAdeptness.g:1018:3: ( rule__EvalExpression__ExpressionAssignment )
            {
             before(grammarAccess.getEvalExpressionAccess().getExpressionAssignment()); 
            // InternalAdeptness.g:1019:3: ( rule__EvalExpression__ExpressionAssignment )
            // InternalAdeptness.g:1019:4: rule__EvalExpression__ExpressionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EvalExpression__ExpressionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEvalExpressionAccess().getExpressionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvalExpression"


    // $ANTLR start "entryRuleExpression"
    // InternalAdeptness.g:1028:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalAdeptness.g:1029:1: ( ruleExpression EOF )
            // InternalAdeptness.g:1030:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalAdeptness.g:1037:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1041:2: ( ( ruleOr ) )
            // InternalAdeptness.g:1042:2: ( ruleOr )
            {
            // InternalAdeptness.g:1042:2: ( ruleOr )
            // InternalAdeptness.g:1043:3: ruleOr
            {
             before(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalAdeptness.g:1053:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalAdeptness.g:1054:1: ( ruleOr EOF )
            // InternalAdeptness.g:1055:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalAdeptness.g:1062:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1066:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalAdeptness.g:1067:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalAdeptness.g:1067:2: ( ( rule__Or__Group__0 ) )
            // InternalAdeptness.g:1068:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalAdeptness.g:1069:3: ( rule__Or__Group__0 )
            // InternalAdeptness.g:1069:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalAdeptness.g:1078:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalAdeptness.g:1079:1: ( ruleAnd EOF )
            // InternalAdeptness.g:1080:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalAdeptness.g:1087:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1091:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalAdeptness.g:1092:2: ( ( rule__And__Group__0 ) )
            {
            // InternalAdeptness.g:1092:2: ( ( rule__And__Group__0 ) )
            // InternalAdeptness.g:1093:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalAdeptness.g:1094:3: ( rule__And__Group__0 )
            // InternalAdeptness.g:1094:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalAdeptness.g:1103:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalAdeptness.g:1104:1: ( ruleEquality EOF )
            // InternalAdeptness.g:1105:1: ruleEquality EOF
            {
             before(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getEqualityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalAdeptness.g:1112:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1116:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalAdeptness.g:1117:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalAdeptness.g:1117:2: ( ( rule__Equality__Group__0 ) )
            // InternalAdeptness.g:1118:3: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // InternalAdeptness.g:1119:3: ( rule__Equality__Group__0 )
            // InternalAdeptness.g:1119:4: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalAdeptness.g:1128:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalAdeptness.g:1129:1: ( ruleComparison EOF )
            // InternalAdeptness.g:1130:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalAdeptness.g:1137:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1141:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalAdeptness.g:1142:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalAdeptness.g:1142:2: ( ( rule__Comparison__Group__0 ) )
            // InternalAdeptness.g:1143:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalAdeptness.g:1144:3: ( rule__Comparison__Group__0 )
            // InternalAdeptness.g:1144:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalAdeptness.g:1153:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalAdeptness.g:1154:1: ( rulePlusOrMinus EOF )
            // InternalAdeptness.g:1155:1: rulePlusOrMinus EOF
            {
             before(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalAdeptness.g:1162:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1166:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalAdeptness.g:1167:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalAdeptness.g:1167:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalAdeptness.g:1168:3: ( rule__PlusOrMinus__Group__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            // InternalAdeptness.g:1169:3: ( rule__PlusOrMinus__Group__0 )
            // InternalAdeptness.g:1169:4: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalAdeptness.g:1178:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // InternalAdeptness.g:1179:1: ( ruleMulOrDiv EOF )
            // InternalAdeptness.g:1180:1: ruleMulOrDiv EOF
            {
             before(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_1);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getMulOrDivRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalAdeptness.g:1187:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1191:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // InternalAdeptness.g:1192:2: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // InternalAdeptness.g:1192:2: ( ( rule__MulOrDiv__Group__0 ) )
            // InternalAdeptness.g:1193:3: ( rule__MulOrDiv__Group__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup()); 
            // InternalAdeptness.g:1194:3: ( rule__MulOrDiv__Group__0 )
            // InternalAdeptness.g:1194:4: rule__MulOrDiv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalAdeptness.g:1203:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalAdeptness.g:1204:1: ( rulePrimary EOF )
            // InternalAdeptness.g:1205:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalAdeptness.g:1212:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1216:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalAdeptness.g:1217:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalAdeptness.g:1217:2: ( ( rule__Primary__Alternatives ) )
            // InternalAdeptness.g:1218:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalAdeptness.g:1219:3: ( rule__Primary__Alternatives )
            // InternalAdeptness.g:1219:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalAdeptness.g:1228:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalAdeptness.g:1229:1: ( ruleAtomic EOF )
            // InternalAdeptness.g:1230:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalAdeptness.g:1237:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1241:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalAdeptness.g:1242:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalAdeptness.g:1242:2: ( ( rule__Atomic__Alternatives ) )
            // InternalAdeptness.g:1243:3: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // InternalAdeptness.g:1244:3: ( rule__Atomic__Alternatives )
            // InternalAdeptness.g:1244:4: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalAdeptness.g:1252:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImports ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1256:1: ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImports ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt3=1;
                }
                break;
            case 24:
            case 32:
            case 55:
                {
                alt3=2;
                }
                break;
            case 21:
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
                    // InternalAdeptness.g:1257:2: ( rulePackageDeclaration )
                    {
                    // InternalAdeptness.g:1257:2: ( rulePackageDeclaration )
                    // InternalAdeptness.g:1258:3: rulePackageDeclaration
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
                    // InternalAdeptness.g:1263:2: ( ruleType )
                    {
                    // InternalAdeptness.g:1263:2: ( ruleType )
                    // InternalAdeptness.g:1264:3: ruleType
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
                    // InternalAdeptness.g:1269:2: ( ruleImports )
                    {
                    // InternalAdeptness.g:1269:2: ( ruleImports )
                    // InternalAdeptness.g:1270:3: ruleImports
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
    // InternalAdeptness.g:1279:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleSignal ) | ( ruleMonitoringFile ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1283:1: ( ( ruleDataType ) | ( ruleSignal ) | ( ruleMonitoringFile ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 24:
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
                    // InternalAdeptness.g:1284:2: ( ruleDataType )
                    {
                    // InternalAdeptness.g:1284:2: ( ruleDataType )
                    // InternalAdeptness.g:1285:3: ruleDataType
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
                    // InternalAdeptness.g:1290:2: ( ruleSignal )
                    {
                    // InternalAdeptness.g:1290:2: ( ruleSignal )
                    // InternalAdeptness.g:1291:3: ruleSignal
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
                    // InternalAdeptness.g:1296:2: ( ruleMonitoringFile )
                    {
                    // InternalAdeptness.g:1296:2: ( ruleMonitoringFile )
                    // InternalAdeptness.g:1297:3: ruleMonitoringFile
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
    // InternalAdeptness.g:1306:1: rule__Sig_type__Alternatives : ( ( ( rule__Sig_type__Sig_typeAssignment_0 ) ) | ( ( rule__Sig_type__Sig_typeAssignment_1 ) ) | ( ( rule__Sig_type__Sig_typeAssignment_2 ) ) );
    public final void rule__Sig_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1310:1: ( ( ( rule__Sig_type__Sig_typeAssignment_0 ) ) | ( ( rule__Sig_type__Sig_typeAssignment_1 ) ) | ( ( rule__Sig_type__Sig_typeAssignment_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt5=1;
                }
                break;
            case 67:
                {
                alt5=2;
                }
                break;
            case 68:
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
                    // InternalAdeptness.g:1311:2: ( ( rule__Sig_type__Sig_typeAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1311:2: ( ( rule__Sig_type__Sig_typeAssignment_0 ) )
                    // InternalAdeptness.g:1312:3: ( rule__Sig_type__Sig_typeAssignment_0 )
                    {
                     before(grammarAccess.getSig_typeAccess().getSig_typeAssignment_0()); 
                    // InternalAdeptness.g:1313:3: ( rule__Sig_type__Sig_typeAssignment_0 )
                    // InternalAdeptness.g:1313:4: rule__Sig_type__Sig_typeAssignment_0
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
                    // InternalAdeptness.g:1317:2: ( ( rule__Sig_type__Sig_typeAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1317:2: ( ( rule__Sig_type__Sig_typeAssignment_1 ) )
                    // InternalAdeptness.g:1318:3: ( rule__Sig_type__Sig_typeAssignment_1 )
                    {
                     before(grammarAccess.getSig_typeAccess().getSig_typeAssignment_1()); 
                    // InternalAdeptness.g:1319:3: ( rule__Sig_type__Sig_typeAssignment_1 )
                    // InternalAdeptness.g:1319:4: rule__Sig_type__Sig_typeAssignment_1
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
                    // InternalAdeptness.g:1323:2: ( ( rule__Sig_type__Sig_typeAssignment_2 ) )
                    {
                    // InternalAdeptness.g:1323:2: ( ( rule__Sig_type__Sig_typeAssignment_2 ) )
                    // InternalAdeptness.g:1324:3: ( rule__Sig_type__Sig_typeAssignment_2 )
                    {
                     before(grammarAccess.getSig_typeAccess().getSig_typeAssignment_2()); 
                    // InternalAdeptness.g:1325:3: ( rule__Sig_type__Sig_typeAssignment_2 )
                    // InternalAdeptness.g:1325:4: rule__Sig_type__Sig_typeAssignment_2
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


    // $ANTLR start "rule__Checks__Alternatives_1"
    // InternalAdeptness.g:1333:1: rule__Checks__Alternatives_1 : ( ( ( rule__Checks__NameAssignment_1_0 ) ) | ( ( rule__Checks__EmAssignment_1_1 ) ) );
    public final void rule__Checks__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1337:1: ( ( ( rule__Checks__NameAssignment_1_0 ) ) | ( ( rule__Checks__EmAssignment_1_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_STRING)||(LA6_0>=11 && LA6_0<=12)||(LA6_0>=49 && LA6_0<=51)||LA6_0==53||LA6_0==63||LA6_0==65) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAdeptness.g:1338:2: ( ( rule__Checks__NameAssignment_1_0 ) )
                    {
                    // InternalAdeptness.g:1338:2: ( ( rule__Checks__NameAssignment_1_0 ) )
                    // InternalAdeptness.g:1339:3: ( rule__Checks__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getChecksAccess().getNameAssignment_1_0()); 
                    // InternalAdeptness.g:1340:3: ( rule__Checks__NameAssignment_1_0 )
                    // InternalAdeptness.g:1340:4: rule__Checks__NameAssignment_1_0
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
                    // InternalAdeptness.g:1344:2: ( ( rule__Checks__EmAssignment_1_1 ) )
                    {
                    // InternalAdeptness.g:1344:2: ( ( rule__Checks__EmAssignment_1_1 ) )
                    // InternalAdeptness.g:1345:3: ( rule__Checks__EmAssignment_1_1 )
                    {
                     before(grammarAccess.getChecksAccess().getEmAssignment_1_1()); 
                    // InternalAdeptness.g:1346:3: ( rule__Checks__EmAssignment_1_1 )
                    // InternalAdeptness.g:1346:4: rule__Checks__EmAssignment_1_1
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
    // InternalAdeptness.g:1354:1: rule__Reason__Alternatives_0 : ( ( ( rule__Reason__HighPeakAssignment_0_0 ) ) | ( ( rule__Reason__HighTimeAssignment_0_1 ) ) | ( ( rule__Reason__ConstDegAssignment_0_2 ) ) | ( ( rule__Reason__XPeaksAssignment_0_3 ) ) );
    public final void rule__Reason__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1358:1: ( ( ( rule__Reason__HighPeakAssignment_0_0 ) ) | ( ( rule__Reason__HighTimeAssignment_0_1 ) ) | ( ( rule__Reason__ConstDegAssignment_0_2 ) ) | ( ( rule__Reason__XPeaksAssignment_0_3 ) ) )
            int alt7=4;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalAdeptness.g:1359:2: ( ( rule__Reason__HighPeakAssignment_0_0 ) )
                    {
                    // InternalAdeptness.g:1359:2: ( ( rule__Reason__HighPeakAssignment_0_0 ) )
                    // InternalAdeptness.g:1360:3: ( rule__Reason__HighPeakAssignment_0_0 )
                    {
                     before(grammarAccess.getReasonAccess().getHighPeakAssignment_0_0()); 
                    // InternalAdeptness.g:1361:3: ( rule__Reason__HighPeakAssignment_0_0 )
                    // InternalAdeptness.g:1361:4: rule__Reason__HighPeakAssignment_0_0
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
                    // InternalAdeptness.g:1365:2: ( ( rule__Reason__HighTimeAssignment_0_1 ) )
                    {
                    // InternalAdeptness.g:1365:2: ( ( rule__Reason__HighTimeAssignment_0_1 ) )
                    // InternalAdeptness.g:1366:3: ( rule__Reason__HighTimeAssignment_0_1 )
                    {
                     before(grammarAccess.getReasonAccess().getHighTimeAssignment_0_1()); 
                    // InternalAdeptness.g:1367:3: ( rule__Reason__HighTimeAssignment_0_1 )
                    // InternalAdeptness.g:1367:4: rule__Reason__HighTimeAssignment_0_1
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
                    // InternalAdeptness.g:1371:2: ( ( rule__Reason__ConstDegAssignment_0_2 ) )
                    {
                    // InternalAdeptness.g:1371:2: ( ( rule__Reason__ConstDegAssignment_0_2 ) )
                    // InternalAdeptness.g:1372:3: ( rule__Reason__ConstDegAssignment_0_2 )
                    {
                     before(grammarAccess.getReasonAccess().getConstDegAssignment_0_2()); 
                    // InternalAdeptness.g:1373:3: ( rule__Reason__ConstDegAssignment_0_2 )
                    // InternalAdeptness.g:1373:4: rule__Reason__ConstDegAssignment_0_2
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
                    // InternalAdeptness.g:1377:2: ( ( rule__Reason__XPeaksAssignment_0_3 ) )
                    {
                    // InternalAdeptness.g:1377:2: ( ( rule__Reason__XPeaksAssignment_0_3 ) )
                    // InternalAdeptness.g:1378:3: ( rule__Reason__XPeaksAssignment_0_3 )
                    {
                     before(grammarAccess.getReasonAccess().getXPeaksAssignment_0_3()); 
                    // InternalAdeptness.g:1379:3: ( rule__Reason__XPeaksAssignment_0_3 )
                    // InternalAdeptness.g:1379:4: rule__Reason__XPeaksAssignment_0_3
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
    // InternalAdeptness.g:1387:1: rule__Reference__Alternatives_0 : ( ( ( rule__Reference__UpperAssignment_0_0 ) ) | ( ( rule__Reference__LowerAssignment_0_1 ) ) | ( ( rule__Reference__RangeAssignment_0_2 ) ) | ( ( rule__Reference__GapAssignment_0_3 ) ) );
    public final void rule__Reference__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1391:1: ( ( ( rule__Reference__UpperAssignment_0_0 ) ) | ( ( rule__Reference__LowerAssignment_0_1 ) ) | ( ( rule__Reference__RangeAssignment_0_2 ) ) | ( ( rule__Reference__GapAssignment_0_3 ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt8=1;
                }
                break;
            case 50:
                {
                alt8=2;
                }
                break;
            case 51:
                {
                alt8=3;
                }
                break;
            case 53:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalAdeptness.g:1392:2: ( ( rule__Reference__UpperAssignment_0_0 ) )
                    {
                    // InternalAdeptness.g:1392:2: ( ( rule__Reference__UpperAssignment_0_0 ) )
                    // InternalAdeptness.g:1393:3: ( rule__Reference__UpperAssignment_0_0 )
                    {
                     before(grammarAccess.getReferenceAccess().getUpperAssignment_0_0()); 
                    // InternalAdeptness.g:1394:3: ( rule__Reference__UpperAssignment_0_0 )
                    // InternalAdeptness.g:1394:4: rule__Reference__UpperAssignment_0_0
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
                    // InternalAdeptness.g:1398:2: ( ( rule__Reference__LowerAssignment_0_1 ) )
                    {
                    // InternalAdeptness.g:1398:2: ( ( rule__Reference__LowerAssignment_0_1 ) )
                    // InternalAdeptness.g:1399:3: ( rule__Reference__LowerAssignment_0_1 )
                    {
                     before(grammarAccess.getReferenceAccess().getLowerAssignment_0_1()); 
                    // InternalAdeptness.g:1400:3: ( rule__Reference__LowerAssignment_0_1 )
                    // InternalAdeptness.g:1400:4: rule__Reference__LowerAssignment_0_1
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
                    // InternalAdeptness.g:1404:2: ( ( rule__Reference__RangeAssignment_0_2 ) )
                    {
                    // InternalAdeptness.g:1404:2: ( ( rule__Reference__RangeAssignment_0_2 ) )
                    // InternalAdeptness.g:1405:3: ( rule__Reference__RangeAssignment_0_2 )
                    {
                     before(grammarAccess.getReferenceAccess().getRangeAssignment_0_2()); 
                    // InternalAdeptness.g:1406:3: ( rule__Reference__RangeAssignment_0_2 )
                    // InternalAdeptness.g:1406:4: rule__Reference__RangeAssignment_0_2
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
                    // InternalAdeptness.g:1410:2: ( ( rule__Reference__GapAssignment_0_3 ) )
                    {
                    // InternalAdeptness.g:1410:2: ( ( rule__Reference__GapAssignment_0_3 ) )
                    // InternalAdeptness.g:1411:3: ( rule__Reference__GapAssignment_0_3 )
                    {
                     before(grammarAccess.getReferenceAccess().getGapAssignment_0_3()); 
                    // InternalAdeptness.g:1412:3: ( rule__Reference__GapAssignment_0_3 )
                    // InternalAdeptness.g:1412:4: rule__Reference__GapAssignment_0_3
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


    // $ANTLR start "rule__Bound_up__Alternatives"
    // InternalAdeptness.g:1420:1: rule__Bound_up__Alternatives : ( ( ( rule__Bound_up__ValueAssignment_0 ) ) | ( ( rule__Bound_up__VariableAssignment_1 ) ) | ( ( rule__Bound_up__EmAssignment_2 ) ) );
    public final void rule__Bound_up__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1424:1: ( ( ( rule__Bound_up__ValueAssignment_0 ) ) | ( ( rule__Bound_up__VariableAssignment_1 ) ) | ( ( rule__Bound_up__EmAssignment_2 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt9=1;
                }
                break;
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
                {
                alt9=2;
                }
                break;
            case EOF:
            case RULE_STRING:
            case 11:
            case 12:
            case 43:
            case 63:
            case 65:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAdeptness.g:1425:2: ( ( rule__Bound_up__ValueAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1425:2: ( ( rule__Bound_up__ValueAssignment_0 ) )
                    // InternalAdeptness.g:1426:3: ( rule__Bound_up__ValueAssignment_0 )
                    {
                     before(grammarAccess.getBound_upAccess().getValueAssignment_0()); 
                    // InternalAdeptness.g:1427:3: ( rule__Bound_up__ValueAssignment_0 )
                    // InternalAdeptness.g:1427:4: rule__Bound_up__ValueAssignment_0
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
                    // InternalAdeptness.g:1431:2: ( ( rule__Bound_up__VariableAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1431:2: ( ( rule__Bound_up__VariableAssignment_1 ) )
                    // InternalAdeptness.g:1432:3: ( rule__Bound_up__VariableAssignment_1 )
                    {
                     before(grammarAccess.getBound_upAccess().getVariableAssignment_1()); 
                    // InternalAdeptness.g:1433:3: ( rule__Bound_up__VariableAssignment_1 )
                    // InternalAdeptness.g:1433:4: rule__Bound_up__VariableAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bound_up__VariableAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBound_upAccess().getVariableAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1437:2: ( ( rule__Bound_up__EmAssignment_2 ) )
                    {
                    // InternalAdeptness.g:1437:2: ( ( rule__Bound_up__EmAssignment_2 ) )
                    // InternalAdeptness.g:1438:3: ( rule__Bound_up__EmAssignment_2 )
                    {
                     before(grammarAccess.getBound_upAccess().getEmAssignment_2()); 
                    // InternalAdeptness.g:1439:3: ( rule__Bound_up__EmAssignment_2 )
                    // InternalAdeptness.g:1439:4: rule__Bound_up__EmAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bound_up__EmAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getBound_upAccess().getEmAssignment_2()); 

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
    // InternalAdeptness.g:1447:1: rule__Bound_Down__Alternatives : ( ( ( rule__Bound_Down__ValueAssignment_0 ) ) | ( ( rule__Bound_Down__VariableAssignment_1 ) ) | ( ( rule__Bound_Down__EmAssignment_2 ) ) );
    public final void rule__Bound_Down__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1451:1: ( ( ( rule__Bound_Down__ValueAssignment_0 ) ) | ( ( rule__Bound_Down__VariableAssignment_1 ) ) | ( ( rule__Bound_Down__EmAssignment_2 ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt10=1;
                }
                break;
            case RULE_INT:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                alt10=2;
                }
                break;
            case EOF:
            case RULE_STRING:
            case 11:
            case 12:
            case 43:
            case 52:
            case 63:
            case 65:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalAdeptness.g:1452:2: ( ( rule__Bound_Down__ValueAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1452:2: ( ( rule__Bound_Down__ValueAssignment_0 ) )
                    // InternalAdeptness.g:1453:3: ( rule__Bound_Down__ValueAssignment_0 )
                    {
                     before(grammarAccess.getBound_DownAccess().getValueAssignment_0()); 
                    // InternalAdeptness.g:1454:3: ( rule__Bound_Down__ValueAssignment_0 )
                    // InternalAdeptness.g:1454:4: rule__Bound_Down__ValueAssignment_0
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
                    // InternalAdeptness.g:1458:2: ( ( rule__Bound_Down__VariableAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1458:2: ( ( rule__Bound_Down__VariableAssignment_1 ) )
                    // InternalAdeptness.g:1459:3: ( rule__Bound_Down__VariableAssignment_1 )
                    {
                     before(grammarAccess.getBound_DownAccess().getVariableAssignment_1()); 
                    // InternalAdeptness.g:1460:3: ( rule__Bound_Down__VariableAssignment_1 )
                    // InternalAdeptness.g:1460:4: rule__Bound_Down__VariableAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bound_Down__VariableAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBound_DownAccess().getVariableAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1464:2: ( ( rule__Bound_Down__EmAssignment_2 ) )
                    {
                    // InternalAdeptness.g:1464:2: ( ( rule__Bound_Down__EmAssignment_2 ) )
                    // InternalAdeptness.g:1465:3: ( rule__Bound_Down__EmAssignment_2 )
                    {
                     before(grammarAccess.getBound_DownAccess().getEmAssignment_2()); 
                    // InternalAdeptness.g:1466:3: ( rule__Bound_Down__EmAssignment_2 )
                    // InternalAdeptness.g:1466:4: rule__Bound_Down__EmAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bound_Down__EmAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getBound_DownAccess().getEmAssignment_2()); 

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
    // InternalAdeptness.g:1474:1: rule__B__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__B__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1478:1: ( ( 'true' ) | ( 'false' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==11) ) {
                alt11=1;
            }
            else if ( (LA11_0==12) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAdeptness.g:1479:2: ( 'true' )
                    {
                    // InternalAdeptness.g:1479:2: ( 'true' )
                    // InternalAdeptness.g:1480:3: 'true'
                    {
                     before(grammarAccess.getBAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1485:2: ( 'false' )
                    {
                    // InternalAdeptness.g:1485:2: ( 'false' )
                    // InternalAdeptness.g:1486:3: 'false'
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
    // InternalAdeptness.g:1495:1: rule__TimeType__Alternatives : ( ( ( rule__TimeType__TimeAssignment_0 ) ) | ( ( rule__TimeType__TimeAssignment_1 ) ) | ( ( rule__TimeType__TimeAssignment_2 ) ) | ( ( rule__TimeType__TimeAssignment_3 ) ) );
    public final void rule__TimeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1499:1: ( ( ( rule__TimeType__TimeAssignment_0 ) ) | ( ( rule__TimeType__TimeAssignment_1 ) ) | ( ( rule__TimeType__TimeAssignment_2 ) ) | ( ( rule__TimeType__TimeAssignment_3 ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt12=1;
                }
                break;
            case 70:
                {
                alt12=2;
                }
                break;
            case 71:
                {
                alt12=3;
                }
                break;
            case 72:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalAdeptness.g:1500:2: ( ( rule__TimeType__TimeAssignment_0 ) )
                    {
                    // InternalAdeptness.g:1500:2: ( ( rule__TimeType__TimeAssignment_0 ) )
                    // InternalAdeptness.g:1501:3: ( rule__TimeType__TimeAssignment_0 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_0()); 
                    // InternalAdeptness.g:1502:3: ( rule__TimeType__TimeAssignment_0 )
                    // InternalAdeptness.g:1502:4: rule__TimeType__TimeAssignment_0
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
                    // InternalAdeptness.g:1506:2: ( ( rule__TimeType__TimeAssignment_1 ) )
                    {
                    // InternalAdeptness.g:1506:2: ( ( rule__TimeType__TimeAssignment_1 ) )
                    // InternalAdeptness.g:1507:3: ( rule__TimeType__TimeAssignment_1 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_1()); 
                    // InternalAdeptness.g:1508:3: ( rule__TimeType__TimeAssignment_1 )
                    // InternalAdeptness.g:1508:4: rule__TimeType__TimeAssignment_1
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
                    // InternalAdeptness.g:1512:2: ( ( rule__TimeType__TimeAssignment_2 ) )
                    {
                    // InternalAdeptness.g:1512:2: ( ( rule__TimeType__TimeAssignment_2 ) )
                    // InternalAdeptness.g:1513:3: ( rule__TimeType__TimeAssignment_2 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_2()); 
                    // InternalAdeptness.g:1514:3: ( rule__TimeType__TimeAssignment_2 )
                    // InternalAdeptness.g:1514:4: rule__TimeType__TimeAssignment_2
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
                    // InternalAdeptness.g:1518:2: ( ( rule__TimeType__TimeAssignment_3 ) )
                    {
                    // InternalAdeptness.g:1518:2: ( ( rule__TimeType__TimeAssignment_3 ) )
                    // InternalAdeptness.g:1519:3: ( rule__TimeType__TimeAssignment_3 )
                    {
                     before(grammarAccess.getTimeTypeAccess().getTimeAssignment_3()); 
                    // InternalAdeptness.g:1520:3: ( rule__TimeType__TimeAssignment_3 )
                    // InternalAdeptness.g:1520:4: rule__TimeType__TimeAssignment_3
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


    // $ANTLR start "rule__AbstractElement2__Alternatives"
    // InternalAdeptness.g:1528:1: rule__AbstractElement2__Alternatives : ( ( ruleVariable ) | ( ruleEvalExpression ) );
    public final void rule__AbstractElement2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1532:1: ( ( ruleVariable ) | ( ruleEvalExpression ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_INT && LA13_0<=RULE_STRING)||(LA13_0>=11 && LA13_0<=12)||LA13_0==63||LA13_0==65) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalAdeptness.g:1533:2: ( ruleVariable )
                    {
                    // InternalAdeptness.g:1533:2: ( ruleVariable )
                    // InternalAdeptness.g:1534:3: ruleVariable
                    {
                     before(grammarAccess.getAbstractElement2Access().getVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getAbstractElement2Access().getVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1539:2: ( ruleEvalExpression )
                    {
                    // InternalAdeptness.g:1539:2: ( ruleEvalExpression )
                    // InternalAdeptness.g:1540:3: ruleEvalExpression
                    {
                     before(grammarAccess.getAbstractElement2Access().getEvalExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEvalExpression();

                    state._fsp--;

                     after(grammarAccess.getAbstractElement2Access().getEvalExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractElement2__Alternatives"


    // $ANTLR start "rule__Equality__OpAlternatives_1_1_0"
    // InternalAdeptness.g:1549:1: rule__Equality__OpAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__Equality__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1553:1: ( ( '==' ) | ( '!=' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            else if ( (LA14_0==14) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAdeptness.g:1554:2: ( '==' )
                    {
                    // InternalAdeptness.g:1554:2: ( '==' )
                    // InternalAdeptness.g:1555:3: '=='
                    {
                     before(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1560:2: ( '!=' )
                    {
                    // InternalAdeptness.g:1560:2: ( '!=' )
                    // InternalAdeptness.g:1561:3: '!='
                    {
                     before(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Equality__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Comparison__OpAlternatives_1_1_0"
    // InternalAdeptness.g:1570:1: rule__Comparison__OpAlternatives_1_1_0 : ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public final void rule__Comparison__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1574:1: ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt15=1;
                }
                break;
            case 16:
                {
                alt15=2;
                }
                break;
            case 17:
                {
                alt15=3;
                }
                break;
            case 18:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalAdeptness.g:1575:2: ( '>=' )
                    {
                    // InternalAdeptness.g:1575:2: ( '>=' )
                    // InternalAdeptness.g:1576:3: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1581:2: ( '<=' )
                    {
                    // InternalAdeptness.g:1581:2: ( '<=' )
                    // InternalAdeptness.g:1582:3: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1587:2: ( '>' )
                    {
                    // InternalAdeptness.g:1587:2: ( '>' )
                    // InternalAdeptness.g:1588:3: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:1593:2: ( '<' )
                    {
                    // InternalAdeptness.g:1593:2: ( '<' )
                    // InternalAdeptness.g:1594:3: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 

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
    // $ANTLR end "rule__Comparison__OpAlternatives_1_1_0"


    // $ANTLR start "rule__PlusOrMinus__Alternatives_1_0"
    // InternalAdeptness.g:1603:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1607:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==62) ) {
                alt16=1;
            }
            else if ( (LA16_0==54) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalAdeptness.g:1608:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalAdeptness.g:1608:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalAdeptness.g:1609:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    // InternalAdeptness.g:1610:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalAdeptness.g:1610:4: rule__PlusOrMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1614:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalAdeptness.g:1614:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalAdeptness.g:1615:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    // InternalAdeptness.g:1616:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalAdeptness.g:1616:4: rule__PlusOrMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Alternatives_1_0"


    // $ANTLR start "rule__MulOrDiv__OpAlternatives_1_0_1_0"
    // InternalAdeptness.g:1624:1: rule__MulOrDiv__OpAlternatives_1_0_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MulOrDiv__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1628:1: ( ( '*' ) | ( '/' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            else if ( (LA17_0==20) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalAdeptness.g:1629:2: ( '*' )
                    {
                    // InternalAdeptness.g:1629:2: ( '*' )
                    // InternalAdeptness.g:1630:3: '*'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1635:2: ( '/' )
                    {
                    // InternalAdeptness.g:1635:2: ( '/' )
                    // InternalAdeptness.g:1636:3: '/'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_1_0_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_1_0_1()); 

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
    // $ANTLR end "rule__MulOrDiv__OpAlternatives_1_0_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalAdeptness.g:1645:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1649:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt18=1;
                }
                break;
            case 65:
                {
                alt18=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 11:
            case 12:
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
                    // InternalAdeptness.g:1650:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalAdeptness.g:1650:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalAdeptness.g:1651:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalAdeptness.g:1652:3: ( rule__Primary__Group_0__0 )
                    // InternalAdeptness.g:1652:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1656:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalAdeptness.g:1656:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalAdeptness.g:1657:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalAdeptness.g:1658:3: ( rule__Primary__Group_1__0 )
                    // InternalAdeptness.g:1658:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1662:2: ( ruleAtomic )
                    {
                    // InternalAdeptness.g:1662:2: ( ruleAtomic )
                    // InternalAdeptness.g:1663:3: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Atomic__Alternatives"
    // InternalAdeptness.g:1672:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__VariableAssignment_3 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1676:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__VariableAssignment_3 ) ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt19=1;
                }
                break;
            case RULE_STRING:
                {
                alt19=2;
                }
                break;
            case 11:
            case 12:
                {
                alt19=3;
                }
                break;
            case RULE_ID:
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
                    // InternalAdeptness.g:1677:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalAdeptness.g:1677:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalAdeptness.g:1678:3: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // InternalAdeptness.g:1679:3: ( rule__Atomic__Group_0__0 )
                    // InternalAdeptness.g:1679:4: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1683:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalAdeptness.g:1683:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalAdeptness.g:1684:3: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // InternalAdeptness.g:1685:3: ( rule__Atomic__Group_1__0 )
                    // InternalAdeptness.g:1685:4: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1689:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalAdeptness.g:1689:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalAdeptness.g:1690:3: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // InternalAdeptness.g:1691:3: ( rule__Atomic__Group_2__0 )
                    // InternalAdeptness.g:1691:4: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:1695:2: ( ( rule__Atomic__VariableAssignment_3 ) )
                    {
                    // InternalAdeptness.g:1695:2: ( ( rule__Atomic__VariableAssignment_3 ) )
                    // InternalAdeptness.g:1696:3: ( rule__Atomic__VariableAssignment_3 )
                    {
                     before(grammarAccess.getAtomicAccess().getVariableAssignment_3()); 
                    // InternalAdeptness.g:1697:3: ( rule__Atomic__VariableAssignment_3 )
                    // InternalAdeptness.g:1697:4: rule__Atomic__VariableAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__VariableAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getVariableAssignment_3()); 

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
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__Atomic__ValueAlternatives_2_1_0"
    // InternalAdeptness.g:1705:1: rule__Atomic__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1709:1: ( ( 'true' ) | ( 'false' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==11) ) {
                alt20=1;
            }
            else if ( (LA20_0==12) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalAdeptness.g:1710:2: ( 'true' )
                    {
                    // InternalAdeptness.g:1710:2: ( 'true' )
                    // InternalAdeptness.g:1711:3: 'true'
                    {
                     before(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1716:2: ( 'false' )
                    {
                    // InternalAdeptness.g:1716:2: ( 'false' )
                    // InternalAdeptness.g:1717:3: 'false'
                    {
                     before(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 

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
    // $ANTLR end "rule__Atomic__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__Imports__Group__0"
    // InternalAdeptness.g:1726:1: rule__Imports__Group__0 : rule__Imports__Group__0__Impl rule__Imports__Group__1 ;
    public final void rule__Imports__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1730:1: ( rule__Imports__Group__0__Impl rule__Imports__Group__1 )
            // InternalAdeptness.g:1731:2: rule__Imports__Group__0__Impl rule__Imports__Group__1
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
    // InternalAdeptness.g:1738:1: rule__Imports__Group__0__Impl : ( 'import' ) ;
    public final void rule__Imports__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1742:1: ( ( 'import' ) )
            // InternalAdeptness.g:1743:1: ( 'import' )
            {
            // InternalAdeptness.g:1743:1: ( 'import' )
            // InternalAdeptness.g:1744:2: 'import'
            {
             before(grammarAccess.getImportsAccess().getImportKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalAdeptness.g:1753:1: rule__Imports__Group__1 : rule__Imports__Group__1__Impl ;
    public final void rule__Imports__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1757:1: ( rule__Imports__Group__1__Impl )
            // InternalAdeptness.g:1758:2: rule__Imports__Group__1__Impl
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
    // InternalAdeptness.g:1764:1: rule__Imports__Group__1__Impl : ( ( rule__Imports__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Imports__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1768:1: ( ( ( rule__Imports__ImportedNamespaceAssignment_1 ) ) )
            // InternalAdeptness.g:1769:1: ( ( rule__Imports__ImportedNamespaceAssignment_1 ) )
            {
            // InternalAdeptness.g:1769:1: ( ( rule__Imports__ImportedNamespaceAssignment_1 ) )
            // InternalAdeptness.g:1770:2: ( rule__Imports__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportsAccess().getImportedNamespaceAssignment_1()); 
            // InternalAdeptness.g:1771:2: ( rule__Imports__ImportedNamespaceAssignment_1 )
            // InternalAdeptness.g:1771:3: rule__Imports__ImportedNamespaceAssignment_1
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
    // InternalAdeptness.g:1780:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1784:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalAdeptness.g:1785:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalAdeptness.g:1792:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1796:1: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:1797:1: ( ruleQualifiedName )
            {
            // InternalAdeptness.g:1797:1: ( ruleQualifiedName )
            // InternalAdeptness.g:1798:2: ruleQualifiedName
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
    // InternalAdeptness.g:1807:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1811:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalAdeptness.g:1812:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalAdeptness.g:1818:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1822:1: ( ( ( '.*' )? ) )
            // InternalAdeptness.g:1823:1: ( ( '.*' )? )
            {
            // InternalAdeptness.g:1823:1: ( ( '.*' )? )
            // InternalAdeptness.g:1824:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalAdeptness.g:1825:2: ( '.*' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAdeptness.g:1825:3: '.*'
                    {
                    match(input,22,FOLLOW_2); 

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
    // InternalAdeptness.g:1834:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1838:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAdeptness.g:1839:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalAdeptness.g:1846:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1850:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:1851:1: ( RULE_ID )
            {
            // InternalAdeptness.g:1851:1: ( RULE_ID )
            // InternalAdeptness.g:1852:2: RULE_ID
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
    // InternalAdeptness.g:1861:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1865:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAdeptness.g:1866:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAdeptness.g:1872:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1876:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAdeptness.g:1877:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAdeptness.g:1877:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAdeptness.g:1878:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAdeptness.g:1879:2: ( rule__QualifiedName__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==23) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAdeptness.g:1879:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalAdeptness.g:1888:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1892:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAdeptness.g:1893:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalAdeptness.g:1900:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1904:1: ( ( '.' ) )
            // InternalAdeptness.g:1905:1: ( '.' )
            {
            // InternalAdeptness.g:1905:1: ( '.' )
            // InternalAdeptness.g:1906:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdeptness.g:1915:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1919:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAdeptness.g:1920:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAdeptness.g:1926:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1930:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:1931:1: ( RULE_ID )
            {
            // InternalAdeptness.g:1931:1: ( RULE_ID )
            // InternalAdeptness.g:1932:2: RULE_ID
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
    // InternalAdeptness.g:1942:1: rule__MonitoringFile__Group__0 : rule__MonitoringFile__Group__0__Impl rule__MonitoringFile__Group__1 ;
    public final void rule__MonitoringFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1946:1: ( rule__MonitoringFile__Group__0__Impl rule__MonitoringFile__Group__1 )
            // InternalAdeptness.g:1947:2: rule__MonitoringFile__Group__0__Impl rule__MonitoringFile__Group__1
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
    // InternalAdeptness.g:1954:1: rule__MonitoringFile__Group__0__Impl : ( 'MONITORINGPLAN' ) ;
    public final void rule__MonitoringFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1958:1: ( ( 'MONITORINGPLAN' ) )
            // InternalAdeptness.g:1959:1: ( 'MONITORINGPLAN' )
            {
            // InternalAdeptness.g:1959:1: ( 'MONITORINGPLAN' )
            // InternalAdeptness.g:1960:2: 'MONITORINGPLAN'
            {
             before(grammarAccess.getMonitoringFileAccess().getMONITORINGPLANKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAdeptness.g:1969:1: rule__MonitoringFile__Group__1 : rule__MonitoringFile__Group__1__Impl rule__MonitoringFile__Group__2 ;
    public final void rule__MonitoringFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1973:1: ( rule__MonitoringFile__Group__1__Impl rule__MonitoringFile__Group__2 )
            // InternalAdeptness.g:1974:2: rule__MonitoringFile__Group__1__Impl rule__MonitoringFile__Group__2
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
    // InternalAdeptness.g:1981:1: rule__MonitoringFile__Group__1__Impl : ( ( rule__MonitoringFile__NameAssignment_1 ) ) ;
    public final void rule__MonitoringFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1985:1: ( ( ( rule__MonitoringFile__NameAssignment_1 ) ) )
            // InternalAdeptness.g:1986:1: ( ( rule__MonitoringFile__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:1986:1: ( ( rule__MonitoringFile__NameAssignment_1 ) )
            // InternalAdeptness.g:1987:2: ( rule__MonitoringFile__NameAssignment_1 )
            {
             before(grammarAccess.getMonitoringFileAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:1988:2: ( rule__MonitoringFile__NameAssignment_1 )
            // InternalAdeptness.g:1988:3: rule__MonitoringFile__NameAssignment_1
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
    // InternalAdeptness.g:1996:1: rule__MonitoringFile__Group__2 : rule__MonitoringFile__Group__2__Impl rule__MonitoringFile__Group__3 ;
    public final void rule__MonitoringFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2000:1: ( rule__MonitoringFile__Group__2__Impl rule__MonitoringFile__Group__3 )
            // InternalAdeptness.g:2001:2: rule__MonitoringFile__Group__2__Impl rule__MonitoringFile__Group__3
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
    // InternalAdeptness.g:2008:1: rule__MonitoringFile__Group__2__Impl : ( ':' ) ;
    public final void rule__MonitoringFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2012:1: ( ( ':' ) )
            // InternalAdeptness.g:2013:1: ( ':' )
            {
            // InternalAdeptness.g:2013:1: ( ':' )
            // InternalAdeptness.g:2014:2: ':'
            {
             before(grammarAccess.getMonitoringFileAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAdeptness.g:2023:1: rule__MonitoringFile__Group__3 : rule__MonitoringFile__Group__3__Impl rule__MonitoringFile__Group__4 ;
    public final void rule__MonitoringFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2027:1: ( rule__MonitoringFile__Group__3__Impl rule__MonitoringFile__Group__4 )
            // InternalAdeptness.g:2028:2: rule__MonitoringFile__Group__3__Impl rule__MonitoringFile__Group__4
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
    // InternalAdeptness.g:2035:1: rule__MonitoringFile__Group__3__Impl : ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) ) ;
    public final void rule__MonitoringFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2039:1: ( ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) ) )
            // InternalAdeptness.g:2040:1: ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) )
            {
            // InternalAdeptness.g:2040:1: ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) )
            // InternalAdeptness.g:2041:2: ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* )
            {
            // InternalAdeptness.g:2041:2: ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) )
            // InternalAdeptness.g:2042:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )
            {
             before(grammarAccess.getMonitoringFileAccess().getMonitoringPlanAssignment_3()); 
            // InternalAdeptness.g:2043:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )
            // InternalAdeptness.g:2043:4: rule__MonitoringFile__MonitoringPlanAssignment_3
            {
            pushFollow(FOLLOW_12);
            rule__MonitoringFile__MonitoringPlanAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMonitoringFileAccess().getMonitoringPlanAssignment_3()); 

            }

            // InternalAdeptness.g:2046:2: ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* )
            // InternalAdeptness.g:2047:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )*
            {
             before(grammarAccess.getMonitoringFileAccess().getMonitoringPlanAssignment_3()); 
            // InternalAdeptness.g:2048:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==27) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAdeptness.g:2048:4: rule__MonitoringFile__MonitoringPlanAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__MonitoringFile__MonitoringPlanAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalAdeptness.g:2057:1: rule__MonitoringFile__Group__4 : rule__MonitoringFile__Group__4__Impl ;
    public final void rule__MonitoringFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2061:1: ( rule__MonitoringFile__Group__4__Impl )
            // InternalAdeptness.g:2062:2: rule__MonitoringFile__Group__4__Impl
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
    // InternalAdeptness.g:2068:1: rule__MonitoringFile__Group__4__Impl : ( 'ENDMONITORINGPLAN' ) ;
    public final void rule__MonitoringFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2072:1: ( ( 'ENDMONITORINGPLAN' ) )
            // InternalAdeptness.g:2073:1: ( 'ENDMONITORINGPLAN' )
            {
            // InternalAdeptness.g:2073:1: ( 'ENDMONITORINGPLAN' )
            // InternalAdeptness.g:2074:2: 'ENDMONITORINGPLAN'
            {
             before(grammarAccess.getMonitoringFileAccess().getENDMONITORINGPLANKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAdeptness.g:2084:1: rule__MonitoringVariable__Group__0 : rule__MonitoringVariable__Group__0__Impl rule__MonitoringVariable__Group__1 ;
    public final void rule__MonitoringVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2088:1: ( rule__MonitoringVariable__Group__0__Impl rule__MonitoringVariable__Group__1 )
            // InternalAdeptness.g:2089:2: rule__MonitoringVariable__Group__0__Impl rule__MonitoringVariable__Group__1
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
    // InternalAdeptness.g:2096:1: rule__MonitoringVariable__Group__0__Impl : ( 'MONITOR' ) ;
    public final void rule__MonitoringVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2100:1: ( ( 'MONITOR' ) )
            // InternalAdeptness.g:2101:1: ( 'MONITOR' )
            {
            // InternalAdeptness.g:2101:1: ( 'MONITOR' )
            // InternalAdeptness.g:2102:2: 'MONITOR'
            {
             before(grammarAccess.getMonitoringVariableAccess().getMONITORKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAdeptness.g:2111:1: rule__MonitoringVariable__Group__1 : rule__MonitoringVariable__Group__1__Impl rule__MonitoringVariable__Group__2 ;
    public final void rule__MonitoringVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2115:1: ( rule__MonitoringVariable__Group__1__Impl rule__MonitoringVariable__Group__2 )
            // InternalAdeptness.g:2116:2: rule__MonitoringVariable__Group__1__Impl rule__MonitoringVariable__Group__2
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
    // InternalAdeptness.g:2123:1: rule__MonitoringVariable__Group__1__Impl : ( ( rule__MonitoringVariable__NameAssignment_1 ) ) ;
    public final void rule__MonitoringVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2127:1: ( ( ( rule__MonitoringVariable__NameAssignment_1 ) ) )
            // InternalAdeptness.g:2128:1: ( ( rule__MonitoringVariable__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:2128:1: ( ( rule__MonitoringVariable__NameAssignment_1 ) )
            // InternalAdeptness.g:2129:2: ( rule__MonitoringVariable__NameAssignment_1 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:2130:2: ( rule__MonitoringVariable__NameAssignment_1 )
            // InternalAdeptness.g:2130:3: rule__MonitoringVariable__NameAssignment_1
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
    // InternalAdeptness.g:2138:1: rule__MonitoringVariable__Group__2 : rule__MonitoringVariable__Group__2__Impl rule__MonitoringVariable__Group__3 ;
    public final void rule__MonitoringVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2142:1: ( rule__MonitoringVariable__Group__2__Impl rule__MonitoringVariable__Group__3 )
            // InternalAdeptness.g:2143:2: rule__MonitoringVariable__Group__2__Impl rule__MonitoringVariable__Group__3
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
    // InternalAdeptness.g:2150:1: rule__MonitoringVariable__Group__2__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2154:1: ( ( ':' ) )
            // InternalAdeptness.g:2155:1: ( ':' )
            {
            // InternalAdeptness.g:2155:1: ( ':' )
            // InternalAdeptness.g:2156:2: ':'
            {
             before(grammarAccess.getMonitoringVariableAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAdeptness.g:2165:1: rule__MonitoringVariable__Group__3 : rule__MonitoringVariable__Group__3__Impl rule__MonitoringVariable__Group__4 ;
    public final void rule__MonitoringVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2169:1: ( rule__MonitoringVariable__Group__3__Impl rule__MonitoringVariable__Group__4 )
            // InternalAdeptness.g:2170:2: rule__MonitoringVariable__Group__3__Impl rule__MonitoringVariable__Group__4
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
    // InternalAdeptness.g:2177:1: rule__MonitoringVariable__Group__3__Impl : ( 'type' ) ;
    public final void rule__MonitoringVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2181:1: ( ( 'type' ) )
            // InternalAdeptness.g:2182:1: ( 'type' )
            {
            // InternalAdeptness.g:2182:1: ( 'type' )
            // InternalAdeptness.g:2183:2: 'type'
            {
             before(grammarAccess.getMonitoringVariableAccess().getTypeKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAdeptness.g:2192:1: rule__MonitoringVariable__Group__4 : rule__MonitoringVariable__Group__4__Impl rule__MonitoringVariable__Group__5 ;
    public final void rule__MonitoringVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2196:1: ( rule__MonitoringVariable__Group__4__Impl rule__MonitoringVariable__Group__5 )
            // InternalAdeptness.g:2197:2: rule__MonitoringVariable__Group__4__Impl rule__MonitoringVariable__Group__5
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
    // InternalAdeptness.g:2204:1: rule__MonitoringVariable__Group__4__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2208:1: ( ( ':' ) )
            // InternalAdeptness.g:2209:1: ( ':' )
            {
            // InternalAdeptness.g:2209:1: ( ':' )
            // InternalAdeptness.g:2210:2: ':'
            {
             before(grammarAccess.getMonitoringVariableAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAdeptness.g:2219:1: rule__MonitoringVariable__Group__5 : rule__MonitoringVariable__Group__5__Impl rule__MonitoringVariable__Group__6 ;
    public final void rule__MonitoringVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2223:1: ( rule__MonitoringVariable__Group__5__Impl rule__MonitoringVariable__Group__6 )
            // InternalAdeptness.g:2224:2: rule__MonitoringVariable__Group__5__Impl rule__MonitoringVariable__Group__6
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
    // InternalAdeptness.g:2231:1: rule__MonitoringVariable__Group__5__Impl : ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) ) ;
    public final void rule__MonitoringVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2235:1: ( ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) ) )
            // InternalAdeptness.g:2236:1: ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) )
            {
            // InternalAdeptness.g:2236:1: ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) )
            // InternalAdeptness.g:2237:2: ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getMonitoringVariableDatatypeAssignment_5()); 
            // InternalAdeptness.g:2238:2: ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 )
            // InternalAdeptness.g:2238:3: rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5
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
    // InternalAdeptness.g:2246:1: rule__MonitoringVariable__Group__6 : rule__MonitoringVariable__Group__6__Impl rule__MonitoringVariable__Group__7 ;
    public final void rule__MonitoringVariable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2250:1: ( rule__MonitoringVariable__Group__6__Impl rule__MonitoringVariable__Group__7 )
            // InternalAdeptness.g:2251:2: rule__MonitoringVariable__Group__6__Impl rule__MonitoringVariable__Group__7
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
    // InternalAdeptness.g:2258:1: rule__MonitoringVariable__Group__6__Impl : ( ( rule__MonitoringVariable__Group_6__0 )? ) ;
    public final void rule__MonitoringVariable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2262:1: ( ( ( rule__MonitoringVariable__Group_6__0 )? ) )
            // InternalAdeptness.g:2263:1: ( ( rule__MonitoringVariable__Group_6__0 )? )
            {
            // InternalAdeptness.g:2263:1: ( ( rule__MonitoringVariable__Group_6__0 )? )
            // InternalAdeptness.g:2264:2: ( rule__MonitoringVariable__Group_6__0 )?
            {
             before(grammarAccess.getMonitoringVariableAccess().getGroup_6()); 
            // InternalAdeptness.g:2265:2: ( rule__MonitoringVariable__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAdeptness.g:2265:3: rule__MonitoringVariable__Group_6__0
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
    // InternalAdeptness.g:2273:1: rule__MonitoringVariable__Group__7 : rule__MonitoringVariable__Group__7__Impl ;
    public final void rule__MonitoringVariable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2277:1: ( rule__MonitoringVariable__Group__7__Impl )
            // InternalAdeptness.g:2278:2: rule__MonitoringVariable__Group__7__Impl
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
    // InternalAdeptness.g:2284:1: rule__MonitoringVariable__Group__7__Impl : ( 'ENDMONITOR' ) ;
    public final void rule__MonitoringVariable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2288:1: ( ( 'ENDMONITOR' ) )
            // InternalAdeptness.g:2289:1: ( 'ENDMONITOR' )
            {
            // InternalAdeptness.g:2289:1: ( 'ENDMONITOR' )
            // InternalAdeptness.g:2290:2: 'ENDMONITOR'
            {
             before(grammarAccess.getMonitoringVariableAccess().getENDMONITORKeyword_7()); 
            match(input,29,FOLLOW_2); 
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
    // InternalAdeptness.g:2300:1: rule__MonitoringVariable__Group_6__0 : rule__MonitoringVariable__Group_6__0__Impl rule__MonitoringVariable__Group_6__1 ;
    public final void rule__MonitoringVariable__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2304:1: ( rule__MonitoringVariable__Group_6__0__Impl rule__MonitoringVariable__Group_6__1 )
            // InternalAdeptness.g:2305:2: rule__MonitoringVariable__Group_6__0__Impl rule__MonitoringVariable__Group_6__1
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
    // InternalAdeptness.g:2312:1: rule__MonitoringVariable__Group_6__0__Impl : ( 'max' ) ;
    public final void rule__MonitoringVariable__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2316:1: ( ( 'max' ) )
            // InternalAdeptness.g:2317:1: ( 'max' )
            {
            // InternalAdeptness.g:2317:1: ( 'max' )
            // InternalAdeptness.g:2318:2: 'max'
            {
             before(grammarAccess.getMonitoringVariableAccess().getMaxKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAdeptness.g:2327:1: rule__MonitoringVariable__Group_6__1 : rule__MonitoringVariable__Group_6__1__Impl rule__MonitoringVariable__Group_6__2 ;
    public final void rule__MonitoringVariable__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2331:1: ( rule__MonitoringVariable__Group_6__1__Impl rule__MonitoringVariable__Group_6__2 )
            // InternalAdeptness.g:2332:2: rule__MonitoringVariable__Group_6__1__Impl rule__MonitoringVariable__Group_6__2
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
    // InternalAdeptness.g:2339:1: rule__MonitoringVariable__Group_6__1__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2343:1: ( ( ':' ) )
            // InternalAdeptness.g:2344:1: ( ':' )
            {
            // InternalAdeptness.g:2344:1: ( ':' )
            // InternalAdeptness.g:2345:2: ':'
            {
             before(grammarAccess.getMonitoringVariableAccess().getColonKeyword_6_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAdeptness.g:2354:1: rule__MonitoringVariable__Group_6__2 : rule__MonitoringVariable__Group_6__2__Impl rule__MonitoringVariable__Group_6__3 ;
    public final void rule__MonitoringVariable__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2358:1: ( rule__MonitoringVariable__Group_6__2__Impl rule__MonitoringVariable__Group_6__3 )
            // InternalAdeptness.g:2359:2: rule__MonitoringVariable__Group_6__2__Impl rule__MonitoringVariable__Group_6__3
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
    // InternalAdeptness.g:2366:1: rule__MonitoringVariable__Group_6__2__Impl : ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) ) ;
    public final void rule__MonitoringVariable__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2370:1: ( ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) ) )
            // InternalAdeptness.g:2371:1: ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) )
            {
            // InternalAdeptness.g:2371:1: ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) )
            // InternalAdeptness.g:2372:2: ( rule__MonitoringVariable__MaxAssignment_6_2 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getMaxAssignment_6_2()); 
            // InternalAdeptness.g:2373:2: ( rule__MonitoringVariable__MaxAssignment_6_2 )
            // InternalAdeptness.g:2373:3: rule__MonitoringVariable__MaxAssignment_6_2
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
    // InternalAdeptness.g:2381:1: rule__MonitoringVariable__Group_6__3 : rule__MonitoringVariable__Group_6__3__Impl rule__MonitoringVariable__Group_6__4 ;
    public final void rule__MonitoringVariable__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2385:1: ( rule__MonitoringVariable__Group_6__3__Impl rule__MonitoringVariable__Group_6__4 )
            // InternalAdeptness.g:2386:2: rule__MonitoringVariable__Group_6__3__Impl rule__MonitoringVariable__Group_6__4
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
    // InternalAdeptness.g:2393:1: rule__MonitoringVariable__Group_6__3__Impl : ( 'min' ) ;
    public final void rule__MonitoringVariable__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2397:1: ( ( 'min' ) )
            // InternalAdeptness.g:2398:1: ( 'min' )
            {
            // InternalAdeptness.g:2398:1: ( 'min' )
            // InternalAdeptness.g:2399:2: 'min'
            {
             before(grammarAccess.getMonitoringVariableAccess().getMinKeyword_6_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAdeptness.g:2408:1: rule__MonitoringVariable__Group_6__4 : rule__MonitoringVariable__Group_6__4__Impl rule__MonitoringVariable__Group_6__5 ;
    public final void rule__MonitoringVariable__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2412:1: ( rule__MonitoringVariable__Group_6__4__Impl rule__MonitoringVariable__Group_6__5 )
            // InternalAdeptness.g:2413:2: rule__MonitoringVariable__Group_6__4__Impl rule__MonitoringVariable__Group_6__5
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
    // InternalAdeptness.g:2420:1: rule__MonitoringVariable__Group_6__4__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2424:1: ( ( ':' ) )
            // InternalAdeptness.g:2425:1: ( ':' )
            {
            // InternalAdeptness.g:2425:1: ( ':' )
            // InternalAdeptness.g:2426:2: ':'
            {
             before(grammarAccess.getMonitoringVariableAccess().getColonKeyword_6_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAdeptness.g:2435:1: rule__MonitoringVariable__Group_6__5 : rule__MonitoringVariable__Group_6__5__Impl ;
    public final void rule__MonitoringVariable__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2439:1: ( rule__MonitoringVariable__Group_6__5__Impl )
            // InternalAdeptness.g:2440:2: rule__MonitoringVariable__Group_6__5__Impl
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
    // InternalAdeptness.g:2446:1: rule__MonitoringVariable__Group_6__5__Impl : ( ( rule__MonitoringVariable__MinAssignment_6_5 ) ) ;
    public final void rule__MonitoringVariable__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2450:1: ( ( ( rule__MonitoringVariable__MinAssignment_6_5 ) ) )
            // InternalAdeptness.g:2451:1: ( ( rule__MonitoringVariable__MinAssignment_6_5 ) )
            {
            // InternalAdeptness.g:2451:1: ( ( rule__MonitoringVariable__MinAssignment_6_5 ) )
            // InternalAdeptness.g:2452:2: ( rule__MonitoringVariable__MinAssignment_6_5 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getMinAssignment_6_5()); 
            // InternalAdeptness.g:2453:2: ( rule__MonitoringVariable__MinAssignment_6_5 )
            // InternalAdeptness.g:2453:3: rule__MonitoringVariable__MinAssignment_6_5
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
    // InternalAdeptness.g:2462:1: rule__Signal__Group__0 : rule__Signal__Group__0__Impl rule__Signal__Group__1 ;
    public final void rule__Signal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2466:1: ( rule__Signal__Group__0__Impl rule__Signal__Group__1 )
            // InternalAdeptness.g:2467:2: rule__Signal__Group__0__Impl rule__Signal__Group__1
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
    // InternalAdeptness.g:2474:1: rule__Signal__Group__0__Impl : ( 'CPS' ) ;
    public final void rule__Signal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2478:1: ( ( 'CPS' ) )
            // InternalAdeptness.g:2479:1: ( 'CPS' )
            {
            // InternalAdeptness.g:2479:1: ( 'CPS' )
            // InternalAdeptness.g:2480:2: 'CPS'
            {
             before(grammarAccess.getSignalAccess().getCPSKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalAdeptness.g:2489:1: rule__Signal__Group__1 : rule__Signal__Group__1__Impl rule__Signal__Group__2 ;
    public final void rule__Signal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2493:1: ( rule__Signal__Group__1__Impl rule__Signal__Group__2 )
            // InternalAdeptness.g:2494:2: rule__Signal__Group__1__Impl rule__Signal__Group__2
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
    // InternalAdeptness.g:2501:1: rule__Signal__Group__1__Impl : ( ( rule__Signal__NameAssignment_1 ) ) ;
    public final void rule__Signal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2505:1: ( ( ( rule__Signal__NameAssignment_1 ) ) )
            // InternalAdeptness.g:2506:1: ( ( rule__Signal__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:2506:1: ( ( rule__Signal__NameAssignment_1 ) )
            // InternalAdeptness.g:2507:2: ( rule__Signal__NameAssignment_1 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:2508:2: ( rule__Signal__NameAssignment_1 )
            // InternalAdeptness.g:2508:3: rule__Signal__NameAssignment_1
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
    // InternalAdeptness.g:2516:1: rule__Signal__Group__2 : rule__Signal__Group__2__Impl rule__Signal__Group__3 ;
    public final void rule__Signal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2520:1: ( rule__Signal__Group__2__Impl rule__Signal__Group__3 )
            // InternalAdeptness.g:2521:2: rule__Signal__Group__2__Impl rule__Signal__Group__3
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
    // InternalAdeptness.g:2528:1: rule__Signal__Group__2__Impl : ( ( rule__Signal__Group_2__0 )? ) ;
    public final void rule__Signal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2532:1: ( ( ( rule__Signal__Group_2__0 )? ) )
            // InternalAdeptness.g:2533:1: ( ( rule__Signal__Group_2__0 )? )
            {
            // InternalAdeptness.g:2533:1: ( ( rule__Signal__Group_2__0 )? )
            // InternalAdeptness.g:2534:2: ( rule__Signal__Group_2__0 )?
            {
             before(grammarAccess.getSignalAccess().getGroup_2()); 
            // InternalAdeptness.g:2535:2: ( rule__Signal__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAdeptness.g:2535:3: rule__Signal__Group_2__0
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
    // InternalAdeptness.g:2543:1: rule__Signal__Group__3 : rule__Signal__Group__3__Impl rule__Signal__Group__4 ;
    public final void rule__Signal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2547:1: ( rule__Signal__Group__3__Impl rule__Signal__Group__4 )
            // InternalAdeptness.g:2548:2: rule__Signal__Group__3__Impl rule__Signal__Group__4
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
    // InternalAdeptness.g:2555:1: rule__Signal__Group__3__Impl : ( ':' ) ;
    public final void rule__Signal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2559:1: ( ( ':' ) )
            // InternalAdeptness.g:2560:1: ( ':' )
            {
            // InternalAdeptness.g:2560:1: ( ':' )
            // InternalAdeptness.g:2561:2: ':'
            {
             before(grammarAccess.getSignalAccess().getColonKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAdeptness.g:2570:1: rule__Signal__Group__4 : rule__Signal__Group__4__Impl rule__Signal__Group__5 ;
    public final void rule__Signal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2574:1: ( rule__Signal__Group__4__Impl rule__Signal__Group__5 )
            // InternalAdeptness.g:2575:2: rule__Signal__Group__4__Impl rule__Signal__Group__5
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
    // InternalAdeptness.g:2582:1: rule__Signal__Group__4__Impl : ( ( rule__Signal__Group_4__0 )? ) ;
    public final void rule__Signal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2586:1: ( ( ( rule__Signal__Group_4__0 )? ) )
            // InternalAdeptness.g:2587:1: ( ( rule__Signal__Group_4__0 )? )
            {
            // InternalAdeptness.g:2587:1: ( ( rule__Signal__Group_4__0 )? )
            // InternalAdeptness.g:2588:2: ( rule__Signal__Group_4__0 )?
            {
             before(grammarAccess.getSignalAccess().getGroup_4()); 
            // InternalAdeptness.g:2589:2: ( rule__Signal__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAdeptness.g:2589:3: rule__Signal__Group_4__0
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
    // InternalAdeptness.g:2597:1: rule__Signal__Group__5 : rule__Signal__Group__5__Impl rule__Signal__Group__6 ;
    public final void rule__Signal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2601:1: ( rule__Signal__Group__5__Impl rule__Signal__Group__6 )
            // InternalAdeptness.g:2602:2: rule__Signal__Group__5__Impl rule__Signal__Group__6
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
    // InternalAdeptness.g:2609:1: rule__Signal__Group__5__Impl : ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) ) ;
    public final void rule__Signal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2613:1: ( ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) ) )
            // InternalAdeptness.g:2614:1: ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) )
            {
            // InternalAdeptness.g:2614:1: ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) )
            // InternalAdeptness.g:2615:2: ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* )
            {
            // InternalAdeptness.g:2615:2: ( ( rule__Signal__OracleAssignment_5 ) )
            // InternalAdeptness.g:2616:3: ( rule__Signal__OracleAssignment_5 )
            {
             before(grammarAccess.getSignalAccess().getOracleAssignment_5()); 
            // InternalAdeptness.g:2617:3: ( rule__Signal__OracleAssignment_5 )
            // InternalAdeptness.g:2617:4: rule__Signal__OracleAssignment_5
            {
            pushFollow(FOLLOW_21);
            rule__Signal__OracleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getOracleAssignment_5()); 

            }

            // InternalAdeptness.g:2620:2: ( ( rule__Signal__OracleAssignment_5 )* )
            // InternalAdeptness.g:2621:3: ( rule__Signal__OracleAssignment_5 )*
            {
             before(grammarAccess.getSignalAccess().getOracleAssignment_5()); 
            // InternalAdeptness.g:2622:3: ( rule__Signal__OracleAssignment_5 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==37) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAdeptness.g:2622:4: rule__Signal__OracleAssignment_5
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Signal__OracleAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalAdeptness.g:2631:1: rule__Signal__Group__6 : rule__Signal__Group__6__Impl ;
    public final void rule__Signal__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2635:1: ( rule__Signal__Group__6__Impl )
            // InternalAdeptness.g:2636:2: rule__Signal__Group__6__Impl
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
    // InternalAdeptness.g:2642:1: rule__Signal__Group__6__Impl : ( 'ENDCPS' ) ;
    public final void rule__Signal__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2646:1: ( ( 'ENDCPS' ) )
            // InternalAdeptness.g:2647:1: ( 'ENDCPS' )
            {
            // InternalAdeptness.g:2647:1: ( 'ENDCPS' )
            // InternalAdeptness.g:2648:2: 'ENDCPS'
            {
             before(grammarAccess.getSignalAccess().getENDCPSKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalAdeptness.g:2658:1: rule__Signal__Group_2__0 : rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1 ;
    public final void rule__Signal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2662:1: ( rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1 )
            // InternalAdeptness.g:2663:2: rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1
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
    // InternalAdeptness.g:2670:1: rule__Signal__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Signal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2674:1: ( ( '[' ) )
            // InternalAdeptness.g:2675:1: ( '[' )
            {
            // InternalAdeptness.g:2675:1: ( '[' )
            // InternalAdeptness.g:2676:2: '['
            {
             before(grammarAccess.getSignalAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdeptness.g:2685:1: rule__Signal__Group_2__1 : rule__Signal__Group_2__1__Impl rule__Signal__Group_2__2 ;
    public final void rule__Signal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2689:1: ( rule__Signal__Group_2__1__Impl rule__Signal__Group_2__2 )
            // InternalAdeptness.g:2690:2: rule__Signal__Group_2__1__Impl rule__Signal__Group_2__2
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
    // InternalAdeptness.g:2697:1: rule__Signal__Group_2__1__Impl : ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) ) ;
    public final void rule__Signal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2701:1: ( ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) ) )
            // InternalAdeptness.g:2702:1: ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) )
            {
            // InternalAdeptness.g:2702:1: ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) )
            // InternalAdeptness.g:2703:2: ( rule__Signal__CardinalityNumCPSAssignment_2_1 )
            {
             before(grammarAccess.getSignalAccess().getCardinalityNumCPSAssignment_2_1()); 
            // InternalAdeptness.g:2704:2: ( rule__Signal__CardinalityNumCPSAssignment_2_1 )
            // InternalAdeptness.g:2704:3: rule__Signal__CardinalityNumCPSAssignment_2_1
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
    // InternalAdeptness.g:2712:1: rule__Signal__Group_2__2 : rule__Signal__Group_2__2__Impl ;
    public final void rule__Signal__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2716:1: ( rule__Signal__Group_2__2__Impl )
            // InternalAdeptness.g:2717:2: rule__Signal__Group_2__2__Impl
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
    // InternalAdeptness.g:2723:1: rule__Signal__Group_2__2__Impl : ( ']' ) ;
    public final void rule__Signal__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2727:1: ( ( ']' ) )
            // InternalAdeptness.g:2728:1: ( ']' )
            {
            // InternalAdeptness.g:2728:1: ( ']' )
            // InternalAdeptness.g:2729:2: ']'
            {
             before(grammarAccess.getSignalAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdeptness.g:2739:1: rule__Signal__Group_4__0 : rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1 ;
    public final void rule__Signal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2743:1: ( rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1 )
            // InternalAdeptness.g:2744:2: rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1
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
    // InternalAdeptness.g:2751:1: rule__Signal__Group_4__0__Impl : ( 'implements' ) ;
    public final void rule__Signal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2755:1: ( ( 'implements' ) )
            // InternalAdeptness.g:2756:1: ( 'implements' )
            {
            // InternalAdeptness.g:2756:1: ( 'implements' )
            // InternalAdeptness.g:2757:2: 'implements'
            {
             before(grammarAccess.getSignalAccess().getImplementsKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdeptness.g:2766:1: rule__Signal__Group_4__1 : rule__Signal__Group_4__1__Impl ;
    public final void rule__Signal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2770:1: ( rule__Signal__Group_4__1__Impl )
            // InternalAdeptness.g:2771:2: rule__Signal__Group_4__1__Impl
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
    // InternalAdeptness.g:2777:1: rule__Signal__Group_4__1__Impl : ( ( rule__Signal__SuperTypeAssignment_4_1 ) ) ;
    public final void rule__Signal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2781:1: ( ( ( rule__Signal__SuperTypeAssignment_4_1 ) ) )
            // InternalAdeptness.g:2782:1: ( ( rule__Signal__SuperTypeAssignment_4_1 ) )
            {
            // InternalAdeptness.g:2782:1: ( ( rule__Signal__SuperTypeAssignment_4_1 ) )
            // InternalAdeptness.g:2783:2: ( rule__Signal__SuperTypeAssignment_4_1 )
            {
             before(grammarAccess.getSignalAccess().getSuperTypeAssignment_4_1()); 
            // InternalAdeptness.g:2784:2: ( rule__Signal__SuperTypeAssignment_4_1 )
            // InternalAdeptness.g:2784:3: rule__Signal__SuperTypeAssignment_4_1
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
    // InternalAdeptness.g:2793:1: rule__Oracle__Group__0 : rule__Oracle__Group__0__Impl rule__Oracle__Group__1 ;
    public final void rule__Oracle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2797:1: ( rule__Oracle__Group__0__Impl rule__Oracle__Group__1 )
            // InternalAdeptness.g:2798:2: rule__Oracle__Group__0__Impl rule__Oracle__Group__1
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
    // InternalAdeptness.g:2805:1: rule__Oracle__Group__0__Impl : ( 'ORACLE' ) ;
    public final void rule__Oracle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2809:1: ( ( 'ORACLE' ) )
            // InternalAdeptness.g:2810:1: ( 'ORACLE' )
            {
            // InternalAdeptness.g:2810:1: ( 'ORACLE' )
            // InternalAdeptness.g:2811:2: 'ORACLE'
            {
             before(grammarAccess.getOracleAccess().getORACLEKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdeptness.g:2820:1: rule__Oracle__Group__1 : rule__Oracle__Group__1__Impl rule__Oracle__Group__2 ;
    public final void rule__Oracle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2824:1: ( rule__Oracle__Group__1__Impl rule__Oracle__Group__2 )
            // InternalAdeptness.g:2825:2: rule__Oracle__Group__1__Impl rule__Oracle__Group__2
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
    // InternalAdeptness.g:2832:1: rule__Oracle__Group__1__Impl : ( ( rule__Oracle__NameAssignment_1 ) ) ;
    public final void rule__Oracle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2836:1: ( ( ( rule__Oracle__NameAssignment_1 ) ) )
            // InternalAdeptness.g:2837:1: ( ( rule__Oracle__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:2837:1: ( ( rule__Oracle__NameAssignment_1 ) )
            // InternalAdeptness.g:2838:2: ( rule__Oracle__NameAssignment_1 )
            {
             before(grammarAccess.getOracleAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:2839:2: ( rule__Oracle__NameAssignment_1 )
            // InternalAdeptness.g:2839:3: rule__Oracle__NameAssignment_1
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
    // InternalAdeptness.g:2847:1: rule__Oracle__Group__2 : rule__Oracle__Group__2__Impl rule__Oracle__Group__3 ;
    public final void rule__Oracle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2851:1: ( rule__Oracle__Group__2__Impl rule__Oracle__Group__3 )
            // InternalAdeptness.g:2852:2: rule__Oracle__Group__2__Impl rule__Oracle__Group__3
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
    // InternalAdeptness.g:2859:1: rule__Oracle__Group__2__Impl : ( ':' ) ;
    public final void rule__Oracle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2863:1: ( ( ':' ) )
            // InternalAdeptness.g:2864:1: ( ':' )
            {
            // InternalAdeptness.g:2864:1: ( ':' )
            // InternalAdeptness.g:2865:2: ':'
            {
             before(grammarAccess.getOracleAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAdeptness.g:2874:1: rule__Oracle__Group__3 : rule__Oracle__Group__3__Impl rule__Oracle__Group__4 ;
    public final void rule__Oracle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2878:1: ( rule__Oracle__Group__3__Impl rule__Oracle__Group__4 )
            // InternalAdeptness.g:2879:2: rule__Oracle__Group__3__Impl rule__Oracle__Group__4
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
    // InternalAdeptness.g:2886:1: rule__Oracle__Group__3__Impl : ( ( rule__Oracle__WhenAssignment_3 )? ) ;
    public final void rule__Oracle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2890:1: ( ( ( rule__Oracle__WhenAssignment_3 )? ) )
            // InternalAdeptness.g:2891:1: ( ( rule__Oracle__WhenAssignment_3 )? )
            {
            // InternalAdeptness.g:2891:1: ( ( rule__Oracle__WhenAssignment_3 )? )
            // InternalAdeptness.g:2892:2: ( rule__Oracle__WhenAssignment_3 )?
            {
             before(grammarAccess.getOracleAccess().getWhenAssignment_3()); 
            // InternalAdeptness.g:2893:2: ( rule__Oracle__WhenAssignment_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAdeptness.g:2893:3: rule__Oracle__WhenAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Oracle__WhenAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOracleAccess().getWhenAssignment_3()); 

            }


            }

        }
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
    // InternalAdeptness.g:2901:1: rule__Oracle__Group__4 : rule__Oracle__Group__4__Impl rule__Oracle__Group__5 ;
    public final void rule__Oracle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2905:1: ( rule__Oracle__Group__4__Impl rule__Oracle__Group__5 )
            // InternalAdeptness.g:2906:2: rule__Oracle__Group__4__Impl rule__Oracle__Group__5
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
    // InternalAdeptness.g:2913:1: rule__Oracle__Group__4__Impl : ( ( ( rule__Oracle__CheckAssignment_4 ) ) ( ( rule__Oracle__CheckAssignment_4 )* ) ) ;
    public final void rule__Oracle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2917:1: ( ( ( ( rule__Oracle__CheckAssignment_4 ) ) ( ( rule__Oracle__CheckAssignment_4 )* ) ) )
            // InternalAdeptness.g:2918:1: ( ( ( rule__Oracle__CheckAssignment_4 ) ) ( ( rule__Oracle__CheckAssignment_4 )* ) )
            {
            // InternalAdeptness.g:2918:1: ( ( ( rule__Oracle__CheckAssignment_4 ) ) ( ( rule__Oracle__CheckAssignment_4 )* ) )
            // InternalAdeptness.g:2919:2: ( ( rule__Oracle__CheckAssignment_4 ) ) ( ( rule__Oracle__CheckAssignment_4 )* )
            {
            // InternalAdeptness.g:2919:2: ( ( rule__Oracle__CheckAssignment_4 ) )
            // InternalAdeptness.g:2920:3: ( rule__Oracle__CheckAssignment_4 )
            {
             before(grammarAccess.getOracleAccess().getCheckAssignment_4()); 
            // InternalAdeptness.g:2921:3: ( rule__Oracle__CheckAssignment_4 )
            // InternalAdeptness.g:2921:4: rule__Oracle__CheckAssignment_4
            {
            pushFollow(FOLLOW_26);
            rule__Oracle__CheckAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOracleAccess().getCheckAssignment_4()); 

            }

            // InternalAdeptness.g:2924:2: ( ( rule__Oracle__CheckAssignment_4 )* )
            // InternalAdeptness.g:2925:3: ( rule__Oracle__CheckAssignment_4 )*
            {
             before(grammarAccess.getOracleAccess().getCheckAssignment_4()); 
            // InternalAdeptness.g:2926:3: ( rule__Oracle__CheckAssignment_4 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==40) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAdeptness.g:2926:4: rule__Oracle__CheckAssignment_4
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Oracle__CheckAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalAdeptness.g:2935:1: rule__Oracle__Group__5 : rule__Oracle__Group__5__Impl ;
    public final void rule__Oracle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2939:1: ( rule__Oracle__Group__5__Impl )
            // InternalAdeptness.g:2940:2: rule__Oracle__Group__5__Impl
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
    // InternalAdeptness.g:2946:1: rule__Oracle__Group__5__Impl : ( 'ENDORACLE' ) ;
    public final void rule__Oracle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2950:1: ( ( 'ENDORACLE' ) )
            // InternalAdeptness.g:2951:1: ( 'ENDORACLE' )
            {
            // InternalAdeptness.g:2951:1: ( 'ENDORACLE' )
            // InternalAdeptness.g:2952:2: 'ENDORACLE'
            {
             before(grammarAccess.getOracleAccess().getENDORACLEKeyword_5()); 
            match(input,38,FOLLOW_2); 
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


    // $ANTLR start "rule__When__Group__0"
    // InternalAdeptness.g:2962:1: rule__When__Group__0 : rule__When__Group__0__Impl rule__When__Group__1 ;
    public final void rule__When__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2966:1: ( rule__When__Group__0__Impl rule__When__Group__1 )
            // InternalAdeptness.g:2967:2: rule__When__Group__0__Impl rule__When__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalAdeptness.g:2974:1: rule__When__Group__0__Impl : ( 'when:' ) ;
    public final void rule__When__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2978:1: ( ( 'when:' ) )
            // InternalAdeptness.g:2979:1: ( 'when:' )
            {
            // InternalAdeptness.g:2979:1: ( 'when:' )
            // InternalAdeptness.g:2980:2: 'when:'
            {
             before(grammarAccess.getWhenAccess().getWhenKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalAdeptness.g:2989:1: rule__When__Group__1 : rule__When__Group__1__Impl ;
    public final void rule__When__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2993:1: ( rule__When__Group__1__Impl )
            // InternalAdeptness.g:2994:2: rule__When__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__When__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAdeptness.g:3000:1: rule__When__Group__1__Impl : ( ( rule__When__EmAssignment_1 ) ) ;
    public final void rule__When__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3004:1: ( ( ( rule__When__EmAssignment_1 ) ) )
            // InternalAdeptness.g:3005:1: ( ( rule__When__EmAssignment_1 ) )
            {
            // InternalAdeptness.g:3005:1: ( ( rule__When__EmAssignment_1 ) )
            // InternalAdeptness.g:3006:2: ( rule__When__EmAssignment_1 )
            {
             before(grammarAccess.getWhenAccess().getEmAssignment_1()); 
            // InternalAdeptness.g:3007:2: ( rule__When__EmAssignment_1 )
            // InternalAdeptness.g:3007:3: rule__When__EmAssignment_1
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


    // $ANTLR start "rule__Checks__Group__0"
    // InternalAdeptness.g:3016:1: rule__Checks__Group__0 : rule__Checks__Group__0__Impl rule__Checks__Group__1 ;
    public final void rule__Checks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3020:1: ( rule__Checks__Group__0__Impl rule__Checks__Group__1 )
            // InternalAdeptness.g:3021:2: rule__Checks__Group__0__Impl rule__Checks__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalAdeptness.g:3028:1: rule__Checks__Group__0__Impl : ( 'checks:' ) ;
    public final void rule__Checks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3032:1: ( ( 'checks:' ) )
            // InternalAdeptness.g:3033:1: ( 'checks:' )
            {
            // InternalAdeptness.g:3033:1: ( 'checks:' )
            // InternalAdeptness.g:3034:2: 'checks:'
            {
             before(grammarAccess.getChecksAccess().getChecksKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalAdeptness.g:3043:1: rule__Checks__Group__1 : rule__Checks__Group__1__Impl rule__Checks__Group__2 ;
    public final void rule__Checks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3047:1: ( rule__Checks__Group__1__Impl rule__Checks__Group__2 )
            // InternalAdeptness.g:3048:2: rule__Checks__Group__1__Impl rule__Checks__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalAdeptness.g:3055:1: rule__Checks__Group__1__Impl : ( ( rule__Checks__Alternatives_1 ) ) ;
    public final void rule__Checks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3059:1: ( ( ( rule__Checks__Alternatives_1 ) ) )
            // InternalAdeptness.g:3060:1: ( ( rule__Checks__Alternatives_1 ) )
            {
            // InternalAdeptness.g:3060:1: ( ( rule__Checks__Alternatives_1 ) )
            // InternalAdeptness.g:3061:2: ( rule__Checks__Alternatives_1 )
            {
             before(grammarAccess.getChecksAccess().getAlternatives_1()); 
            // InternalAdeptness.g:3062:2: ( rule__Checks__Alternatives_1 )
            // InternalAdeptness.g:3062:3: rule__Checks__Alternatives_1
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
    // InternalAdeptness.g:3070:1: rule__Checks__Group__2 : rule__Checks__Group__2__Impl rule__Checks__Group__3 ;
    public final void rule__Checks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3074:1: ( rule__Checks__Group__2__Impl rule__Checks__Group__3 )
            // InternalAdeptness.g:3075:2: rule__Checks__Group__2__Impl rule__Checks__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalAdeptness.g:3082:1: rule__Checks__Group__2__Impl : ( ( rule__Checks__ReferenceAssignment_2 ) ) ;
    public final void rule__Checks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3086:1: ( ( ( rule__Checks__ReferenceAssignment_2 ) ) )
            // InternalAdeptness.g:3087:1: ( ( rule__Checks__ReferenceAssignment_2 ) )
            {
            // InternalAdeptness.g:3087:1: ( ( rule__Checks__ReferenceAssignment_2 ) )
            // InternalAdeptness.g:3088:2: ( rule__Checks__ReferenceAssignment_2 )
            {
             before(grammarAccess.getChecksAccess().getReferenceAssignment_2()); 
            // InternalAdeptness.g:3089:2: ( rule__Checks__ReferenceAssignment_2 )
            // InternalAdeptness.g:3089:3: rule__Checks__ReferenceAssignment_2
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
    // InternalAdeptness.g:3097:1: rule__Checks__Group__3 : rule__Checks__Group__3__Impl rule__Checks__Group__4 ;
    public final void rule__Checks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3101:1: ( rule__Checks__Group__3__Impl rule__Checks__Group__4 )
            // InternalAdeptness.g:3102:2: rule__Checks__Group__3__Impl rule__Checks__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalAdeptness.g:3109:1: rule__Checks__Group__3__Impl : ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) ) ;
    public final void rule__Checks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3113:1: ( ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) ) )
            // InternalAdeptness.g:3114:1: ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) )
            {
            // InternalAdeptness.g:3114:1: ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) )
            // InternalAdeptness.g:3115:2: ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* )
            {
            // InternalAdeptness.g:3115:2: ( ( rule__Checks__FailReasonAssignment_3 ) )
            // InternalAdeptness.g:3116:3: ( rule__Checks__FailReasonAssignment_3 )
            {
             before(grammarAccess.getChecksAccess().getFailReasonAssignment_3()); 
            // InternalAdeptness.g:3117:3: ( rule__Checks__FailReasonAssignment_3 )
            // InternalAdeptness.g:3117:4: rule__Checks__FailReasonAssignment_3
            {
            pushFollow(FOLLOW_31);
            rule__Checks__FailReasonAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChecksAccess().getFailReasonAssignment_3()); 

            }

            // InternalAdeptness.g:3120:2: ( ( rule__Checks__FailReasonAssignment_3 )* )
            // InternalAdeptness.g:3121:3: ( rule__Checks__FailReasonAssignment_3 )*
            {
             before(grammarAccess.getChecksAccess().getFailReasonAssignment_3()); 
            // InternalAdeptness.g:3122:3: ( rule__Checks__FailReasonAssignment_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==42) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAdeptness.g:3122:4: rule__Checks__FailReasonAssignment_3
            	    {
            	    pushFollow(FOLLOW_31);
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
    // InternalAdeptness.g:3131:1: rule__Checks__Group__4 : rule__Checks__Group__4__Impl ;
    public final void rule__Checks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3135:1: ( rule__Checks__Group__4__Impl )
            // InternalAdeptness.g:3136:2: rule__Checks__Group__4__Impl
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
    // InternalAdeptness.g:3142:1: rule__Checks__Group__4__Impl : ( ( rule__Checks__DescriptionAssignment_4 ) ) ;
    public final void rule__Checks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3146:1: ( ( ( rule__Checks__DescriptionAssignment_4 ) ) )
            // InternalAdeptness.g:3147:1: ( ( rule__Checks__DescriptionAssignment_4 ) )
            {
            // InternalAdeptness.g:3147:1: ( ( rule__Checks__DescriptionAssignment_4 ) )
            // InternalAdeptness.g:3148:2: ( rule__Checks__DescriptionAssignment_4 )
            {
             before(grammarAccess.getChecksAccess().getDescriptionAssignment_4()); 
            // InternalAdeptness.g:3149:2: ( rule__Checks__DescriptionAssignment_4 )
            // InternalAdeptness.g:3149:3: rule__Checks__DescriptionAssignment_4
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
    // InternalAdeptness.g:3158:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3162:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalAdeptness.g:3163:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalAdeptness.g:3170:1: rule__Description__Group__0__Impl : ( 'Description: ' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3174:1: ( ( 'Description: ' ) )
            // InternalAdeptness.g:3175:1: ( 'Description: ' )
            {
            // InternalAdeptness.g:3175:1: ( 'Description: ' )
            // InternalAdeptness.g:3176:2: 'Description: '
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalAdeptness.g:3185:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3189:1: ( rule__Description__Group__1__Impl )
            // InternalAdeptness.g:3190:2: rule__Description__Group__1__Impl
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
    // InternalAdeptness.g:3196:1: rule__Description__Group__1__Impl : ( ( rule__Description__ValueAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3200:1: ( ( ( rule__Description__ValueAssignment_1 ) ) )
            // InternalAdeptness.g:3201:1: ( ( rule__Description__ValueAssignment_1 ) )
            {
            // InternalAdeptness.g:3201:1: ( ( rule__Description__ValueAssignment_1 ) )
            // InternalAdeptness.g:3202:2: ( rule__Description__ValueAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getValueAssignment_1()); 
            // InternalAdeptness.g:3203:2: ( rule__Description__ValueAssignment_1 )
            // InternalAdeptness.g:3203:3: rule__Description__ValueAssignment_1
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
    // InternalAdeptness.g:3212:1: rule__FailReason__Group__0 : rule__FailReason__Group__0__Impl rule__FailReason__Group__1 ;
    public final void rule__FailReason__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3216:1: ( rule__FailReason__Group__0__Impl rule__FailReason__Group__1 )
            // InternalAdeptness.g:3217:2: rule__FailReason__Group__0__Impl rule__FailReason__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalAdeptness.g:3224:1: rule__FailReason__Group__0__Impl : ( 'fails if :' ) ;
    public final void rule__FailReason__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3228:1: ( ( 'fails if :' ) )
            // InternalAdeptness.g:3229:1: ( 'fails if :' )
            {
            // InternalAdeptness.g:3229:1: ( 'fails if :' )
            // InternalAdeptness.g:3230:2: 'fails if :'
            {
             before(grammarAccess.getFailReasonAccess().getFailsIfKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalAdeptness.g:3239:1: rule__FailReason__Group__1 : rule__FailReason__Group__1__Impl ;
    public final void rule__FailReason__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3243:1: ( rule__FailReason__Group__1__Impl )
            // InternalAdeptness.g:3244:2: rule__FailReason__Group__1__Impl
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
    // InternalAdeptness.g:3250:1: rule__FailReason__Group__1__Impl : ( ( rule__FailReason__ReasonAssignment_1 ) ) ;
    public final void rule__FailReason__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3254:1: ( ( ( rule__FailReason__ReasonAssignment_1 ) ) )
            // InternalAdeptness.g:3255:1: ( ( rule__FailReason__ReasonAssignment_1 ) )
            {
            // InternalAdeptness.g:3255:1: ( ( rule__FailReason__ReasonAssignment_1 ) )
            // InternalAdeptness.g:3256:2: ( rule__FailReason__ReasonAssignment_1 )
            {
             before(grammarAccess.getFailReasonAccess().getReasonAssignment_1()); 
            // InternalAdeptness.g:3257:2: ( rule__FailReason__ReasonAssignment_1 )
            // InternalAdeptness.g:3257:3: rule__FailReason__ReasonAssignment_1
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
    // InternalAdeptness.g:3266:1: rule__Reason__Group__0 : rule__Reason__Group__0__Impl rule__Reason__Group__1 ;
    public final void rule__Reason__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3270:1: ( rule__Reason__Group__0__Impl rule__Reason__Group__1 )
            // InternalAdeptness.g:3271:2: rule__Reason__Group__0__Impl rule__Reason__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalAdeptness.g:3278:1: rule__Reason__Group__0__Impl : ( ( rule__Reason__Alternatives_0 ) ) ;
    public final void rule__Reason__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3282:1: ( ( ( rule__Reason__Alternatives_0 ) ) )
            // InternalAdeptness.g:3283:1: ( ( rule__Reason__Alternatives_0 ) )
            {
            // InternalAdeptness.g:3283:1: ( ( rule__Reason__Alternatives_0 ) )
            // InternalAdeptness.g:3284:2: ( rule__Reason__Alternatives_0 )
            {
             before(grammarAccess.getReasonAccess().getAlternatives_0()); 
            // InternalAdeptness.g:3285:2: ( rule__Reason__Alternatives_0 )
            // InternalAdeptness.g:3285:3: rule__Reason__Alternatives_0
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
    // InternalAdeptness.g:3293:1: rule__Reason__Group__1 : rule__Reason__Group__1__Impl ;
    public final void rule__Reason__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3297:1: ( rule__Reason__Group__1__Impl )
            // InternalAdeptness.g:3298:2: rule__Reason__Group__1__Impl
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
    // InternalAdeptness.g:3304:1: rule__Reason__Group__1__Impl : ( ';' ) ;
    public final void rule__Reason__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3308:1: ( ( ';' ) )
            // InternalAdeptness.g:3309:1: ( ';' )
            {
            // InternalAdeptness.g:3309:1: ( ';' )
            // InternalAdeptness.g:3310:2: ';'
            {
             before(grammarAccess.getReasonAccess().getSemicolonKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalAdeptness.g:3320:1: rule__XPeaks__Group__0 : rule__XPeaks__Group__0__Impl rule__XPeaks__Group__1 ;
    public final void rule__XPeaks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3324:1: ( rule__XPeaks__Group__0__Impl rule__XPeaks__Group__1 )
            // InternalAdeptness.g:3325:2: rule__XPeaks__Group__0__Impl rule__XPeaks__Group__1
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
    // InternalAdeptness.g:3332:1: rule__XPeaks__Group__0__Impl : ( 'confidence is below' ) ;
    public final void rule__XPeaks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3336:1: ( ( 'confidence is below' ) )
            // InternalAdeptness.g:3337:1: ( 'confidence is below' )
            {
            // InternalAdeptness.g:3337:1: ( 'confidence is below' )
            // InternalAdeptness.g:3338:2: 'confidence is below'
            {
             before(grammarAccess.getXPeaksAccess().getConfidenceIsBelowKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAdeptness.g:3347:1: rule__XPeaks__Group__1 : rule__XPeaks__Group__1__Impl rule__XPeaks__Group__2 ;
    public final void rule__XPeaks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3351:1: ( rule__XPeaks__Group__1__Impl rule__XPeaks__Group__2 )
            // InternalAdeptness.g:3352:2: rule__XPeaks__Group__1__Impl rule__XPeaks__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalAdeptness.g:3359:1: rule__XPeaks__Group__1__Impl : ( ( rule__XPeaks__CantAssignment_1 ) ) ;
    public final void rule__XPeaks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3363:1: ( ( ( rule__XPeaks__CantAssignment_1 ) ) )
            // InternalAdeptness.g:3364:1: ( ( rule__XPeaks__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:3364:1: ( ( rule__XPeaks__CantAssignment_1 ) )
            // InternalAdeptness.g:3365:2: ( rule__XPeaks__CantAssignment_1 )
            {
             before(grammarAccess.getXPeaksAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:3366:2: ( rule__XPeaks__CantAssignment_1 )
            // InternalAdeptness.g:3366:3: rule__XPeaks__CantAssignment_1
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
    // InternalAdeptness.g:3374:1: rule__XPeaks__Group__2 : rule__XPeaks__Group__2__Impl rule__XPeaks__Group__3 ;
    public final void rule__XPeaks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3378:1: ( rule__XPeaks__Group__2__Impl rule__XPeaks__Group__3 )
            // InternalAdeptness.g:3379:2: rule__XPeaks__Group__2__Impl rule__XPeaks__Group__3
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
    // InternalAdeptness.g:3386:1: rule__XPeaks__Group__2__Impl : ( 'more than' ) ;
    public final void rule__XPeaks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3390:1: ( ( 'more than' ) )
            // InternalAdeptness.g:3391:1: ( 'more than' )
            {
            // InternalAdeptness.g:3391:1: ( 'more than' )
            // InternalAdeptness.g:3392:2: 'more than'
            {
             before(grammarAccess.getXPeaksAccess().getMoreThanKeyword_2()); 
            match(input,45,FOLLOW_2); 
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
    // InternalAdeptness.g:3401:1: rule__XPeaks__Group__3 : rule__XPeaks__Group__3__Impl rule__XPeaks__Group__4 ;
    public final void rule__XPeaks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3405:1: ( rule__XPeaks__Group__3__Impl rule__XPeaks__Group__4 )
            // InternalAdeptness.g:3406:2: rule__XPeaks__Group__3__Impl rule__XPeaks__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalAdeptness.g:3413:1: rule__XPeaks__Group__3__Impl : ( ( rule__XPeaks__NPeaksAssignment_3 ) ) ;
    public final void rule__XPeaks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3417:1: ( ( ( rule__XPeaks__NPeaksAssignment_3 ) ) )
            // InternalAdeptness.g:3418:1: ( ( rule__XPeaks__NPeaksAssignment_3 ) )
            {
            // InternalAdeptness.g:3418:1: ( ( rule__XPeaks__NPeaksAssignment_3 ) )
            // InternalAdeptness.g:3419:2: ( rule__XPeaks__NPeaksAssignment_3 )
            {
             before(grammarAccess.getXPeaksAccess().getNPeaksAssignment_3()); 
            // InternalAdeptness.g:3420:2: ( rule__XPeaks__NPeaksAssignment_3 )
            // InternalAdeptness.g:3420:3: rule__XPeaks__NPeaksAssignment_3
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
    // InternalAdeptness.g:3428:1: rule__XPeaks__Group__4 : rule__XPeaks__Group__4__Impl rule__XPeaks__Group__5 ;
    public final void rule__XPeaks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3432:1: ( rule__XPeaks__Group__4__Impl rule__XPeaks__Group__5 )
            // InternalAdeptness.g:3433:2: rule__XPeaks__Group__4__Impl rule__XPeaks__Group__5
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
    // InternalAdeptness.g:3440:1: rule__XPeaks__Group__4__Impl : ( 'times within' ) ;
    public final void rule__XPeaks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3444:1: ( ( 'times within' ) )
            // InternalAdeptness.g:3445:1: ( 'times within' )
            {
            // InternalAdeptness.g:3445:1: ( 'times within' )
            // InternalAdeptness.g:3446:2: 'times within'
            {
             before(grammarAccess.getXPeaksAccess().getTimesWithinKeyword_4()); 
            match(input,46,FOLLOW_2); 
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
    // InternalAdeptness.g:3455:1: rule__XPeaks__Group__5 : rule__XPeaks__Group__5__Impl rule__XPeaks__Group__6 ;
    public final void rule__XPeaks__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3459:1: ( rule__XPeaks__Group__5__Impl rule__XPeaks__Group__6 )
            // InternalAdeptness.g:3460:2: rule__XPeaks__Group__5__Impl rule__XPeaks__Group__6
            {
            pushFollow(FOLLOW_37);
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
    // InternalAdeptness.g:3467:1: rule__XPeaks__Group__5__Impl : ( ( rule__XPeaks__TimeAssignment_5 ) ) ;
    public final void rule__XPeaks__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3471:1: ( ( ( rule__XPeaks__TimeAssignment_5 ) ) )
            // InternalAdeptness.g:3472:1: ( ( rule__XPeaks__TimeAssignment_5 ) )
            {
            // InternalAdeptness.g:3472:1: ( ( rule__XPeaks__TimeAssignment_5 ) )
            // InternalAdeptness.g:3473:2: ( rule__XPeaks__TimeAssignment_5 )
            {
             before(grammarAccess.getXPeaksAccess().getTimeAssignment_5()); 
            // InternalAdeptness.g:3474:2: ( rule__XPeaks__TimeAssignment_5 )
            // InternalAdeptness.g:3474:3: rule__XPeaks__TimeAssignment_5
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
    // InternalAdeptness.g:3482:1: rule__XPeaks__Group__6 : rule__XPeaks__Group__6__Impl ;
    public final void rule__XPeaks__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3486:1: ( rule__XPeaks__Group__6__Impl )
            // InternalAdeptness.g:3487:2: rule__XPeaks__Group__6__Impl
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
    // InternalAdeptness.g:3493:1: rule__XPeaks__Group__6__Impl : ( ( rule__XPeaks__UnitAssignment_6 ) ) ;
    public final void rule__XPeaks__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3497:1: ( ( ( rule__XPeaks__UnitAssignment_6 ) ) )
            // InternalAdeptness.g:3498:1: ( ( rule__XPeaks__UnitAssignment_6 ) )
            {
            // InternalAdeptness.g:3498:1: ( ( rule__XPeaks__UnitAssignment_6 ) )
            // InternalAdeptness.g:3499:2: ( rule__XPeaks__UnitAssignment_6 )
            {
             before(grammarAccess.getXPeaksAccess().getUnitAssignment_6()); 
            // InternalAdeptness.g:3500:2: ( rule__XPeaks__UnitAssignment_6 )
            // InternalAdeptness.g:3500:3: rule__XPeaks__UnitAssignment_6
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
    // InternalAdeptness.g:3509:1: rule__ConstDeg__Group__0 : rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1 ;
    public final void rule__ConstDeg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3513:1: ( rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1 )
            // InternalAdeptness.g:3514:2: rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1
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
    // InternalAdeptness.g:3521:1: rule__ConstDeg__Group__0__Impl : ( 'confidence is in constant degradation' ) ;
    public final void rule__ConstDeg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3525:1: ( ( 'confidence is in constant degradation' ) )
            // InternalAdeptness.g:3526:1: ( 'confidence is in constant degradation' )
            {
            // InternalAdeptness.g:3526:1: ( 'confidence is in constant degradation' )
            // InternalAdeptness.g:3527:2: 'confidence is in constant degradation'
            {
             before(grammarAccess.getConstDegAccess().getConfidenceIsInConstantDegradationKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalAdeptness.g:3536:1: rule__ConstDeg__Group__1 : rule__ConstDeg__Group__1__Impl ;
    public final void rule__ConstDeg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3540:1: ( rule__ConstDeg__Group__1__Impl )
            // InternalAdeptness.g:3541:2: rule__ConstDeg__Group__1__Impl
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
    // InternalAdeptness.g:3547:1: rule__ConstDeg__Group__1__Impl : ( ( rule__ConstDeg__CantAssignment_1 ) ) ;
    public final void rule__ConstDeg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3551:1: ( ( ( rule__ConstDeg__CantAssignment_1 ) ) )
            // InternalAdeptness.g:3552:1: ( ( rule__ConstDeg__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:3552:1: ( ( rule__ConstDeg__CantAssignment_1 ) )
            // InternalAdeptness.g:3553:2: ( rule__ConstDeg__CantAssignment_1 )
            {
             before(grammarAccess.getConstDegAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:3554:2: ( rule__ConstDeg__CantAssignment_1 )
            // InternalAdeptness.g:3554:3: rule__ConstDeg__CantAssignment_1
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
    // InternalAdeptness.g:3563:1: rule__HighTime__Group__0 : rule__HighTime__Group__0__Impl rule__HighTime__Group__1 ;
    public final void rule__HighTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3567:1: ( rule__HighTime__Group__0__Impl rule__HighTime__Group__1 )
            // InternalAdeptness.g:3568:2: rule__HighTime__Group__0__Impl rule__HighTime__Group__1
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
    // InternalAdeptness.g:3575:1: rule__HighTime__Group__0__Impl : ( 'confidence is below' ) ;
    public final void rule__HighTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3579:1: ( ( 'confidence is below' ) )
            // InternalAdeptness.g:3580:1: ( 'confidence is below' )
            {
            // InternalAdeptness.g:3580:1: ( 'confidence is below' )
            // InternalAdeptness.g:3581:2: 'confidence is below'
            {
             before(grammarAccess.getHighTimeAccess().getConfidenceIsBelowKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAdeptness.g:3590:1: rule__HighTime__Group__1 : rule__HighTime__Group__1__Impl rule__HighTime__Group__2 ;
    public final void rule__HighTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3594:1: ( rule__HighTime__Group__1__Impl rule__HighTime__Group__2 )
            // InternalAdeptness.g:3595:2: rule__HighTime__Group__1__Impl rule__HighTime__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalAdeptness.g:3602:1: rule__HighTime__Group__1__Impl : ( ( rule__HighTime__CantAssignment_1 ) ) ;
    public final void rule__HighTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3606:1: ( ( ( rule__HighTime__CantAssignment_1 ) ) )
            // InternalAdeptness.g:3607:1: ( ( rule__HighTime__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:3607:1: ( ( rule__HighTime__CantAssignment_1 ) )
            // InternalAdeptness.g:3608:2: ( rule__HighTime__CantAssignment_1 )
            {
             before(grammarAccess.getHighTimeAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:3609:2: ( rule__HighTime__CantAssignment_1 )
            // InternalAdeptness.g:3609:3: rule__HighTime__CantAssignment_1
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
    // InternalAdeptness.g:3617:1: rule__HighTime__Group__2 : rule__HighTime__Group__2__Impl rule__HighTime__Group__3 ;
    public final void rule__HighTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3621:1: ( rule__HighTime__Group__2__Impl rule__HighTime__Group__3 )
            // InternalAdeptness.g:3622:2: rule__HighTime__Group__2__Impl rule__HighTime__Group__3
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
    // InternalAdeptness.g:3629:1: rule__HighTime__Group__2__Impl : ( 'within' ) ;
    public final void rule__HighTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3633:1: ( ( 'within' ) )
            // InternalAdeptness.g:3634:1: ( 'within' )
            {
            // InternalAdeptness.g:3634:1: ( 'within' )
            // InternalAdeptness.g:3635:2: 'within'
            {
             before(grammarAccess.getHighTimeAccess().getWithinKeyword_2()); 
            match(input,48,FOLLOW_2); 
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
    // InternalAdeptness.g:3644:1: rule__HighTime__Group__3 : rule__HighTime__Group__3__Impl rule__HighTime__Group__4 ;
    public final void rule__HighTime__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3648:1: ( rule__HighTime__Group__3__Impl rule__HighTime__Group__4 )
            // InternalAdeptness.g:3649:2: rule__HighTime__Group__3__Impl rule__HighTime__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalAdeptness.g:3656:1: rule__HighTime__Group__3__Impl : ( ( rule__HighTime__TimeAssignment_3 ) ) ;
    public final void rule__HighTime__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3660:1: ( ( ( rule__HighTime__TimeAssignment_3 ) ) )
            // InternalAdeptness.g:3661:1: ( ( rule__HighTime__TimeAssignment_3 ) )
            {
            // InternalAdeptness.g:3661:1: ( ( rule__HighTime__TimeAssignment_3 ) )
            // InternalAdeptness.g:3662:2: ( rule__HighTime__TimeAssignment_3 )
            {
             before(grammarAccess.getHighTimeAccess().getTimeAssignment_3()); 
            // InternalAdeptness.g:3663:2: ( rule__HighTime__TimeAssignment_3 )
            // InternalAdeptness.g:3663:3: rule__HighTime__TimeAssignment_3
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
    // InternalAdeptness.g:3671:1: rule__HighTime__Group__4 : rule__HighTime__Group__4__Impl ;
    public final void rule__HighTime__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3675:1: ( rule__HighTime__Group__4__Impl )
            // InternalAdeptness.g:3676:2: rule__HighTime__Group__4__Impl
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
    // InternalAdeptness.g:3682:1: rule__HighTime__Group__4__Impl : ( ( rule__HighTime__UnitAssignment_4 ) ) ;
    public final void rule__HighTime__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3686:1: ( ( ( rule__HighTime__UnitAssignment_4 ) ) )
            // InternalAdeptness.g:3687:1: ( ( rule__HighTime__UnitAssignment_4 ) )
            {
            // InternalAdeptness.g:3687:1: ( ( rule__HighTime__UnitAssignment_4 ) )
            // InternalAdeptness.g:3688:2: ( rule__HighTime__UnitAssignment_4 )
            {
             before(grammarAccess.getHighTimeAccess().getUnitAssignment_4()); 
            // InternalAdeptness.g:3689:2: ( rule__HighTime__UnitAssignment_4 )
            // InternalAdeptness.g:3689:3: rule__HighTime__UnitAssignment_4
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
    // InternalAdeptness.g:3698:1: rule__HighPeak__Group__0 : rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1 ;
    public final void rule__HighPeak__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3702:1: ( rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1 )
            // InternalAdeptness.g:3703:2: rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1
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
    // InternalAdeptness.g:3710:1: rule__HighPeak__Group__0__Impl : ( 'confidence is below' ) ;
    public final void rule__HighPeak__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3714:1: ( ( 'confidence is below' ) )
            // InternalAdeptness.g:3715:1: ( 'confidence is below' )
            {
            // InternalAdeptness.g:3715:1: ( 'confidence is below' )
            // InternalAdeptness.g:3716:2: 'confidence is below'
            {
             before(grammarAccess.getHighPeakAccess().getConfidenceIsBelowKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAdeptness.g:3725:1: rule__HighPeak__Group__1 : rule__HighPeak__Group__1__Impl ;
    public final void rule__HighPeak__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3729:1: ( rule__HighPeak__Group__1__Impl )
            // InternalAdeptness.g:3730:2: rule__HighPeak__Group__1__Impl
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
    // InternalAdeptness.g:3736:1: rule__HighPeak__Group__1__Impl : ( ( rule__HighPeak__CantAssignment_1 ) ) ;
    public final void rule__HighPeak__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3740:1: ( ( ( rule__HighPeak__CantAssignment_1 ) ) )
            // InternalAdeptness.g:3741:1: ( ( rule__HighPeak__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:3741:1: ( ( rule__HighPeak__CantAssignment_1 ) )
            // InternalAdeptness.g:3742:2: ( rule__HighPeak__CantAssignment_1 )
            {
             before(grammarAccess.getHighPeakAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:3743:2: ( rule__HighPeak__CantAssignment_1 )
            // InternalAdeptness.g:3743:3: rule__HighPeak__CantAssignment_1
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
    // InternalAdeptness.g:3752:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3756:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalAdeptness.g:3757:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalAdeptness.g:3764:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__Alternatives_0 ) ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3768:1: ( ( ( rule__Reference__Alternatives_0 ) ) )
            // InternalAdeptness.g:3769:1: ( ( rule__Reference__Alternatives_0 ) )
            {
            // InternalAdeptness.g:3769:1: ( ( rule__Reference__Alternatives_0 ) )
            // InternalAdeptness.g:3770:2: ( rule__Reference__Alternatives_0 )
            {
             before(grammarAccess.getReferenceAccess().getAlternatives_0()); 
            // InternalAdeptness.g:3771:2: ( rule__Reference__Alternatives_0 )
            // InternalAdeptness.g:3771:3: rule__Reference__Alternatives_0
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
    // InternalAdeptness.g:3779:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3783:1: ( rule__Reference__Group__1__Impl )
            // InternalAdeptness.g:3784:2: rule__Reference__Group__1__Impl
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
    // InternalAdeptness.g:3790:1: rule__Reference__Group__1__Impl : ( ';' ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3794:1: ( ( ';' ) )
            // InternalAdeptness.g:3795:1: ( ';' )
            {
            // InternalAdeptness.g:3795:1: ( ';' )
            // InternalAdeptness.g:3796:2: ';'
            {
             before(grammarAccess.getReferenceAccess().getSemicolonKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalAdeptness.g:3806:1: rule__Upper__Group__0 : rule__Upper__Group__0__Impl rule__Upper__Group__1 ;
    public final void rule__Upper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3810:1: ( rule__Upper__Group__0__Impl rule__Upper__Group__1 )
            // InternalAdeptness.g:3811:2: rule__Upper__Group__0__Impl rule__Upper__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdeptness.g:3818:1: rule__Upper__Group__0__Impl : ( 'is below' ) ;
    public final void rule__Upper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3822:1: ( ( 'is below' ) )
            // InternalAdeptness.g:3823:1: ( 'is below' )
            {
            // InternalAdeptness.g:3823:1: ( 'is below' )
            // InternalAdeptness.g:3824:2: 'is below'
            {
             before(grammarAccess.getUpperAccess().getIsBelowKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalAdeptness.g:3833:1: rule__Upper__Group__1 : rule__Upper__Group__1__Impl ;
    public final void rule__Upper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3837:1: ( rule__Upper__Group__1__Impl )
            // InternalAdeptness.g:3838:2: rule__Upper__Group__1__Impl
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
    // InternalAdeptness.g:3844:1: rule__Upper__Group__1__Impl : ( ( rule__Upper__Bound_uppAssignment_1 ) ) ;
    public final void rule__Upper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3848:1: ( ( ( rule__Upper__Bound_uppAssignment_1 ) ) )
            // InternalAdeptness.g:3849:1: ( ( rule__Upper__Bound_uppAssignment_1 ) )
            {
            // InternalAdeptness.g:3849:1: ( ( rule__Upper__Bound_uppAssignment_1 ) )
            // InternalAdeptness.g:3850:2: ( rule__Upper__Bound_uppAssignment_1 )
            {
             before(grammarAccess.getUpperAccess().getBound_uppAssignment_1()); 
            // InternalAdeptness.g:3851:2: ( rule__Upper__Bound_uppAssignment_1 )
            // InternalAdeptness.g:3851:3: rule__Upper__Bound_uppAssignment_1
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
    // InternalAdeptness.g:3860:1: rule__Lower__Group__0 : rule__Lower__Group__0__Impl rule__Lower__Group__1 ;
    public final void rule__Lower__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3864:1: ( rule__Lower__Group__0__Impl rule__Lower__Group__1 )
            // InternalAdeptness.g:3865:2: rule__Lower__Group__0__Impl rule__Lower__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdeptness.g:3872:1: rule__Lower__Group__0__Impl : ( 'is above' ) ;
    public final void rule__Lower__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3876:1: ( ( 'is above' ) )
            // InternalAdeptness.g:3877:1: ( 'is above' )
            {
            // InternalAdeptness.g:3877:1: ( 'is above' )
            // InternalAdeptness.g:3878:2: 'is above'
            {
             before(grammarAccess.getLowerAccess().getIsAboveKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalAdeptness.g:3887:1: rule__Lower__Group__1 : rule__Lower__Group__1__Impl ;
    public final void rule__Lower__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3891:1: ( rule__Lower__Group__1__Impl )
            // InternalAdeptness.g:3892:2: rule__Lower__Group__1__Impl
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
    // InternalAdeptness.g:3898:1: rule__Lower__Group__1__Impl : ( ( rule__Lower__Bound_lowerAssignment_1 ) ) ;
    public final void rule__Lower__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3902:1: ( ( ( rule__Lower__Bound_lowerAssignment_1 ) ) )
            // InternalAdeptness.g:3903:1: ( ( rule__Lower__Bound_lowerAssignment_1 ) )
            {
            // InternalAdeptness.g:3903:1: ( ( rule__Lower__Bound_lowerAssignment_1 ) )
            // InternalAdeptness.g:3904:2: ( rule__Lower__Bound_lowerAssignment_1 )
            {
             before(grammarAccess.getLowerAccess().getBound_lowerAssignment_1()); 
            // InternalAdeptness.g:3905:2: ( rule__Lower__Bound_lowerAssignment_1 )
            // InternalAdeptness.g:3905:3: rule__Lower__Bound_lowerAssignment_1
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
    // InternalAdeptness.g:3914:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3918:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // InternalAdeptness.g:3919:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdeptness.g:3926:1: rule__Range__Group__0__Impl : ( 'is in range between' ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3930:1: ( ( 'is in range between' ) )
            // InternalAdeptness.g:3931:1: ( 'is in range between' )
            {
            // InternalAdeptness.g:3931:1: ( 'is in range between' )
            // InternalAdeptness.g:3932:2: 'is in range between'
            {
             before(grammarAccess.getRangeAccess().getIsInRangeBetweenKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalAdeptness.g:3941:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3945:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // InternalAdeptness.g:3946:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdeptness.g:3953:1: rule__Range__Group__1__Impl : ( ( rule__Range__Bound_lowerAssignment_1 ) ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3957:1: ( ( ( rule__Range__Bound_lowerAssignment_1 ) ) )
            // InternalAdeptness.g:3958:1: ( ( rule__Range__Bound_lowerAssignment_1 ) )
            {
            // InternalAdeptness.g:3958:1: ( ( rule__Range__Bound_lowerAssignment_1 ) )
            // InternalAdeptness.g:3959:2: ( rule__Range__Bound_lowerAssignment_1 )
            {
             before(grammarAccess.getRangeAccess().getBound_lowerAssignment_1()); 
            // InternalAdeptness.g:3960:2: ( rule__Range__Bound_lowerAssignment_1 )
            // InternalAdeptness.g:3960:3: rule__Range__Bound_lowerAssignment_1
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
    // InternalAdeptness.g:3968:1: rule__Range__Group__2 : rule__Range__Group__2__Impl rule__Range__Group__3 ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3972:1: ( rule__Range__Group__2__Impl rule__Range__Group__3 )
            // InternalAdeptness.g:3973:2: rule__Range__Group__2__Impl rule__Range__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdeptness.g:3980:1: rule__Range__Group__2__Impl : ( 'and' ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3984:1: ( ( 'and' ) )
            // InternalAdeptness.g:3985:1: ( 'and' )
            {
            // InternalAdeptness.g:3985:1: ( 'and' )
            // InternalAdeptness.g:3986:2: 'and'
            {
             before(grammarAccess.getRangeAccess().getAndKeyword_2()); 
            match(input,52,FOLLOW_2); 
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
    // InternalAdeptness.g:3995:1: rule__Range__Group__3 : rule__Range__Group__3__Impl ;
    public final void rule__Range__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3999:1: ( rule__Range__Group__3__Impl )
            // InternalAdeptness.g:4000:2: rule__Range__Group__3__Impl
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
    // InternalAdeptness.g:4006:1: rule__Range__Group__3__Impl : ( ( rule__Range__Bound_uppAssignment_3 ) ) ;
    public final void rule__Range__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4010:1: ( ( ( rule__Range__Bound_uppAssignment_3 ) ) )
            // InternalAdeptness.g:4011:1: ( ( rule__Range__Bound_uppAssignment_3 ) )
            {
            // InternalAdeptness.g:4011:1: ( ( rule__Range__Bound_uppAssignment_3 ) )
            // InternalAdeptness.g:4012:2: ( rule__Range__Bound_uppAssignment_3 )
            {
             before(grammarAccess.getRangeAccess().getBound_uppAssignment_3()); 
            // InternalAdeptness.g:4013:2: ( rule__Range__Bound_uppAssignment_3 )
            // InternalAdeptness.g:4013:3: rule__Range__Bound_uppAssignment_3
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
    // InternalAdeptness.g:4022:1: rule__Gap__Group__0 : rule__Gap__Group__0__Impl rule__Gap__Group__1 ;
    public final void rule__Gap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4026:1: ( rule__Gap__Group__0__Impl rule__Gap__Group__1 )
            // InternalAdeptness.g:4027:2: rule__Gap__Group__0__Impl rule__Gap__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdeptness.g:4034:1: rule__Gap__Group__0__Impl : ( 'not in range between' ) ;
    public final void rule__Gap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4038:1: ( ( 'not in range between' ) )
            // InternalAdeptness.g:4039:1: ( 'not in range between' )
            {
            // InternalAdeptness.g:4039:1: ( 'not in range between' )
            // InternalAdeptness.g:4040:2: 'not in range between'
            {
             before(grammarAccess.getGapAccess().getNotInRangeBetweenKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalAdeptness.g:4049:1: rule__Gap__Group__1 : rule__Gap__Group__1__Impl rule__Gap__Group__2 ;
    public final void rule__Gap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4053:1: ( rule__Gap__Group__1__Impl rule__Gap__Group__2 )
            // InternalAdeptness.g:4054:2: rule__Gap__Group__1__Impl rule__Gap__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdeptness.g:4061:1: rule__Gap__Group__1__Impl : ( ( rule__Gap__Bound_lowerAssignment_1 ) ) ;
    public final void rule__Gap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4065:1: ( ( ( rule__Gap__Bound_lowerAssignment_1 ) ) )
            // InternalAdeptness.g:4066:1: ( ( rule__Gap__Bound_lowerAssignment_1 ) )
            {
            // InternalAdeptness.g:4066:1: ( ( rule__Gap__Bound_lowerAssignment_1 ) )
            // InternalAdeptness.g:4067:2: ( rule__Gap__Bound_lowerAssignment_1 )
            {
             before(grammarAccess.getGapAccess().getBound_lowerAssignment_1()); 
            // InternalAdeptness.g:4068:2: ( rule__Gap__Bound_lowerAssignment_1 )
            // InternalAdeptness.g:4068:3: rule__Gap__Bound_lowerAssignment_1
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
    // InternalAdeptness.g:4076:1: rule__Gap__Group__2 : rule__Gap__Group__2__Impl rule__Gap__Group__3 ;
    public final void rule__Gap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4080:1: ( rule__Gap__Group__2__Impl rule__Gap__Group__3 )
            // InternalAdeptness.g:4081:2: rule__Gap__Group__2__Impl rule__Gap__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdeptness.g:4088:1: rule__Gap__Group__2__Impl : ( 'and' ) ;
    public final void rule__Gap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4092:1: ( ( 'and' ) )
            // InternalAdeptness.g:4093:1: ( 'and' )
            {
            // InternalAdeptness.g:4093:1: ( 'and' )
            // InternalAdeptness.g:4094:2: 'and'
            {
             before(grammarAccess.getGapAccess().getAndKeyword_2()); 
            match(input,52,FOLLOW_2); 
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
    // InternalAdeptness.g:4103:1: rule__Gap__Group__3 : rule__Gap__Group__3__Impl ;
    public final void rule__Gap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4107:1: ( rule__Gap__Group__3__Impl )
            // InternalAdeptness.g:4108:2: rule__Gap__Group__3__Impl
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
    // InternalAdeptness.g:4114:1: rule__Gap__Group__3__Impl : ( ( rule__Gap__Bound_uppAssignment_3 ) ) ;
    public final void rule__Gap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4118:1: ( ( ( rule__Gap__Bound_uppAssignment_3 ) ) )
            // InternalAdeptness.g:4119:1: ( ( rule__Gap__Bound_uppAssignment_3 ) )
            {
            // InternalAdeptness.g:4119:1: ( ( rule__Gap__Bound_uppAssignment_3 ) )
            // InternalAdeptness.g:4120:2: ( rule__Gap__Bound_uppAssignment_3 )
            {
             before(grammarAccess.getGapAccess().getBound_uppAssignment_3()); 
            // InternalAdeptness.g:4121:2: ( rule__Gap__Bound_uppAssignment_3 )
            // InternalAdeptness.g:4121:3: rule__Gap__Bound_uppAssignment_3
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
    // InternalAdeptness.g:4130:1: rule__D__Group__0 : rule__D__Group__0__Impl rule__D__Group__1 ;
    public final void rule__D__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4134:1: ( rule__D__Group__0__Impl rule__D__Group__1 )
            // InternalAdeptness.g:4135:2: rule__D__Group__0__Impl rule__D__Group__1
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
    // InternalAdeptness.g:4142:1: rule__D__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__D__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4146:1: ( ( ( '-' )? ) )
            // InternalAdeptness.g:4147:1: ( ( '-' )? )
            {
            // InternalAdeptness.g:4147:1: ( ( '-' )? )
            // InternalAdeptness.g:4148:2: ( '-' )?
            {
             before(grammarAccess.getDAccess().getHyphenMinusKeyword_0()); 
            // InternalAdeptness.g:4149:2: ( '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==54) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAdeptness.g:4149:3: '-'
                    {
                    match(input,54,FOLLOW_2); 

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
    // InternalAdeptness.g:4157:1: rule__D__Group__1 : rule__D__Group__1__Impl rule__D__Group__2 ;
    public final void rule__D__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4161:1: ( rule__D__Group__1__Impl rule__D__Group__2 )
            // InternalAdeptness.g:4162:2: rule__D__Group__1__Impl rule__D__Group__2
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
    // InternalAdeptness.g:4169:1: rule__D__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__D__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4173:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:4174:1: ( RULE_INT )
            {
            // InternalAdeptness.g:4174:1: ( RULE_INT )
            // InternalAdeptness.g:4175:2: RULE_INT
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
    // InternalAdeptness.g:4184:1: rule__D__Group__2 : rule__D__Group__2__Impl ;
    public final void rule__D__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4188:1: ( rule__D__Group__2__Impl )
            // InternalAdeptness.g:4189:2: rule__D__Group__2__Impl
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
    // InternalAdeptness.g:4195:1: rule__D__Group__2__Impl : ( ( rule__D__Group_2__0 )? ) ;
    public final void rule__D__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4199:1: ( ( ( rule__D__Group_2__0 )? ) )
            // InternalAdeptness.g:4200:1: ( ( rule__D__Group_2__0 )? )
            {
            // InternalAdeptness.g:4200:1: ( ( rule__D__Group_2__0 )? )
            // InternalAdeptness.g:4201:2: ( rule__D__Group_2__0 )?
            {
             before(grammarAccess.getDAccess().getGroup_2()); 
            // InternalAdeptness.g:4202:2: ( rule__D__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==23) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAdeptness.g:4202:3: rule__D__Group_2__0
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
    // InternalAdeptness.g:4211:1: rule__D__Group_2__0 : rule__D__Group_2__0__Impl rule__D__Group_2__1 ;
    public final void rule__D__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4215:1: ( rule__D__Group_2__0__Impl rule__D__Group_2__1 )
            // InternalAdeptness.g:4216:2: rule__D__Group_2__0__Impl rule__D__Group_2__1
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
    // InternalAdeptness.g:4223:1: rule__D__Group_2__0__Impl : ( '.' ) ;
    public final void rule__D__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4227:1: ( ( '.' ) )
            // InternalAdeptness.g:4228:1: ( '.' )
            {
            // InternalAdeptness.g:4228:1: ( '.' )
            // InternalAdeptness.g:4229:2: '.'
            {
             before(grammarAccess.getDAccess().getFullStopKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdeptness.g:4238:1: rule__D__Group_2__1 : rule__D__Group_2__1__Impl ;
    public final void rule__D__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4242:1: ( rule__D__Group_2__1__Impl )
            // InternalAdeptness.g:4243:2: rule__D__Group_2__1__Impl
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
    // InternalAdeptness.g:4249:1: rule__D__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__D__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4253:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:4254:1: ( RULE_INT )
            {
            // InternalAdeptness.g:4254:1: ( RULE_INT )
            // InternalAdeptness.g:4255:2: RULE_INT
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
    // InternalAdeptness.g:4265:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4269:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalAdeptness.g:4270:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
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
    // InternalAdeptness.g:4277:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4281:1: ( ( 'datatype' ) )
            // InternalAdeptness.g:4282:1: ( 'datatype' )
            {
            // InternalAdeptness.g:4282:1: ( 'datatype' )
            // InternalAdeptness.g:4283:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalAdeptness.g:4292:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4296:1: ( rule__DataType__Group__1__Impl )
            // InternalAdeptness.g:4297:2: rule__DataType__Group__1__Impl
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
    // InternalAdeptness.g:4303:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4307:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalAdeptness.g:4308:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:4308:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalAdeptness.g:4309:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:4310:2: ( rule__DataType__NameAssignment_1 )
            // InternalAdeptness.g:4310:3: rule__DataType__NameAssignment_1
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
    // InternalAdeptness.g:4319:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4323:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // InternalAdeptness.g:4324:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
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
    // InternalAdeptness.g:4331:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4335:1: ( ( 'package' ) )
            // InternalAdeptness.g:4336:1: ( 'package' )
            {
            // InternalAdeptness.g:4336:1: ( 'package' )
            // InternalAdeptness.g:4337:2: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalAdeptness.g:4346:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4350:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // InternalAdeptness.g:4351:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalAdeptness.g:4358:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4362:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // InternalAdeptness.g:4363:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:4363:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // InternalAdeptness.g:4364:2: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:4365:2: ( rule__PackageDeclaration__NameAssignment_1 )
            // InternalAdeptness.g:4365:3: rule__PackageDeclaration__NameAssignment_1
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
    // InternalAdeptness.g:4373:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4377:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // InternalAdeptness.g:4378:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalAdeptness.g:4385:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4389:1: ( ( '{' ) )
            // InternalAdeptness.g:4390:1: ( '{' )
            {
            // InternalAdeptness.g:4390:1: ( '{' )
            // InternalAdeptness.g:4391:2: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalAdeptness.g:4400:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4404:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // InternalAdeptness.g:4405:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalAdeptness.g:4412:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4416:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) )
            // InternalAdeptness.g:4417:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            {
            // InternalAdeptness.g:4417:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            // InternalAdeptness.g:4418:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 
            // InternalAdeptness.g:4419:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==21||LA33_0==24||LA33_0==32||(LA33_0>=55 && LA33_0<=56)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAdeptness.g:4419:3: rule__PackageDeclaration__ElementsAssignment_3
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
    // InternalAdeptness.g:4427:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4431:1: ( rule__PackageDeclaration__Group__4__Impl )
            // InternalAdeptness.g:4432:2: rule__PackageDeclaration__Group__4__Impl
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
    // InternalAdeptness.g:4438:1: rule__PackageDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4442:1: ( ( '}' ) )
            // InternalAdeptness.g:4443:1: ( '}' )
            {
            // InternalAdeptness.g:4443:1: ( '}' )
            // InternalAdeptness.g:4444:2: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,58,FOLLOW_2); 
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


    // $ANTLR start "rule__Variable__Group__0"
    // InternalAdeptness.g:4454:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4458:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalAdeptness.g:4459:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalAdeptness.g:4466:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4470:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalAdeptness.g:4471:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalAdeptness.g:4471:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalAdeptness.g:4472:2: ( rule__Variable__NameAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            // InternalAdeptness.g:4473:2: ( rule__Variable__NameAssignment_0 )
            // InternalAdeptness.g:4473:3: rule__Variable__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalAdeptness.g:4481:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4485:1: ( rule__Variable__Group__1__Impl )
            // InternalAdeptness.g:4486:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalAdeptness.g:4492:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__Group_1__0 )? ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4496:1: ( ( ( rule__Variable__Group_1__0 )? ) )
            // InternalAdeptness.g:4497:1: ( ( rule__Variable__Group_1__0 )? )
            {
            // InternalAdeptness.g:4497:1: ( ( rule__Variable__Group_1__0 )? )
            // InternalAdeptness.g:4498:2: ( rule__Variable__Group_1__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_1()); 
            // InternalAdeptness.g:4499:2: ( rule__Variable__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==59) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAdeptness.g:4499:3: rule__Variable__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group_1__0"
    // InternalAdeptness.g:4508:1: rule__Variable__Group_1__0 : rule__Variable__Group_1__0__Impl rule__Variable__Group_1__1 ;
    public final void rule__Variable__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4512:1: ( rule__Variable__Group_1__0__Impl rule__Variable__Group_1__1 )
            // InternalAdeptness.g:4513:2: rule__Variable__Group_1__0__Impl rule__Variable__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__Variable__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1__0"


    // $ANTLR start "rule__Variable__Group_1__0__Impl"
    // InternalAdeptness.g:4520:1: rule__Variable__Group_1__0__Impl : ( '=' ) ;
    public final void rule__Variable__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4524:1: ( ( '=' ) )
            // InternalAdeptness.g:4525:1: ( '=' )
            {
            // InternalAdeptness.g:4525:1: ( '=' )
            // InternalAdeptness.g:4526:2: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_1_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getEqualsSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1__0__Impl"


    // $ANTLR start "rule__Variable__Group_1__1"
    // InternalAdeptness.g:4535:1: rule__Variable__Group_1__1 : rule__Variable__Group_1__1__Impl ;
    public final void rule__Variable__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4539:1: ( rule__Variable__Group_1__1__Impl )
            // InternalAdeptness.g:4540:2: rule__Variable__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1__1"


    // $ANTLR start "rule__Variable__Group_1__1__Impl"
    // InternalAdeptness.g:4546:1: rule__Variable__Group_1__1__Impl : ( ( rule__Variable__ExpressionAssignment_1_1 ) ) ;
    public final void rule__Variable__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4550:1: ( ( ( rule__Variable__ExpressionAssignment_1_1 ) ) )
            // InternalAdeptness.g:4551:1: ( ( rule__Variable__ExpressionAssignment_1_1 ) )
            {
            // InternalAdeptness.g:4551:1: ( ( rule__Variable__ExpressionAssignment_1_1 ) )
            // InternalAdeptness.g:4552:2: ( rule__Variable__ExpressionAssignment_1_1 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_1_1()); 
            // InternalAdeptness.g:4553:2: ( rule__Variable__ExpressionAssignment_1_1 )
            // InternalAdeptness.g:4553:3: rule__Variable__ExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ExpressionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getExpressionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalAdeptness.g:4562:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4566:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalAdeptness.g:4567:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalAdeptness.g:4574:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4578:1: ( ( ruleAnd ) )
            // InternalAdeptness.g:4579:1: ( ruleAnd )
            {
            // InternalAdeptness.g:4579:1: ( ruleAnd )
            // InternalAdeptness.g:4580:2: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalAdeptness.g:4589:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4593:1: ( rule__Or__Group__1__Impl )
            // InternalAdeptness.g:4594:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalAdeptness.g:4600:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4604:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalAdeptness.g:4605:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalAdeptness.g:4605:1: ( ( rule__Or__Group_1__0 )* )
            // InternalAdeptness.g:4606:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalAdeptness.g:4607:2: ( rule__Or__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==60) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAdeptness.g:4607:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getOrAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalAdeptness.g:4616:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4620:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalAdeptness.g:4621:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_44);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalAdeptness.g:4628:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4632:1: ( ( () ) )
            // InternalAdeptness.g:4633:1: ( () )
            {
            // InternalAdeptness.g:4633:1: ( () )
            // InternalAdeptness.g:4634:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalAdeptness.g:4635:2: ()
            // InternalAdeptness.g:4635:3: 
            {
            }

             after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalAdeptness.g:4643:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4647:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalAdeptness.g:4648:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalAdeptness.g:4655:1: rule__Or__Group_1__1__Impl : ( '||' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4659:1: ( ( '||' ) )
            // InternalAdeptness.g:4660:1: ( '||' )
            {
            // InternalAdeptness.g:4660:1: ( '||' )
            // InternalAdeptness.g:4661:2: '||'
            {
             before(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalAdeptness.g:4670:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4674:1: ( rule__Or__Group_1__2__Impl )
            // InternalAdeptness.g:4675:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalAdeptness.g:4681:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4685:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalAdeptness.g:4686:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalAdeptness.g:4686:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalAdeptness.g:4687:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalAdeptness.g:4688:2: ( rule__Or__RightAssignment_1_2 )
            // InternalAdeptness.g:4688:3: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalAdeptness.g:4697:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4701:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalAdeptness.g:4702:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalAdeptness.g:4709:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4713:1: ( ( ruleEquality ) )
            // InternalAdeptness.g:4714:1: ( ruleEquality )
            {
            // InternalAdeptness.g:4714:1: ( ruleEquality )
            // InternalAdeptness.g:4715:2: ruleEquality
            {
             before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalAdeptness.g:4724:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4728:1: ( rule__And__Group__1__Impl )
            // InternalAdeptness.g:4729:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalAdeptness.g:4735:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4739:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalAdeptness.g:4740:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalAdeptness.g:4740:1: ( ( rule__And__Group_1__0 )* )
            // InternalAdeptness.g:4741:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalAdeptness.g:4742:2: ( rule__And__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==61) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAdeptness.g:4742:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getAndAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalAdeptness.g:4751:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4755:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalAdeptness.g:4756:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_46);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalAdeptness.g:4763:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4767:1: ( ( () ) )
            // InternalAdeptness.g:4768:1: ( () )
            {
            // InternalAdeptness.g:4768:1: ( () )
            // InternalAdeptness.g:4769:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalAdeptness.g:4770:2: ()
            // InternalAdeptness.g:4770:3: 
            {
            }

             after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalAdeptness.g:4778:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4782:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalAdeptness.g:4783:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalAdeptness.g:4790:1: rule__And__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4794:1: ( ( '&&' ) )
            // InternalAdeptness.g:4795:1: ( '&&' )
            {
            // InternalAdeptness.g:4795:1: ( '&&' )
            // InternalAdeptness.g:4796:2: '&&'
            {
             before(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalAdeptness.g:4805:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4809:1: ( rule__And__Group_1__2__Impl )
            // InternalAdeptness.g:4810:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalAdeptness.g:4816:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4820:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalAdeptness.g:4821:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalAdeptness.g:4821:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalAdeptness.g:4822:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalAdeptness.g:4823:2: ( rule__And__RightAssignment_1_2 )
            // InternalAdeptness.g:4823:3: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // InternalAdeptness.g:4832:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4836:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalAdeptness.g:4837:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // InternalAdeptness.g:4844:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4848:1: ( ( ruleComparison ) )
            // InternalAdeptness.g:4849:1: ( ruleComparison )
            {
            // InternalAdeptness.g:4849:1: ( ruleComparison )
            // InternalAdeptness.g:4850:2: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // InternalAdeptness.g:4859:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4863:1: ( rule__Equality__Group__1__Impl )
            // InternalAdeptness.g:4864:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // InternalAdeptness.g:4870:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4874:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalAdeptness.g:4875:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalAdeptness.g:4875:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalAdeptness.g:4876:2: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // InternalAdeptness.g:4877:2: ( rule__Equality__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==13) ) {
                    alt37=1;
                }
                else if ( (LA37_0==14) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalAdeptness.g:4877:3: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getEqualityAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // InternalAdeptness.g:4886:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4890:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalAdeptness.g:4891:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_48);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0"


    // $ANTLR start "rule__Equality__Group_1__0__Impl"
    // InternalAdeptness.g:4898:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4902:1: ( ( () ) )
            // InternalAdeptness.g:4903:1: ( () )
            {
            // InternalAdeptness.g:4903:1: ( () )
            // InternalAdeptness.g:4904:2: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // InternalAdeptness.g:4905:2: ()
            // InternalAdeptness.g:4905:3: 
            {
            }

             after(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // InternalAdeptness.g:4913:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4917:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // InternalAdeptness.g:4918:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1"


    // $ANTLR start "rule__Equality__Group_1__1__Impl"
    // InternalAdeptness.g:4925:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4929:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // InternalAdeptness.g:4930:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // InternalAdeptness.g:4930:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // InternalAdeptness.g:4931:2: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // InternalAdeptness.g:4932:2: ( rule__Equality__OpAssignment_1_1 )
            // InternalAdeptness.g:4932:3: rule__Equality__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Equality__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__2"
    // InternalAdeptness.g:4940:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4944:1: ( rule__Equality__Group_1__2__Impl )
            // InternalAdeptness.g:4945:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__2"


    // $ANTLR start "rule__Equality__Group_1__2__Impl"
    // InternalAdeptness.g:4951:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4955:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // InternalAdeptness.g:4956:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // InternalAdeptness.g:4956:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // InternalAdeptness.g:4957:2: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // InternalAdeptness.g:4958:2: ( rule__Equality__RightAssignment_1_2 )
            // InternalAdeptness.g:4958:3: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Equality__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalAdeptness.g:4967:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4971:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalAdeptness.g:4972:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalAdeptness.g:4979:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4983:1: ( ( rulePlusOrMinus ) )
            // InternalAdeptness.g:4984:1: ( rulePlusOrMinus )
            {
            // InternalAdeptness.g:4984:1: ( rulePlusOrMinus )
            // InternalAdeptness.g:4985:2: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalAdeptness.g:4994:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4998:1: ( rule__Comparison__Group__1__Impl )
            // InternalAdeptness.g:4999:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalAdeptness.g:5005:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5009:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalAdeptness.g:5010:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalAdeptness.g:5010:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalAdeptness.g:5011:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalAdeptness.g:5012:2: ( rule__Comparison__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    alt38=1;
                    }
                    break;
                case 16:
                    {
                    alt38=1;
                    }
                    break;
                case 17:
                    {
                    alt38=1;
                    }
                    break;
                case 18:
                    {
                    alt38=1;
                    }
                    break;

                }

                switch (alt38) {
            	case 1 :
            	    // InternalAdeptness.g:5012:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getComparisonAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // InternalAdeptness.g:5021:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5025:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalAdeptness.g:5026:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_50);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // InternalAdeptness.g:5033:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5037:1: ( ( () ) )
            // InternalAdeptness.g:5038:1: ( () )
            {
            // InternalAdeptness.g:5038:1: ( () )
            // InternalAdeptness.g:5039:2: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // InternalAdeptness.g:5040:2: ()
            // InternalAdeptness.g:5040:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // InternalAdeptness.g:5048:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5052:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // InternalAdeptness.g:5053:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // InternalAdeptness.g:5060:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5064:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // InternalAdeptness.g:5065:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // InternalAdeptness.g:5065:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // InternalAdeptness.g:5066:2: ( rule__Comparison__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            // InternalAdeptness.g:5067:2: ( rule__Comparison__OpAssignment_1_1 )
            // InternalAdeptness.g:5067:3: rule__Comparison__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__2"
    // InternalAdeptness.g:5075:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5079:1: ( rule__Comparison__Group_1__2__Impl )
            // InternalAdeptness.g:5080:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__2"


    // $ANTLR start "rule__Comparison__Group_1__2__Impl"
    // InternalAdeptness.g:5086:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5090:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // InternalAdeptness.g:5091:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // InternalAdeptness.g:5091:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // InternalAdeptness.g:5092:2: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // InternalAdeptness.g:5093:2: ( rule__Comparison__RightAssignment_1_2 )
            // InternalAdeptness.g:5093:3: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__2__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // InternalAdeptness.g:5102:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5106:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalAdeptness.g:5107:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0"


    // $ANTLR start "rule__PlusOrMinus__Group__0__Impl"
    // InternalAdeptness.g:5114:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5118:1: ( ( ruleMulOrDiv ) )
            // InternalAdeptness.g:5119:1: ( ruleMulOrDiv )
            {
            // InternalAdeptness.g:5119:1: ( ruleMulOrDiv )
            // InternalAdeptness.g:5120:2: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__1"
    // InternalAdeptness.g:5129:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5133:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalAdeptness.g:5134:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1"


    // $ANTLR start "rule__PlusOrMinus__Group__1__Impl"
    // InternalAdeptness.g:5140:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5144:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalAdeptness.g:5145:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalAdeptness.g:5145:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalAdeptness.g:5146:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // InternalAdeptness.g:5147:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==62) ) {
                    alt39=1;
                }
                else if ( (LA39_0==54) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAdeptness.g:5147:3: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0"
    // InternalAdeptness.g:5156:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5160:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalAdeptness.g:5161:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0__Impl"
    // InternalAdeptness.g:5168:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5172:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalAdeptness.g:5173:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalAdeptness.g:5173:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalAdeptness.g:5174:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // InternalAdeptness.g:5175:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalAdeptness.g:5175:3: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1"
    // InternalAdeptness.g:5183:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5187:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalAdeptness.g:5188:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1__Impl"
    // InternalAdeptness.g:5194:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5198:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalAdeptness.g:5199:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalAdeptness.g:5199:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalAdeptness.g:5200:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // InternalAdeptness.g:5201:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalAdeptness.g:5201:3: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0"
    // InternalAdeptness.g:5210:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5214:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalAdeptness.g:5215:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_54);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0__Impl"
    // InternalAdeptness.g:5222:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5226:1: ( ( () ) )
            // InternalAdeptness.g:5227:1: ( () )
            {
            // InternalAdeptness.g:5227:1: ( () )
            // InternalAdeptness.g:5228:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalAdeptness.g:5229:2: ()
            // InternalAdeptness.g:5229:3: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1"
    // InternalAdeptness.g:5237:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5241:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalAdeptness.g:5242:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1__Impl"
    // InternalAdeptness.g:5248:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5252:1: ( ( '+' ) )
            // InternalAdeptness.g:5253:1: ( '+' )
            {
            // InternalAdeptness.g:5253:1: ( '+' )
            // InternalAdeptness.g:5254:2: '+'
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0"
    // InternalAdeptness.g:5264:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5268:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalAdeptness.g:5269:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_52);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0__Impl"
    // InternalAdeptness.g:5276:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5280:1: ( ( () ) )
            // InternalAdeptness.g:5281:1: ( () )
            {
            // InternalAdeptness.g:5281:1: ( () )
            // InternalAdeptness.g:5282:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalAdeptness.g:5283:2: ()
            // InternalAdeptness.g:5283:3: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1"
    // InternalAdeptness.g:5291:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5295:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalAdeptness.g:5296:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1__Impl"
    // InternalAdeptness.g:5302:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5306:1: ( ( '-' ) )
            // InternalAdeptness.g:5307:1: ( '-' )
            {
            // InternalAdeptness.g:5307:1: ( '-' )
            // InternalAdeptness.g:5308:2: '-'
            {
             before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__0"
    // InternalAdeptness.g:5318:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5322:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalAdeptness.g:5323:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_55);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__0"


    // $ANTLR start "rule__MulOrDiv__Group__0__Impl"
    // InternalAdeptness.g:5330:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5334:1: ( ( rulePrimary ) )
            // InternalAdeptness.g:5335:1: ( rulePrimary )
            {
            // InternalAdeptness.g:5335:1: ( rulePrimary )
            // InternalAdeptness.g:5336:2: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__1"
    // InternalAdeptness.g:5345:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5349:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalAdeptness.g:5350:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__1"


    // $ANTLR start "rule__MulOrDiv__Group__1__Impl"
    // InternalAdeptness.g:5356:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5360:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalAdeptness.g:5361:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalAdeptness.g:5361:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalAdeptness.g:5362:2: ( rule__MulOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // InternalAdeptness.g:5363:2: ( rule__MulOrDiv__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==19) ) {
                    alt40=1;
                }
                else if ( (LA40_0==20) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAdeptness.g:5363:3: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_56);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getMulOrDivAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__0"
    // InternalAdeptness.g:5372:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5376:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalAdeptness.g:5377:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1__0__Impl"
    // InternalAdeptness.g:5384:1: rule__MulOrDiv__Group_1__0__Impl : ( ( rule__MulOrDiv__Group_1_0__0 ) ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5388:1: ( ( ( rule__MulOrDiv__Group_1_0__0 ) ) )
            // InternalAdeptness.g:5389:1: ( ( rule__MulOrDiv__Group_1_0__0 ) )
            {
            // InternalAdeptness.g:5389:1: ( ( rule__MulOrDiv__Group_1_0__0 ) )
            // InternalAdeptness.g:5390:2: ( rule__MulOrDiv__Group_1_0__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1_0()); 
            // InternalAdeptness.g:5391:2: ( rule__MulOrDiv__Group_1_0__0 )
            // InternalAdeptness.g:5391:3: rule__MulOrDiv__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getGroup_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__1"
    // InternalAdeptness.g:5399:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5403:1: ( rule__MulOrDiv__Group_1__1__Impl )
            // InternalAdeptness.g:5404:2: rule__MulOrDiv__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1__1__Impl"
    // InternalAdeptness.g:5410:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5414:1: ( ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) )
            // InternalAdeptness.g:5415:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            {
            // InternalAdeptness.g:5415:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            // InternalAdeptness.g:5416:2: ( rule__MulOrDiv__RightAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); 
            // InternalAdeptness.g:5417:2: ( rule__MulOrDiv__RightAssignment_1_1 )
            // InternalAdeptness.g:5417:3: rule__MulOrDiv__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0__0"
    // InternalAdeptness.g:5426:1: rule__MulOrDiv__Group_1_0__0 : rule__MulOrDiv__Group_1_0__0__Impl rule__MulOrDiv__Group_1_0__1 ;
    public final void rule__MulOrDiv__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5430:1: ( rule__MulOrDiv__Group_1_0__0__Impl rule__MulOrDiv__Group_1_0__1 )
            // InternalAdeptness.g:5431:2: rule__MulOrDiv__Group_1_0__0__Impl rule__MulOrDiv__Group_1_0__1
            {
            pushFollow(FOLLOW_55);
            rule__MulOrDiv__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0__0"


    // $ANTLR start "rule__MulOrDiv__Group_1_0__0__Impl"
    // InternalAdeptness.g:5438:1: rule__MulOrDiv__Group_1_0__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5442:1: ( ( () ) )
            // InternalAdeptness.g:5443:1: ( () )
            {
            // InternalAdeptness.g:5443:1: ( () )
            // InternalAdeptness.g:5444:2: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0_0()); 
            // InternalAdeptness.g:5445:2: ()
            // InternalAdeptness.g:5445:3: 
            {
            }

             after(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0__1"
    // InternalAdeptness.g:5453:1: rule__MulOrDiv__Group_1_0__1 : rule__MulOrDiv__Group_1_0__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5457:1: ( rule__MulOrDiv__Group_1_0__1__Impl )
            // InternalAdeptness.g:5458:2: rule__MulOrDiv__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0__1"


    // $ANTLR start "rule__MulOrDiv__Group_1_0__1__Impl"
    // InternalAdeptness.g:5464:1: rule__MulOrDiv__Group_1_0__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) ) ;
    public final void rule__MulOrDiv__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5468:1: ( ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) ) )
            // InternalAdeptness.g:5469:1: ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) )
            {
            // InternalAdeptness.g:5469:1: ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) )
            // InternalAdeptness.g:5470:2: ( rule__MulOrDiv__OpAssignment_1_0_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_0_1()); 
            // InternalAdeptness.g:5471:2: ( rule__MulOrDiv__OpAssignment_1_0_1 )
            // InternalAdeptness.g:5471:3: rule__MulOrDiv__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__OpAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalAdeptness.g:5480:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5484:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalAdeptness.g:5485:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_27);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalAdeptness.g:5492:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5496:1: ( ( '(' ) )
            // InternalAdeptness.g:5497:1: ( '(' )
            {
            // InternalAdeptness.g:5497:1: ( '(' )
            // InternalAdeptness.g:5498:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalAdeptness.g:5507:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5511:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalAdeptness.g:5512:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_57);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalAdeptness.g:5519:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5523:1: ( ( ruleExpression ) )
            // InternalAdeptness.g:5524:1: ( ruleExpression )
            {
            // InternalAdeptness.g:5524:1: ( ruleExpression )
            // InternalAdeptness.g:5525:2: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // InternalAdeptness.g:5534:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5538:1: ( rule__Primary__Group_0__2__Impl )
            // InternalAdeptness.g:5539:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // InternalAdeptness.g:5545:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5549:1: ( ( ')' ) )
            // InternalAdeptness.g:5550:1: ( ')' )
            {
            // InternalAdeptness.g:5550:1: ( ')' )
            // InternalAdeptness.g:5551:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalAdeptness.g:5561:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5565:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalAdeptness.g:5566:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_58);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalAdeptness.g:5573:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5577:1: ( ( () ) )
            // InternalAdeptness.g:5578:1: ( () )
            {
            // InternalAdeptness.g:5578:1: ( () )
            // InternalAdeptness.g:5579:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            // InternalAdeptness.g:5580:2: ()
            // InternalAdeptness.g:5580:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalAdeptness.g:5588:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5592:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalAdeptness.g:5593:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalAdeptness.g:5600:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5604:1: ( ( '!' ) )
            // InternalAdeptness.g:5605:1: ( '!' )
            {
            // InternalAdeptness.g:5605:1: ( '!' )
            // InternalAdeptness.g:5606:2: '!'
            {
             before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalAdeptness.g:5615:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5619:1: ( rule__Primary__Group_1__2__Impl )
            // InternalAdeptness.g:5620:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalAdeptness.g:5626:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5630:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // InternalAdeptness.g:5631:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // InternalAdeptness.g:5631:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // InternalAdeptness.g:5632:2: ( rule__Primary__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            // InternalAdeptness.g:5633:2: ( rule__Primary__ExpressionAssignment_1_2 )
            // InternalAdeptness.g:5633:3: rule__Primary__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // InternalAdeptness.g:5642:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5646:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalAdeptness.g:5647:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_22);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // InternalAdeptness.g:5654:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5658:1: ( ( () ) )
            // InternalAdeptness.g:5659:1: ( () )
            {
            // InternalAdeptness.g:5659:1: ( () )
            // InternalAdeptness.g:5660:2: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 
            // InternalAdeptness.g:5661:2: ()
            // InternalAdeptness.g:5661:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // InternalAdeptness.g:5669:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5673:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalAdeptness.g:5674:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // InternalAdeptness.g:5680:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5684:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalAdeptness.g:5685:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalAdeptness.g:5685:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalAdeptness.g:5686:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // InternalAdeptness.g:5687:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalAdeptness.g:5687:3: rule__Atomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_1__0"
    // InternalAdeptness.g:5696:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5700:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalAdeptness.g:5701:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // InternalAdeptness.g:5708:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5712:1: ( ( () ) )
            // InternalAdeptness.g:5713:1: ( () )
            {
            // InternalAdeptness.g:5713:1: ( () )
            // InternalAdeptness.g:5714:2: ()
            {
             before(grammarAccess.getAtomicAccess().getStringConstantAction_1_0()); 
            // InternalAdeptness.g:5715:2: ()
            // InternalAdeptness.g:5715:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getStringConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // InternalAdeptness.g:5723:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5727:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalAdeptness.g:5728:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // InternalAdeptness.g:5734:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5738:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // InternalAdeptness.g:5739:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // InternalAdeptness.g:5739:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // InternalAdeptness.g:5740:2: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // InternalAdeptness.g:5741:2: ( rule__Atomic__ValueAssignment_1_1 )
            // InternalAdeptness.g:5741:3: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // InternalAdeptness.g:5750:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5754:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalAdeptness.g:5755:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_59);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // InternalAdeptness.g:5762:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5766:1: ( ( () ) )
            // InternalAdeptness.g:5767:1: ( () )
            {
            // InternalAdeptness.g:5767:1: ( () )
            // InternalAdeptness.g:5768:2: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 
            // InternalAdeptness.g:5769:2: ()
            // InternalAdeptness.g:5769:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // InternalAdeptness.g:5777:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5781:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalAdeptness.g:5782:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // InternalAdeptness.g:5788:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5792:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalAdeptness.g:5793:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalAdeptness.g:5793:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalAdeptness.g:5794:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // InternalAdeptness.g:5795:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalAdeptness.g:5795:3: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__Adeptness__ElementsAssignment"
    // InternalAdeptness.g:5804:1: rule__Adeptness__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Adeptness__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5808:1: ( ( ruleAbstractElement ) )
            // InternalAdeptness.g:5809:2: ( ruleAbstractElement )
            {
            // InternalAdeptness.g:5809:2: ( ruleAbstractElement )
            // InternalAdeptness.g:5810:3: ruleAbstractElement
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
    // InternalAdeptness.g:5819:1: rule__Imports__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Imports__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5823:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalAdeptness.g:5824:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalAdeptness.g:5824:2: ( ruleQualifiedNameWithWildcard )
            // InternalAdeptness.g:5825:3: ruleQualifiedNameWithWildcard
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
    // InternalAdeptness.g:5834:1: rule__MonitoringFile__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MonitoringFile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5838:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:5839:2: ( RULE_ID )
            {
            // InternalAdeptness.g:5839:2: ( RULE_ID )
            // InternalAdeptness.g:5840:3: RULE_ID
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
    // InternalAdeptness.g:5849:1: rule__MonitoringFile__MonitoringPlanAssignment_3 : ( ruleMonitoringPlan ) ;
    public final void rule__MonitoringFile__MonitoringPlanAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5853:1: ( ( ruleMonitoringPlan ) )
            // InternalAdeptness.g:5854:2: ( ruleMonitoringPlan )
            {
            // InternalAdeptness.g:5854:2: ( ruleMonitoringPlan )
            // InternalAdeptness.g:5855:3: ruleMonitoringPlan
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
    // InternalAdeptness.g:5864:1: rule__MonitoringPlan__MonitoringVariablesAssignment : ( ruleMonitoringVariable ) ;
    public final void rule__MonitoringPlan__MonitoringVariablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5868:1: ( ( ruleMonitoringVariable ) )
            // InternalAdeptness.g:5869:2: ( ruleMonitoringVariable )
            {
            // InternalAdeptness.g:5869:2: ( ruleMonitoringVariable )
            // InternalAdeptness.g:5870:3: ruleMonitoringVariable
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
    // InternalAdeptness.g:5879:1: rule__MonitoringVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MonitoringVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5883:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:5884:2: ( RULE_ID )
            {
            // InternalAdeptness.g:5884:2: ( RULE_ID )
            // InternalAdeptness.g:5885:3: RULE_ID
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
    // InternalAdeptness.g:5894:1: rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 : ( ruleSig_type ) ;
    public final void rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5898:1: ( ( ruleSig_type ) )
            // InternalAdeptness.g:5899:2: ( ruleSig_type )
            {
            // InternalAdeptness.g:5899:2: ( ruleSig_type )
            // InternalAdeptness.g:5900:3: ruleSig_type
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
    // InternalAdeptness.g:5909:1: rule__MonitoringVariable__MaxAssignment_6_2 : ( ruleDOUBLE ) ;
    public final void rule__MonitoringVariable__MaxAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5913:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:5914:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:5914:2: ( ruleDOUBLE )
            // InternalAdeptness.g:5915:3: ruleDOUBLE
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
    // InternalAdeptness.g:5924:1: rule__MonitoringVariable__MinAssignment_6_5 : ( ruleDOUBLE ) ;
    public final void rule__MonitoringVariable__MinAssignment_6_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5928:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:5929:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:5929:2: ( ruleDOUBLE )
            // InternalAdeptness.g:5930:3: ruleDOUBLE
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
    // InternalAdeptness.g:5939:1: rule__Sig_type__Sig_typeAssignment_0 : ( ( 'boolean' ) ) ;
    public final void rule__Sig_type__Sig_typeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5943:1: ( ( ( 'boolean' ) ) )
            // InternalAdeptness.g:5944:2: ( ( 'boolean' ) )
            {
            // InternalAdeptness.g:5944:2: ( ( 'boolean' ) )
            // InternalAdeptness.g:5945:3: ( 'boolean' )
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeBooleanKeyword_0_0()); 
            // InternalAdeptness.g:5946:3: ( 'boolean' )
            // InternalAdeptness.g:5947:4: 'boolean'
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeBooleanKeyword_0_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalAdeptness.g:5958:1: rule__Sig_type__Sig_typeAssignment_1 : ( ( 'int' ) ) ;
    public final void rule__Sig_type__Sig_typeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5962:1: ( ( ( 'int' ) ) )
            // InternalAdeptness.g:5963:2: ( ( 'int' ) )
            {
            // InternalAdeptness.g:5963:2: ( ( 'int' ) )
            // InternalAdeptness.g:5964:3: ( 'int' )
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeIntKeyword_1_0()); 
            // InternalAdeptness.g:5965:3: ( 'int' )
            // InternalAdeptness.g:5966:4: 'int'
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeIntKeyword_1_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalAdeptness.g:5977:1: rule__Sig_type__Sig_typeAssignment_2 : ( ( 'double' ) ) ;
    public final void rule__Sig_type__Sig_typeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5981:1: ( ( ( 'double' ) ) )
            // InternalAdeptness.g:5982:2: ( ( 'double' ) )
            {
            // InternalAdeptness.g:5982:2: ( ( 'double' ) )
            // InternalAdeptness.g:5983:3: ( 'double' )
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeDoubleKeyword_2_0()); 
            // InternalAdeptness.g:5984:3: ( 'double' )
            // InternalAdeptness.g:5985:4: 'double'
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeDoubleKeyword_2_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalAdeptness.g:5996:1: rule__Signal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6000:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:6001:2: ( RULE_ID )
            {
            // InternalAdeptness.g:6001:2: ( RULE_ID )
            // InternalAdeptness.g:6002:3: RULE_ID
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
    // InternalAdeptness.g:6011:1: rule__Signal__CardinalityNumCPSAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Signal__CardinalityNumCPSAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6015:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:6016:2: ( RULE_INT )
            {
            // InternalAdeptness.g:6016:2: ( RULE_INT )
            // InternalAdeptness.g:6017:3: RULE_INT
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
    // InternalAdeptness.g:6026:1: rule__Signal__SuperTypeAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Signal__SuperTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6030:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAdeptness.g:6031:2: ( ( ruleQualifiedName ) )
            {
            // InternalAdeptness.g:6031:2: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:6032:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSignalAccess().getSuperTypeMonitoringFileCrossReference_4_1_0()); 
            // InternalAdeptness.g:6033:3: ( ruleQualifiedName )
            // InternalAdeptness.g:6034:4: ruleQualifiedName
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
    // InternalAdeptness.g:6045:1: rule__Signal__OracleAssignment_5 : ( ruleOracle ) ;
    public final void rule__Signal__OracleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6049:1: ( ( ruleOracle ) )
            // InternalAdeptness.g:6050:2: ( ruleOracle )
            {
            // InternalAdeptness.g:6050:2: ( ruleOracle )
            // InternalAdeptness.g:6051:3: ruleOracle
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
    // InternalAdeptness.g:6060:1: rule__Oracle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Oracle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6064:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:6065:2: ( RULE_ID )
            {
            // InternalAdeptness.g:6065:2: ( RULE_ID )
            // InternalAdeptness.g:6066:3: RULE_ID
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


    // $ANTLR start "rule__Oracle__WhenAssignment_3"
    // InternalAdeptness.g:6075:1: rule__Oracle__WhenAssignment_3 : ( ruleWhen ) ;
    public final void rule__Oracle__WhenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6079:1: ( ( ruleWhen ) )
            // InternalAdeptness.g:6080:2: ( ruleWhen )
            {
            // InternalAdeptness.g:6080:2: ( ruleWhen )
            // InternalAdeptness.g:6081:3: ruleWhen
            {
             before(grammarAccess.getOracleAccess().getWhenWhenParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWhen();

            state._fsp--;

             after(grammarAccess.getOracleAccess().getWhenWhenParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Oracle__WhenAssignment_3"


    // $ANTLR start "rule__Oracle__CheckAssignment_4"
    // InternalAdeptness.g:6090:1: rule__Oracle__CheckAssignment_4 : ( ruleChecks ) ;
    public final void rule__Oracle__CheckAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6094:1: ( ( ruleChecks ) )
            // InternalAdeptness.g:6095:2: ( ruleChecks )
            {
            // InternalAdeptness.g:6095:2: ( ruleChecks )
            // InternalAdeptness.g:6096:3: ruleChecks
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


    // $ANTLR start "rule__When__EmAssignment_1"
    // InternalAdeptness.g:6105:1: rule__When__EmAssignment_1 : ( ruleExpressionsModel ) ;
    public final void rule__When__EmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6109:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:6110:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:6110:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:6111:3: ruleExpressionsModel
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


    // $ANTLR start "rule__Checks__NameAssignment_1_0"
    // InternalAdeptness.g:6120:1: rule__Checks__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Checks__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6124:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:6125:2: ( RULE_ID )
            {
            // InternalAdeptness.g:6125:2: ( RULE_ID )
            // InternalAdeptness.g:6126:3: RULE_ID
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
    // InternalAdeptness.g:6135:1: rule__Checks__EmAssignment_1_1 : ( ruleExpressionsModel ) ;
    public final void rule__Checks__EmAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6139:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:6140:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:6140:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:6141:3: ruleExpressionsModel
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
    // InternalAdeptness.g:6150:1: rule__Checks__ReferenceAssignment_2 : ( ruleReference ) ;
    public final void rule__Checks__ReferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6154:1: ( ( ruleReference ) )
            // InternalAdeptness.g:6155:2: ( ruleReference )
            {
            // InternalAdeptness.g:6155:2: ( ruleReference )
            // InternalAdeptness.g:6156:3: ruleReference
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
    // InternalAdeptness.g:6165:1: rule__Checks__FailReasonAssignment_3 : ( ruleFailReason ) ;
    public final void rule__Checks__FailReasonAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6169:1: ( ( ruleFailReason ) )
            // InternalAdeptness.g:6170:2: ( ruleFailReason )
            {
            // InternalAdeptness.g:6170:2: ( ruleFailReason )
            // InternalAdeptness.g:6171:3: ruleFailReason
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
    // InternalAdeptness.g:6180:1: rule__Checks__DescriptionAssignment_4 : ( ruleDescription ) ;
    public final void rule__Checks__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6184:1: ( ( ruleDescription ) )
            // InternalAdeptness.g:6185:2: ( ruleDescription )
            {
            // InternalAdeptness.g:6185:2: ( ruleDescription )
            // InternalAdeptness.g:6186:3: ruleDescription
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
    // InternalAdeptness.g:6195:1: rule__Description__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6199:1: ( ( RULE_STRING ) )
            // InternalAdeptness.g:6200:2: ( RULE_STRING )
            {
            // InternalAdeptness.g:6200:2: ( RULE_STRING )
            // InternalAdeptness.g:6201:3: RULE_STRING
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
    // InternalAdeptness.g:6210:1: rule__FailReason__ReasonAssignment_1 : ( ruleReason ) ;
    public final void rule__FailReason__ReasonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6214:1: ( ( ruleReason ) )
            // InternalAdeptness.g:6215:2: ( ruleReason )
            {
            // InternalAdeptness.g:6215:2: ( ruleReason )
            // InternalAdeptness.g:6216:3: ruleReason
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
    // InternalAdeptness.g:6225:1: rule__Reason__HighPeakAssignment_0_0 : ( ruleHighPeak ) ;
    public final void rule__Reason__HighPeakAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6229:1: ( ( ruleHighPeak ) )
            // InternalAdeptness.g:6230:2: ( ruleHighPeak )
            {
            // InternalAdeptness.g:6230:2: ( ruleHighPeak )
            // InternalAdeptness.g:6231:3: ruleHighPeak
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
    // InternalAdeptness.g:6240:1: rule__Reason__HighTimeAssignment_0_1 : ( ruleHighTime ) ;
    public final void rule__Reason__HighTimeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6244:1: ( ( ruleHighTime ) )
            // InternalAdeptness.g:6245:2: ( ruleHighTime )
            {
            // InternalAdeptness.g:6245:2: ( ruleHighTime )
            // InternalAdeptness.g:6246:3: ruleHighTime
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
    // InternalAdeptness.g:6255:1: rule__Reason__ConstDegAssignment_0_2 : ( ruleConstDeg ) ;
    public final void rule__Reason__ConstDegAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6259:1: ( ( ruleConstDeg ) )
            // InternalAdeptness.g:6260:2: ( ruleConstDeg )
            {
            // InternalAdeptness.g:6260:2: ( ruleConstDeg )
            // InternalAdeptness.g:6261:3: ruleConstDeg
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
    // InternalAdeptness.g:6270:1: rule__Reason__XPeaksAssignment_0_3 : ( ruleXPeaks ) ;
    public final void rule__Reason__XPeaksAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6274:1: ( ( ruleXPeaks ) )
            // InternalAdeptness.g:6275:2: ( ruleXPeaks )
            {
            // InternalAdeptness.g:6275:2: ( ruleXPeaks )
            // InternalAdeptness.g:6276:3: ruleXPeaks
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
    // InternalAdeptness.g:6285:1: rule__XPeaks__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__XPeaks__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6289:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6290:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6290:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6291:3: ruleDOUBLE
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
    // InternalAdeptness.g:6300:1: rule__XPeaks__NPeaksAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__XPeaks__NPeaksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6304:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6305:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6305:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6306:3: ruleDOUBLE
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
    // InternalAdeptness.g:6315:1: rule__XPeaks__TimeAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__XPeaks__TimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6319:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6320:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6320:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6321:3: ruleDOUBLE
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
    // InternalAdeptness.g:6330:1: rule__XPeaks__UnitAssignment_6 : ( ruleTimeType ) ;
    public final void rule__XPeaks__UnitAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6334:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:6335:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:6335:2: ( ruleTimeType )
            // InternalAdeptness.g:6336:3: ruleTimeType
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
    // InternalAdeptness.g:6345:1: rule__ConstDeg__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__ConstDeg__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6349:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6350:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6350:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6351:3: ruleDOUBLE
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
    // InternalAdeptness.g:6360:1: rule__HighTime__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__HighTime__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6364:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6365:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6365:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6366:3: ruleDOUBLE
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
    // InternalAdeptness.g:6375:1: rule__HighTime__TimeAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__HighTime__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6379:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6380:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6380:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6381:3: ruleDOUBLE
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
    // InternalAdeptness.g:6390:1: rule__HighTime__UnitAssignment_4 : ( ruleTimeType ) ;
    public final void rule__HighTime__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6394:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:6395:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:6395:2: ( ruleTimeType )
            // InternalAdeptness.g:6396:3: ruleTimeType
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
    // InternalAdeptness.g:6405:1: rule__HighPeak__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__HighPeak__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6409:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6410:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6410:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6411:3: ruleDOUBLE
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
    // InternalAdeptness.g:6420:1: rule__Reference__UpperAssignment_0_0 : ( ruleUpper ) ;
    public final void rule__Reference__UpperAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6424:1: ( ( ruleUpper ) )
            // InternalAdeptness.g:6425:2: ( ruleUpper )
            {
            // InternalAdeptness.g:6425:2: ( ruleUpper )
            // InternalAdeptness.g:6426:3: ruleUpper
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
    // InternalAdeptness.g:6435:1: rule__Reference__LowerAssignment_0_1 : ( ruleLower ) ;
    public final void rule__Reference__LowerAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6439:1: ( ( ruleLower ) )
            // InternalAdeptness.g:6440:2: ( ruleLower )
            {
            // InternalAdeptness.g:6440:2: ( ruleLower )
            // InternalAdeptness.g:6441:3: ruleLower
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
    // InternalAdeptness.g:6450:1: rule__Reference__RangeAssignment_0_2 : ( ruleRange ) ;
    public final void rule__Reference__RangeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6454:1: ( ( ruleRange ) )
            // InternalAdeptness.g:6455:2: ( ruleRange )
            {
            // InternalAdeptness.g:6455:2: ( ruleRange )
            // InternalAdeptness.g:6456:3: ruleRange
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
    // InternalAdeptness.g:6465:1: rule__Reference__GapAssignment_0_3 : ( ruleGap ) ;
    public final void rule__Reference__GapAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6469:1: ( ( ruleGap ) )
            // InternalAdeptness.g:6470:2: ( ruleGap )
            {
            // InternalAdeptness.g:6470:2: ( ruleGap )
            // InternalAdeptness.g:6471:3: ruleGap
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
    // InternalAdeptness.g:6480:1: rule__Upper__Bound_uppAssignment_1 : ( ruleBound_up ) ;
    public final void rule__Upper__Bound_uppAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6484:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:6485:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:6485:2: ( ruleBound_up )
            // InternalAdeptness.g:6486:3: ruleBound_up
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
    // InternalAdeptness.g:6495:1: rule__Lower__Bound_lowerAssignment_1 : ( ruleBound_Down ) ;
    public final void rule__Lower__Bound_lowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6499:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:6500:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:6500:2: ( ruleBound_Down )
            // InternalAdeptness.g:6501:3: ruleBound_Down
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
    // InternalAdeptness.g:6510:1: rule__Range__Bound_lowerAssignment_1 : ( ruleBound_Down ) ;
    public final void rule__Range__Bound_lowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6514:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:6515:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:6515:2: ( ruleBound_Down )
            // InternalAdeptness.g:6516:3: ruleBound_Down
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
    // InternalAdeptness.g:6525:1: rule__Range__Bound_uppAssignment_3 : ( ruleBound_up ) ;
    public final void rule__Range__Bound_uppAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6529:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:6530:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:6530:2: ( ruleBound_up )
            // InternalAdeptness.g:6531:3: ruleBound_up
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
    // InternalAdeptness.g:6540:1: rule__Gap__Bound_lowerAssignment_1 : ( ruleBound_Down ) ;
    public final void rule__Gap__Bound_lowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6544:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:6545:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:6545:2: ( ruleBound_Down )
            // InternalAdeptness.g:6546:3: ruleBound_Down
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
    // InternalAdeptness.g:6555:1: rule__Gap__Bound_uppAssignment_3 : ( ruleBound_up ) ;
    public final void rule__Gap__Bound_uppAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6559:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:6560:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:6560:2: ( ruleBound_up )
            // InternalAdeptness.g:6561:3: ruleBound_up
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
    // InternalAdeptness.g:6570:1: rule__Bound_up__ValueAssignment_0 : ( ruleDOUBLE ) ;
    public final void rule__Bound_up__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6574:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6575:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6575:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6576:3: ruleDOUBLE
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


    // $ANTLR start "rule__Bound_up__VariableAssignment_1"
    // InternalAdeptness.g:6585:1: rule__Bound_up__VariableAssignment_1 : ( ruleVariable ) ;
    public final void rule__Bound_up__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6589:1: ( ( ruleVariable ) )
            // InternalAdeptness.g:6590:2: ( ruleVariable )
            {
            // InternalAdeptness.g:6590:2: ( ruleVariable )
            // InternalAdeptness.g:6591:3: ruleVariable
            {
             before(grammarAccess.getBound_upAccess().getVariableVariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getBound_upAccess().getVariableVariableParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_up__VariableAssignment_1"


    // $ANTLR start "rule__Bound_up__EmAssignment_2"
    // InternalAdeptness.g:6600:1: rule__Bound_up__EmAssignment_2 : ( ruleExpressionsModel ) ;
    public final void rule__Bound_up__EmAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6604:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:6605:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:6605:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:6606:3: ruleExpressionsModel
            {
             before(grammarAccess.getBound_upAccess().getEmExpressionsModelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionsModel();

            state._fsp--;

             after(grammarAccess.getBound_upAccess().getEmExpressionsModelParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_up__EmAssignment_2"


    // $ANTLR start "rule__Bound_Down__ValueAssignment_0"
    // InternalAdeptness.g:6615:1: rule__Bound_Down__ValueAssignment_0 : ( ruleDOUBLE ) ;
    public final void rule__Bound_Down__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6619:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6620:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6620:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6621:3: ruleDOUBLE
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


    // $ANTLR start "rule__Bound_Down__VariableAssignment_1"
    // InternalAdeptness.g:6630:1: rule__Bound_Down__VariableAssignment_1 : ( ruleVariable ) ;
    public final void rule__Bound_Down__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6634:1: ( ( ruleVariable ) )
            // InternalAdeptness.g:6635:2: ( ruleVariable )
            {
            // InternalAdeptness.g:6635:2: ( ruleVariable )
            // InternalAdeptness.g:6636:3: ruleVariable
            {
             before(grammarAccess.getBound_DownAccess().getVariableVariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getBound_DownAccess().getVariableVariableParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_Down__VariableAssignment_1"


    // $ANTLR start "rule__Bound_Down__EmAssignment_2"
    // InternalAdeptness.g:6645:1: rule__Bound_Down__EmAssignment_2 : ( ruleExpressionsModel ) ;
    public final void rule__Bound_Down__EmAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6649:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:6650:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:6650:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:6651:3: ruleExpressionsModel
            {
             before(grammarAccess.getBound_DownAccess().getEmExpressionsModelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionsModel();

            state._fsp--;

             after(grammarAccess.getBound_DownAccess().getEmExpressionsModelParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_Down__EmAssignment_2"


    // $ANTLR start "rule__BOOLEAN__BoolAssignment"
    // InternalAdeptness.g:6660:1: rule__BOOLEAN__BoolAssignment : ( ruleb ) ;
    public final void rule__BOOLEAN__BoolAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6664:1: ( ( ruleb ) )
            // InternalAdeptness.g:6665:2: ( ruleb )
            {
            // InternalAdeptness.g:6665:2: ( ruleb )
            // InternalAdeptness.g:6666:3: ruleb
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
    // InternalAdeptness.g:6675:1: rule__DOUBLE__DValAssignment : ( ruled ) ;
    public final void rule__DOUBLE__DValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6679:1: ( ( ruled ) )
            // InternalAdeptness.g:6680:2: ( ruled )
            {
            // InternalAdeptness.g:6680:2: ( ruled )
            // InternalAdeptness.g:6681:3: ruled
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
    // InternalAdeptness.g:6690:1: rule__TimeType__TimeAssignment_0 : ( ( 'miliseconds' ) ) ;
    public final void rule__TimeType__TimeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6694:1: ( ( ( 'miliseconds' ) ) )
            // InternalAdeptness.g:6695:2: ( ( 'miliseconds' ) )
            {
            // InternalAdeptness.g:6695:2: ( ( 'miliseconds' ) )
            // InternalAdeptness.g:6696:3: ( 'miliseconds' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMilisecondsKeyword_0_0()); 
            // InternalAdeptness.g:6697:3: ( 'miliseconds' )
            // InternalAdeptness.g:6698:4: 'miliseconds'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMilisecondsKeyword_0_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalAdeptness.g:6709:1: rule__TimeType__TimeAssignment_1 : ( ( 'seconds' ) ) ;
    public final void rule__TimeType__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6713:1: ( ( ( 'seconds' ) ) )
            // InternalAdeptness.g:6714:2: ( ( 'seconds' ) )
            {
            // InternalAdeptness.g:6714:2: ( ( 'seconds' ) )
            // InternalAdeptness.g:6715:3: ( 'seconds' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeSecondsKeyword_1_0()); 
            // InternalAdeptness.g:6716:3: ( 'seconds' )
            // InternalAdeptness.g:6717:4: 'seconds'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeSecondsKeyword_1_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalAdeptness.g:6728:1: rule__TimeType__TimeAssignment_2 : ( ( 'minutes' ) ) ;
    public final void rule__TimeType__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6732:1: ( ( ( 'minutes' ) ) )
            // InternalAdeptness.g:6733:2: ( ( 'minutes' ) )
            {
            // InternalAdeptness.g:6733:2: ( ( 'minutes' ) )
            // InternalAdeptness.g:6734:3: ( 'minutes' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMinutesKeyword_2_0()); 
            // InternalAdeptness.g:6735:3: ( 'minutes' )
            // InternalAdeptness.g:6736:4: 'minutes'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMinutesKeyword_2_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalAdeptness.g:6747:1: rule__TimeType__TimeAssignment_3 : ( ( 'hours' ) ) ;
    public final void rule__TimeType__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6751:1: ( ( ( 'hours' ) ) )
            // InternalAdeptness.g:6752:2: ( ( 'hours' ) )
            {
            // InternalAdeptness.g:6752:2: ( ( 'hours' ) )
            // InternalAdeptness.g:6753:3: ( 'hours' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeHoursKeyword_3_0()); 
            // InternalAdeptness.g:6754:3: ( 'hours' )
            // InternalAdeptness.g:6755:4: 'hours'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeHoursKeyword_3_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalAdeptness.g:6766:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6770:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:6771:2: ( RULE_ID )
            {
            // InternalAdeptness.g:6771:2: ( RULE_ID )
            // InternalAdeptness.g:6772:3: RULE_ID
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
    // InternalAdeptness.g:6781:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6785:1: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:6786:2: ( ruleQualifiedName )
            {
            // InternalAdeptness.g:6786:2: ( ruleQualifiedName )
            // InternalAdeptness.g:6787:3: ruleQualifiedName
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
    // InternalAdeptness.g:6796:1: rule__PackageDeclaration__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6800:1: ( ( ruleAbstractElement ) )
            // InternalAdeptness.g:6801:2: ( ruleAbstractElement )
            {
            // InternalAdeptness.g:6801:2: ( ruleAbstractElement )
            // InternalAdeptness.g:6802:3: ruleAbstractElement
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
    // InternalAdeptness.g:6811:1: rule__ExpressionsModel__ElementsAssignment : ( ruleAbstractElement2 ) ;
    public final void rule__ExpressionsModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6815:1: ( ( ruleAbstractElement2 ) )
            // InternalAdeptness.g:6816:2: ( ruleAbstractElement2 )
            {
            // InternalAdeptness.g:6816:2: ( ruleAbstractElement2 )
            // InternalAdeptness.g:6817:3: ruleAbstractElement2
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


    // $ANTLR start "rule__Variable__NameAssignment_0"
    // InternalAdeptness.g:6826:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6830:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:6831:2: ( RULE_ID )
            {
            // InternalAdeptness.g:6831:2: ( RULE_ID )
            // InternalAdeptness.g:6832:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_0"


    // $ANTLR start "rule__Variable__ExpressionAssignment_1_1"
    // InternalAdeptness.g:6841:1: rule__Variable__ExpressionAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__Variable__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6845:1: ( ( ruleExpression ) )
            // InternalAdeptness.g:6846:2: ( ruleExpression )
            {
            // InternalAdeptness.g:6846:2: ( ruleExpression )
            // InternalAdeptness.g:6847:3: ruleExpression
            {
             before(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ExpressionAssignment_1_1"


    // $ANTLR start "rule__EvalExpression__ExpressionAssignment"
    // InternalAdeptness.g:6856:1: rule__EvalExpression__ExpressionAssignment : ( ruleExpression ) ;
    public final void rule__EvalExpression__ExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6860:1: ( ( ruleExpression ) )
            // InternalAdeptness.g:6861:2: ( ruleExpression )
            {
            // InternalAdeptness.g:6861:2: ( ruleExpression )
            // InternalAdeptness.g:6862:3: ruleExpression
            {
             before(grammarAccess.getEvalExpressionAccess().getExpressionExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getEvalExpressionAccess().getExpressionExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvalExpression__ExpressionAssignment"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalAdeptness.g:6871:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6875:1: ( ( ruleAnd ) )
            // InternalAdeptness.g:6876:2: ( ruleAnd )
            {
            // InternalAdeptness.g:6876:2: ( ruleAnd )
            // InternalAdeptness.g:6877:3: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // InternalAdeptness.g:6886:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6890:1: ( ( ruleEquality ) )
            // InternalAdeptness.g:6891:2: ( ruleEquality )
            {
            // InternalAdeptness.g:6891:2: ( ruleEquality )
            // InternalAdeptness.g:6892:3: ruleEquality
            {
             before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Equality__OpAssignment_1_1"
    // InternalAdeptness.g:6901:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6905:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // InternalAdeptness.g:6906:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // InternalAdeptness.g:6906:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // InternalAdeptness.g:6907:3: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // InternalAdeptness.g:6908:3: ( rule__Equality__OpAlternatives_1_1_0 )
            // InternalAdeptness.g:6908:4: rule__Equality__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__OpAssignment_1_1"


    // $ANTLR start "rule__Equality__RightAssignment_1_2"
    // InternalAdeptness.g:6916:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6920:1: ( ( ruleComparison ) )
            // InternalAdeptness.g:6921:2: ( ruleComparison )
            {
            // InternalAdeptness.g:6921:2: ( ruleComparison )
            // InternalAdeptness.g:6922:3: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__RightAssignment_1_2"


    // $ANTLR start "rule__Comparison__OpAssignment_1_1"
    // InternalAdeptness.g:6931:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6935:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // InternalAdeptness.g:6936:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // InternalAdeptness.g:6936:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // InternalAdeptness.g:6937:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            // InternalAdeptness.g:6938:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            // InternalAdeptness.g:6938:4: rule__Comparison__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__OpAssignment_1_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_2"
    // InternalAdeptness.g:6946:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6950:1: ( ( rulePlusOrMinus ) )
            // InternalAdeptness.g:6951:2: ( rulePlusOrMinus )
            {
            // InternalAdeptness.g:6951:2: ( rulePlusOrMinus )
            // InternalAdeptness.g:6952:3: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightAssignment_1_2"


    // $ANTLR start "rule__PlusOrMinus__RightAssignment_1_1"
    // InternalAdeptness.g:6961:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6965:1: ( ( ruleMulOrDiv ) )
            // InternalAdeptness.g:6966:2: ( ruleMulOrDiv )
            {
            // InternalAdeptness.g:6966:2: ( ruleMulOrDiv )
            // InternalAdeptness.g:6967:3: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__RightAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__OpAssignment_1_0_1"
    // InternalAdeptness.g:6976:1: rule__MulOrDiv__OpAssignment_1_0_1 : ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6980:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) ) )
            // InternalAdeptness.g:6981:2: ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) )
            {
            // InternalAdeptness.g:6981:2: ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) )
            // InternalAdeptness.g:6982:3: ( rule__MulOrDiv__OpAlternatives_1_0_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_0_1_0()); 
            // InternalAdeptness.g:6983:3: ( rule__MulOrDiv__OpAlternatives_1_0_1_0 )
            // InternalAdeptness.g:6983:4: rule__MulOrDiv__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__OpAlternatives_1_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__OpAssignment_1_0_1"


    // $ANTLR start "rule__MulOrDiv__RightAssignment_1_1"
    // InternalAdeptness.g:6991:1: rule__MulOrDiv__RightAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6995:1: ( ( rulePrimary ) )
            // InternalAdeptness.g:6996:2: ( rulePrimary )
            {
            // InternalAdeptness.g:6996:2: ( rulePrimary )
            // InternalAdeptness.g:6997:3: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__RightAssignment_1_1"


    // $ANTLR start "rule__Primary__ExpressionAssignment_1_2"
    // InternalAdeptness.g:7006:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7010:1: ( ( rulePrimary ) )
            // InternalAdeptness.g:7011:2: ( rulePrimary )
            {
            // InternalAdeptness.g:7011:2: ( rulePrimary )
            // InternalAdeptness.g:7012:3: rulePrimary
            {
             before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionAssignment_1_2"


    // $ANTLR start "rule__Atomic__ValueAssignment_0_1"
    // InternalAdeptness.g:7021:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7025:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:7026:2: ( RULE_INT )
            {
            // InternalAdeptness.g:7026:2: ( RULE_INT )
            // InternalAdeptness.g:7027:3: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_0_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_1_1"
    // InternalAdeptness.g:7036:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7040:1: ( ( RULE_STRING ) )
            // InternalAdeptness.g:7041:2: ( RULE_STRING )
            {
            // InternalAdeptness.g:7041:2: ( RULE_STRING )
            // InternalAdeptness.g:7042:3: RULE_STRING
            {
             before(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_2_1"
    // InternalAdeptness.g:7051:1: rule__Atomic__ValueAssignment_2_1 : ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7055:1: ( ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) )
            // InternalAdeptness.g:7056:2: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            {
            // InternalAdeptness.g:7056:2: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            // InternalAdeptness.g:7057:3: ( rule__Atomic__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 
            // InternalAdeptness.g:7058:3: ( rule__Atomic__ValueAlternatives_2_1_0 )
            // InternalAdeptness.g:7058:4: rule__Atomic__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_2_1"


    // $ANTLR start "rule__Atomic__VariableAssignment_3"
    // InternalAdeptness.g:7066:1: rule__Atomic__VariableAssignment_3 : ( ruleVariable ) ;
    public final void rule__Atomic__VariableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7070:1: ( ( ruleVariable ) )
            // InternalAdeptness.g:7071:2: ( ruleVariable )
            {
            // InternalAdeptness.g:7071:2: ( ruleVariable )
            // InternalAdeptness.g:7072:3: ruleVariable
            {
             before(grammarAccess.getAtomicAccess().getVariableVariableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getAtomicAccess().getVariableVariableParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__VariableAssignment_3"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\54\1\5\1\uffff\1\5\1\27\1\5\3\uffff\1\53";
    static final String dfa_3s = "\1\57\1\66\1\uffff\1\5\1\60\1\5\3\uffff\1\60";
    static final String dfa_4s = "\2\uffff\1\3\3\uffff\1\1\1\2\1\4\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2",
            "\1\4\60\uffff\1\3",
            "",
            "\1\4",
            "\1\5\23\uffff\1\6\1\uffff\1\10\2\uffff\1\7",
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

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1354:1: rule__Reason__Alternatives_0 : ( ( ( rule__Reason__HighPeakAssignment_0_0 ) ) | ( ( rule__Reason__HighTimeAssignment_0_1 ) ) | ( ( rule__Reason__ConstDegAssignment_0_2 ) ) | ( ( rule__Reason__XPeaksAssignment_0_3 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0180000101200002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x8000000000001872L,0x0000000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0040000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000402000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x8000000000001870L,0x0000000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x002E000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000900000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x8040000000001870L,0x0000000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0580000101200000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x4040000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x4040000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000001800L});

}