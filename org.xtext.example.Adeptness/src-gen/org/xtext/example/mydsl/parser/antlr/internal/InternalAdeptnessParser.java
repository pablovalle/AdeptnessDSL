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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'MONITORINGPLAN'", "':'", "'ENDMONITORINGPLAN'", "'MONITOR'", "'type'", "'max'", "'min'", "'ENDMONITOR'", "'boolean'", "'int'", "'double'", "'CPS'", "'['", "']'", "'implements'", "'ENDCPS'", "'ORACLE'", "'ENDORACLE'", "'while:'", "'when:'", "'after('", "','", "')'", "'during('", "'checks:'", "'Description: '", "'fails if :'", "';'", "'confidence is below'", "'more than'", "'times within'", "'confidence is in constant degradation'", "'within'", "'should be'", "'should not be'", "'is below'", "'is above'", "'is in range between'", "'and'", "'not in range between'", "'true'", "'false'", "'-'", "'miliseconds'", "'seconds'", "'minutes'", "'hours'", "'datatype'", "'package'", "'{'", "'}'", "'('", "'=='", "'!='", "'>='", "'<='", "'<'", "'>'", "'&&'", "'||'", "'+'", "'*'", "'/'"
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

                if ( (LA1_0==11||LA1_0==14||LA1_0==25||(LA1_0>=61 && LA1_0<=62)) ) {
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
            case 62:
                {
                alt2=1;
                }
                break;
            case 14:
            case 25:
            case 61:
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
            case 61:
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

                if ( (LA13_0==38) ) {
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
    // InternalAdeptness.g:883:1: ruleWhen returns [EObject current=null] : (otherlv_0= 'when:' ( (lv_em_1_0= ruleExpressionsModel ) ) ( (lv_aw_2_0= ruleAfterWhen ) ) ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_em_1_0 = null;

        EObject lv_aw_2_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:889:2: ( (otherlv_0= 'when:' ( (lv_em_1_0= ruleExpressionsModel ) ) ( (lv_aw_2_0= ruleAfterWhen ) ) ) )
            // InternalAdeptness.g:890:2: (otherlv_0= 'when:' ( (lv_em_1_0= ruleExpressionsModel ) ) ( (lv_aw_2_0= ruleAfterWhen ) ) )
            {
            // InternalAdeptness.g:890:2: (otherlv_0= 'when:' ( (lv_em_1_0= ruleExpressionsModel ) ) ( (lv_aw_2_0= ruleAfterWhen ) ) )
            // InternalAdeptness.g:891:3: otherlv_0= 'when:' ( (lv_em_1_0= ruleExpressionsModel ) ) ( (lv_aw_2_0= ruleAfterWhen ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getWhenAccess().getWhenKeyword_0());
            		
            // InternalAdeptness.g:895:3: ( (lv_em_1_0= ruleExpressionsModel ) )
            // InternalAdeptness.g:896:4: (lv_em_1_0= ruleExpressionsModel )
            {
            // InternalAdeptness.g:896:4: (lv_em_1_0= ruleExpressionsModel )
            // InternalAdeptness.g:897:5: lv_em_1_0= ruleExpressionsModel
            {

            					newCompositeNode(grammarAccess.getWhenAccess().getEmExpressionsModelParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalAdeptness.g:914:3: ( (lv_aw_2_0= ruleAfterWhen ) )
            // InternalAdeptness.g:915:4: (lv_aw_2_0= ruleAfterWhen )
            {
            // InternalAdeptness.g:915:4: (lv_aw_2_0= ruleAfterWhen )
            // InternalAdeptness.g:916:5: lv_aw_2_0= ruleAfterWhen
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
    // InternalAdeptness.g:937:1: entryRuleAfterWhen returns [EObject current=null] : iv_ruleAfterWhen= ruleAfterWhen EOF ;
    public final EObject entryRuleAfterWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAfterWhen = null;


        try {
            // InternalAdeptness.g:937:50: (iv_ruleAfterWhen= ruleAfterWhen EOF )
            // InternalAdeptness.g:938:2: iv_ruleAfterWhen= ruleAfterWhen EOF
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
    // InternalAdeptness.g:944:1: ruleAfterWhen returns [EObject current=null] : ( ( (lv_wait_0_0= ruleWait ) ) | ( (lv_during_1_0= ruleDuring ) ) ) ;
    public final EObject ruleAfterWhen() throws RecognitionException {
        EObject current = null;

        EObject lv_wait_0_0 = null;

        EObject lv_during_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:950:2: ( ( ( (lv_wait_0_0= ruleWait ) ) | ( (lv_during_1_0= ruleDuring ) ) ) )
            // InternalAdeptness.g:951:2: ( ( (lv_wait_0_0= ruleWait ) ) | ( (lv_during_1_0= ruleDuring ) ) )
            {
            // InternalAdeptness.g:951:2: ( ( (lv_wait_0_0= ruleWait ) ) | ( (lv_during_1_0= ruleDuring ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            else if ( (LA14_0==37) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAdeptness.g:952:3: ( (lv_wait_0_0= ruleWait ) )
                    {
                    // InternalAdeptness.g:952:3: ( (lv_wait_0_0= ruleWait ) )
                    // InternalAdeptness.g:953:4: (lv_wait_0_0= ruleWait )
                    {
                    // InternalAdeptness.g:953:4: (lv_wait_0_0= ruleWait )
                    // InternalAdeptness.g:954:5: lv_wait_0_0= ruleWait
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
                    // InternalAdeptness.g:972:3: ( (lv_during_1_0= ruleDuring ) )
                    {
                    // InternalAdeptness.g:972:3: ( (lv_during_1_0= ruleDuring ) )
                    // InternalAdeptness.g:973:4: (lv_during_1_0= ruleDuring )
                    {
                    // InternalAdeptness.g:973:4: (lv_during_1_0= ruleDuring )
                    // InternalAdeptness.g:974:5: lv_during_1_0= ruleDuring
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
    // InternalAdeptness.g:995:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalAdeptness.g:995:45: (iv_ruleWait= ruleWait EOF )
            // InternalAdeptness.g:996:2: iv_ruleWait= ruleWait EOF
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
    // InternalAdeptness.g:1002:1: ruleWait returns [EObject current=null] : ( (otherlv_0= 'after(' )+ ( (lv_time_1_0= ruleDOUBLE ) )+ (otherlv_2= ',' )+ ( (lv_unit_3_0= ruleTimeType ) )+ otherlv_4= ')' ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_time_1_0 = null;

        EObject lv_unit_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1008:2: ( ( (otherlv_0= 'after(' )+ ( (lv_time_1_0= ruleDOUBLE ) )+ (otherlv_2= ',' )+ ( (lv_unit_3_0= ruleTimeType ) )+ otherlv_4= ')' ) )
            // InternalAdeptness.g:1009:2: ( (otherlv_0= 'after(' )+ ( (lv_time_1_0= ruleDOUBLE ) )+ (otherlv_2= ',' )+ ( (lv_unit_3_0= ruleTimeType ) )+ otherlv_4= ')' )
            {
            // InternalAdeptness.g:1009:2: ( (otherlv_0= 'after(' )+ ( (lv_time_1_0= ruleDOUBLE ) )+ (otherlv_2= ',' )+ ( (lv_unit_3_0= ruleTimeType ) )+ otherlv_4= ')' )
            // InternalAdeptness.g:1010:3: (otherlv_0= 'after(' )+ ( (lv_time_1_0= ruleDOUBLE ) )+ (otherlv_2= ',' )+ ( (lv_unit_3_0= ruleTimeType ) )+ otherlv_4= ')'
            {
            // InternalAdeptness.g:1010:3: (otherlv_0= 'after(' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAdeptness.g:1011:4: otherlv_0= 'after('
            	    {
            	    otherlv_0=(Token)match(input,34,FOLLOW_25); 

            	    				newLeafNode(otherlv_0, grammarAccess.getWaitAccess().getAfterKeyword_0());
            	    			

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

            // InternalAdeptness.g:1016:3: ( (lv_time_1_0= ruleDOUBLE ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_INT||LA16_0==56) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAdeptness.g:1017:4: (lv_time_1_0= ruleDOUBLE )
            	    {
            	    // InternalAdeptness.g:1017:4: (lv_time_1_0= ruleDOUBLE )
            	    // InternalAdeptness.g:1018:5: lv_time_1_0= ruleDOUBLE
            	    {

            	    					newCompositeNode(grammarAccess.getWaitAccess().getTimeDOUBLEParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_26);
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
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            // InternalAdeptness.g:1035:3: (otherlv_2= ',' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAdeptness.g:1036:4: otherlv_2= ','
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_27); 

            	    				newLeafNode(otherlv_2, grammarAccess.getWaitAccess().getCommaKeyword_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            // InternalAdeptness.g:1041:3: ( (lv_unit_3_0= ruleTimeType ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=57 && LA18_0<=60)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAdeptness.g:1042:4: (lv_unit_3_0= ruleTimeType )
            	    {
            	    // InternalAdeptness.g:1042:4: (lv_unit_3_0= ruleTimeType )
            	    // InternalAdeptness.g:1043:5: lv_unit_3_0= ruleTimeType
            	    {

            	    					newCompositeNode(grammarAccess.getWaitAccess().getUnitTimeTypeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_28);
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
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_4=(Token)match(input,36,FOLLOW_2); 

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
    // InternalAdeptness.g:1068:1: entryRuleDuring returns [EObject current=null] : iv_ruleDuring= ruleDuring EOF ;
    public final EObject entryRuleDuring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuring = null;


        try {
            // InternalAdeptness.g:1068:47: (iv_ruleDuring= ruleDuring EOF )
            // InternalAdeptness.g:1069:2: iv_ruleDuring= ruleDuring EOF
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
    // InternalAdeptness.g:1075:1: ruleDuring returns [EObject current=null] : ( (otherlv_0= 'during(' )+ ( (lv_time_1_0= ruleDOUBLE ) )+ (otherlv_2= ',' )+ ( (lv_unit_3_0= ruleTimeType ) )+ otherlv_4= ')' ) ;
    public final EObject ruleDuring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_time_1_0 = null;

        EObject lv_unit_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1081:2: ( ( (otherlv_0= 'during(' )+ ( (lv_time_1_0= ruleDOUBLE ) )+ (otherlv_2= ',' )+ ( (lv_unit_3_0= ruleTimeType ) )+ otherlv_4= ')' ) )
            // InternalAdeptness.g:1082:2: ( (otherlv_0= 'during(' )+ ( (lv_time_1_0= ruleDOUBLE ) )+ (otherlv_2= ',' )+ ( (lv_unit_3_0= ruleTimeType ) )+ otherlv_4= ')' )
            {
            // InternalAdeptness.g:1082:2: ( (otherlv_0= 'during(' )+ ( (lv_time_1_0= ruleDOUBLE ) )+ (otherlv_2= ',' )+ ( (lv_unit_3_0= ruleTimeType ) )+ otherlv_4= ')' )
            // InternalAdeptness.g:1083:3: (otherlv_0= 'during(' )+ ( (lv_time_1_0= ruleDOUBLE ) )+ (otherlv_2= ',' )+ ( (lv_unit_3_0= ruleTimeType ) )+ otherlv_4= ')'
            {
            // InternalAdeptness.g:1083:3: (otherlv_0= 'during(' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAdeptness.g:1084:4: otherlv_0= 'during('
            	    {
            	    otherlv_0=(Token)match(input,37,FOLLOW_29); 

            	    				newLeafNode(otherlv_0, grammarAccess.getDuringAccess().getDuringKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            // InternalAdeptness.g:1089:3: ( (lv_time_1_0= ruleDOUBLE ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_INT||LA20_0==56) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAdeptness.g:1090:4: (lv_time_1_0= ruleDOUBLE )
            	    {
            	    // InternalAdeptness.g:1090:4: (lv_time_1_0= ruleDOUBLE )
            	    // InternalAdeptness.g:1091:5: lv_time_1_0= ruleDOUBLE
            	    {

            	    					newCompositeNode(grammarAccess.getDuringAccess().getTimeDOUBLEParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_26);
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
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            // InternalAdeptness.g:1108:3: (otherlv_2= ',' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==35) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAdeptness.g:1109:4: otherlv_2= ','
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_27); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDuringAccess().getCommaKeyword_2());
            	    			

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

            // InternalAdeptness.g:1114:3: ( (lv_unit_3_0= ruleTimeType ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=57 && LA22_0<=60)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAdeptness.g:1115:4: (lv_unit_3_0= ruleTimeType )
            	    {
            	    // InternalAdeptness.g:1115:4: (lv_unit_3_0= ruleTimeType )
            	    // InternalAdeptness.g:1116:5: lv_unit_3_0= ruleTimeType
            	    {

            	    					newCompositeNode(grammarAccess.getDuringAccess().getUnitTimeTypeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_28);
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
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_4=(Token)match(input,36,FOLLOW_2); 

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
    // InternalAdeptness.g:1141:1: entryRuleChecks returns [EObject current=null] : iv_ruleChecks= ruleChecks EOF ;
    public final EObject entryRuleChecks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChecks = null;


        try {
            // InternalAdeptness.g:1141:47: (iv_ruleChecks= ruleChecks EOF )
            // InternalAdeptness.g:1142:2: iv_ruleChecks= ruleChecks EOF
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
    // InternalAdeptness.g:1148:1: ruleChecks returns [EObject current=null] : (otherlv_0= 'checks:' ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) ) ( (lv_reference_3_0= ruleReference ) ) ( (lv_failReason_4_0= ruleFailReason ) )+ ( (lv_description_5_0= ruleDescription ) ) ) ;
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
            // InternalAdeptness.g:1154:2: ( (otherlv_0= 'checks:' ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) ) ( (lv_reference_3_0= ruleReference ) ) ( (lv_failReason_4_0= ruleFailReason ) )+ ( (lv_description_5_0= ruleDescription ) ) ) )
            // InternalAdeptness.g:1155:2: (otherlv_0= 'checks:' ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) ) ( (lv_reference_3_0= ruleReference ) ) ( (lv_failReason_4_0= ruleFailReason ) )+ ( (lv_description_5_0= ruleDescription ) ) )
            {
            // InternalAdeptness.g:1155:2: (otherlv_0= 'checks:' ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) ) ( (lv_reference_3_0= ruleReference ) ) ( (lv_failReason_4_0= ruleFailReason ) )+ ( (lv_description_5_0= ruleDescription ) ) )
            // InternalAdeptness.g:1156:3: otherlv_0= 'checks:' ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) ) ( (lv_reference_3_0= ruleReference ) ) ( (lv_failReason_4_0= ruleFailReason ) )+ ( (lv_description_5_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getChecksAccess().getChecksKeyword_0());
            		
            // InternalAdeptness.g:1160:3: ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_em_2_0= ruleExpressionsModel ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_INT||LA23_0==36||(LA23_0>=47 && LA23_0<=51)||LA23_0==53||LA23_0==56||LA23_0==65) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalAdeptness.g:1161:4: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalAdeptness.g:1161:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalAdeptness.g:1162:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalAdeptness.g:1162:5: (lv_name_1_0= RULE_ID )
                    // InternalAdeptness.g:1163:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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
                    // InternalAdeptness.g:1180:4: ( (lv_em_2_0= ruleExpressionsModel ) )
                    {
                    // InternalAdeptness.g:1180:4: ( (lv_em_2_0= ruleExpressionsModel ) )
                    // InternalAdeptness.g:1181:5: (lv_em_2_0= ruleExpressionsModel )
                    {
                    // InternalAdeptness.g:1181:5: (lv_em_2_0= ruleExpressionsModel )
                    // InternalAdeptness.g:1182:6: lv_em_2_0= ruleExpressionsModel
                    {

                    						newCompositeNode(grammarAccess.getChecksAccess().getEmExpressionsModelParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

            // InternalAdeptness.g:1200:3: ( (lv_reference_3_0= ruleReference ) )
            // InternalAdeptness.g:1201:4: (lv_reference_3_0= ruleReference )
            {
            // InternalAdeptness.g:1201:4: (lv_reference_3_0= ruleReference )
            // InternalAdeptness.g:1202:5: lv_reference_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getChecksAccess().getReferenceReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalAdeptness.g:1219:3: ( (lv_failReason_4_0= ruleFailReason ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==40) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalAdeptness.g:1220:4: (lv_failReason_4_0= ruleFailReason )
            	    {
            	    // InternalAdeptness.g:1220:4: (lv_failReason_4_0= ruleFailReason )
            	    // InternalAdeptness.g:1221:5: lv_failReason_4_0= ruleFailReason
            	    {

            	    					newCompositeNode(grammarAccess.getChecksAccess().getFailReasonFailReasonParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_32);
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
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            // InternalAdeptness.g:1238:3: ( (lv_description_5_0= ruleDescription ) )
            // InternalAdeptness.g:1239:4: (lv_description_5_0= ruleDescription )
            {
            // InternalAdeptness.g:1239:4: (lv_description_5_0= ruleDescription )
            // InternalAdeptness.g:1240:5: lv_description_5_0= ruleDescription
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
    // InternalAdeptness.g:1261:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalAdeptness.g:1261:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalAdeptness.g:1262:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalAdeptness.g:1268:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalAdeptness.g:1274:2: ( (otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalAdeptness.g:1275:2: (otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalAdeptness.g:1275:2: (otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalAdeptness.g:1276:3: otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            // InternalAdeptness.g:1280:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalAdeptness.g:1281:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalAdeptness.g:1281:4: (lv_value_1_0= RULE_STRING )
            // InternalAdeptness.g:1282:5: lv_value_1_0= RULE_STRING
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
    // InternalAdeptness.g:1302:1: entryRuleFailReason returns [EObject current=null] : iv_ruleFailReason= ruleFailReason EOF ;
    public final EObject entryRuleFailReason() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFailReason = null;


        try {
            // InternalAdeptness.g:1302:51: (iv_ruleFailReason= ruleFailReason EOF )
            // InternalAdeptness.g:1303:2: iv_ruleFailReason= ruleFailReason EOF
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
    // InternalAdeptness.g:1309:1: ruleFailReason returns [EObject current=null] : (otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) ) ) ;
    public final EObject ruleFailReason() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_reason_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1315:2: ( (otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) ) ) )
            // InternalAdeptness.g:1316:2: (otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) ) )
            {
            // InternalAdeptness.g:1316:2: (otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) ) )
            // InternalAdeptness.g:1317:3: otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getFailReasonAccess().getFailsIfKeyword_0());
            		
            // InternalAdeptness.g:1321:3: ( (lv_reason_1_0= ruleReason ) )
            // InternalAdeptness.g:1322:4: (lv_reason_1_0= ruleReason )
            {
            // InternalAdeptness.g:1322:4: (lv_reason_1_0= ruleReason )
            // InternalAdeptness.g:1323:5: lv_reason_1_0= ruleReason
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
    // InternalAdeptness.g:1344:1: entryRuleReason returns [EObject current=null] : iv_ruleReason= ruleReason EOF ;
    public final EObject entryRuleReason() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReason = null;


        try {
            // InternalAdeptness.g:1344:47: (iv_ruleReason= ruleReason EOF )
            // InternalAdeptness.g:1345:2: iv_ruleReason= ruleReason EOF
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
    // InternalAdeptness.g:1351:1: ruleReason returns [EObject current=null] : ( ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleReason() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_highPeak_0_0 = null;

        EObject lv_highTime_1_0 = null;

        EObject lv_constDeg_2_0 = null;

        EObject lv_xPeaks_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1357:2: ( ( ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';' ) )
            // InternalAdeptness.g:1358:2: ( ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';' )
            {
            // InternalAdeptness.g:1358:2: ( ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';' )
            // InternalAdeptness.g:1359:3: ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';'
            {
            // InternalAdeptness.g:1359:3: ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) )
            int alt25=4;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalAdeptness.g:1360:4: ( (lv_highPeak_0_0= ruleHighPeak ) )
                    {
                    // InternalAdeptness.g:1360:4: ( (lv_highPeak_0_0= ruleHighPeak ) )
                    // InternalAdeptness.g:1361:5: (lv_highPeak_0_0= ruleHighPeak )
                    {
                    // InternalAdeptness.g:1361:5: (lv_highPeak_0_0= ruleHighPeak )
                    // InternalAdeptness.g:1362:6: lv_highPeak_0_0= ruleHighPeak
                    {

                    						newCompositeNode(grammarAccess.getReasonAccess().getHighPeakHighPeakParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_35);
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
                    // InternalAdeptness.g:1380:4: ( (lv_highTime_1_0= ruleHighTime ) )
                    {
                    // InternalAdeptness.g:1380:4: ( (lv_highTime_1_0= ruleHighTime ) )
                    // InternalAdeptness.g:1381:5: (lv_highTime_1_0= ruleHighTime )
                    {
                    // InternalAdeptness.g:1381:5: (lv_highTime_1_0= ruleHighTime )
                    // InternalAdeptness.g:1382:6: lv_highTime_1_0= ruleHighTime
                    {

                    						newCompositeNode(grammarAccess.getReasonAccess().getHighTimeHighTimeParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_35);
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
                    // InternalAdeptness.g:1400:4: ( (lv_constDeg_2_0= ruleConstDeg ) )
                    {
                    // InternalAdeptness.g:1400:4: ( (lv_constDeg_2_0= ruleConstDeg ) )
                    // InternalAdeptness.g:1401:5: (lv_constDeg_2_0= ruleConstDeg )
                    {
                    // InternalAdeptness.g:1401:5: (lv_constDeg_2_0= ruleConstDeg )
                    // InternalAdeptness.g:1402:6: lv_constDeg_2_0= ruleConstDeg
                    {

                    						newCompositeNode(grammarAccess.getReasonAccess().getConstDegConstDegParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_35);
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
                    // InternalAdeptness.g:1420:4: ( (lv_xPeaks_3_0= ruleXPeaks ) )
                    {
                    // InternalAdeptness.g:1420:4: ( (lv_xPeaks_3_0= ruleXPeaks ) )
                    // InternalAdeptness.g:1421:5: (lv_xPeaks_3_0= ruleXPeaks )
                    {
                    // InternalAdeptness.g:1421:5: (lv_xPeaks_3_0= ruleXPeaks )
                    // InternalAdeptness.g:1422:6: lv_xPeaks_3_0= ruleXPeaks
                    {

                    						newCompositeNode(grammarAccess.getReasonAccess().getXPeaksXPeaksParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_35);
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

            otherlv_4=(Token)match(input,41,FOLLOW_2); 

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
    // InternalAdeptness.g:1448:1: entryRuleXPeaks returns [EObject current=null] : iv_ruleXPeaks= ruleXPeaks EOF ;
    public final EObject entryRuleXPeaks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPeaks = null;


        try {
            // InternalAdeptness.g:1448:47: (iv_ruleXPeaks= ruleXPeaks EOF )
            // InternalAdeptness.g:1449:2: iv_ruleXPeaks= ruleXPeaks EOF
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
    // InternalAdeptness.g:1455:1: ruleXPeaks returns [EObject current=null] : (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= ruleDOUBLE ) ) ( (lv_unit_6_0= ruleTimeType ) ) ) ;
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
            // InternalAdeptness.g:1461:2: ( (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= ruleDOUBLE ) ) ( (lv_unit_6_0= ruleTimeType ) ) ) )
            // InternalAdeptness.g:1462:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= ruleDOUBLE ) ) ( (lv_unit_6_0= ruleTimeType ) ) )
            {
            // InternalAdeptness.g:1462:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= ruleDOUBLE ) ) ( (lv_unit_6_0= ruleTimeType ) ) )
            // InternalAdeptness.g:1463:3: otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= ruleDOUBLE ) ) ( (lv_unit_6_0= ruleTimeType ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getXPeaksAccess().getConfidenceIsBelowKeyword_0());
            		
            // InternalAdeptness.g:1467:3: ( (lv_cant_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1468:4: (lv_cant_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1468:4: (lv_cant_1_0= ruleDOUBLE )
            // InternalAdeptness.g:1469:5: lv_cant_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getXPeaksAccess().getCantDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
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

            otherlv_2=(Token)match(input,43,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getXPeaksAccess().getMoreThanKeyword_2());
            		
            // InternalAdeptness.g:1490:3: ( (lv_nPeaks_3_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1491:4: (lv_nPeaks_3_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1491:4: (lv_nPeaks_3_0= ruleDOUBLE )
            // InternalAdeptness.g:1492:5: lv_nPeaks_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getXPeaksAccess().getNPeaksDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_37);
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

            otherlv_4=(Token)match(input,44,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getXPeaksAccess().getTimesWithinKeyword_4());
            		
            // InternalAdeptness.g:1513:3: ( (lv_time_5_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1514:4: (lv_time_5_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1514:4: (lv_time_5_0= ruleDOUBLE )
            // InternalAdeptness.g:1515:5: lv_time_5_0= ruleDOUBLE
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

            // InternalAdeptness.g:1532:3: ( (lv_unit_6_0= ruleTimeType ) )
            // InternalAdeptness.g:1533:4: (lv_unit_6_0= ruleTimeType )
            {
            // InternalAdeptness.g:1533:4: (lv_unit_6_0= ruleTimeType )
            // InternalAdeptness.g:1534:5: lv_unit_6_0= ruleTimeType
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
    // InternalAdeptness.g:1555:1: entryRuleConstDeg returns [EObject current=null] : iv_ruleConstDeg= ruleConstDeg EOF ;
    public final EObject entryRuleConstDeg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstDeg = null;


        try {
            // InternalAdeptness.g:1555:49: (iv_ruleConstDeg= ruleConstDeg EOF )
            // InternalAdeptness.g:1556:2: iv_ruleConstDeg= ruleConstDeg EOF
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
    // InternalAdeptness.g:1562:1: ruleConstDeg returns [EObject current=null] : (otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleConstDeg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cant_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1568:2: ( (otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) ) ) )
            // InternalAdeptness.g:1569:2: (otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) ) )
            {
            // InternalAdeptness.g:1569:2: (otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) ) )
            // InternalAdeptness.g:1570:3: otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getConstDegAccess().getConfidenceIsInConstantDegradationKeyword_0());
            		
            // InternalAdeptness.g:1574:3: ( (lv_cant_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1575:4: (lv_cant_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1575:4: (lv_cant_1_0= ruleDOUBLE )
            // InternalAdeptness.g:1576:5: lv_cant_1_0= ruleDOUBLE
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
    // InternalAdeptness.g:1597:1: entryRuleHighTime returns [EObject current=null] : iv_ruleHighTime= ruleHighTime EOF ;
    public final EObject entryRuleHighTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighTime = null;


        try {
            // InternalAdeptness.g:1597:49: (iv_ruleHighTime= ruleHighTime EOF )
            // InternalAdeptness.g:1598:2: iv_ruleHighTime= ruleHighTime EOF
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
    // InternalAdeptness.g:1604:1: ruleHighTime returns [EObject current=null] : (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) ) ) ;
    public final EObject ruleHighTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_cant_1_0 = null;

        EObject lv_time_3_0 = null;

        EObject lv_unit_4_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1610:2: ( (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) ) ) )
            // InternalAdeptness.g:1611:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) ) )
            {
            // InternalAdeptness.g:1611:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) ) )
            // InternalAdeptness.g:1612:3: otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getHighTimeAccess().getConfidenceIsBelowKeyword_0());
            		
            // InternalAdeptness.g:1616:3: ( (lv_cant_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1617:4: (lv_cant_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1617:4: (lv_cant_1_0= ruleDOUBLE )
            // InternalAdeptness.g:1618:5: lv_cant_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getHighTimeAccess().getCantDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_39);
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

            otherlv_2=(Token)match(input,46,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getHighTimeAccess().getWithinKeyword_2());
            		
            // InternalAdeptness.g:1639:3: ( (lv_time_3_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1640:4: (lv_time_3_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1640:4: (lv_time_3_0= ruleDOUBLE )
            // InternalAdeptness.g:1641:5: lv_time_3_0= ruleDOUBLE
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

            // InternalAdeptness.g:1658:3: ( (lv_unit_4_0= ruleTimeType ) )
            // InternalAdeptness.g:1659:4: (lv_unit_4_0= ruleTimeType )
            {
            // InternalAdeptness.g:1659:4: (lv_unit_4_0= ruleTimeType )
            // InternalAdeptness.g:1660:5: lv_unit_4_0= ruleTimeType
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
    // InternalAdeptness.g:1681:1: entryRuleHighPeak returns [EObject current=null] : iv_ruleHighPeak= ruleHighPeak EOF ;
    public final EObject entryRuleHighPeak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighPeak = null;


        try {
            // InternalAdeptness.g:1681:49: (iv_ruleHighPeak= ruleHighPeak EOF )
            // InternalAdeptness.g:1682:2: iv_ruleHighPeak= ruleHighPeak EOF
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
    // InternalAdeptness.g:1688:1: ruleHighPeak returns [EObject current=null] : (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleHighPeak() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cant_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1694:2: ( (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) ) )
            // InternalAdeptness.g:1695:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) )
            {
            // InternalAdeptness.g:1695:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) )
            // InternalAdeptness.g:1696:3: otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getHighPeakAccess().getConfidenceIsBelowKeyword_0());
            		
            // InternalAdeptness.g:1700:3: ( (lv_cant_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1701:4: (lv_cant_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1701:4: (lv_cant_1_0= ruleDOUBLE )
            // InternalAdeptness.g:1702:5: lv_cant_1_0= ruleDOUBLE
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
    // InternalAdeptness.g:1723:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalAdeptness.g:1723:50: (iv_ruleReference= ruleReference EOF )
            // InternalAdeptness.g:1724:2: iv_ruleReference= ruleReference EOF
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
    // InternalAdeptness.g:1730:1: ruleReference returns [EObject current=null] : ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) | ( (lv_same_4_0= ruleSame ) ) | ( (lv_notsame_5_0= ruleNotSame ) ) ) otherlv_6= ';' ) ;
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
            // InternalAdeptness.g:1736:2: ( ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) | ( (lv_same_4_0= ruleSame ) ) | ( (lv_notsame_5_0= ruleNotSame ) ) ) otherlv_6= ';' ) )
            // InternalAdeptness.g:1737:2: ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) | ( (lv_same_4_0= ruleSame ) ) | ( (lv_notsame_5_0= ruleNotSame ) ) ) otherlv_6= ';' )
            {
            // InternalAdeptness.g:1737:2: ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) | ( (lv_same_4_0= ruleSame ) ) | ( (lv_notsame_5_0= ruleNotSame ) ) ) otherlv_6= ';' )
            // InternalAdeptness.g:1738:3: ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) | ( (lv_same_4_0= ruleSame ) ) | ( (lv_notsame_5_0= ruleNotSame ) ) ) otherlv_6= ';'
            {
            // InternalAdeptness.g:1738:3: ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) | ( (lv_same_4_0= ruleSame ) ) | ( (lv_notsame_5_0= ruleNotSame ) ) )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt26=1;
                }
                break;
            case 50:
                {
                alt26=2;
                }
                break;
            case 51:
                {
                alt26=3;
                }
                break;
            case 53:
                {
                alt26=4;
                }
                break;
            case 47:
                {
                alt26=5;
                }
                break;
            case 48:
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
                    // InternalAdeptness.g:1739:4: ( (lv_upper_0_0= ruleUpper ) )
                    {
                    // InternalAdeptness.g:1739:4: ( (lv_upper_0_0= ruleUpper ) )
                    // InternalAdeptness.g:1740:5: (lv_upper_0_0= ruleUpper )
                    {
                    // InternalAdeptness.g:1740:5: (lv_upper_0_0= ruleUpper )
                    // InternalAdeptness.g:1741:6: lv_upper_0_0= ruleUpper
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getUpperUpperParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_35);
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
                    // InternalAdeptness.g:1759:4: ( (lv_lower_1_0= ruleLower ) )
                    {
                    // InternalAdeptness.g:1759:4: ( (lv_lower_1_0= ruleLower ) )
                    // InternalAdeptness.g:1760:5: (lv_lower_1_0= ruleLower )
                    {
                    // InternalAdeptness.g:1760:5: (lv_lower_1_0= ruleLower )
                    // InternalAdeptness.g:1761:6: lv_lower_1_0= ruleLower
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getLowerLowerParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_35);
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
                    // InternalAdeptness.g:1779:4: ( (lv_range_2_0= ruleRange ) )
                    {
                    // InternalAdeptness.g:1779:4: ( (lv_range_2_0= ruleRange ) )
                    // InternalAdeptness.g:1780:5: (lv_range_2_0= ruleRange )
                    {
                    // InternalAdeptness.g:1780:5: (lv_range_2_0= ruleRange )
                    // InternalAdeptness.g:1781:6: lv_range_2_0= ruleRange
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getRangeRangeParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_35);
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
                    // InternalAdeptness.g:1799:4: ( (lv_gap_3_0= ruleGap ) )
                    {
                    // InternalAdeptness.g:1799:4: ( (lv_gap_3_0= ruleGap ) )
                    // InternalAdeptness.g:1800:5: (lv_gap_3_0= ruleGap )
                    {
                    // InternalAdeptness.g:1800:5: (lv_gap_3_0= ruleGap )
                    // InternalAdeptness.g:1801:6: lv_gap_3_0= ruleGap
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getGapGapParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_35);
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
                    // InternalAdeptness.g:1819:4: ( (lv_same_4_0= ruleSame ) )
                    {
                    // InternalAdeptness.g:1819:4: ( (lv_same_4_0= ruleSame ) )
                    // InternalAdeptness.g:1820:5: (lv_same_4_0= ruleSame )
                    {
                    // InternalAdeptness.g:1820:5: (lv_same_4_0= ruleSame )
                    // InternalAdeptness.g:1821:6: lv_same_4_0= ruleSame
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getSameSameParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_35);
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
                    // InternalAdeptness.g:1839:4: ( (lv_notsame_5_0= ruleNotSame ) )
                    {
                    // InternalAdeptness.g:1839:4: ( (lv_notsame_5_0= ruleNotSame ) )
                    // InternalAdeptness.g:1840:5: (lv_notsame_5_0= ruleNotSame )
                    {
                    // InternalAdeptness.g:1840:5: (lv_notsame_5_0= ruleNotSame )
                    // InternalAdeptness.g:1841:6: lv_notsame_5_0= ruleNotSame
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getNotsameNotSameParserRuleCall_0_5_0());
                    					
                    pushFollow(FOLLOW_35);
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

            otherlv_6=(Token)match(input,41,FOLLOW_2); 

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
    // InternalAdeptness.g:1867:1: entryRuleSame returns [EObject current=null] : iv_ruleSame= ruleSame EOF ;
    public final EObject entryRuleSame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSame = null;


        try {
            // InternalAdeptness.g:1867:45: (iv_ruleSame= ruleSame EOF )
            // InternalAdeptness.g:1868:2: iv_ruleSame= ruleSame EOF
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
    // InternalAdeptness.g:1874:1: ruleSame returns [EObject current=null] : (otherlv_0= 'should be' ( (lv_bound_upp_1_0= ruleBound_up ) ) ) ;
    public final EObject ruleSame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bound_upp_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1880:2: ( (otherlv_0= 'should be' ( (lv_bound_upp_1_0= ruleBound_up ) ) ) )
            // InternalAdeptness.g:1881:2: (otherlv_0= 'should be' ( (lv_bound_upp_1_0= ruleBound_up ) ) )
            {
            // InternalAdeptness.g:1881:2: (otherlv_0= 'should be' ( (lv_bound_upp_1_0= ruleBound_up ) ) )
            // InternalAdeptness.g:1882:3: otherlv_0= 'should be' ( (lv_bound_upp_1_0= ruleBound_up ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getSameAccess().getShouldBeKeyword_0());
            		
            // InternalAdeptness.g:1886:3: ( (lv_bound_upp_1_0= ruleBound_up ) )
            // InternalAdeptness.g:1887:4: (lv_bound_upp_1_0= ruleBound_up )
            {
            // InternalAdeptness.g:1887:4: (lv_bound_upp_1_0= ruleBound_up )
            // InternalAdeptness.g:1888:5: lv_bound_upp_1_0= ruleBound_up
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
    // InternalAdeptness.g:1909:1: entryRuleNotSame returns [EObject current=null] : iv_ruleNotSame= ruleNotSame EOF ;
    public final EObject entryRuleNotSame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotSame = null;


        try {
            // InternalAdeptness.g:1909:48: (iv_ruleNotSame= ruleNotSame EOF )
            // InternalAdeptness.g:1910:2: iv_ruleNotSame= ruleNotSame EOF
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
    // InternalAdeptness.g:1916:1: ruleNotSame returns [EObject current=null] : (otherlv_0= 'should not be' ( (lv_bound_upp_1_0= ruleBound_up ) ) ) ;
    public final EObject ruleNotSame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bound_upp_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1922:2: ( (otherlv_0= 'should not be' ( (lv_bound_upp_1_0= ruleBound_up ) ) ) )
            // InternalAdeptness.g:1923:2: (otherlv_0= 'should not be' ( (lv_bound_upp_1_0= ruleBound_up ) ) )
            {
            // InternalAdeptness.g:1923:2: (otherlv_0= 'should not be' ( (lv_bound_upp_1_0= ruleBound_up ) ) )
            // InternalAdeptness.g:1924:3: otherlv_0= 'should not be' ( (lv_bound_upp_1_0= ruleBound_up ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getNotSameAccess().getShouldNotBeKeyword_0());
            		
            // InternalAdeptness.g:1928:3: ( (lv_bound_upp_1_0= ruleBound_up ) )
            // InternalAdeptness.g:1929:4: (lv_bound_upp_1_0= ruleBound_up )
            {
            // InternalAdeptness.g:1929:4: (lv_bound_upp_1_0= ruleBound_up )
            // InternalAdeptness.g:1930:5: lv_bound_upp_1_0= ruleBound_up
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
    // InternalAdeptness.g:1951:1: entryRuleUpper returns [EObject current=null] : iv_ruleUpper= ruleUpper EOF ;
    public final EObject entryRuleUpper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpper = null;


        try {
            // InternalAdeptness.g:1951:46: (iv_ruleUpper= ruleUpper EOF )
            // InternalAdeptness.g:1952:2: iv_ruleUpper= ruleUpper EOF
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
    // InternalAdeptness.g:1958:1: ruleUpper returns [EObject current=null] : (otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) ) ) ;
    public final EObject ruleUpper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bound_upp_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1964:2: ( (otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) ) ) )
            // InternalAdeptness.g:1965:2: (otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) ) )
            {
            // InternalAdeptness.g:1965:2: (otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) ) )
            // InternalAdeptness.g:1966:3: otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getUpperAccess().getIsBelowKeyword_0());
            		
            // InternalAdeptness.g:1970:3: ( (lv_bound_upp_1_0= ruleBound_up ) )
            // InternalAdeptness.g:1971:4: (lv_bound_upp_1_0= ruleBound_up )
            {
            // InternalAdeptness.g:1971:4: (lv_bound_upp_1_0= ruleBound_up )
            // InternalAdeptness.g:1972:5: lv_bound_upp_1_0= ruleBound_up
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
    // InternalAdeptness.g:1993:1: entryRuleLower returns [EObject current=null] : iv_ruleLower= ruleLower EOF ;
    public final EObject entryRuleLower() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLower = null;


        try {
            // InternalAdeptness.g:1993:46: (iv_ruleLower= ruleLower EOF )
            // InternalAdeptness.g:1994:2: iv_ruleLower= ruleLower EOF
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
    // InternalAdeptness.g:2000:1: ruleLower returns [EObject current=null] : (otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) ) ) ;
    public final EObject ruleLower() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bound_lower_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2006:2: ( (otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) ) ) )
            // InternalAdeptness.g:2007:2: (otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) ) )
            {
            // InternalAdeptness.g:2007:2: (otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) ) )
            // InternalAdeptness.g:2008:3: otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getLowerAccess().getIsAboveKeyword_0());
            		
            // InternalAdeptness.g:2012:3: ( (lv_bound_lower_1_0= ruleBound_Down ) )
            // InternalAdeptness.g:2013:4: (lv_bound_lower_1_0= ruleBound_Down )
            {
            // InternalAdeptness.g:2013:4: (lv_bound_lower_1_0= ruleBound_Down )
            // InternalAdeptness.g:2014:5: lv_bound_lower_1_0= ruleBound_Down
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
    // InternalAdeptness.g:2035:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalAdeptness.g:2035:46: (iv_ruleRange= ruleRange EOF )
            // InternalAdeptness.g:2036:2: iv_ruleRange= ruleRange EOF
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
    // InternalAdeptness.g:2042:1: ruleRange returns [EObject current=null] : (otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_bound_lower_1_0 = null;

        EObject lv_bound_upp_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2048:2: ( (otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ) )
            // InternalAdeptness.g:2049:2: (otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) )
            {
            // InternalAdeptness.g:2049:2: (otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) )
            // InternalAdeptness.g:2050:3: otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getIsInRangeBetweenKeyword_0());
            		
            // InternalAdeptness.g:2054:3: ( (lv_bound_lower_1_0= ruleBound_Down ) )
            // InternalAdeptness.g:2055:4: (lv_bound_lower_1_0= ruleBound_Down )
            {
            // InternalAdeptness.g:2055:4: (lv_bound_lower_1_0= ruleBound_Down )
            // InternalAdeptness.g:2056:5: lv_bound_lower_1_0= ruleBound_Down
            {

            					newCompositeNode(grammarAccess.getRangeAccess().getBound_lowerBound_DownParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
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

            otherlv_2=(Token)match(input,52,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getAndKeyword_2());
            		
            // InternalAdeptness.g:2077:3: ( (lv_bound_upp_3_0= ruleBound_up ) )
            // InternalAdeptness.g:2078:4: (lv_bound_upp_3_0= ruleBound_up )
            {
            // InternalAdeptness.g:2078:4: (lv_bound_upp_3_0= ruleBound_up )
            // InternalAdeptness.g:2079:5: lv_bound_upp_3_0= ruleBound_up
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
    // InternalAdeptness.g:2100:1: entryRuleGap returns [EObject current=null] : iv_ruleGap= ruleGap EOF ;
    public final EObject entryRuleGap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGap = null;


        try {
            // InternalAdeptness.g:2100:44: (iv_ruleGap= ruleGap EOF )
            // InternalAdeptness.g:2101:2: iv_ruleGap= ruleGap EOF
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
    // InternalAdeptness.g:2107:1: ruleGap returns [EObject current=null] : (otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ) ;
    public final EObject ruleGap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_bound_lower_1_0 = null;

        EObject lv_bound_upp_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2113:2: ( (otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ) )
            // InternalAdeptness.g:2114:2: (otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) )
            {
            // InternalAdeptness.g:2114:2: (otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) )
            // InternalAdeptness.g:2115:3: otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getGapAccess().getNotInRangeBetweenKeyword_0());
            		
            // InternalAdeptness.g:2119:3: ( (lv_bound_lower_1_0= ruleBound_Down ) )
            // InternalAdeptness.g:2120:4: (lv_bound_lower_1_0= ruleBound_Down )
            {
            // InternalAdeptness.g:2120:4: (lv_bound_lower_1_0= ruleBound_Down )
            // InternalAdeptness.g:2121:5: lv_bound_lower_1_0= ruleBound_Down
            {

            					newCompositeNode(grammarAccess.getGapAccess().getBound_lowerBound_DownParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
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

            otherlv_2=(Token)match(input,52,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getGapAccess().getAndKeyword_2());
            		
            // InternalAdeptness.g:2142:3: ( (lv_bound_upp_3_0= ruleBound_up ) )
            // InternalAdeptness.g:2143:4: (lv_bound_upp_3_0= ruleBound_up )
            {
            // InternalAdeptness.g:2143:4: (lv_bound_upp_3_0= ruleBound_up )
            // InternalAdeptness.g:2144:5: lv_bound_upp_3_0= ruleBound_up
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
    // InternalAdeptness.g:2165:1: entryRuleBound_up returns [EObject current=null] : iv_ruleBound_up= ruleBound_up EOF ;
    public final EObject entryRuleBound_up() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBound_up = null;


        try {
            // InternalAdeptness.g:2165:49: (iv_ruleBound_up= ruleBound_up EOF )
            // InternalAdeptness.g:2166:2: iv_ruleBound_up= ruleBound_up EOF
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
    // InternalAdeptness.g:2172:1: ruleBound_up returns [EObject current=null] : ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_em_1_0= ruleExpressionsModel ) ) ) ;
    public final EObject ruleBound_up() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_em_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2178:2: ( ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_em_1_0= ruleExpressionsModel ) ) ) )
            // InternalAdeptness.g:2179:2: ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_em_1_0= ruleExpressionsModel ) ) )
            {
            // InternalAdeptness.g:2179:2: ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_em_1_0= ruleExpressionsModel ) ) )
            int alt27=2;
            switch ( input.LA(1) ) {
            case 56:
                {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==RULE_INT) ) {
                    alt27=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt27=1;
                }
                break;
            case EOF:
            case RULE_ID:
            case 36:
            case 41:
            case 65:
                {
                alt27=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalAdeptness.g:2180:3: ( (lv_value_0_0= ruleDOUBLE ) )
                    {
                    // InternalAdeptness.g:2180:3: ( (lv_value_0_0= ruleDOUBLE ) )
                    // InternalAdeptness.g:2181:4: (lv_value_0_0= ruleDOUBLE )
                    {
                    // InternalAdeptness.g:2181:4: (lv_value_0_0= ruleDOUBLE )
                    // InternalAdeptness.g:2182:5: lv_value_0_0= ruleDOUBLE
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
                    // InternalAdeptness.g:2200:3: ( (lv_em_1_0= ruleExpressionsModel ) )
                    {
                    // InternalAdeptness.g:2200:3: ( (lv_em_1_0= ruleExpressionsModel ) )
                    // InternalAdeptness.g:2201:4: (lv_em_1_0= ruleExpressionsModel )
                    {
                    // InternalAdeptness.g:2201:4: (lv_em_1_0= ruleExpressionsModel )
                    // InternalAdeptness.g:2202:5: lv_em_1_0= ruleExpressionsModel
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
    // InternalAdeptness.g:2223:1: entryRuleBound_Down returns [EObject current=null] : iv_ruleBound_Down= ruleBound_Down EOF ;
    public final EObject entryRuleBound_Down() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBound_Down = null;


        try {
            // InternalAdeptness.g:2223:51: (iv_ruleBound_Down= ruleBound_Down EOF )
            // InternalAdeptness.g:2224:2: iv_ruleBound_Down= ruleBound_Down EOF
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
    // InternalAdeptness.g:2230:1: ruleBound_Down returns [EObject current=null] : ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_em_1_0= ruleExpressionsModel ) ) ) ;
    public final EObject ruleBound_Down() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_em_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2236:2: ( ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_em_1_0= ruleExpressionsModel ) ) ) )
            // InternalAdeptness.g:2237:2: ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_em_1_0= ruleExpressionsModel ) ) )
            {
            // InternalAdeptness.g:2237:2: ( ( (lv_value_0_0= ruleDOUBLE ) ) | ( (lv_em_1_0= ruleExpressionsModel ) ) )
            int alt28=2;
            switch ( input.LA(1) ) {
            case 56:
                {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==RULE_INT) ) {
                    alt28=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt28=1;
                }
                break;
            case EOF:
            case RULE_ID:
            case 36:
            case 41:
            case 52:
            case 65:
                {
                alt28=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalAdeptness.g:2238:3: ( (lv_value_0_0= ruleDOUBLE ) )
                    {
                    // InternalAdeptness.g:2238:3: ( (lv_value_0_0= ruleDOUBLE ) )
                    // InternalAdeptness.g:2239:4: (lv_value_0_0= ruleDOUBLE )
                    {
                    // InternalAdeptness.g:2239:4: (lv_value_0_0= ruleDOUBLE )
                    // InternalAdeptness.g:2240:5: lv_value_0_0= ruleDOUBLE
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
                    // InternalAdeptness.g:2258:3: ( (lv_em_1_0= ruleExpressionsModel ) )
                    {
                    // InternalAdeptness.g:2258:3: ( (lv_em_1_0= ruleExpressionsModel ) )
                    // InternalAdeptness.g:2259:4: (lv_em_1_0= ruleExpressionsModel )
                    {
                    // InternalAdeptness.g:2259:4: (lv_em_1_0= ruleExpressionsModel )
                    // InternalAdeptness.g:2260:5: lv_em_1_0= ruleExpressionsModel
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
    // InternalAdeptness.g:2281:1: entryRuleBOOLEAN returns [EObject current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final EObject entryRuleBOOLEAN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOOLEAN = null;


        try {
            // InternalAdeptness.g:2281:48: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalAdeptness.g:2282:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
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
    // InternalAdeptness.g:2288:1: ruleBOOLEAN returns [EObject current=null] : ( (lv_bool_0_0= ruleb ) ) ;
    public final EObject ruleBOOLEAN() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_bool_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2294:2: ( ( (lv_bool_0_0= ruleb ) ) )
            // InternalAdeptness.g:2295:2: ( (lv_bool_0_0= ruleb ) )
            {
            // InternalAdeptness.g:2295:2: ( (lv_bool_0_0= ruleb ) )
            // InternalAdeptness.g:2296:3: (lv_bool_0_0= ruleb )
            {
            // InternalAdeptness.g:2296:3: (lv_bool_0_0= ruleb )
            // InternalAdeptness.g:2297:4: lv_bool_0_0= ruleb
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
    // InternalAdeptness.g:2317:1: entryRuleb returns [String current=null] : iv_ruleb= ruleb EOF ;
    public final String entryRuleb() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleb = null;


        try {
            // InternalAdeptness.g:2317:41: (iv_ruleb= ruleb EOF )
            // InternalAdeptness.g:2318:2: iv_ruleb= ruleb EOF
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
    // InternalAdeptness.g:2324:1: ruleb returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleb() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdeptness.g:2330:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalAdeptness.g:2331:2: (kw= 'true' | kw= 'false' )
            {
            // InternalAdeptness.g:2331:2: (kw= 'true' | kw= 'false' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==54) ) {
                alt29=1;
            }
            else if ( (LA29_0==55) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalAdeptness.g:2332:3: kw= 'true'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2338:3: kw= 'false'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

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
    // InternalAdeptness.g:2347:1: entryRuleDOUBLE returns [EObject current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final EObject entryRuleDOUBLE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOUBLE = null;


        try {
            // InternalAdeptness.g:2347:47: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalAdeptness.g:2348:2: iv_ruleDOUBLE= ruleDOUBLE EOF
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
    // InternalAdeptness.g:2354:1: ruleDOUBLE returns [EObject current=null] : ( (lv_dVal_0_0= ruled ) ) ;
    public final EObject ruleDOUBLE() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_dVal_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2360:2: ( ( (lv_dVal_0_0= ruled ) ) )
            // InternalAdeptness.g:2361:2: ( (lv_dVal_0_0= ruled ) )
            {
            // InternalAdeptness.g:2361:2: ( (lv_dVal_0_0= ruled ) )
            // InternalAdeptness.g:2362:3: (lv_dVal_0_0= ruled )
            {
            // InternalAdeptness.g:2362:3: (lv_dVal_0_0= ruled )
            // InternalAdeptness.g:2363:4: lv_dVal_0_0= ruled
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
    // InternalAdeptness.g:2383:1: entryRuled returns [String current=null] : iv_ruled= ruled EOF ;
    public final String entryRuled() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruled = null;


        try {
            // InternalAdeptness.g:2383:41: (iv_ruled= ruled EOF )
            // InternalAdeptness.g:2384:2: iv_ruled= ruled EOF
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
    // InternalAdeptness.g:2390:1: ruled returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruled() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalAdeptness.g:2396:2: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // InternalAdeptness.g:2397:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // InternalAdeptness.g:2397:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // InternalAdeptness.g:2398:3: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // InternalAdeptness.g:2398:3: (kw= '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==56) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAdeptness.g:2399:4: kw= '-'
                    {
                    kw=(Token)match(input,56,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_6); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getDAccess().getINTTerminalRuleCall_1());
            		
            // InternalAdeptness.g:2412:3: (kw= '.' this_INT_3= RULE_INT )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==13) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAdeptness.g:2413:4: kw= '.' this_INT_3= RULE_INT
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
    // InternalAdeptness.g:2430:1: entryRuleTimeType returns [EObject current=null] : iv_ruleTimeType= ruleTimeType EOF ;
    public final EObject entryRuleTimeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeType = null;


        try {
            // InternalAdeptness.g:2430:49: (iv_ruleTimeType= ruleTimeType EOF )
            // InternalAdeptness.g:2431:2: iv_ruleTimeType= ruleTimeType EOF
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
    // InternalAdeptness.g:2437:1: ruleTimeType returns [EObject current=null] : ( ( (lv_time_0_0= 'miliseconds' ) ) | ( (lv_time_1_0= 'seconds' ) ) | ( (lv_time_2_0= 'minutes' ) ) | ( (lv_time_3_0= 'hours' ) ) ) ;
    public final EObject ruleTimeType() throws RecognitionException {
        EObject current = null;

        Token lv_time_0_0=null;
        Token lv_time_1_0=null;
        Token lv_time_2_0=null;
        Token lv_time_3_0=null;


        	enterRule();

        try {
            // InternalAdeptness.g:2443:2: ( ( ( (lv_time_0_0= 'miliseconds' ) ) | ( (lv_time_1_0= 'seconds' ) ) | ( (lv_time_2_0= 'minutes' ) ) | ( (lv_time_3_0= 'hours' ) ) ) )
            // InternalAdeptness.g:2444:2: ( ( (lv_time_0_0= 'miliseconds' ) ) | ( (lv_time_1_0= 'seconds' ) ) | ( (lv_time_2_0= 'minutes' ) ) | ( (lv_time_3_0= 'hours' ) ) )
            {
            // InternalAdeptness.g:2444:2: ( ( (lv_time_0_0= 'miliseconds' ) ) | ( (lv_time_1_0= 'seconds' ) ) | ( (lv_time_2_0= 'minutes' ) ) | ( (lv_time_3_0= 'hours' ) ) )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt32=1;
                }
                break;
            case 58:
                {
                alt32=2;
                }
                break;
            case 59:
                {
                alt32=3;
                }
                break;
            case 60:
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
                    // InternalAdeptness.g:2445:3: ( (lv_time_0_0= 'miliseconds' ) )
                    {
                    // InternalAdeptness.g:2445:3: ( (lv_time_0_0= 'miliseconds' ) )
                    // InternalAdeptness.g:2446:4: (lv_time_0_0= 'miliseconds' )
                    {
                    // InternalAdeptness.g:2446:4: (lv_time_0_0= 'miliseconds' )
                    // InternalAdeptness.g:2447:5: lv_time_0_0= 'miliseconds'
                    {
                    lv_time_0_0=(Token)match(input,57,FOLLOW_2); 

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
                    // InternalAdeptness.g:2460:3: ( (lv_time_1_0= 'seconds' ) )
                    {
                    // InternalAdeptness.g:2460:3: ( (lv_time_1_0= 'seconds' ) )
                    // InternalAdeptness.g:2461:4: (lv_time_1_0= 'seconds' )
                    {
                    // InternalAdeptness.g:2461:4: (lv_time_1_0= 'seconds' )
                    // InternalAdeptness.g:2462:5: lv_time_1_0= 'seconds'
                    {
                    lv_time_1_0=(Token)match(input,58,FOLLOW_2); 

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
                    // InternalAdeptness.g:2475:3: ( (lv_time_2_0= 'minutes' ) )
                    {
                    // InternalAdeptness.g:2475:3: ( (lv_time_2_0= 'minutes' ) )
                    // InternalAdeptness.g:2476:4: (lv_time_2_0= 'minutes' )
                    {
                    // InternalAdeptness.g:2476:4: (lv_time_2_0= 'minutes' )
                    // InternalAdeptness.g:2477:5: lv_time_2_0= 'minutes'
                    {
                    lv_time_2_0=(Token)match(input,59,FOLLOW_2); 

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
                    // InternalAdeptness.g:2490:3: ( (lv_time_3_0= 'hours' ) )
                    {
                    // InternalAdeptness.g:2490:3: ( (lv_time_3_0= 'hours' ) )
                    // InternalAdeptness.g:2491:4: (lv_time_3_0= 'hours' )
                    {
                    // InternalAdeptness.g:2491:4: (lv_time_3_0= 'hours' )
                    // InternalAdeptness.g:2492:5: lv_time_3_0= 'hours'
                    {
                    lv_time_3_0=(Token)match(input,60,FOLLOW_2); 

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
    // InternalAdeptness.g:2508:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalAdeptness.g:2508:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalAdeptness.g:2509:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalAdeptness.g:2515:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAdeptness.g:2521:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAdeptness.g:2522:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAdeptness.g:2522:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAdeptness.g:2523:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalAdeptness.g:2527:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:2528:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:2528:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:2529:5: lv_name_1_0= RULE_ID
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
    // InternalAdeptness.g:2549:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalAdeptness.g:2549:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalAdeptness.g:2550:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
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
    // InternalAdeptness.g:2556:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2562:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // InternalAdeptness.g:2563:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // InternalAdeptness.g:2563:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // InternalAdeptness.g:2564:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
            		
            // InternalAdeptness.g:2568:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAdeptness.g:2569:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAdeptness.g:2569:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAdeptness.g:2570:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_41);
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

            otherlv_2=(Token)match(input,63,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAdeptness.g:2591:3: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==11||LA33_0==14||LA33_0==25||(LA33_0>=61 && LA33_0<=62)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAdeptness.g:2592:4: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // InternalAdeptness.g:2592:4: (lv_elements_3_0= ruleAbstractElement )
            	    // InternalAdeptness.g:2593:5: lv_elements_3_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_42);
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
            	    break loop33;
                }
            } while (true);

            otherlv_4=(Token)match(input,64,FOLLOW_2); 

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
    // InternalAdeptness.g:2618:1: entryRuleExpressionsModel returns [EObject current=null] : iv_ruleExpressionsModel= ruleExpressionsModel EOF ;
    public final EObject entryRuleExpressionsModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionsModel = null;


        try {
            // InternalAdeptness.g:2618:57: (iv_ruleExpressionsModel= ruleExpressionsModel EOF )
            // InternalAdeptness.g:2619:2: iv_ruleExpressionsModel= ruleExpressionsModel EOF
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
    // InternalAdeptness.g:2625:1: ruleExpressionsModel returns [EObject current=null] : ( (otherlv_0= '(' )? ( (lv_elements_1_0= ruleAbstractElement2 ) )* (otherlv_2= ')' )? ) ;
    public final EObject ruleExpressionsModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2631:2: ( ( (otherlv_0= '(' )? ( (lv_elements_1_0= ruleAbstractElement2 ) )* (otherlv_2= ')' )? ) )
            // InternalAdeptness.g:2632:2: ( (otherlv_0= '(' )? ( (lv_elements_1_0= ruleAbstractElement2 ) )* (otherlv_2= ')' )? )
            {
            // InternalAdeptness.g:2632:2: ( (otherlv_0= '(' )? ( (lv_elements_1_0= ruleAbstractElement2 ) )* (otherlv_2= ')' )? )
            // InternalAdeptness.g:2633:3: (otherlv_0= '(' )? ( (lv_elements_1_0= ruleAbstractElement2 ) )* (otherlv_2= ')' )?
            {
            // InternalAdeptness.g:2633:3: (otherlv_0= '(' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==65) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAdeptness.g:2634:4: otherlv_0= '('
                    {
                    otherlv_0=(Token)match(input,65,FOLLOW_43); 

                    				newLeafNode(otherlv_0, grammarAccess.getExpressionsModelAccess().getLeftParenthesisKeyword_0());
                    			

                    }
                    break;

            }

            // InternalAdeptness.g:2639:3: ( (lv_elements_1_0= ruleAbstractElement2 ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_INT)||LA35_0==56||LA35_0==65) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAdeptness.g:2640:4: (lv_elements_1_0= ruleAbstractElement2 )
            	    {
            	    // InternalAdeptness.g:2640:4: (lv_elements_1_0= ruleAbstractElement2 )
            	    // InternalAdeptness.g:2641:5: lv_elements_1_0= ruleAbstractElement2
            	    {

            	    					newCompositeNode(grammarAccess.getExpressionsModelAccess().getElementsAbstractElement2ParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_elements_1_0=ruleAbstractElement2();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExpressionsModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"org.xtext.example.mydsl.Adeptness.AbstractElement2");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // InternalAdeptness.g:2658:3: (otherlv_2= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==36) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAdeptness.g:2659:4: otherlv_2= ')'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getExpressionsModelAccess().getRightParenthesisKeyword_2());
                    			

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
    // $ANTLR end "ruleExpressionsModel"


    // $ANTLR start "entryRuleAbstractElement2"
    // InternalAdeptness.g:2668:1: entryRuleAbstractElement2 returns [EObject current=null] : iv_ruleAbstractElement2= ruleAbstractElement2 EOF ;
    public final EObject entryRuleAbstractElement2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement2 = null;


        try {
            // InternalAdeptness.g:2668:57: (iv_ruleAbstractElement2= ruleAbstractElement2 EOF )
            // InternalAdeptness.g:2669:2: iv_ruleAbstractElement2= ruleAbstractElement2 EOF
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
    // InternalAdeptness.g:2675:1: ruleAbstractElement2 returns [EObject current=null] : ( (otherlv_0= '(' )* ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_value_2_0= ruleDOUBLE ) ) ) ( (lv_op_3_0= ruleOperators ) )* (otherlv_4= ')' )* ) ;
    public final EObject ruleAbstractElement2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        EObject lv_value_2_0 = null;

        EObject lv_op_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2681:2: ( ( (otherlv_0= '(' )* ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_value_2_0= ruleDOUBLE ) ) ) ( (lv_op_3_0= ruleOperators ) )* (otherlv_4= ')' )* ) )
            // InternalAdeptness.g:2682:2: ( (otherlv_0= '(' )* ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_value_2_0= ruleDOUBLE ) ) ) ( (lv_op_3_0= ruleOperators ) )* (otherlv_4= ')' )* )
            {
            // InternalAdeptness.g:2682:2: ( (otherlv_0= '(' )* ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_value_2_0= ruleDOUBLE ) ) ) ( (lv_op_3_0= ruleOperators ) )* (otherlv_4= ')' )* )
            // InternalAdeptness.g:2683:3: (otherlv_0= '(' )* ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_value_2_0= ruleDOUBLE ) ) ) ( (lv_op_3_0= ruleOperators ) )* (otherlv_4= ')' )*
            {
            // InternalAdeptness.g:2683:3: (otherlv_0= '(' )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==65) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalAdeptness.g:2684:4: otherlv_0= '('
            	    {
            	    otherlv_0=(Token)match(input,65,FOLLOW_44); 

            	    				newLeafNode(otherlv_0, grammarAccess.getAbstractElement2Access().getLeftParenthesisKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // InternalAdeptness.g:2689:3: ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_value_2_0= ruleDOUBLE ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_INT||LA38_0==56) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalAdeptness.g:2690:4: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalAdeptness.g:2690:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalAdeptness.g:2691:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalAdeptness.g:2691:5: (lv_name_1_0= RULE_ID )
                    // InternalAdeptness.g:2692:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_45); 

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
                    // InternalAdeptness.g:2709:4: ( (lv_value_2_0= ruleDOUBLE ) )
                    {
                    // InternalAdeptness.g:2709:4: ( (lv_value_2_0= ruleDOUBLE ) )
                    // InternalAdeptness.g:2710:5: (lv_value_2_0= ruleDOUBLE )
                    {
                    // InternalAdeptness.g:2710:5: (lv_value_2_0= ruleDOUBLE )
                    // InternalAdeptness.g:2711:6: lv_value_2_0= ruleDOUBLE
                    {

                    						newCompositeNode(grammarAccess.getAbstractElement2Access().getValueDOUBLEParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_45);
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

            // InternalAdeptness.g:2729:3: ( (lv_op_3_0= ruleOperators ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==36) ) {
                    alt39=1;
                }
                else if ( (LA39_0==56||(LA39_0>=66 && LA39_0<=76)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAdeptness.g:2730:4: (lv_op_3_0= ruleOperators )
            	    {
            	    // InternalAdeptness.g:2730:4: (lv_op_3_0= ruleOperators )
            	    // InternalAdeptness.g:2731:5: lv_op_3_0= ruleOperators
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractElement2Access().getOpOperatorsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_45);
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
            	    break loop39;
                }
            } while (true);

            // InternalAdeptness.g:2748:3: (otherlv_4= ')' )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==36) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAdeptness.g:2749:4: otherlv_4= ')'
            	    {
            	    otherlv_4=(Token)match(input,36,FOLLOW_46); 

            	    				newLeafNode(otherlv_4, grammarAccess.getAbstractElement2Access().getRightParenthesisKeyword_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop40;
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


    // $ANTLR start "entryRuleOperators"
    // InternalAdeptness.g:2758:1: entryRuleOperators returns [EObject current=null] : iv_ruleOperators= ruleOperators EOF ;
    public final EObject entryRuleOperators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperators = null;


        try {
            // InternalAdeptness.g:2758:50: (iv_ruleOperators= ruleOperators EOF )
            // InternalAdeptness.g:2759:2: iv_ruleOperators= ruleOperators EOF
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
    // InternalAdeptness.g:2765:1: ruleOperators returns [EObject current=null] : ( ( (lv_operator_0_0= ruleOp ) ) | ( (lv_comparation_1_0= ruleCompOp ) ) | ( (lv_logicOperator_2_0= ruleLogicOp ) ) | otherlv_3= ')' ) ;
    public final EObject ruleOperators() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_comparation_1_0 = null;

        EObject lv_logicOperator_2_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2771:2: ( ( ( (lv_operator_0_0= ruleOp ) ) | ( (lv_comparation_1_0= ruleCompOp ) ) | ( (lv_logicOperator_2_0= ruleLogicOp ) ) | otherlv_3= ')' ) )
            // InternalAdeptness.g:2772:2: ( ( (lv_operator_0_0= ruleOp ) ) | ( (lv_comparation_1_0= ruleCompOp ) ) | ( (lv_logicOperator_2_0= ruleLogicOp ) ) | otherlv_3= ')' )
            {
            // InternalAdeptness.g:2772:2: ( ( (lv_operator_0_0= ruleOp ) ) | ( (lv_comparation_1_0= ruleCompOp ) ) | ( (lv_logicOperator_2_0= ruleLogicOp ) ) | otherlv_3= ')' )
            int alt41=4;
            switch ( input.LA(1) ) {
            case 56:
            case 74:
            case 75:
            case 76:
                {
                alt41=1;
                }
                break;
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
                {
                alt41=2;
                }
                break;
            case 72:
            case 73:
                {
                alt41=3;
                }
                break;
            case 36:
                {
                alt41=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalAdeptness.g:2773:3: ( (lv_operator_0_0= ruleOp ) )
                    {
                    // InternalAdeptness.g:2773:3: ( (lv_operator_0_0= ruleOp ) )
                    // InternalAdeptness.g:2774:4: (lv_operator_0_0= ruleOp )
                    {
                    // InternalAdeptness.g:2774:4: (lv_operator_0_0= ruleOp )
                    // InternalAdeptness.g:2775:5: lv_operator_0_0= ruleOp
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
                    // InternalAdeptness.g:2793:3: ( (lv_comparation_1_0= ruleCompOp ) )
                    {
                    // InternalAdeptness.g:2793:3: ( (lv_comparation_1_0= ruleCompOp ) )
                    // InternalAdeptness.g:2794:4: (lv_comparation_1_0= ruleCompOp )
                    {
                    // InternalAdeptness.g:2794:4: (lv_comparation_1_0= ruleCompOp )
                    // InternalAdeptness.g:2795:5: lv_comparation_1_0= ruleCompOp
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
                    // InternalAdeptness.g:2813:3: ( (lv_logicOperator_2_0= ruleLogicOp ) )
                    {
                    // InternalAdeptness.g:2813:3: ( (lv_logicOperator_2_0= ruleLogicOp ) )
                    // InternalAdeptness.g:2814:4: (lv_logicOperator_2_0= ruleLogicOp )
                    {
                    // InternalAdeptness.g:2814:4: (lv_logicOperator_2_0= ruleLogicOp )
                    // InternalAdeptness.g:2815:5: lv_logicOperator_2_0= ruleLogicOp
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
                    // InternalAdeptness.g:2833:3: otherlv_3= ')'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_2); 

                    			newLeafNode(otherlv_3, grammarAccess.getOperatorsAccess().getRightParenthesisKeyword_3());
                    		

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


    // $ANTLR start "entryRuleCompOp"
    // InternalAdeptness.g:2841:1: entryRuleCompOp returns [EObject current=null] : iv_ruleCompOp= ruleCompOp EOF ;
    public final EObject entryRuleCompOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompOp = null;


        try {
            // InternalAdeptness.g:2841:47: (iv_ruleCompOp= ruleCompOp EOF )
            // InternalAdeptness.g:2842:2: iv_ruleCompOp= ruleCompOp EOF
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
    // InternalAdeptness.g:2848:1: ruleCompOp returns [EObject current=null] : ( ( (lv_op_0_1= '==' | lv_op_0_2= '!=' | lv_op_0_3= '>=' | lv_op_0_4= '<=' | lv_op_0_5= '<' | lv_op_0_6= '>' ) ) ) ;
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
            // InternalAdeptness.g:2854:2: ( ( ( (lv_op_0_1= '==' | lv_op_0_2= '!=' | lv_op_0_3= '>=' | lv_op_0_4= '<=' | lv_op_0_5= '<' | lv_op_0_6= '>' ) ) ) )
            // InternalAdeptness.g:2855:2: ( ( (lv_op_0_1= '==' | lv_op_0_2= '!=' | lv_op_0_3= '>=' | lv_op_0_4= '<=' | lv_op_0_5= '<' | lv_op_0_6= '>' ) ) )
            {
            // InternalAdeptness.g:2855:2: ( ( (lv_op_0_1= '==' | lv_op_0_2= '!=' | lv_op_0_3= '>=' | lv_op_0_4= '<=' | lv_op_0_5= '<' | lv_op_0_6= '>' ) ) )
            // InternalAdeptness.g:2856:3: ( (lv_op_0_1= '==' | lv_op_0_2= '!=' | lv_op_0_3= '>=' | lv_op_0_4= '<=' | lv_op_0_5= '<' | lv_op_0_6= '>' ) )
            {
            // InternalAdeptness.g:2856:3: ( (lv_op_0_1= '==' | lv_op_0_2= '!=' | lv_op_0_3= '>=' | lv_op_0_4= '<=' | lv_op_0_5= '<' | lv_op_0_6= '>' ) )
            // InternalAdeptness.g:2857:4: (lv_op_0_1= '==' | lv_op_0_2= '!=' | lv_op_0_3= '>=' | lv_op_0_4= '<=' | lv_op_0_5= '<' | lv_op_0_6= '>' )
            {
            // InternalAdeptness.g:2857:4: (lv_op_0_1= '==' | lv_op_0_2= '!=' | lv_op_0_3= '>=' | lv_op_0_4= '<=' | lv_op_0_5= '<' | lv_op_0_6= '>' )
            int alt42=6;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt42=1;
                }
                break;
            case 67:
                {
                alt42=2;
                }
                break;
            case 68:
                {
                alt42=3;
                }
                break;
            case 69:
                {
                alt42=4;
                }
                break;
            case 70:
                {
                alt42=5;
                }
                break;
            case 71:
                {
                alt42=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalAdeptness.g:2858:5: lv_op_0_1= '=='
                    {
                    lv_op_0_1=(Token)match(input,66,FOLLOW_2); 

                    					newLeafNode(lv_op_0_1, grammarAccess.getCompOpAccess().getOpEqualsSignEqualsSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCompOpRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2869:5: lv_op_0_2= '!='
                    {
                    lv_op_0_2=(Token)match(input,67,FOLLOW_2); 

                    					newLeafNode(lv_op_0_2, grammarAccess.getCompOpAccess().getOpExclamationMarkEqualsSignKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCompOpRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:2880:5: lv_op_0_3= '>='
                    {
                    lv_op_0_3=(Token)match(input,68,FOLLOW_2); 

                    					newLeafNode(lv_op_0_3, grammarAccess.getCompOpAccess().getOpGreaterThanSignEqualsSignKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCompOpRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:2891:5: lv_op_0_4= '<='
                    {
                    lv_op_0_4=(Token)match(input,69,FOLLOW_2); 

                    					newLeafNode(lv_op_0_4, grammarAccess.getCompOpAccess().getOpLessThanSignEqualsSignKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCompOpRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalAdeptness.g:2902:5: lv_op_0_5= '<'
                    {
                    lv_op_0_5=(Token)match(input,70,FOLLOW_2); 

                    					newLeafNode(lv_op_0_5, grammarAccess.getCompOpAccess().getOpLessThanSignKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCompOpRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalAdeptness.g:2913:5: lv_op_0_6= '>'
                    {
                    lv_op_0_6=(Token)match(input,71,FOLLOW_2); 

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
    // InternalAdeptness.g:2929:1: entryRuleLogicOp returns [EObject current=null] : iv_ruleLogicOp= ruleLogicOp EOF ;
    public final EObject entryRuleLogicOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicOp = null;


        try {
            // InternalAdeptness.g:2929:48: (iv_ruleLogicOp= ruleLogicOp EOF )
            // InternalAdeptness.g:2930:2: iv_ruleLogicOp= ruleLogicOp EOF
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
    // InternalAdeptness.g:2936:1: ruleLogicOp returns [EObject current=null] : ( ( (lv_op_0_1= '&&' | lv_op_0_2= '||' ) ) ) ;
    public final EObject ruleLogicOp() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;


        	enterRule();

        try {
            // InternalAdeptness.g:2942:2: ( ( ( (lv_op_0_1= '&&' | lv_op_0_2= '||' ) ) ) )
            // InternalAdeptness.g:2943:2: ( ( (lv_op_0_1= '&&' | lv_op_0_2= '||' ) ) )
            {
            // InternalAdeptness.g:2943:2: ( ( (lv_op_0_1= '&&' | lv_op_0_2= '||' ) ) )
            // InternalAdeptness.g:2944:3: ( (lv_op_0_1= '&&' | lv_op_0_2= '||' ) )
            {
            // InternalAdeptness.g:2944:3: ( (lv_op_0_1= '&&' | lv_op_0_2= '||' ) )
            // InternalAdeptness.g:2945:4: (lv_op_0_1= '&&' | lv_op_0_2= '||' )
            {
            // InternalAdeptness.g:2945:4: (lv_op_0_1= '&&' | lv_op_0_2= '||' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==72) ) {
                alt43=1;
            }
            else if ( (LA43_0==73) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalAdeptness.g:2946:5: lv_op_0_1= '&&'
                    {
                    lv_op_0_1=(Token)match(input,72,FOLLOW_2); 

                    					newLeafNode(lv_op_0_1, grammarAccess.getLogicOpAccess().getOpAmpersandAmpersandKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicOpRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:2957:5: lv_op_0_2= '||'
                    {
                    lv_op_0_2=(Token)match(input,73,FOLLOW_2); 

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
    // InternalAdeptness.g:2973:1: entryRuleOp returns [EObject current=null] : iv_ruleOp= ruleOp EOF ;
    public final EObject entryRuleOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOp = null;


        try {
            // InternalAdeptness.g:2973:43: (iv_ruleOp= ruleOp EOF )
            // InternalAdeptness.g:2974:2: iv_ruleOp= ruleOp EOF
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
    // InternalAdeptness.g:2980:1: ruleOp returns [EObject current=null] : ( ( (lv_op_0_1= '+' | lv_op_0_2= '-' | lv_op_0_3= '*' | lv_op_0_4= '/' ) ) ) ;
    public final EObject ruleOp() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        Token lv_op_0_3=null;
        Token lv_op_0_4=null;


        	enterRule();

        try {
            // InternalAdeptness.g:2986:2: ( ( ( (lv_op_0_1= '+' | lv_op_0_2= '-' | lv_op_0_3= '*' | lv_op_0_4= '/' ) ) ) )
            // InternalAdeptness.g:2987:2: ( ( (lv_op_0_1= '+' | lv_op_0_2= '-' | lv_op_0_3= '*' | lv_op_0_4= '/' ) ) )
            {
            // InternalAdeptness.g:2987:2: ( ( (lv_op_0_1= '+' | lv_op_0_2= '-' | lv_op_0_3= '*' | lv_op_0_4= '/' ) ) )
            // InternalAdeptness.g:2988:3: ( (lv_op_0_1= '+' | lv_op_0_2= '-' | lv_op_0_3= '*' | lv_op_0_4= '/' ) )
            {
            // InternalAdeptness.g:2988:3: ( (lv_op_0_1= '+' | lv_op_0_2= '-' | lv_op_0_3= '*' | lv_op_0_4= '/' ) )
            // InternalAdeptness.g:2989:4: (lv_op_0_1= '+' | lv_op_0_2= '-' | lv_op_0_3= '*' | lv_op_0_4= '/' )
            {
            // InternalAdeptness.g:2989:4: (lv_op_0_1= '+' | lv_op_0_2= '-' | lv_op_0_3= '*' | lv_op_0_4= '/' )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt44=1;
                }
                break;
            case 56:
                {
                alt44=2;
                }
                break;
            case 75:
                {
                alt44=3;
                }
                break;
            case 76:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalAdeptness.g:2990:5: lv_op_0_1= '+'
                    {
                    lv_op_0_1=(Token)match(input,74,FOLLOW_2); 

                    					newLeafNode(lv_op_0_1, grammarAccess.getOpAccess().getOpPlusSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOpRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:3001:5: lv_op_0_2= '-'
                    {
                    lv_op_0_2=(Token)match(input,56,FOLLOW_2); 

                    					newLeafNode(lv_op_0_2, grammarAccess.getOpAccess().getOpHyphenMinusKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOpRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:3012:5: lv_op_0_3= '*'
                    {
                    lv_op_0_3=(Token)match(input,75,FOLLOW_2); 

                    					newLeafNode(lv_op_0_3, grammarAccess.getOpAccess().getOpAsteriskKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOpRule());
                    					}
                    					setWithLastConsumed(current, "op", lv_op_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:3023:5: lv_op_0_4= '/'
                    {
                    lv_op_0_4=(Token)match(input,76,FOLLOW_2); 

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


    protected DFA25 dfa25 = new DFA25(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\52\1\5\1\uffff\1\5\1\15\1\5\3\uffff\1\51";
    static final String dfa_3s = "\1\55\1\70\1\uffff\1\5\1\56\1\5\3\uffff\1\56";
    static final String dfa_4s = "\2\uffff\1\3\3\uffff\1\4\1\2\1\1\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2",
            "\1\4\62\uffff\1\3",
            "",
            "\1\4",
            "\1\5\33\uffff\1\10\1\uffff\1\6\2\uffff\1\7",
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

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1359:3: ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x6000000002004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0100000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004300000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004380000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0100001000000030L,0x0000000000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0100003400000030L,0x0000000000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0100000400000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0100000800000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x1E00000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x1E00001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0100002000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x012F801000000030L,0x0000000000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x1E00000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x6000000002004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0100001000000032L,0x0000000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000000000030L,0x0000000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0100001000000002L,0x0000000000001FFCL});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000001000000002L});

}