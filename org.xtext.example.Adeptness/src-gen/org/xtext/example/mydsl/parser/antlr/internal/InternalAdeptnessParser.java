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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'MONITORINGPLAN'", "':'", "'ENDMONITORINGPLAN'", "'MONITORINGVARIABLE'", "'type'", "'max:'", "'min:'", "'boolean'", "'double'", "'int'", "'CPS'", "'ENDCPS'", "'ORACLE'", "'ENDORACLE'", "'checks:'", "'Description: '", "'fails if :'", "';'", "'confidence is below'", "'more than'", "'times within'", "'confidence is in constant degradation'", "'within'", "'is below'", "'is above'", "'is in range between'", "'and'", "'not in range between'", "'true'", "'false'", "'-'", "'miliseconds'", "'seconds'", "'minutes'", "'hours'", "'datatype'", "'package'", "'{'", "'}'"
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

                if ( (LA1_0==11||LA1_0==14||LA1_0==24||(LA1_0>=49 && LA1_0<=50)) ) {
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
            case 50:
                {
                alt2=1;
                }
                break;
            case 14:
            case 24:
            case 49:
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
            case 49:
                {
                alt5=1;
                }
                break;
            case 24:
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
    // InternalAdeptness.g:419:1: ruleMonitoringVariable returns [EObject current=null] : (otherlv_0= 'MONITORINGVARIABLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'type' otherlv_4= ':' ( (lv_MonitoringVariableDatatype_5_0= ruleSig_type ) ) (otherlv_6= 'max:' ( (lv_max_7_0= ruleDOUBLE ) ) otherlv_8= 'min:' ( (lv_min_9_0= ruleDOUBLE ) ) )? otherlv_10= 'MONITORINGVARIABLE' ) ;
    public final EObject ruleMonitoringVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_MonitoringVariableDatatype_5_0 = null;

        EObject lv_max_7_0 = null;

        EObject lv_min_9_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:425:2: ( (otherlv_0= 'MONITORINGVARIABLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'type' otherlv_4= ':' ( (lv_MonitoringVariableDatatype_5_0= ruleSig_type ) ) (otherlv_6= 'max:' ( (lv_max_7_0= ruleDOUBLE ) ) otherlv_8= 'min:' ( (lv_min_9_0= ruleDOUBLE ) ) )? otherlv_10= 'MONITORINGVARIABLE' ) )
            // InternalAdeptness.g:426:2: (otherlv_0= 'MONITORINGVARIABLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'type' otherlv_4= ':' ( (lv_MonitoringVariableDatatype_5_0= ruleSig_type ) ) (otherlv_6= 'max:' ( (lv_max_7_0= ruleDOUBLE ) ) otherlv_8= 'min:' ( (lv_min_9_0= ruleDOUBLE ) ) )? otherlv_10= 'MONITORINGVARIABLE' )
            {
            // InternalAdeptness.g:426:2: (otherlv_0= 'MONITORINGVARIABLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'type' otherlv_4= ':' ( (lv_MonitoringVariableDatatype_5_0= ruleSig_type ) ) (otherlv_6= 'max:' ( (lv_max_7_0= ruleDOUBLE ) ) otherlv_8= 'min:' ( (lv_min_9_0= ruleDOUBLE ) ) )? otherlv_10= 'MONITORINGVARIABLE' )
            // InternalAdeptness.g:427:3: otherlv_0= 'MONITORINGVARIABLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'type' otherlv_4= ':' ( (lv_MonitoringVariableDatatype_5_0= ruleSig_type ) ) (otherlv_6= 'max:' ( (lv_max_7_0= ruleDOUBLE ) ) otherlv_8= 'min:' ( (lv_min_9_0= ruleDOUBLE ) ) )? otherlv_10= 'MONITORINGVARIABLE'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMonitoringVariableAccess().getMONITORINGVARIABLEKeyword_0());
            		
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

            // InternalAdeptness.g:480:3: (otherlv_6= 'max:' ( (lv_max_7_0= ruleDOUBLE ) ) otherlv_8= 'min:' ( (lv_min_9_0= ruleDOUBLE ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAdeptness.g:481:4: otherlv_6= 'max:' ( (lv_max_7_0= ruleDOUBLE ) ) otherlv_8= 'min:' ( (lv_min_9_0= ruleDOUBLE ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getMonitoringVariableAccess().getMaxKeyword_6_0());
                    			
                    // InternalAdeptness.g:485:4: ( (lv_max_7_0= ruleDOUBLE ) )
                    // InternalAdeptness.g:486:5: (lv_max_7_0= ruleDOUBLE )
                    {
                    // InternalAdeptness.g:486:5: (lv_max_7_0= ruleDOUBLE )
                    // InternalAdeptness.g:487:6: lv_max_7_0= ruleDOUBLE
                    {

                    						newCompositeNode(grammarAccess.getMonitoringVariableAccess().getMaxDOUBLEParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_max_7_0=ruleDOUBLE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMonitoringVariableRule());
                    						}
                    						set(
                    							current,
                    							"max",
                    							lv_max_7_0,
                    							"org.xtext.example.mydsl.Adeptness.DOUBLE");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getMonitoringVariableAccess().getMinKeyword_6_2());
                    			
                    // InternalAdeptness.g:508:4: ( (lv_min_9_0= ruleDOUBLE ) )
                    // InternalAdeptness.g:509:5: (lv_min_9_0= ruleDOUBLE )
                    {
                    // InternalAdeptness.g:509:5: (lv_min_9_0= ruleDOUBLE )
                    // InternalAdeptness.g:510:6: lv_min_9_0= ruleDOUBLE
                    {

                    						newCompositeNode(grammarAccess.getMonitoringVariableAccess().getMinDOUBLEParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_min_9_0=ruleDOUBLE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMonitoringVariableRule());
                    						}
                    						set(
                    							current,
                    							"min",
                    							lv_min_9_0,
                    							"org.xtext.example.mydsl.Adeptness.DOUBLE");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getMonitoringVariableAccess().getMONITORINGVARIABLEKeyword_7());
            		

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
    // InternalAdeptness.g:536:1: entryRuleSig_type returns [EObject current=null] : iv_ruleSig_type= ruleSig_type EOF ;
    public final EObject entryRuleSig_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSig_type = null;


        try {
            // InternalAdeptness.g:536:49: (iv_ruleSig_type= ruleSig_type EOF )
            // InternalAdeptness.g:537:2: iv_ruleSig_type= ruleSig_type EOF
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
    // InternalAdeptness.g:543:1: ruleSig_type returns [EObject current=null] : ( ( (lv_sig_type_0_1= 'boolean' | lv_sig_type_0_2= 'double' | lv_sig_type_0_3= 'int' ) ) ) ;
    public final EObject ruleSig_type() throws RecognitionException {
        EObject current = null;

        Token lv_sig_type_0_1=null;
        Token lv_sig_type_0_2=null;
        Token lv_sig_type_0_3=null;


        	enterRule();

        try {
            // InternalAdeptness.g:549:2: ( ( ( (lv_sig_type_0_1= 'boolean' | lv_sig_type_0_2= 'double' | lv_sig_type_0_3= 'int' ) ) ) )
            // InternalAdeptness.g:550:2: ( ( (lv_sig_type_0_1= 'boolean' | lv_sig_type_0_2= 'double' | lv_sig_type_0_3= 'int' ) ) )
            {
            // InternalAdeptness.g:550:2: ( ( (lv_sig_type_0_1= 'boolean' | lv_sig_type_0_2= 'double' | lv_sig_type_0_3= 'int' ) ) )
            // InternalAdeptness.g:551:3: ( (lv_sig_type_0_1= 'boolean' | lv_sig_type_0_2= 'double' | lv_sig_type_0_3= 'int' ) )
            {
            // InternalAdeptness.g:551:3: ( (lv_sig_type_0_1= 'boolean' | lv_sig_type_0_2= 'double' | lv_sig_type_0_3= 'int' ) )
            // InternalAdeptness.g:552:4: (lv_sig_type_0_1= 'boolean' | lv_sig_type_0_2= 'double' | lv_sig_type_0_3= 'int' )
            {
            // InternalAdeptness.g:552:4: (lv_sig_type_0_1= 'boolean' | lv_sig_type_0_2= 'double' | lv_sig_type_0_3= 'int' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
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
                    // InternalAdeptness.g:553:5: lv_sig_type_0_1= 'boolean'
                    {
                    lv_sig_type_0_1=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_sig_type_0_1, grammarAccess.getSig_typeAccess().getSig_typeBooleanKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSig_typeRule());
                    					}
                    					setWithLastConsumed(current, "sig_type", lv_sig_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:564:5: lv_sig_type_0_2= 'double'
                    {
                    lv_sig_type_0_2=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_sig_type_0_2, grammarAccess.getSig_typeAccess().getSig_typeDoubleKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSig_typeRule());
                    					}
                    					setWithLastConsumed(current, "sig_type", lv_sig_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalAdeptness.g:575:5: lv_sig_type_0_3= 'int'
                    {
                    lv_sig_type_0_3=(Token)match(input,23,FOLLOW_2); 

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
    // InternalAdeptness.g:591:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // InternalAdeptness.g:591:47: (iv_ruleSignal= ruleSignal EOF )
            // InternalAdeptness.g:592:2: iv_ruleSignal= ruleSignal EOF
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
    // InternalAdeptness.g:598:1: ruleSignal returns [EObject current=null] : (otherlv_0= 'CPS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_oracle_3_0= ruleOracle ) )+ otherlv_4= 'ENDCPS' ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_oracle_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:604:2: ( (otherlv_0= 'CPS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_oracle_3_0= ruleOracle ) )+ otherlv_4= 'ENDCPS' ) )
            // InternalAdeptness.g:605:2: (otherlv_0= 'CPS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_oracle_3_0= ruleOracle ) )+ otherlv_4= 'ENDCPS' )
            {
            // InternalAdeptness.g:605:2: (otherlv_0= 'CPS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_oracle_3_0= ruleOracle ) )+ otherlv_4= 'ENDCPS' )
            // InternalAdeptness.g:606:3: otherlv_0= 'CPS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_oracle_3_0= ruleOracle ) )+ otherlv_4= 'ENDCPS'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSignalAccess().getCPSKeyword_0());
            		
            // InternalAdeptness.g:610:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:611:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:611:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:612:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSignalAccess().getColonKeyword_2());
            		
            // InternalAdeptness.g:632:3: ( (lv_oracle_3_0= ruleOracle ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAdeptness.g:633:4: (lv_oracle_3_0= ruleOracle )
            	    {
            	    // InternalAdeptness.g:633:4: (lv_oracle_3_0= ruleOracle )
            	    // InternalAdeptness.g:634:5: lv_oracle_3_0= ruleOracle
            	    {

            	    					newCompositeNode(grammarAccess.getSignalAccess().getOracleOracleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSignalAccess().getENDCPSKeyword_4());
            		

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
    // InternalAdeptness.g:659:1: entryRuleOracle returns [EObject current=null] : iv_ruleOracle= ruleOracle EOF ;
    public final EObject entryRuleOracle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOracle = null;


        try {
            // InternalAdeptness.g:659:47: (iv_ruleOracle= ruleOracle EOF )
            // InternalAdeptness.g:660:2: iv_ruleOracle= ruleOracle EOF
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
    // InternalAdeptness.g:666:1: ruleOracle returns [EObject current=null] : (otherlv_0= 'ORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_check_3_0= ruleChecks ) )+ otherlv_4= 'ENDORACLE' ) ;
    public final EObject ruleOracle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_check_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:672:2: ( (otherlv_0= 'ORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_check_3_0= ruleChecks ) )+ otherlv_4= 'ENDORACLE' ) )
            // InternalAdeptness.g:673:2: (otherlv_0= 'ORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_check_3_0= ruleChecks ) )+ otherlv_4= 'ENDORACLE' )
            {
            // InternalAdeptness.g:673:2: (otherlv_0= 'ORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_check_3_0= ruleChecks ) )+ otherlv_4= 'ENDORACLE' )
            // InternalAdeptness.g:674:3: otherlv_0= 'ORACLE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_check_3_0= ruleChecks ) )+ otherlv_4= 'ENDORACLE'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOracleAccess().getORACLEKeyword_0());
            		
            // InternalAdeptness.g:678:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:679:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:679:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:680:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getOracleAccess().getColonKeyword_2());
            		
            // InternalAdeptness.g:700:3: ( (lv_check_3_0= ruleChecks ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAdeptness.g:701:4: (lv_check_3_0= ruleChecks )
            	    {
            	    // InternalAdeptness.g:701:4: (lv_check_3_0= ruleChecks )
            	    // InternalAdeptness.g:702:5: lv_check_3_0= ruleChecks
            	    {

            	    					newCompositeNode(grammarAccess.getOracleAccess().getCheckChecksParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
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

            otherlv_4=(Token)match(input,27,FOLLOW_2); 

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
    // InternalAdeptness.g:727:1: entryRuleChecks returns [EObject current=null] : iv_ruleChecks= ruleChecks EOF ;
    public final EObject entryRuleChecks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChecks = null;


        try {
            // InternalAdeptness.g:727:47: (iv_ruleChecks= ruleChecks EOF )
            // InternalAdeptness.g:728:2: iv_ruleChecks= ruleChecks EOF
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
    // InternalAdeptness.g:734:1: ruleChecks returns [EObject current=null] : (otherlv_0= 'checks:' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_reference_2_0= ruleReference ) ) ( (lv_failReason_3_0= ruleFailReason ) )+ ( (lv_description_4_0= ruleDescription ) ) ) ;
    public final EObject ruleChecks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_reference_2_0 = null;

        EObject lv_failReason_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:740:2: ( (otherlv_0= 'checks:' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_reference_2_0= ruleReference ) ) ( (lv_failReason_3_0= ruleFailReason ) )+ ( (lv_description_4_0= ruleDescription ) ) ) )
            // InternalAdeptness.g:741:2: (otherlv_0= 'checks:' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_reference_2_0= ruleReference ) ) ( (lv_failReason_3_0= ruleFailReason ) )+ ( (lv_description_4_0= ruleDescription ) ) )
            {
            // InternalAdeptness.g:741:2: (otherlv_0= 'checks:' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_reference_2_0= ruleReference ) ) ( (lv_failReason_3_0= ruleFailReason ) )+ ( (lv_description_4_0= ruleDescription ) ) )
            // InternalAdeptness.g:742:3: otherlv_0= 'checks:' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_reference_2_0= ruleReference ) ) ( (lv_failReason_3_0= ruleFailReason ) )+ ( (lv_description_4_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getChecksAccess().getChecksKeyword_0());
            		
            // InternalAdeptness.g:746:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAdeptness.g:747:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAdeptness.g:747:4: (lv_name_1_0= RULE_STRING )
            // InternalAdeptness.g:748:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

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

            // InternalAdeptness.g:764:3: ( (lv_reference_2_0= ruleReference ) )
            // InternalAdeptness.g:765:4: (lv_reference_2_0= ruleReference )
            {
            // InternalAdeptness.g:765:4: (lv_reference_2_0= ruleReference )
            // InternalAdeptness.g:766:5: lv_reference_2_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getChecksAccess().getReferenceReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalAdeptness.g:783:3: ( (lv_failReason_3_0= ruleFailReason ) )+
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
            	    // InternalAdeptness.g:784:4: (lv_failReason_3_0= ruleFailReason )
            	    {
            	    // InternalAdeptness.g:784:4: (lv_failReason_3_0= ruleFailReason )
            	    // InternalAdeptness.g:785:5: lv_failReason_3_0= ruleFailReason
            	    {

            	    					newCompositeNode(grammarAccess.getChecksAccess().getFailReasonFailReasonParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_22);
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

            // InternalAdeptness.g:802:3: ( (lv_description_4_0= ruleDescription ) )
            // InternalAdeptness.g:803:4: (lv_description_4_0= ruleDescription )
            {
            // InternalAdeptness.g:803:4: (lv_description_4_0= ruleDescription )
            // InternalAdeptness.g:804:5: lv_description_4_0= ruleDescription
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
    // InternalAdeptness.g:825:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalAdeptness.g:825:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalAdeptness.g:826:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalAdeptness.g:832:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalAdeptness.g:838:2: ( (otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalAdeptness.g:839:2: (otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalAdeptness.g:839:2: (otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalAdeptness.g:840:3: otherlv_0= 'Description: ' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            // InternalAdeptness.g:844:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalAdeptness.g:845:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalAdeptness.g:845:4: (lv_value_1_0= RULE_STRING )
            // InternalAdeptness.g:846:5: lv_value_1_0= RULE_STRING
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
    // InternalAdeptness.g:866:1: entryRuleFailReason returns [EObject current=null] : iv_ruleFailReason= ruleFailReason EOF ;
    public final EObject entryRuleFailReason() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFailReason = null;


        try {
            // InternalAdeptness.g:866:51: (iv_ruleFailReason= ruleFailReason EOF )
            // InternalAdeptness.g:867:2: iv_ruleFailReason= ruleFailReason EOF
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
    // InternalAdeptness.g:873:1: ruleFailReason returns [EObject current=null] : (otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) ) ) ;
    public final EObject ruleFailReason() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_reason_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:879:2: ( (otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) ) ) )
            // InternalAdeptness.g:880:2: (otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) ) )
            {
            // InternalAdeptness.g:880:2: (otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) ) )
            // InternalAdeptness.g:881:3: otherlv_0= 'fails if :' ( (lv_reason_1_0= ruleReason ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getFailReasonAccess().getFailsIfKeyword_0());
            		
            // InternalAdeptness.g:885:3: ( (lv_reason_1_0= ruleReason ) )
            // InternalAdeptness.g:886:4: (lv_reason_1_0= ruleReason )
            {
            // InternalAdeptness.g:886:4: (lv_reason_1_0= ruleReason )
            // InternalAdeptness.g:887:5: lv_reason_1_0= ruleReason
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
    // InternalAdeptness.g:908:1: entryRuleReason returns [EObject current=null] : iv_ruleReason= ruleReason EOF ;
    public final EObject entryRuleReason() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReason = null;


        try {
            // InternalAdeptness.g:908:47: (iv_ruleReason= ruleReason EOF )
            // InternalAdeptness.g:909:2: iv_ruleReason= ruleReason EOF
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
    // InternalAdeptness.g:915:1: ruleReason returns [EObject current=null] : ( ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleReason() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_highPeak_0_0 = null;

        EObject lv_highTime_1_0 = null;

        EObject lv_constDeg_2_0 = null;

        EObject lv_xPeaks_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:921:2: ( ( ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';' ) )
            // InternalAdeptness.g:922:2: ( ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';' )
            {
            // InternalAdeptness.g:922:2: ( ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';' )
            // InternalAdeptness.g:923:3: ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) ) otherlv_4= ';'
            {
            // InternalAdeptness.g:923:3: ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) )
            int alt12=4;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalAdeptness.g:924:4: ( (lv_highPeak_0_0= ruleHighPeak ) )
                    {
                    // InternalAdeptness.g:924:4: ( (lv_highPeak_0_0= ruleHighPeak ) )
                    // InternalAdeptness.g:925:5: (lv_highPeak_0_0= ruleHighPeak )
                    {
                    // InternalAdeptness.g:925:5: (lv_highPeak_0_0= ruleHighPeak )
                    // InternalAdeptness.g:926:6: lv_highPeak_0_0= ruleHighPeak
                    {

                    						newCompositeNode(grammarAccess.getReasonAccess().getHighPeakHighPeakParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_24);
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
                    // InternalAdeptness.g:944:4: ( (lv_highTime_1_0= ruleHighTime ) )
                    {
                    // InternalAdeptness.g:944:4: ( (lv_highTime_1_0= ruleHighTime ) )
                    // InternalAdeptness.g:945:5: (lv_highTime_1_0= ruleHighTime )
                    {
                    // InternalAdeptness.g:945:5: (lv_highTime_1_0= ruleHighTime )
                    // InternalAdeptness.g:946:6: lv_highTime_1_0= ruleHighTime
                    {

                    						newCompositeNode(grammarAccess.getReasonAccess().getHighTimeHighTimeParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_24);
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
                    // InternalAdeptness.g:964:4: ( (lv_constDeg_2_0= ruleConstDeg ) )
                    {
                    // InternalAdeptness.g:964:4: ( (lv_constDeg_2_0= ruleConstDeg ) )
                    // InternalAdeptness.g:965:5: (lv_constDeg_2_0= ruleConstDeg )
                    {
                    // InternalAdeptness.g:965:5: (lv_constDeg_2_0= ruleConstDeg )
                    // InternalAdeptness.g:966:6: lv_constDeg_2_0= ruleConstDeg
                    {

                    						newCompositeNode(grammarAccess.getReasonAccess().getConstDegConstDegParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_24);
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
                    // InternalAdeptness.g:984:4: ( (lv_xPeaks_3_0= ruleXPeaks ) )
                    {
                    // InternalAdeptness.g:984:4: ( (lv_xPeaks_3_0= ruleXPeaks ) )
                    // InternalAdeptness.g:985:5: (lv_xPeaks_3_0= ruleXPeaks )
                    {
                    // InternalAdeptness.g:985:5: (lv_xPeaks_3_0= ruleXPeaks )
                    // InternalAdeptness.g:986:6: lv_xPeaks_3_0= ruleXPeaks
                    {

                    						newCompositeNode(grammarAccess.getReasonAccess().getXPeaksXPeaksParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_24);
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

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

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
    // InternalAdeptness.g:1012:1: entryRuleXPeaks returns [EObject current=null] : iv_ruleXPeaks= ruleXPeaks EOF ;
    public final EObject entryRuleXPeaks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPeaks = null;


        try {
            // InternalAdeptness.g:1012:47: (iv_ruleXPeaks= ruleXPeaks EOF )
            // InternalAdeptness.g:1013:2: iv_ruleXPeaks= ruleXPeaks EOF
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
    // InternalAdeptness.g:1019:1: ruleXPeaks returns [EObject current=null] : (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTimeType ) ) ) ;
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
            // InternalAdeptness.g:1025:2: ( (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTimeType ) ) ) )
            // InternalAdeptness.g:1026:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTimeType ) ) )
            {
            // InternalAdeptness.g:1026:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTimeType ) ) )
            // InternalAdeptness.g:1027:3: otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'more than' ( (lv_nPeaks_3_0= ruleDOUBLE ) ) otherlv_4= 'times within' ( (lv_time_5_0= RULE_INT ) ) ( (lv_unit_6_0= ruleTimeType ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getXPeaksAccess().getConfidenceIsBelowKeyword_0());
            		
            // InternalAdeptness.g:1031:3: ( (lv_cant_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1032:4: (lv_cant_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1032:4: (lv_cant_1_0= ruleDOUBLE )
            // InternalAdeptness.g:1033:5: lv_cant_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getXPeaksAccess().getCantDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_2=(Token)match(input,33,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getXPeaksAccess().getMoreThanKeyword_2());
            		
            // InternalAdeptness.g:1054:3: ( (lv_nPeaks_3_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1055:4: (lv_nPeaks_3_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1055:4: (lv_nPeaks_3_0= ruleDOUBLE )
            // InternalAdeptness.g:1056:5: lv_nPeaks_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getXPeaksAccess().getNPeaksDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_4=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getXPeaksAccess().getTimesWithinKeyword_4());
            		
            // InternalAdeptness.g:1077:3: ( (lv_time_5_0= RULE_INT ) )
            // InternalAdeptness.g:1078:4: (lv_time_5_0= RULE_INT )
            {
            // InternalAdeptness.g:1078:4: (lv_time_5_0= RULE_INT )
            // InternalAdeptness.g:1079:5: lv_time_5_0= RULE_INT
            {
            lv_time_5_0=(Token)match(input,RULE_INT,FOLLOW_28); 

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

            // InternalAdeptness.g:1095:3: ( (lv_unit_6_0= ruleTimeType ) )
            // InternalAdeptness.g:1096:4: (lv_unit_6_0= ruleTimeType )
            {
            // InternalAdeptness.g:1096:4: (lv_unit_6_0= ruleTimeType )
            // InternalAdeptness.g:1097:5: lv_unit_6_0= ruleTimeType
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
    // InternalAdeptness.g:1118:1: entryRuleConstDeg returns [EObject current=null] : iv_ruleConstDeg= ruleConstDeg EOF ;
    public final EObject entryRuleConstDeg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstDeg = null;


        try {
            // InternalAdeptness.g:1118:49: (iv_ruleConstDeg= ruleConstDeg EOF )
            // InternalAdeptness.g:1119:2: iv_ruleConstDeg= ruleConstDeg EOF
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
    // InternalAdeptness.g:1125:1: ruleConstDeg returns [EObject current=null] : (otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleConstDeg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cant_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1131:2: ( (otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) ) ) )
            // InternalAdeptness.g:1132:2: (otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) ) )
            {
            // InternalAdeptness.g:1132:2: (otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) ) )
            // InternalAdeptness.g:1133:3: otherlv_0= 'confidence is in constant degradation' ( (lv_cant_1_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getConstDegAccess().getConfidenceIsInConstantDegradationKeyword_0());
            		
            // InternalAdeptness.g:1137:3: ( (lv_cant_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1138:4: (lv_cant_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1138:4: (lv_cant_1_0= ruleDOUBLE )
            // InternalAdeptness.g:1139:5: lv_cant_1_0= ruleDOUBLE
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
    // InternalAdeptness.g:1160:1: entryRuleHighTime returns [EObject current=null] : iv_ruleHighTime= ruleHighTime EOF ;
    public final EObject entryRuleHighTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighTime = null;


        try {
            // InternalAdeptness.g:1160:49: (iv_ruleHighTime= ruleHighTime EOF )
            // InternalAdeptness.g:1161:2: iv_ruleHighTime= ruleHighTime EOF
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
    // InternalAdeptness.g:1167:1: ruleHighTime returns [EObject current=null] : (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) ) ) ;
    public final EObject ruleHighTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_cant_1_0 = null;

        EObject lv_time_3_0 = null;

        EObject lv_unit_4_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1173:2: ( (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) ) ) )
            // InternalAdeptness.g:1174:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) ) )
            {
            // InternalAdeptness.g:1174:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) ) )
            // InternalAdeptness.g:1175:3: otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) otherlv_2= 'within' ( (lv_time_3_0= ruleDOUBLE ) ) ( (lv_unit_4_0= ruleTimeType ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getHighTimeAccess().getConfidenceIsBelowKeyword_0());
            		
            // InternalAdeptness.g:1179:3: ( (lv_cant_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1180:4: (lv_cant_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1180:4: (lv_cant_1_0= ruleDOUBLE )
            // InternalAdeptness.g:1181:5: lv_cant_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getHighTimeAccess().getCantDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
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

            otherlv_2=(Token)match(input,36,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getHighTimeAccess().getWithinKeyword_2());
            		
            // InternalAdeptness.g:1202:3: ( (lv_time_3_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1203:4: (lv_time_3_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1203:4: (lv_time_3_0= ruleDOUBLE )
            // InternalAdeptness.g:1204:5: lv_time_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getHighTimeAccess().getTimeDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalAdeptness.g:1221:3: ( (lv_unit_4_0= ruleTimeType ) )
            // InternalAdeptness.g:1222:4: (lv_unit_4_0= ruleTimeType )
            {
            // InternalAdeptness.g:1222:4: (lv_unit_4_0= ruleTimeType )
            // InternalAdeptness.g:1223:5: lv_unit_4_0= ruleTimeType
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
    // InternalAdeptness.g:1244:1: entryRuleHighPeak returns [EObject current=null] : iv_ruleHighPeak= ruleHighPeak EOF ;
    public final EObject entryRuleHighPeak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighPeak = null;


        try {
            // InternalAdeptness.g:1244:49: (iv_ruleHighPeak= ruleHighPeak EOF )
            // InternalAdeptness.g:1245:2: iv_ruleHighPeak= ruleHighPeak EOF
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
    // InternalAdeptness.g:1251:1: ruleHighPeak returns [EObject current=null] : (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleHighPeak() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cant_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1257:2: ( (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) ) )
            // InternalAdeptness.g:1258:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) )
            {
            // InternalAdeptness.g:1258:2: (otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) ) )
            // InternalAdeptness.g:1259:3: otherlv_0= 'confidence is below' ( (lv_cant_1_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getHighPeakAccess().getConfidenceIsBelowKeyword_0());
            		
            // InternalAdeptness.g:1263:3: ( (lv_cant_1_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1264:4: (lv_cant_1_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1264:4: (lv_cant_1_0= ruleDOUBLE )
            // InternalAdeptness.g:1265:5: lv_cant_1_0= ruleDOUBLE
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
    // InternalAdeptness.g:1286:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalAdeptness.g:1286:50: (iv_ruleReference= ruleReference EOF )
            // InternalAdeptness.g:1287:2: iv_ruleReference= ruleReference EOF
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
    // InternalAdeptness.g:1293:1: ruleReference returns [EObject current=null] : ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_upper_0_0 = null;

        EObject lv_lower_1_0 = null;

        EObject lv_range_2_0 = null;

        EObject lv_gap_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1299:2: ( ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) ) otherlv_4= ';' ) )
            // InternalAdeptness.g:1300:2: ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) ) otherlv_4= ';' )
            {
            // InternalAdeptness.g:1300:2: ( ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) ) otherlv_4= ';' )
            // InternalAdeptness.g:1301:3: ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) ) otherlv_4= ';'
            {
            // InternalAdeptness.g:1301:3: ( ( (lv_upper_0_0= ruleUpper ) ) | ( (lv_lower_1_0= ruleLower ) ) | ( (lv_range_2_0= ruleRange ) ) | ( (lv_gap_3_0= ruleGap ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt13=1;
                }
                break;
            case 38:
                {
                alt13=2;
                }
                break;
            case 39:
                {
                alt13=3;
                }
                break;
            case 41:
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
                    // InternalAdeptness.g:1302:4: ( (lv_upper_0_0= ruleUpper ) )
                    {
                    // InternalAdeptness.g:1302:4: ( (lv_upper_0_0= ruleUpper ) )
                    // InternalAdeptness.g:1303:5: (lv_upper_0_0= ruleUpper )
                    {
                    // InternalAdeptness.g:1303:5: (lv_upper_0_0= ruleUpper )
                    // InternalAdeptness.g:1304:6: lv_upper_0_0= ruleUpper
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getUpperUpperParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_24);
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
                    // InternalAdeptness.g:1322:4: ( (lv_lower_1_0= ruleLower ) )
                    {
                    // InternalAdeptness.g:1322:4: ( (lv_lower_1_0= ruleLower ) )
                    // InternalAdeptness.g:1323:5: (lv_lower_1_0= ruleLower )
                    {
                    // InternalAdeptness.g:1323:5: (lv_lower_1_0= ruleLower )
                    // InternalAdeptness.g:1324:6: lv_lower_1_0= ruleLower
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getLowerLowerParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_24);
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
                    // InternalAdeptness.g:1342:4: ( (lv_range_2_0= ruleRange ) )
                    {
                    // InternalAdeptness.g:1342:4: ( (lv_range_2_0= ruleRange ) )
                    // InternalAdeptness.g:1343:5: (lv_range_2_0= ruleRange )
                    {
                    // InternalAdeptness.g:1343:5: (lv_range_2_0= ruleRange )
                    // InternalAdeptness.g:1344:6: lv_range_2_0= ruleRange
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getRangeRangeParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_24);
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
                    // InternalAdeptness.g:1362:4: ( (lv_gap_3_0= ruleGap ) )
                    {
                    // InternalAdeptness.g:1362:4: ( (lv_gap_3_0= ruleGap ) )
                    // InternalAdeptness.g:1363:5: (lv_gap_3_0= ruleGap )
                    {
                    // InternalAdeptness.g:1363:5: (lv_gap_3_0= ruleGap )
                    // InternalAdeptness.g:1364:6: lv_gap_3_0= ruleGap
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getGapGapParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_24);
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

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

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
    // InternalAdeptness.g:1390:1: entryRuleUpper returns [EObject current=null] : iv_ruleUpper= ruleUpper EOF ;
    public final EObject entryRuleUpper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpper = null;


        try {
            // InternalAdeptness.g:1390:46: (iv_ruleUpper= ruleUpper EOF )
            // InternalAdeptness.g:1391:2: iv_ruleUpper= ruleUpper EOF
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
    // InternalAdeptness.g:1397:1: ruleUpper returns [EObject current=null] : (otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) ) ) ;
    public final EObject ruleUpper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bound_upp_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1403:2: ( (otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) ) ) )
            // InternalAdeptness.g:1404:2: (otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) ) )
            {
            // InternalAdeptness.g:1404:2: (otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) ) )
            // InternalAdeptness.g:1405:3: otherlv_0= 'is below' ( (lv_bound_upp_1_0= ruleBound_up ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getUpperAccess().getIsBelowKeyword_0());
            		
            // InternalAdeptness.g:1409:3: ( (lv_bound_upp_1_0= ruleBound_up ) )
            // InternalAdeptness.g:1410:4: (lv_bound_upp_1_0= ruleBound_up )
            {
            // InternalAdeptness.g:1410:4: (lv_bound_upp_1_0= ruleBound_up )
            // InternalAdeptness.g:1411:5: lv_bound_upp_1_0= ruleBound_up
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
    // InternalAdeptness.g:1432:1: entryRuleLower returns [EObject current=null] : iv_ruleLower= ruleLower EOF ;
    public final EObject entryRuleLower() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLower = null;


        try {
            // InternalAdeptness.g:1432:46: (iv_ruleLower= ruleLower EOF )
            // InternalAdeptness.g:1433:2: iv_ruleLower= ruleLower EOF
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
    // InternalAdeptness.g:1439:1: ruleLower returns [EObject current=null] : (otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) ) ) ;
    public final EObject ruleLower() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bound_lower_1_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1445:2: ( (otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) ) ) )
            // InternalAdeptness.g:1446:2: (otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) ) )
            {
            // InternalAdeptness.g:1446:2: (otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) ) )
            // InternalAdeptness.g:1447:3: otherlv_0= 'is above' ( (lv_bound_lower_1_0= ruleBound_Down ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getLowerAccess().getIsAboveKeyword_0());
            		
            // InternalAdeptness.g:1451:3: ( (lv_bound_lower_1_0= ruleBound_Down ) )
            // InternalAdeptness.g:1452:4: (lv_bound_lower_1_0= ruleBound_Down )
            {
            // InternalAdeptness.g:1452:4: (lv_bound_lower_1_0= ruleBound_Down )
            // InternalAdeptness.g:1453:5: lv_bound_lower_1_0= ruleBound_Down
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
    // InternalAdeptness.g:1474:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalAdeptness.g:1474:46: (iv_ruleRange= ruleRange EOF )
            // InternalAdeptness.g:1475:2: iv_ruleRange= ruleRange EOF
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
    // InternalAdeptness.g:1481:1: ruleRange returns [EObject current=null] : (otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_bound_lower_1_0 = null;

        EObject lv_bound_upp_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1487:2: ( (otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ) )
            // InternalAdeptness.g:1488:2: (otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) )
            {
            // InternalAdeptness.g:1488:2: (otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) )
            // InternalAdeptness.g:1489:3: otherlv_0= 'is in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getIsInRangeBetweenKeyword_0());
            		
            // InternalAdeptness.g:1493:3: ( (lv_bound_lower_1_0= ruleBound_Down ) )
            // InternalAdeptness.g:1494:4: (lv_bound_lower_1_0= ruleBound_Down )
            {
            // InternalAdeptness.g:1494:4: (lv_bound_lower_1_0= ruleBound_Down )
            // InternalAdeptness.g:1495:5: lv_bound_lower_1_0= ruleBound_Down
            {

            					newCompositeNode(grammarAccess.getRangeAccess().getBound_lowerBound_DownParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_2=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getAndKeyword_2());
            		
            // InternalAdeptness.g:1516:3: ( (lv_bound_upp_3_0= ruleBound_up ) )
            // InternalAdeptness.g:1517:4: (lv_bound_upp_3_0= ruleBound_up )
            {
            // InternalAdeptness.g:1517:4: (lv_bound_upp_3_0= ruleBound_up )
            // InternalAdeptness.g:1518:5: lv_bound_upp_3_0= ruleBound_up
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
    // InternalAdeptness.g:1539:1: entryRuleGap returns [EObject current=null] : iv_ruleGap= ruleGap EOF ;
    public final EObject entryRuleGap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGap = null;


        try {
            // InternalAdeptness.g:1539:44: (iv_ruleGap= ruleGap EOF )
            // InternalAdeptness.g:1540:2: iv_ruleGap= ruleGap EOF
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
    // InternalAdeptness.g:1546:1: ruleGap returns [EObject current=null] : (otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ) ;
    public final EObject ruleGap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_bound_lower_1_0 = null;

        EObject lv_bound_upp_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1552:2: ( (otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) ) )
            // InternalAdeptness.g:1553:2: (otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) )
            {
            // InternalAdeptness.g:1553:2: (otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) ) )
            // InternalAdeptness.g:1554:3: otherlv_0= 'not in range between' ( (lv_bound_lower_1_0= ruleBound_Down ) ) otherlv_2= 'and' ( (lv_bound_upp_3_0= ruleBound_up ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getGapAccess().getNotInRangeBetweenKeyword_0());
            		
            // InternalAdeptness.g:1558:3: ( (lv_bound_lower_1_0= ruleBound_Down ) )
            // InternalAdeptness.g:1559:4: (lv_bound_lower_1_0= ruleBound_Down )
            {
            // InternalAdeptness.g:1559:4: (lv_bound_lower_1_0= ruleBound_Down )
            // InternalAdeptness.g:1560:5: lv_bound_lower_1_0= ruleBound_Down
            {

            					newCompositeNode(grammarAccess.getGapAccess().getBound_lowerBound_DownParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_2=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getGapAccess().getAndKeyword_2());
            		
            // InternalAdeptness.g:1581:3: ( (lv_bound_upp_3_0= ruleBound_up ) )
            // InternalAdeptness.g:1582:4: (lv_bound_upp_3_0= ruleBound_up )
            {
            // InternalAdeptness.g:1582:4: (lv_bound_upp_3_0= ruleBound_up )
            // InternalAdeptness.g:1583:5: lv_bound_upp_3_0= ruleBound_up
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
    // InternalAdeptness.g:1604:1: entryRuleBound_up returns [EObject current=null] : iv_ruleBound_up= ruleBound_up EOF ;
    public final EObject entryRuleBound_up() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBound_up = null;


        try {
            // InternalAdeptness.g:1604:49: (iv_ruleBound_up= ruleBound_up EOF )
            // InternalAdeptness.g:1605:2: iv_ruleBound_up= ruleBound_up EOF
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
    // InternalAdeptness.g:1611:1: ruleBound_up returns [EObject current=null] : ( (lv_value_0_0= ruleDOUBLE ) ) ;
    public final EObject ruleBound_up() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1617:2: ( ( (lv_value_0_0= ruleDOUBLE ) ) )
            // InternalAdeptness.g:1618:2: ( (lv_value_0_0= ruleDOUBLE ) )
            {
            // InternalAdeptness.g:1618:2: ( (lv_value_0_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1619:3: (lv_value_0_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1619:3: (lv_value_0_0= ruleDOUBLE )
            // InternalAdeptness.g:1620:4: lv_value_0_0= ruleDOUBLE
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
    // InternalAdeptness.g:1640:1: entryRuleBound_Down returns [EObject current=null] : iv_ruleBound_Down= ruleBound_Down EOF ;
    public final EObject entryRuleBound_Down() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBound_Down = null;


        try {
            // InternalAdeptness.g:1640:51: (iv_ruleBound_Down= ruleBound_Down EOF )
            // InternalAdeptness.g:1641:2: iv_ruleBound_Down= ruleBound_Down EOF
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
    // InternalAdeptness.g:1647:1: ruleBound_Down returns [EObject current=null] : ( (lv_value_0_0= ruleDOUBLE ) ) ;
    public final EObject ruleBound_Down() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1653:2: ( ( (lv_value_0_0= ruleDOUBLE ) ) )
            // InternalAdeptness.g:1654:2: ( (lv_value_0_0= ruleDOUBLE ) )
            {
            // InternalAdeptness.g:1654:2: ( (lv_value_0_0= ruleDOUBLE ) )
            // InternalAdeptness.g:1655:3: (lv_value_0_0= ruleDOUBLE )
            {
            // InternalAdeptness.g:1655:3: (lv_value_0_0= ruleDOUBLE )
            // InternalAdeptness.g:1656:4: lv_value_0_0= ruleDOUBLE
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
    // InternalAdeptness.g:1676:1: entryRuleBOOLEAN returns [EObject current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final EObject entryRuleBOOLEAN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOOLEAN = null;


        try {
            // InternalAdeptness.g:1676:48: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalAdeptness.g:1677:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
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
    // InternalAdeptness.g:1683:1: ruleBOOLEAN returns [EObject current=null] : ( (lv_bool_0_0= ruleb ) ) ;
    public final EObject ruleBOOLEAN() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_bool_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1689:2: ( ( (lv_bool_0_0= ruleb ) ) )
            // InternalAdeptness.g:1690:2: ( (lv_bool_0_0= ruleb ) )
            {
            // InternalAdeptness.g:1690:2: ( (lv_bool_0_0= ruleb ) )
            // InternalAdeptness.g:1691:3: (lv_bool_0_0= ruleb )
            {
            // InternalAdeptness.g:1691:3: (lv_bool_0_0= ruleb )
            // InternalAdeptness.g:1692:4: lv_bool_0_0= ruleb
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
    // InternalAdeptness.g:1712:1: entryRuleb returns [String current=null] : iv_ruleb= ruleb EOF ;
    public final String entryRuleb() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleb = null;


        try {
            // InternalAdeptness.g:1712:41: (iv_ruleb= ruleb EOF )
            // InternalAdeptness.g:1713:2: iv_ruleb= ruleb EOF
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
    // InternalAdeptness.g:1719:1: ruleb returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleb() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdeptness.g:1725:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalAdeptness.g:1726:2: (kw= 'true' | kw= 'false' )
            {
            // InternalAdeptness.g:1726:2: (kw= 'true' | kw= 'false' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==42) ) {
                alt14=1;
            }
            else if ( (LA14_0==43) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAdeptness.g:1727:3: kw= 'true'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdeptness.g:1733:3: kw= 'false'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

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
    // InternalAdeptness.g:1742:1: entryRuleDOUBLE returns [EObject current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final EObject entryRuleDOUBLE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOUBLE = null;


        try {
            // InternalAdeptness.g:1742:47: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalAdeptness.g:1743:2: iv_ruleDOUBLE= ruleDOUBLE EOF
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
    // InternalAdeptness.g:1749:1: ruleDOUBLE returns [EObject current=null] : ( (lv_dVal_0_0= ruled ) ) ;
    public final EObject ruleDOUBLE() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_dVal_0_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1755:2: ( ( (lv_dVal_0_0= ruled ) ) )
            // InternalAdeptness.g:1756:2: ( (lv_dVal_0_0= ruled ) )
            {
            // InternalAdeptness.g:1756:2: ( (lv_dVal_0_0= ruled ) )
            // InternalAdeptness.g:1757:3: (lv_dVal_0_0= ruled )
            {
            // InternalAdeptness.g:1757:3: (lv_dVal_0_0= ruled )
            // InternalAdeptness.g:1758:4: lv_dVal_0_0= ruled
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
    // InternalAdeptness.g:1778:1: entryRuled returns [String current=null] : iv_ruled= ruled EOF ;
    public final String entryRuled() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruled = null;


        try {
            // InternalAdeptness.g:1778:41: (iv_ruled= ruled EOF )
            // InternalAdeptness.g:1779:2: iv_ruled= ruled EOF
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
    // InternalAdeptness.g:1785:1: ruled returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruled() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalAdeptness.g:1791:2: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // InternalAdeptness.g:1792:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // InternalAdeptness.g:1792:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // InternalAdeptness.g:1793:3: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // InternalAdeptness.g:1793:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==44) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAdeptness.g:1794:4: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_27); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_6); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getDAccess().getINTTerminalRuleCall_1());
            		
            // InternalAdeptness.g:1807:3: (kw= '.' this_INT_3= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==13) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAdeptness.g:1808:4: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,13,FOLLOW_27); 

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
    // InternalAdeptness.g:1825:1: entryRuleTimeType returns [EObject current=null] : iv_ruleTimeType= ruleTimeType EOF ;
    public final EObject entryRuleTimeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeType = null;


        try {
            // InternalAdeptness.g:1825:49: (iv_ruleTimeType= ruleTimeType EOF )
            // InternalAdeptness.g:1826:2: iv_ruleTimeType= ruleTimeType EOF
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
    // InternalAdeptness.g:1832:1: ruleTimeType returns [EObject current=null] : ( ( (lv_time_0_0= 'miliseconds' ) ) | ( (lv_time_1_0= 'seconds' ) ) | ( (lv_time_2_0= 'minutes' ) ) | ( (lv_time_3_0= 'hours' ) ) ) ;
    public final EObject ruleTimeType() throws RecognitionException {
        EObject current = null;

        Token lv_time_0_0=null;
        Token lv_time_1_0=null;
        Token lv_time_2_0=null;
        Token lv_time_3_0=null;


        	enterRule();

        try {
            // InternalAdeptness.g:1838:2: ( ( ( (lv_time_0_0= 'miliseconds' ) ) | ( (lv_time_1_0= 'seconds' ) ) | ( (lv_time_2_0= 'minutes' ) ) | ( (lv_time_3_0= 'hours' ) ) ) )
            // InternalAdeptness.g:1839:2: ( ( (lv_time_0_0= 'miliseconds' ) ) | ( (lv_time_1_0= 'seconds' ) ) | ( (lv_time_2_0= 'minutes' ) ) | ( (lv_time_3_0= 'hours' ) ) )
            {
            // InternalAdeptness.g:1839:2: ( ( (lv_time_0_0= 'miliseconds' ) ) | ( (lv_time_1_0= 'seconds' ) ) | ( (lv_time_2_0= 'minutes' ) ) | ( (lv_time_3_0= 'hours' ) ) )
            int alt17=4;
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
            case 48:
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
                    // InternalAdeptness.g:1840:3: ( (lv_time_0_0= 'miliseconds' ) )
                    {
                    // InternalAdeptness.g:1840:3: ( (lv_time_0_0= 'miliseconds' ) )
                    // InternalAdeptness.g:1841:4: (lv_time_0_0= 'miliseconds' )
                    {
                    // InternalAdeptness.g:1841:4: (lv_time_0_0= 'miliseconds' )
                    // InternalAdeptness.g:1842:5: lv_time_0_0= 'miliseconds'
                    {
                    lv_time_0_0=(Token)match(input,45,FOLLOW_2); 

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
                    // InternalAdeptness.g:1855:3: ( (lv_time_1_0= 'seconds' ) )
                    {
                    // InternalAdeptness.g:1855:3: ( (lv_time_1_0= 'seconds' ) )
                    // InternalAdeptness.g:1856:4: (lv_time_1_0= 'seconds' )
                    {
                    // InternalAdeptness.g:1856:4: (lv_time_1_0= 'seconds' )
                    // InternalAdeptness.g:1857:5: lv_time_1_0= 'seconds'
                    {
                    lv_time_1_0=(Token)match(input,46,FOLLOW_2); 

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
                    // InternalAdeptness.g:1870:3: ( (lv_time_2_0= 'minutes' ) )
                    {
                    // InternalAdeptness.g:1870:3: ( (lv_time_2_0= 'minutes' ) )
                    // InternalAdeptness.g:1871:4: (lv_time_2_0= 'minutes' )
                    {
                    // InternalAdeptness.g:1871:4: (lv_time_2_0= 'minutes' )
                    // InternalAdeptness.g:1872:5: lv_time_2_0= 'minutes'
                    {
                    lv_time_2_0=(Token)match(input,47,FOLLOW_2); 

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
                    // InternalAdeptness.g:1885:3: ( (lv_time_3_0= 'hours' ) )
                    {
                    // InternalAdeptness.g:1885:3: ( (lv_time_3_0= 'hours' ) )
                    // InternalAdeptness.g:1886:4: (lv_time_3_0= 'hours' )
                    {
                    // InternalAdeptness.g:1886:4: (lv_time_3_0= 'hours' )
                    // InternalAdeptness.g:1887:5: lv_time_3_0= 'hours'
                    {
                    lv_time_3_0=(Token)match(input,48,FOLLOW_2); 

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
    // InternalAdeptness.g:1903:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalAdeptness.g:1903:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalAdeptness.g:1904:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalAdeptness.g:1910:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAdeptness.g:1916:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAdeptness.g:1917:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAdeptness.g:1917:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAdeptness.g:1918:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalAdeptness.g:1922:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdeptness.g:1923:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdeptness.g:1923:4: (lv_name_1_0= RULE_ID )
            // InternalAdeptness.g:1924:5: lv_name_1_0= RULE_ID
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
    // InternalAdeptness.g:1944:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalAdeptness.g:1944:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalAdeptness.g:1945:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
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
    // InternalAdeptness.g:1951:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalAdeptness.g:1957:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // InternalAdeptness.g:1958:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // InternalAdeptness.g:1958:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // InternalAdeptness.g:1959:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
            		
            // InternalAdeptness.g:1963:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalAdeptness.g:1964:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalAdeptness.g:1964:4: (lv_name_1_0= ruleQualifiedName )
            // InternalAdeptness.g:1965:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_2=(Token)match(input,51,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAdeptness.g:1986:3: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==11||LA18_0==14||LA18_0==24||(LA18_0>=49 && LA18_0<=50)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAdeptness.g:1987:4: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // InternalAdeptness.g:1987:4: (lv_elements_3_0= ruleAbstractElement )
            	    // InternalAdeptness.g:1988:5: lv_elements_3_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_32);
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

            otherlv_4=(Token)match(input,52,FOLLOW_2); 

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
    static final String dfa_2s = "\1\40\1\6\1\uffff\1\6\1\15\1\6\3\uffff\1\37";
    static final String dfa_3s = "\1\43\1\54\1\uffff\1\6\1\44\1\6\3\uffff\1\44";
    static final String dfa_4s = "\2\uffff\1\3\3\uffff\1\1\1\4\1\2\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2",
            "\1\4\45\uffff\1\3",
            "",
            "\1\4",
            "\1\5\21\uffff\1\6\1\uffff\1\7\2\uffff\1\10",
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
            return "923:3: ( ( (lv_highPeak_0_0= ruleHighPeak ) ) | ( (lv_highTime_1_0= ruleHighTime ) ) | ( (lv_constDeg_2_0= ruleConstDeg ) ) | ( (lv_xPeaks_3_0= ruleXPeaks ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0006000001004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000100000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000002E000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001E00000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0016000001004800L});

}