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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'MONITORINGPLAN'", "':'", "'ENDMONITORINGPLAN'", "'MONITOR'", "'type'", "'max'", "'min'", "'ENDMONITOR'", "'boolean'", "'double'", "'int'", "'CPS'", "'ENDCPS'", "'ORACLE'", "'ENDORACLE'", "'checks:'", "'Description: '", "'fails if :'", "';'", "'confidence is below'", "'more than'", "'times within'", "'confidence is in constant degradation'", "'within'", "'is below'", "'is above'", "'is in range between'", "'and'", "'not in range between'", "'true'", "'false'", "'-'", "'miliseconds'", "'seconds'", "'minutes'", "'hours'", "'datatype'", "'package'", "'{'", "'}'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
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

                if ( (LA1_0==11||LA1_0==14||(LA1_0>=50 && LA1_0<=51)) ) {
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
            case 51:
                {
                alt2=1;
                }
                break;
            case 14:
            case 50:
                {
                alt2=2;
                }
                break;
            case 11:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==RULE_STRING) ) {
                    alt2=2;
                }
                else if ( (LA2_3==RULE_ID) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
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
            case 50:
                {
                alt5=1;
                }
                break;
            case 11:
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
    // InternalAdeptness.g:551:1: ruleSig_type returns [EObject current=null] : ( ( (lv_sig_type_0_1= 'boolean' | lv_sig_type_0_2= 'double' | lv_sig_type_0_3= 'int' ) ) ) ;
    public final EObject ruleSig_type() throws RecognitionException {
        EObject current = null;

        Token lv_sig_type_0_1=null;
        Token lv_sig_type_0_2=null;
        Token lv_sig_type_0_3=null;


        	enterRule();

        try {
            // InternalAdeptness.g:557:2: ( ( ( (lv_sig_type_0_1= 'boolean' | lv_sig_type_0_2= 'double' | lv_sig_type_0_3= 'int' ) ) ) )
            // InternalAdeptness.g:558:2: ( ( (lv_sig_type_0_1= 'boolean' | lv_sig_type_0_2= 'double' | lv_sig_type_0_3= 'int' ) ) )
            {
            // InternalAdeptness.g:558:2: ( ( (lv_sig_type_0_1= 'boolean' | lv_sig_type_0_2= 'double' | lv_sig_type_0_3= 'int' ) ) )
            // InternalAdeptness.g:559:3: ( (lv_sig_type_0_1= 'boolean' | lv_sig_type_0_2= 'double' | lv_sig_type_0_3= 'int' ) )
            {
            // InternalAdeptness.g:559:3: ( (lv_sig_type_0_1= 'boolean' | lv_sig_type_0_2= 'double' | lv_sig_type_0_3= 'int' ) )
            // InternalAdeptness.g:560:4: (lv_sig_type_0_1= 'boolean' | lv_sig_type_0_2= 'double' | lv_sig_type_0_3= 'int' )
            {
            // InternalAdeptness.g:560:4: (lv_sig_type_0_1= 'boolean' | lv_sig_type_0_2= 'double' | lv_sig_type_0_3= 'int' )
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
                    // InternalAdeptness.g:561:5: lv_sig_type_0_1= 'boolean'
                    {
                    lv_sig_type_0_1=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_sig_type_0_1, grammarAccess.getSig_typeAccess().getSig_typeBooleanKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSig_typeRule());
                    					}
                    					setWithLastConsumed(current, "sig_type", lv_sig_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:572:5: lv_sig_type_0_2= 'double'
                    {
                    lv_sig_type_0_2=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_sig_type_0_2, grammarAccess.getSig_typeAccess().getSig_typeDoubleKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSig_typeRule());
                    					}
                    					setWithLastConsumed(current, "sig_type", lv_sig_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:583:5: lv_sig_type_0_3= 'int'
                    {
                    lv_sig_type_0_3=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_sig_type_0_3, grammarAccess.getSig_typeAccess().getSig_typeIntKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSig_typeRule());
                    					}
                    					setWithLastConsumed(current, "sig_type", lv_sig_type_0_3, null);
                    				

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
    // $ANTLR end "ruleSig_type"


    // $ANTLR start "entryRuleSignal"
    // InternalAdeptness.g:599:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // InternalAdeptness.g:599:47: (iv_ruleSignal= ruleSignal EOF )
            // InternalAdeptness.g:600:2: iv_ruleSignal= ruleSignal EOF
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
    // InternalAdeptness.g:606:1: ruleSignal returns [EObject current=null] : ( ( (lv_imp_0_0= ruleImportMonitoringPlan ) ) otherlv_1= 'CPS' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_oracle_4_0= ruleOracle ) )+ otherlv_5= 'ENDCPS' ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_imp_0_0 = null;

        EObject lv_oracle_4_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:612:2: ( ( ( (lv_imp_0_0= ruleImportMonitoringPlan ) ) otherlv_1= 'CPS' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_oracle_4_0= ruleOracle ) )+ otherlv_5= 'ENDCPS' ) )
            // InternalAdeptness.g:613:2: ( ( (lv_imp_0_0= ruleImportMonitoringPlan ) ) otherlv_1= 'CPS' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_oracle_4_0= ruleOracle ) )+ otherlv_5= 'ENDCPS' )
            {
            // InternalAdeptness.g:613:2: ( ( (lv_imp_0_0= ruleImportMonitoringPlan ) ) otherlv_1= 'CPS' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_oracle_4_0= ruleOracle ) )+ otherlv_5= 'ENDCPS' )
            // InternalAdeptness.g:614:3: ( (lv_imp_0_0= ruleImportMonitoringPlan ) ) otherlv_1= 'CPS' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_oracle_4_0= ruleOracle ) )+ otherlv_5= 'ENDCPS'
            {
            // InternalAdeptness.g:614:3: ( (lv_imp_0_0= ruleImportMonitoringPlan ) )
            // InternalAdeptness.g:615:4: (lv_imp_0_0= ruleImportMonitoringPlan )
            {
            // InternalAdeptness.g:615:4: (lv_imp_0_0= ruleImportMonitoringPlan )
            // InternalAdeptness.g:616:5: lv_imp_0_0= ruleImportMonitoringPlan
            {

            					newCompositeNode(grammarAccess.getSignalAccess().getImpImportMonitoringPlanParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_imp_0_0=ruleImportMonitoringPlan();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSignalRule());
            					}
            					set(
            						current,
            						"imp",
            						lv_imp_0_0,
            						"org.xtext.example.mydsl.Adeptness.ImportMonitoringPlan");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSignalAccess().getCPSKeyword_1());
            		
            // InternalAdeptness.g:637:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAdeptness.g:638:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAdeptness.g:638:4: (lv_name_2_0= RULE_ID )
            // InternalAdeptness.g:639:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getSignalAccess().getColonKeyword_3());
            		
            // InternalAdeptness.g:659:3: ( (lv_oracle_4_0= ruleOracle ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAdeptness.g:660:4: (lv_oracle_4_0= ruleOracle )
            	    {
            	    // InternalAdeptness.g:660:4: (lv_oracle_4_0= ruleOracle )
            	    // InternalAdeptness.g:661:5: lv_oracle_4_0= ruleOracle
            	    {

            	    					newCompositeNode(grammarAccess.getSignalAccess().getOracleOracleParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_oracle_4_0=ruleOracle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSignalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"oracle",
            	    						lv_oracle_4_0,
            	    						"org.xtext.example.mydsl.Adeptness.Oracle");
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

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSignalAccess().getENDCPSKeyword_5());
            		

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


    // $ANTLR start "entryRuleImportMonitoringPlan"
    // InternalAdeptness.g:686:1: entryRuleImportMonitoringPlan returns [EObject current=null] : iv_ruleImportMonitoringPlan= ruleImportMonitoringPlan EOF ;
    public final EObject entryRuleImportMonitoringPlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportMonitoringPlan = null;


        try {
            // InternalAdeptness.g:686:61: (iv_ruleImportMonitoringPlan= ruleImportMonitoringPlan EOF )
            // InternalAdeptness.g:687:2: iv_ruleImportMonitoringPlan= ruleImportMonitoringPlan EOF
            {
             newCompositeNode(grammarAccess.getImportMonitoringPlanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportMonitoringPlan=ruleImportMonitoringPlan();

            state._fsp--;

             current =iv_ruleImportMonitoringPlan; 
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
    // $ANTLR end "entryRuleImportMonitoringPlan"


    // $ANTLR start "ruleImportMonitoringPlan"
    // InternalAdeptness.g:693:1: ruleImportMonitoringPlan returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImportMonitoringPlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalAdeptness.g:699:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalAdeptness.g:700:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalAdeptness.g:700:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalAdeptness.g:701:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getImportMonitoringPlanAccess().getImportKeyword_0());
            		
            // InternalAdeptness.g:705:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalAdeptness.g:706:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalAdeptness.g:706:4: (lv_importURI_1_0= RULE_STRING )
            // InternalAdeptness.g:707:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_importURI_1_0, grammarAccess.getImportMonitoringPlanAccess().getImportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportMonitoringPlanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_1_0,
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
    // $ANTLR end "ruleImportMonitoringPlan"


    // $ANTLR start "entryRuleOracle"
    // InternalAdeptness.g:727:1: entryRuleOracle returns [EObject current=null] : iv_ruleOracle= ruleOracle EOF ;
    public final EObject entryRuleOracle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOracle = null;


        try {
            // InternalAdeptness.g:727:47: (iv_ruleOracle= ruleOracle EOF )
            // InternalAdeptness.g:728:2: iv_ruleOracle= ruleOracle EOF
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
    // InternalAdeptness.g:734:1: ruleOracle returns [EObject current=null] : (otherlv_0= 'ORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_check_3_0= ruleChecks ) )+ otherlv_4= 'ENDORACLE' ) ;
    public final EObject ruleOracle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_check_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:740:2: ( (otherlv_0= 'ORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_check_3_0= ruleChecks ) )+ otherlv_4= 'ENDORACLE' ) )
            // InternalAdeptness.g:741:2: (otherlv_0= 'ORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_check_3_0= ruleChecks ) )+ otherlv_4= 'ENDORACLE' )
            {
            // InternalAdeptness.g:741:2: (otherlv_0= 'ORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_check_3_0= ruleChecks ) )+ otherlv_4= 'ENDORACLE' )
            // InternalAdeptness.g:742:3: otherlv_0= 'ORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_check_3_0= ruleChecks ) )+ otherlv_4= 'ENDORACLE'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOracleAccess().getORACLEKeyword_0());
            		
            // InternalAdeptness.g:746:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:747:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:747:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:748:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getOracleAccess().getColonKeyword_2());
            		
            // InternalAdeptness.g:768:3: ( (lv_check_3_0= ruleChecks ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAdeptness.g:769:4: (lv_check_3_0= ruleChecks )
            	    {
            	    // InternalAdeptness.g:769:4: (lv_check_3_0= ruleChecks )
            	    // InternalAdeptness.g:770:5: lv_check_3_0= ruleChecks
            	    {

            	    					newCompositeNode(grammarAccess.getOracleAccess().getCheckChecksParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_check_3_0=ruleChecks();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOracleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"check",
            	    						lv_check_3_0,
            	    						"org.xtext.example.mydsl.Adeptness.Checks");
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

            otherlv_4=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOracleAccess().getENDORACLEKeyword_4());
            		

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


    // $ANTLR start "entryRuleChecks"
    // InternalAdeptness.g:795:1: entryRuleChecks returns [EObject current=null] : iv_ruleChecks= ruleChecks EOF ;
    public final EObject entryRuleChecks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChecks = null;


        try {
            // InternalAdeptness.g:795:47: (iv_ruleChecks= ruleChecks EOF )
            // InternalAdeptness.g:796:2: iv_ruleChecks= ruleChecks EOF
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
    // InternalAdeptness.g:802:1: ruleChecks returns [EObject current=null] : (otherlv_0= 'checks:' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_reference_2_0= ruleReference ) ) ( (lv_failReason_3_0= ruleFailReason ) )+ ( (lv_description_4_0= ruleDescription ) ) ) ;
    public final EObject ruleChecks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_reference_2_0 = null;

        EObject lv_failReason_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:808:2: ( (otherlv_0= 'checks:' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_reference_2_0= ruleReference ) ) ( (lv_failReason_3_0= ruleFailReason ) )+ ( (lv_description_4_0= ruleDescription ) ) ) )
            // InternalAdeptness.g:809:2: (otherlv_0= 'checks:' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_reference_2_0= ruleReference ) ) ( (lv_failReason_3_0= ruleFailReason ) )+ ( (lv_description_4_0= ruleDescription ) ) )
            {
            // InternalAdeptness.g:809:2: (otherlv_0= 'checks:' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_reference_2_0= ruleReference ) ) ( (lv_failReason_3_0= ruleFailReason ) )+ ( (lv_description_4_0= ruleDescription ) ) )
            // InternalAdeptness.g:810:3: otherlv_0= 'checks:' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_reference_2_0= ruleReference ) ) ( (lv_failReason_3_0= ruleFailReason ) )+ ( (lv_description_4_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getChecksAccess().getChecksKeyword_0());
            		
            // InternalAdeptness.g:814:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAdeptness.g:815:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAdeptness.g:815:4: (lv_name_1_0= RULE_STRING )
            // InternalAdeptness.g:816:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getChecksAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChecksRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalAdeptness.g:832:3: ( (lv_reference_2_0= ruleReference ) )
            // InternalAdeptness.g:833:4: (lv_reference_2_0= ruleReference )
            {
            // InternalAdeptness.g:833:4: (lv_reference_2_0= ruleReference )
            // InternalAdeptness.g:834:5: lv_reference_2_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getChecksAccess().getReferenceReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_reference_2_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChecksRule());
            					}
            					set(
            						current,
            						"reference",
            						lv_reference_2_0,
            						"org.xtext.example.mydsl.Adeptness.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdeptness.g:851:3: ( (lv_failReason_3_0= ruleFailReason ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAdeptness.g:852:4: (lv_failReason_3_0= ruleFailReason )
            	    {
            	    // InternalAdeptness.g:852:4: (lv_failReason_3_0= ruleFailReason )
            	    // InternalAdeptness.g:853:5: lv_failReason_3_0= ruleFailReason
            	    {

            	    					newCompositeNode(grammarAccess.getChecksAccess().getFailReasonFailReasonParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_failReason_3_0=ruleFailReason();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChecksRule());
            	    					}
            	    					add(
            	    						current,
            	    						"failReason",
            	    						lv_failReason_3_0,
            	    						"org.xtext.example.mydsl.Adeptness.FailReason");
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

            // InternalAdeptness.g:870:3: ( (lv_description_4_0= ruleDescription ) )
            // InternalAdeptness.g:871:4: (lv_description_4_0= ruleDescription )
            {
            // InternalAdeptness.g:871:4: (lv_description_4_0= ruleDescription )
            // InternalAdeptness.g:872:5: lv_description_4_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getChecksAccess().getDescriptionDescriptionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_description_4_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChecksRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_4_0,
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
    // InternalAdeptness.g:893:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalAdeptness.g:893:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalAdeptness.g:894:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalAdeptness.g:900:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalAdeptness.g:906:2: ( (otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalAdeptness.g:907:2: (otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalAdeptness.g:907:2: (otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalAdeptness.g:908:3: otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            // InternalAdeptness.g:912:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalAdeptness.g:913:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalAdeptness.g:913:4: (lv_value_1_0= RULE_STRING )
            // InternalAdeptness.g:914:5: lv_value_1_0= RULE_STRING
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
    // InternalAdeptness.g:934:1: entryRuleFailReason returns [EObject current=null] : iv_ruleFailReason= ruleFailReason EOF ;
    public final EObject entryRuleFailReason() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFailReason = null;


        try {
            // InternalAdeptness.g:934:51: (iv_ruleFailReason= ruleFailReason EOF )
            // InternalAdeptness.g:935:2: iv_ruleFailReason= ruleFailReason EOF
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
    // InternalAdeptness.g:941:1: ruleFailReason returns [EObject current=null] : (otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) ) ) ;
    public final EObject ruleFailReason() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_reason_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:947:2: ( (otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) ) ) )
            // InternalAdeptness.g:948:2: (otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) ) )
            {
            // InternalAdeptness.g:948:2: (otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) ) )
            // InternalAdeptness.g:949:3: otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getFailReasonAccess().getFailsIfKeyword_0());
            		
            // InternalAdeptness.g:953:3: ( (lv_reason_1_0= ruleReason ) )
            // InternalAdeptness.g:954:4: (lv_reason_1_0= ruleReason )
            {
            // InternalAdeptness.g:954:4: (lv_reason_1_0= ruleReason )
            // InternalAdeptness.g:955:5: lv_reason_1_0= ruleReason
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
    // InternalAdeptness.g:976:1: entryRuleReason returns [EObject current=null] : iv_ruleReason= ruleReason EOF ;
    public final EObject entryRuleReason() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReason = null;


        try {
            // InternalAdeptness.g:976:47: (iv_ruleReason= ruleReason EOF )
            // InternalAdeptness.g:977:2: iv_ruleReason= ruleReason EOF
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
    // InternalAdeptness.g:983:1: ruleReason returns [EObject current=null] : ( ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleReason() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_highPeak_0_0 = null;

        EObject lv_highTime_1_0 = null;

        EObject lv_constDeg_2_0 = null;

        EObject lv_xPeaks_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:989:2: ( ( ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';' ) )
            // InternalAdeptness.g:990:2: ( ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';' )
            {
            // InternalAdeptness.g:990:2: ( ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';' )
            // InternalAdeptness.g:991:3: ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';'
            {
            // InternalAdeptness.g:991:3: ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) )
            int alt12=4;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalAdeptness.g:992:4: ( (lv_highPeak_0_0= ruleHighPeak ) )
                    {
                    // InternalAdeptness.g:992:4: ( (lv_highPeak_0_0= ruleHighPeak ) )
                    // InternalAdeptness.g:993:5: (lv_highPeak_0_0= ruleHighPeak )
                    {
                    // InternalAdeptness.g:993:5: (lv_highPeak_0_0= ruleHighPeak )
                    // InternalAdeptness.g:994:6: lv_highPeak_0_0= ruleHighPeak
                    {

                    						newCompositeNode(grammarAccess.getReasonAccess().getHighPeakHighPeakParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_26);
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
                    // InternalAdeptness.g:1012:4: ( (lv_highTime_1_0= ruleHighTime ) )
                    {
                    // InternalAdeptness.g:1012:4: ( (lv_highTime_1_0= ruleHighTime ) )
                    // InternalAdeptness.g:1013:5: (lv_highTime_1_0= ruleHighTime )
                    {
                    // InternalAdeptness.g:1013:5: (lv_highTime_1_0= ruleHighTime )
                    // InternalAdeptness.g:1014:6: lv_highTime_1_0= ruleHighTime
                    {

                    						newCompositeNode(grammarAccess.getReasonAccess().getHighTimeHighTimeParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_26);
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
                    // InternalAdeptness.g:1032:4: ( (lv_constDeg_2_0= ruleConstDeg ) )
                    {
                    // InternalAdeptness.g:1032:4: ( (lv_constDeg_2_0= ruleConstDeg ) )
                    // InternalAdeptness.g:1033:5: (lv_constDeg_2_0= ruleConstDeg )
                    {
                    // InternalAdeptness.g:1033:5: (lv_constDeg_2_0= ruleConstDeg )
                    // InternalAdeptness.g:1034:6: lv_constDeg_2_0= ruleConstDeg
                    {

                    						newCompositeNode(grammarAccess.getReasonAccess().getConstDegConstDegParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_26);
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
                    // InternalAdeptness.g:1052:4: ( (lv_xPeaks_3_0= ruleXPeaks ) )
                    {
                    // InternalAdeptness.g:1052:4: ( (lv_xPeaks_3_0= ruleXPeaks ) )
                    // InternalAdeptness.g:1053:5: (lv_xPeaks_3_0= ruleXPeaks )
                    {
                    // InternalAdeptness.g:1053:5: (lv_xPeaks_3_0= ruleXPeaks )
                    // InternalAdeptness.g:1054:6: lv_xPeaks_3_0= ruleXPeaks
                    {

                    						newCompositeNode(grammarAccess.getReasonAccess().getXPeaksXPeaksParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_26);
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

            otherlv_4=(Token)match(input,32,FOLLOW_2); 

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
    // InternalAdeptness.g:1080:1: entryRuleXPeaks returns [EObject current=null] : iv_ruleXPeaks= ruleXPeaks EOF ;
    public final EObject entryRuleXPeaks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPeaks = null;


        try {
            // InternalAdeptness.g:1080:47: (iv_ruleXPeaks= ruleXPeaks EOF )
            // InternalAdeptness.g:1081:2: iv_ruleXPeaks= ruleXPeaks EOF
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
    // InternalAdeptness.g:1087:1: ruleXPeaks returns [EObject current=null] : (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTimeType ) ) ) ;
    public final EObject ruleXPeaks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_time_5_0=null;
        EObject lv_cant_1_0 = null;

        EObject lv_nPeaks_3_0 = null;

        EObject lv_unit_6_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1093:2: ( (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTimeType ) ) ) )
            // InternalAdeptness.g:1094:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTimeType ) ) )
            {
            // InternalAdeptness.g:1094:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTimeType ) ) )
            // InternalAdeptness.g:1095:3: otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTimeType ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getXPeaksAccess().getConfidenceIsBelowKeyword_0());
            		
            // InternalAdeptness.g:1099:3: ( (lv_cant_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1100:4: (lv_cant_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1100:4: (lv_cant_1_0= ruleDOUBLE )
            // InternalAdeptness.g:1101:5: lv_cant_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getXPeaksAccess().getCantDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_2=(Token)match(input,34,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getXPeaksAccess().getMoreThanKeyword_2());
            		
            // InternalAdeptness.g:1122:3: ( (lv_nPeaks_3_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1123:4: (lv_nPeaks_3_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1123:4: (lv_nPeaks_3_0= ruleDOUBLE )
            // InternalAdeptness.g:1124:5: lv_nPeaks_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getXPeaksAccess().getNPeaksDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_4=(Token)match(input,35,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getXPeaksAccess().getTimesWithinKeyword_4());
            		
            // InternalAdeptness.g:1145:3: ( (lv_time_5_0= RULE_INT ) )
            // InternalAdeptness.g:1146:4: (lv_time_5_0= RULE_INT )
            {
            // InternalAdeptness.g:1146:4: (lv_time_5_0= RULE_INT )
            // InternalAdeptness.g:1147:5: lv_time_5_0= RULE_INT
            {
            lv_time_5_0=(Token)match(input,RULE_INT,FOLLOW_30); 

            					newLeafNode(lv_time_5_0, grammarAccess.getXPeaksAccess().getTimeINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getXPeaksRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time",
            						lv_time_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalAdeptness.g:1163:3: ( (lv_unit_6_0= ruleTimeType ) )
            // InternalAdeptness.g:1164:4: (lv_unit_6_0= ruleTimeType )
            {
            // InternalAdeptness.g:1164:4: (lv_unit_6_0= ruleTimeType )
            // InternalAdeptness.g:1165:5: lv_unit_6_0= ruleTimeType
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
    // InternalAdeptness.g:1186:1: entryRuleConstDeg returns [EObject current=null] : iv_ruleConstDeg= ruleConstDeg EOF ;
    public final EObject entryRuleConstDeg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstDeg = null;


        try {
            // InternalAdeptness.g:1186:49: (iv_ruleConstDeg= ruleConstDeg EOF )
            // InternalAdeptness.g:1187:2: iv_ruleConstDeg= ruleConstDeg EOF
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
    // InternalAdeptness.g:1193:1: ruleConstDeg returns [EObject current=null] : (otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleConstDeg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cant_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1199:2: ( (otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) ) ) )
            // InternalAdeptness.g:1200:2: (otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) ) )
            {
            // InternalAdeptness.g:1200:2: (otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) ) )
            // InternalAdeptness.g:1201:3: otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getConstDegAccess().getConfidenceIsInConstantDegradationKeyword_0());
            		
            // InternalAdeptness.g:1205:3: ( (lv_cant_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1206:4: (lv_cant_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1206:4: (lv_cant_1_0= ruleDOUBLE )
            // InternalAdeptness.g:1207:5: lv_cant_1_0= ruleDOUBLE
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
    // InternalAdeptness.g:1228:1: entryRuleHighTime returns [EObject current=null] : iv_ruleHighTime= ruleHighTime EOF ;
    public final EObject entryRuleHighTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighTime = null;


        try {
            // InternalAdeptness.g:1228:49: (iv_ruleHighTime= ruleHighTime EOF )
            // InternalAdeptness.g:1229:2: iv_ruleHighTime= ruleHighTime EOF
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
    // InternalAdeptness.g:1235:1: ruleHighTime returns [EObject current=null] : (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) ) ) ;
    public final EObject ruleHighTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_cant_1_0 = null;

        EObject lv_time_3_0 = null;

        EObject lv_unit_4_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1241:2: ( (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) ) ) )
            // InternalAdeptness.g:1242:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) ) )
            {
            // InternalAdeptness.g:1242:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) ) )
            // InternalAdeptness.g:1243:3: otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getHighTimeAccess().getConfidenceIsBelowKeyword_0());
            		
            // InternalAdeptness.g:1247:3: ( (lv_cant_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1248:4: (lv_cant_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1248:4: (lv_cant_1_0= ruleDOUBLE )
            // InternalAdeptness.g:1249:5: lv_cant_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getHighTimeAccess().getCantDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_2=(Token)match(input,37,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getHighTimeAccess().getWithinKeyword_2());
            		
            // InternalAdeptness.g:1270:3: ( (lv_time_3_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1271:4: (lv_time_3_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1271:4: (lv_time_3_0= ruleDOUBLE )
            // InternalAdeptness.g:1272:5: lv_time_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getHighTimeAccess().getTimeDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalAdeptness.g:1289:3: ( (lv_unit_4_0= ruleTimeType ) )
            // InternalAdeptness.g:1290:4: (lv_unit_4_0= ruleTimeType )
            {
            // InternalAdeptness.g:1290:4: (lv_unit_4_0= ruleTimeType )
            // InternalAdeptness.g:1291:5: lv_unit_4_0= ruleTimeType
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
    // InternalAdeptness.g:1312:1: entryRuleHighPeak returns [EObject current=null] : iv_ruleHighPeak= ruleHighPeak EOF ;
    public final EObject entryRuleHighPeak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighPeak = null;


        try {
            // InternalAdeptness.g:1312:49: (iv_ruleHighPeak= ruleHighPeak EOF )
            // InternalAdeptness.g:1313:2: iv_ruleHighPeak= ruleHighPeak EOF
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
    // InternalAdeptness.g:1319:1: ruleHighPeak returns [EObject current=null] : (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleHighPeak() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cant_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1325:2: ( (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) ) )
            // InternalAdeptness.g:1326:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) )
            {
            // InternalAdeptness.g:1326:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) )
            // InternalAdeptness.g:1327:3: otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getHighPeakAccess().getConfidenceIsBelowKeyword_0());
            		
            // InternalAdeptness.g:1331:3: ( (lv_cant_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1332:4: (lv_cant_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1332:4: (lv_cant_1_0= ruleDOUBLE )
            // InternalAdeptness.g:1333:5: lv_cant_1_0= ruleDOUBLE
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
    // InternalAdeptness.g:1354:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalAdeptness.g:1354:50: (iv_ruleReference= ruleReference EOF )
            // InternalAdeptness.g:1355:2: iv_ruleReference= ruleReference EOF
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
    // InternalAdeptness.g:1361:1: ruleReference returns [EObject current=null] : ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_upper_0_0 = null;

        EObject lv_lower_1_0 = null;

        EObject lv_range_2_0 = null;

        EObject lv_gap_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1367:2: ( ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) ) otherlv_4= ';' ) )
            // InternalAdeptness.g:1368:2: ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) ) otherlv_4= ';' )
            {
            // InternalAdeptness.g:1368:2: ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) ) otherlv_4= ';' )
            // InternalAdeptness.g:1369:3: ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) ) otherlv_4= ';'
            {
            // InternalAdeptness.g:1369:3: ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt13=1;
                }
                break;
            case 39:
                {
                alt13=2;
                }
                break;
            case 40:
                {
                alt13=3;
                }
                break;
            case 42:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalAdeptness.g:1370:4: ( (lv_upper_0_0= ruleUpper ) )
                    {
                    // InternalAdeptness.g:1370:4: ( (lv_upper_0_0= ruleUpper ) )
                    // InternalAdeptness.g:1371:5: (lv_upper_0_0= ruleUpper )
                    {
                    // InternalAdeptness.g:1371:5: (lv_upper_0_0= ruleUpper )
                    // InternalAdeptness.g:1372:6: lv_upper_0_0= ruleUpper
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getUpperUpperParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_26);
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
                    // InternalAdeptness.g:1390:4: ( (lv_lower_1_0= ruleLower ) )
                    {
                    // InternalAdeptness.g:1390:4: ( (lv_lower_1_0= ruleLower ) )
                    // InternalAdeptness.g:1391:5: (lv_lower_1_0= ruleLower )
                    {
                    // InternalAdeptness.g:1391:5: (lv_lower_1_0= ruleLower )
                    // InternalAdeptness.g:1392:6: lv_lower_1_0= ruleLower
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getLowerLowerParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_26);
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
                    // InternalAdeptness.g:1410:4: ( (lv_range_2_0= ruleRange ) )
                    {
                    // InternalAdeptness.g:1410:4: ( (lv_range_2_0= ruleRange ) )
                    // InternalAdeptness.g:1411:5: (lv_range_2_0= ruleRange )
                    {
                    // InternalAdeptness.g:1411:5: (lv_range_2_0= ruleRange )
                    // InternalAdeptness.g:1412:6: lv_range_2_0= ruleRange
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getRangeRangeParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_26);
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
                    // InternalAdeptness.g:1430:4: ( (lv_gap_3_0= ruleGap ) )
                    {
                    // InternalAdeptness.g:1430:4: ( (lv_gap_3_0= ruleGap ) )
                    // InternalAdeptness.g:1431:5: (lv_gap_3_0= ruleGap )
                    {
                    // InternalAdeptness.g:1431:5: (lv_gap_3_0= ruleGap )
                    // InternalAdeptness.g:1432:6: lv_gap_3_0= ruleGap
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getGapGapParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_26);
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

            otherlv_4=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReferenceAccess().getSemicolonKeyword_1());
            		

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
    // InternalAdeptness.g:1458:1: entryRuleUpper returns [EObject current=null] : iv_ruleUpper= ruleUpper EOF ;
    public final EObject entryRuleUpper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpper = null;


        try {
            // InternalAdeptness.g:1458:46: (iv_ruleUpper= ruleUpper EOF )
            // InternalAdeptness.g:1459:2: iv_ruleUpper= ruleUpper EOF
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
    // InternalAdeptness.g:1465:1: ruleUpper returns [EObject current=null] : (otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) ) ) ;
    public final EObject ruleUpper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bound_upp_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1471:2: ( (otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) ) ) )
            // InternalAdeptness.g:1472:2: (otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) ) )
            {
            // InternalAdeptness.g:1472:2: (otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) ) )
            // InternalAdeptness.g:1473:3: otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getUpperAccess().getIsBelowKeyword_0());
            		
            // InternalAdeptness.g:1477:3: ( (lv_bound_upp_1_0= ruleBound_up ) )
            // InternalAdeptness.g:1478:4: (lv_bound_upp_1_0= ruleBound_up )
            {
            // InternalAdeptness.g:1478:4: (lv_bound_upp_1_0= ruleBound_up )
            // InternalAdeptness.g:1479:5: lv_bound_upp_1_0= ruleBound_up
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
    // InternalAdeptness.g:1500:1: entryRuleLower returns [EObject current=null] : iv_ruleLower= ruleLower EOF ;
    public final EObject entryRuleLower() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLower = null;


        try {
            // InternalAdeptness.g:1500:46: (iv_ruleLower= ruleLower EOF )
            // InternalAdeptness.g:1501:2: iv_ruleLower= ruleLower EOF
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
    // InternalAdeptness.g:1507:1: ruleLower returns [EObject current=null] : (otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) ) ) ;
    public final EObject ruleLower() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bound_lower_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1513:2: ( (otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) ) ) )
            // InternalAdeptness.g:1514:2: (otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) ) )
            {
            // InternalAdeptness.g:1514:2: (otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) ) )
            // InternalAdeptness.g:1515:3: otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getLowerAccess().getIsAboveKeyword_0());
            		
            // InternalAdeptness.g:1519:3: ( (lv_bound_lower_1_0= ruleBound_Down ) )
            // InternalAdeptness.g:1520:4: (lv_bound_lower_1_0= ruleBound_Down )
            {
            // InternalAdeptness.g:1520:4: (lv_bound_lower_1_0= ruleBound_Down )
            // InternalAdeptness.g:1521:5: lv_bound_lower_1_0= ruleBound_Down
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
    // InternalAdeptness.g:1542:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalAdeptness.g:1542:46: (iv_ruleRange= ruleRange EOF )
            // InternalAdeptness.g:1543:2: iv_ruleRange= ruleRange EOF
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
    // InternalAdeptness.g:1549:1: ruleRange returns [EObject current=null] : (otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_bound_lower_1_0 = null;

        EObject lv_bound_upp_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1555:2: ( (otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ) )
            // InternalAdeptness.g:1556:2: (otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) )
            {
            // InternalAdeptness.g:1556:2: (otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) )
            // InternalAdeptness.g:1557:3: otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getIsInRangeBetweenKeyword_0());
            		
            // InternalAdeptness.g:1561:3: ( (lv_bound_lower_1_0= ruleBound_Down ) )
            // InternalAdeptness.g:1562:4: (lv_bound_lower_1_0= ruleBound_Down )
            {
            // InternalAdeptness.g:1562:4: (lv_bound_lower_1_0= ruleBound_Down )
            // InternalAdeptness.g:1563:5: lv_bound_lower_1_0= ruleBound_Down
            {

            					newCompositeNode(grammarAccess.getRangeAccess().getBound_lowerBound_DownParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
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

            otherlv_2=(Token)match(input,41,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getAndKeyword_2());
            		
            // InternalAdeptness.g:1584:3: ( (lv_bound_upp_3_0= ruleBound_up ) )
            // InternalAdeptness.g:1585:4: (lv_bound_upp_3_0= ruleBound_up )
            {
            // InternalAdeptness.g:1585:4: (lv_bound_upp_3_0= ruleBound_up )
            // InternalAdeptness.g:1586:5: lv_bound_upp_3_0= ruleBound_up
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
    // InternalAdeptness.g:1607:1: entryRuleGap returns [EObject current=null] : iv_ruleGap= ruleGap EOF ;
    public final EObject entryRuleGap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGap = null;


        try {
            // InternalAdeptness.g:1607:44: (iv_ruleGap= ruleGap EOF )
            // InternalAdeptness.g:1608:2: iv_ruleGap= ruleGap EOF
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
    // InternalAdeptness.g:1614:1: ruleGap returns [EObject current=null] : (otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ) ;
    public final EObject ruleGap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_bound_lower_1_0 = null;

        EObject lv_bound_upp_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1620:2: ( (otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ) )
            // InternalAdeptness.g:1621:2: (otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) )
            {
            // InternalAdeptness.g:1621:2: (otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) )
            // InternalAdeptness.g:1622:3: otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getGapAccess().getNotInRangeBetweenKeyword_0());
            		
            // InternalAdeptness.g:1626:3: ( (lv_bound_lower_1_0= ruleBound_Down ) )
            // InternalAdeptness.g:1627:4: (lv_bound_lower_1_0= ruleBound_Down )
            {
            // InternalAdeptness.g:1627:4: (lv_bound_lower_1_0= ruleBound_Down )
            // InternalAdeptness.g:1628:5: lv_bound_lower_1_0= ruleBound_Down
            {

            					newCompositeNode(grammarAccess.getGapAccess().getBound_lowerBound_DownParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
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

            otherlv_2=(Token)match(input,41,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getGapAccess().getAndKeyword_2());
            		
            // InternalAdeptness.g:1649:3: ( (lv_bound_upp_3_0= ruleBound_up ) )
            // InternalAdeptness.g:1650:4: (lv_bound_upp_3_0= ruleBound_up )
            {
            // InternalAdeptness.g:1650:4: (lv_bound_upp_3_0= ruleBound_up )
            // InternalAdeptness.g:1651:5: lv_bound_upp_3_0= ruleBound_up
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
    // InternalAdeptness.g:1672:1: entryRuleBound_up returns [EObject current=null] : iv_ruleBound_up= ruleBound_up EOF ;
    public final EObject entryRuleBound_up() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBound_up = null;


        try {
            // InternalAdeptness.g:1672:49: (iv_ruleBound_up= ruleBound_up EOF )
            // InternalAdeptness.g:1673:2: iv_ruleBound_up= ruleBound_up EOF
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
    // InternalAdeptness.g:1679:1: ruleBound_up returns [EObject current=null] : ( (lv_value_0_0= ruleDOUBLE ) ) ;
    public final EObject ruleBound_up() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1685:2: ( ( (lv_value_0_0= ruleDOUBLE ) ) )
            // InternalAdeptness.g:1686:2: ( (lv_value_0_0= ruleDOUBLE ) )
            {
            // InternalAdeptness.g:1686:2: ( (lv_value_0_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1687:3: (lv_value_0_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1687:3: (lv_value_0_0= ruleDOUBLE )
            // InternalAdeptness.g:1688:4: lv_value_0_0= ruleDOUBLE
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
    // InternalAdeptness.g:1708:1: entryRuleBound_Down returns [EObject current=null] : iv_ruleBound_Down= ruleBound_Down EOF ;
    public final EObject entryRuleBound_Down() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBound_Down = null;


        try {
            // InternalAdeptness.g:1708:51: (iv_ruleBound_Down= ruleBound_Down EOF )
            // InternalAdeptness.g:1709:2: iv_ruleBound_Down= ruleBound_Down EOF
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
    // InternalAdeptness.g:1715:1: ruleBound_Down returns [EObject current=null] : ( (lv_value_0_0= ruleDOUBLE ) ) ;
    public final EObject ruleBound_Down() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1721:2: ( ( (lv_value_0_0= ruleDOUBLE ) ) )
            // InternalAdeptness.g:1722:2: ( (lv_value_0_0= ruleDOUBLE ) )
            {
            // InternalAdeptness.g:1722:2: ( (lv_value_0_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1723:3: (lv_value_0_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1723:3: (lv_value_0_0= ruleDOUBLE )
            // InternalAdeptness.g:1724:4: lv_value_0_0= ruleDOUBLE
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
    // InternalAdeptness.g:1744:1: entryRuleBOOLEAN returns [EObject current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final EObject entryRuleBOOLEAN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOOLEAN = null;


        try {
            // InternalAdeptness.g:1744:48: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalAdeptness.g:1745:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
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
    // InternalAdeptness.g:1751:1: ruleBOOLEAN returns [EObject current=null] : ( (lv_bool_0_0= ruleb ) ) ;
    public final EObject ruleBOOLEAN() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_bool_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1757:2: ( ( (lv_bool_0_0= ruleb ) ) )
            // InternalAdeptness.g:1758:2: ( (lv_bool_0_0= ruleb ) )
            {
            // InternalAdeptness.g:1758:2: ( (lv_bool_0_0= ruleb ) )
            // InternalAdeptness.g:1759:3: (lv_bool_0_0= ruleb )
            {
            // InternalAdeptness.g:1759:3: (lv_bool_0_0= ruleb )
            // InternalAdeptness.g:1760:4: lv_bool_0_0= ruleb
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
    // InternalAdeptness.g:1780:1: entryRuleb returns [String current=null] : iv_ruleb= ruleb EOF ;
    public final String entryRuleb() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleb = null;


        try {
            // InternalAdeptness.g:1780:41: (iv_ruleb= ruleb EOF )
            // InternalAdeptness.g:1781:2: iv_ruleb= ruleb EOF
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
    // InternalAdeptness.g:1787:1: ruleb returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleb() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdeptness.g:1793:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalAdeptness.g:1794:2: (kw= 'true' | kw= 'false' )
            {
            // InternalAdeptness.g:1794:2: (kw= 'true' | kw= 'false' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                alt14=1;
            }
            else if ( (LA14_0==44) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAdeptness.g:1795:3: kw= 'true'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1801:3: kw= 'false'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

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
    // InternalAdeptness.g:1810:1: entryRuleDOUBLE returns [EObject current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final EObject entryRuleDOUBLE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOUBLE = null;


        try {
            // InternalAdeptness.g:1810:47: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalAdeptness.g:1811:2: iv_ruleDOUBLE= ruleDOUBLE EOF
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
    // InternalAdeptness.g:1817:1: ruleDOUBLE returns [EObject current=null] : ( (lv_dVal_0_0= ruled ) ) ;
    public final EObject ruleDOUBLE() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_dVal_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1823:2: ( ( (lv_dVal_0_0= ruled ) ) )
            // InternalAdeptness.g:1824:2: ( (lv_dVal_0_0= ruled ) )
            {
            // InternalAdeptness.g:1824:2: ( (lv_dVal_0_0= ruled ) )
            // InternalAdeptness.g:1825:3: (lv_dVal_0_0= ruled )
            {
            // InternalAdeptness.g:1825:3: (lv_dVal_0_0= ruled )
            // InternalAdeptness.g:1826:4: lv_dVal_0_0= ruled
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
    // InternalAdeptness.g:1846:1: entryRuled returns [String current=null] : iv_ruled= ruled EOF ;
    public final String entryRuled() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruled = null;


        try {
            // InternalAdeptness.g:1846:41: (iv_ruled= ruled EOF )
            // InternalAdeptness.g:1847:2: iv_ruled= ruled EOF
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
    // InternalAdeptness.g:1853:1: ruled returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruled() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalAdeptness.g:1859:2: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // InternalAdeptness.g:1860:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // InternalAdeptness.g:1860:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // InternalAdeptness.g:1861:3: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // InternalAdeptness.g:1861:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==45) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAdeptness.g:1862:4: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_29); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_6); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getDAccess().getINTTerminalRuleCall_1());
            		
            // InternalAdeptness.g:1875:3: (kw= '.' this_INT_3= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==13) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAdeptness.g:1876:4: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,13,FOLLOW_29); 

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
    // InternalAdeptness.g:1893:1: entryRuleTimeType returns [EObject current=null] : iv_ruleTimeType= ruleTimeType EOF ;
    public final EObject entryRuleTimeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeType = null;


        try {
            // InternalAdeptness.g:1893:49: (iv_ruleTimeType= ruleTimeType EOF )
            // InternalAdeptness.g:1894:2: iv_ruleTimeType= ruleTimeType EOF
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
    // InternalAdeptness.g:1900:1: ruleTimeType returns [EObject current=null] : ( ( (lv_time_0_0= 'miliseconds' ) ) | ( (lv_time_1_0= 'seconds' ) ) | ( (lv_time_2_0= 'minutes' ) ) | ( (lv_time_3_0= 'hours' ) ) ) ;
    public final EObject ruleTimeType() throws RecognitionException {
        EObject current = null;

        Token lv_time_0_0=null;
        Token lv_time_1_0=null;
        Token lv_time_2_0=null;
        Token lv_time_3_0=null;


        	enterRule();

        try {
            // InternalAdeptness.g:1906:2: ( ( ( (lv_time_0_0= 'miliseconds' ) ) | ( (lv_time_1_0= 'seconds' ) ) | ( (lv_time_2_0= 'minutes' ) ) | ( (lv_time_3_0= 'hours' ) ) ) )
            // InternalAdeptness.g:1907:2: ( ( (lv_time_0_0= 'miliseconds' ) ) | ( (lv_time_1_0= 'seconds' ) ) | ( (lv_time_2_0= 'minutes' ) ) | ( (lv_time_3_0= 'hours' ) ) )
            {
            // InternalAdeptness.g:1907:2: ( ( (lv_time_0_0= 'miliseconds' ) ) | ( (lv_time_1_0= 'seconds' ) ) | ( (lv_time_2_0= 'minutes' ) ) | ( (lv_time_3_0= 'hours' ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt17=1;
                }
                break;
            case 47:
                {
                alt17=2;
                }
                break;
            case 48:
                {
                alt17=3;
                }
                break;
            case 49:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalAdeptness.g:1908:3: ( (lv_time_0_0= 'miliseconds' ) )
                    {
                    // InternalAdeptness.g:1908:3: ( (lv_time_0_0= 'miliseconds' ) )
                    // InternalAdeptness.g:1909:4: (lv_time_0_0= 'miliseconds' )
                    {
                    // InternalAdeptness.g:1909:4: (lv_time_0_0= 'miliseconds' )
                    // InternalAdeptness.g:1910:5: lv_time_0_0= 'miliseconds'
                    {
                    lv_time_0_0=(Token)match(input,46,FOLLOW_2); 

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
                    // InternalAdeptness.g:1923:3: ( (lv_time_1_0= 'seconds' ) )
                    {
                    // InternalAdeptness.g:1923:3: ( (lv_time_1_0= 'seconds' ) )
                    // InternalAdeptness.g:1924:4: (lv_time_1_0= 'seconds' )
                    {
                    // InternalAdeptness.g:1924:4: (lv_time_1_0= 'seconds' )
                    // InternalAdeptness.g:1925:5: lv_time_1_0= 'seconds'
                    {
                    lv_time_1_0=(Token)match(input,47,FOLLOW_2); 

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
                    // InternalAdeptness.g:1938:3: ( (lv_time_2_0= 'minutes' ) )
                    {
                    // InternalAdeptness.g:1938:3: ( (lv_time_2_0= 'minutes' ) )
                    // InternalAdeptness.g:1939:4: (lv_time_2_0= 'minutes' )
                    {
                    // InternalAdeptness.g:1939:4: (lv_time_2_0= 'minutes' )
                    // InternalAdeptness.g:1940:5: lv_time_2_0= 'minutes'
                    {
                    lv_time_2_0=(Token)match(input,48,FOLLOW_2); 

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
                    // InternalAdeptness.g:1953:3: ( (lv_time_3_0= 'hours' ) )
                    {
                    // InternalAdeptness.g:1953:3: ( (lv_time_3_0= 'hours' ) )
                    // InternalAdeptness.g:1954:4: (lv_time_3_0= 'hours' )
                    {
                    // InternalAdeptness.g:1954:4: (lv_time_3_0= 'hours' )
                    // InternalAdeptness.g:1955:5: lv_time_3_0= 'hours'
                    {
                    lv_time_3_0=(Token)match(input,49,FOLLOW_2); 

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
    // InternalAdeptness.g:1971:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalAdeptness.g:1971:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalAdeptness.g:1972:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalAdeptness.g:1978:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAdeptness.g:1984:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAdeptness.g:1985:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAdeptness.g:1985:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAdeptness.g:1986:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalAdeptness.g:1990:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:1991:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:1991:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:1992:5: lv_name_1_0= RULE_ID
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
    // InternalAdeptness.g:2012:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalAdeptness.g:2012:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalAdeptness.g:2013:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
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
    // InternalAdeptness.g:2019:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:2025:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // InternalAdeptness.g:2026:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // InternalAdeptness.g:2026:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // InternalAdeptness.g:2027:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
            		
            // InternalAdeptness.g:2031:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAdeptness.g:2032:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAdeptness.g:2032:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAdeptness.g:2033:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
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

            otherlv_2=(Token)match(input,52,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAdeptness.g:2054:3: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==11||LA18_0==14||(LA18_0>=50 && LA18_0<=51)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAdeptness.g:2055:4: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // InternalAdeptness.g:2055:4: (lv_elements_3_0= ruleAbstractElement )
            	    // InternalAdeptness.g:2056:5: lv_elements_3_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_34);
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
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,53,FOLLOW_2); 

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


    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\41\1\6\1\uffff\1\6\1\15\1\6\3\uffff\1\40";
    static final String dfa_3s = "\1\44\1\55\1\uffff\1\6\1\45\1\6\3\uffff\1\45";
    static final String dfa_4s = "\2\uffff\1\3\3\uffff\1\1\1\4\1\2\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2",
            "\1\4\46\uffff\1\3",
            "",
            "\1\4",
            "\1\5\22\uffff\1\6\1\uffff\1\7\2\uffff\1\10",
            "\1\11",
            "",
            "",
            "",
            "\1\6\1\uffff\1\7\2\uffff\1\10"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "991:3: ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000C000000004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000005C000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x002C000000004800L});

}