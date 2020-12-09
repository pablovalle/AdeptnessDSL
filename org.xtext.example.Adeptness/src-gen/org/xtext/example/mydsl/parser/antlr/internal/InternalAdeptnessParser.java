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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'MONITORINGPLAN'", "':'", "'ENDMONITORINGPLAN'", "'MONITOR'", "'type'", "'max'", "'min'", "'ENDMONITOR'", "'boolean'", "'int'", "'double'", "'CPS'", "'['", "']'", "'implements'", "'ENDCPS'", "'ORACLE'", "'ENDORACLE'", "'while:'", "'when:'", "'checks:'", "'Description: '", "'fails if :'", "';'", "'confidence is below'", "'more than'", "'times within'", "'confidence is in constant degradation'", "'within'", "'should be'", "'should not be'", "'is below'", "'is above'", "'is in range between'", "'and'", "'not in range between'", "'true'", "'false'", "'-'", "'miliseconds'", "'seconds'", "'minutes'", "'hours'", "'datatype'", "'package'", "'{'", "'}'", "'='", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'*'", "'/'", "'^'", "'('", "')'", "'!'"
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

                if ( (LA1_0==11||LA1_0==14||LA1_0==25||(LA1_0>=57 && LA1_0<=58)) ) {
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
            case 58:
                {
                alt2=1;
                }
                break;
            case 14:
            case 25:
            case 57:
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
    // InternalAdeptness.g:270:1: ruleType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Signal_1= ruleSignal | this_MonitoringFile_2= ruleMonitoringFile ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Signal_1 = null;

        EObject this_MonitoringFile_2 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:276:2: ( (this_DataType_0= ruleDataType | this_Signal_1= ruleSignal | this_MonitoringFile_2= ruleMonitoringFile ) )
            // InternalAdeptness.g:277:2: (this_DataType_0= ruleDataType | this_Signal_1= ruleSignal | this_MonitoringFile_2= ruleMonitoringFile )
            {
            // InternalAdeptness.g:277:2: (this_DataType_0= ruleDataType | this_Signal_1= ruleSignal | this_MonitoringFile_2= ruleMonitoringFile )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt5=1;
                }
                break;
            case 25:
                {
                alt5=2;
                }
                break;
            case 14:
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


    // $ANTLR start "entryRuleMonitoringFile"
    // InternalAdeptness.g:308:1: entryRuleMonitoringFile returns [EObject current=null] : iv_ruleMonitoringFile= ruleMonitoringFile EOF ;
    public final EObject entryRuleMonitoringFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitoringFile = null;


        try {
            // InternalAdeptness.g:308:55: (iv_ruleMonitoringFile= ruleMonitoringFile EOF )
            // InternalAdeptness.g:309:2: iv_ruleMonitoringFile= ruleMonitoringFile EOF
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
    // InternalAdeptness.g:315:1: ruleMonitoringFile returns [EObject current=null] : (otherlv_0= 'MONITORINGPLAN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_monitoringPlan_3_0= ruleMonitoringPlan ) )+ otherlv_4= 'ENDMONITORINGPLAN' ) ;
    public final EObject ruleMonitoringFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_monitoringPlan_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:321:2: ( (otherlv_0= 'MONITORINGPLAN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_monitoringPlan_3_0= ruleMonitoringPlan ) )+ otherlv_4= 'ENDMONITORINGPLAN' ) )
            // InternalAdeptness.g:322:2: (otherlv_0= 'MONITORINGPLAN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_monitoringPlan_3_0= ruleMonitoringPlan ) )+ otherlv_4= 'ENDMONITORINGPLAN' )
            {
            // InternalAdeptness.g:322:2: (otherlv_0= 'MONITORINGPLAN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_monitoringPlan_3_0= ruleMonitoringPlan ) )+ otherlv_4= 'ENDMONITORINGPLAN' )
            // InternalAdeptness.g:323:3: otherlv_0= 'MONITORINGPLAN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_monitoringPlan_3_0= ruleMonitoringPlan ) )+ otherlv_4= 'ENDMONITORINGPLAN'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMonitoringFileAccess().getMONITORINGPLANKeyword_0());
            		
            // InternalAdeptness.g:327:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:328:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:328:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:329:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMonitoringFileAccess().getColonKeyword_2());
            		
            // InternalAdeptness.g:349:3: ( (lv_monitoringPlan_3_0= ruleMonitoringPlan ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAdeptness.g:350:4: (lv_monitoringPlan_3_0= ruleMonitoringPlan )
            	    {
            	    // InternalAdeptness.g:350:4: (lv_monitoringPlan_3_0= ruleMonitoringPlan )
            	    // InternalAdeptness.g:351:5: lv_monitoringPlan_3_0= ruleMonitoringPlan
            	    {

            	    					newCompositeNode(grammarAccess.getMonitoringFileAccess().getMonitoringPlanMonitoringPlanParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalAdeptness.g:376:1: entryRuleMonitoringPlan returns [EObject current=null] : iv_ruleMonitoringPlan= ruleMonitoringPlan EOF ;
    public final EObject entryRuleMonitoringPlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitoringPlan = null;


        try {
            // InternalAdeptness.g:376:55: (iv_ruleMonitoringPlan= ruleMonitoringPlan EOF )
            // InternalAdeptness.g:377:2: iv_ruleMonitoringPlan= ruleMonitoringPlan EOF
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
    // InternalAdeptness.g:383:1: ruleMonitoringPlan returns [EObject current=null] : ( (lv_monitoringVariables_0_0= ruleMonitoringVariable ) ) ;
    public final EObject ruleMonitoringPlan() throws RecognitionException {
        EObject current = null;

        EObject lv_monitoringVariables_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:389:2: ( ( (lv_monitoringVariables_0_0= ruleMonitoringVariable ) ) )
            // InternalAdeptness.g:390:2: ( (lv_monitoringVariables_0_0= ruleMonitoringVariable ) )
            {
            // InternalAdeptness.g:390:2: ( (lv_monitoringVariables_0_0= ruleMonitoringVariable ) )
            // InternalAdeptness.g:391:3: (lv_monitoringVariables_0_0= ruleMonitoringVariable )
            {
            // InternalAdeptness.g:391:3: (lv_monitoringVariables_0_0= ruleMonitoringVariable )
            // InternalAdeptness.g:392:4: lv_monitoringVariables_0_0= ruleMonitoringVariable
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
    // InternalAdeptness.g:412:1: entryRuleMonitoringVariable returns [EObject current=null] : iv_ruleMonitoringVariable= ruleMonitoringVariable EOF ;
    public final EObject entryRuleMonitoringVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitoringVariable = null;


        try {
            // InternalAdeptness.g:412:59: (iv_ruleMonitoringVariable= ruleMonitoringVariable EOF )
            // InternalAdeptness.g:413:2: iv_ruleMonitoringVariable= ruleMonitoringVariable EOF
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
    // InternalAdeptness.g:419:1: ruleMonitoringVariable returns [EObject current=null] : (otherlv_0= 'MONITOR' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'type' otherlv_4= ':' ( (lv_MonitoringVariableDatatype_5_0= ruleSig_type ) ) (otherlv_6= 'max' otherlv_7= ':' ( (lv_max_8_0= ruleDOUBLE ) ) otherlv_9= 'min' otherlv_10= ':' ( (lv_min_11_0= ruleDOUBLE ) ) )? otherlv_12= 'ENDMONITOR' ) ;
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
            // InternalAdeptness.g:425:2: ( (otherlv_0= 'MONITOR' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'type' otherlv_4= ':' ( (lv_MonitoringVariableDatatype_5_0= ruleSig_type ) ) (otherlv_6= 'max' otherlv_7= ':' ( (lv_max_8_0= ruleDOUBLE ) ) otherlv_9= 'min' otherlv_10= ':' ( (lv_min_11_0= ruleDOUBLE ) ) )? otherlv_12= 'ENDMONITOR' ) )
            // InternalAdeptness.g:426:2: (otherlv_0= 'MONITOR' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'type' otherlv_4= ':' ( (lv_MonitoringVariableDatatype_5_0= ruleSig_type ) ) (otherlv_6= 'max' otherlv_7= ':' ( (lv_max_8_0= ruleDOUBLE ) ) otherlv_9= 'min' otherlv_10= ':' ( (lv_min_11_0= ruleDOUBLE ) ) )? otherlv_12= 'ENDMONITOR' )
            {
            // InternalAdeptness.g:426:2: (otherlv_0= 'MONITOR' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'type' otherlv_4= ':' ( (lv_MonitoringVariableDatatype_5_0= ruleSig_type ) ) (otherlv_6= 'max' otherlv_7= ':' ( (lv_max_8_0= ruleDOUBLE ) ) otherlv_9= 'min' otherlv_10= ':' ( (lv_min_11_0= ruleDOUBLE ) ) )? otherlv_12= 'ENDMONITOR' )
            // InternalAdeptness.g:427:3: otherlv_0= 'MONITOR' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'type' otherlv_4= ':' ( (lv_MonitoringVariableDatatype_5_0= ruleSig_type ) ) (otherlv_6= 'max' otherlv_7= ':' ( (lv_max_8_0= ruleDOUBLE ) ) otherlv_9= 'min' otherlv_10= ':' ( (lv_min_11_0= ruleDOUBLE ) ) )? otherlv_12= 'ENDMONITOR'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMonitoringVariableAccess().getMONITORKeyword_0());
            		
            // InternalAdeptness.g:431:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:432:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:432:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:433:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getMonitoringVariableAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMonitoringVariableAccess().getTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getMonitoringVariableAccess().getColonKeyword_4());
            		
            // InternalAdeptness.g:461:3: ( (lv_MonitoringVariableDatatype_5_0= ruleSig_type ) )
            // InternalAdeptness.g:462:4: (lv_MonitoringVariableDatatype_5_0= ruleSig_type )
            {
            // InternalAdeptness.g:462:4: (lv_MonitoringVariableDatatype_5_0= ruleSig_type )
            // InternalAdeptness.g:463:5: lv_MonitoringVariableDatatype_5_0= ruleSig_type
            {

            					newCompositeNode(grammarAccess.getMonitoringVariableAccess().getMonitoringVariableDatatypeSig_typeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalAdeptness.g:480:3: (otherlv_6= 'max' otherlv_7= ':' ( (lv_max_8_0= ruleDOUBLE ) ) otherlv_9= 'min' otherlv_10= ':' ( (lv_min_11_0= ruleDOUBLE ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAdeptness.g:481:4: otherlv_6= 'max' otherlv_7= ':' ( (lv_max_8_0= ruleDOUBLE ) ) otherlv_9= 'min' otherlv_10= ':' ( (lv_min_11_0= ruleDOUBLE ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getMonitoringVariableAccess().getMaxKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getMonitoringVariableAccess().getColonKeyword_6_1());
                    			
                    // InternalAdeptness.g:489:4: ( (lv_max_8_0= ruleDOUBLE ) )
                    // InternalAdeptness.g:490:5: (lv_max_8_0= ruleDOUBLE )
                    {
                    // InternalAdeptness.g:490:5: (lv_max_8_0= ruleDOUBLE )
                    // InternalAdeptness.g:491:6: lv_max_8_0= ruleDOUBLE
                    {

                    						newCompositeNode(grammarAccess.getMonitoringVariableAccess().getMaxDOUBLEParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    otherlv_9=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getMonitoringVariableAccess().getMinKeyword_6_3());
                    			
                    otherlv_10=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getMonitoringVariableAccess().getColonKeyword_6_4());
                    			
                    // InternalAdeptness.g:516:4: ( (lv_min_11_0= ruleDOUBLE ) )
                    // InternalAdeptness.g:517:5: (lv_min_11_0= ruleDOUBLE )
                    {
                    // InternalAdeptness.g:517:5: (lv_min_11_0= ruleDOUBLE )
                    // InternalAdeptness.g:518:6: lv_min_11_0= ruleDOUBLE
                    {

                    						newCompositeNode(grammarAccess.getMonitoringVariableAccess().getMinDOUBLEParserRuleCall_6_5_0());
                    					
                    pushFollow(FOLLOW_15);
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

            otherlv_12=(Token)match(input,21,FOLLOW_2); 

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
    // InternalAdeptness.g:544:1: entryRuleSig_type returns [EObject current=null] : iv_ruleSig_type= ruleSig_type EOF ;
    public final EObject entryRuleSig_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSig_type = null;


        try {
            // InternalAdeptness.g:544:49: (iv_ruleSig_type= ruleSig_type EOF )
            // InternalAdeptness.g:545:2: iv_ruleSig_type= ruleSig_type EOF
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
    // InternalAdeptness.g:551:1: ruleSig_type returns [EObject current=null] : ( ( (lv_sig_type_0_0= 'boolean' ) ) | ( (lv_sig_type_1_0= 'int' ) ) | ( (lv_sig_type_2_0= 'double' ) ) ) ;
    public final EObject ruleSig_type() throws RecognitionException {
        EObject current = null;

        Token lv_sig_type_0_0=null;
        Token lv_sig_type_1_0=null;
        Token lv_sig_type_2_0=null;


        	enterRule();

        try {
            // InternalAdeptness.g:557:2: ( ( ( (lv_sig_type_0_0= 'boolean' ) ) | ( (lv_sig_type_1_0= 'int' ) ) | ( (lv_sig_type_2_0= 'double' ) ) ) )
            // InternalAdeptness.g:558:2: ( ( (lv_sig_type_0_0= 'boolean' ) ) | ( (lv_sig_type_1_0= 'int' ) ) | ( (lv_sig_type_2_0= 'double' ) ) )
            {
            // InternalAdeptness.g:558:2: ( ( (lv_sig_type_0_0= 'boolean' ) ) | ( (lv_sig_type_1_0= 'int' ) ) | ( (lv_sig_type_2_0= 'double' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalAdeptness.g:559:3: ( (lv_sig_type_0_0= 'boolean' ) )
                    {
                    // InternalAdeptness.g:559:3: ( (lv_sig_type_0_0= 'boolean' ) )
                    // InternalAdeptness.g:560:4: (lv_sig_type_0_0= 'boolean' )
                    {
                    // InternalAdeptness.g:560:4: (lv_sig_type_0_0= 'boolean' )
                    // InternalAdeptness.g:561:5: lv_sig_type_0_0= 'boolean'
                    {
                    lv_sig_type_0_0=(Token)match(input,22,FOLLOW_2); 

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
                    // InternalAdeptness.g:574:3: ( (lv_sig_type_1_0= 'int' ) )
                    {
                    // InternalAdeptness.g:574:3: ( (lv_sig_type_1_0= 'int' ) )
                    // InternalAdeptness.g:575:4: (lv_sig_type_1_0= 'int' )
                    {
                    // InternalAdeptness.g:575:4: (lv_sig_type_1_0= 'int' )
                    // InternalAdeptness.g:576:5: lv_sig_type_1_0= 'int'
                    {
                    lv_sig_type_1_0=(Token)match(input,23,FOLLOW_2); 

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
                    // InternalAdeptness.g:589:3: ( (lv_sig_type_2_0= 'double' ) )
                    {
                    // InternalAdeptness.g:589:3: ( (lv_sig_type_2_0= 'double' ) )
                    // InternalAdeptness.g:590:4: (lv_sig_type_2_0= 'double' )
                    {
                    // InternalAdeptness.g:590:4: (lv_sig_type_2_0= 'double' )
                    // InternalAdeptness.g:591:5: lv_sig_type_2_0= 'double'
                    {
                    lv_sig_type_2_0=(Token)match(input,24,FOLLOW_2); 

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
    // InternalAdeptness.g:607:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // InternalAdeptness.g:607:47: (iv_ruleSignal= ruleSignal EOF )
            // InternalAdeptness.g:608:2: iv_ruleSignal= ruleSignal EOF
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
    // InternalAdeptness.g:614:1: ruleSignal returns [EObject current=null] : (otherlv_0= 'CPS' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_cardinalityNumCPS_3_0= RULE_INT ) ) otherlv_4= ']' )? otherlv_5= ':' (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) )? ( (lv_oracle_8_0= ruleOracle ) )+ otherlv_9= 'ENDCPS' ) ;
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
            // InternalAdeptness.g:620:2: ( (otherlv_0= 'CPS' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_cardinalityNumCPS_3_0= RULE_INT ) ) otherlv_4= ']' )? otherlv_5= ':' (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) )? ( (lv_oracle_8_0= ruleOracle ) )+ otherlv_9= 'ENDCPS' ) )
            // InternalAdeptness.g:621:2: (otherlv_0= 'CPS' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_cardinalityNumCPS_3_0= RULE_INT ) ) otherlv_4= ']' )? otherlv_5= ':' (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) )? ( (lv_oracle_8_0= ruleOracle ) )+ otherlv_9= 'ENDCPS' )
            {
            // InternalAdeptness.g:621:2: (otherlv_0= 'CPS' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_cardinalityNumCPS_3_0= RULE_INT ) ) otherlv_4= ']' )? otherlv_5= ':' (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) )? ( (lv_oracle_8_0= ruleOracle ) )+ otherlv_9= 'ENDCPS' )
            // InternalAdeptness.g:622:3: otherlv_0= 'CPS' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_cardinalityNumCPS_3_0= RULE_INT ) ) otherlv_4= ']' )? otherlv_5= ':' (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) )? ( (lv_oracle_8_0= ruleOracle ) )+ otherlv_9= 'ENDCPS'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSignalAccess().getCPSKeyword_0());
            		
            // InternalAdeptness.g:626:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:627:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:627:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:628:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            // InternalAdeptness.g:644:3: (otherlv_2= '[' ( (lv_cardinalityNumCPS_3_0= RULE_INT ) ) otherlv_4= ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAdeptness.g:645:4: otherlv_2= '[' ( (lv_cardinalityNumCPS_3_0= RULE_INT ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getSignalAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalAdeptness.g:649:4: ( (lv_cardinalityNumCPS_3_0= RULE_INT ) )
                    // InternalAdeptness.g:650:5: (lv_cardinalityNumCPS_3_0= RULE_INT )
                    {
                    // InternalAdeptness.g:650:5: (lv_cardinalityNumCPS_3_0= RULE_INT )
                    // InternalAdeptness.g:651:6: lv_cardinalityNumCPS_3_0= RULE_INT
                    {
                    lv_cardinalityNumCPS_3_0=(Token)match(input,RULE_INT,FOLLOW_18); 

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

                    otherlv_4=(Token)match(input,27,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getSignalAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getSignalAccess().getColonKeyword_3());
            		
            // InternalAdeptness.g:676:3: (otherlv_6= 'implements' ( ( ruleQualifiedName ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAdeptness.g:677:4: otherlv_6= 'implements' ( ( ruleQualifiedName ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getSignalAccess().getImplementsKeyword_4_0());
                    			
                    // InternalAdeptness.g:681:4: ( ( ruleQualifiedName ) )
                    // InternalAdeptness.g:682:5: ( ruleQualifiedName )
                    {
                    // InternalAdeptness.g:682:5: ( ruleQualifiedName )
                    // InternalAdeptness.g:683:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSignalRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSignalAccess().getSuperTypeMonitoringFileCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAdeptness.g:698:3: ( (lv_oracle_8_0= ruleOracle ) )+
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
            	    // InternalAdeptness.g:699:4: (lv_oracle_8_0= ruleOracle )
            	    {
            	    // InternalAdeptness.g:699:4: (lv_oracle_8_0= ruleOracle )
            	    // InternalAdeptness.g:700:5: lv_oracle_8_0= ruleOracle
            	    {

            	    					newCompositeNode(grammarAccess.getSignalAccess().getOracleOracleParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_9=(Token)match(input,29,FOLLOW_2); 

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
    // InternalAdeptness.g:725:1: entryRuleOracle returns [EObject current=null] : iv_ruleOracle= ruleOracle EOF ;
    public final EObject entryRuleOracle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOracle = null;


        try {
            // InternalAdeptness.g:725:47: (iv_ruleOracle= ruleOracle EOF )
            // InternalAdeptness.g:726:2: iv_ruleOracle= ruleOracle EOF
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
    // InternalAdeptness.g:732:1: ruleOracle returns [EObject current=null] : (otherlv_0= 'ORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_when_3_0= ruleWhen ) ) | ( (lv_while_4_0= ruleWhile ) ) )? ( (lv_check_5_0= ruleChecks ) )+ otherlv_6= 'ENDORACLE' ) ;
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
            // InternalAdeptness.g:738:2: ( (otherlv_0= 'ORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_when_3_0= ruleWhen ) ) | ( (lv_while_4_0= ruleWhile ) ) )? ( (lv_check_5_0= ruleChecks ) )+ otherlv_6= 'ENDORACLE' ) )
            // InternalAdeptness.g:739:2: (otherlv_0= 'ORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_when_3_0= ruleWhen ) ) | ( (lv_while_4_0= ruleWhile ) ) )? ( (lv_check_5_0= ruleChecks ) )+ otherlv_6= 'ENDORACLE' )
            {
            // InternalAdeptness.g:739:2: (otherlv_0= 'ORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_when_3_0= ruleWhen ) ) | ( (lv_while_4_0= ruleWhile ) ) )? ( (lv_check_5_0= ruleChecks ) )+ otherlv_6= 'ENDORACLE' )
            // InternalAdeptness.g:740:3: otherlv_0= 'ORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_when_3_0= ruleWhen ) ) | ( (lv_while_4_0= ruleWhile ) ) )? ( (lv_check_5_0= ruleChecks ) )+ otherlv_6= 'ENDORACLE'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOracleAccess().getORACLEKeyword_0());
            		
            // InternalAdeptness.g:744:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:745:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:745:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:746:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getOracleAccess().getColonKeyword_2());
            		
            // InternalAdeptness.g:766:3: ( ( (lv_when_3_0= ruleWhen ) ) | ( (lv_while_4_0= ruleWhile ) ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            else if ( (LA12_0==32) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // InternalAdeptness.g:767:4: ( (lv_when_3_0= ruleWhen ) )
                    {
                    // InternalAdeptness.g:767:4: ( (lv_when_3_0= ruleWhen ) )
                    // InternalAdeptness.g:768:5: (lv_when_3_0= ruleWhen )
                    {
                    // InternalAdeptness.g:768:5: (lv_when_3_0= ruleWhen )
                    // InternalAdeptness.g:769:6: lv_when_3_0= ruleWhen
                    {

                    						newCompositeNode(grammarAccess.getOracleAccess().getWhenWhenParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_when_3_0=ruleWhen();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOracleRule());
                    						}
                    						add(
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
                    // InternalAdeptness.g:787:4: ( (lv_while_4_0= ruleWhile ) )
                    {
                    // InternalAdeptness.g:787:4: ( (lv_while_4_0= ruleWhile ) )
                    // InternalAdeptness.g:788:5: (lv_while_4_0= ruleWhile )
                    {
                    // InternalAdeptness.g:788:5: (lv_while_4_0= ruleWhile )
                    // InternalAdeptness.g:789:6: lv_while_4_0= ruleWhile
                    {

                    						newCompositeNode(grammarAccess.getOracleAccess().getWhileWhileParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_while_4_0=ruleWhile();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOracleRule());
                    						}
                    						add(
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

            // InternalAdeptness.g:807:3: ( (lv_check_5_0= ruleChecks ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAdeptness.g:808:4: (lv_check_5_0= ruleChecks )
            	    {
            	    // InternalAdeptness.g:808:4: (lv_check_5_0= ruleChecks )
            	    // InternalAdeptness.g:809:5: lv_check_5_0= ruleChecks
            	    {

            	    					newCompositeNode(grammarAccess.getOracleAccess().getCheckChecksParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_check_5_0=ruleChecks();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOracleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"check",
            	    						lv_check_5_0,
            	    						"org.xtext.example.mydsl.Adeptness.Checks");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_6=(Token)match(input,31,FOLLOW_2); 

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
    // InternalAdeptness.g:834:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalAdeptness.g:834:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalAdeptness.g:835:2: iv_ruleWhile= ruleWhile EOF
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
    // InternalAdeptness.g:841:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while:' ( (lv_em_1_0= ruleExpressionsModel ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_em_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:847:2: ( (otherlv_0= 'while:' ( (lv_em_1_0= ruleExpressionsModel ) ) ) )
            // InternalAdeptness.g:848:2: (otherlv_0= 'while:' ( (lv_em_1_0= ruleExpressionsModel ) ) )
            {
            // InternalAdeptness.g:848:2: (otherlv_0= 'while:' ( (lv_em_1_0= ruleExpressionsModel ) ) )
            // InternalAdeptness.g:849:3: otherlv_0= 'while:' ( (lv_em_1_0= ruleExpressionsModel ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
            		
            // InternalAdeptness.g:853:3: ( (lv_em_1_0= ruleExpressionsModel ) )
            // InternalAdeptness.g:854:4: (lv_em_1_0= ruleExpressionsModel )
            {
            // InternalAdeptness.g:854:4: (lv_em_1_0= ruleExpressionsModel )
            // InternalAdeptness.g:855:5: lv_em_1_0= ruleExpressionsModel
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
    // InternalAdeptness.g:876:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalAdeptness.g:876:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalAdeptness.g:877:2: iv_ruleWhen= ruleWhen EOF
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
    // InternalAdeptness.g:883:1: ruleWhen returns [EObject current=null] : (otherlv_0= 'when:' ( (lv_em_1_0= ruleExpressionsModel ) ) ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_em_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:889:2: ( (otherlv_0= 'when:' ( (lv_em_1_0= ruleExpressionsModel ) ) ) )
            // InternalAdeptness.g:890:2: (otherlv_0= 'when:' ( (lv_em_1_0= ruleExpressionsModel ) ) )
            {
            // InternalAdeptness.g:890:2: (otherlv_0= 'when:' ( (lv_em_1_0= ruleExpressionsModel ) ) )
            // InternalAdeptness.g:891:3: otherlv_0= 'when:' ( (lv_em_1_0= ruleExpressionsModel ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getWhenAccess().getWhenKeyword_0());
            		
            // InternalAdeptness.g:895:3: ( (lv_em_1_0= ruleExpressionsModel ) )
            // InternalAdeptness.g:896:4: (lv_em_1_0= ruleExpressionsModel )
            {
            // InternalAdeptness.g:896:4: (lv_em_1_0= ruleExpressionsModel )
            // InternalAdeptness.g:897:5: lv_em_1_0= ruleExpressionsModel
            {

            					newCompositeNode(grammarAccess.getWhenAccess().getEmExpressionsModelParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleChecks"
    // InternalAdeptness.g:918:1: entryRuleChecks returns [EObject current=null] : iv_ruleChecks= ruleChecks EOF ;
    public final EObject entryRuleChecks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChecks = null;


        try {
            // InternalAdeptness.g:918:47: (iv_ruleChecks= ruleChecks EOF )
            // InternalAdeptness.g:919:2: iv_ruleChecks= ruleChecks EOF
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
    // InternalAdeptness.g:925:1: ruleChecks returns [EObject current=null] : (otherlv_0= 'checks:' ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) ) ( (lv_reference_3_0= ruleReference ) ) ( (lv_failReason_4_0= ruleFailReason ) )+ ( (lv_description_5_0= ruleDescription ) ) ) ;
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
            // InternalAdeptness.g:931:2: ( (otherlv_0= 'checks:' ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) ) ( (lv_reference_3_0= ruleReference ) ) ( (lv_failReason_4_0= ruleFailReason ) )+ ( (lv_description_5_0= ruleDescription ) ) ) )
            // InternalAdeptness.g:932:2: (otherlv_0= 'checks:' ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) ) ( (lv_reference_3_0= ruleReference ) ) ( (lv_failReason_4_0= ruleFailReason ) )+ ( (lv_description_5_0= ruleDescription ) ) )
            {
            // InternalAdeptness.g:932:2: (otherlv_0= 'checks:' ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) ) ( (lv_reference_3_0= ruleReference ) ) ( (lv_failReason_4_0= ruleFailReason ) )+ ( (lv_description_5_0= ruleDescription ) ) )
            // InternalAdeptness.g:933:3: otherlv_0= 'checks:' ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) ) ( (lv_reference_3_0= ruleReference ) ) ( (lv_failReason_4_0= ruleFailReason ) )+ ( (lv_description_5_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getChecksAccess().getChecksKeyword_0());
            		
            // InternalAdeptness.g:937:3: ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_INT && LA14_0<=RULE_STRING)||(LA14_0>=43 && LA14_0<=47)||(LA14_0>=49 && LA14_0<=51)||LA14_0==74||LA14_0==76) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAdeptness.g:938:4: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalAdeptness.g:938:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalAdeptness.g:939:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalAdeptness.g:939:5: (lv_name_1_0= RULE_ID )
                    // InternalAdeptness.g:940:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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
                    // InternalAdeptness.g:957:4: ( (lv_em_2_0= ruleExpressionsModel ) )
                    {
                    // InternalAdeptness.g:957:4: ( (lv_em_2_0= ruleExpressionsModel ) )
                    // InternalAdeptness.g:958:5: (lv_em_2_0= ruleExpressionsModel )
                    {
                    // InternalAdeptness.g:958:5: (lv_em_2_0= ruleExpressionsModel )
                    // InternalAdeptness.g:959:6: lv_em_2_0= ruleExpressionsModel
                    {

                    						newCompositeNode(grammarAccess.getChecksAccess().getEmExpressionsModelParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_24);
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

            // InternalAdeptness.g:977:3: ( (lv_reference_3_0= ruleReference ) )
            // InternalAdeptness.g:978:4: (lv_reference_3_0= ruleReference )
            {
            // InternalAdeptness.g:978:4: (lv_reference_3_0= ruleReference )
            // InternalAdeptness.g:979:5: lv_reference_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getChecksAccess().getReferenceReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalAdeptness.g:996:3: ( (lv_failReason_4_0= ruleFailReason ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==36) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAdeptness.g:997:4: (lv_failReason_4_0= ruleFailReason )
            	    {
            	    // InternalAdeptness.g:997:4: (lv_failReason_4_0= ruleFailReason )
            	    // InternalAdeptness.g:998:5: lv_failReason_4_0= ruleFailReason
            	    {

            	    					newCompositeNode(grammarAccess.getChecksAccess().getFailReasonFailReasonParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_26);
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            // InternalAdeptness.g:1015:3: ( (lv_description_5_0= ruleDescription ) )
            // InternalAdeptness.g:1016:4: (lv_description_5_0= ruleDescription )
            {
            // InternalAdeptness.g:1016:4: (lv_description_5_0= ruleDescription )
            // InternalAdeptness.g:1017:5: lv_description_5_0= ruleDescription
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
    // InternalAdeptness.g:1038:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalAdeptness.g:1038:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalAdeptness.g:1039:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalAdeptness.g:1045:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalAdeptness.g:1051:2: ( (otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalAdeptness.g:1052:2: (otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalAdeptness.g:1052:2: (otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalAdeptness.g:1053:3: otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            // InternalAdeptness.g:1057:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalAdeptness.g:1058:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalAdeptness.g:1058:4: (lv_value_1_0= RULE_STRING )
            // InternalAdeptness.g:1059:5: lv_value_1_0= RULE_STRING
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
    // InternalAdeptness.g:1079:1: entryRuleFailReason returns [EObject current=null] : iv_ruleFailReason= ruleFailReason EOF ;
    public final EObject entryRuleFailReason() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFailReason = null;


        try {
            // InternalAdeptness.g:1079:51: (iv_ruleFailReason= ruleFailReason EOF )
            // InternalAdeptness.g:1080:2: iv_ruleFailReason= ruleFailReason EOF
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
    // InternalAdeptness.g:1086:1: ruleFailReason returns [EObject current=null] : (otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) ) ) ;
    public final EObject ruleFailReason() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_reason_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1092:2: ( (otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) ) ) )
            // InternalAdeptness.g:1093:2: (otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) ) )
            {
            // InternalAdeptness.g:1093:2: (otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) ) )
            // InternalAdeptness.g:1094:3: otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getFailReasonAccess().getFailsIfKeyword_0());
            		
            // InternalAdeptness.g:1098:3: ( (lv_reason_1_0= ruleReason ) )
            // InternalAdeptness.g:1099:4: (lv_reason_1_0= ruleReason )
            {
            // InternalAdeptness.g:1099:4: (lv_reason_1_0= ruleReason )
            // InternalAdeptness.g:1100:5: lv_reason_1_0= ruleReason
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
    // InternalAdeptness.g:1121:1: entryRuleReason returns [EObject current=null] : iv_ruleReason= ruleReason EOF ;
    public final EObject entryRuleReason() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReason = null;


        try {
            // InternalAdeptness.g:1121:47: (iv_ruleReason= ruleReason EOF )
            // InternalAdeptness.g:1122:2: iv_ruleReason= ruleReason EOF
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
    // InternalAdeptness.g:1128:1: ruleReason returns [EObject current=null] : ( ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleReason() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_highPeak_0_0 = null;

        EObject lv_highTime_1_0 = null;

        EObject lv_constDeg_2_0 = null;

        EObject lv_xPeaks_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1134:2: ( ( ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';' ) )
            // InternalAdeptness.g:1135:2: ( ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';' )
            {
            // InternalAdeptness.g:1135:2: ( ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';' )
            // InternalAdeptness.g:1136:3: ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';'
            {
            // InternalAdeptness.g:1136:3: ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) )
            int alt16=4;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalAdeptness.g:1137:4: ( (lv_highPeak_0_0= ruleHighPeak ) )
                    {
                    // InternalAdeptness.g:1137:4: ( (lv_highPeak_0_0= ruleHighPeak ) )
                    // InternalAdeptness.g:1138:5: (lv_highPeak_0_0= ruleHighPeak )
                    {
                    // InternalAdeptness.g:1138:5: (lv_highPeak_0_0= ruleHighPeak )
                    // InternalAdeptness.g:1139:6: lv_highPeak_0_0= ruleHighPeak
                    {

                    						newCompositeNode(grammarAccess.getReasonAccess().getHighPeakHighPeakParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalAdeptness.g:1157:4: ( (lv_highTime_1_0= ruleHighTime ) )
                    {
                    // InternalAdeptness.g:1157:4: ( (lv_highTime_1_0= ruleHighTime ) )
                    // InternalAdeptness.g:1158:5: (lv_highTime_1_0= ruleHighTime )
                    {
                    // InternalAdeptness.g:1158:5: (lv_highTime_1_0= ruleHighTime )
                    // InternalAdeptness.g:1159:6: lv_highTime_1_0= ruleHighTime
                    {

                    						newCompositeNode(grammarAccess.getReasonAccess().getHighTimeHighTimeParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalAdeptness.g:1177:4: ( (lv_constDeg_2_0= ruleConstDeg ) )
                    {
                    // InternalAdeptness.g:1177:4: ( (lv_constDeg_2_0= ruleConstDeg ) )
                    // InternalAdeptness.g:1178:5: (lv_constDeg_2_0= ruleConstDeg )
                    {
                    // InternalAdeptness.g:1178:5: (lv_constDeg_2_0= ruleConstDeg )
                    // InternalAdeptness.g:1179:6: lv_constDeg_2_0= ruleConstDeg
                    {

                    						newCompositeNode(grammarAccess.getReasonAccess().getConstDegConstDegParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalAdeptness.g:1197:4: ( (lv_xPeaks_3_0= ruleXPeaks ) )
                    {
                    // InternalAdeptness.g:1197:4: ( (lv_xPeaks_3_0= ruleXPeaks ) )
                    // InternalAdeptness.g:1198:5: (lv_xPeaks_3_0= ruleXPeaks )
                    {
                    // InternalAdeptness.g:1198:5: (lv_xPeaks_3_0= ruleXPeaks )
                    // InternalAdeptness.g:1199:6: lv_xPeaks_3_0= ruleXPeaks
                    {

                    						newCompositeNode(grammarAccess.getReasonAccess().getXPeaksXPeaksParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_29);
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

            otherlv_4=(Token)match(input,37,FOLLOW_2); 

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
    // InternalAdeptness.g:1225:1: entryRuleXPeaks returns [EObject current=null] : iv_ruleXPeaks= ruleXPeaks EOF ;
    public final EObject entryRuleXPeaks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPeaks = null;


        try {
            // InternalAdeptness.g:1225:47: (iv_ruleXPeaks= ruleXPeaks EOF )
            // InternalAdeptness.g:1226:2: iv_ruleXPeaks= ruleXPeaks EOF
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
    // InternalAdeptness.g:1232:1: ruleXPeaks returns [EObject current=null] : (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= ruleDOUBLE ) ) ( (lv_unit_6_0= ruleTimeType ) ) ) ;
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
            // InternalAdeptness.g:1238:2: ( (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= ruleDOUBLE ) ) ( (lv_unit_6_0= ruleTimeType ) ) ) )
            // InternalAdeptness.g:1239:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= ruleDOUBLE ) ) ( (lv_unit_6_0= ruleTimeType ) ) )
            {
            // InternalAdeptness.g:1239:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= ruleDOUBLE ) ) ( (lv_unit_6_0= ruleTimeType ) ) )
            // InternalAdeptness.g:1240:3: otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= ruleDOUBLE ) ) ( (lv_unit_6_0= ruleTimeType ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getXPeaksAccess().getConfidenceIsBelowKeyword_0());
            		
            // InternalAdeptness.g:1244:3: ( (lv_cant_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1245:4: (lv_cant_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1245:4: (lv_cant_1_0= ruleDOUBLE )
            // InternalAdeptness.g:1246:5: lv_cant_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getXPeaksAccess().getCantDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_2=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getXPeaksAccess().getMoreThanKeyword_2());
            		
            // InternalAdeptness.g:1267:3: ( (lv_nPeaks_3_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1268:4: (lv_nPeaks_3_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1268:4: (lv_nPeaks_3_0= ruleDOUBLE )
            // InternalAdeptness.g:1269:5: lv_nPeaks_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getXPeaksAccess().getNPeaksDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_4=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getXPeaksAccess().getTimesWithinKeyword_4());
            		
            // InternalAdeptness.g:1290:3: ( (lv_time_5_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1291:4: (lv_time_5_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1291:4: (lv_time_5_0= ruleDOUBLE )
            // InternalAdeptness.g:1292:5: lv_time_5_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getXPeaksAccess().getTimeDOUBLEParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalAdeptness.g:1309:3: ( (lv_unit_6_0= ruleTimeType ) )
            // InternalAdeptness.g:1310:4: (lv_unit_6_0= ruleTimeType )
            {
            // InternalAdeptness.g:1310:4: (lv_unit_6_0= ruleTimeType )
            // InternalAdeptness.g:1311:5: lv_unit_6_0= ruleTimeType
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
    // InternalAdeptness.g:1332:1: entryRuleConstDeg returns [EObject current=null] : iv_ruleConstDeg= ruleConstDeg EOF ;
    public final EObject entryRuleConstDeg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstDeg = null;


        try {
            // InternalAdeptness.g:1332:49: (iv_ruleConstDeg= ruleConstDeg EOF )
            // InternalAdeptness.g:1333:2: iv_ruleConstDeg= ruleConstDeg EOF
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
    // InternalAdeptness.g:1339:1: ruleConstDeg returns [EObject current=null] : (otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleConstDeg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cant_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1345:2: ( (otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) ) ) )
            // InternalAdeptness.g:1346:2: (otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) ) )
            {
            // InternalAdeptness.g:1346:2: (otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) ) )
            // InternalAdeptness.g:1347:3: otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getConstDegAccess().getConfidenceIsInConstantDegradationKeyword_0());
            		
            // InternalAdeptness.g:1351:3: ( (lv_cant_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1352:4: (lv_cant_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1352:4: (lv_cant_1_0= ruleDOUBLE )
            // InternalAdeptness.g:1353:5: lv_cant_1_0= ruleDOUBLE
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
    // InternalAdeptness.g:1374:1: entryRuleHighTime returns [EObject current=null] : iv_ruleHighTime= ruleHighTime EOF ;
    public final EObject entryRuleHighTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighTime = null;


        try {
            // InternalAdeptness.g:1374:49: (iv_ruleHighTime= ruleHighTime EOF )
            // InternalAdeptness.g:1375:2: iv_ruleHighTime= ruleHighTime EOF
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
    // InternalAdeptness.g:1381:1: ruleHighTime returns [EObject current=null] : (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) ) ) ;
    public final EObject ruleHighTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_cant_1_0 = null;

        EObject lv_time_3_0 = null;

        EObject lv_unit_4_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1387:2: ( (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) ) ) )
            // InternalAdeptness.g:1388:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) ) )
            {
            // InternalAdeptness.g:1388:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) ) )
            // InternalAdeptness.g:1389:3: otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getHighTimeAccess().getConfidenceIsBelowKeyword_0());
            		
            // InternalAdeptness.g:1393:3: ( (lv_cant_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1394:4: (lv_cant_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1394:4: (lv_cant_1_0= ruleDOUBLE )
            // InternalAdeptness.g:1395:5: lv_cant_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getHighTimeAccess().getCantDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
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

            otherlv_2=(Token)match(input,42,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getHighTimeAccess().getWithinKeyword_2());
            		
            // InternalAdeptness.g:1416:3: ( (lv_time_3_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1417:4: (lv_time_3_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1417:4: (lv_time_3_0= ruleDOUBLE )
            // InternalAdeptness.g:1418:5: lv_time_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getHighTimeAccess().getTimeDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalAdeptness.g:1435:3: ( (lv_unit_4_0= ruleTimeType ) )
            // InternalAdeptness.g:1436:4: (lv_unit_4_0= ruleTimeType )
            {
            // InternalAdeptness.g:1436:4: (lv_unit_4_0= ruleTimeType )
            // InternalAdeptness.g:1437:5: lv_unit_4_0= ruleTimeType
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
    // InternalAdeptness.g:1458:1: entryRuleHighPeak returns [EObject current=null] : iv_ruleHighPeak= ruleHighPeak EOF ;
    public final EObject entryRuleHighPeak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighPeak = null;


        try {
            // InternalAdeptness.g:1458:49: (iv_ruleHighPeak= ruleHighPeak EOF )
            // InternalAdeptness.g:1459:2: iv_ruleHighPeak= ruleHighPeak EOF
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
    // InternalAdeptness.g:1465:1: ruleHighPeak returns [EObject current=null] : (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleHighPeak() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cant_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1471:2: ( (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) ) )
            // InternalAdeptness.g:1472:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) )
            {
            // InternalAdeptness.g:1472:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) )
            // InternalAdeptness.g:1473:3: otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getHighPeakAccess().getConfidenceIsBelowKeyword_0());
            		
            // InternalAdeptness.g:1477:3: ( (lv_cant_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1478:4: (lv_cant_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1478:4: (lv_cant_1_0= ruleDOUBLE )
            // InternalAdeptness.g:1479:5: lv_cant_1_0= ruleDOUBLE
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
    // InternalAdeptness.g:1500:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalAdeptness.g:1500:50: (iv_ruleReference= ruleReference EOF )
            // InternalAdeptness.g:1501:2: iv_ruleReference= ruleReference EOF
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
    // InternalAdeptness.g:1507:1: ruleReference returns [EObject current=null] : ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) | ( (lv_same_4_0= ruleSame ) ) | ( (lv_notsame_5_0= ruleNotSame ) ) ) otherlv_6= ';' ) ;
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
            // InternalAdeptness.g:1513:2: ( ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) | ( (lv_same_4_0= ruleSame ) ) | ( (lv_notsame_5_0= ruleNotSame ) ) ) otherlv_6= ';' ) )
            // InternalAdeptness.g:1514:2: ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) | ( (lv_same_4_0= ruleSame ) ) | ( (lv_notsame_5_0= ruleNotSame ) ) ) otherlv_6= ';' )
            {
            // InternalAdeptness.g:1514:2: ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) | ( (lv_same_4_0= ruleSame ) ) | ( (lv_notsame_5_0= ruleNotSame ) ) ) otherlv_6= ';' )
            // InternalAdeptness.g:1515:3: ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) | ( (lv_same_4_0= ruleSame ) ) | ( (lv_notsame_5_0= ruleNotSame ) ) ) otherlv_6= ';'
            {
            // InternalAdeptness.g:1515:3: ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) | ( (lv_same_4_0= ruleSame ) ) | ( (lv_notsame_5_0= ruleNotSame ) ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt17=1;
                }
                break;
            case 46:
                {
                alt17=2;
                }
                break;
            case 47:
                {
                alt17=3;
                }
                break;
            case 49:
                {
                alt17=4;
                }
                break;
            case 43:
                {
                alt17=5;
                }
                break;
            case 44:
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
                    // InternalAdeptness.g:1516:4: ( (lv_upper_0_0= ruleUpper ) )
                    {
                    // InternalAdeptness.g:1516:4: ( (lv_upper_0_0= ruleUpper ) )
                    // InternalAdeptness.g:1517:5: (lv_upper_0_0= ruleUpper )
                    {
                    // InternalAdeptness.g:1517:5: (lv_upper_0_0= ruleUpper )
                    // InternalAdeptness.g:1518:6: lv_upper_0_0= ruleUpper
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getUpperUpperParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalAdeptness.g:1536:4: ( (lv_lower_1_0= ruleLower ) )
                    {
                    // InternalAdeptness.g:1536:4: ( (lv_lower_1_0= ruleLower ) )
                    // InternalAdeptness.g:1537:5: (lv_lower_1_0= ruleLower )
                    {
                    // InternalAdeptness.g:1537:5: (lv_lower_1_0= ruleLower )
                    // InternalAdeptness.g:1538:6: lv_lower_1_0= ruleLower
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getLowerLowerParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalAdeptness.g:1556:4: ( (lv_range_2_0= ruleRange ) )
                    {
                    // InternalAdeptness.g:1556:4: ( (lv_range_2_0= ruleRange ) )
                    // InternalAdeptness.g:1557:5: (lv_range_2_0= ruleRange )
                    {
                    // InternalAdeptness.g:1557:5: (lv_range_2_0= ruleRange )
                    // InternalAdeptness.g:1558:6: lv_range_2_0= ruleRange
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getRangeRangeParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalAdeptness.g:1576:4: ( (lv_gap_3_0= ruleGap ) )
                    {
                    // InternalAdeptness.g:1576:4: ( (lv_gap_3_0= ruleGap ) )
                    // InternalAdeptness.g:1577:5: (lv_gap_3_0= ruleGap )
                    {
                    // InternalAdeptness.g:1577:5: (lv_gap_3_0= ruleGap )
                    // InternalAdeptness.g:1578:6: lv_gap_3_0= ruleGap
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getGapGapParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalAdeptness.g:1596:4: ( (lv_same_4_0= ruleSame ) )
                    {
                    // InternalAdeptness.g:1596:4: ( (lv_same_4_0= ruleSame ) )
                    // InternalAdeptness.g:1597:5: (lv_same_4_0= ruleSame )
                    {
                    // InternalAdeptness.g:1597:5: (lv_same_4_0= ruleSame )
                    // InternalAdeptness.g:1598:6: lv_same_4_0= ruleSame
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getSameSameParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalAdeptness.g:1616:4: ( (lv_notsame_5_0= ruleNotSame ) )
                    {
                    // InternalAdeptness.g:1616:4: ( (lv_notsame_5_0= ruleNotSame ) )
                    // InternalAdeptness.g:1617:5: (lv_notsame_5_0= ruleNotSame )
                    {
                    // InternalAdeptness.g:1617:5: (lv_notsame_5_0= ruleNotSame )
                    // InternalAdeptness.g:1618:6: lv_notsame_5_0= ruleNotSame
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getNotsameNotSameParserRuleCall_0_5_0());
                    					
                    pushFollow(FOLLOW_29);
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

            otherlv_6=(Token)match(input,37,FOLLOW_2); 

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
    // InternalAdeptness.g:1644:1: entryRuleSame returns [EObject current=null] : iv_ruleSame= ruleSame EOF ;
    public final EObject entryRuleSame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSame = null;


        try {
            // InternalAdeptness.g:1644:45: (iv_ruleSame= ruleSame EOF )
            // InternalAdeptness.g:1645:2: iv_ruleSame= ruleSame EOF
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
    // InternalAdeptness.g:1651:1: ruleSame returns [EObject current=null] : (otherlv_0= 'should be' ( (lv_bound_upp_1_0= ruleBound_up ) ) ) ;
    public final EObject ruleSame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bound_upp_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1657:2: ( (otherlv_0= 'should be' ( (lv_bound_upp_1_0= ruleBound_up ) ) ) )
            // InternalAdeptness.g:1658:2: (otherlv_0= 'should be' ( (lv_bound_upp_1_0= ruleBound_up ) ) )
            {
            // InternalAdeptness.g:1658:2: (otherlv_0= 'should be' ( (lv_bound_upp_1_0= ruleBound_up ) ) )
            // InternalAdeptness.g:1659:3: otherlv_0= 'should be' ( (lv_bound_upp_1_0= ruleBound_up ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getSameAccess().getShouldBeKeyword_0());
            		
            // InternalAdeptness.g:1663:3: ( (lv_bound_upp_1_0= ruleBound_up ) )
            // InternalAdeptness.g:1664:4: (lv_bound_upp_1_0= ruleBound_up )
            {
            // InternalAdeptness.g:1664:4: (lv_bound_upp_1_0= ruleBound_up )
            // InternalAdeptness.g:1665:5: lv_bound_upp_1_0= ruleBound_up
            {

            					newCompositeNode(grammarAccess.getSameAccess().getBound_uppBound_upParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalAdeptness.g:1686:1: entryRuleNotSame returns [EObject current=null] : iv_ruleNotSame= ruleNotSame EOF ;
    public final EObject entryRuleNotSame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotSame = null;


        try {
            // InternalAdeptness.g:1686:48: (iv_ruleNotSame= ruleNotSame EOF )
            // InternalAdeptness.g:1687:2: iv_ruleNotSame= ruleNotSame EOF
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
    // InternalAdeptness.g:1693:1: ruleNotSame returns [EObject current=null] : (otherlv_0= 'should not be' ( (lv_bound_upp_1_0= ruleBound_up ) ) ) ;
    public final EObject ruleNotSame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bound_upp_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1699:2: ( (otherlv_0= 'should not be' ( (lv_bound_upp_1_0= ruleBound_up ) ) ) )
            // InternalAdeptness.g:1700:2: (otherlv_0= 'should not be' ( (lv_bound_upp_1_0= ruleBound_up ) ) )
            {
            // InternalAdeptness.g:1700:2: (otherlv_0= 'should not be' ( (lv_bound_upp_1_0= ruleBound_up ) ) )
            // InternalAdeptness.g:1701:3: otherlv_0= 'should not be' ( (lv_bound_upp_1_0= ruleBound_up ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getNotSameAccess().getShouldNotBeKeyword_0());
            		
            // InternalAdeptness.g:1705:3: ( (lv_bound_upp_1_0= ruleBound_up ) )
            // InternalAdeptness.g:1706:4: (lv_bound_upp_1_0= ruleBound_up )
            {
            // InternalAdeptness.g:1706:4: (lv_bound_upp_1_0= ruleBound_up )
            // InternalAdeptness.g:1707:5: lv_bound_upp_1_0= ruleBound_up
            {

            					newCompositeNode(grammarAccess.getNotSameAccess().getBound_uppBound_upParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalAdeptness.g:1728:1: entryRuleUpper returns [EObject current=null] : iv_ruleUpper= ruleUpper EOF ;
    public final EObject entryRuleUpper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpper = null;


        try {
            // InternalAdeptness.g:1728:46: (iv_ruleUpper= ruleUpper EOF )
            // InternalAdeptness.g:1729:2: iv_ruleUpper= ruleUpper EOF
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
    // InternalAdeptness.g:1735:1: ruleUpper returns [EObject current=null] : (otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) ) ) ;
    public final EObject ruleUpper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bound_upp_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1741:2: ( (otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) ) ) )
            // InternalAdeptness.g:1742:2: (otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) ) )
            {
            // InternalAdeptness.g:1742:2: (otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) ) )
            // InternalAdeptness.g:1743:3: otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getUpperAccess().getIsBelowKeyword_0());
            		
            // InternalAdeptness.g:1747:3: ( (lv_bound_upp_1_0= ruleBound_up ) )
            // InternalAdeptness.g:1748:4: (lv_bound_upp_1_0= ruleBound_up )
            {
            // InternalAdeptness.g:1748:4: (lv_bound_upp_1_0= ruleBound_up )
            // InternalAdeptness.g:1749:5: lv_bound_upp_1_0= ruleBound_up
            {

            					newCompositeNode(grammarAccess.getUpperAccess().getBound_uppBound_upParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalAdeptness.g:1770:1: entryRuleLower returns [EObject current=null] : iv_ruleLower= ruleLower EOF ;
    public final EObject entryRuleLower() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLower = null;


        try {
            // InternalAdeptness.g:1770:46: (iv_ruleLower= ruleLower EOF )
            // InternalAdeptness.g:1771:2: iv_ruleLower= ruleLower EOF
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
    // InternalAdeptness.g:1777:1: ruleLower returns [EObject current=null] : (otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) ) ) ;
    public final EObject ruleLower() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bound_lower_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1783:2: ( (otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) ) ) )
            // InternalAdeptness.g:1784:2: (otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) ) )
            {
            // InternalAdeptness.g:1784:2: (otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) ) )
            // InternalAdeptness.g:1785:3: otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getLowerAccess().getIsAboveKeyword_0());
            		
            // InternalAdeptness.g:1789:3: ( (lv_bound_lower_1_0= ruleBound_Down ) )
            // InternalAdeptness.g:1790:4: (lv_bound_lower_1_0= ruleBound_Down )
            {
            // InternalAdeptness.g:1790:4: (lv_bound_lower_1_0= ruleBound_Down )
            // InternalAdeptness.g:1791:5: lv_bound_lower_1_0= ruleBound_Down
            {

            					newCompositeNode(grammarAccess.getLowerAccess().getBound_lowerBound_DownParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalAdeptness.g:1812:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalAdeptness.g:1812:46: (iv_ruleRange= ruleRange EOF )
            // InternalAdeptness.g:1813:2: iv_ruleRange= ruleRange EOF
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
    // InternalAdeptness.g:1819:1: ruleRange returns [EObject current=null] : (otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_bound_lower_1_0 = null;

        EObject lv_bound_upp_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1825:2: ( (otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ) )
            // InternalAdeptness.g:1826:2: (otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) )
            {
            // InternalAdeptness.g:1826:2: (otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) )
            // InternalAdeptness.g:1827:3: otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getIsInRangeBetweenKeyword_0());
            		
            // InternalAdeptness.g:1831:3: ( (lv_bound_lower_1_0= ruleBound_Down ) )
            // InternalAdeptness.g:1832:4: (lv_bound_lower_1_0= ruleBound_Down )
            {
            // InternalAdeptness.g:1832:4: (lv_bound_lower_1_0= ruleBound_Down )
            // InternalAdeptness.g:1833:5: lv_bound_lower_1_0= ruleBound_Down
            {

            					newCompositeNode(grammarAccess.getRangeAccess().getBound_lowerBound_DownParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
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

            otherlv_2=(Token)match(input,48,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getAndKeyword_2());
            		
            // InternalAdeptness.g:1854:3: ( (lv_bound_upp_3_0= ruleBound_up ) )
            // InternalAdeptness.g:1855:4: (lv_bound_upp_3_0= ruleBound_up )
            {
            // InternalAdeptness.g:1855:4: (lv_bound_upp_3_0= ruleBound_up )
            // InternalAdeptness.g:1856:5: lv_bound_upp_3_0= ruleBound_up
            {

            					newCompositeNode(grammarAccess.getRangeAccess().getBound_uppBound_upParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalAdeptness.g:1877:1: entryRuleGap returns [EObject current=null] : iv_ruleGap= ruleGap EOF ;
    public final EObject entryRuleGap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGap = null;


        try {
            // InternalAdeptness.g:1877:44: (iv_ruleGap= ruleGap EOF )
            // InternalAdeptness.g:1878:2: iv_ruleGap= ruleGap EOF
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
    // InternalAdeptness.g:1884:1: ruleGap returns [EObject current=null] : (otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ) ;
    public final EObject ruleGap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_bound_lower_1_0 = null;

        EObject lv_bound_upp_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1890:2: ( (otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ) )
            // InternalAdeptness.g:1891:2: (otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) )
            {
            // InternalAdeptness.g:1891:2: (otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) )
            // InternalAdeptness.g:1892:3: otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getGapAccess().getNotInRangeBetweenKeyword_0());
            		
            // InternalAdeptness.g:1896:3: ( (lv_bound_lower_1_0= ruleBound_Down ) )
            // InternalAdeptness.g:1897:4: (lv_bound_lower_1_0= ruleBound_Down )
            {
            // InternalAdeptness.g:1897:4: (lv_bound_lower_1_0= ruleBound_Down )
            // InternalAdeptness.g:1898:5: lv_bound_lower_1_0= ruleBound_Down
            {

            					newCompositeNode(grammarAccess.getGapAccess().getBound_lowerBound_DownParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
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

            otherlv_2=(Token)match(input,48,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getGapAccess().getAndKeyword_2());
            		
            // InternalAdeptness.g:1919:3: ( (lv_bound_upp_3_0= ruleBound_up ) )
            // InternalAdeptness.g:1920:4: (lv_bound_upp_3_0= ruleBound_up )
            {
            // InternalAdeptness.g:1920:4: (lv_bound_upp_3_0= ruleBound_up )
            // InternalAdeptness.g:1921:5: lv_bound_upp_3_0= ruleBound_up
            {

            					newCompositeNode(grammarAccess.getGapAccess().getBound_uppBound_upParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleBound_up"
    // InternalAdeptness.g:1942:1: entryRuleBound_up returns [EObject current=null] : iv_ruleBound_up= ruleBound_up EOF ;
    public final EObject entryRuleBound_up() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBound_up = null;


        try {
            // InternalAdeptness.g:1942:49: (iv_ruleBound_up= ruleBound_up EOF )
            // InternalAdeptness.g:1943:2: iv_ruleBound_up= ruleBound_up EOF
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
    // InternalAdeptness.g:1949:1: ruleBound_up returns [EObject current=null] : ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_variable_1_0= ruleVariable ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) ) ;
    public final EObject ruleBound_up() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_em_2_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1955:2: ( ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_variable_1_0= ruleVariable ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) ) )
            // InternalAdeptness.g:1956:2: ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_variable_1_0= ruleVariable ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) )
            {
            // InternalAdeptness.g:1956:2: ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_variable_1_0= ruleVariable ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt18=1;
                }
                break;
            case RULE_INT:
                {
                alt18=1;
                }
                break;
            case RULE_ID:
                {
                alt18=2;
                }
                break;
            case EOF:
            case RULE_STRING:
            case 37:
            case 50:
            case 51:
            case 74:
            case 76:
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
                    // InternalAdeptness.g:1957:3: ( (lv_value_0_0= ruleDOUBLE ) )
                    {
                    // InternalAdeptness.g:1957:3: ( (lv_value_0_0= ruleDOUBLE ) )
                    // InternalAdeptness.g:1958:4: (lv_value_0_0= ruleDOUBLE )
                    {
                    // InternalAdeptness.g:1958:4: (lv_value_0_0= ruleDOUBLE )
                    // InternalAdeptness.g:1959:5: lv_value_0_0= ruleDOUBLE
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
                    // InternalAdeptness.g:1977:3: ( (lv_variable_1_0= ruleVariable ) )
                    {
                    // InternalAdeptness.g:1977:3: ( (lv_variable_1_0= ruleVariable ) )
                    // InternalAdeptness.g:1978:4: (lv_variable_1_0= ruleVariable )
                    {
                    // InternalAdeptness.g:1978:4: (lv_variable_1_0= ruleVariable )
                    // InternalAdeptness.g:1979:5: lv_variable_1_0= ruleVariable
                    {

                    					newCompositeNode(grammarAccess.getBound_upAccess().getVariableVariableParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_1_0=ruleVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBound_upRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_1_0,
                    						"org.xtext.example.mydsl.Adeptness.Variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:1997:3: ( (lv_em_2_0= ruleExpressionsModel ) )
                    {
                    // InternalAdeptness.g:1997:3: ( (lv_em_2_0= ruleExpressionsModel ) )
                    // InternalAdeptness.g:1998:4: (lv_em_2_0= ruleExpressionsModel )
                    {
                    // InternalAdeptness.g:1998:4: (lv_em_2_0= ruleExpressionsModel )
                    // InternalAdeptness.g:1999:5: lv_em_2_0= ruleExpressionsModel
                    {

                    					newCompositeNode(grammarAccess.getBound_upAccess().getEmExpressionsModelParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_em_2_0=ruleExpressionsModel();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBound_upRule());
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
    // InternalAdeptness.g:2020:1: entryRuleBound_Down returns [EObject current=null] : iv_ruleBound_Down= ruleBound_Down EOF ;
    public final EObject entryRuleBound_Down() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBound_Down = null;


        try {
            // InternalAdeptness.g:2020:51: (iv_ruleBound_Down= ruleBound_Down EOF )
            // InternalAdeptness.g:2021:2: iv_ruleBound_Down= ruleBound_Down EOF
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
    // InternalAdeptness.g:2027:1: ruleBound_Down returns [EObject current=null] : ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_variable_1_0= ruleVariable ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) ) ;
    public final EObject ruleBound_Down() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_em_2_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2033:2: ( ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_variable_1_0= ruleVariable ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) ) )
            // InternalAdeptness.g:2034:2: ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_variable_1_0= ruleVariable ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) )
            {
            // InternalAdeptness.g:2034:2: ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_variable_1_0= ruleVariable ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt19=1;
                }
                break;
            case RULE_INT:
                {
                alt19=1;
                }
                break;
            case RULE_ID:
                {
                alt19=2;
                }
                break;
            case EOF:
            case RULE_STRING:
            case 37:
            case 48:
            case 50:
            case 51:
            case 74:
            case 76:
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
                    // InternalAdeptness.g:2035:3: ( (lv_value_0_0= ruleDOUBLE ) )
                    {
                    // InternalAdeptness.g:2035:3: ( (lv_value_0_0= ruleDOUBLE ) )
                    // InternalAdeptness.g:2036:4: (lv_value_0_0= ruleDOUBLE )
                    {
                    // InternalAdeptness.g:2036:4: (lv_value_0_0= ruleDOUBLE )
                    // InternalAdeptness.g:2037:5: lv_value_0_0= ruleDOUBLE
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
                    // InternalAdeptness.g:2055:3: ( (lv_variable_1_0= ruleVariable ) )
                    {
                    // InternalAdeptness.g:2055:3: ( (lv_variable_1_0= ruleVariable ) )
                    // InternalAdeptness.g:2056:4: (lv_variable_1_0= ruleVariable )
                    {
                    // InternalAdeptness.g:2056:4: (lv_variable_1_0= ruleVariable )
                    // InternalAdeptness.g:2057:5: lv_variable_1_0= ruleVariable
                    {

                    					newCompositeNode(grammarAccess.getBound_DownAccess().getVariableVariableParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_1_0=ruleVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBound_DownRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_1_0,
                    						"org.xtext.example.mydsl.Adeptness.Variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:2075:3: ( (lv_em_2_0= ruleExpressionsModel ) )
                    {
                    // InternalAdeptness.g:2075:3: ( (lv_em_2_0= ruleExpressionsModel ) )
                    // InternalAdeptness.g:2076:4: (lv_em_2_0= ruleExpressionsModel )
                    {
                    // InternalAdeptness.g:2076:4: (lv_em_2_0= ruleExpressionsModel )
                    // InternalAdeptness.g:2077:5: lv_em_2_0= ruleExpressionsModel
                    {

                    					newCompositeNode(grammarAccess.getBound_DownAccess().getEmExpressionsModelParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_em_2_0=ruleExpressionsModel();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBound_DownRule());
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
    // InternalAdeptness.g:2098:1: entryRuleBOOLEAN returns [EObject current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final EObject entryRuleBOOLEAN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOOLEAN = null;


        try {
            // InternalAdeptness.g:2098:48: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalAdeptness.g:2099:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
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
    // InternalAdeptness.g:2105:1: ruleBOOLEAN returns [EObject current=null] : ( (lv_bool_0_0= ruleb ) ) ;
    public final EObject ruleBOOLEAN() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_bool_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2111:2: ( ( (lv_bool_0_0= ruleb ) ) )
            // InternalAdeptness.g:2112:2: ( (lv_bool_0_0= ruleb ) )
            {
            // InternalAdeptness.g:2112:2: ( (lv_bool_0_0= ruleb ) )
            // InternalAdeptness.g:2113:3: (lv_bool_0_0= ruleb )
            {
            // InternalAdeptness.g:2113:3: (lv_bool_0_0= ruleb )
            // InternalAdeptness.g:2114:4: lv_bool_0_0= ruleb
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
    // InternalAdeptness.g:2134:1: entryRuleb returns [String current=null] : iv_ruleb= ruleb EOF ;
    public final String entryRuleb() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleb = null;


        try {
            // InternalAdeptness.g:2134:41: (iv_ruleb= ruleb EOF )
            // InternalAdeptness.g:2135:2: iv_ruleb= ruleb EOF
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
    // InternalAdeptness.g:2141:1: ruleb returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleb() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdeptness.g:2147:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalAdeptness.g:2148:2: (kw= 'true' | kw= 'false' )
            {
            // InternalAdeptness.g:2148:2: (kw= 'true' | kw= 'false' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==50) ) {
                alt20=1;
            }
            else if ( (LA20_0==51) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalAdeptness.g:2149:3: kw= 'true'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2155:3: kw= 'false'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

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
    // InternalAdeptness.g:2164:1: entryRuleDOUBLE returns [EObject current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final EObject entryRuleDOUBLE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOUBLE = null;


        try {
            // InternalAdeptness.g:2164:47: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalAdeptness.g:2165:2: iv_ruleDOUBLE= ruleDOUBLE EOF
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
    // InternalAdeptness.g:2171:1: ruleDOUBLE returns [EObject current=null] : ( (lv_dVal_0_0= ruled ) ) ;
    public final EObject ruleDOUBLE() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_dVal_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2177:2: ( ( (lv_dVal_0_0= ruled ) ) )
            // InternalAdeptness.g:2178:2: ( (lv_dVal_0_0= ruled ) )
            {
            // InternalAdeptness.g:2178:2: ( (lv_dVal_0_0= ruled ) )
            // InternalAdeptness.g:2179:3: (lv_dVal_0_0= ruled )
            {
            // InternalAdeptness.g:2179:3: (lv_dVal_0_0= ruled )
            // InternalAdeptness.g:2180:4: lv_dVal_0_0= ruled
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
    // InternalAdeptness.g:2200:1: entryRuled returns [String current=null] : iv_ruled= ruled EOF ;
    public final String entryRuled() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruled = null;


        try {
            // InternalAdeptness.g:2200:41: (iv_ruled= ruled EOF )
            // InternalAdeptness.g:2201:2: iv_ruled= ruled EOF
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
    // InternalAdeptness.g:2207:1: ruled returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruled() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalAdeptness.g:2213:2: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // InternalAdeptness.g:2214:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // InternalAdeptness.g:2214:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // InternalAdeptness.g:2215:3: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // InternalAdeptness.g:2215:3: (kw= '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==52) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAdeptness.g:2216:4: kw= '-'
                    {
                    kw=(Token)match(input,52,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_6); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getDAccess().getINTTerminalRuleCall_1());
            		
            // InternalAdeptness.g:2229:3: (kw= '.' this_INT_3= RULE_INT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==13) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAdeptness.g:2230:4: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,13,FOLLOW_17); 

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
    // InternalAdeptness.g:2247:1: entryRuleTimeType returns [EObject current=null] : iv_ruleTimeType= ruleTimeType EOF ;
    public final EObject entryRuleTimeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeType = null;


        try {
            // InternalAdeptness.g:2247:49: (iv_ruleTimeType= ruleTimeType EOF )
            // InternalAdeptness.g:2248:2: iv_ruleTimeType= ruleTimeType EOF
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
    // InternalAdeptness.g:2254:1: ruleTimeType returns [EObject current=null] : ( ( (lv_time_0_0= 'miliseconds' ) ) | ( (lv_time_1_0= 'seconds' ) ) | ( (lv_time_2_0= 'minutes' ) ) | ( (lv_time_3_0= 'hours' ) ) ) ;
    public final EObject ruleTimeType() throws RecognitionException {
        EObject current = null;

        Token lv_time_0_0=null;
        Token lv_time_1_0=null;
        Token lv_time_2_0=null;
        Token lv_time_3_0=null;


        	enterRule();

        try {
            // InternalAdeptness.g:2260:2: ( ( ( (lv_time_0_0= 'miliseconds' ) ) | ( (lv_time_1_0= 'seconds' ) ) | ( (lv_time_2_0= 'minutes' ) ) | ( (lv_time_3_0= 'hours' ) ) ) )
            // InternalAdeptness.g:2261:2: ( ( (lv_time_0_0= 'miliseconds' ) ) | ( (lv_time_1_0= 'seconds' ) ) | ( (lv_time_2_0= 'minutes' ) ) | ( (lv_time_3_0= 'hours' ) ) )
            {
            // InternalAdeptness.g:2261:2: ( ( (lv_time_0_0= 'miliseconds' ) ) | ( (lv_time_1_0= 'seconds' ) ) | ( (lv_time_2_0= 'minutes' ) ) | ( (lv_time_3_0= 'hours' ) ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt23=1;
                }
                break;
            case 54:
                {
                alt23=2;
                }
                break;
            case 55:
                {
                alt23=3;
                }
                break;
            case 56:
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
                    // InternalAdeptness.g:2262:3: ( (lv_time_0_0= 'miliseconds' ) )
                    {
                    // InternalAdeptness.g:2262:3: ( (lv_time_0_0= 'miliseconds' ) )
                    // InternalAdeptness.g:2263:4: (lv_time_0_0= 'miliseconds' )
                    {
                    // InternalAdeptness.g:2263:4: (lv_time_0_0= 'miliseconds' )
                    // InternalAdeptness.g:2264:5: lv_time_0_0= 'miliseconds'
                    {
                    lv_time_0_0=(Token)match(input,53,FOLLOW_2); 

                    					newLeafNode(lv_time_0_0, grammarAccess.getTimeTypeAccess().getTimeMilisecondsKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTimeTypeRule());
                    					}
                    					setWithLastConsumed(current, "time", lv_time_0_0, "miliseconds");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2277:3: ( (lv_time_1_0= 'seconds' ) )
                    {
                    // InternalAdeptness.g:2277:3: ( (lv_time_1_0= 'seconds' ) )
                    // InternalAdeptness.g:2278:4: (lv_time_1_0= 'seconds' )
                    {
                    // InternalAdeptness.g:2278:4: (lv_time_1_0= 'seconds' )
                    // InternalAdeptness.g:2279:5: lv_time_1_0= 'seconds'
                    {
                    lv_time_1_0=(Token)match(input,54,FOLLOW_2); 

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
                    // InternalAdeptness.g:2292:3: ( (lv_time_2_0= 'minutes' ) )
                    {
                    // InternalAdeptness.g:2292:3: ( (lv_time_2_0= 'minutes' ) )
                    // InternalAdeptness.g:2293:4: (lv_time_2_0= 'minutes' )
                    {
                    // InternalAdeptness.g:2293:4: (lv_time_2_0= 'minutes' )
                    // InternalAdeptness.g:2294:5: lv_time_2_0= 'minutes'
                    {
                    lv_time_2_0=(Token)match(input,55,FOLLOW_2); 

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
                    // InternalAdeptness.g:2307:3: ( (lv_time_3_0= 'hours' ) )
                    {
                    // InternalAdeptness.g:2307:3: ( (lv_time_3_0= 'hours' ) )
                    // InternalAdeptness.g:2308:4: (lv_time_3_0= 'hours' )
                    {
                    // InternalAdeptness.g:2308:4: (lv_time_3_0= 'hours' )
                    // InternalAdeptness.g:2309:5: lv_time_3_0= 'hours'
                    {
                    lv_time_3_0=(Token)match(input,56,FOLLOW_2); 

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
    // InternalAdeptness.g:2325:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalAdeptness.g:2325:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalAdeptness.g:2326:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalAdeptness.g:2332:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAdeptness.g:2338:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAdeptness.g:2339:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAdeptness.g:2339:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAdeptness.g:2340:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalAdeptness.g:2344:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:2345:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:2345:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:2346:5: lv_name_1_0= RULE_ID
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
    // InternalAdeptness.g:2366:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalAdeptness.g:2366:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalAdeptness.g:2367:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
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
    // InternalAdeptness.g:2373:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2379:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // InternalAdeptness.g:2380:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // InternalAdeptness.g:2380:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // InternalAdeptness.g:2381:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
            		
            // InternalAdeptness.g:2385:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAdeptness.g:2386:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAdeptness.g:2386:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAdeptness.g:2387:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
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

            otherlv_2=(Token)match(input,59,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAdeptness.g:2408:3: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==11||LA24_0==14||LA24_0==25||(LA24_0>=57 && LA24_0<=58)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalAdeptness.g:2409:4: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // InternalAdeptness.g:2409:4: (lv_elements_3_0= ruleAbstractElement )
            	    // InternalAdeptness.g:2410:5: lv_elements_3_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_37);
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
            	    break loop24;
                }
            } while (true);

            otherlv_4=(Token)match(input,60,FOLLOW_2); 

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
    // InternalAdeptness.g:2435:1: entryRuleExpressionsModel returns [EObject current=null] : iv_ruleExpressionsModel= ruleExpressionsModel EOF ;
    public final EObject entryRuleExpressionsModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionsModel = null;


        try {
            // InternalAdeptness.g:2435:57: (iv_ruleExpressionsModel= ruleExpressionsModel EOF )
            // InternalAdeptness.g:2436:2: iv_ruleExpressionsModel= ruleExpressionsModel EOF
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
    // InternalAdeptness.g:2442:1: ruleExpressionsModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement2 ) )* ;
    public final EObject ruleExpressionsModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2448:2: ( ( (lv_elements_0_0= ruleAbstractElement2 ) )* )
            // InternalAdeptness.g:2449:2: ( (lv_elements_0_0= ruleAbstractElement2 ) )*
            {
            // InternalAdeptness.g:2449:2: ( (lv_elements_0_0= ruleAbstractElement2 ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_STRING)||(LA25_0>=50 && LA25_0<=51)||LA25_0==74||LA25_0==76) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAdeptness.g:2450:3: (lv_elements_0_0= ruleAbstractElement2 )
            	    {
            	    // InternalAdeptness.g:2450:3: (lv_elements_0_0= ruleAbstractElement2 )
            	    // InternalAdeptness.g:2451:4: lv_elements_0_0= ruleAbstractElement2
            	    {

            	    				newCompositeNode(grammarAccess.getExpressionsModelAccess().getElementsAbstractElement2ParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_38);
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
            	    break loop25;
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
    // InternalAdeptness.g:2471:1: entryRuleAbstractElement2 returns [EObject current=null] : iv_ruleAbstractElement2= ruleAbstractElement2 EOF ;
    public final EObject entryRuleAbstractElement2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement2 = null;


        try {
            // InternalAdeptness.g:2471:57: (iv_ruleAbstractElement2= ruleAbstractElement2 EOF )
            // InternalAdeptness.g:2472:2: iv_ruleAbstractElement2= ruleAbstractElement2 EOF
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
    // InternalAdeptness.g:2478:1: ruleAbstractElement2 returns [EObject current=null] : (this_Variable_0= ruleVariable | this_EvalExpression_1= ruleEvalExpression ) ;
    public final EObject ruleAbstractElement2() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_EvalExpression_1 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2484:2: ( (this_Variable_0= ruleVariable | this_EvalExpression_1= ruleEvalExpression ) )
            // InternalAdeptness.g:2485:2: (this_Variable_0= ruleVariable | this_EvalExpression_1= ruleEvalExpression )
            {
            // InternalAdeptness.g:2485:2: (this_Variable_0= ruleVariable | this_EvalExpression_1= ruleEvalExpression )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=RULE_INT && LA26_0<=RULE_STRING)||(LA26_0>=50 && LA26_0<=51)||LA26_0==74||LA26_0==76) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalAdeptness.g:2486:3: this_Variable_0= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getAbstractElement2Access().getVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_0=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2495:3: this_EvalExpression_1= ruleEvalExpression
                    {

                    			newCompositeNode(grammarAccess.getAbstractElement2Access().getEvalExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvalExpression_1=ruleEvalExpression();

                    state._fsp--;


                    			current = this_EvalExpression_1;
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
    // $ANTLR end "ruleAbstractElement2"


    // $ANTLR start "entryRuleVariable"
    // InternalAdeptness.g:2507:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalAdeptness.g:2507:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalAdeptness.g:2508:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalAdeptness.g:2514:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2520:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )? ) )
            // InternalAdeptness.g:2521:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )? )
            {
            // InternalAdeptness.g:2521:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )? )
            // InternalAdeptness.g:2522:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )?
            {
            // InternalAdeptness.g:2522:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAdeptness.g:2523:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAdeptness.g:2523:4: (lv_name_0_0= RULE_ID )
            // InternalAdeptness.g:2524:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAdeptness.g:2540:3: (otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==61) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAdeptness.g:2541:4: otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,61,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalAdeptness.g:2545:4: ( (lv_expression_2_0= ruleExpression ) )
                    // InternalAdeptness.g:2546:5: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalAdeptness.g:2546:5: (lv_expression_2_0= ruleExpression )
                    // InternalAdeptness.g:2547:6: lv_expression_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_2_0,
                    							"org.xtext.example.mydsl.Adeptness.Expression");
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleEvalExpression"
    // InternalAdeptness.g:2569:1: entryRuleEvalExpression returns [EObject current=null] : iv_ruleEvalExpression= ruleEvalExpression EOF ;
    public final EObject entryRuleEvalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvalExpression = null;


        try {
            // InternalAdeptness.g:2569:55: (iv_ruleEvalExpression= ruleEvalExpression EOF )
            // InternalAdeptness.g:2570:2: iv_ruleEvalExpression= ruleEvalExpression EOF
            {
             newCompositeNode(grammarAccess.getEvalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvalExpression=ruleEvalExpression();

            state._fsp--;

             current =iv_ruleEvalExpression; 
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
    // $ANTLR end "entryRuleEvalExpression"


    // $ANTLR start "ruleEvalExpression"
    // InternalAdeptness.g:2576:1: ruleEvalExpression returns [EObject current=null] : ( (lv_expression_0_0= ruleExpression ) ) ;
    public final EObject ruleEvalExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2582:2: ( ( (lv_expression_0_0= ruleExpression ) ) )
            // InternalAdeptness.g:2583:2: ( (lv_expression_0_0= ruleExpression ) )
            {
            // InternalAdeptness.g:2583:2: ( (lv_expression_0_0= ruleExpression ) )
            // InternalAdeptness.g:2584:3: (lv_expression_0_0= ruleExpression )
            {
            // InternalAdeptness.g:2584:3: (lv_expression_0_0= ruleExpression )
            // InternalAdeptness.g:2585:4: lv_expression_0_0= ruleExpression
            {

            				newCompositeNode(grammarAccess.getEvalExpressionAccess().getExpressionExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_expression_0_0=ruleExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEvalExpressionRule());
            				}
            				set(
            					current,
            					"expression",
            					lv_expression_0_0,
            					"org.xtext.example.mydsl.Adeptness.Expression");
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
    // $ANTLR end "ruleEvalExpression"


    // $ANTLR start "entryRuleExpression"
    // InternalAdeptness.g:2605:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAdeptness.g:2605:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAdeptness.g:2606:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalAdeptness.g:2612:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2618:2: (this_Or_0= ruleOr )
            // InternalAdeptness.g:2619:2: this_Or_0= ruleOr
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;


            		current = this_Or_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalAdeptness.g:2630:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalAdeptness.g:2630:43: (iv_ruleOr= ruleOr EOF )
            // InternalAdeptness.g:2631:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalAdeptness.g:2637:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2643:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalAdeptness.g:2644:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalAdeptness.g:2644:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalAdeptness.g:2645:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAdeptness.g:2653:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==62) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAdeptness.g:2654:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalAdeptness.g:2654:4: ()
            	    // InternalAdeptness.g:2655:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,62,FOLLOW_23); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalAdeptness.g:2665:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalAdeptness.g:2666:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalAdeptness.g:2666:5: (lv_right_3_0= ruleAnd )
            	    // InternalAdeptness.g:2667:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_40);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.Adeptness.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalAdeptness.g:2689:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalAdeptness.g:2689:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalAdeptness.g:2690:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalAdeptness.g:2696:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2702:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalAdeptness.g:2703:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalAdeptness.g:2703:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalAdeptness.g:2704:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAdeptness.g:2712:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==63) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAdeptness.g:2713:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalAdeptness.g:2713:4: ()
            	    // InternalAdeptness.g:2714:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,63,FOLLOW_23); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalAdeptness.g:2724:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalAdeptness.g:2725:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalAdeptness.g:2725:5: (lv_right_3_0= ruleEquality )
            	    // InternalAdeptness.g:2726:6: lv_right_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.Adeptness.Equality");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalAdeptness.g:2748:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalAdeptness.g:2748:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalAdeptness.g:2749:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalAdeptness.g:2755:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2761:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalAdeptness.g:2762:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalAdeptness.g:2762:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalAdeptness.g:2763:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAdeptness.g:2771:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==64) ) {
                    alt31=1;
                }
                else if ( (LA31_0==65) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAdeptness.g:2772:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalAdeptness.g:2772:4: ()
            	    // InternalAdeptness.g:2773:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAdeptness.g:2779:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalAdeptness.g:2780:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalAdeptness.g:2780:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalAdeptness.g:2781:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalAdeptness.g:2781:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==64) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==65) ) {
            	        alt30=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // InternalAdeptness.g:2782:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,64,FOLLOW_23); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalAdeptness.g:2793:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,65,FOLLOW_23); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalAdeptness.g:2806:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalAdeptness.g:2807:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalAdeptness.g:2807:5: (lv_right_3_0= ruleComparison )
            	    // InternalAdeptness.g:2808:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.Adeptness.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalAdeptness.g:2830:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalAdeptness.g:2830:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalAdeptness.g:2831:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalAdeptness.g:2837:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2843:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalAdeptness.g:2844:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalAdeptness.g:2844:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalAdeptness.g:2845:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAdeptness.g:2853:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop33:
            do {
                int alt33=2;
                switch ( input.LA(1) ) {
                case 66:
                    {
                    alt33=1;
                    }
                    break;
                case 67:
                    {
                    alt33=1;
                    }
                    break;
                case 68:
                    {
                    alt33=1;
                    }
                    break;
                case 69:
                    {
                    alt33=1;
                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // InternalAdeptness.g:2854:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalAdeptness.g:2854:4: ()
            	    // InternalAdeptness.g:2855:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAdeptness.g:2861:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalAdeptness.g:2862:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalAdeptness.g:2862:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalAdeptness.g:2863:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalAdeptness.g:2863:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt32=4;
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
            	    case 68:
            	        {
            	        alt32=3;
            	        }
            	        break;
            	    case 69:
            	        {
            	        alt32=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt32) {
            	        case 1 :
            	            // InternalAdeptness.g:2864:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,66,FOLLOW_23); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalAdeptness.g:2875:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,67,FOLLOW_23); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalAdeptness.g:2886:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,68,FOLLOW_23); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalAdeptness.g:2897:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,69,FOLLOW_23); 

            	            							newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalAdeptness.g:2910:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalAdeptness.g:2911:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalAdeptness.g:2911:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalAdeptness.g:2912:6: lv_right_3_0= rulePlusOrMinus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.Adeptness.PlusOrMinus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalAdeptness.g:2934:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalAdeptness.g:2934:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalAdeptness.g:2935:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalAdeptness.g:2941:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2947:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalAdeptness.g:2948:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalAdeptness.g:2948:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalAdeptness.g:2949:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAdeptness.g:2957:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==70) ) {
                    alt35=1;
                }
                else if ( (LA35_0==52) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAdeptness.g:2958:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalAdeptness.g:2958:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==70) ) {
            	        alt34=1;
            	    }
            	    else if ( (LA34_0==52) ) {
            	        alt34=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // InternalAdeptness.g:2959:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalAdeptness.g:2959:5: ( () otherlv_2= '+' )
            	            // InternalAdeptness.g:2960:6: () otherlv_2= '+'
            	            {
            	            // InternalAdeptness.g:2960:6: ()
            	            // InternalAdeptness.g:2961:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,70,FOLLOW_23); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalAdeptness.g:2973:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalAdeptness.g:2973:5: ( () otherlv_4= '-' )
            	            // InternalAdeptness.g:2974:6: () otherlv_4= '-'
            	            {
            	            // InternalAdeptness.g:2974:6: ()
            	            // InternalAdeptness.g:2975:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,52,FOLLOW_23); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAdeptness.g:2987:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalAdeptness.g:2988:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalAdeptness.g:2988:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalAdeptness.g:2989:6: lv_right_5_0= ruleMulOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_44);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.example.mydsl.Adeptness.MulOrDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalAdeptness.g:3011:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalAdeptness.g:3011:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalAdeptness.g:3012:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
             newCompositeNode(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;

             current =iv_ruleMulOrDiv; 
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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalAdeptness.g:3018:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '^' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:3024:2: ( (this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '^' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalAdeptness.g:3025:2: (this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '^' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalAdeptness.g:3025:2: (this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '^' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalAdeptness.g:3026:3: this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '^' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAdeptness.g:3034:3: ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '^' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop37:
            do {
                int alt37=2;
                switch ( input.LA(1) ) {
                case 71:
                    {
                    alt37=1;
                    }
                    break;
                case 72:
                    {
                    alt37=1;
                    }
                    break;
                case 73:
                    {
                    alt37=1;
                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // InternalAdeptness.g:3035:4: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '^' ) ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalAdeptness.g:3035:4: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '^' ) ) ) )
            	    // InternalAdeptness.g:3036:5: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '^' ) ) )
            	    {
            	    // InternalAdeptness.g:3036:5: ()
            	    // InternalAdeptness.g:3037:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalAdeptness.g:3043:5: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '^' ) ) )
            	    // InternalAdeptness.g:3044:6: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '^' ) )
            	    {
            	    // InternalAdeptness.g:3044:6: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '^' ) )
            	    // InternalAdeptness.g:3045:7: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '^' )
            	    {
            	    // InternalAdeptness.g:3045:7: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '^' )
            	    int alt36=3;
            	    switch ( input.LA(1) ) {
            	    case 71:
            	        {
            	        alt36=1;
            	        }
            	        break;
            	    case 72:
            	        {
            	        alt36=2;
            	        }
            	        break;
            	    case 73:
            	        {
            	        alt36=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt36) {
            	        case 1 :
            	            // InternalAdeptness.g:3046:8: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,71,FOLLOW_23); 

            	            								newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_1_0_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getMulOrDivRule());
            	            								}
            	            								setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            							

            	            }
            	            break;
            	        case 2 :
            	            // InternalAdeptness.g:3057:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,72,FOLLOW_23); 

            	            								newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_1_0_1());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getMulOrDivRule());
            	            								}
            	            								setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            							

            	            }
            	            break;
            	        case 3 :
            	            // InternalAdeptness.g:3068:8: lv_op_2_3= '^'
            	            {
            	            lv_op_2_3=(Token)match(input,73,FOLLOW_23); 

            	            								newLeafNode(lv_op_2_3, grammarAccess.getMulOrDivAccess().getOpCircumflexAccentKeyword_1_0_1_0_2());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getMulOrDivRule());
            	            								}
            	            								setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            							

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // InternalAdeptness.g:3082:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalAdeptness.g:3083:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalAdeptness.g:3083:5: (lv_right_3_0= rulePrimary )
            	    // InternalAdeptness.g:3084:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_45);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.Adeptness.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalAdeptness.g:3106:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalAdeptness.g:3106:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalAdeptness.g:3107:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalAdeptness.g:3113:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject this_Atomic_6 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:3119:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // InternalAdeptness.g:3120:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // InternalAdeptness.g:3120:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt38=1;
                }
                break;
            case 76:
                {
                alt38=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 50:
            case 51:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalAdeptness.g:3121:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalAdeptness.g:3121:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalAdeptness.g:3122:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,74,FOLLOW_23); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_46);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,75,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:3140:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalAdeptness.g:3140:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalAdeptness.g:3141:4: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalAdeptness.g:3141:4: ()
                    // InternalAdeptness.g:3142:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,76,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalAdeptness.g:3152:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalAdeptness.g:3153:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalAdeptness.g:3153:5: (lv_expression_5_0= rulePrimary )
                    // InternalAdeptness.g:3154:6: lv_expression_5_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_5_0,
                    							"org.xtext.example.mydsl.Adeptness.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:3173:3: this_Atomic_6= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_6;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalAdeptness.g:3185:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalAdeptness.g:3185:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalAdeptness.g:3186:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalAdeptness.g:3192:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( (lv_variable_6_0= ruleVariable ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        EObject lv_variable_6_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:3198:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( (lv_variable_6_0= ruleVariable ) ) ) )
            // InternalAdeptness.g:3199:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( (lv_variable_6_0= ruleVariable ) ) )
            {
            // InternalAdeptness.g:3199:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( (lv_variable_6_0= ruleVariable ) ) )
            int alt40=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt40=1;
                }
                break;
            case RULE_STRING:
                {
                alt40=2;
                }
                break;
            case 50:
            case 51:
                {
                alt40=3;
                }
                break;
            case RULE_ID:
                {
                alt40=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalAdeptness.g:3200:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalAdeptness.g:3200:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalAdeptness.g:3201:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalAdeptness.g:3201:4: ()
                    // InternalAdeptness.g:3202:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalAdeptness.g:3208:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalAdeptness.g:3209:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalAdeptness.g:3209:5: (lv_value_1_0= RULE_INT )
                    // InternalAdeptness.g:3210:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:3228:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalAdeptness.g:3228:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalAdeptness.g:3229:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalAdeptness.g:3229:4: ()
                    // InternalAdeptness.g:3230:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAdeptness.g:3236:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalAdeptness.g:3237:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalAdeptness.g:3237:5: (lv_value_3_0= RULE_STRING )
                    // InternalAdeptness.g:3238:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:3256:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // InternalAdeptness.g:3256:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // InternalAdeptness.g:3257:4: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // InternalAdeptness.g:3257:4: ()
                    // InternalAdeptness.g:3258:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalAdeptness.g:3264:4: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // InternalAdeptness.g:3265:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // InternalAdeptness.g:3265:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // InternalAdeptness.g:3266:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // InternalAdeptness.g:3266:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==50) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==51) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalAdeptness.g:3267:7: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,50,FOLLOW_2); 

                            							newLeafNode(lv_value_5_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAdeptness.g:3278:7: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,51,FOLLOW_2); 

                            							newLeafNode(lv_value_5_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:3293:3: ( (lv_variable_6_0= ruleVariable ) )
                    {
                    // InternalAdeptness.g:3293:3: ( (lv_variable_6_0= ruleVariable ) )
                    // InternalAdeptness.g:3294:4: (lv_variable_6_0= ruleVariable )
                    {
                    // InternalAdeptness.g:3294:4: (lv_variable_6_0= ruleVariable )
                    // InternalAdeptness.g:3295:5: lv_variable_6_0= ruleVariable
                    {

                    					newCompositeNode(grammarAccess.getAtomicAccess().getVariableVariableParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_6_0=ruleVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtomicRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_6_0,
                    						"org.xtext.example.mydsl.Adeptness.Variable");
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
    // $ANTLR end "ruleAtomic"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\46\1\5\1\uffff\1\5\1\15\1\5\3\uffff\1\45";
    static final String dfa_3s = "\1\51\1\64\1\uffff\1\5\1\52\1\5\3\uffff\1\52";
    static final String dfa_4s = "\2\uffff\1\3\3\uffff\1\4\1\2\1\1\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2",
            "\1\4\56\uffff\1\3",
            "",
            "\1\4",
            "\1\5\27\uffff\1\10\1\uffff\1\6\2\uffff\1\7",
            "\1\11",
            "",
            "",
            "",
            "\1\10\1\uffff\1\6\2\uffff\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1136:3: ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0600000002004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000C000000000070L,0x0000000000001400L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000EF80000000070L,0x0000000000001400L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x01E0000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x001C000000000070L,0x0000000000001400L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x1600000002004800L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000C000000000072L,0x0000000000001400L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x000000000000003CL});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0010000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000380L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});

}