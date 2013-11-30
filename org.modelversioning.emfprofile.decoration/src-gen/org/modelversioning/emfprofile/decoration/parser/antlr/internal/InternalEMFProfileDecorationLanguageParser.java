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

                if ( (LA4_0==17||LA4_0==21|| LA4_0 >=23 && LA4_0<=25) && getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 0) ) {
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
            	        case 23:
            	            {
            	            int LA3_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	            }
            	            break;
            	        case 24:
            	            {
            	            int LA3_5 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	            }
            	            break;
            	        case 25:
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:321:1: ruleAbstractDecoration returns [EObject current=null] : (this_ImageDecoration_0= ruleImageDecoration | this_BorderDecoration_1= ruleBorderDecoration | this_BackgroundDecoration_2= ruleBackgroundDecoration | this_ForegroundDecoration_3= ruleForegroundDecoration | this_ConnectionDecoration_4= ruleConnectionDecoration ) ;
    public final EObject ruleAbstractDecoration() throws RecognitionException {
        EObject current = null;

        EObject this_ImageDecoration_0 = null;

        EObject this_BorderDecoration_1 = null;

        EObject this_BackgroundDecoration_2 = null;

        EObject this_ForegroundDecoration_3 = null;

        EObject this_ConnectionDecoration_4 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:324:28: ( (this_ImageDecoration_0= ruleImageDecoration | this_BorderDecoration_1= ruleBorderDecoration | this_BackgroundDecoration_2= ruleBackgroundDecoration | this_ForegroundDecoration_3= ruleForegroundDecoration | this_ConnectionDecoration_4= ruleConnectionDecoration ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:325:1: (this_ImageDecoration_0= ruleImageDecoration | this_BorderDecoration_1= ruleBorderDecoration | this_BackgroundDecoration_2= ruleBackgroundDecoration | this_ForegroundDecoration_3= ruleForegroundDecoration | this_ConnectionDecoration_4= ruleConnectionDecoration )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:325:1: (this_ImageDecoration_0= ruleImageDecoration | this_BorderDecoration_1= ruleBorderDecoration | this_BackgroundDecoration_2= ruleBackgroundDecoration | this_ForegroundDecoration_3= ruleForegroundDecoration | this_ConnectionDecoration_4= ruleConnectionDecoration )
            int alt5=5;
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
            case 23:
                {
                alt5=3;
                }
                break;
            case 24:
                {
                alt5=4;
                }
                break;
            case 25:
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
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:346:5: this_BackgroundDecoration_2= ruleBackgroundDecoration
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDecorationAccess().getBackgroundDecorationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBackgroundDecoration_in_ruleAbstractDecoration759);
                    this_BackgroundDecoration_2=ruleBackgroundDecoration();

                    state._fsp--;

                     
                            current = this_BackgroundDecoration_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:356:5: this_ForegroundDecoration_3= ruleForegroundDecoration
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDecorationAccess().getForegroundDecorationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleForegroundDecoration_in_ruleAbstractDecoration786);
                    this_ForegroundDecoration_3=ruleForegroundDecoration();

                    state._fsp--;

                     
                            current = this_ForegroundDecoration_3; 
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:391:1: ruleImageDecoration returns [EObject current=null] : ( () otherlv_1= 'image' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' ) ;
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
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:394:28: ( ( () otherlv_1= 'image' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:395:1: ( () otherlv_1= 'image' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:395:1: ( () otherlv_1= 'image' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:395:2: () otherlv_1= 'image' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}'
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:395:2: ()
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:396:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImageDecorationAccess().getImageDecorationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleImageDecoration904); 

                	newLeafNode(otherlv_1, grammarAccess.getImageDecorationAccess().getImageKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleImageDecoration916); 

                	newLeafNode(otherlv_2, grammarAccess.getImageDecorationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:409:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:411:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:411:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:412:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3());
            	
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:415:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?)
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:416:3: ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+ {...}?
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:416:3: ( ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_direction_7_0= ruleDirection ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_margin_8_0= ruleMargin ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'tooltip' otherlv_10= '=' ( (lv_tooltip_11_0= ruleText ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )+
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
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:418:4: ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:418:4: ({...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:419:5: {...}? => ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleImageDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:419:112: ( ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:420:6: ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:423:6: ({...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:423:7: {...}? => (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImageDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:423:16: (otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:423:18: otherlv_4= 'location-uri' otherlv_5= '=' ( (lv_location_uri_6_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleImageDecoration974); 

            	        	newLeafNode(otherlv_4, grammarAccess.getImageDecorationAccess().getLocationUriKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleImageDecoration986); 

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
            	    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleImageDecoration1226); 

            	        	newLeafNode(otherlv_9, grammarAccess.getImageDecorationAccess().getTooltipKeyword_3_3_0());
            	        
            	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleImageDecoration1238); 

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

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleImageDecoration1393); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:604:1: entryRuleBorderDecoration returns [EObject current=null] : iv_ruleBorderDecoration= ruleBorderDecoration EOF ;
    public final EObject entryRuleBorderDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorderDecoration = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:605:2: (iv_ruleBorderDecoration= ruleBorderDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:606:2: iv_ruleBorderDecoration= ruleBorderDecoration EOF
            {
             newCompositeNode(grammarAccess.getBorderDecorationRule()); 
            pushFollow(FOLLOW_ruleBorderDecoration_in_entryRuleBorderDecoration1429);
            iv_ruleBorderDecoration=ruleBorderDecoration();

            state._fsp--;

             current =iv_ruleBorderDecoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorderDecoration1439); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:613:1: ruleBorderDecoration returns [EObject current=null] : ( () otherlv_1= 'border' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) ;
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
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:616:28: ( ( () otherlv_1= 'border' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:617:1: ( () otherlv_1= 'border' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_10= '}' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:617:1: ( () otherlv_1= 'border' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_10= '}' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:617:2: () otherlv_1= 'border' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_10= '}'
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:617:2: ()
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:618:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBorderDecorationAccess().getBorderDecorationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleBorderDecoration1485); 

                	newLeafNode(otherlv_1, grammarAccess.getBorderDecorationAccess().getBorderKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleBorderDecoration1497); 

                	newLeafNode(otherlv_2, grammarAccess.getBorderDecorationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:631:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )* ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:633:1: ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )* ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:633:1: ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )* ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:634:2: ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3());
            	
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:637:2: ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )* )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:638:3: ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )*
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:638:3: ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) ) )*
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
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:640:4: ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:640:4: ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:641:5: {...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBorderDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:641:113: ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:642:6: ({...}? => ( (lv_size_4_0= ruleSize ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:645:6: ({...}? => ( (lv_size_4_0= ruleSize ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:645:7: {...}? => ( (lv_size_4_0= ruleSize ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBorderDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:645:16: ( (lv_size_4_0= ruleSize ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:646:1: (lv_size_4_0= ruleSize )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:646:1: (lv_size_4_0= ruleSize )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:647:3: lv_size_4_0= ruleSize
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBorderDecorationAccess().getSizeSizeParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSize_in_ruleBorderDecoration1563);
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
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:670:4: ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:670:4: ({...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:671:5: {...}? => ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBorderDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:671:113: ( ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:672:6: ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:675:6: ({...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:675:7: {...}? => (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBorderDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:675:16: (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:675:18: otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColor ) )
            	    {
            	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleBorderDecoration1630); 

            	        	newLeafNode(otherlv_5, grammarAccess.getBorderDecorationAccess().getColorKeyword_3_1_0());
            	        
            	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleBorderDecoration1642); 

            	        	newLeafNode(otherlv_6, grammarAccess.getBorderDecorationAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:683:1: ( (lv_color_7_0= ruleColor ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:684:1: (lv_color_7_0= ruleColor )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:684:1: (lv_color_7_0= ruleColor )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:685:3: lv_color_7_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBorderDecorationAccess().getColorColorParserRuleCall_3_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleBorderDecoration1663);
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
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:708:4: ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:708:4: ({...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:709:5: {...}? => ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleBorderDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:709:113: ( ({...}? => ( (lv_style_8_0= ruleStyle ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:710:6: ({...}? => ( (lv_style_8_0= ruleStyle ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:713:6: ({...}? => ( (lv_style_8_0= ruleStyle ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:713:7: {...}? => ( (lv_style_8_0= ruleStyle ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBorderDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:713:16: ( (lv_style_8_0= ruleStyle ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:714:1: (lv_style_8_0= ruleStyle )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:714:1: (lv_style_8_0= ruleStyle )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:715:3: lv_style_8_0= ruleStyle
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBorderDecorationAccess().getStyleStyleParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStyle_in_ruleBorderDecoration1739);
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
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:738:4: ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:738:4: ({...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:739:5: {...}? => ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleBorderDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:739:113: ( ({...}? => ( (lv_activation_9_0= ruleActivation ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:740:6: ({...}? => ( (lv_activation_9_0= ruleActivation ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:743:6: ({...}? => ( (lv_activation_9_0= ruleActivation ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:743:7: {...}? => ( (lv_activation_9_0= ruleActivation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBorderDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:743:16: ( (lv_activation_9_0= ruleActivation ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:744:1: (lv_activation_9_0= ruleActivation )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:744:1: (lv_activation_9_0= ruleActivation )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:745:3: lv_activation_9_0= ruleActivation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBorderDecorationAccess().getActivationActivationParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivation_in_ruleBorderDecoration1814);
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

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleBorderDecoration1866); 

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


    // $ANTLR start "entryRuleBackgroundDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:787:1: entryRuleBackgroundDecoration returns [EObject current=null] : iv_ruleBackgroundDecoration= ruleBackgroundDecoration EOF ;
    public final EObject entryRuleBackgroundDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackgroundDecoration = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:788:2: (iv_ruleBackgroundDecoration= ruleBackgroundDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:789:2: iv_ruleBackgroundDecoration= ruleBackgroundDecoration EOF
            {
             newCompositeNode(grammarAccess.getBackgroundDecorationRule()); 
            pushFollow(FOLLOW_ruleBackgroundDecoration_in_entryRuleBackgroundDecoration1902);
            iv_ruleBackgroundDecoration=ruleBackgroundDecoration();

            state._fsp--;

             current =iv_ruleBackgroundDecoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBackgroundDecoration1912); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBackgroundDecoration"


    // $ANTLR start "ruleBackgroundDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:796:1: ruleBackgroundDecoration returns [EObject current=null] : ( () otherlv_1= 'background' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) ;
    public final EObject ruleBackgroundDecoration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_color_6_0 = null;

        EObject lv_activation_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:799:28: ( ( () otherlv_1= 'background' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:800:1: ( () otherlv_1= 'background' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:800:1: ( () otherlv_1= 'background' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:800:2: () otherlv_1= 'background' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_8= '}'
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:800:2: ()
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:801:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBackgroundDecorationAccess().getBackgroundDecorationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleBackgroundDecoration1958); 

                	newLeafNode(otherlv_1, grammarAccess.getBackgroundDecorationAccess().getBackgroundKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleBackgroundDecoration1970); 

                	newLeafNode(otherlv_2, grammarAccess.getBackgroundDecorationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:814:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )* ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:816:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )* ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:816:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )* ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:817:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getBackgroundDecorationAccess().getUnorderedGroup_3());
            	
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:820:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )* )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:821:3: ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )*
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:821:3: ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( LA8_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getBackgroundDecorationAccess().getUnorderedGroup_3(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getBackgroundDecorationAccess().getUnorderedGroup_3(), 1) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:823:4: ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:823:4: ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:824:5: {...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBackgroundDecorationAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBackgroundDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBackgroundDecorationAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:824:117: ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:825:6: ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBackgroundDecorationAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:828:6: ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:828:7: {...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBackgroundDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:828:16: (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:828:18: otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) )
            	    {
            	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleBackgroundDecoration2028); 

            	        	newLeafNode(otherlv_4, grammarAccess.getBackgroundDecorationAccess().getColorKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleBackgroundDecoration2040); 

            	        	newLeafNode(otherlv_5, grammarAccess.getBackgroundDecorationAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:836:1: ( (lv_color_6_0= ruleColor ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:837:1: (lv_color_6_0= ruleColor )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:837:1: (lv_color_6_0= ruleColor )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:838:3: lv_color_6_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBackgroundDecorationAccess().getColorColorParserRuleCall_3_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleBackgroundDecoration2061);
            	    lv_color_6_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBackgroundDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"color",
            	            		lv_color_6_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBackgroundDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:861:4: ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:861:4: ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:862:5: {...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBackgroundDecorationAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBackgroundDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getBackgroundDecorationAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:862:117: ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:863:6: ({...}? => ( (lv_activation_7_0= ruleActivation ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBackgroundDecorationAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:866:6: ({...}? => ( (lv_activation_7_0= ruleActivation ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:866:7: {...}? => ( (lv_activation_7_0= ruleActivation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBackgroundDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:866:16: ( (lv_activation_7_0= ruleActivation ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:867:1: (lv_activation_7_0= ruleActivation )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:867:1: (lv_activation_7_0= ruleActivation )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:868:3: lv_activation_7_0= ruleActivation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBackgroundDecorationAccess().getActivationActivationParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivation_in_ruleBackgroundDecoration2137);
            	    lv_activation_7_0=ruleActivation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBackgroundDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"activation",
            	            		lv_activation_7_0, 
            	            		"Activation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBackgroundDecorationAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getBackgroundDecorationAccess().getUnorderedGroup_3());
            	

            }

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleBackgroundDecoration2189); 

                	newLeafNode(otherlv_8, grammarAccess.getBackgroundDecorationAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBackgroundDecoration"


    // $ANTLR start "entryRuleForegroundDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:910:1: entryRuleForegroundDecoration returns [EObject current=null] : iv_ruleForegroundDecoration= ruleForegroundDecoration EOF ;
    public final EObject entryRuleForegroundDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForegroundDecoration = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:911:2: (iv_ruleForegroundDecoration= ruleForegroundDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:912:2: iv_ruleForegroundDecoration= ruleForegroundDecoration EOF
            {
             newCompositeNode(grammarAccess.getForegroundDecorationRule()); 
            pushFollow(FOLLOW_ruleForegroundDecoration_in_entryRuleForegroundDecoration2225);
            iv_ruleForegroundDecoration=ruleForegroundDecoration();

            state._fsp--;

             current =iv_ruleForegroundDecoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForegroundDecoration2235); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForegroundDecoration"


    // $ANTLR start "ruleForegroundDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:919:1: ruleForegroundDecoration returns [EObject current=null] : ( () otherlv_1= 'foreground' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) ;
    public final EObject ruleForegroundDecoration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_color_6_0 = null;

        EObject lv_activation_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:922:28: ( ( () otherlv_1= 'foreground' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:923:1: ( () otherlv_1= 'foreground' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:923:1: ( () otherlv_1= 'foreground' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:923:2: () otherlv_1= 'foreground' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_8= '}'
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:923:2: ()
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:924:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getForegroundDecorationAccess().getForegroundDecorationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleForegroundDecoration2281); 

                	newLeafNode(otherlv_1, grammarAccess.getForegroundDecorationAccess().getForegroundKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleForegroundDecoration2293); 

                	newLeafNode(otherlv_2, grammarAccess.getForegroundDecorationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:937:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )* ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:939:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )* ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:939:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )* ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:940:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getForegroundDecorationAccess().getUnorderedGroup_3());
            	
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:943:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )* )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:944:3: ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )*
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:944:3: ( ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( LA9_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getForegroundDecorationAccess().getUnorderedGroup_3(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getForegroundDecorationAccess().getUnorderedGroup_3(), 1) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:946:4: ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:946:4: ({...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:947:5: {...}? => ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getForegroundDecorationAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleForegroundDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getForegroundDecorationAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:947:117: ( ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:948:6: ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getForegroundDecorationAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:951:6: ({...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:951:7: {...}? => (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleForegroundDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:951:16: (otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:951:18: otherlv_4= 'color' otherlv_5= '=' ( (lv_color_6_0= ruleColor ) )
            	    {
            	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleForegroundDecoration2351); 

            	        	newLeafNode(otherlv_4, grammarAccess.getForegroundDecorationAccess().getColorKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleForegroundDecoration2363); 

            	        	newLeafNode(otherlv_5, grammarAccess.getForegroundDecorationAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:959:1: ( (lv_color_6_0= ruleColor ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:960:1: (lv_color_6_0= ruleColor )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:960:1: (lv_color_6_0= ruleColor )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:961:3: lv_color_6_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getForegroundDecorationAccess().getColorColorParserRuleCall_3_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleForegroundDecoration2384);
            	    lv_color_6_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getForegroundDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"color",
            	            		lv_color_6_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getForegroundDecorationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:984:4: ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:984:4: ({...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:985:5: {...}? => ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getForegroundDecorationAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleForegroundDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getForegroundDecorationAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:985:117: ( ({...}? => ( (lv_activation_7_0= ruleActivation ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:986:6: ({...}? => ( (lv_activation_7_0= ruleActivation ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getForegroundDecorationAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:989:6: ({...}? => ( (lv_activation_7_0= ruleActivation ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:989:7: {...}? => ( (lv_activation_7_0= ruleActivation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleForegroundDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:989:16: ( (lv_activation_7_0= ruleActivation ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:990:1: (lv_activation_7_0= ruleActivation )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:990:1: (lv_activation_7_0= ruleActivation )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:991:3: lv_activation_7_0= ruleActivation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getForegroundDecorationAccess().getActivationActivationParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivation_in_ruleForegroundDecoration2460);
            	    lv_activation_7_0=ruleActivation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getForegroundDecorationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"activation",
            	            		lv_activation_7_0, 
            	            		"Activation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getForegroundDecorationAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getForegroundDecorationAccess().getUnorderedGroup_3());
            	

            }

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleForegroundDecoration2512); 

                	newLeafNode(otherlv_8, grammarAccess.getForegroundDecorationAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForegroundDecoration"


    // $ANTLR start "entryRuleConnectionDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1033:1: entryRuleConnectionDecoration returns [EObject current=null] : iv_ruleConnectionDecoration= ruleConnectionDecoration EOF ;
    public final EObject entryRuleConnectionDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionDecoration = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1034:2: (iv_ruleConnectionDecoration= ruleConnectionDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1035:2: iv_ruleConnectionDecoration= ruleConnectionDecoration EOF
            {
             newCompositeNode(grammarAccess.getConnectionDecorationRule()); 
            pushFollow(FOLLOW_ruleConnectionDecoration_in_entryRuleConnectionDecoration2548);
            iv_ruleConnectionDecoration=ruleConnectionDecoration();

            state._fsp--;

             current =iv_ruleConnectionDecoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnectionDecoration2558); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1042:1: ruleConnectionDecoration returns [EObject current=null] : ( () otherlv_1= 'connection' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_13= '}' ) ;
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
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1045:28: ( ( () otherlv_1= 'connection' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_13= '}' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1046:1: ( () otherlv_1= 'connection' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_13= '}' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1046:1: ( () otherlv_1= 'connection' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_13= '}' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1046:2: () otherlv_1= 'connection' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) ) ) otherlv_13= '}'
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1046:2: ()
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1047:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConnectionDecorationAccess().getConnectionDecorationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleConnectionDecoration2604); 

                	newLeafNode(otherlv_1, grammarAccess.getConnectionDecorationAccess().getConnectionKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleConnectionDecoration2616); 

                	newLeafNode(otherlv_2, grammarAccess.getConnectionDecorationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1060:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1062:1: ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1062:1: ( ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1063:2: ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3());
            	
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1066:2: ( ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )* )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1067:3: ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )*
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1067:3: ( ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) ) )*
            loop10:
            do {
                int alt10=6;
                int LA10_0 = input.LA(1);

                if ( LA10_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1) ) {
                    alt10=2;
                }
                else if ( LA10_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2) ) {
                    alt10=3;
                }
                else if ( LA10_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3) ) {
                    alt10=4;
                }
                else if ( LA10_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4) ) {
                    alt10=5;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1069:4: ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1069:4: ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1070:5: {...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1070:117: ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1071:6: ({...}? => ( (lv_size_4_0= ruleSize ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1074:6: ({...}? => ( (lv_size_4_0= ruleSize ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1074:7: {...}? => ( (lv_size_4_0= ruleSize ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1074:16: ( (lv_size_4_0= ruleSize ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1075:1: (lv_size_4_0= ruleSize )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1075:1: (lv_size_4_0= ruleSize )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1076:3: lv_size_4_0= ruleSize
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectionDecorationAccess().getSizeSizeParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSize_in_ruleConnectionDecoration2682);
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
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1099:4: ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1099:4: ({...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1100:5: {...}? => ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1100:117: ( ({...}? => ( (lv_style_5_0= ruleStyle ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1101:6: ({...}? => ( (lv_style_5_0= ruleStyle ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1104:6: ({...}? => ( (lv_style_5_0= ruleStyle ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1104:7: {...}? => ( (lv_style_5_0= ruleStyle ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1104:16: ( (lv_style_5_0= ruleStyle ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1105:1: (lv_style_5_0= ruleStyle )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1105:1: (lv_style_5_0= ruleStyle )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1106:3: lv_style_5_0= ruleStyle
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectionDecorationAccess().getStyleStyleParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStyle_in_ruleConnectionDecoration2757);
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
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1129:4: ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1129:4: ({...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1130:5: {...}? => ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1130:117: ( ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1131:6: ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1134:6: ({...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1134:7: {...}? => (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1134:16: (otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1134:18: otherlv_6= 'foreground-color' otherlv_7= '=' ( (lv_foregroundColor_8_0= ruleColor ) )
            	    {
            	    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleConnectionDecoration2824); 

            	        	newLeafNode(otherlv_6, grammarAccess.getConnectionDecorationAccess().getForegroundColorKeyword_3_2_0());
            	        
            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleConnectionDecoration2836); 

            	        	newLeafNode(otherlv_7, grammarAccess.getConnectionDecorationAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1142:1: ( (lv_foregroundColor_8_0= ruleColor ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1143:1: (lv_foregroundColor_8_0= ruleColor )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1143:1: (lv_foregroundColor_8_0= ruleColor )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1144:3: lv_foregroundColor_8_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectionDecorationAccess().getForegroundColorColorParserRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleConnectionDecoration2857);
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
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1167:4: ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1167:4: ({...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1168:5: {...}? => ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1168:117: ( ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1169:6: ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1172:6: ({...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1172:7: {...}? => (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1172:16: (otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1172:18: otherlv_9= 'background-color' otherlv_10= '=' ( (lv_backgroundColor_11_0= ruleColor ) )
            	    {
            	    otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleConnectionDecoration2925); 

            	        	newLeafNode(otherlv_9, grammarAccess.getConnectionDecorationAccess().getBackgroundColorKeyword_3_3_0());
            	        
            	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleConnectionDecoration2937); 

            	        	newLeafNode(otherlv_10, grammarAccess.getConnectionDecorationAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1180:1: ( (lv_backgroundColor_11_0= ruleColor ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1181:1: (lv_backgroundColor_11_0= ruleColor )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1181:1: (lv_backgroundColor_11_0= ruleColor )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1182:3: lv_backgroundColor_11_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectionDecorationAccess().getBackgroundColorColorParserRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleConnectionDecoration2958);
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
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1205:4: ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1205:4: ({...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1206:5: {...}? => ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1206:117: ( ({...}? => ( (lv_activation_12_0= ruleActivation ) ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1207:6: ({...}? => ( (lv_activation_12_0= ruleActivation ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1210:6: ({...}? => ( (lv_activation_12_0= ruleActivation ) ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1210:7: {...}? => ( (lv_activation_12_0= ruleActivation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConnectionDecoration", "true");
            	    }
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1210:16: ( (lv_activation_12_0= ruleActivation ) )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1211:1: (lv_activation_12_0= ruleActivation )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1211:1: (lv_activation_12_0= ruleActivation )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1212:3: lv_activation_12_0= ruleActivation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectionDecorationAccess().getActivationActivationParserRuleCall_3_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivation_in_ruleConnectionDecoration3034);
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

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleConnectionDecoration3086); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1254:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1255:2: (iv_ruleText= ruleText EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1256:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText3122);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText3132); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1263:1: ruleText returns [EObject current=null] : (this_SimpleText_0= ruleSimpleText | this_ComplexText_1= ruleComplexText ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleText_0 = null;

        EObject this_ComplexText_1 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1266:28: ( (this_SimpleText_0= ruleSimpleText | this_ComplexText_1= ruleComplexText ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1267:1: (this_SimpleText_0= ruleSimpleText | this_ComplexText_1= ruleComplexText )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1267:1: (this_SimpleText_0= ruleSimpleText | this_ComplexText_1= ruleComplexText )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1268:5: this_SimpleText_0= ruleSimpleText
                    {
                     
                            newCompositeNode(grammarAccess.getTextAccess().getSimpleTextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleText_in_ruleText3179);
                    this_SimpleText_0=ruleSimpleText();

                    state._fsp--;

                     
                            current = this_SimpleText_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1278:5: this_ComplexText_1= ruleComplexText
                    {
                     
                            newCompositeNode(grammarAccess.getTextAccess().getComplexTextParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComplexText_in_ruleText3206);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1294:1: entryRuleSimpleText returns [EObject current=null] : iv_ruleSimpleText= ruleSimpleText EOF ;
    public final EObject entryRuleSimpleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleText = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1295:2: (iv_ruleSimpleText= ruleSimpleText EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1296:2: iv_ruleSimpleText= ruleSimpleText EOF
            {
             newCompositeNode(grammarAccess.getSimpleTextRule()); 
            pushFollow(FOLLOW_ruleSimpleText_in_entryRuleSimpleText3241);
            iv_ruleSimpleText=ruleSimpleText();

            state._fsp--;

             current =iv_ruleSimpleText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleText3251); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1303:1: ruleSimpleText returns [EObject current=null] : ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleSimpleText() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1306:28: ( ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( ruleQualifiedName ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1307:1: ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( ruleQualifiedName ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1307:1: ( ( (lv_text_0_0= RULE_STRING ) ) | ( ( ruleQualifiedName ) ) )
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
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1307:2: ( (lv_text_0_0= RULE_STRING ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1307:2: ( (lv_text_0_0= RULE_STRING ) )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1308:1: (lv_text_0_0= RULE_STRING )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1308:1: (lv_text_0_0= RULE_STRING )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1309:3: lv_text_0_0= RULE_STRING
                    {
                    lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleText3293); 

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
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1326:6: ( ( ruleQualifiedName ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1326:6: ( ( ruleQualifiedName ) )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1327:1: ( ruleQualifiedName )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1327:1: ( ruleQualifiedName )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1328:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleTextRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSimpleTextAccess().getAttributeEAttributeCrossReference_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSimpleText3327);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1349:1: entryRuleComplexText returns [EObject current=null] : iv_ruleComplexText= ruleComplexText EOF ;
    public final EObject entryRuleComplexText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexText = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1350:2: (iv_ruleComplexText= ruleComplexText EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1351:2: iv_ruleComplexText= ruleComplexText EOF
            {
             newCompositeNode(grammarAccess.getComplexTextRule()); 
            pushFollow(FOLLOW_ruleComplexText_in_entryRuleComplexText3363);
            iv_ruleComplexText=ruleComplexText();

            state._fsp--;

             current =iv_ruleComplexText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexText3373); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1358:1: ruleComplexText returns [EObject current=null] : ( ( (lv_left_0_0= ruleSimpleText ) ) otherlv_1= '+' ( (lv_right_2_0= ruleText ) ) ) ;
    public final EObject ruleComplexText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1361:28: ( ( ( (lv_left_0_0= ruleSimpleText ) ) otherlv_1= '+' ( (lv_right_2_0= ruleText ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1362:1: ( ( (lv_left_0_0= ruleSimpleText ) ) otherlv_1= '+' ( (lv_right_2_0= ruleText ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1362:1: ( ( (lv_left_0_0= ruleSimpleText ) ) otherlv_1= '+' ( (lv_right_2_0= ruleText ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1362:2: ( (lv_left_0_0= ruleSimpleText ) ) otherlv_1= '+' ( (lv_right_2_0= ruleText ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1362:2: ( (lv_left_0_0= ruleSimpleText ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1363:1: (lv_left_0_0= ruleSimpleText )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1363:1: (lv_left_0_0= ruleSimpleText )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1364:3: lv_left_0_0= ruleSimpleText
            {
             
            	        newCompositeNode(grammarAccess.getComplexTextAccess().getLeftSimpleTextParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSimpleText_in_ruleComplexText3419);
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

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleComplexText3431); 

                	newLeafNode(otherlv_1, grammarAccess.getComplexTextAccess().getPlusSignKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1384:1: ( (lv_right_2_0= ruleText ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1385:1: (lv_right_2_0= ruleText )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1385:1: (lv_right_2_0= ruleText )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1386:3: lv_right_2_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getComplexTextAccess().getRightTextParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleComplexText3452);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1410:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1411:2: (iv_ruleStyle= ruleStyle EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1412:2: iv_ruleStyle= ruleStyle EOF
            {
             newCompositeNode(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_ruleStyle_in_entryRuleStyle3488);
            iv_ruleStyle=ruleStyle();

            state._fsp--;

             current =iv_ruleStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStyle3498); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1419:1: ruleStyle returns [EObject current=null] : (otherlv_0= 'line-style' otherlv_1= '=' ( (lv_value_2_0= ruleLineStyle ) ) ) ;
    public final EObject ruleStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1422:28: ( (otherlv_0= 'line-style' otherlv_1= '=' ( (lv_value_2_0= ruleLineStyle ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1423:1: (otherlv_0= 'line-style' otherlv_1= '=' ( (lv_value_2_0= ruleLineStyle ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1423:1: (otherlv_0= 'line-style' otherlv_1= '=' ( (lv_value_2_0= ruleLineStyle ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1423:3: otherlv_0= 'line-style' otherlv_1= '=' ( (lv_value_2_0= ruleLineStyle ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleStyle3535); 

                	newLeafNode(otherlv_0, grammarAccess.getStyleAccess().getLineStyleKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleStyle3547); 

                	newLeafNode(otherlv_1, grammarAccess.getStyleAccess().getEqualsSignKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1431:1: ( (lv_value_2_0= ruleLineStyle ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1432:1: (lv_value_2_0= ruleLineStyle )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1432:1: (lv_value_2_0= ruleLineStyle )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1433:3: lv_value_2_0= ruleLineStyle
            {
             
            	        newCompositeNode(grammarAccess.getStyleAccess().getValueLineStyleEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLineStyle_in_ruleStyle3568);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1457:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1458:2: (iv_ruleSize= ruleSize EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1459:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_ruleSize_in_entryRuleSize3604);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSize3614); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1466:1: ruleSize returns [EObject current=null] : (otherlv_0= 'size' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1469:28: ( (otherlv_0= 'size' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1470:1: (otherlv_0= 'size' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1470:1: (otherlv_0= 'size' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1470:3: otherlv_0= 'size' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleSize3651); 

                	newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleSize3663); 

                	newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getEqualsSignKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1478:1: ( (lv_value_2_0= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1479:1: (lv_value_2_0= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1479:1: (lv_value_2_0= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1480:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSize3680); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1504:1: entryRuleDirection returns [EObject current=null] : iv_ruleDirection= ruleDirection EOF ;
    public final EObject entryRuleDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirection = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1505:2: (iv_ruleDirection= ruleDirection EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1506:2: iv_ruleDirection= ruleDirection EOF
            {
             newCompositeNode(grammarAccess.getDirectionRule()); 
            pushFollow(FOLLOW_ruleDirection_in_entryRuleDirection3721);
            iv_ruleDirection=ruleDirection();

            state._fsp--;

             current =iv_ruleDirection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirection3731); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1513:1: ruleDirection returns [EObject current=null] : (otherlv_0= 'direction' otherlv_1= '=' ( (lv_value_2_0= ruleDirections ) ) ) ;
    public final EObject ruleDirection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1516:28: ( (otherlv_0= 'direction' otherlv_1= '=' ( (lv_value_2_0= ruleDirections ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1517:1: (otherlv_0= 'direction' otherlv_1= '=' ( (lv_value_2_0= ruleDirections ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1517:1: (otherlv_0= 'direction' otherlv_1= '=' ( (lv_value_2_0= ruleDirections ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1517:3: otherlv_0= 'direction' otherlv_1= '=' ( (lv_value_2_0= ruleDirections ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleDirection3768); 

                	newLeafNode(otherlv_0, grammarAccess.getDirectionAccess().getDirectionKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleDirection3780); 

                	newLeafNode(otherlv_1, grammarAccess.getDirectionAccess().getEqualsSignKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1525:1: ( (lv_value_2_0= ruleDirections ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1526:1: (lv_value_2_0= ruleDirections )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1526:1: (lv_value_2_0= ruleDirections )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1527:3: lv_value_2_0= ruleDirections
            {
             
            	        newCompositeNode(grammarAccess.getDirectionAccess().getValueDirectionsEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDirections_in_ruleDirection3801);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1551:1: entryRuleMargin returns [EObject current=null] : iv_ruleMargin= ruleMargin EOF ;
    public final EObject entryRuleMargin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMargin = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1552:2: (iv_ruleMargin= ruleMargin EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1553:2: iv_ruleMargin= ruleMargin EOF
            {
             newCompositeNode(grammarAccess.getMarginRule()); 
            pushFollow(FOLLOW_ruleMargin_in_entryRuleMargin3837);
            iv_ruleMargin=ruleMargin();

            state._fsp--;

             current =iv_ruleMargin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMargin3847); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1560:1: ruleMargin returns [EObject current=null] : (otherlv_0= 'margin' otherlv_1= '=' ( (lv_value_2_0= ruleSignedInteger ) ) ) ;
    public final EObject ruleMargin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1563:28: ( (otherlv_0= 'margin' otherlv_1= '=' ( (lv_value_2_0= ruleSignedInteger ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1564:1: (otherlv_0= 'margin' otherlv_1= '=' ( (lv_value_2_0= ruleSignedInteger ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1564:1: (otherlv_0= 'margin' otherlv_1= '=' ( (lv_value_2_0= ruleSignedInteger ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1564:3: otherlv_0= 'margin' otherlv_1= '=' ( (lv_value_2_0= ruleSignedInteger ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleMargin3884); 

                	newLeafNode(otherlv_0, grammarAccess.getMarginAccess().getMarginKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleMargin3896); 

                	newLeafNode(otherlv_1, grammarAccess.getMarginAccess().getEqualsSignKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1572:1: ( (lv_value_2_0= ruleSignedInteger ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1573:1: (lv_value_2_0= ruleSignedInteger )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1573:1: (lv_value_2_0= ruleSignedInteger )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1574:3: lv_value_2_0= ruleSignedInteger
            {
             
            	        newCompositeNode(grammarAccess.getMarginAccess().getValueSignedIntegerParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSignedInteger_in_ruleMargin3917);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1598:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1599:2: (iv_ruleColor= ruleColor EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1600:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor3953);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor3963); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1607:1: ruleColor returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleColorConstant ) ) ) | ( (lv_concrete_2_0= ruleConcreteColor ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;

        EObject lv_concrete_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1610:28: ( ( ( () ( (lv_value_1_0= ruleColorConstant ) ) ) | ( (lv_concrete_2_0= ruleConcreteColor ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1611:1: ( ( () ( (lv_value_1_0= ruleColorConstant ) ) ) | ( (lv_concrete_2_0= ruleConcreteColor ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1611:1: ( ( () ( (lv_value_1_0= ruleColorConstant ) ) ) | ( (lv_concrete_2_0= ruleConcreteColor ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=53 && LA13_0<=67)) ) {
                alt13=1;
            }
            else if ( (LA13_0==33) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1611:2: ( () ( (lv_value_1_0= ruleColorConstant ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1611:2: ( () ( (lv_value_1_0= ruleColorConstant ) ) )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1611:3: () ( (lv_value_1_0= ruleColorConstant ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1611:3: ()
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1612:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getColorAccess().getColorAction_0_0(),
                                current);
                        

                    }

                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1617:2: ( (lv_value_1_0= ruleColorConstant ) )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1618:1: (lv_value_1_0= ruleColorConstant )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1618:1: (lv_value_1_0= ruleColorConstant )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1619:3: lv_value_1_0= ruleColorConstant
                    {
                     
                    	        newCompositeNode(grammarAccess.getColorAccess().getValueColorConstantParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColorConstant_in_ruleColor4019);
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
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1636:6: ( (lv_concrete_2_0= ruleConcreteColor ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1636:6: ( (lv_concrete_2_0= ruleConcreteColor ) )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1637:1: (lv_concrete_2_0= ruleConcreteColor )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1637:1: (lv_concrete_2_0= ruleConcreteColor )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1638:3: lv_concrete_2_0= ruleConcreteColor
                    {
                     
                    	        newCompositeNode(grammarAccess.getColorAccess().getConcreteConcreteColorParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConcreteColor_in_ruleColor4047);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1662:1: entryRuleConcreteColor returns [EObject current=null] : iv_ruleConcreteColor= ruleConcreteColor EOF ;
    public final EObject entryRuleConcreteColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteColor = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1663:2: (iv_ruleConcreteColor= ruleConcreteColor EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1664:2: iv_ruleConcreteColor= ruleConcreteColor EOF
            {
             newCompositeNode(grammarAccess.getConcreteColorRule()); 
            pushFollow(FOLLOW_ruleConcreteColor_in_entryRuleConcreteColor4083);
            iv_ruleConcreteColor=ruleConcreteColor();

            state._fsp--;

             current =iv_ruleConcreteColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcreteColor4093); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1671:1: ruleConcreteColor returns [EObject current=null] : (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
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
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1674:28: ( (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1675:1: (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1675:1: (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1675:3: otherlv_0= 'RGB' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleConcreteColor4130); 

                	newLeafNode(otherlv_0, grammarAccess.getConcreteColorAccess().getRGBKeyword_0());
                
            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleConcreteColor4142); 

                	newLeafNode(otherlv_1, grammarAccess.getConcreteColorAccess().getLeftParenthesisKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1683:1: ( (lv_red_2_0= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1684:1: (lv_red_2_0= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1684:1: (lv_red_2_0= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1685:3: lv_red_2_0= RULE_INT
            {
            lv_red_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConcreteColor4159); 

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

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleConcreteColor4176); 

                	newLeafNode(otherlv_3, grammarAccess.getConcreteColorAccess().getCommaKeyword_3());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1705:1: ( (lv_green_4_0= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1706:1: (lv_green_4_0= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1706:1: (lv_green_4_0= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1707:3: lv_green_4_0= RULE_INT
            {
            lv_green_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConcreteColor4193); 

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

            otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleConcreteColor4210); 

                	newLeafNode(otherlv_5, grammarAccess.getConcreteColorAccess().getCommaKeyword_5());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1727:1: ( (lv_blue_6_0= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1728:1: (lv_blue_6_0= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1728:1: (lv_blue_6_0= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1729:3: lv_blue_6_0= RULE_INT
            {
            lv_blue_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConcreteColor4227); 

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

            otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleConcreteColor4244); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1757:1: entryRuleColorConstant returns [EObject current=null] : iv_ruleColorConstant= ruleColorConstant EOF ;
    public final EObject entryRuleColorConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorConstant = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1758:2: (iv_ruleColorConstant= ruleColorConstant EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1759:2: iv_ruleColorConstant= ruleColorConstant EOF
            {
             newCompositeNode(grammarAccess.getColorConstantRule()); 
            pushFollow(FOLLOW_ruleColorConstant_in_entryRuleColorConstant4280);
            iv_ruleColorConstant=ruleColorConstant();

            state._fsp--;

             current =iv_ruleColorConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorConstant4290); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1766:1: ruleColorConstant returns [EObject current=null] : ( (lv_value_0_0= ruleColors ) ) ;
    public final EObject ruleColorConstant() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1769:28: ( ( (lv_value_0_0= ruleColors ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1770:1: ( (lv_value_0_0= ruleColors ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1770:1: ( (lv_value_0_0= ruleColors ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1771:1: (lv_value_0_0= ruleColors )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1771:1: (lv_value_0_0= ruleColors )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1772:3: lv_value_0_0= ruleColors
            {
             
            	        newCompositeNode(grammarAccess.getColorConstantAccess().getValueColorsEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleColors_in_ruleColorConstant4335);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1796:1: entryRuleActivation returns [EObject current=null] : iv_ruleActivation= ruleActivation EOF ;
    public final EObject entryRuleActivation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivation = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1797:2: (iv_ruleActivation= ruleActivation EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1798:2: iv_ruleActivation= ruleActivation EOF
            {
             newCompositeNode(grammarAccess.getActivationRule()); 
            pushFollow(FOLLOW_ruleActivation_in_entryRuleActivation4370);
            iv_ruleActivation=ruleActivation();

            state._fsp--;

             current =iv_ruleActivation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivation4380); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1805:1: ruleActivation returns [EObject current=null] : (otherlv_0= 'active when' ( (lv_condition_1_0= ruleAbstractCondition ) ) ) ;
    public final EObject ruleActivation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_condition_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1808:28: ( (otherlv_0= 'active when' ( (lv_condition_1_0= ruleAbstractCondition ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1809:1: (otherlv_0= 'active when' ( (lv_condition_1_0= ruleAbstractCondition ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1809:1: (otherlv_0= 'active when' ( (lv_condition_1_0= ruleAbstractCondition ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1809:3: otherlv_0= 'active when' ( (lv_condition_1_0= ruleAbstractCondition ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleActivation4417); 

                	newLeafNode(otherlv_0, grammarAccess.getActivationAccess().getActiveWhenKeyword_0());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1813:1: ( (lv_condition_1_0= ruleAbstractCondition ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1814:1: (lv_condition_1_0= ruleAbstractCondition )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1814:1: (lv_condition_1_0= ruleAbstractCondition )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1815:3: lv_condition_1_0= ruleAbstractCondition
            {
             
            	        newCompositeNode(grammarAccess.getActivationAccess().getConditionAbstractConditionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractCondition_in_ruleActivation4438);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1839:1: entryRuleAbstractCondition returns [EObject current=null] : iv_ruleAbstractCondition= ruleAbstractCondition EOF ;
    public final EObject entryRuleAbstractCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCondition = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1840:2: (iv_ruleAbstractCondition= ruleAbstractCondition EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1841:2: iv_ruleAbstractCondition= ruleAbstractCondition EOF
            {
             newCompositeNode(grammarAccess.getAbstractConditionRule()); 
            pushFollow(FOLLOW_ruleAbstractCondition_in_entryRuleAbstractCondition4474);
            iv_ruleAbstractCondition=ruleAbstractCondition();

            state._fsp--;

             current =iv_ruleAbstractCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractCondition4484); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1848:1: ruleAbstractCondition returns [EObject current=null] : (this_Condition_0= ruleCondition | this_CompositeCondition_1= ruleCompositeCondition ) ;
    public final EObject ruleAbstractCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Condition_0 = null;

        EObject this_CompositeCondition_1 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1851:28: ( (this_Condition_0= ruleCondition | this_CompositeCondition_1= ruleCompositeCondition ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1852:1: (this_Condition_0= ruleCondition | this_CompositeCondition_1= ruleCompositeCondition )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1852:1: (this_Condition_0= ruleCondition | this_CompositeCondition_1= ruleCompositeCondition )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=46 && LA14_0<=47)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1853:5: this_Condition_0= ruleCondition
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractConditionAccess().getConditionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCondition_in_ruleAbstractCondition4531);
                    this_Condition_0=ruleCondition();

                    state._fsp--;

                     
                            current = this_Condition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1863:5: this_CompositeCondition_1= ruleCompositeCondition
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractConditionAccess().getCompositeConditionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCompositeCondition_in_ruleAbstractCondition4558);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1879:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1880:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1881:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition4593);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition4603); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1888:1: ruleCondition returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_value_2_0= ruleType ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1891:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_value_2_0= ruleType ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1892:1: ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_value_2_0= ruleType ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1892:1: ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_value_2_0= ruleType ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1892:2: ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_value_2_0= ruleType ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1892:2: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1893:1: ( ruleQualifiedName )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1893:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1894:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getAttributeEAttributeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCondition4651);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1907:2: ( (lv_operator_1_0= ruleComparisonOperator ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1908:1: (lv_operator_1_0= ruleComparisonOperator )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1908:1: (lv_operator_1_0= ruleComparisonOperator )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1909:3: lv_operator_1_0= ruleComparisonOperator
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getOperatorComparisonOperatorEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleComparisonOperator_in_ruleCondition4672);
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

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1925:2: ( (lv_value_2_0= ruleType ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1926:1: (lv_value_2_0= ruleType )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1926:1: (lv_value_2_0= ruleType )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1927:3: lv_value_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getValueTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleCondition4693);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1951:1: entryRuleCompositeCondition returns [EObject current=null] : iv_ruleCompositeCondition= ruleCompositeCondition EOF ;
    public final EObject entryRuleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeCondition = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1952:2: (iv_ruleCompositeCondition= ruleCompositeCondition EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1953:2: iv_ruleCompositeCondition= ruleCompositeCondition EOF
            {
             newCompositeNode(grammarAccess.getCompositeConditionRule()); 
            pushFollow(FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition4729);
            iv_ruleCompositeCondition=ruleCompositeCondition();

            state._fsp--;

             current =iv_ruleCompositeCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeCondition4739); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1960:1: ruleCompositeCondition returns [EObject current=null] : ( ( (lv_operator_0_0= ruleLogicalOperator ) ) otherlv_1= '(' ( (lv_conditions_2_0= ruleAbstractCondition ) )+ otherlv_3= ')' ) ;
    public final EObject ruleCompositeCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_operator_0_0 = null;

        EObject lv_conditions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1963:28: ( ( ( (lv_operator_0_0= ruleLogicalOperator ) ) otherlv_1= '(' ( (lv_conditions_2_0= ruleAbstractCondition ) )+ otherlv_3= ')' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1964:1: ( ( (lv_operator_0_0= ruleLogicalOperator ) ) otherlv_1= '(' ( (lv_conditions_2_0= ruleAbstractCondition ) )+ otherlv_3= ')' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1964:1: ( ( (lv_operator_0_0= ruleLogicalOperator ) ) otherlv_1= '(' ( (lv_conditions_2_0= ruleAbstractCondition ) )+ otherlv_3= ')' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1964:2: ( (lv_operator_0_0= ruleLogicalOperator ) ) otherlv_1= '(' ( (lv_conditions_2_0= ruleAbstractCondition ) )+ otherlv_3= ')'
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1964:2: ( (lv_operator_0_0= ruleLogicalOperator ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1965:1: (lv_operator_0_0= ruleLogicalOperator )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1965:1: (lv_operator_0_0= ruleLogicalOperator )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1966:3: lv_operator_0_0= ruleLogicalOperator
            {
             
            	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getOperatorLogicalOperatorEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLogicalOperator_in_ruleCompositeCondition4785);
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

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleCompositeCondition4797); 

                	newLeafNode(otherlv_1, grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1986:1: ( (lv_conditions_2_0= ruleAbstractCondition ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=46 && LA15_0<=47)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1987:1: (lv_conditions_2_0= ruleAbstractCondition )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1987:1: (lv_conditions_2_0= ruleAbstractCondition )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1988:3: lv_conditions_2_0= ruleAbstractCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsAbstractConditionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractCondition_in_ruleCompositeCondition4818);
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleCompositeCondition4831); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2016:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2017:2: (iv_ruleType= ruleType EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2018:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType4868);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType4879); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2025:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SignedInteger_0= ruleSignedInteger | this_SignedDouble_1= ruleSignedDouble | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_2=null;
        Token this_BOOLEAN_3=null;
        AntlrDatatypeRuleToken this_SignedInteger_0 = null;

        AntlrDatatypeRuleToken this_SignedDouble_1 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2028:28: ( (this_SignedInteger_0= ruleSignedInteger | this_SignedDouble_1= ruleSignedDouble | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2029:1: (this_SignedInteger_0= ruleSignedInteger | this_SignedDouble_1= ruleSignedDouble | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2029:1: (this_SignedInteger_0= ruleSignedInteger | this_SignedDouble_1= ruleSignedDouble | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==RULE_INT) ) {
                    int LA16_2 = input.LA(3);

                    if ( (LA16_2==39) ) {
                        alt16=2;
                    }
                    else if ( (LA16_2==EOF||LA16_2==RULE_ID||(LA16_2>=16 && LA16_2<=18)||(LA16_2>=20 && LA16_2<=27)||(LA16_2>=29 && LA16_2<=32)||(LA16_2>=36 && LA16_2<=37)||(LA16_2>=46 && LA16_2<=47)) ) {
                        alt16=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==39) ) {
                    alt16=2;
                }
                else if ( (LA16_2==EOF||LA16_2==RULE_ID||(LA16_2>=16 && LA16_2<=18)||(LA16_2>=20 && LA16_2<=27)||(LA16_2>=29 && LA16_2<=32)||(LA16_2>=36 && LA16_2<=37)||(LA16_2>=46 && LA16_2<=47)) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt16=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2030:5: this_SignedInteger_0= ruleSignedInteger
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSignedIntegerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSignedInteger_in_ruleType4926);
                    this_SignedInteger_0=ruleSignedInteger();

                    state._fsp--;


                    		current.merge(this_SignedInteger_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2042:5: this_SignedDouble_1= ruleSignedDouble
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSignedDoubleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSignedDouble_in_ruleType4959);
                    this_SignedDouble_1=ruleSignedDouble();

                    state._fsp--;


                    		current.merge(this_SignedDouble_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2053:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleType4985); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getTypeAccess().getSTRINGTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2061:10: this_BOOLEAN_3= RULE_BOOLEAN
                    {
                    this_BOOLEAN_3=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleType5011); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2076:1: entryRuleSignedDouble returns [String current=null] : iv_ruleSignedDouble= ruleSignedDouble EOF ;
    public final String entryRuleSignedDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedDouble = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2077:2: (iv_ruleSignedDouble= ruleSignedDouble EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2078:2: iv_ruleSignedDouble= ruleSignedDouble EOF
            {
             newCompositeNode(grammarAccess.getSignedDoubleRule()); 
            pushFollow(FOLLOW_ruleSignedDouble_in_entryRuleSignedDouble5057);
            iv_ruleSignedDouble=ruleSignedDouble();

            state._fsp--;

             current =iv_ruleSignedDouble.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedDouble5068); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2085:1: ruleSignedDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2088:28: ( ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2089:1: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2089:1: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2089:2: (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2089:2: (kw= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2090:2: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleSignedDouble5107); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedDoubleAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedDouble5124); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getSignedDoubleAccess().getINTTerminalRuleCall_1()); 
                
            kw=(Token)match(input,39,FOLLOW_39_in_ruleSignedDouble5142); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSignedDoubleAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedDouble5157); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2123:1: entryRuleSignedInteger returns [String current=null] : iv_ruleSignedInteger= ruleSignedInteger EOF ;
    public final String entryRuleSignedInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInteger = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2124:2: (iv_ruleSignedInteger= ruleSignedInteger EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2125:2: iv_ruleSignedInteger= ruleSignedInteger EOF
            {
             newCompositeNode(grammarAccess.getSignedIntegerRule()); 
            pushFollow(FOLLOW_ruleSignedInteger_in_entryRuleSignedInteger5203);
            iv_ruleSignedInteger=ruleSignedInteger();

            state._fsp--;

             current =iv_ruleSignedInteger.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedInteger5214); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2132:1: ruleSignedInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2135:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2136:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2136:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2136:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2136:2: (kw= '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2137:2: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleSignedInteger5253); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedIntegerAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedInteger5270); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2159:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2160:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2161:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5318);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName5329); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2168:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2171:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2172:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2172:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2172:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName5369); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2179:1: (kw= '.' this_ID_2= RULE_ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==39) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2180:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,39,FOLLOW_39_in_ruleQualifiedName5388); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName5403); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2200:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '<=' ) ) ;
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
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2202:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '<=' ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2203:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '<=' ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2203:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '<=' ) )
            int alt20=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt20=1;
                }
                break;
            case 41:
                {
                alt20=2;
                }
                break;
            case 42:
                {
                alt20=3;
                }
                break;
            case 43:
                {
                alt20=4;
                }
                break;
            case 44:
                {
                alt20=5;
                }
                break;
            case 45:
                {
                alt20=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2203:2: (enumLiteral_0= '==' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2203:2: (enumLiteral_0= '==' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2203:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleComparisonOperator5464); 

                            current = grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2209:6: (enumLiteral_1= '!=' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2209:6: (enumLiteral_1= '!=' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2209:8: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_41_in_ruleComparisonOperator5481); 

                            current = grammarAccess.getComparisonOperatorAccess().getUNEQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getUNEQUALEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2215:6: (enumLiteral_2= '>' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2215:6: (enumLiteral_2= '>' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2215:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_42_in_ruleComparisonOperator5498); 

                            current = grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2221:6: (enumLiteral_3= '>=' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2221:6: (enumLiteral_3= '>=' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2221:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_43_in_ruleComparisonOperator5515); 

                            current = grammarAccess.getComparisonOperatorAccess().getGREATEROREQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getGREATEROREQUALEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2227:6: (enumLiteral_4= '<' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2227:6: (enumLiteral_4= '<' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2227:8: enumLiteral_4= '<'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_44_in_ruleComparisonOperator5532); 

                            current = grammarAccess.getComparisonOperatorAccess().getLOWEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getLOWEREnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2233:6: (enumLiteral_5= '<=' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2233:6: (enumLiteral_5= '<=' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2233:8: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,45,FOLLOW_45_in_ruleComparisonOperator5549); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2243:1: ruleLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'any' ) ) ;
    public final Enumerator ruleLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2245:28: ( ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'any' ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2246:1: ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'any' ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2246:1: ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'any' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==46) ) {
                alt21=1;
            }
            else if ( (LA21_0==47) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2246:2: (enumLiteral_0= 'all' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2246:2: (enumLiteral_0= 'all' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2246:4: enumLiteral_0= 'all'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_46_in_ruleLogicalOperator5594); 

                            current = grammarAccess.getLogicalOperatorAccess().getALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperatorAccess().getALLEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2252:6: (enumLiteral_1= 'any' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2252:6: (enumLiteral_1= 'any' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2252:8: enumLiteral_1= 'any'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_47_in_ruleLogicalOperator5611); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2262:1: ruleLineStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dot' ) | (enumLiteral_2= 'dash' ) | (enumLiteral_3= 'dash_dot' ) | (enumLiteral_4= 'dash_dot_dot' ) ) ;
    public final Enumerator ruleLineStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2264:28: ( ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dot' ) | (enumLiteral_2= 'dash' ) | (enumLiteral_3= 'dash_dot' ) | (enumLiteral_4= 'dash_dot_dot' ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2265:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dot' ) | (enumLiteral_2= 'dash' ) | (enumLiteral_3= 'dash_dot' ) | (enumLiteral_4= 'dash_dot_dot' ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2265:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dot' ) | (enumLiteral_2= 'dash' ) | (enumLiteral_3= 'dash_dot' ) | (enumLiteral_4= 'dash_dot_dot' ) )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt22=1;
                }
                break;
            case 49:
                {
                alt22=2;
                }
                break;
            case 50:
                {
                alt22=3;
                }
                break;
            case 51:
                {
                alt22=4;
                }
                break;
            case 52:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2265:2: (enumLiteral_0= 'solid' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2265:2: (enumLiteral_0= 'solid' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2265:4: enumLiteral_0= 'solid'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_48_in_ruleLineStyle5656); 

                            current = grammarAccess.getLineStyleAccess().getLINE_SOLIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLineStyleAccess().getLINE_SOLIDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2271:6: (enumLiteral_1= 'dot' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2271:6: (enumLiteral_1= 'dot' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2271:8: enumLiteral_1= 'dot'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_49_in_ruleLineStyle5673); 

                            current = grammarAccess.getLineStyleAccess().getLINE_DOTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLineStyleAccess().getLINE_DOTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2277:6: (enumLiteral_2= 'dash' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2277:6: (enumLiteral_2= 'dash' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2277:8: enumLiteral_2= 'dash'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_50_in_ruleLineStyle5690); 

                            current = grammarAccess.getLineStyleAccess().getLINE_DASHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLineStyleAccess().getLINE_DASHEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2283:6: (enumLiteral_3= 'dash_dot' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2283:6: (enumLiteral_3= 'dash_dot' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2283:8: enumLiteral_3= 'dash_dot'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_51_in_ruleLineStyle5707); 

                            current = grammarAccess.getLineStyleAccess().getLINE_DASHDOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLineStyleAccess().getLINE_DASHDOTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2289:6: (enumLiteral_4= 'dash_dot_dot' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2289:6: (enumLiteral_4= 'dash_dot_dot' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2289:8: enumLiteral_4= 'dash_dot_dot'
                    {
                    enumLiteral_4=(Token)match(input,52,FOLLOW_52_in_ruleLineStyle5724); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2299:1: ruleColors returns [Enumerator current=null] : ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'white' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'green_light' ) | (enumLiteral_5= 'green_dark' ) | (enumLiteral_6= 'blue' ) | (enumLiteral_7= 'blue_light' ) | (enumLiteral_8= 'blue_dark' ) | (enumLiteral_9= 'gray' ) | (enumLiteral_10= 'gray_light' ) | (enumLiteral_11= 'gray_dark' ) | (enumLiteral_12= 'orange' ) | (enumLiteral_13= 'yellow' ) | (enumLiteral_14= 'cyan' ) ) ;
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
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2301:28: ( ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'white' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'green_light' ) | (enumLiteral_5= 'green_dark' ) | (enumLiteral_6= 'blue' ) | (enumLiteral_7= 'blue_light' ) | (enumLiteral_8= 'blue_dark' ) | (enumLiteral_9= 'gray' ) | (enumLiteral_10= 'gray_light' ) | (enumLiteral_11= 'gray_dark' ) | (enumLiteral_12= 'orange' ) | (enumLiteral_13= 'yellow' ) | (enumLiteral_14= 'cyan' ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2302:1: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'white' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'green_light' ) | (enumLiteral_5= 'green_dark' ) | (enumLiteral_6= 'blue' ) | (enumLiteral_7= 'blue_light' ) | (enumLiteral_8= 'blue_dark' ) | (enumLiteral_9= 'gray' ) | (enumLiteral_10= 'gray_light' ) | (enumLiteral_11= 'gray_dark' ) | (enumLiteral_12= 'orange' ) | (enumLiteral_13= 'yellow' ) | (enumLiteral_14= 'cyan' ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2302:1: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'white' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'green_light' ) | (enumLiteral_5= 'green_dark' ) | (enumLiteral_6= 'blue' ) | (enumLiteral_7= 'blue_light' ) | (enumLiteral_8= 'blue_dark' ) | (enumLiteral_9= 'gray' ) | (enumLiteral_10= 'gray_light' ) | (enumLiteral_11= 'gray_dark' ) | (enumLiteral_12= 'orange' ) | (enumLiteral_13= 'yellow' ) | (enumLiteral_14= 'cyan' ) )
            int alt23=15;
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
            case 57:
                {
                alt23=5;
                }
                break;
            case 58:
                {
                alt23=6;
                }
                break;
            case 59:
                {
                alt23=7;
                }
                break;
            case 60:
                {
                alt23=8;
                }
                break;
            case 61:
                {
                alt23=9;
                }
                break;
            case 62:
                {
                alt23=10;
                }
                break;
            case 63:
                {
                alt23=11;
                }
                break;
            case 64:
                {
                alt23=12;
                }
                break;
            case 65:
                {
                alt23=13;
                }
                break;
            case 66:
                {
                alt23=14;
                }
                break;
            case 67:
                {
                alt23=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2302:2: (enumLiteral_0= 'red' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2302:2: (enumLiteral_0= 'red' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2302:4: enumLiteral_0= 'red'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_53_in_ruleColors5769); 

                            current = grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2308:6: (enumLiteral_1= 'black' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2308:6: (enumLiteral_1= 'black' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2308:8: enumLiteral_1= 'black'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_54_in_ruleColors5786); 

                            current = grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2314:6: (enumLiteral_2= 'white' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2314:6: (enumLiteral_2= 'white' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2314:8: enumLiteral_2= 'white'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_55_in_ruleColors5803); 

                            current = grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2320:6: (enumLiteral_3= 'green' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2320:6: (enumLiteral_3= 'green' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2320:8: enumLiteral_3= 'green'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_56_in_ruleColors5820); 

                            current = grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2326:6: (enumLiteral_4= 'green_light' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2326:6: (enumLiteral_4= 'green_light' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2326:8: enumLiteral_4= 'green_light'
                    {
                    enumLiteral_4=(Token)match(input,57,FOLLOW_57_in_ruleColors5837); 

                            current = grammarAccess.getColorsAccess().getGREEN_LIGHTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getColorsAccess().getGREEN_LIGHTEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2332:6: (enumLiteral_5= 'green_dark' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2332:6: (enumLiteral_5= 'green_dark' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2332:8: enumLiteral_5= 'green_dark'
                    {
                    enumLiteral_5=(Token)match(input,58,FOLLOW_58_in_ruleColors5854); 

                            current = grammarAccess.getColorsAccess().getGREEN_DARKEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getColorsAccess().getGREEN_DARKEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2338:6: (enumLiteral_6= 'blue' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2338:6: (enumLiteral_6= 'blue' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2338:8: enumLiteral_6= 'blue'
                    {
                    enumLiteral_6=(Token)match(input,59,FOLLOW_59_in_ruleColors5871); 

                            current = grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2344:6: (enumLiteral_7= 'blue_light' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2344:6: (enumLiteral_7= 'blue_light' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2344:8: enumLiteral_7= 'blue_light'
                    {
                    enumLiteral_7=(Token)match(input,60,FOLLOW_60_in_ruleColors5888); 

                            current = grammarAccess.getColorsAccess().getBLUE_LIGHTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getColorsAccess().getBLUE_LIGHTEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2350:6: (enumLiteral_8= 'blue_dark' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2350:6: (enumLiteral_8= 'blue_dark' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2350:8: enumLiteral_8= 'blue_dark'
                    {
                    enumLiteral_8=(Token)match(input,61,FOLLOW_61_in_ruleColors5905); 

                            current = grammarAccess.getColorsAccess().getBLUE_DARKEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getColorsAccess().getBLUE_DARKEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2356:6: (enumLiteral_9= 'gray' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2356:6: (enumLiteral_9= 'gray' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2356:8: enumLiteral_9= 'gray'
                    {
                    enumLiteral_9=(Token)match(input,62,FOLLOW_62_in_ruleColors5922); 

                            current = grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2362:6: (enumLiteral_10= 'gray_light' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2362:6: (enumLiteral_10= 'gray_light' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2362:8: enumLiteral_10= 'gray_light'
                    {
                    enumLiteral_10=(Token)match(input,63,FOLLOW_63_in_ruleColors5939); 

                            current = grammarAccess.getColorsAccess().getGRAY_LIGHTEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getColorsAccess().getGRAY_LIGHTEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2368:6: (enumLiteral_11= 'gray_dark' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2368:6: (enumLiteral_11= 'gray_dark' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2368:8: enumLiteral_11= 'gray_dark'
                    {
                    enumLiteral_11=(Token)match(input,64,FOLLOW_64_in_ruleColors5956); 

                            current = grammarAccess.getColorsAccess().getGRAY_DARKEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getColorsAccess().getGRAY_DARKEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2374:6: (enumLiteral_12= 'orange' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2374:6: (enumLiteral_12= 'orange' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2374:8: enumLiteral_12= 'orange'
                    {
                    enumLiteral_12=(Token)match(input,65,FOLLOW_65_in_ruleColors5973); 

                            current = grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2380:6: (enumLiteral_13= 'yellow' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2380:6: (enumLiteral_13= 'yellow' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2380:8: enumLiteral_13= 'yellow'
                    {
                    enumLiteral_13=(Token)match(input,66,FOLLOW_66_in_ruleColors5990); 

                            current = grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2386:6: (enumLiteral_14= 'cyan' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2386:6: (enumLiteral_14= 'cyan' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2386:8: enumLiteral_14= 'cyan'
                    {
                    enumLiteral_14=(Token)match(input,67,FOLLOW_67_in_ruleColors6007); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2396:1: ruleDirections returns [Enumerator current=null] : ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) | (enumLiteral_4= 'east' ) | (enumLiteral_5= 'north_east' ) | (enumLiteral_6= 'north_west' ) | (enumLiteral_7= 'south_east' ) | (enumLiteral_8= 'south_west' ) ) ;
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
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2398:28: ( ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) | (enumLiteral_4= 'east' ) | (enumLiteral_5= 'north_east' ) | (enumLiteral_6= 'north_west' ) | (enumLiteral_7= 'south_east' ) | (enumLiteral_8= 'south_west' ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2399:1: ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) | (enumLiteral_4= 'east' ) | (enumLiteral_5= 'north_east' ) | (enumLiteral_6= 'north_west' ) | (enumLiteral_7= 'south_east' ) | (enumLiteral_8= 'south_west' ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2399:1: ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) | (enumLiteral_4= 'east' ) | (enumLiteral_5= 'north_east' ) | (enumLiteral_6= 'north_west' ) | (enumLiteral_7= 'south_east' ) | (enumLiteral_8= 'south_west' ) )
            int alt24=9;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt24=1;
                }
                break;
            case 69:
                {
                alt24=2;
                }
                break;
            case 70:
                {
                alt24=3;
                }
                break;
            case 71:
                {
                alt24=4;
                }
                break;
            case 72:
                {
                alt24=5;
                }
                break;
            case 73:
                {
                alt24=6;
                }
                break;
            case 74:
                {
                alt24=7;
                }
                break;
            case 75:
                {
                alt24=8;
                }
                break;
            case 76:
                {
                alt24=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2399:2: (enumLiteral_0= 'center' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2399:2: (enumLiteral_0= 'center' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2399:4: enumLiteral_0= 'center'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_68_in_ruleDirections6052); 

                            current = grammarAccess.getDirectionsAccess().getCENTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDirectionsAccess().getCENTEREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2405:6: (enumLiteral_1= 'north' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2405:6: (enumLiteral_1= 'north' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2405:8: enumLiteral_1= 'north'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_69_in_ruleDirections6069); 

                            current = grammarAccess.getDirectionsAccess().getNORHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDirectionsAccess().getNORHTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2411:6: (enumLiteral_2= 'south' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2411:6: (enumLiteral_2= 'south' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2411:8: enumLiteral_2= 'south'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_70_in_ruleDirections6086); 

                            current = grammarAccess.getDirectionsAccess().getSOUTHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDirectionsAccess().getSOUTHEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2417:6: (enumLiteral_3= 'west' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2417:6: (enumLiteral_3= 'west' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2417:8: enumLiteral_3= 'west'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_71_in_ruleDirections6103); 

                            current = grammarAccess.getDirectionsAccess().getWESTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDirectionsAccess().getWESTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2423:6: (enumLiteral_4= 'east' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2423:6: (enumLiteral_4= 'east' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2423:8: enumLiteral_4= 'east'
                    {
                    enumLiteral_4=(Token)match(input,72,FOLLOW_72_in_ruleDirections6120); 

                            current = grammarAccess.getDirectionsAccess().getEASTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDirectionsAccess().getEASTEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2429:6: (enumLiteral_5= 'north_east' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2429:6: (enumLiteral_5= 'north_east' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2429:8: enumLiteral_5= 'north_east'
                    {
                    enumLiteral_5=(Token)match(input,73,FOLLOW_73_in_ruleDirections6137); 

                            current = grammarAccess.getDirectionsAccess().getNORTH_EASTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDirectionsAccess().getNORTH_EASTEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2435:6: (enumLiteral_6= 'north_west' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2435:6: (enumLiteral_6= 'north_west' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2435:8: enumLiteral_6= 'north_west'
                    {
                    enumLiteral_6=(Token)match(input,74,FOLLOW_74_in_ruleDirections6154); 

                            current = grammarAccess.getDirectionsAccess().getNORTH_WESTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDirectionsAccess().getNORTH_WESTEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2441:6: (enumLiteral_7= 'south_east' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2441:6: (enumLiteral_7= 'south_east' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2441:8: enumLiteral_7= 'south_east'
                    {
                    enumLiteral_7=(Token)match(input,75,FOLLOW_75_in_ruleDirections6171); 

                            current = grammarAccess.getDirectionsAccess().getSOUTH_EASTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getDirectionsAccess().getSOUTH_EASTEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2447:6: (enumLiteral_8= 'south_west' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2447:6: (enumLiteral_8= 'south_west' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:2447:8: enumLiteral_8= 'south_west'
                    {
                    enumLiteral_8=(Token)match(input,76,FOLLOW_76_in_ruleDirections6188); 

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


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\7\uffff";
    static final String DFA11_eofS =
        "\1\uffff\2\4\3\uffff\1\4";
    static final String DFA11_minS =
        "\1\4\2\20\2\uffff\1\7\1\20";
    static final String DFA11_maxS =
        "\1\7\1\45\1\47\2\uffff\1\7\1\47";
    static final String DFA11_acceptS =
        "\3\uffff\1\2\1\1\2\uffff";
    static final String DFA11_specialS =
        "\7\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\2\uffff\1\2",
            "\1\4\1\uffff\1\4\1\uffff\1\4\7\uffff\1\3\2\uffff\2\4\4\uffff"+
            "\1\4",
            "\1\4\1\uffff\1\4\1\uffff\1\4\7\uffff\1\3\2\uffff\2\4\4\uffff"+
            "\1\4\1\uffff\1\5",
            "",
            "",
            "\1\6",
            "\1\4\1\uffff\1\4\1\uffff\1\4\7\uffff\1\3\2\uffff\2\4\4\uffff"+
            "\1\4\1\uffff\1\5"
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
            return "1267:1: (this_SimpleText_0= ruleSimpleText | this_ComplexText_1= ruleComplexText )";
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
    public static final BitSet FOLLOW_15_in_ruleDecorationDescription412 = new BitSet(new long[]{0x0000002003A20000L});
    public static final BitSet FOLLOW_ruleAbstractDecoration_in_ruleDecorationDescription478 = new BitSet(new long[]{0x0000002003A30000L});
    public static final BitSet FOLLOW_ruleActivation_in_ruleDecorationDescription554 = new BitSet(new long[]{0x0000002003A30000L});
    public static final BitSet FOLLOW_16_in_ruleDecorationDescription612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDecoration_in_entryRuleAbstractDecoration648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDecoration658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageDecoration_in_ruleAbstractDecoration705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderDecoration_in_ruleAbstractDecoration732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackgroundDecoration_in_ruleAbstractDecoration759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForegroundDecoration_in_ruleAbstractDecoration786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectionDecoration_in_ruleAbstractDecoration813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageDecoration_in_entryRuleImageDecoration848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageDecoration858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleImageDecoration904 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImageDecoration916 = new BitSet(new long[]{0x0000002183B60000L});
    public static final BitSet FOLLOW_18_in_ruleImageDecoration974 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleImageDecoration986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImageDecoration1003 = new BitSet(new long[]{0x0000002183B70000L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleImageDecoration1084 = new BitSet(new long[]{0x0000002183B70000L});
    public static final BitSet FOLLOW_ruleMargin_in_ruleImageDecoration1159 = new BitSet(new long[]{0x0000002183B70000L});
    public static final BitSet FOLLOW_20_in_ruleImageDecoration1226 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleImageDecoration1238 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleText_in_ruleImageDecoration1259 = new BitSet(new long[]{0x0000002183B70000L});
    public static final BitSet FOLLOW_ruleActivation_in_ruleImageDecoration1335 = new BitSet(new long[]{0x0000002183B70000L});
    public static final BitSet FOLLOW_16_in_ruleImageDecoration1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderDecoration_in_entryRuleBorderDecoration1429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorderDecoration1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBorderDecoration1485 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBorderDecoration1497 = new BitSet(new long[]{0x0000002063E30000L});
    public static final BitSet FOLLOW_ruleSize_in_ruleBorderDecoration1563 = new BitSet(new long[]{0x0000002063E30000L});
    public static final BitSet FOLLOW_22_in_ruleBorderDecoration1630 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBorderDecoration1642 = new BitSet(new long[]{0xFFE0000200000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleColor_in_ruleBorderDecoration1663 = new BitSet(new long[]{0x0000002063E30000L});
    public static final BitSet FOLLOW_ruleStyle_in_ruleBorderDecoration1739 = new BitSet(new long[]{0x0000002063E30000L});
    public static final BitSet FOLLOW_ruleActivation_in_ruleBorderDecoration1814 = new BitSet(new long[]{0x0000002063E30000L});
    public static final BitSet FOLLOW_16_in_ruleBorderDecoration1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBackgroundDecoration_in_entryRuleBackgroundDecoration1902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBackgroundDecoration1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleBackgroundDecoration1958 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBackgroundDecoration1970 = new BitSet(new long[]{0x0000002003E30000L});
    public static final BitSet FOLLOW_22_in_ruleBackgroundDecoration2028 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBackgroundDecoration2040 = new BitSet(new long[]{0xFFE0000200000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleColor_in_ruleBackgroundDecoration2061 = new BitSet(new long[]{0x0000002003E30000L});
    public static final BitSet FOLLOW_ruleActivation_in_ruleBackgroundDecoration2137 = new BitSet(new long[]{0x0000002003E30000L});
    public static final BitSet FOLLOW_16_in_ruleBackgroundDecoration2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForegroundDecoration_in_entryRuleForegroundDecoration2225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForegroundDecoration2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleForegroundDecoration2281 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleForegroundDecoration2293 = new BitSet(new long[]{0x0000002003E30000L});
    public static final BitSet FOLLOW_22_in_ruleForegroundDecoration2351 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleForegroundDecoration2363 = new BitSet(new long[]{0xFFE0000200000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleColor_in_ruleForegroundDecoration2384 = new BitSet(new long[]{0x0000002003E30000L});
    public static final BitSet FOLLOW_ruleActivation_in_ruleForegroundDecoration2460 = new BitSet(new long[]{0x0000002003E30000L});
    public static final BitSet FOLLOW_16_in_ruleForegroundDecoration2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectionDecoration_in_entryRuleConnectionDecoration2548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnectionDecoration2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleConnectionDecoration2604 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConnectionDecoration2616 = new BitSet(new long[]{0x000000206FA30000L});
    public static final BitSet FOLLOW_ruleSize_in_ruleConnectionDecoration2682 = new BitSet(new long[]{0x000000206FA30000L});
    public static final BitSet FOLLOW_ruleStyle_in_ruleConnectionDecoration2757 = new BitSet(new long[]{0x000000206FA30000L});
    public static final BitSet FOLLOW_26_in_ruleConnectionDecoration2824 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConnectionDecoration2836 = new BitSet(new long[]{0xFFE0000200000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleColor_in_ruleConnectionDecoration2857 = new BitSet(new long[]{0x000000206FA30000L});
    public static final BitSet FOLLOW_27_in_ruleConnectionDecoration2925 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConnectionDecoration2937 = new BitSet(new long[]{0xFFE0000200000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleColor_in_ruleConnectionDecoration2958 = new BitSet(new long[]{0x000000206FA30000L});
    public static final BitSet FOLLOW_ruleActivation_in_ruleConnectionDecoration3034 = new BitSet(new long[]{0x000000206FA30000L});
    public static final BitSet FOLLOW_16_in_ruleConnectionDecoration3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText3122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleText_in_ruleText3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexText_in_ruleText3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleText_in_entryRuleSimpleText3241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleText3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleText3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSimpleText3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexText_in_entryRuleComplexText3363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexText3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleText_in_ruleComplexText3419 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleComplexText3431 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleText_in_ruleComplexText3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyle_in_entryRuleStyle3488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyle3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleStyle3535 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStyle3547 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_ruleLineStyle_in_ruleStyle3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_entryRuleSize3604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSize3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSize3651 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSize3663 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSize3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_entryRuleDirection3721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirection3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDirection3768 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDirection3780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001FF0L});
    public static final BitSet FOLLOW_ruleDirections_in_ruleDirection3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMargin_in_entryRuleMargin3837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMargin3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleMargin3884 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMargin3896 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_ruleMargin3917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor3953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorConstant_in_ruleColor4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteColor_in_ruleColor4047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteColor_in_entryRuleConcreteColor4083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcreteColor4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleConcreteColor4130 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleConcreteColor4142 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConcreteColor4159 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleConcreteColor4176 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConcreteColor4193 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleConcreteColor4210 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConcreteColor4227 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleConcreteColor4244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorConstant_in_entryRuleColorConstant4280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorConstant4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColors_in_ruleColorConstant4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_entryRuleActivation4370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivation4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleActivation4417 = new BitSet(new long[]{0x0000C00000000080L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_ruleActivation4438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_entryRuleAbstractCondition4474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractCondition4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleAbstractCondition4531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeCondition_in_ruleAbstractCondition4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition4593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCondition4651 = new BitSet(new long[]{0x00003F0000000000L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleCondition4672 = new BitSet(new long[]{0x0000004000000070L});
    public static final BitSet FOLLOW_ruleType_in_ruleCondition4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition4729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeCondition4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOperator_in_ruleCompositeCondition4785 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCompositeCondition4797 = new BitSet(new long[]{0x0000C00000000080L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_ruleCompositeCondition4818 = new BitSet(new long[]{0x0000C01000000080L});
    public static final BitSet FOLLOW_36_in_ruleCompositeCondition4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType4868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_ruleType4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedDouble_in_ruleType4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleType4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleType5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedDouble_in_entryRuleSignedDouble5057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedDouble5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleSignedDouble5107 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedDouble5124 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleSignedDouble5142 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedDouble5157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_entryRuleSignedInteger5203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedInteger5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleSignedInteger5253 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedInteger5270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5369 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleQualifiedName5388 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5403 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_40_in_ruleComparisonOperator5464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleComparisonOperator5481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleComparisonOperator5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleComparisonOperator5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleComparisonOperator5532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleComparisonOperator5549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleLogicalOperator5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleLogicalOperator5611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleLineStyle5656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleLineStyle5673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleLineStyle5690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleLineStyle5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleLineStyle5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleColors5769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleColors5786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleColors5803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleColors5820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleColors5837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleColors5854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleColors5871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleColors5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleColors5905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleColors5922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleColors5939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleColors5956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleColors5973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleColors5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleColors6007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleDirections6052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleDirections6069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleDirections6086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleDirections6103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleDirections6120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleDirections6137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleDirections6154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleDirections6171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleDirections6188 = new BitSet(new long[]{0x0000000000000002L});

}
