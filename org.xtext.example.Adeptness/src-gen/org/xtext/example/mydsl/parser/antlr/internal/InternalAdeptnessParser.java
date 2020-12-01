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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'signal'", "'{'", "'}'", "'Check_Static_Upper'", "'Check_Static_Lower'", "'Check_Range'", "'Check_Gap'", "'inclusiveBound'", "'='", "'bound_up'", "'bound_down'", "'true'", "'false'", "'-'", "'datatype'", "'package'"
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

                if ( (LA1_0==11||LA1_0==14||(LA1_0>=28 && LA1_0<=29)) ) {
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
            case 29:
                {
                alt2=1;
                }
                break;
            case 14:
            case 28:
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

            if ( (LA5_0==28) ) {
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
    // InternalAdeptness.g:306:1: ruleSignal returns [EObject current=null] : (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_check_static_upper_3_0= ruleCheck_Static_upper_only ) )* ( (lv_check_static_lower_4_0= ruleCheck_Static_lower_only ) )* ( (lv_check_range_5_0= ruleCheck_Range ) )* ( (lv_check_gap_6_0= ruleCheck_Gap ) )* otherlv_7= '}' ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_check_static_upper_3_0 = null;

        EObject lv_check_static_lower_4_0 = null;

        EObject lv_check_range_5_0 = null;

        EObject lv_check_gap_6_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:312:2: ( (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_check_static_upper_3_0= ruleCheck_Static_upper_only ) )* ( (lv_check_static_lower_4_0= ruleCheck_Static_lower_only ) )* ( (lv_check_range_5_0= ruleCheck_Range ) )* ( (lv_check_gap_6_0= ruleCheck_Gap ) )* otherlv_7= '}' ) )
            // InternalAdeptness.g:313:2: (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_check_static_upper_3_0= ruleCheck_Static_upper_only ) )* ( (lv_check_static_lower_4_0= ruleCheck_Static_lower_only ) )* ( (lv_check_range_5_0= ruleCheck_Range ) )* ( (lv_check_gap_6_0= ruleCheck_Gap ) )* otherlv_7= '}' )
            {
            // InternalAdeptness.g:313:2: (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_check_static_upper_3_0= ruleCheck_Static_upper_only ) )* ( (lv_check_static_lower_4_0= ruleCheck_Static_lower_only ) )* ( (lv_check_range_5_0= ruleCheck_Range ) )* ( (lv_check_gap_6_0= ruleCheck_Gap ) )* otherlv_7= '}' )
            // InternalAdeptness.g:314:3: otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_check_static_upper_3_0= ruleCheck_Static_upper_only ) )* ( (lv_check_static_lower_4_0= ruleCheck_Static_lower_only ) )* ( (lv_check_range_5_0= ruleCheck_Range ) )* ( (lv_check_gap_6_0= ruleCheck_Gap ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSignalAccess().getSignalKeyword_0());
            		
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

            			newLeafNode(otherlv_2, grammarAccess.getSignalAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAdeptness.g:340:3: ( (lv_check_static_upper_3_0= ruleCheck_Static_upper_only ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAdeptness.g:341:4: (lv_check_static_upper_3_0= ruleCheck_Static_upper_only )
            	    {
            	    // InternalAdeptness.g:341:4: (lv_check_static_upper_3_0= ruleCheck_Static_upper_only )
            	    // InternalAdeptness.g:342:5: lv_check_static_upper_3_0= ruleCheck_Static_upper_only
            	    {

            	    					newCompositeNode(grammarAccess.getSignalAccess().getCheck_static_upperCheck_Static_upper_onlyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_check_static_upper_3_0=ruleCheck_Static_upper_only();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSignalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"check_static_upper",
            	    						lv_check_static_upper_3_0,
            	    						"org.xtext.example.mydsl.Adeptness.Check_Static_upper_only");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalAdeptness.g:359:3: ( (lv_check_static_lower_4_0= ruleCheck_Static_lower_only ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAdeptness.g:360:4: (lv_check_static_lower_4_0= ruleCheck_Static_lower_only )
            	    {
            	    // InternalAdeptness.g:360:4: (lv_check_static_lower_4_0= ruleCheck_Static_lower_only )
            	    // InternalAdeptness.g:361:5: lv_check_static_lower_4_0= ruleCheck_Static_lower_only
            	    {

            	    					newCompositeNode(grammarAccess.getSignalAccess().getCheck_static_lowerCheck_Static_lower_onlyParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_check_static_lower_4_0=ruleCheck_Static_lower_only();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSignalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"check_static_lower",
            	    						lv_check_static_lower_4_0,
            	    						"org.xtext.example.mydsl.Adeptness.Check_Static_lower_only");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalAdeptness.g:378:3: ( (lv_check_range_5_0= ruleCheck_Range ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAdeptness.g:379:4: (lv_check_range_5_0= ruleCheck_Range )
            	    {
            	    // InternalAdeptness.g:379:4: (lv_check_range_5_0= ruleCheck_Range )
            	    // InternalAdeptness.g:380:5: lv_check_range_5_0= ruleCheck_Range
            	    {

            	    					newCompositeNode(grammarAccess.getSignalAccess().getCheck_rangeCheck_RangeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_check_range_5_0=ruleCheck_Range();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSignalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"check_range",
            	    						lv_check_range_5_0,
            	    						"org.xtext.example.mydsl.Adeptness.Check_Range");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalAdeptness.g:397:3: ( (lv_check_gap_6_0= ruleCheck_Gap ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAdeptness.g:398:4: (lv_check_gap_6_0= ruleCheck_Gap )
            	    {
            	    // InternalAdeptness.g:398:4: (lv_check_gap_6_0= ruleCheck_Gap )
            	    // InternalAdeptness.g:399:5: lv_check_gap_6_0= ruleCheck_Gap
            	    {

            	    					newCompositeNode(grammarAccess.getSignalAccess().getCheck_gapCheck_GapParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_check_gap_6_0=ruleCheck_Gap();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSignalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"check_gap",
            	    						lv_check_gap_6_0,
            	    						"org.xtext.example.mydsl.Adeptness.Check_Gap");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSignalAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleCheck_Static_upper_only"
    // InternalAdeptness.g:424:1: entryRuleCheck_Static_upper_only returns [EObject current=null] : iv_ruleCheck_Static_upper_only= ruleCheck_Static_upper_only EOF ;
    public final EObject entryRuleCheck_Static_upper_only() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck_Static_upper_only = null;


        try {
            // InternalAdeptness.g:424:64: (iv_ruleCheck_Static_upper_only= ruleCheck_Static_upper_only EOF )
            // InternalAdeptness.g:425:2: iv_ruleCheck_Static_upper_only= ruleCheck_Static_upper_only EOF
            {
             newCompositeNode(grammarAccess.getCheck_Static_upper_onlyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheck_Static_upper_only=ruleCheck_Static_upper_only();

            state._fsp--;

             current =iv_ruleCheck_Static_upper_only; 
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
    // $ANTLR end "entryRuleCheck_Static_upper_only"


    // $ANTLR start "ruleCheck_Static_upper_only"
    // InternalAdeptness.g:431:1: ruleCheck_Static_upper_only returns [EObject current=null] : (otherlv_0= 'Check_Static_Upper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) ) ( (lv_bound_up_4_0= ruleBound_up ) ) otherlv_5= '}' ) ;
    public final EObject ruleCheck_Static_upper_only() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_inclusive_bound_3_0 = null;

        EObject lv_bound_up_4_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:437:2: ( (otherlv_0= 'Check_Static_Upper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) ) ( (lv_bound_up_4_0= ruleBound_up ) ) otherlv_5= '}' ) )
            // InternalAdeptness.g:438:2: (otherlv_0= 'Check_Static_Upper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) ) ( (lv_bound_up_4_0= ruleBound_up ) ) otherlv_5= '}' )
            {
            // InternalAdeptness.g:438:2: (otherlv_0= 'Check_Static_Upper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) ) ( (lv_bound_up_4_0= ruleBound_up ) ) otherlv_5= '}' )
            // InternalAdeptness.g:439:3: otherlv_0= 'Check_Static_Upper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) ) ( (lv_bound_up_4_0= ruleBound_up ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCheck_Static_upper_onlyAccess().getCheck_Static_UpperKeyword_0());
            		
            // InternalAdeptness.g:443:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:444:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:444:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:445:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCheck_Static_upper_onlyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheck_Static_upper_onlyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCheck_Static_upper_onlyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAdeptness.g:465:3: ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) )
            // InternalAdeptness.g:466:4: (lv_inclusive_bound_3_0= ruleInclusiveBound )
            {
            // InternalAdeptness.g:466:4: (lv_inclusive_bound_3_0= ruleInclusiveBound )
            // InternalAdeptness.g:467:5: lv_inclusive_bound_3_0= ruleInclusiveBound
            {

            					newCompositeNode(grammarAccess.getCheck_Static_upper_onlyAccess().getInclusive_boundInclusiveBoundParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_inclusive_bound_3_0=ruleInclusiveBound();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheck_Static_upper_onlyRule());
            					}
            					set(
            						current,
            						"inclusive_bound",
            						lv_inclusive_bound_3_0,
            						"org.xtext.example.mydsl.Adeptness.InclusiveBound");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdeptness.g:484:3: ( (lv_bound_up_4_0= ruleBound_up ) )
            // InternalAdeptness.g:485:4: (lv_bound_up_4_0= ruleBound_up )
            {
            // InternalAdeptness.g:485:4: (lv_bound_up_4_0= ruleBound_up )
            // InternalAdeptness.g:486:5: lv_bound_up_4_0= ruleBound_up
            {

            					newCompositeNode(grammarAccess.getCheck_Static_upper_onlyAccess().getBound_upBound_upParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_bound_up_4_0=ruleBound_up();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheck_Static_upper_onlyRule());
            					}
            					set(
            						current,
            						"bound_up",
            						lv_bound_up_4_0,
            						"org.xtext.example.mydsl.Adeptness.Bound_up");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCheck_Static_upper_onlyAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCheck_Static_upper_only"


    // $ANTLR start "entryRuleCheck_Static_lower_only"
    // InternalAdeptness.g:511:1: entryRuleCheck_Static_lower_only returns [EObject current=null] : iv_ruleCheck_Static_lower_only= ruleCheck_Static_lower_only EOF ;
    public final EObject entryRuleCheck_Static_lower_only() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck_Static_lower_only = null;


        try {
            // InternalAdeptness.g:511:64: (iv_ruleCheck_Static_lower_only= ruleCheck_Static_lower_only EOF )
            // InternalAdeptness.g:512:2: iv_ruleCheck_Static_lower_only= ruleCheck_Static_lower_only EOF
            {
             newCompositeNode(grammarAccess.getCheck_Static_lower_onlyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheck_Static_lower_only=ruleCheck_Static_lower_only();

            state._fsp--;

             current =iv_ruleCheck_Static_lower_only; 
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
    // $ANTLR end "entryRuleCheck_Static_lower_only"


    // $ANTLR start "ruleCheck_Static_lower_only"
    // InternalAdeptness.g:518:1: ruleCheck_Static_lower_only returns [EObject current=null] : (otherlv_0= 'Check_Static_Lower' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) ) ( (lv_bound_low_4_0= ruleBound_Down ) ) otherlv_5= '}' ) ;
    public final EObject ruleCheck_Static_lower_only() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_inclusive_bound_3_0 = null;

        EObject lv_bound_low_4_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:524:2: ( (otherlv_0= 'Check_Static_Lower' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) ) ( (lv_bound_low_4_0= ruleBound_Down ) ) otherlv_5= '}' ) )
            // InternalAdeptness.g:525:2: (otherlv_0= 'Check_Static_Lower' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) ) ( (lv_bound_low_4_0= ruleBound_Down ) ) otherlv_5= '}' )
            {
            // InternalAdeptness.g:525:2: (otherlv_0= 'Check_Static_Lower' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) ) ( (lv_bound_low_4_0= ruleBound_Down ) ) otherlv_5= '}' )
            // InternalAdeptness.g:526:3: otherlv_0= 'Check_Static_Lower' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) ) ( (lv_bound_low_4_0= ruleBound_Down ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCheck_Static_lower_onlyAccess().getCheck_Static_LowerKeyword_0());
            		
            // InternalAdeptness.g:530:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:531:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:531:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:532:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCheck_Static_lower_onlyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheck_Static_lower_onlyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCheck_Static_lower_onlyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAdeptness.g:552:3: ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) )
            // InternalAdeptness.g:553:4: (lv_inclusive_bound_3_0= ruleInclusiveBound )
            {
            // InternalAdeptness.g:553:4: (lv_inclusive_bound_3_0= ruleInclusiveBound )
            // InternalAdeptness.g:554:5: lv_inclusive_bound_3_0= ruleInclusiveBound
            {

            					newCompositeNode(grammarAccess.getCheck_Static_lower_onlyAccess().getInclusive_boundInclusiveBoundParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_inclusive_bound_3_0=ruleInclusiveBound();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheck_Static_lower_onlyRule());
            					}
            					set(
            						current,
            						"inclusive_bound",
            						lv_inclusive_bound_3_0,
            						"org.xtext.example.mydsl.Adeptness.InclusiveBound");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdeptness.g:571:3: ( (lv_bound_low_4_0= ruleBound_Down ) )
            // InternalAdeptness.g:572:4: (lv_bound_low_4_0= ruleBound_Down )
            {
            // InternalAdeptness.g:572:4: (lv_bound_low_4_0= ruleBound_Down )
            // InternalAdeptness.g:573:5: lv_bound_low_4_0= ruleBound_Down
            {

            					newCompositeNode(grammarAccess.getCheck_Static_lower_onlyAccess().getBound_lowBound_DownParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_bound_low_4_0=ruleBound_Down();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheck_Static_lower_onlyRule());
            					}
            					set(
            						current,
            						"bound_low",
            						lv_bound_low_4_0,
            						"org.xtext.example.mydsl.Adeptness.Bound_Down");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCheck_Static_lower_onlyAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCheck_Static_lower_only"


    // $ANTLR start "entryRuleCheck_Range"
    // InternalAdeptness.g:598:1: entryRuleCheck_Range returns [EObject current=null] : iv_ruleCheck_Range= ruleCheck_Range EOF ;
    public final EObject entryRuleCheck_Range() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck_Range = null;


        try {
            // InternalAdeptness.g:598:52: (iv_ruleCheck_Range= ruleCheck_Range EOF )
            // InternalAdeptness.g:599:2: iv_ruleCheck_Range= ruleCheck_Range EOF
            {
             newCompositeNode(grammarAccess.getCheck_RangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheck_Range=ruleCheck_Range();

            state._fsp--;

             current =iv_ruleCheck_Range; 
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
    // $ANTLR end "entryRuleCheck_Range"


    // $ANTLR start "ruleCheck_Range"
    // InternalAdeptness.g:605:1: ruleCheck_Range returns [EObject current=null] : (otherlv_0= 'Check_Range' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) ) ( (lv_bound_low_4_0= ruleBound_Down ) ) ( (lv_bound_up_5_0= ruleBound_up ) ) otherlv_6= '}' ) ;
    public final EObject ruleCheck_Range() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_inclusive_bound_3_0 = null;

        EObject lv_bound_low_4_0 = null;

        EObject lv_bound_up_5_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:611:2: ( (otherlv_0= 'Check_Range' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) ) ( (lv_bound_low_4_0= ruleBound_Down ) ) ( (lv_bound_up_5_0= ruleBound_up ) ) otherlv_6= '}' ) )
            // InternalAdeptness.g:612:2: (otherlv_0= 'Check_Range' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) ) ( (lv_bound_low_4_0= ruleBound_Down ) ) ( (lv_bound_up_5_0= ruleBound_up ) ) otherlv_6= '}' )
            {
            // InternalAdeptness.g:612:2: (otherlv_0= 'Check_Range' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) ) ( (lv_bound_low_4_0= ruleBound_Down ) ) ( (lv_bound_up_5_0= ruleBound_up ) ) otherlv_6= '}' )
            // InternalAdeptness.g:613:3: otherlv_0= 'Check_Range' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) ) ( (lv_bound_low_4_0= ruleBound_Down ) ) ( (lv_bound_up_5_0= ruleBound_up ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCheck_RangeAccess().getCheck_RangeKeyword_0());
            		
            // InternalAdeptness.g:617:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:618:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:618:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:619:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCheck_RangeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheck_RangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCheck_RangeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAdeptness.g:639:3: ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) )
            // InternalAdeptness.g:640:4: (lv_inclusive_bound_3_0= ruleInclusiveBound )
            {
            // InternalAdeptness.g:640:4: (lv_inclusive_bound_3_0= ruleInclusiveBound )
            // InternalAdeptness.g:641:5: lv_inclusive_bound_3_0= ruleInclusiveBound
            {

            					newCompositeNode(grammarAccess.getCheck_RangeAccess().getInclusive_boundInclusiveBoundParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_inclusive_bound_3_0=ruleInclusiveBound();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheck_RangeRule());
            					}
            					set(
            						current,
            						"inclusive_bound",
            						lv_inclusive_bound_3_0,
            						"org.xtext.example.mydsl.Adeptness.InclusiveBound");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdeptness.g:658:3: ( (lv_bound_low_4_0= ruleBound_Down ) )
            // InternalAdeptness.g:659:4: (lv_bound_low_4_0= ruleBound_Down )
            {
            // InternalAdeptness.g:659:4: (lv_bound_low_4_0= ruleBound_Down )
            // InternalAdeptness.g:660:5: lv_bound_low_4_0= ruleBound_Down
            {

            					newCompositeNode(grammarAccess.getCheck_RangeAccess().getBound_lowBound_DownParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_bound_low_4_0=ruleBound_Down();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheck_RangeRule());
            					}
            					set(
            						current,
            						"bound_low",
            						lv_bound_low_4_0,
            						"org.xtext.example.mydsl.Adeptness.Bound_Down");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdeptness.g:677:3: ( (lv_bound_up_5_0= ruleBound_up ) )
            // InternalAdeptness.g:678:4: (lv_bound_up_5_0= ruleBound_up )
            {
            // InternalAdeptness.g:678:4: (lv_bound_up_5_0= ruleBound_up )
            // InternalAdeptness.g:679:5: lv_bound_up_5_0= ruleBound_up
            {

            					newCompositeNode(grammarAccess.getCheck_RangeAccess().getBound_upBound_upParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_bound_up_5_0=ruleBound_up();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheck_RangeRule());
            					}
            					set(
            						current,
            						"bound_up",
            						lv_bound_up_5_0,
            						"org.xtext.example.mydsl.Adeptness.Bound_up");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCheck_RangeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCheck_Range"


    // $ANTLR start "entryRuleCheck_Gap"
    // InternalAdeptness.g:704:1: entryRuleCheck_Gap returns [EObject current=null] : iv_ruleCheck_Gap= ruleCheck_Gap EOF ;
    public final EObject entryRuleCheck_Gap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck_Gap = null;


        try {
            // InternalAdeptness.g:704:50: (iv_ruleCheck_Gap= ruleCheck_Gap EOF )
            // InternalAdeptness.g:705:2: iv_ruleCheck_Gap= ruleCheck_Gap EOF
            {
             newCompositeNode(grammarAccess.getCheck_GapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheck_Gap=ruleCheck_Gap();

            state._fsp--;

             current =iv_ruleCheck_Gap; 
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
    // $ANTLR end "entryRuleCheck_Gap"


    // $ANTLR start "ruleCheck_Gap"
    // InternalAdeptness.g:711:1: ruleCheck_Gap returns [EObject current=null] : (otherlv_0= 'Check_Gap' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) ) ( (lv_bound_low_4_0= ruleBound_Down ) ) ( (lv_bound_up_5_0= ruleBound_up ) ) otherlv_6= '}' ) ;
    public final EObject ruleCheck_Gap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_inclusive_bound_3_0 = null;

        EObject lv_bound_low_4_0 = null;

        EObject lv_bound_up_5_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:717:2: ( (otherlv_0= 'Check_Gap' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) ) ( (lv_bound_low_4_0= ruleBound_Down ) ) ( (lv_bound_up_5_0= ruleBound_up ) ) otherlv_6= '}' ) )
            // InternalAdeptness.g:718:2: (otherlv_0= 'Check_Gap' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) ) ( (lv_bound_low_4_0= ruleBound_Down ) ) ( (lv_bound_up_5_0= ruleBound_up ) ) otherlv_6= '}' )
            {
            // InternalAdeptness.g:718:2: (otherlv_0= 'Check_Gap' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) ) ( (lv_bound_low_4_0= ruleBound_Down ) ) ( (lv_bound_up_5_0= ruleBound_up ) ) otherlv_6= '}' )
            // InternalAdeptness.g:719:3: otherlv_0= 'Check_Gap' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) ) ( (lv_bound_low_4_0= ruleBound_Down ) ) ( (lv_bound_up_5_0= ruleBound_up ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCheck_GapAccess().getCheck_GapKeyword_0());
            		
            // InternalAdeptness.g:723:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:724:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:724:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:725:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCheck_GapAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheck_GapRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCheck_GapAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAdeptness.g:745:3: ( (lv_inclusive_bound_3_0= ruleInclusiveBound ) )
            // InternalAdeptness.g:746:4: (lv_inclusive_bound_3_0= ruleInclusiveBound )
            {
            // InternalAdeptness.g:746:4: (lv_inclusive_bound_3_0= ruleInclusiveBound )
            // InternalAdeptness.g:747:5: lv_inclusive_bound_3_0= ruleInclusiveBound
            {

            					newCompositeNode(grammarAccess.getCheck_GapAccess().getInclusive_boundInclusiveBoundParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_inclusive_bound_3_0=ruleInclusiveBound();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheck_GapRule());
            					}
            					set(
            						current,
            						"inclusive_bound",
            						lv_inclusive_bound_3_0,
            						"org.xtext.example.mydsl.Adeptness.InclusiveBound");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdeptness.g:764:3: ( (lv_bound_low_4_0= ruleBound_Down ) )
            // InternalAdeptness.g:765:4: (lv_bound_low_4_0= ruleBound_Down )
            {
            // InternalAdeptness.g:765:4: (lv_bound_low_4_0= ruleBound_Down )
            // InternalAdeptness.g:766:5: lv_bound_low_4_0= ruleBound_Down
            {

            					newCompositeNode(grammarAccess.getCheck_GapAccess().getBound_lowBound_DownParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_bound_low_4_0=ruleBound_Down();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheck_GapRule());
            					}
            					set(
            						current,
            						"bound_low",
            						lv_bound_low_4_0,
            						"org.xtext.example.mydsl.Adeptness.Bound_Down");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdeptness.g:783:3: ( (lv_bound_up_5_0= ruleBound_up ) )
            // InternalAdeptness.g:784:4: (lv_bound_up_5_0= ruleBound_up )
            {
            // InternalAdeptness.g:784:4: (lv_bound_up_5_0= ruleBound_up )
            // InternalAdeptness.g:785:5: lv_bound_up_5_0= ruleBound_up
            {

            					newCompositeNode(grammarAccess.getCheck_GapAccess().getBound_upBound_upParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_bound_up_5_0=ruleBound_up();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheck_GapRule());
            					}
            					set(
            						current,
            						"bound_up",
            						lv_bound_up_5_0,
            						"org.xtext.example.mydsl.Adeptness.Bound_up");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCheck_GapAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCheck_Gap"


    // $ANTLR start "entryRuleInclusiveBound"
    // InternalAdeptness.g:810:1: entryRuleInclusiveBound returns [EObject current=null] : iv_ruleInclusiveBound= ruleInclusiveBound EOF ;
    public final EObject entryRuleInclusiveBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclusiveBound = null;


        try {
            // InternalAdeptness.g:810:55: (iv_ruleInclusiveBound= ruleInclusiveBound EOF )
            // InternalAdeptness.g:811:2: iv_ruleInclusiveBound= ruleInclusiveBound EOF
            {
             newCompositeNode(grammarAccess.getInclusiveBoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInclusiveBound=ruleInclusiveBound();

            state._fsp--;

             current =iv_ruleInclusiveBound; 
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
    // $ANTLR end "entryRuleInclusiveBound"


    // $ANTLR start "ruleInclusiveBound"
    // InternalAdeptness.g:817:1: ruleInclusiveBound returns [EObject current=null] : (otherlv_0= 'inclusiveBound' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleBOOLEAN ) ) ) ;
    public final EObject ruleInclusiveBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:823:2: ( (otherlv_0= 'inclusiveBound' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleBOOLEAN ) ) ) )
            // InternalAdeptness.g:824:2: (otherlv_0= 'inclusiveBound' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleBOOLEAN ) ) )
            {
            // InternalAdeptness.g:824:2: (otherlv_0= 'inclusiveBound' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleBOOLEAN ) ) )
            // InternalAdeptness.g:825:3: otherlv_0= 'inclusiveBound' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleBOOLEAN ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInclusiveBoundAccess().getInclusiveBoundKeyword_0());
            		
            // InternalAdeptness.g:829:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:830:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:830:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:831:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInclusiveBoundAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInclusiveBoundRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getInclusiveBoundAccess().getEqualsSignKeyword_2());
            		
            // InternalAdeptness.g:851:3: ( (lv_value_3_0= ruleBOOLEAN ) )
            // InternalAdeptness.g:852:4: (lv_value_3_0= ruleBOOLEAN )
            {
            // InternalAdeptness.g:852:4: (lv_value_3_0= ruleBOOLEAN )
            // InternalAdeptness.g:853:5: lv_value_3_0= ruleBOOLEAN
            {

            					newCompositeNode(grammarAccess.getInclusiveBoundAccess().getValueBOOLEANParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleBOOLEAN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInclusiveBoundRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.mydsl.Adeptness.BOOLEAN");
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
    // $ANTLR end "ruleInclusiveBound"


    // $ANTLR start "entryRuleBound_up"
    // InternalAdeptness.g:874:1: entryRuleBound_up returns [EObject current=null] : iv_ruleBound_up= ruleBound_up EOF ;
    public final EObject entryRuleBound_up() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBound_up = null;


        try {
            // InternalAdeptness.g:874:49: (iv_ruleBound_up= ruleBound_up EOF )
            // InternalAdeptness.g:875:2: iv_ruleBound_up= ruleBound_up EOF
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
    // InternalAdeptness.g:881:1: ruleBound_up returns [EObject current=null] : (otherlv_0= 'bound_up' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleBound_up() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:887:2: ( (otherlv_0= 'bound_up' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleDOUBLE ) ) ) )
            // InternalAdeptness.g:888:2: (otherlv_0= 'bound_up' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleDOUBLE ) ) )
            {
            // InternalAdeptness.g:888:2: (otherlv_0= 'bound_up' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleDOUBLE ) ) )
            // InternalAdeptness.g:889:3: otherlv_0= 'bound_up' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBound_upAccess().getBound_upKeyword_0());
            		
            // InternalAdeptness.g:893:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:894:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:894:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:895:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBound_upAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBound_upRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getBound_upAccess().getEqualsSignKeyword_2());
            		
            // InternalAdeptness.g:915:3: ( (lv_value_3_0= ruleDOUBLE ) )
            // InternalAdeptness.g:916:4: (lv_value_3_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:916:4: (lv_value_3_0= ruleDOUBLE )
            // InternalAdeptness.g:917:5: lv_value_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getBound_upAccess().getValueDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBound_upRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
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
    // $ANTLR end "ruleBound_up"


    // $ANTLR start "entryRuleBound_Down"
    // InternalAdeptness.g:938:1: entryRuleBound_Down returns [EObject current=null] : iv_ruleBound_Down= ruleBound_Down EOF ;
    public final EObject entryRuleBound_Down() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBound_Down = null;


        try {
            // InternalAdeptness.g:938:51: (iv_ruleBound_Down= ruleBound_Down EOF )
            // InternalAdeptness.g:939:2: iv_ruleBound_Down= ruleBound_Down EOF
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
    // InternalAdeptness.g:945:1: ruleBound_Down returns [EObject current=null] : (otherlv_0= 'bound_down' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleBound_Down() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:951:2: ( (otherlv_0= 'bound_down' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleDOUBLE ) ) ) )
            // InternalAdeptness.g:952:2: (otherlv_0= 'bound_down' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleDOUBLE ) ) )
            {
            // InternalAdeptness.g:952:2: (otherlv_0= 'bound_down' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleDOUBLE ) ) )
            // InternalAdeptness.g:953:3: otherlv_0= 'bound_down' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBound_DownAccess().getBound_downKeyword_0());
            		
            // InternalAdeptness.g:957:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:958:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:958:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:959:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBound_DownAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBound_DownRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getBound_DownAccess().getEqualsSignKeyword_2());
            		
            // InternalAdeptness.g:979:3: ( (lv_value_3_0= ruleDOUBLE ) )
            // InternalAdeptness.g:980:4: (lv_value_3_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:980:4: (lv_value_3_0= ruleDOUBLE )
            // InternalAdeptness.g:981:5: lv_value_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getBound_DownAccess().getValueDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBound_DownRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
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
    // $ANTLR end "ruleBound_Down"


    // $ANTLR start "entryRuleBOOLEAN"
    // InternalAdeptness.g:1002:1: entryRuleBOOLEAN returns [EObject current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final EObject entryRuleBOOLEAN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOOLEAN = null;


        try {
            // InternalAdeptness.g:1002:48: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalAdeptness.g:1003:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
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
    // InternalAdeptness.g:1009:1: ruleBOOLEAN returns [EObject current=null] : ( (lv_bool_0_0= ruleb ) ) ;
    public final EObject ruleBOOLEAN() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_bool_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1015:2: ( ( (lv_bool_0_0= ruleb ) ) )
            // InternalAdeptness.g:1016:2: ( (lv_bool_0_0= ruleb ) )
            {
            // InternalAdeptness.g:1016:2: ( (lv_bool_0_0= ruleb ) )
            // InternalAdeptness.g:1017:3: (lv_bool_0_0= ruleb )
            {
            // InternalAdeptness.g:1017:3: (lv_bool_0_0= ruleb )
            // InternalAdeptness.g:1018:4: lv_bool_0_0= ruleb
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
    // InternalAdeptness.g:1038:1: entryRuleb returns [String current=null] : iv_ruleb= ruleb EOF ;
    public final String entryRuleb() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleb = null;


        try {
            // InternalAdeptness.g:1038:41: (iv_ruleb= ruleb EOF )
            // InternalAdeptness.g:1039:2: iv_ruleb= ruleb EOF
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
    // InternalAdeptness.g:1045:1: ruleb returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleb() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdeptness.g:1051:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalAdeptness.g:1052:2: (kw= 'true' | kw= 'false' )
            {
            // InternalAdeptness.g:1052:2: (kw= 'true' | kw= 'false' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAdeptness.g:1053:3: kw= 'true'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1059:3: kw= 'false'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

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
    // InternalAdeptness.g:1068:1: entryRuleDOUBLE returns [EObject current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final EObject entryRuleDOUBLE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOUBLE = null;


        try {
            // InternalAdeptness.g:1068:47: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalAdeptness.g:1069:2: iv_ruleDOUBLE= ruleDOUBLE EOF
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
    // InternalAdeptness.g:1075:1: ruleDOUBLE returns [EObject current=null] : ( (lv_dVal_0_0= ruled ) ) ;
    public final EObject ruleDOUBLE() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_dVal_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1081:2: ( ( (lv_dVal_0_0= ruled ) ) )
            // InternalAdeptness.g:1082:2: ( (lv_dVal_0_0= ruled ) )
            {
            // InternalAdeptness.g:1082:2: ( (lv_dVal_0_0= ruled ) )
            // InternalAdeptness.g:1083:3: (lv_dVal_0_0= ruled )
            {
            // InternalAdeptness.g:1083:3: (lv_dVal_0_0= ruled )
            // InternalAdeptness.g:1084:4: lv_dVal_0_0= ruled
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
    // InternalAdeptness.g:1104:1: entryRuled returns [String current=null] : iv_ruled= ruled EOF ;
    public final String entryRuled() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruled = null;


        try {
            // InternalAdeptness.g:1104:41: (iv_ruled= ruled EOF )
            // InternalAdeptness.g:1105:2: iv_ruled= ruled EOF
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
    // InternalAdeptness.g:1111:1: ruled returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruled() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalAdeptness.g:1117:2: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // InternalAdeptness.g:1118:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // InternalAdeptness.g:1118:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // InternalAdeptness.g:1119:3: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // InternalAdeptness.g:1119:3: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAdeptness.g:1120:4: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_6); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getDAccess().getINTTerminalRuleCall_1());
            		
            // InternalAdeptness.g:1133:3: (kw= '.' this_INT_3= RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAdeptness.g:1134:4: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,13,FOLLOW_19); 

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
    // InternalAdeptness.g:1151:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalAdeptness.g:1151:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalAdeptness.g:1152:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalAdeptness.g:1158:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAdeptness.g:1164:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAdeptness.g:1165:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAdeptness.g:1165:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAdeptness.g:1166:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalAdeptness.g:1170:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:1171:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:1171:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:1172:5: lv_name_1_0= RULE_ID
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
    // InternalAdeptness.g:1192:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalAdeptness.g:1192:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalAdeptness.g:1193:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
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
    // InternalAdeptness.g:1199:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1205:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // InternalAdeptness.g:1206:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // InternalAdeptness.g:1206:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // InternalAdeptness.g:1207:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
            		
            // InternalAdeptness.g:1211:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAdeptness.g:1212:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAdeptness.g:1212:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAdeptness.g:1213:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_2=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAdeptness.g:1234:3: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==11||LA13_0==14||(LA13_0>=28 && LA13_0<=29)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAdeptness.g:1235:4: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // InternalAdeptness.g:1235:4: (lv_elements_3_0= ruleAbstractElement )
            	    // InternalAdeptness.g:1236:5: lv_elements_3_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000030004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001D0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000190000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000030014800L});

}