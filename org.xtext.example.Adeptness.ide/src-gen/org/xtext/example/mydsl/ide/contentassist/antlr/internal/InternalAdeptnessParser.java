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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'import'", "'.*'", "'.'", "'signal'", "'{'", "'}'", "'Check_Static_Upper'", "'Check_Static_Lower'", "'Check_Range'", "'Check_Gap'", "'inclusiveBound'", "'='", "'bound_up'", "'bound_down'", "'-'", "'datatype'", "'package'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

                if ( (LA1_0==13||LA1_0==16||(LA1_0>=28 && LA1_0<=29)) ) {
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


    // $ANTLR start "entryRuleCheck_Static_upper_only"
    // InternalAdeptness.g:228:1: entryRuleCheck_Static_upper_only : ruleCheck_Static_upper_only EOF ;
    public final void entryRuleCheck_Static_upper_only() throws RecognitionException {
        try {
            // InternalAdeptness.g:229:1: ( ruleCheck_Static_upper_only EOF )
            // InternalAdeptness.g:230:1: ruleCheck_Static_upper_only EOF
            {
             before(grammarAccess.getCheck_Static_upper_onlyRule()); 
            pushFollow(FOLLOW_1);
            ruleCheck_Static_upper_only();

            state._fsp--;

             after(grammarAccess.getCheck_Static_upper_onlyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheck_Static_upper_only"


    // $ANTLR start "ruleCheck_Static_upper_only"
    // InternalAdeptness.g:237:1: ruleCheck_Static_upper_only : ( ( rule__Check_Static_upper_only__Group__0 ) ) ;
    public final void ruleCheck_Static_upper_only() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:241:2: ( ( ( rule__Check_Static_upper_only__Group__0 ) ) )
            // InternalAdeptness.g:242:2: ( ( rule__Check_Static_upper_only__Group__0 ) )
            {
            // InternalAdeptness.g:242:2: ( ( rule__Check_Static_upper_only__Group__0 ) )
            // InternalAdeptness.g:243:3: ( rule__Check_Static_upper_only__Group__0 )
            {
             before(grammarAccess.getCheck_Static_upper_onlyAccess().getGroup()); 
            // InternalAdeptness.g:244:3: ( rule__Check_Static_upper_only__Group__0 )
            // InternalAdeptness.g:244:4: rule__Check_Static_upper_only__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Check_Static_upper_only__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheck_Static_upper_onlyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheck_Static_upper_only"


    // $ANTLR start "entryRuleCheck_Static_lower_only"
    // InternalAdeptness.g:253:1: entryRuleCheck_Static_lower_only : ruleCheck_Static_lower_only EOF ;
    public final void entryRuleCheck_Static_lower_only() throws RecognitionException {
        try {
            // InternalAdeptness.g:254:1: ( ruleCheck_Static_lower_only EOF )
            // InternalAdeptness.g:255:1: ruleCheck_Static_lower_only EOF
            {
             before(grammarAccess.getCheck_Static_lower_onlyRule()); 
            pushFollow(FOLLOW_1);
            ruleCheck_Static_lower_only();

            state._fsp--;

             after(grammarAccess.getCheck_Static_lower_onlyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheck_Static_lower_only"


    // $ANTLR start "ruleCheck_Static_lower_only"
    // InternalAdeptness.g:262:1: ruleCheck_Static_lower_only : ( ( rule__Check_Static_lower_only__Group__0 ) ) ;
    public final void ruleCheck_Static_lower_only() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:266:2: ( ( ( rule__Check_Static_lower_only__Group__0 ) ) )
            // InternalAdeptness.g:267:2: ( ( rule__Check_Static_lower_only__Group__0 ) )
            {
            // InternalAdeptness.g:267:2: ( ( rule__Check_Static_lower_only__Group__0 ) )
            // InternalAdeptness.g:268:3: ( rule__Check_Static_lower_only__Group__0 )
            {
             before(grammarAccess.getCheck_Static_lower_onlyAccess().getGroup()); 
            // InternalAdeptness.g:269:3: ( rule__Check_Static_lower_only__Group__0 )
            // InternalAdeptness.g:269:4: rule__Check_Static_lower_only__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Check_Static_lower_only__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheck_Static_lower_onlyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheck_Static_lower_only"


    // $ANTLR start "entryRuleCheck_Range"
    // InternalAdeptness.g:278:1: entryRuleCheck_Range : ruleCheck_Range EOF ;
    public final void entryRuleCheck_Range() throws RecognitionException {
        try {
            // InternalAdeptness.g:279:1: ( ruleCheck_Range EOF )
            // InternalAdeptness.g:280:1: ruleCheck_Range EOF
            {
             before(grammarAccess.getCheck_RangeRule()); 
            pushFollow(FOLLOW_1);
            ruleCheck_Range();

            state._fsp--;

             after(grammarAccess.getCheck_RangeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheck_Range"


    // $ANTLR start "ruleCheck_Range"
    // InternalAdeptness.g:287:1: ruleCheck_Range : ( ( rule__Check_Range__Group__0 ) ) ;
    public final void ruleCheck_Range() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:291:2: ( ( ( rule__Check_Range__Group__0 ) ) )
            // InternalAdeptness.g:292:2: ( ( rule__Check_Range__Group__0 ) )
            {
            // InternalAdeptness.g:292:2: ( ( rule__Check_Range__Group__0 ) )
            // InternalAdeptness.g:293:3: ( rule__Check_Range__Group__0 )
            {
             before(grammarAccess.getCheck_RangeAccess().getGroup()); 
            // InternalAdeptness.g:294:3: ( rule__Check_Range__Group__0 )
            // InternalAdeptness.g:294:4: rule__Check_Range__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Check_Range__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheck_RangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheck_Range"


    // $ANTLR start "entryRuleCheck_Gap"
    // InternalAdeptness.g:303:1: entryRuleCheck_Gap : ruleCheck_Gap EOF ;
    public final void entryRuleCheck_Gap() throws RecognitionException {
        try {
            // InternalAdeptness.g:304:1: ( ruleCheck_Gap EOF )
            // InternalAdeptness.g:305:1: ruleCheck_Gap EOF
            {
             before(grammarAccess.getCheck_GapRule()); 
            pushFollow(FOLLOW_1);
            ruleCheck_Gap();

            state._fsp--;

             after(grammarAccess.getCheck_GapRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheck_Gap"


    // $ANTLR start "ruleCheck_Gap"
    // InternalAdeptness.g:312:1: ruleCheck_Gap : ( ( rule__Check_Gap__Group__0 ) ) ;
    public final void ruleCheck_Gap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:316:2: ( ( ( rule__Check_Gap__Group__0 ) ) )
            // InternalAdeptness.g:317:2: ( ( rule__Check_Gap__Group__0 ) )
            {
            // InternalAdeptness.g:317:2: ( ( rule__Check_Gap__Group__0 ) )
            // InternalAdeptness.g:318:3: ( rule__Check_Gap__Group__0 )
            {
             before(grammarAccess.getCheck_GapAccess().getGroup()); 
            // InternalAdeptness.g:319:3: ( rule__Check_Gap__Group__0 )
            // InternalAdeptness.g:319:4: rule__Check_Gap__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Check_Gap__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheck_GapAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheck_Gap"


    // $ANTLR start "entryRuleInclusiveBound"
    // InternalAdeptness.g:328:1: entryRuleInclusiveBound : ruleInclusiveBound EOF ;
    public final void entryRuleInclusiveBound() throws RecognitionException {
        try {
            // InternalAdeptness.g:329:1: ( ruleInclusiveBound EOF )
            // InternalAdeptness.g:330:1: ruleInclusiveBound EOF
            {
             before(grammarAccess.getInclusiveBoundRule()); 
            pushFollow(FOLLOW_1);
            ruleInclusiveBound();

            state._fsp--;

             after(grammarAccess.getInclusiveBoundRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInclusiveBound"


    // $ANTLR start "ruleInclusiveBound"
    // InternalAdeptness.g:337:1: ruleInclusiveBound : ( ( rule__InclusiveBound__Group__0 ) ) ;
    public final void ruleInclusiveBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:341:2: ( ( ( rule__InclusiveBound__Group__0 ) ) )
            // InternalAdeptness.g:342:2: ( ( rule__InclusiveBound__Group__0 ) )
            {
            // InternalAdeptness.g:342:2: ( ( rule__InclusiveBound__Group__0 ) )
            // InternalAdeptness.g:343:3: ( rule__InclusiveBound__Group__0 )
            {
             before(grammarAccess.getInclusiveBoundAccess().getGroup()); 
            // InternalAdeptness.g:344:3: ( rule__InclusiveBound__Group__0 )
            // InternalAdeptness.g:344:4: rule__InclusiveBound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InclusiveBound__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInclusiveBoundAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInclusiveBound"


    // $ANTLR start "entryRuleBound_up"
    // InternalAdeptness.g:353:1: entryRuleBound_up : ruleBound_up EOF ;
    public final void entryRuleBound_up() throws RecognitionException {
        try {
            // InternalAdeptness.g:354:1: ( ruleBound_up EOF )
            // InternalAdeptness.g:355:1: ruleBound_up EOF
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
    // InternalAdeptness.g:362:1: ruleBound_up : ( ( rule__Bound_up__Group__0 ) ) ;
    public final void ruleBound_up() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:366:2: ( ( ( rule__Bound_up__Group__0 ) ) )
            // InternalAdeptness.g:367:2: ( ( rule__Bound_up__Group__0 ) )
            {
            // InternalAdeptness.g:367:2: ( ( rule__Bound_up__Group__0 ) )
            // InternalAdeptness.g:368:3: ( rule__Bound_up__Group__0 )
            {
             before(grammarAccess.getBound_upAccess().getGroup()); 
            // InternalAdeptness.g:369:3: ( rule__Bound_up__Group__0 )
            // InternalAdeptness.g:369:4: rule__Bound_up__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bound_up__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBound_upAccess().getGroup()); 

            }


            }

        }
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
    // InternalAdeptness.g:378:1: entryRuleBound_Down : ruleBound_Down EOF ;
    public final void entryRuleBound_Down() throws RecognitionException {
        try {
            // InternalAdeptness.g:379:1: ( ruleBound_Down EOF )
            // InternalAdeptness.g:380:1: ruleBound_Down EOF
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
    // InternalAdeptness.g:387:1: ruleBound_Down : ( ( rule__Bound_Down__Group__0 ) ) ;
    public final void ruleBound_Down() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:391:2: ( ( ( rule__Bound_Down__Group__0 ) ) )
            // InternalAdeptness.g:392:2: ( ( rule__Bound_Down__Group__0 ) )
            {
            // InternalAdeptness.g:392:2: ( ( rule__Bound_Down__Group__0 ) )
            // InternalAdeptness.g:393:3: ( rule__Bound_Down__Group__0 )
            {
             before(grammarAccess.getBound_DownAccess().getGroup()); 
            // InternalAdeptness.g:394:3: ( rule__Bound_Down__Group__0 )
            // InternalAdeptness.g:394:4: rule__Bound_Down__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bound_Down__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBound_DownAccess().getGroup()); 

            }


            }

        }
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
    // InternalAdeptness.g:403:1: entryRuleBOOLEAN : ruleBOOLEAN EOF ;
    public final void entryRuleBOOLEAN() throws RecognitionException {
        try {
            // InternalAdeptness.g:404:1: ( ruleBOOLEAN EOF )
            // InternalAdeptness.g:405:1: ruleBOOLEAN EOF
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
    // InternalAdeptness.g:412:1: ruleBOOLEAN : ( ( rule__BOOLEAN__BoolAssignment ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:416:2: ( ( ( rule__BOOLEAN__BoolAssignment ) ) )
            // InternalAdeptness.g:417:2: ( ( rule__BOOLEAN__BoolAssignment ) )
            {
            // InternalAdeptness.g:417:2: ( ( rule__BOOLEAN__BoolAssignment ) )
            // InternalAdeptness.g:418:3: ( rule__BOOLEAN__BoolAssignment )
            {
             before(grammarAccess.getBOOLEANAccess().getBoolAssignment()); 
            // InternalAdeptness.g:419:3: ( rule__BOOLEAN__BoolAssignment )
            // InternalAdeptness.g:419:4: rule__BOOLEAN__BoolAssignment
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
    // InternalAdeptness.g:428:1: entryRuleb : ruleb EOF ;
    public final void entryRuleb() throws RecognitionException {
        try {
            // InternalAdeptness.g:429:1: ( ruleb EOF )
            // InternalAdeptness.g:430:1: ruleb EOF
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
    // InternalAdeptness.g:437:1: ruleb : ( ( rule__B__Alternatives ) ) ;
    public final void ruleb() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:441:2: ( ( ( rule__B__Alternatives ) ) )
            // InternalAdeptness.g:442:2: ( ( rule__B__Alternatives ) )
            {
            // InternalAdeptness.g:442:2: ( ( rule__B__Alternatives ) )
            // InternalAdeptness.g:443:3: ( rule__B__Alternatives )
            {
             before(grammarAccess.getBAccess().getAlternatives()); 
            // InternalAdeptness.g:444:3: ( rule__B__Alternatives )
            // InternalAdeptness.g:444:4: rule__B__Alternatives
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
    // InternalAdeptness.g:453:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalAdeptness.g:454:1: ( ruleDOUBLE EOF )
            // InternalAdeptness.g:455:1: ruleDOUBLE EOF
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
    // InternalAdeptness.g:462:1: ruleDOUBLE : ( ( rule__DOUBLE__DValAssignment ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:466:2: ( ( ( rule__DOUBLE__DValAssignment ) ) )
            // InternalAdeptness.g:467:2: ( ( rule__DOUBLE__DValAssignment ) )
            {
            // InternalAdeptness.g:467:2: ( ( rule__DOUBLE__DValAssignment ) )
            // InternalAdeptness.g:468:3: ( rule__DOUBLE__DValAssignment )
            {
             before(grammarAccess.getDOUBLEAccess().getDValAssignment()); 
            // InternalAdeptness.g:469:3: ( rule__DOUBLE__DValAssignment )
            // InternalAdeptness.g:469:4: rule__DOUBLE__DValAssignment
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
    // InternalAdeptness.g:478:1: entryRuled : ruled EOF ;
    public final void entryRuled() throws RecognitionException {
        try {
            // InternalAdeptness.g:479:1: ( ruled EOF )
            // InternalAdeptness.g:480:1: ruled EOF
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
    // InternalAdeptness.g:487:1: ruled : ( ( rule__D__Group__0 ) ) ;
    public final void ruled() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:491:2: ( ( ( rule__D__Group__0 ) ) )
            // InternalAdeptness.g:492:2: ( ( rule__D__Group__0 ) )
            {
            // InternalAdeptness.g:492:2: ( ( rule__D__Group__0 ) )
            // InternalAdeptness.g:493:3: ( rule__D__Group__0 )
            {
             before(grammarAccess.getDAccess().getGroup()); 
            // InternalAdeptness.g:494:3: ( rule__D__Group__0 )
            // InternalAdeptness.g:494:4: rule__D__Group__0
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
    // InternalAdeptness.g:503:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalAdeptness.g:504:1: ( ruleDataType EOF )
            // InternalAdeptness.g:505:1: ruleDataType EOF
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
    // InternalAdeptness.g:512:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:516:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalAdeptness.g:517:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalAdeptness.g:517:2: ( ( rule__DataType__Group__0 ) )
            // InternalAdeptness.g:518:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalAdeptness.g:519:3: ( rule__DataType__Group__0 )
            // InternalAdeptness.g:519:4: rule__DataType__Group__0
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
    // InternalAdeptness.g:528:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // InternalAdeptness.g:529:1: ( rulePackageDeclaration EOF )
            // InternalAdeptness.g:530:1: rulePackageDeclaration EOF
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
    // InternalAdeptness.g:537:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:541:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // InternalAdeptness.g:542:2: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // InternalAdeptness.g:542:2: ( ( rule__PackageDeclaration__Group__0 ) )
            // InternalAdeptness.g:543:3: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // InternalAdeptness.g:544:3: ( rule__PackageDeclaration__Group__0 )
            // InternalAdeptness.g:544:4: rule__PackageDeclaration__Group__0
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
    // InternalAdeptness.g:552:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:556:1: ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt2=1;
                }
                break;
            case 16:
            case 28:
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
                    // InternalAdeptness.g:557:2: ( rulePackageDeclaration )
                    {
                    // InternalAdeptness.g:557:2: ( rulePackageDeclaration )
                    // InternalAdeptness.g:558:3: rulePackageDeclaration
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
                    // InternalAdeptness.g:563:2: ( ruleType )
                    {
                    // InternalAdeptness.g:563:2: ( ruleType )
                    // InternalAdeptness.g:564:3: ruleType
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
                    // InternalAdeptness.g:569:2: ( ruleImport )
                    {
                    // InternalAdeptness.g:569:2: ( ruleImport )
                    // InternalAdeptness.g:570:3: ruleImport
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
    // InternalAdeptness.g:579:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleSignal ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:583:1: ( ( ruleDataType ) | ( ruleSignal ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
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
                    // InternalAdeptness.g:584:2: ( ruleDataType )
                    {
                    // InternalAdeptness.g:584:2: ( ruleDataType )
                    // InternalAdeptness.g:585:3: ruleDataType
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
                    // InternalAdeptness.g:590:2: ( ruleSignal )
                    {
                    // InternalAdeptness.g:590:2: ( ruleSignal )
                    // InternalAdeptness.g:591:3: ruleSignal
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


    // $ANTLR start "rule__B__Alternatives"
    // InternalAdeptness.g:600:1: rule__B__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__B__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:604:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAdeptness.g:605:2: ( 'true' )
                    {
                    // InternalAdeptness.g:605:2: ( 'true' )
                    // InternalAdeptness.g:606:3: 'true'
                    {
                     before(grammarAccess.getBAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:611:2: ( 'false' )
                    {
                    // InternalAdeptness.g:611:2: ( 'false' )
                    // InternalAdeptness.g:612:3: 'false'
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
    // InternalAdeptness.g:621:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:625:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalAdeptness.g:626:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalAdeptness.g:633:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:637:1: ( ( 'import' ) )
            // InternalAdeptness.g:638:1: ( 'import' )
            {
            // InternalAdeptness.g:638:1: ( 'import' )
            // InternalAdeptness.g:639:2: 'import'
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
    // InternalAdeptness.g:648:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:652:1: ( rule__Import__Group__1__Impl )
            // InternalAdeptness.g:653:2: rule__Import__Group__1__Impl
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
    // InternalAdeptness.g:659:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:663:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalAdeptness.g:664:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalAdeptness.g:664:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalAdeptness.g:665:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalAdeptness.g:666:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalAdeptness.g:666:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalAdeptness.g:675:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:679:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalAdeptness.g:680:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalAdeptness.g:687:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:691:1: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:692:1: ( ruleQualifiedName )
            {
            // InternalAdeptness.g:692:1: ( ruleQualifiedName )
            // InternalAdeptness.g:693:2: ruleQualifiedName
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
    // InternalAdeptness.g:702:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:706:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalAdeptness.g:707:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalAdeptness.g:713:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:717:1: ( ( ( '.*' )? ) )
            // InternalAdeptness.g:718:1: ( ( '.*' )? )
            {
            // InternalAdeptness.g:718:1: ( ( '.*' )? )
            // InternalAdeptness.g:719:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalAdeptness.g:720:2: ( '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAdeptness.g:720:3: '.*'
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
    // InternalAdeptness.g:729:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:733:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAdeptness.g:734:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalAdeptness.g:741:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:745:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:746:1: ( RULE_ID )
            {
            // InternalAdeptness.g:746:1: ( RULE_ID )
            // InternalAdeptness.g:747:2: RULE_ID
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
    // InternalAdeptness.g:756:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:760:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAdeptness.g:761:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAdeptness.g:767:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:771:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAdeptness.g:772:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAdeptness.g:772:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAdeptness.g:773:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAdeptness.g:774:2: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAdeptness.g:774:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalAdeptness.g:783:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:787:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAdeptness.g:788:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalAdeptness.g:795:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:799:1: ( ( '.' ) )
            // InternalAdeptness.g:800:1: ( '.' )
            {
            // InternalAdeptness.g:800:1: ( '.' )
            // InternalAdeptness.g:801:2: '.'
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
    // InternalAdeptness.g:810:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:814:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAdeptness.g:815:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAdeptness.g:821:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:825:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:826:1: ( RULE_ID )
            {
            // InternalAdeptness.g:826:1: ( RULE_ID )
            // InternalAdeptness.g:827:2: RULE_ID
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
    // InternalAdeptness.g:837:1: rule__Signal__Group__0 : rule__Signal__Group__0__Impl rule__Signal__Group__1 ;
    public final void rule__Signal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:841:1: ( rule__Signal__Group__0__Impl rule__Signal__Group__1 )
            // InternalAdeptness.g:842:2: rule__Signal__Group__0__Impl rule__Signal__Group__1
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
    // InternalAdeptness.g:849:1: rule__Signal__Group__0__Impl : ( 'signal' ) ;
    public final void rule__Signal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:853:1: ( ( 'signal' ) )
            // InternalAdeptness.g:854:1: ( 'signal' )
            {
            // InternalAdeptness.g:854:1: ( 'signal' )
            // InternalAdeptness.g:855:2: 'signal'
            {
             before(grammarAccess.getSignalAccess().getSignalKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getSignalKeyword_0()); 

            }


            }

        }
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
    // InternalAdeptness.g:864:1: rule__Signal__Group__1 : rule__Signal__Group__1__Impl rule__Signal__Group__2 ;
    public final void rule__Signal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:868:1: ( rule__Signal__Group__1__Impl rule__Signal__Group__2 )
            // InternalAdeptness.g:869:2: rule__Signal__Group__1__Impl rule__Signal__Group__2
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
    // InternalAdeptness.g:876:1: rule__Signal__Group__1__Impl : ( ( rule__Signal__NameAssignment_1 ) ) ;
    public final void rule__Signal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:880:1: ( ( ( rule__Signal__NameAssignment_1 ) ) )
            // InternalAdeptness.g:881:1: ( ( rule__Signal__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:881:1: ( ( rule__Signal__NameAssignment_1 ) )
            // InternalAdeptness.g:882:2: ( rule__Signal__NameAssignment_1 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:883:2: ( rule__Signal__NameAssignment_1 )
            // InternalAdeptness.g:883:3: rule__Signal__NameAssignment_1
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
    // InternalAdeptness.g:891:1: rule__Signal__Group__2 : rule__Signal__Group__2__Impl rule__Signal__Group__3 ;
    public final void rule__Signal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:895:1: ( rule__Signal__Group__2__Impl rule__Signal__Group__3 )
            // InternalAdeptness.g:896:2: rule__Signal__Group__2__Impl rule__Signal__Group__3
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
    // InternalAdeptness.g:903:1: rule__Signal__Group__2__Impl : ( '{' ) ;
    public final void rule__Signal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:907:1: ( ( '{' ) )
            // InternalAdeptness.g:908:1: ( '{' )
            {
            // InternalAdeptness.g:908:1: ( '{' )
            // InternalAdeptness.g:909:2: '{'
            {
             before(grammarAccess.getSignalAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalAdeptness.g:918:1: rule__Signal__Group__3 : rule__Signal__Group__3__Impl rule__Signal__Group__4 ;
    public final void rule__Signal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:922:1: ( rule__Signal__Group__3__Impl rule__Signal__Group__4 )
            // InternalAdeptness.g:923:2: rule__Signal__Group__3__Impl rule__Signal__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdeptness.g:930:1: rule__Signal__Group__3__Impl : ( ( rule__Signal__Check_static_upperAssignment_3 )* ) ;
    public final void rule__Signal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:934:1: ( ( ( rule__Signal__Check_static_upperAssignment_3 )* ) )
            // InternalAdeptness.g:935:1: ( ( rule__Signal__Check_static_upperAssignment_3 )* )
            {
            // InternalAdeptness.g:935:1: ( ( rule__Signal__Check_static_upperAssignment_3 )* )
            // InternalAdeptness.g:936:2: ( rule__Signal__Check_static_upperAssignment_3 )*
            {
             before(grammarAccess.getSignalAccess().getCheck_static_upperAssignment_3()); 
            // InternalAdeptness.g:937:2: ( rule__Signal__Check_static_upperAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAdeptness.g:937:3: rule__Signal__Check_static_upperAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Signal__Check_static_upperAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSignalAccess().getCheck_static_upperAssignment_3()); 

            }


            }

        }
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
    // InternalAdeptness.g:945:1: rule__Signal__Group__4 : rule__Signal__Group__4__Impl rule__Signal__Group__5 ;
    public final void rule__Signal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:949:1: ( rule__Signal__Group__4__Impl rule__Signal__Group__5 )
            // InternalAdeptness.g:950:2: rule__Signal__Group__4__Impl rule__Signal__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdeptness.g:957:1: rule__Signal__Group__4__Impl : ( ( rule__Signal__Check_static_lowerAssignment_4 )* ) ;
    public final void rule__Signal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:961:1: ( ( ( rule__Signal__Check_static_lowerAssignment_4 )* ) )
            // InternalAdeptness.g:962:1: ( ( rule__Signal__Check_static_lowerAssignment_4 )* )
            {
            // InternalAdeptness.g:962:1: ( ( rule__Signal__Check_static_lowerAssignment_4 )* )
            // InternalAdeptness.g:963:2: ( rule__Signal__Check_static_lowerAssignment_4 )*
            {
             before(grammarAccess.getSignalAccess().getCheck_static_lowerAssignment_4()); 
            // InternalAdeptness.g:964:2: ( rule__Signal__Check_static_lowerAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAdeptness.g:964:3: rule__Signal__Check_static_lowerAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Signal__Check_static_lowerAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSignalAccess().getCheck_static_lowerAssignment_4()); 

            }


            }

        }
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
    // InternalAdeptness.g:972:1: rule__Signal__Group__5 : rule__Signal__Group__5__Impl rule__Signal__Group__6 ;
    public final void rule__Signal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:976:1: ( rule__Signal__Group__5__Impl rule__Signal__Group__6 )
            // InternalAdeptness.g:977:2: rule__Signal__Group__5__Impl rule__Signal__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdeptness.g:984:1: rule__Signal__Group__5__Impl : ( ( rule__Signal__Check_rangeAssignment_5 )* ) ;
    public final void rule__Signal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:988:1: ( ( ( rule__Signal__Check_rangeAssignment_5 )* ) )
            // InternalAdeptness.g:989:1: ( ( rule__Signal__Check_rangeAssignment_5 )* )
            {
            // InternalAdeptness.g:989:1: ( ( rule__Signal__Check_rangeAssignment_5 )* )
            // InternalAdeptness.g:990:2: ( rule__Signal__Check_rangeAssignment_5 )*
            {
             before(grammarAccess.getSignalAccess().getCheck_rangeAssignment_5()); 
            // InternalAdeptness.g:991:2: ( rule__Signal__Check_rangeAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAdeptness.g:991:3: rule__Signal__Check_rangeAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Signal__Check_rangeAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSignalAccess().getCheck_rangeAssignment_5()); 

            }


            }

        }
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
    // InternalAdeptness.g:999:1: rule__Signal__Group__6 : rule__Signal__Group__6__Impl rule__Signal__Group__7 ;
    public final void rule__Signal__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1003:1: ( rule__Signal__Group__6__Impl rule__Signal__Group__7 )
            // InternalAdeptness.g:1004:2: rule__Signal__Group__6__Impl rule__Signal__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Signal__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group__7();

            state._fsp--;


            }

        }
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
    // InternalAdeptness.g:1011:1: rule__Signal__Group__6__Impl : ( ( rule__Signal__Check_gapAssignment_6 )* ) ;
    public final void rule__Signal__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1015:1: ( ( ( rule__Signal__Check_gapAssignment_6 )* ) )
            // InternalAdeptness.g:1016:1: ( ( rule__Signal__Check_gapAssignment_6 )* )
            {
            // InternalAdeptness.g:1016:1: ( ( rule__Signal__Check_gapAssignment_6 )* )
            // InternalAdeptness.g:1017:2: ( rule__Signal__Check_gapAssignment_6 )*
            {
             before(grammarAccess.getSignalAccess().getCheck_gapAssignment_6()); 
            // InternalAdeptness.g:1018:2: ( rule__Signal__Check_gapAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAdeptness.g:1018:3: rule__Signal__Check_gapAssignment_6
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Signal__Check_gapAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSignalAccess().getCheck_gapAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Signal__Group__7"
    // InternalAdeptness.g:1026:1: rule__Signal__Group__7 : rule__Signal__Group__7__Impl ;
    public final void rule__Signal__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1030:1: ( rule__Signal__Group__7__Impl )
            // InternalAdeptness.g:1031:2: rule__Signal__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__7"


    // $ANTLR start "rule__Signal__Group__7__Impl"
    // InternalAdeptness.g:1037:1: rule__Signal__Group__7__Impl : ( '}' ) ;
    public final void rule__Signal__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1041:1: ( ( '}' ) )
            // InternalAdeptness.g:1042:1: ( '}' )
            {
            // InternalAdeptness.g:1042:1: ( '}' )
            // InternalAdeptness.g:1043:2: '}'
            {
             before(grammarAccess.getSignalAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__7__Impl"


    // $ANTLR start "rule__Check_Static_upper_only__Group__0"
    // InternalAdeptness.g:1053:1: rule__Check_Static_upper_only__Group__0 : rule__Check_Static_upper_only__Group__0__Impl rule__Check_Static_upper_only__Group__1 ;
    public final void rule__Check_Static_upper_only__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1057:1: ( rule__Check_Static_upper_only__Group__0__Impl rule__Check_Static_upper_only__Group__1 )
            // InternalAdeptness.g:1058:2: rule__Check_Static_upper_only__Group__0__Impl rule__Check_Static_upper_only__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Check_Static_upper_only__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check_Static_upper_only__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_upper_only__Group__0"


    // $ANTLR start "rule__Check_Static_upper_only__Group__0__Impl"
    // InternalAdeptness.g:1065:1: rule__Check_Static_upper_only__Group__0__Impl : ( 'Check_Static_Upper' ) ;
    public final void rule__Check_Static_upper_only__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1069:1: ( ( 'Check_Static_Upper' ) )
            // InternalAdeptness.g:1070:1: ( 'Check_Static_Upper' )
            {
            // InternalAdeptness.g:1070:1: ( 'Check_Static_Upper' )
            // InternalAdeptness.g:1071:2: 'Check_Static_Upper'
            {
             before(grammarAccess.getCheck_Static_upper_onlyAccess().getCheck_Static_UpperKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCheck_Static_upper_onlyAccess().getCheck_Static_UpperKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_upper_only__Group__0__Impl"


    // $ANTLR start "rule__Check_Static_upper_only__Group__1"
    // InternalAdeptness.g:1080:1: rule__Check_Static_upper_only__Group__1 : rule__Check_Static_upper_only__Group__1__Impl rule__Check_Static_upper_only__Group__2 ;
    public final void rule__Check_Static_upper_only__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1084:1: ( rule__Check_Static_upper_only__Group__1__Impl rule__Check_Static_upper_only__Group__2 )
            // InternalAdeptness.g:1085:2: rule__Check_Static_upper_only__Group__1__Impl rule__Check_Static_upper_only__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Check_Static_upper_only__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check_Static_upper_only__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_upper_only__Group__1"


    // $ANTLR start "rule__Check_Static_upper_only__Group__1__Impl"
    // InternalAdeptness.g:1092:1: rule__Check_Static_upper_only__Group__1__Impl : ( ( rule__Check_Static_upper_only__NameAssignment_1 ) ) ;
    public final void rule__Check_Static_upper_only__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1096:1: ( ( ( rule__Check_Static_upper_only__NameAssignment_1 ) ) )
            // InternalAdeptness.g:1097:1: ( ( rule__Check_Static_upper_only__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:1097:1: ( ( rule__Check_Static_upper_only__NameAssignment_1 ) )
            // InternalAdeptness.g:1098:2: ( rule__Check_Static_upper_only__NameAssignment_1 )
            {
             before(grammarAccess.getCheck_Static_upper_onlyAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:1099:2: ( rule__Check_Static_upper_only__NameAssignment_1 )
            // InternalAdeptness.g:1099:3: rule__Check_Static_upper_only__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Check_Static_upper_only__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheck_Static_upper_onlyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_upper_only__Group__1__Impl"


    // $ANTLR start "rule__Check_Static_upper_only__Group__2"
    // InternalAdeptness.g:1107:1: rule__Check_Static_upper_only__Group__2 : rule__Check_Static_upper_only__Group__2__Impl rule__Check_Static_upper_only__Group__3 ;
    public final void rule__Check_Static_upper_only__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1111:1: ( rule__Check_Static_upper_only__Group__2__Impl rule__Check_Static_upper_only__Group__3 )
            // InternalAdeptness.g:1112:2: rule__Check_Static_upper_only__Group__2__Impl rule__Check_Static_upper_only__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Check_Static_upper_only__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check_Static_upper_only__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_upper_only__Group__2"


    // $ANTLR start "rule__Check_Static_upper_only__Group__2__Impl"
    // InternalAdeptness.g:1119:1: rule__Check_Static_upper_only__Group__2__Impl : ( '{' ) ;
    public final void rule__Check_Static_upper_only__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1123:1: ( ( '{' ) )
            // InternalAdeptness.g:1124:1: ( '{' )
            {
            // InternalAdeptness.g:1124:1: ( '{' )
            // InternalAdeptness.g:1125:2: '{'
            {
             before(grammarAccess.getCheck_Static_upper_onlyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCheck_Static_upper_onlyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_upper_only__Group__2__Impl"


    // $ANTLR start "rule__Check_Static_upper_only__Group__3"
    // InternalAdeptness.g:1134:1: rule__Check_Static_upper_only__Group__3 : rule__Check_Static_upper_only__Group__3__Impl rule__Check_Static_upper_only__Group__4 ;
    public final void rule__Check_Static_upper_only__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1138:1: ( rule__Check_Static_upper_only__Group__3__Impl rule__Check_Static_upper_only__Group__4 )
            // InternalAdeptness.g:1139:2: rule__Check_Static_upper_only__Group__3__Impl rule__Check_Static_upper_only__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Check_Static_upper_only__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check_Static_upper_only__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_upper_only__Group__3"


    // $ANTLR start "rule__Check_Static_upper_only__Group__3__Impl"
    // InternalAdeptness.g:1146:1: rule__Check_Static_upper_only__Group__3__Impl : ( ( rule__Check_Static_upper_only__Inclusive_boundAssignment_3 ) ) ;
    public final void rule__Check_Static_upper_only__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1150:1: ( ( ( rule__Check_Static_upper_only__Inclusive_boundAssignment_3 ) ) )
            // InternalAdeptness.g:1151:1: ( ( rule__Check_Static_upper_only__Inclusive_boundAssignment_3 ) )
            {
            // InternalAdeptness.g:1151:1: ( ( rule__Check_Static_upper_only__Inclusive_boundAssignment_3 ) )
            // InternalAdeptness.g:1152:2: ( rule__Check_Static_upper_only__Inclusive_boundAssignment_3 )
            {
             before(grammarAccess.getCheck_Static_upper_onlyAccess().getInclusive_boundAssignment_3()); 
            // InternalAdeptness.g:1153:2: ( rule__Check_Static_upper_only__Inclusive_boundAssignment_3 )
            // InternalAdeptness.g:1153:3: rule__Check_Static_upper_only__Inclusive_boundAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Check_Static_upper_only__Inclusive_boundAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCheck_Static_upper_onlyAccess().getInclusive_boundAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_upper_only__Group__3__Impl"


    // $ANTLR start "rule__Check_Static_upper_only__Group__4"
    // InternalAdeptness.g:1161:1: rule__Check_Static_upper_only__Group__4 : rule__Check_Static_upper_only__Group__4__Impl rule__Check_Static_upper_only__Group__5 ;
    public final void rule__Check_Static_upper_only__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1165:1: ( rule__Check_Static_upper_only__Group__4__Impl rule__Check_Static_upper_only__Group__5 )
            // InternalAdeptness.g:1166:2: rule__Check_Static_upper_only__Group__4__Impl rule__Check_Static_upper_only__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Check_Static_upper_only__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check_Static_upper_only__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_upper_only__Group__4"


    // $ANTLR start "rule__Check_Static_upper_only__Group__4__Impl"
    // InternalAdeptness.g:1173:1: rule__Check_Static_upper_only__Group__4__Impl : ( ( rule__Check_Static_upper_only__Bound_upAssignment_4 ) ) ;
    public final void rule__Check_Static_upper_only__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1177:1: ( ( ( rule__Check_Static_upper_only__Bound_upAssignment_4 ) ) )
            // InternalAdeptness.g:1178:1: ( ( rule__Check_Static_upper_only__Bound_upAssignment_4 ) )
            {
            // InternalAdeptness.g:1178:1: ( ( rule__Check_Static_upper_only__Bound_upAssignment_4 ) )
            // InternalAdeptness.g:1179:2: ( rule__Check_Static_upper_only__Bound_upAssignment_4 )
            {
             before(grammarAccess.getCheck_Static_upper_onlyAccess().getBound_upAssignment_4()); 
            // InternalAdeptness.g:1180:2: ( rule__Check_Static_upper_only__Bound_upAssignment_4 )
            // InternalAdeptness.g:1180:3: rule__Check_Static_upper_only__Bound_upAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Check_Static_upper_only__Bound_upAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCheck_Static_upper_onlyAccess().getBound_upAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_upper_only__Group__4__Impl"


    // $ANTLR start "rule__Check_Static_upper_only__Group__5"
    // InternalAdeptness.g:1188:1: rule__Check_Static_upper_only__Group__5 : rule__Check_Static_upper_only__Group__5__Impl ;
    public final void rule__Check_Static_upper_only__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1192:1: ( rule__Check_Static_upper_only__Group__5__Impl )
            // InternalAdeptness.g:1193:2: rule__Check_Static_upper_only__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Check_Static_upper_only__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_upper_only__Group__5"


    // $ANTLR start "rule__Check_Static_upper_only__Group__5__Impl"
    // InternalAdeptness.g:1199:1: rule__Check_Static_upper_only__Group__5__Impl : ( '}' ) ;
    public final void rule__Check_Static_upper_only__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1203:1: ( ( '}' ) )
            // InternalAdeptness.g:1204:1: ( '}' )
            {
            // InternalAdeptness.g:1204:1: ( '}' )
            // InternalAdeptness.g:1205:2: '}'
            {
             before(grammarAccess.getCheck_Static_upper_onlyAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCheck_Static_upper_onlyAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_upper_only__Group__5__Impl"


    // $ANTLR start "rule__Check_Static_lower_only__Group__0"
    // InternalAdeptness.g:1215:1: rule__Check_Static_lower_only__Group__0 : rule__Check_Static_lower_only__Group__0__Impl rule__Check_Static_lower_only__Group__1 ;
    public final void rule__Check_Static_lower_only__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1219:1: ( rule__Check_Static_lower_only__Group__0__Impl rule__Check_Static_lower_only__Group__1 )
            // InternalAdeptness.g:1220:2: rule__Check_Static_lower_only__Group__0__Impl rule__Check_Static_lower_only__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Check_Static_lower_only__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check_Static_lower_only__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_lower_only__Group__0"


    // $ANTLR start "rule__Check_Static_lower_only__Group__0__Impl"
    // InternalAdeptness.g:1227:1: rule__Check_Static_lower_only__Group__0__Impl : ( 'Check_Static_Lower' ) ;
    public final void rule__Check_Static_lower_only__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1231:1: ( ( 'Check_Static_Lower' ) )
            // InternalAdeptness.g:1232:1: ( 'Check_Static_Lower' )
            {
            // InternalAdeptness.g:1232:1: ( 'Check_Static_Lower' )
            // InternalAdeptness.g:1233:2: 'Check_Static_Lower'
            {
             before(grammarAccess.getCheck_Static_lower_onlyAccess().getCheck_Static_LowerKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCheck_Static_lower_onlyAccess().getCheck_Static_LowerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_lower_only__Group__0__Impl"


    // $ANTLR start "rule__Check_Static_lower_only__Group__1"
    // InternalAdeptness.g:1242:1: rule__Check_Static_lower_only__Group__1 : rule__Check_Static_lower_only__Group__1__Impl rule__Check_Static_lower_only__Group__2 ;
    public final void rule__Check_Static_lower_only__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1246:1: ( rule__Check_Static_lower_only__Group__1__Impl rule__Check_Static_lower_only__Group__2 )
            // InternalAdeptness.g:1247:2: rule__Check_Static_lower_only__Group__1__Impl rule__Check_Static_lower_only__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Check_Static_lower_only__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check_Static_lower_only__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_lower_only__Group__1"


    // $ANTLR start "rule__Check_Static_lower_only__Group__1__Impl"
    // InternalAdeptness.g:1254:1: rule__Check_Static_lower_only__Group__1__Impl : ( ( rule__Check_Static_lower_only__NameAssignment_1 ) ) ;
    public final void rule__Check_Static_lower_only__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1258:1: ( ( ( rule__Check_Static_lower_only__NameAssignment_1 ) ) )
            // InternalAdeptness.g:1259:1: ( ( rule__Check_Static_lower_only__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:1259:1: ( ( rule__Check_Static_lower_only__NameAssignment_1 ) )
            // InternalAdeptness.g:1260:2: ( rule__Check_Static_lower_only__NameAssignment_1 )
            {
             before(grammarAccess.getCheck_Static_lower_onlyAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:1261:2: ( rule__Check_Static_lower_only__NameAssignment_1 )
            // InternalAdeptness.g:1261:3: rule__Check_Static_lower_only__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Check_Static_lower_only__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheck_Static_lower_onlyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_lower_only__Group__1__Impl"


    // $ANTLR start "rule__Check_Static_lower_only__Group__2"
    // InternalAdeptness.g:1269:1: rule__Check_Static_lower_only__Group__2 : rule__Check_Static_lower_only__Group__2__Impl rule__Check_Static_lower_only__Group__3 ;
    public final void rule__Check_Static_lower_only__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1273:1: ( rule__Check_Static_lower_only__Group__2__Impl rule__Check_Static_lower_only__Group__3 )
            // InternalAdeptness.g:1274:2: rule__Check_Static_lower_only__Group__2__Impl rule__Check_Static_lower_only__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Check_Static_lower_only__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check_Static_lower_only__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_lower_only__Group__2"


    // $ANTLR start "rule__Check_Static_lower_only__Group__2__Impl"
    // InternalAdeptness.g:1281:1: rule__Check_Static_lower_only__Group__2__Impl : ( '{' ) ;
    public final void rule__Check_Static_lower_only__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1285:1: ( ( '{' ) )
            // InternalAdeptness.g:1286:1: ( '{' )
            {
            // InternalAdeptness.g:1286:1: ( '{' )
            // InternalAdeptness.g:1287:2: '{'
            {
             before(grammarAccess.getCheck_Static_lower_onlyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCheck_Static_lower_onlyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_lower_only__Group__2__Impl"


    // $ANTLR start "rule__Check_Static_lower_only__Group__3"
    // InternalAdeptness.g:1296:1: rule__Check_Static_lower_only__Group__3 : rule__Check_Static_lower_only__Group__3__Impl rule__Check_Static_lower_only__Group__4 ;
    public final void rule__Check_Static_lower_only__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1300:1: ( rule__Check_Static_lower_only__Group__3__Impl rule__Check_Static_lower_only__Group__4 )
            // InternalAdeptness.g:1301:2: rule__Check_Static_lower_only__Group__3__Impl rule__Check_Static_lower_only__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Check_Static_lower_only__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check_Static_lower_only__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_lower_only__Group__3"


    // $ANTLR start "rule__Check_Static_lower_only__Group__3__Impl"
    // InternalAdeptness.g:1308:1: rule__Check_Static_lower_only__Group__3__Impl : ( ( rule__Check_Static_lower_only__Inclusive_boundAssignment_3 ) ) ;
    public final void rule__Check_Static_lower_only__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1312:1: ( ( ( rule__Check_Static_lower_only__Inclusive_boundAssignment_3 ) ) )
            // InternalAdeptness.g:1313:1: ( ( rule__Check_Static_lower_only__Inclusive_boundAssignment_3 ) )
            {
            // InternalAdeptness.g:1313:1: ( ( rule__Check_Static_lower_only__Inclusive_boundAssignment_3 ) )
            // InternalAdeptness.g:1314:2: ( rule__Check_Static_lower_only__Inclusive_boundAssignment_3 )
            {
             before(grammarAccess.getCheck_Static_lower_onlyAccess().getInclusive_boundAssignment_3()); 
            // InternalAdeptness.g:1315:2: ( rule__Check_Static_lower_only__Inclusive_boundAssignment_3 )
            // InternalAdeptness.g:1315:3: rule__Check_Static_lower_only__Inclusive_boundAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Check_Static_lower_only__Inclusive_boundAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCheck_Static_lower_onlyAccess().getInclusive_boundAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_lower_only__Group__3__Impl"


    // $ANTLR start "rule__Check_Static_lower_only__Group__4"
    // InternalAdeptness.g:1323:1: rule__Check_Static_lower_only__Group__4 : rule__Check_Static_lower_only__Group__4__Impl rule__Check_Static_lower_only__Group__5 ;
    public final void rule__Check_Static_lower_only__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1327:1: ( rule__Check_Static_lower_only__Group__4__Impl rule__Check_Static_lower_only__Group__5 )
            // InternalAdeptness.g:1328:2: rule__Check_Static_lower_only__Group__4__Impl rule__Check_Static_lower_only__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Check_Static_lower_only__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check_Static_lower_only__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_lower_only__Group__4"


    // $ANTLR start "rule__Check_Static_lower_only__Group__4__Impl"
    // InternalAdeptness.g:1335:1: rule__Check_Static_lower_only__Group__4__Impl : ( ( rule__Check_Static_lower_only__Bound_lowAssignment_4 ) ) ;
    public final void rule__Check_Static_lower_only__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1339:1: ( ( ( rule__Check_Static_lower_only__Bound_lowAssignment_4 ) ) )
            // InternalAdeptness.g:1340:1: ( ( rule__Check_Static_lower_only__Bound_lowAssignment_4 ) )
            {
            // InternalAdeptness.g:1340:1: ( ( rule__Check_Static_lower_only__Bound_lowAssignment_4 ) )
            // InternalAdeptness.g:1341:2: ( rule__Check_Static_lower_only__Bound_lowAssignment_4 )
            {
             before(grammarAccess.getCheck_Static_lower_onlyAccess().getBound_lowAssignment_4()); 
            // InternalAdeptness.g:1342:2: ( rule__Check_Static_lower_only__Bound_lowAssignment_4 )
            // InternalAdeptness.g:1342:3: rule__Check_Static_lower_only__Bound_lowAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Check_Static_lower_only__Bound_lowAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCheck_Static_lower_onlyAccess().getBound_lowAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_lower_only__Group__4__Impl"


    // $ANTLR start "rule__Check_Static_lower_only__Group__5"
    // InternalAdeptness.g:1350:1: rule__Check_Static_lower_only__Group__5 : rule__Check_Static_lower_only__Group__5__Impl ;
    public final void rule__Check_Static_lower_only__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1354:1: ( rule__Check_Static_lower_only__Group__5__Impl )
            // InternalAdeptness.g:1355:2: rule__Check_Static_lower_only__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Check_Static_lower_only__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_lower_only__Group__5"


    // $ANTLR start "rule__Check_Static_lower_only__Group__5__Impl"
    // InternalAdeptness.g:1361:1: rule__Check_Static_lower_only__Group__5__Impl : ( '}' ) ;
    public final void rule__Check_Static_lower_only__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1365:1: ( ( '}' ) )
            // InternalAdeptness.g:1366:1: ( '}' )
            {
            // InternalAdeptness.g:1366:1: ( '}' )
            // InternalAdeptness.g:1367:2: '}'
            {
             before(grammarAccess.getCheck_Static_lower_onlyAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCheck_Static_lower_onlyAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_lower_only__Group__5__Impl"


    // $ANTLR start "rule__Check_Range__Group__0"
    // InternalAdeptness.g:1377:1: rule__Check_Range__Group__0 : rule__Check_Range__Group__0__Impl rule__Check_Range__Group__1 ;
    public final void rule__Check_Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1381:1: ( rule__Check_Range__Group__0__Impl rule__Check_Range__Group__1 )
            // InternalAdeptness.g:1382:2: rule__Check_Range__Group__0__Impl rule__Check_Range__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Check_Range__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check_Range__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Range__Group__0"


    // $ANTLR start "rule__Check_Range__Group__0__Impl"
    // InternalAdeptness.g:1389:1: rule__Check_Range__Group__0__Impl : ( 'Check_Range' ) ;
    public final void rule__Check_Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1393:1: ( ( 'Check_Range' ) )
            // InternalAdeptness.g:1394:1: ( 'Check_Range' )
            {
            // InternalAdeptness.g:1394:1: ( 'Check_Range' )
            // InternalAdeptness.g:1395:2: 'Check_Range'
            {
             before(grammarAccess.getCheck_RangeAccess().getCheck_RangeKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCheck_RangeAccess().getCheck_RangeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Range__Group__0__Impl"


    // $ANTLR start "rule__Check_Range__Group__1"
    // InternalAdeptness.g:1404:1: rule__Check_Range__Group__1 : rule__Check_Range__Group__1__Impl rule__Check_Range__Group__2 ;
    public final void rule__Check_Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1408:1: ( rule__Check_Range__Group__1__Impl rule__Check_Range__Group__2 )
            // InternalAdeptness.g:1409:2: rule__Check_Range__Group__1__Impl rule__Check_Range__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Check_Range__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check_Range__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Range__Group__1"


    // $ANTLR start "rule__Check_Range__Group__1__Impl"
    // InternalAdeptness.g:1416:1: rule__Check_Range__Group__1__Impl : ( ( rule__Check_Range__NameAssignment_1 ) ) ;
    public final void rule__Check_Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1420:1: ( ( ( rule__Check_Range__NameAssignment_1 ) ) )
            // InternalAdeptness.g:1421:1: ( ( rule__Check_Range__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:1421:1: ( ( rule__Check_Range__NameAssignment_1 ) )
            // InternalAdeptness.g:1422:2: ( rule__Check_Range__NameAssignment_1 )
            {
             before(grammarAccess.getCheck_RangeAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:1423:2: ( rule__Check_Range__NameAssignment_1 )
            // InternalAdeptness.g:1423:3: rule__Check_Range__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Check_Range__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheck_RangeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Range__Group__1__Impl"


    // $ANTLR start "rule__Check_Range__Group__2"
    // InternalAdeptness.g:1431:1: rule__Check_Range__Group__2 : rule__Check_Range__Group__2__Impl rule__Check_Range__Group__3 ;
    public final void rule__Check_Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1435:1: ( rule__Check_Range__Group__2__Impl rule__Check_Range__Group__3 )
            // InternalAdeptness.g:1436:2: rule__Check_Range__Group__2__Impl rule__Check_Range__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Check_Range__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check_Range__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Range__Group__2"


    // $ANTLR start "rule__Check_Range__Group__2__Impl"
    // InternalAdeptness.g:1443:1: rule__Check_Range__Group__2__Impl : ( '{' ) ;
    public final void rule__Check_Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1447:1: ( ( '{' ) )
            // InternalAdeptness.g:1448:1: ( '{' )
            {
            // InternalAdeptness.g:1448:1: ( '{' )
            // InternalAdeptness.g:1449:2: '{'
            {
             before(grammarAccess.getCheck_RangeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCheck_RangeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Range__Group__2__Impl"


    // $ANTLR start "rule__Check_Range__Group__3"
    // InternalAdeptness.g:1458:1: rule__Check_Range__Group__3 : rule__Check_Range__Group__3__Impl rule__Check_Range__Group__4 ;
    public final void rule__Check_Range__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1462:1: ( rule__Check_Range__Group__3__Impl rule__Check_Range__Group__4 )
            // InternalAdeptness.g:1463:2: rule__Check_Range__Group__3__Impl rule__Check_Range__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Check_Range__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check_Range__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Range__Group__3"


    // $ANTLR start "rule__Check_Range__Group__3__Impl"
    // InternalAdeptness.g:1470:1: rule__Check_Range__Group__3__Impl : ( ( rule__Check_Range__Inclusive_boundAssignment_3 ) ) ;
    public final void rule__Check_Range__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1474:1: ( ( ( rule__Check_Range__Inclusive_boundAssignment_3 ) ) )
            // InternalAdeptness.g:1475:1: ( ( rule__Check_Range__Inclusive_boundAssignment_3 ) )
            {
            // InternalAdeptness.g:1475:1: ( ( rule__Check_Range__Inclusive_boundAssignment_3 ) )
            // InternalAdeptness.g:1476:2: ( rule__Check_Range__Inclusive_boundAssignment_3 )
            {
             before(grammarAccess.getCheck_RangeAccess().getInclusive_boundAssignment_3()); 
            // InternalAdeptness.g:1477:2: ( rule__Check_Range__Inclusive_boundAssignment_3 )
            // InternalAdeptness.g:1477:3: rule__Check_Range__Inclusive_boundAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Check_Range__Inclusive_boundAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCheck_RangeAccess().getInclusive_boundAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Range__Group__3__Impl"


    // $ANTLR start "rule__Check_Range__Group__4"
    // InternalAdeptness.g:1485:1: rule__Check_Range__Group__4 : rule__Check_Range__Group__4__Impl rule__Check_Range__Group__5 ;
    public final void rule__Check_Range__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1489:1: ( rule__Check_Range__Group__4__Impl rule__Check_Range__Group__5 )
            // InternalAdeptness.g:1490:2: rule__Check_Range__Group__4__Impl rule__Check_Range__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Check_Range__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check_Range__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Range__Group__4"


    // $ANTLR start "rule__Check_Range__Group__4__Impl"
    // InternalAdeptness.g:1497:1: rule__Check_Range__Group__4__Impl : ( ( rule__Check_Range__Bound_lowAssignment_4 ) ) ;
    public final void rule__Check_Range__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1501:1: ( ( ( rule__Check_Range__Bound_lowAssignment_4 ) ) )
            // InternalAdeptness.g:1502:1: ( ( rule__Check_Range__Bound_lowAssignment_4 ) )
            {
            // InternalAdeptness.g:1502:1: ( ( rule__Check_Range__Bound_lowAssignment_4 ) )
            // InternalAdeptness.g:1503:2: ( rule__Check_Range__Bound_lowAssignment_4 )
            {
             before(grammarAccess.getCheck_RangeAccess().getBound_lowAssignment_4()); 
            // InternalAdeptness.g:1504:2: ( rule__Check_Range__Bound_lowAssignment_4 )
            // InternalAdeptness.g:1504:3: rule__Check_Range__Bound_lowAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Check_Range__Bound_lowAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCheck_RangeAccess().getBound_lowAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Range__Group__4__Impl"


    // $ANTLR start "rule__Check_Range__Group__5"
    // InternalAdeptness.g:1512:1: rule__Check_Range__Group__5 : rule__Check_Range__Group__5__Impl rule__Check_Range__Group__6 ;
    public final void rule__Check_Range__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1516:1: ( rule__Check_Range__Group__5__Impl rule__Check_Range__Group__6 )
            // InternalAdeptness.g:1517:2: rule__Check_Range__Group__5__Impl rule__Check_Range__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Check_Range__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check_Range__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Range__Group__5"


    // $ANTLR start "rule__Check_Range__Group__5__Impl"
    // InternalAdeptness.g:1524:1: rule__Check_Range__Group__5__Impl : ( ( rule__Check_Range__Bound_upAssignment_5 ) ) ;
    public final void rule__Check_Range__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1528:1: ( ( ( rule__Check_Range__Bound_upAssignment_5 ) ) )
            // InternalAdeptness.g:1529:1: ( ( rule__Check_Range__Bound_upAssignment_5 ) )
            {
            // InternalAdeptness.g:1529:1: ( ( rule__Check_Range__Bound_upAssignment_5 ) )
            // InternalAdeptness.g:1530:2: ( rule__Check_Range__Bound_upAssignment_5 )
            {
             before(grammarAccess.getCheck_RangeAccess().getBound_upAssignment_5()); 
            // InternalAdeptness.g:1531:2: ( rule__Check_Range__Bound_upAssignment_5 )
            // InternalAdeptness.g:1531:3: rule__Check_Range__Bound_upAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Check_Range__Bound_upAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCheck_RangeAccess().getBound_upAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Range__Group__5__Impl"


    // $ANTLR start "rule__Check_Range__Group__6"
    // InternalAdeptness.g:1539:1: rule__Check_Range__Group__6 : rule__Check_Range__Group__6__Impl ;
    public final void rule__Check_Range__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1543:1: ( rule__Check_Range__Group__6__Impl )
            // InternalAdeptness.g:1544:2: rule__Check_Range__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Check_Range__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Range__Group__6"


    // $ANTLR start "rule__Check_Range__Group__6__Impl"
    // InternalAdeptness.g:1550:1: rule__Check_Range__Group__6__Impl : ( '}' ) ;
    public final void rule__Check_Range__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1554:1: ( ( '}' ) )
            // InternalAdeptness.g:1555:1: ( '}' )
            {
            // InternalAdeptness.g:1555:1: ( '}' )
            // InternalAdeptness.g:1556:2: '}'
            {
             before(grammarAccess.getCheck_RangeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCheck_RangeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Range__Group__6__Impl"


    // $ANTLR start "rule__Check_Gap__Group__0"
    // InternalAdeptness.g:1566:1: rule__Check_Gap__Group__0 : rule__Check_Gap__Group__0__Impl rule__Check_Gap__Group__1 ;
    public final void rule__Check_Gap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1570:1: ( rule__Check_Gap__Group__0__Impl rule__Check_Gap__Group__1 )
            // InternalAdeptness.g:1571:2: rule__Check_Gap__Group__0__Impl rule__Check_Gap__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Check_Gap__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check_Gap__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Gap__Group__0"


    // $ANTLR start "rule__Check_Gap__Group__0__Impl"
    // InternalAdeptness.g:1578:1: rule__Check_Gap__Group__0__Impl : ( 'Check_Gap' ) ;
    public final void rule__Check_Gap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1582:1: ( ( 'Check_Gap' ) )
            // InternalAdeptness.g:1583:1: ( 'Check_Gap' )
            {
            // InternalAdeptness.g:1583:1: ( 'Check_Gap' )
            // InternalAdeptness.g:1584:2: 'Check_Gap'
            {
             before(grammarAccess.getCheck_GapAccess().getCheck_GapKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCheck_GapAccess().getCheck_GapKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Gap__Group__0__Impl"


    // $ANTLR start "rule__Check_Gap__Group__1"
    // InternalAdeptness.g:1593:1: rule__Check_Gap__Group__1 : rule__Check_Gap__Group__1__Impl rule__Check_Gap__Group__2 ;
    public final void rule__Check_Gap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1597:1: ( rule__Check_Gap__Group__1__Impl rule__Check_Gap__Group__2 )
            // InternalAdeptness.g:1598:2: rule__Check_Gap__Group__1__Impl rule__Check_Gap__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Check_Gap__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check_Gap__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Gap__Group__1"


    // $ANTLR start "rule__Check_Gap__Group__1__Impl"
    // InternalAdeptness.g:1605:1: rule__Check_Gap__Group__1__Impl : ( ( rule__Check_Gap__NameAssignment_1 ) ) ;
    public final void rule__Check_Gap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1609:1: ( ( ( rule__Check_Gap__NameAssignment_1 ) ) )
            // InternalAdeptness.g:1610:1: ( ( rule__Check_Gap__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:1610:1: ( ( rule__Check_Gap__NameAssignment_1 ) )
            // InternalAdeptness.g:1611:2: ( rule__Check_Gap__NameAssignment_1 )
            {
             before(grammarAccess.getCheck_GapAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:1612:2: ( rule__Check_Gap__NameAssignment_1 )
            // InternalAdeptness.g:1612:3: rule__Check_Gap__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Check_Gap__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheck_GapAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Gap__Group__1__Impl"


    // $ANTLR start "rule__Check_Gap__Group__2"
    // InternalAdeptness.g:1620:1: rule__Check_Gap__Group__2 : rule__Check_Gap__Group__2__Impl rule__Check_Gap__Group__3 ;
    public final void rule__Check_Gap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1624:1: ( rule__Check_Gap__Group__2__Impl rule__Check_Gap__Group__3 )
            // InternalAdeptness.g:1625:2: rule__Check_Gap__Group__2__Impl rule__Check_Gap__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Check_Gap__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check_Gap__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Gap__Group__2"


    // $ANTLR start "rule__Check_Gap__Group__2__Impl"
    // InternalAdeptness.g:1632:1: rule__Check_Gap__Group__2__Impl : ( '{' ) ;
    public final void rule__Check_Gap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1636:1: ( ( '{' ) )
            // InternalAdeptness.g:1637:1: ( '{' )
            {
            // InternalAdeptness.g:1637:1: ( '{' )
            // InternalAdeptness.g:1638:2: '{'
            {
             before(grammarAccess.getCheck_GapAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCheck_GapAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Gap__Group__2__Impl"


    // $ANTLR start "rule__Check_Gap__Group__3"
    // InternalAdeptness.g:1647:1: rule__Check_Gap__Group__3 : rule__Check_Gap__Group__3__Impl rule__Check_Gap__Group__4 ;
    public final void rule__Check_Gap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1651:1: ( rule__Check_Gap__Group__3__Impl rule__Check_Gap__Group__4 )
            // InternalAdeptness.g:1652:2: rule__Check_Gap__Group__3__Impl rule__Check_Gap__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Check_Gap__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check_Gap__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Gap__Group__3"


    // $ANTLR start "rule__Check_Gap__Group__3__Impl"
    // InternalAdeptness.g:1659:1: rule__Check_Gap__Group__3__Impl : ( ( rule__Check_Gap__Inclusive_boundAssignment_3 ) ) ;
    public final void rule__Check_Gap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1663:1: ( ( ( rule__Check_Gap__Inclusive_boundAssignment_3 ) ) )
            // InternalAdeptness.g:1664:1: ( ( rule__Check_Gap__Inclusive_boundAssignment_3 ) )
            {
            // InternalAdeptness.g:1664:1: ( ( rule__Check_Gap__Inclusive_boundAssignment_3 ) )
            // InternalAdeptness.g:1665:2: ( rule__Check_Gap__Inclusive_boundAssignment_3 )
            {
             before(grammarAccess.getCheck_GapAccess().getInclusive_boundAssignment_3()); 
            // InternalAdeptness.g:1666:2: ( rule__Check_Gap__Inclusive_boundAssignment_3 )
            // InternalAdeptness.g:1666:3: rule__Check_Gap__Inclusive_boundAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Check_Gap__Inclusive_boundAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCheck_GapAccess().getInclusive_boundAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Gap__Group__3__Impl"


    // $ANTLR start "rule__Check_Gap__Group__4"
    // InternalAdeptness.g:1674:1: rule__Check_Gap__Group__4 : rule__Check_Gap__Group__4__Impl rule__Check_Gap__Group__5 ;
    public final void rule__Check_Gap__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1678:1: ( rule__Check_Gap__Group__4__Impl rule__Check_Gap__Group__5 )
            // InternalAdeptness.g:1679:2: rule__Check_Gap__Group__4__Impl rule__Check_Gap__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Check_Gap__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check_Gap__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Gap__Group__4"


    // $ANTLR start "rule__Check_Gap__Group__4__Impl"
    // InternalAdeptness.g:1686:1: rule__Check_Gap__Group__4__Impl : ( ( rule__Check_Gap__Bound_lowAssignment_4 ) ) ;
    public final void rule__Check_Gap__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1690:1: ( ( ( rule__Check_Gap__Bound_lowAssignment_4 ) ) )
            // InternalAdeptness.g:1691:1: ( ( rule__Check_Gap__Bound_lowAssignment_4 ) )
            {
            // InternalAdeptness.g:1691:1: ( ( rule__Check_Gap__Bound_lowAssignment_4 ) )
            // InternalAdeptness.g:1692:2: ( rule__Check_Gap__Bound_lowAssignment_4 )
            {
             before(grammarAccess.getCheck_GapAccess().getBound_lowAssignment_4()); 
            // InternalAdeptness.g:1693:2: ( rule__Check_Gap__Bound_lowAssignment_4 )
            // InternalAdeptness.g:1693:3: rule__Check_Gap__Bound_lowAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Check_Gap__Bound_lowAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCheck_GapAccess().getBound_lowAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Gap__Group__4__Impl"


    // $ANTLR start "rule__Check_Gap__Group__5"
    // InternalAdeptness.g:1701:1: rule__Check_Gap__Group__5 : rule__Check_Gap__Group__5__Impl rule__Check_Gap__Group__6 ;
    public final void rule__Check_Gap__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1705:1: ( rule__Check_Gap__Group__5__Impl rule__Check_Gap__Group__6 )
            // InternalAdeptness.g:1706:2: rule__Check_Gap__Group__5__Impl rule__Check_Gap__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Check_Gap__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check_Gap__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Gap__Group__5"


    // $ANTLR start "rule__Check_Gap__Group__5__Impl"
    // InternalAdeptness.g:1713:1: rule__Check_Gap__Group__5__Impl : ( ( rule__Check_Gap__Bound_upAssignment_5 ) ) ;
    public final void rule__Check_Gap__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1717:1: ( ( ( rule__Check_Gap__Bound_upAssignment_5 ) ) )
            // InternalAdeptness.g:1718:1: ( ( rule__Check_Gap__Bound_upAssignment_5 ) )
            {
            // InternalAdeptness.g:1718:1: ( ( rule__Check_Gap__Bound_upAssignment_5 ) )
            // InternalAdeptness.g:1719:2: ( rule__Check_Gap__Bound_upAssignment_5 )
            {
             before(grammarAccess.getCheck_GapAccess().getBound_upAssignment_5()); 
            // InternalAdeptness.g:1720:2: ( rule__Check_Gap__Bound_upAssignment_5 )
            // InternalAdeptness.g:1720:3: rule__Check_Gap__Bound_upAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Check_Gap__Bound_upAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCheck_GapAccess().getBound_upAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Gap__Group__5__Impl"


    // $ANTLR start "rule__Check_Gap__Group__6"
    // InternalAdeptness.g:1728:1: rule__Check_Gap__Group__6 : rule__Check_Gap__Group__6__Impl ;
    public final void rule__Check_Gap__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1732:1: ( rule__Check_Gap__Group__6__Impl )
            // InternalAdeptness.g:1733:2: rule__Check_Gap__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Check_Gap__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Gap__Group__6"


    // $ANTLR start "rule__Check_Gap__Group__6__Impl"
    // InternalAdeptness.g:1739:1: rule__Check_Gap__Group__6__Impl : ( '}' ) ;
    public final void rule__Check_Gap__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1743:1: ( ( '}' ) )
            // InternalAdeptness.g:1744:1: ( '}' )
            {
            // InternalAdeptness.g:1744:1: ( '}' )
            // InternalAdeptness.g:1745:2: '}'
            {
             before(grammarAccess.getCheck_GapAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCheck_GapAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Gap__Group__6__Impl"


    // $ANTLR start "rule__InclusiveBound__Group__0"
    // InternalAdeptness.g:1755:1: rule__InclusiveBound__Group__0 : rule__InclusiveBound__Group__0__Impl rule__InclusiveBound__Group__1 ;
    public final void rule__InclusiveBound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1759:1: ( rule__InclusiveBound__Group__0__Impl rule__InclusiveBound__Group__1 )
            // InternalAdeptness.g:1760:2: rule__InclusiveBound__Group__0__Impl rule__InclusiveBound__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__InclusiveBound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InclusiveBound__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InclusiveBound__Group__0"


    // $ANTLR start "rule__InclusiveBound__Group__0__Impl"
    // InternalAdeptness.g:1767:1: rule__InclusiveBound__Group__0__Impl : ( 'inclusiveBound' ) ;
    public final void rule__InclusiveBound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1771:1: ( ( 'inclusiveBound' ) )
            // InternalAdeptness.g:1772:1: ( 'inclusiveBound' )
            {
            // InternalAdeptness.g:1772:1: ( 'inclusiveBound' )
            // InternalAdeptness.g:1773:2: 'inclusiveBound'
            {
             before(grammarAccess.getInclusiveBoundAccess().getInclusiveBoundKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInclusiveBoundAccess().getInclusiveBoundKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InclusiveBound__Group__0__Impl"


    // $ANTLR start "rule__InclusiveBound__Group__1"
    // InternalAdeptness.g:1782:1: rule__InclusiveBound__Group__1 : rule__InclusiveBound__Group__1__Impl rule__InclusiveBound__Group__2 ;
    public final void rule__InclusiveBound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1786:1: ( rule__InclusiveBound__Group__1__Impl rule__InclusiveBound__Group__2 )
            // InternalAdeptness.g:1787:2: rule__InclusiveBound__Group__1__Impl rule__InclusiveBound__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__InclusiveBound__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InclusiveBound__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InclusiveBound__Group__1"


    // $ANTLR start "rule__InclusiveBound__Group__1__Impl"
    // InternalAdeptness.g:1794:1: rule__InclusiveBound__Group__1__Impl : ( ( rule__InclusiveBound__NameAssignment_1 ) ) ;
    public final void rule__InclusiveBound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1798:1: ( ( ( rule__InclusiveBound__NameAssignment_1 ) ) )
            // InternalAdeptness.g:1799:1: ( ( rule__InclusiveBound__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:1799:1: ( ( rule__InclusiveBound__NameAssignment_1 ) )
            // InternalAdeptness.g:1800:2: ( rule__InclusiveBound__NameAssignment_1 )
            {
             before(grammarAccess.getInclusiveBoundAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:1801:2: ( rule__InclusiveBound__NameAssignment_1 )
            // InternalAdeptness.g:1801:3: rule__InclusiveBound__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InclusiveBound__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInclusiveBoundAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InclusiveBound__Group__1__Impl"


    // $ANTLR start "rule__InclusiveBound__Group__2"
    // InternalAdeptness.g:1809:1: rule__InclusiveBound__Group__2 : rule__InclusiveBound__Group__2__Impl rule__InclusiveBound__Group__3 ;
    public final void rule__InclusiveBound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1813:1: ( rule__InclusiveBound__Group__2__Impl rule__InclusiveBound__Group__3 )
            // InternalAdeptness.g:1814:2: rule__InclusiveBound__Group__2__Impl rule__InclusiveBound__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__InclusiveBound__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InclusiveBound__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InclusiveBound__Group__2"


    // $ANTLR start "rule__InclusiveBound__Group__2__Impl"
    // InternalAdeptness.g:1821:1: rule__InclusiveBound__Group__2__Impl : ( '=' ) ;
    public final void rule__InclusiveBound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1825:1: ( ( '=' ) )
            // InternalAdeptness.g:1826:1: ( '=' )
            {
            // InternalAdeptness.g:1826:1: ( '=' )
            // InternalAdeptness.g:1827:2: '='
            {
             before(grammarAccess.getInclusiveBoundAccess().getEqualsSignKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInclusiveBoundAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InclusiveBound__Group__2__Impl"


    // $ANTLR start "rule__InclusiveBound__Group__3"
    // InternalAdeptness.g:1836:1: rule__InclusiveBound__Group__3 : rule__InclusiveBound__Group__3__Impl ;
    public final void rule__InclusiveBound__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1840:1: ( rule__InclusiveBound__Group__3__Impl )
            // InternalAdeptness.g:1841:2: rule__InclusiveBound__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InclusiveBound__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InclusiveBound__Group__3"


    // $ANTLR start "rule__InclusiveBound__Group__3__Impl"
    // InternalAdeptness.g:1847:1: rule__InclusiveBound__Group__3__Impl : ( ( rule__InclusiveBound__ValueAssignment_3 ) ) ;
    public final void rule__InclusiveBound__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1851:1: ( ( ( rule__InclusiveBound__ValueAssignment_3 ) ) )
            // InternalAdeptness.g:1852:1: ( ( rule__InclusiveBound__ValueAssignment_3 ) )
            {
            // InternalAdeptness.g:1852:1: ( ( rule__InclusiveBound__ValueAssignment_3 ) )
            // InternalAdeptness.g:1853:2: ( rule__InclusiveBound__ValueAssignment_3 )
            {
             before(grammarAccess.getInclusiveBoundAccess().getValueAssignment_3()); 
            // InternalAdeptness.g:1854:2: ( rule__InclusiveBound__ValueAssignment_3 )
            // InternalAdeptness.g:1854:3: rule__InclusiveBound__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InclusiveBound__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInclusiveBoundAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InclusiveBound__Group__3__Impl"


    // $ANTLR start "rule__Bound_up__Group__0"
    // InternalAdeptness.g:1863:1: rule__Bound_up__Group__0 : rule__Bound_up__Group__0__Impl rule__Bound_up__Group__1 ;
    public final void rule__Bound_up__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1867:1: ( rule__Bound_up__Group__0__Impl rule__Bound_up__Group__1 )
            // InternalAdeptness.g:1868:2: rule__Bound_up__Group__0__Impl rule__Bound_up__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Bound_up__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bound_up__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_up__Group__0"


    // $ANTLR start "rule__Bound_up__Group__0__Impl"
    // InternalAdeptness.g:1875:1: rule__Bound_up__Group__0__Impl : ( 'bound_up' ) ;
    public final void rule__Bound_up__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1879:1: ( ( 'bound_up' ) )
            // InternalAdeptness.g:1880:1: ( 'bound_up' )
            {
            // InternalAdeptness.g:1880:1: ( 'bound_up' )
            // InternalAdeptness.g:1881:2: 'bound_up'
            {
             before(grammarAccess.getBound_upAccess().getBound_upKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBound_upAccess().getBound_upKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_up__Group__0__Impl"


    // $ANTLR start "rule__Bound_up__Group__1"
    // InternalAdeptness.g:1890:1: rule__Bound_up__Group__1 : rule__Bound_up__Group__1__Impl rule__Bound_up__Group__2 ;
    public final void rule__Bound_up__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1894:1: ( rule__Bound_up__Group__1__Impl rule__Bound_up__Group__2 )
            // InternalAdeptness.g:1895:2: rule__Bound_up__Group__1__Impl rule__Bound_up__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Bound_up__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bound_up__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_up__Group__1"


    // $ANTLR start "rule__Bound_up__Group__1__Impl"
    // InternalAdeptness.g:1902:1: rule__Bound_up__Group__1__Impl : ( ( rule__Bound_up__NameAssignment_1 ) ) ;
    public final void rule__Bound_up__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1906:1: ( ( ( rule__Bound_up__NameAssignment_1 ) ) )
            // InternalAdeptness.g:1907:1: ( ( rule__Bound_up__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:1907:1: ( ( rule__Bound_up__NameAssignment_1 ) )
            // InternalAdeptness.g:1908:2: ( rule__Bound_up__NameAssignment_1 )
            {
             before(grammarAccess.getBound_upAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:1909:2: ( rule__Bound_up__NameAssignment_1 )
            // InternalAdeptness.g:1909:3: rule__Bound_up__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Bound_up__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBound_upAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_up__Group__1__Impl"


    // $ANTLR start "rule__Bound_up__Group__2"
    // InternalAdeptness.g:1917:1: rule__Bound_up__Group__2 : rule__Bound_up__Group__2__Impl rule__Bound_up__Group__3 ;
    public final void rule__Bound_up__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1921:1: ( rule__Bound_up__Group__2__Impl rule__Bound_up__Group__3 )
            // InternalAdeptness.g:1922:2: rule__Bound_up__Group__2__Impl rule__Bound_up__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Bound_up__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bound_up__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_up__Group__2"


    // $ANTLR start "rule__Bound_up__Group__2__Impl"
    // InternalAdeptness.g:1929:1: rule__Bound_up__Group__2__Impl : ( '=' ) ;
    public final void rule__Bound_up__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1933:1: ( ( '=' ) )
            // InternalAdeptness.g:1934:1: ( '=' )
            {
            // InternalAdeptness.g:1934:1: ( '=' )
            // InternalAdeptness.g:1935:2: '='
            {
             before(grammarAccess.getBound_upAccess().getEqualsSignKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBound_upAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_up__Group__2__Impl"


    // $ANTLR start "rule__Bound_up__Group__3"
    // InternalAdeptness.g:1944:1: rule__Bound_up__Group__3 : rule__Bound_up__Group__3__Impl ;
    public final void rule__Bound_up__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1948:1: ( rule__Bound_up__Group__3__Impl )
            // InternalAdeptness.g:1949:2: rule__Bound_up__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bound_up__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_up__Group__3"


    // $ANTLR start "rule__Bound_up__Group__3__Impl"
    // InternalAdeptness.g:1955:1: rule__Bound_up__Group__3__Impl : ( ( rule__Bound_up__ValueAssignment_3 ) ) ;
    public final void rule__Bound_up__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1959:1: ( ( ( rule__Bound_up__ValueAssignment_3 ) ) )
            // InternalAdeptness.g:1960:1: ( ( rule__Bound_up__ValueAssignment_3 ) )
            {
            // InternalAdeptness.g:1960:1: ( ( rule__Bound_up__ValueAssignment_3 ) )
            // InternalAdeptness.g:1961:2: ( rule__Bound_up__ValueAssignment_3 )
            {
             before(grammarAccess.getBound_upAccess().getValueAssignment_3()); 
            // InternalAdeptness.g:1962:2: ( rule__Bound_up__ValueAssignment_3 )
            // InternalAdeptness.g:1962:3: rule__Bound_up__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Bound_up__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBound_upAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_up__Group__3__Impl"


    // $ANTLR start "rule__Bound_Down__Group__0"
    // InternalAdeptness.g:1971:1: rule__Bound_Down__Group__0 : rule__Bound_Down__Group__0__Impl rule__Bound_Down__Group__1 ;
    public final void rule__Bound_Down__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1975:1: ( rule__Bound_Down__Group__0__Impl rule__Bound_Down__Group__1 )
            // InternalAdeptness.g:1976:2: rule__Bound_Down__Group__0__Impl rule__Bound_Down__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Bound_Down__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bound_Down__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_Down__Group__0"


    // $ANTLR start "rule__Bound_Down__Group__0__Impl"
    // InternalAdeptness.g:1983:1: rule__Bound_Down__Group__0__Impl : ( 'bound_down' ) ;
    public final void rule__Bound_Down__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:1987:1: ( ( 'bound_down' ) )
            // InternalAdeptness.g:1988:1: ( 'bound_down' )
            {
            // InternalAdeptness.g:1988:1: ( 'bound_down' )
            // InternalAdeptness.g:1989:2: 'bound_down'
            {
             before(grammarAccess.getBound_DownAccess().getBound_downKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBound_DownAccess().getBound_downKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_Down__Group__0__Impl"


    // $ANTLR start "rule__Bound_Down__Group__1"
    // InternalAdeptness.g:1998:1: rule__Bound_Down__Group__1 : rule__Bound_Down__Group__1__Impl rule__Bound_Down__Group__2 ;
    public final void rule__Bound_Down__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2002:1: ( rule__Bound_Down__Group__1__Impl rule__Bound_Down__Group__2 )
            // InternalAdeptness.g:2003:2: rule__Bound_Down__Group__1__Impl rule__Bound_Down__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Bound_Down__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bound_Down__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_Down__Group__1"


    // $ANTLR start "rule__Bound_Down__Group__1__Impl"
    // InternalAdeptness.g:2010:1: rule__Bound_Down__Group__1__Impl : ( ( rule__Bound_Down__NameAssignment_1 ) ) ;
    public final void rule__Bound_Down__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2014:1: ( ( ( rule__Bound_Down__NameAssignment_1 ) ) )
            // InternalAdeptness.g:2015:1: ( ( rule__Bound_Down__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:2015:1: ( ( rule__Bound_Down__NameAssignment_1 ) )
            // InternalAdeptness.g:2016:2: ( rule__Bound_Down__NameAssignment_1 )
            {
             before(grammarAccess.getBound_DownAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:2017:2: ( rule__Bound_Down__NameAssignment_1 )
            // InternalAdeptness.g:2017:3: rule__Bound_Down__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Bound_Down__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBound_DownAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_Down__Group__1__Impl"


    // $ANTLR start "rule__Bound_Down__Group__2"
    // InternalAdeptness.g:2025:1: rule__Bound_Down__Group__2 : rule__Bound_Down__Group__2__Impl rule__Bound_Down__Group__3 ;
    public final void rule__Bound_Down__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2029:1: ( rule__Bound_Down__Group__2__Impl rule__Bound_Down__Group__3 )
            // InternalAdeptness.g:2030:2: rule__Bound_Down__Group__2__Impl rule__Bound_Down__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Bound_Down__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bound_Down__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_Down__Group__2"


    // $ANTLR start "rule__Bound_Down__Group__2__Impl"
    // InternalAdeptness.g:2037:1: rule__Bound_Down__Group__2__Impl : ( '=' ) ;
    public final void rule__Bound_Down__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2041:1: ( ( '=' ) )
            // InternalAdeptness.g:2042:1: ( '=' )
            {
            // InternalAdeptness.g:2042:1: ( '=' )
            // InternalAdeptness.g:2043:2: '='
            {
             before(grammarAccess.getBound_DownAccess().getEqualsSignKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBound_DownAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_Down__Group__2__Impl"


    // $ANTLR start "rule__Bound_Down__Group__3"
    // InternalAdeptness.g:2052:1: rule__Bound_Down__Group__3 : rule__Bound_Down__Group__3__Impl ;
    public final void rule__Bound_Down__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2056:1: ( rule__Bound_Down__Group__3__Impl )
            // InternalAdeptness.g:2057:2: rule__Bound_Down__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bound_Down__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_Down__Group__3"


    // $ANTLR start "rule__Bound_Down__Group__3__Impl"
    // InternalAdeptness.g:2063:1: rule__Bound_Down__Group__3__Impl : ( ( rule__Bound_Down__ValueAssignment_3 ) ) ;
    public final void rule__Bound_Down__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2067:1: ( ( ( rule__Bound_Down__ValueAssignment_3 ) ) )
            // InternalAdeptness.g:2068:1: ( ( rule__Bound_Down__ValueAssignment_3 ) )
            {
            // InternalAdeptness.g:2068:1: ( ( rule__Bound_Down__ValueAssignment_3 ) )
            // InternalAdeptness.g:2069:2: ( rule__Bound_Down__ValueAssignment_3 )
            {
             before(grammarAccess.getBound_DownAccess().getValueAssignment_3()); 
            // InternalAdeptness.g:2070:2: ( rule__Bound_Down__ValueAssignment_3 )
            // InternalAdeptness.g:2070:3: rule__Bound_Down__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Bound_Down__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBound_DownAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_Down__Group__3__Impl"


    // $ANTLR start "rule__D__Group__0"
    // InternalAdeptness.g:2079:1: rule__D__Group__0 : rule__D__Group__0__Impl rule__D__Group__1 ;
    public final void rule__D__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2083:1: ( rule__D__Group__0__Impl rule__D__Group__1 )
            // InternalAdeptness.g:2084:2: rule__D__Group__0__Impl rule__D__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalAdeptness.g:2091:1: rule__D__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__D__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2095:1: ( ( ( '-' )? ) )
            // InternalAdeptness.g:2096:1: ( ( '-' )? )
            {
            // InternalAdeptness.g:2096:1: ( ( '-' )? )
            // InternalAdeptness.g:2097:2: ( '-' )?
            {
             before(grammarAccess.getDAccess().getHyphenMinusKeyword_0()); 
            // InternalAdeptness.g:2098:2: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAdeptness.g:2098:3: '-'
                    {
                    match(input,27,FOLLOW_2); 

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
    // InternalAdeptness.g:2106:1: rule__D__Group__1 : rule__D__Group__1__Impl rule__D__Group__2 ;
    public final void rule__D__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2110:1: ( rule__D__Group__1__Impl rule__D__Group__2 )
            // InternalAdeptness.g:2111:2: rule__D__Group__1__Impl rule__D__Group__2
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
    // InternalAdeptness.g:2118:1: rule__D__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__D__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2122:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:2123:1: ( RULE_INT )
            {
            // InternalAdeptness.g:2123:1: ( RULE_INT )
            // InternalAdeptness.g:2124:2: RULE_INT
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
    // InternalAdeptness.g:2133:1: rule__D__Group__2 : rule__D__Group__2__Impl ;
    public final void rule__D__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2137:1: ( rule__D__Group__2__Impl )
            // InternalAdeptness.g:2138:2: rule__D__Group__2__Impl
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
    // InternalAdeptness.g:2144:1: rule__D__Group__2__Impl : ( ( rule__D__Group_2__0 )? ) ;
    public final void rule__D__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2148:1: ( ( ( rule__D__Group_2__0 )? ) )
            // InternalAdeptness.g:2149:1: ( ( rule__D__Group_2__0 )? )
            {
            // InternalAdeptness.g:2149:1: ( ( rule__D__Group_2__0 )? )
            // InternalAdeptness.g:2150:2: ( rule__D__Group_2__0 )?
            {
             before(grammarAccess.getDAccess().getGroup_2()); 
            // InternalAdeptness.g:2151:2: ( rule__D__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAdeptness.g:2151:3: rule__D__Group_2__0
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
    // InternalAdeptness.g:2160:1: rule__D__Group_2__0 : rule__D__Group_2__0__Impl rule__D__Group_2__1 ;
    public final void rule__D__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2164:1: ( rule__D__Group_2__0__Impl rule__D__Group_2__1 )
            // InternalAdeptness.g:2165:2: rule__D__Group_2__0__Impl rule__D__Group_2__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalAdeptness.g:2172:1: rule__D__Group_2__0__Impl : ( '.' ) ;
    public final void rule__D__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2176:1: ( ( '.' ) )
            // InternalAdeptness.g:2177:1: ( '.' )
            {
            // InternalAdeptness.g:2177:1: ( '.' )
            // InternalAdeptness.g:2178:2: '.'
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
    // InternalAdeptness.g:2187:1: rule__D__Group_2__1 : rule__D__Group_2__1__Impl ;
    public final void rule__D__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2191:1: ( rule__D__Group_2__1__Impl )
            // InternalAdeptness.g:2192:2: rule__D__Group_2__1__Impl
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
    // InternalAdeptness.g:2198:1: rule__D__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__D__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2202:1: ( ( RULE_INT ) )
            // InternalAdeptness.g:2203:1: ( RULE_INT )
            {
            // InternalAdeptness.g:2203:1: ( RULE_INT )
            // InternalAdeptness.g:2204:2: RULE_INT
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
    // InternalAdeptness.g:2214:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2218:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalAdeptness.g:2219:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
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
    // InternalAdeptness.g:2226:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2230:1: ( ( 'datatype' ) )
            // InternalAdeptness.g:2231:1: ( 'datatype' )
            {
            // InternalAdeptness.g:2231:1: ( 'datatype' )
            // InternalAdeptness.g:2232:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAdeptness.g:2241:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2245:1: ( rule__DataType__Group__1__Impl )
            // InternalAdeptness.g:2246:2: rule__DataType__Group__1__Impl
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
    // InternalAdeptness.g:2252:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2256:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalAdeptness.g:2257:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:2257:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalAdeptness.g:2258:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:2259:2: ( rule__DataType__NameAssignment_1 )
            // InternalAdeptness.g:2259:3: rule__DataType__NameAssignment_1
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
    // InternalAdeptness.g:2268:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2272:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // InternalAdeptness.g:2273:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
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
    // InternalAdeptness.g:2280:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2284:1: ( ( 'package' ) )
            // InternalAdeptness.g:2285:1: ( 'package' )
            {
            // InternalAdeptness.g:2285:1: ( 'package' )
            // InternalAdeptness.g:2286:2: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalAdeptness.g:2295:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2299:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // InternalAdeptness.g:2300:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdeptness.g:2307:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2311:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // InternalAdeptness.g:2312:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // InternalAdeptness.g:2312:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // InternalAdeptness.g:2313:2: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // InternalAdeptness.g:2314:2: ( rule__PackageDeclaration__NameAssignment_1 )
            // InternalAdeptness.g:2314:3: rule__PackageDeclaration__NameAssignment_1
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
    // InternalAdeptness.g:2322:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2326:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // InternalAdeptness.g:2327:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalAdeptness.g:2334:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2338:1: ( ( '{' ) )
            // InternalAdeptness.g:2339:1: ( '{' )
            {
            // InternalAdeptness.g:2339:1: ( '{' )
            // InternalAdeptness.g:2340:2: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalAdeptness.g:2349:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2353:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // InternalAdeptness.g:2354:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalAdeptness.g:2361:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2365:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) )
            // InternalAdeptness.g:2366:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            {
            // InternalAdeptness.g:2366:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            // InternalAdeptness.g:2367:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 
            // InternalAdeptness.g:2368:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13||LA13_0==16||(LA13_0>=28 && LA13_0<=29)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAdeptness.g:2368:3: rule__PackageDeclaration__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__PackageDeclaration__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalAdeptness.g:2376:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2380:1: ( rule__PackageDeclaration__Group__4__Impl )
            // InternalAdeptness.g:2381:2: rule__PackageDeclaration__Group__4__Impl
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
    // InternalAdeptness.g:2387:1: rule__PackageDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2391:1: ( ( '}' ) )
            // InternalAdeptness.g:2392:1: ( '}' )
            {
            // InternalAdeptness.g:2392:1: ( '}' )
            // InternalAdeptness.g:2393:2: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalAdeptness.g:2403:1: rule__Adeptness__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Adeptness__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2407:1: ( ( ruleAbstractElement ) )
            // InternalAdeptness.g:2408:2: ( ruleAbstractElement )
            {
            // InternalAdeptness.g:2408:2: ( ruleAbstractElement )
            // InternalAdeptness.g:2409:3: ruleAbstractElement
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
    // InternalAdeptness.g:2418:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2422:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalAdeptness.g:2423:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalAdeptness.g:2423:2: ( ruleQualifiedNameWithWildcard )
            // InternalAdeptness.g:2424:3: ruleQualifiedNameWithWildcard
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
    // InternalAdeptness.g:2433:1: rule__Signal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2437:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:2438:2: ( RULE_ID )
            {
            // InternalAdeptness.g:2438:2: ( RULE_ID )
            // InternalAdeptness.g:2439:3: RULE_ID
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


    // $ANTLR start "rule__Signal__Check_static_upperAssignment_3"
    // InternalAdeptness.g:2448:1: rule__Signal__Check_static_upperAssignment_3 : ( ruleCheck_Static_upper_only ) ;
    public final void rule__Signal__Check_static_upperAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2452:1: ( ( ruleCheck_Static_upper_only ) )
            // InternalAdeptness.g:2453:2: ( ruleCheck_Static_upper_only )
            {
            // InternalAdeptness.g:2453:2: ( ruleCheck_Static_upper_only )
            // InternalAdeptness.g:2454:3: ruleCheck_Static_upper_only
            {
             before(grammarAccess.getSignalAccess().getCheck_static_upperCheck_Static_upper_onlyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCheck_Static_upper_only();

            state._fsp--;

             after(grammarAccess.getSignalAccess().getCheck_static_upperCheck_Static_upper_onlyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Check_static_upperAssignment_3"


    // $ANTLR start "rule__Signal__Check_static_lowerAssignment_4"
    // InternalAdeptness.g:2463:1: rule__Signal__Check_static_lowerAssignment_4 : ( ruleCheck_Static_lower_only ) ;
    public final void rule__Signal__Check_static_lowerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2467:1: ( ( ruleCheck_Static_lower_only ) )
            // InternalAdeptness.g:2468:2: ( ruleCheck_Static_lower_only )
            {
            // InternalAdeptness.g:2468:2: ( ruleCheck_Static_lower_only )
            // InternalAdeptness.g:2469:3: ruleCheck_Static_lower_only
            {
             before(grammarAccess.getSignalAccess().getCheck_static_lowerCheck_Static_lower_onlyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCheck_Static_lower_only();

            state._fsp--;

             after(grammarAccess.getSignalAccess().getCheck_static_lowerCheck_Static_lower_onlyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Check_static_lowerAssignment_4"


    // $ANTLR start "rule__Signal__Check_rangeAssignment_5"
    // InternalAdeptness.g:2478:1: rule__Signal__Check_rangeAssignment_5 : ( ruleCheck_Range ) ;
    public final void rule__Signal__Check_rangeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2482:1: ( ( ruleCheck_Range ) )
            // InternalAdeptness.g:2483:2: ( ruleCheck_Range )
            {
            // InternalAdeptness.g:2483:2: ( ruleCheck_Range )
            // InternalAdeptness.g:2484:3: ruleCheck_Range
            {
             before(grammarAccess.getSignalAccess().getCheck_rangeCheck_RangeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCheck_Range();

            state._fsp--;

             after(grammarAccess.getSignalAccess().getCheck_rangeCheck_RangeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Check_rangeAssignment_5"


    // $ANTLR start "rule__Signal__Check_gapAssignment_6"
    // InternalAdeptness.g:2493:1: rule__Signal__Check_gapAssignment_6 : ( ruleCheck_Gap ) ;
    public final void rule__Signal__Check_gapAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2497:1: ( ( ruleCheck_Gap ) )
            // InternalAdeptness.g:2498:2: ( ruleCheck_Gap )
            {
            // InternalAdeptness.g:2498:2: ( ruleCheck_Gap )
            // InternalAdeptness.g:2499:3: ruleCheck_Gap
            {
             before(grammarAccess.getSignalAccess().getCheck_gapCheck_GapParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleCheck_Gap();

            state._fsp--;

             after(grammarAccess.getSignalAccess().getCheck_gapCheck_GapParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Check_gapAssignment_6"


    // $ANTLR start "rule__Check_Static_upper_only__NameAssignment_1"
    // InternalAdeptness.g:2508:1: rule__Check_Static_upper_only__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Check_Static_upper_only__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2512:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:2513:2: ( RULE_ID )
            {
            // InternalAdeptness.g:2513:2: ( RULE_ID )
            // InternalAdeptness.g:2514:3: RULE_ID
            {
             before(grammarAccess.getCheck_Static_upper_onlyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheck_Static_upper_onlyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_upper_only__NameAssignment_1"


    // $ANTLR start "rule__Check_Static_upper_only__Inclusive_boundAssignment_3"
    // InternalAdeptness.g:2523:1: rule__Check_Static_upper_only__Inclusive_boundAssignment_3 : ( ruleInclusiveBound ) ;
    public final void rule__Check_Static_upper_only__Inclusive_boundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2527:1: ( ( ruleInclusiveBound ) )
            // InternalAdeptness.g:2528:2: ( ruleInclusiveBound )
            {
            // InternalAdeptness.g:2528:2: ( ruleInclusiveBound )
            // InternalAdeptness.g:2529:3: ruleInclusiveBound
            {
             before(grammarAccess.getCheck_Static_upper_onlyAccess().getInclusive_boundInclusiveBoundParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInclusiveBound();

            state._fsp--;

             after(grammarAccess.getCheck_Static_upper_onlyAccess().getInclusive_boundInclusiveBoundParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_upper_only__Inclusive_boundAssignment_3"


    // $ANTLR start "rule__Check_Static_upper_only__Bound_upAssignment_4"
    // InternalAdeptness.g:2538:1: rule__Check_Static_upper_only__Bound_upAssignment_4 : ( ruleBound_up ) ;
    public final void rule__Check_Static_upper_only__Bound_upAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2542:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:2543:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:2543:2: ( ruleBound_up )
            // InternalAdeptness.g:2544:3: ruleBound_up
            {
             before(grammarAccess.getCheck_Static_upper_onlyAccess().getBound_upBound_upParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBound_up();

            state._fsp--;

             after(grammarAccess.getCheck_Static_upper_onlyAccess().getBound_upBound_upParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_upper_only__Bound_upAssignment_4"


    // $ANTLR start "rule__Check_Static_lower_only__NameAssignment_1"
    // InternalAdeptness.g:2553:1: rule__Check_Static_lower_only__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Check_Static_lower_only__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2557:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:2558:2: ( RULE_ID )
            {
            // InternalAdeptness.g:2558:2: ( RULE_ID )
            // InternalAdeptness.g:2559:3: RULE_ID
            {
             before(grammarAccess.getCheck_Static_lower_onlyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheck_Static_lower_onlyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_lower_only__NameAssignment_1"


    // $ANTLR start "rule__Check_Static_lower_only__Inclusive_boundAssignment_3"
    // InternalAdeptness.g:2568:1: rule__Check_Static_lower_only__Inclusive_boundAssignment_3 : ( ruleInclusiveBound ) ;
    public final void rule__Check_Static_lower_only__Inclusive_boundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2572:1: ( ( ruleInclusiveBound ) )
            // InternalAdeptness.g:2573:2: ( ruleInclusiveBound )
            {
            // InternalAdeptness.g:2573:2: ( ruleInclusiveBound )
            // InternalAdeptness.g:2574:3: ruleInclusiveBound
            {
             before(grammarAccess.getCheck_Static_lower_onlyAccess().getInclusive_boundInclusiveBoundParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInclusiveBound();

            state._fsp--;

             after(grammarAccess.getCheck_Static_lower_onlyAccess().getInclusive_boundInclusiveBoundParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_lower_only__Inclusive_boundAssignment_3"


    // $ANTLR start "rule__Check_Static_lower_only__Bound_lowAssignment_4"
    // InternalAdeptness.g:2583:1: rule__Check_Static_lower_only__Bound_lowAssignment_4 : ( ruleBound_Down ) ;
    public final void rule__Check_Static_lower_only__Bound_lowAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2587:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:2588:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:2588:2: ( ruleBound_Down )
            // InternalAdeptness.g:2589:3: ruleBound_Down
            {
             before(grammarAccess.getCheck_Static_lower_onlyAccess().getBound_lowBound_DownParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBound_Down();

            state._fsp--;

             after(grammarAccess.getCheck_Static_lower_onlyAccess().getBound_lowBound_DownParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Static_lower_only__Bound_lowAssignment_4"


    // $ANTLR start "rule__Check_Range__NameAssignment_1"
    // InternalAdeptness.g:2598:1: rule__Check_Range__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Check_Range__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2602:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:2603:2: ( RULE_ID )
            {
            // InternalAdeptness.g:2603:2: ( RULE_ID )
            // InternalAdeptness.g:2604:3: RULE_ID
            {
             before(grammarAccess.getCheck_RangeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheck_RangeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Range__NameAssignment_1"


    // $ANTLR start "rule__Check_Range__Inclusive_boundAssignment_3"
    // InternalAdeptness.g:2613:1: rule__Check_Range__Inclusive_boundAssignment_3 : ( ruleInclusiveBound ) ;
    public final void rule__Check_Range__Inclusive_boundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2617:1: ( ( ruleInclusiveBound ) )
            // InternalAdeptness.g:2618:2: ( ruleInclusiveBound )
            {
            // InternalAdeptness.g:2618:2: ( ruleInclusiveBound )
            // InternalAdeptness.g:2619:3: ruleInclusiveBound
            {
             before(grammarAccess.getCheck_RangeAccess().getInclusive_boundInclusiveBoundParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInclusiveBound();

            state._fsp--;

             after(grammarAccess.getCheck_RangeAccess().getInclusive_boundInclusiveBoundParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Range__Inclusive_boundAssignment_3"


    // $ANTLR start "rule__Check_Range__Bound_lowAssignment_4"
    // InternalAdeptness.g:2628:1: rule__Check_Range__Bound_lowAssignment_4 : ( ruleBound_Down ) ;
    public final void rule__Check_Range__Bound_lowAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2632:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:2633:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:2633:2: ( ruleBound_Down )
            // InternalAdeptness.g:2634:3: ruleBound_Down
            {
             before(grammarAccess.getCheck_RangeAccess().getBound_lowBound_DownParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBound_Down();

            state._fsp--;

             after(grammarAccess.getCheck_RangeAccess().getBound_lowBound_DownParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Range__Bound_lowAssignment_4"


    // $ANTLR start "rule__Check_Range__Bound_upAssignment_5"
    // InternalAdeptness.g:2643:1: rule__Check_Range__Bound_upAssignment_5 : ( ruleBound_up ) ;
    public final void rule__Check_Range__Bound_upAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2647:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:2648:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:2648:2: ( ruleBound_up )
            // InternalAdeptness.g:2649:3: ruleBound_up
            {
             before(grammarAccess.getCheck_RangeAccess().getBound_upBound_upParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBound_up();

            state._fsp--;

             after(grammarAccess.getCheck_RangeAccess().getBound_upBound_upParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Range__Bound_upAssignment_5"


    // $ANTLR start "rule__Check_Gap__NameAssignment_1"
    // InternalAdeptness.g:2658:1: rule__Check_Gap__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Check_Gap__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2662:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:2663:2: ( RULE_ID )
            {
            // InternalAdeptness.g:2663:2: ( RULE_ID )
            // InternalAdeptness.g:2664:3: RULE_ID
            {
             before(grammarAccess.getCheck_GapAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheck_GapAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Gap__NameAssignment_1"


    // $ANTLR start "rule__Check_Gap__Inclusive_boundAssignment_3"
    // InternalAdeptness.g:2673:1: rule__Check_Gap__Inclusive_boundAssignment_3 : ( ruleInclusiveBound ) ;
    public final void rule__Check_Gap__Inclusive_boundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2677:1: ( ( ruleInclusiveBound ) )
            // InternalAdeptness.g:2678:2: ( ruleInclusiveBound )
            {
            // InternalAdeptness.g:2678:2: ( ruleInclusiveBound )
            // InternalAdeptness.g:2679:3: ruleInclusiveBound
            {
             before(grammarAccess.getCheck_GapAccess().getInclusive_boundInclusiveBoundParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInclusiveBound();

            state._fsp--;

             after(grammarAccess.getCheck_GapAccess().getInclusive_boundInclusiveBoundParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Gap__Inclusive_boundAssignment_3"


    // $ANTLR start "rule__Check_Gap__Bound_lowAssignment_4"
    // InternalAdeptness.g:2688:1: rule__Check_Gap__Bound_lowAssignment_4 : ( ruleBound_Down ) ;
    public final void rule__Check_Gap__Bound_lowAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2692:1: ( ( ruleBound_Down ) )
            // InternalAdeptness.g:2693:2: ( ruleBound_Down )
            {
            // InternalAdeptness.g:2693:2: ( ruleBound_Down )
            // InternalAdeptness.g:2694:3: ruleBound_Down
            {
             before(grammarAccess.getCheck_GapAccess().getBound_lowBound_DownParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBound_Down();

            state._fsp--;

             after(grammarAccess.getCheck_GapAccess().getBound_lowBound_DownParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Gap__Bound_lowAssignment_4"


    // $ANTLR start "rule__Check_Gap__Bound_upAssignment_5"
    // InternalAdeptness.g:2703:1: rule__Check_Gap__Bound_upAssignment_5 : ( ruleBound_up ) ;
    public final void rule__Check_Gap__Bound_upAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2707:1: ( ( ruleBound_up ) )
            // InternalAdeptness.g:2708:2: ( ruleBound_up )
            {
            // InternalAdeptness.g:2708:2: ( ruleBound_up )
            // InternalAdeptness.g:2709:3: ruleBound_up
            {
             before(grammarAccess.getCheck_GapAccess().getBound_upBound_upParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBound_up();

            state._fsp--;

             after(grammarAccess.getCheck_GapAccess().getBound_upBound_upParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check_Gap__Bound_upAssignment_5"


    // $ANTLR start "rule__InclusiveBound__NameAssignment_1"
    // InternalAdeptness.g:2718:1: rule__InclusiveBound__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InclusiveBound__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2722:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:2723:2: ( RULE_ID )
            {
            // InternalAdeptness.g:2723:2: ( RULE_ID )
            // InternalAdeptness.g:2724:3: RULE_ID
            {
             before(grammarAccess.getInclusiveBoundAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInclusiveBoundAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InclusiveBound__NameAssignment_1"


    // $ANTLR start "rule__InclusiveBound__ValueAssignment_3"
    // InternalAdeptness.g:2733:1: rule__InclusiveBound__ValueAssignment_3 : ( ruleBOOLEAN ) ;
    public final void rule__InclusiveBound__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2737:1: ( ( ruleBOOLEAN ) )
            // InternalAdeptness.g:2738:2: ( ruleBOOLEAN )
            {
            // InternalAdeptness.g:2738:2: ( ruleBOOLEAN )
            // InternalAdeptness.g:2739:3: ruleBOOLEAN
            {
             before(grammarAccess.getInclusiveBoundAccess().getValueBOOLEANParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBOOLEAN();

            state._fsp--;

             after(grammarAccess.getInclusiveBoundAccess().getValueBOOLEANParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InclusiveBound__ValueAssignment_3"


    // $ANTLR start "rule__Bound_up__NameAssignment_1"
    // InternalAdeptness.g:2748:1: rule__Bound_up__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Bound_up__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2752:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:2753:2: ( RULE_ID )
            {
            // InternalAdeptness.g:2753:2: ( RULE_ID )
            // InternalAdeptness.g:2754:3: RULE_ID
            {
             before(grammarAccess.getBound_upAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBound_upAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_up__NameAssignment_1"


    // $ANTLR start "rule__Bound_up__ValueAssignment_3"
    // InternalAdeptness.g:2763:1: rule__Bound_up__ValueAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__Bound_up__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2767:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:2768:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:2768:2: ( ruleDOUBLE )
            // InternalAdeptness.g:2769:3: ruleDOUBLE
            {
             before(grammarAccess.getBound_upAccess().getValueDOUBLEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getBound_upAccess().getValueDOUBLEParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_up__ValueAssignment_3"


    // $ANTLR start "rule__Bound_Down__NameAssignment_1"
    // InternalAdeptness.g:2778:1: rule__Bound_Down__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Bound_Down__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2782:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:2783:2: ( RULE_ID )
            {
            // InternalAdeptness.g:2783:2: ( RULE_ID )
            // InternalAdeptness.g:2784:3: RULE_ID
            {
             before(grammarAccess.getBound_DownAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBound_DownAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_Down__NameAssignment_1"


    // $ANTLR start "rule__Bound_Down__ValueAssignment_3"
    // InternalAdeptness.g:2793:1: rule__Bound_Down__ValueAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__Bound_Down__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2797:1: ( ( ruleDOUBLE ) )
            // InternalAdeptness.g:2798:2: ( ruleDOUBLE )
            {
            // InternalAdeptness.g:2798:2: ( ruleDOUBLE )
            // InternalAdeptness.g:2799:3: ruleDOUBLE
            {
             before(grammarAccess.getBound_DownAccess().getValueDOUBLEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getBound_DownAccess().getValueDOUBLEParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_Down__ValueAssignment_3"


    // $ANTLR start "rule__BOOLEAN__BoolAssignment"
    // InternalAdeptness.g:2808:1: rule__BOOLEAN__BoolAssignment : ( ruleb ) ;
    public final void rule__BOOLEAN__BoolAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2812:1: ( ( ruleb ) )
            // InternalAdeptness.g:2813:2: ( ruleb )
            {
            // InternalAdeptness.g:2813:2: ( ruleb )
            // InternalAdeptness.g:2814:3: ruleb
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
    // InternalAdeptness.g:2823:1: rule__DOUBLE__DValAssignment : ( ruled ) ;
    public final void rule__DOUBLE__DValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2827:1: ( ( ruled ) )
            // InternalAdeptness.g:2828:2: ( ruled )
            {
            // InternalAdeptness.g:2828:2: ( ruled )
            // InternalAdeptness.g:2829:3: ruled
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
    // InternalAdeptness.g:2838:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2842:1: ( ( RULE_ID ) )
            // InternalAdeptness.g:2843:2: ( RULE_ID )
            {
            // InternalAdeptness.g:2843:2: ( RULE_ID )
            // InternalAdeptness.g:2844:3: RULE_ID
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
    // InternalAdeptness.g:2853:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2857:1: ( ( ruleQualifiedName ) )
            // InternalAdeptness.g:2858:2: ( ruleQualifiedName )
            {
            // InternalAdeptness.g:2858:2: ( ruleQualifiedName )
            // InternalAdeptness.g:2859:3: ruleQualifiedName
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
    // InternalAdeptness.g:2868:1: rule__PackageDeclaration__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdeptness.g:2872:1: ( ( ruleAbstractElement ) )
            // InternalAdeptness.g:2873:2: ( ruleAbstractElement )
            {
            // InternalAdeptness.g:2873:2: ( ruleAbstractElement )
            // InternalAdeptness.g:2874:3: ruleAbstractElement
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000030012002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000030052000L});

}