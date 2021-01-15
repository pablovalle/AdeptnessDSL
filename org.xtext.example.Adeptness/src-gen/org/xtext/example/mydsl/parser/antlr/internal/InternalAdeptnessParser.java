package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.AdeptnessGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAdeptnessParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'VALIDATIONPLAN'", "':'", "'implements'", "'ENDVALIDATIONPLAN'", "'TEST'", "'SUT:'", "','", "'TestLevel:'", "'Inputs:'", "'ENDTEST'", "'TESTINGORACLE'", "'Type:'", "'Params:'", "'ENDTESTINGORACLE'", "'MONITORINGPLAN'", "'ENDMONITORINGPLAN'", "'MONITOR'", "'type'", "'max'", "'min'", "'ENDMONITOR'", "'boolean'", "'int'", "'double'", "'CPS'", "'['", "']'", "'ENDCPS'", "'ORACLE'", "'ENDORACLE'", "'while:'", "'when:'", "'after('", "')'", "'during('", "'checks:'", "'Description: '", "'fails if :'", "';'", "'confidence is below'", "'more than'", "'times within'", "'confidence is in constant degradation'", "'within'", "'should be'", "'should not be'", "'is below'", "'is above'", "'is in range between'", "'and'", "'not in range between'", "'exactly'", "'times'", "'times in'", "'at most'", "'at least'", "'true'", "'false'", "'-'", "'milliseconds'", "'seconds'", "'minutes'", "'hours'", "'datatype'", "'package'", "'{'", "'}'", "'('", "'=='", "'!='", "'>='", "'<='", "'<'", "'>'", "'&&'", "'||'", "'+'", "'*'", "'/'"
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
    public static final int RULE_INT=6;
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
    public static final int RULE_STRING=5;
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

        public InternalAdeptnessParser(TokenStream input, AdeptnessGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Adeptness";
       	}

       	@Override
       	protected AdeptnessGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAdeptness"
    // InternalAdeptness.g:64:1: entryRuleAdeptness returns [EObject current=null] : iv_ruleAdeptness= ruleAdeptness EOF ;
    public final EObject entryRuleAdeptness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdeptness = null;


        try {
            // InternalAdeptness.g:64:50: (iv_ruleAdeptness= ruleAdeptness EOF )
            // InternalAdeptness.g:65:2: iv_ruleAdeptness= ruleAdeptness EOF
            {
             newCompositeNode(grammarAccess.getAdeptnessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdeptness=ruleAdeptness();

            state._fsp--;

             current =iv_ruleAdeptness; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdeptness"


    // $ANTLR start "ruleAdeptness"
    // InternalAdeptness.g:71:1: ruleAdeptness returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleAdeptness() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:77:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // InternalAdeptness.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // InternalAdeptness.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14||LA1_0==28||LA1_0==38||(LA1_0>=77 && LA1_0<=78)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAdeptness.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalAdeptness.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalAdeptness.g:80:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getAdeptnessAccess().getElementsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getAdeptnessRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.example.mydsl.Adeptness.AbstractElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdeptness"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalAdeptness.g:100:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalAdeptness.g:100:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalAdeptness.g:101:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalAdeptness.g:107:1: ruleAbstractElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Imports_2= ruleImports ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_Type_1 = null;

        EObject this_Imports_2 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:113:2: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Imports_2= ruleImports ) )
            // InternalAdeptness.g:114:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Imports_2= ruleImports )
            {
            // InternalAdeptness.g:114:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Imports_2= ruleImports )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt2=1;
                }
                break;
            case 14:
            case 28:
            case 38:
            case 77:
                {
                alt2=2;
                }
                break;
            case 11:
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
                    // InternalAdeptness.g:115:3: this_PackageDeclaration_0= rulePackageDeclaration
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PackageDeclaration_0=rulePackageDeclaration();

                    state._fsp--;


                    			current = this_PackageDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:124:3: this_Type_1= ruleType
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_1=ruleType();

                    state._fsp--;


                    			current = this_Type_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:133:3: this_Imports_2= ruleImports
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getImportsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Imports_2=ruleImports();

                    state._fsp--;


                    			current = this_Imports_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleImports"
    // InternalAdeptness.g:145:1: entryRuleImports returns [EObject current=null] : iv_ruleImports= ruleImports EOF ;
    public final EObject entryRuleImports() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImports = null;


        try {
            // InternalAdeptness.g:145:48: (iv_ruleImports= ruleImports EOF )
            // InternalAdeptness.g:146:2: iv_ruleImports= ruleImports EOF
            {
             newCompositeNode(grammarAccess.getImportsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImports=ruleImports();

            state._fsp--;

             current =iv_ruleImports; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImports"


    // $ANTLR start "ruleImports"
    // InternalAdeptness.g:152:1: ruleImports returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImports() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:158:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalAdeptness.g:159:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalAdeptness.g:159:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalAdeptness.g:160:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportsAccess().getImportKeyword_0());
            		
            // InternalAdeptness.g:164:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalAdeptness.g:165:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalAdeptness.g:165:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalAdeptness.g:166:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportsAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportsRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.xtext.example.mydsl.Adeptness.QualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImports"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalAdeptness.g:187:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAdeptness.g:187:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAdeptness.g:188:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalAdeptness.g:194:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:200:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalAdeptness.g:201:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalAdeptness.g:201:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalAdeptness.g:202:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAdeptness.g:212:3: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAdeptness.g:213:4: kw= '.*'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAdeptness.g:223:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAdeptness.g:223:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAdeptness.g:224:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalAdeptness.g:230:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAdeptness.g:236:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAdeptness.g:237:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAdeptness.g:237:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAdeptness.g:238:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalAdeptness.g:245:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAdeptness.g:246:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleType"
    // InternalAdeptness.g:263:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalAdeptness.g:263:45: (iv_ruleType= ruleType EOF )
            // InternalAdeptness.g:264:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalAdeptness.g:270:1: ruleType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Signal_1= ruleSignal | this_MonitoringFile_2= ruleMonitoringFile | this_ValidationPlan_3= ruleValidationPlan ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Signal_1 = null;

        EObject this_MonitoringFile_2 = null;

        EObject this_ValidationPlan_3 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:276:2: ( (this_DataType_0= ruleDataType | this_Signal_1= ruleSignal | this_MonitoringFile_2= ruleMonitoringFile | this_ValidationPlan_3= ruleValidationPlan ) )
            // InternalAdeptness.g:277:2: (this_DataType_0= ruleDataType | this_Signal_1= ruleSignal | this_MonitoringFile_2= ruleMonitoringFile | this_ValidationPlan_3= ruleValidationPlan )
            {
            // InternalAdeptness.g:277:2: (this_DataType_0= ruleDataType | this_Signal_1= ruleSignal | this_MonitoringFile_2= ruleMonitoringFile | this_ValidationPlan_3= ruleValidationPlan )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt5=1;
                }
                break;
            case 38:
                {
                alt5=2;
                }
                break;
            case 28:
                {
                alt5=3;
                }
                break;
            case 14:
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
                    // InternalAdeptness.g:278:3: this_DataType_0= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_0=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:287:3: this_Signal_1= ruleSignal
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getSignalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Signal_1=ruleSignal();

                    state._fsp--;


                    			current = this_Signal_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:296:3: this_MonitoringFile_2= ruleMonitoringFile
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getMonitoringFileParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MonitoringFile_2=ruleMonitoringFile();

                    state._fsp--;


                    			current = this_MonitoringFile_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:305:3: this_ValidationPlan_3= ruleValidationPlan
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getValidationPlanParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValidationPlan_3=ruleValidationPlan();

                    state._fsp--;


                    			current = this_ValidationPlan_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleValidationPlan"
    // InternalAdeptness.g:317:1: entryRuleValidationPlan returns [EObject current=null] : iv_ruleValidationPlan= ruleValidationPlan EOF ;
    public final EObject entryRuleValidationPlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidationPlan = null;


        try {
            // InternalAdeptness.g:317:55: (iv_ruleValidationPlan= ruleValidationPlan EOF )
            // InternalAdeptness.g:318:2: iv_ruleValidationPlan= ruleValidationPlan EOF
            {
             newCompositeNode(grammarAccess.getValidationPlanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidationPlan=ruleValidationPlan();

            state._fsp--;

             current =iv_ruleValidationPlan; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidationPlan"


    // $ANTLR start "ruleValidationPlan"
    // InternalAdeptness.g:324:1: ruleValidationPlan returns [EObject current=null] : (otherlv_0= 'VALIDATIONPLAN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'implements' ( ( ruleQualifiedName ) ) )? ( (lv_test_5_0= ruleTest ) )+ otherlv_6= 'ENDVALIDATIONPLAN' ) ;
    public final EObject ruleValidationPlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_test_5_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:330:2: ( (otherlv_0= 'VALIDATIONPLAN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'implements' ( ( ruleQualifiedName ) ) )? ( (lv_test_5_0= ruleTest ) )+ otherlv_6= 'ENDVALIDATIONPLAN' ) )
            // InternalAdeptness.g:331:2: (otherlv_0= 'VALIDATIONPLAN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'implements' ( ( ruleQualifiedName ) ) )? ( (lv_test_5_0= ruleTest ) )+ otherlv_6= 'ENDVALIDATIONPLAN' )
            {
            // InternalAdeptness.g:331:2: (otherlv_0= 'VALIDATIONPLAN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'implements' ( ( ruleQualifiedName ) ) )? ( (lv_test_5_0= ruleTest ) )+ otherlv_6= 'ENDVALIDATIONPLAN' )
            // InternalAdeptness.g:332:3: otherlv_0= 'VALIDATIONPLAN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' (otherlv_3= 'implements' ( ( ruleQualifiedName ) ) )? ( (lv_test_5_0= ruleTest ) )+ otherlv_6= 'ENDVALIDATIONPLAN'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getValidationPlanAccess().getVALIDATIONPLANKeyword_0());
            		
            // InternalAdeptness.g:336:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:337:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:337:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:338:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getValidationPlanAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValidationPlanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getValidationPlanAccess().getColonKeyword_2());
            		
            // InternalAdeptness.g:358:3: (otherlv_3= 'implements' ( ( ruleQualifiedName ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAdeptness.g:359:4: otherlv_3= 'implements' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getValidationPlanAccess().getImplementsKeyword_3_0());
                    			
                    // InternalAdeptness.g:363:4: ( ( ruleQualifiedName ) )
                    // InternalAdeptness.g:364:5: ( ruleQualifiedName )
                    {
                    // InternalAdeptness.g:364:5: ( ruleQualifiedName )
                    // InternalAdeptness.g:365:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValidationPlanRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getValidationPlanAccess().getSuperTypeMonitoringFileCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAdeptness.g:380:3: ( (lv_test_5_0= ruleTest ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAdeptness.g:381:4: (lv_test_5_0= ruleTest )
            	    {
            	    // InternalAdeptness.g:381:4: (lv_test_5_0= ruleTest )
            	    // InternalAdeptness.g:382:5: lv_test_5_0= ruleTest
            	    {

            	    					newCompositeNode(grammarAccess.getValidationPlanAccess().getTestTestParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_test_5_0=ruleTest();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getValidationPlanRule());
            	    					}
            	    					add(
            	    						current,
            	    						"test",
            	    						lv_test_5_0,
            	    						"org.xtext.example.mydsl.Adeptness.Test");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getValidationPlanAccess().getENDVALIDATIONPLANKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidationPlan"


    // $ANTLR start "entryRuleTest"
    // InternalAdeptness.g:407:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // InternalAdeptness.g:407:45: (iv_ruleTest= ruleTest EOF )
            // InternalAdeptness.g:408:2: iv_ruleTest= ruleTest EOF
            {
             newCompositeNode(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTest=ruleTest();

            state._fsp--;

             current =iv_ruleTest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalAdeptness.g:414:1: ruleTest returns [EObject current=null] : (otherlv_0= 'TEST' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'SUT:' ( (lv_sut_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'TestLevel:' ( (lv_testLevel_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Inputs:' ( (lv_inputs_10_0= ruleInputs ) )+ ( (lv_oracles_11_0= ruleTestingOracle ) )+ otherlv_12= 'ENDTEST' ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_sut_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_testLevel_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject lv_inputs_10_0 = null;

        EObject lv_oracles_11_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:420:2: ( (otherlv_0= 'TEST' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'SUT:' ( (lv_sut_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'TestLevel:' ( (lv_testLevel_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Inputs:' ( (lv_inputs_10_0= ruleInputs ) )+ ( (lv_oracles_11_0= ruleTestingOracle ) )+ otherlv_12= 'ENDTEST' ) )
            // InternalAdeptness.g:421:2: (otherlv_0= 'TEST' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'SUT:' ( (lv_sut_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'TestLevel:' ( (lv_testLevel_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Inputs:' ( (lv_inputs_10_0= ruleInputs ) )+ ( (lv_oracles_11_0= ruleTestingOracle ) )+ otherlv_12= 'ENDTEST' )
            {
            // InternalAdeptness.g:421:2: (otherlv_0= 'TEST' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'SUT:' ( (lv_sut_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'TestLevel:' ( (lv_testLevel_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Inputs:' ( (lv_inputs_10_0= ruleInputs ) )+ ( (lv_oracles_11_0= ruleTestingOracle ) )+ otherlv_12= 'ENDTEST' )
            // InternalAdeptness.g:422:3: otherlv_0= 'TEST' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'SUT:' ( (lv_sut_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'TestLevel:' ( (lv_testLevel_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Inputs:' ( (lv_inputs_10_0= ruleInputs ) )+ ( (lv_oracles_11_0= ruleTestingOracle ) )+ otherlv_12= 'ENDTEST'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTestAccess().getTESTKeyword_0());
            		
            // InternalAdeptness.g:426:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:427:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:427:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:428:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTestAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getTestAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getTestAccess().getSUTKeyword_3());
            		
            // InternalAdeptness.g:452:3: ( (lv_sut_4_0= RULE_STRING ) )
            // InternalAdeptness.g:453:4: (lv_sut_4_0= RULE_STRING )
            {
            // InternalAdeptness.g:453:4: (lv_sut_4_0= RULE_STRING )
            // InternalAdeptness.g:454:5: lv_sut_4_0= RULE_STRING
            {
            lv_sut_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_sut_4_0, grammarAccess.getTestAccess().getSutSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sut",
            						lv_sut_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getTestAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getTestAccess().getTestLevelKeyword_6());
            		
            // InternalAdeptness.g:478:3: ( (lv_testLevel_7_0= RULE_STRING ) )
            // InternalAdeptness.g:479:4: (lv_testLevel_7_0= RULE_STRING )
            {
            // InternalAdeptness.g:479:4: (lv_testLevel_7_0= RULE_STRING )
            // InternalAdeptness.g:480:5: lv_testLevel_7_0= RULE_STRING
            {
            lv_testLevel_7_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_testLevel_7_0, grammarAccess.getTestAccess().getTestLevelSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"testLevel",
            						lv_testLevel_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getTestAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getTestAccess().getInputsKeyword_9());
            		
            // InternalAdeptness.g:504:3: ( (lv_inputs_10_0= ruleInputs ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAdeptness.g:505:4: (lv_inputs_10_0= ruleInputs )
            	    {
            	    // InternalAdeptness.g:505:4: (lv_inputs_10_0= ruleInputs )
            	    // InternalAdeptness.g:506:5: lv_inputs_10_0= ruleInputs
            	    {

            	    					newCompositeNode(grammarAccess.getTestAccess().getInputsInputsParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_inputs_10_0=ruleInputs();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inputs",
            	    						lv_inputs_10_0,
            	    						"org.xtext.example.mydsl.Adeptness.Inputs");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // InternalAdeptness.g:523:3: ( (lv_oracles_11_0= ruleTestingOracle ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAdeptness.g:524:4: (lv_oracles_11_0= ruleTestingOracle )
            	    {
            	    // InternalAdeptness.g:524:4: (lv_oracles_11_0= ruleTestingOracle )
            	    // InternalAdeptness.g:525:5: lv_oracles_11_0= ruleTestingOracle
            	    {

            	    					newCompositeNode(grammarAccess.getTestAccess().getOraclesTestingOracleParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_oracles_11_0=ruleTestingOracle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"oracles",
            	    						lv_oracles_11_0,
            	    						"org.xtext.example.mydsl.Adeptness.TestingOracle");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_12=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getTestAccess().getENDTESTKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleTestingOracle"
    // InternalAdeptness.g:550:1: entryRuleTestingOracle returns [EObject current=null] : iv_ruleTestingOracle= ruleTestingOracle EOF ;
    public final EObject entryRuleTestingOracle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestingOracle = null;


        try {
            // InternalAdeptness.g:550:54: (iv_ruleTestingOracle= ruleTestingOracle EOF )
            // InternalAdeptness.g:551:2: iv_ruleTestingOracle= ruleTestingOracle EOF
            {
             newCompositeNode(grammarAccess.getTestingOracleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestingOracle=ruleTestingOracle();

            state._fsp--;

             current =iv_ruleTestingOracle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestingOracle"


    // $ANTLR start "ruleTestingOracle"
    // InternalAdeptness.g:557:1: ruleTestingOracle returns [EObject current=null] : (otherlv_0= 'TESTINGORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Type:' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Params:' ( (lv_parameters_7_0= ruleParameters ) )+ otherlv_8= 'ENDTESTINGORACLE' ) ;
    public final EObject ruleTestingOracle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_parameters_7_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:563:2: ( (otherlv_0= 'TESTINGORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Type:' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Params:' ( (lv_parameters_7_0= ruleParameters ) )+ otherlv_8= 'ENDTESTINGORACLE' ) )
            // InternalAdeptness.g:564:2: (otherlv_0= 'TESTINGORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Type:' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Params:' ( (lv_parameters_7_0= ruleParameters ) )+ otherlv_8= 'ENDTESTINGORACLE' )
            {
            // InternalAdeptness.g:564:2: (otherlv_0= 'TESTINGORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Type:' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Params:' ( (lv_parameters_7_0= ruleParameters ) )+ otherlv_8= 'ENDTESTINGORACLE' )
            // InternalAdeptness.g:565:3: otherlv_0= 'TESTINGORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'Type:' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'Params:' ( (lv_parameters_7_0= ruleParameters ) )+ otherlv_8= 'ENDTESTINGORACLE'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTestingOracleAccess().getTESTINGORACLEKeyword_0());
            		
            // InternalAdeptness.g:569:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:570:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:570:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:571:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTestingOracleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestingOracleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTestingOracleAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getTestingOracleAccess().getTypeKeyword_3());
            		
            // InternalAdeptness.g:595:3: ( (lv_type_4_0= RULE_STRING ) )
            // InternalAdeptness.g:596:4: (lv_type_4_0= RULE_STRING )
            {
            // InternalAdeptness.g:596:4: (lv_type_4_0= RULE_STRING )
            // InternalAdeptness.g:597:5: lv_type_4_0= RULE_STRING
            {
            lv_type_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_type_4_0, grammarAccess.getTestingOracleAccess().getTypeSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestingOracleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getTestingOracleAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getTestingOracleAccess().getParamsKeyword_6());
            		
            // InternalAdeptness.g:621:3: ( (lv_parameters_7_0= ruleParameters ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==EOF||LA10_0==RULE_ID||LA10_0==RULE_INT||LA10_0==20||LA10_0==46||(LA10_0>=48 && LA10_0<=49)||LA10_0==52||(LA10_0>=58 && LA10_0<=65)||(LA10_0>=68 && LA10_0<=69)||LA10_0==72||LA10_0==81) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAdeptness.g:622:4: (lv_parameters_7_0= ruleParameters )
            	    {
            	    // InternalAdeptness.g:622:4: (lv_parameters_7_0= ruleParameters )
            	    // InternalAdeptness.g:623:5: lv_parameters_7_0= ruleParameters
            	    {

            	    					newCompositeNode(grammarAccess.getTestingOracleAccess().getParametersParametersParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_parameters_7_0=ruleParameters();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestingOracleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_7_0,
            	    						"org.xtext.example.mydsl.Adeptness.Parameters");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_8=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTestingOracleAccess().getENDTESTINGORACLEKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestingOracle"


    // $ANTLR start "entryRuleParameters"
    // InternalAdeptness.g:648:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // InternalAdeptness.g:648:51: (iv_ruleParameters= ruleParameters EOF )
            // InternalAdeptness.g:649:2: iv_ruleParameters= ruleParameters EOF
            {
             newCompositeNode(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameters=ruleParameters();

            state._fsp--;

             current =iv_ruleParameters; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalAdeptness.g:655:1: ruleParameters returns [EObject current=null] : ( ( (lv_value_0_0= ruleExpressionsModel ) ) otherlv_1= ',' ) ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:661:2: ( ( ( (lv_value_0_0= ruleExpressionsModel ) ) otherlv_1= ',' ) )
            // InternalAdeptness.g:662:2: ( ( (lv_value_0_0= ruleExpressionsModel ) ) otherlv_1= ',' )
            {
            // InternalAdeptness.g:662:2: ( ( (lv_value_0_0= ruleExpressionsModel ) ) otherlv_1= ',' )
            // InternalAdeptness.g:663:3: ( (lv_value_0_0= ruleExpressionsModel ) ) otherlv_1= ','
            {
            // InternalAdeptness.g:663:3: ( (lv_value_0_0= ruleExpressionsModel ) )
            // InternalAdeptness.g:664:4: (lv_value_0_0= ruleExpressionsModel )
            {
            // InternalAdeptness.g:664:4: (lv_value_0_0= ruleExpressionsModel )
            // InternalAdeptness.g:665:5: lv_value_0_0= ruleExpressionsModel
            {

            					newCompositeNode(grammarAccess.getParametersAccess().getValueExpressionsModelParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_value_0_0=ruleExpressionsModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParametersRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.xtext.example.mydsl.Adeptness.ExpressionsModel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getParametersAccess().getCommaKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleInputs"
    // InternalAdeptness.g:690:1: entryRuleInputs returns [EObject current=null] : iv_ruleInputs= ruleInputs EOF ;
    public final EObject entryRuleInputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputs = null;


        try {
            // InternalAdeptness.g:690:47: (iv_ruleInputs= ruleInputs EOF )
            // InternalAdeptness.g:691:2: iv_ruleInputs= ruleInputs EOF
            {
             newCompositeNode(grammarAccess.getInputsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputs=ruleInputs();

            state._fsp--;

             current =iv_ruleInputs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputs"


    // $ANTLR start "ruleInputs"
    // InternalAdeptness.g:697:1: ruleInputs returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) otherlv_1= ',' ) ;
    public final EObject ruleInputs() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAdeptness.g:703:2: ( ( ( (lv_value_0_0= RULE_STRING ) ) otherlv_1= ',' ) )
            // InternalAdeptness.g:704:2: ( ( (lv_value_0_0= RULE_STRING ) ) otherlv_1= ',' )
            {
            // InternalAdeptness.g:704:2: ( ( (lv_value_0_0= RULE_STRING ) ) otherlv_1= ',' )
            // InternalAdeptness.g:705:3: ( (lv_value_0_0= RULE_STRING ) ) otherlv_1= ','
            {
            // InternalAdeptness.g:705:3: ( (lv_value_0_0= RULE_STRING ) )
            // InternalAdeptness.g:706:4: (lv_value_0_0= RULE_STRING )
            {
            // InternalAdeptness.g:706:4: (lv_value_0_0= RULE_STRING )
            // InternalAdeptness.g:707:5: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_value_0_0, grammarAccess.getInputsAccess().getValueSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInputsAccess().getCommaKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputs"


    // $ANTLR start "entryRuleMonitoringFile"
    // InternalAdeptness.g:731:1: entryRuleMonitoringFile returns [EObject current=null] : iv_ruleMonitoringFile= ruleMonitoringFile EOF ;
    public final EObject entryRuleMonitoringFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitoringFile = null;


        try {
            // InternalAdeptness.g:731:55: (iv_ruleMonitoringFile= ruleMonitoringFile EOF )
            // InternalAdeptness.g:732:2: iv_ruleMonitoringFile= ruleMonitoringFile EOF
            {
             newCompositeNode(grammarAccess.getMonitoringFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonitoringFile=ruleMonitoringFile();

            state._fsp--;

             current =iv_ruleMonitoringFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMonitoringFile"


    // $ANTLR start "ruleMonitoringFile"
    // InternalAdeptness.g:738:1: ruleMonitoringFile returns [EObject current=null] : (otherlv_0= 'MONITORINGPLAN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_monitoringPlan_3_0= ruleMonitoringPlan ) )+ otherlv_4= 'ENDMONITORINGPLAN' ) ;
    public final EObject ruleMonitoringFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_monitoringPlan_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:744:2: ( (otherlv_0= 'MONITORINGPLAN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_monitoringPlan_3_0= ruleMonitoringPlan ) )+ otherlv_4= 'ENDMONITORINGPLAN' ) )
            // InternalAdeptness.g:745:2: (otherlv_0= 'MONITORINGPLAN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_monitoringPlan_3_0= ruleMonitoringPlan ) )+ otherlv_4= 'ENDMONITORINGPLAN' )
            {
            // InternalAdeptness.g:745:2: (otherlv_0= 'MONITORINGPLAN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_monitoringPlan_3_0= ruleMonitoringPlan ) )+ otherlv_4= 'ENDMONITORINGPLAN' )
            // InternalAdeptness.g:746:3: otherlv_0= 'MONITORINGPLAN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_monitoringPlan_3_0= ruleMonitoringPlan ) )+ otherlv_4= 'ENDMONITORINGPLAN'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMonitoringFileAccess().getMONITORINGPLANKeyword_0());
            		
            // InternalAdeptness.g:750:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:751:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:751:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:752:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMonitoringFileAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMonitoringFileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getMonitoringFileAccess().getColonKeyword_2());
            		
            // InternalAdeptness.g:772:3: ( (lv_monitoringPlan_3_0= ruleMonitoringPlan ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAdeptness.g:773:4: (lv_monitoringPlan_3_0= ruleMonitoringPlan )
            	    {
            	    // InternalAdeptness.g:773:4: (lv_monitoringPlan_3_0= ruleMonitoringPlan )
            	    // InternalAdeptness.g:774:5: lv_monitoringPlan_3_0= ruleMonitoringPlan
            	    {

            	    					newCompositeNode(grammarAccess.getMonitoringFileAccess().getMonitoringPlanMonitoringPlanParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_monitoringPlan_3_0=ruleMonitoringPlan();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMonitoringFileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"monitoringPlan",
            	    						lv_monitoringPlan_3_0,
            	    						"org.xtext.example.mydsl.Adeptness.MonitoringPlan");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMonitoringFileAccess().getENDMONITORINGPLANKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonitoringFile"


    // $ANTLR start "entryRuleMonitoringPlan"
    // InternalAdeptness.g:799:1: entryRuleMonitoringPlan returns [EObject current=null] : iv_ruleMonitoringPlan= ruleMonitoringPlan EOF ;
    public final EObject entryRuleMonitoringPlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitoringPlan = null;


        try {
            // InternalAdeptness.g:799:55: (iv_ruleMonitoringPlan= ruleMonitoringPlan EOF )
            // InternalAdeptness.g:800:2: iv_ruleMonitoringPlan= ruleMonitoringPlan EOF
            {
             newCompositeNode(grammarAccess.getMonitoringPlanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonitoringPlan=ruleMonitoringPlan();

            state._fsp--;

             current =iv_ruleMonitoringPlan; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMonitoringPlan"


    // $ANTLR start "ruleMonitoringPlan"
    // InternalAdeptness.g:806:1: ruleMonitoringPlan returns [EObject current=null] : ( (lv_monitoringVariables_0_0= ruleMonitoringVariable ) ) ;
    public final EObject ruleMonitoringPlan() throws RecognitionException {
        EObject current = null;

        EObject lv_monitoringVariables_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:812:2: ( ( (lv_monitoringVariables_0_0= ruleMonitoringVariable ) ) )
            // InternalAdeptness.g:813:2: ( (lv_monitoringVariables_0_0= ruleMonitoringVariable ) )
            {
            // InternalAdeptness.g:813:2: ( (lv_monitoringVariables_0_0= ruleMonitoringVariable ) )
            // InternalAdeptness.g:814:3: (lv_monitoringVariables_0_0= ruleMonitoringVariable )
            {
            // InternalAdeptness.g:814:3: (lv_monitoringVariables_0_0= ruleMonitoringVariable )
            // InternalAdeptness.g:815:4: lv_monitoringVariables_0_0= ruleMonitoringVariable
            {

            				newCompositeNode(grammarAccess.getMonitoringPlanAccess().getMonitoringVariablesMonitoringVariableParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_monitoringVariables_0_0=ruleMonitoringVariable();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getMonitoringPlanRule());
            				}
            				set(
            					current,
            					"monitoringVariables",
            					lv_monitoringVariables_0_0,
            					"org.xtext.example.mydsl.Adeptness.MonitoringVariable");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonitoringPlan"


    // $ANTLR start "entryRuleMonitoringVariable"
    // InternalAdeptness.g:835:1: entryRuleMonitoringVariable returns [EObject current=null] : iv_ruleMonitoringVariable= ruleMonitoringVariable EOF ;
    public final EObject entryRuleMonitoringVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitoringVariable = null;


        try {
            // InternalAdeptness.g:835:59: (iv_ruleMonitoringVariable= ruleMonitoringVariable EOF )
            // InternalAdeptness.g:836:2: iv_ruleMonitoringVariable= ruleMonitoringVariable EOF
            {
             newCompositeNode(grammarAccess.getMonitoringVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonitoringVariable=ruleMonitoringVariable();

            state._fsp--;

             current =iv_ruleMonitoringVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMonitoringVariable"


    // $ANTLR start "ruleMonitoringVariable"
    // InternalAdeptness.g:842:1: ruleMonitoringVariable returns [EObject current=null] : (otherlv_0= 'MONITOR' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'type' otherlv_4= ':' ( (lv_MonitoringVariableDatatype_5_0= ruleSig_type ) ) (otherlv_6= 'max' otherlv_7= ':' ( (lv_max_8_0= ruleDOUBLE ) ) otherlv_9= 'min' otherlv_10= ':' ( (lv_min_11_0= ruleDOUBLE ) ) )? otherlv_12= 'ENDMONITOR' ) ;
    public final EObject ruleMonitoringVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_MonitoringVariableDatatype_5_0 = null;

        EObject lv_max_8_0 = null;

        EObject lv_min_11_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:848:2: ( (otherlv_0= 'MONITOR' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'type' otherlv_4= ':' ( (lv_MonitoringVariableDatatype_5_0= ruleSig_type ) ) (otherlv_6= 'max' otherlv_7= ':' ( (lv_max_8_0= ruleDOUBLE ) ) otherlv_9= 'min' otherlv_10= ':' ( (lv_min_11_0= ruleDOUBLE ) ) )? otherlv_12= 'ENDMONITOR' ) )
            // InternalAdeptness.g:849:2: (otherlv_0= 'MONITOR' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'type' otherlv_4= ':' ( (lv_MonitoringVariableDatatype_5_0= ruleSig_type ) ) (otherlv_6= 'max' otherlv_7= ':' ( (lv_max_8_0= ruleDOUBLE ) ) otherlv_9= 'min' otherlv_10= ':' ( (lv_min_11_0= ruleDOUBLE ) ) )? otherlv_12= 'ENDMONITOR' )
            {
            // InternalAdeptness.g:849:2: (otherlv_0= 'MONITOR' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'type' otherlv_4= ':' ( (lv_MonitoringVariableDatatype_5_0= ruleSig_type ) ) (otherlv_6= 'max' otherlv_7= ':' ( (lv_max_8_0= ruleDOUBLE ) ) otherlv_9= 'min' otherlv_10= ':' ( (lv_min_11_0= ruleDOUBLE ) ) )? otherlv_12= 'ENDMONITOR' )
            // InternalAdeptness.g:850:3: otherlv_0= 'MONITOR' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'type' otherlv_4= ':' ( (lv_MonitoringVariableDatatype_5_0= ruleSig_type ) ) (otherlv_6= 'max' otherlv_7= ':' ( (lv_max_8_0= ruleDOUBLE ) ) otherlv_9= 'min' otherlv_10= ':' ( (lv_min_11_0= ruleDOUBLE ) ) )? otherlv_12= 'ENDMONITOR'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMonitoringVariableAccess().getMONITORKeyword_0());
            		
            // InternalAdeptness.g:854:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:855:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:855:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:856:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMonitoringVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMonitoringVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getMonitoringVariableAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMonitoringVariableAccess().getTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getMonitoringVariableAccess().getColonKeyword_4());
            		
            // InternalAdeptness.g:884:3: ( (lv_MonitoringVariableDatatype_5_0= ruleSig_type ) )
            // InternalAdeptness.g:885:4: (lv_MonitoringVariableDatatype_5_0= ruleSig_type )
            {
            // InternalAdeptness.g:885:4: (lv_MonitoringVariableDatatype_5_0= ruleSig_type )
            // InternalAdeptness.g:886:5: lv_MonitoringVariableDatatype_5_0= ruleSig_type
            {

            					newCompositeNode(grammarAccess.getMonitoringVariableAccess().getMonitoringVariableDatatypeSig_typeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
            lv_MonitoringVariableDatatype_5_0=ruleSig_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonitoringVariableRule());
            					}
            					set(
            						current,
            						"MonitoringVariableDatatype",
            						lv_MonitoringVariableDatatype_5_0,
            						"org.xtext.example.mydsl.Adeptness.Sig_type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdeptness.g:903:3: (otherlv_6= 'max' otherlv_7= ':' ( (lv_max_8_0= ruleDOUBLE ) ) otherlv_9= 'min' otherlv_10= ':' ( (lv_min_11_0= ruleDOUBLE ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAdeptness.g:904:4: otherlv_6= 'max' otherlv_7= ':' ( (lv_max_8_0= ruleDOUBLE ) ) otherlv_9= 'min' otherlv_10= ':' ( (lv_min_11_0= ruleDOUBLE ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getMonitoringVariableAccess().getMaxKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,15,FOLLOW_26); 

                    				newLeafNode(otherlv_7, grammarAccess.getMonitoringVariableAccess().getColonKeyword_6_1());
                    			
                    // InternalAdeptness.g:912:4: ( (lv_max_8_0= ruleDOUBLE ) )
                    // InternalAdeptness.g:913:5: (lv_max_8_0= ruleDOUBLE )
                    {
                    // InternalAdeptness.g:913:5: (lv_max_8_0= ruleDOUBLE )
                    // InternalAdeptness.g:914:6: lv_max_8_0= ruleDOUBLE
                    {

                    						newCompositeNode(grammarAccess.getMonitoringVariableAccess().getMaxDOUBLEParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_max_8_0=ruleDOUBLE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMonitoringVariableRule());
                    						}
                    						set(
                    							current,
                    							"max",
                    							lv_max_8_0,
                    							"org.xtext.example.mydsl.Adeptness.DOUBLE");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,33,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getMonitoringVariableAccess().getMinKeyword_6_3());
                    			
                    otherlv_10=(Token)match(input,15,FOLLOW_26); 

                    				newLeafNode(otherlv_10, grammarAccess.getMonitoringVariableAccess().getColonKeyword_6_4());
                    			
                    // InternalAdeptness.g:939:4: ( (lv_min_11_0= ruleDOUBLE ) )
                    // InternalAdeptness.g:940:5: (lv_min_11_0= ruleDOUBLE )
                    {
                    // InternalAdeptness.g:940:5: (lv_min_11_0= ruleDOUBLE )
                    // InternalAdeptness.g:941:6: lv_min_11_0= ruleDOUBLE
                    {

                    						newCompositeNode(grammarAccess.getMonitoringVariableAccess().getMinDOUBLEParserRuleCall_6_5_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_min_11_0=ruleDOUBLE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMonitoringVariableRule());
                    						}
                    						set(
                    							current,
                    							"min",
                    							lv_min_11_0,
                    							"org.xtext.example.mydsl.Adeptness.DOUBLE");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getMonitoringVariableAccess().getENDMONITORKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonitoringVariable"


    // $ANTLR start "entryRuleSig_type"
    // InternalAdeptness.g:967:1: entryRuleSig_type returns [EObject current=null] : iv_ruleSig_type= ruleSig_type EOF ;
    public final EObject entryRuleSig_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSig_type = null;


        try {
            // InternalAdeptness.g:967:49: (iv_ruleSig_type= ruleSig_type EOF )
            // InternalAdeptness.g:968:2: iv_ruleSig_type= ruleSig_type EOF
            {
             newCompositeNode(grammarAccess.getSig_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSig_type=ruleSig_type();

            state._fsp--;

             current =iv_ruleSig_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSig_type"


    // $ANTLR start "ruleSig_type"
    // InternalAdeptness.g:974:1: ruleSig_type returns [EObject current=null] : ( ( (lv_sig_type_0_0= 'boolean' ) ) | ( (lv_sig_type_1_0= 'int' ) ) | ( (lv_sig_type_2_0= 'double' ) ) ) ;
    public final EObject ruleSig_type() throws RecognitionException {
        EObject current = null;

        Token lv_sig_type_0_0=null;
        Token lv_sig_type_1_0=null;
        Token lv_sig_type_2_0=null;


        	enterRule();

        try {
            // InternalAdeptness.g:980:2: ( ( ( (lv_sig_type_0_0= 'boolean' ) ) | ( (lv_sig_type_1_0= 'int' ) ) | ( (lv_sig_type_2_0= 'double' ) ) ) )
            // InternalAdeptness.g:981:2: ( ( (lv_sig_type_0_0= 'boolean' ) ) | ( (lv_sig_type_1_0= 'int' ) ) | ( (lv_sig_type_2_0= 'double' ) ) )
            {
            // InternalAdeptness.g:981:2: ( ( (lv_sig_type_0_0= 'boolean' ) ) | ( (lv_sig_type_1_0= 'int' ) ) | ( (lv_sig_type_2_0= 'double' ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt13=1;
                }
                break;
            case 36:
                {
                alt13=2;
                }
                break;
            case 37:
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
                    // InternalAdeptness.g:982:3: ( (lv_sig_type_0_0= 'boolean' ) )
                    {
                    // InternalAdeptness.g:982:3: ( (lv_sig_type_0_0= 'boolean' ) )
                    // InternalAdeptness.g:983:4: (lv_sig_type_0_0= 'boolean' )
                    {
                    // InternalAdeptness.g:983:4: (lv_sig_type_0_0= 'boolean' )
                    // InternalAdeptness.g:984:5: lv_sig_type_0_0= 'boolean'
                    {
                    lv_sig_type_0_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_sig_type_0_0, grammarAccess.getSig_typeAccess().getSig_typeBooleanKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSig_typeRule());
                    					}
                    					setWithLastConsumed(current, "sig_type", lv_sig_type_0_0, "boolean");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:997:3: ( (lv_sig_type_1_0= 'int' ) )
                    {
                    // InternalAdeptness.g:997:3: ( (lv_sig_type_1_0= 'int' ) )
                    // InternalAdeptness.g:998:4: (lv_sig_type_1_0= 'int' )
                    {
                    // InternalAdeptness.g:998:4: (lv_sig_type_1_0= 'int' )
                    // InternalAdeptness.g:999:5: lv_sig_type_1_0= 'int'
                    {
                    lv_sig_type_1_0=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_sig_type_1_0, grammarAccess.getSig_typeAccess().getSig_typeIntKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSig_typeRule());
                    					}
                    					setWithLastConsumed(current, "sig_type", lv_sig_type_1_0, "int");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1012:3: ( (lv_sig_type_2_0= 'double' ) )
                    {
                    // InternalAdeptness.g:1012:3: ( (lv_sig_type_2_0= 'double' ) )
                    // InternalAdeptness.g:1013:4: (lv_sig_type_2_0= 'double' )
                    {
                    // InternalAdeptness.g:1013:4: (lv_sig_type_2_0= 'double' )
                    // InternalAdeptness.g:1014:5: lv_sig_type_2_0= 'double'
                    {
                    lv_sig_type_2_0=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_sig_type_2_0, grammarAccess.getSig_typeAccess().getSig_typeDoubleKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSig_typeRule());
                    					}
                    					setWithLastConsumed(current, "sig_type", lv_sig_type_2_0, "double");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSig_type"


    // $ANTLR start "entryRuleSignal"
    // InternalAdeptness.g:1030:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // InternalAdeptness.g:1030:47: (iv_ruleSignal= ruleSignal EOF )
            // InternalAdeptness.g:1031:2: iv_ruleSignal= ruleSignal EOF
            {
             newCompositeNode(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignal=ruleSignal();

            state._fsp--;

             current =iv_ruleSignal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // InternalAdeptness.g:1037:1: ruleSignal returns [EObject current=null] : (otherlv_0= 'CPS' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_cardinalityNumCPS_3_0= RULE_INT ) ) otherlv_4= ']' )? otherlv_5= ':' (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) )? ( (lv_oracle_8_0= ruleOracle ) )+ otherlv_9= 'ENDCPS' ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_cardinalityNumCPS_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_oracle_8_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1043:2: ( (otherlv_0= 'CPS' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_cardinalityNumCPS_3_0= RULE_INT ) ) otherlv_4= ']' )? otherlv_5= ':' (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) )? ( (lv_oracle_8_0= ruleOracle ) )+ otherlv_9= 'ENDCPS' ) )
            // InternalAdeptness.g:1044:2: (otherlv_0= 'CPS' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_cardinalityNumCPS_3_0= RULE_INT ) ) otherlv_4= ']' )? otherlv_5= ':' (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) )? ( (lv_oracle_8_0= ruleOracle ) )+ otherlv_9= 'ENDCPS' )
            {
            // InternalAdeptness.g:1044:2: (otherlv_0= 'CPS' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_cardinalityNumCPS_3_0= RULE_INT ) ) otherlv_4= ']' )? otherlv_5= ':' (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) )? ( (lv_oracle_8_0= ruleOracle ) )+ otherlv_9= 'ENDCPS' )
            // InternalAdeptness.g:1045:3: otherlv_0= 'CPS' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_cardinalityNumCPS_3_0= RULE_INT ) ) otherlv_4= ']' )? otherlv_5= ':' (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) )? ( (lv_oracle_8_0= ruleOracle ) )+ otherlv_9= 'ENDCPS'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSignalAccess().getCPSKeyword_0());
            		
            // InternalAdeptness.g:1049:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:1050:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:1050:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:1051:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAdeptness.g:1067:3: (otherlv_2= '[' ( (lv_cardinalityNumCPS_3_0= RULE_INT ) ) otherlv_4= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAdeptness.g:1068:4: otherlv_2= '[' ( (lv_cardinalityNumCPS_3_0= RULE_INT ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getSignalAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalAdeptness.g:1072:4: ( (lv_cardinalityNumCPS_3_0= RULE_INT ) )
                    // InternalAdeptness.g:1073:5: (lv_cardinalityNumCPS_3_0= RULE_INT )
                    {
                    // InternalAdeptness.g:1073:5: (lv_cardinalityNumCPS_3_0= RULE_INT )
                    // InternalAdeptness.g:1074:6: lv_cardinalityNumCPS_3_0= RULE_INT
                    {
                    lv_cardinalityNumCPS_3_0=(Token)match(input,RULE_INT,FOLLOW_31); 

                    						newLeafNode(lv_cardinalityNumCPS_3_0, grammarAccess.getSignalAccess().getCardinalityNumCPSINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSignalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"cardinalityNumCPS",
                    							lv_cardinalityNumCPS_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,40,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getSignalAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_32); 

            			newLeafNode(otherlv_5, grammarAccess.getSignalAccess().getColonKeyword_3());
            		
            // InternalAdeptness.g:1099:3: (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAdeptness.g:1100:4: otherlv_6= 'implements' ( ( ruleQualifiedName ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getSignalAccess().getImplementsKeyword_4_0());
                    			
                    // InternalAdeptness.g:1104:4: ( ( ruleQualifiedName ) )
                    // InternalAdeptness.g:1105:5: ( ruleQualifiedName )
                    {
                    // InternalAdeptness.g:1105:5: ( ruleQualifiedName )
                    // InternalAdeptness.g:1106:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSignalRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSignalAccess().getSuperTypeMonitoringFileCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAdeptness.g:1121:3: ( (lv_oracle_8_0= ruleOracle ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==42) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAdeptness.g:1122:4: (lv_oracle_8_0= ruleOracle )
            	    {
            	    // InternalAdeptness.g:1122:4: (lv_oracle_8_0= ruleOracle )
            	    // InternalAdeptness.g:1123:5: lv_oracle_8_0= ruleOracle
            	    {

            	    					newCompositeNode(grammarAccess.getSignalAccess().getOracleOracleParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_oracle_8_0=ruleOracle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSignalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"oracle",
            	    						lv_oracle_8_0,
            	    						"org.xtext.example.mydsl.Adeptness.Oracle");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_9=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSignalAccess().getENDCPSKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleOracle"
    // InternalAdeptness.g:1148:1: entryRuleOracle returns [EObject current=null] : iv_ruleOracle= ruleOracle EOF ;
    public final EObject entryRuleOracle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOracle = null;


        try {
            // InternalAdeptness.g:1148:47: (iv_ruleOracle= ruleOracle EOF )
            // InternalAdeptness.g:1149:2: iv_ruleOracle= ruleOracle EOF
            {
             newCompositeNode(grammarAccess.getOracleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOracle=ruleOracle();

            state._fsp--;

             current =iv_ruleOracle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOracle"


    // $ANTLR start "ruleOracle"
    // InternalAdeptness.g:1155:1: ruleOracle returns [EObject current=null] : (otherlv_0= 'ORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_when_3_0= ruleWhen ) ) | ( (lv_while_4_0= ruleWhile ) ) )? ( (lv_check_5_0= ruleChecks ) ) otherlv_6= 'ENDORACLE' ) ;
    public final EObject ruleOracle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_when_3_0 = null;

        EObject lv_while_4_0 = null;

        EObject lv_check_5_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1161:2: ( (otherlv_0= 'ORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_when_3_0= ruleWhen ) ) | ( (lv_while_4_0= ruleWhile ) ) )? ( (lv_check_5_0= ruleChecks ) ) otherlv_6= 'ENDORACLE' ) )
            // InternalAdeptness.g:1162:2: (otherlv_0= 'ORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_when_3_0= ruleWhen ) ) | ( (lv_while_4_0= ruleWhile ) ) )? ( (lv_check_5_0= ruleChecks ) ) otherlv_6= 'ENDORACLE' )
            {
            // InternalAdeptness.g:1162:2: (otherlv_0= 'ORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_when_3_0= ruleWhen ) ) | ( (lv_while_4_0= ruleWhile ) ) )? ( (lv_check_5_0= ruleChecks ) ) otherlv_6= 'ENDORACLE' )
            // InternalAdeptness.g:1163:3: otherlv_0= 'ORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_when_3_0= ruleWhen ) ) | ( (lv_while_4_0= ruleWhile ) ) )? ( (lv_check_5_0= ruleChecks ) ) otherlv_6= 'ENDORACLE'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOracleAccess().getORACLEKeyword_0());
            		
            // InternalAdeptness.g:1167:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:1168:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:1168:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:1169:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOracleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOracleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getOracleAccess().getColonKeyword_2());
            		
            // InternalAdeptness.g:1189:3: ( ( (lv_when_3_0= ruleWhen ) ) | ( (lv_while_4_0= ruleWhile ) ) )?
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==45) ) {
                alt17=1;
            }
            else if ( (LA17_0==44) ) {
                alt17=2;
            }
            switch (alt17) {
                case 1 :
                    // InternalAdeptness.g:1190:4: ( (lv_when_3_0= ruleWhen ) )
                    {
                    // InternalAdeptness.g:1190:4: ( (lv_when_3_0= ruleWhen ) )
                    // InternalAdeptness.g:1191:5: (lv_when_3_0= ruleWhen )
                    {
                    // InternalAdeptness.g:1191:5: (lv_when_3_0= ruleWhen )
                    // InternalAdeptness.g:1192:6: lv_when_3_0= ruleWhen
                    {

                    						newCompositeNode(grammarAccess.getOracleAccess().getWhenWhenParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_when_3_0=ruleWhen();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOracleRule());
                    						}
                    						set(
                    							current,
                    							"when",
                    							lv_when_3_0,
                    							"org.xtext.example.mydsl.Adeptness.When");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1210:4: ( (lv_while_4_0= ruleWhile ) )
                    {
                    // InternalAdeptness.g:1210:4: ( (lv_while_4_0= ruleWhile ) )
                    // InternalAdeptness.g:1211:5: (lv_while_4_0= ruleWhile )
                    {
                    // InternalAdeptness.g:1211:5: (lv_while_4_0= ruleWhile )
                    // InternalAdeptness.g:1212:6: lv_while_4_0= ruleWhile
                    {

                    						newCompositeNode(grammarAccess.getOracleAccess().getWhileWhileParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_while_4_0=ruleWhile();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOracleRule());
                    						}
                    						set(
                    							current,
                    							"while",
                    							lv_while_4_0,
                    							"org.xtext.example.mydsl.Adeptness.While");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAdeptness.g:1230:3: ( (lv_check_5_0= ruleChecks ) )
            // InternalAdeptness.g:1231:4: (lv_check_5_0= ruleChecks )
            {
            // InternalAdeptness.g:1231:4: (lv_check_5_0= ruleChecks )
            // InternalAdeptness.g:1232:5: lv_check_5_0= ruleChecks
            {

            					newCompositeNode(grammarAccess.getOracleAccess().getCheckChecksParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_35);
            lv_check_5_0=ruleChecks();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOracleRule());
            					}
            					set(
            						current,
            						"check",
            						lv_check_5_0,
            						"org.xtext.example.mydsl.Adeptness.Checks");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getOracleAccess().getENDORACLEKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOracle"


    // $ANTLR start "entryRuleWhile"
    // InternalAdeptness.g:1257:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalAdeptness.g:1257:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalAdeptness.g:1258:2: iv_ruleWhile= ruleWhile EOF
            {
             newCompositeNode(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;

             current =iv_ruleWhile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalAdeptness.g:1264:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while:' ( (lv_em_1_0= ruleExpressionsModel ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_em_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1270:2: ( (otherlv_0= 'while:' ( (lv_em_1_0= ruleExpressionsModel ) ) ) )
            // InternalAdeptness.g:1271:2: (otherlv_0= 'while:' ( (lv_em_1_0= ruleExpressionsModel ) ) )
            {
            // InternalAdeptness.g:1271:2: (otherlv_0= 'while:' ( (lv_em_1_0= ruleExpressionsModel ) ) )
            // InternalAdeptness.g:1272:3: otherlv_0= 'while:' ( (lv_em_1_0= ruleExpressionsModel ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
            		
            // InternalAdeptness.g:1276:3: ( (lv_em_1_0= ruleExpressionsModel ) )
            // InternalAdeptness.g:1277:4: (lv_em_1_0= ruleExpressionsModel )
            {
            // InternalAdeptness.g:1277:4: (lv_em_1_0= ruleExpressionsModel )
            // InternalAdeptness.g:1278:5: lv_em_1_0= ruleExpressionsModel
            {

            					newCompositeNode(grammarAccess.getWhileAccess().getEmExpressionsModelParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_em_1_0=ruleExpressionsModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileRule());
            					}
            					set(
            						current,
            						"em",
            						lv_em_1_0,
            						"org.xtext.example.mydsl.Adeptness.ExpressionsModel");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleWhen"
    // InternalAdeptness.g:1299:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalAdeptness.g:1299:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalAdeptness.g:1300:2: iv_ruleWhen= ruleWhen EOF
            {
             newCompositeNode(grammarAccess.getWhenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhen=ruleWhen();

            state._fsp--;

             current =iv_ruleWhen; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhen"


    // $ANTLR start "ruleWhen"
    // InternalAdeptness.g:1306:1: ruleWhen returns [EObject current=null] : (otherlv_0= 'when:' ( (lv_em_1_0= ruleExpressionsModel ) ) ( (lv_aw_2_0= ruleAfterWhen ) )? ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_em_1_0 = null;

        EObject lv_aw_2_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1312:2: ( (otherlv_0= 'when:' ( (lv_em_1_0= ruleExpressionsModel ) ) ( (lv_aw_2_0= ruleAfterWhen ) )? ) )
            // InternalAdeptness.g:1313:2: (otherlv_0= 'when:' ( (lv_em_1_0= ruleExpressionsModel ) ) ( (lv_aw_2_0= ruleAfterWhen ) )? )
            {
            // InternalAdeptness.g:1313:2: (otherlv_0= 'when:' ( (lv_em_1_0= ruleExpressionsModel ) ) ( (lv_aw_2_0= ruleAfterWhen ) )? )
            // InternalAdeptness.g:1314:3: otherlv_0= 'when:' ( (lv_em_1_0= ruleExpressionsModel ) ) ( (lv_aw_2_0= ruleAfterWhen ) )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getWhenAccess().getWhenKeyword_0());
            		
            // InternalAdeptness.g:1318:3: ( (lv_em_1_0= ruleExpressionsModel ) )
            // InternalAdeptness.g:1319:4: (lv_em_1_0= ruleExpressionsModel )
            {
            // InternalAdeptness.g:1319:4: (lv_em_1_0= ruleExpressionsModel )
            // InternalAdeptness.g:1320:5: lv_em_1_0= ruleExpressionsModel
            {

            					newCompositeNode(grammarAccess.getWhenAccess().getEmExpressionsModelParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_37);
            lv_em_1_0=ruleExpressionsModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhenRule());
            					}
            					set(
            						current,
            						"em",
            						lv_em_1_0,
            						"org.xtext.example.mydsl.Adeptness.ExpressionsModel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdeptness.g:1337:3: ( (lv_aw_2_0= ruleAfterWhen ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==46||LA18_0==48) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAdeptness.g:1338:4: (lv_aw_2_0= ruleAfterWhen )
                    {
                    // InternalAdeptness.g:1338:4: (lv_aw_2_0= ruleAfterWhen )
                    // InternalAdeptness.g:1339:5: lv_aw_2_0= ruleAfterWhen
                    {

                    					newCompositeNode(grammarAccess.getWhenAccess().getAwAfterWhenParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_aw_2_0=ruleAfterWhen();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWhenRule());
                    					}
                    					set(
                    						current,
                    						"aw",
                    						lv_aw_2_0,
                    						"org.xtext.example.mydsl.Adeptness.AfterWhen");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleAfterWhen"
    // InternalAdeptness.g:1360:1: entryRuleAfterWhen returns [EObject current=null] : iv_ruleAfterWhen= ruleAfterWhen EOF ;
    public final EObject entryRuleAfterWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAfterWhen = null;


        try {
            // InternalAdeptness.g:1360:50: (iv_ruleAfterWhen= ruleAfterWhen EOF )
            // InternalAdeptness.g:1361:2: iv_ruleAfterWhen= ruleAfterWhen EOF
            {
             newCompositeNode(grammarAccess.getAfterWhenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAfterWhen=ruleAfterWhen();

            state._fsp--;

             current =iv_ruleAfterWhen; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAfterWhen"


    // $ANTLR start "ruleAfterWhen"
    // InternalAdeptness.g:1367:1: ruleAfterWhen returns [EObject current=null] : ( ( (lv_wait_0_0= ruleWait ) ) | ( (lv_during_1_0= ruleDuring ) ) ) ;
    public final EObject ruleAfterWhen() throws RecognitionException {
        EObject current = null;

        EObject lv_wait_0_0 = null;

        EObject lv_during_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1373:2: ( ( ( (lv_wait_0_0= ruleWait ) ) | ( (lv_during_1_0= ruleDuring ) ) ) )
            // InternalAdeptness.g:1374:2: ( ( (lv_wait_0_0= ruleWait ) ) | ( (lv_during_1_0= ruleDuring ) ) )
            {
            // InternalAdeptness.g:1374:2: ( ( (lv_wait_0_0= ruleWait ) ) | ( (lv_during_1_0= ruleDuring ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==46) ) {
                alt19=1;
            }
            else if ( (LA19_0==48) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalAdeptness.g:1375:3: ( (lv_wait_0_0= ruleWait ) )
                    {
                    // InternalAdeptness.g:1375:3: ( (lv_wait_0_0= ruleWait ) )
                    // InternalAdeptness.g:1376:4: (lv_wait_0_0= ruleWait )
                    {
                    // InternalAdeptness.g:1376:4: (lv_wait_0_0= ruleWait )
                    // InternalAdeptness.g:1377:5: lv_wait_0_0= ruleWait
                    {

                    					newCompositeNode(grammarAccess.getAfterWhenAccess().getWaitWaitParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_wait_0_0=ruleWait();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAfterWhenRule());
                    					}
                    					set(
                    						current,
                    						"wait",
                    						lv_wait_0_0,
                    						"org.xtext.example.mydsl.Adeptness.Wait");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1395:3: ( (lv_during_1_0= ruleDuring ) )
                    {
                    // InternalAdeptness.g:1395:3: ( (lv_during_1_0= ruleDuring ) )
                    // InternalAdeptness.g:1396:4: (lv_during_1_0= ruleDuring )
                    {
                    // InternalAdeptness.g:1396:4: (lv_during_1_0= ruleDuring )
                    // InternalAdeptness.g:1397:5: lv_during_1_0= ruleDuring
                    {

                    					newCompositeNode(grammarAccess.getAfterWhenAccess().getDuringDuringParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_during_1_0=ruleDuring();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAfterWhenRule());
                    					}
                    					set(
                    						current,
                    						"during",
                    						lv_during_1_0,
                    						"org.xtext.example.mydsl.Adeptness.During");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAfterWhen"


    // $ANTLR start "entryRuleWait"
    // InternalAdeptness.g:1418:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalAdeptness.g:1418:45: (iv_ruleWait= ruleWait EOF )
            // InternalAdeptness.g:1419:2: iv_ruleWait= ruleWait EOF
            {
             newCompositeNode(grammarAccess.getWaitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWait=ruleWait();

            state._fsp--;

             current =iv_ruleWait; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWait"


    // $ANTLR start "ruleWait"
    // InternalAdeptness.g:1425:1: ruleWait returns [EObject current=null] : (otherlv_0= 'after(' ( (lv_time_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_unit_3_0= ruleTimeType ) ) otherlv_4= ')' ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_time_1_0 = null;

        EObject lv_unit_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1431:2: ( (otherlv_0= 'after(' ( (lv_time_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_unit_3_0= ruleTimeType ) ) otherlv_4= ')' ) )
            // InternalAdeptness.g:1432:2: (otherlv_0= 'after(' ( (lv_time_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_unit_3_0= ruleTimeType ) ) otherlv_4= ')' )
            {
            // InternalAdeptness.g:1432:2: (otherlv_0= 'after(' ( (lv_time_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_unit_3_0= ruleTimeType ) ) otherlv_4= ')' )
            // InternalAdeptness.g:1433:3: otherlv_0= 'after(' ( (lv_time_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_unit_3_0= ruleTimeType ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getWaitAccess().getAfterKeyword_0());
            		
            // InternalAdeptness.g:1437:3: ( (lv_time_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1438:4: (lv_time_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1438:4: (lv_time_1_0= ruleDOUBLE )
            // InternalAdeptness.g:1439:5: lv_time_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getWaitAccess().getTimeDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_time_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWaitRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_1_0,
            						"org.xtext.example.mydsl.Adeptness.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getWaitAccess().getCommaKeyword_2());
            		
            // InternalAdeptness.g:1460:3: ( (lv_unit_3_0= ruleTimeType ) )
            // InternalAdeptness.g:1461:4: (lv_unit_3_0= ruleTimeType )
            {
            // InternalAdeptness.g:1461:4: (lv_unit_3_0= ruleTimeType )
            // InternalAdeptness.g:1462:5: lv_unit_3_0= ruleTimeType
            {

            					newCompositeNode(grammarAccess.getWaitAccess().getUnitTimeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
            lv_unit_3_0=ruleTimeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWaitRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_3_0,
            						"org.xtext.example.mydsl.Adeptness.TimeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getWaitAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWait"


    // $ANTLR start "entryRuleDuring"
    // InternalAdeptness.g:1487:1: entryRuleDuring returns [EObject current=null] : iv_ruleDuring= ruleDuring EOF ;
    public final EObject entryRuleDuring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuring = null;


        try {
            // InternalAdeptness.g:1487:47: (iv_ruleDuring= ruleDuring EOF )
            // InternalAdeptness.g:1488:2: iv_ruleDuring= ruleDuring EOF
            {
             newCompositeNode(grammarAccess.getDuringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDuring=ruleDuring();

            state._fsp--;

             current =iv_ruleDuring; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDuring"


    // $ANTLR start "ruleDuring"
    // InternalAdeptness.g:1494:1: ruleDuring returns [EObject current=null] : (otherlv_0= 'during(' ( (lv_time_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_unit_3_0= ruleTimeType ) ) otherlv_4= ')' ) ;
    public final EObject ruleDuring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_time_1_0 = null;

        EObject lv_unit_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1500:2: ( (otherlv_0= 'during(' ( (lv_time_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_unit_3_0= ruleTimeType ) ) otherlv_4= ')' ) )
            // InternalAdeptness.g:1501:2: (otherlv_0= 'during(' ( (lv_time_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_unit_3_0= ruleTimeType ) ) otherlv_4= ')' )
            {
            // InternalAdeptness.g:1501:2: (otherlv_0= 'during(' ( (lv_time_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_unit_3_0= ruleTimeType ) ) otherlv_4= ')' )
            // InternalAdeptness.g:1502:3: otherlv_0= 'during(' ( (lv_time_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_unit_3_0= ruleTimeType ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getDuringAccess().getDuringKeyword_0());
            		
            // InternalAdeptness.g:1506:3: ( (lv_time_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1507:4: (lv_time_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1507:4: (lv_time_1_0= ruleDOUBLE )
            // InternalAdeptness.g:1508:5: lv_time_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getDuringAccess().getTimeDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_time_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDuringRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_1_0,
            						"org.xtext.example.mydsl.Adeptness.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getDuringAccess().getCommaKeyword_2());
            		
            // InternalAdeptness.g:1529:3: ( (lv_unit_3_0= ruleTimeType ) )
            // InternalAdeptness.g:1530:4: (lv_unit_3_0= ruleTimeType )
            {
            // InternalAdeptness.g:1530:4: (lv_unit_3_0= ruleTimeType )
            // InternalAdeptness.g:1531:5: lv_unit_3_0= ruleTimeType
            {

            					newCompositeNode(grammarAccess.getDuringAccess().getUnitTimeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
            lv_unit_3_0=ruleTimeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDuringRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_3_0,
            						"org.xtext.example.mydsl.Adeptness.TimeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDuringAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDuring"


    // $ANTLR start "entryRuleChecks"
    // InternalAdeptness.g:1556:1: entryRuleChecks returns [EObject current=null] : iv_ruleChecks= ruleChecks EOF ;
    public final EObject entryRuleChecks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChecks = null;


        try {
            // InternalAdeptness.g:1556:47: (iv_ruleChecks= ruleChecks EOF )
            // InternalAdeptness.g:1557:2: iv_ruleChecks= ruleChecks EOF
            {
             newCompositeNode(grammarAccess.getChecksRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChecks=ruleChecks();

            state._fsp--;

             current =iv_ruleChecks; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChecks"


    // $ANTLR start "ruleChecks"
    // InternalAdeptness.g:1563:1: ruleChecks returns [EObject current=null] : (otherlv_0= 'checks:' ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) ) ( (lv_reference_3_0= ruleReference ) ) ( (lv_failReason_4_0= ruleFailReason ) )+ ( (lv_description_5_0= ruleDescription ) ) ) ;
    public final EObject ruleChecks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_em_2_0 = null;

        EObject lv_reference_3_0 = null;

        EObject lv_failReason_4_0 = null;

        EObject lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1569:2: ( (otherlv_0= 'checks:' ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) ) ( (lv_reference_3_0= ruleReference ) ) ( (lv_failReason_4_0= ruleFailReason ) )+ ( (lv_description_5_0= ruleDescription ) ) ) )
            // InternalAdeptness.g:1570:2: (otherlv_0= 'checks:' ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) ) ( (lv_reference_3_0= ruleReference ) ) ( (lv_failReason_4_0= ruleFailReason ) )+ ( (lv_description_5_0= ruleDescription ) ) )
            {
            // InternalAdeptness.g:1570:2: (otherlv_0= 'checks:' ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) ) ( (lv_reference_3_0= ruleReference ) ) ( (lv_failReason_4_0= ruleFailReason ) )+ ( (lv_description_5_0= ruleDescription ) ) )
            // InternalAdeptness.g:1571:3: otherlv_0= 'checks:' ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) ) ( (lv_reference_3_0= ruleReference ) ) ( (lv_failReason_4_0= ruleFailReason ) )+ ( (lv_description_5_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getChecksAccess().getChecksKeyword_0());
            		
            // InternalAdeptness.g:1575:3: ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_INT||(LA20_0>=58 && LA20_0<=62)||LA20_0==64||LA20_0==72||LA20_0==81) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalAdeptness.g:1576:4: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalAdeptness.g:1576:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalAdeptness.g:1577:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalAdeptness.g:1577:5: (lv_name_1_0= RULE_ID )
                    // InternalAdeptness.g:1578:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_40); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getChecksAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChecksRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1595:4: ( (lv_em_2_0= ruleExpressionsModel ) )
                    {
                    // InternalAdeptness.g:1595:4: ( (lv_em_2_0= ruleExpressionsModel ) )
                    // InternalAdeptness.g:1596:5: (lv_em_2_0= ruleExpressionsModel )
                    {
                    // InternalAdeptness.g:1596:5: (lv_em_2_0= ruleExpressionsModel )
                    // InternalAdeptness.g:1597:6: lv_em_2_0= ruleExpressionsModel
                    {

                    						newCompositeNode(grammarAccess.getChecksAccess().getEmExpressionsModelParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_em_2_0=ruleExpressionsModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChecksRule());
                    						}
                    						set(
                    							current,
                    							"em",
                    							lv_em_2_0,
                    							"org.xtext.example.mydsl.Adeptness.ExpressionsModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAdeptness.g:1615:3: ( (lv_reference_3_0= ruleReference ) )
            // InternalAdeptness.g:1616:4: (lv_reference_3_0= ruleReference )
            {
            // InternalAdeptness.g:1616:4: (lv_reference_3_0= ruleReference )
            // InternalAdeptness.g:1617:5: lv_reference_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getChecksAccess().getReferenceReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
            lv_reference_3_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChecksRule());
            					}
            					set(
            						current,
            						"reference",
            						lv_reference_3_0,
            						"org.xtext.example.mydsl.Adeptness.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdeptness.g:1634:3: ( (lv_failReason_4_0= ruleFailReason ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==51) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAdeptness.g:1635:4: (lv_failReason_4_0= ruleFailReason )
            	    {
            	    // InternalAdeptness.g:1635:4: (lv_failReason_4_0= ruleFailReason )
            	    // InternalAdeptness.g:1636:5: lv_failReason_4_0= ruleFailReason
            	    {

            	    					newCompositeNode(grammarAccess.getChecksAccess().getFailReasonFailReasonParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_42);
            	    lv_failReason_4_0=ruleFailReason();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChecksRule());
            	    					}
            	    					add(
            	    						current,
            	    						"failReason",
            	    						lv_failReason_4_0,
            	    						"org.xtext.example.mydsl.Adeptness.FailReason");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            // InternalAdeptness.g:1653:3: ( (lv_description_5_0= ruleDescription ) )
            // InternalAdeptness.g:1654:4: (lv_description_5_0= ruleDescription )
            {
            // InternalAdeptness.g:1654:4: (lv_description_5_0= ruleDescription )
            // InternalAdeptness.g:1655:5: lv_description_5_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getChecksAccess().getDescriptionDescriptionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_description_5_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChecksRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_5_0,
            						"org.xtext.example.mydsl.Adeptness.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChecks"


    // $ANTLR start "entryRuleDescription"
    // InternalAdeptness.g:1676:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalAdeptness.g:1676:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalAdeptness.g:1677:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalAdeptness.g:1683:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalAdeptness.g:1689:2: ( (otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalAdeptness.g:1690:2: (otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalAdeptness.g:1690:2: (otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalAdeptness.g:1691:3: otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            // InternalAdeptness.g:1695:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalAdeptness.g:1696:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalAdeptness.g:1696:4: (lv_value_1_0= RULE_STRING )
            // InternalAdeptness.g:1697:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getDescriptionAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleFailReason"
    // InternalAdeptness.g:1717:1: entryRuleFailReason returns [EObject current=null] : iv_ruleFailReason= ruleFailReason EOF ;
    public final EObject entryRuleFailReason() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFailReason = null;


        try {
            // InternalAdeptness.g:1717:51: (iv_ruleFailReason= ruleFailReason EOF )
            // InternalAdeptness.g:1718:2: iv_ruleFailReason= ruleFailReason EOF
            {
             newCompositeNode(grammarAccess.getFailReasonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFailReason=ruleFailReason();

            state._fsp--;

             current =iv_ruleFailReason; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFailReason"


    // $ANTLR start "ruleFailReason"
    // InternalAdeptness.g:1724:1: ruleFailReason returns [EObject current=null] : (otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) ) ) ;
    public final EObject ruleFailReason() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_reason_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1730:2: ( (otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) ) ) )
            // InternalAdeptness.g:1731:2: (otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) ) )
            {
            // InternalAdeptness.g:1731:2: (otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) ) )
            // InternalAdeptness.g:1732:3: otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getFailReasonAccess().getFailsIfKeyword_0());
            		
            // InternalAdeptness.g:1736:3: ( (lv_reason_1_0= ruleReason ) )
            // InternalAdeptness.g:1737:4: (lv_reason_1_0= ruleReason )
            {
            // InternalAdeptness.g:1737:4: (lv_reason_1_0= ruleReason )
            // InternalAdeptness.g:1738:5: lv_reason_1_0= ruleReason
            {

            					newCompositeNode(grammarAccess.getFailReasonAccess().getReasonReasonParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_reason_1_0=ruleReason();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFailReasonRule());
            					}
            					set(
            						current,
            						"reason",
            						lv_reason_1_0,
            						"org.xtext.example.mydsl.Adeptness.Reason");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFailReason"


    // $ANTLR start "entryRuleReason"
    // InternalAdeptness.g:1759:1: entryRuleReason returns [EObject current=null] : iv_ruleReason= ruleReason EOF ;
    public final EObject entryRuleReason() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReason = null;


        try {
            // InternalAdeptness.g:1759:47: (iv_ruleReason= ruleReason EOF )
            // InternalAdeptness.g:1760:2: iv_ruleReason= ruleReason EOF
            {
             newCompositeNode(grammarAccess.getReasonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReason=ruleReason();

            state._fsp--;

             current =iv_ruleReason; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReason"


    // $ANTLR start "ruleReason"
    // InternalAdeptness.g:1766:1: ruleReason returns [EObject current=null] : ( ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleReason() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_highPeak_0_0 = null;

        EObject lv_highTime_1_0 = null;

        EObject lv_constDeg_2_0 = null;

        EObject lv_xPeaks_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1772:2: ( ( ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';' ) )
            // InternalAdeptness.g:1773:2: ( ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';' )
            {
            // InternalAdeptness.g:1773:2: ( ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';' )
            // InternalAdeptness.g:1774:3: ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';'
            {
            // InternalAdeptness.g:1774:3: ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) )
            int alt22=4;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalAdeptness.g:1775:4: ( (lv_highPeak_0_0= ruleHighPeak ) )
                    {
                    // InternalAdeptness.g:1775:4: ( (lv_highPeak_0_0= ruleHighPeak ) )
                    // InternalAdeptness.g:1776:5: (lv_highPeak_0_0= ruleHighPeak )
                    {
                    // InternalAdeptness.g:1776:5: (lv_highPeak_0_0= ruleHighPeak )
                    // InternalAdeptness.g:1777:6: lv_highPeak_0_0= ruleHighPeak
                    {

                    						newCompositeNode(grammarAccess.getReasonAccess().getHighPeakHighPeakParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_highPeak_0_0=ruleHighPeak();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReasonRule());
                    						}
                    						set(
                    							current,
                    							"highPeak",
                    							lv_highPeak_0_0,
                    							"org.xtext.example.mydsl.Adeptness.HighPeak");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1795:4: ( (lv_highTime_1_0= ruleHighTime ) )
                    {
                    // InternalAdeptness.g:1795:4: ( (lv_highTime_1_0= ruleHighTime ) )
                    // InternalAdeptness.g:1796:5: (lv_highTime_1_0= ruleHighTime )
                    {
                    // InternalAdeptness.g:1796:5: (lv_highTime_1_0= ruleHighTime )
                    // InternalAdeptness.g:1797:6: lv_highTime_1_0= ruleHighTime
                    {

                    						newCompositeNode(grammarAccess.getReasonAccess().getHighTimeHighTimeParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_highTime_1_0=ruleHighTime();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReasonRule());
                    						}
                    						set(
                    							current,
                    							"highTime",
                    							lv_highTime_1_0,
                    							"org.xtext.example.mydsl.Adeptness.HighTime");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1815:4: ( (lv_constDeg_2_0= ruleConstDeg ) )
                    {
                    // InternalAdeptness.g:1815:4: ( (lv_constDeg_2_0= ruleConstDeg ) )
                    // InternalAdeptness.g:1816:5: (lv_constDeg_2_0= ruleConstDeg )
                    {
                    // InternalAdeptness.g:1816:5: (lv_constDeg_2_0= ruleConstDeg )
                    // InternalAdeptness.g:1817:6: lv_constDeg_2_0= ruleConstDeg
                    {

                    						newCompositeNode(grammarAccess.getReasonAccess().getConstDegConstDegParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_constDeg_2_0=ruleConstDeg();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReasonRule());
                    						}
                    						set(
                    							current,
                    							"constDeg",
                    							lv_constDeg_2_0,
                    							"org.xtext.example.mydsl.Adeptness.ConstDeg");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:1835:4: ( (lv_xPeaks_3_0= ruleXPeaks ) )
                    {
                    // InternalAdeptness.g:1835:4: ( (lv_xPeaks_3_0= ruleXPeaks ) )
                    // InternalAdeptness.g:1836:5: (lv_xPeaks_3_0= ruleXPeaks )
                    {
                    // InternalAdeptness.g:1836:5: (lv_xPeaks_3_0= ruleXPeaks )
                    // InternalAdeptness.g:1837:6: lv_xPeaks_3_0= ruleXPeaks
                    {

                    						newCompositeNode(grammarAccess.getReasonAccess().getXPeaksXPeaksParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_xPeaks_3_0=ruleXPeaks();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReasonRule());
                    						}
                    						set(
                    							current,
                    							"xPeaks",
                    							lv_xPeaks_3_0,
                    							"org.xtext.example.mydsl.Adeptness.XPeaks");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,52,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReasonAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReason"


    // $ANTLR start "entryRuleXPeaks"
    // InternalAdeptness.g:1863:1: entryRuleXPeaks returns [EObject current=null] : iv_ruleXPeaks= ruleXPeaks EOF ;
    public final EObject entryRuleXPeaks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPeaks = null;


        try {
            // InternalAdeptness.g:1863:47: (iv_ruleXPeaks= ruleXPeaks EOF )
            // InternalAdeptness.g:1864:2: iv_ruleXPeaks= ruleXPeaks EOF
            {
             newCompositeNode(grammarAccess.getXPeaksRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXPeaks=ruleXPeaks();

            state._fsp--;

             current =iv_ruleXPeaks; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPeaks"


    // $ANTLR start "ruleXPeaks"
    // InternalAdeptness.g:1870:1: ruleXPeaks returns [EObject current=null] : (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= ruleDOUBLE ) ) ( (lv_unit_6_0= ruleTimeType ) ) ) ;
    public final EObject ruleXPeaks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cant_1_0 = null;

        EObject lv_nPeaks_3_0 = null;

        EObject lv_time_5_0 = null;

        EObject lv_unit_6_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1876:2: ( (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= ruleDOUBLE ) ) ( (lv_unit_6_0= ruleTimeType ) ) ) )
            // InternalAdeptness.g:1877:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= ruleDOUBLE ) ) ( (lv_unit_6_0= ruleTimeType ) ) )
            {
            // InternalAdeptness.g:1877:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= ruleDOUBLE ) ) ( (lv_unit_6_0= ruleTimeType ) ) )
            // InternalAdeptness.g:1878:3: otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= ruleDOUBLE ) ) ( (lv_unit_6_0= ruleTimeType ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getXPeaksAccess().getConfidenceIsBelowKeyword_0());
            		
            // InternalAdeptness.g:1882:3: ( (lv_cant_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1883:4: (lv_cant_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1883:4: (lv_cant_1_0= ruleDOUBLE )
            // InternalAdeptness.g:1884:5: lv_cant_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getXPeaksAccess().getCantDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_45);
            lv_cant_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXPeaksRule());
            					}
            					set(
            						current,
            						"cant",
            						lv_cant_1_0,
            						"org.xtext.example.mydsl.Adeptness.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,54,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getXPeaksAccess().getMoreThanKeyword_2());
            		
            // InternalAdeptness.g:1905:3: ( (lv_nPeaks_3_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1906:4: (lv_nPeaks_3_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1906:4: (lv_nPeaks_3_0= ruleDOUBLE )
            // InternalAdeptness.g:1907:5: lv_nPeaks_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getXPeaksAccess().getNPeaksDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_46);
            lv_nPeaks_3_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXPeaksRule());
            					}
            					set(
            						current,
            						"nPeaks",
            						lv_nPeaks_3_0,
            						"org.xtext.example.mydsl.Adeptness.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,55,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getXPeaksAccess().getTimesWithinKeyword_4());
            		
            // InternalAdeptness.g:1928:3: ( (lv_time_5_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1929:4: (lv_time_5_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1929:4: (lv_time_5_0= ruleDOUBLE )
            // InternalAdeptness.g:1930:5: lv_time_5_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getXPeaksAccess().getTimeDOUBLEParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_38);
            lv_time_5_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXPeaksRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_5_0,
            						"org.xtext.example.mydsl.Adeptness.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdeptness.g:1947:3: ( (lv_unit_6_0= ruleTimeType ) )
            // InternalAdeptness.g:1948:4: (lv_unit_6_0= ruleTimeType )
            {
            // InternalAdeptness.g:1948:4: (lv_unit_6_0= ruleTimeType )
            // InternalAdeptness.g:1949:5: lv_unit_6_0= ruleTimeType
            {

            					newCompositeNode(grammarAccess.getXPeaksAccess().getUnitTimeTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_unit_6_0=ruleTimeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXPeaksRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_6_0,
            						"org.xtext.example.mydsl.Adeptness.TimeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPeaks"


    // $ANTLR start "entryRuleConstDeg"
    // InternalAdeptness.g:1970:1: entryRuleConstDeg returns [EObject current=null] : iv_ruleConstDeg= ruleConstDeg EOF ;
    public final EObject entryRuleConstDeg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstDeg = null;


        try {
            // InternalAdeptness.g:1970:49: (iv_ruleConstDeg= ruleConstDeg EOF )
            // InternalAdeptness.g:1971:2: iv_ruleConstDeg= ruleConstDeg EOF
            {
             newCompositeNode(grammarAccess.getConstDegRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstDeg=ruleConstDeg();

            state._fsp--;

             current =iv_ruleConstDeg; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstDeg"


    // $ANTLR start "ruleConstDeg"
    // InternalAdeptness.g:1977:1: ruleConstDeg returns [EObject current=null] : (otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleConstDeg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cant_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1983:2: ( (otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) ) ) )
            // InternalAdeptness.g:1984:2: (otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) ) )
            {
            // InternalAdeptness.g:1984:2: (otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) ) )
            // InternalAdeptness.g:1985:3: otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getConstDegAccess().getConfidenceIsInConstantDegradationKeyword_0());
            		
            // InternalAdeptness.g:1989:3: ( (lv_cant_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1990:4: (lv_cant_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1990:4: (lv_cant_1_0= ruleDOUBLE )
            // InternalAdeptness.g:1991:5: lv_cant_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getConstDegAccess().getCantDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_cant_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstDegRule());
            					}
            					set(
            						current,
            						"cant",
            						lv_cant_1_0,
            						"org.xtext.example.mydsl.Adeptness.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstDeg"


    // $ANTLR start "entryRuleHighTime"
    // InternalAdeptness.g:2012:1: entryRuleHighTime returns [EObject current=null] : iv_ruleHighTime= ruleHighTime EOF ;
    public final EObject entryRuleHighTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighTime = null;


        try {
            // InternalAdeptness.g:2012:49: (iv_ruleHighTime= ruleHighTime EOF )
            // InternalAdeptness.g:2013:2: iv_ruleHighTime= ruleHighTime EOF
            {
             newCompositeNode(grammarAccess.getHighTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHighTime=ruleHighTime();

            state._fsp--;

             current =iv_ruleHighTime; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHighTime"


    // $ANTLR start "ruleHighTime"
    // InternalAdeptness.g:2019:1: ruleHighTime returns [EObject current=null] : (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) ) ) ;
    public final EObject ruleHighTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_cant_1_0 = null;

        EObject lv_time_3_0 = null;

        EObject lv_unit_4_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2025:2: ( (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) ) ) )
            // InternalAdeptness.g:2026:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) ) )
            {
            // InternalAdeptness.g:2026:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) ) )
            // InternalAdeptness.g:2027:3: otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getHighTimeAccess().getConfidenceIsBelowKeyword_0());
            		
            // InternalAdeptness.g:2031:3: ( (lv_cant_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:2032:4: (lv_cant_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:2032:4: (lv_cant_1_0= ruleDOUBLE )
            // InternalAdeptness.g:2033:5: lv_cant_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getHighTimeAccess().getCantDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
            lv_cant_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHighTimeRule());
            					}
            					set(
            						current,
            						"cant",
            						lv_cant_1_0,
            						"org.xtext.example.mydsl.Adeptness.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,57,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getHighTimeAccess().getWithinKeyword_2());
            		
            // InternalAdeptness.g:2054:3: ( (lv_time_3_0= ruleDOUBLE ) )
            // InternalAdeptness.g:2055:4: (lv_time_3_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:2055:4: (lv_time_3_0= ruleDOUBLE )
            // InternalAdeptness.g:2056:5: lv_time_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getHighTimeAccess().getTimeDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_38);
            lv_time_3_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHighTimeRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_3_0,
            						"org.xtext.example.mydsl.Adeptness.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdeptness.g:2073:3: ( (lv_unit_4_0= ruleTimeType ) )
            // InternalAdeptness.g:2074:4: (lv_unit_4_0= ruleTimeType )
            {
            // InternalAdeptness.g:2074:4: (lv_unit_4_0= ruleTimeType )
            // InternalAdeptness.g:2075:5: lv_unit_4_0= ruleTimeType
            {

            					newCompositeNode(grammarAccess.getHighTimeAccess().getUnitTimeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_unit_4_0=ruleTimeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHighTimeRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_4_0,
            						"org.xtext.example.mydsl.Adeptness.TimeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHighTime"


    // $ANTLR start "entryRuleHighPeak"
    // InternalAdeptness.g:2096:1: entryRuleHighPeak returns [EObject current=null] : iv_ruleHighPeak= ruleHighPeak EOF ;
    public final EObject entryRuleHighPeak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighPeak = null;


        try {
            // InternalAdeptness.g:2096:49: (iv_ruleHighPeak= ruleHighPeak EOF )
            // InternalAdeptness.g:2097:2: iv_ruleHighPeak= ruleHighPeak EOF
            {
             newCompositeNode(grammarAccess.getHighPeakRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHighPeak=ruleHighPeak();

            state._fsp--;

             current =iv_ruleHighPeak; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHighPeak"


    // $ANTLR start "ruleHighPeak"
    // InternalAdeptness.g:2103:1: ruleHighPeak returns [EObject current=null] : (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleHighPeak() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cant_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2109:2: ( (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) ) )
            // InternalAdeptness.g:2110:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) )
            {
            // InternalAdeptness.g:2110:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) )
            // InternalAdeptness.g:2111:3: otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getHighPeakAccess().getConfidenceIsBelowKeyword_0());
            		
            // InternalAdeptness.g:2115:3: ( (lv_cant_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:2116:4: (lv_cant_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:2116:4: (lv_cant_1_0= ruleDOUBLE )
            // InternalAdeptness.g:2117:5: lv_cant_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getHighPeakAccess().getCantDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_cant_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHighPeakRule());
            					}
            					set(
            						current,
            						"cant",
            						lv_cant_1_0,
            						"org.xtext.example.mydsl.Adeptness.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHighPeak"


    // $ANTLR start "entryRuleReference"
    // InternalAdeptness.g:2138:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalAdeptness.g:2138:50: (iv_ruleReference= ruleReference EOF )
            // InternalAdeptness.g:2139:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalAdeptness.g:2145:1: ruleReference returns [EObject current=null] : ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) | ( (lv_same_4_0= ruleSame ) ) | ( (lv_notsame_5_0= ruleNotSame ) ) ) otherlv_6= ';' ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        EObject lv_upper_0_0 = null;

        EObject lv_lower_1_0 = null;

        EObject lv_range_2_0 = null;

        EObject lv_gap_3_0 = null;

        EObject lv_same_4_0 = null;

        EObject lv_notsame_5_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2151:2: ( ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) | ( (lv_same_4_0= ruleSame ) ) | ( (lv_notsame_5_0= ruleNotSame ) ) ) otherlv_6= ';' ) )
            // InternalAdeptness.g:2152:2: ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) | ( (lv_same_4_0= ruleSame ) ) | ( (lv_notsame_5_0= ruleNotSame ) ) ) otherlv_6= ';' )
            {
            // InternalAdeptness.g:2152:2: ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) | ( (lv_same_4_0= ruleSame ) ) | ( (lv_notsame_5_0= ruleNotSame ) ) ) otherlv_6= ';' )
            // InternalAdeptness.g:2153:3: ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) | ( (lv_same_4_0= ruleSame ) ) | ( (lv_notsame_5_0= ruleNotSame ) ) ) otherlv_6= ';'
            {
            // InternalAdeptness.g:2153:3: ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) | ( (lv_same_4_0= ruleSame ) ) | ( (lv_notsame_5_0= ruleNotSame ) ) )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt23=1;
                }
                break;
            case 61:
                {
                alt23=2;
                }
                break;
            case 62:
                {
                alt23=3;
                }
                break;
            case 64:
                {
                alt23=4;
                }
                break;
            case 58:
                {
                alt23=5;
                }
                break;
            case 59:
                {
                alt23=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalAdeptness.g:2154:4: ( (lv_upper_0_0= ruleUpper ) )
                    {
                    // InternalAdeptness.g:2154:4: ( (lv_upper_0_0= ruleUpper ) )
                    // InternalAdeptness.g:2155:5: (lv_upper_0_0= ruleUpper )
                    {
                    // InternalAdeptness.g:2155:5: (lv_upper_0_0= ruleUpper )
                    // InternalAdeptness.g:2156:6: lv_upper_0_0= ruleUpper
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getUpperUpperParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_upper_0_0=ruleUpper();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"upper",
                    							lv_upper_0_0,
                    							"org.xtext.example.mydsl.Adeptness.Upper");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2174:4: ( (lv_lower_1_0= ruleLower ) )
                    {
                    // InternalAdeptness.g:2174:4: ( (lv_lower_1_0= ruleLower ) )
                    // InternalAdeptness.g:2175:5: (lv_lower_1_0= ruleLower )
                    {
                    // InternalAdeptness.g:2175:5: (lv_lower_1_0= ruleLower )
                    // InternalAdeptness.g:2176:6: lv_lower_1_0= ruleLower
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getLowerLowerParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_lower_1_0=ruleLower();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"lower",
                    							lv_lower_1_0,
                    							"org.xtext.example.mydsl.Adeptness.Lower");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:2194:4: ( (lv_range_2_0= ruleRange ) )
                    {
                    // InternalAdeptness.g:2194:4: ( (lv_range_2_0= ruleRange ) )
                    // InternalAdeptness.g:2195:5: (lv_range_2_0= ruleRange )
                    {
                    // InternalAdeptness.g:2195:5: (lv_range_2_0= ruleRange )
                    // InternalAdeptness.g:2196:6: lv_range_2_0= ruleRange
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getRangeRangeParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_range_2_0=ruleRange();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"range",
                    							lv_range_2_0,
                    							"org.xtext.example.mydsl.Adeptness.Range");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:2214:4: ( (lv_gap_3_0= ruleGap ) )
                    {
                    // InternalAdeptness.g:2214:4: ( (lv_gap_3_0= ruleGap ) )
                    // InternalAdeptness.g:2215:5: (lv_gap_3_0= ruleGap )
                    {
                    // InternalAdeptness.g:2215:5: (lv_gap_3_0= ruleGap )
                    // InternalAdeptness.g:2216:6: lv_gap_3_0= ruleGap
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getGapGapParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_gap_3_0=ruleGap();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"gap",
                    							lv_gap_3_0,
                    							"org.xtext.example.mydsl.Adeptness.Gap");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAdeptness.g:2234:4: ( (lv_same_4_0= ruleSame ) )
                    {
                    // InternalAdeptness.g:2234:4: ( (lv_same_4_0= ruleSame ) )
                    // InternalAdeptness.g:2235:5: (lv_same_4_0= ruleSame )
                    {
                    // InternalAdeptness.g:2235:5: (lv_same_4_0= ruleSame )
                    // InternalAdeptness.g:2236:6: lv_same_4_0= ruleSame
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getSameSameParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_same_4_0=ruleSame();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"same",
                    							lv_same_4_0,
                    							"org.xtext.example.mydsl.Adeptness.Same");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalAdeptness.g:2254:4: ( (lv_notsame_5_0= ruleNotSame ) )
                    {
                    // InternalAdeptness.g:2254:4: ( (lv_notsame_5_0= ruleNotSame ) )
                    // InternalAdeptness.g:2255:5: (lv_notsame_5_0= ruleNotSame )
                    {
                    // InternalAdeptness.g:2255:5: (lv_notsame_5_0= ruleNotSame )
                    // InternalAdeptness.g:2256:6: lv_notsame_5_0= ruleNotSame
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getNotsameNotSameParserRuleCall_0_5_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_notsame_5_0=ruleNotSame();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"notsame",
                    							lv_notsame_5_0,
                    							"org.xtext.example.mydsl.Adeptness.NotSame");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,52,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getReferenceAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleSame"
    // InternalAdeptness.g:2282:1: entryRuleSame returns [EObject current=null] : iv_ruleSame= ruleSame EOF ;
    public final EObject entryRuleSame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSame = null;


        try {
            // InternalAdeptness.g:2282:45: (iv_ruleSame= ruleSame EOF )
            // InternalAdeptness.g:2283:2: iv_ruleSame= ruleSame EOF
            {
             newCompositeNode(grammarAccess.getSameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSame=ruleSame();

            state._fsp--;

             current =iv_ruleSame; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSame"


    // $ANTLR start "ruleSame"
    // InternalAdeptness.g:2289:1: ruleSame returns [EObject current=null] : (otherlv_0= 'should be' ( (lv_bound_upp_1_0= ruleBound_up ) ) ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )? ) ;
    public final EObject ruleSame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bound_upp_1_0 = null;

        EObject lv_exactly_2_0 = null;

        EObject lv_atmost_3_0 = null;

        EObject lv_atleast_4_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2295:2: ( (otherlv_0= 'should be' ( (lv_bound_upp_1_0= ruleBound_up ) ) ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )? ) )
            // InternalAdeptness.g:2296:2: (otherlv_0= 'should be' ( (lv_bound_upp_1_0= ruleBound_up ) ) ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )? )
            {
            // InternalAdeptness.g:2296:2: (otherlv_0= 'should be' ( (lv_bound_upp_1_0= ruleBound_up ) ) ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )? )
            // InternalAdeptness.g:2297:3: otherlv_0= 'should be' ( (lv_bound_upp_1_0= ruleBound_up ) ) ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )?
            {
            otherlv_0=(Token)match(input,58,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getSameAccess().getShouldBeKeyword_0());
            		
            // InternalAdeptness.g:2301:3: ( (lv_bound_upp_1_0= ruleBound_up ) )
            // InternalAdeptness.g:2302:4: (lv_bound_upp_1_0= ruleBound_up )
            {
            // InternalAdeptness.g:2302:4: (lv_bound_upp_1_0= ruleBound_up )
            // InternalAdeptness.g:2303:5: lv_bound_upp_1_0= ruleBound_up
            {

            					newCompositeNode(grammarAccess.getSameAccess().getBound_uppBound_upParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
            lv_bound_upp_1_0=ruleBound_up();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSameRule());
            					}
            					set(
            						current,
            						"bound_upp",
            						lv_bound_upp_1_0,
            						"org.xtext.example.mydsl.Adeptness.Bound_up");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdeptness.g:2320:3: ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )?
            int alt24=4;
            switch ( input.LA(1) ) {
                case 65:
                    {
                    alt24=1;
                    }
                    break;
                case 68:
                    {
                    alt24=2;
                    }
                    break;
                case 69:
                    {
                    alt24=3;
                    }
                    break;
            }

            switch (alt24) {
                case 1 :
                    // InternalAdeptness.g:2321:4: ( (lv_exactly_2_0= ruleExactly ) )
                    {
                    // InternalAdeptness.g:2321:4: ( (lv_exactly_2_0= ruleExactly ) )
                    // InternalAdeptness.g:2322:5: (lv_exactly_2_0= ruleExactly )
                    {
                    // InternalAdeptness.g:2322:5: (lv_exactly_2_0= ruleExactly )
                    // InternalAdeptness.g:2323:6: lv_exactly_2_0= ruleExactly
                    {

                    						newCompositeNode(grammarAccess.getSameAccess().getExactlyExactlyParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exactly_2_0=ruleExactly();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSameRule());
                    						}
                    						set(
                    							current,
                    							"exactly",
                    							lv_exactly_2_0,
                    							"org.xtext.example.mydsl.Adeptness.Exactly");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2341:4: ( (lv_atmost_3_0= ruleAt_most ) )
                    {
                    // InternalAdeptness.g:2341:4: ( (lv_atmost_3_0= ruleAt_most ) )
                    // InternalAdeptness.g:2342:5: (lv_atmost_3_0= ruleAt_most )
                    {
                    // InternalAdeptness.g:2342:5: (lv_atmost_3_0= ruleAt_most )
                    // InternalAdeptness.g:2343:6: lv_atmost_3_0= ruleAt_most
                    {

                    						newCompositeNode(grammarAccess.getSameAccess().getAtmostAt_mostParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_atmost_3_0=ruleAt_most();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSameRule());
                    						}
                    						set(
                    							current,
                    							"atmost",
                    							lv_atmost_3_0,
                    							"org.xtext.example.mydsl.Adeptness.At_most");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:2361:4: ( (lv_atleast_4_0= ruleAt_least ) )
                    {
                    // InternalAdeptness.g:2361:4: ( (lv_atleast_4_0= ruleAt_least ) )
                    // InternalAdeptness.g:2362:5: (lv_atleast_4_0= ruleAt_least )
                    {
                    // InternalAdeptness.g:2362:5: (lv_atleast_4_0= ruleAt_least )
                    // InternalAdeptness.g:2363:6: lv_atleast_4_0= ruleAt_least
                    {

                    						newCompositeNode(grammarAccess.getSameAccess().getAtleastAt_leastParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_atleast_4_0=ruleAt_least();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSameRule());
                    						}
                    						set(
                    							current,
                    							"atleast",
                    							lv_atleast_4_0,
                    							"org.xtext.example.mydsl.Adeptness.At_least");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSame"


    // $ANTLR start "entryRuleNotSame"
    // InternalAdeptness.g:2385:1: entryRuleNotSame returns [EObject current=null] : iv_ruleNotSame= ruleNotSame EOF ;
    public final EObject entryRuleNotSame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotSame = null;


        try {
            // InternalAdeptness.g:2385:48: (iv_ruleNotSame= ruleNotSame EOF )
            // InternalAdeptness.g:2386:2: iv_ruleNotSame= ruleNotSame EOF
            {
             newCompositeNode(grammarAccess.getNotSameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotSame=ruleNotSame();

            state._fsp--;

             current =iv_ruleNotSame; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotSame"


    // $ANTLR start "ruleNotSame"
    // InternalAdeptness.g:2392:1: ruleNotSame returns [EObject current=null] : (otherlv_0= 'should not be' ( (lv_bound_upp_1_0= ruleBound_up ) ) ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )? ) ;
    public final EObject ruleNotSame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bound_upp_1_0 = null;

        EObject lv_exactly_2_0 = null;

        EObject lv_atmost_3_0 = null;

        EObject lv_atleast_4_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2398:2: ( (otherlv_0= 'should not be' ( (lv_bound_upp_1_0= ruleBound_up ) ) ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )? ) )
            // InternalAdeptness.g:2399:2: (otherlv_0= 'should not be' ( (lv_bound_upp_1_0= ruleBound_up ) ) ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )? )
            {
            // InternalAdeptness.g:2399:2: (otherlv_0= 'should not be' ( (lv_bound_upp_1_0= ruleBound_up ) ) ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )? )
            // InternalAdeptness.g:2400:3: otherlv_0= 'should not be' ( (lv_bound_upp_1_0= ruleBound_up ) ) ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )?
            {
            otherlv_0=(Token)match(input,59,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getNotSameAccess().getShouldNotBeKeyword_0());
            		
            // InternalAdeptness.g:2404:3: ( (lv_bound_upp_1_0= ruleBound_up ) )
            // InternalAdeptness.g:2405:4: (lv_bound_upp_1_0= ruleBound_up )
            {
            // InternalAdeptness.g:2405:4: (lv_bound_upp_1_0= ruleBound_up )
            // InternalAdeptness.g:2406:5: lv_bound_upp_1_0= ruleBound_up
            {

            					newCompositeNode(grammarAccess.getNotSameAccess().getBound_uppBound_upParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
            lv_bound_upp_1_0=ruleBound_up();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotSameRule());
            					}
            					set(
            						current,
            						"bound_upp",
            						lv_bound_upp_1_0,
            						"org.xtext.example.mydsl.Adeptness.Bound_up");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdeptness.g:2423:3: ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )?
            int alt25=4;
            switch ( input.LA(1) ) {
                case 65:
                    {
                    alt25=1;
                    }
                    break;
                case 68:
                    {
                    alt25=2;
                    }
                    break;
                case 69:
                    {
                    alt25=3;
                    }
                    break;
            }

            switch (alt25) {
                case 1 :
                    // InternalAdeptness.g:2424:4: ( (lv_exactly_2_0= ruleExactly ) )
                    {
                    // InternalAdeptness.g:2424:4: ( (lv_exactly_2_0= ruleExactly ) )
                    // InternalAdeptness.g:2425:5: (lv_exactly_2_0= ruleExactly )
                    {
                    // InternalAdeptness.g:2425:5: (lv_exactly_2_0= ruleExactly )
                    // InternalAdeptness.g:2426:6: lv_exactly_2_0= ruleExactly
                    {

                    						newCompositeNode(grammarAccess.getNotSameAccess().getExactlyExactlyParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exactly_2_0=ruleExactly();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotSameRule());
                    						}
                    						set(
                    							current,
                    							"exactly",
                    							lv_exactly_2_0,
                    							"org.xtext.example.mydsl.Adeptness.Exactly");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2444:4: ( (lv_atmost_3_0= ruleAt_most ) )
                    {
                    // InternalAdeptness.g:2444:4: ( (lv_atmost_3_0= ruleAt_most ) )
                    // InternalAdeptness.g:2445:5: (lv_atmost_3_0= ruleAt_most )
                    {
                    // InternalAdeptness.g:2445:5: (lv_atmost_3_0= ruleAt_most )
                    // InternalAdeptness.g:2446:6: lv_atmost_3_0= ruleAt_most
                    {

                    						newCompositeNode(grammarAccess.getNotSameAccess().getAtmostAt_mostParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_atmost_3_0=ruleAt_most();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotSameRule());
                    						}
                    						set(
                    							current,
                    							"atmost",
                    							lv_atmost_3_0,
                    							"org.xtext.example.mydsl.Adeptness.At_most");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:2464:4: ( (lv_atleast_4_0= ruleAt_least ) )
                    {
                    // InternalAdeptness.g:2464:4: ( (lv_atleast_4_0= ruleAt_least ) )
                    // InternalAdeptness.g:2465:5: (lv_atleast_4_0= ruleAt_least )
                    {
                    // InternalAdeptness.g:2465:5: (lv_atleast_4_0= ruleAt_least )
                    // InternalAdeptness.g:2466:6: lv_atleast_4_0= ruleAt_least
                    {

                    						newCompositeNode(grammarAccess.getNotSameAccess().getAtleastAt_leastParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_atleast_4_0=ruleAt_least();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotSameRule());
                    						}
                    						set(
                    							current,
                    							"atleast",
                    							lv_atleast_4_0,
                    							"org.xtext.example.mydsl.Adeptness.At_least");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotSame"


    // $ANTLR start "entryRuleUpper"
    // InternalAdeptness.g:2488:1: entryRuleUpper returns [EObject current=null] : iv_ruleUpper= ruleUpper EOF ;
    public final EObject entryRuleUpper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpper = null;


        try {
            // InternalAdeptness.g:2488:46: (iv_ruleUpper= ruleUpper EOF )
            // InternalAdeptness.g:2489:2: iv_ruleUpper= ruleUpper EOF
            {
             newCompositeNode(grammarAccess.getUpperRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpper=ruleUpper();

            state._fsp--;

             current =iv_ruleUpper; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpper"


    // $ANTLR start "ruleUpper"
    // InternalAdeptness.g:2495:1: ruleUpper returns [EObject current=null] : (otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) ) ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )? ) ;
    public final EObject ruleUpper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bound_upp_1_0 = null;

        EObject lv_exactly_2_0 = null;

        EObject lv_atmost_3_0 = null;

        EObject lv_atleast_4_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2501:2: ( (otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) ) ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )? ) )
            // InternalAdeptness.g:2502:2: (otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) ) ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )? )
            {
            // InternalAdeptness.g:2502:2: (otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) ) ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )? )
            // InternalAdeptness.g:2503:3: otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) ) ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getUpperAccess().getIsBelowKeyword_0());
            		
            // InternalAdeptness.g:2507:3: ( (lv_bound_upp_1_0= ruleBound_up ) )
            // InternalAdeptness.g:2508:4: (lv_bound_upp_1_0= ruleBound_up )
            {
            // InternalAdeptness.g:2508:4: (lv_bound_upp_1_0= ruleBound_up )
            // InternalAdeptness.g:2509:5: lv_bound_upp_1_0= ruleBound_up
            {

            					newCompositeNode(grammarAccess.getUpperAccess().getBound_uppBound_upParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
            lv_bound_upp_1_0=ruleBound_up();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpperRule());
            					}
            					set(
            						current,
            						"bound_upp",
            						lv_bound_upp_1_0,
            						"org.xtext.example.mydsl.Adeptness.Bound_up");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdeptness.g:2526:3: ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )?
            int alt26=4;
            switch ( input.LA(1) ) {
                case 65:
                    {
                    alt26=1;
                    }
                    break;
                case 68:
                    {
                    alt26=2;
                    }
                    break;
                case 69:
                    {
                    alt26=3;
                    }
                    break;
            }

            switch (alt26) {
                case 1 :
                    // InternalAdeptness.g:2527:4: ( (lv_exactly_2_0= ruleExactly ) )
                    {
                    // InternalAdeptness.g:2527:4: ( (lv_exactly_2_0= ruleExactly ) )
                    // InternalAdeptness.g:2528:5: (lv_exactly_2_0= ruleExactly )
                    {
                    // InternalAdeptness.g:2528:5: (lv_exactly_2_0= ruleExactly )
                    // InternalAdeptness.g:2529:6: lv_exactly_2_0= ruleExactly
                    {

                    						newCompositeNode(grammarAccess.getUpperAccess().getExactlyExactlyParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exactly_2_0=ruleExactly();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUpperRule());
                    						}
                    						set(
                    							current,
                    							"exactly",
                    							lv_exactly_2_0,
                    							"org.xtext.example.mydsl.Adeptness.Exactly");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2547:4: ( (lv_atmost_3_0= ruleAt_most ) )
                    {
                    // InternalAdeptness.g:2547:4: ( (lv_atmost_3_0= ruleAt_most ) )
                    // InternalAdeptness.g:2548:5: (lv_atmost_3_0= ruleAt_most )
                    {
                    // InternalAdeptness.g:2548:5: (lv_atmost_3_0= ruleAt_most )
                    // InternalAdeptness.g:2549:6: lv_atmost_3_0= ruleAt_most
                    {

                    						newCompositeNode(grammarAccess.getUpperAccess().getAtmostAt_mostParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_atmost_3_0=ruleAt_most();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUpperRule());
                    						}
                    						set(
                    							current,
                    							"atmost",
                    							lv_atmost_3_0,
                    							"org.xtext.example.mydsl.Adeptness.At_most");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:2567:4: ( (lv_atleast_4_0= ruleAt_least ) )
                    {
                    // InternalAdeptness.g:2567:4: ( (lv_atleast_4_0= ruleAt_least ) )
                    // InternalAdeptness.g:2568:5: (lv_atleast_4_0= ruleAt_least )
                    {
                    // InternalAdeptness.g:2568:5: (lv_atleast_4_0= ruleAt_least )
                    // InternalAdeptness.g:2569:6: lv_atleast_4_0= ruleAt_least
                    {

                    						newCompositeNode(grammarAccess.getUpperAccess().getAtleastAt_leastParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_atleast_4_0=ruleAt_least();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUpperRule());
                    						}
                    						set(
                    							current,
                    							"atleast",
                    							lv_atleast_4_0,
                    							"org.xtext.example.mydsl.Adeptness.At_least");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUpper"


    // $ANTLR start "entryRuleLower"
    // InternalAdeptness.g:2591:1: entryRuleLower returns [EObject current=null] : iv_ruleLower= ruleLower EOF ;
    public final EObject entryRuleLower() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLower = null;


        try {
            // InternalAdeptness.g:2591:46: (iv_ruleLower= ruleLower EOF )
            // InternalAdeptness.g:2592:2: iv_ruleLower= ruleLower EOF
            {
             newCompositeNode(grammarAccess.getLowerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLower=ruleLower();

            state._fsp--;

             current =iv_ruleLower; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLower"


    // $ANTLR start "ruleLower"
    // InternalAdeptness.g:2598:1: ruleLower returns [EObject current=null] : (otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) ) ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )? ) ;
    public final EObject ruleLower() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bound_lower_1_0 = null;

        EObject lv_exactly_2_0 = null;

        EObject lv_atmost_3_0 = null;

        EObject lv_atleast_4_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2604:2: ( (otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) ) ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )? ) )
            // InternalAdeptness.g:2605:2: (otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) ) ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )? )
            {
            // InternalAdeptness.g:2605:2: (otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) ) ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )? )
            // InternalAdeptness.g:2606:3: otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) ) ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )?
            {
            otherlv_0=(Token)match(input,61,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getLowerAccess().getIsAboveKeyword_0());
            		
            // InternalAdeptness.g:2610:3: ( (lv_bound_lower_1_0= ruleBound_Down ) )
            // InternalAdeptness.g:2611:4: (lv_bound_lower_1_0= ruleBound_Down )
            {
            // InternalAdeptness.g:2611:4: (lv_bound_lower_1_0= ruleBound_Down )
            // InternalAdeptness.g:2612:5: lv_bound_lower_1_0= ruleBound_Down
            {

            					newCompositeNode(grammarAccess.getLowerAccess().getBound_lowerBound_DownParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
            lv_bound_lower_1_0=ruleBound_Down();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLowerRule());
            					}
            					set(
            						current,
            						"bound_lower",
            						lv_bound_lower_1_0,
            						"org.xtext.example.mydsl.Adeptness.Bound_Down");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdeptness.g:2629:3: ( ( (lv_exactly_2_0= ruleExactly ) ) | ( (lv_atmost_3_0= ruleAt_most ) ) | ( (lv_atleast_4_0= ruleAt_least ) ) )?
            int alt27=4;
            switch ( input.LA(1) ) {
                case 65:
                    {
                    alt27=1;
                    }
                    break;
                case 68:
                    {
                    alt27=2;
                    }
                    break;
                case 69:
                    {
                    alt27=3;
                    }
                    break;
            }

            switch (alt27) {
                case 1 :
                    // InternalAdeptness.g:2630:4: ( (lv_exactly_2_0= ruleExactly ) )
                    {
                    // InternalAdeptness.g:2630:4: ( (lv_exactly_2_0= ruleExactly ) )
                    // InternalAdeptness.g:2631:5: (lv_exactly_2_0= ruleExactly )
                    {
                    // InternalAdeptness.g:2631:5: (lv_exactly_2_0= ruleExactly )
                    // InternalAdeptness.g:2632:6: lv_exactly_2_0= ruleExactly
                    {

                    						newCompositeNode(grammarAccess.getLowerAccess().getExactlyExactlyParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exactly_2_0=ruleExactly();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLowerRule());
                    						}
                    						set(
                    							current,
                    							"exactly",
                    							lv_exactly_2_0,
                    							"org.xtext.example.mydsl.Adeptness.Exactly");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2650:4: ( (lv_atmost_3_0= ruleAt_most ) )
                    {
                    // InternalAdeptness.g:2650:4: ( (lv_atmost_3_0= ruleAt_most ) )
                    // InternalAdeptness.g:2651:5: (lv_atmost_3_0= ruleAt_most )
                    {
                    // InternalAdeptness.g:2651:5: (lv_atmost_3_0= ruleAt_most )
                    // InternalAdeptness.g:2652:6: lv_atmost_3_0= ruleAt_most
                    {

                    						newCompositeNode(grammarAccess.getLowerAccess().getAtmostAt_mostParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_atmost_3_0=ruleAt_most();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLowerRule());
                    						}
                    						set(
                    							current,
                    							"atmost",
                    							lv_atmost_3_0,
                    							"org.xtext.example.mydsl.Adeptness.At_most");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:2670:4: ( (lv_atleast_4_0= ruleAt_least ) )
                    {
                    // InternalAdeptness.g:2670:4: ( (lv_atleast_4_0= ruleAt_least ) )
                    // InternalAdeptness.g:2671:5: (lv_atleast_4_0= ruleAt_least )
                    {
                    // InternalAdeptness.g:2671:5: (lv_atleast_4_0= ruleAt_least )
                    // InternalAdeptness.g:2672:6: lv_atleast_4_0= ruleAt_least
                    {

                    						newCompositeNode(grammarAccess.getLowerAccess().getAtleastAt_leastParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_atleast_4_0=ruleAt_least();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLowerRule());
                    						}
                    						set(
                    							current,
                    							"atleast",
                    							lv_atleast_4_0,
                    							"org.xtext.example.mydsl.Adeptness.At_least");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLower"


    // $ANTLR start "entryRuleRange"
    // InternalAdeptness.g:2694:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalAdeptness.g:2694:46: (iv_ruleRange= ruleRange EOF )
            // InternalAdeptness.g:2695:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalAdeptness.g:2701:1: ruleRange returns [EObject current=null] : (otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ( ( (lv_exactly_4_0= ruleExactly ) ) | ( (lv_atmost_5_0= ruleAt_most ) ) | ( (lv_atleast_6_0= ruleAt_least ) ) )? ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_bound_lower_1_0 = null;

        EObject lv_bound_upp_3_0 = null;

        EObject lv_exactly_4_0 = null;

        EObject lv_atmost_5_0 = null;

        EObject lv_atleast_6_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2707:2: ( (otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ( ( (lv_exactly_4_0= ruleExactly ) ) | ( (lv_atmost_5_0= ruleAt_most ) ) | ( (lv_atleast_6_0= ruleAt_least ) ) )? ) )
            // InternalAdeptness.g:2708:2: (otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ( ( (lv_exactly_4_0= ruleExactly ) ) | ( (lv_atmost_5_0= ruleAt_most ) ) | ( (lv_atleast_6_0= ruleAt_least ) ) )? )
            {
            // InternalAdeptness.g:2708:2: (otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ( ( (lv_exactly_4_0= ruleExactly ) ) | ( (lv_atmost_5_0= ruleAt_most ) ) | ( (lv_atleast_6_0= ruleAt_least ) ) )? )
            // InternalAdeptness.g:2709:3: otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ( ( (lv_exactly_4_0= ruleExactly ) ) | ( (lv_atmost_5_0= ruleAt_most ) ) | ( (lv_atleast_6_0= ruleAt_least ) ) )?
            {
            otherlv_0=(Token)match(input,62,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getIsInRangeBetweenKeyword_0());
            		
            // InternalAdeptness.g:2713:3: ( (lv_bound_lower_1_0= ruleBound_Down ) )
            // InternalAdeptness.g:2714:4: (lv_bound_lower_1_0= ruleBound_Down )
            {
            // InternalAdeptness.g:2714:4: (lv_bound_lower_1_0= ruleBound_Down )
            // InternalAdeptness.g:2715:5: lv_bound_lower_1_0= ruleBound_Down
            {

            					newCompositeNode(grammarAccess.getRangeAccess().getBound_lowerBound_DownParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_49);
            lv_bound_lower_1_0=ruleBound_Down();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRangeRule());
            					}
            					set(
            						current,
            						"bound_lower",
            						lv_bound_lower_1_0,
            						"org.xtext.example.mydsl.Adeptness.Bound_Down");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,63,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getAndKeyword_2());
            		
            // InternalAdeptness.g:2736:3: ( (lv_bound_upp_3_0= ruleBound_up ) )
            // InternalAdeptness.g:2737:4: (lv_bound_upp_3_0= ruleBound_up )
            {
            // InternalAdeptness.g:2737:4: (lv_bound_upp_3_0= ruleBound_up )
            // InternalAdeptness.g:2738:5: lv_bound_upp_3_0= ruleBound_up
            {

            					newCompositeNode(grammarAccess.getRangeAccess().getBound_uppBound_upParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_48);
            lv_bound_upp_3_0=ruleBound_up();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRangeRule());
            					}
            					set(
            						current,
            						"bound_upp",
            						lv_bound_upp_3_0,
            						"org.xtext.example.mydsl.Adeptness.Bound_up");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdeptness.g:2755:3: ( ( (lv_exactly_4_0= ruleExactly ) ) | ( (lv_atmost_5_0= ruleAt_most ) ) | ( (lv_atleast_6_0= ruleAt_least ) ) )?
            int alt28=4;
            switch ( input.LA(1) ) {
                case 65:
                    {
                    alt28=1;
                    }
                    break;
                case 68:
                    {
                    alt28=2;
                    }
                    break;
                case 69:
                    {
                    alt28=3;
                    }
                    break;
            }

            switch (alt28) {
                case 1 :
                    // InternalAdeptness.g:2756:4: ( (lv_exactly_4_0= ruleExactly ) )
                    {
                    // InternalAdeptness.g:2756:4: ( (lv_exactly_4_0= ruleExactly ) )
                    // InternalAdeptness.g:2757:5: (lv_exactly_4_0= ruleExactly )
                    {
                    // InternalAdeptness.g:2757:5: (lv_exactly_4_0= ruleExactly )
                    // InternalAdeptness.g:2758:6: lv_exactly_4_0= ruleExactly
                    {

                    						newCompositeNode(grammarAccess.getRangeAccess().getExactlyExactlyParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exactly_4_0=ruleExactly();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRangeRule());
                    						}
                    						set(
                    							current,
                    							"exactly",
                    							lv_exactly_4_0,
                    							"org.xtext.example.mydsl.Adeptness.Exactly");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2776:4: ( (lv_atmost_5_0= ruleAt_most ) )
                    {
                    // InternalAdeptness.g:2776:4: ( (lv_atmost_5_0= ruleAt_most ) )
                    // InternalAdeptness.g:2777:5: (lv_atmost_5_0= ruleAt_most )
                    {
                    // InternalAdeptness.g:2777:5: (lv_atmost_5_0= ruleAt_most )
                    // InternalAdeptness.g:2778:6: lv_atmost_5_0= ruleAt_most
                    {

                    						newCompositeNode(grammarAccess.getRangeAccess().getAtmostAt_mostParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_atmost_5_0=ruleAt_most();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRangeRule());
                    						}
                    						set(
                    							current,
                    							"atmost",
                    							lv_atmost_5_0,
                    							"org.xtext.example.mydsl.Adeptness.At_most");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:2796:4: ( (lv_atleast_6_0= ruleAt_least ) )
                    {
                    // InternalAdeptness.g:2796:4: ( (lv_atleast_6_0= ruleAt_least ) )
                    // InternalAdeptness.g:2797:5: (lv_atleast_6_0= ruleAt_least )
                    {
                    // InternalAdeptness.g:2797:5: (lv_atleast_6_0= ruleAt_least )
                    // InternalAdeptness.g:2798:6: lv_atleast_6_0= ruleAt_least
                    {

                    						newCompositeNode(grammarAccess.getRangeAccess().getAtleastAt_leastParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_atleast_6_0=ruleAt_least();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRangeRule());
                    						}
                    						set(
                    							current,
                    							"atleast",
                    							lv_atleast_6_0,
                    							"org.xtext.example.mydsl.Adeptness.At_least");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleGap"
    // InternalAdeptness.g:2820:1: entryRuleGap returns [EObject current=null] : iv_ruleGap= ruleGap EOF ;
    public final EObject entryRuleGap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGap = null;


        try {
            // InternalAdeptness.g:2820:44: (iv_ruleGap= ruleGap EOF )
            // InternalAdeptness.g:2821:2: iv_ruleGap= ruleGap EOF
            {
             newCompositeNode(grammarAccess.getGapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGap=ruleGap();

            state._fsp--;

             current =iv_ruleGap; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGap"


    // $ANTLR start "ruleGap"
    // InternalAdeptness.g:2827:1: ruleGap returns [EObject current=null] : (otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ( ( (lv_exactly_4_0= ruleExactly ) ) | ( (lv_atmost_5_0= ruleAt_most ) ) | ( (lv_atleast_6_0= ruleAt_least ) ) )? ) ;
    public final EObject ruleGap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_bound_lower_1_0 = null;

        EObject lv_bound_upp_3_0 = null;

        EObject lv_exactly_4_0 = null;

        EObject lv_atmost_5_0 = null;

        EObject lv_atleast_6_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2833:2: ( (otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ( ( (lv_exactly_4_0= ruleExactly ) ) | ( (lv_atmost_5_0= ruleAt_most ) ) | ( (lv_atleast_6_0= ruleAt_least ) ) )? ) )
            // InternalAdeptness.g:2834:2: (otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ( ( (lv_exactly_4_0= ruleExactly ) ) | ( (lv_atmost_5_0= ruleAt_most ) ) | ( (lv_atleast_6_0= ruleAt_least ) ) )? )
            {
            // InternalAdeptness.g:2834:2: (otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ( ( (lv_exactly_4_0= ruleExactly ) ) | ( (lv_atmost_5_0= ruleAt_most ) ) | ( (lv_atleast_6_0= ruleAt_least ) ) )? )
            // InternalAdeptness.g:2835:3: otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ( ( (lv_exactly_4_0= ruleExactly ) ) | ( (lv_atmost_5_0= ruleAt_most ) ) | ( (lv_atleast_6_0= ruleAt_least ) ) )?
            {
            otherlv_0=(Token)match(input,64,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getGapAccess().getNotInRangeBetweenKeyword_0());
            		
            // InternalAdeptness.g:2839:3: ( (lv_bound_lower_1_0= ruleBound_Down ) )
            // InternalAdeptness.g:2840:4: (lv_bound_lower_1_0= ruleBound_Down )
            {
            // InternalAdeptness.g:2840:4: (lv_bound_lower_1_0= ruleBound_Down )
            // InternalAdeptness.g:2841:5: lv_bound_lower_1_0= ruleBound_Down
            {

            					newCompositeNode(grammarAccess.getGapAccess().getBound_lowerBound_DownParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_49);
            lv_bound_lower_1_0=ruleBound_Down();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapRule());
            					}
            					set(
            						current,
            						"bound_lower",
            						lv_bound_lower_1_0,
            						"org.xtext.example.mydsl.Adeptness.Bound_Down");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,63,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getGapAccess().getAndKeyword_2());
            		
            // InternalAdeptness.g:2862:3: ( (lv_bound_upp_3_0= ruleBound_up ) )
            // InternalAdeptness.g:2863:4: (lv_bound_upp_3_0= ruleBound_up )
            {
            // InternalAdeptness.g:2863:4: (lv_bound_upp_3_0= ruleBound_up )
            // InternalAdeptness.g:2864:5: lv_bound_upp_3_0= ruleBound_up
            {

            					newCompositeNode(grammarAccess.getGapAccess().getBound_uppBound_upParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_48);
            lv_bound_upp_3_0=ruleBound_up();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapRule());
            					}
            					set(
            						current,
            						"bound_upp",
            						lv_bound_upp_3_0,
            						"org.xtext.example.mydsl.Adeptness.Bound_up");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdeptness.g:2881:3: ( ( (lv_exactly_4_0= ruleExactly ) ) | ( (lv_atmost_5_0= ruleAt_most ) ) | ( (lv_atleast_6_0= ruleAt_least ) ) )?
            int alt29=4;
            switch ( input.LA(1) ) {
                case 65:
                    {
                    alt29=1;
                    }
                    break;
                case 68:
                    {
                    alt29=2;
                    }
                    break;
                case 69:
                    {
                    alt29=3;
                    }
                    break;
            }

            switch (alt29) {
                case 1 :
                    // InternalAdeptness.g:2882:4: ( (lv_exactly_4_0= ruleExactly ) )
                    {
                    // InternalAdeptness.g:2882:4: ( (lv_exactly_4_0= ruleExactly ) )
                    // InternalAdeptness.g:2883:5: (lv_exactly_4_0= ruleExactly )
                    {
                    // InternalAdeptness.g:2883:5: (lv_exactly_4_0= ruleExactly )
                    // InternalAdeptness.g:2884:6: lv_exactly_4_0= ruleExactly
                    {

                    						newCompositeNode(grammarAccess.getGapAccess().getExactlyExactlyParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exactly_4_0=ruleExactly();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGapRule());
                    						}
                    						set(
                    							current,
                    							"exactly",
                    							lv_exactly_4_0,
                    							"org.xtext.example.mydsl.Adeptness.Exactly");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2902:4: ( (lv_atmost_5_0= ruleAt_most ) )
                    {
                    // InternalAdeptness.g:2902:4: ( (lv_atmost_5_0= ruleAt_most ) )
                    // InternalAdeptness.g:2903:5: (lv_atmost_5_0= ruleAt_most )
                    {
                    // InternalAdeptness.g:2903:5: (lv_atmost_5_0= ruleAt_most )
                    // InternalAdeptness.g:2904:6: lv_atmost_5_0= ruleAt_most
                    {

                    						newCompositeNode(grammarAccess.getGapAccess().getAtmostAt_mostParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_atmost_5_0=ruleAt_most();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGapRule());
                    						}
                    						set(
                    							current,
                    							"atmost",
                    							lv_atmost_5_0,
                    							"org.xtext.example.mydsl.Adeptness.At_most");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:2922:4: ( (lv_atleast_6_0= ruleAt_least ) )
                    {
                    // InternalAdeptness.g:2922:4: ( (lv_atleast_6_0= ruleAt_least ) )
                    // InternalAdeptness.g:2923:5: (lv_atleast_6_0= ruleAt_least )
                    {
                    // InternalAdeptness.g:2923:5: (lv_atleast_6_0= ruleAt_least )
                    // InternalAdeptness.g:2924:6: lv_atleast_6_0= ruleAt_least
                    {

                    						newCompositeNode(grammarAccess.getGapAccess().getAtleastAt_leastParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_atleast_6_0=ruleAt_least();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGapRule());
                    						}
                    						set(
                    							current,
                    							"atleast",
                    							lv_atleast_6_0,
                    							"org.xtext.example.mydsl.Adeptness.At_least");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGap"


    // $ANTLR start "entryRuleExactly"
    // InternalAdeptness.g:2946:1: entryRuleExactly returns [EObject current=null] : iv_ruleExactly= ruleExactly EOF ;
    public final EObject entryRuleExactly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactly = null;


        try {
            // InternalAdeptness.g:2946:48: (iv_ruleExactly= ruleExactly EOF )
            // InternalAdeptness.g:2947:2: iv_ruleExactly= ruleExactly EOF
            {
             newCompositeNode(grammarAccess.getExactlyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExactly=ruleExactly();

            state._fsp--;

             current =iv_ruleExactly; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExactly"


    // $ANTLR start "ruleExactly"
    // InternalAdeptness.g:2953:1: ruleExactly returns [EObject current=null] : (otherlv_0= 'exactly' ( (lv_value_1_0= ruleDOUBLE ) ) (otherlv_2= 'times' | (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) ) | ( (lv_unit_6_0= ruleTimeType ) ) ) ) ;
    public final EObject ruleExactly() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_value_1_0 = null;

        EObject lv_time_4_0 = null;

        EObject lv_unit_5_0 = null;

        EObject lv_unit_6_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2959:2: ( (otherlv_0= 'exactly' ( (lv_value_1_0= ruleDOUBLE ) ) (otherlv_2= 'times' | (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) ) | ( (lv_unit_6_0= ruleTimeType ) ) ) ) )
            // InternalAdeptness.g:2960:2: (otherlv_0= 'exactly' ( (lv_value_1_0= ruleDOUBLE ) ) (otherlv_2= 'times' | (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) ) | ( (lv_unit_6_0= ruleTimeType ) ) ) )
            {
            // InternalAdeptness.g:2960:2: (otherlv_0= 'exactly' ( (lv_value_1_0= ruleDOUBLE ) ) (otherlv_2= 'times' | (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) ) | ( (lv_unit_6_0= ruleTimeType ) ) ) )
            // InternalAdeptness.g:2961:3: otherlv_0= 'exactly' ( (lv_value_1_0= ruleDOUBLE ) ) (otherlv_2= 'times' | (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) ) | ( (lv_unit_6_0= ruleTimeType ) ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getExactlyAccess().getExactlyKeyword_0());
            		
            // InternalAdeptness.g:2965:3: ( (lv_value_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:2966:4: (lv_value_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:2966:4: (lv_value_1_0= ruleDOUBLE )
            // InternalAdeptness.g:2967:5: lv_value_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getExactlyAccess().getValueDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_50);
            lv_value_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExactlyRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.Adeptness.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdeptness.g:2984:3: (otherlv_2= 'times' | (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) ) | ( (lv_unit_6_0= ruleTimeType ) ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt30=1;
                }
                break;
            case 67:
                {
                alt30=2;
                }
                break;
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalAdeptness.g:2985:4: otherlv_2= 'times'
                    {
                    otherlv_2=(Token)match(input,66,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getExactlyAccess().getTimesKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2990:4: (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) )
                    {
                    // InternalAdeptness.g:2990:4: (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) )
                    // InternalAdeptness.g:2991:5: otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) )
                    {
                    otherlv_3=(Token)match(input,67,FOLLOW_26); 

                    					newLeafNode(otherlv_3, grammarAccess.getExactlyAccess().getTimesInKeyword_2_1_0());
                    				
                    // InternalAdeptness.g:2995:5: ( (lv_time_4_0= ruleDOUBLE ) )
                    // InternalAdeptness.g:2996:6: (lv_time_4_0= ruleDOUBLE )
                    {
                    // InternalAdeptness.g:2996:6: (lv_time_4_0= ruleDOUBLE )
                    // InternalAdeptness.g:2997:7: lv_time_4_0= ruleDOUBLE
                    {

                    							newCompositeNode(grammarAccess.getExactlyAccess().getTimeDOUBLEParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_38);
                    lv_time_4_0=ruleDOUBLE();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getExactlyRule());
                    							}
                    							set(
                    								current,
                    								"time",
                    								lv_time_4_0,
                    								"org.xtext.example.mydsl.Adeptness.DOUBLE");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAdeptness.g:3014:5: ( (lv_unit_5_0= ruleTimeType ) )
                    // InternalAdeptness.g:3015:6: (lv_unit_5_0= ruleTimeType )
                    {
                    // InternalAdeptness.g:3015:6: (lv_unit_5_0= ruleTimeType )
                    // InternalAdeptness.g:3016:7: lv_unit_5_0= ruleTimeType
                    {

                    							newCompositeNode(grammarAccess.getExactlyAccess().getUnitTimeTypeParserRuleCall_2_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_unit_5_0=ruleTimeType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getExactlyRule());
                    							}
                    							set(
                    								current,
                    								"unit",
                    								lv_unit_5_0,
                    								"org.xtext.example.mydsl.Adeptness.TimeType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:3035:4: ( (lv_unit_6_0= ruleTimeType ) )
                    {
                    // InternalAdeptness.g:3035:4: ( (lv_unit_6_0= ruleTimeType ) )
                    // InternalAdeptness.g:3036:5: (lv_unit_6_0= ruleTimeType )
                    {
                    // InternalAdeptness.g:3036:5: (lv_unit_6_0= ruleTimeType )
                    // InternalAdeptness.g:3037:6: lv_unit_6_0= ruleTimeType
                    {

                    						newCompositeNode(grammarAccess.getExactlyAccess().getUnitTimeTypeParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_unit_6_0=ruleTimeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExactlyRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_6_0,
                    							"org.xtext.example.mydsl.Adeptness.TimeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExactly"


    // $ANTLR start "entryRuleAt_most"
    // InternalAdeptness.g:3059:1: entryRuleAt_most returns [EObject current=null] : iv_ruleAt_most= ruleAt_most EOF ;
    public final EObject entryRuleAt_most() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAt_most = null;


        try {
            // InternalAdeptness.g:3059:48: (iv_ruleAt_most= ruleAt_most EOF )
            // InternalAdeptness.g:3060:2: iv_ruleAt_most= ruleAt_most EOF
            {
             newCompositeNode(grammarAccess.getAt_mostRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAt_most=ruleAt_most();

            state._fsp--;

             current =iv_ruleAt_most; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAt_most"


    // $ANTLR start "ruleAt_most"
    // InternalAdeptness.g:3066:1: ruleAt_most returns [EObject current=null] : (otherlv_0= 'at most' ( (lv_value_1_0= ruleDOUBLE ) ) (otherlv_2= 'times' | (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) ) | ( (lv_unit_6_0= ruleTimeType ) ) ) ) ;
    public final EObject ruleAt_most() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_value_1_0 = null;

        EObject lv_time_4_0 = null;

        EObject lv_unit_5_0 = null;

        EObject lv_unit_6_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:3072:2: ( (otherlv_0= 'at most' ( (lv_value_1_0= ruleDOUBLE ) ) (otherlv_2= 'times' | (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) ) | ( (lv_unit_6_0= ruleTimeType ) ) ) ) )
            // InternalAdeptness.g:3073:2: (otherlv_0= 'at most' ( (lv_value_1_0= ruleDOUBLE ) ) (otherlv_2= 'times' | (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) ) | ( (lv_unit_6_0= ruleTimeType ) ) ) )
            {
            // InternalAdeptness.g:3073:2: (otherlv_0= 'at most' ( (lv_value_1_0= ruleDOUBLE ) ) (otherlv_2= 'times' | (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) ) | ( (lv_unit_6_0= ruleTimeType ) ) ) )
            // InternalAdeptness.g:3074:3: otherlv_0= 'at most' ( (lv_value_1_0= ruleDOUBLE ) ) (otherlv_2= 'times' | (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) ) | ( (lv_unit_6_0= ruleTimeType ) ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAt_mostAccess().getAtMostKeyword_0());
            		
            // InternalAdeptness.g:3078:3: ( (lv_value_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:3079:4: (lv_value_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:3079:4: (lv_value_1_0= ruleDOUBLE )
            // InternalAdeptness.g:3080:5: lv_value_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getAt_mostAccess().getValueDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_50);
            lv_value_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAt_mostRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.Adeptness.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdeptness.g:3097:3: (otherlv_2= 'times' | (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) ) | ( (lv_unit_6_0= ruleTimeType ) ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt31=1;
                }
                break;
            case 67:
                {
                alt31=2;
                }
                break;
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalAdeptness.g:3098:4: otherlv_2= 'times'
                    {
                    otherlv_2=(Token)match(input,66,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getAt_mostAccess().getTimesKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:3103:4: (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) )
                    {
                    // InternalAdeptness.g:3103:4: (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) )
                    // InternalAdeptness.g:3104:5: otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) )
                    {
                    otherlv_3=(Token)match(input,67,FOLLOW_26); 

                    					newLeafNode(otherlv_3, grammarAccess.getAt_mostAccess().getTimesInKeyword_2_1_0());
                    				
                    // InternalAdeptness.g:3108:5: ( (lv_time_4_0= ruleDOUBLE ) )
                    // InternalAdeptness.g:3109:6: (lv_time_4_0= ruleDOUBLE )
                    {
                    // InternalAdeptness.g:3109:6: (lv_time_4_0= ruleDOUBLE )
                    // InternalAdeptness.g:3110:7: lv_time_4_0= ruleDOUBLE
                    {

                    							newCompositeNode(grammarAccess.getAt_mostAccess().getTimeDOUBLEParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_38);
                    lv_time_4_0=ruleDOUBLE();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAt_mostRule());
                    							}
                    							set(
                    								current,
                    								"time",
                    								lv_time_4_0,
                    								"org.xtext.example.mydsl.Adeptness.DOUBLE");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAdeptness.g:3127:5: ( (lv_unit_5_0= ruleTimeType ) )
                    // InternalAdeptness.g:3128:6: (lv_unit_5_0= ruleTimeType )
                    {
                    // InternalAdeptness.g:3128:6: (lv_unit_5_0= ruleTimeType )
                    // InternalAdeptness.g:3129:7: lv_unit_5_0= ruleTimeType
                    {

                    							newCompositeNode(grammarAccess.getAt_mostAccess().getUnitTimeTypeParserRuleCall_2_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_unit_5_0=ruleTimeType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAt_mostRule());
                    							}
                    							set(
                    								current,
                    								"unit",
                    								lv_unit_5_0,
                    								"org.xtext.example.mydsl.Adeptness.TimeType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:3148:4: ( (lv_unit_6_0= ruleTimeType ) )
                    {
                    // InternalAdeptness.g:3148:4: ( (lv_unit_6_0= ruleTimeType ) )
                    // InternalAdeptness.g:3149:5: (lv_unit_6_0= ruleTimeType )
                    {
                    // InternalAdeptness.g:3149:5: (lv_unit_6_0= ruleTimeType )
                    // InternalAdeptness.g:3150:6: lv_unit_6_0= ruleTimeType
                    {

                    						newCompositeNode(grammarAccess.getAt_mostAccess().getUnitTimeTypeParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_unit_6_0=ruleTimeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAt_mostRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_6_0,
                    							"org.xtext.example.mydsl.Adeptness.TimeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAt_most"


    // $ANTLR start "entryRuleAt_least"
    // InternalAdeptness.g:3172:1: entryRuleAt_least returns [EObject current=null] : iv_ruleAt_least= ruleAt_least EOF ;
    public final EObject entryRuleAt_least() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAt_least = null;


        try {
            // InternalAdeptness.g:3172:49: (iv_ruleAt_least= ruleAt_least EOF )
            // InternalAdeptness.g:3173:2: iv_ruleAt_least= ruleAt_least EOF
            {
             newCompositeNode(grammarAccess.getAt_leastRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAt_least=ruleAt_least();

            state._fsp--;

             current =iv_ruleAt_least; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAt_least"


    // $ANTLR start "ruleAt_least"
    // InternalAdeptness.g:3179:1: ruleAt_least returns [EObject current=null] : (otherlv_0= 'at least' ( (lv_value_1_0= ruleDOUBLE ) ) (otherlv_2= 'times' | (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) ) | ( (lv_unit_6_0= ruleTimeType ) ) ) ) ;
    public final EObject ruleAt_least() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_value_1_0 = null;

        EObject lv_time_4_0 = null;

        EObject lv_unit_5_0 = null;

        EObject lv_unit_6_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:3185:2: ( (otherlv_0= 'at least' ( (lv_value_1_0= ruleDOUBLE ) ) (otherlv_2= 'times' | (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) ) | ( (lv_unit_6_0= ruleTimeType ) ) ) ) )
            // InternalAdeptness.g:3186:2: (otherlv_0= 'at least' ( (lv_value_1_0= ruleDOUBLE ) ) (otherlv_2= 'times' | (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) ) | ( (lv_unit_6_0= ruleTimeType ) ) ) )
            {
            // InternalAdeptness.g:3186:2: (otherlv_0= 'at least' ( (lv_value_1_0= ruleDOUBLE ) ) (otherlv_2= 'times' | (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) ) | ( (lv_unit_6_0= ruleTimeType ) ) ) )
            // InternalAdeptness.g:3187:3: otherlv_0= 'at least' ( (lv_value_1_0= ruleDOUBLE ) ) (otherlv_2= 'times' | (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) ) | ( (lv_unit_6_0= ruleTimeType ) ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAt_leastAccess().getAtLeastKeyword_0());
            		
            // InternalAdeptness.g:3191:3: ( (lv_value_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:3192:4: (lv_value_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:3192:4: (lv_value_1_0= ruleDOUBLE )
            // InternalAdeptness.g:3193:5: lv_value_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getAt_leastAccess().getValueDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_50);
            lv_value_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAt_leastRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.Adeptness.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdeptness.g:3210:3: (otherlv_2= 'times' | (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) ) | ( (lv_unit_6_0= ruleTimeType ) ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt32=1;
                }
                break;
            case 67:
                {
                alt32=2;
                }
                break;
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalAdeptness.g:3211:4: otherlv_2= 'times'
                    {
                    otherlv_2=(Token)match(input,66,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getAt_leastAccess().getTimesKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:3216:4: (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) )
                    {
                    // InternalAdeptness.g:3216:4: (otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) ) )
                    // InternalAdeptness.g:3217:5: otherlv_3= 'times in' ( (lv_time_4_0= ruleDOUBLE ) ) ( (lv_unit_5_0= ruleTimeType ) )
                    {
                    otherlv_3=(Token)match(input,67,FOLLOW_26); 

                    					newLeafNode(otherlv_3, grammarAccess.getAt_leastAccess().getTimesInKeyword_2_1_0());
                    				
                    // InternalAdeptness.g:3221:5: ( (lv_time_4_0= ruleDOUBLE ) )
                    // InternalAdeptness.g:3222:6: (lv_time_4_0= ruleDOUBLE )
                    {
                    // InternalAdeptness.g:3222:6: (lv_time_4_0= ruleDOUBLE )
                    // InternalAdeptness.g:3223:7: lv_time_4_0= ruleDOUBLE
                    {

                    							newCompositeNode(grammarAccess.getAt_leastAccess().getTimeDOUBLEParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_38);
                    lv_time_4_0=ruleDOUBLE();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAt_leastRule());
                    							}
                    							set(
                    								current,
                    								"time",
                    								lv_time_4_0,
                    								"org.xtext.example.mydsl.Adeptness.DOUBLE");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAdeptness.g:3240:5: ( (lv_unit_5_0= ruleTimeType ) )
                    // InternalAdeptness.g:3241:6: (lv_unit_5_0= ruleTimeType )
                    {
                    // InternalAdeptness.g:3241:6: (lv_unit_5_0= ruleTimeType )
                    // InternalAdeptness.g:3242:7: lv_unit_5_0= ruleTimeType
                    {

                    							newCompositeNode(grammarAccess.getAt_leastAccess().getUnitTimeTypeParserRuleCall_2_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_unit_5_0=ruleTimeType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAt_leastRule());
                    							}
                    							set(
                    								current,
                    								"unit",
                    								lv_unit_5_0,
                    								"org.xtext.example.mydsl.Adeptness.TimeType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:3261:4: ( (lv_unit_6_0= ruleTimeType ) )
                    {
                    // InternalAdeptness.g:3261:4: ( (lv_unit_6_0= ruleTimeType ) )
                    // InternalAdeptness.g:3262:5: (lv_unit_6_0= ruleTimeType )
                    {
                    // InternalAdeptness.g:3262:5: (lv_unit_6_0= ruleTimeType )
                    // InternalAdeptness.g:3263:6: lv_unit_6_0= ruleTimeType
                    {

                    						newCompositeNode(grammarAccess.getAt_leastAccess().getUnitTimeTypeParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_unit_6_0=ruleTimeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAt_leastRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_6_0,
                    							"org.xtext.example.mydsl.Adeptness.TimeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAt_least"


    // $ANTLR start "entryRuleBound_up"
    // InternalAdeptness.g:3285:1: entryRuleBound_up returns [EObject current=null] : iv_ruleBound_up= ruleBound_up EOF ;
    public final EObject entryRuleBound_up() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBound_up = null;


        try {
            // InternalAdeptness.g:3285:49: (iv_ruleBound_up= ruleBound_up EOF )
            // InternalAdeptness.g:3286:2: iv_ruleBound_up= ruleBound_up EOF
            {
             newCompositeNode(grammarAccess.getBound_upRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBound_up=ruleBound_up();

            state._fsp--;

             current =iv_ruleBound_up; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBound_up"


    // $ANTLR start "ruleBound_up"
    // InternalAdeptness.g:3292:1: ruleBound_up returns [EObject current=null] : ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_em_1_0= ruleExpressionsModel ) ) ) ;
    public final EObject ruleBound_up() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_em_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:3298:2: ( ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_em_1_0= ruleExpressionsModel ) ) ) )
            // InternalAdeptness.g:3299:2: ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_em_1_0= ruleExpressionsModel ) ) )
            {
            // InternalAdeptness.g:3299:2: ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_em_1_0= ruleExpressionsModel ) ) )
            int alt33=2;
            switch ( input.LA(1) ) {
            case 72:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==RULE_INT) ) {
                    alt33=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt33=1;
                }
                break;
            case EOF:
            case RULE_ID:
            case 52:
            case 65:
            case 68:
            case 69:
            case 81:
                {
                alt33=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalAdeptness.g:3300:3: ( (lv_value_0_0= ruleDOUBLE ) )
                    {
                    // InternalAdeptness.g:3300:3: ( (lv_value_0_0= ruleDOUBLE ) )
                    // InternalAdeptness.g:3301:4: (lv_value_0_0= ruleDOUBLE )
                    {
                    // InternalAdeptness.g:3301:4: (lv_value_0_0= ruleDOUBLE )
                    // InternalAdeptness.g:3302:5: lv_value_0_0= ruleDOUBLE
                    {

                    					newCompositeNode(grammarAccess.getBound_upAccess().getValueDOUBLEParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleDOUBLE();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBound_upRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"org.xtext.example.mydsl.Adeptness.DOUBLE");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:3320:3: ( (lv_em_1_0= ruleExpressionsModel ) )
                    {
                    // InternalAdeptness.g:3320:3: ( (lv_em_1_0= ruleExpressionsModel ) )
                    // InternalAdeptness.g:3321:4: (lv_em_1_0= ruleExpressionsModel )
                    {
                    // InternalAdeptness.g:3321:4: (lv_em_1_0= ruleExpressionsModel )
                    // InternalAdeptness.g:3322:5: lv_em_1_0= ruleExpressionsModel
                    {

                    					newCompositeNode(grammarAccess.getBound_upAccess().getEmExpressionsModelParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_em_1_0=ruleExpressionsModel();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBound_upRule());
                    					}
                    					set(
                    						current,
                    						"em",
                    						lv_em_1_0,
                    						"org.xtext.example.mydsl.Adeptness.ExpressionsModel");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBound_up"


    // $ANTLR start "entryRuleBound_Down"
    // InternalAdeptness.g:3343:1: entryRuleBound_Down returns [EObject current=null] : iv_ruleBound_Down= ruleBound_Down EOF ;
    public final EObject entryRuleBound_Down() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBound_Down = null;


        try {
            // InternalAdeptness.g:3343:51: (iv_ruleBound_Down= ruleBound_Down EOF )
            // InternalAdeptness.g:3344:2: iv_ruleBound_Down= ruleBound_Down EOF
            {
             newCompositeNode(grammarAccess.getBound_DownRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBound_Down=ruleBound_Down();

            state._fsp--;

             current =iv_ruleBound_Down; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBound_Down"


    // $ANTLR start "ruleBound_Down"
    // InternalAdeptness.g:3350:1: ruleBound_Down returns [EObject current=null] : ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_em_1_0= ruleExpressionsModel ) ) ) ;
    public final EObject ruleBound_Down() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_em_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:3356:2: ( ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_em_1_0= ruleExpressionsModel ) ) ) )
            // InternalAdeptness.g:3357:2: ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_em_1_0= ruleExpressionsModel ) ) )
            {
            // InternalAdeptness.g:3357:2: ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_em_1_0= ruleExpressionsModel ) ) )
            int alt34=2;
            switch ( input.LA(1) ) {
            case 72:
                {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==RULE_INT) ) {
                    alt34=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt34=1;
                }
                break;
            case EOF:
            case RULE_ID:
            case 52:
            case 63:
            case 65:
            case 68:
            case 69:
            case 81:
                {
                alt34=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalAdeptness.g:3358:3: ( (lv_value_0_0= ruleDOUBLE ) )
                    {
                    // InternalAdeptness.g:3358:3: ( (lv_value_0_0= ruleDOUBLE ) )
                    // InternalAdeptness.g:3359:4: (lv_value_0_0= ruleDOUBLE )
                    {
                    // InternalAdeptness.g:3359:4: (lv_value_0_0= ruleDOUBLE )
                    // InternalAdeptness.g:3360:5: lv_value_0_0= ruleDOUBLE
                    {

                    					newCompositeNode(grammarAccess.getBound_DownAccess().getValueDOUBLEParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleDOUBLE();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBound_DownRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"org.xtext.example.mydsl.Adeptness.DOUBLE");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:3378:3: ( (lv_em_1_0= ruleExpressionsModel ) )
                    {
                    // InternalAdeptness.g:3378:3: ( (lv_em_1_0= ruleExpressionsModel ) )
                    // InternalAdeptness.g:3379:4: (lv_em_1_0= ruleExpressionsModel )
                    {
                    // InternalAdeptness.g:3379:4: (lv_em_1_0= ruleExpressionsModel )
                    // InternalAdeptness.g:3380:5: lv_em_1_0= ruleExpressionsModel
                    {

                    					newCompositeNode(grammarAccess.getBound_DownAccess().getEmExpressionsModelParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_em_1_0=ruleExpressionsModel();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBound_DownRule());
                    					}
                    					set(
                    						current,
                    						"em",
                    						lv_em_1_0,
                    						"org.xtext.example.mydsl.Adeptness.ExpressionsModel");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBound_Down"


    // $ANTLR start "entryRuleBOOLEAN"
    // InternalAdeptness.g:3401:1: entryRuleBOOLEAN returns [EObject current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final EObject entryRuleBOOLEAN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOOLEAN = null;


        try {
            // InternalAdeptness.g:3401:48: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalAdeptness.g:3402:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
             newCompositeNode(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;

             current =iv_ruleBOOLEAN; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // InternalAdeptness.g:3408:1: ruleBOOLEAN returns [EObject current=null] : ( (lv_bool_0_0= ruleb ) ) ;
    public final EObject ruleBOOLEAN() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_bool_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:3414:2: ( ( (lv_bool_0_0= ruleb ) ) )
            // InternalAdeptness.g:3415:2: ( (lv_bool_0_0= ruleb ) )
            {
            // InternalAdeptness.g:3415:2: ( (lv_bool_0_0= ruleb ) )
            // InternalAdeptness.g:3416:3: (lv_bool_0_0= ruleb )
            {
            // InternalAdeptness.g:3416:3: (lv_bool_0_0= ruleb )
            // InternalAdeptness.g:3417:4: lv_bool_0_0= ruleb
            {

            				newCompositeNode(grammarAccess.getBOOLEANAccess().getBoolBParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_bool_0_0=ruleb();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBOOLEANRule());
            				}
            				set(
            					current,
            					"bool",
            					lv_bool_0_0,
            					"org.xtext.example.mydsl.Adeptness.b");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "entryRuleb"
    // InternalAdeptness.g:3437:1: entryRuleb returns [String current=null] : iv_ruleb= ruleb EOF ;
    public final String entryRuleb() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleb = null;


        try {
            // InternalAdeptness.g:3437:41: (iv_ruleb= ruleb EOF )
            // InternalAdeptness.g:3438:2: iv_ruleb= ruleb EOF
            {
             newCompositeNode(grammarAccess.getBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleb=ruleb();

            state._fsp--;

             current =iv_ruleb.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleb"


    // $ANTLR start "ruleb"
    // InternalAdeptness.g:3444:1: ruleb returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleb() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdeptness.g:3450:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalAdeptness.g:3451:2: (kw= 'true' | kw= 'false' )
            {
            // InternalAdeptness.g:3451:2: (kw= 'true' | kw= 'false' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==70) ) {
                alt35=1;
            }
            else if ( (LA35_0==71) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalAdeptness.g:3452:3: kw= 'true'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:3458:3: kw= 'false'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleb"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalAdeptness.g:3467:1: entryRuleDOUBLE returns [EObject current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final EObject entryRuleDOUBLE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOUBLE = null;


        try {
            // InternalAdeptness.g:3467:47: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalAdeptness.g:3468:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalAdeptness.g:3474:1: ruleDOUBLE returns [EObject current=null] : ( (lv_dVal_0_0= ruled ) ) ;
    public final EObject ruleDOUBLE() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_dVal_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:3480:2: ( ( (lv_dVal_0_0= ruled ) ) )
            // InternalAdeptness.g:3481:2: ( (lv_dVal_0_0= ruled ) )
            {
            // InternalAdeptness.g:3481:2: ( (lv_dVal_0_0= ruled ) )
            // InternalAdeptness.g:3482:3: (lv_dVal_0_0= ruled )
            {
            // InternalAdeptness.g:3482:3: (lv_dVal_0_0= ruled )
            // InternalAdeptness.g:3483:4: lv_dVal_0_0= ruled
            {

            				newCompositeNode(grammarAccess.getDOUBLEAccess().getDValDParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_dVal_0_0=ruled();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDOUBLERule());
            				}
            				set(
            					current,
            					"dVal",
            					lv_dVal_0_0,
            					"org.xtext.example.mydsl.Adeptness.d");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRuled"
    // InternalAdeptness.g:3503:1: entryRuled returns [String current=null] : iv_ruled= ruled EOF ;
    public final String entryRuled() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruled = null;


        try {
            // InternalAdeptness.g:3503:41: (iv_ruled= ruled EOF )
            // InternalAdeptness.g:3504:2: iv_ruled= ruled EOF
            {
             newCompositeNode(grammarAccess.getDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruled=ruled();

            state._fsp--;

             current =iv_ruled.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuled"


    // $ANTLR start "ruled"
    // InternalAdeptness.g:3510:1: ruled returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruled() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalAdeptness.g:3516:2: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // InternalAdeptness.g:3517:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // InternalAdeptness.g:3517:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // InternalAdeptness.g:3518:3: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // InternalAdeptness.g:3518:3: (kw= '-' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==72) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAdeptness.g:3519:4: kw= '-'
                    {
                    kw=(Token)match(input,72,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_6); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getDAccess().getINTTerminalRuleCall_1());
            		
            // InternalAdeptness.g:3532:3: (kw= '.' this_INT_3= RULE_INT )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==13) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAdeptness.g:3533:4: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,13,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDAccess().getFullStopKeyword_2_0());
                    			
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_3);
                    			

                    				newLeafNode(this_INT_3, grammarAccess.getDAccess().getINTTerminalRuleCall_2_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruled"


    // $ANTLR start "entryRuleTimeType"
    // InternalAdeptness.g:3550:1: entryRuleTimeType returns [EObject current=null] : iv_ruleTimeType= ruleTimeType EOF ;
    public final EObject entryRuleTimeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeType = null;


        try {
            // InternalAdeptness.g:3550:49: (iv_ruleTimeType= ruleTimeType EOF )
            // InternalAdeptness.g:3551:2: iv_ruleTimeType= ruleTimeType EOF
            {
             newCompositeNode(grammarAccess.getTimeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeType=ruleTimeType();

            state._fsp--;

             current =iv_ruleTimeType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeType"


    // $ANTLR start "ruleTimeType"
    // InternalAdeptness.g:3557:1: ruleTimeType returns [EObject current=null] : ( ( (lv_time_0_0= 'milliseconds' ) ) | ( (lv_time_1_0= 'seconds' ) ) | ( (lv_time_2_0= 'minutes' ) ) | ( (lv_time_3_0= 'hours' ) ) ) ;
    public final EObject ruleTimeType() throws RecognitionException {
        EObject current = null;

        Token lv_time_0_0=null;
        Token lv_time_1_0=null;
        Token lv_time_2_0=null;
        Token lv_time_3_0=null;


        	enterRule();

        try {
            // InternalAdeptness.g:3563:2: ( ( ( (lv_time_0_0= 'milliseconds' ) ) | ( (lv_time_1_0= 'seconds' ) ) | ( (lv_time_2_0= 'minutes' ) ) | ( (lv_time_3_0= 'hours' ) ) ) )
            // InternalAdeptness.g:3564:2: ( ( (lv_time_0_0= 'milliseconds' ) ) | ( (lv_time_1_0= 'seconds' ) ) | ( (lv_time_2_0= 'minutes' ) ) | ( (lv_time_3_0= 'hours' ) ) )
            {
            // InternalAdeptness.g:3564:2: ( ( (lv_time_0_0= 'milliseconds' ) ) | ( (lv_time_1_0= 'seconds' ) ) | ( (lv_time_2_0= 'minutes' ) ) | ( (lv_time_3_0= 'hours' ) ) )
            int alt38=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt38=1;
                }
                break;
            case 74:
                {
                alt38=2;
                }
                break;
            case 75:
                {
                alt38=3;
                }
                break;
            case 76:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalAdeptness.g:3565:3: ( (lv_time_0_0= 'milliseconds' ) )
                    {
                    // InternalAdeptness.g:3565:3: ( (lv_time_0_0= 'milliseconds' ) )
                    // InternalAdeptness.g:3566:4: (lv_time_0_0= 'milliseconds' )
                    {
                    // InternalAdeptness.g:3566:4: (lv_time_0_0= 'milliseconds' )
                    // InternalAdeptness.g:3567:5: lv_time_0_0= 'milliseconds'
                    {
                    lv_time_0_0=(Token)match(input,73,FOLLOW_2); 

                    					newLeafNode(lv_time_0_0, grammarAccess.getTimeTypeAccess().getTimeMillisecondsKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTimeTypeRule());
                    					}
                    					setWithLastConsumed(current, "time", lv_time_0_0, "milliseconds");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:3580:3: ( (lv_time_1_0= 'seconds' ) )
                    {
                    // InternalAdeptness.g:3580:3: ( (lv_time_1_0= 'seconds' ) )
                    // InternalAdeptness.g:3581:4: (lv_time_1_0= 'seconds' )
                    {
                    // InternalAdeptness.g:3581:4: (lv_time_1_0= 'seconds' )
                    // InternalAdeptness.g:3582:5: lv_time_1_0= 'seconds'
                    {
                    lv_time_1_0=(Token)match(input,74,FOLLOW_2); 

                    					newLeafNode(lv_time_1_0, grammarAccess.getTimeTypeAccess().getTimeSecondsKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTimeTypeRule());
                    					}
                    					setWithLastConsumed(current, "time", lv_time_1_0, "seconds");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:3595:3: ( (lv_time_2_0= 'minutes' ) )
                    {
                    // InternalAdeptness.g:3595:3: ( (lv_time_2_0= 'minutes' ) )
                    // InternalAdeptness.g:3596:4: (lv_time_2_0= 'minutes' )
                    {
                    // InternalAdeptness.g:3596:4: (lv_time_2_0= 'minutes' )
                    // InternalAdeptness.g:3597:5: lv_time_2_0= 'minutes'
                    {
                    lv_time_2_0=(Token)match(input,75,FOLLOW_2); 

                    					newLeafNode(lv_time_2_0, grammarAccess.getTimeTypeAccess().getTimeMinutesKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTimeTypeRule());
                    					}
                    					setWithLastConsumed(current, "time", lv_time_2_0, "minutes");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:3610:3: ( (lv_time_3_0= 'hours' ) )
                    {
                    // InternalAdeptness.g:3610:3: ( (lv_time_3_0= 'hours' ) )
                    // InternalAdeptness.g:3611:4: (lv_time_3_0= 'hours' )
                    {
                    // InternalAdeptness.g:3611:4: (lv_time_3_0= 'hours' )
                    // InternalAdeptness.g:3612:5: lv_time_3_0= 'hours'
                    {
                    lv_time_3_0=(Token)match(input,76,FOLLOW_2); 

                    					newLeafNode(lv_time_3_0, grammarAccess.getTimeTypeAccess().getTimeHoursKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTimeTypeRule());
                    					}
                    					setWithLastConsumed(current, "time", lv_time_3_0, "hours");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeType"


    // $ANTLR start "entryRuleDataType"
    // InternalAdeptness.g:3628:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalAdeptness.g:3628:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalAdeptness.g:3629:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalAdeptness.g:3635:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAdeptness.g:3641:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAdeptness.g:3642:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAdeptness.g:3642:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAdeptness.g:3643:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalAdeptness.g:3647:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:3648:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:3648:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:3649:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalAdeptness.g:3669:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalAdeptness.g:3669:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalAdeptness.g:3670:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalAdeptness.g:3676:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:3682:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // InternalAdeptness.g:3683:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // InternalAdeptness.g:3683:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // InternalAdeptness.g:3684:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
            		
            // InternalAdeptness.g:3688:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAdeptness.g:3689:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAdeptness.g:3689:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAdeptness.g:3690:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_51);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.Adeptness.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,79,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAdeptness.g:3711:3: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==11||LA39_0==14||LA39_0==28||LA39_0==38||(LA39_0>=77 && LA39_0<=78)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAdeptness.g:3712:4: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // InternalAdeptness.g:3712:4: (lv_elements_3_0= ruleAbstractElement )
            	    // InternalAdeptness.g:3713:5: lv_elements_3_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_52);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"org.xtext.example.mydsl.Adeptness.AbstractElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_4=(Token)match(input,80,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleExpressionsModel"
    // InternalAdeptness.g:3738:1: entryRuleExpressionsModel returns [EObject current=null] : iv_ruleExpressionsModel= ruleExpressionsModel EOF ;
    public final EObject entryRuleExpressionsModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionsModel = null;


        try {
            // InternalAdeptness.g:3738:57: (iv_ruleExpressionsModel= ruleExpressionsModel EOF )
            // InternalAdeptness.g:3739:2: iv_ruleExpressionsModel= ruleExpressionsModel EOF
            {
             newCompositeNode(grammarAccess.getExpressionsModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionsModel=ruleExpressionsModel();

            state._fsp--;

             current =iv_ruleExpressionsModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionsModel"


    // $ANTLR start "ruleExpressionsModel"
    // InternalAdeptness.g:3745:1: ruleExpressionsModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement2 ) )* ;
    public final EObject ruleExpressionsModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:3751:2: ( ( (lv_elements_0_0= ruleAbstractElement2 ) )* )
            // InternalAdeptness.g:3752:2: ( (lv_elements_0_0= ruleAbstractElement2 ) )*
            {
            // InternalAdeptness.g:3752:2: ( (lv_elements_0_0= ruleAbstractElement2 ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID||LA40_0==RULE_INT||LA40_0==72||LA40_0==81) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAdeptness.g:3753:3: (lv_elements_0_0= ruleAbstractElement2 )
            	    {
            	    // InternalAdeptness.g:3753:3: (lv_elements_0_0= ruleAbstractElement2 )
            	    // InternalAdeptness.g:3754:4: lv_elements_0_0= ruleAbstractElement2
            	    {

            	    				newCompositeNode(grammarAccess.getExpressionsModelAccess().getElementsAbstractElement2ParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_53);
            	    lv_elements_0_0=ruleAbstractElement2();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getExpressionsModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.example.mydsl.Adeptness.AbstractElement2");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionsModel"


    // $ANTLR start "entryRuleAbstractElement2"
    // InternalAdeptness.g:3774:1: entryRuleAbstractElement2 returns [EObject current=null] : iv_ruleAbstractElement2= ruleAbstractElement2 EOF ;
    public final EObject entryRuleAbstractElement2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement2 = null;


        try {
            // InternalAdeptness.g:3774:57: (iv_ruleAbstractElement2= ruleAbstractElement2 EOF )
            // InternalAdeptness.g:3775:2: iv_ruleAbstractElement2= ruleAbstractElement2 EOF
            {
             newCompositeNode(grammarAccess.getAbstractElement2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement2=ruleAbstractElement2();

            state._fsp--;

             current =iv_ruleAbstractElement2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement2"


    // $ANTLR start "ruleAbstractElement2"
    // InternalAdeptness.g:3781:1: ruleAbstractElement2 returns [EObject current=null] : ( ( (lv_frontParentheses_0_0= ruleFrontParentheses ) )* ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_value_2_0= ruleDOUBLE ) ) ) ( (lv_op_3_0= ruleOperators ) )* ) ;
    public final EObject ruleAbstractElement2() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_frontParentheses_0_0 = null;

        EObject lv_value_2_0 = null;

        EObject lv_op_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:3787:2: ( ( ( (lv_frontParentheses_0_0= ruleFrontParentheses ) )* ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_value_2_0= ruleDOUBLE ) ) ) ( (lv_op_3_0= ruleOperators ) )* ) )
            // InternalAdeptness.g:3788:2: ( ( (lv_frontParentheses_0_0= ruleFrontParentheses ) )* ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_value_2_0= ruleDOUBLE ) ) ) ( (lv_op_3_0= ruleOperators ) )* )
            {
            // InternalAdeptness.g:3788:2: ( ( (lv_frontParentheses_0_0= ruleFrontParentheses ) )* ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_value_2_0= ruleDOUBLE ) ) ) ( (lv_op_3_0= ruleOperators ) )* )
            // InternalAdeptness.g:3789:3: ( (lv_frontParentheses_0_0= ruleFrontParentheses ) )* ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_value_2_0= ruleDOUBLE ) ) ) ( (lv_op_3_0= ruleOperators ) )*
            {
            // InternalAdeptness.g:3789:3: ( (lv_frontParentheses_0_0= ruleFrontParentheses ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==81) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAdeptness.g:3790:4: (lv_frontParentheses_0_0= ruleFrontParentheses )
            	    {
            	    // InternalAdeptness.g:3790:4: (lv_frontParentheses_0_0= ruleFrontParentheses )
            	    // InternalAdeptness.g:3791:5: lv_frontParentheses_0_0= ruleFrontParentheses
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractElement2Access().getFrontParenthesesFrontParenthesesParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_frontParentheses_0_0=ruleFrontParentheses();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbstractElement2Rule());
            	    					}
            	    					add(
            	    						current,
            	    						"frontParentheses",
            	    						lv_frontParentheses_0_0,
            	    						"org.xtext.example.mydsl.Adeptness.FrontParentheses");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // InternalAdeptness.g:3808:3: ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_value_2_0= ruleDOUBLE ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_INT||LA42_0==72) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalAdeptness.g:3809:4: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalAdeptness.g:3809:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalAdeptness.g:3810:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalAdeptness.g:3810:5: (lv_name_1_0= RULE_ID )
                    // InternalAdeptness.g:3811:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_54); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getAbstractElement2Access().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAbstractElement2Rule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:3828:4: ( (lv_value_2_0= ruleDOUBLE ) )
                    {
                    // InternalAdeptness.g:3828:4: ( (lv_value_2_0= ruleDOUBLE ) )
                    // InternalAdeptness.g:3829:5: (lv_value_2_0= ruleDOUBLE )
                    {
                    // InternalAdeptness.g:3829:5: (lv_value_2_0= ruleDOUBLE )
                    // InternalAdeptness.g:3830:6: lv_value_2_0= ruleDOUBLE
                    {

                    						newCompositeNode(grammarAccess.getAbstractElement2Access().getValueDOUBLEParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_value_2_0=ruleDOUBLE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAbstractElement2Rule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.xtext.example.mydsl.Adeptness.DOUBLE");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAdeptness.g:3848:3: ( (lv_op_3_0= ruleOperators ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==20) ) {
                    alt43=1;
                }
                else if ( (LA43_0==47||LA43_0==72||(LA43_0>=82 && LA43_0<=92)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalAdeptness.g:3849:4: (lv_op_3_0= ruleOperators )
            	    {
            	    // InternalAdeptness.g:3849:4: (lv_op_3_0= ruleOperators )
            	    // InternalAdeptness.g:3850:5: lv_op_3_0= ruleOperators
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractElement2Access().getOpOperatorsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_54);
            	    lv_op_3_0=ruleOperators();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbstractElement2Rule());
            	    					}
            	    					add(
            	    						current,
            	    						"op",
            	    						lv_op_3_0,
            	    						"org.xtext.example.mydsl.Adeptness.Operators");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement2"


    // $ANTLR start "entryRuleFrontParentheses"
    // InternalAdeptness.g:3871:1: entryRuleFrontParentheses returns [String current=null] : iv_ruleFrontParentheses= ruleFrontParentheses EOF ;
    public final String entryRuleFrontParentheses() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFrontParentheses = null;


        try {
            // InternalAdeptness.g:3871:56: (iv_ruleFrontParentheses= ruleFrontParentheses EOF )
            // InternalAdeptness.g:3872:2: iv_ruleFrontParentheses= ruleFrontParentheses EOF
            {
             newCompositeNode(grammarAccess.getFrontParenthesesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFrontParentheses=ruleFrontParentheses();

            state._fsp--;

             current =iv_ruleFrontParentheses.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFrontParentheses"


    // $ANTLR start "ruleFrontParentheses"
    // InternalAdeptness.g:3878:1: ruleFrontParentheses returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken ruleFrontParentheses() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdeptness.g:3884:2: (kw= '(' )
            // InternalAdeptness.g:3885:2: kw= '('
            {
            kw=(Token)match(input,81,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getFrontParenthesesAccess().getLeftParenthesisKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFrontParentheses"


    // $ANTLR start "entryRuleBackParentheses"
    // InternalAdeptness.g:3893:1: entryRuleBackParentheses returns [String current=null] : iv_ruleBackParentheses= ruleBackParentheses EOF ;
    public final String entryRuleBackParentheses() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBackParentheses = null;


        try {
            // InternalAdeptness.g:3893:55: (iv_ruleBackParentheses= ruleBackParentheses EOF )
            // InternalAdeptness.g:3894:2: iv_ruleBackParentheses= ruleBackParentheses EOF
            {
             newCompositeNode(grammarAccess.getBackParenthesesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackParentheses=ruleBackParentheses();

            state._fsp--;

             current =iv_ruleBackParentheses.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBackParentheses"


    // $ANTLR start "ruleBackParentheses"
    // InternalAdeptness.g:3900:1: ruleBackParentheses returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ')' ;
    public final AntlrDatatypeRuleToken ruleBackParentheses() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdeptness.g:3906:2: (kw= ')' )
            // InternalAdeptness.g:3907:2: kw= ')'
            {
            kw=(Token)match(input,47,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getBackParenthesesAccess().getRightParenthesisKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBackParentheses"


    // $ANTLR start "entryRuleOperators"
    // InternalAdeptness.g:3915:1: entryRuleOperators returns [EObject current=null] : iv_ruleOperators= ruleOperators EOF ;
    public final EObject entryRuleOperators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperators = null;


        try {
            // InternalAdeptness.g:3915:50: (iv_ruleOperators= ruleOperators EOF )
            // InternalAdeptness.g:3916:2: iv_ruleOperators= ruleOperators EOF
            {
             newCompositeNode(grammarAccess.getOperatorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperators=ruleOperators();

            state._fsp--;

             current =iv_ruleOperators; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperators"


    // $ANTLR start "ruleOperators"
    // InternalAdeptness.g:3922:1: ruleOperators returns [EObject current=null] : ( ( (lv_operator_0_0= ruleOp ) ) | ( (lv_comparation_1_0= ruleCompOp ) ) | ( (lv_logicOperator_2_0= ruleLogicOp ) ) | ( (lv_backParentheses_3_0= ruleBackParentheses ) ) | ( (lv_elements_4_0= ruleComas ) ) ) ;
    public final EObject ruleOperators() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_0_0 = null;

        EObject lv_comparation_1_0 = null;

        EObject lv_logicOperator_2_0 = null;

        AntlrDatatypeRuleToken lv_backParentheses_3_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:3928:2: ( ( ( (lv_operator_0_0= ruleOp ) ) | ( (lv_comparation_1_0= ruleCompOp ) ) | ( (lv_logicOperator_2_0= ruleLogicOp ) ) | ( (lv_backParentheses_3_0= ruleBackParentheses ) ) | ( (lv_elements_4_0= ruleComas ) ) ) )
            // InternalAdeptness.g:3929:2: ( ( (lv_operator_0_0= ruleOp ) ) | ( (lv_comparation_1_0= ruleCompOp ) ) | ( (lv_logicOperator_2_0= ruleLogicOp ) ) | ( (lv_backParentheses_3_0= ruleBackParentheses ) ) | ( (lv_elements_4_0= ruleComas ) ) )
            {
            // InternalAdeptness.g:3929:2: ( ( (lv_operator_0_0= ruleOp ) ) | ( (lv_comparation_1_0= ruleCompOp ) ) | ( (lv_logicOperator_2_0= ruleLogicOp ) ) | ( (lv_backParentheses_3_0= ruleBackParentheses ) ) | ( (lv_elements_4_0= ruleComas ) ) )
            int alt44=5;
            switch ( input.LA(1) ) {
            case 72:
            case 90:
            case 91:
            case 92:
                {
                alt44=1;
                }
                break;
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
                {
                alt44=2;
                }
                break;
            case 88:
            case 89:
                {
                alt44=3;
                }
                break;
            case 47:
                {
                alt44=4;
                }
                break;
            case 20:
                {
                alt44=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalAdeptness.g:3930:3: ( (lv_operator_0_0= ruleOp ) )
                    {
                    // InternalAdeptness.g:3930:3: ( (lv_operator_0_0= ruleOp ) )
                    // InternalAdeptness.g:3931:4: (lv_operator_0_0= ruleOp )
                    {
                    // InternalAdeptness.g:3931:4: (lv_operator_0_0= ruleOp )
                    // InternalAdeptness.g:3932:5: lv_operator_0_0= ruleOp
                    {

                    					newCompositeNode(grammarAccess.getOperatorsAccess().getOperatorOpParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operator_0_0=ruleOp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOperatorsRule());
                    					}
                    					set(
                    						current,
                    						"operator",
                    						lv_operator_0_0,
                    						"org.xtext.example.mydsl.Adeptness.Op");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:3950:3: ( (lv_comparation_1_0= ruleCompOp ) )
                    {
                    // InternalAdeptness.g:3950:3: ( (lv_comparation_1_0= ruleCompOp ) )
                    // InternalAdeptness.g:3951:4: (lv_comparation_1_0= ruleCompOp )
                    {
                    // InternalAdeptness.g:3951:4: (lv_comparation_1_0= ruleCompOp )
                    // InternalAdeptness.g:3952:5: lv_comparation_1_0= ruleCompOp
                    {

                    					newCompositeNode(grammarAccess.getOperatorsAccess().getComparationCompOpParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comparation_1_0=ruleCompOp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOperatorsRule());
                    					}
                    					set(
                    						current,
                    						"comparation",
                    						lv_comparation_1_0,
                    						"org.xtext.example.mydsl.Adeptness.CompOp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:3970:3: ( (lv_logicOperator_2_0= ruleLogicOp ) )
                    {
                    // InternalAdeptness.g:3970:3: ( (lv_logicOperator_2_0= ruleLogicOp ) )
                    // InternalAdeptness.g:3971:4: (lv_logicOperator_2_0= ruleLogicOp )
                    {
                    // InternalAdeptness.g:3971:4: (lv_logicOperator_2_0= ruleLogicOp )
                    // InternalAdeptness.g:3972:5: lv_logicOperator_2_0= ruleLogicOp
                    {

                    					newCompositeNode(grammarAccess.getOperatorsAccess().getLogicOperatorLogicOpParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_logicOperator_2_0=ruleLogicOp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOperatorsRule());
                    					}
                    					set(
                    						current,
                    						"logicOperator",
                    						lv_logicOperator_2_0,
                    						"org.xtext.example.mydsl.Adeptness.LogicOp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:3990:3: ( (lv_backParentheses_3_0= ruleBackParentheses ) )
                    {
                    // InternalAdeptness.g:3990:3: ( (lv_backParentheses_3_0= ruleBackParentheses ) )
                    // InternalAdeptness.g:3991:4: (lv_backParentheses_3_0= ruleBackParentheses )
                    {
                    // InternalAdeptness.g:3991:4: (lv_backParentheses_3_0= ruleBackParentheses )
                    // InternalAdeptness.g:3992:5: lv_backParentheses_3_0= ruleBackParentheses
                    {

                    					newCompositeNode(grammarAccess.getOperatorsAccess().getBackParenthesesBackParenthesesParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_backParentheses_3_0=ruleBackParentheses();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOperatorsRule());
                    					}
                    					set(
                    						current,
                    						"backParentheses",
                    						lv_backParentheses_3_0,
                    						"org.xtext.example.mydsl.Adeptness.BackParentheses");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAdeptness.g:4010:3: ( (lv_elements_4_0= ruleComas ) )
                    {
                    // InternalAdeptness.g:4010:3: ( (lv_elements_4_0= ruleComas ) )
                    // InternalAdeptness.g:4011:4: (lv_elements_4_0= ruleComas )
                    {
                    // InternalAdeptness.g:4011:4: (lv_elements_4_0= ruleComas )
                    // InternalAdeptness.g:4012:5: lv_elements_4_0= ruleComas
                    {

                    					newCompositeNode(grammarAccess.getOperatorsAccess().getElementsComasParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elements_4_0=ruleComas();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOperatorsRule());
                    					}
                    					set(
                    						current,
                    						"elements",
                    						lv_elements_4_0,
                    						"org.xtext.example.mydsl.Adeptness.Comas");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperators"


    // $ANTLR start "entryRuleComas"
    // InternalAdeptness.g:4033:1: entryRuleComas returns [EObject current=null] : iv_ruleComas= ruleComas EOF ;
    public final EObject entryRuleComas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComas = null;


        try {
            // InternalAdeptness.g:4033:46: (iv_ruleComas= ruleComas EOF )
            // InternalAdeptness.g:4034:2: iv_ruleComas= ruleComas EOF
            {
             newCompositeNode(grammarAccess.getComasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComas=ruleComas();

            state._fsp--;

             current =iv_ruleComas; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComas"


    // $ANTLR start "ruleComas"
    // InternalAdeptness.g:4040:1: ruleComas returns [EObject current=null] : ( (lv_op_0_0= ',' ) ) ;
    public final EObject ruleComas() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;


        	enterRule();

        try {
            // InternalAdeptness.g:4046:2: ( ( (lv_op_0_0= ',' ) ) )
            // InternalAdeptness.g:4047:2: ( (lv_op_0_0= ',' ) )
            {
            // InternalAdeptness.g:4047:2: ( (lv_op_0_0= ',' ) )
            // InternalAdeptness.g:4048:3: (lv_op_0_0= ',' )
            {
            // InternalAdeptness.g:4048:3: (lv_op_0_0= ',' )
            // InternalAdeptness.g:4049:4: lv_op_0_0= ','
            {
            lv_op_0_0=(Token)match(input,20,FOLLOW_2); 

            				newLeafNode(lv_op_0_0, grammarAccess.getComasAccess().getOpCommaKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getComasRule());
            				}
            				setWithLastConsumed(current, "op", lv_op_0_0, ",");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComas"


    // $ANTLR start "entryRuleCompOp"
    // InternalAdeptness.g:4064:1: entryRuleCompOp returns [EObject current=null] : iv_ruleCompOp= ruleCompOp EOF ;
    public final EObject entryRuleCompOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompOp = null;


        try {
            // InternalAdeptness.g:4064:47: (iv_ruleCompOp= ruleCompOp EOF )
            // InternalAdeptness.g:4065:2: iv_ruleCompOp= ruleCompOp EOF
            {
             newCompositeNode(grammarAccess.getCompOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompOp=ruleCompOp();

            state._fsp--;

             current =iv_ruleCompOp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompOp"


    // $ANTLR start "ruleCompOp"
    // InternalAdeptness.g:4071:1: ruleCompOp returns [EObject current=null] : ( ( (lv_op_0_1= '==' | lv_op_0_2= '!=' | lv_op_0_3= '>=' | lv_op_0_4= '<=' | lv_op_0_5= '<' | lv_op_0_6= '>' ) ) ) ;
    public final EObject ruleCompOp() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        Token lv_op_0_3=null;
        Token lv_op_0_4=null;
        Token lv_op_0_5=null;
        Token lv_op_0_6=null;


        	enterRule();

        try {
            // InternalAdeptness.g:4077:2: ( ( ( (lv_op_0_1= '==' | lv_op_0_2= '!=' | lv_op_0_3= '>=' | lv_op_0_4= '<=' | lv_op_0_5= '<' | lv_op_0_6= '>' ) ) ) )
            // InternalAdeptness.g:4078:2: ( ( (lv_op_0_1= '==' | lv_op_0_2= '!=' | lv_op_0_3= '>=' | lv_op_0_4= '<=' | lv_op_0_5= '<' | lv_op_0_6= '>' ) ) )
            {
            // InternalAdeptness.g:4078:2: ( ( (lv_op_0_1= '==' | lv_op_0_2= '!=' | lv_op_0_3= '>=' | lv_op_0_4= '<=' | lv_op_0_5= '<' | lv_op_0_6= '>' ) ) )
            // InternalAdeptness.g:4079:3: ( (lv_op_0_1= '==' | lv_op_0_2= '!=' | lv_op_0_3= '>=' | lv_op_0_4= '<=' | lv_op_0_5= '<' | lv_op_0_6= '>' ) )
            {
            // InternalAdeptness.g:4079:3: ( (lv_op_0_1= '==' | lv_op_0_2= '!=' | lv_op_0_3= '>=' | lv_op_0_4= '<=' | lv_op_0_5= '<' | lv_op_0_6= '>' ) )
            // InternalAdeptness.g:4080:4: (lv_op_0_1= '==' | lv_op_0_2= '!=' | lv_op_0_3= '>=' | lv_op_0_4= '<=' | lv_op_0_5= '<' | lv_op_0_6= '>' )
            {
            // InternalAdeptness.g:4080:4: (lv_op_0_1= '==' | lv_op_0_2= '!=' | lv_op_0_3= '>=' | lv_op_0_4= '<=' | lv_op_0_5= '<' | lv_op_0_6= '>' )
            int alt45=6;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt45=1;
                }
                break;
            case 83:
                {
                alt45=2;
                }
                break;
            case 84:
                {
                alt45=3;
                }
                break;
            case 85:
                {
                alt45=4;
                }
                break;
            case 86:
                {
                alt45=5;
                }
                break;
            case 87:
                {
                alt45=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalAdeptness.g:4081:5: lv_op_0_1= '=='
                    {
                    lv_op_0_1=(Token)match(input,82,FOLLOW_2); 

                    					newLeafNode(lv_op_0_1, grammarAccess.getCompOpAccess().getOpEqualsSignEqualsSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCompOpRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:4092:5: lv_op_0_2= '!='
                    {
                    lv_op_0_2=(Token)match(input,83,FOLLOW_2); 

                    					newLeafNode(lv_op_0_2, grammarAccess.getCompOpAccess().getOpExclamationMarkEqualsSignKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCompOpRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:4103:5: lv_op_0_3= '>='
                    {
                    lv_op_0_3=(Token)match(input,84,FOLLOW_2); 

                    					newLeafNode(lv_op_0_3, grammarAccess.getCompOpAccess().getOpGreaterThanSignEqualsSignKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCompOpRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:4114:5: lv_op_0_4= '<='
                    {
                    lv_op_0_4=(Token)match(input,85,FOLLOW_2); 

                    					newLeafNode(lv_op_0_4, grammarAccess.getCompOpAccess().getOpLessThanSignEqualsSignKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCompOpRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalAdeptness.g:4125:5: lv_op_0_5= '<'
                    {
                    lv_op_0_5=(Token)match(input,86,FOLLOW_2); 

                    					newLeafNode(lv_op_0_5, grammarAccess.getCompOpAccess().getOpLessThanSignKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCompOpRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalAdeptness.g:4136:5: lv_op_0_6= '>'
                    {
                    lv_op_0_6=(Token)match(input,87,FOLLOW_2); 

                    					newLeafNode(lv_op_0_6, grammarAccess.getCompOpAccess().getOpGreaterThanSignKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCompOpRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_6, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompOp"


    // $ANTLR start "entryRuleLogicOp"
    // InternalAdeptness.g:4152:1: entryRuleLogicOp returns [EObject current=null] : iv_ruleLogicOp= ruleLogicOp EOF ;
    public final EObject entryRuleLogicOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicOp = null;


        try {
            // InternalAdeptness.g:4152:48: (iv_ruleLogicOp= ruleLogicOp EOF )
            // InternalAdeptness.g:4153:2: iv_ruleLogicOp= ruleLogicOp EOF
            {
             newCompositeNode(grammarAccess.getLogicOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicOp=ruleLogicOp();

            state._fsp--;

             current =iv_ruleLogicOp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicOp"


    // $ANTLR start "ruleLogicOp"
    // InternalAdeptness.g:4159:1: ruleLogicOp returns [EObject current=null] : ( ( (lv_op_0_1= '&&' | lv_op_0_2= '||' ) ) ) ;
    public final EObject ruleLogicOp() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;


        	enterRule();

        try {
            // InternalAdeptness.g:4165:2: ( ( ( (lv_op_0_1= '&&' | lv_op_0_2= '||' ) ) ) )
            // InternalAdeptness.g:4166:2: ( ( (lv_op_0_1= '&&' | lv_op_0_2= '||' ) ) )
            {
            // InternalAdeptness.g:4166:2: ( ( (lv_op_0_1= '&&' | lv_op_0_2= '||' ) ) )
            // InternalAdeptness.g:4167:3: ( (lv_op_0_1= '&&' | lv_op_0_2= '||' ) )
            {
            // InternalAdeptness.g:4167:3: ( (lv_op_0_1= '&&' | lv_op_0_2= '||' ) )
            // InternalAdeptness.g:4168:4: (lv_op_0_1= '&&' | lv_op_0_2= '||' )
            {
            // InternalAdeptness.g:4168:4: (lv_op_0_1= '&&' | lv_op_0_2= '||' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==88) ) {
                alt46=1;
            }
            else if ( (LA46_0==89) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalAdeptness.g:4169:5: lv_op_0_1= '&&'
                    {
                    lv_op_0_1=(Token)match(input,88,FOLLOW_2); 

                    					newLeafNode(lv_op_0_1, grammarAccess.getLogicOpAccess().getOpAmpersandAmpersandKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicOpRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:4180:5: lv_op_0_2= '||'
                    {
                    lv_op_0_2=(Token)match(input,89,FOLLOW_2); 

                    					newLeafNode(lv_op_0_2, grammarAccess.getLogicOpAccess().getOpVerticalLineVerticalLineKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicOpRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicOp"


    // $ANTLR start "entryRuleOp"
    // InternalAdeptness.g:4196:1: entryRuleOp returns [EObject current=null] : iv_ruleOp= ruleOp EOF ;
    public final EObject entryRuleOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOp = null;


        try {
            // InternalAdeptness.g:4196:43: (iv_ruleOp= ruleOp EOF )
            // InternalAdeptness.g:4197:2: iv_ruleOp= ruleOp EOF
            {
             newCompositeNode(grammarAccess.getOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOp=ruleOp();

            state._fsp--;

             current =iv_ruleOp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOp"


    // $ANTLR start "ruleOp"
    // InternalAdeptness.g:4203:1: ruleOp returns [EObject current=null] : ( ( (lv_op_0_1= '+' | lv_op_0_2= '-' | lv_op_0_3= '*' | lv_op_0_4= '/' ) ) ) ;
    public final EObject ruleOp() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        Token lv_op_0_3=null;
        Token lv_op_0_4=null;


        	enterRule();

        try {
            // InternalAdeptness.g:4209:2: ( ( ( (lv_op_0_1= '+' | lv_op_0_2= '-' | lv_op_0_3= '*' | lv_op_0_4= '/' ) ) ) )
            // InternalAdeptness.g:4210:2: ( ( (lv_op_0_1= '+' | lv_op_0_2= '-' | lv_op_0_3= '*' | lv_op_0_4= '/' ) ) )
            {
            // InternalAdeptness.g:4210:2: ( ( (lv_op_0_1= '+' | lv_op_0_2= '-' | lv_op_0_3= '*' | lv_op_0_4= '/' ) ) )
            // InternalAdeptness.g:4211:3: ( (lv_op_0_1= '+' | lv_op_0_2= '-' | lv_op_0_3= '*' | lv_op_0_4= '/' ) )
            {
            // InternalAdeptness.g:4211:3: ( (lv_op_0_1= '+' | lv_op_0_2= '-' | lv_op_0_3= '*' | lv_op_0_4= '/' ) )
            // InternalAdeptness.g:4212:4: (lv_op_0_1= '+' | lv_op_0_2= '-' | lv_op_0_3= '*' | lv_op_0_4= '/' )
            {
            // InternalAdeptness.g:4212:4: (lv_op_0_1= '+' | lv_op_0_2= '-' | lv_op_0_3= '*' | lv_op_0_4= '/' )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt47=1;
                }
                break;
            case 72:
                {
                alt47=2;
                }
                break;
            case 91:
                {
                alt47=3;
                }
                break;
            case 92:
                {
                alt47=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalAdeptness.g:4213:5: lv_op_0_1= '+'
                    {
                    lv_op_0_1=(Token)match(input,90,FOLLOW_2); 

                    					newLeafNode(lv_op_0_1, grammarAccess.getOpAccess().getOpPlusSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOpRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:4224:5: lv_op_0_2= '-'
                    {
                    lv_op_0_2=(Token)match(input,72,FOLLOW_2); 

                    					newLeafNode(lv_op_0_2, grammarAccess.getOpAccess().getOpHyphenMinusKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOpRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:4235:5: lv_op_0_3= '*'
                    {
                    lv_op_0_3=(Token)match(input,91,FOLLOW_2); 

                    					newLeafNode(lv_op_0_3, grammarAccess.getOpAccess().getOpAsteriskKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOpRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:4246:5: lv_op_0_4= '/'
                    {
                    lv_op_0_4=(Token)match(input,92,FOLLOW_2); 

                    					newLeafNode(lv_op_0_4, grammarAccess.getOpAccess().getOpSolidusKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOpRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_4, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOp"

    // Delegated rules


    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\65\1\6\1\uffff\1\6\1\15\1\6\3\uffff\1\64";
    static final String dfa_3s = "\1\70\1\110\1\uffff\1\6\1\71\1\6\3\uffff\1\71";
    static final String dfa_4s = "\2\uffff\1\3\3\uffff\1\2\1\1\1\4\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2",
            "\1\4\101\uffff\1\3",
            "",
            "\1\4",
            "\1\5\46\uffff\1\7\1\uffff\1\10\2\uffff\1\6",
            "\1\11",
            "",
            "",
            "",
            "\1\7\1\uffff\1\10\2\uffff\1\6"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1774:3: ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004010004802L,0x0000000000006000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100050L,0x0000000000020100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008100050L,0x0000000000020100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000050L,0x0000000000020100L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000010000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000060000010000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002300000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001400000000050L,0x0000000000020100L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001400000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x7C00000000000050L,0x0000000000020101L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000032L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001E0CL});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000004010004800L,0x0000000000016000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000052L,0x0000000000020100L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000800000100002L,0x000000001FFC0100L});

}