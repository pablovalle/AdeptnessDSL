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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'CPS'", "':'", "';'", "'Oracle'", "'checks:'", "'is'", "','", "'fails'", "'if'", "'value'", "'higher'", "'than'", "'in'", "'interval'", "'of'", "'constant'", "'degradation'", "'a'", "'time'", "'highest'", "'below'", "'above'", "'range'", "'between'", "'and'", "'not'", "'true'", "'false'", "'-'", "'datatype'", "'package'", "'{'", "'}'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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

                if ( (LA1_0==11||LA1_0==14||(LA1_0>=43 && LA1_0<=44)) ) {
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
    // InternalAdeptness.g:107:1: ruleAbstractElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_Type_1 = null;

        EObject this_Import_2 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:113:2: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport ) )
            // InternalAdeptness.g:114:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport )
            {
            // InternalAdeptness.g:114:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt2=1;
                }
                break;
            case 14:
            case 43:
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
                    // InternalAdeptness.g:133:3: this_Import_2= ruleImport
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Import_2=ruleImport();

                    state._fsp--;


                    			current = this_Import_2;
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


    // $ANTLR start "entryRuleImport"
    // InternalAdeptness.g:145:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalAdeptness.g:145:47: (iv_ruleImport= ruleImport EOF )
            // InternalAdeptness.g:146:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalAdeptness.g:152:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
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

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalAdeptness.g:164:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalAdeptness.g:165:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalAdeptness.g:165:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalAdeptness.g:166:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
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
    // $ANTLR end "ruleImport"


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
    // InternalAdeptness.g:270:1: ruleType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Signal_1= ruleSignal ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Signal_1 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:276:2: ( (this_DataType_0= ruleDataType | this_Signal_1= ruleSignal ) )
            // InternalAdeptness.g:277:2: (this_DataType_0= ruleDataType | this_Signal_1= ruleSignal )
            {
            // InternalAdeptness.g:277:2: (this_DataType_0= ruleDataType | this_Signal_1= ruleSignal )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==43) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
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


    // $ANTLR start "entryRuleSignal"
    // InternalAdeptness.g:299:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // InternalAdeptness.g:299:47: (iv_ruleSignal= ruleSignal EOF )
            // InternalAdeptness.g:300:2: iv_ruleSignal= ruleSignal EOF
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
    // InternalAdeptness.g:306:1: ruleSignal returns [EObject current=null] : (otherlv_0= 'CPS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_oracle_3_0= ruleOracle ) )+ otherlv_4= ';' ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_oracle_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:312:2: ( (otherlv_0= 'CPS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_oracle_3_0= ruleOracle ) )+ otherlv_4= ';' ) )
            // InternalAdeptness.g:313:2: (otherlv_0= 'CPS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_oracle_3_0= ruleOracle ) )+ otherlv_4= ';' )
            {
            // InternalAdeptness.g:313:2: (otherlv_0= 'CPS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_oracle_3_0= ruleOracle ) )+ otherlv_4= ';' )
            // InternalAdeptness.g:314:3: otherlv_0= 'CPS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_oracle_3_0= ruleOracle ) )+ otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSignalAccess().getCPSKeyword_0());
            		
            // InternalAdeptness.g:318:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:319:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:319:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:320:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSignalAccess().getColonKeyword_2());
            		
            // InternalAdeptness.g:340:3: ( (lv_oracle_3_0= ruleOracle ) )+
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
            	    // InternalAdeptness.g:341:4: (lv_oracle_3_0= ruleOracle )
            	    {
            	    // InternalAdeptness.g:341:4: (lv_oracle_3_0= ruleOracle )
            	    // InternalAdeptness.g:342:5: lv_oracle_3_0= ruleOracle
            	    {

            	    					newCompositeNode(grammarAccess.getSignalAccess().getOracleOracleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_oracle_3_0=ruleOracle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSignalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"oracle",
            	    						lv_oracle_3_0,
            	    						"org.xtext.example.mydsl.Adeptness.Oracle");
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

            			newLeafNode(otherlv_4, grammarAccess.getSignalAccess().getSemicolonKeyword_4());
            		

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
    // InternalAdeptness.g:367:1: entryRuleOracle returns [EObject current=null] : iv_ruleOracle= ruleOracle EOF ;
    public final EObject entryRuleOracle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOracle = null;


        try {
            // InternalAdeptness.g:367:47: (iv_ruleOracle= ruleOracle EOF )
            // InternalAdeptness.g:368:2: iv_ruleOracle= ruleOracle EOF
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
    // InternalAdeptness.g:374:1: ruleOracle returns [EObject current=null] : (otherlv_0= 'Oracle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_check_3_0= ruleCheck ) )+ otherlv_4= ';' ) ;
    public final EObject ruleOracle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_check_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:380:2: ( (otherlv_0= 'Oracle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_check_3_0= ruleCheck ) )+ otherlv_4= ';' ) )
            // InternalAdeptness.g:381:2: (otherlv_0= 'Oracle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_check_3_0= ruleCheck ) )+ otherlv_4= ';' )
            {
            // InternalAdeptness.g:381:2: (otherlv_0= 'Oracle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_check_3_0= ruleCheck ) )+ otherlv_4= ';' )
            // InternalAdeptness.g:382:3: otherlv_0= 'Oracle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_check_3_0= ruleCheck ) )+ otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOracleAccess().getOracleKeyword_0());
            		
            // InternalAdeptness.g:386:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:387:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:387:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:388:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getOracleAccess().getColonKeyword_2());
            		
            // InternalAdeptness.g:408:3: ( (lv_check_3_0= ruleCheck ) )+
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
            	    // InternalAdeptness.g:409:4: (lv_check_3_0= ruleCheck )
            	    {
            	    // InternalAdeptness.g:409:4: (lv_check_3_0= ruleCheck )
            	    // InternalAdeptness.g:410:5: lv_check_3_0= ruleCheck
            	    {

            	    					newCompositeNode(grammarAccess.getOracleAccess().getCheckCheckParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_check_3_0=ruleCheck();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOracleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"check",
            	    						lv_check_3_0,
            	    						"org.xtext.example.mydsl.Adeptness.Check");
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

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOracleAccess().getSemicolonKeyword_4());
            		

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


    // $ANTLR start "entryRuleCheck"
    // InternalAdeptness.g:435:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // InternalAdeptness.g:435:46: (iv_ruleCheck= ruleCheck EOF )
            // InternalAdeptness.g:436:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
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
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // InternalAdeptness.g:442:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'checks:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) ( (lv_failReason_4_0= ruleFailReason ) )+ ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ',' ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        EObject lv_reference_3_0 = null;

        EObject lv_failReason_4_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:448:2: ( (otherlv_0= 'checks:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) ( (lv_failReason_4_0= ruleFailReason ) )+ ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ',' ) )
            // InternalAdeptness.g:449:2: (otherlv_0= 'checks:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) ( (lv_failReason_4_0= ruleFailReason ) )+ ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ',' )
            {
            // InternalAdeptness.g:449:2: (otherlv_0= 'checks:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) ( (lv_failReason_4_0= ruleFailReason ) )+ ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ',' )
            // InternalAdeptness.g:450:3: otherlv_0= 'checks:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) ( (lv_failReason_4_0= ruleFailReason ) )+ ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ','
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getChecksKeyword_0());
            		
            // InternalAdeptness.g:454:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAdeptness.g:455:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAdeptness.g:455:4: (lv_name_1_0= RULE_STRING )
            // InternalAdeptness.g:456:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCheckAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getCheckAccess().getIsKeyword_2());
            		
            // InternalAdeptness.g:476:3: ( (lv_reference_3_0= ruleReference ) )
            // InternalAdeptness.g:477:4: (lv_reference_3_0= ruleReference )
            {
            // InternalAdeptness.g:477:4: (lv_reference_3_0= ruleReference )
            // InternalAdeptness.g:478:5: lv_reference_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getCheckAccess().getReferenceReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_reference_3_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckRule());
            					}
            					set(
            						current,
            						"reference",
            						lv_reference_3_0,
            						"org.xtext.example.mydsl.Adeptness.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdeptness.g:495:3: ( (lv_failReason_4_0= ruleFailReason ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAdeptness.g:496:4: (lv_failReason_4_0= ruleFailReason )
            	    {
            	    // InternalAdeptness.g:496:4: (lv_failReason_4_0= ruleFailReason )
            	    // InternalAdeptness.g:497:5: lv_failReason_4_0= ruleFailReason
            	    {

            	    					newCompositeNode(grammarAccess.getCheckAccess().getFailReasonFailReasonParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_failReason_4_0=ruleFailReason();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCheckRule());
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // InternalAdeptness.g:514:3: ( (lv_description_5_0= RULE_STRING ) )
            // InternalAdeptness.g:515:4: (lv_description_5_0= RULE_STRING )
            {
            // InternalAdeptness.g:515:4: (lv_description_5_0= RULE_STRING )
            // InternalAdeptness.g:516:5: lv_description_5_0= RULE_STRING
            {
            lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_description_5_0, grammarAccess.getCheckAccess().getDescriptionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCheckAccess().getCommaKeyword_6());
            		

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
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleFailReason"
    // InternalAdeptness.g:540:1: entryRuleFailReason returns [EObject current=null] : iv_ruleFailReason= ruleFailReason EOF ;
    public final EObject entryRuleFailReason() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFailReason = null;


        try {
            // InternalAdeptness.g:540:51: (iv_ruleFailReason= ruleFailReason EOF )
            // InternalAdeptness.g:541:2: iv_ruleFailReason= ruleFailReason EOF
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
    // InternalAdeptness.g:547:1: ruleFailReason returns [EObject current=null] : (otherlv_0= 'fails' otherlv_1= 'if' otherlv_2= ':' ( ( (lv_highPeak_3_0= ruleHighPeak ) ) | ( (lv_highTime_4_0= ruleHighTime ) ) | ( (lv_constDeg_5_0= ruleConstDeg ) ) | ( (lv_HigPeaks_6_0= ruleHighPeaks ) ) ) otherlv_7= ',' ) ;
    public final EObject ruleFailReason() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_highPeak_3_0 = null;

        EObject lv_highTime_4_0 = null;

        EObject lv_constDeg_5_0 = null;

        EObject lv_HigPeaks_6_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:553:2: ( (otherlv_0= 'fails' otherlv_1= 'if' otherlv_2= ':' ( ( (lv_highPeak_3_0= ruleHighPeak ) ) | ( (lv_highTime_4_0= ruleHighTime ) ) | ( (lv_constDeg_5_0= ruleConstDeg ) ) | ( (lv_HigPeaks_6_0= ruleHighPeaks ) ) ) otherlv_7= ',' ) )
            // InternalAdeptness.g:554:2: (otherlv_0= 'fails' otherlv_1= 'if' otherlv_2= ':' ( ( (lv_highPeak_3_0= ruleHighPeak ) ) | ( (lv_highTime_4_0= ruleHighTime ) ) | ( (lv_constDeg_5_0= ruleConstDeg ) ) | ( (lv_HigPeaks_6_0= ruleHighPeaks ) ) ) otherlv_7= ',' )
            {
            // InternalAdeptness.g:554:2: (otherlv_0= 'fails' otherlv_1= 'if' otherlv_2= ':' ( ( (lv_highPeak_3_0= ruleHighPeak ) ) | ( (lv_highTime_4_0= ruleHighTime ) ) | ( (lv_constDeg_5_0= ruleConstDeg ) ) | ( (lv_HigPeaks_6_0= ruleHighPeaks ) ) ) otherlv_7= ',' )
            // InternalAdeptness.g:555:3: otherlv_0= 'fails' otherlv_1= 'if' otherlv_2= ':' ( ( (lv_highPeak_3_0= ruleHighPeak ) ) | ( (lv_highTime_4_0= ruleHighTime ) ) | ( (lv_constDeg_5_0= ruleConstDeg ) ) | ( (lv_HigPeaks_6_0= ruleHighPeaks ) ) ) otherlv_7= ','
            {
            otherlv_0=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getFailReasonAccess().getFailsKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getFailReasonAccess().getIfKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getFailReasonAccess().getColonKeyword_2());
            		
            // InternalAdeptness.g:567:3: ( ( (lv_highPeak_3_0= ruleHighPeak ) ) | ( (lv_highTime_4_0= ruleHighTime ) ) | ( (lv_constDeg_5_0= ruleConstDeg ) ) | ( (lv_HigPeaks_6_0= ruleHighPeaks ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case 29:
                {
                alt9=3;
                }
                break;
            case 23:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAdeptness.g:568:4: ( (lv_highPeak_3_0= ruleHighPeak ) )
                    {
                    // InternalAdeptness.g:568:4: ( (lv_highPeak_3_0= ruleHighPeak ) )
                    // InternalAdeptness.g:569:5: (lv_highPeak_3_0= ruleHighPeak )
                    {
                    // InternalAdeptness.g:569:5: (lv_highPeak_3_0= ruleHighPeak )
                    // InternalAdeptness.g:570:6: lv_highPeak_3_0= ruleHighPeak
                    {

                    						newCompositeNode(grammarAccess.getFailReasonAccess().getHighPeakHighPeakParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_highPeak_3_0=ruleHighPeak();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFailReasonRule());
                    						}
                    						set(
                    							current,
                    							"highPeak",
                    							lv_highPeak_3_0,
                    							"org.xtext.example.mydsl.Adeptness.HighPeak");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:588:4: ( (lv_highTime_4_0= ruleHighTime ) )
                    {
                    // InternalAdeptness.g:588:4: ( (lv_highTime_4_0= ruleHighTime ) )
                    // InternalAdeptness.g:589:5: (lv_highTime_4_0= ruleHighTime )
                    {
                    // InternalAdeptness.g:589:5: (lv_highTime_4_0= ruleHighTime )
                    // InternalAdeptness.g:590:6: lv_highTime_4_0= ruleHighTime
                    {

                    						newCompositeNode(grammarAccess.getFailReasonAccess().getHighTimeHighTimeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_highTime_4_0=ruleHighTime();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFailReasonRule());
                    						}
                    						set(
                    							current,
                    							"highTime",
                    							lv_highTime_4_0,
                    							"org.xtext.example.mydsl.Adeptness.HighTime");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:608:4: ( (lv_constDeg_5_0= ruleConstDeg ) )
                    {
                    // InternalAdeptness.g:608:4: ( (lv_constDeg_5_0= ruleConstDeg ) )
                    // InternalAdeptness.g:609:5: (lv_constDeg_5_0= ruleConstDeg )
                    {
                    // InternalAdeptness.g:609:5: (lv_constDeg_5_0= ruleConstDeg )
                    // InternalAdeptness.g:610:6: lv_constDeg_5_0= ruleConstDeg
                    {

                    						newCompositeNode(grammarAccess.getFailReasonAccess().getConstDegConstDegParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_constDeg_5_0=ruleConstDeg();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFailReasonRule());
                    						}
                    						set(
                    							current,
                    							"constDeg",
                    							lv_constDeg_5_0,
                    							"org.xtext.example.mydsl.Adeptness.ConstDeg");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAdeptness.g:628:4: ( (lv_HigPeaks_6_0= ruleHighPeaks ) )
                    {
                    // InternalAdeptness.g:628:4: ( (lv_HigPeaks_6_0= ruleHighPeaks ) )
                    // InternalAdeptness.g:629:5: (lv_HigPeaks_6_0= ruleHighPeaks )
                    {
                    // InternalAdeptness.g:629:5: (lv_HigPeaks_6_0= ruleHighPeaks )
                    // InternalAdeptness.g:630:6: lv_HigPeaks_6_0= ruleHighPeaks
                    {

                    						newCompositeNode(grammarAccess.getFailReasonAccess().getHigPeaksHighPeaksParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_HigPeaks_6_0=ruleHighPeaks();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFailReasonRule());
                    						}
                    						set(
                    							current,
                    							"HigPeaks",
                    							lv_HigPeaks_6_0,
                    							"org.xtext.example.mydsl.Adeptness.HighPeaks");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getFailReasonAccess().getCommaKeyword_4());
            		

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


    // $ANTLR start "entryRuleHighPeaks"
    // InternalAdeptness.g:656:1: entryRuleHighPeaks returns [EObject current=null] : iv_ruleHighPeaks= ruleHighPeaks EOF ;
    public final EObject entryRuleHighPeaks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighPeaks = null;


        try {
            // InternalAdeptness.g:656:50: (iv_ruleHighPeaks= ruleHighPeaks EOF )
            // InternalAdeptness.g:657:2: iv_ruleHighPeaks= ruleHighPeaks EOF
            {
             newCompositeNode(grammarAccess.getHighPeaksRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHighPeaks=ruleHighPeaks();

            state._fsp--;

             current =iv_ruleHighPeaks; 
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
    // $ANTLR end "entryRuleHighPeaks"


    // $ANTLR start "ruleHighPeaks"
    // InternalAdeptness.g:663:1: ruleHighPeaks returns [EObject current=null] : (otherlv_0= 'value' otherlv_1= 'is' otherlv_2= 'higher' otherlv_3= 'than' ( (lv_cant_4_0= ruleDOUBLE ) ) otherlv_5= 'in' otherlv_6= 'interval' otherlv_7= 'of' ( (lv_time_8_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleHighPeaks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_cant_4_0 = null;

        EObject lv_time_8_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:669:2: ( (otherlv_0= 'value' otherlv_1= 'is' otherlv_2= 'higher' otherlv_3= 'than' ( (lv_cant_4_0= ruleDOUBLE ) ) otherlv_5= 'in' otherlv_6= 'interval' otherlv_7= 'of' ( (lv_time_8_0= ruleDOUBLE ) ) ) )
            // InternalAdeptness.g:670:2: (otherlv_0= 'value' otherlv_1= 'is' otherlv_2= 'higher' otherlv_3= 'than' ( (lv_cant_4_0= ruleDOUBLE ) ) otherlv_5= 'in' otherlv_6= 'interval' otherlv_7= 'of' ( (lv_time_8_0= ruleDOUBLE ) ) )
            {
            // InternalAdeptness.g:670:2: (otherlv_0= 'value' otherlv_1= 'is' otherlv_2= 'higher' otherlv_3= 'than' ( (lv_cant_4_0= ruleDOUBLE ) ) otherlv_5= 'in' otherlv_6= 'interval' otherlv_7= 'of' ( (lv_time_8_0= ruleDOUBLE ) ) )
            // InternalAdeptness.g:671:3: otherlv_0= 'value' otherlv_1= 'is' otherlv_2= 'higher' otherlv_3= 'than' ( (lv_cant_4_0= ruleDOUBLE ) ) otherlv_5= 'in' otherlv_6= 'interval' otherlv_7= 'of' ( (lv_time_8_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getHighPeaksAccess().getValueKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getHighPeaksAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getHighPeaksAccess().getHigherKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getHighPeaksAccess().getThanKeyword_3());
            		
            // InternalAdeptness.g:687:3: ( (lv_cant_4_0= ruleDOUBLE ) )
            // InternalAdeptness.g:688:4: (lv_cant_4_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:688:4: (lv_cant_4_0= ruleDOUBLE )
            // InternalAdeptness.g:689:5: lv_cant_4_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getHighPeaksAccess().getCantDOUBLEParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_cant_4_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHighPeaksRule());
            					}
            					set(
            						current,
            						"cant",
            						lv_cant_4_0,
            						"org.xtext.example.mydsl.Adeptness.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getHighPeaksAccess().getInKeyword_5());
            		
            otherlv_6=(Token)match(input,27,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getHighPeaksAccess().getIntervalKeyword_6());
            		
            otherlv_7=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getHighPeaksAccess().getOfKeyword_7());
            		
            // InternalAdeptness.g:718:3: ( (lv_time_8_0= ruleDOUBLE ) )
            // InternalAdeptness.g:719:4: (lv_time_8_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:719:4: (lv_time_8_0= ruleDOUBLE )
            // InternalAdeptness.g:720:5: lv_time_8_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getHighPeaksAccess().getTimeDOUBLEParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_time_8_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHighPeaksRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_8_0,
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
    // $ANTLR end "ruleHighPeaks"


    // $ANTLR start "entryRuleConstDeg"
    // InternalAdeptness.g:741:1: entryRuleConstDeg returns [EObject current=null] : iv_ruleConstDeg= ruleConstDeg EOF ;
    public final EObject entryRuleConstDeg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstDeg = null;


        try {
            // InternalAdeptness.g:741:49: (iv_ruleConstDeg= ruleConstDeg EOF )
            // InternalAdeptness.g:742:2: iv_ruleConstDeg= ruleConstDeg EOF
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
    // InternalAdeptness.g:748:1: ruleConstDeg returns [EObject current=null] : (otherlv_0= 'constant' otherlv_1= 'degradation' ( ( (lv_upper_2_0= ruleUpper ) ) | ( (lv_lower_3_0= ruleLower ) ) ) ) ;
    public final EObject ruleConstDeg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_upper_2_0 = null;

        EObject lv_lower_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:754:2: ( (otherlv_0= 'constant' otherlv_1= 'degradation' ( ( (lv_upper_2_0= ruleUpper ) ) | ( (lv_lower_3_0= ruleLower ) ) ) ) )
            // InternalAdeptness.g:755:2: (otherlv_0= 'constant' otherlv_1= 'degradation' ( ( (lv_upper_2_0= ruleUpper ) ) | ( (lv_lower_3_0= ruleLower ) ) ) )
            {
            // InternalAdeptness.g:755:2: (otherlv_0= 'constant' otherlv_1= 'degradation' ( ( (lv_upper_2_0= ruleUpper ) ) | ( (lv_lower_3_0= ruleLower ) ) ) )
            // InternalAdeptness.g:756:3: otherlv_0= 'constant' otherlv_1= 'degradation' ( ( (lv_upper_2_0= ruleUpper ) ) | ( (lv_lower_3_0= ruleLower ) ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getConstDegAccess().getConstantKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getConstDegAccess().getDegradationKeyword_1());
            		
            // InternalAdeptness.g:764:3: ( ( (lv_upper_2_0= ruleUpper ) ) | ( (lv_lower_3_0= ruleLower ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            else if ( (LA10_0==35) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAdeptness.g:765:4: ( (lv_upper_2_0= ruleUpper ) )
                    {
                    // InternalAdeptness.g:765:4: ( (lv_upper_2_0= ruleUpper ) )
                    // InternalAdeptness.g:766:5: (lv_upper_2_0= ruleUpper )
                    {
                    // InternalAdeptness.g:766:5: (lv_upper_2_0= ruleUpper )
                    // InternalAdeptness.g:767:6: lv_upper_2_0= ruleUpper
                    {

                    						newCompositeNode(grammarAccess.getConstDegAccess().getUpperUpperParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_upper_2_0=ruleUpper();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstDegRule());
                    						}
                    						set(
                    							current,
                    							"upper",
                    							lv_upper_2_0,
                    							"org.xtext.example.mydsl.Adeptness.Upper");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:785:4: ( (lv_lower_3_0= ruleLower ) )
                    {
                    // InternalAdeptness.g:785:4: ( (lv_lower_3_0= ruleLower ) )
                    // InternalAdeptness.g:786:5: (lv_lower_3_0= ruleLower )
                    {
                    // InternalAdeptness.g:786:5: (lv_lower_3_0= ruleLower )
                    // InternalAdeptness.g:787:6: lv_lower_3_0= ruleLower
                    {

                    						newCompositeNode(grammarAccess.getConstDegAccess().getLowerLowerParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_lower_3_0=ruleLower();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstDegRule());
                    						}
                    						set(
                    							current,
                    							"lower",
                    							lv_lower_3_0,
                    							"org.xtext.example.mydsl.Adeptness.Lower");
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
    // $ANTLR end "ruleConstDeg"


    // $ANTLR start "entryRuleHighTime"
    // InternalAdeptness.g:809:1: entryRuleHighTime returns [EObject current=null] : iv_ruleHighTime= ruleHighTime EOF ;
    public final EObject entryRuleHighTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighTime = null;


        try {
            // InternalAdeptness.g:809:49: (iv_ruleHighTime= ruleHighTime EOF )
            // InternalAdeptness.g:810:2: iv_ruleHighTime= ruleHighTime EOF
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
    // InternalAdeptness.g:816:1: ruleHighTime returns [EObject current=null] : (otherlv_0= 'higher' otherlv_1= 'than' ( (lv_cant_2_0= ruleDOUBLE ) ) otherlv_3= 'in' otherlv_4= 'a' otherlv_5= 'time' otherlv_6= 'of' ( (lv_time_7_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleHighTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_cant_2_0 = null;

        EObject lv_time_7_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:822:2: ( (otherlv_0= 'higher' otherlv_1= 'than' ( (lv_cant_2_0= ruleDOUBLE ) ) otherlv_3= 'in' otherlv_4= 'a' otherlv_5= 'time' otherlv_6= 'of' ( (lv_time_7_0= ruleDOUBLE ) ) ) )
            // InternalAdeptness.g:823:2: (otherlv_0= 'higher' otherlv_1= 'than' ( (lv_cant_2_0= ruleDOUBLE ) ) otherlv_3= 'in' otherlv_4= 'a' otherlv_5= 'time' otherlv_6= 'of' ( (lv_time_7_0= ruleDOUBLE ) ) )
            {
            // InternalAdeptness.g:823:2: (otherlv_0= 'higher' otherlv_1= 'than' ( (lv_cant_2_0= ruleDOUBLE ) ) otherlv_3= 'in' otherlv_4= 'a' otherlv_5= 'time' otherlv_6= 'of' ( (lv_time_7_0= ruleDOUBLE ) ) )
            // InternalAdeptness.g:824:3: otherlv_0= 'higher' otherlv_1= 'than' ( (lv_cant_2_0= ruleDOUBLE ) ) otherlv_3= 'in' otherlv_4= 'a' otherlv_5= 'time' otherlv_6= 'of' ( (lv_time_7_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getHighTimeAccess().getHigherKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getHighTimeAccess().getThanKeyword_1());
            		
            // InternalAdeptness.g:832:3: ( (lv_cant_2_0= ruleDOUBLE ) )
            // InternalAdeptness.g:833:4: (lv_cant_2_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:833:4: (lv_cant_2_0= ruleDOUBLE )
            // InternalAdeptness.g:834:5: lv_cant_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getHighTimeAccess().getCantDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_cant_2_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHighTimeRule());
            					}
            					set(
            						current,
            						"cant",
            						lv_cant_2_0,
            						"org.xtext.example.mydsl.Adeptness.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getHighTimeAccess().getInKeyword_3());
            		
            otherlv_4=(Token)match(input,31,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getHighTimeAccess().getAKeyword_4());
            		
            otherlv_5=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getHighTimeAccess().getTimeKeyword_5());
            		
            otherlv_6=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getHighTimeAccess().getOfKeyword_6());
            		
            // InternalAdeptness.g:867:3: ( (lv_time_7_0= ruleDOUBLE ) )
            // InternalAdeptness.g:868:4: (lv_time_7_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:868:4: (lv_time_7_0= ruleDOUBLE )
            // InternalAdeptness.g:869:5: lv_time_7_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getHighTimeAccess().getTimeDOUBLEParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_time_7_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHighTimeRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_7_0,
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
    // $ANTLR end "ruleHighTime"


    // $ANTLR start "entryRuleHighPeak"
    // InternalAdeptness.g:890:1: entryRuleHighPeak returns [EObject current=null] : iv_ruleHighPeak= ruleHighPeak EOF ;
    public final EObject entryRuleHighPeak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighPeak = null;


        try {
            // InternalAdeptness.g:890:49: (iv_ruleHighPeak= ruleHighPeak EOF )
            // InternalAdeptness.g:891:2: iv_ruleHighPeak= ruleHighPeak EOF
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
    // InternalAdeptness.g:897:1: ruleHighPeak returns [EObject current=null] : (otherlv_0= 'highest' otherlv_1= 'value' otherlv_2= 'is' otherlv_3= 'higher' otherlv_4= 'than' ( (lv_cant_5_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleHighPeak() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_cant_5_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:903:2: ( (otherlv_0= 'highest' otherlv_1= 'value' otherlv_2= 'is' otherlv_3= 'higher' otherlv_4= 'than' ( (lv_cant_5_0= ruleDOUBLE ) ) ) )
            // InternalAdeptness.g:904:2: (otherlv_0= 'highest' otherlv_1= 'value' otherlv_2= 'is' otherlv_3= 'higher' otherlv_4= 'than' ( (lv_cant_5_0= ruleDOUBLE ) ) )
            {
            // InternalAdeptness.g:904:2: (otherlv_0= 'highest' otherlv_1= 'value' otherlv_2= 'is' otherlv_3= 'higher' otherlv_4= 'than' ( (lv_cant_5_0= ruleDOUBLE ) ) )
            // InternalAdeptness.g:905:3: otherlv_0= 'highest' otherlv_1= 'value' otherlv_2= 'is' otherlv_3= 'higher' otherlv_4= 'than' ( (lv_cant_5_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getHighPeakAccess().getHighestKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getHighPeakAccess().getValueKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getHighPeakAccess().getIsKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getHighPeakAccess().getHigherKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getHighPeakAccess().getThanKeyword_4());
            		
            // InternalAdeptness.g:925:3: ( (lv_cant_5_0= ruleDOUBLE ) )
            // InternalAdeptness.g:926:4: (lv_cant_5_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:926:4: (lv_cant_5_0= ruleDOUBLE )
            // InternalAdeptness.g:927:5: lv_cant_5_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getHighPeakAccess().getCantDOUBLEParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_cant_5_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHighPeakRule());
            					}
            					set(
            						current,
            						"cant",
            						lv_cant_5_0,
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
    // InternalAdeptness.g:948:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalAdeptness.g:948:50: (iv_ruleReference= ruleReference EOF )
            // InternalAdeptness.g:949:2: iv_ruleReference= ruleReference EOF
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
    // InternalAdeptness.g:955:1: ruleReference returns [EObject current=null] : ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) ) otherlv_4= ',' ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_upper_0_0 = null;

        EObject lv_lower_1_0 = null;

        EObject lv_range_2_0 = null;

        EObject lv_gap_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:961:2: ( ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) ) otherlv_4= ',' ) )
            // InternalAdeptness.g:962:2: ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) ) otherlv_4= ',' )
            {
            // InternalAdeptness.g:962:2: ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) ) otherlv_4= ',' )
            // InternalAdeptness.g:963:3: ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) ) otherlv_4= ','
            {
            // InternalAdeptness.g:963:3: ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt11=1;
                }
                break;
            case 35:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            case 39:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalAdeptness.g:964:4: ( (lv_upper_0_0= ruleUpper ) )
                    {
                    // InternalAdeptness.g:964:4: ( (lv_upper_0_0= ruleUpper ) )
                    // InternalAdeptness.g:965:5: (lv_upper_0_0= ruleUpper )
                    {
                    // InternalAdeptness.g:965:5: (lv_upper_0_0= ruleUpper )
                    // InternalAdeptness.g:966:6: lv_upper_0_0= ruleUpper
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getUpperUpperParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_17);
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
                    // InternalAdeptness.g:984:4: ( (lv_lower_1_0= ruleLower ) )
                    {
                    // InternalAdeptness.g:984:4: ( (lv_lower_1_0= ruleLower ) )
                    // InternalAdeptness.g:985:5: (lv_lower_1_0= ruleLower )
                    {
                    // InternalAdeptness.g:985:5: (lv_lower_1_0= ruleLower )
                    // InternalAdeptness.g:986:6: lv_lower_1_0= ruleLower
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getLowerLowerParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_17);
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
                    // InternalAdeptness.g:1004:4: ( (lv_range_2_0= ruleRange ) )
                    {
                    // InternalAdeptness.g:1004:4: ( (lv_range_2_0= ruleRange ) )
                    // InternalAdeptness.g:1005:5: (lv_range_2_0= ruleRange )
                    {
                    // InternalAdeptness.g:1005:5: (lv_range_2_0= ruleRange )
                    // InternalAdeptness.g:1006:6: lv_range_2_0= ruleRange
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getRangeRangeParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_17);
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
                    // InternalAdeptness.g:1024:4: ( (lv_gap_3_0= ruleGap ) )
                    {
                    // InternalAdeptness.g:1024:4: ( (lv_gap_3_0= ruleGap ) )
                    // InternalAdeptness.g:1025:5: (lv_gap_3_0= ruleGap )
                    {
                    // InternalAdeptness.g:1025:5: (lv_gap_3_0= ruleGap )
                    // InternalAdeptness.g:1026:6: lv_gap_3_0= ruleGap
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getGapGapParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_17);
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

            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReferenceAccess().getCommaKeyword_1());
            		

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


    // $ANTLR start "entryRuleUpper"
    // InternalAdeptness.g:1052:1: entryRuleUpper returns [EObject current=null] : iv_ruleUpper= ruleUpper EOF ;
    public final EObject entryRuleUpper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpper = null;


        try {
            // InternalAdeptness.g:1052:46: (iv_ruleUpper= ruleUpper EOF )
            // InternalAdeptness.g:1053:2: iv_ruleUpper= ruleUpper EOF
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
    // InternalAdeptness.g:1059:1: ruleUpper returns [EObject current=null] : (otherlv_0= 'below' otherlv_1= 'than' ( (lv_bound_upp_2_0= ruleBound_up ) ) ) ;
    public final EObject ruleUpper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_bound_upp_2_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1065:2: ( (otherlv_0= 'below' otherlv_1= 'than' ( (lv_bound_upp_2_0= ruleBound_up ) ) ) )
            // InternalAdeptness.g:1066:2: (otherlv_0= 'below' otherlv_1= 'than' ( (lv_bound_upp_2_0= ruleBound_up ) ) )
            {
            // InternalAdeptness.g:1066:2: (otherlv_0= 'below' otherlv_1= 'than' ( (lv_bound_upp_2_0= ruleBound_up ) ) )
            // InternalAdeptness.g:1067:3: otherlv_0= 'below' otherlv_1= 'than' ( (lv_bound_upp_2_0= ruleBound_up ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getUpperAccess().getBelowKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getUpperAccess().getThanKeyword_1());
            		
            // InternalAdeptness.g:1075:3: ( (lv_bound_upp_2_0= ruleBound_up ) )
            // InternalAdeptness.g:1076:4: (lv_bound_upp_2_0= ruleBound_up )
            {
            // InternalAdeptness.g:1076:4: (lv_bound_upp_2_0= ruleBound_up )
            // InternalAdeptness.g:1077:5: lv_bound_upp_2_0= ruleBound_up
            {

            					newCompositeNode(grammarAccess.getUpperAccess().getBound_uppBound_upParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_bound_upp_2_0=ruleBound_up();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpperRule());
            					}
            					set(
            						current,
            						"bound_upp",
            						lv_bound_upp_2_0,
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
    // InternalAdeptness.g:1098:1: entryRuleLower returns [EObject current=null] : iv_ruleLower= ruleLower EOF ;
    public final EObject entryRuleLower() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLower = null;


        try {
            // InternalAdeptness.g:1098:46: (iv_ruleLower= ruleLower EOF )
            // InternalAdeptness.g:1099:2: iv_ruleLower= ruleLower EOF
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
    // InternalAdeptness.g:1105:1: ruleLower returns [EObject current=null] : (otherlv_0= 'above' otherlv_1= 'than' ( (lv_bound_lower_2_0= ruleBound_Down ) ) ) ;
    public final EObject ruleLower() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_bound_lower_2_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1111:2: ( (otherlv_0= 'above' otherlv_1= 'than' ( (lv_bound_lower_2_0= ruleBound_Down ) ) ) )
            // InternalAdeptness.g:1112:2: (otherlv_0= 'above' otherlv_1= 'than' ( (lv_bound_lower_2_0= ruleBound_Down ) ) )
            {
            // InternalAdeptness.g:1112:2: (otherlv_0= 'above' otherlv_1= 'than' ( (lv_bound_lower_2_0= ruleBound_Down ) ) )
            // InternalAdeptness.g:1113:3: otherlv_0= 'above' otherlv_1= 'than' ( (lv_bound_lower_2_0= ruleBound_Down ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getLowerAccess().getAboveKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getLowerAccess().getThanKeyword_1());
            		
            // InternalAdeptness.g:1121:3: ( (lv_bound_lower_2_0= ruleBound_Down ) )
            // InternalAdeptness.g:1122:4: (lv_bound_lower_2_0= ruleBound_Down )
            {
            // InternalAdeptness.g:1122:4: (lv_bound_lower_2_0= ruleBound_Down )
            // InternalAdeptness.g:1123:5: lv_bound_lower_2_0= ruleBound_Down
            {

            					newCompositeNode(grammarAccess.getLowerAccess().getBound_lowerBound_DownParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_bound_lower_2_0=ruleBound_Down();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLowerRule());
            					}
            					set(
            						current,
            						"bound_lower",
            						lv_bound_lower_2_0,
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
    // InternalAdeptness.g:1144:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalAdeptness.g:1144:46: (iv_ruleRange= ruleRange EOF )
            // InternalAdeptness.g:1145:2: iv_ruleRange= ruleRange EOF
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
    // InternalAdeptness.g:1151:1: ruleRange returns [EObject current=null] : (otherlv_0= 'in' otherlv_1= 'range' otherlv_2= 'between' ( (lv_bound_lower_3_0= ruleBound_Down ) ) otherlv_4= 'and' ( (lv_bound_upp_5_0= ruleBound_up ) ) ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_bound_lower_3_0 = null;

        EObject lv_bound_upp_5_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1157:2: ( (otherlv_0= 'in' otherlv_1= 'range' otherlv_2= 'between' ( (lv_bound_lower_3_0= ruleBound_Down ) ) otherlv_4= 'and' ( (lv_bound_upp_5_0= ruleBound_up ) ) ) )
            // InternalAdeptness.g:1158:2: (otherlv_0= 'in' otherlv_1= 'range' otherlv_2= 'between' ( (lv_bound_lower_3_0= ruleBound_Down ) ) otherlv_4= 'and' ( (lv_bound_upp_5_0= ruleBound_up ) ) )
            {
            // InternalAdeptness.g:1158:2: (otherlv_0= 'in' otherlv_1= 'range' otherlv_2= 'between' ( (lv_bound_lower_3_0= ruleBound_Down ) ) otherlv_4= 'and' ( (lv_bound_upp_5_0= ruleBound_up ) ) )
            // InternalAdeptness.g:1159:3: otherlv_0= 'in' otherlv_1= 'range' otherlv_2= 'between' ( (lv_bound_lower_3_0= ruleBound_Down ) ) otherlv_4= 'and' ( (lv_bound_upp_5_0= ruleBound_up ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getInKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getRangeAccess().getRangeKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getBetweenKeyword_2());
            		
            // InternalAdeptness.g:1171:3: ( (lv_bound_lower_3_0= ruleBound_Down ) )
            // InternalAdeptness.g:1172:4: (lv_bound_lower_3_0= ruleBound_Down )
            {
            // InternalAdeptness.g:1172:4: (lv_bound_lower_3_0= ruleBound_Down )
            // InternalAdeptness.g:1173:5: lv_bound_lower_3_0= ruleBound_Down
            {

            					newCompositeNode(grammarAccess.getRangeAccess().getBound_lowerBound_DownParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_33);
            lv_bound_lower_3_0=ruleBound_Down();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRangeRule());
            					}
            					set(
            						current,
            						"bound_lower",
            						lv_bound_lower_3_0,
            						"org.xtext.example.mydsl.Adeptness.Bound_Down");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,38,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getRangeAccess().getAndKeyword_4());
            		
            // InternalAdeptness.g:1194:3: ( (lv_bound_upp_5_0= ruleBound_up ) )
            // InternalAdeptness.g:1195:4: (lv_bound_upp_5_0= ruleBound_up )
            {
            // InternalAdeptness.g:1195:4: (lv_bound_upp_5_0= ruleBound_up )
            // InternalAdeptness.g:1196:5: lv_bound_upp_5_0= ruleBound_up
            {

            					newCompositeNode(grammarAccess.getRangeAccess().getBound_uppBound_upParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_bound_upp_5_0=ruleBound_up();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRangeRule());
            					}
            					set(
            						current,
            						"bound_upp",
            						lv_bound_upp_5_0,
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
    // InternalAdeptness.g:1217:1: entryRuleGap returns [EObject current=null] : iv_ruleGap= ruleGap EOF ;
    public final EObject entryRuleGap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGap = null;


        try {
            // InternalAdeptness.g:1217:44: (iv_ruleGap= ruleGap EOF )
            // InternalAdeptness.g:1218:2: iv_ruleGap= ruleGap EOF
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
    // InternalAdeptness.g:1224:1: ruleGap returns [EObject current=null] : (otherlv_0= 'not' otherlv_1= 'in' otherlv_2= 'range' otherlv_3= 'between' ( (lv_bound_lower_4_0= ruleBound_Down ) ) otherlv_5= 'and' ( (lv_bound_upp_6_0= ruleBound_up ) ) ) ;
    public final EObject ruleGap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_bound_lower_4_0 = null;

        EObject lv_bound_upp_6_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1230:2: ( (otherlv_0= 'not' otherlv_1= 'in' otherlv_2= 'range' otherlv_3= 'between' ( (lv_bound_lower_4_0= ruleBound_Down ) ) otherlv_5= 'and' ( (lv_bound_upp_6_0= ruleBound_up ) ) ) )
            // InternalAdeptness.g:1231:2: (otherlv_0= 'not' otherlv_1= 'in' otherlv_2= 'range' otherlv_3= 'between' ( (lv_bound_lower_4_0= ruleBound_Down ) ) otherlv_5= 'and' ( (lv_bound_upp_6_0= ruleBound_up ) ) )
            {
            // InternalAdeptness.g:1231:2: (otherlv_0= 'not' otherlv_1= 'in' otherlv_2= 'range' otherlv_3= 'between' ( (lv_bound_lower_4_0= ruleBound_Down ) ) otherlv_5= 'and' ( (lv_bound_upp_6_0= ruleBound_up ) ) )
            // InternalAdeptness.g:1232:3: otherlv_0= 'not' otherlv_1= 'in' otherlv_2= 'range' otherlv_3= 'between' ( (lv_bound_lower_4_0= ruleBound_Down ) ) otherlv_5= 'and' ( (lv_bound_upp_6_0= ruleBound_up ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getGapAccess().getNotKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getGapAccess().getInKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getGapAccess().getRangeKeyword_2());
            		
            otherlv_3=(Token)match(input,37,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getGapAccess().getBetweenKeyword_3());
            		
            // InternalAdeptness.g:1248:3: ( (lv_bound_lower_4_0= ruleBound_Down ) )
            // InternalAdeptness.g:1249:4: (lv_bound_lower_4_0= ruleBound_Down )
            {
            // InternalAdeptness.g:1249:4: (lv_bound_lower_4_0= ruleBound_Down )
            // InternalAdeptness.g:1250:5: lv_bound_lower_4_0= ruleBound_Down
            {

            					newCompositeNode(grammarAccess.getGapAccess().getBound_lowerBound_DownParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_33);
            lv_bound_lower_4_0=ruleBound_Down();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapRule());
            					}
            					set(
            						current,
            						"bound_lower",
            						lv_bound_lower_4_0,
            						"org.xtext.example.mydsl.Adeptness.Bound_Down");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,38,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getGapAccess().getAndKeyword_5());
            		
            // InternalAdeptness.g:1271:3: ( (lv_bound_upp_6_0= ruleBound_up ) )
            // InternalAdeptness.g:1272:4: (lv_bound_upp_6_0= ruleBound_up )
            {
            // InternalAdeptness.g:1272:4: (lv_bound_upp_6_0= ruleBound_up )
            // InternalAdeptness.g:1273:5: lv_bound_upp_6_0= ruleBound_up
            {

            					newCompositeNode(grammarAccess.getGapAccess().getBound_uppBound_upParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_bound_upp_6_0=ruleBound_up();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGapRule());
            					}
            					set(
            						current,
            						"bound_upp",
            						lv_bound_upp_6_0,
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
    // InternalAdeptness.g:1294:1: entryRuleBound_up returns [EObject current=null] : iv_ruleBound_up= ruleBound_up EOF ;
    public final EObject entryRuleBound_up() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBound_up = null;


        try {
            // InternalAdeptness.g:1294:49: (iv_ruleBound_up= ruleBound_up EOF )
            // InternalAdeptness.g:1295:2: iv_ruleBound_up= ruleBound_up EOF
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
    // InternalAdeptness.g:1301:1: ruleBound_up returns [EObject current=null] : ( (lv_value_0_0= ruleDOUBLE ) ) ;
    public final EObject ruleBound_up() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1307:2: ( ( (lv_value_0_0= ruleDOUBLE ) ) )
            // InternalAdeptness.g:1308:2: ( (lv_value_0_0= ruleDOUBLE ) )
            {
            // InternalAdeptness.g:1308:2: ( (lv_value_0_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1309:3: (lv_value_0_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1309:3: (lv_value_0_0= ruleDOUBLE )
            // InternalAdeptness.g:1310:4: lv_value_0_0= ruleDOUBLE
            {

            				newCompositeNode(grammarAccess.getBound_upAccess().getValueDOUBLEParserRuleCall_0());
            			
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
    // InternalAdeptness.g:1330:1: entryRuleBound_Down returns [EObject current=null] : iv_ruleBound_Down= ruleBound_Down EOF ;
    public final EObject entryRuleBound_Down() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBound_Down = null;


        try {
            // InternalAdeptness.g:1330:51: (iv_ruleBound_Down= ruleBound_Down EOF )
            // InternalAdeptness.g:1331:2: iv_ruleBound_Down= ruleBound_Down EOF
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
    // InternalAdeptness.g:1337:1: ruleBound_Down returns [EObject current=null] : ( (lv_value_0_0= ruleDOUBLE ) ) ;
    public final EObject ruleBound_Down() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1343:2: ( ( (lv_value_0_0= ruleDOUBLE ) ) )
            // InternalAdeptness.g:1344:2: ( (lv_value_0_0= ruleDOUBLE ) )
            {
            // InternalAdeptness.g:1344:2: ( (lv_value_0_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1345:3: (lv_value_0_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1345:3: (lv_value_0_0= ruleDOUBLE )
            // InternalAdeptness.g:1346:4: lv_value_0_0= ruleDOUBLE
            {

            				newCompositeNode(grammarAccess.getBound_DownAccess().getValueDOUBLEParserRuleCall_0());
            			
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
    // InternalAdeptness.g:1366:1: entryRuleBOOLEAN returns [EObject current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final EObject entryRuleBOOLEAN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOOLEAN = null;


        try {
            // InternalAdeptness.g:1366:48: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalAdeptness.g:1367:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
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
    // InternalAdeptness.g:1373:1: ruleBOOLEAN returns [EObject current=null] : ( (lv_bool_0_0= ruleb ) ) ;
    public final EObject ruleBOOLEAN() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_bool_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1379:2: ( ( (lv_bool_0_0= ruleb ) ) )
            // InternalAdeptness.g:1380:2: ( (lv_bool_0_0= ruleb ) )
            {
            // InternalAdeptness.g:1380:2: ( (lv_bool_0_0= ruleb ) )
            // InternalAdeptness.g:1381:3: (lv_bool_0_0= ruleb )
            {
            // InternalAdeptness.g:1381:3: (lv_bool_0_0= ruleb )
            // InternalAdeptness.g:1382:4: lv_bool_0_0= ruleb
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
    // InternalAdeptness.g:1402:1: entryRuleb returns [String current=null] : iv_ruleb= ruleb EOF ;
    public final String entryRuleb() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleb = null;


        try {
            // InternalAdeptness.g:1402:41: (iv_ruleb= ruleb EOF )
            // InternalAdeptness.g:1403:2: iv_ruleb= ruleb EOF
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
    // InternalAdeptness.g:1409:1: ruleb returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleb() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdeptness.g:1415:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalAdeptness.g:1416:2: (kw= 'true' | kw= 'false' )
            {
            // InternalAdeptness.g:1416:2: (kw= 'true' | kw= 'false' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                alt12=1;
            }
            else if ( (LA12_0==41) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalAdeptness.g:1417:3: kw= 'true'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1423:3: kw= 'false'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

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
    // InternalAdeptness.g:1432:1: entryRuleDOUBLE returns [EObject current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final EObject entryRuleDOUBLE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOUBLE = null;


        try {
            // InternalAdeptness.g:1432:47: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalAdeptness.g:1433:2: iv_ruleDOUBLE= ruleDOUBLE EOF
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
    // InternalAdeptness.g:1439:1: ruleDOUBLE returns [EObject current=null] : ( (lv_dVal_0_0= ruled ) ) ;
    public final EObject ruleDOUBLE() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_dVal_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1445:2: ( ( (lv_dVal_0_0= ruled ) ) )
            // InternalAdeptness.g:1446:2: ( (lv_dVal_0_0= ruled ) )
            {
            // InternalAdeptness.g:1446:2: ( (lv_dVal_0_0= ruled ) )
            // InternalAdeptness.g:1447:3: (lv_dVal_0_0= ruled )
            {
            // InternalAdeptness.g:1447:3: (lv_dVal_0_0= ruled )
            // InternalAdeptness.g:1448:4: lv_dVal_0_0= ruled
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
    // InternalAdeptness.g:1468:1: entryRuled returns [String current=null] : iv_ruled= ruled EOF ;
    public final String entryRuled() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruled = null;


        try {
            // InternalAdeptness.g:1468:41: (iv_ruled= ruled EOF )
            // InternalAdeptness.g:1469:2: iv_ruled= ruled EOF
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
    // InternalAdeptness.g:1475:1: ruled returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruled() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalAdeptness.g:1481:2: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // InternalAdeptness.g:1482:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // InternalAdeptness.g:1482:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // InternalAdeptness.g:1483:3: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // InternalAdeptness.g:1483:3: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==42) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAdeptness.g:1484:4: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_34); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_6); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getDAccess().getINTTerminalRuleCall_1());
            		
            // InternalAdeptness.g:1497:3: (kw= '.' this_INT_3= RULE_INT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAdeptness.g:1498:4: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,13,FOLLOW_34); 

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


    // $ANTLR start "entryRuleDataType"
    // InternalAdeptness.g:1515:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalAdeptness.g:1515:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalAdeptness.g:1516:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalAdeptness.g:1522:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAdeptness.g:1528:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAdeptness.g:1529:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAdeptness.g:1529:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAdeptness.g:1530:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalAdeptness.g:1534:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:1535:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:1535:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:1536:5: lv_name_1_0= RULE_ID
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
    // InternalAdeptness.g:1556:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalAdeptness.g:1556:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalAdeptness.g:1557:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
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
    // InternalAdeptness.g:1563:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1569:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // InternalAdeptness.g:1570:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // InternalAdeptness.g:1570:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // InternalAdeptness.g:1571:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
            		
            // InternalAdeptness.g:1575:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAdeptness.g:1576:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAdeptness.g:1576:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAdeptness.g:1577:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
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

            otherlv_2=(Token)match(input,45,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAdeptness.g:1598:3: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==11||LA15_0==14||(LA15_0>=43 && LA15_0<=44)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAdeptness.g:1599:4: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // InternalAdeptness.g:1599:4: (lv_elements_3_0= ruleAbstractElement )
            	    // InternalAdeptness.g:1600:5: lv_elements_3_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_36);
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
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,46,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000180000004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008C04000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000221800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000580000004800L});

}