package org.modelversioning.emfprofile.decoration.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_HEX_COLOR", "RULE_BOOLEAN", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import resource'", "'profile'", "'decoration'", "'{'", "'}'", "'image'", "'uri'", "'='", "'tooltip'", "'box'", "'text'", "'width'", "'height'", "'border'", "'foreground-color'", "'background-color'", "'content-direction'", "'color'", "'background'", "'foreground'", "'connection'", "'+'", "'placement'", "'line-style'", "'size'", "'direction'", "'margin'", "'RGB'", "'('", "','", "')'", "'active when'", "'ocl'", "'-'", "'.'", "'WEST'", "'NORTH'", "'EAST'", "'SOUTH'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'ALL'", "'ANY'", "'SOLID'", "'DOTS'", "'DASH'", "'DASHDOT'", "'DASHDOTDOT'", "'RED'", "'BLACK'", "'WHITE'", "'GREEN'", "'GREEN_LIGHT'", "'GREEN_DARK'", "'BLUE'", "'BLUE_LIGHT'", "'BLUE_DARK'", "'GRAY'", "'GRAY_LIGHT'", "'GRAY_DARK'", "'ORANGE'", "'YELLOW'", "'CYAN'", "'CENTER'", "'NORTH_EAST'", "'NORTH_WEST'", "'SOUTH_EAST'", "'SOUTH_WEST'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
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
    public static final int RULE_ID=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
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
    public static final int RULE_HEX_COLOR=6;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
        	return "DecorationModel";	
       	}
       	
       	@Override
       	protected EMFProfileDecorationLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDecorationModel"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:68:1: entryRuleDecorationModel returns [EObject current=null] : iv_ruleDecorationModel= ruleDecorationModel EOF ;
    public final EObject entryRuleDecorationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecorationModel = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:69:2: (iv_ruleDecorationModel= ruleDecorationModel EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:70:2: iv_ruleDecorationModel= ruleDecorationModel EOF
            {
             newCompositeNode(grammarAccess.getDecorationModelRule()); 
            pushFollow(FOLLOW_ruleDecorationModel_in_entryRuleDecorationModel75);
            iv_ruleDecorationModel=ruleDecorationModel();

            state._fsp--;

             current =iv_ruleDecorationModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecorationModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecorationModel"


    // $ANTLR start "ruleDecorationModel"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:77:1: ruleDecorationModel returns [EObject current=null] : (otherlv_0= 'import resource' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_namespace_2_0= ruleNamespace ) )? ( (lv_decorationDescriptions_3_0= ruleDecorationDescription ) )* ) ;
    public final EObject ruleDecorationModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        EObject lv_namespace_2_0 = null;

        EObject lv_decorationDescriptions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:80:28: ( (otherlv_0= 'import resource' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_namespace_2_0= ruleNamespace ) )? ( (lv_decorationDescriptions_3_0= ruleDecorationDescription ) )* ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:81:1: (otherlv_0= 'import resource' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_namespace_2_0= ruleNamespace ) )? ( (lv_decorationDescriptions_3_0= ruleDecorationDescription ) )* )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:81:1: (otherlv_0= 'import resource' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_namespace_2_0= ruleNamespace ) )? ( (lv_decorationDescriptions_3_0= ruleDecorationDescription ) )* )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:81:3: otherlv_0= 'import resource' ( (lv_importURI_1_0= RULE_STRING ) ) ( (lv_namespace_2_0= ruleNamespace ) )? ( (lv_decorationDescriptions_3_0= ruleDecorationDescription ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleDecorationModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getDecorationModelAccess().getImportResourceKeyword_0());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:85:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:86:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:86:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:87:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecorationModel139); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getDecorationModelAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDecorationModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:103:2: ( (lv_namespace_2_0= ruleNamespace ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:104:1: (lv_namespace_2_0= ruleNamespace )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:104:1: (lv_namespace_2_0= ruleNamespace )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:105:3: lv_namespace_2_0= ruleNamespace
                    {
                     
                    	        newCompositeNode(grammarAccess.getDecorationModelAccess().getNamespaceNamespaceParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNamespace_in_ruleDecorationModel165);
                    lv_namespace_2_0=ruleNamespace();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDecorationModelRule());
                    	        }
                           		set(
                           			current, 
                           			"namespace",
                            		lv_namespace_2_0, 
                            		"Namespace");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:121:3: ( (lv_decorationDescriptions_3_0= ruleDecorationDescription ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:122:1: (lv_decorationDescriptions_3_0= ruleDecorationDescription )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:122:1: (lv_decorationDescriptions_3_0= ruleDecorationDescription )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:123:3: lv_decorationDescriptions_3_0= ruleDecorationDescription
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDecorationModelAccess().getDecorationDescriptionsDecorationDescriptionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecorationDescription_in_ruleDecorationModel187);
            	    lv_decorationDescriptions_3_0=ruleDecorationDescription();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDecorationModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"decorationDescriptions",
            	            		lv_decorationDescriptions_3_0, 
            	            		"DecorationDescription");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleDecorationModel"


    // $ANTLR start "entryRuleNamespace"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:147:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:148:2: (iv_ruleNamespace= ruleNamespace EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:149:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace224);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace234); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:156:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'profile' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:159:28: ( (otherlv_0= 'profile' ( ( ruleQualifiedName ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:160:1: (otherlv_0= 'profile' ( ( ruleQualifiedName ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:160:1: (otherlv_0= 'profile' ( ( ruleQualifiedName ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:160:3: otherlv_0= 'profile' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleNamespace271); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getProfileKeyword_0());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:164:1: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:165:1: ( ruleQualifiedName )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:165:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:166:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNamespaceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNamespaceAccess().getProfileProfileCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNamespace294);
            ruleQualifiedName();

            state._fsp--;

             
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
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleDecorationDescription"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:187:1: entryRuleDecorationDescription returns [EObject current=null] : iv_ruleDecorationDescription= ruleDecorationDescription EOF ;
    public final EObject entryRuleDecorationDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecorationDescription = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:188:2: (iv_ruleDecorationDescription= ruleDecorationDescription EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:189:2: iv_ruleDecorationDescription= ruleDecorationDescription EOF
            {
             newCompositeNode(grammarAccess.getDecorationDescriptionRule()); 
            pushFollow(FOLLOW_ruleDecorationDescription_in_entryRuleDecorationDescription330);
            iv_ruleDecorationDescription=ruleDecorationDescription();

            state._fsp--;

             current =iv_ruleDecorationDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecorationDescription340); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecorationDescription"


    // $ANTLR start "ruleDecorationDescription"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:196:1: ruleDecorationDescription returns [EObject current=null] : (otherlv_0= 'decoration' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_decorations_4_0= ruleAbstractDecoration ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '}' ) ;
    public final EObject ruleDecorationDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_decorations_4_0 = null;

        EObject lv_activation_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:199:28: ( (otherlv_0= 'decoration' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_decorations_4_0= ruleAbstractDecoration ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '}' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:200:1: (otherlv_0= 'decoration' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_decorations_4_0= ruleAbstractDecoration ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '}' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:200:1: (otherlv_0= 'decoration' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_decorations_4_0= ruleAbstractDecoration ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '}' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:200:3: otherlv_0= 'decoration' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_decorations_4_0= ruleAbstractDecoration ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleDecorationDescription377); 

                	newLeafNode(otherlv_0, grammarAccess.getDecorationDescriptionAccess().getDecorationKeyword_0());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:204:1: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:205:1: ( ruleQualifiedName )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:205:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:206:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecorationDescriptionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDecorationDescriptionAccess().getStereotypeStereotypeCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDecorationDescription400);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleDecorationDescription412); 

                	newLeafNode(otherlv_2, grammarAccess.getDecorationDescriptionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:223:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_decorations_4_0= ruleAbstractDecoration ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+ {...}?) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:225:1: ( ( ( ({...}? => ( ({...}? => ( (lv_decorations_4_0= ruleAbstractDecoration ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+ {...}?) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:225:1: ( ( ( ({...}? => ( ({...}? => ( (lv_decorations_4_0= ruleAbstractDecoration ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+ {...}?) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:226:2: ( ( ({...}? => ( ({...}? => ( (lv_decorations_4_0= ruleAbstractDecoration ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3());
            	
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:229:2: ( ( ({...}? => ( ({...}? => ( (lv_decorations_4_0= ruleAbstractDecoration ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+ {...}?)
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:230:3: ( ({...}? => ( ({...}? => ( (lv_decorations_4_0= ruleAbstractDecoration ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+ {...}?
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:230:3: ( ({...}? => ( ({...}? => ( (lv_decorations_4_0= ruleAbstractDecoration ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18||LA4_0==22||LA4_0==26||LA4_0==30||LA4_0==33) && getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 1) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:232:4: ({...}? => ( ({...}? => ( (lv_decorations_4_0= ruleAbstractDecoration ) ) )+ ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:232:4: ({...}? => ( ({...}? => ( (lv_decorations_4_0= ruleAbstractDecoration ) ) )+ ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:233:5: {...}? => ( ({...}? => ( (lv_decorations_4_0= ruleAbstractDecoration ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDecorationDescription", "getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:233:118: ( ({...}? => ( (lv_decorations_4_0= ruleAbstractDecoration ) ) )+ )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:234:6: ({...}? => ( (lv_decorations_4_0= ruleAbstractDecoration ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:237:6: ({...}? => ( (lv_decorations_4_0= ruleAbstractDecoration ) ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        switch ( input.LA(1) ) {
            	        case 18:
            	            {
            	            int LA3_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	            }
            	            break;
            	        case 22:
            	            {
            	            int LA3_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	            }
            	            break;
            	        case 26:
            	            {
            	            int LA3_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	            }
            	            break;
            	        case 30:
            	            {
            	            int LA3_5 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	            }
            	            break;
            	        case 33:
            	            {
            	            int LA3_6 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt3) {
            	    	case 1 :
            	    	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:237:7: {...}? => ( (lv_decorations_4_0= ruleAbstractDecoration ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDecorationDescription", "true");
            	    	    }
            	    	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:237:16: ( (lv_decorations_4_0= ruleAbstractDecoration ) )
            	    	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:238:1: (lv_decorations_4_0= ruleAbstractDecoration )
            	    	    {
            	    	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:238:1: (lv_decorations_4_0= ruleAbstractDecoration )
            	    	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:239:3: lv_decorations_4_0= ruleAbstractDecoration
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDecorationDescriptionAccess().getDecorationsAbstractDecorationParserRuleCall_3_0_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleAbstractDecoration_in_ruleDecorationDescription478);
            	    	    lv_decorations_4_0=ruleAbstractDecoration();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDecorationDescriptionRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"decorations",
            	    	            		lv_decorations_4_0, 
            	    	            		"AbstractDecoration");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:262:4: ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:262:4: ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:263:5: {...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDecorationDescription", "getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:263:118: ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:264:6: ({...}? => ( (lv_activation_5_0= ruleActivation ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:267:6: ({...}? => ( (lv_activation_5_0= ruleActivation ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:267:7: {...}? => ( (lv_activation_5_0= ruleActivation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDecorationDescription", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:267:16: ( (lv_activation_5_0= ruleActivation ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:268:1: (lv_activation_5_0= ruleActivation )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:268:1: (lv_activation_5_0= ruleActivation )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:269:3: lv_activation_5_0= ruleActivation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDecorationDescriptionAccess().getActivationActivationParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivation_in_ruleDecorationDescription554);
            	    lv_activation_5_0=ruleActivation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDecorationDescriptionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"activation",
            	            		lv_activation_5_0, 
            	            		"Activation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleDecorationDescription", "getUnorderedGroupHelper().canLeave(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3());
            	

            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleDecorationDescription612); 

                	newLeafNode(otherlv_6, grammarAccess.getDecorationDescriptionAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecorationDescription"


    // $ANTLR start "entryRuleAbstractDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:312:1: entryRuleAbstractDecoration returns [EObject current=null] : iv_ruleAbstractDecoration= ruleAbstractDecoration EOF ;
    public final EObject entryRuleAbstractDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDecoration = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:313:2: (iv_ruleAbstractDecoration= ruleAbstractDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:314:2: iv_ruleAbstractDecoration= ruleAbstractDecoration EOF
            {
             newCompositeNode(grammarAccess.getAbstractDecorationRule()); 
            pushFollow(FOLLOW_ruleAbstractDecoration_in_entryRuleAbstractDecoration648);
            iv_ruleAbstractDecoration=ruleAbstractDecoration();

            state._fsp--;

             current =iv_ruleAbstractDecoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDecoration658); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractDecoration"


    // $ANTLR start "ruleAbstractDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:321:1: ruleAbstractDecoration returns [EObject current=null] : (this_ImageDecoration_0= ruleImageDecoration | this_BoxDecoration_1= ruleBoxDecoration | this_BorderDecoration_2= ruleBorderDecoration | this_ColorDecoration_3= ruleColorDecoration | this_ConnectionDecoration_4= ruleConnectionDecoration ) ;
    public final EObject ruleAbstractDecoration() throws RecognitionException {
        EObject current = null;

        EObject this_ImageDecoration_0 = null;

        EObject this_BoxDecoration_1 = null;

        EObject this_BorderDecoration_2 = null;

        EObject this_ColorDecoration_3 = null;

        EObject this_ConnectionDecoration_4 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:324:28: ( (this_ImageDecoration_0= ruleImageDecoration | this_BoxDecoration_1= ruleBoxDecoration | this_BorderDecoration_2= ruleBorderDecoration | this_ColorDecoration_3= ruleColorDecoration | this_ConnectionDecoration_4= ruleConnectionDecoration ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:325:1: (this_ImageDecoration_0= ruleImageDecoration | this_BoxDecoration_1= ruleBoxDecoration | this_BorderDecoration_2= ruleBorderDecoration | this_ColorDecoration_3= ruleColorDecoration | this_ConnectionDecoration_4= ruleConnectionDecoration )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:325:1: (this_ImageDecoration_0= ruleImageDecoration | this_BoxDecoration_1= ruleBoxDecoration | this_BorderDecoration_2= ruleBorderDecoration | this_ColorDecoration_3= ruleColorDecoration | this_ConnectionDecoration_4= ruleConnectionDecoration )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            case 30:
                {
                alt5=4;
                }
                break;
            case 33:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:326:5: this_ImageDecoration_0= ruleImageDecoration
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDecorationAccess().getImageDecorationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleImageDecoration_in_ruleAbstractDecoration705);
                    this_ImageDecoration_0=ruleImageDecoration();

                    state._fsp--;

                     
                            current = this_ImageDecoration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:336:5: this_BoxDecoration_1= ruleBoxDecoration
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDecorationAccess().getBoxDecorationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBoxDecoration_in_ruleAbstractDecoration732);
                    this_BoxDecoration_1=ruleBoxDecoration();

                    state._fsp--;

                     
                            current = this_BoxDecoration_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:346:5: this_BorderDecoration_2= ruleBorderDecoration
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDecorationAccess().getBorderDecorationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBorderDecoration_in_ruleAbstractDecoration759);
                    this_BorderDecoration_2=ruleBorderDecoration();

                    state._fsp--;

                     
                            current = this_BorderDecoration_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:356:5: this_ColorDecoration_3= ruleColorDecoration
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDecorationAccess().getColorDecorationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleColorDecoration_in_ruleAbstractDecoration786);
                    this_ColorDecoration_3=ruleColorDecoration();

                    state._fsp--;

                     
                            current = this_ColorDecoration_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:366:5: this_ConnectionDecoration_4= ruleConnectionDecoration
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDecorationAccess().getConnectionDecorationParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleConnectionDecoration_in_ruleAbstractDecoration813);
                    this_ConnectionDecoration_4=ruleConnectionDecoration();

                    state._fsp--;

                     
                            current = this_ConnectionDecoration_4; 
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
    // $ANTLR end "ruleAbstractDecoration"


    // $ANTLR start "entryRuleImageDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:382:1: entryRuleImageDecoration returns [EObject current=null] : iv_ruleImageDecoration= ruleImageDecoration EOF ;
    public final EObject entryRuleImageDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageDecoration = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:383:2: (iv_ruleImageDecoration= ruleImageDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:384:2: iv_ruleImageDecoration= ruleImageDecoration EOF
            {
             newCompositeNode(grammarAccess.getImageDecorationRule()); 
            pushFollow(FOLLOW_ruleImageDecoration_in_entryRuleImageDecoration848);
            iv_ruleImageDecoration=ruleImageDecoration();

            state._fsp--;

             current =iv_ruleImageDecoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageDecoration858); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImageDecoration"


    // $ANTLR start "ruleImageDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:391:1: ruleImageDecoration returns [EObject current=null] : ( () otherlv_1= 'image' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' ) ;
    public final EObject ruleImageDecoration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_location_uri_6_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        EObject lv_direction_7_0 = null;

        EObject lv_margin_8_0 = null;

        EObject lv_tooltip_11_0 = null;

        EObject lv_activation_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:394:28: ( ( () otherlv_1= 'image' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:395:1: ( () otherlv_1= 'image' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:395:1: ( () otherlv_1= 'image' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:395:2: () otherlv_1= 'image' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}'
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:395:2: ()
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:396:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImageDecorationAccess().getImageDecorationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleImageDecoration904); 

                	newLeafNode(otherlv_1, grammarAccess.getImageDecorationAccess().getImageKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleImageDecoration916); 

                	newLeafNode(otherlv_2, grammarAccess.getImageDecorationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:409:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:411:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:411:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:412:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3());
            	
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:415:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?)
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:416:3: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:416:3: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=6;
                int LA6_0 = input.LA(1);

                if ( LA6_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0) ) {
                    alt6=1;
                }
                else if ( LA6_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1) ) {
                    alt6=2;
                }
                else if ( LA6_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2) ) {
                    alt6=3;
                }
                else if ( LA6_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3) ) {
                    alt6=4;
                }
                else if ( LA6_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4) ) {
                    alt6=5;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:418:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:418:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:419:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleImageDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:419:112: ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:420:6: ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:423:6: ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:423:7: {...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImageDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:423:16: (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:423:18: otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleImageDecoration974); 

            	        	newLeafNode(otherlv_4, grammarAccess.getImageDecorationAccess().getUriKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleImageDecoration986); 

            	        	newLeafNode(otherlv_5, grammarAccess.getImageDecorationAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:431:1: ( (lv_location_uri_6_0= RULE_STRING ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:432:1: (lv_location_uri_6_0= RULE_STRING )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:432:1: (lv_location_uri_6_0= RULE_STRING )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:433:3: lv_location_uri_6_0= RULE_STRING
            	    {
            	    lv_location_uri_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImageDecoration1003); 

            	    			newLeafNode(lv_location_uri_6_0, grammarAccess.getImageDecorationAccess().getLocation_uriSTRINGTerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getImageDecorationRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"location_uri",
            	            		lv_location_uri_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:456:4: ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:456:4: ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:457:5: {...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleImageDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:457:112: ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:458:6: ({...}? => ( (lv_direction_7_0= ruleDirection ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:461:6: ({...}? => ( (lv_direction_7_0= ruleDirection ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:461:7: {...}? => ( (lv_direction_7_0= ruleDirection ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImageDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:461:16: ( (lv_direction_7_0= ruleDirection ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:462:1: (lv_direction_7_0= ruleDirection )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:462:1: (lv_direction_7_0= ruleDirection )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:463:3: lv_direction_7_0= ruleDirection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageDecorationAccess().getDirectionDirectionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDirection_in_ruleImageDecoration1084);
            	    lv_direction_7_0=ruleDirection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"direction",
            	            		lv_direction_7_0, 
            	            		"Direction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:486:4: ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:486:4: ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:487:5: {...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleImageDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:487:112: ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:488:6: ({...}? => ( (lv_margin_8_0= ruleMargin ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:491:6: ({...}? => ( (lv_margin_8_0= ruleMargin ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:491:7: {...}? => ( (lv_margin_8_0= ruleMargin ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImageDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:491:16: ( (lv_margin_8_0= ruleMargin ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:492:1: (lv_margin_8_0= ruleMargin )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:492:1: (lv_margin_8_0= ruleMargin )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:493:3: lv_margin_8_0= ruleMargin
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageDecorationAccess().getMarginMarginParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMargin_in_ruleImageDecoration1159);
            	    lv_margin_8_0=ruleMargin();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"margin",
            	            		lv_margin_8_0, 
            	            		"Margin");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:516:4: ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:516:4: ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:517:5: {...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleImageDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:517:112: ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:518:6: ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:521:6: ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:521:7: {...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImageDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:521:16: (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:521:18: otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) )
            	    {
            	    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleImageDecoration1226); 

            	        	newLeafNode(otherlv_9, grammarAccess.getImageDecorationAccess().getTooltipKeyword_3_3_0());
            	        
            	    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleImageDecoration1238); 

            	        	newLeafNode(otherlv_10, grammarAccess.getImageDecorationAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:529:1: ( (lv_tooltip_11_0= ruleText ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:530:1: (lv_tooltip_11_0= ruleText )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:530:1: (lv_tooltip_11_0= ruleText )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:531:3: lv_tooltip_11_0= ruleText
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageDecorationAccess().getTooltipTextParserRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleText_in_ruleImageDecoration1259);
            	    lv_tooltip_11_0=ruleText();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"tooltip",
            	            		lv_tooltip_11_0, 
            	            		"Text");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:554:4: ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:554:4: ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:555:5: {...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleImageDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:555:112: ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:556:6: ({...}? => ( (lv_activation_12_0= ruleActivation ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:559:6: ({...}? => ( (lv_activation_12_0= ruleActivation ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:559:7: {...}? => ( (lv_activation_12_0= ruleActivation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImageDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:559:16: ( (lv_activation_12_0= ruleActivation ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:560:1: (lv_activation_12_0= ruleActivation )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:560:1: (lv_activation_12_0= ruleActivation )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:561:3: lv_activation_12_0= ruleActivation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageDecorationAccess().getActivationActivationParserRuleCall_3_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivation_in_ruleImageDecoration1335);
            	    lv_activation_12_0=ruleActivation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImageDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"activation",
            	            		lv_activation_12_0, 
            	            		"Activation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleImageDecoration", "getUnorderedGroupHelper().canLeave(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3());
            	

            }

            otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleImageDecoration1393); 

                	newLeafNode(otherlv_13, grammarAccess.getImageDecorationAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImageDecoration"


    // $ANTLR start "entryRuleBoxDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:604:1: entryRuleBoxDecoration returns [EObject current=null] : iv_ruleBoxDecoration= ruleBoxDecoration EOF ;
    public final EObject entryRuleBoxDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoxDecoration = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:605:2: (iv_ruleBoxDecoration= ruleBoxDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:606:2: iv_ruleBoxDecoration= ruleBoxDecoration EOF
            {
             newCompositeNode(grammarAccess.getBoxDecorationRule()); 
            pushFollow(FOLLOW_ruleBoxDecoration_in_entryRuleBoxDecoration1429);
            iv_ruleBoxDecoration=ruleBoxDecoration();

            state._fsp--;

             current =iv_ruleBoxDecoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoxDecoration1439); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoxDecoration"


    // $ANTLR start "ruleBoxDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:613:1: ruleBoxDecoration returns [EObject current=null] : ( () otherlv_1= 'box' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'text' otherlv_5= '=' ( (lv_text_6_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= '=' ( (lv_widht_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= '=' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_13_0= ruleBoxImage ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'border' otherlv_15= '{' ( (lv_border_16_0= ruleBorder ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'foreground-color' otherlv_19= '=' ( (lv_foregroundColor_20_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'background-color' otherlv_22= '=' ( (lv_backgroundColor_23_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_24_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_25_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'content-direction' otherlv_27= '=' ( (lv_contentDirection_28_0= ruleDirections ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'tooltip' otherlv_30= '=' ( (lv_tooltip_31_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_32_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_33= '}' ) ;
    public final EObject ruleBoxDecoration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_widht_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_height_12_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_33=null;
        EObject lv_text_6_0 = null;

        EObject lv_image_13_0 = null;

        EObject lv_border_16_0 = null;

        EObject lv_foregroundColor_20_0 = null;

        EObject lv_backgroundColor_23_0 = null;

        EObject lv_direction_24_0 = null;

        EObject lv_margin_25_0 = null;

        Enumerator lv_contentDirection_28_0 = null;

        EObject lv_tooltip_31_0 = null;

        EObject lv_activation_32_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:616:28: ( ( () otherlv_1= 'box' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'text' otherlv_5= '=' ( (lv_text_6_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= '=' ( (lv_widht_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= '=' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_13_0= ruleBoxImage ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'border' otherlv_15= '{' ( (lv_border_16_0= ruleBorder ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'foreground-color' otherlv_19= '=' ( (lv_foregroundColor_20_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'background-color' otherlv_22= '=' ( (lv_backgroundColor_23_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_24_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_25_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'content-direction' otherlv_27= '=' ( (lv_contentDirection_28_0= ruleDirections ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'tooltip' otherlv_30= '=' ( (lv_tooltip_31_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_32_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_33= '}' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:617:1: ( () otherlv_1= 'box' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'text' otherlv_5= '=' ( (lv_text_6_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= '=' ( (lv_widht_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= '=' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_13_0= ruleBoxImage ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'border' otherlv_15= '{' ( (lv_border_16_0= ruleBorder ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'foreground-color' otherlv_19= '=' ( (lv_foregroundColor_20_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'background-color' otherlv_22= '=' ( (lv_backgroundColor_23_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_24_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_25_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'content-direction' otherlv_27= '=' ( (lv_contentDirection_28_0= ruleDirections ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'tooltip' otherlv_30= '=' ( (lv_tooltip_31_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_32_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_33= '}' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:617:1: ( () otherlv_1= 'box' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'text' otherlv_5= '=' ( (lv_text_6_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= '=' ( (lv_widht_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= '=' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_13_0= ruleBoxImage ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'border' otherlv_15= '{' ( (lv_border_16_0= ruleBorder ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'foreground-color' otherlv_19= '=' ( (lv_foregroundColor_20_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'background-color' otherlv_22= '=' ( (lv_backgroundColor_23_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_24_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_25_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'content-direction' otherlv_27= '=' ( (lv_contentDirection_28_0= ruleDirections ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'tooltip' otherlv_30= '=' ( (lv_tooltip_31_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_32_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_33= '}' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:617:2: () otherlv_1= 'box' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'text' otherlv_5= '=' ( (lv_text_6_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= '=' ( (lv_widht_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= '=' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_13_0= ruleBoxImage ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'border' otherlv_15= '{' ( (lv_border_16_0= ruleBorder ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'foreground-color' otherlv_19= '=' ( (lv_foregroundColor_20_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'background-color' otherlv_22= '=' ( (lv_backgroundColor_23_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_24_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_25_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'content-direction' otherlv_27= '=' ( (lv_contentDirection_28_0= ruleDirections ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'tooltip' otherlv_30= '=' ( (lv_tooltip_31_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_32_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_33= '}'
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:617:2: ()
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:618:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBoxDecorationAccess().getBoxDecorationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleBoxDecoration1485); 

                	newLeafNode(otherlv_1, grammarAccess.getBoxDecorationAccess().getBoxKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleBoxDecoration1497); 

                	newLeafNode(otherlv_2, grammarAccess.getBoxDecorationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:631:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'text' otherlv_5= '=' ( (lv_text_6_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= '=' ( (lv_widht_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= '=' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_13_0= ruleBoxImage ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'border' otherlv_15= '{' ( (lv_border_16_0= ruleBorder ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'foreground-color' otherlv_19= '=' ( (lv_foregroundColor_20_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'background-color' otherlv_22= '=' ( (lv_backgroundColor_23_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_24_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_25_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'content-direction' otherlv_27= '=' ( (lv_contentDirection_28_0= ruleDirections ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'tooltip' otherlv_30= '=' ( (lv_tooltip_31_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_32_0= ruleActivation ) ) ) ) ) )+ {...}?) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:633:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'text' otherlv_5= '=' ( (lv_text_6_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= '=' ( (lv_widht_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= '=' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_13_0= ruleBoxImage ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'border' otherlv_15= '{' ( (lv_border_16_0= ruleBorder ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'foreground-color' otherlv_19= '=' ( (lv_foregroundColor_20_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'background-color' otherlv_22= '=' ( (lv_backgroundColor_23_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_24_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_25_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'content-direction' otherlv_27= '=' ( (lv_contentDirection_28_0= ruleDirections ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'tooltip' otherlv_30= '=' ( (lv_tooltip_31_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_32_0= ruleActivation ) ) ) ) ) )+ {...}?) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:633:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'text' otherlv_5= '=' ( (lv_text_6_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= '=' ( (lv_widht_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= '=' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_13_0= ruleBoxImage ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'border' otherlv_15= '{' ( (lv_border_16_0= ruleBorder ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'foreground-color' otherlv_19= '=' ( (lv_foregroundColor_20_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'background-color' otherlv_22= '=' ( (lv_backgroundColor_23_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_24_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_25_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'content-direction' otherlv_27= '=' ( (lv_contentDirection_28_0= ruleDirections ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'tooltip' otherlv_30= '=' ( (lv_tooltip_31_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_32_0= ruleActivation ) ) ) ) ) )+ {...}?) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:634:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'text' otherlv_5= '=' ( (lv_text_6_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= '=' ( (lv_widht_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= '=' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_13_0= ruleBoxImage ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'border' otherlv_15= '{' ( (lv_border_16_0= ruleBorder ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'foreground-color' otherlv_19= '=' ( (lv_foregroundColor_20_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'background-color' otherlv_22= '=' ( (lv_backgroundColor_23_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_24_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_25_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'content-direction' otherlv_27= '=' ( (lv_contentDirection_28_0= ruleDirections ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'tooltip' otherlv_30= '=' ( (lv_tooltip_31_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_32_0= ruleActivation ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3());
            	
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:637:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'text' otherlv_5= '=' ( (lv_text_6_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= '=' ( (lv_widht_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= '=' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_13_0= ruleBoxImage ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'border' otherlv_15= '{' ( (lv_border_16_0= ruleBorder ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'foreground-color' otherlv_19= '=' ( (lv_foregroundColor_20_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'background-color' otherlv_22= '=' ( (lv_backgroundColor_23_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_24_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_25_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'content-direction' otherlv_27= '=' ( (lv_contentDirection_28_0= ruleDirections ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'tooltip' otherlv_30= '=' ( (lv_tooltip_31_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_32_0= ruleActivation ) ) ) ) ) )+ {...}?)
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:638:3: ( ({...}? => ( ({...}? => (otherlv_4= 'text' otherlv_5= '=' ( (lv_text_6_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= '=' ( (lv_widht_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= '=' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_13_0= ruleBoxImage ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'border' otherlv_15= '{' ( (lv_border_16_0= ruleBorder ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'foreground-color' otherlv_19= '=' ( (lv_foregroundColor_20_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'background-color' otherlv_22= '=' ( (lv_backgroundColor_23_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_24_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_25_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'content-direction' otherlv_27= '=' ( (lv_contentDirection_28_0= ruleDirections ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'tooltip' otherlv_30= '=' ( (lv_tooltip_31_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_32_0= ruleActivation ) ) ) ) ) )+ {...}?
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:638:3: ( ({...}? => ( ({...}? => (otherlv_4= 'text' otherlv_5= '=' ( (lv_text_6_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= '=' ( (lv_widht_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= '=' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_13_0= ruleBoxImage ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'border' otherlv_15= '{' ( (lv_border_16_0= ruleBorder ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'foreground-color' otherlv_19= '=' ( (lv_foregroundColor_20_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'background-color' otherlv_22= '=' ( (lv_backgroundColor_23_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_24_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_25_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'content-direction' otherlv_27= '=' ( (lv_contentDirection_28_0= ruleDirections ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'tooltip' otherlv_30= '=' ( (lv_tooltip_31_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_32_0= ruleActivation ) ) ) ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=13;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:640:4: ({...}? => ( ({...}? => (otherlv_4= 'text' otherlv_5= '=' ( (lv_text_6_0= ruleText ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:640:4: ({...}? => ( ({...}? => (otherlv_4= 'text' otherlv_5= '=' ( (lv_text_6_0= ruleText ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:641:5: {...}? => ( ({...}? => (otherlv_4= 'text' otherlv_5= '=' ( (lv_text_6_0= ruleText ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:641:110: ( ({...}? => (otherlv_4= 'text' otherlv_5= '=' ( (lv_text_6_0= ruleText ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:642:6: ({...}? => (otherlv_4= 'text' otherlv_5= '=' ( (lv_text_6_0= ruleText ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:645:6: ({...}? => (otherlv_4= 'text' otherlv_5= '=' ( (lv_text_6_0= ruleText ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:645:7: {...}? => (otherlv_4= 'text' otherlv_5= '=' ( (lv_text_6_0= ruleText ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:645:16: (otherlv_4= 'text' otherlv_5= '=' ( (lv_text_6_0= ruleText ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:645:18: otherlv_4= 'text' otherlv_5= '=' ( (lv_text_6_0= ruleText ) )
            	    {
            	    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleBoxDecoration1555); 

            	        	newLeafNode(otherlv_4, grammarAccess.getBoxDecorationAccess().getTextKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleBoxDecoration1567); 

            	        	newLeafNode(otherlv_5, grammarAccess.getBoxDecorationAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:653:1: ( (lv_text_6_0= ruleText ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:654:1: (lv_text_6_0= ruleText )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:654:1: (lv_text_6_0= ruleText )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:655:3: lv_text_6_0= ruleText
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBoxDecorationAccess().getTextTextParserRuleCall_3_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleText_in_ruleBoxDecoration1588);
            	    lv_text_6_0=ruleText();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBoxDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"text",
            	            		lv_text_6_0, 
            	            		"Text");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:678:4: ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= '=' ( (lv_widht_9_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:678:4: ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= '=' ( (lv_widht_9_0= RULE_INT ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:679:5: {...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= '=' ( (lv_widht_9_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:679:110: ( ({...}? => (otherlv_7= 'width' otherlv_8= '=' ( (lv_widht_9_0= RULE_INT ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:680:6: ({...}? => (otherlv_7= 'width' otherlv_8= '=' ( (lv_widht_9_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:683:6: ({...}? => (otherlv_7= 'width' otherlv_8= '=' ( (lv_widht_9_0= RULE_INT ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:683:7: {...}? => (otherlv_7= 'width' otherlv_8= '=' ( (lv_widht_9_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:683:16: (otherlv_7= 'width' otherlv_8= '=' ( (lv_widht_9_0= RULE_INT ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:683:18: otherlv_7= 'width' otherlv_8= '=' ( (lv_widht_9_0= RULE_INT ) )
            	    {
            	    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleBoxDecoration1656); 

            	        	newLeafNode(otherlv_7, grammarAccess.getBoxDecorationAccess().getWidthKeyword_3_1_0());
            	        
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleBoxDecoration1668); 

            	        	newLeafNode(otherlv_8, grammarAccess.getBoxDecorationAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:691:1: ( (lv_widht_9_0= RULE_INT ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:692:1: (lv_widht_9_0= RULE_INT )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:692:1: (lv_widht_9_0= RULE_INT )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:693:3: lv_widht_9_0= RULE_INT
            	    {
            	    lv_widht_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBoxDecoration1685); 

            	    			newLeafNode(lv_widht_9_0, grammarAccess.getBoxDecorationAccess().getWidhtINTTerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getBoxDecorationRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"widht",
            	            		lv_widht_9_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:716:4: ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= '=' ( (lv_height_12_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:716:4: ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= '=' ( (lv_height_12_0= RULE_INT ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:717:5: {...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= '=' ( (lv_height_12_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:717:110: ( ({...}? => (otherlv_10= 'height' otherlv_11= '=' ( (lv_height_12_0= RULE_INT ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:718:6: ({...}? => (otherlv_10= 'height' otherlv_11= '=' ( (lv_height_12_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:721:6: ({...}? => (otherlv_10= 'height' otherlv_11= '=' ( (lv_height_12_0= RULE_INT ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:721:7: {...}? => (otherlv_10= 'height' otherlv_11= '=' ( (lv_height_12_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:721:16: (otherlv_10= 'height' otherlv_11= '=' ( (lv_height_12_0= RULE_INT ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:721:18: otherlv_10= 'height' otherlv_11= '=' ( (lv_height_12_0= RULE_INT ) )
            	    {
            	    otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleBoxDecoration1758); 

            	        	newLeafNode(otherlv_10, grammarAccess.getBoxDecorationAccess().getHeightKeyword_3_2_0());
            	        
            	    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleBoxDecoration1770); 

            	        	newLeafNode(otherlv_11, grammarAccess.getBoxDecorationAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:729:1: ( (lv_height_12_0= RULE_INT ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:730:1: (lv_height_12_0= RULE_INT )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:730:1: (lv_height_12_0= RULE_INT )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:731:3: lv_height_12_0= RULE_INT
            	    {
            	    lv_height_12_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBoxDecoration1787); 

            	    			newLeafNode(lv_height_12_0, grammarAccess.getBoxDecorationAccess().getHeightINTTerminalRuleCall_3_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getBoxDecorationRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"height",
            	            		lv_height_12_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:754:4: ({...}? => ( ({...}? => ( (lv_image_13_0= ruleBoxImage ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:754:4: ({...}? => ( ({...}? => ( (lv_image_13_0= ruleBoxImage ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:755:5: {...}? => ( ({...}? => ( (lv_image_13_0= ruleBoxImage ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:755:110: ( ({...}? => ( (lv_image_13_0= ruleBoxImage ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:756:6: ({...}? => ( (lv_image_13_0= ruleBoxImage ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:759:6: ({...}? => ( (lv_image_13_0= ruleBoxImage ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:759:7: {...}? => ( (lv_image_13_0= ruleBoxImage ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:759:16: ( (lv_image_13_0= ruleBoxImage ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:760:1: (lv_image_13_0= ruleBoxImage )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:760:1: (lv_image_13_0= ruleBoxImage )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:761:3: lv_image_13_0= ruleBoxImage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBoxDecorationAccess().getImageBoxImageParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBoxImage_in_ruleBoxDecoration1868);
            	    lv_image_13_0=ruleBoxImage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBoxDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"image",
            	            		lv_image_13_0, 
            	            		"BoxImage");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:784:4: ({...}? => ( ({...}? => (otherlv_14= 'border' otherlv_15= '{' ( (lv_border_16_0= ruleBorder ) ) otherlv_17= '}' ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:784:4: ({...}? => ( ({...}? => (otherlv_14= 'border' otherlv_15= '{' ( (lv_border_16_0= ruleBorder ) ) otherlv_17= '}' ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:785:5: {...}? => ( ({...}? => (otherlv_14= 'border' otherlv_15= '{' ( (lv_border_16_0= ruleBorder ) ) otherlv_17= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:785:110: ( ({...}? => (otherlv_14= 'border' otherlv_15= '{' ( (lv_border_16_0= ruleBorder ) ) otherlv_17= '}' ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:786:6: ({...}? => (otherlv_14= 'border' otherlv_15= '{' ( (lv_border_16_0= ruleBorder ) ) otherlv_17= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:789:6: ({...}? => (otherlv_14= 'border' otherlv_15= '{' ( (lv_border_16_0= ruleBorder ) ) otherlv_17= '}' ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:789:7: {...}? => (otherlv_14= 'border' otherlv_15= '{' ( (lv_border_16_0= ruleBorder ) ) otherlv_17= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:789:16: (otherlv_14= 'border' otherlv_15= '{' ( (lv_border_16_0= ruleBorder ) ) otherlv_17= '}' )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:789:18: otherlv_14= 'border' otherlv_15= '{' ( (lv_border_16_0= ruleBorder ) ) otherlv_17= '}'
            	    {
            	    otherlv_14=(Token)match(input,26,FOLLOW_26_in_ruleBoxDecoration1935); 

            	        	newLeafNode(otherlv_14, grammarAccess.getBoxDecorationAccess().getBorderKeyword_3_4_0());
            	        
            	    otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleBoxDecoration1947); 

            	        	newLeafNode(otherlv_15, grammarAccess.getBoxDecorationAccess().getLeftCurlyBracketKeyword_3_4_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:797:1: ( (lv_border_16_0= ruleBorder ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:798:1: (lv_border_16_0= ruleBorder )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:798:1: (lv_border_16_0= ruleBorder )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:799:3: lv_border_16_0= ruleBorder
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBoxDecorationAccess().getBorderBorderParserRuleCall_3_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBorder_in_ruleBoxDecoration1968);
            	    lv_border_16_0=ruleBorder();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBoxDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"border",
            	            		lv_border_16_0, 
            	            		"Border");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_17=(Token)match(input,17,FOLLOW_17_in_ruleBoxDecoration1980); 

            	        	newLeafNode(otherlv_17, grammarAccess.getBoxDecorationAccess().getRightCurlyBracketKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:826:4: ({...}? => ( ({...}? => (otherlv_18= 'foreground-color' otherlv_19= '=' ( (lv_foregroundColor_20_0= ruleColor ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:826:4: ({...}? => ( ({...}? => (otherlv_18= 'foreground-color' otherlv_19= '=' ( (lv_foregroundColor_20_0= ruleColor ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:827:5: {...}? => ( ({...}? => (otherlv_18= 'foreground-color' otherlv_19= '=' ( (lv_foregroundColor_20_0= ruleColor ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:827:110: ( ({...}? => (otherlv_18= 'foreground-color' otherlv_19= '=' ( (lv_foregroundColor_20_0= ruleColor ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:828:6: ({...}? => (otherlv_18= 'foreground-color' otherlv_19= '=' ( (lv_foregroundColor_20_0= ruleColor ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:831:6: ({...}? => (otherlv_18= 'foreground-color' otherlv_19= '=' ( (lv_foregroundColor_20_0= ruleColor ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:831:7: {...}? => (otherlv_18= 'foreground-color' otherlv_19= '=' ( (lv_foregroundColor_20_0= ruleColor ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:831:16: (otherlv_18= 'foreground-color' otherlv_19= '=' ( (lv_foregroundColor_20_0= ruleColor ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:831:18: otherlv_18= 'foreground-color' otherlv_19= '=' ( (lv_foregroundColor_20_0= ruleColor ) )
            	    {
            	    otherlv_18=(Token)match(input,27,FOLLOW_27_in_ruleBoxDecoration2048); 

            	        	newLeafNode(otherlv_18, grammarAccess.getBoxDecorationAccess().getForegroundColorKeyword_3_5_0());
            	        
            	    otherlv_19=(Token)match(input,20,FOLLOW_20_in_ruleBoxDecoration2060); 

            	        	newLeafNode(otherlv_19, grammarAccess.getBoxDecorationAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:839:1: ( (lv_foregroundColor_20_0= ruleColor ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:840:1: (lv_foregroundColor_20_0= ruleColor )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:840:1: (lv_foregroundColor_20_0= ruleColor )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:841:3: lv_foregroundColor_20_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBoxDecorationAccess().getForegroundColorColorParserRuleCall_3_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleBoxDecoration2081);
            	    lv_foregroundColor_20_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBoxDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"foregroundColor",
            	            		lv_foregroundColor_20_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:864:4: ({...}? => ( ({...}? => (otherlv_21= 'background-color' otherlv_22= '=' ( (lv_backgroundColor_23_0= ruleColor ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:864:4: ({...}? => ( ({...}? => (otherlv_21= 'background-color' otherlv_22= '=' ( (lv_backgroundColor_23_0= ruleColor ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:865:5: {...}? => ( ({...}? => (otherlv_21= 'background-color' otherlv_22= '=' ( (lv_backgroundColor_23_0= ruleColor ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:865:110: ( ({...}? => (otherlv_21= 'background-color' otherlv_22= '=' ( (lv_backgroundColor_23_0= ruleColor ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:866:6: ({...}? => (otherlv_21= 'background-color' otherlv_22= '=' ( (lv_backgroundColor_23_0= ruleColor ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:869:6: ({...}? => (otherlv_21= 'background-color' otherlv_22= '=' ( (lv_backgroundColor_23_0= ruleColor ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:869:7: {...}? => (otherlv_21= 'background-color' otherlv_22= '=' ( (lv_backgroundColor_23_0= ruleColor ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:869:16: (otherlv_21= 'background-color' otherlv_22= '=' ( (lv_backgroundColor_23_0= ruleColor ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:869:18: otherlv_21= 'background-color' otherlv_22= '=' ( (lv_backgroundColor_23_0= ruleColor ) )
            	    {
            	    otherlv_21=(Token)match(input,28,FOLLOW_28_in_ruleBoxDecoration2149); 

            	        	newLeafNode(otherlv_21, grammarAccess.getBoxDecorationAccess().getBackgroundColorKeyword_3_6_0());
            	        
            	    otherlv_22=(Token)match(input,20,FOLLOW_20_in_ruleBoxDecoration2161); 

            	        	newLeafNode(otherlv_22, grammarAccess.getBoxDecorationAccess().getEqualsSignKeyword_3_6_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:877:1: ( (lv_backgroundColor_23_0= ruleColor ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:878:1: (lv_backgroundColor_23_0= ruleColor )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:878:1: (lv_backgroundColor_23_0= ruleColor )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:879:3: lv_backgroundColor_23_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBoxDecorationAccess().getBackgroundColorColorParserRuleCall_3_6_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleBoxDecoration2182);
            	    lv_backgroundColor_23_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBoxDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"backgroundColor",
            	            		lv_backgroundColor_23_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:902:4: ({...}? => ( ({...}? => ( (lv_direction_24_0= ruleDirection ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:902:4: ({...}? => ( ({...}? => ( (lv_direction_24_0= ruleDirection ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:903:5: {...}? => ( ({...}? => ( (lv_direction_24_0= ruleDirection ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:903:110: ( ({...}? => ( (lv_direction_24_0= ruleDirection ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:904:6: ({...}? => ( (lv_direction_24_0= ruleDirection ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 7);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:907:6: ({...}? => ( (lv_direction_24_0= ruleDirection ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:907:7: {...}? => ( (lv_direction_24_0= ruleDirection ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:907:16: ( (lv_direction_24_0= ruleDirection ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:908:1: (lv_direction_24_0= ruleDirection )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:908:1: (lv_direction_24_0= ruleDirection )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:909:3: lv_direction_24_0= ruleDirection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBoxDecorationAccess().getDirectionDirectionParserRuleCall_3_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDirection_in_ruleBoxDecoration2258);
            	    lv_direction_24_0=ruleDirection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBoxDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"direction",
            	            		lv_direction_24_0, 
            	            		"Direction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:932:4: ({...}? => ( ({...}? => ( (lv_margin_25_0= ruleMargin ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:932:4: ({...}? => ( ({...}? => ( (lv_margin_25_0= ruleMargin ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:933:5: {...}? => ( ({...}? => ( (lv_margin_25_0= ruleMargin ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:933:110: ( ({...}? => ( (lv_margin_25_0= ruleMargin ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:934:6: ({...}? => ( (lv_margin_25_0= ruleMargin ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 8);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:937:6: ({...}? => ( (lv_margin_25_0= ruleMargin ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:937:7: {...}? => ( (lv_margin_25_0= ruleMargin ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:937:16: ( (lv_margin_25_0= ruleMargin ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:938:1: (lv_margin_25_0= ruleMargin )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:938:1: (lv_margin_25_0= ruleMargin )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:939:3: lv_margin_25_0= ruleMargin
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBoxDecorationAccess().getMarginMarginParserRuleCall_3_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMargin_in_ruleBoxDecoration2333);
            	    lv_margin_25_0=ruleMargin();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBoxDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"margin",
            	            		lv_margin_25_0, 
            	            		"Margin");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:962:4: ({...}? => ( ({...}? => (otherlv_26= 'content-direction' otherlv_27= '=' ( (lv_contentDirection_28_0= ruleDirections ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:962:4: ({...}? => ( ({...}? => (otherlv_26= 'content-direction' otherlv_27= '=' ( (lv_contentDirection_28_0= ruleDirections ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:963:5: {...}? => ( ({...}? => (otherlv_26= 'content-direction' otherlv_27= '=' ( (lv_contentDirection_28_0= ruleDirections ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:963:110: ( ({...}? => (otherlv_26= 'content-direction' otherlv_27= '=' ( (lv_contentDirection_28_0= ruleDirections ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:964:6: ({...}? => (otherlv_26= 'content-direction' otherlv_27= '=' ( (lv_contentDirection_28_0= ruleDirections ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 9);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:967:6: ({...}? => (otherlv_26= 'content-direction' otherlv_27= '=' ( (lv_contentDirection_28_0= ruleDirections ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:967:7: {...}? => (otherlv_26= 'content-direction' otherlv_27= '=' ( (lv_contentDirection_28_0= ruleDirections ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:967:16: (otherlv_26= 'content-direction' otherlv_27= '=' ( (lv_contentDirection_28_0= ruleDirections ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:967:18: otherlv_26= 'content-direction' otherlv_27= '=' ( (lv_contentDirection_28_0= ruleDirections ) )
            	    {
            	    otherlv_26=(Token)match(input,29,FOLLOW_29_in_ruleBoxDecoration2400); 

            	        	newLeafNode(otherlv_26, grammarAccess.getBoxDecorationAccess().getContentDirectionKeyword_3_9_0());
            	        
            	    otherlv_27=(Token)match(input,20,FOLLOW_20_in_ruleBoxDecoration2412); 

            	        	newLeafNode(otherlv_27, grammarAccess.getBoxDecorationAccess().getEqualsSignKeyword_3_9_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:975:1: ( (lv_contentDirection_28_0= ruleDirections ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:976:1: (lv_contentDirection_28_0= ruleDirections )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:976:1: (lv_contentDirection_28_0= ruleDirections )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:977:3: lv_contentDirection_28_0= ruleDirections
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBoxDecorationAccess().getContentDirectionDirectionsEnumRuleCall_3_9_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDirections_in_ruleBoxDecoration2433);
            	    lv_contentDirection_28_0=ruleDirections();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBoxDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"contentDirection",
            	            		lv_contentDirection_28_0, 
            	            		"Directions");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1000:4: ({...}? => ( ({...}? => (otherlv_29= 'tooltip' otherlv_30= '=' ( (lv_tooltip_31_0= ruleText ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1000:4: ({...}? => ( ({...}? => (otherlv_29= 'tooltip' otherlv_30= '=' ( (lv_tooltip_31_0= ruleText ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1001:5: {...}? => ( ({...}? => (otherlv_29= 'tooltip' otherlv_30= '=' ( (lv_tooltip_31_0= ruleText ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1001:111: ( ({...}? => (otherlv_29= 'tooltip' otherlv_30= '=' ( (lv_tooltip_31_0= ruleText ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1002:6: ({...}? => (otherlv_29= 'tooltip' otherlv_30= '=' ( (lv_tooltip_31_0= ruleText ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 10);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1005:6: ({...}? => (otherlv_29= 'tooltip' otherlv_30= '=' ( (lv_tooltip_31_0= ruleText ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1005:7: {...}? => (otherlv_29= 'tooltip' otherlv_30= '=' ( (lv_tooltip_31_0= ruleText ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1005:16: (otherlv_29= 'tooltip' otherlv_30= '=' ( (lv_tooltip_31_0= ruleText ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1005:18: otherlv_29= 'tooltip' otherlv_30= '=' ( (lv_tooltip_31_0= ruleText ) )
            	    {
            	    otherlv_29=(Token)match(input,21,FOLLOW_21_in_ruleBoxDecoration2501); 

            	        	newLeafNode(otherlv_29, grammarAccess.getBoxDecorationAccess().getTooltipKeyword_3_10_0());
            	        
            	    otherlv_30=(Token)match(input,20,FOLLOW_20_in_ruleBoxDecoration2513); 

            	        	newLeafNode(otherlv_30, grammarAccess.getBoxDecorationAccess().getEqualsSignKeyword_3_10_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1013:1: ( (lv_tooltip_31_0= ruleText ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1014:1: (lv_tooltip_31_0= ruleText )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1014:1: (lv_tooltip_31_0= ruleText )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1015:3: lv_tooltip_31_0= ruleText
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBoxDecorationAccess().getTooltipTextParserRuleCall_3_10_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleText_in_ruleBoxDecoration2534);
            	    lv_tooltip_31_0=ruleText();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBoxDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"tooltip",
            	            		lv_tooltip_31_0, 
            	            		"Text");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1038:4: ({...}? => ( ({...}? => ( (lv_activation_32_0= ruleActivation ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1038:4: ({...}? => ( ({...}? => ( (lv_activation_32_0= ruleActivation ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1039:5: {...}? => ( ({...}? => ( (lv_activation_32_0= ruleActivation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 11)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1039:111: ( ({...}? => ( (lv_activation_32_0= ruleActivation ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1040:6: ({...}? => ( (lv_activation_32_0= ruleActivation ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 11);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1043:6: ({...}? => ( (lv_activation_32_0= ruleActivation ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1043:7: {...}? => ( (lv_activation_32_0= ruleActivation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBoxDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1043:16: ( (lv_activation_32_0= ruleActivation ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1044:1: (lv_activation_32_0= ruleActivation )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1044:1: (lv_activation_32_0= ruleActivation )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1045:3: lv_activation_32_0= ruleActivation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBoxDecorationAccess().getActivationActivationParserRuleCall_3_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivation_in_ruleBoxDecoration2610);
            	    lv_activation_32_0=ruleActivation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBoxDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"activation",
            	            		lv_activation_32_0, 
            	            		"Activation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleBoxDecoration", "getUnorderedGroupHelper().canLeave(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3());
            	

            }

            otherlv_33=(Token)match(input,17,FOLLOW_17_in_ruleBoxDecoration2668); 

                	newLeafNode(otherlv_33, grammarAccess.getBoxDecorationAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoxDecoration"


    // $ANTLR start "entryRuleBorderDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1088:1: entryRuleBorderDecoration returns [EObject current=null] : iv_ruleBorderDecoration= ruleBorderDecoration EOF ;
    public final EObject entryRuleBorderDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorderDecoration = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1089:2: (iv_ruleBorderDecoration= ruleBorderDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1090:2: iv_ruleBorderDecoration= ruleBorderDecoration EOF
            {
             newCompositeNode(grammarAccess.getBorderDecorationRule()); 
            pushFollow(FOLLOW_ruleBorderDecoration_in_entryRuleBorderDecoration2704);
            iv_ruleBorderDecoration=ruleBorderDecoration();

            state._fsp--;

             current =iv_ruleBorderDecoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorderDecoration2714); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBorderDecoration"


    // $ANTLR start "ruleBorderDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1097:1: ruleBorderDecoration returns [EObject current=null] : ( () otherlv_1= 'border' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_border_4_0= ruleBorder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '}' ) ;
    public final EObject ruleBorderDecoration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_border_4_0 = null;

        EObject lv_activation_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1100:28: ( ( () otherlv_1= 'border' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_border_4_0= ruleBorder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '}' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1101:1: ( () otherlv_1= 'border' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_border_4_0= ruleBorder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '}' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1101:1: ( () otherlv_1= 'border' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_border_4_0= ruleBorder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '}' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1101:2: () otherlv_1= 'border' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_border_4_0= ruleBorder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '}'
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1101:2: ()
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1102:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBorderDecorationAccess().getBorderDecorationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleBorderDecoration2760); 

                	newLeafNode(otherlv_1, grammarAccess.getBorderDecorationAccess().getBorderKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleBorderDecoration2772); 

                	newLeafNode(otherlv_2, grammarAccess.getBorderDecorationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1115:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_border_4_0= ruleBorder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+ {...}?) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1117:1: ( ( ( ({...}? => ( ({...}? => ( (lv_border_4_0= ruleBorder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+ {...}?) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1117:1: ( ( ( ({...}? => ( ({...}? => ( (lv_border_4_0= ruleBorder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+ {...}?) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1118:2: ( ( ({...}? => ( ({...}? => ( (lv_border_4_0= ruleBorder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3());
            	
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1121:2: ( ( ({...}? => ( ({...}? => ( (lv_border_4_0= ruleBorder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+ {...}?)
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1122:3: ( ({...}? => ( ({...}? => ( (lv_border_4_0= ruleBorder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+ {...}?
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1122:3: ( ({...}? => ( ({...}? => ( (lv_border_4_0= ruleBorder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    int LA8_1 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==30|| LA8_0 >=36 && LA8_0<=37) && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 ==44 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0) ) ) {
                    int LA8_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0) ) {
                        alt8=1;
                    }
                    else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1) ) {
                        alt8=2;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1124:4: ({...}? => ( ({...}? => ( (lv_border_4_0= ruleBorder ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1124:4: ({...}? => ( ({...}? => ( (lv_border_4_0= ruleBorder ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1125:5: {...}? => ( ({...}? => ( (lv_border_4_0= ruleBorder ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBorderDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1125:113: ( ({...}? => ( (lv_border_4_0= ruleBorder ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1126:6: ({...}? => ( (lv_border_4_0= ruleBorder ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1129:6: ({...}? => ( (lv_border_4_0= ruleBorder ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1129:7: {...}? => ( (lv_border_4_0= ruleBorder ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBorderDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1129:16: ( (lv_border_4_0= ruleBorder ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1130:1: (lv_border_4_0= ruleBorder )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1130:1: (lv_border_4_0= ruleBorder )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1131:3: lv_border_4_0= ruleBorder
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBorderDecorationAccess().getBorderBorderParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBorder_in_ruleBorderDecoration2838);
            	    lv_border_4_0=ruleBorder();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBorderDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"border",
            	            		lv_border_4_0, 
            	            		"Border");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1154:4: ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1154:4: ({...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1155:5: {...}? => ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBorderDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1155:113: ( ({...}? => ( (lv_activation_5_0= ruleActivation ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1156:6: ({...}? => ( (lv_activation_5_0= ruleActivation ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1159:6: ({...}? => ( (lv_activation_5_0= ruleActivation ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1159:7: {...}? => ( (lv_activation_5_0= ruleActivation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBorderDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1159:16: ( (lv_activation_5_0= ruleActivation ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1160:1: (lv_activation_5_0= ruleActivation )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1160:1: (lv_activation_5_0= ruleActivation )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1161:3: lv_activation_5_0= ruleActivation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBorderDecorationAccess().getActivationActivationParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivation_in_ruleBorderDecoration2913);
            	    lv_activation_5_0=ruleActivation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBorderDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"activation",
            	            		lv_activation_5_0, 
            	            		"Activation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleBorderDecoration", "getUnorderedGroupHelper().canLeave(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3());
            	

            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleBorderDecoration2971); 

                	newLeafNode(otherlv_6, grammarAccess.getBorderDecorationAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBorderDecoration"


    // $ANTLR start "entryRuleColorDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1204:1: entryRuleColorDecoration returns [EObject current=null] : iv_ruleColorDecoration= ruleColorDecoration EOF ;
    public final EObject entryRuleColorDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorDecoration = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1205:2: (iv_ruleColorDecoration= ruleColorDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1206:2: iv_ruleColorDecoration= ruleColorDecoration EOF
            {
             newCompositeNode(grammarAccess.getColorDecorationRule()); 
            pushFollow(FOLLOW_ruleColorDecoration_in_entryRuleColorDecoration3007);
            iv_ruleColorDecoration=ruleColorDecoration();

            state._fsp--;

             current =iv_ruleColorDecoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorDecoration3017); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColorDecoration"


    // $ANTLR start "ruleColorDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1213:1: ruleColorDecoration returns [EObject current=null] : ( () otherlv_1= 'color' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_11= '}' ) ;
    public final EObject ruleColorDecoration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_background_6_0 = null;

        EObject lv_foreground_9_0 = null;

        EObject lv_activation_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1216:28: ( ( () otherlv_1= 'color' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_11= '}' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1217:1: ( () otherlv_1= 'color' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_11= '}' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1217:1: ( () otherlv_1= 'color' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_11= '}' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1217:2: () otherlv_1= 'color' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_11= '}'
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1217:2: ()
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1218:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getColorDecorationAccess().getColorDecorationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleColorDecoration3063); 

                	newLeafNode(otherlv_1, grammarAccess.getColorDecorationAccess().getColorKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleColorDecoration3075); 

                	newLeafNode(otherlv_2, grammarAccess.getColorDecorationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1231:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )* ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1233:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )* ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1233:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )* ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1234:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3());
            	
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1237:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )* )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1238:3: ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )*
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1238:3: ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )*
            loop9:
            do {
                int alt9=4;
                int LA9_0 = input.LA(1);

                if ( LA9_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1) ) {
                    alt9=2;
                }
                else if ( LA9_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2) ) {
                    alt9=3;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1240:4: ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1240:4: ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1241:5: {...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleColorDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1241:112: ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1242:6: ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1245:6: ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1245:7: {...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleColorDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1245:16: (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1245:18: otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) )
            	    {
            	    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleColorDecoration3133); 

            	        	newLeafNode(otherlv_4, grammarAccess.getColorDecorationAccess().getBackgroundKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleColorDecoration3145); 

            	        	newLeafNode(otherlv_5, grammarAccess.getColorDecorationAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1253:1: ( (lv_background_6_0= ruleColor ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1254:1: (lv_background_6_0= ruleColor )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1254:1: (lv_background_6_0= ruleColor )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1255:3: lv_background_6_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getColorDecorationAccess().getBackgroundColorParserRuleCall_3_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleColorDecoration3166);
            	    lv_background_6_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getColorDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"background",
            	            		lv_background_6_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1278:4: ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1278:4: ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1279:5: {...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleColorDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1279:112: ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1280:6: ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1283:6: ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1283:7: {...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleColorDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1283:16: (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1283:18: otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) )
            	    {
            	    otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleColorDecoration3234); 

            	        	newLeafNode(otherlv_7, grammarAccess.getColorDecorationAccess().getForegroundKeyword_3_1_0());
            	        
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleColorDecoration3246); 

            	        	newLeafNode(otherlv_8, grammarAccess.getColorDecorationAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1291:1: ( (lv_foreground_9_0= ruleColor ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1292:1: (lv_foreground_9_0= ruleColor )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1292:1: (lv_foreground_9_0= ruleColor )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1293:3: lv_foreground_9_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getColorDecorationAccess().getForegroundColorParserRuleCall_3_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleColorDecoration3267);
            	    lv_foreground_9_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getColorDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"foreground",
            	            		lv_foreground_9_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1316:4: ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1316:4: ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1317:5: {...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleColorDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1317:112: ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1318:6: ({...}? => ( (lv_activation_10_0= ruleActivation ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1321:6: ({...}? => ( (lv_activation_10_0= ruleActivation ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1321:7: {...}? => ( (lv_activation_10_0= ruleActivation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleColorDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1321:16: ( (lv_activation_10_0= ruleActivation ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1322:1: (lv_activation_10_0= ruleActivation )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1322:1: (lv_activation_10_0= ruleActivation )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1323:3: lv_activation_10_0= ruleActivation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getColorDecorationAccess().getActivationActivationParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivation_in_ruleColorDecoration3343);
            	    lv_activation_10_0=ruleActivation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getColorDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"activation",
            	            		lv_activation_10_0, 
            	            		"Activation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3());
            	

            }

            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleColorDecoration3395); 

                	newLeafNode(otherlv_11, grammarAccess.getColorDecorationAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColorDecoration"


    // $ANTLR start "entryRuleConnectionDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1365:1: entryRuleConnectionDecoration returns [EObject current=null] : iv_ruleConnectionDecoration= ruleConnectionDecoration EOF ;
    public final EObject entryRuleConnectionDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionDecoration = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1366:2: (iv_ruleConnectionDecoration= ruleConnectionDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1367:2: iv_ruleConnectionDecoration= ruleConnectionDecoration EOF
            {
             newCompositeNode(grammarAccess.getConnectionDecorationRule()); 
            pushFollow(FOLLOW_ruleConnectionDecoration_in_entryRuleConnectionDecoration3431);
            iv_ruleConnectionDecoration=ruleConnectionDecoration();

            state._fsp--;

             current =iv_ruleConnectionDecoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnectionDecoration3441); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnectionDecoration"


    // $ANTLR start "ruleConnectionDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1374:1: ruleConnectionDecoration returns [EObject current=null] : ( () otherlv_1= 'connection' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_13= '}' ) ;
    public final EObject ruleConnectionDecoration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        EObject lv_size_4_0 = null;

        EObject lv_style_5_0 = null;

        EObject lv_foregroundColor_8_0 = null;

        EObject lv_backgroundColor_11_0 = null;

        EObject lv_activation_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1377:28: ( ( () otherlv_1= 'connection' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_13= '}' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1378:1: ( () otherlv_1= 'connection' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_13= '}' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1378:1: ( () otherlv_1= 'connection' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_13= '}' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1378:2: () otherlv_1= 'connection' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_13= '}'
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1378:2: ()
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1379:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConnectionDecorationAccess().getConnectionDecorationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleConnectionDecoration3487); 

                	newLeafNode(otherlv_1, grammarAccess.getConnectionDecorationAccess().getConnectionKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleConnectionDecoration3499); 

                	newLeafNode(otherlv_2, grammarAccess.getConnectionDecorationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1392:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1394:1: ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1394:1: ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1395:2: ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3());
            	
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1398:2: ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1399:3: ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )*
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1399:3: ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )*
            loop10:
            do {
                int alt10=6;
                int LA10_0 = input.LA(1);

                if ( LA10_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1) ) {
                    alt10=2;
                }
                else if ( LA10_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2) ) {
                    alt10=3;
                }
                else if ( LA10_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3) ) {
                    alt10=4;
                }
                else if ( LA10_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4) ) {
                    alt10=5;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1401:4: ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1401:4: ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1402:5: {...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1402:117: ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1403:6: ({...}? => ( (lv_size_4_0= ruleSize ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1406:6: ({...}? => ( (lv_size_4_0= ruleSize ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1406:7: {...}? => ( (lv_size_4_0= ruleSize ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1406:16: ( (lv_size_4_0= ruleSize ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1407:1: (lv_size_4_0= ruleSize )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1407:1: (lv_size_4_0= ruleSize )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1408:3: lv_size_4_0= ruleSize
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectionDecorationAccess().getSizeSizeParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSize_in_ruleConnectionDecoration3565);
            	    lv_size_4_0=ruleSize();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConnectionDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"size",
            	            		lv_size_4_0, 
            	            		"Size");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1431:4: ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1431:4: ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1432:5: {...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1432:117: ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1433:6: ({...}? => ( (lv_style_5_0= ruleStyle ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1436:6: ({...}? => ( (lv_style_5_0= ruleStyle ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1436:7: {...}? => ( (lv_style_5_0= ruleStyle ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1436:16: ( (lv_style_5_0= ruleStyle ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1437:1: (lv_style_5_0= ruleStyle )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1437:1: (lv_style_5_0= ruleStyle )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1438:3: lv_style_5_0= ruleStyle
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectionDecorationAccess().getStyleStyleParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStyle_in_ruleConnectionDecoration3640);
            	    lv_style_5_0=ruleStyle();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConnectionDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"style",
            	            		lv_style_5_0, 
            	            		"Style");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1461:4: ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1461:4: ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1462:5: {...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1462:117: ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1463:6: ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1466:6: ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1466:7: {...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1466:16: (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1466:18: otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) )
            	    {
            	    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleConnectionDecoration3707); 

            	        	newLeafNode(otherlv_6, grammarAccess.getConnectionDecorationAccess().getForegroundColorKeyword_3_2_0());
            	        
            	    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleConnectionDecoration3719); 

            	        	newLeafNode(otherlv_7, grammarAccess.getConnectionDecorationAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1474:1: ( (lv_foregroundColor_8_0= ruleColor ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1475:1: (lv_foregroundColor_8_0= ruleColor )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1475:1: (lv_foregroundColor_8_0= ruleColor )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1476:3: lv_foregroundColor_8_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectionDecorationAccess().getForegroundColorColorParserRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleConnectionDecoration3740);
            	    lv_foregroundColor_8_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConnectionDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"foregroundColor",
            	            		lv_foregroundColor_8_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1499:4: ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1499:4: ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1500:5: {...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1500:117: ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1501:6: ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1504:6: ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1504:7: {...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1504:16: (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1504:18: otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) )
            	    {
            	    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleConnectionDecoration3808); 

            	        	newLeafNode(otherlv_9, grammarAccess.getConnectionDecorationAccess().getBackgroundColorKeyword_3_3_0());
            	        
            	    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleConnectionDecoration3820); 

            	        	newLeafNode(otherlv_10, grammarAccess.getConnectionDecorationAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1512:1: ( (lv_backgroundColor_11_0= ruleColor ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1513:1: (lv_backgroundColor_11_0= ruleColor )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1513:1: (lv_backgroundColor_11_0= ruleColor )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1514:3: lv_backgroundColor_11_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectionDecorationAccess().getBackgroundColorColorParserRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleConnectionDecoration3841);
            	    lv_backgroundColor_11_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConnectionDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"backgroundColor",
            	            		lv_backgroundColor_11_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1537:4: ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1537:4: ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1538:5: {...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1538:117: ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1539:6: ({...}? => ( (lv_activation_12_0= ruleActivation ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1542:6: ({...}? => ( (lv_activation_12_0= ruleActivation ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1542:7: {...}? => ( (lv_activation_12_0= ruleActivation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1542:16: ( (lv_activation_12_0= ruleActivation ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1543:1: (lv_activation_12_0= ruleActivation )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1543:1: (lv_activation_12_0= ruleActivation )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1544:3: lv_activation_12_0= ruleActivation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectionDecorationAccess().getActivationActivationParserRuleCall_3_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivation_in_ruleConnectionDecoration3917);
            	    lv_activation_12_0=ruleActivation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConnectionDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"activation",
            	            		lv_activation_12_0, 
            	            		"Activation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3());
            	

            }

            otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleConnectionDecoration3969); 

                	newLeafNode(otherlv_13, grammarAccess.getConnectionDecorationAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnectionDecoration"


    // $ANTLR start "entryRuleText"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1586:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1587:2: (iv_ruleText= ruleText EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1588:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText4005);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText4015); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1595:1: ruleText returns [EObject current=null] : (this_SimpleText_0= ruleSimpleText | this_ComplexText_1= ruleComplexText ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleText_0 = null;

        EObject this_ComplexText_1 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1598:28: ( (this_SimpleText_0= ruleSimpleText | this_ComplexText_1= ruleComplexText ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1599:1: (this_SimpleText_0= ruleSimpleText | this_ComplexText_1= ruleComplexText )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1599:1: (this_SimpleText_0= ruleSimpleText | this_ComplexText_1= ruleComplexText )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1600:5: this_SimpleText_0= ruleSimpleText
                    {
                     
                            newCompositeNode(grammarAccess.getTextAccess().getSimpleTextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleText_in_ruleText4062);
                    this_SimpleText_0=ruleSimpleText();

                    state._fsp--;

                     
                            current = this_SimpleText_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1610:5: this_ComplexText_1= ruleComplexText
                    {
                     
                            newCompositeNode(grammarAccess.getTextAccess().getComplexTextParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComplexText_in_ruleText4089);
                    this_ComplexText_1=ruleComplexText();

                    state._fsp--;

                     
                            current = this_ComplexText_1; 
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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleSimpleText"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1626:1: entryRuleSimpleText returns [EObject current=null] : iv_ruleSimpleText= ruleSimpleText EOF ;
    public final EObject entryRuleSimpleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleText = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1627:2: (iv_ruleSimpleText= ruleSimpleText EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1628:2: iv_ruleSimpleText= ruleSimpleText EOF
            {
             newCompositeNode(grammarAccess.getSimpleTextRule()); 
            pushFollow(FOLLOW_ruleSimpleText_in_entryRuleSimpleText4124);
            iv_ruleSimpleText=ruleSimpleText();

            state._fsp--;

             current =iv_ruleSimpleText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleText4134); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleText"


    // $ANTLR start "ruleSimpleText"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1635:1: ruleSimpleText returns [EObject current=null] : ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleSimpleText() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1638:28: ( ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( ruleQualifiedName ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1639:1: ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( ruleQualifiedName ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1639:1: ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( ruleQualifiedName ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1639:2: ( (lv_text_0_0= RULE_STRING ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1639:2: ( (lv_text_0_0= RULE_STRING ) )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1640:1: (lv_text_0_0= RULE_STRING )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1640:1: (lv_text_0_0= RULE_STRING )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1641:3: lv_text_0_0= RULE_STRING
                    {
                    lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleText4176); 

                    			newLeafNode(lv_text_0_0, grammarAccess.getSimpleTextAccess().getTextSTRINGTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleTextRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_0_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1658:6: ( ( ruleQualifiedName ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1658:6: ( ( ruleQualifiedName ) )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1659:1: ( ruleQualifiedName )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1659:1: ( ruleQualifiedName )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1660:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleTextRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSimpleTextAccess().getAttributeEAttributeCrossReference_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSimpleText4210);
                    ruleQualifiedName();

                    state._fsp--;

                     
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
    // $ANTLR end "ruleSimpleText"


    // $ANTLR start "entryRuleComplexText"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1681:1: entryRuleComplexText returns [EObject current=null] : iv_ruleComplexText= ruleComplexText EOF ;
    public final EObject entryRuleComplexText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexText = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1682:2: (iv_ruleComplexText= ruleComplexText EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1683:2: iv_ruleComplexText= ruleComplexText EOF
            {
             newCompositeNode(grammarAccess.getComplexTextRule()); 
            pushFollow(FOLLOW_ruleComplexText_in_entryRuleComplexText4246);
            iv_ruleComplexText=ruleComplexText();

            state._fsp--;

             current =iv_ruleComplexText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexText4256); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexText"


    // $ANTLR start "ruleComplexText"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1690:1: ruleComplexText returns [EObject current=null] : ( ( (lv_left_0_0= ruleSimpleText ) ) otherlv_1= '+' ( (lv_right_2_0= ruleText ) ) ) ;
    public final EObject ruleComplexText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1693:28: ( ( ( (lv_left_0_0= ruleSimpleText ) ) otherlv_1= '+' ( (lv_right_2_0= ruleText ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1694:1: ( ( (lv_left_0_0= ruleSimpleText ) ) otherlv_1= '+' ( (lv_right_2_0= ruleText ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1694:1: ( ( (lv_left_0_0= ruleSimpleText ) ) otherlv_1= '+' ( (lv_right_2_0= ruleText ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1694:2: ( (lv_left_0_0= ruleSimpleText ) ) otherlv_1= '+' ( (lv_right_2_0= ruleText ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1694:2: ( (lv_left_0_0= ruleSimpleText ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1695:1: (lv_left_0_0= ruleSimpleText )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1695:1: (lv_left_0_0= ruleSimpleText )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1696:3: lv_left_0_0= ruleSimpleText
            {
             
            	        newCompositeNode(grammarAccess.getComplexTextAccess().getLeftSimpleTextParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSimpleText_in_ruleComplexText4302);
            lv_left_0_0=ruleSimpleText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComplexTextRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"SimpleText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleComplexText4314); 

                	newLeafNode(otherlv_1, grammarAccess.getComplexTextAccess().getPlusSignKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1716:1: ( (lv_right_2_0= ruleText ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1717:1: (lv_right_2_0= ruleText )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1717:1: (lv_right_2_0= ruleText )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1718:3: lv_right_2_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getComplexTextAccess().getRightTextParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleComplexText4335);
            lv_right_2_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComplexTextRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_2_0, 
                    		"Text");
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
    // $ANTLR end "ruleComplexText"


    // $ANTLR start "entryRuleBorder"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1742:1: entryRuleBorder returns [EObject current=null] : iv_ruleBorder= ruleBorder EOF ;
    public final EObject entryRuleBorder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorder = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1743:2: (iv_ruleBorder= ruleBorder EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1744:2: iv_ruleBorder= ruleBorder EOF
            {
             newCompositeNode(grammarAccess.getBorderRule()); 
            pushFollow(FOLLOW_ruleBorder_in_entryRuleBorder4371);
            iv_ruleBorder=ruleBorder();

            state._fsp--;

             current =iv_ruleBorder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorder4381); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBorder"


    // $ANTLR start "ruleBorder"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1751:1: ruleBorder returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_2_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'color' otherlv_4= '=' ( (lv_color_5_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_6_0= ruleStyle ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleBorder() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_size_2_0 = null;

        EObject lv_color_5_0 = null;

        EObject lv_style_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1754:28: ( ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_2_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'color' otherlv_4= '=' ( (lv_color_5_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_6_0= ruleStyle ) ) ) ) ) )* ) ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1755:1: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_2_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'color' otherlv_4= '=' ( (lv_color_5_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_6_0= ruleStyle ) ) ) ) ) )* ) ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1755:1: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_2_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'color' otherlv_4= '=' ( (lv_color_5_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_6_0= ruleStyle ) ) ) ) ) )* ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1755:2: () ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_2_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'color' otherlv_4= '=' ( (lv_color_5_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_6_0= ruleStyle ) ) ) ) ) )* ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1755:2: ()
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1756:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBorderAccess().getBorderAction_0(),
                        current);
                

            }

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1761:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_2_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'color' otherlv_4= '=' ( (lv_color_5_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_6_0= ruleStyle ) ) ) ) ) )* ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1763:1: ( ( ( ({...}? => ( ({...}? => ( (lv_size_2_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'color' otherlv_4= '=' ( (lv_color_5_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_6_0= ruleStyle ) ) ) ) ) )* ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1763:1: ( ( ( ({...}? => ( ({...}? => ( (lv_size_2_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'color' otherlv_4= '=' ( (lv_color_5_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_6_0= ruleStyle ) ) ) ) ) )* ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1764:2: ( ( ({...}? => ( ({...}? => ( (lv_size_2_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'color' otherlv_4= '=' ( (lv_color_5_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_6_0= ruleStyle ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getBorderAccess().getUnorderedGroup_1());
            	
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1767:2: ( ( ({...}? => ( ({...}? => ( (lv_size_2_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'color' otherlv_4= '=' ( (lv_color_5_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_6_0= ruleStyle ) ) ) ) ) )* )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1768:3: ( ({...}? => ( ({...}? => ( (lv_size_2_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'color' otherlv_4= '=' ( (lv_color_5_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_6_0= ruleStyle ) ) ) ) ) )*
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1768:3: ( ({...}? => ( ({...}? => ( (lv_size_2_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'color' otherlv_4= '=' ( (lv_color_5_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_6_0= ruleStyle ) ) ) ) ) )*
            loop13:
            do {
                int alt13=4;
                switch ( input.LA(1) ) {
                case 37:
                    {
                    int LA13_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getBorderAccess().getUnorderedGroup_1(), 0) ) {
                        alt13=1;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA13_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getBorderAccess().getUnorderedGroup_1(), 1) ) {
                        alt13=2;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA13_4 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getBorderAccess().getUnorderedGroup_1(), 2) ) {
                        alt13=3;
                    }


                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1770:4: ({...}? => ( ({...}? => ( (lv_size_2_0= ruleSize ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1770:4: ({...}? => ( ({...}? => ( (lv_size_2_0= ruleSize ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1771:5: {...}? => ( ({...}? => ( (lv_size_2_0= ruleSize ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBorder", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1771:103: ( ({...}? => ( (lv_size_2_0= ruleSize ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1772:6: ({...}? => ( (lv_size_2_0= ruleSize ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBorderAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1775:6: ({...}? => ( (lv_size_2_0= ruleSize ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1775:7: {...}? => ( (lv_size_2_0= ruleSize ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBorder", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1775:16: ( (lv_size_2_0= ruleSize ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1776:1: (lv_size_2_0= ruleSize )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1776:1: (lv_size_2_0= ruleSize )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1777:3: lv_size_2_0= ruleSize
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBorderAccess().getSizeSizeParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSize_in_ruleBorder4481);
            	    lv_size_2_0=ruleSize();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBorderRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"size",
            	            		lv_size_2_0, 
            	            		"Size");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBorderAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1800:4: ({...}? => ( ({...}? => (otherlv_3= 'color' otherlv_4= '=' ( (lv_color_5_0= ruleColor ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1800:4: ({...}? => ( ({...}? => (otherlv_3= 'color' otherlv_4= '=' ( (lv_color_5_0= ruleColor ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1801:5: {...}? => ( ({...}? => (otherlv_3= 'color' otherlv_4= '=' ( (lv_color_5_0= ruleColor ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBorder", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1801:103: ( ({...}? => (otherlv_3= 'color' otherlv_4= '=' ( (lv_color_5_0= ruleColor ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1802:6: ({...}? => (otherlv_3= 'color' otherlv_4= '=' ( (lv_color_5_0= ruleColor ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBorderAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1805:6: ({...}? => (otherlv_3= 'color' otherlv_4= '=' ( (lv_color_5_0= ruleColor ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1805:7: {...}? => (otherlv_3= 'color' otherlv_4= '=' ( (lv_color_5_0= ruleColor ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBorder", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1805:16: (otherlv_3= 'color' otherlv_4= '=' ( (lv_color_5_0= ruleColor ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1805:18: otherlv_3= 'color' otherlv_4= '=' ( (lv_color_5_0= ruleColor ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleBorder4548); 

            	        	newLeafNode(otherlv_3, grammarAccess.getBorderAccess().getColorKeyword_1_1_0());
            	        
            	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleBorder4560); 

            	        	newLeafNode(otherlv_4, grammarAccess.getBorderAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1813:1: ( (lv_color_5_0= ruleColor ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1814:1: (lv_color_5_0= ruleColor )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1814:1: (lv_color_5_0= ruleColor )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1815:3: lv_color_5_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBorderAccess().getColorColorParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleBorder4581);
            	    lv_color_5_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBorderRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"color",
            	            		lv_color_5_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBorderAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1838:4: ({...}? => ( ({...}? => ( (lv_style_6_0= ruleStyle ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1838:4: ({...}? => ( ({...}? => ( (lv_style_6_0= ruleStyle ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1839:5: {...}? => ( ({...}? => ( (lv_style_6_0= ruleStyle ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleBorder", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1839:103: ( ({...}? => ( (lv_style_6_0= ruleStyle ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1840:6: ({...}? => ( (lv_style_6_0= ruleStyle ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBorderAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1843:6: ({...}? => ( (lv_style_6_0= ruleStyle ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1843:7: {...}? => ( (lv_style_6_0= ruleStyle ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBorder", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1843:16: ( (lv_style_6_0= ruleStyle ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1844:1: (lv_style_6_0= ruleStyle )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1844:1: (lv_style_6_0= ruleStyle )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1845:3: lv_style_6_0= ruleStyle
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBorderAccess().getStyleStyleParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStyle_in_ruleBorder4657);
            	    lv_style_6_0=ruleStyle();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBorderRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"style",
            	            		lv_style_6_0, 
            	            		"Style");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBorderAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getBorderAccess().getUnorderedGroup_1());
            	

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
    // $ANTLR end "ruleBorder"


    // $ANTLR start "entryRuleBoxImage"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1883:1: entryRuleBoxImage returns [EObject current=null] : iv_ruleBoxImage= ruleBoxImage EOF ;
    public final EObject entryRuleBoxImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoxImage = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1884:2: (iv_ruleBoxImage= ruleBoxImage EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1885:2: iv_ruleBoxImage= ruleBoxImage EOF
            {
             newCompositeNode(grammarAccess.getBoxImageRule()); 
            pushFollow(FOLLOW_ruleBoxImage_in_entryRuleBoxImage4733);
            iv_ruleBoxImage=ruleBoxImage();

            state._fsp--;

             current =iv_ruleBoxImage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoxImage4743); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoxImage"


    // $ANTLR start "ruleBoxImage"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1892:1: ruleBoxImage returns [EObject current=null] : ( () otherlv_1= 'image' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'placement' otherlv_8= '=' ( (lv_placement_9_0= ruleBoxImageOrientation ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) ;
    public final EObject ruleBoxImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_location_uri_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_placement_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1895:28: ( ( () otherlv_1= 'image' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'placement' otherlv_8= '=' ( (lv_placement_9_0= ruleBoxImageOrientation ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1896:1: ( () otherlv_1= 'image' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'placement' otherlv_8= '=' ( (lv_placement_9_0= ruleBoxImageOrientation ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1896:1: ( () otherlv_1= 'image' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'placement' otherlv_8= '=' ( (lv_placement_9_0= ruleBoxImageOrientation ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1896:2: () otherlv_1= 'image' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'placement' otherlv_8= '=' ( (lv_placement_9_0= ruleBoxImageOrientation ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}'
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1896:2: ()
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1897:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBoxImageAccess().getBoxImageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleBoxImage4789); 

                	newLeafNode(otherlv_1, grammarAccess.getBoxImageAccess().getImageKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleBoxImage4801); 

                	newLeafNode(otherlv_2, grammarAccess.getBoxImageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1910:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'placement' otherlv_8= '=' ( (lv_placement_9_0= ruleBoxImageOrientation ) ) ) ) ) ) )+ {...}?) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1912:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'placement' otherlv_8= '=' ( (lv_placement_9_0= ruleBoxImageOrientation ) ) ) ) ) ) )+ {...}?) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1912:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'placement' otherlv_8= '=' ( (lv_placement_9_0= ruleBoxImageOrientation ) ) ) ) ) ) )+ {...}?) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1913:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'placement' otherlv_8= '=' ( (lv_placement_9_0= ruleBoxImageOrientation ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getBoxImageAccess().getUnorderedGroup_3());
            	
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1916:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'placement' otherlv_8= '=' ( (lv_placement_9_0= ruleBoxImageOrientation ) ) ) ) ) ) )+ {...}?)
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1917:3: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'placement' otherlv_8= '=' ( (lv_placement_9_0= ruleBoxImageOrientation ) ) ) ) ) ) )+ {...}?
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1917:3: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'placement' otherlv_8= '=' ( (lv_placement_9_0= ruleBoxImageOrientation ) ) ) ) ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( LA14_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getBoxImageAccess().getUnorderedGroup_3(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getBoxImageAccess().getUnorderedGroup_3(), 1) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1919:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1919:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1920:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoxImageAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBoxImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoxImageAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1920:105: ( ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1921:6: ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBoxImageAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1924:6: ({...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1924:7: {...}? => (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBoxImage", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1924:16: (otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1924:18: otherlv_4= 'uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleBoxImage4859); 

            	        	newLeafNode(otherlv_4, grammarAccess.getBoxImageAccess().getUriKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleBoxImage4871); 

            	        	newLeafNode(otherlv_5, grammarAccess.getBoxImageAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1932:1: ( (lv_location_uri_6_0= RULE_STRING ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1933:1: (lv_location_uri_6_0= RULE_STRING )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1933:1: (lv_location_uri_6_0= RULE_STRING )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1934:3: lv_location_uri_6_0= RULE_STRING
            	    {
            	    lv_location_uri_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBoxImage4888); 

            	    			newLeafNode(lv_location_uri_6_0, grammarAccess.getBoxImageAccess().getLocation_uriSTRINGTerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getBoxImageRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"location_uri",
            	            		lv_location_uri_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoxImageAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1957:4: ({...}? => ( ({...}? => (otherlv_7= 'placement' otherlv_8= '=' ( (lv_placement_9_0= ruleBoxImageOrientation ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1957:4: ({...}? => ( ({...}? => (otherlv_7= 'placement' otherlv_8= '=' ( (lv_placement_9_0= ruleBoxImageOrientation ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1958:5: {...}? => ( ({...}? => (otherlv_7= 'placement' otherlv_8= '=' ( (lv_placement_9_0= ruleBoxImageOrientation ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoxImageAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBoxImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoxImageAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1958:105: ( ({...}? => (otherlv_7= 'placement' otherlv_8= '=' ( (lv_placement_9_0= ruleBoxImageOrientation ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1959:6: ({...}? => (otherlv_7= 'placement' otherlv_8= '=' ( (lv_placement_9_0= ruleBoxImageOrientation ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBoxImageAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1962:6: ({...}? => (otherlv_7= 'placement' otherlv_8= '=' ( (lv_placement_9_0= ruleBoxImageOrientation ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1962:7: {...}? => (otherlv_7= 'placement' otherlv_8= '=' ( (lv_placement_9_0= ruleBoxImageOrientation ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBoxImage", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1962:16: (otherlv_7= 'placement' otherlv_8= '=' ( (lv_placement_9_0= ruleBoxImageOrientation ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1962:18: otherlv_7= 'placement' otherlv_8= '=' ( (lv_placement_9_0= ruleBoxImageOrientation ) )
            	    {
            	    otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleBoxImage4961); 

            	        	newLeafNode(otherlv_7, grammarAccess.getBoxImageAccess().getPlacementKeyword_3_1_0());
            	        
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleBoxImage4973); 

            	        	newLeafNode(otherlv_8, grammarAccess.getBoxImageAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1970:1: ( (lv_placement_9_0= ruleBoxImageOrientation ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1971:1: (lv_placement_9_0= ruleBoxImageOrientation )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1971:1: (lv_placement_9_0= ruleBoxImageOrientation )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1972:3: lv_placement_9_0= ruleBoxImageOrientation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBoxImageAccess().getPlacementBoxImageOrientationEnumRuleCall_3_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBoxImageOrientation_in_ruleBoxImage4994);
            	    lv_placement_9_0=ruleBoxImageOrientation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBoxImageRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"placement",
            	            		lv_placement_9_0, 
            	            		"BoxImageOrientation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoxImageAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBoxImageAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleBoxImage", "getUnorderedGroupHelper().canLeave(grammarAccess.getBoxImageAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getBoxImageAccess().getUnorderedGroup_3());
            	

            }

            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleBoxImage5053); 

                	newLeafNode(otherlv_10, grammarAccess.getBoxImageAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoxImage"


    // $ANTLR start "entryRuleStyle"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2015:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2016:2: (iv_ruleStyle= ruleStyle EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2017:2: iv_ruleStyle= ruleStyle EOF
            {
             newCompositeNode(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_ruleStyle_in_entryRuleStyle5089);
            iv_ruleStyle=ruleStyle();

            state._fsp--;

             current =iv_ruleStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStyle5099); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStyle"


    // $ANTLR start "ruleStyle"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2024:1: ruleStyle returns [EObject current=null] : (otherlv_0= 'line-style' otherlv_1= '=' ( (lv_value_2_0= ruleLineStyle ) ) ) ;
    public final EObject ruleStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2027:28: ( (otherlv_0= 'line-style' otherlv_1= '=' ( (lv_value_2_0= ruleLineStyle ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2028:1: (otherlv_0= 'line-style' otherlv_1= '=' ( (lv_value_2_0= ruleLineStyle ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2028:1: (otherlv_0= 'line-style' otherlv_1= '=' ( (lv_value_2_0= ruleLineStyle ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2028:3: otherlv_0= 'line-style' otherlv_1= '=' ( (lv_value_2_0= ruleLineStyle ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleStyle5136); 

                	newLeafNode(otherlv_0, grammarAccess.getStyleAccess().getLineStyleKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleStyle5148); 

                	newLeafNode(otherlv_1, grammarAccess.getStyleAccess().getEqualsSignKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2036:1: ( (lv_value_2_0= ruleLineStyle ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2037:1: (lv_value_2_0= ruleLineStyle )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2037:1: (lv_value_2_0= ruleLineStyle )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2038:3: lv_value_2_0= ruleLineStyle
            {
             
            	        newCompositeNode(grammarAccess.getStyleAccess().getValueLineStyleEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLineStyle_in_ruleStyle5169);
            lv_value_2_0=ruleLineStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStyleRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"LineStyle");
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
    // $ANTLR end "ruleStyle"


    // $ANTLR start "entryRuleSize"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2062:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2063:2: (iv_ruleSize= ruleSize EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2064:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_ruleSize_in_entryRuleSize5205);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSize5215); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2071:1: ruleSize returns [EObject current=null] : (otherlv_0= 'size' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2074:28: ( (otherlv_0= 'size' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2075:1: (otherlv_0= 'size' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2075:1: (otherlv_0= 'size' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2075:3: otherlv_0= 'size' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleSize5252); 

                	newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleSize5264); 

                	newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getEqualsSignKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2083:1: ( (lv_value_2_0= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2084:1: (lv_value_2_0= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2084:1: (lv_value_2_0= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2085:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSize5281); 

            			newLeafNode(lv_value_2_0, grammarAccess.getSizeAccess().getValueINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSizeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleDirection"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2109:1: entryRuleDirection returns [EObject current=null] : iv_ruleDirection= ruleDirection EOF ;
    public final EObject entryRuleDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirection = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2110:2: (iv_ruleDirection= ruleDirection EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2111:2: iv_ruleDirection= ruleDirection EOF
            {
             newCompositeNode(grammarAccess.getDirectionRule()); 
            pushFollow(FOLLOW_ruleDirection_in_entryRuleDirection5322);
            iv_ruleDirection=ruleDirection();

            state._fsp--;

             current =iv_ruleDirection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirection5332); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirection"


    // $ANTLR start "ruleDirection"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2118:1: ruleDirection returns [EObject current=null] : (otherlv_0= 'direction' otherlv_1= '=' ( (lv_value_2_0= ruleDirections ) ) ) ;
    public final EObject ruleDirection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2121:28: ( (otherlv_0= 'direction' otherlv_1= '=' ( (lv_value_2_0= ruleDirections ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2122:1: (otherlv_0= 'direction' otherlv_1= '=' ( (lv_value_2_0= ruleDirections ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2122:1: (otherlv_0= 'direction' otherlv_1= '=' ( (lv_value_2_0= ruleDirections ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2122:3: otherlv_0= 'direction' otherlv_1= '=' ( (lv_value_2_0= ruleDirections ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleDirection5369); 

                	newLeafNode(otherlv_0, grammarAccess.getDirectionAccess().getDirectionKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleDirection5381); 

                	newLeafNode(otherlv_1, grammarAccess.getDirectionAccess().getEqualsSignKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2130:1: ( (lv_value_2_0= ruleDirections ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2131:1: (lv_value_2_0= ruleDirections )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2131:1: (lv_value_2_0= ruleDirections )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2132:3: lv_value_2_0= ruleDirections
            {
             
            	        newCompositeNode(grammarAccess.getDirectionAccess().getValueDirectionsEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDirections_in_ruleDirection5402);
            lv_value_2_0=ruleDirections();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDirectionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Directions");
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
    // $ANTLR end "ruleDirection"


    // $ANTLR start "entryRuleMargin"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2156:1: entryRuleMargin returns [EObject current=null] : iv_ruleMargin= ruleMargin EOF ;
    public final EObject entryRuleMargin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMargin = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2157:2: (iv_ruleMargin= ruleMargin EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2158:2: iv_ruleMargin= ruleMargin EOF
            {
             newCompositeNode(grammarAccess.getMarginRule()); 
            pushFollow(FOLLOW_ruleMargin_in_entryRuleMargin5438);
            iv_ruleMargin=ruleMargin();

            state._fsp--;

             current =iv_ruleMargin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMargin5448); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMargin"


    // $ANTLR start "ruleMargin"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2165:1: ruleMargin returns [EObject current=null] : (otherlv_0= 'margin' otherlv_1= '=' ( (lv_value_2_0= ruleSignedInteger ) ) ) ;
    public final EObject ruleMargin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2168:28: ( (otherlv_0= 'margin' otherlv_1= '=' ( (lv_value_2_0= ruleSignedInteger ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2169:1: (otherlv_0= 'margin' otherlv_1= '=' ( (lv_value_2_0= ruleSignedInteger ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2169:1: (otherlv_0= 'margin' otherlv_1= '=' ( (lv_value_2_0= ruleSignedInteger ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2169:3: otherlv_0= 'margin' otherlv_1= '=' ( (lv_value_2_0= ruleSignedInteger ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleMargin5485); 

                	newLeafNode(otherlv_0, grammarAccess.getMarginAccess().getMarginKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleMargin5497); 

                	newLeafNode(otherlv_1, grammarAccess.getMarginAccess().getEqualsSignKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2177:1: ( (lv_value_2_0= ruleSignedInteger ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2178:1: (lv_value_2_0= ruleSignedInteger )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2178:1: (lv_value_2_0= ruleSignedInteger )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2179:3: lv_value_2_0= ruleSignedInteger
            {
             
            	        newCompositeNode(grammarAccess.getMarginAccess().getValueSignedIntegerParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSignedInteger_in_ruleMargin5518);
            lv_value_2_0=ruleSignedInteger();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMarginRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"SignedInteger");
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
    // $ANTLR end "ruleMargin"


    // $ANTLR start "entryRuleColor"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2205:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2206:2: (iv_ruleColor= ruleColor EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2207:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor5556);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor5566); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2214:1: ruleColor returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleColorConstant ) ) ) | ( (lv_concrete_2_0= ruleConcreteColor ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;

        EObject lv_concrete_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2217:28: ( ( ( () ( (lv_value_1_0= ruleColorConstant ) ) ) | ( (lv_concrete_2_0= ruleConcreteColor ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2218:1: ( ( () ( (lv_value_1_0= ruleColorConstant ) ) ) | ( (lv_concrete_2_0= ruleConcreteColor ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2218:1: ( ( () ( (lv_value_1_0= ruleColorConstant ) ) ) | ( (lv_concrete_2_0= ruleConcreteColor ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=65 && LA15_0<=79)) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_HEX_COLOR||LA15_0==40) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2218:2: ( () ( (lv_value_1_0= ruleColorConstant ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2218:2: ( () ( (lv_value_1_0= ruleColorConstant ) ) )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2218:3: () ( (lv_value_1_0= ruleColorConstant ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2218:3: ()
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2219:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getColorAccess().getColorAction_0_0(),
                                current);
                        

                    }

                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2224:2: ( (lv_value_1_0= ruleColorConstant ) )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2225:1: (lv_value_1_0= ruleColorConstant )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2225:1: (lv_value_1_0= ruleColorConstant )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2226:3: lv_value_1_0= ruleColorConstant
                    {
                     
                    	        newCompositeNode(grammarAccess.getColorAccess().getValueColorConstantParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColorConstant_in_ruleColor5622);
                    lv_value_1_0=ruleColorConstant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getColorRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"ColorConstant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2243:6: ( (lv_concrete_2_0= ruleConcreteColor ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2243:6: ( (lv_concrete_2_0= ruleConcreteColor ) )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2244:1: (lv_concrete_2_0= ruleConcreteColor )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2244:1: (lv_concrete_2_0= ruleConcreteColor )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2245:3: lv_concrete_2_0= ruleConcreteColor
                    {
                     
                    	        newCompositeNode(grammarAccess.getColorAccess().getConcreteConcreteColorParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConcreteColor_in_ruleColor5650);
                    lv_concrete_2_0=ruleConcreteColor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getColorRule());
                    	        }
                           		set(
                           			current, 
                           			"concrete",
                            		lv_concrete_2_0, 
                            		"ConcreteColor");
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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleConcreteColor"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2269:1: entryRuleConcreteColor returns [EObject current=null] : iv_ruleConcreteColor= ruleConcreteColor EOF ;
    public final EObject entryRuleConcreteColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteColor = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2270:2: (iv_ruleConcreteColor= ruleConcreteColor EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2271:2: iv_ruleConcreteColor= ruleConcreteColor EOF
            {
             newCompositeNode(grammarAccess.getConcreteColorRule()); 
            pushFollow(FOLLOW_ruleConcreteColor_in_entryRuleConcreteColor5686);
            iv_ruleConcreteColor=ruleConcreteColor();

            state._fsp--;

             current =iv_ruleConcreteColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcreteColor5696); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcreteColor"


    // $ANTLR start "ruleConcreteColor"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2278:1: ruleConcreteColor returns [EObject current=null] : (this_RGB_0= ruleRGB | this_HexColor_1= ruleHexColor ) ;
    public final EObject ruleConcreteColor() throws RecognitionException {
        EObject current = null;

        EObject this_RGB_0 = null;

        EObject this_HexColor_1 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2281:28: ( (this_RGB_0= ruleRGB | this_HexColor_1= ruleHexColor ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2282:1: (this_RGB_0= ruleRGB | this_HexColor_1= ruleHexColor )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2282:1: (this_RGB_0= ruleRGB | this_HexColor_1= ruleHexColor )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==40) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_HEX_COLOR) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2283:5: this_RGB_0= ruleRGB
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteColorAccess().getRGBParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRGB_in_ruleConcreteColor5743);
                    this_RGB_0=ruleRGB();

                    state._fsp--;

                     
                            current = this_RGB_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2293:5: this_HexColor_1= ruleHexColor
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteColorAccess().getHexColorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleHexColor_in_ruleConcreteColor5770);
                    this_HexColor_1=ruleHexColor();

                    state._fsp--;

                     
                            current = this_HexColor_1; 
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
    // $ANTLR end "ruleConcreteColor"


    // $ANTLR start "entryRuleRGB"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2309:1: entryRuleRGB returns [EObject current=null] : iv_ruleRGB= ruleRGB EOF ;
    public final EObject entryRuleRGB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGB = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2310:2: (iv_ruleRGB= ruleRGB EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2311:2: iv_ruleRGB= ruleRGB EOF
            {
             newCompositeNode(grammarAccess.getRGBRule()); 
            pushFollow(FOLLOW_ruleRGB_in_entryRuleRGB5805);
            iv_ruleRGB=ruleRGB();

            state._fsp--;

             current =iv_ruleRGB; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRGB5815); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRGB"


    // $ANTLR start "ruleRGB"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2318:1: ruleRGB returns [EObject current=null] : (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
    public final EObject ruleRGB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_red_2_0=null;
        Token otherlv_3=null;
        Token lv_green_4_0=null;
        Token otherlv_5=null;
        Token lv_blue_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2321:28: ( (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2322:1: (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2322:1: (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2322:3: otherlv_0= 'RGB' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleRGB5852); 

                	newLeafNode(otherlv_0, grammarAccess.getRGBAccess().getRGBKeyword_0());
                
            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleRGB5864); 

                	newLeafNode(otherlv_1, grammarAccess.getRGBAccess().getLeftParenthesisKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2330:1: ( (lv_red_2_0= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2331:1: (lv_red_2_0= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2331:1: (lv_red_2_0= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2332:3: lv_red_2_0= RULE_INT
            {
            lv_red_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRGB5881); 

            			newLeafNode(lv_red_2_0, grammarAccess.getRGBAccess().getRedINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"red",
                    		lv_red_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleRGB5898); 

                	newLeafNode(otherlv_3, grammarAccess.getRGBAccess().getCommaKeyword_3());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2352:1: ( (lv_green_4_0= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2353:1: (lv_green_4_0= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2353:1: (lv_green_4_0= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2354:3: lv_green_4_0= RULE_INT
            {
            lv_green_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRGB5915); 

            			newLeafNode(lv_green_4_0, grammarAccess.getRGBAccess().getGreenINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"green",
                    		lv_green_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleRGB5932); 

                	newLeafNode(otherlv_5, grammarAccess.getRGBAccess().getCommaKeyword_5());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2374:1: ( (lv_blue_6_0= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2375:1: (lv_blue_6_0= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2375:1: (lv_blue_6_0= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2376:3: lv_blue_6_0= RULE_INT
            {
            lv_blue_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRGB5949); 

            			newLeafNode(lv_blue_6_0, grammarAccess.getRGBAccess().getBlueINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"blue",
                    		lv_blue_6_0, 
                    		"INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,43,FOLLOW_43_in_ruleRGB5966); 

                	newLeafNode(otherlv_7, grammarAccess.getRGBAccess().getRightParenthesisKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRGB"


    // $ANTLR start "entryRuleHexColor"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2404:1: entryRuleHexColor returns [EObject current=null] : iv_ruleHexColor= ruleHexColor EOF ;
    public final EObject entryRuleHexColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexColor = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2405:2: (iv_ruleHexColor= ruleHexColor EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2406:2: iv_ruleHexColor= ruleHexColor EOF
            {
             newCompositeNode(grammarAccess.getHexColorRule()); 
            pushFollow(FOLLOW_ruleHexColor_in_entryRuleHexColor6002);
            iv_ruleHexColor=ruleHexColor();

            state._fsp--;

             current =iv_ruleHexColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexColor6012); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHexColor"


    // $ANTLR start "ruleHexColor"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2413:1: ruleHexColor returns [EObject current=null] : ( (lv_hexCode_0_0= RULE_HEX_COLOR ) ) ;
    public final EObject ruleHexColor() throws RecognitionException {
        EObject current = null;

        Token lv_hexCode_0_0=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2416:28: ( ( (lv_hexCode_0_0= RULE_HEX_COLOR ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2417:1: ( (lv_hexCode_0_0= RULE_HEX_COLOR ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2417:1: ( (lv_hexCode_0_0= RULE_HEX_COLOR ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2418:1: (lv_hexCode_0_0= RULE_HEX_COLOR )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2418:1: (lv_hexCode_0_0= RULE_HEX_COLOR )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2419:3: lv_hexCode_0_0= RULE_HEX_COLOR
            {
            lv_hexCode_0_0=(Token)match(input,RULE_HEX_COLOR,FOLLOW_RULE_HEX_COLOR_in_ruleHexColor6053); 

            			newLeafNode(lv_hexCode_0_0, grammarAccess.getHexColorAccess().getHexCodeHEX_COLORTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHexColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"hexCode",
                    		lv_hexCode_0_0, 
                    		"HEX_COLOR");
            	    

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
    // $ANTLR end "ruleHexColor"


    // $ANTLR start "entryRuleColorConstant"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2443:1: entryRuleColorConstant returns [EObject current=null] : iv_ruleColorConstant= ruleColorConstant EOF ;
    public final EObject entryRuleColorConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorConstant = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2444:2: (iv_ruleColorConstant= ruleColorConstant EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2445:2: iv_ruleColorConstant= ruleColorConstant EOF
            {
             newCompositeNode(grammarAccess.getColorConstantRule()); 
            pushFollow(FOLLOW_ruleColorConstant_in_entryRuleColorConstant6093);
            iv_ruleColorConstant=ruleColorConstant();

            state._fsp--;

             current =iv_ruleColorConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorConstant6103); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColorConstant"


    // $ANTLR start "ruleColorConstant"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2452:1: ruleColorConstant returns [EObject current=null] : ( (lv_value_0_0= ruleColors ) ) ;
    public final EObject ruleColorConstant() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2455:28: ( ( (lv_value_0_0= ruleColors ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2456:1: ( (lv_value_0_0= ruleColors ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2456:1: ( (lv_value_0_0= ruleColors ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2457:1: (lv_value_0_0= ruleColors )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2457:1: (lv_value_0_0= ruleColors )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2458:3: lv_value_0_0= ruleColors
            {
             
            	        newCompositeNode(grammarAccess.getColorConstantAccess().getValueColorsEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleColors_in_ruleColorConstant6148);
            lv_value_0_0=ruleColors();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getColorConstantRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"Colors");
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
    // $ANTLR end "ruleColorConstant"


    // $ANTLR start "entryRuleActivation"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2482:1: entryRuleActivation returns [EObject current=null] : iv_ruleActivation= ruleActivation EOF ;
    public final EObject entryRuleActivation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivation = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2483:2: (iv_ruleActivation= ruleActivation EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2484:2: iv_ruleActivation= ruleActivation EOF
            {
             newCompositeNode(grammarAccess.getActivationRule()); 
            pushFollow(FOLLOW_ruleActivation_in_entryRuleActivation6183);
            iv_ruleActivation=ruleActivation();

            state._fsp--;

             current =iv_ruleActivation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivation6193); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivation"


    // $ANTLR start "ruleActivation"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2491:1: ruleActivation returns [EObject current=null] : (otherlv_0= 'active when' ( (lv_condition_1_0= ruleAbstractCondition ) ) ) ;
    public final EObject ruleActivation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_condition_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2494:28: ( (otherlv_0= 'active when' ( (lv_condition_1_0= ruleAbstractCondition ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2495:1: (otherlv_0= 'active when' ( (lv_condition_1_0= ruleAbstractCondition ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2495:1: (otherlv_0= 'active when' ( (lv_condition_1_0= ruleAbstractCondition ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2495:3: otherlv_0= 'active when' ( (lv_condition_1_0= ruleAbstractCondition ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleActivation6230); 

                	newLeafNode(otherlv_0, grammarAccess.getActivationAccess().getActiveWhenKeyword_0());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2499:1: ( (lv_condition_1_0= ruleAbstractCondition ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2500:1: (lv_condition_1_0= ruleAbstractCondition )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2500:1: (lv_condition_1_0= ruleAbstractCondition )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2501:3: lv_condition_1_0= ruleAbstractCondition
            {
             
            	        newCompositeNode(grammarAccess.getActivationAccess().getConditionAbstractConditionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractCondition_in_ruleActivation6251);
            lv_condition_1_0=ruleAbstractCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActivationRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_1_0, 
                    		"AbstractCondition");
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
    // $ANTLR end "ruleActivation"


    // $ANTLR start "entryRuleAbstractCondition"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2525:1: entryRuleAbstractCondition returns [EObject current=null] : iv_ruleAbstractCondition= ruleAbstractCondition EOF ;
    public final EObject entryRuleAbstractCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCondition = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2526:2: (iv_ruleAbstractCondition= ruleAbstractCondition EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2527:2: iv_ruleAbstractCondition= ruleAbstractCondition EOF
            {
             newCompositeNode(grammarAccess.getAbstractConditionRule()); 
            pushFollow(FOLLOW_ruleAbstractCondition_in_entryRuleAbstractCondition6287);
            iv_ruleAbstractCondition=ruleAbstractCondition();

            state._fsp--;

             current =iv_ruleAbstractCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractCondition6297); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractCondition"


    // $ANTLR start "ruleAbstractCondition"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2534:1: ruleAbstractCondition returns [EObject current=null] : (this_Condition_0= ruleCondition | this_CompositeCondition_1= ruleCompositeCondition | this_OclExpression_2= ruleOclExpression ) ;
    public final EObject ruleAbstractCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Condition_0 = null;

        EObject this_CompositeCondition_1 = null;

        EObject this_OclExpression_2 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2537:28: ( (this_Condition_0= ruleCondition | this_CompositeCondition_1= ruleCompositeCondition | this_OclExpression_2= ruleOclExpression ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2538:1: (this_Condition_0= ruleCondition | this_CompositeCondition_1= ruleCompositeCondition | this_OclExpression_2= ruleOclExpression )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2538:1: (this_Condition_0= ruleCondition | this_CompositeCondition_1= ruleCompositeCondition | this_OclExpression_2= ruleOclExpression )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt17=1;
                }
                break;
            case 58:
            case 59:
                {
                alt17=2;
                }
                break;
            case 45:
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
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2539:5: this_Condition_0= ruleCondition
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractConditionAccess().getConditionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCondition_in_ruleAbstractCondition6344);
                    this_Condition_0=ruleCondition();

                    state._fsp--;

                     
                            current = this_Condition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2549:5: this_CompositeCondition_1= ruleCompositeCondition
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractConditionAccess().getCompositeConditionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCompositeCondition_in_ruleAbstractCondition6371);
                    this_CompositeCondition_1=ruleCompositeCondition();

                    state._fsp--;

                     
                            current = this_CompositeCondition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2559:5: this_OclExpression_2= ruleOclExpression
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractConditionAccess().getOclExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleOclExpression_in_ruleAbstractCondition6398);
                    this_OclExpression_2=ruleOclExpression();

                    state._fsp--;

                     
                            current = this_OclExpression_2; 
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
    // $ANTLR end "ruleAbstractCondition"


    // $ANTLR start "entryRuleOclExpression"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2575:1: entryRuleOclExpression returns [EObject current=null] : iv_ruleOclExpression= ruleOclExpression EOF ;
    public final EObject entryRuleOclExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclExpression = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2576:2: (iv_ruleOclExpression= ruleOclExpression EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2577:2: iv_ruleOclExpression= ruleOclExpression EOF
            {
             newCompositeNode(grammarAccess.getOclExpressionRule()); 
            pushFollow(FOLLOW_ruleOclExpression_in_entryRuleOclExpression6433);
            iv_ruleOclExpression=ruleOclExpression();

            state._fsp--;

             current =iv_ruleOclExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOclExpression6443); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOclExpression"


    // $ANTLR start "ruleOclExpression"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2584:1: ruleOclExpression returns [EObject current=null] : (otherlv_0= 'ocl' otherlv_1= '(' ( (lv_expression_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleOclExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_expression_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2587:28: ( (otherlv_0= 'ocl' otherlv_1= '(' ( (lv_expression_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2588:1: (otherlv_0= 'ocl' otherlv_1= '(' ( (lv_expression_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2588:1: (otherlv_0= 'ocl' otherlv_1= '(' ( (lv_expression_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2588:3: otherlv_0= 'ocl' otherlv_1= '(' ( (lv_expression_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleOclExpression6480); 

                	newLeafNode(otherlv_0, grammarAccess.getOclExpressionAccess().getOclKeyword_0());
                
            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleOclExpression6492); 

                	newLeafNode(otherlv_1, grammarAccess.getOclExpressionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2596:1: ( (lv_expression_2_0= RULE_STRING ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2597:1: (lv_expression_2_0= RULE_STRING )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2597:1: (lv_expression_2_0= RULE_STRING )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2598:3: lv_expression_2_0= RULE_STRING
            {
            lv_expression_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOclExpression6509); 

            			newLeafNode(lv_expression_2_0, grammarAccess.getOclExpressionAccess().getExpressionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOclExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleOclExpression6526); 

                	newLeafNode(otherlv_3, grammarAccess.getOclExpressionAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOclExpression"


    // $ANTLR start "entryRuleCondition"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2626:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2627:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2628:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition6562);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition6572); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2635:1: ruleCondition returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_value_2_0= ruleType ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2638:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_value_2_0= ruleType ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2639:1: ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_value_2_0= ruleType ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2639:1: ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_value_2_0= ruleType ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2639:2: ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_value_2_0= ruleType ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2639:2: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2640:1: ( ruleQualifiedName )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2640:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2641:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getAttributeEAttributeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCondition6620);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2654:2: ( (lv_operator_1_0= ruleComparisonOperator ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2655:1: (lv_operator_1_0= ruleComparisonOperator )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2655:1: (lv_operator_1_0= ruleComparisonOperator )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2656:3: lv_operator_1_0= ruleComparisonOperator
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getOperatorComparisonOperatorEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleComparisonOperator_in_ruleCondition6641);
            lv_operator_1_0=ruleComparisonOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_1_0, 
                    		"ComparisonOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2672:2: ( (lv_value_2_0= ruleType ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2673:1: (lv_value_2_0= ruleType )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2673:1: (lv_value_2_0= ruleType )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2674:3: lv_value_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getValueTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleCondition6662);
            lv_value_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Type");
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleCompositeCondition"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2698:1: entryRuleCompositeCondition returns [EObject current=null] : iv_ruleCompositeCondition= ruleCompositeCondition EOF ;
    public final EObject entryRuleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeCondition = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2699:2: (iv_ruleCompositeCondition= ruleCompositeCondition EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2700:2: iv_ruleCompositeCondition= ruleCompositeCondition EOF
            {
             newCompositeNode(grammarAccess.getCompositeConditionRule()); 
            pushFollow(FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition6698);
            iv_ruleCompositeCondition=ruleCompositeCondition();

            state._fsp--;

             current =iv_ruleCompositeCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeCondition6708); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeCondition"


    // $ANTLR start "ruleCompositeCondition"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2707:1: ruleCompositeCondition returns [EObject current=null] : ( ( (lv_operator_0_0= ruleLogicalOperator ) ) otherlv_1= '(' ( (lv_conditions_2_0= ruleAbstractCondition ) )+ otherlv_3= ')' ) ;
    public final EObject ruleCompositeCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_operator_0_0 = null;

        EObject lv_conditions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2710:28: ( ( ( (lv_operator_0_0= ruleLogicalOperator ) ) otherlv_1= '(' ( (lv_conditions_2_0= ruleAbstractCondition ) )+ otherlv_3= ')' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2711:1: ( ( (lv_operator_0_0= ruleLogicalOperator ) ) otherlv_1= '(' ( (lv_conditions_2_0= ruleAbstractCondition ) )+ otherlv_3= ')' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2711:1: ( ( (lv_operator_0_0= ruleLogicalOperator ) ) otherlv_1= '(' ( (lv_conditions_2_0= ruleAbstractCondition ) )+ otherlv_3= ')' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2711:2: ( (lv_operator_0_0= ruleLogicalOperator ) ) otherlv_1= '(' ( (lv_conditions_2_0= ruleAbstractCondition ) )+ otherlv_3= ')'
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2711:2: ( (lv_operator_0_0= ruleLogicalOperator ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2712:1: (lv_operator_0_0= ruleLogicalOperator )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2712:1: (lv_operator_0_0= ruleLogicalOperator )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2713:3: lv_operator_0_0= ruleLogicalOperator
            {
             
            	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getOperatorLogicalOperatorEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLogicalOperator_in_ruleCompositeCondition6754);
            lv_operator_0_0=ruleLogicalOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_0_0, 
                    		"LogicalOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleCompositeCondition6766); 

                	newLeafNode(otherlv_1, grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2733:1: ( (lv_conditions_2_0= ruleAbstractCondition ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==45||(LA18_0>=58 && LA18_0<=59)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2734:1: (lv_conditions_2_0= ruleAbstractCondition )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2734:1: (lv_conditions_2_0= ruleAbstractCondition )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2735:3: lv_conditions_2_0= ruleAbstractCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsAbstractConditionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractCondition_in_ruleCompositeCondition6787);
            	    lv_conditions_2_0=ruleAbstractCondition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"conditions",
            	            		lv_conditions_2_0, 
            	            		"AbstractCondition");
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

            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleCompositeCondition6800); 

                	newLeafNode(otherlv_3, grammarAccess.getCompositeConditionAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeCondition"


    // $ANTLR start "entryRuleType"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2763:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2764:2: (iv_ruleType= ruleType EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2765:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType6837);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType6848); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2772:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SignedInteger_0= ruleSignedInteger | this_SignedDouble_1= ruleSignedDouble | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN | this_ID_4= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_2=null;
        Token this_BOOLEAN_3=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_SignedInteger_0 = null;

        AntlrDatatypeRuleToken this_SignedDouble_1 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2775:28: ( (this_SignedInteger_0= ruleSignedInteger | this_SignedDouble_1= ruleSignedDouble | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN | this_ID_4= RULE_ID ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2776:1: (this_SignedInteger_0= ruleSignedInteger | this_SignedDouble_1= ruleSignedDouble | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN | this_ID_4= RULE_ID )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2776:1: (this_SignedInteger_0= ruleSignedInteger | this_SignedDouble_1= ruleSignedDouble | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN | this_ID_4= RULE_ID )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_INT) ) {
                    int LA19_2 = input.LA(3);

                    if ( (LA19_2==47) ) {
                        alt19=2;
                    }
                    else if ( (LA19_2==EOF||LA19_2==RULE_ID||(LA19_2>=17 && LA19_2<=19)||(LA19_2>=21 && LA19_2<=33)||(LA19_2>=36 && LA19_2<=39)||(LA19_2>=43 && LA19_2<=45)||(LA19_2>=58 && LA19_2<=59)) ) {
                        alt19=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==47) ) {
                    alt19=2;
                }
                else if ( (LA19_2==EOF||LA19_2==RULE_ID||(LA19_2>=17 && LA19_2<=19)||(LA19_2>=21 && LA19_2<=33)||(LA19_2>=36 && LA19_2<=39)||(LA19_2>=43 && LA19_2<=45)||(LA19_2>=58 && LA19_2<=59)) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt19=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt19=4;
                }
                break;
            case RULE_ID:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2777:5: this_SignedInteger_0= ruleSignedInteger
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSignedIntegerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSignedInteger_in_ruleType6895);
                    this_SignedInteger_0=ruleSignedInteger();

                    state._fsp--;


                    		current.merge(this_SignedInteger_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2789:5: this_SignedDouble_1= ruleSignedDouble
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSignedDoubleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSignedDouble_in_ruleType6928);
                    this_SignedDouble_1=ruleSignedDouble();

                    state._fsp--;


                    		current.merge(this_SignedDouble_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2800:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleType6954); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getTypeAccess().getSTRINGTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2808:10: this_BOOLEAN_3= RULE_BOOLEAN
                    {
                    this_BOOLEAN_3=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleType6980); 

                    		current.merge(this_BOOLEAN_3);
                        
                     
                        newLeafNode(this_BOOLEAN_3, grammarAccess.getTypeAccess().getBOOLEANTerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2816:10: this_ID_4= RULE_ID
                    {
                    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType7006); 

                    		current.merge(this_ID_4);
                        
                     
                        newLeafNode(this_ID_4, grammarAccess.getTypeAccess().getIDTerminalRuleCall_4()); 
                        

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


    // $ANTLR start "entryRuleSignedDouble"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2831:1: entryRuleSignedDouble returns [String current=null] : iv_ruleSignedDouble= ruleSignedDouble EOF ;
    public final String entryRuleSignedDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedDouble = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2832:2: (iv_ruleSignedDouble= ruleSignedDouble EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2833:2: iv_ruleSignedDouble= ruleSignedDouble EOF
            {
             newCompositeNode(grammarAccess.getSignedDoubleRule()); 
            pushFollow(FOLLOW_ruleSignedDouble_in_entryRuleSignedDouble7052);
            iv_ruleSignedDouble=ruleSignedDouble();

            state._fsp--;

             current =iv_ruleSignedDouble.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedDouble7063); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedDouble"


    // $ANTLR start "ruleSignedDouble"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2840:1: ruleSignedDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2843:28: ( ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2844:1: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2844:1: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2844:2: (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2844:2: (kw= '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2845:2: kw= '-'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleSignedDouble7102); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedDoubleAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedDouble7119); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getSignedDoubleAccess().getINTTerminalRuleCall_1()); 
                
            kw=(Token)match(input,47,FOLLOW_47_in_ruleSignedDouble7137); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSignedDoubleAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedDouble7152); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getSignedDoubleAccess().getINTTerminalRuleCall_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedDouble"


    // $ANTLR start "entryRuleSignedInteger"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2878:1: entryRuleSignedInteger returns [String current=null] : iv_ruleSignedInteger= ruleSignedInteger EOF ;
    public final String entryRuleSignedInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInteger = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2879:2: (iv_ruleSignedInteger= ruleSignedInteger EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2880:2: iv_ruleSignedInteger= ruleSignedInteger EOF
            {
             newCompositeNode(grammarAccess.getSignedIntegerRule()); 
            pushFollow(FOLLOW_ruleSignedInteger_in_entryRuleSignedInteger7198);
            iv_ruleSignedInteger=ruleSignedInteger();

            state._fsp--;

             current =iv_ruleSignedInteger.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedInteger7209); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedInteger"


    // $ANTLR start "ruleSignedInteger"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2887:1: ruleSignedInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2890:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2891:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2891:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2891:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2891:2: (kw= '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==46) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2892:2: kw= '-'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleSignedInteger7248); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedIntegerAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedInteger7265); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getSignedIntegerAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedInteger"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2914:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2915:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2916:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName7313);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName7324); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2923:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2926:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2927:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2927:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2927:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName7364); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2934:1: (kw= '.' this_ID_2= RULE_ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==47) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2935:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,47,FOLLOW_47_in_ruleQualifiedName7383); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName7398); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop22;
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


    // $ANTLR start "ruleBoxImageOrientation"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2955:1: ruleBoxImageOrientation returns [Enumerator current=null] : ( (enumLiteral_0= 'WEST' ) | (enumLiteral_1= 'NORTH' ) | (enumLiteral_2= 'EAST' ) | (enumLiteral_3= 'SOUTH' ) ) ;
    public final Enumerator ruleBoxImageOrientation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2957:28: ( ( (enumLiteral_0= 'WEST' ) | (enumLiteral_1= 'NORTH' ) | (enumLiteral_2= 'EAST' ) | (enumLiteral_3= 'SOUTH' ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2958:1: ( (enumLiteral_0= 'WEST' ) | (enumLiteral_1= 'NORTH' ) | (enumLiteral_2= 'EAST' ) | (enumLiteral_3= 'SOUTH' ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2958:1: ( (enumLiteral_0= 'WEST' ) | (enumLiteral_1= 'NORTH' ) | (enumLiteral_2= 'EAST' ) | (enumLiteral_3= 'SOUTH' ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt23=1;
                }
                break;
            case 49:
                {
                alt23=2;
                }
                break;
            case 50:
                {
                alt23=3;
                }
                break;
            case 51:
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
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2958:2: (enumLiteral_0= 'WEST' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2958:2: (enumLiteral_0= 'WEST' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2958:4: enumLiteral_0= 'WEST'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_48_in_ruleBoxImageOrientation7459); 

                            current = grammarAccess.getBoxImageOrientationAccess().getWESTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBoxImageOrientationAccess().getWESTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2964:6: (enumLiteral_1= 'NORTH' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2964:6: (enumLiteral_1= 'NORTH' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2964:8: enumLiteral_1= 'NORTH'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_49_in_ruleBoxImageOrientation7476); 

                            current = grammarAccess.getBoxImageOrientationAccess().getNORTHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBoxImageOrientationAccess().getNORTHEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2970:6: (enumLiteral_2= 'EAST' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2970:6: (enumLiteral_2= 'EAST' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2970:8: enumLiteral_2= 'EAST'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_50_in_ruleBoxImageOrientation7493); 

                            current = grammarAccess.getBoxImageOrientationAccess().getEASTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBoxImageOrientationAccess().getEASTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2976:6: (enumLiteral_3= 'SOUTH' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2976:6: (enumLiteral_3= 'SOUTH' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2976:8: enumLiteral_3= 'SOUTH'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_51_in_ruleBoxImageOrientation7510); 

                            current = grammarAccess.getBoxImageOrientationAccess().getSOUTHEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getBoxImageOrientationAccess().getSOUTHEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleBoxImageOrientation"


    // $ANTLR start "ruleComparisonOperator"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2986:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '<=' ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2988:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '<=' ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2989:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '<=' ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2989:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '<=' ) )
            int alt24=6;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt24=1;
                }
                break;
            case 53:
                {
                alt24=2;
                }
                break;
            case 54:
                {
                alt24=3;
                }
                break;
            case 55:
                {
                alt24=4;
                }
                break;
            case 56:
                {
                alt24=5;
                }
                break;
            case 57:
                {
                alt24=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2989:2: (enumLiteral_0= '==' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2989:2: (enumLiteral_0= '==' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2989:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_52_in_ruleComparisonOperator7555); 

                            current = grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2995:6: (enumLiteral_1= '!=' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2995:6: (enumLiteral_1= '!=' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2995:8: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_53_in_ruleComparisonOperator7572); 

                            current = grammarAccess.getComparisonOperatorAccess().getUNEQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getUNEQUALEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3001:6: (enumLiteral_2= '>' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3001:6: (enumLiteral_2= '>' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3001:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_54_in_ruleComparisonOperator7589); 

                            current = grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3007:6: (enumLiteral_3= '>=' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3007:6: (enumLiteral_3= '>=' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3007:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_55_in_ruleComparisonOperator7606); 

                            current = grammarAccess.getComparisonOperatorAccess().getGREATEROREQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getGREATEROREQUALEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3013:6: (enumLiteral_4= '<' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3013:6: (enumLiteral_4= '<' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3013:8: enumLiteral_4= '<'
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_56_in_ruleComparisonOperator7623); 

                            current = grammarAccess.getComparisonOperatorAccess().getLOWEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getLOWEREnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3019:6: (enumLiteral_5= '<=' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3019:6: (enumLiteral_5= '<=' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3019:8: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,57,FOLLOW_57_in_ruleComparisonOperator7640); 

                            current = grammarAccess.getComparisonOperatorAccess().getLOWEROREQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getComparisonOperatorAccess().getLOWEROREQUALEnumLiteralDeclaration_5()); 
                        

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
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "ruleLogicalOperator"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3029:1: ruleLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ANY' ) ) ;
    public final Enumerator ruleLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3031:28: ( ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ANY' ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3032:1: ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ANY' ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3032:1: ( (enumLiteral_0= 'ALL' ) | (enumLiteral_1= 'ANY' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==58) ) {
                alt25=1;
            }
            else if ( (LA25_0==59) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3032:2: (enumLiteral_0= 'ALL' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3032:2: (enumLiteral_0= 'ALL' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3032:4: enumLiteral_0= 'ALL'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_58_in_ruleLogicalOperator7685); 

                            current = grammarAccess.getLogicalOperatorAccess().getALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperatorAccess().getALLEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3038:6: (enumLiteral_1= 'ANY' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3038:6: (enumLiteral_1= 'ANY' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3038:8: enumLiteral_1= 'ANY'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_59_in_ruleLogicalOperator7702); 

                            current = grammarAccess.getLogicalOperatorAccess().getANYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLogicalOperatorAccess().getANYEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleLogicalOperator"


    // $ANTLR start "ruleLineStyle"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3048:1: ruleLineStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'SOLID' ) | (enumLiteral_1= 'DOTS' ) | (enumLiteral_2= 'DASH' ) | (enumLiteral_3= 'DASHDOT' ) | (enumLiteral_4= 'DASHDOTDOT' ) ) ;
    public final Enumerator ruleLineStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3050:28: ( ( (enumLiteral_0= 'SOLID' ) | (enumLiteral_1= 'DOTS' ) | (enumLiteral_2= 'DASH' ) | (enumLiteral_3= 'DASHDOT' ) | (enumLiteral_4= 'DASHDOTDOT' ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3051:1: ( (enumLiteral_0= 'SOLID' ) | (enumLiteral_1= 'DOTS' ) | (enumLiteral_2= 'DASH' ) | (enumLiteral_3= 'DASHDOT' ) | (enumLiteral_4= 'DASHDOTDOT' ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3051:1: ( (enumLiteral_0= 'SOLID' ) | (enumLiteral_1= 'DOTS' ) | (enumLiteral_2= 'DASH' ) | (enumLiteral_3= 'DASHDOT' ) | (enumLiteral_4= 'DASHDOTDOT' ) )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt26=1;
                }
                break;
            case 61:
                {
                alt26=2;
                }
                break;
            case 62:
                {
                alt26=3;
                }
                break;
            case 63:
                {
                alt26=4;
                }
                break;
            case 64:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3051:2: (enumLiteral_0= 'SOLID' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3051:2: (enumLiteral_0= 'SOLID' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3051:4: enumLiteral_0= 'SOLID'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_60_in_ruleLineStyle7747); 

                            current = grammarAccess.getLineStyleAccess().getLINE_SOLIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLineStyleAccess().getLINE_SOLIDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3057:6: (enumLiteral_1= 'DOTS' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3057:6: (enumLiteral_1= 'DOTS' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3057:8: enumLiteral_1= 'DOTS'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_61_in_ruleLineStyle7764); 

                            current = grammarAccess.getLineStyleAccess().getLINE_DOTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLineStyleAccess().getLINE_DOTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3063:6: (enumLiteral_2= 'DASH' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3063:6: (enumLiteral_2= 'DASH' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3063:8: enumLiteral_2= 'DASH'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_62_in_ruleLineStyle7781); 

                            current = grammarAccess.getLineStyleAccess().getLINE_DASHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLineStyleAccess().getLINE_DASHEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3069:6: (enumLiteral_3= 'DASHDOT' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3069:6: (enumLiteral_3= 'DASHDOT' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3069:8: enumLiteral_3= 'DASHDOT'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_63_in_ruleLineStyle7798); 

                            current = grammarAccess.getLineStyleAccess().getLINE_DASHDOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLineStyleAccess().getLINE_DASHDOTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3075:6: (enumLiteral_4= 'DASHDOTDOT' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3075:6: (enumLiteral_4= 'DASHDOTDOT' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3075:8: enumLiteral_4= 'DASHDOTDOT'
                    {
                    enumLiteral_4=(Token)match(input,64,FOLLOW_64_in_ruleLineStyle7815); 

                            current = grammarAccess.getLineStyleAccess().getLINE_DASHDOTDOTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getLineStyleAccess().getLINE_DASHDOTDOTEnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "ruleLineStyle"


    // $ANTLR start "ruleColors"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3085:1: ruleColors returns [Enumerator current=null] : ( (enumLiteral_0= 'RED' ) | (enumLiteral_1= 'BLACK' ) | (enumLiteral_2= 'WHITE' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'GREEN_LIGHT' ) | (enumLiteral_5= 'GREEN_DARK' ) | (enumLiteral_6= 'BLUE' ) | (enumLiteral_7= 'BLUE_LIGHT' ) | (enumLiteral_8= 'BLUE_DARK' ) | (enumLiteral_9= 'GRAY' ) | (enumLiteral_10= 'GRAY_LIGHT' ) | (enumLiteral_11= 'GRAY_DARK' ) | (enumLiteral_12= 'ORANGE' ) | (enumLiteral_13= 'YELLOW' ) | (enumLiteral_14= 'CYAN' ) ) ;
    public final Enumerator ruleColors() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;

         enterRule(); 
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3087:28: ( ( (enumLiteral_0= 'RED' ) | (enumLiteral_1= 'BLACK' ) | (enumLiteral_2= 'WHITE' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'GREEN_LIGHT' ) | (enumLiteral_5= 'GREEN_DARK' ) | (enumLiteral_6= 'BLUE' ) | (enumLiteral_7= 'BLUE_LIGHT' ) | (enumLiteral_8= 'BLUE_DARK' ) | (enumLiteral_9= 'GRAY' ) | (enumLiteral_10= 'GRAY_LIGHT' ) | (enumLiteral_11= 'GRAY_DARK' ) | (enumLiteral_12= 'ORANGE' ) | (enumLiteral_13= 'YELLOW' ) | (enumLiteral_14= 'CYAN' ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3088:1: ( (enumLiteral_0= 'RED' ) | (enumLiteral_1= 'BLACK' ) | (enumLiteral_2= 'WHITE' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'GREEN_LIGHT' ) | (enumLiteral_5= 'GREEN_DARK' ) | (enumLiteral_6= 'BLUE' ) | (enumLiteral_7= 'BLUE_LIGHT' ) | (enumLiteral_8= 'BLUE_DARK' ) | (enumLiteral_9= 'GRAY' ) | (enumLiteral_10= 'GRAY_LIGHT' ) | (enumLiteral_11= 'GRAY_DARK' ) | (enumLiteral_12= 'ORANGE' ) | (enumLiteral_13= 'YELLOW' ) | (enumLiteral_14= 'CYAN' ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3088:1: ( (enumLiteral_0= 'RED' ) | (enumLiteral_1= 'BLACK' ) | (enumLiteral_2= 'WHITE' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'GREEN_LIGHT' ) | (enumLiteral_5= 'GREEN_DARK' ) | (enumLiteral_6= 'BLUE' ) | (enumLiteral_7= 'BLUE_LIGHT' ) | (enumLiteral_8= 'BLUE_DARK' ) | (enumLiteral_9= 'GRAY' ) | (enumLiteral_10= 'GRAY_LIGHT' ) | (enumLiteral_11= 'GRAY_DARK' ) | (enumLiteral_12= 'ORANGE' ) | (enumLiteral_13= 'YELLOW' ) | (enumLiteral_14= 'CYAN' ) )
            int alt27=15;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt27=1;
                }
                break;
            case 66:
                {
                alt27=2;
                }
                break;
            case 67:
                {
                alt27=3;
                }
                break;
            case 68:
                {
                alt27=4;
                }
                break;
            case 69:
                {
                alt27=5;
                }
                break;
            case 70:
                {
                alt27=6;
                }
                break;
            case 71:
                {
                alt27=7;
                }
                break;
            case 72:
                {
                alt27=8;
                }
                break;
            case 73:
                {
                alt27=9;
                }
                break;
            case 74:
                {
                alt27=10;
                }
                break;
            case 75:
                {
                alt27=11;
                }
                break;
            case 76:
                {
                alt27=12;
                }
                break;
            case 77:
                {
                alt27=13;
                }
                break;
            case 78:
                {
                alt27=14;
                }
                break;
            case 79:
                {
                alt27=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3088:2: (enumLiteral_0= 'RED' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3088:2: (enumLiteral_0= 'RED' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3088:4: enumLiteral_0= 'RED'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_65_in_ruleColors7860); 

                            current = grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3094:6: (enumLiteral_1= 'BLACK' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3094:6: (enumLiteral_1= 'BLACK' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3094:8: enumLiteral_1= 'BLACK'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_66_in_ruleColors7877); 

                            current = grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3100:6: (enumLiteral_2= 'WHITE' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3100:6: (enumLiteral_2= 'WHITE' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3100:8: enumLiteral_2= 'WHITE'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_67_in_ruleColors7894); 

                            current = grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3106:6: (enumLiteral_3= 'GREEN' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3106:6: (enumLiteral_3= 'GREEN' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3106:8: enumLiteral_3= 'GREEN'
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_68_in_ruleColors7911); 

                            current = grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3112:6: (enumLiteral_4= 'GREEN_LIGHT' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3112:6: (enumLiteral_4= 'GREEN_LIGHT' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3112:8: enumLiteral_4= 'GREEN_LIGHT'
                    {
                    enumLiteral_4=(Token)match(input,69,FOLLOW_69_in_ruleColors7928); 

                            current = grammarAccess.getColorsAccess().getGREEN_LIGHTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getColorsAccess().getGREEN_LIGHTEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3118:6: (enumLiteral_5= 'GREEN_DARK' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3118:6: (enumLiteral_5= 'GREEN_DARK' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3118:8: enumLiteral_5= 'GREEN_DARK'
                    {
                    enumLiteral_5=(Token)match(input,70,FOLLOW_70_in_ruleColors7945); 

                            current = grammarAccess.getColorsAccess().getGREEN_DARKEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getColorsAccess().getGREEN_DARKEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3124:6: (enumLiteral_6= 'BLUE' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3124:6: (enumLiteral_6= 'BLUE' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3124:8: enumLiteral_6= 'BLUE'
                    {
                    enumLiteral_6=(Token)match(input,71,FOLLOW_71_in_ruleColors7962); 

                            current = grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3130:6: (enumLiteral_7= 'BLUE_LIGHT' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3130:6: (enumLiteral_7= 'BLUE_LIGHT' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3130:8: enumLiteral_7= 'BLUE_LIGHT'
                    {
                    enumLiteral_7=(Token)match(input,72,FOLLOW_72_in_ruleColors7979); 

                            current = grammarAccess.getColorsAccess().getBLUE_LIGHTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getColorsAccess().getBLUE_LIGHTEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3136:6: (enumLiteral_8= 'BLUE_DARK' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3136:6: (enumLiteral_8= 'BLUE_DARK' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3136:8: enumLiteral_8= 'BLUE_DARK'
                    {
                    enumLiteral_8=(Token)match(input,73,FOLLOW_73_in_ruleColors7996); 

                            current = grammarAccess.getColorsAccess().getBLUE_DARKEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getColorsAccess().getBLUE_DARKEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3142:6: (enumLiteral_9= 'GRAY' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3142:6: (enumLiteral_9= 'GRAY' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3142:8: enumLiteral_9= 'GRAY'
                    {
                    enumLiteral_9=(Token)match(input,74,FOLLOW_74_in_ruleColors8013); 

                            current = grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3148:6: (enumLiteral_10= 'GRAY_LIGHT' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3148:6: (enumLiteral_10= 'GRAY_LIGHT' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3148:8: enumLiteral_10= 'GRAY_LIGHT'
                    {
                    enumLiteral_10=(Token)match(input,75,FOLLOW_75_in_ruleColors8030); 

                            current = grammarAccess.getColorsAccess().getGRAY_LIGHTEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getColorsAccess().getGRAY_LIGHTEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3154:6: (enumLiteral_11= 'GRAY_DARK' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3154:6: (enumLiteral_11= 'GRAY_DARK' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3154:8: enumLiteral_11= 'GRAY_DARK'
                    {
                    enumLiteral_11=(Token)match(input,76,FOLLOW_76_in_ruleColors8047); 

                            current = grammarAccess.getColorsAccess().getGRAY_DARKEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getColorsAccess().getGRAY_DARKEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3160:6: (enumLiteral_12= 'ORANGE' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3160:6: (enumLiteral_12= 'ORANGE' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3160:8: enumLiteral_12= 'ORANGE'
                    {
                    enumLiteral_12=(Token)match(input,77,FOLLOW_77_in_ruleColors8064); 

                            current = grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3166:6: (enumLiteral_13= 'YELLOW' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3166:6: (enumLiteral_13= 'YELLOW' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3166:8: enumLiteral_13= 'YELLOW'
                    {
                    enumLiteral_13=(Token)match(input,78,FOLLOW_78_in_ruleColors8081); 

                            current = grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3172:6: (enumLiteral_14= 'CYAN' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3172:6: (enumLiteral_14= 'CYAN' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3172:8: enumLiteral_14= 'CYAN'
                    {
                    enumLiteral_14=(Token)match(input,79,FOLLOW_79_in_ruleColors8098); 

                            current = grammarAccess.getColorsAccess().getCYANEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getColorsAccess().getCYANEnumLiteralDeclaration_14()); 
                        

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
    // $ANTLR end "ruleColors"


    // $ANTLR start "ruleDirections"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3182:1: ruleDirections returns [Enumerator current=null] : ( (enumLiteral_0= 'CENTER' ) | (enumLiteral_1= 'NORTH' ) | (enumLiteral_2= 'SOUTH' ) | (enumLiteral_3= 'WEST' ) | (enumLiteral_4= 'EAST' ) | (enumLiteral_5= 'NORTH_EAST' ) | (enumLiteral_6= 'NORTH_WEST' ) | (enumLiteral_7= 'SOUTH_EAST' ) | (enumLiteral_8= 'SOUTH_WEST' ) ) ;
    public final Enumerator ruleDirections() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;

         enterRule(); 
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3184:28: ( ( (enumLiteral_0= 'CENTER' ) | (enumLiteral_1= 'NORTH' ) | (enumLiteral_2= 'SOUTH' ) | (enumLiteral_3= 'WEST' ) | (enumLiteral_4= 'EAST' ) | (enumLiteral_5= 'NORTH_EAST' ) | (enumLiteral_6= 'NORTH_WEST' ) | (enumLiteral_7= 'SOUTH_EAST' ) | (enumLiteral_8= 'SOUTH_WEST' ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3185:1: ( (enumLiteral_0= 'CENTER' ) | (enumLiteral_1= 'NORTH' ) | (enumLiteral_2= 'SOUTH' ) | (enumLiteral_3= 'WEST' ) | (enumLiteral_4= 'EAST' ) | (enumLiteral_5= 'NORTH_EAST' ) | (enumLiteral_6= 'NORTH_WEST' ) | (enumLiteral_7= 'SOUTH_EAST' ) | (enumLiteral_8= 'SOUTH_WEST' ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3185:1: ( (enumLiteral_0= 'CENTER' ) | (enumLiteral_1= 'NORTH' ) | (enumLiteral_2= 'SOUTH' ) | (enumLiteral_3= 'WEST' ) | (enumLiteral_4= 'EAST' ) | (enumLiteral_5= 'NORTH_EAST' ) | (enumLiteral_6= 'NORTH_WEST' ) | (enumLiteral_7= 'SOUTH_EAST' ) | (enumLiteral_8= 'SOUTH_WEST' ) )
            int alt28=9;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt28=1;
                }
                break;
            case 49:
                {
                alt28=2;
                }
                break;
            case 51:
                {
                alt28=3;
                }
                break;
            case 48:
                {
                alt28=4;
                }
                break;
            case 50:
                {
                alt28=5;
                }
                break;
            case 81:
                {
                alt28=6;
                }
                break;
            case 82:
                {
                alt28=7;
                }
                break;
            case 83:
                {
                alt28=8;
                }
                break;
            case 84:
                {
                alt28=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3185:2: (enumLiteral_0= 'CENTER' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3185:2: (enumLiteral_0= 'CENTER' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3185:4: enumLiteral_0= 'CENTER'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_80_in_ruleDirections8143); 

                            current = grammarAccess.getDirectionsAccess().getCENTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDirectionsAccess().getCENTEREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3191:6: (enumLiteral_1= 'NORTH' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3191:6: (enumLiteral_1= 'NORTH' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3191:8: enumLiteral_1= 'NORTH'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_49_in_ruleDirections8160); 

                            current = grammarAccess.getDirectionsAccess().getNORTHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDirectionsAccess().getNORTHEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3197:6: (enumLiteral_2= 'SOUTH' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3197:6: (enumLiteral_2= 'SOUTH' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3197:8: enumLiteral_2= 'SOUTH'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_51_in_ruleDirections8177); 

                            current = grammarAccess.getDirectionsAccess().getSOUTHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDirectionsAccess().getSOUTHEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3203:6: (enumLiteral_3= 'WEST' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3203:6: (enumLiteral_3= 'WEST' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3203:8: enumLiteral_3= 'WEST'
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_48_in_ruleDirections8194); 

                            current = grammarAccess.getDirectionsAccess().getWESTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDirectionsAccess().getWESTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3209:6: (enumLiteral_4= 'EAST' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3209:6: (enumLiteral_4= 'EAST' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3209:8: enumLiteral_4= 'EAST'
                    {
                    enumLiteral_4=(Token)match(input,50,FOLLOW_50_in_ruleDirections8211); 

                            current = grammarAccess.getDirectionsAccess().getEASTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDirectionsAccess().getEASTEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3215:6: (enumLiteral_5= 'NORTH_EAST' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3215:6: (enumLiteral_5= 'NORTH_EAST' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3215:8: enumLiteral_5= 'NORTH_EAST'
                    {
                    enumLiteral_5=(Token)match(input,81,FOLLOW_81_in_ruleDirections8228); 

                            current = grammarAccess.getDirectionsAccess().getNORTH_EASTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDirectionsAccess().getNORTH_EASTEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3221:6: (enumLiteral_6= 'NORTH_WEST' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3221:6: (enumLiteral_6= 'NORTH_WEST' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3221:8: enumLiteral_6= 'NORTH_WEST'
                    {
                    enumLiteral_6=(Token)match(input,82,FOLLOW_82_in_ruleDirections8245); 

                            current = grammarAccess.getDirectionsAccess().getNORTH_WESTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDirectionsAccess().getNORTH_WESTEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3227:6: (enumLiteral_7= 'SOUTH_EAST' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3227:6: (enumLiteral_7= 'SOUTH_EAST' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3227:8: enumLiteral_7= 'SOUTH_EAST'
                    {
                    enumLiteral_7=(Token)match(input,83,FOLLOW_83_in_ruleDirections8262); 

                            current = grammarAccess.getDirectionsAccess().getSOUTH_EASTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getDirectionsAccess().getSOUTH_EASTEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3233:6: (enumLiteral_8= 'SOUTH_WEST' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3233:6: (enumLiteral_8= 'SOUTH_WEST' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:3233:8: enumLiteral_8= 'SOUTH_WEST'
                    {
                    enumLiteral_8=(Token)match(input,84,FOLLOW_84_in_ruleDirections8279); 

                            current = grammarAccess.getDirectionsAccess().getSOUTH_WESTEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getDirectionsAccess().getSOUTH_WESTEnumLiteralDeclaration_8()); 
                        

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
    // $ANTLR end "ruleDirections"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA7_eotS =
        "\16\uffff";
    static final String DFA7_eofS =
        "\16\uffff";
    static final String DFA7_minS =
        "\1\21\15\uffff";
    static final String DFA7_maxS =
        "\1\54\15\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\15\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14";
    static final String DFA7_specialS =
        "\1\0\15\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\1\5\2\uffff\1\14\1\uffff\1\2\1\3\1\4\1\6\1\7\1\10\1\13"+
            "\10\uffff\1\11\1\12\4\uffff\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()+ loopback of 638:3: ( ({...}? => ( ({...}? => (otherlv_4= 'text' otherlv_5= '=' ( (lv_text_6_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= '=' ( (lv_widht_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= '=' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_image_13_0= ruleBoxImage ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'border' otherlv_15= '{' ( (lv_border_16_0= ruleBorder ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'foreground-color' otherlv_19= '=' ( (lv_foregroundColor_20_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'background-color' otherlv_22= '=' ( (lv_backgroundColor_23_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_24_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_25_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'content-direction' otherlv_27= '=' ( (lv_contentDirection_28_0= ruleDirections ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'tooltip' otherlv_30= '=' ( (lv_tooltip_31_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_32_0= ruleActivation ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_0 = input.LA(1);

                         
                        int index7_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA7_0==17) ) {s = 1;}

                        else if ( LA7_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA7_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA7_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA7_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA7_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA7_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA7_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA7_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA7_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                        else if ( LA7_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 9) ) {s = 11;}

                        else if ( LA7_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 10) ) {s = 12;}

                        else if ( LA7_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getBoxDecorationAccess().getUnorderedGroup_3(), 11) ) {s = 13;}

                         
                        input.seek(index7_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA11_eotS =
        "\7\uffff";
    static final String DFA11_eofS =
        "\1\uffff\2\3\3\uffff\1\3";
    static final String DFA11_minS =
        "\1\4\2\21\2\uffff\1\10\1\21";
    static final String DFA11_maxS =
        "\1\10\1\54\1\57\2\uffff\1\10\1\57";
    static final String DFA11_acceptS =
        "\3\uffff\1\1\1\2\2\uffff";
    static final String DFA11_specialS =
        "\7\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\3\uffff\1\2",
            "\3\3\1\uffff\1\3\1\uffff\7\3\4\uffff\1\4\3\uffff\2\3\4\uffff"+
            "\1\3",
            "\3\3\1\uffff\1\3\1\uffff\7\3\4\uffff\1\4\3\uffff\2\3\4\uffff"+
            "\1\3\2\uffff\1\5",
            "",
            "",
            "\1\6",
            "\3\3\1\uffff\1\3\1\uffff\7\3\4\uffff\1\4\3\uffff\2\3\4\uffff"+
            "\1\3\2\uffff\1\5"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1599:1: (this_SimpleText_0= ruleSimpleText | this_ComplexText_1= ruleComplexText )";
        }
    }
 

    public static final BitSet FOLLOW_ruleDecorationModel_in_entryRuleDecorationModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecorationModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDecorationModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecorationModel139 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_ruleNamespace_in_ruleDecorationModel165 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleDecorationDescription_in_ruleDecorationModel187 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleNamespace271 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNamespace294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecorationDescription_in_entryRuleDecorationDescription330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecorationDescription340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDecorationDescription377 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDecorationDescription400 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDecorationDescription412 = new BitSet(new long[]{0x0000100244440000L});
    public static final BitSet FOLLOW_ruleAbstractDecoration_in_ruleDecorationDescription478 = new BitSet(new long[]{0x0000100244460000L});
    public static final BitSet FOLLOW_ruleActivation_in_ruleDecorationDescription554 = new BitSet(new long[]{0x0000100244460000L});
    public static final BitSet FOLLOW_17_in_ruleDecorationDescription612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDecoration_in_entryRuleAbstractDecoration648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDecoration658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageDecoration_in_ruleAbstractDecoration705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoxDecoration_in_ruleAbstractDecoration732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderDecoration_in_ruleAbstractDecoration759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorDecoration_in_ruleAbstractDecoration786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectionDecoration_in_ruleAbstractDecoration813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageDecoration_in_entryRuleImageDecoration848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageDecoration858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleImageDecoration904 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleImageDecoration916 = new BitSet(new long[]{0x000010C2446C0000L});
    public static final BitSet FOLLOW_19_in_ruleImageDecoration974 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleImageDecoration986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImageDecoration1003 = new BitSet(new long[]{0x000010C2446E0000L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleImageDecoration1084 = new BitSet(new long[]{0x000010C2446E0000L});
    public static final BitSet FOLLOW_ruleMargin_in_ruleImageDecoration1159 = new BitSet(new long[]{0x000010C2446E0000L});
    public static final BitSet FOLLOW_21_in_ruleImageDecoration1226 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleImageDecoration1238 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageDecoration1259 = new BitSet(new long[]{0x000010C2446E0000L});
    public static final BitSet FOLLOW_ruleActivation_in_ruleImageDecoration1335 = new BitSet(new long[]{0x000010C2446E0000L});
    public static final BitSet FOLLOW_17_in_ruleImageDecoration1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoxDecoration_in_entryRuleBoxDecoration1429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoxDecoration1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBoxDecoration1485 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBoxDecoration1497 = new BitSet(new long[]{0x000010C27FE40000L});
    public static final BitSet FOLLOW_23_in_ruleBoxDecoration1555 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBoxDecoration1567 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleText_in_ruleBoxDecoration1588 = new BitSet(new long[]{0x000010C27FE60000L});
    public static final BitSet FOLLOW_24_in_ruleBoxDecoration1656 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBoxDecoration1668 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBoxDecoration1685 = new BitSet(new long[]{0x000010C27FE60000L});
    public static final BitSet FOLLOW_25_in_ruleBoxDecoration1758 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBoxDecoration1770 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBoxDecoration1787 = new BitSet(new long[]{0x000010C27FE60000L});
    public static final BitSet FOLLOW_ruleBoxImage_in_ruleBoxDecoration1868 = new BitSet(new long[]{0x000010C27FE60000L});
    public static final BitSet FOLLOW_26_in_ruleBoxDecoration1935 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBoxDecoration1947 = new BitSet(new long[]{0x0000003040020000L});
    public static final BitSet FOLLOW_ruleBorder_in_ruleBoxDecoration1968 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBoxDecoration1980 = new BitSet(new long[]{0x000010C27FE60000L});
    public static final BitSet FOLLOW_27_in_ruleBoxDecoration2048 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBoxDecoration2060 = new BitSet(new long[]{0x0000010000000040L,0x000000000000FFFEL});
    public static final BitSet FOLLOW_ruleColor_in_ruleBoxDecoration2081 = new BitSet(new long[]{0x000010C27FE60000L});
    public static final BitSet FOLLOW_28_in_ruleBoxDecoration2149 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBoxDecoration2161 = new BitSet(new long[]{0x0000010000000040L,0x000000000000FFFEL});
    public static final BitSet FOLLOW_ruleColor_in_ruleBoxDecoration2182 = new BitSet(new long[]{0x000010C27FE60000L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleBoxDecoration2258 = new BitSet(new long[]{0x000010C27FE60000L});
    public static final BitSet FOLLOW_ruleMargin_in_ruleBoxDecoration2333 = new BitSet(new long[]{0x000010C27FE60000L});
    public static final BitSet FOLLOW_29_in_ruleBoxDecoration2400 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBoxDecoration2412 = new BitSet(new long[]{0x000F000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_ruleDirections_in_ruleBoxDecoration2433 = new BitSet(new long[]{0x000010C27FE60000L});
    public static final BitSet FOLLOW_21_in_ruleBoxDecoration2501 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBoxDecoration2513 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleText_in_ruleBoxDecoration2534 = new BitSet(new long[]{0x000010C27FE60000L});
    public static final BitSet FOLLOW_ruleActivation_in_ruleBoxDecoration2610 = new BitSet(new long[]{0x000010C27FE60000L});
    public static final BitSet FOLLOW_17_in_ruleBoxDecoration2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderDecoration_in_entryRuleBorderDecoration2704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorderDecoration2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBorderDecoration2760 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBorderDecoration2772 = new BitSet(new long[]{0x0000103244460000L});
    public static final BitSet FOLLOW_ruleBorder_in_ruleBorderDecoration2838 = new BitSet(new long[]{0x0000103244460000L});
    public static final BitSet FOLLOW_ruleActivation_in_ruleBorderDecoration2913 = new BitSet(new long[]{0x0000103244460000L});
    public static final BitSet FOLLOW_17_in_ruleBorderDecoration2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorDecoration_in_entryRuleColorDecoration3007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorDecoration3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleColorDecoration3063 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleColorDecoration3075 = new BitSet(new long[]{0x00001003C4460000L});
    public static final BitSet FOLLOW_31_in_ruleColorDecoration3133 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleColorDecoration3145 = new BitSet(new long[]{0x0000010000000040L,0x000000000000FFFEL});
    public static final BitSet FOLLOW_ruleColor_in_ruleColorDecoration3166 = new BitSet(new long[]{0x00001003C4460000L});
    public static final BitSet FOLLOW_32_in_ruleColorDecoration3234 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleColorDecoration3246 = new BitSet(new long[]{0x0000010000000040L,0x000000000000FFFEL});
    public static final BitSet FOLLOW_ruleColor_in_ruleColorDecoration3267 = new BitSet(new long[]{0x00001003C4460000L});
    public static final BitSet FOLLOW_ruleActivation_in_ruleColorDecoration3343 = new BitSet(new long[]{0x00001003C4460000L});
    public static final BitSet FOLLOW_17_in_ruleColorDecoration3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectionDecoration_in_entryRuleConnectionDecoration3431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnectionDecoration3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleConnectionDecoration3487 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConnectionDecoration3499 = new BitSet(new long[]{0x000010325C460000L});
    public static final BitSet FOLLOW_ruleSize_in_ruleConnectionDecoration3565 = new BitSet(new long[]{0x000010325C460000L});
    public static final BitSet FOLLOW_ruleStyle_in_ruleConnectionDecoration3640 = new BitSet(new long[]{0x000010325C460000L});
    public static final BitSet FOLLOW_27_in_ruleConnectionDecoration3707 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConnectionDecoration3719 = new BitSet(new long[]{0x0000010000000040L,0x000000000000FFFEL});
    public static final BitSet FOLLOW_ruleColor_in_ruleConnectionDecoration3740 = new BitSet(new long[]{0x000010325C460000L});
    public static final BitSet FOLLOW_28_in_ruleConnectionDecoration3808 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConnectionDecoration3820 = new BitSet(new long[]{0x0000010000000040L,0x000000000000FFFEL});
    public static final BitSet FOLLOW_ruleColor_in_ruleConnectionDecoration3841 = new BitSet(new long[]{0x000010325C460000L});
    public static final BitSet FOLLOW_ruleActivation_in_ruleConnectionDecoration3917 = new BitSet(new long[]{0x000010325C460000L});
    public static final BitSet FOLLOW_17_in_ruleConnectionDecoration3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText4005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleText_in_ruleText4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexText_in_ruleText4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleText_in_entryRuleSimpleText4124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleText4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleText4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSimpleText4210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexText_in_entryRuleComplexText4246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexText4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleText_in_ruleComplexText4302 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleComplexText4314 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleText_in_ruleComplexText4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorder_in_entryRuleBorder4371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorder4381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_ruleBorder4481 = new BitSet(new long[]{0x0000003040000002L});
    public static final BitSet FOLLOW_30_in_ruleBorder4548 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBorder4560 = new BitSet(new long[]{0x0000010000000040L,0x000000000000FFFEL});
    public static final BitSet FOLLOW_ruleColor_in_ruleBorder4581 = new BitSet(new long[]{0x0000003040000002L});
    public static final BitSet FOLLOW_ruleStyle_in_ruleBorder4657 = new BitSet(new long[]{0x0000003040000002L});
    public static final BitSet FOLLOW_ruleBoxImage_in_entryRuleBoxImage4733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoxImage4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBoxImage4789 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBoxImage4801 = new BitSet(new long[]{0x0000000800080000L});
    public static final BitSet FOLLOW_19_in_ruleBoxImage4859 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBoxImage4871 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBoxImage4888 = new BitSet(new long[]{0x00000008000A0000L});
    public static final BitSet FOLLOW_35_in_ruleBoxImage4961 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBoxImage4973 = new BitSet(new long[]{0x000F000000000000L});
    public static final BitSet FOLLOW_ruleBoxImageOrientation_in_ruleBoxImage4994 = new BitSet(new long[]{0x00000008000A0000L});
    public static final BitSet FOLLOW_17_in_ruleBoxImage5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyle_in_entryRuleStyle5089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyle5099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleStyle5136 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStyle5148 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleLineStyle_in_ruleStyle5169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_entryRuleSize5205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSize5215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSize5252 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSize5264 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSize5281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_entryRuleDirection5322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirection5332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDirection5369 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDirection5381 = new BitSet(new long[]{0x000F000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_ruleDirections_in_ruleDirection5402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMargin_in_entryRuleMargin5438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMargin5448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleMargin5485 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMargin5497 = new BitSet(new long[]{0x0000400000000020L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_ruleMargin5518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor5556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor5566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorConstant_in_ruleColor5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteColor_in_ruleColor5650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteColor_in_entryRuleConcreteColor5686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcreteColor5696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRGB_in_ruleConcreteColor5743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexColor_in_ruleConcreteColor5770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRGB_in_entryRuleRGB5805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRGB5815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleRGB5852 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleRGB5864 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRGB5881 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleRGB5898 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRGB5915 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleRGB5932 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRGB5949 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleRGB5966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexColor_in_entryRuleHexColor6002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexColor6012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_COLOR_in_ruleHexColor6053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorConstant_in_entryRuleColorConstant6093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorConstant6103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColors_in_ruleColorConstant6148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_entryRuleActivation6183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivation6193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleActivation6230 = new BitSet(new long[]{0x0C00200000000100L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_ruleActivation6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_entryRuleAbstractCondition6287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractCondition6297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleAbstractCondition6344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeCondition_in_ruleAbstractCondition6371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclExpression_in_ruleAbstractCondition6398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOclExpression_in_entryRuleOclExpression6433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOclExpression6443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOclExpression6480 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleOclExpression6492 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOclExpression6509 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleOclExpression6526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition6562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition6572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCondition6620 = new BitSet(new long[]{0x03F0000000000000L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleCondition6641 = new BitSet(new long[]{0x00004000000001B0L});
    public static final BitSet FOLLOW_ruleType_in_ruleCondition6662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition6698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeCondition6708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOperator_in_ruleCompositeCondition6754 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleCompositeCondition6766 = new BitSet(new long[]{0x0C00200000000100L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_ruleCompositeCondition6787 = new BitSet(new long[]{0x0C00280000000100L});
    public static final BitSet FOLLOW_43_in_ruleCompositeCondition6800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType6837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType6848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_ruleType6895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedDouble_in_ruleType6928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleType6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleType6980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType7006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedDouble_in_entryRuleSignedDouble7052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedDouble7063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleSignedDouble7102 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedDouble7119 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleSignedDouble7137 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedDouble7152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_entryRuleSignedInteger7198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedInteger7209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleSignedInteger7248 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedInteger7265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName7313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName7324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName7364 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleQualifiedName7383 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName7398 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_48_in_ruleBoxImageOrientation7459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleBoxImageOrientation7476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleBoxImageOrientation7493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleBoxImageOrientation7510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleComparisonOperator7555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleComparisonOperator7572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleComparisonOperator7589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleComparisonOperator7606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleComparisonOperator7623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleComparisonOperator7640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleLogicalOperator7685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleLogicalOperator7702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleLineStyle7747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleLineStyle7764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleLineStyle7781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleLineStyle7798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleLineStyle7815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleColors7860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleColors7877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleColors7894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleColors7911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleColors7928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleColors7945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleColors7962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleColors7979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleColors7996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleColors8013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleColors8030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleColors8047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleColors8064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleColors8081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleColors8098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleDirections8143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDirections8160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDirections8177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDirections8194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDirections8211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleDirections8228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleDirections8245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleDirections8262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleDirections8279 = new BitSet(new long[]{0x0000000000000002L});

}
