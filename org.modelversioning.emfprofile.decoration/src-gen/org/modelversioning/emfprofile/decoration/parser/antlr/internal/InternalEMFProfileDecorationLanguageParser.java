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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_BOOLEAN", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import resource'", "'profile'", "'decoration'", "'{'", "'}'", "'image'", "'location-uri'", "'='", "'tooltip'", "'border'", "'color'", "'background'", "'foreground'", "'connection'", "'foreground-color'", "'background-color'", "'+'", "'line-style'", "'size'", "'direction'", "'margin'", "'RGB'", "'('", "','", "')'", "'active when'", "'-'", "'.'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'all'", "'any'", "'solid'", "'dot'", "'dash'", "'dash_dot'", "'dash_dot_dot'", "'red'", "'black'", "'white'", "'green'", "'green_light'", "'green_dark'", "'blue'", "'blue_light'", "'blue_dark'", "'gray'", "'gray_light'", "'gray_dark'", "'orange'", "'yellow'", "'cyan'", "'center'", "'north'", "'south'", "'west'", "'east'", "'north_east'", "'north_west'", "'south_east'", "'south_west'"
    };
    public static final int T__68=68;
    public static final int RULE_BOOLEAN=6;
    public static final int T__69=69;
    public static final int RULE_ID=7;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;

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
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleDecorationModel122); 

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

            if ( (LA1_0==13) ) {
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

                if ( (LA2_0==14) ) {
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
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleNamespace271); 

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
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleDecorationDescription377); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleDecorationDescription412); 

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

                if ( (LA4_0==17|| LA4_0 >=21 && LA4_0<=22 ||LA4_0==25) && getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 1) ) {
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
            	        case 17:
            	            {
            	            int LA3_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	            }
            	            break;
            	        case 21:
            	            {
            	            int LA3_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	            }
            	            break;
            	        case 22:
            	            {
            	            int LA3_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	            }
            	            break;
            	        case 25:
            	            {
            	            int LA3_5 = input.LA(2);

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

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleDecorationDescription612); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:321:1: ruleAbstractDecoration returns [EObject current=null] : (this_ImageDecoration_0= ruleImageDecoration | this_BorderDecoration_1= ruleBorderDecoration | this_ColorDecoration_2= ruleColorDecoration | this_ConnectionDecoration_3= ruleConnectionDecoration ) ;
    public final EObject ruleAbstractDecoration() throws RecognitionException {
        EObject current = null;

        EObject this_ImageDecoration_0 = null;

        EObject this_BorderDecoration_1 = null;

        EObject this_ColorDecoration_2 = null;

        EObject this_ConnectionDecoration_3 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:324:28: ( (this_ImageDecoration_0= ruleImageDecoration | this_BorderDecoration_1= ruleBorderDecoration | this_ColorDecoration_2= ruleColorDecoration | this_ConnectionDecoration_3= ruleConnectionDecoration ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:325:1: (this_ImageDecoration_0= ruleImageDecoration | this_BorderDecoration_1= ruleBorderDecoration | this_ColorDecoration_2= ruleColorDecoration | this_ConnectionDecoration_3= ruleConnectionDecoration )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:325:1: (this_ImageDecoration_0= ruleImageDecoration | this_BorderDecoration_1= ruleBorderDecoration | this_ColorDecoration_2= ruleColorDecoration | this_ConnectionDecoration_3= ruleConnectionDecoration )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            case 25:
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
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:336:5: this_BorderDecoration_1= ruleBorderDecoration
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDecorationAccess().getBorderDecorationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBorderDecoration_in_ruleAbstractDecoration732);
                    this_BorderDecoration_1=ruleBorderDecoration();

                    state._fsp--;

                     
                            current = this_BorderDecoration_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:346:5: this_ColorDecoration_2= ruleColorDecoration
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDecorationAccess().getColorDecorationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleColorDecoration_in_ruleAbstractDecoration759);
                    this_ColorDecoration_2=ruleColorDecoration();

                    state._fsp--;

                     
                            current = this_ColorDecoration_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:356:5: this_ConnectionDecoration_3= ruleConnectionDecoration
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDecorationAccess().getConnectionDecorationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleConnectionDecoration_in_ruleAbstractDecoration786);
                    this_ConnectionDecoration_3=ruleConnectionDecoration();

                    state._fsp--;

                     
                            current = this_ConnectionDecoration_3; 
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:372:1: entryRuleImageDecoration returns [EObject current=null] : iv_ruleImageDecoration= ruleImageDecoration EOF ;
    public final EObject entryRuleImageDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageDecoration = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:373:2: (iv_ruleImageDecoration= ruleImageDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:374:2: iv_ruleImageDecoration= ruleImageDecoration EOF
            {
             newCompositeNode(grammarAccess.getImageDecorationRule()); 
            pushFollow(FOLLOW_ruleImageDecoration_in_entryRuleImageDecoration821);
            iv_ruleImageDecoration=ruleImageDecoration();

            state._fsp--;

             current =iv_ruleImageDecoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageDecoration831); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:381:1: ruleImageDecoration returns [EObject current=null] : ( () otherlv_1= 'image' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' ) ;
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
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:384:28: ( ( () otherlv_1= 'image' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:385:1: ( () otherlv_1= 'image' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:385:1: ( () otherlv_1= 'image' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:385:2: () otherlv_1= 'image' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}'
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:385:2: ()
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:386:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImageDecorationAccess().getImageDecorationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleImageDecoration877); 

                	newLeafNode(otherlv_1, grammarAccess.getImageDecorationAccess().getImageKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleImageDecoration889); 

                	newLeafNode(otherlv_2, grammarAccess.getImageDecorationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:399:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:401:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:401:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:402:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3());
            	
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:405:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?)
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:406:3: ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:406:3: ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=6;
                int LA6_0 = input.LA(1);

                if ( LA6_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0) ) {
                    alt6=1;
                }
                else if ( LA6_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1) ) {
                    alt6=2;
                }
                else if ( LA6_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2) ) {
                    alt6=3;
                }
                else if ( LA6_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3) ) {
                    alt6=4;
                }
                else if ( LA6_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4) ) {
                    alt6=5;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:408:4: ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:408:4: ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:409:5: {...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleImageDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:409:112: ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:410:6: ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:413:6: ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:413:7: {...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImageDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:413:16: (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:413:18: otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleImageDecoration947); 

            	        	newLeafNode(otherlv_4, grammarAccess.getImageDecorationAccess().getLocationUriKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleImageDecoration959); 

            	        	newLeafNode(otherlv_5, grammarAccess.getImageDecorationAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:421:1: ( (lv_location_uri_6_0= RULE_STRING ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:422:1: (lv_location_uri_6_0= RULE_STRING )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:422:1: (lv_location_uri_6_0= RULE_STRING )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:423:3: lv_location_uri_6_0= RULE_STRING
            	    {
            	    lv_location_uri_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImageDecoration976); 

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
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:446:4: ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:446:4: ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:447:5: {...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleImageDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:447:112: ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:448:6: ({...}? => ( (lv_direction_7_0= ruleDirection ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:451:6: ({...}? => ( (lv_direction_7_0= ruleDirection ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:451:7: {...}? => ( (lv_direction_7_0= ruleDirection ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImageDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:451:16: ( (lv_direction_7_0= ruleDirection ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:452:1: (lv_direction_7_0= ruleDirection )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:452:1: (lv_direction_7_0= ruleDirection )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:453:3: lv_direction_7_0= ruleDirection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageDecorationAccess().getDirectionDirectionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDirection_in_ruleImageDecoration1057);
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
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:476:4: ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:476:4: ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:477:5: {...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleImageDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:477:112: ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:478:6: ({...}? => ( (lv_margin_8_0= ruleMargin ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:481:6: ({...}? => ( (lv_margin_8_0= ruleMargin ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:481:7: {...}? => ( (lv_margin_8_0= ruleMargin ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImageDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:481:16: ( (lv_margin_8_0= ruleMargin ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:482:1: (lv_margin_8_0= ruleMargin )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:482:1: (lv_margin_8_0= ruleMargin )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:483:3: lv_margin_8_0= ruleMargin
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageDecorationAccess().getMarginMarginParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMargin_in_ruleImageDecoration1132);
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
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:506:4: ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:506:4: ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:507:5: {...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleImageDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:507:112: ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:508:6: ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:511:6: ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:511:7: {...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImageDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:511:16: (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:511:18: otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) )
            	    {
            	    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleImageDecoration1199); 

            	        	newLeafNode(otherlv_9, grammarAccess.getImageDecorationAccess().getTooltipKeyword_3_3_0());
            	        
            	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleImageDecoration1211); 

            	        	newLeafNode(otherlv_10, grammarAccess.getImageDecorationAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:519:1: ( (lv_tooltip_11_0= ruleText ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:520:1: (lv_tooltip_11_0= ruleText )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:520:1: (lv_tooltip_11_0= ruleText )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:521:3: lv_tooltip_11_0= ruleText
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageDecorationAccess().getTooltipTextParserRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleText_in_ruleImageDecoration1232);
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
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:544:4: ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:544:4: ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:545:5: {...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleImageDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:545:112: ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:546:6: ({...}? => ( (lv_activation_12_0= ruleActivation ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:549:6: ({...}? => ( (lv_activation_12_0= ruleActivation ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:549:7: {...}? => ( (lv_activation_12_0= ruleActivation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImageDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:549:16: ( (lv_activation_12_0= ruleActivation ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:550:1: (lv_activation_12_0= ruleActivation )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:550:1: (lv_activation_12_0= ruleActivation )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:551:3: lv_activation_12_0= ruleActivation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImageDecorationAccess().getActivationActivationParserRuleCall_3_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivation_in_ruleImageDecoration1308);
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

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleImageDecoration1366); 

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


    // $ANTLR start "entryRuleBorderDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:594:1: entryRuleBorderDecoration returns [EObject current=null] : iv_ruleBorderDecoration= ruleBorderDecoration EOF ;
    public final EObject entryRuleBorderDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorderDecoration = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:595:2: (iv_ruleBorderDecoration= ruleBorderDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:596:2: iv_ruleBorderDecoration= ruleBorderDecoration EOF
            {
             newCompositeNode(grammarAccess.getBorderDecorationRule()); 
            pushFollow(FOLLOW_ruleBorderDecoration_in_entryRuleBorderDecoration1402);
            iv_ruleBorderDecoration=ruleBorderDecoration();

            state._fsp--;

             current =iv_ruleBorderDecoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorderDecoration1412); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:603:1: ruleBorderDecoration returns [EObject current=null] : ( () otherlv_1= 'border' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) ;
    public final EObject ruleBorderDecoration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        EObject lv_size_4_0 = null;

        EObject lv_color_7_0 = null;

        EObject lv_style_8_0 = null;

        EObject lv_activation_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:606:28: ( ( () otherlv_1= 'border' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:607:1: ( () otherlv_1= 'border' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_10= '}' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:607:1: ( () otherlv_1= 'border' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_10= '}' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:607:2: () otherlv_1= 'border' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_10= '}'
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:607:2: ()
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:608:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBorderDecorationAccess().getBorderDecorationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleBorderDecoration1458); 

                	newLeafNode(otherlv_1, grammarAccess.getBorderDecorationAccess().getBorderKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleBorderDecoration1470); 

                	newLeafNode(otherlv_2, grammarAccess.getBorderDecorationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:621:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )* ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:623:1: ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )* ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:623:1: ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )* ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:624:2: ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3());
            	
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:627:2: ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )* )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:628:3: ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )*
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:628:3: ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )*
            loop7:
            do {
                int alt7=5;
                int LA7_0 = input.LA(1);

                if ( LA7_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1) ) {
                    alt7=2;
                }
                else if ( LA7_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2) ) {
                    alt7=3;
                }
                else if ( LA7_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3) ) {
                    alt7=4;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:630:4: ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:630:4: ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:631:5: {...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBorderDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:631:113: ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:632:6: ({...}? => ( (lv_size_4_0= ruleSize ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:635:6: ({...}? => ( (lv_size_4_0= ruleSize ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:635:7: {...}? => ( (lv_size_4_0= ruleSize ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBorderDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:635:16: ( (lv_size_4_0= ruleSize ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:636:1: (lv_size_4_0= ruleSize )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:636:1: (lv_size_4_0= ruleSize )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:637:3: lv_size_4_0= ruleSize
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBorderDecorationAccess().getSizeSizeParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSize_in_ruleBorderDecoration1536);
            	    lv_size_4_0=ruleSize();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBorderDecorationRule());
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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:660:4: ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:660:4: ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:661:5: {...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBorderDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:661:113: ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:662:6: ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:665:6: ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:665:7: {...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBorderDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:665:16: (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:665:18: otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) )
            	    {
            	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleBorderDecoration1603); 

            	        	newLeafNode(otherlv_5, grammarAccess.getBorderDecorationAccess().getColorKeyword_3_1_0());
            	        
            	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleBorderDecoration1615); 

            	        	newLeafNode(otherlv_6, grammarAccess.getBorderDecorationAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:673:1: ( (lv_color_7_0= ruleColor ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:674:1: (lv_color_7_0= ruleColor )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:674:1: (lv_color_7_0= ruleColor )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:675:3: lv_color_7_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBorderDecorationAccess().getColorColorParserRuleCall_3_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleBorderDecoration1636);
            	    lv_color_7_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBorderDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"color",
            	            		lv_color_7_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:698:4: ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:698:4: ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:699:5: {...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleBorderDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:699:113: ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:700:6: ({...}? => ( (lv_style_8_0= ruleStyle ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:703:6: ({...}? => ( (lv_style_8_0= ruleStyle ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:703:7: {...}? => ( (lv_style_8_0= ruleStyle ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBorderDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:703:16: ( (lv_style_8_0= ruleStyle ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:704:1: (lv_style_8_0= ruleStyle )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:704:1: (lv_style_8_0= ruleStyle )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:705:3: lv_style_8_0= ruleStyle
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBorderDecorationAccess().getStyleStyleParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStyle_in_ruleBorderDecoration1712);
            	    lv_style_8_0=ruleStyle();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBorderDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"style",
            	            		lv_style_8_0, 
            	            		"Style");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:728:4: ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:728:4: ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:729:5: {...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleBorderDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:729:113: ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:730:6: ({...}? => ( (lv_activation_9_0= ruleActivation ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:733:6: ({...}? => ( (lv_activation_9_0= ruleActivation ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:733:7: {...}? => ( (lv_activation_9_0= ruleActivation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBorderDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:733:16: ( (lv_activation_9_0= ruleActivation ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:734:1: (lv_activation_9_0= ruleActivation )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:734:1: (lv_activation_9_0= ruleActivation )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:735:3: lv_activation_9_0= ruleActivation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBorderDecorationAccess().getActivationActivationParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivation_in_ruleBorderDecoration1787);
            	    lv_activation_9_0=ruleActivation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBorderDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"activation",
            	            		lv_activation_9_0, 
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
            	    break loop7;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3());
            	

            }

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleBorderDecoration1839); 

                	newLeafNode(otherlv_10, grammarAccess.getBorderDecorationAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:777:1: entryRuleColorDecoration returns [EObject current=null] : iv_ruleColorDecoration= ruleColorDecoration EOF ;
    public final EObject entryRuleColorDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorDecoration = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:778:2: (iv_ruleColorDecoration= ruleColorDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:779:2: iv_ruleColorDecoration= ruleColorDecoration EOF
            {
             newCompositeNode(grammarAccess.getColorDecorationRule()); 
            pushFollow(FOLLOW_ruleColorDecoration_in_entryRuleColorDecoration1875);
            iv_ruleColorDecoration=ruleColorDecoration();

            state._fsp--;

             current =iv_ruleColorDecoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorDecoration1885); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:786:1: ruleColorDecoration returns [EObject current=null] : ( () otherlv_1= 'color' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_11= '}' ) ;
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
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:789:28: ( ( () otherlv_1= 'color' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_11= '}' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:790:1: ( () otherlv_1= 'color' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_11= '}' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:790:1: ( () otherlv_1= 'color' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_11= '}' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:790:2: () otherlv_1= 'color' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_11= '}'
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:790:2: ()
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:791:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getColorDecorationAccess().getColorDecorationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleColorDecoration1931); 

                	newLeafNode(otherlv_1, grammarAccess.getColorDecorationAccess().getColorKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleColorDecoration1943); 

                	newLeafNode(otherlv_2, grammarAccess.getColorDecorationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:804:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )* ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:806:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )* ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:806:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )* ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:807:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3());
            	
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:810:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )* )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:811:3: ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )*
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:811:3: ( ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) ) )*
            loop8:
            do {
                int alt8=4;
                int LA8_0 = input.LA(1);

                if ( LA8_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1) ) {
                    alt8=2;
                }
                else if ( LA8_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2) ) {
                    alt8=3;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:813:4: ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:813:4: ({...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:814:5: {...}? => ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleColorDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:814:112: ( ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:815:6: ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:818:6: ({...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:818:7: {...}? => (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleColorDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:818:16: (otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:818:18: otherlv_4= 'background' otherlv_5= '=' ( (lv_background_6_0= ruleColor ) )
            	    {
            	    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleColorDecoration2001); 

            	        	newLeafNode(otherlv_4, grammarAccess.getColorDecorationAccess().getBackgroundKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleColorDecoration2013); 

            	        	newLeafNode(otherlv_5, grammarAccess.getColorDecorationAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:826:1: ( (lv_background_6_0= ruleColor ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:827:1: (lv_background_6_0= ruleColor )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:827:1: (lv_background_6_0= ruleColor )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:828:3: lv_background_6_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getColorDecorationAccess().getBackgroundColorParserRuleCall_3_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleColorDecoration2034);
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
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:851:4: ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:851:4: ({...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:852:5: {...}? => ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleColorDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:852:112: ( ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:853:6: ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:856:6: ({...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:856:7: {...}? => (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleColorDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:856:16: (otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:856:18: otherlv_7= 'foreground' otherlv_8= '=' ( (lv_foreground_9_0= ruleColor ) )
            	    {
            	    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleColorDecoration2102); 

            	        	newLeafNode(otherlv_7, grammarAccess.getColorDecorationAccess().getForegroundKeyword_3_1_0());
            	        
            	    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleColorDecoration2114); 

            	        	newLeafNode(otherlv_8, grammarAccess.getColorDecorationAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:864:1: ( (lv_foreground_9_0= ruleColor ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:865:1: (lv_foreground_9_0= ruleColor )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:865:1: (lv_foreground_9_0= ruleColor )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:866:3: lv_foreground_9_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getColorDecorationAccess().getForegroundColorParserRuleCall_3_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleColorDecoration2135);
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
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:889:4: ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:889:4: ({...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:890:5: {...}? => ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleColorDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:890:112: ( ({...}? => ( (lv_activation_10_0= ruleActivation ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:891:6: ({...}? => ( (lv_activation_10_0= ruleActivation ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:894:6: ({...}? => ( (lv_activation_10_0= ruleActivation ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:894:7: {...}? => ( (lv_activation_10_0= ruleActivation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleColorDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:894:16: ( (lv_activation_10_0= ruleActivation ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:895:1: (lv_activation_10_0= ruleActivation )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:895:1: (lv_activation_10_0= ruleActivation )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:896:3: lv_activation_10_0= ruleActivation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getColorDecorationAccess().getActivationActivationParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivation_in_ruleColorDecoration2211);
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
            	    break loop8;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3());
            	

            }

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleColorDecoration2263); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:938:1: entryRuleConnectionDecoration returns [EObject current=null] : iv_ruleConnectionDecoration= ruleConnectionDecoration EOF ;
    public final EObject entryRuleConnectionDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionDecoration = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:939:2: (iv_ruleConnectionDecoration= ruleConnectionDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:940:2: iv_ruleConnectionDecoration= ruleConnectionDecoration EOF
            {
             newCompositeNode(grammarAccess.getConnectionDecorationRule()); 
            pushFollow(FOLLOW_ruleConnectionDecoration_in_entryRuleConnectionDecoration2299);
            iv_ruleConnectionDecoration=ruleConnectionDecoration();

            state._fsp--;

             current =iv_ruleConnectionDecoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnectionDecoration2309); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:947:1: ruleConnectionDecoration returns [EObject current=null] : ( () otherlv_1= 'connection' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_13= '}' ) ;
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
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:950:28: ( ( () otherlv_1= 'connection' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_13= '}' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:951:1: ( () otherlv_1= 'connection' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_13= '}' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:951:1: ( () otherlv_1= 'connection' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_13= '}' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:951:2: () otherlv_1= 'connection' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_13= '}'
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:951:2: ()
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:952:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConnectionDecorationAccess().getConnectionDecorationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleConnectionDecoration2355); 

                	newLeafNode(otherlv_1, grammarAccess.getConnectionDecorationAccess().getConnectionKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleConnectionDecoration2367); 

                	newLeafNode(otherlv_2, grammarAccess.getConnectionDecorationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:965:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:967:1: ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:967:1: ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:968:2: ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3());
            	
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:971:2: ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:972:3: ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )*
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:972:3: ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )*
            loop9:
            do {
                int alt9=6;
                int LA9_0 = input.LA(1);

                if ( LA9_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1) ) {
                    alt9=2;
                }
                else if ( LA9_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2) ) {
                    alt9=3;
                }
                else if ( LA9_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3) ) {
                    alt9=4;
                }
                else if ( LA9_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4) ) {
                    alt9=5;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:974:4: ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:974:4: ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:975:5: {...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:975:117: ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:976:6: ({...}? => ( (lv_size_4_0= ruleSize ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:979:6: ({...}? => ( (lv_size_4_0= ruleSize ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:979:7: {...}? => ( (lv_size_4_0= ruleSize ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:979:16: ( (lv_size_4_0= ruleSize ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:980:1: (lv_size_4_0= ruleSize )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:980:1: (lv_size_4_0= ruleSize )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:981:3: lv_size_4_0= ruleSize
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectionDecorationAccess().getSizeSizeParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSize_in_ruleConnectionDecoration2433);
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
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1004:4: ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1004:4: ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1005:5: {...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1005:117: ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1006:6: ({...}? => ( (lv_style_5_0= ruleStyle ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1009:6: ({...}? => ( (lv_style_5_0= ruleStyle ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1009:7: {...}? => ( (lv_style_5_0= ruleStyle ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1009:16: ( (lv_style_5_0= ruleStyle ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1010:1: (lv_style_5_0= ruleStyle )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1010:1: (lv_style_5_0= ruleStyle )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1011:3: lv_style_5_0= ruleStyle
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectionDecorationAccess().getStyleStyleParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStyle_in_ruleConnectionDecoration2508);
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
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1034:4: ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1034:4: ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1035:5: {...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1035:117: ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1036:6: ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1039:6: ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1039:7: {...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1039:16: (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1039:18: otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) )
            	    {
            	    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleConnectionDecoration2575); 

            	        	newLeafNode(otherlv_6, grammarAccess.getConnectionDecorationAccess().getForegroundColorKeyword_3_2_0());
            	        
            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleConnectionDecoration2587); 

            	        	newLeafNode(otherlv_7, grammarAccess.getConnectionDecorationAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1047:1: ( (lv_foregroundColor_8_0= ruleColor ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1048:1: (lv_foregroundColor_8_0= ruleColor )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1048:1: (lv_foregroundColor_8_0= ruleColor )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1049:3: lv_foregroundColor_8_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectionDecorationAccess().getForegroundColorColorParserRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleConnectionDecoration2608);
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
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1072:4: ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1072:4: ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1073:5: {...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1073:117: ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1074:6: ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1077:6: ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1077:7: {...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1077:16: (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1077:18: otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) )
            	    {
            	    otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleConnectionDecoration2676); 

            	        	newLeafNode(otherlv_9, grammarAccess.getConnectionDecorationAccess().getBackgroundColorKeyword_3_3_0());
            	        
            	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleConnectionDecoration2688); 

            	        	newLeafNode(otherlv_10, grammarAccess.getConnectionDecorationAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1085:1: ( (lv_backgroundColor_11_0= ruleColor ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1086:1: (lv_backgroundColor_11_0= ruleColor )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1086:1: (lv_backgroundColor_11_0= ruleColor )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1087:3: lv_backgroundColor_11_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectionDecorationAccess().getBackgroundColorColorParserRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleConnectionDecoration2709);
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
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1110:4: ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1110:4: ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1111:5: {...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1111:117: ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1112:6: ({...}? => ( (lv_activation_12_0= ruleActivation ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1115:6: ({...}? => ( (lv_activation_12_0= ruleActivation ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1115:7: {...}? => ( (lv_activation_12_0= ruleActivation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1115:16: ( (lv_activation_12_0= ruleActivation ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1116:1: (lv_activation_12_0= ruleActivation )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1116:1: (lv_activation_12_0= ruleActivation )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1117:3: lv_activation_12_0= ruleActivation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectionDecorationAccess().getActivationActivationParserRuleCall_3_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivation_in_ruleConnectionDecoration2785);
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
            	    break loop9;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3());
            	

            }

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleConnectionDecoration2837); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1159:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1160:2: (iv_ruleText= ruleText EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1161:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText2873);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText2883); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1168:1: ruleText returns [EObject current=null] : (this_SimpleText_0= ruleSimpleText | this_ComplexText_1= ruleComplexText ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleText_0 = null;

        EObject this_ComplexText_1 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1171:28: ( (this_SimpleText_0= ruleSimpleText | this_ComplexText_1= ruleComplexText ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1172:1: (this_SimpleText_0= ruleSimpleText | this_ComplexText_1= ruleComplexText )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1172:1: (this_SimpleText_0= ruleSimpleText | this_ComplexText_1= ruleComplexText )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1173:5: this_SimpleText_0= ruleSimpleText
                    {
                     
                            newCompositeNode(grammarAccess.getTextAccess().getSimpleTextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleText_in_ruleText2930);
                    this_SimpleText_0=ruleSimpleText();

                    state._fsp--;

                     
                            current = this_SimpleText_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1183:5: this_ComplexText_1= ruleComplexText
                    {
                     
                            newCompositeNode(grammarAccess.getTextAccess().getComplexTextParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComplexText_in_ruleText2957);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1199:1: entryRuleSimpleText returns [EObject current=null] : iv_ruleSimpleText= ruleSimpleText EOF ;
    public final EObject entryRuleSimpleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleText = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1200:2: (iv_ruleSimpleText= ruleSimpleText EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1201:2: iv_ruleSimpleText= ruleSimpleText EOF
            {
             newCompositeNode(grammarAccess.getSimpleTextRule()); 
            pushFollow(FOLLOW_ruleSimpleText_in_entryRuleSimpleText2992);
            iv_ruleSimpleText=ruleSimpleText();

            state._fsp--;

             current =iv_ruleSimpleText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleText3002); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1208:1: ruleSimpleText returns [EObject current=null] : ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleSimpleText() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1211:28: ( ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( ruleQualifiedName ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1212:1: ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( ruleQualifiedName ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1212:1: ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( ruleQualifiedName ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1212:2: ( (lv_text_0_0= RULE_STRING ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1212:2: ( (lv_text_0_0= RULE_STRING ) )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1213:1: (lv_text_0_0= RULE_STRING )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1213:1: (lv_text_0_0= RULE_STRING )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1214:3: lv_text_0_0= RULE_STRING
                    {
                    lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleText3044); 

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
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1231:6: ( ( ruleQualifiedName ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1231:6: ( ( ruleQualifiedName ) )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1232:1: ( ruleQualifiedName )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1232:1: ( ruleQualifiedName )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1233:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleTextRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSimpleTextAccess().getAttributeEAttributeCrossReference_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSimpleText3078);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1254:1: entryRuleComplexText returns [EObject current=null] : iv_ruleComplexText= ruleComplexText EOF ;
    public final EObject entryRuleComplexText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexText = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1255:2: (iv_ruleComplexText= ruleComplexText EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1256:2: iv_ruleComplexText= ruleComplexText EOF
            {
             newCompositeNode(grammarAccess.getComplexTextRule()); 
            pushFollow(FOLLOW_ruleComplexText_in_entryRuleComplexText3114);
            iv_ruleComplexText=ruleComplexText();

            state._fsp--;

             current =iv_ruleComplexText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexText3124); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1263:1: ruleComplexText returns [EObject current=null] : ( ( (lv_left_0_0= ruleSimpleText ) ) otherlv_1= '+' ( (lv_right_2_0= ruleText ) ) ) ;
    public final EObject ruleComplexText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1266:28: ( ( ( (lv_left_0_0= ruleSimpleText ) ) otherlv_1= '+' ( (lv_right_2_0= ruleText ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1267:1: ( ( (lv_left_0_0= ruleSimpleText ) ) otherlv_1= '+' ( (lv_right_2_0= ruleText ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1267:1: ( ( (lv_left_0_0= ruleSimpleText ) ) otherlv_1= '+' ( (lv_right_2_0= ruleText ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1267:2: ( (lv_left_0_0= ruleSimpleText ) ) otherlv_1= '+' ( (lv_right_2_0= ruleText ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1267:2: ( (lv_left_0_0= ruleSimpleText ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1268:1: (lv_left_0_0= ruleSimpleText )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1268:1: (lv_left_0_0= ruleSimpleText )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1269:3: lv_left_0_0= ruleSimpleText
            {
             
            	        newCompositeNode(grammarAccess.getComplexTextAccess().getLeftSimpleTextParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSimpleText_in_ruleComplexText3170);
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

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleComplexText3182); 

                	newLeafNode(otherlv_1, grammarAccess.getComplexTextAccess().getPlusSignKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1289:1: ( (lv_right_2_0= ruleText ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1290:1: (lv_right_2_0= ruleText )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1290:1: (lv_right_2_0= ruleText )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1291:3: lv_right_2_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getComplexTextAccess().getRightTextParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleComplexText3203);
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


    // $ANTLR start "entryRuleStyle"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1315:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1316:2: (iv_ruleStyle= ruleStyle EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1317:2: iv_ruleStyle= ruleStyle EOF
            {
             newCompositeNode(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_ruleStyle_in_entryRuleStyle3239);
            iv_ruleStyle=ruleStyle();

            state._fsp--;

             current =iv_ruleStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStyle3249); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1324:1: ruleStyle returns [EObject current=null] : (otherlv_0= 'line-style' otherlv_1= '=' ( (lv_value_2_0= ruleLineStyle ) ) ) ;
    public final EObject ruleStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1327:28: ( (otherlv_0= 'line-style' otherlv_1= '=' ( (lv_value_2_0= ruleLineStyle ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1328:1: (otherlv_0= 'line-style' otherlv_1= '=' ( (lv_value_2_0= ruleLineStyle ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1328:1: (otherlv_0= 'line-style' otherlv_1= '=' ( (lv_value_2_0= ruleLineStyle ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1328:3: otherlv_0= 'line-style' otherlv_1= '=' ( (lv_value_2_0= ruleLineStyle ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleStyle3286); 

                	newLeafNode(otherlv_0, grammarAccess.getStyleAccess().getLineStyleKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleStyle3298); 

                	newLeafNode(otherlv_1, grammarAccess.getStyleAccess().getEqualsSignKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1336:1: ( (lv_value_2_0= ruleLineStyle ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1337:1: (lv_value_2_0= ruleLineStyle )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1337:1: (lv_value_2_0= ruleLineStyle )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1338:3: lv_value_2_0= ruleLineStyle
            {
             
            	        newCompositeNode(grammarAccess.getStyleAccess().getValueLineStyleEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLineStyle_in_ruleStyle3319);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1362:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1363:2: (iv_ruleSize= ruleSize EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1364:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_ruleSize_in_entryRuleSize3355);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSize3365); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1371:1: ruleSize returns [EObject current=null] : (otherlv_0= 'size' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1374:28: ( (otherlv_0= 'size' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1375:1: (otherlv_0= 'size' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1375:1: (otherlv_0= 'size' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1375:3: otherlv_0= 'size' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleSize3402); 

                	newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleSize3414); 

                	newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getEqualsSignKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1383:1: ( (lv_value_2_0= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1384:1: (lv_value_2_0= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1384:1: (lv_value_2_0= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1385:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSize3431); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1409:1: entryRuleDirection returns [EObject current=null] : iv_ruleDirection= ruleDirection EOF ;
    public final EObject entryRuleDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirection = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1410:2: (iv_ruleDirection= ruleDirection EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1411:2: iv_ruleDirection= ruleDirection EOF
            {
             newCompositeNode(grammarAccess.getDirectionRule()); 
            pushFollow(FOLLOW_ruleDirection_in_entryRuleDirection3472);
            iv_ruleDirection=ruleDirection();

            state._fsp--;

             current =iv_ruleDirection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirection3482); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1418:1: ruleDirection returns [EObject current=null] : (otherlv_0= 'direction' otherlv_1= '=' ( (lv_value_2_0= ruleDirections ) ) ) ;
    public final EObject ruleDirection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1421:28: ( (otherlv_0= 'direction' otherlv_1= '=' ( (lv_value_2_0= ruleDirections ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1422:1: (otherlv_0= 'direction' otherlv_1= '=' ( (lv_value_2_0= ruleDirections ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1422:1: (otherlv_0= 'direction' otherlv_1= '=' ( (lv_value_2_0= ruleDirections ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1422:3: otherlv_0= 'direction' otherlv_1= '=' ( (lv_value_2_0= ruleDirections ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleDirection3519); 

                	newLeafNode(otherlv_0, grammarAccess.getDirectionAccess().getDirectionKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleDirection3531); 

                	newLeafNode(otherlv_1, grammarAccess.getDirectionAccess().getEqualsSignKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1430:1: ( (lv_value_2_0= ruleDirections ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1431:1: (lv_value_2_0= ruleDirections )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1431:1: (lv_value_2_0= ruleDirections )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1432:3: lv_value_2_0= ruleDirections
            {
             
            	        newCompositeNode(grammarAccess.getDirectionAccess().getValueDirectionsEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDirections_in_ruleDirection3552);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1456:1: entryRuleMargin returns [EObject current=null] : iv_ruleMargin= ruleMargin EOF ;
    public final EObject entryRuleMargin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMargin = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1457:2: (iv_ruleMargin= ruleMargin EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1458:2: iv_ruleMargin= ruleMargin EOF
            {
             newCompositeNode(grammarAccess.getMarginRule()); 
            pushFollow(FOLLOW_ruleMargin_in_entryRuleMargin3588);
            iv_ruleMargin=ruleMargin();

            state._fsp--;

             current =iv_ruleMargin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMargin3598); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1465:1: ruleMargin returns [EObject current=null] : (otherlv_0= 'margin' otherlv_1= '=' ( (lv_value_2_0= ruleSignedInteger ) ) ) ;
    public final EObject ruleMargin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1468:28: ( (otherlv_0= 'margin' otherlv_1= '=' ( (lv_value_2_0= ruleSignedInteger ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1469:1: (otherlv_0= 'margin' otherlv_1= '=' ( (lv_value_2_0= ruleSignedInteger ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1469:1: (otherlv_0= 'margin' otherlv_1= '=' ( (lv_value_2_0= ruleSignedInteger ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1469:3: otherlv_0= 'margin' otherlv_1= '=' ( (lv_value_2_0= ruleSignedInteger ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleMargin3635); 

                	newLeafNode(otherlv_0, grammarAccess.getMarginAccess().getMarginKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleMargin3647); 

                	newLeafNode(otherlv_1, grammarAccess.getMarginAccess().getEqualsSignKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1477:1: ( (lv_value_2_0= ruleSignedInteger ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1478:1: (lv_value_2_0= ruleSignedInteger )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1478:1: (lv_value_2_0= ruleSignedInteger )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1479:3: lv_value_2_0= ruleSignedInteger
            {
             
            	        newCompositeNode(grammarAccess.getMarginAccess().getValueSignedIntegerParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSignedInteger_in_ruleMargin3668);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1503:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1504:2: (iv_ruleColor= ruleColor EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1505:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor3704);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor3714); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1512:1: ruleColor returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleColorConstant ) ) ) | ( (lv_concrete_2_0= ruleConcreteColor ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;

        EObject lv_concrete_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1515:28: ( ( ( () ( (lv_value_1_0= ruleColorConstant ) ) ) | ( (lv_concrete_2_0= ruleConcreteColor ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1516:1: ( ( () ( (lv_value_1_0= ruleColorConstant ) ) ) | ( (lv_concrete_2_0= ruleConcreteColor ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1516:1: ( ( () ( (lv_value_1_0= ruleColorConstant ) ) ) | ( (lv_concrete_2_0= ruleConcreteColor ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=53 && LA12_0<=67)) ) {
                alt12=1;
            }
            else if ( (LA12_0==33) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1516:2: ( () ( (lv_value_1_0= ruleColorConstant ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1516:2: ( () ( (lv_value_1_0= ruleColorConstant ) ) )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1516:3: () ( (lv_value_1_0= ruleColorConstant ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1516:3: ()
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1517:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getColorAccess().getColorAction_0_0(),
                                current);
                        

                    }

                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1522:2: ( (lv_value_1_0= ruleColorConstant ) )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1523:1: (lv_value_1_0= ruleColorConstant )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1523:1: (lv_value_1_0= ruleColorConstant )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1524:3: lv_value_1_0= ruleColorConstant
                    {
                     
                    	        newCompositeNode(grammarAccess.getColorAccess().getValueColorConstantParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColorConstant_in_ruleColor3770);
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
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1541:6: ( (lv_concrete_2_0= ruleConcreteColor ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1541:6: ( (lv_concrete_2_0= ruleConcreteColor ) )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1542:1: (lv_concrete_2_0= ruleConcreteColor )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1542:1: (lv_concrete_2_0= ruleConcreteColor )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1543:3: lv_concrete_2_0= ruleConcreteColor
                    {
                     
                    	        newCompositeNode(grammarAccess.getColorAccess().getConcreteConcreteColorParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConcreteColor_in_ruleColor3798);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1567:1: entryRuleConcreteColor returns [EObject current=null] : iv_ruleConcreteColor= ruleConcreteColor EOF ;
    public final EObject entryRuleConcreteColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteColor = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1568:2: (iv_ruleConcreteColor= ruleConcreteColor EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1569:2: iv_ruleConcreteColor= ruleConcreteColor EOF
            {
             newCompositeNode(grammarAccess.getConcreteColorRule()); 
            pushFollow(FOLLOW_ruleConcreteColor_in_entryRuleConcreteColor3834);
            iv_ruleConcreteColor=ruleConcreteColor();

            state._fsp--;

             current =iv_ruleConcreteColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcreteColor3844); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1576:1: ruleConcreteColor returns [EObject current=null] : (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
    public final EObject ruleConcreteColor() throws RecognitionException {
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
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1579:28: ( (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1580:1: (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1580:1: (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1580:3: otherlv_0= 'RGB' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleConcreteColor3881); 

                	newLeafNode(otherlv_0, grammarAccess.getConcreteColorAccess().getRGBKeyword_0());
                
            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleConcreteColor3893); 

                	newLeafNode(otherlv_1, grammarAccess.getConcreteColorAccess().getLeftParenthesisKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1588:1: ( (lv_red_2_0= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1589:1: (lv_red_2_0= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1589:1: (lv_red_2_0= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1590:3: lv_red_2_0= RULE_INT
            {
            lv_red_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConcreteColor3910); 

            			newLeafNode(lv_red_2_0, grammarAccess.getConcreteColorAccess().getRedINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConcreteColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"red",
                    		lv_red_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleConcreteColor3927); 

                	newLeafNode(otherlv_3, grammarAccess.getConcreteColorAccess().getCommaKeyword_3());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1610:1: ( (lv_green_4_0= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1611:1: (lv_green_4_0= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1611:1: (lv_green_4_0= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1612:3: lv_green_4_0= RULE_INT
            {
            lv_green_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConcreteColor3944); 

            			newLeafNode(lv_green_4_0, grammarAccess.getConcreteColorAccess().getGreenINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConcreteColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"green",
                    		lv_green_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleConcreteColor3961); 

                	newLeafNode(otherlv_5, grammarAccess.getConcreteColorAccess().getCommaKeyword_5());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1632:1: ( (lv_blue_6_0= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1633:1: (lv_blue_6_0= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1633:1: (lv_blue_6_0= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1634:3: lv_blue_6_0= RULE_INT
            {
            lv_blue_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConcreteColor3978); 

            			newLeafNode(lv_blue_6_0, grammarAccess.getConcreteColorAccess().getBlueINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConcreteColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"blue",
                    		lv_blue_6_0, 
                    		"INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleConcreteColor3995); 

                	newLeafNode(otherlv_7, grammarAccess.getConcreteColorAccess().getRightParenthesisKeyword_7());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleColorConstant"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1662:1: entryRuleColorConstant returns [EObject current=null] : iv_ruleColorConstant= ruleColorConstant EOF ;
    public final EObject entryRuleColorConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorConstant = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1663:2: (iv_ruleColorConstant= ruleColorConstant EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1664:2: iv_ruleColorConstant= ruleColorConstant EOF
            {
             newCompositeNode(grammarAccess.getColorConstantRule()); 
            pushFollow(FOLLOW_ruleColorConstant_in_entryRuleColorConstant4031);
            iv_ruleColorConstant=ruleColorConstant();

            state._fsp--;

             current =iv_ruleColorConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorConstant4041); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1671:1: ruleColorConstant returns [EObject current=null] : ( (lv_value_0_0= ruleColors ) ) ;
    public final EObject ruleColorConstant() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1674:28: ( ( (lv_value_0_0= ruleColors ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1675:1: ( (lv_value_0_0= ruleColors ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1675:1: ( (lv_value_0_0= ruleColors ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1676:1: (lv_value_0_0= ruleColors )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1676:1: (lv_value_0_0= ruleColors )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1677:3: lv_value_0_0= ruleColors
            {
             
            	        newCompositeNode(grammarAccess.getColorConstantAccess().getValueColorsEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleColors_in_ruleColorConstant4086);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1701:1: entryRuleActivation returns [EObject current=null] : iv_ruleActivation= ruleActivation EOF ;
    public final EObject entryRuleActivation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivation = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1702:2: (iv_ruleActivation= ruleActivation EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1703:2: iv_ruleActivation= ruleActivation EOF
            {
             newCompositeNode(grammarAccess.getActivationRule()); 
            pushFollow(FOLLOW_ruleActivation_in_entryRuleActivation4121);
            iv_ruleActivation=ruleActivation();

            state._fsp--;

             current =iv_ruleActivation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivation4131); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1710:1: ruleActivation returns [EObject current=null] : (otherlv_0= 'active when' ( (lv_condition_1_0= ruleAbstractCondition ) ) ) ;
    public final EObject ruleActivation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_condition_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1713:28: ( (otherlv_0= 'active when' ( (lv_condition_1_0= ruleAbstractCondition ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1714:1: (otherlv_0= 'active when' ( (lv_condition_1_0= ruleAbstractCondition ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1714:1: (otherlv_0= 'active when' ( (lv_condition_1_0= ruleAbstractCondition ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1714:3: otherlv_0= 'active when' ( (lv_condition_1_0= ruleAbstractCondition ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleActivation4168); 

                	newLeafNode(otherlv_0, grammarAccess.getActivationAccess().getActiveWhenKeyword_0());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1718:1: ( (lv_condition_1_0= ruleAbstractCondition ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1719:1: (lv_condition_1_0= ruleAbstractCondition )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1719:1: (lv_condition_1_0= ruleAbstractCondition )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1720:3: lv_condition_1_0= ruleAbstractCondition
            {
             
            	        newCompositeNode(grammarAccess.getActivationAccess().getConditionAbstractConditionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractCondition_in_ruleActivation4189);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1744:1: entryRuleAbstractCondition returns [EObject current=null] : iv_ruleAbstractCondition= ruleAbstractCondition EOF ;
    public final EObject entryRuleAbstractCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCondition = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1745:2: (iv_ruleAbstractCondition= ruleAbstractCondition EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1746:2: iv_ruleAbstractCondition= ruleAbstractCondition EOF
            {
             newCompositeNode(grammarAccess.getAbstractConditionRule()); 
            pushFollow(FOLLOW_ruleAbstractCondition_in_entryRuleAbstractCondition4225);
            iv_ruleAbstractCondition=ruleAbstractCondition();

            state._fsp--;

             current =iv_ruleAbstractCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractCondition4235); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1753:1: ruleAbstractCondition returns [EObject current=null] : (this_Condition_0= ruleCondition | this_CompositeCondition_1= ruleCompositeCondition ) ;
    public final EObject ruleAbstractCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Condition_0 = null;

        EObject this_CompositeCondition_1 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1756:28: ( (this_Condition_0= ruleCondition | this_CompositeCondition_1= ruleCompositeCondition ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1757:1: (this_Condition_0= ruleCondition | this_CompositeCondition_1= ruleCompositeCondition )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1757:1: (this_Condition_0= ruleCondition | this_CompositeCondition_1= ruleCompositeCondition )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=46 && LA13_0<=47)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1758:5: this_Condition_0= ruleCondition
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractConditionAccess().getConditionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCondition_in_ruleAbstractCondition4282);
                    this_Condition_0=ruleCondition();

                    state._fsp--;

                     
                            current = this_Condition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1768:5: this_CompositeCondition_1= ruleCompositeCondition
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractConditionAccess().getCompositeConditionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCompositeCondition_in_ruleAbstractCondition4309);
                    this_CompositeCondition_1=ruleCompositeCondition();

                    state._fsp--;

                     
                            current = this_CompositeCondition_1; 
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


    // $ANTLR start "entryRuleCondition"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1784:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1785:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1786:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition4344);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition4354); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1793:1: ruleCondition returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_value_2_0= ruleType ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1796:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_value_2_0= ruleType ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1797:1: ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_value_2_0= ruleType ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1797:1: ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_value_2_0= ruleType ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1797:2: ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_value_2_0= ruleType ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1797:2: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1798:1: ( ruleQualifiedName )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1798:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1799:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getAttributeEAttributeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCondition4402);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1812:2: ( (lv_operator_1_0= ruleComparisonOperator ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1813:1: (lv_operator_1_0= ruleComparisonOperator )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1813:1: (lv_operator_1_0= ruleComparisonOperator )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1814:3: lv_operator_1_0= ruleComparisonOperator
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getOperatorComparisonOperatorEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleComparisonOperator_in_ruleCondition4423);
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

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1830:2: ( (lv_value_2_0= ruleType ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1831:1: (lv_value_2_0= ruleType )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1831:1: (lv_value_2_0= ruleType )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1832:3: lv_value_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getValueTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleCondition4444);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1856:1: entryRuleCompositeCondition returns [EObject current=null] : iv_ruleCompositeCondition= ruleCompositeCondition EOF ;
    public final EObject entryRuleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeCondition = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1857:2: (iv_ruleCompositeCondition= ruleCompositeCondition EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1858:2: iv_ruleCompositeCondition= ruleCompositeCondition EOF
            {
             newCompositeNode(grammarAccess.getCompositeConditionRule()); 
            pushFollow(FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition4480);
            iv_ruleCompositeCondition=ruleCompositeCondition();

            state._fsp--;

             current =iv_ruleCompositeCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeCondition4490); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1865:1: ruleCompositeCondition returns [EObject current=null] : ( ( (lv_operator_0_0= ruleLogicalOperator ) ) otherlv_1= '(' ( (lv_conditions_2_0= ruleAbstractCondition ) )+ otherlv_3= ')' ) ;
    public final EObject ruleCompositeCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_operator_0_0 = null;

        EObject lv_conditions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1868:28: ( ( ( (lv_operator_0_0= ruleLogicalOperator ) ) otherlv_1= '(' ( (lv_conditions_2_0= ruleAbstractCondition ) )+ otherlv_3= ')' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1869:1: ( ( (lv_operator_0_0= ruleLogicalOperator ) ) otherlv_1= '(' ( (lv_conditions_2_0= ruleAbstractCondition ) )+ otherlv_3= ')' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1869:1: ( ( (lv_operator_0_0= ruleLogicalOperator ) ) otherlv_1= '(' ( (lv_conditions_2_0= ruleAbstractCondition ) )+ otherlv_3= ')' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1869:2: ( (lv_operator_0_0= ruleLogicalOperator ) ) otherlv_1= '(' ( (lv_conditions_2_0= ruleAbstractCondition ) )+ otherlv_3= ')'
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1869:2: ( (lv_operator_0_0= ruleLogicalOperator ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1870:1: (lv_operator_0_0= ruleLogicalOperator )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1870:1: (lv_operator_0_0= ruleLogicalOperator )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1871:3: lv_operator_0_0= ruleLogicalOperator
            {
             
            	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getOperatorLogicalOperatorEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLogicalOperator_in_ruleCompositeCondition4536);
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

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleCompositeCondition4548); 

                	newLeafNode(otherlv_1, grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1891:1: ( (lv_conditions_2_0= ruleAbstractCondition ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=46 && LA14_0<=47)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1892:1: (lv_conditions_2_0= ruleAbstractCondition )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1892:1: (lv_conditions_2_0= ruleAbstractCondition )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1893:3: lv_conditions_2_0= ruleAbstractCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsAbstractConditionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractCondition_in_ruleCompositeCondition4569);
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleCompositeCondition4582); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1921:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1922:2: (iv_ruleType= ruleType EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1923:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType4619);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType4630); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1930:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SignedInteger_0= ruleSignedInteger | this_SignedDouble_1= ruleSignedDouble | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_2=null;
        Token this_BOOLEAN_3=null;
        AntlrDatatypeRuleToken this_SignedInteger_0 = null;

        AntlrDatatypeRuleToken this_SignedDouble_1 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1933:28: ( (this_SignedInteger_0= ruleSignedInteger | this_SignedDouble_1= ruleSignedDouble | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1934:1: (this_SignedInteger_0= ruleSignedInteger | this_SignedDouble_1= ruleSignedDouble | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1934:1: (this_SignedInteger_0= ruleSignedInteger | this_SignedDouble_1= ruleSignedDouble | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_INT) ) {
                    int LA15_2 = input.LA(3);

                    if ( (LA15_2==39) ) {
                        alt15=2;
                    }
                    else if ( (LA15_2==EOF||LA15_2==RULE_ID||(LA15_2>=16 && LA15_2<=18)||(LA15_2>=20 && LA15_2<=27)||(LA15_2>=29 && LA15_2<=32)||(LA15_2>=36 && LA15_2<=37)||(LA15_2>=46 && LA15_2<=47)) ) {
                        alt15=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==39) ) {
                    alt15=2;
                }
                else if ( (LA15_2==EOF||LA15_2==RULE_ID||(LA15_2>=16 && LA15_2<=18)||(LA15_2>=20 && LA15_2<=27)||(LA15_2>=29 && LA15_2<=32)||(LA15_2>=36 && LA15_2<=37)||(LA15_2>=46 && LA15_2<=47)) ) {
                    alt15=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt15=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1935:5: this_SignedInteger_0= ruleSignedInteger
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSignedIntegerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSignedInteger_in_ruleType4677);
                    this_SignedInteger_0=ruleSignedInteger();

                    state._fsp--;


                    		current.merge(this_SignedInteger_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1947:5: this_SignedDouble_1= ruleSignedDouble
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSignedDoubleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSignedDouble_in_ruleType4710);
                    this_SignedDouble_1=ruleSignedDouble();

                    state._fsp--;


                    		current.merge(this_SignedDouble_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1958:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleType4736); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getTypeAccess().getSTRINGTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1966:10: this_BOOLEAN_3= RULE_BOOLEAN
                    {
                    this_BOOLEAN_3=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleType4762); 

                    		current.merge(this_BOOLEAN_3);
                        
                     
                        newLeafNode(this_BOOLEAN_3, grammarAccess.getTypeAccess().getBOOLEANTerminalRuleCall_3()); 
                        

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1981:1: entryRuleSignedDouble returns [String current=null] : iv_ruleSignedDouble= ruleSignedDouble EOF ;
    public final String entryRuleSignedDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedDouble = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1982:2: (iv_ruleSignedDouble= ruleSignedDouble EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1983:2: iv_ruleSignedDouble= ruleSignedDouble EOF
            {
             newCompositeNode(grammarAccess.getSignedDoubleRule()); 
            pushFollow(FOLLOW_ruleSignedDouble_in_entryRuleSignedDouble4808);
            iv_ruleSignedDouble=ruleSignedDouble();

            state._fsp--;

             current =iv_ruleSignedDouble.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedDouble4819); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1990:1: ruleSignedDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1993:28: ( ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1994:1: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1994:1: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1994:2: (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1994:2: (kw= '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1995:2: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleSignedDouble4858); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedDoubleAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedDouble4875); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getSignedDoubleAccess().getINTTerminalRuleCall_1()); 
                
            kw=(Token)match(input,39,FOLLOW_39_in_ruleSignedDouble4893); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSignedDoubleAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedDouble4908); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2028:1: entryRuleSignedInteger returns [String current=null] : iv_ruleSignedInteger= ruleSignedInteger EOF ;
    public final String entryRuleSignedInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInteger = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2029:2: (iv_ruleSignedInteger= ruleSignedInteger EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2030:2: iv_ruleSignedInteger= ruleSignedInteger EOF
            {
             newCompositeNode(grammarAccess.getSignedIntegerRule()); 
            pushFollow(FOLLOW_ruleSignedInteger_in_entryRuleSignedInteger4954);
            iv_ruleSignedInteger=ruleSignedInteger();

            state._fsp--;

             current =iv_ruleSignedInteger.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedInteger4965); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2037:1: ruleSignedInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2040:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2041:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2041:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2041:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2041:2: (kw= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2042:2: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleSignedInteger5004); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedIntegerAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedInteger5021); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2064:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2065:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2066:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5069);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName5080); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2073:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2076:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2077:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2077:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2077:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName5120); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2084:1: (kw= '.' this_ID_2= RULE_ID )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==39) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2085:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,39,FOLLOW_39_in_ruleQualifiedName5139); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName5154); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop18;
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


    // $ANTLR start "ruleComparisonOperator"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2105:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '<=' ) ) ;
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
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2107:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '<=' ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2108:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '<=' ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2108:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '<=' ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt19=1;
                }
                break;
            case 41:
                {
                alt19=2;
                }
                break;
            case 42:
                {
                alt19=3;
                }
                break;
            case 43:
                {
                alt19=4;
                }
                break;
            case 44:
                {
                alt19=5;
                }
                break;
            case 45:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2108:2: (enumLiteral_0= '==' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2108:2: (enumLiteral_0= '==' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2108:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleComparisonOperator5215); 

                            current = grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2114:6: (enumLiteral_1= '!=' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2114:6: (enumLiteral_1= '!=' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2114:8: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_41_in_ruleComparisonOperator5232); 

                            current = grammarAccess.getComparisonOperatorAccess().getUNEQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getUNEQUALEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2120:6: (enumLiteral_2= '>' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2120:6: (enumLiteral_2= '>' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2120:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_42_in_ruleComparisonOperator5249); 

                            current = grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2126:6: (enumLiteral_3= '>=' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2126:6: (enumLiteral_3= '>=' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2126:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_43_in_ruleComparisonOperator5266); 

                            current = grammarAccess.getComparisonOperatorAccess().getGREATEROREQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getGREATEROREQUALEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2132:6: (enumLiteral_4= '<' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2132:6: (enumLiteral_4= '<' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2132:8: enumLiteral_4= '<'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_44_in_ruleComparisonOperator5283); 

                            current = grammarAccess.getComparisonOperatorAccess().getLOWEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getLOWEREnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2138:6: (enumLiteral_5= '<=' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2138:6: (enumLiteral_5= '<=' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2138:8: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,45,FOLLOW_45_in_ruleComparisonOperator5300); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2148:1: ruleLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'any' ) ) ;
    public final Enumerator ruleLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2150:28: ( ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'any' ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2151:1: ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'any' ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2151:1: ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'any' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                alt20=1;
            }
            else if ( (LA20_0==47) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2151:2: (enumLiteral_0= 'all' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2151:2: (enumLiteral_0= 'all' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2151:4: enumLiteral_0= 'all'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_46_in_ruleLogicalOperator5345); 

                            current = grammarAccess.getLogicalOperatorAccess().getALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperatorAccess().getALLEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2157:6: (enumLiteral_1= 'any' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2157:6: (enumLiteral_1= 'any' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2157:8: enumLiteral_1= 'any'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_47_in_ruleLogicalOperator5362); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2167:1: ruleLineStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dot' ) | (enumLiteral_2= 'dash' ) | (enumLiteral_3= 'dash_dot' ) | (enumLiteral_4= 'dash_dot_dot' ) ) ;
    public final Enumerator ruleLineStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2169:28: ( ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dot' ) | (enumLiteral_2= 'dash' ) | (enumLiteral_3= 'dash_dot' ) | (enumLiteral_4= 'dash_dot_dot' ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2170:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dot' ) | (enumLiteral_2= 'dash' ) | (enumLiteral_3= 'dash_dot' ) | (enumLiteral_4= 'dash_dot_dot' ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2170:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dot' ) | (enumLiteral_2= 'dash' ) | (enumLiteral_3= 'dash_dot' ) | (enumLiteral_4= 'dash_dot_dot' ) )
            int alt21=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt21=1;
                }
                break;
            case 49:
                {
                alt21=2;
                }
                break;
            case 50:
                {
                alt21=3;
                }
                break;
            case 51:
                {
                alt21=4;
                }
                break;
            case 52:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2170:2: (enumLiteral_0= 'solid' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2170:2: (enumLiteral_0= 'solid' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2170:4: enumLiteral_0= 'solid'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_48_in_ruleLineStyle5407); 

                            current = grammarAccess.getLineStyleAccess().getLINE_SOLIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLineStyleAccess().getLINE_SOLIDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2176:6: (enumLiteral_1= 'dot' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2176:6: (enumLiteral_1= 'dot' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2176:8: enumLiteral_1= 'dot'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_49_in_ruleLineStyle5424); 

                            current = grammarAccess.getLineStyleAccess().getLINE_DOTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLineStyleAccess().getLINE_DOTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2182:6: (enumLiteral_2= 'dash' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2182:6: (enumLiteral_2= 'dash' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2182:8: enumLiteral_2= 'dash'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_50_in_ruleLineStyle5441); 

                            current = grammarAccess.getLineStyleAccess().getLINE_DASHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLineStyleAccess().getLINE_DASHEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2188:6: (enumLiteral_3= 'dash_dot' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2188:6: (enumLiteral_3= 'dash_dot' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2188:8: enumLiteral_3= 'dash_dot'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_51_in_ruleLineStyle5458); 

                            current = grammarAccess.getLineStyleAccess().getLINE_DASHDOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLineStyleAccess().getLINE_DASHDOTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2194:6: (enumLiteral_4= 'dash_dot_dot' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2194:6: (enumLiteral_4= 'dash_dot_dot' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2194:8: enumLiteral_4= 'dash_dot_dot'
                    {
                    enumLiteral_4=(Token)match(input,52,FOLLOW_52_in_ruleLineStyle5475); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2204:1: ruleColors returns [Enumerator current=null] : ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'white' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'green_light' ) | (enumLiteral_5= 'green_dark' ) | (enumLiteral_6= 'blue' ) | (enumLiteral_7= 'blue_light' ) | (enumLiteral_8= 'blue_dark' ) | (enumLiteral_9= 'gray' ) | (enumLiteral_10= 'gray_light' ) | (enumLiteral_11= 'gray_dark' ) | (enumLiteral_12= 'orange' ) | (enumLiteral_13= 'yellow' ) | (enumLiteral_14= 'cyan' ) ) ;
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
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2206:28: ( ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'white' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'green_light' ) | (enumLiteral_5= 'green_dark' ) | (enumLiteral_6= 'blue' ) | (enumLiteral_7= 'blue_light' ) | (enumLiteral_8= 'blue_dark' ) | (enumLiteral_9= 'gray' ) | (enumLiteral_10= 'gray_light' ) | (enumLiteral_11= 'gray_dark' ) | (enumLiteral_12= 'orange' ) | (enumLiteral_13= 'yellow' ) | (enumLiteral_14= 'cyan' ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2207:1: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'white' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'green_light' ) | (enumLiteral_5= 'green_dark' ) | (enumLiteral_6= 'blue' ) | (enumLiteral_7= 'blue_light' ) | (enumLiteral_8= 'blue_dark' ) | (enumLiteral_9= 'gray' ) | (enumLiteral_10= 'gray_light' ) | (enumLiteral_11= 'gray_dark' ) | (enumLiteral_12= 'orange' ) | (enumLiteral_13= 'yellow' ) | (enumLiteral_14= 'cyan' ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2207:1: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'white' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'green_light' ) | (enumLiteral_5= 'green_dark' ) | (enumLiteral_6= 'blue' ) | (enumLiteral_7= 'blue_light' ) | (enumLiteral_8= 'blue_dark' ) | (enumLiteral_9= 'gray' ) | (enumLiteral_10= 'gray_light' ) | (enumLiteral_11= 'gray_dark' ) | (enumLiteral_12= 'orange' ) | (enumLiteral_13= 'yellow' ) | (enumLiteral_14= 'cyan' ) )
            int alt22=15;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt22=1;
                }
                break;
            case 54:
                {
                alt22=2;
                }
                break;
            case 55:
                {
                alt22=3;
                }
                break;
            case 56:
                {
                alt22=4;
                }
                break;
            case 57:
                {
                alt22=5;
                }
                break;
            case 58:
                {
                alt22=6;
                }
                break;
            case 59:
                {
                alt22=7;
                }
                break;
            case 60:
                {
                alt22=8;
                }
                break;
            case 61:
                {
                alt22=9;
                }
                break;
            case 62:
                {
                alt22=10;
                }
                break;
            case 63:
                {
                alt22=11;
                }
                break;
            case 64:
                {
                alt22=12;
                }
                break;
            case 65:
                {
                alt22=13;
                }
                break;
            case 66:
                {
                alt22=14;
                }
                break;
            case 67:
                {
                alt22=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2207:2: (enumLiteral_0= 'red' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2207:2: (enumLiteral_0= 'red' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2207:4: enumLiteral_0= 'red'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_53_in_ruleColors5520); 

                            current = grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2213:6: (enumLiteral_1= 'black' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2213:6: (enumLiteral_1= 'black' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2213:8: enumLiteral_1= 'black'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_54_in_ruleColors5537); 

                            current = grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2219:6: (enumLiteral_2= 'white' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2219:6: (enumLiteral_2= 'white' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2219:8: enumLiteral_2= 'white'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_55_in_ruleColors5554); 

                            current = grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2225:6: (enumLiteral_3= 'green' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2225:6: (enumLiteral_3= 'green' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2225:8: enumLiteral_3= 'green'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_56_in_ruleColors5571); 

                            current = grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2231:6: (enumLiteral_4= 'green_light' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2231:6: (enumLiteral_4= 'green_light' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2231:8: enumLiteral_4= 'green_light'
                    {
                    enumLiteral_4=(Token)match(input,57,FOLLOW_57_in_ruleColors5588); 

                            current = grammarAccess.getColorsAccess().getGREEN_LIGHTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getColorsAccess().getGREEN_LIGHTEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2237:6: (enumLiteral_5= 'green_dark' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2237:6: (enumLiteral_5= 'green_dark' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2237:8: enumLiteral_5= 'green_dark'
                    {
                    enumLiteral_5=(Token)match(input,58,FOLLOW_58_in_ruleColors5605); 

                            current = grammarAccess.getColorsAccess().getGREEN_DARKEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getColorsAccess().getGREEN_DARKEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2243:6: (enumLiteral_6= 'blue' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2243:6: (enumLiteral_6= 'blue' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2243:8: enumLiteral_6= 'blue'
                    {
                    enumLiteral_6=(Token)match(input,59,FOLLOW_59_in_ruleColors5622); 

                            current = grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2249:6: (enumLiteral_7= 'blue_light' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2249:6: (enumLiteral_7= 'blue_light' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2249:8: enumLiteral_7= 'blue_light'
                    {
                    enumLiteral_7=(Token)match(input,60,FOLLOW_60_in_ruleColors5639); 

                            current = grammarAccess.getColorsAccess().getBLUE_LIGHTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getColorsAccess().getBLUE_LIGHTEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2255:6: (enumLiteral_8= 'blue_dark' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2255:6: (enumLiteral_8= 'blue_dark' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2255:8: enumLiteral_8= 'blue_dark'
                    {
                    enumLiteral_8=(Token)match(input,61,FOLLOW_61_in_ruleColors5656); 

                            current = grammarAccess.getColorsAccess().getBLUE_DARKEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getColorsAccess().getBLUE_DARKEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2261:6: (enumLiteral_9= 'gray' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2261:6: (enumLiteral_9= 'gray' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2261:8: enumLiteral_9= 'gray'
                    {
                    enumLiteral_9=(Token)match(input,62,FOLLOW_62_in_ruleColors5673); 

                            current = grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2267:6: (enumLiteral_10= 'gray_light' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2267:6: (enumLiteral_10= 'gray_light' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2267:8: enumLiteral_10= 'gray_light'
                    {
                    enumLiteral_10=(Token)match(input,63,FOLLOW_63_in_ruleColors5690); 

                            current = grammarAccess.getColorsAccess().getGRAY_LIGHTEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getColorsAccess().getGRAY_LIGHTEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2273:6: (enumLiteral_11= 'gray_dark' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2273:6: (enumLiteral_11= 'gray_dark' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2273:8: enumLiteral_11= 'gray_dark'
                    {
                    enumLiteral_11=(Token)match(input,64,FOLLOW_64_in_ruleColors5707); 

                            current = grammarAccess.getColorsAccess().getGRAY_DARKEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getColorsAccess().getGRAY_DARKEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2279:6: (enumLiteral_12= 'orange' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2279:6: (enumLiteral_12= 'orange' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2279:8: enumLiteral_12= 'orange'
                    {
                    enumLiteral_12=(Token)match(input,65,FOLLOW_65_in_ruleColors5724); 

                            current = grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2285:6: (enumLiteral_13= 'yellow' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2285:6: (enumLiteral_13= 'yellow' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2285:8: enumLiteral_13= 'yellow'
                    {
                    enumLiteral_13=(Token)match(input,66,FOLLOW_66_in_ruleColors5741); 

                            current = grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2291:6: (enumLiteral_14= 'cyan' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2291:6: (enumLiteral_14= 'cyan' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2291:8: enumLiteral_14= 'cyan'
                    {
                    enumLiteral_14=(Token)match(input,67,FOLLOW_67_in_ruleColors5758); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2301:1: ruleDirections returns [Enumerator current=null] : ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) | (enumLiteral_4= 'east' ) | (enumLiteral_5= 'north_east' ) | (enumLiteral_6= 'north_west' ) | (enumLiteral_7= 'south_east' ) | (enumLiteral_8= 'south_west' ) ) ;
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
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2303:28: ( ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) | (enumLiteral_4= 'east' ) | (enumLiteral_5= 'north_east' ) | (enumLiteral_6= 'north_west' ) | (enumLiteral_7= 'south_east' ) | (enumLiteral_8= 'south_west' ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2304:1: ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) | (enumLiteral_4= 'east' ) | (enumLiteral_5= 'north_east' ) | (enumLiteral_6= 'north_west' ) | (enumLiteral_7= 'south_east' ) | (enumLiteral_8= 'south_west' ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2304:1: ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) | (enumLiteral_4= 'east' ) | (enumLiteral_5= 'north_east' ) | (enumLiteral_6= 'north_west' ) | (enumLiteral_7= 'south_east' ) | (enumLiteral_8= 'south_west' ) )
            int alt23=9;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt23=1;
                }
                break;
            case 69:
                {
                alt23=2;
                }
                break;
            case 70:
                {
                alt23=3;
                }
                break;
            case 71:
                {
                alt23=4;
                }
                break;
            case 72:
                {
                alt23=5;
                }
                break;
            case 73:
                {
                alt23=6;
                }
                break;
            case 74:
                {
                alt23=7;
                }
                break;
            case 75:
                {
                alt23=8;
                }
                break;
            case 76:
                {
                alt23=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2304:2: (enumLiteral_0= 'center' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2304:2: (enumLiteral_0= 'center' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2304:4: enumLiteral_0= 'center'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_68_in_ruleDirections5803); 

                            current = grammarAccess.getDirectionsAccess().getCENTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDirectionsAccess().getCENTEREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2310:6: (enumLiteral_1= 'north' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2310:6: (enumLiteral_1= 'north' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2310:8: enumLiteral_1= 'north'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_69_in_ruleDirections5820); 

                            current = grammarAccess.getDirectionsAccess().getNORHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDirectionsAccess().getNORHTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2316:6: (enumLiteral_2= 'south' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2316:6: (enumLiteral_2= 'south' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2316:8: enumLiteral_2= 'south'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_70_in_ruleDirections5837); 

                            current = grammarAccess.getDirectionsAccess().getSOUTHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDirectionsAccess().getSOUTHEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2322:6: (enumLiteral_3= 'west' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2322:6: (enumLiteral_3= 'west' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2322:8: enumLiteral_3= 'west'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_71_in_ruleDirections5854); 

                            current = grammarAccess.getDirectionsAccess().getWESTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDirectionsAccess().getWESTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2328:6: (enumLiteral_4= 'east' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2328:6: (enumLiteral_4= 'east' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2328:8: enumLiteral_4= 'east'
                    {
                    enumLiteral_4=(Token)match(input,72,FOLLOW_72_in_ruleDirections5871); 

                            current = grammarAccess.getDirectionsAccess().getEASTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDirectionsAccess().getEASTEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2334:6: (enumLiteral_5= 'north_east' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2334:6: (enumLiteral_5= 'north_east' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2334:8: enumLiteral_5= 'north_east'
                    {
                    enumLiteral_5=(Token)match(input,73,FOLLOW_73_in_ruleDirections5888); 

                            current = grammarAccess.getDirectionsAccess().getNORTH_EASTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDirectionsAccess().getNORTH_EASTEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2340:6: (enumLiteral_6= 'north_west' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2340:6: (enumLiteral_6= 'north_west' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2340:8: enumLiteral_6= 'north_west'
                    {
                    enumLiteral_6=(Token)match(input,74,FOLLOW_74_in_ruleDirections5905); 

                            current = grammarAccess.getDirectionsAccess().getNORTH_WESTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDirectionsAccess().getNORTH_WESTEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2346:6: (enumLiteral_7= 'south_east' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2346:6: (enumLiteral_7= 'south_east' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2346:8: enumLiteral_7= 'south_east'
                    {
                    enumLiteral_7=(Token)match(input,75,FOLLOW_75_in_ruleDirections5922); 

                            current = grammarAccess.getDirectionsAccess().getSOUTH_EASTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getDirectionsAccess().getSOUTH_EASTEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2352:6: (enumLiteral_8= 'south_west' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2352:6: (enumLiteral_8= 'south_west' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2352:8: enumLiteral_8= 'south_west'
                    {
                    enumLiteral_8=(Token)match(input,76,FOLLOW_76_in_ruleDirections5939); 

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


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\7\uffff";
    static final String DFA10_eofS =
        "\1\uffff\2\3\3\uffff\1\3";
    static final String DFA10_minS =
        "\1\4\2\20\2\uffff\1\7\1\20";
    static final String DFA10_maxS =
        "\1\7\1\45\1\47\2\uffff\1\7\1\47";
    static final String DFA10_acceptS =
        "\3\uffff\1\1\1\2\2\uffff";
    static final String DFA10_specialS =
        "\7\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\2\uffff\1\2",
            "\1\3\1\uffff\1\3\1\uffff\1\3\7\uffff\1\4\2\uffff\2\3\4\uffff"+
            "\1\3",
            "\1\3\1\uffff\1\3\1\uffff\1\3\7\uffff\1\4\2\uffff\2\3\4\uffff"+
            "\1\3\1\uffff\1\5",
            "",
            "",
            "\1\6",
            "\1\3\1\uffff\1\3\1\uffff\1\3\7\uffff\1\4\2\uffff\2\3\4\uffff"+
            "\1\3\1\uffff\1\5"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1172:1: (this_SimpleText_0= ruleSimpleText | this_ComplexText_1= ruleComplexText )";
        }
    }
 

    public static final BitSet FOLLOW_ruleDecorationModel_in_entryRuleDecorationModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecorationModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleDecorationModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecorationModel139 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_ruleNamespace_in_ruleDecorationModel165 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleDecorationDescription_in_ruleDecorationModel187 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleNamespace271 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNamespace294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecorationDescription_in_entryRuleDecorationDescription330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecorationDescription340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDecorationDescription377 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDecorationDescription400 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDecorationDescription412 = new BitSet(new long[]{0x0000002002620000L});
    public static final BitSet FOLLOW_ruleAbstractDecoration_in_ruleDecorationDescription478 = new BitSet(new long[]{0x0000002002630000L});
    public static final BitSet FOLLOW_ruleActivation_in_ruleDecorationDescription554 = new BitSet(new long[]{0x0000002002630000L});
    public static final BitSet FOLLOW_16_in_ruleDecorationDescription612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDecoration_in_entryRuleAbstractDecoration648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDecoration658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageDecoration_in_ruleAbstractDecoration705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderDecoration_in_ruleAbstractDecoration732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorDecoration_in_ruleAbstractDecoration759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectionDecoration_in_ruleAbstractDecoration786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageDecoration_in_entryRuleImageDecoration821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageDecoration831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleImageDecoration877 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImageDecoration889 = new BitSet(new long[]{0x0000002182760000L});
    public static final BitSet FOLLOW_18_in_ruleImageDecoration947 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleImageDecoration959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImageDecoration976 = new BitSet(new long[]{0x0000002182770000L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleImageDecoration1057 = new BitSet(new long[]{0x0000002182770000L});
    public static final BitSet FOLLOW_ruleMargin_in_ruleImageDecoration1132 = new BitSet(new long[]{0x0000002182770000L});
    public static final BitSet FOLLOW_20_in_ruleImageDecoration1199 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleImageDecoration1211 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageDecoration1232 = new BitSet(new long[]{0x0000002182770000L});
    public static final BitSet FOLLOW_ruleActivation_in_ruleImageDecoration1308 = new BitSet(new long[]{0x0000002182770000L});
    public static final BitSet FOLLOW_16_in_ruleImageDecoration1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderDecoration_in_entryRuleBorderDecoration1402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorderDecoration1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBorderDecoration1458 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBorderDecoration1470 = new BitSet(new long[]{0x0000002062630000L});
    public static final BitSet FOLLOW_ruleSize_in_ruleBorderDecoration1536 = new BitSet(new long[]{0x0000002062630000L});
    public static final BitSet FOLLOW_22_in_ruleBorderDecoration1603 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBorderDecoration1615 = new BitSet(new long[]{0xFFE0000200000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleColor_in_ruleBorderDecoration1636 = new BitSet(new long[]{0x0000002062630000L});
    public static final BitSet FOLLOW_ruleStyle_in_ruleBorderDecoration1712 = new BitSet(new long[]{0x0000002062630000L});
    public static final BitSet FOLLOW_ruleActivation_in_ruleBorderDecoration1787 = new BitSet(new long[]{0x0000002062630000L});
    public static final BitSet FOLLOW_16_in_ruleBorderDecoration1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorDecoration_in_entryRuleColorDecoration1875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorDecoration1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleColorDecoration1931 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleColorDecoration1943 = new BitSet(new long[]{0x0000002003E30000L});
    public static final BitSet FOLLOW_23_in_ruleColorDecoration2001 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleColorDecoration2013 = new BitSet(new long[]{0xFFE0000200000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleColor_in_ruleColorDecoration2034 = new BitSet(new long[]{0x0000002003E30000L});
    public static final BitSet FOLLOW_24_in_ruleColorDecoration2102 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleColorDecoration2114 = new BitSet(new long[]{0xFFE0000200000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleColor_in_ruleColorDecoration2135 = new BitSet(new long[]{0x0000002003E30000L});
    public static final BitSet FOLLOW_ruleActivation_in_ruleColorDecoration2211 = new BitSet(new long[]{0x0000002003E30000L});
    public static final BitSet FOLLOW_16_in_ruleColorDecoration2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectionDecoration_in_entryRuleConnectionDecoration2299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnectionDecoration2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleConnectionDecoration2355 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConnectionDecoration2367 = new BitSet(new long[]{0x000000206E630000L});
    public static final BitSet FOLLOW_ruleSize_in_ruleConnectionDecoration2433 = new BitSet(new long[]{0x000000206E630000L});
    public static final BitSet FOLLOW_ruleStyle_in_ruleConnectionDecoration2508 = new BitSet(new long[]{0x000000206E630000L});
    public static final BitSet FOLLOW_26_in_ruleConnectionDecoration2575 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConnectionDecoration2587 = new BitSet(new long[]{0xFFE0000200000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleColor_in_ruleConnectionDecoration2608 = new BitSet(new long[]{0x000000206E630000L});
    public static final BitSet FOLLOW_27_in_ruleConnectionDecoration2676 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConnectionDecoration2688 = new BitSet(new long[]{0xFFE0000200000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleColor_in_ruleConnectionDecoration2709 = new BitSet(new long[]{0x000000206E630000L});
    public static final BitSet FOLLOW_ruleActivation_in_ruleConnectionDecoration2785 = new BitSet(new long[]{0x000000206E630000L});
    public static final BitSet FOLLOW_16_in_ruleConnectionDecoration2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText2873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleText_in_ruleText2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexText_in_ruleText2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleText_in_entryRuleSimpleText2992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleText3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleText3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSimpleText3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexText_in_entryRuleComplexText3114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexText3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleText_in_ruleComplexText3170 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleComplexText3182 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleText_in_ruleComplexText3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyle_in_entryRuleStyle3239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyle3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleStyle3286 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStyle3298 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_ruleLineStyle_in_ruleStyle3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_entryRuleSize3355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSize3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSize3402 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSize3414 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSize3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_entryRuleDirection3472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirection3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDirection3519 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDirection3531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001FF0L});
    public static final BitSet FOLLOW_ruleDirections_in_ruleDirection3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMargin_in_entryRuleMargin3588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMargin3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleMargin3635 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMargin3647 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_ruleMargin3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor3704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorConstant_in_ruleColor3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteColor_in_ruleColor3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteColor_in_entryRuleConcreteColor3834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcreteColor3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleConcreteColor3881 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleConcreteColor3893 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConcreteColor3910 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleConcreteColor3927 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConcreteColor3944 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleConcreteColor3961 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConcreteColor3978 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleConcreteColor3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorConstant_in_entryRuleColorConstant4031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorConstant4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColors_in_ruleColorConstant4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_entryRuleActivation4121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivation4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleActivation4168 = new BitSet(new long[]{0x0000C00000000080L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_ruleActivation4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_entryRuleAbstractCondition4225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractCondition4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleAbstractCondition4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeCondition_in_ruleAbstractCondition4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition4344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCondition4402 = new BitSet(new long[]{0x00003F0000000000L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleCondition4423 = new BitSet(new long[]{0x0000004000000070L});
    public static final BitSet FOLLOW_ruleType_in_ruleCondition4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition4480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeCondition4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOperator_in_ruleCompositeCondition4536 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCompositeCondition4548 = new BitSet(new long[]{0x0000C00000000080L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_ruleCompositeCondition4569 = new BitSet(new long[]{0x0000C01000000080L});
    public static final BitSet FOLLOW_36_in_ruleCompositeCondition4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType4619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_ruleType4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedDouble_in_ruleType4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleType4736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleType4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedDouble_in_entryRuleSignedDouble4808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedDouble4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleSignedDouble4858 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedDouble4875 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleSignedDouble4893 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedDouble4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_entryRuleSignedInteger4954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedInteger4965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleSignedInteger5004 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedInteger5021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName5080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5120 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleQualifiedName5139 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5154 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_40_in_ruleComparisonOperator5215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleComparisonOperator5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleComparisonOperator5249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleComparisonOperator5266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleComparisonOperator5283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleComparisonOperator5300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleLogicalOperator5345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleLogicalOperator5362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleLineStyle5407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleLineStyle5424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleLineStyle5441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleLineStyle5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleLineStyle5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleColors5520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleColors5537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleColors5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleColors5571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleColors5588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleColors5605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleColors5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleColors5639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleColors5656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleColors5673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleColors5690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleColors5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleColors5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleColors5741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleColors5758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleDirections5803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleDirections5820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleDirections5837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleDirections5854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleDirections5871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleDirections5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleDirections5905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleDirections5922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleDirections5939 = new BitSet(new long[]{0x0000000000000002L});

}
