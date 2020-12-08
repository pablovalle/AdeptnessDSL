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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'^'", "'import'", "'.*'", "'.'", "'MONITORINGPLAN'", "':'", "'ENDMONITORINGPLAN'", "'MONITOR'", "'type'", "'ENDMONITOR'", "'max'", "'min'", "'CPS'", "'ENDCPS'", "'['", "']'", "'implements'", "'ORACLE'", "'ENDORACLE'", "'when:'", "'checks:'", "'Description: '", "'fails if :'", "';'", "'confidence is below'", "'more than'", "'times within'", "'confidence is in constant degradation'", "'within'", "'is below'", "'is above'", "'is in range between'", "'and'", "'not in range between'", "'-'", "'datatype'", "'package'", "'{'", "'}'", "'='", "'||'", "'&&'", "'+'", "'('", "')'", "'!'", "'boolean'", "'int'", "'double'", "'miliseconds'", "'seconds'", "'minutes'", "'hours'"
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

                if ( (LA1_0==22||LA1_0==25||LA1_0==33||(LA1_0>=56 && LA1_0<=57)) ) {
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

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)||(LA2_0>=11 && LA2_0<=12)||LA2_0==64||LA2_0==66) ) {
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
            case 57:
                {
                alt3=1;
                }
                break;
            case 25:
            case 33:
            case 56:
                {
                alt3=2;
                }
                break;
            case 22:
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
            case 56:
                {
                alt4=1;
                }
                break;
            case 33:
                {
                alt4=2;
                }
                break;
            case 25:
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
            case 67:
                {
                alt5=1;
                }
                break;
            case 68:
                {
                alt5=2;
                }
                break;
            case 69:
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
            else if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_STRING)||(LA6_0>=11 && LA6_0<=12)||(LA6_0>=50 && LA6_0<=52)||LA6_0==54||LA6_0==64||LA6_0==66) ) {
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
            case 50:
                {
                alt8=1;
                }
                break;
            case 51:
                {
                alt8=2;
                }
                break;
            case 52:
                {
                alt8=3;
                }
                break;
            case 54:
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
            case 55:
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
            case 44:
            case 64:
            case 66:
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
            case 55:
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
            case 44:
            case 53:
            case 64:
            case 66:
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
            case 70:
                {
                alt12=1;
                }
                break;
            case 71:
                {
                alt12=2;
                }
                break;
            case 72:
                {
                alt12=3;
                }
                break;
            case 73:
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
            else if ( ((LA13_0>=RULE_INT && LA13_0<=RULE_STRING)||(LA13_0>=11 && LA13_0<=12)||LA13_0==64||LA13_0==66) ) {
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

            if ( (LA16_0==63) ) {
                alt16=1;
            }
            else if ( (LA16_0==55) ) {
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
    // InternalAdeptness.g:1624:1: rule__MulOrDiv__OpAlternatives_1_0_1_0 : ( ( '*' ) | ( '/' ) | ( '^' ) );
    public final void rule__MulOrDiv__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1628:1: ( ( '*' ) | ( '/' ) | ( '^' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt17=1;
                }
                break;
            case 20:
                {
                alt17=2;
                }
                break;
            case 21:
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
                case 3 :
                    // InternalAdeptness.g:1641:2: ( '^' )
                    {
                    // InternalAdeptness.g:1641:2: ( '^' )
                    // InternalAdeptness.g:1642:3: '^'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpCircumflexAccentKeyword_1_0_1_0_2()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpCircumflexAccentKeyword_1_0_1_0_2()); 

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
    // InternalAdeptness.g:1651:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1655:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt18=1;
                }
                break;
            case 66:
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
                    // InternalAdeptness.g:1656:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalAdeptness.g:1656:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalAdeptness.g:1657:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalAdeptness.g:1658:3: ( rule__Primary__Group_0__0 )
                    // InternalAdeptness.g:1658:4: rule__Primary__Group_0__0
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
                    // InternalAdeptness.g:1662:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalAdeptness.g:1662:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalAdeptness.g:1663:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalAdeptness.g:1664:3: ( rule__Primary__Group_1__0 )
                    // InternalAdeptness.g:1664:4: rule__Primary__Group_1__0
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
                    // InternalAdeptness.g:1668:2: ( ruleAtomic )
                    {
                    // InternalAdeptness.g:1668:2: ( ruleAtomic )
                    // InternalAdeptness.g:1669:3: ruleAtomic
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
    // InternalAdeptness.g:1678:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__VariableAssignment_3 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1682:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__VariableAssignment_3 ) ) )
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
                    // InternalAdeptness.g:1683:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalAdeptness.g:1683:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalAdeptness.g:1684:3: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // InternalAdeptness.g:1685:3: ( rule__Atomic__Group_0__0 )
                    // InternalAdeptness.g:1685:4: rule__Atomic__Group_0__0
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
                    // InternalAdeptness.g:1689:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalAdeptness.g:1689:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalAdeptness.g:1690:3: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // InternalAdeptness.g:1691:3: ( rule__Atomic__Group_1__0 )
                    // InternalAdeptness.g:1691:4: rule__Atomic__Group_1__0
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
                    // InternalAdeptness.g:1695:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalAdeptness.g:1695:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalAdeptness.g:1696:3: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // InternalAdeptness.g:1697:3: ( rule__Atomic__Group_2__0 )
                    // InternalAdeptness.g:1697:4: rule__Atomic__Group_2__0
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
                    // InternalAdeptness.g:1701:2: ( ( rule__Atomic__VariableAssignment_3 ) )
                    {
                    // InternalAdeptness.g:1701:2: ( ( rule__Atomic__VariableAssignment_3 ) )
                    // InternalAdeptness.g:1702:3: ( rule__Atomic__VariableAssignment_3 )
                    {
                     before(grammarAccess.getAtomicAccess().getVariableAssignment_3()); 
                    // InternalAdeptness.g:1703:3: ( rule__Atomic__VariableAssignment_3 )
                    // InternalAdeptness.g:1703:4: rule__Atomic__VariableAssignment_3
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
    // InternalAdeptness.g:1711:1: rule__Atomic__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1715:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalAdeptness.g:1716:2: ( 'true' )
                    {
                    // InternalAdeptness.g:1716:2: ( 'true' )
                    // InternalAdeptness.g:1717:3: 'true'
                    {
                     before(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1722:2: ( 'false' )
                    {
                    // InternalAdeptness.g:1722:2: ( 'false' )
                    // InternalAdeptness.g:1723:3: 'false'
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
    // InternalAdeptness.g:1732:1: rule__Imports__Group__0 : rule__Imports__Group__0__Impl rule__Imports__Group__1 ;
    public final void rule__Imports__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1736:1: ( rule__Imports__Group__0__Impl rule__Imports__Group__1 )
            // InternalAdeptness.g:1737:2: rule__Imports__Group__0__Impl rule__Imports__Group__1
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
    // InternalAdeptness.g:1744:1: rule__Imports__Group__0__Impl : ( 'import' ) ;
    public final void rule__Imports__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1748:1: ( ( 'import' ) )
            // InternalAdeptness.g:1749:1: ( 'import' )
            {
            // InternalAdeptness.g:1749:1: ( 'import' )
            // InternalAdeptness.g:1750:2: 'import'
            {
             before(grammarAccess.getImportsAccess().getImportKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdeptness.g:1759:1: rule__Imports__Group__1 : rule__Imports__Group__1__Impl ;
    public final void rule__Imports__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1763:1: ( rule__Imports__Group__1__Impl )
            // InternalAdeptness.g:1764:2: rule__Imports__Group__1__Impl
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
    // InternalAdeptness.g:1770:1: rule__Imports__Group__1__Impl : ( ( rule__Imports__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Imports__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1774:1: ( ( ( rule__Imports__ImportedNamespaceAssignment_1 ) ) )
            // InternalAdeptness.g:1775:1: ( ( rule__Imports__ImportedNamespaceAssignment_1 ) )
            {
            // InternalAdeptness.g:1775:1: ( ( rule__Imports__ImportedNamespaceAssignment_1 ) )
            // InternalAdeptness.g:1776:2: ( rule__Imports__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportsAccess().getImportedNamespaceAssignment_1()); 
            // InternalAdeptness.g:1777:2: ( rule__Imports__ImportedNamespaceAssignment_1 )
            // InternalAdeptness.g:1777:3: rule__Imports__ImportedNamespaceAssignment_1
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
    // InternalAdeptness.g:1786:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1790:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalAdeptness.g:1791:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalAdeptness.g:1798:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1802:1: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:1803:1: ( ruleQualifiedName )
            {
            // InternalAdeptness.g:1803:1: ( ruleQualifiedName )
            // InternalAdeptness.g:1804:2: ruleQualifiedName
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
    // InternalAdeptness.g:1813:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1817:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalAdeptness.g:1818:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalAdeptness.g:1824:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1828:1: ( ( ( '.*' )? ) )
            // InternalAdeptness.g:1829:1: ( ( '.*' )? )
            {
            // InternalAdeptness.g:1829:1: ( ( '.*' )? )
            // InternalAdeptness.g:1830:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalAdeptness.g:1831:2: ( '.*' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAdeptness.g:1831:3: '.*'
                    {
                    match(input,23,FOLLOW_2); 

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
    // InternalAdeptness.g:1840:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1844:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAdeptness.g:1845:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalAdeptness.g:1852:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1856:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:1857:1: ( RULE_ID )
            {
            // InternalAdeptness.g:1857:1: ( RULE_ID )
            // InternalAdeptness.g:1858:2: RULE_ID
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
    // InternalAdeptness.g:1867:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1871:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAdeptness.g:1872:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAdeptness.g:1878:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1882:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAdeptness.g:1883:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAdeptness.g:1883:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAdeptness.g:1884:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAdeptness.g:1885:2: ( rule__QualifiedName__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==24) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAdeptness.g:1885:3: rule__QualifiedName__Group_1__0
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
    // InternalAdeptness.g:1894:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1898:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAdeptness.g:1899:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalAdeptness.g:1906:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1910:1: ( ( '.' ) )
            // InternalAdeptness.g:1911:1: ( '.' )
            {
            // InternalAdeptness.g:1911:1: ( '.' )
            // InternalAdeptness.g:1912:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAdeptness.g:1921:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1925:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAdeptness.g:1926:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAdeptness.g:1932:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1936:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:1937:1: ( RULE_ID )
            {
            // InternalAdeptness.g:1937:1: ( RULE_ID )
            // InternalAdeptness.g:1938:2: RULE_ID
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
    // InternalAdeptness.g:1948:1: rule__MonitoringFile__Group__0 : rule__MonitoringFile__Group__0__Impl rule__MonitoringFile__Group__1 ;
    public final void rule__MonitoringFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1952:1: ( rule__MonitoringFile__Group__0__Impl rule__MonitoringFile__Group__1 )
            // InternalAdeptness.g:1953:2: rule__MonitoringFile__Group__0__Impl rule__MonitoringFile__Group__1
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
    // InternalAdeptness.g:1960:1: rule__MonitoringFile__Group__0__Impl : ( 'MONITORINGPLAN' ) ;
    public final void rule__MonitoringFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1964:1: ( ( 'MONITORINGPLAN' ) )
            // InternalAdeptness.g:1965:1: ( 'MONITORINGPLAN' )
            {
            // InternalAdeptness.g:1965:1: ( 'MONITORINGPLAN' )
            // InternalAdeptness.g:1966:2: 'MONITORINGPLAN'
            {
             before(grammarAccess.getMonitoringFileAccess().getMONITORINGPLANKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAdeptness.g:1975:1: rule__MonitoringFile__Group__1 : rule__MonitoringFile__Group__1__Impl rule__MonitoringFile__Group__2 ;
    public final void rule__MonitoringFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1979:1: ( rule__MonitoringFile__Group__1__Impl rule__MonitoringFile__Group__2 )
            // InternalAdeptness.g:1980:2: rule__MonitoringFile__Group__1__Impl rule__MonitoringFile__Group__2
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
    // InternalAdeptness.g:1987:1: rule__MonitoringFile__Group__1__Impl : ( ( rule__MonitoringFile__NameAssignment_1 ) ) ;
    public final void rule__MonitoringFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1991:1: ( ( ( rule__MonitoringFile__NameAssignment_1 ) ) )
            // InternalAdeptness.g:1992:1: ( ( rule__MonitoringFile__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:1992:1: ( ( rule__MonitoringFile__NameAssignment_1 ) )
            // InternalAdeptness.g:1993:2: ( rule__MonitoringFile__NameAssignment_1 )
            {
             before(grammarAccess.getMonitoringFileAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:1994:2: ( rule__MonitoringFile__NameAssignment_1 )
            // InternalAdeptness.g:1994:3: rule__MonitoringFile__NameAssignment_1
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
    // InternalAdeptness.g:2002:1: rule__MonitoringFile__Group__2 : rule__MonitoringFile__Group__2__Impl rule__MonitoringFile__Group__3 ;
    public final void rule__MonitoringFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2006:1: ( rule__MonitoringFile__Group__2__Impl rule__MonitoringFile__Group__3 )
            // InternalAdeptness.g:2007:2: rule__MonitoringFile__Group__2__Impl rule__MonitoringFile__Group__3
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
    // InternalAdeptness.g:2014:1: rule__MonitoringFile__Group__2__Impl : ( ':' ) ;
    public final void rule__MonitoringFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2018:1: ( ( ':' ) )
            // InternalAdeptness.g:2019:1: ( ':' )
            {
            // InternalAdeptness.g:2019:1: ( ':' )
            // InternalAdeptness.g:2020:2: ':'
            {
             before(grammarAccess.getMonitoringFileAccess().getColonKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAdeptness.g:2029:1: rule__MonitoringFile__Group__3 : rule__MonitoringFile__Group__3__Impl rule__MonitoringFile__Group__4 ;
    public final void rule__MonitoringFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2033:1: ( rule__MonitoringFile__Group__3__Impl rule__MonitoringFile__Group__4 )
            // InternalAdeptness.g:2034:2: rule__MonitoringFile__Group__3__Impl rule__MonitoringFile__Group__4
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
    // InternalAdeptness.g:2041:1: rule__MonitoringFile__Group__3__Impl : ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) ) ;
    public final void rule__MonitoringFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2045:1: ( ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) ) )
            // InternalAdeptness.g:2046:1: ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) )
            {
            // InternalAdeptness.g:2046:1: ( ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* ) )
            // InternalAdeptness.g:2047:2: ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) ) ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* )
            {
            // InternalAdeptness.g:2047:2: ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 ) )
            // InternalAdeptness.g:2048:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )
            {
             before(grammarAccess.getMonitoringFileAccess().getMonitoringPlanAssignment_3()); 
            // InternalAdeptness.g:2049:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )
            // InternalAdeptness.g:2049:4: rule__MonitoringFile__MonitoringPlanAssignment_3
            {
            pushFollow(FOLLOW_12);
            rule__MonitoringFile__MonitoringPlanAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMonitoringFileAccess().getMonitoringPlanAssignment_3()); 

            }

            // InternalAdeptness.g:2052:2: ( ( rule__MonitoringFile__MonitoringPlanAssignment_3 )* )
            // InternalAdeptness.g:2053:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )*
            {
             before(grammarAccess.getMonitoringFileAccess().getMonitoringPlanAssignment_3()); 
            // InternalAdeptness.g:2054:3: ( rule__MonitoringFile__MonitoringPlanAssignment_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==28) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAdeptness.g:2054:4: rule__MonitoringFile__MonitoringPlanAssignment_3
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
    // InternalAdeptness.g:2063:1: rule__MonitoringFile__Group__4 : rule__MonitoringFile__Group__4__Impl ;
    public final void rule__MonitoringFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2067:1: ( rule__MonitoringFile__Group__4__Impl )
            // InternalAdeptness.g:2068:2: rule__MonitoringFile__Group__4__Impl
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
    // InternalAdeptness.g:2074:1: rule__MonitoringFile__Group__4__Impl : ( 'ENDMONITORINGPLAN' ) ;
    public final void rule__MonitoringFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2078:1: ( ( 'ENDMONITORINGPLAN' ) )
            // InternalAdeptness.g:2079:1: ( 'ENDMONITORINGPLAN' )
            {
            // InternalAdeptness.g:2079:1: ( 'ENDMONITORINGPLAN' )
            // InternalAdeptness.g:2080:2: 'ENDMONITORINGPLAN'
            {
             before(grammarAccess.getMonitoringFileAccess().getENDMONITORINGPLANKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAdeptness.g:2090:1: rule__MonitoringVariable__Group__0 : rule__MonitoringVariable__Group__0__Impl rule__MonitoringVariable__Group__1 ;
    public final void rule__MonitoringVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2094:1: ( rule__MonitoringVariable__Group__0__Impl rule__MonitoringVariable__Group__1 )
            // InternalAdeptness.g:2095:2: rule__MonitoringVariable__Group__0__Impl rule__MonitoringVariable__Group__1
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
    // InternalAdeptness.g:2102:1: rule__MonitoringVariable__Group__0__Impl : ( 'MONITOR' ) ;
    public final void rule__MonitoringVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2106:1: ( ( 'MONITOR' ) )
            // InternalAdeptness.g:2107:1: ( 'MONITOR' )
            {
            // InternalAdeptness.g:2107:1: ( 'MONITOR' )
            // InternalAdeptness.g:2108:2: 'MONITOR'
            {
             before(grammarAccess.getMonitoringVariableAccess().getMONITORKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAdeptness.g:2117:1: rule__MonitoringVariable__Group__1 : rule__MonitoringVariable__Group__1__Impl rule__MonitoringVariable__Group__2 ;
    public final void rule__MonitoringVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2121:1: ( rule__MonitoringVariable__Group__1__Impl rule__MonitoringVariable__Group__2 )
            // InternalAdeptness.g:2122:2: rule__MonitoringVariable__Group__1__Impl rule__MonitoringVariable__Group__2
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
    // InternalAdeptness.g:2129:1: rule__MonitoringVariable__Group__1__Impl : ( ( rule__MonitoringVariable__NameAssignment_1 ) ) ;
    public final void rule__MonitoringVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2133:1: ( ( ( rule__MonitoringVariable__NameAssignment_1 ) ) )
            // InternalAdeptness.g:2134:1: ( ( rule__MonitoringVariable__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:2134:1: ( ( rule__MonitoringVariable__NameAssignment_1 ) )
            // InternalAdeptness.g:2135:2: ( rule__MonitoringVariable__NameAssignment_1 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:2136:2: ( rule__MonitoringVariable__NameAssignment_1 )
            // InternalAdeptness.g:2136:3: rule__MonitoringVariable__NameAssignment_1
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
    // InternalAdeptness.g:2144:1: rule__MonitoringVariable__Group__2 : rule__MonitoringVariable__Group__2__Impl rule__MonitoringVariable__Group__3 ;
    public final void rule__MonitoringVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2148:1: ( rule__MonitoringVariable__Group__2__Impl rule__MonitoringVariable__Group__3 )
            // InternalAdeptness.g:2149:2: rule__MonitoringVariable__Group__2__Impl rule__MonitoringVariable__Group__3
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
    // InternalAdeptness.g:2156:1: rule__MonitoringVariable__Group__2__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2160:1: ( ( ':' ) )
            // InternalAdeptness.g:2161:1: ( ':' )
            {
            // InternalAdeptness.g:2161:1: ( ':' )
            // InternalAdeptness.g:2162:2: ':'
            {
             before(grammarAccess.getMonitoringVariableAccess().getColonKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAdeptness.g:2171:1: rule__MonitoringVariable__Group__3 : rule__MonitoringVariable__Group__3__Impl rule__MonitoringVariable__Group__4 ;
    public final void rule__MonitoringVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2175:1: ( rule__MonitoringVariable__Group__3__Impl rule__MonitoringVariable__Group__4 )
            // InternalAdeptness.g:2176:2: rule__MonitoringVariable__Group__3__Impl rule__MonitoringVariable__Group__4
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
    // InternalAdeptness.g:2183:1: rule__MonitoringVariable__Group__3__Impl : ( 'type' ) ;
    public final void rule__MonitoringVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2187:1: ( ( 'type' ) )
            // InternalAdeptness.g:2188:1: ( 'type' )
            {
            // InternalAdeptness.g:2188:1: ( 'type' )
            // InternalAdeptness.g:2189:2: 'type'
            {
             before(grammarAccess.getMonitoringVariableAccess().getTypeKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalAdeptness.g:2198:1: rule__MonitoringVariable__Group__4 : rule__MonitoringVariable__Group__4__Impl rule__MonitoringVariable__Group__5 ;
    public final void rule__MonitoringVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2202:1: ( rule__MonitoringVariable__Group__4__Impl rule__MonitoringVariable__Group__5 )
            // InternalAdeptness.g:2203:2: rule__MonitoringVariable__Group__4__Impl rule__MonitoringVariable__Group__5
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
    // InternalAdeptness.g:2210:1: rule__MonitoringVariable__Group__4__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2214:1: ( ( ':' ) )
            // InternalAdeptness.g:2215:1: ( ':' )
            {
            // InternalAdeptness.g:2215:1: ( ':' )
            // InternalAdeptness.g:2216:2: ':'
            {
             before(grammarAccess.getMonitoringVariableAccess().getColonKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAdeptness.g:2225:1: rule__MonitoringVariable__Group__5 : rule__MonitoringVariable__Group__5__Impl rule__MonitoringVariable__Group__6 ;
    public final void rule__MonitoringVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2229:1: ( rule__MonitoringVariable__Group__5__Impl rule__MonitoringVariable__Group__6 )
            // InternalAdeptness.g:2230:2: rule__MonitoringVariable__Group__5__Impl rule__MonitoringVariable__Group__6
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
    // InternalAdeptness.g:2237:1: rule__MonitoringVariable__Group__5__Impl : ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) ) ;
    public final void rule__MonitoringVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2241:1: ( ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) ) )
            // InternalAdeptness.g:2242:1: ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) )
            {
            // InternalAdeptness.g:2242:1: ( ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 ) )
            // InternalAdeptness.g:2243:2: ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getMonitoringVariableDatatypeAssignment_5()); 
            // InternalAdeptness.g:2244:2: ( rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 )
            // InternalAdeptness.g:2244:3: rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5
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
    // InternalAdeptness.g:2252:1: rule__MonitoringVariable__Group__6 : rule__MonitoringVariable__Group__6__Impl rule__MonitoringVariable__Group__7 ;
    public final void rule__MonitoringVariable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2256:1: ( rule__MonitoringVariable__Group__6__Impl rule__MonitoringVariable__Group__7 )
            // InternalAdeptness.g:2257:2: rule__MonitoringVariable__Group__6__Impl rule__MonitoringVariable__Group__7
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
    // InternalAdeptness.g:2264:1: rule__MonitoringVariable__Group__6__Impl : ( ( rule__MonitoringVariable__Group_6__0 )? ) ;
    public final void rule__MonitoringVariable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2268:1: ( ( ( rule__MonitoringVariable__Group_6__0 )? ) )
            // InternalAdeptness.g:2269:1: ( ( rule__MonitoringVariable__Group_6__0 )? )
            {
            // InternalAdeptness.g:2269:1: ( ( rule__MonitoringVariable__Group_6__0 )? )
            // InternalAdeptness.g:2270:2: ( rule__MonitoringVariable__Group_6__0 )?
            {
             before(grammarAccess.getMonitoringVariableAccess().getGroup_6()); 
            // InternalAdeptness.g:2271:2: ( rule__MonitoringVariable__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAdeptness.g:2271:3: rule__MonitoringVariable__Group_6__0
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
    // InternalAdeptness.g:2279:1: rule__MonitoringVariable__Group__7 : rule__MonitoringVariable__Group__7__Impl ;
    public final void rule__MonitoringVariable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2283:1: ( rule__MonitoringVariable__Group__7__Impl )
            // InternalAdeptness.g:2284:2: rule__MonitoringVariable__Group__7__Impl
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
    // InternalAdeptness.g:2290:1: rule__MonitoringVariable__Group__7__Impl : ( 'ENDMONITOR' ) ;
    public final void rule__MonitoringVariable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2294:1: ( ( 'ENDMONITOR' ) )
            // InternalAdeptness.g:2295:1: ( 'ENDMONITOR' )
            {
            // InternalAdeptness.g:2295:1: ( 'ENDMONITOR' )
            // InternalAdeptness.g:2296:2: 'ENDMONITOR'
            {
             before(grammarAccess.getMonitoringVariableAccess().getENDMONITORKeyword_7()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAdeptness.g:2306:1: rule__MonitoringVariable__Group_6__0 : rule__MonitoringVariable__Group_6__0__Impl rule__MonitoringVariable__Group_6__1 ;
    public final void rule__MonitoringVariable__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2310:1: ( rule__MonitoringVariable__Group_6__0__Impl rule__MonitoringVariable__Group_6__1 )
            // InternalAdeptness.g:2311:2: rule__MonitoringVariable__Group_6__0__Impl rule__MonitoringVariable__Group_6__1
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
    // InternalAdeptness.g:2318:1: rule__MonitoringVariable__Group_6__0__Impl : ( 'max' ) ;
    public final void rule__MonitoringVariable__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2322:1: ( ( 'max' ) )
            // InternalAdeptness.g:2323:1: ( 'max' )
            {
            // InternalAdeptness.g:2323:1: ( 'max' )
            // InternalAdeptness.g:2324:2: 'max'
            {
             before(grammarAccess.getMonitoringVariableAccess().getMaxKeyword_6_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAdeptness.g:2333:1: rule__MonitoringVariable__Group_6__1 : rule__MonitoringVariable__Group_6__1__Impl rule__MonitoringVariable__Group_6__2 ;
    public final void rule__MonitoringVariable__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2337:1: ( rule__MonitoringVariable__Group_6__1__Impl rule__MonitoringVariable__Group_6__2 )
            // InternalAdeptness.g:2338:2: rule__MonitoringVariable__Group_6__1__Impl rule__MonitoringVariable__Group_6__2
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
    // InternalAdeptness.g:2345:1: rule__MonitoringVariable__Group_6__1__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2349:1: ( ( ':' ) )
            // InternalAdeptness.g:2350:1: ( ':' )
            {
            // InternalAdeptness.g:2350:1: ( ':' )
            // InternalAdeptness.g:2351:2: ':'
            {
             before(grammarAccess.getMonitoringVariableAccess().getColonKeyword_6_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAdeptness.g:2360:1: rule__MonitoringVariable__Group_6__2 : rule__MonitoringVariable__Group_6__2__Impl rule__MonitoringVariable__Group_6__3 ;
    public final void rule__MonitoringVariable__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2364:1: ( rule__MonitoringVariable__Group_6__2__Impl rule__MonitoringVariable__Group_6__3 )
            // InternalAdeptness.g:2365:2: rule__MonitoringVariable__Group_6__2__Impl rule__MonitoringVariable__Group_6__3
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
    // InternalAdeptness.g:2372:1: rule__MonitoringVariable__Group_6__2__Impl : ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) ) ;
    public final void rule__MonitoringVariable__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2376:1: ( ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) ) )
            // InternalAdeptness.g:2377:1: ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) )
            {
            // InternalAdeptness.g:2377:1: ( ( rule__MonitoringVariable__MaxAssignment_6_2 ) )
            // InternalAdeptness.g:2378:2: ( rule__MonitoringVariable__MaxAssignment_6_2 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getMaxAssignment_6_2()); 
            // InternalAdeptness.g:2379:2: ( rule__MonitoringVariable__MaxAssignment_6_2 )
            // InternalAdeptness.g:2379:3: rule__MonitoringVariable__MaxAssignment_6_2
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
    // InternalAdeptness.g:2387:1: rule__MonitoringVariable__Group_6__3 : rule__MonitoringVariable__Group_6__3__Impl rule__MonitoringVariable__Group_6__4 ;
    public final void rule__MonitoringVariable__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2391:1: ( rule__MonitoringVariable__Group_6__3__Impl rule__MonitoringVariable__Group_6__4 )
            // InternalAdeptness.g:2392:2: rule__MonitoringVariable__Group_6__3__Impl rule__MonitoringVariable__Group_6__4
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
    // InternalAdeptness.g:2399:1: rule__MonitoringVariable__Group_6__3__Impl : ( 'min' ) ;
    public final void rule__MonitoringVariable__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2403:1: ( ( 'min' ) )
            // InternalAdeptness.g:2404:1: ( 'min' )
            {
            // InternalAdeptness.g:2404:1: ( 'min' )
            // InternalAdeptness.g:2405:2: 'min'
            {
             before(grammarAccess.getMonitoringVariableAccess().getMinKeyword_6_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalAdeptness.g:2414:1: rule__MonitoringVariable__Group_6__4 : rule__MonitoringVariable__Group_6__4__Impl rule__MonitoringVariable__Group_6__5 ;
    public final void rule__MonitoringVariable__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2418:1: ( rule__MonitoringVariable__Group_6__4__Impl rule__MonitoringVariable__Group_6__5 )
            // InternalAdeptness.g:2419:2: rule__MonitoringVariable__Group_6__4__Impl rule__MonitoringVariable__Group_6__5
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
    // InternalAdeptness.g:2426:1: rule__MonitoringVariable__Group_6__4__Impl : ( ':' ) ;
    public final void rule__MonitoringVariable__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2430:1: ( ( ':' ) )
            // InternalAdeptness.g:2431:1: ( ':' )
            {
            // InternalAdeptness.g:2431:1: ( ':' )
            // InternalAdeptness.g:2432:2: ':'
            {
             before(grammarAccess.getMonitoringVariableAccess().getColonKeyword_6_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAdeptness.g:2441:1: rule__MonitoringVariable__Group_6__5 : rule__MonitoringVariable__Group_6__5__Impl ;
    public final void rule__MonitoringVariable__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2445:1: ( rule__MonitoringVariable__Group_6__5__Impl )
            // InternalAdeptness.g:2446:2: rule__MonitoringVariable__Group_6__5__Impl
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
    // InternalAdeptness.g:2452:1: rule__MonitoringVariable__Group_6__5__Impl : ( ( rule__MonitoringVariable__MinAssignment_6_5 ) ) ;
    public final void rule__MonitoringVariable__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2456:1: ( ( ( rule__MonitoringVariable__MinAssignment_6_5 ) ) )
            // InternalAdeptness.g:2457:1: ( ( rule__MonitoringVariable__MinAssignment_6_5 ) )
            {
            // InternalAdeptness.g:2457:1: ( ( rule__MonitoringVariable__MinAssignment_6_5 ) )
            // InternalAdeptness.g:2458:2: ( rule__MonitoringVariable__MinAssignment_6_5 )
            {
             before(grammarAccess.getMonitoringVariableAccess().getMinAssignment_6_5()); 
            // InternalAdeptness.g:2459:2: ( rule__MonitoringVariable__MinAssignment_6_5 )
            // InternalAdeptness.g:2459:3: rule__MonitoringVariable__MinAssignment_6_5
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
    // InternalAdeptness.g:2468:1: rule__Signal__Group__0 : rule__Signal__Group__0__Impl rule__Signal__Group__1 ;
    public final void rule__Signal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2472:1: ( rule__Signal__Group__0__Impl rule__Signal__Group__1 )
            // InternalAdeptness.g:2473:2: rule__Signal__Group__0__Impl rule__Signal__Group__1
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
    // InternalAdeptness.g:2480:1: rule__Signal__Group__0__Impl : ( 'CPS' ) ;
    public final void rule__Signal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2484:1: ( ( 'CPS' ) )
            // InternalAdeptness.g:2485:1: ( 'CPS' )
            {
            // InternalAdeptness.g:2485:1: ( 'CPS' )
            // InternalAdeptness.g:2486:2: 'CPS'
            {
             before(grammarAccess.getSignalAccess().getCPSKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalAdeptness.g:2495:1: rule__Signal__Group__1 : rule__Signal__Group__1__Impl rule__Signal__Group__2 ;
    public final void rule__Signal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2499:1: ( rule__Signal__Group__1__Impl rule__Signal__Group__2 )
            // InternalAdeptness.g:2500:2: rule__Signal__Group__1__Impl rule__Signal__Group__2
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
    // InternalAdeptness.g:2507:1: rule__Signal__Group__1__Impl : ( ( rule__Signal__NameAssignment_1 ) ) ;
    public final void rule__Signal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2511:1: ( ( ( rule__Signal__NameAssignment_1 ) ) )
            // InternalAdeptness.g:2512:1: ( ( rule__Signal__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:2512:1: ( ( rule__Signal__NameAssignment_1 ) )
            // InternalAdeptness.g:2513:2: ( rule__Signal__NameAssignment_1 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:2514:2: ( rule__Signal__NameAssignment_1 )
            // InternalAdeptness.g:2514:3: rule__Signal__NameAssignment_1
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
    // InternalAdeptness.g:2522:1: rule__Signal__Group__2 : rule__Signal__Group__2__Impl rule__Signal__Group__3 ;
    public final void rule__Signal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2526:1: ( rule__Signal__Group__2__Impl rule__Signal__Group__3 )
            // InternalAdeptness.g:2527:2: rule__Signal__Group__2__Impl rule__Signal__Group__3
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
    // InternalAdeptness.g:2534:1: rule__Signal__Group__2__Impl : ( ( rule__Signal__Group_2__0 )? ) ;
    public final void rule__Signal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2538:1: ( ( ( rule__Signal__Group_2__0 )? ) )
            // InternalAdeptness.g:2539:1: ( ( rule__Signal__Group_2__0 )? )
            {
            // InternalAdeptness.g:2539:1: ( ( rule__Signal__Group_2__0 )? )
            // InternalAdeptness.g:2540:2: ( rule__Signal__Group_2__0 )?
            {
             before(grammarAccess.getSignalAccess().getGroup_2()); 
            // InternalAdeptness.g:2541:2: ( rule__Signal__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAdeptness.g:2541:3: rule__Signal__Group_2__0
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
    // InternalAdeptness.g:2549:1: rule__Signal__Group__3 : rule__Signal__Group__3__Impl rule__Signal__Group__4 ;
    public final void rule__Signal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2553:1: ( rule__Signal__Group__3__Impl rule__Signal__Group__4 )
            // InternalAdeptness.g:2554:2: rule__Signal__Group__3__Impl rule__Signal__Group__4
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
    // InternalAdeptness.g:2561:1: rule__Signal__Group__3__Impl : ( ':' ) ;
    public final void rule__Signal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2565:1: ( ( ':' ) )
            // InternalAdeptness.g:2566:1: ( ':' )
            {
            // InternalAdeptness.g:2566:1: ( ':' )
            // InternalAdeptness.g:2567:2: ':'
            {
             before(grammarAccess.getSignalAccess().getColonKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAdeptness.g:2576:1: rule__Signal__Group__4 : rule__Signal__Group__4__Impl rule__Signal__Group__5 ;
    public final void rule__Signal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2580:1: ( rule__Signal__Group__4__Impl rule__Signal__Group__5 )
            // InternalAdeptness.g:2581:2: rule__Signal__Group__4__Impl rule__Signal__Group__5
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
    // InternalAdeptness.g:2588:1: rule__Signal__Group__4__Impl : ( ( rule__Signal__Group_4__0 )? ) ;
    public final void rule__Signal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2592:1: ( ( ( rule__Signal__Group_4__0 )? ) )
            // InternalAdeptness.g:2593:1: ( ( rule__Signal__Group_4__0 )? )
            {
            // InternalAdeptness.g:2593:1: ( ( rule__Signal__Group_4__0 )? )
            // InternalAdeptness.g:2594:2: ( rule__Signal__Group_4__0 )?
            {
             before(grammarAccess.getSignalAccess().getGroup_4()); 
            // InternalAdeptness.g:2595:2: ( rule__Signal__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAdeptness.g:2595:3: rule__Signal__Group_4__0
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
    // InternalAdeptness.g:2603:1: rule__Signal__Group__5 : rule__Signal__Group__5__Impl rule__Signal__Group__6 ;
    public final void rule__Signal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2607:1: ( rule__Signal__Group__5__Impl rule__Signal__Group__6 )
            // InternalAdeptness.g:2608:2: rule__Signal__Group__5__Impl rule__Signal__Group__6
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
    // InternalAdeptness.g:2615:1: rule__Signal__Group__5__Impl : ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) ) ;
    public final void rule__Signal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2619:1: ( ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) ) )
            // InternalAdeptness.g:2620:1: ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) )
            {
            // InternalAdeptness.g:2620:1: ( ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* ) )
            // InternalAdeptness.g:2621:2: ( ( rule__Signal__OracleAssignment_5 ) ) ( ( rule__Signal__OracleAssignment_5 )* )
            {
            // InternalAdeptness.g:2621:2: ( ( rule__Signal__OracleAssignment_5 ) )
            // InternalAdeptness.g:2622:3: ( rule__Signal__OracleAssignment_5 )
            {
             before(grammarAccess.getSignalAccess().getOracleAssignment_5()); 
            // InternalAdeptness.g:2623:3: ( rule__Signal__OracleAssignment_5 )
            // InternalAdeptness.g:2623:4: rule__Signal__OracleAssignment_5
            {
            pushFollow(FOLLOW_21);
            rule__Signal__OracleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getOracleAssignment_5()); 

            }

            // InternalAdeptness.g:2626:2: ( ( rule__Signal__OracleAssignment_5 )* )
            // InternalAdeptness.g:2627:3: ( rule__Signal__OracleAssignment_5 )*
            {
             before(grammarAccess.getSignalAccess().getOracleAssignment_5()); 
            // InternalAdeptness.g:2628:3: ( rule__Signal__OracleAssignment_5 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==38) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAdeptness.g:2628:4: rule__Signal__OracleAssignment_5
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
    // InternalAdeptness.g:2637:1: rule__Signal__Group__6 : rule__Signal__Group__6__Impl ;
    public final void rule__Signal__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2641:1: ( rule__Signal__Group__6__Impl )
            // InternalAdeptness.g:2642:2: rule__Signal__Group__6__Impl
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
    // InternalAdeptness.g:2648:1: rule__Signal__Group__6__Impl : ( 'ENDCPS' ) ;
    public final void rule__Signal__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2652:1: ( ( 'ENDCPS' ) )
            // InternalAdeptness.g:2653:1: ( 'ENDCPS' )
            {
            // InternalAdeptness.g:2653:1: ( 'ENDCPS' )
            // InternalAdeptness.g:2654:2: 'ENDCPS'
            {
             before(grammarAccess.getSignalAccess().getENDCPSKeyword_6()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdeptness.g:2664:1: rule__Signal__Group_2__0 : rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1 ;
    public final void rule__Signal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2668:1: ( rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1 )
            // InternalAdeptness.g:2669:2: rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1
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
    // InternalAdeptness.g:2676:1: rule__Signal__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Signal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2680:1: ( ( '[' ) )
            // InternalAdeptness.g:2681:1: ( '[' )
            {
            // InternalAdeptness.g:2681:1: ( '[' )
            // InternalAdeptness.g:2682:2: '['
            {
             before(grammarAccess.getSignalAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdeptness.g:2691:1: rule__Signal__Group_2__1 : rule__Signal__Group_2__1__Impl rule__Signal__Group_2__2 ;
    public final void rule__Signal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2695:1: ( rule__Signal__Group_2__1__Impl rule__Signal__Group_2__2 )
            // InternalAdeptness.g:2696:2: rule__Signal__Group_2__1__Impl rule__Signal__Group_2__2
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
    // InternalAdeptness.g:2703:1: rule__Signal__Group_2__1__Impl : ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) ) ;
    public final void rule__Signal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2707:1: ( ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) ) )
            // InternalAdeptness.g:2708:1: ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) )
            {
            // InternalAdeptness.g:2708:1: ( ( rule__Signal__CardinalityNumCPSAssignment_2_1 ) )
            // InternalAdeptness.g:2709:2: ( rule__Signal__CardinalityNumCPSAssignment_2_1 )
            {
             before(grammarAccess.getSignalAccess().getCardinalityNumCPSAssignment_2_1()); 
            // InternalAdeptness.g:2710:2: ( rule__Signal__CardinalityNumCPSAssignment_2_1 )
            // InternalAdeptness.g:2710:3: rule__Signal__CardinalityNumCPSAssignment_2_1
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
    // InternalAdeptness.g:2718:1: rule__Signal__Group_2__2 : rule__Signal__Group_2__2__Impl ;
    public final void rule__Signal__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2722:1: ( rule__Signal__Group_2__2__Impl )
            // InternalAdeptness.g:2723:2: rule__Signal__Group_2__2__Impl
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
    // InternalAdeptness.g:2729:1: rule__Signal__Group_2__2__Impl : ( ']' ) ;
    public final void rule__Signal__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2733:1: ( ( ']' ) )
            // InternalAdeptness.g:2734:1: ( ']' )
            {
            // InternalAdeptness.g:2734:1: ( ']' )
            // InternalAdeptness.g:2735:2: ']'
            {
             before(grammarAccess.getSignalAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdeptness.g:2745:1: rule__Signal__Group_4__0 : rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1 ;
    public final void rule__Signal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2749:1: ( rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1 )
            // InternalAdeptness.g:2750:2: rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1
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
    // InternalAdeptness.g:2757:1: rule__Signal__Group_4__0__Impl : ( 'implements' ) ;
    public final void rule__Signal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2761:1: ( ( 'implements' ) )
            // InternalAdeptness.g:2762:1: ( 'implements' )
            {
            // InternalAdeptness.g:2762:1: ( 'implements' )
            // InternalAdeptness.g:2763:2: 'implements'
            {
             before(grammarAccess.getSignalAccess().getImplementsKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdeptness.g:2772:1: rule__Signal__Group_4__1 : rule__Signal__Group_4__1__Impl ;
    public final void rule__Signal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2776:1: ( rule__Signal__Group_4__1__Impl )
            // InternalAdeptness.g:2777:2: rule__Signal__Group_4__1__Impl
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
    // InternalAdeptness.g:2783:1: rule__Signal__Group_4__1__Impl : ( ( rule__Signal__SuperTypeAssignment_4_1 ) ) ;
    public final void rule__Signal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2787:1: ( ( ( rule__Signal__SuperTypeAssignment_4_1 ) ) )
            // InternalAdeptness.g:2788:1: ( ( rule__Signal__SuperTypeAssignment_4_1 ) )
            {
            // InternalAdeptness.g:2788:1: ( ( rule__Signal__SuperTypeAssignment_4_1 ) )
            // InternalAdeptness.g:2789:2: ( rule__Signal__SuperTypeAssignment_4_1 )
            {
             before(grammarAccess.getSignalAccess().getSuperTypeAssignment_4_1()); 
            // InternalAdeptness.g:2790:2: ( rule__Signal__SuperTypeAssignment_4_1 )
            // InternalAdeptness.g:2790:3: rule__Signal__SuperTypeAssignment_4_1
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
    // InternalAdeptness.g:2799:1: rule__Oracle__Group__0 : rule__Oracle__Group__0__Impl rule__Oracle__Group__1 ;
    public final void rule__Oracle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2803:1: ( rule__Oracle__Group__0__Impl rule__Oracle__Group__1 )
            // InternalAdeptness.g:2804:2: rule__Oracle__Group__0__Impl rule__Oracle__Group__1
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
    // InternalAdeptness.g:2811:1: rule__Oracle__Group__0__Impl : ( 'ORACLE' ) ;
    public final void rule__Oracle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2815:1: ( ( 'ORACLE' ) )
            // InternalAdeptness.g:2816:1: ( 'ORACLE' )
            {
            // InternalAdeptness.g:2816:1: ( 'ORACLE' )
            // InternalAdeptness.g:2817:2: 'ORACLE'
            {
             before(grammarAccess.getOracleAccess().getORACLEKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAdeptness.g:2826:1: rule__Oracle__Group__1 : rule__Oracle__Group__1__Impl rule__Oracle__Group__2 ;
    public final void rule__Oracle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2830:1: ( rule__Oracle__Group__1__Impl rule__Oracle__Group__2 )
            // InternalAdeptness.g:2831:2: rule__Oracle__Group__1__Impl rule__Oracle__Group__2
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
    // InternalAdeptness.g:2838:1: rule__Oracle__Group__1__Impl : ( ( rule__Oracle__NameAssignment_1 ) ) ;
    public final void rule__Oracle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2842:1: ( ( ( rule__Oracle__NameAssignment_1 ) ) )
            // InternalAdeptness.g:2843:1: ( ( rule__Oracle__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:2843:1: ( ( rule__Oracle__NameAssignment_1 ) )
            // InternalAdeptness.g:2844:2: ( rule__Oracle__NameAssignment_1 )
            {
             before(grammarAccess.getOracleAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:2845:2: ( rule__Oracle__NameAssignment_1 )
            // InternalAdeptness.g:2845:3: rule__Oracle__NameAssignment_1
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
    // InternalAdeptness.g:2853:1: rule__Oracle__Group__2 : rule__Oracle__Group__2__Impl rule__Oracle__Group__3 ;
    public final void rule__Oracle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2857:1: ( rule__Oracle__Group__2__Impl rule__Oracle__Group__3 )
            // InternalAdeptness.g:2858:2: rule__Oracle__Group__2__Impl rule__Oracle__Group__3
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
    // InternalAdeptness.g:2865:1: rule__Oracle__Group__2__Impl : ( ':' ) ;
    public final void rule__Oracle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2869:1: ( ( ':' ) )
            // InternalAdeptness.g:2870:1: ( ':' )
            {
            // InternalAdeptness.g:2870:1: ( ':' )
            // InternalAdeptness.g:2871:2: ':'
            {
             before(grammarAccess.getOracleAccess().getColonKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAdeptness.g:2880:1: rule__Oracle__Group__3 : rule__Oracle__Group__3__Impl rule__Oracle__Group__4 ;
    public final void rule__Oracle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2884:1: ( rule__Oracle__Group__3__Impl rule__Oracle__Group__4 )
            // InternalAdeptness.g:2885:2: rule__Oracle__Group__3__Impl rule__Oracle__Group__4
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
    // InternalAdeptness.g:2892:1: rule__Oracle__Group__3__Impl : ( ( rule__Oracle__WhenAssignment_3 )? ) ;
    public final void rule__Oracle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2896:1: ( ( ( rule__Oracle__WhenAssignment_3 )? ) )
            // InternalAdeptness.g:2897:1: ( ( rule__Oracle__WhenAssignment_3 )? )
            {
            // InternalAdeptness.g:2897:1: ( ( rule__Oracle__WhenAssignment_3 )? )
            // InternalAdeptness.g:2898:2: ( rule__Oracle__WhenAssignment_3 )?
            {
             before(grammarAccess.getOracleAccess().getWhenAssignment_3()); 
            // InternalAdeptness.g:2899:2: ( rule__Oracle__WhenAssignment_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAdeptness.g:2899:3: rule__Oracle__WhenAssignment_3
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
    // InternalAdeptness.g:2907:1: rule__Oracle__Group__4 : rule__Oracle__Group__4__Impl rule__Oracle__Group__5 ;
    public final void rule__Oracle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2911:1: ( rule__Oracle__Group__4__Impl rule__Oracle__Group__5 )
            // InternalAdeptness.g:2912:2: rule__Oracle__Group__4__Impl rule__Oracle__Group__5
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
    // InternalAdeptness.g:2919:1: rule__Oracle__Group__4__Impl : ( ( ( rule__Oracle__CheckAssignment_4 ) ) ( ( rule__Oracle__CheckAssignment_4 )* ) ) ;
    public final void rule__Oracle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2923:1: ( ( ( ( rule__Oracle__CheckAssignment_4 ) ) ( ( rule__Oracle__CheckAssignment_4 )* ) ) )
            // InternalAdeptness.g:2924:1: ( ( ( rule__Oracle__CheckAssignment_4 ) ) ( ( rule__Oracle__CheckAssignment_4 )* ) )
            {
            // InternalAdeptness.g:2924:1: ( ( ( rule__Oracle__CheckAssignment_4 ) ) ( ( rule__Oracle__CheckAssignment_4 )* ) )
            // InternalAdeptness.g:2925:2: ( ( rule__Oracle__CheckAssignment_4 ) ) ( ( rule__Oracle__CheckAssignment_4 )* )
            {
            // InternalAdeptness.g:2925:2: ( ( rule__Oracle__CheckAssignment_4 ) )
            // InternalAdeptness.g:2926:3: ( rule__Oracle__CheckAssignment_4 )
            {
             before(grammarAccess.getOracleAccess().getCheckAssignment_4()); 
            // InternalAdeptness.g:2927:3: ( rule__Oracle__CheckAssignment_4 )
            // InternalAdeptness.g:2927:4: rule__Oracle__CheckAssignment_4
            {
            pushFollow(FOLLOW_26);
            rule__Oracle__CheckAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOracleAccess().getCheckAssignment_4()); 

            }

            // InternalAdeptness.g:2930:2: ( ( rule__Oracle__CheckAssignment_4 )* )
            // InternalAdeptness.g:2931:3: ( rule__Oracle__CheckAssignment_4 )*
            {
             before(grammarAccess.getOracleAccess().getCheckAssignment_4()); 
            // InternalAdeptness.g:2932:3: ( rule__Oracle__CheckAssignment_4 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==41) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAdeptness.g:2932:4: rule__Oracle__CheckAssignment_4
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
    // InternalAdeptness.g:2941:1: rule__Oracle__Group__5 : rule__Oracle__Group__5__Impl ;
    public final void rule__Oracle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2945:1: ( rule__Oracle__Group__5__Impl )
            // InternalAdeptness.g:2946:2: rule__Oracle__Group__5__Impl
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
    // InternalAdeptness.g:2952:1: rule__Oracle__Group__5__Impl : ( 'ENDORACLE' ) ;
    public final void rule__Oracle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2956:1: ( ( 'ENDORACLE' ) )
            // InternalAdeptness.g:2957:1: ( 'ENDORACLE' )
            {
            // InternalAdeptness.g:2957:1: ( 'ENDORACLE' )
            // InternalAdeptness.g:2958:2: 'ENDORACLE'
            {
             before(grammarAccess.getOracleAccess().getENDORACLEKeyword_5()); 
            match(input,39,FOLLOW_2); 
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
    // InternalAdeptness.g:2968:1: rule__When__Group__0 : rule__When__Group__0__Impl rule__When__Group__1 ;
    public final void rule__When__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2972:1: ( rule__When__Group__0__Impl rule__When__Group__1 )
            // InternalAdeptness.g:2973:2: rule__When__Group__0__Impl rule__When__Group__1
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
    // InternalAdeptness.g:2980:1: rule__When__Group__0__Impl : ( 'when:' ) ;
    public final void rule__When__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2984:1: ( ( 'when:' ) )
            // InternalAdeptness.g:2985:1: ( 'when:' )
            {
            // InternalAdeptness.g:2985:1: ( 'when:' )
            // InternalAdeptness.g:2986:2: 'when:'
            {
             before(grammarAccess.getWhenAccess().getWhenKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalAdeptness.g:2995:1: rule__When__Group__1 : rule__When__Group__1__Impl ;
    public final void rule__When__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2999:1: ( rule__When__Group__1__Impl )
            // InternalAdeptness.g:3000:2: rule__When__Group__1__Impl
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
    // InternalAdeptness.g:3006:1: rule__When__Group__1__Impl : ( ( rule__When__EmAssignment_1 ) ) ;
    public final void rule__When__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3010:1: ( ( ( rule__When__EmAssignment_1 ) ) )
            // InternalAdeptness.g:3011:1: ( ( rule__When__EmAssignment_1 ) )
            {
            // InternalAdeptness.g:3011:1: ( ( rule__When__EmAssignment_1 ) )
            // InternalAdeptness.g:3012:2: ( rule__When__EmAssignment_1 )
            {
             before(grammarAccess.getWhenAccess().getEmAssignment_1()); 
            // InternalAdeptness.g:3013:2: ( rule__When__EmAssignment_1 )
            // InternalAdeptness.g:3013:3: rule__When__EmAssignment_1
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
    // InternalAdeptness.g:3022:1: rule__Checks__Group__0 : rule__Checks__Group__0__Impl rule__Checks__Group__1 ;
    public final void rule__Checks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3026:1: ( rule__Checks__Group__0__Impl rule__Checks__Group__1 )
            // InternalAdeptness.g:3027:2: rule__Checks__Group__0__Impl rule__Checks__Group__1
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
    // InternalAdeptness.g:3034:1: rule__Checks__Group__0__Impl : ( 'checks:' ) ;
    public final void rule__Checks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3038:1: ( ( 'checks:' ) )
            // InternalAdeptness.g:3039:1: ( 'checks:' )
            {
            // InternalAdeptness.g:3039:1: ( 'checks:' )
            // InternalAdeptness.g:3040:2: 'checks:'
            {
             before(grammarAccess.getChecksAccess().getChecksKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalAdeptness.g:3049:1: rule__Checks__Group__1 : rule__Checks__Group__1__Impl rule__Checks__Group__2 ;
    public final void rule__Checks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3053:1: ( rule__Checks__Group__1__Impl rule__Checks__Group__2 )
            // InternalAdeptness.g:3054:2: rule__Checks__Group__1__Impl rule__Checks__Group__2
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
    // InternalAdeptness.g:3061:1: rule__Checks__Group__1__Impl : ( ( rule__Checks__Alternatives_1 ) ) ;
    public final void rule__Checks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3065:1: ( ( ( rule__Checks__Alternatives_1 ) ) )
            // InternalAdeptness.g:3066:1: ( ( rule__Checks__Alternatives_1 ) )
            {
            // InternalAdeptness.g:3066:1: ( ( rule__Checks__Alternatives_1 ) )
            // InternalAdeptness.g:3067:2: ( rule__Checks__Alternatives_1 )
            {
             before(grammarAccess.getChecksAccess().getAlternatives_1()); 
            // InternalAdeptness.g:3068:2: ( rule__Checks__Alternatives_1 )
            // InternalAdeptness.g:3068:3: rule__Checks__Alternatives_1
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
    // InternalAdeptness.g:3076:1: rule__Checks__Group__2 : rule__Checks__Group__2__Impl rule__Checks__Group__3 ;
    public final void rule__Checks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3080:1: ( rule__Checks__Group__2__Impl rule__Checks__Group__3 )
            // InternalAdeptness.g:3081:2: rule__Checks__Group__2__Impl rule__Checks__Group__3
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
    // InternalAdeptness.g:3088:1: rule__Checks__Group__2__Impl : ( ( rule__Checks__ReferenceAssignment_2 ) ) ;
    public final void rule__Checks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3092:1: ( ( ( rule__Checks__ReferenceAssignment_2 ) ) )
            // InternalAdeptness.g:3093:1: ( ( rule__Checks__ReferenceAssignment_2 ) )
            {
            // InternalAdeptness.g:3093:1: ( ( rule__Checks__ReferenceAssignment_2 ) )
            // InternalAdeptness.g:3094:2: ( rule__Checks__ReferenceAssignment_2 )
            {
             before(grammarAccess.getChecksAccess().getReferenceAssignment_2()); 
            // InternalAdeptness.g:3095:2: ( rule__Checks__ReferenceAssignment_2 )
            // InternalAdeptness.g:3095:3: rule__Checks__ReferenceAssignment_2
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
    // InternalAdeptness.g:3103:1: rule__Checks__Group__3 : rule__Checks__Group__3__Impl rule__Checks__Group__4 ;
    public final void rule__Checks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3107:1: ( rule__Checks__Group__3__Impl rule__Checks__Group__4 )
            // InternalAdeptness.g:3108:2: rule__Checks__Group__3__Impl rule__Checks__Group__4
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
    // InternalAdeptness.g:3115:1: rule__Checks__Group__3__Impl : ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) ) ;
    public final void rule__Checks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3119:1: ( ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) ) )
            // InternalAdeptness.g:3120:1: ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) )
            {
            // InternalAdeptness.g:3120:1: ( ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* ) )
            // InternalAdeptness.g:3121:2: ( ( rule__Checks__FailReasonAssignment_3 ) ) ( ( rule__Checks__FailReasonAssignment_3 )* )
            {
            // InternalAdeptness.g:3121:2: ( ( rule__Checks__FailReasonAssignment_3 ) )
            // InternalAdeptness.g:3122:3: ( rule__Checks__FailReasonAssignment_3 )
            {
             before(grammarAccess.getChecksAccess().getFailReasonAssignment_3()); 
            // InternalAdeptness.g:3123:3: ( rule__Checks__FailReasonAssignment_3 )
            // InternalAdeptness.g:3123:4: rule__Checks__FailReasonAssignment_3
            {
            pushFollow(FOLLOW_31);
            rule__Checks__FailReasonAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChecksAccess().getFailReasonAssignment_3()); 

            }

            // InternalAdeptness.g:3126:2: ( ( rule__Checks__FailReasonAssignment_3 )* )
            // InternalAdeptness.g:3127:3: ( rule__Checks__FailReasonAssignment_3 )*
            {
             before(grammarAccess.getChecksAccess().getFailReasonAssignment_3()); 
            // InternalAdeptness.g:3128:3: ( rule__Checks__FailReasonAssignment_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==43) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAdeptness.g:3128:4: rule__Checks__FailReasonAssignment_3
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
    // InternalAdeptness.g:3137:1: rule__Checks__Group__4 : rule__Checks__Group__4__Impl ;
    public final void rule__Checks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3141:1: ( rule__Checks__Group__4__Impl )
            // InternalAdeptness.g:3142:2: rule__Checks__Group__4__Impl
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
    // InternalAdeptness.g:3148:1: rule__Checks__Group__4__Impl : ( ( rule__Checks__DescriptionAssignment_4 ) ) ;
    public final void rule__Checks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3152:1: ( ( ( rule__Checks__DescriptionAssignment_4 ) ) )
            // InternalAdeptness.g:3153:1: ( ( rule__Checks__DescriptionAssignment_4 ) )
            {
            // InternalAdeptness.g:3153:1: ( ( rule__Checks__DescriptionAssignment_4 ) )
            // InternalAdeptness.g:3154:2: ( rule__Checks__DescriptionAssignment_4 )
            {
             before(grammarAccess.getChecksAccess().getDescriptionAssignment_4()); 
            // InternalAdeptness.g:3155:2: ( rule__Checks__DescriptionAssignment_4 )
            // InternalAdeptness.g:3155:3: rule__Checks__DescriptionAssignment_4
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
    // InternalAdeptness.g:3164:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3168:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalAdeptness.g:3169:2: rule__Description__Group__0__Impl rule__Description__Group__1
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
    // InternalAdeptness.g:3176:1: rule__Description__Group__0__Impl : ( 'Description: ' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3180:1: ( ( 'Description: ' ) )
            // InternalAdeptness.g:3181:1: ( 'Description: ' )
            {
            // InternalAdeptness.g:3181:1: ( 'Description: ' )
            // InternalAdeptness.g:3182:2: 'Description: '
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalAdeptness.g:3191:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3195:1: ( rule__Description__Group__1__Impl )
            // InternalAdeptness.g:3196:2: rule__Description__Group__1__Impl
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
    // InternalAdeptness.g:3202:1: rule__Description__Group__1__Impl : ( ( rule__Description__ValueAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3206:1: ( ( ( rule__Description__ValueAssignment_1 ) ) )
            // InternalAdeptness.g:3207:1: ( ( rule__Description__ValueAssignment_1 ) )
            {
            // InternalAdeptness.g:3207:1: ( ( rule__Description__ValueAssignment_1 ) )
            // InternalAdeptness.g:3208:2: ( rule__Description__ValueAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getValueAssignment_1()); 
            // InternalAdeptness.g:3209:2: ( rule__Description__ValueAssignment_1 )
            // InternalAdeptness.g:3209:3: rule__Description__ValueAssignment_1
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
    // InternalAdeptness.g:3218:1: rule__FailReason__Group__0 : rule__FailReason__Group__0__Impl rule__FailReason__Group__1 ;
    public final void rule__FailReason__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3222:1: ( rule__FailReason__Group__0__Impl rule__FailReason__Group__1 )
            // InternalAdeptness.g:3223:2: rule__FailReason__Group__0__Impl rule__FailReason__Group__1
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
    // InternalAdeptness.g:3230:1: rule__FailReason__Group__0__Impl : ( 'fails if :' ) ;
    public final void rule__FailReason__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3234:1: ( ( 'fails if :' ) )
            // InternalAdeptness.g:3235:1: ( 'fails if :' )
            {
            // InternalAdeptness.g:3235:1: ( 'fails if :' )
            // InternalAdeptness.g:3236:2: 'fails if :'
            {
             before(grammarAccess.getFailReasonAccess().getFailsIfKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalAdeptness.g:3245:1: rule__FailReason__Group__1 : rule__FailReason__Group__1__Impl ;
    public final void rule__FailReason__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3249:1: ( rule__FailReason__Group__1__Impl )
            // InternalAdeptness.g:3250:2: rule__FailReason__Group__1__Impl
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
    // InternalAdeptness.g:3256:1: rule__FailReason__Group__1__Impl : ( ( rule__FailReason__ReasonAssignment_1 ) ) ;
    public final void rule__FailReason__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3260:1: ( ( ( rule__FailReason__ReasonAssignment_1 ) ) )
            // InternalAdeptness.g:3261:1: ( ( rule__FailReason__ReasonAssignment_1 ) )
            {
            // InternalAdeptness.g:3261:1: ( ( rule__FailReason__ReasonAssignment_1 ) )
            // InternalAdeptness.g:3262:2: ( rule__FailReason__ReasonAssignment_1 )
            {
             before(grammarAccess.getFailReasonAccess().getReasonAssignment_1()); 
            // InternalAdeptness.g:3263:2: ( rule__FailReason__ReasonAssignment_1 )
            // InternalAdeptness.g:3263:3: rule__FailReason__ReasonAssignment_1
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
    // InternalAdeptness.g:3272:1: rule__Reason__Group__0 : rule__Reason__Group__0__Impl rule__Reason__Group__1 ;
    public final void rule__Reason__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3276:1: ( rule__Reason__Group__0__Impl rule__Reason__Group__1 )
            // InternalAdeptness.g:3277:2: rule__Reason__Group__0__Impl rule__Reason__Group__1
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
    // InternalAdeptness.g:3284:1: rule__Reason__Group__0__Impl : ( ( rule__Reason__Alternatives_0 ) ) ;
    public final void rule__Reason__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3288:1: ( ( ( rule__Reason__Alternatives_0 ) ) )
            // InternalAdeptness.g:3289:1: ( ( rule__Reason__Alternatives_0 ) )
            {
            // InternalAdeptness.g:3289:1: ( ( rule__Reason__Alternatives_0 ) )
            // InternalAdeptness.g:3290:2: ( rule__Reason__Alternatives_0 )
            {
             before(grammarAccess.getReasonAccess().getAlternatives_0()); 
            // InternalAdeptness.g:3291:2: ( rule__Reason__Alternatives_0 )
            // InternalAdeptness.g:3291:3: rule__Reason__Alternatives_0
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
    // InternalAdeptness.g:3299:1: rule__Reason__Group__1 : rule__Reason__Group__1__Impl ;
    public final void rule__Reason__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3303:1: ( rule__Reason__Group__1__Impl )
            // InternalAdeptness.g:3304:2: rule__Reason__Group__1__Impl
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
    // InternalAdeptness.g:3310:1: rule__Reason__Group__1__Impl : ( ';' ) ;
    public final void rule__Reason__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3314:1: ( ( ';' ) )
            // InternalAdeptness.g:3315:1: ( ';' )
            {
            // InternalAdeptness.g:3315:1: ( ';' )
            // InternalAdeptness.g:3316:2: ';'
            {
             before(grammarAccess.getReasonAccess().getSemicolonKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAdeptness.g:3326:1: rule__XPeaks__Group__0 : rule__XPeaks__Group__0__Impl rule__XPeaks__Group__1 ;
    public final void rule__XPeaks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3330:1: ( rule__XPeaks__Group__0__Impl rule__XPeaks__Group__1 )
            // InternalAdeptness.g:3331:2: rule__XPeaks__Group__0__Impl rule__XPeaks__Group__1
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
    // InternalAdeptness.g:3338:1: rule__XPeaks__Group__0__Impl : ( 'confidence is below' ) ;
    public final void rule__XPeaks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3342:1: ( ( 'confidence is below' ) )
            // InternalAdeptness.g:3343:1: ( 'confidence is below' )
            {
            // InternalAdeptness.g:3343:1: ( 'confidence is below' )
            // InternalAdeptness.g:3344:2: 'confidence is below'
            {
             before(grammarAccess.getXPeaksAccess().getConfidenceIsBelowKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalAdeptness.g:3353:1: rule__XPeaks__Group__1 : rule__XPeaks__Group__1__Impl rule__XPeaks__Group__2 ;
    public final void rule__XPeaks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3357:1: ( rule__XPeaks__Group__1__Impl rule__XPeaks__Group__2 )
            // InternalAdeptness.g:3358:2: rule__XPeaks__Group__1__Impl rule__XPeaks__Group__2
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
    // InternalAdeptness.g:3365:1: rule__XPeaks__Group__1__Impl : ( ( rule__XPeaks__CantAssignment_1 ) ) ;
    public final void rule__XPeaks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3369:1: ( ( ( rule__XPeaks__CantAssignment_1 ) ) )
            // InternalAdeptness.g:3370:1: ( ( rule__XPeaks__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:3370:1: ( ( rule__XPeaks__CantAssignment_1 ) )
            // InternalAdeptness.g:3371:2: ( rule__XPeaks__CantAssignment_1 )
            {
             before(grammarAccess.getXPeaksAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:3372:2: ( rule__XPeaks__CantAssignment_1 )
            // InternalAdeptness.g:3372:3: rule__XPeaks__CantAssignment_1
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
    // InternalAdeptness.g:3380:1: rule__XPeaks__Group__2 : rule__XPeaks__Group__2__Impl rule__XPeaks__Group__3 ;
    public final void rule__XPeaks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3384:1: ( rule__XPeaks__Group__2__Impl rule__XPeaks__Group__3 )
            // InternalAdeptness.g:3385:2: rule__XPeaks__Group__2__Impl rule__XPeaks__Group__3
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
    // InternalAdeptness.g:3392:1: rule__XPeaks__Group__2__Impl : ( 'more than' ) ;
    public final void rule__XPeaks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3396:1: ( ( 'more than' ) )
            // InternalAdeptness.g:3397:1: ( 'more than' )
            {
            // InternalAdeptness.g:3397:1: ( 'more than' )
            // InternalAdeptness.g:3398:2: 'more than'
            {
             before(grammarAccess.getXPeaksAccess().getMoreThanKeyword_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalAdeptness.g:3407:1: rule__XPeaks__Group__3 : rule__XPeaks__Group__3__Impl rule__XPeaks__Group__4 ;
    public final void rule__XPeaks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3411:1: ( rule__XPeaks__Group__3__Impl rule__XPeaks__Group__4 )
            // InternalAdeptness.g:3412:2: rule__XPeaks__Group__3__Impl rule__XPeaks__Group__4
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
    // InternalAdeptness.g:3419:1: rule__XPeaks__Group__3__Impl : ( ( rule__XPeaks__NPeaksAssignment_3 ) ) ;
    public final void rule__XPeaks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3423:1: ( ( ( rule__XPeaks__NPeaksAssignment_3 ) ) )
            // InternalAdeptness.g:3424:1: ( ( rule__XPeaks__NPeaksAssignment_3 ) )
            {
            // InternalAdeptness.g:3424:1: ( ( rule__XPeaks__NPeaksAssignment_3 ) )
            // InternalAdeptness.g:3425:2: ( rule__XPeaks__NPeaksAssignment_3 )
            {
             before(grammarAccess.getXPeaksAccess().getNPeaksAssignment_3()); 
            // InternalAdeptness.g:3426:2: ( rule__XPeaks__NPeaksAssignment_3 )
            // InternalAdeptness.g:3426:3: rule__XPeaks__NPeaksAssignment_3
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
    // InternalAdeptness.g:3434:1: rule__XPeaks__Group__4 : rule__XPeaks__Group__4__Impl rule__XPeaks__Group__5 ;
    public final void rule__XPeaks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3438:1: ( rule__XPeaks__Group__4__Impl rule__XPeaks__Group__5 )
            // InternalAdeptness.g:3439:2: rule__XPeaks__Group__4__Impl rule__XPeaks__Group__5
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
    // InternalAdeptness.g:3446:1: rule__XPeaks__Group__4__Impl : ( 'times within' ) ;
    public final void rule__XPeaks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3450:1: ( ( 'times within' ) )
            // InternalAdeptness.g:3451:1: ( 'times within' )
            {
            // InternalAdeptness.g:3451:1: ( 'times within' )
            // InternalAdeptness.g:3452:2: 'times within'
            {
             before(grammarAccess.getXPeaksAccess().getTimesWithinKeyword_4()); 
            match(input,47,FOLLOW_2); 
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
    // InternalAdeptness.g:3461:1: rule__XPeaks__Group__5 : rule__XPeaks__Group__5__Impl rule__XPeaks__Group__6 ;
    public final void rule__XPeaks__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3465:1: ( rule__XPeaks__Group__5__Impl rule__XPeaks__Group__6 )
            // InternalAdeptness.g:3466:2: rule__XPeaks__Group__5__Impl rule__XPeaks__Group__6
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
    // InternalAdeptness.g:3473:1: rule__XPeaks__Group__5__Impl : ( ( rule__XPeaks__TimeAssignment_5 ) ) ;
    public final void rule__XPeaks__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3477:1: ( ( ( rule__XPeaks__TimeAssignment_5 ) ) )
            // InternalAdeptness.g:3478:1: ( ( rule__XPeaks__TimeAssignment_5 ) )
            {
            // InternalAdeptness.g:3478:1: ( ( rule__XPeaks__TimeAssignment_5 ) )
            // InternalAdeptness.g:3479:2: ( rule__XPeaks__TimeAssignment_5 )
            {
             before(grammarAccess.getXPeaksAccess().getTimeAssignment_5()); 
            // InternalAdeptness.g:3480:2: ( rule__XPeaks__TimeAssignment_5 )
            // InternalAdeptness.g:3480:3: rule__XPeaks__TimeAssignment_5
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
    // InternalAdeptness.g:3488:1: rule__XPeaks__Group__6 : rule__XPeaks__Group__6__Impl ;
    public final void rule__XPeaks__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3492:1: ( rule__XPeaks__Group__6__Impl )
            // InternalAdeptness.g:3493:2: rule__XPeaks__Group__6__Impl
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
    // InternalAdeptness.g:3499:1: rule__XPeaks__Group__6__Impl : ( ( rule__XPeaks__UnitAssignment_6 ) ) ;
    public final void rule__XPeaks__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3503:1: ( ( ( rule__XPeaks__UnitAssignment_6 ) ) )
            // InternalAdeptness.g:3504:1: ( ( rule__XPeaks__UnitAssignment_6 ) )
            {
            // InternalAdeptness.g:3504:1: ( ( rule__XPeaks__UnitAssignment_6 ) )
            // InternalAdeptness.g:3505:2: ( rule__XPeaks__UnitAssignment_6 )
            {
             before(grammarAccess.getXPeaksAccess().getUnitAssignment_6()); 
            // InternalAdeptness.g:3506:2: ( rule__XPeaks__UnitAssignment_6 )
            // InternalAdeptness.g:3506:3: rule__XPeaks__UnitAssignment_6
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
    // InternalAdeptness.g:3515:1: rule__ConstDeg__Group__0 : rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1 ;
    public final void rule__ConstDeg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3519:1: ( rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1 )
            // InternalAdeptness.g:3520:2: rule__ConstDeg__Group__0__Impl rule__ConstDeg__Group__1
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
    // InternalAdeptness.g:3527:1: rule__ConstDeg__Group__0__Impl : ( 'confidence is in constant degradation' ) ;
    public final void rule__ConstDeg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3531:1: ( ( 'confidence is in constant degradation' ) )
            // InternalAdeptness.g:3532:1: ( 'confidence is in constant degradation' )
            {
            // InternalAdeptness.g:3532:1: ( 'confidence is in constant degradation' )
            // InternalAdeptness.g:3533:2: 'confidence is in constant degradation'
            {
             before(grammarAccess.getConstDegAccess().getConfidenceIsInConstantDegradationKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalAdeptness.g:3542:1: rule__ConstDeg__Group__1 : rule__ConstDeg__Group__1__Impl ;
    public final void rule__ConstDeg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3546:1: ( rule__ConstDeg__Group__1__Impl )
            // InternalAdeptness.g:3547:2: rule__ConstDeg__Group__1__Impl
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
    // InternalAdeptness.g:3553:1: rule__ConstDeg__Group__1__Impl : ( ( rule__ConstDeg__CantAssignment_1 ) ) ;
    public final void rule__ConstDeg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3557:1: ( ( ( rule__ConstDeg__CantAssignment_1 ) ) )
            // InternalAdeptness.g:3558:1: ( ( rule__ConstDeg__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:3558:1: ( ( rule__ConstDeg__CantAssignment_1 ) )
            // InternalAdeptness.g:3559:2: ( rule__ConstDeg__CantAssignment_1 )
            {
             before(grammarAccess.getConstDegAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:3560:2: ( rule__ConstDeg__CantAssignment_1 )
            // InternalAdeptness.g:3560:3: rule__ConstDeg__CantAssignment_1
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
    // InternalAdeptness.g:3569:1: rule__HighTime__Group__0 : rule__HighTime__Group__0__Impl rule__HighTime__Group__1 ;
    public final void rule__HighTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3573:1: ( rule__HighTime__Group__0__Impl rule__HighTime__Group__1 )
            // InternalAdeptness.g:3574:2: rule__HighTime__Group__0__Impl rule__HighTime__Group__1
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
    // InternalAdeptness.g:3581:1: rule__HighTime__Group__0__Impl : ( 'confidence is below' ) ;
    public final void rule__HighTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3585:1: ( ( 'confidence is below' ) )
            // InternalAdeptness.g:3586:1: ( 'confidence is below' )
            {
            // InternalAdeptness.g:3586:1: ( 'confidence is below' )
            // InternalAdeptness.g:3587:2: 'confidence is below'
            {
             before(grammarAccess.getHighTimeAccess().getConfidenceIsBelowKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalAdeptness.g:3596:1: rule__HighTime__Group__1 : rule__HighTime__Group__1__Impl rule__HighTime__Group__2 ;
    public final void rule__HighTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3600:1: ( rule__HighTime__Group__1__Impl rule__HighTime__Group__2 )
            // InternalAdeptness.g:3601:2: rule__HighTime__Group__1__Impl rule__HighTime__Group__2
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
    // InternalAdeptness.g:3608:1: rule__HighTime__Group__1__Impl : ( ( rule__HighTime__CantAssignment_1 ) ) ;
    public final void rule__HighTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3612:1: ( ( ( rule__HighTime__CantAssignment_1 ) ) )
            // InternalAdeptness.g:3613:1: ( ( rule__HighTime__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:3613:1: ( ( rule__HighTime__CantAssignment_1 ) )
            // InternalAdeptness.g:3614:2: ( rule__HighTime__CantAssignment_1 )
            {
             before(grammarAccess.getHighTimeAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:3615:2: ( rule__HighTime__CantAssignment_1 )
            // InternalAdeptness.g:3615:3: rule__HighTime__CantAssignment_1
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
    // InternalAdeptness.g:3623:1: rule__HighTime__Group__2 : rule__HighTime__Group__2__Impl rule__HighTime__Group__3 ;
    public final void rule__HighTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3627:1: ( rule__HighTime__Group__2__Impl rule__HighTime__Group__3 )
            // InternalAdeptness.g:3628:2: rule__HighTime__Group__2__Impl rule__HighTime__Group__3
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
    // InternalAdeptness.g:3635:1: rule__HighTime__Group__2__Impl : ( 'within' ) ;
    public final void rule__HighTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3639:1: ( ( 'within' ) )
            // InternalAdeptness.g:3640:1: ( 'within' )
            {
            // InternalAdeptness.g:3640:1: ( 'within' )
            // InternalAdeptness.g:3641:2: 'within'
            {
             before(grammarAccess.getHighTimeAccess().getWithinKeyword_2()); 
            match(input,49,FOLLOW_2); 
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
    // InternalAdeptness.g:3650:1: rule__HighTime__Group__3 : rule__HighTime__Group__3__Impl rule__HighTime__Group__4 ;
    public final void rule__HighTime__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3654:1: ( rule__HighTime__Group__3__Impl rule__HighTime__Group__4 )
            // InternalAdeptness.g:3655:2: rule__HighTime__Group__3__Impl rule__HighTime__Group__4
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
    // InternalAdeptness.g:3662:1: rule__HighTime__Group__3__Impl : ( ( rule__HighTime__TimeAssignment_3 ) ) ;
    public final void rule__HighTime__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3666:1: ( ( ( rule__HighTime__TimeAssignment_3 ) ) )
            // InternalAdeptness.g:3667:1: ( ( rule__HighTime__TimeAssignment_3 ) )
            {
            // InternalAdeptness.g:3667:1: ( ( rule__HighTime__TimeAssignment_3 ) )
            // InternalAdeptness.g:3668:2: ( rule__HighTime__TimeAssignment_3 )
            {
             before(grammarAccess.getHighTimeAccess().getTimeAssignment_3()); 
            // InternalAdeptness.g:3669:2: ( rule__HighTime__TimeAssignment_3 )
            // InternalAdeptness.g:3669:3: rule__HighTime__TimeAssignment_3
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
    // InternalAdeptness.g:3677:1: rule__HighTime__Group__4 : rule__HighTime__Group__4__Impl ;
    public final void rule__HighTime__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3681:1: ( rule__HighTime__Group__4__Impl )
            // InternalAdeptness.g:3682:2: rule__HighTime__Group__4__Impl
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
    // InternalAdeptness.g:3688:1: rule__HighTime__Group__4__Impl : ( ( rule__HighTime__UnitAssignment_4 ) ) ;
    public final void rule__HighTime__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3692:1: ( ( ( rule__HighTime__UnitAssignment_4 ) ) )
            // InternalAdeptness.g:3693:1: ( ( rule__HighTime__UnitAssignment_4 ) )
            {
            // InternalAdeptness.g:3693:1: ( ( rule__HighTime__UnitAssignment_4 ) )
            // InternalAdeptness.g:3694:2: ( rule__HighTime__UnitAssignment_4 )
            {
             before(grammarAccess.getHighTimeAccess().getUnitAssignment_4()); 
            // InternalAdeptness.g:3695:2: ( rule__HighTime__UnitAssignment_4 )
            // InternalAdeptness.g:3695:3: rule__HighTime__UnitAssignment_4
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
    // InternalAdeptness.g:3704:1: rule__HighPeak__Group__0 : rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1 ;
    public final void rule__HighPeak__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3708:1: ( rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1 )
            // InternalAdeptness.g:3709:2: rule__HighPeak__Group__0__Impl rule__HighPeak__Group__1
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
    // InternalAdeptness.g:3716:1: rule__HighPeak__Group__0__Impl : ( 'confidence is below' ) ;
    public final void rule__HighPeak__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3720:1: ( ( 'confidence is below' ) )
            // InternalAdeptness.g:3721:1: ( 'confidence is below' )
            {
            // InternalAdeptness.g:3721:1: ( 'confidence is below' )
            // InternalAdeptness.g:3722:2: 'confidence is below'
            {
             before(grammarAccess.getHighPeakAccess().getConfidenceIsBelowKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalAdeptness.g:3731:1: rule__HighPeak__Group__1 : rule__HighPeak__Group__1__Impl ;
    public final void rule__HighPeak__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3735:1: ( rule__HighPeak__Group__1__Impl )
            // InternalAdeptness.g:3736:2: rule__HighPeak__Group__1__Impl
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
    // InternalAdeptness.g:3742:1: rule__HighPeak__Group__1__Impl : ( ( rule__HighPeak__CantAssignment_1 ) ) ;
    public final void rule__HighPeak__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3746:1: ( ( ( rule__HighPeak__CantAssignment_1 ) ) )
            // InternalAdeptness.g:3747:1: ( ( rule__HighPeak__CantAssignment_1 ) )
            {
            // InternalAdeptness.g:3747:1: ( ( rule__HighPeak__CantAssignment_1 ) )
            // InternalAdeptness.g:3748:2: ( rule__HighPeak__CantAssignment_1 )
            {
             before(grammarAccess.getHighPeakAccess().getCantAssignment_1()); 
            // InternalAdeptness.g:3749:2: ( rule__HighPeak__CantAssignment_1 )
            // InternalAdeptness.g:3749:3: rule__HighPeak__CantAssignment_1
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
    // InternalAdeptness.g:3758:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3762:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalAdeptness.g:3763:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
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
    // InternalAdeptness.g:3770:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__Alternatives_0 ) ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3774:1: ( ( ( rule__Reference__Alternatives_0 ) ) )
            // InternalAdeptness.g:3775:1: ( ( rule__Reference__Alternatives_0 ) )
            {
            // InternalAdeptness.g:3775:1: ( ( rule__Reference__Alternatives_0 ) )
            // InternalAdeptness.g:3776:2: ( rule__Reference__Alternatives_0 )
            {
             before(grammarAccess.getReferenceAccess().getAlternatives_0()); 
            // InternalAdeptness.g:3777:2: ( rule__Reference__Alternatives_0 )
            // InternalAdeptness.g:3777:3: rule__Reference__Alternatives_0
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
    // InternalAdeptness.g:3785:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3789:1: ( rule__Reference__Group__1__Impl )
            // InternalAdeptness.g:3790:2: rule__Reference__Group__1__Impl
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
    // InternalAdeptness.g:3796:1: rule__Reference__Group__1__Impl : ( ';' ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3800:1: ( ( ';' ) )
            // InternalAdeptness.g:3801:1: ( ';' )
            {
            // InternalAdeptness.g:3801:1: ( ';' )
            // InternalAdeptness.g:3802:2: ';'
            {
             before(grammarAccess.getReferenceAccess().getSemicolonKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAdeptness.g:3812:1: rule__Upper__Group__0 : rule__Upper__Group__0__Impl rule__Upper__Group__1 ;
    public final void rule__Upper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3816:1: ( rule__Upper__Group__0__Impl rule__Upper__Group__1 )
            // InternalAdeptness.g:3817:2: rule__Upper__Group__0__Impl rule__Upper__Group__1
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
    // InternalAdeptness.g:3824:1: rule__Upper__Group__0__Impl : ( 'is below' ) ;
    public final void rule__Upper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3828:1: ( ( 'is below' ) )
            // InternalAdeptness.g:3829:1: ( 'is below' )
            {
            // InternalAdeptness.g:3829:1: ( 'is below' )
            // InternalAdeptness.g:3830:2: 'is below'
            {
             before(grammarAccess.getUpperAccess().getIsBelowKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalAdeptness.g:3839:1: rule__Upper__Group__1 : rule__Upper__Group__1__Impl ;
    public final void rule__Upper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3843:1: ( rule__Upper__Group__1__Impl )
            // InternalAdeptness.g:3844:2: rule__Upper__Group__1__Impl
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
    // InternalAdeptness.g:3850:1: rule__Upper__Group__1__Impl : ( ( rule__Upper__Bound_uppAssignment_1 ) ) ;
    public final void rule__Upper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3854:1: ( ( ( rule__Upper__Bound_uppAssignment_1 ) ) )
            // InternalAdeptness.g:3855:1: ( ( rule__Upper__Bound_uppAssignment_1 ) )
            {
            // InternalAdeptness.g:3855:1: ( ( rule__Upper__Bound_uppAssignment_1 ) )
            // InternalAdeptness.g:3856:2: ( rule__Upper__Bound_uppAssignment_1 )
            {
             before(grammarAccess.getUpperAccess().getBound_uppAssignment_1()); 
            // InternalAdeptness.g:3857:2: ( rule__Upper__Bound_uppAssignment_1 )
            // InternalAdeptness.g:3857:3: rule__Upper__Bound_uppAssignment_1
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
    // InternalAdeptness.g:3866:1: rule__Lower__Group__0 : rule__Lower__Group__0__Impl rule__Lower__Group__1 ;
    public final void rule__Lower__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3870:1: ( rule__Lower__Group__0__Impl rule__Lower__Group__1 )
            // InternalAdeptness.g:3871:2: rule__Lower__Group__0__Impl rule__Lower__Group__1
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
    // InternalAdeptness.g:3878:1: rule__Lower__Group__0__Impl : ( 'is above' ) ;
    public final void rule__Lower__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3882:1: ( ( 'is above' ) )
            // InternalAdeptness.g:3883:1: ( 'is above' )
            {
            // InternalAdeptness.g:3883:1: ( 'is above' )
            // InternalAdeptness.g:3884:2: 'is above'
            {
             before(grammarAccess.getLowerAccess().getIsAboveKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalAdeptness.g:3893:1: rule__Lower__Group__1 : rule__Lower__Group__1__Impl ;
    public final void rule__Lower__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3897:1: ( rule__Lower__Group__1__Impl )
            // InternalAdeptness.g:3898:2: rule__Lower__Group__1__Impl
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
    // InternalAdeptness.g:3904:1: rule__Lower__Group__1__Impl : ( ( rule__Lower__Bound_lowerAssignment_1 ) ) ;
    public final void rule__Lower__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3908:1: ( ( ( rule__Lower__Bound_lowerAssignment_1 ) ) )
            // InternalAdeptness.g:3909:1: ( ( rule__Lower__Bound_lowerAssignment_1 ) )
            {
            // InternalAdeptness.g:3909:1: ( ( rule__Lower__Bound_lowerAssignment_1 ) )
            // InternalAdeptness.g:3910:2: ( rule__Lower__Bound_lowerAssignment_1 )
            {
             before(grammarAccess.getLowerAccess().getBound_lowerAssignment_1()); 
            // InternalAdeptness.g:3911:2: ( rule__Lower__Bound_lowerAssignment_1 )
            // InternalAdeptness.g:3911:3: rule__Lower__Bound_lowerAssignment_1
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
    // InternalAdeptness.g:3920:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3924:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // InternalAdeptness.g:3925:2: rule__Range__Group__0__Impl rule__Range__Group__1
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
    // InternalAdeptness.g:3932:1: rule__Range__Group__0__Impl : ( 'is in range between' ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3936:1: ( ( 'is in range between' ) )
            // InternalAdeptness.g:3937:1: ( 'is in range between' )
            {
            // InternalAdeptness.g:3937:1: ( 'is in range between' )
            // InternalAdeptness.g:3938:2: 'is in range between'
            {
             before(grammarAccess.getRangeAccess().getIsInRangeBetweenKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalAdeptness.g:3947:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3951:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // InternalAdeptness.g:3952:2: rule__Range__Group__1__Impl rule__Range__Group__2
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
    // InternalAdeptness.g:3959:1: rule__Range__Group__1__Impl : ( ( rule__Range__Bound_lowerAssignment_1 ) ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3963:1: ( ( ( rule__Range__Bound_lowerAssignment_1 ) ) )
            // InternalAdeptness.g:3964:1: ( ( rule__Range__Bound_lowerAssignment_1 ) )
            {
            // InternalAdeptness.g:3964:1: ( ( rule__Range__Bound_lowerAssignment_1 ) )
            // InternalAdeptness.g:3965:2: ( rule__Range__Bound_lowerAssignment_1 )
            {
             before(grammarAccess.getRangeAccess().getBound_lowerAssignment_1()); 
            // InternalAdeptness.g:3966:2: ( rule__Range__Bound_lowerAssignment_1 )
            // InternalAdeptness.g:3966:3: rule__Range__Bound_lowerAssignment_1
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
    // InternalAdeptness.g:3974:1: rule__Range__Group__2 : rule__Range__Group__2__Impl rule__Range__Group__3 ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3978:1: ( rule__Range__Group__2__Impl rule__Range__Group__3 )
            // InternalAdeptness.g:3979:2: rule__Range__Group__2__Impl rule__Range__Group__3
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
    // InternalAdeptness.g:3986:1: rule__Range__Group__2__Impl : ( 'and' ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:3990:1: ( ( 'and' ) )
            // InternalAdeptness.g:3991:1: ( 'and' )
            {
            // InternalAdeptness.g:3991:1: ( 'and' )
            // InternalAdeptness.g:3992:2: 'and'
            {
             before(grammarAccess.getRangeAccess().getAndKeyword_2()); 
            match(input,53,FOLLOW_2); 
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
    // InternalAdeptness.g:4001:1: rule__Range__Group__3 : rule__Range__Group__3__Impl ;
    public final void rule__Range__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4005:1: ( rule__Range__Group__3__Impl )
            // InternalAdeptness.g:4006:2: rule__Range__Group__3__Impl
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
    // InternalAdeptness.g:4012:1: rule__Range__Group__3__Impl : ( ( rule__Range__Bound_uppAssignment_3 ) ) ;
    public final void rule__Range__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4016:1: ( ( ( rule__Range__Bound_uppAssignment_3 ) ) )
            // InternalAdeptness.g:4017:1: ( ( rule__Range__Bound_uppAssignment_3 ) )
            {
            // InternalAdeptness.g:4017:1: ( ( rule__Range__Bound_uppAssignment_3 ) )
            // InternalAdeptness.g:4018:2: ( rule__Range__Bound_uppAssignment_3 )
            {
             before(grammarAccess.getRangeAccess().getBound_uppAssignment_3()); 
            // InternalAdeptness.g:4019:2: ( rule__Range__Bound_uppAssignment_3 )
            // InternalAdeptness.g:4019:3: rule__Range__Bound_uppAssignment_3
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
    // InternalAdeptness.g:4028:1: rule__Gap__Group__0 : rule__Gap__Group__0__Impl rule__Gap__Group__1 ;
    public final void rule__Gap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4032:1: ( rule__Gap__Group__0__Impl rule__Gap__Group__1 )
            // InternalAdeptness.g:4033:2: rule__Gap__Group__0__Impl rule__Gap__Group__1
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
    // InternalAdeptness.g:4040:1: rule__Gap__Group__0__Impl : ( 'not in range between' ) ;
    public final void rule__Gap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4044:1: ( ( 'not in range between' ) )
            // InternalAdeptness.g:4045:1: ( 'not in range between' )
            {
            // InternalAdeptness.g:4045:1: ( 'not in range between' )
            // InternalAdeptness.g:4046:2: 'not in range between'
            {
             before(grammarAccess.getGapAccess().getNotInRangeBetweenKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalAdeptness.g:4055:1: rule__Gap__Group__1 : rule__Gap__Group__1__Impl rule__Gap__Group__2 ;
    public final void rule__Gap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4059:1: ( rule__Gap__Group__1__Impl rule__Gap__Group__2 )
            // InternalAdeptness.g:4060:2: rule__Gap__Group__1__Impl rule__Gap__Group__2
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
    // InternalAdeptness.g:4067:1: rule__Gap__Group__1__Impl : ( ( rule__Gap__Bound_lowerAssignment_1 ) ) ;
    public final void rule__Gap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4071:1: ( ( ( rule__Gap__Bound_lowerAssignment_1 ) ) )
            // InternalAdeptness.g:4072:1: ( ( rule__Gap__Bound_lowerAssignment_1 ) )
            {
            // InternalAdeptness.g:4072:1: ( ( rule__Gap__Bound_lowerAssignment_1 ) )
            // InternalAdeptness.g:4073:2: ( rule__Gap__Bound_lowerAssignment_1 )
            {
             before(grammarAccess.getGapAccess().getBound_lowerAssignment_1()); 
            // InternalAdeptness.g:4074:2: ( rule__Gap__Bound_lowerAssignment_1 )
            // InternalAdeptness.g:4074:3: rule__Gap__Bound_lowerAssignment_1
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
    // InternalAdeptness.g:4082:1: rule__Gap__Group__2 : rule__Gap__Group__2__Impl rule__Gap__Group__3 ;
    public final void rule__Gap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4086:1: ( rule__Gap__Group__2__Impl rule__Gap__Group__3 )
            // InternalAdeptness.g:4087:2: rule__Gap__Group__2__Impl rule__Gap__Group__3
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
    // InternalAdeptness.g:4094:1: rule__Gap__Group__2__Impl : ( 'and' ) ;
    public final void rule__Gap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4098:1: ( ( 'and' ) )
            // InternalAdeptness.g:4099:1: ( 'and' )
            {
            // InternalAdeptness.g:4099:1: ( 'and' )
            // InternalAdeptness.g:4100:2: 'and'
            {
             before(grammarAccess.getGapAccess().getAndKeyword_2()); 
            match(input,53,FOLLOW_2); 
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
    // InternalAdeptness.g:4109:1: rule__Gap__Group__3 : rule__Gap__Group__3__Impl ;
    public final void rule__Gap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4113:1: ( rule__Gap__Group__3__Impl )
            // InternalAdeptness.g:4114:2: rule__Gap__Group__3__Impl
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
    // InternalAdeptness.g:4120:1: rule__Gap__Group__3__Impl : ( ( rule__Gap__Bound_uppAssignment_3 ) ) ;
    public final void rule__Gap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4124:1: ( ( ( rule__Gap__Bound_uppAssignment_3 ) ) )
            // InternalAdeptness.g:4125:1: ( ( rule__Gap__Bound_uppAssignment_3 ) )
            {
            // InternalAdeptness.g:4125:1: ( ( rule__Gap__Bound_uppAssignment_3 ) )
            // InternalAdeptness.g:4126:2: ( rule__Gap__Bound_uppAssignment_3 )
            {
             before(grammarAccess.getGapAccess().getBound_uppAssignment_3()); 
            // InternalAdeptness.g:4127:2: ( rule__Gap__Bound_uppAssignment_3 )
            // InternalAdeptness.g:4127:3: rule__Gap__Bound_uppAssignment_3
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
    // InternalAdeptness.g:4136:1: rule__D__Group__0 : rule__D__Group__0__Impl rule__D__Group__1 ;
    public final void rule__D__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4140:1: ( rule__D__Group__0__Impl rule__D__Group__1 )
            // InternalAdeptness.g:4141:2: rule__D__Group__0__Impl rule__D__Group__1
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
    // InternalAdeptness.g:4148:1: rule__D__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__D__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4152:1: ( ( ( '-' )? ) )
            // InternalAdeptness.g:4153:1: ( ( '-' )? )
            {
            // InternalAdeptness.g:4153:1: ( ( '-' )? )
            // InternalAdeptness.g:4154:2: ( '-' )?
            {
             before(grammarAccess.getDAccess().getHyphenMinusKeyword_0()); 
            // InternalAdeptness.g:4155:2: ( '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==55) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAdeptness.g:4155:3: '-'
                    {
                    match(input,55,FOLLOW_2); 

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
    // InternalAdeptness.g:4163:1: rule__D__Group__1 : rule__D__Group__1__Impl rule__D__Group__2 ;
    public final void rule__D__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4167:1: ( rule__D__Group__1__Impl rule__D__Group__2 )
            // InternalAdeptness.g:4168:2: rule__D__Group__1__Impl rule__D__Group__2
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
    // InternalAdeptness.g:4175:1: rule__D__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__D__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4179:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:4180:1: ( RULE_INT )
            {
            // InternalAdeptness.g:4180:1: ( RULE_INT )
            // InternalAdeptness.g:4181:2: RULE_INT
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
    // InternalAdeptness.g:4190:1: rule__D__Group__2 : rule__D__Group__2__Impl ;
    public final void rule__D__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4194:1: ( rule__D__Group__2__Impl )
            // InternalAdeptness.g:4195:2: rule__D__Group__2__Impl
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
    // InternalAdeptness.g:4201:1: rule__D__Group__2__Impl : ( ( rule__D__Group_2__0 )? ) ;
    public final void rule__D__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4205:1: ( ( ( rule__D__Group_2__0 )? ) )
            // InternalAdeptness.g:4206:1: ( ( rule__D__Group_2__0 )? )
            {
            // InternalAdeptness.g:4206:1: ( ( rule__D__Group_2__0 )? )
            // InternalAdeptness.g:4207:2: ( rule__D__Group_2__0 )?
            {
             before(grammarAccess.getDAccess().getGroup_2()); 
            // InternalAdeptness.g:4208:2: ( rule__D__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==24) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAdeptness.g:4208:3: rule__D__Group_2__0
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
    // InternalAdeptness.g:4217:1: rule__D__Group_2__0 : rule__D__Group_2__0__Impl rule__D__Group_2__1 ;
    public final void rule__D__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4221:1: ( rule__D__Group_2__0__Impl rule__D__Group_2__1 )
            // InternalAdeptness.g:4222:2: rule__D__Group_2__0__Impl rule__D__Group_2__1
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
    // InternalAdeptness.g:4229:1: rule__D__Group_2__0__Impl : ( '.' ) ;
    public final void rule__D__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4233:1: ( ( '.' ) )
            // InternalAdeptness.g:4234:1: ( '.' )
            {
            // InternalAdeptness.g:4234:1: ( '.' )
            // InternalAdeptness.g:4235:2: '.'
            {
             before(grammarAccess.getDAccess().getFullStopKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAdeptness.g:4244:1: rule__D__Group_2__1 : rule__D__Group_2__1__Impl ;
    public final void rule__D__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4248:1: ( rule__D__Group_2__1__Impl )
            // InternalAdeptness.g:4249:2: rule__D__Group_2__1__Impl
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
    // InternalAdeptness.g:4255:1: rule__D__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__D__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4259:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:4260:1: ( RULE_INT )
            {
            // InternalAdeptness.g:4260:1: ( RULE_INT )
            // InternalAdeptness.g:4261:2: RULE_INT
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
    // InternalAdeptness.g:4271:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4275:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalAdeptness.g:4276:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
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
    // InternalAdeptness.g:4283:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4287:1: ( ( 'datatype' ) )
            // InternalAdeptness.g:4288:1: ( 'datatype' )
            {
            // InternalAdeptness.g:4288:1: ( 'datatype' )
            // InternalAdeptness.g:4289:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalAdeptness.g:4298:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4302:1: ( rule__DataType__Group__1__Impl )
            // InternalAdeptness.g:4303:2: rule__DataType__Group__1__Impl
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
    // InternalAdeptness.g:4309:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4313:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalAdeptness.g:4314:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:4314:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalAdeptness.g:4315:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:4316:2: ( rule__DataType__NameAssignment_1 )
            // InternalAdeptness.g:4316:3: rule__DataType__NameAssignment_1
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
    // InternalAdeptness.g:4325:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4329:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // InternalAdeptness.g:4330:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
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
    // InternalAdeptness.g:4337:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4341:1: ( ( 'package' ) )
            // InternalAdeptness.g:4342:1: ( 'package' )
            {
            // InternalAdeptness.g:4342:1: ( 'package' )
            // InternalAdeptness.g:4343:2: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalAdeptness.g:4352:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4356:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // InternalAdeptness.g:4357:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
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
    // InternalAdeptness.g:4364:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4368:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // InternalAdeptness.g:4369:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:4369:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // InternalAdeptness.g:4370:2: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:4371:2: ( rule__PackageDeclaration__NameAssignment_1 )
            // InternalAdeptness.g:4371:3: rule__PackageDeclaration__NameAssignment_1
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
    // InternalAdeptness.g:4379:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4383:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // InternalAdeptness.g:4384:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
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
    // InternalAdeptness.g:4391:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4395:1: ( ( '{' ) )
            // InternalAdeptness.g:4396:1: ( '{' )
            {
            // InternalAdeptness.g:4396:1: ( '{' )
            // InternalAdeptness.g:4397:2: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,58,FOLLOW_2); 
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
    // InternalAdeptness.g:4406:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4410:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // InternalAdeptness.g:4411:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
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
    // InternalAdeptness.g:4418:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4422:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) )
            // InternalAdeptness.g:4423:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            {
            // InternalAdeptness.g:4423:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            // InternalAdeptness.g:4424:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 
            // InternalAdeptness.g:4425:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==22||LA33_0==25||LA33_0==33||(LA33_0>=56 && LA33_0<=57)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAdeptness.g:4425:3: rule__PackageDeclaration__ElementsAssignment_3
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
    // InternalAdeptness.g:4433:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4437:1: ( rule__PackageDeclaration__Group__4__Impl )
            // InternalAdeptness.g:4438:2: rule__PackageDeclaration__Group__4__Impl
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
    // InternalAdeptness.g:4444:1: rule__PackageDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4448:1: ( ( '}' ) )
            // InternalAdeptness.g:4449:1: ( '}' )
            {
            // InternalAdeptness.g:4449:1: ( '}' )
            // InternalAdeptness.g:4450:2: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,59,FOLLOW_2); 
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
    // InternalAdeptness.g:4460:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4464:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalAdeptness.g:4465:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalAdeptness.g:4472:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4476:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalAdeptness.g:4477:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalAdeptness.g:4477:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalAdeptness.g:4478:2: ( rule__Variable__NameAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            // InternalAdeptness.g:4479:2: ( rule__Variable__NameAssignment_0 )
            // InternalAdeptness.g:4479:3: rule__Variable__NameAssignment_0
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
    // InternalAdeptness.g:4487:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4491:1: ( rule__Variable__Group__1__Impl )
            // InternalAdeptness.g:4492:2: rule__Variable__Group__1__Impl
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
    // InternalAdeptness.g:4498:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__Group_1__0 )? ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4502:1: ( ( ( rule__Variable__Group_1__0 )? ) )
            // InternalAdeptness.g:4503:1: ( ( rule__Variable__Group_1__0 )? )
            {
            // InternalAdeptness.g:4503:1: ( ( rule__Variable__Group_1__0 )? )
            // InternalAdeptness.g:4504:2: ( rule__Variable__Group_1__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_1()); 
            // InternalAdeptness.g:4505:2: ( rule__Variable__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==60) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAdeptness.g:4505:3: rule__Variable__Group_1__0
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
    // InternalAdeptness.g:4514:1: rule__Variable__Group_1__0 : rule__Variable__Group_1__0__Impl rule__Variable__Group_1__1 ;
    public final void rule__Variable__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4518:1: ( rule__Variable__Group_1__0__Impl rule__Variable__Group_1__1 )
            // InternalAdeptness.g:4519:2: rule__Variable__Group_1__0__Impl rule__Variable__Group_1__1
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
    // InternalAdeptness.g:4526:1: rule__Variable__Group_1__0__Impl : ( '=' ) ;
    public final void rule__Variable__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4530:1: ( ( '=' ) )
            // InternalAdeptness.g:4531:1: ( '=' )
            {
            // InternalAdeptness.g:4531:1: ( '=' )
            // InternalAdeptness.g:4532:2: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalAdeptness.g:4541:1: rule__Variable__Group_1__1 : rule__Variable__Group_1__1__Impl ;
    public final void rule__Variable__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4545:1: ( rule__Variable__Group_1__1__Impl )
            // InternalAdeptness.g:4546:2: rule__Variable__Group_1__1__Impl
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
    // InternalAdeptness.g:4552:1: rule__Variable__Group_1__1__Impl : ( ( rule__Variable__ExpressionAssignment_1_1 ) ) ;
    public final void rule__Variable__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4556:1: ( ( ( rule__Variable__ExpressionAssignment_1_1 ) ) )
            // InternalAdeptness.g:4557:1: ( ( rule__Variable__ExpressionAssignment_1_1 ) )
            {
            // InternalAdeptness.g:4557:1: ( ( rule__Variable__ExpressionAssignment_1_1 ) )
            // InternalAdeptness.g:4558:2: ( rule__Variable__ExpressionAssignment_1_1 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_1_1()); 
            // InternalAdeptness.g:4559:2: ( rule__Variable__ExpressionAssignment_1_1 )
            // InternalAdeptness.g:4559:3: rule__Variable__ExpressionAssignment_1_1
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
    // InternalAdeptness.g:4568:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4572:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalAdeptness.g:4573:2: rule__Or__Group__0__Impl rule__Or__Group__1
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
    // InternalAdeptness.g:4580:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4584:1: ( ( ruleAnd ) )
            // InternalAdeptness.g:4585:1: ( ruleAnd )
            {
            // InternalAdeptness.g:4585:1: ( ruleAnd )
            // InternalAdeptness.g:4586:2: ruleAnd
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
    // InternalAdeptness.g:4595:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4599:1: ( rule__Or__Group__1__Impl )
            // InternalAdeptness.g:4600:2: rule__Or__Group__1__Impl
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
    // InternalAdeptness.g:4606:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4610:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalAdeptness.g:4611:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalAdeptness.g:4611:1: ( ( rule__Or__Group_1__0 )* )
            // InternalAdeptness.g:4612:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalAdeptness.g:4613:2: ( rule__Or__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==61) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAdeptness.g:4613:3: rule__Or__Group_1__0
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
    // InternalAdeptness.g:4622:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4626:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalAdeptness.g:4627:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
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
    // InternalAdeptness.g:4634:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4638:1: ( ( () ) )
            // InternalAdeptness.g:4639:1: ( () )
            {
            // InternalAdeptness.g:4639:1: ( () )
            // InternalAdeptness.g:4640:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalAdeptness.g:4641:2: ()
            // InternalAdeptness.g:4641:3: 
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
    // InternalAdeptness.g:4649:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4653:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalAdeptness.g:4654:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
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
    // InternalAdeptness.g:4661:1: rule__Or__Group_1__1__Impl : ( '||' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4665:1: ( ( '||' ) )
            // InternalAdeptness.g:4666:1: ( '||' )
            {
            // InternalAdeptness.g:4666:1: ( '||' )
            // InternalAdeptness.g:4667:2: '||'
            {
             before(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalAdeptness.g:4676:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4680:1: ( rule__Or__Group_1__2__Impl )
            // InternalAdeptness.g:4681:2: rule__Or__Group_1__2__Impl
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
    // InternalAdeptness.g:4687:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4691:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalAdeptness.g:4692:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalAdeptness.g:4692:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalAdeptness.g:4693:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalAdeptness.g:4694:2: ( rule__Or__RightAssignment_1_2 )
            // InternalAdeptness.g:4694:3: rule__Or__RightAssignment_1_2
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
    // InternalAdeptness.g:4703:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4707:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalAdeptness.g:4708:2: rule__And__Group__0__Impl rule__And__Group__1
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
    // InternalAdeptness.g:4715:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4719:1: ( ( ruleEquality ) )
            // InternalAdeptness.g:4720:1: ( ruleEquality )
            {
            // InternalAdeptness.g:4720:1: ( ruleEquality )
            // InternalAdeptness.g:4721:2: ruleEquality
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
    // InternalAdeptness.g:4730:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4734:1: ( rule__And__Group__1__Impl )
            // InternalAdeptness.g:4735:2: rule__And__Group__1__Impl
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
    // InternalAdeptness.g:4741:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4745:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalAdeptness.g:4746:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalAdeptness.g:4746:1: ( ( rule__And__Group_1__0 )* )
            // InternalAdeptness.g:4747:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalAdeptness.g:4748:2: ( rule__And__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==62) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAdeptness.g:4748:3: rule__And__Group_1__0
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
    // InternalAdeptness.g:4757:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4761:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalAdeptness.g:4762:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
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
    // InternalAdeptness.g:4769:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4773:1: ( ( () ) )
            // InternalAdeptness.g:4774:1: ( () )
            {
            // InternalAdeptness.g:4774:1: ( () )
            // InternalAdeptness.g:4775:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalAdeptness.g:4776:2: ()
            // InternalAdeptness.g:4776:3: 
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
    // InternalAdeptness.g:4784:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4788:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalAdeptness.g:4789:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
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
    // InternalAdeptness.g:4796:1: rule__And__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4800:1: ( ( '&&' ) )
            // InternalAdeptness.g:4801:1: ( '&&' )
            {
            // InternalAdeptness.g:4801:1: ( '&&' )
            // InternalAdeptness.g:4802:2: '&&'
            {
             before(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,62,FOLLOW_2); 
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
    // InternalAdeptness.g:4811:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4815:1: ( rule__And__Group_1__2__Impl )
            // InternalAdeptness.g:4816:2: rule__And__Group_1__2__Impl
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
    // InternalAdeptness.g:4822:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4826:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalAdeptness.g:4827:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalAdeptness.g:4827:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalAdeptness.g:4828:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalAdeptness.g:4829:2: ( rule__And__RightAssignment_1_2 )
            // InternalAdeptness.g:4829:3: rule__And__RightAssignment_1_2
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
    // InternalAdeptness.g:4838:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4842:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalAdeptness.g:4843:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
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
    // InternalAdeptness.g:4850:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4854:1: ( ( ruleComparison ) )
            // InternalAdeptness.g:4855:1: ( ruleComparison )
            {
            // InternalAdeptness.g:4855:1: ( ruleComparison )
            // InternalAdeptness.g:4856:2: ruleComparison
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
    // InternalAdeptness.g:4865:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4869:1: ( rule__Equality__Group__1__Impl )
            // InternalAdeptness.g:4870:2: rule__Equality__Group__1__Impl
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
    // InternalAdeptness.g:4876:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4880:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalAdeptness.g:4881:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalAdeptness.g:4881:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalAdeptness.g:4882:2: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // InternalAdeptness.g:4883:2: ( rule__Equality__Group_1__0 )*
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
            	    // InternalAdeptness.g:4883:3: rule__Equality__Group_1__0
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
    // InternalAdeptness.g:4892:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4896:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalAdeptness.g:4897:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
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
    // InternalAdeptness.g:4904:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4908:1: ( ( () ) )
            // InternalAdeptness.g:4909:1: ( () )
            {
            // InternalAdeptness.g:4909:1: ( () )
            // InternalAdeptness.g:4910:2: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // InternalAdeptness.g:4911:2: ()
            // InternalAdeptness.g:4911:3: 
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
    // InternalAdeptness.g:4919:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4923:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // InternalAdeptness.g:4924:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
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
    // InternalAdeptness.g:4931:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4935:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // InternalAdeptness.g:4936:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // InternalAdeptness.g:4936:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // InternalAdeptness.g:4937:2: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // InternalAdeptness.g:4938:2: ( rule__Equality__OpAssignment_1_1 )
            // InternalAdeptness.g:4938:3: rule__Equality__OpAssignment_1_1
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
    // InternalAdeptness.g:4946:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4950:1: ( rule__Equality__Group_1__2__Impl )
            // InternalAdeptness.g:4951:2: rule__Equality__Group_1__2__Impl
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
    // InternalAdeptness.g:4957:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4961:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // InternalAdeptness.g:4962:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // InternalAdeptness.g:4962:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // InternalAdeptness.g:4963:2: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // InternalAdeptness.g:4964:2: ( rule__Equality__RightAssignment_1_2 )
            // InternalAdeptness.g:4964:3: rule__Equality__RightAssignment_1_2
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
    // InternalAdeptness.g:4973:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4977:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalAdeptness.g:4978:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
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
    // InternalAdeptness.g:4985:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:4989:1: ( ( rulePlusOrMinus ) )
            // InternalAdeptness.g:4990:1: ( rulePlusOrMinus )
            {
            // InternalAdeptness.g:4990:1: ( rulePlusOrMinus )
            // InternalAdeptness.g:4991:2: rulePlusOrMinus
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
    // InternalAdeptness.g:5000:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5004:1: ( rule__Comparison__Group__1__Impl )
            // InternalAdeptness.g:5005:2: rule__Comparison__Group__1__Impl
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
    // InternalAdeptness.g:5011:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5015:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalAdeptness.g:5016:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalAdeptness.g:5016:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalAdeptness.g:5017:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalAdeptness.g:5018:2: ( rule__Comparison__Group_1__0 )*
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
            	    // InternalAdeptness.g:5018:3: rule__Comparison__Group_1__0
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
    // InternalAdeptness.g:5027:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5031:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalAdeptness.g:5032:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
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
    // InternalAdeptness.g:5039:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5043:1: ( ( () ) )
            // InternalAdeptness.g:5044:1: ( () )
            {
            // InternalAdeptness.g:5044:1: ( () )
            // InternalAdeptness.g:5045:2: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // InternalAdeptness.g:5046:2: ()
            // InternalAdeptness.g:5046:3: 
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
    // InternalAdeptness.g:5054:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5058:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // InternalAdeptness.g:5059:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
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
    // InternalAdeptness.g:5066:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5070:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // InternalAdeptness.g:5071:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // InternalAdeptness.g:5071:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // InternalAdeptness.g:5072:2: ( rule__Comparison__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            // InternalAdeptness.g:5073:2: ( rule__Comparison__OpAssignment_1_1 )
            // InternalAdeptness.g:5073:3: rule__Comparison__OpAssignment_1_1
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
    // InternalAdeptness.g:5081:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5085:1: ( rule__Comparison__Group_1__2__Impl )
            // InternalAdeptness.g:5086:2: rule__Comparison__Group_1__2__Impl
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
    // InternalAdeptness.g:5092:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5096:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // InternalAdeptness.g:5097:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // InternalAdeptness.g:5097:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // InternalAdeptness.g:5098:2: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // InternalAdeptness.g:5099:2: ( rule__Comparison__RightAssignment_1_2 )
            // InternalAdeptness.g:5099:3: rule__Comparison__RightAssignment_1_2
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
    // InternalAdeptness.g:5108:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5112:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalAdeptness.g:5113:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
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
    // InternalAdeptness.g:5120:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5124:1: ( ( ruleMulOrDiv ) )
            // InternalAdeptness.g:5125:1: ( ruleMulOrDiv )
            {
            // InternalAdeptness.g:5125:1: ( ruleMulOrDiv )
            // InternalAdeptness.g:5126:2: ruleMulOrDiv
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
    // InternalAdeptness.g:5135:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5139:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalAdeptness.g:5140:2: rule__PlusOrMinus__Group__1__Impl
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
    // InternalAdeptness.g:5146:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5150:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalAdeptness.g:5151:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalAdeptness.g:5151:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalAdeptness.g:5152:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // InternalAdeptness.g:5153:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==63) ) {
                    alt39=1;
                }
                else if ( (LA39_0==55) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAdeptness.g:5153:3: rule__PlusOrMinus__Group_1__0
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
    // InternalAdeptness.g:5162:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5166:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalAdeptness.g:5167:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
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
    // InternalAdeptness.g:5174:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5178:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalAdeptness.g:5179:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalAdeptness.g:5179:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalAdeptness.g:5180:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // InternalAdeptness.g:5181:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalAdeptness.g:5181:3: rule__PlusOrMinus__Alternatives_1_0
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
    // InternalAdeptness.g:5189:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5193:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalAdeptness.g:5194:2: rule__PlusOrMinus__Group_1__1__Impl
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
    // InternalAdeptness.g:5200:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5204:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalAdeptness.g:5205:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalAdeptness.g:5205:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalAdeptness.g:5206:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // InternalAdeptness.g:5207:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalAdeptness.g:5207:3: rule__PlusOrMinus__RightAssignment_1_1
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
    // InternalAdeptness.g:5216:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5220:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalAdeptness.g:5221:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
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
    // InternalAdeptness.g:5228:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5232:1: ( ( () ) )
            // InternalAdeptness.g:5233:1: ( () )
            {
            // InternalAdeptness.g:5233:1: ( () )
            // InternalAdeptness.g:5234:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalAdeptness.g:5235:2: ()
            // InternalAdeptness.g:5235:3: 
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
    // InternalAdeptness.g:5243:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5247:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalAdeptness.g:5248:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
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
    // InternalAdeptness.g:5254:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5258:1: ( ( '+' ) )
            // InternalAdeptness.g:5259:1: ( '+' )
            {
            // InternalAdeptness.g:5259:1: ( '+' )
            // InternalAdeptness.g:5260:2: '+'
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,63,FOLLOW_2); 
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
    // InternalAdeptness.g:5270:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5274:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalAdeptness.g:5275:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
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
    // InternalAdeptness.g:5282:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5286:1: ( ( () ) )
            // InternalAdeptness.g:5287:1: ( () )
            {
            // InternalAdeptness.g:5287:1: ( () )
            // InternalAdeptness.g:5288:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalAdeptness.g:5289:2: ()
            // InternalAdeptness.g:5289:3: 
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
    // InternalAdeptness.g:5297:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5301:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalAdeptness.g:5302:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
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
    // InternalAdeptness.g:5308:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5312:1: ( ( '-' ) )
            // InternalAdeptness.g:5313:1: ( '-' )
            {
            // InternalAdeptness.g:5313:1: ( '-' )
            // InternalAdeptness.g:5314:2: '-'
            {
             before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalAdeptness.g:5324:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5328:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalAdeptness.g:5329:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
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
    // InternalAdeptness.g:5336:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5340:1: ( ( rulePrimary ) )
            // InternalAdeptness.g:5341:1: ( rulePrimary )
            {
            // InternalAdeptness.g:5341:1: ( rulePrimary )
            // InternalAdeptness.g:5342:2: rulePrimary
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
    // InternalAdeptness.g:5351:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5355:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalAdeptness.g:5356:2: rule__MulOrDiv__Group__1__Impl
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
    // InternalAdeptness.g:5362:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5366:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalAdeptness.g:5367:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalAdeptness.g:5367:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalAdeptness.g:5368:2: ( rule__MulOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // InternalAdeptness.g:5369:2: ( rule__MulOrDiv__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    alt40=1;
                    }
                    break;
                case 20:
                    {
                    alt40=1;
                    }
                    break;
                case 21:
                    {
                    alt40=1;
                    }
                    break;

                }

                switch (alt40) {
            	case 1 :
            	    // InternalAdeptness.g:5369:3: rule__MulOrDiv__Group_1__0
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
    // InternalAdeptness.g:5378:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5382:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalAdeptness.g:5383:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
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
    // InternalAdeptness.g:5390:1: rule__MulOrDiv__Group_1__0__Impl : ( ( rule__MulOrDiv__Group_1_0__0 ) ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5394:1: ( ( ( rule__MulOrDiv__Group_1_0__0 ) ) )
            // InternalAdeptness.g:5395:1: ( ( rule__MulOrDiv__Group_1_0__0 ) )
            {
            // InternalAdeptness.g:5395:1: ( ( rule__MulOrDiv__Group_1_0__0 ) )
            // InternalAdeptness.g:5396:2: ( rule__MulOrDiv__Group_1_0__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1_0()); 
            // InternalAdeptness.g:5397:2: ( rule__MulOrDiv__Group_1_0__0 )
            // InternalAdeptness.g:5397:3: rule__MulOrDiv__Group_1_0__0
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
    // InternalAdeptness.g:5405:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5409:1: ( rule__MulOrDiv__Group_1__1__Impl )
            // InternalAdeptness.g:5410:2: rule__MulOrDiv__Group_1__1__Impl
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
    // InternalAdeptness.g:5416:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5420:1: ( ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) )
            // InternalAdeptness.g:5421:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            {
            // InternalAdeptness.g:5421:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            // InternalAdeptness.g:5422:2: ( rule__MulOrDiv__RightAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); 
            // InternalAdeptness.g:5423:2: ( rule__MulOrDiv__RightAssignment_1_1 )
            // InternalAdeptness.g:5423:3: rule__MulOrDiv__RightAssignment_1_1
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
    // InternalAdeptness.g:5432:1: rule__MulOrDiv__Group_1_0__0 : rule__MulOrDiv__Group_1_0__0__Impl rule__MulOrDiv__Group_1_0__1 ;
    public final void rule__MulOrDiv__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5436:1: ( rule__MulOrDiv__Group_1_0__0__Impl rule__MulOrDiv__Group_1_0__1 )
            // InternalAdeptness.g:5437:2: rule__MulOrDiv__Group_1_0__0__Impl rule__MulOrDiv__Group_1_0__1
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
    // InternalAdeptness.g:5444:1: rule__MulOrDiv__Group_1_0__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5448:1: ( ( () ) )
            // InternalAdeptness.g:5449:1: ( () )
            {
            // InternalAdeptness.g:5449:1: ( () )
            // InternalAdeptness.g:5450:2: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0_0()); 
            // InternalAdeptness.g:5451:2: ()
            // InternalAdeptness.g:5451:3: 
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
    // InternalAdeptness.g:5459:1: rule__MulOrDiv__Group_1_0__1 : rule__MulOrDiv__Group_1_0__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5463:1: ( rule__MulOrDiv__Group_1_0__1__Impl )
            // InternalAdeptness.g:5464:2: rule__MulOrDiv__Group_1_0__1__Impl
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
    // InternalAdeptness.g:5470:1: rule__MulOrDiv__Group_1_0__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) ) ;
    public final void rule__MulOrDiv__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5474:1: ( ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) ) )
            // InternalAdeptness.g:5475:1: ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) )
            {
            // InternalAdeptness.g:5475:1: ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) )
            // InternalAdeptness.g:5476:2: ( rule__MulOrDiv__OpAssignment_1_0_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_0_1()); 
            // InternalAdeptness.g:5477:2: ( rule__MulOrDiv__OpAssignment_1_0_1 )
            // InternalAdeptness.g:5477:3: rule__MulOrDiv__OpAssignment_1_0_1
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
    // InternalAdeptness.g:5486:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5490:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalAdeptness.g:5491:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
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
    // InternalAdeptness.g:5498:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5502:1: ( ( '(' ) )
            // InternalAdeptness.g:5503:1: ( '(' )
            {
            // InternalAdeptness.g:5503:1: ( '(' )
            // InternalAdeptness.g:5504:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalAdeptness.g:5513:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5517:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalAdeptness.g:5518:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
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
    // InternalAdeptness.g:5525:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5529:1: ( ( ruleExpression ) )
            // InternalAdeptness.g:5530:1: ( ruleExpression )
            {
            // InternalAdeptness.g:5530:1: ( ruleExpression )
            // InternalAdeptness.g:5531:2: ruleExpression
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
    // InternalAdeptness.g:5540:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5544:1: ( rule__Primary__Group_0__2__Impl )
            // InternalAdeptness.g:5545:2: rule__Primary__Group_0__2__Impl
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
    // InternalAdeptness.g:5551:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5555:1: ( ( ')' ) )
            // InternalAdeptness.g:5556:1: ( ')' )
            {
            // InternalAdeptness.g:5556:1: ( ')' )
            // InternalAdeptness.g:5557:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,65,FOLLOW_2); 
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
    // InternalAdeptness.g:5567:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5571:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalAdeptness.g:5572:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
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
    // InternalAdeptness.g:5579:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5583:1: ( ( () ) )
            // InternalAdeptness.g:5584:1: ( () )
            {
            // InternalAdeptness.g:5584:1: ( () )
            // InternalAdeptness.g:5585:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            // InternalAdeptness.g:5586:2: ()
            // InternalAdeptness.g:5586:3: 
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
    // InternalAdeptness.g:5594:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5598:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalAdeptness.g:5599:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
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
    // InternalAdeptness.g:5606:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5610:1: ( ( '!' ) )
            // InternalAdeptness.g:5611:1: ( '!' )
            {
            // InternalAdeptness.g:5611:1: ( '!' )
            // InternalAdeptness.g:5612:2: '!'
            {
             before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalAdeptness.g:5621:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5625:1: ( rule__Primary__Group_1__2__Impl )
            // InternalAdeptness.g:5626:2: rule__Primary__Group_1__2__Impl
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
    // InternalAdeptness.g:5632:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5636:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // InternalAdeptness.g:5637:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // InternalAdeptness.g:5637:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // InternalAdeptness.g:5638:2: ( rule__Primary__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            // InternalAdeptness.g:5639:2: ( rule__Primary__ExpressionAssignment_1_2 )
            // InternalAdeptness.g:5639:3: rule__Primary__ExpressionAssignment_1_2
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
    // InternalAdeptness.g:5648:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5652:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalAdeptness.g:5653:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
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
    // InternalAdeptness.g:5660:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5664:1: ( ( () ) )
            // InternalAdeptness.g:5665:1: ( () )
            {
            // InternalAdeptness.g:5665:1: ( () )
            // InternalAdeptness.g:5666:2: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 
            // InternalAdeptness.g:5667:2: ()
            // InternalAdeptness.g:5667:3: 
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
    // InternalAdeptness.g:5675:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5679:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalAdeptness.g:5680:2: rule__Atomic__Group_0__1__Impl
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
    // InternalAdeptness.g:5686:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5690:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalAdeptness.g:5691:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalAdeptness.g:5691:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalAdeptness.g:5692:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // InternalAdeptness.g:5693:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalAdeptness.g:5693:3: rule__Atomic__ValueAssignment_0_1
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
    // InternalAdeptness.g:5702:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5706:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalAdeptness.g:5707:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
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
    // InternalAdeptness.g:5714:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5718:1: ( ( () ) )
            // InternalAdeptness.g:5719:1: ( () )
            {
            // InternalAdeptness.g:5719:1: ( () )
            // InternalAdeptness.g:5720:2: ()
            {
             before(grammarAccess.getAtomicAccess().getStringConstantAction_1_0()); 
            // InternalAdeptness.g:5721:2: ()
            // InternalAdeptness.g:5721:3: 
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
    // InternalAdeptness.g:5729:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5733:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalAdeptness.g:5734:2: rule__Atomic__Group_1__1__Impl
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
    // InternalAdeptness.g:5740:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5744:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // InternalAdeptness.g:5745:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // InternalAdeptness.g:5745:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // InternalAdeptness.g:5746:2: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // InternalAdeptness.g:5747:2: ( rule__Atomic__ValueAssignment_1_1 )
            // InternalAdeptness.g:5747:3: rule__Atomic__ValueAssignment_1_1
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
    // InternalAdeptness.g:5756:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5760:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalAdeptness.g:5761:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
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
    // InternalAdeptness.g:5768:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5772:1: ( ( () ) )
            // InternalAdeptness.g:5773:1: ( () )
            {
            // InternalAdeptness.g:5773:1: ( () )
            // InternalAdeptness.g:5774:2: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 
            // InternalAdeptness.g:5775:2: ()
            // InternalAdeptness.g:5775:3: 
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
    // InternalAdeptness.g:5783:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5787:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalAdeptness.g:5788:2: rule__Atomic__Group_2__1__Impl
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
    // InternalAdeptness.g:5794:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5798:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalAdeptness.g:5799:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalAdeptness.g:5799:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalAdeptness.g:5800:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // InternalAdeptness.g:5801:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalAdeptness.g:5801:3: rule__Atomic__ValueAssignment_2_1
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
    // InternalAdeptness.g:5810:1: rule__Adeptness__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Adeptness__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5814:1: ( ( ruleAbstractElement ) )
            // InternalAdeptness.g:5815:2: ( ruleAbstractElement )
            {
            // InternalAdeptness.g:5815:2: ( ruleAbstractElement )
            // InternalAdeptness.g:5816:3: ruleAbstractElement
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
    // InternalAdeptness.g:5825:1: rule__Imports__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Imports__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5829:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalAdeptness.g:5830:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalAdeptness.g:5830:2: ( ruleQualifiedNameWithWildcard )
            // InternalAdeptness.g:5831:3: ruleQualifiedNameWithWildcard
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
    // InternalAdeptness.g:5840:1: rule__MonitoringFile__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MonitoringFile__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5844:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:5845:2: ( RULE_ID )
            {
            // InternalAdeptness.g:5845:2: ( RULE_ID )
            // InternalAdeptness.g:5846:3: RULE_ID
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
    // InternalAdeptness.g:5855:1: rule__MonitoringFile__MonitoringPlanAssignment_3 : ( ruleMonitoringPlan ) ;
    public final void rule__MonitoringFile__MonitoringPlanAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5859:1: ( ( ruleMonitoringPlan ) )
            // InternalAdeptness.g:5860:2: ( ruleMonitoringPlan )
            {
            // InternalAdeptness.g:5860:2: ( ruleMonitoringPlan )
            // InternalAdeptness.g:5861:3: ruleMonitoringPlan
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
    // InternalAdeptness.g:5870:1: rule__MonitoringPlan__MonitoringVariablesAssignment : ( ruleMonitoringVariable ) ;
    public final void rule__MonitoringPlan__MonitoringVariablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5874:1: ( ( ruleMonitoringVariable ) )
            // InternalAdeptness.g:5875:2: ( ruleMonitoringVariable )
            {
            // InternalAdeptness.g:5875:2: ( ruleMonitoringVariable )
            // InternalAdeptness.g:5876:3: ruleMonitoringVariable
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
    // InternalAdeptness.g:5885:1: rule__MonitoringVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MonitoringVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5889:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:5890:2: ( RULE_ID )
            {
            // InternalAdeptness.g:5890:2: ( RULE_ID )
            // InternalAdeptness.g:5891:3: RULE_ID
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
    // InternalAdeptness.g:5900:1: rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5 : ( ruleSig_type ) ;
    public final void rule__MonitoringVariable__MonitoringVariableDatatypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5904:1: ( ( ruleSig_type ) )
            // InternalAdeptness.g:5905:2: ( ruleSig_type )
            {
            // InternalAdeptness.g:5905:2: ( ruleSig_type )
            // InternalAdeptness.g:5906:3: ruleSig_type
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
    // InternalAdeptness.g:5915:1: rule__MonitoringVariable__MaxAssignment_6_2 : ( ruleDOUBLE ) ;
    public final void rule__MonitoringVariable__MaxAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5919:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:5920:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:5920:2: ( ruleDOUBLE )
            // InternalAdeptness.g:5921:3: ruleDOUBLE
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
    // InternalAdeptness.g:5930:1: rule__MonitoringVariable__MinAssignment_6_5 : ( ruleDOUBLE ) ;
    public final void rule__MonitoringVariable__MinAssignment_6_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5934:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:5935:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:5935:2: ( ruleDOUBLE )
            // InternalAdeptness.g:5936:3: ruleDOUBLE
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
    // InternalAdeptness.g:5945:1: rule__Sig_type__Sig_typeAssignment_0 : ( ( 'boolean' ) ) ;
    public final void rule__Sig_type__Sig_typeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5949:1: ( ( ( 'boolean' ) ) )
            // InternalAdeptness.g:5950:2: ( ( 'boolean' ) )
            {
            // InternalAdeptness.g:5950:2: ( ( 'boolean' ) )
            // InternalAdeptness.g:5951:3: ( 'boolean' )
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeBooleanKeyword_0_0()); 
            // InternalAdeptness.g:5952:3: ( 'boolean' )
            // InternalAdeptness.g:5953:4: 'boolean'
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeBooleanKeyword_0_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalAdeptness.g:5964:1: rule__Sig_type__Sig_typeAssignment_1 : ( ( 'int' ) ) ;
    public final void rule__Sig_type__Sig_typeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5968:1: ( ( ( 'int' ) ) )
            // InternalAdeptness.g:5969:2: ( ( 'int' ) )
            {
            // InternalAdeptness.g:5969:2: ( ( 'int' ) )
            // InternalAdeptness.g:5970:3: ( 'int' )
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeIntKeyword_1_0()); 
            // InternalAdeptness.g:5971:3: ( 'int' )
            // InternalAdeptness.g:5972:4: 'int'
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeIntKeyword_1_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalAdeptness.g:5983:1: rule__Sig_type__Sig_typeAssignment_2 : ( ( 'double' ) ) ;
    public final void rule__Sig_type__Sig_typeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:5987:1: ( ( ( 'double' ) ) )
            // InternalAdeptness.g:5988:2: ( ( 'double' ) )
            {
            // InternalAdeptness.g:5988:2: ( ( 'double' ) )
            // InternalAdeptness.g:5989:3: ( 'double' )
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeDoubleKeyword_2_0()); 
            // InternalAdeptness.g:5990:3: ( 'double' )
            // InternalAdeptness.g:5991:4: 'double'
            {
             before(grammarAccess.getSig_typeAccess().getSig_typeDoubleKeyword_2_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalAdeptness.g:6002:1: rule__Signal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6006:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:6007:2: ( RULE_ID )
            {
            // InternalAdeptness.g:6007:2: ( RULE_ID )
            // InternalAdeptness.g:6008:3: RULE_ID
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
    // InternalAdeptness.g:6017:1: rule__Signal__CardinalityNumCPSAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Signal__CardinalityNumCPSAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6021:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:6022:2: ( RULE_INT )
            {
            // InternalAdeptness.g:6022:2: ( RULE_INT )
            // InternalAdeptness.g:6023:3: RULE_INT
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
    // InternalAdeptness.g:6032:1: rule__Signal__SuperTypeAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Signal__SuperTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6036:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAdeptness.g:6037:2: ( ( ruleQualifiedName ) )
            {
            // InternalAdeptness.g:6037:2: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:6038:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSignalAccess().getSuperTypeMonitoringFileCrossReference_4_1_0()); 
            // InternalAdeptness.g:6039:3: ( ruleQualifiedName )
            // InternalAdeptness.g:6040:4: ruleQualifiedName
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
    // InternalAdeptness.g:6051:1: rule__Signal__OracleAssignment_5 : ( ruleOracle ) ;
    public final void rule__Signal__OracleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6055:1: ( ( ruleOracle ) )
            // InternalAdeptness.g:6056:2: ( ruleOracle )
            {
            // InternalAdeptness.g:6056:2: ( ruleOracle )
            // InternalAdeptness.g:6057:3: ruleOracle
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
    // InternalAdeptness.g:6066:1: rule__Oracle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Oracle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6070:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:6071:2: ( RULE_ID )
            {
            // InternalAdeptness.g:6071:2: ( RULE_ID )
            // InternalAdeptness.g:6072:3: RULE_ID
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
    // InternalAdeptness.g:6081:1: rule__Oracle__WhenAssignment_3 : ( ruleWhen ) ;
    public final void rule__Oracle__WhenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6085:1: ( ( ruleWhen ) )
            // InternalAdeptness.g:6086:2: ( ruleWhen )
            {
            // InternalAdeptness.g:6086:2: ( ruleWhen )
            // InternalAdeptness.g:6087:3: ruleWhen
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
    // InternalAdeptness.g:6096:1: rule__Oracle__CheckAssignment_4 : ( ruleChecks ) ;
    public final void rule__Oracle__CheckAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6100:1: ( ( ruleChecks ) )
            // InternalAdeptness.g:6101:2: ( ruleChecks )
            {
            // InternalAdeptness.g:6101:2: ( ruleChecks )
            // InternalAdeptness.g:6102:3: ruleChecks
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
    // InternalAdeptness.g:6111:1: rule__When__EmAssignment_1 : ( ruleExpressionsModel ) ;
    public final void rule__When__EmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6115:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:6116:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:6116:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:6117:3: ruleExpressionsModel
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
    // InternalAdeptness.g:6126:1: rule__Checks__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Checks__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6130:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:6131:2: ( RULE_ID )
            {
            // InternalAdeptness.g:6131:2: ( RULE_ID )
            // InternalAdeptness.g:6132:3: RULE_ID
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
    // InternalAdeptness.g:6141:1: rule__Checks__EmAssignment_1_1 : ( ruleExpressionsModel ) ;
    public final void rule__Checks__EmAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6145:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:6146:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:6146:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:6147:3: ruleExpressionsModel
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
    // InternalAdeptness.g:6156:1: rule__Checks__ReferenceAssignment_2 : ( ruleReference ) ;
    public final void rule__Checks__ReferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6160:1: ( ( ruleReference ) )
            // InternalAdeptness.g:6161:2: ( ruleReference )
            {
            // InternalAdeptness.g:6161:2: ( ruleReference )
            // InternalAdeptness.g:6162:3: ruleReference
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
    // InternalAdeptness.g:6171:1: rule__Checks__FailReasonAssignment_3 : ( ruleFailReason ) ;
    public final void rule__Checks__FailReasonAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6175:1: ( ( ruleFailReason ) )
            // InternalAdeptness.g:6176:2: ( ruleFailReason )
            {
            // InternalAdeptness.g:6176:2: ( ruleFailReason )
            // InternalAdeptness.g:6177:3: ruleFailReason
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
    // InternalAdeptness.g:6186:1: rule__Checks__DescriptionAssignment_4 : ( ruleDescription ) ;
    public final void rule__Checks__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6190:1: ( ( ruleDescription ) )
            // InternalAdeptness.g:6191:2: ( ruleDescription )
            {
            // InternalAdeptness.g:6191:2: ( ruleDescription )
            // InternalAdeptness.g:6192:3: ruleDescription
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
    // InternalAdeptness.g:6201:1: rule__Description__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6205:1: ( ( RULE_STRING ) )
            // InternalAdeptness.g:6206:2: ( RULE_STRING )
            {
            // InternalAdeptness.g:6206:2: ( RULE_STRING )
            // InternalAdeptness.g:6207:3: RULE_STRING
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
    // InternalAdeptness.g:6216:1: rule__FailReason__ReasonAssignment_1 : ( ruleReason ) ;
    public final void rule__FailReason__ReasonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6220:1: ( ( ruleReason ) )
            // InternalAdeptness.g:6221:2: ( ruleReason )
            {
            // InternalAdeptness.g:6221:2: ( ruleReason )
            // InternalAdeptness.g:6222:3: ruleReason
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
    // InternalAdeptness.g:6231:1: rule__Reason__HighPeakAssignment_0_0 : ( ruleHighPeak ) ;
    public final void rule__Reason__HighPeakAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6235:1: ( ( ruleHighPeak ) )
            // InternalAdeptness.g:6236:2: ( ruleHighPeak )
            {
            // InternalAdeptness.g:6236:2: ( ruleHighPeak )
            // InternalAdeptness.g:6237:3: ruleHighPeak
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
    // InternalAdeptness.g:6246:1: rule__Reason__HighTimeAssignment_0_1 : ( ruleHighTime ) ;
    public final void rule__Reason__HighTimeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6250:1: ( ( ruleHighTime ) )
            // InternalAdeptness.g:6251:2: ( ruleHighTime )
            {
            // InternalAdeptness.g:6251:2: ( ruleHighTime )
            // InternalAdeptness.g:6252:3: ruleHighTime
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
    // InternalAdeptness.g:6261:1: rule__Reason__ConstDegAssignment_0_2 : ( ruleConstDeg ) ;
    public final void rule__Reason__ConstDegAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6265:1: ( ( ruleConstDeg ) )
            // InternalAdeptness.g:6266:2: ( ruleConstDeg )
            {
            // InternalAdeptness.g:6266:2: ( ruleConstDeg )
            // InternalAdeptness.g:6267:3: ruleConstDeg
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
    // InternalAdeptness.g:6276:1: rule__Reason__XPeaksAssignment_0_3 : ( ruleXPeaks ) ;
    public final void rule__Reason__XPeaksAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6280:1: ( ( ruleXPeaks ) )
            // InternalAdeptness.g:6281:2: ( ruleXPeaks )
            {
            // InternalAdeptness.g:6281:2: ( ruleXPeaks )
            // InternalAdeptness.g:6282:3: ruleXPeaks
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
    // InternalAdeptness.g:6291:1: rule__XPeaks__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__XPeaks__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6295:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6296:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6296:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6297:3: ruleDOUBLE
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
    // InternalAdeptness.g:6306:1: rule__XPeaks__NPeaksAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__XPeaks__NPeaksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6310:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6311:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6311:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6312:3: ruleDOUBLE
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
    // InternalAdeptness.g:6321:1: rule__XPeaks__TimeAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__XPeaks__TimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6325:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6326:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6326:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6327:3: ruleDOUBLE
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
    // InternalAdeptness.g:6336:1: rule__XPeaks__UnitAssignment_6 : ( ruleTimeType ) ;
    public final void rule__XPeaks__UnitAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6340:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:6341:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:6341:2: ( ruleTimeType )
            // InternalAdeptness.g:6342:3: ruleTimeType
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
    // InternalAdeptness.g:6351:1: rule__ConstDeg__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__ConstDeg__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6355:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6356:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6356:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6357:3: ruleDOUBLE
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
    // InternalAdeptness.g:6366:1: rule__HighTime__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__HighTime__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6370:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6371:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6371:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6372:3: ruleDOUBLE
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
    // InternalAdeptness.g:6381:1: rule__HighTime__TimeAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__HighTime__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6385:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6386:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6386:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6387:3: ruleDOUBLE
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
    // InternalAdeptness.g:6396:1: rule__HighTime__UnitAssignment_4 : ( ruleTimeType ) ;
    public final void rule__HighTime__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6400:1: ( ( ruleTimeType ) )
            // InternalAdeptness.g:6401:2: ( ruleTimeType )
            {
            // InternalAdeptness.g:6401:2: ( ruleTimeType )
            // InternalAdeptness.g:6402:3: ruleTimeType
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
    // InternalAdeptness.g:6411:1: rule__HighPeak__CantAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__HighPeak__CantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6415:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6416:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6416:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6417:3: ruleDOUBLE
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
    // InternalAdeptness.g:6426:1: rule__Reference__UpperAssignment_0_0 : ( ruleUpper ) ;
    public final void rule__Reference__UpperAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6430:1: ( ( ruleUpper ) )
            // InternalAdeptness.g:6431:2: ( ruleUpper )
            {
            // InternalAdeptness.g:6431:2: ( ruleUpper )
            // InternalAdeptness.g:6432:3: ruleUpper
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
    // InternalAdeptness.g:6441:1: rule__Reference__LowerAssignment_0_1 : ( ruleLower ) ;
    public final void rule__Reference__LowerAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6445:1: ( ( ruleLower ) )
            // InternalAdeptness.g:6446:2: ( ruleLower )
            {
            // InternalAdeptness.g:6446:2: ( ruleLower )
            // InternalAdeptness.g:6447:3: ruleLower
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
    // InternalAdeptness.g:6456:1: rule__Reference__RangeAssignment_0_2 : ( ruleRange ) ;
    public final void rule__Reference__RangeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6460:1: ( ( ruleRange ) )
            // InternalAdeptness.g:6461:2: ( ruleRange )
            {
            // InternalAdeptness.g:6461:2: ( ruleRange )
            // InternalAdeptness.g:6462:3: ruleRange
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
    // InternalAdeptness.g:6471:1: rule__Reference__GapAssignment_0_3 : ( ruleGap ) ;
    public final void rule__Reference__GapAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6475:1: ( ( ruleGap ) )
            // InternalAdeptness.g:6476:2: ( ruleGap )
            {
            // InternalAdeptness.g:6476:2: ( ruleGap )
            // InternalAdeptness.g:6477:3: ruleGap
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
    // InternalAdeptness.g:6486:1: rule__Upper__Bound_uppAssignment_1 : ( ruleBound_up ) ;
    public final void rule__Upper__Bound_uppAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6490:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:6491:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:6491:2: ( ruleBound_up )
            // InternalAdeptness.g:6492:3: ruleBound_up
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
    // InternalAdeptness.g:6501:1: rule__Lower__Bound_lowerAssignment_1 : ( ruleBound_Down ) ;
    public final void rule__Lower__Bound_lowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6505:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:6506:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:6506:2: ( ruleBound_Down )
            // InternalAdeptness.g:6507:3: ruleBound_Down
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
    // InternalAdeptness.g:6516:1: rule__Range__Bound_lowerAssignment_1 : ( ruleBound_Down ) ;
    public final void rule__Range__Bound_lowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6520:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:6521:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:6521:2: ( ruleBound_Down )
            // InternalAdeptness.g:6522:3: ruleBound_Down
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
    // InternalAdeptness.g:6531:1: rule__Range__Bound_uppAssignment_3 : ( ruleBound_up ) ;
    public final void rule__Range__Bound_uppAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6535:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:6536:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:6536:2: ( ruleBound_up )
            // InternalAdeptness.g:6537:3: ruleBound_up
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
    // InternalAdeptness.g:6546:1: rule__Gap__Bound_lowerAssignment_1 : ( ruleBound_Down ) ;
    public final void rule__Gap__Bound_lowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6550:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:6551:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:6551:2: ( ruleBound_Down )
            // InternalAdeptness.g:6552:3: ruleBound_Down
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
    // InternalAdeptness.g:6561:1: rule__Gap__Bound_uppAssignment_3 : ( ruleBound_up ) ;
    public final void rule__Gap__Bound_uppAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6565:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:6566:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:6566:2: ( ruleBound_up )
            // InternalAdeptness.g:6567:3: ruleBound_up
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
    // InternalAdeptness.g:6576:1: rule__Bound_up__ValueAssignment_0 : ( ruleDOUBLE ) ;
    public final void rule__Bound_up__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6580:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6581:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6581:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6582:3: ruleDOUBLE
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
    // InternalAdeptness.g:6591:1: rule__Bound_up__VariableAssignment_1 : ( ruleVariable ) ;
    public final void rule__Bound_up__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6595:1: ( ( ruleVariable ) )
            // InternalAdeptness.g:6596:2: ( ruleVariable )
            {
            // InternalAdeptness.g:6596:2: ( ruleVariable )
            // InternalAdeptness.g:6597:3: ruleVariable
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
    // InternalAdeptness.g:6606:1: rule__Bound_up__EmAssignment_2 : ( ruleExpressionsModel ) ;
    public final void rule__Bound_up__EmAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6610:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:6611:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:6611:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:6612:3: ruleExpressionsModel
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
    // InternalAdeptness.g:6621:1: rule__Bound_Down__ValueAssignment_0 : ( ruleDOUBLE ) ;
    public final void rule__Bound_Down__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6625:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:6626:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:6626:2: ( ruleDOUBLE )
            // InternalAdeptness.g:6627:3: ruleDOUBLE
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
    // InternalAdeptness.g:6636:1: rule__Bound_Down__VariableAssignment_1 : ( ruleVariable ) ;
    public final void rule__Bound_Down__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6640:1: ( ( ruleVariable ) )
            // InternalAdeptness.g:6641:2: ( ruleVariable )
            {
            // InternalAdeptness.g:6641:2: ( ruleVariable )
            // InternalAdeptness.g:6642:3: ruleVariable
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
    // InternalAdeptness.g:6651:1: rule__Bound_Down__EmAssignment_2 : ( ruleExpressionsModel ) ;
    public final void rule__Bound_Down__EmAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6655:1: ( ( ruleExpressionsModel ) )
            // InternalAdeptness.g:6656:2: ( ruleExpressionsModel )
            {
            // InternalAdeptness.g:6656:2: ( ruleExpressionsModel )
            // InternalAdeptness.g:6657:3: ruleExpressionsModel
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
    // InternalAdeptness.g:6666:1: rule__BOOLEAN__BoolAssignment : ( ruleb ) ;
    public final void rule__BOOLEAN__BoolAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6670:1: ( ( ruleb ) )
            // InternalAdeptness.g:6671:2: ( ruleb )
            {
            // InternalAdeptness.g:6671:2: ( ruleb )
            // InternalAdeptness.g:6672:3: ruleb
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
    // InternalAdeptness.g:6681:1: rule__DOUBLE__DValAssignment : ( ruled ) ;
    public final void rule__DOUBLE__DValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6685:1: ( ( ruled ) )
            // InternalAdeptness.g:6686:2: ( ruled )
            {
            // InternalAdeptness.g:6686:2: ( ruled )
            // InternalAdeptness.g:6687:3: ruled
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
    // InternalAdeptness.g:6696:1: rule__TimeType__TimeAssignment_0 : ( ( 'miliseconds' ) ) ;
    public final void rule__TimeType__TimeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6700:1: ( ( ( 'miliseconds' ) ) )
            // InternalAdeptness.g:6701:2: ( ( 'miliseconds' ) )
            {
            // InternalAdeptness.g:6701:2: ( ( 'miliseconds' ) )
            // InternalAdeptness.g:6702:3: ( 'miliseconds' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMilisecondsKeyword_0_0()); 
            // InternalAdeptness.g:6703:3: ( 'miliseconds' )
            // InternalAdeptness.g:6704:4: 'miliseconds'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMilisecondsKeyword_0_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalAdeptness.g:6715:1: rule__TimeType__TimeAssignment_1 : ( ( 'seconds' ) ) ;
    public final void rule__TimeType__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6719:1: ( ( ( 'seconds' ) ) )
            // InternalAdeptness.g:6720:2: ( ( 'seconds' ) )
            {
            // InternalAdeptness.g:6720:2: ( ( 'seconds' ) )
            // InternalAdeptness.g:6721:3: ( 'seconds' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeSecondsKeyword_1_0()); 
            // InternalAdeptness.g:6722:3: ( 'seconds' )
            // InternalAdeptness.g:6723:4: 'seconds'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeSecondsKeyword_1_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalAdeptness.g:6734:1: rule__TimeType__TimeAssignment_2 : ( ( 'minutes' ) ) ;
    public final void rule__TimeType__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6738:1: ( ( ( 'minutes' ) ) )
            // InternalAdeptness.g:6739:2: ( ( 'minutes' ) )
            {
            // InternalAdeptness.g:6739:2: ( ( 'minutes' ) )
            // InternalAdeptness.g:6740:3: ( 'minutes' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMinutesKeyword_2_0()); 
            // InternalAdeptness.g:6741:3: ( 'minutes' )
            // InternalAdeptness.g:6742:4: 'minutes'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeMinutesKeyword_2_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalAdeptness.g:6753:1: rule__TimeType__TimeAssignment_3 : ( ( 'hours' ) ) ;
    public final void rule__TimeType__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6757:1: ( ( ( 'hours' ) ) )
            // InternalAdeptness.g:6758:2: ( ( 'hours' ) )
            {
            // InternalAdeptness.g:6758:2: ( ( 'hours' ) )
            // InternalAdeptness.g:6759:3: ( 'hours' )
            {
             before(grammarAccess.getTimeTypeAccess().getTimeHoursKeyword_3_0()); 
            // InternalAdeptness.g:6760:3: ( 'hours' )
            // InternalAdeptness.g:6761:4: 'hours'
            {
             before(grammarAccess.getTimeTypeAccess().getTimeHoursKeyword_3_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalAdeptness.g:6772:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6776:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:6777:2: ( RULE_ID )
            {
            // InternalAdeptness.g:6777:2: ( RULE_ID )
            // InternalAdeptness.g:6778:3: RULE_ID
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
    // InternalAdeptness.g:6787:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6791:1: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:6792:2: ( ruleQualifiedName )
            {
            // InternalAdeptness.g:6792:2: ( ruleQualifiedName )
            // InternalAdeptness.g:6793:3: ruleQualifiedName
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
    // InternalAdeptness.g:6802:1: rule__PackageDeclaration__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6806:1: ( ( ruleAbstractElement ) )
            // InternalAdeptness.g:6807:2: ( ruleAbstractElement )
            {
            // InternalAdeptness.g:6807:2: ( ruleAbstractElement )
            // InternalAdeptness.g:6808:3: ruleAbstractElement
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
    // InternalAdeptness.g:6817:1: rule__ExpressionsModel__ElementsAssignment : ( ruleAbstractElement2 ) ;
    public final void rule__ExpressionsModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6821:1: ( ( ruleAbstractElement2 ) )
            // InternalAdeptness.g:6822:2: ( ruleAbstractElement2 )
            {
            // InternalAdeptness.g:6822:2: ( ruleAbstractElement2 )
            // InternalAdeptness.g:6823:3: ruleAbstractElement2
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
    // InternalAdeptness.g:6832:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6836:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:6837:2: ( RULE_ID )
            {
            // InternalAdeptness.g:6837:2: ( RULE_ID )
            // InternalAdeptness.g:6838:3: RULE_ID
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
    // InternalAdeptness.g:6847:1: rule__Variable__ExpressionAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__Variable__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6851:1: ( ( ruleExpression ) )
            // InternalAdeptness.g:6852:2: ( ruleExpression )
            {
            // InternalAdeptness.g:6852:2: ( ruleExpression )
            // InternalAdeptness.g:6853:3: ruleExpression
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
    // InternalAdeptness.g:6862:1: rule__EvalExpression__ExpressionAssignment : ( ruleExpression ) ;
    public final void rule__EvalExpression__ExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6866:1: ( ( ruleExpression ) )
            // InternalAdeptness.g:6867:2: ( ruleExpression )
            {
            // InternalAdeptness.g:6867:2: ( ruleExpression )
            // InternalAdeptness.g:6868:3: ruleExpression
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
    // InternalAdeptness.g:6877:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6881:1: ( ( ruleAnd ) )
            // InternalAdeptness.g:6882:2: ( ruleAnd )
            {
            // InternalAdeptness.g:6882:2: ( ruleAnd )
            // InternalAdeptness.g:6883:3: ruleAnd
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
    // InternalAdeptness.g:6892:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6896:1: ( ( ruleEquality ) )
            // InternalAdeptness.g:6897:2: ( ruleEquality )
            {
            // InternalAdeptness.g:6897:2: ( ruleEquality )
            // InternalAdeptness.g:6898:3: ruleEquality
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
    // InternalAdeptness.g:6907:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6911:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // InternalAdeptness.g:6912:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // InternalAdeptness.g:6912:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // InternalAdeptness.g:6913:3: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // InternalAdeptness.g:6914:3: ( rule__Equality__OpAlternatives_1_1_0 )
            // InternalAdeptness.g:6914:4: rule__Equality__OpAlternatives_1_1_0
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
    // InternalAdeptness.g:6922:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6926:1: ( ( ruleComparison ) )
            // InternalAdeptness.g:6927:2: ( ruleComparison )
            {
            // InternalAdeptness.g:6927:2: ( ruleComparison )
            // InternalAdeptness.g:6928:3: ruleComparison
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
    // InternalAdeptness.g:6937:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6941:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // InternalAdeptness.g:6942:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // InternalAdeptness.g:6942:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // InternalAdeptness.g:6943:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            // InternalAdeptness.g:6944:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            // InternalAdeptness.g:6944:4: rule__Comparison__OpAlternatives_1_1_0
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
    // InternalAdeptness.g:6952:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6956:1: ( ( rulePlusOrMinus ) )
            // InternalAdeptness.g:6957:2: ( rulePlusOrMinus )
            {
            // InternalAdeptness.g:6957:2: ( rulePlusOrMinus )
            // InternalAdeptness.g:6958:3: rulePlusOrMinus
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
    // InternalAdeptness.g:6967:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6971:1: ( ( ruleMulOrDiv ) )
            // InternalAdeptness.g:6972:2: ( ruleMulOrDiv )
            {
            // InternalAdeptness.g:6972:2: ( ruleMulOrDiv )
            // InternalAdeptness.g:6973:3: ruleMulOrDiv
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
    // InternalAdeptness.g:6982:1: rule__MulOrDiv__OpAssignment_1_0_1 : ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:6986:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) ) )
            // InternalAdeptness.g:6987:2: ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) )
            {
            // InternalAdeptness.g:6987:2: ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) )
            // InternalAdeptness.g:6988:3: ( rule__MulOrDiv__OpAlternatives_1_0_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_0_1_0()); 
            // InternalAdeptness.g:6989:3: ( rule__MulOrDiv__OpAlternatives_1_0_1_0 )
            // InternalAdeptness.g:6989:4: rule__MulOrDiv__OpAlternatives_1_0_1_0
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
    // InternalAdeptness.g:6997:1: rule__MulOrDiv__RightAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7001:1: ( ( rulePrimary ) )
            // InternalAdeptness.g:7002:2: ( rulePrimary )
            {
            // InternalAdeptness.g:7002:2: ( rulePrimary )
            // InternalAdeptness.g:7003:3: rulePrimary
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
    // InternalAdeptness.g:7012:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7016:1: ( ( rulePrimary ) )
            // InternalAdeptness.g:7017:2: ( rulePrimary )
            {
            // InternalAdeptness.g:7017:2: ( rulePrimary )
            // InternalAdeptness.g:7018:3: rulePrimary
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
    // InternalAdeptness.g:7027:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7031:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:7032:2: ( RULE_INT )
            {
            // InternalAdeptness.g:7032:2: ( RULE_INT )
            // InternalAdeptness.g:7033:3: RULE_INT
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
    // InternalAdeptness.g:7042:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7046:1: ( ( RULE_STRING ) )
            // InternalAdeptness.g:7047:2: ( RULE_STRING )
            {
            // InternalAdeptness.g:7047:2: ( RULE_STRING )
            // InternalAdeptness.g:7048:3: RULE_STRING
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
    // InternalAdeptness.g:7057:1: rule__Atomic__ValueAssignment_2_1 : ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7061:1: ( ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) )
            // InternalAdeptness.g:7062:2: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            {
            // InternalAdeptness.g:7062:2: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            // InternalAdeptness.g:7063:3: ( rule__Atomic__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 
            // InternalAdeptness.g:7064:3: ( rule__Atomic__ValueAlternatives_2_1_0 )
            // InternalAdeptness.g:7064:4: rule__Atomic__ValueAlternatives_2_1_0
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
    // InternalAdeptness.g:7072:1: rule__Atomic__VariableAssignment_3 : ( ruleVariable ) ;
    public final void rule__Atomic__VariableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:7076:1: ( ( ruleVariable ) )
            // InternalAdeptness.g:7077:2: ( ruleVariable )
            {
            // InternalAdeptness.g:7077:2: ( ruleVariable )
            // InternalAdeptness.g:7078:3: ruleVariable
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
    static final String dfa_2s = "\1\55\1\5\1\uffff\1\5\1\30\1\5\3\uffff\1\54";
    static final String dfa_3s = "\1\60\1\67\1\uffff\1\5\1\61\1\5\3\uffff\1\61";
    static final String dfa_4s = "\2\uffff\1\3\3\uffff\1\1\1\2\1\4\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2",
            "\1\4\61\uffff\1\3",
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0300000202400002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001872L,0x0000000000000005L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0080000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000804000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001870L,0x0000000000000005L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x005C000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001200000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x00000000000003C0L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000001870L,0x0000000000000005L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0B00000202400000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8080000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x8080000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000001800L});

}