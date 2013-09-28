package org.modelversioning.emfprofile.decoration.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.modelversioning.emfprofile.decoration.services.EMFProfileDecorationLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEMFProfileDecorationLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'decorating profile'", "'decoration'", "'{'", "'}'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalEMFProfileDecorationLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEMFProfileDecorationLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEMFProfileDecorationLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g"; }



     	private EMFProfileDecorationLanguageGrammarAccess grammarAccess;
     	
        public InternalEMFProfileDecorationLanguageParser(TokenStream input, EMFProfileDecorationLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "EMFProfileDecorationModel";	
       	}
       	
       	@Override
       	protected EMFProfileDecorationLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleEMFProfileDecorationModel"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:67:1: entryRuleEMFProfileDecorationModel returns [EObject current=null] : iv_ruleEMFProfileDecorationModel= ruleEMFProfileDecorationModel EOF ;
    public final EObject entryRuleEMFProfileDecorationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMFProfileDecorationModel = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:68:2: (iv_ruleEMFProfileDecorationModel= ruleEMFProfileDecorationModel EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:69:2: iv_ruleEMFProfileDecorationModel= ruleEMFProfileDecorationModel EOF
            {
             newCompositeNode(grammarAccess.getEMFProfileDecorationModelRule()); 
            pushFollow(FOLLOW_ruleEMFProfileDecorationModel_in_entryRuleEMFProfileDecorationModel75);
            iv_ruleEMFProfileDecorationModel=ruleEMFProfileDecorationModel();

            state._fsp--;

             current =iv_ruleEMFProfileDecorationModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMFProfileDecorationModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEMFProfileDecorationModel"


    // $ANTLR start "ruleEMFProfileDecorationModel"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:76:1: ruleEMFProfileDecorationModel returns [EObject current=null] : (otherlv_0= 'decorating profile' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_decorations_2_0= ruleDecoration ) )* ) ;
    public final EObject ruleEMFProfileDecorationModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        EObject lv_decorations_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:79:28: ( (otherlv_0= 'decorating profile' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_decorations_2_0= ruleDecoration ) )* ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:80:1: (otherlv_0= 'decorating profile' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_decorations_2_0= ruleDecoration ) )* )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:80:1: (otherlv_0= 'decorating profile' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_decorations_2_0= ruleDecoration ) )* )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:80:3: otherlv_0= 'decorating profile' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_decorations_2_0= ruleDecoration ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleEMFProfileDecorationModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getEMFProfileDecorationModelAccess().getDecoratingProfileKeyword_0());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:84:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:85:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:85:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:86:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEMFProfileDecorationModel139); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getEMFProfileDecorationModelAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEMFProfileDecorationModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:102:2: ( (lv_decorations_2_0= ruleDecoration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:103:1: (lv_decorations_2_0= ruleDecoration )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:103:1: (lv_decorations_2_0= ruleDecoration )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:104:3: lv_decorations_2_0= ruleDecoration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEMFProfileDecorationModelAccess().getDecorationsDecorationParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecoration_in_ruleEMFProfileDecorationModel165);
            	    lv_decorations_2_0=ruleDecoration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEMFProfileDecorationModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"decorations",
            	            		lv_decorations_2_0, 
            	            		"Decoration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleEMFProfileDecorationModel"


    // $ANTLR start "entryRuleDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:128:1: entryRuleDecoration returns [EObject current=null] : iv_ruleDecoration= ruleDecoration EOF ;
    public final EObject entryRuleDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecoration = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:129:2: (iv_ruleDecoration= ruleDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:130:2: iv_ruleDecoration= ruleDecoration EOF
            {
             newCompositeNode(grammarAccess.getDecorationRule()); 
            pushFollow(FOLLOW_ruleDecoration_in_entryRuleDecoration202);
            iv_ruleDecoration=ruleDecoration();

            state._fsp--;

             current =iv_ruleDecoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecoration212); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecoration"


    // $ANTLR start "ruleDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:137:1: ruleDecoration returns [EObject current=null] : (otherlv_0= 'decoration' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleDecoration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:140:28: ( (otherlv_0= 'decoration' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:141:1: (otherlv_0= 'decoration' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:141:1: (otherlv_0= 'decoration' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:141:3: otherlv_0= 'decoration' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleDecoration249); 

                	newLeafNode(otherlv_0, grammarAccess.getDecorationAccess().getDecorationKeyword_0());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:145:1: ( (otherlv_1= RULE_ID ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:146:1: (otherlv_1= RULE_ID )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:146:1: (otherlv_1= RULE_ID )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:147:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecorationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecoration269); 

            		newLeafNode(otherlv_1, grammarAccess.getDecorationAccess().getDecorationsStereotypeCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDecoration281); 

                	newLeafNode(otherlv_2, grammarAccess.getDecorationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDecoration293); 

                	newLeafNode(otherlv_3, grammarAccess.getDecorationAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecoration"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleEMFProfileDecorationModel_in_entryRuleEMFProfileDecorationModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMFProfileDecorationModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleEMFProfileDecorationModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEMFProfileDecorationModel139 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleDecoration_in_ruleEMFProfileDecorationModel165 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleDecoration_in_entryRuleDecoration202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecoration212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleDecoration249 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecoration269 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDecoration281 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDecoration293 = new BitSet(new long[]{0x0000000000000002L});

}